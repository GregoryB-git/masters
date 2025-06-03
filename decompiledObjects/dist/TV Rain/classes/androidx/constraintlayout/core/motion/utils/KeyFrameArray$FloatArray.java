package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import java.util.Arrays;
import z2;

class KeyFrameArray$FloatArray
{
  private static final int EMPTY = 999;
  public int count;
  public int[] keys = new int[101];
  public float[][] values = new float[101][];
  
  public KeyFrameArray$FloatArray()
  {
    clear();
  }
  
  public void append(int paramInt, float[] paramArrayOfFloat)
  {
    if (values[paramInt] != null) {
      remove(paramInt);
    }
    values[paramInt] = paramArrayOfFloat;
    paramArrayOfFloat = keys;
    int i = count;
    count = (i + 1);
    paramArrayOfFloat[i] = paramInt;
    Arrays.sort(paramArrayOfFloat);
  }
  
  public void clear()
  {
    Arrays.fill(keys, 999);
    Arrays.fill(values, null);
    count = 0;
  }
  
  public void dump()
  {
    Object localObject1 = System.out;
    Object localObject2 = z2.t("V: ");
    ((StringBuilder)localObject2).append(Arrays.toString(Arrays.copyOf(keys, count)));
    ((PrintStream)localObject1).println(((StringBuilder)localObject2).toString());
    System.out.print("K: [");
    for (int i = 0; i < count; i++)
    {
      localObject2 = System.out;
      StringBuilder localStringBuilder = new StringBuilder();
      if (i == 0) {
        localObject1 = "";
      } else {
        localObject1 = ", ";
      }
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append(Arrays.toString(valueAt(i)));
      ((PrintStream)localObject2).print(localStringBuilder.toString());
    }
    System.out.println("]");
  }
  
  public int keyAt(int paramInt)
  {
    return keys[paramInt];
  }
  
  public void remove(int paramInt)
  {
    values[paramInt] = null;
    int i = 0;
    int j = 0;
    int k;
    for (;;)
    {
      k = count;
      if (i >= k) {
        break;
      }
      int[] arrayOfInt = keys;
      k = j;
      if (paramInt == arrayOfInt[i])
      {
        arrayOfInt[i] = 999;
        k = j + 1;
      }
      if (i != k) {
        arrayOfInt[i] = arrayOfInt[k];
      }
      j = k + 1;
      i++;
    }
    count = (k - 1);
  }
  
  public int size()
  {
    return count;
  }
  
  public float[] valueAt(int paramInt)
  {
    return values[keys[paramInt]];
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.KeyFrameArray.FloatArray
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */