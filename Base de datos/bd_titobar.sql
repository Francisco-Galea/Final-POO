-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-11-2023 a las 01:41:49
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_titobar`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mercaderia`
--

CREATE TABLE `mercaderia` (
  `ID` int(255) NOT NULL,
  `Nombre` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `Categoria` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `Costo` double(10,2) NOT NULL,
  `Precio` double(10,2) NOT NULL,
  `Stock` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Es una tabla para cargar los Productos';

--
-- Volcado de datos para la tabla `mercaderia`
--

INSERT INTO `mercaderia` (`ID`, `Nombre`, `Categoria`, `Costo`, `Precio`, `Stock`) VALUES
(35, 'Milanesa de pollo', 'Carnes', 1500.00, 3300.00, 15);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesa`
--

CREATE TABLE `mesa` (
  `idMesa` int(11) NOT NULL,
  `numeroMesa` int(11) NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `mesa`
--

INSERT INTO `mesa` (`idMesa`, `numeroMesa`, `activo`) VALUES
(1, 1, 1),
(2, 1, 1),
(3, 2, 1),
(4, 3, 1),
(6, 1, 1),
(7, 2, 1),
(8, 3, 1),
(9, 1, 1),
(14, 1, 1),
(15, 2, 1),
(16, 1, 1),
(17, 2, 1),
(18, 1, 1),
(19, 1, 1),
(20, 2, 1),
(21, 1, 1),
(28, 2, 1),
(30, 2, 1),
(33, 3, 1),
(36, 2, 1),
(38, 2, 1),
(39, 1, 1),
(42, 4, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `mercaderia`
--
ALTER TABLE `mercaderia`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `mesa`
--
ALTER TABLE `mesa`
  ADD PRIMARY KEY (`idMesa`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `mercaderia`
--
ALTER TABLE `mercaderia`
  MODIFY `ID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT de la tabla `mesa`
--
ALTER TABLE `mesa`
  MODIFY `idMesa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
