package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.AutoCompleteTextView;
import l.f1;

public final class SearchView$e
  implements View.OnLayoutChangeListener
{
  public SearchView$e(SearchView paramSearchView) {}
  
  public final void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    SearchView localSearchView = a;
    if (F.getWidth() > 1)
    {
      paramView = localSearchView.getContext().getResources();
      paramInt3 = z.getPaddingLeft();
      Rect localRect = new Rect();
      boolean bool = f1.a(localSearchView);
      if (U)
      {
        paramInt1 = paramView.getDimensionPixelSize(2131165225);
        paramInt1 = paramView.getDimensionPixelSize(2131165226) + paramInt1;
      }
      else
      {
        paramInt1 = 0;
      }
      x.getDropDownBackground().getPadding(localRect);
      if (bool) {
        paramInt2 = -left;
      } else {
        paramInt2 = paramInt3 - (left + paramInt1);
      }
      x.setDropDownHorizontalOffset(paramInt2);
      paramInt5 = F.getWidth();
      paramInt4 = left;
      paramInt2 = right;
      x.setDropDownWidth(paramInt5 + paramInt4 + paramInt2 + paramInt1 - paramInt3);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */