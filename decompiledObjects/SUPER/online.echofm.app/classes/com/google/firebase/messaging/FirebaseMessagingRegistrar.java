package com.google.firebase.messaging;

import B3.c;
import B3.c.b;
import B3.r;
import O4.h;
import androidx.annotation.Keep;
import c2.g;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import n4.d;
import o4.j;
import q4.a;
import s3.e;

@Keep
public class FirebaseMessagingRegistrar
  implements ComponentRegistrar
{
  private static final String LIBRARY_NAME = "fire-fcm";
  
  @Keep
  public List<c> getComponents()
  {
    return Arrays.asList(new c[] { c.e(FirebaseMessaging.class).h("fire-fcm").b(r.k(e.class)).b(r.h(a.class)).b(r.i(O4.i.class)).b(r.i(j.class)).b(r.h(g.class)).b(r.k(s4.i.class)).b(r.k(d.class)).f(new D()).c().d(), h.b("fire-fcm", "23.3.1") });
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.FirebaseMessagingRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */