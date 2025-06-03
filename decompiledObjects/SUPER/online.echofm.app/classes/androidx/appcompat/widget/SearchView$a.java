package androidx.appcompat.widget;

import android.text.Editable;
import android.text.TextWatcher;

public class SearchView$a
  implements TextWatcher
{
  public SearchView$a(SearchView paramSearchView) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    o.V(paramCharSequence);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */