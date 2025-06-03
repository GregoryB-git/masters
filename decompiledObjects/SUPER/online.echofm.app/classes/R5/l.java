package R5;

import A5.a;
import A5.a.b;
import E5.c;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class l
  implements a, j.a
{
  public SharedPreferences a;
  public k b;
  
  public l()
  {
    this(new a());
  }
  
  public l(k paramk)
  {
    b = paramk;
  }
  
  public Boolean a(String paramString, Long paramLong)
  {
    return Boolean.valueOf(a.edit().putLong(paramString, paramLong.longValue()).commit());
  }
  
  public Map b(String paramString, List paramList)
  {
    if (paramList == null) {
      paramList = null;
    } else {
      paramList = new HashSet(paramList);
    }
    return h(paramString, paramList);
  }
  
  public Boolean c(String paramString1, String paramString2)
  {
    if ((!paramString2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) && (!paramString2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) && (!paramString2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu"))) {
      return Boolean.valueOf(a.edit().putString(paramString1, paramString2).commit());
    }
    throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
  }
  
  public Boolean d(String paramString, List paramList)
  {
    SharedPreferences.Editor localEditor = a.edit();
    Object localObject = a.getAll();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = ((Map)localObject).keySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      if ((((String)localObject).startsWith(paramString)) && ((paramList == null) || (paramList.contains(localObject)))) {
        localArrayList.add(localObject);
      }
    }
    paramString = localArrayList.iterator();
    while (paramString.hasNext()) {
      localEditor.remove((String)paramString.next());
    }
    return Boolean.valueOf(localEditor.commit());
  }
  
  public Boolean e(String paramString, List paramList)
  {
    SharedPreferences.Editor localEditor = a.edit();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu");
    localStringBuilder.append(b.a(paramList));
    return Boolean.valueOf(localEditor.putString(paramString, localStringBuilder.toString()).commit());
  }
  
  public Boolean f(String paramString, Boolean paramBoolean)
  {
    return Boolean.valueOf(a.edit().putBoolean(paramString, paramBoolean.booleanValue()).commit());
  }
  
  public Boolean g(String paramString, Double paramDouble)
  {
    String str = Double.toString(paramDouble.doubleValue());
    paramDouble = a.edit();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu");
    localStringBuilder.append(str);
    return Boolean.valueOf(paramDouble.putString(paramString, localStringBuilder.toString()).commit());
  }
  
  public final Map h(String paramString, Set paramSet)
  {
    Map localMap = a.getAll();
    HashMap localHashMap = new HashMap();
    Iterator localIterator = localMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((str.startsWith(paramString)) && ((paramSet == null) || (paramSet.contains(str)))) {
        localHashMap.put(str, j(str, localMap.get(str)));
      }
    }
    return localHashMap;
  }
  
  public final void i(c paramc, Context paramContext)
  {
    a = paramContext.getSharedPreferences("FlutterSharedPreferences", 0);
    try
    {
      i.j(paramc, this);
    }
    catch (Exception paramc)
    {
      Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", paramc);
    }
  }
  
  public final Object j(String paramString, Object paramObject)
  {
    if ((paramObject instanceof String))
    {
      paramString = (String)paramObject;
      if (paramString.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
        return b.b(paramString.substring(40));
      }
      if (paramString.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
        return new BigInteger(paramString.substring(44), 36);
      }
      if (paramString.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
        return Double.valueOf(paramString.substring(40));
      }
    }
    else if ((paramObject instanceof Set))
    {
      ArrayList localArrayList = new ArrayList((Set)paramObject);
      paramObject = a.edit().remove(paramString);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu");
      localStringBuilder.append(b.a(localArrayList));
      ((SharedPreferences.Editor)paramObject).putString(paramString, localStringBuilder.toString()).apply();
      return localArrayList;
    }
    return paramObject;
  }
  
  public void onAttachedToEngine(a.b paramb)
  {
    i(paramb.b(), paramb.a());
  }
  
  public void onDetachedFromEngine(a.b paramb)
  {
    i.j(paramb.b(), null);
  }
  
  public Boolean remove(String paramString)
  {
    return Boolean.valueOf(a.edit().remove(paramString).commit());
  }
  
  public static class a
    implements k
  {
    public String a(List paramList)
    {
      try
      {
        ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
        localByteArrayOutputStream.<init>();
        ObjectOutputStream localObjectOutputStream = new java/io/ObjectOutputStream;
        localObjectOutputStream.<init>(localByteArrayOutputStream);
        localObjectOutputStream.writeObject(paramList);
        localObjectOutputStream.flush();
        paramList = Base64.encodeToString(localByteArrayOutputStream.toByteArray(), 0);
        return paramList;
      }
      catch (IOException paramList)
      {
        throw new RuntimeException(paramList);
      }
    }
    
    public List b(String paramString)
    {
      try
      {
        ObjectInputStream localObjectInputStream = new java/io/ObjectInputStream;
        ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
        localByteArrayInputStream.<init>(Base64.decode(paramString, 0));
        localObjectInputStream.<init>(localByteArrayInputStream);
        paramString = (List)localObjectInputStream.readObject();
        return paramString;
      }
      catch (ClassNotFoundException paramString) {}catch (IOException paramString) {}
      throw new RuntimeException(paramString);
    }
  }
}

/* Location:
 * Qualified Name:     R5.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */