package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import java.io.PrintStream;
import java.util.Arrays;
import z2;

public class KeyFrameArray
{
  public static class CustomArray
  {
    private static final int EMPTY = 999;
    public int count;
    public int[] keys = new int[101];
    public CustomAttribute[] values = new CustomAttribute[101];
    
    public CustomArray()
    {
      clear();
    }
    
    public void append(int paramInt, CustomAttribute paramCustomAttribute)
    {
      if (values[paramInt] != null) {
        remove(paramInt);
      }
      values[paramInt] = paramCustomAttribute;
      paramCustomAttribute = keys;
      int i = count;
      count = (i + 1);
      paramCustomAttribute[i] = paramInt;
      Arrays.sort(paramCustomAttribute);
    }
    
    public void clear()
    {
      Arrays.fill(keys, 999);
      Arrays.fill(values, null);
      count = 0;
    }
    
    public void dump()
    {
      PrintStream localPrintStream = System.out;
      Object localObject = z2.t("V: ");
      ((StringBuilder)localObject).append(Arrays.toString(Arrays.copyOf(keys, count)));
      localPrintStream.println(((StringBuilder)localObject).toString());
      System.out.print("K: [");
      for (int i = 0; i < count; i++)
      {
        localPrintStream = System.out;
        StringBuilder localStringBuilder = new StringBuilder();
        if (i == 0) {
          localObject = "";
        } else {
          localObject = ", ";
        }
        localStringBuilder.append((String)localObject);
        localStringBuilder.append(valueAt(i));
        localPrintStream.print(localStringBuilder.toString());
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
    
    public CustomAttribute valueAt(int paramInt)
    {
      return values[keys[paramInt]];
    }
  }
  
  public static class CustomVar
  {
    private static final int EMPTY = 999;
    public int count;
    public int[] keys = new int[101];
    public CustomVariable[] values = new CustomVariable[101];
    
    public CustomVar()
    {
      clear();
    }
    
    public void append(int paramInt, CustomVariable paramCustomVariable)
    {
      if (values[paramInt] != null) {
        remove(paramInt);
      }
      values[paramInt] = paramCustomVariable;
      paramCustomVariable = keys;
      int i = count;
      count = (i + 1);
      paramCustomVariable[i] = paramInt;
      Arrays.sort(paramCustomVariable);
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
        PrintStream localPrintStream = System.out;
        localObject1 = new StringBuilder();
        if (i == 0) {
          localObject2 = "";
        } else {
          localObject2 = ", ";
        }
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(valueAt(i));
        localPrintStream.print(((StringBuilder)localObject1).toString());
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
    
    public CustomVariable valueAt(int paramInt)
    {
      return values[keys[paramInt]];
    }
  }
  
  public static class FloatArray
  {
    private static final int EMPTY = 999;
    public int count;
    public int[] keys = new int[101];
    public float[][] values = new float[101][];
    
    public FloatArray()
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
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.KeyFrameArray
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */