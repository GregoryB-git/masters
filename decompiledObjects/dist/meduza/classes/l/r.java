package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import b.a0;
import j0.g;
import x6.b;

public final class r
  extends PopupWindow
{
  public r(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a0.F, paramInt1, paramInt2);
    if (paramAttributeSet.hasValue(2)) {
      g.c(this, paramAttributeSet.getBoolean(2, false));
    }
    if (paramAttributeSet.hasValue(0))
    {
      paramInt1 = paramAttributeSet.getResourceId(0, 0);
      if (paramInt1 != 0)
      {
        paramContext = b.X(paramContext, paramInt1);
        break label73;
      }
    }
    paramContext = paramAttributeSet.getDrawable(0);
    label73:
    setBackgroundDrawable(paramContext);
    paramAttributeSet.recycle();
  }
  
  public final void showAsDropDown(View paramView, int paramInt1, int paramInt2)
  {
    super.showAsDropDown(paramView, paramInt1, paramInt2);
  }
  
  public final void showAsDropDown(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    super.showAsDropDown(paramView, paramInt1, paramInt2, paramInt3);
  }
  
  public final void update(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.update(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
}

/* Location:
 * Qualified Name:     l.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */