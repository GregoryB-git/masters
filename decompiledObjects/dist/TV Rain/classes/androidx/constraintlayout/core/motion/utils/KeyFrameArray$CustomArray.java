package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import java.io.PrintStream;
import java.util.Arrays;
import z2;

public class KeyFrameArray$CustomArray
{
  private static final int EMPTY = 999;
  public int count;
  public int[] keys = new int[101];
  public CustomAttribute[] values = new CustomAttribute[101];
  
  public KeyFrameArray$CustomArray()
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

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomArray
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */