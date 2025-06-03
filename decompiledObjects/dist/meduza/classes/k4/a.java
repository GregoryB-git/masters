package k4;

import f;
import java.util.ArrayList;
import java.util.Arrays;
import v5.u;

public abstract class a
{
  public final int a;
  
  public a(int paramInt)
  {
    a = paramInt;
  }
  
  public static String a(int paramInt)
  {
    StringBuilder localStringBuilder = f.l("");
    localStringBuilder.append((char)(paramInt >> 24 & 0xFF));
    localStringBuilder.append((char)(paramInt >> 16 & 0xFF));
    localStringBuilder.append((char)(paramInt >> 8 & 0xFF));
    localStringBuilder.append((char)(paramInt & 0xFF));
    return localStringBuilder.toString();
  }
  
  public String toString()
  {
    return a(a);
  }
  
  public static final class a
    extends a
  {
    public final long b;
    public final ArrayList c;
    public final ArrayList d;
    
    public a(int paramInt, long paramLong)
    {
      super();
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
  
  public static final class b
    extends a
  {
    public final u b;
    
    public b(int paramInt, u paramu)
    {
      super();
      b = paramu;
    }
  }
}

/* Location:
 * Qualified Name:     k4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */