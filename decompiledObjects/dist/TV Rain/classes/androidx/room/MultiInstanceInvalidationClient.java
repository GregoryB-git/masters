package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

class MultiInstanceInvalidationClient
{
  public final Context mAppContext;
  public final IMultiInstanceInvalidationCallback mCallback = new IMultiInstanceInvalidationCallback.Stub()
  {
    public void onInvalidation(final String[] paramAnonymousArrayOfString)
    {
      mExecutor.execute(new Runnable()
      {
        public void run()
        {
          mInvalidationTracker.notifyObserversByTableNames(paramAnonymousArrayOfString);
        }
      });
    }
  };
  public int mClientId;
  public final Executor mExecutor;
  public final InvalidationTracker mInvalidationTracker;
  public final String mName;
  public final InvalidationTracker.Observer mObserver;
  public final Runnable mRemoveObserverRunnable;
  @Nullable
  public IMultiInstanceInvalidationService mService;
  public final ServiceConnection mServiceConnection;
  public final Runnable mSetUpRunnable;
  public final AtomicBoolean mStopped = new AtomicBoolean(false);
  private final Runnable mTearDownRunnable;
  
  public MultiInstanceInvalidationClient(Context paramContext, String paramString, InvalidationTracker paramInvalidationTracker, Executor paramExecutor)
  {
    ServiceConnection local2 = new ServiceConnection()
    {
      public void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
      {
        mService = IMultiInstanceInvalidationService.Stub.asInterface(paramAnonymousIBinder);
        paramAnonymousComponentName = MultiInstanceInvalidationClient.this;
        mExecutor.execute(mSetUpRunnable);
      }
      
      public void onServiceDisconnected(ComponentName paramAnonymousComponentName)
      {
        paramAnonymousComponentName = MultiInstanceInvalidationClient.this;
        mExecutor.execute(mRemoveObserverRunnable);
        mService = null;
      }
    };
    mServiceConnection = local2;
    mSetUpRunnable = new Runnable()
    {
      public void run()
      {
        try
        {
          MultiInstanceInvalidationClient localMultiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
          Object localObject = mService;
          if (localObject != null)
          {
            mClientId = ((IMultiInstanceInvalidationService)localObject).registerCallback(mCallback, mName);
            localObject = MultiInstanceInvalidationClient.this;
            mInvalidationTracker.addObserver(mObserver);
          }
        }
        catch (RemoteException localRemoteException)
        {
          Log.w("ROOM", "Cannot register multi-instance invalidation callback", localRemoteException);
        }
      }
    };
    mRemoveObserverRunnable = new Runnable()
    {
      public void run()
      {
        MultiInstanceInvalidationClient localMultiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
        mInvalidationTracker.removeObserver(mObserver);
      }
    };
    mTearDownRunnable = new Runnable()
    {
      public void run()
      {
        MultiInstanceInvalidationClient localMultiInstanceInvalidationClient1 = MultiInstanceInvalidationClient.this;
        mInvalidationTracker.removeObserver(mObserver);
        try
        {
          localMultiInstanceInvalidationClient1 = MultiInstanceInvalidationClient.this;
          IMultiInstanceInvalidationService localIMultiInstanceInvalidationService = mService;
          if (localIMultiInstanceInvalidationService != null) {
            localIMultiInstanceInvalidationService.unregisterCallback(mCallback, mClientId);
          }
        }
        catch (RemoteException localRemoteException)
        {
          Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", localRemoteException);
        }
        MultiInstanceInvalidationClient localMultiInstanceInvalidationClient2 = MultiInstanceInvalidationClient.this;
        mAppContext.unbindService(mServiceConnection);
      }
    };
    paramContext = paramContext.getApplicationContext();
    mAppContext = paramContext;
    mName = paramString;
    mInvalidationTracker = paramInvalidationTracker;
    mExecutor = paramExecutor;
    mObserver = new InvalidationTracker.Observer((String[])mTableIdLookup.keySet().toArray(new String[0]))
    {
      public boolean isRemote()
      {
        return true;
      }
      
      public void onInvalidated(@NonNull Set<String> paramAnonymousSet)
      {
        if (mStopped.get()) {
          return;
        }
        try
        {
          MultiInstanceInvalidationClient localMultiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
          IMultiInstanceInvalidationService localIMultiInstanceInvalidationService = mService;
          if (localIMultiInstanceInvalidationService != null) {
            localIMultiInstanceInvalidationService.broadcastInvalidation(mClientId, (String[])paramAnonymousSet.toArray(new String[0]));
          }
        }
        catch (RemoteException paramAnonymousSet)
        {
          Log.w("ROOM", "Cannot broadcast invalidation", paramAnonymousSet);
        }
      }
    };
    paramContext.bindService(new Intent(paramContext, MultiInstanceInvalidationService.class), local2, 1);
  }
  
  public void stop()
  {
    if (mStopped.compareAndSet(false, true)) {
      mExecutor.execute(mTearDownRunnable);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.room.MultiInstanceInvalidationClient
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */