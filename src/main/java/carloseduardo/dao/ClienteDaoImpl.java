package carloseduardo.dao;

import org.springframework.stereotype.Repository;

import carloseduardo.domain.Cliente;

@Repository
public class ClienteDaoImpl extends AbstractDao<Cliente, Long> implements ClienteDao {

}