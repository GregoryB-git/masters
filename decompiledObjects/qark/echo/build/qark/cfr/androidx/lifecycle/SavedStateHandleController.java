/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.Set
 */
package androidx.lifecycle;

import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.c;
import java.util.Iterator;
import java.util.Set;

final class SavedStateHandleController
implements f {
    public boolean o;

    public static void b(r object, SavedStateRegistry savedStateRegistry, d d8) {
        if ((object = (SavedStateHandleController)object.c("androidx.lifecycle.savedstate.vm.tag")) != null && !object.d()) {
            object.c(savedStateRegistry, d8);
            SavedStateHandleController.e(savedStateRegistry, d8);
        }
    }

    public static void e(final SavedStateRegistry savedStateRegistry, d d8) {
        d.c c8 = d8.b();
        if (c8 != d.c.p && !c8.c(d.c.r)) {
            d8.a(new f(){

                @Override
                public void a(h h8, d.b b8) {
                    if (b8 == d.b.ON_START) {
                        d.this.c(this);
                        savedStateRegistry.e(a.class);
                    }
                }
            });
            return;
        }
        savedStateRegistry.e(a.class);
    }

    @Override
    public void a(h h8, d.b b8) {
        if (b8 == d.b.ON_DESTROY) {
            this.o = false;
            h8.g().c(this);
        }
    }

    public void c(SavedStateRegistry savedStateRegistry, d d8) {
        if (this.o) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.o = true;
        d8.a(this);
        throw null;
    }

    public boolean d() {
        return this.o;
    }

    public static final class a
    implements SavedStateRegistry.a {
        @Override
        public void a(c c8) {
            if (c8 instanceof u) {
                t t8 = ((u)((Object)c8)).d();
                SavedStateRegistry savedStateRegistry = c8.k();
                Iterator iterator = t8.c().iterator();
                while (iterator.hasNext()) {
                    SavedStateHandleController.b(t8.b((String)iterator.next()), savedStateRegistry, c8.g());
                }
                if (!t8.c().isEmpty()) {
                    savedStateRegistry.e(a.class);
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

}

