package s4;

import a0.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import f;
import p4.a.b;
import v3.p0.a;
import v5.e0;

@Deprecated
public class b
  implements a.b
{
  public static final Parcelable.Creator<b> CREATOR = new a();
  public final String a;
  public final String b;
  
  public b(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    int i = e0.a;
    a = str;
    b = paramParcel.readString();
  }
  
  public b(String paramString1, String paramString2)
  {
    a = paramString1;
    b = paramString2;
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
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (b)paramObject;
      if ((!a.equals(a)) || (!b.equals(b))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = j.e(a, 527, 31);
    return b.hashCode() + i;
  }
  
  public final void l(p0.a parama)
  {
    String str = a;
    str.getClass();
    int i = str.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1939198791: 
      if (str.equals("ARTIST")) {
        j = 4;
      }
      break;
    case 1746739798: 
      if (str.equals("ALBUMARTIST")) {
        j = 3;
      }
      break;
    case 428414940: 
      if (str.equals("DESCRIPTION")) {
        j = 2;
      }
      break;
    case 79833656: 
      if (str.equals("TITLE")) {
        j = 1;
      }
      break;
    case 62359119: 
      if (str.equals("ALBUM")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      break;
    case 4: 
      b = b;
      break;
    case 3: 
      d = b;
      break;
    case 2: 
      g = b;
      break;
    case 1: 
      a = b;
      break;
    case 0: 
      c = b;
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("VC: ");
    localStringBuilder.append(a);
    localStringBuilder.append("=");
    localStringBuilder.append(b);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(a);
    paramParcel.writeString(b);
  }
  
  public final class a
    implements Parcelable.Creator<b>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new b(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new b[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     s4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */