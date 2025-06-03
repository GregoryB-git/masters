package S3;

import java.util.Iterator;

public class k$b$a$a
  implements Iterator
{
  public int o;
  
  public k$b$a$a(k.b.a parama)
  {
    o = (k.b.a.a(parama) - 1);
  }
  
  public k.b.b b()
  {
    long l1 = k.b.a.d(p);
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

/* Location:
 * Qualified Name:     S3.k.b.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */