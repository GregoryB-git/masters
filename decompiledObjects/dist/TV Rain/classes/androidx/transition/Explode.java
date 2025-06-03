package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import java.util.Map;

public class Explode
  extends Visibility
{
  private static final String PROPNAME_SCREEN_BOUNDS = "android:explode:screenBounds";
  private static final TimeInterpolator sAccelerate = new AccelerateInterpolator();
  private static final TimeInterpolator sDecelerate = new DecelerateInterpolator();
  private int[] mTempLoc = new int[2];
  
  public Explode()
  {
    setPropagation(new CircularPropagation());
  }
  
  public Explode(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setPropagation(new CircularPropagation());
  }
  
  private static float calculateDistance(float paramFloat1, float paramFloat2)
  {
    return (float)Math.sqrt(paramFloat2 * paramFloat2 + paramFloat1 * paramFloat1);
  }
  
  private static float calculateMaxDistance(View paramView, int paramInt1, int paramInt2)
  {
    paramInt1 = Math.max(paramInt1, paramView.getWidth() - paramInt1);
    paramInt2 = Math.max(paramInt2, paramView.getHeight() - paramInt2);
    return calculateDistance(paramInt1, paramInt2);
  }
  
  private void calculateOut(View paramView, Rect paramRect, int[] paramArrayOfInt)
  {
    paramView.getLocationOnScreen(mTempLoc);
    Object localObject = mTempLoc;
    int i = localObject[0];
    int j = localObject[1];
    localObject = getEpicenter();
    int k;
    int m;
    if (localObject == null)
    {
      k = paramView.getWidth() / 2;
      k = Math.round(paramView.getTranslationX()) + (k + i);
      m = paramView.getHeight() / 2;
      m = Math.round(paramView.getTranslationY()) + (m + j);
    }
    else
    {
      k = ((Rect)localObject).centerX();
      m = ((Rect)localObject).centerY();
    }
    int n = paramRect.centerX();
    int i1 = paramRect.centerY();
    float f1 = n - k;
    float f2 = i1 - m;
    float f3 = f1;
    float f4 = f2;
    if (f1 == 0.0F)
    {
      f3 = f1;
      f4 = f2;
      if (f2 == 0.0F)
      {
        f3 = (float)(Math.random() * 2.0D);
        f4 = (float)(Math.random() * 2.0D);
        f3 -= 1.0F;
        f4 -= 1.0F;
      }
    }
    f1 = calculateDistance(f3, f4);
    f3 /= f1;
    f1 = f4 / f1;
    f4 = calculateMaxDistance(paramView, k - i, m - j);
    paramArrayOfInt[0] = Math.round(f3 * f4);
    paramArrayOfInt[1] = Math.round(f4 * f1);
  }
  
  private void captureValues(TransitionValues paramTransitionValues)
  {
    View localView = view;
    localView.getLocationOnScreen(mTempLoc);
    int[] arrayOfInt = mTempLoc;
    int i = arrayOfInt[0];
    int j = arrayOfInt[1];
    int k = localView.getWidth();
    int m = localView.getHeight();
    values.put("android:explode:screenBounds", new Rect(i, j, k + i, m + j));
  }
  
  public void captureEndValues(@NonNull TransitionValues paramTransitionValues)
  {
    super.captureEndValues(paramTransitionValues);
    captureValues(paramTransitionValues);
  }
  
  public void captureStartValues(@NonNull TransitionValues paramTransitionValues)
  {
    super.captureStartValues(paramTransitionValues);
    captureValues(paramTransitionValues);
  }
  
  public Animator onAppear(ViewGroup paramViewGroup, View paramView, TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    if (paramTransitionValues2 == null) {
      return null;
    }
    paramTransitionValues1 = (Rect)values.get("android:explode:screenBounds");
    float f1 = paramView.getTranslationX();
    float f2 = paramView.getTranslationY();
    calculateOut(paramViewGroup, paramTransitionValues1, mTempLoc);
    paramViewGroup = mTempLoc;
    float f3 = paramViewGroup[0];
    float f4 = paramViewGroup[1];
    return TranslationAnimationCreator.createAnimation(paramView, paramTransitionValues2, left, top, f1 + f3, f2 + f4, f1, f2, sDecelerate, this);
  }
  
  public Animator onDisappear(ViewGroup paramViewGroup, View paramView, TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    if (paramTransitionValues1 == null) {
      return null;
    }
    paramTransitionValues2 = (Rect)values.get("android:explode:screenBounds");
    int i = left;
    int j = top;
    float f1 = paramView.getTranslationX();
    float f2 = paramView.getTranslationY();
    int[] arrayOfInt = (int[])view.getTag(R.id.transition_position);
    float f3;
    float f4;
    if (arrayOfInt != null)
    {
      int k = arrayOfInt[0];
      f3 = k - left + f1;
      int m = arrayOfInt[1];
      f4 = m - top + f2;
      paramTransitionValues2.offsetTo(k, m);
    }
    else
    {
      f3 = f1;
      f4 = f2;
    }
    calculateOut(paramViewGroup, paramTransitionValues2, mTempLoc);
    paramViewGroup = mTempLoc;
    return TranslationAnimationCreator.createAnimation(paramView, paramTransitionValues1, i, j, f1, f2, f3 + paramViewGroup[0], f4 + paramViewGroup[1], sAccelerate, this);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.Explode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */