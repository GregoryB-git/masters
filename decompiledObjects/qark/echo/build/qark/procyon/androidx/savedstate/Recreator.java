// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.savedstate;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.ArrayList;
import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.d;
import androidx.lifecycle.h;
import android.annotation.SuppressLint;
import androidx.lifecycle.f;

@SuppressLint({ "RestrictedApi" })
final class Recreator implements f
{
    public final c o;
    
    public Recreator(final c o) {
        this.o = o;
    }
    
    @Override
    public void a(final h h, final d.b b) {
        if (b != d.b.ON_CREATE) {
            throw new AssertionError((Object)"Next event must be ON_CREATE");
        }
        h.g().c(this);
        final Bundle a = this.o.k().a("androidx.savedstate.Restarter");
        if (a == null) {
            return;
        }
        final ArrayList stringArrayList = a.getStringArrayList("classes_to_restore");
        if (stringArrayList != null) {
            final Iterator<String> iterator = stringArrayList.iterator();
            while (iterator.hasNext()) {
                this.b(iterator.next());
            }
            return;
        }
        throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
    }
    
    public final void b(final String ex) {
        try {
            final Class<? extends SavedStateRegistry.a> subclass = Class.forName((String)ex, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.a.class);
            try {
                final Constructor<? extends SavedStateRegistry.a> declaredConstructor = subclass.getDeclaredConstructor((Class<?>[])new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.a)declaredConstructor.newInstance(new Object[0])).a(this.o);
                }
                catch (Exception subclass) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate ");
                    sb.append((String)ex);
                    throw new RuntimeException(sb.toString(), (Throwable)subclass);
                }
            }
            catch (NoSuchMethodException ex) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Class");
                sb2.append(subclass.getSimpleName());
                sb2.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalStateException(sb2.toString(), ex);
            }
        }
        catch (ClassNotFoundException cause) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Class ");
            sb3.append((String)ex);
            sb3.append(" wasn't found");
            throw new RuntimeException(sb3.toString(), cause);
        }
    }
    
    public static final class a implements b
    {
        public final Set a;
        
        public a(final SavedStateRegistry savedStateRegistry) {
            this.a = new HashSet();
            savedStateRegistry.d("androidx.savedstate.Restarter", (SavedStateRegistry.b)this);
        }
        
        @Override
        public Bundle a() {
            final Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.a));
            return bundle;
        }
        
        public void b(final String s) {
            this.a.add(s);
        }
    }
}
