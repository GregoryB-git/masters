package x6;

import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaFormat;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import b.a0;
import b8.h0;
import b8.l0;
import b8.x;
import com.google.android.gms.internal.p002firebaseauthapi.zzagz;
import com.google.android.gms.internal.p002firebaseauthapi.zzaia;
import d2.a;
import d2.i0;
import d2.z;
import dc.p;
import defpackage.g;
import ec.i;
import ec.v;
import f5.f;
import gb.q1;
import gb.w2;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.firebase.crashlytics.FlutterError;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import l3.l;
import m6.j;
import nc.c1;
import nc.c2;
import nc.d0;
import nc.g0;
import nc.g2;
import nc.k0;
import nc.o0;
import nc.q0;
import nc.r0;
import nc.r1;
import nc.u;
import nc.x0;
import nc.y;
import nc.z1;
import p2.m0;
import r0.d;
import rc.s;
import sc.w;
import ub.e;
import ub.f;
import ub.h;
import v3.a1;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static Context f17191a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f17192b;

    /* renamed from: c, reason: collision with root package name */
    public static g0 f17193c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f17194d = new b();

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f17195e;
    public static Boolean f;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f17196g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f17197h;

    public /* synthetic */ b() {
    }

    public /* synthetic */ b(f fVar) {
        new f5.d(fVar.f5428a, fVar.f5429b, fVar.f5412e, fVar.f, fVar.f5413g, fVar.f5414h, fVar.f5415i, fVar.f5416j, fVar.f5417k, fVar.f5430c, fVar.f5418l, fVar.f5419m);
    }

    public static void A(pa.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
    }

    public static final Object A0(h hVar, Object obj, Object obj2, p pVar, e eVar) {
        Object c10 = w.c(hVar, obj2);
        try {
            s sVar = new s(eVar, hVar);
            v.a(2, pVar);
            Object invoke = pVar.invoke(obj, sVar);
            w.a(hVar, c10);
            if (invoke == vb.a.f16085a) {
                i.e(eVar, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            w.a(hVar, c10);
            throw th;
        }
    }

    public static void B(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void B0(StringBuilder sb2, HashMap hashMap) {
        sb2.append("{");
        boolean z10 = true;
        for (String str : hashMap.keySet()) {
            if (!z10) {
                sb2.append(",");
            }
            String str2 = (String) hashMap.get(str);
            sb2.append("\"");
            sb2.append(str);
            sb2.append("\":");
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\"");
            }
            z10 = false;
        }
        sb2.append("}");
    }

    public static final void C(int i10) {
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(defpackage.f.h("Expected positive parallelism level, but got ", i10).toString());
        }
    }

    public static void C0(ByteArrayOutputStream byteArrayOutputStream, long j10, int i10) {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j10 >> (i11 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void D(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(i(i10, i11, "index"));
        }
    }

    public static void D0(ByteArrayOutputStream byteArrayOutputStream, int i10) {
        C0(byteArrayOutputStream, i10, 2);
    }

    public static void E(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? i(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? i(i11, i12, "end index") : m0.X("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    public static int E0(int i10) {
        int[] iArr = {1, 2, 3};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == i10) {
                return i12;
            }
        }
        return 1;
    }

    public static int F(Context context, String str) {
        int c10;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d10 = u.h.d(str);
        if (d10 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if (!(Process.myUid() == myUid && Objects.equals(context.getPackageName(), packageName))) {
                c10 = u.h.c((AppOpsManager) u.h.a(context, AppOpsManager.class), d10, packageName);
            } else if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager c11 = u.i.c(context);
                c10 = u.i.a(c11, d10, Binder.getCallingUid(), packageName);
                if (c10 == 0) {
                    c10 = u.i.a(c11, d10, myUid, u.i.b(context));
                }
            } else {
                c10 = u.h.c((AppOpsManager) u.h.a(context, AppOpsManager.class), d10, packageName);
            }
            if (c10 != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static x F0(zzagz zzagzVar) {
        if (zzagzVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzagzVar.zze())) {
            String zzd = zzagzVar.zzd();
            String zzc = zzagzVar.zzc();
            long zza = zzagzVar.zza();
            String zze = zzagzVar.zze();
            j.e(zze);
            return new h0(zza, zzd, zzc, zze);
        }
        if (zzagzVar.zzb() == null) {
            return null;
        }
        String zzd2 = zzagzVar.zzd();
        String zzc2 = zzagzVar.zzc();
        long zza2 = zzagzVar.zza();
        zzaia zzb = zzagzVar.zzb();
        j.j(zzb, "totpInfo cannot be null.");
        return new l0(zzd2, zzc2, zza2, zzb);
    }

    public static void G(Object obj, String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(m0.X(str, obj));
        }
    }

    public static ArrayList G0(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x F0 = F0((zzagz) it.next());
            if (F0 != null) {
                arrayList.add(F0);
            }
        }
        return arrayList;
    }

    public static void H(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void I(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void J(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void K(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static final void L(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                e(th, th2);
            }
        }
    }

    public static byte[] M(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static final long N(InputStream inputStream, OutputStream outputStream, int i10) {
        byte[] bArr = new byte[i10];
        int read = inputStream.read(bArr);
        long j10 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j10 += read;
            read = inputStream.read(bArr);
        }
        return j10;
    }

    public static q1 O() {
        return w2.f6885e == null ? new w2() : new b1.v(8);
    }

    public static l P(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new l(new j7.h(context));
    }

    public static boolean Q(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean R(String str, String str2) {
        char c10;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length != str2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) != str2.charAt(i10) && ((c10 = (char) ((r4 | ' ') - 97)) >= 26 || c10 != ((char) ((r5 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static void S(String str, Exception exc, Object... objArr) {
        StringBuilder l10 = defpackage.f.l("INTERNAL ASSERTION FAILED: ");
        l10.append(String.format(str, objArr));
        AssertionError assertionError = new AssertionError(l10.toString());
        assertionError.initCause(exc);
        throw assertionError;
    }

    public static void T(String str, Object... objArr) {
        StringBuilder l10 = defpackage.f.l("INTERNAL ASSERTION FAILED: ");
        l10.append(String.format(str, objArr));
        throw new AssertionError(l10.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, d2.h0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object U(qc.e r4, ub.e r5) {
        /*
            boolean r0 = r5 instanceof qc.n
            if (r0 == 0) goto L13
            r0 = r5
            qc.n r0 = (qc.n) r0
            int r1 = r0.f13441d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13441d = r1
            goto L18
        L13:
            qc.n r0 = new qc.n
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13440c
            vb.a r1 = vb.a.f16085a
            int r2 = r0.f13441d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            qc.m r4 = r0.f13439b
            ec.s r0 = r0.f13438a
            rb.f.b(r5)     // Catch: rc.a -> L2b
            goto L5d
        L2b:
            r5 = move-exception
            goto L59
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            rb.f.b(r5)
            ec.s r5 = new ec.s
            r5.<init>()
            d2.h0 r2 = eb.y.f5255b
            r5.f5272a = r2
            qc.m r2 = new qc.m
            r2.<init>(r5)
            r0.f13438a = r5     // Catch: rc.a -> L55
            r0.f13439b = r2     // Catch: rc.a -> L55
            r0.f13441d = r3     // Catch: rc.a -> L55
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: rc.a -> L55
            if (r4 != r1) goto L53
            goto L63
        L53:
            r0 = r5
            goto L5d
        L55:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L59:
            qc.f<?> r1 = r5.f13852a
            if (r1 != r4) goto L6c
        L5d:
            T r1 = r0.f5272a
            d2.h0 r4 = eb.y.f5255b
            if (r1 == r4) goto L64
        L63:
            return r1
        L64:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        L6c:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.b.U(qc.e, ub.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object V(qc.e r4, ub.e r5) {
        /*
            boolean r0 = r5 instanceof qc.p
            if (r0 == 0) goto L13
            r0 = r5
            qc.p r0 = (qc.p) r0
            int r1 = r0.f13446d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13446d = r1
            goto L18
        L13:
            qc.p r0 = new qc.p
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13445c
            vb.a r1 = vb.a.f16085a
            int r2 = r0.f13446d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            qc.o r4 = r0.f13444b
            ec.s r0 = r0.f13443a
            rb.f.b(r5)     // Catch: rc.a -> L2b
            goto L59
        L2b:
            r5 = move-exception
            goto L55
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            rb.f.b(r5)
            ec.s r5 = new ec.s
            r5.<init>()
            qc.o r2 = new qc.o
            r2.<init>(r5)
            r0.f13443a = r5     // Catch: rc.a -> L51
            r0.f13444b = r2     // Catch: rc.a -> L51
            r0.f13446d = r3     // Catch: rc.a -> L51
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: rc.a -> L51
            if (r4 != r1) goto L4f
            goto L5b
        L4f:
            r0 = r5
            goto L59
        L51:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L55:
            qc.f<?> r1 = r5.f13852a
            if (r1 != r4) goto L5c
        L59:
            T r1 = r0.f5272a
        L5b:
            return r1
        L5c:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.b.V(qc.e, ub.e):java.lang.Object");
    }

    public static final c1 W(Executor executor) {
        if (executor instanceof q0) {
        }
        return new c1(executor);
    }

    public static Drawable X(Context context, int i10) {
        return l.q0.d().f(context, i10);
    }

    public static HashMap Y(m.e eVar) {
        String str = (String) eVar.c("sql");
        Collection collection = (List) eVar.c("arguments");
        if (collection == null) {
            collection = new ArrayList();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sql", str);
        hashMap.put("arguments", collection);
        return hashMap;
    }

    public static void Z(String str, boolean z10, Object... objArr) {
        if (z10) {
            return;
        }
        T(str, objArr);
        throw null;
    }

    public static final boolean a(Object[] objArr, int i10, int i11, List list) {
        if (i11 != list.size()) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!i.a(objArr[i10 + i12], list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    public static void a0(Object obj, String str, Object... objArr) {
        if (obj != null) {
            return;
        }
        T(str, objArr);
        throw null;
    }

    public static final String b(Object[] objArr, int i10, int i11, Collection collection) {
        StringBuilder sb2 = new StringBuilder((i11 * 3) + 2);
        sb2.append("[");
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i10 + i12];
            if (obj == collection) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        i.d(sb3, "toString(...)");
        return sb3;
    }

    public static int b0(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static final List c(Throwable th) {
        if (th instanceof defpackage.i) {
            return va.a.g(null, null, null);
        }
        return va.a.g(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public static boolean c0(String str) {
        a.b bVar = i0.f3364a;
        Set<d2.p> unmodifiableSet = Collections.unmodifiableSet(d2.a.f3343c);
        HashSet hashSet = new HashSet();
        for (d2.p pVar : unmodifiableSet) {
            if (pVar.a().equals(str)) {
                hashSet.add(pVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException(g.d("Unknown feature ", str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d2.p) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, Object obj, int i10, int i11) {
        for (Object obj2 : spannableStringBuilder.getSpans(i10, i11, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i10 && spannableStringBuilder.getSpanEnd(obj2) == i11 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i10, i11, 33);
    }

    public static synchronized boolean d0(Context context) {
        Boolean bool;
        boolean isInstantApp;
        Boolean bool2;
        synchronized (b.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f17191a;
            if (context2 != null && (bool2 = f17192b) != null && context2 == applicationContext) {
                return bool2.booleanValue();
            }
            f17192b = null;
            if (!v6.e.a()) {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f17192b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    bool = Boolean.FALSE;
                }
                f17191a = applicationContext;
                return f17192b.booleanValue();
            }
            isInstantApp = applicationContext.getPackageManager().isInstantApp();
            bool = Boolean.valueOf(isInstantApp);
            f17192b = bool;
            f17191a = applicationContext;
            return f17192b.booleanValue();
        }
    }

    public static final void e(Throwable th, Throwable th2) {
        i.e(th, "<this>");
        i.e(th2, Constants.EXCEPTION);
        if (th != th2) {
            yb.b.f17466a.a(th, th2);
        }
    }

    public static boolean e0(Context context, String str) {
        a.b bVar = i0.f3364a;
        Set<z> unmodifiableSet = Collections.unmodifiableSet(z.f3420c);
        HashSet hashSet = new HashSet();
        for (z zVar : unmodifiableSet) {
            if (zVar.f3421a.equals(str)) {
                hashSet.add(zVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException(g.d("Unknown feature ", str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((z) it.next()).a(context)) {
                return true;
            }
        }
        return false;
    }

    public static final void f(int i10, StringBuilder sb2) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("?");
            if (i11 < i10 - 1) {
                sb2.append(",");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT >= 24) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean f0(android.content.Context r4) {
        /*
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.Boolean r1 = x6.b.f17195e
            if (r1 != 0) goto L14
            java.lang.String r1 = "android.hardware.type.watch"
            boolean r0 = r0.hasSystemFeature(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            x6.b.f17195e = r0
        L14:
            java.lang.Boolean r0 = x6.b.f17195e
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L29
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r0 < r3) goto L26
            r0 = r1
            goto L27
        L26:
            r0 = r2
        L27:
            if (r0 == 0) goto L56
        L29:
            java.lang.Boolean r0 = x6.b.f
            if (r0 != 0) goto L3d
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r0 = "cn.google"
            boolean r4 = r4.hasSystemFeature(r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            x6.b.f = r4
        L3d:
            java.lang.Boolean r4 = x6.b.f
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L57
            boolean r4 = v6.e.a()
            if (r4 == 0) goto L56
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r4 < r0) goto L53
            r4 = r1
            goto L54
        L53:
            r4 = r2
        L54:
            if (r4 == 0) goto L57
        L56:
            return r1
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.b.f0(android.content.Context):boolean");
    }

    public static final Object[] g(int i10) {
        if (i10 >= 0) {
            return new Object[i10];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public static z1 g0(d0 d0Var, tc.b bVar, p pVar, int i10) {
        h hVar = bVar;
        if ((i10 & 1) != 0) {
            hVar = ub.i.f15164a;
        }
        int i11 = (i10 & 2) != 0 ? 1 : 0;
        h b10 = y.b(d0Var, hVar);
        z1 r1Var = i11 == 2 ? new r1(b10, pVar) : new z1(b10, true);
        r1Var.d0(i11, r1Var, pVar);
        return r1Var;
    }

    public static k0 h(d0 d0Var, p pVar) {
        k0 k0Var = new k0(y.b(d0Var, ub.i.f15164a), true);
        k0Var.d0(1, k0Var, pVar);
        return k0Var;
    }

    public static void h0(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static String i(int i10, int i11, String str) {
        if (i10 < 0) {
            return m0.X("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return m0.X("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(defpackage.f.h("negative size: ", i11));
    }

    public static final void i0(e eVar) {
        i.e(eVar, "frame");
    }

    public static final d.a j(String str) {
        i.e(str, "name");
        return new d.a(str);
    }

    public static byte[] j0(InputStream inputStream, int i10) {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int read = inputStream.read(bArr, i11, i10 - i11);
            if (read < 0) {
                throw new IllegalStateException(defpackage.f.h("Not enough bytes to read: ", i10));
            }
            i11 += read;
        }
        return bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable k(ub.e r4, qc.e r5, qc.f r6) {
        /*
            boolean r0 = r4 instanceof qc.j
            if (r0 == 0) goto L13
            r0 = r4
            qc.j r0 = (qc.j) r0
            int r1 = r0.f13422c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13422c = r1
            goto L18
        L13:
            qc.j r0 = new qc.j
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f13421b
            vb.a r1 = vb.a.f16085a
            int r2 = r0.f13422c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            ec.s r5 = r0.f13420a
            rb.f.b(r4)     // Catch: java.lang.Throwable -> L29
            goto L4c
        L29:
            r4 = move-exception
            r1 = r4
            goto L51
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            rb.f.b(r4)
            ec.s r4 = new ec.s
            r4.<init>()
            qc.k r2 = new qc.k     // Catch: java.lang.Throwable -> L4e
            r2.<init>(r6, r4)     // Catch: java.lang.Throwable -> L4e
            r0.f13420a = r4     // Catch: java.lang.Throwable -> L4e
            r0.f13422c = r3     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r4 = r5.collect(r2, r0)     // Catch: java.lang.Throwable -> L4e
            if (r4 != r1) goto L4c
            goto L8b
        L4c:
            r1 = 0
            goto L8b
        L4e:
            r5 = move-exception
            r1 = r5
            r5 = r4
        L51:
            T r4 = r5.f5272a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r5 = 0
            if (r4 == 0) goto L60
            boolean r6 = ec.i.a(r4, r1)
            if (r6 == 0) goto L60
            r6 = r3
            goto L61
        L60:
            r6 = r5
        L61:
            if (r6 != 0) goto L98
            ub.h r6 = r0.getContext()
            nc.j1$b r0 = nc.j1.b.f11509a
            ub.h$b r6 = r6.get(r0)
            nc.j1 r6 = (nc.j1) r6
            if (r6 == 0) goto L87
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L78
            goto L87
        L78:
            java.util.concurrent.CancellationException r6 = r6.getCancellationException()
            if (r6 == 0) goto L85
            boolean r6 = ec.i.a(r6, r1)
            if (r6 == 0) goto L85
            goto L86
        L85:
            r3 = r5
        L86:
            r5 = r3
        L87:
            if (r5 != 0) goto L98
            if (r4 != 0) goto L8c
        L8b:
            return r1
        L8c:
            boolean r5 = r1 instanceof java.util.concurrent.CancellationException
            if (r5 == 0) goto L94
            e(r4, r1)
            throw r4
        L94:
            e(r1, r4)
            throw r1
        L98:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.b.k(ub.e, qc.e, qc.f):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r0.finished() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] k0(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L88
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L88
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L55
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L55
            if (r4 >= r9) goto L55
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L88
            if (r6 < 0) goto L39
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L88
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.util.zip.DataFormatException -> L2e java.lang.Throwable -> L88
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L39:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r8.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L88
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L55:
            if (r4 != r9) goto L69
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L61
            r0.end()
            return r1
        L61:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L69:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r8.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L88
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            r8.append(r4)     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L88:
            r8 = move-exception
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.b.k0(java.io.FileInputStream, int, int):byte[]");
    }

    public static void l(int i10, String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(m0.X(str, Integer.valueOf(i10)));
        }
    }

    public static long l0(InputStream inputStream, int i10) {
        byte[] j02 = j0(inputStream, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 += (j02[i11] & 255) << (i11 * 8);
        }
        return j10;
    }

    public static void m(long j10, String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(m0.X(str, Long.valueOf(j10)));
        }
    }

    public static int m0(InputStream inputStream) {
        return (int) l0(inputStream, 2);
    }

    public static void n(Object obj, String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(m0.X(str, obj));
        }
    }

    public static void n0(FlutterError flutterError) {
        j8.s sVar = f8.c.a().f5482a;
        sVar.getClass();
        String str = "Recorded on-demand fatal events: " + ((AtomicInteger) sVar.f8627c.f9390b).get();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        StringBuilder l10 = defpackage.f.l("Dropped on-demand fatal events: ");
        l10.append(((AtomicInteger) sVar.f8627c.f9391c).get());
        String sb2 = l10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, null);
        }
        sVar.f8639p.f9140a.a(new x0.q0(9, sVar, flutterError));
    }

    public static void o(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static final void o0(Object[] objArr, int i10, int i11) {
        i.e(objArr, "<this>");
        while (i10 < i11) {
            objArr[i10] = null;
            i10++;
        }
    }

    public static void p(String str, boolean z10, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static Object p0(p pVar) {
        ub.i iVar = ub.i.f15164a;
        Thread currentThread = Thread.currentThread();
        f.a aVar = f.a.f15163a;
        x0 a10 = c2.a();
        h a11 = y.a(iVar, a10, true);
        tc.c cVar = r0.f11545a;
        if (a11 != cVar && a11.get(aVar) == null) {
            a11 = a11.plus(cVar);
        }
        nc.f fVar = new nc.f(a11, currentThread, a10);
        fVar.d0(1, fVar, pVar);
        x0 x0Var = fVar.f11493e;
        if (x0Var != null) {
            int i10 = x0.f;
            x0Var.E0(false);
        }
        while (!Thread.interrupted()) {
            try {
                x0 x0Var2 = fVar.f11493e;
                long G0 = x0Var2 != null ? x0Var2.G0() : Long.MAX_VALUE;
                if (fVar.isCompleted()) {
                    Object f02 = m0.f0(fVar.F());
                    u uVar = f02 instanceof u ? (u) f02 : null;
                    if (uVar == null) {
                        return f02;
                    }
                    throw uVar.f11555a;
                }
                LockSupport.parkNanos(fVar, G0);
            } finally {
                x0 x0Var3 = fVar.f11493e;
                if (x0Var3 != null) {
                    int i11 = x0.f;
                    x0Var3.C0(false);
                }
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        fVar.r(interruptedException);
        throw interruptedException;
    }

    public static void q(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void q0(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(defpackage.f.h("csd-", i10), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }

    public static void r(boolean z10, String str, Object obj, Object obj2) {
        if (!z10) {
            throw new IllegalArgumentException(m0.X(str, obj, obj2));
        }
    }

    public static int r0(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    public static void s(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static int s0(Object obj) {
        return r0(obj == null ? 0 : obj.hashCode());
    }

    public static void t(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static final Object t0(sc.s sVar, sc.s sVar2, p pVar) {
        Object uVar;
        Object L;
        try {
            v.a(2, pVar);
            uVar = pVar.invoke(sVar2, sVar);
        } catch (Throwable th) {
            uVar = new u(th, false);
        }
        vb.a aVar = vb.a.f16085a;
        if (uVar == aVar || (L = sVar.L(uVar)) == m0.f12899u) {
            return aVar;
        }
        if (L instanceof u) {
            throw ((u) L).f11555a;
        }
        return m0.f0(L);
    }

    public static void u(String str, boolean z10) {
        if (!z10) {
            throw a1.a(str, null);
        }
    }

    public static final d.a u0(String str) {
        i.e(str, "name");
        return new d.a(str);
    }

    public static void v(int i10, int i11) {
        String X;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                X = m0.X("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(defpackage.f.h("negative size: ", i11));
                }
                X = m0.X("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(X);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long v0(java.lang.String r21, long r22, long r24, long r26) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.b.v0(java.lang.String, long, long, long):long");
    }

    public static void w(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(defpackage.f.h("at index ", i11));
            }
        }
    }

    public static int w0(String str, int i10, int i11, int i12, int i13) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return (int) v0(str, i10, i11, i12);
    }

    public static void x(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static String x0(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static void y(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    public static String y0(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'a' && c10 <= 'z') {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static void z(String str, Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(m0.X(str, obj2));
        }
    }

    public static final Object z0(e eVar, h hVar, p pVar) {
        Object f02;
        h context = eVar.getContext();
        boolean z10 = false;
        h plus = !((Boolean) hVar.fold(Boolean.FALSE, nc.z.f11579a)).booleanValue() ? context.plus(hVar) : y.a(context, hVar, false);
        m0.C(plus);
        if (plus == context) {
            sc.s sVar = new sc.s(eVar, plus);
            f02 = t0(sVar, sVar, pVar);
        } else {
            f.a aVar = f.a.f15163a;
            if (i.a(plus.get(aVar), context.get(aVar))) {
                g2 g2Var = new g2(eVar, plus);
                h hVar2 = g2Var.f11466c;
                Object c10 = w.c(hVar2, null);
                try {
                    Object t02 = t0(g2Var, g2Var, pVar);
                    w.a(hVar2, c10);
                    f02 = t02;
                } catch (Throwable th) {
                    w.a(hVar2, c10);
                    throw th;
                }
            } else {
                o0 o0Var = new o0(eVar, plus);
                try {
                    a0.C(m0.P(m0.u(o0Var, o0Var, pVar)), rb.h.f13851a, null);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = o0.f11521e;
                    while (true) {
                        int i10 = atomicIntegerFieldUpdater.get(o0Var);
                        if (i10 != 0) {
                            if (i10 != 2) {
                                throw new IllegalStateException("Already suspended".toString());
                            }
                        } else if (o0.f11521e.compareAndSet(o0Var, 0, 1)) {
                            z10 = true;
                            break;
                        }
                    }
                    if (z10) {
                        f02 = vb.a.f16085a;
                    } else {
                        f02 = m0.f0(o0Var.F());
                        if (f02 instanceof u) {
                            throw ((u) f02).f11555a;
                        }
                    }
                } catch (Throwable th2) {
                    o0Var.resumeWith(rb.f.a(th2));
                    throw th2;
                }
            }
        }
        vb.a aVar2 = vb.a.f16085a;
        return f02;
    }
}
