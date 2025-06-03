package S3;

import java.util.Iterator;

public class k$b$a
  implements Iterable
{
  public long o;
  public final int p;
  
  public k$b$a(int paramInt)
  {
    int i = paramInt + 1;
    paramInt = (int)Math.floor(Math.log(i) / Math.log(2.0D));
    p = paramInt;
    o = (Math.pow(2.0D, paramInt) - 1L & i);
  }
  
  public Iterator iterator()
  {
    return new a();
  }
  
  public class a
    implements Iterator
  {
    public int o = k.b.a.a(k.b.a.this) - 1;
    
    public a() {}
    
    public k.b.b b()
    {
      long l1 = k.b.a.d(k.b.a.this);
      long l2 = 1 << o;
      k.b.b localb = new k.b.b();
      boolean bool;
      if ((l1 & l2) == 0L) {
        bool = true;
      } else {
        bool = false;
      }
      a = bool;
      b = ((int)Math.pow(2.0D, o));
      o -= 1;
      return localb;
    }
    
    public boolean hasNext()
    {
      boolean bool;
      if (o >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void remove() {}
  }
}

/* Location:
 * Qualified Name:     S3.k.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */