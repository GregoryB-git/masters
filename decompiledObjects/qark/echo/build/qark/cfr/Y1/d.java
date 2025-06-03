/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 *  java.util.concurrent.locks.ReentrantLock
 */
package Y1;

import android.net.Uri;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import q.b;
import q.e;

public abstract class d
extends q.d {
    public static final a a = new a(null);
    public static final ReentrantLock b = new ReentrantLock();

    public static final /* synthetic */ b a() {
        return null;
    }

    public static final /* synthetic */ e c() {
        return null;
    }

    public static final /* synthetic */ void d(e e8) {
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final e a() {
            b.lock();
            d.c();
            d.d(null);
            b.unlock();
            return null;
        }

        public final void b(Uri uri) {
            Intrinsics.checkNotNullParameter((Object)uri, "url");
            this.c();
            b.lock();
            d.c();
            b.unlock();
        }

        public final void c() {
            b.lock();
            d.c();
            d.a();
            b.unlock();
        }
    }

}

