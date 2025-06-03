package okhttp3.internal.platform;

import f;
import java.lang.reflect.Method;

class OptionalMethod<T>
{
  public final Class<?> a;
  public final String b;
  public final Class[] c;
  
  public OptionalMethod(Class<?> paramClass, String paramString, Class... paramVarArgs)
  {
    a = paramClass;
    b = paramString;
    c = paramVarArgs;
  }
  
  public final Method a(Class<?> paramClass)
  {
    String str = b;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (str != null) {
      localObject2 = c;
    }
    for (;;)
    {
      try
      {
        paramClass = paramClass.getMethod(str, (Class[])localObject2);
      }
      catch (NoSuchMethodException paramClass)
      {
        int i;
        continue;
      }
      try
      {
        i = paramClass.getModifiers();
        if ((i & 0x1) == 0) {
          paramClass = null;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException) {}
    }
    if (paramClass != null)
    {
      localObject2 = a;
      if ((localObject2 != null) && (!((Class)localObject2).isAssignableFrom(paramClass.getReturnType())))
      {
        localObject2 = localObject1;
        break label79;
      }
    }
    localObject2 = paramClass;
    label79:
    return (Method)localObject2;
  }
  
  public final Object b(T paramT, Object... paramVarArgs)
  {
    Method localMethod = a(paramT.getClass());
    if (localMethod != null) {
      try
      {
        paramT = localMethod.invoke(paramT, paramVarArgs);
        return paramT;
      }
      catch (IllegalAccessException paramT)
      {
        paramVarArgs = new StringBuilder();
        paramVarArgs.append("Unexpectedly could not call: ");
        paramVarArgs.append(localMethod);
        paramVarArgs = new AssertionError(paramVarArgs.toString());
        paramVarArgs.initCause(paramT);
        throw paramVarArgs;
      }
    }
    paramVarArgs = f.l("Method ");
    paramVarArgs.append(b);
    paramVarArgs.append(" not supported for object ");
    paramVarArgs.append(paramT);
    throw new AssertionError(paramVarArgs.toString());
  }
  
  /* Error */
  public final void c(Object paramObject, Object... paramVarArgs)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 56	java/lang/Object:getClass	()Ljava/lang/Class;
    //   5: invokevirtual 58	okhttp3/internal/platform/OptionalMethod:a	(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   8: astore_3
    //   9: aload_3
    //   10: ifnonnull +6 -> 16
    //   13: goto +10 -> 23
    //   16: aload_3
    //   17: aload_1
    //   18: aload_2
    //   19: invokevirtual 61	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   22: pop
    //   23: return
    //   24: astore_1
    //   25: aload_1
    //   26: invokevirtual 105	java/lang/reflect/InvocationTargetException:getTargetException	()Ljava/lang/Throwable;
    //   29: astore_1
    //   30: aload_1
    //   31: instanceof 107
    //   34: ifeq +8 -> 42
    //   37: aload_1
    //   38: checkcast 107	java/lang/RuntimeException
    //   41: athrow
    //   42: new 75	java/lang/AssertionError
    //   45: dup
    //   46: ldc 109
    //   48: invokespecial 82	java/lang/AssertionError:<init>	(Ljava/lang/Object;)V
    //   51: astore_2
    //   52: aload_2
    //   53: aload_1
    //   54: invokevirtual 88	java/lang/Throwable:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   57: pop
    //   58: aload_2
    //   59: athrow
    //   60: astore_1
    //   61: goto -38 -> 23
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	this	OptionalMethod
    //   0	64	1	paramObject	Object
    //   0	64	2	paramVarArgs	Object[]
    //   8	9	3	localMethod	Method
    // Exception table:
    //   from	to	target	type
    //   0	9	24	java/lang/reflect/InvocationTargetException
    //   16	23	24	java/lang/reflect/InvocationTargetException
    //   16	23	60	java/lang/IllegalAccessException
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.platform.OptionalMethod
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */