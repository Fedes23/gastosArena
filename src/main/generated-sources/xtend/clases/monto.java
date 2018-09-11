package clases;

import java.time.LocalDateTime;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.annotations.TransactionalAndObservable;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class monto {
  private LocalDateTime fecha;
  
  private int monto;
  
  private String descripcion;
  
  private int gastoExcesivo = 2000;
  
  public int getMonto() {
    return this.monto;
  }
  
  @Pure
  public LocalDateTime getFecha() {
    return this.fecha;
  }
  
  public void setFecha(final LocalDateTime fecha) {
    this.fecha = fecha;
  }
  
  public void setMonto(final int monto) {
    this.monto = monto;
  }
  
  @Pure
  public String getDescripcion() {
    return this.descripcion;
  }
  
  public void setDescripcion(final String descripcion) {
    this.descripcion = descripcion;
  }
  
  @Pure
  public int getGastoExcesivo() {
    return this.gastoExcesivo;
  }
  
  public void setGastoExcesivo(final int gastoExcesivo) {
    this.gastoExcesivo = gastoExcesivo;
  }
}
