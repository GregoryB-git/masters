package androidx.cardview.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import s.b;

public class CardView$a
  implements b
{
  public Drawable a;
  
  public CardView$a(CardView paramCardView) {}
  
  public View a()
  {
    return b;
  }
  
  public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    b.t.set(paramInt1, paramInt2, paramInt3, paramInt4);
    CardView localCardView = b;
    Rect localRect = s;
    CardView.a(localCardView, paramInt1 + left, paramInt2 + top, paramInt3 + right, paramInt4 + bottom);
  }
  
  public void c(Drawable paramDrawable)
  {
    a = paramDrawable;
    b.setBackgroundDrawable(paramDrawable);
  }
  
  public boolean d()
  {
    return b.getPreventCornerOverlap();
  }
  
  public boolean e()
  {
    return b.getUseCompatPadding();
  }
  
  public Drawable f()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     androidx.cardview.widget.CardView.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */