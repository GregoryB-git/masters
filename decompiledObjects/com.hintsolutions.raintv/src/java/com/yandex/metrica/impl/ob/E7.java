/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  androidx.annotation.WorkerThread
 *  com.yandex.metrica.impl.ob.j7
 *  com.yandex.metrica.impl.ob.v7
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.A3;
import com.yandex.metrica.impl.ob.B0;
import com.yandex.metrica.impl.ob.W6;
import com.yandex.metrica.impl.ob.f7;
import com.yandex.metrica.impl.ob.j7;
import com.yandex.metrica.impl.ob.v7;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class e7 {
    @Nullable
    private String a;
    private final Context b;
    private final List<f7> c;
    private final W6 d;
    private boolean e;
    private boolean f;
    @Nullable
    private f7 g;
    @NonNull
    private final B0 h;

    public e7(@NonNull Context context, @NonNull A3 a3) {
        a3 = A2.a(21) ? Arrays.asList((Object[])new f7[]{new v7(context, a3), new j7()}) : Collections.singletonList((Object)new j7());
        this(context, (List<f7>)a3, new B0(), new W6());
    }

    @VisibleForTesting
    public e7(@NonNull Context context, @NonNull List<f7> list, @NonNull B0 b0, @NonNull W6 w62) {
        this.b = context;
        this.c = list;
        this.h = b0;
        this.d = w62;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void a() {
        block13: {
            e7 e72 = this;
            // MONITORENTER : e72
            if (!this.f) {
                block14: {
                    e72 = this;
                    // MONITORENTER : e72
                    Iterator iterator = this.c.iterator();
                    while (true) {
                        f7 f72;
                        if (iterator.hasNext()) {
                            f72 = (f7)iterator.next();
                            W6 w62 = this.d;
                            String string = f72.c();
                            w62.getClass();
                            System.loadLibrary((String)string);
                            // MONITOREXIT : e72
                        }
                        f72 = null;
                        // MONITOREXIT : e72
                        this.g = f72;
                        if (f72 == null) break block13;
                        f72.a(false);
                        break block14;
                        break;
                    }
                    catch (Throwable throwable) {}
                    {
                        catch (Throwable throwable) {
                            continue;
                        }
                    }
                }
                this.a = this.h.b(this.b, this.g.a());
            }
        }
        this.f = true;
        // MONITOREXIT : e72
    }

    public void a(@NonNull String string) {
        f7 f72 = this.g;
        if (f72 != null) {
            f72.a(string);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @WorkerThread
    public void a(boolean bl, @NonNull String object, @Nullable String string) {
        e7 e72 = this;
        // MONITORENTER : e72
        boolean bl2 = true;
        if (bl) {
            e72 = this;
            // MONITORENTER : e72
            try {
                void var3_5;
                String string2;
                this.a();
                e72 = this;
                // MONITORENTER : e72
                f7 f72 = this.g;
                bl2 = f72 != null;
                // MONITOREXIT : e72
                if (!bl2 || (string2 = this.a) == null || this.e) return;
                f72.a((String)object, string2, (String)var3_5);
                this.e = true;
                return;
            }
            catch (Throwable throwable) {
                this.e = false;
            }
            return;
        }
        e72 = this;
        // MONITORENTER : e72
        try {
            e72 = this;
            // MONITORENTER : e72
            object = this.g;
            if (object == null) {
                bl2 = false;
            }
            // MONITOREXIT : e72
            if (bl2 && this.e) {
                object.b();
            }
        }
        catch (Throwable throwable) {}
        this.e = false;
        // MONITOREXIT : e72
        // MONITOREXIT : e72
    }
}

