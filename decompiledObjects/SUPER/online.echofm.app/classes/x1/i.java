package x1;

import O1.Q;
import X1.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class i
  implements Parcelable
{
  @NotNull
  public static final Parcelable.Creator<i> CREATOR = new a();
  public static final b t = new b(null);
  public final String o;
  public final String p;
  public final l q;
  public final k r;
  public final String s;
  
  public i(Parcel paramParcel)
  {
    o = Q.k(paramParcel.readString(), "token");
    p = Q.k(paramParcel.readString(), "expectedNonce");
    Parcelable localParcelable = paramParcel.readParcelable(l.class.getClassLoader());
    if (localParcelable != null)
    {
      q = ((l)localParcelable);
      localParcelable = paramParcel.readParcelable(k.class.getClassLoader());
      if (localParcelable != null)
      {
        r = ((k)localParcelable);
        s = Q.k(paramParcel.readString(), "signature");
        return;
      }
      throw new IllegalStateException("Required value was null.".toString());
    }
    throw new IllegalStateException("Required value was null.".toString());
  }
  
  public i(String paramString1, String paramString2)
  {
    Q.g(paramString1, "token");
    Q.g(paramString2, "expectedNonce");
    Object localObject = kotlin.text.i.V(paramString1, new String[] { "." }, false, 0, 6, null);
    int i;
    if (((List)localObject).size() == 3) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      String str1 = (String)((List)localObject).get(0);
      String str2 = (String)((List)localObject).get(1);
      localObject = (String)((List)localObject).get(2);
      o = paramString1;
      p = paramString2;
      paramString1 = new l(str1);
      q = paramString1;
      r = new k(str2, paramString2);
      if (a(str1, str2, (String)localObject, paramString1.a()))
      {
        s = ((String)localObject);
        return;
      }
      throw new IllegalArgumentException("Invalid Signature".toString());
    }
    throw new IllegalArgumentException("Invalid IdToken string".toString());
  }
  
  public final boolean a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    try
    {
      paramString4 = c.c(paramString4);
      if (paramString4 == null) {
        return false;
      }
      paramString4 = c.b(paramString4);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append(paramString1);
      localStringBuilder.append('.');
      localStringBuilder.append(paramString2);
      boolean bool = c.e(paramString4, localStringBuilder.toString(), paramString3);
      return bool;
    }
    catch (InvalidKeySpecException|IOException paramString1) {}
    return false;
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
    if (!(paramObject instanceof i)) {
      return false;
    }
    String str = o;
    paramObject = (i)paramObject;
    if ((!Intrinsics.a(str, o)) || (!Intrinsics.a(p, p)) || (!Intrinsics.a(q, q)) || (!Intrinsics.a(r, r)) || (!Intrinsics.a(s, s))) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return ((((527 + o.hashCode()) * 31 + p.hashCode()) * 31 + q.hashCode()) * 31 + r.hashCode()) * 31 + s.hashCode();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "dest");
    paramParcel.writeString(o);
    paramParcel.writeString(p);
    paramParcel.writeParcelable(q, paramInt);
    paramParcel.writeParcelable(r, paramInt);
    paramParcel.writeString(s);
  }
  
  public static final class a
    implements Parcelable.Creator
  {
    public i a(Parcel paramParcel)
    {
      Intrinsics.checkNotNullParameter(paramParcel, "source");
      return new i(paramParcel);
    }
    
    public i[] b(int paramInt)
    {
      return new i[paramInt];
    }
  }
  
  public static final class b {}
}

/* Location:
 * Qualified Name:     x1.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */