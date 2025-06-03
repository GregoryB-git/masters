package ec;

import dc.b;
import dc.c;
import dc.d;
import dc.e;
import dc.h;
import dc.j;
import dc.k;
import dc.l;
import dc.m;
import dc.n;
import dc.o;
import dc.p;
import dc.q;
import dc.r;
import dc.s;
import dc.t;
import dc.u;
import dc.w;

public final class v
{
  public static void a(int paramInt, Object paramObject)
  {
    if ((paramObject != null) && (!b(paramInt, paramObject)))
    {
      String str = f.h("kotlin.jvm.functions.Function", paramInt);
      paramObject = new ClassCastException(g.e(paramObject.getClass().getName(), " cannot be cast to ", str));
      i.g(v.class.getName(), (RuntimeException)paramObject);
      throw ((Throwable)paramObject);
    }
  }
  
  public static boolean b(int paramInt, Object paramObject)
  {
    boolean bool1 = paramObject instanceof rb.a;
    boolean bool2 = true;
    if (bool1)
    {
      int i;
      if ((paramObject instanceof f)) {
        i = ((f)paramObject).getArity();
      } else if ((paramObject instanceof dc.a)) {
        i = 0;
      } else if ((paramObject instanceof l)) {
        i = 1;
      } else if ((paramObject instanceof p)) {
        i = 2;
      } else if ((paramObject instanceof q)) {
        i = 3;
      } else if ((paramObject instanceof r)) {
        i = 4;
      } else if ((paramObject instanceof s)) {
        i = 5;
      } else if ((paramObject instanceof t)) {
        i = 6;
      } else if ((paramObject instanceof u)) {
        i = 7;
      } else if ((paramObject instanceof dc.v)) {
        i = 8;
      } else if ((paramObject instanceof w)) {
        i = 9;
      } else if ((paramObject instanceof b)) {
        i = 10;
      } else if ((paramObject instanceof c)) {
        i = 11;
      } else if ((paramObject instanceof d)) {
        i = 12;
      } else if ((paramObject instanceof e)) {
        i = 13;
      } else if ((paramObject instanceof dc.f)) {
        i = 14;
      } else if ((paramObject instanceof dc.g)) {
        i = 15;
      } else if ((paramObject instanceof h)) {
        i = 16;
      } else if ((paramObject instanceof dc.i)) {
        i = 17;
      } else if ((paramObject instanceof j)) {
        i = 18;
      } else if ((paramObject instanceof k)) {
        i = 19;
      } else if ((paramObject instanceof m)) {
        i = 20;
      } else if ((paramObject instanceof n)) {
        i = 21;
      } else if ((paramObject instanceof o)) {
        i = 22;
      } else {
        i = -1;
      }
      if (i == paramInt) {}
    }
    else
    {
      bool2 = false;
    }
    return bool2;
  }
}

/* Location:
 * Qualified Name:     ec.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */