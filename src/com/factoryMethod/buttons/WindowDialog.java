package com.factoryMethod.buttons;

import com.factoryMethod.factory.Button;
import com.factoryMethod.factory.WindowsButton;

public class WindowDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
