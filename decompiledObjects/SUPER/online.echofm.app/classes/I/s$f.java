package I;

import android.os.Build.VERSION;
import android.view.View;

public abstract class s$f
{
  public final int a;
  public final Class b;
  public final int c;
  public final int d;
  
  public s$f(int paramInt1, Class paramClass, int paramInt2)
  {
    this(paramInt1, paramClass, 0, paramInt2);
  }
  
  public s$f(int paramInt1, Class paramClass, int paramInt2, int paramInt3)
  {
    a = paramInt1;
    b = paramClass;
    d = paramInt2;
    c = paramInt3;
  }
  
  public final boolean a()
  {
    return true;
  }
  
  public final boolean b()
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= c) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public abstract Object c(View paramView);
  
  public Object d(View paramView)
  {
    if (b()) {
      return c(paramView);
    }
    if (a())
    {
      paramView = paramView.getTag(a);
      if (b.isInstance(paramView)) {
        return paramView;
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     I.s.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */