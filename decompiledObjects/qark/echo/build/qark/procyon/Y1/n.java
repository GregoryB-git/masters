// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y1;

import androidx.fragment.app.e;
import x1.a;
import java.util.Date;
import x1.h;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import android.os.Parcel;
import kotlin.jvm.internal.g;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.jetbrains.annotations.NotNull;
import android.os.Parcelable$Creator;

public class n extends A
{
    @NotNull
    public static final Parcelable$Creator<n> CREATOR;
    public static final b s;
    public static ScheduledThreadPoolExecutor t;
    public final String r;
    
    static {
        s = new b(null);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public n a(final Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new n(parcel);
            }
            
            public n[] b(final int n) {
                return new n[n];
            }
        };
    }
    
    public n(final u u) {
        Intrinsics.checkNotNullParameter(u, "loginClient");
        super(u);
        this.r = "device_auth";
    }
    
    public n(final Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        super(parcel);
        this.r = "device_auth";
    }
    
    public static final /* synthetic */ ScheduledThreadPoolExecutor p() {
        return n.t;
    }
    
    public static final /* synthetic */ void q(final ScheduledThreadPoolExecutor t) {
        n.t = t;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String f() {
        return this.r;
    }
    
    @Override
    public int o(final u.e e) {
        Intrinsics.checkNotNullParameter(e, "request");
        this.w(e);
        return 1;
    }
    
    public m r() {
        return new m();
    }
    
    public void t() {
        this.d().g(u.f.w.a(this.d().o(), "User canceled log in."));
    }
    
    public void u(final Exception ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        this.d().g(u.f.c.d(u.f.w, this.d().o(), null, ex.getMessage(), null, 8, null));
    }
    
    public void v(final String s, final String s2, final String s3, final Collection collection, final Collection collection2, final Collection collection3, final h h, final Date date, final Date date2, final Date date3) {
        Intrinsics.checkNotNullParameter(s, "accessToken");
        Intrinsics.checkNotNullParameter(s2, "applicationId");
        Intrinsics.checkNotNullParameter(s3, "userId");
        this.d().g(u.f.w.e(this.d().o(), new x1.a(s, s2, s3, collection, collection2, collection3, h, date, date2, date3, null, 1024, null)));
    }
    
    public final void w(final u.e e) {
        final e i = this.d().i();
        if (i != null) {
            if (i.isFinishing()) {
                return;
            }
            final m r = this.r();
            r.T1(i.n(), "login_with_facebook");
            r.v2(e);
        }
    }
    
    public static final class b
    {
        public final ScheduledThreadPoolExecutor a() {
            // monitorenter(this)
            while (true) {
                try {
                    if (n.p() == null) {
                        n.q(new ScheduledThreadPoolExecutor(1));
                    }
                    final ScheduledThreadPoolExecutor p = n.p();
                    if (p != null) {
                        // monitorexit(this)
                        return p;
                    }
                    Intrinsics.n("backgroundExecutor");
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
