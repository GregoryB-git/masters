/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 */
package io.flutter.plugins.firebase.core;

import V2.j;
import androidx.annotation.Keep;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import s3.e;

@Keep
public interface FlutterFirebasePlugin {
    public static final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    public j didReinitializeFirebaseCore();

    public j getPluginConstantsForFirebaseApp(e var1);
}

