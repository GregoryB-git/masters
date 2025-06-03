package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;

public class ConstraintSet$Motion
{
  private static final int ANIMATE_CIRCLE_ANGLE_TO = 6;
  private static final int ANIMATE_RELATIVE_TO = 5;
  private static final int INTERPOLATOR_REFERENCE_ID = -2;
  private static final int INTERPOLATOR_UNDEFINED = -3;
  private static final int MOTION_DRAW_PATH = 4;
  private static final int MOTION_STAGGER = 7;
  private static final int PATH_MOTION_ARC = 2;
  private static final int QUANTIZE_MOTION_INTERPOLATOR = 10;
  private static final int QUANTIZE_MOTION_PHASE = 9;
  private static final int QUANTIZE_MOTION_STEPS = 8;
  private static final int SPLINE_STRING = -1;
  private static final int TRANSITION_EASING = 3;
  private static final int TRANSITION_PATH_ROTATE = 1;
  private static SparseIntArray mapToConstant;
  public int mAnimateCircleAngleTo = 0;
  public int mAnimateRelativeTo = -1;
  public boolean mApply = false;
  public int mDrawPath = 0;
  public float mMotionStagger = NaN.0F;
  public int mPathMotionArc = -1;
  public float mPathRotate = NaN.0F;
  public int mPolarRelativeTo = -1;
  public int mQuantizeInterpolatorID = -1;
  public String mQuantizeInterpolatorString = null;
  public int mQuantizeInterpolatorType = -3;
  public float mQuantizeMotionPhase = NaN.0F;
  public int mQuantizeMotionSteps = -1;
  public String mTransitionEasing = null;
  
  static
  {
    SparseIntArray localSparseIntArray = new SparseIntArray();
    mapToConstant = localSparseIntArray;
    localSparseIntArray.append(R.styleable.Motion_motionPathRotate, 1);
    mapToConstant.append(R.styleable.Motion_pathMotionArc, 2);
    mapToConstant.append(R.styleable.Motion_transitionEasing, 3);
    mapToConstant.append(R.styleable.Motion_drawPath, 4);
    mapToConstant.append(R.styleable.Motion_animateRelativeTo, 5);
    mapToConstant.append(R.styleable.Motion_animateCircleAngleTo, 6);
    mapToConstant.append(R.styleable.Motion_motionStagger, 7);
    mapToConstant.append(R.styleable.Motion_quantizeMotionSteps, 8);
    mapToConstant.append(R.styleable.Motion_quantizeMotionPhase, 9);
    mapToConstant.append(R.styleable.Motion_quantizeMotionInterpolator, 10);
  }
  
  public void copyFrom(Motion paramMotion)
  {
    mApply = mApply;
    mAnimateRelativeTo = mAnimateRelativeTo;
    mTransitionEasing = mTransitionEasing;
    mPathMotionArc = mPathMotionArc;
    mDrawPath = mDrawPath;
    mPathRotate = mPathRotate;
    mMotionStagger = mMotionStagger;
    mPolarRelativeTo = mPolarRelativeTo;
  }
  
  public void fillFromAttributeList(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.Motion);
    mApply = true;
    int i = paramContext.getIndexCount();
    for (int j = 0; j < i; j++)
    {
      int k = paramContext.getIndex(j);
      switch (mapToConstant.get(k))
      {
      default: 
        break;
      case 10: 
        int m = peekValuetype;
        if (m == 1)
        {
          m = paramContext.getResourceId(k, -1);
          mQuantizeInterpolatorID = m;
          if (m != -1) {
            mQuantizeInterpolatorType = -2;
          }
        }
        else if (m == 3)
        {
          paramAttributeSet = paramContext.getString(k);
          mQuantizeInterpolatorString = paramAttributeSet;
          if (paramAttributeSet.indexOf("/") > 0)
          {
            mQuantizeInterpolatorID = paramContext.getResourceId(k, -1);
            mQuantizeInterpolatorType = -2;
          }
          else
          {
            mQuantizeInterpolatorType = -1;
          }
        }
        else
        {
          mQuantizeInterpolatorType = paramContext.getInteger(k, mQuantizeInterpolatorID);
        }
        break;
      case 9: 
        mQuantizeMotionPhase = paramContext.getFloat(k, mQuantizeMotionPhase);
        break;
      case 8: 
        mQuantizeMotionSteps = paramContext.getInteger(k, mQuantizeMotionSteps);
        break;
      case 7: 
        mMotionStagger = paramContext.getFloat(k, mMotionStagger);
        break;
      case 6: 
        mAnimateCircleAngleTo = paramContext.getInteger(k, mAnimateCircleAngleTo);
        break;
      case 5: 
        mAnimateRelativeTo = ConstraintSet.access$100(paramContext, k, mAnimateRelativeTo);
        break;
      case 4: 
        mDrawPath = paramContext.getInt(k, 0);
        break;
      case 3: 
        if (peekValuetype == 3) {
          mTransitionEasing = paramContext.getString(k);
        } else {
          mTransitionEasing = androidx.constraintlayout.core.motion.utils.Easing.NAMED_EASING[paramContext.getInteger(k, 0)];
        }
        break;
      case 2: 
        mPathMotionArc = paramContext.getInt(k, mPathMotionArc);
        break;
      case 1: 
        mPathRotate = paramContext.getFloat(k, mPathRotate);
      }
    }
    paramContext.recycle();
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintSet.Motion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */