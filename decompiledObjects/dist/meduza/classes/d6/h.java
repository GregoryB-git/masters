package d6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import m6.j;
import n6.a;

public final class h
  extends a
{
  public static final Parcelable.Creator<h> CREATOR = new a0();
  public final l a;
  public final String b;
  public final int c;
  
  public h(l paraml, String paramString, int paramInt)
  {
    j.i(paraml);
    a = paraml;
    b = paramString;
    c = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof h)) {
      return false;
    }
    paramObject = (h)paramObject;
    return (m6.h.a(a, a)) && (m6.h.a(b, b)) && (c == c);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.E(paramParcel, 1, a, paramInt, false);
    z.F(paramParcel, 2, b, false);
    z.z(paramParcel, 3, c);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     d6.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */