package S4;

import S4.b;
import Z5.d;
import android.util.Log;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import y6.a;
import y6.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5888a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f5889b = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: S4.a$a, reason: collision with other inner class name */
    public static final class C0094a {

        /* renamed from: a, reason: collision with root package name */
        public final y6.a f5890a;

        /* renamed from: b, reason: collision with root package name */
        public S4.b f5891b;

        public C0094a(y6.a mutex, S4.b bVar) {
            Intrinsics.checkNotNullParameter(mutex, "mutex");
            this.f5890a = mutex;
            this.f5891b = bVar;
        }

        public final y6.a a() {
            return this.f5890a;
        }

        public final S4.b b() {
            return this.f5891b;
        }

        public final void c(S4.b bVar) {
            this.f5891b = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0094a)) {
                return false;
            }
            C0094a c0094a = (C0094a) obj;
            return Intrinsics.a(this.f5890a, c0094a.f5890a) && Intrinsics.a(this.f5891b, c0094a.f5891b);
        }

        public int hashCode() {
            int hashCode = this.f5890a.hashCode() * 31;
            S4.b bVar = this.f5891b;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            return "Dependency(mutex=" + this.f5890a + ", subscriber=" + this.f5891b + ')';
        }

        public /* synthetic */ C0094a(y6.a aVar, S4.b bVar, int i7, g gVar) {
            this(aVar, (i7 & 2) != 0 ? null : bVar);
        }
    }

    public static final class b extends d {

        /* renamed from: o, reason: collision with root package name */
        public Object f5892o;

        /* renamed from: p, reason: collision with root package name */
        public Object f5893p;

        /* renamed from: q, reason: collision with root package name */
        public Object f5894q;

        /* renamed from: r, reason: collision with root package name */
        public Object f5895r;

        /* renamed from: s, reason: collision with root package name */
        public Object f5896s;

        /* renamed from: t, reason: collision with root package name */
        public Object f5897t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f5898u;

        /* renamed from: w, reason: collision with root package name */
        public int f5900w;

        public b(X5.d dVar) {
            super(dVar);
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            this.f5898u = obj;
            this.f5900w |= Integer.MIN_VALUE;
            return a.this.c(this);
        }
    }

    public final void a(b.a subscriberName) {
        Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        Map dependencies = f5889b;
        if (!dependencies.containsKey(subscriberName)) {
            Intrinsics.checkNotNullExpressionValue(dependencies, "dependencies");
            dependencies.put(subscriberName, new C0094a(c.a(true), null, 2, 0 == true ? 1 : 0));
        } else {
            Log.d("SessionsDependencies", "Dependency " + subscriberName + " already added.");
        }
    }

    public final C0094a b(b.a aVar) {
        Map dependencies = f5889b;
        Intrinsics.checkNotNullExpressionValue(dependencies, "dependencies");
        Object obj = dependencies.get(aVar);
        if (obj != null) {
            Intrinsics.checkNotNullExpressionValue(obj, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return (C0094a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009f -> B:10:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(X5.d r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof S4.a.b
            if (r0 == 0) goto L13
            r0 = r11
            S4.a$b r0 = (S4.a.b) r0
            int r1 = r0.f5900w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5900w = r1
            goto L18
        L13:
            S4.a$b r0 = new S4.a$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f5898u
            java.lang.Object r1 = Y5.b.c()
            int r2 = r0.f5900w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r2 = r0.f5897t
            java.lang.Object r5 = r0.f5896s
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f5895r
            y6.a r6 = (y6.a) r6
            java.lang.Object r7 = r0.f5894q
            S4.b$a r7 = (S4.b.a) r7
            java.lang.Object r8 = r0.f5893p
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f5892o
            java.util.Map r9 = (java.util.Map) r9
            V5.o.b(r11)
            goto La0
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            V5.o.b(r11)
            java.util.Map r11 = S4.a.f5889b
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = W5.C.a(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L69:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb3
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            S4.b$a r7 = (S4.b.a) r7
            java.lang.Object r11 = r11.getValue()
            S4.a$a r11 = (S4.a.C0094a) r11
            y6.a r6 = r11.a()
            r0.f5892o = r5
            r0.f5893p = r8
            r0.f5894q = r7
            r0.f5895r = r6
            r0.f5896s = r5
            r0.f5897t = r2
            r0.f5900w = r3
            java.lang.Object r11 = r6.a(r4, r0)
            if (r11 != r1) goto L9f
            return r1
        L9f:
            r9 = r5
        La0:
            S4.a r11 = S4.a.f5888a     // Catch: java.lang.Throwable -> Lae
            S4.b r11 = r11.d(r7)     // Catch: java.lang.Throwable -> Lae
            r6.b(r4)
            r5.put(r2, r11)
            r5 = r9
            goto L69
        Lae:
            r11 = move-exception
            r6.b(r4)
            throw r11
        Lb3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: S4.a.c(X5.d):java.lang.Object");
    }

    public final S4.b d(b.a subscriberName) {
        Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        S4.b b7 = b(subscriberName).b();
        if (b7 != null) {
            return b7;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }

    public final void e(S4.b subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        b.a a7 = subscriber.a();
        C0094a b7 = b(a7);
        if (b7.b() == null) {
            b7.c(subscriber);
            a.C0304a.a(b7.a(), null, 1, null);
            return;
        }
        Log.d("SessionsDependencies", "Subscriber " + a7 + " already registered.");
    }
}
