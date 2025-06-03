package io.flutter.view;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import io.flutter.Log;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class AccessibilityViewEmbedder$ReflectionAccessors
{
  private final Field childNodeIdsField;
  private final Method getChildId;
  private final Method getParentNodeId;
  private final Method getRecordSourceNodeId;
  private final Method getSourceNodeId;
  private final Method longArrayGetIndex;
  
  private AccessibilityViewEmbedder$ReflectionAccessors()
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

/* Location:
 * Qualified Name:     io.flutter.view.AccessibilityViewEmbedder.ReflectionAccessors
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */