package com.google.android.gms.internal.measurement;

import android.support.v4.media.a;
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

public abstract class X3
{
  public static final Logger a = Logger.getLogger(J3.class.getName());
  public static String b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
  
  public static M3 a(Class paramClass)
  {
    Object localObject1 = X3.class.getClassLoader();
    Object localObject2;
    if (!paramClass.equals(M3.class))
    {
      if (!paramClass.getPackage().equals(X3.class.getPackage())) {
        throw new IllegalArgumentException(paramClass.getName());
      }
      localObject2 = String.format("%s.BlazeGenerated%sLoader", new Object[] { paramClass.getPackage().getName(), paramClass.getSimpleName() });
    }
    else
    {
      localObject2 = b;
    }
    try
    {
      localObject2 = Class.forName((String)localObject2, true, (ClassLoader)localObject1);
      try
      {
        a.a(((Class)localObject2).getConstructor(new Class[0]).newInstance(new Object[0]));
        throw null;
      }
      catch (InvocationTargetException localInvocationTargetException) {}catch (IllegalAccessException localIllegalAccessException)
      {
        break label130;
      }
      catch (InstantiationException localInstantiationException)
      {
        break label141;
      }
      catch (NoSuchMethodException localNoSuchMethodException) {}
      localObject3 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject3).<init>(localNoSuchMethodException);
      throw ((Throwable)localObject3);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      label130:
      localObject3 = ServiceLoader.load(X3.class, (ClassLoader)localObject1).iterator();
      localArrayList = new ArrayList();
    }
    Object localObject3 = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject3).<init>(localNoSuchMethodException);
    throw ((Throwable)localObject3);
    label141:
    localObject3 = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject3).<init>(localNoSuchMethodException);
    throw ((Throwable)localObject3);
    localObject3 = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject3).<init>(localNoSuchMethodException);
    throw ((Throwable)localObject3);
    for (;;)
    {
      ArrayList localArrayList;
      if (!((Iterator)localObject3).hasNext())
      {
        if (localArrayList.size() == 1) {
          return (M3)localArrayList.get(0);
        }
        if (localArrayList.size() == 0) {
          return null;
        }
        try
        {
          paramClass = (M3)paramClass.getMethod("combine", new Class[] { Collection.class }).invoke(null, new Object[] { localArrayList });
          return paramClass;
        }
        catch (InvocationTargetException paramClass) {}catch (IllegalAccessException paramClass)
        {
          break label276;
        }
        catch (NoSuchMethodException paramClass) {}
        throw new IllegalStateException(paramClass);
        label276:
        throw new IllegalStateException(paramClass);
        throw new IllegalStateException(paramClass);
      }
      try
      {
        a.a(((Iterator)localObject3).next());
        throw null;
      }
      catch (ServiceConfigurationError localServiceConfigurationError)
      {
        Logger localLogger = a;
        localObject1 = Level.SEVERE;
        String str = paramClass.getSimpleName();
        StringBuilder localStringBuilder = new StringBuilder("Unable to load ");
        localStringBuilder.append(str);
        localLogger.logp((Level)localObject1, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", localStringBuilder.toString(), localServiceConfigurationError);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.X3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */