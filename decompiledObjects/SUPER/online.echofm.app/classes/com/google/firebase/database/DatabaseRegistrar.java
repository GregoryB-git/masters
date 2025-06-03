package com.google.firebase.database;

import B3.c;
import B3.c.b;
import B3.r;
import O4.h;
import Q3.f;
import Q3.i;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import s3.e;

@Keep
public class DatabaseRegistrar
  implements ComponentRegistrar
{
  private static final String LIBRARY_NAME = "fire-rtdb";
  
  public List<c> getComponents()
  {
    return Arrays.asList(new c[] { c.e(i.class).h("fire-rtdb").b(r.k(e.class)).b(r.a(A3.a.class)).b(r.a(z3.a.class)).f(new f()).d(), h.b("fire-rtdb", "20.3.0") });
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.database.DatabaseRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */