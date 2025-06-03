package io.flutter.plugins.firebase.auth;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class FlutterFirebaseAuthRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<d8.b<?>> getComponents() {
        return Collections.singletonList(ca.e.a(BuildConfig.LIBRARY_NAME, BuildConfig.LIBRARY_VERSION));
    }
}
