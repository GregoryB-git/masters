package R2;

import A2.n;
import B2.a;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class I
  extends a
{
  public static final Parcelable.Creator<I> CREATOR = new H();
  public final String o;
  public final D p;
  public final String q;
  public final long r;
  
  public I(I paramI, long paramLong)
  {
    n.i(paramI);
    o = o;
    p = p;
    q = q;
    r = paramLong;
  }
  
  public I(String paramString1, D paramD, String paramString2, long paramLong)
  {
    o = paramString1;
    p = paramD;
    q = paramString2;
    r = paramLong;
  }
  
  public final String toString()
  {
    String str1 = q;
    String str2 = o;
    String str3 = String.valueOf(p);
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
    int i = c.a(paramParcel);
    c.n(paramParcel, 2, o, false);
    c.m(paramParcel, 3, p, paramInt, false);
    c.n(paramParcel, 4, q, false);
    c.k(paramParcel, 5, r);
    c.b(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     R2.I
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */