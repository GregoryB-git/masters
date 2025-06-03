package androidx.appcompat.widget;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

class SearchView$6
  implements View.OnKeyListener
{
  public SearchView$6(SearchView paramSearchView) {}
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    SearchView localSearchView = this$0;
    if (mSearchable == null) {
      return false;
    }
    if ((mSearchSrcTextView.isPopupShowing()) && (this$0.mSearchSrcTextView.getListSelection() != -1)) {
      return this$0.onSuggestionsKey(paramView, paramInt, paramKeyEvent);
    }
    if ((!this$0.mSearchSrcTextView.isEmpty()) && (paramKeyEvent.hasNoModifiers()) && (paramKeyEvent.getAction() == 1) && (paramInt == 66))
    {
      paramView.cancelLongPress();
      paramView = this$0;
      paramView.launchQuerySearch(0, null, mSearchSrcTextView.getText().toString());
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */