package e7;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzeb;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import e7.e3;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import s7.d;

/* loaded from: classes.dex */
public final class k3 extends j0 {
    public final w6 A;
    public boolean B;
    public d4 C;
    public u3 D;
    public y3 E;
    public final d2.q F;

    /* renamed from: d, reason: collision with root package name */
    public i4 f4421d;

    /* renamed from: e, reason: collision with root package name */
    public h3 f4422e;
    public final CopyOnWriteArraySet f;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4423o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicReference<String> f4424p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f4425q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4426r;

    /* renamed from: s, reason: collision with root package name */
    public int f4427s;
    public y3 t;

    /* renamed from: u, reason: collision with root package name */
    public v3 f4428u;

    /* renamed from: v, reason: collision with root package name */
    public PriorityQueue<w5> f4429v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4430w;

    /* renamed from: x, reason: collision with root package name */
    public e3 f4431x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicLong f4432y;

    /* renamed from: z, reason: collision with root package name */
    public long f4433z;

    public k3(j2 j2Var) {
        super(j2Var);
        this.f = new CopyOnWriteArraySet();
        this.f4425q = new Object();
        this.f4426r = false;
        this.f4427s = 1;
        this.B = true;
        this.F = new d2.q(this, 5);
        this.f4424p = new AtomicReference<>();
        this.f4431x = e3.f4165c;
        this.f4433z = -1L;
        this.f4432y = new AtomicLong(0L);
        this.A = new w6(j2Var);
    }

    public static void A(k3 k3Var, e3 e3Var, long j10, boolean z10, boolean z11) {
        boolean z12;
        k3Var.l();
        k3Var.t();
        e3 y10 = k3Var.j().y();
        if (j10 <= k3Var.f4433z && e3.i(y10.f4167b, e3Var.f4167b)) {
            k3Var.zzj().f4065u.c("Dropped out-of-date consent setting, proposed settings", e3Var);
            return;
        }
        l1 j11 = k3Var.j();
        j11.l();
        int i10 = e3Var.f4167b;
        if (j11.q(i10)) {
            SharedPreferences.Editor edit = j11.v().edit();
            edit.putString("consent_settings", e3Var.n());
            edit.putInt("consent_source", i10);
            edit.apply();
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            k3Var.zzj().f4065u.c("Lower precedence consent source ignored, proposed source", Integer.valueOf(e3Var.f4167b));
            return;
        }
        k3Var.zzj().f4067w.c("Setting storage consent(FE)", e3Var);
        k3Var.f4433z = j10;
        if (k3Var.q().E()) {
            w4 q10 = k3Var.q();
            q10.l();
            q10.t();
            q10.x(new i6.r(q10, 3));
        } else {
            k3Var.q().z(z10);
        }
        if (z11) {
            k3Var.q().y(new AtomicReference<>());
        }
    }

    public final void B(Boolean bool, boolean z10) {
        l();
        t();
        zzj().f4066v.c("Setting app measurement enabled (FE)", bool);
        j().p(bool);
        if (z10) {
            l1 j10 = j();
            j10.l();
            SharedPreferences.Editor edit = j10.v().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        j2 j2Var = (j2) this.f3407b;
        j2Var.zzl().l();
        if (j2Var.M || !(bool == null || bool.booleanValue())) {
            O();
        }
    }

    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v6 */
    public final void C(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        ?? r14;
        boolean b10;
        long j11;
        String str4;
        String str5;
        boolean w10;
        Bundle[] bundleArr;
        Object[] objArr;
        boolean z13;
        int length;
        boolean z14;
        m6.j.e(str);
        m6.j.i(bundle);
        l();
        t();
        if (!((j2) this.f3407b).d()) {
            zzj().f4066v.b("Event not sent since app measurement is disabled");
            return;
        }
        List<String> list = m().f4661s;
        if (list != null && !list.contains(str2)) {
            zzj().f4066v.d("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.f4423o) {
            this.f4423o = true;
            try {
                try {
                    (!((j2) this.f3407b).f4364e ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zza().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, zza());
                } catch (Exception e10) {
                    zzj().f4063r.c("Failed to invoke Tag Manager's initialize() method", e10);
                }
            } catch (ClassNotFoundException unused) {
                zzj().f4065u.b("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            ((b.z) zzb()).getClass();
            r14 = 1;
            F("auto", "_lgclid", string, System.currentTimeMillis());
        } else {
            r14 = 1;
        }
        if (z10) {
            String[] strArr = r6.f4625s;
            int i10 = 0;
            while (true) {
                if (i10 >= r14) {
                    z14 = r14;
                    break;
                } else {
                    if (strArr[i10].equals(str2)) {
                        z14 = false;
                        break;
                    }
                    i10++;
                }
            }
            if (z14) {
                k().D(bundle, j().I.a());
            }
        }
        if (!z12 && !"_iap".equals(str2)) {
            r6 m10 = ((j2) this.f3407b).m();
            int i11 = 2;
            if (m10.n0("event", str2)) {
                if (!m10.Z("event", b.a0.f1561b, b.a0.f1563c, str2)) {
                    i11 = 13;
                } else if (m10.Q(40, "event", str2)) {
                    i11 = 0;
                }
            }
            if (i11 != 0) {
                zzj().f4062q.c("Invalid public event name. Event will not be logged (FE)", i().c(str2));
                ((j2) this.f3407b).m();
                String A = r6.A(str2, 40, r14);
                length = str2 != null ? str2.length() : 0;
                ((j2) this.f3407b).m();
                r6.M(this.F, null, i11, "_ev", A, length);
                return;
            }
        }
        q4 v10 = p().v(false);
        if (v10 != null && !bundle.containsKey("_sc")) {
            v10.f4592d = r14;
        }
        r6.L(v10, bundle, (!z10 || z12) ? false : r14);
        boolean equals = "am".equals(str);
        boolean r02 = r6.r0(str2);
        if (z10 && this.f4422e != null && !r02 && !equals) {
            zzj().f4066v.d("Passing event to registered event handler (FE)", i().c(str2), i().a(bundle));
            m6.j.i(this.f4422e);
            ((AppMeasurementDynamiteService.a) this.f4422e).a(str, str2, bundle, j10);
            return;
        }
        if (((j2) this.f3407b).e()) {
            int q10 = k().q(str2);
            if (q10 != 0) {
                zzj().f4062q.c("Invalid event name. Event will not be logged (FE)", i().c(str2));
                k();
                String A2 = r6.A(str2, 40, r14);
                length = str2 != null ? str2.length() : 0;
                ((j2) this.f3407b).m();
                r6.M(this.F, str3, q10, "_ev", A2, length);
                return;
            }
            Bundle w11 = k().w(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z12);
            m6.j.i(w11);
            if (p().v(false) != null && Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str2)) {
                t5 t5Var = r().f4596o;
                ((b.z) t5Var.f4681d.zzb()).getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j12 = elapsedRealtime - t5Var.f4679b;
                t5Var.f4679b = elapsedRealtime;
                if (j12 > 0) {
                    k().C(w11, j12);
                }
            }
            if (!"auto".equals(str) && "_ssr".equals(str2)) {
                r6 k10 = k();
                String string2 = w11.getString("_ffr");
                if (v6.g.b(string2)) {
                    string2 = null;
                } else if (string2 != null) {
                    string2 = string2.trim();
                }
                if (Objects.equals(string2, k10.j().F.a())) {
                    k10.zzj().f4066v.b("Not logging duplicate session_start_with_rollout event");
                    z13 = false;
                } else {
                    k10.j().F.b(string2);
                    z13 = true;
                }
                if (!z13) {
                    return;
                }
            } else if (Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str2)) {
                String a10 = k().j().F.a();
                if (!TextUtils.isEmpty(a10)) {
                    w11.putString("_ffr", a10);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(w11);
            if (h().x(null, h0.W0)) {
                q5 r10 = r();
                r10.l();
                b10 = r10.f4595e;
            } else {
                b10 = j().C.b();
            }
            if (j().f4466z.a() > 0 && j().r(j10) && b10) {
                zzj().f4067w.b("Current session is expired, remove the session number, ID, and engagement time");
                ((b.z) zzb()).getClass();
                j11 = 0;
                F("auto", "_sid", null, System.currentTimeMillis());
                ((b.z) zzb()).getClass();
                F("auto", "_sno", null, System.currentTimeMillis());
                ((b.z) zzb()).getClass();
                F("auto", "_se", null, System.currentTimeMillis());
                j().A.b(0L);
            } else {
                j11 = 0;
            }
            if (w11.getLong("extend_session", j11) == 1) {
                zzj().f4067w.b("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                j2 j2Var = (j2) this.f3407b;
                j2.b(j2Var.f4369s);
                j2Var.f4369s.f.b(j10, true);
            }
            ArrayList arrayList2 = new ArrayList(w11.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                String str6 = (String) obj;
                if (str6 != null) {
                    k();
                    Object obj2 = w11.get(str6);
                    if (obj2 instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj2};
                    } else {
                        if (obj2 instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj2;
                            objArr = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj2 instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj2;
                            objArr = arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        bundleArr = (Bundle[]) objArr;
                    }
                    if (bundleArr != null) {
                        w11.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i13 = 0;
            while (i13 < arrayList.size()) {
                Bundle bundle2 = (Bundle) arrayList.get(i13);
                if (i13 != 0) {
                    str5 = "_ep";
                    str4 = str;
                } else {
                    str4 = str;
                    str5 = str2;
                }
                bundle2.putString("_o", str4);
                if (z11) {
                    bundle2 = k().v(bundle2);
                }
                Bundle bundle3 = bundle2;
                f0 f0Var = new f0(str5, new a0(bundle3), str, j10);
                w4 q11 = q();
                q11.getClass();
                q11.l();
                q11.t();
                w0 n2 = q11.n();
                n2.getClass();
                Parcel obtain = Parcel.obtain();
                f0Var.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                if (marshall.length > 131072) {
                    n2.zzj().f4061p.b("Event is too long for local database. Sending event directly to service");
                    w10 = false;
                } else {
                    w10 = n2.w(marshall, 0);
                }
                q11.x(new e5(q11, q11.I(true), w10, f0Var, str3));
                if (!equals) {
                    Iterator it = this.f.iterator();
                    while (it.hasNext()) {
                        ((j3) it.next()).a(str, str2, new Bundle(bundle3), j10);
                    }
                }
                i13++;
            }
            if (p().v(false) == null || !Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str2)) {
                return;
            }
            q5 r11 = r();
            ((b.z) zzb()).getClass();
            r11.f4596o.a(SystemClock.elapsedRealtime(), true, true);
        }
    }

    public final void D(String str, String str2, Bundle bundle, long j10) {
        l();
        C(str, str2, j10, bundle, true, this.f4422e == null || r6.r0(str2), true, null);
    }

    public final void E(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        String str3;
        b1 b1Var;
        String str4;
        b1 b1Var2;
        String str5;
        Integer valueOf;
        String str6 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!Objects.equals(str2, "screen_view")) {
            boolean z12 = !z11 || this.f4422e == null || r6.r0(str2);
            Bundle bundle3 = new Bundle(bundle2);
            for (String str7 : bundle3.keySet()) {
                Object obj = bundle3.get(str7);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str7, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i10 = 0; i10 < parcelableArr.length; i10++) {
                        if (parcelableArr[i10] instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelableArr[i10]);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        Object obj2 = list.get(i11);
                        if (obj2 instanceof Bundle) {
                            list.set(i11, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            zzl().u(new b4(this, str6, str2, j10, bundle3, z11, z12, z10));
            return;
        }
        s4 p10 = p();
        synchronized (p10.f4647u) {
            if (p10.t) {
                String string = bundle2.getString("screen_name");
                if (string == null || (string.length() > 0 && string.length() <= p10.h().n(null, false))) {
                    String string2 = bundle2.getString("screen_class");
                    if (string2 == null || (string2.length() > 0 && string2.length() <= p10.h().n(null, false))) {
                        if (string2 == null) {
                            zzeb zzebVar = p10.f4643p;
                            str3 = zzebVar != null ? p10.b(zzebVar.zzb, "Activity") : "Activity";
                        } else {
                            str3 = string2;
                        }
                        q4 q4Var = p10.f4640d;
                        if (p10.f4644q && q4Var != null) {
                            p10.f4644q = false;
                            boolean equals = Objects.equals(q4Var.f4590b, str3);
                            boolean equals2 = Objects.equals(q4Var.f4589a, string);
                            if (equals && equals2) {
                                b1Var = p10.zzj().t;
                                str4 = "Ignoring call to log screen view event with duplicate parameters.";
                            }
                        }
                        p10.zzj().f4067w.d("Logging screen view with name, class", string == null ? "null" : string, str3 == null ? "null" : str3);
                        q4 q4Var2 = p10.f4640d == null ? p10.f4641e : p10.f4640d;
                        q4 q4Var3 = new q4(string, str3, p10.k().y0(), true, j10);
                        p10.f4640d = q4Var3;
                        p10.f4641e = q4Var2;
                        p10.f4645r = q4Var3;
                        ((b.z) p10.zzb()).getClass();
                        p10.zzl().u(new r4(p10, bundle2, q4Var3, q4Var2, SystemClock.elapsedRealtime()));
                        return;
                    }
                    b1Var2 = p10.zzj().t;
                    str5 = "Invalid screen class length for screen view. Length";
                    valueOf = Integer.valueOf(string2.length());
                } else {
                    b1Var2 = p10.zzj().t;
                    str5 = "Invalid screen name length for screen view. Length";
                    valueOf = Integer.valueOf(string.length());
                }
                b1Var2.c(str5, valueOf);
            }
            b1Var = p10.zzj().t;
            str4 = "Cannot log screen view event when the app is in the background.";
            b1Var.b(str4);
        }
    }

    public final void F(String str, String str2, Object obj, long j10) {
        m6.j.e(str);
        m6.j.e(str2);
        l();
        t();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    Long valueOf = Long.valueOf("false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 1L : 0L);
                    j().f4463w.b(valueOf.longValue() == 1 ? "true" : "false");
                    obj = valueOf;
                    str2 = "_npa";
                    zzj().f4067w.d("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
                }
            }
            if (obj == null) {
                j().f4463w.b("unset");
                str2 = "_npa";
            }
            zzj().f4067w.d("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
        }
        String str4 = str2;
        Object obj2 = obj;
        if (!((j2) this.f3407b).d()) {
            zzj().f4067w.b("User property not set since app measurement is disabled");
            return;
        }
        if (((j2) this.f3407b).e()) {
            q6 q6Var = new q6(str4, str, j10, obj2);
            w4 q10 = q();
            q10.l();
            q10.t();
            w0 n2 = q10.n();
            n2.getClass();
            Parcel obtain = Parcel.obtain();
            boolean z10 = false;
            q6Var.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            if (marshall.length > 131072) {
                n2.zzj().f4061p.b("User property too long for local database. Sending directly to service");
            } else {
                z10 = n2.w(marshall, 1);
            }
            q10.x(new b5(q10, q10.I(true), z10, q6Var));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(java.lang.String r10, java.lang.String r11, java.lang.Object r12, boolean r13, long r14) {
        /*
            r9 = this;
            if (r10 != 0) goto L4
            java.lang.String r10 = "app"
        L4:
            r2 = r10
            r10 = 6
            r0 = 0
            r1 = 24
            if (r13 == 0) goto L15
            e7.r6 r10 = r9.k()
            int r10 = r10.e0(r11)
        L13:
            r5 = r10
            goto L36
        L15:
            e7.r6 r13 = r9.k()
            java.lang.String r3 = "user property"
            boolean r4 = r13.n0(r3, r11)
            if (r4 != 0) goto L22
            goto L34
        L22:
            java.lang.String[] r4 = p2.m0.f12889a
            r5 = 0
            boolean r4 = r13.Z(r3, r4, r5, r11)
            if (r4 != 0) goto L2e
            r10 = 15
            goto L13
        L2e:
            boolean r13 = r13.Q(r1, r3, r11)
            if (r13 != 0) goto L35
        L34:
            goto L13
        L35:
            r5 = r0
        L36:
            java.lang.String r13 = "_ev"
            r10 = 1
            if (r5 == 0) goto L58
            r9.k()
            java.lang.String r7 = e7.r6.A(r11, r1, r10)
            if (r11 == 0) goto L48
            int r0 = r11.length()
        L48:
            r8 = r0
            java.lang.Object r10 = r9.f3407b
            e7.j2 r10 = (e7.j2) r10
            r10.m()
            d2.q r3 = r9.F
            r4 = 0
            r6 = r13
            e7.r6.M(r3, r4, r5, r6, r7, r8)
            return
        L58:
            if (r12 == 0) goto La6
            e7.r6 r3 = r9.k()
            int r3 = r3.p(r12, r11)
            if (r3 == 0) goto L8b
            r9.k()
            java.lang.String r14 = e7.r6.A(r11, r1, r10)
            boolean r10 = r12 instanceof java.lang.String
            if (r10 != 0) goto L73
            boolean r10 = r12 instanceof java.lang.CharSequence
            if (r10 == 0) goto L7b
        L73:
            java.lang.String r10 = java.lang.String.valueOf(r12)
            int r0 = r10.length()
        L7b:
            r15 = r0
            java.lang.Object r10 = r9.f3407b
            e7.j2 r10 = (e7.j2) r10
            r10.m()
            d2.q r10 = r9.F
            r11 = 0
            r12 = r3
            e7.r6.M(r10, r11, r12, r13, r14, r15)
            return
        L8b:
            e7.r6 r10 = r9.k()
            java.lang.Object r4 = r10.l0(r12, r11)
            if (r4 == 0) goto La5
            e7.e2 r10 = r9.zzl()
            e7.c4 r12 = new e7.c4
            r0 = r12
            r1 = r9
            r3 = r11
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r10.u(r12)
        La5:
            return
        La6:
            r4 = 0
            e7.e2 r10 = r9.zzl()
            e7.c4 r12 = new e7.c4
            r0 = r12
            r1 = r9
            r3 = r11
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r10.u(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.k3.G(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    public final void H(String str, String str2, String str3, boolean z10) {
        ((b.z) zzb()).getClass();
        G(str, str2, str3, z10, System.currentTimeMillis());
    }

    public final PriorityQueue<w5> I() {
        if (this.f4429v == null) {
            this.f4429v = new PriorityQueue<>(Comparator.comparing(new Function() { // from class: e7.l3
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((w5) obj).f4741b);
                }
            }, new g6.e(1)));
        }
        return this.f4429v;
    }

    public final void J() {
        l();
        t();
        if (((j2) this.f3407b).e()) {
            Boolean v10 = h().v("google_analytics_deferred_deep_link_enabled");
            int i10 = 0;
            if (v10 != null && v10.booleanValue()) {
                zzj().f4066v.b("Deferred Deep Link feature enabled.");
                zzl().u(new r3(this, i10));
            }
            w4 q10 = q();
            q10.l();
            q10.t();
            k6 I = q10.I(true);
            q10.n().w(new byte[0], 3);
            q10.x(new s2(3, q10, I));
            this.B = false;
            l1 j10 = j();
            j10.l();
            String string = j10.v().getString("previous_os_version", null);
            ((j2) j10.f3407b).g().m();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = j10.v().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            ((j2) this.f3407b).g().m();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            Q("auto", "_ou", bundle);
        }
    }

    public final void K() {
        if (!(zza().getApplicationContext() instanceof Application) || this.f4421d == null) {
            return;
        }
        ((Application) zza().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f4421d);
    }

    public final void L() {
        b1 b1Var;
        String str;
        if (zzoy.zza() && h().x(null, h0.R0)) {
            if (zzl().w()) {
                b1Var = zzj().f4060o;
                str = "Cannot get trigger URIs from analytics worker thread";
            } else if (nc.g0.d()) {
                b1Var = zzj().f4060o;
                str = "Cannot get trigger URIs from main thread";
            } else {
                t();
                zzj().f4067w.b("Getting trigger URIs (FE)");
                AtomicReference atomicReference = new AtomicReference();
                zzl().q(atomicReference, 10000L, "get trigger URIs", new m3(this, atomicReference, 0));
                List list = (List) atomicReference.get();
                if (list != null) {
                    zzl().u(new s2(this, list));
                    return;
                } else {
                    b1Var = zzj().f4060o;
                    str = "Timed out waiting for get trigger URIs";
                }
            }
            b1Var.b(str);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:43|(1:126)|49|(4:89|90|(1:92)|(2:95|(29:97|(3:99|(1:101)(1:103)|102)|104|(3:106|(1:112)(1:110)|111)|113|(1:124)(3:117|(1:123)|121)|122|52|(1:54)|55|56|57|(15:59|60|(1:85)(1:64)|65|66|(8:68|(1:81)(1:71)|72|(1:74)|75|(1:77)|78|79)|83|(0)|81|72|(0)|75|(0)|78|79)|87|60|(1:62)|85|65|66|(0)|83|(0)|81|72|(0)|75|(0)|78|79)))|51|52|(0)|55|56|57|(0)|87|60|(0)|85|65|66|(0)|83|(0)|81|72|(0)|75|(0)|78|79) */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cc A[Catch: NumberFormatException -> 0x01d1, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x01d1, blocks: (B:57:0x01be, B:59:0x01cc), top: B:56:0x01be }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0202 A[Catch: NumberFormatException -> 0x0207, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0207, blocks: (B:66:0x01f4, B:68:0x0202), top: B:65:0x01f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M() {
        /*
            Method dump skipped, instructions count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.k3.M():void");
    }

    public final void N() {
        w5 poll;
        l1.a z02;
        l();
        this.f4430w = false;
        if (I().isEmpty() || this.f4426r || (poll = I().poll()) == null || (z02 = k().z0()) == null) {
            return;
        }
        this.f4426r = true;
        zzj().f4067w.c("Registering trigger URI", poll.f4740a);
        s7.e<rb.h> b10 = z02.b(Uri.parse(poll.f4740a));
        if (b10 != null) {
            b10.f(new d.a(b10, new r4.c(this, poll, 2)), new w3(this));
        } else {
            this.f4426r = false;
            I().add(poll);
        }
    }

    public final void O() {
        Long valueOf;
        l();
        String a10 = j().f4463w.a();
        if (a10 != null) {
            if ("unset".equals(a10)) {
                valueOf = null;
                ((b.z) zzb()).getClass();
            } else {
                valueOf = Long.valueOf("true".equals(a10) ? 1L : 0L);
                ((b.z) zzb()).getClass();
            }
            F("app", "_npa", valueOf, System.currentTimeMillis());
        }
        if (((j2) this.f3407b).d() && this.B) {
            zzj().f4066v.b("Recording app launch after enabling measurement for the first time (FE)");
            J();
            r().f.a();
            zzl().u(new a4(this, 0));
            return;
        }
        zzj().f4066v.b("Updating Scion state (FE)");
        w4 q10 = q();
        q10.l();
        q10.t();
        q10.x(new d5(q10, q10.I(true), 1));
    }

    public final void P(String str) {
        this.f4424p.set(str);
    }

    public final void Q(String str, String str2, Bundle bundle) {
        l();
        ((b.z) zzb()).getClass();
        D(str, str2, bundle, System.currentTimeMillis());
    }

    @Override // d2.q, e7.t6
    public final void a(String str, String str2, Bundle bundle) {
        ((b.z) zzb()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        m6.j.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        zzl().u(new i6.t(1, this, bundle2));
    }

    @Override // e7.j0
    public final boolean s() {
        return false;
    }

    public final void v(Bundle bundle, int i10, long j10) {
        Object obj;
        String string;
        t();
        e3 e3Var = e3.f4165c;
        e3.a[] aVarArr = f3.STORAGE.f4199a;
        int length = aVarArr.length;
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= length) {
                break;
            }
            e3.a aVar = aVarArr[i11];
            if (bundle.containsKey(aVar.f4172a) && (string = bundle.getString(aVar.f4172a)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i11++;
        }
        if (obj != null) {
            zzj().t.c("Ignoring invalid consent setting", obj);
            zzj().t.b("Valid consent values are 'granted', 'denied'");
        }
        boolean w10 = zzl().w();
        e3 b10 = e3.b(i10, bundle);
        if (b10.q()) {
            z(b10, w10);
        }
        x a10 = x.a(i10, bundle);
        if (a10.e()) {
            x(a10, w10);
        }
        Boolean c10 = x.c(bundle);
        if (c10 != null) {
            String str = i10 == -30 ? "tcf" : "app";
            String bool = c10.toString();
            if (w10) {
                F(str, "allow_personalized_ads", bool, j10);
            } else {
                G(str, "allow_personalized_ads", bool, false, j10);
            }
        }
    }

    public final void w(Bundle bundle, long j10) {
        m6.j.i(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            zzj().f4063r.b("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        p2.m0.i0(bundle2, "app_id", String.class, null);
        p2.m0.i0(bundle2, "origin", String.class, null);
        p2.m0.i0(bundle2, "name", String.class, null);
        p2.m0.i0(bundle2, "value", Object.class, null);
        p2.m0.i0(bundle2, "trigger_event_name", String.class, null);
        p2.m0.i0(bundle2, "trigger_timeout", Long.class, 0L);
        p2.m0.i0(bundle2, "timed_out_event_name", String.class, null);
        p2.m0.i0(bundle2, "timed_out_event_params", Bundle.class, null);
        p2.m0.i0(bundle2, "triggered_event_name", String.class, null);
        p2.m0.i0(bundle2, "triggered_event_params", Bundle.class, null);
        p2.m0.i0(bundle2, "time_to_live", Long.class, 0L);
        p2.m0.i0(bundle2, "expired_event_name", String.class, null);
        p2.m0.i0(bundle2, "expired_event_params", Bundle.class, null);
        m6.j.e(bundle2.getString("name"));
        m6.j.e(bundle2.getString("origin"));
        m6.j.i(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (k().e0(string) != 0) {
            zzj().f4060o.c("Invalid conditional user property name", i().g(string));
            return;
        }
        if (k().p(obj, string) != 0) {
            zzj().f4060o.d("Invalid conditional user property value", i().g(string), obj);
            return;
        }
        Object l02 = k().l0(obj, string);
        if (l02 == null) {
            zzj().f4060o.d("Unable to normalize conditional user property value", i().g(string), obj);
            return;
        }
        p2.m0.j0(bundle2, l02);
        long j11 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j11 > 15552000000L || j11 < 1)) {
            zzj().f4060o.d("Invalid conditional user property timeout", i().g(string), Long.valueOf(j11));
            return;
        }
        long j12 = bundle2.getLong("time_to_live");
        if (j12 > 15552000000L || j12 < 1) {
            zzj().f4060o.d("Invalid conditional user property time to live", i().g(string), Long.valueOf(j12));
        } else {
            zzl().u(new o3(this, bundle2, 1));
        }
    }

    public final void x(x xVar, boolean z10) {
        i6.t tVar = new i6.t(2, this, xVar);
        if (!z10) {
            zzl().u(tVar);
        } else {
            l();
            tVar.run();
        }
    }

    public final void y(e3 e3Var) {
        l();
        boolean z10 = (e3Var.p() && e3Var.o()) || q().D();
        j2 j2Var = (j2) this.f3407b;
        j2Var.zzl().l();
        if (z10 != j2Var.M) {
            j2 j2Var2 = (j2) this.f3407b;
            j2Var2.zzl().l();
            j2Var2.M = z10;
            l1 j10 = j();
            j10.l();
            Boolean valueOf = j10.v().contains("measurement_enabled_from_api") ? Boolean.valueOf(j10.v().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || valueOf == null || valueOf.booleanValue()) {
                B(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void z(e3 e3Var, boolean z10) {
        boolean z11;
        e3 e3Var2;
        boolean z12;
        boolean z13;
        g3 g3Var = g3.UNINITIALIZED;
        t();
        int i10 = e3Var.f4167b;
        if (i10 != -10) {
            g3 g3Var2 = e3Var.f4166a.get(e3.a.AD_STORAGE);
            if (g3Var2 == null) {
                g3Var2 = g3Var;
            }
            if (g3Var2 == g3Var) {
                g3 g3Var3 = e3Var.f4166a.get(e3.a.ANALYTICS_STORAGE);
                if (g3Var3 == null) {
                    g3Var3 = g3Var;
                }
                if (g3Var3 == g3Var) {
                    zzj().t.b("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.f4425q) {
            z11 = false;
            if (e3.i(i10, this.f4431x.f4167b)) {
                e3 e3Var3 = this.f4431x;
                e3.a[] aVarArr = (e3.a[]) e3Var.f4166a.keySet().toArray(new e3.a[0]);
                int length = aVarArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z12 = false;
                        break;
                    }
                    e3.a aVar = aVarArr[i11];
                    g3 g3Var4 = e3Var.f4166a.get(aVar);
                    g3 g3Var5 = e3Var3.f4166a.get(aVar);
                    g3 g3Var6 = g3.DENIED;
                    if (g3Var4 == g3Var6 && g3Var5 != g3Var6) {
                        z12 = true;
                        break;
                    }
                    i11++;
                }
                if (e3Var.p() && !this.f4431x.p()) {
                    z11 = true;
                }
                e3 k10 = e3Var.k(this.f4431x);
                this.f4431x = k10;
                z13 = z11;
                z11 = true;
                e3Var2 = k10;
            } else {
                e3Var2 = e3Var;
                z12 = false;
                z13 = false;
            }
        }
        if (!z11) {
            zzj().f4065u.c("Ignoring lower-priority consent settings, proposed settings", e3Var2);
            return;
        }
        long andIncrement = this.f4432y.getAndIncrement();
        if (z12) {
            P(null);
            h4 h4Var = new h4(this, e3Var2, andIncrement, z13);
            if (!z10) {
                zzl().v(h4Var);
                return;
            } else {
                l();
                h4Var.run();
                return;
            }
        }
        g4 g4Var = new g4(this, e3Var2, andIncrement, z13);
        if (z10) {
            l();
            g4Var.run();
        } else if (i10 == 30 || i10 == -10) {
            zzl().v(g4Var);
        } else {
            zzl().u(g4Var);
        }
    }
}
