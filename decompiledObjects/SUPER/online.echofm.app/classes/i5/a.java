package i5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.security.keystore.KeyGenParameterSpec.Builder;
import android.util.Base64;
import android.util.Log;
import j5.i;
import j5.m;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import s1.a.d;
import s1.a.e;
import s1.c;
import s1.c.a;

public class a
{
  public final String a = "SecureStorageAndroid";
  public final Charset b;
  public final Context c;
  public String d = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg";
  public Map e;
  public String f = "FlutterSecureStorage";
  public SharedPreferences g;
  public i h;
  public m i;
  public Boolean j = Boolean.FALSE;
  
  public a(Context paramContext)
  {
    c = paramContext.getApplicationContext();
    b = StandardCharsets.UTF_8;
  }
  
  public final void a(SharedPreferences paramSharedPreferences1, SharedPreferences paramSharedPreferences2)
  {
    try
    {
      Iterator localIterator = paramSharedPreferences1.getAll().entrySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject1 = (Map.Entry)localIterator.next();
        Object localObject2 = ((Map.Entry)localObject1).getValue();
        localObject1 = (String)((Map.Entry)localObject1).getKey();
        if (((localObject2 instanceof String)) && (((String)localObject1).contains(d)))
        {
          localObject2 = c((String)localObject2);
          paramSharedPreferences2.edit().putString((String)localObject1, (String)localObject2).apply();
          paramSharedPreferences1.edit().remove((String)localObject1).apply();
        }
      }
      label158:
      return;
    }
    catch (Exception paramSharedPreferences1)
    {
      break label158;
      paramSharedPreferences1 = paramSharedPreferences1.edit();
      i.d(paramSharedPreferences1);
      paramSharedPreferences1.apply();
      return;
      Log.e("SecureStorageAndroid", "Data migration failed", paramSharedPreferences1);
    }
  }
  
  public boolean b(String paramString)
  {
    f();
    return g.contains(paramString);
  }
  
  public final String c(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    paramString = Base64.decode(paramString, 0);
    return new String(h.b(paramString), b);
  }
  
  public void d(String paramString)
  {
    f();
    SharedPreferences.Editor localEditor = g.edit();
    localEditor.remove(paramString);
    localEditor.apply();
  }
  
  public void e()
  {
    f();
    SharedPreferences.Editor localEditor = g.edit();
    localEditor.clear();
    if (!h()) {
      i.f(localEditor);
    }
    localEditor.apply();
  }
  
  public final void f()
  {
    if ((e.containsKey("sharedPreferencesName")) && (!((String)e.get("sharedPreferencesName")).isEmpty())) {
      f = ((String)e.get("sharedPreferencesName"));
    }
    if ((e.containsKey("preferencesKeyPrefix")) && (!((String)e.get("preferencesKeyPrefix")).isEmpty())) {
      d = ((String)e.get("preferencesKeyPrefix"));
    }
    SharedPreferences localSharedPreferences1 = c.getSharedPreferences(f, 0);
    if (h == null) {
      try
      {
        i(localSharedPreferences1);
      }
      catch (Exception localException1)
      {
        Log.e("SecureStorageAndroid", "StorageCipher initialization failed", localException1);
      }
    }
    if (h()) {
      try
      {
        SharedPreferences localSharedPreferences2 = j(c);
        g = localSharedPreferences2;
        a(localSharedPreferences1, localSharedPreferences2);
      }
      catch (Exception localException2)
      {
        Log.e("SecureStorageAndroid", "EncryptedSharedPreferences initialization failed", localException2);
        g = localSharedPreferences1;
        j = Boolean.TRUE;
      }
    } else {
      g = localSharedPreferences1;
    }
  }
  
  public boolean g()
  {
    boolean bool;
    if ((e.containsKey("resetOnError")) && (e.get("resetOnError").equals("true"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean h()
  {
    boolean bool1 = j.booleanValue();
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    bool1 = bool2;
    if (e.containsKey("encryptedSharedPreferences"))
    {
      bool1 = bool2;
      if (e.get("encryptedSharedPreferences").equals("true")) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final void i(SharedPreferences paramSharedPreferences)
  {
    i = new m(paramSharedPreferences, e);
    if (h()) {}
    for (paramSharedPreferences = i.c(c);; paramSharedPreferences = i.a(c))
    {
      h = paramSharedPreferences;
      break;
      if (i.e())
      {
        k(i, paramSharedPreferences);
        break;
      }
    }
  }
  
  public final SharedPreferences j(Context paramContext)
  {
    c localc = new c.a(paramContext).b(new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setEncryptionPaddings(new String[] { "NoPadding" }).setBlockModes(new String[] { "GCM" }).setKeySize(256).build()).a();
    return s1.a.a(paramContext, f, localc, a.d.p, a.e.p);
  }
  
  public final void k(m paramm, SharedPreferences paramSharedPreferences)
  {
    try
    {
      h = paramm.c(c);
      Object localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>();
      Iterator localIterator = paramSharedPreferences.getAll().entrySet().iterator();
      Object localObject3;
      while (localIterator.hasNext())
      {
        Object localObject2 = (Map.Entry)localIterator.next();
        localObject3 = ((Map.Entry)localObject2).getValue();
        localObject2 = (String)((Map.Entry)localObject2).getKey();
        if (((localObject3 instanceof String)) && (((String)localObject2).contains(d))) {
          ((Map)localObject1).put(localObject2, c((String)localObject3));
        }
      }
      label245:
      return;
    }
    catch (Exception paramSharedPreferences)
    {
      break label245;
      h = paramm.a(c);
      paramSharedPreferences = paramSharedPreferences.edit();
      localIterator = ((Map)localObject1).entrySet().iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (Map.Entry)localIterator.next();
        localObject3 = h.a(((String)((Map.Entry)localObject1).getValue()).getBytes(b));
        paramSharedPreferences.putString((String)((Map.Entry)localObject1).getKey(), Base64.encodeToString((byte[])localObject3, 0));
      }
      paramm.f(paramSharedPreferences);
      paramSharedPreferences.apply();
      return;
      Log.e("SecureStorageAndroid", "re-encryption failed", paramSharedPreferences);
      h = paramm.c(c);
    }
  }
  
  public String l(String paramString)
  {
    f();
    paramString = g.getString(paramString, null);
    if (h()) {
      return paramString;
    }
    return c(paramString);
  }
  
  public Map m()
  {
    f();
    Object localObject1 = g.getAll();
    HashMap localHashMap = new HashMap();
    Iterator localIterator = ((Map)localObject1).entrySet().iterator();
    while (localIterator.hasNext())
    {
      localObject1 = (Map.Entry)localIterator.next();
      if (((String)((Map.Entry)localObject1).getKey()).contains(d))
      {
        String str = (String)((Map.Entry)localObject1).getKey();
        Object localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append(d);
        ((StringBuilder)localObject2).append('_');
        localObject2 = str.replaceFirst(((StringBuilder)localObject2).toString(), "");
        boolean bool = h();
        localObject1 = (String)((Map.Entry)localObject1).getValue();
        if (bool) {}
        for (;;)
        {
          localHashMap.put(localObject2, localObject1);
          break;
          localObject1 = c((String)localObject1);
        }
      }
    }
    return localHashMap;
  }
  
  public void n(String paramString1, String paramString2)
  {
    f();
    SharedPreferences.Editor localEditor = g.edit();
    if (h()) {}
    for (;;)
    {
      localEditor.putString(paramString1, paramString2);
      break;
      paramString2 = Base64.encodeToString(h.a(paramString2.getBytes(b)), 0);
    }
    localEditor.apply();
  }
}

/* Location:
 * Qualified Name:     i5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */