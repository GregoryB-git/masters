package androidx.loader.app;

import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.loader.content.Loader;
import java.io.PrintWriter;
import z2;

class LoaderManagerImpl$LoaderObserver<D>
  implements Observer<D>
{
  @NonNull
  private final LoaderManager.LoaderCallbacks<D> mCallback;
  private boolean mDeliveredData = false;
  @NonNull
  private final Loader<D> mLoader;
  
  public LoaderManagerImpl$LoaderObserver(@NonNull Loader<D> paramLoader, @NonNull LoaderManager.LoaderCallbacks<D> paramLoaderCallbacks)
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

/* Location:
 * Qualified Name:     androidx.loader.app.LoaderManagerImpl.LoaderObserver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */