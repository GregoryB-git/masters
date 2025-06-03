/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  java.util.concurrent.Callable
 */
package v3;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

public final class d
implements Callable {
    public final /* synthetic */ FirebaseAnalytics o;

    public d(FirebaseAnalytics firebaseAnalytics) {
        this.o = firebaseAnalytics;
    }

    public final /* synthetic */ Object call() {
        return FirebaseAnalytics.k(this.o).F();
    }
}

