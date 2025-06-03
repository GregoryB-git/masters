package androidx.appcompat.widget;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

public class SearchView$g
  implements View.OnKeyListener
{
  public SearchView$g(SearchView paramSearchView) {}
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    SearchView localSearchView = o;
    if (q0 == null) {
      return false;
    }
    if ((D.isPopupShowing()) && (o.D.getListSelection() != -1)) {
      return o.U(paramView, paramInt, paramKeyEvent);
    }
    if ((!o.D.b()) && (paramKeyEvent.hasNoModifiers()) && (paramKeyEvent.getAction() == 1) && (paramInt == 66))
    {
      paramView.cancelLongPress();
      paramView = o;
      paramView.M(0, null, D.getText().toString());
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */