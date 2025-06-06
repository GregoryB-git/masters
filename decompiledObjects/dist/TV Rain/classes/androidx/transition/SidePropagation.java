package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;

public class SidePropagation
  extends VisibilityPropagation
{
  private float mPropagationSpeed = 3.0F;
  private int mSide = 80;
  
  private int distance(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    int i = mSide;
    int j = 0;
    int k = 1;
    int m = 1;
    if (i == 8388611)
    {
      if (ViewCompat.getLayoutDirection(paramView) != 1) {
        m = 0;
      }
      if (m != 0)
      {
        m = 5;
        break label90;
      }
    }
    for (;;)
    {
      m = 3;
      break label90;
      m = i;
      if (i != 8388613) {
        break label90;
      }
      if (ViewCompat.getLayoutDirection(paramView) == 1) {
        m = k;
      } else {
        m = 0;
      }
      if (m == 0) {
        break;
      }
    }
    label90:
    if (m != 3)
    {
      if (m != 5)
      {
        if (m != 48)
        {
          if (m != 80) {
            paramInt1 = j;
          } else {
            paramInt1 = Math.abs(paramInt3 - paramInt1) + (paramInt2 - paramInt6);
          }
        }
        else {
          paramInt1 = Math.abs(paramInt3 - paramInt1) + (paramInt8 - paramInt2);
        }
      }
      else {
        paramInt1 = Math.abs(paramInt4 - paramInt2) + (paramInt1 - paramInt5);
      }
    }
    else {
      paramInt1 = Math.abs(paramInt4 - paramInt2) + (paramInt7 - paramInt1);
    }
    return paramInt1;
  }
  
  private int getMaxDistance(ViewGroup paramViewGroup)
  {
    int i = mSide;
    if ((i != 3) && (i != 5) && (i != 8388611) && (i != 8388613)) {
      return paramViewGroup.getHeight();
    }
    return paramViewGroup.getWidth();
  }
  
  public long getStartDelay(ViewGroup paramViewGroup, Transition paramTransition, TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    if ((paramTransitionValues1 == null) && (paramTransitionValues2 == null)) {
      return 0L;
    }
    Rect localRect = paramTransition.getEpicenter();
    int i;
    if ((paramTransitionValues2 != null) && (getViewVisibility(paramTransitionValues1) != 0))
    {
      i = 1;
      paramTransitionValues1 = paramTransitionValues2;
    }
    else
    {
      i = -1;
    }
    int j = getViewX(paramTransitionValues1);
    int k = getViewY(paramTransitionValues1);
    paramTransitionValues1 = new int[2];
    paramViewGroup.getLocationOnScreen(paramTransitionValues1);
    int m = paramTransitionValues1[0] + Math.round(paramViewGroup.getTranslationX());
    int n = paramTransitionValues1[1];
    int i1 = Math.round(paramViewGroup.getTranslationY()) + n;
    int i2 = paramViewGroup.getWidth() + m;
    int i3 = paramViewGroup.getHeight() + i1;
    int i4;
    if (localRect != null)
    {
      n = localRect.centerX();
      i4 = localRect.centerY();
    }
    else
    {
      n = (m + i2) / 2;
      i4 = (i1 + i3) / 2;
    }
    float f = distance(paramViewGroup, j, k, n, i4, m, i1, i2, i3) / getMaxDistance(paramViewGroup);
    long l1 = paramTransition.getDuration();
    long l2 = l1;
    if (l1 < 0L) {
      l2 = 300L;
    }
    return Math.round((float)(l2 * i) / mPropagationSpeed * f);
  }
  
  public void setPropagationSpeed(float paramFloat)
  {
    if (paramFloat != 0.0F)
    {
      mPropagationSpeed = paramFloat;
      return;
    }
    throw new IllegalArgumentException("propagationSpeed may not be 0");
  }
  
  public void setSide(int paramInt)
  {
    mSide = paramInt;
  }
}

/* Location:
 * Qualified Name:     androidx.transition.SidePropagation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */