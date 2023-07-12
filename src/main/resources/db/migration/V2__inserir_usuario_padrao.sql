insert into usuario
(login, cpf, data_nascimento, email, nome, telefone, senha, status, alteracao, grupo_acesso)
values
('admin', '617.946.200-36', '1976-05-10', 'admin.admin@loglab.com.br',
 'Nome do administrador', '(65) 99999-9999', '$2a$12$zarkUgsWQlcWkLTgafN8cODfi23PoAKpJTHoKojQnPwb5WThKaaIG',
 'ATIVO', NOW(), 'COORDENADOR');