package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ResultReceiver
  implements Parcelable
{
  public static final Parcelable.Creator<ResultReceiver> CREATOR = new Parcelable.Creator()
  {
    public ResultReceiver createFromParcel(Parcel paramAnonymousParcel)
    {
      return new ResultReceiver(paramAnonymousParcel);
    }
    
    public ResultReceiver[] newArray(int paramAnonymousInt)
    {
      return new ResultReceiver[paramAnonymousInt];
    }
  };
  public final Handler mHandler;
  public final boolean mLocal;
  public IResultReceiver mReceiver;
  
  public ResultReceiver(Handler paramHandler)
  {
    mLocal = true;
    mHandler = paramHandler;
  }
  
  public ResultReceiver(Parcel paramParcel)
  {
    mLocal = false;
    mHandler = null;
    mReceiver = IResultReceiver.Stub.asInterface(paramParcel.readStrongBinder());
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void onReceiveResult(int paramInt, Bundle paramBundle) {}
  
  public void send(int paramInt, Bundle paramBundle)
  {
    if (mLocal)
    {
      localObject = mHandler;
      if (localObject != null) {
        ((Handler)localObject).post(new MyRunnable(paramInt, paramBundle));
      } else {
        onReceiveResult(paramInt, paramBundle);
      }
      return;
    }
    Object localObject = mReceiver;
    if (localObject != null) {}
    try
    {
      ((IResultReceiver)localObject).send(paramInt, paramBundle);
      return;
    }
    catch (RemoteException paramBundle)
    {
      for (;;) {}
    }
  }
  
  public void writeToParcel(@NonNull Parcel paramParcel, int paramInt)
  {
    try
    {
      if (mReceiver == null)
      {
        MyResultReceiver localMyResultReceiver = new android/support/v4/os/ResultReceiver$MyResultReceiver;
        localMyResultReceiver.<init>(this);
        mReceiver = localMyResultReceiver;
      }
      paramParcel.writeStrongBinder(mReceiver.asBinder());
      return;
    }
    finally {}
  }
  
  public class MyResultReceiver
    extends IResultReceiver.Stub
  {
    public MyResultReceiver() {}
    
    public void send(int paramInt, Bundle paramBundle)
    {
      ResultReceiver localResultReceiver = ResultReceiver.this;
      Handler localHandler = mHandler;
      if (localHandler != null) {
        localHandler.post(new ResultReceiver.MyRunnable(localResultReceiver, paramInt, paramBundle));
      } else {
        localResultReceiver.onReceiveResult(paramInt, paramBundle);
      }
    }
  }
  
  public class MyRunnable
    implements Runnable
  {
    public final int mResultCode;
    public final Bundle mResultData;
    
    public MyRunnable(int paramInt, Bundle paramBundle)
    {
      mResultCode = paramInt;
      mResultData = paramBundle;
    }
    
    public void run()
    {
      onReceiveResult(mResultCode, mResultData);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.os.ResultReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */