package android.support.v4.media.session;

import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import java.util.ArrayList;

public final class IMediaControllerCallback$Stub$a
  implements IMediaControllerCallback
{
  public static IMediaControllerCallback b;
  public IBinder a;
  
  public IMediaControllerCallback$Stub$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  public final void E1()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      if ((!a.transact(2, localParcel, null, 1)) && (IMediaControllerCallback.Stub.getDefaultImpl() != null))
      {
        IMediaControllerCallback.Stub.getDefaultImpl().E1();
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public final void G1(MediaMetadataCompat paramMediaMetadataCompat)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      if (paramMediaMetadataCompat != null)
      {
        localParcel.writeInt(1);
        localParcel.writeBundle(a);
      }
      else
      {
        localParcel.writeInt(0);
      }
      if ((!a.transact(4, localParcel, null, 1)) && (IMediaControllerCallback.Stub.getDefaultImpl() != null))
      {
        IMediaControllerCallback.Stub.getDefaultImpl().G1(paramMediaMetadataCompat);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public final void X2(PlaybackStateCompat paramPlaybackStateCompat)
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
      if ((!a.transact(3, localParcel, null, 1)) && (IMediaControllerCallback.Stub.getDefaultImpl() != null))
      {
        IMediaControllerCallback.Stub.getDefaultImpl().X2(paramPlaybackStateCompat);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public final IBinder asBinder()
  {
    return a;
  }
  
  public final void c3(ParcelableVolumeInfo paramParcelableVolumeInfo)
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
      if ((!a.transact(8, localParcel, null, 1)) && (IMediaControllerCallback.Stub.getDefaultImpl() != null))
      {
        IMediaControllerCallback.Stub.getDefaultImpl().c3(paramParcelableVolumeInfo);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public final void f1(boolean paramBoolean)
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
      if ((!a.transact(11, localParcel, null, 1)) && (IMediaControllerCallback.Stub.getDefaultImpl() != null))
      {
        IMediaControllerCallback.Stub.getDefaultImpl().f1(paramBoolean);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public final void g2(int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      localParcel.writeInt(paramInt);
      if ((!a.transact(12, localParcel, null, 1)) && (IMediaControllerCallback.Stub.getDefaultImpl() != null))
      {
        IMediaControllerCallback.Stub.getDefaultImpl().g2(paramInt);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public final void q(int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      localParcel.writeInt(paramInt);
      if ((!a.transact(9, localParcel, null, 1)) && (IMediaControllerCallback.Stub.getDefaultImpl() != null))
      {
        IMediaControllerCallback.Stub.getDefaultImpl().q(paramInt);
        return;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public final void x0(ArrayList paramArrayList)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      localParcel.writeTypedList(paramArrayList);
      if ((!a.transact(5, localParcel, null, 1)) && (IMediaControllerCallback.Stub.getDefaultImpl() != null))
      {
        IMediaControllerCallback.Stub.getDefaultImpl().x0(paramArrayList);
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
 * Qualified Name:     android.support.v4.media.session.IMediaControllerCallback.Stub.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */