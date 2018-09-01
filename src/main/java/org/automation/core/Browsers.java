package org.automation.core;

public enum Browsers {
    FIREFOX("firefox"), CHROME("chrome"), IE("ie");
    private String name;

    public String getName() {
        return name;
    }

    Browsers(String name) {
        this.name = name;
    }
}
