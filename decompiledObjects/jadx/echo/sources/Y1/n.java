package Y1;

import Y1.u;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x1.C2148a;
import x1.EnumC2155h;

/* loaded from: classes.dex */
public class n extends A {

    /* renamed from: t, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f7441t;

    /* renamed from: r, reason: collision with root package name */
    public final String f7442r;

    /* renamed from: s, reason: collision with root package name */
    public static final b f7440s = new b(null);

    @NotNull
    public static final Parcelable.Creator<n> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new n(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i7) {
            return new n[i7];
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final synchronized ScheduledThreadPoolExecutor a() {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
            try {
                if (n.f7441t == null) {
                    n.f7441t = new ScheduledThreadPoolExecutor(1);
                }
                scheduledThreadPoolExecutor = n.f7441t;
                if (scheduledThreadPoolExecutor == null) {
                    Intrinsics.n("backgroundExecutor");
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
            return scheduledThreadPoolExecutor;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f7442r = "device_auth";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // Y1.A
    public String f() {
        return this.f7442r;
    }

    @Override // Y1.A
    public int o(u.e request) {
        Intrinsics.checkNotNullParameter(request, "request");
        w(request);
        return 1;
    }

    public m r() {
        return new m();
    }

    public void t() {
        d().g(u.f.f7502w.a(d().o(), "User canceled log in."));
    }

    public void u(Exception ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        d().g(u.f.c.d(u.f.f7502w, d().o(), null, ex.getMessage(), null, 8, null));
    }

    public void v(String accessToken, String applicationId, String userId, Collection collection, Collection collection2, Collection collection3, EnumC2155h enumC2155h, Date date, Date date2, Date date3) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        d().g(u.f.f7502w.e(d().o(), new C2148a(accessToken, applicationId, userId, collection, collection2, collection3, enumC2155h, date, date2, date3, null, 1024, null)));
    }

    public final void w(u.e eVar) {
        androidx.fragment.app.e i7 = d().i();
        if (i7 == null || i7.isFinishing()) {
            return;
        }
        m r7 = r();
        r7.T1(i7.n(), "login_with_facebook");
        r7.v2(eVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f7442r = "device_auth";
    }
}
