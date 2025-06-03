package com.google.ads.interactivemedia.v3.internal;

final class abg
  implements yp
{
  private final acx<?> a;
  private final boolean b;
  private final Class<?> c;
  private final ym<?> d;
  private final ye<?> e;
  
  public abg(Object paramObject, acx<?> paramacx, boolean paramBoolean, Class<?> paramClass)
  {
    if ((paramObject instanceof ym)) {
      paramClass = (ym)paramObject;
    } else {
      paramClass = null;
    }
    d = paramClass;
    if ((paramObject instanceof ye)) {
      paramObject = (ye)paramObject;
    } else {
      paramObject = null;
    }
    e = ((ye)paramObject);
    boolean bool;
    if ((paramClass == null) && (paramObject == null)) {
      bool = false;
    } else {
      bool = true;
    }
    uw.a(bool);
    a = paramacx;
    b = paramBoolean;
    c = null;
  }
  
  public final <T> yn<T> a(xu paramxu, acx<T> paramacx)
  {
    acx localacx = a;
    boolean bool;
    if (localacx != null)
    {
      if ((!localacx.equals(paramacx)) && ((!b) || (a.b() != paramacx.a()))) {
        bool = false;
      } else {
        bool = true;
      }
    }
    else {
      bool = c.isAssignableFrom(paramacx.a());
    }
    if (bool) {
      return new abe(d, e, paramxu, paramacx, this);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.abg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */