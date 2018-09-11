package clases;

import clases.subeDomain;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.bindings.ObservableValue;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Control;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.xtend.ArenaXtendExtensions;
import org.uqbar.lacar.ui.model.ControlBuilder;

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
        HorizontalLayout _horizontalLayout = new HorizontalLayout();
        it.setLayout(_horizontalLayout);
      }
    };
    final Panel inferior = ObjectExtensions.<Panel>operator_doubleArrow(_panel_2, _function_2);
    Label _label = new Label(superior);
    _label.setText("descripcion");
    TextBox _textBox = new TextBox(superior);
    final Procedure1<TextBox> _function_3 = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        ObservableValue<Control, ControlBuilder> _value = it.<ControlBuilder>value();
        ArenaXtendExtensions.operator_spaceship(_value, "descripcionMonto");
        it.setWidth(150);
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox, _function_3);
  }
  
  public static void main(final String[] args) {
    new subeWindow().startApplication();
  }
}
