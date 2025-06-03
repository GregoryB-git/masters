package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.util.List;

public abstract class a$a
  extends Binder
  implements a
{
  public a$a()
  {
    attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
  }
  
  public static a n(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
    if ((localIInterface != null) && ((localIInterface instanceof a))) {
      return (a)localIInterface;
    }
    return new a(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if ((paramInt1 >= 1) && (paramInt1 <= 16777215)) {
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
    }
    if (paramInt1 == 1598968902)
    {
      paramParcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
      return true;
    }
    boolean bool1 = false;
    boolean bool2 = false;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 13: 
      f0();
      break;
    case 12: 
      d0(paramParcel1.readInt());
      break;
    case 11: 
      if (paramParcel1.readInt() != 0) {
        bool2 = true;
      }
      J0(bool2);
      break;
    case 10: 
      bool2 = bool1;
      if (paramParcel1.readInt() != 0) {
        bool2 = true;
      }
      w(bool2);
      break;
    case 9: 
      m(paramParcel1.readInt());
      break;
    case 8: 
      X0((ParcelableVolumeInfo)a.b.a(paramParcel1, ParcelableVolumeInfo.CREATOR));
      break;
    case 7: 
      g0((Bundle)a.b.a(paramParcel1, Bundle.CREATOR));
      break;
    case 6: 
      x((CharSequence)a.b.a(paramParcel1, TextUtils.CHAR_SEQUENCE_CREATOR));
      break;
    case 5: 
      l0(paramParcel1.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
      break;
    case 4: 
      E((MediaMetadataCompat)a.b.a(paramParcel1, MediaMetadataCompat.CREATOR));
      break;
    case 3: 
      Q0((PlaybackStateCompat)a.b.a(paramParcel1, PlaybackStateCompat.CREATOR));
      break;
    case 2: 
      C();
      break;
    case 1: 
      t(paramParcel1.readString(), (Bundle)a.b.a(paramParcel1, Bundle.CREATOR));
    }
    return true;
  }
  
  public static class a
    implements a
  {
    public IBinder b;
    
    public a(IBinder paramIBinder)
    {
      b = paramIBinder;
    }
    
    public void C()
    {
      Parcel localParcel = Parcel.obtain();
      try
      {
        localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
        b.transact(2, localParcel, null, 1);
        return;
      }
      finally
      {
        localParcel.recycle();
      }
    }
    
    public void E(MediaMetadataCompat paramMediaMetadataCompat)
    {
      Parcel localParcel = Parcel.obtain();
      try
      {
        localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
        a.b.b(localParcel, paramMediaMetadataCompat, 0);
        b.transact(4, localParcel, null, 1);
        return;
      }
      finally
      {
        localParcel.recycle();
      }
    }
    
    public void J0(boolean paramBoolean)
    {
      Parcel localParcel = Parcel.obtain();
      try
      {
        localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
        localParcel.writeInt(paramBoolean);
        b.transact(11, localParcel, null, 1);
        return;
      }
      finally
      {
        localParcel.recycle();
      }
    }
    
    public void Q0(PlaybackStateCompat paramPlaybackStateCompat)
    {
      Parcel localParcel = Parcel.obtain();
      try
      {
        localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
        a.b.b(localParcel, paramPlaybackStateCompat, 0);
        b.transact(3, localParcel, null, 1);
        return;
      }
      finally
      {
        localParcel.recycle();
      }
    }
    
    public void X0(ParcelableVolumeInfo paramParcelableVolumeInfo)
    {
      Parcel localParcel = Parcel.obtain();
      try
      {
        localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
        a.b.b(localParcel, paramParcelableVolumeInfo, 0);
        b.transact(8, localParcel, null, 1);
        return;
      }
      finally
      {
        localParcel.recycle();
      }
    }
    
    public IBinder asBinder()
    {
      return b;
    }
    
    public void d0(int paramInt)
    {
      Parcel localParcel = Parcel.obtain();
      try
      {
        localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
        localParcel.writeInt(paramInt);
        b.transact(12, localParcel, null, 1);
        return;
      }
      finally
      {
        localParcel.recycle();
      }
    }
    
    public void l0(List paramList)
    {
      Parcel localParcel = Parcel.obtain();
      try
      {
        localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
        a.b.c(localParcel, paramList, 0);
        b.transact(5, localParcel, null, 1);
        return;
      }
      finally
      {
        localParcel.recycle();
      }
    }
    
    public void m(int paramInt)
    {
      Parcel localParcel = Parcel.obtain();
      try
      {
        localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
        localParcel.writeInt(paramInt);
        b.transact(9, localParcel, null, 1);
        return;
      }
      finally
      {
        localParcel.recycle();
      }
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */