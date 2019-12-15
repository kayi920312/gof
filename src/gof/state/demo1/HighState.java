package gof.state.demo1;

public class HighState extends AbstractState {

	public HighState(AbstractState as) {
		sc = as.sc;
		stateName = "优秀";
		score = as.score;
	}
	
	@Override
	public void checkState() {
		if(score < 60) {
        	sc.setState(new LowState(this));
        } else if(score < 90) {
			sc.setState(new MiddleState(this));
        }
	}
}
