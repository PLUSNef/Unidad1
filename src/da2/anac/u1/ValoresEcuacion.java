package da2.anac.u1;

import java.io.Serializable;

public class ValoresEcuacion implements Serializable{
	private double x;
	private double y;
	private double res;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getRes() {
		res = (x * y) + (x * (-5))+ (4 * y) + (4 * (-5));
		return res;
	}
	public void setRes(double res) {
		this.res = res;
	}
	
	
}
