package Y1;

import O1.F;
import O1.P;
import O1.P.a;
import W5.I;
import W5.m;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.fragment.app.e;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.a;
import x1.h;

public final class q
  extends A
{
  @NotNull
  public static final Parcelable.Creator<q> CREATOR = new a();
  public static final b t = new b(null);
  public o r;
  public final String s = "get_token";
  
  public q(u paramu)
  {
    super(paramu);
  }
  
  public q(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  public static final void u(q paramq, u.e parame, Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramq, "this$0");
    Intrinsics.checkNotNullParameter(parame, "$request");
    paramq.r(parame, paramBundle);
  }
  
  public void b()
  {
    o localo = r;
    if (localo != null)
    {
      localo.b();
      localo.g(null);
      r = null;
    }
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
    e locale = d().i();
    Object localObject = locale;
    if (locale == null) {
      localObject = B.l();
    }
    localObject = new o((Context)localObject, parame);
    r = ((o)localObject);
    if (Intrinsics.a(Boolean.valueOf(((F)localObject).h()), Boolean.FALSE)) {
      return 0;
    }
    d().r();
    parame = new p(this, parame);
    localObject = r;
    if (localObject != null) {
      ((F)localObject).g(parame);
    }
    return 1;
  }
  
  public final void q(final u.e parame, Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(parame, "request");
    Intrinsics.checkNotNullParameter(paramBundle, "result");
    Object localObject = paramBundle.getString("com.facebook.platform.extra.USER_ID");
    if ((localObject != null) && (((CharSequence)localObject).length() != 0))
    {
      t(parame, paramBundle);
    }
    else
    {
      d().r();
      String str = paramBundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
      if (str == null) {
        break label84;
      }
      localObject = P.a;
      P.G(str, new c(paramBundle, this, parame));
    }
    return;
    label84:
    throw new IllegalStateException("Required value was null.".toString());
  }
  
  public final void r(u.e parame, Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(parame, "request");
    Object localObject1 = r;
    if (localObject1 != null) {
      ((F)localObject1).g(null);
    }
    r = null;
    d().t();
    Object localObject2;
    Object localObject3;
    if (paramBundle != null)
    {
      localObject2 = paramBundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = m.f();
      }
      localObject3 = parame.n();
      localObject2 = localObject3;
      if (localObject3 == null) {
        localObject2 = I.b();
      }
      localObject3 = paramBundle.getString("com.facebook.platform.extra.ID_TOKEN");
      if ((!((Set)localObject2).contains("openid")) || ((localObject3 != null) && (((CharSequence)localObject3).length() != 0))) {
        break label122;
      }
    }
    for (;;)
    {
      d().B();
      return;
      label122:
      if (((List)localObject1).containsAll((Collection)localObject2))
      {
        q(parame, paramBundle);
        return;
      }
      paramBundle = new HashSet();
      localObject3 = ((Set)localObject2).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject2 = (String)((Iterator)localObject3).next();
        if (!((List)localObject1).contains(localObject2)) {
          paramBundle.add(localObject2);
        }
      }
      if ((paramBundle.isEmpty() ^ true)) {
        a("new_permissions", TextUtils.join(",", paramBundle));
      }
      parame.u(paramBundle);
    }
  }
  
  public final void t(u.e parame, Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(parame, "request");
    Intrinsics.checkNotNullParameter(paramBundle, "result");
    try
    {
      A.a locala = A.q;
      a locala1 = locala.a(paramBundle, h.s, parame.a());
      paramBundle = locala.c(paramBundle, parame.m());
      parame = u.f.w.b(parame, locala1, paramBundle);
    }
    catch (x1.o parame)
    {
      parame = u.f.c.d(u.f.w, d().o(), null, parame.getMessage(), null, 8, null);
    }
    d().g(parame);
  }
  
  public static final class a
    implements Parcelable.Creator
  {
    public q a(Parcel paramParcel)
    {
      Intrinsics.checkNotNullParameter(paramParcel, "source");
      return new q(paramParcel);
    }
    
    public q[] b(int paramInt)
    {
      return new q[paramInt];
    }
  }
  
  public static final class b {}
  
  public static final class c
    implements P.a
  {
    public c(Bundle paramBundle, q paramq, u.e parame) {}
    
    public void a(JSONObject paramJSONObject)
    {
      try
      {
        Bundle localBundle = a;
        if (paramJSONObject == null) {
          paramJSONObject = null;
        } else {
          paramJSONObject = paramJSONObject.getString("id");
        }
        localBundle.putString("com.facebook.platform.extra.USER_ID", paramJSONObject);
        jdField_this.t(parame, a);
      }
      catch (JSONException paramJSONObject)
      {
        jdField_this.d().f(u.f.c.d(u.f.w, jdField_this.d().o(), "Caught exception", paramJSONObject.getMessage(), null, 8, null));
      }
    }
    
    public void b(x1.o paramo)
    {
      u localu = jdField_this.d();
      u.f.c localc = u.f.w;
      u.e locale = jdField_this.d().o();
      if (paramo == null) {}
      for (paramo = null;; paramo = paramo.getMessage()) {
        break;
      }
      localu.f(u.f.c.d(localc, locale, "Caught exception", paramo, null, 8, null));
    }
  }
}

/* Location:
 * Qualified Name:     Y1.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */