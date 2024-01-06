-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 07-Jan-2024 às 00:00
-- Versão do servidor: 10.4.32-MariaDB
-- versão do PHP: 8.2.12

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
-- Estrutura da tabela `pacotes`
--

CREATE TABLE `pacotes` (
  `id_pacote` bigint(20) NOT NULL,
  `destino` varchar(255) DEFAULT NULL,
  `valor` int(8) DEFAULT NULL,
  `desconto` int(3) DEFAULT NULL,
  `valor_total` int(8) DEFAULT NULL,
  `data_viagem` date DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `pacotes`
--

INSERT INTO `pacotes` (`id_pacote`, `destino`, `valor`, `desconto`, `valor_total`, `data_viagem`, `img`) VALUES
(1, 'Japão', 1200, 0, 1200, '2000-01-01', 'img/Japao.jpg'),
(2, 'Rio_janeiro', 1330, 0, 1330, '2000-01-01', 'img/Rio_janeiro.jpg'),
(3, 'Recife', 1000, 0, 1000, '2000-01-01', 'img/Recife.jpg'),
(4, 'Bahia', 500, 0, 500, '2015-01-01', 'img/Bahia.jpg'),
(5, 'Pariz', 1000, 0, 1000, '2024-01-01', 'img/Pariz.jpg'),
(6, 'Disney', 14200, 2, 13916, '2000-01-01', 'img/Disney_promo.jpg'),
(7, 'Agentina', 1200, 4, 1152, '2000-01-01', 'img/Agentina_promo.jpg'),
(8, 'Àfrica', 3200, 13, 2784, '2000-01-01', 'img/Africa_promo.jpg'),
(9, 'Rússia', 7200, 10, 6480, '2000-01-01', 'img/Russia_promo.jpg'),
(10, 'Itália', 14200, 30, 9940, '2000-01-01', 'img/Italia_promo.jpg'),
(11, 'Fortaleza', 10200, 10, 9180, '2000-01-01', 'img/Fortaleza_promo.jpg'),
(12, 'Maralhão', 10200, 10, 9180, '2000-01-01', 'img/Maralhao_promo.jpg'),
(13, 'Piaui', 10200, 10, 9180, '2000-01-01', 'img/Piau_promo.jpg');

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
        SET NEW.valor_total = NEW.valor - por2;

    ELSE
        SET NEW.valor_total = NEW.valor ; -- Defina como NULL se por2 for igual a zero
    END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pacotes_user`
--

CREATE TABLE `pacotes_user` (
  `id` bigint(20) NOT NULL,
  `id_pacote` int(11) DEFAULT NULL,
  `user_id` varchar(100) NOT NULL,
  `desconto` int(11) DEFAULT NULL,
  `valor` int(11) DEFAULT NULL,
  `valor_total` int(11) DEFAULT NULL,
  `data_viagem` date DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  `destino` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `pacotes_user`
--

INSERT INTO `pacotes_user` (`id`, `id_pacote`, `user_id`, `desconto`, `valor`, `valor_total`, `data_viagem`, `img`, `destino`) VALUES
(126, 5, 'fRj98yl8LCNx9blqfFhcRZh8Hts1', 0, 1000, 1000, '2024-01-01', 'img/Pariz.jpg', 'Pariz'),
(127, 2, 'fRj98yl8LCNx9blqfFhcRZh8Hts1', 0, 1330, 1330, '2000-01-01', 'img/Rio_janeiro.jpg', 'Rio_janeiro'),
(128, 1, 'fRj98yl8LCNx9blqfFhcRZh8Hts1', 0, 1200, 1200, '2000-01-01', 'img/Japao.jpg', 'Japão'),
(129, 3, 'fRj98yl8LCNx9blqfFhcRZh8Hts1', 0, 1000, 1000, '2000-01-01', 'img/Recife.jpg', 'Recife'),
(130, 2, 'fRj98yl8LCNx9blqfFhcRZh8Hts1', 0, 1330, 1330, '2000-01-01', 'img/Rio_janeiro.jpg', 'Rio_janeiro'),
(131, 3, 'fRj98yl8LCNx9blqfFhcRZh8Hts1', 0, 1000, 1000, '2000-01-01', 'img/Recife.jpg', 'Recife'),
(132, 2, 'pMYB3szYwNTqwicrHtjYmRtQaz02', 0, 1330, 1330, '2000-01-01', 'img/Rio_janeiro.jpg', 'Rio_janeiro'),
(133, 2, 'pMYB3szYwNTqwicrHtjYmRtQaz02', 0, 1330, 1330, '2000-01-01', 'img/Rio_janeiro.jpg', 'Rio_janeiro'),
(134, 1, 'fRj98yl8LCNx9blqfFhcRZh8Hts1', 0, 1200, 1200, '2000-01-01', 'img/Japao.jpg', 'Japão'),
(135, 5, 'fRj98yl8LCNx9blqfFhcRZh8Hts1', 0, 1000, 1000, '2024-01-01', 'img/Pariz.jpg', 'Pariz');

--
-- Acionadores `pacotes_user`
--
DELIMITER $$
CREATE TRIGGER `auto_complete_cliente_info` BEFORE INSERT ON `pacotes_user` FOR EACH ROW BEGIN
  DECLARE var_valor INT;
  DECLARE var_valorTotal DECIMAL(10, 2);
  DECLARE var_img VARCHAR(255);
  DECLARE var_desconto VARCHAR(255);
  DECLARE var_dataViagem DATE ;
  DECLARE var_destino VARCHAR(255);

  SELECT valor, data_viagem, destino, desconto, valor_total, img
  INTO var_valor, var_dataViagem, var_destino, var_desconto, var_valorTotal, var_img
  FROM pacotes
  WHERE pacotes.id_pacote = NEW.id_pacote;

  SET NEW.valor = var_valor;
  SET NEW.data_viagem = var_dataViagem;
  SET NEW.destino = var_destino;
  SET NEW.desconto = var_desconto;
  SET NEW.valor_total = var_valorTotal;
  SET NEW.img = var_img;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `promocao`
--

CREATE TABLE `promocao` (
  `id_pacote` bigint(20) NOT NULL,
  `data_viagem` date NOT NULL,
  `desconto` int(11) NOT NULL,
  `destino` varchar(255) DEFAULT NULL,
  `img` varchar(255) NOT NULL,
  `valor` int(11) NOT NULL,
  `valor_total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `user_id` bigint(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `senha` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`user_id`, `email`, `senha`) VALUES
(1, 'eva@gmail.com', '1234'),
(2, 'mano@gmail.com', '1234'),
(3, 'mano12@gmail.com', '1234');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `pacotes`
--
ALTER TABLE `pacotes`
  ADD PRIMARY KEY (`id_pacote`);

--
-- Índices para tabela `pacotes_user`
--
ALTER TABLE `pacotes_user`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `promocao`
--
ALTER TABLE `promocao`
  ADD PRIMARY KEY (`id_pacote`);

--
-- Índices para tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `UK_5171l57faosmj8myawaucatdw` (`email`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `pacotes`
--
ALTER TABLE `pacotes`
  MODIFY `id_pacote` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de tabela `pacotes_user`
--
ALTER TABLE `pacotes_user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=136;

--
-- AUTO_INCREMENT de tabela `promocao`
--
ALTER TABLE `promocao`
  MODIFY `id_pacote` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `usuario`
--
ALTER TABLE `usuario`
  MODIFY `user_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
