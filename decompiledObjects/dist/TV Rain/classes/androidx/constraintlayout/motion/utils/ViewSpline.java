package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class ViewSpline
  extends SplineSet
{
  private static final String TAG = "ViewSpline";
  
  public static ViewSpline makeCustomSpline(String paramString, SparseArray<ConstraintAttribute> paramSparseArray)
  {
    return new CustomSet(paramString, paramSparseArray);
  }
  
  public static ViewSpline makeSpline(String paramString)
  {
    paramString.getClass();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 156108012: 
      if (paramString.equals("waveOffset")) {
        j = 15;
      }
      break;
    case 92909918: 
      if (paramString.equals("alpha")) {
        j = 14;
      }
      break;
    case 37232917: 
      if (paramString.equals("transitionPathRotate")) {
        j = 13;
      }
      break;
    case -4379043: 
      if (paramString.equals("elevation")) {
        j = 12;
      }
      break;
    case -40300674: 
      if (paramString.equals("rotation")) {
        j = 11;
      }
      break;
    case -760884509: 
      if (paramString.equals("transformPivotY")) {
        j = 10;
      }
      break;
    case -760884510: 
      if (paramString.equals("transformPivotX")) {
        j = 9;
      }
      break;
    case -797520672: 
      if (paramString.equals("waveVariesBy")) {
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
    case 15: 
      return new AlphaSet();
    case 14: 
      return new AlphaSet();
    case 13: 
      return new PathRotate();
    case 12: 
      return new ElevationSet();
    case 11: 
      return new RotationSet();
    case 10: 
      return new PivotYset();
    case 9: 
      return new PivotXset();
    case 8: 
      return new AlphaSet();
    case 7: 
      return new ScaleYset();
    case 6: 
      return new ScaleXset();
    case 5: 
      return new ProgressSet();
    case 4: 
      return new TranslationZset();
    case 3: 
      return new TranslationYset();
    case 2: 
      return new TranslationXset();
    case 1: 
      return new RotationYset();
    }
    return new RotationXset();
  }
  
  public abstract void setProperty(View paramView, float paramFloat);
  
  public static class AlphaSet
    extends ViewSpline
  {
    public void setProperty(View paramView, float paramFloat)
    {
      paramView.setAlpha(get(paramFloat));
    }
  }
  
  public static class CustomSet
    extends ViewSpline
  {
    public String mAttributeName = paramString.split(",")[1];
    public SparseArray<ConstraintAttribute> mConstraintAttributeList;
    public float[] mTempValues;
    
    public CustomSet(String paramString, SparseArray<ConstraintAttribute> paramSparseArray)
    {
      mConstraintAttributeList = paramSparseArray;
    }
    
    public void setPoint(int paramInt, float paramFloat)
    {
      throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
    }
    
    public void setPoint(int paramInt, ConstraintAttribute paramConstraintAttribute)
    {
      mConstraintAttributeList.append(paramInt, paramConstraintAttribute);
    }
    
    public void setProperty(View paramView, float paramFloat)
    {
      mCurveFit.getPos(paramFloat, mTempValues);
      CustomSupport.setInterpolatedValue((ConstraintAttribute)mConstraintAttributeList.valueAt(0), paramView, mTempValues);
    }
    
    public void setup(int paramInt)
    {
      int i = mConstraintAttributeList.size();
      int j = ((ConstraintAttribute)mConstraintAttributeList.valueAt(0)).numberOfInterpolatedValues();
      double[] arrayOfDouble = new double[i];
      mTempValues = new float[j];
      double[][] arrayOfDouble1 = new double[i][j];
      for (j = 0; j < i; j++)
      {
        int k = mConstraintAttributeList.keyAt(j);
        Object localObject = (ConstraintAttribute)mConstraintAttributeList.valueAt(j);
        arrayOfDouble[j] = (k * 0.01D);
        ((ConstraintAttribute)localObject).getValuesToInterpolate(mTempValues);
        for (k = 0;; k++)
        {
          localObject = mTempValues;
          if (k >= localObject.length) {
            break;
          }
          arrayOfDouble1[j][k] = localObject[k];
        }
      }
      mCurveFit = CurveFit.get(paramInt, arrayOfDouble, arrayOfDouble1);
    }
  }
  
  public static class ElevationSet
    extends ViewSpline
  {
    public void setProperty(View paramView, float paramFloat)
    {
      paramView.setElevation(get(paramFloat));
    }
  }
  
  public static class PathRotate
    extends ViewSpline
  {
    public void setPathRotate(View paramView, float paramFloat, double paramDouble1, double paramDouble2)
    {
      paramView.setRotation(get(paramFloat) + (float)Math.toDegrees(Math.atan2(paramDouble2, paramDouble1)));
    }
    
    public void setProperty(View paramView, float paramFloat) {}
  }
  
  public static class PivotXset
    extends ViewSpline
  {
    public void setProperty(View paramView, float paramFloat)
    {
      paramView.setPivotX(get(paramFloat));
    }
  }
  
  public static class PivotYset
    extends ViewSpline
  {
    public void setProperty(View paramView, float paramFloat)
    {
      paramView.setPivotY(get(paramFloat));
    }
  }
  
  public static class ProgressSet
    extends ViewSpline
  {
    public boolean mNoMethod = false;
    
    public void setProperty(View paramView, float paramFloat)
    {
      if ((paramView instanceof MotionLayout))
      {
        ((MotionLayout)paramView).setProgress(get(paramFloat));
      }
      else
      {
        if (mNoMethod) {
          return;
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
            ((Method)localObject).invoke(paramView, new Object[] { Float.valueOf(get(paramFloat)) });
          }
          catch (InvocationTargetException paramView)
          {
            Log.e("ViewSpline", "unable to setProgress", paramView);
          }
          catch (IllegalAccessException paramView)
          {
            Log.e("ViewSpline", "unable to setProgress", paramView);
          }
        }
      }
    }
  }
  
  public static class RotationSet
    extends ViewSpline
  {
    public void setProperty(View paramView, float paramFloat)
    {
      paramView.setRotation(get(paramFloat));
    }
  }
  
  public static class RotationXset
    extends ViewSpline
  {
    public void setProperty(View paramView, float paramFloat)
    {
      paramView.setRotationX(get(paramFloat));
    }
  }
  
  public static class RotationYset
    extends ViewSpline
  {
    public void setProperty(View paramView, float paramFloat)
    {
      paramView.setRotationY(get(paramFloat));
    }
  }
  
  public static class ScaleXset
    extends ViewSpline
  {
    public void setProperty(View paramView, float paramFloat)
    {
      paramView.setScaleX(get(paramFloat));
    }
  }
  
  public static class ScaleYset
    extends ViewSpline
  {
    public void setProperty(View paramView, float paramFloat)
    {
      paramView.setScaleY(get(paramFloat));
    }
  }
  
  public static class TranslationXset
    extends ViewSpline
  {
    public void setProperty(View paramView, float paramFloat)
    {
      paramView.setTranslationX(get(paramFloat));
    }
  }
  
  public static class TranslationYset
    extends ViewSpline
  {
    public void setProperty(View paramView, float paramFloat)
    {
      paramView.setTranslationY(get(paramFloat));
    }
  }
  
  public static class TranslationZset
    extends ViewSpline
  {
    public void setProperty(View paramView, float paramFloat)
    {
      paramView.setTranslationZ(get(paramFloat));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.utils.ViewSpline
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */