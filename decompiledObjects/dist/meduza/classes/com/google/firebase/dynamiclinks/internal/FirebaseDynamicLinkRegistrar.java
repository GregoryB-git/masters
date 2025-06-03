package com.google.firebase.dynamiclinks.internal;

import ca.e;
import com.google.firebase.components.ComponentRegistrar;
import d8.b.a;
import d8.k;
import d9.p;
import java.util.Arrays;
import java.util.List;
import u7.f;
import w7.a;

public final class FirebaseDynamicLinkRegistrar
  implements ComponentRegistrar
{
  private static final String LIBRARY_NAME = "fire-dl";
  
  public List<d8.b<?>> getComponents()
  {
    b.a locala = d8.b.b(v8.b.class);
    a = "fire-dl";
    locala.a(k.d(f.class));
    locala.a(k.b(a.class));
    f = new p(2);
    return Arrays.asList(new d8.b[] { locala.b(), e.a("fire-dl", "22.1.0") });
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinkRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */