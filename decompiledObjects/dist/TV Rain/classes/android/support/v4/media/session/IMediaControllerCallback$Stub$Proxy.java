package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.util.List;

class IMediaControllerCallback$Stub$Proxy
  implements IMediaControllerCallback
{
  public static IMediaControllerCallback sDefaultImpl;
  private IBinder mRemote;
  
  public IMediaControllerCallback$Stub$Proxy(IBinder paramIBinder)
  {
    mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return mRemote;
  }
  
  public String getInterfaceDescriptor()
  {
    return "android.support.v4.media.session.IMediaControllerCallback";
  }
  
  public void onCaptioningEnabledChanged(boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      int i;
      if (paramBoolean) {
        i = 1;
      } else {
        i = 0;
      }
      localParcel.writeInt(i);
      if ((!mRemote.transact(11, localParcel, null, 1)) && (IMediaControllerCallback.Stub.getDefaultImpl() != null))
      {
        IMediaControllerCallback.Stub.getDefaultImpl().onCaptioningEnabledChanged(paramBoolean);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onEvent(String paramString, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      localParcel.writeString(paramString);
      if (paramBundle != null)
      {
        localParcel.writeInt(1);
        paramBundle.writeToParcel(localParcel, 0);
      }
      else
      {
        localParcel.writeInt(0);
      }
      if ((!mRemote.transact(1, localParcel, null, 1)) && (IMediaControllerCallback.Stub.getDefaultImpl() != null))
      {
        IMediaControllerCallback.Stub.getDefaultImpl().onEvent(paramString, paramBundle);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onExtrasChanged(Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      if (paramBundle != null)
      {
        localParcel.writeInt(1);
        paramBundle.writeToParcel(localParcel, 0);
      }
      else
      {
        localParcel.writeInt(0);
      }
      if ((!mRemote.transact(7, localParcel, null, 1)) && (IMediaControllerCallback.Stub.getDefaultImpl() != null))
      {
        IMediaControllerCallback.Stub.getDefaultImpl().onExtrasChanged(paramBundle);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onMetadataChanged(MediaMetadataCompat paramMediaMetadataCompat)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      if (paramMediaMetadataCompat != null)
      {
        localParcel.writeInt(1);
        paramMediaMetadataCompat.writeToParcel(localParcel, 0);
      }
      else
      {
        localParcel.writeInt(0);
      }
      if ((!mRemote.transact(4, localParcel, null, 1)) && (IMediaControllerCallback.Stub.getDefaultImpl() != null))
      {
        IMediaControllerCallback.Stub.getDefaultImpl().onMetadataChanged(paramMediaMetadataCompat);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onPlaybackStateChanged(PlaybackStateCompat paramPlaybackStateCompat)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      if (paramPlaybackStateCompat != null)
      {
        localParcel.writeInt(1);
        paramPlaybackStateCompat.writeToParcel(localParcel, 0);
      }
      else
      {
        localParcel.writeInt(0);
      }
      if ((!mRemote.transact(3, localParcel, null, 1)) && (IMediaControllerCallback.Stub.getDefaultImpl() != null))
      {
        IMediaControllerCallback.Stub.getDefaultImpl().onPlaybackStateChanged(paramPlaybackStateCompat);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onQueueChanged(List<MediaSessionCompat.QueueItem> paramList)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      localParcel.writeTypedList(paramList);
      if ((!mRemote.transact(5, localParcel, null, 1)) && (IMediaControllerCallback.Stub.getDefaultImpl() != null))
      {
        IMediaControllerCallback.Stub.getDefaultImpl().onQueueChanged(paramList);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onQueueTitleChanged(CharSequence paramCharSequence)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      if (paramCharSequence != null)
      {
        localParcel.writeInt(1);
        TextUtils.writeToParcel(paramCharSequence, localParcel, 0);
      }
      else
      {
        localParcel.writeInt(0);
      }
      if ((!mRemote.transact(6, localParcel, null, 1)) && (IMediaControllerCallback.Stub.getDefaultImpl() != null))
      {
        IMediaControllerCallback.Stub.getDefaultImpl().onQueueTitleChanged(paramCharSequence);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onRepeatModeChanged(int paramInt)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      localParcel.writeInt(paramInt);
      if ((!mRemote.transact(9, localParcel, null, 1)) && (IMediaControllerCallback.Stub.getDefaultImpl() != null))
      {
        IMediaControllerCallback.Stub.getDefaultImpl().onRepeatModeChanged(paramInt);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onSessionDestroyed()
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      if ((!mRemote.transact(2, localParcel, null, 1)) && (IMediaControllerCallback.Stub.getDefaultImpl() != null))
      {
        IMediaControllerCallback.Stub.getDefaultImpl().onSessionDestroyed();
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onSessionReady()
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      if ((!mRemote.transact(13, localParcel, null, 1)) && (IMediaControllerCallback.Stub.getDefaultImpl() != null))
      {
        IMediaControllerCallback.Stub.getDefaultImpl().onSessionReady();
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onShuffleModeChanged(int paramInt)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      localParcel.writeInt(paramInt);
      if ((!mRemote.transact(12, localParcel, null, 1)) && (IMediaControllerCallback.Stub.getDefaultImpl() != null))
      {
        IMediaControllerCallback.Stub.getDefaultImpl().onShuffleModeChanged(paramInt);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onShuffleModeChangedRemoved(boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      int i;
      if (paramBoolean) {
        i = 1;
      } else {
        i = 0;
      }
      localParcel.writeInt(i);
      if ((!mRemote.transact(10, localParcel, null, 1)) && (IMediaControllerCallback.Stub.getDefaultImpl() != null))
      {
        IMediaControllerCallback.Stub.getDefaultImpl().onShuffleModeChangedRemoved(paramBoolean);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onVolumeInfoChanged(ParcelableVolumeInfo paramParcelableVolumeInfo)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      if (paramParcelableVolumeInfo != null)
      {
        localParcel.writeInt(1);
        paramParcelableVolumeInfo.writeToParcel(localParcel, 0);
      }
      else
      {
        localParcel.writeInt(0);
      }
      if ((!mRemote.transact(8, localParcel, null, 1)) && (IMediaControllerCallback.Stub.getDefaultImpl() != null))
      {
        IMediaControllerCallback.Stub.getDefaultImpl().onVolumeInfoChanged(paramParcelableVolumeInfo);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.IMediaControllerCallback.Stub.Proxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */