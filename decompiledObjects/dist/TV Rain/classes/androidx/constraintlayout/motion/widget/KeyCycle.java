package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintAttribute.AttributeType;
import androidx.constraintlayout.widget.R.styleable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import z2;

public class KeyCycle
  extends Key
{
  public static final int KEY_TYPE = 4;
  public static final String NAME = "KeyCycle";
  public static final int SHAPE_BOUNCE = 6;
  public static final int SHAPE_COS_WAVE = 5;
  public static final int SHAPE_REVERSE_SAW_WAVE = 4;
  public static final int SHAPE_SAW_WAVE = 3;
  public static final int SHAPE_SIN_WAVE = 0;
  public static final int SHAPE_SQUARE_WAVE = 1;
  public static final int SHAPE_TRIANGLE_WAVE = 2;
  private static final String TAG = "KeyCycle";
  public static final String WAVE_OFFSET = "waveOffset";
  public static final String WAVE_PERIOD = "wavePeriod";
  public static final String WAVE_PHASE = "wavePhase";
  public static final String WAVE_SHAPE = "waveShape";
  private float mAlpha = NaN.0F;
  private int mCurveFit = 0;
  private String mCustomWaveShape = null;
  private float mElevation = NaN.0F;
  private float mProgress = NaN.0F;
  private float mRotation = NaN.0F;
  private float mRotationX = NaN.0F;
  private float mRotationY = NaN.0F;
  private float mScaleX = NaN.0F;
  private float mScaleY = NaN.0F;
  private String mTransitionEasing = null;
  private float mTransitionPathRotate = NaN.0F;
  private float mTranslationX = NaN.0F;
  private float mTranslationY = NaN.0F;
  private float mTranslationZ = NaN.0F;
  private float mWaveOffset = 0.0F;
  private float mWavePeriod = NaN.0F;
  private float mWavePhase = 0.0F;
  private int mWaveShape = -1;
  private int mWaveVariesBy = -1;
  
  public KeyCycle()
  {
    mType = 4;
    mCustomConstraints = new HashMap();
  }
  
  public void addCycleValues(HashMap<String, ViewOscillator> paramHashMap)
  {
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (String)localIterator.next();
      if (((String)localObject1).startsWith("CUSTOM"))
      {
        Object localObject2 = ((String)localObject1).substring(7);
        localObject2 = (ConstraintAttribute)mCustomConstraints.get(localObject2);
        if ((localObject2 != null) && (((ConstraintAttribute)localObject2).getType() == ConstraintAttribute.AttributeType.FLOAT_TYPE))
        {
          localObject1 = (ViewOscillator)paramHashMap.get(localObject1);
          if (localObject1 != null) {
            ((KeyCycleOscillator)localObject1).setPoint(mFramePosition, mWaveShape, mCustomWaveShape, mWaveVariesBy, mWavePeriod, mWaveOffset, mWavePhase, ((ConstraintAttribute)localObject2).getValueToInterpolate(), localObject2);
          }
        }
      }
      else
      {
        float f = getValue((String)localObject1);
        if (!Float.isNaN(f))
        {
          localObject1 = (ViewOscillator)paramHashMap.get(localObject1);
          if (localObject1 != null) {
            ((KeyCycleOscillator)localObject1).setPoint(mFramePosition, mWaveShape, mCustomWaveShape, mWaveVariesBy, mWavePeriod, mWaveOffset, mWavePhase, f);
          }
        }
      }
    }
  }
  
  public void addValues(HashMap<String, ViewSpline> paramHashMap)
  {
    Object localObject1 = z2.t("add ");
    ((StringBuilder)localObject1).append(paramHashMap.size());
    ((StringBuilder)localObject1).append(" values");
    Debug.logStack("KeyCycle", ((StringBuilder)localObject1).toString(), 2);
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      localObject1 = (String)localIterator.next();
      Object localObject2 = (SplineSet)paramHashMap.get(localObject1);
      if (localObject2 != null)
      {
        localObject1.getClass();
        ((String)localObject1).hashCode();
        int i = -1;
        switch (((String)localObject1).hashCode())
        {
        default: 
          break;
        case 1530034690: 
          if (((String)localObject1).equals("wavePhase")) {
            i = 13;
          }
          break;
        case 156108012: 
          if (((String)localObject1).equals("waveOffset")) {
            i = 12;
          }
          break;
        case 92909918: 
          if (((String)localObject1).equals("alpha")) {
            i = 11;
          }
          break;
        case 37232917: 
          if (((String)localObject1).equals("transitionPathRotate")) {
            i = 10;
          }
          break;
        case -4379043: 
          if (((String)localObject1).equals("elevation")) {
            i = 9;
          }
          break;
        case -40300674: 
          if (((String)localObject1).equals("rotation")) {
            i = 8;
          }
          break;
        case -908189617: 
          if (((String)localObject1).equals("scaleY")) {
            i = 7;
          }
          break;
        case -908189618: 
          if (((String)localObject1).equals("scaleX")) {
            i = 6;
          }
          break;
        case -1001078227: 
          if (((String)localObject1).equals("progress")) {
            i = 5;
          }
          break;
        case -1225497655: 
          if (((String)localObject1).equals("translationZ")) {
            i = 4;
          }
          break;
        case -1225497656: 
          if (((String)localObject1).equals("translationY")) {
            i = 3;
          }
          break;
        case -1225497657: 
          if (((String)localObject1).equals("translationX")) {
            i = 2;
          }
          break;
        case -1249320805: 
          if (((String)localObject1).equals("rotationY")) {
            i = 1;
          }
          break;
        case -1249320806: 
          if (((String)localObject1).equals("rotationX")) {
            i = 0;
          }
          break;
        }
        switch (i)
        {
        default: 
          if (!((String)localObject1).startsWith("CUSTOM"))
          {
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("  UNKNOWN  ");
            ((StringBuilder)localObject2).append((String)localObject1);
            Log.v("WARNING KeyCycle", ((StringBuilder)localObject2).toString());
          }
          break;
        case 13: 
          ((SplineSet)localObject2).setPoint(mFramePosition, mWavePhase);
          break;
        case 12: 
          ((SplineSet)localObject2).setPoint(mFramePosition, mWaveOffset);
          break;
        case 11: 
          ((SplineSet)localObject2).setPoint(mFramePosition, mAlpha);
          break;
        case 10: 
          ((SplineSet)localObject2).setPoint(mFramePosition, mTransitionPathRotate);
          break;
        case 9: 
          ((SplineSet)localObject2).setPoint(mFramePosition, mElevation);
          break;
        case 8: 
          ((SplineSet)localObject2).setPoint(mFramePosition, mRotation);
          break;
        case 7: 
          ((SplineSet)localObject2).setPoint(mFramePosition, mScaleY);
          break;
        case 6: 
          ((SplineSet)localObject2).setPoint(mFramePosition, mScaleX);
          break;
        case 5: 
          ((SplineSet)localObject2).setPoint(mFramePosition, mProgress);
          break;
        case 4: 
          ((SplineSet)localObject2).setPoint(mFramePosition, mTranslationZ);
          break;
        case 3: 
          ((SplineSet)localObject2).setPoint(mFramePosition, mTranslationY);
          break;
        case 2: 
          ((SplineSet)localObject2).setPoint(mFramePosition, mTranslationX);
          break;
        case 1: 
          ((SplineSet)localObject2).setPoint(mFramePosition, mRotationY);
          break;
        case 0: 
          ((SplineSet)localObject2).setPoint(mFramePosition, mRotationX);
        }
      }
    }
  }
  
  public Key clone()
  {
    return new KeyCycle().copy(this);
  }
  
  public Key copy(Key paramKey)
  {
    super.copy(paramKey);
    paramKey = (KeyCycle)paramKey;
    mTransitionEasing = mTransitionEasing;
    mCurveFit = mCurveFit;
    mWaveShape = mWaveShape;
    mCustomWaveShape = mCustomWaveShape;
    mWavePeriod = mWavePeriod;
    mWaveOffset = mWaveOffset;
    mWavePhase = mWavePhase;
    mProgress = mProgress;
    mWaveVariesBy = mWaveVariesBy;
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
    if (!Float.isNaN(mScaleX)) {
      paramHashSet.add("scaleX");
    }
    if (!Float.isNaN(mScaleY)) {
      paramHashSet.add("scaleY");
    }
    if (!Float.isNaN(mTransitionPathRotate)) {
      paramHashSet.add("transitionPathRotate");
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
  
  public float getValue(String paramString)
  {
    paramString.getClass();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1530034690: 
      if (paramString.equals("wavePhase")) {
        j = 13;
      }
      break;
    case 156108012: 
      if (paramString.equals("waveOffset")) {
        j = 12;
      }
      break;
    case 92909918: 
      if (paramString.equals("alpha")) {
        j = 11;
      }
      break;
    case 37232917: 
      if (paramString.equals("transitionPathRotate")) {
        j = 10;
      }
      break;
    case -4379043: 
      if (paramString.equals("elevation")) {
        j = 9;
      }
      break;
    case -40300674: 
      if (paramString.equals("rotation")) {
        j = 8;
      }
      break;
    case -908189617: 
      if (paramString.equals("scaleY")) {
        j = 7;
      }
      break;
    case -908189618: 
      if (paramString.equals("scaleX")) {
        j = 6;
      }
      break;
    case -1001078227: 
      if (paramString.equals("progress")) {
        j = 5;
      }
      break;
    case -1225497655: 
      if (paramString.equals("translationZ")) {
        j = 4;
      }
      break;
    case -1225497656: 
      if (paramString.equals("translationY")) {
        j = 3;
      }
      break;
    case -1225497657: 
      if (paramString.equals("translationX")) {
        j = 2;
      }
      break;
    case -1249320805: 
      if (paramString.equals("rotationY")) {
        j = 1;
      }
      break;
    case -1249320806: 
      if (paramString.equals("rotationX")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      if (!paramString.startsWith("CUSTOM"))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("  UNKNOWN  ");
        localStringBuilder.append(paramString);
        Log.v("WARNING! KeyCycle", localStringBuilder.toString());
      }
      return NaN.0F;
    case 13: 
      return mWavePhase;
    case 12: 
      return mWaveOffset;
    case 11: 
      return mAlpha;
    case 10: 
      return mTransitionPathRotate;
    case 9: 
      return mElevation;
    case 8: 
      return mRotation;
    case 7: 
      return mScaleY;
    case 6: 
      return mScaleX;
    case 5: 
      return mProgress;
    case 4: 
      return mTranslationZ;
    case 3: 
      return mTranslationY;
    case 2: 
      return mTranslationX;
    case 1: 
      return mRotationY;
    }
    return mRotationX;
  }
  
  public void load(Context paramContext, AttributeSet paramAttributeSet)
  {
    Loader.access$000(this, paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.KeyCycle));
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
        j = 17;
      }
      break;
    case 1530034690: 
      if (paramString.equals("wavePhase")) {
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
    case 17: 
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
    case 16: 
      mWavePhase = toFloat(paramObject);
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
    private static final int ANDROID_ALPHA = 9;
    private static final int ANDROID_ELEVATION = 10;
    private static final int ANDROID_ROTATION = 11;
    private static final int ANDROID_ROTATION_X = 12;
    private static final int ANDROID_ROTATION_Y = 13;
    private static final int ANDROID_SCALE_X = 15;
    private static final int ANDROID_SCALE_Y = 16;
    private static final int ANDROID_TRANSLATION_X = 17;
    private static final int ANDROID_TRANSLATION_Y = 18;
    private static final int ANDROID_TRANSLATION_Z = 19;
    private static final int CURVE_FIT = 4;
    private static final int FRAME_POSITION = 2;
    private static final int PROGRESS = 20;
    private static final int TARGET_ID = 1;
    private static final int TRANSITION_EASING = 3;
    private static final int TRANSITION_PATH_ROTATE = 14;
    private static final int WAVE_OFFSET = 7;
    private static final int WAVE_PERIOD = 6;
    private static final int WAVE_PHASE = 21;
    private static final int WAVE_SHAPE = 5;
    private static final int WAVE_VARIES_BY = 8;
    private static SparseIntArray mAttrMap;
    
    static
    {
      SparseIntArray localSparseIntArray = new SparseIntArray();
      mAttrMap = localSparseIntArray;
      localSparseIntArray.append(R.styleable.KeyCycle_motionTarget, 1);
      mAttrMap.append(R.styleable.KeyCycle_framePosition, 2);
      mAttrMap.append(R.styleable.KeyCycle_transitionEasing, 3);
      mAttrMap.append(R.styleable.KeyCycle_curveFit, 4);
      mAttrMap.append(R.styleable.KeyCycle_waveShape, 5);
      mAttrMap.append(R.styleable.KeyCycle_wavePeriod, 6);
      mAttrMap.append(R.styleable.KeyCycle_waveOffset, 7);
      mAttrMap.append(R.styleable.KeyCycle_waveVariesBy, 8);
      mAttrMap.append(R.styleable.KeyCycle_android_alpha, 9);
      mAttrMap.append(R.styleable.KeyCycle_android_elevation, 10);
      mAttrMap.append(R.styleable.KeyCycle_android_rotation, 11);
      mAttrMap.append(R.styleable.KeyCycle_android_rotationX, 12);
      mAttrMap.append(R.styleable.KeyCycle_android_rotationY, 13);
      mAttrMap.append(R.styleable.KeyCycle_transitionPathRotate, 14);
      mAttrMap.append(R.styleable.KeyCycle_android_scaleX, 15);
      mAttrMap.append(R.styleable.KeyCycle_android_scaleY, 16);
      mAttrMap.append(R.styleable.KeyCycle_android_translationX, 17);
      mAttrMap.append(R.styleable.KeyCycle_android_translationY, 18);
      mAttrMap.append(R.styleable.KeyCycle_android_translationZ, 19);
      mAttrMap.append(R.styleable.KeyCycle_motionProgress, 20);
      mAttrMap.append(R.styleable.KeyCycle_wavePhase, 21);
    }
    
    private static void read(KeyCycle paramKeyCycle, TypedArray paramTypedArray)
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
          Log.e("KeyCycle", localStringBuilder.toString());
          break;
        case 21: 
          KeyCycle.access$2002(paramKeyCycle, paramTypedArray.getFloat(k, KeyCycle.access$2000(paramKeyCycle)) / 360.0F);
          break;
        case 20: 
          KeyCycle.access$1902(paramKeyCycle, paramTypedArray.getFloat(k, KeyCycle.access$1900(paramKeyCycle)));
          break;
        case 19: 
          KeyCycle.access$1802(paramKeyCycle, paramTypedArray.getDimension(k, KeyCycle.access$1800(paramKeyCycle)));
          break;
        case 18: 
          KeyCycle.access$1702(paramKeyCycle, paramTypedArray.getDimension(k, KeyCycle.access$1700(paramKeyCycle)));
          break;
        case 17: 
          KeyCycle.access$1602(paramKeyCycle, paramTypedArray.getDimension(k, KeyCycle.access$1600(paramKeyCycle)));
          break;
        case 16: 
          KeyCycle.access$1502(paramKeyCycle, paramTypedArray.getFloat(k, KeyCycle.access$1500(paramKeyCycle)));
          break;
        case 15: 
          KeyCycle.access$1402(paramKeyCycle, paramTypedArray.getFloat(k, KeyCycle.access$1400(paramKeyCycle)));
          break;
        case 14: 
          KeyCycle.access$1302(paramKeyCycle, paramTypedArray.getFloat(k, KeyCycle.access$1300(paramKeyCycle)));
          break;
        case 13: 
          KeyCycle.access$1202(paramKeyCycle, paramTypedArray.getFloat(k, KeyCycle.access$1200(paramKeyCycle)));
          break;
        case 12: 
          KeyCycle.access$1102(paramKeyCycle, paramTypedArray.getFloat(k, KeyCycle.access$1100(paramKeyCycle)));
          break;
        case 11: 
          KeyCycle.access$1002(paramKeyCycle, paramTypedArray.getFloat(k, KeyCycle.access$1000(paramKeyCycle)));
          break;
        case 10: 
          KeyCycle.access$902(paramKeyCycle, paramTypedArray.getDimension(k, KeyCycle.access$900(paramKeyCycle)));
          break;
        case 9: 
          KeyCycle.access$802(paramKeyCycle, paramTypedArray.getFloat(k, KeyCycle.access$800(paramKeyCycle)));
          break;
        case 8: 
          KeyCycle.access$702(paramKeyCycle, paramTypedArray.getInt(k, KeyCycle.access$700(paramKeyCycle)));
          break;
        case 7: 
          if (peekValuetype == 5) {
            KeyCycle.access$602(paramKeyCycle, paramTypedArray.getDimension(k, KeyCycle.access$600(paramKeyCycle)));
          } else {
            KeyCycle.access$602(paramKeyCycle, paramTypedArray.getFloat(k, KeyCycle.access$600(paramKeyCycle)));
          }
          break;
        case 6: 
          KeyCycle.access$502(paramKeyCycle, paramTypedArray.getFloat(k, KeyCycle.access$500(paramKeyCycle)));
          break;
        case 5: 
          if (peekValuetype == 3)
          {
            KeyCycle.access$302(paramKeyCycle, paramTypedArray.getString(k));
            KeyCycle.access$402(paramKeyCycle, 7);
          }
          else
          {
            KeyCycle.access$402(paramKeyCycle, paramTypedArray.getInt(k, KeyCycle.access$400(paramKeyCycle)));
          }
          break;
        case 4: 
          KeyCycle.access$202(paramKeyCycle, paramTypedArray.getInteger(k, KeyCycle.access$200(paramKeyCycle)));
          break;
        case 3: 
          KeyCycle.access$102(paramKeyCycle, paramTypedArray.getString(k));
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
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.KeyCycle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */