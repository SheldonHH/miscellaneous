

		//Read the starting clock
		long start = System.nanoTime();
		//Read the ending clock and compute the time used for encryption
		long t = System.nanoTime()-start;
		//Convert nanosecond to millisecond
        float milli=(float)(t*Math.pow(10,-6));
		

        System.out.println("Time taken:"+milli+" milliseconds");
