/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 */
package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class r {
    public final Map a = new HashMap();
    public volatile boolean b = false;

    public static void b(Object object) {
        if (object instanceof Closeable) {
            try {
                ((Closeable)object).close();
                return;
            }
            catch (IOException iOException) {
                throw new RuntimeException((Throwable)iOException);
            }
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a() {
        this.b = true;
        Map map = this.a;
        if (map != null) {
            // MONITORENTER : map
            Iterator iterator = this.a.values().iterator();
            while (iterator.hasNext()) {
                r.b(iterator.next());
            }
            // MONITOREXIT : map
        }
        this.d();
        return;
        catch (Throwable throwable) {
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object c(String object) {
        Map map = this.a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            return this.a.get(object);
        }
    }

    public void d() {
    }
}

