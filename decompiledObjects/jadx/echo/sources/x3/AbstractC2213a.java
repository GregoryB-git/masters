package x3;

import A2.AbstractC0328n;
import R2.AbstractC0564n3;
import R2.AbstractC0591r3;
import R2.AbstractC0598s3;
import R2.AbstractC0606t4;
import X2.AbstractC0703v;
import X2.AbstractC0706y;
import android.os.Bundle;
import w3.InterfaceC2100a;

/* renamed from: x3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2213a {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0706y f21203a = AbstractC0706y.c0("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC0703v f21204b = AbstractC0703v.d0("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC0703v f21205c = AbstractC0703v.b0("auto", "app", "am");

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC0703v f21206d = AbstractC0703v.a0("_r", "_dbg");

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC0703v f21207e = new AbstractC0703v.a().i(AbstractC0598s3.f5527a).i(AbstractC0598s3.f5528b).k();

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0703v f21208f = AbstractC0703v.a0("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static Bundle a(InterfaceC2100a.c cVar) {
        Bundle bundle = new Bundle();
        String str = cVar.f20378a;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = cVar.f20379b;
        if (str2 != null) {
            bundle.putString("name", str2);
        }
        Object obj = cVar.f20380c;
        if (obj != null) {
            AbstractC0564n3.b(bundle, obj);
        }
        String str3 = cVar.f20381d;
        if (str3 != null) {
            bundle.putString("trigger_event_name", str3);
        }
        bundle.putLong("trigger_timeout", cVar.f20382e);
        String str4 = cVar.f20383f;
        if (str4 != null) {
            bundle.putString("timed_out_event_name", str4);
        }
        Bundle bundle2 = cVar.f20384g;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str5 = cVar.f20385h;
        if (str5 != null) {
            bundle.putString("triggered_event_name", str5);
        }
        Bundle bundle3 = cVar.f20386i;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", cVar.f20387j);
        String str6 = cVar.f20388k;
        if (str6 != null) {
            bundle.putString("expired_event_name", str6);
        }
        Bundle bundle4 = cVar.f20389l;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", cVar.f20390m);
        bundle.putBoolean("active", cVar.f20391n);
        bundle.putLong("triggered_timestamp", cVar.f20392o);
        return bundle;
    }

    public static String b(String str) {
        String a7 = AbstractC0591r3.a(str);
        return a7 != null ? a7 : str;
    }

    public static InterfaceC2100a.c c(Bundle bundle) {
        AbstractC0328n.i(bundle);
        InterfaceC2100a.c cVar = new InterfaceC2100a.c();
        cVar.f20378a = (String) AbstractC0328n.i((String) AbstractC0564n3.a(bundle, "origin", String.class, null));
        cVar.f20379b = (String) AbstractC0328n.i((String) AbstractC0564n3.a(bundle, "name", String.class, null));
        cVar.f20380c = AbstractC0564n3.a(bundle, "value", Object.class, null);
        cVar.f20381d = (String) AbstractC0564n3.a(bundle, "trigger_event_name", String.class, null);
        cVar.f20382e = ((Long) AbstractC0564n3.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
        cVar.f20383f = (String) AbstractC0564n3.a(bundle, "timed_out_event_name", String.class, null);
        cVar.f20384g = (Bundle) AbstractC0564n3.a(bundle, "timed_out_event_params", Bundle.class, null);
        cVar.f20385h = (String) AbstractC0564n3.a(bundle, "triggered_event_name", String.class, null);
        cVar.f20386i = (Bundle) AbstractC0564n3.a(bundle, "triggered_event_params", Bundle.class, null);
        cVar.f20387j = ((Long) AbstractC0564n3.a(bundle, "time_to_live", Long.class, 0L)).longValue();
        cVar.f20388k = (String) AbstractC0564n3.a(bundle, "expired_event_name", String.class, null);
        cVar.f20389l = (Bundle) AbstractC0564n3.a(bundle, "expired_event_params", Bundle.class, null);
        cVar.f20391n = ((Boolean) AbstractC0564n3.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
        cVar.f20390m = ((Long) AbstractC0564n3.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
        cVar.f20392o = ((Long) AbstractC0564n3.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        return cVar;
    }

    public static void d(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean e(String str, Bundle bundle) {
        if (f21204b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        AbstractC0703v abstractC0703v = f21206d;
        int size = abstractC0703v.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = abstractC0703v.get(i7);
            i7++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f21207e.contains(str2)) {
            return false;
        }
        AbstractC0703v abstractC0703v = f21208f;
        int size = abstractC0703v.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = abstractC0703v.get(i7);
            i7++;
            if (str2.matches((String) obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean g(String str, String str2, Bundle bundle) {
        String str3;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!j(str) || bundle == null) {
            return false;
        }
        AbstractC0703v abstractC0703v = f21206d;
        int size = abstractC0703v.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = abstractC0703v.get(i7);
            i7++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        str.hashCode();
        switch (str) {
            case "fcm":
                str3 = "fcm_integration";
                break;
            case "fdl":
                str3 = "fdl_integration";
                break;
            case "fiam":
                str3 = "fiam_integration";
                break;
            default:
                return false;
        }
        bundle.putString("_cis", str3);
        return true;
    }

    public static boolean h(InterfaceC2100a.c cVar) {
        String str;
        if (cVar == null || (str = cVar.f20378a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = cVar.f20380c;
        if ((obj != null && AbstractC0606t4.a(obj) == null) || !j(str) || !f(str, cVar.f20379b)) {
            return false;
        }
        String str2 = cVar.f20388k;
        if (str2 != null && (!e(str2, cVar.f20389l) || !g(str, cVar.f20388k, cVar.f20389l))) {
            return false;
        }
        String str3 = cVar.f20385h;
        if (str3 != null && (!e(str3, cVar.f20386i) || !g(str, cVar.f20385h, cVar.f20386i))) {
            return false;
        }
        String str4 = cVar.f20383f;
        if (str4 != null) {
            return e(str4, cVar.f20384g) && g(str, cVar.f20383f, cVar.f20384g);
        }
        return true;
    }

    public static boolean i(String str) {
        return !f21203a.contains(str);
    }

    public static boolean j(String str) {
        return !f21205c.contains(str);
    }
}
