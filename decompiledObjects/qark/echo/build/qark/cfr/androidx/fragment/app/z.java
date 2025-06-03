/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 */
package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.b;
import androidx.savedstate.c;

public class z
implements c {
    public i o = null;
    public b p = null;

    public void a(d.b b8) {
        this.o.h(b8);
    }

    public void b() {
        if (this.o == null) {
            this.o = new i(this);
            this.p = b.a(this);
        }
    }

    public boolean c() {
        if (this.o != null) {
            return true;
        }
        return false;
    }

    public void d(Bundle bundle) {
        this.p.c(bundle);
    }

    public void e(Bundle bundle) {
        this.p.d(bundle);
    }

    public void f(d.c c8) {
        this.o.o(c8);
    }

    @Override
    public d g() {
        this.b();
        return this.o;
    }

    @Override
    public SavedStateRegistry k() {
        return this.p.b();
    }
}

