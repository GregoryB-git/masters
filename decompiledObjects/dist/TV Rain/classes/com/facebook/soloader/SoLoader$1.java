package com.facebook.soloader;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class SoLoader$1
  implements SoFileLoader
{
  public SoLoader$1(boolean paramBoolean, String paramString1, String paramString2, Runtime paramRuntime, Method paramMethod) {}
  
  public void load(String paramString, int paramInt)
  {
    if (val$hasNativeLoadMethod)
    {
      if ((paramInt & 0x4) == 4) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      String str;
      if (paramInt != 0) {
        str = val$localLdLibraryPath;
      } else {
        str = val$localLdLibraryPathNoZips;
      }
      try
      {
        synchronized (val$runtime)
        {
          str = (String)val$nativeLoadRuntimeMethod.invoke(val$runtime, new Object[] { paramString, SoLoader.class.getClassLoader(), str });
          if (str == null) {
            return;
          }
          Object localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          ((StringBuilder)localObject3).append("Error when loading lib: ");
          ((StringBuilder)localObject3).append(str);
          Log.e("SoLoader", ((StringBuilder)localObject3).toString());
          localObject3 = new java/lang/UnsatisfiedLinkError;
          ((UnsatisfiedLinkError)localObject3).<init>(str);
          throw ((Throwable)localObject3);
        }
        ??? = new StringBuilder();
      }
      catch (InvocationTargetException localInvocationTargetException) {}catch (IllegalArgumentException localIllegalArgumentException) {}catch (IllegalAccessException localIllegalAccessException) {}
      ((StringBuilder)???).append("Error: Cannot load ");
      ((StringBuilder)???).append(paramString);
      paramString = ((StringBuilder)???).toString();
      Log.e("SoLoader", paramString);
      throw new RuntimeException(paramString, localIllegalAccessException);
    }
    else
    {
      System.load(paramString);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.soloader.SoLoader.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */