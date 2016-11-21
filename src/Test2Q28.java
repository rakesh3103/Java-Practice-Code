

class MotorVehicle implements Vehicle{
	public String describe(){ return "is a vehicle.";}
}
 class Test2Q28 extends MotorVehicle{
	public String describe(){
		return "Car is a Vehicle";
	}
	public static void main(String[] args) {
		Vehicle v = (Vehicle) new BigCar();
		System.out.println(v.describe());
	}




}
 class BigCar extends Test2Q28{
	 public String describe(){
		 return "Innova";
	 }
	 
 }