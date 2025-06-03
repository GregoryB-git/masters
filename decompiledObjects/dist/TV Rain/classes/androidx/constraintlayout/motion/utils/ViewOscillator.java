package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class ViewOscillator
  extends KeyCycleOscillator
{
  private static final String TAG = "ViewOscillator";
  
  public static ViewOscillator makeSpline(String paramString)
  {
    if (paramString.startsWith("CUSTOM")) {
      return new CustomSet();
    }
    int i = -1;
    switch (paramString.hashCode())
    {
    default: 
      break;
    case 156108012: 
      if (paramString.equals("waveOffset")) {
        i = 13;
      }
      break;
    case 92909918: 
      if (paramString.equals("alpha")) {
        i = 12;
      }
      break;
    case 37232917: 
      if (paramString.equals("transitionPathRotate")) {
        i = 11;
      }
      break;
    case -4379043: 
      if (paramString.equals("elevation")) {
        i = 10;
      }
      break;
    case -40300674: 
      if (paramString.equals("rotation")) {
        i = 9;
      }
      break;
    case -797520672: 
      if (paramString.equals("waveVariesBy")) {
        i = 8;
      }
      break;
    case -908189617: 
      if (paramString.equals("scaleY")) {
        i = 7;
      }
      break;
    case -908189618: 
      if (paramString.equals("scaleX")) {
        i = 6;
      }
      break;
    case -1001078227: 
      if (paramString.equals("progress")) {
        i = 5;
      }
      break;
    case -1225497655: 
      if (paramString.equals("translationZ")) {
        i = 4;
      }
      break;
    case -1225497656: 
      if (paramString.equals("translationY")) {
        i = 3;
      }
      break;
    case -1225497657: 
      if (paramString.equals("translationX")) {
        i = 2;
      }
      break;
    case -1249320805: 
      if (paramString.equals("rotationY")) {
        i = 1;
      }
      break;
    case -1249320806: 
      if (paramString.equals("rotationX")) {
        i = 0;
      }
      break;
    }
    switch (i)
    {
    default: 
      return null;
    case 13: 
      return new AlphaSet();
    case 12: 
      return new AlphaSet();
    case 11: 
      return new PathRotateSet();
    case 10: 
      return new ElevationSet();
    case 9: 
      return new RotationSet();
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
    extends ViewOscillator
  {
    public void setProperty(View paramView, float paramFloat)
    {
      paramView.setAlpha(get(paramFloat));
    }
  }
  
  public static class CustomSet
    extends ViewOscillator
  {
    public ConstraintAttribute mCustom;
    public float[] value = new float[1];
    
    public void setCustom(Object paramObject)
    {
      mCustom = ((ConstraintAttribute)paramObject);
    }
    
    public void setProperty(View paramView, float paramFloat)
    {
      value[0] = get(paramFloat);
      CustomSupport.setInterpolatedValue(mCustom, paramView, value);
    }
  }
  
  public static class ElevationSet
    extends ViewOscillator
  {
    public void setProperty(View paramView, float paramFloat)
    {
      paramView.setElevation(get(paramFloat));
    }
  }
  
  public static class PathRotateSet
    extends ViewOscillator
  {
    public void setPathRotate(View paramView, float paramFloat, double paramDouble1, double paramDouble2)
    {
      paramView.setRotation(get(paramFloat) + (float)Math.toDegrees(Math.atan2(paramDouble2, paramDouble1)));
    }
    
    public void setProperty(View paramView, float paramFloat) {}
  }
  
  public static class ProgressSet
    extends ViewOscillator
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
            Log.e("ViewOscillator", "unable to setProgress", paramView);
          }
          catch (IllegalAccessException paramView)
          {
            Log.e("ViewOscillator", "unable to setProgress", paramView);
          }
        }
      }
    }
  }
  
  public static class RotationSet
    extends ViewOscillator
  {
    public void setProperty(View paramView, float paramFloat)
    {
      paramView.setRotation(get(paramFloat));
    }
  }
  
  public static class RotationXset
    extends ViewOscillator
  {
    public void setProperty(View paramView, float paramFloat)
    {
      paramView.setRotationX(get(paramFloat));
    }
  }
  
  public static class RotationYset
    extends ViewOscillator
  {
    public void setProperty(View paramView, float paramFloat)
    {
      paramView.setRotationY(get(paramFloat));
    }
  }
  
  public static class ScaleXset
    extends ViewOscillator
  {
    public void setProperty(View paramView, float paramFloat)
    {
      paramView.setScaleX(get(paramFloat));
    }
  }
  
  public static class ScaleYset
    extends ViewOscillator
  {
    public void setProperty(View paramView, float paramFloat)
    {
      paramView.setScaleY(get(paramFloat));
    }
  }
  
  public static class TranslationXset
    extends ViewOscillator
  {
    public void setProperty(View paramView, float paramFloat)
    {
      paramView.setTranslationX(get(paramFloat));
    }
  }
  
  public static class TranslationYset
    extends ViewOscillator
  {
    public void setProperty(View paramView, float paramFloat)
    {
      paramView.setTranslationY(get(paramFloat));
    }
  }
  
  public static class TranslationZset
    extends ViewOscillator
  {
    public void setProperty(View paramView, float paramFloat)
    {
      paramView.setTranslationZ(get(paramFloat));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.utils.ViewOscillator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */