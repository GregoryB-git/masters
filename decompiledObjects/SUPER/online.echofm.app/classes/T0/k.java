package T0;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import g0.M;

public final class k
  extends i
{
  public static final Parcelable.Creator<k> CREATOR = new a();
  public final String p;
  public final String q;
  public final String r;
  
  public k(Parcel paramParcel)
  {
    super("----");
    p = ((String)M.i(paramParcel.readString()));
    q = ((String)M.i(paramParcel.readString()));
    r = ((String)M.i(paramParcel.readString()));
  }
  
  public k(String paramString1, String paramString2, String paramString3)
  {
    super("----");
    p = paramString1;
    q = paramString2;
    r = paramString3;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (k.class == paramObject.getClass()))
    {
      paramObject = (k)paramObject;
      if ((!M.c(q, q)) || (!M.c(p, p)) || (!M.c(r, r))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    String str = p;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = q;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = r;
    if (str != null) {
      i = str.hashCode();
    }
    return ((527 + j) * 31 + k) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(o);
    localStringBuilder.append(": domain=");
    localStringBuilder.append(p);
    localStringBuilder.append(", description=");
    localStringBuilder.append(q);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(o);
    paramParcel.writeString(p);
    paramParcel.writeString(r);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public k a(Parcel paramParcel)
    {
      return new k(paramParcel);
    }
    
    public k[] b(int paramInt)
    {
      return new k[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     T0.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */