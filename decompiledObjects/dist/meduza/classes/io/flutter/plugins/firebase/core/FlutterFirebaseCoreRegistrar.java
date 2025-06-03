package io.flutter.plugins.firebase.core;

import ca.e;
import com.google.firebase.components.ComponentRegistrar;
import d8.b;
import java.util.Collections;
import java.util.List;

public class FlutterFirebaseCoreRegistrar
  implements ComponentRegistrar
{
  public List<b<?>> getComponents()
  {
    return Collections.singletonList(e.a("flutter-fire-core", "3.12.1"));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.core.FlutterFirebaseCoreRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */