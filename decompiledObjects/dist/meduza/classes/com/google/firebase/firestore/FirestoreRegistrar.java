package com.google.firebase.firestore;

import a8.a;
import android.content.Context;
import ca.e;
import com.google.firebase.components.ComponentRegistrar;
import d8.b.a;
import d8.k;
import e0.d;
import java.util.Arrays;
import java.util.List;
import u7.j;

public class FirestoreRegistrar
  implements ComponentRegistrar
{
  private static final String LIBRARY_NAME = "fire-fst";
  
  public List<d8.b<?>> getComponents()
  {
    b.a locala = d8.b.b(h.class);
    a = "fire-fst";
    locala.a(k.d(u7.f.class));
    locala.a(k.d(Context.class));
    locala.a(k.b(q9.f.class));
    locala.a(k.b(ca.f.class));
    locala.a(k.a(c8.b.class));
    locala.a(k.a(a.class));
    locala.a(new k(0, 0, j.class));
    f = new d(1);
    return Arrays.asList(new d8.b[] { locala.b(), e.a("fire-fst", "25.1.2") });
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.firestore.FirestoreRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */