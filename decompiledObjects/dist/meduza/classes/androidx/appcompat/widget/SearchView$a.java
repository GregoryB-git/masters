package androidx.appcompat.widget;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;

public final class SearchView$a
  implements TextWatcher
{
  public SearchView$a(SearchView paramSearchView) {}
  
  public final void afterTextChanged(Editable paramEditable) {}
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    SearchView localSearchView = a;
    Editable localEditable = x.getText();
    h0 = localEditable;
    boolean bool1 = TextUtils.isEmpty(localEditable) ^ true;
    localSearchView.u(bool1);
    boolean bool2 = f0;
    paramInt2 = 8;
    paramInt1 = paramInt2;
    if (bool2)
    {
      paramInt1 = paramInt2;
      if (!V)
      {
        paramInt1 = paramInt2;
        if ((bool1 ^ true))
        {
          C.setVisibility(8);
          paramInt1 = 0;
        }
      }
    }
    E.setVisibility(paramInt1);
    localSearchView.q();
    localSearchView.t();
    localSearchView.getClass();
    g0 = paramCharSequence.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */