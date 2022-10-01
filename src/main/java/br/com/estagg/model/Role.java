package br.com.estagg.model;

public enum Role {

    ADMIN("Administrador"),
    STUDENT("Aprendiz");


    private String value;

    void UserRole(String value) {
        this.value = value;
    }

    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}