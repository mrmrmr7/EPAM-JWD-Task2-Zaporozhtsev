package parsers;

import java.time.ZonedDateTime;

public enum Regex {
    PARAGRAPH {
        public String toString() {
            return "    ";
        }
    },

    SENTENCE {
        public String toString() {
            return ".";
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
