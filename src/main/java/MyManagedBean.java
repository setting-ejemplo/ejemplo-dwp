import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ManagedBean
public class MyManagedBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private String title = "Title";
	private String message = "Hello world";

}
