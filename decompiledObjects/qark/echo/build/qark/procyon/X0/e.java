// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X0;

import F0.F;
import java.util.ArrayList;
import android.util.Pair;
import java.nio.ByteOrder;
import d0.m;
import F0.U;
import F0.h;
import g0.o;
import java.util.List;
import F0.q;
import c1.v;
import d0.i;
import java.util.Arrays;
import F0.T;
import d0.A;
import F0.s;
import F0.L;
import java.util.Locale;
import java.util.Collections;
import java.util.HashMap;
import g0.M;
import java.nio.ByteBuffer;
import g0.z;
import F0.t;
import android.util.SparseArray;
import g0.p;
import java.util.Map;
import java.util.UUID;
import F0.x;
import F0.r;

public class e implements r
{
    public static final x e0;
    public static final byte[] f0;
    public static final byte[] g0;
    public static final byte[] h0;
    public static final byte[] i0;
    public static final UUID j0;
    public static final Map k0;
    public boolean A;
    public long B;
    public long C;
    public long D;
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
    public final c1.t.a f;
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
    public long s;
    public long t;
    public long u;
    public long v;
    public c w;
    public boolean x;
    public int y;
    public long z;
    
    static {
        e0 = new d();
        f0 = new byte[] { 49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10 };
        g0 = M.r0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
        h0 = new byte[] { 68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44 };
        i0 = new byte[] { 87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10 };
        j0 = new UUID(72057594037932032L, -9223371306706625679L);
        final HashMap<String, Integer> m = new HashMap<String, Integer>();
        m.put("htc_video_rotA-000", 0);
        m.put("htc_video_rotA-090", 90);
        m.put("htc_video_rotA-180", 180);
        m.put("htc_video_rotA-270", 270);
        k0 = Collections.unmodifiableMap((Map<?, ?>)m);
    }
    
    public e(final X0.c a, final int n, final c1.t.a f) {
        this.s = -1L;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.B = -1L;
        this.C = -1L;
        this.D = -9223372036854775807L;
        (this.a = a).d(new b(null));
        this.f = f;
        final boolean b = false;
        this.d = ((n & 0x1) == 0x0);
        boolean e = b;
        if ((n & 0x2) == 0x0) {
            e = true;
        }
        this.e = e;
        this.b = new g();
        this.c = new SparseArray();
        this.i = new z(4);
        this.j = new z(ByteBuffer.allocate(4).putInt(-1).array());
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
    
    public e(final c1.t.a a, final int n) {
        this(new a(), n, a);
    }
    
    public static boolean A(final String s) {
        s.hashCode();
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1951062397: {
                if (!s.equals("A_OPUS")) {
                    break;
                }
                n = 32;
                break;
            }
            case 1950789798: {
                if (!s.equals("A_FLAC")) {
                    break;
                }
                n = 31;
                break;
            }
            case 1950749482: {
                if (!s.equals("A_EAC3")) {
                    break;
                }
                n = 30;
                break;
            }
            case 1809237540: {
                if (!s.equals("V_MPEG2")) {
                    break;
                }
                n = 29;
                break;
            }
            case 1422270023: {
                if (!s.equals("S_TEXT/UTF8")) {
                    break;
                }
                n = 28;
                break;
            }
            case 1045209816: {
                if (!s.equals("S_TEXT/WEBVTT")) {
                    break;
                }
                n = 27;
                break;
            }
            case 855502857: {
                if (!s.equals("V_MPEGH/ISO/HEVC")) {
                    break;
                }
                n = 26;
                break;
            }
            case 738597099: {
                if (!s.equals("S_TEXT/ASS")) {
                    break;
                }
                n = 25;
                break;
            }
            case 725957860: {
                if (!s.equals("A_PCM/INT/LIT")) {
                    break;
                }
                n = 24;
                break;
            }
            case 725948237: {
                if (!s.equals("A_PCM/INT/BIG")) {
                    break;
                }
                n = 23;
                break;
            }
            case 635596514: {
                if (!s.equals("A_PCM/FLOAT/IEEE")) {
                    break;
                }
                n = 22;
                break;
            }
            case 542569478: {
                if (!s.equals("A_DTS/EXPRESS")) {
                    break;
                }
                n = 21;
                break;
            }
            case 444813526: {
                if (!s.equals("V_THEORA")) {
                    break;
                }
                n = 20;
                break;
            }
            case 99146302: {
                if (!s.equals("S_HDMV/PGS")) {
                    break;
                }
                n = 19;
                break;
            }
            case 82338134: {
                if (!s.equals("V_VP9")) {
                    break;
                }
                n = 18;
                break;
            }
            case 82338133: {
                if (!s.equals("V_VP8")) {
                    break;
                }
                n = 17;
                break;
            }
            case 82318131: {
                if (!s.equals("V_AV1")) {
                    break;
                }
                n = 16;
                break;
            }
            case 62927045: {
                if (!s.equals("A_DTS")) {
                    break;
                }
                n = 15;
                break;
            }
            case 62923603: {
                if (!s.equals("A_AC3")) {
                    break;
                }
                n = 14;
                break;
            }
            case 62923557: {
                if (!s.equals("A_AAC")) {
                    break;
                }
                n = 13;
                break;
            }
            case -356037306: {
                if (!s.equals("A_DTS/LOSSLESS")) {
                    break;
                }
                n = 12;
                break;
            }
            case -425012669: {
                if (!s.equals("S_VOBSUB")) {
                    break;
                }
                n = 11;
                break;
            }
            case -538363109: {
                if (!s.equals("V_MPEG4/ISO/AVC")) {
                    break;
                }
                n = 10;
                break;
            }
            case -538363189: {
                if (!s.equals("V_MPEG4/ISO/ASP")) {
                    break;
                }
                n = 9;
                break;
            }
            case -933872740: {
                if (!s.equals("S_DVBSUB")) {
                    break;
                }
                n = 8;
                break;
            }
            case -1373388978: {
                if (!s.equals("V_MS/VFW/FOURCC")) {
                    break;
                }
                n = 7;
                break;
            }
            case -1482641357: {
                if (!s.equals("A_MPEG/L3")) {
                    break;
                }
                n = 6;
                break;
            }
            case -1482641358: {
                if (!s.equals("A_MPEG/L2")) {
                    break;
                }
                n = 5;
                break;
            }
            case -1730367663: {
                if (!s.equals("A_VORBIS")) {
                    break;
                }
                n = 4;
                break;
            }
            case -1784763192: {
                if (!s.equals("A_TRUEHD")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1985379776: {
                if (!s.equals("A_MS/ACM")) {
                    break;
                }
                n = 2;
                break;
            }
            case -2095575984: {
                if (!s.equals("V_MPEG4/ISO/SP")) {
                    break;
                }
                n = 1;
                break;
            }
            case -2095576542: {
                if (!s.equals("V_MPEG4/ISO/AP")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
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
            case 32: {
                return true;
            }
        }
    }
    
    public static void H(final String s, final long n, final byte[] array) {
        s.hashCode();
        final int hashCode = s.hashCode();
        int n2 = -1;
        switch (hashCode) {
            case 1422270023: {
                if (!s.equals("S_TEXT/UTF8")) {
                    break;
                }
                n2 = 2;
                break;
            }
            case 1045209816: {
                if (!s.equals("S_TEXT/WEBVTT")) {
                    break;
                }
                n2 = 1;
                break;
            }
            case 738597099: {
                if (!s.equals("S_TEXT/ASS")) {
                    break;
                }
                n2 = 0;
                break;
            }
        }
        byte[] array2 = null;
        int n3 = 0;
        switch (n2) {
            default: {
                throw new IllegalArgumentException();
            }
            case 2: {
                array2 = u(n, "%02d:%02d:%02d,%03d", 1000L);
                n3 = 19;
                break;
            }
            case 1: {
                array2 = u(n, "%02d:%02d:%02d.%03d", 1000L);
                n3 = 25;
                break;
            }
            case 0: {
                array2 = u(n, "%01d:%02d:%02d:%02d", 10000L);
                n3 = 21;
                break;
            }
        }
        System.arraycopy(array2, 0, array, n3, array2.length);
    }
    
    public static /* synthetic */ byte[] f() {
        return e.g0;
    }
    
    public static /* synthetic */ Map h() {
        return e.k0;
    }
    
    public static /* synthetic */ UUID j() {
        return e.j0;
    }
    
    private void m() {
        g0.a.h(this.d0);
    }
    
    public static int[] r(final int[] array, final int b) {
        if (array == null) {
            return new int[b];
        }
        if (array.length >= b) {
            return array;
        }
        return new int[Math.max(array.length * 2, b)];
    }
    
    public static byte[] u(long n, final String format, final long n2) {
        g0.a.a(n != -9223372036854775807L);
        final int i = (int)(n / 3600000000L);
        n -= i * 3600000000L;
        final int j = (int)(n / 60000000L);
        n -= j * 60000000L;
        final int k = (int)(n / 1000000L);
        return M.r0(String.format(Locale.US, format, i, j, k, (int)((n - k * 1000000L) / n2)));
    }
    
    public boolean B(final int n) {
        return n == 357149030 || n == 524531317 || n == 475249515 || n == 374648427;
    }
    
    public final boolean D(final L l, long c) {
        if (this.A) {
            this.C = c;
            l.a = this.B;
            this.A = false;
            return true;
        }
        if (this.x) {
            c = this.C;
            if (c != -1L) {
                l.a = c;
                this.C = -1L;
                return true;
            }
        }
        return false;
    }
    
    public final void E(final s s, final int b) {
        if (this.i.g() >= b) {
            return;
        }
        if (this.i.b() < b) {
            final z i = this.i;
            i.c(Math.max(i.b() * 2, b));
        }
        s.readFully(this.i.e(), this.i.g(), b - this.i.g());
        this.i.S(b);
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
    
    public final long G(final long n) {
        final long t = this.t;
        if (t != -9223372036854775807L) {
            return g0.M.W0(n, t, 1000L);
        }
        throw d0.A.a("Can't scale timecode prior to timecodeScale being set.", null);
    }
    
    public void I(final int n, final long s, final long r) {
        this.m();
        if (n != 160) {
            if (n == 174) {
                this.w = new c();
                return;
            }
            if (n == 187) {
                this.G = false;
                return;
            }
            if (n == 19899) {
                this.y = -1;
                this.z = -1L;
                return;
            }
            if (n == 20533) {
                this.v(n).h = true;
                return;
            }
            if (n == 21968) {
                this.v(n).y = true;
                return;
            }
            if (n != 408125543) {
                if (n == 475249515) {
                    this.E = new p();
                    this.F = new p();
                    return;
                }
                if (n != 524531317) {
                    return;
                }
                if (!this.x) {
                    if (this.d && this.B != -1L) {
                        this.A = true;
                        return;
                    }
                    this.d0.e(new F0.M.b(this.v));
                    this.x = true;
                }
            }
            else {
                final long s2 = this.s;
                if (s2 != -1L && s2 != s) {
                    throw d0.A.a("Multiple Segment elements not supported", null);
                }
                this.s = s;
                this.r = r;
            }
        }
        else {
            this.S = false;
            this.T = 0L;
        }
    }
    
    public void J(final int n, final String b) {
        if (n != 134) {
            if (n != 17026) {
                if (n == 21358) {
                    this.v(n).a = b;
                    return;
                }
                if (n != 2274716) {
                    return;
                }
                X0.e.c.d(this.v(n), b);
            }
            else if (!"webm".equals(b)) {
                if ("matroska".equals(b)) {
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("DocType ");
                sb.append(b);
                sb.append(" not supported");
                throw d0.A.a(sb.toString(), null);
            }
        }
        else {
            this.v(n).b = b;
        }
    }
    
    public final int K(final s s, final c c, int n, final boolean b) {
        if ("S_TEXT/UTF8".equals(c.b)) {
            this.L(s, X0.e.f0, n);
        }
        else if ("S_TEXT/ASS".equals(c.b)) {
            this.L(s, X0.e.h0, n);
        }
        else {
            if (!"S_TEXT/WEBVTT".equals(c.b)) {
                final T y = c.Y;
                final boolean x = this.X;
                final boolean b2 = true;
                if (!x) {
                    if (c.h) {
                        this.Q &= 0xBFFFFFFF;
                        final boolean y2 = this.Y;
                        int n2 = 128;
                        if (!y2) {
                            s.readFully(this.i.e(), 0, 1);
                            ++this.U;
                            if ((this.i.e()[0] & 0x80) == 0x80) {
                                throw d0.A.a("Extension bit is set in signal byte", null);
                            }
                            this.b0 = this.i.e()[0];
                            this.Y = true;
                        }
                        final byte b3 = this.b0;
                        if ((b3 & 0x1) == 0x1) {
                            final boolean b4 = (b3 & 0x2) == 0x2;
                            this.Q |= 0x40000000;
                            if (!this.c0) {
                                s.readFully(this.n.e(), 0, 8);
                                this.U += 8;
                                this.c0 = true;
                                final byte[] e = this.i.e();
                                if (!b4) {
                                    n2 = 0;
                                }
                                e[0] = (byte)(n2 | 0x8);
                                this.i.T(0);
                                y.a(this.i, 1, 1);
                                ++this.V;
                                this.n.T(0);
                                y.a(this.n, 8, 1);
                                this.V += 8;
                            }
                            if (b4) {
                                if (!this.Z) {
                                    s.readFully(this.i.e(), 0, 1);
                                    ++this.U;
                                    this.i.T(0);
                                    this.a0 = this.i.G();
                                    this.Z = true;
                                }
                                final int n3 = this.a0 * 4;
                                this.i.P(n3);
                                s.readFully(this.i.e(), 0, n3);
                                this.U += n3;
                                final short n4 = (short)(this.a0 / 2 + 1);
                                final int capacity = n4 * 6 + 2;
                                final ByteBuffer q = this.q;
                                if (q == null || q.capacity() < capacity) {
                                    this.q = ByteBuffer.allocate(capacity);
                                }
                                this.q.position(0);
                                this.q.putShort(n4);
                                int n6;
                                int n5 = n6 = 0;
                                int a0;
                                while (true) {
                                    a0 = this.a0;
                                    if (n5 >= a0) {
                                        break;
                                    }
                                    final int k = this.i.K();
                                    if (n5 % 2 == 0) {
                                        this.q.putShort((short)(k - n6));
                                    }
                                    else {
                                        this.q.putInt(k - n6);
                                    }
                                    ++n5;
                                    n6 = k;
                                }
                                final int n7 = n - this.U - n6;
                                final ByteBuffer q2 = this.q;
                                if (a0 % 2 == 1) {
                                    q2.putInt(n7);
                                }
                                else {
                                    q2.putShort((short)n7);
                                    this.q.putInt(0);
                                }
                                this.o.R(this.q.array(), capacity);
                                y.a(this.o, capacity, 1);
                                this.V += capacity;
                            }
                        }
                    }
                    else {
                        final byte[] i = c.i;
                        if (i != null) {
                            this.l.R(i, i.length);
                        }
                    }
                    if (c.o(b)) {
                        this.Q |= 0x10000000;
                        this.p.P(0);
                        final int n8 = this.l.g() + n - this.U;
                        this.i.P(4);
                        this.i.e()[0] = (byte)(n8 >> 24 & 0xFF);
                        this.i.e()[1] = (byte)(n8 >> 16 & 0xFF);
                        this.i.e()[2] = (byte)(n8 >> 8 & 0xFF);
                        this.i.e()[3] = (byte)(n8 & 0xFF);
                        y.a(this.i, 4, 2);
                        this.V += 4;
                    }
                    this.X = true;
                }
                n += this.l.g();
                if (!"V_MPEG4/ISO/AVC".equals(c.b) && !"V_MPEGH/ISO/HEVC".equals(c.b)) {
                    if (c.U != null) {
                        g0.a.f(this.l.g() == 0 && b2);
                        c.U.d(s);
                    }
                    while (true) {
                        final int u = this.U;
                        if (u >= n) {
                            break;
                        }
                        final int m = this.M(s, y, n - u);
                        this.U += m;
                        this.V += m;
                    }
                }
                else {
                    final byte[] e2 = this.h.e();
                    e2[0] = 0;
                    e2[2] = (e2[1] = 0);
                    final int z = c.Z;
                    while (this.U < n) {
                        final int w = this.W;
                        if (w == 0) {
                            this.N(s, e2, 4 - z, z);
                            this.U += z;
                            this.h.T(0);
                            this.W = this.h.K();
                            this.g.T(0);
                            y.e(this.g, 4);
                            this.V += 4;
                        }
                        else {
                            final int j = this.M(s, y, w);
                            this.U += j;
                            this.V += j;
                            this.W -= j;
                        }
                    }
                }
                if ("A_VORBIS".equals(c.b)) {
                    this.j.T(0);
                    y.e(this.j, 4);
                    this.V += 4;
                }
                return this.s();
            }
            this.L(s, X0.e.i0, n);
        }
        return this.s();
    }
    
    public final void L(final s s, final byte[] original, final int n) {
        final int n2 = original.length + n;
        if (this.m.b() < n2) {
            this.m.Q(Arrays.copyOf(original, n2 + n));
        }
        else {
            System.arraycopy(original, 0, this.m.e(), 0, original.length);
        }
        s.readFully(this.m.e(), original.length, n);
        this.m.T(0);
        this.m.S(n2);
    }
    
    public final int M(final s s, final T t, int min) {
        final int a = this.l.a();
        if (a > 0) {
            min = Math.min(min, a);
            t.e(this.l, min);
            return min;
        }
        return t.f(s, min, false);
    }
    
    public final void N(final s s, final byte[] array, final int n, final int a) {
        final int min = Math.min(a, this.l.a());
        s.readFully(array, n + min, a - min);
        if (min > 0) {
            this.l.l(array, n, min);
        }
    }
    
    @Override
    public void a(final long n, final long n2) {
        this.D = -9223372036854775807L;
        int i = 0;
        this.I = 0;
        this.a.b();
        this.b.e();
        this.F();
        while (i < this.c.size()) {
            ((c)this.c.valueAt(i)).n();
            ++i;
        }
    }
    
    @Override
    public final void b(final t d0) {
        this.d0 = d0;
        t d2 = d0;
        if (this.e) {
            d2 = new v(d0, this.f);
        }
        this.d0 = d2;
    }
    
    @Override
    public final boolean e(final s s) {
        return new f().b(s);
    }
    
    @Override
    public final int i(final s s, final L l) {
        int i = 0;
        this.H = false;
        boolean c = true;
        while (c && !this.H) {
            final boolean b = c = this.a.c(s);
            if (b) {
                c = b;
                if (this.D(l, s.p())) {
                    return 1;
                }
                continue;
            }
        }
        if (!c) {
            while (i < this.c.size()) {
                final c c2 = (c)this.c.valueAt(i);
                c2.f();
                c2.j();
                ++i;
            }
            return -1;
        }
        return 0;
    }
    
    public final void k(final int i) {
        if (this.E != null && this.F != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a Cues");
        throw d0.A.a(sb.toString(), null);
    }
    
    public final void l(final int i) {
        if (this.w != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw d0.A.a(sb.toString(), null);
    }
    
    public void n(int i, int q, final s s) {
        if (i != 161 && i != 163) {
            if (i != 165) {
                if (i == 16877) {
                    this.x(this.v(i), s, q);
                    return;
                }
                if (i == 16981) {
                    this.l(i);
                    s.readFully(this.w.i = new byte[q], 0, q);
                    return;
                }
                if (i == 18402) {
                    final byte[] array = new byte[q];
                    s.readFully(array, 0, q);
                    this.v(i).j = new T.a(1, array, 0, 0);
                    return;
                }
                if (i == 21419) {
                    Arrays.fill(this.k.e(), (byte)0);
                    s.readFully(this.k.e(), 4 - q, q);
                    this.k.T(0);
                    this.y = (int)this.k.I();
                    return;
                }
                if (i == 25506) {
                    this.l(i);
                    s.readFully(this.w.k = new byte[q], 0, q);
                    return;
                }
                if (i == 30322) {
                    this.l(i);
                    s.readFully(this.w.w = new byte[q], 0, q);
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Unexpected id: ");
                sb.append(i);
                throw d0.A.a(sb.toString(), null);
            }
            else {
                if (this.I != 2) {
                    return;
                }
                this.y((c)this.c.get(this.O), this.R, s, q);
            }
        }
        else {
            if (this.I == 0) {
                this.O = (int)this.b.d(s, false, true, 8);
                this.P = this.b.b();
                this.K = -9223372036854775807L;
                this.I = 1;
                this.i.P(0);
            }
            final c c = (c)this.c.get(this.O);
            if (c == null) {
                s.i(q - this.P);
                this.I = 0;
                return;
            }
            c.f();
            if (this.I == 1) {
                this.E(s, 3);
                final int j = (this.i.e()[2] & 0x6) >> 1;
                if (j == 0) {
                    this.M = 1;
                    (this.N = r(this.N, 1))[0] = q - this.P - 3;
                }
                else {
                    int n = 4;
                    this.E(s, 4);
                    final int m = (this.i.e()[3] & 0xFF) + 1;
                    this.M = m;
                    final int[] r = r(this.N, m);
                    this.N = r;
                    if (j == 2) {
                        final int p3 = this.P;
                        final int k = this.M;
                        Arrays.fill(r, 0, k, (q - p3 - 4) / k);
                    }
                    else if (j == 1) {
                        int n3;
                        int n2 = n3 = 0;
                        int l;
                        while (true) {
                            l = this.M;
                            if (n2 >= l - 1) {
                                break;
                            }
                            this.N[n2] = 0;
                            int n4 = n;
                            int n7;
                            while (true) {
                                n = n4 + 1;
                                this.E(s, n);
                                final int n5 = this.i.e()[n4] & 0xFF;
                                final int[] n6 = this.N;
                                n7 = n6[n2] + n5;
                                n6[n2] = n7;
                                if (n5 != 255) {
                                    break;
                                }
                                n4 = n;
                            }
                            n3 += n7;
                            ++n2;
                        }
                        this.N[l - 1] = q - this.P - n - n3;
                    }
                    else {
                        if (j != 3) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Unexpected lacing value: ");
                            sb2.append(j);
                            throw d0.A.a(sb2.toString(), null);
                        }
                        int n9;
                        int n8 = n9 = 0;
                    Label_0744:
                        while (true) {
                            final int m2 = this.M;
                            if (n8 >= m2 - 1) {
                                this.N[m2 - 1] = q - this.P - n - n9;
                                break;
                            }
                            this.N[n8] = 0;
                            final int n10 = n + 1;
                            this.E(s, n10);
                            if (this.i.e()[n] != 0) {
                                int n11 = 0;
                                while (true) {
                                    while (n11 < 8) {
                                        final int n12 = 1 << 7 - n11;
                                        if ((this.i.e()[n] & n12) != 0x0) {
                                            final int n13 = n10 + n11;
                                            this.E(s, n13);
                                            long n14 = n12 & (this.i.e()[n] & 0xFF);
                                            for (int n15 = n + 1; n15 < n13; ++n15) {
                                                n14 = (n14 << 8 | (long)(this.i.e()[n15] & 0xFF));
                                            }
                                            long n16 = n14;
                                            n = n13;
                                            if (n8 > 0) {
                                                n16 = n14 - ((1L << n11 * 7 + 6) - 1L);
                                                n = n13;
                                            }
                                            if (n16 >= -2147483648L && n16 <= 2147483647L) {
                                                int n17 = (int)n16;
                                                final int[] n18 = this.N;
                                                if (n8 != 0) {
                                                    n17 += n18[n8 - 1];
                                                }
                                                n18[n8] = n17;
                                                n9 += n17;
                                                ++n8;
                                                continue Label_0744;
                                            }
                                            throw d0.A.a("EBML lacing sample size out of range.", null);
                                        }
                                        else {
                                            ++n11;
                                        }
                                    }
                                    long n16 = 0L;
                                    n = n10;
                                    continue;
                                }
                            }
                            throw d0.A.a("No valid varint length mask found", null);
                        }
                    }
                }
                q = this.i.e()[0];
                this.J = this.D + this.G(q << 8 | (this.i.e()[1] & 0xFF));
                if (c.d != 2 && (i != 163 || (this.i.e()[2] & 0x80) != 0x80)) {
                    q = 0;
                }
                else {
                    q = 1;
                }
                this.Q = q;
                this.I = 2;
                this.L = 0;
            }
            if (i == 163) {
                while (true) {
                    i = this.L;
                    if (i >= this.M) {
                        break;
                    }
                    i = this.K(s, c, this.N[i], false);
                    this.p(c, this.L * c.e / 1000 + this.J, this.Q, i, 0);
                    ++this.L;
                }
                this.I = 0;
                return;
            }
            while (true) {
                i = this.L;
                if (i >= this.M) {
                    break;
                }
                final int[] n19 = this.N;
                n19[i] = this.K(s, c, n19[i], true);
                ++this.L;
            }
        }
    }
    
    public final F0.M o(final p p2, final p p3) {
        if (this.s != -1L && this.v != -9223372036854775807L && p2 != null && p2.c() != 0 && p3 != null && p3.c() == p2.c()) {
            final int c = p2.c();
            final int[] original = new int[c];
            final long[] original2 = new long[c];
            final long[] original3 = new long[c];
            final long[] original4 = new long[c];
            final int n = 0;
            int n2 = 0;
            int n3;
            while (true) {
                n3 = n;
                if (n2 >= c) {
                    break;
                }
                original4[n2] = p2.b(n2);
                original2[n2] = this.s + p3.b(n2);
                ++n2;
            }
            int n4;
            while (true) {
                n4 = c - 1;
                if (n3 >= n4) {
                    break;
                }
                final int n5 = n3 + 1;
                original[n3] = (int)(original2[n5] - original2[n3]);
                original3[n3] = original4[n5] - original4[n3];
                n3 = n5;
            }
            original[n4] = (int)(this.s + this.r - original2[n4]);
            final long lng = this.v - original4[n4];
            original3[n4] = lng;
            int[] copy = original;
            long[] copy2 = original2;
            long[] copy3 = original3;
            long[] copy4 = original4;
            if (lng <= 0L) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Discarding last cue point with unexpected duration: ");
                sb.append(lng);
                g0.o.h("MatroskaExtractor", sb.toString());
                copy = Arrays.copyOf(original, n4);
                copy2 = Arrays.copyOf(original2, n4);
                copy3 = Arrays.copyOf(original3, n4);
                copy4 = Arrays.copyOf(original4, n4);
            }
            return new h(copy, copy2, copy3, copy4);
        }
        return new F0.M.b(this.v);
    }
    
    public final void p(final c c, final long n, final int n2, int g, final int n3) {
        final U u = c.U;
        if (u != null) {
            u.c(c.Y, n, n2, g, n3, c.j);
        }
        else {
            int n4 = 0;
            Label_0237: {
                if (!"S_TEXT/UTF8".equals(c.b) && !"S_TEXT/ASS".equals(c.b)) {
                    n4 = g;
                    if (!"S_TEXT/WEBVTT".equals(c.b)) {
                        break Label_0237;
                    }
                }
                String s;
                if (this.M > 1) {
                    s = "Skipping subtitle sample in laced block.";
                }
                else {
                    final long k = this.K;
                    if (k != -9223372036854775807L) {
                        H(c.b, k, this.m.e());
                        for (int i = this.m.f(); i < this.m.g(); ++i) {
                            if (this.m.e()[i] == 0) {
                                this.m.S(i);
                                break;
                            }
                        }
                        final T y = c.Y;
                        final z m = this.m;
                        y.e(m, m.g());
                        n4 = g + this.m.g();
                        break Label_0237;
                    }
                    s = "Skipping subtitle sample with no duration.";
                }
                g0.o.h("MatroskaExtractor", s);
                n4 = g;
            }
            g = n4;
            if ((0x10000000 & n2) != 0x0) {
                if (this.M > 1) {
                    this.p.P(0);
                    g = n4;
                }
                else {
                    g = this.p.g();
                    c.Y.a(this.p, g, 2);
                    g += n4;
                }
            }
            c.Y.b(n, n2, g, n3, c.j);
        }
        this.H = true;
    }
    
    public void q(int y) {
        this.m();
        if (y != 160) {
            if (y != 174) {
                if (y == 19899) {
                    y = this.y;
                    if (y != -1) {
                        final long z = this.z;
                        if (z != -1L) {
                            if (y == 475249515) {
                                this.B = z;
                            }
                            return;
                        }
                    }
                    throw d0.A.a("Mandatory element SeekID or SeekPosition not found", null);
                }
                if (y != 25152) {
                    if (y != 28032) {
                        if (y != 357149030) {
                            if (y != 374648427) {
                                if (y != 475249515) {
                                    return;
                                }
                                if (!this.x) {
                                    this.d0.e(this.o(this.E, this.F));
                                    this.x = true;
                                }
                                this.E = null;
                                this.F = null;
                            }
                            else {
                                if (this.c.size() != 0) {
                                    this.d0.j();
                                    return;
                                }
                                throw d0.A.a("No valid tracks were found", null);
                            }
                        }
                        else {
                            if (this.t == -9223372036854775807L) {
                                this.t = 1000000L;
                            }
                            final long u = this.u;
                            if (u != -9223372036854775807L) {
                                this.v = this.G(u);
                            }
                        }
                    }
                    else {
                        this.l(y);
                        final c w = this.w;
                        if (w.h) {
                            if (w.i == null) {
                                return;
                            }
                            throw d0.A.a("Combining encryption and compression is not supported", null);
                        }
                    }
                }
                else {
                    this.l(y);
                    final c w2 = this.w;
                    if (w2.h) {
                        if (w2.j != null) {
                            w2.l = new m(new m.b[] { new m.b(d0.g.a, "video/webm", this.w.j.b) });
                            return;
                        }
                        throw d0.A.a("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                }
            }
            else {
                final c c = (c)g0.a.h(this.w);
                final String b = c.b;
                if (b != null) {
                    if (A(b)) {
                        c.i(this.d0, c.c);
                        this.c.put(c.c, (Object)c);
                    }
                    this.w = null;
                    return;
                }
                throw d0.A.a("CodecId is missing in TrackEntry element", null);
            }
        }
        else {
            if (this.I != 2) {
                return;
            }
            final c c2 = (c)this.c.get(this.O);
            c2.f();
            if (this.T > 0L && "A_OPUS".equals(c2.b)) {
                this.p.Q(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.T).array());
            }
            for (int i = y = 0; i < this.M; ++i) {
                y += this.N[i];
            }
            for (int j = 0; j < this.M; ++j) {
                final long k = this.J;
                final long n = c2.e * j / 1000;
                int q;
                final int n2 = q = this.Q;
                if (j == 0) {
                    q = n2;
                    if (!this.S) {
                        q = (n2 | 0x1);
                    }
                }
                final int n3 = this.N[j];
                y -= n3;
                this.p(c2, k + n, q, n3, y);
            }
            this.I = 0;
        }
    }
    
    @Override
    public final void release() {
    }
    
    public final int s() {
        final int v = this.V;
        this.F();
        return v;
    }
    
    public void t(final int n, final double n2) {
        if (n == 181) {
            this.v(n).R = (int)n2;
            return;
        }
        if (n == 17545) {
            this.u = (long)n2;
            return;
        }
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        return;
                    }
                    case 30325: {
                        this.v(n).v = (float)n2;
                        return;
                    }
                    case 30324: {
                        this.v(n).u = (float)n2;
                        return;
                    }
                    case 30323: {
                        this.v(n).t = (float)n2;
                        return;
                    }
                }
                break;
            }
            case 21978: {
                this.v(n).N = (float)n2;
            }
            case 21977: {
                this.v(n).M = (float)n2;
            }
            case 21976: {
                this.v(n).L = (float)n2;
            }
            case 21975: {
                this.v(n).K = (float)n2;
            }
            case 21974: {
                this.v(n).J = (float)n2;
            }
            case 21973: {
                this.v(n).I = (float)n2;
            }
            case 21972: {
                this.v(n).H = (float)n2;
            }
            case 21971: {
                this.v(n).G = (float)n2;
            }
            case 21970: {
                this.v(n).F = (float)n2;
            }
            case 21969: {
                this.v(n).E = (float)n2;
            }
        }
    }
    
    public c v(final int n) {
        this.l(n);
        return this.w;
    }
    
    public int w(final int n) {
        switch (n) {
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
            case 2807729: {
                return 2;
            }
        }
    }
    
    public void x(final c c, final s s, final int n) {
        if (X0.e.c.b(c) != 1685485123 && X0.e.c.b(c) != 1685480259) {
            s.i(n);
            return;
        }
        s.readFully(c.O = new byte[n], 0, n);
    }
    
    public void y(final c c, final int n, final s s, final int n2) {
        if (n == 4 && "V_VP9".equals(c.b)) {
            this.p.P(n2);
            s.readFully(this.p.e(), 0, n2);
            return;
        }
        s.i(n2);
    }
    
    public void z(int n, final long lng) {
        Label_1238: {
            if (n != 20529) {
                if (n != 20530) {
                    final boolean b = false;
                    boolean v = false;
                    switch (n) {
                        default: {
                            switch (n) {
                                default: {
                                    return;
                                }
                                case 21949: {
                                    this.v(n).D = (int)lng;
                                    return;
                                }
                                case 21948: {
                                    this.v(n).C = (int)lng;
                                    return;
                                }
                                case 21947: {
                                    this.l(n);
                                    this.w.y = true;
                                    n = d0.h.j((int)lng);
                                    if (n != -1) {
                                        this.w.z = n;
                                        return;
                                    }
                                    break Label_1238;
                                }
                                case 21946: {
                                    this.l(n);
                                    n = d0.h.k((int)lng);
                                    if (n != -1) {
                                        this.w.A = n;
                                        return;
                                    }
                                    break Label_1238;
                                }
                                case 21945: {
                                    this.l(n);
                                    n = (int)lng;
                                    if (n == 1) {
                                        this.w.B = 2;
                                        return;
                                    }
                                    if (n != 2) {
                                        return;
                                    }
                                    this.w.B = 1;
                                    return;
                                }
                            }
                            break;
                        }
                        case 2807729: {
                            this.t = lng;
                            return;
                        }
                        case 2352003: {
                            this.v(n).e = (int)lng;
                            return;
                        }
                        case 30321: {
                            this.l(n);
                            n = (int)lng;
                            if (n == 0) {
                                this.w.s = 0;
                                return;
                            }
                            if (n == 1) {
                                this.w.s = 1;
                                return;
                            }
                            if (n == 2) {
                                this.w.s = 2;
                                return;
                            }
                            if (n != 3) {
                                return;
                            }
                            this.w.s = 3;
                            return;
                        }
                        case 30114: {
                            this.T = lng;
                            return;
                        }
                        case 25188: {
                            this.v(n).Q = (int)lng;
                            return;
                        }
                        case 22203: {
                            this.v(n).T = lng;
                            return;
                        }
                        case 22186: {
                            this.v(n).S = lng;
                            return;
                        }
                        case 21998: {
                            this.v(n).f = (int)lng;
                            return;
                        }
                        case 21938: {
                            this.l(n);
                            final c w = this.w;
                            w.y = true;
                            w.o = (int)lng;
                            return;
                        }
                        case 21930: {
                            final c v2 = this.v(n);
                            if (lng == 1L) {
                                v = true;
                            }
                            v2.V = v;
                            return;
                        }
                        case 21690: {
                            this.v(n).q = (int)lng;
                            return;
                        }
                        case 21682: {
                            this.v(n).r = (int)lng;
                            return;
                        }
                        case 21680: {
                            this.v(n).p = (int)lng;
                            return;
                        }
                        case 21432: {
                            final int n2 = (int)lng;
                            this.l(n);
                            if (n2 == 0) {
                                this.w.x = 0;
                                return;
                            }
                            if (n2 == 1) {
                                this.w.x = 2;
                                return;
                            }
                            if (n2 == 3) {
                                this.w.x = 1;
                                return;
                            }
                            if (n2 != 15) {
                                return;
                            }
                            this.w.x = 3;
                            return;
                        }
                        case 21420: {
                            this.z = lng + this.s;
                            return;
                        }
                        case 18408: {
                            if (lng == 1L) {
                                return;
                            }
                            final StringBuilder sb = new StringBuilder();
                            sb.append("AESSettingsCipherMode ");
                            sb.append(lng);
                            sb.append(" not supported");
                            throw d0.A.a(sb.toString(), null);
                        }
                        case 18401: {
                            if (lng == 5L) {
                                return;
                            }
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("ContentEncAlgo ");
                            sb2.append(lng);
                            sb2.append(" not supported");
                            throw d0.A.a(sb2.toString(), null);
                        }
                        case 17143: {
                            if (lng == 1L) {
                                return;
                            }
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append("EBMLReadVersion ");
                            sb3.append(lng);
                            sb3.append(" not supported");
                            throw d0.A.a(sb3.toString(), null);
                        }
                        case 17029: {
                            if (lng >= 1L && lng <= 2L) {
                                return;
                            }
                            final StringBuilder sb4 = new StringBuilder();
                            sb4.append("DocTypeReadVersion ");
                            sb4.append(lng);
                            sb4.append(" not supported");
                            throw d0.A.a(sb4.toString(), null);
                        }
                        case 16980: {
                            if (lng == 3L) {
                                return;
                            }
                            final StringBuilder sb5 = new StringBuilder();
                            sb5.append("ContentCompAlgo ");
                            sb5.append(lng);
                            sb5.append(" not supported");
                            throw d0.A.a(sb5.toString(), null);
                        }
                        case 16871: {
                            X0.e.c.c(this.v(n), (int)lng);
                            return;
                        }
                        case 251: {
                            this.S = true;
                            return;
                        }
                        case 241: {
                            if (!this.G) {
                                this.k(n);
                                this.F.a(lng);
                                this.G = true;
                                return;
                            }
                            break;
                        }
                        case 238: {
                            this.R = (int)lng;
                            return;
                        }
                        case 231: {
                            this.D = this.G(lng);
                            return;
                        }
                        case 215: {
                            this.v(n).c = (int)lng;
                            return;
                        }
                        case 186: {
                            this.v(n).n = (int)lng;
                            return;
                        }
                        case 179: {
                            this.k(n);
                            this.E.a(this.G(lng));
                            return;
                        }
                        case 176: {
                            this.v(n).m = (int)lng;
                            return;
                        }
                        case 159: {
                            this.v(n).P = (int)lng;
                            return;
                        }
                        case 155: {
                            this.K = this.G(lng);
                            return;
                        }
                        case 136: {
                            final c v3 = this.v(n);
                            boolean w2 = b;
                            if (lng == 1L) {
                                w2 = true;
                            }
                            v3.W = w2;
                            return;
                        }
                        case 131: {
                            this.v(n).d = (int)lng;
                            return;
                        }
                    }
                }
                else {
                    if (lng == 1L) {
                        return;
                    }
                    final StringBuilder sb6 = new StringBuilder();
                    sb6.append("ContentEncodingScope ");
                    sb6.append(lng);
                    sb6.append(" not supported");
                    throw d0.A.a(sb6.toString(), null);
                }
            }
            else if (lng != 0L) {
                final StringBuilder sb7 = new StringBuilder();
                sb7.append("ContentEncodingOrder ");
                sb7.append(lng);
                sb7.append(" not supported");
                throw d0.A.a(sb7.toString(), null);
            }
        }
    }
    
    public final class b implements X0.b
    {
        @Override
        public void a(final int n) {
            X0.e.this.q(n);
        }
        
        @Override
        public int b(final int n) {
            return X0.e.this.w(n);
        }
        
        @Override
        public void c(final int n, final double n2) {
            X0.e.this.t(n, n2);
        }
        
        @Override
        public boolean d(final int n) {
            return X0.e.this.B(n);
        }
        
        @Override
        public void e(final int n, final int n2, final s s) {
            X0.e.this.n(n, n2, s);
        }
        
        @Override
        public void f(final int n, final String s) {
            X0.e.this.J(n, s);
        }
        
        @Override
        public void g(final int n, final long n2, final long n3) {
            X0.e.this.I(n, n2, n3);
        }
        
        @Override
        public void h(final int n, final long n2) {
            X0.e.this.z(n, n2);
        }
    }
    
    public static final class c
    {
        public int A;
        public int B;
        public int C;
        public int D;
        public float E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public float L;
        public float M;
        public float N;
        public byte[] O;
        public int P;
        public int Q;
        public int R;
        public long S;
        public long T;
        public U U;
        public boolean V;
        public boolean W;
        public String X;
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
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public float t;
        public float u;
        public float v;
        public byte[] w;
        public int x;
        public boolean y;
        public int z;
        
        public c() {
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = 0;
            this.s = -1;
            this.t = 0.0f;
            this.u = 0.0f;
            this.v = 0.0f;
            this.w = null;
            this.x = -1;
            this.y = false;
            this.z = -1;
            this.A = -1;
            this.B = -1;
            this.C = 1000;
            this.D = 200;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = -1.0f;
            this.P = 1;
            this.Q = -1;
            this.R = 8000;
            this.S = 0L;
            this.T = 0L;
            this.W = true;
            this.X = "eng";
        }
        
        public static /* synthetic */ int b(final c c) {
            return c.g;
        }
        
        public static /* synthetic */ int c(final c c, final int g) {
            return c.g = g;
        }
        
        public static /* synthetic */ String d(final c c, final String x) {
            return c.X = x;
        }
        
        public static Pair k(final z z) {
            while (true) {
                while (true) {
                    int from = 0;
                    Label_0167: {
                        try {
                            z.U(16);
                            final long w = z.w();
                            if (w == 1482049860L) {
                                return new Pair((Object)"video/divx", (Object)null);
                            }
                            if (w == 859189832L) {
                                return new Pair((Object)"video/3gpp", (Object)null);
                            }
                            if (w != 826496599L) {
                                o.h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                return new Pair((Object)"video/x-unknown", (Object)null);
                            }
                            from = z.f() + 20;
                            final byte[] e = z.e();
                            if (from >= e.length - 4) {
                                throw A.a("Failed to find FourCC VC1 initialization data", null);
                            }
                            if (e[from] == 0 && e[from + 1] == 0 && e[from + 2] == 1 && e[from + 3] == 15) {
                                return new Pair((Object)"video/wvc1", (Object)Collections.singletonList(Arrays.copyOfRange(e, from, e.length)));
                            }
                            break Label_0167;
                        }
                        catch (ArrayIndexOutOfBoundsException ex) {
                            throw A.a("Error parsing FourCC private data", null);
                        }
                    }
                    ++from;
                    continue;
                }
            }
        }
        
        public static boolean l(final z z) {
            try {
                final int y = z.y();
                if (y == 1) {
                    return true;
                }
                if (y == 65534) {
                    z.T(24);
                    return z.z() == e.j().getMostSignificantBits() && z.z() == e.j().getLeastSignificantBits();
                }
                return false;
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                throw A.a("Error parsing MS/ACM codec private", null);
            }
        }
        
        public static List m(final byte[] array) {
            while (true) {
                Label_0143: {
                    if (array[0] != 2) {
                        break Label_0143;
                    }
                    int n = 0;
                    int n2 = 1;
                    byte b;
                    while (true) {
                        b = array[n2];
                        if ((b & 0xFF) != 0xFF) {
                            break;
                        }
                        n += 255;
                        ++n2;
                    }
                    final int n3 = n2 + 1;
                    final int n4 = n + (b & 0xFF);
                    int n5 = 0;
                    int n6 = n3;
                    byte b2;
                    while (true) {
                        b2 = array[n6];
                        if ((b2 & 0xFF) != 0xFF) {
                            break;
                        }
                        n5 += 255;
                        ++n6;
                    }
                    final int n7 = n6 + 1;
                    Label_0135: {
                        if (array[n7] != 1) {
                            break Label_0135;
                        }
                        try {
                            final byte[] array2 = new byte[n4];
                            System.arraycopy(array, n7, array2, 0, n4);
                            final int n8 = n7 + n4;
                            if (array[n8] != 3) {
                                throw A.a("Error parsing vorbis codec private", null);
                            }
                            final int n9 = n8 + (n5 + (b2 & 0xFF));
                            if (array[n9] == 5) {
                                final byte[] array3 = new byte[array.length - n9];
                                System.arraycopy(array, n9, array3, 0, array.length - n9);
                                final ArrayList<byte[]> list = new ArrayList<byte[]>(2);
                                list.add(array2);
                                list.add(array3);
                                return list;
                            }
                            throw A.a("Error parsing vorbis codec private", null);
                            throw A.a("Error parsing vorbis codec private", null);
                            throw A.a("Error parsing vorbis codec private", null);
                        }
                        catch (ArrayIndexOutOfBoundsException ex) {
                            throw A.a("Error parsing vorbis codec private", null);
                        }
                    }
                }
                continue;
            }
        }
        
        public final void f() {
            g0.a.e(this.Y);
        }
        
        public final byte[] g(final String str) {
            final byte[] k = this.k;
            if (k != null) {
                return k;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Missing CodecPrivate for codec ");
            sb.append(str);
            throw d0.A.a(sb.toString(), null);
        }
        
        public final byte[] h() {
            if (this.E != -1.0f && this.F != -1.0f && this.G != -1.0f && this.H != -1.0f && this.I != -1.0f && this.J != -1.0f && this.K != -1.0f && this.L != -1.0f && this.M != -1.0f && this.N != -1.0f) {
                final byte[] array = new byte[25];
                final ByteBuffer order = ByteBuffer.wrap(array).order(ByteOrder.LITTLE_ENDIAN);
                order.put((byte)0);
                order.putShort((short)(this.E * 50000.0f + 0.5f));
                order.putShort((short)(this.F * 50000.0f + 0.5f));
                order.putShort((short)(this.G * 50000.0f + 0.5f));
                order.putShort((short)(this.H * 50000.0f + 0.5f));
                order.putShort((short)(this.I * 50000.0f + 0.5f));
                order.putShort((short)(this.J * 50000.0f + 0.5f));
                order.putShort((short)(this.K * 50000.0f + 0.5f));
                order.putShort((short)(this.L * 50000.0f + 0.5f));
                order.putShort((short)(this.M + 0.5f));
                order.putShort((short)(this.N + 0.5f));
                order.putShort((short)this.C);
                order.putShort((short)this.D);
                return array;
            }
            return null;
        }
        
        public void i(final t t, final int n) {
            final String b = this.b;
            b.hashCode();
            int n2 = 0;
            Label_0982: {
                switch (b) {
                    case "A_OPUS": {
                        n2 = 32;
                        break Label_0982;
                    }
                    case "A_FLAC": {
                        n2 = 31;
                        break Label_0982;
                    }
                    case "A_EAC3": {
                        n2 = 30;
                        break Label_0982;
                    }
                    case "V_MPEG2": {
                        n2 = 29;
                        break Label_0982;
                    }
                    case "S_TEXT/UTF8": {
                        n2 = 28;
                        break Label_0982;
                    }
                    case "S_TEXT/WEBVTT": {
                        n2 = 27;
                        break Label_0982;
                    }
                    case "V_MPEGH/ISO/HEVC": {
                        n2 = 26;
                        break Label_0982;
                    }
                    case "S_TEXT/ASS": {
                        n2 = 25;
                        break Label_0982;
                    }
                    case "A_PCM/INT/LIT": {
                        n2 = 24;
                        break Label_0982;
                    }
                    case "A_PCM/INT/BIG": {
                        n2 = 23;
                        break Label_0982;
                    }
                    case "A_PCM/FLOAT/IEEE": {
                        n2 = 22;
                        break Label_0982;
                    }
                    case "A_DTS/EXPRESS": {
                        n2 = 21;
                        break Label_0982;
                    }
                    case "V_THEORA": {
                        n2 = 20;
                        break Label_0982;
                    }
                    case "S_HDMV/PGS": {
                        n2 = 19;
                        break Label_0982;
                    }
                    case "V_VP9": {
                        n2 = 18;
                        break Label_0982;
                    }
                    case "V_VP8": {
                        n2 = 17;
                        break Label_0982;
                    }
                    case "V_AV1": {
                        n2 = 16;
                        break Label_0982;
                    }
                    case "A_DTS": {
                        n2 = 15;
                        break Label_0982;
                    }
                    case "A_AC3": {
                        n2 = 14;
                        break Label_0982;
                    }
                    case "A_AAC": {
                        n2 = 13;
                        break Label_0982;
                    }
                    case "A_DTS/LOSSLESS": {
                        n2 = 12;
                        break Label_0982;
                    }
                    case "S_VOBSUB": {
                        n2 = 11;
                        break Label_0982;
                    }
                    case "V_MPEG4/ISO/AVC": {
                        n2 = 10;
                        break Label_0982;
                    }
                    case "V_MPEG4/ISO/ASP": {
                        n2 = 9;
                        break Label_0982;
                    }
                    case "S_DVBSUB": {
                        n2 = 8;
                        break Label_0982;
                    }
                    case "V_MS/VFW/FOURCC": {
                        n2 = 7;
                        break Label_0982;
                    }
                    case "A_MPEG/L3": {
                        n2 = 6;
                        break Label_0982;
                    }
                    case "A_MPEG/L2": {
                        n2 = 5;
                        break Label_0982;
                    }
                    case "A_VORBIS": {
                        n2 = 4;
                        break Label_0982;
                    }
                    case "A_TRUEHD": {
                        n2 = 3;
                        break Label_0982;
                    }
                    case "A_MS/ACM": {
                        n2 = 2;
                        break Label_0982;
                    }
                    case "V_MPEG4/ISO/SP": {
                        n2 = 1;
                        break Label_0982;
                    }
                    case "V_MPEG4/ISO/AP": {
                        n2 = 0;
                        break Label_0982;
                    }
                    default:
                        break;
                }
                n2 = -1;
            }
            String s = "audio/raw";
            final d0.h h = null;
            Object o = null;
            int n3 = 0;
            int e2 = 0;
            String s5 = null;
        Label_1260:
            while (true) {
                Label_1965: {
                    List<byte[]> list2 = null;
                    Label_1900: {
                        Label_1532: {
                            int e0 = 0;
                        Label_1528:
                            while (true) {
                                StringBuilder sb = null;
                                String str = null;
                                Label_1467: {
                                    List list = null;
                                    String s4 = null;
                                    Label_1391: {
                                        Label_1302: {
                                            String s2 = null;
                                            String s3 = null;
                                            switch (n2) {
                                                default: {
                                                    throw d0.A.a("Unrecognized codec identifier.", null);
                                                }
                                                case 32: {
                                                    o = new ArrayList<byte[]>(3);
                                                    ((List<byte[]>)o).add(this.g(this.b));
                                                    final ByteBuffer allocate = ByteBuffer.allocate(8);
                                                    final ByteOrder little_ENDIAN = ByteOrder.LITTLE_ENDIAN;
                                                    ((List<byte[]>)o).add(allocate.order(little_ENDIAN).putLong(this.S).array());
                                                    ((List<byte[]>)o).add(ByteBuffer.allocate(8).order(little_ENDIAN).putLong(this.T).array());
                                                    s2 = "audio/opus";
                                                    n3 = 5760;
                                                    s3 = null;
                                                    break;
                                                }
                                                case 31: {
                                                    o = Collections.singletonList(this.g(this.b));
                                                    s2 = "audio/flac";
                                                    final String c = null;
                                                    break Label_1287;
                                                }
                                                case 30: {
                                                    s2 = "audio/eac3";
                                                    break Label_1302;
                                                }
                                                case 29: {
                                                    s2 = "video/mpeg2";
                                                    break Label_1302;
                                                }
                                                case 28: {
                                                    final String c;
                                                    o = (c = null);
                                                    s2 = "application/x-subrip";
                                                    break Label_1287;
                                                }
                                                case 27: {
                                                    s2 = "text/vtt";
                                                    break Label_1302;
                                                }
                                                case 26: {
                                                    final F a = F0.F.a(new z(this.g(this.b)));
                                                    list = a.a;
                                                    this.Z = a.b;
                                                    s4 = a.l;
                                                    s = "video/hevc";
                                                    break Label_1391;
                                                }
                                                case 25: {
                                                    o = X2.v.a0(X0.e.f(), this.g(this.b));
                                                    final String c = null;
                                                    s2 = "text/x-ssa";
                                                    break Label_1287;
                                                }
                                                case 24: {
                                                    e0 = g0.M.e0(this.Q);
                                                    if (e0 == 0) {
                                                        sb = new StringBuilder();
                                                        str = "Unsupported little endian PCM bit depth: ";
                                                        break Label_1467;
                                                    }
                                                    break Label_1528;
                                                }
                                                case 23: {
                                                    final int q = this.Q;
                                                    if (q == 8) {
                                                        e2 = 3;
                                                        break Label_1532;
                                                    }
                                                    if (q == 16) {
                                                        e0 = 268435456;
                                                        break Label_1528;
                                                    }
                                                    if (q == 24) {
                                                        e0 = 1342177280;
                                                        break Label_1528;
                                                    }
                                                    if (q == 32) {
                                                        e0 = 1610612736;
                                                        break Label_1528;
                                                    }
                                                    sb = new StringBuilder();
                                                    str = "Unsupported big endian PCM bit depth: ";
                                                    break Label_1467;
                                                }
                                                case 22: {
                                                    if (this.Q == 32) {
                                                        o = (s5 = null);
                                                        n3 = -1;
                                                        e2 = 4;
                                                        break Label_1260;
                                                    }
                                                    sb = new StringBuilder();
                                                    str = "Unsupported floating point PCM bit depth: ";
                                                    break Label_1467;
                                                }
                                                case 20: {
                                                    s2 = "video/x-unknown";
                                                    break Label_1302;
                                                }
                                                case 19: {
                                                    final String c;
                                                    o = (c = null);
                                                    s2 = "application/pgs";
                                                    break Label_1287;
                                                }
                                                case 18: {
                                                    s2 = "video/x-vnd.on2.vp9";
                                                    break Label_1302;
                                                }
                                                case 17: {
                                                    s2 = "video/x-vnd.on2.vp8";
                                                    break Label_1302;
                                                }
                                                case 16: {
                                                    s2 = "video/av01";
                                                    break Label_1302;
                                                }
                                                case 15:
                                                case 21: {
                                                    s2 = "audio/vnd.dts";
                                                    break Label_1302;
                                                }
                                                case 14: {
                                                    s2 = "audio/ac3";
                                                    break Label_1302;
                                                }
                                                case 13: {
                                                    o = Collections.singletonList(this.g(this.b));
                                                    final F0.a.b e3 = F0.a.e(this.k);
                                                    this.R = e3.a;
                                                    this.P = e3.b;
                                                    final String c = e3.c;
                                                    s2 = "audio/mp4a-latm";
                                                    break Label_1287;
                                                }
                                                case 12: {
                                                    s2 = "audio/vnd.dts.hd";
                                                    break Label_1302;
                                                }
                                                case 11: {
                                                    o = X2.v.Z(this.g(this.b));
                                                    final String c = null;
                                                    s2 = "application/vobsub";
                                                    break Label_1287;
                                                }
                                                case 10: {
                                                    final F0.d b2 = F0.d.b(new z(this.g(this.b)));
                                                    list = b2.a;
                                                    this.Z = b2.b;
                                                    s4 = b2.l;
                                                    s = "video/avc";
                                                    break Label_1391;
                                                }
                                                case 8: {
                                                    final byte[] array = new byte[4];
                                                    System.arraycopy(this.g(this.b), 0, array, 0, 4);
                                                    list2 = (List<byte[]>)X2.v.Z(array);
                                                    s = "application/dvbsubs";
                                                    break Label_1900;
                                                }
                                                case 7: {
                                                    final Pair k = k(new z(this.g(this.b)));
                                                    s = (String)k.first;
                                                    list2 = (List<byte[]>)k.second;
                                                    break Label_1900;
                                                }
                                                case 6: {
                                                    s = "audio/mpeg";
                                                    break Label_1965;
                                                }
                                                case 5: {
                                                    s = "audio/mpeg-L2";
                                                    break Label_1965;
                                                }
                                                case 4: {
                                                    o = m(this.g(this.b));
                                                    s = "audio/vorbis";
                                                    n3 = 8192;
                                                    s5 = null;
                                                    break Label_1260;
                                                }
                                                case 3: {
                                                    this.U = new U();
                                                    s = "audio/true-hd";
                                                    list2 = null;
                                                    break Label_1900;
                                                }
                                                case 2: {
                                                    StringBuilder sb2;
                                                    if (l(new z(this.g(this.b)))) {
                                                        e2 = g0.M.e0(this.Q);
                                                        if (e2 != 0) {
                                                            o = (s5 = null);
                                                            n3 = -1;
                                                            break Label_1260;
                                                        }
                                                        sb2 = new StringBuilder();
                                                        sb2.append("Unsupported PCM bit depth: ");
                                                        sb2.append(this.Q);
                                                        sb2.append(". Setting mimeType to ");
                                                    }
                                                    else {
                                                        sb2 = new StringBuilder();
                                                        sb2.append("Non-PCM MS/ACM is unsupported. Setting mimeType to ");
                                                    }
                                                    sb2.append("audio/x-unknown");
                                                    g0.o.h("MatroskaExtractor", sb2.toString());
                                                    list2 = null;
                                                    s = "audio/x-unknown";
                                                    break Label_1900;
                                                }
                                                case 0:
                                                case 1:
                                                case 9: {
                                                    final byte[] i = this.k;
                                                    if (i == null) {
                                                        list2 = null;
                                                    }
                                                    else {
                                                        list2 = Collections.singletonList(i);
                                                    }
                                                    s = "video/mp4v-es";
                                                    break Label_1900;
                                                }
                                            }
                                            while (true) {
                                                s = s2;
                                                s5 = s3;
                                                e2 = -1;
                                                break Label_1260;
                                                n3 = -1;
                                                final String c;
                                                s3 = c;
                                                continue;
                                            }
                                        }
                                        String c;
                                        o = (c = null);
                                        continue;
                                    }
                                    n3 = -1;
                                    e2 = -1;
                                    final String s6 = s4;
                                    o = list;
                                    s5 = s6;
                                    break Label_1260;
                                }
                                sb.append(str);
                                sb.append(this.Q);
                                sb.append(". Setting mimeType to ");
                                sb.append("audio/x-unknown");
                                g0.o.h("MatroskaExtractor", sb.toString());
                                String c;
                                o = (c = null);
                                String s2 = "audio/x-unknown";
                                continue;
                            }
                            e2 = e0;
                        }
                        s5 = null;
                        o = null;
                        n3 = -1;
                        break Label_1260;
                    }
                    final String s7 = null;
                    n3 = -1;
                    o = list2;
                    s5 = s7;
                    continue Label_1260;
                }
                n3 = 4096;
                o = (s5 = null);
                continue Label_1260;
            }
            String c2 = s5;
            String s8 = s;
            if (this.O != null) {
                final F0.o a2 = F0.o.a(new z(this.O));
                c2 = s5;
                s8 = s;
                if (a2 != null) {
                    c2 = a2.c;
                    s8 = "video/dolby-vision";
                }
            }
            final boolean w = this.W;
            int n4;
            if (this.V) {
                n4 = 2;
            }
            else {
                n4 = 0;
            }
            final d0.q.b b3 = new d0.q.b();
            int n5;
            if (d0.z.o(s8)) {
                b3.N(this.P).p0(this.R).i0(e2);
                n5 = 1;
            }
            else if (d0.z.s(s8)) {
                if (this.r == 0) {
                    int p2;
                    if ((p2 = this.p) == -1) {
                        p2 = this.m;
                    }
                    this.p = p2;
                    int q2;
                    if ((q2 = this.q) == -1) {
                        q2 = this.n;
                    }
                    this.q = q2;
                }
                final int n6 = -1;
                final int p3 = this.p;
                float n7 = 0.0f;
                Label_2455: {
                    if (p3 != -1) {
                        final int q3 = this.q;
                        if (q3 != -1) {
                            n7 = this.n * p3 / (float)(this.m * q3);
                            break Label_2455;
                        }
                    }
                    n7 = -1.0f;
                }
                d0.h a3 = h;
                if (this.y) {
                    a3 = new d0.h.b().d(this.z).c(this.B).e(this.A).f(this.h()).g(this.o).b(this.o).a();
                }
                int intValue = n6;
                if (this.a != null) {
                    intValue = n6;
                    if (X0.e.h().containsKey(this.a)) {
                        intValue = X0.e.h().get(this.a);
                    }
                }
                int n8 = intValue;
                if (this.s == 0) {
                    n8 = intValue;
                    if (Float.compare(this.t, 0.0f) == 0) {
                        n8 = intValue;
                        if (Float.compare(this.u, 0.0f) == 0) {
                            if (Float.compare(this.v, 0.0f) == 0) {
                                n8 = 0;
                            }
                            else if (Float.compare(this.v, 90.0f) == 0) {
                                n8 = 90;
                            }
                            else if (Float.compare(this.v, -180.0f) != 0 && Float.compare(this.v, 180.0f) != 0) {
                                n8 = intValue;
                                if (Float.compare(this.v, -90.0f) == 0) {
                                    n8 = 270;
                                }
                            }
                            else {
                                n8 = 180;
                            }
                        }
                    }
                }
                b3.v0(this.m).Y(this.n).k0(n7).n0(n8).l0(this.w).r0(this.x).P(a3);
                n5 = 2;
            }
            else {
                if (!"application/x-subrip".equals(s8) && !"text/x-ssa".equals(s8) && !"text/vtt".equals(s8) && !"application/vobsub".equals(s8) && !"application/pgs".equals(s8) && !"application/dvbsubs".equals(s8)) {
                    throw d0.A.a("Unexpected MIME type.", null);
                }
                n5 = 3;
            }
            if (this.a != null && !X0.e.h().containsKey(this.a)) {
                b3.c0(this.a);
            }
            (this.Y = t.a(this.c, n5)).d(b3.Z(n).o0(s8).f0(n3).e0(this.X).q0(n4 | (w ? 1 : 0)).b0((List)o).O(c2).U(this.l).K());
        }
        
        public void j() {
            final U u = this.U;
            if (u != null) {
                u.a(this.Y, this.j);
            }
        }
        
        public void n() {
            final U u = this.U;
            if (u != null) {
                u.b();
            }
        }
        
        public final boolean o(final boolean b) {
            if ("A_OPUS".equals(this.b)) {
                return b;
            }
            return this.f > 0;
        }
    }
}
