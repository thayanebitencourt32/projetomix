CREATE TABLE `Aluno` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `nome` varchar(255),
  `matricula` varchar(255)
);

CREATE TABLE `Documento` (
  `id` int PRIMARY KEY,
  `nome` varchar(255),
  `tipo_atividade` varchar(255),
  `link` varchar(255),
  `qtd_horas` double,
  `status_documento` varchar(255),
  `aluno_id` int
);

ALTER TABLE `Aluno` ADD FOREIGN KEY (`id`) REFERENCES `Documento` (`aluno_id`);
