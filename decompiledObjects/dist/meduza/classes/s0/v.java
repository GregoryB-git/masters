package s0;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class v<MessageType extends v<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
  extends a<MessageType, BuilderType>
{
  private static Map<Object, v<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
  public int memoizedSerializedSize = -1;
  public i1 unknownFields = i1.f;
  
  public static <T extends v<?, ?>> T l(Class<T> paramClass)
  {
    Object localObject1 = (v)defaultInstanceMap.get(paramClass);
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      try
      {
        Class.forName(paramClass.getName(), true, paramClass.getClassLoader());
        localObject2 = (v)defaultInstanceMap.get(paramClass);
      }
      catch (ClassNotFoundException paramClass)
      {
        throw new IllegalStateException("Class initialization cannot fail.", paramClass);
      }
    }
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = (v)((v)l1.a(paramClass)).k(f.f);
      if (localObject1 != null) {
        defaultInstanceMap.put(paramClass, localObject1);
      } else {
        throw new IllegalStateException();
      }
    }
    return (T)localObject1;
  }
  
  static Object m(Method paramMethod, Object paramObject, Object... paramVarArgs)
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
  
  public static <T extends v<T, ?>> T n(T paramT, h paramh, n paramn)
  {
    v localv = (v)paramT.k(f.d);
    try
    {
      paramT = y0.c;
      paramT.getClass();
      c1 localc1 = paramT.a(localv.getClass());
      paramT = d;
      if (paramT == null) {
        paramT = new i(paramh);
      }
      localc1.i(localv, paramT, paramn);
      localc1.b(localv);
      return localv;
    }
    catch (RuntimeException paramT) {}catch (IOException paramT) {}
    if ((paramT.getCause() instanceof y)) {
      throw ((y)paramT.getCause());
    }
    throw paramT;
    if ((paramT.getCause() instanceof y)) {
      throw ((y)paramT.getCause());
    }
    throw new y(paramT.getMessage());
  }
  
  public static <T extends v<?, ?>> void o(Class<T> paramClass, T paramT)
  {
    defaultInstanceMap.put(paramClass, paramT);
  }
  
  public a a()
  {
    a locala = (a)k(f.e);
    locala.j();
    a.k(b, this);
    return locala;
  }
  
  public v b()
  {
    return (v)k(f.f);
  }
  
  public final int d()
  {
    if (memoizedSerializedSize == -1)
    {
      y0 localy0 = y0.c;
      localy0.getClass();
      memoizedSerializedSize = localy0.a(getClass()).e(this);
    }
    return memoizedSerializedSize;
  }
  
  public a e()
  {
    return (a)k(f.e);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!((v)k(f.f)).getClass().isInstance(paramObject)) {
      return false;
    }
    y0 localy0 = y0.c;
    localy0.getClass();
    return localy0.a(getClass()).d(this, (v)paramObject);
  }
  
  public final boolean f()
  {
    int i = ((Byte)k(f.a)).byteValue();
    boolean bool = true;
    if (i != 1) {
      if (i == 0)
      {
        bool = false;
      }
      else
      {
        y0 localy0 = y0.c;
        localy0.getClass();
        bool = localy0.a(getClass()).c(this);
        k(f.b);
      }
    }
    return bool;
  }
  
  public final void g(j paramj)
  {
    Object localObject = y0.c;
    localObject.getClass();
    c1 localc1 = ((y0)localObject).a(getClass());
    localObject = b;
    if (localObject != null) {
      paramj = (j)localObject;
    } else {
      paramj = new k(paramj);
    }
    localc1.h(this, paramj);
  }
  
  final int h()
  {
    return memoizedSerializedSize;
  }
  
  public final int hashCode()
  {
    int i = memoizedHashCode;
    if (i != 0) {
      return i;
    }
    y0 localy0 = y0.c;
    localy0.getClass();
    i = localy0.a(getClass()).g(this);
    memoizedHashCode = i;
    return i;
  }
  
  final void j(int paramInt)
  {
    memoizedSerializedSize = paramInt;
  }
  
  public abstract Object k(f paramf);
  
  public final String toString()
  {
    String str = super.toString();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("# ");
    localStringBuilder.append(str);
    q0.c(this, localStringBuilder, 0);
    return localStringBuilder.toString();
  }
  
  public static abstract class a<MessageType extends v<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
    extends a.a<MessageType, BuilderType>
  {
    public final MessageType a;
    public MessageType b;
    public boolean c;
    
    public a(MessageType paramMessageType)
    {
      a = paramMessageType;
      b = ((v)paramMessageType.k(v.f.d));
      c = false;
    }
    
    public static void k(v paramv1, v paramv2)
    {
      y0 localy0 = y0.c;
      localy0.getClass();
      localy0.a(paramv1.getClass()).a(paramv1, paramv2);
    }
    
    public final v b()
    {
      return a;
    }
    
    public final Object clone()
    {
      a locala = (a)a.k(v.f.e);
      v localv = i();
      locala.j();
      k(b, localv);
      return locala;
    }
    
    public final MessageType h()
    {
      v localv = i();
      if (localv.f()) {
        return localv;
      }
      throw new g3.b();
    }
    
    public final MessageType i()
    {
      if (c) {
        return b;
      }
      v localv = b;
      localv.getClass();
      y0 localy0 = y0.c;
      localy0.getClass();
      localy0.a(localv.getClass()).b(localv);
      c = true;
      return b;
    }
    
    public final void j()
    {
      if (c)
      {
        v localv = (v)b.k(v.f.d);
        k(localv, b);
        b = localv;
        c = false;
      }
    }
  }
  
  public static final class b<T extends v<T, ?>>
    extends b<T>
  {
    public b(T paramT) {}
  }
  
  public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType>
    extends v<MessageType, BuilderType>
    implements p0
  {
    public r<v.d> extensions = r.d;
    
    public final v.a a()
    {
      v.a locala = (v.a)k(v.f.e);
      locala.j();
      v.a.k(b, this);
      return locala;
    }
    
    public final v b()
    {
      return (v)k(v.f.f);
    }
    
    public final v.a e()
    {
      return (v.a)k(v.f.e);
    }
  }
  
  public static final class d
    implements r.a<d>
  {
    public final void a() {}
    
    public final void b() {}
    
    public final void c() {}
    
    public final int compareTo(Object paramObject)
    {
      ((d)paramObject).getClass();
      return 0;
    }
    
    public final o1 d()
    {
      throw null;
    }
    
    public final void e() {}
    
    public final v.a j(o0.a parama, o0 paramo0)
    {
      parama = (v.a)parama;
      paramo0 = (v)paramo0;
      parama.j();
      v.a.k(b, paramo0);
      return parama;
    }
  }
  
  public static final class e<ContainingType extends o0, Type>
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
      o = new f[] { localf1, localf2, localf3, localf4, localf5, localf6, new f("GET_PARSER", 6) };
    }
    
    public f() {}
  }
}

/* Location:
 * Qualified Name:     s0.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */