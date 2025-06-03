package io.flutter.plugins.googlesignin;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import g6.a;
import h6.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import m6.j;

public class GoogleSignInWrapper
{
  public a getClient(Context paramContext, GoogleSignInOptions paramGoogleSignInOptions)
  {
    j.i(paramGoogleSignInOptions);
    return new a(paramContext, paramGoogleSignInOptions);
  }
  
  public GoogleSignInAccount getLastSignedInAccount(Context arg1)
  {
    synchronized (o.a(???))
    {
      GoogleSignInAccount localGoogleSignInAccount = b;
      return localGoogleSignInAccount;
    }
  }
  
  public boolean hasPermissions(GoogleSignInAccount paramGoogleSignInAccount, Scope paramScope)
  {
    boolean bool = false;
    if (paramGoogleSignInAccount != null)
    {
      HashSet localHashSet = new HashSet();
      Collections.addAll(localHashSet, new Scope[] { paramScope });
      bool = new HashSet(r).containsAll(localHashSet);
    }
    return bool;
  }
  
  public void requestPermissions(Activity paramActivity, int paramInt, GoogleSignInAccount paramGoogleSignInAccount, Scope[] paramArrayOfScope)
  {
    if (paramActivity != null)
    {
      if (paramArrayOfScope != null)
      {
        HashSet localHashSet = new HashSet();
        HashMap localHashMap = new HashMap();
        if (paramArrayOfScope.length > 0)
        {
          localHashSet.add(paramArrayOfScope[0]);
          localHashSet.addAll(Arrays.asList(paramArrayOfScope));
        }
        if ((paramGoogleSignInAccount != null) && (!TextUtils.isEmpty(d)))
        {
          paramGoogleSignInAccount = d;
          j.i(paramGoogleSignInAccount);
          j.e(paramGoogleSignInAccount);
          paramGoogleSignInAccount = new Account(paramGoogleSignInAccount, "com.google");
        }
        else
        {
          paramGoogleSignInAccount = null;
        }
        if (localHashSet.contains(GoogleSignInOptions.y))
        {
          paramArrayOfScope = GoogleSignInOptions.x;
          if (localHashSet.contains(paramArrayOfScope)) {
            localHashSet.remove(paramArrayOfScope);
          }
        }
        paramActivity.startActivityForResult(new a(paramActivity, new GoogleSignInOptions(3, new ArrayList(localHashSet), paramGoogleSignInAccount, false, false, false, null, null, localHashMap, null)).a(), paramInt);
        return;
      }
      throw new NullPointerException("Please provide at least one scope");
    }
    throw new NullPointerException("Please provide a non-null Activity");
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.googlesignin.GoogleSignInWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */