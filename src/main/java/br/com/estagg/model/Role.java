package br.com.estagg.model;

public enum Role {

    ADMIN("Administrador"),
    COORDINATOR("Coordenador"),
    STUDENT("Aprendiz"),
    RECRUITER("Recrutador");


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