package androidx.constraintlayout.core.motion;

import a;
import androidx.constraintlayout.core.motion.key.MotionKey;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyTrigger;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.DifferentialInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.PathRotateSet;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.Utils;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.core.motion.utils.ViewState;
import java.io.PrintStream;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import z2;

public class Motion
  implements TypedValues
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
  private HashMap<String, SplineSet> mAttributesMap;
  public String mConstraintTag;
  public float mCurrentCenterX;
  public float mCurrentCenterY;
  private int mCurveFitType = -1;
  private HashMap<String, KeyCycleOscillator> mCycleMap;
  private MotionPaths mEndMotionPath = new MotionPaths();
  private MotionConstrainedPoint mEndPoint = new MotionConstrainedPoint();
  public int mId;
  private double[] mInterpolateData;
  private int[] mInterpolateVariables;
  private double[] mInterpolateVelocity;
  private ArrayList<MotionKey> mKeyList = new ArrayList();
  private MotionKeyTrigger[] mKeyTriggers;
  private ArrayList<MotionPaths> mMotionPaths = new ArrayList();
  public float mMotionStagger = NaN.0F;
  private boolean mNoMovement = false;
  private int mPathMotionArc = -1;
  private DifferentialInterpolator mQuantizeMotionInterpolator = null;
  private float mQuantizeMotionPhase = NaN.0F;
  private int mQuantizeMotionSteps = -1;
  private CurveFit[] mSpline;
  public float mStaggerOffset = 0.0F;
  public float mStaggerScale = 1.0F;
  private MotionPaths mStartMotionPath = new MotionPaths();
  private MotionConstrainedPoint mStartPoint = new MotionConstrainedPoint();
  public Rect mTempRect = new Rect();
  private HashMap<String, TimeCycleSplineSet> mTimeCycleAttributesMap;
  private int mTransformPivotTarget = -1;
  private MotionWidget mTransformPivotView = null;
  private float[] mValuesBuff = new float[4];
  private float[] mVelocity = new float[1];
  public MotionWidget mView;
  
  public Motion(MotionWidget paramMotionWidget)
  {
    setView(paramMotionWidget);
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
  
  private static DifferentialInterpolator getInterpolator(int paramInt1, String paramString, int paramInt2)
  {
    if (paramInt1 != -1) {
      return null;
    }
    new DifferentialInterpolator()
    {
      public float mX;
      
      public float getInterpolation(float paramAnonymousFloat)
      {
        mX = paramAnonymousFloat;
        return (float)val$easing.get(paramAnonymousFloat);
      }
      
      public float getVelocity()
      {
        return (float)val$easing.getDiff(mX);
      }
    };
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
    Iterator localIterator = mMotionPaths.iterator();
    Object localObject = null;
    while (localIterator.hasNext())
    {
      MotionPaths localMotionPaths = (MotionPaths)localIterator.next();
      if (position == position) {
        localObject = localMotionPaths;
      }
    }
    if (localObject != null) {
      mMotionPaths.remove(localObject);
    }
    int i = Collections.binarySearch(mMotionPaths, paramMotionPaths);
    if (i == 0)
    {
      localObject = z2.t(" KeyPath position \"");
      ((StringBuilder)localObject).append(position);
      ((StringBuilder)localObject).append("\" outside of range");
      Utils.loge("MotionController", ((StringBuilder)localObject).toString());
    }
    mMotionPaths.add(-i - 1, paramMotionPaths);
  }
  
  private void readView(MotionPaths paramMotionPaths)
  {
    paramMotionPaths.setBounds(mView.getX(), mView.getY(), mView.getWidth(), mView.getHeight());
  }
  
  public void addKey(MotionKey paramMotionKey)
  {
    mKeyList.add(paramMotionKey);
  }
  
  public void addKeys(ArrayList<MotionKey> paramArrayList)
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
      localObject1 = (KeyCycleOscillator)((HashMap)localObject1).get("translationX");
    }
    localObject1 = mCycleMap;
    if (localObject1 != null) {
      localObject1 = (KeyCycleOscillator)((HashMap)localObject1).get("translationY");
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
      Object localObject2 = mArcSpline;
      if (localObject2 != null)
      {
        localObject1 = mInterpolateData;
        if (localObject1.length > 0) {
          ((CurveFit)localObject2).getPos(d, (double[])localObject1);
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
  
  public int buildKeyFrames(float[] paramArrayOfFloat, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    if (paramArrayOfFloat != null)
    {
      double[] arrayOfDouble = mSpline[0].getTimePoints();
      if (paramArrayOfInt1 != null)
      {
        Iterator localIterator = mMotionPaths.iterator();
        for (i = 0; localIterator.hasNext(); i++) {
          paramArrayOfInt1[i] = nextmMode;
        }
      }
      if (paramArrayOfInt2 != null)
      {
        paramArrayOfInt1 = mMotionPaths.iterator();
        for (i = 0; paramArrayOfInt1.hasNext(); i++) {
          paramArrayOfInt2[i] = ((int)(nextposition * 100.0F));
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
    KeyCycleOscillator localKeyCycleOscillator = null;
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
      localObject3 = (KeyCycleOscillator)((HashMap)localObject3).get("translationX");
    }
    Object localObject4 = mCycleMap;
    if (localObject4 != null) {
      localKeyCycleOscillator = (KeyCycleOscillator)((HashMap)localObject4).get("translationY");
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
        f5 = f6;
        if (Float.isNaN(f6)) {
          f5 = 1.0F;
        }
        f6 = f5 - f2;
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
      localObject5 = mStartMotionPath;
      Object localObject6 = mInterpolateVariables;
      localObject4 = mInterpolateData;
      int j = i * 2;
      ((MotionPaths)localObject5).getCenter(d, (int[])localObject6, (double[])localObject4, paramArrayOfFloat, j);
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
      if (localKeyCycleOscillator != null)
      {
        j++;
        f6 = paramArrayOfFloat[j];
        paramArrayOfFloat[j] = (localKeyCycleOscillator.get(f4) + f6);
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
  
  public void endTrigger(boolean paramBoolean) {}
  
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
    paramFloat1 -= x;
    float f1 = y - y;
    float f2 = width;
    float f3 = width;
    float f4 = height;
    float f5 = height;
    paramArrayOfFloat[0] = ((f2 - f3 + paramFloat1) * paramFloat2 + (1.0F - paramFloat2) * paramFloat1);
    paramArrayOfFloat[1] = ((f4 - f5 + f1) * paramFloat3 + (1.0F - paramFloat3) * f1);
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
  
  public int getId(String paramString)
  {
    return 0;
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
      MotionKey localMotionKey = (MotionKey)localIterator.next();
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
      if ((localMotionKey instanceof MotionKeyPosition))
      {
        localObject = (MotionKeyPosition)localMotionKey;
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
      Object localObject = (MotionKey)localIterator.next();
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
  
  public MotionKeyPosition getPositionKeyframe(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2)
  {
    FloatRect localFloatRect = new FloatRect();
    Object localObject1 = mStartMotionPath;
    float f1 = x;
    left = f1;
    float f2 = y;
    top = f2;
    right = (f1 + width);
    bottom = (f2 + height);
    localObject1 = new FloatRect();
    Object localObject2 = mEndMotionPath;
    f2 = x;
    left = f2;
    f1 = y;
    top = f1;
    right = (f2 + width);
    bottom = (f1 + height);
    localObject2 = mKeyList.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      Object localObject3 = (MotionKey)((Iterator)localObject2).next();
      if ((localObject3 instanceof MotionKeyPosition))
      {
        localObject3 = (MotionKeyPosition)localObject3;
        if (((MotionKeyPosition)localObject3).intersects(paramInt1, paramInt2, localFloatRect, (FloatRect)localObject1, paramFloat1, paramFloat2)) {
          return (MotionKeyPosition)localObject3;
        }
      }
    }
    return null;
  }
  
  public void getPostLayoutDvDp(float paramFloat1, int paramInt1, int paramInt2, float paramFloat2, float paramFloat3, float[] paramArrayOfFloat)
  {
    paramFloat1 = getAdjustedPosition(paramFloat1, mVelocity);
    Object localObject1 = mAttributesMap;
    KeyCycleOscillator localKeyCycleOscillator = null;
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
      localObject3 = (SplineSet)((HashMap)localObject3).get("rotationZ");
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
      localObject6 = (KeyCycleOscillator)((HashMap)localObject6).get("translationX");
    }
    Object localObject7 = mCycleMap;
    if (localObject7 == null) {
      localObject7 = null;
    } else {
      localObject7 = (KeyCycleOscillator)((HashMap)localObject7).get("translationY");
    }
    Object localObject8 = mCycleMap;
    if (localObject8 == null) {
      localObject8 = null;
    } else {
      localObject8 = (KeyCycleOscillator)((HashMap)localObject8).get("rotationZ");
    }
    Object localObject9 = mCycleMap;
    if (localObject9 == null) {
      localObject9 = null;
    } else {
      localObject9 = (KeyCycleOscillator)((HashMap)localObject9).get("scaleX");
    }
    Object localObject10 = mCycleMap;
    if (localObject10 != null) {
      localKeyCycleOscillator = (KeyCycleOscillator)((HashMap)localObject10).get("scaleY");
    }
    localObject10 = new VelocityMatrix();
    ((VelocityMatrix)localObject10).clear();
    ((VelocityMatrix)localObject10).setRotationVelocity((SplineSet)localObject3, paramFloat1);
    ((VelocityMatrix)localObject10).setTranslationVelocity((SplineSet)localObject1, (SplineSet)localObject2, paramFloat1);
    ((VelocityMatrix)localObject10).setScaleVelocity((SplineSet)localObject4, (SplineSet)localObject5, paramFloat1);
    ((VelocityMatrix)localObject10).setRotationVelocity((KeyCycleOscillator)localObject8, paramFloat1);
    ((VelocityMatrix)localObject10).setTranslationVelocity((KeyCycleOscillator)localObject6, (KeyCycleOscillator)localObject7, paramFloat1);
    ((VelocityMatrix)localObject10).setScaleVelocity((KeyCycleOscillator)localObject9, localKeyCycleOscillator, paramFloat1);
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
    float f3 = y - y;
    float f4 = width;
    float f5 = width;
    f1 = height;
    float f6 = height;
    paramArrayOfFloat[0] = ((f4 - f5 + f2) * paramFloat2 + (1.0F - paramFloat2) * f2);
    paramArrayOfFloat[1] = ((f1 - f6 + f3) * paramFloat3 + (1.0F - paramFloat3) * f3);
    ((VelocityMatrix)localObject10).clear();
    ((VelocityMatrix)localObject10).setRotationVelocity((SplineSet)localObject3, paramFloat1);
    ((VelocityMatrix)localObject10).setTranslationVelocity((SplineSet)localObject1, (SplineSet)localObject2, paramFloat1);
    ((VelocityMatrix)localObject10).setScaleVelocity((SplineSet)localObject4, (SplineSet)localObject5, paramFloat1);
    ((VelocityMatrix)localObject10).setRotationVelocity((KeyCycleOscillator)localObject8, paramFloat1);
    ((VelocityMatrix)localObject10).setTranslationVelocity((KeyCycleOscillator)localObject6, (KeyCycleOscillator)localObject7, paramFloat1);
    ((VelocityMatrix)localObject10).setScaleVelocity((KeyCycleOscillator)localObject9, localKeyCycleOscillator, paramFloat1);
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
  
  public MotionWidget getView()
  {
    return mView;
  }
  
  public boolean interpolate(MotionWidget paramMotionWidget, float paramFloat, long paramLong, KeyCache paramKeyCache)
  {
    float f1 = getAdjustedPosition(paramFloat, null);
    int i = mQuantizeMotionSteps;
    paramFloat = f1;
    float f2;
    float f3;
    if (i != -1)
    {
      f2 = 1.0F / i;
      f3 = (float)Math.floor(f1 / f2);
      f1 = f1 % f2 / f2;
      paramFloat = f1;
      if (!Float.isNaN(mQuantizeMotionPhase)) {
        paramFloat = (f1 + mQuantizeMotionPhase) % 1.0F;
      }
      paramKeyCache = mQuantizeMotionInterpolator;
      if (paramKeyCache != null) {
        paramFloat = paramKeyCache.getInterpolation(paramFloat);
      } else if (paramFloat > 0.5D) {
        paramFloat = 1.0F;
      } else {
        paramFloat = 0.0F;
      }
      paramFloat = paramFloat * f2 + f3 * f2;
    }
    paramKeyCache = mAttributesMap;
    if (paramKeyCache != null)
    {
      paramKeyCache = paramKeyCache.values().iterator();
      while (paramKeyCache.hasNext()) {
        ((SplineSet)paramKeyCache.next()).setProperty(paramMotionWidget, paramFloat);
      }
    }
    paramKeyCache = mSpline;
    Object localObject;
    float f4;
    if (paramKeyCache != null)
    {
      paramKeyCache = paramKeyCache[0];
      double d = paramFloat;
      paramKeyCache.getPos(d, mInterpolateData);
      mSpline[0].getSlope(d, mInterpolateVelocity);
      localObject = mArcSpline;
      if (localObject != null)
      {
        paramKeyCache = mInterpolateData;
        if (paramKeyCache.length > 0)
        {
          ((CurveFit)localObject).getPos(d, paramKeyCache);
          mArcSpline.getSlope(d, mInterpolateVelocity);
        }
      }
      if (!mNoMovement) {
        mStartMotionPath.setView(paramFloat, paramMotionWidget, mInterpolateVariables, mInterpolateData, mInterpolateVelocity, null);
      }
      if (mTransformPivotTarget != -1)
      {
        if (mTransformPivotView == null) {
          mTransformPivotView = paramMotionWidget.getParent().findViewById(mTransformPivotTarget);
        }
        paramKeyCache = mTransformPivotView;
        if (paramKeyCache != null)
        {
          i = paramKeyCache.getTop();
          f1 = (mTransformPivotView.getBottom() + i) / 2.0F;
          i = mTransformPivotView.getLeft();
          f2 = (mTransformPivotView.getRight() + i) / 2.0F;
          if ((paramMotionWidget.getRight() - paramMotionWidget.getLeft() > 0) && (paramMotionWidget.getBottom() - paramMotionWidget.getTop() > 0))
          {
            f4 = paramMotionWidget.getLeft();
            f3 = paramMotionWidget.getTop();
            paramMotionWidget.setPivotX(f2 - f4);
            paramMotionWidget.setPivotY(f1 - f3);
          }
        }
      }
      for (i = 1;; i++)
      {
        paramKeyCache = mSpline;
        if (i >= paramKeyCache.length) {
          break;
        }
        paramKeyCache[i].getPos(d, mValuesBuff);
        ((CustomVariable)mStartMotionPath.customAttributes.get(mAttributeNames[(i - 1)])).setInterpolatedValue(paramMotionWidget, mValuesBuff);
      }
      paramKeyCache = mStartPoint;
      if (mVisibilityMode == 0) {
        if (paramFloat <= 0.0F) {
          paramMotionWidget.setVisibility(visibility);
        } else if (paramFloat >= 1.0F) {
          paramMotionWidget.setVisibility(mEndPoint.visibility);
        } else if (mEndPoint.visibility != visibility) {
          paramMotionWidget.setVisibility(4);
        }
      }
      if (mKeyTriggers != null) {
        for (i = 0;; i++)
        {
          paramKeyCache = mKeyTriggers;
          if (i >= paramKeyCache.length) {
            break;
          }
          paramKeyCache[i].conditionallyFire(paramFloat, paramMotionWidget);
        }
      }
    }
    else
    {
      localObject = mStartMotionPath;
      f1 = x;
      paramKeyCache = mEndMotionPath;
      f2 = a.a(x, f1, paramFloat, f1);
      f1 = y;
      f3 = a.a(y, f1, paramFloat, f1);
      f1 = width;
      f1 = a.a(width, f1, paramFloat, f1);
      f4 = height;
      f4 = a.a(height, f4, paramFloat, f4);
      f2 += 0.5F;
      i = (int)f2;
      f3 += 0.5F;
      paramMotionWidget.layout(i, (int)f3, (int)(f2 + f1), (int)(f3 + f4));
    }
    paramKeyCache = mCycleMap;
    if (paramKeyCache != null)
    {
      paramKeyCache = paramKeyCache.values().iterator();
      while (paramKeyCache.hasNext())
      {
        localObject = (KeyCycleOscillator)paramKeyCache.next();
        if ((localObject instanceof KeyCycleOscillator.PathRotateSet))
        {
          localObject = (KeyCycleOscillator.PathRotateSet)localObject;
          double[] arrayOfDouble = mInterpolateVelocity;
          ((KeyCycleOscillator.PathRotateSet)localObject).setPathRotate(paramMotionWidget, paramFloat, arrayOfDouble[0], arrayOfDouble[1]);
        }
        else
        {
          ((KeyCycleOscillator)localObject).setProperty(paramMotionWidget, paramFloat);
        }
      }
    }
    return false;
  }
  
  public String name()
  {
    return mView.getName();
  }
  
  public void positionKeyframe(MotionWidget paramMotionWidget, MotionKeyPosition paramMotionKeyPosition, float paramFloat1, float paramFloat2, String[] paramArrayOfString, float[] paramArrayOfFloat)
  {
    FloatRect localFloatRect1 = new FloatRect();
    MotionPaths localMotionPaths = mStartMotionPath;
    float f1 = x;
    left = f1;
    float f2 = y;
    top = f2;
    right = (f1 + width);
    bottom = (f2 + height);
    FloatRect localFloatRect2 = new FloatRect();
    localMotionPaths = mEndMotionPath;
    f2 = x;
    left = f2;
    f1 = y;
    top = f1;
    right = (f2 + width);
    bottom = (f1 + height);
    paramMotionKeyPosition.positionAttributes(paramMotionWidget, localFloatRect1, localFloatRect2, paramFloat1, paramFloat2, paramArrayOfString, paramArrayOfFloat);
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
            paramInt3 = left;
            i = right;
            paramInt1 = bottom;
            j = top;
            left = (paramInt2 - (paramRect1.width() + (paramInt1 + j)) / 2);
            top = ((paramInt3 + i - paramRect1.height()) / 2);
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
        i = left;
        j = right;
        paramInt3 = top;
        paramInt1 = bottom;
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
  
  public void setBothStates(MotionWidget paramMotionWidget)
  {
    MotionPaths localMotionPaths = mStartMotionPath;
    time = 0.0F;
    position = 0.0F;
    mNoMovement = true;
    localMotionPaths.setBounds(paramMotionWidget.getX(), paramMotionWidget.getY(), paramMotionWidget.getWidth(), paramMotionWidget.getHeight());
    mEndMotionPath.setBounds(paramMotionWidget.getX(), paramMotionWidget.getY(), paramMotionWidget.getWidth(), paramMotionWidget.getHeight());
    mStartPoint.setState(paramMotionWidget);
    mEndPoint.setState(paramMotionWidget);
  }
  
  public void setDrawPath(int paramInt)
  {
    mStartMotionPath.mDrawPath = paramInt;
  }
  
  public void setEnd(MotionWidget paramMotionWidget)
  {
    MotionPaths localMotionPaths = mEndMotionPath;
    time = 1.0F;
    position = 1.0F;
    readView(localMotionPaths);
    mEndMotionPath.setBounds(paramMotionWidget.getLeft(), paramMotionWidget.getTop(), paramMotionWidget.getWidth(), paramMotionWidget.getHeight());
    mEndMotionPath.applyParameters(paramMotionWidget);
    mEndPoint.setState(paramMotionWidget);
  }
  
  public void setPathMotionArc(int paramInt)
  {
    mPathMotionArc = paramInt;
  }
  
  public void setStart(MotionWidget paramMotionWidget)
  {
    MotionPaths localMotionPaths = mStartMotionPath;
    time = 0.0F;
    position = 0.0F;
    localMotionPaths.setBounds(paramMotionWidget.getX(), paramMotionWidget.getY(), paramMotionWidget.getWidth(), paramMotionWidget.getHeight());
    mStartMotionPath.applyParameters(paramMotionWidget);
    mStartPoint.setState(paramMotionWidget);
  }
  
  public void setStartState(ViewState paramViewState, MotionWidget paramMotionWidget, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = mStartMotionPath;
    time = 0.0F;
    position = 0.0F;
    localObject = new Rect();
    int j;
    if (paramInt1 != 1)
    {
      if (paramInt1 == 2)
      {
        int i = left;
        j = right;
        paramInt2 = top;
        int k = bottom;
        left = (paramInt3 - (paramViewState.width() + (paramInt2 + k)) / 2);
        top = ((i + j - paramViewState.height()) / 2);
        paramInt2 = left;
        right = (paramViewState.width() + paramInt2);
        paramInt2 = top;
        bottom = (paramViewState.height() + paramInt2);
      }
    }
    else
    {
      paramInt3 = left;
      j = right;
      left = ((top + bottom - paramViewState.width()) / 2);
      top = (paramInt2 - (paramViewState.height() + (paramInt3 + j)) / 2);
      paramInt2 = left;
      right = (paramViewState.width() + paramInt2);
      paramInt2 = top;
      bottom = (paramViewState.height() + paramInt2);
    }
    mStartMotionPath.setBounds(left, top, ((Rect)localObject).width(), ((Rect)localObject).height());
    mStartPoint.setState((Rect)localObject, paramMotionWidget, paramInt1, rotation);
  }
  
  public void setTransformPivotTarget(int paramInt)
  {
    mTransformPivotTarget = paramInt;
    mTransformPivotView = null;
  }
  
  public boolean setValue(int paramInt, float paramFloat)
  {
    return false;
  }
  
  public boolean setValue(int paramInt1, int paramInt2)
  {
    if (paramInt1 != 509) {
      return paramInt1 == 704;
    }
    setPathMotionArc(paramInt2);
    return true;
  }
  
  public boolean setValue(int paramInt, String paramString)
  {
    if (705 == paramInt)
    {
      PrintStream localPrintStream = System.out;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("TYPE_INTERPOLATOR  ");
      localStringBuilder.append(paramString);
      localPrintStream.println(localStringBuilder.toString());
      mQuantizeMotionInterpolator = getInterpolator(-1, paramString, 0);
    }
    return false;
  }
  
  public boolean setValue(int paramInt, boolean paramBoolean)
  {
    return false;
  }
  
  public void setView(MotionWidget paramMotionWidget)
  {
    mView = paramMotionWidget;
  }
  
  public void setup(int paramInt1, int paramInt2, float paramFloat, long paramLong)
  {
    new HashSet();
    Object localObject1 = new HashSet();
    Object localObject2 = new HashSet();
    HashSet localHashSet = new HashSet();
    Object localObject3 = new HashMap();
    int i = mPathMotionArc;
    if (i != -1) {
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
        localObject7 = (MotionKey)((Iterator)localObject5).next();
        if ((localObject7 instanceof MotionKeyPosition))
        {
          localObject6 = (MotionKeyPosition)localObject7;
          insertKey(new MotionPaths(paramInt1, paramInt2, (MotionKeyPosition)localObject6, mStartMotionPath, mEndMotionPath));
          i = mCurveFit;
          if (i != -1) {
            mCurveFitType = i;
          }
        }
        else if ((localObject7 instanceof MotionKeyCycle))
        {
          ((MotionKey)localObject7).getAttributeNames(localHashSet);
        }
        else if ((localObject7 instanceof MotionKeyTimeCycle))
        {
          ((MotionKey)localObject7).getAttributeNames((HashSet)localObject1);
        }
        else if ((localObject7 instanceof MotionKeyTrigger))
        {
          localObject6 = localObject4;
          if (localObject4 == null) {
            localObject6 = new ArrayList();
          }
          ((ArrayList)localObject6).add((MotionKeyTrigger)localObject7);
          localObject4 = localObject6;
        }
        else
        {
          ((MotionKey)localObject7).setInterpolation((HashMap)localObject3);
          ((MotionKey)localObject7).getAttributeNames((HashSet)localObject2);
        }
      }
    }
    Object localObject6 = null;
    if (localObject6 != null) {
      mKeyTriggers = ((MotionKeyTrigger[])((ArrayList)localObject6).toArray(new MotionKeyTrigger[0]));
    }
    Object localObject8;
    Object localObject9;
    if (!((HashSet)localObject2).isEmpty())
    {
      mAttributesMap = new HashMap();
      localObject6 = ((HashSet)localObject2).iterator();
      while (((Iterator)localObject6).hasNext())
      {
        localObject5 = (String)((Iterator)localObject6).next();
        if (((String)localObject5).startsWith("CUSTOM,"))
        {
          localObject8 = new KeyFrameArray.CustomVar();
          localObject4 = localObject5.split(",")[1];
          localObject9 = mKeyList.iterator();
          while (((Iterator)localObject9).hasNext())
          {
            localObject7 = (MotionKey)((Iterator)localObject9).next();
            Object localObject10 = mCustom;
            if (localObject10 != null)
            {
              localObject10 = (CustomVariable)((HashMap)localObject10).get(localObject4);
              if (localObject10 != null) {
                ((KeyFrameArray.CustomVar)localObject8).append(mFramePosition, (CustomVariable)localObject10);
              }
            }
          }
          localObject4 = SplineSet.makeCustomSplineSet((String)localObject5, (KeyFrameArray.CustomVar)localObject8);
        }
        else
        {
          localObject4 = SplineSet.makeSpline((String)localObject5, paramLong);
        }
        if (localObject4 != null)
        {
          ((SplineSet)localObject4).setType((String)localObject5);
          mAttributesMap.put(localObject5, localObject4);
        }
      }
      localObject4 = mKeyList;
      if (localObject4 != null)
      {
        localObject6 = ((ArrayList)localObject4).iterator();
        while (((Iterator)localObject6).hasNext())
        {
          localObject4 = (MotionKey)((Iterator)localObject6).next();
          if ((localObject4 instanceof MotionKeyAttributes)) {
            ((MotionKey)localObject4).addValues(mAttributesMap);
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
            break label674;
          }
        }
        paramInt1 = 0;
        label674:
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
      localObject6 = ((HashSet)localObject1).iterator();
      while (((Iterator)localObject6).hasNext())
      {
        localObject1 = (String)((Iterator)localObject6).next();
        if (!mTimeCycleAttributesMap.containsKey(localObject1))
        {
          if (((String)localObject1).startsWith("CUSTOM,"))
          {
            localObject7 = new KeyFrameArray.CustomVar();
            localObject4 = localObject1.split(",")[1];
            localObject5 = mKeyList.iterator();
            while (((Iterator)localObject5).hasNext())
            {
              localObject9 = (MotionKey)((Iterator)localObject5).next();
              localObject8 = mCustom;
              if (localObject8 != null)
              {
                localObject8 = (CustomVariable)((HashMap)localObject8).get(localObject4);
                if (localObject8 != null) {
                  ((KeyFrameArray.CustomVar)localObject7).append(mFramePosition, (CustomVariable)localObject8);
                }
              }
            }
            localObject4 = SplineSet.makeCustomSplineSet((String)localObject1, (KeyFrameArray.CustomVar)localObject7);
          }
          else
          {
            localObject4 = SplineSet.makeSpline((String)localObject1, paramLong);
          }
          if (localObject4 != null) {
            ((SplineSet)localObject4).setType((String)localObject1);
          }
        }
      }
      localObject4 = mKeyList;
      if (localObject4 != null)
      {
        localObject4 = ((ArrayList)localObject4).iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject6 = (MotionKey)((Iterator)localObject4).next();
          if ((localObject6 instanceof MotionKeyTimeCycle)) {
            ((MotionKeyTimeCycle)localObject6).addTimeValues(mTimeCycleAttributesMap);
          }
        }
      }
      localObject6 = mTimeCycleAttributesMap.keySet().iterator();
      while (((Iterator)localObject6).hasNext())
      {
        localObject4 = (String)((Iterator)localObject6).next();
        if (((HashMap)localObject3).containsKey(localObject4)) {
          paramInt1 = ((Integer)((HashMap)localObject3).get(localObject4)).intValue();
        } else {
          paramInt1 = 0;
        }
        ((TimeCycleSplineSet)mTimeCycleAttributesMap.get(localObject4)).setup(paramInt1);
      }
    }
    int j = mMotionPaths.size() + 2;
    localObject1 = new MotionPaths[j];
    localObject1[0] = mStartMotionPath;
    localObject1[(j - 1)] = mEndMotionPath;
    if ((mMotionPaths.size() > 0) && (mCurveFitType == MotionKey.UNSET)) {
      mCurveFitType = 0;
    }
    localObject4 = mMotionPaths.iterator();
    for (paramInt1 = 1; ((Iterator)localObject4).hasNext(); paramInt1++) {
      localObject1[paramInt1] = ((MotionPaths)((Iterator)localObject4).next());
    }
    Object localObject5 = new HashSet();
    localObject4 = mEndMotionPath.customAttributes.keySet().iterator();
    while (((Iterator)localObject4).hasNext())
    {
      localObject3 = (String)((Iterator)localObject4).next();
      if (mStartMotionPath.customAttributes.containsKey(localObject3))
      {
        localObject6 = new StringBuilder();
        ((StringBuilder)localObject6).append("CUSTOM,");
        ((StringBuilder)localObject6).append((String)localObject3);
        if (!((HashSet)localObject2).contains(((StringBuilder)localObject6).toString())) {
          ((HashSet)localObject5).add(localObject3);
        }
      }
    }
    localObject4 = (String[])((AbstractCollection)localObject5).toArray(new String[0]);
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
      for (paramInt2 = 0; paramInt2 < j; paramInt2++) {
        if (customAttributes.containsKey(localObject6))
        {
          localObject4 = (CustomVariable)customAttributes.get(localObject6);
          if (localObject4 != null)
          {
            localObject6 = mAttributeInterpolatorCount;
            paramInt2 = localObject6[paramInt1];
            localObject6[paramInt1] = (((CustomVariable)localObject4).numberOfInterpolatedValues() + paramInt2);
            break;
          }
        }
      }
    }
    boolean bool;
    if (0mPathMotionArc != -1) {
      bool = true;
    } else {
      bool = false;
    }
    int k = 18 + localObject4.length;
    localObject4 = new boolean[k];
    for (paramInt1 = 1; paramInt1 < j; paramInt1++) {
      localObject1[paramInt1].different(localObject1[(paramInt1 - 1)], (boolean[])localObject4, mAttributeNames, bool);
    }
    paramInt2 = 1;
    for (i = 0; paramInt2 < k; i = paramInt1)
    {
      paramInt1 = i;
      if (localObject4[paramInt2] != 0) {
        paramInt1 = i + 1;
      }
      paramInt2++;
    }
    mInterpolateVariables = new int[i];
    paramInt1 = Math.max(2, i);
    mInterpolateData = new double[paramInt1];
    mInterpolateVelocity = new double[paramInt1];
    paramInt2 = 1;
    for (paramInt1 = 0; paramInt2 < k; paramInt1 = i)
    {
      i = paramInt1;
      if (localObject4[paramInt2] != 0)
      {
        mInterpolateVariables[paramInt1] = paramInt2;
        i = paramInt1 + 1;
      }
      paramInt2++;
    }
    paramInt1 = mInterpolateVariables.length;
    Object localObject7 = new double[j][paramInt1];
    localObject5 = new double[j];
    for (paramInt1 = 0; paramInt1 < j; paramInt1++)
    {
      localObject1[paramInt1].fillStandard(localObject7[paramInt1], mInterpolateVariables);
      localObject5[paramInt1] = time;
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
        for (paramInt2 = 0; paramInt2 < j; paramInt2++)
        {
          localObject4 = z2.t((String)localObject4);
          ((StringBuilder)localObject4).append(localObject7[paramInt2][paramInt1]);
          localObject4 = ((StringBuilder)localObject4).toString();
        }
      }
    }
    mSpline = new CurveFit[mAttributeNames.length + 1];
    paramInt1 = 0;
    for (;;)
    {
      localObject4 = mAttributeNames;
      if (paramInt1 >= localObject4.length) {
        break;
      }
      localObject9 = localObject4[paramInt1];
      paramInt2 = 0;
      i = 0;
      localObject6 = null;
      for (localObject4 = null; paramInt2 < j; localObject4 = localObject2)
      {
        k = i;
        localObject3 = localObject6;
        localObject2 = localObject4;
        if (localObject1[paramInt2].hasCustomData((String)localObject9))
        {
          if (localObject4 == null)
          {
            localObject6 = new double[j];
            k = localObject1[paramInt2].getCustomDataCount((String)localObject9);
            localObject4 = new double[j][k];
          }
          localObject2 = localObject1[paramInt2];
          localObject6[i] = time;
          ((MotionPaths)localObject2).getCustomData((String)localObject9, localObject4[i], 0);
          k = i + 1;
          localObject2 = localObject4;
          localObject3 = localObject6;
        }
        paramInt2++;
        i = k;
        localObject6 = localObject3;
      }
      localObject6 = Arrays.copyOf((double[])localObject6, i);
      localObject2 = (double[][])Arrays.copyOf((Object[])localObject4, i);
      localObject4 = mSpline;
      paramInt1++;
      localObject4[paramInt1] = CurveFit.get(mCurveFitType, (double[])localObject6, (double[][])localObject2);
    }
    mSpline[0] = CurveFit.get(mCurveFitType, (double[])localObject5, (double[][])localObject7);
    if (0mPathMotionArc != -1)
    {
      localObject5 = new int[j];
      localObject6 = new double[j];
      localObject4 = new double[j][2];
      for (paramInt1 = 0; paramInt1 < j; paramInt1++)
      {
        localObject3 = localObject1[paramInt1];
        localObject5[paramInt1] = mPathMotionArc;
        localObject6[paramInt1] = time;
        localObject2 = localObject4[paramInt1];
        localObject2[0] = x;
        localObject2[1] = y;
      }
      mArcSpline = CurveFit.getArc((int[])localObject5, (double[])localObject6, (double[][])localObject4);
    }
    float f = NaN.0F;
    mCycleMap = new HashMap();
    if (mKeyList != null)
    {
      localObject6 = localHashSet.iterator();
      while (((Iterator)localObject6).hasNext())
      {
        localObject2 = (String)((Iterator)localObject6).next();
        localObject4 = KeyCycleOscillator.makeWidgetCycle((String)localObject2);
        if (localObject4 != null)
        {
          paramFloat = f;
          if (((KeyCycleOscillator)localObject4).variesByPath())
          {
            paramFloat = f;
            if (Float.isNaN(f)) {
              paramFloat = getPreCycleDistance();
            }
          }
          ((KeyCycleOscillator)localObject4).setType((String)localObject2);
          mCycleMap.put(localObject2, localObject4);
          f = paramFloat;
        }
      }
      localObject6 = mKeyList.iterator();
      while (((Iterator)localObject6).hasNext())
      {
        localObject4 = (MotionKey)((Iterator)localObject6).next();
        if ((localObject4 instanceof MotionKeyCycle)) {
          ((MotionKeyCycle)localObject4).addCycleValues(mCycleMap);
        }
      }
      localObject4 = mCycleMap.values().iterator();
      while (((Iterator)localObject4).hasNext()) {
        ((KeyCycleOscillator)((Iterator)localObject4).next()).setup(f);
      }
    }
  }
  
  public void setupRelative(Motion paramMotion)
  {
    mStartMotionPath.setupRelative(paramMotion, mStartMotionPath);
    mEndMotionPath.setupRelative(paramMotion, mEndMotionPath);
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
 * Qualified Name:     androidx.constraintlayout.core.motion.Motion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */