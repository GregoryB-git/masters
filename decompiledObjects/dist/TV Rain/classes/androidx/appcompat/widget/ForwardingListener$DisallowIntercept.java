package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;

class ForwardingListener$DisallowIntercept
  implements Runnable
{
  public ForwardingListener$DisallowIntercept(ForwardingListener paramForwardingListener) {}
  
  public void run()
  {
    ViewParent localViewParent = this$0.mSrc.getParent();
    if (localViewParent != null) {
      localViewParent.requestDisallowInterceptTouchEvent(true);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ForwardingListener.DisallowIntercept
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */