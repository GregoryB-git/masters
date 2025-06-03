package h6;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.internal.auth_api.zbat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import k6.e.a;
import k6.e.b;

public final class f
  extends c
{
  public final GoogleSignInOptions a;
  
  public f(Context paramContext, Looper paramLooper, m6.a parama, GoogleSignInOptions paramGoogleSignInOptions, e.a parama1, e.b paramb)
  {
    super(paramContext, paramLooper, 91, parama, parama1, paramb);
    boolean bool1;
    boolean bool2;
    boolean bool3;
    if (paramGoogleSignInOptions != null)
    {
      new HashSet();
      new HashMap();
      localObject = new HashSet(b);
      bool1 = e;
      bool2 = f;
      bool3 = d;
      paramContext = o;
      paramb = c;
      parama1 = p;
      paramLooper = GoogleSignInOptions.F(q);
      paramGoogleSignInOptions = (GoogleSignInOptions)localObject;
    }
    else
    {
      paramGoogleSignInOptions = new HashSet();
      paramLooper = new HashMap();
      paramb = null;
      paramContext = paramb;
      parama1 = paramContext;
      bool3 = false;
      bool2 = bool3;
      bool1 = bool2;
    }
    Object localObject = zbat.zba();
    if (!c.isEmpty())
    {
      parama = c.iterator();
      while (parama.hasNext())
      {
        paramGoogleSignInOptions.add((Scope)parama.next());
        paramGoogleSignInOptions.addAll(Arrays.asList(new Scope[0]));
      }
    }
    if (paramGoogleSignInOptions.contains(GoogleSignInOptions.y))
    {
      parama = GoogleSignInOptions.x;
      if (paramGoogleSignInOptions.contains(parama)) {
        paramGoogleSignInOptions.remove(parama);
      }
    }
    if ((bool3) && ((paramb == null) || (!paramGoogleSignInOptions.isEmpty()))) {
      paramGoogleSignInOptions.add(GoogleSignInOptions.w);
    }
    a = new GoogleSignInOptions(3, new ArrayList(paramGoogleSignInOptions), paramb, bool3, bool1, bool2, paramContext, parama1, paramLooper, (String)localObject);
  }
  
  public final int getMinApkVersion()
  {
    return 12451000;
  }
  
  public final String getServiceDescriptor()
  {
    return "com.google.android.gms.auth.api.signin.internal.ISignInService";
  }
  
  public final Intent getSignInIntent()
  {
    return n.a(getContext(), a);
  }
  
  public final String getStartServiceAction()
  {
    return "com.google.android.gms.auth.api.signin.service.START";
  }
  
  public final boolean providesSignIn()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     h6.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */