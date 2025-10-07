public interface LeeZhuIntFace {

    int MIN_LENGTH = 8;
    int MAX_LENGTH = 20;

    int determineStrength() throws LeeZhuPasswordFormatException;

    boolean minRequirements();

    int passLength();

    int conseqIndexes();

    int upperLower();

    int consecutive();

    int appear();

    int recur();
}
