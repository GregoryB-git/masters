package W2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final d f6836a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6837b;

    /* renamed from: c, reason: collision with root package name */
    public final c f6838c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6839d;

    public class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f6840a;

        /* renamed from: W2.q$a$a, reason: collision with other inner class name */
        public class C0116a extends b {
            public C0116a(q qVar, CharSequence charSequence) {
                super(qVar, charSequence);
            }

            @Override // W2.q.b
            public int g(int i7) {
                return i7 + 1;
            }

            @Override // W2.q.b
            public int h(int i7) {
                return a.this.f6840a.c(this.f6842q, i7);
            }
        }

        public a(d dVar) {
            this.f6840a = dVar;
        }

        @Override // W2.q.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(q qVar, CharSequence charSequence) {
            return new C0116a(qVar, charSequence);
        }
    }

    public static abstract class b extends W2.b {

        /* renamed from: q, reason: collision with root package name */
        public final CharSequence f6842q;

        /* renamed from: r, reason: collision with root package name */
        public final d f6843r;

        /* renamed from: s, reason: collision with root package name */
        public final boolean f6844s;

        /* renamed from: t, reason: collision with root package name */
        public int f6845t = 0;

        /* renamed from: u, reason: collision with root package name */
        public int f6846u;

        public b(q qVar, CharSequence charSequence) {
            this.f6843r = qVar.f6836a;
            this.f6844s = qVar.f6837b;
            this.f6846u = qVar.f6839d;
            this.f6842q = charSequence;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        
            if (r0 >= r1) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
        
            if (r6.f6843r.e(r6.f6842q.charAt(r0)) == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        
            r0 = r0 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
        
            if (r1 <= r0) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
        
            if (r6.f6843r.e(r6.f6842q.charAt(r1 - 1)) == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
        
            r1 = r1 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
        
            if (r6.f6844s == false) goto L39;
         */
        @Override // W2.b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String b() {
            /*
                r6 = this;
            L0:
                int r0 = r6.f6845t
            L2:
                int r1 = r6.f6845t
                r2 = -1
                if (r1 == r2) goto L8e
                int r1 = r6.h(r1)
                if (r1 != r2) goto L16
                java.lang.CharSequence r1 = r6.f6842q
                int r1 = r1.length()
                r6.f6845t = r2
                goto L1c
            L16:
                int r3 = r6.g(r1)
                r6.f6845t = r3
            L1c:
                int r3 = r6.f6845t
                if (r3 != r0) goto L2f
                int r3 = r3 + 1
                r6.f6845t = r3
                java.lang.CharSequence r1 = r6.f6842q
                int r1 = r1.length()
                if (r3 <= r1) goto L2
                r6.f6845t = r2
                goto L2
            L2f:
                if (r0 >= r1) goto L42
                W2.d r3 = r6.f6843r
                java.lang.CharSequence r4 = r6.f6842q
                char r4 = r4.charAt(r0)
                boolean r3 = r3.e(r4)
                if (r3 == 0) goto L42
                int r0 = r0 + 1
                goto L2f
            L42:
                if (r1 <= r0) goto L57
                W2.d r3 = r6.f6843r
                java.lang.CharSequence r4 = r6.f6842q
                int r5 = r1 + (-1)
                char r4 = r4.charAt(r5)
                boolean r3 = r3.e(r4)
                if (r3 == 0) goto L57
                int r1 = r1 + (-1)
                goto L42
            L57:
                boolean r3 = r6.f6844s
                if (r3 == 0) goto L5e
                if (r0 != r1) goto L5e
                goto L0
            L5e:
                int r3 = r6.f6846u
                r4 = 1
                if (r3 != r4) goto L80
                java.lang.CharSequence r1 = r6.f6842q
                int r1 = r1.length()
                r6.f6845t = r2
            L6b:
                if (r1 <= r0) goto L83
                W2.d r2 = r6.f6843r
                java.lang.CharSequence r3 = r6.f6842q
                int r4 = r1 + (-1)
                char r3 = r3.charAt(r4)
                boolean r2 = r2.e(r3)
                if (r2 == 0) goto L83
                int r1 = r1 + (-1)
                goto L6b
            L80:
                int r3 = r3 - r4
                r6.f6846u = r3
            L83:
                java.lang.CharSequence r2 = r6.f6842q
                java.lang.CharSequence r0 = r2.subSequence(r0, r1)
                java.lang.String r0 = r0.toString()
                return r0
            L8e:
                java.lang.Object r0 = r6.d()
                java.lang.String r0 = (java.lang.String) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: W2.q.b.b():java.lang.String");
        }

        public abstract int g(int i7);

        public abstract int h(int i7);
    }

    public interface c {
        Iterator a(q qVar, CharSequence charSequence);
    }

    public q(c cVar) {
        this(cVar, false, d.f(), Integer.MAX_VALUE);
    }

    public static q d(char c7) {
        return e(d.d(c7));
    }

    public static q e(d dVar) {
        m.j(dVar);
        return new q(new a(dVar));
    }

    public List f(CharSequence charSequence) {
        m.j(charSequence);
        Iterator g7 = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g7.hasNext()) {
            arrayList.add((String) g7.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Iterator g(CharSequence charSequence) {
        return this.f6838c.a(this, charSequence);
    }

    public q(c cVar, boolean z7, d dVar, int i7) {
        this.f6838c = cVar;
        this.f6837b = z7;
        this.f6836a = dVar;
        this.f6839d = i7;
    }
}
