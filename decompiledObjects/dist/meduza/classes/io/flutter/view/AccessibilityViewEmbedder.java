package io.flutter.view;

import a0.d;
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
import b0.f;
import c0.b;
import io.flutter.Log;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

class AccessibilityViewEmbedder
{
  private static final String TAG = "AccessibilityBridge";
  private final Map<View, Rect> embeddedViewToDisplayBounds;
  private final SparseArray<ViewAndId> flutterIdToOrigin = new SparseArray();
  private int nextFlutterId;
  private final Map<ViewAndId, Integer> originToFlutterId;
  private final ReflectionAccessors reflectionAccessors = new ReflectionAccessors(null);
  private final View rootAccessibilityView;
  
  public AccessibilityViewEmbedder(View paramView, int paramInt)
  {
    rootAccessibilityView = paramView;
    nextFlutterId = paramInt;
    originToFlutterId = new HashMap();
    embeddedViewToDisplayBounds = new HashMap();
  }
  
  private void addChildrenToFlutterNode(AccessibilityNodeInfo paramAccessibilityNodeInfo1, View paramView, AccessibilityNodeInfo paramAccessibilityNodeInfo2)
  {
    for (int i = 0; i < paramAccessibilityNodeInfo1.getChildCount(); i++)
    {
      Object localObject = ReflectionAccessors.access$500(reflectionAccessors, paramAccessibilityNodeInfo1, i);
      if (localObject != null)
      {
        int j = ReflectionAccessors.access$200(((Long)localObject).longValue());
        localObject = new ViewAndId(paramView, j, null);
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
  
  private void cacheVirtualIdMappings(View paramView, int paramInt1, int paramInt2)
  {
    paramView = new ViewAndId(paramView, paramInt1, null);
    originToFlutterId.put(paramView, Integer.valueOf(paramInt2));
    flutterIdToOrigin.put(paramInt2, paramView);
  }
  
  private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo paramAccessibilityNodeInfo, int paramInt, View paramView)
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
  
  private void copyAccessibilityFields(AccessibilityNodeInfo paramAccessibilityNodeInfo1, AccessibilityNodeInfo paramAccessibilityNodeInfo2)
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
      f.l(paramAccessibilityNodeInfo2, a0.e.a(paramAccessibilityNodeInfo1));
      f.m(paramAccessibilityNodeInfo2, d.l(paramAccessibilityNodeInfo1));
    }
    if (i >= 26)
    {
      b.v(paramAccessibilityNodeInfo2, a.a(paramAccessibilityNodeInfo1));
      a.b(paramAccessibilityNodeInfo2, d2.e.l(paramAccessibilityNodeInfo1));
      b.w(paramAccessibilityNodeInfo2, a.c(paramAccessibilityNodeInfo1));
    }
  }
  
  private void setFlutterNodeParent(AccessibilityNodeInfo paramAccessibilityNodeInfo1, View paramView, AccessibilityNodeInfo paramAccessibilityNodeInfo2)
  {
    paramAccessibilityNodeInfo1 = ReflectionAccessors.access$300(reflectionAccessors, paramAccessibilityNodeInfo1);
    if (paramAccessibilityNodeInfo1 == null) {
      return;
    }
    int i = ReflectionAccessors.access$200(paramAccessibilityNodeInfo1.longValue());
    paramAccessibilityNodeInfo1 = (Integer)originToFlutterId.get(new ViewAndId(paramView, i, null));
    if (paramAccessibilityNodeInfo1 != null) {
      paramAccessibilityNodeInfo2.setParent(rootAccessibilityView, paramAccessibilityNodeInfo1.intValue());
    }
  }
  
  private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo paramAccessibilityNodeInfo1, Rect paramRect, AccessibilityNodeInfo paramAccessibilityNodeInfo2)
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
    ViewAndId localViewAndId = (ViewAndId)flutterIdToOrigin.get(paramInt);
    if (localViewAndId == null) {
      return null;
    }
    if (!embeddedViewToDisplayBounds.containsKey(view)) {
      return null;
    }
    if (view.getAccessibilityNodeProvider() == null) {
      return null;
    }
    AccessibilityNodeInfo localAccessibilityNodeInfo = view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(id);
    if (localAccessibilityNodeInfo == null) {
      return null;
    }
    return convertToFlutterNode(localAccessibilityNodeInfo, paramInt, view);
  }
  
  public Integer getRecordFlutterId(View paramView, AccessibilityRecord paramAccessibilityRecord)
  {
    paramAccessibilityRecord = ReflectionAccessors.access$600(reflectionAccessors, paramAccessibilityRecord);
    if (paramAccessibilityRecord == null) {
      return null;
    }
    int i = ReflectionAccessors.access$200(paramAccessibilityRecord.longValue());
    return (Integer)originToFlutterId.get(new ViewAndId(paramView, i, null));
  }
  
  public AccessibilityNodeInfo getRootNode(View paramView, int paramInt, Rect paramRect)
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = paramView.createAccessibilityNodeInfo();
    Long localLong = ReflectionAccessors.access$100(reflectionAccessors, localAccessibilityNodeInfo);
    if (localLong == null) {
      return null;
    }
    embeddedViewToDisplayBounds.put(paramView, paramRect);
    cacheVirtualIdMappings(paramView, ReflectionAccessors.access$200(localLong.longValue()), paramInt);
    return convertToFlutterNode(localAccessibilityNodeInfo, paramInt, paramView);
  }
  
  public boolean onAccessibilityHoverEvent(int paramInt, MotionEvent paramMotionEvent)
  {
    ViewAndId localViewAndId = (ViewAndId)flutterIdToOrigin.get(paramInt);
    paramInt = 0;
    if (localViewAndId == null) {
      return false;
    }
    Rect localRect = (Rect)embeddedViewToDisplayBounds.get(view);
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
    return view.dispatchGenericMotionEvent(paramMotionEvent);
  }
  
  public boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    ViewAndId localViewAndId = (ViewAndId)flutterIdToOrigin.get(paramInt1);
    if (localViewAndId == null) {
      return false;
    }
    AccessibilityNodeProvider localAccessibilityNodeProvider = view.getAccessibilityNodeProvider();
    if (localAccessibilityNodeProvider == null) {
      return false;
    }
    return localAccessibilityNodeProvider.performAction(id, paramInt2, paramBundle);
  }
  
  public View platformViewOfNode(int paramInt)
  {
    ViewAndId localViewAndId = (ViewAndId)flutterIdToOrigin.get(paramInt);
    if (localViewAndId == null) {
      return null;
    }
    return view;
  }
  
  public boolean requestSendAccessibilityEvent(View paramView1, View paramView2, AccessibilityEvent paramAccessibilityEvent)
  {
    AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain(paramAccessibilityEvent);
    Object localObject = ReflectionAccessors.access$600(reflectionAccessors, paramAccessibilityEvent);
    if (localObject == null) {
      return false;
    }
    int i = ReflectionAccessors.access$200(((Long)localObject).longValue());
    Integer localInteger = (Integer)originToFlutterId.get(new ViewAndId(paramView1, i, null));
    localObject = localInteger;
    int j;
    if (localInteger == null)
    {
      j = nextFlutterId;
      nextFlutterId = (j + 1);
      localObject = Integer.valueOf(j);
      cacheVirtualIdMappings(paramView1, i, ((Integer)localObject).intValue());
    }
    localAccessibilityEvent.setSource(rootAccessibilityView, ((Integer)localObject).intValue());
    localAccessibilityEvent.setClassName(paramAccessibilityEvent.getClassName());
    localAccessibilityEvent.setPackageName(paramAccessibilityEvent.getPackageName());
    for (i = 0; i < localAccessibilityEvent.getRecordCount(); i++)
    {
      paramAccessibilityEvent = localAccessibilityEvent.getRecord(i);
      localObject = ReflectionAccessors.access$600(reflectionAccessors, paramAccessibilityEvent);
      if (localObject == null) {
        return false;
      }
      localObject = new ViewAndId(paramView1, ReflectionAccessors.access$200(((Long)localObject).longValue()), null);
      if (!originToFlutterId.containsKey(localObject)) {
        return false;
      }
      j = ((Integer)originToFlutterId.get(localObject)).intValue();
      paramAccessibilityEvent.setSource(rootAccessibilityView, j);
    }
    return rootAccessibilityView.getParent().requestSendAccessibilityEvent(paramView2, localAccessibilityEvent);
  }
  
  public static class ReflectionAccessors
  {
    private final Field childNodeIdsField;
    private final Method getChildId;
    private final Method getParentNodeId;
    private final Method getRecordSourceNodeId;
    private final Method getSourceNodeId;
    private final Method longArrayGetIndex;
    
    private ReflectionAccessors()
    {
      Method localMethod1 = null;
      Method localMethod2 = null;
      Method localMethod4;
      try
      {
        Method localMethod3 = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", new Class[0]);
      }
      catch (NoSuchMethodException localNoSuchMethodException3)
      {
        Log.w("AccessibilityBridge", "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
        localMethod4 = null;
      }
      Method localMethod6;
      try
      {
        Method localMethod5 = AccessibilityRecord.class.getMethod("getSourceNodeId", new Class[0]);
      }
      catch (NoSuchMethodException localNoSuchMethodException4)
      {
        Log.w("AccessibilityBridge", "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
        localMethod6 = null;
      }
      Object localObject3;
      Object localObject2;
      if (Build.VERSION.SDK_INT <= 26)
      {
        try
        {
          localMethod2 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", new Class[0]);
        }
        catch (NoSuchMethodException localNoSuchMethodException2)
        {
          Log.w("AccessibilityBridge", "can't invoke getParentNodeId with reflection");
          localObject3 = null;
        }
        try
        {
          localMethod1 = AccessibilityNodeInfo.class.getMethod("getChildId", new Class[] { Integer.TYPE });
        }
        catch (NoSuchMethodException localNoSuchMethodException1)
        {
          Log.w("AccessibilityBridge", "can't invoke getChildId with reflection");
          localObject1 = null;
        }
        localObject4 = localObject3;
        localObject3 = localObject1;
        Object localObject1 = localObject4;
      }
      else
      {
        try
        {
          localField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
          localField.setAccessible(true);
          localObject4 = Class.forName("android.util.LongArray").getMethod("get", new Class[] { Integer.TYPE });
          localObject3 = null;
        }
        catch (NoSuchFieldException|ClassNotFoundException|NoSuchMethodException|NullPointerException localNoSuchFieldException)
        {
          Log.w("AccessibilityBridge", "can't access childNodeIdsField with reflection");
          localObject4 = null;
          localObject2 = localObject3;
          localObject3 = localObject4;
        }
      }
      Object localObject4 = null;
      Field localField = null;
      getSourceNodeId = localMethod4;
      getParentNodeId = ((Method)localObject2);
      getRecordSourceNodeId = localMethod6;
      getChildId = ((Method)localObject3);
      childNodeIdsField = localField;
      longArrayGetIndex = ((Method)localObject4);
    }
    
    private Long getChildId(AccessibilityNodeInfo paramAccessibilityNodeInfo, int paramInt)
    {
      Object localObject = getChildId;
      if ((localObject == null) && ((childNodeIdsField == null) || (longArrayGetIndex == null))) {
        return null;
      }
      if (localObject != null) {
        try
        {
          paramAccessibilityNodeInfo = (Long)((Method)localObject).invoke(paramAccessibilityNodeInfo, new Object[] { Integer.valueOf(paramInt) });
          return paramAccessibilityNodeInfo;
        }
        catch (InvocationTargetException paramAccessibilityNodeInfo)
        {
          localObject = "The getChildId method threw an exception when invoked.";
        }
        catch (IllegalAccessException paramAccessibilityNodeInfo)
        {
          localObject = "Failed to access getChildId method.";
        }
      } else {
        try
        {
          try
          {
            long l = ((Long)longArrayGetIndex.invoke(childNodeIdsField.get(paramAccessibilityNodeInfo), new Object[] { Integer.valueOf(paramInt) })).longValue();
            return Long.valueOf(l);
          }
          catch (ArrayIndexOutOfBoundsException paramAccessibilityNodeInfo) {}catch (InvocationTargetException paramAccessibilityNodeInfo) {}
          localObject = "The longArrayGetIndex method threw an exception when invoked.";
        }
        catch (IllegalAccessException paramAccessibilityNodeInfo)
        {
          localObject = "Failed to access longArrayGetIndex method or the childNodeId field.";
        }
      }
      Log.w("AccessibilityBridge", (String)localObject, paramAccessibilityNodeInfo);
      return null;
    }
    
    private Long getParentNodeId(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      Method localMethod = getParentNodeId;
      if (localMethod != null)
      {
        String str;
        try
        {
          long l = ((Long)localMethod.invoke(paramAccessibilityNodeInfo, new Object[0])).longValue();
          return Long.valueOf(l);
        }
        catch (InvocationTargetException localInvocationTargetException)
        {
          str = "The getParentNodeId method threw an exception when invoked.";
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          str = "Failed to access getParentNodeId method.";
        }
        Log.w("AccessibilityBridge", str, localIllegalAccessException);
      }
      return yoinkParentIdFromParcel(paramAccessibilityNodeInfo);
    }
    
    private Long getRecordSourceNodeId(AccessibilityRecord paramAccessibilityRecord)
    {
      Object localObject = getRecordSourceNodeId;
      if (localObject == null) {
        return null;
      }
      try
      {
        paramAccessibilityRecord = (Long)((Method)localObject).invoke(paramAccessibilityRecord, new Object[0]);
        return paramAccessibilityRecord;
      }
      catch (InvocationTargetException paramAccessibilityRecord)
      {
        localObject = "The getRecordSourceNodeId method threw an exception when invoked.";
      }
      catch (IllegalAccessException paramAccessibilityRecord)
      {
        localObject = "Failed to access the getRecordSourceNodeId method.";
      }
      Log.w("AccessibilityBridge", (String)localObject, paramAccessibilityRecord);
      return null;
    }
    
    private Long getSourceNodeId(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      Object localObject = getSourceNodeId;
      if (localObject == null) {
        return null;
      }
      try
      {
        paramAccessibilityNodeInfo = (Long)((Method)localObject).invoke(paramAccessibilityNodeInfo, new Object[0]);
        return paramAccessibilityNodeInfo;
      }
      catch (InvocationTargetException paramAccessibilityNodeInfo)
      {
        localObject = "The getSourceNodeId method threw an exception when invoked.";
      }
      catch (IllegalAccessException paramAccessibilityNodeInfo)
      {
        localObject = "Failed to access getSourceNodeId method.";
      }
      Log.w("AccessibilityBridge", (String)localObject, paramAccessibilityNodeInfo);
      return null;
    }
    
    private static int getVirtualNodeId(long paramLong)
    {
      return (int)(paramLong >> 32);
    }
    
    private static boolean isBitSet(long paramLong, int paramInt)
    {
      boolean bool;
      if ((paramLong & 1L << paramInt) != 0L) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    private static Long yoinkParentIdFromParcel(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      int i = Build.VERSION.SDK_INT;
      Object localObject = null;
      if (i < 26)
      {
        Log.w("AccessibilityBridge", "Unexpected Android version. Unable to find the parent ID.");
        return null;
      }
      paramAccessibilityNodeInfo = AccessibilityNodeInfo.obtain(paramAccessibilityNodeInfo);
      Parcel localParcel = Parcel.obtain();
      localParcel.setDataPosition(0);
      paramAccessibilityNodeInfo.writeToParcel(localParcel, 0);
      localParcel.setDataPosition(0);
      long l = localParcel.readLong();
      if (isBitSet(l, 0)) {
        localParcel.readInt();
      }
      if (isBitSet(l, 1)) {
        localParcel.readLong();
      }
      if (isBitSet(l, 2)) {
        localParcel.readInt();
      }
      paramAccessibilityNodeInfo = (AccessibilityNodeInfo)localObject;
      if (isBitSet(l, 3)) {
        paramAccessibilityNodeInfo = Long.valueOf(localParcel.readLong());
      }
      localParcel.recycle();
      return paramAccessibilityNodeInfo;
    }
  }
  
  public static class ViewAndId
  {
    public final int id;
    public final View view;
    
    private ViewAndId(View paramView, int paramInt)
    {
      view = paramView;
      id = paramInt;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof ViewAndId)) {
        return false;
      }
      paramObject = (ViewAndId)paramObject;
      if ((id != id) || (!view.equals(view))) {
        bool = false;
      }
      return bool;
    }
    
    public int hashCode()
    {
      return (view.hashCode() + 31) * 31 + id;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.AccessibilityViewEmbedder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */