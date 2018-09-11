package clases

import java.util.ArrayList
import java.util.List
import org.uqbar.commons.model.annotations.TransactionalAndObservable
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
@TransactionalAndObservable
class subeDomain {
	String descripcionMonto
	int monto
	List <monto> listaMontos = new ArrayList
	monto montoSeleccionado
	int totalMonto
	
	
	
	def getTotalMonto(){}

	
}