package m6;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import com.google.android.gms.common.api.Scope;
import j6.d;

public final class o0
  implements Parcelable.Creator
{
  public static void a(com.google.android.gms.common.internal.b paramb, Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.z(paramParcel, 1, a);
    z.z(paramParcel, 2, b);
    z.z(paramParcel, 3, c);
    z.F(paramParcel, 4, d, false);
    z.y(paramParcel, 5, e);
    z.H(paramParcel, 6, f, paramInt);
    z.v(paramParcel, 7, o, false);
    z.E(paramParcel, 8, p, paramInt, false);
    z.H(paramParcel, 10, q, paramInt);
    z.H(paramParcel, 11, r, paramInt);
    z.t(paramParcel, 12, s);
    z.z(paramParcel, 13, t);
    z.t(paramParcel, 14, u);
    z.F(paramParcel, 15, v, false);
    z.L(i, paramParcel);
  }
  
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = n6.b.u(paramParcel);
    Scope[] arrayOfScope = com.google.android.gms.common.internal.b.w;
    Bundle localBundle = new Bundle();
    d[] arrayOfd1 = com.google.android.gms.common.internal.b.x;
    d[] arrayOfd2 = arrayOfd1;
    String str = null;
    Object localObject1 = str;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    int j = 0;
    int k = j;
    int m = k;
    int n = m;
    int i1 = n;
    int i2 = i1;
    boolean bool2;
    boolean bool1;
    while (paramParcel.dataPosition() < i)
    {
      int i3 = paramParcel.readInt();
      switch ((char)i3)
      {
      case '\t': 
      default: 
        n6.b.t(i3, paramParcel);
        break;
      case '\017': 
        localObject3 = n6.b.f(i3, paramParcel);
        break;
      case '\016': 
        bool2 = n6.b.k(i3, paramParcel);
        break;
      case '\r': 
        i1 = n6.b.o(i3, paramParcel);
        break;
      case '\f': 
        bool1 = n6.b.k(i3, paramParcel);
        break;
      case '\013': 
        arrayOfd2 = (d[])n6.b.h(paramParcel, i3, d.CREATOR);
        break;
      case '\n': 
        arrayOfd1 = (d[])n6.b.h(paramParcel, i3, d.CREATOR);
        break;
      case '\b': 
        localObject2 = (Account)n6.b.e(paramParcel, i3, Account.CREATOR);
        break;
      case '\007': 
        localBundle = n6.b.b(i3, paramParcel);
        break;
      case '\006': 
        arrayOfScope = (Scope[])n6.b.h(paramParcel, i3, Scope.CREATOR);
        break;
      case '\005': 
        localObject1 = n6.b.n(i3, paramParcel);
        break;
      case '\004': 
        str = n6.b.f(i3, paramParcel);
        break;
      case '\003': 
        m = n6.b.o(i3, paramParcel);
        break;
      case '\002': 
        k = n6.b.o(i3, paramParcel);
        break;
      case '\001': 
        j = n6.b.o(i3, paramParcel);
      }
    }
    n6.b.j(i, paramParcel);
    return new com.google.android.gms.common.internal.b(j, k, m, str, (IBinder)localObject1, arrayOfScope, localBundle, (Account)localObject2, arrayOfd1, arrayOfd2, bool1, i1, bool2, (String)localObject3);
  }
}

/* Location:
 * Qualified Name:     m6.o0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */