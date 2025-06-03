package p2;

import android.R;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import nc.a2;
import nc.f1;
import nc.g1;
import nc.g2;
import nc.j1;
import nc.r0;
import nc.w0;
import org.xmlpull.v1.XmlPullParser;
import ub.h;

/* loaded from: classes.dex */
public class m0 implements c4.j, e7.j, ea.m0, f2.f, m6.i, o2.a, Continuation, s5.g {

    /* renamed from: p, reason: collision with root package name */
    public static int f12895p = 2;

    /* renamed from: r, reason: collision with root package name */
    public static final d2.h0 f12897r;

    /* renamed from: s, reason: collision with root package name */
    public static final d2.h0 f12898s;
    public static final d2.h0 t;

    /* renamed from: u, reason: collision with root package name */
    public static final d2.h0 f12899u;

    /* renamed from: v, reason: collision with root package name */
    public static final d2.h0 f12900v;

    /* renamed from: w, reason: collision with root package name */
    public static final d2.h0 f12901w;

    /* renamed from: x, reason: collision with root package name */
    public static final d2.h0 f12902x;

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f12889a = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f12890b = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f12891c = new m0();

    /* renamed from: d, reason: collision with root package name */
    public static final m0 f12892d = new m0();

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f12893e = {R.attr.dither, R.attr.visible, R.attr.variablePadding, R.attr.constantSize, R.attr.enterFadeDuration, R.attr.exitFadeDuration};
    public static final int[] f = {R.attr.id, R.attr.drawable};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f12894o = {R.attr.drawable, R.attr.toId, R.attr.fromId, R.attr.reversible};

    /* renamed from: q, reason: collision with root package name */
    public static final d2.h0 f12896q = new d2.h0("RESUME_TOKEN", 9);

    /* renamed from: y, reason: collision with root package name */
    public static final w0 f12903y = new w0(false);

    /* renamed from: z, reason: collision with root package name */
    public static final w0 f12904z = new w0(true);
    public static final m0 A = new m0();
    public static final m0 B = new m0();
    public static final d2.h0 C = new d2.h0("CLOSED", 9);
    public static final d2.h0 D = new d2.h0("CONDITION_FALSE", 9);

    static {
        int i10 = 9;
        f12897r = new d2.h0("REMOVED_TASK", i10);
        f12898s = new d2.h0("CLOSED_EMPTY", i10);
        int i11 = 9;
        t = new d2.h0("COMPLETING_ALREADY", i11);
        f12899u = new d2.h0("COMPLETING_WAITING_CHILDREN", i11);
        f12900v = new d2.h0("COMPLETING_RETRY", i11);
        f12901w = new d2.h0("TOO_LATE_TO_CANCEL", i11);
        f12902x = new d2.h0("SEALED", i11);
    }

    public /* synthetic */ m0() {
    }

    public static String A(j9.e eVar) {
        StringBuilder sb2 = new StringBuilder();
        int q10 = eVar.q();
        for (int i10 = 0; i10 < q10; i10++) {
            if (sb2.length() > 0) {
                sb2.append((char) 1);
                sb2.append((char) 1);
            }
            String n2 = eVar.n(i10);
            int length = n2.length();
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = n2.charAt(i11);
                if (charAt == 0) {
                    sb2.append((char) 1);
                    charAt = 16;
                } else if (charAt == 1) {
                    sb2.append((char) 1);
                    charAt = 17;
                }
                sb2.append(charAt);
            }
        }
        sb2.append((char) 1);
        sb2.append((char) 1);
        return sb2.toString();
    }

    public static void B() {
        if (v5.e0.f15881a >= 18) {
            Trace.endSection();
        }
    }

    public static final void C(ub.h hVar) {
        j1 j1Var = (j1) hVar.get(j1.b.f11509a);
        if (j1Var != null && !j1Var.isActive()) {
            throw j1Var.getCancellationException();
        }
    }

    public static final xb.b D(Enum[] enumArr) {
        ec.i.e(enumArr, "entries");
        return new xb.b(enumArr);
    }

    public static final boolean E(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final Object F(sc.t tVar, long j10, dc.p pVar) {
        boolean z10;
        while (true) {
            if (tVar.f14367c >= j10 && !tVar.c()) {
                return tVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sc.c.f14331a;
            Object obj = atomicReferenceFieldUpdater.get(tVar);
            d2.h0 h0Var = C;
            if (obj == h0Var) {
                return h0Var;
            }
            sc.t tVar2 = (sc.t) ((sc.c) obj);
            if (tVar2 == null) {
                tVar2 = (sc.t) pVar.invoke(Long.valueOf(tVar.f14367c + 1), tVar);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(tVar, null, tVar2)) {
                        z10 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(tVar) != null) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    if (tVar.c()) {
                        tVar.d();
                    }
                }
            }
            tVar = tVar2;
        }
    }

    public static String G(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static final void H() {
        vb.a aVar = vb.a.f16085a;
    }

    public static final int I(Cursor cursor, String str) {
        ec.i.e(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex('`' + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            if (!(str.length() == 0)) {
                String[] columnNames = cursor.getColumnNames();
                ec.i.d(columnNames, "columnNames");
                String str2 = '.' + str;
                String str3 = '.' + str + '`';
                int length = columnNames.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    String str4 = columnNames[i10];
                    int i12 = i11 + 1;
                    if (str4.length() >= str.length() + 2) {
                        ec.i.e(str2, "suffix");
                        if (!str4.endsWith(str2)) {
                            if (str4.charAt(0) == '`') {
                                ec.i.e(str3, "suffix");
                                if (str4.endsWith(str3)) {
                                }
                            } else {
                                continue;
                            }
                        }
                        return i11;
                    }
                    i10++;
                    i11 = i12;
                }
            }
        }
        return -1;
    }

    public static final int J(Cursor cursor, String str) {
        String str2;
        ec.i.e(cursor, "c");
        int I = I(cursor, str);
        if (I >= 0) {
            return I;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            ec.i.d(columnNames, "c.columnNames");
            str2 = sb.k.p(columnNames, null, null, null, 63);
        } catch (Exception e10) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e10);
            str2 = "unknown";
        }
        throw new IllegalArgumentException(a0.j.k("column '", str, "' does not exist. Available columns: ", str2));
    }

    public static Object K(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static final sc.t L(Object obj) {
        if (obj != C) {
            return (sc.t) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final void M(ub.h hVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = sc.e.f14334a.iterator();
        while (it.hasNext()) {
            try {
                ((nc.b0) it.next()).I(hVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    x6.b.e(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            x6.b.e(th, new sc.f(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static boolean N(Bundle bundle, Bundle bundle2) {
        int i10;
        int i11;
        int i12;
        int i13 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i14 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE", -1);
        int i15 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        int i16 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        int i17 = Integer.MAX_VALUE;
        if (i13 == -1 || i15 == -1) {
            i10 = Integer.MAX_VALUE;
            i11 = 0;
        } else {
            i11 = i13 * i15;
            i10 = (i15 + i11) - 1;
        }
        if (i14 == -1 || i16 == -1) {
            i12 = 0;
        } else {
            i12 = i14 * i16;
            i17 = (i16 + i12) - 1;
        }
        return i10 >= i12 && i17 >= i11;
    }

    public static boolean O(int i10) {
        return i10 >= 2;
    }

    public static final ub.e P(ub.e eVar) {
        ub.e<Object> intercepted;
        ec.i.e(eVar, "<this>");
        wb.c cVar = eVar instanceof wb.c ? (wb.c) eVar : null;
        return (cVar == null || (intercepted = cVar.intercepted()) == null) ? eVar : intercepted;
    }

    public static final boolean Q(AssertionError assertionError) {
        Logger logger = xc.p.f17277a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? lc.k.o0(message, "getsockname failed") : false;
    }

    public static final boolean R(Object obj) {
        return obj == C;
    }

    public static boolean S() {
        return q0.g.c(f12895p) >= 0;
    }

    public static boolean T(XmlPullParser xmlPullParser, String str) {
        return (xmlPullParser.getEventType() == 3) && xmlPullParser.getName().equals(str);
    }

    public static boolean U(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean V(XmlPullParser xmlPullParser, String str) {
        return U(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static final boolean W(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    public static String X(String str, Object... objArr) {
        int indexOf;
        String str2;
        String valueOf = String.valueOf(str);
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e10) {
                    String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str3, (Throwable) e10);
                    str2 = "<" + str3 + " threw " + e10.getClass().getName() + ">";
                }
            }
            objArr[i11] = str2;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i12 = 0;
        while (i10 < objArr.length && (indexOf = valueOf.indexOf("%s", i12)) != -1) {
            sb2.append((CharSequence) valueOf, i12, indexOf);
            sb2.append(objArr[i10]);
            i12 = indexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) valueOf, i12, valueOf.length());
        if (i10 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static q0.c Y(String str, p0.a aVar, int i10) {
        sc.d dVar = null;
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        q0.a aVar2 = (i10 & 4) != 0 ? q0.a.f13183a : null;
        if ((i10 & 8) != 0) {
            tc.b bVar = r0.f11546b;
            a2 a2Var = new a2(null);
            bVar.getClass();
            dVar = nc.e0.a(h.a.a(bVar, a2Var));
        }
        ec.i.e(str, "name");
        ec.i.e(aVar2, "produceMigrations");
        ec.i.e(dVar, "scope");
        return new q0.c(str, aVar, aVar2, dVar);
    }

    public static final void Z(nc.p0 p0Var, ub.e eVar, boolean z10) {
        Object k10 = p0Var.k();
        Throwable f10 = p0Var.f(k10);
        Object a10 = f10 != null ? rb.f.a(f10) : p0Var.g(k10);
        if (!z10) {
            eVar.resumeWith(a10);
            return;
        }
        ec.i.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        sc.g gVar = (sc.g) eVar;
        ub.e<T> eVar2 = gVar.f14338e;
        Object obj = gVar.f14339o;
        ub.h context = eVar2.getContext();
        Object c10 = sc.w.c(context, obj);
        g2<?> c11 = c10 != sc.w.f14370a ? nc.y.c(eVar2, context, c10) : null;
        try {
            gVar.f14338e.resumeWith(a10);
            rb.h hVar = rb.h.f13851a;
        } finally {
            if (c11 == null || c11.e0()) {
                sc.w.a(context, c10);
            }
        }
    }

    public static final xc.d a0(Socket socket) {
        Logger logger = xc.p.f17277a;
        ec.i.e(socket, "<this>");
        xc.x xVar = new xc.x(socket);
        OutputStream outputStream = socket.getOutputStream();
        ec.i.d(outputStream, "getOutputStream()");
        return new xc.d(xVar, new xc.q(outputStream, xVar));
    }

    public static final xc.e b0(Socket socket) {
        Logger logger = xc.p.f17277a;
        ec.i.e(socket, "<this>");
        xc.x xVar = new xc.x(socket);
        InputStream inputStream = socket.getInputStream();
        ec.i.d(inputStream, "getInputStream()");
        return new xc.e(xVar, new xc.o(inputStream, xVar));
    }

    public static final long c0(int i10, mc.c cVar) {
        ec.i.e(cVar, "unit");
        if (cVar.compareTo(mc.c.f11158d) > 0) {
            return d0(i10, cVar);
        }
        long p10 = b.a0.p(i10, cVar, mc.c.f11156b) << 1;
        int i11 = mc.a.f11153d;
        int i12 = mc.b.f11155a;
        return p10;
    }

    public static final long d0(long j10, mc.c cVar) {
        ec.i.e(cVar, "unit");
        mc.c cVar2 = mc.c.f11156b;
        long p10 = b.a0.p(4611686018426999999L, cVar2, cVar);
        if ((-p10) <= j10 && j10 <= p10) {
            long p11 = b.a0.p(j10, cVar, cVar2) << 1;
            int i10 = mc.a.f11153d;
            int i11 = mc.b.f11155a;
            return p11;
        }
        mc.c cVar3 = mc.c.f11157c;
        ec.i.e(cVar3, "targetUnit");
        long N = (ic.g.N(cVar3.f11162a.convert(j10, cVar.f11162a), -4611686018427387903L, 4611686018427387903L) << 1) + 1;
        int i12 = mc.a.f11153d;
        int i13 = mc.b.f11155a;
        return N;
    }

    public static final String e0(String str) {
        Comparable comparable;
        String str2;
        ec.i.e(str, "<this>");
        List N = kc.i.N(new lc.j(str));
        ArrayList arrayList = new ArrayList();
        for (Object obj : N) {
            if (true ^ lc.k.t0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(sb.m.j(arrayList));
        Iterator it = arrayList.iterator();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            int length = str3.length();
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                }
                if (!W(str3.charAt(i10))) {
                    break;
                }
                i10++;
            }
            if (i10 == -1) {
                i10 = str3.length();
            }
            arrayList2.add(Integer.valueOf(i10));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int size = (N.size() * 0) + str.length();
        int d10 = va.a.d(N);
        ArrayList arrayList3 = new ArrayList();
        int i11 = 0;
        for (Object obj2 : N) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str4 = (String) obj2;
            if ((i11 == 0 || i11 == d10) && lc.k.t0(str4)) {
                str2 = null;
            } else {
                ec.i.e(str4, "<this>");
                if (!(intValue >= 0)) {
                    throw new IllegalArgumentException(a0.j.h("Requested character count ", intValue, " is less than zero.").toString());
                }
                int length2 = str4.length();
                if (intValue <= length2) {
                    length2 = intValue;
                }
                str2 = str4.substring(length2);
                ec.i.d(str2, "substring(...)");
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i11 = i12;
        }
        StringBuilder sb2 = new StringBuilder(size);
        sb.q.o(arrayList3, sb2, "\n", "", "", -1, "...", null);
        return sb2.toString();
    }

    public static final ArrayList f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m7.n nVar = (m7.n) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", nVar.a());
            bundle.putLong("event_timestamp", nVar.b());
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static final Object f0(Object obj) {
        f1 f1Var;
        g1 g1Var = obj instanceof g1 ? (g1) obj : null;
        return (g1Var == null || (f1Var = g1Var.f11498a) == null) ? obj : f1Var;
    }

    public static final void g(StringBuilder sb2, Object obj, dc.l lVar) {
        CharSequence obj2;
        if (lVar != null) {
            obj = lVar.invoke(obj);
        } else {
            if (!(obj == null ? true : obj instanceof CharSequence)) {
                if (obj instanceof Character) {
                    sb2.append(((Character) obj).charValue());
                    return;
                } else {
                    obj2 = obj.toString();
                    sb2.append(obj2);
                }
            }
        }
        obj2 = (CharSequence) obj;
        sb2.append(obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        a0.j.t(r2, r1, "ReflectionGuard");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001a, code lost:
    
        if (r1 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean g0(java.lang.String r1, dc.a r2) {
        /*
            java.lang.String r0 = "ReflectionGuard"
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.NoSuchMethodException -> L14 java.lang.ClassNotFoundException -> L1d
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.NoSuchMethodException -> L14 java.lang.ClassNotFoundException -> L1d
            boolean r2 = r2.booleanValue()     // Catch: java.lang.NoSuchMethodException -> L14 java.lang.ClassNotFoundException -> L1d
            if (r2 != 0) goto L2b
            if (r1 == 0) goto L2b
            android.util.Log.e(r0, r1)     // Catch: java.lang.NoSuchMethodException -> L14 java.lang.ClassNotFoundException -> L1d
            goto L2b
        L14:
            java.lang.String r2 = "NoSuchMethod: "
            java.lang.StringBuilder r2 = defpackage.f.l(r2)
            if (r1 != 0) goto L27
            goto L25
        L1d:
            java.lang.String r2 = "ClassNotFound: "
            java.lang.StringBuilder r2 = defpackage.f.l(r2)
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            a0.j.t(r2, r1, r0)
            r2 = 0
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.m0.g0(java.lang.String, dc.a):boolean");
    }

    public static boolean h(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        return bundle == null ? bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1 : bundle2 == null ? bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1 : bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
    }

    public static void h0(String str, String str2, Object... objArr) {
        y(2, str, str2, objArr);
    }

    public static void i(String str) {
        if (v5.e0.f15881a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static Object i0(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", str, cls.getCanonicalName(), obj2.getClass().getCanonicalName()));
    }

    public static final void j(dc.l lVar, Object obj, ub.h hVar) {
        n7.w k10 = k(lVar, obj, null);
        if (k10 != null) {
            nc.c0.a(hVar, k10);
        }
    }

    public static void j0(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static final n7.w k(dc.l lVar, Object obj, n7.w wVar) {
        try {
            lVar.invoke(obj);
        } catch (Throwable th) {
            if (wVar == null || wVar.getCause() == th) {
                return new n7.w("Exception in undelivered element handler for " + obj, th);
            }
            x6.b.e(wVar, th);
        }
        return wVar;
    }

    public static final void l(ub.h hVar, CancellationException cancellationException) {
        j1 j1Var = (j1) hVar.get(j1.b.f11509a);
        if (j1Var != null) {
            j1Var.cancel(cancellationException);
        }
    }

    public static void n(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void o(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void q(int i10) {
        if (2 <= i10 && i10 < 37) {
            return;
        }
        StringBuilder n2 = a0.j.n("radix ", i10, " was not in valid range ");
        n2.append(new ic.f(2, 36));
        throw new IllegalArgumentException(n2.toString());
    }

    public static final int s(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ub.e u(Object obj, ub.e eVar, dc.p pVar) {
        ec.i.e(pVar, "<this>");
        ec.i.e(eVar, "completion");
        if (pVar instanceof wb.a) {
            return ((wb.a) pVar).create(obj, eVar);
        }
        ub.h context = eVar.getContext();
        return context == ub.i.f15164a ? new vb.b(obj, eVar, pVar) : new vb.c(eVar, context, pVar, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p2.k0 v(android.content.Context r29, androidx.work.a r30) {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.m0.v(android.content.Context, androidx.work.a):p2.k0");
    }

    public static void w(String str, String str2, Object... objArr) {
        y(1, str, str2, objArr);
    }

    public static j9.o x(String str) {
        List list;
        int length = str.length();
        x6.b.Z("Invalid path \"%s\"", length >= 2, str);
        if (length == 2) {
            x6.b.Z("Non-empty path \"%s\" had length 2", str.charAt(0) == 1 && str.charAt(1) == 1, str);
            list = Collections.emptyList();
        } else {
            int length2 = str.length() - 2;
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            while (i10 < length) {
                int indexOf = str.indexOf(1, i10);
                if (indexOf < 0 || indexOf > length2) {
                    throw new IllegalArgumentException(defpackage.g.e("Invalid encoded resource path: \"", str, "\""));
                }
                int i11 = indexOf + 1;
                char charAt = str.charAt(i11);
                if (charAt == 1) {
                    String substring = str.substring(i10, indexOf);
                    if (sb2.length() != 0) {
                        sb2.append(substring);
                        substring = sb2.toString();
                        sb2.setLength(0);
                    }
                    arrayList.add(substring);
                } else if (charAt == 16) {
                    sb2.append(str.substring(i10, indexOf));
                    sb2.append((char) 0);
                } else {
                    if (charAt != 17) {
                        throw new IllegalArgumentException(defpackage.g.e("Invalid encoded resource path: \"", str, "\""));
                    }
                    sb2.append(str.substring(i10, i11));
                }
                i10 = indexOf + 2;
            }
            list = arrayList;
        }
        j9.o oVar = j9.o.f8700b;
        return list.isEmpty() ? j9.o.f8700b : new j9.o(list);
    }

    public static void y(int i10, String str, String str2, Object... objArr) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 >= q0.g.c(f12895p)) {
            String str3 = String.format("(%s) [%s]: ", "25.1.2", str) + String.format(str2, objArr);
            if (i10 == 0) {
                throw null;
            }
            if (i11 == 0) {
                Log.i("Firestore", str3);
            } else if (i11 == 1) {
                Log.w("Firestore", str3);
            } else if (i11 == 2) {
                throw new IllegalStateException("Trying to log something on level NONE");
            }
        }
    }

    public static boolean z(Method method, ec.d dVar) {
        Class<?> d10 = dVar.d();
        ec.i.c(d10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(d10);
    }

    @Override // o2.a
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // e7.j
    public String b(String str, String str2) {
        return null;
    }

    @Override // f2.f
    public void c(String str, String str2) {
        ec.i.e(str, "tag");
        ec.i.e(str2, Constants.MESSAGE);
        Log.d(str, str2);
    }

    @Override // m6.i
    public Object d(k6.j jVar) {
        return ((g6.b) jVar).f5901b;
    }

    @Override // ea.m0
    public long e() {
        return System.currentTimeMillis() * 1000;
    }

    @Override // c4.j
    public void m() {
    }

    @Override // c4.j
    public c4.v r(int i10, int i11) {
        return new c4.g();
    }

    @Override // c4.j
    public void t(c4.t tVar) {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((r9.f) task.getResult()).a();
    }
}
