package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

public final class SearchView$q
  extends TouchDelegate
{
  public final View a;
  public final Rect b;
  public final Rect c;
  public final Rect d;
  public final int e;
  public boolean f;
  
  public SearchView$q(Rect paramRect1, Rect paramRect2, SearchView.SearchAutoComplete paramSearchAutoComplete)
  {
    super(paramRect1, paramSearchAutoComplete);
    int i = ViewConfiguration.get(paramSearchAutoComplete.getContext()).getScaledTouchSlop();
    e = i;
    Rect localRect1 = new Rect();
    b = localRect1;
    Rect localRect2 = new Rect();
    d = localRect2;
    Rect localRect3 = new Rect();
    c = localRect3;
    localRect1.set(paramRect1);
    localRect2.set(paramRect1);
    i = -i;
    localRect2.inset(i, i);
    localRect3.set(paramRect2);
    a = paramSearchAutoComplete;
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = (int)paramMotionEvent.getX();
    int j = (int)paramMotionEvent.getY();
    int k = paramMotionEvent.getAction();
    boolean bool1 = true;
    boolean bool2 = false;
    if (k != 0)
    {
      if ((k != 1) && (k != 2))
      {
        if (k != 3) {
          break label134;
        }
        bool1 = f;
        f = false;
      }
      else
      {
        bool3 = f;
        bool1 = bool3;
        if (bool3)
        {
          bool1 = bool3;
          if (!d.contains(i, j))
          {
            bool1 = bool3;
            k = 0;
            break label140;
          }
        }
      }
      k = 1;
      break label140;
    }
    else if (b.contains(i, j))
    {
      f = true;
      k = 1;
      break label140;
    }
    label134:
    k = 1;
    bool1 = false;
    label140:
    boolean bool3 = bool2;
    if (bool1)
    {
      float f1;
      if ((k != 0) && (!c.contains(i, j)))
      {
        f1 = a.getWidth() / 2;
        k = a.getHeight() / 2;
      }
      else
      {
        Rect localRect = c;
        f1 = i - left;
        k = j - top;
      }
      paramMotionEvent.setLocation(f1, k);
      bool3 = a.dispatchTouchEvent(paramMotionEvent);
    }
    return bool3;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */