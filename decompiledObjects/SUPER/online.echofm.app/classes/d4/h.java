package d4;

import V3.k;
import java.util.Comparator;

public abstract class h
  implements Comparator
{
  public static h b(String paramString)
  {
    if (paramString.equals(".value")) {
      return u.j();
    }
    if (paramString.equals(".key")) {
      return j.j();
    }
    if (!paramString.equals(".priority")) {
      return new p(new k(paramString));
    }
    throw new IllegalStateException("queryDefinition shouldn't ever be .priority since it's the default");
  }
  
  public int a(m paramm1, m paramm2, boolean paramBoolean)
  {
    if (paramBoolean) {
      return compare(paramm2, paramm1);
    }
    return compare(paramm1, paramm2);
  }
  
  public abstract String c();
  
  public boolean d(n paramn1, n paramn2)
  {
    boolean bool;
    if (compare(new m(b.n(), paramn1), new m(b.n(), paramn2)) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public abstract boolean e(n paramn);
  
  public abstract m f(b paramb, n paramn);
  
  public abstract m g();
  
  public m h()
  {
    return m.b();
  }
}

/* Location:
 * Qualified Name:     d4.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */