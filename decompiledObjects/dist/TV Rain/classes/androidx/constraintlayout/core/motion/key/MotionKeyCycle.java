package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType;
import androidx.constraintlayout.core.motion.utils.Utils;
import java.io.PrintStream;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import z2;

public class MotionKeyCycle
  extends MotionKey
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
  
  public MotionKeyCycle()
  {
    mType = 4;
    mCustom = new HashMap();
  }
  
  public void addCycleValues(HashMap<String, KeyCycleOscillator> paramHashMap)
  {
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (String)localIterator.next();
      Object localObject2;
      if (((String)localObject1).startsWith("CUSTOM"))
      {
        localObject2 = ((String)localObject1).substring(7);
        localObject2 = (CustomVariable)mCustom.get(localObject2);
        if ((localObject2 != null) && (((CustomVariable)localObject2).getType() == 901))
        {
          localObject1 = (KeyCycleOscillator)paramHashMap.get(localObject1);
          if (localObject1 != null) {
            ((KeyCycleOscillator)localObject1).setPoint(mFramePosition, mWaveShape, mCustomWaveShape, -1, mWavePeriod, mWaveOffset, mWavePhase, ((CustomVariable)localObject2).getValueToInterpolate(), localObject2);
          }
        }
      }
      else
      {
        float f = getValue((String)localObject1);
        if (!Float.isNaN(f))
        {
          localObject2 = (KeyCycleOscillator)paramHashMap.get(localObject1);
          if (localObject2 != null) {
            ((KeyCycleOscillator)localObject2).setPoint(mFramePosition, mWaveShape, mCustomWaveShape, -1, mWavePeriod, mWaveOffset, mWavePhase, f);
          }
        }
      }
    }
  }
  
  public void addValues(HashMap<String, SplineSet> paramHashMap) {}
  
  public MotionKey clone()
  {
    return null;
  }
  
  public void dump()
  {
    PrintStream localPrintStream = System.out;
    StringBuilder localStringBuilder = z2.t("MotionKeyCycle{mWaveShape=");
    localStringBuilder.append(mWaveShape);
    localStringBuilder.append(", mWavePeriod=");
    localStringBuilder.append(mWavePeriod);
    localStringBuilder.append(", mWaveOffset=");
    localStringBuilder.append(mWaveOffset);
    localStringBuilder.append(", mWavePhase=");
    localStringBuilder.append(mWavePhase);
    localStringBuilder.append(", mRotation=");
    localStringBuilder.append(mRotation);
    localStringBuilder.append('}');
    localPrintStream.println(localStringBuilder.toString());
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
      paramHashSet.add("rotationZ");
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
      paramHashSet.add("pathRotate");
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
    if (mCustom.size() > 0)
    {
      Iterator localIterator = mCustom.keySet().iterator();
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
  
  public int getId(String paramString)
  {
    paramString.getClass();
    switch (paramString.hashCode())
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
                                            } while (!paramString.equals("visibility"));
                                            i = 20;
                                            break;
                                          } while (!paramString.equals("waveShape"));
                                          i = 19;
                                          break;
                                        } while (!paramString.equals("pathRotate"));
                                        i = 18;
                                        break;
                                      } while (!paramString.equals("curveFit"));
                                      i = 17;
                                      break;
                                    } while (!paramString.equals("phase"));
                                    i = 16;
                                    break;
                                  } while (!paramString.equals("alpha"));
                                  i = 15;
                                  break;
                                } while (!paramString.equals("scaleY"));
                                i = 14;
                                break;
                              } while (!paramString.equals("scaleX"));
                              i = 13;
                              break;
                            } while (!paramString.equals("pivotY"));
                            i = 12;
                            break;
                          } while (!paramString.equals("pivotX"));
                          i = 11;
                          break;
                        } while (!paramString.equals("period"));
                        i = 10;
                        break;
                      } while (!paramString.equals("progress"));
                      i = 9;
                      break;
                    } while (!paramString.equals("offset"));
                    i = 8;
                    break;
                  } while (!paramString.equals("translationZ"));
                  i = 7;
                  break;
                } while (!paramString.equals("translationY"));
                i = 6;
                break;
              } while (!paramString.equals("translationX"));
              i = 5;
              break;
            } while (!paramString.equals("rotationZ"));
            i = 4;
            break;
          } while (!paramString.equals("rotationY"));
          i = 3;
          break;
        } while (!paramString.equals("rotationX"));
        i = 2;
        break;
      } while (!paramString.equals("easing"));
      i = 1;
      break;
    } while (!paramString.equals("customWave"));
    int i = 0;
    switch (i)
    {
    default: 
      return -1;
    case 20: 
      return 402;
    case 19: 
      return 421;
    case 18: 
      return 416;
    case 17: 
      return 401;
    case 16: 
      return 425;
    case 15: 
      return 403;
    case 14: 
      return 312;
    case 13: 
      return 311;
    case 12: 
      return 314;
    case 11: 
      return 313;
    case 10: 
      return 423;
    case 9: 
      return 315;
    case 8: 
      return 424;
    case 7: 
      return 306;
    case 6: 
      return 305;
    case 5: 
      return 304;
    case 4: 
      return 310;
    case 3: 
      return 309;
    case 2: 
      return 308;
    case 1: 
      return 420;
    }
    return 422;
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
    case 803192288: 
      if (paramString.equals("pathRotate")) {
        j = 13;
      }
      break;
    case 106629499: 
      if (paramString.equals("phase")) {
        j = 12;
      }
      break;
    case 92909918: 
      if (paramString.equals("alpha")) {
        j = 11;
      }
      break;
    case -4379043: 
      if (paramString.equals("elevation")) {
        j = 10;
      }
      break;
    case -908189617: 
      if (paramString.equals("scaleY")) {
        j = 9;
      }
      break;
    case -908189618: 
      if (paramString.equals("scaleX")) {
        j = 8;
      }
      break;
    case -1001078227: 
      if (paramString.equals("progress")) {
        j = 7;
      }
      break;
    case -1019779949: 
      if (paramString.equals("offset")) {
        j = 6;
      }
      break;
    case -1225497655: 
      if (paramString.equals("translationZ")) {
        j = 5;
      }
      break;
    case -1225497656: 
      if (paramString.equals("translationY")) {
        j = 4;
      }
      break;
    case -1225497657: 
      if (paramString.equals("translationX")) {
        j = 3;
      }
      break;
    case -1249320804: 
      if (paramString.equals("rotationZ")) {
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
      return NaN.0F;
    case 13: 
      return mTransitionPathRotate;
    case 12: 
      return mWavePhase;
    case 11: 
      return mAlpha;
    case 10: 
      return mElevation;
    case 9: 
      return mScaleY;
    case 8: 
      return mScaleX;
    case 7: 
      return mProgress;
    case 6: 
      return mWaveOffset;
    case 5: 
      return mTranslationZ;
    case 4: 
      return mTranslationY;
    case 3: 
      return mTranslationX;
    case 2: 
      return mRotation;
    case 1: 
      return mRotationY;
    }
    return mRotationX;
  }
  
  public void printAttributes()
  {
    Object localObject = new HashSet();
    getAttributeNames((HashSet)localObject);
    StringBuilder localStringBuilder = z2.t(" ------------- ");
    localStringBuilder.append(mFramePosition);
    localStringBuilder.append(" -------------");
    Utils.log(localStringBuilder.toString());
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("MotionKeyCycle{Shape=");
    localStringBuilder.append(mWaveShape);
    localStringBuilder.append(", Period=");
    localStringBuilder.append(mWavePeriod);
    localStringBuilder.append(", Offset=");
    localStringBuilder.append(mWaveOffset);
    localStringBuilder.append(", Phase=");
    localStringBuilder.append(mWavePhase);
    localStringBuilder.append('}');
    Utils.log(localStringBuilder.toString());
    int i = 0;
    localObject = (String[])((AbstractCollection)localObject).toArray(new String[0]);
    while (i < localObject.length)
    {
      TypedValues.AttributesType.getId(localObject[i]);
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(localObject[i]);
      localStringBuilder.append(":");
      localStringBuilder.append(getValue(localObject[i]));
      Utils.log(localStringBuilder.toString());
      i++;
    }
  }
  
  public boolean setValue(int paramInt, float paramFloat)
  {
    if (paramInt != 315)
    {
      if (paramInt != 403)
      {
        if (paramInt != 416) {
          switch (paramInt)
          {
          default: 
            switch (paramInt)
            {
            default: 
              return super.setValue(paramInt, paramFloat);
            case 425: 
              mWavePhase = paramFloat;
              break;
            case 424: 
              mWaveOffset = paramFloat;
              break;
            case 423: 
              mWavePeriod = paramFloat;
            }
            break;
          case 312: 
            mScaleY = paramFloat;
            break;
          case 311: 
            mScaleX = paramFloat;
            break;
          case 310: 
            mRotation = paramFloat;
            break;
          case 309: 
            mRotationY = paramFloat;
            break;
          case 308: 
            mRotationX = paramFloat;
            break;
          case 307: 
            mElevation = paramFloat;
            break;
          case 306: 
            mTranslationZ = paramFloat;
            break;
          case 305: 
            mTranslationY = paramFloat;
            break;
          case 304: 
            mTranslationX = paramFloat;
            break;
          }
        } else {
          mTransitionPathRotate = paramFloat;
        }
      }
      else {
        mAlpha = paramFloat;
      }
    }
    else {
      mProgress = paramFloat;
    }
    return true;
  }
  
  public boolean setValue(int paramInt1, int paramInt2)
  {
    if (paramInt1 != 401)
    {
      if (paramInt1 != 421)
      {
        if (setValue(paramInt1, paramInt2)) {
          return true;
        }
        return super.setValue(paramInt1, paramInt2);
      }
      mWaveShape = paramInt2;
      return true;
    }
    mCurveFit = paramInt2;
    return true;
  }
  
  public boolean setValue(int paramInt, String paramString)
  {
    if (paramInt != 420)
    {
      if (paramInt != 422) {
        return super.setValue(paramInt, paramString);
      }
      mCustomWaveShape = paramString;
      return true;
    }
    mTransitionEasing = paramString;
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.key.MotionKeyCycle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */