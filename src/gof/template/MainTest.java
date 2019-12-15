package gof.template;

import gof.template.demo1.StudyAbroad;
import gof.template.demo1.StudyInAmerica;

public class MainTest {

	public static void main(String[] args) {
		StudyAbroad tm = new StudyInAmerica();
        tm.TemplateMethod();
	}

}
