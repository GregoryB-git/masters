package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.arch.core.internal.SafeIterableMap.IteratorWithAdditions;
import java.util.Iterator;
import java.util.Map.Entry;
import z2;

public abstract class LiveData<T>
{
  public static final Object NOT_SET = new Object();
  public static final int START_VERSION = -1;
  public int mActiveCount = 0;
  private boolean mChangingActiveState;
  private volatile Object mData;
  public final Object mDataLock = new Object();
  private boolean mDispatchInvalidated;
  private boolean mDispatchingValue;
  private SafeIterableMap<Observer<? super T>, LiveData<T>.ObserverWrapper> mObservers = new SafeIterableMap();
  public volatile Object mPendingData;
  private final Runnable mPostValueRunnable;
  private int mVersion;
  
  public LiveData()
  {
    Object localObject = NOT_SET;
    mPendingData = localObject;
    mPostValueRunnable = new Runnable()
    {
      public void run()
      {
        synchronized (mDataLock)
        {
          Object localObject2 = mPendingData;
          mPendingData = LiveData.NOT_SET;
          setValue(localObject2);
          return;
        }
      }
    };
    mData = localObject;
    mVersion = -1;
  }
  
  public LiveData(T paramT)
  {
    mPendingData = NOT_SET;
    mPostValueRunnable = new Runnable()
    {
      public void run()
      {
        synchronized (mDataLock)
        {
          Object localObject2 = mPendingData;
          mPendingData = LiveData.NOT_SET;
          setValue(localObject2);
          return;
        }
      }
    };
    mData = paramT;
    mVersion = 0;
  }
  
  public static void assertMainThread(String paramString)
  {
    if (ArchTaskExecutor.getInstance().isMainThread()) {
      return;
    }
    throw new IllegalStateException(z2.p("Cannot invoke ", paramString, " on a background thread"));
  }
  
  private void considerNotify(LiveData<T>.ObserverWrapper paramLiveData)
  {
    if (!mActive) {
      return;
    }
    if (!paramLiveData.shouldBeActive())
    {
      paramLiveData.activeStateChanged(false);
      return;
    }
    int i = mLastVersion;
    int j = mVersion;
    if (i >= j) {
      return;
    }
    mLastVersion = j;
    mObserver.onChanged(mData);
  }
  
  @MainThread
  public void changeActiveCounter(int paramInt)
  {
    int i = mActiveCount;
    mActiveCount = (paramInt + i);
    if (mChangingActiveState) {
      return;
    }
    mChangingActiveState = true;
    try
    {
      for (;;)
      {
        int j = mActiveCount;
        if (i == j) {
          break;
        }
        if ((i == 0) && (j > 0)) {
          paramInt = 1;
        } else {
          paramInt = 0;
        }
        if ((i > 0) && (j == 0)) {
          i = 1;
        } else {
          i = 0;
        }
        if (paramInt != 0) {
          onActive();
        } else if (i != 0) {
          onInactive();
        }
        i = j;
      }
      return;
    }
    finally
    {
      mChangingActiveState = false;
    }
  }
  
  public void dispatchingValue(@Nullable LiveData<T>.ObserverWrapper paramLiveData)
  {
    if (mDispatchingValue)
    {
      mDispatchInvalidated = true;
      return;
    }
    mDispatchingValue = true;
    LiveData<T>.ObserverWrapper localLiveData = paramLiveData;
    do
    {
      mDispatchInvalidated = false;
      if (localLiveData != null)
      {
        considerNotify(localLiveData);
        paramLiveData = null;
      }
      else
      {
        SafeIterableMap.IteratorWithAdditions localIteratorWithAdditions = mObservers.iteratorWithAdditions();
        do
        {
          paramLiveData = localLiveData;
          if (!localIteratorWithAdditions.hasNext()) {
            break;
          }
          considerNotify((ObserverWrapper)((Map.Entry)localIteratorWithAdditions.next()).getValue());
        } while (!mDispatchInvalidated);
        paramLiveData = localLiveData;
      }
      localLiveData = paramLiveData;
    } while (mDispatchInvalidated);
    mDispatchingValue = false;
  }
  
  @Nullable
  public T getValue()
  {
    Object localObject = mData;
    if (localObject != NOT_SET) {
      return (T)localObject;
    }
    return null;
  }
  
  public int getVersion()
  {
    return mVersion;
  }
  
  public boolean hasActiveObservers()
  {
    boolean bool;
    if (mActiveCount > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean hasObservers()
  {
    boolean bool;
    if (mObservers.size() > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @MainThread
  public void observe(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull Observer<? super T> paramObserver)
  {
    assertMainThread("observe");
    if (paramLifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
      return;
    }
    LifecycleBoundObserver localLifecycleBoundObserver = new LifecycleBoundObserver(paramLifecycleOwner, paramObserver);
    paramObserver = (ObserverWrapper)mObservers.putIfAbsent(paramObserver, localLifecycleBoundObserver);
    if ((paramObserver != null) && (!paramObserver.isAttachedTo(paramLifecycleOwner))) {
      throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }
    if (paramObserver != null) {
      return;
    }
    paramLifecycleOwner.getLifecycle().addObserver(localLifecycleBoundObserver);
  }
  
  @MainThread
  public void observeForever(@NonNull Observer<? super T> paramObserver)
  {
    assertMainThread("observeForever");
    AlwaysActiveObserver localAlwaysActiveObserver = new AlwaysActiveObserver(paramObserver);
    paramObserver = (ObserverWrapper)mObservers.putIfAbsent(paramObserver, localAlwaysActiveObserver);
    if (!(paramObserver instanceof LifecycleBoundObserver))
    {
      if (paramObserver != null) {
        return;
      }
      localAlwaysActiveObserver.activeStateChanged(true);
      return;
    }
    throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
  }
  
  public void onActive() {}
  
  public void onInactive() {}
  
  public void postValue(T paramT)
  {
    synchronized (mDataLock)
    {
      int i;
      if (mPendingData == NOT_SET) {
        i = 1;
      } else {
        i = 0;
      }
      mPendingData = paramT;
      if (i == 0) {
        return;
      }
      ArchTaskExecutor.getInstance().postToMainThread(mPostValueRunnable);
      return;
    }
  }
  
  @MainThread
  public void removeObserver(@NonNull Observer<? super T> paramObserver)
  {
    assertMainThread("removeObserver");
    paramObserver = (ObserverWrapper)mObservers.remove(paramObserver);
    if (paramObserver == null) {
      return;
    }
    paramObserver.detachObserver();
    paramObserver.activeStateChanged(false);
  }
  
  @MainThread
  public void removeObservers(@NonNull LifecycleOwner paramLifecycleOwner)
  {
    assertMainThread("removeObservers");
    Iterator localIterator = mObservers.iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (((ObserverWrapper)localEntry.getValue()).isAttachedTo(paramLifecycleOwner)) {
        removeObserver((Observer)localEntry.getKey());
      }
    }
  }
  
  @MainThread
  public void setValue(T paramT)
  {
    assertMainThread("setValue");
    mVersion += 1;
    mData = paramT;
    dispatchingValue(null);
  }
  
  public class AlwaysActiveObserver
    extends LiveData<T>.ObserverWrapper
  {
    public AlwaysActiveObserver()
    {
      super(localObserver);
    }
    
    public boolean shouldBeActive()
    {
      return true;
    }
  }
  
  public class LifecycleBoundObserver
    extends LiveData<T>.ObserverWrapper
    implements LifecycleEventObserver
  {
    @NonNull
    public final LifecycleOwner mOwner;
    
    public LifecycleBoundObserver(Observer<? super T> paramObserver)
    {
      super(localObserver);
      mOwner = paramObserver;
    }
    
    public void detachObserver()
    {
      mOwner.getLifecycle().removeObserver(this);
    }
    
    public boolean isAttachedTo(LifecycleOwner paramLifecycleOwner)
    {
      boolean bool;
      if (mOwner == paramLifecycleOwner) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void onStateChanged(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.Event paramEvent)
    {
      paramLifecycleOwner = mOwner.getLifecycle().getCurrentState();
      if (paramLifecycleOwner == Lifecycle.State.DESTROYED)
      {
        removeObserver(mObserver);
        return;
      }
      paramEvent = null;
      while (paramEvent != paramLifecycleOwner)
      {
        activeStateChanged(shouldBeActive());
        Lifecycle.State localState = mOwner.getLifecycle().getCurrentState();
        paramEvent = paramLifecycleOwner;
        paramLifecycleOwner = localState;
      }
    }
    
    public boolean shouldBeActive()
    {
      return mOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED);
    }
  }
  
  public abstract class ObserverWrapper
  {
    public boolean mActive;
    public int mLastVersion = -1;
    public final Observer<? super T> mObserver;
    
    public ObserverWrapper()
    {
      Observer localObserver;
      mObserver = localObserver;
    }
    
    public void activeStateChanged(boolean paramBoolean)
    {
      if (paramBoolean == mActive) {
        return;
      }
      mActive = paramBoolean;
      LiveData localLiveData = LiveData.this;
      int i;
      if (paramBoolean) {
        i = 1;
      } else {
        i = -1;
      }
      localLiveData.changeActiveCounter(i);
      if (mActive) {
        dispatchingValue(this);
      }
    }
    
    public void detachObserver() {}
    
    public boolean isAttachedTo(LifecycleOwner paramLifecycleOwner)
    {
      return false;
    }
    
    public abstract boolean shouldBeActive();
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.LiveData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */