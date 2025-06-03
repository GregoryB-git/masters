package e0;

import android.view.View;
import android.view.Window;

public final class v0
  extends u0
{
  public v0(Window paramWindow)
  {
    super(paramWindow);
  }
  
  public final void I(boolean paramBoolean)
  {
    View localView;
    if (paramBoolean)
    {
      k0.clearFlags(134217728);
      k0.addFlags(Integer.MIN_VALUE);
      localView = k0.getDecorView();
      localView.setSystemUiVisibility(localView.getSystemUiVisibility() | 0x10);
    }
    else
    {
      localView = k0.getDecorView();
      localView.setSystemUiVisibility(localView.getSystemUiVisibility() & 0xFFFFFFEF);
    }
  }
}

/* Location:
 * Qualified Name:     e0.v0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */