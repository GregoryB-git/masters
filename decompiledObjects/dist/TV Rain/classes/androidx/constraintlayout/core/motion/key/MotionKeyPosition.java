package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues.PositionType;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;

public class MotionKeyPosition
  extends MotionKey
{
  public static final int KEY_TYPE = 2;
  public static final String NAME = "KeyPosition";
  public static final float SELECTION_SLOPE = 20.0F;
  public static final int TYPE_CARTESIAN = 0;
  public static final int TYPE_PATH = 1;
  public static final int TYPE_SCREEN = 2;
  public float mAltPercentX;
  public float mAltPercentY;
  private float mCalculatedPositionX;
  private float mCalculatedPositionY;
  public int mCurveFit;
  public int mDrawPath;
  public int mPathMotionArc;
  public float mPercentHeight;
  public float mPercentWidth;
  public float mPercentX;
  public float mPercentY;
  public int mPositionType;
  public String mTransitionEasing;
  
  public MotionKeyPosition()
  {
    int i = MotionKey.UNSET;
    mCurveFit = i;
    mTransitionEasing = null;
    mPathMotionArc = i;
    mDrawPath = 0;
    mPercentWidth = NaN.0F;
    mPercentHeight = NaN.0F;
    mPercentX = NaN.0F;
    mPercentY = NaN.0F;
    mAltPercentX = NaN.0F;
    mAltPercentY = NaN.0F;
    mPositionType = 0;
    mCalculatedPositionX = NaN.0F;
    mCalculatedPositionY = NaN.0F;
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
  
  public void addValues(HashMap<String, SplineSet> paramHashMap) {}
  
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
  
  public MotionKey clone()
  {
    return new MotionKeyPosition().copy(this);
  }
  
  public MotionKey copy(MotionKey paramMotionKey)
  {
    super.copy(paramMotionKey);
    paramMotionKey = (MotionKeyPosition)paramMotionKey;
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
  
  public void getAttributeNames(HashSet<String> paramHashSet) {}
  
  public int getId(String paramString)
  {
    return TypedValues.PositionType.getId(paramString);
  }
  
  public float getPositionX()
  {
    return mCalculatedPositionX;
  }
  
  public float getPositionY()
  {
    return mCalculatedPositionY;
  }
  
  public boolean intersects(int paramInt1, int paramInt2, FloatRect paramFloatRect1, FloatRect paramFloatRect2, float paramFloat1, float paramFloat2)
  {
    calcPosition(paramInt1, paramInt2, paramFloatRect1.centerX(), paramFloatRect1.centerY(), paramFloatRect2.centerX(), paramFloatRect2.centerY());
    return (Math.abs(paramFloat1 - mCalculatedPositionX) < 20.0F) && (Math.abs(paramFloat2 - mCalculatedPositionY) < 20.0F);
  }
  
  public void positionAttributes(MotionWidget paramMotionWidget, FloatRect paramFloatRect1, FloatRect paramFloatRect2, float paramFloat1, float paramFloat2, String[] paramArrayOfString, float[] paramArrayOfFloat)
  {
    int i = mPositionType;
    if (i != 1)
    {
      if (i != 2)
      {
        positionCartAttributes(paramFloatRect1, paramFloatRect2, paramFloat1, paramFloat2, paramArrayOfString, paramArrayOfFloat);
        return;
      }
      positionScreenAttributes(paramMotionWidget, paramFloatRect1, paramFloatRect2, paramFloat1, paramFloat2, paramArrayOfString, paramArrayOfFloat);
      return;
    }
    positionPathAttributes(paramFloatRect1, paramFloatRect2, paramFloat1, paramFloat2, paramArrayOfString, paramArrayOfFloat);
  }
  
  public void positionCartAttributes(FloatRect paramFloatRect1, FloatRect paramFloatRect2, float paramFloat1, float paramFloat2, String[] paramArrayOfString, float[] paramArrayOfFloat)
  {
    float f1 = paramFloatRect1.centerX();
    float f2 = paramFloatRect1.centerY();
    float f3 = paramFloatRect2.centerX();
    float f4 = paramFloatRect2.centerY();
    f3 -= f1;
    f4 -= f2;
    paramFloatRect1 = paramArrayOfString[0];
    if (paramFloatRect1 != null)
    {
      if ("percentX".equals(paramFloatRect1))
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
  
  public void positionPathAttributes(FloatRect paramFloatRect1, FloatRect paramFloatRect2, float paramFloat1, float paramFloat2, String[] paramArrayOfString, float[] paramArrayOfFloat)
  {
    float f1 = paramFloatRect1.centerX();
    float f2 = paramFloatRect1.centerY();
    float f3 = paramFloatRect2.centerX();
    float f4 = paramFloatRect2.centerY();
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
    paramFloatRect1 = paramArrayOfString[0];
    if (paramFloatRect1 != null)
    {
      if ("percentX".equals(paramFloatRect1))
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
  
  public void positionScreenAttributes(MotionWidget paramMotionWidget, FloatRect paramFloatRect1, FloatRect paramFloatRect2, float paramFloat1, float paramFloat2, String[] paramArrayOfString, float[] paramArrayOfFloat)
  {
    paramFloatRect1.centerX();
    paramFloatRect1.centerY();
    paramFloatRect2.centerX();
    paramFloatRect2.centerY();
    paramMotionWidget = paramMotionWidget.getParent();
    int i = paramMotionWidget.getWidth();
    int j = paramMotionWidget.getHeight();
    paramMotionWidget = paramArrayOfString[0];
    if (paramMotionWidget != null)
    {
      if ("percentX".equals(paramMotionWidget))
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
  
  public boolean setValue(int paramInt, float paramFloat)
  {
    switch (paramInt)
    {
    default: 
      return super.setValue(paramInt, paramFloat);
    case 507: 
      mPercentY = paramFloat;
      break;
    case 506: 
      mPercentX = paramFloat;
      break;
    case 505: 
      mPercentWidth = paramFloat;
      mPercentHeight = paramFloat;
      break;
    case 504: 
      mPercentHeight = paramFloat;
      break;
    case 503: 
      mPercentWidth = paramFloat;
    }
    return true;
  }
  
  public boolean setValue(int paramInt1, int paramInt2)
  {
    if (paramInt1 != 100)
    {
      if (paramInt1 != 508)
      {
        if (paramInt1 != 510) {
          return super.setValue(paramInt1, paramInt2);
        }
        mPositionType = paramInt2;
      }
      else
      {
        mCurveFit = paramInt2;
      }
    }
    else {
      mFramePosition = paramInt2;
    }
    return true;
  }
  
  public boolean setValue(int paramInt, String paramString)
  {
    if (paramInt != 501) {
      return super.setValue(paramInt, paramString);
    }
    mTransitionEasing = paramString.toString();
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.key.MotionKeyPosition
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */