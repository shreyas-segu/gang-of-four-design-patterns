package prototype;

public class Button {
    protected String buttonColor;
    protected String buttonName;

    public Button(String color, String name) {
        this.buttonColor = color;
        this.buttonName = name;
    }

    // Copy Constructor
    public Button(Button button) {
        this.buttonColor = button.buttonColor;
        this.buttonName = button.buttonName;
    }

    public static Button newInstance(Button button) {
        return new Button(button);
    }
}
