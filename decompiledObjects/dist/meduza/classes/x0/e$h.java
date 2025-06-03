package x0;

import android.transition.Transition;
import f;

public final class e$h
  extends e.f
{
  public final Object b;
  public final boolean c;
  public final Object d;
  
  public e$h(r0.c paramc, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramc);
    Object localObject;
    if (a == 2)
    {
      if (paramBoolean1) {
        localObject = c.getReenterTransition();
      } else {
        localObject = c.getEnterTransition();
      }
    }
    else if (paramBoolean1) {
      localObject = c.getReturnTransition();
    } else {
      localObject = c.getExitTransition();
    }
    b = localObject;
    boolean bool;
    if (a == 2)
    {
      if (paramBoolean1) {
        bool = c.getAllowReturnTransitionOverlap();
      } else {
        bool = c.getAllowEnterTransitionOverlap();
      }
    }
    else {
      bool = true;
    }
    c = bool;
    if (paramBoolean2)
    {
      if (paramBoolean1) {
        paramc = c.getSharedElementReturnTransition();
      } else {
        paramc = c.getSharedElementEnterTransition();
      }
    }
    else {
      paramc = null;
    }
    d = paramc;
  }
  
  public final n0 b()
  {
    n0 localn01 = c(b);
    n0 localn02 = c(d);
    int i;
    if ((localn01 != null) && (localn02 != null) && (localn01 != localn02)) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0)
    {
      localObject = localn01;
      if (localn01 == null) {
        localObject = localn02;
      }
      return (n0)localObject;
    }
    Object localObject = f.l("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
    ((StringBuilder)localObject).append(a.c);
    ((StringBuilder)localObject).append(" returned Transition ");
    ((StringBuilder)localObject).append(b);
    ((StringBuilder)localObject).append(" which uses a different Transition  type than its shared element transition ");
    ((StringBuilder)localObject).append(d);
    throw new IllegalArgumentException(((StringBuilder)localObject).toString().toString());
  }
  
  public final n0 c(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    Object localObject = h0.a;
    if ((localObject != null) && ((paramObject instanceof Transition))) {
      return (n0)localObject;
    }
    localObject = h0.b;
    if ((localObject != null) && (((n0)localObject).d(paramObject))) {
      return (n0)localObject;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Transition ");
    ((StringBuilder)localObject).append(paramObject);
    ((StringBuilder)localObject).append(" for fragment ");
    ((StringBuilder)localObject).append(a.c);
    ((StringBuilder)localObject).append(" is not a valid framework Transition or AndroidX Transition");
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
}

/* Location:
 * Qualified Name:     x0.e.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */