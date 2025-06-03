package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import b.z;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g6.e;
import g6.f;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k6.a.d;
import m6.j;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
public class GoogleSignInOptions
  extends n6.a
  implements a.d, ReflectedParcelable
{
  public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new f();
  public static final GoogleSignInOptions t;
  public static final GoogleSignInOptions u;
  public static final Scope v;
  public static final Scope w;
  public static final Scope x;
  public static final Scope y;
  public static final e z = new e(0);
  public final int a;
  public final ArrayList b;
  public Account c;
  public boolean d;
  public final boolean e;
  public final boolean f;
  public String o;
  public String p;
  public ArrayList q;
  public String r;
  public Map s;
  
  static
  {
    Scope localScope1 = new Scope(1, "profile");
    v = new Scope(1, "email");
    Scope localScope2 = new Scope(1, "openid");
    w = localScope2;
    Scope localScope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
    x = localScope3;
    y = new Scope(1, "https://www.googleapis.com/auth/games");
    HashSet localHashSet = new HashSet();
    HashMap localHashMap = new HashMap();
    localHashSet.add(localScope2);
    localHashSet.add(localScope1);
    if (localHashSet.contains(y))
    {
      localScope2 = x;
      if (localHashSet.contains(localScope2)) {
        localHashSet.remove(localScope2);
      }
    }
    t = new GoogleSignInOptions(3, new ArrayList(localHashSet), null, false, false, false, null, null, localHashMap, null);
    localHashSet = new HashSet();
    localHashMap = new HashMap();
    localHashSet.add(localScope3);
    localHashSet.addAll(Arrays.asList(new Scope[0]));
    if (localHashSet.contains(y))
    {
      localScope3 = x;
      if (localHashSet.contains(localScope3)) {
        localHashSet.remove(localScope3);
      }
    }
    u = new GoogleSignInOptions(3, new ArrayList(localHashSet), null, false, false, false, null, null, localHashMap, null);
  }
  
  public GoogleSignInOptions(int paramInt, ArrayList paramArrayList, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2, Map paramMap, String paramString3)
  {
    a = paramInt;
    b = paramArrayList;
    c = paramAccount;
    d = paramBoolean1;
    e = paramBoolean2;
    f = paramBoolean3;
    o = paramString1;
    p = paramString2;
    q = new ArrayList(paramMap.values());
    s = paramMap;
    r = paramString3;
  }
  
  public static GoogleSignInOptions E(String paramString)
  {
    boolean bool1 = TextUtils.isEmpty(paramString);
    String str = null;
    if (bool1) {
      return null;
    }
    JSONObject localJSONObject = new JSONObject(paramString);
    Object localObject = new HashSet();
    paramString = localJSONObject.getJSONArray("scopes");
    int i = paramString.length();
    for (int j = 0; j < i; j++) {
      ((HashSet)localObject).add(new Scope(1, paramString.getString(j)));
    }
    if (localJSONObject.has("accountName")) {
      paramString = localJSONObject.optString("accountName");
    } else {
      paramString = null;
    }
    if (!TextUtils.isEmpty(paramString)) {
      paramString = new Account(paramString, "com.google");
    } else {
      paramString = null;
    }
    ArrayList localArrayList = new ArrayList((Collection)localObject);
    bool1 = localJSONObject.getBoolean("idTokenRequested");
    boolean bool2 = localJSONObject.getBoolean("serverAuthRequested");
    boolean bool3 = localJSONObject.getBoolean("forceCodeForRefreshToken");
    if (localJSONObject.has("serverClientId")) {
      localObject = localJSONObject.optString("serverClientId");
    } else {
      localObject = null;
    }
    if (localJSONObject.has("hostedDomain")) {
      str = localJSONObject.optString("hostedDomain");
    }
    return new GoogleSignInOptions(3, localArrayList, paramString, bool1, bool2, bool3, (String)localObject, str, new HashMap(), null);
  }
  
  public static HashMap F(ArrayList paramArrayList)
  {
    HashMap localHashMap = new HashMap();
    if (paramArrayList != null)
    {
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        h6.a locala = (h6.a)paramArrayList.next();
        localHashMap.put(Integer.valueOf(b), locala);
      }
    }
    return localHashMap;
  }
  
  public final ArrayList<Scope> D()
  {
    return new ArrayList(b);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    try
    {
      GoogleSignInOptions localGoogleSignInOptions = (GoogleSignInOptions)paramObject;
      if ((q.isEmpty()) && (q.isEmpty()) && (b.size() == localGoogleSignInOptions.D().size()) && (b.containsAll(localGoogleSignInOptions.D())))
      {
        paramObject = c;
        if ((paramObject == null ? c == null : ((Account)paramObject).equals(c)) && (TextUtils.isEmpty(o) ? TextUtils.isEmpty(o) : o.equals(o)) && (f == f) && (d == d) && (e == e))
        {
          boolean bool = TextUtils.equals(r, r);
          if (bool) {
            return true;
          }
        }
      }
    }
    catch (ClassCastException paramObject)
    {
      for (;;) {}
    }
    return false;
  }
  
  public final int hashCode()
  {
    Object localObject = new ArrayList();
    ArrayList localArrayList = b;
    int i = localArrayList.size();
    int j = 0;
    for (int k = 0; k < i; k++) {
      ((ArrayList)localObject).add(getb);
    }
    Collections.sort((List)localObject);
    int m = localObject.hashCode();
    localObject = c;
    if (localObject == null) {
      k = 0;
    } else {
      k = localObject.hashCode();
    }
    localObject = o;
    if (localObject == null) {
      i = 0;
    } else {
      i = localObject.hashCode();
    }
    int n = f;
    int i1 = d;
    int i2 = e;
    localObject = r;
    if (localObject != null) {
      j = localObject.hashCode();
    }
    return ((((((m + 1 * 31) * 31 + k) * 31 + i) * 31 + n) * 31 + i1) * 31 + i2) * 31 + j;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = a;
    int j = z.J(20293, paramParcel);
    z.z(paramParcel, 1, i);
    z.I(paramParcel, 2, D(), false);
    z.E(paramParcel, 3, c, paramInt, false);
    z.t(paramParcel, 4, d);
    z.t(paramParcel, 5, e);
    z.t(paramParcel, 6, f);
    z.F(paramParcel, 7, o, false);
    z.F(paramParcel, 8, p, false);
    z.I(paramParcel, 9, q, false);
    z.F(paramParcel, 10, r, false);
    z.L(j, paramParcel);
  }
  
  public static final class a
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
    
    public a(GoogleSignInOptions paramGoogleSignInOptions)
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
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.GoogleSignInOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */