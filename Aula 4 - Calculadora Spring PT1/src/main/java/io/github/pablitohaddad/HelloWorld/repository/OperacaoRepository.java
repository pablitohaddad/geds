package io.github.pablitohaddad.HelloWorld.repository;

import io.github.pablitohaddad.HelloWorld.model.Operacao;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OperacaoRepository extends MongoRepository<Operacao, String> {

}
