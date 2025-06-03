package com.google.firebase.messaging;

import aa.n;
import ca.e;
import com.google.firebase.components.ComponentRegistrar;
import d8.b.a;
import d8.k;
import d8.t;
import h3.i;
import java.util.Arrays;
import java.util.List;
import s9.a;

public class FirebaseMessagingRegistrar
  implements ComponentRegistrar
{
  private static final String LIBRARY_NAME = "fire-fcm";
  
  public List<d8.b<?>> getComponents()
  {
    t localt = new t(u8.b.class, i.class);
    b.a locala = d8.b.b(FirebaseMessaging.class);
    a = "fire-fcm";
    locala.a(k.d(u7.f.class));
    locala.a(new k(0, 0, a.class));
    locala.a(k.b(ca.f.class));
    locala.a(k.b(q9.f.class));
    locala.a(k.d(u9.d.class));
    locala.a(new k(localt, 0, 1));
    locala.a(k.d(c9.d.class));
    f = new n(localt);
    locala.c(1);
    return Arrays.asList(new d8.b[] { locala.b(), e.a("fire-fcm", "24.1.0") });
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.FirebaseMessagingRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */