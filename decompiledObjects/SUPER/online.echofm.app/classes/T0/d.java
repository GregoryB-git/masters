package T0;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import g0.M;
import java.util.Arrays;

public final class d
  extends i
{
  public static final Parcelable.Creator<d> CREATOR = new a();
  public final String p;
  public final boolean q;
  public final boolean r;
  public final String[] s;
  public final i[] t;
  
  public d(Parcel paramParcel)
  {
    super("CTOC");
    p = ((String)M.i(paramParcel.readString()));
    int i = paramParcel.readByte();
    boolean bool1 = true;
    int j = 0;
    boolean bool2;
    if (i != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    q = bool2;
    if (paramParcel.readByte() != 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    r = bool2;
    s = ((String[])M.i(paramParcel.createStringArray()));
    i = paramParcel.readInt();
    t = new i[i];
    while (j < i)
    {
      t[j] = ((i)paramParcel.readParcelable(i.class.getClassLoader()));
      j++;
    }
  }
  
  public d(String paramString, boolean paramBoolean1, boolean paramBoolean2, String[] paramArrayOfString, i[] paramArrayOfi)
  {
    super("CTOC");
    p = paramString;
    q = paramBoolean1;
    r = paramBoolean2;
    s = paramArrayOfString;
    t = paramArrayOfi;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (d.class == paramObject.getClass()))
    {
      paramObject = (d)paramObject;
      if ((q != q) || (r != r) || (!M.c(p, p)) || (!Arrays.equals(s, s)) || (!Arrays.equals(t, t))) {
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
    String str = p;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    return ((527 + i) * 31 + j) * 31 + k;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(p);
    paramParcel.writeByte((byte)q);
    paramParcel.writeByte((byte)r);
    paramParcel.writeStringArray(s);
    paramParcel.writeInt(t.length);
    i[] arrayOfi = t;
    int i = arrayOfi.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramParcel.writeParcelable(arrayOfi[paramInt], 0);
    }
  }
  
  public class a
    implements Parcelable.Creator
  {
    public d a(Parcel paramParcel)
    {
      return new d(paramParcel);
    }
    
    public d[] b(int paramInt)
    {
      return new d[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     T0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */