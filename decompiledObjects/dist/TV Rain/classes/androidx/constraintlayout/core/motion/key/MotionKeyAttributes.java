package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.SplineSet.CustomSpline;
import androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType;
import java.io.PrintStream;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import z2;

public class MotionKeyAttributes
  extends MotionKey
{
  private static final boolean DEBUG = false;
  public static final int KEY_TYPE = 1;
  public static final String NAME = "KeyAttribute";
  private static final String TAG = "KeyAttributes";
  private float mAlpha = NaN.0F;
  private int mCurveFit = -1;
  private float mElevation = NaN.0F;
  private float mPivotX = NaN.0F;
  private float mPivotY = NaN.0F;
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
  private int mVisibility = 0;
  
  public MotionKeyAttributes()
  {
    mType = 1;
    mCustom = new HashMap();
  }
  
  private float getFloatValue(int paramInt)
  {
    if (paramInt != 100)
    {
      switch (paramInt)
      {
      default: 
        return NaN.0F;
      case 316: 
        return mTransitionPathRotate;
      case 315: 
        return mProgress;
      case 314: 
        return mPivotY;
      case 313: 
        return mPivotX;
      case 312: 
        return mScaleY;
      case 311: 
        return mScaleX;
      case 310: 
        return mRotation;
      case 309: 
        return mRotationY;
      case 308: 
        return mRotationX;
      case 307: 
        return mElevation;
      case 306: 
        return mTranslationZ;
      case 305: 
        return mTranslationY;
      case 304: 
        return mTranslationX;
      }
      return mAlpha;
    }
    return mFramePosition;
  }
  
  public void addValues(HashMap<String, SplineSet> paramHashMap)
  {
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (String)localIterator.next();
      Object localObject2 = (SplineSet)paramHashMap.get(localObject1);
      if (localObject2 != null)
      {
        boolean bool = ((String)localObject1).startsWith("CUSTOM");
        int i = 7;
        if (bool)
        {
          localObject1 = ((String)localObject1).substring(7);
          localObject1 = (CustomVariable)mCustom.get(localObject1);
          if (localObject1 != null) {
            ((SplineSet.CustomSpline)localObject2).setPoint(mFramePosition, (CustomVariable)localObject1);
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
                                do
                                {
                                  do
                                  {
                                    i = -1;
                                    break;
                                  } while (!((String)localObject1).equals("pathRotate"));
                                  i = 13;
                                  break;
                                } while (!((String)localObject1).equals("alpha"));
                                i = 12;
                                break;
                              } while (!((String)localObject1).equals("elevation"));
                              i = 11;
                              break;
                            } while (!((String)localObject1).equals("scaleY"));
                            i = 10;
                            break;
                          } while (!((String)localObject1).equals("scaleX"));
                          i = 9;
                          break;
                        } while (!((String)localObject1).equals("pivotY"));
                        i = 8;
                        break;
                        if (((String)localObject1).equals("pivotX")) {
                          break;
                        }
                      } while ((goto 228) || (!((String)localObject1).equals("progress")));
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
            PrintStream localPrintStream = System.err;
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("not supported by KeyAttributes ");
            ((StringBuilder)localObject2).append((String)localObject1);
            localPrintStream.println(((StringBuilder)localObject2).toString());
            break;
          case 13: 
            if (!Float.isNaN(mTransitionPathRotate)) {
              ((SplineSet)localObject2).setPoint(mFramePosition, mTransitionPathRotate);
            }
            break;
          case 12: 
            if (!Float.isNaN(mAlpha)) {
              ((SplineSet)localObject2).setPoint(mFramePosition, mAlpha);
            }
            break;
          case 11: 
            if (!Float.isNaN(mElevation)) {
              ((SplineSet)localObject2).setPoint(mFramePosition, mElevation);
            }
            break;
          case 10: 
            if (!Float.isNaN(mScaleY)) {
              ((SplineSet)localObject2).setPoint(mFramePosition, mScaleY);
            }
            break;
          case 9: 
            if (!Float.isNaN(mScaleX)) {
              ((SplineSet)localObject2).setPoint(mFramePosition, mScaleX);
            }
            break;
          case 8: 
            if (!Float.isNaN(mRotationY)) {
              ((SplineSet)localObject2).setPoint(mFramePosition, mPivotY);
            }
            break;
          case 7: 
            if (!Float.isNaN(mRotationX)) {
              ((SplineSet)localObject2).setPoint(mFramePosition, mPivotX);
            }
            break;
          case 6: 
            if (!Float.isNaN(mProgress)) {
              ((SplineSet)localObject2).setPoint(mFramePosition, mProgress);
            }
            break;
          case 5: 
            if (!Float.isNaN(mTranslationZ)) {
              ((SplineSet)localObject2).setPoint(mFramePosition, mTranslationZ);
            }
            break;
          case 4: 
            if (!Float.isNaN(mTranslationY)) {
              ((SplineSet)localObject2).setPoint(mFramePosition, mTranslationY);
            }
            break;
          case 3: 
            if (!Float.isNaN(mTranslationX)) {
              ((SplineSet)localObject2).setPoint(mFramePosition, mTranslationX);
            }
            break;
          case 2: 
            if (!Float.isNaN(mRotation)) {
              ((SplineSet)localObject2).setPoint(mFramePosition, mRotation);
            }
            break;
          case 1: 
            if (!Float.isNaN(mRotationY)) {
              ((SplineSet)localObject2).setPoint(mFramePosition, mRotationY);
            }
            break;
          case 0: 
            if (!Float.isNaN(mRotationX)) {
              ((SplineSet)localObject2).setPoint(mFramePosition, mRotationX);
            }
            break;
          }
        }
      }
    }
  }
  
  public MotionKey clone()
  {
    return null;
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
    if (!Float.isNaN(mPivotX)) {
      paramHashSet.add("pivotX");
    }
    if (!Float.isNaN(mPivotY)) {
      paramHashSet.add("pivotY");
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
      paramHashSet.add("pathRotate");
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
  
  public int getCurveFit()
  {
    return mCurveFit;
  }
  
  public int getId(String paramString)
  {
    return TypedValues.AttributesType.getId(paramString);
  }
  
  public void printAttributes()
  {
    Object localObject1 = new HashSet();
    getAttributeNames((HashSet)localObject1);
    Object localObject2 = System.out;
    Object localObject3 = z2.t(" ------------- ");
    ((StringBuilder)localObject3).append(mFramePosition);
    ((StringBuilder)localObject3).append(" -------------");
    ((PrintStream)localObject2).println(((StringBuilder)localObject3).toString());
    int i = 0;
    localObject3 = (String[])((AbstractCollection)localObject1).toArray(new String[0]);
    while (i < localObject3.length)
    {
      int j = TypedValues.AttributesType.getId(localObject3[i]);
      localObject1 = System.out;
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append(localObject3[i]);
      ((StringBuilder)localObject2).append(":");
      ((StringBuilder)localObject2).append(getFloatValue(j));
      ((PrintStream)localObject1).println(((StringBuilder)localObject2).toString());
      i++;
    }
  }
  
  public void setInterpolation(HashMap<String, Integer> paramHashMap)
  {
    if (!Float.isNaN(mAlpha)) {
      paramHashMap.put("alpha", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mElevation)) {
      paramHashMap.put("elevation", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mRotation)) {
      paramHashMap.put("rotationZ", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mRotationX)) {
      paramHashMap.put("rotationX", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mRotationY)) {
      paramHashMap.put("rotationY", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mPivotX)) {
      paramHashMap.put("pivotX", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mPivotY)) {
      paramHashMap.put("pivotY", Integer.valueOf(mCurveFit));
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
      paramHashMap.put("pathRotate", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mScaleX)) {
      paramHashMap.put("scaleX", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mScaleY)) {
      paramHashMap.put("scaleY", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mProgress)) {
      paramHashMap.put("progress", Integer.valueOf(mCurveFit));
    }
    if (mCustom.size() > 0)
    {
      Iterator localIterator = mCustom.keySet().iterator();
      while (localIterator.hasNext()) {
        paramHashMap.put(z2.o("CUSTOM,", (String)localIterator.next()), Integer.valueOf(mCurveFit));
      }
    }
  }
  
  public boolean setValue(int paramInt, float paramFloat)
  {
    if (paramInt != 100) {
      switch (paramInt)
      {
      default: 
        return super.setValue(paramInt, paramFloat);
      case 316: 
        mTransitionPathRotate = paramFloat;
        break;
      case 315: 
        mProgress = paramFloat;
        break;
      case 314: 
        mPivotY = paramFloat;
        break;
      case 313: 
        mPivotX = paramFloat;
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
      case 303: 
        mAlpha = paramFloat;
        break;
      }
    } else {
      mTransitionPathRotate = paramFloat;
    }
    return true;
  }
  
  public boolean setValue(int paramInt1, int paramInt2)
  {
    if (paramInt1 != 100)
    {
      if (paramInt1 != 301)
      {
        if (paramInt1 != 302)
        {
          if (!setValue(paramInt1, paramInt2)) {
            return super.setValue(paramInt1, paramInt2);
          }
        }
        else {
          mVisibility = paramInt2;
        }
      }
      else {
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
    if (paramInt != 101)
    {
      if (paramInt != 317) {
        return super.setValue(paramInt, paramString);
      }
      mTransitionEasing = paramString;
    }
    else
    {
      mTargetString = paramString;
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.key.MotionKeyAttributes
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */