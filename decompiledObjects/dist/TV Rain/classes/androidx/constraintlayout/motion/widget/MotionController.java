package androidx.constraintlayout.motion.widget;

import a;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.motion.utils.CustomSupport;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewOscillator.PathRotateSet;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewSpline.PathRotate;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.motion.utils.ViewTimeCycle.PathRotate;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.ConstraintSet.Constraint;
import androidx.constraintlayout.widget.ConstraintSet.Motion;
import androidx.constraintlayout.widget.ConstraintSet.Transform;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import z2;

public class MotionController
{
  public static final int BOUNCE = 4;
  private static final boolean DEBUG = false;
  public static final int DRAW_PATH_AS_CONFIGURED = 4;
  public static final int DRAW_PATH_BASIC = 1;
  public static final int DRAW_PATH_CARTESIAN = 3;
  public static final int DRAW_PATH_NONE = 0;
  public static final int DRAW_PATH_RECTANGLE = 5;
  public static final int DRAW_PATH_RELATIVE = 2;
  public static final int DRAW_PATH_SCREEN = 6;
  public static final int EASE_IN = 1;
  public static final int EASE_IN_OUT = 0;
  public static final int EASE_OUT = 2;
  private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
  public static final int HORIZONTAL_PATH_X = 2;
  public static final int HORIZONTAL_PATH_Y = 3;
  private static final int INTERPOLATOR_REFERENCE_ID = -2;
  private static final int INTERPOLATOR_UNDEFINED = -3;
  public static final int LINEAR = 3;
  public static final int OVERSHOOT = 5;
  public static final int PATH_PERCENT = 0;
  public static final int PATH_PERPENDICULAR = 1;
  public static final int ROTATION_LEFT = 2;
  public static final int ROTATION_RIGHT = 1;
  private static final int SPLINE_STRING = -1;
  private static final String TAG = "MotionController";
  public static final int VERTICAL_PATH_X = 4;
  public static final int VERTICAL_PATH_Y = 5;
  private int MAX_DIMENSION = 4;
  public String[] attributeTable;
  private CurveFit mArcSpline;
  private int[] mAttributeInterpolatorCount;
  private String[] mAttributeNames;
  private HashMap<String, ViewSpline> mAttributesMap;
  public String mConstraintTag;
  public float mCurrentCenterX;
  public float mCurrentCenterY;
  private int mCurveFitType = -1;
  private HashMap<String, ViewOscillator> mCycleMap;
  private MotionPaths mEndMotionPath = new MotionPaths();
  private MotionConstrainedPoint mEndPoint = new MotionConstrainedPoint();
  public boolean mForceMeasure = false;
  public int mId;
  private double[] mInterpolateData;
  private int[] mInterpolateVariables;
  private double[] mInterpolateVelocity;
  private ArrayList<Key> mKeyList = new ArrayList();
  private KeyTrigger[] mKeyTriggers;
  private ArrayList<MotionPaths> mMotionPaths = new ArrayList();
  public float mMotionStagger = NaN.0F;
  private boolean mNoMovement;
  private int mPathMotionArc;
  private Interpolator mQuantizeMotionInterpolator;
  private float mQuantizeMotionPhase;
  private int mQuantizeMotionSteps;
  private CurveFit[] mSpline;
  public float mStaggerOffset = 0.0F;
  public float mStaggerScale = 1.0F;
  private MotionPaths mStartMotionPath = new MotionPaths();
  private MotionConstrainedPoint mStartPoint = new MotionConstrainedPoint();
  public Rect mTempRect = new Rect();
  private HashMap<String, ViewTimeCycle> mTimeCycleAttributesMap;
  private int mTransformPivotTarget;
  private View mTransformPivotView;
  private float[] mValuesBuff = new float[4];
  private float[] mVelocity = new float[1];
  public View mView;
  
  public MotionController(View paramView)
  {
    int i = Key.UNSET;
    mPathMotionArc = i;
    mTransformPivotTarget = i;
    mTransformPivotView = null;
    mQuantizeMotionSteps = i;
    mQuantizeMotionPhase = NaN.0F;
    mQuantizeMotionInterpolator = null;
    mNoMovement = false;
    setView(paramView);
  }
  
  private float getAdjustedPosition(float paramFloat, float[] paramArrayOfFloat)
  {
    float f1 = 0.0F;
    float f2 = 1.0F;
    float f3;
    if (paramArrayOfFloat != null)
    {
      paramArrayOfFloat[0] = 1.0F;
      f3 = paramFloat;
    }
    else
    {
      float f4 = mStaggerScale;
      f3 = paramFloat;
      if (f4 != 1.0D)
      {
        float f5 = mStaggerOffset;
        f6 = paramFloat;
        if (paramFloat < f5) {
          f6 = 0.0F;
        }
        f3 = f6;
        if (f6 > f5)
        {
          f3 = f6;
          if (f6 < 1.0D) {
            f3 = Math.min((f6 - f5) * f4, 1.0F);
          }
        }
      }
    }
    Object localObject = mStartMotionPath.mKeyFrameEasing;
    paramFloat = NaN.0F;
    Iterator localIterator = mMotionPaths.iterator();
    float f6 = f1;
    while (localIterator.hasNext())
    {
      MotionPaths localMotionPaths = (MotionPaths)localIterator.next();
      Easing localEasing = mKeyFrameEasing;
      if (localEasing != null)
      {
        f1 = time;
        if (f1 < f3)
        {
          localObject = localEasing;
          f6 = f1;
        }
        else if (Float.isNaN(paramFloat))
        {
          paramFloat = time;
        }
      }
    }
    f1 = f3;
    if (localObject != null)
    {
      if (Float.isNaN(paramFloat)) {
        paramFloat = f2;
      }
      paramFloat -= f6;
      double d = (f3 - f6) / paramFloat;
      paramFloat = (float)((Easing)localObject).get(d) * paramFloat + f6;
      f1 = paramFloat;
      if (paramArrayOfFloat != null)
      {
        paramArrayOfFloat[0] = ((float)((Easing)localObject).getDiff(d));
        f1 = paramFloat;
      }
    }
    return f1;
  }
  
  private static Interpolator getInterpolator(Context paramContext, int paramInt1, String paramString, int paramInt2)
  {
    if (paramInt1 != -2)
    {
      if (paramInt1 != -1)
      {
        if (paramInt1 != 0)
        {
          if (paramInt1 != 1)
          {
            if (paramInt1 != 2)
            {
              if (paramInt1 != 4)
              {
                if (paramInt1 != 5) {
                  return null;
                }
                return new OvershootInterpolator();
              }
              return new BounceInterpolator();
            }
            return new DecelerateInterpolator();
          }
          return new AccelerateInterpolator();
        }
        return new AccelerateDecelerateInterpolator();
      }
      new Interpolator()
      {
        public float getInterpolation(float paramAnonymousFloat)
        {
          return (float)get(paramAnonymousFloat);
        }
      };
    }
    return AnimationUtils.loadInterpolator(paramContext, paramInt2);
  }
  
  private float getPreCycleDistance()
  {
    float[] arrayOfFloat = new float[2];
    float f1 = 1.0F / 99;
    double d1 = 0.0D;
    double d2 = d1;
    float f2 = 0.0F;
    for (int i = 0; i < 100; i++)
    {
      float f3 = i * f1;
      double d3 = f3;
      Object localObject1 = mStartMotionPath.mKeyFrameEasing;
      Iterator localIterator = mMotionPaths.iterator();
      float f4 = NaN.0F;
      float f7;
      for (float f5 = 0.0F; localIterator.hasNext(); f5 = f7)
      {
        MotionPaths localMotionPaths = (MotionPaths)localIterator.next();
        Easing localEasing = mKeyFrameEasing;
        Object localObject2 = localObject1;
        float f6 = f4;
        f7 = f5;
        if (localEasing != null)
        {
          f7 = time;
          if (f7 < f3)
          {
            localObject2 = localEasing;
            f6 = f4;
          }
          else
          {
            localObject2 = localObject1;
            f6 = f4;
            f7 = f5;
            if (Float.isNaN(f4))
            {
              f6 = time;
              f7 = f5;
              localObject2 = localObject1;
            }
          }
        }
        localObject1 = localObject2;
        f4 = f6;
      }
      if (localObject1 != null)
      {
        f7 = f4;
        if (Float.isNaN(f4)) {
          f7 = 1.0F;
        }
        f4 = f7 - f5;
        d3 = (float)((Easing)localObject1).get((f3 - f5) / f4) * f4 + f5;
      }
      mSpline[0].getPos(d3, mInterpolateData);
      mStartMotionPath.getCenter(d3, mInterpolateVariables, mInterpolateData, arrayOfFloat, 0);
      if (i > 0)
      {
        d3 = f2;
        f2 = (float)(Math.hypot(d2 - arrayOfFloat[1], d1 - arrayOfFloat[0]) + d3);
      }
      d1 = arrayOfFloat[0];
      d2 = arrayOfFloat[1];
    }
    return f2;
  }
  
  private void insertKey(MotionPaths paramMotionPaths)
  {
    int i = Collections.binarySearch(mMotionPaths, paramMotionPaths);
    if (i == 0)
    {
      StringBuilder localStringBuilder = z2.t(" KeyPath position \"");
      localStringBuilder.append(position);
      localStringBuilder.append("\" outside of range");
      Log.e("MotionController", localStringBuilder.toString());
    }
    mMotionPaths.add(-i - 1, paramMotionPaths);
  }
  
  private void readView(MotionPaths paramMotionPaths)
  {
    paramMotionPaths.setBounds((int)mView.getX(), (int)mView.getY(), mView.getWidth(), mView.getHeight());
  }
  
  public void addKey(Key paramKey)
  {
    mKeyList.add(paramKey);
  }
  
  public void addKeys(ArrayList<Key> paramArrayList)
  {
    mKeyList.addAll(paramArrayList);
  }
  
  public void buildBounds(float[] paramArrayOfFloat, int paramInt)
  {
    float f1 = 1.0F / (paramInt - 1);
    Object localObject1 = mAttributesMap;
    if (localObject1 != null) {
      localObject1 = (SplineSet)((HashMap)localObject1).get("translationX");
    }
    localObject1 = mAttributesMap;
    if (localObject1 != null) {
      localObject1 = (SplineSet)((HashMap)localObject1).get("translationY");
    }
    localObject1 = mCycleMap;
    if (localObject1 != null) {
      localObject1 = (ViewOscillator)((HashMap)localObject1).get("translationX");
    }
    localObject1 = mCycleMap;
    if (localObject1 != null) {
      localObject1 = (ViewOscillator)((HashMap)localObject1).get("translationY");
    }
    for (int i = 0; i < paramInt; i++)
    {
      float f2 = i * f1;
      float f3 = mStaggerScale;
      float f4 = 0.0F;
      float f5 = f2;
      if (f3 != 1.0F)
      {
        float f6 = mStaggerOffset;
        f7 = f2;
        if (f2 < f6) {
          f7 = 0.0F;
        }
        f5 = f7;
        if (f7 > f6)
        {
          f5 = f7;
          if (f7 < 1.0D) {
            f5 = Math.min((f7 - f6) * f3, 1.0F);
          }
        }
      }
      double d = f5;
      localObject1 = mStartMotionPath.mKeyFrameEasing;
      float f7 = NaN.0F;
      Iterator localIterator = mMotionPaths.iterator();
      f2 = f4;
      Object localObject2;
      while (localIterator.hasNext())
      {
        MotionPaths localMotionPaths = (MotionPaths)localIterator.next();
        localObject2 = mKeyFrameEasing;
        if (localObject2 != null)
        {
          f4 = time;
          if (f4 < f5)
          {
            localObject1 = localObject2;
            f2 = f4;
          }
          else if (Float.isNaN(f7))
          {
            f7 = time;
          }
        }
      }
      if (localObject1 != null)
      {
        f4 = f7;
        if (Float.isNaN(f7)) {
          f4 = 1.0F;
        }
        f7 = f4 - f2;
        d = (float)((Easing)localObject1).get((f5 - f2) / f7) * f7 + f2;
      }
      mSpline[0].getPos(d, mInterpolateData);
      localObject1 = mArcSpline;
      if (localObject1 != null)
      {
        localObject2 = mInterpolateData;
        if (localObject2.length > 0) {
          ((CurveFit)localObject1).getPos(d, (double[])localObject2);
        }
      }
      mStartMotionPath.getBounds(mInterpolateVariables, mInterpolateData, paramArrayOfFloat, i * 2);
    }
  }
  
  public int buildKeyBounds(float[] paramArrayOfFloat, int[] paramArrayOfInt)
  {
    if (paramArrayOfFloat != null)
    {
      double[] arrayOfDouble = mSpline[0].getTimePoints();
      if (paramArrayOfInt != null)
      {
        Iterator localIterator = mMotionPaths.iterator();
        for (i = 0; localIterator.hasNext(); i++) {
          paramArrayOfInt[i] = nextmMode;
        }
      }
      int i = 0;
      int j = i;
      while (i < arrayOfDouble.length)
      {
        mSpline[0].getPos(arrayOfDouble[i], mInterpolateData);
        mStartMotionPath.getBounds(mInterpolateVariables, mInterpolateData, paramArrayOfFloat, j);
        j += 2;
        i++;
      }
      return j / 2;
    }
    return 0;
  }
  
  public int buildKeyFrames(float[] paramArrayOfFloat, int[] paramArrayOfInt)
  {
    if (paramArrayOfFloat != null)
    {
      double[] arrayOfDouble = mSpline[0].getTimePoints();
      if (paramArrayOfInt != null)
      {
        Iterator localIterator = mMotionPaths.iterator();
        for (i = 0; localIterator.hasNext(); i++) {
          paramArrayOfInt[i] = nextmMode;
        }
      }
      int i = 0;
      int j = i;
      while (i < arrayOfDouble.length)
      {
        mSpline[0].getPos(arrayOfDouble[i], mInterpolateData);
        mStartMotionPath.getCenter(arrayOfDouble[i], mInterpolateVariables, mInterpolateData, paramArrayOfFloat, j);
        j += 2;
        i++;
      }
      return j / 2;
    }
    return 0;
  }
  
  public void buildPath(float[] paramArrayOfFloat, int paramInt)
  {
    float f1 = 1.0F / (paramInt - 1);
    Object localObject1 = mAttributesMap;
    ViewOscillator localViewOscillator = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = (SplineSet)((HashMap)localObject1).get("translationX");
    }
    Object localObject2 = mAttributesMap;
    if (localObject2 == null) {
      localObject2 = null;
    } else {
      localObject2 = (SplineSet)((HashMap)localObject2).get("translationY");
    }
    Object localObject3 = mCycleMap;
    if (localObject3 == null) {
      localObject3 = null;
    } else {
      localObject3 = (ViewOscillator)((HashMap)localObject3).get("translationX");
    }
    Object localObject4 = mCycleMap;
    if (localObject4 != null) {
      localViewOscillator = (ViewOscillator)((HashMap)localObject4).get("translationY");
    }
    for (int i = 0; i < paramInt; i++)
    {
      float f2 = i * f1;
      float f3 = mStaggerScale;
      float f4 = f2;
      float f5;
      if (f3 != 1.0F)
      {
        f5 = mStaggerOffset;
        f6 = f2;
        if (f2 < f5) {
          f6 = 0.0F;
        }
        f4 = f6;
        if (f6 > f5)
        {
          f4 = f6;
          if (f6 < 1.0D) {
            f4 = Math.min((f6 - f5) * f3, 1.0F);
          }
        }
      }
      double d = f4;
      Object localObject5 = mStartMotionPath.mKeyFrameEasing;
      float f6 = NaN.0F;
      Iterator localIterator = mMotionPaths.iterator();
      for (f2 = 0.0F; localIterator.hasNext(); f2 = f3)
      {
        MotionPaths localMotionPaths = (MotionPaths)localIterator.next();
        localObject6 = mKeyFrameEasing;
        localObject4 = localObject5;
        f5 = f6;
        f3 = f2;
        if (localObject6 != null)
        {
          f3 = time;
          if (f3 < f4)
          {
            localObject4 = localObject6;
            f5 = f6;
          }
          else
          {
            localObject4 = localObject5;
            f5 = f6;
            f3 = f2;
            if (Float.isNaN(f6))
            {
              f5 = time;
              f3 = f2;
              localObject4 = localObject5;
            }
          }
        }
        localObject5 = localObject4;
        f6 = f5;
      }
      if (localObject5 != null)
      {
        f3 = f6;
        if (Float.isNaN(f6)) {
          f3 = 1.0F;
        }
        f6 = f3 - f2;
        d = (float)((Easing)localObject5).get((f4 - f2) / f6) * f6 + f2;
      }
      mSpline[0].getPos(d, mInterpolateData);
      localObject4 = mArcSpline;
      if (localObject4 != null)
      {
        localObject5 = mInterpolateData;
        if (localObject5.length > 0) {
          ((CurveFit)localObject4).getPos(d, (double[])localObject5);
        }
      }
      localObject4 = mStartMotionPath;
      localObject5 = mInterpolateVariables;
      Object localObject6 = mInterpolateData;
      int j = i * 2;
      ((MotionPaths)localObject4).getCenter(d, (int[])localObject5, (double[])localObject6, paramArrayOfFloat, j);
      if (localObject3 != null)
      {
        f6 = paramArrayOfFloat[j];
        paramArrayOfFloat[j] = (((KeyCycleOscillator)localObject3).get(f4) + f6);
      }
      else if (localObject1 != null)
      {
        f6 = paramArrayOfFloat[j];
        paramArrayOfFloat[j] = (((SplineSet)localObject1).get(f4) + f6);
      }
      if (localViewOscillator != null)
      {
        j++;
        f6 = paramArrayOfFloat[j];
        paramArrayOfFloat[j] = (localViewOscillator.get(f4) + f6);
      }
      else if (localObject2 != null)
      {
        j++;
        f6 = paramArrayOfFloat[j];
        paramArrayOfFloat[j] = (((SplineSet)localObject2).get(f4) + f6);
      }
    }
  }
  
  public void buildRect(float paramFloat, float[] paramArrayOfFloat, int paramInt)
  {
    paramFloat = getAdjustedPosition(paramFloat, null);
    mSpline[0].getPos(paramFloat, mInterpolateData);
    mStartMotionPath.getRect(mInterpolateVariables, mInterpolateData, paramArrayOfFloat, paramInt);
  }
  
  public void buildRectangles(float[] paramArrayOfFloat, int paramInt)
  {
    float f1 = 1.0F / (paramInt - 1);
    for (int i = 0; i < paramInt; i++)
    {
      float f2 = getAdjustedPosition(i * f1, null);
      mSpline[0].getPos(f2, mInterpolateData);
      mStartMotionPath.getRect(mInterpolateVariables, mInterpolateData, paramArrayOfFloat, i * 8);
    }
  }
  
  public void endTrigger(boolean paramBoolean)
  {
    if (("button".equals(Debug.getName(mView))) && (mKeyTriggers != null)) {
      for (int i = 0;; i++)
      {
        Object localObject = mKeyTriggers;
        if (i >= localObject.length) {
          break;
        }
        localObject = localObject[i];
        float f;
        if (paramBoolean) {
          f = -100.0F;
        } else {
          f = 100.0F;
        }
        ((KeyTrigger)localObject).conditionallyFire(f, mView);
      }
    }
  }
  
  public int getAnimateRelativeTo()
  {
    return mStartMotionPath.mAnimateRelativeTo;
  }
  
  public int getAttributeValues(String paramString, float[] paramArrayOfFloat, int paramInt)
  {
    paramString = (SplineSet)mAttributesMap.get(paramString);
    if (paramString == null) {
      return -1;
    }
    for (paramInt = 0; paramInt < paramArrayOfFloat.length; paramInt++) {
      paramArrayOfFloat[paramInt] = paramString.get(paramInt / (paramArrayOfFloat.length - 1));
    }
    return paramArrayOfFloat.length;
  }
  
  public void getCenter(double paramDouble, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    double[] arrayOfDouble1 = new double[4];
    double[] arrayOfDouble2 = new double[4];
    mSpline[0].getPos(paramDouble, arrayOfDouble1);
    mSpline[0].getSlope(paramDouble, arrayOfDouble2);
    Arrays.fill(paramArrayOfFloat2, 0.0F);
    mStartMotionPath.getCenter(paramDouble, mInterpolateVariables, arrayOfDouble1, paramArrayOfFloat1, arrayOfDouble2, paramArrayOfFloat2);
  }
  
  public float getCenterX()
  {
    return mCurrentCenterX;
  }
  
  public float getCenterY()
  {
    return mCurrentCenterY;
  }
  
  public void getDpDt(float paramFloat1, float paramFloat2, float paramFloat3, float[] paramArrayOfFloat)
  {
    paramFloat1 = getAdjustedPosition(paramFloat1, mVelocity);
    Object localObject1 = mSpline;
    int i = 0;
    if (localObject1 != null)
    {
      localObject1 = localObject1[0];
      double d = paramFloat1;
      ((CurveFit)localObject1).getSlope(d, mInterpolateVelocity);
      mSpline[0].getPos(d, mInterpolateData);
      paramFloat1 = mVelocity[0];
      for (;;)
      {
        localObject2 = mInterpolateVelocity;
        if (i >= localObject2.length) {
          break;
        }
        localObject2[i] *= paramFloat1;
        i++;
      }
      localObject1 = mArcSpline;
      if (localObject1 != null)
      {
        localObject2 = mInterpolateData;
        if (localObject2.length > 0)
        {
          ((CurveFit)localObject1).getPos(d, (double[])localObject2);
          mArcSpline.getSlope(d, mInterpolateVelocity);
          mStartMotionPath.setDpDt(paramFloat2, paramFloat3, paramArrayOfFloat, mInterpolateVariables, mInterpolateVelocity, mInterpolateData);
        }
        return;
      }
      mStartMotionPath.setDpDt(paramFloat2, paramFloat3, paramArrayOfFloat, mInterpolateVariables, (double[])localObject2, mInterpolateData);
      return;
    }
    Object localObject2 = mEndMotionPath;
    paramFloat1 = x;
    localObject1 = mStartMotionPath;
    float f1 = paramFloat1 - x;
    float f2 = y - y;
    float f3 = width;
    float f4 = width;
    paramFloat1 = height;
    float f5 = height;
    paramArrayOfFloat[0] = ((f3 - f4 + f1) * paramFloat2 + (1.0F - paramFloat2) * f1);
    paramArrayOfFloat[1] = ((paramFloat1 - f5 + f2) * paramFloat3 + (1.0F - paramFloat3) * f2);
  }
  
  public int getDrawPath()
  {
    int i = mStartMotionPath.mDrawPath;
    Iterator localIterator = mMotionPaths.iterator();
    while (localIterator.hasNext()) {
      i = Math.max(i, nextmDrawPath);
    }
    return Math.max(i, mEndMotionPath.mDrawPath);
  }
  
  public float getFinalHeight()
  {
    return mEndMotionPath.height;
  }
  
  public float getFinalWidth()
  {
    return mEndMotionPath.width;
  }
  
  public float getFinalX()
  {
    return mEndMotionPath.x;
  }
  
  public float getFinalY()
  {
    return mEndMotionPath.y;
  }
  
  public MotionPaths getKeyFrame(int paramInt)
  {
    return (MotionPaths)mMotionPaths.get(paramInt);
  }
  
  public int getKeyFrameInfo(int paramInt, int[] paramArrayOfInt)
  {
    float[] arrayOfFloat = new float[2];
    Iterator localIterator = mKeyList.iterator();
    int i = 0;
    label20:
    int m;
    for (int j = i; localIterator.hasNext(); j = m)
    {
      Key localKey = (Key)localIterator.next();
      int k = mType;
      if ((k != paramInt) && (paramInt == -1)) {
        break label20;
      }
      paramArrayOfInt[j] = 0;
      m = j + 1;
      paramArrayOfInt[m] = k;
      m++;
      k = mFramePosition;
      paramArrayOfInt[m] = k;
      float f = k / 100.0F;
      Object localObject = mSpline[0];
      double d = f;
      ((CurveFit)localObject).getPos(d, mInterpolateData);
      mStartMotionPath.getCenter(d, mInterpolateVariables, mInterpolateData, arrayOfFloat, 0);
      m++;
      paramArrayOfInt[m] = Float.floatToIntBits(arrayOfFloat[0]);
      k = m + 1;
      paramArrayOfInt[k] = Float.floatToIntBits(arrayOfFloat[1]);
      m = k;
      if ((localKey instanceof KeyPosition))
      {
        localObject = (KeyPosition)localKey;
        m = k + 1;
        paramArrayOfInt[m] = mPositionType;
        m++;
        paramArrayOfInt[m] = Float.floatToIntBits(mPercentX);
        m++;
        paramArrayOfInt[m] = Float.floatToIntBits(mPercentY);
      }
      m++;
      paramArrayOfInt[j] = (m - j);
      i++;
    }
    return i;
  }
  
  public float getKeyFrameParameter(int paramInt, float paramFloat1, float paramFloat2)
  {
    MotionPaths localMotionPaths1 = mEndMotionPath;
    float f1 = x;
    MotionPaths localMotionPaths2 = mStartMotionPath;
    float f2 = x;
    f1 -= f2;
    float f3 = y;
    float f4 = y;
    float f5 = f3 - f4;
    float f6 = width / 2.0F;
    float f7 = height / 2.0F;
    f3 = (float)Math.hypot(f1, f5);
    if (f3 < 1.0E-7D) {
      return NaN.0F;
    }
    paramFloat1 -= f6 + f2;
    paramFloat2 -= f7 + f4;
    if ((float)Math.hypot(paramFloat1, paramFloat2) == 0.0F) {
      return 0.0F;
    }
    f4 = paramFloat2 * f5 + paramFloat1 * f1;
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt != 4)
            {
              if (paramInt != 5) {
                return 0.0F;
              }
              return paramFloat2 / f5;
            }
            return paramFloat1 / f5;
          }
          return paramFloat2 / f1;
        }
        return paramFloat1 / f1;
      }
      return (float)Math.sqrt(f3 * f3 - f4 * f4);
    }
    return f4 / f3;
  }
  
  public int getKeyFramePositions(int[] paramArrayOfInt, float[] paramArrayOfFloat)
  {
    Iterator localIterator = mKeyList.iterator();
    int i = 0;
    int j = i;
    while (localIterator.hasNext())
    {
      Object localObject = (Key)localIterator.next();
      int k = mFramePosition;
      paramArrayOfInt[i] = (mType * 1000 + k);
      float f = k / 100.0F;
      localObject = mSpline[0];
      double d = f;
      ((CurveFit)localObject).getPos(d, mInterpolateData);
      mStartMotionPath.getCenter(d, mInterpolateVariables, mInterpolateData, paramArrayOfFloat, j);
      j += 2;
      i++;
    }
    return i;
  }
  
  public double[] getPos(double paramDouble)
  {
    mSpline[0].getPos(paramDouble, mInterpolateData);
    CurveFit localCurveFit = mArcSpline;
    if (localCurveFit != null)
    {
      double[] arrayOfDouble = mInterpolateData;
      if (arrayOfDouble.length > 0) {
        localCurveFit.getPos(paramDouble, arrayOfDouble);
      }
    }
    return mInterpolateData;
  }
  
  public KeyPositionBase getPositionKeyframe(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2)
  {
    RectF localRectF = new RectF();
    Object localObject1 = mStartMotionPath;
    float f1 = x;
    left = f1;
    float f2 = y;
    top = f2;
    right = (f1 + width);
    bottom = (f2 + height);
    localObject1 = new RectF();
    Object localObject2 = mEndMotionPath;
    f1 = x;
    left = f1;
    f2 = y;
    top = f2;
    right = (f1 + width);
    bottom = (f2 + height);
    localObject2 = mKeyList.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      Object localObject3 = (Key)((Iterator)localObject2).next();
      if ((localObject3 instanceof KeyPositionBase))
      {
        localObject3 = (KeyPositionBase)localObject3;
        if (((KeyPositionBase)localObject3).intersects(paramInt1, paramInt2, localRectF, (RectF)localObject1, paramFloat1, paramFloat2)) {
          return (KeyPositionBase)localObject3;
        }
      }
    }
    return null;
  }
  
  public void getPostLayoutDvDp(float paramFloat1, int paramInt1, int paramInt2, float paramFloat2, float paramFloat3, float[] paramArrayOfFloat)
  {
    paramFloat1 = getAdjustedPosition(paramFloat1, mVelocity);
    Object localObject1 = mAttributesMap;
    ViewOscillator localViewOscillator = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = (SplineSet)((HashMap)localObject1).get("translationX");
    }
    Object localObject2 = mAttributesMap;
    if (localObject2 == null) {
      localObject2 = null;
    } else {
      localObject2 = (SplineSet)((HashMap)localObject2).get("translationY");
    }
    Object localObject3 = mAttributesMap;
    if (localObject3 == null) {
      localObject3 = null;
    } else {
      localObject3 = (SplineSet)((HashMap)localObject3).get("rotation");
    }
    Object localObject4 = mAttributesMap;
    if (localObject4 == null) {
      localObject4 = null;
    } else {
      localObject4 = (SplineSet)((HashMap)localObject4).get("scaleX");
    }
    Object localObject5 = mAttributesMap;
    if (localObject5 == null) {
      localObject5 = null;
    } else {
      localObject5 = (SplineSet)((HashMap)localObject5).get("scaleY");
    }
    Object localObject6 = mCycleMap;
    if (localObject6 == null) {
      localObject6 = null;
    } else {
      localObject6 = (ViewOscillator)((HashMap)localObject6).get("translationX");
    }
    Object localObject7 = mCycleMap;
    if (localObject7 == null) {
      localObject7 = null;
    } else {
      localObject7 = (ViewOscillator)((HashMap)localObject7).get("translationY");
    }
    Object localObject8 = mCycleMap;
    if (localObject8 == null) {
      localObject8 = null;
    } else {
      localObject8 = (ViewOscillator)((HashMap)localObject8).get("rotation");
    }
    Object localObject9 = mCycleMap;
    if (localObject9 == null) {
      localObject9 = null;
    } else {
      localObject9 = (ViewOscillator)((HashMap)localObject9).get("scaleX");
    }
    Object localObject10 = mCycleMap;
    if (localObject10 != null) {
      localViewOscillator = (ViewOscillator)((HashMap)localObject10).get("scaleY");
    }
    localObject10 = new VelocityMatrix();
    ((VelocityMatrix)localObject10).clear();
    ((VelocityMatrix)localObject10).setRotationVelocity((SplineSet)localObject3, paramFloat1);
    ((VelocityMatrix)localObject10).setTranslationVelocity((SplineSet)localObject1, (SplineSet)localObject2, paramFloat1);
    ((VelocityMatrix)localObject10).setScaleVelocity((SplineSet)localObject4, (SplineSet)localObject5, paramFloat1);
    ((VelocityMatrix)localObject10).setRotationVelocity((KeyCycleOscillator)localObject8, paramFloat1);
    ((VelocityMatrix)localObject10).setTranslationVelocity((KeyCycleOscillator)localObject6, (KeyCycleOscillator)localObject7, paramFloat1);
    ((VelocityMatrix)localObject10).setScaleVelocity((KeyCycleOscillator)localObject9, localViewOscillator, paramFloat1);
    Object localObject11 = mArcSpline;
    double d;
    if (localObject11 != null)
    {
      localObject1 = mInterpolateData;
      if (localObject1.length > 0)
      {
        d = paramFloat1;
        ((CurveFit)localObject11).getPos(d, (double[])localObject1);
        mArcSpline.getSlope(d, mInterpolateVelocity);
        mStartMotionPath.setDpDt(paramFloat2, paramFloat3, paramArrayOfFloat, mInterpolateVariables, mInterpolateVelocity, mInterpolateData);
      }
      ((VelocityMatrix)localObject10).applyTransform(paramFloat2, paramFloat3, paramInt1, paramInt2, paramArrayOfFloat);
      return;
    }
    localObject11 = mSpline;
    int i = 0;
    if (localObject11 != null)
    {
      paramFloat1 = getAdjustedPosition(paramFloat1, mVelocity);
      localObject1 = mSpline[0];
      d = paramFloat1;
      ((CurveFit)localObject1).getSlope(d, mInterpolateVelocity);
      mSpline[0].getPos(d, mInterpolateData);
      paramFloat1 = mVelocity[0];
      for (;;)
      {
        localObject1 = mInterpolateVelocity;
        if (i >= localObject1.length) {
          break;
        }
        localObject1[i] *= paramFloat1;
        i++;
      }
      mStartMotionPath.setDpDt(paramFloat2, paramFloat3, paramArrayOfFloat, mInterpolateVariables, (double[])localObject1, mInterpolateData);
      ((VelocityMatrix)localObject10).applyTransform(paramFloat2, paramFloat3, paramInt1, paramInt2, paramArrayOfFloat);
      return;
    }
    localObject11 = mEndMotionPath;
    float f1 = x;
    MotionPaths localMotionPaths = mStartMotionPath;
    float f2 = f1 - x;
    f1 = y - y;
    float f3 = width;
    float f4 = width;
    float f5 = height;
    float f6 = height;
    paramArrayOfFloat[0] = ((f3 - f4 + f2) * paramFloat2 + (1.0F - paramFloat2) * f2);
    paramArrayOfFloat[1] = ((f5 - f6 + f1) * paramFloat3 + (1.0F - paramFloat3) * f1);
    ((VelocityMatrix)localObject10).clear();
    ((VelocityMatrix)localObject10).setRotationVelocity((SplineSet)localObject3, paramFloat1);
    ((VelocityMatrix)localObject10).setTranslationVelocity((SplineSet)localObject1, (SplineSet)localObject2, paramFloat1);
    ((VelocityMatrix)localObject10).setScaleVelocity((SplineSet)localObject4, (SplineSet)localObject5, paramFloat1);
    ((VelocityMatrix)localObject10).setRotationVelocity((KeyCycleOscillator)localObject8, paramFloat1);
    ((VelocityMatrix)localObject10).setTranslationVelocity((KeyCycleOscillator)localObject6, (KeyCycleOscillator)localObject7, paramFloat1);
    ((VelocityMatrix)localObject10).setScaleVelocity((KeyCycleOscillator)localObject9, localViewOscillator, paramFloat1);
    ((VelocityMatrix)localObject10).applyTransform(paramFloat2, paramFloat3, paramInt1, paramInt2, paramArrayOfFloat);
  }
  
  public float getStartHeight()
  {
    return mStartMotionPath.height;
  }
  
  public float getStartWidth()
  {
    return mStartMotionPath.width;
  }
  
  public float getStartX()
  {
    return mStartMotionPath.x;
  }
  
  public float getStartY()
  {
    return mStartMotionPath.y;
  }
  
  public int getTransformPivotTarget()
  {
    return mTransformPivotTarget;
  }
  
  public View getView()
  {
    return mView;
  }
  
  public boolean interpolate(View paramView, float paramFloat, long paramLong, KeyCache paramKeyCache)
  {
    float f1 = getAdjustedPosition(paramFloat, null);
    int i = mQuantizeMotionSteps;
    int j = Key.UNSET;
    float f2 = 1.0F;
    paramFloat = f1;
    float f3;
    float f4;
    if (i != j)
    {
      f3 = 1.0F / i;
      f4 = (float)Math.floor(f1 / f3);
      f1 = f1 % f3 / f3;
      paramFloat = f1;
      if (!Float.isNaN(mQuantizeMotionPhase)) {
        paramFloat = (f1 + mQuantizeMotionPhase) % 1.0F;
      }
      localObject1 = mQuantizeMotionInterpolator;
      if (localObject1 != null) {
        paramFloat = ((TimeInterpolator)localObject1).getInterpolation(paramFloat);
      } else if (paramFloat > 0.5D) {
        paramFloat = f2;
      } else {
        paramFloat = 0.0F;
      }
      paramFloat = paramFloat * f3 + f4 * f3;
    }
    Object localObject1 = mAttributesMap;
    if (localObject1 != null)
    {
      localObject1 = ((HashMap)localObject1).values().iterator();
      while (((Iterator)localObject1).hasNext()) {
        ((ViewSpline)((Iterator)localObject1).next()).setProperty(paramView, paramFloat);
      }
    }
    localObject1 = mTimeCycleAttributesMap;
    boolean bool1;
    Object localObject3;
    if (localObject1 != null)
    {
      localObject2 = ((HashMap)localObject1).values().iterator();
      localObject1 = null;
      bool1 = false;
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (ViewTimeCycle)((Iterator)localObject2).next();
        if ((localObject3 instanceof ViewTimeCycle.PathRotate)) {
          localObject1 = (ViewTimeCycle.PathRotate)localObject3;
        } else {
          bool1 |= ((ViewTimeCycle)localObject3).setProperty(paramView, paramFloat, paramLong, paramKeyCache);
        }
      }
    }
    else
    {
      localObject1 = null;
      bool1 = false;
    }
    Object localObject2 = mSpline;
    if (localObject2 != null)
    {
      localObject2 = localObject2[0];
      double d = paramFloat;
      ((CurveFit)localObject2).getPos(d, mInterpolateData);
      mSpline[0].getSlope(d, mInterpolateVelocity);
      localObject3 = mArcSpline;
      if (localObject3 != null)
      {
        localObject2 = mInterpolateData;
        if (localObject2.length > 0)
        {
          ((CurveFit)localObject3).getPos(d, (double[])localObject2);
          mArcSpline.getSlope(d, mInterpolateVelocity);
        }
      }
      if (!mNoMovement)
      {
        mStartMotionPath.setView(paramFloat, paramView, mInterpolateVariables, mInterpolateData, mInterpolateVelocity, null, mForceMeasure);
        mForceMeasure = false;
      }
      if (mTransformPivotTarget != Key.UNSET)
      {
        if (mTransformPivotView == null) {
          mTransformPivotView = ((View)paramView.getParent()).findViewById(mTransformPivotTarget);
        }
        localObject2 = mTransformPivotView;
        if (localObject2 != null)
        {
          i = ((View)localObject2).getTop();
          f2 = (mTransformPivotView.getBottom() + i) / 2.0F;
          i = mTransformPivotView.getLeft();
          f1 = (mTransformPivotView.getRight() + i) / 2.0F;
          if ((paramView.getRight() - paramView.getLeft() > 0) && (paramView.getBottom() - paramView.getTop() > 0))
          {
            f4 = paramView.getLeft();
            f3 = paramView.getTop();
            paramView.setPivotX(f1 - f4);
            paramView.setPivotY(f2 - f3);
          }
        }
      }
      localObject2 = mAttributesMap;
      if (localObject2 != null)
      {
        Iterator localIterator = ((HashMap)localObject2).values().iterator();
        while (localIterator.hasNext())
        {
          localObject3 = (SplineSet)localIterator.next();
          if ((localObject3 instanceof ViewSpline.PathRotate))
          {
            localObject2 = mInterpolateVelocity;
            if (localObject2.length > 1) {
              ((ViewSpline.PathRotate)localObject3).setPathRotate(paramView, paramFloat, localObject2[0], localObject2[1]);
            }
          }
        }
      }
      boolean bool2 = bool1;
      if (localObject1 != null)
      {
        localObject2 = mInterpolateVelocity;
        bool2 = ((ViewTimeCycle.PathRotate)localObject1).setPathRotate(paramView, paramKeyCache, paramFloat, paramLong, localObject2[0], localObject2[1]) | bool1;
      }
      for (i = 1;; i++)
      {
        paramKeyCache = mSpline;
        if (i >= paramKeyCache.length) {
          break;
        }
        paramKeyCache[i].getPos(d, mValuesBuff);
        CustomSupport.setInterpolatedValue((ConstraintAttribute)mStartMotionPath.attributes.get(mAttributeNames[(i - 1)]), paramView, mValuesBuff);
      }
      paramKeyCache = mStartPoint;
      if (mVisibilityMode == 0) {
        if (paramFloat <= 0.0F) {
          paramView.setVisibility(visibility);
        } else if (paramFloat >= 1.0F) {
          paramView.setVisibility(mEndPoint.visibility);
        } else if (mEndPoint.visibility != visibility) {
          paramView.setVisibility(0);
        }
      }
      bool1 = bool2;
      if (mKeyTriggers != null) {
        for (i = 0;; i++)
        {
          paramKeyCache = mKeyTriggers;
          bool1 = bool2;
          if (i >= paramKeyCache.length) {
            break;
          }
          paramKeyCache[i].conditionallyFire(paramFloat, paramView);
        }
      }
    }
    else
    {
      paramKeyCache = mStartMotionPath;
      f2 = x;
      localObject1 = mEndMotionPath;
      float f5 = a.a(x, f2, paramFloat, f2);
      f2 = y;
      float f6 = a.a(y, f2, paramFloat, f2);
      float f7 = width;
      f4 = width;
      f1 = a.a(f4, f7, paramFloat, f7);
      f3 = height;
      f2 = height;
      float f8 = a.a(f2, f3, paramFloat, f3);
      f5 += 0.5F;
      int k = (int)f5;
      f6 += 0.5F;
      int m = (int)f6;
      i = (int)(f5 + f1);
      j = (int)(f6 + f8);
      if ((f4 != f7) || (f2 != f3) || (mForceMeasure))
      {
        paramView.measure(View.MeasureSpec.makeMeasureSpec(i - k, 1073741824), View.MeasureSpec.makeMeasureSpec(j - m, 1073741824));
        mForceMeasure = false;
      }
      paramView.layout(k, m, i, j);
    }
    paramKeyCache = mCycleMap;
    if (paramKeyCache != null)
    {
      paramKeyCache = paramKeyCache.values().iterator();
      while (paramKeyCache.hasNext())
      {
        localObject1 = (ViewOscillator)paramKeyCache.next();
        if ((localObject1 instanceof ViewOscillator.PathRotateSet))
        {
          localObject1 = (ViewOscillator.PathRotateSet)localObject1;
          localObject2 = mInterpolateVelocity;
          ((ViewOscillator.PathRotateSet)localObject1).setPathRotate(paramView, paramFloat, localObject2[0], localObject2[1]);
        }
        else
        {
          ((ViewOscillator)localObject1).setProperty(paramView, paramFloat);
        }
      }
    }
    return bool1;
  }
  
  public String name()
  {
    return mView.getContext().getResources().getResourceEntryName(mView.getId());
  }
  
  public void positionKeyframe(View paramView, KeyPositionBase paramKeyPositionBase, float paramFloat1, float paramFloat2, String[] paramArrayOfString, float[] paramArrayOfFloat)
  {
    RectF localRectF = new RectF();
    Object localObject = mStartMotionPath;
    float f1 = x;
    left = f1;
    float f2 = y;
    top = f2;
    right = (f1 + width);
    bottom = (f2 + height);
    localObject = new RectF();
    MotionPaths localMotionPaths = mEndMotionPath;
    f1 = x;
    left = f1;
    f2 = y;
    top = f2;
    right = (f1 + width);
    bottom = (f2 + height);
    paramKeyPositionBase.positionAttributes(paramView, localRectF, (RectF)localObject, paramFloat1, paramFloat2, paramArrayOfString, paramArrayOfFloat);
  }
  
  public void remeasure()
  {
    mForceMeasure = true;
  }
  
  public void rotate(Rect paramRect1, Rect paramRect2, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 != 1)
    {
      int i;
      int j;
      if (paramInt1 != 2)
      {
        if (paramInt1 != 3)
        {
          if (paramInt1 == 4)
          {
            i = left;
            j = right;
            paramInt3 = bottom;
            paramInt1 = top;
            left = (paramInt2 - (paramRect1.width() + (paramInt3 + paramInt1)) / 2);
            top = ((i + j - paramRect1.height()) / 2);
            paramInt1 = left;
            right = (paramRect1.width() + paramInt1);
            paramInt1 = top;
            bottom = (paramRect1.height() + paramInt1);
          }
        }
        else
        {
          paramInt1 = left + right;
          left = (paramRect1.height() / 2 + top - paramInt1 / 2);
          top = (paramInt3 - (paramRect1.height() + paramInt1) / 2);
          paramInt1 = left;
          right = (paramRect1.width() + paramInt1);
          paramInt1 = top;
          bottom = (paramRect1.height() + paramInt1);
        }
      }
      else
      {
        paramInt3 = left;
        j = right;
        i = top;
        paramInt1 = bottom;
        left = (paramInt2 - (paramRect1.width() + (i + paramInt1)) / 2);
        top = ((paramInt3 + j - paramRect1.height()) / 2);
        paramInt1 = left;
        right = (paramRect1.width() + paramInt1);
        paramInt1 = top;
        bottom = (paramRect1.height() + paramInt1);
      }
    }
    else
    {
      paramInt2 = left;
      paramInt1 = right;
      left = ((top + bottom - paramRect1.width()) / 2);
      top = (paramInt3 - (paramRect1.height() + (paramInt2 + paramInt1)) / 2);
      paramInt1 = left;
      right = (paramRect1.width() + paramInt1);
      paramInt1 = top;
      bottom = (paramRect1.height() + paramInt1);
    }
  }
  
  public void setBothStates(View paramView)
  {
    MotionPaths localMotionPaths = mStartMotionPath;
    time = 0.0F;
    position = 0.0F;
    mNoMovement = true;
    localMotionPaths.setBounds(paramView.getX(), paramView.getY(), paramView.getWidth(), paramView.getHeight());
    mEndMotionPath.setBounds(paramView.getX(), paramView.getY(), paramView.getWidth(), paramView.getHeight());
    mStartPoint.setState(paramView);
    mEndPoint.setState(paramView);
  }
  
  public void setDrawPath(int paramInt)
  {
    mStartMotionPath.mDrawPath = paramInt;
  }
  
  public void setEndState(Rect paramRect, ConstraintSet paramConstraintSet, int paramInt1, int paramInt2)
  {
    int i = mRotate;
    Rect localRect = paramRect;
    if (i != 0)
    {
      rotate(paramRect, mTempRect, i, paramInt1, paramInt2);
      localRect = mTempRect;
    }
    paramRect = mEndMotionPath;
    time = 1.0F;
    position = 1.0F;
    readView(paramRect);
    mEndMotionPath.setBounds(left, top, localRect.width(), localRect.height());
    mEndMotionPath.applyParameters(paramConstraintSet.getParameters(mId));
    mEndPoint.setState(localRect, paramConstraintSet, i, mId);
  }
  
  public void setPathMotionArc(int paramInt)
  {
    mPathMotionArc = paramInt;
  }
  
  public void setStartCurrentState(View paramView)
  {
    MotionPaths localMotionPaths = mStartMotionPath;
    time = 0.0F;
    position = 0.0F;
    localMotionPaths.setBounds(paramView.getX(), paramView.getY(), paramView.getWidth(), paramView.getHeight());
    mStartPoint.setState(paramView);
  }
  
  public void setStartState(Rect paramRect, ConstraintSet paramConstraintSet, int paramInt1, int paramInt2)
  {
    int i = mRotate;
    if (i != 0) {
      rotate(paramRect, mTempRect, i, paramInt1, paramInt2);
    }
    Object localObject = mStartMotionPath;
    time = 0.0F;
    position = 0.0F;
    readView((MotionPaths)localObject);
    mStartMotionPath.setBounds(left, top, paramRect.width(), paramRect.height());
    localObject = paramConstraintSet.getParameters(mId);
    mStartMotionPath.applyParameters((ConstraintSet.Constraint)localObject);
    mMotionStagger = motion.mMotionStagger;
    mStartPoint.setState(paramRect, paramConstraintSet, i, mId);
    mTransformPivotTarget = transform.transformPivotTarget;
    paramRect = motion;
    mQuantizeMotionSteps = mQuantizeMotionSteps;
    mQuantizeMotionPhase = mQuantizeMotionPhase;
    paramRect = mView.getContext();
    paramConstraintSet = motion;
    mQuantizeMotionInterpolator = getInterpolator(paramRect, mQuantizeInterpolatorType, mQuantizeInterpolatorString, mQuantizeInterpolatorID);
  }
  
  public void setStartState(ViewState paramViewState, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = mStartMotionPath;
    time = 0.0F;
    position = 0.0F;
    localObject = new Rect();
    int i;
    if (paramInt1 != 1)
    {
      if (paramInt1 == 2)
      {
        i = left;
        int j = right;
        int k = top;
        paramInt2 = bottom;
        left = (paramInt3 - (paramViewState.width() + (k + paramInt2)) / 2);
        top = ((i + j - paramViewState.height()) / 2);
        paramInt2 = left;
        right = (paramViewState.width() + paramInt2);
        paramInt2 = top;
        bottom = (paramViewState.height() + paramInt2);
      }
    }
    else
    {
      i = left;
      paramInt3 = right;
      left = ((top + bottom - paramViewState.width()) / 2);
      top = (paramInt2 - (paramViewState.height() + (i + paramInt3)) / 2);
      paramInt2 = left;
      right = (paramViewState.width() + paramInt2);
      paramInt2 = top;
      bottom = (paramViewState.height() + paramInt2);
    }
    mStartMotionPath.setBounds(left, top, ((Rect)localObject).width(), ((Rect)localObject).height());
    mStartPoint.setState((Rect)localObject, paramView, paramInt1, rotation);
  }
  
  public void setTransformPivotTarget(int paramInt)
  {
    mTransformPivotTarget = paramInt;
    mTransformPivotView = null;
  }
  
  public void setView(View paramView)
  {
    mView = paramView;
    mId = paramView.getId();
    paramView = paramView.getLayoutParams();
    if ((paramView instanceof ConstraintLayout.LayoutParams)) {
      mConstraintTag = ((ConstraintLayout.LayoutParams)paramView).getConstraintTag();
    }
  }
  
  public void setup(int paramInt1, int paramInt2, float paramFloat, long paramLong)
  {
    new HashSet();
    Object localObject1 = new HashSet();
    Object localObject2 = new HashSet();
    HashSet localHashSet = new HashSet();
    Object localObject3 = new HashMap();
    int i = mPathMotionArc;
    if (i != Key.UNSET) {
      mStartMotionPath.mPathMotionArc = i;
    }
    mStartPoint.different(mEndPoint, (HashSet)localObject2);
    Object localObject4 = mKeyList;
    if (localObject4 != null)
    {
      localObject5 = ((ArrayList)localObject4).iterator();
      localObject4 = null;
      for (;;)
      {
        localObject6 = localObject4;
        if (!((Iterator)localObject5).hasNext()) {
          break;
        }
        localObject7 = (Key)((Iterator)localObject5).next();
        if ((localObject7 instanceof KeyPosition))
        {
          localObject6 = (KeyPosition)localObject7;
          insertKey(new MotionPaths(paramInt1, paramInt2, (KeyPosition)localObject6, mStartMotionPath, mEndMotionPath));
          i = mCurveFit;
          if (i != Key.UNSET) {
            mCurveFitType = i;
          }
        }
        else if ((localObject7 instanceof KeyCycle))
        {
          ((Key)localObject7).getAttributeNames(localHashSet);
        }
        else if ((localObject7 instanceof KeyTimeCycle))
        {
          ((Key)localObject7).getAttributeNames((HashSet)localObject1);
        }
        else if ((localObject7 instanceof KeyTrigger))
        {
          localObject6 = localObject4;
          if (localObject4 == null) {
            localObject6 = new ArrayList();
          }
          ((ArrayList)localObject6).add((KeyTrigger)localObject7);
          localObject4 = localObject6;
        }
        else
        {
          ((Key)localObject7).setInterpolation((HashMap)localObject3);
          ((Key)localObject7).getAttributeNames((HashSet)localObject2);
        }
      }
    }
    Object localObject6 = null;
    int j = 0;
    if (localObject6 != null) {
      mKeyTriggers = ((KeyTrigger[])((ArrayList)localObject6).toArray(new KeyTrigger[0]));
    }
    Object localObject8;
    Object localObject9;
    if (!((HashSet)localObject2).isEmpty())
    {
      mAttributesMap = new HashMap();
      localObject5 = ((HashSet)localObject2).iterator();
      while (((Iterator)localObject5).hasNext())
      {
        localObject6 = (String)((Iterator)localObject5).next();
        if (((String)localObject6).startsWith("CUSTOM,"))
        {
          localObject8 = new SparseArray();
          localObject4 = localObject6.split(",")[1];
          localObject9 = mKeyList.iterator();
          while (((Iterator)localObject9).hasNext())
          {
            localObject7 = (Key)((Iterator)localObject9).next();
            Object localObject10 = mCustomConstraints;
            if (localObject10 != null)
            {
              localObject10 = (ConstraintAttribute)((HashMap)localObject10).get(localObject4);
              if (localObject10 != null) {
                ((SparseArray)localObject8).append(mFramePosition, localObject10);
              }
            }
          }
          localObject4 = ViewSpline.makeCustomSpline((String)localObject6, (SparseArray)localObject8);
        }
        else
        {
          localObject4 = ViewSpline.makeSpline((String)localObject6);
        }
        if (localObject4 != null)
        {
          ((SplineSet)localObject4).setType((String)localObject6);
          mAttributesMap.put(localObject6, localObject4);
        }
      }
      localObject4 = mKeyList;
      if (localObject4 != null)
      {
        localObject4 = ((ArrayList)localObject4).iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject6 = (Key)((Iterator)localObject4).next();
          if ((localObject6 instanceof KeyAttributes)) {
            ((Key)localObject6).addValues(mAttributesMap);
          }
        }
      }
      mStartPoint.addValues(mAttributesMap, 0);
      mEndPoint.addValues(mAttributesMap, 100);
      localObject4 = mAttributesMap.keySet().iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject5 = (String)((Iterator)localObject4).next();
        if (((HashMap)localObject3).containsKey(localObject5))
        {
          localObject6 = (Integer)((HashMap)localObject3).get(localObject5);
          if (localObject6 != null)
          {
            paramInt1 = ((Integer)localObject6).intValue();
            break label679;
          }
        }
        paramInt1 = 0;
        label679:
        localObject6 = (SplineSet)mAttributesMap.get(localObject5);
        if (localObject6 != null) {
          ((SplineSet)localObject6).setup(paramInt1);
        }
      }
    }
    if (!((HashSet)localObject1).isEmpty())
    {
      if (mTimeCycleAttributesMap == null) {
        mTimeCycleAttributesMap = new HashMap();
      }
      localObject1 = ((HashSet)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject6 = (String)((Iterator)localObject1).next();
        if (!mTimeCycleAttributesMap.containsKey(localObject6))
        {
          if (((String)localObject6).startsWith("CUSTOM,"))
          {
            localObject5 = new SparseArray();
            localObject7 = localObject6.split(",")[1];
            localObject8 = mKeyList.iterator();
            while (((Iterator)localObject8).hasNext())
            {
              localObject4 = (Key)((Iterator)localObject8).next();
              localObject9 = mCustomConstraints;
              if (localObject9 != null)
              {
                localObject9 = (ConstraintAttribute)((HashMap)localObject9).get(localObject7);
                if (localObject9 != null) {
                  ((SparseArray)localObject5).append(mFramePosition, localObject9);
                }
              }
            }
            localObject4 = ViewTimeCycle.makeCustomSpline((String)localObject6, (SparseArray)localObject5);
          }
          else
          {
            localObject4 = ViewTimeCycle.makeSpline((String)localObject6, paramLong);
          }
          if (localObject4 != null)
          {
            ((TimeCycleSplineSet)localObject4).setType((String)localObject6);
            mTimeCycleAttributesMap.put(localObject6, localObject4);
          }
        }
      }
      localObject4 = mKeyList;
      if (localObject4 != null)
      {
        localObject6 = ((ArrayList)localObject4).iterator();
        while (((Iterator)localObject6).hasNext())
        {
          localObject4 = (Key)((Iterator)localObject6).next();
          if ((localObject4 instanceof KeyTimeCycle)) {
            ((KeyTimeCycle)localObject4).addTimeValues(mTimeCycleAttributesMap);
          }
        }
      }
      localObject4 = mTimeCycleAttributesMap.keySet().iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject6 = (String)((Iterator)localObject4).next();
        if (((HashMap)localObject3).containsKey(localObject6)) {
          paramInt1 = ((Integer)((HashMap)localObject3).get(localObject6)).intValue();
        } else {
          paramInt1 = 0;
        }
        ((ViewTimeCycle)mTimeCycleAttributesMap.get(localObject6)).setup(paramInt1);
      }
    }
    int k = mMotionPaths.size() + 2;
    localObject1 = new MotionPaths[k];
    localObject1[0] = mStartMotionPath;
    localObject1[(k - 1)] = mEndMotionPath;
    if ((mMotionPaths.size() > 0) && (mCurveFitType == -1)) {
      mCurveFitType = 0;
    }
    localObject4 = mMotionPaths.iterator();
    for (paramInt1 = 1; ((Iterator)localObject4).hasNext(); paramInt1++) {
      localObject1[paramInt1] = ((MotionPaths)((Iterator)localObject4).next());
    }
    localObject3 = new HashSet();
    Object localObject5 = mEndMotionPath.attributes.keySet().iterator();
    while (((Iterator)localObject5).hasNext())
    {
      localObject6 = (String)((Iterator)localObject5).next();
      if (mStartMotionPath.attributes.containsKey(localObject6))
      {
        localObject4 = new StringBuilder();
        ((StringBuilder)localObject4).append("CUSTOM,");
        ((StringBuilder)localObject4).append((String)localObject6);
        if (!((HashSet)localObject2).contains(((StringBuilder)localObject4).toString())) {
          ((HashSet)localObject3).add(localObject6);
        }
      }
    }
    localObject4 = (String[])((AbstractCollection)localObject3).toArray(new String[0]);
    mAttributeNames = ((String[])localObject4);
    mAttributeInterpolatorCount = new int[localObject4.length];
    for (paramInt1 = 0;; paramInt1++)
    {
      localObject4 = mAttributeNames;
      if (paramInt1 >= localObject4.length) {
        break;
      }
      localObject6 = localObject4[paramInt1];
      mAttributeInterpolatorCount[paramInt1] = 0;
      for (paramInt2 = 0; paramInt2 < k; paramInt2++) {
        if (attributes.containsKey(localObject6))
        {
          localObject4 = (ConstraintAttribute)attributes.get(localObject6);
          if (localObject4 != null)
          {
            localObject6 = mAttributeInterpolatorCount;
            paramInt2 = localObject6[paramInt1];
            localObject6[paramInt1] = (((ConstraintAttribute)localObject4).numberOfInterpolatedValues() + paramInt2);
            break;
          }
        }
      }
    }
    boolean bool;
    if (0mPathMotionArc != Key.UNSET) {
      bool = true;
    } else {
      bool = false;
    }
    int m = 18 + localObject4.length;
    localObject4 = new boolean[m];
    for (paramInt1 = 1; paramInt1 < k; paramInt1++) {
      localObject1[paramInt1].different(localObject1[(paramInt1 - 1)], (boolean[])localObject4, mAttributeNames, bool);
    }
    i = 0;
    paramInt2 = 1;
    while (paramInt2 < m)
    {
      paramInt1 = i;
      if (localObject4[paramInt2] != 0) {
        paramInt1 = i + 1;
      }
      paramInt2++;
      i = paramInt1;
    }
    mInterpolateVariables = new int[i];
    paramInt1 = Math.max(2, i);
    mInterpolateData = new double[paramInt1];
    mInterpolateVelocity = new double[paramInt1];
    paramInt2 = 0;
    paramInt1 = 1;
    while (paramInt1 < m)
    {
      i = paramInt2;
      if (localObject4[paramInt1] != 0)
      {
        mInterpolateVariables[paramInt2] = paramInt1;
        i = paramInt2 + 1;
      }
      paramInt1++;
      paramInt2 = i;
    }
    paramInt1 = mInterpolateVariables.length;
    localObject5 = new double[k][paramInt1];
    Object localObject7 = new double[k];
    for (paramInt1 = 0; paramInt1 < k; paramInt1++)
    {
      localObject1[paramInt1].fillStandard(localObject5[paramInt1], mInterpolateVariables);
      localObject7[paramInt1] = time;
    }
    for (paramInt1 = 0;; paramInt1++)
    {
      localObject4 = mInterpolateVariables;
      if (paramInt1 >= localObject4.length) {
        break;
      }
      if (localObject4[paramInt1] < MotionPaths.names.length)
      {
        localObject4 = z2.s(new StringBuilder(), MotionPaths.names[mInterpolateVariables[paramInt1]], " [");
        for (paramInt2 = 0; paramInt2 < k; paramInt2++)
        {
          localObject4 = z2.t((String)localObject4);
          ((StringBuilder)localObject4).append(localObject5[paramInt2][paramInt1]);
          localObject4 = ((StringBuilder)localObject4).toString();
        }
      }
    }
    mSpline = new CurveFit[mAttributeNames.length + 1];
    paramInt1 = j;
    for (;;)
    {
      j = 0;
      localObject4 = mAttributeNames;
      if (paramInt1 >= localObject4.length) {
        break;
      }
      localObject8 = localObject4[paramInt1];
      localObject6 = null;
      localObject4 = null;
      paramInt2 = 0;
      m = 1;
      i = paramInt2;
      while (j < k)
      {
        int n = i;
        localObject3 = localObject6;
        localObject2 = localObject4;
        if (localObject1[j].hasCustomData((String)localObject8))
        {
          localObject2 = localObject4;
          if (localObject4 == null)
          {
            localObject6 = new double[k];
            n = localObject1[j].getCustomDataCount((String)localObject8);
            localObject4 = new int[2];
            localObject4[m] = n;
            localObject4[paramInt2] = k;
            localObject2 = (double[][])Array.newInstance(Double.TYPE, (int[])localObject4);
          }
          localObject4 = localObject1[j];
          localObject6[i] = time;
          ((MotionPaths)localObject4).getCustomData((String)localObject8, localObject2[i], 0);
          n = i + 1;
          localObject3 = localObject6;
        }
        j++;
        paramInt2 = 0;
        m = 1;
        i = n;
        localObject6 = localObject3;
        localObject4 = localObject2;
      }
      localObject6 = Arrays.copyOf((double[])localObject6, i);
      localObject2 = (double[][])Arrays.copyOf((Object[])localObject4, i);
      localObject4 = mSpline;
      paramInt1++;
      localObject4[paramInt1] = CurveFit.get(mCurveFitType, (double[])localObject6, (double[][])localObject2);
    }
    mSpline[0] = CurveFit.get(mCurveFitType, (double[])localObject7, (double[][])localObject5);
    if (0mPathMotionArc != Key.UNSET)
    {
      localObject5 = new int[k];
      localObject6 = new double[k];
      localObject3 = new double[k][2];
      for (paramInt1 = 0; paramInt1 < k; paramInt1++)
      {
        localObject4 = localObject1[paramInt1];
        localObject5[paramInt1] = mPathMotionArc;
        localObject6[paramInt1] = time;
        localObject2 = localObject3[paramInt1];
        localObject2[0] = x;
        localObject2[1] = y;
      }
      mArcSpline = CurveFit.getArc((int[])localObject5, (double[])localObject6, (double[][])localObject3);
    }
    float f = NaN.0F;
    mCycleMap = new HashMap();
    if (mKeyList != null)
    {
      localObject4 = localHashSet.iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject2 = (String)((Iterator)localObject4).next();
        localObject6 = ViewOscillator.makeSpline((String)localObject2);
        if (localObject6 != null)
        {
          paramFloat = f;
          if (((KeyCycleOscillator)localObject6).variesByPath())
          {
            paramFloat = f;
            if (Float.isNaN(f)) {
              paramFloat = getPreCycleDistance();
            }
          }
          ((KeyCycleOscillator)localObject6).setType((String)localObject2);
          mCycleMap.put(localObject2, localObject6);
          f = paramFloat;
        }
      }
      localObject4 = mKeyList.iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject6 = (Key)((Iterator)localObject4).next();
        if ((localObject6 instanceof KeyCycle)) {
          ((KeyCycle)localObject6).addCycleValues(mCycleMap);
        }
      }
      localObject4 = mCycleMap.values().iterator();
      while (((Iterator)localObject4).hasNext()) {
        ((ViewOscillator)((Iterator)localObject4).next()).setup(f);
      }
    }
  }
  
  public void setupRelative(MotionController paramMotionController)
  {
    mStartMotionPath.setupRelative(paramMotionController, mStartMotionPath);
    mEndMotionPath.setupRelative(paramMotionController, mEndMotionPath);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t(" start: x: ");
    localStringBuilder.append(mStartMotionPath.x);
    localStringBuilder.append(" y: ");
    localStringBuilder.append(mStartMotionPath.y);
    localStringBuilder.append(" end: x: ");
    localStringBuilder.append(mEndMotionPath.x);
    localStringBuilder.append(" y: ");
    localStringBuilder.append(mEndMotionPath.y);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */