package g2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class k
  implements e
{
  public final a a;
  public final i b;
  public final Map c = new HashMap();
  
  public k(Context paramContext, i parami)
  {
    this(new a(paramContext), parami);
  }
  
  public k(a parama, i parami)
  {
    a = parama;
    b = parami;
  }
  
  public m a(String paramString)
  {
    label85:
    try
    {
      if (c.containsKey(paramString))
      {
        paramString = (m)c.get(paramString);
        return paramString;
      }
    }
    finally
    {
      break label85;
      Object localObject = a.b(paramString);
      if (localObject == null) {
        return null;
      }
      localObject = ((d)localObject).create(b.a(paramString));
      c.put(paramString, localObject);
      return (m)localObject;
    }
  }
  
  public static class a
  {
    public final Context a;
    public Map b = null;
    
    public a(Context paramContext)
    {
      a = paramContext;
    }
    
    public static Bundle d(Context paramContext)
    {
      try
      {
        PackageManager localPackageManager = paramContext.getPackageManager();
        if (localPackageManager == null)
        {
          Log.w("BackendRegistry", "Context has no PackageManager.");
          return null;
        }
        ComponentName localComponentName = new android/content/ComponentName;
        localComponentName.<init>(paramContext, TransportBackendDiscovery.class);
        paramContext = localPackageManager.getServiceInfo(localComponentName, 128);
        if (paramContext == null)
        {
          Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
          return null;
        }
        paramContext = metaData;
        return paramContext;
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        Log.w("BackendRegistry", "Application info not found.");
      }
      return null;
    }
    
    public final Map a(Context paramContext)
    {
      Bundle localBundle = d(paramContext);
      if (localBundle == null)
      {
        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
        return Collections.emptyMap();
      }
      paramContext = new HashMap();
      Iterator localIterator = localBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = localBundle.get(str);
        if (((localObject instanceof String)) && (str.startsWith("backend:")))
        {
          String[] arrayOfString = ((String)localObject).split(",", -1);
          int i = arrayOfString.length;
          for (int j = 0; j < i; j++)
          {
            localObject = arrayOfString[j].trim();
            if (!((String)localObject).isEmpty()) {
              paramContext.put(localObject, str.substring(8));
            }
          }
        }
      }
      return paramContext;
    }
    
    public d b(String paramString)
    {
      String str = (String)c().get(paramString);
      if (str == null) {
        return null;
      }
      try
      {
        paramString = (d)Class.forName(str).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        return paramString;
      }
      catch (InvocationTargetException paramString) {}catch (NoSuchMethodException paramString)
      {
        break label94;
      }
      catch (InstantiationException paramString)
      {
        break label111;
      }
      catch (IllegalAccessException paramString)
      {
        break label136;
      }
      catch (ClassNotFoundException paramString) {}
      str = String.format("Could not instantiate %s", new Object[] { str });
      for (;;)
      {
        Log.w("BackendRegistry", str, paramString);
        break;
        label94:
        str = String.format("Could not instantiate %s", new Object[] { str });
        continue;
        label111:
        label136:
        for (str = String.format("Could not instantiate %s.", new Object[] { str });; str = String.format("Could not instantiate %s.", new Object[] { str }))
        {
          Log.w("BackendRegistry", str, paramString);
          break;
        }
        str = String.format("Class %s is not found.", new Object[] { str });
      }
      return null;
    }
    
    public final Map c()
    {
      if (b == null) {
        b = a(a);
      }
      return b;
    }
  }
}

/* Location:
 * Qualified Name:     g2.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */