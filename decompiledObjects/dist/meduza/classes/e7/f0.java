package e7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import m6.j;
import n6.a;

public final class f0
  extends a
{
  public static final Parcelable.Creator<f0> CREATOR = new e0();
  public final String a;
  public final a0 b;
  public final String c;
  public final long d;
  
  public f0(f0 paramf0, long paramLong)
  {
    j.i(paramf0);
    a = a;
    b = b;
    c = c;
    d = paramLong;
  }
  
  public f0(String paramString1, a0 parama0, String paramString2, long paramLong)
  {
    a = paramString1;
    b = parama0;
    c = paramString2;
    d = paramLong;
  }
  
  public final String toString()
  {
    String str1 = c;
    String str2 = a;
    String str3 = String.valueOf(b);
    StringBuilder localStringBuilder = new StringBuilder("origin=");
    localStringBuilder.append(str1);
    localStringBuilder.append(",name=");
    localStringBuilder.append(str2);
    localStringBuilder.append(",params=");
    localStringBuilder.append(str3);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.F(paramParcel, 2, a, false);
    z.E(paramParcel, 3, b, paramInt, false);
    z.F(paramParcel, 4, c, false);
    z.C(paramParcel, 5, d);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     e7.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */