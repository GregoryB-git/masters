package y1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class e$f
  extends Animation
{
  public e$f(e parame) {}
  
  public final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    paramTransformation = a;
    if (!mUsingCustomStart) {
      i = mSpinnerOffsetEnd - Math.abs(mOriginalOffsetTop);
    } else {
      i = mSpinnerOffsetEnd;
    }
    paramTransformation = a;
    int j = mFrom;
    int k = (int)((i - j) * paramFloat);
    int i = mCircleView.getTop();
    a.setTargetOffsetTopAndBottom(j + k - i);
    paramTransformation = a.mProgress;
    paramFloat = 1.0F - paramFloat;
    d.a locala = a;
    if (paramFloat != p) {
      p = paramFloat;
    }
    paramTransformation.invalidateSelf();
  }
}

/* Location:
 * Qualified Name:     y1.e.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */