package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.view.menu.i;
import k.f;
import l.b1;
import l.l0;
import l.p;
import y.a.a;

public final class a$d
  extends p
  implements ActionMenuView.a
{
  public a$d(a parama, Context paramContext)
  {
    super(paramContext, null, 2130968607);
    setClickable(true);
    setFocusable(true);
    setVisibility(0);
    setEnabled(true);
    b1.a(this, getContentDescription());
    setOnTouchListener(new a(this));
  }
  
  public final boolean a()
  {
    return false;
  }
  
  public final boolean b()
  {
    return false;
  }
  
  public final boolean performClick()
  {
    if (super.performClick()) {
      return true;
    }
    playSoundEffect(0);
    d.l();
    return true;
  }
  
  public final boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
    Drawable localDrawable1 = getDrawable();
    Drawable localDrawable2 = getBackground();
    if ((localDrawable1 != null) && (localDrawable2 != null))
    {
      int i = getWidth();
      paramInt3 = getHeight();
      paramInt1 = Math.max(i, paramInt3) / 2;
      int j = getPaddingLeft();
      int k = getPaddingRight();
      paramInt2 = getPaddingTop();
      paramInt4 = getPaddingBottom();
      k = (i + (j - k)) / 2;
      paramInt2 = (paramInt3 + (paramInt2 - paramInt4)) / 2;
      a.a.f(localDrawable2, k - paramInt1, paramInt2 - paramInt1, k + paramInt1, paramInt2 + paramInt1);
    }
    return bool;
  }
  
  public final class a
    extends l0
  {
    public a(View paramView)
    {
      super();
    }
    
    public final f b()
    {
      a.e locale = d.A;
      if (locale == null) {
        return null;
      }
      return locale.a();
    }
    
    public final boolean c()
    {
      d.l();
      return true;
    }
    
    public final boolean d()
    {
      a locala = d;
      if (C != null) {
        return false;
      }
      locala.h();
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */