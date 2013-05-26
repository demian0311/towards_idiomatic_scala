object magic_methods {
	class ManyTimes{
		def apply(count: Int)(f: => Int) = {
			var sum = 0
			for(i <- 0 to count){
			 	sum = sum + f
			}
			sum
		}
	}
	
	val manyTimes = new ManyTimes()           //> manyTimes  : magic_methods.ManyTimes = magic_methods$ManyTimes@6b4da8f4
	manyTimes(5){
		20
	}                                         //> res0: Int = 120
	
	
	///// FUN WITH APPLY
	
	object Timer{
		def apply() = new Timer("NONAME")
		def apply(name: String) = new Timer(name)
	}
	
	class Timer(val name: String){
		def apply[A](f: => A) = {
			val start = System.currentTimeMillis()
			val returnVal = f
			val stop = System.currentTimeMillis()
			println("TIMER " + name + " took " + (stop-start) + "ms")
			
			returnVal
		}
	}
	
	val timer = Timer("FOO")                  //> timer  : magic_methods.Timer = magic_methods$$anonfun$main$1$Timer$3@603b1d0
                                                  //| 4
	timer{
		println("hello world")
		Thread.sleep(200)
	}                                         //> hello world
                                                  //| TIMER FOO took 201ms
	
	val twentyOne = timer{
		Thread.sleep(20)
		1 + 20
	}                                         //> TIMER FOO took 21ms
                                                  //| twentyOne  : Int = 21
	
	twentyOne                                 //> res1: Int = 21
	

	
}