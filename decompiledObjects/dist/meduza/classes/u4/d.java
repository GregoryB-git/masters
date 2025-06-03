package u4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import v5.e0;

public final class d
  extends h
{
  public static final Parcelable.Creator<d> CREATOR = new a();
  public final String b;
  public final boolean c;
  public final boolean d;
  public final String[] e;
  public final h[] f;
  
  public d(Parcel paramParcel)
  {
    super("CTOC");
    String str = paramParcel.readString();
    int i = e0.a;
    b = str;
    int j = paramParcel.readByte();
    boolean bool1 = true;
    i = 0;
    boolean bool2;
    if (j != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    c = bool2;
    if (paramParcel.readByte() != 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    d = bool2;
    e = paramParcel.createStringArray();
    j = paramParcel.readInt();
    f = new h[j];
    while (i < j)
    {
      f[i] = ((h)paramParcel.readParcelable(h.class.getClassLoader()));
      i++;
    }
  }
  
  public d(String paramString, boolean paramBoolean1, boolean paramBoolean2, String[] paramArrayOfString, h[] paramArrayOfh)
  {
    super("CTOC");
    b = paramString;
    c = paramBoolean1;
    d = paramBoolean2;
    e = paramArrayOfString;
    f = paramArrayOfh;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (d.class == paramObject.getClass()))
    {
      paramObject = (d)paramObject;
      if ((c != c) || (d != d) || (!e0.a(b, b)) || (!Arrays.equals(e, e)) || (!Arrays.equals(f, f))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = c;
    int j = d;
    String str = b;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    return ((527 + i) * 31 + j) * 31 + k;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(b);
    paramParcel.writeByte((byte)c);
    paramParcel.writeByte((byte)d);
    paramParcel.writeStringArray(e);
    paramParcel.writeInt(f.length);
    h[] arrayOfh = f;
    int i = arrayOfh.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramParcel.writeParcelable(arrayOfh[paramInt], 0);
    }
  }
  
  public final class a
    implements Parcelable.Creator<d>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new d(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new d[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     u4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */