/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.List
 */
package io.flutter.plugins.firebase.firebaseremoteconfig;

import B3.c;
import O4.h;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;

@Keep
public class FlutterFirebaseAppRegistrar
implements ComponentRegistrar {
    public List<c> getComponents() {
        return Collections.singletonList((Object)h.b("flutter-fire-rc", "4.3.4"));
    }
}

