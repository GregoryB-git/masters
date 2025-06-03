package E1;

import T1.a;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class m
{
  public static final m a = new m();
  
  /* Error */
  public static final Class a(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 24	T1/a:d	(Ljava/lang/Object;)Z
    //   5: istore_1
    //   6: aconst_null
    //   7: astore_2
    //   8: iload_1
    //   9: ifeq +5 -> 14
    //   12: aconst_null
    //   13: areturn
    //   14: aload_0
    //   15: ldc 26
    //   17: invokestatic 32	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   20: aload_0
    //   21: invokestatic 37	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   24: astore_0
    //   25: goto +7 -> 32
    //   28: astore_0
    //   29: goto +5 -> 34
    //   32: aload_0
    //   33: areturn
    //   34: aload_0
    //   35: ldc 2
    //   37: invokestatic 41	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   40: aconst_null
    //   41: areturn
    //   42: astore_0
    //   43: aload_2
    //   44: astore_0
    //   45: goto -13 -> 32
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	48	0	paramString	String
    //   5	4	1	bool	boolean
    //   7	37	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   14	20	28	finally
    //   20	25	28	finally
    //   20	25	42	java/lang/ClassNotFoundException
  }
  
  public static final Class b(Context paramContext, String paramString)
  {
    if (a.d(m.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramString, "className");
      return null;
    }
    finally
    {
      try
      {
        paramContext = paramContext.getClassLoader().loadClass(paramString);
        return paramContext;
      }
      catch (ClassNotFoundException paramContext)
      {
        return null;
      }
      paramContext = finally;
      a.b(paramContext, m.class);
    }
  }
  
  public static final Method c(Class paramClass, String paramString, Class... paramVarArgs)
  {
    boolean bool = a.d(m.class);
    localObject = null;
    if (bool) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramClass, "clazz");
      Intrinsics.checkNotNullParameter(paramString, "methodName");
      Intrinsics.checkNotNullParameter(paramVarArgs, "args");
      return paramClass;
    }
    finally
    {
      try
      {
        paramClass = paramClass.getDeclaredMethod(paramString, (Class[])Arrays.copyOf(paramVarArgs, paramVarArgs.length));
      }
      catch (NoSuchMethodException paramClass)
      {
        for (;;)
        {
          paramClass = (Class)localObject;
        }
      }
      paramClass = finally;
    }
    a.b(paramClass, m.class);
    return null;
  }
  
  public static final Method d(Class paramClass, String paramString, Class... paramVarArgs)
  {
    boolean bool = a.d(m.class);
    localObject = null;
    if (bool) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramClass, "clazz");
      Intrinsics.checkNotNullParameter(paramString, "methodName");
      Intrinsics.checkNotNullParameter(paramVarArgs, "args");
      return paramClass;
    }
    finally
    {
      try
      {
        paramClass = paramClass.getMethod(paramString, (Class[])Arrays.copyOf(paramVarArgs, paramVarArgs.length));
      }
      catch (NoSuchMethodException paramClass)
      {
        for (;;)
        {
          paramClass = (Class)localObject;
        }
      }
      paramClass = finally;
    }
    a.b(paramClass, m.class);
    return null;
  }
  
  public static final Object e(Class paramClass, Method paramMethod, Object paramObject, Object... paramVarArgs)
  {
    if (a.d(m.class)) {
      return null;
    }
    Object localObject;
    try
    {
      Intrinsics.checkNotNullParameter(paramClass, "clazz");
      Intrinsics.checkNotNullParameter(paramMethod, "method");
      Intrinsics.checkNotNullParameter(paramVarArgs, "args");
      localObject = paramObject;
      if (paramObject != null) {
        localObject = paramClass.cast(paramObject);
      }
    }
    finally
    {
      break label67;
    }
    try
    {
      paramClass = paramMethod.invoke(localObject, Arrays.copyOf(paramVarArgs, paramVarArgs.length));
      return paramClass;
    }
    catch (IllegalAccessException|InvocationTargetException paramClass)
    {
      return null;
    }
    label67:
    a.b(paramClass, m.class);
    return null;
  }
}

/* Location:
 * Qualified Name:     E1.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */