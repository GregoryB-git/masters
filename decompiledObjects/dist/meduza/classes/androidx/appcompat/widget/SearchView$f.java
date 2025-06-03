package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public final class SearchView$f
  implements View.OnClickListener
{
  public SearchView$f(SearchView paramSearchView) {}
  
  public final void onClick(View paramView)
  {
    SearchView localSearchView = a;
    if (paramView == B)
    {
      localSearchView.v(false);
      x.requestFocus();
      x.setImeVisibility(true);
      paramView = T;
      if (paramView != null) {
        paramView.onClick(localSearchView);
      }
    }
    else if (paramView == D)
    {
      localSearchView.l();
    }
    else if (paramView == C)
    {
      localSearchView.p();
    }
    else if (paramView == E)
    {
      SearchableInfo localSearchableInfo = k0;
      if (localSearchableInfo != null) {
        try
        {
          if (localSearchableInfo.getVoiceSearchLaunchWebSearch())
          {
            paramView = P;
            Intent localIntent = new android/content/Intent;
            localIntent.<init>(paramView);
            paramView = localSearchableInfo.getSearchActivity();
            if (paramView == null) {
              paramView = null;
            } else {
              paramView = paramView.flattenToShortString();
            }
            localIntent.putExtra("calling_package", paramView);
            localSearchView.getContext().startActivity(localIntent);
          }
          else if (localSearchableInfo.getVoiceSearchLaunchRecognizer())
          {
            paramView = localSearchView.j(Q, localSearchableInfo);
            localSearchView.getContext().startActivity(paramView);
          }
        }
        catch (ActivityNotFoundException paramView)
        {
          Log.w("SearchView", "Could not find voice search activity");
        }
      }
    }
    else if (paramView == x)
    {
      localSearchView.k();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */