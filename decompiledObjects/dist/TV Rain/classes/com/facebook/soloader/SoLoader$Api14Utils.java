package com.facebook.soloader;

import android.annotation.TargetApi;
import dalvik.system.BaseDexClassLoader;
import java.lang.reflect.Method;
import z2;

@TargetApi(14)
@DoNotOptimize
class SoLoader$Api14Utils
{
  public static String getClassLoaderLdLoadLibrary()
  {
    ClassLoader localClassLoader = SoLoader.class.getClassLoader();
    if ((localClassLoader instanceof BaseDexClassLoader)) {
      try
      {
        Object localObject = (BaseDexClassLoader)localClassLoader;
        localObject = (String)BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke(localObject, new Object[0]);
        return (String)localObject;
      }
      catch (Exception localException)
      {
        throw new RuntimeException("Cannot call getLdLibraryPath", localException);
      }
    }
    StringBuilder localStringBuilder = z2.t("ClassLoader ");
    localStringBuilder.append(localClassLoader.getClass().getName());
    localStringBuilder.append(" should be of type BaseDexClassLoader");
    throw new IllegalStateException(localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     com.facebook.soloader.SoLoader.Api14Utils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */