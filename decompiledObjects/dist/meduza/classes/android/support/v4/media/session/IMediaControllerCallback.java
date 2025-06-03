package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.lang.ref.Reference;
import java.util.ArrayList;

public abstract interface IMediaControllerCallback
  extends IInterface
{
  public abstract void E1();
  
  public abstract void G1(MediaMetadataCompat paramMediaMetadataCompat);
  
  public abstract void X2(PlaybackStateCompat paramPlaybackStateCompat);
  
  public abstract void c3(ParcelableVolumeInfo paramParcelableVolumeInfo);
  
  public abstract void f1(boolean paramBoolean);
  
  public abstract void g2(int paramInt);
  
  public abstract void q(int paramInt);
  
  public abstract void q0(Bundle paramBundle);
  
  public abstract void x0(ArrayList paramArrayList);
  
  public abstract void y1(CharSequence paramCharSequence);
  
  public static abstract class Stub
    extends Binder
    implements IMediaControllerCallback
  {
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
      return new a(paramIBinder);
    }
    
    public static IMediaControllerCallback getDefaultImpl()
    {
      return a.b;
    }
    
    public static boolean setDefaultImpl(IMediaControllerCallback paramIMediaControllerCallback)
    {
      if (a.b == null)
      {
        if (paramIMediaControllerCallback != null)
        {
          a.b = paramIMediaControllerCallback;
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
        String str = null;
        switch (paramInt1)
        {
        default: 
          return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        case 13: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          paramParcel1 = (MediaControllerCompat.a)a.get();
          if (paramParcel1 != null) {
            paramParcel1.a(13, null, null);
          }
          return true;
        case 12: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          paramInt1 = paramParcel1.readInt();
          ((MediaControllerCompat.a.c)this).g2(paramInt1);
          return true;
        case 11: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          boolean bool;
          if (paramParcel1.readInt() != 0) {
            bool = true;
          } else {
            bool = false;
          }
          ((MediaControllerCompat.a.c)this).f1(bool);
          return true;
        case 10: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          paramParcel1.readInt();
          return true;
        case 9: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          paramInt1 = paramParcel1.readInt();
          ((MediaControllerCompat.a.c)this).q(paramInt1);
          return true;
        case 8: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          paramParcel2 = str;
          if (paramParcel1.readInt() != 0) {
            paramParcel2 = (ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(paramParcel1);
          }
          c3(paramParcel2);
          return true;
        case 7: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          paramParcel2 = (Parcel)localObject1;
          if (paramParcel1.readInt() != 0) {
            paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          q0(paramParcel2);
          return true;
        case 6: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          paramParcel2 = (Parcel)localObject2;
          if (paramParcel1.readInt() != 0) {
            paramParcel2 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel1);
          }
          y1(paramParcel2);
          return true;
        case 5: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          x0(paramParcel1.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
          return true;
        case 4: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          paramParcel2 = (Parcel)localObject3;
          if (paramParcel1.readInt() != 0) {
            paramParcel2 = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(paramParcel1);
          }
          G1(paramParcel2);
          return true;
        case 3: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          paramParcel2 = (Parcel)localObject4;
          if (paramParcel1.readInt() != 0) {
            paramParcel2 = (PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(paramParcel1);
          }
          ((MediaControllerCompat.a.c)this).X2(paramParcel2);
          return true;
        case 2: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          E1();
          return true;
        }
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        str = paramParcel1.readString();
        paramParcel2 = (Parcel)localObject5;
        if (paramParcel1.readInt() != 0) {
          paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        paramParcel1 = (MediaControllerCompat.a)a.get();
        if (paramParcel1 != null) {
          paramParcel1.a(1, str, paramParcel2);
        }
        return true;
      }
      paramParcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
      return true;
    }
    
    public static final class a
      implements IMediaControllerCallback
    {
      public static IMediaControllerCallback b;
      public IBinder a;
      
      public a(IBinder paramIBinder)
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
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.IMediaControllerCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */