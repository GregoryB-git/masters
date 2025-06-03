package e0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import b.a0;
import r.h;

public final class w0
  extends a0
{
  public final WindowInsetsController k0;
  public Window l0;
  
  public w0(Window paramWindow)
  {
    new h();
    k0 = localWindowInsetsController;
    l0 = paramWindow;
  }
  
  public final void I(boolean paramBoolean)
  {
    Object localObject;
    if (paramBoolean)
    {
      localObject = l0;
      if (localObject != null)
      {
        localObject = ((Window)localObject).getDecorView();
        ((View)localObject).setSystemUiVisibility(((View)localObject).getSystemUiVisibility() | 0x10);
      }
      k0.setSystemBarsAppearance(16, 16);
    }
    else
    {
      localObject = l0;
      if (localObject != null)
      {
        localObject = ((Window)localObject).getDecorView();
        ((View)localObject).setSystemUiVisibility(((View)localObject).getSystemUiVisibility() & 0xFFFFFFEF);
      }
      k0.setSystemBarsAppearance(0, 16);
    }
  }
  
  public final void J(boolean paramBoolean)
  {
    Object localObject;
    if (paramBoolean)
    {
      localObject = l0;
      if (localObject != null)
      {
        localObject = ((Window)localObject).getDecorView();
        ((View)localObject).setSystemUiVisibility(((View)localObject).getSystemUiVisibility() | 0x2000);
      }
      k0.setSystemBarsAppearance(8, 8);
    }
    else
    {
      localObject = l0;
      if (localObject != null)
      {
        localObject = ((Window)localObject).getDecorView();
        ((View)localObject).setSystemUiVisibility(((View)localObject).getSystemUiVisibility() & 0xDFFF);
      }
      k0.setSystemBarsAppearance(0, 8);
    }
  }
}

/* Location:
 * Qualified Name:     e0.w0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */