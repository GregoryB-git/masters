package p1;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import sb.u;
import sb.x;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: o, reason: collision with root package name */
    public static final String[] f12766o = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final j f12767a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, String> f12768b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, Set<String>> f12769c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f12770d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f12771e;
    public final AtomicBoolean f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f12772g;

    /* renamed from: h, reason: collision with root package name */
    public volatile t1.f f12773h;

    /* renamed from: i, reason: collision with root package name */
    public final b f12774i;

    /* renamed from: j, reason: collision with root package name */
    public final l.l f12775j;

    /* renamed from: k, reason: collision with root package name */
    public final n.b<c, d> f12776k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f12777l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f12778m;

    /* renamed from: n, reason: collision with root package name */
    public final f f12779n;

    public static final class a {
        public static String a(String str, String str2) {
            ec.i.e(str, "tableName");
            ec.i.e(str2, "triggerType");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f12780a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f12781b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f12782c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f12783d;

        public b(int i10) {
            this.f12780a = new long[i10];
            this.f12781b = new boolean[i10];
            this.f12782c = new int[i10];
        }

        public final int[] a() {
            synchronized (this) {
                if (!this.f12783d) {
                    return null;
                }
                long[] jArr = this.f12780a;
                int length = jArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    int i13 = 1;
                    boolean z10 = jArr[i10] > 0;
                    boolean[] zArr = this.f12781b;
                    if (z10 != zArr[i11]) {
                        int[] iArr = this.f12782c;
                        if (!z10) {
                            i13 = 2;
                        }
                        iArr[i11] = i13;
                    } else {
                        this.f12782c[i11] = 0;
                    }
                    zArr[i11] = z10;
                    i10++;
                    i11 = i12;
                }
                this.f12783d = false;
                return (int[]) this.f12782c.clone();
            }
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f12784a;

        public c(String[] strArr) {
            ec.i.e(strArr, "tables");
            this.f12784a = strArr;
        }

        public abstract void a(Set<String> set);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final c f12785a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f12786b;

        /* renamed from: c, reason: collision with root package name */
        public final String[] f12787c;

        /* renamed from: d, reason: collision with root package name */
        public final Set<String> f12788d;

        public d(c cVar, int[] iArr, String[] strArr) {
            Set<String> set;
            this.f12785a = cVar;
            this.f12786b = iArr;
            this.f12787c = strArr;
            if (!(strArr.length == 0)) {
                set = Collections.singleton(strArr[0]);
                ec.i.d(set, "singleton(...)");
            } else {
                set = u.f14326a;
            }
            this.f12788d = set;
            if (!(iArr.length == strArr.length)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(java.util.Set<java.lang.Integer> r9) {
            /*
                r8 = this;
                java.lang.String r0 = "invalidatedTablesIds"
                ec.i.e(r9, r0)
                int[] r0 = r8.f12786b
                int r1 = r0.length
                r2 = 1
                if (r1 == 0) goto L46
                r3 = 0
                if (r1 == r2) goto L37
                tb.g r0 = new tb.g
                r0.<init>()
                int[] r1 = r8.f12786b
                int r4 = r1.length
                r5 = r3
            L17:
                if (r3 >= r4) goto L32
                r6 = r1[r3]
                int r7 = r5 + 1
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                boolean r6 = r9.contains(r6)
                if (r6 == 0) goto L2e
                java.lang.String[] r6 = r8.f12787c
                r5 = r6[r5]
                r0.add(r5)
            L2e:
                int r3 = r3 + 1
                r5 = r7
                goto L17
            L32:
                tb.g r9 = va.a.a(r0)
                goto L48
            L37:
                r0 = r0[r3]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                boolean r9 = r9.contains(r0)
                if (r9 == 0) goto L46
                java.util.Set<java.lang.String> r9 = r8.f12788d
                goto L48
            L46:
                sb.u r9 = sb.u.f14326a
            L48:
                boolean r0 = r9.isEmpty()
                r0 = r0 ^ r2
                if (r0 == 0) goto L54
                p1.e$c r0 = r8.f12785a
                r0.a(r9)
            L54:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p1.e.d.a(java.util.Set):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(java.lang.String[] r12) {
            /*
                r11 = this;
                java.lang.String[] r0 = r11.f12787c
                int r0 = r0.length
                r1 = 1
                if (r0 == 0) goto L4a
                r2 = 0
                if (r0 == r1) goto L30
                tb.g r0 = new tb.g
                r0.<init>()
                int r3 = r12.length
                r4 = r2
            L10:
                if (r4 >= r3) goto L2b
                r5 = r12[r4]
                java.lang.String[] r6 = r11.f12787c
                int r7 = r6.length
                r8 = r2
            L18:
                if (r8 >= r7) goto L28
                r9 = r6[r8]
                boolean r10 = lc.h.k0(r9, r5)
                if (r10 == 0) goto L25
                r0.add(r9)
            L25:
                int r8 = r8 + 1
                goto L18
            L28:
                int r4 = r4 + 1
                goto L10
            L2b:
                tb.g r12 = va.a.a(r0)
                goto L4c
            L30:
                int r0 = r12.length
                r3 = r2
            L32:
                if (r3 >= r0) goto L45
                r4 = r12[r3]
                java.lang.String[] r5 = r11.f12787c
                r5 = r5[r2]
                boolean r4 = lc.h.k0(r4, r5)
                if (r4 == 0) goto L42
                r2 = r1
                goto L45
            L42:
                int r3 = r3 + 1
                goto L32
            L45:
                if (r2 == 0) goto L4a
                java.util.Set<java.lang.String> r12 = r11.f12788d
                goto L4c
            L4a:
                sb.u r12 = sb.u.f14326a
            L4c:
                boolean r0 = r12.isEmpty()
                r0 = r0 ^ r1
                if (r0 == 0) goto L58
                p1.e$c r0 = r11.f12785a
                r0.a(r12)
            L58:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p1.e.d.b(java.lang.String[]):void");
        }
    }

    /* renamed from: p1.e$e, reason: collision with other inner class name */
    public static final class C0193e extends c {

        /* renamed from: b, reason: collision with root package name */
        public final e f12789b;

        /* renamed from: c, reason: collision with root package name */
        public final WeakReference<c> f12790c;

        public C0193e(e eVar, m mVar) {
            super(mVar.f12784a);
            this.f12789b = eVar;
            this.f12790c = new WeakReference<>(mVar);
        }

        @Override // p1.e.c
        public final void a(Set<String> set) {
            ec.i.e(set, "tables");
            c cVar = this.f12790c.get();
            if (cVar == null) {
                this.f12789b.c(this);
            } else {
                cVar.a(set);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(j jVar, HashMap hashMap, HashMap hashMap2, String... strArr) {
        Object obj;
        String str;
        ec.i.e(jVar, "database");
        this.f12767a = jVar;
        this.f12768b = hashMap;
        this.f12769c = hashMap2;
        this.f = new AtomicBoolean(false);
        this.f12774i = new b(strArr.length);
        this.f12775j = new l.l(jVar);
        this.f12776k = new n.b<>();
        this.f12777l = new Object();
        this.f12778m = new Object();
        this.f12770d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArr[i10];
            Locale locale = Locale.US;
            ec.i.d(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            ec.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f12770d.put(lowerCase, Integer.valueOf(i10));
            String str3 = this.f12768b.get(strArr[i10]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                ec.i.d(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i10] = lowerCase;
        }
        this.f12771e = strArr2;
        for (Map.Entry<String, String> entry : this.f12768b.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            ec.i.d(locale2, "US");
            String lowerCase2 = value.toLowerCase(locale2);
            ec.i.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f12770d.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                ec.i.d(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f12770d;
                ec.i.e(linkedHashMap, "<this>");
                if (linkedHashMap instanceof x) {
                    obj = ((x) linkedHashMap).a();
                } else {
                    Object obj2 = linkedHashMap.get(lowerCase2);
                    if (obj2 == null && !linkedHashMap.containsKey(lowerCase2)) {
                        throw new NoSuchElementException("Key " + ((Object) lowerCase2) + " is missing in the map.");
                    }
                    obj = obj2;
                }
                linkedHashMap.put(lowerCase3, obj);
            }
        }
        this.f12779n = new f(this);
    }

    public final void a(c cVar) {
        d h10;
        boolean z10;
        String[] d10 = d(cVar.f12784a);
        ArrayList arrayList = new ArrayList(d10.length);
        for (String str : d10) {
            LinkedHashMap linkedHashMap = this.f12770d;
            Locale locale = Locale.US;
            ec.i.d(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            ec.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) linkedHashMap.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException(defpackage.g.d("There is no table with name ", str));
            }
            arrayList.add(Integer.valueOf(num.intValue()));
        }
        int[] t = sb.q.t(arrayList);
        d dVar = new d(cVar, t, d10);
        synchronized (this.f12776k) {
            h10 = this.f12776k.h(cVar, dVar);
        }
        if (h10 == null) {
            b bVar = this.f12774i;
            int[] copyOf = Arrays.copyOf(t, t.length);
            bVar.getClass();
            ec.i.e(copyOf, "tableIds");
            synchronized (bVar) {
                z10 = false;
                for (int i10 : copyOf) {
                    long[] jArr = bVar.f12780a;
                    long j10 = jArr[i10];
                    jArr[i10] = 1 + j10;
                    if (j10 == 0) {
                        bVar.f12783d = true;
                        z10 = true;
                    }
                }
                rb.h hVar = rb.h.f13851a;
            }
            if (z10 && this.f12767a.k()) {
                g(this.f12767a.g().getWritableDatabase());
            }
        }
    }

    public final boolean b() {
        if (!this.f12767a.k()) {
            return false;
        }
        if (!this.f12772g) {
            this.f12767a.g().getWritableDatabase();
        }
        if (this.f12772g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void c(c cVar) {
        d i10;
        boolean z10;
        ec.i.e(cVar, "observer");
        synchronized (this.f12776k) {
            i10 = this.f12776k.i(cVar);
        }
        if (i10 != null) {
            b bVar = this.f12774i;
            int[] iArr = i10.f12786b;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            bVar.getClass();
            ec.i.e(copyOf, "tableIds");
            synchronized (bVar) {
                z10 = false;
                for (int i11 : copyOf) {
                    long[] jArr = bVar.f12780a;
                    long j10 = jArr[i11];
                    jArr[i11] = j10 - 1;
                    if (j10 == 1) {
                        bVar.f12783d = true;
                        z10 = true;
                    }
                }
                rb.h hVar = rb.h.f13851a;
            }
            if (z10 && this.f12767a.k()) {
                g(this.f12767a.g().getWritableDatabase());
            }
        }
    }

    public final String[] d(String[] strArr) {
        tb.g gVar = new tb.g();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.f12769c;
            Locale locale = Locale.US;
            ec.i.d(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            ec.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.f12769c;
                String lowerCase2 = str.toLowerCase(locale);
                ec.i.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                ec.i.b(set);
                gVar.addAll(set);
            } else {
                gVar.add(str);
            }
        }
        Object[] array = va.a.a(gVar).toArray(new String[0]);
        ec.i.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    public final void e(t1.b bVar, int i10) {
        bVar.m("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f12771e[i10];
        String[] strArr = f12766o;
        for (int i11 = 0; i11 < 3; i11++) {
            String str2 = strArr[i11];
            StringBuilder l10 = defpackage.f.l("CREATE TEMP TRIGGER IF NOT EXISTS ");
            l10.append(a.a(str, str2));
            l10.append(" AFTER ");
            l10.append(str2);
            l10.append(" ON `");
            l10.append(str);
            l10.append("` BEGIN UPDATE ");
            l10.append("room_table_modification_log");
            l10.append(" SET ");
            l10.append("invalidated");
            l10.append(" = 1");
            l10.append(" WHERE ");
            l10.append("table_id");
            l10.append(" = ");
            l10.append(i10);
            l10.append(" AND ");
            l10.append("invalidated");
            l10.append(" = 0");
            l10.append("; END");
            String sb2 = l10.toString();
            ec.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
            bVar.m(sb2);
        }
    }

    public final void f(t1.b bVar, int i10) {
        String str = this.f12771e[i10];
        String[] strArr = f12766o;
        for (int i11 = 0; i11 < 3; i11++) {
            String str2 = strArr[i11];
            StringBuilder l10 = defpackage.f.l("DROP TRIGGER IF EXISTS ");
            l10.append(a.a(str, str2));
            String sb2 = l10.toString();
            ec.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
            bVar.m(sb2);
        }
    }

    public final void g(t1.b bVar) {
        ec.i.e(bVar, "database");
        if (bVar.j0()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = this.f12767a.f12799i.readLock();
            ec.i.d(readLock, "readWriteLock.readLock()");
            readLock.lock();
            try {
                synchronized (this.f12777l) {
                    int[] a10 = this.f12774i.a();
                    if (a10 == null) {
                        return;
                    }
                    if (bVar.n0()) {
                        bVar.J();
                    } else {
                        bVar.h();
                    }
                    try {
                        int length = a10.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length) {
                            int i12 = a10[i10];
                            int i13 = i11 + 1;
                            if (i12 == 1) {
                                e(bVar, i11);
                            } else if (i12 == 2) {
                                f(bVar, i11);
                            }
                            i10++;
                            i11 = i13;
                        }
                        bVar.G();
                        bVar.X();
                        rb.h hVar = rb.h.f13851a;
                    } catch (Throwable th) {
                        bVar.X();
                        throw th;
                    }
                }
            } finally {
                readLock.unlock();
            }
        } catch (SQLiteException | IllegalStateException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        }
    }
}
