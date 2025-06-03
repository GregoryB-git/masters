package x1;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: d, reason: collision with root package name */
    public static final a f20972d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static volatile Q f20973e;

    /* renamed from: a, reason: collision with root package name */
    public final Z.a f20974a;

    /* renamed from: b, reason: collision with root package name */
    public final P f20975b;

    /* renamed from: c, reason: collision with root package name */
    public O f20976c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final synchronized Q a() {
            Q q7;
            try {
                if (Q.f20973e == null) {
                    Z.a b7 = Z.a.b(C2146B.l());
                    Intrinsics.checkNotNullExpressionValue(b7, "getInstance(applicationContext)");
                    Q.f20973e = new Q(b7, new P());
                }
                q7 = Q.f20973e;
                if (q7 == null) {
                    Intrinsics.n("instance");
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
            return q7;
        }
    }

    public Q(Z.a localBroadcastManager, P profileCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(profileCache, "profileCache");
        this.f20974a = localBroadcastManager;
        this.f20975b = profileCache;
    }

    public final O c() {
        return this.f20976c;
    }

    public final boolean d() {
        O b7 = this.f20975b.b();
        if (b7 == null) {
            return false;
        }
        g(b7, false);
        return true;
    }

    public final void e(O o7, O o8) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", o7);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", o8);
        this.f20974a.d(intent);
    }

    public final void f(O o7) {
        g(o7, true);
    }

    public final void g(O o7, boolean z7) {
        O o8 = this.f20976c;
        this.f20976c = o7;
        if (z7) {
            P p7 = this.f20975b;
            if (o7 != null) {
                p7.c(o7);
            } else {
                p7.a();
            }
        }
        if (O1.P.e(o8, o7)) {
            return;
        }
        e(o8, o7);
    }
}
