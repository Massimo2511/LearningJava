package com.start.learn.employeeinheritancehuman;

public enum Occupation {

    DIRECTOR("DIRECTOR"),
    HR("hr"),
    DEVELOPER("developer"),
    TESTER("tester"),
    PRODUCT_OWNER("product owner","business analyst");

    private String mainOccupation;
    private String additionalOccupation;

    private Occupation(String mainOccupation) {
        this.mainOccupation = mainOccupation;
    }

    private Occupation(String mainOccupation, String additionalOccupation) {
        this(mainOccupation);
        this.additionalOccupation =additionalOccupation;
    }

    public String getMainOccupation() {
        return mainOccupation;
    }

    public String getAdditionalOccupation() {
        return additionalOccupation;
    }

    public static Occupation fromString(String text) {
        if (text != null) {
            for (Occupation value : values()) {
                if (text.equalsIgnoreCase(value.mainOccupation)|text.equalsIgnoreCase(value.additionalOccupation)) {
                    return value;
                }
            }
        }
        return null;
    }
}
