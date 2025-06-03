package l;

import L.g;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

public class i
  extends PopupWindow
{
  public static final boolean b = false;
  public boolean a;
  
  public i(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  public final void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    paramContext = X.s(paramContext, paramAttributeSet, e.i.w1, paramInt1, paramInt2);
    if (paramContext.p(e.i.y1)) {
      b(paramContext.a(e.i.y1, false));
    }
    setBackgroundDrawable(paramContext.f(e.i.x1));
    paramContext.t();
  }
  
  public final void b(boolean paramBoolean)
  {
    if (b) {
      a = paramBoolean;
    } else {
      g.a(this, paramBoolean);
    }
  }
  
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (b)
    {
      i = paramInt2;
      if (a) {
        i = paramInt2 - paramView.getHeight();
      }
    }
    super.showAsDropDown(paramView, paramInt1, i);
  }
  
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2;
    if (b)
    {
      i = paramInt2;
      if (a) {
        i = paramInt2 - paramView.getHeight();
      }
    }
    super.showAsDropDown(paramView, paramInt1, i, paramInt3);
  }
  
  public void update(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt2;
    if (b)
    {
      i = paramInt2;
      if (a) {
        i = paramInt2 - paramView.getHeight();
      }
    }
    super.update(paramView, paramInt1, i, paramInt3, paramInt4);
  }
}

/* Location:
 * Qualified Name:     l.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */