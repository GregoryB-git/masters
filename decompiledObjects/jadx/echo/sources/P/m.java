package P;

import V5.t;
import W5.w;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import p6.AbstractC1874w;
import p6.I;
import p6.InterfaceC1872u;

/* loaded from: classes.dex */
public final class m implements P.f {

    /* renamed from: k, reason: collision with root package name */
    public static final a f4124k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    public static final Set f4125l = new LinkedHashSet();

    /* renamed from: m, reason: collision with root package name */
    public static final Object f4126m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final g6.a f4127a;

    /* renamed from: b, reason: collision with root package name */
    public final P.k f4128b;

    /* renamed from: c, reason: collision with root package name */
    public final P.b f4129c;

    /* renamed from: d, reason: collision with root package name */
    public final I f4130d;

    /* renamed from: e, reason: collision with root package name */
    public final s6.b f4131e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4132f;

    /* renamed from: g, reason: collision with root package name */
    public final V5.h f4133g;

    /* renamed from: h, reason: collision with root package name */
    public final s6.j f4134h;

    /* renamed from: i, reason: collision with root package name */
    public List f4135i;

    /* renamed from: j, reason: collision with root package name */
    public final P.l f4136j;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Set a() {
            return m.f4125l;
        }

        public final Object b() {
            return m.f4126m;
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public final P.n f4137a;

            public a(P.n nVar) {
                super(null);
                this.f4137a = nVar;
            }

            public P.n a() {
                return this.f4137a;
            }
        }

        /* renamed from: P.m$b$b, reason: collision with other inner class name */
        public static final class C0076b extends b {

            /* renamed from: a, reason: collision with root package name */
            public final g6.p f4138a;

            /* renamed from: b, reason: collision with root package name */
            public final InterfaceC1872u f4139b;

            /* renamed from: c, reason: collision with root package name */
            public final P.n f4140c;

            /* renamed from: d, reason: collision with root package name */
            public final X5.g f4141d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0076b(g6.p transform, InterfaceC1872u ack, P.n nVar, X5.g callerContext) {
                super(null);
                Intrinsics.checkNotNullParameter(transform, "transform");
                Intrinsics.checkNotNullParameter(ack, "ack");
                Intrinsics.checkNotNullParameter(callerContext, "callerContext");
                this.f4138a = transform;
                this.f4139b = ack;
                this.f4140c = nVar;
                this.f4141d = callerContext;
            }

            public final InterfaceC1872u a() {
                return this.f4139b;
            }

            public final X5.g b() {
                return this.f4141d;
            }

            public P.n c() {
                return this.f4140c;
            }

            public final g6.p d() {
                return this.f4138a;
            }
        }

        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public static final class c extends OutputStream {

        /* renamed from: o, reason: collision with root package name */
        public final FileOutputStream f4142o;

        public c(FileOutputStream fileOutputStream) {
            Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
            this.f4142o = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.f4142o.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i7) {
            this.f4142o.write(i7);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b7) {
            Intrinsics.checkNotNullParameter(b7, "b");
            this.f4142o.write(b7);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bytes, int i7, int i8) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            this.f4142o.write(bytes, i7, i8);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    public static final class d extends kotlin.jvm.internal.l implements g6.l {
        public d() {
            super(1);
        }

        public final void a(Throwable th) {
            if (th != null) {
                m.this.f4134h.setValue(new P.h(th));
            }
            a aVar = m.f4124k;
            Object b7 = aVar.b();
            m mVar = m.this;
            synchronized (b7) {
                aVar.a().remove(mVar.r().getAbsolutePath());
                t tVar = t.f6803a;
            }
        }

        @Override // g6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return t.f6803a;
        }
    }

    public static final class e extends kotlin.jvm.internal.l implements g6.p {

        /* renamed from: o, reason: collision with root package name */
        public static final e f4144o = new e();

        public e() {
            super(2);
        }

        public final void a(b msg, Throwable th) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (msg instanceof b.C0076b) {
                InterfaceC1872u a7 = ((b.C0076b) msg).a();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                a7.l(th);
            }
        }

        @Override // g6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((b) obj, (Throwable) obj2);
            return t.f6803a;
        }
    }

    public static final class f extends Z5.k implements g6.p {

        /* renamed from: o, reason: collision with root package name */
        public int f4145o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f4146p;

        public f(X5.d dVar) {
            super(2, dVar);
        }

        @Override // g6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b bVar, X5.d dVar) {
            return ((f) create(bVar, dVar)).invokeSuspend(t.f6803a);
        }

        @Override // Z5.a
        public final X5.d create(Object obj, X5.d dVar) {
            f fVar = m.this.new f(dVar);
            fVar.f4146p = obj;
            return fVar;
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            Object c7;
            c7 = Y5.d.c();
            int i7 = this.f4145o;
            if (i7 == 0) {
                V5.o.b(obj);
                b bVar = (b) this.f4146p;
                if (bVar instanceof b.a) {
                    this.f4145o = 1;
                    if (m.this.s((b.a) bVar, this) == c7) {
                        return c7;
                    }
                } else if (bVar instanceof b.C0076b) {
                    this.f4145o = 2;
                    if (m.this.t((b.C0076b) bVar, this) == c7) {
                        return c7;
                    }
                }
            } else {
                if (i7 != 1 && i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V5.o.b(obj);
            }
            return t.f6803a;
        }
    }

    public static final class g extends Z5.k implements g6.p {

        /* renamed from: o, reason: collision with root package name */
        public int f4148o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f4149p;

        public static final class a extends Z5.k implements g6.p {

            /* renamed from: o, reason: collision with root package name */
            public int f4151o;

            /* renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f4152p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ P.n f4153q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(P.n nVar, X5.d dVar) {
                super(2, dVar);
                this.f4153q = nVar;
            }

            @Override // g6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(P.n nVar, X5.d dVar) {
                return ((a) create(nVar, dVar)).invokeSuspend(t.f6803a);
            }

            @Override // Z5.a
            public final X5.d create(Object obj, X5.d dVar) {
                a aVar = new a(this.f4153q, dVar);
                aVar.f4152p = obj;
                return aVar;
            }

            @Override // Z5.a
            public final Object invokeSuspend(Object obj) {
                Y5.d.c();
                if (this.f4151o != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V5.o.b(obj);
                P.n nVar = (P.n) this.f4152p;
                P.n nVar2 = this.f4153q;
                boolean z7 = false;
                if (!(nVar2 instanceof P.c) && !(nVar2 instanceof P.h) && nVar == nVar2) {
                    z7 = true;
                }
                return Z5.b.a(z7);
            }
        }

        public static final class b implements s6.b {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ s6.b f4154o;

            public static final class a implements s6.c {

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ s6.c f4155o;

                /* renamed from: P.m$g$b$a$a, reason: collision with other inner class name */
                public static final class C0077a extends Z5.d {

                    /* renamed from: o, reason: collision with root package name */
                    public /* synthetic */ Object f4156o;

                    /* renamed from: p, reason: collision with root package name */
                    public int f4157p;

                    public C0077a(X5.d dVar) {
                        super(dVar);
                    }

                    @Override // Z5.a
                    public final Object invokeSuspend(Object obj) {
                        this.f4156o = obj;
                        this.f4157p |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(s6.c cVar) {
                    this.f4155o = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // s6.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object emit(java.lang.Object r5, X5.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof P.m.g.b.a.C0077a
                        if (r0 == 0) goto L13
                        r0 = r6
                        P.m$g$b$a$a r0 = (P.m.g.b.a.C0077a) r0
                        int r1 = r0.f4157p
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f4157p = r1
                        goto L18
                    L13:
                        P.m$g$b$a$a r0 = new P.m$g$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f4156o
                        java.lang.Object r1 = Y5.b.c()
                        int r2 = r0.f4157p
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        V5.o.b(r6)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        V5.o.b(r6)
                        s6.c r6 = r4.f4155o
                        P.n r5 = (P.n) r5
                        boolean r2 = r5 instanceof P.j
                        if (r2 != 0) goto L73
                        boolean r2 = r5 instanceof P.h
                        if (r2 != 0) goto L6c
                        boolean r2 = r5 instanceof P.c
                        if (r2 == 0) goto L56
                        P.c r5 = (P.c) r5
                        java.lang.Object r5 = r5.b()
                        r0.f4157p = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        V5.t r5 = V5.t.f6803a
                        return r5
                    L56:
                        boolean r5 = r5 instanceof P.o
                        if (r5 == 0) goto L66
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        java.lang.String r6 = r6.toString()
                        r5.<init>(r6)
                        throw r5
                    L66:
                        V5.l r5 = new V5.l
                        r5.<init>()
                        throw r5
                    L6c:
                        P.h r5 = (P.h) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    L73:
                        P.j r5 = (P.j) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: P.m.g.b.a.emit(java.lang.Object, X5.d):java.lang.Object");
                }
            }

            public b(s6.b bVar) {
                this.f4154o = bVar;
            }

            @Override // s6.b
            public Object a(s6.c cVar, X5.d dVar) {
                Object c7;
                Object a7 = this.f4154o.a(new a(cVar), dVar);
                c7 = Y5.d.c();
                return a7 == c7 ? a7 : t.f6803a;
            }
        }

        public g(X5.d dVar) {
            super(2, dVar);
        }

        @Override // Z5.a
        public final X5.d create(Object obj, X5.d dVar) {
            g gVar = m.this.new g(dVar);
            gVar.f4149p = obj;
            return gVar;
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            Object c7;
            c7 = Y5.d.c();
            int i7 = this.f4148o;
            if (i7 == 0) {
                V5.o.b(obj);
                s6.c cVar = (s6.c) this.f4149p;
                P.n nVar = (P.n) m.this.f4134h.getValue();
                if (!(nVar instanceof P.c)) {
                    m.this.f4136j.e(new b.a(nVar));
                }
                b bVar = new b(s6.d.a(m.this.f4134h, new a(nVar, null)));
                this.f4148o = 1;
                if (s6.d.b(cVar, bVar, this) == c7) {
                    return c7;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V5.o.b(obj);
            }
            return t.f6803a;
        }

        @Override // g6.p
        public final Object invoke(s6.c cVar, X5.d dVar) {
            return ((g) create(cVar, dVar)).invokeSuspend(t.f6803a);
        }
    }

    public static final class h extends kotlin.jvm.internal.l implements g6.a {
        public h() {
            super(0);
        }

        @Override // g6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) m.this.f4127a.invoke();
            String it = file.getAbsolutePath();
            a aVar = m.f4124k;
            synchronized (aVar.b()) {
                if (!(!aVar.a().contains(it))) {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
                Set a7 = aVar.a();
                Intrinsics.checkNotNullExpressionValue(it, "it");
                a7.add(it);
            }
            return file;
        }
    }

    public static final class i extends Z5.d {

        /* renamed from: o, reason: collision with root package name */
        public Object f4160o;

        /* renamed from: p, reason: collision with root package name */
        public Object f4161p;

        /* renamed from: q, reason: collision with root package name */
        public Object f4162q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f4163r;

        /* renamed from: t, reason: collision with root package name */
        public int f4165t;

        public i(X5.d dVar) {
            super(dVar);
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            this.f4163r = obj;
            this.f4165t |= Integer.MIN_VALUE;
            return m.this.t(null, this);
        }
    }

    public static final class j extends Z5.d {

        /* renamed from: o, reason: collision with root package name */
        public Object f4166o;

        /* renamed from: p, reason: collision with root package name */
        public Object f4167p;

        /* renamed from: q, reason: collision with root package name */
        public Object f4168q;

        /* renamed from: r, reason: collision with root package name */
        public Object f4169r;

        /* renamed from: s, reason: collision with root package name */
        public Object f4170s;

        /* renamed from: t, reason: collision with root package name */
        public Object f4171t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f4172u;

        /* renamed from: w, reason: collision with root package name */
        public int f4174w;

        public j(X5.d dVar) {
            super(dVar);
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            this.f4172u = obj;
            this.f4174w |= Integer.MIN_VALUE;
            return m.this.u(this);
        }
    }

    public static final class k implements P.i {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y6.a f4175a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f4176b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ u f4177c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m f4178d;

        public static final class a extends Z5.d {

            /* renamed from: o, reason: collision with root package name */
            public Object f4179o;

            /* renamed from: p, reason: collision with root package name */
            public Object f4180p;

            /* renamed from: q, reason: collision with root package name */
            public Object f4181q;

            /* renamed from: r, reason: collision with root package name */
            public Object f4182r;

            /* renamed from: s, reason: collision with root package name */
            public Object f4183s;

            /* renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f4184t;

            /* renamed from: v, reason: collision with root package name */
            public int f4186v;

            public a(X5.d dVar) {
                super(dVar);
            }

            @Override // Z5.a
            public final Object invokeSuspend(Object obj) {
                this.f4184t = obj;
                this.f4186v |= Integer.MIN_VALUE;
                return k.this.a(null, this);
            }
        }

        public k(y6.a aVar, s sVar, u uVar, m mVar) {
            this.f4175a = aVar;
            this.f4176b = sVar;
            this.f4177c = uVar;
            this.f4178d = mVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:27:0x0052, B:28:0x00b2, B:30:0x00ba), top: B:26:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[Catch: all -> 0x00d7, TRY_LEAVE, TryCatch #1 {all -> 0x00d7, blocks: (B:40:0x0096, B:42:0x009a, B:46:0x00da, B:47:0x00e1), top: B:39:0x0096 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00da A[Catch: all -> 0x00d7, TRY_ENTER, TryCatch #1 {all -> 0x00d7, blocks: (B:40:0x0096, B:42:0x009a, B:46:0x00da, B:47:0x00e1), top: B:39:0x0096 }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        @Override // P.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(g6.p r11, X5.d r12) {
            /*
                Method dump skipped, instructions count: 230
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: P.m.k.a(g6.p, X5.d):java.lang.Object");
        }
    }

    public static final class l extends Z5.d {

        /* renamed from: o, reason: collision with root package name */
        public Object f4187o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f4188p;

        /* renamed from: r, reason: collision with root package name */
        public int f4190r;

        public l(X5.d dVar) {
            super(dVar);
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            this.f4188p = obj;
            this.f4190r |= Integer.MIN_VALUE;
            return m.this.v(this);
        }
    }

    /* renamed from: P.m$m, reason: collision with other inner class name */
    public static final class C0078m extends Z5.d {

        /* renamed from: o, reason: collision with root package name */
        public Object f4191o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f4192p;

        /* renamed from: r, reason: collision with root package name */
        public int f4194r;

        public C0078m(X5.d dVar) {
            super(dVar);
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            this.f4192p = obj;
            this.f4194r |= Integer.MIN_VALUE;
            return m.this.w(this);
        }
    }

    public static final class n extends Z5.d {

        /* renamed from: o, reason: collision with root package name */
        public Object f4195o;

        /* renamed from: p, reason: collision with root package name */
        public Object f4196p;

        /* renamed from: q, reason: collision with root package name */
        public Object f4197q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f4198r;

        /* renamed from: t, reason: collision with root package name */
        public int f4200t;

        public n(X5.d dVar) {
            super(dVar);
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            this.f4198r = obj;
            this.f4200t |= Integer.MIN_VALUE;
            return m.this.x(this);
        }
    }

    public static final class o extends Z5.d {

        /* renamed from: o, reason: collision with root package name */
        public Object f4201o;

        /* renamed from: p, reason: collision with root package name */
        public Object f4202p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f4203q;

        /* renamed from: s, reason: collision with root package name */
        public int f4205s;

        public o(X5.d dVar) {
            super(dVar);
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            this.f4203q = obj;
            this.f4205s |= Integer.MIN_VALUE;
            return m.this.y(this);
        }
    }

    public static final class p extends Z5.d {

        /* renamed from: o, reason: collision with root package name */
        public Object f4206o;

        /* renamed from: p, reason: collision with root package name */
        public Object f4207p;

        /* renamed from: q, reason: collision with root package name */
        public Object f4208q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f4209r;

        /* renamed from: t, reason: collision with root package name */
        public int f4211t;

        public p(X5.d dVar) {
            super(dVar);
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            this.f4209r = obj;
            this.f4211t |= Integer.MIN_VALUE;
            return m.this.z(null, null, this);
        }
    }

    public static final class q extends Z5.k implements g6.p {

        /* renamed from: o, reason: collision with root package name */
        public int f4212o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ g6.p f4213p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Object f4214q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(g6.p pVar, Object obj, X5.d dVar) {
            super(2, dVar);
            this.f4213p = pVar;
            this.f4214q = obj;
        }

        @Override // Z5.a
        public final X5.d create(Object obj, X5.d dVar) {
            return new q(this.f4213p, this.f4214q, dVar);
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            Object c7;
            c7 = Y5.d.c();
            int i7 = this.f4212o;
            if (i7 == 0) {
                V5.o.b(obj);
                g6.p pVar = this.f4213p;
                Object obj2 = this.f4214q;
                this.f4212o = 1;
                obj = pVar.invoke(obj2, this);
                if (obj == c7) {
                    return c7;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V5.o.b(obj);
            }
            return obj;
        }

        @Override // g6.p
        public final Object invoke(I i7, X5.d dVar) {
            return ((q) create(i7, dVar)).invokeSuspend(t.f6803a);
        }
    }

    public static final class r extends Z5.d {

        /* renamed from: o, reason: collision with root package name */
        public Object f4215o;

        /* renamed from: p, reason: collision with root package name */
        public Object f4216p;

        /* renamed from: q, reason: collision with root package name */
        public Object f4217q;

        /* renamed from: r, reason: collision with root package name */
        public Object f4218r;

        /* renamed from: s, reason: collision with root package name */
        public Object f4219s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f4220t;

        /* renamed from: v, reason: collision with root package name */
        public int f4222v;

        public r(X5.d dVar) {
            super(dVar);
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            this.f4220t = obj;
            this.f4222v |= Integer.MIN_VALUE;
            return m.this.A(null, this);
        }
    }

    public m(g6.a produceFile, P.k serializer, List initTasksList, P.b corruptionHandler, I scope) {
        V5.h a7;
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f4127a = produceFile;
        this.f4128b = serializer;
        this.f4129c = corruptionHandler;
        this.f4130d = scope;
        this.f4131e = s6.d.e(new g(null));
        this.f4132f = ".tmp";
        a7 = V5.j.a(new h());
        this.f4133g = a7;
        this.f4134h = s6.m.a(P.o.f4223a);
        this.f4135i = w.G(initTasksList);
        this.f4136j = new P.l(scope, new d(), e.f4144o, new f(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2 A[Catch: IOException -> 0x00be, TRY_ENTER, TryCatch #3 {IOException -> 0x00be, blocks: (B:14:0x0092, B:19:0x00a2, B:20:0x00bd, B:27:0x00c5, B:28:0x00c8, B:24:0x00c3), top: B:7:0x0021, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(java.lang.Object r8, X5.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof P.m.r
            if (r0 == 0) goto L13
            r0 = r9
            P.m$r r0 = (P.m.r) r0
            int r1 = r0.f4222v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4222v = r1
            goto L18
        L13:
            P.m$r r0 = new P.m$r
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f4220t
            java.lang.Object r1 = Y5.b.c()
            int r2 = r0.f4222v
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r8 = r0.f4219s
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r1 = r0.f4218r
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f4217q
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r3 = r0.f4216p
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.f4215o
            P.m r0 = (P.m) r0
            V5.o.b(r9)     // Catch: java.lang.Throwable -> L3d
            goto L89
        L3d:
            r8 = move-exception
            goto Lc3
        L40:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L48:
            V5.o.b(r9)
            java.io.File r9 = r7.r()
            r7.q(r9)
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.r()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r4 = r7.f4132f
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.i(r2, r4)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lc9
            r2.<init>(r9)     // Catch: java.io.IOException -> Lc9
            P.k r4 = r7.f4128b     // Catch: java.lang.Throwable -> Lc1
            P.m$c r5 = new P.m$c     // Catch: java.lang.Throwable -> Lc1
            r5.<init>(r2)     // Catch: java.lang.Throwable -> Lc1
            r0.f4215o = r7     // Catch: java.lang.Throwable -> Lc1
            r0.f4216p = r9     // Catch: java.lang.Throwable -> Lc1
            r0.f4217q = r2     // Catch: java.lang.Throwable -> Lc1
            r6 = 0
            r0.f4218r = r6     // Catch: java.lang.Throwable -> Lc1
            r0.f4219s = r2     // Catch: java.lang.Throwable -> Lc1
            r0.f4222v = r3     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r8 = r4.c(r8, r5, r0)     // Catch: java.lang.Throwable -> Lc1
            if (r8 != r1) goto L85
            return r1
        L85:
            r0 = r7
            r3 = r9
            r8 = r2
            r1 = r6
        L89:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch: java.lang.Throwable -> L3d
            r8.sync()     // Catch: java.lang.Throwable -> L3d
            V5.t r8 = V5.t.f6803a     // Catch: java.lang.Throwable -> L3d
            e6.b.a(r2, r1)     // Catch: java.io.IOException -> Lbe
            java.io.File r8 = r0.r()     // Catch: java.io.IOException -> Lbe
            boolean r8 = r3.renameTo(r8)     // Catch: java.io.IOException -> Lbe
            if (r8 == 0) goto La2
            V5.t r8 = V5.t.f6803a
            return r8
        La2:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.io.IOException -> Lbe
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lbe
            r9.<init>()     // Catch: java.io.IOException -> Lbe
            java.lang.String r0 = "Unable to rename "
            r9.append(r0)     // Catch: java.io.IOException -> Lbe
            r9.append(r3)     // Catch: java.io.IOException -> Lbe
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch: java.io.IOException -> Lbe
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Lbe
            r8.<init>(r9)     // Catch: java.io.IOException -> Lbe
            throw r8     // Catch: java.io.IOException -> Lbe
        Lbe:
            r8 = move-exception
            r9 = r3
            goto Lca
        Lc1:
            r8 = move-exception
            r3 = r9
        Lc3:
            throw r8     // Catch: java.lang.Throwable -> Lc4
        Lc4:
            r9 = move-exception
            e6.b.a(r2, r8)     // Catch: java.io.IOException -> Lbe
            throw r9     // Catch: java.io.IOException -> Lbe
        Lc9:
            r8 = move-exception
        Lca:
            boolean r0 = r9.exists()
            if (r0 == 0) goto Ld3
            r9.delete()
        Ld3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: P.m.A(java.lang.Object, X5.d):java.lang.Object");
    }

    @Override // P.f
    public Object a(g6.p pVar, X5.d dVar) {
        InterfaceC1872u b7 = AbstractC1874w.b(null, 1, null);
        this.f4136j.e(new b.C0076b(pVar, b7, (P.n) this.f4134h.getValue(), dVar.getContext()));
        return b7.m(dVar);
    }

    @Override // P.f
    public s6.b b() {
        return this.f4131e;
    }

    public final void q(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(Intrinsics.i("Unable to create parent directories of ", file));
        }
    }

    public final File r() {
        return (File) this.f4133g.getValue();
    }

    public final Object s(b.a aVar, X5.d dVar) {
        Object c7;
        Object c8;
        P.n nVar = (P.n) this.f4134h.getValue();
        if (!(nVar instanceof P.c)) {
            if (nVar instanceof P.j) {
                if (nVar == aVar.a()) {
                    Object w7 = w(dVar);
                    c8 = Y5.d.c();
                    return w7 == c8 ? w7 : t.f6803a;
                }
            } else {
                if (Intrinsics.a(nVar, P.o.f4223a)) {
                    Object w8 = w(dVar);
                    c7 = Y5.d.c();
                    return w8 == c7 ? w8 : t.f6803a;
                }
                if (nVar instanceof P.h) {
                    throw new IllegalStateException("Can't read in final state.".toString());
                }
            }
        }
        return t.f6803a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(5:(1:(1:(1:12)(2:19|20))(3:21|22|23))(1:28)|13|14|15|16)(4:29|30|31|(6:33|(1:35)|26|14|15|16)(4:36|(2:49|(2:51|52)(2:53|54))|39|(2:41|(1:43)(1:44))(2:45|46)))|24|(1:27)|26|14|15|16))|59|6|7|(0)(0)|24|(0)|26|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0034, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r9v20, types: [p6.u] */
    /* JADX WARN: Type inference failed for: r9v27, types: [p6.u] */
    /* JADX WARN: Type inference failed for: r9v3, types: [p6.u] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(P.m.b.C0076b r9, X5.d r10) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P.m.t(P.m$b$b, X5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(X5.d r14) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P.m.u(X5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(X5.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof P.m.l
            if (r0 == 0) goto L13
            r0 = r5
            P.m$l r0 = (P.m.l) r0
            int r1 = r0.f4190r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4190r = r1
            goto L18
        L13:
            P.m$l r0 = new P.m$l
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f4188p
            java.lang.Object r1 = Y5.b.c()
            int r2 = r0.f4190r
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f4187o
            P.m r0 = (P.m) r0
            V5.o.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L45
        L2d:
            r5 = move-exception
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            V5.o.b(r5)
            r0.f4187o = r4     // Catch: java.lang.Throwable -> L48
            r0.f4190r = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.u(r0)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L45
            return r1
        L45:
            V5.t r5 = V5.t.f6803a
            return r5
        L48:
            r5 = move-exception
            r0 = r4
        L4a:
            s6.j r0 = r0.f4134h
            P.j r1 = new P.j
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: P.m.v(X5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(X5.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof P.m.C0078m
            if (r0 == 0) goto L13
            r0 = r5
            P.m$m r0 = (P.m.C0078m) r0
            int r1 = r0.f4194r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4194r = r1
            goto L18
        L13:
            P.m$m r0 = new P.m$m
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f4192p
            java.lang.Object r1 = Y5.b.c()
            int r2 = r0.f4194r
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f4191o
            P.m r0 = (P.m) r0
            V5.o.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            V5.o.b(r5)
            r0.f4191o = r4     // Catch: java.lang.Throwable -> L45
            r0.f4194r = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r4.u(r0)     // Catch: java.lang.Throwable -> L45
            if (r5 != r1) goto L51
            return r1
        L45:
            r5 = move-exception
            r0 = r4
        L47:
            s6.j r0 = r0.f4134h
            P.j r1 = new P.j
            r1.<init>(r5)
            r0.setValue(r1)
        L51:
            V5.t r5 = V5.t.f6803a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: P.m.w(X5.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v11, types: [P.m] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [P.m$n, X5.d] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [P.m] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream, java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v9, types: [P.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(X5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof P.m.n
            if (r0 == 0) goto L13
            r0 = r6
            P.m$n r0 = (P.m.n) r0
            int r1 = r0.f4200t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4200t = r1
            goto L18
        L13:
            P.m$n r0 = new P.m$n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f4198r
            java.lang.Object r1 = Y5.b.c()
            int r2 = r0.f4200t
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f4197q
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f4196p
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.f4195o
            P.m r0 = (P.m) r0
            V5.o.b(r6)     // Catch: java.lang.Throwable -> L35
            goto L5f
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3f:
            V5.o.b(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L6d
            java.io.File r6 = r5.r()     // Catch: java.io.FileNotFoundException -> L6d
            r2.<init>(r6)     // Catch: java.io.FileNotFoundException -> L6d
            P.k r6 = r5.f4128b     // Catch: java.lang.Throwable -> L65
            r0.f4195o = r5     // Catch: java.lang.Throwable -> L65
            r0.f4196p = r2     // Catch: java.lang.Throwable -> L65
            r4 = 0
            r0.f4197q = r4     // Catch: java.lang.Throwable -> L65
            r0.f4200t = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r6 = r6.b(r2, r0)     // Catch: java.lang.Throwable -> L65
            if (r6 != r1) goto L5d
            return r1
        L5d:
            r0 = r5
            r1 = r4
        L5f:
            e6.b.a(r2, r1)     // Catch: java.io.FileNotFoundException -> L63
            return r6
        L63:
            r6 = move-exception
            goto L6f
        L65:
            r6 = move-exception
            r0 = r5
        L67:
            throw r6     // Catch: java.lang.Throwable -> L68
        L68:
            r1 = move-exception
            e6.b.a(r2, r6)     // Catch: java.io.FileNotFoundException -> L63
            throw r1     // Catch: java.io.FileNotFoundException -> L63
        L6d:
            r6 = move-exception
            r0 = r5
        L6f:
            java.io.File r1 = r0.r()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L80
            P.k r6 = r0.f4128b
            java.lang.Object r6 = r6.a()
            return r6
        L80:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: P.m.x(X5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y(X5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof P.m.o
            if (r0 == 0) goto L13
            r0 = r8
            P.m$o r0 = (P.m.o) r0
            int r1 = r0.f4205s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4205s = r1
            goto L18
        L13:
            P.m$o r0 = new P.m$o
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f4203q
            java.lang.Object r1 = Y5.b.c()
            int r2 = r0.f4205s
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f4202p
            java.lang.Object r0 = r0.f4201o
            P.a r0 = (P.a) r0
            V5.o.b(r8)     // Catch: java.io.IOException -> L35
            goto L87
        L35:
            r8 = move-exception
            goto L8a
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3f:
            java.lang.Object r2 = r0.f4202p
            P.a r2 = (P.a) r2
            java.lang.Object r4 = r0.f4201o
            P.m r4 = (P.m) r4
            V5.o.b(r8)
            goto L79
        L4b:
            java.lang.Object r2 = r0.f4201o
            P.m r2 = (P.m) r2
            V5.o.b(r8)     // Catch: P.a -> L53
            goto L63
        L53:
            r8 = move-exception
            goto L66
        L55:
            V5.o.b(r8)
            r0.f4201o = r7     // Catch: P.a -> L64
            r0.f4205s = r5     // Catch: P.a -> L64
            java.lang.Object r8 = r7.x(r0)     // Catch: P.a -> L64
            if (r8 != r1) goto L63
            return r1
        L63:
            return r8
        L64:
            r8 = move-exception
            r2 = r7
        L66:
            P.b r5 = r2.f4129c
            r0.f4201o = r2
            r0.f4202p = r8
            r0.f4205s = r4
            java.lang.Object r4 = r5.a(r8, r0)
            if (r4 != r1) goto L75
            return r1
        L75:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L79:
            r0.f4201o = r2     // Catch: java.io.IOException -> L88
            r0.f4202p = r8     // Catch: java.io.IOException -> L88
            r0.f4205s = r3     // Catch: java.io.IOException -> L88
            java.lang.Object r0 = r4.A(r8, r0)     // Catch: java.io.IOException -> L88
            if (r0 != r1) goto L86
            return r1
        L86:
            r1 = r8
        L87:
            return r1
        L88:
            r8 = move-exception
            r0 = r2
        L8a:
            V5.a.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P.m.y(X5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(g6.p r8, X5.g r9, X5.d r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof P.m.p
            if (r0 == 0) goto L13
            r0 = r10
            P.m$p r0 = (P.m.p) r0
            int r1 = r0.f4211t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4211t = r1
            goto L18
        L13:
            P.m$p r0 = new P.m$p
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f4209r
            java.lang.Object r1 = Y5.b.c()
            int r2 = r0.f4211t
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.f4207p
            java.lang.Object r9 = r0.f4206o
            P.m r9 = (P.m) r9
            V5.o.b(r10)
            goto L8e
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f4208q
            java.lang.Object r9 = r0.f4207p
            P.c r9 = (P.c) r9
            java.lang.Object r2 = r0.f4206o
            P.m r2 = (P.m) r2
            V5.o.b(r10)
            goto L73
        L49:
            V5.o.b(r10)
            s6.j r10 = r7.f4134h
            java.lang.Object r10 = r10.getValue()
            P.c r10 = (P.c) r10
            r10.a()
            java.lang.Object r2 = r10.b()
            P.m$q r6 = new P.m$q
            r6.<init>(r8, r2, r3)
            r0.f4206o = r7
            r0.f4207p = r10
            r0.f4208q = r2
            r0.f4211t = r5
            java.lang.Object r8 = p6.AbstractC1848g.g(r9, r6, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L73:
            r9.a()
            boolean r9 = kotlin.jvm.internal.Intrinsics.a(r8, r10)
            if (r9 == 0) goto L7d
            goto La0
        L7d:
            r0.f4206o = r2
            r0.f4207p = r10
            r0.f4208q = r3
            r0.f4211t = r4
            java.lang.Object r8 = r2.A(r10, r0)
            if (r8 != r1) goto L8c
            return r1
        L8c:
            r8 = r10
            r9 = r2
        L8e:
            s6.j r9 = r9.f4134h
            P.c r10 = new P.c
            if (r8 == 0) goto L99
            int r0 = r8.hashCode()
            goto L9a
        L99:
            r0 = 0
        L9a:
            r10.<init>(r8, r0)
            r9.setValue(r10)
        La0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: P.m.z(g6.p, X5.g, X5.d):java.lang.Object");
    }
}
