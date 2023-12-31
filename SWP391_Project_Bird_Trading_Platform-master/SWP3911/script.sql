USE [master]
GO
/****** Object:  Database [WEB_BAN_LONG_CHIM]    Script Date: 10/25/2023 4:42:27 PM ******/
CREATE DATABASE [WEB_BAN_LONG_CHIM]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'WEB_BAN_LONG_CHIM', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS01\MSSQL\DATA\WEB_BAN_LONG_CHIM.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'WEB_BAN_LONG_CHIM_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS01\MSSQL\DATA\WEB_BAN_LONG_CHIM_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [WEB_BAN_LONG_CHIM].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET ARITHABORT OFF 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET  DISABLE_BROKER 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET RECOVERY FULL 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET  MULTI_USER 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET DB_CHAINING OFF 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET QUERY_STORE = OFF
GO
USE [WEB_BAN_LONG_CHIM]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 10/25/2023 4:42:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[firstname] [nvarchar](max) NULL,
	[password] [nvarchar](max) NULL,
	[email] [nvarchar](max) NOT NULL,
	[lastname] [nvarchar](max) NOT NULL,
	[birthday] [date] NULL,
	[roleid] [int] NOT NULL,
	[address] [nvarchar](max) NULL,
	[isActive] [bit] NOT NULL,
	[gender] [bit] NULL,
	[image] [nvarchar](max) NULL,
	[supervisor] [int] NULL,
	[point] [int] NULL,
	[phone] [int] NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Category]    Script Date: 10/25/2023 4:42:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[categoryName] [nvarchar](max) NOT NULL,
 CONSTRAINT [PK_Category] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Comment]    Script Date: 10/25/2023 4:42:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Comment](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[userID] [int] NOT NULL,
	[productID] [int] NOT NULL,
	[content] [nvarchar](max) NOT NULL,
	[commentDate] [datetime] NOT NULL,
	[rate] [int] NOT NULL,
 CONSTRAINT [PK_Comment] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Customer]    Script Date: 10/25/2023 4:42:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Customer](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[firstName] [nvarchar](max) NOT NULL,
	[lastName] [nvarchar](max) NOT NULL,
	[phone] [nvarchar](max) NOT NULL,
	[address] [nvarchar](max) NOT NULL,
 CONSTRAINT [PK_Customer] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Image]    Script Date: 10/25/2023 4:42:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Image](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[url] [nvarchar](max) NOT NULL,
	[productID] [int] NOT NULL,
 CONSTRAINT [PK_Image] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Material]    Script Date: 10/25/2023 4:42:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Material](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[original] [nvarchar](max) NOT NULL,
 CONSTRAINT [PK_Material] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Order]    Script Date: 10/25/2023 4:42:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Order](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[customerID] [int] NOT NULL,
	[staffID] [int] NULL,
	[paymentID] [int] NULL,
	[PromotionID] [int] NULL,
 CONSTRAINT [PK_Order] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OrderDetail]    Script Date: 10/25/2023 4:42:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderDetail](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[orderID] [int] NOT NULL,
	[productID] [int] NOT NULL,
	[quantity] [int] NOT NULL,
	[price] [decimal](10, 0) NOT NULL,
 CONSTRAINT [PK_OrderDetail] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OrderStatus]    Script Date: 10/25/2023 4:42:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderStatus](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[orderDate] [datetime] NOT NULL,
	[orderStatus] [nvarchar](max) NOT NULL,
	[orderID] [int] NOT NULL,
 CONSTRAINT [PK_OrderStatus] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Payment]    Script Date: 10/25/2023 4:42:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Payment](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[method] [nvarchar](max) NOT NULL,
 CONSTRAINT [PK_Payment] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Product]    Script Date: 10/25/2023 4:42:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](max) NOT NULL,
	[code] [nvarchar](max) NOT NULL,
	[material] [int] NOT NULL,
	[size] [nvarchar](max) NOT NULL,
	[price] [decimal](10, 0) NOT NULL,
	[discount] [real] NOT NULL,
	[category] [int] NULL,
	[stock] [int] NOT NULL,
	[isAvailable] [int] NOT NULL,
	[quantitySold] [int] NOT NULL,
	[rate_sum] [decimal](10, 0) NULL,
	[rate_count] [decimal](10, 0) NULL,
	[Image] [nvarchar](max) NULL,
 CONSTRAINT [PK_Product] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Promotion]    Script Date: 10/25/2023 4:42:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Promotion](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](255) NULL,
	[DateStart] [date] NULL,
	[DateEnd] [date] NULL,
	[Status] [bit] NULL,
	[Value] [int] NULL,
	[AccountID] [int] NULL,
	[Condition] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Request]    Script Date: 10/25/2023 4:42:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Request](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[customerId] [int] NOT NULL,
	[name] [nvarchar](max) NOT NULL,
	[size] [nchar](10) NOT NULL,
	[material] [int] NOT NULL,
	[price] [decimal](10, 0) NULL,
	[staffID] [int] NULL,
	[Quantity] [int] NOT NULL,
	[CategoryID] [int] NULL,
 CONSTRAINT [PK_Request] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[RequestStatus]    Script Date: 10/25/2023 4:42:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[RequestStatus](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[requestID] [int] NOT NULL,
	[createdDate] [datetime] NOT NULL,
	[status] [int] NOT NULL,
 CONSTRAINT [PK_RequestStatus] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Role]    Script Date: 10/25/2023 4:42:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Role](
	[roleid] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](max) NOT NULL,
 CONSTRAINT [PK_Role] PRIMARY KEY CLUSTERED 
(
	[roleid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Account] ON 

INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (1, N'First Name 1', N'123', N'admin@example.com', N'Last Name 1', CAST(N'1990-01-01' AS Date), 1, N'Address 1', 1, 1, N'1', NULL, NULL, NULL)
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (2, N'First Name 2', N'123', N'manager@example.com', N'Last Name 2', CAST(N'1990-02-02' AS Date), 2, N'Address 2', 1, 0, N'1', NULL, NULL, NULL)
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (3, N'First Name 3', N'123', N'staff@example.com', N'Last Name 3', CAST(N'1990-03-03' AS Date), 3, N'Address 3', 1, 0, N'1.jpg', NULL, NULL, NULL)
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (1003, N'trinh', N'123', N'123', N'123123123', CAST(N'2003-01-01' AS Date), 4, N'4', 1, 1, N'1.jpg', 1, 1, NULL)
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (1004, N'trinh', N'123', N'123', N'123', CAST(N'2003-01-01' AS Date), 2, N'3', 1, 1, N'1', 1, 1, NULL)
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (1005, N'asdsas', N'123', N'store1', N'weqweqw', CAST(N'1111-11-11' AS Date), 2, N'1213', 1, 1, N'6.jpg', NULL, NULL, NULL)
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (1006, N'asdsas', N'123', N'store1', N'weqweqw', CAST(N'1111-11-11' AS Date), 2, N'1213', 1, 1, N'6.jpg', NULL, NULL, NULL)
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (1007, N'asdsas', N'123', N'store1', N'weqweqw', CAST(N'1111-11-11' AS Date), 2, N'1213', 1, 1, N'6.jpg', NULL, NULL, NULL)
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (1008, N'trinh', N'123', N'trinh123', N'lam', CAST(N'2003-11-11' AS Date), 3, N'lam lam', 1, 1, N'6.jpg', NULL, NULL, NULL)
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (1009, N'trinhhhh', N'trinhhh', N'trinhhh', N'trinhhh', CAST(N'1111-11-11' AS Date), 1, N'trinhhh', 1, 1, N'8.jpg', NULL, NULL, NULL)
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (1010, N'ttrirnh', N'ttrirnh', N'manager@example.com', N'ttrirnh', CAST(N'1111-11-11' AS Date), 1, N'ttrirnh', 1, 1, N'12.jpg', NULL, NULL, NULL)
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (1011, N'ttrirnh', N'123', N'manag', N'ttrirnh', CAST(N'1111-11-11' AS Date), 1, N'ttrirnh', 1, 1, N'7.jpg', NULL, NULL, NULL)
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (1017, NULL, NULL, N'ab@example.com', N'123123', NULL, 5, N'ab', 0, NULL, NULL, NULL, NULL, 123)
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (1018, NULL, NULL, N'ab@example.com11', N'123123', NULL, 5, N'ab', 1, NULL, NULL, NULL, NULL, 123)
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (1019, NULL, NULL, N'ab@example.com11', N'123123', NULL, 5, N'ab', 1, NULL, NULL, NULL, NULL, 123)
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (1020, NULL, NULL, N'ab@example.com', N'123123', NULL, 5, N'ab', 0, NULL, NULL, NULL, NULL, 123)
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (1021, NULL, NULL, N'trinh', N'123123123', NULL, 5, N'4', 1, NULL, NULL, NULL, NULL, 123123)
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (1022, NULL, NULL, N'ab@example.com11', N'tuan', NULL, 5, N'ab', 1, NULL, NULL, NULL, NULL, 123)
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (1023, NULL, NULL, N'ab@example.com11', N'tuan', NULL, 5, N'ab', 1, NULL, NULL, NULL, NULL, 123)
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (1024, N'ab', N'123', N'ab@example.com', N'ab', CAST(N'2023-10-25' AS Date), 2, N'ab', 0, 1, N'1 (2).jpg', NULL, NULL, NULL)
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (1025, N'ab132', N'123', N'ab@example.com', N'ab', CAST(N'2023-10-25' AS Date), 3, N'ab', 0, 1, N'7.jpg', NULL, NULL, NULL)
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (1026, NULL, NULL, N'trinh', N'123123123', NULL, 5, N'4', 1, NULL, NULL, NULL, NULL, 132)
SET IDENTITY_INSERT [dbo].[Account] OFF
GO
SET IDENTITY_INSERT [dbo].[Category] ON 

INSERT [dbo].[Category] ([id], [categoryName]) VALUES (1, N'L?ng chim vành khuyên')
INSERT [dbo].[Category] ([id], [categoryName]) VALUES (2, N'L?ng chim chào mào')
INSERT [dbo].[Category] ([id], [categoryName]) VALUES (3, N'Lồng chim tu hú ')
SET IDENTITY_INSERT [dbo].[Category] OFF
GO
SET IDENTITY_INSERT [dbo].[Customer] ON 

INSERT [dbo].[Customer] ([id], [firstName], [lastName], [phone], [address]) VALUES (1, N'a', N'a', N'2', N'a')
INSERT [dbo].[Customer] ([id], [firstName], [lastName], [phone], [address]) VALUES (2, N'aaa', N'aaa', N'aaa', N'aaa')
INSERT [dbo].[Customer] ([id], [firstName], [lastName], [phone], [address]) VALUES (3, N'aaa', N'aaa', N'123', N'123')
INSERT [dbo].[Customer] ([id], [firstName], [lastName], [phone], [address]) VALUES (4, N'aaa', N'aaa', N'a', N'123')
INSERT [dbo].[Customer] ([id], [firstName], [lastName], [phone], [address]) VALUES (5, N'trinh', N'123123123', N'123', N'4')
INSERT [dbo].[Customer] ([id], [firstName], [lastName], [phone], [address]) VALUES (6, N'aaa', N'aaa', N'a', N'123')
INSERT [dbo].[Customer] ([id], [firstName], [lastName], [phone], [address]) VALUES (7, N'aa', N'a', N'a', N'a')
INSERT [dbo].[Customer] ([id], [firstName], [lastName], [phone], [address]) VALUES (8, N'a', N'a', N'a', N'a')
SET IDENTITY_INSERT [dbo].[Customer] OFF
GO
SET IDENTITY_INSERT [dbo].[Material] ON 

INSERT [dbo].[Material] ([id], [original]) VALUES (1, N'Tre')
INSERT [dbo].[Material] ([id], [original]) VALUES (2, N'G? mun')
INSERT [dbo].[Material] ([id], [original]) VALUES (3, N'Kim lo?i')
INSERT [dbo].[Material] ([id], [original]) VALUES (4, N'Tre và g? mun')
INSERT [dbo].[Material] ([id], [original]) VALUES (5, N'S?ng trâu')
INSERT [dbo].[Material] ([id], [original]) VALUES (6, N'Tre và s?ng trâu')
INSERT [dbo].[Material] ([id], [original]) VALUES (7, N'Trúc')
SET IDENTITY_INSERT [dbo].[Material] OFF
GO
SET IDENTITY_INSERT [dbo].[Order] ON 

INSERT [dbo].[Order] ([id], [customerID], [staffID], [paymentID], [PromotionID]) VALUES (26, 1023, NULL, NULL, 1)
INSERT [dbo].[Order] ([id], [customerID], [staffID], [paymentID], [PromotionID]) VALUES (27, 1026, NULL, NULL, 1)
SET IDENTITY_INSERT [dbo].[Order] OFF
GO
SET IDENTITY_INSERT [dbo].[OrderDetail] ON 

INSERT [dbo].[OrderDetail] ([id], [orderID], [productID], [quantity], [price]) VALUES (12, 26, 1, 6, CAST(150 AS Decimal(10, 0)))
INSERT [dbo].[OrderDetail] ([id], [orderID], [productID], [quantity], [price]) VALUES (13, 26, 3, 1, CAST(111 AS Decimal(10, 0)))
INSERT [dbo].[OrderDetail] ([id], [orderID], [productID], [quantity], [price]) VALUES (14, 26, 4, 1, CAST(2800000 AS Decimal(10, 0)))
INSERT [dbo].[OrderDetail] ([id], [orderID], [productID], [quantity], [price]) VALUES (15, 27, 1, 2, CAST(150 AS Decimal(10, 0)))
SET IDENTITY_INSERT [dbo].[OrderDetail] OFF
GO
SET IDENTITY_INSERT [dbo].[OrderStatus] ON 

INSERT [dbo].[OrderStatus] ([id], [orderDate], [orderStatus], [orderID]) VALUES (11, CAST(N'2023-10-25T13:00:21.533' AS DateTime), N'processing', 26)
INSERT [dbo].[OrderStatus] ([id], [orderDate], [orderStatus], [orderID]) VALUES (12, CAST(N'2023-10-25T16:01:20.613' AS DateTime), N'processing', 27)
SET IDENTITY_INSERT [dbo].[OrderStatus] OFF
GO
SET IDENTITY_INSERT [dbo].[Product] ON 

INSERT [dbo].[Product] ([id], [name], [code], [material], [size], [price], [discount], [category], [stock], [isAvailable], [quantitySold], [rate_sum], [rate_count], [Image]) VALUES (1, N'Lồng Chào Mào Gỗ Mun Hoa
', N'MST001', 1, N'r?ng 32cm', CAST(150 AS Decimal(10, 0)), 1, 1, 100, 1, 0, NULL, NULL, N'long-chao-mao-bang-sung-1.jpg')
INSERT [dbo].[Product] ([id], [name], [code], [material], [size], [price], [discount], [category], [stock], [isAvailable], [quantitySold], [rate_sum], [rate_count], [Image]) VALUES (3, N'Lông chào mào chân tròn', N'ST1006', 1, N'Vuông cao, vuông d?u', CAST(111 AS Decimal(10, 0)), 0.01, 2, 100, 1, 0, NULL, NULL, N'long-chao-mao-cap-quang.jpg')
INSERT [dbo].[Product] ([id], [name], [code], [material], [size], [price], [discount], [category], [stock], [isAvailable], [quantitySold], [rate_sum], [rate_count], [Image]) VALUES (4, N'Lồng Chim Chào Mào Cáp Quang Khung Gỗ
', N'ST1004', 1, N'Vuông cao, vuông d?u', CAST(2800000 AS Decimal(10, 0)), 0.01, 2, 100, 1, 0, NULL, NULL, N'long-chao-mao-go-mun-soc-chan-cham-1.jpg')
INSERT [dbo].[Product] ([id], [name], [code], [material], [size], [price], [discount], [category], [stock], [isAvailable], [quantitySold], [rate_sum], [rate_count], [Image]) VALUES (7, N'Lồng Chào Mào Tre Già Nan Khít
', N'ST1002', 1, N'Vuông cao, vuông d?u', CAST(3000000 AS Decimal(10, 0)), 0.01, 2, 100, 1, 0, NULL, NULL, N'long-chao-mao-sin-tre-gia-1 (1).jpg')
INSERT [dbo].[Product] ([id], [name], [code], [material], [size], [price], [discount], [category], [stock], [isAvailable], [quantitySold], [rate_sum], [rate_count], [Image]) VALUES (8, N'Lồng Chào Mào Gỗ Mun Sọc Chân Chạm
', N'ST4011', 1, N'Tròn tròn', CAST(900000 AS Decimal(10, 0)), 0, 1, 100, 1, 0, NULL, NULL, N'long-chao-mao-sin-tre-gia-1.jpg')
INSERT [dbo].[Product] ([id], [name], [code], [material], [size], [price], [discount], [category], [stock], [isAvailable], [quantitySold], [rate_sum], [rate_count], [Image]) VALUES (9, N'Lồng Chào Mào Sin Tre Già
', N'ST4008', 1, N'TrÃ²n trÃ²n', CAST(8500000 AS Decimal(10, 0)), 0, 1, 100, 1, 0, NULL, NULL, N'long-chao-mao-tre-gia-nan-khit-1.jpg')
INSERT [dbo].[Product] ([id], [name], [code], [material], [size], [price], [discount], [category], [stock], [isAvailable], [quantitySold], [rate_sum], [rate_count], [Image]) VALUES (11, N'Lồng Chào Mào Gỗ Mun Hoa
', N'ST4001', 6, N'Tròn tròn', CAST(17000000 AS Decimal(10, 0)), 0, 1, 100, 1, 0, NULL, NULL, N'long-chum.jpg')
INSERT [dbo].[Product] ([id], [name], [code], [material], [size], [price], [discount], [category], [stock], [isAvailable], [quantitySold], [rate_sum], [rate_count], [Image]) VALUES (13, N'Lá»ng chim tu hÃº gÃ³c cáº¡nh', N'LCTH001', 1, N'cao 20 rong 30 cm', CAST(10000 AS Decimal(10, 0)), 1, 3, 0, 0, 0, NULL, NULL, N'long-chao-mao-bang-sung-1.jpg')
SET IDENTITY_INSERT [dbo].[Product] OFF
GO
SET IDENTITY_INSERT [dbo].[Promotion] ON 

INSERT [dbo].[Promotion] ([ID], [Name], [DateStart], [DateEnd], [Status], [Value], [AccountID], [Condition]) VALUES (1, N'Promo1', CAST(N'2023-01-01' AS Date), CAST(N'2023-10-26' AS Date), 0, 20, 1, N'2')
INSERT [dbo].[Promotion] ([ID], [Name], [DateStart], [DateEnd], [Status], [Value], [AccountID], [Condition]) VALUES (2, N'Promo2', CAST(N'2023-02-01' AS Date), CAST(N'2023-02-28' AS Date), 0, 15, 2, N'2')
INSERT [dbo].[Promotion] ([ID], [Name], [DateStart], [DateEnd], [Status], [Value], [AccountID], [Condition]) VALUES (4, N'Hè về', CAST(N'2023-10-25' AS Date), CAST(N'2023-10-27' AS Date), 1, 2, 2, N'2')
SET IDENTITY_INSERT [dbo].[Promotion] OFF
GO
SET IDENTITY_INSERT [dbo].[Request] ON 

INSERT [dbo].[Request] ([id], [customerId], [name], [size], [material], [price], [staffID], [Quantity], [CategoryID]) VALUES (5, 1003, N'a', N'a         ', 1, CAST(100000 AS Decimal(10, 0)), 3, 3, 1)
INSERT [dbo].[Request] ([id], [customerId], [name], [size], [material], [price], [staffID], [Quantity], [CategoryID]) VALUES (6, 1003, N'lồng chim  tú hú siêu to', N'cao 1km   ', 1, CAST(100000 AS Decimal(10, 0)), 3, 1, 3)
SET IDENTITY_INSERT [dbo].[Request] OFF
GO
SET IDENTITY_INSERT [dbo].[RequestStatus] ON 

INSERT [dbo].[RequestStatus] ([id], [requestID], [createdDate], [status]) VALUES (2, 5, CAST(N'2023-10-25T15:12:18.000' AS DateTime), 3)
INSERT [dbo].[RequestStatus] ([id], [requestID], [createdDate], [status]) VALUES (3, 6, CAST(N'2023-10-25T15:55:11.000' AS DateTime), 3)
SET IDENTITY_INSERT [dbo].[RequestStatus] OFF
GO
SET IDENTITY_INSERT [dbo].[Role] ON 

INSERT [dbo].[Role] ([roleid], [name]) VALUES (1, N'admin')
INSERT [dbo].[Role] ([roleid], [name]) VALUES (2, N'manager')
INSERT [dbo].[Role] ([roleid], [name]) VALUES (3, N'staff')
INSERT [dbo].[Role] ([roleid], [name]) VALUES (4, N'customer')
INSERT [dbo].[Role] ([roleid], [name]) VALUES (5, N'guest')
SET IDENTITY_INSERT [dbo].[Role] OFF
GO
ALTER TABLE [dbo].[Account]  WITH CHECK ADD  CONSTRAINT [FK_Account_Role] FOREIGN KEY([roleid])
REFERENCES [dbo].[Role] ([roleid])
GO
ALTER TABLE [dbo].[Account] CHECK CONSTRAINT [FK_Account_Role]
GO
ALTER TABLE [dbo].[Comment]  WITH CHECK ADD  CONSTRAINT [FK_Comment_Account] FOREIGN KEY([userID])
REFERENCES [dbo].[Account] ([id])
GO
ALTER TABLE [dbo].[Comment] CHECK CONSTRAINT [FK_Comment_Account]
GO
ALTER TABLE [dbo].[Comment]  WITH CHECK ADD  CONSTRAINT [FK_Comment_Product] FOREIGN KEY([productID])
REFERENCES [dbo].[Product] ([id])
GO
ALTER TABLE [dbo].[Comment] CHECK CONSTRAINT [FK_Comment_Product]
GO
ALTER TABLE [dbo].[Image]  WITH CHECK ADD  CONSTRAINT [FK_Image_Product] FOREIGN KEY([productID])
REFERENCES [dbo].[Product] ([id])
GO
ALTER TABLE [dbo].[Image] CHECK CONSTRAINT [FK_Image_Product]
GO
ALTER TABLE [dbo].[Order]  WITH CHECK ADD  CONSTRAINT [FK_Order_Account] FOREIGN KEY([staffID])
REFERENCES [dbo].[Account] ([id])
GO
ALTER TABLE [dbo].[Order] CHECK CONSTRAINT [FK_Order_Account]
GO
ALTER TABLE [dbo].[Order]  WITH CHECK ADD  CONSTRAINT [FK_Order_Payment] FOREIGN KEY([paymentID])
REFERENCES [dbo].[Payment] ([id])
GO
ALTER TABLE [dbo].[Order] CHECK CONSTRAINT [FK_Order_Payment]
GO
ALTER TABLE [dbo].[Order]  WITH CHECK ADD  CONSTRAINT [FK_Order_Promotion] FOREIGN KEY([PromotionID])
REFERENCES [dbo].[Promotion] ([ID])
GO
ALTER TABLE [dbo].[Order] CHECK CONSTRAINT [FK_Order_Promotion]
GO
ALTER TABLE [dbo].[OrderDetail]  WITH CHECK ADD  CONSTRAINT [FK_OrderDetail_Order] FOREIGN KEY([orderID])
REFERENCES [dbo].[Order] ([id])
GO
ALTER TABLE [dbo].[OrderDetail] CHECK CONSTRAINT [FK_OrderDetail_Order]
GO
ALTER TABLE [dbo].[OrderDetail]  WITH CHECK ADD  CONSTRAINT [FK_OrderDetail_Product] FOREIGN KEY([productID])
REFERENCES [dbo].[Product] ([id])
GO
ALTER TABLE [dbo].[OrderDetail] CHECK CONSTRAINT [FK_OrderDetail_Product]
GO
ALTER TABLE [dbo].[OrderStatus]  WITH CHECK ADD  CONSTRAINT [FK_OrderStatus_Order] FOREIGN KEY([orderID])
REFERENCES [dbo].[Order] ([id])
GO
ALTER TABLE [dbo].[OrderStatus] CHECK CONSTRAINT [FK_OrderStatus_Order]
GO
ALTER TABLE [dbo].[Product]  WITH CHECK ADD  CONSTRAINT [FK_Product_Category] FOREIGN KEY([category])
REFERENCES [dbo].[Category] ([id])
GO
ALTER TABLE [dbo].[Product] CHECK CONSTRAINT [FK_Product_Category]
GO
ALTER TABLE [dbo].[Product]  WITH CHECK ADD  CONSTRAINT [FK_Product_Material] FOREIGN KEY([material])
REFERENCES [dbo].[Material] ([id])
GO
ALTER TABLE [dbo].[Product] CHECK CONSTRAINT [FK_Product_Material]
GO
ALTER TABLE [dbo].[Promotion]  WITH CHECK ADD FOREIGN KEY([AccountID])
REFERENCES [dbo].[Account] ([id])
GO
ALTER TABLE [dbo].[Request]  WITH CHECK ADD  CONSTRAINT [fk_customer] FOREIGN KEY([customerId])
REFERENCES [dbo].[Account] ([id])
GO
ALTER TABLE [dbo].[Request] CHECK CONSTRAINT [fk_customer]
GO
ALTER TABLE [dbo].[Request]  WITH CHECK ADD  CONSTRAINT [FK_Request_Account] FOREIGN KEY([staffID])
REFERENCES [dbo].[Account] ([id])
GO
ALTER TABLE [dbo].[Request] CHECK CONSTRAINT [FK_Request_Account]
GO
ALTER TABLE [dbo].[Request]  WITH CHECK ADD  CONSTRAINT [FK_Request_Category] FOREIGN KEY([CategoryID])
REFERENCES [dbo].[Category] ([id])
GO
ALTER TABLE [dbo].[Request] CHECK CONSTRAINT [FK_Request_Category]
GO
ALTER TABLE [dbo].[Request]  WITH CHECK ADD  CONSTRAINT [FK_Request_Material] FOREIGN KEY([material])
REFERENCES [dbo].[Material] ([id])
GO
ALTER TABLE [dbo].[Request] CHECK CONSTRAINT [FK_Request_Material]
GO
ALTER TABLE [dbo].[RequestStatus]  WITH CHECK ADD  CONSTRAINT [FK_RequestStatus_Request] FOREIGN KEY([requestID])
REFERENCES [dbo].[Request] ([id])
GO
ALTER TABLE [dbo].[RequestStatus] CHECK CONSTRAINT [FK_RequestStatus_Request]
GO
USE [master]
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET  READ_WRITE 
GO
