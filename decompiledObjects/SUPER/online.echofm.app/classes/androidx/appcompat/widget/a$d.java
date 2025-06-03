package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.view.menu.f;
import k.c;
import l.E;
import l.Z;

public class a$d
  extends AppCompatImageView
  implements ActionMenuView.a
{
  public a$d(final a parama, Context paramContext)
  {
    super(paramContext, null, e.a.e);
    setClickable(true);
    setFocusable(true);
    setVisibility(0);
    setEnabled(true);
    Z.a(this, getContentDescription());
    setOnTouchListener(new a(this, parama));
  }
  
  public boolean b()
  {
    return false;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean performClick()
  {
    if (super.performClick()) {
      return true;
    }
    playSoundEffect(0);
    q.H();
    return true;
  }
  
  public boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
    Drawable localDrawable1 = getDrawable();
    Drawable localDrawable2 = getBackground();
    if ((localDrawable1 != null) && (localDrawable2 != null))
    {
      int i = getWidth();
      paramInt2 = getHeight();
      paramInt1 = Math.max(i, paramInt2) / 2;
      int j = getPaddingLeft();
      int k = getPaddingRight();
      paramInt4 = getPaddingTop();
      paramInt3 = getPaddingBottom();
      j = (i + (j - k)) / 2;
      paramInt2 = (paramInt2 + (paramInt4 - paramInt3)) / 2;
      B.a.k(localDrawable2, j - paramInt1, paramInt2 - paramInt1, j + paramInt1, paramInt2 + paramInt1);
    }
    return bool;
  }
  
  public class a
    extends E
  {
    public a(View paramView, a parama)
    {
      super();
    }
    
    public c b()
    {
      a.e locale = q.L;
      if (locale == null) {
        return null;
      }
      return locale.c();
    }
    
    public boolean c()
    {
      q.H();
      return true;
    }
    
    public boolean d()
    {
      a locala = q;
      if (N != null) {
        return false;
      }
      locala.z();
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */