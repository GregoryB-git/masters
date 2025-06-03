package androidx.constraintlayout.motion.widget;

import a;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet.Constraint;
import androidx.constraintlayout.widget.ConstraintSet.Layout;
import androidx.constraintlayout.widget.ConstraintSet.Motion;
import androidx.constraintlayout.widget.ConstraintSet.PropertySet;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

class MotionPaths
  implements Comparable<MotionPaths>
{
  public static final int CARTESIAN = 0;
  public static final boolean DEBUG = false;
  public static final int OFF_HEIGHT = 4;
  public static final int OFF_PATH_ROTATE = 5;
  public static final int OFF_POSITION = 0;
  public static final int OFF_WIDTH = 3;
  public static final int OFF_X = 1;
  public static final int OFF_Y = 2;
  public static final boolean OLD_WAY = false;
  public static final int PERPENDICULAR = 1;
  public static final int SCREEN = 2;
  public static final String TAG = "MotionPaths";
  public static String[] names = { "position", "x", "y", "width", "height", "pathRotate" };
  public LinkedHashMap<String, ConstraintAttribute> attributes;
  public float height;
  public int mAnimateCircleAngleTo;
  public int mAnimateRelativeTo;
  public int mDrawPath = 0;
  public Easing mKeyFrameEasing;
  public int mMode;
  public int mPathMotionArc;
  public float mPathRotate = NaN.0F;
  public float mProgress = NaN.0F;
  public float mRelativeAngle;
  public MotionController mRelativeToController;
  public double[] mTempDelta;
  public double[] mTempValue;
  public float position;
  public float time;
  public float width;
  public float x;
  public float y;
  
  public MotionPaths()
  {
    int i = Key.UNSET;
    mPathMotionArc = i;
    mAnimateRelativeTo = i;
    mRelativeAngle = NaN.0F;
    mRelativeToController = null;
    attributes = new LinkedHashMap();
    mMode = 0;
    mTempValue = new double[18];
    mTempDelta = new double[18];
  }
  
  public MotionPaths(int paramInt1, int paramInt2, KeyPosition paramKeyPosition, MotionPaths paramMotionPaths1, MotionPaths paramMotionPaths2)
  {
    int i = Key.UNSET;
    mPathMotionArc = i;
    mAnimateRelativeTo = i;
    mRelativeAngle = NaN.0F;
    mRelativeToController = null;
    attributes = new LinkedHashMap();
    mMode = 0;
    mTempValue = new double[18];
    mTempDelta = new double[18];
    if (mAnimateRelativeTo != Key.UNSET)
    {
      initPolar(paramInt1, paramInt2, paramKeyPosition, paramMotionPaths1, paramMotionPaths2);
      return;
    }
    i = mPositionType;
    if (i != 1)
    {
      if (i != 2)
      {
        initCartesian(paramKeyPosition, paramMotionPaths1, paramMotionPaths2);
        return;
      }
      initScreen(paramInt1, paramInt2, paramKeyPosition, paramMotionPaths1, paramMotionPaths2);
      return;
    }
    initPath(paramKeyPosition, paramMotionPaths1, paramMotionPaths2);
  }
  
  private boolean diff(float paramFloat1, float paramFloat2)
  {
    boolean bool1 = Float.isNaN(paramFloat1);
    boolean bool2 = true;
    boolean bool3 = true;
    if ((!bool1) && (!Float.isNaN(paramFloat2)))
    {
      if (Math.abs(paramFloat1 - paramFloat2) <= 1.0E-6F) {
        bool3 = false;
      }
      return bool3;
    }
    if (Float.isNaN(paramFloat1) != Float.isNaN(paramFloat2)) {
      bool3 = bool2;
    } else {
      bool3 = false;
    }
    return bool3;
  }
  
  private static final float xRotate(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    return (paramFloat5 - paramFloat3) * paramFloat2 - (paramFloat6 - paramFloat4) * paramFloat1 + paramFloat3;
  }
  
  private static final float yRotate(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    return (paramFloat6 - paramFloat4) * paramFloat2 + (paramFloat5 - paramFloat3) * paramFloat1 + paramFloat4;
  }
  
  public void applyParameters(ConstraintSet.Constraint paramConstraint)
  {
    mKeyFrameEasing = Easing.getInterpolator(motion.mTransitionEasing);
    Object localObject = motion;
    mPathMotionArc = mPathMotionArc;
    mAnimateRelativeTo = mAnimateRelativeTo;
    mPathRotate = mPathRotate;
    mDrawPath = mDrawPath;
    mAnimateCircleAngleTo = mAnimateCircleAngleTo;
    mProgress = propertySet.mProgress;
    mRelativeAngle = layout.circleAngle;
    Iterator localIterator = mCustomConstraints.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localObject = (ConstraintAttribute)mCustomConstraints.get(str);
      if ((localObject != null) && (((ConstraintAttribute)localObject).isContinuous())) {
        attributes.put(str, localObject);
      }
    }
  }
  
  public int compareTo(@NonNull MotionPaths paramMotionPaths)
  {
    return Float.compare(position, position);
  }
  
  public void configureRelativeTo(MotionController paramMotionController)
  {
    paramMotionController.getPos(mProgress);
  }
  
  public void different(MotionPaths paramMotionPaths, boolean[] paramArrayOfBoolean, String[] paramArrayOfString, boolean paramBoolean)
  {
    boolean bool1 = diff(x, x);
    boolean bool2 = diff(y, y);
    paramArrayOfBoolean[0] |= diff(position, position);
    int i = paramArrayOfBoolean[1];
    int j = bool1 | bool2 | paramBoolean;
    paramArrayOfBoolean[1] = (i | j);
    paramArrayOfBoolean[2] = (j | paramArrayOfBoolean[2]);
    paramArrayOfBoolean[3] |= diff(width, width);
    paramBoolean = paramArrayOfBoolean[4];
    paramArrayOfBoolean[4] = (diff(height, height) | paramBoolean);
  }
  
  public void fillStandard(double[] paramArrayOfDouble, int[] paramArrayOfInt)
  {
    float f1 = position;
    int i = 0;
    float f2 = x;
    float f3 = y;
    float f4 = width;
    float f5 = height;
    float f6 = mPathRotate;
    int m;
    for (int j = 0; i < paramArrayOfInt.length; j = m)
    {
      int k = paramArrayOfInt[i];
      m = j;
      if (k < 6)
      {
        paramArrayOfDouble[j] = new float[] { f1, f2, f3, f4, f5, f6 }[k];
        m = j + 1;
      }
      i++;
    }
  }
  
  public void getBounds(int[] paramArrayOfInt, double[] paramArrayOfDouble, float[] paramArrayOfFloat, int paramInt)
  {
    float f1 = width;
    float f2 = height;
    for (int i = 0; i < paramArrayOfInt.length; i++)
    {
      float f3 = (float)paramArrayOfDouble[i];
      int j = paramArrayOfInt[i];
      if (j != 3)
      {
        if (j == 4) {
          f2 = f3;
        }
      }
      else {
        f1 = f3;
      }
    }
    paramArrayOfFloat[paramInt] = f1;
    paramArrayOfFloat[(paramInt + 1)] = f2;
  }
  
  public void getCenter(double paramDouble, int[] paramArrayOfInt, double[] paramArrayOfDouble, float[] paramArrayOfFloat, int paramInt)
  {
    float f1 = x;
    float f2 = y;
    float f3 = width;
    float f4 = height;
    for (int i = 0; i < paramArrayOfInt.length; i++)
    {
      f5 = (float)paramArrayOfDouble[i];
      int j = paramArrayOfInt[i];
      if (j != 1)
      {
        if (j != 2)
        {
          if (j != 3)
          {
            if (j == 4) {
              f4 = f5;
            }
          }
          else {
            f3 = f5;
          }
        }
        else {
          f2 = f5;
        }
      }
      else {
        f1 = f5;
      }
    }
    paramArrayOfDouble = mRelativeToController;
    float f6 = f1;
    float f5 = f2;
    if (paramArrayOfDouble != null)
    {
      paramArrayOfInt = new float[2];
      paramArrayOfDouble.getCenter(paramDouble, paramArrayOfInt, new float[2]);
      f6 = paramArrayOfInt[0];
      f5 = paramArrayOfInt[1];
      double d1 = f6;
      double d2 = f1;
      paramDouble = f2;
      f2 = (float)(Math.sin(paramDouble) * d2 + d1 - f3 / 2.0F);
      f5 = (float)(f5 - Math.cos(paramDouble) * d2 - f4 / 2.0F);
      f6 = f2;
    }
    paramArrayOfFloat[paramInt] = (f3 / 2.0F + f6 + 0.0F);
    paramArrayOfFloat[(paramInt + 1)] = (f4 / 2.0F + f5 + 0.0F);
  }
  
  public void getCenter(double paramDouble, int[] paramArrayOfInt, double[] paramArrayOfDouble1, float[] paramArrayOfFloat1, double[] paramArrayOfDouble2, float[] paramArrayOfFloat2)
  {
    float f1 = x;
    float f2 = y;
    float f3 = width;
    float f4 = height;
    int i = 0;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    while (i < paramArrayOfInt.length)
    {
      f9 = (float)paramArrayOfDouble1[i];
      f10 = (float)paramArrayOfDouble2[i];
      int j = paramArrayOfInt[i];
      if (j != 1)
      {
        if (j != 2)
        {
          if (j != 3)
          {
            if (j == 4)
            {
              f4 = f9;
              f8 = f10;
            }
          }
          else
          {
            f3 = f9;
            f6 = f10;
          }
        }
        else
        {
          f2 = f9;
          f7 = f10;
        }
      }
      else
      {
        f5 = f10;
        f1 = f9;
      }
      i++;
    }
    float f9 = f6 / 2.0F + f5;
    f8 = f8 / 2.0F + f7;
    paramArrayOfDouble2 = mRelativeToController;
    f6 = f1;
    float f10 = f2;
    if (paramArrayOfDouble2 != null)
    {
      paramArrayOfDouble1 = new float[2];
      paramArrayOfInt = new float[2];
      paramArrayOfDouble2.getCenter(paramDouble, paramArrayOfDouble1, paramArrayOfInt);
      f6 = paramArrayOfDouble1[0];
      f10 = paramArrayOfDouble1[1];
      f9 = paramArrayOfInt[0];
      f8 = paramArrayOfInt[1];
      double d1 = f6;
      double d2 = f1;
      paramDouble = f2;
      f6 = (float)(Math.sin(paramDouble) * d2 + d1 - f3 / 2.0F);
      f10 = (float)(f10 - Math.cos(paramDouble) * d2 - f4 / 2.0F);
      double d3 = f9;
      d1 = f5;
      double d4 = Math.sin(paramDouble);
      double d5 = Math.cos(paramDouble);
      d2 = f7;
      f9 = (float)(d5 * d2 + (d4 * d1 + d3));
      d5 = f8;
      d4 = Math.cos(paramDouble);
      f8 = (float)(Math.sin(paramDouble) * d2 + (d5 - d4 * d1));
    }
    paramArrayOfFloat1[0] = (f3 / 2.0F + f6 + 0.0F);
    paramArrayOfFloat1[1] = (f4 / 2.0F + f10 + 0.0F);
    paramArrayOfFloat2[0] = f9;
    paramArrayOfFloat2[1] = f8;
  }
  
  public void getCenterVelocity(double paramDouble, int[] paramArrayOfInt, double[] paramArrayOfDouble, float[] paramArrayOfFloat, int paramInt)
  {
    float f1 = x;
    float f2 = y;
    float f3 = width;
    float f4 = height;
    for (int i = 0; i < paramArrayOfInt.length; i++)
    {
      f5 = (float)paramArrayOfDouble[i];
      int j = paramArrayOfInt[i];
      if (j != 1)
      {
        if (j != 2)
        {
          if (j != 3)
          {
            if (j == 4) {
              f4 = f5;
            }
          }
          else {
            f3 = f5;
          }
        }
        else {
          f2 = f5;
        }
      }
      else {
        f1 = f5;
      }
    }
    paramArrayOfDouble = mRelativeToController;
    float f6 = f1;
    float f5 = f2;
    if (paramArrayOfDouble != null)
    {
      paramArrayOfInt = new float[2];
      paramArrayOfDouble.getCenter(paramDouble, paramArrayOfInt, new float[2]);
      f6 = paramArrayOfInt[0];
      f5 = paramArrayOfInt[1];
      paramDouble = f6;
      double d1 = f1;
      double d2 = f2;
      f2 = (float)(Math.sin(d2) * d1 + paramDouble - f3 / 2.0F);
      f5 = (float)(f5 - Math.cos(d2) * d1 - f4 / 2.0F);
      f6 = f2;
    }
    paramArrayOfFloat[paramInt] = (f3 / 2.0F + f6 + 0.0F);
    paramArrayOfFloat[(paramInt + 1)] = (f4 / 2.0F + f5 + 0.0F);
  }
  
  public int getCustomData(String paramString, double[] paramArrayOfDouble, int paramInt)
  {
    paramString = (ConstraintAttribute)attributes.get(paramString);
    int i = 0;
    if (paramString == null) {
      return 0;
    }
    if (paramString.numberOfInterpolatedValues() == 1)
    {
      paramArrayOfDouble[paramInt] = paramString.getValueToInterpolate();
      return 1;
    }
    int j = paramString.numberOfInterpolatedValues();
    float[] arrayOfFloat = new float[j];
    paramString.getValuesToInterpolate(arrayOfFloat);
    while (i < j)
    {
      paramArrayOfDouble[paramInt] = arrayOfFloat[i];
      i++;
      paramInt++;
    }
    return j;
  }
  
  public int getCustomDataCount(String paramString)
  {
    paramString = (ConstraintAttribute)attributes.get(paramString);
    if (paramString == null) {
      return 0;
    }
    return paramString.numberOfInterpolatedValues();
  }
  
  public void getRect(int[] paramArrayOfInt, double[] paramArrayOfDouble, float[] paramArrayOfFloat, int paramInt)
  {
    float f1 = x;
    float f2 = y;
    float f3 = width;
    float f4 = height;
    for (int i = 0; i < paramArrayOfInt.length; i++)
    {
      f5 = (float)paramArrayOfDouble[i];
      j = paramArrayOfInt[i];
      if (j != 1)
      {
        if (j != 2)
        {
          if (j != 3)
          {
            if (j == 4) {
              f4 = f5;
            }
          }
          else {
            f3 = f5;
          }
        }
        else {
          f2 = f5;
        }
      }
      else {
        f1 = f5;
      }
    }
    paramArrayOfInt = mRelativeToController;
    float f6 = f1;
    float f5 = f2;
    if (paramArrayOfInt != null)
    {
      f6 = paramArrayOfInt.getCenterX();
      f5 = mRelativeToController.getCenterY();
      double d1 = f6;
      double d2 = f1;
      double d3 = f2;
      f6 = (float)(Math.sin(d3) * d2 + d1 - f3 / 2.0F);
      f5 = (float)(f5 - Math.cos(d3) * d2 - f4 / 2.0F);
    }
    f2 = f3 + f6;
    f1 = f4 + f5;
    Float.isNaN(NaN.0F);
    Float.isNaN(NaN.0F);
    i = paramInt + 1;
    paramArrayOfFloat[paramInt] = (f6 + 0.0F);
    int j = i + 1;
    paramArrayOfFloat[i] = (f5 + 0.0F);
    paramInt = j + 1;
    paramArrayOfFloat[j] = (f2 + 0.0F);
    i = paramInt + 1;
    paramArrayOfFloat[paramInt] = (f5 + 0.0F);
    paramInt = i + 1;
    paramArrayOfFloat[i] = (f2 + 0.0F);
    i = paramInt + 1;
    paramArrayOfFloat[paramInt] = (f1 + 0.0F);
    paramArrayOfFloat[i] = (f6 + 0.0F);
    paramArrayOfFloat[(i + 1)] = (f1 + 0.0F);
  }
  
  public boolean hasCustomData(String paramString)
  {
    return attributes.containsKey(paramString);
  }
  
  public void initCartesian(KeyPosition paramKeyPosition, MotionPaths paramMotionPaths1, MotionPaths paramMotionPaths2)
  {
    float f1 = mFramePosition / 100.0F;
    time = f1;
    mDrawPath = mDrawPath;
    if (Float.isNaN(mPercentWidth)) {
      f2 = f1;
    } else {
      f2 = mPercentWidth;
    }
    if (Float.isNaN(mPercentHeight)) {
      f3 = f1;
    } else {
      f3 = mPercentHeight;
    }
    float f4 = width;
    float f5 = width;
    float f6 = height;
    float f7 = height;
    position = time;
    float f8 = x;
    float f9 = f5 / 2.0F;
    float f10 = y;
    float f11 = f7 / 2.0F;
    float f12 = x;
    float f13 = f4 / 2.0F;
    float f14 = y;
    float f15 = f6 / 2.0F;
    f9 = f13 + f12 - (f9 + f8);
    f15 = f15 + f14 - (f11 + f10);
    float f2 = (f4 - f5) * f2;
    f4 = f2 / 2.0F;
    x = ((int)(f9 * f1 + f8 - f4));
    float f3 = (f6 - f7) * f3;
    f6 = f3 / 2.0F;
    y = ((int)(f15 * f1 + f10 - f6));
    width = ((int)(f5 + f2));
    height = ((int)(f7 + f3));
    if (Float.isNaN(mPercentX)) {
      f3 = f1;
    } else {
      f3 = mPercentX;
    }
    boolean bool = Float.isNaN(mAltPercentY);
    f10 = 0.0F;
    if (bool) {
      f2 = 0.0F;
    } else {
      f2 = mAltPercentY;
    }
    if (!Float.isNaN(mPercentY)) {
      f1 = mPercentY;
    }
    if (!Float.isNaN(mAltPercentX)) {
      f10 = mAltPercentX;
    }
    mMode = 0;
    x = ((int)(f10 * f15 + (f3 * f9 + x) - f4));
    y = ((int)(f15 * f1 + (f9 * f2 + y) - f6));
    mKeyFrameEasing = Easing.getInterpolator(mTransitionEasing);
    mPathMotionArc = mPathMotionArc;
  }
  
  public void initPath(KeyPosition paramKeyPosition, MotionPaths paramMotionPaths1, MotionPaths paramMotionPaths2)
  {
    float f1 = mFramePosition / 100.0F;
    time = f1;
    mDrawPath = mDrawPath;
    if (Float.isNaN(mPercentWidth)) {
      f2 = f1;
    } else {
      f2 = mPercentWidth;
    }
    if (Float.isNaN(mPercentHeight)) {
      f3 = f1;
    } else {
      f3 = mPercentHeight;
    }
    float f4 = width;
    float f5 = width;
    float f6 = height;
    float f7 = height;
    position = time;
    if (!Float.isNaN(mPercentX)) {
      f1 = mPercentX;
    }
    float f8 = x;
    float f9 = width;
    float f10 = f9 / 2.0F;
    float f11 = y;
    float f12 = height;
    float f13 = f12 / 2.0F;
    float f14 = x;
    float f15 = width / 2.0F;
    float f16 = y;
    float f17 = height / 2.0F;
    f14 = f15 + f14 - (f10 + f8);
    f13 = f17 + f16 - (f13 + f11);
    f16 = f14 * f1;
    f4 = (f4 - f5) * f2;
    float f2 = f4 / 2.0F;
    x = ((int)(f8 + f16 - f2));
    f8 = f1 * f13;
    f1 = (f6 - f7) * f3;
    float f3 = f1 / 2.0F;
    y = ((int)(f11 + f8 - f3));
    width = ((int)(f9 + f4));
    height = ((int)(f12 + f1));
    if (Float.isNaN(mPercentY)) {
      f1 = 0.0F;
    } else {
      f1 = mPercentY;
    }
    f7 = -f13;
    mMode = 1;
    f2 = (int)(x + f16 - f2);
    f3 = (int)(y + f8 - f3);
    x = (f2 + f7 * f1);
    y = (f3 + f14 * f1);
    mAnimateRelativeTo = mAnimateRelativeTo;
    mKeyFrameEasing = Easing.getInterpolator(mTransitionEasing);
    mPathMotionArc = mPathMotionArc;
  }
  
  public void initPolar(int paramInt1, int paramInt2, KeyPosition paramKeyPosition, MotionPaths paramMotionPaths1, MotionPaths paramMotionPaths2)
  {
    float f1 = mFramePosition / 100.0F;
    time = f1;
    mDrawPath = mDrawPath;
    mMode = mPositionType;
    float f2;
    if (Float.isNaN(mPercentWidth)) {
      f2 = f1;
    } else {
      f2 = mPercentWidth;
    }
    float f3;
    if (Float.isNaN(mPercentHeight)) {
      f3 = f1;
    } else {
      f3 = mPercentHeight;
    }
    float f4 = width;
    float f5 = width;
    float f6 = height;
    float f7 = height;
    position = time;
    width = ((int)((f4 - f5) * f2 + f5));
    height = ((int)((f6 - f7) * f3 + f7));
    paramInt1 = mPositionType;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (Float.isNaN(mPercentX)) {
          f2 = f1;
        } else {
          f2 = mPercentX;
        }
        f3 = x;
        f7 = x;
        x = a.a(f3, f7, f2, f7);
        if (!Float.isNaN(mPercentY)) {
          f1 = mPercentY;
        }
        f2 = y;
        f3 = y;
        y = a.a(f2, f3, f1, f3);
      }
      else
      {
        if (Float.isNaN(mPercentX))
        {
          f2 = x;
          f3 = x;
          f2 = a.a(f2, f3, f1, f3);
        }
        else
        {
          f7 = mPercentX;
          f2 = Math.min(f3, f2) * f7;
        }
        x = f2;
        if (Float.isNaN(mPercentY))
        {
          f3 = y;
          f2 = y;
          f1 = a.a(f3, f2, f1, f2);
        }
        else
        {
          f1 = mPercentY;
        }
        y = f1;
      }
    }
    else
    {
      if (Float.isNaN(mPercentX)) {
        f2 = f1;
      } else {
        f2 = mPercentX;
      }
      f7 = x;
      f3 = x;
      x = a.a(f7, f3, f2, f3);
      if (!Float.isNaN(mPercentY)) {
        f1 = mPercentY;
      }
      f3 = y;
      f2 = y;
      y = a.a(f3, f2, f1, f2);
    }
    mAnimateRelativeTo = mAnimateRelativeTo;
    mKeyFrameEasing = Easing.getInterpolator(mTransitionEasing);
    mPathMotionArc = mPathMotionArc;
  }
  
  public void initScreen(int paramInt1, int paramInt2, KeyPosition paramKeyPosition, MotionPaths paramMotionPaths1, MotionPaths paramMotionPaths2)
  {
    float f1 = mFramePosition / 100.0F;
    time = f1;
    mDrawPath = mDrawPath;
    if (Float.isNaN(mPercentWidth)) {
      f2 = f1;
    } else {
      f2 = mPercentWidth;
    }
    if (Float.isNaN(mPercentHeight)) {
      f3 = f1;
    } else {
      f3 = mPercentHeight;
    }
    float f4 = width;
    float f5 = width;
    float f6 = height;
    float f7 = height;
    position = time;
    float f8 = x;
    float f9 = f5 / 2.0F;
    float f10 = y;
    float f11 = f7 / 2.0F;
    float f12 = x;
    float f13 = f4 / 2.0F;
    float f14 = y;
    float f15 = f6 / 2.0F;
    float f2 = (f4 - f5) * f2;
    x = ((int)((f13 + f12 - (f9 + f8)) * f1 + f8 - f2 / 2.0F));
    float f3 = (f6 - f7) * f3;
    y = ((int)((f15 + f14 - (f11 + f10)) * f1 + f10 - f3 / 2.0F));
    width = ((int)(f5 + f2));
    height = ((int)(f7 + f3));
    mMode = 2;
    if (!Float.isNaN(mPercentX))
    {
      paramInt1 = (int)(paramInt1 - width);
      x = ((int)(mPercentX * paramInt1));
    }
    if (!Float.isNaN(mPercentY))
    {
      paramInt1 = (int)(paramInt2 - height);
      y = ((int)(mPercentY * paramInt1));
    }
    mAnimateRelativeTo = mAnimateRelativeTo;
    mKeyFrameEasing = Easing.getInterpolator(mTransitionEasing);
    mPathMotionArc = mPathMotionArc;
  }
  
  public void setBounds(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    x = paramFloat1;
    y = paramFloat2;
    width = paramFloat3;
    height = paramFloat4;
  }
  
  public void setDpDt(float paramFloat1, float paramFloat2, float[] paramArrayOfFloat, int[] paramArrayOfInt, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    int i = 0;
    float f1 = 0.0F;
    float f2 = f1;
    float f3 = f2;
    float f4 = f3;
    float f5 = f2;
    while (i < paramArrayOfInt.length)
    {
      f2 = (float)paramArrayOfDouble1[i];
      double d = paramArrayOfDouble2[i];
      int j = paramArrayOfInt[i];
      if (j != 1)
      {
        if (j != 2)
        {
          if (j != 3)
          {
            if (j == 4) {
              f4 = f2;
            }
          }
          else {
            f5 = f2;
          }
        }
        else {
          f3 = f2;
        }
      }
      else {
        f1 = f2;
      }
      i++;
    }
    f2 = f1 - 0.0F * f5 / 2.0F;
    f3 -= 0.0F * f4 / 2.0F;
    paramArrayOfFloat[0] = ((f5 * 1.0F + f2) * paramFloat1 + (1.0F - paramFloat1) * f2 + 0.0F);
    paramArrayOfFloat[1] = ((f4 * 1.0F + f3) * paramFloat2 + (1.0F - paramFloat2) * f3 + 0.0F);
  }
  
  public void setView(float paramFloat, View paramView, int[] paramArrayOfInt, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, double[] paramArrayOfDouble3, boolean paramBoolean)
  {
    float f1 = x;
    float f2 = y;
    float f3 = width;
    float f4 = height;
    if ((paramArrayOfInt.length != 0) && (mTempValue.length <= paramArrayOfInt[(paramArrayOfInt.length - 1)]))
    {
      i = paramArrayOfInt[(paramArrayOfInt.length - 1)] + 1;
      mTempValue = new double[i];
      mTempDelta = new double[i];
    }
    Arrays.fill(mTempValue, NaN.0D);
    for (int i = 0; i < paramArrayOfInt.length; i++)
    {
      double[] arrayOfDouble = mTempValue;
      j = paramArrayOfInt[i];
      arrayOfDouble[j] = paramArrayOfDouble1[i];
      mTempDelta[j] = paramArrayOfDouble2[i];
    }
    float f5 = NaN.0F;
    i = 0;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    double d1;
    float f10;
    float f11;
    float f12;
    for (;;)
    {
      paramArrayOfInt = mTempValue;
      if (i >= paramArrayOfInt.length) {
        break;
      }
      boolean bool = Double.isNaN(paramArrayOfInt[i]);
      d1 = 0.0D;
      if ((!bool) || ((paramArrayOfDouble3 == null) || (paramArrayOfDouble3[i] != 0.0D)))
      {
        if (paramArrayOfDouble3 != null) {
          d1 = paramArrayOfDouble3[i];
        }
        if (!Double.isNaN(mTempValue[i])) {
          d1 = mTempValue[i] + d1;
        }
        f10 = f5;
        f11 = (float)d1;
        f12 = (float)mTempDelta[i];
        if (i == 1) {
          break label339;
        }
        if (i == 2) {
          break label324;
        }
        if (i == 3) {
          break label309;
        }
        if (i == 4) {
          break label294;
        }
        if (i == 5) {}
      }
      else
      {
        f11 = f5;
        break label351;
      }
      break label351;
      label294:
      f4 = f11;
      f11 = f10;
      f9 = f12;
      break label351;
      label309:
      f3 = f11;
      f11 = f10;
      f8 = f12;
      break label351;
      label324:
      f2 = f11;
      f11 = f10;
      f7 = f12;
      break label351;
      label339:
      f1 = f11;
      f6 = f12;
      f11 = f10;
      label351:
      i++;
      f5 = f11;
    }
    paramArrayOfDouble3 = mRelativeToController;
    double d3;
    if (paramArrayOfDouble3 != null)
    {
      paramArrayOfDouble1 = new float[2];
      paramArrayOfInt = new float[2];
      paramArrayOfDouble3.getCenter(paramFloat, paramArrayOfDouble1, paramArrayOfInt);
      f11 = paramArrayOfDouble1[0];
      paramFloat = paramArrayOfDouble1[1];
      f12 = paramArrayOfInt[0];
      f10 = paramArrayOfInt[1];
      double d2 = f11;
      d3 = f1;
      d1 = f2;
      f11 = (float)(Math.sin(d1) * d3 + d2 - f3 / 2.0F);
      paramFloat = (float)(paramFloat - Math.cos(d1) * d3 - f4 / 2.0F);
      double d4 = f12;
      d2 = f6;
      double d5 = Math.sin(d1);
      double d6 = Math.cos(d1);
      double d7 = f7;
      f12 = (float)(d6 * d3 * d7 + (d5 * d2 + d4));
      d4 = f10;
      d5 = Math.cos(d1);
      f10 = (float)(Math.sin(d1) * d3 * d7 + (d4 - d5 * d2));
      if (paramArrayOfDouble2.length >= 2)
      {
        paramArrayOfDouble2[0] = f12;
        paramArrayOfDouble2[1] = f10;
      }
      if (!Float.isNaN(f5))
      {
        d1 = f5;
        paramView.setRotation((float)(Math.toDegrees(Math.atan2(f10, f12)) + d1));
      }
    }
    else
    {
      f11 = f1;
      paramFloat = f2;
      if (!Float.isNaN(f5))
      {
        paramFloat = f8 / 2.0F;
        f11 = f9 / 2.0F;
        d3 = 0.0F;
        d1 = f5;
        paramView.setRotation((float)(Math.toDegrees(Math.atan2(f11 + f7, paramFloat + f6)) + d1 + d3));
        paramFloat = f2;
        f11 = f1;
      }
    }
    int j = 1;
    if ((paramView instanceof FloatLayout))
    {
      ((FloatLayout)paramView).layout(f11, paramFloat, f3 + f11, paramFloat + f4);
      return;
    }
    f11 += 0.5F;
    int k = (int)f11;
    paramFloat += 0.5F;
    int m = (int)paramFloat;
    int n = (int)(f11 + f3);
    int i1 = (int)(paramFloat + f4);
    int i2 = n - k;
    int i3 = i1 - m;
    i = j;
    if (i2 == paramView.getMeasuredWidth()) {
      if (i3 != paramView.getMeasuredHeight()) {
        i = j;
      } else {
        i = 0;
      }
    }
    if ((i != 0) || (paramBoolean)) {
      paramView.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }
    paramView.layout(k, m, n, i1);
  }
  
  public void setupRelative(MotionController paramMotionController, MotionPaths paramMotionPaths)
  {
    float f = x;
    double d1 = width / 2.0F + f - x - width / 2.0F;
    f = y;
    double d2 = height / 2.0F + f - y - height / 2.0F;
    mRelativeToController = paramMotionController;
    x = ((float)Math.hypot(d2, d1));
    if (Float.isNaN(mRelativeAngle)) {
      y = ((float)(Math.atan2(d2, d1) + 1.5707963267948966D));
    } else {
      y = ((float)Math.toRadians(mRelativeAngle));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionPaths
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */