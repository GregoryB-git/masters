package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomVariable;
import java.io.PrintStream;
import java.util.Arrays;
import z2;

public class KeyFrameArray$CustomVar
{
  private static final int EMPTY = 999;
  public int count;
  public int[] keys = new int[101];
  public CustomVariable[] values = new CustomVariable[101];
  
  public KeyFrameArray$CustomVar()
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

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */