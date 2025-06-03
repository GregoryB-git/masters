package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d6.y;
import java.util.Arrays;
import java.util.List;
import m6.h;
import n6.a;

public class SaveAccountLinkingTokenRequest
  extends a
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new y();
  public final PendingIntent a;
  public final String b;
  public final String c;
  public final List d;
  public final String e;
  public final int f;
  
  public SaveAccountLinkingTokenRequest(PendingIntent paramPendingIntent, String paramString1, String paramString2, List paramList, String paramString3, int paramInt)
  {
    a = paramPendingIntent;
    b = paramString1;
    c = paramString2;
    d = paramList;
    e = paramString3;
    f = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof SaveAccountLinkingTokenRequest)) {
      return false;
    }
    paramObject = (SaveAccountLinkingTokenRequest)paramObject;
    return (d.size() == d.size()) && (d.containsAll(d)) && (h.a(a, a)) && (h.a(b, b)) && (h.a(c, c)) && (h.a(e, e)) && (f == f);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b, c, d, e });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.E(paramParcel, 1, a, paramInt, false);
    z.F(paramParcel, 2, b, false);
    z.F(paramParcel, 3, c, false);
    z.G(paramParcel, 4, d);
    z.F(paramParcel, 5, e, false);
    z.z(paramParcel, 6, f);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */