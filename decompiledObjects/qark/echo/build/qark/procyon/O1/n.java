// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import java.util.Arrays;
import kotlin.jvm.internal.g;
import java.util.Iterator;
import kotlin.text.i;
import x1.B;
import kotlin.jvm.internal.Intrinsics;
import java.util.HashMap;
import java.util.Map;

public final class n
{
    public static final n a;
    public static final Map b;
    
    static {
        a = new n();
        b = new HashMap();
    }
    
    public static final void a(final b b, final a a) {
        Intrinsics.checkNotNullParameter(b, "feature");
        Intrinsics.checkNotNullParameter(a, "callback");
        final q a2 = q.a;
        q.h((q.a)new q.a() {
            @Override
            public void a() {
                final n.a a = a;
                final n a2 = n.a;
                a.a(n.g(b));
            }
        });
    }
    
    public static final void c(final b b) {
        Intrinsics.checkNotNullParameter(b, "feature");
        B.l().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(b.j(), B.B()).apply();
    }
    
    public static final b d(final String s) {
        Intrinsics.checkNotNullParameter(s, "className");
        n.a.f();
        for (final Map.Entry<b, V> entry : n.b.entrySet()) {
            final b b = entry.getKey();
            final String[] array = (Object)entry.getValue();
            final int length = array.length;
            int i = 0;
            while (i < length) {
                final String s2 = array[i];
                ++i;
                if (kotlin.text.i.s(s, s2, false, 2, null)) {
                    return b;
                }
            }
        }
        return n.b.q;
    }
    
    public static final boolean g(final b b) {
        Intrinsics.checkNotNullParameter(b, "feature");
        final b q = n.b.q;
        final boolean b2 = false;
        if (q == b) {
            return false;
        }
        if (n.b.r == b) {
            return true;
        }
        final String string = B.l().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(b.j(), (String)null);
        if (string != null && Intrinsics.a(string, B.B())) {
            return false;
        }
        final b h = b.h();
        if (h == b) {
            return n.a.e(b);
        }
        boolean b3 = b2;
        if (g(h)) {
            b3 = b2;
            if (n.a.e(b)) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public final boolean b(final b b) {
        switch (c.a[b.ordinal()]) {
            default: {
                return true;
            }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24: {
                return false;
            }
        }
    }
    
    public final boolean e(final b b) {
        final boolean b2 = this.b(b);
        final q a = q.a;
        return q.d(b.j(), B.m(), b2);
    }
    
    public final void f() {
        synchronized (this) {
            final Map b = n.b;
            if (!b.isEmpty()) {
                return;
            }
            b.put(n.b.w, new String[] { "com.facebook.appevents.aam." });
            b.put(n.b.t, new String[] { "com.facebook.appevents.codeless." });
            b.put(n.b.u, new String[] { "com.facebook.appevents.cloudbridge." });
            b.put(n.b.M, new String[] { "com.facebook.internal.instrument.errorreport." });
            b.put(n.b.N, new String[] { "com.facebook.internal.instrument.anrreport." });
            b.put(n.b.x, new String[] { "com.facebook.appevents.ml." });
            b.put(n.b.y, new String[] { "com.facebook.appevents.suggestedevents." });
            b.put(n.b.v, new String[] { "com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager" });
            b.put(n.b.z, new String[] { "com.facebook.appevents.integrity.IntegrityManager" });
            b.put(n.b.B, new String[] { "com.facebook.appevents.integrity.ProtectedModeManager" });
            b.put(n.b.C, new String[] { "com.facebook.appevents.integrity.MACARuleMatchingManager" });
            b.put(n.b.D, new String[] { "com.facebook.appevents.eventdeactivation." });
            b.put(n.b.E, new String[] { "com.facebook.appevents.ondeviceprocessing." });
            b.put(n.b.G, new String[] { "com.facebook.appevents.iap." });
            b.put(n.b.O, new String[] { "com.facebook.internal.logging.monitor" });
        }
    }
    
    public interface a
    {
        void a(final boolean p0);
    }
    
    public enum b
    {
        A("ModelRequest", 10, 66563), 
        B("ProtectedMode", 11, 66564), 
        C("MACARuleMatching", 12, 66565), 
        D("EventDeactivation", 13, 66816), 
        E("OnDeviceEventProcessing", 14, 67072), 
        F("OnDevicePostInstallEventProcessing", 15, 67073), 
        G("IapLogging", 16, 67328), 
        H("IapLoggingLib2", 17, 67329), 
        I("Instrument", 18, 131072), 
        J("CrashReport", 19, 131328), 
        K("CrashShield", 20, 131329), 
        L("ThreadCheck", 21, 131330), 
        M("ErrorReport", 22, 131584), 
        N("AnrReport", 23, 131840), 
        O("Monitoring", 24, 196608), 
        P("ServiceUpdateCompliance", 25, 196864), 
        Q("Megatron", 26, 262144), 
        R("Elora", 27, 327680), 
        S("Login", 28, 16777216), 
        T("ChromeCustomTabsPrefetching", 29, 16842752), 
        U("IgnoreAppSwitchToLoggedOut", 30, 16908288), 
        V("BypassAppSwitch", 31, 16973824), 
        W("Share", 32, 33554432);
        
        public static final a p;
        
        q("Unknown", 0, -1), 
        r("Core", 1, 0), 
        s("AppEvents", 2, 65536), 
        t("CodelessEvents", 3, 65792), 
        u("CloudBridge", 4, 67584), 
        v("RestrictiveDataFiltering", 5, 66048), 
        w("AAM", 6, 66304), 
        x("PrivacyProtection", 7, 66560), 
        y("SuggestedEvents", 8, 66561), 
        z("IntelligentIntegrity", 9, 66562);
        
        public final int o;
        
        static {
            X = c();
            p = new a(null);
        }
        
        public b(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        public static final /* synthetic */ n.b[] c() {
            return new n.b[] { n.b.q, n.b.r, n.b.s, n.b.t, n.b.u, n.b.v, n.b.w, n.b.x, n.b.y, n.b.z, n.b.A, n.b.B, n.b.C, n.b.D, n.b.E, n.b.F, n.b.G, n.b.H, n.b.I, n.b.J, n.b.K, n.b.L, n.b.M, n.b.N, n.b.O, n.b.P, n.b.Q, n.b.R, n.b.S, n.b.T, n.b.U, n.b.V, n.b.W };
        }
        
        public static final /* synthetic */ int e(final n.b b) {
            return b.o;
        }
        
        public final n.b h() {
            final int o = this.o;
            a a;
            int n;
            if ((o & 0xFF) > 0) {
                a = O1.n.b.p;
                n = (o & 0xFFFFFF00);
            }
            else {
                int n2;
                if ((0xFF00 & o) > 0) {
                    a = O1.n.b.p;
                    n2 = -65536;
                }
                else {
                    if ((0xFF0000 & o) <= 0) {
                        return O1.n.b.p.a(0);
                    }
                    a = O1.n.b.p;
                    n2 = -16777216;
                }
                n = (o & n2);
            }
            return a.a(n);
        }
        
        public final String j() {
            return Intrinsics.i("FBSDKFeature", this);
        }
        
        @Override
        public String toString() {
            switch (n.b.b.a[this.ordinal()]) {
                default: {
                    return "unknown";
                }
                case 32: {
                    return "ShareKit";
                }
                case 31: {
                    return "BypassAppSwitch";
                }
                case 30: {
                    return "IgnoreAppSwitchToLoggedOut";
                }
                case 29: {
                    return "ChromeCustomTabsPrefetching";
                }
                case 28: {
                    return "LoginKit";
                }
                case 27: {
                    return "ServiceUpdateCompliance";
                }
                case 26: {
                    return "Elora";
                }
                case 25: {
                    return "Megatron";
                }
                case 24: {
                    return "Monitoring";
                }
                case 23: {
                    return "IAPLoggingLib2";
                }
                case 22: {
                    return "IAPLogging";
                }
                case 21: {
                    return "OnDevicePostInstallEventProcessing";
                }
                case 20: {
                    return "OnDeviceEventProcessing";
                }
                case 19: {
                    return "EventDeactivation";
                }
                case 18: {
                    return "ModelRequest";
                }
                case 17: {
                    return "MACARuleMatching";
                }
                case 16: {
                    return "ProtectedMode";
                }
                case 15: {
                    return "IntelligentIntegrity";
                }
                case 14: {
                    return "SuggestedEvents";
                }
                case 13: {
                    return "PrivacyProtection";
                }
                case 12: {
                    return "AppEventsCloudbridge";
                }
                case 11: {
                    return "AAM";
                }
                case 10: {
                    return "AnrReport";
                }
                case 9: {
                    return "ErrorReport";
                }
                case 8: {
                    return "ThreadCheck";
                }
                case 7: {
                    return "CrashShield";
                }
                case 6: {
                    return "CrashReport";
                }
                case 5: {
                    return "Instrument";
                }
                case 4: {
                    return "RestrictiveDataFiltering";
                }
                case 3: {
                    return "CodelessEvents";
                }
                case 2: {
                    return "AppEvents";
                }
                case 1: {
                    return "CoreKit";
                }
            }
        }
        
        public static final class a
        {
            public final n.b a(final int n) {
                final n.b[] values = b.values();
                final int length = values.length;
                int i = 0;
                while (i < length) {
                    final n.b b = values[i];
                    ++i;
                    if (O1.n.b.e(b) == n) {
                        return b;
                    }
                }
                return b.q;
            }
        }
    }
}
