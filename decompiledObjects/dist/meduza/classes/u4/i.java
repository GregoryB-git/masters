package u4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import v5.e0;

public final class i
  extends h
{
  public static final Parcelable.Creator<i> CREATOR = new a();
  public final String b;
  public final String c;
  public final String d;
  
  public i(Parcel paramParcel)
  {
    super("----");
    String str = paramParcel.readString();
    int i = e0.a;
    b = str;
    c = paramParcel.readString();
    d = paramParcel.readString();
  }
  
  public i(String paramString1, String paramString2, String paramString3)
  {
    super("----");
    b = paramString1;
    c = paramString2;
    d = paramString3;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (i.class == paramObject.getClass()))
    {
      paramObject = (i)paramObject;
      if ((!e0.a(c, c)) || (!e0.a(b, b)) || (!e0.a(d, d))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    String str = b;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = c;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = d;
    if (str != null) {
      i = str.hashCode();
    }
    return ((527 + j) * 31 + k) * 31 + i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append(": domain=");
    localStringBuilder.append(b);
    localStringBuilder.append(", description=");
    localStringBuilder.append(c);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(a);
    paramParcel.writeString(b);
    paramParcel.writeString(d);
  }
  
  public final class a
    implements Parcelable.Creator<i>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new i(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new i[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     u4.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */