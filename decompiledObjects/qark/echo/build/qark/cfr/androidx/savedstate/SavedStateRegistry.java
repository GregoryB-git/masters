/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.util.Map
 *  java.util.Map$Entry
 */
package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.savedstate.Recreator;
import androidx.savedstate.c;
import java.lang.reflect.Constructor;
import java.util.Map;
import n.b;

public final class SavedStateRegistry {
    public n.b a = new n.b();
    public Bundle b;
    public boolean c;
    public Recreator.a d;
    public boolean e = true;

    public Bundle a(String string2) {
        if (this.c) {
            Bundle bundle = this.b;
            if (bundle != null) {
                bundle = bundle.getBundle(string2);
                this.b.remove(string2);
                if (this.b.isEmpty()) {
                    this.b = null;
                }
                return bundle;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public void b(d d8, Bundle bundle) {
        if (!this.c) {
            if (bundle != null) {
                this.b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            d8.a(new f(){

                /*
                 * Enabled aggressive block sorting
                 */
                @Override
                public void a(h object, d.b b8) {
                    boolean bl;
                    if (b8 == d.b.ON_START) {
                        object = SavedStateRegistry.this;
                        bl = true;
                    } else {
                        if (b8 != d.b.ON_STOP) {
                            return;
                        }
                        object = SavedStateRegistry.this;
                        bl = false;
                    }
                    object.e = bl;
                }
            });
            this.c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    public void c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Object object = this.b;
        if (object != null) {
            bundle2.putAll((Bundle)object);
        }
        object = this.a.f();
        while (object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            bundle2.putBundle((String)entry.getKey(), ((b)entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void d(String string2, b b8) {
        if ((b)this.a.k(string2, b8) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }

    public void e(Class class_) {
        if (this.e) {
            if (this.d == null) {
                this.d = new Recreator.a(this);
            }
            try {
                class_.getDeclaredConstructor(new Class[0]);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Class");
                stringBuilder.append(class_.getSimpleName());
                stringBuilder.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(stringBuilder.toString(), (Throwable)noSuchMethodException);
            }
            this.d.b(class_.getName());
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public static interface a {
        public void a(c var1);
    }

    public static interface b {
        public Bundle a();
    }

}

