package e4;

import o7.l0;
import o7.t;
import v3.i0;
import v5.e0;
import v5.m;
import v5.u;

/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final t<a> f3929a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3930b;

    public f(int i10, l0 l0Var) {
        this.f3930b = i10;
        this.f3929a = l0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i10, u uVar) {
        a aVar;
        String str;
        a gVar;
        t.a aVar2 = new t.a();
        int i11 = uVar.f15976c;
        int i12 = -2;
        while (uVar.f15976c - uVar.f15975b > 8) {
            int i13 = uVar.i();
            int i14 = uVar.f15975b + uVar.i();
            uVar.F(i14);
            if (i13 != 1414744396) {
                switch (i13) {
                    case 1718776947:
                        if (i12 == 2) {
                            uVar.H(4);
                            int i15 = uVar.i();
                            int i16 = uVar.i();
                            uVar.H(4);
                            int i17 = uVar.i();
                            switch (i17) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                i0.a aVar3 = new i0.a();
                                aVar3.f15477p = i15;
                                aVar3.f15478q = i16;
                                aVar3.f15472k = str;
                                gVar = new g(new i0(aVar3));
                                aVar = gVar;
                                break;
                            } else {
                                defpackage.f.p("Ignoring track with unsupported compression ", i17, "StreamFormatChunk");
                            }
                        } else if (i12 == 1) {
                            int n2 = uVar.n();
                            String str2 = n2 != 1 ? n2 != 85 ? n2 != 255 ? n2 != 8192 ? n2 != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 != null) {
                                int n10 = uVar.n();
                                int i18 = uVar.i();
                                uVar.H(6);
                                int v10 = e0.v(uVar.A());
                                int n11 = uVar.n();
                                byte[] bArr = new byte[n11];
                                uVar.d(bArr, 0, n11);
                                i0.a aVar4 = new i0.a();
                                aVar4.f15472k = str2;
                                aVar4.f15484x = n10;
                                aVar4.f15485y = i18;
                                if ("audio/raw".equals(str2) && v10 != 0) {
                                    aVar4.f15486z = v10;
                                }
                                if ("audio/mp4a-latm".equals(str2) && n11 > 0) {
                                    aVar4.f15474m = t.t(bArr);
                                }
                                aVar = new g(new i0(aVar4));
                                break;
                            } else {
                                defpackage.f.p("Ignoring track with unsupported format tag ", n2, "StreamFormatChunk");
                            }
                        } else {
                            StringBuilder l10 = defpackage.f.l("Ignoring strf box for unsupported track type: ");
                            l10.append(e0.A(i12));
                            m.f("StreamFormatChunk", l10.toString());
                        }
                        aVar = null;
                        break;
                    case 1751742049:
                        int i19 = uVar.i();
                        uVar.H(8);
                        int i20 = uVar.i();
                        int i21 = uVar.i();
                        uVar.H(4);
                        uVar.i();
                        uVar.H(12);
                        aVar = new c(i19, i20, i21);
                        break;
                    case 1752331379:
                        int i22 = uVar.i();
                        uVar.H(12);
                        uVar.i();
                        int i23 = uVar.i();
                        int i24 = uVar.i();
                        uVar.H(4);
                        int i25 = uVar.i();
                        int i26 = uVar.i();
                        uVar.H(8);
                        gVar = new d(i22, i23, i24, i25, i26);
                        aVar = gVar;
                        break;
                    case 1852994675:
                        aVar = new h(uVar.s(uVar.f15976c - uVar.f15975b));
                        break;
                    default:
                        aVar = null;
                        break;
                }
            } else {
                aVar = b(uVar.i(), uVar);
            }
            if (aVar != null) {
                if (aVar.getType() == 1752331379) {
                    d dVar = (d) aVar;
                    int i27 = dVar.f3913a;
                    if (i27 == 1935960438) {
                        i12 = 2;
                    } else if (i27 == 1935963489) {
                        i12 = 1;
                    } else if (i27 != 1937012852) {
                        StringBuilder l11 = defpackage.f.l("Found unsupported streamType fourCC: ");
                        l11.append(Integer.toHexString(dVar.f3913a));
                        m.f("AviStreamHeaderChunk", l11.toString());
                        i12 = -1;
                    } else {
                        i12 = 3;
                    }
                }
                aVar2.c(aVar);
            }
            uVar.G(i14);
            uVar.F(i11);
        }
        return new f(i10, aVar2.e());
    }

    public final <T extends a> T a(Class<T> cls) {
        t.b listIterator = this.f3929a.listIterator(0);
        while (listIterator.hasNext()) {
            T t = (T) listIterator.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    @Override // e4.a
    public final int getType() {
        return this.f3930b;
    }
}
