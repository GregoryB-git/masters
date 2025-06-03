package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewSpline.CustomSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.ConstraintSet.Constraint;
import androidx.constraintlayout.widget.ConstraintSet.Motion;
import androidx.constraintlayout.widget.ConstraintSet.PropertySet;
import androidx.constraintlayout.widget.ConstraintSet.Transform;
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
  public LinkedHashMap<String, ConstraintAttribute> attributes = new LinkedHashMap();
  private float elevation = 0.0F;
  private float height;
  private int mAnimateRelativeTo = -1;
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
  
  public void addValues(HashMap<String, ViewSpline> paramHashMap, int paramInt)
  {
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject1 = (ViewSpline)paramHashMap.get(str);
      str.getClass();
      int i = -1;
      switch (str.hashCode())
      {
      default: 
        break;
      case 92909918: 
        if (str.equals("alpha")) {
          i = 13;
        }
        break;
      case 37232917: 
        if (str.equals("transitionPathRotate")) {
          i = 12;
        }
        break;
      case -4379043: 
        if (str.equals("elevation")) {
          i = 11;
        }
        break;
      case -40300674: 
        if (str.equals("rotation")) {
          i = 10;
        }
        break;
      case -760884509: 
        if (str.equals("transformPivotY")) {
          i = 9;
        }
        break;
      case -760884510: 
        if (str.equals("transformPivotX")) {
          i = 8;
        }
        break;
      case -908189617: 
        if (str.equals("scaleY")) {
          i = 7;
        }
        break;
      case -908189618: 
        if (str.equals("scaleX")) {
          i = 6;
        }
        break;
      case -1001078227: 
        if (str.equals("progress")) {
          i = 5;
        }
        break;
      case -1225497655: 
        if (str.equals("translationZ")) {
          i = 4;
        }
        break;
      case -1225497656: 
        if (str.equals("translationY")) {
          i = 3;
        }
        break;
      case -1225497657: 
        if (str.equals("translationX")) {
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
      float f12 = 0.0F;
      switch (i)
      {
      default: 
        if (str.startsWith("CUSTOM"))
        {
          Object localObject2 = str.split(",")[1];
          if (attributes.containsKey(localObject2))
          {
            ConstraintAttribute localConstraintAttribute = (ConstraintAttribute)attributes.get(localObject2);
            if ((localObject1 instanceof ViewSpline.CustomSet))
            {
              ((ViewSpline.CustomSet)localObject1).setPoint(paramInt, localConstraintAttribute);
            }
            else
            {
              localObject2 = new StringBuilder();
              ((StringBuilder)localObject2).append(str);
              ((StringBuilder)localObject2).append(" ViewSpline not a CustomSet frame = ");
              ((StringBuilder)localObject2).append(paramInt);
              ((StringBuilder)localObject2).append(", value");
              ((StringBuilder)localObject2).append(localConstraintAttribute.getValueToInterpolate());
              ((StringBuilder)localObject2).append(localObject1);
              Log.e("MotionPaths", ((StringBuilder)localObject2).toString());
            }
          }
        }
        else
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("UNKNOWN spline ");
          ((StringBuilder)localObject1).append(str);
          Log.e("MotionPaths", ((StringBuilder)localObject1).toString());
        }
        break;
      case 13: 
        if (!Float.isNaN(alpha)) {
          f1 = alpha;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 12: 
        if (Float.isNaN(mPathRotate)) {
          f1 = f12;
        } else {
          f1 = mPathRotate;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 11: 
        if (Float.isNaN(elevation)) {
          f1 = f2;
        } else {
          f1 = elevation;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 10: 
        if (Float.isNaN(rotation)) {
          f1 = f3;
        } else {
          f1 = rotation;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 9: 
        if (Float.isNaN(mPivotY)) {
          f1 = f4;
        } else {
          f1 = mPivotY;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 8: 
        if (Float.isNaN(mPivotX)) {
          f1 = f5;
        } else {
          f1 = mPivotX;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 7: 
        if (!Float.isNaN(scaleY)) {
          f1 = scaleY;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 6: 
        if (!Float.isNaN(scaleX)) {
          f1 = scaleX;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 5: 
        if (Float.isNaN(mProgress)) {
          f1 = f6;
        } else {
          f1 = mProgress;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 4: 
        if (Float.isNaN(translationZ)) {
          f1 = f7;
        } else {
          f1 = translationZ;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 3: 
        if (Float.isNaN(translationY)) {
          f1 = f8;
        } else {
          f1 = translationY;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 2: 
        if (Float.isNaN(translationX)) {
          f1 = f9;
        } else {
          f1 = translationX;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 1: 
        if (Float.isNaN(rotationY)) {
          f1 = f10;
        } else {
          f1 = rotationY;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
        break;
      case 0: 
        if (Float.isNaN(rotationX)) {
          f1 = f11;
        } else {
          f1 = rotationX;
        }
        ((SplineSet)localObject1).setPoint(paramInt, f1);
      }
    }
  }
  
  public void applyParameters(View paramView)
  {
    visibility = paramView.getVisibility();
    float f;
    if (paramView.getVisibility() != 0) {
      f = 0.0F;
    } else {
      f = paramView.getAlpha();
    }
    alpha = f;
    applyElevation = false;
    elevation = paramView.getElevation();
    rotation = paramView.getRotation();
    rotationX = paramView.getRotationX();
    rotationY = paramView.getRotationY();
    scaleX = paramView.getScaleX();
    scaleY = paramView.getScaleY();
    mPivotX = paramView.getPivotX();
    mPivotY = paramView.getPivotY();
    translationX = paramView.getTranslationX();
    translationY = paramView.getTranslationY();
    translationZ = paramView.getTranslationZ();
  }
  
  public void applyParameters(ConstraintSet.Constraint paramConstraint)
  {
    Object localObject = propertySet;
    int i = mVisibilityMode;
    mVisibilityMode = i;
    int j = visibility;
    visibility = j;
    float f;
    if ((j != 0) && (i == 0)) {
      f = 0.0F;
    } else {
      f = alpha;
    }
    alpha = f;
    localObject = transform;
    applyElevation = applyElevation;
    elevation = elevation;
    rotation = rotation;
    rotationX = rotationX;
    rotationY = rotationY;
    scaleX = scaleX;
    scaleY = scaleY;
    mPivotX = transformPivotX;
    mPivotY = transformPivotY;
    translationX = translationX;
    translationY = translationY;
    translationZ = translationZ;
    mKeyFrameEasing = Easing.getInterpolator(motion.mTransitionEasing);
    localObject = motion;
    mPathRotate = mPathRotate;
    mDrawPath = mDrawPath;
    mAnimateRelativeTo = mAnimateRelativeTo;
    mProgress = propertySet.mProgress;
    Iterator localIterator = mCustomConstraints.keySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      ConstraintAttribute localConstraintAttribute = (ConstraintAttribute)mCustomConstraints.get(localObject);
      if (localConstraintAttribute.isContinuous()) {
        attributes.put(localObject, localConstraintAttribute);
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
      paramHashSet.add("elevation");
    }
    int i = visibility;
    int j = visibility;
    if ((i != j) && (mVisibilityMode == 0) && ((i == 0) || (j == 0))) {
      paramHashSet.add("alpha");
    }
    if (diff(rotation, rotation)) {
      paramHashSet.add("rotation");
    }
    if ((!Float.isNaN(mPathRotate)) || (!Float.isNaN(mPathRotate))) {
      paramHashSet.add("transitionPathRotate");
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
      paramHashSet.add("transformPivotX");
    }
    if (diff(mPivotY, mPivotY)) {
      paramHashSet.add("transformPivotY");
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
    ConstraintAttribute localConstraintAttribute = (ConstraintAttribute)attributes.get(paramString);
    if (localConstraintAttribute.numberOfInterpolatedValues() == 1)
    {
      paramArrayOfDouble[paramInt] = localConstraintAttribute.getValueToInterpolate();
      return 1;
    }
    int i = localConstraintAttribute.numberOfInterpolatedValues();
    paramString = new float[i];
    localConstraintAttribute.getValuesToInterpolate(paramString);
    int j = 0;
    while (j < i)
    {
      paramArrayOfDouble[paramInt] = paramString[j];
      j++;
      paramInt++;
    }
    return i;
  }
  
  public int getCustomDataCount(String paramString)
  {
    return ((ConstraintAttribute)attributes.get(paramString)).numberOfInterpolatedValues();
  }
  
  public boolean hasCustomData(String paramString)
  {
    return attributes.containsKey(paramString);
  }
  
  public void setBounds(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    x = paramFloat1;
    y = paramFloat2;
    width = paramFloat3;
    height = paramFloat4;
  }
  
  public void setState(Rect paramRect, View paramView, int paramInt, float paramFloat)
  {
    setBounds(left, top, paramRect.width(), paramRect.height());
    applyParameters(paramView);
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
  
  public void setState(Rect paramRect, ConstraintSet paramConstraintSet, int paramInt1, int paramInt2)
  {
    setBounds(left, top, paramRect.width(), paramRect.height());
    applyParameters(paramConstraintSet.getParameters(paramInt2));
    if (paramInt1 != 1) {
      if (paramInt1 != 2)
      {
        if (paramInt1 != 3) {
          if (paramInt1 != 4) {
            return;
          }
        }
      }
      else
      {
        float f = rotation + 90.0F;
        rotation = f;
        if (f <= 180.0F) {
          return;
        }
        rotation = (f - 360.0F);
        return;
      }
    }
    rotation -= 90.0F;
  }
  
  public void setState(View paramView)
  {
    setBounds(paramView.getX(), paramView.getY(), paramView.getWidth(), paramView.getHeight());
    applyParameters(paramView);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionConstrainedPoint
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */