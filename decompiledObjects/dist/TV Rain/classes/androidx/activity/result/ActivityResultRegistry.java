package androidx.activity.result;

import a;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import z2;

public abstract class ActivityResultRegistry
{
  private static final int INITIAL_REQUEST_CODE_VALUE = 65536;
  private static final String KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";
  private static final String KEY_COMPONENT_ACTIVITY_PENDING_RESULTS = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";
  private static final String KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT";
  private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";
  private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_RCS = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";
  private static final String LOG_TAG = "ActivityResultRegistry";
  public final transient Map<String, CallbackAndContract<?>> mKeyToCallback = new HashMap();
  private final Map<String, LifecycleContainer> mKeyToLifecycleContainers = new HashMap();
  public final Map<String, Integer> mKeyToRc = new HashMap();
  public ArrayList<String> mLaunchedKeys = new ArrayList();
  public final Map<String, Object> mParsedPendingResults = new HashMap();
  public final Bundle mPendingResults = new Bundle();
  private Random mRandom = new Random();
  private final Map<Integer, String> mRcToKey = new HashMap();
  
  private void bindRcKey(int paramInt, String paramString)
  {
    mRcToKey.put(Integer.valueOf(paramInt), paramString);
    mKeyToRc.put(paramString, Integer.valueOf(paramInt));
  }
  
  private <O> void doDispatch(String paramString, int paramInt, @Nullable Intent paramIntent, @Nullable CallbackAndContract<O> paramCallbackAndContract)
  {
    if ((paramCallbackAndContract != null) && (mCallback != null) && (mLaunchedKeys.contains(paramString)))
    {
      mCallback.onActivityResult(mContract.parseResult(paramInt, paramIntent));
      mLaunchedKeys.remove(paramString);
    }
    else
    {
      mParsedPendingResults.remove(paramString);
      mPendingResults.putParcelable(paramString, new ActivityResult(paramInt, paramIntent));
    }
  }
  
  private int generateRandomNumber()
  {
    for (int i = mRandom.nextInt(2147418112);; i = mRandom.nextInt(2147418112))
    {
      i += 65536;
      if (!mRcToKey.containsKey(Integer.valueOf(i))) {
        break;
      }
    }
    return i;
  }
  
  private void registerKey(String paramString)
  {
    if ((Integer)mKeyToRc.get(paramString) != null) {
      return;
    }
    bindRcKey(generateRandomNumber(), paramString);
  }
  
  @MainThread
  public final boolean dispatchResult(int paramInt1, int paramInt2, @Nullable Intent paramIntent)
  {
    String str = (String)mRcToKey.get(Integer.valueOf(paramInt1));
    if (str == null) {
      return false;
    }
    doDispatch(str, paramInt2, paramIntent, (CallbackAndContract)mKeyToCallback.get(str));
    return true;
  }
  
  @MainThread
  public final <O> boolean dispatchResult(int paramInt, @SuppressLint({"UnknownNullness"}) O paramO)
  {
    String str = (String)mRcToKey.get(Integer.valueOf(paramInt));
    if (str == null) {
      return false;
    }
    Object localObject = (CallbackAndContract)mKeyToCallback.get(str);
    if (localObject != null)
    {
      localObject = mCallback;
      if (localObject != null)
      {
        if (!mLaunchedKeys.remove(str)) {
          break label100;
        }
        ((ActivityResultCallback)localObject).onActivityResult(paramO);
        break label100;
      }
    }
    mPendingResults.remove(str);
    mParsedPendingResults.put(str, paramO);
    label100:
    return true;
  }
  
  @MainThread
  public abstract <I, O> void onLaunch(int paramInt, @NonNull ActivityResultContract<I, O> paramActivityResultContract, @SuppressLint({"UnknownNullness"}) I paramI, @Nullable ActivityOptionsCompat paramActivityOptionsCompat);
  
  public final void onRestoreInstanceState(@Nullable Bundle paramBundle)
  {
    if (paramBundle == null) {
      return;
    }
    ArrayList localArrayList1 = paramBundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
    ArrayList localArrayList2 = paramBundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
    if ((localArrayList2 != null) && (localArrayList1 != null))
    {
      mLaunchedKeys = paramBundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
      mRandom = ((Random)paramBundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT"));
      mPendingResults.putAll(paramBundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
      for (int i = 0; i < localArrayList2.size(); i++)
      {
        String str = (String)localArrayList2.get(i);
        if (mKeyToRc.containsKey(str))
        {
          paramBundle = (Integer)mKeyToRc.remove(str);
          if (!mPendingResults.containsKey(str)) {
            mRcToKey.remove(paramBundle);
          }
        }
        bindRcKey(((Integer)localArrayList1.get(i)).intValue(), (String)localArrayList2.get(i));
      }
    }
  }
  
  public final void onSaveInstanceState(@NonNull Bundle paramBundle)
  {
    paramBundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(mKeyToRc.values()));
    paramBundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(mKeyToRc.keySet()));
    paramBundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(mLaunchedKeys));
    paramBundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle)mPendingResults.clone());
    paramBundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", mRandom);
  }
  
  @NonNull
  public final <I, O> ActivityResultLauncher<I> register(@NonNull final String paramString, @NonNull final ActivityResultContract<I, O> paramActivityResultContract, @NonNull ActivityResultCallback<O> paramActivityResultCallback)
  {
    registerKey(paramString);
    mKeyToCallback.put(paramString, new CallbackAndContract(paramActivityResultCallback, paramActivityResultContract));
    if (mParsedPendingResults.containsKey(paramString))
    {
      localObject = mParsedPendingResults.get(paramString);
      mParsedPendingResults.remove(paramString);
      paramActivityResultCallback.onActivityResult(localObject);
    }
    Object localObject = (ActivityResult)mPendingResults.getParcelable(paramString);
    if (localObject != null)
    {
      mPendingResults.remove(paramString);
      paramActivityResultCallback.onActivityResult(paramActivityResultContract.parseResult(((ActivityResult)localObject).getResultCode(), ((ActivityResult)localObject).getData()));
    }
    new ActivityResultLauncher()
    {
      @NonNull
      public ActivityResultContract<I, ?> getContract()
      {
        return paramActivityResultContract;
      }
      
      public void launch(I paramAnonymousI, @Nullable ActivityOptionsCompat paramAnonymousActivityOptionsCompat)
      {
        Integer localInteger = (Integer)mKeyToRc.get(paramString);
        if (localInteger != null)
        {
          mLaunchedKeys.add(paramString);
          try
          {
            onLaunch(localInteger.intValue(), paramActivityResultContract, paramAnonymousI, paramAnonymousActivityOptionsCompat);
            return;
          }
          catch (Exception paramAnonymousI)
          {
            mLaunchedKeys.remove(paramString);
            throw paramAnonymousI;
          }
        }
        paramAnonymousActivityOptionsCompat = z2.t("Attempting to launch an unregistered ActivityResultLauncher with contract ");
        paramAnonymousActivityOptionsCompat.append(paramActivityResultContract);
        paramAnonymousActivityOptionsCompat.append(" and input ");
        paramAnonymousActivityOptionsCompat.append(paramAnonymousI);
        paramAnonymousActivityOptionsCompat.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
        throw new IllegalStateException(paramAnonymousActivityOptionsCompat.toString());
      }
      
      public void unregister()
      {
        unregister(paramString);
      }
    };
  }
  
  @NonNull
  public final <I, O> ActivityResultLauncher<I> register(@NonNull final String paramString, @NonNull LifecycleOwner paramLifecycleOwner, @NonNull final ActivityResultContract<I, O> paramActivityResultContract, @NonNull final ActivityResultCallback<O> paramActivityResultCallback)
  {
    Lifecycle localLifecycle = paramLifecycleOwner.getLifecycle();
    if (!localLifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED))
    {
      registerKey(paramString);
      LifecycleContainer localLifecycleContainer = (LifecycleContainer)mKeyToLifecycleContainers.get(paramString);
      paramLifecycleOwner = localLifecycleContainer;
      if (localLifecycleContainer == null) {
        paramLifecycleOwner = new LifecycleContainer(localLifecycle);
      }
      paramLifecycleOwner.addObserver(new LifecycleEventObserver()
      {
        public void onStateChanged(@NonNull LifecycleOwner paramAnonymousLifecycleOwner, @NonNull Lifecycle.Event paramAnonymousEvent)
        {
          if (Lifecycle.Event.ON_START.equals(paramAnonymousEvent))
          {
            mKeyToCallback.put(paramString, new ActivityResultRegistry.CallbackAndContract(paramActivityResultCallback, paramActivityResultContract));
            if (mParsedPendingResults.containsKey(paramString))
            {
              paramAnonymousLifecycleOwner = mParsedPendingResults.get(paramString);
              mParsedPendingResults.remove(paramString);
              paramActivityResultCallback.onActivityResult(paramAnonymousLifecycleOwner);
            }
            paramAnonymousLifecycleOwner = (ActivityResult)mPendingResults.getParcelable(paramString);
            if (paramAnonymousLifecycleOwner != null)
            {
              mPendingResults.remove(paramString);
              paramActivityResultCallback.onActivityResult(paramActivityResultContract.parseResult(paramAnonymousLifecycleOwner.getResultCode(), paramAnonymousLifecycleOwner.getData()));
            }
          }
          else if (Lifecycle.Event.ON_STOP.equals(paramAnonymousEvent))
          {
            mKeyToCallback.remove(paramString);
          }
          else if (Lifecycle.Event.ON_DESTROY.equals(paramAnonymousEvent))
          {
            unregister(paramString);
          }
        }
      });
      mKeyToLifecycleContainers.put(paramString, paramLifecycleOwner);
      new ActivityResultLauncher()
      {
        @NonNull
        public ActivityResultContract<I, ?> getContract()
        {
          return paramActivityResultContract;
        }
        
        public void launch(I paramAnonymousI, @Nullable ActivityOptionsCompat paramAnonymousActivityOptionsCompat)
        {
          Integer localInteger = (Integer)mKeyToRc.get(paramString);
          if (localInteger != null)
          {
            mLaunchedKeys.add(paramString);
            try
            {
              onLaunch(localInteger.intValue(), paramActivityResultContract, paramAnonymousI, paramAnonymousActivityOptionsCompat);
              return;
            }
            catch (Exception paramAnonymousI)
            {
              mLaunchedKeys.remove(paramString);
              throw paramAnonymousI;
            }
          }
          paramAnonymousActivityOptionsCompat = z2.t("Attempting to launch an unregistered ActivityResultLauncher with contract ");
          paramAnonymousActivityOptionsCompat.append(paramActivityResultContract);
          paramAnonymousActivityOptionsCompat.append(" and input ");
          paramAnonymousActivityOptionsCompat.append(paramAnonymousI);
          paramAnonymousActivityOptionsCompat.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
          throw new IllegalStateException(paramAnonymousActivityOptionsCompat.toString());
        }
        
        public void unregister()
        {
          unregister(paramString);
        }
      };
    }
    paramString = new StringBuilder();
    paramString.append("LifecycleOwner ");
    paramString.append(paramLifecycleOwner);
    paramString.append(" is attempting to register while current state is ");
    paramString.append(localLifecycle.getCurrentState());
    paramString.append(". LifecycleOwners must call register before they are STARTED.");
    throw new IllegalStateException(paramString.toString());
  }
  
  @MainThread
  public final void unregister(@NonNull String paramString)
  {
    if (!mLaunchedKeys.contains(paramString))
    {
      localObject = (Integer)mKeyToRc.remove(paramString);
      if (localObject != null) {
        mRcToKey.remove(localObject);
      }
    }
    mKeyToCallback.remove(paramString);
    if (mParsedPendingResults.containsKey(paramString))
    {
      localObject = a.s("Dropping pending result for request ", paramString, ": ");
      ((StringBuilder)localObject).append(mParsedPendingResults.get(paramString));
      Log.w("ActivityResultRegistry", ((StringBuilder)localObject).toString());
      mParsedPendingResults.remove(paramString);
    }
    if (mPendingResults.containsKey(paramString))
    {
      localObject = a.s("Dropping pending result for request ", paramString, ": ");
      ((StringBuilder)localObject).append(mPendingResults.getParcelable(paramString));
      Log.w("ActivityResultRegistry", ((StringBuilder)localObject).toString());
      mPendingResults.remove(paramString);
    }
    Object localObject = (LifecycleContainer)mKeyToLifecycleContainers.get(paramString);
    if (localObject != null)
    {
      ((LifecycleContainer)localObject).clearObservers();
      mKeyToLifecycleContainers.remove(paramString);
    }
  }
  
  public static class CallbackAndContract<O>
  {
    public final ActivityResultCallback<O> mCallback;
    public final ActivityResultContract<?, O> mContract;
    
    public CallbackAndContract(ActivityResultCallback<O> paramActivityResultCallback, ActivityResultContract<?, O> paramActivityResultContract)
    {
      mCallback = paramActivityResultCallback;
      mContract = paramActivityResultContract;
    }
  }
  
  public static class LifecycleContainer
  {
    public final Lifecycle mLifecycle;
    private final ArrayList<LifecycleEventObserver> mObservers;
    
    public LifecycleContainer(@NonNull Lifecycle paramLifecycle)
    {
      mLifecycle = paramLifecycle;
      mObservers = new ArrayList();
    }
    
    public void addObserver(@NonNull LifecycleEventObserver paramLifecycleEventObserver)
    {
      mLifecycle.addObserver(paramLifecycleEventObserver);
      mObservers.add(paramLifecycleEventObserver);
    }
    
    public void clearObservers()
    {
      Iterator localIterator = mObservers.iterator();
      while (localIterator.hasNext())
      {
        LifecycleEventObserver localLifecycleEventObserver = (LifecycleEventObserver)localIterator.next();
        mLifecycle.removeObserver(localLifecycleEventObserver);
      }
      mObservers.clear();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.ActivityResultRegistry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */