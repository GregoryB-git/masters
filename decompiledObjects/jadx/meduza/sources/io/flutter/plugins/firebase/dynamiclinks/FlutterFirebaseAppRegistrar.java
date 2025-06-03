package io.flutter.plugins.firebase.dynamiclinks;

import ca.e;
import com.google.firebase.components.ComponentRegistrar;
import d8.b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class FlutterFirebaseAppRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b<?>> getComponents() {
        return Collections.singletonList(e.a(BuildConfig.LIBRARY_NAME, BuildConfig.LIBRARY_VERSION));
    }
}
