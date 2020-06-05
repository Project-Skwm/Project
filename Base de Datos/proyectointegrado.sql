-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-06-2020 a las 11:34:05
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyectointegrado`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `ID` varchar(9) NOT NULL,
  `Nº Usuario` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comprueba`
--

CREATE TABLE `comprueba` (
  `ID` varchar(9) NOT NULL,
  `Nº Trabajador` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pide`
--

CREATE TABLE `pide` (
  `ID` varchar(9) NOT NULL,
  `Nº Trabajador` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `piezas`
--

CREATE TABLE `piezas` (
  `ID` varchar(9) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Marca` varchar(15) NOT NULL,
  `Precio` varchar(5) NOT NULL,
  `Cant_Tienda` int(2) NOT NULL,
  `Cant_RecomTienda` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `piezas`
--

INSERT INTO `piezas` (`ID`, `Nombre`, `Marca`, `Precio`, `Cant_Tienda`, `Cant_RecomTienda`) VALUES
('1Decks', 'Deck Estrella', 'Estrella', '19.99', 25, 60),
('1ejes', 'ejes Estrella', 'Estrella', '19.99', 25, 60),
('1lijas', 'lijas Estrella', 'Estrella', '19.99', 25, 60),
('1Rod', 'Rodamientos Estrella', 'Estrella', '19.99', 25, 60),
('1Rueda', 'Rueda Estrella', 'Estrella', '19.99', 25, 60),
('1Torn', 'Tornillo Estrella', 'Estrella', '19.99', 25, 60),
('2Decks', 'Deck Facha', 'Facha', '50.00', 50, 100),
('2ejes', 'ejes Facha', 'Facha', '19.99', 25, 60),
('2lijas', 'lijas Facha', 'Facha', '19.99', 25, 60),
('2Rod', 'Rodamientos Facha', 'Facha', '50.00', 50, 100),
('2Rueda', 'Rueda Facha', 'Facha', '50.00', 50, 100),
('2Torn', 'Tornillo Facha', 'Facha', '50.00', 50, 100),
('3Decks', 'Deck Timmy', 'Timmy', '19.99', 25, 50),
('3ejes', 'ejes Timmy', 'Timmy', '19.99', 25, 50),
('3lijas', 'lijas Timmy', 'Timmy', '19.99', 25, 50),
('3Rod', 'Rodamientos Timmy', 'Timmy', '19.99', 25, 50),
('3Rueda', 'Rueda Timmy', 'Timmy', '19.99', 25, 50),
('3Torn', 'Tornillo Timmy', 'Timmy', '19.99', 25, 50),
('4Decks', 'Deck Serxi', 'Serxi', '50.00', 30, 35),
('4ejes', 'ejes Serxi', 'Serxi', '50.00', 30, 35),
('4lijas', 'lijas Serxi', 'Serxi', '50.00', 30, 35),
('4Rod', 'Rodamientos Serxi', 'Serxi', '50.00', 30, 35),
('4Rueda', 'Rueda Serxi', 'Serxi', '50.00', 30, 35),
('4Torn', 'Tornillo Serxi', 'Serxi', '50.00', 30, 35);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `supervisor`
--

CREATE TABLE `supervisor` (
  `Nº Trabajador` int(255) NOT NULL,
  `Nombre` varchar(10) NOT NULL,
  `Apellido` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL,
  `contraseña` varchar(16) NOT NULL,
  `DNI` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `supervisor`
--

INSERT INTO `supervisor` (`Nº Trabajador`, `Nombre`, `Apellido`, `email`, `contraseña`, `DNI`) VALUES
(1, 'Minuel', 'Sebastian', 'dhiygudbondof@gmail.com', '12345678', '12345678a'),
(2, 'Lauren', 'Ciucan', 'bgortioywe@gmail.com', '87654321', '23456789b'),
(3, 'Kala', 'Mar', 'verdeeterno@gmail.com', '77717954546', '15975346l'),
(4, 'Fran', 'Cuesta', 'aquinohayquienviva@gmail.com', '758462139', '15862479p');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajador`
--

CREATE TABLE `trabajador` (
  `Nº Trabajador` int(255) NOT NULL,
  `Nombre` varchar(10) NOT NULL,
  `Apellido` varchar(15) NOT NULL,
  `DNI` varchar(9) NOT NULL,
  `email` varchar(50) NOT NULL,
  `contraseña` varchar(16) NOT NULL,
  `Nº TrabajadorSupervisor` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `trabajador`
--

INSERT INTO `trabajador` (`Nº Trabajador`, `Nombre`, `Apellido`, `DNI`, `email`, `contraseña`, `Nº TrabajadorSupervisor`) VALUES
(1, 'Eduardo', 'Pastor', '12345678a', 'allamapi-1518@yopmail.com', '456123', 1),
(2, 'Niko', 'Robin', '75398421g', 'titezappall-1980@yopmail.com', '48512957', 2),
(3, 'Tanya', 'Palau', '75841239p', 'kogesinnom-4146@yopmail.com', '8536974512', 3),
(4, 'Ash', 'Ketchum', '85497845q', 'addimmeddi-3603@yopmail.com', '754129784', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `Nº Usuario` int(255) NOT NULL,
  `Nombre` varchar(10) NOT NULL,
  `Apellido` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL,
  `contraseña` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`Nº Usuario`, `Nombre`, `Apellido`, `email`, `contraseña`) VALUES
(1, 'Jimmy', 'Neutron', 'tefeffarrex-4252@yopmail.com', '5453486741'),
(2, 'Oscar', 'Hernandez', 'setukesu-4256@yopmail.com', '745884648463'),
(3, 'Jose', 'Martin', 'tetiwetahu-3015@yopmail.com', '4851296854'),
(4, 'Marta', 'Mendieta', 'sellybepit-9136@yopmail.com', '4851296854');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`ID`,`Nº Usuario`),
  ADD KEY `Nº Usuario` (`Nº Usuario`);

--
-- Indices de la tabla `comprueba`
--
ALTER TABLE `comprueba`
  ADD PRIMARY KEY (`ID`,`Nº Trabajador`),
  ADD KEY `Nº Trabajador` (`Nº Trabajador`);

--
-- Indices de la tabla `pide`
--
ALTER TABLE `pide`
  ADD PRIMARY KEY (`Nº Trabajador`,`ID`),
  ADD KEY `ID` (`ID`);

--
-- Indices de la tabla `piezas`
--
ALTER TABLE `piezas`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `supervisor`
--
ALTER TABLE `supervisor`
  ADD PRIMARY KEY (`Nº Trabajador`);

--
-- Indices de la tabla `trabajador`
--
ALTER TABLE `trabajador`
  ADD PRIMARY KEY (`Nº Trabajador`),
  ADD KEY `Nº TrabajadorSupervisor` (`Nº TrabajadorSupervisor`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`Nº Usuario`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `compra_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `piezas` (`ID`),
  ADD CONSTRAINT `compra_ibfk_2` FOREIGN KEY (`Nº Usuario`) REFERENCES `usuario` (`Nº Usuario`);

--
-- Filtros para la tabla `comprueba`
--
ALTER TABLE `comprueba`
  ADD CONSTRAINT `comprueba_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `piezas` (`ID`),
  ADD CONSTRAINT `comprueba_ibfk_2` FOREIGN KEY (`Nº Trabajador`) REFERENCES `supervisor` (`Nº Trabajador`);

--
-- Filtros para la tabla `pide`
--
ALTER TABLE `pide`
  ADD CONSTRAINT `pide_ibfk_1` FOREIGN KEY (`Nº Trabajador`) REFERENCES `trabajador` (`Nº Trabajador`),
  ADD CONSTRAINT `pide_ibfk_2` FOREIGN KEY (`ID`) REFERENCES `piezas` (`ID`);

--
-- Filtros para la tabla `trabajador`
--
ALTER TABLE `trabajador`
  ADD CONSTRAINT `trabajador_ibfk_1` FOREIGN KEY (`Nº TrabajadorSupervisor`) REFERENCES `supervisor` (`Nº Trabajador`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
