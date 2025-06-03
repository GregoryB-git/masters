package io.flutter.view;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.MotionEvent.PointerCoords;
import android.view.MotionEvent.PointerProperties;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Keep
class AccessibilityViewEmbedder
{
  private static final String TAG = "AccessibilityBridge";
  private final Map<View, Rect> embeddedViewToDisplayBounds;
  private final SparseArray<c> flutterIdToOrigin = new SparseArray();
  private int nextFlutterId;
  private final Map<c, Integer> originToFlutterId;
  private final b reflectionAccessors = new b(null);
  private final View rootAccessibilityView;
  
  public AccessibilityViewEmbedder(@NonNull View paramView, int paramInt)
  {
    rootAccessibilityView = paramView;
    nextFlutterId = paramInt;
    originToFlutterId = new HashMap();
    embeddedViewToDisplayBounds = new HashMap();
  }
  
  private void addChildrenToFlutterNode(@NonNull AccessibilityNodeInfo paramAccessibilityNodeInfo1, @NonNull View paramView, @NonNull AccessibilityNodeInfo paramAccessibilityNodeInfo2)
  {
    for (int i = 0; i < paramAccessibilityNodeInfo1.getChildCount(); i++)
    {
      Object localObject = b.d(reflectionAccessors, paramAccessibilityNodeInfo1, i);
      if (localObject != null)
      {
        int j = b.b(((Long)localObject).longValue());
        localObject = new c(paramView, j, null);
        int k;
        if (originToFlutterId.containsKey(localObject))
        {
          k = ((Integer)originToFlutterId.get(localObject)).intValue();
        }
        else
        {
          k = nextFlutterId;
          nextFlutterId = (k + 1);
          cacheVirtualIdMappings(paramView, j, k);
        }
        paramAccessibilityNodeInfo2.addChild(rootAccessibilityView, k);
      }
    }
  }
  
  private void cacheVirtualIdMappings(@NonNull View paramView, int paramInt1, int paramInt2)
  {
    paramView = new c(paramView, paramInt1, null);
    originToFlutterId.put(paramView, Integer.valueOf(paramInt2));
    flutterIdToOrigin.put(paramInt2, paramView);
  }
  
  @NonNull
  private AccessibilityNodeInfo convertToFlutterNode(@NonNull AccessibilityNodeInfo paramAccessibilityNodeInfo, int paramInt, @NonNull View paramView)
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = AccessibilityNodeInfo.obtain(rootAccessibilityView, paramInt);
    localAccessibilityNodeInfo.setPackageName(rootAccessibilityView.getContext().getPackageName());
    localAccessibilityNodeInfo.setSource(rootAccessibilityView, paramInt);
    localAccessibilityNodeInfo.setClassName(paramAccessibilityNodeInfo.getClassName());
    Rect localRect = (Rect)embeddedViewToDisplayBounds.get(paramView);
    copyAccessibilityFields(paramAccessibilityNodeInfo, localAccessibilityNodeInfo);
    setFlutterNodesTranslateBounds(paramAccessibilityNodeInfo, localRect, localAccessibilityNodeInfo);
    addChildrenToFlutterNode(paramAccessibilityNodeInfo, paramView, localAccessibilityNodeInfo);
    setFlutterNodeParent(paramAccessibilityNodeInfo, paramView, localAccessibilityNodeInfo);
    return localAccessibilityNodeInfo;
  }
  
  private void copyAccessibilityFields(@NonNull AccessibilityNodeInfo paramAccessibilityNodeInfo1, @NonNull AccessibilityNodeInfo paramAccessibilityNodeInfo2)
  {
    paramAccessibilityNodeInfo2.setAccessibilityFocused(paramAccessibilityNodeInfo1.isAccessibilityFocused());
    paramAccessibilityNodeInfo2.setCheckable(paramAccessibilityNodeInfo1.isCheckable());
    paramAccessibilityNodeInfo2.setChecked(paramAccessibilityNodeInfo1.isChecked());
    paramAccessibilityNodeInfo2.setContentDescription(paramAccessibilityNodeInfo1.getContentDescription());
    paramAccessibilityNodeInfo2.setEnabled(paramAccessibilityNodeInfo1.isEnabled());
    paramAccessibilityNodeInfo2.setClickable(paramAccessibilityNodeInfo1.isClickable());
    paramAccessibilityNodeInfo2.setFocusable(paramAccessibilityNodeInfo1.isFocusable());
    paramAccessibilityNodeInfo2.setFocused(paramAccessibilityNodeInfo1.isFocused());
    paramAccessibilityNodeInfo2.setLongClickable(paramAccessibilityNodeInfo1.isLongClickable());
    paramAccessibilityNodeInfo2.setMovementGranularities(paramAccessibilityNodeInfo1.getMovementGranularities());
    paramAccessibilityNodeInfo2.setPassword(paramAccessibilityNodeInfo1.isPassword());
    paramAccessibilityNodeInfo2.setScrollable(paramAccessibilityNodeInfo1.isScrollable());
    paramAccessibilityNodeInfo2.setSelected(paramAccessibilityNodeInfo1.isSelected());
    paramAccessibilityNodeInfo2.setText(paramAccessibilityNodeInfo1.getText());
    paramAccessibilityNodeInfo2.setVisibleToUser(paramAccessibilityNodeInfo1.isVisibleToUser());
    paramAccessibilityNodeInfo2.setEditable(paramAccessibilityNodeInfo1.isEditable());
    paramAccessibilityNodeInfo2.setCanOpenPopup(paramAccessibilityNodeInfo1.canOpenPopup());
    paramAccessibilityNodeInfo2.setCollectionInfo(paramAccessibilityNodeInfo1.getCollectionInfo());
    paramAccessibilityNodeInfo2.setCollectionItemInfo(paramAccessibilityNodeInfo1.getCollectionItemInfo());
    paramAccessibilityNodeInfo2.setContentInvalid(paramAccessibilityNodeInfo1.isContentInvalid());
    paramAccessibilityNodeInfo2.setDismissable(paramAccessibilityNodeInfo1.isDismissable());
    paramAccessibilityNodeInfo2.setInputType(paramAccessibilityNodeInfo1.getInputType());
    paramAccessibilityNodeInfo2.setLiveRegion(paramAccessibilityNodeInfo1.getLiveRegion());
    paramAccessibilityNodeInfo2.setMultiLine(paramAccessibilityNodeInfo1.isMultiLine());
    paramAccessibilityNodeInfo2.setRangeInfo(paramAccessibilityNodeInfo1.getRangeInfo());
    paramAccessibilityNodeInfo2.setError(paramAccessibilityNodeInfo1.getError());
    paramAccessibilityNodeInfo2.setMaxTextLength(paramAccessibilityNodeInfo1.getMaxTextLength());
    int i = Build.VERSION.SDK_INT;
    paramAccessibilityNodeInfo2.setContextClickable(paramAccessibilityNodeInfo1.isContextClickable());
    if (i >= 24)
    {
      k.a(paramAccessibilityNodeInfo2, j.a(paramAccessibilityNodeInfo1));
      a.a(paramAccessibilityNodeInfo2, l.a(paramAccessibilityNodeInfo1));
    }
    if (i >= 26)
    {
      n.a(paramAccessibilityNodeInfo2, m.a(paramAccessibilityNodeInfo1));
      b.a(paramAccessibilityNodeInfo2, o.a(paramAccessibilityNodeInfo1));
      q.a(paramAccessibilityNodeInfo2, p.a(paramAccessibilityNodeInfo1));
    }
  }
  
  private void setFlutterNodeParent(@NonNull AccessibilityNodeInfo paramAccessibilityNodeInfo1, @NonNull View paramView, @NonNull AccessibilityNodeInfo paramAccessibilityNodeInfo2)
  {
    paramAccessibilityNodeInfo1 = b.c(reflectionAccessors, paramAccessibilityNodeInfo1);
    if (paramAccessibilityNodeInfo1 == null) {
      return;
    }
    int i = b.b(paramAccessibilityNodeInfo1.longValue());
    paramAccessibilityNodeInfo1 = (Integer)originToFlutterId.get(new c(paramView, i, null));
    if (paramAccessibilityNodeInfo1 != null) {
      paramAccessibilityNodeInfo2.setParent(rootAccessibilityView, paramAccessibilityNodeInfo1.intValue());
    }
  }
  
  private void setFlutterNodesTranslateBounds(@NonNull AccessibilityNodeInfo paramAccessibilityNodeInfo1, @NonNull Rect paramRect, @NonNull AccessibilityNodeInfo paramAccessibilityNodeInfo2)
  {
    Rect localRect = new Rect();
    paramAccessibilityNodeInfo1.getBoundsInParent(localRect);
    paramAccessibilityNodeInfo2.setBoundsInParent(localRect);
    localRect = new Rect();
    paramAccessibilityNodeInfo1.getBoundsInScreen(localRect);
    localRect.offset(left, top);
    paramAccessibilityNodeInfo2.setBoundsInScreen(localRect);
  }
  
  public AccessibilityNodeInfo createAccessibilityNodeInfo(int paramInt)
  {
    c localc = (c)flutterIdToOrigin.get(paramInt);
    if (localc == null) {
      return null;
    }
    if (!embeddedViewToDisplayBounds.containsKey(a)) {
      return null;
    }
    if (a.getAccessibilityNodeProvider() == null) {
      return null;
    }
    AccessibilityNodeInfo localAccessibilityNodeInfo = a.getAccessibilityNodeProvider().createAccessibilityNodeInfo(b);
    if (localAccessibilityNodeInfo == null) {
      return null;
    }
    return convertToFlutterNode(localAccessibilityNodeInfo, paramInt, a);
  }
  
  public Integer getRecordFlutterId(@NonNull View paramView, @NonNull AccessibilityRecord paramAccessibilityRecord)
  {
    paramAccessibilityRecord = b.e(reflectionAccessors, paramAccessibilityRecord);
    if (paramAccessibilityRecord == null) {
      return null;
    }
    int i = b.b(paramAccessibilityRecord.longValue());
    return (Integer)originToFlutterId.get(new c(paramView, i, null));
  }
  
  public AccessibilityNodeInfo getRootNode(@NonNull View paramView, int paramInt, @NonNull Rect paramRect)
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = paramView.createAccessibilityNodeInfo();
    Long localLong = b.a(reflectionAccessors, localAccessibilityNodeInfo);
    if (localLong == null) {
      return null;
    }
    embeddedViewToDisplayBounds.put(paramView, paramRect);
    cacheVirtualIdMappings(paramView, b.b(localLong.longValue()), paramInt);
    return convertToFlutterNode(localAccessibilityNodeInfo, paramInt, paramView);
  }
  
  public boolean onAccessibilityHoverEvent(int paramInt, @NonNull MotionEvent paramMotionEvent)
  {
    c localc = (c)flutterIdToOrigin.get(paramInt);
    paramInt = 0;
    if (localc == null) {
      return false;
    }
    Rect localRect = (Rect)embeddedViewToDisplayBounds.get(a);
    int i = paramMotionEvent.getPointerCount();
    MotionEvent.PointerProperties[] arrayOfPointerProperties = new MotionEvent.PointerProperties[i];
    MotionEvent.PointerCoords[] arrayOfPointerCoords = new MotionEvent.PointerCoords[i];
    while (paramInt < paramMotionEvent.getPointerCount())
    {
      Object localObject = new MotionEvent.PointerProperties();
      arrayOfPointerProperties[paramInt] = localObject;
      paramMotionEvent.getPointerProperties(paramInt, (MotionEvent.PointerProperties)localObject);
      localObject = new MotionEvent.PointerCoords();
      paramMotionEvent.getPointerCoords(paramInt, (MotionEvent.PointerCoords)localObject);
      localObject = new MotionEvent.PointerCoords((MotionEvent.PointerCoords)localObject);
      arrayOfPointerCoords[paramInt] = localObject;
      x -= left;
      y -= top;
      paramInt++;
    }
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent.getDownTime(), paramMotionEvent.getEventTime(), paramMotionEvent.getAction(), paramMotionEvent.getPointerCount(), arrayOfPointerProperties, arrayOfPointerCoords, paramMotionEvent.getMetaState(), paramMotionEvent.getButtonState(), paramMotionEvent.getXPrecision(), paramMotionEvent.getYPrecision(), paramMotionEvent.getDeviceId(), paramMotionEvent.getEdgeFlags(), paramMotionEvent.getSource(), paramMotionEvent.getFlags());
    return a.dispatchGenericMotionEvent(paramMotionEvent);
  }
  
  public boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    c localc = (c)flutterIdToOrigin.get(paramInt1);
    if (localc == null) {
      return false;
    }
    AccessibilityNodeProvider localAccessibilityNodeProvider = a.getAccessibilityNodeProvider();
    if (localAccessibilityNodeProvider == null) {
      return false;
    }
    return localAccessibilityNodeProvider.performAction(b, paramInt2, paramBundle);
  }
  
  public View platformViewOfNode(int paramInt)
  {
    c localc = (c)flutterIdToOrigin.get(paramInt);
    if (localc == null) {
      return null;
    }
    return a;
  }
  
  public boolean requestSendAccessibilityEvent(@NonNull View paramView1, @NonNull View paramView2, @NonNull AccessibilityEvent paramAccessibilityEvent)
  {
    AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain(paramAccessibilityEvent);
    Object localObject = b.e(reflectionAccessors, paramAccessibilityEvent);
    if (localObject == null) {
      return false;
    }
    int i = b.b(((Long)localObject).longValue());
    Integer localInteger = (Integer)originToFlutterId.get(new c(paramView1, i, null));
    localObject = localInteger;
    int j;
    if (localInteger == null)
    {
      j = nextFlutterId;
      nextFlutterId = (j + 1);
      cacheVirtualIdMappings(paramView1, i, j);
      localObject = Integer.valueOf(j);
    }
    localAccessibilityEvent.setSource(rootAccessibilityView, ((Integer)localObject).intValue());
    localAccessibilityEvent.setClassName(paramAccessibilityEvent.getClassName());
    localAccessibilityEvent.setPackageName(paramAccessibilityEvent.getPackageName());
    for (i = 0; i < localAccessibilityEvent.getRecordCount(); i++)
    {
      paramAccessibilityEvent = localAccessibilityEvent.getRecord(i);
      localObject = b.e(reflectionAccessors, paramAccessibilityEvent);
      if (localObject == null) {
        return false;
      }
      localObject = new c(paramView1, b.b(((Long)localObject).longValue()), null);
      if (!originToFlutterId.containsKey(localObject)) {
        return false;
      }
      j = ((Integer)originToFlutterId.get(localObject)).intValue();
      paramAccessibilityEvent.setSource(rootAccessibilityView, j);
    }
    return rootAccessibilityView.getParent().requestSendAccessibilityEvent(paramView2, localAccessibilityEvent);
  }
  
  public static class b
  {
    public final Method a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Field e;
    public final Method f;
    
    public b()
    {
      Object localObject1 = null;
      Method localMethod1;
      try
      {
        localMethod1 = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", new Class[0]);
      }
      catch (NoSuchMethodException localNoSuchMethodException1)
      {
        t5.b.g("AccessibilityBridge", "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
        localMethod1 = null;
      }
      Method localMethod4;
      try
      {
        localMethod4 = AccessibilityRecord.class.getMethod("getSourceNodeId", new Class[0]);
      }
      catch (NoSuchMethodException localNoSuchMethodException2)
      {
        t5.b.g("AccessibilityBridge", "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
        localMethod4 = null;
      }
      Object localObject2;
      Object localObject6;
      Object localObject4;
      Method localMethod3;
      if (Build.VERSION.SDK_INT <= 26)
      {
        try
        {
          Method localMethod2 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", new Class[0]);
        }
        catch (NoSuchMethodException localNoSuchMethodException3)
        {
          t5.b.g("AccessibilityBridge", "can't invoke getParentNodeId with reflection");
          localObject2 = null;
        }
        try
        {
          Object localObject3 = AccessibilityNodeInfo.class.getMethod("getChildId", new Class[] { Integer.TYPE });
          Object localObject5 = null;
          localObject6 = null;
          localObject1 = localObject2;
          localObject2 = localObject3;
          localObject3 = localObject5;
        }
        catch (NoSuchMethodException localNoSuchMethodException4)
        {
          for (;;)
          {
            t5.b.g("AccessibilityBridge", "can't invoke getChildId with reflection");
            localObject4 = null;
          }
        }
      }
      else
      {
        try
        {
          localObject4 = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
          ((AccessibleObject)localObject4).setAccessible(true);
          localObject6 = Class.forName("android.util.LongArray").getMethod("get", new Class[] { Integer.TYPE });
          localObject2 = null;
        }
        catch (NoSuchFieldException|ClassNotFoundException|NoSuchMethodException|NullPointerException localNoSuchFieldException)
        {
          t5.b.g("AccessibilityBridge", "can't access childNodeIdsField with reflection");
          localMethod3 = null;
          localObject4 = localMethod3;
          localObject6 = localObject4;
        }
      }
      a = localMethod1;
      b = ((Method)localObject1);
      c = localMethod4;
      d = localMethod3;
      e = ((Field)localObject4);
      f = ((Method)localObject6);
    }
    
    public static int j(long paramLong)
    {
      return (int)(paramLong >> 32);
    }
    
    public static boolean k(long paramLong, int paramInt)
    {
      boolean bool;
      if ((paramLong & 1L << paramInt) != 0L) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public static Long l(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      int i = Build.VERSION.SDK_INT;
      Object localObject = null;
      if (i < 26)
      {
        t5.b.g("AccessibilityBridge", "Unexpected Android version. Unable to find the parent ID.");
        return null;
      }
      paramAccessibilityNodeInfo = AccessibilityNodeInfo.obtain(paramAccessibilityNodeInfo);
      Parcel localParcel = Parcel.obtain();
      localParcel.setDataPosition(0);
      paramAccessibilityNodeInfo.writeToParcel(localParcel, 0);
      localParcel.setDataPosition(0);
      long l = localParcel.readLong();
      if (k(l, 0)) {
        localParcel.readInt();
      }
      if (k(l, 1)) {
        localParcel.readLong();
      }
      if (k(l, 2)) {
        localParcel.readInt();
      }
      paramAccessibilityNodeInfo = (AccessibilityNodeInfo)localObject;
      if (k(l, 3)) {
        paramAccessibilityNodeInfo = Long.valueOf(localParcel.readLong());
      }
      localParcel.recycle();
      return paramAccessibilityNodeInfo;
    }
    
    public final Long f(AccessibilityNodeInfo paramAccessibilityNodeInfo, int paramInt)
    {
      Object localObject = d;
      if ((localObject == null) && ((e == null) || (f == null))) {
        return null;
      }
      if (localObject != null)
      {
        try
        {
          paramAccessibilityNodeInfo = (Long)((Method)localObject).invoke(paramAccessibilityNodeInfo, new Object[] { Integer.valueOf(paramInt) });
          return paramAccessibilityNodeInfo;
        }
        catch (InvocationTargetException paramAccessibilityNodeInfo) {}catch (IllegalAccessException paramAccessibilityNodeInfo) {}
        localObject = "The getChildId method threw an exception when invoked.";
      }
      for (;;)
      {
        t5.b.h("AccessibilityBridge", (String)localObject, paramAccessibilityNodeInfo);
        break;
        localObject = "Failed to access getChildId method.";
        continue;
        try
        {
          paramAccessibilityNodeInfo = (Long)f.invoke(e.get(paramAccessibilityNodeInfo), new Object[] { Integer.valueOf(paramInt) });
          paramAccessibilityNodeInfo.longValue();
          return paramAccessibilityNodeInfo;
        }
        catch (ArrayIndexOutOfBoundsException paramAccessibilityNodeInfo) {}catch (InvocationTargetException paramAccessibilityNodeInfo) {}catch (IllegalAccessException paramAccessibilityNodeInfo) {}
        localObject = "The longArrayGetIndex method threw an exception when invoked.";
        continue;
        localObject = "Failed to access longArrayGetIndex method or the childNodeId field.";
      }
      return null;
    }
    
    public final Long g(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      Object localObject = b;
      if (localObject != null)
      {
        try
        {
          localObject = (Long)((Method)localObject).invoke(paramAccessibilityNodeInfo, new Object[0]);
          ((Long)localObject).longValue();
          return (Long)localObject;
        }
        catch (InvocationTargetException localInvocationTargetException) {}catch (IllegalAccessException localIllegalAccessException) {}
        for (localObject = "The getParentNodeId method threw an exception when invoked.";; localObject = "Failed to access getParentNodeId method.")
        {
          t5.b.h("AccessibilityBridge", (String)localObject, localIllegalAccessException);
          break;
        }
      }
      return l(paramAccessibilityNodeInfo);
    }
    
    public final Long h(AccessibilityRecord paramAccessibilityRecord)
    {
      Object localObject = c;
      if (localObject == null) {
        return null;
      }
      try
      {
        paramAccessibilityRecord = (Long)((Method)localObject).invoke(paramAccessibilityRecord, new Object[0]);
        return paramAccessibilityRecord;
      }
      catch (InvocationTargetException paramAccessibilityRecord) {}catch (IllegalAccessException paramAccessibilityRecord) {}
      for (localObject = "The getRecordSourceNodeId method threw an exception when invoked.";; localObject = "Failed to access the getRecordSourceNodeId method.")
      {
        t5.b.h("AccessibilityBridge", (String)localObject, paramAccessibilityRecord);
        break;
      }
      return null;
    }
    
    public final Long i(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      Method localMethod = a;
      if (localMethod == null) {
        return null;
      }
      try
      {
        paramAccessibilityNodeInfo = (Long)localMethod.invoke(paramAccessibilityNodeInfo, new Object[0]);
        return paramAccessibilityNodeInfo;
      }
      catch (InvocationTargetException localInvocationTargetException) {}catch (IllegalAccessException localIllegalAccessException) {}
      for (paramAccessibilityNodeInfo = "The getSourceNodeId method threw an exception when invoked.";; paramAccessibilityNodeInfo = "Failed to access getSourceNodeId method.")
      {
        t5.b.h("AccessibilityBridge", paramAccessibilityNodeInfo, localIllegalAccessException);
        break;
      }
      return null;
    }
  }
  
  public static class c
  {
    public final View a;
    public final int b;
    
    public c(View paramView, int paramInt)
    {
      a = paramView;
      b = paramInt;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof c)) {
        return false;
      }
      paramObject = (c)paramObject;
      if ((b != b) || (!a.equals(a))) {
        bool = false;
      }
      return bool;
    }
    
    public int hashCode()
    {
      return (a.hashCode() + 31) * 31 + b;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.AccessibilityViewEmbedder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */