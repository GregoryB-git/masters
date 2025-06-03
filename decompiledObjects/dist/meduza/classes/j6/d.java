package j6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import m6.h.a;
import n6.a;

public final class d
  extends a
{
  public static final Parcelable.Creator<d> CREATOR = new o();
  public final String a;
  @Deprecated
  public final int b;
  public final long c;
  
  public d(String paramString, int paramInt, long paramLong)
  {
    a = paramString;
    b = paramInt;
    c = paramLong;
  }
  
  public d(String paramString, long paramLong)
  {
    a = paramString;
    c = paramLong;
    b = -1;
  }
  
  public final long D()
  {
    long l1 = c;
    long l2 = l1;
    if (l1 == -1L) {
      l2 = b;
    }
    return l2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof d))
    {
      d locald = (d)paramObject;
      paramObject = a;
      if (((paramObject != null) && (((String)paramObject).equals(a))) || ((a == null) && (a == null) && (D() == locald.D()))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, Long.valueOf(D()) });
  }
  
  public final String toString()
  {
    h.a locala = new h.a(this);
    locala.a(a, "name");
    locala.a(Long.valueOf(D()), "version");
    return locala.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 1, a, false);
    z.z(paramParcel, 2, b);
    z.C(paramParcel, 3, D());
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     j6.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */