package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;

public abstract class b$a
  extends Binder
  implements b
{
  public b$a()
  {
    attachInterface(this, "android.support.v4.media.session.IMediaSession");
  }
  
  public static b n(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
    if ((localIInterface != null) && ((localIInterface instanceof b))) {
      return (b)localIInterface;
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
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
    }
    if (paramInt1 == 1598968902)
    {
      paramParcel2.writeString("android.support.v4.media.session.IMediaSession");
      return true;
    }
    boolean bool1 = false;
    boolean bool2 = false;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 51: 
      B((RatingCompat)b.b.a(paramParcel1, RatingCompat.CREATOR), (Bundle)b.b.a(paramParcel1, Bundle.CREATOR));
    }
    for (;;)
    {
      paramParcel2.writeNoException();
      break;
      paramParcel1 = t0();
      label306:
      paramParcel2.writeNoException();
      b.b.b(paramParcel2, paramParcel1, 1);
      break;
      u(paramParcel1.readFloat());
      continue;
      s(paramParcel1.readInt());
      continue;
      paramInt1 = U();
      for (;;)
      {
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        break label1121;
        if (paramParcel1.readInt() != 0) {
          bool2 = true;
        }
        k(bool2);
        break;
        paramInt1 = b0();
        continue;
        V(paramParcel1.readInt());
        break;
        Q((MediaDescriptionCompat)b.b.a(paramParcel1, MediaDescriptionCompat.CREATOR));
        break;
        D((MediaDescriptionCompat)b.b.a(paramParcel1, MediaDescriptionCompat.CREATOR), paramParcel1.readInt());
        break;
        S((MediaDescriptionCompat)b.b.a(paramParcel1, MediaDescriptionCompat.CREATOR));
        break;
        bool2 = bool1;
        if (paramParcel1.readInt() != 0) {
          bool2 = true;
        }
        z0(bool2);
        break;
        i(paramParcel1.readInt());
        break;
        paramInt1 = H();
        continue;
        paramInt1 = q();
        continue;
        M((Uri)b.b.a(paramParcel1, Uri.CREATOR), (Bundle)b.b.a(paramParcel1, Bundle.CREATOR));
        break;
        Y(paramParcel1.readString(), (Bundle)b.b.a(paramParcel1, Bundle.CREATOR));
        break;
        s0(paramParcel1.readString(), (Bundle)b.b.a(paramParcel1, Bundle.CREATOR));
        break;
        g();
        break;
        paramInt1 = X();
        continue;
        paramParcel1 = r();
        break label306;
        paramParcel1 = p0();
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          TextUtils.writeToParcel(paramParcel1, paramParcel2, 1);
          break label1121;
        }
        paramParcel2.writeInt(0);
        break label1121;
        paramParcel1 = k0();
        paramParcel2.writeNoException();
        b.b.c(paramParcel2, paramParcel1, 1);
        break label1121;
        paramParcel1 = f();
        break label306;
        paramParcel1 = r0();
        break label306;
        y(paramParcel1.readString(), (Bundle)b.b.a(paramParcel1, Bundle.CREATOR));
        break;
        I((RatingCompat)b.b.a(paramParcel1, RatingCompat.CREATOR));
        break;
        H0(paramParcel1.readLong());
        break;
        o0();
        break;
        E0();
        break;
        previous();
        break;
        next();
        break;
        stop();
        break;
        j();
        break;
        y0(paramParcel1.readLong());
        break;
        G0((Uri)b.b.a(paramParcel1, Uri.CREATOR), (Bundle)b.b.a(paramParcel1, Bundle.CREATOR));
        break;
        A0(paramParcel1.readString(), (Bundle)b.b.a(paramParcel1, Bundle.CREATOR));
        break;
        v0(paramParcel1.readString(), (Bundle)b.b.a(paramParcel1, Bundle.CREATOR));
        break;
        p();
        break;
        J(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
        break;
        z(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
        break;
        paramParcel1 = C0();
        break label306;
        long l = w0();
        paramParcel2.writeNoException();
        paramParcel2.writeLong(l);
        break label1121;
        paramParcel1 = T();
        break label306;
        for (paramParcel1 = e();; paramParcel1 = N0())
        {
          paramParcel2.writeNoException();
          paramParcel2.writeString(paramParcel1);
          break;
        }
        paramInt1 = R();
        continue;
        u0(a.a.n(paramParcel1.readStrongBinder()));
        break;
        A(a.a.n(paramParcel1.readStrongBinder()));
        break;
        paramInt1 = Y0((KeyEvent)b.b.a(paramParcel1, KeyEvent.CREATOR));
      }
      j0(paramParcel1.readString(), (Bundle)b.b.a(paramParcel1, Bundle.CREATOR), (MediaSessionCompat.ResultReceiverWrapper)b.b.a(paramParcel1, MediaSessionCompat.ResultReceiverWrapper.CREATOR));
    }
    label1121:
    return true;
  }
  
  public static class a
    implements b
  {
    public IBinder b;
    
    public a(IBinder paramIBinder)
    {
      b = paramIBinder;
    }
    
    public void A(a parama)
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
        localParcel1.writeStrongInterface(parama);
        b.transact(3, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public PendingIntent T()
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
        b.transact(8, localParcel1, localParcel2, 0);
        localParcel2.readException();
        PendingIntent localPendingIntent = (PendingIntent)b.b.a(localParcel2, PendingIntent.CREATOR);
        return localPendingIntent;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public boolean Y0(KeyEvent paramKeyEvent)
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
        boolean bool = false;
        b.b.b(localParcel1, paramKeyEvent, 0);
        b.transact(2, localParcel1, localParcel2, 0);
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
    
    public IBinder asBinder()
    {
      return b;
    }
    
    public void u0(a parama)
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
        localParcel1.writeStrongInterface(parama);
        b.transact(4, localParcel1, localParcel2, 0);
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
 * Qualified Name:     android.support.v4.media.session.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */