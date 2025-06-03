package q0;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class t$b
  implements Parcelable
{
  public static final Parcelable.Creator<b> CREATOR = new a();
  public final int o;
  public final int p;
  public final String q;
  public final String r;
  public final String s;
  public final String t;
  
  public t$b(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    o = paramInt1;
    p = paramInt2;
    q = paramString1;
    r = paramString2;
    s = paramString3;
    t = paramString4;
  }
  
  public t$b(Parcel paramParcel)
  {
    o = paramParcel.readInt();
    p = paramParcel.readInt();
    q = paramParcel.readString();
    r = paramParcel.readString();
    s = paramParcel.readString();
    t = paramParcel.readString();
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
    if ((paramObject != null) && (b.class == paramObject.getClass()))
    {
      paramObject = (b)paramObject;
      if ((o != o) || (p != p) || (!TextUtils.equals(q, q)) || (!TextUtils.equals(r, r)) || (!TextUtils.equals(s, s)) || (!TextUtils.equals(t, t))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = o;
    int j = p;
    String str = q;
    int k = 0;
    int m;
    if (str != null) {
      m = str.hashCode();
    } else {
      m = 0;
    }
    str = r;
    int n;
    if (str != null) {
      n = str.hashCode();
    } else {
      n = 0;
    }
    str = s;
    int i1;
    if (str != null) {
      i1 = str.hashCode();
    } else {
      i1 = 0;
    }
    str = t;
    if (str != null) {
      k = str.hashCode();
    }
    return ((((i * 31 + j) * 31 + m) * 31 + n) * 31 + i1) * 31 + k;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(o);
    paramParcel.writeInt(p);
    paramParcel.writeString(q);
    paramParcel.writeString(r);
    paramParcel.writeString(s);
    paramParcel.writeString(t);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public t.b a(Parcel paramParcel)
    {
      return new t.b(paramParcel);
    }
    
    public t.b[] b(int paramInt)
    {
      return new t.b[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     q0.t.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */