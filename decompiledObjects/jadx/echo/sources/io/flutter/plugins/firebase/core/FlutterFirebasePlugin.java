package io.flutter.plugins.firebase.core;

import V2.AbstractC0659j;
import androidx.annotation.Keep;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import s3.C1947e;

@Keep
/* loaded from: classes.dex */
public interface FlutterFirebasePlugin {
    public static final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    AbstractC0659j didReinitializeFirebaseCore();

    AbstractC0659j getPluginConstantsForFirebaseApp(C1947e c1947e);
}
