package com.google.firebase.ktx;

import B3.e;
import B3.h;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import p6.i0;
import y3.d;

public final class FirebaseCommonKtxRegistrar$d
  implements h
{
  public static final d a = new d();
  
  public final p6.F b(e parame)
  {
    parame = parame.h(B3.F.a(d.class, Executor.class));
    Intrinsics.checkNotNullExpressionValue(parame, "c.get(Qualified.qualifie…a, Executor::class.java))");
    return i0.a((Executor)parame);
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.ktx.FirebaseCommonKtxRegistrar.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */