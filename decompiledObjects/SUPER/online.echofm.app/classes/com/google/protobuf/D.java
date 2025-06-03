package com.google.protobuf;

public class D
{
  public final a a;
  public final Object b;
  public final Object c;
  
  public D(m0.b paramb1, Object paramObject1, m0.b paramb2, Object paramObject2)
  {
    a = new a(paramb1, paramObject1, paramb2, paramObject2);
    b = paramObject1;
    c = paramObject2;
  }
  
  public static int b(a parama, Object paramObject1, Object paramObject2)
  {
    return o.b(a, 1, paramObject1) + o.b(c, 2, paramObject2);
  }
  
  public static D d(m0.b paramb1, Object paramObject1, m0.b paramb2, Object paramObject2)
  {
    return new D(paramb1, paramObject1, paramb2, paramObject2);
  }
  
  public static void e(h paramh, a parama, Object paramObject1, Object paramObject2)
  {
    o.u(paramh, a, 1, paramObject1);
    o.u(paramh, c, 2, paramObject2);
  }
  
  public int a(int paramInt, Object paramObject1, Object paramObject2)
  {
    return h.O(paramInt) + h.z(b(a, paramObject1, paramObject2));
  }
  
  public a c()
  {
    return a;
  }
  
  public static class a
  {
    public final m0.b a;
    public final Object b;
    public final m0.b c;
    public final Object d;
    
    public a(m0.b paramb1, Object paramObject1, m0.b paramb2, Object paramObject2)
    {
      a = paramb1;
      b = paramObject1;
      c = paramb2;
      d = paramObject2;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.D
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */