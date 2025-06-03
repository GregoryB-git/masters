package T0;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import g0.M;
import java.util.Arrays;

public final class c
  extends i
{
  public static final Parcelable.Creator<c> CREATOR = new a();
  public final String p;
  public final int q;
  public final int r;
  public final long s;
  public final long t;
  public final i[] u;
  
  public c(Parcel paramParcel)
  {
    super("CHAP");
    p = ((String)M.i(paramParcel.readString()));
    q = paramParcel.readInt();
    r = paramParcel.readInt();
    s = paramParcel.readLong();
    t = paramParcel.readLong();
    int i = paramParcel.readInt();
    u = new i[i];
    for (int j = 0; j < i; j++) {
      u[j] = ((i)paramParcel.readParcelable(i.class.getClassLoader()));
    }
  }
  
  public c(String paramString, int paramInt1, int paramInt2, long paramLong1, long paramLong2, i[] paramArrayOfi)
  {
    super("CHAP");
    p = paramString;
    q = paramInt1;
    r = paramInt2;
    s = paramLong1;
    t = paramLong2;
    u = paramArrayOfi;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (c.class == paramObject.getClass()))
    {
      paramObject = (c)paramObject;
      if ((q != q) || (r != r) || (s != s) || (t != t) || (!M.c(p, p)) || (!Arrays.equals(u, u))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = q;
    int j = r;
    int k = (int)s;
    int m = (int)t;
    String str = p;
    int n;
    if (str != null) {
      n = str.hashCode();
    } else {
      n = 0;
    }
    return ((((527 + i) * 31 + j) * 31 + k) * 31 + m) * 31 + n;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(p);
    paramParcel.writeInt(q);
    paramParcel.writeInt(r);
    paramParcel.writeLong(s);
    paramParcel.writeLong(t);
    paramParcel.writeInt(u.length);
    i[] arrayOfi = u;
    int i = arrayOfi.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramParcel.writeParcelable(arrayOfi[paramInt], 0);
    }
  }
  
  public class a
    implements Parcelable.Creator
  {
    public c a(Parcel paramParcel)
    {
      return new c(paramParcel);
    }
    
    public c[] b(int paramInt)
    {
      return new c[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     T0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */