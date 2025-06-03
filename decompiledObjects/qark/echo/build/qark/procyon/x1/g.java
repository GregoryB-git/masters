// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import android.os.BaseBundle;
import android.os.Bundle;
import android.content.Context;
import android.app.PendingIntent;
import android.app.AlarmManager;
import android.os.Parcelable;
import android.content.Intent;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import java.util.HashSet;
import android.os.Handler;
import android.os.Looper;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;
import android.util.Log;
import java.util.Locale;
import O1.P;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import Z.a;

public final class g
{
    public static final a f;
    public static g g;
    public final Z.a a;
    public final x1.b b;
    public x1.a c;
    public final AtomicBoolean d;
    public Date e;
    
    static {
        f = new a(null);
    }
    
    public g(final Z.a a, final x1.b b) {
        Intrinsics.checkNotNullParameter(a, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(b, "accessTokenCache");
        this.a = a;
        this.b = b;
        this.d = new AtomicBoolean(false);
        this.e = new Date(0L);
    }
    
    public static final /* synthetic */ g e() {
        return x1.g.g;
    }
    
    public static final /* synthetic */ void f(final g g) {
        g.g = g;
    }
    
    public static final void l(final g g, final x1.a.a a) {
        Intrinsics.checkNotNullParameter(g, "this$0");
        g.m(a);
    }
    
    public static final void n(final AtomicBoolean atomicBoolean, final Set set, final Set set2, final Set set3, final K k) {
        Intrinsics.checkNotNullParameter(atomicBoolean, "$permissionsCallSucceeded");
        Intrinsics.checkNotNullParameter(set, "$permissions");
        Intrinsics.checkNotNullParameter(set2, "$declinedPermissions");
        Intrinsics.checkNotNullParameter(set3, "$expiredPermissions");
        Intrinsics.checkNotNullParameter(k, "response");
        final JSONObject d = k.d();
        if (d == null) {
            return;
        }
        final JSONArray optJSONArray = d.optJSONArray("data");
        if (optJSONArray == null) {
            return;
        }
        atomicBoolean.set(true);
        final int length = optJSONArray.length();
        if (length > 0) {
            int n = 0;
            while (true) {
                final int n2 = n + 1;
                final JSONObject optJSONObject = optJSONArray.optJSONObject(n);
                Label_0289: {
                    if (optJSONObject != null) {
                        final String optString = optJSONObject.optString("permission");
                        final String optString2 = optJSONObject.optString("status");
                        if (!P.c0(optString) && !P.c0(optString2)) {
                            Intrinsics.checkNotNullExpressionValue(optString2, "status");
                            final Locale us = Locale.US;
                            Intrinsics.checkNotNullExpressionValue(us, "US");
                            final String lowerCase = optString2.toLowerCase(us);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "status");
                            final int hashCode = lowerCase.hashCode();
                            if (hashCode != -1309235419) {
                                if (hashCode != 280295099) {
                                    if (hashCode == 568196142) {
                                        if (lowerCase.equals("declined")) {
                                            set2.add(optString);
                                            break Label_0289;
                                        }
                                    }
                                }
                                else if (lowerCase.equals("granted")) {
                                    set.add(optString);
                                    break Label_0289;
                                }
                            }
                            else if (lowerCase.equals("expired")) {
                                set3.add(optString);
                                break Label_0289;
                            }
                            Log.w("AccessTokenManager", Intrinsics.i("Unexpected status: ", lowerCase));
                        }
                    }
                }
                if (n2 >= length) {
                    break;
                }
                n = n2;
            }
        }
    }
    
    public static final void o(final d d, final K k) {
        Intrinsics.checkNotNullParameter(d, "$refreshResult");
        Intrinsics.checkNotNullParameter(k, "response");
        final JSONObject d2 = k.d();
        if (d2 == null) {
            return;
        }
        d.f(d2.optString("access_token"));
        d.h(d2.optInt("expires_at"));
        d.i(d2.optInt("expires_in"));
        d.g(d2.optLong("data_access_expiration_time"));
        d.j(d2.optString("graph_domain", (String)null));
    }
    
    public static final void p(final d d, x1.a a, final x1.a.a a2, final AtomicBoolean atomicBoolean, Set j, Set e, final Set set, final g g, final J i) {
        Intrinsics.checkNotNullParameter(d, "$refreshResult");
        Intrinsics.checkNotNullParameter(atomicBoolean, "$permissionsCallSucceeded");
        Intrinsics.checkNotNullParameter(j, "$permissions");
        Intrinsics.checkNotNullParameter(e, "$declinedPermissions");
        Intrinsics.checkNotNullParameter(set, "$expiredPermissions");
        Intrinsics.checkNotNullParameter(g, "this$0");
        Intrinsics.checkNotNullParameter(i, "it");
        final String a3 = d.a();
        final int c = d.c();
        final Long b = d.b();
        final String e2 = d.e();
        final d d2;
        Label_0495: {
            Label_0462: {
                a f;
                try {
                    f = g.f;
                    if (f.e().i() == null) {
                        break Label_0462;
                    }
                    final x1.a k = f.e().i();
                    String m;
                    if (k == null) {
                        m = null;
                    }
                    else {
                        m = k.m();
                    }
                    if (m != a.m()) {
                        break Label_0462;
                    }
                    if (!atomicBoolean.get() && a3 == null && c == 0) {
                        if (a2 != null) {
                            a2.b(new o("Failed to refresh access token"));
                        }
                        g.d.set(false);
                        return;
                    }
                }
                finally {
                    a = null;
                    break Label_0495;
                }
                Date g2 = a.g();
                if (d2.c() != 0) {
                    g2 = new Date(d2.c() * 1000L);
                }
                else if (d2.d() != 0) {
                    g2 = new Date(d2.d() * 1000L + new Date().getTime());
                }
                String l;
                if ((l = a3) == null) {
                    l = a.l();
                }
                final String c2 = a.c();
                final String m2 = a.m();
                if (!atomicBoolean.get()) {
                    j = a.j();
                }
                if (!atomicBoolean.get()) {
                    e = a.e();
                }
                Set f2;
                if (atomicBoolean.get()) {
                    f2 = set;
                }
                else {
                    f2 = a.f();
                }
                final h k2 = a.k();
                final Date date = new Date();
                Date d3;
                if (b != null) {
                    d3 = new Date(b * 1000L);
                }
                else {
                    d3 = a.d();
                }
                String h = e2;
                if (e2 == null) {
                    h = a.h();
                }
                a = new x1.a(l, c2, m2, j, e, f2, k2, g2, date, d3, h);
                try {
                    f.e().r(a);
                    g.d.set(false);
                    if (a2 != null) {
                        a2.a(a);
                    }
                    return;
                }
                finally {
                    break Label_0495;
                }
            }
            if (a2 != null) {
                a2.b(new o("No current access token to refresh"));
            }
            g.d.set(false);
            return;
        }
        g.d.set(false);
        if (a2 != null && a != null) {
            a2.a(a);
        }
        throw d2;
    }
    
    public final void g() {
        this.q(this.i(), this.i());
    }
    
    public final void h() {
        if (!this.u()) {
            return;
        }
        this.k(null);
    }
    
    public final x1.a i() {
        return this.c;
    }
    
    public final boolean j() {
        final x1.a f = this.b.f();
        if (f != null) {
            this.s(f, false);
            return true;
        }
        return false;
    }
    
    public final void k(final x1.a.a a) {
        if (Intrinsics.a(Looper.getMainLooper(), Looper.myLooper())) {
            this.m(a);
            return;
        }
        new Handler(Looper.getMainLooper()).post((Runnable)new x1.c(this, a));
    }
    
    public final void m(final x1.a.a a) {
        final x1.a i = this.i();
        if (i == null) {
            if (a == null) {
                return;
            }
            a.b(new o("No current access token to refresh"));
        }
        else {
            if (this.d.compareAndSet(false, true)) {
                this.e = new Date();
                final HashSet set = new HashSet();
                final HashSet set2 = new HashSet();
                final HashSet set3 = new HashSet();
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                final d d = new d();
                final a f = x1.g.f;
                final J j = new J(new F[] { f.d(i, new x1.d(atomicBoolean, set, set2, set3)), f.c(i, new x1.e(d)) });
                j.f((J.a)new f(d, i, a, atomicBoolean, set, set2, set3, this));
                j.q();
                return;
            }
            if (a == null) {
                return;
            }
            a.b(new o("Refresh already in progress"));
        }
    }
    
    public final void q(final x1.a a, final x1.a a2) {
        final Intent intent = new Intent(B.l(), (Class)CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", (Parcelable)a);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", (Parcelable)a2);
        this.a.d(intent);
    }
    
    public final void r(final x1.a a) {
        this.s(a, true);
    }
    
    public final void s(final x1.a c, final boolean b) {
        final x1.a c2 = this.c;
        this.c = c;
        this.d.set(false);
        this.e = new Date(0L);
        if (b) {
            final x1.b b2 = this.b;
            if (c != null) {
                b2.g(c);
            }
            else {
                b2.a();
                final P a = P.a;
                P.i(B.l());
            }
        }
        if (!P.e(c2, c)) {
            this.q(c2, c);
            this.t();
        }
    }
    
    public final void t() {
        final Context l = B.l();
        final x1.a.c z = x1.a.z;
        final x1.a e = z.e();
        final AlarmManager alarmManager = (AlarmManager)l.getSystemService("alarm");
        if (!z.g()) {
            return;
        }
        Date g;
        if (e == null) {
            g = null;
        }
        else {
            g = e.g();
        }
        if (g == null) {
            return;
        }
        if (alarmManager == null) {
            return;
        }
        final Intent intent = new Intent(l, (Class)CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        final PendingIntent broadcast = PendingIntent.getBroadcast(l, 0, intent, 67108864);
        try {
            alarmManager.set(1, e.g().getTime(), broadcast);
        }
        catch (Exception ex) {}
    }
    
    public final boolean u() {
        final x1.a i = this.i();
        final boolean b = false;
        if (i == null) {
            return false;
        }
        final long time = new Date().getTime();
        boolean b2 = b;
        if (i.k().e()) {
            b2 = b;
            if (time - this.e.getTime() > 3600000L) {
                b2 = b;
                if (time - i.i().getTime() > 86400000L) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public static final class a
    {
        public final F c(final x1.a a, final F.b b) {
            final e f = this.f(a);
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putString("grant_type", f.b());
            ((BaseBundle)bundle).putString("client_id", a.c());
            ((BaseBundle)bundle).putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            final F x = F.n.x(a, f.a(), b);
            x.G(bundle);
            x.F(L.o);
            return x;
        }
        
        public final F d(final x1.a a, final F.b b) {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putString("fields", "permission,status");
            final F x = F.n.x(a, "me/permissions", b);
            x.G(bundle);
            x.F(L.o);
            return x;
        }
        
        public final g e() {
            final g e = x1.g.e();
            if (e != null) {
                return e;
            }
            // monitorenter(this)
            // monitorexit(this)
            Label_0064: {
                try {
                    if (x1.g.e() == null) {
                        final Z.a b = Z.a.b(B.l());
                        Intrinsics.checkNotNullExpressionValue(b, "getInstance(applicationContext)");
                        x1.g.f(new g(b, new x1.b()));
                    }
                }
                finally {
                    break Label_0064;
                }
                return;
            }
        }
        // monitorexit(this)
        
        public final e f(final x1.a a) {
            String h;
            if ((h = a.h()) == null) {
                h = "facebook";
            }
            if (Intrinsics.a(h, "instagram")) {
                return new c();
            }
            return new b();
        }
    }
    
    public static final class b implements e
    {
        public final String a;
        public final String b;
        
        public b() {
            this.a = "oauth/access_token";
            this.b = "fb_extend_sso_token";
        }
        
        @Override
        public String a() {
            return this.a;
        }
        
        @Override
        public String b() {
            return this.b;
        }
    }
    
    public static final class c implements e
    {
        public final String a;
        public final String b;
        
        public c() {
            this.a = "refresh_access_token";
            this.b = "ig_refresh_token";
        }
        
        @Override
        public String a() {
            return this.a;
        }
        
        @Override
        public String b() {
            return this.b;
        }
    }
    
    public static final class d
    {
        public String a;
        public int b;
        public int c;
        public Long d;
        public String e;
        
        public final String a() {
            return this.a;
        }
        
        public final Long b() {
            return this.d;
        }
        
        public final int c() {
            return this.b;
        }
        
        public final int d() {
            return this.c;
        }
        
        public final String e() {
            return this.e;
        }
        
        public final void f(final String a) {
            this.a = a;
        }
        
        public final void g(final Long d) {
            this.d = d;
        }
        
        public final void h(final int b) {
            this.b = b;
        }
        
        public final void i(final int c) {
            this.c = c;
        }
        
        public final void j(final String e) {
            this.e = e;
        }
    }
    
    public interface e
    {
        String a();
        
        String b();
    }
}
