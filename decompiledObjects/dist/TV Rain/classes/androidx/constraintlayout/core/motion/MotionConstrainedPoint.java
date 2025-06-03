package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.SplineSet.CustomSpline;
import androidx.constraintlayout.core.motion.utils.Utils;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

class MotionConstrainedPoint
  implements Comparable<MotionConstrainedPoint>
{
  public static final int CARTESIAN = 2;
  public static final boolean DEBUG = false;
  public static final int PERPENDICULAR = 1;
  public static final String TAG = "MotionPaths";
  public static String[] names = { "position", "x", "y", "width", "height", "pathRotate" };
  private float alpha = 1.0F;
  private boolean applyElevation = false;
  private float elevation = 0.0F;
  private float height;
  private int mAnimateRelativeTo = -1;
  public LinkedHashMap<String, CustomVariable> mCustomVariable = new LinkedHashMap();
  private int mDrawPath = 0;
  private Easing mKeyFrameEasing;
  public int mMode = 0;
  private float mPathRotate = NaN.0F;
  private float mPivotX = NaN.0F;
  private float mPivotY = NaN.0F;
  private float mProgress = NaN.0F;
  public double[] mTempDelta = new double[18];
  public double[] mTempValue = new double[18];
  public int mVisibilityMode = 0;
  private float position;
  private float rotation = 0.0F;
  private float rotationX = 0.0F;
  public float rotationY = 0.0F;
  private float scaleX = 1.0F;
  private float scaleY = 1.0F;
  private float translationX = 0.0F;
  private float translationY = 0.0F;
  private float translationZ = 0.0F;
  public int visibility;
  private float width;
  private float x;
  private float y;
  
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
  
  public void addValues(HashMap<String, SplineSet> paramHashMap, int paramInt)
  {
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject1 = (SplineSet)paramHashMap.get(str);
      str.getClass();
      int i = -1;
      switch (str.hashCode())
      {
      default: 
        break;
      case 803192288: 
        if (str.equals("pathRotate")) {
          i = 12;
        }
        break;
      case 92909918: 
        if (str.equals("alpha")) {
          i = 11;
        }
        break;
      case -908189617: 
        if (str.equals("scaleY")) {
          i = 10;
        }
        break;
      case -908189618: 
        if (str.equals("scaleX")) {
          i = 9;
        }
        break;
      case -987906985: 
        if (str.equals("pivotY")) {
          i = 8;
        }
        break;
      case -987906986: 
        if (str.equals("pivotX")) {
          i = 7;
        }
        break;
      case -1001078227: 
        if (str.equals("progress")) {
          i = 6;
        }
        break;
      case -1225497655: 
        if (str.equals("translationZ")) {
          i = 5;
        }
        break;
      case -1225497656: 
        if (str.equals("translationY")) {
          i = 4;
        }
        break;
      case -1225497657: 
        if (str.equals("translationX")) {
          i = 3;
        }
        break;
      case -1249320804: 
        if (str.equals("rotationZ")) {
          i = 2;
        }
        break;
      case -1249320805: 
        if (str.equals("rotationY")) {
          i = 1;
        }
        break;
      case -1249320806: 
        if (str.equals("rotationX")) {
          i = 0;
        }
        break;
      }
      float f1 = 1.0F;
      float f2 = 0.0F;
      float f3 = 0.0F;
      float f4 = 0.0F;
      float f5 = 0.0F;
      float f6 = 0.0F;
      float f7 = 0.0F;
      float f8 = 0.0F;
      float f9 = 0.0F;
      float f10 = 0.0F;
      float f11 = 0.0F;
      switch (i)
      {
      default: 
        if (str.startsWith("CUSTOM"))
        {
          Object localObject2 = str.split(",")[1];
          if (mCustomVariable.containsKey(localObject2))
          {
            localObject2 = (CustomVariable)mCustomVariable.get(localObject2);
            if ((localObject1 instanceof SplineSet.CustomSpline))
            {
              ((SplineSet.CustomSpline)localObject1).setPoint(paramInt, (CustomVariable)localObject2);
            }
            else
            {
              StringBuilder localStringBuilder = new StringBuilder();
              localStringBuilder.append(str);
              localStringBuilder.append(" ViewSpline not a CustomSet frame = ");
              localStringBuilder.append(paramInt);
              localStringBuilder.append(", value");
              localStringBuilder.append(((CustomVariable)localObject2).getValueToInterpolate());
              localStringBuilder.append(localObject1);
              Utils.loge("MotionPaths", localStringBuilder.toString());
            }
          }
        }
        else
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("UNKNOWN spline ");
          ((StringBuilder)localObject1).append(str);
          Utils.loge("MotionPaths", ((StringBuilder)localObject1).toString());
        }
        break;
      case 12: 
        if (Float.isNaN(mPathRotate)) {
          f1 = f11;
        } else {
          f1 = mPathRotate;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 11: 
        if (!Float.isNaN(alpha)) {
          f1 = alpha;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 10: 
        if (!Float.isNaN(scaleY)) {
          f1 = scaleY;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 9: 
        if (!Float.isNaN(scaleX)) {
          f1 = scaleX;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 8: 
        if (Float.isNaN(mPivotY)) {
          f1 = f2;
        } else {
          f1 = mPivotY;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 7: 
        if (Float.isNaN(mPivotX)) {
          f1 = f3;
        } else {
          f1 = mPivotX;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 6: 
        if (Float.isNaN(mProgress)) {
          f1 = f4;
        } else {
          f1 = mProgress;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 5: 
        if (Float.isNaN(translationZ)) {
          f1 = f5;
        } else {
          f1 = translationZ;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 4: 
        if (Float.isNaN(translationY)) {
          f1 = f6;
        } else {
          f1 = translationY;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 3: 
        if (Float.isNaN(translationX)) {
          f1 = f7;
        } else {
          f1 = translationX;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 2: 
        if (Float.isNaN(rotation)) {
          f1 = f8;
        } else {
          f1 = rotation;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 1: 
        if (Float.isNaN(rotationY)) {
          f1 = f9;
        } else {
          f1 = rotationY;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 0: 
        if (Float.isNaN(rotationX)) {
          f1 = f10;
        } else {
          f1 = rotationX;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
      }
    }
  }
  
  public void applyParameters(MotionWidget paramMotionWidget)
  {
    visibility = paramMotionWidget.getVisibility();
    float f;
    if (paramMotionWidget.getVisibility() != 4) {
      f = 0.0F;
    } else {
      f = paramMotionWidget.getAlpha();
    }
    alpha = f;
    applyElevation = false;
    rotation = paramMotionWidget.getRotationZ();
    rotationX = paramMotionWidget.getRotationX();
    rotationY = paramMotionWidget.getRotationY();
    scaleX = paramMotionWidget.getScaleX();
    scaleY = paramMotionWidget.getScaleY();
    mPivotX = paramMotionWidget.getPivotX();
    mPivotY = paramMotionWidget.getPivotY();
    translationX = paramMotionWidget.getTranslationX();
    translationY = paramMotionWidget.getTranslationY();
    translationZ = paramMotionWidget.getTranslationZ();
    Iterator localIterator = paramMotionWidget.getCustomAttributeNames().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      CustomVariable localCustomVariable = paramMotionWidget.getCustomAttribute(str);
      if ((localCustomVariable != null) && (localCustomVariable.isContinuous())) {
        mCustomVariable.put(str, localCustomVariable);
      }
    }
  }
  
  public int compareTo(MotionConstrainedPoint paramMotionConstrainedPoint)
  {
    return Float.compare(position, position);
  }
  
  public void different(MotionConstrainedPoint paramMotionConstrainedPoint, HashSet<String> paramHashSet)
  {
    if (diff(alpha, alpha)) {
      paramHashSet.add("alpha");
    }
    if (diff(elevation, elevation)) {
      paramHashSet.add("translationZ");
    }
    int i = visibility;
    int j = visibility;
    if ((i != j) && (mVisibilityMode == 0) && ((i == 4) || (j == 4))) {
      paramHashSet.add("alpha");
    }
    if (diff(rotation, rotation)) {
      paramHashSet.add("rotationZ");
    }
    if ((!Float.isNaN(mPathRotate)) || (!Float.isNaN(mPathRotate))) {
      paramHashSet.add("pathRotate");
    }
    if ((!Float.isNaN(mProgress)) || (!Float.isNaN(mProgress))) {
      paramHashSet.add("progress");
    }
    if (diff(rotationX, rotationX)) {
      paramHashSet.add("rotationX");
    }
    if (diff(rotationY, rotationY)) {
      paramHashSet.add("rotationY");
    }
    if (diff(mPivotX, mPivotX)) {
      paramHashSet.add("pivotX");
    }
    if (diff(mPivotY, mPivotY)) {
      paramHashSet.add("pivotY");
    }
    if (diff(scaleX, scaleX)) {
      paramHashSet.add("scaleX");
    }
    if (diff(scaleY, scaleY)) {
      paramHashSet.add("scaleY");
    }
    if (diff(translationX, translationX)) {
      paramHashSet.add("translationX");
    }
    if (diff(translationY, translationY)) {
      paramHashSet.add("translationY");
    }
    if (diff(translationZ, translationZ)) {
      paramHashSet.add("translationZ");
    }
    if (diff(elevation, elevation)) {
      paramHashSet.add("elevation");
    }
  }
  
  public void different(MotionConstrainedPoint paramMotionConstrainedPoint, boolean[] paramArrayOfBoolean, String[] paramArrayOfString)
  {
    paramArrayOfBoolean[0] |= diff(position, position);
    paramArrayOfBoolean[1] |= diff(x, x);
    paramArrayOfBoolean[2] |= diff(y, y);
    paramArrayOfBoolean[3] |= diff(width, width);
    int i = paramArrayOfBoolean[4];
    paramArrayOfBoolean[4] = (diff(height, height) | i);
  }
  
  public void fillStandard(double[] paramArrayOfDouble, int[] paramArrayOfInt)
  {
    float f1 = position;
    int i = 0;
    float f2 = x;
    float f3 = y;
    float f4 = width;
    float f5 = height;
    float f6 = alpha;
    float f7 = elevation;
    float f8 = rotation;
    float f9 = rotationX;
    float f10 = rotationY;
    float f11 = scaleX;
    float f12 = scaleY;
    float f13 = mPivotX;
    float f14 = mPivotY;
    float f15 = translationX;
    float f16 = translationY;
    float f17 = translationZ;
    float f18 = mPathRotate;
    int m;
    for (int j = 0; i < paramArrayOfInt.length; j = m)
    {
      int k = paramArrayOfInt[i];
      m = j;
      if (k < 18)
      {
        paramArrayOfDouble[j] = new float[] { f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18 }[k];
        m = j + 1;
      }
      i++;
    }
  }
  
  public int getCustomData(String paramString, double[] paramArrayOfDouble, int paramInt)
  {
    paramString = (CustomVariable)mCustomVariable.get(paramString);
    if (paramString.numberOfInterpolatedValues() == 1)
    {
      paramArrayOfDouble[paramInt] = paramString.getValueToInterpolate();
      return 1;
    }
    int i = paramString.numberOfInterpolatedValues();
    float[] arrayOfFloat = new float[i];
    paramString.getValuesToInterpolate(arrayOfFloat);
    int j = 0;
    while (j < i)
    {
      paramArrayOfDouble[paramInt] = arrayOfFloat[j];
      j++;
      paramInt++;
    }
    return i;
  }
  
  public int getCustomDataCount(String paramString)
  {
    return ((CustomVariable)mCustomVariable.get(paramString)).numberOfInterpolatedValues();
  }
  
  public boolean hasCustomData(String paramString)
  {
    return mCustomVariable.containsKey(paramString);
  }
  
  public void setBounds(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    x = paramFloat1;
    y = paramFloat2;
    width = paramFloat3;
    height = paramFloat4;
  }
  
  public void setState(MotionWidget paramMotionWidget)
  {
    setBounds(paramMotionWidget.getX(), paramMotionWidget.getY(), paramMotionWidget.getWidth(), paramMotionWidget.getHeight());
    applyParameters(paramMotionWidget);
  }
  
  public void setState(Rect paramRect, MotionWidget paramMotionWidget, int paramInt, float paramFloat)
  {
    setBounds(left, top, paramRect.width(), paramRect.height());
    applyParameters(paramMotionWidget);
    mPivotX = NaN.0F;
    mPivotY = NaN.0F;
    if (paramInt != 1)
    {
      if (paramInt == 2) {
        rotation = (paramFloat + 90.0F);
      }
    }
    else {
      rotation = (paramFloat - 90.0F);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.MotionConstrainedPoint
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */