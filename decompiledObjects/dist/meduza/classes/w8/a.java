package w8;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;

public final class a
  extends n6.a
{
  public static final Parcelable.Creator<a> CREATOR = new b();
  public String a;
  public String b;
  public int c;
  public long d;
  public Bundle e;
  public Uri f;
  
  public a(String paramString1, String paramString2, int paramInt, long paramLong, Bundle paramBundle, Uri paramUri)
  {
    a = paramString1;
    b = paramString2;
    c = paramInt;
    d = paramLong;
    e = paramBundle;
    f = paramUri;
  }
  
  public final Bundle D()
  {
    Bundle localBundle1 = e;
    Bundle localBundle2 = localBundle1;
    if (localBundle1 == null) {
      localBundle2 = new Bundle();
    }
    return localBundle2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.F(paramParcel, 1, a, false);
    z.F(paramParcel, 2, b, false);
    z.z(paramParcel, 3, c);
    z.C(paramParcel, 4, d);
    z.v(paramParcel, 5, D(), false);
    z.E(paramParcel, 6, f, paramInt, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     w8.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */