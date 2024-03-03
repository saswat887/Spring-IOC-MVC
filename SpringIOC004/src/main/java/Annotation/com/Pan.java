package Annotation.com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pan {
	@Value("101")
	private int id;
	@Value("CNTPN856K")
	private String panid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPanid() {
		return panid;
	}
	public void setPanid(String panid) {
		this.panid = panid;
	}

}
