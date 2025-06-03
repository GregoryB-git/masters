package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

public final class F1
{
  public final E a;
  public final f3 b;
  public final f3 c;
  public final X4 d;
  
  public F1()
  {
    Object localObject = new E();
    a = ((E)localObject);
    f3 localf3 = new f3(null, (E)localObject);
    c = localf3;
    b = localf3.d();
    localObject = new X4();
    d = ((X4)localObject);
    localf3.h("require", new X7((X4)localObject));
    ((X4)localObject).b("internal.platform", d1.o);
    localf3.h("runtime.counter", new k(Double.valueOf(0.0D)));
  }
  
  public final s a(f3 paramf3, r2... paramVarArgs)
  {
    s locals = s.d;
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++)
    {
      locals = b4.a(paramVarArgs[j]);
      C2.b(c);
      if (((locals instanceof v)) || ((locals instanceof t))) {
        locals = a.a(paramf3, locals);
      }
    }
    return locals;
  }
  
  public final void b(String paramString, Callable paramCallable)
  {
    d.b(paramString, paramCallable);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.F1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */