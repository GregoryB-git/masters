package androidx.constraintlayout.core.motion;

import a;

public class CustomAttribute
{
  private static final String TAG = "TransitionLayout";
  public boolean mBooleanValue;
  private int mColorValue;
  private float mFloatValue;
  private int mIntegerValue;
  private boolean mMethod;
  public String mName;
  private String mStringValue;
  private AttributeType mType;
  
  public CustomAttribute(CustomAttribute paramCustomAttribute, Object paramObject)
  {
    mMethod = false;
    mName = mName;
    mType = mType;
    setValue(paramObject);
  }
  
  public CustomAttribute(String paramString, AttributeType paramAttributeType)
  {
    mMethod = false;
    mName = paramString;
    mType = paramAttributeType;
  }
  
  public CustomAttribute(String paramString, AttributeType paramAttributeType, Object paramObject, boolean paramBoolean)
  {
    mName = paramString;
    mType = paramAttributeType;
    mMethod = paramBoolean;
    setValue(paramObject);
  }
  
  private static int clamp(int paramInt)
  {
    paramInt = (paramInt & paramInt >> 31) - 255;
    return (paramInt & paramInt >> 31) + 255;
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
  
  public boolean diff(CustomAttribute paramCustomAttribute)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    boolean bool7 = bool5;
    if (paramCustomAttribute != null)
    {
      AttributeType localAttributeType = mType;
      if (localAttributeType != mType)
      {
        bool7 = bool5;
      }
      else
      {
        switch (1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[localAttributeType.ordinal()])
        {
        default: 
          return false;
        case 8: 
          bool7 = bool6;
          if (mFloatValue == mFloatValue) {
            bool7 = true;
          }
          return bool7;
        case 7: 
          bool7 = bool1;
          if (mFloatValue == mFloatValue) {
            bool7 = true;
          }
          return bool7;
        case 4: 
        case 5: 
          bool7 = bool2;
          if (mColorValue == mColorValue) {
            bool7 = true;
          }
          return bool7;
        case 3: 
          bool7 = bool3;
          if (mIntegerValue == mIntegerValue) {
            bool7 = true;
          }
          return bool7;
        case 2: 
          bool7 = bool4;
          if (mBooleanValue == mBooleanValue) {
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
  
  public AttributeType getType()
  {
    return mType;
  }
  
  public float getValueToInterpolate()
  {
    switch (1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[mType.ordinal()])
    {
    default: 
      return NaN.0F;
    case 8: 
      return mFloatValue;
    case 7: 
      return mFloatValue;
    case 6: 
      return mIntegerValue;
    case 4: 
    case 5: 
      throw new RuntimeException("Color does not have a single color to interpolate");
    case 3: 
      throw new RuntimeException("Cannot interpolate String");
    }
    float f;
    if (mBooleanValue) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    return f;
  }
  
  public void getValuesToInterpolate(float[] paramArrayOfFloat)
  {
    float f2;
    switch (1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[mType.ordinal()])
    {
    default: 
      break;
    case 8: 
      paramArrayOfFloat[0] = mFloatValue;
      break;
    case 7: 
      paramArrayOfFloat[0] = mFloatValue;
      break;
    case 6: 
      paramArrayOfFloat[0] = mIntegerValue;
      break;
    case 4: 
    case 5: 
      int i = mColorValue;
      float f1 = (float)Math.pow((i >> 16 & 0xFF) / 255.0F, 2.2D);
      f2 = (float)Math.pow((i >> 8 & 0xFF) / 255.0F, 2.2D);
      float f3 = (float)Math.pow((i & 0xFF) / 255.0F, 2.2D);
      paramArrayOfFloat[0] = f1;
      paramArrayOfFloat[1] = f2;
      paramArrayOfFloat[2] = f3;
      paramArrayOfFloat[3] = ((i >> 24 & 0xFF) / 255.0F);
      break;
    case 3: 
      throw new RuntimeException("Color does not have a single color to interpolate");
    case 2: 
      if (mBooleanValue) {
        f2 = 1.0F;
      } else {
        f2 = 0.0F;
      }
      paramArrayOfFloat[0] = f2;
    }
  }
  
  public boolean isContinuous()
  {
    int i = 1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[mType.ordinal()];
    return (i != 1) && (i != 2) && (i != 3);
  }
  
  public int numberOfInterpolatedValues()
  {
    int i = 1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[mType.ordinal()];
    if ((i != 4) && (i != 5)) {
      return 1;
    }
    return 4;
  }
  
  public void setColorValue(int paramInt)
  {
    mColorValue = paramInt;
  }
  
  public void setFloatValue(float paramFloat)
  {
    mFloatValue = paramFloat;
  }
  
  public void setIntValue(int paramInt)
  {
    mIntegerValue = paramInt;
  }
  
  public void setStringValue(String paramString)
  {
    mStringValue = paramString;
  }
  
  public void setValue(Object paramObject)
  {
    switch (1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[mType.ordinal()])
    {
    default: 
      break;
    case 8: 
      mFloatValue = ((Float)paramObject).floatValue();
      break;
    case 7: 
      mFloatValue = ((Float)paramObject).floatValue();
      break;
    case 4: 
    case 5: 
      mColorValue = ((Integer)paramObject).intValue();
      break;
    case 3: 
      mStringValue = ((String)paramObject);
      break;
    case 2: 
      mBooleanValue = ((Boolean)paramObject).booleanValue();
      break;
    case 1: 
    case 6: 
      mIntegerValue = ((Integer)paramObject).intValue();
    }
  }
  
  public void setValue(float[] paramArrayOfFloat)
  {
    int i = 1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[mType.ordinal()];
    boolean bool = true;
    switch (i)
    {
    default: 
      break;
    case 8: 
      mFloatValue = paramArrayOfFloat[0];
      break;
    case 7: 
      mFloatValue = paramArrayOfFloat[0];
      break;
    case 4: 
    case 5: 
      i = hsvToRgb(paramArrayOfFloat[0], paramArrayOfFloat[1], paramArrayOfFloat[2]);
      mColorValue = i;
      mColorValue = (clamp((int)(paramArrayOfFloat[3] * 255.0F)) << 24 | i & 0xFFFFFF);
      break;
    case 3: 
      throw new RuntimeException("Color does not have a single color to interpolate");
    case 2: 
      if (paramArrayOfFloat[0] <= 0.5D) {
        bool = false;
      }
      mBooleanValue = bool;
      break;
    case 1: 
    case 6: 
      mIntegerValue = ((int)paramArrayOfFloat[0]);
    }
  }
  
  public static enum AttributeType
  {
    static
    {
      AttributeType localAttributeType1 = new AttributeType("INT_TYPE", 0);
      INT_TYPE = localAttributeType1;
      AttributeType localAttributeType2 = new AttributeType("FLOAT_TYPE", 1);
      FLOAT_TYPE = localAttributeType2;
      AttributeType localAttributeType3 = new AttributeType("COLOR_TYPE", 2);
      COLOR_TYPE = localAttributeType3;
      AttributeType localAttributeType4 = new AttributeType("COLOR_DRAWABLE_TYPE", 3);
      COLOR_DRAWABLE_TYPE = localAttributeType4;
      AttributeType localAttributeType5 = new AttributeType("STRING_TYPE", 4);
      STRING_TYPE = localAttributeType5;
      AttributeType localAttributeType6 = new AttributeType("BOOLEAN_TYPE", 5);
      BOOLEAN_TYPE = localAttributeType6;
      AttributeType localAttributeType7 = new AttributeType("DIMENSION_TYPE", 6);
      DIMENSION_TYPE = localAttributeType7;
      AttributeType localAttributeType8 = new AttributeType("REFERENCE_TYPE", 7);
      REFERENCE_TYPE = localAttributeType8;
      $VALUES = new AttributeType[] { localAttributeType1, localAttributeType2, localAttributeType3, localAttributeType4, localAttributeType5, localAttributeType6, localAttributeType7, localAttributeType8 };
    }
    
    private AttributeType() {}
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.CustomAttribute
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */