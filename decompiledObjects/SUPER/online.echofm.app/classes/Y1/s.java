package Y1;

import O1.E;
import O1.f;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x1.B;

public final class s
  extends D
{
  @NotNull
  public static final Parcelable.Creator<s> CREATOR = new a();
  public static final b t = new b(null);
  public final String s = "katana_proxy_auth";
  
  public s(u paramu)
  {
    super(paramu);
  }
  
  public s(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String f()
  {
    return s;
  }
  
  public boolean n()
  {
    return true;
  }
  
  public int o(u.e parame)
  {
    Intrinsics.checkNotNullParameter(parame, "request");
    Object localObject1 = parame.j();
    boolean bool1;
    if ((B.r) && (f.a() != null) && (((t)localObject1).e())) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    String str1 = u.A.a();
    localObject1 = E.a;
    androidx.fragment.app.e locale = d().i();
    String str2 = parame.a();
    Set localSet = parame.n();
    boolean bool2 = parame.t();
    boolean bool3 = parame.p();
    Object localObject2 = parame.g();
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = e.p;
    }
    String str3 = c(parame.b());
    String str4 = parame.c();
    String str5 = parame.l();
    boolean bool4 = parame.o();
    boolean bool5 = parame.q();
    boolean bool6 = parame.v();
    localObject2 = parame.m();
    String str6 = parame.d();
    parame = parame.e();
    if (parame == null) {}
    for (parame = null;; parame = parame.name()) {
      break;
    }
    parame = E.n(locale, str2, localSet, str1, bool2, bool3, (e)localObject1, str3, str4, bool1, str5, bool4, bool5, bool6, (String)localObject2, str6, parame);
    a("e2e", str1);
    parame = parame.iterator();
    int i = 0;
    while (parame.hasNext())
    {
      int j = i + 1;
      i = j;
      if (B((Intent)parame.next(), u.A.b())) {
        return j;
      }
    }
    return 0;
  }
  
  public static final class a
    implements Parcelable.Creator
  {
    public s a(Parcel paramParcel)
    {
      Intrinsics.checkNotNullParameter(paramParcel, "source");
      return new s(paramParcel);
    }
    
    public s[] b(int paramInt)
    {
      return new s[paramInt];
    }
  }
  
  public static final class b {}
}

/* Location:
 * Qualified Name:     Y1.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */