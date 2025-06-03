package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType;
import androidx.constraintlayout.core.motion.utils.TypedValues.MotionType;
import androidx.constraintlayout.core.state.WidgetFrame;
import java.util.Set;

public class MotionWidget
  implements TypedValues
{
  public static final int FILL_PARENT = -1;
  public static final int GONE_UNSET = Integer.MIN_VALUE;
  private static final int INTERNAL_MATCH_CONSTRAINT = -3;
  private static final int INTERNAL_MATCH_PARENT = -1;
  private static final int INTERNAL_WRAP_CONTENT = -2;
  private static final int INTERNAL_WRAP_CONTENT_CONSTRAINED = -4;
  public static final int INVISIBLE = 0;
  public static final int MATCH_CONSTRAINT = 0;
  public static final int MATCH_CONSTRAINT_WRAP = 1;
  public static final int MATCH_PARENT = -1;
  public static final int PARENT_ID = 0;
  public static final int ROTATE_LEFT_OF_PORTRATE = 4;
  public static final int ROTATE_NONE = 0;
  public static final int ROTATE_PORTRATE_OF_LEFT = 2;
  public static final int ROTATE_PORTRATE_OF_RIGHT = 1;
  public static final int ROTATE_RIGHT_OF_PORTRATE = 3;
  public static final int UNSET = -1;
  public static final int VISIBILITY_MODE_IGNORE = 1;
  public static final int VISIBILITY_MODE_NORMAL = 0;
  public static final int VISIBLE = 4;
  public static final int WRAP_CONTENT = -2;
  private float mProgress;
  public float mTransitionPathRotate;
  public Motion motion = new Motion();
  public PropertySet propertySet = new PropertySet();
  public WidgetFrame widgetFrame = new WidgetFrame();
  
  public MotionWidget() {}
  
  public MotionWidget(WidgetFrame paramWidgetFrame)
  {
    widgetFrame = paramWidgetFrame;
  }
  
  public MotionWidget findViewById(int paramInt)
  {
    return null;
  }
  
  public float getAlpha()
  {
    return propertySet.alpha;
  }
  
  public int getBottom()
  {
    return widgetFrame.bottom;
  }
  
  public CustomVariable getCustomAttribute(String paramString)
  {
    return widgetFrame.getCustomAttribute(paramString);
  }
  
  public Set<String> getCustomAttributeNames()
  {
    return widgetFrame.getCustomAttributeNames();
  }
  
  public int getHeight()
  {
    WidgetFrame localWidgetFrame = widgetFrame;
    return bottom - top;
  }
  
  public int getId(String paramString)
  {
    int i = TypedValues.AttributesType.getId(paramString);
    if (i != -1) {
      return i;
    }
    return TypedValues.MotionType.getId(paramString);
  }
  
  public int getLeft()
  {
    return widgetFrame.left;
  }
  
  public String getName()
  {
    return widgetFrame.getId();
  }
  
  public MotionWidget getParent()
  {
    return null;
  }
  
  public float getPivotX()
  {
    return widgetFrame.pivotX;
  }
  
  public float getPivotY()
  {
    return widgetFrame.pivotY;
  }
  
  public int getRight()
  {
    return widgetFrame.right;
  }
  
  public float getRotationX()
  {
    return widgetFrame.rotationX;
  }
  
  public float getRotationY()
  {
    return widgetFrame.rotationY;
  }
  
  public float getRotationZ()
  {
    return widgetFrame.rotationZ;
  }
  
  public float getScaleX()
  {
    return widgetFrame.scaleX;
  }
  
  public float getScaleY()
  {
    return widgetFrame.scaleY;
  }
  
  public int getTop()
  {
    return widgetFrame.top;
  }
  
  public float getTranslationX()
  {
    return widgetFrame.translationX;
  }
  
  public float getTranslationY()
  {
    return widgetFrame.translationY;
  }
  
  public float getTranslationZ()
  {
    return widgetFrame.translationZ;
  }
  
  public float getValueAttributes(int paramInt)
  {
    switch (paramInt)
    {
    case 307: 
    default: 
      return NaN.0F;
    case 316: 
      return mTransitionPathRotate;
    case 315: 
      return mProgress;
    case 314: 
      return widgetFrame.pivotY;
    case 313: 
      return widgetFrame.pivotX;
    case 312: 
      return widgetFrame.scaleY;
    case 311: 
      return widgetFrame.scaleX;
    case 310: 
      return widgetFrame.rotationZ;
    case 309: 
      return widgetFrame.rotationY;
    case 308: 
      return widgetFrame.rotationX;
    case 306: 
      return widgetFrame.translationZ;
    case 305: 
      return widgetFrame.translationY;
    case 304: 
      return widgetFrame.translationX;
    }
    return widgetFrame.alpha;
  }
  
  public int getVisibility()
  {
    return propertySet.visibility;
  }
  
  public WidgetFrame getWidgetFrame()
  {
    return widgetFrame;
  }
  
  public int getWidth()
  {
    WidgetFrame localWidgetFrame = widgetFrame;
    return right - left;
  }
  
  public int getX()
  {
    return widgetFrame.left;
  }
  
  public int getY()
  {
    return widgetFrame.top;
  }
  
  public void layout(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (widgetFrame == null) {
      widgetFrame = new WidgetFrame(null);
    }
    WidgetFrame localWidgetFrame = widgetFrame;
    top = paramInt2;
    left = paramInt1;
    right = paramInt3;
    bottom = paramInt4;
  }
  
  public void setCustomAttribute(String paramString, int paramInt, float paramFloat)
  {
    widgetFrame.setCustomAttribute(paramString, paramInt, paramFloat);
  }
  
  public void setCustomAttribute(String paramString, int paramInt1, int paramInt2)
  {
    widgetFrame.setCustomAttribute(paramString, paramInt1, paramInt2);
  }
  
  public void setCustomAttribute(String paramString1, int paramInt, String paramString2)
  {
    widgetFrame.setCustomAttribute(paramString1, paramInt, paramString2);
  }
  
  public void setCustomAttribute(String paramString, int paramInt, boolean paramBoolean)
  {
    widgetFrame.setCustomAttribute(paramString, paramInt, paramBoolean);
  }
  
  public void setInterpolatedValue(CustomAttribute paramCustomAttribute, float[] paramArrayOfFloat)
  {
    widgetFrame.setCustomAttribute(mName, 901, paramArrayOfFloat[0]);
  }
  
  public void setPivotX(float paramFloat)
  {
    widgetFrame.pivotX = paramFloat;
  }
  
  public void setPivotY(float paramFloat)
  {
    widgetFrame.pivotY = paramFloat;
  }
  
  public void setRotationX(float paramFloat)
  {
    widgetFrame.rotationX = paramFloat;
  }
  
  public void setRotationY(float paramFloat)
  {
    widgetFrame.rotationY = paramFloat;
  }
  
  public void setRotationZ(float paramFloat)
  {
    widgetFrame.rotationZ = paramFloat;
  }
  
  public void setScaleX(float paramFloat)
  {
    widgetFrame.scaleX = paramFloat;
  }
  
  public void setScaleY(float paramFloat)
  {
    widgetFrame.scaleY = paramFloat;
  }
  
  public void setTranslationX(float paramFloat)
  {
    widgetFrame.translationX = paramFloat;
  }
  
  public void setTranslationY(float paramFloat)
  {
    widgetFrame.translationY = paramFloat;
  }
  
  public void setTranslationZ(float paramFloat)
  {
    widgetFrame.translationZ = paramFloat;
  }
  
  public boolean setValue(int paramInt, float paramFloat)
  {
    if (setValueAttributes(paramInt, paramFloat)) {
      return true;
    }
    return setValueMotion(paramInt, paramFloat);
  }
  
  public boolean setValue(int paramInt1, int paramInt2)
  {
    return setValueAttributes(paramInt1, paramInt2);
  }
  
  public boolean setValue(int paramInt, String paramString)
  {
    return setValueMotion(paramInt, paramString);
  }
  
  public boolean setValue(int paramInt, boolean paramBoolean)
  {
    return false;
  }
  
  public boolean setValueAttributes(int paramInt, float paramFloat)
  {
    switch (paramInt)
    {
    case 307: 
    default: 
      return false;
    case 316: 
      mTransitionPathRotate = paramFloat;
      break;
    case 315: 
      mProgress = paramFloat;
      break;
    case 314: 
      widgetFrame.pivotY = paramFloat;
      break;
    case 313: 
      widgetFrame.pivotX = paramFloat;
      break;
    case 312: 
      widgetFrame.scaleY = paramFloat;
      break;
    case 311: 
      widgetFrame.scaleX = paramFloat;
      break;
    case 310: 
      widgetFrame.rotationZ = paramFloat;
      break;
    case 309: 
      widgetFrame.rotationY = paramFloat;
      break;
    case 308: 
      widgetFrame.rotationX = paramFloat;
      break;
    case 306: 
      widgetFrame.translationZ = paramFloat;
      break;
    case 305: 
      widgetFrame.translationY = paramFloat;
      break;
    case 304: 
      widgetFrame.translationX = paramFloat;
      break;
    case 303: 
      widgetFrame.alpha = paramFloat;
    }
    return true;
  }
  
  public boolean setValueMotion(int paramInt, float paramFloat)
  {
    switch (paramInt)
    {
    default: 
      return false;
    case 602: 
      motion.mQuantizeMotionPhase = paramFloat;
      break;
    case 601: 
      motion.mPathRotate = paramFloat;
      break;
    case 600: 
      motion.mMotionStagger = paramFloat;
    }
    return true;
  }
  
  public boolean setValueMotion(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 612: 
      motion.mQuantizeInterpolatorID = paramInt2;
      break;
    case 611: 
      motion.mQuantizeInterpolatorType = paramInt2;
      break;
    case 610: 
      motion.mQuantizeMotionSteps = paramInt2;
      break;
    case 609: 
      motion.mPolarRelativeTo = paramInt2;
      break;
    case 608: 
      motion.mDrawPath = paramInt2;
      break;
    case 607: 
      motion.mPathMotionArc = paramInt2;
      break;
    case 606: 
      motion.mAnimateCircleAngleTo = paramInt2;
      break;
    case 605: 
      motion.mAnimateRelativeTo = paramInt2;
    }
    return true;
  }
  
  public boolean setValueMotion(int paramInt, String paramString)
  {
    if (paramInt != 603)
    {
      if (paramInt != 604) {
        return false;
      }
      motion.mQuantizeInterpolatorString = paramString;
    }
    else
    {
      motion.mTransitionEasing = paramString;
    }
    return true;
  }
  
  public void setVisibility(int paramInt)
  {
    propertySet.visibility = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(widgetFrame.left);
    localStringBuilder.append(", ");
    localStringBuilder.append(widgetFrame.top);
    localStringBuilder.append(", ");
    localStringBuilder.append(widgetFrame.right);
    localStringBuilder.append(", ");
    localStringBuilder.append(widgetFrame.bottom);
    return localStringBuilder.toString();
  }
  
  public static class Motion
  {
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final int INTERPOLATOR_UNDEFINED = -3;
    private static final int SPLINE_STRING = -1;
    public int mAnimateCircleAngleTo = 0;
    public int mAnimateRelativeTo = -1;
    public int mDrawPath = 0;
    public float mMotionStagger = NaN.0F;
    public int mPathMotionArc = -1;
    public float mPathRotate = NaN.0F;
    public int mPolarRelativeTo = -1;
    public int mQuantizeInterpolatorID = -1;
    public String mQuantizeInterpolatorString = null;
    public int mQuantizeInterpolatorType = -3;
    public float mQuantizeMotionPhase = NaN.0F;
    public int mQuantizeMotionSteps = -1;
    public String mTransitionEasing = null;
  }
  
  public static class PropertySet
  {
    public float alpha = 1.0F;
    public float mProgress = NaN.0F;
    public int mVisibilityMode = 0;
    public int visibility = 4;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.MotionWidget
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */