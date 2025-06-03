package s1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.util.Pair;
import c3.l;
import c3.m;
import c3.n;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a
  implements SharedPreferences
{
  public final SharedPreferences a;
  public final CopyOnWriteArrayList b;
  public final String c;
  public final String d;
  public final c3.a e;
  public final c3.e f;
  
  public a(String paramString1, String paramString2, SharedPreferences paramSharedPreferences, c3.a parama, c3.e parame)
  {
    c = paramString1;
    a = paramSharedPreferences;
    d = paramString2;
    e = parama;
    f = parame;
    b = new CopyOnWriteArrayList();
  }
  
  public static SharedPreferences a(Context paramContext, String paramString, c paramc, d paramd, e parame)
  {
    return b(paramString, paramc.a(), paramContext, paramd, parame);
  }
  
  public static SharedPreferences b(String paramString1, String paramString2, Context paramContext, d paramd, e parame)
  {
    i3.b.a();
    d3.a.b();
    paramContext = paramContext.getApplicationContext();
    paramd = new j3.a.b().l(paramd.e()).n(paramContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", paramString1);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("android-keystore://");
    ((StringBuilder)localObject).append(paramString2);
    paramd = paramd.m(((StringBuilder)localObject).toString()).f().d();
    localObject = new j3.a.b().l(parame.e()).n(paramContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", paramString1);
    parame = new StringBuilder();
    parame.append("android-keystore://");
    parame.append(paramString2);
    parame = ((j3.a.b)localObject).m(parame.toString()).f().d();
    paramd = (c3.e)paramd.k(c3.e.class);
    parame = (c3.a)parame.k(c3.a.class);
    return new a(paramString1, paramString2, paramContext.getSharedPreferences(paramString1, 0), parame, paramd);
  }
  
  public String c(String paramString)
  {
    try
    {
      byte[] arrayOfByte = f.b(q3.e.a(paramString, 0), c.getBytes());
      paramString = new java/lang/String;
      paramString.<init>(arrayOfByte, StandardCharsets.UTF_8);
      boolean bool = paramString.equals("__NULL__");
      if (bool) {
        paramString = null;
      }
      return paramString;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      paramString = new StringBuilder();
      paramString.append("Could not decrypt key. ");
      paramString.append(localGeneralSecurityException.getMessage());
      throw new SecurityException(paramString.toString(), localGeneralSecurityException);
    }
  }
  
  public boolean contains(String paramString)
  {
    if (!g(paramString))
    {
      paramString = d(paramString);
      return a.contains(paramString);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(" is a reserved key for the encryption keyset.");
    throw new SecurityException(localStringBuilder.toString());
  }
  
  public String d(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "__NULL__";
    }
    try
    {
      paramString = q3.e.d(f.a(str.getBytes(StandardCharsets.UTF_8), c.getBytes()));
      return paramString;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      paramString = new StringBuilder();
      paramString.append("Could not encrypt key. ");
      paramString.append(localGeneralSecurityException.getMessage());
      throw new SecurityException(paramString.toString(), localGeneralSecurityException);
    }
  }
  
  public Pair e(String paramString, byte[] paramArrayOfByte)
  {
    paramString = d(paramString);
    return new Pair(paramString, q3.e.d(e.a(paramArrayOfByte, paramString.getBytes(StandardCharsets.UTF_8))));
  }
  
  public SharedPreferences.Editor edit()
  {
    return new b(this, a.edit());
  }
  
  public final Object f(String paramString)
  {
    if (!g(paramString))
    {
      Object localObject1 = paramString;
      if (paramString == null) {
        localObject1 = "__NULL__";
      }
      try
      {
        localObject1 = d((String)localObject1);
        paramString = a.getString((String)localObject1, null);
        if (paramString == null) {
          return null;
        }
        bool = false;
        localObject2 = q3.e.a(paramString, 0);
        c3.a locala = e;
        paramString = StandardCharsets.UTF_8;
        localObject1 = ByteBuffer.wrap(locala.b((byte[])localObject2, ((String)localObject1).getBytes(paramString)));
        ((ByteBuffer)localObject1).position(0);
        i = ((ByteBuffer)localObject1).getInt();
        localObject2 = c.e(i);
        if (localObject2 != null) {
          switch (a.a[localObject2.ordinal()])
          {
          default: 
            localObject1 = new java/lang/SecurityException;
            paramString = new java/lang/StringBuilder;
            paramString.<init>();
            paramString.append("Unhandled type for encrypted pref value: ");
            paramString.append(localObject2);
            ((SecurityException)localObject1).<init>(paramString.toString());
            throw ((Throwable)localObject1);
          }
        }
      }
      catch (GeneralSecurityException localGeneralSecurityException)
      {
        boolean bool;
        break label399;
        Object localObject2 = new t/b;
        ((t.b)localObject2).<init>();
        while (localGeneralSecurityException.hasRemaining())
        {
          i = localGeneralSecurityException.getInt();
          paramString = localGeneralSecurityException.slice();
          paramString.limit(i);
          localGeneralSecurityException.position(localGeneralSecurityException.position() + i);
          ((t.b)localObject2).add(StandardCharsets.UTF_8.decode(paramString).toString());
        }
        if ((((t.b)localObject2).size() == 1) && ("__NULL__".equals(((t.b)localObject2).s(0)))) {
          return null;
        }
        return localObject2;
        if (localGeneralSecurityException.get() != 0) {
          bool = true;
        }
        return Boolean.valueOf(bool);
        return Float.valueOf(localGeneralSecurityException.getFloat());
        return Long.valueOf(localGeneralSecurityException.getLong());
        return Integer.valueOf(localGeneralSecurityException.getInt());
        int i = localGeneralSecurityException.getInt();
        localObject2 = localGeneralSecurityException.slice();
        localGeneralSecurityException.limit(i);
        paramString = paramString.decode((ByteBuffer)localObject2).toString();
        if (paramString.equals("__NULL__")) {
          return null;
        }
        return paramString;
        paramString = new java/lang/SecurityException;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Unknown type ID for encrypted pref value: ");
        localStringBuilder.append(i);
        paramString.<init>(localStringBuilder.toString());
        throw paramString;
        label399:
        paramString = new StringBuilder();
        paramString.append("Could not decrypt value. ");
        paramString.append(localStringBuilder.getMessage());
        throw new SecurityException(paramString.toString(), localStringBuilder);
      }
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(" is a reserved key for the encryption keyset.");
    throw new SecurityException(localStringBuilder.toString());
  }
  
  public boolean g(String paramString)
  {
    boolean bool;
    if ((!"__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(paramString)) && (!"__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(paramString))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public Map getAll()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = a.getAll().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      if (!g((String)((Map.Entry)localObject).getKey()))
      {
        localObject = c((String)((Map.Entry)localObject).getKey());
        localHashMap.put(localObject, f((String)localObject));
      }
    }
    return localHashMap;
  }
  
  public boolean getBoolean(String paramString, boolean paramBoolean)
  {
    paramString = f(paramString);
    if ((paramString instanceof Boolean)) {
      paramBoolean = ((Boolean)paramString).booleanValue();
    }
    return paramBoolean;
  }
  
  public float getFloat(String paramString, float paramFloat)
  {
    paramString = f(paramString);
    if ((paramString instanceof Float)) {
      paramFloat = ((Float)paramString).floatValue();
    }
    return paramFloat;
  }
  
  public int getInt(String paramString, int paramInt)
  {
    paramString = f(paramString);
    if ((paramString instanceof Integer)) {
      paramInt = ((Integer)paramString).intValue();
    }
    return paramInt;
  }
  
  public long getLong(String paramString, long paramLong)
  {
    paramString = f(paramString);
    if ((paramString instanceof Long)) {
      paramLong = ((Long)paramString).longValue();
    }
    return paramLong;
  }
  
  public String getString(String paramString1, String paramString2)
  {
    paramString1 = f(paramString1);
    if ((paramString1 instanceof String)) {
      paramString2 = (String)paramString1;
    }
    return paramString2;
  }
  
  public Set getStringSet(String paramString, Set paramSet)
  {
    paramString = f(paramString);
    if ((paramString instanceof Set)) {
      paramString = (Set)paramString;
    } else {
      paramString = new t.b();
    }
    if (paramString.size() > 0) {
      paramSet = paramString;
    }
    return paramSet;
  }
  
  public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    b.add(paramOnSharedPreferenceChangeListener);
  }
  
  public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    b.remove(paramOnSharedPreferenceChangeListener);
  }
  
  public static final class b
    implements SharedPreferences.Editor
  {
    public final a a;
    public final SharedPreferences.Editor b;
    public final List c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    
    public b(a parama, SharedPreferences.Editor paramEditor)
    {
      a = parama;
      b = paramEditor;
      c = new CopyOnWriteArrayList();
    }
    
    public final void a()
    {
      if (d.getAndSet(false))
      {
        Iterator localIterator = a.getAll().keySet().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          if ((!c.contains(str)) && (!a.g(str))) {
            b.remove(a.d(str));
          }
        }
      }
    }
    
    public void apply()
    {
      a();
      b.apply();
      b();
      c.clear();
    }
    
    public final void b()
    {
      Iterator localIterator1 = a.b.iterator();
      while (localIterator1.hasNext())
      {
        SharedPreferences.OnSharedPreferenceChangeListener localOnSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener)localIterator1.next();
        Iterator localIterator2 = c.iterator();
        while (localIterator2.hasNext())
        {
          String str = (String)localIterator2.next();
          localOnSharedPreferenceChangeListener.onSharedPreferenceChanged(a, str);
        }
      }
    }
    
    public final void c(String paramString, byte[] paramArrayOfByte)
    {
      if (!a.g(paramString))
      {
        c.add(paramString);
        String str = paramString;
        if (paramString == null) {
          str = "__NULL__";
        }
        try
        {
          paramString = a.e(str, paramArrayOfByte);
          b.putString((String)first, (String)second);
          return;
        }
        catch (GeneralSecurityException paramString)
        {
          paramArrayOfByte = new StringBuilder();
          paramArrayOfByte.append("Could not encrypt data: ");
          paramArrayOfByte.append(paramString.getMessage());
          throw new SecurityException(paramArrayOfByte.toString(), paramString);
        }
      }
      paramArrayOfByte = new StringBuilder();
      paramArrayOfByte.append(paramString);
      paramArrayOfByte.append(" is a reserved key for the encryption keyset.");
      throw new SecurityException(paramArrayOfByte.toString());
    }
    
    public SharedPreferences.Editor clear()
    {
      d.set(true);
      return this;
    }
    
    public boolean commit()
    {
      a();
      try
      {
        boolean bool = b.commit();
        return bool;
      }
      finally
      {
        b();
        c.clear();
      }
    }
    
    public SharedPreferences.Editor putBoolean(String paramString, boolean paramBoolean)
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocate(5);
      localByteBuffer.putInt(a.c.u.h());
      localByteBuffer.put(paramBoolean);
      c(paramString, localByteBuffer.array());
      return this;
    }
    
    public SharedPreferences.Editor putFloat(String paramString, float paramFloat)
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
      localByteBuffer.putInt(a.c.t.h());
      localByteBuffer.putFloat(paramFloat);
      c(paramString, localByteBuffer.array());
      return this;
    }
    
    public SharedPreferences.Editor putInt(String paramString, int paramInt)
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
      localByteBuffer.putInt(a.c.r.h());
      localByteBuffer.putInt(paramInt);
      c(paramString, localByteBuffer.array());
      return this;
    }
    
    public SharedPreferences.Editor putLong(String paramString, long paramLong)
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocate(12);
      localByteBuffer.putInt(a.c.s.h());
      localByteBuffer.putLong(paramLong);
      c(paramString, localByteBuffer.array());
      return this;
    }
    
    public SharedPreferences.Editor putString(String paramString1, String paramString2)
    {
      Object localObject = paramString2;
      if (paramString2 == null) {
        localObject = "__NULL__";
      }
      paramString2 = ((String)localObject).getBytes(StandardCharsets.UTF_8);
      int i = paramString2.length;
      localObject = ByteBuffer.allocate(i + 8);
      ((ByteBuffer)localObject).putInt(a.c.p.h());
      ((ByteBuffer)localObject).putInt(i);
      ((ByteBuffer)localObject).put(paramString2);
      c(paramString1, ((ByteBuffer)localObject).array());
      return this;
    }
    
    public SharedPreferences.Editor putStringSet(String paramString, Set paramSet)
    {
      Object localObject = paramSet;
      if (paramSet == null)
      {
        localObject = new t.b();
        ((Set)localObject).add("__NULL__");
      }
      paramSet = new ArrayList(((Set)localObject).size());
      int i = ((Set)localObject).size() * 4;
      Iterator localIterator = ((Set)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = ((String)localIterator.next()).getBytes(StandardCharsets.UTF_8);
        paramSet.add(localObject);
        i += localObject.length;
      }
      localObject = ByteBuffer.allocate(i + 4);
      ((ByteBuffer)localObject).putInt(a.c.q.h());
      localIterator = paramSet.iterator();
      while (localIterator.hasNext())
      {
        paramSet = (byte[])localIterator.next();
        ((ByteBuffer)localObject).putInt(paramSet.length);
        ((ByteBuffer)localObject).put(paramSet);
      }
      c(paramString, ((ByteBuffer)localObject).array());
      return this;
    }
    
    public SharedPreferences.Editor remove(String paramString)
    {
      if (!a.g(paramString))
      {
        b.remove(a.d(paramString));
        c.add(paramString);
        return this;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append(" is a reserved key for the encryption keyset.");
      throw new SecurityException(localStringBuilder.toString());
    }
  }
  
  public static enum c
  {
    public final int o;
    
    public c(int paramInt1)
    {
      o = paramInt1;
    }
    
    public static c e(int paramInt)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2)
          {
            if (paramInt != 3)
            {
              if (paramInt != 4)
              {
                if (paramInt != 5) {
                  return null;
                }
                return u;
              }
              return t;
            }
            return s;
          }
          return r;
        }
        return q;
      }
      return p;
    }
    
    public int h()
    {
      return o;
    }
  }
  
  public static enum d
  {
    public final String o;
    
    public d(String paramString1)
    {
      o = paramString1;
    }
    
    public l e()
    {
      return m.a(o);
    }
  }
  
  public static enum e
  {
    public final String o;
    
    public e(String paramString1)
    {
      o = paramString1;
    }
    
    public l e()
    {
      return m.a(o);
    }
  }
}

/* Location:
 * Qualified Name:     s1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */