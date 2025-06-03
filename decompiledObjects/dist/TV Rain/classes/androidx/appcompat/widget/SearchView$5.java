package androidx.appcompat.widget;

import android.view.View;
import android.view.View.OnClickListener;

class SearchView$5
  implements View.OnClickListener
{
  public SearchView$5(SearchView paramSearchView) {}
  
  public void onClick(View paramView)
  {
    SearchView localSearchView = this$0;
    if (paramView == mSearchButton) {
      localSearchView.onSearchClicked();
    } else if (paramView == mCloseButton) {
      localSearchView.onCloseClicked();
    } else if (paramView == mGoButton) {
      localSearchView.onSubmitQuery();
    } else if (paramView == mVoiceButton) {
      localSearchView.onVoiceClicked();
    } else if (paramView == mSearchSrcTextView) {
      localSearchView.forceSuggestionQuery();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */