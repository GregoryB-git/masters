package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import java.util.Arrays;
import z2;

public class StepCurve
  extends Easing
{
  private static final boolean DEBUG = false;
  public MonotonicCurveFit mCurveFit;
  
  public StepCurve(String paramString)
  {
    str = paramString;
    double[] arrayOfDouble = new double[paramString.length() / 2];
    int i = paramString.indexOf('(') + 1;
    int j = paramString.indexOf(',', i);
    for (int k = 0; j != -1; k++)
    {
      arrayOfDouble[k] = Double.parseDouble(paramString.substring(i, j).trim());
      i = j + 1;
      j = paramString.indexOf(',', i);
    }
    arrayOfDouble[k] = Double.parseDouble(paramString.substring(i, paramString.indexOf(41, i)).trim());
    mCurveFit = genSpline(Arrays.copyOf(arrayOfDouble, k + 1));
  }
  
  private static MonotonicCurveFit genSpline(String paramString)
  {
    paramString = paramString.split("\\s+");
    int i = paramString.length;
    double[] arrayOfDouble = new double[i];
    for (int j = 0; j < i; j++) {
      arrayOfDouble[j] = Double.parseDouble(paramString[j]);
    }
    return genSpline(arrayOfDouble);
  }
  
  private static MonotonicCurveFit genSpline(double[] paramArrayOfDouble)
  {
    int i = paramArrayOfDouble.length * 3 - 2;
    int j = paramArrayOfDouble.length - 1;
    double d1 = 1.0D / j;
    Object localObject1 = new double[i][1];
    Object localObject2 = new double[i];
    for (i = 0; i < paramArrayOfDouble.length; i++)
    {
      double d2 = paramArrayOfDouble[i];
      int k = i + j;
      localObject1[k][0] = d2;
      double d3 = i * d1;
      localObject2[k] = d3;
      if (i > 0)
      {
        k = j * 2 + i;
        localObject1[k][0] = (d2 + 1.0D);
        localObject2[k] = (d3 + 1.0D);
        k = i - 1;
        localObject1[k][0] = (d2 - 1.0D - d1);
        localObject2[k] = (d3 - 1.0D - d1);
      }
    }
    paramArrayOfDouble = new MonotonicCurveFit((double[])localObject2, (double[][])localObject1);
    localObject2 = System.out;
    localObject1 = z2.t(" 0 ");
    ((StringBuilder)localObject1).append(paramArrayOfDouble.getPos(0.0D, 0));
    ((PrintStream)localObject2).println(((StringBuilder)localObject1).toString());
    localObject1 = System.out;
    localObject2 = z2.t(" 1 ");
    ((StringBuilder)localObject2).append(paramArrayOfDouble.getPos(1.0D, 0));
    ((PrintStream)localObject1).println(((StringBuilder)localObject2).toString());
    return paramArrayOfDouble;
  }
  
  public double get(double paramDouble)
  {
    return mCurveFit.getPos(paramDouble, 0);
  }
  
  public double getDiff(double paramDouble)
  {
    return mCurveFit.getSlope(paramDouble, 0);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.StepCurve
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */