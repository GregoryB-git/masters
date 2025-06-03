package androidx.media2.session;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.Surface;
import androidx.versionedparcelable.ParcelImpl;

public abstract class IMediaSession$Stub
  extends Binder
  implements IMediaSession
{
  public IMediaSession$Stub()
  {
    attachInterface(this, "androidx.media2.session.IMediaSession");
  }
  
  public static IMediaSession asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("androidx.media2.session.IMediaSession");
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
      switch (paramInt1)
      {
      default: 
        switch (paramInt1)
        {
        default: 
          return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        }
      case 13: 
        paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
        IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
        paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {
          paramParcel2 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
        }
        if (paramParcel1.readInt() != 0) {
          paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        e();
        return true;
      case 12: 
        paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
        IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
        paramParcel1.readInt();
        paramParcel1.readLong();
        w2();
        return true;
      case 11: 
        paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
        IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
        paramParcel1.readInt();
        Y0();
        return true;
      case 10: 
        paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
        IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
        paramParcel1.readInt();
        l0();
        return true;
      case 9: 
        paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
        IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
        paramParcel1.readInt();
        v();
        return true;
      case 8: 
        paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
        IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
        paramParcel1.readInt();
        l();
        return true;
      case 7: 
        paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
        IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
        paramParcel1.readInt();
        a();
        return true;
      case 6: 
        paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
        IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
        paramParcel1.readInt();
        pause();
        return true;
      case 5: 
        paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
        IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
        paramParcel1.readInt();
        b();
        return true;
      case 4: 
        paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
        IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
        paramParcel1.readInt();
        paramParcel1.readInt();
        paramParcel1.readInt();
        q1();
        return true;
      case 3: 
        paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
        IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
        paramParcel1.readInt();
        paramParcel1.readInt();
        paramParcel1.readInt();
        S1();
        return true;
      case 2: 
        paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
        IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
        paramParcel1.readInt();
        release();
        return true;
      }
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {
        paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
      }
      n();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
      }
      if (paramParcel1.readInt() != 0) {
        paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      x1();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readInt();
      paramParcel1.readInt();
      I0();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {
        paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
      }
      a1();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {
        paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
      }
      H();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {
        paramParcel1 = (Surface)Surface.CREATOR.createFromParcel(paramParcel1);
      }
      l2();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      L0();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {
        paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
      }
      n0();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel1.readInt();
      paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {
        paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
      }
      k1();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {
        paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
      }
      u0();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel1.readInt();
      paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {
        paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
      }
      getChildren();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      getItem();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {
        paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
      }
      t1();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {
        paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
      }
      e0();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readInt();
      S0();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readInt();
      i1();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      A();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      e1();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readInt();
      A2();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readInt();
      paramParcel1.readString();
      v2();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readInt();
      m1();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readInt();
      paramParcel1.readString();
      b3();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {
        paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
      }
      p2();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      j2();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.createStringArrayList();
      if (paramParcel1.readInt() != 0) {
        paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
      }
      D0();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readFloat();
      X();
      return true;
      paramParcel1.enforceInterface("androidx.media2.session.IMediaSession");
      IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {
        paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
      }
      S2();
      return true;
    }
    paramParcel2.writeString("androidx.media2.session.IMediaSession");
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
    
    public final IBinder asBinder()
    {
      return a;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.IMediaSession.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */