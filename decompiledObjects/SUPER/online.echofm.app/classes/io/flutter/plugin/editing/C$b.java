package io.flutter.plugin.editing;

public class C$b
  implements C.d
{
  public C$b(C paramC, boolean paramBoolean, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2) {}
  
  public void a(double paramDouble1, double paramDouble2)
  {
    boolean bool = a;
    double d1 = 1.0D;
    if (!bool)
    {
      arrayOfDouble = b;
      d1 = 1.0D / (arrayOfDouble[3] * paramDouble1 + arrayOfDouble[7] * paramDouble2 + arrayOfDouble[15]);
    }
    double[] arrayOfDouble = b;
    double d2 = (arrayOfDouble[0] * paramDouble1 + arrayOfDouble[4] * paramDouble2 + arrayOfDouble[12]) * d1;
    paramDouble1 = (arrayOfDouble[1] * paramDouble1 + arrayOfDouble[5] * paramDouble2 + arrayOfDouble[13]) * d1;
    arrayOfDouble = c;
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
 * Qualified Name:     io.flutter.plugin.editing.C.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */