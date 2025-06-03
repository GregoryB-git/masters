package io.flutter.plugins.firebase.core;

import B3.c;
import O4.h;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;

@Keep
public class FlutterFirebaseCoreRegistrar
  implements ComponentRegistrar
{
  public List<c> getComponents()
  {
    return Collections.singletonList(h.b("flutter-fire-core", "2.22.0"));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.core.FlutterFirebaseCoreRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */