package g0;

import java.util.Arrays;

public final class p
{
  public int a;
  public long[] b;
  
  public p()
  {
    this(32);
  }
  
  public p(int paramInt)
  {
    b = new long[paramInt];
  }
  
  public void a(long paramLong)
  {
    int i = a;
    long[] arrayOfLong = b;
    if (i == arrayOfLong.length) {
      b = Arrays.copyOf(arrayOfLong, i * 2);
    }
    arrayOfLong = b;
    i = a;
    a = (i + 1);
    arrayOfLong[i] = paramLong;
  }
  
  public long b(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < a)) {
      return b[paramInt];
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Invalid index ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(", size is ");
    localStringBuilder.append(a);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public int c()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     g0.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */