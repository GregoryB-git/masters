package c8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b8.c1;
import b8.t0;
import com.google.android.gms.internal.firebase_auth_api.zzagw;
import java.util.ArrayList;
import n6.b;

public final class h
  implements Parcelable.Creator<i>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    zzagw localzzagw = null;
    Object localObject1 = localzzagw;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    Object localObject4 = localObject3;
    Object localObject5 = localObject4;
    Object localObject6 = localObject5;
    Object localObject7 = localObject6;
    Object localObject8 = localObject7;
    Object localObject9 = localObject8;
    Object localObject10 = localObject9;
    Object localObject11 = localObject10;
    boolean bool = false;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      switch ((char)j)
      {
      default: 
        b.t(j, paramParcel);
        break;
      case '\r': 
        localObject11 = b.i(paramParcel, j, t0.CREATOR);
        break;
      case '\f': 
        localObject10 = (e0)b.e(paramParcel, j, e0.CREATOR);
        break;
      case '\013': 
        localObject9 = (c1)b.e(paramParcel, j, c1.CREATOR);
        break;
      case '\n': 
        bool = b.k(j, paramParcel);
        break;
      case '\t': 
        localObject8 = (k)b.e(paramParcel, j, k.CREATOR);
        break;
      case '\b': 
        localObject7 = b.l(j, paramParcel);
        break;
      case '\007': 
        localObject6 = b.f(j, paramParcel);
        break;
      case '\006': 
        localObject5 = b.g(j, paramParcel);
        break;
      case '\005': 
        localObject4 = b.i(paramParcel, j, e.CREATOR);
        break;
      case '\004': 
        localObject3 = b.f(j, paramParcel);
        break;
      case '\003': 
        localObject2 = b.f(j, paramParcel);
        break;
      case '\002': 
        localObject1 = (e)b.e(paramParcel, j, e.CREATOR);
        break;
      case '\001': 
        localzzagw = (zzagw)b.e(paramParcel, j, zzagw.CREATOR);
      }
    }
    b.j(i, paramParcel);
    return new i(localzzagw, (e)localObject1, (String)localObject2, (String)localObject3, (ArrayList)localObject4, (ArrayList)localObject5, (String)localObject6, (Boolean)localObject7, (k)localObject8, bool, (c1)localObject9, (e0)localObject10, (ArrayList)localObject11);
  }
}

/* Location:
 * Qualified Name:     c8.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */