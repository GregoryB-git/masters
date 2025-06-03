package androidx.mediarouter.app;

import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatImageButton;

class MediaRouteExpandCollapseButton$1
  implements View.OnClickListener
{
  public MediaRouteExpandCollapseButton$1(MediaRouteExpandCollapseButton paramMediaRouteExpandCollapseButton) {}
  
  public void onClick(View paramView)
  {
    Object localObject = this$0;
    boolean bool = mIsGroupExpanded ^ true;
    mIsGroupExpanded = bool;
    if (bool)
    {
      ((AppCompatImageButton)localObject).setImageDrawable(mExpandAnimationDrawable);
      this$0.mExpandAnimationDrawable.start();
      localObject = this$0;
      ((View)localObject).setContentDescription(mCollapseGroupDescription);
    }
    else
    {
      ((AppCompatImageButton)localObject).setImageDrawable(mCollapseAnimationDrawable);
      this$0.mCollapseAnimationDrawable.start();
      localObject = this$0;
      ((View)localObject).setContentDescription(mExpandGroupDescription);
    }
    localObject = this$0.mListener;
    if (localObject != null) {
      ((View.OnClickListener)localObject).onClick(paramView);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteExpandCollapseButton.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */