package X2;

import a3.a;
import a3.f;
import a3.h;
import java.util.Comparator;

public abstract class n
{
  public static final n a = new a();
  public static final n b = new b(-1);
  public static final n c = new b(1);
  
  public static n j()
  {
    return a;
  }
  
  public abstract n d(int paramInt1, int paramInt2);
  
  public abstract n e(long paramLong1, long paramLong2);
  
  public abstract n f(Object paramObject1, Object paramObject2, Comparator paramComparator);
  
  public abstract n g(boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract n h(boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract int i();
  
  public class a
    extends n
  {
    public a()
    {
      super();
    }
    
    public n d(int paramInt1, int paramInt2)
    {
      return k(f.e(paramInt1, paramInt2));
    }
    
    public n e(long paramLong1, long paramLong2)
    {
      return k(h.a(paramLong1, paramLong2));
    }
    
    public n f(Object paramObject1, Object paramObject2, Comparator paramComparator)
    {
      return k(paramComparator.compare(paramObject1, paramObject2));
    }
    
    public n g(boolean paramBoolean1, boolean paramBoolean2)
    {
      return k(a.a(paramBoolean1, paramBoolean2));
    }
    
    public n h(boolean paramBoolean1, boolean paramBoolean2)
    {
      return k(a.a(paramBoolean2, paramBoolean1));
    }
    
    public int i()
    {
      return 0;
    }
    
    public n k(int paramInt)
    {
      n localn;
      if (paramInt < 0) {
        localn = n.a();
      } else if (paramInt > 0) {
        localn = n.b();
      } else {
        localn = n.c();
      }
      return localn;
    }
  }
  
  public static final class b
    extends n
  {
    public final int d;
    
    public b(int paramInt)
    {
      super();
      d = paramInt;
    }
    
    public n d(int paramInt1, int paramInt2)
    {
      return this;
    }
    
    public n e(long paramLong1, long paramLong2)
    {
      return this;
    }
    
    public n f(Object paramObject1, Object paramObject2, Comparator paramComparator)
    {
      return this;
    }
    
    public n g(boolean paramBoolean1, boolean paramBoolean2)
    {
      return this;
    }
    
    public n h(boolean paramBoolean1, boolean paramBoolean2)
    {
      return this;
    }
    
    public int i()
    {
      return d;
    }
  }
}

/* Location:
 * Qualified Name:     X2.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */