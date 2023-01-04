DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
    `id` int NOT NULL,
    `username` varchar(255) NOT NULL,
    `password` varchar(255) NOT NULL,
    PRIMARY KEY (`id`)
);