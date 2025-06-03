package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public abstract interface ICustomTabsService
  extends IInterface
{
  public static final String h = "android$support$customtabs$ICustomTabsService".replace('$', '.');
  
  public abstract int H1(ICustomTabsCallback paramICustomTabsCallback, String paramString, Bundle paramBundle);
  
  public abstract boolean T(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri, Bundle paramBundle, List<Bundle> paramList);
  
  public abstract boolean T1(ICustomTabsCallback paramICustomTabsCallback);
  
  public abstract boolean U1(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri, Bundle paramBundle);
  
  public abstract boolean U2(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle);
  
  public abstract boolean W1(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle);
  
  public abstract boolean d2(ICustomTabsCallback paramICustomTabsCallback, IBinder paramIBinder, Bundle paramBundle);
  
  public abstract boolean g1(long paramLong);
  
  public abstract boolean i2(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle);
  
  public abstract boolean p0(int paramInt, Uri paramUri, Bundle paramBundle, ICustomTabsCallback paramICustomTabsCallback);
  
  public abstract boolean s2(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri);
  
  public abstract Bundle t();
  
  public abstract boolean t0();
  
  public static abstract class Stub
    extends Binder
    implements ICustomTabsService
  {
    public Stub()
    {
      attachInterface(this, ICustomTabsService.h);
    }
    
    public static ICustomTabsService asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface(ICustomTabsService.h);
      if ((localIInterface != null) && ((localIInterface instanceof ICustomTabsService))) {
        return (ICustomTabsService)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public final IBinder asBinder()
    {
      return this;
    }
    
    public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      Object localObject = ICustomTabsService.h;
      if ((paramInt1 >= 1) && (paramInt1 <= 16777215)) {
        paramParcel1.enforceInterface((String)localObject);
      }
      if (paramInt1 == 1598968902)
      {
        paramParcel2.writeString((String)localObject);
        return true;
      }
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 14: 
        paramInt1 = d2(ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder()), paramParcel1.readStrongBinder(), (Bundle)ICustomTabsService.a.a(paramParcel1, Bundle.CREATOR));
        break;
      case 13: 
        paramInt1 = U2(ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder()), (Bundle)ICustomTabsService.a.a(paramParcel1, Bundle.CREATOR));
        break;
      case 12: 
        ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder());
        localObject = (Uri)ICustomTabsService.a.a(paramParcel1, Uri.CREATOR);
        paramParcel1.readInt();
        paramParcel1 = (Bundle)ICustomTabsService.a.a(paramParcel1, Bundle.CREATOR);
        paramInt1 = t0();
        break;
      case 11: 
        paramInt1 = U1(ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder()), (Uri)ICustomTabsService.a.a(paramParcel1, Uri.CREATOR), (Bundle)ICustomTabsService.a.a(paramParcel1, Bundle.CREATOR));
        break;
      case 10: 
        paramInt1 = W1(ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder()), (Bundle)ICustomTabsService.a.a(paramParcel1, Bundle.CREATOR));
        break;
      case 9: 
        localObject = ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder());
        paramInt1 = p0(paramParcel1.readInt(), (Uri)ICustomTabsService.a.a(paramParcel1, Uri.CREATOR), (Bundle)ICustomTabsService.a.a(paramParcel1, Bundle.CREATOR), (ICustomTabsCallback)localObject);
        break;
      case 8: 
        paramInt1 = H1(ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder()), paramParcel1.readString(), (Bundle)ICustomTabsService.a.a(paramParcel1, Bundle.CREATOR));
        break;
      case 7: 
        paramInt1 = s2(ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder()), (Uri)ICustomTabsService.a.a(paramParcel1, Uri.CREATOR));
        break;
      case 6: 
        paramInt1 = i2(ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder()), (Bundle)ICustomTabsService.a.a(paramParcel1, Bundle.CREATOR));
        break;
      case 5: 
        paramParcel1.readString();
        paramParcel1 = (Bundle)ICustomTabsService.a.a(paramParcel1, Bundle.CREATOR);
        paramParcel1 = t();
        paramParcel2.writeNoException();
        ICustomTabsService.a.b(paramParcel2, paramParcel1, 1);
        break;
      case 4: 
        ICustomTabsCallback localICustomTabsCallback = ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder());
        Uri localUri = (Uri)ICustomTabsService.a.a(paramParcel1, Uri.CREATOR);
        localObject = Bundle.CREATOR;
        paramInt1 = T(localICustomTabsCallback, localUri, (Bundle)ICustomTabsService.a.a(paramParcel1, (Parcelable.Creator)localObject), paramParcel1.createTypedArrayList((Parcelable.Creator)localObject));
        break;
      case 3: 
        paramInt1 = T1(ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
        break;
      case 2: 
        paramInt1 = g1(paramParcel1.readLong());
      }
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      return true;
    }
    
    public static final class a
      implements ICustomTabsService
    {
      public IBinder a;
      
      public a(IBinder paramIBinder)
      {
        a = paramIBinder;
      }
      
      public final int H1(ICustomTabsCallback paramICustomTabsCallback, String paramString, Bundle paramBundle)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken(ICustomTabsService.h);
          localParcel1.writeStrongInterface(paramICustomTabsCallback);
          localParcel1.writeString(paramString);
          ICustomTabsService.a.b(localParcel1, paramBundle, 0);
          a.transact(8, localParcel1, localParcel2, 0);
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
      
      public final boolean T(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri, Bundle paramBundle, List<Bundle> paramList)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken(ICustomTabsService.h);
          localParcel1.writeStrongInterface(paramICustomTabsCallback);
          boolean bool = false;
          ICustomTabsService.a.b(localParcel1, paramUri, 0);
          ICustomTabsService.a.b(localParcel1, paramBundle, 0);
          if (paramList == null)
          {
            localParcel1.writeInt(-1);
          }
          else
          {
            int i = paramList.size();
            localParcel1.writeInt(i);
            for (j = 0; j < i; j++) {
              ICustomTabsService.a.b(localParcel1, (Parcelable)paramList.get(j), 0);
            }
          }
          a.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int j = localParcel2.readInt();
          if (j != 0) {
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
      
      public final boolean T1(ICustomTabsCallback paramICustomTabsCallback)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken(ICustomTabsService.h);
          localParcel1.writeStrongInterface(paramICustomTabsCallback);
          paramICustomTabsCallback = a;
          boolean bool = false;
          paramICustomTabsCallback.transact(3, localParcel1, localParcel2, 0);
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
      
      public final boolean U1(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri, Bundle paramBundle)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken(ICustomTabsService.h);
          localParcel1.writeStrongInterface(paramICustomTabsCallback);
          boolean bool = false;
          ICustomTabsService.a.b(localParcel1, paramUri, 0);
          ICustomTabsService.a.b(localParcel1, paramBundle, 0);
          a.transact(11, localParcel1, localParcel2, 0);
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
      
      public final boolean U2(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken(ICustomTabsService.h);
          localParcel1.writeStrongInterface(paramICustomTabsCallback);
          boolean bool = false;
          ICustomTabsService.a.b(localParcel1, paramBundle, 0);
          a.transact(13, localParcel1, localParcel2, 0);
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
      
      public final boolean W1(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken(ICustomTabsService.h);
          localParcel1.writeStrongInterface(paramICustomTabsCallback);
          boolean bool = false;
          ICustomTabsService.a.b(localParcel1, paramBundle, 0);
          a.transact(10, localParcel1, localParcel2, 0);
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
      
      public final IBinder asBinder()
      {
        return a;
      }
      
      public final boolean d2(ICustomTabsCallback paramICustomTabsCallback, IBinder paramIBinder, Bundle paramBundle)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken(ICustomTabsService.h);
          localParcel1.writeStrongInterface(paramICustomTabsCallback);
          localParcel1.writeStrongBinder(paramIBinder);
          boolean bool = false;
          ICustomTabsService.a.b(localParcel1, paramBundle, 0);
          a.transact(14, localParcel1, localParcel2, 0);
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
      
      public final boolean g1(long paramLong)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken(ICustomTabsService.h);
          localParcel1.writeLong(paramLong);
          IBinder localIBinder = a;
          boolean bool = false;
          localIBinder.transact(2, localParcel1, localParcel2, 0);
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
      
      public final boolean i2(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken(ICustomTabsService.h);
          localParcel1.writeStrongInterface(paramICustomTabsCallback);
          boolean bool = false;
          ICustomTabsService.a.b(localParcel1, paramBundle, 0);
          a.transact(6, localParcel1, localParcel2, 0);
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
      
      public final boolean p0(int paramInt, Uri paramUri, Bundle paramBundle, ICustomTabsCallback paramICustomTabsCallback)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken(ICustomTabsService.h);
          localParcel1.writeStrongInterface(paramICustomTabsCallback);
          localParcel1.writeInt(paramInt);
          boolean bool = false;
          ICustomTabsService.a.b(localParcel1, paramUri, 0);
          ICustomTabsService.a.b(localParcel1, paramBundle, 0);
          a.transact(9, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramInt = localParcel2.readInt();
          if (paramInt != 0) {
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
      
      public final boolean s2(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken(ICustomTabsService.h);
          localParcel1.writeStrongInterface(paramICustomTabsCallback);
          boolean bool = false;
          ICustomTabsService.a.b(localParcel1, paramUri, 0);
          a.transact(7, localParcel1, localParcel2, 0);
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
    }
  }
  
  public static final class a
  {
    public static Object a(Parcel paramParcel, Parcelable.Creator paramCreator)
    {
      if (paramParcel.readInt() != 0) {
        paramParcel = paramCreator.createFromParcel(paramParcel);
      } else {
        paramParcel = null;
      }
      return paramParcel;
    }
    
    public static <T extends Parcelable> void b(Parcel paramParcel, T paramT, int paramInt)
    {
      if (paramT != null)
      {
        paramParcel.writeInt(1);
        paramT.writeToParcel(paramParcel, paramInt);
      }
      else
      {
        paramParcel.writeInt(0);
      }
    }
  }
}

/* Location:
 * Qualified Name:     android.support.customtabs.ICustomTabsService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */