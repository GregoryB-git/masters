package com.google.android.gms.internal.auth_api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import d6.m;
import java.util.List;
import k6.a.a;
import k6.a.g;
import k6.b;
import k6.d.a;
import l6.q.a;
import m6.j;

public final class zbaa
  extends k6.d
{
  private static final a.g zba;
  private static final a.a zbb;
  private static final k6.a zbc;
  
  static
  {
    a.g localg = new a.g();
    zba = localg;
    zby localzby = new zby();
    zbb = localzby;
    zbc = new k6.a("Auth.Api.Identity.Authorization.API", localzby, localg);
  }
  
  public zbaa(Activity paramActivity, m paramm)
  {
    super(paramActivity, locala, new m(paramm), d.a.c);
  }
  
  public zbaa(Context paramContext, m paramm)
  {
    super(paramContext, locala, new m(paramm), d.a.c);
  }
  
  public final Task<d6.a> authorize(AuthorizationRequest paramAuthorizationRequest)
  {
    j.i(paramAuthorizationRequest);
    List localList = a;
    boolean bool1;
    if ((localList != null) && (!localList.isEmpty())) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    j.a("requestedScopes cannot be null or empty", bool1);
    boolean bool2 = p;
    String str1 = f;
    Account localAccount = e;
    String str2 = b;
    if (str1 != null) {
      j.e(str1);
    } else {
      str1 = null;
    }
    if (localAccount == null) {
      localAccount = null;
    }
    if ((d) && (str2 != null))
    {
      localObject = str2;
      bool1 = true;
    }
    else
    {
      localObject = null;
      bool1 = false;
    }
    boolean bool3;
    if ((c) && (str2 != null))
    {
      if ((localObject != null) && (!((String)localObject).equals(str2))) {
        bool3 = false;
      } else {
        bool3 = true;
      }
      j.a("two different server client ids provided", bool3);
      localObject = str2;
      bool3 = true;
    }
    else
    {
      bool3 = false;
      bool2 = bool3;
    }
    paramAuthorizationRequest = new AuthorizationRequest(localList, (String)localObject, bool3, bool1, localAccount, str1, getApiOptionsa, bool2);
    Object localObject = new q.a();
    c = new j6.d[] { zbas.zbc };
    a = new zbx(this, paramAuthorizationRequest);
    b = false;
    d = 1534;
    return doRead(((q.a)localObject).a());
  }
  
  public final d6.a getAuthorizationResultFromIntent(Intent paramIntent)
  {
    if (paramIntent != null)
    {
      Status localStatus = (Status)n6.d.a(paramIntent, "status", Status.CREATOR);
      if (localStatus != null)
      {
        if (localStatus.D())
        {
          paramIntent = (d6.a)n6.d.a(paramIntent, "authorization_result", d6.a.CREATOR);
          if (paramIntent != null) {
            return paramIntent;
          }
          throw new b(Status.o);
        }
        throw new b(localStatus);
      }
      throw new b(Status.q);
    }
    throw new b(Status.o);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth_api.zbaa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */