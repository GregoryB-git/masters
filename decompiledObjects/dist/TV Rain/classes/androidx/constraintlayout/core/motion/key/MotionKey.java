package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;
import java.util.HashSet;

public abstract class MotionKey
  implements TypedValues
{
  public static final String ALPHA = "alpha";
  public static final String CUSTOM = "CUSTOM";
  public static final String ELEVATION = "elevation";
  public static final String ROTATION = "rotationZ";
  public static final String ROTATION_X = "rotationX";
  public static final String SCALE_X = "scaleX";
  public static final String SCALE_Y = "scaleY";
  public static final String TRANSITION_PATH_ROTATE = "transitionPathRotate";
  public static final String TRANSLATION_X = "translationX";
  public static final String TRANSLATION_Y = "translationY";
  public static int UNSET = -1;
  public static final String VISIBILITY = "visibility";
  public HashMap<String, CustomVariable> mCustom;
  public int mFramePosition;
  public int mTargetId;
  public String mTargetString;
  public int mType;
  
  public MotionKey()
  {
    int i = UNSET;
    mFramePosition = i;
    mTargetId = i;
    mTargetString = null;
  }
  
  public abstract void addValues(HashMap<String, SplineSet> paramHashMap);
  
  public abstract MotionKey clone();
  
  public MotionKey copy(MotionKey paramMotionKey)
  {
    mFramePosition = mFramePosition;
    mTargetId = mTargetId;
    mTargetString = mTargetString;
    mType = mType;
    return this;
  }
  
  public abstract void getAttributeNames(HashSet<String> paramHashSet);
  
  public int getFramePosition()
  {
    return mFramePosition;
  }
  
  public boolean matches(String paramString)
  {
    String str = mTargetString;
    if ((str != null) && (paramString != null)) {
      return paramString.matches(str);
    }
    return false;
  }
  
  public void setCustomAttribute(String paramString, int paramInt, float paramFloat)
  {
    mCustom.put(paramString, new CustomVariable(paramString, paramInt, paramFloat));
  }
  
  public void setCustomAttribute(String paramString, int paramInt1, int paramInt2)
  {
    mCustom.put(paramString, new CustomVariable(paramString, paramInt1, paramInt2));
  }
  
  public void setCustomAttribute(String paramString1, int paramInt, String paramString2)
  {
    mCustom.put(paramString1, new CustomVariable(paramString1, paramInt, paramString2));
  }
  
  public void setCustomAttribute(String paramString, int paramInt, boolean paramBoolean)
  {
    mCustom.put(paramString, new CustomVariable(paramString, paramInt, paramBoolean));
  }
  
  public void setFramePosition(int paramInt)
  {
    mFramePosition = paramInt;
  }
  
  public void setInterpolation(HashMap<String, Integer> paramHashMap) {}
  
  public boolean setValue(int paramInt, float paramFloat)
  {
    return false;
  }
  
  public boolean setValue(int paramInt1, int paramInt2)
  {
    if (paramInt1 != 100) {
      return false;
    }
    mFramePosition = paramInt2;
    return true;
  }
  
  public boolean setValue(int paramInt, String paramString)
  {
    if (paramInt != 101) {
      return false;
    }
    mTargetString = paramString;
    return true;
  }
  
  public boolean setValue(int paramInt, boolean paramBoolean)
  {
    return false;
  }
  
  public MotionKey setViewId(int paramInt)
  {
    mTargetId = paramInt;
    return this;
  }
  
  public boolean toBoolean(Object paramObject)
  {
    boolean bool;
    if ((paramObject instanceof Boolean)) {
      bool = ((Boolean)paramObject).booleanValue();
    } else {
      bool = Boolean.parseBoolean(paramObject.toString());
    }
    return bool;
  }
  
  public float toFloat(Object paramObject)
  {
    float f;
    if ((paramObject instanceof Float)) {
      f = ((Float)paramObject).floatValue();
    } else {
      f = Float.parseFloat(paramObject.toString());
    }
    return f;
  }
  
  public int toInt(Object paramObject)
  {
    int i;
    if ((paramObject instanceof Integer)) {
      i = ((Integer)paramObject).intValue();
    } else {
      i = Integer.parseInt(paramObject.toString());
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.key.MotionKey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */