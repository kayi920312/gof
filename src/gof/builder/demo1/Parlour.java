package gof.builder.demo1;
/**
 * 产品
 * @author kayi9
 *
 */
public class Parlour {

	private String wall;    //墙
    private String TV;    //电视
    private String sofa;    //沙发  
	public String getWall() {
		return wall;
	}
	public void setWall(String wall) {
		this.wall = wall;
	}
	public String getTV() {
		return TV;
	}
	public void setTV(String tV) {
		TV = tV;
	}
	public String getSofa() {
		return sofa;
	}
	public void setSofa(String sofa) {
		this.sofa = sofa;
	}
	public String show() {
		return "Parlour [wall=" + wall + ", TV=" + TV + ", sofa=" + sofa + "]";
	}
    
}
