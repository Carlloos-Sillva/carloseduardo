package carloseduardo.dao;

import org.springframework.stereotype.Repository;

import carloseduardo.domain.Empresa;

@Repository
public class EmpresaDaoImpl extends AbstractDao<Empresa, Long> implements EmpresaDao {
}