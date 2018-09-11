package clases

import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.arena.layout.ColumnLayout
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.TextBox
import static extension org.uqbar.arena.xtend.ArenaXtendExtensions.*
import org.uqbar.arena.windows.MainWindow
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.bindings.NotNullObservable
import org.uqbar.arena.widgets.NumericField
import org.uqbar.arena.widgets.tables.Table
import org.uqbar.arena.widgets.tables.Column
import java.awt.Color

class subeWindow extends MainWindow<subeDomain> {	
	new() {
		super (new subeDomain)
	}
	
	override createContents (Panel MainPanel){
		
///////////////////VENTANAS///////////////////
		val principal = new Panel(MainPanel) =>[
			layout = new VerticalLayout()
		]
		val superior = new Panel(principal) =>[
			layout = new ColumnLayout(3)
		]
		val inferior = new Panel(principal) =>[
			layout = new VerticalLayout()
		]
//////////////////////////////////////////////		
///////////////////PARTE SUPERIOR/////////////

		new Label(superior).text = 'descripcion:'
		
		new TextBox(superior) =>[
			value <=> 'descripcionMonto'
			width = 150
		]	
		
		new Button(superior) =>[
			val campoDescripcion = new NotNullObservable('descripcionMonto')
			val campoMonto = new NotNullObservable ('monto')
			caption ='Agregar Gasto'
			onClick [|this.agregarMontoAlRepositorio()]
			bindEnabled(campoDescripcion)
			bindEnabled(campoMonto)
		]
		
		new Label(superior).text ='Monto:'
		
		new NumericField(superior) =>[
			value <=> 'monto'
			width = 150
		]
		
		new Button(superior)=>[
			val campoDescripcion = new NotNullObservable('descripcionMonto')
			val campoMonto = new NotNullObservable ('monto')
			caption = 'Agregar ingreso'
			onClick [|this.agregarMontoAlRepositorio()]
			bindEnabled(campoDescripcion)
			bindEnabled(campoMonto)
		]
//////////////////////////////////////////////		
///////////////////PARTE INFERIOR/////////////		
		
		new Table (inferior, typeof(monto)) =>[
			items <=> 'listaMontos'
			value <=> 'montoSeleccionado'
			numberVisibleRows = 4
			
		new Column<monto>(it) =>[
			title = 'Fecha'
			fixedSize = 200
			bindContentsToProperty('fecha')
		]
		
		new Column<monto>(it) =>[
			title = 'Descripción'
			fixedSize = 200
			bindContentsToProperty ('descripcion')
			]
		
		new Column <monto>(it) =>[
			title = 'Monto'
			fixedSize = 200
			bindContentsToProperty ('monto')
		]
		
		]
		
		val renglonSaldo = new Panel(inferior) =>[
			layout = new HorizontalLayout()
		]
		
		
		new Label(renglonSaldo).text = 'Saldo:'
		
		new Label(renglonSaldo) =>[
			value <=> 'totalMonto'			
		]
		
		
	}
	
	def agregarMontoAlRepositorio() {
		
		
	}
	
	def static main(String[] args) {
		new subeWindow().startApplication
	}
}