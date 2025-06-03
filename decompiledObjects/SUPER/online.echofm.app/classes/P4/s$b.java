package P4;

import com.google.firebase.remoteconfig.internal.c;

public class s$b
{
  public long a = 60L;
  public long b = c.j;
  
  public s c()
  {
    return new s(this, null);
  }
  
  public b d(long paramLong)
  {
    if (paramLong >= 0L)
    {
      a = paramLong;
      return this;
    }
    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", new Object[] { Long.valueOf(paramLong) }));
  }
  
  public b e(long paramLong)
  {
    if (paramLong >= 0L)
    {
      b = paramLong;
      return this;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Minimum interval between fetches has to be a non-negative number. ");
    localStringBuilder.append(paramLong);
    localStringBuilder.append(" is an invalid argument");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     P4.s.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */