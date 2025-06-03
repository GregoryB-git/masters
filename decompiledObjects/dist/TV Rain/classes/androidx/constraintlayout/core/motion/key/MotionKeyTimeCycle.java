package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet.CustomVarSet;
import androidx.constraintlayout.core.motion.utils.TypedValues.CycleType;
import androidx.constraintlayout.core.motion.utils.Utils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MotionKeyTimeCycle
  extends MotionKey
{
  public static final int KEY_TYPE = 3;
  public static final String NAME = "KeyTimeCycle";
  private static final String TAG = "KeyTimeCycle";
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
  
  public MotionKeyTimeCycle()
  {
    mType = 3;
    mCustom = new HashMap();
  }
  
  public void addTimeValues(HashMap<String, TimeCycleSplineSet> paramHashMap)
  {
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (String)localIterator.next();
      Object localObject2 = (TimeCycleSplineSet)paramHashMap.get(localObject1);
      if (localObject2 != null)
      {
        boolean bool = ((String)localObject1).startsWith("CUSTOM");
        int i = 7;
        if (bool)
        {
          localObject1 = ((String)localObject1).substring(7);
          localObject1 = (CustomVariable)mCustom.get(localObject1);
          if (localObject1 != null) {
            ((TimeCycleSplineSet.CustomVarSet)localObject2).setPoint(mFramePosition, (CustomVariable)localObject1, mWavePeriod, mWaveShape, mWaveOffset);
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
                              } while (!((String)localObject1).equals("pathRotate"));
                              i = 11;
                              break;
                            } while (!((String)localObject1).equals("alpha"));
                            i = 10;
                            break;
                          } while (!((String)localObject1).equals("elevation"));
                          i = 9;
                          break;
                        } while (!((String)localObject1).equals("scaleY"));
                        i = 8;
                        break;
                        if (((String)localObject1).equals("scaleX")) {
                          break;
                        }
                      } while ((goto 224) || (!((String)localObject1).equals("progress")));
                      i = 6;
                      break;
                    } while (!((String)localObject1).equals("translationZ"));
                    i = 5;
                    break;
                  } while (!((String)localObject1).equals("translationY"));
                  i = 4;
                  break;
                } while (!((String)localObject1).equals("translationX"));
                i = 3;
                break;
              } while (!((String)localObject1).equals("rotationZ"));
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
            Utils.loge("KeyTimeCycles", ((StringBuilder)localObject2).toString());
            break;
          case 11: 
            if (!Float.isNaN(mTransitionPathRotate)) {
              ((TimeCycleSplineSet)localObject2).setPoint(mFramePosition, mTransitionPathRotate, mWavePeriod, mWaveShape, mWaveOffset);
            }
            break;
          case 10: 
            if (!Float.isNaN(mAlpha)) {
              ((TimeCycleSplineSet)localObject2).setPoint(mFramePosition, mAlpha, mWavePeriod, mWaveShape, mWaveOffset);
            }
            break;
          case 9: 
            if (!Float.isNaN(mTranslationZ)) {
              ((TimeCycleSplineSet)localObject2).setPoint(mFramePosition, mTranslationZ, mWavePeriod, mWaveShape, mWaveOffset);
            }
            break;
          case 8: 
            if (!Float.isNaN(mScaleY)) {
              ((TimeCycleSplineSet)localObject2).setPoint(mFramePosition, mScaleY, mWavePeriod, mWaveShape, mWaveOffset);
            }
            break;
          case 7: 
            if (!Float.isNaN(mScaleX)) {
              ((TimeCycleSplineSet)localObject2).setPoint(mFramePosition, mScaleX, mWavePeriod, mWaveShape, mWaveOffset);
            }
            break;
          case 6: 
            if (!Float.isNaN(mProgress)) {
              ((TimeCycleSplineSet)localObject2).setPoint(mFramePosition, mProgress, mWavePeriod, mWaveShape, mWaveOffset);
            }
            break;
          case 5: 
            if (!Float.isNaN(mTranslationZ)) {
              ((TimeCycleSplineSet)localObject2).setPoint(mFramePosition, mTranslationZ, mWavePeriod, mWaveShape, mWaveOffset);
            }
            break;
          case 4: 
            if (!Float.isNaN(mTranslationY)) {
              ((TimeCycleSplineSet)localObject2).setPoint(mFramePosition, mTranslationY, mWavePeriod, mWaveShape, mWaveOffset);
            }
            break;
          case 3: 
            if (!Float.isNaN(mTranslationX)) {
              ((TimeCycleSplineSet)localObject2).setPoint(mFramePosition, mTranslationX, mWavePeriod, mWaveShape, mWaveOffset);
            }
            break;
          case 2: 
            if (!Float.isNaN(mRotation)) {
              ((TimeCycleSplineSet)localObject2).setPoint(mFramePosition, mRotation, mWavePeriod, mWaveShape, mWaveOffset);
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
  
  public void addValues(HashMap<String, SplineSet> paramHashMap) {}
  
  public MotionKey clone()
  {
    return new MotionKeyTimeCycle().copy(this);
  }
  
  public MotionKeyTimeCycle copy(MotionKey paramMotionKey)
  {
    super.copy(paramMotionKey);
    paramMotionKey = (MotionKeyTimeCycle)paramMotionKey;
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
    return TypedValues.CycleType.getId(paramString);
  }
  
  public boolean setValue(int paramInt, float paramFloat)
  {
    if (paramInt != 315)
    {
      if (paramInt != 401)
      {
        if (paramInt != 403)
        {
          if (paramInt != 416)
          {
            if (paramInt != 423)
            {
              if (paramInt != 424) {
                switch (paramInt)
                {
                default: 
                  return super.setValue(paramInt, paramFloat);
                case 312: 
                  mScaleY = toFloat(Float.valueOf(paramFloat));
                  break;
                case 311: 
                  mScaleX = toFloat(Float.valueOf(paramFloat));
                  break;
                case 310: 
                  mRotation = toFloat(Float.valueOf(paramFloat));
                  break;
                case 309: 
                  mRotationY = toFloat(Float.valueOf(paramFloat));
                  break;
                case 308: 
                  mRotationX = toFloat(Float.valueOf(paramFloat));
                  break;
                case 307: 
                  mElevation = toFloat(Float.valueOf(paramFloat));
                  break;
                case 306: 
                  mTranslationZ = toFloat(Float.valueOf(paramFloat));
                  break;
                case 305: 
                  mTranslationY = toFloat(Float.valueOf(paramFloat));
                  break;
                case 304: 
                  mTranslationX = toFloat(Float.valueOf(paramFloat));
                  break;
                }
              } else {
                mWaveOffset = toFloat(Float.valueOf(paramFloat));
              }
            }
            else {
              mWavePeriod = toFloat(Float.valueOf(paramFloat));
            }
          }
          else {
            mTransitionPathRotate = toFloat(Float.valueOf(paramFloat));
          }
        }
        else {
          mAlpha = paramFloat;
        }
      }
      else {
        mCurveFit = toInt(Float.valueOf(paramFloat));
      }
    }
    else {
      mProgress = toFloat(Float.valueOf(paramFloat));
    }
    return true;
  }
  
  public boolean setValue(int paramInt1, int paramInt2)
  {
    if (paramInt1 != 100)
    {
      if (paramInt1 != 421) {
        return super.setValue(paramInt1, paramInt2);
      }
      mWaveShape = paramInt2;
    }
    else
    {
      mFramePosition = paramInt2;
    }
    return true;
  }
  
  public boolean setValue(int paramInt, String paramString)
  {
    if (paramInt != 420)
    {
      if (paramInt != 421) {
        return super.setValue(paramInt, paramString);
      }
      mWaveShape = 7;
      mCustomWaveShape = paramString;
    }
    else
    {
      mTransitionEasing = paramString;
    }
    return true;
  }
  
  public boolean setValue(int paramInt, boolean paramBoolean)
  {
    return super.setValue(paramInt, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */