// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugins.firebase.core;

import s3.e;
import V2.j;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import androidx.annotation.Keep;

@Keep
public interface FlutterFirebasePlugin
{
    public static final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
    
    j didReinitializeFirebaseCore();
    
    j getPluginConstantsForFirebaseApp(final e p0);
}
