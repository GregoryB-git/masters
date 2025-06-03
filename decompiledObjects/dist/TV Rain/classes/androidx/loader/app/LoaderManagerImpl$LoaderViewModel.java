package androidx.loader.app;

import androidx.annotation.NonNull;
import androidx.collection.SparseArrayCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class LoaderManagerImpl$LoaderViewModel
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

/* Location:
 * Qualified Name:     androidx.loader.app.LoaderManagerImpl.LoaderViewModel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */