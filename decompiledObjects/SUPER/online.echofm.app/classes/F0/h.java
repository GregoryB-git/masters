package F0;

import java.util.Arrays;

public final class h
  implements M
{
  public final int a;
  public final int[] b;
  public final long[] c;
  public final long[] d;
  public final long[] e;
  public final long f;
  
  public h(int[] paramArrayOfInt, long[] paramArrayOfLong1, long[] paramArrayOfLong2, long[] paramArrayOfLong3)
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
  
  public int a(long paramLong)
  {
    return g0.M.h(e, paramLong, true, true);
  }
  
  public boolean h()
  {
    return true;
  }
  
  public M.a j(long paramLong)
  {
    int i = a(paramLong);
    N localN = new N(e[i], c[i]);
    if ((a < paramLong) && (i != a - 1))
    {
      long[] arrayOfLong = e;
      i++;
      return new M.a(localN, new N(arrayOfLong[i], c[i]));
    }
    return new M.a(localN);
  }
  
  public long l()
  {
    return f;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ChunkIndex(length=");
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
 * Qualified Name:     F0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */