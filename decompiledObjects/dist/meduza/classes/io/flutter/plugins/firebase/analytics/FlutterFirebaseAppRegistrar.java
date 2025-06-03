package io.flutter.plugins.firebase.analytics;

import ca.e;
import com.google.firebase.components.ComponentRegistrar;
import d8.b;
import java.util.Collections;
import java.util.List;

public class FlutterFirebaseAppRegistrar
  implements ComponentRegistrar
{
  public List<b<?>> getComponents()
  {
    return Collections.singletonList(e.a("flutter-fire-analytics", "11.4.4"));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.analytics.FlutterFirebaseAppRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */