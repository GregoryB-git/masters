package e0;

import android.support.v4.media.session.b;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import d2.k;
import java.util.Objects;

public class s0$h
  extends s0.g
{
  public s0$h(s0 params0, WindowInsets paramWindowInsets)
  {
    super(params0, paramWindowInsets);
  }
  
  public s0 a()
  {
    return s0.c(b.f(c), null);
  }
  
  public h e()
  {
    Object localObject = k.d(c);
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = new h((DisplayCutout)localObject);
    }
    return (h)localObject;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof h)) {
      return false;
    }
    paramObject = (h)paramObject;
    if ((!Objects.equals(c, c)) || (!Objects.equals(e, e))) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return c.hashCode();
  }
}

/* Location:
 * Qualified Name:     e0.s0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */