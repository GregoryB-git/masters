package Y1;

import O1.Q;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class u$e
  implements Parcelable
{
  @NotNull
  public static final Parcelable.Creator<e> CREATOR = new a();
  public static final b G = new b(null);
  public boolean A;
  public boolean B;
  public final String C;
  public final String D;
  public final String E;
  public final a F;
  public final t o;
  public Set p;
  public final e q;
  public final String r;
  public String s;
  public boolean t;
  public String u;
  public String v;
  public String w;
  public String x;
  public boolean y;
  public final B z;
  
  public u$e(Parcel paramParcel)
  {
    Object localObject = Q.a;
    o = t.valueOf(Q.k(paramParcel.readString(), "loginBehavior"));
    localObject = new ArrayList();
    paramParcel.readStringList((List)localObject);
    p = new HashSet((Collection)localObject);
    localObject = paramParcel.readString();
    if (localObject != null) {
      localObject = e.valueOf((String)localObject);
    } else {
      localObject = e.p;
    }
    q = ((e)localObject);
    r = Q.k(paramParcel.readString(), "applicationId");
    s = Q.k(paramParcel.readString(), "authId");
    int i = paramParcel.readByte();
    boolean bool1 = true;
    boolean bool2;
    if (i != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    t = bool2;
    u = paramParcel.readString();
    v = Q.k(paramParcel.readString(), "authType");
    w = paramParcel.readString();
    x = paramParcel.readString();
    if (paramParcel.readByte() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    y = bool2;
    localObject = paramParcel.readString();
    if (localObject != null) {
      localObject = B.valueOf((String)localObject);
    } else {
      localObject = B.q;
    }
    z = ((B)localObject);
    if (paramParcel.readByte() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    A = bool2;
    if (paramParcel.readByte() != 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    B = bool2;
    C = Q.k(paramParcel.readString(), "nonce");
    D = paramParcel.readString();
    E = paramParcel.readString();
    paramParcel = paramParcel.readString();
    if (paramParcel == null) {
      paramParcel = null;
    } else {
      paramParcel = a.valueOf(paramParcel);
    }
    F = paramParcel;
  }
  
  public final String a()
  {
    return r;
  }
  
  public final String b()
  {
    return s;
  }
  
  public final String c()
  {
    return v;
  }
  
  public final String d()
  {
    return E;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final a e()
  {
    return F;
  }
  
  public final String f()
  {
    return D;
  }
  
  public final e g()
  {
    return q;
  }
  
  public final String h()
  {
    return w;
  }
  
  public final String i()
  {
    return u;
  }
  
  public final t j()
  {
    return o;
  }
  
  public final B k()
  {
    return z;
  }
  
  public final String l()
  {
    return x;
  }
  
  public final String m()
  {
    return C;
  }
  
  public final Set n()
  {
    return p;
  }
  
  public final boolean o()
  {
    return y;
  }
  
  public final boolean p()
  {
    Iterator localIterator = p.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (z.a.c(str)) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean q()
  {
    return A;
  }
  
  public final boolean r()
  {
    boolean bool;
    if (z == B.r) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean t()
  {
    return t;
  }
  
  public final void u(Set paramSet)
  {
    Intrinsics.checkNotNullParameter(paramSet, "<set-?>");
    p = paramSet;
  }
  
  public final boolean v()
  {
    return B;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "dest");
    paramParcel.writeString(o.name());
    paramParcel.writeStringList(new ArrayList(p));
    paramParcel.writeString(q.name());
    paramParcel.writeString(r);
    paramParcel.writeString(s);
    paramParcel.writeByte((byte)t);
    paramParcel.writeString(u);
    paramParcel.writeString(v);
    paramParcel.writeString(w);
    paramParcel.writeString(x);
    paramParcel.writeByte((byte)y);
    paramParcel.writeString(z.name());
    paramParcel.writeByte((byte)A);
    paramParcel.writeByte((byte)B);
    paramParcel.writeString(C);
    paramParcel.writeString(D);
    paramParcel.writeString(E);
    Object localObject = F;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((Enum)localObject).name();
    }
    paramParcel.writeString((String)localObject);
  }
  
  public static final class a
    implements Parcelable.Creator
  {
    public u.e a(Parcel paramParcel)
    {
      Intrinsics.checkNotNullParameter(paramParcel, "source");
      return new u.e(paramParcel, null);
    }
    
    public u.e[] b(int paramInt)
    {
      return new u.e[paramInt];
    }
  }
  
  public static final class b {}
}

/* Location:
 * Qualified Name:     Y1.u.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */