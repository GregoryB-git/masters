package x0;

import android.view.View;
import f;

public final class i$f
  extends p
{
  public i$f(i parami) {}
  
  public final View b(int paramInt)
  {
    Object localObject = a.mView;
    if (localObject != null) {
      return ((View)localObject).findViewById(paramInt);
    }
    localObject = f.l("Fragment ");
    ((StringBuilder)localObject).append(a);
    ((StringBuilder)localObject).append(" does not have a view");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public final boolean c()
  {
    boolean bool;
    if (a.mView != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     x0.i.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */