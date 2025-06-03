package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;

public abstract class Key
{
  public static final String ALPHA = "alpha";
  public static final String CURVEFIT = "curveFit";
  public static final String CUSTOM = "CUSTOM";
  public static final String ELEVATION = "elevation";
  public static final String MOTIONPROGRESS = "motionProgress";
  public static final String PIVOT_X = "transformPivotX";
  public static final String PIVOT_Y = "transformPivotY";
  public static final String PROGRESS = "progress";
  public static final String ROTATION = "rotation";
  public static final String ROTATION_X = "rotationX";
  public static final String ROTATION_Y = "rotationY";
  public static final String SCALE_X = "scaleX";
  public static final String SCALE_Y = "scaleY";
  public static final String TRANSITIONEASING = "transitionEasing";
  public static final String TRANSITION_PATH_ROTATE = "transitionPathRotate";
  public static final String TRANSLATION_X = "translationX";
  public static final String TRANSLATION_Y = "translationY";
  public static final String TRANSLATION_Z = "translationZ";
  public static int UNSET = -1;
  public static final String VISIBILITY = "visibility";
  public static final String WAVE_OFFSET = "waveOffset";
  public static final String WAVE_PERIOD = "wavePeriod";
  public static final String WAVE_PHASE = "wavePhase";
  public static final String WAVE_VARIES_BY = "waveVariesBy";
  public HashMap<String, ConstraintAttribute> mCustomConstraints;
  public int mFramePosition;
  public int mTargetId;
  public String mTargetString;
  public int mType;
  
  public Key()
  {
    int i = UNSET;
    mFramePosition = i;
    mTargetId = i;
    mTargetString = null;
  }
  
  public abstract void addValues(HashMap<String, ViewSpline> paramHashMap);
  
  public abstract Key clone();
  
  public Key copy(Key paramKey)
  {
    mFramePosition = mFramePosition;
    mTargetId = mTargetId;
    mTargetString = mTargetString;
    mType = mType;
    mCustomConstraints = mCustomConstraints;
    return this;
  }
  
  public abstract void getAttributeNames(HashSet<String> paramHashSet);
  
  public int getFramePosition()
  {
    return mFramePosition;
  }
  
  public abstract void load(Context paramContext, AttributeSet paramAttributeSet);
  
  public boolean matches(String paramString)
  {
    String str = mTargetString;
    if ((str != null) && (paramString != null)) {
      return paramString.matches(str);
    }
    return false;
  }
  
  public void setFramePosition(int paramInt)
  {
    mFramePosition = paramInt;
  }
  
  public void setInterpolation(HashMap<String, Integer> paramHashMap) {}
  
  public abstract void setValue(String paramString, Object paramObject);
  
  public Key setViewId(int paramInt)
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
 * Qualified Name:     androidx.constraintlayout.motion.widget.Key
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */