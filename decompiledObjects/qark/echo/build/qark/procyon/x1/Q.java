// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import android.os.Parcelable;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import Z.a;

public final class Q
{
    public static final a d;
    public static volatile Q e;
    public final Z.a a;
    public final P b;
    public O c;
    
    static {
        d = new a(null);
    }
    
    public Q(final Z.a a, final P b) {
        Intrinsics.checkNotNullParameter(a, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(b, "profileCache");
        this.a = a;
        this.b = b;
    }
    
    public static final /* synthetic */ Q a() {
        return Q.e;
    }
    
    public static final /* synthetic */ void b(final Q e) {
        Q.e = e;
    }
    
    public final O c() {
        return this.c;
    }
    
    public final boolean d() {
        final O b = this.b.b();
        if (b != null) {
            this.g(b, false);
            return true;
        }
        return false;
    }
    
    public final void e(final O o, final O o2) {
        final Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", (Parcelable)o);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", (Parcelable)o2);
        this.a.d(intent);
    }
    
    public final void f(final O o) {
        this.g(o, true);
    }
    
    public final void g(final O c, final boolean b) {
        final O c2 = this.c;
        this.c = c;
        if (b) {
            final P b2 = this.b;
            if (c != null) {
                b2.c(c);
            }
            else {
                b2.a();
            }
        }
        if (!O1.P.e(c2, c)) {
            this.e(c2, c);
        }
    }
    
    public static final class a
    {
        public final Q a() {
            // monitorenter(this)
            while (true) {
                try {
                    if (Q.a() == null) {
                        final Z.a b = Z.a.b(B.l());
                        Intrinsics.checkNotNullExpressionValue(b, "getInstance(applicationContext)");
                        Q.b(new Q(b, new P()));
                    }
                    final Q a = Q.a();
                    if (a != null) {
                        // monitorexit(this)
                        return a;
                    }
                    Intrinsics.n("instance");
                    throw null;
                    // monitorexit(this)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
}
