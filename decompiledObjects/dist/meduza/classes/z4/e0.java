package z4;

import java.util.Arrays;
import java.util.Random;

public abstract interface e0
{
  public abstract a a(int paramInt1, int paramInt2);
  
  public abstract int b();
  
  public abstract int c(int paramInt);
  
  public abstract int d(int paramInt);
  
  public abstract a e(int paramInt1, int paramInt2);
  
  public abstract int f();
  
  public abstract a g();
  
  public abstract int getLength();
  
  public static final class a
    implements e0
  {
    public final Random a;
    public final int[] b;
    public final int[] c;
    
    public a()
    {
      this(new Random());
    }
    
    public a(Random paramRandom)
    {
      this(new int[0], paramRandom);
    }
    
    public a(int[] paramArrayOfInt, Random paramRandom)
    {
      b = paramArrayOfInt;
      a = paramRandom;
      c = new int[paramArrayOfInt.length];
      for (int i = 0; i < paramArrayOfInt.length; i++) {
        c[paramArrayOfInt[i]] = i;
      }
    }
    
    public final a a(int paramInt1, int paramInt2)
    {
      int i = paramInt2 - paramInt1;
      int[] arrayOfInt1 = new int[b.length - i];
      int j = 0;
      int k = 0;
      for (;;)
      {
        int[] arrayOfInt2 = b;
        if (j >= arrayOfInt2.length) {
          break;
        }
        int m = arrayOfInt2[j];
        if ((m >= paramInt1) && (m < paramInt2))
        {
          k++;
        }
        else
        {
          int n = m;
          if (m >= paramInt1) {
            n = m - i;
          }
          arrayOfInt1[(j - k)] = n;
        }
        j++;
      }
      return new a(arrayOfInt1, new Random(a.nextLong()));
    }
    
    public final int b()
    {
      int[] arrayOfInt = b;
      int i;
      if (arrayOfInt.length > 0) {
        i = arrayOfInt[0];
      } else {
        i = -1;
      }
      return i;
    }
    
    public final int c(int paramInt)
    {
      int i = c[paramInt];
      paramInt = -1;
      i--;
      if (i >= 0) {
        paramInt = b[i];
      }
      return paramInt;
    }
    
    public final int d(int paramInt)
    {
      paramInt = c[paramInt] + 1;
      int[] arrayOfInt = b;
      if (paramInt < arrayOfInt.length) {
        paramInt = arrayOfInt[paramInt];
      } else {
        paramInt = -1;
      }
      return paramInt;
    }
    
    public final a e(int paramInt1, int paramInt2)
    {
      int[] arrayOfInt1 = new int[paramInt2];
      int[] arrayOfInt2 = new int[paramInt2];
      int i = 0;
      int m;
      for (int j = 0; j < paramInt2; j = k)
      {
        arrayOfInt1[j] = a.nextInt(b.length + 1);
        localObject = a;
        k = j + 1;
        m = ((Random)localObject).nextInt(k);
        arrayOfInt2[j] = arrayOfInt2[m];
        arrayOfInt2[m] = (j + paramInt1);
      }
      Arrays.sort(arrayOfInt1);
      Object localObject = new int[b.length + paramInt2];
      int k = 0;
      j = k;
      for (;;)
      {
        int[] arrayOfInt3 = b;
        if (i >= arrayOfInt3.length + paramInt2) {
          break;
        }
        if ((k < paramInt2) && (j == arrayOfInt1[k]))
        {
          localObject[i] = arrayOfInt2[k];
          k++;
        }
        else
        {
          m = arrayOfInt3[j];
          localObject[i] = m;
          if (m >= paramInt1) {
            localObject[i] = (m + paramInt2);
          }
          j++;
        }
        i++;
      }
      return new a((int[])localObject, new Random(a.nextLong()));
    }
    
    public final int f()
    {
      int[] arrayOfInt = b;
      int i;
      if (arrayOfInt.length > 0) {
        i = arrayOfInt[(arrayOfInt.length - 1)];
      } else {
        i = -1;
      }
      return i;
    }
    
    public final a g()
    {
      return new a(new Random(a.nextLong()));
    }
    
    public final int getLength()
    {
      return b.length;
    }
  }
}

/* Location:
 * Qualified Name:     z4.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */