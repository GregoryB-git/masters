package ma;

import f;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class w<MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
  extends a<MessageType, BuilderType>
{
  private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
  private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
  public static final int UNINITIALIZED_HASH_CODE = 0;
  public static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
  private static Map<Object, w<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
  private int memoizedSerializedSize = -1;
  public q1 unknownFields = q1.f;
  
  public static <E> a0.d<E> A(a0.d<E> paramd)
  {
    int i = paramd.size();
    if (i == 0) {
      i = 10;
    } else {
      i *= 2;
    }
    return paramd.c(i);
  }
  
  public static <T extends w<T, ?>> T B(T paramT, byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    o localo = o.a();
    paramT = (w)paramT.t(f.d);
    try
    {
      try
      {
        Object localObject = d1.c;
        localObject.getClass();
        i1 locali1 = ((d1)localObject).a(paramT.getClass());
        localObject = new ma/f$a;
        ((f.a)localObject).<init>(localo);
        locali1.j(paramT, paramArrayOfByte, 0, i + 0, (f.a)localObject);
        locali1.b(paramT);
        p(paramT);
        return paramT;
      }
      catch (o1 paramT) {}catch (IndexOutOfBoundsException paramT)
      {
        throw b0.h();
      }
      catch (IOException paramT)
      {
        if ((paramT.getCause() instanceof b0)) {
          throw ((b0)paramT.getCause());
        }
        throw new b0(paramT);
      }
      throw new b0(paramT.getMessage());
    }
    catch (b0 paramArrayOfByte)
    {
      paramT = paramArrayOfByte;
      if (b) {
        paramT = new b0(paramArrayOfByte);
      }
      throw paramT;
    }
  }
  
  public static <T extends w<T, ?>> T C(T paramT, i parami, o paramo)
  {
    w localw = (w)paramT.t(f.d);
    try
    {
      try
      {
        paramT = d1.c;
        paramT.getClass();
        i1 locali1 = paramT.a(localw.getClass());
        paramT = d;
        if (paramT == null) {
          paramT = new j(parami);
        }
        locali1.i(localw, paramT, paramo);
        locali1.b(localw);
        return localw;
      }
      catch (RuntimeException paramT) {}catch (IOException paramT)
      {
        break label103;
      }
      catch (o1 paramT) {}
      if ((paramT.getCause() instanceof b0)) {
        throw ((b0)paramT.getCause());
      }
      throw paramT;
    }
    catch (b0 parami)
    {
      label103:
      paramT = parami;
      if (!b) {
        break label161;
      }
      paramT = new b0(parami);
      throw paramT;
    }
    if ((paramT.getCause() instanceof b0)) {
      throw ((b0)paramT.getCause());
    }
    throw new b0(paramT);
    throw new b0(paramT.getMessage());
  }
  
  public static <T extends w<?, ?>> void D(Class<T> paramClass, T paramT)
  {
    paramT.z();
    defaultInstanceMap.put(paramClass, paramT);
  }
  
  public static void p(w paramw)
  {
    if (x(paramw, true)) {
      return;
    }
    throw new b0(new o1().getMessage());
  }
  
  public static <T extends w<?, ?>> T u(Class<T> paramClass)
  {
    Object localObject1 = (w)defaultInstanceMap.get(paramClass);
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      try
      {
        Class.forName(paramClass.getName(), true, paramClass.getClassLoader());
        localObject2 = (w)defaultInstanceMap.get(paramClass);
      }
      catch (ClassNotFoundException paramClass)
      {
        throw new IllegalStateException("Class initialization cannot fail.", paramClass);
      }
    }
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = (w)((w)t1.b(paramClass)).t(f.f);
      if (localObject1 != null) {
        defaultInstanceMap.put(paramClass, localObject1);
      } else {
        throw new IllegalStateException();
      }
    }
    return (T)localObject1;
  }
  
  static Object w(Method paramMethod, Object paramObject, Object... paramVarArgs)
  {
    try
    {
      paramMethod = paramMethod.invoke(paramObject, paramVarArgs);
      return paramMethod;
    }
    catch (InvocationTargetException paramMethod)
    {
      paramMethod = paramMethod.getCause();
      if (!(paramMethod instanceof RuntimeException))
      {
        if ((paramMethod instanceof Error)) {
          throw ((Error)paramMethod);
        }
        throw new RuntimeException("Unexpected exception thrown by generated accessor method.", paramMethod);
      }
      throw ((RuntimeException)paramMethod);
    }
    catch (IllegalAccessException paramMethod)
    {
      throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", paramMethod);
    }
  }
  
  public static final <T extends w<T, ?>> boolean x(T paramT, boolean paramBoolean)
  {
    int i = ((Byte)paramT.t(f.a)).byteValue();
    if (i == 1) {
      return true;
    }
    if (i == 0) {
      return false;
    }
    d1 locald1 = d1.c;
    locald1.getClass();
    boolean bool = locald1.a(paramT.getClass()).c(paramT);
    if (paramBoolean) {
      paramT.t(f.b);
    }
    return bool;
  }
  
  public final BuilderType E()
  {
    a locala = (a)t(f.e);
    locala.n(this);
    return locala;
  }
  
  public w b()
  {
    return (w)t(f.f);
  }
  
  public final int d()
  {
    return m(null);
  }
  
  public a e()
  {
    return (a)t(f.e);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (getClass() != paramObject.getClass()) {
      return false;
    }
    d1 locald1 = d1.c;
    locald1.getClass();
    return locald1.a(getClass()).d(this, (w)paramObject);
  }
  
  public final boolean f()
  {
    return x(this, true);
  }
  
  public final int hashCode()
  {
    d1 locald1;
    if (y())
    {
      locald1 = d1.c;
      locald1.getClass();
      return locald1.a(getClass()).g(this);
    }
    int i;
    if (memoizedHashCode == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      locald1 = d1.c;
      locald1.getClass();
      memoizedHashCode = locald1.a(getClass()).g(this);
    }
    return memoizedHashCode;
  }
  
  public final void i(k paramk)
  {
    Object localObject = d1.c;
    localObject.getClass();
    i1 locali1 = ((d1)localObject).a(getClass());
    localObject = b;
    if (localObject != null) {
      paramk = (k)localObject;
    } else {
      paramk = new l(paramk);
    }
    locali1.h(this, paramk);
  }
  
  final int l()
  {
    return memoizedSerializedSize & 0x7FFFFFFF;
  }
  
  public final int m(i1 parami1)
  {
    if (y())
    {
      locali1 = parami1;
      if (parami1 == null)
      {
        parami1 = d1.c;
        parami1.getClass();
        locali1 = parami1.a(getClass());
      }
      i = locali1.e(this);
      if (i >= 0) {
        return i;
      }
      throw new IllegalStateException(f.h("serialized size must be non-negative, was ", i));
    }
    if (l() != Integer.MAX_VALUE) {
      return l();
    }
    i1 locali1 = parami1;
    if (parami1 == null)
    {
      parami1 = d1.c;
      parami1.getClass();
      locali1 = parami1.a(getClass());
    }
    int i = locali1.e(this);
    o(i);
    return i;
  }
  
  final void o(int paramInt)
  {
    if (paramInt >= 0)
    {
      memoizedSerializedSize = (paramInt & 0x7FFFFFFF | memoizedSerializedSize & 0x80000000);
      return;
    }
    throw new IllegalStateException(f.h("serialized size must be non-negative, was ", paramInt));
  }
  
  public final void q()
  {
    memoizedHashCode = 0;
  }
  
  public final void r()
  {
    o(Integer.MAX_VALUE);
  }
  
  public final <MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType s()
  {
    return (a)t(f.e);
  }
  
  public abstract Object t(f paramf);
  
  public final String toString()
  {
    String str = super.toString();
    Object localObject = u0.a;
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("# ");
    ((StringBuilder)localObject).append(str);
    u0.c(this, (StringBuilder)localObject, 0);
    return ((StringBuilder)localObject).toString();
  }
  
  public final b1<MessageType> v()
  {
    return (b1)t(f.o);
  }
  
  final boolean y()
  {
    boolean bool;
    if ((memoizedSerializedSize & 0x80000000) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void z()
  {
    memoizedSerializedSize &= 0x7FFFFFFF;
  }
  
  public static abstract class a<MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
    extends a.a<MessageType, BuilderType>
  {
    public final MessageType a;
    public MessageType b;
    
    public a(MessageType paramMessageType)
    {
      a = paramMessageType;
      if (!paramMessageType.y())
      {
        b = ((w)paramMessageType.t(w.f.d));
        return;
      }
      throw new IllegalArgumentException("Default instance must be immutable.");
    }
    
    public static void o(w paramw, Object paramObject)
    {
      d1 locald1 = d1.c;
      locald1.getClass();
      locald1.a(paramw.getClass()).a(paramw, paramObject);
    }
    
    public final w b()
    {
      return a;
    }
    
    public final Object clone()
    {
      a locala = (a)a.t(w.f.e);
      b = l();
      return locala;
    }
    
    public final boolean f()
    {
      return w.x(b, false);
    }
    
    public final MessageType k()
    {
      w localw = l();
      localw.getClass();
      if (w.x(localw, true)) {
        return localw;
      }
      throw new o1();
    }
    
    public final MessageType l()
    {
      if (!b.y()) {
        return b;
      }
      w localw = b;
      localw.getClass();
      d1 locald1 = d1.c;
      locald1.getClass();
      locald1.a(localw.getClass()).b(localw);
      localw.z();
      return b;
    }
    
    public final void m()
    {
      if (!b.y())
      {
        w localw = (w)a.t(w.f.d);
        o(localw, b);
        b = localw;
      }
    }
    
    public final void n(w paramw)
    {
      if (a.equals(paramw)) {
        return;
      }
      m();
      o(b, paramw);
    }
  }
  
  public static final class b<T extends w<T, ?>>
    extends b<T>
  {
    public final T a;
    
    public b(T paramT)
    {
      a = paramT;
    }
  }
  
  public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType>
    extends w<MessageType, BuilderType>
    implements t0
  {
    public s<w.d> extensions = s.d;
    
    public final w b()
    {
      return (w)t(w.f.f);
    }
    
    public final w.a e()
    {
      return (w.a)t(w.f.e);
    }
  }
  
  public static final class d
    implements s.a<d>
  {
    public final void a() {}
    
    public final void b() {}
    
    public final void c() {}
    
    public final int compareTo(Object paramObject)
    {
      ((d)paramObject).getClass();
      return 0;
    }
    
    public final w1 d()
    {
      throw null;
    }
    
    public final void e() {}
    
    public final w.a k(s0.a parama, s0 params0)
    {
      parama = (w.a)parama;
      parama.n((w)params0);
      return parama;
    }
  }
  
  public static final class e<ContainingType extends s0, Type>
    extends e9.a
  {}
  
  public static enum f
  {
    static
    {
      f localf1 = new f("GET_MEMOIZED_IS_INITIALIZED", 0);
      a = localf1;
      f localf2 = new f("SET_MEMOIZED_IS_INITIALIZED", 1);
      b = localf2;
      f localf3 = new f("BUILD_MESSAGE_INFO", 2);
      c = localf3;
      f localf4 = new f("NEW_MUTABLE_INSTANCE", 3);
      d = localf4;
      f localf5 = new f("NEW_BUILDER", 4);
      e = localf5;
      f localf6 = new f("GET_DEFAULT_INSTANCE", 5);
      f = localf6;
      f localf7 = new f("GET_PARSER", 6);
      o = localf7;
      p = new f[] { localf1, localf2, localf3, localf4, localf5, localf6, localf7 };
    }
    
    public f() {}
  }
}

/* Location:
 * Qualified Name:     ma.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */