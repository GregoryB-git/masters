package androidx.appcompat.widget;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

class SearchView$7
  implements TextView.OnEditorActionListener
{
  public SearchView$7(SearchView paramSearchView) {}
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    this$0.onSubmitQuery();
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */