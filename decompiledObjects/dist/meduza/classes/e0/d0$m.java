package e0;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class d0$m
{
  public static final ArrayList<WeakReference<View>> d = new ArrayList();
  public WeakHashMap<View, Boolean> a = null;
  public SparseArray<WeakReference<View>> b = null;
  public WeakReference<KeyEvent> c = null;
  
  public static boolean b(View paramView, KeyEvent paramKeyEvent)
  {
    paramView = (ArrayList)paramView.getTag(2131362043);
    if (paramView != null) {
      for (int i = paramView.size() - 1; i >= 0; i--) {
        if (((d0.l)paramView.get(i)).a()) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final View a(View paramView, KeyEvent paramKeyEvent)
  {
    Object localObject = a;
    if ((localObject != null) && (((WeakHashMap)localObject).containsKey(paramView)))
    {
      if ((paramView instanceof ViewGroup))
      {
        localObject = (ViewGroup)paramView;
        int i = ((ViewGroup)localObject).getChildCount();
        View localView;
        do
        {
          i--;
          if (i < 0) {
            break;
          }
          localView = a(((ViewGroup)localObject).getChildAt(i), paramKeyEvent);
        } while (localView == null);
        return localView;
      }
      if (b(paramView, paramKeyEvent)) {
        return paramView;
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     e0.d0.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */