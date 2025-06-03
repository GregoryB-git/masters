package androidx.fragment.app;

import android.view.View;

public class Fragment$d
  extends g
{
  public Fragment$d(Fragment paramFragment) {}
  
  public View e(int paramInt)
  {
    Object localObject = o.V;
    if (localObject != null) {
      return ((View)localObject).findViewById(paramInt);
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Fragment ");
    ((StringBuilder)localObject).append(o);
    ((StringBuilder)localObject).append(" does not have a view");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public boolean f()
  {
    boolean bool;
    if (o.V != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.Fragment.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */