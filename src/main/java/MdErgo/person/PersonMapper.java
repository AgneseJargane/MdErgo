package MdErgo.person;

import java.util.Date;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PersonMapper {

	Person getPersonInfo (@Param("personalId") String personalId, @Param("birthDate") String birthDate);
}
