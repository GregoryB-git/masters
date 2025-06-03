package io.flutter.view;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import t5.b;

public class AccessibilityViewEmbedder$b
{
  public final Method a;
  public final Method b;
  public final Method c;
  public final Method d;
  public final Field e;
  public final Method f;
  
  public AccessibilityViewEmbedder$b()
  {
    Object localObject1 = null;
    Method localMethod1;
    try
    {
      localMethod1 = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", new Class[0]);
    }
    catch (NoSuchMethodException localNoSuchMethodException1)
    {
      b.g("AccessibilityBridge", "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
      localMethod1 = null;
    }
    Method localMethod4;
    try
    {
      localMethod4 = AccessibilityRecord.class.getMethod("getSourceNodeId", new Class[0]);
    }
    catch (NoSuchMethodException localNoSuchMethodException2)
    {
      b.g("AccessibilityBridge", "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
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
        b.g("AccessibilityBridge", "can't invoke getParentNodeId with reflection");
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
          b.g("AccessibilityBridge", "can't invoke getChildId with reflection");
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
        b.g("AccessibilityBridge", "can't access childNodeIdsField with reflection");
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
      b.g("AccessibilityBridge", "Unexpected Android version. Unable to find the parent ID.");
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
      b.h("AccessibilityBridge", (String)localObject, paramAccessibilityNodeInfo);
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
        b.h("AccessibilityBridge", (String)localObject, localIllegalAccessException);
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
      b.h("AccessibilityBridge", (String)localObject, paramAccessibilityRecord);
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
      b.h("AccessibilityBridge", paramAccessibilityNodeInfo, localIllegalAccessException);
      break;
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.AccessibilityViewEmbedder.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */