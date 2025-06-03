package x2;

import A2.m;
import A2.m.a;
import B2.a;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;

public class d
  extends a
{
  @NonNull
  public static final Parcelable.Creator<d> CREATOR = new t();
  public final String o;
  public final int p;
  public final long q;
  
  public d(String paramString, int paramInt, long paramLong)
  {
    o = paramString;
    p = paramInt;
    q = paramLong;
  }
  
  public d(String paramString, long paramLong)
  {
    o = paramString;
    q = paramLong;
    p = -1;
  }
  
  public String a()
  {
    return o;
  }
  
  public long d()
  {
    long l1 = q;
    long l2 = l1;
    if (l1 == -1L) {
      l2 = p;
    }
    return l2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof d))
    {
      paramObject = (d)paramObject;
      if (((a() != null) && (a().equals(((d)paramObject).a()))) || ((a() == null) && (((d)paramObject).a() == null) && (d() == ((d)paramObject).d()))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return m.b(new Object[] { a(), Long.valueOf(d()) });
  }
  
  public final String toString()
  {
    m.a locala = m.c(this);
    locala.a("name", a());
    locala.a("version", Long.valueOf(d()));
    return locala.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.n(paramParcel, 1, a(), false);
    c.i(paramParcel, 2, p);
    c.k(paramParcel, 3, d());
    c.b(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     x2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */