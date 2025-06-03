package r;

import java.util.Map;

public final class a
  extends g<Object, Object>
{
  public a(b paramb) {}
  
  public final void a()
  {
    d.clear();
  }
  
  public final Object b(int paramInt1, int paramInt2)
  {
    return d.b[((paramInt1 << 1) + paramInt2)];
  }
  
  public final Map<Object, Object> c()
  {
    return d;
  }
  
  public final int d()
  {
    return d.c;
  }
  
  public final int e(Object paramObject)
  {
    return d.f(paramObject);
  }
  
  public final int f(Object paramObject)
  {
    return d.h(paramObject);
  }
  
  public final void g(Object paramObject1, Object paramObject2)
  {
    d.put(paramObject1, paramObject2);
  }
  
  public final void h(int paramInt)
  {
    d.j(paramInt);
  }
  
  public final Object i(int paramInt, Object paramObject)
  {
    b localb = d;
    paramInt = (paramInt << 1) + 1;
    Object[] arrayOfObject = b;
    localb = arrayOfObject[paramInt];
    arrayOfObject[paramInt] = paramObject;
    return localb;
  }
}

/* Location:
 * Qualified Name:     r.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */