package io.flutter.embedding.engine;

import D5.s;
import io.flutter.plugin.platform.r;
import java.util.Iterator;
import java.util.Set;
import t5.b;

public class a$a
  implements a.b
{
  public a$a(a parama) {}
  
  public void a() {}
  
  public void b()
  {
    b.f("FlutterEngine", "onPreEngineRestart()");
    Iterator localIterator = a.b(a).iterator();
    while (localIterator.hasNext()) {
      ((a.b)localIterator.next()).b();
    }
    a.c(a).X();
    a.d(a).g();
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */