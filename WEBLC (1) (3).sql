 drop database [WEB_BAN_LONG_CHIM]
USE [master]
GO
/****** Object:  Database [WEB_BAN_LONG_CHIM]    Script Date: 9/23/2023 10:53:55 AM ******/
CREATE DATABASE [WEB_BAN_LONG_CHIM]
 
 
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
EXEC sys.sp_db_vardecimal_storage_format N'WEB_BAN_LONG_CHIM', N'ON'
GO
ALTER DATABASE [WEB_BAN_LONG_CHIM] SET QUERY_STORE = OFF
GO
USE [WEB_BAN_LONG_CHIM]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 9/23/2023 10:53:56 AM ******/
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
	[image] [int] NULL,
	[supervisor] [int] NULL,
	[point] [int] NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Category]    Script Date: 9/23/2023 10:53:56 AM ******/
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

/****** Object:  Table [dbo].[Comment]    Script Date: 9/23/2023 10:53:56 AM ******/
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
/****** Object:  Table [dbo].[Customer]    Script Date: 9/23/2023 10:53:56 AM ******/
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
/****** Object:  Table [dbo].[Image]    Script Date: 9/23/2023 10:53:56 AM ******/
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
/****** Object:  Table [dbo].[Material]    Script Date: 9/23/2023 10:53:56 AM ******/
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

/****** Object:  Table [dbo].[Order]    Script Date: 9/23/2023 10:53:56 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Order](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[customerID] [int] NOT NULL,
	[staffID] [int] NOT NULL,
	[paymentID] [int] NOT NULL,
 CONSTRAINT [PK_Order] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OrderDetail]    Script Date: 9/23/2023 10:53:56 AM ******/
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
/****** Object:  Table [dbo].[OrderStatus]    Script Date: 9/23/2023 10:53:56 AM ******/
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
/****** Object:  Table [dbo].[Payment]    Script Date: 9/23/2023 10:53:56 AM ******/
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
/****** Object:  Table [dbo].[Product]    Script Date: 9/23/2023 10:53:56 AM ******/
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
 CONSTRAINT [PK_Product] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO



/****** Object:  Table [dbo].[Request]    Script Date: 9/23/2023 10:53:56 AM ******/
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
 CONSTRAINT [PK_Request] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[RequestStatus]    Script Date: 9/23/2023 10:53:56 AM ******/
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
/****** Object:  Table [dbo].[Role]    Script Date: 9/23/2023 10:53:56 AM ******/
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
ALTER TABLE [dbo].[Order]  WITH CHECK ADD  CONSTRAINT [FK_Order_Customer] FOREIGN KEY([customerID])
REFERENCES [dbo].[Customer] ([id])
GO
ALTER TABLE [dbo].[Order] CHECK CONSTRAINT [FK_Order_Customer]
GO
ALTER TABLE [dbo].[Order]  WITH CHECK ADD  CONSTRAINT [FK_Order_Payment] FOREIGN KEY([paymentID])
REFERENCES [dbo].[Payment] ([id])
GO
ALTER TABLE [dbo].[Order] CHECK CONSTRAINT [FK_Order_Payment]
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
ALTER TABLE [dbo].[Request]  WITH CHECK ADD  CONSTRAINT [FK_Request_Account] FOREIGN KEY([staffID])
REFERENCES [dbo].[Account] ([id])
GO
ALTER TABLE [dbo].[Request] CHECK CONSTRAINT [FK_Request_Account]
GO
ALTER TABLE [dbo].[Request]  WITH CHECK ADD  CONSTRAINT [FK_Request_Customer] FOREIGN KEY([customerId])
REFERENCES [dbo].[Customer] ([id])
GO
ALTER TABLE [dbo].[Request] CHECK CONSTRAINT [FK_Request_Customer]
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




Delete from Category where id = 1
INSERT INTO Category( categoryName) VALUES('Lồng chim vành khuyên')
INSERT INTO Category( categoryName) VALUES('Lồng chim chào mào')
INSERT INTO Material (original)
VALUES ('Tre');

-- Inserting the second record
INSERT INTO Material (original)
VALUES ('Gỗ mun');

-- Inserting the third record
INSERT INTO Material (original)
VALUES ('Kim loại');

-- Inserting the fourth record
INSERT INTO Material (original)
VALUES ('Tre và gỗ mun');

-- Inserting the fifth record
INSERT INTO Material (original)
VALUES ('Sừng trâu');

-- Inserting the sixth record
INSERT INTO Material (original)
VALUES ('Tre và sừng trâu');

-- Inserting the seventh record
INSERT INTO Material (original)
VALUES ('Trúc');

/** Insert new recordx**/
INSERT INTO Product (name, code, material, size, price, discount, category, stock, isAvailable, quantitySold)
VALUES ('LÔNG MI TRIỆN TRÚC CẤT HÀNG SIÊU Kỳ', 'MST001', 1, 'rộng 32cm', 45000000, 1, 1, 100, 1, 0);
-- Insert the second record
INSERT INTO Product (name, code, material, size, price, discount, category, stock, isAvailable, quantitySold)
VALUES ('Lông chào mào bằng súng', 'ST1005', 1, 'Vuông cao, vuông đầu', 1600000, 0.01, 2, 122, 1, 0);

-- Insert the third record
INSERT INTO Product (name, code, material, size, price, discount, category, stock, isAvailable, quantitySold)
VALUES ('Lông chào mào chân tròn', 'ST1006', 1, 'Vuông cao, vuông đầu', 1600000, 0.01, 2, 100, 1, 0);

INSERT INTO Product (name, code, material, size, price, discount, category, stock, isAvailable, quantitySold)
VALUES ('Lạng chào mào gốc mun hoa', 'ST1004', 1, 'Vuông cao, vuông đầu', 2800000, 0.01, 2, 100, 1, 0);

INSERT INTO Product (name, code, material, size, price, discount, category, stock, isAvailable, quantitySold)
VALUES ('Lạng chào mào gốc mun sọc chân chỏm', 'ST1008', 2, 'Vuông cao, vuông đầu', 1600000, 0.01, 2, 100, 1, 0);

INSERT INTO Product (name, code, material, size, price, discount, category, stock, isAvailable, quantitySold)
VALUES ('Lạng chào mào tang lối cắt góc', 'ST1003', 1, 'Vuông cao, thái đầu', 2200000, 0.01, 2, 100, 1, 0);

INSERT INTO Product (name, code, material, size, price, discount, category, stock, isAvailable, quantitySold)
VALUES ('Lạng chào mào tang lối vuông', 'ST1002', 1, 'Vuông cao, vuông đầu', 3000000, 0.01, 2, 100, 1, 0);

INSERT INTO Product (name, code, material, size, price, discount, category, stock, isAvailable, quantitySold)
VALUES ('Lạng khuyên lá đề tre già để tròn', 'ST4011', 1, 'Tròn tròn', 900000, 0, 1, 100, 1, 0);

INSERT INTO Product (name, code, material, size, price, discount, category, stock, isAvailable, quantitySold)
VALUES ('Lạng khuyên chạm tay lãng hoa thẳng', 'ST4008', 1, 'Tròn tròn', 8500000, 0, 1, 100, 1, 0);

-- Inserting the seventh record
INSERT INTO Product (name, code, material, size, price, discount, category, stock, isAvailable, quantitySold)
VALUES ('Lạng khuyên gốc mun chăm tùng hoa thẳng', 'ST4007', 2, 'Tròn tròn', 5000000, 0, 1, 100, 1, 0);

-- Inserting the eighth record
INSERT INTO Product (name, code, material, size, price, discount, category, stock, isAvailable, quantitySold)
VALUES ('Lạng chim bồc sụng bò chăm bi tùng nai thẳng', 'ST4001', 6, 'Tròn tròn', 17000000, 0, 1, 100, 1, 0);

-- Inserting the ninth record
INSERT INTO Product (name, code, material, size, price, discount, category, stock, isAvailable, quantitySold)
VALUES ('Lạng chim cao đế sụng bò Châu Phi chăm tùng học viên bi', 'ST4009', 6, N'Tròn tròn', 18000000, 0, 1, 100, 1, 0);

ALTER TABLE Product
ADD Image nvarchar(MAX);

INSERT INTO [Role] ([name])
VALUES ('admin'),
       ('manager'),
       ('staff');

INSERT INTO [dbo].[Account] ([firstname], [password], [email], [lastname], [birthday], [roleid], [address], [isActive], [gender], [image], [supervisor], [point])
VALUES
  ('First Name 1', '123', 'admin@example.com', 'Last Name 1', '1990-01-01', 1, 'Address 1', 1, 1, 1, NULL, NULL),
  ('First Name 2', '123', 'manager@example.com', 'Last Name 2', '1990-02-02', 2, 'Address 2', 1, 0, 2, NULL, NULL),
  ('First Name 3', '123', 'staff@example.com', 'Last Name 3', '1990-03-03', 3, 'Address 3', 1, 0, 3, NULL, NULL);

