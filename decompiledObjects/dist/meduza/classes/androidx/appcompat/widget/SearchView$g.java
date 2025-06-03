package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

public final class SearchView$g
  implements View.OnKeyListener
{
  public SearchView$g(SearchView paramSearchView) {}
  
  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    SearchView localSearchView = a;
    SearchableInfo localSearchableInfo = k0;
    boolean bool1 = false;
    if (localSearchableInfo == null) {
      return false;
    }
    if ((x.isPopupShowing()) && (a.x.getListSelection() != -1))
    {
      paramView = a;
      boolean bool2;
      if (k0 == null)
      {
        bool2 = bool1;
      }
      else if (W == null)
      {
        bool2 = bool1;
      }
      else
      {
        bool2 = bool1;
        if (paramKeyEvent.getAction() == 0)
        {
          bool2 = bool1;
          if (paramKeyEvent.hasNoModifiers()) {
            if ((paramInt != 66) && (paramInt != 84) && (paramInt != 61))
            {
              if ((paramInt != 21) && (paramInt != 22))
              {
                bool2 = bool1;
                if (paramInt == 19)
                {
                  x.getListSelection();
                  bool2 = bool1;
                }
              }
              else
              {
                if (paramInt == 21) {
                  paramInt = 0;
                } else {
                  paramInt = x.length();
                }
                x.setSelection(paramInt);
                x.setListSelection(0);
                x.clearListSelection();
                x.a();
                bool2 = true;
              }
            }
            else {
              bool2 = paramView.m(x.getListSelection());
            }
          }
        }
      }
      return bool2;
    }
    int i;
    if (TextUtils.getTrimmedLength(a.x.getText()) == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i == 0) && (paramKeyEvent.hasNoModifiers()) && (paramKeyEvent.getAction() == 1) && (paramInt == 66))
    {
      paramView.cancelLongPress();
      paramView = a;
      paramKeyEvent = paramView.i("android.intent.action.SEARCH", null, null, x.getText().toString());
      paramView.getContext().startActivity(paramKeyEvent);
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