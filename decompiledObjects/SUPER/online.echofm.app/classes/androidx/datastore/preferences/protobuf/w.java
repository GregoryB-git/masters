package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class w
  extends a
{
  private static Map<Object, w> defaultInstanceMap = new ConcurrentHashMap();
  protected int memoizedSerializedSize = -1;
  protected m0 unknownFields = m0.e();
  
  public static y.b A(y.b paramb)
  {
    int i = paramb.size();
    if (i == 0) {
      i = 10;
    } else {
      i *= 2;
    }
    return paramb.h(i);
  }
  
  public static Object C(O paramO, String paramString, Object[] paramArrayOfObject)
  {
    return new c0(paramO, paramString, paramArrayOfObject);
  }
  
  public static w D(w paramw, InputStream paramInputStream)
  {
    return o(E(paramw, h.f(paramInputStream), o.b()));
  }
  
  public static w E(w paramw, h paramh, o paramo)
  {
    paramw = (w)paramw.q(d.r);
    try
    {
      e0 locale0 = a0.a().d(paramw);
      locale0.h(paramw, i.O(paramh), paramo);
      locale0.b(paramw);
      return paramw;
    }
    catch (RuntimeException paramw) {}catch (IOException paramh) {}
    if ((paramw.getCause() instanceof z)) {
      throw ((z)paramw.getCause());
    }
    throw paramw;
    if ((paramh.getCause() instanceof z)) {
      throw ((z)paramh.getCause());
    }
    throw new z(paramh.getMessage()).i(paramw);
  }
  
  public static void F(Class paramClass, w paramw)
  {
    defaultInstanceMap.put(paramClass, paramw);
  }
  
  public static w o(w paramw)
  {
    if ((paramw != null) && (!paramw.x())) {
      throw paramw.k().a().i(paramw);
    }
    return paramw;
  }
  
  public static y.b t()
  {
    return b0.f();
  }
  
  public static w u(Class paramClass)
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
      localObject1 = ((w)p0.i(paramClass)).v();
      if (localObject1 != null) {
        defaultInstanceMap.put(paramClass, localObject1);
      } else {
        throw new IllegalStateException();
      }
    }
    return (w)localObject1;
  }
  
  public static Object w(Method paramMethod, Object paramObject, Object... paramVarArgs)
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
  
  public static final boolean y(w paramw, boolean paramBoolean)
  {
    int i = ((Byte)paramw.q(d.o)).byteValue();
    if (i == 1) {
      return true;
    }
    if (i == 0) {
      return false;
    }
    boolean bool = a0.a().d(paramw).c(paramw);
    if (paramBoolean)
    {
      d locald = d.p;
      w localw;
      if (bool) {
        localw = paramw;
      } else {
        localw = null;
      }
      paramw.r(locald, localw);
    }
    return bool;
  }
  
  public final a B()
  {
    return (a)q(d.s);
  }
  
  public final a G()
  {
    a locala = (a)q(d.s);
    locala.y(this);
    return locala;
  }
  
  public int a()
  {
    if (memoizedSerializedSize == -1) {
      memoizedSerializedSize = a0.a().d(this).e(this);
    }
    return memoizedSerializedSize;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!v().getClass().isInstance(paramObject)) {
      return false;
    }
    return a0.a().d(this).d(this, (w)paramObject);
  }
  
  public void g(j paramj)
  {
    a0.a().d(this).i(this, k.P(paramj));
  }
  
  public int hashCode()
  {
    int i = memoizedHashCode;
    if (i != 0) {
      return i;
    }
    i = a0.a().d(this).g(this);
    memoizedHashCode = i;
    return i;
  }
  
  public int i()
  {
    return memoizedSerializedSize;
  }
  
  public void l(int paramInt)
  {
    memoizedSerializedSize = paramInt;
  }
  
  public Object n()
  {
    return q(d.q);
  }
  
  public final a p()
  {
    return (a)q(d.s);
  }
  
  public Object q(d paramd)
  {
    return s(paramd, null, null);
  }
  
  public Object r(d paramd, Object paramObject)
  {
    return s(paramd, paramObject, null);
  }
  
  public abstract Object s(d paramd, Object paramObject1, Object paramObject2);
  
  public String toString()
  {
    return Q.e(this, super.toString());
  }
  
  public final w v()
  {
    return (w)q(d.t);
  }
  
  public final boolean x()
  {
    return y(this, true);
  }
  
  public void z()
  {
    a0.a().d(this).b(this);
  }
  
  public static abstract class a
    extends a.a
  {
    public final w o;
    public w p;
    public boolean q;
    
    public a(w paramw)
    {
      o = paramw;
      p = ((w)paramw.q(w.d.r));
      q = false;
    }
    
    public final w s()
    {
      w localw = t();
      if (localw.x()) {
        return localw;
      }
      throw a.a.p(localw);
    }
    
    public w t()
    {
      if (q) {
        return p;
      }
      p.z();
      q = true;
      return p;
    }
    
    public a u()
    {
      a locala = w().B();
      locala.y(t());
      return locala;
    }
    
    public void v()
    {
      if (q)
      {
        w localw = (w)p.q(w.d.r);
        z(localw, p);
        p = localw;
        q = false;
      }
    }
    
    public w w()
    {
      return o;
    }
    
    public a x(w paramw)
    {
      return y(paramw);
    }
    
    public a y(w paramw)
    {
      v();
      z(p, paramw);
      return this;
    }
    
    public final void z(w paramw1, w paramw2)
    {
      a0.a().d(paramw1).a(paramw1, paramw2);
    }
  }
  
  public static class b
    extends b
  {
    public final w b;
    
    public b(w paramw)
    {
      b = paramw;
    }
  }
  
  public static abstract class c
    extends m
  {}
  
  public static enum d
  {
    static
    {
      d locald1 = new d("GET_MEMOIZED_IS_INITIALIZED", 0);
      o = locald1;
      d locald2 = new d("SET_MEMOIZED_IS_INITIALIZED", 1);
      p = locald2;
      d locald3 = new d("BUILD_MESSAGE_INFO", 2);
      q = locald3;
      d locald4 = new d("NEW_MUTABLE_INSTANCE", 3);
      r = locald4;
      d locald5 = new d("NEW_BUILDER", 4);
      s = locald5;
      d locald6 = new d("GET_DEFAULT_INSTANCE", 5);
      t = locald6;
      d locald7 = new d("GET_PARSER", 6);
      u = locald7;
      v = new d[] { locald1, locald2, locald3, locald4, locald5, locald6, locald7 };
    }
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */