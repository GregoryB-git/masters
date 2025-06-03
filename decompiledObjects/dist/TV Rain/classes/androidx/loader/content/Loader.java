package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.DebugUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import z2;

public class Loader<D>
{
  public boolean mAbandoned = false;
  public boolean mContentChanged = false;
  public Context mContext;
  public int mId;
  public OnLoadCompleteListener<D> mListener;
  public OnLoadCanceledListener<D> mOnLoadCanceledListener;
  public boolean mProcessingChange = false;
  public boolean mReset = true;
  public boolean mStarted = false;
  
  public Loader(@NonNull Context paramContext)
  {
    mContext = paramContext.getApplicationContext();
  }
  
  @MainThread
  public void abandon()
  {
    mAbandoned = true;
    onAbandon();
  }
  
  @MainThread
  public boolean cancelLoad()
  {
    return onCancelLoad();
  }
  
  public void commitContentChanged()
  {
    mProcessingChange = false;
  }
  
  @NonNull
  public String dataToString(@Nullable D paramD)
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    DebugUtils.buildShortClassTag(paramD, localStringBuilder);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  @MainThread
  public void deliverCancellation()
  {
    OnLoadCanceledListener localOnLoadCanceledListener = mOnLoadCanceledListener;
    if (localOnLoadCanceledListener != null) {
      localOnLoadCanceledListener.onLoadCanceled(this);
    }
  }
  
  @MainThread
  public void deliverResult(@Nullable D paramD)
  {
    OnLoadCompleteListener localOnLoadCompleteListener = mListener;
    if (localOnLoadCompleteListener != null) {
      localOnLoadCompleteListener.onLoadComplete(this, paramD);
    }
  }
  
  @Deprecated
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    paramPrintWriter.print(mId);
    paramPrintWriter.print(" mListener=");
    paramPrintWriter.println(mListener);
    if ((mStarted) || (mContentChanged) || (mProcessingChange))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(mStarted);
      paramPrintWriter.print(" mContentChanged=");
      paramPrintWriter.print(mContentChanged);
      paramPrintWriter.print(" mProcessingChange=");
      paramPrintWriter.println(mProcessingChange);
    }
    if ((mAbandoned) || (mReset))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAbandoned=");
      paramPrintWriter.print(mAbandoned);
      paramPrintWriter.print(" mReset=");
      paramPrintWriter.println(mReset);
    }
  }
  
  @MainThread
  public void forceLoad()
  {
    onForceLoad();
  }
  
  @NonNull
  public Context getContext()
  {
    return mContext;
  }
  
  public int getId()
  {
    return mId;
  }
  
  public boolean isAbandoned()
  {
    return mAbandoned;
  }
  
  public boolean isReset()
  {
    return mReset;
  }
  
  public boolean isStarted()
  {
    return mStarted;
  }
  
  @MainThread
  public void onAbandon() {}
  
  @MainThread
  public boolean onCancelLoad()
  {
    return false;
  }
  
  @MainThread
  public void onContentChanged()
  {
    if (mStarted) {
      forceLoad();
    } else {
      mContentChanged = true;
    }
  }
  
  @MainThread
  public void onForceLoad() {}
  
  @MainThread
  public void onReset() {}
  
  @MainThread
  public void onStartLoading() {}
  
  @MainThread
  public void onStopLoading() {}
  
  @MainThread
  public void registerListener(int paramInt, @NonNull OnLoadCompleteListener<D> paramOnLoadCompleteListener)
  {
    if (mListener == null)
    {
      mListener = paramOnLoadCompleteListener;
      mId = paramInt;
      return;
    }
    throw new IllegalStateException("There is already a listener registered");
  }
  
  @MainThread
  public void registerOnLoadCanceledListener(@NonNull OnLoadCanceledListener<D> paramOnLoadCanceledListener)
  {
    if (mOnLoadCanceledListener == null)
    {
      mOnLoadCanceledListener = paramOnLoadCanceledListener;
      return;
    }
    throw new IllegalStateException("There is already a listener registered");
  }
  
  @MainThread
  public void reset()
  {
    onReset();
    mReset = true;
    mStarted = false;
    mAbandoned = false;
    mContentChanged = false;
    mProcessingChange = false;
  }
  
  public void rollbackContentChanged()
  {
    if (mProcessingChange) {
      onContentChanged();
    }
  }
  
  @MainThread
  public final void startLoading()
  {
    mStarted = true;
    mReset = false;
    mAbandoned = false;
    onStartLoading();
  }
  
  @MainThread
  public void stopLoading()
  {
    mStarted = false;
    onStopLoading();
  }
  
  public boolean takeContentChanged()
  {
    boolean bool = mContentChanged;
    mContentChanged = false;
    mProcessingChange |= bool;
    return bool;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    DebugUtils.buildShortClassTag(this, localStringBuilder);
    localStringBuilder.append(" id=");
    return z2.q(localStringBuilder, mId, "}");
  }
  
  @MainThread
  public void unregisterListener(@NonNull OnLoadCompleteListener<D> paramOnLoadCompleteListener)
  {
    OnLoadCompleteListener localOnLoadCompleteListener = mListener;
    if (localOnLoadCompleteListener != null)
    {
      if (localOnLoadCompleteListener == paramOnLoadCompleteListener)
      {
        mListener = null;
        return;
      }
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
    throw new IllegalStateException("No listener register");
  }
  
  @MainThread
  public void unregisterOnLoadCanceledListener(@NonNull OnLoadCanceledListener<D> paramOnLoadCanceledListener)
  {
    OnLoadCanceledListener localOnLoadCanceledListener = mOnLoadCanceledListener;
    if (localOnLoadCanceledListener != null)
    {
      if (localOnLoadCanceledListener == paramOnLoadCanceledListener)
      {
        mOnLoadCanceledListener = null;
        return;
      }
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
    throw new IllegalStateException("No listener register");
  }
  
  public final class ForceLoadContentObserver
    extends ContentObserver
  {
    public ForceLoadContentObserver()
    {
      super();
    }
    
    public boolean deliverSelfNotifications()
    {
      return true;
    }
    
    public void onChange(boolean paramBoolean)
    {
      onContentChanged();
    }
  }
  
  public static abstract interface OnLoadCanceledListener<D>
  {
    public abstract void onLoadCanceled(@NonNull Loader<D> paramLoader);
  }
  
  public static abstract interface OnLoadCompleteListener<D>
  {
    public abstract void onLoadComplete(@NonNull Loader<D> paramLoader, @Nullable D paramD);
  }
}

/* Location:
 * Qualified Name:     androidx.loader.content.Loader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */