package t8;

import java.util.Iterator;

public final class k$a$a
  implements Iterable<k.a.b>
{
  public long a;
  public final int b;
  
  public k$a$a(int paramInt)
  {
    int i = paramInt + 1;
    paramInt = (int)Math.floor(Math.log(i) / Math.log(2.0D));
    b = paramInt;
    a = (Math.pow(2.0D, paramInt) - 1L & i);
  }
  
  public final Iterator<k.a.b> iterator()
  {
    return new a();
  }
  
  public final class a
    implements Iterator<k.a.b>
  {
    public int a = b - 1;
    
    public a() {}
    
    public final boolean hasNext()
    {
      boolean bool;
      if (a >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final Object next()
    {
      long l1 = a;
      long l2 = 1 << a;
      k.a.b localb = new k.a.b();
      boolean bool;
      if ((l1 & l2) == 0L) {
        bool = true;
      } else {
        bool = false;
      }
      a = bool;
      b = ((int)Math.pow(2.0D, a));
      a -= 1;
      return localb;
    }
    
    public final void remove() {}
  }
}

/* Location:
 * Qualified Name:     t8.k.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */