alter table pacientes add ativos tinyint;
update pacientes set ativos = 1;
