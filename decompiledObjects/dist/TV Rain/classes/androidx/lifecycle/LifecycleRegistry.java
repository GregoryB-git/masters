package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.FastSafeIterableMap;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.arch.core.internal.SafeIterableMap.IteratorWithAdditions;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import z2;

public class LifecycleRegistry
  extends Lifecycle
{
  private int mAddingObserverCounter = 0;
  private final boolean mEnforceMainThread;
  private boolean mHandlingEvent = false;
  private final WeakReference<LifecycleOwner> mLifecycleOwner;
  private boolean mNewEventOccurred = false;
  private FastSafeIterableMap<LifecycleObserver, ObserverWithState> mObserverMap = new FastSafeIterableMap();
  private ArrayList<Lifecycle.State> mParentStates = new ArrayList();
  private Lifecycle.State mState;
  
  public LifecycleRegistry(@NonNull LifecycleOwner paramLifecycleOwner)
  {
    this(paramLifecycleOwner, true);
  }
  
  private LifecycleRegistry(@NonNull LifecycleOwner paramLifecycleOwner, boolean paramBoolean)
  {
    mLifecycleOwner = new WeakReference(paramLifecycleOwner);
    mState = Lifecycle.State.INITIALIZED;
    mEnforceMainThread = paramBoolean;
  }
  
  private void backwardPass(LifecycleOwner paramLifecycleOwner)
  {
    Iterator localIterator = mObserverMap.descendingIterator();
    while ((localIterator.hasNext()) && (!mNewEventOccurred))
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      ObserverWithState localObserverWithState = (ObserverWithState)localEntry.getValue();
      while ((mState.compareTo(mState) > 0) && (!mNewEventOccurred) && (mObserverMap.contains((LifecycleObserver)localEntry.getKey())))
      {
        Lifecycle.Event localEvent = Lifecycle.Event.downFrom(mState);
        if (localEvent == null) {
          break label125;
        }
        pushParentState(localEvent.getTargetState());
        localObserverWithState.dispatchEvent(paramLifecycleOwner, localEvent);
        popParentState();
      }
      continue;
      label125:
      paramLifecycleOwner = z2.t("no event down from ");
      paramLifecycleOwner.append(mState);
      throw new IllegalStateException(paramLifecycleOwner.toString());
    }
  }
  
  private Lifecycle.State calculateTargetState(LifecycleObserver paramLifecycleObserver)
  {
    paramLifecycleObserver = mObserverMap.ceil(paramLifecycleObserver);
    Object localObject = null;
    if (paramLifecycleObserver != null) {
      paramLifecycleObserver = getValuemState;
    } else {
      paramLifecycleObserver = null;
    }
    if (!mParentStates.isEmpty())
    {
      localObject = mParentStates;
      localObject = (Lifecycle.State)((ArrayList)localObject).get(((ArrayList)localObject).size() - 1);
    }
    return min(min(mState, paramLifecycleObserver), (Lifecycle.State)localObject);
  }
  
  @NonNull
  @VisibleForTesting
  public static LifecycleRegistry createUnsafe(@NonNull LifecycleOwner paramLifecycleOwner)
  {
    return new LifecycleRegistry(paramLifecycleOwner, false);
  }
  
  @SuppressLint({"RestrictedApi"})
  private void enforceMainThreadIfNeeded(String paramString)
  {
    if ((mEnforceMainThread) && (!ArchTaskExecutor.getInstance().isMainThread())) {
      throw new IllegalStateException(z2.p("Method ", paramString, " must be called on the main thread"));
    }
  }
  
  private void forwardPass(LifecycleOwner paramLifecycleOwner)
  {
    SafeIterableMap.IteratorWithAdditions localIteratorWithAdditions = mObserverMap.iteratorWithAdditions();
    while ((localIteratorWithAdditions.hasNext()) && (!mNewEventOccurred))
    {
      Map.Entry localEntry = (Map.Entry)localIteratorWithAdditions.next();
      ObserverWithState localObserverWithState = (ObserverWithState)localEntry.getValue();
      while ((mState.compareTo(mState) < 0) && (!mNewEventOccurred) && (mObserverMap.contains((LifecycleObserver)localEntry.getKey())))
      {
        pushParentState(mState);
        Lifecycle.Event localEvent = Lifecycle.Event.upFrom(mState);
        if (localEvent == null) {
          break label125;
        }
        localObserverWithState.dispatchEvent(paramLifecycleOwner, localEvent);
        popParentState();
      }
      continue;
      label125:
      paramLifecycleOwner = z2.t("no event up from ");
      paramLifecycleOwner.append(mState);
      throw new IllegalStateException(paramLifecycleOwner.toString());
    }
  }
  
  private boolean isSynced()
  {
    int i = mObserverMap.size();
    boolean bool = true;
    if (i == 0) {
      return true;
    }
    Lifecycle.State localState1 = mObserverMap.eldest().getValue()).mState;
    Lifecycle.State localState2 = mObserverMap.newest().getValue()).mState;
    if ((localState1 != localState2) || (mState != localState2)) {
      bool = false;
    }
    return bool;
  }
  
  public static Lifecycle.State min(@NonNull Lifecycle.State paramState1, @Nullable Lifecycle.State paramState2)
  {
    Lifecycle.State localState = paramState1;
    if (paramState2 != null)
    {
      localState = paramState1;
      if (paramState2.compareTo(paramState1) < 0) {
        localState = paramState2;
      }
    }
    return localState;
  }
  
  private void moveToState(Lifecycle.State paramState)
  {
    Lifecycle.State localState = mState;
    if (localState == paramState) {
      return;
    }
    if ((localState == Lifecycle.State.INITIALIZED) && (paramState == Lifecycle.State.DESTROYED))
    {
      paramState = z2.t("no event down from ");
      paramState.append(mState);
      throw new IllegalStateException(paramState.toString());
    }
    mState = paramState;
    if ((!mHandlingEvent) && (mAddingObserverCounter == 0))
    {
      mHandlingEvent = true;
      sync();
      mHandlingEvent = false;
      if (mState == Lifecycle.State.DESTROYED) {
        mObserverMap = new FastSafeIterableMap();
      }
      return;
    }
    mNewEventOccurred = true;
  }
  
  private void popParentState()
  {
    ArrayList localArrayList = mParentStates;
    localArrayList.remove(localArrayList.size() - 1);
  }
  
  private void pushParentState(Lifecycle.State paramState)
  {
    mParentStates.add(paramState);
  }
  
  private void sync()
  {
    LifecycleOwner localLifecycleOwner = (LifecycleOwner)mLifecycleOwner.get();
    if (localLifecycleOwner != null)
    {
      while (!isSynced())
      {
        mNewEventOccurred = false;
        if (mState.compareTo(mObserverMap.eldest().getValue()).mState) < 0) {
          backwardPass(localLifecycleOwner);
        }
        Map.Entry localEntry = mObserverMap.newest();
        if ((!mNewEventOccurred) && (localEntry != null) && (mState.compareTo(getValuemState) > 0)) {
          forwardPass(localLifecycleOwner);
        }
      }
      mNewEventOccurred = false;
      return;
    }
    throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
  }
  
  public void addObserver(@NonNull LifecycleObserver paramLifecycleObserver)
  {
    enforceMainThreadIfNeeded("addObserver");
    Object localObject1 = mState;
    Object localObject2 = Lifecycle.State.DESTROYED;
    if (localObject1 != localObject2) {
      localObject2 = Lifecycle.State.INITIALIZED;
    }
    localObject1 = new ObserverWithState(paramLifecycleObserver, (Lifecycle.State)localObject2);
    if ((ObserverWithState)mObserverMap.putIfAbsent(paramLifecycleObserver, localObject1) != null) {
      return;
    }
    LifecycleOwner localLifecycleOwner = (LifecycleOwner)mLifecycleOwner.get();
    if (localLifecycleOwner == null) {
      return;
    }
    int i;
    if ((mAddingObserverCounter == 0) && (!mHandlingEvent)) {
      i = 0;
    } else {
      i = 1;
    }
    localObject2 = calculateTargetState(paramLifecycleObserver);
    mAddingObserverCounter += 1;
    while ((mState.compareTo((Enum)localObject2) < 0) && (mObserverMap.contains(paramLifecycleObserver)))
    {
      pushParentState(mState);
      localObject2 = Lifecycle.Event.upFrom(mState);
      if (localObject2 != null)
      {
        ((ObserverWithState)localObject1).dispatchEvent(localLifecycleOwner, (Lifecycle.Event)localObject2);
        popParentState();
        localObject2 = calculateTargetState(paramLifecycleObserver);
      }
      else
      {
        paramLifecycleObserver = z2.t("no event up from ");
        paramLifecycleObserver.append(mState);
        throw new IllegalStateException(paramLifecycleObserver.toString());
      }
    }
    if (i == 0) {
      sync();
    }
    mAddingObserverCounter -= 1;
  }
  
  @NonNull
  public Lifecycle.State getCurrentState()
  {
    return mState;
  }
  
  public int getObserverCount()
  {
    enforceMainThreadIfNeeded("getObserverCount");
    return mObserverMap.size();
  }
  
  public void handleLifecycleEvent(@NonNull Lifecycle.Event paramEvent)
  {
    enforceMainThreadIfNeeded("handleLifecycleEvent");
    moveToState(paramEvent.getTargetState());
  }
  
  @Deprecated
  @MainThread
  public void markState(@NonNull Lifecycle.State paramState)
  {
    enforceMainThreadIfNeeded("markState");
    setCurrentState(paramState);
  }
  
  public void removeObserver(@NonNull LifecycleObserver paramLifecycleObserver)
  {
    enforceMainThreadIfNeeded("removeObserver");
    mObserverMap.remove(paramLifecycleObserver);
  }
  
  @MainThread
  public void setCurrentState(@NonNull Lifecycle.State paramState)
  {
    enforceMainThreadIfNeeded("setCurrentState");
    moveToState(paramState);
  }
  
  public static class ObserverWithState
  {
    public LifecycleEventObserver mLifecycleObserver;
    public Lifecycle.State mState;
    
    public ObserverWithState(LifecycleObserver paramLifecycleObserver, Lifecycle.State paramState)
    {
      mLifecycleObserver = Lifecycling.lifecycleEventObserver(paramLifecycleObserver);
      mState = paramState;
    }
    
    public void dispatchEvent(LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent)
    {
      Lifecycle.State localState = paramEvent.getTargetState();
      mState = LifecycleRegistry.min(mState, localState);
      mLifecycleObserver.onStateChanged(paramLifecycleOwner, paramEvent);
      mState = localState;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.LifecycleRegistry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */