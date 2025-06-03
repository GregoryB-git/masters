package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.core.util.DebugUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.loader.content.Loader;
import androidx.loader.content.Loader.OnLoadCompleteListener;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import z2;

class LoaderManagerImpl
  extends LoaderManager
{
  public static boolean DEBUG = false;
  public static final String TAG = "LoaderManager";
  @NonNull
  private final LifecycleOwner mLifecycleOwner;
  @NonNull
  private final LoaderViewModel mLoaderViewModel;
  
  public LoaderManagerImpl(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull ViewModelStore paramViewModelStore)
  {
    mLifecycleOwner = paramLifecycleOwner;
    mLoaderViewModel = LoaderViewModel.getInstance(paramViewModelStore);
  }
  
  @MainThread
  @NonNull
  private <D> Loader<D> createAndInstallLoader(int paramInt, @Nullable Bundle paramBundle, @NonNull LoaderManager.LoaderCallbacks<D> paramLoaderCallbacks, @Nullable Loader<D> paramLoader)
  {
    try
    {
      mLoaderViewModel.startCreatingLoader();
      Loader localLoader = paramLoaderCallbacks.onCreateLoader(paramInt, paramBundle);
      if (localLoader != null)
      {
        if ((localLoader.getClass().isMemberClass()) && (!Modifier.isStatic(localLoader.getClass().getModifiers())))
        {
          paramLoaderCallbacks = new java/lang/IllegalArgumentException;
          paramBundle = new java/lang/StringBuilder;
          paramBundle.<init>();
          paramBundle.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
          paramBundle.append(localLoader);
          paramLoaderCallbacks.<init>(paramBundle.toString());
          throw paramLoaderCallbacks;
        }
        LoaderInfo localLoaderInfo = new androidx/loader/app/LoaderManagerImpl$LoaderInfo;
        localLoaderInfo.<init>(paramInt, paramBundle, localLoader, paramLoader);
        if (DEBUG)
        {
          paramBundle = new java/lang/StringBuilder;
          paramBundle.<init>();
          paramBundle.append("  Created new loader ");
          paramBundle.append(localLoaderInfo);
          Log.v("LoaderManager", paramBundle.toString());
        }
        mLoaderViewModel.putLoader(paramInt, localLoaderInfo);
        return localLoaderInfo.setCallback(mLifecycleOwner, paramLoaderCallbacks);
      }
      paramBundle = new java/lang/IllegalArgumentException;
      paramBundle.<init>("Object returned from onCreateLoader must not be null");
      throw paramBundle;
    }
    finally
    {
      mLoaderViewModel.finishCreatingLoader();
    }
  }
  
  @MainThread
  public void destroyLoader(int paramInt)
  {
    if (!mLoaderViewModel.isCreatingLoader())
    {
      if (Looper.getMainLooper() == Looper.myLooper())
      {
        if (DEBUG)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("destroyLoader in ");
          ((StringBuilder)localObject).append(this);
          ((StringBuilder)localObject).append(" of ");
          ((StringBuilder)localObject).append(paramInt);
          Log.v("LoaderManager", ((StringBuilder)localObject).toString());
        }
        Object localObject = mLoaderViewModel.getLoader(paramInt);
        if (localObject != null)
        {
          ((LoaderInfo)localObject).destroy(true);
          mLoaderViewModel.removeLoader(paramInt);
        }
        return;
      }
      throw new IllegalStateException("destroyLoader must be called on the main thread");
    }
    throw new IllegalStateException("Called while creating a loader");
  }
  
  @Deprecated
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    mLoaderViewModel.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  @Nullable
  public <D> Loader<D> getLoader(int paramInt)
  {
    if (!mLoaderViewModel.isCreatingLoader())
    {
      Object localObject = mLoaderViewModel.getLoader(paramInt);
      if (localObject != null) {
        localObject = ((LoaderInfo)localObject).getLoader();
      } else {
        localObject = null;
      }
      return (Loader<D>)localObject;
    }
    throw new IllegalStateException("Called while creating a loader");
  }
  
  public boolean hasRunningLoaders()
  {
    return mLoaderViewModel.hasRunningLoaders();
  }
  
  @MainThread
  @NonNull
  public <D> Loader<D> initLoader(int paramInt, @Nullable Bundle paramBundle, @NonNull LoaderManager.LoaderCallbacks<D> paramLoaderCallbacks)
  {
    if (!mLoaderViewModel.isCreatingLoader())
    {
      if (Looper.getMainLooper() == Looper.myLooper())
      {
        LoaderInfo localLoaderInfo = mLoaderViewModel.getLoader(paramInt);
        if (DEBUG)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("initLoader in ");
          localStringBuilder.append(this);
          localStringBuilder.append(": args=");
          localStringBuilder.append(paramBundle);
          Log.v("LoaderManager", localStringBuilder.toString());
        }
        if (localLoaderInfo == null) {
          return createAndInstallLoader(paramInt, paramBundle, paramLoaderCallbacks, null);
        }
        if (DEBUG)
        {
          paramBundle = new StringBuilder();
          paramBundle.append("  Re-using existing loader ");
          paramBundle.append(localLoaderInfo);
          Log.v("LoaderManager", paramBundle.toString());
        }
        return localLoaderInfo.setCallback(mLifecycleOwner, paramLoaderCallbacks);
      }
      throw new IllegalStateException("initLoader must be called on the main thread");
    }
    throw new IllegalStateException("Called while creating a loader");
  }
  
  public void markForRedelivery()
  {
    mLoaderViewModel.markForRedelivery();
  }
  
  @MainThread
  @NonNull
  public <D> Loader<D> restartLoader(int paramInt, @Nullable Bundle paramBundle, @NonNull LoaderManager.LoaderCallbacks<D> paramLoaderCallbacks)
  {
    if (!mLoaderViewModel.isCreatingLoader())
    {
      if (Looper.getMainLooper() == Looper.myLooper())
      {
        if (DEBUG)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("restartLoader in ");
          ((StringBuilder)localObject).append(this);
          ((StringBuilder)localObject).append(": args=");
          ((StringBuilder)localObject).append(paramBundle);
          Log.v("LoaderManager", ((StringBuilder)localObject).toString());
        }
        LoaderInfo localLoaderInfo = mLoaderViewModel.getLoader(paramInt);
        Object localObject = null;
        if (localLoaderInfo != null) {
          localObject = localLoaderInfo.destroy(false);
        }
        return createAndInstallLoader(paramInt, paramBundle, paramLoaderCallbacks, (Loader)localObject);
      }
      throw new IllegalStateException("restartLoader must be called on the main thread");
    }
    throw new IllegalStateException("Called while creating a loader");
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("LoaderManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    DebugUtils.buildShortClassTag(mLifecycleOwner, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
  
  public static class LoaderInfo<D>
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
    
    public LoaderInfo(int paramInt, @Nullable Bundle paramBundle, @NonNull Loader<D> paramLoader1, @Nullable Loader<D> paramLoader2)
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
  
  public static class LoaderObserver<D>
    implements Observer<D>
  {
    @NonNull
    private final LoaderManager.LoaderCallbacks<D> mCallback;
    private boolean mDeliveredData = false;
    @NonNull
    private final Loader<D> mLoader;
    
    public LoaderObserver(@NonNull Loader<D> paramLoader, @NonNull LoaderManager.LoaderCallbacks<D> paramLoaderCallbacks)
    {
      mLoader = paramLoader;
      mCallback = paramLoaderCallbacks;
    }
    
    public void dump(String paramString, PrintWriter paramPrintWriter)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mDeliveredData=");
      paramPrintWriter.println(mDeliveredData);
    }
    
    public boolean hasDeliveredData()
    {
      return mDeliveredData;
    }
    
    public void onChanged(@Nullable D paramD)
    {
      if (LoaderManagerImpl.DEBUG)
      {
        StringBuilder localStringBuilder = z2.t("  onLoadFinished in ");
        localStringBuilder.append(mLoader);
        localStringBuilder.append(": ");
        localStringBuilder.append(mLoader.dataToString(paramD));
        Log.v("LoaderManager", localStringBuilder.toString());
      }
      mCallback.onLoadFinished(mLoader, paramD);
      mDeliveredData = true;
    }
    
    @MainThread
    public void reset()
    {
      if (mDeliveredData)
      {
        if (LoaderManagerImpl.DEBUG)
        {
          StringBuilder localStringBuilder = z2.t("  Resetting: ");
          localStringBuilder.append(mLoader);
          Log.v("LoaderManager", localStringBuilder.toString());
        }
        mCallback.onLoaderReset(mLoader);
      }
    }
    
    public String toString()
    {
      return mCallback.toString();
    }
  }
  
  public static class LoaderViewModel
    extends ViewModel
  {
    private static final ViewModelProvider.Factory FACTORY = new ViewModelProvider.Factory()
    {
      @NonNull
      public <T extends ViewModel> T create(@NonNull Class<T> paramAnonymousClass)
      {
        return new LoaderManagerImpl.LoaderViewModel();
      }
    };
    private boolean mCreatingLoader = false;
    private SparseArrayCompat<LoaderManagerImpl.LoaderInfo> mLoaders = new SparseArrayCompat();
    
    @NonNull
    public static LoaderViewModel getInstance(ViewModelStore paramViewModelStore)
    {
      return (LoaderViewModel)new ViewModelProvider(paramViewModelStore, FACTORY).get(LoaderViewModel.class);
    }
    
    public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
    {
      if (mLoaders.size() > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Loaders:");
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append("    ");
        localObject = ((StringBuilder)localObject).toString();
        for (int i = 0; i < mLoaders.size(); i++)
        {
          LoaderManagerImpl.LoaderInfo localLoaderInfo = (LoaderManagerImpl.LoaderInfo)mLoaders.valueAt(i);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(mLoaders.keyAt(i));
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localLoaderInfo.toString());
          localLoaderInfo.dump((String)localObject, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        }
      }
    }
    
    public void finishCreatingLoader()
    {
      mCreatingLoader = false;
    }
    
    public <D> LoaderManagerImpl.LoaderInfo<D> getLoader(int paramInt)
    {
      return (LoaderManagerImpl.LoaderInfo)mLoaders.get(paramInt);
    }
    
    public boolean hasRunningLoaders()
    {
      int i = mLoaders.size();
      for (int j = 0; j < i; j++) {
        if (((LoaderManagerImpl.LoaderInfo)mLoaders.valueAt(j)).isCallbackWaitingForData()) {
          return true;
        }
      }
      return false;
    }
    
    public boolean isCreatingLoader()
    {
      return mCreatingLoader;
    }
    
    public void markForRedelivery()
    {
      int i = mLoaders.size();
      for (int j = 0; j < i; j++) {
        ((LoaderManagerImpl.LoaderInfo)mLoaders.valueAt(j)).markForRedelivery();
      }
    }
    
    public void onCleared()
    {
      super.onCleared();
      int i = mLoaders.size();
      for (int j = 0; j < i; j++) {
        ((LoaderManagerImpl.LoaderInfo)mLoaders.valueAt(j)).destroy(true);
      }
      mLoaders.clear();
    }
    
    public void putLoader(int paramInt, @NonNull LoaderManagerImpl.LoaderInfo paramLoaderInfo)
    {
      mLoaders.put(paramInt, paramLoaderInfo);
    }
    
    public void removeLoader(int paramInt)
    {
      mLoaders.remove(paramInt);
    }
    
    public void startCreatingLoader()
    {
      mCreatingLoader = true;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.loader.app.LoaderManagerImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */