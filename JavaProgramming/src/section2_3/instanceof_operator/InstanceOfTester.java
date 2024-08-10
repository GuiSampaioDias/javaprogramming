package section2_3.instanceof_operator;

import section2_3.MontainBike;
import section2_3.RoadBike;
import section2_3.Bicicleta;

public class InstanceOfTester {
	
	public static void main(String[] args){
	
		MontainBike  mb = new MontainBike();
		RoadBike rb1 = new RoadBike();
		
		Bicicleta mb2 = new MontainBike();
		Bicicleta rb2 = new RoadBike();
	
		Bicicleta[] bikes = new Bicicleta[5];
		bikes[0] = new MontainBike("MB001", "Aço Carbono", "Raios de Metal", 20, 18 , 25.0, "Soft");
		bikes[1] = new RoadBike("RD001", "Slim aço Carbono", "Raios de plastico", 22, 24 , 38.0, "Plug-in");
		
		for(Bicicleta temp :bikes) {
			if(temp instanceof MontainBike) {
				System.out.println(temp);
			}
		}
		
	}
	

}
