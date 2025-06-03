package I;

import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import t.h;

public final class X
{
  public final e a;
  
  public X(Window paramWindow, View paramView)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 30)
    {
      a = new d(paramWindow, this);
    }
    else
    {
      if (i >= 26) {}
      for (paramWindow = new c(paramWindow, paramView);; paramWindow = new b(paramWindow, paramView))
      {
        a = paramWindow;
        break;
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    a.a(paramBoolean);
  }
  
  public void b(boolean paramBoolean)
  {
    a.b(paramBoolean);
  }
  
  public static abstract class a
    extends X.e
  {
    public final Window a;
    public final View b;
    
    public a(Window paramWindow, View paramView)
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
  
  public static class b
    extends X.a
  {
    public b(Window paramWindow, View paramView)
    {
      super(paramView);
    }
    
    public void b(boolean paramBoolean)
    {
      if (paramBoolean)
      {
        f(67108864);
        d(Integer.MIN_VALUE);
        c(8192);
      }
      else
      {
        e(8192);
      }
    }
  }
  
  public static class c
    extends X.b
  {
    public c(Window paramWindow, View paramView)
    {
      super(paramView);
    }
    
    public void a(boolean paramBoolean)
    {
      if (paramBoolean)
      {
        f(134217728);
        d(Integer.MIN_VALUE);
        c(16);
      }
      else
      {
        e(16);
      }
    }
  }
  
  public static class d
    extends X.e
  {
    public final X a;
    public final WindowInsetsController b;
    public final h c = new h();
    public Window d;
    
    public d(Window paramWindow, X paramX)
    {
      this(Y.a(paramWindow), paramX);
      d = paramWindow;
    }
    
    public d(WindowInsetsController paramWindowInsetsController, X paramX)
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
  
  public static abstract class e
  {
    public void a(boolean paramBoolean) {}
    
    public abstract void b(boolean paramBoolean);
  }
}

/* Location:
 * Qualified Name:     I.X
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */