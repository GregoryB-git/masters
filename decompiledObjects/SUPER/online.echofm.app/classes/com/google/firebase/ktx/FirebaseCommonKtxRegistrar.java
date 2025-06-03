package com.google.firebase.ktx;

import B3.c.b;
import B3.e;
import B3.h;
import B3.r;
import W5.m;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p6.i0;
import y3.a;
import y3.b;
import y3.d;

@Metadata
@Keep
public final class FirebaseCommonKtxRegistrar
  implements ComponentRegistrar
{
  @NotNull
  public List<B3.c> getComponents()
  {
    B3.c localc1 = B3.c.c(B3.F.a(a.class, p6.F.class)).b(r.j(B3.F.a(a.class, Executor.class))).f(a.a).d();
    Intrinsics.checkNotNullExpressionValue(localc1, "builder(Qualified.qualif…cher()\n    }\n    .build()");
    B3.c localc2 = B3.c.c(B3.F.a(y3.c.class, p6.F.class)).b(r.j(B3.F.a(y3.c.class, Executor.class))).f(b.a).d();
    Intrinsics.checkNotNullExpressionValue(localc2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
    B3.c localc3 = B3.c.c(B3.F.a(b.class, p6.F.class)).b(r.j(B3.F.a(b.class, Executor.class))).f(c.a).d();
    Intrinsics.checkNotNullExpressionValue(localc3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
    B3.c localc4 = B3.c.c(B3.F.a(d.class, p6.F.class)).b(r.j(B3.F.a(d.class, Executor.class))).f(d.a).d();
    Intrinsics.checkNotNullExpressionValue(localc4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
    return m.i(new B3.c[] { localc1, localc2, localc3, localc4 });
  }
  
  public static final class a
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
  
  public static final class b
    implements h
  {
    public static final b a = new b();
    
    public final p6.F b(e parame)
    {
      parame = parame.h(B3.F.a(y3.c.class, Executor.class));
      Intrinsics.checkNotNullExpressionValue(parame, "c.get(Qualified.qualifie…a, Executor::class.java))");
      return i0.a((Executor)parame);
    }
  }
  
  public static final class c
    implements h
  {
    public static final c a = new c();
    
    public final p6.F b(e parame)
    {
      parame = parame.h(B3.F.a(b.class, Executor.class));
      Intrinsics.checkNotNullExpressionValue(parame, "c.get(Qualified.qualifie…a, Executor::class.java))");
      return i0.a((Executor)parame);
    }
  }
  
  public static final class d
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
}

/* Location:
 * Qualified Name:     com.google.firebase.ktx.FirebaseCommonKtxRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */