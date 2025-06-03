package s1;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import t.b;

public final class a$b
  implements SharedPreferences.Editor
{
  public final a a;
  public final SharedPreferences.Editor b;
  public final List c;
  public final AtomicBoolean d = new AtomicBoolean(false);
  
  public a$b(a parama, SharedPreferences.Editor paramEditor)
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
      localObject = new b();
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

/* Location:
 * Qualified Name:     s1.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */