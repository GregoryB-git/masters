package androidx.constraintlayout.core.state;

import a;
import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.parser.CLContainer;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.io.PrintStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import z2;

public class WidgetFrame
{
  private static final boolean OLD_SYSTEM = true;
  public static float phone_orientation = NaN.0F;
  public float alpha = NaN.0F;
  public int bottom = 0;
  public float interpolatedPos = NaN.0F;
  public int left = 0;
  public final HashMap<String, CustomVariable> mCustom = new HashMap();
  public String name = null;
  public float pivotX = NaN.0F;
  public float pivotY = NaN.0F;
  public int right = 0;
  public float rotationX = NaN.0F;
  public float rotationY = NaN.0F;
  public float rotationZ = NaN.0F;
  public float scaleX = NaN.0F;
  public float scaleY = NaN.0F;
  public int top = 0;
  public float translationX = NaN.0F;
  public float translationY = NaN.0F;
  public float translationZ = NaN.0F;
  public int visibility = 0;
  public ConstraintWidget widget = null;
  
  public WidgetFrame() {}
  
  public WidgetFrame(WidgetFrame paramWidgetFrame)
  {
    widget = widget;
    left = left;
    top = top;
    right = right;
    bottom = bottom;
    updateAttributes(paramWidgetFrame);
  }
  
  public WidgetFrame(ConstraintWidget paramConstraintWidget)
  {
    widget = paramConstraintWidget;
  }
  
  private static void add(StringBuilder paramStringBuilder, String paramString, float paramFloat)
  {
    if (Float.isNaN(paramFloat)) {
      return;
    }
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(": ");
    paramStringBuilder.append(paramFloat);
    paramStringBuilder.append(",\n");
  }
  
  private static void add(StringBuilder paramStringBuilder, String paramString, int paramInt)
  {
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(": ");
    paramStringBuilder.append(paramInt);
    paramStringBuilder.append(",\n");
  }
  
  private static float interpolate(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    boolean bool1 = Float.isNaN(paramFloat1);
    boolean bool2 = Float.isNaN(paramFloat2);
    if ((bool1) && (bool2)) {
      return NaN.0F;
    }
    if (bool1) {
      paramFloat1 = paramFloat3;
    }
    if (bool2) {
      paramFloat2 = paramFloat3;
    }
    return a.a(paramFloat2, paramFloat1, paramFloat4, paramFloat1);
  }
  
  public static void interpolate(int paramInt1, int paramInt2, WidgetFrame paramWidgetFrame1, WidgetFrame paramWidgetFrame2, WidgetFrame paramWidgetFrame3, Transition paramTransition, float paramFloat)
  {
    float f1 = 100.0F * paramFloat;
    int i = (int)f1;
    int j = left;
    int k = top;
    int m = left;
    int n = top;
    int i1 = right;
    int i2 = bottom;
    int i3 = right - m;
    int i4 = bottom - n;
    float f2 = alpha;
    float f3 = alpha;
    if (visibility == 8)
    {
      j = (int)(j - i3 / 2.0F);
      k = (int)(k - i4 / 2.0F);
      if (Float.isNaN(f2))
      {
        i2 = i4;
        i1 = i3;
        f2 = 0.0F;
      }
      else
      {
        i1 = i3;
        i2 = i4;
      }
    }
    else
    {
      i1 -= j;
      i2 -= k;
    }
    float f4 = f3;
    int i5 = m;
    int i6 = n;
    if (visibility == 8)
    {
      int i7 = (int)(m - i1 / 2.0F);
      int i8 = (int)(n - i2 / 2.0F);
      boolean bool = Float.isNaN(f3);
      m = i1;
      n = i2;
      f4 = f3;
      i5 = i7;
      i6 = i8;
      i4 = n;
      i3 = m;
      if (bool)
      {
        f4 = 0.0F;
        i3 = m;
        i4 = n;
        i6 = i8;
        i5 = i7;
      }
    }
    f3 = f2;
    if (Float.isNaN(f2))
    {
      f3 = f2;
      if (!Float.isNaN(f4)) {
        f3 = 1.0F;
      }
    }
    f2 = f4;
    if (!Float.isNaN(f3))
    {
      f2 = f4;
      if (Float.isNaN(f4)) {
        f2 = 1.0F;
      }
    }
    if (visibility == 4) {
      f4 = 0.0F;
    } else {
      f4 = f3;
    }
    if (visibility == 4) {
      f2 = 0.0F;
    }
    Object localObject1;
    if ((widget != null) && (paramTransition.hasPositionKeyframes()))
    {
      localObject1 = paramTransition.findPreviousPosition(widget.stringId, i);
      localObject2 = paramTransition.findNextPosition(widget.stringId, i);
      paramTransition = (Transition)localObject2;
      if (localObject1 == localObject2) {
        paramTransition = null;
      }
      if (localObject1 != null)
      {
        j = (int)(x * paramInt1);
        f3 = y;
        k = (int)(f3 * paramInt2);
        n = frame;
      }
      else
      {
        n = 0;
      }
      if (paramTransition != null)
      {
        i5 = (int)(x * paramInt1);
        i6 = (int)(y * paramInt2);
        paramInt1 = frame;
      }
      else
      {
        paramInt1 = 100;
      }
      f3 = (f1 - n) / (paramInt1 - n);
    }
    else
    {
      f3 = paramFloat;
    }
    widget = widget;
    f1 = j;
    paramInt1 = (int)((i5 - j) * f3 + f1);
    left = paramInt1;
    f1 = k;
    paramInt2 = (int)(f3 * (i6 - k) + f1);
    top = paramInt2;
    f3 = 1.0F - paramFloat;
    f1 = i1;
    i1 = (int)(i3 * paramFloat + f1 * f3);
    f1 = i2;
    i2 = (int)(i4 * paramFloat + f3 * f1);
    right = (paramInt1 + i1);
    bottom = (paramInt2 + i2);
    pivotX = interpolate(pivotX, pivotX, 0.5F, paramFloat);
    pivotY = interpolate(pivotY, pivotY, 0.5F, paramFloat);
    rotationX = interpolate(rotationX, rotationX, 0.0F, paramFloat);
    rotationY = interpolate(rotationY, rotationY, 0.0F, paramFloat);
    rotationZ = interpolate(rotationZ, rotationZ, 0.0F, paramFloat);
    scaleX = interpolate(scaleX, scaleX, 1.0F, paramFloat);
    scaleY = interpolate(scaleY, scaleY, 1.0F, paramFloat);
    translationX = interpolate(translationX, translationX, 0.0F, paramFloat);
    translationY = interpolate(translationY, translationY, 0.0F, paramFloat);
    translationZ = interpolate(translationZ, translationZ, 0.0F, paramFloat);
    alpha = interpolate(f4, f2, 1.0F, paramFloat);
    paramTransition = mCustom.keySet();
    mCustom.clear();
    Object localObject2 = paramTransition.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      Object localObject3 = (String)((Iterator)localObject2).next();
      if (mCustom.containsKey(localObject3))
      {
        CustomVariable localCustomVariable = (CustomVariable)mCustom.get(localObject3);
        localObject1 = (CustomVariable)mCustom.get(localObject3);
        paramTransition = new CustomVariable(localCustomVariable);
        mCustom.put(localObject3, paramTransition);
        if (localCustomVariable.numberOfInterpolatedValues() == 1)
        {
          paramTransition.setValue(Float.valueOf(interpolate(localCustomVariable.getValueToInterpolate(), ((CustomVariable)localObject1).getValueToInterpolate(), 0.0F, paramFloat)));
        }
        else
        {
          paramInt2 = localCustomVariable.numberOfInterpolatedValues();
          localObject3 = new float[paramInt2];
          float[] arrayOfFloat = new float[paramInt2];
          localCustomVariable.getValuesToInterpolate((float[])localObject3);
          ((CustomVariable)localObject1).getValuesToInterpolate(arrayOfFloat);
          for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
          {
            localObject3[paramInt1] = interpolate(localObject3[paramInt1], arrayOfFloat[paramInt1], 0.0F, paramFloat);
            paramTransition.setValue((float[])localObject3);
          }
        }
      }
    }
  }
  
  private void serializeAnchor(StringBuilder paramStringBuilder, ConstraintAnchor.Type paramType)
  {
    ConstraintAnchor localConstraintAnchor = widget.getAnchor(paramType);
    if ((localConstraintAnchor != null) && (mTarget != null))
    {
      paramStringBuilder.append("Anchor");
      paramStringBuilder.append(paramType.name());
      paramStringBuilder.append(": ['");
      String str = mTarget.getOwner().stringId;
      paramType = str;
      if (str == null) {
        paramType = "#PARENT";
      }
      paramStringBuilder.append(paramType);
      paramStringBuilder.append("', '");
      paramStringBuilder.append(mTarget.getType().name());
      paramStringBuilder.append("', '");
      paramStringBuilder.append(mMargin);
      paramStringBuilder.append("'],\n");
    }
  }
  
  public void addCustomColor(String paramString, int paramInt)
  {
    setCustomAttribute(paramString, 902, paramInt);
  }
  
  public void addCustomFloat(String paramString, float paramFloat)
  {
    setCustomAttribute(paramString, 901, paramFloat);
  }
  
  public float centerX()
  {
    int i = left;
    float f = i;
    return (right - i) / 2.0F + f;
  }
  
  public float centerY()
  {
    int i = top;
    float f = i;
    return (bottom - i) / 2.0F + f;
  }
  
  public CustomVariable getCustomAttribute(String paramString)
  {
    return (CustomVariable)mCustom.get(paramString);
  }
  
  public Set<String> getCustomAttributeNames()
  {
    return mCustom.keySet();
  }
  
  public int getCustomColor(String paramString)
  {
    if (mCustom.containsKey(paramString)) {
      return ((CustomVariable)mCustom.get(paramString)).getColorValue();
    }
    return 43656;
  }
  
  public float getCustomFloat(String paramString)
  {
    if (mCustom.containsKey(paramString)) {
      return ((CustomVariable)mCustom.get(paramString)).getFloatValue();
    }
    return NaN.0F;
  }
  
  public String getId()
  {
    ConstraintWidget localConstraintWidget = widget;
    if (localConstraintWidget == null) {
      return "unknown";
    }
    return stringId;
  }
  
  public int height()
  {
    return Math.max(0, bottom - top);
  }
  
  public boolean isDefaultTransform()
  {
    boolean bool;
    if ((Float.isNaN(rotationX)) && (Float.isNaN(rotationY)) && (Float.isNaN(rotationZ)) && (Float.isNaN(translationX)) && (Float.isNaN(translationY)) && (Float.isNaN(translationZ)) && (Float.isNaN(scaleX)) && (Float.isNaN(scaleY)) && (Float.isNaN(alpha))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void logv(String paramString)
  {
    Object localObject = new Throwable().getStackTrace()[1];
    StringBuilder localStringBuilder = z2.t(".(");
    localStringBuilder.append(((StackTraceElement)localObject).getFileName());
    localStringBuilder.append(":");
    localStringBuilder.append(((StackTraceElement)localObject).getLineNumber());
    localStringBuilder.append(") ");
    localStringBuilder.append(((StackTraceElement)localObject).getMethodName());
    localObject = z2.u(localStringBuilder.toString(), " ");
    ((StringBuilder)localObject).append(hashCode() % 1000);
    localObject = ((StringBuilder)localObject).toString();
    if (widget != null)
    {
      localObject = z2.u((String)localObject, "/");
      ((StringBuilder)localObject).append(widget.hashCode() % 1000);
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = z2.o((String)localObject, "/NULL");
    }
    PrintStream localPrintStream = System.out;
    localStringBuilder = new StringBuilder();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(" ");
    localStringBuilder.append(paramString);
    localPrintStream.println(localStringBuilder.toString());
  }
  
  public void parseCustom(CLElement paramCLElement)
    throws CLParsingException
  {
    paramCLElement = (CLObject)paramCLElement;
    int i = paramCLElement.size();
    for (int j = 0; j < i; j++)
    {
      CLKey localCLKey = (CLKey)paramCLElement.get(j);
      localCLKey.content();
      CLElement localCLElement = localCLKey.getValue();
      String str = localCLElement.content();
      if (str.matches("#[0-9a-fA-F]+"))
      {
        int k = Integer.parseInt(str.substring(1), 16);
        setCustomAttribute(localCLKey.content(), 902, k);
      }
      else if ((localCLElement instanceof CLNumber))
      {
        setCustomAttribute(localCLKey.content(), 901, localCLElement.getFloat());
      }
      else
      {
        setCustomAttribute(localCLKey.content(), 903, str);
      }
    }
  }
  
  public void printCustomAttributes()
  {
    Object localObject1 = new Throwable().getStackTrace()[1];
    Object localObject2 = z2.t(".(");
    ((StringBuilder)localObject2).append(((StackTraceElement)localObject1).getFileName());
    ((StringBuilder)localObject2).append(":");
    ((StringBuilder)localObject2).append(((StackTraceElement)localObject1).getLineNumber());
    ((StringBuilder)localObject2).append(") ");
    ((StringBuilder)localObject2).append(((StackTraceElement)localObject1).getMethodName());
    localObject2 = z2.u(((StringBuilder)localObject2).toString(), " ");
    ((StringBuilder)localObject2).append(hashCode() % 1000);
    localObject2 = ((StringBuilder)localObject2).toString();
    if (widget != null)
    {
      localObject2 = z2.u((String)localObject2, "/");
      ((StringBuilder)localObject2).append(widget.hashCode() % 1000);
      ((StringBuilder)localObject2).append(" ");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    else
    {
      localObject2 = z2.o((String)localObject2, "/NULL ");
    }
    localObject1 = mCustom;
    if (localObject1 != null)
    {
      Iterator localIterator = ((HashMap)localObject1).keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localObject1 = System.out;
        StringBuilder localStringBuilder = z2.t((String)localObject2);
        localStringBuilder.append(((CustomVariable)mCustom.get(str)).toString());
        ((PrintStream)localObject1).println(localStringBuilder.toString());
      }
    }
  }
  
  public StringBuilder serialize(StringBuilder paramStringBuilder)
  {
    return serialize(paramStringBuilder, false);
  }
  
  public StringBuilder serialize(StringBuilder paramStringBuilder, boolean paramBoolean)
  {
    paramStringBuilder.append("{\n");
    add(paramStringBuilder, "left", left);
    add(paramStringBuilder, "top", top);
    add(paramStringBuilder, "right", right);
    add(paramStringBuilder, "bottom", bottom);
    add(paramStringBuilder, "pivotX", pivotX);
    add(paramStringBuilder, "pivotY", pivotY);
    add(paramStringBuilder, "rotationX", rotationX);
    add(paramStringBuilder, "rotationY", rotationY);
    add(paramStringBuilder, "rotationZ", rotationZ);
    add(paramStringBuilder, "translationX", translationX);
    add(paramStringBuilder, "translationY", translationY);
    add(paramStringBuilder, "translationZ", translationZ);
    add(paramStringBuilder, "scaleX", scaleX);
    add(paramStringBuilder, "scaleY", scaleY);
    add(paramStringBuilder, "alpha", alpha);
    add(paramStringBuilder, "visibility", visibility);
    add(paramStringBuilder, "interpolatedPos", interpolatedPos);
    Object localObject;
    if (widget != null)
    {
      localObject = ConstraintAnchor.Type.values();
      int i = localObject.length;
      for (int j = 0; j < i; j++) {
        serializeAnchor(paramStringBuilder, localObject[j]);
      }
    }
    if (paramBoolean) {
      add(paramStringBuilder, "phone_orientation", phone_orientation);
    }
    if (paramBoolean) {
      add(paramStringBuilder, "phone_orientation", phone_orientation);
    }
    if (mCustom.size() != 0)
    {
      paramStringBuilder.append("custom : {\n");
      Iterator localIterator = mCustom.keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject = (String)localIterator.next();
        CustomVariable localCustomVariable = (CustomVariable)mCustom.get(localObject);
        paramStringBuilder.append((String)localObject);
        paramStringBuilder.append(": ");
        switch (localCustomVariable.getType())
        {
        default: 
          break;
        case 904: 
          paramStringBuilder.append("'");
          paramStringBuilder.append(localCustomVariable.getBooleanValue());
          paramStringBuilder.append("',\n");
          break;
        case 903: 
          paramStringBuilder.append("'");
          paramStringBuilder.append(localCustomVariable.getStringValue());
          paramStringBuilder.append("',\n");
          break;
        case 902: 
          paramStringBuilder.append("'");
          paramStringBuilder.append(CustomVariable.colorString(localCustomVariable.getIntegerValue()));
          paramStringBuilder.append("',\n");
          break;
        case 901: 
        case 905: 
          paramStringBuilder.append(localCustomVariable.getFloatValue());
          paramStringBuilder.append(",\n");
          break;
        case 900: 
          paramStringBuilder.append(localCustomVariable.getIntegerValue());
          paramStringBuilder.append(",\n");
        }
      }
      paramStringBuilder.append("}\n");
    }
    paramStringBuilder.append("}\n");
    return paramStringBuilder;
  }
  
  public void setCustomAttribute(String paramString, int paramInt, float paramFloat)
  {
    if (mCustom.containsKey(paramString)) {
      ((CustomVariable)mCustom.get(paramString)).setFloatValue(paramFloat);
    } else {
      mCustom.put(paramString, new CustomVariable(paramString, paramInt, paramFloat));
    }
  }
  
  public void setCustomAttribute(String paramString, int paramInt1, int paramInt2)
  {
    if (mCustom.containsKey(paramString)) {
      ((CustomVariable)mCustom.get(paramString)).setIntValue(paramInt2);
    } else {
      mCustom.put(paramString, new CustomVariable(paramString, paramInt1, paramInt2));
    }
  }
  
  public void setCustomAttribute(String paramString1, int paramInt, String paramString2)
  {
    if (mCustom.containsKey(paramString1)) {
      ((CustomVariable)mCustom.get(paramString1)).setStringValue(paramString2);
    } else {
      mCustom.put(paramString1, new CustomVariable(paramString1, paramInt, paramString2));
    }
  }
  
  public void setCustomAttribute(String paramString, int paramInt, boolean paramBoolean)
  {
    if (mCustom.containsKey(paramString)) {
      ((CustomVariable)mCustom.get(paramString)).setBooleanValue(paramBoolean);
    } else {
      mCustom.put(paramString, new CustomVariable(paramString, paramInt, paramBoolean));
    }
  }
  
  public void setCustomValue(CustomAttribute paramCustomAttribute, float[] paramArrayOfFloat) {}
  
  public boolean setValue(String paramString, CLElement paramCLElement)
    throws CLParsingException
  {
    paramString.getClass();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 642850769: 
      if (paramString.equals("interpolatedPos")) {
        j = 17;
      }
      break;
    case 108511772: 
      if (paramString.equals("right")) {
        j = 16;
      }
      break;
    case 92909918: 
      if (paramString.equals("alpha")) {
        j = 15;
      }
      break;
    case 3317767: 
      if (paramString.equals("left")) {
        j = 14;
      }
      break;
    case 115029: 
      if (paramString.equals("top")) {
        j = 13;
      }
      break;
    case -908189617: 
      if (paramString.equals("scaleY")) {
        j = 12;
      }
      break;
    case -908189618: 
      if (paramString.equals("scaleX")) {
        j = 11;
      }
      break;
    case -987906985: 
      if (paramString.equals("pivotY")) {
        j = 10;
      }
      break;
    case -987906986: 
      if (paramString.equals("pivotX")) {
        j = 9;
      }
      break;
    case -1225497655: 
      if (paramString.equals("translationZ")) {
        j = 8;
      }
      break;
    case -1225497656: 
      if (paramString.equals("translationY")) {
        j = 7;
      }
      break;
    case -1225497657: 
      if (paramString.equals("translationX")) {
        j = 6;
      }
      break;
    case -1249320804: 
      if (paramString.equals("rotationZ")) {
        j = 5;
      }
      break;
    case -1249320805: 
      if (paramString.equals("rotationY")) {
        j = 4;
      }
      break;
    case -1249320806: 
      if (paramString.equals("rotationX")) {
        j = 3;
      }
      break;
    case -1349088399: 
      if (paramString.equals("custom")) {
        j = 2;
      }
      break;
    case -1383228885: 
      if (paramString.equals("bottom")) {
        j = 1;
      }
      break;
    case -1881940865: 
      if (paramString.equals("phone_orientation")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return false;
    case 17: 
      interpolatedPos = paramCLElement.getFloat();
      break;
    case 16: 
      right = paramCLElement.getInt();
      break;
    case 15: 
      alpha = paramCLElement.getFloat();
      break;
    case 14: 
      left = paramCLElement.getInt();
      break;
    case 13: 
      top = paramCLElement.getInt();
      break;
    case 12: 
      scaleY = paramCLElement.getFloat();
      break;
    case 11: 
      scaleX = paramCLElement.getFloat();
      break;
    case 10: 
      pivotY = paramCLElement.getFloat();
      break;
    case 9: 
      pivotX = paramCLElement.getFloat();
      break;
    case 8: 
      translationZ = paramCLElement.getFloat();
      break;
    case 7: 
      translationY = paramCLElement.getFloat();
      break;
    case 6: 
      translationX = paramCLElement.getFloat();
      break;
    case 5: 
      rotationZ = paramCLElement.getFloat();
      break;
    case 4: 
      rotationY = paramCLElement.getFloat();
      break;
    case 3: 
      rotationX = paramCLElement.getFloat();
      break;
    case 2: 
      parseCustom(paramCLElement);
      break;
    case 1: 
      bottom = paramCLElement.getInt();
      break;
    case 0: 
      phone_orientation = paramCLElement.getFloat();
    }
    return true;
  }
  
  public WidgetFrame update()
  {
    ConstraintWidget localConstraintWidget = widget;
    if (localConstraintWidget != null)
    {
      left = localConstraintWidget.getLeft();
      top = widget.getTop();
      right = widget.getRight();
      bottom = widget.getBottom();
      updateAttributes(widget.frame);
    }
    return this;
  }
  
  public WidgetFrame update(ConstraintWidget paramConstraintWidget)
  {
    if (paramConstraintWidget == null) {
      return this;
    }
    widget = paramConstraintWidget;
    update();
    return this;
  }
  
  public void updateAttributes(WidgetFrame paramWidgetFrame)
  {
    pivotX = pivotX;
    pivotY = pivotY;
    rotationX = rotationX;
    rotationY = rotationY;
    rotationZ = rotationZ;
    translationX = translationX;
    translationY = translationY;
    translationZ = translationZ;
    scaleX = scaleX;
    scaleY = scaleY;
    alpha = alpha;
    visibility = visibility;
    mCustom.clear();
    Iterator localIterator = mCustom.values().iterator();
    while (localIterator.hasNext())
    {
      paramWidgetFrame = (CustomVariable)localIterator.next();
      mCustom.put(paramWidgetFrame.getName(), paramWidgetFrame.copy());
    }
  }
  
  public int width()
  {
    return Math.max(0, right - left);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.state.WidgetFrame
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */