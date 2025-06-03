package com.google.firebase.datatransport;

import B3.c;
import B3.c.b;
import B3.r;
import O4.h;
import android.content.Context;
import androidx.annotation.Keep;
import c2.g;
import com.google.firebase.components.ComponentRegistrar;
import g4.a;
import java.util.Arrays;
import java.util.List;

@Keep
public class TransportRegistrar
  implements ComponentRegistrar
{
  private static final String LIBRARY_NAME = "fire-transport";
  
  public List<c> getComponents()
  {
    return Arrays.asList(new c[] { c.e(g.class).h("fire-transport").b(r.k(Context.class)).f(new a()).d(), h.b("fire-transport", "18.1.8") });
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.datatransport.TransportRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */