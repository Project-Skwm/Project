-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-06-2020 a las 10:15:12
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
  `Nombre` int(15) NOT NULL,
  `Marca` int(15) NOT NULL,
  `Precio` varchar(5) NOT NULL,
  `Cant. Tienda` int(2) NOT NULL,
  `Cant. RecomTienda` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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
