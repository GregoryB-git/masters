/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Set
 */
package O1;

import O1.q;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import kotlin.text.i;
import x1.B;

public final class n {
    public static final n a = new n();
    public static final Map b = new HashMap();

    public static final void a(final b b8, final a a8) {
        Intrinsics.checkNotNullParameter((Object)b8, "feature");
        Intrinsics.checkNotNullParameter(a8, "callback");
        q q8 = q.a;
        q.h(new q.a(){

            @Override
            public void a() {
                a a82 = a8;
                n n8 = n.a;
                a82.a(n.g(b8));
            }
        });
    }

    public static final void c(b b8) {
        Intrinsics.checkNotNullParameter((Object)b8, "feature");
        B.l().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(b8.j(), B.B()).apply();
    }

    public static final b d(String string2) {
        Intrinsics.checkNotNullParameter(string2, "className");
        a.f();
        for (String[] arrstring : b.entrySet()) {
            b b8 = (b)((Object)arrstring.getKey());
            for (String string3 : (String[])arrstring.getValue()) {
                if (!i.s(string2, string3, false, 2, null)) continue;
                return b8;
            }
        }
        return b.q;
    }

    public static final boolean g(b b8) {
        Intrinsics.checkNotNullParameter((Object)b8, "feature");
        Object object = b.q;
        boolean bl = false;
        if (object == b8) {
            return false;
        }
        if (b.r == b8) {
            return true;
        }
        object = B.l().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(b8.j(), null);
        if (object != null && Intrinsics.a(object, B.B())) {
            return false;
        }
        object = b8.h();
        if (object == b8) {
            return a.e(b8);
        }
        boolean bl2 = bl;
        if (n.g((b)((Object)object))) {
            bl2 = bl;
            if (a.e(b8)) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final boolean b(b b8) {
        switch (c.a[b8.ordinal()]) {
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
            case 24: 
        }
        return false;
    }

    public final boolean e(b b8) {
        boolean bl = this.b(b8);
        q q8 = q.a;
        return q.d(b8.j(), B.m(), bl);
    }

    public final void f() {
        synchronized (this) {
            Map map;
            block4 : {
                map = b;
                boolean bl = map.isEmpty();
                if (bl) break block4;
                return;
            }
            map.put((Object)b.w, (Object)new String[]{"com.facebook.appevents.aam."});
            map.put((Object)b.t, (Object)new String[]{"com.facebook.appevents.codeless."});
            map.put((Object)b.u, (Object)new String[]{"com.facebook.appevents.cloudbridge."});
            map.put((Object)b.M, (Object)new String[]{"com.facebook.internal.instrument.errorreport."});
            map.put((Object)b.N, (Object)new String[]{"com.facebook.internal.instrument.anrreport."});
            map.put((Object)b.x, (Object)new String[]{"com.facebook.appevents.ml."});
            map.put((Object)b.y, (Object)new String[]{"com.facebook.appevents.suggestedevents."});
            map.put((Object)b.v, (Object)new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
            map.put((Object)b.z, (Object)new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
            map.put((Object)b.B, (Object)new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
            map.put((Object)b.C, (Object)new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
            map.put((Object)b.D, (Object)new String[]{"com.facebook.appevents.eventdeactivation."});
            map.put((Object)b.E, (Object)new String[]{"com.facebook.appevents.ondeviceprocessing."});
            map.put((Object)b.G, (Object)new String[]{"com.facebook.appevents.iap."});
            map.put((Object)b.O, (Object)new String[]{"com.facebook.internal.logging.monitor"});
            return;
        }
    }

    public static interface a {
        public void a(boolean var1);
    }

    public static final class O1.n$b
    extends Enum {
        public static final /* enum */ O1.n$b A;
        public static final /* enum */ O1.n$b B;
        public static final /* enum */ O1.n$b C;
        public static final /* enum */ O1.n$b D;
        public static final /* enum */ O1.n$b E;
        public static final /* enum */ O1.n$b F;
        public static final /* enum */ O1.n$b G;
        public static final /* enum */ O1.n$b H;
        public static final /* enum */ O1.n$b I;
        public static final /* enum */ O1.n$b J;
        public static final /* enum */ O1.n$b K;
        public static final /* enum */ O1.n$b L;
        public static final /* enum */ O1.n$b M;
        public static final /* enum */ O1.n$b N;
        public static final /* enum */ O1.n$b O;
        public static final /* enum */ O1.n$b P;
        public static final /* enum */ O1.n$b Q;
        public static final /* enum */ O1.n$b R;
        public static final /* enum */ O1.n$b S;
        public static final /* enum */ O1.n$b T;
        public static final /* enum */ O1.n$b U;
        public static final /* enum */ O1.n$b V;
        public static final /* enum */ O1.n$b W;
        public static final /* synthetic */ O1.n$b[] X;
        public static final a p;
        public static final /* enum */ O1.n$b q;
        public static final /* enum */ O1.n$b r;
        public static final /* enum */ O1.n$b s;
        public static final /* enum */ O1.n$b t;
        public static final /* enum */ O1.n$b u;
        public static final /* enum */ O1.n$b v;
        public static final /* enum */ O1.n$b w;
        public static final /* enum */ O1.n$b x;
        public static final /* enum */ O1.n$b y;
        public static final /* enum */ O1.n$b z;
        public final int o;

        static {
            q = new O1.n$b(-1);
            r = new O1.n$b(0);
            s = new O1.n$b(65536);
            t = new O1.n$b(65792);
            u = new O1.n$b(67584);
            v = new O1.n$b(66048);
            w = new O1.n$b(66304);
            x = new O1.n$b(66560);
            y = new O1.n$b(66561);
            z = new O1.n$b(66562);
            A = new O1.n$b(66563);
            B = new O1.n$b(66564);
            C = new O1.n$b(66565);
            D = new O1.n$b(66816);
            E = new O1.n$b(67072);
            F = new O1.n$b(67073);
            G = new O1.n$b(67328);
            H = new O1.n$b(67329);
            I = new O1.n$b(131072);
            J = new O1.n$b(131328);
            K = new O1.n$b(131329);
            L = new O1.n$b(131330);
            M = new O1.n$b(131584);
            N = new O1.n$b(131840);
            O = new O1.n$b(196608);
            P = new O1.n$b(196864);
            Q = new O1.n$b(262144);
            R = new O1.n$b(327680);
            S = new O1.n$b(16777216);
            T = new O1.n$b(16842752);
            U = new O1.n$b(16908288);
            V = new O1.n$b(16973824);
            W = new O1.n$b(33554432);
            X = O1.n$b.c();
            p = new a(null);
        }

        public O1.n$b(int n9) {
            this.o = n9;
        }

        public static final /* synthetic */ O1.n$b[] c() {
            return new O1.n$b[]{q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W};
        }

        public static O1.n$b valueOf(String string2) {
            Intrinsics.checkNotNullParameter(string2, "value");
            return (O1.n$b)Enum.valueOf(O1.n$b.class, (String)string2);
        }

        public static O1.n$b[] values() {
            O1.n$b[] arrb = X;
            return (O1.n$b[])Arrays.copyOf((Object[])arrb, (int)arrb.length);
        }

        /*
         * Enabled aggressive block sorting
         */
        public final O1.n$b h() {
            int n8;
            a a8;
            int n9 = this.o;
            if ((n9 & 255) > 0) {
                a8 = p;
                n8 = n9 & -256;
                return a8.a(n8);
            }
            if ((65280 & n9) > 0) {
                a8 = p;
                n8 = -65536;
            } else {
                if ((16711680 & n9) <= 0) return p.a(0);
                a8 = p;
                n8 = -16777216;
            }
            n8 = n9 & n8;
            return a8.a(n8);
        }

        public final String j() {
            return Intrinsics.i("FBSDKFeature", (Object)this);
        }

        public String toString() {
            switch (b.a[this.ordinal()]) {
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
                case 1: 
            }
            return "CoreKit";
        }

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(g g8) {
                this();
            }

            public final O1.n$b a(int n8) {
                for (O1.n$b b8 : O1.n$b.values()) {
                    if (b8.o != n8) continue;
                    return b8;
                }
                return O1.n$b.q;
            }
        }

        public abstract class b {
            public static final /* synthetic */ int[] a;

            static {
                int[] arrn = new int[O1.n$b.values().length];
                arrn[O1.n$b.r.ordinal()] = 1;
                arrn[O1.n$b.s.ordinal()] = 2;
                arrn[O1.n$b.t.ordinal()] = 3;
                arrn[O1.n$b.v.ordinal()] = 4;
                arrn[O1.n$b.I.ordinal()] = 5;
                arrn[O1.n$b.J.ordinal()] = 6;
                arrn[O1.n$b.K.ordinal()] = 7;
                arrn[O1.n$b.L.ordinal()] = 8;
                arrn[O1.n$b.M.ordinal()] = 9;
                arrn[O1.n$b.N.ordinal()] = 10;
                arrn[O1.n$b.w.ordinal()] = 11;
                arrn[O1.n$b.u.ordinal()] = 12;
                arrn[O1.n$b.x.ordinal()] = 13;
                arrn[O1.n$b.y.ordinal()] = 14;
                arrn[O1.n$b.z.ordinal()] = 15;
                arrn[O1.n$b.B.ordinal()] = 16;
                arrn[O1.n$b.C.ordinal()] = 17;
                arrn[O1.n$b.A.ordinal()] = 18;
                arrn[O1.n$b.D.ordinal()] = 19;
                arrn[O1.n$b.E.ordinal()] = 20;
                arrn[O1.n$b.F.ordinal()] = 21;
                arrn[O1.n$b.G.ordinal()] = 22;
                arrn[O1.n$b.H.ordinal()] = 23;
                arrn[O1.n$b.O.ordinal()] = 24;
                arrn[O1.n$b.Q.ordinal()] = 25;
                arrn[O1.n$b.R.ordinal()] = 26;
                arrn[O1.n$b.P.ordinal()] = 27;
                arrn[O1.n$b.S.ordinal()] = 28;
                arrn[O1.n$b.T.ordinal()] = 29;
                arrn[O1.n$b.U.ordinal()] = 30;
                arrn[O1.n$b.V.ordinal()] = 31;
                arrn[O1.n$b.W.ordinal()] = 32;
                a = arrn;
            }
        }

    }

    public abstract class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] arrn = new int[b.values().length];
            arrn[b.v.ordinal()] = 1;
            arrn[b.I.ordinal()] = 2;
            arrn[b.J.ordinal()] = 3;
            arrn[b.K.ordinal()] = 4;
            arrn[b.L.ordinal()] = 5;
            arrn[b.M.ordinal()] = 6;
            arrn[b.N.ordinal()] = 7;
            arrn[b.w.ordinal()] = 8;
            arrn[b.u.ordinal()] = 9;
            arrn[b.x.ordinal()] = 10;
            arrn[b.y.ordinal()] = 11;
            arrn[b.z.ordinal()] = 12;
            arrn[b.A.ordinal()] = 13;
            arrn[b.D.ordinal()] = 14;
            arrn[b.E.ordinal()] = 15;
            arrn[b.F.ordinal()] = 16;
            arrn[b.G.ordinal()] = 17;
            arrn[b.H.ordinal()] = 18;
            arrn[b.B.ordinal()] = 19;
            arrn[b.C.ordinal()] = 20;
            arrn[b.T.ordinal()] = 21;
            arrn[b.O.ordinal()] = 22;
            arrn[b.U.ordinal()] = 23;
            arrn[b.V.ordinal()] = 24;
            a = arrn;
        }
    }

}

