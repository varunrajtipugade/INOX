-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 03, 2021 at 10:37 AM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `inox`
--

-- --------------------------------------------------------

--
-- Table structure for table `hall1`
--

CREATE TABLE IF NOT EXISTS `hall1` (
  `seat` int(11) NOT NULL,
  `showtime` varchar(30) NOT NULL,
  `status` varchar(30) NOT NULL,
  `current_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hall1`
--

INSERT INTO `hall1` (`seat`, `showtime`, `status`, `current_date`) VALUES
(34, '12pm to 3pm', 'booked', '2021-07-03 08:02:46'),
(35, '12pm to 3pm', 'booked', '2021-07-03 08:02:46');

-- --------------------------------------------------------

--
-- Table structure for table `hall2`
--

CREATE TABLE IF NOT EXISTS `hall2` (
  `seat` int(11) NOT NULL,
  `showtime` varchar(30) NOT NULL,
  `status` varchar(30) NOT NULL,
  `current_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `hall3`
--

CREATE TABLE IF NOT EXISTS `hall3` (
  `seat` int(11) NOT NULL,
  `showtime` varchar(30) NOT NULL,
  `status` varchar(30) NOT NULL,
  `current_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', '1212'),
('varunraj', '0707');

-- --------------------------------------------------------

--
-- Table structure for table `movie`
--

CREATE TABLE IF NOT EXISTS `movie` (
`id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `price` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `movie`
--

INSERT INTO `movie` (`id`, `name`, `price`) VALUES
(1, 'Titanic', 150),
(2, 'Kabir Singh', 200),
(3, 'Tere Naam', 100);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `hall1`
--
ALTER TABLE `hall1`
 ADD PRIMARY KEY (`seat`);

--
-- Indexes for table `hall2`
--
ALTER TABLE `hall2`
 ADD PRIMARY KEY (`seat`);

--
-- Indexes for table `hall3`
--
ALTER TABLE `hall3`
 ADD PRIMARY KEY (`seat`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
 ADD PRIMARY KEY (`username`);

--
-- Indexes for table `movie`
--
ALTER TABLE `movie`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `movie`
--
ALTER TABLE `movie`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
