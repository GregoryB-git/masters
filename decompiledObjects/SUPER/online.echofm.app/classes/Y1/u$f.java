package Y1;

import O1.P;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x1.a;
import x1.i;

public final class u$f
  implements Parcelable
{
  @NotNull
  public static final Parcelable.Creator<f> CREATOR = new b();
  public static final c w = new c(null);
  public final a o;
  public final a p;
  public final i q;
  public final String r;
  public final String s;
  public final u.e t;
  public Map u;
  public Map v;
  
  public u$f(u.e parame, a parama, a parama1, String paramString1, String paramString2)
  {
    this(parame, parama, parama1, null, paramString1, paramString2);
  }
  
  public u$f(u.e parame, a parama, a parama1, i parami, String paramString1, String paramString2)
  {
    t = parame;
    p = parama1;
    q = parami;
    r = paramString1;
    o = parama;
    s = paramString2;
  }
  
  public u$f(Parcel paramParcel)
  {
    String str1 = paramParcel.readString();
    String str2 = str1;
    if (str1 == null) {
      str2 = "error";
    }
    o = a.valueOf(str2);
    p = ((a)paramParcel.readParcelable(a.class.getClassLoader()));
    q = ((i)paramParcel.readParcelable(i.class.getClassLoader()));
    r = paramParcel.readString();
    s = paramParcel.readString();
    t = ((u.e)paramParcel.readParcelable(u.e.class.getClassLoader()));
    u = P.r0(paramParcel);
    v = P.r0(paramParcel);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "dest");
    paramParcel.writeString(o.name());
    paramParcel.writeParcelable(p, paramInt);
    paramParcel.writeParcelable(q, paramInt);
    paramParcel.writeString(r);
    paramParcel.writeString(s);
    paramParcel.writeParcelable(t, paramInt);
    P localP = P.a;
    P.G0(paramParcel, u);
    P.G0(paramParcel, v);
  }
  
  public static enum a
  {
    public final String o;
    
    public a(String paramString1)
    {
      o = paramString1;
    }
    
    public final String e()
    {
      return o;
    }
  }
  
  public static final class b
    implements Parcelable.Creator
  {
    public u.f a(Parcel paramParcel)
    {
      Intrinsics.checkNotNullParameter(paramParcel, "source");
      return new u.f(paramParcel, null);
    }
    
    public u.f[] b(int paramInt)
    {
      return new u.f[paramInt];
    }
  }
  
  public static final class c
  {
    public final u.f a(u.e parame, String paramString)
    {
      return new u.f(parame, u.f.a.q, null, paramString, null);
    }
    
    public final u.f b(u.e parame, a parama, i parami)
    {
      return new u.f(parame, u.f.a.p, parama, parami, null, null);
    }
    
    public final u.f c(u.e parame, String paramString1, String paramString2, String paramString3)
    {
      ArrayList localArrayList = new ArrayList();
      if (paramString1 != null) {
        localArrayList.add(paramString1);
      }
      if (paramString2 != null) {
        localArrayList.add(paramString2);
      }
      paramString1 = TextUtils.join(": ", localArrayList);
      return new u.f(parame, u.f.a.r, null, paramString1, paramString3);
    }
    
    public final u.f e(u.e parame, a parama)
    {
      Intrinsics.checkNotNullParameter(parama, "token");
      return new u.f(parame, u.f.a.p, parama, null, null);
    }
  }
}

/* Location:
 * Qualified Name:     Y1.u.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */