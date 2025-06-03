package e6;

import W5.AbstractC0672b;
import g6.p;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e implements n6.b {

    /* renamed from: a, reason: collision with root package name */
    public final File f14031a;

    /* renamed from: b, reason: collision with root package name */
    public final f f14032b;

    /* renamed from: c, reason: collision with root package name */
    public final g6.l f14033c;

    /* renamed from: d, reason: collision with root package name */
    public final g6.l f14034d;

    /* renamed from: e, reason: collision with root package name */
    public final p f14035e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14036f;

    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File rootDir) {
            super(rootDir);
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        }
    }

    public final class b extends AbstractC0672b {

        /* renamed from: q, reason: collision with root package name */
        public final ArrayDeque f14037q;

        public final class a extends a {

            /* renamed from: b, reason: collision with root package name */
            public boolean f14039b;

            /* renamed from: c, reason: collision with root package name */
            public File[] f14040c;

            /* renamed from: d, reason: collision with root package name */
            public int f14041d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f14042e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ b f14043f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f14043f = bVar;
            }

            @Override // e6.e.c
            public File b() {
                if (!this.f14042e && this.f14040c == null) {
                    g6.l lVar = e.this.f14033c;
                    if (lVar != null && !((Boolean) lVar.invoke(a())).booleanValue()) {
                        return null;
                    }
                    File[] listFiles = a().listFiles();
                    this.f14040c = listFiles;
                    if (listFiles == null) {
                        p pVar = e.this.f14035e;
                        if (pVar != null) {
                            pVar.invoke(a(), new e6.a(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f14042e = true;
                    }
                }
                File[] fileArr = this.f14040c;
                if (fileArr != null) {
                    int i7 = this.f14041d;
                    Intrinsics.b(fileArr);
                    if (i7 < fileArr.length) {
                        File[] fileArr2 = this.f14040c;
                        Intrinsics.b(fileArr2);
                        int i8 = this.f14041d;
                        this.f14041d = i8 + 1;
                        return fileArr2[i8];
                    }
                }
                if (!this.f14039b) {
                    this.f14039b = true;
                    return a();
                }
                g6.l lVar2 = e.this.f14034d;
                if (lVar2 != null) {
                    lVar2.invoke(a());
                }
                return null;
            }
        }

        /* renamed from: e6.e$b$b, reason: collision with other inner class name */
        public final class C0202b extends c {

            /* renamed from: b, reason: collision with root package name */
            public boolean f14044b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f14045c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0202b(b bVar, File rootFile) {
                super(rootFile);
                Intrinsics.checkNotNullParameter(rootFile, "rootFile");
                this.f14045c = bVar;
            }

            @Override // e6.e.c
            public File b() {
                if (this.f14044b) {
                    return null;
                }
                this.f14044b = true;
                return a();
            }
        }

        public final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            public boolean f14046b;

            /* renamed from: c, reason: collision with root package name */
            public File[] f14047c;

            /* renamed from: d, reason: collision with root package name */
            public int f14048d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b f14049e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f14049e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // e6.e.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.io.File b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f14046b
                    r1 = 0
                    if (r0 != 0) goto L28
                    e6.e$b r0 = r10.f14049e
                    e6.e r0 = e6.e.this
                    g6.l r0 = e6.e.c(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r10.a()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r10.f14046b = r0
                    java.io.File r0 = r10.a()
                    return r0
                L28:
                    java.io.File[] r0 = r10.f14047c
                    if (r0 == 0) goto L47
                    int r2 = r10.f14048d
                    kotlin.jvm.internal.Intrinsics.b(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    e6.e$b r0 = r10.f14049e
                    e6.e r0 = e6.e.this
                    g6.l r0 = e6.e.e(r0)
                    if (r0 == 0) goto L46
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r10.f14047c
                    if (r0 != 0) goto L93
                    java.io.File r0 = r10.a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f14047c = r0
                    if (r0 != 0) goto L77
                    e6.e$b r0 = r10.f14049e
                    e6.e r0 = e6.e.this
                    g6.p r0 = e6.e.d(r0)
                    if (r0 == 0) goto L77
                    java.io.File r2 = r10.a()
                    e6.a r9 = new e6.a
                    java.io.File r4 = r10.a()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L77:
                    java.io.File[] r0 = r10.f14047c
                    if (r0 == 0) goto L81
                    kotlin.jvm.internal.Intrinsics.b(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L93
                L81:
                    e6.e$b r0 = r10.f14049e
                    e6.e r0 = e6.e.this
                    g6.l r0 = e6.e.e(r0)
                    if (r0 == 0) goto L92
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L92:
                    return r1
                L93:
                    java.io.File[] r0 = r10.f14047c
                    kotlin.jvm.internal.Intrinsics.b(r0)
                    int r1 = r10.f14048d
                    int r2 = r1 + 1
                    r10.f14048d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: e6.e.b.c.b():java.io.File");
            }
        }

        public /* synthetic */ class d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f14050a;

            static {
                int[] iArr = new int[f.values().length];
                try {
                    iArr[f.f14052o.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[f.f14053p.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f14050a = iArr;
            }
        }

        public b() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f14037q = arrayDeque;
            if (e.this.f14031a.isDirectory()) {
                arrayDeque.push(g(e.this.f14031a));
            } else if (e.this.f14031a.isFile()) {
                arrayDeque.push(new C0202b(this, e.this.f14031a));
            } else {
                d();
            }
        }

        @Override // W5.AbstractC0672b
        public void b() {
            File h7 = h();
            if (h7 != null) {
                e(h7);
            } else {
                d();
            }
        }

        public final a g(File file) {
            int i7 = d.f14050a[e.this.f14032b.ordinal()];
            if (i7 == 1) {
                return new c(this, file);
            }
            if (i7 == 2) {
                return new a(this, file);
            }
            throw new V5.l();
        }

        public final File h() {
            File b7;
            while (true) {
                c cVar = (c) this.f14037q.peek();
                if (cVar == null) {
                    return null;
                }
                b7 = cVar.b();
                if (b7 == null) {
                    this.f14037q.pop();
                } else {
                    if (Intrinsics.a(b7, cVar.a()) || !b7.isDirectory() || this.f14037q.size() >= e.this.f14036f) {
                        break;
                    }
                    this.f14037q.push(g(b7));
                }
            }
            return b7;
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final File f14051a;

        public c(File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            this.f14051a = root;
        }

        public final File a() {
            return this.f14051a;
        }

        public abstract File b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(File start, f direction) {
        this(start, direction, null, null, null, 0, 32, null);
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
    }

    @Override // n6.b
    public Iterator iterator() {
        return new b();
    }

    public e(File file, f fVar, g6.l lVar, g6.l lVar2, p pVar, int i7) {
        this.f14031a = file;
        this.f14032b = fVar;
        this.f14033c = lVar;
        this.f14034d = lVar2;
        this.f14035e = pVar;
        this.f14036f = i7;
    }

    public /* synthetic */ e(File file, f fVar, g6.l lVar, g6.l lVar2, p pVar, int i7, int i8, kotlin.jvm.internal.g gVar) {
        this(file, (i8 & 2) != 0 ? f.f14052o : fVar, lVar, lVar2, pVar, (i8 & 32) != 0 ? Integer.MAX_VALUE : i7);
    }
}
