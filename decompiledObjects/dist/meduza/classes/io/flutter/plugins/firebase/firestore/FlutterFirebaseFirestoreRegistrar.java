package io.flutter.plugins.firebase.firestore;

import ca.e;
import com.google.firebase.components.ComponentRegistrar;
import d8.b;
import java.util.Collections;
import java.util.List;

public class FlutterFirebaseFirestoreRegistrar
  implements ComponentRegistrar
{
  public List<b<?>> getComponents()
  {
    return Collections.singletonList(e.a("flutter-fire-fst", "5.6.5"));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestoreRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */