-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 26, 2023 at 03:22 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pharmacydb`
--

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `p_id` int(255) NOT NULL,
  `category` varchar(255) NOT NULL,
  `pname` varchar(255) NOT NULL,
  `expiry` date NOT NULL,
  `price` int(255) NOT NULL,
  `stocks` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`p_id`, `category`, `pname`, `expiry`, `price`, `stocks`) VALUES
(2, 'PARACETAMOL', 'BIOFLU', '2023-06-16', 12, 10),
(3, 'PARACETAMOL', 'FLUGARD', '2023-06-15', 12, 10),
(4, 'PARACETAMOL', 'NEOZEP', '2023-06-18', 12, 0),
(6, 'paracetamol', 'aaa', '2023-06-17', 22, 61),
(7, 'aaaa', 'aaa', '2023-06-11', 12, 2),
(8, 'cetirizine', 'ronel', '2023-06-24', 21, 0);

-- --------------------------------------------------------

--
-- Table structure for table `stockin`
--

CREATE TABLE `stockin` (
  `stockin_id` int(255) NOT NULL,
  `pname` varchar(255) NOT NULL,
  `suppliername` varchar(255) NOT NULL,
  `date` datetime NOT NULL DEFAULT current_timestamp(),
  `expirydate` date NOT NULL,
  `quantity` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `stockin`
--

INSERT INTO `stockin` (`stockin_id`, `pname`, `suppliername`, `date`, `expirydate`, `quantity`) VALUES
(1, 'paracetamol', 'bioflu', '2023-06-16 10:24:36', '2023-06-26', 4),
(2, 'solmux', 'bioflu', '2023-06-16 10:35:54', '2023-06-23', 4),
(3, 'aa', 'aaa', '2023-06-16 11:05:41', '2023-06-20', 60),
(4, 'paracetamol', 'bioflu', '2023-06-16 17:51:35', '2023-06-26', 5);

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `transaction_ID` int(255) NOT NULL,
  `category` varchar(255) NOT NULL,
  `pname` varchar(255) NOT NULL,
  `price` int(255) NOT NULL,
  `quantity` int(255) NOT NULL,
  `total` int(11) NOT NULL,
  `Date` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaction`
--

INSERT INTO `transaction` (`transaction_ID`, `category`, `pname`, `price`, `quantity`, `total`, `Date`) VALUES
(1, 'aaa', 'aa', 20, 2, 40, '2023-06-16'),
(2, 'aaa', 'aa', 20, 2, 40, '2023-06-16'),
(3, 'aaa', 'aa', 20, 2, 40, '2023-06-16'),
(4, 'PARACETAMOL', 'NEOZEP', 24, 2, 48, '2023-06-16'),
(5, 'cetirizine', 'ronel', 63, 3, 189, '2023-06-16'),
(6, 'cetirizine', 'ronel', 252, 12, 3024, '2023-06-16'),
(7, 'PARACETAMOL', 'NEOZEP', 156, 13, 2028, '2023-06-16');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` int(255) NOT NULL,
  `usertype` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `usertype`, `username`, `password`) VALUES
(1, 'ADMIN', 'ADMIN', 'ADMIN');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`p_id`);

--
-- Indexes for table `stockin`
--
ALTER TABLE `stockin`
  ADD PRIMARY KEY (`stockin_id`);

--
-- Indexes for table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`transaction_ID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `inventory`
--
ALTER TABLE `inventory`
  MODIFY `p_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `stockin`
--
ALTER TABLE `stockin`
  MODIFY `stockin_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `transaction`
--
ALTER TABLE `transaction`
  MODIFY `transaction_ID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
