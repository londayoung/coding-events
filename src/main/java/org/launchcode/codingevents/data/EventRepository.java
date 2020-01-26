package org.launchcode.codingevents.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//import org.w3c.dom.events.Event;
import org.launchcode.codingevents.models.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
}
