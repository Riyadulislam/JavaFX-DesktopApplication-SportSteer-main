USE [master]
GO
/****** Object:  Database [SportSteer]    Script Date: 9/25/2020 10:48:43 AM ******/
CREATE DATABASE [SportSteer]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'SportSteer', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\SportSteer.mdf' , SIZE = 3264KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'SportSteer_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\SportSteer_log.ldf' , SIZE = 816KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [SportSteer] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [SportSteer].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [SportSteer] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [SportSteer] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [SportSteer] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [SportSteer] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [SportSteer] SET ARITHABORT OFF 
GO
ALTER DATABASE [SportSteer] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [SportSteer] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [SportSteer] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [SportSteer] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [SportSteer] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [SportSteer] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [SportSteer] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [SportSteer] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [SportSteer] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [SportSteer] SET  ENABLE_BROKER 
GO
ALTER DATABASE [SportSteer] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [SportSteer] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [SportSteer] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [SportSteer] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [SportSteer] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [SportSteer] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [SportSteer] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [SportSteer] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [SportSteer] SET  MULTI_USER 
GO
ALTER DATABASE [SportSteer] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [SportSteer] SET DB_CHAINING OFF 
GO
ALTER DATABASE [SportSteer] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [SportSteer] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [SportSteer] SET DELAYED_DURABILITY = DISABLED 
GO
USE [SportSteer]
GO
/****** Object:  Table [dbo].[Employee]    Script Date: 9/25/2020 10:48:43 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Employee](
	[EmployeeID] [bigint] NOT NULL,
	[Name] [varchar](100) NULL,
	[Category] [varchar](50) NULL,
	[DOB] [date] NULL,
	[Salary] [bigint] NULL,
	[Phone] [varchar](100) NULL,
	[Mail] [varchar](100) NULL,
	[Addess] [varchar](100) NULL,
	[BloodGroup] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[EmployeeID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Finance]    Script Date: 9/25/2020 10:48:43 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Finance](
	[FinanceID] [bigint] NULL,
	[Type] [varchar](200) NULL,
	[Amount] [bigint] NULL,
	[Description] [text] NULL,
	[IsuuedDate] [datetime] NULL,
	[Method] [varchar](100) NULL,
	[Status] [varchar](100) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[PlayerPerfomance]    Script Date: 9/25/2020 10:48:43 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[PlayerPerfomance](
	[PerfomanceId] [bigint] IDENTITY(1,1) NOT NULL,
	[EmployeeID] [bigint] NULL,
	[MatchID] [bigint] NULL,
	[PalyerType] [varchar](100) NULL,
	[RunsScored] [bigint] NULL DEFAULT ((0)),
	[BallsFaced] [bigint] NULL DEFAULT ((0)),
	[Fours] [bigint] NULL DEFAULT ((0)),
	[Sixes] [bigint] NULL DEFAULT ((0)),
	[WicketsTaken] [bigint] NULL DEFAULT ((0)),
	[BallsBowled] [bigint] NULL DEFAULT ((0)),
	[RunsGave] [bigint] NULL DEFAULT ((0)),
	[Pom] [varchar](100) NULL DEFAULT ('0'),
PRIMARY KEY CLUSTERED 
(
	[PerfomanceId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[SALARY]    Script Date: 9/25/2020 10:48:43 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[SALARY](
	[SalaryId] [bigint] IDENTITY(1,1) NOT NULL,
	[EmployeeID] [bigint] NULL,
	[Month] [varchar](100) NULL,
	[Year] [varchar](100) NULL,
	[BonusAmount] [bigint] NULL,
	[BonusEligibikity] [bigint] NULL,
	[Status] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[SalaryId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Schedule]    Script Date: 9/25/2020 10:48:43 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Schedule](
	[ScheduleId] [bigint] NOT NULL,
	[ScheduleType] [varchar](100) NULL,
	[ScheduleTime] [datetime] NULL,
	[ScheduleDesc] [varchar](800) NULL,
PRIMARY KEY CLUSTERED 
(
	[ScheduleId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TeamPerfomance]    Script Date: 9/25/2020 10:48:43 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TeamPerfomance](
	[MatchID] [bigint] NOT NULL,
	[MatchType] [varchar](100) NULL,
	[MatchDate] [date] NULL,
	[RunsScored] [bigint] NULL,
	[RunsGiven] [bigint] NULL,
	[WicketsTaken] [bigint] NULL,
	[WicketsLost] [bigint] NULL,
	[MatchVerdict] [varchar](100) NULL,
	[Fours] [bigint] NULL,
	[Sixes] [bigint] NULL,
PRIMARY KEY CLUSTERED 
(
	[MatchID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[users]    Script Date: 9/25/2020 10:48:43 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[users](
	[UserID] [int] IDENTITY(1,1) NOT NULL,
	[UserName] [varchar](50) NOT NULL,
	[UserPassword] [varchar](50) NOT NULL,
	[UserEmail] [varchar](50) NOT NULL,
	[UserMode] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[UserID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
ALTER TABLE [dbo].[PlayerPerfomance]  WITH CHECK ADD FOREIGN KEY([EmployeeID])
REFERENCES [dbo].[Employee] ([EmployeeID])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[PlayerPerfomance]  WITH CHECK ADD FOREIGN KEY([MatchID])
REFERENCES [dbo].[TeamPerfomance] ([MatchID])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[SALARY]  WITH CHECK ADD FOREIGN KEY([EmployeeID])
REFERENCES [dbo].[Employee] ([EmployeeID])
ON UPDATE CASCADE
GO
USE [master]
GO
ALTER DATABASE [SportSteer] SET  READ_WRITE 
GO
