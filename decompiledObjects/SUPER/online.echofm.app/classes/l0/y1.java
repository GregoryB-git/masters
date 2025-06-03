package l0;

import android.media.metrics.LogSessionId;
import g0.M;
import g0.a;
import java.util.Objects;
import k0.g0;

public final class y1
{
  public static final y1 d;
  public final String a;
  public final a b;
  public final Object c;
  
  static
  {
    y1 localy1;
    if (M.a < 31) {
      localy1 = new y1("");
    } else {
      localy1 = new y1(a.b, "");
    }
    d = localy1;
  }
  
  public y1(LogSessionId paramLogSessionId, String paramString)
  {
    this(new a(paramLogSessionId), paramString);
  }
  
  public y1(String paramString)
  {
    boolean bool;
    if (M.a < 31) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
    a = paramString;
    b = null;
    c = new Object();
  }
  
  public y1(a parama, String paramString)
  {
    b = parama;
    a = paramString;
    c = new Object();
  }
  
  public LogSessionId a()
  {
    return eb)).a;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof y1)) {
      return false;
    }
    paramObject = (y1)paramObject;
    if ((!Objects.equals(a, a)) || (!Objects.equals(b, b)) || (!Objects.equals(c, c))) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return Objects.hash(new Object[] { a, b, c });
  }
  
  public static final class a
  {
    public static final a b = new a(g0.a());
    public final LogSessionId a;
    
    public a(LogSessionId paramLogSessionId)
    {
      a = paramLogSessionId;
    }
  }
}

/* Location:
 * Qualified Name:     l0.y1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */