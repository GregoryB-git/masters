package com.google.android.gms.internal.auth_api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import d6.b.a;
import d6.b.b;
import d6.b.c;
import d6.b.d;
import d6.c;
import d6.d0;
import d6.f;
import d6.k;
import java.util.Iterator;
import java.util.Set;
import k6.a;
import k6.a.a;
import k6.a.g;
import k6.d.a;
import l6.q.a;

public final class zbaq
  extends k6.d
  implements d6.j
{
  private static final a.g zba;
  private static final a.a zbb;
  private static final a zbc;
  private final String zbd = zbat.zba();
  
  static
  {
    a.g localg = new a.g();
    zba = localg;
    zbal localzbal = new zbal();
    zbb = localzbal;
    zbc = new a("Auth.Api.Identity.SignIn.API", localzbal, localg);
  }
  
  public zbaq(Activity paramActivity, d0 paramd0)
  {
    super(paramActivity, zbc, paramd0, d.a.c);
  }
  
  public zbaq(Context paramContext, d0 paramd0)
  {
    super(paramContext, zbc, paramd0, d.a.c);
  }
  
  public final Task<c> beginSignIn(d6.b paramb)
  {
    m6.j.i(paramb);
    new b.d(false);
    new b.a(false, null, null, true, null, null, false);
    new b.c(false, null, null);
    new b.b(null, false);
    b.a locala = b;
    m6.j.i(locala);
    b.d locald = a;
    m6.j.i(locald);
    Object localObject = f;
    m6.j.i(localObject);
    b.b localb = o;
    m6.j.i(localb);
    boolean bool = d;
    int i = e;
    paramb = new d6.b(locald, locala, zbd, bool, i, (b.c)localObject, localb);
    localObject = new q.a();
    c = new j6.d[] { zbas.zba };
    a = new zbaj(this, paramb);
    b = false;
    d = 1553;
    return doRead(((q.a)localObject).a());
  }
  
  public final String getPhoneNumberFromIntent(Intent paramIntent)
  {
    if (paramIntent != null)
    {
      Status localStatus = (Status)n6.d.a(paramIntent, "status", Status.CREATOR);
      if (localStatus != null)
      {
        if (localStatus.D())
        {
          paramIntent = paramIntent.getStringExtra("phone_number_hint_result");
          if (paramIntent != null) {
            return paramIntent;
          }
          throw new k6.b(Status.o);
        }
        throw new k6.b(localStatus);
      }
      throw new k6.b(Status.q);
    }
    throw new k6.b(Status.o);
  }
  
  public final Task<PendingIntent> getPhoneNumberHintIntent(d6.e parame)
  {
    m6.j.i(parame);
    q.a locala = new q.a();
    c = new j6.d[] { zbas.zbh };
    a = new zbah(this, parame);
    d = 1653;
    return doRead(locala.a());
  }
  
  public final k getSignInCredentialFromIntent(Intent paramIntent)
  {
    if (paramIntent != null)
    {
      Status localStatus = (Status)n6.d.a(paramIntent, "status", Status.CREATOR);
      if (localStatus != null)
      {
        if (localStatus.D())
        {
          paramIntent = (k)n6.d.a(paramIntent, "sign_in_credential", k.CREATOR);
          if (paramIntent != null) {
            return paramIntent;
          }
          throw new k6.b(Status.o);
        }
        throw new k6.b(localStatus);
      }
      throw new k6.b(Status.q);
    }
    throw new k6.b(Status.o);
  }
  
  public final Task<PendingIntent> getSignInIntent(f paramf)
  {
    m6.j.i(paramf);
    Object localObject = a;
    m6.j.i(localObject);
    String str1 = d;
    String str2 = b;
    boolean bool = e;
    int i = f;
    paramf = new f((String)localObject, str2, zbd, str1, bool, i);
    localObject = new q.a();
    c = new j6.d[] { zbas.zbf };
    a = new zbak(this, paramf);
    d = 1555;
    return doRead(((q.a)localObject).a());
  }
  
  public final Task<Void> signOut()
  {
    getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
    synchronized (k6.e.a)
    {
      ??? = ((Set)???).iterator();
    }
    ((k6.e)((Iterator)???).next()).getClass();
    throw new UnsupportedOperationException();
    localObject4 = finally;
    throw ((Throwable)localObject4);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth_api.zbaq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */