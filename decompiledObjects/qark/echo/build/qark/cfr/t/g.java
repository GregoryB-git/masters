/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package t;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class g {
    public final LinkedHashMap a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public g(int n8) {
        if (n8 > 0) {
            this.c = n8;
            this.a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public Object a(Object object) {
        return null;
    }

    public void b(boolean bl, Object object, Object object2, Object object3) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object c(Object object) {
        Object object2;
        block12 : {
            if (object == null) throw new NullPointerException("key == null");
            // MONITORENTER : this
            object2 = this.a.get(object);
            if (object2 != null) {
                ++this.g;
                // MONITOREXIT : this
                return object2;
            }
            ++this.h;
            // MONITOREXIT : this
            object2 = this.a(object);
            if (object2 == null) {
                return null;
            }
            // MONITORENTER : this
            ++this.e;
            Object object3 = this.a.put(object, object2);
            if (object3 != null) {
                this.a.put(object, object3);
            } else {
                this.b += this.f(object, object2);
            }
            // MONITOREXIT : this
            if (object3 == null) break block12;
            this.b(false, object, object2, object3);
            return object3;
        }
        this.i(this.c);
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object d(Object object, Object object2) {
        Object object3;
        block5 : {
            if (object == null) throw new NullPointerException("key == null || value == null");
            if (object2 == null) throw new NullPointerException("key == null || value == null");
            // MONITORENTER : this
            ++this.d;
            this.b += this.f(object, object2);
            object3 = this.a.put(object, object2);
            if (object3 != null) {
                this.b -= this.f(object, object3);
            }
            // MONITOREXIT : this
            if (object3 == null) break block5;
            this.b(false, object, object3, object2);
        }
        this.i(this.c);
        return object3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object e(Object object) {
        if (object == null) throw new NullPointerException("key == null");
        // MONITORENTER : this
        Object object2 = this.a.remove(object);
        if (object2 != null) {
            this.b -= this.f(object, object2);
        }
        // MONITOREXIT : this
        if (object2 == null) return object2;
        this.b(false, object, object2, null);
        return object2;
    }

    public final int f(Object object, Object object2) {
        int n8 = this.g(object, object2);
        if (n8 >= 0) {
            return n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Negative size: ");
        stringBuilder.append(object);
        stringBuilder.append("=");
        stringBuilder.append(object2);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public int g(Object object, Object object2) {
        return 1;
    }

    public final Map h() {
        synchronized (this) {
            LinkedHashMap linkedHashMap = new LinkedHashMap((Map)this.a);
            return linkedHashMap;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void i(int var1_1) {
        do {
            // MONITORENTER : this
            if (this.b < 0 || this.a.isEmpty() && this.b != 0) ** GOTO lbl18
            if (this.b <= var1_1 || this.a.isEmpty()) break;
            var3_4 = (Map.Entry)this.a.entrySet().iterator().next();
            var2_2 = var3_4.getKey();
            var3_4 = var3_4.getValue();
            this.a.remove(var2_2);
            this.b -= this.f(var2_2, var3_4);
            ++this.f;
            // MONITOREXIT : this
            this.b(true, var2_2, var3_4, null);
        } while (true);
        // MONITOREXIT : this
        return;
lbl18: // 1 sources:
        var2_2 = new StringBuilder();
        var2_2.append(this.getClass().getName());
        var2_2.append(".sizeOf() is reporting inconsistent results!");
        throw new IllegalStateException(var2_2.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String toString() {
        synchronized (this) {
            try {
                int n8 = this.g;
                int n9 = this.h + n8;
                n8 = n9 != 0 ? n8 * 100 / n9 : 0;
                return String.format((Locale)Locale.US, (String)"LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", (Object[])new Object[]{this.c, this.g, this.h, n8});
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

