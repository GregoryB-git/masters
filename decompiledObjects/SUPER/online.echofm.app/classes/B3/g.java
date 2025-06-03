package B3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class g
{
  public final Object a;
  public final c b;
  
  public g(Object paramObject, c paramc)
  {
    a = paramObject;
    b = paramc;
  }
  
  public static g c(Context paramContext, Class paramClass)
  {
    return new g(paramContext, new b(paramClass, null));
  }
  
  public static ComponentRegistrar d(String paramString)
  {
    try
    {
      try
      {
        Class localClass = Class.forName(paramString);
        if (ComponentRegistrar.class.isAssignableFrom(localClass)) {
          return (ComponentRegistrar)localClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        break label77;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        break label99;
      }
      catch (InstantiationException localInstantiationException)
      {
        break label121;
      }
      catch (IllegalAccessException localIllegalAccessException) {}
      localw = new B3/w;
      localw.<init>(String.format("Class %s is not an instance of %s", new Object[] { paramString, "com.google.firebase.components.ComponentRegistrar" }));
      throw localw;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      w localw;
      label77:
      label99:
      label121:
      Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[] { paramString }));
    }
    throw new w(String.format("Could not instantiate %s", new Object[] { paramString }), localw);
    throw new w(String.format("Could not instantiate %s", new Object[] { paramString }), localw);
    throw new w(String.format("Could not instantiate %s.", new Object[] { paramString }), localw);
    throw new w(String.format("Could not instantiate %s.", new Object[] { paramString }), localw);
    return null;
  }
  
  public List b()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = b.a(a).iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(new f((String)localIterator.next()));
    }
    return localArrayList;
  }
  
  public static class b
    implements g.c
  {
    public final Class a;
    
    public b(Class paramClass)
    {
      a = paramClass;
    }
    
    public final Bundle b(Context paramContext)
    {
      try
      {
        PackageManager localPackageManager = paramContext.getPackageManager();
        if (localPackageManager == null)
        {
          Log.w("ComponentDiscovery", "Context has no PackageManager.");
          return null;
        }
        ComponentName localComponentName = new android/content/ComponentName;
        localComponentName.<init>(paramContext, a);
        paramContext = localPackageManager.getServiceInfo(localComponentName, 128);
        if (paramContext == null)
        {
          paramContext = new java/lang/StringBuilder;
          paramContext.<init>();
          paramContext.append(a);
          paramContext.append(" has no service info.");
          Log.w("ComponentDiscovery", paramContext.toString());
          return null;
        }
        paramContext = metaData;
        return paramContext;
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        Log.w("ComponentDiscovery", "Application info not found.");
      }
      return null;
    }
    
    public List c(Context paramContext)
    {
      paramContext = b(paramContext);
      if (paramContext == null)
      {
        Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
        return Collections.emptyList();
      }
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramContext.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (("com.google.firebase.components.ComponentRegistrar".equals(paramContext.get(str))) && (str.startsWith("com.google.firebase.components:"))) {
          localArrayList.add(str.substring(31));
        }
      }
      return localArrayList;
    }
  }
  
  public static abstract interface c
  {
    public abstract List a(Object paramObject);
  }
}

/* Location:
 * Qualified Name:     B3.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */