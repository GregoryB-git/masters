package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final class SearchView$SearchAutoComplete$a
  implements Runnable
{
  public SearchView$SearchAutoComplete$a(SearchView.SearchAutoComplete paramSearchAutoComplete) {}
  
  public final void run()
  {
    SearchView.SearchAutoComplete localSearchAutoComplete = a;
    if (o)
    {
      ((InputMethodManager)localSearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(localSearchAutoComplete, 0);
      o = false;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.SearchAutoComplete.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */