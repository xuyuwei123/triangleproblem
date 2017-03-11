package tproblem.xu;

public class TriangleProblem {
	public char triangle(int a, int b,int c){
		if( a+b>c&&a+c>b&&b+c>a&&a>0&&b>0&&c>0){
			if(a==b&&b==c){
				return 'e';
			}
			else if(a==b||b==c||a==c){
				return 'i';
			}
			else{
				return 's';
			}
		}
			return 'n';
    }
}
