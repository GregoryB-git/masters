package r3;

import android.content.Context;
import b8.c;
import b8.c.a;
import b8.r;
import b8.s;
import com.google.android.gms.internal.firebase_auth_api.zzabq;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import i9.f0;
import i9.m1;
import i9.v;
import i9.w;
import i9.y;
import j9.n;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k9.d;
import k9.m;
import k9.o;
import m3.b;
import m6.j;
import qb.a;
import t8.e;
import t8.e.a;
import z4.x;

public final class a0
  implements b, x, Continuation, f0
{
  public Object a;
  public Object b;
  public Object c;
  
  public static Method g(Class paramClass, String paramString, Class[] paramArrayOfClass)
  {
    localObject = null;
    if (paramClass == null) {
      return null;
    }
    for (;;)
    {
      try
      {
        if ((paramClass.getModifiers() & 0x1) == 0) {
          return g(paramClass.getSuperclass(), paramString, paramArrayOfClass);
        }
        paramClass = paramClass.getMethod(paramString, paramArrayOfClass);
      }
      catch (NoSuchMethodException paramClass)
      {
        int i;
        paramClass = (Class)localObject;
        continue;
      }
      try
      {
        i = paramClass.getModifiers();
        if ((i & 0x1) == 0) {
          paramClass = (Class)localObject;
        }
      }
      catch (NoSuchMethodException paramString) {}
    }
    return paramClass;
  }
  
  public final long a()
  {
    Object localObject = c;
    long l;
    if ((c4.i)localObject != null) {
      l = ((c4.i)localObject).getPosition();
    } else {
      l = -1L;
    }
    return l;
  }
  
  public final Method b(Class paramClass)
  {
    Object localObject = (String)b;
    if (localObject != null)
    {
      localObject = g(paramClass, (String)localObject, (Class[])c);
      paramClass = (Class)localObject;
      if (localObject != null)
      {
        Class localClass = (Class)a;
        paramClass = (Class)localObject;
        if (localClass != null)
        {
          paramClass = (Class)localObject;
          if (localClass.isAssignableFrom(((Method)localObject).getReturnType())) {}
        }
      }
    }
    else
    {
      paramClass = null;
    }
    return paramClass;
  }
  
  public final void c(j9.i parami)
  {
    ((Set)c).add(parami);
  }
  
  public final void d()
  {
    y localy = b).h;
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = ((Set)c).iterator();
    while (localIterator.hasNext())
    {
      j9.i locali = (j9.i)localIterator.next();
      if (!q(locali)) {
        localArrayList.add(locali);
      }
    }
    localy.b(localArrayList);
    c = null;
  }
  
  public final void e(j9.i parami)
  {
    ((Set)c).remove(parami);
  }
  
  public final void f()
  {
    c = new HashSet();
  }
  
  public final Object get()
  {
    return new z((Context)((a)a).get(), (String)((a)b).get(), ((Integer)((a)c).get()).intValue());
  }
  
  public final long h()
  {
    return -1L;
  }
  
  /* Error */
  public final void i(t5.k paramk, android.net.Uri paramUri, java.util.Map paramMap, long paramLong1, long paramLong2, c4.j paramj)
  {
    // Byte code:
    //   0: new 148	c4/e
    //   3: dup
    //   4: aload_1
    //   5: lload 4
    //   7: lload 6
    //   9: invokespecial 151	c4/e:<init>	(Lt5/h;JJ)V
    //   12: astore 9
    //   14: aload_0
    //   15: aload 9
    //   17: putfield 24	r3/a0:c	Ljava/lang/Object;
    //   20: aload_0
    //   21: getfield 22	r3/a0:b	Ljava/lang/Object;
    //   24: checkcast 153	c4/h
    //   27: ifnull +4 -> 31
    //   30: return
    //   31: aload_0
    //   32: getfield 20	r3/a0:a	Ljava/lang/Object;
    //   35: checkcast 155	c4/k
    //   38: aload_2
    //   39: aload_3
    //   40: invokeinterface 158 3 0
    //   45: astore_1
    //   46: aload_1
    //   47: arraylength
    //   48: istore 10
    //   50: iconst_0
    //   51: istore 11
    //   53: iconst_1
    //   54: istore 12
    //   56: iload 10
    //   58: iconst_1
    //   59: if_icmpne +13 -> 72
    //   62: aload_0
    //   63: aload_1
    //   64: iconst_0
    //   65: aaload
    //   66: putfield 22	r3/a0:b	Ljava/lang/Object;
    //   69: goto +287 -> 356
    //   72: aload_1
    //   73: arraylength
    //   74: istore 13
    //   76: iconst_0
    //   77: istore 10
    //   79: iload 10
    //   81: iload 13
    //   83: if_icmpge +157 -> 240
    //   86: aload_1
    //   87: iload 10
    //   89: aaload
    //   90: astore_3
    //   91: aload_3
    //   92: aload 9
    //   94: invokeinterface 161 2 0
    //   99: ifeq +17 -> 116
    //   102: aload_0
    //   103: aload_3
    //   104: putfield 22	r3/a0:b	Ljava/lang/Object;
    //   107: aload 9
    //   109: iconst_0
    //   110: putfield 164	c4/e:f	I
    //   113: goto +127 -> 240
    //   116: aload_0
    //   117: getfield 22	r3/a0:b	Ljava/lang/Object;
    //   120: checkcast 153	c4/h
    //   123: ifnonnull +97 -> 220
    //   126: aload 9
    //   128: getfield 167	c4/e:d	J
    //   131: lload 4
    //   133: lcmp
    //   134: ifne +80 -> 214
    //   137: goto +83 -> 220
    //   140: astore_1
    //   141: iload 12
    //   143: istore 14
    //   145: aload_0
    //   146: getfield 22	r3/a0:b	Ljava/lang/Object;
    //   149: checkcast 153	c4/h
    //   152: ifnonnull +24 -> 176
    //   155: aload 9
    //   157: getfield 167	c4/e:d	J
    //   160: lload 4
    //   162: lcmp
    //   163: ifne +10 -> 173
    //   166: iload 12
    //   168: istore 14
    //   170: goto +6 -> 176
    //   173: iconst_0
    //   174: istore 14
    //   176: iload 14
    //   178: invokestatic 173	x6/b:H	(Z)V
    //   181: aload 9
    //   183: iconst_0
    //   184: putfield 164	c4/e:f	I
    //   187: aload_1
    //   188: athrow
    //   189: astore_3
    //   190: aload_0
    //   191: getfield 22	r3/a0:b	Ljava/lang/Object;
    //   194: checkcast 153	c4/h
    //   197: ifnonnull +23 -> 220
    //   200: aload 9
    //   202: getfield 167	c4/e:d	J
    //   205: lload 4
    //   207: lcmp
    //   208: ifne +6 -> 214
    //   211: goto +9 -> 220
    //   214: iconst_0
    //   215: istore 14
    //   217: goto +6 -> 223
    //   220: iconst_1
    //   221: istore 14
    //   223: iload 14
    //   225: invokestatic 173	x6/b:H	(Z)V
    //   228: aload 9
    //   230: iconst_0
    //   231: putfield 164	c4/e:f	I
    //   234: iinc 10 1
    //   237: goto -158 -> 79
    //   240: aload_0
    //   241: getfield 22	r3/a0:b	Ljava/lang/Object;
    //   244: checkcast 153	c4/h
    //   247: ifnonnull +109 -> 356
    //   250: ldc -81
    //   252: invokestatic 180	f:l	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: astore 8
    //   257: getstatic 184	v5/e0:a	I
    //   260: istore 10
    //   262: new 186	java/lang/StringBuilder
    //   265: dup
    //   266: invokespecial 187	java/lang/StringBuilder:<init>	()V
    //   269: astore_3
    //   270: iload 11
    //   272: istore 10
    //   274: iload 10
    //   276: aload_1
    //   277: arraylength
    //   278: if_icmpge +40 -> 318
    //   281: aload_3
    //   282: aload_1
    //   283: iload 10
    //   285: aaload
    //   286: invokevirtual 190	java/lang/Object:getClass	()Ljava/lang/Class;
    //   289: invokevirtual 194	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   292: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   295: pop
    //   296: iload 10
    //   298: aload_1
    //   299: arraylength
    //   300: iconst_1
    //   301: isub
    //   302: if_icmpge +10 -> 312
    //   305: aload_3
    //   306: ldc -57
    //   308: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   311: pop
    //   312: iinc 10 1
    //   315: goto -41 -> 274
    //   318: aload 8
    //   320: aload_3
    //   321: invokevirtual 202	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   324: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   327: pop
    //   328: aload 8
    //   330: ldc -52
    //   332: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   335: pop
    //   336: aload 8
    //   338: invokevirtual 202	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   341: astore_1
    //   342: aload_2
    //   343: invokevirtual 190	java/lang/Object:getClass	()Ljava/lang/Class;
    //   346: pop
    //   347: new 206	z4/k0
    //   350: dup
    //   351: aload_1
    //   352: invokespecial 209	z4/k0:<init>	(Ljava/lang/String;)V
    //   355: athrow
    //   356: aload_0
    //   357: getfield 22	r3/a0:b	Ljava/lang/Object;
    //   360: checkcast 153	c4/h
    //   363: aload 8
    //   365: invokeinterface 212 2 0
    //   370: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	371	0	this	a0
    //   0	371	1	paramk	t5.k
    //   0	371	2	paramUri	android.net.Uri
    //   0	371	3	paramMap	java.util.Map
    //   0	371	4	paramLong1	long
    //   0	371	6	paramLong2	long
    //   0	371	8	paramj	c4.j
    //   12	217	9	locale	c4.e
    //   48	265	10	i	int
    //   51	220	11	j	int
    //   54	113	12	bool1	boolean
    //   74	10	13	k	int
    //   143	81	14	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   91	107	140	finally
    //   91	107	189	java/io/EOFException
  }
  
  public final Object j(Object paramObject, Object... paramVarArgs)
  {
    Method localMethod = b(paramObject.getClass());
    if (localMethod != null) {
      try
      {
        paramObject = localMethod.invoke(paramObject, paramVarArgs);
        return paramObject;
      }
      catch (IllegalAccessException paramObject)
      {
        paramVarArgs = new StringBuilder();
        paramVarArgs.append("Unexpectedly could not call: ");
        paramVarArgs.append(localMethod);
        paramVarArgs = new AssertionError(paramVarArgs.toString());
        paramVarArgs.initCause((Throwable)paramObject);
        throw paramVarArgs;
      }
    }
    paramVarArgs = f.l("Method ");
    paramVarArgs.append((String)b);
    paramVarArgs.append(" not supported for object ");
    paramVarArgs.append(paramObject);
    throw new AssertionError(paramVarArgs.toString());
  }
  
  public final void k(j9.i parami)
  {
    if (q(parami)) {
      ((Set)c).remove(parami);
    } else {
      ((Set)c).add(parami);
    }
  }
  
  /* Error */
  public final void l(Object paramObject, Object... paramVarArgs)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 190	java/lang/Object:getClass	()Ljava/lang/Class;
    //   5: invokevirtual 218	r3/a0:b	(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   8: astore_3
    //   9: aload_3
    //   10: ifnonnull +6 -> 16
    //   13: goto +10 -> 23
    //   16: aload_3
    //   17: aload_1
    //   18: aload_2
    //   19: invokevirtual 221	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   22: pop
    //   23: return
    //   24: astore_1
    //   25: aload_1
    //   26: invokevirtual 249	java/lang/reflect/InvocationTargetException:getTargetException	()Ljava/lang/Throwable;
    //   29: astore_2
    //   30: aload_2
    //   31: instanceof 251
    //   34: ifeq +8 -> 42
    //   37: aload_2
    //   38: checkcast 251	java/lang/RuntimeException
    //   41: athrow
    //   42: new 228	java/lang/AssertionError
    //   45: dup
    //   46: ldc -3
    //   48: invokespecial 231	java/lang/AssertionError:<init>	(Ljava/lang/Object;)V
    //   51: astore_1
    //   52: aload_1
    //   53: aload_2
    //   54: invokevirtual 237	java/lang/Throwable:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   57: pop
    //   58: aload_1
    //   59: athrow
    //   60: astore_1
    //   61: goto -38 -> 23
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	this	a0
    //   0	64	1	paramObject	Object
    //   0	64	2	paramVarArgs	Object[]
    //   8	9	3	localMethod	Method
    // Exception table:
    //   from	to	target	type
    //   0	9	24	java/lang/reflect/InvocationTargetException
    //   16	23	24	java/lang/reflect/InvocationTargetException
    //   16	23	60	java/lang/IllegalAccessException
  }
  
  public final void m(l3.l paraml)
  {
    a = paraml;
  }
  
  public final void n(j9.i parami)
  {
    ((Set)c).add(parami);
  }
  
  public final void o(m1 paramm1)
  {
    i9.z localz = b).f;
    Iterator localIterator = localz.f(b).iterator();
    for (;;)
    {
      Object localObject = (e.a)localIterator;
      if (!((e.a)localObject).hasNext()) {
        break;
      }
      localObject = (j9.i)((e.a)localObject).next();
      ((Set)c).add(localObject);
    }
    a.remove(a);
    b.d(b);
  }
  
  public final Object p(Object paramObject, Object... paramVarArgs)
  {
    try
    {
      paramObject = j(paramObject, paramVarArgs);
      return paramObject;
    }
    catch (InvocationTargetException paramObject)
    {
      paramObject = ((InvocationTargetException)paramObject).getTargetException();
      if ((paramObject instanceof RuntimeException)) {
        throw ((RuntimeException)paramObject);
      }
      paramVarArgs = new AssertionError("Unexpected exception");
      paramVarArgs.initCause((Throwable)paramObject);
      throw paramVarArgs;
    }
  }
  
  public final boolean q(j9.i parami)
  {
    if (b).f.b.a(parami)) {
      return true;
    }
    Object localObject = b).c.values().iterator();
    while (((Iterator)localObject).hasNext()) {
      if (((v)((Iterator)localObject).next()).l(parami))
      {
        i = 1;
        break label73;
      }
    }
    int i = 0;
    label73:
    if (i != 0) {
      return true;
    }
    localObject = (l3.l)a;
    return (localObject != null) && (((l3.l)localObject).a(parami));
  }
  
  public final k9.f r(j9.i parami, m paramm)
  {
    Object localObject = b;
    if ((d)localObject != null) {
      return new k9.l(parami, (n)a, (d)localObject, paramm, (List)c);
    }
    return new o(parami, (n)a, paramm, (List)c);
  }
  
  public final Object then(Task paramTask)
  {
    paramTask = (s)paramTask.getResult();
    FirebaseAuth localFirebaseAuth = FirebaseAuth.getInstance(((r)c).K());
    String str1 = a;
    j.i(str1);
    String str2 = (String)a;
    Object localObject = (c)b;
    localFirebaseAuth.getClass();
    j.e(str1);
    j.e(str2);
    paramTask = (Task)localObject;
    if (localObject == null) {
      paramTask = new c(new c.a());
    }
    localObject = i;
    if (localObject != null) {
      p = ((String)localObject);
    }
    return e.zza(str1, str2, paramTask);
  }
}

/* Location:
 * Qualified Name:     r3.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */