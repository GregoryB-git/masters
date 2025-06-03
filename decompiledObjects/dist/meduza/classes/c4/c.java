package c4;

import f;
import java.util.Arrays;
import v5.e0;

public final class c
  implements t
{
  public final int a;
  public final int[] b;
  public final long[] c;
  public final long[] d;
  public final long[] e;
  public final long f;
  
  public c(int[] paramArrayOfInt, long[] paramArrayOfLong1, long[] paramArrayOfLong2, long[] paramArrayOfLong3)
  {
    b = paramArrayOfInt;
    c = paramArrayOfLong1;
    d = paramArrayOfLong2;
    e = paramArrayOfLong3;
    int i = paramArrayOfInt.length;
    a = i;
    if (i > 0) {
      f = (paramArrayOfLong2[(i - 1)] + paramArrayOfLong3[(i - 1)]);
    } else {
      f = 0L;
    }
  }
  
  public final boolean e()
  {
    return true;
  }
  
  public final t.a g(long paramLong)
  {
    int i = e0.f(e, paramLong, true);
    long[] arrayOfLong1 = e;
    long l = arrayOfLong1[i];
    long[] arrayOfLong2 = c;
    u localu = new u(l, arrayOfLong2[i]);
    if ((l < paramLong) && (i != a - 1))
    {
      i++;
      return new t.a(localu, new u(arrayOfLong1[i], arrayOfLong2[i]));
    }
    return new t.a(localu, localu);
  }
  
  public final long h()
  {
    return f;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("ChunkIndex(length=");
    localStringBuilder.append(a);
    localStringBuilder.append(", sizes=");
    localStringBuilder.append(Arrays.toString(b));
    localStringBuilder.append(", offsets=");
    localStringBuilder.append(Arrays.toString(c));
    localStringBuilder.append(", timeUs=");
    localStringBuilder.append(Arrays.toString(e));
    localStringBuilder.append(", durationsUs=");
    localStringBuilder.append(Arrays.toString(d));
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     c4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */