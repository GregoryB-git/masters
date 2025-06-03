package androidx.constraintlayout.widget;

import a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import z2;

public class ConstraintAttribute
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
  
  public ConstraintAttribute(ConstraintAttribute paramConstraintAttribute, Object paramObject)
  {
    mMethod = false;
    mName = mName;
    mType = mType;
    setValue(paramObject);
  }
  
  public ConstraintAttribute(String paramString, AttributeType paramAttributeType)
  {
    mMethod = false;
    mName = paramString;
    mType = paramAttributeType;
  }
  
  public ConstraintAttribute(String paramString, AttributeType paramAttributeType, Object paramObject, boolean paramBoolean)
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
  
  public static HashMap<String, ConstraintAttribute> extractAttributes(HashMap<String, ConstraintAttribute> paramHashMap, View paramView)
  {
    HashMap localHashMap = new HashMap();
    Class localClass = paramView.getClass();
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      ConstraintAttribute localConstraintAttribute1 = (ConstraintAttribute)paramHashMap.get(str);
      try
      {
        Object localObject;
        if (str.equals("BackgroundColor"))
        {
          int i = ((ColorDrawable)paramView.getBackground()).getColor();
          localObject = new androidx/constraintlayout/widget/ConstraintAttribute;
          ((ConstraintAttribute)localObject).<init>(localConstraintAttribute1, Integer.valueOf(i));
          localHashMap.put(str, localObject);
        }
        else
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          ((StringBuilder)localObject).append("getMap");
          ((StringBuilder)localObject).append(str);
          localObject = localClass.getMethod(((StringBuilder)localObject).toString(), new Class[0]).invoke(paramView, new Object[0]);
          ConstraintAttribute localConstraintAttribute2 = new androidx/constraintlayout/widget/ConstraintAttribute;
          localConstraintAttribute2.<init>(localConstraintAttribute1, localObject);
          localHashMap.put(str, localConstraintAttribute2);
        }
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        localInvocationTargetException.printStackTrace();
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        localIllegalAccessException.printStackTrace();
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        localNoSuchMethodException.printStackTrace();
      }
    }
    return localHashMap;
  }
  
  public static void parse(Context paramContext, XmlPullParser paramXmlPullParser, HashMap<String, ConstraintAttribute> paramHashMap)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(Xml.asAttributeSet(paramXmlPullParser), R.styleable.CustomAttribute);
    int i = localTypedArray.getIndexCount();
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = localObject2;
    int j = 0;
    int i1;
    for (int k = j; j < i; k = i1)
    {
      int m = localTypedArray.getIndex(j);
      Object localObject4;
      Object localObject5;
      if (m == R.styleable.CustomAttribute_attributeName)
      {
        localObject1 = localTypedArray.getString(m);
        paramXmlPullParser = (XmlPullParser)localObject1;
        localObject4 = localObject2;
        localObject5 = localObject3;
        int n = k;
        if (localObject1 != null)
        {
          paramXmlPullParser = (XmlPullParser)localObject1;
          localObject4 = localObject2;
          localObject5 = localObject3;
          n = k;
          if (((String)localObject1).length() > 0)
          {
            paramXmlPullParser = new StringBuilder();
            paramXmlPullParser.append(Character.toUpperCase(((String)localObject1).charAt(0)));
            paramXmlPullParser.append(((String)localObject1).substring(1));
            paramXmlPullParser = paramXmlPullParser.toString();
            localObject4 = localObject2;
            localObject5 = localObject3;
            n = k;
          }
        }
      }
      else if (m == R.styleable.CustomAttribute_methodName)
      {
        paramXmlPullParser = localTypedArray.getString(m);
        i1 = 1;
        localObject4 = localObject2;
        localObject5 = localObject3;
      }
      else if (m == R.styleable.CustomAttribute_customBoolean)
      {
        localObject4 = Boolean.valueOf(localTypedArray.getBoolean(m, false));
        localObject5 = AttributeType.BOOLEAN_TYPE;
        paramXmlPullParser = (XmlPullParser)localObject1;
        i1 = k;
      }
      else
      {
        if (m == R.styleable.CustomAttribute_customColorValue)
        {
          paramXmlPullParser = AttributeType.COLOR_TYPE;
          localObject4 = Integer.valueOf(localTypedArray.getColor(m, 0));
        }
        for (;;)
        {
          localObject5 = paramXmlPullParser;
          paramXmlPullParser = (XmlPullParser)localObject1;
          i1 = k;
          break;
          if (m == R.styleable.CustomAttribute_customColorDrawableValue)
          {
            paramXmlPullParser = AttributeType.COLOR_DRAWABLE_TYPE;
            localObject4 = Integer.valueOf(localTypedArray.getColor(m, 0));
          }
          else if (m == R.styleable.CustomAttribute_customPixelDimension)
          {
            paramXmlPullParser = AttributeType.DIMENSION_TYPE;
            localObject4 = Float.valueOf(TypedValue.applyDimension(1, localTypedArray.getDimension(m, 0.0F), paramContext.getResources().getDisplayMetrics()));
          }
          else if (m == R.styleable.CustomAttribute_customDimension)
          {
            paramXmlPullParser = AttributeType.DIMENSION_TYPE;
            localObject4 = Float.valueOf(localTypedArray.getDimension(m, 0.0F));
          }
          else if (m == R.styleable.CustomAttribute_customFloatValue)
          {
            paramXmlPullParser = AttributeType.FLOAT_TYPE;
            localObject4 = Float.valueOf(localTypedArray.getFloat(m, NaN.0F));
          }
          else if (m == R.styleable.CustomAttribute_customIntegerValue)
          {
            paramXmlPullParser = AttributeType.INT_TYPE;
            localObject4 = Integer.valueOf(localTypedArray.getInteger(m, -1));
          }
          else if (m == R.styleable.CustomAttribute_customStringValue)
          {
            paramXmlPullParser = AttributeType.STRING_TYPE;
            localObject4 = localTypedArray.getString(m);
          }
          else
          {
            paramXmlPullParser = (XmlPullParser)localObject1;
            localObject4 = localObject2;
            localObject5 = localObject3;
            i1 = k;
            if (m != R.styleable.CustomAttribute_customReference) {
              break;
            }
            paramXmlPullParser = AttributeType.REFERENCE_TYPE;
            int i2 = localTypedArray.getResourceId(m, -1);
            i1 = i2;
            if (i2 == -1) {
              i1 = localTypedArray.getInt(m, -1);
            }
            localObject4 = Integer.valueOf(i1);
          }
        }
      }
      j++;
      localObject1 = paramXmlPullParser;
      localObject2 = localObject4;
      localObject3 = localObject5;
    }
    if ((localObject1 != null) && (localObject2 != null)) {
      paramHashMap.put(localObject1, new ConstraintAttribute((String)localObject1, (AttributeType)localObject3, localObject2, k));
    }
    localTypedArray.recycle();
  }
  
  public static void setAttributes(View paramView, HashMap<String, ConstraintAttribute> paramHashMap)
  {
    Class localClass = paramView.getClass();
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (String)localIterator.next();
      ConstraintAttribute localConstraintAttribute = (ConstraintAttribute)paramHashMap.get(localObject1);
      Object localObject2;
      if (!mMethod) {
        localObject2 = z2.o("set", (String)localObject1);
      } else {
        localObject2 = localObject1;
      }
      try
      {
        switch (1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[mType.ordinal()])
        {
        default: 
          break;
        case 8: 
          localClass.getMethod((String)localObject2, new Class[] { Float.TYPE }).invoke(paramView, new Object[] { Float.valueOf(mFloatValue) });
          break;
        case 7: 
          localClass.getMethod((String)localObject2, new Class[] { Float.TYPE }).invoke(paramView, new Object[] { Float.valueOf(mFloatValue) });
          break;
        case 6: 
          localClass.getMethod((String)localObject2, new Class[] { Integer.TYPE }).invoke(paramView, new Object[] { Integer.valueOf(mIntegerValue) });
          break;
        case 5: 
          Method localMethod = localClass.getMethod((String)localObject2, new Class[] { Drawable.class });
          ColorDrawable localColorDrawable = new android/graphics/drawable/ColorDrawable;
          localColorDrawable.<init>();
          localColorDrawable.setColor(mColorValue);
          localMethod.invoke(paramView, new Object[] { localColorDrawable });
          break;
        case 4: 
          localClass.getMethod((String)localObject2, new Class[] { Integer.TYPE }).invoke(paramView, new Object[] { Integer.valueOf(mColorValue) });
          break;
        case 3: 
          localClass.getMethod((String)localObject2, new Class[] { CharSequence.class }).invoke(paramView, new Object[] { mStringValue });
          break;
        case 2: 
          localClass.getMethod((String)localObject2, new Class[] { Boolean.TYPE }).invoke(paramView, new Object[] { Boolean.valueOf(mBooleanValue) });
          break;
        case 1: 
          localClass.getMethod((String)localObject2, new Class[] { Integer.TYPE }).invoke(paramView, new Object[] { Integer.valueOf(mIntegerValue) });
        }
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        localObject1 = a.s(" Custom Attribute \"", (String)localObject1, "\" not found on ");
        ((StringBuilder)localObject1).append(localClass.getName());
        Log.e("TransitionLayout", ((StringBuilder)localObject1).toString());
        localInvocationTargetException.printStackTrace();
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        localObject1 = a.s(" Custom Attribute \"", (String)localObject1, "\" not found on ");
        ((StringBuilder)localObject1).append(localClass.getName());
        Log.e("TransitionLayout", ((StringBuilder)localObject1).toString());
        localIllegalAccessException.printStackTrace();
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        Log.e("TransitionLayout", localNoSuchMethodException.getMessage());
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(" Custom Attribute \"");
        localStringBuilder.append((String)localObject1);
        localStringBuilder.append("\" not found on ");
        localStringBuilder.append(localClass.getName());
        Log.e("TransitionLayout", localStringBuilder.toString());
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append(localClass.getName());
        ((StringBuilder)localObject1).append(" must have a method ");
        ((StringBuilder)localObject1).append(localIllegalAccessException);
        Log.e("TransitionLayout", ((StringBuilder)localObject1).toString());
      }
    }
  }
  
  public void applyCustom(View paramView)
  {
    Class localClass = paramView.getClass();
    String str = mName;
    Object localObject;
    if (!mMethod) {
      localObject = z2.o("set", str);
    } else {
      localObject = str;
    }
    try
    {
      switch (1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[mType.ordinal()])
      {
      default: 
        break;
      case 8: 
        localClass.getMethod((String)localObject, new Class[] { Float.TYPE }).invoke(paramView, new Object[] { Float.valueOf(mFloatValue) });
        break;
      case 7: 
        localClass.getMethod((String)localObject, new Class[] { Float.TYPE }).invoke(paramView, new Object[] { Float.valueOf(mFloatValue) });
        break;
      case 5: 
        Method localMethod = localClass.getMethod((String)localObject, new Class[] { Drawable.class });
        ColorDrawable localColorDrawable = new android/graphics/drawable/ColorDrawable;
        localColorDrawable.<init>();
        localColorDrawable.setColor(mColorValue);
        localMethod.invoke(paramView, new Object[] { localColorDrawable });
        break;
      case 4: 
        localClass.getMethod((String)localObject, new Class[] { Integer.TYPE }).invoke(paramView, new Object[] { Integer.valueOf(mColorValue) });
        break;
      case 3: 
        localClass.getMethod((String)localObject, new Class[] { CharSequence.class }).invoke(paramView, new Object[] { mStringValue });
        break;
      case 2: 
        localClass.getMethod((String)localObject, new Class[] { Boolean.TYPE }).invoke(paramView, new Object[] { Boolean.valueOf(mBooleanValue) });
        break;
      case 1: 
      case 6: 
        localClass.getMethod((String)localObject, new Class[] { Integer.TYPE }).invoke(paramView, new Object[] { Integer.valueOf(mIntegerValue) });
      }
    }
    catch (InvocationTargetException paramView)
    {
      localObject = a.s(" Custom Attribute \"", str, "\" not found on ");
      ((StringBuilder)localObject).append(localClass.getName());
      Log.e("TransitionLayout", ((StringBuilder)localObject).toString());
      paramView.printStackTrace();
    }
    catch (IllegalAccessException paramView)
    {
      localObject = a.s(" Custom Attribute \"", str, "\" not found on ");
      ((StringBuilder)localObject).append(localClass.getName());
      Log.e("TransitionLayout", ((StringBuilder)localObject).toString());
      paramView.printStackTrace();
    }
    catch (NoSuchMethodException paramView)
    {
      Log.e("TransitionLayout", paramView.getMessage());
      paramView = new StringBuilder();
      paramView.append(" Custom Attribute \"");
      paramView.append(str);
      paramView.append("\" not found on ");
      paramView.append(localClass.getName());
      Log.e("TransitionLayout", paramView.toString());
      paramView = new StringBuilder();
      paramView.append(localClass.getName());
      paramView.append(" must have a method ");
      paramView.append((String)localObject);
      Log.e("TransitionLayout", paramView.toString());
    }
  }
  
  public boolean diff(ConstraintAttribute paramConstraintAttribute)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    boolean bool7 = bool5;
    if (paramConstraintAttribute != null)
    {
      AttributeType localAttributeType = mType;
      if (localAttributeType != mType)
      {
        bool7 = bool5;
      }
      else
      {
        switch (1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[localAttributeType.ordinal()])
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
  
  public int getColorValue()
  {
    return mColorValue;
  }
  
  public float getFloatValue()
  {
    return mFloatValue;
  }
  
  public int getIntegerValue()
  {
    return mIntegerValue;
  }
  
  public String getName()
  {
    return mName;
  }
  
  public String getStringValue()
  {
    return mStringValue;
  }
  
  public AttributeType getType()
  {
    return mType;
  }
  
  public float getValueToInterpolate()
  {
    switch (1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[mType.ordinal()])
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
    switch (1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[mType.ordinal()])
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
  
  public boolean isBooleanValue()
  {
    return mBooleanValue;
  }
  
  public boolean isContinuous()
  {
    int i = 1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[mType.ordinal()];
    return (i != 1) && (i != 2) && (i != 3);
  }
  
  public boolean isMethod()
  {
    return mMethod;
  }
  
  public int numberOfInterpolatedValues()
  {
    int i = 1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[mType.ordinal()];
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
    switch (1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[mType.ordinal()])
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
    int i = 1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[mType.ordinal()];
    boolean bool = false;
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
      i = Color.HSVToColor(paramArrayOfFloat);
      mColorValue = i;
      mColorValue = (clamp((int)(paramArrayOfFloat[3] * 255.0F)) << 24 | i & 0xFFFFFF);
      break;
    case 3: 
      throw new RuntimeException("Color does not have a single color to interpolate");
    case 2: 
      if (paramArrayOfFloat[0] > 0.5D) {
        bool = true;
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
      FLOAT_TYPE = new AttributeType("FLOAT_TYPE", 1);
      COLOR_TYPE = new AttributeType("COLOR_TYPE", 2);
      COLOR_DRAWABLE_TYPE = new AttributeType("COLOR_DRAWABLE_TYPE", 3);
      STRING_TYPE = new AttributeType("STRING_TYPE", 4);
      BOOLEAN_TYPE = new AttributeType("BOOLEAN_TYPE", 5);
      DIMENSION_TYPE = new AttributeType("DIMENSION_TYPE", 6);
      REFERENCE_TYPE = new AttributeType("REFERENCE_TYPE", 7);
    }
    
    private AttributeType() {}
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintAttribute
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */