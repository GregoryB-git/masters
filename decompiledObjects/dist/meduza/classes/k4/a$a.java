package k4;

import java.util.ArrayList;
import java.util.Arrays;

public final class a$a
  extends a
{
  public final long b;
  public final ArrayList c;
  public final ArrayList d;
  
  public a$a(int paramInt, long paramLong)
  {
    super(paramInt);
    b = paramLong;
    c = new ArrayList();
    d = new ArrayList();
  }
  
  public final a b(int paramInt)
  {
    int i = d.size();
    for (int j = 0; j < i; j++)
    {
      a locala = (a)d.get(j);
      if (a == paramInt) {
        return locala;
      }
    }
    return null;
  }
  
  public final a.b c(int paramInt)
  {
    int i = c.size();
    for (int j = 0; j < i; j++)
    {
      a.b localb = (a.b)c.get(j);
      if (a == paramInt) {
        return localb;
      }
    }
    return null;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a.a(a));
    localStringBuilder.append(" leaves: ");
    localStringBuilder.append(Arrays.toString(c.toArray()));
    localStringBuilder.append(" containers: ");
    localStringBuilder.append(Arrays.toString(d.toArray()));
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     k4.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */