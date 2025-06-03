package nc;

import ec.i;
import ec.v;
import p2.m0;
import ub.e;
import uc.c;
import uc.d;
import vb.a;

public final class s<T>
  extends o1
  implements r<T>
{
  public s(j1 paramj1)
  {
    super(true);
    J(paramj1);
  }
  
  public final Object await(e<? super T> parame)
  {
    Object localObject = q(parame);
    parame = a.a;
    return localObject;
  }
  
  public final T getCompleted()
  {
    return (T)z();
  }
  
  public final c<T> getOnAwait()
  {
    p1 localp1 = p1.a;
    i.c(localp1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
    v.a(3, localp1);
    q1 localq1 = q1.a;
    i.c(localq1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
    v.a(3, localq1);
    return new d(this, localp1, localq1);
  }
  
  public final boolean h0(Throwable paramThrowable)
  {
    boolean bool = false;
    u localu = new u(paramThrowable, false);
    paramThrowable = X(F(), localu);
    if (paramThrowable != m0.t)
    {
      if (paramThrowable == m0.u) {}
      for (;;)
      {
        return true;
        if (paramThrowable == m0.v) {
          break;
        }
      }
    }
    return bool;
  }
  
  public final boolean i0(T paramT)
  {
    Object localObject = X(F(), paramT);
    boolean bool;
    if (localObject == m0.t)
    {
      bool = false;
    }
    else
    {
      if (localObject == m0.u) {}
      for (;;)
      {
        return true;
        if (localObject == m0.v) {
          break;
        }
      }
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     nc.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */