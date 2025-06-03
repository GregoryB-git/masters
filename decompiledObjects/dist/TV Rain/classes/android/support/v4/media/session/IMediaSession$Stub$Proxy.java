package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

class IMediaSession$Stub$Proxy
  implements IMediaSession
{
  public static IMediaSession sDefaultImpl;
  private IBinder mRemote;
  
  public IMediaSession$Stub$Proxy(IBinder paramIBinder)
  {
    mRemote = paramIBinder;
  }
  
  public void addQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      if (paramMediaDescriptionCompat != null)
      {
        localParcel1.writeInt(1);
        paramMediaDescriptionCompat.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      if ((!mRemote.transact(41, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().addQueueItem(paramMediaDescriptionCompat);
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
  
  public void addQueueItemAt(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      if (paramMediaDescriptionCompat != null)
      {
        localParcel1.writeInt(1);
        paramMediaDescriptionCompat.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      localParcel1.writeInt(paramInt);
      if ((!mRemote.transact(42, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().addQueueItemAt(paramMediaDescriptionCompat, paramInt);
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
  
  public void adjustVolume(int paramInt1, int paramInt2, String paramString)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      localParcel1.writeInt(paramInt1);
      localParcel1.writeInt(paramInt2);
      localParcel1.writeString(paramString);
      if ((!mRemote.transact(11, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().adjustVolume(paramInt1, paramInt2, paramString);
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
  
  public IBinder asBinder()
  {
    return mRemote;
  }
  
  public void fastForward()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      if ((!mRemote.transact(22, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().fastForward();
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
  
  public Bundle getExtras()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      Bundle localBundle;
      if ((!mRemote.transact(31, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        localBundle = IMediaSession.Stub.getDefaultImpl().getExtras();
        return localBundle;
      }
      localParcel2.readException();
      if (localParcel2.readInt() != 0) {
        localBundle = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
      } else {
        localBundle = null;
      }
      return localBundle;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public long getFlags()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      if ((!mRemote.transact(9, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        l = IMediaSession.Stub.getDefaultImpl().getFlags();
        return l;
      }
      localParcel2.readException();
      long l = localParcel2.readLong();
      return l;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public String getInterfaceDescriptor()
  {
    return "android.support.v4.media.session.IMediaSession";
  }
  
  public PendingIntent getLaunchPendingIntent()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      PendingIntent localPendingIntent;
      if ((!mRemote.transact(8, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        localPendingIntent = IMediaSession.Stub.getDefaultImpl().getLaunchPendingIntent();
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
  
  public MediaMetadataCompat getMetadata()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      MediaMetadataCompat localMediaMetadataCompat;
      if ((!mRemote.transact(27, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        localMediaMetadataCompat = IMediaSession.Stub.getDefaultImpl().getMetadata();
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
  
  public String getPackageName()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      if ((!mRemote.transact(6, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        str = IMediaSession.Stub.getDefaultImpl().getPackageName();
        return str;
      }
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public PlaybackStateCompat getPlaybackState()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      PlaybackStateCompat localPlaybackStateCompat;
      if ((!mRemote.transact(28, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        localPlaybackStateCompat = IMediaSession.Stub.getDefaultImpl().getPlaybackState();
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
  
  public List<MediaSessionCompat.QueueItem> getQueue()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      if ((!mRemote.transact(29, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        localObject1 = IMediaSession.Stub.getDefaultImpl().getQueue();
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
  
  public CharSequence getQueueTitle()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      CharSequence localCharSequence;
      if ((!mRemote.transact(30, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        localCharSequence = IMediaSession.Stub.getDefaultImpl().getQueueTitle();
        return localCharSequence;
      }
      localParcel2.readException();
      if (localParcel2.readInt() != 0) {
        localCharSequence = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(localParcel2);
      } else {
        localCharSequence = null;
      }
      return localCharSequence;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public int getRatingType()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      if ((!mRemote.transact(32, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        i = IMediaSession.Stub.getDefaultImpl().getRatingType();
        return i;
      }
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public int getRepeatMode()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      if ((!mRemote.transact(37, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        i = IMediaSession.Stub.getDefaultImpl().getRepeatMode();
        return i;
      }
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public Bundle getSessionInfo()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      Bundle localBundle;
      if ((!mRemote.transact(50, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        localBundle = IMediaSession.Stub.getDefaultImpl().getSessionInfo();
        return localBundle;
      }
      localParcel2.readException();
      if (localParcel2.readInt() != 0) {
        localBundle = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
      } else {
        localBundle = null;
      }
      return localBundle;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public int getShuffleMode()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      if ((!mRemote.transact(47, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        i = IMediaSession.Stub.getDefaultImpl().getShuffleMode();
        return i;
      }
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public String getTag()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      if ((!mRemote.transact(7, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        str = IMediaSession.Stub.getDefaultImpl().getTag();
        return str;
      }
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public ParcelableVolumeInfo getVolumeAttributes()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      ParcelableVolumeInfo localParcelableVolumeInfo;
      if ((!mRemote.transact(10, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        localParcelableVolumeInfo = IMediaSession.Stub.getDefaultImpl().getVolumeAttributes();
        return localParcelableVolumeInfo;
      }
      localParcel2.readException();
      if (localParcel2.readInt() != 0) {
        localParcelableVolumeInfo = (ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(localParcel2);
      } else {
        localParcelableVolumeInfo = null;
      }
      return localParcelableVolumeInfo;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean isCaptioningEnabled()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      IBinder localIBinder = mRemote;
      boolean bool = false;
      if ((!localIBinder.transact(45, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        bool = IMediaSession.Stub.getDefaultImpl().isCaptioningEnabled();
        return bool;
      }
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean isShuffleModeEnabledRemoved()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      IBinder localIBinder = mRemote;
      boolean bool = false;
      if ((!localIBinder.transact(38, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        bool = IMediaSession.Stub.getDefaultImpl().isShuffleModeEnabledRemoved();
        return bool;
      }
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean isTransportControlEnabled()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      IBinder localIBinder = mRemote;
      boolean bool = false;
      if ((!localIBinder.transact(5, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        bool = IMediaSession.Stub.getDefaultImpl().isTransportControlEnabled();
        return bool;
      }
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void next()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      if ((!mRemote.transact(20, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().next();
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
  
  public void pause()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      if ((!mRemote.transact(18, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().pause();
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
  
  public void play()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      if ((!mRemote.transact(13, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().play();
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
  
  public void playFromMediaId(String paramString, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      localParcel1.writeString(paramString);
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      if ((!mRemote.transact(14, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().playFromMediaId(paramString, paramBundle);
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
  
  public void playFromSearch(String paramString, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      localParcel1.writeString(paramString);
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      if ((!mRemote.transact(15, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().playFromSearch(paramString, paramBundle);
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
  
  public void playFromUri(Uri paramUri, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      if (paramUri != null)
      {
        localParcel1.writeInt(1);
        paramUri.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      if ((!mRemote.transact(16, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().playFromUri(paramUri, paramBundle);
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
  
  public void prepare()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      if ((!mRemote.transact(33, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().prepare();
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
  
  public void prepareFromMediaId(String paramString, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      localParcel1.writeString(paramString);
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      if ((!mRemote.transact(34, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().prepareFromMediaId(paramString, paramBundle);
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
  
  public void prepareFromSearch(String paramString, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      localParcel1.writeString(paramString);
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      if ((!mRemote.transact(35, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().prepareFromSearch(paramString, paramBundle);
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
  
  public void prepareFromUri(Uri paramUri, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      if (paramUri != null)
      {
        localParcel1.writeInt(1);
        paramUri.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      if ((!mRemote.transact(36, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().prepareFromUri(paramUri, paramBundle);
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
  
  public void previous()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      if ((!mRemote.transact(21, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().previous();
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
  
  public void rate(RatingCompat paramRatingCompat)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      if (paramRatingCompat != null)
      {
        localParcel1.writeInt(1);
        paramRatingCompat.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      if ((!mRemote.transact(25, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().rate(paramRatingCompat);
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
  
  public void rateWithExtras(RatingCompat paramRatingCompat, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      if (paramRatingCompat != null)
      {
        localParcel1.writeInt(1);
        paramRatingCompat.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      if ((!mRemote.transact(51, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().rateWithExtras(paramRatingCompat, paramBundle);
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
  
  public void registerCallbackListener(IMediaControllerCallback paramIMediaControllerCallback)
    throws RemoteException
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
      if ((!mRemote.transact(3, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().registerCallbackListener(paramIMediaControllerCallback);
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
  
  public void removeQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      if (paramMediaDescriptionCompat != null)
      {
        localParcel1.writeInt(1);
        paramMediaDescriptionCompat.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      if ((!mRemote.transact(43, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().removeQueueItem(paramMediaDescriptionCompat);
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
  
  public void removeQueueItemAt(int paramInt)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      localParcel1.writeInt(paramInt);
      if ((!mRemote.transact(44, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().removeQueueItemAt(paramInt);
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
  
  public void rewind()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      if ((!mRemote.transact(23, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().rewind();
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
  
  public void seekTo(long paramLong)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      localParcel1.writeLong(paramLong);
      if ((!mRemote.transact(24, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().seekTo(paramLong);
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
  
  public void sendCommand(String paramString, Bundle paramBundle, MediaSessionCompat.ResultReceiverWrapper paramResultReceiverWrapper)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      localParcel1.writeString(paramString);
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      if (paramResultReceiverWrapper != null)
      {
        localParcel1.writeInt(1);
        paramResultReceiverWrapper.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      if ((!mRemote.transact(1, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().sendCommand(paramString, paramBundle, paramResultReceiverWrapper);
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
  
  public void sendCustomAction(String paramString, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      localParcel1.writeString(paramString);
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      if ((!mRemote.transact(26, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().sendCustomAction(paramString, paramBundle);
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
  
  public boolean sendMediaButton(KeyEvent paramKeyEvent)
    throws RemoteException
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
      if ((!mRemote.transact(2, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        bool = IMediaSession.Stub.getDefaultImpl().sendMediaButton(paramKeyEvent);
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
  
  public void setCaptioningEnabled(boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      int i;
      if (paramBoolean) {
        i = 1;
      } else {
        i = 0;
      }
      localParcel1.writeInt(i);
      if ((!mRemote.transact(46, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().setCaptioningEnabled(paramBoolean);
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
  
  public void setPlaybackSpeed(float paramFloat)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      localParcel1.writeFloat(paramFloat);
      if ((!mRemote.transact(49, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().setPlaybackSpeed(paramFloat);
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
  
  public void setRepeatMode(int paramInt)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      localParcel1.writeInt(paramInt);
      if ((!mRemote.transact(39, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().setRepeatMode(paramInt);
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
  
  public void setShuffleMode(int paramInt)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      localParcel1.writeInt(paramInt);
      if ((!mRemote.transact(48, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().setShuffleMode(paramInt);
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
  
  public void setShuffleModeEnabledRemoved(boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      int i;
      if (paramBoolean) {
        i = 1;
      } else {
        i = 0;
      }
      localParcel1.writeInt(i);
      if ((!mRemote.transact(40, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().setShuffleModeEnabledRemoved(paramBoolean);
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
  
  public void setVolumeTo(int paramInt1, int paramInt2, String paramString)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      localParcel1.writeInt(paramInt1);
      localParcel1.writeInt(paramInt2);
      localParcel1.writeString(paramString);
      if ((!mRemote.transact(12, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().setVolumeTo(paramInt1, paramInt2, paramString);
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
  
  public void skipToQueueItem(long paramLong)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      localParcel1.writeLong(paramLong);
      if ((!mRemote.transact(17, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().skipToQueueItem(paramLong);
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
  
  public void stop()
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      if ((!mRemote.transact(19, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().stop();
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
  
  public void unregisterCallbackListener(IMediaControllerCallback paramIMediaControllerCallback)
    throws RemoteException
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
      if ((!mRemote.transact(4, localParcel1, localParcel2, 0)) && (IMediaSession.Stub.getDefaultImpl() != null))
      {
        IMediaSession.Stub.getDefaultImpl().unregisterCallbackListener(paramIMediaControllerCallback);
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
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.IMediaSession.Stub.Proxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */