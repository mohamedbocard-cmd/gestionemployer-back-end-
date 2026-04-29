package sn.emploie.gestionemployer.model;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "students") //creer une collection
public class Student {
	@MongoId
	private int sId;
	
	@Field(name = "sName")
	private String sName;
	
	@Field(name = "sPrenom")
	private String sPrenom;
	
	@Field(name = "sEmail")
	private String sEmail;

	@Field(name = "sTelephonne")
	private String sTelephonne;
	

}
