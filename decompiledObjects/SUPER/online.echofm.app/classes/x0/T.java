package x0;

import java.util.Arrays;
import java.util.Random;

public abstract interface T
{
  public abstract int a();
  
  public abstract T b(int paramInt1, int paramInt2);
  
  public abstract int c(int paramInt);
  
  public abstract T d(int paramInt1, int paramInt2);
  
  public abstract int e();
  
  public abstract int f(int paramInt);
  
  public abstract int g();
  
  public abstract T h();
  
  public static class a
    implements T
  {
    public final Random a;
    public final int[] b;
    public final int[] c;
    
    public a(int paramInt)
    {
      this(paramInt, new Random());
    }
    
    public a(int paramInt, Random paramRandom)
    {
      this(i(paramInt, paramRandom), paramRandom);
    }
    
    public a(int[] paramArrayOfInt, long paramLong)
    {
      this(Arrays.copyOf(paramArrayOfInt, paramArrayOfInt.length), new Random(paramLong));
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
    
    public static int[] i(int paramInt, Random paramRandom)
    {
      int[] arrayOfInt = new int[paramInt];
      int j;
      for (int i = 0; i < paramInt; i = j)
      {
        j = i + 1;
        int k = paramRandom.nextInt(j);
        arrayOfInt[i] = arrayOfInt[k];
        arrayOfInt[k] = i;
      }
      return arrayOfInt;
    }
    
    public int a()
    {
      return b.length;
    }
    
    public T b(int paramInt1, int paramInt2)
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
    
    public int c(int paramInt)
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
    
    public T d(int paramInt1, int paramInt2)
    {
      int[] arrayOfInt1 = new int[paramInt2];
      int[] arrayOfInt2 = new int[paramInt2];
      int i = 0;
      Object localObject;
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
      int[] arrayOfInt3 = new int[b.length + paramInt2];
      int k = 0;
      j = k;
      for (;;)
      {
        localObject = b;
        if (i >= localObject.length + paramInt2) {
          break;
        }
        if ((k < paramInt2) && (j == arrayOfInt1[k]))
        {
          arrayOfInt3[i] = arrayOfInt2[k];
          k++;
        }
        else
        {
          m = localObject[j];
          arrayOfInt3[i] = m;
          if (m >= paramInt1) {
            arrayOfInt3[i] = (m + paramInt2);
          }
          j++;
        }
        i++;
      }
      return new a(arrayOfInt3, new Random(a.nextLong()));
    }
    
    public int e()
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
    
    public int f(int paramInt)
    {
      int i = c[paramInt];
      paramInt = -1;
      i--;
      if (i >= 0) {
        paramInt = b[i];
      }
      return paramInt;
    }
    
    public int g()
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
    
    public T h()
    {
      return new a(0, new Random(a.nextLong()));
    }
  }
}

/* Location:
 * Qualified Name:     x0.T
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */