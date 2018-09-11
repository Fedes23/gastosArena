package clases

import java.time.LocalDateTime
import org.uqbar.commons.model.annotations.TransactionalAndObservable
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
@TransactionalAndObservable
class monto {
	LocalDateTime fecha
	int monto
	String descripcion
	int gastoExcesivo = 2000 
	
	
	def getMonto(){
		return monto
	} 







}
