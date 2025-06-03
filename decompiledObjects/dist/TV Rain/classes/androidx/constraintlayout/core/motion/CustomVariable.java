package androidx.constraintlayout.core.motion;

import a;
import z2;

public class CustomVariable
{
  private static final String TAG = "TransitionLayout";
  public boolean mBooleanValue;
  private float mFloatValue;
  private int mIntegerValue = Integer.MIN_VALUE;
  public String mName;
  private String mStringValue;
  private int mType;
  
  public CustomVariable(CustomVariable paramCustomVariable)
  {
    mFloatValue = NaN.0F;
    mStringValue = null;
    mName = mName;
    mType = mType;
    mIntegerValue = mIntegerValue;
    mFloatValue = mFloatValue;
    mStringValue = mStringValue;
    mBooleanValue = mBooleanValue;
  }
  
  public CustomVariable(CustomVariable paramCustomVariable, Object paramObject)
  {
    mFloatValue = NaN.0F;
    mStringValue = null;
    mName = mName;
    mType = mType;
    setValue(paramObject);
  }
  
  public CustomVariable(String paramString, int paramInt)
  {
    mFloatValue = NaN.0F;
    mStringValue = null;
    mName = paramString;
    mType = paramInt;
  }
  
  public CustomVariable(String paramString, int paramInt, float paramFloat)
  {
    mStringValue = null;
    mName = paramString;
    mType = paramInt;
    mFloatValue = paramFloat;
  }
  
  public CustomVariable(String paramString, int paramInt1, int paramInt2)
  {
    mFloatValue = NaN.0F;
    mStringValue = null;
    mName = paramString;
    mType = paramInt1;
    if (paramInt1 == 901) {
      mFloatValue = paramInt2;
    } else {
      mIntegerValue = paramInt2;
    }
  }
  
  public CustomVariable(String paramString, int paramInt, Object paramObject)
  {
    mFloatValue = NaN.0F;
    mStringValue = null;
    mName = paramString;
    mType = paramInt;
    setValue(paramObject);
  }
  
  public CustomVariable(String paramString1, int paramInt, String paramString2)
  {
    mFloatValue = NaN.0F;
    mName = paramString1;
    mType = paramInt;
    mStringValue = paramString2;
  }
  
  public CustomVariable(String paramString, int paramInt, boolean paramBoolean)
  {
    mFloatValue = NaN.0F;
    mStringValue = null;
    mName = paramString;
    mType = paramInt;
    mBooleanValue = paramBoolean;
  }
  
  private static int clamp(int paramInt)
  {
    paramInt = (paramInt & paramInt >> 31) - 255;
    return (paramInt & paramInt >> 31) + 255;
  }
  
  public static String colorString(int paramInt)
  {
    StringBuilder localStringBuilder = z2.t("00000000");
    localStringBuilder.append(Integer.toHexString(paramInt));
    String str = localStringBuilder.toString();
    localStringBuilder = z2.t("#");
    localStringBuilder.append(str.substring(str.length() - 8));
    return localStringBuilder.toString();
  }
  
  public static int hsvToRgb(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramFloat1 *= 6.0F;
    int i = (int)paramFloat1;
    paramFloat1 -= i;
    paramFloat3 *= 255.0F;
    int j = (int)a.a(1.0F, paramFloat2, paramFloat3, 0.5F);
    int k = (int)((1.0F - paramFloat1 * paramFloat2) * paramFloat3 + 0.5F);
    int m = (int)((1.0F - (1.0F - paramFloat1) * paramFloat2) * paramFloat3 + 0.5F);
    int n = (int)(paramFloat3 + 0.5F);
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4)
            {
              if (i != 5) {
                return 0;
              }
              return (n << 16) + (j << 8) + k | 0xFF000000;
            }
            return (m << 16) + (j << 8) + n | 0xFF000000;
          }
          return (j << 16) + (k << 8) + n | 0xFF000000;
        }
        return (j << 16) + (n << 8) + m | 0xFF000000;
      }
      return (k << 16) + (n << 8) + j | 0xFF000000;
    }
    return (n << 16) + (m << 8) + j | 0xFF000000;
  }
  
  public static int rgbaTocColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    int i = clamp((int)(paramFloat1 * 255.0F));
    int j = clamp((int)(paramFloat2 * 255.0F));
    int k = clamp((int)(paramFloat3 * 255.0F));
    return i << 16 | clamp((int)(paramFloat4 * 255.0F)) << 24 | j << 8 | k;
  }
  
  public void applyToWidget(MotionWidget paramMotionWidget)
  {
    int i = mType;
    switch (i)
    {
    default: 
      break;
    case 904: 
      paramMotionWidget.setCustomAttribute(mName, i, mBooleanValue);
      break;
    case 903: 
      paramMotionWidget.setCustomAttribute(mName, i, mStringValue);
      break;
    case 901: 
    case 905: 
      paramMotionWidget.setCustomAttribute(mName, i, mFloatValue);
      break;
    case 900: 
    case 902: 
    case 906: 
      paramMotionWidget.setCustomAttribute(mName, i, mIntegerValue);
    }
  }
  
  public CustomVariable copy()
  {
    return new CustomVariable(this);
  }
  
  public boolean diff(CustomVariable paramCustomVariable)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    boolean bool7 = bool5;
    if (paramCustomVariable != null)
    {
      int i = mType;
      if (i != mType)
      {
        bool7 = bool5;
      }
      else
      {
        switch (i)
        {
        default: 
          return false;
        case 905: 
          bool7 = bool6;
          if (mFloatValue == mFloatValue) {
            bool7 = true;
          }
          return bool7;
        case 904: 
          bool7 = bool1;
          if (mBooleanValue == mBooleanValue) {
            bool7 = true;
          }
          return bool7;
        case 903: 
          bool7 = bool2;
          if (mIntegerValue == mIntegerValue) {
            bool7 = true;
          }
          return bool7;
        case 902: 
          bool7 = bool3;
          if (mIntegerValue == mIntegerValue) {
            bool7 = true;
          }
          return bool7;
        case 901: 
          bool7 = bool4;
          if (mFloatValue == mFloatValue) {
            bool7 = true;
          }
          return bool7;
        }
        bool7 = bool5;
        if (mIntegerValue == mIntegerValue) {
          bool7 = true;
        }
      }
    }
    return bool7;
  }
  
  public boolean getBooleanValue()
  {
    return mBooleanValue;
  }
  
  public int getColorValue()
  {
    return mIntegerValue;
  }
  
  public float getFloatValue()
  {
    return mFloatValue;
  }
  
  public int getIntegerValue()
  {
    return mIntegerValue;
  }
  
  public int getInterpolatedColor(float[] paramArrayOfFloat)
  {
    int i = clamp((int)((float)Math.pow(paramArrayOfFloat[0], 0.45454545454545453D) * 255.0F));
    int j = clamp((int)((float)Math.pow(paramArrayOfFloat[1], 0.45454545454545453D) * 255.0F));
    int k = clamp((int)((float)Math.pow(paramArrayOfFloat[2], 0.45454545454545453D) * 255.0F));
    return clamp((int)(paramArrayOfFloat[3] * 255.0F)) << 24 | i << 16 | j << 8 | k;
  }
  
  public String getName()
  {
    return mName;
  }
  
  public String getStringValue()
  {
    return mStringValue;
  }
  
  public int getType()
  {
    return mType;
  }
  
  public float getValueToInterpolate()
  {
    switch (mType)
    {
    default: 
      return NaN.0F;
    case 905: 
      return mFloatValue;
    case 904: 
      float f;
      if (mBooleanValue) {
        f = 1.0F;
      } else {
        f = 0.0F;
      }
      return f;
    case 903: 
      throw new RuntimeException("Cannot interpolate String");
    case 902: 
      throw new RuntimeException("Color does not have a single color to interpolate");
    case 901: 
      return mFloatValue;
    }
    return mIntegerValue;
  }
  
  public void getValuesToInterpolate(float[] paramArrayOfFloat)
  {
    float f1;
    switch (mType)
    {
    default: 
      break;
    case 905: 
      paramArrayOfFloat[0] = mFloatValue;
      break;
    case 904: 
      if (mBooleanValue) {
        f1 = 1.0F;
      } else {
        f1 = 0.0F;
      }
      paramArrayOfFloat[0] = f1;
      break;
    case 903: 
      throw new RuntimeException("Cannot interpolate String");
    case 902: 
      int i = mIntegerValue;
      f1 = (float)Math.pow((i >> 16 & 0xFF) / 255.0F, 2.2D);
      float f2 = (float)Math.pow((i >> 8 & 0xFF) / 255.0F, 2.2D);
      float f3 = (float)Math.pow((i & 0xFF) / 255.0F, 2.2D);
      paramArrayOfFloat[0] = f1;
      paramArrayOfFloat[1] = f2;
      paramArrayOfFloat[2] = f3;
      paramArrayOfFloat[3] = ((i >> 24 & 0xFF) / 255.0F);
      break;
    case 901: 
      paramArrayOfFloat[0] = mFloatValue;
      break;
    case 900: 
      paramArrayOfFloat[0] = mIntegerValue;
    }
  }
  
  public boolean isContinuous()
  {
    int i = mType;
    return (i != 903) && (i != 904) && (i != 906);
  }
  
  public int numberOfInterpolatedValues()
  {
    if (mType != 902) {
      return 1;
    }
    return 4;
  }
  
  public void setBooleanValue(boolean paramBoolean)
  {
    mBooleanValue = paramBoolean;
  }
  
  public void setFloatValue(float paramFloat)
  {
    mFloatValue = paramFloat;
  }
  
  public void setIntValue(int paramInt)
  {
    mIntegerValue = paramInt;
  }
  
  public void setInterpolatedValue(MotionWidget paramMotionWidget, float[] paramArrayOfFloat)
  {
    int i = mType;
    boolean bool = true;
    switch (i)
    {
    default: 
      break;
    case 904: 
      String str = mName;
      if (paramArrayOfFloat[0] <= 0.5F) {
        bool = false;
      }
      paramMotionWidget.setCustomAttribute(str, i, bool);
      break;
    case 903: 
    case 906: 
      paramMotionWidget = z2.t("unable to interpolate ");
      paramMotionWidget.append(mName);
      throw new RuntimeException(paramMotionWidget.toString());
    case 902: 
      int j = clamp((int)((float)Math.pow(paramArrayOfFloat[0], 0.45454545454545453D) * 255.0F));
      i = clamp((int)((float)Math.pow(paramArrayOfFloat[1], 0.45454545454545453D) * 255.0F));
      int k = clamp((int)((float)Math.pow(paramArrayOfFloat[2], 0.45454545454545453D) * 255.0F));
      int m = clamp((int)(paramArrayOfFloat[3] * 255.0F));
      paramMotionWidget.setCustomAttribute(mName, mType, m << 24 | j << 16 | i << 8 | k);
      break;
    case 901: 
    case 905: 
      paramMotionWidget.setCustomAttribute(mName, i, paramArrayOfFloat[0]);
      break;
    case 900: 
      paramMotionWidget.setCustomAttribute(mName, i, (int)paramArrayOfFloat[0]);
    }
  }
  
  public void setStringValue(String paramString)
  {
    mStringValue = paramString;
  }
  
  public void setValue(Object paramObject)
  {
    switch (mType)
    {
    default: 
      break;
    case 905: 
      mFloatValue = ((Float)paramObject).floatValue();
      break;
    case 904: 
      mBooleanValue = ((Boolean)paramObject).booleanValue();
      break;
    case 903: 
      mStringValue = ((String)paramObject);
      break;
    case 902: 
      mIntegerValue = ((Integer)paramObject).intValue();
      break;
    case 901: 
      mFloatValue = ((Float)paramObject).floatValue();
      break;
    case 900: 
    case 906: 
      mIntegerValue = ((Integer)paramObject).intValue();
    }
  }
  
  public void setValue(float[] paramArrayOfFloat)
  {
    int i = mType;
    boolean bool = true;
    switch (i)
    {
    default: 
      break;
    case 904: 
      if (paramArrayOfFloat[0] <= 0.5D) {
        bool = false;
      }
      mBooleanValue = bool;
      break;
    case 903: 
      throw new RuntimeException("Cannot interpolate String");
    case 902: 
      float f1 = paramArrayOfFloat[0];
      float f2 = paramArrayOfFloat[1];
      float f3 = paramArrayOfFloat[2];
      i = Math.round((float)Math.pow(f1, 0.5D) * 255.0F);
      int j = Math.round((float)Math.pow(f2, 0.5D) * 255.0F);
      int k = Math.round((float)Math.pow(f3, 0.5D) * 255.0F);
      mIntegerValue = ((Math.round(paramArrayOfFloat[3] * 255.0F) & 0xFF) << 24 | (i & 0xFF) << 16 | (j & 0xFF) << 8 | k & 0xFF);
      break;
    case 901: 
    case 905: 
      mFloatValue = paramArrayOfFloat[0];
      break;
    case 900: 
    case 906: 
      mIntegerValue = ((int)paramArrayOfFloat[0]);
    }
  }
  
  public String toString()
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(mName);
    ((StringBuilder)localObject).append(':');
    localObject = ((StringBuilder)localObject).toString();
    switch (mType)
    {
    default: 
      return z2.o((String)localObject, "????");
    case 905: 
      localObject = z2.t((String)localObject);
      ((StringBuilder)localObject).append(mFloatValue);
      return ((StringBuilder)localObject).toString();
    case 904: 
      localObject = z2.t((String)localObject);
      ((StringBuilder)localObject).append(Boolean.valueOf(mBooleanValue));
      return ((StringBuilder)localObject).toString();
    case 903: 
      localObject = z2.t((String)localObject);
      ((StringBuilder)localObject).append(mStringValue);
      return ((StringBuilder)localObject).toString();
    case 902: 
      localObject = z2.t((String)localObject);
      ((StringBuilder)localObject).append(colorString(mIntegerValue));
      return ((StringBuilder)localObject).toString();
    case 901: 
      localObject = z2.t((String)localObject);
      ((StringBuilder)localObject).append(mFloatValue);
      return ((StringBuilder)localObject).toString();
    }
    localObject = z2.t((String)localObject);
    ((StringBuilder)localObject).append(mIntegerValue);
    return ((StringBuilder)localObject).toString();
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.CustomVariable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */