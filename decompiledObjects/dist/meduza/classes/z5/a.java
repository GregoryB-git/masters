package z5;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import m6.h;
import m6.j;

public final class a
  extends n6.a
{
  public static final Parcelable.Creator<a> CREATOR = new f();
  public final int a;
  public final long b;
  public final String c;
  public final int d;
  public final int e;
  public final String f;
  
  public a(int paramInt1, long paramLong, String paramString1, int paramInt2, int paramInt3, String paramString2)
  {
    a = paramInt1;
    b = paramLong;
    j.i(paramString1);
    c = paramString1;
    d = paramInt2;
    e = paramInt3;
    f = paramString2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a)) {
      return false;
    }
    if (paramObject == this) {
      return true;
    }
    paramObject = (a)paramObject;
    return (a == a) && (b == b) && (h.a(c, c)) && (d == d) && (e == e) && (h.a(f, f));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(a), Long.valueOf(b), c, Integer.valueOf(d), Integer.valueOf(e), f });
  }
  
  public final String toString()
  {
    int i = d;
    String str1;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4) {
            str1 = "UNKNOWN";
          } else {
            str1 = "RENAMED_TO";
          }
        }
        else {
          str1 = "RENAMED_FROM";
        }
      }
      else {
        str1 = "REMOVED";
      }
    }
    else {
      str1 = "ADDED";
    }
    String str2 = c;
    String str3 = f;
    i = e;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AccountChangeEvent {accountName = ");
    localStringBuilder.append(str2);
    localStringBuilder.append(", changeType = ");
    localStringBuilder.append(str1);
    localStringBuilder.append(", changeData = ");
    localStringBuilder.append(str3);
    localStringBuilder.append(", eventIndex = ");
    localStringBuilder.append(i);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.z(paramParcel, 1, a);
    z.C(paramParcel, 2, b);
    z.F(paramParcel, 3, c, false);
    z.z(paramParcel, 4, d);
    z.z(paramParcel, 5, e);
    z.F(paramParcel, 6, f, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     z5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */