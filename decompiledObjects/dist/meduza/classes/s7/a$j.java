package s7;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

public final class a$j
  extends a.a
{
  public static final Unsafe a;
  public static final long b;
  public static final long c;
  public static final long d;
  public static final long e;
  public static final long f;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: invokestatic 33	sun/misc/Unsafe:getUnsafe	()Lsun/misc/Unsafe;
    //   3: astore_0
    //   4: goto +20 -> 24
    //   7: astore_0
    //   8: new 9	s7/a$j$a
    //   11: astore_0
    //   12: aload_0
    //   13: invokespecial 36	s7/a$j$a:<init>	()V
    //   16: aload_0
    //   17: invokestatic 42	java/security/AccessController:doPrivileged	(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;
    //   20: checkcast 29	sun/misc/Unsafe
    //   23: astore_0
    //   24: aload_0
    //   25: ldc 6
    //   27: ldc 43
    //   29: invokevirtual 49	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   32: invokevirtual 53	sun/misc/Unsafe:objectFieldOffset	(Ljava/lang/reflect/Field;)J
    //   35: putstatic 55	s7/a$j:c	J
    //   38: aload_0
    //   39: ldc 6
    //   41: ldc 56
    //   43: invokevirtual 49	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   46: invokevirtual 53	sun/misc/Unsafe:objectFieldOffset	(Ljava/lang/reflect/Field;)J
    //   49: putstatic 58	s7/a$j:b	J
    //   52: aload_0
    //   53: ldc 6
    //   55: ldc 59
    //   57: invokevirtual 49	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   60: invokevirtual 53	sun/misc/Unsafe:objectFieldOffset	(Ljava/lang/reflect/Field;)J
    //   63: putstatic 61	s7/a$j:d	J
    //   66: aload_0
    //   67: ldc 63
    //   69: ldc 59
    //   71: invokevirtual 49	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   74: invokevirtual 53	sun/misc/Unsafe:objectFieldOffset	(Ljava/lang/reflect/Field;)J
    //   77: putstatic 65	s7/a$j:e	J
    //   80: aload_0
    //   81: ldc 63
    //   83: ldc 56
    //   85: invokevirtual 49	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   88: invokevirtual 53	sun/misc/Unsafe:objectFieldOffset	(Ljava/lang/reflect/Field;)J
    //   91: putstatic 67	s7/a$j:f	J
    //   94: aload_0
    //   95: putstatic 69	s7/a$j:a	Lsun/misc/Unsafe;
    //   98: return
    //   99: astore_0
    //   100: aload_0
    //   101: athrow
    //   102: astore_0
    //   103: new 27	java/lang/RuntimeException
    //   106: dup
    //   107: aload_0
    //   108: invokespecial 72	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   111: athrow
    //   112: astore_0
    //   113: new 27	java/lang/RuntimeException
    //   116: dup
    //   117: ldc 74
    //   119: aload_0
    //   120: invokevirtual 78	java/security/PrivilegedActionException:getCause	()Ljava/lang/Throwable;
    //   123: invokespecial 81	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   126: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   3	1	0	localUnsafe	Unsafe
    //   7	1	0	localSecurityException	SecurityException
    //   11	84	0	localObject	Object
    //   99	2	0	localRuntimeException	RuntimeException
    //   102	6	0	localNoSuchFieldException	NoSuchFieldException
    //   112	8	0	localPrivilegedActionException	java.security.PrivilegedActionException
    // Exception table:
    //   from	to	target	type
    //   0	4	7	java/lang/SecurityException
    //   24	98	99	java/lang/RuntimeException
    //   24	98	102	java/lang/NoSuchFieldException
    //   8	24	112	java/security/PrivilegedActionException
  }
  
  public final boolean a(a<?> parama, a.d paramd1, a.d paramd2)
  {
    return b.a(a, parama, b, paramd1, paramd2);
  }
  
  public final boolean b(a<?> parama, Object paramObject1, Object paramObject2)
  {
    return b.a(a, parama, d, paramObject1, paramObject2);
  }
  
  public final boolean c(a<?> parama, a.k paramk1, a.k paramk2)
  {
    return b.a(a, parama, c, paramk1, paramk2);
  }
  
  public final a.d d(a<?> parama, a.d paramd)
  {
    a.d locald;
    do
    {
      locald = b;
      if (paramd == locald) {
        return locald;
      }
    } while (!a(parama, locald, paramd));
    return locald;
  }
  
  public final a.k e(a parama)
  {
    a.k localk1 = a.k.c;
    a.k localk2;
    do
    {
      localk2 = c;
      if (localk1 == localk2) {
        return localk2;
      }
    } while (!c(parama, localk2, localk1));
    return localk2;
  }
  
  public final void f(a.k paramk1, a.k paramk2)
  {
    a.putObject(paramk1, f, paramk2);
  }
  
  public final void g(a.k paramk, Thread paramThread)
  {
    a.putObject(paramk, e, paramThread);
  }
  
  public final class a
    implements PrivilegedExceptionAction<Unsafe>
  {
    public static Unsafe a()
    {
      for (Object localObject : Unsafe.class.getDeclaredFields())
      {
        ((AccessibleObject)localObject).setAccessible(true);
        localObject = ((Field)localObject).get(null);
        if (Unsafe.class.isInstance(localObject)) {
          return (Unsafe)Unsafe.class.cast(localObject);
        }
      }
      throw new NoSuchFieldError("the Unsafe");
    }
  }
}

/* Location:
 * Qualified Name:     s7.a.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */