package N1;

import O1.C0458v;
import O1.I;
import O1.P;
import O1.r;
import V4.c;
import V4.e;
import V4.h;
import Y4.b;
import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import x1.C2146B;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3605a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final String f3606b = a.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f3607c = new HashMap();

    /* renamed from: N1.a$a, reason: collision with other inner class name */
    public static final class C0066a implements NsdManager.RegistrationListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f3608a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f3609b;

        public C0066a(String str, String str2) {
            this.f3608a = str;
            this.f3609b = str2;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(NsdServiceInfo serviceInfo, int i7) {
            Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
            a aVar = a.f3605a;
            a.a(this.f3609b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(NsdServiceInfo NsdServiceInfo) {
            Intrinsics.checkNotNullParameter(NsdServiceInfo, "NsdServiceInfo");
            if (Intrinsics.a(this.f3608a, NsdServiceInfo.getServiceName())) {
                return;
            }
            a aVar = a.f3605a;
            a.a(this.f3609b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(NsdServiceInfo serviceInfo) {
            Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(NsdServiceInfo serviceInfo, int i7) {
            Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
        }
    }

    public static final void a(String str) {
        if (T1.a.d(a.class)) {
            return;
        }
        try {
            f3605a.b(str);
        } catch (Throwable th) {
            T1.a.b(th, a.class);
        }
    }

    public static final Bitmap c(String str) {
        int g7;
        int j7;
        int[] iArr;
        Bitmap createBitmap;
        Bitmap bitmap = null;
        if (T1.a.d(a.class)) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(c.class);
            enumMap.put((EnumMap) c.MARGIN, (c) 2);
            try {
                b a7 = new e().a(str, V4.a.QR_CODE, 200, 200, enumMap);
                g7 = a7.g();
                j7 = a7.j();
                iArr = new int[g7 * j7];
                if (g7 > 0) {
                    int i7 = 0;
                    while (true) {
                        int i8 = i7 + 1;
                        int i9 = i7 * j7;
                        if (j7 > 0) {
                            int i10 = 0;
                            while (true) {
                                int i11 = i10 + 1;
                                iArr[i9 + i10] = a7.f(i10, i7) ? -16777216 : -1;
                                if (i11 >= j7) {
                                    break;
                                }
                                i10 = i11;
                            }
                        }
                        if (i8 >= g7) {
                            break;
                        }
                        i7 = i8;
                    }
                }
                createBitmap = Bitmap.createBitmap(j7, g7, Bitmap.Config.ARGB_8888);
            } catch (h unused) {
            }
            try {
                createBitmap.setPixels(iArr, 0, j7, 0, 0, j7, g7);
                return createBitmap;
            } catch (h unused2) {
                bitmap = createBitmap;
                return bitmap;
            }
        } catch (Throwable th) {
            T1.a.b(th, a.class);
            return null;
        }
    }

    public static final String d(Map map) {
        if (T1.a.d(a.class)) {
            return null;
        }
        if (map == null) {
            try {
                map = new HashMap();
            } catch (Throwable th) {
                T1.a.b(th, a.class);
                return null;
            }
        }
        String DEVICE = Build.DEVICE;
        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
        map.put("device", DEVICE);
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        map.put("model", MODEL);
        String jSONObject = new JSONObject(map).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject(deviceInfo as Map<*, *>).toString()");
        return jSONObject;
    }

    public static final boolean e() {
        if (T1.a.d(a.class)) {
            return false;
        }
        try {
            C0458v c0458v = C0458v.f3949a;
            r f7 = C0458v.f(C2146B.m());
            if (f7 != null) {
                return f7.l().contains(I.Enabled);
            }
            return false;
        } catch (Throwable th) {
            T1.a.b(th, a.class);
            return false;
        }
    }

    public static final boolean f(String str) {
        if (T1.a.d(a.class)) {
            return false;
        }
        try {
            if (e()) {
                return f3605a.g(str);
            }
            return false;
        } catch (Throwable th) {
            T1.a.b(th, a.class);
            return false;
        }
    }

    public final void b(String str) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener) f3607c.get(str);
            if (registrationListener != null) {
                Object systemService = C2146B.l().getSystemService("servicediscovery");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
                }
                try {
                    ((NsdManager) systemService).unregisterService(registrationListener);
                } catch (IllegalArgumentException e7) {
                    P p7 = P.f3756a;
                    P.i0(f3606b, e7);
                }
                f3607c.remove(str);
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final boolean g(String str) {
        String p7;
        if (T1.a.d(this)) {
            return false;
        }
        try {
            HashMap hashMap = f3607c;
            if (hashMap.containsKey(str)) {
                return true;
            }
            p7 = kotlin.text.r.p(C2146B.B(), '.', '|', false, 4, null);
            String str2 = "fbsdk_" + Intrinsics.i("android-", p7) + '_' + ((Object) str);
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = C2146B.l().getSystemService("servicediscovery");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
            }
            C0066a c0066a = new C0066a(str2, str);
            hashMap.put(str, c0066a);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, c0066a);
            return true;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }
}
