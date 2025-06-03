package androidx.lifecycle;

import androidx.annotation.Nullable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import z2;

@Deprecated
final class ClassesInfoCache
{
  private static final int CALL_TYPE_NO_ARG = 0;
  private static final int CALL_TYPE_PROVIDER = 1;
  private static final int CALL_TYPE_PROVIDER_WITH_EVENT = 2;
  public static ClassesInfoCache sInstance = new ClassesInfoCache();
  private final Map<Class<?>, CallbackInfo> mCallbackMap = new HashMap();
  private final Map<Class<?>, Boolean> mHasLifecycleMethods = new HashMap();
  
  private CallbackInfo createInfo(Class<?> paramClass, @Nullable Method[] paramArrayOfMethod)
  {
    Object localObject1 = paramClass.getSuperclass();
    HashMap localHashMap = new HashMap();
    if (localObject1 != null)
    {
      localObject1 = getInfo((Class)localObject1);
      if (localObject1 != null) {
        localHashMap.putAll(mHandlerToEvent);
      }
    }
    Object localObject2 = paramClass.getInterfaces();
    int i = localObject2.length;
    Object localObject3;
    for (int j = 0; j < i; j++)
    {
      localObject3 = getInfomHandlerToEvent.entrySet().iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject1 = (Map.Entry)((Iterator)localObject3).next();
        verifyAndPutHandler(localHashMap, (MethodReference)((Map.Entry)localObject1).getKey(), (Lifecycle.Event)((Map.Entry)localObject1).getValue(), paramClass);
      }
    }
    if (paramArrayOfMethod == null) {
      paramArrayOfMethod = getDeclaredMethods(paramClass);
    }
    int k = paramArrayOfMethod.length;
    i = 0;
    j = i;
    while (i < k)
    {
      localObject3 = paramArrayOfMethod[i];
      localObject2 = (OnLifecycleEvent)((Method)localObject3).getAnnotation(OnLifecycleEvent.class);
      if (localObject2 != null)
      {
        localObject1 = ((Method)localObject3).getParameterTypes();
        if (localObject1.length > 0)
        {
          if (localObject1[0].isAssignableFrom(LifecycleOwner.class)) {
            j = 1;
          } else {
            throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
          }
        }
        else {
          j = 0;
        }
        localObject2 = ((OnLifecycleEvent)localObject2).value();
        if (localObject1.length > 1) {
          if (localObject1[1].isAssignableFrom(Lifecycle.Event.class))
          {
            if (localObject2 == Lifecycle.Event.ON_ANY) {
              j = 2;
            } else {
              throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
            }
          }
          else {
            throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
          }
        }
        if (localObject1.length <= 2)
        {
          verifyAndPutHandler(localHashMap, new MethodReference(j, (Method)localObject3), (Lifecycle.Event)localObject2, paramClass);
          j = 1;
        }
      }
      else
      {
        i++;
        continue;
      }
      throw new IllegalArgumentException("cannot have more than 2 params");
    }
    paramArrayOfMethod = new CallbackInfo(localHashMap);
    mCallbackMap.put(paramClass, paramArrayOfMethod);
    mHasLifecycleMethods.put(paramClass, Boolean.valueOf(j));
    return paramArrayOfMethod;
  }
  
  private Method[] getDeclaredMethods(Class<?> paramClass)
  {
    try
    {
      paramClass = paramClass.getDeclaredMethods();
      return paramClass;
    }
    catch (NoClassDefFoundError paramClass)
    {
      throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", paramClass);
    }
  }
  
  private void verifyAndPutHandler(Map<MethodReference, Lifecycle.Event> paramMap, MethodReference paramMethodReference, Lifecycle.Event paramEvent, Class<?> paramClass)
  {
    Lifecycle.Event localEvent = (Lifecycle.Event)paramMap.get(paramMethodReference);
    if ((localEvent != null) && (paramEvent != localEvent))
    {
      paramMethodReference = mMethod;
      paramMap = z2.t("Method ");
      paramMap.append(paramMethodReference.getName());
      paramMap.append(" in ");
      paramMap.append(paramClass.getName());
      paramMap.append(" already declared with different @OnLifecycleEvent value: previous value ");
      paramMap.append(localEvent);
      paramMap.append(", new value ");
      paramMap.append(paramEvent);
      throw new IllegalArgumentException(paramMap.toString());
    }
    if (localEvent == null) {
      paramMap.put(paramMethodReference, paramEvent);
    }
  }
  
  public CallbackInfo getInfo(Class<?> paramClass)
  {
    CallbackInfo localCallbackInfo = (CallbackInfo)mCallbackMap.get(paramClass);
    if (localCallbackInfo != null) {
      return localCallbackInfo;
    }
    return createInfo(paramClass, null);
  }
  
  public boolean hasLifecycleMethods(Class<?> paramClass)
  {
    Object localObject = (Boolean)mHasLifecycleMethods.get(paramClass);
    if (localObject != null) {
      return ((Boolean)localObject).booleanValue();
    }
    localObject = getDeclaredMethods(paramClass);
    int i = localObject.length;
    for (int j = 0; j < i; j++) {
      if ((OnLifecycleEvent)localObject[j].getAnnotation(OnLifecycleEvent.class) != null)
      {
        createInfo(paramClass, (Method[])localObject);
        return true;
      }
    }
    mHasLifecycleMethods.put(paramClass, Boolean.FALSE);
    return false;
  }
  
  @Deprecated
  public static class CallbackInfo
  {
    public final Map<Lifecycle.Event, List<ClassesInfoCache.MethodReference>> mEventToHandlers;
    public final Map<ClassesInfoCache.MethodReference, Lifecycle.Event> mHandlerToEvent;
    
    public CallbackInfo(Map<ClassesInfoCache.MethodReference, Lifecycle.Event> paramMap)
    {
      mHandlerToEvent = paramMap;
      mEventToHandlers = new HashMap();
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        Lifecycle.Event localEvent = (Lifecycle.Event)localEntry.getValue();
        List localList = (List)mEventToHandlers.get(localEvent);
        paramMap = localList;
        if (localList == null)
        {
          paramMap = new ArrayList();
          mEventToHandlers.put(localEvent, paramMap);
        }
        paramMap.add((ClassesInfoCache.MethodReference)localEntry.getKey());
      }
    }
    
    private static void invokeMethodsForEvent(List<ClassesInfoCache.MethodReference> paramList, LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent, Object paramObject)
    {
      if (paramList != null) {
        for (int i = paramList.size() - 1; i >= 0; i--) {
          ((ClassesInfoCache.MethodReference)paramList.get(i)).invokeCallback(paramLifecycleOwner, paramEvent, paramObject);
        }
      }
    }
    
    public void invokeCallbacks(LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent, Object paramObject)
    {
      invokeMethodsForEvent((List)mEventToHandlers.get(paramEvent), paramLifecycleOwner, paramEvent, paramObject);
      invokeMethodsForEvent((List)mEventToHandlers.get(Lifecycle.Event.ON_ANY), paramLifecycleOwner, paramEvent, paramObject);
    }
  }
  
  @Deprecated
  public static final class MethodReference
  {
    public final int mCallType;
    public final Method mMethod;
    
    public MethodReference(int paramInt, Method paramMethod)
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
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ClassesInfoCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */