
public class Main {
//SANTA---------SINGLETON------------------------------------------------------------------	
	// public static void main(String[] args) {
	 //       System.out.println( "RESULT:" + "\n");
	  //      Santa santa = Santa.getInstance("Santa");
	//        Santa evilSanta = Santa.getIstance("Evil Santa");
	   //     System.out.println(santa.value);
		//    System.out.println(evilSanta.value);
	   // }	
//-----------------------------------------------------------------------------------------
	
//TOY---------FACTORY----------------------------------------------------------------------
	//private final static String TOY_DOLL = "Doll";
	//private final static String TOY_BICYCLE = "Bicycle";
	
	// public static void main(String[] args) {
	   //     if (args.length < 1) {
	 //           System.err.println("Expected toy type");
	 //           System.exit(-1);
	 //       }
	 //       
	  //      ToyFactory factory;
	  //      
	  //      switch (args[0]) {
     //       case TOY_DOLL: factory = new DollFactory(); break;
      //      case TOY_BICYCLE:    factory = new BicycleFactory(); break;
       //     default: throw new IllegalArgumentException("Invalid toy");
      //  }
	  //      createAndPrintToyType(factory);
  //}
	 
	// private static void createAndPrintToyType(ToyFactory factory) {
	//        Toy toy = factory.createToy();
//
	//        System.out.println(toy.getType());
	 //   }
//------------------------------------------------------------------------------

//MAGIC BOARD, SANTAS LITTLE HELPER-----OBSERVER------------------------------------------	
	//public static void main(String[] args) throws InterruptedException {
		
	//	MagicBoard t = new MagicBoard();
	//	SantasLittleHelper toyRequestObs = new SantasLittleHelper();
		
	//	t.addObserver(toyRequestObs);
		
	//	t. setToyRequest("Bicycle");
		//Thread.sleep(3000);
		
	//	t.setToyRequest("Doll");
		//Thread.sleep(3000);
		
		//t.setToyRequest("Bicycle");
		//Thread.sleep(3000);

	//}
//-------------------------------------------------------------------------------------------	
	
//TOY REQUEST-------COMMAND------------------------------------------------------------------	
	//public static void main(String[] args) {

		//RequestMinder rm = new RequestMinder(500);
		
		//ToyRequest toyRequest = new ToyRequest();
		
		//rm.addRequest(toyRequest, 3000);	
	//}

}
