package printenum;

public enum generalInformation {
    NAME {
        @Override
        public String toString() {
            return "Name";
        }
    },
    EDUCATION {
        @Override
        public String toString() {
            return "Education";
        }
    },
    EMAIL {
        @Override
        public String toString() {
            return "Email";
        }
    },
    PROFESSION {
        @Override
        public String toString() {
            return "Profession";
        }
    },
    PHONE {
        @Override
        public String toString() {
            return "Phone";
        }
    }
}
