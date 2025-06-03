package com.google.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class r
  extends a
{
  private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
  private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
  static final int UNINITIALIZED_HASH_CODE = 0;
  static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
  private static Map<Object, r> defaultInstanceMap = new ConcurrentHashMap();
  private int memoizedSerializedSize = -1;
  protected h0 unknownFields = h0.c();
  
  public static r A(Class paramClass)
  {
    Object localObject1 = (r)defaultInstanceMap.get(paramClass);
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      try
      {
        Class.forName(paramClass.getName(), true, paramClass.getClassLoader());
        localObject2 = (r)defaultInstanceMap.get(paramClass);
      }
      catch (ClassNotFoundException paramClass)
      {
        throw new IllegalStateException("Class initialization cannot fail.", paramClass);
      }
    }
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = ((r)k0.k(paramClass)).B();
      if (localObject1 != null) {
        defaultInstanceMap.put(paramClass, localObject1);
      } else {
        throw new IllegalStateException();
      }
    }
    return (r)localObject1;
  }
  
  public static Object F(Method paramMethod, Object paramObject, Object... paramVarArgs)
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
  
  public static final boolean H(r paramr, boolean paramBoolean)
  {
    int i = ((Byte)paramr.v(c.o)).byteValue();
    if (i == 1) {
      return true;
    }
    if (i == 0) {
      return false;
    }
    boolean bool = W.a().d(paramr).c(paramr);
    if (paramBoolean)
    {
      c localc = c.p;
      r localr;
      if (bool) {
        localr = paramr;
      } else {
        localr = null;
      }
      paramr.w(localc, localr);
    }
    return bool;
  }
  
  public static t.d L(t.d paramd)
  {
    int i = paramd.size();
    if (i == 0) {
      i = 10;
    } else {
      i *= 2;
    }
    return paramd.h(i);
  }
  
  public static t.e M(t.e parame)
  {
    int i = parame.size();
    if (i == 0) {
      i = 10;
    } else {
      i *= 2;
    }
    return parame.h(i);
  }
  
  public static Object O(K paramK, String paramString, Object[] paramArrayOfObject)
  {
    return new Y(paramK, paramString, paramArrayOfObject);
  }
  
  public static void Q(Class paramClass, r paramr)
  {
    paramr.K();
    defaultInstanceMap.put(paramClass, paramr);
  }
  
  public static t.d y()
  {
    return s.i();
  }
  
  public static t.e z()
  {
    return X.f();
  }
  
  public final r B()
  {
    return (r)v(c.t);
  }
  
  public int C()
  {
    return memoizedHashCode;
  }
  
  public int D()
  {
    return memoizedSerializedSize & 0x7FFFFFFF;
  }
  
  public boolean E()
  {
    boolean bool;
    if (C() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean G()
  {
    return H(this, true);
  }
  
  public boolean I()
  {
    boolean bool;
    if ((memoizedSerializedSize & 0x80000000) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void J()
  {
    W.a().d(this).b(this);
    K();
  }
  
  public void K()
  {
    memoizedSerializedSize &= 0x7FFFFFFF;
  }
  
  public final a N()
  {
    return (a)v(c.s);
  }
  
  public r P()
  {
    return (r)v(c.r);
  }
  
  public void R(int paramInt)
  {
    memoizedHashCode = paramInt;
  }
  
  public void S(int paramInt)
  {
    if (paramInt >= 0)
    {
      memoizedSerializedSize = (paramInt & 0x7FFFFFFF | memoizedSerializedSize & 0x80000000);
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("serialized size must be non-negative, was ");
    localStringBuilder.append(paramInt);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public int a()
  {
    return h(null);
  }
  
  public boolean equals(Object paramObject)
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
    return W.a().d(this).d(this, (r)paramObject);
  }
  
  public int h(Z paramZ)
  {
    if (I())
    {
      i = t(paramZ);
      if (i >= 0) {
        return i;
      }
      paramZ = new StringBuilder();
      paramZ.append("serialized size must be non-negative, was ");
      paramZ.append(i);
      throw new IllegalStateException(paramZ.toString());
    }
    if (D() != Integer.MAX_VALUE) {
      return D();
    }
    int i = t(paramZ);
    S(i);
    return i;
  }
  
  public int hashCode()
  {
    if (I()) {
      return s();
    }
    if (E()) {
      R(s());
    }
    return C();
  }
  
  public void j(h paramh)
  {
    W.a().d(this).h(this, i.P(paramh));
  }
  
  public Object m()
  {
    return v(c.q);
  }
  
  public void q()
  {
    memoizedHashCode = 0;
  }
  
  public void r()
  {
    S(Integer.MAX_VALUE);
  }
  
  public int s()
  {
    return W.a().d(this).g(this);
  }
  
  public final int t(Z paramZ)
  {
    if (paramZ == null) {
      return W.a().d(this).e(this);
    }
    return paramZ.e(this);
  }
  
  public String toString()
  {
    return M.f(this, super.toString());
  }
  
  public final a u()
  {
    return (a)v(c.s);
  }
  
  public Object v(c paramc)
  {
    return x(paramc, null, null);
  }
  
  public Object w(c paramc, Object paramObject)
  {
    return x(paramc, paramObject, null);
  }
  
  public abstract Object x(c paramc, Object paramObject1, Object paramObject2);
  
  public static abstract class a
    extends a.a
  {
    public final r o;
    public r p;
    
    public a(r paramr)
    {
      o = paramr;
      if (!paramr.I())
      {
        p = C();
        return;
      }
      throw new IllegalArgumentException("Default instance must be immutable.");
    }
    
    public static void B(Object paramObject1, Object paramObject2)
    {
      W.a().d(paramObject1).a(paramObject1, paramObject2);
    }
    
    private r C()
    {
      return o.P();
    }
    
    public r A()
    {
      return o;
    }
    
    public final r v()
    {
      r localr = w();
      if (localr.G()) {
        return localr;
      }
      throw a.a.u(localr);
    }
    
    public r w()
    {
      if (!p.I()) {
        return p;
      }
      p.J();
      return p;
    }
    
    public a x()
    {
      a locala = A().N();
      p = w();
      return locala;
    }
    
    public final void y()
    {
      if (!p.I()) {
        z();
      }
    }
    
    public void z()
    {
      r localr = C();
      B(localr, p);
      p = localr;
    }
  }
  
  public static class b
    extends b
  {
    public final r b;
    
    public b(r paramr)
    {
      b = paramr;
    }
  }
  
  public static enum c {}
}

/* Location:
 * Qualified Name:     com.google.protobuf.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */