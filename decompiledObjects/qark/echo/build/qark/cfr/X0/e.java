/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  android.util.SparseArray
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.UUID
 */
package X0;

import F0.F;
import F0.L;
import F0.M;
import F0.T;
import F0.U;
import F0.a;
import F0.r;
import F0.s;
import F0.t;
import F0.x;
import X0.a;
import X0.d;
import X0.f;
import X0.g;
import X2.v;
import android.util.Pair;
import android.util.SparseArray;
import c1.t;
import d0.A;
import d0.h;
import d0.i;
import d0.m;
import d0.q;
import g0.o;
import g0.p;
import g0.z;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

public class e
implements r {
    public static final x e0 = new d();
    public static final byte[] f0 = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] g0 = g0.M.r0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    public static final byte[] h0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] i0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    public static final UUID j0 = new UUID(0x100000000001000L, -9223371306706625679L);
    public static final Map k0;
    public boolean A;
    public long B = -1L;
    public long C = -1L;
    public long D = -9223372036854775807L;
    public p E;
    public p F;
    public boolean G;
    public boolean H;
    public int I;
    public long J;
    public long K;
    public int L;
    public int M;
    public int[] N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public long T;
    public int U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final X0.c a;
    public int a0;
    public final g b;
    public byte b0;
    public final SparseArray c;
    public boolean c0;
    public final boolean d;
    public t d0;
    public final boolean e;
    public final t.a f;
    public final z g;
    public final z h;
    public final z i;
    public final z j;
    public final z k;
    public final z l;
    public final z m;
    public final z n;
    public final z o;
    public final z p;
    public ByteBuffer q;
    public long r;
    public long s = -1L;
    public long t = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public long v = -9223372036854775807L;
    public c w;
    public boolean x;
    public int y;
    public long z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"htc_video_rotA-000", (Object)0);
        hashMap.put((Object)"htc_video_rotA-090", (Object)90);
        hashMap.put((Object)"htc_video_rotA-180", (Object)180);
        hashMap.put((Object)"htc_video_rotA-270", (Object)270);
        k0 = Collections.unmodifiableMap((Map)hashMap);
    }

    public e(X0.c c8, int n8, t.a a8) {
        this.a = c8;
        c8.d(new b(null));
        this.f = a8;
        boolean bl = false;
        boolean bl2 = (n8 & 1) == 0;
        this.d = bl2;
        bl2 = bl;
        if ((n8 & 2) == 0) {
            bl2 = true;
        }
        this.e = bl2;
        this.b = new g();
        this.c = new SparseArray();
        this.i = new z(4);
        this.j = new z(ByteBuffer.allocate((int)4).putInt(-1).array());
        this.k = new z(4);
        this.g = new z(h0.d.a);
        this.h = new z(4);
        this.l = new z();
        this.m = new z();
        this.n = new z(8);
        this.o = new z();
        this.p = new z();
        this.N = new int[1];
    }

    public e(t.a a8, int n8) {
        this(new a(), n8, a8);
    }

    public static boolean A(String string2) {
        string2.hashCode();
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 1951062397: {
                if (!string2.equals((Object)"A_OPUS")) break;
                n9 = 32;
                break;
            }
            case 1950789798: {
                if (!string2.equals((Object)"A_FLAC")) break;
                n9 = 31;
                break;
            }
            case 1950749482: {
                if (!string2.equals((Object)"A_EAC3")) break;
                n9 = 30;
                break;
            }
            case 1809237540: {
                if (!string2.equals((Object)"V_MPEG2")) break;
                n9 = 29;
                break;
            }
            case 1422270023: {
                if (!string2.equals((Object)"S_TEXT/UTF8")) break;
                n9 = 28;
                break;
            }
            case 1045209816: {
                if (!string2.equals((Object)"S_TEXT/WEBVTT")) break;
                n9 = 27;
                break;
            }
            case 855502857: {
                if (!string2.equals((Object)"V_MPEGH/ISO/HEVC")) break;
                n9 = 26;
                break;
            }
            case 738597099: {
                if (!string2.equals((Object)"S_TEXT/ASS")) break;
                n9 = 25;
                break;
            }
            case 725957860: {
                if (!string2.equals((Object)"A_PCM/INT/LIT")) break;
                n9 = 24;
                break;
            }
            case 725948237: {
                if (!string2.equals((Object)"A_PCM/INT/BIG")) break;
                n9 = 23;
                break;
            }
            case 635596514: {
                if (!string2.equals((Object)"A_PCM/FLOAT/IEEE")) break;
                n9 = 22;
                break;
            }
            case 542569478: {
                if (!string2.equals((Object)"A_DTS/EXPRESS")) break;
                n9 = 21;
                break;
            }
            case 444813526: {
                if (!string2.equals((Object)"V_THEORA")) break;
                n9 = 20;
                break;
            }
            case 99146302: {
                if (!string2.equals((Object)"S_HDMV/PGS")) break;
                n9 = 19;
                break;
            }
            case 82338134: {
                if (!string2.equals((Object)"V_VP9")) break;
                n9 = 18;
                break;
            }
            case 82338133: {
                if (!string2.equals((Object)"V_VP8")) break;
                n9 = 17;
                break;
            }
            case 82318131: {
                if (!string2.equals((Object)"V_AV1")) break;
                n9 = 16;
                break;
            }
            case 62927045: {
                if (!string2.equals((Object)"A_DTS")) break;
                n9 = 15;
                break;
            }
            case 62923603: {
                if (!string2.equals((Object)"A_AC3")) break;
                n9 = 14;
                break;
            }
            case 62923557: {
                if (!string2.equals((Object)"A_AAC")) break;
                n9 = 13;
                break;
            }
            case -356037306: {
                if (!string2.equals((Object)"A_DTS/LOSSLESS")) break;
                n9 = 12;
                break;
            }
            case -425012669: {
                if (!string2.equals((Object)"S_VOBSUB")) break;
                n9 = 11;
                break;
            }
            case -538363109: {
                if (!string2.equals((Object)"V_MPEG4/ISO/AVC")) break;
                n9 = 10;
                break;
            }
            case -538363189: {
                if (!string2.equals((Object)"V_MPEG4/ISO/ASP")) break;
                n9 = 9;
                break;
            }
            case -933872740: {
                if (!string2.equals((Object)"S_DVBSUB")) break;
                n9 = 8;
                break;
            }
            case -1373388978: {
                if (!string2.equals((Object)"V_MS/VFW/FOURCC")) break;
                n9 = 7;
                break;
            }
            case -1482641357: {
                if (!string2.equals((Object)"A_MPEG/L3")) break;
                n9 = 6;
                break;
            }
            case -1482641358: {
                if (!string2.equals((Object)"A_MPEG/L2")) break;
                n9 = 5;
                break;
            }
            case -1730367663: {
                if (!string2.equals((Object)"A_VORBIS")) break;
                n9 = 4;
                break;
            }
            case -1784763192: {
                if (!string2.equals((Object)"A_TRUEHD")) break;
                n9 = 3;
                break;
            }
            case -1985379776: {
                if (!string2.equals((Object)"A_MS/ACM")) break;
                n9 = 2;
                break;
            }
            case -2095575984: {
                if (!string2.equals((Object)"V_MPEG4/ISO/SP")) break;
                n9 = 1;
                break;
            }
            case -2095576542: {
                if (!string2.equals((Object)"V_MPEG4/ISO/AP")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                return false;
            }
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 31: 
            case 32: 
        }
        return true;
    }

    private static /* synthetic */ r[] C() {
        return new r[]{new e(t.a.a, 2)};
    }

    public static void H(String arrby, long l8, byte[] arrby2) {
        arrby.hashCode();
        int n8 = arrby.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 1422270023: {
                if (!arrby.equals((Object)"S_TEXT/UTF8")) break;
                n9 = 2;
                break;
            }
            case 1045209816: {
                if (!arrby.equals((Object)"S_TEXT/WEBVTT")) break;
                n9 = 1;
                break;
            }
            case 738597099: {
                if (!arrby.equals((Object)"S_TEXT/ASS")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                throw new IllegalArgumentException();
            }
            case 2: {
                arrby = e.u(l8, "%02d:%02d:%02d,%03d", 1000L);
                n9 = 19;
                break;
            }
            case 1: {
                arrby = e.u(l8, "%02d:%02d:%02d.%03d", 1000L);
                n9 = 25;
                break;
            }
            case 0: {
                arrby = e.u(l8, "%01d:%02d:%02d:%02d", 10000L);
                n9 = 21;
            }
        }
        System.arraycopy((Object)arrby, (int)0, (Object)arrby2, (int)n9, (int)arrby.length);
    }

    public static /* synthetic */ r[] c() {
        return e.C();
    }

    public static /* synthetic */ byte[] f() {
        return g0;
    }

    public static /* synthetic */ Map h() {
        return k0;
    }

    private void m() {
        g0.a.h(this.d0);
    }

    public static int[] r(int[] arrn, int n8) {
        if (arrn == null) {
            return new int[n8];
        }
        if (arrn.length >= n8) {
            return arrn;
        }
        return new int[Math.max((int)(arrn.length * 2), (int)n8)];
    }

    public static byte[] u(long l8, String string2, long l9) {
        boolean bl = l8 != -9223372036854775807L;
        g0.a.a(bl);
        int n8 = (int)(l8 / 3600000000L);
        int n9 = (int)((l8 -= (long)n8 * 3600000000L) / 60000000L);
        int n10 = (int)((l8 -= (long)n9 * 60000000L) / 1000000L);
        int n11 = (int)((l8 - (long)n10 * 1000000L) / l9);
        return g0.M.r0(String.format((Locale)Locale.US, (String)string2, (Object[])new Object[]{n8, n9, n10, n11}));
    }

    public boolean B(int n8) {
        if (n8 != 357149030 && n8 != 524531317 && n8 != 475249515 && n8 != 374648427) {
            return false;
        }
        return true;
    }

    public final boolean D(L l8, long l9) {
        if (this.A) {
            this.C = l9;
            l8.a = this.B;
            this.A = false;
            return true;
        }
        if (this.x && (l9 = this.C) != -1L) {
            l8.a = l9;
            this.C = -1L;
            return true;
        }
        return false;
    }

    public final void E(s s8, int n8) {
        if (this.i.g() >= n8) {
            return;
        }
        if (this.i.b() < n8) {
            z z8 = this.i;
            z8.c(Math.max((int)(z8.b() * 2), (int)n8));
        }
        s8.readFully(this.i.e(), this.i.g(), n8 - this.i.g());
        this.i.S(n8);
    }

    public final void F() {
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = false;
        this.l.P(0);
    }

    public final long G(long l8) {
        long l9 = this.t;
        if (l9 != -9223372036854775807L) {
            return g0.M.W0(l8, l9, 1000L);
        }
        throw A.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void I(int n8, long l8, long l9) {
        this.m();
        if (n8 != 160) {
            if (n8 != 174) {
                if (n8 != 187) {
                    if (n8 != 19899) {
                        if (n8 != 20533) {
                            if (n8 != 21968) {
                                if (n8 != 408125543) {
                                    if (n8 != 475249515) {
                                        if (n8 != 524531317) {
                                            return;
                                        }
                                        if (this.x) return;
                                        if (this.d && this.B != -1L) {
                                            this.A = true;
                                            return;
                                        }
                                        this.d0.e(new M.b(this.v));
                                        this.x = true;
                                        return;
                                    }
                                    this.E = new p();
                                    this.F = new p();
                                    return;
                                }
                                long l10 = this.s;
                                if (l10 != -1L && l10 != l8) {
                                    throw A.a("Multiple Segment elements not supported", null);
                                }
                                this.s = l8;
                                this.r = l9;
                                return;
                            }
                            this.v((int)n8).y = true;
                            return;
                        }
                        this.v((int)n8).h = true;
                        return;
                    }
                    this.y = -1;
                    this.z = -1L;
                    return;
                }
                this.G = false;
                return;
            }
            this.w = new c();
            return;
        }
        this.S = false;
        this.T = 0L;
    }

    public void J(int n8, String string2) {
        if (n8 != 134) {
            if (n8 != 17026) {
                if (n8 != 21358) {
                    if (n8 != 2274716) {
                        return;
                    }
                    this.v(n8).X = string2;
                    return;
                }
                this.v((int)n8).a = string2;
                return;
            }
            if (!"webm".equals((Object)string2)) {
                if ("matroska".equals((Object)string2)) {
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("DocType ");
                stringBuilder.append(string2);
                stringBuilder.append(" not supported");
                throw A.a(stringBuilder.toString(), null);
            }
        } else {
            this.v((int)n8).b = string2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int K(s s8, c c8, int n8, boolean bl) {
        int n9;
        ByteBuffer byteBuffer;
        int n10;
        if ("S_TEXT/UTF8".equals((Object)c8.b)) {
            this.L(s8, f0, n8);
            do {
                return this.s();
                break;
            } while (true);
        }
        if ("S_TEXT/ASS".equals((Object)c8.b)) {
            this.L(s8, h0, n8);
            return this.s();
        }
        if ("S_TEXT/WEBVTT".equals((Object)c8.b)) {
            this.L(s8, i0, n8);
            return this.s();
        }
        T t8 = c8.Y;
        boolean bl2 = this.X;
        boolean bl3 = true;
        if (!bl2) {
            if (c8.h) {
                this.Q &= -1073741825;
                bl2 = this.Y;
                n10 = 128;
                if (!bl2) {
                    s8.readFully(this.i.e(), 0, 1);
                    ++this.U;
                    if ((this.i.e()[0] & 128) == 128) throw A.a("Extension bit is set in signal byte", null);
                    this.b0 = this.i.e()[0];
                    this.Y = true;
                }
                if (((n9 = this.b0) & 1) == 1) {
                    n9 = (n9 & 2) == 2 ? 1 : 0;
                    this.Q |= 1073741824;
                    if (!this.c0) {
                        s8.readFully(this.n.e(), 0, 8);
                        this.U += 8;
                        this.c0 = true;
                        byteBuffer = this.i.e();
                        if (n9 == 0) {
                            n10 = 0;
                        }
                        byteBuffer[0] = (byte)(n10 | 8);
                        this.i.T(0);
                        t8.a(this.i, 1, 1);
                        ++this.V;
                        this.n.T(0);
                        t8.a(this.n, 8, 1);
                        this.V += 8;
                    }
                    if (n9 != 0) {
                        int n11;
                        if (!this.Z) {
                            s8.readFully(this.i.e(), 0, 1);
                            ++this.U;
                            this.i.T(0);
                            this.a0 = this.i.G();
                            this.Z = true;
                        }
                        n9 = this.a0 * 4;
                        this.i.P(n9);
                        s8.readFully(this.i.e(), 0, n9);
                        this.U += n9;
                        short s9 = (short)(this.a0 / 2 + 1);
                        int n12 = s9 * 6 + 2;
                        byteBuffer = this.q;
                        if (byteBuffer == null || byteBuffer.capacity() < n12) {
                            this.q = ByteBuffer.allocate((int)n12);
                        }
                        this.q.position(0);
                        this.q.putShort(s9);
                        n10 = n9 = 0;
                        while (n9 < (n11 = this.a0)) {
                            n11 = this.i.K();
                            if (n9 % 2 == 0) {
                                this.q.putShort((short)(n11 - n10));
                            } else {
                                this.q.putInt(n11 - n10);
                            }
                            ++n9;
                            n10 = n11;
                        }
                        n9 = n8 - this.U - n10;
                        byteBuffer = this.q;
                        if (n11 % 2 == 1) {
                            byteBuffer.putInt(n9);
                        } else {
                            byteBuffer.putShort((short)n9);
                            this.q.putInt(0);
                        }
                        this.o.R(this.q.array(), n12);
                        t8.a(this.o, n12, 1);
                        this.V += n12;
                    }
                }
            } else {
                byteBuffer = c8.i;
                if (byteBuffer != null) {
                    this.l.R((byte[])byteBuffer, byteBuffer.length);
                }
            }
            if (c8.o(bl)) {
                this.Q |= 268435456;
                this.p.P(0);
                n9 = this.l.g() + n8 - this.U;
                this.i.P(4);
                this.i.e()[0] = (byte)(n9 >> 24 & 255);
                this.i.e()[1] = (byte)(n9 >> 16 & 255);
                this.i.e()[2] = (byte)(n9 >> 8 & 255);
                this.i.e()[3] = (byte)(n9 & 255);
                t8.a(this.i, 4, 2);
                this.V += 4;
            }
            this.X = true;
        }
        n8 += this.l.g();
        if (!"V_MPEG4/ISO/AVC".equals((Object)c8.b) && !"V_MPEGH/ISO/HEVC".equals((Object)c8.b)) {
            if (c8.U != null) {
                bl = this.l.g() == 0 ? bl3 : false;
                g0.a.f(bl);
                c8.U.d(s8);
            }
            while ((n9 = this.U) < n8) {
                n9 = this.M(s8, t8, n8 - n9);
                this.U += n9;
                this.V += n9;
            }
        } else {
            byteBuffer = this.h.e();
            byteBuffer[0] = 0;
            byteBuffer[1] = 0;
            byteBuffer[2] = 0;
            n9 = c8.Z;
            while (this.U < n8) {
                n10 = this.W;
                if (n10 == 0) {
                    this.N(s8, (byte[])byteBuffer, 4 - n9, n9);
                    this.U += n9;
                    this.h.T(0);
                    this.W = this.h.K();
                    this.g.T(0);
                    t8.e(this.g, 4);
                    this.V += 4;
                    continue;
                }
                n10 = this.M(s8, t8, n10);
                this.U += n10;
                this.V += n10;
                this.W -= n10;
            }
        }
        if (!"A_VORBIS".equals((Object)c8.b)) return this.s();
        this.j.T(0);
        t8.e(this.j, 4);
        this.V += 4;
        return this.s();
    }

    public final void L(s s8, byte[] arrby, int n8) {
        int n9 = arrby.length + n8;
        if (this.m.b() < n9) {
            this.m.Q(Arrays.copyOf((byte[])arrby, (int)(n9 + n8)));
        } else {
            System.arraycopy((Object)arrby, (int)0, (Object)this.m.e(), (int)0, (int)arrby.length);
        }
        s8.readFully(this.m.e(), arrby.length, n8);
        this.m.T(0);
        this.m.S(n9);
    }

    public final int M(s s8, T t8, int n8) {
        int n9 = this.l.a();
        if (n9 > 0) {
            n8 = Math.min((int)n8, (int)n9);
            t8.e(this.l, n8);
            return n8;
        }
        return t8.f(s8, n8, false);
    }

    public final void N(s s8, byte[] arrby, int n8, int n9) {
        int n10 = Math.min((int)n9, (int)this.l.a());
        s8.readFully(arrby, n8 + n10, n9 - n10);
        if (n10 > 0) {
            this.l.l(arrby, n8, n10);
        }
    }

    @Override
    public void a(long l8, long l9) {
        this.D = -9223372036854775807L;
        this.I = 0;
        this.a.b();
        this.b.e();
        this.F();
        for (int i8 = 0; i8 < this.c.size(); ++i8) {
            ((c)this.c.valueAt(i8)).n();
        }
    }

    @Override
    public final void b(t t8) {
        this.d0 = t8;
        t t9 = t8;
        if (this.e) {
            t9 = new c1.v(t8, this.f);
        }
        this.d0 = t9;
    }

    @Override
    public /* synthetic */ r d() {
        return F0.q.b(this);
    }

    @Override
    public final boolean e(s s8) {
        return new f().b(s8);
    }

    @Override
    public /* synthetic */ List g() {
        return F0.q.a(this);
    }

    @Override
    public final int i(s object, L l8) {
        int n8 = 0;
        this.H = false;
        boolean bl = true;
        while (bl && !this.H) {
            boolean bl2;
            bl = bl2 = this.a.c((s)object);
            if (!bl2) continue;
            bl = bl2;
            if (!this.D(l8, object.p())) continue;
            return 1;
        }
        if (!bl) {
            while (n8 < this.c.size()) {
                object = (c)this.c.valueAt(n8);
                ((c)object).f();
                object.j();
                ++n8;
            }
            return -1;
        }
        return 0;
    }

    public final void k(int n8) {
        if (this.E != null && this.F != null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Element ");
        stringBuilder.append(n8);
        stringBuilder.append(" must be in a Cues");
        throw A.a(stringBuilder.toString(), null);
    }

    public final void l(int n8) {
        if (this.w != null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Element ");
        stringBuilder.append(n8);
        stringBuilder.append(" must be in a TrackEntry");
        throw A.a(stringBuilder.toString(), null);
    }

    public void n(int n8, int n9, s s8) {
        int[] arrn;
        c c8;
        long l8;
        block33 : {
            int n10;
            if (n8 != 161 && n8 != 163) {
                if (n8 != 165) {
                    if (n8 != 16877) {
                        if (n8 != 16981) {
                            if (n8 != 18402) {
                                if (n8 != 21419) {
                                    if (n8 != 25506) {
                                        if (n8 == 30322) {
                                            this.l(n8);
                                            c c9 = this.w;
                                            byte[] arrby = new byte[n9];
                                            c9.w = arrby;
                                            s8.readFully(arrby, 0, n9);
                                            return;
                                        }
                                        s8 = new StringBuilder();
                                        s8.append("Unexpected id: ");
                                        s8.append(n8);
                                        throw A.a(s8.toString(), null);
                                    }
                                    this.l(n8);
                                    c c10 = this.w;
                                    byte[] arrby = new byte[n9];
                                    c10.k = arrby;
                                    s8.readFully(arrby, 0, n9);
                                    return;
                                }
                                Arrays.fill((byte[])this.k.e(), (byte)0);
                                s8.readFully(this.k.e(), 4 - n9, n9);
                                this.k.T(0);
                                this.y = (int)this.k.I();
                                return;
                            }
                            byte[] arrby = new byte[n9];
                            s8.readFully(arrby, 0, n9);
                            this.v((int)n8).j = new T.a(1, arrby, 0, 0);
                            return;
                        }
                        this.l(n8);
                        c c11 = this.w;
                        byte[] arrby = new byte[n9];
                        c11.i = arrby;
                        s8.readFully(arrby, 0, n9);
                        return;
                    }
                    this.x(this.v(n8), s8, n9);
                    return;
                }
                if (this.I != 2) {
                    return;
                }
                this.y((c)this.c.get(this.O), this.R, s8, n9);
                return;
            }
            if (this.I == 0) {
                this.O = (int)this.b.d(s8, false, true, 8);
                this.P = this.b.b();
                this.K = -9223372036854775807L;
                this.I = 1;
                this.i.P(0);
            }
            if ((c8 = (c)this.c.get(this.O)) == null) {
                s8.i(n9 - this.P);
                this.I = 0;
                return;
            }
            c8.f();
            if (this.I != 1) break block33;
            this.E(s8, 3);
            int n11 = (this.i.e()[2] & 6) >> 1;
            if (n11 == 0) {
                this.M = 1;
                this.N = arrn = e.r(this.N, 1);
                arrn[0] = n9 - this.P - 3;
            } else {
                int n12;
                int n13;
                int n14;
                n10 = 4;
                this.E(s8, 4);
                this.M = n14 = (this.i.e()[3] & 255) + 1;
                this.N = arrn = e.r(this.N, n14);
                if (n11 == 2) {
                    n10 = this.P;
                    n11 = this.M;
                    Arrays.fill((int[])arrn, (int)0, (int)n11, (int)((n9 - n10 - 4) / n11));
                } else if (n11 == 1) {
                    n14 = n11 = 0;
                    block0 : while (n11 < (n12 = this.M) - 1) {
                        this.N[n11] = 0;
                        n12 = n10;
                        do {
                            n10 = n12 + 1;
                            this.E(s8, n10);
                            n12 = this.i.e()[n12] & 255;
                            arrn = this.N;
                            arrn[n11] = n13 = arrn[n11] + n12;
                            if (n12 != 255) {
                                n14 += n13;
                                ++n11;
                                continue block0;
                            }
                            n12 = n10;
                        } while (true);
                    }
                    this.N[n12 - 1] = n9 - this.P - n10 - n14;
                } else {
                    if (n11 != 3) {
                        s8 = new StringBuilder();
                        s8.append("Unexpected lacing value: ");
                        s8.append(n11);
                        throw A.a(s8.toString(), null);
                    }
                    n14 = n11 = 0;
                    while (n11 < (n12 = this.M) - 1) {
                        this.N[n11] = 0;
                        n13 = n10 + 1;
                        this.E(s8, n13);
                        if (this.i.e()[n10] != 0) {
                            long l9;
                            block32 : {
                                for (n12 = 0; n12 < 8; ++n12) {
                                    int n15 = 1 << 7 - n12;
                                    if ((this.i.e()[n10] & n15) == 0) continue;
                                    this.E(s8, n13 += n12);
                                    l8 = n15 & (this.i.e()[n10] & 255);
                                    ++n10;
                                    while (n10 < n13) {
                                        l8 = l8 << 8 | (long)(this.i.e()[n10] & 255);
                                        ++n10;
                                    }
                                    l9 = l8;
                                    n10 = n13;
                                    if (n11 > 0) {
                                        l9 = l8 - ((1L << n12 * 7 + 6) - 1L);
                                        n10 = n13;
                                    }
                                    break block32;
                                }
                                l9 = 0L;
                                n10 = n13;
                            }
                            if (l9 >= Integer.MIN_VALUE && l9 <= Integer.MAX_VALUE) {
                                n12 = (int)l9;
                                arrn = this.N;
                                if (n11 != 0) {
                                    n12 += arrn[n11 - 1];
                                }
                                arrn[n11] = n12;
                                n14 += n12;
                                ++n11;
                                continue;
                            }
                            throw A.a("EBML lacing sample size out of range.", null);
                        }
                        throw A.a("No valid varint length mask found", null);
                    }
                    this.N[n12 - 1] = n9 - this.P - n10 - n14;
                }
            }
            n9 = this.i.e()[0];
            n10 = this.i.e()[1];
            this.J = this.D + this.G(n9 << 8 | n10 & 255);
            n9 = c8.d != 2 && (n8 != 163 || (this.i.e()[2] & 128) != 128) ? 0 : 1;
            this.Q = n9;
            this.I = 2;
            this.L = 0;
        }
        if (n8 == 163) {
            while ((n8 = this.L) < this.M) {
                n8 = this.K(s8, c8, this.N[n8], false);
                l8 = this.J;
                this.p(c8, (long)(this.L * c8.e / 1000) + l8, this.Q, n8, 0);
                ++this.L;
            }
            this.I = 0;
            return;
        }
        while ((n8 = this.L++) < this.M) {
            arrn = this.N;
            arrn[n8] = this.K(s8, c8, arrn[n8], true);
        }
    }

    public final M o(p arrl, p arrl2) {
        if (this.s != -1L && this.v != -9223372036854775807L && arrl != null && arrl.c() != 0 && arrl2 != null && arrl2.c() == arrl.c()) {
            long l8;
            int n8;
            int n9 = arrl.c();
            int[] arrn = new int[n9];
            long[] arrl3 = new long[n9];
            long[] arrl4 = new long[n9];
            long[] arrl5 = new long[n9];
            int n10 = 0;
            int n11 = 0;
            do {
                n8 = n10;
                if (n11 >= n9) break;
                arrl5[n11] = arrl.b(n11);
                arrl3[n11] = this.s + arrl2.b(n11);
                ++n11;
            } while (true);
            while (n8 < (n11 = n9 - 1)) {
                n11 = n8 + 1;
                arrn[n8] = (int)(arrl3[n11] - arrl3[n8]);
                arrl4[n8] = arrl5[n11] - arrl5[n8];
                n8 = n11;
            }
            arrn[n11] = (int)(this.s + this.r - arrl3[n11]);
            arrl4[n11] = l8 = this.v - arrl5[n11];
            int[] arrn2 = arrn;
            long[] arrl6 = arrl3;
            arrl2 = arrl4;
            arrl = arrl5;
            if (l8 <= 0L) {
                arrl = new long[]();
                arrl.append("Discarding last cue point with unexpected duration: ");
                arrl.append(l8);
                o.h("MatroskaExtractor", arrl.toString());
                arrn2 = Arrays.copyOf((int[])arrn, (int)n11);
                arrl6 = Arrays.copyOf((long[])arrl3, (int)n11);
                arrl2 = Arrays.copyOf((long[])arrl4, (int)n11);
                arrl = Arrays.copyOf((long[])arrl5, (int)n11);
            }
            return new F0.h(arrn2, arrl6, arrl2, arrl);
        }
        return new M.b(this.v);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void p(c var1_1, long var2_2, int var4_3, int var5_4, int var6_5) {
        block7 : {
            block9 : {
                block10 : {
                    block8 : {
                        block6 : {
                            var10_6 = var1_1.U;
                            if (var10_6 == null) break block6;
                            var10_6.c(var1_1.Y, var2_2, var4_3, var5_4, var6_5, var1_1.j);
                            break block7;
                        }
                        if ("S_TEXT/UTF8".equals((Object)var1_1.b) || "S_TEXT/ASS".equals((Object)var1_1.b)) break block8;
                        var7_7 = var5_4;
                        if (!"S_TEXT/WEBVTT".equals((Object)var1_1.b)) break block9;
                    }
                    if (this.M <= 1) break block10;
                    var10_6 = "Skipping subtitle sample in laced block.";
                    ** GOTO lbl17
                }
                var8_8 = this.K;
                if (var8_8 == -9223372036854775807L) {
                    var10_6 = "Skipping subtitle sample with no duration.";
lbl17: // 2 sources:
                    o.h("MatroskaExtractor", (String)var10_6);
                    var7_7 = var5_4;
                } else {
                    e.H(var1_1.b, var8_8, this.m.e());
                    for (var7_7 = this.m.f(); var7_7 < this.m.g(); ++var7_7) {
                        if (this.m.e()[var7_7] != 0) continue;
                        this.m.S(var7_7);
                        break;
                    }
                    var10_6 = var1_1.Y;
                    var11_9 = this.m;
                    var10_6.e(var11_9, var11_9.g());
                    var7_7 = var5_4 + this.m.g();
                }
            }
            var5_4 = var7_7;
            if ((268435456 & var4_3) != 0) {
                if (this.M > 1) {
                    this.p.P(0);
                    var5_4 = var7_7;
                } else {
                    var5_4 = this.p.g();
                    var1_1.Y.a(this.p, var5_4, 2);
                    var5_4 = var7_7 + var5_4;
                }
            }
            var1_1.Y.b(var2_2, var4_3, var5_4, var6_5, var1_1.j);
        }
        this.H = true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void q(int n8) {
        int n9;
        this.m();
        if (n8 != 160) {
            if (n8 != 174) {
                long l8;
                if (n8 != 19899) {
                    if (n8 != 25152) {
                        if (n8 != 28032) {
                            long l9;
                            if (n8 != 357149030) {
                                if (n8 != 374648427) {
                                    if (n8 != 475249515) {
                                        return;
                                    }
                                    if (!this.x) {
                                        this.d0.e(this.o(this.E, this.F));
                                        this.x = true;
                                    }
                                    this.E = null;
                                    this.F = null;
                                    return;
                                }
                                if (this.c.size() == 0) throw A.a("No valid tracks were found", null);
                                this.d0.j();
                                return;
                            }
                            if (this.t == -9223372036854775807L) {
                                this.t = 1000000L;
                            }
                            if ((l9 = this.u) == -9223372036854775807L) return;
                            this.v = this.G(l9);
                            return;
                        }
                        this.l(n8);
                        c c8 = this.w;
                        if (!c8.h) return;
                        if (c8.i != null) throw A.a("Combining encryption and compression is not supported", null);
                        return;
                    }
                    this.l(n8);
                    c c9 = this.w;
                    if (!c9.h) return;
                    if (c9.j == null) throw A.a("Encrypted Track found but ContentEncKeyID was not found", null);
                    c9.l = new m(new m.b(d0.g.a, "video/webm", this.w.j.b));
                    return;
                }
                n8 = this.y;
                if (n8 == -1 || (l8 = this.z) == -1L) throw A.a("Mandatory element SeekID or SeekPosition not found", null);
                if (n8 != 475249515) return;
                this.B = l8;
                return;
            }
            c c10 = (c)g0.a.h(this.w);
            String string2 = c10.b;
            if (string2 == null) throw A.a("CodecId is missing in TrackEntry element", null);
            if (e.A(string2)) {
                c10.i(this.d0, c10.c);
                this.c.put(c10.c, (Object)c10);
            }
            this.w = null;
            return;
        }
        if (this.I != 2) {
            return;
        }
        c c11 = (c)this.c.get(this.O);
        c11.f();
        if (this.T > 0L && "A_OPUS".equals((Object)c11.b)) {
            this.p.Q(ByteBuffer.allocate((int)8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.T).array());
        }
        n8 = n9 = 0;
        while (n9 < this.M) {
            n8 += this.N[n9];
            ++n9;
        }
        for (n9 = 0; n9 < this.M; ++n9) {
            int n10;
            long l10 = this.J;
            long l11 = c11.e * n9 / 1000;
            int n11 = n10 = this.Q;
            if (n9 == 0) {
                n11 = n10;
                if (!this.S) {
                    n11 = n10 | 1;
                }
            }
            n10 = this.N[n9];
            this.p(c11, l10 + l11, n11, n10, n8 -= n10);
        }
        this.I = 0;
    }

    @Override
    public final void release() {
    }

    public final int s() {
        int n8 = this.V;
        this.F();
        return n8;
    }

    public void t(int n8, double d8) {
        if (n8 != 181) {
            if (n8 != 17545) {
                switch (n8) {
                    default: {
                        switch (n8) {
                            default: {
                                return;
                            }
                            case 30325: {
                                this.v((int)n8).v = (float)d8;
                                return;
                            }
                            case 30324: {
                                this.v((int)n8).u = (float)d8;
                                return;
                            }
                            case 30323: 
                        }
                        this.v((int)n8).t = (float)d8;
                        return;
                    }
                    case 21978: {
                        this.v((int)n8).N = (float)d8;
                        return;
                    }
                    case 21977: {
                        this.v((int)n8).M = (float)d8;
                        return;
                    }
                    case 21976: {
                        this.v((int)n8).L = (float)d8;
                        return;
                    }
                    case 21975: {
                        this.v((int)n8).K = (float)d8;
                        return;
                    }
                    case 21974: {
                        this.v((int)n8).J = (float)d8;
                        return;
                    }
                    case 21973: {
                        this.v((int)n8).I = (float)d8;
                        return;
                    }
                    case 21972: {
                        this.v((int)n8).H = (float)d8;
                        return;
                    }
                    case 21971: {
                        this.v((int)n8).G = (float)d8;
                        return;
                    }
                    case 21970: {
                        this.v((int)n8).F = (float)d8;
                        return;
                    }
                    case 21969: 
                }
                this.v((int)n8).E = (float)d8;
                return;
            }
            this.u = (long)d8;
            return;
        }
        this.v((int)n8).R = (int)d8;
    }

    public c v(int n8) {
        this.l(n8);
        return this.w;
    }

    public int w(int n8) {
        switch (n8) {
            default: {
                return 0;
            }
            case 181: 
            case 17545: 
            case 21969: 
            case 21970: 
            case 21971: 
            case 21972: 
            case 21973: 
            case 21974: 
            case 21975: 
            case 21976: 
            case 21977: 
            case 21978: 
            case 30323: 
            case 30324: 
            case 30325: {
                return 5;
            }
            case 161: 
            case 163: 
            case 165: 
            case 16877: 
            case 16981: 
            case 18402: 
            case 21419: 
            case 25506: 
            case 30322: {
                return 4;
            }
            case 160: 
            case 166: 
            case 174: 
            case 183: 
            case 187: 
            case 224: 
            case 225: 
            case 16868: 
            case 18407: 
            case 19899: 
            case 20532: 
            case 20533: 
            case 21936: 
            case 21968: 
            case 25152: 
            case 28032: 
            case 30113: 
            case 30320: 
            case 290298740: 
            case 357149030: 
            case 374648427: 
            case 408125543: 
            case 440786851: 
            case 475249515: 
            case 524531317: {
                return 1;
            }
            case 134: 
            case 17026: 
            case 21358: 
            case 2274716: {
                return 3;
            }
            case 131: 
            case 136: 
            case 155: 
            case 159: 
            case 176: 
            case 179: 
            case 186: 
            case 215: 
            case 231: 
            case 238: 
            case 241: 
            case 251: 
            case 16871: 
            case 16980: 
            case 17029: 
            case 17143: 
            case 18401: 
            case 18408: 
            case 20529: 
            case 20530: 
            case 21420: 
            case 21432: 
            case 21680: 
            case 21682: 
            case 21690: 
            case 21930: 
            case 21938: 
            case 21945: 
            case 21946: 
            case 21947: 
            case 21948: 
            case 21949: 
            case 21998: 
            case 22186: 
            case 22203: 
            case 25188: 
            case 30114: 
            case 30321: 
            case 2352003: 
            case 2807729: 
        }
        return 2;
    }

    public void x(c c8, s s8, int n8) {
        if (c8.g != 1685485123 && c8.g != 1685480259) {
            s8.i(n8);
            return;
        }
        byte[] arrby = new byte[n8];
        c8.O = arrby;
        s8.readFully(arrby, 0, n8);
    }

    public void y(c c8, int n8, s s8, int n9) {
        if (n8 == 4 && "V_VP9".equals((Object)c8.b)) {
            this.p.P(n9);
            s8.readFully(this.p.e(), 0, n9);
            return;
        }
        s8.i(n9);
    }

    public void z(int n8, long l8) {
        block70 : {
            block69 : {
                block67 : {
                    block68 : {
                        if (n8 == 20529) break block67;
                        if (n8 == 20530) break block68;
                        boolean bl = false;
                        boolean bl2 = false;
                        switch (n8) {
                            default: {
                                switch (n8) {
                                    default: {
                                        return;
                                    }
                                    case 21949: {
                                        this.v((int)n8).D = (int)l8;
                                        return;
                                    }
                                    case 21948: {
                                        this.v((int)n8).C = (int)l8;
                                        return;
                                    }
                                    case 21947: {
                                        this.l(n8);
                                        this.w.y = true;
                                        n8 = h.j((int)l8);
                                        if (n8 != -1) {
                                            this.w.z = n8;
                                            return;
                                        }
                                        break block69;
                                    }
                                    case 21946: {
                                        this.l(n8);
                                        n8 = h.k((int)l8);
                                        if (n8 != -1) {
                                            this.w.A = n8;
                                            return;
                                        }
                                        break block69;
                                    }
                                    case 21945: 
                                }
                                this.l(n8);
                                n8 = (int)l8;
                                if (n8 != 1) {
                                    if (n8 != 2) {
                                        return;
                                    }
                                    this.w.B = 1;
                                    return;
                                }
                                this.w.B = 2;
                                return;
                            }
                            case 2807729: {
                                this.t = l8;
                                return;
                            }
                            case 2352003: {
                                this.v((int)n8).e = (int)l8;
                                return;
                            }
                            case 30321: {
                                this.l(n8);
                                n8 = (int)l8;
                                if (n8 != 0) {
                                    if (n8 != 1) {
                                        if (n8 != 2) {
                                            if (n8 != 3) {
                                                return;
                                            }
                                            this.w.s = 3;
                                            return;
                                        }
                                        this.w.s = 2;
                                        return;
                                    }
                                    this.w.s = 1;
                                    return;
                                }
                                this.w.s = 0;
                                return;
                            }
                            case 30114: {
                                this.T = l8;
                                return;
                            }
                            case 25188: {
                                this.v((int)n8).Q = (int)l8;
                                return;
                            }
                            case 22203: {
                                this.v((int)n8).T = l8;
                                return;
                            }
                            case 22186: {
                                this.v((int)n8).S = l8;
                                return;
                            }
                            case 21998: {
                                this.v((int)n8).f = (int)l8;
                                return;
                            }
                            case 21938: {
                                this.l(n8);
                                c c8 = this.w;
                                c8.y = true;
                                c8.o = (int)l8;
                                return;
                            }
                            case 21930: {
                                c c9 = this.v(n8);
                                if (l8 == 1L) {
                                    bl2 = true;
                                }
                                c9.V = bl2;
                                return;
                            }
                            case 21690: {
                                this.v((int)n8).q = (int)l8;
                                return;
                            }
                            case 21682: {
                                this.v((int)n8).r = (int)l8;
                                return;
                            }
                            case 21680: {
                                this.v((int)n8).p = (int)l8;
                                return;
                            }
                            case 21432: {
                                int n9 = (int)l8;
                                this.l(n8);
                                if (n9 != 0) {
                                    if (n9 != 1) {
                                        if (n9 != 3) {
                                            if (n9 != 15) {
                                                return;
                                            }
                                            this.w.x = 3;
                                            return;
                                        }
                                        this.w.x = 1;
                                        return;
                                    }
                                    this.w.x = 2;
                                    return;
                                }
                                this.w.x = 0;
                                return;
                            }
                            case 21420: {
                                this.z = l8 + this.s;
                                return;
                            }
                            case 18408: {
                                if (l8 == 1L) {
                                    return;
                                }
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("AESSettingsCipherMode ");
                                stringBuilder.append(l8);
                                stringBuilder.append(" not supported");
                                throw A.a(stringBuilder.toString(), null);
                            }
                            case 18401: {
                                if (l8 == 5L) {
                                    return;
                                }
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("ContentEncAlgo ");
                                stringBuilder.append(l8);
                                stringBuilder.append(" not supported");
                                throw A.a(stringBuilder.toString(), null);
                            }
                            case 17143: {
                                if (l8 == 1L) {
                                    return;
                                }
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("EBMLReadVersion ");
                                stringBuilder.append(l8);
                                stringBuilder.append(" not supported");
                                throw A.a(stringBuilder.toString(), null);
                            }
                            case 17029: {
                                if (l8 >= 1L && l8 <= 2L) {
                                    return;
                                }
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("DocTypeReadVersion ");
                                stringBuilder.append(l8);
                                stringBuilder.append(" not supported");
                                throw A.a(stringBuilder.toString(), null);
                            }
                            case 16980: {
                                if (l8 == 3L) {
                                    return;
                                }
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("ContentCompAlgo ");
                                stringBuilder.append(l8);
                                stringBuilder.append(" not supported");
                                throw A.a(stringBuilder.toString(), null);
                            }
                            case 16871: {
                                this.v(n8).g = (int)l8;
                                return;
                            }
                            case 251: {
                                this.S = true;
                                return;
                            }
                            case 241: {
                                if (!this.G) {
                                    this.k(n8);
                                    this.F.a(l8);
                                    this.G = true;
                                    return;
                                }
                                break block69;
                            }
                            case 238: {
                                this.R = (int)l8;
                                return;
                            }
                            case 231: {
                                this.D = this.G(l8);
                                return;
                            }
                            case 215: {
                                this.v((int)n8).c = (int)l8;
                                return;
                            }
                            case 186: {
                                this.v((int)n8).n = (int)l8;
                                return;
                            }
                            case 179: {
                                this.k(n8);
                                this.E.a(this.G(l8));
                                return;
                            }
                            case 176: {
                                this.v((int)n8).m = (int)l8;
                                return;
                            }
                            case 159: {
                                this.v((int)n8).P = (int)l8;
                                return;
                            }
                            case 155: {
                                this.K = this.G(l8);
                                return;
                            }
                            case 136: {
                                c c10 = this.v(n8);
                                bl2 = bl;
                                if (l8 == 1L) {
                                    bl2 = true;
                                }
                                c10.W = bl2;
                                return;
                            }
                            case 131: 
                        }
                        this.v((int)n8).d = (int)l8;
                        return;
                    }
                    if (l8 == 1L) {
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("ContentEncodingScope ");
                    stringBuilder.append(l8);
                    stringBuilder.append(" not supported");
                    throw A.a(stringBuilder.toString(), null);
                }
                if (l8 != 0L) break block70;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ContentEncodingOrder ");
        stringBuilder.append(l8);
        stringBuilder.append(" not supported");
        throw A.a(stringBuilder.toString(), null);
    }

    public final class b
    implements X0.b {
        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        @Override
        public void a(int n8) {
            e.this.q(n8);
        }

        @Override
        public int b(int n8) {
            return e.this.w(n8);
        }

        @Override
        public void c(int n8, double d8) {
            e.this.t(n8, d8);
        }

        @Override
        public boolean d(int n8) {
            return e.this.B(n8);
        }

        @Override
        public void e(int n8, int n9, s s8) {
            e.this.n(n8, n9, s8);
        }

        @Override
        public void f(int n8, String string2) {
            e.this.J(n8, string2);
        }

        @Override
        public void g(int n8, long l8, long l9) {
            e.this.I(n8, l8, l9);
        }

        @Override
        public void h(int n8, long l8) {
            e.this.z(n8, l8);
        }
    }

    public static final class c {
        public int A = -1;
        public int B = -1;
        public int C = 1000;
        public int D = 200;
        public float E = -1.0f;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public float N = -1.0f;
        public byte[] O;
        public int P = 1;
        public int Q = -1;
        public int R = 8000;
        public long S = 0L;
        public long T = 0L;
        public U U;
        public boolean V;
        public boolean W = true;
        public String X = "eng";
        public T Y;
        public int Z;
        public String a;
        public String b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public byte[] i;
        public T.a j;
        public byte[] k;
        public m l;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = 0;
        public int s = -1;
        public float t = 0.0f;
        public float u = 0.0f;
        public float v = 0.0f;
        public byte[] w = null;
        public int x = -1;
        public boolean y = false;
        public int z = -1;

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public static Pair k(z var0) {
            var0.U(16);
            var2_2 = var0.w();
            if (var2_2 == 1482049860L) {
                return new Pair((Object)"video/divx", (Object)null);
            }
            if (var2_2 == 859189832L) {
                return new Pair((Object)"video/3gpp", (Object)null);
            }
            if (var2_2 != 826496599L) {
                o.h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair((Object)"video/x-unknown", (Object)null);
            }
            var1_3 = var0.f() + 20;
            var0 = var0.e();
            ** while (var1_3 < var0.length - 4)
lbl-1000: // 1 sources:
            {
                block8 : {
                    if (var0[var1_3] == 0 && var0[var1_3 + 1] == 0 && var0[var1_3 + 2] == 1 && var0[var1_3 + 3] == 15) {
                        return new Pair((Object)"video/wvc1", (Object)Collections.singletonList((Object)Arrays.copyOfRange((byte[])var0, (int)var1_3, (int)var0.length)));
                    }
                    break block8;
                    catch (ArrayIndexOutOfBoundsException var0_1) {
                        throw A.a("Error parsing FourCC private data", null);
                    }
                }
                ++var1_3;
                continue;
            }
lbl-1000: // 1 sources:
            {
                throw A.a("Failed to find FourCC VC1 initialization data", null);
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public static boolean l(z z8) {
            long l8;
            long l9;
            try {
                int n8 = z8.y();
                if (n8 == 1) {
                    return true;
                }
                if (n8 != 65534) return false;
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                throw A.a("Error parsing MS/ACM codec private", null);
            }
            z8.T(24);
            if (z8.z() != j0.getMostSignificantBits() || (l8 = z8.z()) != (l9 = j0.getLeastSignificantBits())) return false;
            return true;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static List m(byte[] arrayList) {
            byte[] arrby;
            Object object;
            if (arrayList[0] != 2) throw A.a("Error parsing vorbis codec private", null);
            int n8 = 0;
            int n9 = 1;
            while (((object = arrayList[n9]) & 255) == 255) {
                n8 += 255;
                ++n9;
            }
            Object object2 = n9 + 1;
            object = n8 + (object & 255);
            n9 = 0;
            n8 = object2;
            while (((object2 = (Object)arrayList[n8]) & 255) == 255) {
                n9 += 255;
                ++n8;
            }
            if (arrayList[++n8] != true) throw A.a("Error parsing vorbis codec private", null);
            try {
                arrby = new byte[object];
                System.arraycopy((Object)arrayList, (int)n8, (Object)arrby, (int)0, (int)object);
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                throw A.a("Error parsing vorbis codec private", null);
            }
            if (arrayList[n8 += object] != 3) throw A.a("Error parsing vorbis codec private", null);
            if (arrayList[n9 = n8 + (n9 + (object2 & 255))] != 5) throw A.a("Error parsing vorbis codec private", null);
            byte[] arrby2 = new byte[arrayList.length - n9];
            System.arraycopy((Object)arrayList, (int)n9, (Object)arrby2, (int)0, (int)(arrayList.length - n9));
            arrayList = new ArrayList(2);
            arrayList.add((Object)arrby);
            arrayList.add((Object)arrby2);
            return arrayList;
        }

        public final void f() {
            g0.a.e(this.Y);
        }

        public final byte[] g(String string2) {
            StringBuilder stringBuilder = this.k;
            if (stringBuilder != null) {
                return stringBuilder;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Missing CodecPrivate for codec ");
            stringBuilder.append(string2);
            throw A.a(stringBuilder.toString(), null);
        }

        public final byte[] h() {
            if (this.E != -1.0f && this.F != -1.0f && this.G != -1.0f && this.H != -1.0f && this.I != -1.0f && this.J != -1.0f && this.K != -1.0f && this.L != -1.0f && this.M != -1.0f && this.N != -1.0f) {
                byte[] arrby = new byte[25];
                ByteBuffer byteBuffer = ByteBuffer.wrap((byte[])arrby).order(ByteOrder.LITTLE_ENDIAN);
                byteBuffer.put((byte)0);
                byteBuffer.putShort((short)(this.E * 50000.0f + 0.5f));
                byteBuffer.putShort((short)(this.F * 50000.0f + 0.5f));
                byteBuffer.putShort((short)(this.G * 50000.0f + 0.5f));
                byteBuffer.putShort((short)(this.H * 50000.0f + 0.5f));
                byteBuffer.putShort((short)(this.I * 50000.0f + 0.5f));
                byteBuffer.putShort((short)(this.J * 50000.0f + 0.5f));
                byteBuffer.putShort((short)(this.K * 50000.0f + 0.5f));
                byteBuffer.putShort((short)(this.L * 50000.0f + 0.5f));
                byteBuffer.putShort((short)(this.M + 0.5f));
                byteBuffer.putShort((short)(this.N + 0.5f));
                byteBuffer.putShort((short)this.C);
                byteBuffer.putShort((short)this.D);
                return arrby;
            }
            return null;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public void i(t var1_1, int var2_2) {
            block99 : {
                block100 : {
                    block98 : {
                        var10_3 = this.b;
                        var10_3.hashCode();
                        switch (var10_3.hashCode()) {
                            case 1951062397: {
                                if (!var10_3.equals((Object)"A_OPUS")) break;
                                var4_4 = 32;
                                ** break;
                            }
                            case 1950789798: {
                                if (!var10_3.equals((Object)"A_FLAC")) break;
                                var4_4 = 31;
                                ** break;
                            }
                            case 1950749482: {
                                if (!var10_3.equals((Object)"A_EAC3")) break;
                                var4_4 = 30;
                                ** break;
                            }
                            case 1809237540: {
                                if (!var10_3.equals((Object)"V_MPEG2")) break;
                                var4_4 = 29;
                                ** break;
                            }
                            case 1422270023: {
                                if (!var10_3.equals((Object)"S_TEXT/UTF8")) break;
                                var4_4 = 28;
                                ** break;
                            }
                            case 1045209816: {
                                if (!var10_3.equals((Object)"S_TEXT/WEBVTT")) break;
                                var4_4 = 27;
                                ** break;
                            }
                            case 855502857: {
                                if (!var10_3.equals((Object)"V_MPEGH/ISO/HEVC")) break;
                                var4_4 = 26;
                                ** break;
                            }
                            case 738597099: {
                                if (!var10_3.equals((Object)"S_TEXT/ASS")) break;
                                var4_4 = 25;
                                ** break;
                            }
                            case 725957860: {
                                if (!var10_3.equals((Object)"A_PCM/INT/LIT")) break;
                                var4_4 = 24;
                                ** break;
                            }
                            case 725948237: {
                                if (!var10_3.equals((Object)"A_PCM/INT/BIG")) break;
                                var4_4 = 23;
                                ** break;
                            }
                            case 635596514: {
                                if (!var10_3.equals((Object)"A_PCM/FLOAT/IEEE")) break;
                                var4_4 = 22;
                                ** break;
                            }
                            case 542569478: {
                                if (!var10_3.equals((Object)"A_DTS/EXPRESS")) break;
                                var4_4 = 21;
                                ** break;
                            }
                            case 444813526: {
                                if (!var10_3.equals((Object)"V_THEORA")) break;
                                var4_4 = 20;
                                ** break;
                            }
                            case 99146302: {
                                if (!var10_3.equals((Object)"S_HDMV/PGS")) break;
                                var4_4 = 19;
                                ** break;
                            }
                            case 82338134: {
                                if (!var10_3.equals((Object)"V_VP9")) break;
                                var4_4 = 18;
                                ** break;
                            }
                            case 82338133: {
                                if (!var10_3.equals((Object)"V_VP8")) break;
                                var4_4 = 17;
                                ** break;
                            }
                            case 82318131: {
                                if (!var10_3.equals((Object)"V_AV1")) break;
                                var4_4 = 16;
                                ** break;
                            }
                            case 62927045: {
                                if (!var10_3.equals((Object)"A_DTS")) break;
                                var4_4 = 15;
                                ** break;
                            }
                            case 62923603: {
                                if (!var10_3.equals((Object)"A_AC3")) break;
                                var4_4 = 14;
                                ** break;
                            }
                            case 62923557: {
                                if (!var10_3.equals((Object)"A_AAC")) break;
                                var4_4 = 13;
                                ** break;
                            }
                            case -356037306: {
                                if (!var10_3.equals((Object)"A_DTS/LOSSLESS")) break;
                                var4_4 = 12;
                                ** break;
                            }
                            case -425012669: {
                                if (!var10_3.equals((Object)"S_VOBSUB")) break;
                                var4_4 = 11;
                                ** break;
                            }
                            case -538363109: {
                                if (!var10_3.equals((Object)"V_MPEG4/ISO/AVC")) break;
                                var4_4 = 10;
                                ** break;
                            }
                            case -538363189: {
                                if (!var10_3.equals((Object)"V_MPEG4/ISO/ASP")) break;
                                var4_4 = 9;
                                ** break;
                            }
                            case -933872740: {
                                if (!var10_3.equals((Object)"S_DVBSUB")) break;
                                var4_4 = 8;
                                ** break;
                            }
                            case -1373388978: {
                                if (!var10_3.equals((Object)"V_MS/VFW/FOURCC")) break;
                                var4_4 = 7;
                                ** break;
                            }
                            case -1482641357: {
                                if (!var10_3.equals((Object)"A_MPEG/L3")) break;
                                var4_4 = 6;
                                ** break;
                            }
                            case -1482641358: {
                                if (!var10_3.equals((Object)"A_MPEG/L2")) break;
                                var4_4 = 5;
                                ** break;
                            }
                            case -1730367663: {
                                if (!var10_3.equals((Object)"A_VORBIS")) break;
                                var4_4 = 4;
                                ** break;
                            }
                            case -1784763192: {
                                if (!var10_3.equals((Object)"A_TRUEHD")) break;
                                var4_4 = 3;
                                ** break;
                            }
                            case -1985379776: {
                                if (!var10_3.equals((Object)"A_MS/ACM")) break;
                                var4_4 = 2;
                                ** break;
                            }
                            case -2095575984: {
                                if (!var10_3.equals((Object)"V_MPEG4/ISO/SP")) break;
                                var4_4 = 1;
                                ** break;
                            }
                            case -2095576542: {
                                if (var10_3.equals((Object)"V_MPEG4/ISO/AP")) break block98;
                            }
                        }
                        var4_4 = -1;
                        ** break;
                    }
                    var4_4 = 0;
lbl138: // 34 sources:
                    var12_5 = "audio/raw";
                    var15_6 = null;
                    switch (var4_4) {
                        default: {
                            throw A.a("Unrecognized codec identifier.", null);
                        }
                        case 32: {
                            var11_7 = new ArrayList(3);
                            var11_7.add((Object)this.g(this.b));
                            var10_3 = ByteBuffer.allocate((int)8);
                            var12_5 = ByteOrder.LITTLE_ENDIAN;
                            var11_7.add((Object)var10_3.order((ByteOrder)var12_5).putLong(this.S).array());
                            var11_7.add((Object)ByteBuffer.allocate((int)8).order((ByteOrder)var12_5).putLong(this.T).array());
                            var10_3 = "audio/opus";
                            var4_4 = 5760;
                            var13_8 = null;
                            ** GOTO lbl267
                        }
                        case 31: {
                            var11_7 = Collections.singletonList((Object)this.g(this.b));
                            var10_3 = "audio/flac";
                            var12_5 = null;
                            ** GOTO lbl265
                        }
                        case 30: {
                            var10_3 = "audio/eac3";
                            ** GOTO lbl259
                        }
                        case 29: {
                            var10_3 = "video/mpeg2";
                            ** GOTO lbl259
                        }
                        case 28: {
                            var12_5 = var11_7 = null;
                            var10_3 = "application/x-subrip";
                            ** GOTO lbl265
                        }
                        case 27: {
                            var10_3 = "text/vtt";
                            ** GOTO lbl259
                        }
                        case 26: {
                            var11_7 = F.a(new z(this.g(this.b)));
                            var10_3 = var11_7.a;
                            this.Z = var11_7.b;
                            var11_7 = var11_7.l;
                            var12_5 = "video/hevc";
                            ** GOTO lbl276
                        }
                        case 25: {
                            var11_7 = v.a0(e.f(), this.g(this.b));
                            var12_5 = null;
                            var10_3 = "text/x-ssa";
                            ** GOTO lbl265
                        }
                        case 24: {
                            var4_4 = g0.M.e0(this.Q);
                            if (var4_4 != 0) ** GOTO lbl203
                            var10_3 = new StringBuilder();
                            var11_7 = "Unsupported little endian PCM bit depth: ";
                            ** GOTO lbl219
                        }
                        case 23: {
                            var4_4 = this.Q;
                            if (var4_4 != 8) ** GOTO lbl195
                            var5_9 = 3;
                            ** GOTO lbl204
lbl195: // 1 sources:
                            if (var4_4 != 16) ** GOTO lbl198
                            var4_4 = 268435456;
                            ** GOTO lbl203
lbl198: // 1 sources:
                            if (var4_4 != 24) ** GOTO lbl201
                            var4_4 = 1342177280;
                            ** GOTO lbl203
lbl201: // 1 sources:
                            if (var4_4 != 32) ** GOTO lbl208
                            var4_4 = 1610612736;
lbl203: // 4 sources:
                            var5_9 = var4_4;
lbl204: // 2 sources:
                            var10_3 = null;
                            var11_7 = null;
                            var4_4 = -1;
                            ** break;
lbl208: // 1 sources:
                            var10_3 = new StringBuilder();
                            var11_7 = "Unsupported big endian PCM bit depth: ";
                            ** GOTO lbl219
                        }
                        case 22: {
                            if (this.Q == 32) {
                                var10_3 = var11_7 = null;
                                var4_4 = -1;
                                var5_9 = 4;
                                ** break;
                            }
                            var10_3 = new StringBuilder();
                            var11_7 = "Unsupported floating point PCM bit depth: ";
lbl219: // 3 sources:
                            var10_3.append((String)var11_7);
                            var10_3.append(this.Q);
                            var10_3.append(". Setting mimeType to ");
                            var10_3.append("audio/x-unknown");
                            o.h("MatroskaExtractor", var10_3.toString());
                            var12_5 = var11_7 = null;
                            var10_3 = "audio/x-unknown";
                            ** GOTO lbl265
                        }
                        case 20: {
                            var10_3 = "video/x-unknown";
                            ** GOTO lbl259
                        }
                        case 19: {
                            var12_5 = var11_7 = null;
                            var10_3 = "application/pgs";
                            ** GOTO lbl265
                        }
                        case 18: {
                            var10_3 = "video/x-vnd.on2.vp9";
                            ** GOTO lbl259
                        }
                        case 17: {
                            var10_3 = "video/x-vnd.on2.vp8";
                            ** GOTO lbl259
                        }
                        case 16: {
                            var10_3 = "video/av01";
                            ** GOTO lbl259
                        }
                        case 15: 
                        case 21: {
                            var10_3 = "audio/vnd.dts";
                            ** GOTO lbl259
                        }
                        case 14: {
                            var10_3 = "audio/ac3";
                            ** GOTO lbl259
                        }
                        case 13: {
                            var11_7 = Collections.singletonList((Object)this.g(this.b));
                            var10_3 = F0.a.e(this.k);
                            this.R = var10_3.a;
                            this.P = var10_3.b;
                            var12_5 = var10_3.c;
                            var10_3 = "audio/mp4a-latm";
                            ** GOTO lbl265
                        }
                        case 12: {
                            var10_3 = "audio/vnd.dts.hd";
lbl259: // 10 sources:
                            var12_5 = var11_7 = null;
                            ** GOTO lbl265
                        }
                        case 11: {
                            var11_7 = v.Z(this.g(this.b));
                            var12_5 = null;
                            var10_3 = "application/vobsub";
lbl265: // 8 sources:
                            var4_4 = -1;
                            var13_8 = var12_5;
lbl267: // 2 sources:
                            var12_5 = var10_3;
                            var10_3 = var13_8;
                            break block99;
                        }
                        case 10: {
                            var11_7 = F0.d.b(new z(this.g(this.b)));
                            var10_3 = var11_7.a;
                            this.Z = var11_7.b;
                            var11_7 = var11_7.l;
                            var12_5 = "video/avc";
lbl276: // 2 sources:
                            var4_4 = -1;
                            var5_9 = -1;
                            var13_8 = var11_7;
                            var11_7 = var10_3;
                            var10_3 = var13_8;
                            ** break;
                        }
                        case 8: {
                            var10_3 = new byte[4];
                            System.arraycopy((Object)this.g(this.b), (int)0, (Object)var10_3, (int)0, (int)4);
                            var10_3 = v.Z(var10_3);
                            var12_5 = "application/dvbsubs";
                            break block100;
                        }
                        case 7: {
                            var10_3 = c.k(new z(this.g(this.b)));
                            var12_5 = (String)var10_3.first;
                            var10_3 = (List)var10_3.second;
                            break block100;
                        }
                        case 6: {
                            var12_5 = "audio/mpeg";
                            ** GOTO lbl298
                        }
                        case 5: {
                            var12_5 = "audio/mpeg-L2";
lbl298: // 2 sources:
                            var4_4 = 4096;
                            var10_3 = var11_7 = null;
                            break block99;
                        }
                        case 4: {
                            var11_7 = c.m(this.g(this.b));
                            var12_5 = "audio/vorbis";
                            var4_4 = 8192;
                            var10_3 = null;
                            break block99;
                        }
                        case 3: {
                            this.U = new U();
                            var12_5 = "audio/true-hd";
                            var10_3 = null;
                            break block100;
                        }
                        case 2: {
                            if (!c.l(new z(this.g(this.b)))) ** GOTO lbl324
                            var5_9 = g0.M.e0(this.Q);
                            if (var5_9 == 0) {
                                var10_3 = new StringBuilder();
                                var10_3.append("Unsupported PCM bit depth: ");
                                var10_3.append(this.Q);
                                var10_3.append(". Setting mimeType to ");
                            } else {
                                var10_3 = var11_7 = null;
                                var4_4 = -1;
                                ** break;
lbl324: // 1 sources:
                                var10_3 = new StringBuilder();
                                var10_3.append("Non-PCM MS/ACM is unsupported. Setting mimeType to ");
                            }
                            var10_3.append("audio/x-unknown");
                            o.h("MatroskaExtractor", var10_3.toString());
                            var10_3 = null;
                            var12_5 = "audio/x-unknown";
                            break block100;
                        }
                        case 0: 
                        case 1: 
                        case 9: 
                    }
                    var10_3 = this.k;
                    var10_3 = var10_3 == null ? null : Collections.singletonList((Object)var10_3);
                    var12_5 = "video/mp4v-es";
                }
                var13_8 = null;
                var4_4 = -1;
                var11_7 = var10_3;
                var10_3 = var13_8;
            }
            var5_9 = -1;
            ** break;
lbl343: // 5 sources:
            var14_10 = var10_3;
            var13_8 = var12_5;
            if (this.O != null) {
                var16_11 = F0.o.a(new z(this.O));
                var14_10 = var10_3;
                var13_8 = var12_5;
                if (var16_11 != null) {
                    var14_10 = var16_11.c;
                    var13_8 = "video/dolby-vision";
                }
            }
            var9_12 = this.W;
            var7_13 = this.V != false ? 2 : 0;
            var12_5 = new q.b();
            if (d0.z.o((String)var13_8)) {
                var12_5.N(this.P).p0(this.R).i0(var5_9);
                var5_9 = 1;
            } else if (d0.z.s((String)var13_8)) {
                if (this.r == 0) {
                    var5_9 = var6_14 = this.p;
                    if (var6_14 == -1) {
                        var5_9 = this.m;
                    }
                    this.p = var5_9;
                    var5_9 = var6_14 = this.q;
                    if (var6_14 == -1) {
                        var5_9 = this.n;
                    }
                    this.q = var5_9;
                }
                var5_9 = -1;
                var6_14 = this.p;
                var3_16 = var6_14 != -1 && (var8_15 = this.q) != -1 ? (float)(this.n * var6_14) / (float)(this.m * var8_15) : -1.0f;
                var10_3 = var15_6;
                if (this.y) {
                    var10_3 = this.h();
                    var10_3 = new h.b().d(this.z).c(this.B).e(this.A).f((byte[])var10_3).g(this.o).b(this.o).a();
                }
                var6_14 = var5_9;
                if (this.a != null) {
                    var6_14 = var5_9;
                    if (e.h().containsKey((Object)this.a)) {
                        var6_14 = (Integer)e.h().get((Object)this.a);
                    }
                }
                var5_9 = var6_14;
                if (this.s == 0) {
                    var5_9 = var6_14;
                    if (Float.compare((float)this.t, (float)0.0f) == 0) {
                        var5_9 = var6_14;
                        if (Float.compare((float)this.u, (float)0.0f) == 0) {
                            if (Float.compare((float)this.v, (float)0.0f) == 0) {
                                var5_9 = 0;
                            } else if (Float.compare((float)this.v, (float)90.0f) == 0) {
                                var5_9 = 90;
                            } else if (Float.compare((float)this.v, (float)-180.0f) != 0 && Float.compare((float)this.v, (float)180.0f) != 0) {
                                var5_9 = var6_14;
                                if (Float.compare((float)this.v, (float)-90.0f) == 0) {
                                    var5_9 = 270;
                                }
                            } else {
                                var5_9 = 180;
                            }
                        }
                    }
                }
                var12_5.v0(this.m).Y(this.n).k0(var3_16).n0(var5_9).l0(this.w).r0(this.x).P((h)var10_3);
                var5_9 = 2;
            } else {
                if (!("application/x-subrip".equals(var13_8) || "text/x-ssa".equals(var13_8) || "text/vtt".equals(var13_8) || "application/vobsub".equals(var13_8) || "application/pgs".equals(var13_8))) {
                    if ("application/dvbsubs".equals(var13_8) == false) throw A.a("Unexpected MIME type.", null);
                }
                var5_9 = 3;
            }
            if (this.a != null && !e.h().containsKey((Object)this.a)) {
                var12_5.c0(this.a);
            }
            var10_3 = var12_5.Z(var2_2).o0((String)var13_8).f0(var4_4).e0(this.X).q0(var7_13 | var9_12).b0((List)var11_7).O((String)var14_10).U(this.l).K();
            this.Y = var1_1 = var1_1.a(this.c, var5_9);
            var1_1.d((q)var10_3);
        }

        public void j() {
            U u8 = this.U;
            if (u8 != null) {
                u8.a(this.Y, this.j);
            }
        }

        public void n() {
            U u8 = this.U;
            if (u8 != null) {
                u8.b();
            }
        }

        public final boolean o(boolean bl) {
            if ("A_OPUS".equals((Object)this.b)) {
                return bl;
            }
            if (this.f > 0) {
                return true;
            }
            return false;
        }
    }

}

