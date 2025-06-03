package androidx.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@Deprecated
class ClassesInfoCache$CallbackInfo
{
  public final Map<Lifecycle.Event, List<ClassesInfoCache.MethodReference>> mEventToHandlers;
  public final Map<ClassesInfoCache.MethodReference, Lifecycle.Event> mHandlerToEvent;
  
  public ClassesInfoCache$CallbackInfo(Map<ClassesInfoCache.MethodReference, Lifecycle.Event> paramMap)
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

/* Location:
 * Qualified Name:     androidx.lifecycle.ClassesInfoCache.CallbackInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */