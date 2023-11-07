package in.co.elearning.form;


import javax.validation.constraints.NotEmpty;

import in.co.elearning.dto.BaseDTO;
import in.co.elearning.dto.UserDTO;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ForgetPasswordForm extends BaseForm {

	@NotEmpty(message = "Login Id is required")
	private String login;
	
	@Override
	public BaseDTO getDTO() {
		UserDTO dto = new UserDTO();
		dto.setLogin(login);
		bean.setId(id);
		bean.setTitle(title);
		bean.setDescription(description);
		bean.setCreatedBy(createdBy);
		bean.setModifiedBy(modifiedBy);
		bean.setCreatedDatetime(createdDateTime);
		bean.setModifiedDatetime(modifiedDateTime);
		return dto;
	}

	@Override
	public void populate(BaseDTO bDto) {
		
	}

}
