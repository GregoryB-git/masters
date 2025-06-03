package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import androidx.constraintlayout.widget.R.styleable;
import z2;

class KeyPosition$Loader
{
  private static final int CURVE_FIT = 4;
  private static final int DRAW_PATH = 5;
  private static final int FRAME_POSITION = 2;
  private static final int PATH_MOTION_ARC = 10;
  private static final int PERCENT_HEIGHT = 12;
  private static final int PERCENT_WIDTH = 11;
  private static final int PERCENT_X = 6;
  private static final int PERCENT_Y = 7;
  private static final int SIZE_PERCENT = 8;
  private static final int TARGET_ID = 1;
  private static final int TRANSITION_EASING = 3;
  private static final int TYPE = 9;
  private static SparseIntArray mAttrMap;
  
  static
  {
    SparseIntArray localSparseIntArray = new SparseIntArray();
    mAttrMap = localSparseIntArray;
    localSparseIntArray.append(R.styleable.KeyPosition_motionTarget, 1);
    mAttrMap.append(R.styleable.KeyPosition_framePosition, 2);
    mAttrMap.append(R.styleable.KeyPosition_transitionEasing, 3);
    mAttrMap.append(R.styleable.KeyPosition_curveFit, 4);
    mAttrMap.append(R.styleable.KeyPosition_drawPath, 5);
    mAttrMap.append(R.styleable.KeyPosition_percentX, 6);
    mAttrMap.append(R.styleable.KeyPosition_percentY, 7);
    mAttrMap.append(R.styleable.KeyPosition_keyPositionType, 9);
    mAttrMap.append(R.styleable.KeyPosition_sizePercent, 8);
    mAttrMap.append(R.styleable.KeyPosition_percentWidth, 11);
    mAttrMap.append(R.styleable.KeyPosition_percentHeight, 12);
    mAttrMap.append(R.styleable.KeyPosition_pathMotionArc, 10);
  }
  
  private static void read(KeyPosition paramKeyPosition, TypedArray paramTypedArray)
  {
    int i = paramTypedArray.getIndexCount();
    for (int j = 0; j < i; j++)
    {
      int k = paramTypedArray.getIndex(j);
      switch (mAttrMap.get(k))
      {
      default: 
        StringBuilder localStringBuilder = z2.t("unused attribute 0x");
        localStringBuilder.append(Integer.toHexString(k));
        localStringBuilder.append("   ");
        localStringBuilder.append(mAttrMap.get(k));
        Log.e("KeyPosition", localStringBuilder.toString());
        break;
      case 12: 
        mPercentHeight = paramTypedArray.getFloat(k, mPercentHeight);
        break;
      case 11: 
        mPercentWidth = paramTypedArray.getFloat(k, mPercentWidth);
        break;
      case 10: 
        mPathMotionArc = paramTypedArray.getInt(k, mPathMotionArc);
        break;
      case 9: 
        mPositionType = paramTypedArray.getInt(k, mPositionType);
        break;
      case 8: 
        float f = paramTypedArray.getFloat(k, mPercentHeight);
        mPercentWidth = f;
        mPercentHeight = f;
        break;
      case 7: 
        mPercentY = paramTypedArray.getFloat(k, mPercentY);
        break;
      case 6: 
        mPercentX = paramTypedArray.getFloat(k, mPercentX);
        break;
      case 5: 
        mDrawPath = paramTypedArray.getInt(k, mDrawPath);
        break;
      case 4: 
        mCurveFit = paramTypedArray.getInteger(k, mCurveFit);
        break;
      case 3: 
        if (peekValuetype == 3) {
          mTransitionEasing = paramTypedArray.getString(k);
        } else {
          mTransitionEasing = androidx.constraintlayout.core.motion.utils.Easing.NAMED_EASING[paramTypedArray.getInteger(k, 0)];
        }
        break;
      case 2: 
        mFramePosition = paramTypedArray.getInt(k, mFramePosition);
        break;
      case 1: 
        if (MotionLayout.IS_IN_EDIT_MODE)
        {
          int m = paramTypedArray.getResourceId(k, mTargetId);
          mTargetId = m;
          if (m == -1) {
            mTargetString = paramTypedArray.getString(k);
          }
        }
        else if (peekValuetype == 3)
        {
          mTargetString = paramTypedArray.getString(k);
        }
        else
        {
          mTargetId = paramTypedArray.getResourceId(k, mTargetId);
        }
        break;
      }
    }
    if (mFramePosition == -1) {
      Log.e("KeyPosition", "no frame position");
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.KeyPosition.Loader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */