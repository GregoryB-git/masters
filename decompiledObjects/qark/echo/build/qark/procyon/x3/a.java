// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x3;

import android.os.BaseBundle;
import R2.t4;
import A2.n;
import R2.r3;
import R2.n3;
import android.os.Bundle;
import R2.s3;
import X2.v;
import X2.y;

public abstract class a
{
    public static final y a;
    public static final v b;
    public static final v c;
    public static final v d;
    public static final v e;
    public static final v f;
    
    static {
        a = y.c0("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
        b = v.d0("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
        c = v.b0("auto", "app", "am");
        d = v.a0("_r", "_dbg");
        e = new v.a().i((Object[])s3.a).i((Object[])s3.b).k();
        f = v.a0("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }
    
    public static Bundle a(final w3.a.c c) {
        final Bundle bundle = new Bundle();
        final String a = c.a;
        if (a != null) {
            ((BaseBundle)bundle).putString("origin", a);
        }
        final String b = c.b;
        if (b != null) {
            ((BaseBundle)bundle).putString("name", b);
        }
        final Object c2 = c.c;
        if (c2 != null) {
            n3.b(bundle, c2);
        }
        final String d = c.d;
        if (d != null) {
            ((BaseBundle)bundle).putString("trigger_event_name", d);
        }
        ((BaseBundle)bundle).putLong("trigger_timeout", c.e);
        final String f = c.f;
        if (f != null) {
            ((BaseBundle)bundle).putString("timed_out_event_name", f);
        }
        final Bundle g = c.g;
        if (g != null) {
            bundle.putBundle("timed_out_event_params", g);
        }
        final String h = c.h;
        if (h != null) {
            ((BaseBundle)bundle).putString("triggered_event_name", h);
        }
        final Bundle i = c.i;
        if (i != null) {
            bundle.putBundle("triggered_event_params", i);
        }
        ((BaseBundle)bundle).putLong("time_to_live", c.j);
        final String k = c.k;
        if (k != null) {
            ((BaseBundle)bundle).putString("expired_event_name", k);
        }
        final Bundle l = c.l;
        if (l != null) {
            bundle.putBundle("expired_event_params", l);
        }
        ((BaseBundle)bundle).putLong("creation_timestamp", c.m);
        ((BaseBundle)bundle).putBoolean("active", c.n);
        ((BaseBundle)bundle).putLong("triggered_timestamp", c.o);
        return bundle;
    }
    
    public static String b(final String s) {
        final String a = r3.a(s);
        if (a != null) {
            return a;
        }
        return s;
    }
    
    public static w3.a.c c(final Bundle bundle) {
        n.i(bundle);
        final w3.a.c c = new w3.a.c();
        c.a = (String)n.i(n3.a(bundle, "origin", String.class, null));
        c.b = (String)n.i(n3.a(bundle, "name", String.class, null));
        c.c = n3.a(bundle, "value", Object.class, null);
        c.d = (String)n3.a(bundle, "trigger_event_name", String.class, null);
        final Long value = 0L;
        c.e = (long)n3.a(bundle, "trigger_timeout", Long.class, value);
        c.f = (String)n3.a(bundle, "timed_out_event_name", String.class, null);
        c.g = (Bundle)n3.a(bundle, "timed_out_event_params", Bundle.class, null);
        c.h = (String)n3.a(bundle, "triggered_event_name", String.class, null);
        c.i = (Bundle)n3.a(bundle, "triggered_event_params", Bundle.class, null);
        c.j = (long)n3.a(bundle, "time_to_live", Long.class, value);
        c.k = (String)n3.a(bundle, "expired_event_name", String.class, null);
        c.l = (Bundle)n3.a(bundle, "expired_event_params", Bundle.class, null);
        c.n = (boolean)n3.a(bundle, "active", Boolean.class, Boolean.FALSE);
        c.m = (long)n3.a(bundle, "creation_timestamp", Long.class, value);
        c.o = (long)n3.a(bundle, "triggered_timestamp", Long.class, value);
        return c;
    }
    
    public static void d(final String anObject, final String anObject2, final Bundle bundle) {
        if ("clx".equals(anObject) && "_ae".equals(anObject2)) {
            ((BaseBundle)bundle).putLong("_r", 1L);
        }
    }
    
    public static boolean e(final String s, final Bundle bundle) {
        if (x3.a.b.contains(s)) {
            return false;
        }
        if (bundle != null) {
            final v d = x3.a.d;
            final int size = d.size();
            int i = 0;
            while (i < size) {
                final String value = d.get(i);
                ++i;
                if (((BaseBundle)bundle).containsKey((String)value)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean f(final String s, final String anObject) {
        if ("_ce1".equals(anObject) || "_ce2".equals(anObject)) {
            return s.equals("fcm") || s.equals("frc");
        }
        if ("_ln".equals(anObject)) {
            return s.equals("fcm") || s.equals("fiam");
        }
        if (x3.a.e.contains(anObject)) {
            return false;
        }
        final v f = x3.a.f;
        final int size = f.size();
        int i = 0;
        while (i < size) {
            final String value = f.get(i);
            ++i;
            if (anObject.matches(value)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean g(String s, final String anObject, final Bundle bundle) {
        if (!"_cmp".equals(anObject)) {
            return true;
        }
        if (!j(s)) {
            return false;
        }
        if (bundle == null) {
            return false;
        }
        final v d = x3.a.d;
        final int size = d.size();
        int i = 0;
        while (i < size) {
            final String value = d.get(i);
            ++i;
            if (((BaseBundle)bundle).containsKey((String)value)) {
                return false;
            }
        }
        s.hashCode();
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 3142703: {
                if (!s.equals("fiam")) {
                    break;
                }
                n = 2;
                break;
            }
            case 101230: {
                if (!s.equals("fdl")) {
                    break;
                }
                n = 1;
                break;
            }
            case 101200: {
                if (!s.equals("fcm")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return false;
            }
            case 2: {
                s = "fiam_integration";
                break;
            }
            case 1: {
                s = "fdl_integration";
                break;
            }
            case 0: {
                s = "fcm_integration";
                break;
            }
        }
        ((BaseBundle)bundle).putString("_cis", s);
        return true;
    }
    
    public static boolean h(final w3.a.c c) {
        if (c == null) {
            return false;
        }
        final String a = c.a;
        if (a == null) {
            return false;
        }
        if (a.isEmpty()) {
            return false;
        }
        final Object c2 = c.c;
        if (c2 != null && t4.a(c2) == null) {
            return false;
        }
        if (!j(a)) {
            return false;
        }
        if (!f(a, c.b)) {
            return false;
        }
        final String k = c.k;
        if (k != null) {
            if (!e(k, c.l)) {
                return false;
            }
            if (!g(a, c.k, c.l)) {
                return false;
            }
        }
        final String h = c.h;
        if (h != null) {
            if (!e(h, c.i)) {
                return false;
            }
            if (!g(a, c.h, c.i)) {
                return false;
            }
        }
        final String f = c.f;
        if (f != null) {
            if (!e(f, c.g)) {
                return false;
            }
            if (!g(a, c.f, c.g)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean i(final String s) {
        return !x3.a.a.contains(s);
    }
    
    public static boolean j(final String s) {
        return !x3.a.c.contains(s);
    }
}
