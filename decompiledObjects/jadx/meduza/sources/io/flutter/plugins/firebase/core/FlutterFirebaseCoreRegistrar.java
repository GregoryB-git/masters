package io.flutter.plugins.firebase.core;

import ca.e;
import com.google.firebase.components.ComponentRegistrar;
import d8.b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class FlutterFirebaseCoreRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b<?>> getComponents() {
        return Collections.singletonList(e.a(BuildConfig.LIBRARY_NAME, BuildConfig.LIBRARY_VERSION));
    }
}
