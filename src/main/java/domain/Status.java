package domain;

    public enum Status {
        PENDING, CANCELLED, COMPLETED, RECURRING;


    @Override
    public String toString() {
        return "Status{}";
    }
}
