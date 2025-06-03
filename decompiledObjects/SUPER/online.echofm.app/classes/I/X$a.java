package I;

import android.view.View;
import android.view.Window;

public abstract class X$a
  extends X.e
{
  public final Window a;
  public final View b;
  
  public X$a(Window paramWindow, View paramView)
  {
    a = paramWindow;
    b = paramView;
  }
  
  public void c(int paramInt)
  {
    View localView = a.getDecorView();
    localView.setSystemUiVisibility(paramInt | localView.getSystemUiVisibility());
  }
  
  public void d(int paramInt)
  {
    a.addFlags(paramInt);
  }
  
  public void e(int paramInt)
  {
    View localView = a.getDecorView();
    localView.setSystemUiVisibility(paramInt & localView.getSystemUiVisibility());
  }
  
  public void f(int paramInt)
  {
    a.clearFlags(paramInt);
  }
}

/* Location:
 * Qualified Name:     I.X.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */