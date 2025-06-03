package io.flutter.plugins.firebase.messaging;

import B3.C0342c;
import O4.h;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class FlutterFirebaseAppRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0342c> getComponents() {
        return Collections.singletonList(h.b("flutter-fire-fcm", "14.7.4"));
    }
}
