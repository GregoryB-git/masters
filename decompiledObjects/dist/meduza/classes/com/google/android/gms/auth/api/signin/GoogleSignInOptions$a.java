package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import m6.j;

public final class GoogleSignInOptions$a
{
  public HashSet a = new HashSet();
  public boolean b;
  public boolean c;
  public boolean d;
  public String e;
  public Account f;
  public String g;
  public HashMap h = new HashMap();
  public String i;
  
  public GoogleSignInOptions$a(GoogleSignInOptions paramGoogleSignInOptions)
  {
    j.i(paramGoogleSignInOptions);
    a = new HashSet(b);
    b = e;
    c = f;
    d = d;
    e = o;
    f = c;
    g = p;
    h = GoogleSignInOptions.F(q);
    i = r;
  }
  
  public final GoogleSignInOptions a()
  {
    if (a.contains(GoogleSignInOptions.y))
    {
      HashSet localHashSet = a;
      Scope localScope = GoogleSignInOptions.x;
      if (localHashSet.contains(localScope)) {
        a.remove(localScope);
      }
    }
    if ((d) && ((f == null) || (!a.isEmpty()))) {
      a.add(GoogleSignInOptions.w);
    }
    return new GoogleSignInOptions(3, new ArrayList(a), f, d, b, c, e, g, h, i);
  }
  
  public final void b(Scope paramScope, Scope... paramVarArgs)
  {
    a.add(paramScope);
    a.addAll(Arrays.asList(paramVarArgs));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.GoogleSignInOptions.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */