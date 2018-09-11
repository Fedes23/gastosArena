package clases;

import clases.monto;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.annotations.TransactionalAndObservable;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class subeDomain {
  private String descripcionMonto;
  
  private int monto;
  
  private List<monto> listaMontos = new ArrayList<monto>();
  
  private monto montoSeleccionado;
  
  private int totalMonto;
  
  public Object getTotalMonto() {
    return null;
  }
  
  @Pure
  public String getDescripcionMonto() {
    return this.descripcionMonto;
  }
  
  public void setDescripcionMonto(final String descripcionMonto) {
    this.descripcionMonto = descripcionMonto;
  }
  
  @Pure
  public int getMonto() {
    return this.monto;
  }
  
  public void setMonto(final int monto) {
    this.monto = monto;
  }
  
  @Pure
  public List<monto> getListaMontos() {
    return this.listaMontos;
  }
  
  public void setListaMontos(final List<monto> listaMontos) {
    this.listaMontos = listaMontos;
  }
  
  @Pure
  public monto getMontoSeleccionado() {
    return this.montoSeleccionado;
  }
  
  public void setMontoSeleccionado(final monto montoSeleccionado) {
    this.montoSeleccionado = montoSeleccionado;
  }
  
  public void setTotalMonto(final int totalMonto) {
    this.totalMonto = totalMonto;
  }
}
