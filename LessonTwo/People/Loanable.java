package People;

public interface Loanable {
    void loan(String resource, int duration);
    void returnResource(String resource);
}
