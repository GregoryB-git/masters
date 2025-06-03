package io.flutter.plugins.firebase.auth;

import ca.e;
import com.google.firebase.components.ComponentRegistrar;
import d8.b;
import java.util.Collections;
import java.util.List;

public class FlutterFirebaseAuthRegistrar
  implements ComponentRegistrar
{
  public List<b<?>> getComponents()
  {
    return Collections.singletonList(e.a("flutter-fire-auth", "5.5.1"));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.FlutterFirebaseAuthRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */