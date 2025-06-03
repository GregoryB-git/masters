package O1;

import O1.C0454q;
import android.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;

/* renamed from: O1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0451n {

    /* renamed from: a, reason: collision with root package name */
    public static final C0451n f3862a = new C0451n();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3863b = new HashMap();

    /* renamed from: O1.n$a */
    public interface a {
        void a(boolean z7);
    }

    /* renamed from: O1.n$b */
    public enum b {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        CloudBridge(67584),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        ProtectedMode(66564),
        MACARuleMatching(66565),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(196608),
        ServiceUpdateCompliance(196864),
        Megatron(262144),
        Elora(327680),
        Login(16777216),
        ChromeCustomTabsPrefetching(R.attr.theme),
        IgnoreAppSwitchToLoggedOut(R.id.background),
        BypassAppSwitch(R.style.Animation),
        Share(33554432);


        /* renamed from: p, reason: collision with root package name */
        public static final a f3888p = new a(null);

        /* renamed from: o, reason: collision with root package name */
        public final int f3899o;

        /* renamed from: O1.n$b$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final b a(int i7) {
                b[] valuesCustom = b.valuesCustom();
                int length = valuesCustom.length;
                int i8 = 0;
                while (i8 < length) {
                    b bVar = valuesCustom[i8];
                    i8++;
                    if (bVar.f3899o == i7) {
                        return bVar;
                    }
                }
                return b.Unknown;
            }
        }

        /* renamed from: O1.n$b$b, reason: collision with other inner class name */
        public /* synthetic */ class C0073b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3900a;

            static {
                int[] iArr = new int[b.valuesCustom().length];
                iArr[b.Core.ordinal()] = 1;
                iArr[b.AppEvents.ordinal()] = 2;
                iArr[b.CodelessEvents.ordinal()] = 3;
                iArr[b.RestrictiveDataFiltering.ordinal()] = 4;
                iArr[b.Instrument.ordinal()] = 5;
                iArr[b.CrashReport.ordinal()] = 6;
                iArr[b.CrashShield.ordinal()] = 7;
                iArr[b.ThreadCheck.ordinal()] = 8;
                iArr[b.ErrorReport.ordinal()] = 9;
                iArr[b.AnrReport.ordinal()] = 10;
                iArr[b.AAM.ordinal()] = 11;
                iArr[b.CloudBridge.ordinal()] = 12;
                iArr[b.PrivacyProtection.ordinal()] = 13;
                iArr[b.SuggestedEvents.ordinal()] = 14;
                iArr[b.IntelligentIntegrity.ordinal()] = 15;
                iArr[b.ProtectedMode.ordinal()] = 16;
                iArr[b.MACARuleMatching.ordinal()] = 17;
                iArr[b.ModelRequest.ordinal()] = 18;
                iArr[b.EventDeactivation.ordinal()] = 19;
                iArr[b.OnDeviceEventProcessing.ordinal()] = 20;
                iArr[b.OnDevicePostInstallEventProcessing.ordinal()] = 21;
                iArr[b.IapLogging.ordinal()] = 22;
                iArr[b.IapLoggingLib2.ordinal()] = 23;
                iArr[b.Monitoring.ordinal()] = 24;
                iArr[b.Megatron.ordinal()] = 25;
                iArr[b.Elora.ordinal()] = 26;
                iArr[b.ServiceUpdateCompliance.ordinal()] = 27;
                iArr[b.Login.ordinal()] = 28;
                iArr[b.ChromeCustomTabsPrefetching.ordinal()] = 29;
                iArr[b.IgnoreAppSwitchToLoggedOut.ordinal()] = 30;
                iArr[b.BypassAppSwitch.ordinal()] = 31;
                iArr[b.Share.ordinal()] = 32;
                f3900a = iArr;
            }
        }

        b(int i7) {
            this.f3899o = i7;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] valuesCustom = values();
            return (b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final b h() {
            a aVar;
            int i7;
            int i8;
            int i9 = this.f3899o;
            if ((i9 & 255) > 0) {
                aVar = f3888p;
                i8 = i9 & (-256);
            } else {
                if ((65280 & i9) > 0) {
                    aVar = f3888p;
                    i7 = -65536;
                } else {
                    if ((16711680 & i9) <= 0) {
                        return f3888p.a(0);
                    }
                    aVar = f3888p;
                    i7 = -16777216;
                }
                i8 = i9 & i7;
            }
            return aVar.a(i8);
        }

        public final String j() {
            return Intrinsics.i("FBSDKFeature", this);
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (C0073b.f3900a[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    return "AppEventsCloudbridge";
                case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    return "PrivacyProtection";
                case 14:
                    return "SuggestedEvents";
                case 15:
                    return "IntelligentIntegrity";
                case 16:
                    return "ProtectedMode";
                case 17:
                    return "MACARuleMatching";
                case 18:
                    return "ModelRequest";
                case 19:
                    return "EventDeactivation";
                case 20:
                    return "OnDeviceEventProcessing";
                case 21:
                    return "OnDevicePostInstallEventProcessing";
                case 22:
                    return "IAPLogging";
                case 23:
                    return "IAPLoggingLib2";
                case 24:
                    return "Monitoring";
                case 25:
                    return "Megatron";
                case 26:
                    return "Elora";
                case 27:
                    return "ServiceUpdateCompliance";
                case 28:
                    return "LoginKit";
                case 29:
                    return "ChromeCustomTabsPrefetching";
                case 30:
                    return "IgnoreAppSwitchToLoggedOut";
                case 31:
                    return "BypassAppSwitch";
                case 32:
                    return "ShareKit";
                default:
                    return "unknown";
            }
        }
    }

    /* renamed from: O1.n$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3901a;

        static {
            int[] iArr = new int[b.valuesCustom().length];
            iArr[b.RestrictiveDataFiltering.ordinal()] = 1;
            iArr[b.Instrument.ordinal()] = 2;
            iArr[b.CrashReport.ordinal()] = 3;
            iArr[b.CrashShield.ordinal()] = 4;
            iArr[b.ThreadCheck.ordinal()] = 5;
            iArr[b.ErrorReport.ordinal()] = 6;
            iArr[b.AnrReport.ordinal()] = 7;
            iArr[b.AAM.ordinal()] = 8;
            iArr[b.CloudBridge.ordinal()] = 9;
            iArr[b.PrivacyProtection.ordinal()] = 10;
            iArr[b.SuggestedEvents.ordinal()] = 11;
            iArr[b.IntelligentIntegrity.ordinal()] = 12;
            iArr[b.ModelRequest.ordinal()] = 13;
            iArr[b.EventDeactivation.ordinal()] = 14;
            iArr[b.OnDeviceEventProcessing.ordinal()] = 15;
            iArr[b.OnDevicePostInstallEventProcessing.ordinal()] = 16;
            iArr[b.IapLogging.ordinal()] = 17;
            iArr[b.IapLoggingLib2.ordinal()] = 18;
            iArr[b.ProtectedMode.ordinal()] = 19;
            iArr[b.MACARuleMatching.ordinal()] = 20;
            iArr[b.ChromeCustomTabsPrefetching.ordinal()] = 21;
            iArr[b.Monitoring.ordinal()] = 22;
            iArr[b.IgnoreAppSwitchToLoggedOut.ordinal()] = 23;
            iArr[b.BypassAppSwitch.ordinal()] = 24;
            f3901a = iArr;
        }
    }

    /* renamed from: O1.n$d */
    public static final class d implements C0454q.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f3902a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f3903b;

        public d(a aVar, b bVar) {
            this.f3902a = aVar;
            this.f3903b = bVar;
        }

        @Override // O1.C0454q.a
        public void a() {
            a aVar = this.f3902a;
            C0451n c0451n = C0451n.f3862a;
            aVar.a(C0451n.g(this.f3903b));
        }
    }

    public static final void a(b feature, a callback) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C0454q c0454q = C0454q.f3908a;
        C0454q.h(new d(callback, feature));
    }

    public static final void c(b feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        C2146B.l().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(feature.j(), C2146B.B()).apply();
    }

    public static final b d(String className) {
        boolean s7;
        Intrinsics.checkNotNullParameter(className, "className");
        f3862a.f();
        for (Map.Entry entry : f3863b.entrySet()) {
            b bVar = (b) entry.getKey();
            String[] strArr = (String[]) entry.getValue();
            int length = strArr.length;
            int i7 = 0;
            while (i7 < length) {
                String str = strArr[i7];
                i7++;
                s7 = kotlin.text.r.s(className, str, false, 2, null);
                if (s7) {
                    return bVar;
                }
            }
        }
        return b.Unknown;
    }

    public static final boolean g(b feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        if (b.Unknown == feature) {
            return false;
        }
        if (b.Core == feature) {
            return true;
        }
        String string = C2146B.l().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(feature.j(), null);
        if (string != null && Intrinsics.a(string, C2146B.B())) {
            return false;
        }
        b h7 = feature.h();
        return h7 == feature ? f3862a.e(feature) : g(h7) && f3862a.e(feature);
    }

    public final boolean b(b bVar) {
        switch (c.f3901a[bVar.ordinal()]) {
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
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
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
                return false;
            default:
                return true;
        }
    }

    public final boolean e(b bVar) {
        boolean b7 = b(bVar);
        C0454q c0454q = C0454q.f3908a;
        return C0454q.d(bVar.j(), C2146B.m(), b7);
    }

    public final synchronized void f() {
        Map map = f3863b;
        if (map.isEmpty()) {
            map.put(b.AAM, new String[]{"com.facebook.appevents.aam."});
            map.put(b.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
            map.put(b.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
            map.put(b.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
            map.put(b.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
            map.put(b.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
            map.put(b.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
            map.put(b.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
            map.put(b.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
            map.put(b.ProtectedMode, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
            map.put(b.MACARuleMatching, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
            map.put(b.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
            map.put(b.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
            map.put(b.IapLogging, new String[]{"com.facebook.appevents.iap."});
            map.put(b.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
        }
    }
}
