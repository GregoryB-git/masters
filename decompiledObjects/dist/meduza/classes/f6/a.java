package f6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;

public final class a
  extends n6.a
{
  public static final Parcelable.Creator<a> CREATOR = new c();
  public final String a;
  public final int b;
  public final long c;
  public final byte[] d;
  public final int e;
  public final Bundle f;
  
  public a(int paramInt1, String paramString, int paramInt2, long paramLong, byte[] paramArrayOfByte, Bundle paramBundle)
  {
    e = paramInt1;
    a = paramString;
    b = paramInt2;
    c = paramLong;
    d = paramArrayOfByte;
    f = paramBundle;
  }
  
  public final String toString()
  {
    String str = a;
    int i = b;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ProxyRequest[ url: ");
    localStringBuilder.append(str);
    localStringBuilder.append(", method: ");
    localStringBuilder.append(i);
    localStringBuilder.append(" ]");
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 1, a, false);
    z.z(paramParcel, 2, b);
    z.C(paramParcel, 3, c);
    z.w(paramParcel, 4, d, false);
    z.v(paramParcel, 5, f, false);
    z.z(paramParcel, 1000, e);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     f6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */