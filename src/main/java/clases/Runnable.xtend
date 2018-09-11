package clases

import org.uqbar.arena.Application

class Runnable extends Application {

	new(repoBoostrap boostrap) {
		new (repoBoostrap boostrap)
		super(bootstrap)
	}
	
	def static main(String[] args) {
		
		new Runnable(new repoBoostrap).start()
	}
	
	
	override protected createMainWindow() {
//		return new subeWindow(this)
	}
	

	
}