// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugins.firebase.analytics;

import java.util.Collections;
import O4.h;
import B3.c;
import java.util.List;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;

@Keep
public class FlutterFirebaseAppRegistrar implements ComponentRegistrar
{
    @Override
    public List<c> getComponents() {
        return Collections.singletonList(h.b("flutter-fire-analytics", "10.7.0"));
    }
}
