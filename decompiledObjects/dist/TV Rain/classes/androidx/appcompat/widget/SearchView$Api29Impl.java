package androidx.appcompat.widget;

import android.widget.AutoCompleteTextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import o3;

@RequiresApi(29)
class SearchView$Api29Impl
{
  @DoNotInline
  public static void refreshAutoCompleteResults(AutoCompleteTextView paramAutoCompleteTextView)
  {
    o3.y(paramAutoCompleteTextView);
  }
  
  @DoNotInline
  public static void setInputMethodMode(SearchView.SearchAutoComplete paramSearchAutoComplete, int paramInt)
  {
    paramSearchAutoComplete.setInputMethodMode(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.Api29Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */