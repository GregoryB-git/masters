package c8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import b.z;
import b8.c1;
import b8.g;
import java.util.List;
import m6.j;

public final class k1
  implements g
{
  public static final Parcelable.Creator<k1> CREATOR = new j1();
  public i a;
  public i1 b;
  public c1 c;
  
  public k1(i parami)
  {
    j.i(parami);
    a = parami;
    List localList = e;
    b = null;
    for (int i = 0; i < localList.size(); i++) {
      if (!TextUtils.isEmpty(getq)) {
        b = new i1(getb, getq, r);
      }
    }
    if (b == null) {
      b = new i1(r);
    }
    c = s;
  }
  
  public k1(i parami, i1 parami1, c1 paramc1)
  {
    a = parami;
    b = parami1;
    c = paramc1;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final i1 s()
  {
    return b;
  }
  
  public final c1 t()
  {
    return c;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.E(paramParcel, 1, a, paramInt, false);
    z.E(paramParcel, 2, b, paramInt, false);
    z.E(paramParcel, 3, c, paramInt, false);
    z.L(i, paramParcel);
  }
  
  public final i z()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     c8.k1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */