package com.google.android.gms.internal.auth_api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import d6.g;
import d6.h;
import d6.i;
import d6.l;
import d6.r;
import java.util.ArrayList;
import java.util.List;
import k6.a;
import k6.a.a;
import k6.a.g;
import k6.d.a;
import l6.q.a;
import m6.j;

public final class zbag
  extends k6.d
  implements d6.d
{
  private static final a.g zba;
  private static final a.a zbb;
  private static final a zbc;
  private final String zbd = zbat.zba();
  
  static
  {
    a.g localg = new a.g();
    zba = localg;
    zbad localzbad = new zbad();
    zbb = localzbad;
    zbc = new a("Auth.Api.Identity.CredentialSaving.API", localzbad, localg);
  }
  
  public zbag(Activity paramActivity, r paramr)
  {
    super(paramActivity, zbc, paramr, d.a.c);
  }
  
  public zbag(Context paramContext, r paramr)
  {
    super(paramContext, zbc, paramr, d.a.c);
  }
  
  public final Status getStatusFromIntent(Intent paramIntent)
  {
    if (paramIntent == null) {
      return Status.o;
    }
    Status localStatus = (Status)n6.d.a(paramIntent, "status", Status.CREATOR);
    paramIntent = localStatus;
    if (localStatus == null) {
      paramIntent = Status.o;
    }
    return paramIntent;
  }
  
  public final Task<g> saveAccountLinkingToken(SaveAccountLinkingTokenRequest paramSaveAccountLinkingTokenRequest)
  {
    j.i(paramSaveAccountLinkingTokenRequest);
    new ArrayList();
    List localList = d;
    Object localObject = c;
    PendingIntent localPendingIntent = a;
    String str = b;
    int i = f;
    TextUtils.isEmpty(e);
    paramSaveAccountLinkingTokenRequest = zbd;
    boolean bool;
    if (localPendingIntent != null) {
      bool = true;
    } else {
      bool = false;
    }
    j.a("Consent PendingIntent cannot be null", bool);
    j.a("Invalid tokenType", "auth_code".equals(str));
    j.a("serviceId cannot be null or empty", TextUtils.isEmpty((CharSequence)localObject) ^ true);
    if (localList != null) {
      bool = true;
    } else {
      bool = false;
    }
    j.a("scopes cannot be null", bool);
    paramSaveAccountLinkingTokenRequest = new SaveAccountLinkingTokenRequest(localPendingIntent, str, (String)localObject, localList, paramSaveAccountLinkingTokenRequest, i);
    localObject = new q.a();
    c = new j6.d[] { zbas.zbg };
    a = new zbab(this, paramSaveAccountLinkingTokenRequest);
    b = false;
    d = 1535;
    return doRead(((q.a)localObject).a());
  }
  
  public final Task<i> savePassword(h paramh)
  {
    j.i(paramh);
    Object localObject = a;
    int i = c;
    localObject = new h((l)localObject, zbd, i);
    paramh = new q.a();
    c = new j6.d[] { zbas.zbe };
    a = new zbac(this, (h)localObject);
    b = false;
    d = 1536;
    return doRead(paramh.a());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth_api.zbag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */