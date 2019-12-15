package gof.state.demo1;

public class MiddleState extends AbstractState {

	public MiddleState(AbstractState as) {
		sc = as.sc;
		stateName = "中等";
		score = as.score;
	}
	
	@Override
	public void checkState() {
		if(score >= 90) {
			sc.setState(new HighState(this));
        } else if(score < 60) {
        	sc.setState(new LowState(this));
        }
	}
}
