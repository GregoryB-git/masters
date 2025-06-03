package androidx.appcompat.graphics.drawable;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

class AnimatedStateListDrawableCompat$FrameInterpolator
  implements TimeInterpolator
{
  private int[] mFrameTimes;
  private int mFrames;
  private int mTotalDuration;
  
  public AnimatedStateListDrawableCompat$FrameInterpolator(AnimationDrawable paramAnimationDrawable, boolean paramBoolean)
  {
    updateFrames(paramAnimationDrawable, paramBoolean);
  }
  
  public float getInterpolation(float paramFloat)
  {
    int i = (int)(paramFloat * mTotalDuration + 0.5F);
    int j = mFrames;
    int[] arrayOfInt = mFrameTimes;
    for (int k = 0; k < j; k++)
    {
      int m = arrayOfInt[k];
      if (i < m) {
        break;
      }
      i -= m;
    }
    if (k < j) {
      paramFloat = i / mTotalDuration;
    } else {
      paramFloat = 0.0F;
    }
    return k / j + paramFloat;
  }
  
  public int getTotalDuration()
  {
    return mTotalDuration;
  }
  
  public int updateFrames(AnimationDrawable paramAnimationDrawable, boolean paramBoolean)
  {
    int i = paramAnimationDrawable.getNumberOfFrames();
    mFrames = i;
    int[] arrayOfInt = mFrameTimes;
    if ((arrayOfInt == null) || (arrayOfInt.length < i)) {
      mFrameTimes = new int[i];
    }
    arrayOfInt = mFrameTimes;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      if (paramBoolean) {
        m = i - j - 1;
      } else {
        m = j;
      }
      int m = paramAnimationDrawable.getDuration(m);
      arrayOfInt[j] = m;
      k += m;
      j++;
    }
    mTotalDuration = k;
    return k;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.FrameInterpolator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */