package W3;

import Y3.m;
import a4.h;

public class e
{
  public static final e d = new e(a.o, null, false);
  public static final e e = new e(a.p, null, false);
  public final a a;
  public final h b;
  public final boolean c;
  
  public e(a parama, h paramh, boolean paramBoolean)
  {
    a = parama;
    b = paramh;
    c = paramBoolean;
    if ((paramBoolean) && (!c())) {
      paramBoolean = false;
    } else {
      paramBoolean = true;
    }
    m.f(paramBoolean);
  }
  
  public static e a(h paramh)
  {
    return new e(a.p, paramh, true);
  }
  
  public h b()
  {
    return b;
  }
  
  public boolean c()
  {
    boolean bool;
    if (a == a.p) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean d()
  {
    boolean bool;
    if (a == a.o) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean e()
  {
    return c;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("OperationSource{source=");
    localStringBuilder.append(a);
    localStringBuilder.append(", queryParams=");
    localStringBuilder.append(b);
    localStringBuilder.append(", tagged=");
    localStringBuilder.append(c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public static enum a
  {
    static
    {
      a locala1 = new a("User", 0);
      o = locala1;
      a locala2 = new a("Server", 1);
      p = locala2;
      q = new a[] { locala1, locala2 };
    }
  }
}

/* Location:
 * Qualified Name:     W3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */