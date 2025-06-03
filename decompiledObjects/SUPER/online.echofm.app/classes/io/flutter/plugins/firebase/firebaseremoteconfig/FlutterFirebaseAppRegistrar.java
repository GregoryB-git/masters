package io.flutter.plugins.firebase.firebaseremoteconfig;

import B3.c;
import O4.h;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;

@Keep
public class FlutterFirebaseAppRegistrar
  implements ComponentRegistrar
{
  public List<c> getComponents()
  {
    return Collections.singletonList(h.b("flutter-fire-rc", "4.3.4"));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firebaseremoteconfig.FlutterFirebaseAppRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */