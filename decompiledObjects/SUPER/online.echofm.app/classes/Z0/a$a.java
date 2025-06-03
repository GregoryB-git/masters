package Z0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class a$a
  extends a
{
  public final long b;
  public final List c;
  public final List d;
  
  public a$a(int paramInt, long paramLong)
  {
    super(paramInt);
    b = paramLong;
    c = new ArrayList();
    d = new ArrayList();
  }
  
  public void d(a parama)
  {
    d.add(parama);
  }
  
  public void e(a.b paramb)
  {
    c.add(paramb);
  }
  
  public a f(int paramInt)
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
  
  public a.b g(int paramInt)
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
  
  public String toString()
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
 * Qualified Name:     Z0.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */