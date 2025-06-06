package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.util.List;

public abstract interface IMediaControllerCallback
  extends IInterface
{
  public abstract void onCaptioningEnabledChanged(boolean paramBoolean)
    throws RemoteException;
  
  public abstract void onEvent(String paramString, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void onExtrasChanged(Bundle paramBundle)
    throws RemoteException;
  
  public abstract void onMetadataChanged(MediaMetadataCompat paramMediaMetadataCompat)
    throws RemoteException;
  
  public abstract void onPlaybackStateChanged(PlaybackStateCompat paramPlaybackStateCompat)
    throws RemoteException;
  
  public abstract void onQueueChanged(List<MediaSessionCompat.QueueItem> paramList)
    throws RemoteException;
  
  public abstract void onQueueTitleChanged(CharSequence paramCharSequence)
    throws RemoteException;
  
  public abstract void onRepeatModeChanged(int paramInt)
    throws RemoteException;
  
  public abstract void onSessionDestroyed()
    throws RemoteException;
  
  public abstract void onSessionReady()
    throws RemoteException;
  
  public abstract void onShuffleModeChanged(int paramInt)
    throws RemoteException;
  
  public abstract void onShuffleModeChangedRemoved(boolean paramBoolean)
    throws RemoteException;
  
  public abstract void onVolumeInfoChanged(ParcelableVolumeInfo paramParcelableVolumeInfo)
    throws RemoteException;
  
  public static class Default
    implements IMediaControllerCallback
  {
    public IBinder asBinder()
    {
      return null;
    }
    
    public void onCaptioningEnabledChanged(boolean paramBoolean)
      throws RemoteException
    {}
    
    public void onEvent(String paramString, Bundle paramBundle)
      throws RemoteException
    {}
    
    public void onExtrasChanged(Bundle paramBundle)
      throws RemoteException
    {}
    
    public void onMetadataChanged(MediaMetadataCompat paramMediaMetadataCompat)
      throws RemoteException
    {}
    
    public void onPlaybackStateChanged(PlaybackStateCompat paramPlaybackStateCompat)
      throws RemoteException
    {}
    
    public void onQueueChanged(List<MediaSessionCompat.QueueItem> paramList)
      throws RemoteException
    {}
    
    public void onQueueTitleChanged(CharSequence paramCharSequence)
      throws RemoteException
    {}
    
    public void onRepeatModeChanged(int paramInt)
      throws RemoteException
    {}
    
    public void onSessionDestroyed()
      throws RemoteException
    {}
    
    public void onSessionReady()
      throws RemoteException
    {}
    
    public void onShuffleModeChanged(int paramInt)
      throws RemoteException
    {}
    
    public void onShuffleModeChangedRemoved(boolean paramBoolean)
      throws RemoteException
    {}
    
    public void onVolumeInfoChanged(ParcelableVolumeInfo paramParcelableVolumeInfo)
      throws RemoteException
    {}
  }
  
  public static abstract class Stub
    extends Binder
    implements IMediaControllerCallback
  {
    private static final String DESCRIPTOR = "android.support.v4.media.session.IMediaControllerCallback";
    public static final int TRANSACTION_onCaptioningEnabledChanged = 11;
    public static final int TRANSACTION_onEvent = 1;
    public static final int TRANSACTION_onExtrasChanged = 7;
    public static final int TRANSACTION_onMetadataChanged = 4;
    public static final int TRANSACTION_onPlaybackStateChanged = 3;
    public static final int TRANSACTION_onQueueChanged = 5;
    public static final int TRANSACTION_onQueueTitleChanged = 6;
    public static final int TRANSACTION_onRepeatModeChanged = 9;
    public static final int TRANSACTION_onSessionDestroyed = 2;
    public static final int TRANSACTION_onSessionReady = 13;
    public static final int TRANSACTION_onShuffleModeChanged = 12;
    public static final int TRANSACTION_onShuffleModeChangedRemoved = 10;
    public static final int TRANSACTION_onVolumeInfoChanged = 8;
    
    public Stub()
    {
      attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
    }
    
    public static IMediaControllerCallback asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
      if ((localIInterface != null) && ((localIInterface instanceof IMediaControllerCallback))) {
        return (IMediaControllerCallback)localIInterface;
      }
      return new Proxy(paramIBinder);
    }
    
    public static IMediaControllerCallback getDefaultImpl()
    {
      return Proxy.sDefaultImpl;
    }
    
    public static boolean setDefaultImpl(IMediaControllerCallback paramIMediaControllerCallback)
    {
      if (Proxy.sDefaultImpl == null)
      {
        if (paramIMediaControllerCallback != null)
        {
          Proxy.sDefaultImpl = paramIMediaControllerCallback;
          return true;
        }
        return false;
      }
      throw new IllegalStateException("setDefaultImpl() called twice");
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
      throws RemoteException
    {
      if (paramInt1 != 1598968902)
      {
        boolean bool1 = false;
        boolean bool2 = false;
        Object localObject1 = null;
        Object localObject2 = null;
        Object localObject3 = null;
        Object localObject4 = null;
        Object localObject5 = null;
        String str = null;
        switch (paramInt1)
        {
        default: 
          return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        case 13: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          onSessionReady();
          return true;
        case 12: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          onShuffleModeChanged(paramParcel1.readInt());
          return true;
        case 11: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          if (paramParcel1.readInt() != 0) {
            bool2 = true;
          }
          onCaptioningEnabledChanged(bool2);
          return true;
        case 10: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          bool2 = bool1;
          if (paramParcel1.readInt() != 0) {
            bool2 = true;
          }
          onShuffleModeChangedRemoved(bool2);
          return true;
        case 9: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          onRepeatModeChanged(paramParcel1.readInt());
          return true;
        case 8: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          paramParcel2 = str;
          if (paramParcel1.readInt() != 0) {
            paramParcel2 = (ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(paramParcel1);
          }
          onVolumeInfoChanged(paramParcel2);
          return true;
        case 7: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          paramParcel2 = (Parcel)localObject1;
          if (paramParcel1.readInt() != 0) {
            paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          onExtrasChanged(paramParcel2);
          return true;
        case 6: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          paramParcel2 = (Parcel)localObject2;
          if (paramParcel1.readInt() != 0) {
            paramParcel2 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel1);
          }
          onQueueTitleChanged(paramParcel2);
          return true;
        case 5: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          onQueueChanged(paramParcel1.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
          return true;
        case 4: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          paramParcel2 = (Parcel)localObject3;
          if (paramParcel1.readInt() != 0) {
            paramParcel2 = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(paramParcel1);
          }
          onMetadataChanged(paramParcel2);
          return true;
        case 3: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          paramParcel2 = (Parcel)localObject4;
          if (paramParcel1.readInt() != 0) {
            paramParcel2 = (PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(paramParcel1);
          }
          onPlaybackStateChanged(paramParcel2);
          return true;
        case 2: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          onSessionDestroyed();
          return true;
        }
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        str = paramParcel1.readString();
        paramParcel2 = (Parcel)localObject5;
        if (paramParcel1.readInt() != 0) {
          paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        onEvent(str, paramParcel2);
        return true;
      }
      paramParcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
      return true;
    }
    
    public static class Proxy
      implements IMediaControllerCallback
    {
      public static IMediaControllerCallback sDefaultImpl;
      private IBinder mRemote;
      
      public Proxy(IBinder paramIBinder)
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
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.IMediaControllerCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */