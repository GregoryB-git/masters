package com.google.firebase.datatransport;

import android.content.Context;
import ca.e;
import com.google.firebase.components.ComponentRegistrar;
import d8.b.a;
import d8.k;
import d8.t;
import d9.p;
import d9.q;
import d9.r;
import h3.i;
import java.util.Arrays;
import java.util.List;
import u8.a;

public class TransportRegistrar
  implements ComponentRegistrar
{
  private static final String LIBRARY_NAME = "fire-transport";
  
  public List<d8.b<?>> getComponents()
  {
    Object localObject = d8.b.b(i.class);
    a = "fire-transport";
    ((b.a)localObject).a(k.d(Context.class));
    f = new p(1);
    localObject = ((b.a)localObject).b();
    b.a locala = d8.b.a(new t(a.class, i.class));
    locala.a(k.d(Context.class));
    f = new q(1);
    d8.b localb = locala.b();
    locala = d8.b.a(new t(u8.b.class, i.class));
    locala.a(k.d(Context.class));
    f = new r(1);
    return Arrays.asList(new d8.b[] { localObject, localb, locala.b(), e.a("fire-transport", "19.0.0") });
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.datatransport.TransportRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */