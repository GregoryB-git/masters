package Y1;

import O1.P;
import O1.V;
import O1.V.a;
import O1.V.b;
import O1.V.d;
import O1.i;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x1.h;
import x1.o;

public class G
  extends F
{
  @NotNull
  public static final Parcelable.Creator<G> CREATOR = new b();
  public static final c x = new c(null);
  public V t;
  public String u;
  public final String v = "web_view";
  public final h w = h.t;
  
  public G(u paramu)
  {
    super(paramu);
  }
  
  public G(Parcel paramParcel)
  {
    super(paramParcel);
    u = paramParcel.readString();
  }
  
  public void b()
  {
    V localV = t;
    if (localV != null)
    {
      if (localV != null) {
        localV.cancel();
      }
      t = null;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String f()
  {
    return v;
  }
  
  public boolean i()
  {
    return true;
  }
  
  public int o(final u.e parame)
  {
    Intrinsics.checkNotNullParameter(parame, "request");
    Object localObject1 = q(parame);
    d locald = new d(this, parame);
    Object localObject2 = u.A.a();
    u = ((String)localObject2);
    a("e2e", localObject2);
    localObject2 = d().i();
    if (localObject2 == null) {
      return 0;
    }
    boolean bool = P.W((Context)localObject2);
    localObject1 = new a((Context)localObject2, parame.a(), (Bundle)localObject1);
    String str = u;
    if (str != null)
    {
      t = ((a)localObject1).m(str).p(bool).k(parame.c()).q(parame.j()).r(parame.k()).o(parame.q()).s(parame.v()).h(locald).a();
      parame = new i();
      parame.D1(true);
      parame.b2(t);
      parame.T1(((e)localObject2).n(), "FacebookDialogFragment");
      return 1;
    }
    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
  }
  
  public h t()
  {
    return w;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "dest");
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(u);
  }
  
  public final void x(u.e parame, Bundle paramBundle, o paramo)
  {
    Intrinsics.checkNotNullParameter(parame, "request");
    super.v(parame, paramBundle, paramo);
  }
  
  public final class a
    extends V.a
  {
    public String h = "fbconnect://success";
    public t i = t.v;
    public B j = B.q;
    public boolean k;
    public boolean l;
    public String m;
    public String n;
    
    public a(Context paramContext, String paramString, Bundle paramBundle)
    {
      super(paramString, "oauth", paramBundle);
    }
    
    public V a()
    {
      Bundle localBundle = f();
      if (localBundle != null)
      {
        localBundle.putString("redirect_uri", h);
        localBundle.putString("client_id", c());
        localBundle.putString("e2e", j());
        if (j == B.r) {
          localObject = "token,signed_request,graph_domain,granted_scopes";
        } else {
          localObject = "token,signed_request,graph_domain";
        }
        localBundle.putString("response_type", (String)localObject);
        localBundle.putString("return_scopes", "true");
        localBundle.putString("auth_type", i());
        localBundle.putString("login_behavior", i.name());
        if (k) {
          localBundle.putString("fx_app", j.toString());
        }
        if (l) {
          localBundle.putString("skip_dedupe", "true");
        }
        V.b localb = V.A;
        Object localObject = d();
        if (localObject != null) {
          return localb.d((Context)localObject, "oauth", localBundle, g(), j, e());
        }
        throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
      }
      throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
    }
    
    public final String i()
    {
      String str = n;
      if (str != null) {
        return str;
      }
      Intrinsics.n("authType");
      throw null;
    }
    
    public final String j()
    {
      String str = m;
      if (str != null) {
        return str;
      }
      Intrinsics.n("e2e");
      throw null;
    }
    
    public final a k(String paramString)
    {
      Intrinsics.checkNotNullParameter(paramString, "authType");
      l(paramString);
      return this;
    }
    
    public final void l(String paramString)
    {
      Intrinsics.checkNotNullParameter(paramString, "<set-?>");
      n = paramString;
    }
    
    public final a m(String paramString)
    {
      Intrinsics.checkNotNullParameter(paramString, "e2e");
      n(paramString);
      return this;
    }
    
    public final void n(String paramString)
    {
      Intrinsics.checkNotNullParameter(paramString, "<set-?>");
      m = paramString;
    }
    
    public final a o(boolean paramBoolean)
    {
      k = paramBoolean;
      return this;
    }
    
    public final a p(boolean paramBoolean)
    {
      String str;
      if (paramBoolean) {
        str = "fbconnect://chrome_os_success";
      } else {
        str = "fbconnect://success";
      }
      h = str;
      return this;
    }
    
    public final a q(t paramt)
    {
      Intrinsics.checkNotNullParameter(paramt, "loginBehavior");
      i = paramt;
      return this;
    }
    
    public final a r(B paramB)
    {
      Intrinsics.checkNotNullParameter(paramB, "targetApp");
      j = paramB;
      return this;
    }
    
    public final a s(boolean paramBoolean)
    {
      l = paramBoolean;
      return this;
    }
  }
  
  public static final class b
    implements Parcelable.Creator
  {
    public G a(Parcel paramParcel)
    {
      Intrinsics.checkNotNullParameter(paramParcel, "source");
      return new G(paramParcel);
    }
    
    public G[] b(int paramInt)
    {
      return new G[paramInt];
    }
  }
  
  public static final class c {}
  
  public static final class d
    implements V.d
  {
    public d(G paramG, u.e parame) {}
    
    public void a(Bundle paramBundle, o paramo)
    {
      a.x(parame, paramBundle, paramo);
    }
  }
}

/* Location:
 * Qualified Name:     Y1.G
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */