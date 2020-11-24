package MdErgo.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PersonService {
	private final PersonMapper personMapper;

	@Autowired
	public PersonService(PersonMapper personMapper){
		this.personMapper = personMapper;

	}

	public Person getPersonInfo( String personalId, String birthDate) {return personMapper.getPersonInfo( personalId, birthDate);}
}
