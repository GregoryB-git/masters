package com.google.firebase.remoteconfig;

import B3.F;
import B3.c;
import B3.c.b;
import B3.r;
import O4.h;
import P4.x;
import P4.y;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import s3.e;
import s4.i;
import y3.b;

@Keep
public class RemoteConfigRegistrar
  implements ComponentRegistrar
{
  private static final String LIBRARY_NAME = "fire-rc";
  
  public List<c> getComponents()
  {
    F localF = F.a(b.class, ScheduledExecutorService.class);
    return Arrays.asList(new c[] { c.e(x.class).h("fire-rc").b(r.k(Context.class)).b(r.j(localF)).b(r.k(e.class)).b(r.k(i.class)).b(r.k(u3.a.class)).b(r.i(w3.a.class)).f(new y(localF)).e().d(), h.b("fire-rc", "21.5.0") });
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.remoteconfig.RemoteConfigRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */