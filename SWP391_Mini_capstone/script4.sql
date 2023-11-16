USE [master]
GO
/****** Object:  Database [WEB_BAN_LONG_CHIM]    Script Date: 16/11/2023 11:40:17 ******/
CREATE DATABASE [WEB_BAN_LONG_CHIM]
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
EXEC sys.sp_db_vardecimal_storage_format N'WEB_BAN_LONG_CHIM', N'ON'
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET QUERY_STORE = OFF
GO
USE [WEB_BAN_LONG_CHIM]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 16/11/2023 11:40:17 ******/
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
	[phone] [nvarchar](50) NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Category]    Script Date: 16/11/2023 11:40:17 ******/
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
/****** Object:  Table [dbo].[Comment]    Script Date: 16/11/2023 11:40:17 ******/
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
	[status] [bit] NULL,
 CONSTRAINT [PK_Comment] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Customer]    Script Date: 16/11/2023 11:40:17 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Customer](
	[firstName] [nvarchar](max) NOT NULL,
	[lastName] [nvarchar](max) NOT NULL,
	[phone] [nvarchar](max) NOT NULL,
	[address] [nvarchar](max) NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Image]    Script Date: 16/11/2023 11:40:17 ******/
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
/****** Object:  Table [dbo].[Material]    Script Date: 16/11/2023 11:40:17 ******/
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
/****** Object:  Table [dbo].[Order]    Script Date: 16/11/2023 11:40:17 ******/
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
/****** Object:  Table [dbo].[OrderDetail]    Script Date: 16/11/2023 11:40:17 ******/
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
/****** Object:  Table [dbo].[OrderStatus]    Script Date: 16/11/2023 11:40:17 ******/
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
/****** Object:  Table [dbo].[Payment]    Script Date: 16/11/2023 11:40:17 ******/
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
/****** Object:  Table [dbo].[Product]    Script Date: 16/11/2023 11:40:17 ******/
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
/****** Object:  Table [dbo].[Promotion]    Script Date: 16/11/2023 11:40:17 ******/
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
/****** Object:  Table [dbo].[Request]    Script Date: 16/11/2023 11:40:17 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Request](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[customerId] [int] NOT NULL,
	[name] [nvarchar](max) NOT NULL,
	[size] [nvarchar](max) NULL,
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
/****** Object:  Table [dbo].[RequestStatus]    Script Date: 16/11/2023 11:40:17 ******/
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
/****** Object:  Table [dbo].[Role]    Script Date: 16/11/2023 11:40:17 ******/
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

INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (1, N'First Name 1', N'123', N'admin@example.com', N'Last Name 1', CAST(N'1990-01-01' AS Date), 1, N'Address 1', 1, 1, N'4.jpg', NULL, NULL, N'0394700194')
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (2, N'First Name 2', N'123', N'manager@example.com', N'Last Name 2', CAST(N'1990-02-02' AS Date), 2, N'Address 2', 1, 0, N'2.jpg', NULL, NULL, N'0394700195')
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (3, N'First Name 3', N'123', N'staff@example.com', N'Last Name 3', CAST(N'1990-03-03' AS Date), 3, N'Address 3', 1, 0, N'3.jpg', NULL, NULL, N'0394700196')
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (4, N'trinh', N'123', N'123', N'123123123', CAST(N'2003-01-01' AS Date), 4, N'4', 0, 1, N'7.jpg', 1, 1, N'0394700197')
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (5, N'trinh', N'123', N'123', N'123', CAST(N'2003-01-01' AS Date), 2, N'3', 0, 1, N'1', 1, 1, N'0394700198')
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (6, N'Nhat', N'123', N'nhat@gmail.com', N'Nhat', CAST(N'2003-01-01' AS Date), 2, N'1213', 1, 1, N'6.jpg', NULL, NULL, N'0394700199')
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (7, N'Nhat123', N'123', N'nhat123@gmail.com', N'Nhật', CAST(N'2003-01-01' AS Date), 2, N'1213', 1, 1, N'6.jpg', NULL, NULL, N'0394700200')
INSERT [dbo].[Account] ([id], [firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point], [phone]) VALUES (8, N'Nhat456', N'123', N'nhat456@gmail.com', N'Nhật', CAST(N'2003-01-01' AS Date), 2, N'1213', 1, 1, N'6.jpg', NULL, NULL, N'0394700201')
SET IDENTITY_INSERT [dbo].[Account] OFF
GO
SET IDENTITY_INSERT [dbo].[Category] ON 

INSERT [dbo].[Category] ([id], [categoryName]) VALUES (1, N'Lồng chim vành khuyên')
INSERT [dbo].[Category] ([id], [categoryName]) VALUES (2, N'Lồng chim chào mào')
INSERT [dbo].[Category] ([id], [categoryName]) VALUES (3, N'Lồng chim tu hú ')
INSERT [dbo].[Category] ([id], [categoryName]) VALUES (4, N'Lồng chim cu')
INSERT [dbo].[Category] ([id], [categoryName]) VALUES (5, N'Lồng chim vẹt')
SET IDENTITY_INSERT [dbo].[Category] OFF
GO
SET IDENTITY_INSERT [dbo].[Comment] ON 

INSERT [dbo].[Comment] ([id], [userID], [productID], [content], [commentDate], [rate], [status]) VALUES (1, 3, 3, N'Hàng chất lượng rất tốt', CAST(N'2003-10-26T00:00:00.000' AS DateTime), 5, 0)
SET IDENTITY_INSERT [dbo].[Comment] OFF
GO
INSERT [dbo].[Customer] ([firstName], [lastName], [phone], [address]) VALUES (N'Trần', N'Nam', N'0394700200', N'Phú Hữu, Tp HCM')
GO
SET IDENTITY_INSERT [dbo].[Material] ON 

INSERT [dbo].[Material] ([id], [original]) VALUES (1, N'Tre')
INSERT [dbo].[Material] ([id], [original]) VALUES (2, N'Gỗ mun')
INSERT [dbo].[Material] ([id], [original]) VALUES (3, N'Kim loại')
INSERT [dbo].[Material] ([id], [original]) VALUES (4, N'Tre và gỗ mun')
INSERT [dbo].[Material] ([id], [original]) VALUES (5, N'Sừng trâu')
INSERT [dbo].[Material] ([id], [original]) VALUES (6, N'Tre và sừng trâu')
INSERT [dbo].[Material] ([id], [original]) VALUES (7, N'Trúc')
INSERT [dbo].[Material] ([id], [original]) VALUES (8, N'Nhựa')
INSERT [dbo].[Material] ([id], [original]) VALUES (9, N'Inox')
SET IDENTITY_INSERT [dbo].[Material] OFF
GO
SET IDENTITY_INSERT [dbo].[Order] ON 

INSERT [dbo].[Order] ([id], [customerID], [staffID], [paymentID], [PromotionID]) VALUES (26, 4, NULL, NULL, 1)
INSERT [dbo].[Order] ([id], [customerID], [staffID], [paymentID], [PromotionID]) VALUES (27, 5, NULL, NULL, 1)
INSERT [dbo].[Order] ([id], [customerID], [staffID], [paymentID], [PromotionID]) VALUES (28, 6, NULL, NULL, 7)
SET IDENTITY_INSERT [dbo].[Order] OFF
GO
SET IDENTITY_INSERT [dbo].[OrderDetail] ON 

INSERT [dbo].[OrderDetail] ([id], [orderID], [productID], [quantity], [price]) VALUES (12, 26, 1, 6, CAST(750000 AS Decimal(10, 0)))
INSERT [dbo].[OrderDetail] ([id], [orderID], [productID], [quantity], [price]) VALUES (13, 26, 3, 1, CAST(750000 AS Decimal(10, 0)))
INSERT [dbo].[OrderDetail] ([id], [orderID], [productID], [quantity], [price]) VALUES (14, 26, 4, 1, CAST(750000 AS Decimal(10, 0)))
INSERT [dbo].[OrderDetail] ([id], [orderID], [productID], [quantity], [price]) VALUES (15, 27, 1, 2, CAST(650000 AS Decimal(10, 0)))
INSERT [dbo].[OrderDetail] ([id], [orderID], [productID], [quantity], [price]) VALUES (16, 28, 1, 3, CAST(750000 AS Decimal(10, 0)))
INSERT [dbo].[OrderDetail] ([id], [orderID], [productID], [quantity], [price]) VALUES (17, 28, 8, 1, CAST(900000 AS Decimal(10, 0)))
SET IDENTITY_INSERT [dbo].[OrderDetail] OFF
GO
SET IDENTITY_INSERT [dbo].[OrderStatus] ON 

INSERT [dbo].[OrderStatus] ([id], [orderDate], [orderStatus], [orderID]) VALUES (11, CAST(N'2023-10-25T13:00:21.533' AS DateTime), N'processing', 26)
INSERT [dbo].[OrderStatus] ([id], [orderDate], [orderStatus], [orderID]) VALUES (12, CAST(N'2023-10-25T16:01:20.613' AS DateTime), N'processing', 27)
INSERT [dbo].[OrderStatus] ([id], [orderDate], [orderStatus], [orderID]) VALUES (13, CAST(N'2023-11-04T16:30:08.313' AS DateTime), N'Ðang xử lý', 28)
SET IDENTITY_INSERT [dbo].[OrderStatus] OFF
GO
SET IDENTITY_INSERT [dbo].[Product] ON 

INSERT [dbo].[Product] ([id], [name], [code], [material], [size], [price], [discount], [category], [stock], [isAvailable], [quantitySold], [rate_sum], [rate_count], [Image]) VALUES (1, N'Lồng Chào Mào Gỗ Mun Hoa', N'MST001', 7, N'Cao 40cm, rộng 30cm, đường kính 20cm ', CAST(210000 AS Decimal(10, 0)), 0, 1, 2, 1, 0, NULL, NULL, N'long-mun-cham-hoa-mai-1.jpg')
INSERT [dbo].[Product] ([id], [name], [code], [material], [size], [price], [discount], [category], [stock], [isAvailable], [quantitySold], [rate_sum], [rate_count], [Image]) VALUES (3, N'Lông chào mào chân tròn', N'ST1006', 1, N'Cao 50cm, rộng 30cm, Form hình hộp chữ nhật', CAST(310000 AS Decimal(10, 0)), 50, 3, 2, 1, 0, NULL, NULL, N'long-luc-chao-mao.jpg')
INSERT [dbo].[Product] ([id], [name], [code], [material], [size], [price], [discount], [category], [stock], [isAvailable], [quantitySold], [rate_sum], [rate_count], [Image]) VALUES (4, N'Lồng Chim Chào Mào Cáp Quang Khung Gỗ', N'ST1004', 1, N'Cao 45cm, rộng 25cm, Form hình hộp chữ nhật', CAST(499000 AS Decimal(10, 0)), 28, 2, 12, 1, 0, NULL, NULL, N'long-chao-mao-go-mun-soc-chan-cham-1.jpg')
INSERT [dbo].[Product] ([id], [name], [code], [material], [size], [price], [discount], [category], [stock], [isAvailable], [quantitySold], [rate_sum], [rate_count], [Image]) VALUES (7, N'Lồng Chào Mào Tre Già Nan Khít
', N'ST1002', 1, N'Cao 40cm, rộng 25cm, Form hình hộp chữ nhật', CAST(500000 AS Decimal(10, 0)), 19, 2, 14, 1, 0, NULL, NULL, N'long-chao-mao-sin-tre-gia-1 (1).jpg')
INSERT [dbo].[Product] ([id], [name], [code], [material], [size], [price], [discount], [category], [stock], [isAvailable], [quantitySold], [rate_sum], [rate_count], [Image]) VALUES (8, N'Lồng Chào Mào Gỗ Mun Sọc Chân Chạm
', N'ST4011', 1, N'Cao 45cm, rộng 30cm, đường kính 20cm ', CAST(550000 AS Decimal(10, 0)), 19, 1, 15, 1, 0, NULL, NULL, N'long-chao-mao-sin-tre-gia-1.jpg')
INSERT [dbo].[Product] ([id], [name], [code], [material], [size], [price], [discount], [category], [stock], [isAvailable], [quantitySold], [rate_sum], [rate_count], [Image]) VALUES (9, N'Lồng Chào Mào Sin Tre Già
', N'ST4008', 1, N'Cao 45cm, rộng 25cm, đường kính 20cm', CAST(350000 AS Decimal(10, 0)), 29, 1, 20, 1, 0, NULL, NULL, N'long-chao-mao-tre-gia-nan-khit-1.jpg')
INSERT [dbo].[Product] ([id], [name], [code], [material], [size], [price], [discount], [category], [stock], [isAvailable], [quantitySold], [rate_sum], [rate_count], [Image]) VALUES (11, N'Lồng Chào Mào Gỗ Mun Hoa
', N'ST4001', 6, N'Cao 45cm, rộng 25cm, đường kính 20cm ', CAST(400000 AS Decimal(10, 0)), 29, 1, 25, 1, 0, NULL, NULL, N'long-chum.jpg')
INSERT [dbo].[Product] ([id], [name], [code], [material], [size], [price], [discount], [category], [stock], [isAvailable], [quantitySold], [rate_sum], [rate_count], [Image]) VALUES (14, N'Lồng chim tu hú mũ cao', N'LTH002', 4, N'Cao 45cm, rộng 25cm, đường kính 20cm ', CAST(600000 AS Decimal(10, 0)), 30, 3, 11, 1, 0, NULL, NULL, N'long-hoa-mi-56-60-nan-full-set-2.jpg')
INSERT [dbo].[Product] ([id], [name], [code], [material], [size], [price], [discount], [category], [stock], [isAvailable], [quantitySold], [rate_sum], [rate_count], [Image]) VALUES (19, N'Lồng chim vành khuyên', N'LCD026', 4, N'Cao 45cm, rộng 25cm, đường kính 20cm ', CAST(500000 AS Decimal(10, 0)), 25, 1, 1, 1, 1, NULL, NULL, N'long-chao-mao-bang-sung-1.jpg')
INSERT [dbo].[Product] ([id], [name], [code], [material], [size], [price], [discount], [category], [stock], [isAvailable], [quantitySold], [rate_sum], [rate_count], [Image]) VALUES (22, N'Lồng chim vành khuyên sừng trâu', N'LVK001', 5, N'Cao 45cm, rộng 25cm, đường kính 20cm ', CAST(200000 AS Decimal(10, 0)), 29, 1, 2, 1, 0, NULL, NULL, N'long-mat-cat-nan-lui-1.jpg')
INSERT [dbo].[Product] ([id], [name], [code], [material], [size], [price], [discount], [category], [stock], [isAvailable], [quantitySold], [rate_sum], [rate_count], [Image]) VALUES (23, N'Lồng chim vành khuyên thái đấu', N'LVK002', 4, N'Cao 45cm, rộng 25cm, đường kính 20cm ', CAST(400000 AS Decimal(10, 0)), 29, 1, 2, 1, 0, NULL, NULL, N'long-cu-gay-vuong.jpg')
INSERT [dbo].[Product] ([id], [name], [code], [material], [size], [price], [discount], [category], [stock], [isAvailable], [quantitySold], [rate_sum], [rate_count], [Image]) VALUES (24, N'Lồng Chim Chào Mào', N'LCD510', 2, N'Cao 45cm, rộng 25cm, đường kính 20cm ', CAST(260000 AS Decimal(10, 0)), 29, 2, 3, 1, 3, NULL, NULL, N'long-cu-gay-vuong.jpg')
INSERT [dbo].[Product] ([id], [name], [code], [material], [size], [price], [discount], [category], [stock], [isAvailable], [quantitySold], [rate_sum], [rate_count], [Image]) VALUES (25, N'Lồng Khuyên Inox, Lồng Khuyên Sắt Không Gỉ', N'LCD511', 9, N'Cao 45cm, rộng 25cm, đường kính 20cm ', CAST(320000 AS Decimal(10, 0)), 10, 5, 10, 1, 0, NULL, NULL, N'long-khuyen-inox-1-247x296.jpg')
INSERT [dbo].[Product] ([id], [name], [code], [material], [size], [price], [discount], [category], [stock], [isAvailable], [quantitySold], [rate_sum], [rate_count], [Image]) VALUES (26, N'Chuồng Vẹt Inox, Lồng Vẹt Inox Đài Loan Cao Cấp', N'LCD512', 9, N'Cao 45cm, rộng 25cm, form chữ nhật', CAST(420000 AS Decimal(10, 0)), 15, 5, 10, 1, 0, NULL, NULL, N'chuong-vet-inox.jpg')
SET IDENTITY_INSERT [dbo].[Product] OFF
GO
SET IDENTITY_INSERT [dbo].[Promotion] ON 

INSERT [dbo].[Promotion] ([ID], [Name], [DateStart], [DateEnd], [Status], [Value], [AccountID], [Condition]) VALUES (1, N'Giảm Giá 11/11', CAST(N'2023-01-01' AS Date), CAST(N'2023-10-29' AS Date), 1, 20, 1, N'2')
INSERT [dbo].[Promotion] ([ID], [Name], [DateStart], [DateEnd], [Status], [Value], [AccountID], [Condition]) VALUES (2, N'Promo 15/11', CAST(N'2023-02-01' AS Date), CAST(N'2023-02-28' AS Date), 0, 15, 2, N'2')
INSERT [dbo].[Promotion] ([ID], [Name], [DateStart], [DateEnd], [Status], [Value], [AccountID], [Condition]) VALUES (5, N'Giảm Giá 2/11', CAST(N'2023-10-27' AS Date), CAST(N'2023-11-15' AS Date), 1, 100, 2, N'20')
INSERT [dbo].[Promotion] ([ID], [Name], [DateStart], [DateEnd], [Status], [Value], [AccountID], [Condition]) VALUES (7, N'Văn nghệ', CAST(N'2023-11-04' AS Date), CAST(N'2023-11-30' AS Date), 1, 12, 2, N'1')
SET IDENTITY_INSERT [dbo].[Promotion] OFF
GO
SET IDENTITY_INSERT [dbo].[Request] ON 

INSERT [dbo].[Request] ([id], [customerId], [name], [size], [material], [price], [staffID], [Quantity], [CategoryID]) VALUES (6, 1003, N'lồng chim tú hú siêu to', N'cao 40cm,rộng 30cm, đường kính 20cm ', 1, CAST(100000 AS Decimal(10, 0)), 3, 1, 3)
INSERT [dbo].[Request] ([id], [customerId], [name], [size], [material], [price], [staffID], [Quantity], [CategoryID]) VALUES (7, 1003, N'Lồng chim vành khuyên bự', N'cao 50cm,rộng 30cm, đường kính 25cm  ', 4, CAST(1111 AS Decimal(10, 0)), 2, 1, 1)
INSERT [dbo].[Request] ([id], [customerId], [name], [size], [material], [price], [staffID], [Quantity], [CategoryID]) VALUES (9, 1003, N'Lồng chim tu hú mũi cao', N'cao 40cm,rộng 30cm, đường kính 20cm', 1, CAST(200 AS Decimal(10, 0)), 2, 12, 3)
INSERT [dbo].[Request] ([id], [customerId], [name], [size], [material], [price], [staffID], [Quantity], [CategoryID]) VALUES (11, 1003, N'Lồng chim tu hú ', N'cao 40cm,rộng 30cm, đường kính 20cm', 1, CAST(123 AS Decimal(10, 0)), 2, 111, 1)
INSERT [dbo].[Request] ([id], [customerId], [name], [size], [material], [price], [staffID], [Quantity], [CategoryID]) VALUES (12, 1028, N'Lồng chim chào mào báng cao', N'cao 40cm,rộng 30cm, đường kính 20cm', 2, CAST(-2 AS Decimal(10, 0)), 3, 3, 2)
INSERT [dbo].[Request] ([id], [customerId], [name], [size], [material], [price], [staffID], [Quantity], [CategoryID]) VALUES (13, 1028, N'Lồng chim tự đặt', N'cao 40cm,rộng 30cm, đường kính 20cm', 2, NULL, NULL, 20, 3)
SET IDENTITY_INSERT [dbo].[Request] OFF
GO
SET IDENTITY_INSERT [dbo].[RequestStatus] ON 

INSERT [dbo].[RequestStatus] ([id], [requestID], [createdDate], [status]) VALUES (2, 5, CAST(N'2023-10-25T15:12:18.000' AS DateTime), 3)
INSERT [dbo].[RequestStatus] ([id], [requestID], [createdDate], [status]) VALUES (3, 6, CAST(N'2023-10-25T15:55:11.000' AS DateTime), 3)
INSERT [dbo].[RequestStatus] ([id], [requestID], [createdDate], [status]) VALUES (4, 7, CAST(N'2023-10-28T16:28:30.000' AS DateTime), 2)
INSERT [dbo].[RequestStatus] ([id], [requestID], [createdDate], [status]) VALUES (5, 9, CAST(N'2023-11-01T23:32:52.000' AS DateTime), 2)
INSERT [dbo].[RequestStatus] ([id], [requestID], [createdDate], [status]) VALUES (6, 10, CAST(N'2023-11-01T23:44:39.000' AS DateTime), 3)
INSERT [dbo].[RequestStatus] ([id], [requestID], [createdDate], [status]) VALUES (7, 11, CAST(N'2023-11-03T09:03:10.000' AS DateTime), 2)
INSERT [dbo].[RequestStatus] ([id], [requestID], [createdDate], [status]) VALUES (8, 12, CAST(N'2023-11-15T08:50:09.000' AS DateTime), 2)
INSERT [dbo].[RequestStatus] ([id], [requestID], [createdDate], [status]) VALUES (9, 13, CAST(N'2023-11-15T18:47:24.000' AS DateTime), 0)
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
ALTER TABLE [dbo].[Comment] ADD  DEFAULT ('1') FOR [status]
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
ALTER TABLE [dbo].[Promotion]  WITH CHECK ADD  CONSTRAINT [FK__Promotion__Accou__5DCAEF64] FOREIGN KEY([AccountID])
REFERENCES [dbo].[Account] ([id])
GO
ALTER TABLE [dbo].[Promotion] CHECK CONSTRAINT [FK__Promotion__Accou__5DCAEF64]
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
USE [master]
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET  READ_WRITE 
GO
