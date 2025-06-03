package x0;

import android.app.Dialog;
import android.view.View;

public final class h$e
  extends p
{
  public h$e(h paramh, p paramp) {}
  
  public final View b(int paramInt)
  {
    if (a.c()) {
      return a.b(paramInt);
    }
    Object localObject = b.r;
    if (localObject != null) {
      localObject = ((Dialog)localObject).findViewById(paramInt);
    } else {
      localObject = null;
    }
    return (View)localObject;
  }
  
  public final boolean c()
  {
    boolean bool;
    if ((!a.c()) && (!b.v)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     x0.h.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */