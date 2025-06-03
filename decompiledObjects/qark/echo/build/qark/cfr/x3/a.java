/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Boolean
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package x3;

import A2.n;
import R2.n3;
import R2.r3;
import R2.s3;
import R2.t4;
import X2.v;
import X2.y;
import android.os.Bundle;
import w3.a;

public abstract class a {
    public static final y a = y.c0("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    public static final v b = v.d0("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    public static final v c = v.b0("auto", "app", "am");
    public static final v d = v.a0("_r", "_dbg");
    public static final v e = new v.a().i(s3.a).i(s3.b).k();
    public static final v f = v.a0("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static Bundle a(a.c c8) {
        Bundle bundle = new Bundle();
        Object object = c8.a;
        if (object != null) {
            bundle.putString("origin", (String)object);
        }
        if ((object = c8.b) != null) {
            bundle.putString("name", (String)object);
        }
        if ((object = c8.c) != null) {
            n3.b(bundle, object);
        }
        if ((object = c8.d) != null) {
            bundle.putString("trigger_event_name", (String)object);
        }
        bundle.putLong("trigger_timeout", c8.e);
        object = c8.f;
        if (object != null) {
            bundle.putString("timed_out_event_name", (String)object);
        }
        if ((object = c8.g) != null) {
            bundle.putBundle("timed_out_event_params", (Bundle)object);
        }
        if ((object = c8.h) != null) {
            bundle.putString("triggered_event_name", (String)object);
        }
        if ((object = c8.i) != null) {
            bundle.putBundle("triggered_event_params", (Bundle)object);
        }
        bundle.putLong("time_to_live", c8.j);
        object = c8.k;
        if (object != null) {
            bundle.putString("expired_event_name", (String)object);
        }
        if ((object = c8.l) != null) {
            bundle.putBundle("expired_event_params", (Bundle)object);
        }
        bundle.putLong("creation_timestamp", c8.m);
        bundle.putBoolean("active", c8.n);
        bundle.putLong("triggered_timestamp", c8.o);
        return bundle;
    }

    public static String b(String string2) {
        String string3 = r3.a(string2);
        if (string3 != null) {
            return string3;
        }
        return string2;
    }

    public static a.c c(Bundle bundle) {
        n.i((Object)bundle);
        a.c c8 = new a.c();
        c8.a = (String)n.i((String)n3.a(bundle, "origin", String.class, null));
        c8.b = (String)n.i((String)n3.a(bundle, "name", String.class, null));
        c8.c = n3.a(bundle, "value", Object.class, null);
        c8.d = (String)n3.a(bundle, "trigger_event_name", String.class, null);
        Long l8 = 0L;
        c8.e = (Long)n3.a(bundle, "trigger_timeout", Long.class, (Object)l8);
        c8.f = (String)n3.a(bundle, "timed_out_event_name", String.class, null);
        c8.g = (Bundle)n3.a(bundle, "timed_out_event_params", Bundle.class, null);
        c8.h = (String)n3.a(bundle, "triggered_event_name", String.class, null);
        c8.i = (Bundle)n3.a(bundle, "triggered_event_params", Bundle.class, null);
        c8.j = (Long)n3.a(bundle, "time_to_live", Long.class, (Object)l8);
        c8.k = (String)n3.a(bundle, "expired_event_name", String.class, null);
        c8.l = (Bundle)n3.a(bundle, "expired_event_params", Bundle.class, null);
        c8.n = (Boolean)n3.a(bundle, "active", Boolean.class, (Object)Boolean.FALSE);
        c8.m = (Long)n3.a(bundle, "creation_timestamp", Long.class, (Object)l8);
        c8.o = (Long)n3.a(bundle, "triggered_timestamp", Long.class, (Object)l8);
        return c8;
    }

    public static void d(String string2, String string3, Bundle bundle) {
        if ("clx".equals((Object)string2) && "_ae".equals((Object)string3)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean e(String object, Bundle bundle) {
        if (b.contains(object)) {
            return false;
        }
        if (bundle != null) {
            object = d;
            int n8 = object.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                Object object2 = object.get(i8);
                if (!bundle.containsKey((String)object2)) continue;
                return false;
            }
        }
        return true;
    }

    public static boolean f(String object, String string2) {
        if (!"_ce1".equals((Object)string2) && !"_ce2".equals((Object)string2)) {
            if ("_ln".equals((Object)string2)) {
                if (!object.equals((Object)"fcm")) {
                    if (object.equals((Object)"fiam")) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            if (e.contains(string2)) {
                return false;
            }
            object = f;
            int n8 = object.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                Object object2 = object.get(i8);
                if (!string2.matches((String)object2)) continue;
                return false;
            }
            return true;
        }
        if (!object.equals((Object)"fcm")) {
            if (object.equals((Object)"frc")) {
                return true;
            }
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean g(String string2, String object, Bundle bundle) {
        int n8;
        if (!"_cmp".equals(object)) {
            return true;
        }
        if (!a.j(string2)) {
            return false;
        }
        if (bundle == null) {
            return false;
        }
        object = d;
        int n9 = object.size();
        for (n8 = 0; n8 < n9; ++n8) {
            Object object2 = object.get(n8);
            if (!bundle.containsKey((String)object2)) continue;
            return false;
        }
        string2.hashCode();
        n9 = string2.hashCode();
        n8 = -1;
        switch (n9) {
            default: {
                break;
            }
            case 3142703: {
                if (!string2.equals((Object)"fiam")) break;
                n8 = 2;
                break;
            }
            case 101230: {
                if (!string2.equals((Object)"fdl")) break;
                n8 = 1;
                break;
            }
            case 101200: {
                if (!string2.equals((Object)"fcm")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return false;
            }
            case 2: {
                string2 = "fiam_integration";
                break;
            }
            case 1: {
                string2 = "fdl_integration";
                break;
            }
            case 0: {
                string2 = "fcm_integration";
            }
        }
        bundle.putString("_cis", string2);
        return true;
    }

    public static boolean h(a.c c8) {
        if (c8 == null) {
            return false;
        }
        String string2 = c8.a;
        if (string2 != null) {
            if (string2.isEmpty()) {
                return false;
            }
            Object object = c8.c;
            if (object != null && t4.a(object) == null) {
                return false;
            }
            if (!a.j(string2)) {
                return false;
            }
            if (!a.f(string2, c8.b)) {
                return false;
            }
            object = c8.k;
            if (object != null) {
                if (!a.e((String)object, c8.l)) {
                    return false;
                }
                if (!a.g(string2, c8.k, c8.l)) {
                    return false;
                }
            }
            if ((object = c8.h) != null) {
                if (!a.e((String)object, c8.i)) {
                    return false;
                }
                if (!a.g(string2, c8.h, c8.i)) {
                    return false;
                }
            }
            if ((object = c8.f) != null) {
                if (!a.e((String)object, c8.g)) {
                    return false;
                }
                if (!a.g(string2, c8.f, c8.g)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean i(String string2) {
        if (!a.contains(string2)) {
            return true;
        }
        return false;
    }

    public static boolean j(String string2) {
        if (!c.contains(string2)) {
            return true;
        }
        return false;
    }
}

