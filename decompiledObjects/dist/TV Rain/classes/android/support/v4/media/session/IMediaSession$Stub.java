package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
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

public abstract class IMediaSession$Stub
  extends Binder
  implements IMediaSession
{
  private static final String DESCRIPTOR = "android.support.v4.media.session.IMediaSession";
  public static final int TRANSACTION_addQueueItem = 41;
  public static final int TRANSACTION_addQueueItemAt = 42;
  public static final int TRANSACTION_adjustVolume = 11;
  public static final int TRANSACTION_fastForward = 22;
  public static final int TRANSACTION_getExtras = 31;
  public static final int TRANSACTION_getFlags = 9;
  public static final int TRANSACTION_getLaunchPendingIntent = 8;
  public static final int TRANSACTION_getMetadata = 27;
  public static final int TRANSACTION_getPackageName = 6;
  public static final int TRANSACTION_getPlaybackState = 28;
  public static final int TRANSACTION_getQueue = 29;
  public static final int TRANSACTION_getQueueTitle = 30;
  public static final int TRANSACTION_getRatingType = 32;
  public static final int TRANSACTION_getRepeatMode = 37;
  public static final int TRANSACTION_getSessionInfo = 50;
  public static final int TRANSACTION_getShuffleMode = 47;
  public static final int TRANSACTION_getTag = 7;
  public static final int TRANSACTION_getVolumeAttributes = 10;
  public static final int TRANSACTION_isCaptioningEnabled = 45;
  public static final int TRANSACTION_isShuffleModeEnabledRemoved = 38;
  public static final int TRANSACTION_isTransportControlEnabled = 5;
  public static final int TRANSACTION_next = 20;
  public static final int TRANSACTION_pause = 18;
  public static final int TRANSACTION_play = 13;
  public static final int TRANSACTION_playFromMediaId = 14;
  public static final int TRANSACTION_playFromSearch = 15;
  public static final int TRANSACTION_playFromUri = 16;
  public static final int TRANSACTION_prepare = 33;
  public static final int TRANSACTION_prepareFromMediaId = 34;
  public static final int TRANSACTION_prepareFromSearch = 35;
  public static final int TRANSACTION_prepareFromUri = 36;
  public static final int TRANSACTION_previous = 21;
  public static final int TRANSACTION_rate = 25;
  public static final int TRANSACTION_rateWithExtras = 51;
  public static final int TRANSACTION_registerCallbackListener = 3;
  public static final int TRANSACTION_removeQueueItem = 43;
  public static final int TRANSACTION_removeQueueItemAt = 44;
  public static final int TRANSACTION_rewind = 23;
  public static final int TRANSACTION_seekTo = 24;
  public static final int TRANSACTION_sendCommand = 1;
  public static final int TRANSACTION_sendCustomAction = 26;
  public static final int TRANSACTION_sendMediaButton = 2;
  public static final int TRANSACTION_setCaptioningEnabled = 46;
  public static final int TRANSACTION_setPlaybackSpeed = 49;
  public static final int TRANSACTION_setRepeatMode = 39;
  public static final int TRANSACTION_setShuffleMode = 48;
  public static final int TRANSACTION_setShuffleModeEnabledRemoved = 40;
  public static final int TRANSACTION_setVolumeTo = 12;
  public static final int TRANSACTION_skipToQueueItem = 17;
  public static final int TRANSACTION_stop = 19;
  public static final int TRANSACTION_unregisterCallbackListener = 4;
  
  public IMediaSession$Stub()
  {
    attachInterface(this, "android.support.v4.media.session.IMediaSession");
  }
  
  public static IMediaSession asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
    if ((localIInterface != null) && ((localIInterface instanceof IMediaSession))) {
      return (IMediaSession)localIInterface;
    }
    return new Proxy(paramIBinder);
  }
  
  public static IMediaSession getDefaultImpl()
  {
    return Proxy.sDefaultImpl;
  }
  
  public static boolean setDefaultImpl(IMediaSession paramIMediaSession)
  {
    if (Proxy.sDefaultImpl == null)
    {
      if (paramIMediaSession != null)
      {
        Proxy.sDefaultImpl = paramIMediaSession;
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
      Object localObject6 = null;
      Object localObject7 = null;
      Object localObject8 = null;
      Object localObject9 = null;
      Object localObject10 = null;
      Object localObject11 = null;
      Object localObject12 = null;
      Object localObject13 = null;
      String str = null;
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 51: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        if (paramParcel1.readInt() != 0) {
          localObject5 = (RatingCompat)RatingCompat.CREATOR.createFromParcel(paramParcel1);
        } else {
          localObject5 = null;
        }
        localObject13 = str;
        if (paramParcel1.readInt() != 0) {
          localObject13 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        rateWithExtras((RatingCompat)localObject5, (Bundle)localObject13);
        paramParcel2.writeNoException();
        return true;
      case 50: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramParcel1 = getSessionInfo();
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        else
        {
          paramParcel2.writeInt(0);
        }
        return true;
      case 49: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        setPlaybackSpeed(paramParcel1.readFloat());
        paramParcel2.writeNoException();
        return true;
      case 48: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        setShuffleMode(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 47: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramInt1 = getShuffleMode();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 46: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        if (paramParcel1.readInt() != 0) {
          bool2 = true;
        }
        setCaptioningEnabled(bool2);
        paramParcel2.writeNoException();
        return true;
      case 45: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramInt1 = isCaptioningEnabled();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 44: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        removeQueueItemAt(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 43: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject5 = localObject1;
        if (paramParcel1.readInt() != 0) {
          localObject5 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel1);
        }
        removeQueueItem((MediaDescriptionCompat)localObject5);
        paramParcel2.writeNoException();
        return true;
      case 42: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject5 = localObject2;
        if (paramParcel1.readInt() != 0) {
          localObject5 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel1);
        }
        addQueueItemAt((MediaDescriptionCompat)localObject5, paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 41: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject5 = localObject3;
        if (paramParcel1.readInt() != 0) {
          localObject5 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel1);
        }
        addQueueItem((MediaDescriptionCompat)localObject5);
        paramParcel2.writeNoException();
        return true;
      case 40: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        bool2 = bool1;
        if (paramParcel1.readInt() != 0) {
          bool2 = true;
        }
        setShuffleModeEnabledRemoved(bool2);
        paramParcel2.writeNoException();
        return true;
      case 39: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        setRepeatMode(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 38: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramInt1 = isShuffleModeEnabledRemoved();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 37: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramInt1 = getRepeatMode();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 36: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        if (paramParcel1.readInt() != 0) {
          localObject5 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        } else {
          localObject5 = null;
        }
        localObject13 = localObject4;
        if (paramParcel1.readInt() != 0) {
          localObject13 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        prepareFromUri((Uri)localObject5, (Bundle)localObject13);
        paramParcel2.writeNoException();
        return true;
      case 35: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject13 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {
          localObject5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        prepareFromSearch((String)localObject13, (Bundle)localObject5);
        paramParcel2.writeNoException();
        return true;
      case 34: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject13 = paramParcel1.readString();
        localObject5 = localObject6;
        if (paramParcel1.readInt() != 0) {
          localObject5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        prepareFromMediaId((String)localObject13, (Bundle)localObject5);
        paramParcel2.writeNoException();
        return true;
      case 33: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        prepare();
        paramParcel2.writeNoException();
        return true;
      case 32: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramInt1 = getRatingType();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 31: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramParcel1 = getExtras();
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        else
        {
          paramParcel2.writeInt(0);
        }
        return true;
      case 30: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramParcel1 = getQueueTitle();
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          TextUtils.writeToParcel(paramParcel1, paramParcel2, 1);
        }
        else
        {
          paramParcel2.writeInt(0);
        }
        return true;
      case 29: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramParcel1 = getQueue();
        paramParcel2.writeNoException();
        paramParcel2.writeTypedList(paramParcel1);
        return true;
      case 28: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramParcel1 = getPlaybackState();
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        else
        {
          paramParcel2.writeInt(0);
        }
        return true;
      case 27: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramParcel1 = getMetadata();
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        else
        {
          paramParcel2.writeInt(0);
        }
        return true;
      case 26: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject13 = paramParcel1.readString();
        localObject5 = localObject7;
        if (paramParcel1.readInt() != 0) {
          localObject5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        sendCustomAction((String)localObject13, (Bundle)localObject5);
        paramParcel2.writeNoException();
        return true;
      case 25: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject5 = localObject8;
        if (paramParcel1.readInt() != 0) {
          localObject5 = (RatingCompat)RatingCompat.CREATOR.createFromParcel(paramParcel1);
        }
        rate((RatingCompat)localObject5);
        paramParcel2.writeNoException();
        return true;
      case 24: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        seekTo(paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 23: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        rewind();
        paramParcel2.writeNoException();
        return true;
      case 22: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        fastForward();
        paramParcel2.writeNoException();
        return true;
      case 21: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        previous();
        paramParcel2.writeNoException();
        return true;
      case 20: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        next();
        paramParcel2.writeNoException();
        return true;
      case 19: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        stop();
        paramParcel2.writeNoException();
        return true;
      case 18: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        pause();
        paramParcel2.writeNoException();
        return true;
      case 17: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        skipToQueueItem(paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 16: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        if (paramParcel1.readInt() != 0) {
          localObject5 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        } else {
          localObject5 = null;
        }
        localObject13 = localObject9;
        if (paramParcel1.readInt() != 0) {
          localObject13 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        playFromUri((Uri)localObject5, (Bundle)localObject13);
        paramParcel2.writeNoException();
        return true;
      case 15: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject13 = paramParcel1.readString();
        localObject5 = localObject10;
        if (paramParcel1.readInt() != 0) {
          localObject5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        playFromSearch((String)localObject13, (Bundle)localObject5);
        paramParcel2.writeNoException();
        return true;
      case 14: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject13 = paramParcel1.readString();
        localObject5 = localObject11;
        if (paramParcel1.readInt() != 0) {
          localObject5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        playFromMediaId((String)localObject13, (Bundle)localObject5);
        paramParcel2.writeNoException();
        return true;
      case 13: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        play();
        paramParcel2.writeNoException();
        return true;
      case 12: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        setVolumeTo(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 11: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        adjustVolume(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 10: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramParcel1 = getVolumeAttributes();
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        else
        {
          paramParcel2.writeInt(0);
        }
        return true;
      case 9: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        long l = getFlags();
        paramParcel2.writeNoException();
        paramParcel2.writeLong(l);
        return true;
      case 8: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramParcel1 = getLaunchPendingIntent();
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        else
        {
          paramParcel2.writeInt(0);
        }
        return true;
      case 7: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramParcel1 = getTag();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        return true;
      case 6: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramParcel1 = getPackageName();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        return true;
      case 5: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramInt1 = isTransportControlEnabled();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 4: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        unregisterCallbackListener(IMediaControllerCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 3: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        registerCallbackListener(IMediaControllerCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 2: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject5 = localObject12;
        if (paramParcel1.readInt() != 0) {
          localObject5 = (KeyEvent)KeyEvent.CREATOR.createFromParcel(paramParcel1);
        }
        paramInt1 = sendMediaButton((KeyEvent)localObject5);
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      }
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      str = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {
        localObject5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      } else {
        localObject5 = null;
      }
      if (paramParcel1.readInt() != 0) {
        localObject13 = (MediaSessionCompat.ResultReceiverWrapper)MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(paramParcel1);
      }
      sendCommand(str, (Bundle)localObject5, (MediaSessionCompat.ResultReceiverWrapper)localObject13);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel2.writeString("android.support.v4.media.session.IMediaSession");
    return true;
  }
  
  public static class Proxy
    implements IMediaSession
  {
    public static IMediaSession sDefaultImpl;
    private IBinder mRemote;
    
    public Proxy(IBinder paramIBinder)
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
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.IMediaSession.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */