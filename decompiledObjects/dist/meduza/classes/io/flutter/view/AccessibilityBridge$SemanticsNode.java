package io.flutter.view;

import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan.Builder;
import io.flutter.util.Predicate;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

class AccessibilityBridge$SemanticsNode
{
  public final AccessibilityBridge accessibilityBridge;
  private int actions;
  private float bottom;
  private List<SemanticsNode> childrenInHitTestOrder = new ArrayList();
  private List<SemanticsNode> childrenInTraversalOrder = new ArrayList();
  private int currentValueLength;
  private List<AccessibilityBridge.CustomAccessibilityAction> customAccessibilityActions;
  private String decreasedValue;
  private List<AccessibilityBridge.StringAttribute> decreasedValueAttributes;
  private int flags;
  private boolean globalGeometryDirty = true;
  private Rect globalRect;
  private float[] globalTransform;
  private boolean hadPreviousConfig = false;
  private String hint;
  private List<AccessibilityBridge.StringAttribute> hintAttributes;
  private int id = -1;
  private String identifier;
  private String increasedValue;
  private List<AccessibilityBridge.StringAttribute> increasedValueAttributes;
  private float[] inverseTransform;
  private boolean inverseTransformDirty = true;
  private String label;
  private List<AccessibilityBridge.StringAttribute> labelAttributes;
  private float left;
  private int maxValueLength;
  private AccessibilityBridge.CustomAccessibilityAction onLongPressOverride;
  private AccessibilityBridge.CustomAccessibilityAction onTapOverride;
  private SemanticsNode parent;
  private int platformViewId;
  private int previousActions;
  private int previousFlags;
  private String previousLabel;
  private int previousNodeId = -1;
  private float previousScrollExtentMax;
  private float previousScrollExtentMin;
  private float previousScrollPosition;
  private int previousTextSelectionBase;
  private int previousTextSelectionExtent;
  private String previousValue;
  private float right;
  private int scrollChildren;
  private float scrollExtentMax;
  private float scrollExtentMin;
  private int scrollIndex;
  private float scrollPosition;
  private AccessibilityBridge.TextDirection textDirection;
  private int textSelectionBase;
  private int textSelectionExtent;
  private String tooltip;
  private float top;
  private float[] transform;
  private String value;
  private List<AccessibilityBridge.StringAttribute> valueAttributes;
  
  public AccessibilityBridge$SemanticsNode(AccessibilityBridge paramAccessibilityBridge)
  {
    accessibilityBridge = paramAccessibilityBridge;
  }
  
  private void collectRoutes(List<SemanticsNode> paramList)
  {
    if (hasFlag(AccessibilityBridge.Flag.SCOPES_ROUTE)) {
      paramList.add(this);
    }
    Iterator localIterator = childrenInTraversalOrder.iterator();
    while (localIterator.hasNext()) {
      ((SemanticsNode)localIterator.next()).collectRoutes(paramList);
    }
  }
  
  private SpannableString createSpannableString(String paramString, List<AccessibilityBridge.StringAttribute> paramList)
  {
    if (paramString == null) {
      return null;
    }
    paramString = new SpannableString(paramString);
    if (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        AccessibilityBridge.StringAttribute localStringAttribute = (AccessibilityBridge.StringAttribute)paramList.next();
        int i = AccessibilityBridge.5.$SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType[type.ordinal()];
        if (i != 1)
        {
          if (i == 2) {
            paramString.setSpan(new LocaleSpan(Locale.forLanguageTag(locale)), start, end, 0);
          }
        }
        else {
          paramString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), start, end, 0);
        }
      }
    }
    return paramString;
  }
  
  private boolean didChangeLabel()
  {
    String str1 = label;
    boolean bool = false;
    if ((str1 == null) && (previousLabel == null)) {
      return false;
    }
    if (str1 != null)
    {
      String str2 = previousLabel;
      if ((str2 != null) && (str1.equals(str2))) {}
    }
    else
    {
      bool = true;
    }
    return bool;
  }
  
  private boolean didScroll()
  {
    boolean bool;
    if ((!Float.isNaN(scrollPosition)) && (!Float.isNaN(previousScrollPosition)) && (previousScrollPosition != scrollPosition)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void ensureInverseTransform()
  {
    if (!inverseTransformDirty) {
      return;
    }
    inverseTransformDirty = false;
    if (inverseTransform == null) {
      inverseTransform = new float[16];
    }
    if (!Matrix.invertM(inverseTransform, 0, transform, 0)) {
      Arrays.fill(inverseTransform, 0.0F);
    }
  }
  
  private SemanticsNode getAncestor(Predicate<SemanticsNode> paramPredicate)
  {
    for (SemanticsNode localSemanticsNode = parent; localSemanticsNode != null; localSemanticsNode = parent) {
      if (paramPredicate.test(localSemanticsNode)) {
        return localSemanticsNode;
      }
    }
    return null;
  }
  
  private Rect getGlobalRect()
  {
    return globalRect;
  }
  
  private CharSequence getHint()
  {
    return createSpannableString(hint, hintAttributes);
  }
  
  private CharSequence getLabel()
  {
    return createSpannableString(label, labelAttributes);
  }
  
  private String getRouteName()
  {
    if (hasFlag(AccessibilityBridge.Flag.NAMES_ROUTE))
    {
      localObject = label;
      if ((localObject != null) && (!((String)localObject).isEmpty())) {
        return label;
      }
    }
    Object localObject = childrenInTraversalOrder.iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = ((SemanticsNode)((Iterator)localObject).next()).getRouteName();
      if ((str != null) && (!str.isEmpty())) {
        return str;
      }
    }
    return null;
  }
  
  private List<AccessibilityBridge.StringAttribute> getStringAttributesFromBuffer(ByteBuffer paramByteBuffer, ByteBuffer[] paramArrayOfByteBuffer)
  {
    int i = paramByteBuffer.getInt();
    if (i == -1) {
      return null;
    }
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++)
    {
      int k = paramByteBuffer.getInt();
      int m = paramByteBuffer.getInt();
      AccessibilityBridge.StringAttributeType localStringAttributeType = AccessibilityBridge.StringAttributeType.values()[paramByteBuffer.getInt()];
      int n = AccessibilityBridge.5.$SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType[localStringAttributeType.ordinal()];
      Object localObject;
      if (n != 1)
      {
        if (n == 2)
        {
          ByteBuffer localByteBuffer = paramArrayOfByteBuffer[paramByteBuffer.getInt()];
          localObject = new AccessibilityBridge.LocaleStringAttribute(null);
          start = k;
          end = m;
          type = localStringAttributeType;
          locale = Charset.forName("UTF-8").decode(localByteBuffer).toString();
          localArrayList.add(localObject);
        }
      }
      else
      {
        paramByteBuffer.getInt();
        localObject = new AccessibilityBridge.SpellOutStringAttribute(null);
        start = k;
        end = m;
        type = localStringAttributeType;
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
  
  private CharSequence getTextFieldHint()
  {
    CharSequence localCharSequence1 = getLabel();
    CharSequence localCharSequence2 = getHint();
    Object localObject1 = null;
    int i = 0;
    while (i < 2)
    {
      CharSequence localCharSequence3 = new CharSequence[] { localCharSequence1, localCharSequence2 }[i];
      Object localObject2 = localObject1;
      if (localCharSequence3 != null)
      {
        localObject2 = localObject1;
        if (localCharSequence3.length() > 0) {
          if ((localObject1 != null) && (((CharSequence)localObject1).length() != 0)) {
            localObject2 = TextUtils.concat(new CharSequence[] { localObject1, ", ", localCharSequence3 });
          } else {
            localObject2 = localCharSequence3;
          }
        }
      }
      i++;
      localObject1 = localObject2;
    }
    return (CharSequence)localObject1;
  }
  
  private CharSequence getValue()
  {
    return createSpannableString(value, valueAttributes);
  }
  
  private CharSequence getValueLabelHint()
  {
    CharSequence localCharSequence1 = getValue();
    CharSequence localCharSequence2 = getLabel();
    CharSequence localCharSequence3 = getHint();
    Object localObject1 = null;
    int i = 0;
    while (i < 3)
    {
      CharSequence localCharSequence4 = new CharSequence[] { localCharSequence1, localCharSequence2, localCharSequence3 }[i];
      Object localObject2 = localObject1;
      if (localCharSequence4 != null)
      {
        localObject2 = localObject1;
        if (localCharSequence4.length() > 0) {
          if ((localObject1 != null) && (((CharSequence)localObject1).length() != 0)) {
            localObject2 = TextUtils.concat(new CharSequence[] { localObject1, ", ", localCharSequence4 });
          } else {
            localObject2 = localCharSequence4;
          }
        }
      }
      i++;
      localObject1 = localObject2;
    }
    return (CharSequence)localObject1;
  }
  
  private boolean hadAction(AccessibilityBridge.Action paramAction)
  {
    int i = previousActions;
    boolean bool;
    if ((value & i) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean hadFlag(AccessibilityBridge.Flag paramFlag)
  {
    int i = previousFlags;
    boolean bool;
    if ((value & i) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean hasAction(AccessibilityBridge.Action paramAction)
  {
    int i = actions;
    boolean bool;
    if ((value & i) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean hasFlag(AccessibilityBridge.Flag paramFlag)
  {
    int i = flags;
    boolean bool;
    if ((value & i) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private SemanticsNode hitTest(float[] paramArrayOfFloat, boolean paramBoolean)
  {
    float f1 = paramArrayOfFloat[3];
    int i = 0;
    float f2 = paramArrayOfFloat[0] / f1;
    float f3 = paramArrayOfFloat[1] / f1;
    f1 = left;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (f2 >= f1)
    {
      localObject2 = localObject1;
      if (f2 < right)
      {
        localObject2 = localObject1;
        if (f3 >= top) {
          if (f3 >= bottom)
          {
            localObject2 = localObject1;
          }
          else
          {
            localObject2 = new float[4];
            Iterator localIterator = childrenInHitTestOrder.iterator();
            while (localIterator.hasNext())
            {
              SemanticsNode localSemanticsNode = (SemanticsNode)localIterator.next();
              if (!localSemanticsNode.hasFlag(AccessibilityBridge.Flag.IS_HIDDEN))
              {
                localSemanticsNode.ensureInverseTransform();
                Matrix.multiplyMV((float[])localObject2, 0, inverseTransform, 0, paramArrayOfFloat, 0);
                localSemanticsNode = localSemanticsNode.hitTest((float[])localObject2, paramBoolean);
                if (localSemanticsNode != null) {
                  return localSemanticsNode;
                }
              }
            }
            int j = i;
            if (paramBoolean)
            {
              j = i;
              if (platformViewId != -1) {
                j = 1;
              }
            }
            if (!isFocusable())
            {
              localObject2 = localObject1;
              if (j == 0) {}
            }
            else
            {
              localObject2 = this;
            }
          }
        }
      }
    }
    return (SemanticsNode)localObject2;
  }
  
  private boolean isFocusable()
  {
    boolean bool1 = hasFlag(AccessibilityBridge.Flag.SCOPES_ROUTE);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    if (hasFlag(AccessibilityBridge.Flag.IS_FOCUSABLE)) {
      return true;
    }
    if (((actions & AccessibilityBridge.access$7400()) == 0) && ((flags & AccessibilityBridge.access$7500()) == 0))
    {
      String str = label;
      if ((str == null) || (str.isEmpty()))
      {
        str = value;
        if ((str == null) || (str.isEmpty()))
        {
          str = hint;
          bool1 = bool2;
          if (str == null) {
            return bool1;
          }
          bool1 = bool2;
          if (str.isEmpty()) {
            return bool1;
          }
        }
      }
    }
    bool1 = true;
    return bool1;
  }
  
  private void log(String paramString, boolean paramBoolean) {}
  
  private float max(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return Math.max(paramFloat1, Math.max(paramFloat2, Math.max(paramFloat3, paramFloat4)));
  }
  
  private float min(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return Math.min(paramFloat1, Math.min(paramFloat2, Math.min(paramFloat3, paramFloat4)));
  }
  
  private static boolean nullableHasAncestor(SemanticsNode paramSemanticsNode, Predicate<SemanticsNode> paramPredicate)
  {
    boolean bool;
    if ((paramSemanticsNode != null) && (paramSemanticsNode.getAncestor(paramPredicate) != null)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void transformPoint(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3)
  {
    Matrix.multiplyMV(paramArrayOfFloat1, 0, paramArrayOfFloat2, 0, paramArrayOfFloat3, 0);
    float f = paramArrayOfFloat1[3];
    paramArrayOfFloat1[0] /= f;
    paramArrayOfFloat1[1] /= f;
    paramArrayOfFloat1[2] /= f;
    paramArrayOfFloat1[3] = 0.0F;
  }
  
  private void updateRecursively(float[] paramArrayOfFloat, Set<SemanticsNode> paramSet, boolean paramBoolean)
  {
    paramSet.add(this);
    if (globalGeometryDirty) {
      paramBoolean = true;
    }
    Object localObject;
    if (paramBoolean)
    {
      if (globalTransform == null) {
        globalTransform = new float[16];
      }
      if (transform == null) {
        transform = new float[16];
      }
      Matrix.multiplyMM(globalTransform, 0, paramArrayOfFloat, 0, transform, 0);
      paramArrayOfFloat = new float[4];
      paramArrayOfFloat[2] = 0.0F;
      paramArrayOfFloat[3] = 1.0F;
      float[] arrayOfFloat1 = new float[4];
      float[] arrayOfFloat2 = new float[4];
      localObject = new float[4];
      float[] arrayOfFloat3 = new float[4];
      paramArrayOfFloat[0] = left;
      paramArrayOfFloat[1] = top;
      transformPoint(arrayOfFloat1, globalTransform, paramArrayOfFloat);
      paramArrayOfFloat[0] = right;
      paramArrayOfFloat[1] = top;
      transformPoint(arrayOfFloat2, globalTransform, paramArrayOfFloat);
      paramArrayOfFloat[0] = right;
      paramArrayOfFloat[1] = bottom;
      transformPoint((float[])localObject, globalTransform, paramArrayOfFloat);
      paramArrayOfFloat[0] = left;
      paramArrayOfFloat[1] = bottom;
      transformPoint(arrayOfFloat3, globalTransform, paramArrayOfFloat);
      if (globalRect == null) {
        globalRect = new Rect();
      }
      globalRect.set(Math.round(min(arrayOfFloat1[0], arrayOfFloat2[0], localObject[0], arrayOfFloat3[0])), Math.round(min(arrayOfFloat1[1], arrayOfFloat2[1], localObject[1], arrayOfFloat3[1])), Math.round(max(arrayOfFloat1[0], arrayOfFloat2[0], localObject[0], arrayOfFloat3[0])), Math.round(max(arrayOfFloat1[1], arrayOfFloat2[1], localObject[1], arrayOfFloat3[1])));
      globalGeometryDirty = false;
    }
    int i = -1;
    paramArrayOfFloat = childrenInTraversalOrder.iterator();
    while (paramArrayOfFloat.hasNext())
    {
      localObject = (SemanticsNode)paramArrayOfFloat.next();
      previousNodeId = i;
      i = id;
      ((SemanticsNode)localObject).updateRecursively(globalTransform, paramSet, paramBoolean);
    }
  }
  
  private void updateWith(ByteBuffer paramByteBuffer, String[] paramArrayOfString, ByteBuffer[] paramArrayOfByteBuffer)
  {
    hadPreviousConfig = true;
    previousValue = value;
    previousLabel = label;
    previousFlags = flags;
    previousActions = actions;
    previousTextSelectionBase = textSelectionBase;
    previousTextSelectionExtent = textSelectionExtent;
    previousScrollPosition = scrollPosition;
    previousScrollExtentMax = scrollExtentMax;
    previousScrollExtentMin = scrollExtentMin;
    flags = paramByteBuffer.getInt();
    actions = paramByteBuffer.getInt();
    maxValueLength = paramByteBuffer.getInt();
    currentValueLength = paramByteBuffer.getInt();
    textSelectionBase = paramByteBuffer.getInt();
    textSelectionExtent = paramByteBuffer.getInt();
    platformViewId = paramByteBuffer.getInt();
    scrollChildren = paramByteBuffer.getInt();
    scrollIndex = paramByteBuffer.getInt();
    scrollPosition = paramByteBuffer.getFloat();
    scrollExtentMax = paramByteBuffer.getFloat();
    scrollExtentMin = paramByteBuffer.getFloat();
    int i = paramByteBuffer.getInt();
    String str;
    if (i == -1) {
      str = null;
    } else {
      str = paramArrayOfString[i];
    }
    identifier = str;
    i = paramByteBuffer.getInt();
    if (i == -1) {
      str = null;
    } else {
      str = paramArrayOfString[i];
    }
    label = str;
    labelAttributes = getStringAttributesFromBuffer(paramByteBuffer, paramArrayOfByteBuffer);
    i = paramByteBuffer.getInt();
    if (i == -1) {
      str = null;
    } else {
      str = paramArrayOfString[i];
    }
    value = str;
    valueAttributes = getStringAttributesFromBuffer(paramByteBuffer, paramArrayOfByteBuffer);
    i = paramByteBuffer.getInt();
    if (i == -1) {
      str = null;
    } else {
      str = paramArrayOfString[i];
    }
    increasedValue = str;
    increasedValueAttributes = getStringAttributesFromBuffer(paramByteBuffer, paramArrayOfByteBuffer);
    i = paramByteBuffer.getInt();
    if (i == -1) {
      str = null;
    } else {
      str = paramArrayOfString[i];
    }
    decreasedValue = str;
    decreasedValueAttributes = getStringAttributesFromBuffer(paramByteBuffer, paramArrayOfByteBuffer);
    i = paramByteBuffer.getInt();
    if (i == -1) {
      str = null;
    } else {
      str = paramArrayOfString[i];
    }
    hint = str;
    hintAttributes = getStringAttributesFromBuffer(paramByteBuffer, paramArrayOfByteBuffer);
    i = paramByteBuffer.getInt();
    if (i == -1) {
      paramArrayOfString = null;
    } else {
      paramArrayOfString = paramArrayOfString[i];
    }
    tooltip = paramArrayOfString;
    textDirection = AccessibilityBridge.TextDirection.fromInt(paramByteBuffer.getInt());
    left = paramByteBuffer.getFloat();
    top = paramByteBuffer.getFloat();
    right = paramByteBuffer.getFloat();
    bottom = paramByteBuffer.getFloat();
    if (transform == null) {
      transform = new float[16];
    }
    int j = 0;
    for (i = 0; i < 16; i++) {
      transform[i] = paramByteBuffer.getFloat();
    }
    inverseTransformDirty = true;
    globalGeometryDirty = true;
    int k = paramByteBuffer.getInt();
    childrenInTraversalOrder.clear();
    childrenInHitTestOrder.clear();
    for (i = 0; i < k; i++)
    {
      paramArrayOfString = AccessibilityBridge.access$7000(accessibilityBridge, paramByteBuffer.getInt());
      parent = this;
      childrenInTraversalOrder.add(paramArrayOfString);
    }
    for (i = 0; i < k; i++)
    {
      paramArrayOfString = AccessibilityBridge.access$7000(accessibilityBridge, paramByteBuffer.getInt());
      parent = this;
      childrenInHitTestOrder.add(paramArrayOfString);
    }
    k = paramByteBuffer.getInt();
    if (k == 0)
    {
      customAccessibilityActions = null;
    }
    else
    {
      paramArrayOfString = customAccessibilityActions;
      if (paramArrayOfString == null)
      {
        customAccessibilityActions = new ArrayList(k);
        i = j;
      }
      else
      {
        paramArrayOfString.clear();
      }
      for (i = j; i < k; i++)
      {
        paramArrayOfString = AccessibilityBridge.access$7100(accessibilityBridge, paramByteBuffer.getInt());
        if (AccessibilityBridge.CustomAccessibilityAction.access$4800(paramArrayOfString) == TAPvalue) {
          onTapOverride = paramArrayOfString;
        } else if (AccessibilityBridge.CustomAccessibilityAction.access$4800(paramArrayOfString) == LONG_PRESSvalue) {
          onLongPressOverride = paramArrayOfString;
        } else {
          customAccessibilityActions.add(paramArrayOfString);
        }
        customAccessibilityActions.add(paramArrayOfString);
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.AccessibilityBridge.SemanticsNode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */