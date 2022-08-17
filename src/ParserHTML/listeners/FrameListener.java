package ParserHTML.listeners;


import ParserHTML.View;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameListener extends WindowAdapter{
    private View view;

    public FrameListener(View view){
        this.view = view;
    }

    public void windowClosing(WindowEvent windowEvent){
        //Вызывается, когда окно находится в процессе закрытия.
        view.exit();
    }
}
