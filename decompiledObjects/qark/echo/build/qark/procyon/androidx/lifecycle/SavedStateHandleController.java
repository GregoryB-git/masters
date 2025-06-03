// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.lifecycle;

import java.util.Iterator;
import androidx.savedstate.c;
import androidx.savedstate.SavedStateRegistry;

final class SavedStateHandleController implements f
{
    public boolean o;
    
    public static void b(final r r, final SavedStateRegistry savedStateRegistry, final d d) {
        final SavedStateHandleController savedStateHandleController = (SavedStateHandleController)r.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.d()) {
            savedStateHandleController.c(savedStateRegistry, d);
            e(savedStateRegistry, d);
        }
    }
    
    public static void e(final SavedStateRegistry savedStateRegistry, final d d) {
        final d.c b = d.b();
        if (b != androidx.lifecycle.d.c.p && !b.c(androidx.lifecycle.d.c.r)) {
            d.a(new f() {
                @Override
                public void a(final h h, final d.b b) {
                    if (b == d.b.ON_START) {
                        d.c(this);
                        savedStateRegistry.e(a.class);
                    }
                }
            });
            return;
        }
        savedStateRegistry.e(a.class);
    }
    
    @Override
    public void a(final h h, final d.b b) {
        if (b == d.b.ON_DESTROY) {
            this.o = false;
            h.g().c(this);
        }
    }
    
    public void c(final SavedStateRegistry savedStateRegistry, final d d) {
        if (this.o) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.o = true;
        d.a(this);
        throw null;
    }
    
    public boolean d() {
        return this.o;
    }
    
    public static final class a implements SavedStateRegistry.a
    {
        @Override
        public void a(final c c) {
            if (c instanceof u) {
                final t d = ((u)c).d();
                final SavedStateRegistry k = c.k();
                final Iterator iterator = d.c().iterator();
                while (iterator.hasNext()) {
                    SavedStateHandleController.b(d.b(iterator.next()), k, c.g());
                }
                if (!d.c().isEmpty()) {
                    k.e(a.class);
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }
}
