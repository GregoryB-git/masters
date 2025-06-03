package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.core.view.ViewCompat;

class GhostViewPort$1
  implements ViewTreeObserver.OnPreDrawListener
{
  public GhostViewPort$1(GhostViewPort paramGhostViewPort) {}
  
  public boolean onPreDraw()
  {
    ViewCompat.postInvalidateOnAnimation(this$0);
    Object localObject1 = this$0;
    Object localObject2 = mStartParent;
    if (localObject2 != null)
    {
      localObject1 = mStartView;
      if (localObject1 != null)
      {
        ((ViewGroup)localObject2).endViewTransition((View)localObject1);
        ViewCompat.postInvalidateOnAnimation(this$0.mStartParent);
        localObject2 = this$0;
        mStartParent = null;
        mStartView = null;
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.transition.GhostViewPort.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */