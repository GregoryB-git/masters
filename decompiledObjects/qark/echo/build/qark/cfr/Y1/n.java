/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.Date
 *  java.util.concurrent.ScheduledThreadPoolExecutor
 */
package Y1;

import Y1.A;
import Y1.m;
import Y1.u;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.e;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;
import x1.a;
import x1.h;

public class n
extends A {
    @NotNull
    public static final Parcelable.Creator<n> CREATOR;
    public static final b s;
    public static ScheduledThreadPoolExecutor t;
    public final String r;

    static {
        s = new b(null);
        CREATOR = new Parcelable.Creator(){

            public n a(Parcel parcel) {
                Intrinsics.checkNotNullParameter((Object)parcel, "source");
                return new n(parcel);
            }

            public n[] b(int n8) {
                return new n[n8];
            }
        };
    }

    public n(u u8) {
        Intrinsics.checkNotNullParameter(u8, "loginClient");
        super(u8);
        this.r = "device_auth";
    }

    public n(Parcel parcel) {
        Intrinsics.checkNotNullParameter((Object)parcel, "parcel");
        super(parcel);
        this.r = "device_auth";
    }

    public static final /* synthetic */ void q(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        t = scheduledThreadPoolExecutor;
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public String f() {
        return this.r;
    }

    @Override
    public int o(u.e e8) {
        Intrinsics.checkNotNullParameter(e8, "request");
        this.w(e8);
        return 1;
    }

    public m r() {
        return new m();
    }

    public void t() {
        u.f f8 = u.f.w.a(this.d().o(), "User canceled log in.");
        this.d().g(f8);
    }

    public void u(Exception object) {
        Intrinsics.checkNotNullParameter(object, "ex");
        object = u.f.c.d(u.f.w, this.d().o(), null, object.getMessage(), null, 8, null);
        this.d().g((u.f)object);
    }

    public void v(String object, String string2, String string3, Collection collection, Collection collection2, Collection collection3, h h8, Date date, Date date2, Date date3) {
        Intrinsics.checkNotNullParameter(object, "accessToken");
        Intrinsics.checkNotNullParameter(string2, "applicationId");
        Intrinsics.checkNotNullParameter(string3, "userId");
        object = new a((String)object, string2, string3, collection, collection2, collection3, h8, date, date2, date3, null, 1024, null);
        object = u.f.w.e(this.d().o(), (a)object);
        this.d().g((u.f)object);
    }

    public final void w(u.e e8) {
        e e9 = this.d().i();
        if (e9 != null) {
            if (e9.isFinishing()) {
                return;
            }
            m m8 = this.r();
            m8.T1(e9.n(), "login_with_facebook");
            m8.v2(e8);
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final ScheduledThreadPoolExecutor a() {
            synchronized (this) {
                Throwable throwable2;
                block5 : {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
                    try {
                        if (t == null) {
                            n.q(new ScheduledThreadPoolExecutor(1));
                        }
                        if ((scheduledThreadPoolExecutor = t) == null) break block5;
                    }
                    catch (Throwable throwable2) {}
                    return scheduledThreadPoolExecutor;
                }
                Intrinsics.n("backgroundExecutor");
                throw null;
                throw throwable2;
            }
        }
    }

}

