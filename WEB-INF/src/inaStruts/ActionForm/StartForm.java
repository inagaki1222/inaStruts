package inaStruts.ActionForm;

import org.apache.struts.validator.ValidatorForm;

public class StartForm extends ValidatorForm{
	
	private String inputId = null;
	
	private String inputName = null;

	public StartForm(){
	  super();
	  System.out.println("StartForm");	  
	}

	public String getInputId() {
		return inputId;
	}

	public void setInputId(String inputId) {
		this.inputId = inputId;
	}

	public String getInputName() {
		return inputName;
	}

	public void setInputName(String inputName) {
		this.inputName = inputName;
	}
}