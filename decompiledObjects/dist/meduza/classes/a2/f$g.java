package a2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

public final class f$g
  extends Drawable.ConstantState
{
  public int a;
  public f.f b;
  public ColorStateList c = null;
  public PorterDuff.Mode d = f.r;
  public boolean e;
  public Bitmap f;
  public ColorStateList g;
  public PorterDuff.Mode h;
  public int i;
  public boolean j;
  public boolean k;
  public Paint l;
  
  public f$g()
  {
    b = new f.f();
  }
  
  public f$g(g paramg)
  {
    if (paramg != null)
    {
      a = a;
      f.f localf = new f.f(b);
      b = localf;
      if (b.e != null) {
        e = new Paint(b.e);
      }
      if (b.d != null) {
        b.d = new Paint(b.d);
      }
      c = c;
      d = d;
      e = e;
    }
  }
  
  public int getChangingConfigurations()
  {
    return a;
  }
  
  public final Drawable newDrawable()
  {
    return new f(this);
  }
  
  public final Drawable newDrawable(Resources paramResources)
  {
    return new f(this);
  }
}

/* Location:
 * Qualified Name:     a2.f.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */