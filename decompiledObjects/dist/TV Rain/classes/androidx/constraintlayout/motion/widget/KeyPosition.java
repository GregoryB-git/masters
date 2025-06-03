package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.R.styleable;
import java.io.PrintStream;
import java.util.HashMap;
import z2;

public class KeyPosition
  extends KeyPositionBase
{
  public static final String DRAWPATH = "drawPath";
  public static final int KEY_TYPE = 2;
  public static final String NAME = "KeyPosition";
  public static final String PERCENT_HEIGHT = "percentHeight";
  public static final String PERCENT_WIDTH = "percentWidth";
  public static final String PERCENT_X = "percentX";
  public static final String PERCENT_Y = "percentY";
  public static final String SIZE_PERCENT = "sizePercent";
  private static final String TAG = "KeyPosition";
  public static final String TRANSITION_EASING = "transitionEasing";
  public static final int TYPE_CARTESIAN = 0;
  public static final int TYPE_PATH = 1;
  public static final int TYPE_SCREEN = 2;
  public float mAltPercentX = NaN.0F;
  public float mAltPercentY = NaN.0F;
  private float mCalculatedPositionX = NaN.0F;
  private float mCalculatedPositionY = NaN.0F;
  public int mDrawPath = 0;
  public int mPathMotionArc = Key.UNSET;
  public float mPercentHeight = NaN.0F;
  public float mPercentWidth = NaN.0F;
  public float mPercentX = NaN.0F;
  public float mPercentY = NaN.0F;
  public int mPositionType = 0;
  public String mTransitionEasing = null;
  
  public KeyPosition()
  {
    mType = 2;
  }
  
  private void calcCartesianPosition(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float f1 = paramFloat3 - paramFloat1;
    float f2 = paramFloat4 - paramFloat2;
    boolean bool = Float.isNaN(mPercentX);
    float f3 = 0.0F;
    if (bool) {
      paramFloat3 = 0.0F;
    } else {
      paramFloat3 = mPercentX;
    }
    if (Float.isNaN(mAltPercentY)) {
      paramFloat4 = 0.0F;
    } else {
      paramFloat4 = mAltPercentY;
    }
    float f4;
    if (Float.isNaN(mPercentY)) {
      f4 = 0.0F;
    } else {
      f4 = mPercentY;
    }
    if (!Float.isNaN(mAltPercentX)) {
      f3 = mAltPercentX;
    }
    mCalculatedPositionX = ((int)(f3 * f2 + (paramFloat3 * f1 + paramFloat1)));
    mCalculatedPositionY = ((int)(f2 * f4 + (f1 * paramFloat4 + paramFloat2)));
  }
  
  private void calcPathPosition(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramFloat3 -= paramFloat1;
    float f1 = paramFloat4 - paramFloat2;
    float f2 = -f1;
    float f3 = mPercentX;
    paramFloat4 = mPercentY;
    mCalculatedPositionX = (f2 * paramFloat4 + (paramFloat3 * f3 + paramFloat1));
    mCalculatedPositionY = (paramFloat3 * paramFloat4 + (f1 * f3 + paramFloat2));
  }
  
  private void calcScreenPosition(int paramInt1, int paramInt2)
  {
    float f1 = paramInt1 - 0;
    float f2 = mPercentX;
    float f3 = 0;
    mCalculatedPositionX = (f1 * f2 + f3);
    mCalculatedPositionY = ((paramInt2 - 0) * f2 + f3);
  }
  
  public void addValues(HashMap<String, ViewSpline> paramHashMap) {}
  
  public void calcPosition(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    int i = mPositionType;
    if (i != 1)
    {
      if (i != 2)
      {
        calcCartesianPosition(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
        return;
      }
      calcScreenPosition(paramInt1, paramInt2);
      return;
    }
    calcPathPosition(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  public Key clone()
  {
    return new KeyPosition().copy(this);
  }
  
  public Key copy(Key paramKey)
  {
    super.copy(paramKey);
    paramKey = (KeyPosition)paramKey;
    mTransitionEasing = mTransitionEasing;
    mPathMotionArc = mPathMotionArc;
    mDrawPath = mDrawPath;
    mPercentWidth = mPercentWidth;
    mPercentHeight = NaN.0F;
    mPercentX = mPercentX;
    mPercentY = mPercentY;
    mAltPercentX = mAltPercentX;
    mAltPercentY = mAltPercentY;
    mCalculatedPositionX = mCalculatedPositionX;
    mCalculatedPositionY = mCalculatedPositionY;
    return this;
  }
  
  public float getPositionX()
  {
    return mCalculatedPositionX;
  }
  
  public float getPositionY()
  {
    return mCalculatedPositionY;
  }
  
  public boolean intersects(int paramInt1, int paramInt2, RectF paramRectF1, RectF paramRectF2, float paramFloat1, float paramFloat2)
  {
    calcPosition(paramInt1, paramInt2, paramRectF1.centerX(), paramRectF1.centerY(), paramRectF2.centerX(), paramRectF2.centerY());
    return (Math.abs(paramFloat1 - mCalculatedPositionX) < 20.0F) && (Math.abs(paramFloat2 - mCalculatedPositionY) < 20.0F);
  }
  
  public void load(Context paramContext, AttributeSet paramAttributeSet)
  {
    Loader.access$000(this, paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.KeyPosition));
  }
  
  public void positionAttributes(View paramView, RectF paramRectF1, RectF paramRectF2, float paramFloat1, float paramFloat2, String[] paramArrayOfString, float[] paramArrayOfFloat)
  {
    int i = mPositionType;
    if (i != 1)
    {
      if (i != 2)
      {
        positionCartAttributes(paramRectF1, paramRectF2, paramFloat1, paramFloat2, paramArrayOfString, paramArrayOfFloat);
        return;
      }
      positionScreenAttributes(paramView, paramRectF1, paramRectF2, paramFloat1, paramFloat2, paramArrayOfString, paramArrayOfFloat);
      return;
    }
    positionPathAttributes(paramRectF1, paramRectF2, paramFloat1, paramFloat2, paramArrayOfString, paramArrayOfFloat);
  }
  
  public void positionCartAttributes(RectF paramRectF1, RectF paramRectF2, float paramFloat1, float paramFloat2, String[] paramArrayOfString, float[] paramArrayOfFloat)
  {
    float f1 = paramRectF1.centerX();
    float f2 = paramRectF1.centerY();
    float f3 = paramRectF2.centerX();
    float f4 = paramRectF2.centerY();
    f3 -= f1;
    f4 -= f2;
    paramRectF1 = paramArrayOfString[0];
    if (paramRectF1 != null)
    {
      if ("percentX".equals(paramRectF1))
      {
        paramArrayOfFloat[0] = ((paramFloat1 - f1) / f3);
        paramArrayOfFloat[1] = ((paramFloat2 - f2) / f4);
      }
      else
      {
        paramArrayOfFloat[1] = ((paramFloat1 - f1) / f3);
        paramArrayOfFloat[0] = ((paramFloat2 - f2) / f4);
      }
    }
    else
    {
      paramArrayOfString[0] = "percentX";
      paramArrayOfFloat[0] = ((paramFloat1 - f1) / f3);
      paramArrayOfString[1] = "percentY";
      paramArrayOfFloat[1] = ((paramFloat2 - f2) / f4);
    }
  }
  
  public void positionPathAttributes(RectF paramRectF1, RectF paramRectF2, float paramFloat1, float paramFloat2, String[] paramArrayOfString, float[] paramArrayOfFloat)
  {
    float f1 = paramRectF1.centerX();
    float f2 = paramRectF1.centerY();
    float f3 = paramRectF2.centerX();
    float f4 = paramRectF2.centerY();
    f3 -= f1;
    float f5 = f4 - f2;
    f4 = (float)Math.hypot(f3, f5);
    if (f4 < 1.0E-4D)
    {
      System.out.println("distance ~ 0");
      paramArrayOfFloat[0] = 0.0F;
      paramArrayOfFloat[1] = 0.0F;
      return;
    }
    f3 /= f4;
    f5 /= f4;
    paramFloat2 -= f2;
    f1 = paramFloat1 - f1;
    paramFloat1 = (f3 * paramFloat2 - f1 * f5) / f4;
    paramFloat2 = (f5 * paramFloat2 + f3 * f1) / f4;
    paramRectF1 = paramArrayOfString[0];
    if (paramRectF1 != null)
    {
      if ("percentX".equals(paramRectF1))
      {
        paramArrayOfFloat[0] = paramFloat2;
        paramArrayOfFloat[1] = paramFloat1;
      }
    }
    else
    {
      paramArrayOfString[0] = "percentX";
      paramArrayOfString[1] = "percentY";
      paramArrayOfFloat[0] = paramFloat2;
      paramArrayOfFloat[1] = paramFloat1;
    }
  }
  
  public void positionScreenAttributes(View paramView, RectF paramRectF1, RectF paramRectF2, float paramFloat1, float paramFloat2, String[] paramArrayOfString, float[] paramArrayOfFloat)
  {
    paramRectF1.centerX();
    paramRectF1.centerY();
    paramRectF2.centerX();
    paramRectF2.centerY();
    paramView = (ViewGroup)paramView.getParent();
    int i = paramView.getWidth();
    int j = paramView.getHeight();
    paramView = paramArrayOfString[0];
    if (paramView != null)
    {
      if ("percentX".equals(paramView))
      {
        paramArrayOfFloat[0] = (paramFloat1 / i);
        paramArrayOfFloat[1] = (paramFloat2 / j);
      }
      else
      {
        paramArrayOfFloat[1] = (paramFloat1 / i);
        paramArrayOfFloat[0] = (paramFloat2 / j);
      }
    }
    else
    {
      paramArrayOfString[0] = "percentX";
      paramArrayOfFloat[0] = (paramFloat1 / i);
      paramArrayOfString[1] = "percentY";
      paramArrayOfFloat[1] = (paramFloat2 / j);
    }
  }
  
  public void setType(int paramInt)
  {
    mPositionType = paramInt;
  }
  
  public void setValue(String paramString, Object paramObject)
  {
    paramString.getClass();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 428090548: 
      if (paramString.equals("percentY")) {
        j = 6;
      }
      break;
    case 428090547: 
      if (paramString.equals("percentX")) {
        j = 5;
      }
      break;
    case -200259324: 
      if (paramString.equals("sizePercent")) {
        j = 4;
      }
      break;
    case -827014263: 
      if (paramString.equals("drawPath")) {
        j = 3;
      }
      break;
    case -1017587252: 
      if (paramString.equals("percentHeight")) {
        j = 2;
      }
      break;
    case -1127236479: 
      if (paramString.equals("percentWidth")) {
        j = 1;
      }
      break;
    case -1812823328: 
      if (paramString.equals("transitionEasing")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      break;
    case 6: 
      mPercentY = toFloat(paramObject);
      break;
    case 5: 
      mPercentX = toFloat(paramObject);
      break;
    case 4: 
      float f = toFloat(paramObject);
      mPercentWidth = f;
      mPercentHeight = f;
      break;
    case 3: 
      mDrawPath = toInt(paramObject);
      break;
    case 2: 
      mPercentHeight = toFloat(paramObject);
      break;
    case 1: 
      mPercentWidth = toFloat(paramObject);
      break;
    case 0: 
      mTransitionEasing = paramObject.toString();
    }
  }
  
  public static class Loader
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
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.KeyPosition
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */