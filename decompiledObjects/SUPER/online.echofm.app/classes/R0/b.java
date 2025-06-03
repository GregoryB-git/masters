package R0;

import W2.c;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import d0.w.b;
import d0.x.b;
import g0.M;

public class b
  implements x.b
{
  public static final Parcelable.Creator<b> CREATOR = new a();
  public final String o;
  public final String p;
  
  public b(Parcel paramParcel)
  {
    o = ((String)M.i(paramParcel.readString()));
    p = ((String)M.i(paramParcel.readString()));
  }
  
  public b(String paramString1, String paramString2)
  {
    o = c.f(paramString1);
    p = paramString2;
  }
  
  public void D(w.b paramb)
  {
    String str = o;
    str.hashCode();
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
      paramb.P(p);
      break;
    case 3: 
      paramb.N(p);
      break;
    case 2: 
      paramb.V(p);
      break;
    case 1: 
      paramb.n0(p);
      break;
    case 0: 
      paramb.O(p);
    }
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
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (b)paramObject;
      if ((!o.equals(o)) || (!p.equals(p))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return (527 + o.hashCode()) * 31 + p.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("VC: ");
    localStringBuilder.append(o);
    localStringBuilder.append("=");
    localStringBuilder.append(p);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(o);
    paramParcel.writeString(p);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public b a(Parcel paramParcel)
    {
      return new b(paramParcel);
    }
    
    public b[] b(int paramInt)
    {
      return new b[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     R0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */