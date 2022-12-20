import java.util.Arrays;

public class Pokemon {
  String name;
  Type primaryType;
  Type secondaryType;

  public Pokemon(String thisName, String thisPrimaryType, String thisSecondaryType) {
    name = thisName;
    primaryType = new Type(thisPrimaryType);
    secondaryType = new Type(thisSecondaryType);
  }

  public double Defend(Type attackType) {
    double multiplier = 1.0;

    if (Arrays.asList(Types.types).contains(primaryType.type)) multiplier *= Types.getCalc(attackType, primaryType);
    if (Arrays.asList(Types.types).contains(secondaryType.type)) multiplier *= Types.getCalc(attackType, secondaryType);

    return multiplier;
  }
}
