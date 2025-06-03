package l3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.BaseBundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import t3.a;

public final class k
  implements e
{
  public final a a;
  public final i b;
  public final HashMap c = new HashMap();
  
  public k(Context paramContext, i parami)
  {
    a = paramContext;
    b = parami;
  }
  
  public final m a(String paramString)
  {
    try
    {
      if (c.containsKey(paramString))
      {
        paramString = (m)c.get(paramString);
        return paramString;
      }
      d locald = a.a(paramString);
      if (locald == null) {
        return null;
      }
      Object localObject1 = b;
      Object localObject2 = a;
      a locala = b;
      localObject1 = c;
      c localc = new l3/c;
      localc.<init>((Context)localObject2, locala, (a)localObject1, paramString);
      localObject2 = locald.create(localc);
      c.put(paramString, localObject2);
      return (m)localObject2;
    }
    finally {}
  }
  
  public static final class a
  {
    public final Context a;
    public Map<String, String> b = null;
    
    public a(Context paramContext)
    {
      a = paramContext;
    }
    
    public final d a(String paramString)
    {
      if (b == null)
      {
        Object localObject1 = a;
        Object localObject2;
        try
        {
          localObject2 = ((Context)localObject1).getPackageManager();
          if (localObject2 == null)
          {
            localObject3 = "Context has no PackageManager.";
          }
          else
          {
            localObject3 = new android/content/ComponentName;
            ((ComponentName)localObject3).<init>((Context)localObject1, TransportBackendDiscovery.class);
            localObject3 = ((PackageManager)localObject2).getServiceInfo((ComponentName)localObject3, 128);
            if (localObject3 != null) {
              break label72;
            }
            localObject3 = "TransportBackendDiscovery has no service info.";
          }
          Log.w("BackendRegistry", (String)localObject3);
          break label92;
          label72:
          Object localObject3 = metaData;
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException)
        {
          Log.w("BackendRegistry", "Application info not found.");
          label92:
          localObject4 = null;
        }
        if (localObject4 == null)
        {
          Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
          localObject4 = Collections.emptyMap();
        }
        else
        {
          localObject1 = new HashMap();
          localObject2 = ((BaseBundle)localObject4).keySet().iterator();
          while (((Iterator)localObject2).hasNext())
          {
            String str1 = (String)((Iterator)localObject2).next();
            Object localObject5 = ((BaseBundle)localObject4).get(str1);
            if (((localObject5 instanceof String)) && (str1.startsWith("backend:")))
            {
              localObject5 = ((String)localObject5).split(",", -1);
              int i = localObject5.length;
              for (int j = 0; j < i; j++)
              {
                String str2 = localObject5[j].trim();
                if (!str2.isEmpty()) {
                  ((HashMap)localObject1).put(str2, str1.substring(8));
                }
              }
            }
          }
          localObject4 = localObject1;
        }
        b = ((Map)localObject4);
      }
      Object localObject4 = (String)b.get(paramString);
      if (localObject4 == null) {
        return null;
      }
      try
      {
        try
        {
          paramString = (d)Class.forName((String)localObject4).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
          return paramString;
        }
        catch (InvocationTargetException paramString)
        {
          localObject4 = String.format("Could not instantiate %s", new Object[] { localObject4 });
        }
        catch (NoSuchMethodException paramString)
        {
          localObject4 = String.format("Could not instantiate %s", new Object[] { localObject4 });
        }
        Log.w("BackendRegistry", (String)localObject4, paramString);
      }
      catch (InstantiationException paramString)
      {
        localObject4 = String.format("Could not instantiate %s.", new Object[] { localObject4 });
      }
      catch (IllegalAccessException paramString)
      {
        localObject4 = String.format("Could not instantiate %s.", new Object[] { localObject4 });
      }
      catch (ClassNotFoundException paramString)
      {
        localObject4 = String.format("Class %s is not found.", new Object[] { localObject4 });
      }
      Log.w("BackendRegistry", (String)localObject4, paramString);
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     l3.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */