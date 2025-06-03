package androidx.lifecycle;

import androidx.annotation.NonNull;

class CompositeGeneratedAdaptersObserver
  implements LifecycleEventObserver
{
  private final GeneratedAdapter[] mGeneratedAdapters;
  
  public CompositeGeneratedAdaptersObserver(GeneratedAdapter[] paramArrayOfGeneratedAdapter)
  {
    mGeneratedAdapters = paramArrayOfGeneratedAdapter;
  }
  
  public void onStateChanged(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.Event paramEvent)
  {
    MethodCallsLogger localMethodCallsLogger = new MethodCallsLogger();
    GeneratedAdapter[] arrayOfGeneratedAdapter = mGeneratedAdapters;
    int i = arrayOfGeneratedAdapter.length;
    int j = 0;
    for (int k = 0; k < i; k++) {
      arrayOfGeneratedAdapter[k].callMethods(paramLifecycleOwner, paramEvent, false, localMethodCallsLogger);
    }
    arrayOfGeneratedAdapter = mGeneratedAdapters;
    i = arrayOfGeneratedAdapter.length;
    for (k = j; k < i; k++) {
      arrayOfGeneratedAdapter[k].callMethods(paramLifecycleOwner, paramEvent, true, localMethodCallsLogger);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.CompositeGeneratedAdaptersObserver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */