package u4;

import a0.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import v5.e0;

public final class m
  extends h
{
  public static final Parcelable.Creator<m> CREATOR = new a();
  public final String b;
  public final String c;
  
  public m(Parcel paramParcel)
  {
    super(str);
    b = paramParcel.readString();
    c = paramParcel.readString();
  }
  
  public m(String paramString1, String paramString2, String paramString3)
  {
    super(paramString1);
    b = paramString2;
    c = paramString3;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (m.class == paramObject.getClass()))
    {
      paramObject = (m)paramObject;
      if ((!a.equals(a)) || (!e0.a(b, b)) || (!e0.a(c, c))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = j.e(a, 527, 31);
    String str = b;
    int j = 0;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = c;
    if (str != null) {
      j = str.hashCode();
    }
    return (i + k) * 31 + j;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append(": url=");
    localStringBuilder.append(c);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(a);
    paramParcel.writeString(b);
    paramParcel.writeString(c);
  }
  
  public final class a
    implements Parcelable.Creator<m>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new m(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new m[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     u4.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */