package com.google.android.gms.internal.measurement;

import f;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzkf<T extends zzjt>
{
  private static String zza = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
  
  public static <T extends zzjt> T zza(Class<T> paramClass)
  {
    Object localObject1 = zzkf.class.getClassLoader();
    Object localObject2;
    if (paramClass.equals(zzjt.class))
    {
      localObject2 = zza;
    }
    else
    {
      if (!paramClass.getPackage().equals(zzkf.class.getPackage())) {
        break label326;
      }
      localObject2 = String.format("%s.BlazeGenerated%sLoader", new Object[] { paramClass.getPackage().getName(), paramClass.getSimpleName() });
    }
    try
    {
      localObject2 = Class.forName((String)localObject2, true, (ClassLoader)localObject1);
      try
      {
        localObject2 = (zzkf)((Class)localObject2).getConstructor(new Class[0]).newInstance(new Object[0]);
        return (zzjt)paramClass.cast(((zzkf)localObject2).zza());
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        localObject2 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject2).<init>(localInvocationTargetException);
        throw ((Throwable)localObject2);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        localObject2 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject2).<init>(localIllegalAccessException);
        throw ((Throwable)localObject2);
      }
      catch (InstantiationException localInstantiationException)
      {
        localObject2 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject2).<init>(localInstantiationException);
        throw ((Throwable)localObject2);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        localObject2 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject2).<init>(localNoSuchMethodException);
        throw ((Throwable)localObject2);
      }
      Iterator localIterator;
      throw new IllegalArgumentException(paramClass.getName());
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      localIterator = ServiceLoader.load(zzkf.class, (ClassLoader)localObject1).iterator();
      localObject1 = new ArrayList();
      while (localIterator.hasNext()) {
        try
        {
          ((ArrayList)localObject1).add((zzjt)paramClass.cast(((zzkf)localIterator.next()).zza()));
        }
        catch (ServiceConfigurationError localServiceConfigurationError)
        {
          Logger.getLogger(zzjn.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", f.j("Unable to load ", paramClass.getSimpleName()), localServiceConfigurationError);
        }
      }
      if (((ArrayList)localObject1).size() == 1) {
        return (zzjt)((ArrayList)localObject1).get(0);
      }
      if (((ArrayList)localObject1).size() == 0) {
        return null;
      }
      try
      {
        paramClass = (zzjt)paramClass.getMethod("combine", new Class[] { Collection.class }).invoke(null, new Object[] { localObject1 });
        return paramClass;
      }
      catch (InvocationTargetException paramClass)
      {
        throw new IllegalStateException(paramClass);
      }
      catch (IllegalAccessException paramClass)
      {
        throw new IllegalStateException(paramClass);
      }
      catch (NoSuchMethodException paramClass)
      {
        throw new IllegalStateException(paramClass);
      }
    }
  }
  
  public abstract T zza();
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzkf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */