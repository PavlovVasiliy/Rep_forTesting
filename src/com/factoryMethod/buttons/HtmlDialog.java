package com.factoryMethod.buttons;

import com.factoryMethod.factory.Button;
import com.factoryMethod.factory.HtmlButton;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
