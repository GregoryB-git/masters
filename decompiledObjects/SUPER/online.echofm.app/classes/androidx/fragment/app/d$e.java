package androidx.fragment.app;

import android.view.View;

public class d$e
  extends g
{
  public d$e(d paramd, g paramg) {}
  
  public View e(int paramInt)
  {
    View localView = p.O1(paramInt);
    if (localView != null) {
      return localView;
    }
    if (o.f()) {
      return o.e(paramInt);
    }
    return null;
  }
  
  public boolean f()
  {
    boolean bool;
    if ((!p.P1()) && (!o.f())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.d.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */