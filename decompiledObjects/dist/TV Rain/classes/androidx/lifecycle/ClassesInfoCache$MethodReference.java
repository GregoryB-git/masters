package androidx.lifecycle;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Deprecated
final class ClassesInfoCache$MethodReference
{
  public final int mCallType;
  public final Method mMethod;
  
  public ClassesInfoCache$MethodReference(int paramInt, Method paramMethod)
  {
    mCallType = paramInt;
    mMethod = paramMethod;
    paramMethod.setAccessible(true);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof MethodReference)) {
      return false;
    }
    paramObject = (MethodReference)paramObject;
    if ((mCallType != mCallType) || (!mMethod.getName().equals(mMethod.getName()))) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    int i = mCallType;
    return mMethod.getName().hashCode() + i * 31;
  }
  
  public void invokeCallback(LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent, Object paramObject)
  {
    try
    {
      int i = mCallType;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i == 2) {
            mMethod.invoke(paramObject, new Object[] { paramLifecycleOwner, paramEvent });
          }
        }
        else {
          mMethod.invoke(paramObject, new Object[] { paramLifecycleOwner });
        }
      }
      else {
        mMethod.invoke(paramObject, new Object[0]);
      }
      return;
    }
    catch (IllegalAccessException paramLifecycleOwner)
    {
      throw new RuntimeException(paramLifecycleOwner);
    }
    catch (InvocationTargetException paramLifecycleOwner)
    {
      throw new RuntimeException("Failed to call observer method", paramLifecycleOwner.getCause());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ClassesInfoCache.MethodReference
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */