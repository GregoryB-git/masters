package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import java.util.Map;

public class ChangeClipBounds
  extends Transition
{
  private static final String PROPNAME_BOUNDS = "android:clipBounds:bounds";
  private static final String PROPNAME_CLIP = "android:clipBounds:clip";
  private static final String[] sTransitionProperties = { "android:clipBounds:clip" };
  
  public ChangeClipBounds() {}
  
  public ChangeClipBounds(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void captureValues(TransitionValues paramTransitionValues)
  {
    Object localObject = view;
    if (((View)localObject).getVisibility() == 8) {
      return;
    }
    Rect localRect = ViewCompat.getClipBounds((View)localObject);
    values.put("android:clipBounds:clip", localRect);
    if (localRect == null)
    {
      localObject = new Rect(0, 0, ((View)localObject).getWidth(), ((View)localObject).getHeight());
      values.put("android:clipBounds:bounds", localObject);
    }
  }
  
  public void captureEndValues(@NonNull TransitionValues paramTransitionValues)
  {
    captureValues(paramTransitionValues);
  }
  
  public void captureStartValues(@NonNull TransitionValues paramTransitionValues)
  {
    captureValues(paramTransitionValues);
  }
  
  public Animator createAnimator(@NonNull ViewGroup paramViewGroup, TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    Object localObject = null;
    paramViewGroup = (ViewGroup)localObject;
    if (paramTransitionValues1 != null)
    {
      paramViewGroup = (ViewGroup)localObject;
      if (paramTransitionValues2 != null)
      {
        paramViewGroup = (ViewGroup)localObject;
        if (values.containsKey("android:clipBounds:clip")) {
          if (!values.containsKey("android:clipBounds:clip"))
          {
            paramViewGroup = (ViewGroup)localObject;
          }
          else
          {
            Rect localRect = (Rect)values.get("android:clipBounds:clip");
            localObject = (Rect)values.get("android:clipBounds:clip");
            int i;
            if (localObject == null) {
              i = 1;
            } else {
              i = 0;
            }
            if ((localRect == null) && (localObject == null)) {
              return null;
            }
            if (localRect == null)
            {
              paramTransitionValues1 = (Rect)values.get("android:clipBounds:bounds");
              paramViewGroup = (ViewGroup)localObject;
            }
            else
            {
              paramTransitionValues1 = localRect;
              paramViewGroup = (ViewGroup)localObject;
              if (localObject == null)
              {
                paramViewGroup = (Rect)values.get("android:clipBounds:bounds");
                paramTransitionValues1 = localRect;
              }
            }
            if (paramTransitionValues1.equals(paramViewGroup)) {
              return null;
            }
            ViewCompat.setClipBounds(view, paramTransitionValues1);
            localObject = new RectEvaluator(new Rect());
            paramTransitionValues1 = ObjectAnimator.ofObject(view, ViewUtils.CLIP_BOUNDS, (TypeEvaluator)localObject, new Rect[] { paramTransitionValues1, paramViewGroup });
            paramViewGroup = paramTransitionValues1;
            if (i != 0)
            {
              paramTransitionValues1.addListener(new AnimatorListenerAdapter()
              {
                public void onAnimationEnd(Animator paramAnonymousAnimator)
                {
                  ViewCompat.setClipBounds(val$endView, null);
                }
              });
              paramViewGroup = paramTransitionValues1;
            }
          }
        }
      }
    }
    return paramViewGroup;
  }
  
  public String[] getTransitionProperties()
  {
    return sTransitionProperties;
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ChangeClipBounds
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */