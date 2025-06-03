package I;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import t.h;

public class X$d
  extends X.e
{
  public final X a;
  public final WindowInsetsController b;
  public final h c = new h();
  public Window d;
  
  public X$d(Window paramWindow, X paramX)
  {
    this(Y.a(paramWindow), paramX);
    d = paramWindow;
  }
  
  public X$d(WindowInsetsController paramWindowInsetsController, X paramX)
  {
    b = paramWindowInsetsController;
    a = paramX;
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (d != null) {
        c(16);
      }
      Z.a(b, 16, 16);
    }
    else
    {
      if (d != null) {
        d(16);
      }
      Z.a(b, 0, 16);
    }
  }
  
  public void b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (d != null) {
        c(8192);
      }
      Z.a(b, 8, 8);
    }
    else
    {
      if (d != null) {
        d(8192);
      }
      Z.a(b, 0, 8);
    }
  }
  
  public void c(int paramInt)
  {
    View localView = d.getDecorView();
    localView.setSystemUiVisibility(paramInt | localView.getSystemUiVisibility());
  }
  
  public void d(int paramInt)
  {
    View localView = d.getDecorView();
    localView.setSystemUiVisibility(paramInt & localView.getSystemUiVisibility());
  }
}

/* Location:
 * Qualified Name:     I.X.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */