package androidx.appcompat.widget;

import android.view.View;
import android.view.View.OnFocusChangeListener;

public class SearchView$d
  implements View.OnFocusChangeListener
{
  public SearchView$d(SearchView paramSearchView) {}
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    paramView = a;
    View.OnFocusChangeListener localOnFocusChangeListener = b0;
    if (localOnFocusChangeListener != null) {
      localOnFocusChangeListener.onFocusChange(paramView, paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */