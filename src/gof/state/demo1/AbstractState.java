package gof.state.demo1;

public abstract class AbstractState {

	protected ScoreContext sc;
	protected String stateName;
	protected int score;
	
	public abstract void checkState();
	
	public void addScore(int score) {
		this.score += score;
		System.out.print("加上：" + score + "分，当前分数：" + score );
		checkState();
		System.out.println("分，当前状态：" + sc.getState().stateName);
	};
}
