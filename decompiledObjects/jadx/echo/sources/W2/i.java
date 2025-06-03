package W2;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class i {

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f6826a;

        /* renamed from: b, reason: collision with root package name */
        public final a f6827b;

        /* renamed from: c, reason: collision with root package name */
        public a f6828c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f6829d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f6830e;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public String f6831a;

            /* renamed from: b, reason: collision with root package name */
            public Object f6832b;

            /* renamed from: c, reason: collision with root package name */
            public a f6833c;
        }

        public b(String str) {
            a aVar = new a();
            this.f6827b = aVar;
            this.f6828c = aVar;
            this.f6829d = false;
            this.f6830e = false;
            this.f6826a = (String) m.j(str);
        }

        public static boolean d(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof l ? !((l) obj).c() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public final a a() {
            a aVar = new a();
            this.f6828c.f6833c = aVar;
            this.f6828c = aVar;
            return aVar;
        }

        public final b b(Object obj) {
            a().f6832b = obj;
            return this;
        }

        public b c(Object obj) {
            return b(obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r8 = this;
                r0 = 1
                boolean r1 = r8.f6829d
                boolean r2 = r8.f6830e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r4 = 32
                r3.<init>(r4)
                java.lang.String r4 = r8.f6826a
                r3.append(r4)
                r4 = 123(0x7b, float:1.72E-43)
                r3.append(r4)
                W2.i$b$a r4 = r8.f6827b
                W2.i$b$a r4 = r4.f6833c
                java.lang.String r5 = ""
            L1c:
                if (r4 == 0) goto L62
                java.lang.Object r6 = r4.f6832b
                if (r6 != 0) goto L25
                if (r1 != 0) goto L5f
                goto L2d
            L25:
                if (r2 == 0) goto L2d
                boolean r7 = d(r6)
                if (r7 != 0) goto L5f
            L2d:
                r3.append(r5)
                java.lang.String r5 = r4.f6831a
                if (r5 == 0) goto L3c
                r3.append(r5)
                r5 = 61
                r3.append(r5)
            L3c:
                if (r6 == 0) goto L5a
                java.lang.Class r5 = r6.getClass()
                boolean r5 = r5.isArray()
                if (r5 == 0) goto L5a
                java.lang.Object[] r5 = new java.lang.Object[r0]
                r7 = 0
                r5[r7] = r6
                java.lang.String r5 = java.util.Arrays.deepToString(r5)
                int r6 = r5.length()
                int r6 = r6 - r0
                r3.append(r5, r0, r6)
                goto L5d
            L5a:
                r3.append(r6)
            L5d:
                java.lang.String r5 = ", "
            L5f:
                W2.i$b$a r4 = r4.f6833c
                goto L1c
            L62:
                r0 = 125(0x7d, float:1.75E-43)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: W2.i.b.toString():java.lang.String");
        }
    }

    public static b a(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
