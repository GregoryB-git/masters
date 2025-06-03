package x1;

import O1.P;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g
{
  public static final a f = new a(null);
  public static g g;
  public final Z.a a;
  public final b b;
  public a c;
  public final AtomicBoolean d;
  public Date e;
  
  public g(Z.a parama, b paramb)
  {
    a = parama;
    b = paramb;
    d = new AtomicBoolean(false);
    e = new Date(0L);
  }
  
  public static final void l(g paramg, a.a parama)
  {
    Intrinsics.checkNotNullParameter(paramg, "this$0");
    paramg.m(parama);
  }
  
  public static final void n(AtomicBoolean paramAtomicBoolean, Set paramSet1, Set paramSet2, Set paramSet3, K paramK)
  {
    Intrinsics.checkNotNullParameter(paramAtomicBoolean, "$permissionsCallSucceeded");
    Intrinsics.checkNotNullParameter(paramSet1, "$permissions");
    Intrinsics.checkNotNullParameter(paramSet2, "$declinedPermissions");
    Intrinsics.checkNotNullParameter(paramSet3, "$expiredPermissions");
    Intrinsics.checkNotNullParameter(paramK, "response");
    paramK = paramK.d();
    if (paramK == null) {
      return;
    }
    paramK = paramK.optJSONArray("data");
    if (paramK == null) {
      return;
    }
    paramAtomicBoolean.set(true);
    int i = paramK.length();
    if (i > 0)
    {
      int k;
      for (int j = 0;; j = k)
      {
        k = j + 1;
        Object localObject = paramK.optJSONObject(j);
        if (localObject != null)
        {
          paramAtomicBoolean = ((JSONObject)localObject).optString("permission");
          localObject = ((JSONObject)localObject).optString("status");
          if ((!P.c0(paramAtomicBoolean)) && (!P.c0((String)localObject)))
          {
            Intrinsics.checkNotNullExpressionValue(localObject, "status");
            Locale localLocale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(localLocale, "US");
            localObject = ((String)localObject).toLowerCase(localLocale);
            Intrinsics.checkNotNullExpressionValue(localObject, "(this as java.lang.String).toLowerCase(locale)");
            Intrinsics.checkNotNullExpressionValue(localObject, "status");
            j = ((String)localObject).hashCode();
            if (j != -1309235419)
            {
              if (j != 280295099)
              {
                if ((j == 568196142) && (((String)localObject).equals("declined")))
                {
                  paramSet2.add(paramAtomicBoolean);
                  break label289;
                }
              }
              else if (((String)localObject).equals("granted"))
              {
                paramSet1.add(paramAtomicBoolean);
                break label289;
              }
            }
            else {
              if (((String)localObject).equals("expired")) {
                break label281;
              }
            }
            Log.w("AccessTokenManager", Intrinsics.i("Unexpected status: ", localObject));
            break label289;
            label281:
            paramSet3.add(paramAtomicBoolean);
          }
        }
        label289:
        if (k >= i) {
          break;
        }
      }
    }
  }
  
  public static final void o(d paramd, K paramK)
  {
    Intrinsics.checkNotNullParameter(paramd, "$refreshResult");
    Intrinsics.checkNotNullParameter(paramK, "response");
    paramK = paramK.d();
    if (paramK == null) {
      return;
    }
    paramd.f(paramK.optString("access_token"));
    paramd.h(paramK.optInt("expires_at"));
    paramd.i(paramK.optInt("expires_in"));
    paramd.g(Long.valueOf(paramK.optLong("data_access_expiration_time")));
    paramd.j(paramK.optString("graph_domain", null));
  }
  
  public static final void p(d paramd, a parama, a.a parama1, AtomicBoolean paramAtomicBoolean, Set paramSet1, Set paramSet2, Set paramSet3, g paramg, J paramJ)
  {
    Intrinsics.checkNotNullParameter(paramd, "$refreshResult");
    Intrinsics.checkNotNullParameter(paramAtomicBoolean, "$permissionsCallSucceeded");
    Intrinsics.checkNotNullParameter(paramSet1, "$permissions");
    Intrinsics.checkNotNullParameter(paramSet2, "$declinedPermissions");
    Intrinsics.checkNotNullParameter(paramSet3, "$expiredPermissions");
    Intrinsics.checkNotNullParameter(paramg, "this$0");
    Intrinsics.checkNotNullParameter(paramJ, "it");
    Object localObject = paramd.a();
    int i = paramd.c();
    Long localLong = paramd.b();
    String str1 = paramd.e();
    try
    {
      locala = f;
      if (locala.e().i() != null)
      {
        paramJ = locala.e().i();
        if (paramJ == null) {
          paramJ = null;
        } else {
          paramJ = paramJ.m();
        }
        if (paramJ == parama.m()) {
          if ((!paramAtomicBoolean.get()) && (localObject == null) && (i == 0))
          {
            if (parama1 != null)
            {
              paramd = new x1/o;
              paramd.<init>("Failed to refresh access token");
              parama1.b(paramd);
            }
            d.set(false);
            return;
          }
        }
      }
    }
    finally
    {
      a locala;
      parama = null;
      break label507;
      paramJ = parama.g();
      if (paramd.c() != 0)
      {
        paramJ = new java/util/Date;
        paramJ.<init>(paramd.c() * 1000L);
      }
      for (;;)
      {
        break;
        if (paramd.d() != 0)
        {
          paramJ = new java/util/Date;
          paramJ.<init>();
          long l = paramJ.getTime();
          paramJ = new Date(paramd.d() * 1000L + l);
        }
      }
      paramd = (d)localObject;
      if (localObject == null) {
        paramd = parama.l();
      }
      String str2 = parama.c();
      String str3 = parama.m();
      if (!paramAtomicBoolean.get()) {
        paramSet1 = parama.j();
      }
      if (!paramAtomicBoolean.get()) {
        paramSet2 = parama.e();
      }
      if (paramAtomicBoolean.get()) {
        paramAtomicBoolean = paramSet3;
      } else {
        paramAtomicBoolean = parama.f();
      }
      h localh = parama.k();
      Date localDate = new java/util/Date;
      localDate.<init>();
      if (localLong != null)
      {
        paramSet3 = new java/util/Date;
        paramSet3.<init>(localLong.longValue() * 1000L);
      }
      for (;;)
      {
        break;
        paramSet3 = parama.d();
      }
      localObject = str1;
      if (str1 == null) {
        localObject = parama.h();
      }
      parama = new a(paramd, str2, str3, paramSet1, paramSet2, paramAtomicBoolean, localh, paramJ, localDate, paramSet3, (String)localObject);
      try
      {
        locala.e().r(parama);
        d.set(false);
        if (parama1 != null) {
          parama1.a(parama);
        }
        return;
      }
      finally
      {
        break label507;
      }
      if (parama1 != null)
      {
        paramd = new x1/o;
        paramd.<init>("No current access token to refresh");
        parama1.b(paramd);
      }
      d.set(false);
      return;
      label507:
      d.set(false);
      if ((parama1 != null) && (parama != null)) {
        parama1.a(parama);
      }
    }
  }
  
  public final void g()
  {
    q(i(), i());
  }
  
  public final void h()
  {
    if (!u()) {
      return;
    }
    k(null);
  }
  
  public final a i()
  {
    return c;
  }
  
  public final boolean j()
  {
    a locala = b.f();
    if (locala != null)
    {
      s(locala, false);
      return true;
    }
    return false;
  }
  
  public final void k(a.a parama)
  {
    if (Intrinsics.a(Looper.getMainLooper(), Looper.myLooper())) {
      m(parama);
    } else {
      new Handler(Looper.getMainLooper()).post(new c(this, parama));
    }
  }
  
  public final void m(a.a parama)
  {
    a locala = i();
    if (locala == null)
    {
      if (parama != null) {
        parama.b(new o("No current access token to refresh"));
      }
      return;
    }
    if (!d.compareAndSet(false, true))
    {
      if (parama != null) {
        parama.b(new o("Refresh already in progress"));
      }
      return;
    }
    e = new Date();
    HashSet localHashSet1 = new HashSet();
    HashSet localHashSet2 = new HashSet();
    HashSet localHashSet3 = new HashSet();
    AtomicBoolean localAtomicBoolean = new AtomicBoolean(false);
    d locald = new d();
    Object localObject = f;
    localObject = new J(new F[] { a.b((a)localObject, locala, new d(localAtomicBoolean, localHashSet1, localHashSet2, localHashSet3)), a.a((a)localObject, locala, new e(locald)) });
    ((J)localObject).f(new f(locald, locala, parama, localAtomicBoolean, localHashSet1, localHashSet2, localHashSet3, this));
    ((J)localObject).q();
  }
  
  public final void q(a parama1, a parama2)
  {
    Intent localIntent = new Intent(B.l(), CurrentAccessTokenExpirationBroadcastReceiver.class);
    localIntent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
    localIntent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", parama1);
    localIntent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", parama2);
    a.d(localIntent);
  }
  
  public final void r(a parama)
  {
    s(parama, true);
  }
  
  public final void s(a parama, boolean paramBoolean)
  {
    a locala = c;
    c = parama;
    d.set(false);
    e = new Date(0L);
    if (paramBoolean)
    {
      Object localObject = b;
      if (parama != null)
      {
        ((b)localObject).g(parama);
      }
      else
      {
        ((b)localObject).a();
        localObject = P.a;
        P.i(B.l());
      }
    }
    if (!P.e(locala, parama))
    {
      q(locala, parama);
      t();
    }
  }
  
  public final void t()
  {
    Context localContext = B.l();
    Object localObject = a.z;
    a locala = ((a.c)localObject).e();
    AlarmManager localAlarmManager = (AlarmManager)localContext.getSystemService("alarm");
    if (((a.c)localObject).g())
    {
      if (locala == null) {
        localObject = null;
      } else {
        localObject = locala.g();
      }
      if ((localObject != null) && (localAlarmManager != null))
      {
        localObject = new Intent(localContext, CurrentAccessTokenExpirationBroadcastReceiver.class);
        ((Intent)localObject).setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        localObject = PendingIntent.getBroadcast(localContext, 0, (Intent)localObject, 67108864);
      }
    }
    try
    {
      localAlarmManager.set(1, locala.g().getTime(), (PendingIntent)localObject);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final boolean u()
  {
    a locala = i();
    boolean bool1 = false;
    if (locala == null) {
      return false;
    }
    long l = new Date().getTime();
    boolean bool2 = bool1;
    if (locala.k().e())
    {
      bool2 = bool1;
      if (l - e.getTime() > 3600000L)
      {
        bool2 = bool1;
        if (l - locala.i().getTime() > 86400000L) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public static final class a
  {
    public final F c(a parama, F.b paramb)
    {
      g.e locale = f(parama);
      Bundle localBundle = new Bundle();
      localBundle.putString("grant_type", locale.b());
      localBundle.putString("client_id", parama.c());
      localBundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
      parama = F.n.x(parama, locale.a(), paramb);
      parama.G(localBundle);
      parama.F(L.o);
      return parama;
    }
    
    public final F d(a parama, F.b paramb)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("fields", "permission,status");
      parama = F.n.x(parama, "me/permissions", paramb);
      parama.G(localBundle);
      parama.F(L.o);
      return parama;
    }
    
    public final g e()
    {
      Object localObject1 = g.e();
      if (localObject1 == null)
      {
        try
        {
          Object localObject2 = g.e();
          localObject1 = localObject2;
          if (localObject2 == null)
          {
            Z.a locala = Z.a.b(B.l());
            Intrinsics.checkNotNullExpressionValue(locala, "getInstance(applicationContext)");
            localObject2 = new x1/b;
            ((b)localObject2).<init>();
            localObject1 = new x1/g;
            ((g)localObject1).<init>(locala, (b)localObject2);
            g.f((g)localObject1);
          }
        }
        finally
        {
          break label66;
        }
        return localg;
        label66:
        throw localg;
      }
      return localg;
    }
    
    public final g.e f(a parama)
    {
      String str = parama.h();
      parama = str;
      if (str == null) {
        parama = "facebook";
      }
      if (Intrinsics.a(parama, "instagram")) {
        parama = new g.c();
      } else {
        parama = new g.b();
      }
      return parama;
    }
  }
  
  public static final class b
    implements g.e
  {
    public final String a = "oauth/access_token";
    public final String b = "fb_extend_sso_token";
    
    public String a()
    {
      return a;
    }
    
    public String b()
    {
      return b;
    }
  }
  
  public static final class c
    implements g.e
  {
    public final String a = "refresh_access_token";
    public final String b = "ig_refresh_token";
    
    public String a()
    {
      return a;
    }
    
    public String b()
    {
      return b;
    }
  }
  
  public static final class d
  {
    public String a;
    public int b;
    public int c;
    public Long d;
    public String e;
    
    public final String a()
    {
      return a;
    }
    
    public final Long b()
    {
      return d;
    }
    
    public final int c()
    {
      return b;
    }
    
    public final int d()
    {
      return c;
    }
    
    public final String e()
    {
      return e;
    }
    
    public final void f(String paramString)
    {
      a = paramString;
    }
    
    public final void g(Long paramLong)
    {
      d = paramLong;
    }
    
    public final void h(int paramInt)
    {
      b = paramInt;
    }
    
    public final void i(int paramInt)
    {
      c = paramInt;
    }
    
    public final void j(String paramString)
    {
      e = paramString;
    }
  }
  
  public static abstract interface e
  {
    public abstract String a();
    
    public abstract String b();
  }
}

/* Location:
 * Qualified Name:     x1.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */