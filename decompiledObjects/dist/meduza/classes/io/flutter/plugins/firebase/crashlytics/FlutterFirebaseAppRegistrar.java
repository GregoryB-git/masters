package io.flutter.plugins.firebase.crashlytics;

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
    return Collections.singletonList(e.a("flutter-fire-cls", "4.3.4"));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.crashlytics.FlutterFirebaseAppRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */