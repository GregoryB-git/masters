package I;

import android.view.View;
import android.view.ViewParent;

public class k
{
  public ViewParent a;
  public ViewParent b;
  public final View c;
  public boolean d;
  public int[] e;
  
  public k(View paramView)
  {
    c = paramView;
  }
  
  public boolean a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (j())
    {
      ViewParent localViewParent = g(0);
      if (localViewParent != null) {
        return w.a(localViewParent, c, paramFloat1, paramFloat2, paramBoolean);
      }
    }
    return false;
  }
  
  public boolean b(float paramFloat1, float paramFloat2)
  {
    if (j())
    {
      ViewParent localViewParent = g(0);
      if (localViewParent != null) {
        return w.b(localViewParent, c, paramFloat1, paramFloat2);
      }
    }
    return false;
  }
  
  public boolean c(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt3)
  {
    boolean bool1 = j();
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      ViewParent localViewParent = g(paramInt3);
      if (localViewParent == null) {
        return false;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        bool3 = bool2;
        if (paramArrayOfInt2 != null)
        {
          paramArrayOfInt2[0] = 0;
          paramArrayOfInt2[1] = 0;
          bool3 = bool2;
        }
      }
      else
      {
        int i;
        int j;
        if (paramArrayOfInt2 != null)
        {
          c.getLocationInWindow(paramArrayOfInt2);
          i = paramArrayOfInt2[0];
          j = paramArrayOfInt2[1];
        }
        else
        {
          i = 0;
          j = i;
        }
        int[] arrayOfInt = paramArrayOfInt1;
        if (paramArrayOfInt1 == null) {
          arrayOfInt = h();
        }
        arrayOfInt[0] = 0;
        arrayOfInt[1] = 0;
        w.c(localViewParent, c, paramInt1, paramInt2, arrayOfInt, paramInt3);
        if (paramArrayOfInt2 != null)
        {
          c.getLocationInWindow(paramArrayOfInt2);
          paramArrayOfInt2[0] -= i;
          paramArrayOfInt2[1] -= j;
        }
        if (arrayOfInt[0] == 0)
        {
          bool3 = bool2;
          if (arrayOfInt[1] == 0) {}
        }
        else
        {
          bool3 = true;
        }
      }
    }
    return bool3;
  }
  
  public void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt1, int paramInt5, int[] paramArrayOfInt2)
  {
    f(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt1, paramInt5, paramArrayOfInt2);
  }
  
  public boolean e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return f(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, 0, null);
  }
  
  public final boolean f(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt1, int paramInt5, int[] paramArrayOfInt2)
  {
    if (j())
    {
      ViewParent localViewParent = g(paramInt5);
      if (localViewParent == null) {
        return false;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0) && (paramInt3 == 0) && (paramInt4 == 0))
      {
        if (paramArrayOfInt1 != null)
        {
          paramArrayOfInt1[0] = 0;
          paramArrayOfInt1[1] = 0;
        }
      }
      else
      {
        int i;
        int j;
        int k;
        if (paramArrayOfInt1 != null)
        {
          c.getLocationInWindow(paramArrayOfInt1);
          i = paramArrayOfInt1[0];
          j = paramArrayOfInt1[1];
          k = j;
        }
        else
        {
          j = 0;
          k = j;
          i = j;
        }
        if (paramArrayOfInt2 == null)
        {
          paramArrayOfInt2 = h();
          paramArrayOfInt2[0] = 0;
          paramArrayOfInt2[1] = 0;
        }
        w.d(localViewParent, c, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramArrayOfInt2);
        if (paramArrayOfInt1 != null)
        {
          c.getLocationInWindow(paramArrayOfInt1);
          paramArrayOfInt1[0] -= i;
          paramArrayOfInt1[1] -= k;
        }
        return true;
      }
    }
    return false;
  }
  
  public final ViewParent g(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1) {
        return null;
      }
      return b;
    }
    return a;
  }
  
  public final int[] h()
  {
    if (e == null) {
      e = new int[2];
    }
    return e;
  }
  
  public boolean i(int paramInt)
  {
    boolean bool;
    if (g(paramInt) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean j()
  {
    return d;
  }
  
  public void k(boolean paramBoolean)
  {
    if (d) {
      s.L(c);
    }
    d = paramBoolean;
  }
  
  public final void l(int paramInt, ViewParent paramViewParent)
  {
    if (paramInt != 0)
    {
      if (paramInt == 1) {
        b = paramViewParent;
      }
    }
    else {
      a = paramViewParent;
    }
  }
  
  public boolean m(int paramInt1, int paramInt2)
  {
    if (i(paramInt2)) {
      return true;
    }
    if (j())
    {
      ViewParent localViewParent = c.getParent();
      View localView = c;
      while (localViewParent != null)
      {
        if (w.f(localViewParent, localView, c, paramInt1, paramInt2))
        {
          l(paramInt2, localViewParent);
          w.e(localViewParent, localView, c, paramInt1, paramInt2);
          return true;
        }
        if ((localViewParent instanceof View)) {
          localView = (View)localViewParent;
        }
        localViewParent = localViewParent.getParent();
      }
    }
    return false;
  }
  
  public void n(int paramInt)
  {
    ViewParent localViewParent = g(paramInt);
    if (localViewParent != null)
    {
      w.g(localViewParent, c, paramInt);
      l(paramInt, null);
    }
  }
}

/* Location:
 * Qualified Name:     I.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */