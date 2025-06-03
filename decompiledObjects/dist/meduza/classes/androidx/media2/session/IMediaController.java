package androidx.media2.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.media2.common.ParcelImplListSlice;
import androidx.versionedparcelable.ParcelImpl;

public abstract interface IMediaController
  extends IInterface
{
  public abstract void C2();
  
  public abstract void F2();
  
  public abstract void G2();
  
  public abstract void O0();
  
  public abstract void P();
  
  public abstract void Q0();
  
  public abstract void S();
  
  public abstract void U0();
  
  public abstract void X1();
  
  public abstract void Z0();
  
  public abstract void Z2();
  
  public abstract void c();
  
  public abstract void e();
  
  public abstract void f();
  
  public abstract void f0();
  
  public abstract void h();
  
  public abstract void o();
  
  public abstract void p1();
  
  public abstract void r0();
  
  public abstract void s();
  
  public abstract void s0();
  
  public abstract void t2();
  
  public abstract void v0();
  
  public abstract void y2();
  
  public abstract void z();
  
  public static abstract class Stub
    extends Binder
    implements IMediaController
  {
    public Stub()
    {
      attachInterface(this, "androidx.media2.session.IMediaController");
    }
    
    public static IMediaController asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("androidx.media2.session.IMediaController");
      if ((localIInterface != null) && ((localIInterface instanceof IMediaController))) {
        return (IMediaController)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public static IMediaController getDefaultImpl()
    {
      return a.b;
    }
    
    public static boolean setDefaultImpl(IMediaController paramIMediaController)
    {
      if (a.b == null)
      {
        if (paramIMediaController != null)
        {
          a.b = paramIMediaController;
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
          return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        case 25: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          if (paramParcel1.readInt() != 0) {
            paramParcel2 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
          }
          if (paramParcel1.readInt() != 0) {
            paramParcel2 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
          }
          if (paramParcel1.readInt() != 0) {
            paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
          }
          Q0();
          return true;
        case 24: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          if (paramParcel1.readInt() != 0) {
            paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
          }
          v0();
          return true;
        case 23: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          if (paramParcel1.readInt() != 0) {
            paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
          }
          s0();
          return true;
        case 22: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          paramParcel2 = ParcelImpl.CREATOR;
          paramParcel1.createTypedArrayList(paramParcel2);
          ParcelImpl localParcelImpl;
          if (paramParcel1.readInt() != 0) {
            localParcelImpl = (ParcelImpl)paramParcel2.createFromParcel(paramParcel1);
          }
          if (paramParcel1.readInt() != 0) {
            localParcelImpl = (ParcelImpl)paramParcel2.createFromParcel(paramParcel1);
          }
          if (paramParcel1.readInt() != 0) {
            localParcelImpl = (ParcelImpl)paramParcel2.createFromParcel(paramParcel1);
          }
          if (paramParcel1.readInt() != 0) {
            paramParcel1 = (ParcelImpl)paramParcel2.createFromParcel(paramParcel1);
          }
          p1();
          return true;
        case 21: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          if (paramParcel1.readInt() != 0) {
            paramParcel2 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
          }
          if (paramParcel1.readInt() != 0) {
            paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
          }
          z();
          return true;
        case 20: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          paramParcel1.readString();
          paramParcel1.readInt();
          if (paramParcel1.readInt() != 0) {
            paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
          }
          y2();
          return true;
        case 19: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          paramParcel1.readString();
          paramParcel1.readInt();
          if (paramParcel1.readInt() != 0) {
            paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
          }
          Z0();
          return true;
        case 18: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          if (paramParcel1.readInt() != 0) {
            paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
          }
          Z2();
          return true;
        case 17: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          if (paramParcel1.readInt() != 0) {
            paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
          }
          P();
          return true;
        case 16: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          if (paramParcel1.readInt() != 0) {
            paramParcel2 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
          }
          if (paramParcel1.readInt() != 0) {
            paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          e();
          return true;
        case 15: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          if (paramParcel1.readInt() != 0) {
            paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
          }
          r0();
          return true;
        case 14: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          paramParcel1.createTypedArrayList(ParcelImpl.CREATOR);
          F2();
          return true;
        case 13: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          X1();
          return true;
        case 12: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          if (paramParcel1.readInt() != 0) {
            paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
          }
          s();
          return true;
        case 11: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          paramParcel1.readLong();
          paramParcel1.readLong();
          paramParcel1.readLong();
          t2();
          return true;
        case 10: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          C2();
          return true;
        case 9: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          paramParcel1.readInt();
          paramParcel1.readInt();
          paramParcel1.readInt();
          paramParcel1.readInt();
          h();
          return true;
        case 8: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          paramParcel1.readInt();
          paramParcel1.readInt();
          paramParcel1.readInt();
          paramParcel1.readInt();
          c();
          return true;
        case 7: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          if (paramParcel1.readInt() != 0) {
            paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
          }
          f0();
          return true;
        case 6: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          if (paramParcel1.readInt() != 0) {
            paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
          }
          U0();
          return true;
        case 5: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          if (paramParcel1.readInt() != 0) {
            paramParcel2 = (ParcelImplListSlice)ParcelImplListSlice.CREATOR.createFromParcel(paramParcel1);
          }
          if (paramParcel1.readInt() != 0) {
            paramParcel2 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
          }
          paramParcel1.readInt();
          paramParcel1.readInt();
          paramParcel1.readInt();
          f();
          return true;
        case 4: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          if (paramParcel1.readInt() != 0) {
            paramParcel2 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
          }
          paramParcel1.readInt();
          paramParcel1.readLong();
          paramParcel1.readLong();
          paramParcel1.readLong();
          S();
          return true;
        case 3: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          paramParcel1.readLong();
          paramParcel1.readLong();
          paramParcel1.readFloat();
          G2();
          return true;
        case 2: 
          paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
          paramParcel1.readInt();
          paramParcel1.readLong();
          paramParcel1.readLong();
          paramParcel1.readInt();
          o();
          return true;
        }
        paramParcel1.enforceInterface("androidx.media2.session.IMediaController");
        paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {
          paramParcel2 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
        }
        paramParcel1.readInt();
        paramParcel1.readInt();
        paramParcel1.readInt();
        O0();
        return true;
      }
      paramParcel2.writeString("androidx.media2.session.IMediaController");
      return true;
    }
    
    public static final class a
      implements IMediaController
    {
      public static IMediaController b;
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
}

/* Location:
 * Qualified Name:     androidx.media2.session.IMediaController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */