package com.google.firebase.sessions;

import B3.c;
import B3.c.b;
import B3.r;
import O4.h;
import R4.l;
import androidx.annotation.Keep;
import c2.g;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s4.i;
import y3.a;
import y3.b;

@Metadata
@Keep
public final class FirebaseSessionsRegistrar
  implements ComponentRegistrar
{
  @NotNull
  public static final a Companion = new a(null);
  @NotNull
  private static final String LIBRARY_NAME = "fire-sessions";
  private static final B3.F backgroundDispatcher = B3.F.a(a.class, p6.F.class);
  private static final B3.F blockingDispatcher = B3.F.a(b.class, p6.F.class);
  private static final B3.F firebaseApp = B3.F.b(s3.e.class);
  private static final B3.F firebaseInstallationsApi = B3.F.b(i.class);
  private static final B3.F transportFactory = B3.F.b(g.class);
  
  private static final l getComponents$lambda-0(B3.e parame)
  {
    Object localObject1 = parame.h(firebaseApp);
    Intrinsics.checkNotNullExpressionValue(localObject1, "container.get(firebaseApp)");
    localObject1 = (s3.e)localObject1;
    Object localObject2 = parame.h(firebaseInstallationsApi);
    Intrinsics.checkNotNullExpressionValue(localObject2, "container.get(firebaseInstallationsApi)");
    localObject2 = (i)localObject2;
    Object localObject3 = parame.h(backgroundDispatcher);
    Intrinsics.checkNotNullExpressionValue(localObject3, "container.get(backgroundDispatcher)");
    localObject3 = (p6.F)localObject3;
    Object localObject4 = parame.h(blockingDispatcher);
    Intrinsics.checkNotNullExpressionValue(localObject4, "container.get(blockingDispatcher)");
    localObject4 = (p6.F)localObject4;
    parame = parame.b(transportFactory);
    Intrinsics.checkNotNullExpressionValue(parame, "container.getProvider(transportFactory)");
    return new l((s3.e)localObject1, (i)localObject2, (p6.F)localObject3, (p6.F)localObject4, parame);
  }
  
  @NotNull
  public List<c> getComponents()
  {
    return W5.m.i(new c[] { c.e(l.class).h("fire-sessions").b(r.j(firebaseApp)).b(r.j(firebaseInstallationsApi)).b(r.j(backgroundDispatcher)).b(r.j(blockingDispatcher)).b(r.l(transportFactory)).f(new R4.m()).d(), h.b("fire-sessions", "1.1.0") });
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     com.google.firebase.sessions.FirebaseSessionsRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */