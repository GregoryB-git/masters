package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.motion.utils.ViewTimeCycle.CustomSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R.styleable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import z2;

public class KeyTimeCycle
  extends Key
{
  public static final int KEY_TYPE = 3;
  public static final String NAME = "KeyTimeCycle";
  public static final int SHAPE_BOUNCE = 6;
  public static final int SHAPE_COS_WAVE = 5;
  public static final int SHAPE_REVERSE_SAW_WAVE = 4;
  public static final int SHAPE_SAW_WAVE = 3;
  public static final int SHAPE_SIN_WAVE = 0;
  public static final int SHAPE_SQUARE_WAVE = 1;
  public static final int SHAPE_TRIANGLE_WAVE = 2;
  private static final String TAG = "KeyTimeCycle";
  public static final String WAVE_OFFSET = "waveOffset";
  public static final String WAVE_PERIOD = "wavePeriod";
  public static final String WAVE_SHAPE = "waveShape";
  private float mAlpha = NaN.0F;
  private int mCurveFit = -1;
  private String mCustomWaveShape = null;
  private float mElevation = NaN.0F;
  private float mProgress = NaN.0F;
  private float mRotation = NaN.0F;
  private float mRotationX = NaN.0F;
  private float mRotationY = NaN.0F;
  private float mScaleX = NaN.0F;
  private float mScaleY = NaN.0F;
  private String mTransitionEasing;
  private float mTransitionPathRotate = NaN.0F;
  private float mTranslationX = NaN.0F;
  private float mTranslationY = NaN.0F;
  private float mTranslationZ = NaN.0F;
  private float mWaveOffset = 0.0F;
  private float mWavePeriod = NaN.0F;
  private int mWaveShape = 0;
  
  public KeyTimeCycle()
  {
    mType = 3;
    mCustomConstraints = new HashMap();
  }
  
  public void addTimeValues(HashMap<String, ViewTimeCycle> paramHashMap)
  {
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (String)localIterator.next();
      Object localObject2 = (ViewTimeCycle)paramHashMap.get(localObject1);
      if (localObject2 != null)
      {
        boolean bool = ((String)localObject1).startsWith("CUSTOM");
        int i = 7;
        if (bool)
        {
          localObject1 = ((String)localObject1).substring(7);
          localObject1 = (ConstraintAttribute)mCustomConstraints.get(localObject1);
          if (localObject1 != null) {
            ((ViewTimeCycle.CustomSet)localObject2).setPoint(mFramePosition, (ConstraintAttribute)localObject1, mWavePeriod, mWaveShape, mWaveOffset);
          }
        }
        else
        {
          switch (((String)localObject1).hashCode())
          {
          }
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          do
                          {
                            do
                            {
                              do
                              {
                                i = -1;
                                break;
                              } while (!((String)localObject1).equals("alpha"));
                              i = 11;
                              break;
                            } while (!((String)localObject1).equals("transitionPathRotate"));
                            i = 10;
                            break;
                          } while (!((String)localObject1).equals("elevation"));
                          i = 9;
                          break;
                        } while (!((String)localObject1).equals("rotation"));
                        i = 8;
                        break;
                        if (((String)localObject1).equals("scaleY")) {
                          break;
                        }
                      } while ((goto 224) || (!((String)localObject1).equals("scaleX")));
                      i = 6;
                      break;
                    } while (!((String)localObject1).equals("progress"));
                    i = 5;
                    break;
                  } while (!((String)localObject1).equals("translationZ"));
                  i = 4;
                  break;
                } while (!((String)localObject1).equals("translationY"));
                i = 3;
                break;
              } while (!((String)localObject1).equals("translationX"));
              i = 2;
              break;
            } while (!((String)localObject1).equals("rotationY"));
            i = 1;
            break;
          } while (!((String)localObject1).equals("rotationX"));
          i = 0;
          switch (i)
          {
          default: 
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("UNKNOWN addValues \"");
            ((StringBuilder)localObject2).append((String)localObject1);
            ((StringBuilder)localObject2).append("\"");
            Log.e("KeyTimeCycles", ((StringBuilder)localObject2).toString());
            break;
          case 11: 
            if (!Float.isNaN(mAlpha)) {
              ((TimeCycleSplineSet)localObject2).setPoint(mFramePosition, mAlpha, mWavePeriod, mWaveShape, mWaveOffset);
            }
            break;
          case 10: 
            if (!Float.isNaN(mTransitionPathRotate)) {
              ((TimeCycleSplineSet)localObject2).setPoint(mFramePosition, mTransitionPathRotate, mWavePeriod, mWaveShape, mWaveOffset);
            }
            break;
          case 9: 
            if (!Float.isNaN(mElevation)) {
              ((TimeCycleSplineSet)localObject2).setPoint(mFramePosition, mElevation, mWavePeriod, mWaveShape, mWaveOffset);
            }
            break;
          case 8: 
            if (!Float.isNaN(mRotation)) {
              ((TimeCycleSplineSet)localObject2).setPoint(mFramePosition, mRotation, mWavePeriod, mWaveShape, mWaveOffset);
            }
            break;
          case 7: 
            if (!Float.isNaN(mScaleY)) {
              ((TimeCycleSplineSet)localObject2).setPoint(mFramePosition, mScaleY, mWavePeriod, mWaveShape, mWaveOffset);
            }
            break;
          case 6: 
            if (!Float.isNaN(mScaleX)) {
              ((TimeCycleSplineSet)localObject2).setPoint(mFramePosition, mScaleX, mWavePeriod, mWaveShape, mWaveOffset);
            }
            break;
          case 5: 
            if (!Float.isNaN(mProgress)) {
              ((TimeCycleSplineSet)localObject2).setPoint(mFramePosition, mProgress, mWavePeriod, mWaveShape, mWaveOffset);
            }
            break;
          case 4: 
            if (!Float.isNaN(mTranslationZ)) {
              ((TimeCycleSplineSet)localObject2).setPoint(mFramePosition, mTranslationZ, mWavePeriod, mWaveShape, mWaveOffset);
            }
            break;
          case 3: 
            if (!Float.isNaN(mTranslationY)) {
              ((TimeCycleSplineSet)localObject2).setPoint(mFramePosition, mTranslationY, mWavePeriod, mWaveShape, mWaveOffset);
            }
            break;
          case 2: 
            if (!Float.isNaN(mTranslationX)) {
              ((TimeCycleSplineSet)localObject2).setPoint(mFramePosition, mTranslationX, mWavePeriod, mWaveShape, mWaveOffset);
            }
            break;
          case 1: 
            if (!Float.isNaN(mRotationY)) {
              ((TimeCycleSplineSet)localObject2).setPoint(mFramePosition, mRotationY, mWavePeriod, mWaveShape, mWaveOffset);
            }
            break;
          case 0: 
            if (!Float.isNaN(mRotationX)) {
              ((TimeCycleSplineSet)localObject2).setPoint(mFramePosition, mRotationX, mWavePeriod, mWaveShape, mWaveOffset);
            }
            break;
          }
        }
      }
    }
  }
  
  public void addValues(HashMap<String, ViewSpline> paramHashMap)
  {
    throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
  }
  
  public Key clone()
  {
    return new KeyTimeCycle().copy(this);
  }
  
  public Key copy(Key paramKey)
  {
    super.copy(paramKey);
    paramKey = (KeyTimeCycle)paramKey;
    mTransitionEasing = mTransitionEasing;
    mCurveFit = mCurveFit;
    mWaveShape = mWaveShape;
    mWavePeriod = mWavePeriod;
    mWaveOffset = mWaveOffset;
    mProgress = mProgress;
    mAlpha = mAlpha;
    mElevation = mElevation;
    mRotation = mRotation;
    mTransitionPathRotate = mTransitionPathRotate;
    mRotationX = mRotationX;
    mRotationY = mRotationY;
    mScaleX = mScaleX;
    mScaleY = mScaleY;
    mTranslationX = mTranslationX;
    mTranslationY = mTranslationY;
    mTranslationZ = mTranslationZ;
    return this;
  }
  
  public void getAttributeNames(HashSet<String> paramHashSet)
  {
    if (!Float.isNaN(mAlpha)) {
      paramHashSet.add("alpha");
    }
    if (!Float.isNaN(mElevation)) {
      paramHashSet.add("elevation");
    }
    if (!Float.isNaN(mRotation)) {
      paramHashSet.add("rotation");
    }
    if (!Float.isNaN(mRotationX)) {
      paramHashSet.add("rotationX");
    }
    if (!Float.isNaN(mRotationY)) {
      paramHashSet.add("rotationY");
    }
    if (!Float.isNaN(mTranslationX)) {
      paramHashSet.add("translationX");
    }
    if (!Float.isNaN(mTranslationY)) {
      paramHashSet.add("translationY");
    }
    if (!Float.isNaN(mTranslationZ)) {
      paramHashSet.add("translationZ");
    }
    if (!Float.isNaN(mTransitionPathRotate)) {
      paramHashSet.add("transitionPathRotate");
    }
    if (!Float.isNaN(mScaleX)) {
      paramHashSet.add("scaleX");
    }
    if (!Float.isNaN(mScaleY)) {
      paramHashSet.add("scaleY");
    }
    if (!Float.isNaN(mProgress)) {
      paramHashSet.add("progress");
    }
    if (mCustomConstraints.size() > 0)
    {
      Iterator localIterator = mCustomConstraints.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("CUSTOM,");
        localStringBuilder.append(str);
        paramHashSet.add(localStringBuilder.toString());
      }
    }
  }
  
  public void load(Context paramContext, AttributeSet paramAttributeSet)
  {
    Loader.read(this, paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.KeyTimeCycle));
  }
  
  public void setInterpolation(HashMap<String, Integer> paramHashMap)
  {
    if (mCurveFit == -1) {
      return;
    }
    if (!Float.isNaN(mAlpha)) {
      paramHashMap.put("alpha", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mElevation)) {
      paramHashMap.put("elevation", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mRotation)) {
      paramHashMap.put("rotation", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mRotationX)) {
      paramHashMap.put("rotationX", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mRotationY)) {
      paramHashMap.put("rotationY", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mTranslationX)) {
      paramHashMap.put("translationX", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mTranslationY)) {
      paramHashMap.put("translationY", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mTranslationZ)) {
      paramHashMap.put("translationZ", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mTransitionPathRotate)) {
      paramHashMap.put("transitionPathRotate", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mScaleX)) {
      paramHashMap.put("scaleX", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mScaleX)) {
      paramHashMap.put("scaleY", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mProgress)) {
      paramHashMap.put("progress", Integer.valueOf(mCurveFit));
    }
    if (mCustomConstraints.size() > 0)
    {
      Iterator localIterator = mCustomConstraints.keySet().iterator();
      while (localIterator.hasNext()) {
        paramHashMap.put(z2.o("CUSTOM,", (String)localIterator.next()), Integer.valueOf(mCurveFit));
      }
    }
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
    case 1532805160: 
      if (paramString.equals("waveShape")) {
        j = 16;
      }
      break;
    case 579057826: 
      if (paramString.equals("curveFit")) {
        j = 15;
      }
      break;
    case 184161818: 
      if (paramString.equals("wavePeriod")) {
        j = 14;
      }
      break;
    case 156108012: 
      if (paramString.equals("waveOffset")) {
        j = 13;
      }
      break;
    case 92909918: 
      if (paramString.equals("alpha")) {
        j = 12;
      }
      break;
    case 37232917: 
      if (paramString.equals("transitionPathRotate")) {
        j = 11;
      }
      break;
    case -4379043: 
      if (paramString.equals("elevation")) {
        j = 10;
      }
      break;
    case -40300674: 
      if (paramString.equals("rotation")) {
        j = 9;
      }
      break;
    case -908189617: 
      if (paramString.equals("scaleY")) {
        j = 8;
      }
      break;
    case -908189618: 
      if (paramString.equals("scaleX")) {
        j = 7;
      }
      break;
    case -1225497655: 
      if (paramString.equals("translationZ")) {
        j = 6;
      }
      break;
    case -1225497656: 
      if (paramString.equals("translationY")) {
        j = 5;
      }
      break;
    case -1225497657: 
      if (paramString.equals("translationX")) {
        j = 4;
      }
      break;
    case -1249320805: 
      if (paramString.equals("rotationY")) {
        j = 3;
      }
      break;
    case -1249320806: 
      if (paramString.equals("rotationX")) {
        j = 2;
      }
      break;
    case -1812823328: 
      if (paramString.equals("transitionEasing")) {
        j = 1;
      }
      break;
    case -1913008125: 
      if (paramString.equals("motionProgress")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      break;
    case 16: 
      if ((paramObject instanceof Integer))
      {
        mWaveShape = toInt(paramObject);
      }
      else
      {
        mWaveShape = 7;
        mCustomWaveShape = paramObject.toString();
      }
      break;
    case 15: 
      mCurveFit = toInt(paramObject);
      break;
    case 14: 
      mWavePeriod = toFloat(paramObject);
      break;
    case 13: 
      mWaveOffset = toFloat(paramObject);
      break;
    case 12: 
      mAlpha = toFloat(paramObject);
      break;
    case 11: 
      mTransitionPathRotate = toFloat(paramObject);
      break;
    case 10: 
      mElevation = toFloat(paramObject);
      break;
    case 9: 
      mRotation = toFloat(paramObject);
      break;
    case 8: 
      mScaleY = toFloat(paramObject);
      break;
    case 7: 
      mScaleX = toFloat(paramObject);
      break;
    case 6: 
      mTranslationZ = toFloat(paramObject);
      break;
    case 5: 
      mTranslationY = toFloat(paramObject);
      break;
    case 4: 
      mTranslationX = toFloat(paramObject);
      break;
    case 3: 
      mRotationY = toFloat(paramObject);
      break;
    case 2: 
      mRotationX = toFloat(paramObject);
      break;
    case 1: 
      mTransitionEasing = paramObject.toString();
      break;
    case 0: 
      mProgress = toFloat(paramObject);
    }
  }
  
  public static class Loader
  {
    private static final int ANDROID_ALPHA = 1;
    private static final int ANDROID_ELEVATION = 2;
    private static final int ANDROID_ROTATION = 4;
    private static final int ANDROID_ROTATION_X = 5;
    private static final int ANDROID_ROTATION_Y = 6;
    private static final int ANDROID_SCALE_X = 7;
    private static final int ANDROID_SCALE_Y = 14;
    private static final int ANDROID_TRANSLATION_X = 15;
    private static final int ANDROID_TRANSLATION_Y = 16;
    private static final int ANDROID_TRANSLATION_Z = 17;
    private static final int CURVE_FIT = 13;
    private static final int FRAME_POSITION = 12;
    private static final int PROGRESS = 18;
    private static final int TARGET_ID = 10;
    private static final int TRANSITION_EASING = 9;
    private static final int TRANSITION_PATH_ROTATE = 8;
    private static final int WAVE_OFFSET = 21;
    private static final int WAVE_PERIOD = 20;
    private static final int WAVE_SHAPE = 19;
    private static SparseIntArray mAttrMap;
    
    static
    {
      SparseIntArray localSparseIntArray = new SparseIntArray();
      mAttrMap = localSparseIntArray;
      localSparseIntArray.append(R.styleable.KeyTimeCycle_android_alpha, 1);
      mAttrMap.append(R.styleable.KeyTimeCycle_android_elevation, 2);
      mAttrMap.append(R.styleable.KeyTimeCycle_android_rotation, 4);
      mAttrMap.append(R.styleable.KeyTimeCycle_android_rotationX, 5);
      mAttrMap.append(R.styleable.KeyTimeCycle_android_rotationY, 6);
      mAttrMap.append(R.styleable.KeyTimeCycle_android_scaleX, 7);
      mAttrMap.append(R.styleable.KeyTimeCycle_transitionPathRotate, 8);
      mAttrMap.append(R.styleable.KeyTimeCycle_transitionEasing, 9);
      mAttrMap.append(R.styleable.KeyTimeCycle_motionTarget, 10);
      mAttrMap.append(R.styleable.KeyTimeCycle_framePosition, 12);
      mAttrMap.append(R.styleable.KeyTimeCycle_curveFit, 13);
      mAttrMap.append(R.styleable.KeyTimeCycle_android_scaleY, 14);
      mAttrMap.append(R.styleable.KeyTimeCycle_android_translationX, 15);
      mAttrMap.append(R.styleable.KeyTimeCycle_android_translationY, 16);
      mAttrMap.append(R.styleable.KeyTimeCycle_android_translationZ, 17);
      mAttrMap.append(R.styleable.KeyTimeCycle_motionProgress, 18);
      mAttrMap.append(R.styleable.KeyTimeCycle_wavePeriod, 20);
      mAttrMap.append(R.styleable.KeyTimeCycle_waveOffset, 21);
      mAttrMap.append(R.styleable.KeyTimeCycle_waveShape, 19);
    }
    
    public static void read(KeyTimeCycle paramKeyTimeCycle, TypedArray paramTypedArray)
    {
      int i = paramTypedArray.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramTypedArray.getIndex(j);
        switch (mAttrMap.get(k))
        {
        case 3: 
        case 11: 
        default: 
          StringBuilder localStringBuilder = z2.t("unused attribute 0x");
          localStringBuilder.append(Integer.toHexString(k));
          localStringBuilder.append("   ");
          localStringBuilder.append(mAttrMap.get(k));
          Log.e("KeyTimeCycle", localStringBuilder.toString());
          break;
        case 21: 
          if (peekValuetype == 5) {
            KeyTimeCycle.access$702(paramKeyTimeCycle, paramTypedArray.getDimension(k, KeyTimeCycle.access$700(paramKeyTimeCycle)));
          } else {
            KeyTimeCycle.access$702(paramKeyTimeCycle, paramTypedArray.getFloat(k, KeyTimeCycle.access$700(paramKeyTimeCycle)));
          }
          break;
        case 20: 
          KeyTimeCycle.access$602(paramKeyTimeCycle, paramTypedArray.getFloat(k, KeyTimeCycle.access$600(paramKeyTimeCycle)));
          break;
        case 19: 
          if (peekValuetype == 3)
          {
            KeyTimeCycle.access$402(paramKeyTimeCycle, paramTypedArray.getString(k));
            KeyTimeCycle.access$502(paramKeyTimeCycle, 7);
          }
          else
          {
            KeyTimeCycle.access$502(paramKeyTimeCycle, paramTypedArray.getInt(k, KeyTimeCycle.access$500(paramKeyTimeCycle)));
          }
          break;
        case 18: 
          KeyTimeCycle.access$1702(paramKeyTimeCycle, paramTypedArray.getFloat(k, KeyTimeCycle.access$1700(paramKeyTimeCycle)));
          break;
        case 17: 
          KeyTimeCycle.access$1602(paramKeyTimeCycle, paramTypedArray.getDimension(k, KeyTimeCycle.access$1600(paramKeyTimeCycle)));
          break;
        case 16: 
          KeyTimeCycle.access$1502(paramKeyTimeCycle, paramTypedArray.getDimension(k, KeyTimeCycle.access$1500(paramKeyTimeCycle)));
          break;
        case 15: 
          KeyTimeCycle.access$1402(paramKeyTimeCycle, paramTypedArray.getDimension(k, KeyTimeCycle.access$1400(paramKeyTimeCycle)));
          break;
        case 14: 
          KeyTimeCycle.access$1202(paramKeyTimeCycle, paramTypedArray.getFloat(k, KeyTimeCycle.access$1200(paramKeyTimeCycle)));
          break;
        case 13: 
          KeyTimeCycle.access$302(paramKeyTimeCycle, paramTypedArray.getInteger(k, KeyTimeCycle.access$300(paramKeyTimeCycle)));
          break;
        case 12: 
          mFramePosition = paramTypedArray.getInt(k, mFramePosition);
          break;
        case 10: 
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
        case 9: 
          KeyTimeCycle.access$1102(paramKeyTimeCycle, paramTypedArray.getString(k));
          break;
        case 8: 
          KeyTimeCycle.access$1302(paramKeyTimeCycle, paramTypedArray.getFloat(k, KeyTimeCycle.access$1300(paramKeyTimeCycle)));
          break;
        case 7: 
          KeyTimeCycle.access$802(paramKeyTimeCycle, paramTypedArray.getFloat(k, KeyTimeCycle.access$800(paramKeyTimeCycle)));
          break;
        case 6: 
          KeyTimeCycle.access$1002(paramKeyTimeCycle, paramTypedArray.getFloat(k, KeyTimeCycle.access$1000(paramKeyTimeCycle)));
          break;
        case 5: 
          KeyTimeCycle.access$902(paramKeyTimeCycle, paramTypedArray.getFloat(k, KeyTimeCycle.access$900(paramKeyTimeCycle)));
          break;
        case 4: 
          KeyTimeCycle.access$202(paramKeyTimeCycle, paramTypedArray.getFloat(k, KeyTimeCycle.access$200(paramKeyTimeCycle)));
          break;
        case 2: 
          KeyTimeCycle.access$102(paramKeyTimeCycle, paramTypedArray.getDimension(k, KeyTimeCycle.access$100(paramKeyTimeCycle)));
          break;
        case 1: 
          KeyTimeCycle.access$002(paramKeyTimeCycle, paramTypedArray.getFloat(k, KeyTimeCycle.access$000(paramKeyTimeCycle)));
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.KeyTimeCycle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */