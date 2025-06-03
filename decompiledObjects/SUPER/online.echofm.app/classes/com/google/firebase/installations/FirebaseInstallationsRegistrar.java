package com.google.firebase.installations;

import B3.F;
import B3.c;
import B3.c.b;
import B3.r;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import s3.e;
import s4.k;
import y3.a;
import y3.b;

@Keep
public class FirebaseInstallationsRegistrar
  implements ComponentRegistrar
{
  private static final String LIBRARY_NAME = "fire-installations";
  
  public List<c> getComponents()
  {
    return Arrays.asList(new c[] { c.e(s4.i.class).h("fire-installations").b(r.k(e.class)).b(r.i(o4.i.class)).b(r.j(F.a(a.class, ExecutorService.class))).b(r.j(F.a(b.class, Executor.class))).f(new k()).d(), o4.h.a(), O4.h.b("fire-installations", "17.2.0") });
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.installations.FirebaseInstallationsRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */