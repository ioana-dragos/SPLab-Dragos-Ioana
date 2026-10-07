package clase;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        String text = paragraph.getText();
        int spatii = (30 - text.length()) / 2;

        for (int i = 0; i < spatii; i++) {
            System.out.print(" ");
        }

        System.out.println(text);
    }
}