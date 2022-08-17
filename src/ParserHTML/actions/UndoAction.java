package ParserHTML.actions;


import ParserHTML.View;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;

public class UndoAction extends AbstractAction{
    //Класс отмены действия
    private View view;

    public UndoAction(View view){
        this.view = view;
    }

    public void actionPerformed(ActionEvent actionEvent){
        view.undo();
    }
}
