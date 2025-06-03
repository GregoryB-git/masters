package com.google.firebase.abt.component;

import B3.c;
import B3.c.b;
import B3.r;
import O4.h;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import u3.b;

@Keep
public class AbtRegistrar
  implements ComponentRegistrar
{
  private static final String LIBRARY_NAME = "fire-abt";
  
  public List<c> getComponents()
  {
    return Arrays.asList(new c[] { c.e(u3.a.class).h("fire-abt").b(r.k(Context.class)).b(r.i(w3.a.class)).f(new b()).d(), h.b("fire-abt", "21.1.1") });
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.abt.component.AbtRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */