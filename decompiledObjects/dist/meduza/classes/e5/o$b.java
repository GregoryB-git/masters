package e5;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class o$b
  implements Parcelable
{
  public static final Parcelable.Creator<b> CREATOR = new a();
  public final int a;
  public final int b;
  public final String c;
  public final String d;
  public final String e;
  public final String f;
  
  public o$b(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramString1;
    d = paramString2;
    e = paramString3;
    f = paramString4;
  }
  
  public o$b(Parcel paramParcel)
  {
    a = paramParcel.readInt();
    b = paramParcel.readInt();
    c = paramParcel.readString();
    d = paramParcel.readString();
    e = paramParcel.readString();
    f = paramParcel.readString();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (b.class == paramObject.getClass()))
    {
      paramObject = (b)paramObject;
      if ((a != a) || (b != b) || (!TextUtils.equals(c, c)) || (!TextUtils.equals(d, d)) || (!TextUtils.equals(e, e)) || (!TextUtils.equals(f, f))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a;
    int j = b;
    String str = c;
    int k = 0;
    int m;
    if (str != null) {
      m = str.hashCode();
    } else {
      m = 0;
    }
    str = d;
    int n;
    if (str != null) {
      n = str.hashCode();
    } else {
      n = 0;
    }
    str = e;
    int i1;
    if (str != null) {
      i1 = str.hashCode();
    } else {
      i1 = 0;
    }
    str = f;
    if (str != null) {
      k = str.hashCode();
    }
    return ((((i * 31 + j) * 31 + m) * 31 + n) * 31 + i1) * 31 + k;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(a);
    paramParcel.writeInt(b);
    paramParcel.writeString(c);
    paramParcel.writeString(d);
    paramParcel.writeString(e);
    paramParcel.writeString(f);
  }
  
  public final class a
    implements Parcelable.Creator<o.b>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new o.b(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new o.b[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     e5.o.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */