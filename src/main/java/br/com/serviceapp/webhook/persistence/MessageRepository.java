package br.com.serviceapp.webhook.persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.serviceapp.webhook.model.Destination;
import br.com.serviceapp.webhook.model.Message;

public interface MessageRepository extends CrudRepository<Message, Long> {

	List<Message> findAllByDestinationOrderByIdAsc(Destination destination);

}
