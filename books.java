public class books{
	String year;
	String title;
	String author;
	int code;
	double price;
	
	

	private enum Status{
	pub,
	buy,
	sent,
	delivered;
	}
	Status status;

	private void make(String title, String author){
	this.title = title;
	this.author = author;
	}

	private void pub(String year, double price, int code){
	this.year = year;
	this.price = price;
	this.code = code;
	}
	
                public static void main(String[] args){
                        books c1 = new books();
                        c1.author= new String("Julio");
                        c1.title = new String("memorias da casa dos mortos");
                        c1.year = new String("31/12/2005");
                        c1.price = 22.99;
                        c1.code = 720;
			c1.status = Status.pub;
                        System.out.println(c1.title);
                        System.out.println(c1.author);
                        System.out.println(c1.year);
                        System.out.println(c1.price);
                        System.out.println(c1.code);
			System.out.println(c1.status);
			c1.status = Status.buy;
			c1.make("Quincas Borba", "Edgar Allan Poe");
			c1.pub("23/05/1878", 55.89, 688);
			System.out.println(c1.title);
                        System.out.println(c1.author);
                        System.out.println(c1.year);
                        System.out.println(c1.price);
                        System.out.println(c1.code);

			
}


}
