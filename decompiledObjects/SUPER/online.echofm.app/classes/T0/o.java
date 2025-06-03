package T0;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import g0.M;

public final class o
  extends i
{
  public static final Parcelable.Creator<o> CREATOR = new a();
  public final String p;
  public final String q;
  
  public o(Parcel paramParcel)
  {
    super((String)M.i(paramParcel.readString()));
    p = paramParcel.readString();
    q = ((String)M.i(paramParcel.readString()));
  }
  
  public o(String paramString1, String paramString2, String paramString3)
  {
    super(paramString1);
    p = paramString2;
    q = paramString3;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (o.class == paramObject.getClass()))
    {
      paramObject = (o)paramObject;
      if ((!o.equals(o)) || (!M.c(p, p)) || (!M.c(q, q))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = o.hashCode();
    String str = p;
    int j = 0;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = q;
    if (str != null) {
      j = str.hashCode();
    }
    return ((527 + i) * 31 + k) * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(o);
    localStringBuilder.append(": url=");
    localStringBuilder.append(q);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(o);
    paramParcel.writeString(p);
    paramParcel.writeString(q);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public o a(Parcel paramParcel)
    {
      return new o(paramParcel);
    }
    
    public o[] b(int paramInt)
    {
      return new o[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     T0.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */