package problem02;

public class MyService extends BaseService {
	String start = "서비스시작";
	public String afternoon() {
		return "오후";
	}
	
	@Override
	public void service(String state) {
		String result = "" ;
		if(state == "낮") {
			result = super.day() + start;
		} else if (state == "오후") {
			result = afternoon() + start;
		} else if (state == "밤") {
			result = super.night() + start; 
		}
		System.out.println(result);
	}
}
