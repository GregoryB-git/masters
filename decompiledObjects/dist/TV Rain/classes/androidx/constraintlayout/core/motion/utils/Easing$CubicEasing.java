package androidx.constraintlayout.core.motion.utils;

class Easing$CubicEasing
  extends Easing
{
  private static double d_error = 1.0E-4D;
  private static double error = 0.01D;
  public double x1;
  public double x2;
  public double y1;
  public double y2;
  
  public Easing$CubicEasing(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    setup(paramDouble1, paramDouble2, paramDouble3, paramDouble4);
  }
  
  public Easing$CubicEasing(String paramString)
  {
    str = paramString;
    int i = paramString.indexOf('(');
    int j = paramString.indexOf(',', i);
    x1 = Double.parseDouble(paramString.substring(i + 1, j).trim());
    j++;
    i = paramString.indexOf(',', j);
    y1 = Double.parseDouble(paramString.substring(j, i).trim());
    i++;
    j = paramString.indexOf(',', i);
    x2 = Double.parseDouble(paramString.substring(i, j).trim());
    j++;
    y2 = Double.parseDouble(paramString.substring(j, paramString.indexOf(')', j)).trim());
  }
  
  private double getDiffX(double paramDouble)
  {
    double d1 = 1.0D - paramDouble;
    double d2 = x1;
    double d3 = x2;
    return (1.0D - d3) * (3.0D * paramDouble * paramDouble) + ((d3 - d2) * (d1 * 6.0D * paramDouble) + d1 * 3.0D * d1 * d2);
  }
  
  private double getDiffY(double paramDouble)
  {
    double d1 = 1.0D - paramDouble;
    double d2 = y1;
    double d3 = y2;
    return (1.0D - d3) * (3.0D * paramDouble * paramDouble) + ((d3 - d2) * (d1 * 6.0D * paramDouble) + d1 * 3.0D * d1 * d2);
  }
  
  private double getX(double paramDouble)
  {
    double d1 = 1.0D - paramDouble;
    double d2 = 3.0D * d1;
    double d3 = x1;
    return x2 * (d2 * paramDouble * paramDouble) + d3 * (d1 * d2 * paramDouble) + paramDouble * paramDouble * paramDouble;
  }
  
  private double getY(double paramDouble)
  {
    double d1 = 1.0D - paramDouble;
    double d2 = 3.0D * d1;
    double d3 = y1;
    return y2 * (d2 * paramDouble * paramDouble) + d3 * (d1 * d2 * paramDouble) + paramDouble * paramDouble * paramDouble;
  }
  
  public double get(double paramDouble)
  {
    if (paramDouble <= 0.0D) {
      return 0.0D;
    }
    if (paramDouble >= 1.0D) {
      return 1.0D;
    }
    double d1 = 0.5D;
    double d2 = d1;
    while (d1 > error)
    {
      d3 = getX(d2);
      d1 *= 0.5D;
      if (d3 < paramDouble) {
        d2 += d1;
      } else {
        d2 -= d1;
      }
    }
    double d4 = d2 - d1;
    double d3 = getX(d4);
    d1 = d2 + d1;
    d2 = getX(d1);
    d4 = getY(d4);
    return (paramDouble - d3) * (getY(d1) - d4) / (d2 - d3) + d4;
  }
  
  public double getDiff(double paramDouble)
  {
    double d1 = 0.5D;
    double d2 = d1;
    while (d1 > d_error)
    {
      d3 = getX(d2);
      d1 *= 0.5D;
      if (d3 < paramDouble) {
        d2 += d1;
      } else {
        d2 -= d1;
      }
    }
    double d3 = d2 - d1;
    paramDouble = getX(d3);
    d1 = d2 + d1;
    d2 = getX(d1);
    d3 = getY(d3);
    return (getY(d1) - d3) / (d2 - paramDouble);
  }
  
  public void setup(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    x1 = paramDouble1;
    y1 = paramDouble2;
    x2 = paramDouble3;
    y2 = paramDouble4;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.Easing.CubicEasing
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */