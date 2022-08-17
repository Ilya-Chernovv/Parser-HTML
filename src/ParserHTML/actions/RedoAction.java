package ParserHTML.actions;


import ParserHTML.View;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class RedoAction extends AbstractAction {
    //Класс возврата действия
    private View view;

    public RedoAction(View view){
        this.view = view;
    }

    public void actionPerformed(ActionEvent actionEvent){
        view.redo();
    }
}
