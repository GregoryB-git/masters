package o2;

import androidx.work.d;
import x2.s;

public final class l
  extends q
{
  public l(a parama)
  {
    super(b, c, d);
  }
  
  public static final class a
    extends q.a<a, l>
  {
    public a(Class<? extends d> paramClass)
    {
      super();
    }
    
    public final l b()
    {
      int i;
      if ((a) && (c.j.c)) {
        i = 0;
      } else {
        i = 1;
      }
      if (i != 0) {
        return new l(this);
      }
      throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
    }
    
    public final a c()
    {
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     o2.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */