package g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import b.a0;

public abstract class a
{
  public boolean a()
  {
    return false;
  }
  
  public abstract boolean b();
  
  public abstract void c(boolean paramBoolean);
  
  public abstract int d();
  
  public abstract Context e();
  
  public abstract void f();
  
  public boolean g()
  {
    return false;
  }
  
  public abstract boolean h();
  
  public abstract void i();
  
  public void j() {}
  
  public abstract boolean k(int paramInt, KeyEvent paramKeyEvent);
  
  public boolean l(KeyEvent paramKeyEvent)
  {
    return false;
  }
  
  public boolean m()
  {
    return false;
  }
  
  public abstract void n(ColorDrawable paramColorDrawable);
  
  public abstract void o(boolean paramBoolean);
  
  public abstract void p(boolean paramBoolean);
  
  public abstract void q(boolean paramBoolean);
  
  public abstract void r(CharSequence paramCharSequence);
  
  public abstract void s(CharSequence paramCharSequence);
  
  public abstract void t();
  
  public j.a u(g.e parame)
  {
    return null;
  }
  
  public static class a
    extends ViewGroup.MarginLayoutParams
  {
    public int a;
    
    public a()
    {
      super(-2);
      a = 8388627;
    }
    
    public a(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      a = 0;
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a0.o);
      a = paramContext.getInt(0, 0);
      paramContext.recycle();
    }
    
    public a(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
      a = 0;
    }
    
    public a(a parama)
    {
      super();
      a = 0;
      a = a;
    }
  }
  
  public static abstract interface b
  {
    public abstract void a();
  }
}

/* Location:
 * Qualified Name:     g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */