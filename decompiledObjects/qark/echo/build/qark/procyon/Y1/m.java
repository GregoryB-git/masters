// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y1;

import android.os.BaseBundle;
import java.util.Locale;
import android.os.Parcel;
import org.jetbrains.annotations.NotNull;
import android.os.Parcelable$Creator;
import org.json.JSONArray;
import java.util.ArrayList;
import W5.C;
import O1.P;
import android.text.TextUtils;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import java.util.concurrent.TimeUnit;
import com.facebook.FacebookActivity;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import java.util.Arrays;
import kotlin.jvm.internal.x;
import x1.L;
import android.view.LayoutInflater;
import android.text.Html;
import android.view.View$OnClickListener;
import android.widget.Button;
import M1.b;
import android.view.ViewGroup;
import x1.F;
import M1.c;
import O1.Q;
import java.util.Collection;
import x1.h;
import java.util.List;
import java.util.Map;
import android.content.Context;
import M1.e;
import android.os.Parcelable;
import android.os.Bundle;
import android.app.Dialog;
import java.util.EnumSet;
import x1.B;
import O1.v;
import x1.r;
import org.json.JSONException;
import org.json.JSONObject;
import x1.o;
import N1.a;
import kotlin.jvm.internal.Intrinsics;
import x1.K;
import android.content.DialogInterface;
import java.util.Date;
import kotlin.jvm.internal.g;
import java.util.concurrent.ScheduledFuture;
import x1.I;
import java.util.concurrent.atomic.AtomicBoolean;
import android.widget.TextView;
import android.view.View;
import kotlin.Metadata;
import androidx.fragment.app.d;

@Metadata
public class m extends d
{
    public static final a P0;
    public static final String Q0;
    public static final String R0;
    public static final int S0;
    public View E0;
    public TextView F0;
    public TextView G0;
    public n H0;
    public final AtomicBoolean I0;
    public volatile I J0;
    public volatile ScheduledFuture K0;
    public volatile c L0;
    public boolean M0;
    public boolean N0;
    public Y1.u.e O0;
    
    static {
        P0 = new a(null);
        Q0 = "device/login";
        R0 = "device/login_status";
        S0 = 1349174;
    }
    
    public m() {
        this.I0 = new AtomicBoolean();
    }
    
    public static final void b2(final m m, final K k) {
        Intrinsics.checkNotNullParameter(m, "this$0");
        Intrinsics.checkNotNullParameter(k, "response");
        if (m.I0.get()) {
            return;
        }
        final r b = k.b();
        if (b != null) {
            final int g = b.g();
            if (g != m.S0) {
                if (g != 1349172) {
                    if (g == 1349152) {
                        final c l0 = m.L0;
                        if (l0 != null) {
                            final N1.a a = N1.a.a;
                            N1.a.a(l0.d());
                        }
                        final Y1.u.e o0 = m.O0;
                        if (o0 != null) {
                            m.v2(o0);
                            return;
                        }
                    }
                    else if (g != 1349173) {
                        final r b2 = k.b();
                        o e;
                        if (b2 == null) {
                            e = null;
                        }
                        else {
                            e = b2.e();
                        }
                        o o2 = e;
                        if (e == null) {
                            o2 = new o();
                        }
                        m.l2(o2);
                        return;
                    }
                    m.k2();
                    return;
                }
            }
            m.s2();
            return;
        }
        while (true) {
            try {
                JSONObject c;
                if ((c = k.c()) == null) {
                    c = new JSONObject();
                }
                final String string = c.getString("access_token");
                Intrinsics.checkNotNullExpressionValue(string, "resultObject.getString(\"access_token\")");
                m.m2(string, c.getLong("expires_in"), c.optLong("data_access_expiration_time"));
                return;
                final JSONException ex;
                m.l2(new o((Throwable)ex));
            }
            catch (JSONException ex) {
                continue;
            }
            break;
        }
    }
    
    public static final void i2(final m m, final View view) {
        Intrinsics.checkNotNullParameter(m, "this$0");
        m.k2();
    }
    
    public static final void n2(final m m, final String s, final Date date, final Date date2, final K k) {
        Intrinsics.checkNotNullParameter(m, "this$0");
        Intrinsics.checkNotNullParameter(s, "$accessToken");
        Intrinsics.checkNotNullParameter(k, "response");
        if (m.I0.get()) {
            return;
        }
        final r b = k.b();
        if (b != null) {
            o e;
            if ((e = b.e()) == null) {
                e = new o();
            }
            m.l2(e);
            return;
        }
        while (true) {
            try {
                JSONObject c;
                if ((c = k.c()) == null) {
                    c = new JSONObject();
                }
                final String string = c.getString("id");
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"id\")");
                final b a = m.P0.b(c);
                final String string2 = c.getString("name");
                Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(\"name\")");
                final c l0 = m.L0;
                if (l0 != null) {
                    final N1.a a2 = N1.a.a;
                    N1.a.a(l0.d());
                }
                final v a3 = v.a;
                final O1.r f = v.f(B.m());
                Object value = null;
                if (f != null) {
                    final EnumSet i = f.l();
                    if (i != null) {
                        value = i.contains(O1.I.t);
                    }
                }
                if (Intrinsics.a(value, Boolean.TRUE) && !m.N0) {
                    m.N0 = true;
                    m.p2(string, a, s, string2, date, date2);
                    return;
                }
                m.d2(string, a, s, date, date2);
                return;
                final JSONException ex;
                m.l2(new o((Throwable)ex));
            }
            catch (JSONException ex) {
                continue;
            }
            break;
        }
    }
    
    public static final void q2(final m m, final String s, final b b, final String s2, final Date date, final Date date2, final DialogInterface dialogInterface, final int n) {
        Intrinsics.checkNotNullParameter(m, "this$0");
        Intrinsics.checkNotNullParameter(s, "$userId");
        Intrinsics.checkNotNullParameter(b, "$permissions");
        Intrinsics.checkNotNullParameter(s2, "$accessToken");
        m.d2(s, b, s2, date, date2);
    }
    
    public static final void r2(final m m, final DialogInterface dialogInterface, final int n) {
        Intrinsics.checkNotNullParameter(m, "this$0");
        final View h2 = m.h2(false);
        final Dialog l1 = m.L1();
        if (l1 != null) {
            l1.setContentView(h2);
        }
        final Y1.u.e o0 = m.O0;
        if (o0 == null) {
            return;
        }
        m.v2(o0);
    }
    
    public static final void t2(final m m) {
        Intrinsics.checkNotNullParameter(m, "this$0");
        m.o2();
    }
    
    public static final void w2(final m m, final K k) {
        Intrinsics.checkNotNullParameter(m, "this$0");
        Intrinsics.checkNotNullParameter(k, "response");
        if (m.M0) {
            return;
        }
        if (k.b() != null) {
            final r b = k.b();
            o e;
            if (b == null) {
                e = null;
            }
            else {
                e = b.e();
            }
            o o = e;
            if (e == null) {
                o = new o();
            }
            m.l2(o);
            return;
        }
        JSONObject c;
        if ((c = k.c()) == null) {
            c = new JSONObject();
        }
        final c c2 = new c();
        try {
            c2.h(c.getString("user_code"));
            c2.g(c.getString("code"));
            c2.e(c.getLong("interval"));
            m.u2(c2);
        }
        catch (JSONException ex) {
            m.l2(new o((Throwable)ex));
        }
    }
    
    @Override
    public void I0(final Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "outState");
        super.I0(bundle);
        if (this.L0 != null) {
            bundle.putParcelable("request_state", (Parcelable)this.L0);
        }
    }
    
    @Override
    public Dialog N1(final Bundle bundle) {
        final Dialog dialog = new Dialog(this.o1(), e.b) {
            public final /* synthetic */ m o;
            
            public void onBackPressed() {
                if (this.o.j2()) {
                    super.onBackPressed();
                }
            }
        };
        dialog.setContentView(this.h2(N1.a.e() && !this.N0));
        return dialog;
    }
    
    public Map c2() {
        return null;
    }
    
    public final void d2(final String s, final b b, final String s2, final Date date, final Date date2) {
        final n h0 = this.H0;
        if (h0 != null) {
            h0.v(s2, x1.B.m(), s, b.c(), b.a(), b.b(), x1.h.x, date, null, date2);
        }
        final Dialog l1 = this.L1();
        if (l1 == null) {
            return;
        }
        l1.dismiss();
    }
    
    public String e2() {
        final StringBuilder sb = new StringBuilder();
        sb.append(O1.Q.b());
        sb.append('|');
        sb.append(O1.Q.c());
        return sb.toString();
    }
    
    public int f2(final boolean b) {
        if (b) {
            return M1.c.d;
        }
        return M1.c.b;
    }
    
    public final F g2() {
        final Bundle bundle = new Bundle();
        final c l0 = this.L0;
        String c;
        if (l0 == null) {
            c = null;
        }
        else {
            c = l0.c();
        }
        ((BaseBundle)bundle).putString("code", c);
        ((BaseBundle)bundle).putString("access_token", this.e2());
        return x1.F.n.B(null, m.R0, bundle, new Y1.h(this));
    }
    
    public View h2(final boolean b) {
        final LayoutInflater layoutInflater = this.o1().getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "requireActivity().layoutInflater");
        final View inflate = layoutInflater.inflate(this.f2(b), (ViewGroup)null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        final View viewById = inflate.findViewById(b.f);
        Intrinsics.checkNotNullExpressionValue(viewById, "view.findViewById(R.id.progress_bar)");
        this.E0 = viewById;
        final View viewById2 = inflate.findViewById(b.e);
        if (viewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.F0 = (TextView)viewById2;
        final View viewById3 = inflate.findViewById(b.a);
        if (viewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        ((View)viewById3).setOnClickListener((View$OnClickListener)new f(this));
        final View viewById4 = inflate.findViewById(b.b);
        if (viewById4 != null) {
            (this.G0 = (TextView)viewById4).setText((CharSequence)Html.fromHtml(this.P(M1.d.a)));
            return inflate;
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
        final c l0 = this.L0;
        if (l0 != null) {
            final N1.a a = N1.a.a;
            N1.a.a(l0.d());
        }
        final n h0 = this.H0;
        if (h0 != null) {
            h0.t();
        }
        final Dialog l2 = this.L1();
        if (l2 == null) {
            return;
        }
        l2.dismiss();
    }
    
    public void l2(final o o) {
        Intrinsics.checkNotNullParameter(o, "ex");
        if (!this.I0.compareAndSet(false, true)) {
            return;
        }
        final c l0 = this.L0;
        if (l0 != null) {
            final N1.a a = N1.a.a;
            N1.a.a(l0.d());
        }
        final n h0 = this.H0;
        if (h0 != null) {
            h0.u(o);
        }
        final Dialog l2 = this.L1();
        if (l2 == null) {
            return;
        }
        l2.dismiss();
    }
    
    public final void m2(final String s, final long n, final Long n2) {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("fields", "id,permissions,name");
        final Date date = null;
        Date date2;
        if (n != 0L) {
            date2 = new Date(new Date().getTime() + n * 1000L);
        }
        else {
            date2 = null;
        }
        Date date3 = null;
        Label_0109: {
            if (n2 != null) {
                date3 = date;
                if (n2 == 0L) {
                    break Label_0109;
                }
            }
            date3 = date;
            if (n2 != null) {
                date3 = new Date(n2 * 1000L);
            }
        }
        final F x = x1.F.n.x(new x1.a(s, x1.B.m(), "0", null, null, null, null, date2, null, date3, null, 1024, null), "me", new Y1.j(this, s, date2, date3));
        x.F(x1.L.o);
        x.G(bundle);
        x.l();
    }
    
    public final void o2() {
        final c l0 = this.L0;
        if (l0 != null) {
            l0.f(new Date().getTime());
        }
        this.J0 = this.g2().l();
    }
    
    @Override
    public void onDismiss(final DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        if (!this.M0) {
            this.k2();
        }
    }
    
    public final void p2(final String s, final b b, final String s2, String format, final Date date, final Date date2) {
        final String string = this.I().getString(M1.d.g);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
        final String string2 = this.I().getString(M1.d.f);
        Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
        final String string3 = this.I().getString(M1.d.e);
        Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
        final x a = kotlin.jvm.internal.x.a;
        format = String.format(string2, Arrays.copyOf(new Object[] { format }, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.t());
        alertDialog$Builder.setMessage((CharSequence)string).setCancelable(true).setNegativeButton((CharSequence)format, (DialogInterface$OnClickListener)new Y1.k(this, s, b, s2, date, date2)).setPositiveButton((CharSequence)string3, (DialogInterface$OnClickListener)new l(this));
        ((Dialog)alertDialog$Builder.create()).show();
    }
    
    @Override
    public View q0(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        final View q0 = super.q0(layoutInflater, viewGroup, bundle);
        final Y1.x x = (Y1.x)((FacebookActivity)this.o1()).v();
        A j = null;
        if (x != null) {
            final Y1.u o1 = x.O1();
            if (o1 != null) {
                j = o1.j();
            }
        }
        this.H0 = (n)j;
        if (bundle == null) {
            return q0;
        }
        final c c = (c)bundle.getParcelable("request_state");
        if (c == null) {
            return q0;
        }
        this.u2(c);
        return q0;
    }
    
    public final void s2() {
        final c l0 = this.L0;
        Long value;
        if (l0 == null) {
            value = null;
        }
        else {
            value = l0.b();
        }
        if (value != null) {
            this.K0 = n.s.a().schedule(new Y1.g(this), value, TimeUnit.SECONDS);
        }
    }
    
    @Override
    public void t0() {
        this.M0 = true;
        this.I0.set(true);
        super.t0();
        final I j0 = this.J0;
        if (j0 != null) {
            j0.cancel(true);
        }
        final ScheduledFuture k0 = this.K0;
        if (k0 == null) {
            return;
        }
        k0.cancel(true);
    }
    
    public final void u2(final c l0) {
        this.L0 = l0;
        final TextView f0 = this.F0;
        if (f0 == null) {
            Intrinsics.n("confirmationCode");
            throw null;
        }
        f0.setText((CharSequence)l0.d());
        final N1.a a = N1.a.a;
        final BitmapDrawable bitmapDrawable = new BitmapDrawable(this.I(), N1.a.c(l0.a()));
        final TextView g0 = this.G0;
        if (g0 == null) {
            Intrinsics.n("instructions");
            throw null;
        }
        g0.setCompoundDrawablesWithIntrinsicBounds((Drawable)null, (Drawable)bitmapDrawable, (Drawable)null, (Drawable)null);
        final TextView f2 = this.F0;
        if (f2 == null) {
            Intrinsics.n("confirmationCode");
            throw null;
        }
        ((View)f2).setVisibility(0);
        final View e0 = this.E0;
        if (e0 == null) {
            Intrinsics.n("progressBar");
            throw null;
        }
        e0.setVisibility(8);
        if (!this.N0 && N1.a.f(l0.d())) {
            new y1.F(this.t()).f("fb_smart_login_service");
        }
        if (l0.i()) {
            this.s2();
            return;
        }
        this.o2();
    }
    
    public void v2(final Y1.u.e o0) {
        Intrinsics.checkNotNullParameter(o0, "request");
        this.O0 = o0;
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("scope", TextUtils.join((CharSequence)",", (Iterable)o0.n()));
        final P a = O1.P.a;
        O1.P.q0(bundle, "redirect_uri", o0.i());
        O1.P.q0(bundle, "target_user_id", o0.h());
        ((BaseBundle)bundle).putString("access_token", this.e2());
        final N1.a a2 = N1.a.a;
        final Map c2 = this.c2();
        Map o2;
        if (c2 == null) {
            o2 = null;
        }
        else {
            o2 = W5.C.o(c2);
        }
        ((BaseBundle)bundle).putString("device_info", N1.a.d(o2));
        x1.F.n.B(null, m.Q0, bundle, new Y1.i(this)).l();
    }
    
    public static final class a
    {
        public final m.b b(final JSONObject jsonObject) {
            final JSONArray jsonArray = jsonObject.getJSONObject("permissions").getJSONArray("data");
            final ArrayList<String> list = new ArrayList<String>();
            final ArrayList<String> list2 = new ArrayList<String>();
            final ArrayList<String> list3 = new ArrayList<String>();
            final int length = jsonArray.length();
            if (length > 0) {
                int n = 0;
                while (true) {
                    final int n2 = n + 1;
                    final JSONObject optJSONObject = jsonArray.optJSONObject(n);
                    final String optString = optJSONObject.optString("permission");
                    Intrinsics.checkNotNullExpressionValue(optString, "permission");
                    if (optString.length() != 0) {
                        if (!Intrinsics.a(optString, "installed")) {
                            final String optString2 = optJSONObject.optString("status");
                            if (optString2 != null) {
                                final int hashCode = optString2.hashCode();
                                if (hashCode != -1309235419) {
                                    if (hashCode != 280295099) {
                                        if (hashCode == 568196142) {
                                            if (optString2.equals("declined")) {
                                                list2.add(optString);
                                            }
                                        }
                                    }
                                    else if (optString2.equals("granted")) {
                                        list.add(optString);
                                    }
                                }
                                else if (optString2.equals("expired")) {
                                    list3.add(optString);
                                }
                            }
                        }
                    }
                    if (n2 >= length) {
                        break;
                    }
                    n = n2;
                }
            }
            return new m.b(list, list2, list3);
        }
    }
    
    public static final class b
    {
        public List a;
        public List b;
        public List c;
        
        public b(final List a, final List b, final List c) {
            Intrinsics.checkNotNullParameter(a, "grantedPermissions");
            Intrinsics.checkNotNullParameter(b, "declinedPermissions");
            Intrinsics.checkNotNullParameter(c, "expiredPermissions");
            this.a = a;
            this.b = b;
            this.c = c;
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
    
    public static final class c implements Parcelable
    {
        @NotNull
        public static final Parcelable$Creator<c> CREATOR;
        public static final b t;
        public String o;
        public String p;
        public String q;
        public long r;
        public long s;
        
        static {
            t = new b(null);
            CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
                public c a(final Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new c(parcel);
                }
                
                public c[] b(final int n) {
                    return new c[n];
                }
            };
        }
        
        public c() {
        }
        
        public c(final Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
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
        
        public final void e(final long r) {
            this.r = r;
        }
        
        public final void f(final long s) {
            this.s = s;
        }
        
        public final void g(final String q) {
            this.q = q;
        }
        
        public final void h(String format) {
            this.p = format;
            final x a = kotlin.jvm.internal.x.a;
            format = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[] { format }, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            this.o = format;
        }
        
        public final boolean i() {
            final long s = this.s;
            boolean b = false;
            if (s == 0L) {
                return false;
            }
            if (new Date().getTime() - this.s - this.r * 1000L < 0L) {
                b = true;
            }
            return b;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.o);
            parcel.writeString(this.p);
            parcel.writeString(this.q);
            parcel.writeLong(this.r);
            parcel.writeLong(this.s);
        }
        
        public static final class b
        {
        }
    }
}
