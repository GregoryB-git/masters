package com.facebook.drawee.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.facebook.drawee.generic.GenericDraweeHierarchy;

class DraweeTransition$2
  extends AnimatorListenerAdapter
{
  public DraweeTransition$2(DraweeTransition paramDraweeTransition, GenericDraweeView paramGenericDraweeView) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    ((GenericDraweeHierarchy)val$draweeView.getHierarchy()).setActualImageScaleType(DraweeTransition.access$000(this$0));
    if (DraweeTransition.access$100(this$0) != null) {
      ((GenericDraweeHierarchy)val$draweeView.getHierarchy()).setActualImageFocusPoint(DraweeTransition.access$100(this$0));
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.view.DraweeTransition.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */