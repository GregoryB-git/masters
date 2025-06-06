package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

public class ChangeScroll
  extends Transition
{
  private static final String[] PROPERTIES = { "android:changeScroll:x", "android:changeScroll:y" };
  private static final String PROPNAME_SCROLL_X = "android:changeScroll:x";
  private static final String PROPNAME_SCROLL_Y = "android:changeScroll:y";
  
  public ChangeScroll() {}
  
  public ChangeScroll(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void captureValues(TransitionValues paramTransitionValues)
  {
    values.put("android:changeScroll:x", Integer.valueOf(view.getScrollX()));
    values.put("android:changeScroll:y", Integer.valueOf(view.getScrollY()));
  }
  
  public void captureEndValues(@NonNull TransitionValues paramTransitionValues)
  {
    captureValues(paramTransitionValues);
  }
  
  public void captureStartValues(@NonNull TransitionValues paramTransitionValues)
  {
    captureValues(paramTransitionValues);
  }
  
  @Nullable
  public Animator createAnimator(@NonNull ViewGroup paramViewGroup, @Nullable TransitionValues paramTransitionValues1, @Nullable TransitionValues paramTransitionValues2)
  {
    View localView = null;
    Object localObject = null;
    paramViewGroup = localView;
    if (paramTransitionValues1 != null) {
      if (paramTransitionValues2 == null)
      {
        paramViewGroup = localView;
      }
      else
      {
        localView = view;
        int i = ((Integer)values.get("android:changeScroll:x")).intValue();
        int j = ((Integer)values.get("android:changeScroll:x")).intValue();
        int k = ((Integer)values.get("android:changeScroll:y")).intValue();
        int m = ((Integer)values.get("android:changeScroll:y")).intValue();
        if (i != j)
        {
          localView.setScrollX(i);
          paramViewGroup = ObjectAnimator.ofInt(localView, "scrollX", new int[] { i, j });
        }
        else
        {
          paramViewGroup = null;
        }
        paramTransitionValues1 = (TransitionValues)localObject;
        if (k != m)
        {
          localView.setScrollY(k);
          paramTransitionValues1 = ObjectAnimator.ofInt(localView, "scrollY", new int[] { k, m });
        }
        paramViewGroup = TransitionUtils.mergeAnimators(paramViewGroup, paramTransitionValues1);
      }
    }
    return paramViewGroup;
  }
  
  @Nullable
  public String[] getTransitionProperties()
  {
    return PROPERTIES;
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ChangeScroll
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */