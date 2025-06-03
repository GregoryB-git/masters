package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.DebugUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.loader.content.Loader;
import androidx.loader.content.Loader.OnLoadCompleteListener;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import z2;

public class LoaderManagerImpl$LoaderInfo<D>
  extends MutableLiveData<D>
  implements Loader.OnLoadCompleteListener<D>
{
  @Nullable
  private final Bundle mArgs;
  private final int mId;
  private LifecycleOwner mLifecycleOwner;
  @NonNull
  private final Loader<D> mLoader;
  private LoaderManagerImpl.LoaderObserver<D> mObserver;
  private Loader<D> mPriorLoader;
  
  public LoaderManagerImpl$LoaderInfo(int paramInt, @Nullable Bundle paramBundle, @NonNull Loader<D> paramLoader1, @Nullable Loader<D> paramLoader2)
  {
    mId = paramInt;
    mArgs = paramBundle;
    mLoader = paramLoader1;
    mPriorLoader = paramLoader2;
    paramLoader1.registerListener(paramInt, this);
  }
  
  @MainThread
  public Loader<D> destroy(boolean paramBoolean)
  {
    if (LoaderManagerImpl.DEBUG)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("  Destroying: ");
      ((StringBuilder)localObject).append(this);
      Log.v("LoaderManager", ((StringBuilder)localObject).toString());
    }
    mLoader.cancelLoad();
    mLoader.abandon();
    Object localObject = mObserver;
    if (localObject != null)
    {
      removeObserver((Observer)localObject);
      if (paramBoolean) {
        ((LoaderManagerImpl.LoaderObserver)localObject).reset();
      }
    }
    mLoader.unregisterListener(this);
    if (((localObject != null) && (!((LoaderManagerImpl.LoaderObserver)localObject).hasDeliveredData())) || (paramBoolean))
    {
      mLoader.reset();
      return mPriorLoader;
    }
    return mLoader;
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    paramPrintWriter.print(mId);
    paramPrintWriter.print(" mArgs=");
    paramPrintWriter.println(mArgs);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mLoader=");
    paramPrintWriter.println(mLoader);
    mLoader.dump(z2.o(paramString, "  "), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    if (mObserver != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mCallbacks=");
      paramPrintWriter.println(mObserver);
      mObserver.dump(z2.o(paramString, "  "), paramPrintWriter);
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mData=");
    paramPrintWriter.println(getLoader().dataToString(getValue()));
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mStarted=");
    paramPrintWriter.println(hasActiveObservers());
  }
  
  @NonNull
  public Loader<D> getLoader()
  {
    return mLoader;
  }
  
  public boolean isCallbackWaitingForData()
  {
    boolean bool1 = hasActiveObservers();
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    LoaderManagerImpl.LoaderObserver localLoaderObserver = mObserver;
    bool1 = bool2;
    if (localLoaderObserver != null)
    {
      bool1 = bool2;
      if (!localLoaderObserver.hasDeliveredData()) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public void markForRedelivery()
  {
    LifecycleOwner localLifecycleOwner = mLifecycleOwner;
    LoaderManagerImpl.LoaderObserver localLoaderObserver = mObserver;
    if ((localLifecycleOwner != null) && (localLoaderObserver != null))
    {
      super.removeObserver(localLoaderObserver);
      observe(localLifecycleOwner, localLoaderObserver);
    }
  }
  
  public void onActive()
  {
    if (LoaderManagerImpl.DEBUG)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("  Starting: ");
      localStringBuilder.append(this);
      Log.v("LoaderManager", localStringBuilder.toString());
    }
    mLoader.startLoading();
  }
  
  public void onInactive()
  {
    if (LoaderManagerImpl.DEBUG)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("  Stopping: ");
      localStringBuilder.append(this);
      Log.v("LoaderManager", localStringBuilder.toString());
    }
    mLoader.stopLoading();
  }
  
  public void onLoadComplete(@NonNull Loader<D> paramLoader, @Nullable D paramD)
  {
    if (LoaderManagerImpl.DEBUG)
    {
      paramLoader = new StringBuilder();
      paramLoader.append("onLoadComplete: ");
      paramLoader.append(this);
      Log.v("LoaderManager", paramLoader.toString());
    }
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      setValue(paramD);
    }
    else
    {
      if (LoaderManagerImpl.DEBUG) {
        Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
      }
      postValue(paramD);
    }
  }
  
  public void removeObserver(@NonNull Observer<? super D> paramObserver)
  {
    super.removeObserver(paramObserver);
    mLifecycleOwner = null;
    mObserver = null;
  }
  
  @MainThread
  @NonNull
  public Loader<D> setCallback(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull LoaderManager.LoaderCallbacks<D> paramLoaderCallbacks)
  {
    LoaderManagerImpl.LoaderObserver localLoaderObserver = new LoaderManagerImpl.LoaderObserver(mLoader, paramLoaderCallbacks);
    observe(paramLifecycleOwner, localLoaderObserver);
    paramLoaderCallbacks = mObserver;
    if (paramLoaderCallbacks != null) {
      removeObserver(paramLoaderCallbacks);
    }
    mLifecycleOwner = paramLifecycleOwner;
    mObserver = localLoaderObserver;
    return mLoader;
  }
  
  public void setValue(D paramD)
  {
    super.setValue(paramD);
    paramD = mPriorLoader;
    if (paramD != null)
    {
      paramD.reset();
      mPriorLoader = null;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    localStringBuilder.append("LoaderInfo{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" #");
    localStringBuilder.append(mId);
    localStringBuilder.append(" : ");
    DebugUtils.buildShortClassTag(mLoader, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.loader.app.LoaderManagerImpl.LoaderInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */