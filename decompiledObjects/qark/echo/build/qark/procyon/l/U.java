// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import android.content.res.AssetManager;
import java.lang.ref.WeakReference;
import android.content.Context;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import java.util.ArrayList;
import android.content.ContextWrapper;

public class U extends ContextWrapper
{
    public static final Object c;
    public static ArrayList d;
    public final Resources a;
    public final Resources$Theme b;
    
    static {
        c = new Object();
    }
    
    public U(final Context context) {
        super(context);
        if (c0.b()) {
            final c0 a = new c0((Context)this, context.getResources());
            this.a = a;
            (this.b = a.newTheme()).setTo(context.getTheme());
            return;
        }
        this.a = new W((Context)this, context.getResources());
        this.b = null;
    }
    
    public static boolean a(final Context context) {
        return !(context instanceof U) && !(context.getResources() instanceof W) && !(context.getResources() instanceof c0) && c0.b();
    }
    
    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
    Label_0087_Outer:
        while (true) {
            final Object c = U.c;
            // monitorenter(c)
        Label_0117_Outer:
            while (true) {
                int index = 0;
            Label_0183:
                while (true) {
                Label_0178:
                    while (true) {
                        Label_0171: {
                            while (true) {
                                try {
                                    final ArrayList d = U.d;
                                    if (d == null) {
                                        U.d = new ArrayList();
                                    }
                                    else {
                                        index = d.size() - 1;
                                        if (index >= 0) {
                                            final WeakReference weakReference = U.d.get(index);
                                            if (weakReference == null || weakReference.get() == null) {
                                                U.d.remove(index);
                                            }
                                            break Label_0171;
                                        }
                                        else {
                                            index = U.d.size() - 1;
                                            if (index >= 0) {
                                                final WeakReference<U> weakReference2 = U.d.get(index);
                                                if (weakReference2 == null) {
                                                    break Label_0178;
                                                }
                                                final ContextWrapper contextWrapper = weakReference2.get();
                                                if (contextWrapper != null && contextWrapper.getBaseContext() == context) {
                                                    // monitorexit(c)
                                                    return (Context)contextWrapper;
                                                }
                                                break Label_0183;
                                            }
                                        }
                                    }
                                    final U referent = new U(context);
                                    U.d.add(new WeakReference<Context>((Context)referent));
                                    // monitorexit(c)
                                    return (Context)referent;
                                }
                                // monitorexit(c)
                                finally {}
                                final Context context2;
                                context = context2;
                                continue;
                            }
                        }
                        --index;
                        continue Label_0087_Outer;
                    }
                    final ContextWrapper contextWrapper = null;
                    continue;
                }
                --index;
                continue Label_0117_Outer;
            }
        }
    }
    
    public AssetManager getAssets() {
        return this.a.getAssets();
    }
    
    public Resources getResources() {
        return this.a;
    }
    
    public Resources$Theme getTheme() {
        Resources$Theme resources$Theme;
        if ((resources$Theme = this.b) == null) {
            resources$Theme = super.getTheme();
        }
        return resources$Theme;
    }
    
    public void setTheme(final int theme) {
        final Resources$Theme b = this.b;
        if (b == null) {
            super.setTheme(theme);
            return;
        }
        b.applyStyle(theme, true);
    }
}
