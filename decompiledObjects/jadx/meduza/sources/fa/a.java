package fa;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import defpackage.f;
import ec.i;
import fa.b;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import vc.d;
import wb.c;
import wb.e;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5511a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Map<b.a, C0084a> f5512b = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: fa.a$a, reason: collision with other inner class name */
    public static final class C0084a {

        /* renamed from: a, reason: collision with root package name */
        public final vc.a f5513a;

        /* renamed from: b, reason: collision with root package name */
        public fa.b f5514b = null;

        public C0084a(d dVar) {
            this.f5513a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0084a)) {
                return false;
            }
            C0084a c0084a = (C0084a) obj;
            return i.a(this.f5513a, c0084a.f5513a) && i.a(this.f5514b, c0084a.f5514b);
        }

        public final int hashCode() {
            int hashCode = this.f5513a.hashCode() * 31;
            fa.b bVar = this.f5514b;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public final String toString() {
            StringBuilder l10 = f.l("Dependency(mutex=");
            l10.append(this.f5513a);
            l10.append(", subscriber=");
            l10.append(this.f5514b);
            l10.append(')');
            return l10.toString();
        }
    }

    @e(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", l = {R.styleable.AppCompatTheme_windowMinWidthMajor}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public Map f5515a;

        /* renamed from: b, reason: collision with root package name */
        public Iterator f5516b;

        /* renamed from: c, reason: collision with root package name */
        public b.a f5517c;

        /* renamed from: d, reason: collision with root package name */
        public vc.a f5518d;

        /* renamed from: e, reason: collision with root package name */
        public Map f5519e;
        public Object f;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f5520o;

        /* renamed from: q, reason: collision with root package name */
        public int f5522q;

        public b(ub.e<? super b> eVar) {
            super(eVar);
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            this.f5520o = obj;
            this.f5522q |= Integer.MIN_VALUE;
            return a.this.b(this);
        }
    }

    public static C0084a a(b.a aVar) {
        Map<b.a, C0084a> map = f5512b;
        i.d(map, "dependencies");
        C0084a c0084a = map.get(aVar);
        if (c0084a != null) {
            return c0084a;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    public static fa.b c(b.a aVar) {
        i.e(aVar, "subscriberName");
        fa.b bVar = a(aVar).f5514b;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("Subscriber " + aVar + " has not been registered.");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0090 -> B:10:0x0091). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(ub.e<? super java.util.Map<fa.b.a, ? extends fa.b>> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof fa.a.b
            if (r0 == 0) goto L13
            r0 = r10
            fa.a$b r0 = (fa.a.b) r0
            int r1 = r0.f5522q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5522q = r1
            goto L18
        L13:
            fa.a$b r0 = new fa.a$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f5520o
            vb.a r1 = vb.a.f16085a
            int r2 = r0.f5522q
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r2 = r0.f
            java.util.Map r4 = r0.f5519e
            vc.a r5 = r0.f5518d
            fa.b$a r6 = r0.f5517c
            java.util.Iterator r7 = r0.f5516b
            java.util.Map r8 = r0.f5515a
            rb.f.b(r10)
            goto L91
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3b:
            rb.f.b(r10)
            java.util.Map<fa.b$a, fa.a$a> r10 = fa.a.f5512b
            java.lang.String r2 = "dependencies"
            ec.i.d(r10, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r4 = r10.size()
            int r4 = sb.y.H0(r4)
            r2.<init>(r4)
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
            r7 = r10
            r4 = r2
        L5c:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto La3
            java.lang.Object r10 = r7.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r2 = r10.getKey()
            java.lang.Object r5 = r10.getKey()
            r6 = r5
            fa.b$a r6 = (fa.b.a) r6
            java.lang.Object r10 = r10.getValue()
            fa.a$a r10 = (fa.a.C0084a) r10
            vc.a r5 = r10.f5513a
            r0.f5515a = r4
            r0.f5516b = r7
            r0.f5517c = r6
            r0.f5518d = r5
            r0.f5519e = r4
            r0.f = r2
            r0.f5522q = r3
            java.lang.Object r10 = r5.b(r0)
            if (r10 != r1) goto L90
            return r1
        L90:
            r8 = r4
        L91:
            r10 = 0
            fa.b r6 = c(r6)     // Catch: java.lang.Throwable -> L9e
            r5.a(r10)
            r4.put(r2, r6)
            r4 = r8
            goto L5c
        L9e:
            r0 = move-exception
            r5.a(r10)
            throw r0
        La3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fa.a.b(ub.e):java.lang.Object");
    }
}
