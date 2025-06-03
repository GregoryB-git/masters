package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class ConstraintSet$PropertySet
{
  public float alpha = 1.0F;
  public boolean mApply = false;
  public float mProgress = NaN.0F;
  public int mVisibilityMode = 0;
  public int visibility = 0;
  
  public void copyFrom(PropertySet paramPropertySet)
  {
    mApply = mApply;
    visibility = visibility;
    alpha = alpha;
    mProgress = mProgress;
    mVisibilityMode = mVisibilityMode;
  }
  
  public void fillFromAttributeList(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.PropertySet);
    mApply = true;
    int i = paramContext.getIndexCount();
    for (int j = 0; j < i; j++)
    {
      int k = paramContext.getIndex(j);
      if (k == R.styleable.PropertySet_android_alpha)
      {
        alpha = paramContext.getFloat(k, alpha);
      }
      else if (k == R.styleable.PropertySet_android_visibility)
      {
        visibility = paramContext.getInt(k, visibility);
        visibility = ConstraintSet.access$200()[visibility];
      }
      else if (k == R.styleable.PropertySet_visibilityMode)
      {
        mVisibilityMode = paramContext.getInt(k, mVisibilityMode);
      }
      else if (k == R.styleable.PropertySet_motionProgress)
      {
        mProgress = paramContext.getFloat(k, mProgress);
      }
    }
    paramContext.recycle();
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintSet.PropertySet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */