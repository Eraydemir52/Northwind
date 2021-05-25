package kodlamaio.northwind.core.utilities.results;

public class ErrorResult extends Result {

	 public ErrorResult() {
		 super(false);//Base sınıfın yani resultın constructorını çaloştırır.
	 }
	 
     public ErrorResult(String message) {
		 super(false,message);
	 }
}

