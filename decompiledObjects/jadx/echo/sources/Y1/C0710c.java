package Y1;

import O1.C0442e;
import O1.C0443f;
import O1.P;
import Y1.AbstractC0711d;
import Y1.u;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.facebook.CustomTabMainActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import x1.C2146B;
import x1.C2162o;
import x1.C2164q;
import x1.EnumC2155h;

/* renamed from: Y1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0710c extends F {

    /* renamed from: z, reason: collision with root package name */
    public static boolean f7386z;

    /* renamed from: t, reason: collision with root package name */
    public String f7387t;

    /* renamed from: u, reason: collision with root package name */
    public String f7388u;

    /* renamed from: v, reason: collision with root package name */
    public String f7389v;

    /* renamed from: w, reason: collision with root package name */
    public final String f7390w;

    /* renamed from: x, reason: collision with root package name */
    public final EnumC2155h f7391x;

    /* renamed from: y, reason: collision with root package name */
    public static final b f7385y = new b(null);

    @NotNull
    public static final Parcelable.Creator<C0710c> CREATOR = new a();

    /* renamed from: Y1.c$a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0710c createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new C0710c(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0710c[] newArray(int i7) {
            return new C0710c[i7];
        }
    }

    /* renamed from: Y1.c$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0710c(u loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f7390w = "custom_tab";
        this.f7391x = EnumC2155h.CHROME_CUSTOM_TAB;
        this.f7388u = P.s(20);
        f7386z = false;
        C0443f c0443f = C0443f.f3841a;
        this.f7389v = C0443f.c(z());
    }

    public static final void B(C0710c this$0, u.e request, Bundle values) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(values, "$values");
        try {
            this$0.v(request, this$0.k(request, values), null);
        } catch (C2162o e7) {
            this$0.v(request, null, e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(java.lang.String r7, final Y1.u.e r8) {
        /*
            r6 = this;
            if (r7 == 0) goto Lcc
            java.lang.String r0 = "fbconnect://cct."
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = kotlin.text.i.s(r7, r0, r1, r2, r3)
            if (r0 != 0) goto L17
            java.lang.String r0 = super.g()
            boolean r0 = kotlin.text.i.s(r7, r0, r1, r2, r3)
            if (r0 == 0) goto Lcc
        L17:
            android.net.Uri r7 = android.net.Uri.parse(r7)
            O1.P r0 = O1.P.f3756a
            java.lang.String r0 = r7.getQuery()
            android.os.Bundle r0 = O1.P.o0(r0)
            java.lang.String r7 = r7.getFragment()
            android.os.Bundle r7 = O1.P.o0(r7)
            r0.putAll(r7)
            boolean r7 = r6.C(r0)
            if (r7 != 0) goto L41
            x1.o r7 = new x1.o
            java.lang.String r0 = "Invalid state parameter"
            r7.<init>(r0)
            super.v(r8, r3, r7)
            return
        L41:
            java.lang.String r7 = "error"
            java.lang.String r7 = r0.getString(r7)
            if (r7 != 0) goto L4f
            java.lang.String r7 = "error_type"
            java.lang.String r7 = r0.getString(r7)
        L4f:
            java.lang.String r1 = "error_msg"
            java.lang.String r1 = r0.getString(r1)
            if (r1 != 0) goto L5d
            java.lang.String r1 = "error_message"
            java.lang.String r1 = r0.getString(r1)
        L5d:
            if (r1 != 0) goto L65
            java.lang.String r1 = "error_description"
            java.lang.String r1 = r0.getString(r1)
        L65:
            java.lang.String r2 = "error_code"
            java.lang.String r2 = r0.getString(r2)
            r4 = -1
            if (r2 != 0) goto L6f
            goto L74
        L6f:
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L74
            goto L75
        L74:
            r2 = r4
        L75:
            boolean r5 = O1.P.c0(r7)
            if (r5 == 0) goto L9c
            boolean r5 = O1.P.c0(r1)
            if (r5 == 0) goto L9c
            if (r2 != r4) goto L9c
            java.lang.String r7 = "access_token"
            boolean r7 = r0.containsKey(r7)
            if (r7 == 0) goto L8f
            super.v(r8, r0, r3)
            return
        L8f:
            java.util.concurrent.Executor r7 = x1.C2146B.t()
            Y1.b r1 = new Y1.b
            r1.<init>()
            r7.execute(r1)
            goto Lcc
        L9c:
            if (r7 == 0) goto Lb7
            java.lang.String r0 = "access_denied"
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r7, r0)
            if (r0 != 0) goto Lae
            java.lang.String r0 = "OAuthAccessDeniedException"
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r7, r0)
            if (r0 == 0) goto Lb7
        Lae:
            x1.q r7 = new x1.q
            r7.<init>()
        Lb3:
            super.v(r8, r3, r7)
            goto Lcc
        Lb7:
            r0 = 4201(0x1069, float:5.887E-42)
            if (r2 != r0) goto Lc1
            x1.q r7 = new x1.q
            r7.<init>()
            goto Lb3
        Lc1:
            x1.r r0 = new x1.r
            r0.<init>(r2, r7, r1)
            x1.D r7 = new x1.D
            r7.<init>(r0, r1)
            goto Lb3
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.C0710c.A(java.lang.String, Y1.u$e):void");
    }

    public final boolean C(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return Intrinsics.a(new JSONObject(string).getString("7_challenge"), this.f7388u);
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // Y1.A
    public String f() {
        return this.f7390w;
    }

    @Override // Y1.A
    public String g() {
        return this.f7389v;
    }

    @Override // Y1.A
    public boolean j(int i7, int i8, Intent intent) {
        if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f10223x, false)) {
            return super.j(i7, i8, intent);
        }
        if (i7 != 1) {
            return super.j(i7, i8, intent);
        }
        u.e o7 = d().o();
        if (o7 == null) {
            return false;
        }
        if (i8 == -1) {
            A(intent != null ? intent.getStringExtra(CustomTabMainActivity.f10220u) : null, o7);
            return true;
        }
        super.v(o7, null, new C2164q());
        return false;
    }

    @Override // Y1.A
    public void l(JSONObject param) {
        Intrinsics.checkNotNullParameter(param, "param");
        param.put("7_challenge", this.f7388u);
    }

    @Override // Y1.A
    public int o(u.e request) {
        AbstractC0711d.a aVar;
        Uri a7;
        Intrinsics.checkNotNullParameter(request, "request");
        u d7 = d();
        if (g().length() == 0) {
            return 0;
        }
        Bundle p7 = p(q(request), request);
        if (f7386z) {
            p7.putString("cct_over_app_switch", "1");
        }
        if (C2146B.f20878q) {
            if (request.r()) {
                aVar = AbstractC0711d.f7392a;
                a7 = O1.x.f3966c.a("oauth", p7);
            } else {
                aVar = AbstractC0711d.f7392a;
                a7 = C0442e.f3839b.a("oauth", p7);
            }
            aVar.b(a7);
        }
        androidx.fragment.app.e i7 = d7.i();
        if (i7 == null) {
            return 0;
        }
        Intent intent = new Intent(i7, (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f10217r, "oauth");
        intent.putExtra(CustomTabMainActivity.f10218s, p7);
        intent.putExtra(CustomTabMainActivity.f10219t, y());
        intent.putExtra(CustomTabMainActivity.f10221v, request.k().toString());
        Fragment k7 = d7.k();
        if (k7 != null) {
            k7.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // Y1.F
    public String r() {
        return "chrome_custom_tab";
    }

    @Override // Y1.F
    public EnumC2155h t() {
        return this.f7391x;
    }

    @Override // Y1.A, android.os.Parcelable
    public void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, i7);
        dest.writeString(this.f7388u);
    }

    public final String y() {
        String str = this.f7387t;
        if (str != null) {
            return str;
        }
        String a7 = C0443f.a();
        this.f7387t = a7;
        return a7;
    }

    public final String z() {
        return super.g();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0710c(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f7390w = "custom_tab";
        this.f7391x = EnumC2155h.CHROME_CUSTOM_TAB;
        this.f7388u = source.readString();
        C0443f c0443f = C0443f.f3841a;
        this.f7389v = C0443f.c(z());
    }
}
