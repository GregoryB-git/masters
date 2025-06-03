package Y1;

import O1.H;
import O1.P;
import Y1.A;
import Y1.u;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;
import x1.C2162o;
import x1.EnumC2155h;

/* loaded from: classes.dex */
public abstract class D extends A {

    /* renamed from: r, reason: collision with root package name */
    public final EnumC2155h f7360r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(u loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f7360r = EnumC2155h.FACEBOOK_APPLICATION_WEB;
    }

    public static final void A(D this$0, u.e request, Bundle extras) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(extras, "$extras");
        try {
            this$0.x(request, this$0.k(request, extras));
        } catch (x1.D e7) {
            x1.r c7 = e7.c();
            this$0.w(request, c7.d(), c7.c(), String.valueOf(c7.b()));
        } catch (C2162o e8) {
            this$0.w(request, null, e8.getMessage(), null);
        }
    }

    public boolean B(Intent intent, int i7) {
        androidx.activity.result.c M12;
        if (intent == null || !y(intent)) {
            return false;
        }
        Fragment k7 = d().k();
        V5.t tVar = null;
        x xVar = k7 instanceof x ? (x) k7 : null;
        if (xVar != null && (M12 = xVar.M1()) != null) {
            M12.a(intent);
            tVar = V5.t.f6803a;
        }
        return tVar != null;
    }

    @Override // Y1.A
    public boolean j(int i7, int i8, Intent intent) {
        u.f d7;
        u.e o7 = d().o();
        if (intent != null) {
            if (i8 == 0) {
                v(o7, intent);
            } else if (i8 != -1) {
                d7 = u.f.c.d(u.f.f7502w, o7, "Unexpected resultCode from authorization.", null, null, 8, null);
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    q(u.f.c.d(u.f.f7502w, o7, "Unexpected null from returned authorization data.", null, null, 8, null));
                    return true;
                }
                String r7 = r(extras);
                Object obj = extras.get("error_code");
                String obj2 = obj == null ? null : obj.toString();
                String t7 = t(extras);
                String string = extras.getString("e2e");
                if (!P.c0(string)) {
                    h(string);
                }
                if (r7 == null && obj2 == null && t7 == null && o7 != null) {
                    z(o7, extras);
                } else {
                    w(o7, r7, t7, obj2);
                }
            }
            return true;
        }
        d7 = u.f.f7502w.a(o7, "Operation canceled");
        q(d7);
        return true;
    }

    public final void q(u.f fVar) {
        if (fVar != null) {
            d().g(fVar);
        } else {
            d().B();
        }
    }

    public String r(Bundle bundle) {
        String string = bundle == null ? null : bundle.getString("error");
        if (string != null) {
            return string;
        }
        if (bundle == null) {
            return null;
        }
        return bundle.getString("error_type");
    }

    public String t(Bundle bundle) {
        String string = bundle == null ? null : bundle.getString("error_message");
        if (string != null) {
            return string;
        }
        if (bundle == null) {
            return null;
        }
        return bundle.getString("error_description");
    }

    public EnumC2155h u() {
        return this.f7360r;
    }

    public void v(u.e eVar, Intent data) {
        Object obj;
        Intrinsics.checkNotNullParameter(data, "data");
        Bundle extras = data.getExtras();
        String r7 = r(extras);
        String str = null;
        if (extras != null && (obj = extras.get("error_code")) != null) {
            str = obj.toString();
        }
        q(Intrinsics.a(H.c(), str) ? u.f.f7502w.c(eVar, r7, t(extras), str) : u.f.f7502w.a(eVar, r7));
    }

    public void w(u.e eVar, String str, String str2, String str3) {
        boolean o7;
        boolean o8;
        if (str == null || !Intrinsics.a(str, "logged_out")) {
            o7 = W5.w.o(H.d(), str);
            if (!o7) {
                o8 = W5.w.o(H.e(), str);
                q(o8 ? u.f.f7502w.a(eVar, null) : u.f.f7502w.c(eVar, str, str2, str3));
                return;
            }
        } else {
            C0710c.f7386z = true;
        }
        q(null);
    }

    public void x(u.e request, Bundle extras) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(extras, "extras");
        try {
            A.a aVar = A.f7349q;
            q(u.f.f7502w.b(request, aVar.b(request.n(), extras, u(), request.a()), aVar.d(extras, request.m())));
        } catch (C2162o e7) {
            q(u.f.c.d(u.f.f7502w, request, null, e7.getMessage(), null, 8, null));
        }
    }

    public final boolean y(Intent intent) {
        Intrinsics.checkNotNullExpressionValue(C2146B.l().getPackageManager().queryIntentActivities(intent, 65536), "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
        return !r3.isEmpty();
    }

    public final void z(final u.e eVar, final Bundle bundle) {
        if (bundle.containsKey("code")) {
            P p7 = P.f3756a;
            if (!P.c0(bundle.getString("code"))) {
                C2146B.t().execute(new Runnable() { // from class: Y1.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        D.A(D.this, eVar, bundle);
                    }
                });
                return;
            }
        }
        x(eVar, bundle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f7360r = EnumC2155h.FACEBOOK_APPLICATION_WEB;
    }
}
