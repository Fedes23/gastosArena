package clases;

import clases.monto;
import clases.subeDomain;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.bindings.NotNullObservable;
import org.uqbar.arena.bindings.ObservableValue;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Control;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.xtend.ArenaXtendExtensions;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;
import org.uqbar.lacar.ui.model.TableBuilder;
import org.uqbar.lacar.ui.model.bindings.ViewObservable;

@SuppressWarnings("all")
public class subeWindow extends MainWindow<subeDomain> {
  public subeWindow() {
    super(new subeDomain());
  }
  
  public void createContents(final Panel MainPanel) {
    Panel _panel = new Panel(MainPanel);
    final Procedure1<Panel> _function = new Procedure1<Panel>() {
      public void apply(final Panel it) {
        VerticalLayout _verticalLayout = new VerticalLayout();
        it.setLayout(_verticalLayout);
      }
    };
    final Panel principal = ObjectExtensions.<Panel>operator_doubleArrow(_panel, _function);
    Panel _panel_1 = new Panel(principal);
    final Procedure1<Panel> _function_1 = new Procedure1<Panel>() {
      public void apply(final Panel it) {
        ColumnLayout _columnLayout = new ColumnLayout(3);
        it.setLayout(_columnLayout);
      }
    };
    final Panel superior = ObjectExtensions.<Panel>operator_doubleArrow(_panel_1, _function_1);
    Panel _panel_2 = new Panel(principal);
    final Procedure1<Panel> _function_2 = new Procedure1<Panel>() {
      public void apply(final Panel it) {
        VerticalLayout _verticalLayout = new VerticalLayout();
        it.setLayout(_verticalLayout);
      }
    };
    final Panel inferior = ObjectExtensions.<Panel>operator_doubleArrow(_panel_2, _function_2);
    Label _label = new Label(superior);
    _label.setText("descripcion:");
    TextBox _textBox = new TextBox(superior);
    final Procedure1<TextBox> _function_3 = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        ObservableValue<Control, ControlBuilder> _value = it.<ControlBuilder>value();
        ArenaXtendExtensions.operator_spaceship(_value, "descripcionMonto");
        it.setWidth(150);
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox, _function_3);
    Button _button = new Button(superior);
    final Procedure1<Button> _function_4 = new Procedure1<Button>() {
      public void apply(final Button it) {
        final NotNullObservable campoDescripcion = new NotNullObservable("descripcionMonto");
        final NotNullObservable campoMonto = new NotNullObservable("monto");
        it.setCaption("Agregar Gasto");
        final Action _function = new Action() {
          public void execute() {
            subeWindow.this.agregarMontoAlRepositorio();
          }
        };
        it.onClick(_function);
        it.<Object, ControlBuilder>bindEnabled(campoDescripcion);
        it.<Object, ControlBuilder>bindEnabled(campoMonto);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_4);
    Label _label_1 = new Label(superior);
    _label_1.setText("Monto:");
    NumericField _numericField = new NumericField(superior);
    final Procedure1<NumericField> _function_5 = new Procedure1<NumericField>() {
      public void apply(final NumericField it) {
        ObservableValue<Control, ControlBuilder> _value = it.<ControlBuilder>value();
        ArenaXtendExtensions.operator_spaceship(_value, "monto");
        it.setWidth(150);
      }
    };
    ObjectExtensions.<NumericField>operator_doubleArrow(_numericField, _function_5);
    Button _button_1 = new Button(superior);
    final Procedure1<Button> _function_6 = new Procedure1<Button>() {
      public void apply(final Button it) {
        final NotNullObservable campoDescripcion = new NotNullObservable("descripcionMonto");
        final NotNullObservable campoMonto = new NotNullObservable("monto");
        it.setCaption("Agregar ingreso");
        final Action _function = new Action() {
          public void execute() {
            subeWindow.this.agregarMontoAlRepositorio();
          }
        };
        it.onClick(_function);
        it.<Object, ControlBuilder>bindEnabled(campoDescripcion);
        it.<Object, ControlBuilder>bindEnabled(campoMonto);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_6);
    Table<monto> _table = new Table<monto>(inferior, monto.class);
    final Procedure1<Table<monto>> _function_7 = new Procedure1<Table<monto>>() {
      public void apply(final Table<monto> it) {
        ViewObservable<Table<monto>, TableBuilder<monto>> _items = it.items();
        ArenaXtendExtensions.operator_spaceship(_items, "listaMontos");
        ObservableValue<Control, ControlBuilder> _value = it.<ControlBuilder>value();
        ArenaXtendExtensions.operator_spaceship(_value, "montoSeleccionado");
        it.setNumberVisibleRows(4);
        Column<monto> _column = new Column<monto>(it);
        final Procedure1<Column<monto>> _function = new Procedure1<Column<monto>>() {
          public void apply(final Column<monto> it) {
            it.setTitle("Fecha");
            it.setFixedSize(200);
            it.bindContentsToProperty("fecha");
          }
        };
        ObjectExtensions.<Column<monto>>operator_doubleArrow(_column, _function);
        Column<monto> _column_1 = new Column<monto>(it);
        final Procedure1<Column<monto>> _function_1 = new Procedure1<Column<monto>>() {
          public void apply(final Column<monto> it) {
            it.setTitle("Descripción");
            it.setFixedSize(200);
            it.bindContentsToProperty("descripcion");
          }
        };
        ObjectExtensions.<Column<monto>>operator_doubleArrow(_column_1, _function_1);
        Column<monto> _column_2 = new Column<monto>(it);
        final Procedure1<Column<monto>> _function_2 = new Procedure1<Column<monto>>() {
          public void apply(final Column<monto> it) {
            it.setTitle("Monto");
            it.setFixedSize(200);
            it.bindContentsToProperty("monto");
          }
        };
        ObjectExtensions.<Column<monto>>operator_doubleArrow(_column_2, _function_2);
      }
    };
    ObjectExtensions.<Table<monto>>operator_doubleArrow(_table, _function_7);
    Panel _panel_3 = new Panel(inferior);
    final Procedure1<Panel> _function_8 = new Procedure1<Panel>() {
      public void apply(final Panel it) {
        HorizontalLayout _horizontalLayout = new HorizontalLayout();
        it.setLayout(_horizontalLayout);
      }
    };
    final Panel renglonSaldo = ObjectExtensions.<Panel>operator_doubleArrow(_panel_3, _function_8);
    Label _label_2 = new Label(renglonSaldo);
    _label_2.setText("Saldo:");
    Label _label_3 = new Label(renglonSaldo);
    final Procedure1<Label> _function_9 = new Procedure1<Label>() {
      public void apply(final Label it) {
        ObservableValue<Control, ControlBuilder> _value = it.<ControlBuilder>value();
        ArenaXtendExtensions.operator_spaceship(_value, "totalMonto");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_3, _function_9);
  }
  
  public Object agregarMontoAlRepositorio() {
    return null;
  }
  
  public static void main(final String[] args) {
    new subeWindow().startApplication();
  }
}
