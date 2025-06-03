package q0;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import d0.x.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class t
  implements x.b
{
  public static final Parcelable.Creator<t> CREATOR = new a();
  public final String o;
  public final String p;
  public final List q;
  
  public t(Parcel paramParcel)
  {
    o = paramParcel.readString();
    p = paramParcel.readString();
    int i = paramParcel.readInt();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      localArrayList.add((b)paramParcel.readParcelable(b.class.getClassLoader()));
    }
    q = Collections.unmodifiableList(localArrayList);
  }
  
  public t(String paramString1, String paramString2, List paramList)
  {
    o = paramString1;
    p = paramString2;
    q = Collections.unmodifiableList(new ArrayList(paramList));
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
    if ((paramObject != null) && (t.class == paramObject.getClass()))
    {
      paramObject = (t)paramObject;
      if ((!TextUtils.equals(o, o)) || (!TextUtils.equals(p, p)) || (!q.equals(q))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    String str = o;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = p;
    if (str != null) {
      i = str.hashCode();
    }
    return (j * 31 + i) * 31 + q.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("HlsTrackMetadataEntry");
    Object localObject;
    if (o != null)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(" [");
      ((StringBuilder)localObject).append(o);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(p);
      ((StringBuilder)localObject).append("]");
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = "";
    }
    localStringBuilder.append((String)localObject);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(o);
    paramParcel.writeString(p);
    int i = q.size();
    paramParcel.writeInt(i);
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramParcel.writeParcelable((Parcelable)q.get(paramInt), 0);
    }
  }
  
  public class a
    implements Parcelable.Creator
  {
    public t a(Parcel paramParcel)
    {
      return new t(paramParcel);
    }
    
    public t[] b(int paramInt)
    {
      return new t[paramInt];
    }
  }
  
  public static final class b
    implements Parcelable
  {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final int o;
    public final int p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    
    public b(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4)
    {
      o = paramInt1;
      p = paramInt2;
      q = paramString1;
      r = paramString2;
      s = paramString3;
      t = paramString4;
    }
    
    public b(Parcel paramParcel)
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
}

/* Location:
 * Qualified Name:     q0.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */