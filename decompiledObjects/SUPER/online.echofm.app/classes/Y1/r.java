package Y1;

import O1.E;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x1.B;
import x1.h;

public final class r
  extends D
{
  @NotNull
  public static final Parcelable.Creator<r> CREATOR = new a();
  public static final b u = new b(null);
  public final String s = "instagram_login";
  public final h t = h.y;
  
  public r(u paramu)
  {
    super(paramu);
  }
  
  public r(Parcel paramParcel)
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
  
  public int o(u.e parame)
  {
    Intrinsics.checkNotNullParameter(parame, "request");
    u.c localc = u.A;
    String str1 = localc.a();
    Object localObject1 = E.a;
    Object localObject2 = d().i();
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = B.l();
    }
    String str2 = parame.a();
    Set localSet = parame.n();
    boolean bool1 = parame.t();
    boolean bool2 = parame.p();
    e locale = parame.g();
    localObject2 = locale;
    if (locale == null) {
      localObject2 = e.p;
    }
    parame = E.j((Context)localObject1, str2, localSet, str1, bool1, bool2, (e)localObject2, c(parame.b()), parame.c(), parame.l(), parame.o(), parame.q(), parame.v());
    a("e2e", str1);
    return B(parame, localc.b());
  }
  
  public h u()
  {
    return t;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "dest");
    super.writeToParcel(paramParcel, paramInt);
  }
  
  public static final class a
    implements Parcelable.Creator
  {
    public r a(Parcel paramParcel)
    {
      Intrinsics.checkNotNullParameter(paramParcel, "source");
      return new r(paramParcel);
    }
    
    public r[] b(int paramInt)
    {
      return new r[paramInt];
    }
  }
  
  public static final class b {}
}

/* Location:
 * Qualified Name:     Y1.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */