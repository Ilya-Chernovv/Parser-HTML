package ParserHTML.listeners;

import ParserHTML.View;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TabbedPaneChangeListener implements ChangeListener{
    //Этот класс будет слушать и обрабатывать изменения состояния панели вкладок.
    private View view;

    public TabbedPaneChangeListener(View view){
        this.view = view;
    }

    public void stateChanged(ChangeEvent e){
        view.selectedTabChanged();
    }
}
