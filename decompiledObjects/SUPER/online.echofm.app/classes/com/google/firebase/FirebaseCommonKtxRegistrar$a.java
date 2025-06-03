package com.google.firebase;

import B3.e;
import B3.h;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import p6.i0;
import y3.a;

public final class FirebaseCommonKtxRegistrar$a
  implements h
{
  public static final a a = new a();
  
  public final p6.F b(e parame)
  {
    parame = parame.h(B3.F.a(a.class, Executor.class));
    Intrinsics.checkNotNullExpressionValue(parame, "c.get(Qualified.qualifie…a, Executor::class.java))");
    return i0.a((Executor)parame);
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.FirebaseCommonKtxRegistrar.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */