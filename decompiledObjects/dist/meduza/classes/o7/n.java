package o7;

import java.util.Comparator;

public abstract class n
{
  public static final a a = new a();
  public static final b b = new b(-1);
  public static final b c = new b(1);
  
  public abstract n a(int paramInt1, int paramInt2);
  
  public abstract <T> n b(T paramT1, T paramT2, Comparator<T> paramComparator);
  
  public abstract n c(boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract n d(boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract int e();
  
  public final class a
    extends n
  {
    public static n f(int paramInt)
    {
      Object localObject;
      if (paramInt < 0) {
        localObject = n.b;
      } else if (paramInt > 0) {
        localObject = n.c;
      } else {
        localObject = n.a;
      }
      return (n)localObject;
    }
    
    public final n a(int paramInt1, int paramInt2)
    {
      if (paramInt1 < paramInt2) {
        paramInt1 = -1;
      } else if (paramInt1 > paramInt2) {
        paramInt1 = 1;
      } else {
        paramInt1 = 0;
      }
      return f(paramInt1);
    }
    
    public final <T> n b(T paramT1, T paramT2, Comparator<T> paramComparator)
    {
      return f(paramComparator.compare(paramT1, paramT2));
    }
    
    public final n c(boolean paramBoolean1, boolean paramBoolean2)
    {
      int i;
      if (paramBoolean1 == paramBoolean2) {
        i = 0;
      } else if (paramBoolean1) {
        i = 1;
      } else {
        i = -1;
      }
      return f(i);
    }
    
    public final n d(boolean paramBoolean1, boolean paramBoolean2)
    {
      int i;
      if (paramBoolean2 == paramBoolean1) {
        i = 0;
      } else if (paramBoolean2) {
        i = 1;
      } else {
        i = -1;
      }
      return f(i);
    }
    
    public final int e()
    {
      return 0;
    }
  }
  
  public static final class b
    extends n
  {
    public final int d;
    
    public b(int paramInt)
    {
      d = paramInt;
    }
    
    public final n a(int paramInt1, int paramInt2)
    {
      return this;
    }
    
    public final <T> n b(T paramT1, T paramT2, Comparator<T> paramComparator)
    {
      return this;
    }
    
    public final n c(boolean paramBoolean1, boolean paramBoolean2)
    {
      return this;
    }
    
    public final n d(boolean paramBoolean1, boolean paramBoolean2)
    {
      return this;
    }
    
    public final int e()
    {
      return d;
    }
  }
}

/* Location:
 * Qualified Name:     o7.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */