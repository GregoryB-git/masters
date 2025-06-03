package s5;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;

public final class h
  extends WebView
{
  public h(Context paramContext)
  {
    super(paramContext, null);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    super.onTouchEvent(paramMotionEvent);
    return false;
  }
  
  public final boolean performClick()
  {
    super.performClick();
    return false;
  }
}

/* Location:
 * Qualified Name:     s5.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */