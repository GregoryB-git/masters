package com.facebook.drawee.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.graphics.PointF;
import android.graphics.Rect;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.drawable.ScalingUtils.InterpolatingScaleType;
import com.facebook.drawee.drawable.ScalingUtils.ScaleType;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import java.util.Map;
import javax.annotation.Nullable;

@TargetApi(19)
public class DraweeTransition
  extends Transition
{
  private static final String PROPNAME_BOUNDS = "draweeTransition:bounds";
  @Nullable
  private final PointF mFromFocusPoint;
  private final ScalingUtils.ScaleType mFromScale;
  @Nullable
  private final PointF mToFocusPoint;
  private final ScalingUtils.ScaleType mToScale;
  
  public DraweeTransition(ScalingUtils.ScaleType paramScaleType1, ScalingUtils.ScaleType paramScaleType2)
  {
    this(paramScaleType1, paramScaleType2, null, null);
  }
  
  public DraweeTransition(ScalingUtils.ScaleType paramScaleType1, ScalingUtils.ScaleType paramScaleType2, @Nullable PointF paramPointF1, @Nullable PointF paramPointF2)
  {
    mFromScale = paramScaleType1;
    mToScale = paramScaleType2;
    mFromFocusPoint = paramPointF1;
    mToFocusPoint = paramPointF2;
  }
  
  private void captureValues(TransitionValues paramTransitionValues)
  {
    if ((view instanceof GenericDraweeView)) {
      values.put("draweeTransition:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
    }
  }
  
  public static TransitionSet createTransitionSet(ScalingUtils.ScaleType paramScaleType1, ScalingUtils.ScaleType paramScaleType2)
  {
    return createTransitionSet(paramScaleType1, paramScaleType2, null, null);
  }
  
  public static TransitionSet createTransitionSet(ScalingUtils.ScaleType paramScaleType1, ScalingUtils.ScaleType paramScaleType2, @Nullable PointF paramPointF1, @Nullable PointF paramPointF2)
  {
    TransitionSet localTransitionSet = new TransitionSet();
    localTransitionSet.addTransition(new ChangeBounds());
    localTransitionSet.addTransition(new DraweeTransition(paramScaleType1, paramScaleType2, paramPointF1, paramPointF2));
    return localTransitionSet;
  }
  
  public void captureEndValues(TransitionValues paramTransitionValues)
  {
    captureValues(paramTransitionValues);
  }
  
  public void captureStartValues(TransitionValues paramTransitionValues)
  {
    captureValues(paramTransitionValues);
  }
  
  public Animator createAnimator(final ViewGroup paramViewGroup, final TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    if ((paramTransitionValues1 != null) && (paramTransitionValues2 != null))
    {
      Rect localRect1 = (Rect)values.get("draweeTransition:bounds");
      Rect localRect2 = (Rect)values.get("draweeTransition:bounds");
      if ((localRect1 != null) && (localRect2 != null))
      {
        paramTransitionValues2 = mFromScale;
        ScalingUtils.ScaleType localScaleType = mToScale;
        if ((paramTransitionValues2 == localScaleType) && (mFromFocusPoint == mToFocusPoint)) {
          return null;
        }
        paramViewGroup = (GenericDraweeView)view;
        paramTransitionValues1 = new ScalingUtils.InterpolatingScaleType(paramTransitionValues2, localScaleType, localRect1, localRect2, mFromFocusPoint, mToFocusPoint);
        ((GenericDraweeHierarchy)paramViewGroup.getHierarchy()).setActualImageScaleType(paramTransitionValues1);
        paramTransitionValues2 = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
        paramTransitionValues2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
        {
          public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
          {
            float f = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
            paramTransitionValues1.setValue(f);
          }
        });
        paramTransitionValues2.addListener(new AnimatorListenerAdapter()
        {
          public void onAnimationEnd(Animator paramAnonymousAnimator)
          {
            ((GenericDraweeHierarchy)paramViewGroup.getHierarchy()).setActualImageScaleType(DraweeTransition.access$000(DraweeTransition.this));
            if (DraweeTransition.access$100(DraweeTransition.this) != null) {
              ((GenericDraweeHierarchy)paramViewGroup.getHierarchy()).setActualImageFocusPoint(DraweeTransition.access$100(DraweeTransition.this));
            }
          }
        });
        return paramTransitionValues2;
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.view.DraweeTransition
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */