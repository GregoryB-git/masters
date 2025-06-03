/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.Html
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.TextView
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Date
 *  java.util.EnumSet
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.ScheduledThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.atomic.AtomicBoolean
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package Y1;

import O1.I;
import O1.P;
import O1.Q;
import O1.v;
import W5.C;
import Y1.A;
import Y1.f;
import Y1.g;
import Y1.h;
import Y1.i;
import Y1.j;
import Y1.k;
import Y1.l;
import Y1.n;
import Y1.u;
import Y1.x;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import com.facebook.FacebookActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.F;
import x1.K;
import x1.L;
import x1.o;
import x1.r;

@Metadata
public class m
extends d {
    public static final a P0 = new a(null);
    public static final String Q0 = "device/login";
    public static final String R0 = "device/login_status";
    public static final int S0 = 1349174;
    public View E0;
    public TextView F0;
    public TextView G0;
    public n H0;
    public final AtomicBoolean I0 = new AtomicBoolean();
    public volatile x1.I J0;
    public volatile ScheduledFuture K0;
    public volatile c L0;
    public boolean M0;
    public boolean N0;
    public u.e O0;

    public static /* synthetic */ void U1(m m8) {
        m.t2(m8);
    }

    public static /* synthetic */ void V1(m m8, String string2, b b8, String string3, Date date, Date date2, DialogInterface dialogInterface, int n8) {
        m.q2(m8, string2, b8, string3, date, date2, dialogInterface, n8);
    }

    public static /* synthetic */ void W1(m m8, DialogInterface dialogInterface, int n8) {
        m.r2(m8, dialogInterface, n8);
    }

    public static /* synthetic */ void X1(m m8, View view) {
        m.i2(m8, view);
    }

    public static /* synthetic */ void Y1(m m8, K k8) {
        m.w2(m8, k8);
    }

    public static /* synthetic */ void Z1(m m8, String string2, Date date, Date date2, K k8) {
        m.n2(m8, string2, date, date2, k8);
    }

    public static /* synthetic */ void a2(m m8, K k8) {
        m.b2(m8, k8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void b2(m m8, K object) {
        Object object2;
        block12 : {
            block15 : {
                block14 : {
                    int n8;
                    block13 : {
                        Intrinsics.checkNotNullParameter(m8, "this$0");
                        Intrinsics.checkNotNullParameter(object, "response");
                        if (m8.I0.get()) {
                            return;
                        }
                        object2 = object.b();
                        if (object2 == null) break block12;
                        n8 = object2.g();
                        if (n8 == S0 || n8 == 1349172) {
                            m8.s2();
                            return;
                        }
                        if (n8 != 1349152) break block13;
                        object = m8.L0;
                        if (object != null) {
                            object2 = N1.a.a;
                            N1.a.a(object.d());
                        }
                        object = m8.O0;
                        if (object != null) {
                            m8.v2((u.e)object);
                            return;
                        }
                        break block14;
                    }
                    if (n8 != 1349173) break block15;
                }
                m8.k2();
                return;
            }
            object = (object = object.b()) == null ? null : object.e();
            object2 = object;
            if (object == null) {
                object2 = new o();
            }
            m8.l2((o)((Object)object2));
            return;
        }
        try {
            object = object2 = object.c();
            if (object2 == null) {
                object = new JSONObject();
            }
            object2 = object.getString("access_token");
            Intrinsics.checkNotNullExpressionValue(object2, "resultObject.getString(\"access_token\")");
            m8.m2((String)object2, object.getLong("expires_in"), object.optLong("data_access_expiration_time"));
            return;
        }
        catch (JSONException jSONException) {}
        m8.l2(new o((Throwable)jSONException));
    }

    public static final void i2(m m8, View view) {
        Intrinsics.checkNotNullParameter(m8, "this$0");
        m8.k2();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void n2(m m8, String object, Date object2, Date date, K object3) {
        Object object4;
        b b8;
        JSONException jSONException2;
        String string2;
        Object object5;
        block8 : {
            Intrinsics.checkNotNullParameter(m8, "this$0");
            Intrinsics.checkNotNullParameter(object, "$accessToken");
            Intrinsics.checkNotNullParameter(object3, "response");
            if (m8.I0.get()) {
                return;
            }
            object5 = object3.b();
            if (object5 != null) {
                object = object2 = object5.e();
                if (object2 == null) {
                    object = new o();
                }
                m8.l2((o)((Object)object));
                return;
            }
            try {
                object3 = object5 = object3.c();
                if (object5 == null) {
                    object3 = new JSONObject();
                }
                object5 = object3.getString("id");
                Intrinsics.checkNotNullExpressionValue(object5, "jsonObject.getString(\"id\")");
                b8 = P0.b((JSONObject)object3);
                string2 = object3.getString("name");
                Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(\"name\")");
                object3 = m8.L0;
                if (object3 == null) break block8;
                object4 = N1.a.a;
            }
            catch (JSONException jSONException2) {}
            N1.a.a(object3.d());
        }
        object3 = v.a;
        object4 = v.f(B.m());
        object3 = null;
        if (object4 != null && (object4 = object4.l()) != null) {
            object3 = object4.contains((Object)I.t);
        }
        if (Intrinsics.a(object3, (Object)Boolean.TRUE) && !m8.N0) {
            m8.N0 = true;
            m8.p2((String)object5, b8, (String)object, string2, (Date)object2, date);
            return;
        }
        m8.d2((String)object5, b8, (String)object, (Date)object2, date);
        return;
        m8.l2(new o((Throwable)jSONException2));
    }

    public static final void q2(m m8, String string2, b b8, String string3, Date date, Date date2, DialogInterface dialogInterface, int n8) {
        Intrinsics.checkNotNullParameter(m8, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$userId");
        Intrinsics.checkNotNullParameter(b8, "$permissions");
        Intrinsics.checkNotNullParameter(string3, "$accessToken");
        m8.d2(string2, b8, string3, date, date2);
    }

    public static final void r2(m m8, DialogInterface object, int n8) {
        Intrinsics.checkNotNullParameter(m8, "this$0");
        object = m8.h2(false);
        Dialog dialog = m8.L1();
        if (dialog != null) {
            dialog.setContentView((View)object);
        }
        object = m8.O0;
        if (object == null) {
            return;
        }
        m8.v2((u.e)object);
    }

    public static final void t2(m m8) {
        Intrinsics.checkNotNullParameter(m8, "this$0");
        m8.o2();
    }

    public static final void w2(m m8, K object) {
        Object object2;
        Intrinsics.checkNotNullParameter(m8, "this$0");
        Intrinsics.checkNotNullParameter(object, "response");
        if (m8.M0) {
            return;
        }
        if (object.b() != null) {
            object = (object = object.b()) == null ? null : object.e();
            Object object3 = object;
            if (object == null) {
                object3 = new o();
            }
            m8.l2((o)((Object)object3));
            return;
        }
        object = object2 = object.c();
        if (object2 == null) {
            object = new JSONObject();
        }
        object2 = new c();
        try {
            object2.h(object.getString("user_code"));
            object2.g(object.getString("code"));
            object2.e(object.getLong("interval"));
        }
        catch (JSONException jSONException) {
            m8.l2(new o((Throwable)jSONException));
            return;
        }
        m8.u2((c)object2);
    }

    @Override
    public void I0(Bundle bundle) {
        Intrinsics.checkNotNullParameter((Object)bundle, "outState");
        super.I0(bundle);
        if (this.L0 != null) {
            bundle.putParcelable("request_state", (Parcelable)this.L0);
        }
    }

    @Override
    public Dialog N1(Bundle object) {
        object = new Dialog(this.o1(), M1.e.b){

            public void onBackPressed() {
                if (this.j2()) {
                    super.onBackPressed();
                }
            }
        };
        boolean bl = N1.a.e() && !this.N0;
        object.setContentView(this.h2(bl));
        return object;
    }

    public Map c2() {
        return null;
    }

    public final void d2(String string2, b b8, String string3, Date date, Date date2) {
        n n8 = this.H0;
        if (n8 != null) {
            n8.v(string3, B.m(), string2, (Collection)b8.c(), (Collection)b8.a(), (Collection)b8.b(), x1.h.x, date, null, date2);
        }
        string2 = this.L1();
        if (string2 == null) {
            return;
        }
        string2.dismiss();
    }

    public String e2() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Q.b());
        stringBuilder.append('|');
        stringBuilder.append(Q.c());
        return stringBuilder.toString();
    }

    public int f2(boolean bl) {
        if (bl) {
            return M1.c.d;
        }
        return M1.c.b;
    }

    public final F g2() {
        Bundle bundle = new Bundle();
        Object object = this.L0;
        object = object == null ? null : object.c();
        bundle.putString("code", (String)object);
        bundle.putString("access_token", this.e2());
        return F.n.B(null, R0, bundle, new h(this));
    }

    public View h2(boolean bl) {
        LayoutInflater layoutInflater = this.o1().getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue((Object)layoutInflater, "requireActivity().layoutInflater");
        layoutInflater = layoutInflater.inflate(this.f2(bl), null);
        Intrinsics.checkNotNullExpressionValue((Object)layoutInflater, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        View view = layoutInflater.findViewById(M1.b.f);
        Intrinsics.checkNotNullExpressionValue((Object)view, "view.findViewById(R.id.progress_bar)");
        this.E0 = view;
        view = layoutInflater.findViewById(M1.b.e);
        if (view != null) {
            this.F0 = (TextView)view;
            view = layoutInflater.findViewById(M1.b.a);
            if (view != null) {
                ((Button)view).setOnClickListener((View.OnClickListener)new f(this));
                view = layoutInflater.findViewById(M1.b.b);
                if (view != null) {
                    view = (TextView)view;
                    this.G0 = view;
                    view.setText((CharSequence)Html.fromHtml((String)this.P(M1.d.a)));
                    return layoutInflater;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public boolean j2() {
        return true;
    }

    public void k2() {
        if (!this.I0.compareAndSet(false, true)) {
            return;
        }
        Object object = this.L0;
        if (object != null) {
            N1.a a8 = N1.a.a;
            N1.a.a(object.d());
        }
        object = this.H0;
        if (object != null) {
            object.t();
        }
        object = this.L1();
        if (object == null) {
            return;
        }
        object.dismiss();
    }

    public void l2(o o8) {
        Intrinsics.checkNotNullParameter((Object)o8, "ex");
        if (!this.I0.compareAndSet(false, true)) {
            return;
        }
        Object object = this.L0;
        if (object != null) {
            N1.a a8 = N1.a.a;
            N1.a.a(object.d());
        }
        object = this.H0;
        if (object != null) {
            object.u((Exception)o8);
        }
        o8 = this.L1();
        if (o8 == null) {
            return;
        }
        o8.dismiss();
    }

    public final void m2(String object, long l8, Long object2) {
        Date date;
        Date date2;
        Bundle bundle;
        block5 : {
            Date date3;
            block4 : {
                bundle = new Bundle();
                bundle.putString("fields", "id,permissions,name");
                date3 = null;
                date2 = l8 != 0L ? new Date(new Date().getTime() + l8 * 1000L) : null;
                if (object2 == null) break block4;
                date = date3;
                if (object2.longValue() == 0L) break block5;
            }
            date = date3;
            if (object2 != null) {
                date = new Date(object2.longValue() * 1000L);
            }
        }
        object2 = new x1.a((String)object, B.m(), "0", null, null, null, null, date2, null, date, null, 1024, null);
        object = F.n.x((x1.a)object2, "me", new j(this, (String)object, date2, date));
        object.F(L.o);
        object.G(bundle);
        object.l();
    }

    public final void o2() {
        c c8 = this.L0;
        if (c8 != null) {
            c8.f(new Date().getTime());
        }
        this.J0 = this.g2().l();
    }

    @Override
    public void onDismiss(DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter((Object)dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        if (!this.M0) {
            this.k2();
        }
    }

    public final void p2(String string2, b b8, String string3, String string4, Date date, Date date2) {
        String string5 = this.I().getString(M1.d.g);
        Intrinsics.checkNotNullExpressionValue(string5, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
        String string6 = this.I().getString(M1.d.f);
        Intrinsics.checkNotNullExpressionValue(string6, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
        String string7 = this.I().getString(M1.d.e);
        Intrinsics.checkNotNullExpressionValue(string7, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
        kotlin.jvm.internal.x x8 = kotlin.jvm.internal.x.a;
        string4 = String.format((String)string6, (Object[])Arrays.copyOf((Object[])new Object[]{string4}, (int)1));
        Intrinsics.checkNotNullExpressionValue(string4, "java.lang.String.format(format, *args)");
        string6 = new AlertDialog.Builder(this.t());
        string6.setMessage((CharSequence)string5).setCancelable(true).setNegativeButton((CharSequence)string4, (DialogInterface.OnClickListener)new k(this, string2, b8, string3, date, date2)).setPositiveButton((CharSequence)string7, (DialogInterface.OnClickListener)new l(this));
        string6.create().show();
    }

    @Override
    public View q0(LayoutInflater object, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(object, "inflater");
        viewGroup = Fragment.super.q0((LayoutInflater)object, viewGroup, bundle);
        Object object2 = (x)((FacebookActivity)this.o1()).v();
        object = null;
        if (object2 != null && (object2 = object2.O1()) != null) {
            object = object2.j();
        }
        this.H0 = (n)object;
        if (bundle == null) {
            return viewGroup;
        }
        object = (c)bundle.getParcelable("request_state");
        if (object == null) {
            return viewGroup;
        }
        this.u2((c)object);
        return viewGroup;
    }

    public final void s2() {
        c c8 = this.L0;
        c8 = c8 == null ? null : Long.valueOf((long)c8.b());
        if (c8 != null) {
            this.K0 = n.s.a().schedule((Runnable)new g(this), c8.longValue(), TimeUnit.SECONDS);
        }
    }

    @Override
    public void t0() {
        this.M0 = true;
        this.I0.set(true);
        super.t0();
        x1.I i8 = this.J0;
        if (i8 != null) {
            i8.cancel(true);
        }
        i8 = this.K0;
        if (i8 == null) {
            return;
        }
        i8.cancel(true);
    }

    public final void u2(c c8) {
        this.L0 = c8;
        Object object = this.F0;
        if (object != null) {
            object.setText((CharSequence)c8.d());
            object = N1.a.a;
            object = N1.a.c(c8.a());
            object = new BitmapDrawable(this.I(), (Bitmap)object);
            TextView textView = this.G0;
            if (textView != null) {
                textView.setCompoundDrawablesWithIntrinsicBounds(null, (Drawable)object, null, null);
                object = this.F0;
                if (object != null) {
                    object.setVisibility(0);
                    object = this.E0;
                    if (object != null) {
                        object.setVisibility(8);
                        if (!this.N0 && N1.a.f(c8.d())) {
                            new y1.F(this.t()).f("fb_smart_login_service");
                        }
                        if (c8.i()) {
                            this.s2();
                            return;
                        }
                        this.o2();
                        return;
                    }
                    Intrinsics.n("progressBar");
                    throw null;
                }
                Intrinsics.n("confirmationCode");
                throw null;
            }
            Intrinsics.n("instructions");
            throw null;
        }
        Intrinsics.n("confirmationCode");
        throw null;
    }

    public void v2(u.e object) {
        Intrinsics.checkNotNullParameter(object, "request");
        this.O0 = object;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join((CharSequence)",", (Iterable)object.n()));
        P p8 = P.a;
        P.q0(bundle, "redirect_uri", object.i());
        P.q0(bundle, "target_user_id", object.h());
        bundle.putString("access_token", this.e2());
        object = N1.a.a;
        object = this.c2();
        object = object == null ? null : C.o((Map)object);
        bundle.putString("device_info", N1.a.d((Map)object));
        F.n.B(null, Q0, bundle, new i(this)).l();
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g g8) {
            this();
        }

        public final b b(JSONObject jSONObject) {
            jSONObject = jSONObject.getJSONObject("permissions").getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int n8 = jSONObject.length();
            if (n8 > 0) {
                int n9 = 0;
                do {
                    int n10 = n9 + 1;
                    Object object = jSONObject.optJSONObject(n9);
                    String string2 = object.optString("permission");
                    Intrinsics.checkNotNullExpressionValue(string2, "permission");
                    if (string2.length() != 0 && !Intrinsics.a(string2, "installed") && (object = object.optString("status")) != null) {
                        n9 = object.hashCode();
                        if (n9 != -1309235419) {
                            if (n9 != 280295099) {
                                if (n9 == 568196142 && object.equals((Object)"declined")) {
                                    arrayList2.add((Object)string2);
                                }
                            } else if (object.equals((Object)"granted")) {
                                arrayList.add((Object)string2);
                            }
                        } else if (object.equals((Object)"expired")) {
                            arrayList3.add((Object)string2);
                        }
                    }
                    if (n10 >= n8) break;
                    n9 = n10;
                } while (true);
            }
            return new b((List)arrayList, (List)arrayList2, (List)arrayList3);
        }
    }

    public static final class b {
        public List a;
        public List b;
        public List c;

        public b(List list, List list2, List list3) {
            Intrinsics.checkNotNullParameter((Object)list, "grantedPermissions");
            Intrinsics.checkNotNullParameter((Object)list2, "declinedPermissions");
            Intrinsics.checkNotNullParameter((Object)list3, "expiredPermissions");
            this.a = list;
            this.b = list2;
            this.c = list3;
        }

        public final List a() {
            return this.b;
        }

        public final List b() {
            return this.c;
        }

        public final List c() {
            return this.a;
        }
    }

    public static final class c
    implements Parcelable {
        @NotNull
        public static final Parcelable.Creator<c> CREATOR;
        public static final b t;
        public String o;
        public String p;
        public String q;
        public long r;
        public long s;

        static {
            t = new b(null);
            CREATOR = new Parcelable.Creator(){

                public c a(Parcel parcel) {
                    Intrinsics.checkNotNullParameter((Object)parcel, "parcel");
                    return new c(parcel);
                }

                public c[] b(int n8) {
                    return new c[n8];
                }
            };
        }

        public c() {
        }

        public c(Parcel parcel) {
            Intrinsics.checkNotNullParameter((Object)parcel, "parcel");
            this.o = parcel.readString();
            this.p = parcel.readString();
            this.q = parcel.readString();
            this.r = parcel.readLong();
            this.s = parcel.readLong();
        }

        public final String a() {
            return this.o;
        }

        public final long b() {
            return this.r;
        }

        public final String c() {
            return this.q;
        }

        public final String d() {
            return this.p;
        }

        public int describeContents() {
            return 0;
        }

        public final void e(long l8) {
            this.r = l8;
        }

        public final void f(long l8) {
            this.s = l8;
        }

        public final void g(String string2) {
            this.q = string2;
        }

        public final void h(String string2) {
            this.p = string2;
            kotlin.jvm.internal.x x8 = kotlin.jvm.internal.x.a;
            string2 = String.format((Locale)Locale.ENGLISH, (String)"https://facebook.com/device?user_code=%1$s&qr=1", (Object[])Arrays.copyOf((Object[])new Object[]{string2}, (int)1));
            Intrinsics.checkNotNullExpressionValue(string2, "java.lang.String.format(locale, format, *args)");
            this.o = string2;
        }

        public final boolean i() {
            long l8 = this.s;
            boolean bl = false;
            if (l8 == 0L) {
                return false;
            }
            if (new Date().getTime() - this.s - this.r * 1000L < 0L) {
                bl = true;
            }
            return bl;
        }

        public void writeToParcel(Parcel parcel, int n8) {
            Intrinsics.checkNotNullParameter((Object)parcel, "dest");
            parcel.writeString(this.o);
            parcel.writeString(this.p);
            parcel.writeString(this.q);
            parcel.writeLong(this.r);
            parcel.writeLong(this.s);
        }

        public static final class b {
            public b() {
            }

            public /* synthetic */ b(kotlin.jvm.internal.g g8) {
                this();
            }
        }

    }

}

