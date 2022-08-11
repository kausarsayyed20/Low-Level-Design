package models;

public enum OperationEnums {
    EQUALS("EQUALS"),
    EXACT("EXACT"),
    PERCENTAGE("PERCENTAGE");

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    String value;
    OperationEnums(String value){
        this.value = value;
    }

}
