package androidx.transition;

import android.view.View;
import java.util.Map;

public abstract class VisibilityPropagation
  extends TransitionPropagation
{
  private static final String PROPNAME_VIEW_CENTER = "android:visibilityPropagation:center";
  private static final String PROPNAME_VISIBILITY = "android:visibilityPropagation:visibility";
  private static final String[] VISIBILITY_PROPAGATION_VALUES = { "android:visibilityPropagation:visibility", "android:visibilityPropagation:center" };
  
  private static int getViewCoordinate(TransitionValues paramTransitionValues, int paramInt)
  {
    if (paramTransitionValues == null) {
      return -1;
    }
    paramTransitionValues = (int[])values.get("android:visibilityPropagation:center");
    if (paramTransitionValues == null) {
      return -1;
    }
    return paramTransitionValues[paramInt];
  }
  
  public void captureValues(TransitionValues paramTransitionValues)
  {
    View localView = view;
    Integer localInteger = (Integer)values.get("android:visibility:visibility");
    Object localObject = localInteger;
    if (localInteger == null) {
      localObject = Integer.valueOf(localView.getVisibility());
    }
    values.put("android:visibilityPropagation:visibility", localObject);
    localObject = new int[2];
    localView.getLocationOnScreen((int[])localObject);
    int i = localObject[0];
    i = Math.round(localView.getTranslationX()) + i;
    localObject[0] = i;
    localObject[0] = (localView.getWidth() / 2 + i);
    i = localObject[1];
    i = Math.round(localView.getTranslationY()) + i;
    localObject[1] = i;
    localObject[1] = (localView.getHeight() / 2 + i);
    values.put("android:visibilityPropagation:center", localObject);
  }
  
  public String[] getPropagationProperties()
  {
    return VISIBILITY_PROPAGATION_VALUES;
  }
  
  public int getViewVisibility(TransitionValues paramTransitionValues)
  {
    if (paramTransitionValues == null) {
      return 8;
    }
    paramTransitionValues = (Integer)values.get("android:visibilityPropagation:visibility");
    if (paramTransitionValues == null) {
      return 8;
    }
    return paramTransitionValues.intValue();
  }
  
  public int getViewX(TransitionValues paramTransitionValues)
  {
    return getViewCoordinate(paramTransitionValues, 0);
  }
  
  public int getViewY(TransitionValues paramTransitionValues)
  {
    return getViewCoordinate(paramTransitionValues, 1);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.VisibilityPropagation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */