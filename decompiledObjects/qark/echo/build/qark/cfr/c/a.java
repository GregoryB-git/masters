/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.Set
 *  java.util.concurrent.CopyOnWriteArraySet
 */
package c;

import android.content.Context;
import c.b;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class a {
    public final Set a = new CopyOnWriteArraySet();
    public volatile Context b;

    public void a(b b8) {
        if (this.b != null) {
            b8.a(this.b);
        }
        this.a.add((Object)b8);
    }

    public void b() {
        this.b = null;
    }

    public void c(Context context) {
        this.b = context;
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((b)iterator.next()).a(context);
        }
    }
}

