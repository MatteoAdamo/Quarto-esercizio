 public class datiTrapezio{
	 
	int baseA;
	int baseB;
	int baseC;
	int baseD;
	
	public datiTrapezio(int baseA, int baseB, int baseC, int baseD, int l5) {
		super();
		this.baseA = baseA;
		this.baseB = baseB;
		this.baseC = baseC;
		this.baseD = baseD;
	}
	
	public int Cperimetro(int baseA, int baseB, int baseC, int baseD) {
		int perimetro=0;
		perimetro=baseA+baseB+baseC+baseD;
		return perimetro;
	}
	public int Carea(int baseA, int baseB, int baseC, int baseD, int h) {
		int area=0;
		area=(baseA+baseB)*h/2;
		return area;
	}
}