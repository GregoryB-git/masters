package e0;

import android.view.View;
import android.view.Window;

public class u0
  extends t0
{
  public u0(Window paramWindow)
  {
    super(paramWindow);
  }
  
  public final void J(boolean paramBoolean)
  {
    View localView;
    if (paramBoolean)
    {
      k0.clearFlags(67108864);
      k0.addFlags(Integer.MIN_VALUE);
      localView = k0.getDecorView();
      localView.setSystemUiVisibility(localView.getSystemUiVisibility() | 0x2000);
    }
    else
    {
      localView = k0.getDecorView();
      localView.setSystemUiVisibility(localView.getSystemUiVisibility() & 0xDFFF);
    }
  }
}

/* Location:
 * Qualified Name:     e0.u0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */