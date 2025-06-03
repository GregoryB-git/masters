package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
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
    return new a(paramIBinder);
  }
  
  public static IMediaSession getDefaultImpl()
  {
    return a.b;
  }
  
  public static boolean setDefaultImpl(IMediaSession paramIMediaSession)
  {
    if (a.b == null)
    {
      if (paramIMediaSession != null)
      {
        a.b = paramIMediaSession;
        return true;
      }
      return false;
    }
    throw new IllegalStateException("setDefaultImpl() called twice");
  }
  
  public final IBinder asBinder()
  {
    return this;
  }
  
  public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 != 1598968902)
    {
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
      boolean bool = false;
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
        C1((RatingCompat)localObject5, (Bundle)localObject13);
        paramParcel2.writeNoException();
        return true;
      case 50: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramParcel1 = j();
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
        r1(paramParcel1.readFloat());
        paramParcel2.writeNoException();
        return true;
      case 48: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        L2(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 47: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramInt1 = a2();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 46: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        if (paramParcel1.readInt() != 0) {
          bool = true;
        }
        J1(bool);
        paramParcel2.writeNoException();
        return true;
      case 45: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramInt1 = e2();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 44: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        b2(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 43: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject5 = localObject1;
        if (paramParcel1.readInt() != 0) {
          localObject5 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel1);
        }
        Y((MediaDescriptionCompat)localObject5);
        paramParcel2.writeNoException();
        return true;
      case 42: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject5 = localObject2;
        if (paramParcel1.readInt() != 0) {
          localObject5 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel1);
        }
        F1((MediaDescriptionCompat)localObject5, paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 41: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject5 = localObject3;
        if (paramParcel1.readInt() != 0) {
          localObject5 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel1);
        }
        b0((MediaDescriptionCompat)localObject5);
        paramParcel2.writeNoException();
        return true;
      case 40: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramParcel1.readInt();
        a0();
        paramParcel2.writeNoException();
        return true;
      case 39: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        u(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 38: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        M();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(0);
        return true;
      case 37: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramInt1 = x();
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
        R((Uri)localObject5, (Bundle)localObject13);
        paramParcel2.writeNoException();
        return true;
      case 35: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject13 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {
          localObject5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        W2((Bundle)localObject5, (String)localObject13);
        paramParcel2.writeNoException();
        return true;
      case 34: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject13 = paramParcel1.readString();
        localObject5 = localObject6;
        if (paramParcel1.readInt() != 0) {
          localObject5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        k2((Bundle)localObject5, (String)localObject13);
        paramParcel2.writeNoException();
        return true;
      case 33: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        a();
        paramParcel2.writeNoException();
        return true;
      case 32: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        i0();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(0);
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
        paramParcel1 = C0();
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
        paramParcel1 = o2();
        paramParcel2.writeNoException();
        paramParcel2.writeTypedList(paramParcel1);
        return true;
      case 28: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramParcel1 = d();
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
        paramParcel1 = H0();
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel2.writeBundle(a);
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
        O((Bundle)localObject5, (String)localObject13);
        paramParcel2.writeNoException();
        return true;
      case 25: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject5 = localObject8;
        if (paramParcel1.readInt() != 0) {
          localObject5 = (RatingCompat)RatingCompat.CREATOR.createFromParcel(paramParcel1);
        }
        N((RatingCompat)localObject5);
        paramParcel2.writeNoException();
        return true;
      case 24: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        c1(paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 23: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        v();
        paramParcel2.writeNoException();
        return true;
      case 22: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        l();
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
        B2(paramParcel1.readLong());
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
        V0((Uri)localObject5, (Bundle)localObject13);
        paramParcel2.writeNoException();
        return true;
      case 15: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject13 = paramParcel1.readString();
        localObject5 = localObject10;
        if (paramParcel1.readInt() != 0) {
          localObject5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        x2((Bundle)localObject5, (String)localObject13);
        paramParcel2.writeNoException();
        return true;
      case 14: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject13 = paramParcel1.readString();
        localObject5 = localObject11;
        if (paramParcel1.readInt() != 0) {
          localObject5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        F0((Bundle)localObject5, (String)localObject13);
        paramParcel2.writeNoException();
        return true;
      case 13: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        b();
        paramParcel2.writeNoException();
        return true;
      case 12: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramInt1 = paramParcel1.readInt();
        paramInt2 = paramParcel1.readInt();
        paramParcel1.readString();
        R0(paramInt1, paramInt2);
        paramParcel2.writeNoException();
        return true;
      case 11: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramInt1 = paramParcel1.readInt();
        paramInt2 = paramParcel1.readInt();
        paramParcel1.readString();
        y0(paramInt1, paramInt2);
        paramParcel2.writeNoException();
        return true;
      case 10: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramParcel1 = E2();
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
        long l = w();
        paramParcel2.writeNoException();
        paramParcel2.writeLong(l);
        return true;
      case 8: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramParcel1 = d0();
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
        paramParcel1 = p();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        return true;
      case 6: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramParcel1 = Q2();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        return true;
      case 5: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramInt1 = Z();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 4: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        J0(IMediaControllerCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 3: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        G(IMediaControllerCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 2: 
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject5 = localObject12;
        if (paramParcel1.readInt() != 0) {
          localObject5 = (KeyEvent)KeyEvent.CREATOR.createFromParcel(paramParcel1);
        }
        paramInt1 = u1((KeyEvent)localObject5);
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
      n2(str, (Bundle)localObject5, (MediaSessionCompat.ResultReceiverWrapper)localObject13);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel2.writeString("android.support.v4.media.session.IMediaSession");
    return true;
  }
  
  public static final class a
    implements IMediaSession
  {
    public static IMediaSession b;
    public IBinder a;
    
    public a(IBinder paramIBinder)
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
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.IMediaSession.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */