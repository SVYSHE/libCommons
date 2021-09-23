package svyshe.com.github.libcommons.libformats.csv;

public enum CSVDelimiter {
    COMMA(","),
    SEMICOLON(";"),
    TAB("\t");

    CharSequence character;

    CSVDelimiter(CharSequence character) {
        this.character = character;
    }
}
