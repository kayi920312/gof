package gof.state.demo1;

public class LowState extends AbstractState {

	public LowState(ScoreContext scoreContext) {
		sc = scoreContext;
		stateName = "不及格";
		score = 0;
	}
	
	public LowState(AbstractState as) {
		sc = as.sc;
		stateName = "不及格";
		score = as.score;
	}
	
	@Override
	public void checkState() {
		if(score>=90) {
			sc.setState(new HighState(this));
        } else if(score>=60) {
        	sc.setState(new MiddleState(this));
        }
	}
}
