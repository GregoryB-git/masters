/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.AssetManager
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 */
package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import l.W;
import l.c0;

public class U
extends ContextWrapper {
    public static final Object c = new Object();
    public static ArrayList d;
    public final Resources a;
    public final Resources.Theme b;

    public U(Context context) {
        super(context);
        if (c0.b()) {
            c0 c02 = new c0((Context)this, context.getResources());
            this.a = c02;
            c02 = c02.newTheme();
            this.b = c02;
            c02.setTo(context.getTheme());
            return;
        }
        this.a = new W((Context)this, context.getResources());
        this.b = null;
    }

    public static boolean a(Context context) {
        if (!(context instanceof U || context.getResources() instanceof W || context.getResources() instanceof c0)) {
            return c0.b();
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Context b(Context object) {
        if (!U.a((Context)object)) {
            return object;
        }
        Object object2 = c;
        synchronized (object2) {
            block8 : {
                int n8;
                Object object3;
                block9 : {
                    try {
                        object3 = d;
                        if (object3 == null) {
                            d = new ArrayList();
                            break block8;
                        }
                        n8 = object3.size() - 1;
                        break block9;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
                do {
                    if (n8 < 0) break;
                    object3 = (WeakReference)d.get(n8);
                    if (object3 == null || object3.get() == null) {
                        d.remove(n8);
                    }
                    --n8;
                } while (true);
                for (n8 = U.d.size() - 1; n8 >= 0; --n8) {
                    object3 = (WeakReference)d.get(n8);
                    object3 = object3 != null ? (U)((Object)object3.get()) : null;
                    if (object3 == null || object3.getBaseContext() != object) continue;
                    return object3;
                }
            }
            object = new U((Context)object);
            d.add((Object)new WeakReference(object));
            return object;
        }
    }

    public AssetManager getAssets() {
        return this.a.getAssets();
    }

    public Resources getResources() {
        return this.a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme;
        Resources.Theme theme2 = theme = this.b;
        if (theme == null) {
            theme2 = super.getTheme();
        }
        return theme2;
    }

    public void setTheme(int n8) {
        Resources.Theme theme = this.b;
        if (theme == null) {
            super.setTheme(n8);
            return;
        }
        theme.applyStyle(n8, true);
    }
}

