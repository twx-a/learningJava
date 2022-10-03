package secondProject;

public class objModel {

    private int num; // instance variable

    public objModel(int input) {
	// instance variable = to input passed
	// TODO Auto-generated constructor stub
	this.num = input;
    }

    void countEachNum() {
	for (int i = 0; i < num; i++) {
	    System.out.printf("is %d a prime number? ", i).println(isPrime(i));
	}
    }

    public boolean isPrime(int prime) {

	for (int i = 2; i <= prime - 1; i++) {
	    if (prime % i == 0) {
		return false;
	    }
	}
	return true;
    }

    void connected(){
	System.out.println("Connected to View, Hello from Model");
    }
}
