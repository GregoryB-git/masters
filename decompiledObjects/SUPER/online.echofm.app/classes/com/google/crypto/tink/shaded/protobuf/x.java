package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class x
  extends a
{
  private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
  private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
  static final int UNINITIALIZED_HASH_CODE = 0;
  static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
  private static Map<Object, x> defaultInstanceMap = new ConcurrentHashMap();
  private int memoizedSerializedSize = -1;
  protected l0 unknownFields = l0.c();
  
  public static Object A(Method paramMethod, Object paramObject, Object... paramVarArgs)
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
  
  public static final boolean C(x paramx, boolean paramBoolean)
  {
    int i = ((Byte)paramx.r(d.o)).byteValue();
    if (i == 1) {
      return true;
    }
    if (i == 0) {
      return false;
    }
    boolean bool = a0.a().d(paramx).c(paramx);
    if (paramBoolean)
    {
      d locald = d.p;
      x localx;
      if (bool) {
        localx = paramx;
      } else {
        localx = null;
      }
      paramx.s(locald, localx);
    }
    return bool;
  }
  
  public static z.d G(z.d paramd)
  {
    int i = paramd.size();
    if (i == 0) {
      i = 10;
    } else {
      i *= 2;
    }
    return paramd.h(i);
  }
  
  public static Object I(O paramO, String paramString, Object[] paramArrayOfObject)
  {
    return new c0(paramO, paramString, paramArrayOfObject);
  }
  
  public static x K(x paramx, h paramh, p paramp)
  {
    return l(N(paramx, paramh, paramp));
  }
  
  public static x L(x paramx, InputStream paramInputStream, p paramp)
  {
    return l(O(paramx, i.f(paramInputStream), paramp));
  }
  
  public static x M(x paramx, byte[] paramArrayOfByte, p paramp)
  {
    return l(P(paramx, paramArrayOfByte, 0, paramArrayOfByte.length, paramp));
  }
  
  public static x N(x paramx, h paramh, p paramp)
  {
    paramh = paramh.U();
    paramx = O(paramx, paramh, paramp);
    try
    {
      paramh.a(0);
      return paramx;
    }
    catch (A paramh)
    {
      throw paramh.k(paramx);
    }
  }
  
  public static x O(x paramx, i parami, p paramp)
  {
    x localx = paramx.J();
    try
    {
      paramx = a0.a().d(localx);
      paramx.j(localx, j.O(parami), paramp);
      paramx.b(localx);
      return localx;
    }
    catch (RuntimeException paramx) {}catch (IOException paramx)
    {
      break label70;
    }
    catch (j0 paramx)
    {
      break label101;
    }
    catch (A parami) {}
    if ((paramx.getCause() instanceof A)) {
      throw ((A)paramx.getCause());
    }
    throw paramx;
    label70:
    if ((paramx.getCause() instanceof A)) {
      throw ((A)paramx.getCause());
    }
    throw new A(paramx).k(localx);
    label101:
    throw paramx.a().k(localx);
    paramx = parami;
    if (parami.a()) {
      paramx = new A(parami);
    }
    throw paramx.k(localx);
  }
  
  public static x P(x paramx, byte[] paramArrayOfByte, int paramInt1, int paramInt2, p paramp)
  {
    x localx = paramx.J();
    try
    {
      paramx = a0.a().d(localx);
      e.a locala = new com/google/crypto/tink/shaded/protobuf/e$a;
      locala.<init>(paramp);
      paramx.h(localx, paramArrayOfByte, paramInt1, paramInt1 + paramInt2, locala);
      paramx.b(localx);
      return localx;
    }
    catch (IOException paramx) {}catch (j0 paramx)
    {
      break label107;
    }
    catch (A paramArrayOfByte) {}catch (IndexOutOfBoundsException paramx)
    {
      throw A.m().k(localx);
    }
    if ((paramx.getCause() instanceof A)) {
      throw ((A)paramx.getCause());
    }
    throw new A(paramx).k(localx);
    label107:
    throw paramx.a().k(localx);
    paramx = paramArrayOfByte;
    if (paramArrayOfByte.a()) {
      paramx = new A(paramArrayOfByte);
    }
    throw paramx.k(localx);
  }
  
  public static void Q(Class paramClass, x paramx)
  {
    paramx.F();
    defaultInstanceMap.put(paramClass, paramx);
  }
  
  public static x l(x paramx)
  {
    if ((paramx != null) && (!paramx.B())) {
      throw paramx.i().a().k(paramx);
    }
    return paramx;
  }
  
  public static z.d u()
  {
    return b0.f();
  }
  
  public static x v(Class paramClass)
  {
    Object localObject1 = (x)defaultInstanceMap.get(paramClass);
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      try
      {
        Class.forName(paramClass.getName(), true, paramClass.getClassLoader());
        localObject2 = (x)defaultInstanceMap.get(paramClass);
      }
      catch (ClassNotFoundException paramClass)
      {
        throw new IllegalStateException("Class initialization cannot fail.", paramClass);
      }
    }
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = ((x)o0.k(paramClass)).w();
      if (localObject1 != null) {
        defaultInstanceMap.put(paramClass, localObject1);
      } else {
        throw new IllegalStateException();
      }
    }
    return (x)localObject1;
  }
  
  public final boolean B()
  {
    return C(this, true);
  }
  
  public boolean D()
  {
    boolean bool;
    if ((memoizedSerializedSize & 0x80000000) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void E()
  {
    a0.a().d(this).b(this);
    F();
  }
  
  public void F()
  {
    memoizedSerializedSize &= 0x7FFFFFFF;
  }
  
  public final a H()
  {
    return (a)r(d.s);
  }
  
  public x J()
  {
    return (x)r(d.r);
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
  
  public final a T()
  {
    return ((a)r(d.s)).v(this);
  }
  
  public int a()
  {
    return e(null);
  }
  
  public int e(e0 parame0)
  {
    if (D())
    {
      i = p(parame0);
      if (i >= 0) {
        return i;
      }
      parame0 = new StringBuilder();
      parame0.append("serialized size must be non-negative, was ");
      parame0.append(i);
      throw new IllegalStateException(parame0.toString());
    }
    if (y() != Integer.MAX_VALUE) {
      return y();
    }
    int i = p(parame0);
    S(i);
    return i;
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
    return a0.a().d(this).d(this, (x)paramObject);
  }
  
  public void g(k paramk)
  {
    a0.a().d(this).i(this, l.P(paramk));
  }
  
  public int hashCode()
  {
    if (D()) {
      return o();
    }
    if (z()) {
      R(o());
    }
    return x();
  }
  
  public Object k()
  {
    return r(d.q);
  }
  
  public void m()
  {
    memoizedHashCode = 0;
  }
  
  public void n()
  {
    S(Integer.MAX_VALUE);
  }
  
  public int o()
  {
    return a0.a().d(this).g(this);
  }
  
  public final int p(e0 parame0)
  {
    if (parame0 == null) {
      return a0.a().d(this).e(this);
    }
    return parame0.e(this);
  }
  
  public final a q()
  {
    return (a)r(d.s);
  }
  
  public Object r(d paramd)
  {
    return t(paramd, null, null);
  }
  
  public Object s(d paramd, Object paramObject)
  {
    return t(paramd, paramObject, null);
  }
  
  public abstract Object t(d paramd, Object paramObject1, Object paramObject2);
  
  public String toString()
  {
    return Q.f(this, super.toString());
  }
  
  public final x w()
  {
    return (x)r(d.t);
  }
  
  public int x()
  {
    return memoizedHashCode;
  }
  
  public int y()
  {
    return memoizedSerializedSize & 0x7FFFFFFF;
  }
  
  public boolean z()
  {
    boolean bool;
    if (x() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static abstract class a
    extends a.a
  {
    public final x o;
    public x p;
    
    public a(x paramx)
    {
      o = paramx;
      if (!paramx.D())
      {
        p = x();
        return;
      }
      throw new IllegalArgumentException("Default instance must be immutable.");
    }
    
    public static void w(Object paramObject1, Object paramObject2)
    {
      a0.a().d(paramObject1).a(paramObject1, paramObject2);
    }
    
    private x x()
    {
      return o.J();
    }
    
    public final x n()
    {
      x localx = o();
      if (localx.B()) {
        return localx;
      }
      throw a.a.l(localx);
    }
    
    public x o()
    {
      if (!p.D()) {
        return p;
      }
      p.E();
      return p;
    }
    
    public a p()
    {
      a locala = u().H();
      p = o();
      return locala;
    }
    
    public final void s()
    {
      if (!p.D()) {
        t();
      }
    }
    
    public void t()
    {
      x localx = x();
      w(localx, p);
      p = localx;
    }
    
    public x u()
    {
      return o;
    }
    
    public a v(x paramx)
    {
      if (u().equals(paramx)) {
        return this;
      }
      s();
      w(p, paramx);
      return this;
    }
  }
  
  public static class b
    extends b
  {
    public final x b;
    
    public b(x paramx)
    {
      b = paramx;
    }
  }
  
  public static abstract class c
    extends n
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
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */