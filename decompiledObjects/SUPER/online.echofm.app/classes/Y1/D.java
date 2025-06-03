package Y1;

import O1.H;
import O1.P;
import V5.t;
import W5.m;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import androidx.activity.result.c;
import java.util.Collection;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import x1.a;
import x1.h;
import x1.o;
import x1.r;

public abstract class D
  extends A
{
  public final h r = h.q;
  
  public D(u paramu)
  {
    super(paramu);
  }
  
  public D(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  public static final void A(D paramD, u.e parame, Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramD, "this$0");
    Intrinsics.checkNotNullParameter(parame, "$request");
    Intrinsics.checkNotNullParameter(paramBundle, "$extras");
    try
    {
      paramD.x(parame, paramD.k(parame, paramBundle));
    }
    catch (o paramBundle) {}catch (x1.D paramBundle)
    {
      break label54;
    }
    paramD.w(parame, null, paramBundle.getMessage(), null);
    return;
    label54:
    paramBundle = paramBundle.c();
    paramD.w(parame, paramBundle.d(), paramBundle.c(), String.valueOf(paramBundle.b()));
  }
  
  public boolean B(Intent paramIntent, int paramInt)
  {
    if ((paramIntent != null) && (y(paramIntent)))
    {
      Object localObject1 = d().k();
      boolean bool = localObject1 instanceof x;
      Object localObject2 = null;
      if (bool) {
        localObject1 = (x)localObject1;
      } else {
        localObject1 = null;
      }
      if (localObject1 == null)
      {
        paramIntent = (Intent)localObject2;
      }
      else
      {
        localObject1 = ((x)localObject1).M1();
        if (localObject1 == null)
        {
          paramIntent = (Intent)localObject2;
        }
        else
        {
          ((c)localObject1).a(paramIntent);
          paramIntent = t.a;
        }
      }
      return paramIntent != null;
    }
    return false;
  }
  
  public boolean j(int paramInt1, int paramInt2, Intent paramIntent)
  {
    u.e locale = d().o();
    if (paramIntent == null) {}
    for (paramIntent = u.f.w.a(locale, "Operation canceled");; paramIntent = u.f.c.d(u.f.w, locale, "Unexpected resultCode from authorization.", null, null, 8, null))
    {
      q(paramIntent);
      break label204;
      if (paramInt2 == 0)
      {
        v(locale, paramIntent);
        break label204;
      }
      if (paramInt2 == -1) {
        break;
      }
    }
    Bundle localBundle = paramIntent.getExtras();
    if (localBundle == null)
    {
      q(u.f.c.d(u.f.w, locale, "Unexpected null from returned authorization data.", null, null, 8, null));
      return true;
    }
    String str1 = r(localBundle);
    paramIntent = localBundle.get("error_code");
    if (paramIntent == null) {
      paramIntent = null;
    } else {
      paramIntent = paramIntent.toString();
    }
    String str2 = t(localBundle);
    String str3 = localBundle.getString("e2e");
    if (!P.c0(str3)) {
      h(str3);
    }
    if ((str1 == null) && (paramIntent == null) && (str2 == null) && (locale != null)) {
      z(locale, localBundle);
    } else {
      w(locale, str1, str2, paramIntent);
    }
    label204:
    return true;
  }
  
  public final void q(u.f paramf)
  {
    if (paramf != null) {
      d().g(paramf);
    } else {
      d().B();
    }
  }
  
  public String r(Bundle paramBundle)
  {
    Object localObject = null;
    String str;
    if (paramBundle == null) {
      str = null;
    } else {
      str = paramBundle.getString("error");
    }
    if (str == null)
    {
      if (paramBundle == null) {
        paramBundle = (Bundle)localObject;
      } else {
        paramBundle = paramBundle.getString("error_type");
      }
    }
    else {
      paramBundle = str;
    }
    return paramBundle;
  }
  
  public String t(Bundle paramBundle)
  {
    Object localObject = null;
    String str;
    if (paramBundle == null) {
      str = null;
    } else {
      str = paramBundle.getString("error_message");
    }
    if (str == null)
    {
      if (paramBundle == null) {
        paramBundle = (Bundle)localObject;
      } else {
        paramBundle = paramBundle.getString("error_description");
      }
    }
    else {
      paramBundle = str;
    }
    return paramBundle;
  }
  
  public h u()
  {
    return r;
  }
  
  public void v(u.e parame, Intent paramIntent)
  {
    Intrinsics.checkNotNullParameter(paramIntent, "data");
    Object localObject1 = paramIntent.getExtras();
    String str = r((Bundle)localObject1);
    paramIntent = null;
    if (localObject1 != null)
    {
      Object localObject2 = ((BaseBundle)localObject1).get("error_code");
      if (localObject2 != null) {
        paramIntent = localObject2.toString();
      }
    }
    if (Intrinsics.a(H.c(), paramIntent)) {
      localObject1 = t((Bundle)localObject1);
    }
    for (parame = u.f.w.c(parame, str, (String)localObject1, paramIntent);; parame = u.f.w.a(parame, str))
    {
      q(parame);
      return;
    }
  }
  
  public void w(u.e parame, String paramString1, String paramString2, String paramString3)
  {
    if ((paramString1 != null) && (Intrinsics.a(paramString1, "logged_out"))) {
      c.z = true;
    }
    while (m.o((Iterable)H.d(), paramString1))
    {
      q(null);
      break;
    }
    if (m.o((Iterable)H.e(), paramString1)) {}
    for (parame = u.f.w.a(parame, null);; parame = u.f.w.c(parame, paramString1, paramString2, paramString3))
    {
      q(parame);
      break;
    }
  }
  
  public void x(u.e parame, Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(parame, "request");
    Intrinsics.checkNotNullParameter(paramBundle, "extras");
    try
    {
      A.a locala = A.q;
      a locala1 = locala.b(parame.n(), paramBundle, u(), parame.a());
      paramBundle = locala.d(paramBundle, parame.m());
      q(u.f.w.b(parame, locala1, paramBundle));
    }
    catch (o paramBundle)
    {
      q(u.f.c.d(u.f.w, parame, null, paramBundle.getMessage(), null, 8, null));
    }
  }
  
  public final boolean y(Intent paramIntent)
  {
    paramIntent = B.l().getPackageManager().queryIntentActivities(paramIntent, 65536);
    Intrinsics.checkNotNullExpressionValue(paramIntent, "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
    return ((Collection)paramIntent).isEmpty() ^ true;
  }
  
  public final void z(u.e parame, Bundle paramBundle)
  {
    if (paramBundle.containsKey("code"))
    {
      P localP = P.a;
      if (!P.c0(paramBundle.getString("code")))
      {
        B.t().execute(new C(this, parame, paramBundle));
        return;
      }
    }
    x(parame, paramBundle);
  }
}

/* Location:
 * Qualified Name:     Y1.D
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */