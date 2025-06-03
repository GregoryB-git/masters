package y1;

import O1.P;
import T1.a;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import x1.B;
import z1.d;
import z1.d.a;

public final class L
{
  public static final L a = new L();
  public static final String b = L.class.getSimpleName();
  public static SharedPreferences c;
  public static final AtomicBoolean d = new AtomicBoolean(false);
  public static final ConcurrentHashMap e = new ConcurrentHashMap();
  public static final ConcurrentHashMap f = new ConcurrentHashMap();
  
  public static final void d()
  {
    if (a.d(L.class)) {
      return;
    }
    try
    {
      Executor localExecutor = F.b.b();
      J localJ = new y1/J;
      localJ.<init>();
      localExecutor.execute(localJ);
      return;
    }
    finally
    {
      a.b(localThrowable, L.class);
    }
  }
  
  public static final void e()
  {
    if (a.d(L.class)) {
      return;
    }
    try
    {
      if (!d.get())
      {
        Log.w(b, "initStore should have been called before calling setUserData");
        a.h();
      }
    }
    finally
    {
      break label81;
    }
    e.clear();
    SharedPreferences localSharedPreferences = c;
    if (localSharedPreferences != null)
    {
      localSharedPreferences.edit().putString("com.facebook.appevents.UserDataStore.userData", null).apply();
      return;
    }
    Intrinsics.n("sharedPreferences");
    throw null;
    label81:
    a.b(localSharedPreferences, L.class);
  }
  
  public static final String f()
  {
    if (a.d(L.class)) {
      return null;
    }
    try
    {
      if (!d.get()) {
        a.h();
      }
    }
    finally
    {
      break label68;
    }
    Object localObject2 = new java/util/HashMap;
    ((HashMap)localObject2).<init>();
    ((Map)localObject2).putAll(e);
    ((Map)localObject2).putAll(a.g());
    localObject2 = P.l0((Map)localObject2);
    return (String)localObject2;
    label68:
    a.b((Throwable)localObject2, L.class);
    return null;
  }
  
  public static final void i()
  {
    if (a.d(L.class)) {
      return;
    }
    try
    {
      if (d.get()) {
        return;
      }
      a.h();
      return;
    }
    finally
    {
      a.b(localThrowable, L.class);
    }
  }
  
  public static final void l(Map paramMap)
  {
    if (a.d(L.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramMap, "ud");
      if (!d.get()) {
        a.h();
      }
    }
    finally
    {
      break label518;
    }
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      String str1 = (String)paramMap.getKey();
      paramMap = (String)paramMap.getValue();
      localObject = P.a;
      localObject = a;
      int i = paramMap.length();
      int j = 1;
      int k = i - 1;
      i = 0;
      int m = i;
      while (i <= k)
      {
        int n;
        if (m == 0) {
          n = i;
        } else {
          n = k;
        }
        if (Intrinsics.d(paramMap.charAt(n), 32) <= 0) {
          n = 1;
        } else {
          n = 0;
        }
        if (m == 0)
        {
          if (n == 0) {
            m = 1;
          } else {
            i++;
          }
        }
        else
        {
          if (n == 0) {
            break;
          }
          k--;
        }
      }
      String str2 = P.F0(((L)localObject).k(str1, paramMap.subSequence(i, k + 1).toString()));
      paramMap = f;
      if (paramMap.containsKey(str1))
      {
        String str3 = (String)paramMap.get(str1);
        paramMap = null;
        if (str3 != null)
        {
          localObject = new kotlin/text/Regex;
          ((Regex)localObject).<init>(",");
          localObject = ((Regex)localObject).c(str3, 0);
          if (localObject != null)
          {
            paramMap = ((Collection)localObject).toArray(new String[0]);
            if (paramMap == null) {
              break label470;
            }
            paramMap = (String[])paramMap;
          }
        }
        localObject = paramMap;
        if (paramMap == null) {
          localObject = new String[0];
        }
        paramMap = W5.I.d(Arrays.copyOf((Object[])localObject, localObject.length));
        if (paramMap.contains(str2)) {
          return;
        }
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        if (localObject.length == 0) {}
        for (;;)
        {
          localStringBuilder.append(str2);
          break label445;
          i = j;
          if (localObject.length >= 5) {
            break;
          }
          localStringBuilder.append(str3);
          localStringBuilder.append(",");
        }
        for (;;)
        {
          k = i + 1;
          localStringBuilder.append(localObject[i]);
          localStringBuilder.append(",");
          if (k >= 5)
          {
            localStringBuilder.append(str2);
            paramMap.remove(localObject[0]);
            label445:
            f.put(str1, localStringBuilder.toString());
            break;
          }
          i = k;
        }
        label470:
        paramMap = new java/lang/NullPointerException;
        paramMap.<init>("null cannot be cast to non-null type kotlin.Array<T>");
        throw paramMap;
      }
      paramMap.put(str1, str2);
    }
    Object localObject = a;
    paramMap = P.a;
    ((L)localObject).q("com.facebook.appevents.UserDataStore.internalUserData", P.l0(f));
    return;
    label518:
    a.b(paramMap, L.class);
  }
  
  public static final void m(Bundle paramBundle)
  {
    if (a.d(L.class)) {
      return;
    }
    try
    {
      Executor localExecutor = F.b.b();
      I localI = new y1/I;
      localI.<init>(paramBundle);
      localExecutor.execute(localI);
      return;
    }
    finally
    {
      a.b(paramBundle, L.class);
    }
  }
  
  public static final void n(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10)
  {
    if (a.d(L.class)) {
      return;
    }
    Bundle localBundle;
    try
    {
      localBundle = new android/os/Bundle;
      localBundle.<init>();
      if (paramString1 != null) {
        localBundle.putString("em", paramString1);
      }
    }
    finally
    {
      break label174;
    }
    if (paramString2 != null) {
      localBundle.putString("fn", paramString2);
    }
    if (paramString3 != null) {
      localBundle.putString("ln", paramString3);
    }
    if (paramString4 != null) {
      localBundle.putString("ph", paramString4);
    }
    if (paramString5 != null) {
      localBundle.putString("db", paramString5);
    }
    if (paramString6 != null) {
      localBundle.putString("ge", paramString6);
    }
    if (paramString7 != null) {
      localBundle.putString("ct", paramString7);
    }
    if (paramString8 != null) {
      localBundle.putString("st", paramString8);
    }
    if (paramString9 != null) {
      localBundle.putString("zp", paramString9);
    }
    if (paramString10 != null) {
      localBundle.putString("country", paramString10);
    }
    m(localBundle);
    return;
    label174:
    a.b(paramString1, L.class);
  }
  
  public static final void o(Bundle paramBundle)
  {
    if (a.d(L.class)) {
      return;
    }
    try
    {
      if (!d.get())
      {
        Log.w(b, "initStore should have been called before calling setUserData");
        a.h();
      }
    }
    finally
    {
      break label79;
    }
    L localL = a;
    localL.p(paramBundle);
    paramBundle = P.a;
    localL.q("com.facebook.appevents.UserDataStore.userData", P.l0(e));
    localL.q("com.facebook.appevents.UserDataStore.internalUserData", P.l0(f));
    return;
    label79:
    a.b(paramBundle, L.class);
  }
  
  public static final void r(String paramString1, String paramString2)
  {
    if (a.d(L.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramString1, "$key");
      Intrinsics.checkNotNullParameter(paramString2, "$value");
      if (!d.get()) {
        a.h();
      }
    }
    finally
    {
      break label79;
    }
    SharedPreferences localSharedPreferences = c;
    if (localSharedPreferences != null)
    {
      localSharedPreferences.edit().putString(paramString1, paramString2).apply();
      return;
    }
    Intrinsics.n("sharedPreferences");
    throw null;
    label79:
    a.b(paramString1, L.class);
  }
  
  public final Map g()
  {
    if (a.d(this)) {
      return null;
    }
    try
    {
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      Set localSet = d.d.b();
      Iterator localIterator = f.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (localSet.contains(str)) {
          localHashMap.put(str, f.get(str));
        }
      }
      label95:
      return null;
    }
    finally
    {
      break label95;
      return localMap;
      a.b(localMap, this);
    }
  }
  
  public final void h()
  {
    label159:
    label166:
    try
    {
      boolean bool = a.d(this);
      if (bool) {
        return;
      }
      AtomicBoolean localAtomicBoolean;
      try
      {
        localAtomicBoolean = d;
        bool = localAtomicBoolean.get();
        if (bool) {
          return;
        }
        Object localObject1 = PreferenceManager.getDefaultSharedPreferences(B.l());
        Intrinsics.checkNotNullExpressionValue(localObject1, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
        c = (SharedPreferences)localObject1;
        if (localObject1 == null) {
          break label159;
        }
        localObject3 = ((SharedPreferences)localObject1).getString("com.facebook.appevents.UserDataStore.userData", "");
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = "";
        }
      }
      finally
      {
        break label166;
      }
      Object localObject3 = c;
      if (localObject3 != null)
      {
        String str2 = ((SharedPreferences)localObject3).getString("com.facebook.appevents.UserDataStore.internalUserData", "");
        localObject3 = str2;
        if (str2 == null) {
          localObject3 = "";
        }
        e.putAll(P.h0(str1));
        f.putAll(P.h0((String)localObject3));
        localAtomicBoolean.set(true);
        return;
      }
      Intrinsics.n("sharedPreferences");
      throw null;
    }
    finally {}
    Intrinsics.n("sharedPreferences");
    throw null;
    a.b(str1, this);
  }
  
  public final boolean j(String paramString)
  {
    if (a.d(this)) {
      return false;
    }
    try
    {
      Regex localRegex = new kotlin/text/Regex;
      localRegex.<init>("[A-Fa-f0-9]{64}");
      boolean bool = localRegex.b(paramString);
      return bool;
    }
    finally
    {
      a.b(paramString, this);
    }
    return false;
  }
  
  public final String k(String paramString1, String paramString2)
  {
    if (a.d(this)) {
      return null;
    }
    try
    {
      int i = paramString2.length() - 1;
      int j = 0;
      int k = j;
      while (j <= i)
      {
        int m;
        if (k == 0) {
          m = j;
        } else {
          m = i;
        }
        if (Intrinsics.d(paramString2.charAt(m), 32) <= 0) {
          m = 1;
        } else {
          m = 0;
        }
        if (k == 0)
        {
          if (m == 0) {
            k = 1;
          } else {
            j++;
          }
        }
        else
        {
          if (m == 0) {
            break;
          }
          i--;
        }
      }
      String str;
      boolean bool;
      label345:
      return null;
    }
    finally
    {
      break label345;
      paramString2 = paramString2.subSequence(j, i + 1).toString();
      if (paramString2 != null)
      {
        str = paramString2.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.String).toLowerCase()");
        bool = Intrinsics.a("em", paramString1);
        paramString2 = "";
        if (bool)
        {
          if (Patterns.EMAIL_ADDRESS.matcher(str).matches())
          {
            paramString1 = str;
          }
          else
          {
            Log.e(b, "Setting email failure: this is not a valid email address");
            paramString1 = "";
          }
          return paramString1;
        }
        if (Intrinsics.a("ph", paramString1))
        {
          paramString1 = new kotlin/text/Regex;
          paramString1.<init>("[^0-9]");
          return paramString1.replace(str, "");
        }
        if (Intrinsics.a("ge", paramString1))
        {
          if (str.length() > 0)
          {
            if (str != null)
            {
              paramString1 = str.substring(0, 1);
              Intrinsics.checkNotNullExpressionValue(paramString1, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            else
            {
              paramString1 = new java/lang/NullPointerException;
              paramString1.<init>("null cannot be cast to non-null type java.lang.String");
              throw paramString1;
            }
          }
          else {
            paramString1 = "";
          }
          if ((!Intrinsics.a("f", paramString1)) && (!Intrinsics.a("m", paramString1)))
          {
            Log.e(b, "Setting gender failure: the supported value for gender is f or m");
            paramString1 = paramString2;
          }
          return paramString1;
        }
        return str;
      }
      paramString1 = new java/lang/NullPointerException;
      paramString1.<init>("null cannot be cast to non-null type java.lang.String");
      throw paramString1;
      a.b(paramString1, this);
    }
  }
  
  public final void p(Bundle paramBundle)
  {
    if (a.d(this)) {
      return;
    }
    if (paramBundle == null) {
      return;
    }
    try
    {
      Iterator localIterator = paramBundle.keySet().iterator();
      for (;;)
      {
        if (!localIterator.hasNext()) {
          break label166;
        }
        str = (String)localIterator.next();
        localObject1 = paramBundle.get(str);
        if (localObject1 != null)
        {
          localObject1 = localObject1.toString();
          if (!j((String)localObject1)) {
            break label129;
          }
          localObject2 = e;
          if (localObject1 == null) {
            break;
          }
          localObject1 = ((String)localObject1).toLowerCase();
          Intrinsics.checkNotNullExpressionValue(localObject1, "(this as java.lang.String).toLowerCase()");
          ((Map)localObject2).put(str, localObject1);
        }
      }
    }
    finally
    {
      for (;;)
      {
        String str;
        break;
        paramBundle = new java/lang/NullPointerException;
        paramBundle.<init>("null cannot be cast to non-null type java.lang.String");
        throw paramBundle;
        label129:
        Object localObject2 = P.a;
        Intrinsics.checkNotNullExpressionValue(str, "key");
        Object localObject1 = P.F0(k(str, (String)localObject1));
        if (localObject1 != null)
        {
          localObject2 = e;
          continue;
          label166:
          return;
        }
      }
      a.b(paramBundle, this);
    }
  }
  
  public final void q(String paramString1, String paramString2)
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      Executor localExecutor = B.t();
      K localK = new y1/K;
      localK.<init>(paramString1, paramString2);
      localExecutor.execute(localK);
      return;
    }
    finally
    {
      a.b(paramString1, this);
    }
  }
}

/* Location:
 * Qualified Name:     y1.L
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */