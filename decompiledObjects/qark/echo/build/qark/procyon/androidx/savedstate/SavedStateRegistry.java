// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.savedstate;

import android.os.BaseBundle;
import java.util.Map;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.f;
import androidx.lifecycle.d;
import android.os.Bundle;
import n.b;

public final class SavedStateRegistry
{
    public n.b a;
    public Bundle b;
    public boolean c;
    public Recreator.a d;
    public boolean e;
    
    public SavedStateRegistry() {
        this.a = new n.b();
        this.e = true;
    }
    
    public Bundle a(final String s) {
        if (!this.c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        final Bundle b = this.b;
        if (b != null) {
            final Bundle bundle = b.getBundle(s);
            this.b.remove(s);
            if (((BaseBundle)this.b).isEmpty()) {
                this.b = null;
            }
            return bundle;
        }
        return null;
    }
    
    public void b(final d d, final Bundle bundle) {
        if (!this.c) {
            if (bundle != null) {
                this.b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            d.a(new f() {
                @Override
                public void a(final h h, final d.b b) {
                    SavedStateRegistry savedStateRegistry;
                    boolean e;
                    if (b == androidx.lifecycle.d.b.ON_START) {
                        savedStateRegistry = SavedStateRegistry.this;
                        e = true;
                    }
                    else {
                        if (b != androidx.lifecycle.d.b.ON_STOP) {
                            return;
                        }
                        savedStateRegistry = SavedStateRegistry.this;
                        e = false;
                    }
                    savedStateRegistry.e = e;
                }
            });
            this.c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }
    
    public void c(final Bundle bundle) {
        final Bundle bundle2 = new Bundle();
        final Bundle b = this.b;
        if (b != null) {
            bundle2.putAll(b);
        }
        final n.b.d f = this.a.f();
        while (f.hasNext()) {
            final Map.Entry<String, V> entry = f.next();
            bundle2.putBundle((String)entry.getKey(), ((b)entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
    
    public void d(final String s, final b b) {
        if (this.a.k(s, b) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }
    
    public void e(final Class clazz) {
        if (this.e) {
            if (this.d == null) {
                this.d = new Recreator.a(this);
            }
            try {
                clazz.getDeclaredConstructor((Class[])new Class[0]);
                this.d.b(clazz.getName());
                return;
            }
            catch (NoSuchMethodException cause) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Class");
                sb.append(clazz.getSimpleName());
                sb.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(sb.toString(), cause);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
    
    public interface a
    {
        void a(final c p0);
    }
    
    public interface b
    {
        Bundle a();
    }
}
