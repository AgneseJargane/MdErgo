package MdErgo.person;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/person")
public class PersonController {
private final PersonService personService;

@Autowired
	public PersonController(PersonService personService) {
	this.personService = personService;
}

	@GetMapping("/getPersonInfo")
	public Person getPersonInfo ( @RequestParam("personalId") String personalId, @RequestParam ("birthDate")
			String birthDate) {
		return personService.getPersonInfo( personalId, birthDate);
	}


}
