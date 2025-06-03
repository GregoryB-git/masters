/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Callable
 */
package v3;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

public final class a
implements Callable {
    public final /* synthetic */ FirebaseAnalytics o;

    public a(FirebaseAnalytics firebaseAnalytics) {
        this.o = firebaseAnalytics;
    }

    public final /* synthetic */ Object call() {
        return FirebaseAnalytics.k(this.o).M();
    }
}

