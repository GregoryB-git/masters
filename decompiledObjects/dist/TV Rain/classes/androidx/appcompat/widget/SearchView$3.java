package androidx.appcompat.widget;

import android.view.View;
import android.view.View.OnFocusChangeListener;

class SearchView$3
  implements View.OnFocusChangeListener
{
  public SearchView$3(SearchView paramSearchView) {}
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    paramView = this$0;
    View.OnFocusChangeListener localOnFocusChangeListener = mOnQueryTextFocusChangeListener;
    if (localOnFocusChangeListener != null) {
      localOnFocusChangeListener.onFocusChange(paramView, paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */