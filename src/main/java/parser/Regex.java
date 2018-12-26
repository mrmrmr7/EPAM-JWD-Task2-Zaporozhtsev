package parser;

public enum Regex {
    PARAGRAPH {
        public String toString() {
            return "    ";
        }
    },

    SENTENCE {
        public String toString() {
            return "g";
        }
    },

    LITERAL {
        public String toString() {
            return " ";
        }
    },

    WORD {
        public String toString() {
            return "-";
        }
    };
}
