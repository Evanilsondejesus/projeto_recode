-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 02-Nov-2023 às 16:07
-- Versão do servidor: 10.4.28-MariaDB
-- versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `agenciaviagem`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `contato_oferta`
--

CREATE TABLE `contato_oferta` (
  `email` varchar(255) DEFAULT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `contato_oferta`
--

INSERT INTO `contato_oferta` (`email`, `id`) VALUES
(NULL, 1),
('evaevanilson@gmail.com', 2),
('poliana@gmail.com', 3),
('testeoaraver@gmail.com', 4),
('evaevanilson@gmail.com', 5),
('evaevanilson@gmail.com', 6);

-- --------------------------------------------------------

--
-- Estrutura da tabela `pacotes`
--

CREATE TABLE `pacotes` (
  `destino` varchar(255) DEFAULT NULL,
  `valor` int(8) DEFAULT NULL,
  `desconto` int(3) DEFAULT NULL,
  `valorTotal` int(11) DEFAULT NULL,
  `dataViagem` date DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  `id_pacote` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `pacotes`
--

INSERT INTO `pacotes` (`destino`, `valor`, `desconto`, `valorTotal`, `dataViagem`, `img`, `id_pacote`) VALUES
('Japão', 1200, 0, 1200, '2000-01-01', 'img/Japao.jpg', 1),
('Rio_janeiro', 1330, 0, 1330, '2000-01-01', 'img/Rio_janeiro.jpg', 2),
('Recife', 1000, 0, 1000, '2000-01-01', 'img/Recife.jpg', 3),
('Bahia', 500, 0, 500, '2015-01-01', 'img/Bahia.jpg', 4),
('Pariz', 1000, 0, 1000, '2024-01-01', 'img/Pariz.jpg', 5),
('Disney', 14200, 2, 1176, '2000-01-01', 'img/Disney_promo.jpg', 6),
('Agentina', 1200, 4, 1152, '2000-01-01', 'img/Agentina_promo.jpg', 7),
('Àfrica', 3200, 13, 1044, '2000-01-01', 'img/Africa_promo.jpg', 8),
('Rússia', 7200, 10, 1116, '2000-01-01', 'img/Russia_promo.jpg', 9),
('Itália', 14200, 30, 1152, '2000-01-01', 'img/Italia_promo.jpg', 10),
('Fortaleza', 10200, 10, 9180, '2000-01-01', 'img/Fortaleza_promo.jpg', 11),
('Maralhão', 10200, 10, 9180, '2000-01-01', 'img/Maralhao_promo.jpg', 12),
('Piaui', 10200, 10, 9180, '2000-01-01', 'img/Piau_promo.jpg', 13);

--
-- Acionadores `pacotes`
--
DELIMITER $$
CREATE TRIGGER `calculo_porcentage` BEFORE INSERT ON `pacotes` FOR EACH ROW BEGIN
    DECLARE por1 DECIMAL(10, 2);
    DECLARE por2 DECIMAL(10, 2);
   
    SET por1 := CAST((NEW.desconto / 100) AS DECIMAL(10, 2)); 
    SET por2 := CAST((por1 * NEW.valor) AS DECIMAL(10, 2));
    

   IF por2 != 0 THEN
        SET NEW.valorTotal = NEW.valor - por2;

    ELSE
        SET NEW.valorTotal = NEW.valor ; -- Defina como NULL se por2 for igual a zero
    END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pacotesuser`
--

CREATE TABLE `pacotesuser` (
  `id` int(11) NOT NULL,
  `userID` int(11) DEFAULT NULL,
  `id_pacote` int(11) DEFAULT NULL,
  `desconto` varchar(255) DEFAULT NULL,
  `valor` int(11) DEFAULT NULL,
  `valorTotal` int(11) DEFAULT NULL,
  `dataViagem` date DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  `destino` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `pacotesuser`
--

INSERT INTO `pacotesuser` (`id`, `userID`, `id_pacote`, `desconto`, `valor`, `valorTotal`, `dataViagem`, `img`, `destino`) VALUES
(28, 4, 7, '4', 1200, 1152, '2000-01-01', 'img/Agentina_promo.jpg', 'Agentina'),
(42, 4, 9, '10', 7200, 1116, '2000-01-01', 'img/Russia_promo.jpg', 'Rússia'),
(61, 4, 2, '0', 1330, 1330, '2000-01-01', 'img/Rio_janeiro.jpg', 'Rio_janeiro'),
(62, 6, 2, '0', 1330, 1330, '2000-01-01', 'img/Rio_janeiro.jpg', 'Rio_janeiro'),
(63, 6, 9, '10', 7200, 1116, '2000-01-01', 'img/Russia_promo.jpg', 'Rússia'),
(64, 6, 6, '2', 14200, 1176, '2000-01-01', 'img/Disney_promo.jpg', 'Disney'),
(65, 6, 3, '0', 1000, 1000, '2000-01-01', 'img/Recife.jpg', 'Recife'),
(74, 1, 9, '10', 7200, 1116, '2000-01-01', 'img/Russia_promo.jpg', 'Rússia'),
(78, 12, 9, '10', 7200, 1116, '2000-01-01', 'img/Russia_promo.jpg', 'Rússia'),
(80, 1, 2, '0', 1330, 1330, '2000-01-01', 'img/Rio_janeiro.jpg', 'Rio_janeiro'),
(81, 14, 2, '0', 1330, 1330, '2000-01-01', 'img/Rio_janeiro.jpg', 'Rio_janeiro'),
(84, 14, 9, '10', 7200, 1116, '2000-01-01', 'img/Russia_promo.jpg', 'Rússia'),
(86, 15, 3, '0', 1000, 1000, '2000-01-01', 'img/Recife.jpg', 'Recife'),
(87, 15, 4, '0', 500, 500, '2015-01-01', 'img/Bahia.jpg', 'Bahia');

--
-- Acionadores `pacotesuser`
--
DELIMITER $$
CREATE TRIGGER `auto_complete_cliente_info` BEFORE INSERT ON `pacotesuser` FOR EACH ROW BEGIN
  DECLARE var_valor INT;
  DECLARE var_valorTotal DECIMAL(10, 2);
  DECLARE var_img VARCHAR(255);
  DECLARE var_desconto VARCHAR(255);
  DECLARE var_dataViagem DATE ;
  DECLARE var_destino VARCHAR(255);

  SELECT valor, dataViagem, destino, desconto, valorTotal, img
  INTO var_valor, var_dataViagem, var_destino, var_desconto, var_valorTotal, var_img
  FROM pacotes
  WHERE pacotes.id_pacote = NEW.id_pacote;

  SET NEW.valor = var_valor;
  SET NEW.dataViagem = var_dataViagem;
  SET NEW.destino = var_destino;
  SET NEW.desconto = var_desconto;
  SET NEW.valorTotal = var_valorTotal;
  SET NEW.img = var_img;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `email` varchar(255) NOT NULL,
  `senha` varchar(8) DEFAULT NULL,
  `userID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `usuarios`
--

INSERT INTO `usuarios` (`email`, `senha`, `userID`) VALUES
('evaevanilson@gmail.com', '1234', 1),
('teste@gmail.com', '1233', 4),
('poliana@gmail.com', '1233', 5),
('novo@gmail.com', '1233', 6),
('evaevanilsoasssn@gmail.com', '1234', 10),
('polina12@gmail.com', '1234', 12),
('testenddseeed@gmail.com', '1234', 14),
('testenddd@gmail.com', '1234', 15);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `contato_oferta`
--
ALTER TABLE `contato_oferta`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `pacotes`
--
ALTER TABLE `pacotes`
  ADD PRIMARY KEY (`id_pacote`);

--
-- Índices para tabela `pacotesuser`
--
ALTER TABLE `pacotesuser`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `unique_user_pacote` (`userID`,`id_pacote`),
  ADD KEY `id_pacote` (`id_pacote`);

--
-- Índices para tabela `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`userID`),
  ADD UNIQUE KEY `email` (`email`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `contato_oferta`
--
ALTER TABLE `contato_oferta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `pacotes`
--
ALTER TABLE `pacotes`
  MODIFY `id_pacote` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de tabela `pacotesuser`
--
ALTER TABLE `pacotesuser`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=88;

--
-- AUTO_INCREMENT de tabela `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `userID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `pacotesuser`
--
ALTER TABLE `pacotesuser`
  ADD CONSTRAINT `pacotesuser_ibfk_1` FOREIGN KEY (`id_pacote`) REFERENCES `pacotes` (`id_pacote`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
