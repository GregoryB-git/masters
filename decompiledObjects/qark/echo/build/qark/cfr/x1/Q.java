/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Parcelable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package x1;

import android.content.Intent;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import x1.B;
import x1.O;
import x1.P;

public final class Q {
    public static final a d = new a(null);
    public static volatile Q e;
    public final Z.a a;
    public final P b;
    public O c;

    public Q(Z.a a8, P p8) {
        Intrinsics.checkNotNullParameter(a8, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(p8, "profileCache");
        this.a = a8;
        this.b = p8;
    }

    public static final /* synthetic */ void b(Q q8) {
        e = q8;
    }

    public final O c() {
        return this.c;
    }

    public final boolean d() {
        O o8 = this.b.b();
        if (o8 != null) {
            this.g(o8, false);
            return true;
        }
        return false;
    }

    public final void e(O o8, O o9) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", (Parcelable)o8);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", (Parcelable)o9);
        this.a.d(intent);
    }

    public final void f(O o8) {
        this.g(o8, true);
    }

    public final void g(O o8, boolean bl) {
        O o9 = this.c;
        this.c = o8;
        if (bl) {
            P p8 = this.b;
            if (o8 != null) {
                p8.c(o8);
            } else {
                p8.a();
            }
        }
        if (!O1.P.e(o9, o8)) {
            this.e(o9, o8);
        }
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final Q a() {
            synchronized (this) {
                Throwable throwable2;
                block5 : {
                    Object object;
                    try {
                        if (e == null) {
                            object = Z.a.b(B.l());
                            Intrinsics.checkNotNullExpressionValue(object, "getInstance(applicationContext)");
                            Q.b(new Q((Z.a)object, new P()));
                        }
                        if ((object = e) == null) break block5;
                    }
                    catch (Throwable throwable2) {}
                    return object;
                }
                Intrinsics.n("instance");
                throw null;
                throw throwable2;
            }
        }
    }

}

