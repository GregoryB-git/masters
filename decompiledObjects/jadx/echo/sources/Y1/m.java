package Y1;

import O1.C0458v;
import O1.P;
import O1.Q;
import Y1.u;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0782d;
import com.facebook.FacebookActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.C2146B;
import x1.C2148a;
import x1.C2162o;
import x1.EnumC2155h;
import x1.F;
import x1.I;
import x1.K;
import x1.L;
import y1.C2237F;

@Metadata
/* loaded from: classes.dex */
public class m extends DialogInterfaceOnCancelListenerC0782d {

    /* renamed from: P0, reason: collision with root package name */
    public static final a f7415P0 = new a(null);

    /* renamed from: Q0, reason: collision with root package name */
    public static final String f7416Q0 = "device/login";

    /* renamed from: R0, reason: collision with root package name */
    public static final String f7417R0 = "device/login_status";

    /* renamed from: S0, reason: collision with root package name */
    public static final int f7418S0 = 1349174;

    /* renamed from: E0, reason: collision with root package name */
    public View f7419E0;

    /* renamed from: F0, reason: collision with root package name */
    public TextView f7420F0;

    /* renamed from: G0, reason: collision with root package name */
    public TextView f7421G0;

    /* renamed from: H0, reason: collision with root package name */
    public n f7422H0;

    /* renamed from: I0, reason: collision with root package name */
    public final AtomicBoolean f7423I0 = new AtomicBoolean();

    /* renamed from: J0, reason: collision with root package name */
    public volatile I f7424J0;

    /* renamed from: K0, reason: collision with root package name */
    public volatile ScheduledFuture f7425K0;

    /* renamed from: L0, reason: collision with root package name */
    public volatile c f7426L0;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f7427M0;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f7428N0;

    /* renamed from: O0, reason: collision with root package name */
    public u.e f7429O0;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final b b(JSONObject jSONObject) {
            String optString;
            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    JSONObject optJSONObject = jSONArray.optJSONObject(i7);
                    String permission = optJSONObject.optString("permission");
                    Intrinsics.checkNotNullExpressionValue(permission, "permission");
                    if (permission.length() != 0 && !Intrinsics.a(permission, "installed") && (optString = optJSONObject.optString("status")) != null) {
                        int hashCode = optString.hashCode();
                        if (hashCode != -1309235419) {
                            if (hashCode != 280295099) {
                                if (hashCode == 568196142 && optString.equals("declined")) {
                                    arrayList2.add(permission);
                                }
                            } else if (optString.equals("granted")) {
                                arrayList.add(permission);
                            }
                        } else if (optString.equals("expired")) {
                            arrayList3.add(permission);
                        }
                    }
                    if (i8 >= length) {
                        break;
                    }
                    i7 = i8;
                }
            }
            return new b(arrayList, arrayList2, arrayList3);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public List f7430a;

        /* renamed from: b, reason: collision with root package name */
        public List f7431b;

        /* renamed from: c, reason: collision with root package name */
        public List f7432c;

        public b(List grantedPermissions, List declinedPermissions, List expiredPermissions) {
            Intrinsics.checkNotNullParameter(grantedPermissions, "grantedPermissions");
            Intrinsics.checkNotNullParameter(declinedPermissions, "declinedPermissions");
            Intrinsics.checkNotNullParameter(expiredPermissions, "expiredPermissions");
            this.f7430a = grantedPermissions;
            this.f7431b = declinedPermissions;
            this.f7432c = expiredPermissions;
        }

        public final List a() {
            return this.f7431b;
        }

        public final List b() {
            return this.f7432c;
        }

        public final List c() {
            return this.f7430a;
        }
    }

    public static final class c implements Parcelable {

        /* renamed from: o, reason: collision with root package name */
        public String f7434o;

        /* renamed from: p, reason: collision with root package name */
        public String f7435p;

        /* renamed from: q, reason: collision with root package name */
        public String f7436q;

        /* renamed from: r, reason: collision with root package name */
        public long f7437r;

        /* renamed from: s, reason: collision with root package name */
        public long f7438s;

        /* renamed from: t, reason: collision with root package name */
        public static final b f7433t = new b(null);

        @NotNull
        public static final Parcelable.Creator<c> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i7) {
                return new c[i7];
            }
        }

        public static final class b {
            public b() {
            }

            public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public c() {
        }

        public c(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            this.f7434o = parcel.readString();
            this.f7435p = parcel.readString();
            this.f7436q = parcel.readString();
            this.f7437r = parcel.readLong();
            this.f7438s = parcel.readLong();
        }

        public final String a() {
            return this.f7434o;
        }

        public final long b() {
            return this.f7437r;
        }

        public final String c() {
            return this.f7436q;
        }

        public final String d() {
            return this.f7435p;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final void e(long j7) {
            this.f7437r = j7;
        }

        public final void f(long j7) {
            this.f7438s = j7;
        }

        public final void g(String str) {
            this.f7436q = str;
        }

        public final void h(String str) {
            this.f7435p = str;
            kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
            String format = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            this.f7434o = format;
        }

        public final boolean i() {
            return this.f7438s != 0 && (new Date().getTime() - this.f7438s) - (this.f7437r * 1000) < 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int i7) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f7434o);
            dest.writeString(this.f7435p);
            dest.writeString(this.f7436q);
            dest.writeLong(this.f7437r);
            dest.writeLong(this.f7438s);
        }
    }

    public static final class d extends Dialog {
        public d(androidx.fragment.app.e eVar, int i7) {
            super(eVar, i7);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            if (m.this.j2()) {
                super.onBackPressed();
            }
        }
    }

    public static final void b2(m this$0, K response) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(response, "response");
        if (this$0.f7423I0.get()) {
            return;
        }
        x1.r b7 = response.b();
        if (b7 == null) {
            try {
                JSONObject c7 = response.c();
                if (c7 == null) {
                    c7 = new JSONObject();
                }
                String string = c7.getString("access_token");
                Intrinsics.checkNotNullExpressionValue(string, "resultObject.getString(\"access_token\")");
                this$0.m2(string, c7.getLong("expires_in"), Long.valueOf(c7.optLong("data_access_expiration_time")));
                return;
            } catch (JSONException e7) {
                this$0.l2(new C2162o(e7));
                return;
            }
        }
        int g7 = b7.g();
        if (g7 == f7418S0 || g7 == 1349172) {
            this$0.s2();
            return;
        }
        if (g7 == 1349152) {
            c cVar = this$0.f7426L0;
            if (cVar != null) {
                N1.a aVar = N1.a.f3605a;
                N1.a.a(cVar.d());
            }
            u.e eVar = this$0.f7429O0;
            if (eVar != null) {
                this$0.v2(eVar);
                return;
            }
        } else if (g7 != 1349173) {
            x1.r b8 = response.b();
            C2162o e8 = b8 == null ? null : b8.e();
            if (e8 == null) {
                e8 = new C2162o();
            }
            this$0.l2(e8);
            return;
        }
        this$0.k2();
    }

    public static final void i2(m this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.k2();
    }

    public static final void n2(m this$0, String accessToken, Date date, Date date2, K response) {
        EnumSet l7;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
        Intrinsics.checkNotNullParameter(response, "response");
        if (this$0.f7423I0.get()) {
            return;
        }
        x1.r b7 = response.b();
        if (b7 != null) {
            C2162o e7 = b7.e();
            if (e7 == null) {
                e7 = new C2162o();
            }
            this$0.l2(e7);
            return;
        }
        try {
            JSONObject c7 = response.c();
            if (c7 == null) {
                c7 = new JSONObject();
            }
            String string = c7.getString("id");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"id\")");
            b b8 = f7415P0.b(c7);
            String string2 = c7.getString("name");
            Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(\"name\")");
            c cVar = this$0.f7426L0;
            if (cVar != null) {
                N1.a aVar = N1.a.f3605a;
                N1.a.a(cVar.d());
            }
            C0458v c0458v = C0458v.f3949a;
            O1.r f7 = C0458v.f(C2146B.m());
            Boolean bool = null;
            if (f7 != null && (l7 = f7.l()) != null) {
                bool = Boolean.valueOf(l7.contains(O1.I.RequireConfirm));
            }
            if (!Intrinsics.a(bool, Boolean.TRUE) || this$0.f7428N0) {
                this$0.d2(string, b8, accessToken, date, date2);
            } else {
                this$0.f7428N0 = true;
                this$0.p2(string, b8, accessToken, string2, date, date2);
            }
        } catch (JSONException e8) {
            this$0.l2(new C2162o(e8));
        }
    }

    public static final void q2(m this$0, String userId, b permissions, String accessToken, Date date, Date date2, DialogInterface dialogInterface, int i7) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(userId, "$userId");
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
        this$0.d2(userId, permissions, accessToken, date, date2);
    }

    public static final void r2(m this$0, DialogInterface dialogInterface, int i7) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View h22 = this$0.h2(false);
        Dialog L12 = this$0.L1();
        if (L12 != null) {
            L12.setContentView(h22);
        }
        u.e eVar = this$0.f7429O0;
        if (eVar == null) {
            return;
        }
        this$0.v2(eVar);
    }

    public static final void t2(m this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.o2();
    }

    public static final void w2(m this$0, K response) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(response, "response");
        if (this$0.f7427M0) {
            return;
        }
        if (response.b() != null) {
            x1.r b7 = response.b();
            C2162o e7 = b7 == null ? null : b7.e();
            if (e7 == null) {
                e7 = new C2162o();
            }
            this$0.l2(e7);
            return;
        }
        JSONObject c7 = response.c();
        if (c7 == null) {
            c7 = new JSONObject();
        }
        c cVar = new c();
        try {
            cVar.h(c7.getString("user_code"));
            cVar.g(c7.getString("code"));
            cVar.e(c7.getLong("interval"));
            this$0.u2(cVar);
        } catch (JSONException e8) {
            this$0.l2(new C2162o(e8));
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0782d, androidx.fragment.app.Fragment
    public void I0(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.I0(outState);
        if (this.f7426L0 != null) {
            outState.putParcelable("request_state", this.f7426L0);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0782d
    public Dialog N1(Bundle bundle) {
        d dVar = new d(o1(), M1.e.f3499b);
        dVar.setContentView(h2(N1.a.e() && !this.f7428N0));
        return dVar;
    }

    public Map c2() {
        return null;
    }

    public final void d2(String str, b bVar, String str2, Date date, Date date2) {
        n nVar = this.f7422H0;
        if (nVar != null) {
            nVar.v(str2, C2146B.m(), str, bVar.c(), bVar.a(), bVar.b(), EnumC2155h.DEVICE_AUTH, date, null, date2);
        }
        Dialog L12 = L1();
        if (L12 == null) {
            return;
        }
        L12.dismiss();
    }

    public String e2() {
        return Q.b() + '|' + Q.c();
    }

    public int f2(boolean z7) {
        return z7 ? M1.c.f3490d : M1.c.f3488b;
    }

    public final x1.F g2() {
        Bundle bundle = new Bundle();
        c cVar = this.f7426L0;
        bundle.putString("code", cVar == null ? null : cVar.c());
        bundle.putString("access_token", e2());
        return x1.F.f20890n.B(null, f7417R0, bundle, new F.b() { // from class: Y1.h
            @Override // x1.F.b
            public final void a(K k7) {
                m.b2(m.this, k7);
            }
        });
    }

    public View h2(boolean z7) {
        LayoutInflater layoutInflater = o1().getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "requireActivity().layoutInflater");
        View inflate = layoutInflater.inflate(f2(z7), (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        View findViewById = inflate.findViewById(M1.b.f3486f);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.progress_bar)");
        this.f7419E0 = findViewById;
        View findViewById2 = inflate.findViewById(M1.b.f3485e);
        if (findViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f7420F0 = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(M1.b.f3481a);
        if (findViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        ((Button) findViewById3).setOnClickListener(new View.OnClickListener() { // from class: Y1.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m.i2(m.this, view);
            }
        });
        View findViewById4 = inflate.findViewById(M1.b.f3482b);
        if (findViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) findViewById4;
        this.f7421G0 = textView;
        textView.setText(Html.fromHtml(P(M1.d.f3491a)));
        return inflate;
    }

    public boolean j2() {
        return true;
    }

    public void k2() {
        if (this.f7423I0.compareAndSet(false, true)) {
            c cVar = this.f7426L0;
            if (cVar != null) {
                N1.a aVar = N1.a.f3605a;
                N1.a.a(cVar.d());
            }
            n nVar = this.f7422H0;
            if (nVar != null) {
                nVar.t();
            }
            Dialog L12 = L1();
            if (L12 == null) {
                return;
            }
            L12.dismiss();
        }
    }

    public void l2(C2162o ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        if (this.f7423I0.compareAndSet(false, true)) {
            c cVar = this.f7426L0;
            if (cVar != null) {
                N1.a aVar = N1.a.f3605a;
                N1.a.a(cVar.d());
            }
            n nVar = this.f7422H0;
            if (nVar != null) {
                nVar.u(ex);
            }
            Dialog L12 = L1();
            if (L12 == null) {
                return;
            }
            L12.dismiss();
        }
    }

    public final void m2(final String str, long j7, Long l7) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        final Date date = null;
        final Date date2 = j7 != 0 ? new Date(new Date().getTime() + (j7 * 1000)) : null;
        if ((l7 == null || l7.longValue() != 0) && l7 != null) {
            date = new Date(l7.longValue() * 1000);
        }
        x1.F x7 = x1.F.f20890n.x(new C2148a(str, C2146B.m(), "0", null, null, null, null, date2, null, date, null, 1024, null), "me", new F.b() { // from class: Y1.j
            @Override // x1.F.b
            public final void a(K k7) {
                m.n2(m.this, str, date2, date, k7);
            }
        });
        x7.F(L.GET);
        x7.G(bundle);
        x7.l();
    }

    public final void o2() {
        c cVar = this.f7426L0;
        if (cVar != null) {
            cVar.f(new Date().getTime());
        }
        this.f7424J0 = g2().l();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0782d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.f7427M0) {
            return;
        }
        k2();
    }

    public final void p2(final String str, final b bVar, final String str2, String str3, final Date date, final Date date2) {
        String string = I().getString(M1.d.f3497g);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
        String string2 = I().getString(M1.d.f3496f);
        Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
        String string3 = I().getString(M1.d.f3495e);
        Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
        kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
        String format = String.format(string2, Arrays.copyOf(new Object[]{str3}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        AlertDialog.Builder builder = new AlertDialog.Builder(t());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new DialogInterface.OnClickListener() { // from class: Y1.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                m.q2(m.this, str, bVar, str2, date, date2, dialogInterface, i7);
            }
        }).setPositiveButton(string3, new DialogInterface.OnClickListener() { // from class: Y1.l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                m.r2(m.this, dialogInterface, i7);
            }
        });
        builder.create().show();
    }

    @Override // androidx.fragment.app.Fragment
    public View q0(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        c cVar;
        u O12;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View q02 = super.q0(inflater, viewGroup, bundle);
        x xVar = (x) ((FacebookActivity) o1()).v();
        A a7 = null;
        if (xVar != null && (O12 = xVar.O1()) != null) {
            a7 = O12.j();
        }
        this.f7422H0 = (n) a7;
        if (bundle != null && (cVar = (c) bundle.getParcelable("request_state")) != null) {
            u2(cVar);
        }
        return q02;
    }

    public final void s2() {
        c cVar = this.f7426L0;
        Long valueOf = cVar == null ? null : Long.valueOf(cVar.b());
        if (valueOf != null) {
            this.f7425K0 = n.f7440s.a().schedule(new Runnable() { // from class: Y1.g
                @Override // java.lang.Runnable
                public final void run() {
                    m.t2(m.this);
                }
            }, valueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0782d, androidx.fragment.app.Fragment
    public void t0() {
        this.f7427M0 = true;
        this.f7423I0.set(true);
        super.t0();
        I i7 = this.f7424J0;
        if (i7 != null) {
            i7.cancel(true);
        }
        ScheduledFuture scheduledFuture = this.f7425K0;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
    }

    public final void u2(c cVar) {
        this.f7426L0 = cVar;
        TextView textView = this.f7420F0;
        if (textView == null) {
            Intrinsics.n("confirmationCode");
            throw null;
        }
        textView.setText(cVar.d());
        N1.a aVar = N1.a.f3605a;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(I(), N1.a.c(cVar.a()));
        TextView textView2 = this.f7421G0;
        if (textView2 == null) {
            Intrinsics.n("instructions");
            throw null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.f7420F0;
        if (textView3 == null) {
            Intrinsics.n("confirmationCode");
            throw null;
        }
        textView3.setVisibility(0);
        View view = this.f7419E0;
        if (view == null) {
            Intrinsics.n("progressBar");
            throw null;
        }
        view.setVisibility(8);
        if (!this.f7428N0 && N1.a.f(cVar.d())) {
            new C2237F(t()).f("fb_smart_login_service");
        }
        if (cVar.i()) {
            s2();
        } else {
            o2();
        }
    }

    public void v2(u.e request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f7429O0 = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.n()));
        P p7 = P.f3756a;
        P.q0(bundle, "redirect_uri", request.i());
        P.q0(bundle, "target_user_id", request.h());
        bundle.putString("access_token", e2());
        N1.a aVar = N1.a.f3605a;
        Map c22 = c2();
        bundle.putString("device_info", N1.a.d(c22 == null ? null : W5.F.o(c22)));
        x1.F.f20890n.B(null, f7416Q0, bundle, new F.b() { // from class: Y1.i
            @Override // x1.F.b
            public final void a(K k7) {
                m.w2(m.this, k7);
            }
        }).l();
    }
}
