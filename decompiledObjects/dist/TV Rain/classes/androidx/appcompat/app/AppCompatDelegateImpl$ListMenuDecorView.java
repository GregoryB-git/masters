package androidx.appcompat.app;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.ContentFrameLayout;

class AppCompatDelegateImpl$ListMenuDecorView
  extends ContentFrameLayout
{
  public AppCompatDelegateImpl$ListMenuDecorView(AppCompatDelegateImpl paramAppCompatDelegateImpl, Context paramContext)
  {
    super(paramContext);
  }
  
  private boolean isOutOfBounds(int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((paramInt1 >= -5) && (paramInt2 >= -5) && (paramInt1 <= getWidth() + 5) && (paramInt2 <= getHeight() + 5)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool;
    if ((!this$0.dispatchKeyEvent(paramKeyEvent)) && (!super.dispatchKeyEvent(paramKeyEvent))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((paramMotionEvent.getAction() == 0) && (isOutOfBounds((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())))
    {
      this$0.closePanel(0);
      return true;
    }
    return super.onInterceptTouchEvent(paramMotionEvent);
  }
  
  public void setBackgroundResource(int paramInt)
  {
    setBackgroundDrawable(AppCompatResources.getDrawable(getContext(), paramInt));
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.ListMenuDecorView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */