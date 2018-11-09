CREATE TABLE IF NOT EXISTS `studentsh` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(40) NOT NULL,
  `last_name` varchar(40) NOT NULL,
  `marks` int(11) NOT NULL,
  PRIMARY KEY (`id`)
);

--
-- Dumping data for table `student`
--

INSERT INTO `studentsh` (`id`, `first_name`, `last_name`, `marks`) 
  VALUES(1, 'George', 'Kane', 20);
INSERT INTO `studentsh` (`id`, `first_name`, `last_name`, `marks`) 
  VALUES(2, 'Melissa', 'Michael', 91);
INSERT INTO `studentsh` (`id`, `first_name`, `last_name`, `marks`) 
  VALUES(3, 'Jessica', 'Drake', 21);