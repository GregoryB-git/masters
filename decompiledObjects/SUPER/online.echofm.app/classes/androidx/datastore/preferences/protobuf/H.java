package androidx.datastore.preferences.protobuf;

public class H
{
  public final a a;
  public final Object b;
  public final Object c;
  
  public H(r0.b paramb1, Object paramObject1, r0.b paramb2, Object paramObject2)
  {
    a = new a(paramb1, paramObject1, paramb2, paramObject2);
    b = paramObject1;
    c = paramObject2;
  }
  
  public static int b(a parama, Object paramObject1, Object paramObject2)
  {
    return s.b(a, 1, paramObject1) + s.b(c, 2, paramObject2);
  }
  
  public static H d(r0.b paramb1, Object paramObject1, r0.b paramb2, Object paramObject2)
  {
    return new H(paramb1, paramObject1, paramb2, paramObject2);
  }
  
  public static void e(j paramj, a parama, Object paramObject1, Object paramObject2)
  {
    s.u(paramj, a, 1, paramObject1);
    s.u(paramj, c, 2, paramObject2);
  }
  
  public int a(int paramInt, Object paramObject1, Object paramObject2)
  {
    return j.P(paramInt) + j.y(b(a, paramObject1, paramObject2));
  }
  
  public a c()
  {
    return a;
  }
  
  public static class a
  {
    public final r0.b a;
    public final Object b;
    public final r0.b c;
    public final Object d;
    
    public a(r0.b paramb1, Object paramObject1, r0.b paramb2, Object paramObject2)
    {
      a = paramb1;
      b = paramObject1;
      c = paramb2;
      d = paramObject2;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.H
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */