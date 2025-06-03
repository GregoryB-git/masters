package io.flutter.plugin.editing;

class TextInputPlugin$2
  implements TextInputPlugin.MinMax
{
  public void inspect(double paramDouble1, double paramDouble2)
  {
    boolean bool = val$isAffine;
    double d1 = 1.0D;
    if (!bool)
    {
      arrayOfDouble = val$matrix;
      d1 = arrayOfDouble[3];
      d1 = 1.0D / (arrayOfDouble[7] * paramDouble2 + d1 * paramDouble1 + arrayOfDouble[15]);
    }
    double[] arrayOfDouble = val$matrix;
    double d2 = arrayOfDouble[0];
    d2 = (arrayOfDouble[4] * paramDouble2 + d2 * paramDouble1 + arrayOfDouble[12]) * d1;
    double d3 = arrayOfDouble[1];
    paramDouble1 = (arrayOfDouble[5] * paramDouble2 + d3 * paramDouble1 + arrayOfDouble[13]) * d1;
    arrayOfDouble = val$minMax;
    if (d2 < arrayOfDouble[0]) {
      arrayOfDouble[0] = d2;
    } else if (d2 > arrayOfDouble[1]) {
      arrayOfDouble[1] = d2;
    }
    if (paramDouble1 < arrayOfDouble[2]) {
      arrayOfDouble[2] = paramDouble1;
    } else if (paramDouble1 > arrayOfDouble[3]) {
      arrayOfDouble[3] = paramDouble1;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.TextInputPlugin.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */