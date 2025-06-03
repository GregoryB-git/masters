package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class ViewTimeCycle
  extends TimeCycleSplineSet
{
  private static final String TAG = "ViewTimeCycle";
  
  public static ViewTimeCycle makeCustomSpline(String paramString, SparseArray<ConstraintAttribute> paramSparseArray)
  {
    return new CustomSet(paramString, paramSparseArray);
  }
  
  public static ViewTimeCycle makeSpline(String paramString, long paramLong)
  {
    paramString.getClass();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
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
      return null;
    case 11: 
      paramString = new AlphaSet();
      break;
    case 10: 
      paramString = new PathRotate();
      break;
    case 9: 
      paramString = new ElevationSet();
      break;
    case 8: 
      paramString = new RotationSet();
      break;
    case 7: 
      paramString = new ScaleYset();
      break;
    case 6: 
      paramString = new ScaleXset();
      break;
    case 5: 
      paramString = new ProgressSet();
      break;
    case 4: 
      paramString = new TranslationZset();
      break;
    case 3: 
      paramString = new TranslationYset();
      break;
    case 2: 
      paramString = new TranslationXset();
      break;
    case 1: 
      paramString = new RotationYset();
      break;
    case 0: 
      paramString = new RotationXset();
    }
    paramString.setStartTime(paramLong);
    return paramString;
  }
  
  public float get(float paramFloat, long paramLong, View paramView, KeyCache paramKeyCache)
  {
    mCurveFit.getPos(paramFloat, mCache);
    float[] arrayOfFloat = mCache;
    paramFloat = arrayOfFloat[1];
    boolean bool1 = paramFloat < 0.0F;
    if (!bool1)
    {
      mContinue = false;
      return arrayOfFloat[2];
    }
    if (Float.isNaN(last_cycle))
    {
      f1 = paramKeyCache.getFloatValue(paramView, mType, 0);
      last_cycle = f1;
      if (Float.isNaN(f1)) {
        last_cycle = 0.0F;
      }
    }
    long l = last_time;
    double d = last_cycle;
    paramFloat = (float)(((paramLong - l) * 1.0E-9D * paramFloat + d) % 1.0D);
    last_cycle = paramFloat;
    paramKeyCache.setFloatValue(paramView, mType, 0, paramFloat);
    last_time = paramLong;
    float f1 = mCache[0];
    float f2 = calcWave(last_cycle);
    paramFloat = mCache[2];
    boolean bool2;
    if ((f1 == 0.0F) && (!bool1)) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    mContinue = bool2;
    return f2 * f1 + paramFloat;
  }
  
  public abstract boolean setProperty(View paramView, float paramFloat, long paramLong, KeyCache paramKeyCache);
  
  public static class AlphaSet
    extends ViewTimeCycle
  {
    public boolean setProperty(View paramView, float paramFloat, long paramLong, KeyCache paramKeyCache)
    {
      paramView.setAlpha(get(paramFloat, paramLong, paramView, paramKeyCache));
      return mContinue;
    }
  }
  
  public static class CustomSet
    extends ViewTimeCycle
  {
    public String mAttributeName = paramString.split(",")[1];
    public float[] mCache;
    public SparseArray<ConstraintAttribute> mConstraintAttributeList;
    public float[] mTempValues;
    public SparseArray<float[]> mWaveProperties = new SparseArray();
    
    public CustomSet(String paramString, SparseArray<ConstraintAttribute> paramSparseArray)
    {
      mConstraintAttributeList = paramSparseArray;
    }
    
    public void setPoint(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, float paramFloat3)
    {
      throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
    }
    
    public void setPoint(int paramInt1, ConstraintAttribute paramConstraintAttribute, float paramFloat1, int paramInt2, float paramFloat2)
    {
      mConstraintAttributeList.append(paramInt1, paramConstraintAttribute);
      mWaveProperties.append(paramInt1, new float[] { paramFloat1, paramFloat2 });
      mWaveShape = Math.max(mWaveShape, paramInt2);
    }
    
    public boolean setProperty(View paramView, float paramFloat, long paramLong, KeyCache paramKeyCache)
    {
      mCurveFit.getPos(paramFloat, mTempValues);
      float[] arrayOfFloat = mTempValues;
      float f1 = arrayOfFloat[(arrayOfFloat.length - 2)];
      paramFloat = arrayOfFloat[(arrayOfFloat.length - 1)];
      long l = last_time;
      if (Float.isNaN(last_cycle))
      {
        f2 = paramKeyCache.getFloatValue(paramView, mAttributeName, 0);
        last_cycle = f2;
        if (Float.isNaN(f2)) {
          last_cycle = 0.0F;
        }
      }
      double d = last_cycle;
      float f2 = (float)(((paramLong - l) * 1.0E-9D * f1 + d) % 1.0D);
      last_cycle = f2;
      last_time = paramLong;
      f2 = calcWave(f2);
      mContinue = false;
      for (int i = 0;; i++)
      {
        paramKeyCache = mCache;
        if (i >= paramKeyCache.length) {
          break;
        }
        boolean bool1 = mContinue;
        float f3 = mTempValues[i];
        boolean bool2;
        if (f3 != 0.0D) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        mContinue = (bool1 | bool2);
        paramKeyCache[i] = (f3 * f2 + paramFloat);
      }
      CustomSupport.setInterpolatedValue((ConstraintAttribute)mConstraintAttributeList.valueAt(0), paramView, mCache);
      if (f1 != 0.0F) {
        mContinue = true;
      }
      return mContinue;
    }
    
    public void setup(int paramInt)
    {
      int i = mConstraintAttributeList.size();
      int j = ((ConstraintAttribute)mConstraintAttributeList.valueAt(0)).numberOfInterpolatedValues();
      double[] arrayOfDouble = new double[i];
      int k = j + 2;
      mTempValues = new float[k];
      mCache = new float[j];
      double[][] arrayOfDouble1 = new double[i][k];
      for (k = 0; k < i; k++)
      {
        int m = mConstraintAttributeList.keyAt(k);
        Object localObject = (ConstraintAttribute)mConstraintAttributeList.valueAt(k);
        float[] arrayOfFloat = (float[])mWaveProperties.valueAt(k);
        arrayOfDouble[k] = (m * 0.01D);
        ((ConstraintAttribute)localObject).getValuesToInterpolate(mTempValues);
        for (m = 0;; m++)
        {
          localObject = mTempValues;
          if (m >= localObject.length) {
            break;
          }
          arrayOfDouble1[k][m] = localObject[m];
        }
        localObject = arrayOfDouble1[k];
        localObject[j] = arrayOfFloat[0];
        localObject[(j + 1)] = arrayOfFloat[1];
      }
      mCurveFit = CurveFit.get(paramInt, arrayOfDouble, arrayOfDouble1);
    }
  }
  
  public static class ElevationSet
    extends ViewTimeCycle
  {
    public boolean setProperty(View paramView, float paramFloat, long paramLong, KeyCache paramKeyCache)
    {
      paramView.setElevation(get(paramFloat, paramLong, paramView, paramKeyCache));
      return mContinue;
    }
  }
  
  public static class PathRotate
    extends ViewTimeCycle
  {
    public boolean setPathRotate(View paramView, KeyCache paramKeyCache, float paramFloat, long paramLong, double paramDouble1, double paramDouble2)
    {
      paramView.setRotation(get(paramFloat, paramLong, paramView, paramKeyCache) + (float)Math.toDegrees(Math.atan2(paramDouble2, paramDouble1)));
      return mContinue;
    }
    
    public boolean setProperty(View paramView, float paramFloat, long paramLong, KeyCache paramKeyCache)
    {
      return mContinue;
    }
  }
  
  public static class ProgressSet
    extends ViewTimeCycle
  {
    public boolean mNoMethod = false;
    
    public boolean setProperty(View paramView, float paramFloat, long paramLong, KeyCache paramKeyCache)
    {
      if ((paramView instanceof MotionLayout))
      {
        ((MotionLayout)paramView).setProgress(get(paramFloat, paramLong, paramView, paramKeyCache));
      }
      else
      {
        if (mNoMethod) {
          return false;
        }
        Object localObject = null;
        try
        {
          Method localMethod = paramView.getClass().getMethod("setProgress", new Class[] { Float.TYPE });
          localObject = localMethod;
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          mNoMethod = true;
        }
        if (localObject != null) {
          try
          {
            ((Method)localObject).invoke(paramView, new Object[] { Float.valueOf(get(paramFloat, paramLong, paramView, paramKeyCache)) });
          }
          catch (InvocationTargetException paramView)
          {
            Log.e("ViewTimeCycle", "unable to setProgress", paramView);
          }
          catch (IllegalAccessException paramView)
          {
            Log.e("ViewTimeCycle", "unable to setProgress", paramView);
          }
        }
      }
      return mContinue;
    }
  }
  
  public static class RotationSet
    extends ViewTimeCycle
  {
    public boolean setProperty(View paramView, float paramFloat, long paramLong, KeyCache paramKeyCache)
    {
      paramView.setRotation(get(paramFloat, paramLong, paramView, paramKeyCache));
      return mContinue;
    }
  }
  
  public static class RotationXset
    extends ViewTimeCycle
  {
    public boolean setProperty(View paramView, float paramFloat, long paramLong, KeyCache paramKeyCache)
    {
      paramView.setRotationX(get(paramFloat, paramLong, paramView, paramKeyCache));
      return mContinue;
    }
  }
  
  public static class RotationYset
    extends ViewTimeCycle
  {
    public boolean setProperty(View paramView, float paramFloat, long paramLong, KeyCache paramKeyCache)
    {
      paramView.setRotationY(get(paramFloat, paramLong, paramView, paramKeyCache));
      return mContinue;
    }
  }
  
  public static class ScaleXset
    extends ViewTimeCycle
  {
    public boolean setProperty(View paramView, float paramFloat, long paramLong, KeyCache paramKeyCache)
    {
      paramView.setScaleX(get(paramFloat, paramLong, paramView, paramKeyCache));
      return mContinue;
    }
  }
  
  public static class ScaleYset
    extends ViewTimeCycle
  {
    public boolean setProperty(View paramView, float paramFloat, long paramLong, KeyCache paramKeyCache)
    {
      paramView.setScaleY(get(paramFloat, paramLong, paramView, paramKeyCache));
      return mContinue;
    }
  }
  
  public static class TranslationXset
    extends ViewTimeCycle
  {
    public boolean setProperty(View paramView, float paramFloat, long paramLong, KeyCache paramKeyCache)
    {
      paramView.setTranslationX(get(paramFloat, paramLong, paramView, paramKeyCache));
      return mContinue;
    }
  }
  
  public static class TranslationYset
    extends ViewTimeCycle
  {
    public boolean setProperty(View paramView, float paramFloat, long paramLong, KeyCache paramKeyCache)
    {
      paramView.setTranslationY(get(paramFloat, paramLong, paramView, paramKeyCache));
      return mContinue;
    }
  }
  
  public static class TranslationZset
    extends ViewTimeCycle
  {
    public boolean setProperty(View paramView, float paramFloat, long paramLong, KeyCache paramKeyCache)
    {
      paramView.setTranslationZ(get(paramFloat, paramLong, paramView, paramKeyCache));
      return mContinue;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.utils.ViewTimeCycle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */