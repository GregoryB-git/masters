package androidx.constraintlayout.core.motion.utils;

public class Schlick
  extends Easing
{
  private static final boolean DEBUG = false;
  public double eps;
  public double mS;
  public double mT;
  
  public Schlick(String paramString)
  {
    str = paramString;
    int i = paramString.indexOf('(');
    int j = paramString.indexOf(',', i);
    mS = Double.parseDouble(paramString.substring(i + 1, j).trim());
    i = j + 1;
    mT = Double.parseDouble(paramString.substring(i, paramString.indexOf(',', i)).trim());
  }
  
  private double dfunc(double paramDouble)
  {
    double d1 = mT;
    if (paramDouble < d1)
    {
      d2 = mS;
      return d2 * d1 * d1 / (((d1 - paramDouble) * d2 + paramDouble) * ((d1 - paramDouble) * d2 + paramDouble));
    }
    double d3 = mS;
    double d2 = -d3;
    return (d1 - 1.0D) * ((d1 - 1.0D) * d3) / (((d1 - paramDouble) * -d3 - paramDouble + 1.0D) * ((d1 - paramDouble) * d2 - paramDouble + 1.0D));
  }
  
  private double func(double paramDouble)
  {
    double d = mT;
    if (paramDouble < d) {
      return d * paramDouble / ((d - paramDouble) * mS + paramDouble);
    }
    return (paramDouble - 1.0D) * (1.0D - d) / (1.0D - paramDouble - (d - paramDouble) * mS);
  }
  
  public double get(double paramDouble)
  {
    return func(paramDouble);
  }
  
  public double getDiff(double paramDouble)
  {
    return dfunc(paramDouble);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.Schlick
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */