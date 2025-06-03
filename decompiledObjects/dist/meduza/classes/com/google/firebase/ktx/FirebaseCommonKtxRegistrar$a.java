package com.google.firebase.ktx;

import d8.e;
import d8.t;
import d8.u;
import ec.i;
import java.util.concurrent.Executor;
import x6.b;
import y7.a;

public final class FirebaseCommonKtxRegistrar$a<T>
  implements e
{
  public static final a<T> a = new a();
  
  public final Object g(u paramu)
  {
    paramu = paramu.e(new t(a.class, Executor.class));
    i.d(paramu, "c.get(Qualified.qualifie…a, Executor::class.java))");
    return b.W((Executor)paramu);
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.ktx.FirebaseCommonKtxRegistrar.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */