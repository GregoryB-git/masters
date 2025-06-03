package androidx.appcompat.widget;

import androidx.cursoradapter.widget.CursorAdapter;

class SearchView$2
  implements Runnable
{
  public SearchView$2(SearchView paramSearchView) {}
  
  public void run()
  {
    CursorAdapter localCursorAdapter = this$0.mSuggestionsAdapter;
    if ((localCursorAdapter instanceof SuggestionsAdapter)) {
      localCursorAdapter.changeCursor(null);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */