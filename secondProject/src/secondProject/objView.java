package secondProject;

public class objView {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Init view");
	// objModel myBox = new objModel();
	// myBox.connected();
	int inputNum = 10;
	objModel userNum = new objModel(inputNum);
	userNum.connected();
	boolean isPrime = userNum.isPrime(inputNum);
	System.out.printf("is %d a prime number? ", inputNum).println(isPrime);
	// count up and return
	userNum.countEachNum();
    }

}
