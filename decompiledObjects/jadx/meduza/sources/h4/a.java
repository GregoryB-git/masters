package h4;

import c4.h;
import c4.i;
import c4.j;
import c4.s;
import c4.t;
import c4.v;
import h4.b;
import k4.g;
import org.xmlpull.v1.XmlPullParserException;
import p4.a;
import v3.a1;
import v3.i0;
import v5.m;
import v5.u;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: b, reason: collision with root package name */
    public j f7072b;

    /* renamed from: c, reason: collision with root package name */
    public int f7073c;

    /* renamed from: d, reason: collision with root package name */
    public int f7074d;

    /* renamed from: e, reason: collision with root package name */
    public int f7075e;

    /* renamed from: g, reason: collision with root package name */
    public v4.b f7076g;

    /* renamed from: h, reason: collision with root package name */
    public i f7077h;

    /* renamed from: i, reason: collision with root package name */
    public c f7078i;

    /* renamed from: j, reason: collision with root package name */
    public g f7079j;

    /* renamed from: a, reason: collision with root package name */
    public final u f7071a = new u(6);
    public long f = -1;

    public final void a() {
        c(new a.b[0]);
        j jVar = this.f7072b;
        jVar.getClass();
        jVar.m();
        this.f7072b.t(new t.b(-9223372036854775807L));
        this.f7073c = 6;
    }

    @Override // c4.h
    public final void b(j jVar) {
        this.f7072b = jVar;
    }

    public final void c(a.b... bVarArr) {
        j jVar = this.f7072b;
        jVar.getClass();
        v r10 = jVar.r(1024, 4);
        i0.a aVar = new i0.a();
        aVar.f15471j = "image/jpeg";
        aVar.f15470i = new p4.a(bVarArr);
        r10.d(new i0(aVar));
    }

    @Override // c4.h
    public final int d(i iVar, s sVar) {
        String p10;
        b bVar;
        long j10;
        int i10 = this.f7073c;
        int i11 = 4;
        if (i10 == 0) {
            this.f7071a.D(2);
            iVar.readFully(this.f7071a.f15974a, 0, 2);
            int A = this.f7071a.A();
            this.f7074d = A;
            if (A == 65498) {
                if (this.f == -1) {
                    a();
                }
                this.f7073c = i11;
            } else if ((A < 65488 || A > 65497) && A != 65281) {
                i11 = 1;
                this.f7073c = i11;
            }
            return 0;
        }
        if (i10 == 1) {
            this.f7071a.D(2);
            iVar.readFully(this.f7071a.f15974a, 0, 2);
            this.f7075e = this.f7071a.A() - 2;
            this.f7073c = 2;
            return 0;
        }
        if (i10 != 2) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f7078i == null || iVar != this.f7077h) {
                    this.f7077h = iVar;
                    this.f7078i = new c(iVar, this.f);
                }
                g gVar = this.f7079j;
                gVar.getClass();
                int d10 = gVar.d(this.f7078i, sVar);
                if (d10 == 1) {
                    sVar.f2313a += this.f;
                }
                return d10;
            }
            long position = iVar.getPosition();
            long j11 = this.f;
            if (position != j11) {
                sVar.f2313a = j11;
                return 1;
            }
            if (iVar.c(this.f7071a.f15974a, 0, 1, true)) {
                iVar.i();
                if (this.f7079j == null) {
                    this.f7079j = new g();
                }
                c cVar = new c(iVar, this.f);
                this.f7078i = cVar;
                if (this.f7079j.i(cVar)) {
                    g gVar2 = this.f7079j;
                    long j12 = this.f;
                    j jVar = this.f7072b;
                    jVar.getClass();
                    gVar2.f9021r = new d(j12, jVar);
                    v4.b bVar2 = this.f7076g;
                    bVar2.getClass();
                    c(bVar2);
                    this.f7073c = 5;
                    return 0;
                }
            }
            a();
            return 0;
        }
        if (this.f7074d == 65505) {
            u uVar = new u(this.f7075e);
            iVar.readFully(uVar.f15974a, 0, this.f7075e);
            if (this.f7076g == null && "http://ns.adobe.com/xap/1.0/".equals(uVar.p()) && (p10 = uVar.p()) != null) {
                long length = iVar.getLength();
                v4.b bVar3 = null;
                if (length != -1) {
                    try {
                        bVar = e.a(p10);
                    } catch (NumberFormatException | XmlPullParserException | a1 unused) {
                        m.f("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        bVar = null;
                    }
                    if (bVar != null && bVar.f7081b.size() >= 2) {
                        long j13 = -1;
                        long j14 = -1;
                        long j15 = -1;
                        long j16 = -1;
                        boolean z10 = false;
                        for (int size = bVar.f7081b.size() - 1; size >= 0; size--) {
                            b.a aVar = bVar.f7081b.get(size);
                            z10 |= "video/mp4".equals(aVar.f7082a);
                            if (size == 0) {
                                j10 = length - aVar.f7084c;
                                length = 0;
                            } else {
                                long j17 = length - aVar.f7083b;
                                j10 = length;
                                length = j17;
                            }
                            if (z10 && length != j10) {
                                j16 = j10 - length;
                                z10 = false;
                                j15 = length;
                            }
                            if (size == 0) {
                                j14 = j10;
                                j13 = length;
                            }
                        }
                        if (j15 != -1 && j16 != -1 && j13 != -1 && j14 != -1) {
                            bVar3 = new v4.b(j13, j14, bVar.f7080a, j15, j16);
                        }
                    }
                }
                this.f7076g = bVar3;
                if (bVar3 != null) {
                    this.f = bVar3.f15852d;
                }
            }
        } else {
            iVar.j(this.f7075e);
        }
        this.f7073c = 0;
        return 0;
    }

    public final int e(c4.e eVar) {
        this.f7071a.D(2);
        eVar.c(this.f7071a.f15974a, 0, 2, false);
        return this.f7071a.A();
    }

    @Override // c4.h
    public final void f(long j10, long j11) {
        if (j10 == 0) {
            this.f7073c = 0;
            this.f7079j = null;
        } else if (this.f7073c == 5) {
            g gVar = this.f7079j;
            gVar.getClass();
            gVar.f(j10, j11);
        }
    }

    @Override // c4.h
    public final boolean i(i iVar) {
        c4.e eVar = (c4.e) iVar;
        if (e(eVar) != 65496) {
            return false;
        }
        int e10 = e(eVar);
        this.f7074d = e10;
        if (e10 == 65504) {
            this.f7071a.D(2);
            eVar.c(this.f7071a.f15974a, 0, 2, false);
            eVar.k(this.f7071a.A() - 2, false);
            this.f7074d = e(eVar);
        }
        if (this.f7074d != 65505) {
            return false;
        }
        eVar.k(2, false);
        this.f7071a.D(6);
        eVar.c(this.f7071a.f15974a, 0, 6, false);
        return this.f7071a.w() == 1165519206 && this.f7071a.A() == 0;
    }

    @Override // c4.h
    public final void release() {
        g gVar = this.f7079j;
        if (gVar != null) {
            gVar.getClass();
        }
    }
}
