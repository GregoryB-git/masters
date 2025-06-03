/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.c;

public final class b {
    public final c a;
    public final SavedStateRegistry b;

    public b(c c8) {
        this.a = c8;
        this.b = new SavedStateRegistry();
    }

    public static b a(c c8) {
        return new b(c8);
    }

    public SavedStateRegistry b() {
        return this.b;
    }

    public void c(Bundle bundle) {
        d d8 = this.a.g();
        if (d8.b() == d.c.p) {
            d8.a(new Recreator(this.a));
            this.b.b(d8, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void d(Bundle bundle) {
        this.b.c(bundle);
    }
}

