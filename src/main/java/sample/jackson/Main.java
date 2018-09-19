package sample.jackson;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

public class Main {

	public static void main(String[] args) throws JsonProcessingException {
		
		ObjectMapper om = new ObjectMapper();
		
		JavaTimeModule jtm = new JavaTimeModule();
		
		om.registerModule(jtm);
		
		jtm.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
		
		/*
		 * その他、LocalDateTime,LocalTime等のjava.time.*にそれぞれも同様に追記可能
		 */
		
		SampleObj obj = new SampleObj(1, "hoge", LocalDateTime.now());
		
		String serializedObj = om.writeValueAsString(obj);
		
		System.out.println(serializedObj);

	}

}
