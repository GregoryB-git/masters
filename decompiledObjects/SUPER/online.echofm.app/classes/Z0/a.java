package Z0;

import g0.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class a
{
  public final int a;
  
  public a(int paramInt)
  {
    a = paramInt;
  }
  
  public static String a(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("");
    localStringBuilder.append((char)(paramInt >> 24 & 0xFF));
    localStringBuilder.append((char)(paramInt >> 16 & 0xFF));
    localStringBuilder.append((char)(paramInt >> 8 & 0xFF));
    localStringBuilder.append((char)(paramInt & 0xFF));
    return localStringBuilder.toString();
  }
  
  public static int b(int paramInt)
  {
    return paramInt & 0xFFFFFF;
  }
  
  public static int c(int paramInt)
  {
    return paramInt >> 24 & 0xFF;
  }
  
  public String toString()
  {
    return a(a);
  }
  
  public static final class a
    extends a
  {
    public final long b;
    public final List c;
    public final List d;
    
    public a(int paramInt, long paramLong)
    {
      super();
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
  
  public static final class b
    extends a
  {
    public final z b;
    
    public b(int paramInt, z paramz)
    {
      super();
      b = paramz;
    }
  }
}

/* Location:
 * Qualified Name:     Z0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */