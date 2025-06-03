package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaMetadataCompat;
import android.view.KeyEvent;
import java.util.List;

public final class IMediaSession$Stub$a
  implements IMediaSession
{
  public static IMediaSession b;
  public IBinder a;
  
  public IMediaSession$Stub$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  public final void G(IMediaControllerCallback paramIMediaControllerCallback)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      IBinder localIBinder;
      if (paramIMediaControllerCallback != null) {
        localIBinder = paramIMediaControllerCallback.asBinder();
      } else {
        localIBinder = null;
      }
      localParcel1.writeStrongBinder(localIBinder);
      if ((!a.transact(3, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().G(paramIMediaControllerCallback);
        return;
      }
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final MediaMetadataCompat H0()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      MediaMetadataCompat localMediaMetadataCompat;
      if ((!a.transact(27, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        localMediaMetadataCompat = IMediaSession.Stub.getDefaultImpl().H0();
        return localMediaMetadataCompat;
      }
      localParcel2.readException();
      if (localParcel2.readInt() != 0) {
        localMediaMetadataCompat = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(localParcel2);
      } else {
        localMediaMetadataCompat = null;
      }
      return localMediaMetadataCompat;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final void J0(IMediaControllerCallback paramIMediaControllerCallback)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      IBinder localIBinder;
      if (paramIMediaControllerCallback != null) {
        localIBinder = paramIMediaControllerCallback.asBinder();
      } else {
        localIBinder = null;
      }
      localParcel1.writeStrongBinder(localIBinder);
      if ((!a.transact(4, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().J0(paramIMediaControllerCallback);
        return;
      }
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final IBinder asBinder()
  {
    return a;
  }
  
  public final PlaybackStateCompat d()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      PlaybackStateCompat localPlaybackStateCompat;
      if ((!a.transact(28, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        localPlaybackStateCompat = IMediaSession.Stub.getDefaultImpl().d();
        return localPlaybackStateCompat;
      }
      localParcel2.readException();
      if (localParcel2.readInt() != 0) {
        localPlaybackStateCompat = (PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(localParcel2);
      } else {
        localPlaybackStateCompat = null;
      }
      return localPlaybackStateCompat;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final PendingIntent d0()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      PendingIntent localPendingIntent;
      if ((!a.transact(8, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        localPendingIntent = IMediaSession.Stub.getDefaultImpl().d0();
        return localPendingIntent;
      }
      localParcel2.readException();
      if (localParcel2.readInt() != 0) {
        localPendingIntent = (PendingIntent)PendingIntent.CREATOR.createFromParcel(localParcel2);
      } else {
        localPendingIntent = null;
      }
      return localPendingIntent;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final List<MediaSessionCompat.QueueItem> o2()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      if ((!a.transact(29, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        localObject1 = IMediaSession.Stub.getDefaultImpl().o2();
        return (List<MediaSessionCompat.QueueItem>)localObject1;
      }
      localParcel2.readException();
      Object localObject1 = localParcel2.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
      return (List<MediaSessionCompat.QueueItem>)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final boolean u1(KeyEvent paramKeyEvent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      boolean bool = true;
      if (paramKeyEvent != null)
      {
        localParcel1.writeInt(1);
        paramKeyEvent.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      if ((!a.transact(2, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        bool = IMediaSession.Stub.getDefaultImpl().u1(paramKeyEvent);
        return bool;
      }
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i == 0) {
        bool = false;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.IMediaSession.Stub.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */