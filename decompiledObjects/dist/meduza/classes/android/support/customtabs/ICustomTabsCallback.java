package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import p.b;
import p.c;
import p.d;
import p.e;
import p.f;
import p.g;
import p.h;
import p.i;
import p.j;
import p.k;
import p.l;
import p.m;

public abstract interface ICustomTabsCallback
  extends IInterface
{
  public static final String g = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');
  
  public static abstract class Stub
    extends Binder
    implements ICustomTabsCallback
  {
    public Stub()
    {
      attachInterface(this, ICustomTabsCallback.g);
    }
    
    public static ICustomTabsCallback asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface(ICustomTabsCallback.g);
      if ((localIInterface != null) && ((localIInterface instanceof ICustomTabsCallback))) {
        return (ICustomTabsCallback)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public final IBinder asBinder()
    {
      return this;
    }
    
    public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      Object localObject = ICustomTabsCallback.g;
      if ((paramInt1 >= 1) && (paramInt1 <= 16777215)) {
        paramParcel1.enforceInterface((String)localObject);
      }
      if (paramInt1 == 1598968902)
      {
        paramParcel2.writeString((String)localObject);
        return true;
      }
      Bundle localBundle;
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 12: 
        paramParcel1 = (Bundle)ICustomTabsCallback.a.a(paramParcel1, Bundle.CREATOR);
        paramParcel2 = (m)this;
        if (b == null) {
          break label761;
        }
        a.post(new c(paramParcel2, paramParcel1));
        break;
      case 11: 
        paramParcel2 = (Bundle)ICustomTabsCallback.a.a(paramParcel1, Bundle.CREATOR);
        paramParcel1 = (m)this;
        if (b == null) {
          break label761;
        }
        a.post(new l(paramParcel1, paramParcel2));
        break;
      case 10: 
        int i = paramParcel1.readInt();
        int j = paramParcel1.readInt();
        int k = paramParcel1.readInt();
        paramInt2 = paramParcel1.readInt();
        paramInt1 = paramParcel1.readInt();
        paramParcel2 = (Bundle)ICustomTabsCallback.a.a(paramParcel1, Bundle.CREATOR);
        paramParcel1 = (m)this;
        if (b == null) {
          break label761;
        }
        a.post(new k(paramParcel1, i, j, k, paramInt2, paramInt1, paramParcel2));
        break;
      case 9: 
        paramParcel2 = (Bundle)ICustomTabsCallback.a.a(paramParcel1, Bundle.CREATOR);
        paramParcel1 = (m)this;
        if (b == null) {
          break label761;
        }
        a.post(new j(paramParcel1, paramParcel2));
        break;
      case 8: 
        paramInt2 = paramParcel1.readInt();
        paramInt1 = paramParcel1.readInt();
        paramParcel2 = (Bundle)ICustomTabsCallback.a.a(paramParcel1, Bundle.CREATOR);
        paramParcel1 = (m)this;
        if (b == null) {
          break label761;
        }
        a.post(new i(paramParcel1, paramInt2, paramInt1, paramParcel2));
        break;
      case 7: 
        localObject = paramParcel1.readString();
        localBundle = (Bundle)ICustomTabsCallback.a.a(paramParcel1, Bundle.CREATOR);
        paramParcel1 = b;
        if (paramParcel1 == null) {
          paramParcel1 = null;
        } else {
          paramParcel1 = paramParcel1.extraCallbackWithResult((String)localObject, localBundle);
        }
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
        break;
      case 6: 
        paramInt1 = paramParcel1.readInt();
        paramParcel2 = (Uri)ICustomTabsCallback.a.a(paramParcel1, Uri.CREATOR);
        boolean bool;
        if (paramParcel1.readInt() != 0) {
          bool = true;
        } else {
          bool = false;
        }
        localObject = (Bundle)ICustomTabsCallback.a.a(paramParcel1, Bundle.CREATOR);
        paramParcel1 = (m)this;
        if (b == null) {
          break label761;
        }
        a.post(new h(paramParcel1, paramInt1, paramParcel2, bool, (Bundle)localObject));
        break;
      case 5: 
        localObject = paramParcel1.readString();
        localBundle = (Bundle)ICustomTabsCallback.a.a(paramParcel1, Bundle.CREATOR);
        paramParcel1 = (m)this;
        if (b != null) {
          a.post(new g(paramParcel1, (String)localObject, localBundle));
        }
        break;
      case 4: 
        paramParcel1 = (Bundle)ICustomTabsCallback.a.a(paramParcel1, Bundle.CREATOR);
        localObject = (m)this;
        if (b != null) {
          a.post(new f((m)localObject, paramParcel1));
        }
        paramParcel2.writeNoException();
        break;
      case 3: 
        paramParcel2 = paramParcel1.readString();
        paramParcel1 = (Bundle)ICustomTabsCallback.a.a(paramParcel1, Bundle.CREATOR);
        localObject = (m)this;
        if (b == null) {
          break label761;
        }
        a.post(new e((m)localObject, paramParcel2, paramParcel1));
        break;
      }
      paramInt1 = paramParcel1.readInt();
      paramParcel1 = (Bundle)ICustomTabsCallback.a.a(paramParcel1, Bundle.CREATOR);
      paramParcel2 = (m)this;
      if (b != null) {
        a.post(new d(paramParcel2, paramInt1, paramParcel1));
      }
      label761:
      return true;
    }
    
    public static final class a
      implements ICustomTabsCallback
    {
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
  }
}

/* Location:
 * Qualified Name:     android.support.customtabs.ICustomTabsCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */