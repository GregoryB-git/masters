// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m0;

import android.os.BaseBundle;
import android.media.AudioDeviceInfo;
import d0.e;
import d0.b;
import F0.W;
import k0.v0;
import g0.o;
import d0.C;
import android.os.Bundle;
import g0.r;
import java.nio.ByteOrder;
import g0.a;
import java.nio.ByteBuffer;
import java.util.Objects;
import j0.i;
import android.media.MediaFormat;
import android.media.MediaCrypto;
import k0.Z0;
import t0.I;
import X2.v;
import java.util.List;
import t0.p;
import g0.M;
import k0.Y0;
import android.os.Handler;
import t0.m;
import d0.q;
import android.content.Context;
import k0.A0;
import t0.w;

public class b0 extends w implements A0
{
    public final Context V0;
    public final x.a W0;
    public final z X0;
    public int Y0;
    public boolean Z0;
    public boolean a1;
    public q b1;
    public q c1;
    public long d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public int h1;
    public boolean i1;
    public long j1;
    
    public b0(final Context context, final m.b b, final t0.z z, final boolean b2, final Handler handler, final x x, final z x2) {
        super(1, b, z, b2, 44100.0f);
        this.V0 = context.getApplicationContext();
        this.X0 = x2;
        this.h1 = -1000;
        this.W0 = new x.a(handler, x);
        this.j1 = -9223372036854775807L;
        x2.C((z.d)new c(null));
    }
    
    public static /* synthetic */ boolean Q1(final b0 b0, final boolean g1) {
        return b0.g1 = g1;
    }
    
    public static /* synthetic */ x.a R1(final b0 b0) {
        return b0.W0;
    }
    
    public static boolean V1(String b) {
        if (M.a < 24 && "OMX.SEC.aac.dec".equals(b) && "samsung".equals(M.c)) {
            b = M.b;
            if (b.startsWith("zeroflte") || b.startsWith("herolte") || b.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean W1(final String s) {
        return s.equals("OMX.google.opus.decoder") || s.equals("c2.android.opus.decoder") || s.equals("OMX.google.vorbis.decoder") || s.equals("c2.android.vorbis.decoder");
    }
    
    public static boolean X1() {
        if (M.a == 23) {
            final String d = M.d;
            if ("ZTE B2017G".equals(d) || "AXON 7 mini".equals(d)) {
                return true;
            }
        }
        return false;
    }
    
    private int Z1(final p p2, final q q) {
        if ("OMX.google.raw.decoder".equals(p2.a)) {
            final int a = g0.M.a;
            if (a < 24 && (a != 23 || !g0.M.E0(this.V0))) {
                return -1;
            }
        }
        return q.o;
    }
    
    public static List b2(final t0.z z, final q q, final boolean b, final z z2) {
        if (q.n == null) {
            return v.Y();
        }
        if (z2.a(q)) {
            final p x = I.x();
            if (x != null) {
                return v.Z(x);
            }
        }
        return I.v(z, q, b, false);
    }
    
    @Override
    public A0 B() {
        return this;
    }
    
    @Override
    public long H() {
        if (this.getState() == 2) {
            this.f2();
        }
        return this.d1;
    }
    
    @Override
    public float J0(final float n, final q q, final q[] array) {
        final int length = array.length;
        int i = 0;
        int a = -1;
        while (i < length) {
            final int c = array[i].C;
            int max = a;
            if (c != -1) {
                max = Math.max(a, c);
            }
            ++i;
            a = max;
        }
        if (a == -1) {
            return -1.0f;
        }
        return n * a;
    }
    
    @Override
    public boolean K1(final q q) {
        if (this.M().a != 0) {
            final int y1 = this.Y1(q);
            if ((y1 & 0x200) != 0x0 && (this.M().a == 2 || (y1 & 0x400) != 0x0 || (q.E == 0 && q.F == 0))) {
                return true;
            }
        }
        return this.X0.a(q);
    }
    
    @Override
    public List L0(final t0.z z, final q q, final boolean b) {
        return t0.I.w(b2(z, q, b, this.X0), q);
    }
    
    @Override
    public int L1(final t0.z z, final q q) {
        final boolean o = d0.z.o(q.n);
        int n = 0;
        if (!o) {
            return k0.Z0.a(0);
        }
        int n2;
        if (g0.M.a >= 21) {
            n2 = 32;
        }
        else {
            n2 = 0;
        }
        final int k = q.K;
        boolean b = true;
        final boolean b2 = k != 0;
        final boolean m1 = w.M1(q);
        int y1;
        if (m1 && (!b2 || t0.I.x() != null)) {
            y1 = this.Y1(q);
            if (this.X0.a(q)) {
                return k0.Z0.b(4, 8, n2, y1);
            }
        }
        else {
            y1 = 0;
        }
        if ("audio/raw".equals(q.n) && !this.X0.a(q)) {
            return k0.Z0.a(1);
        }
        if (!this.X0.a(g0.M.f0(2, q.B, q.C))) {
            return k0.Z0.a(1);
        }
        final List b3 = b2(z, q, false, this.X0);
        if (b3.isEmpty()) {
            return k0.Z0.a(1);
        }
        if (!m1) {
            return k0.Z0.a(2);
        }
        p p2 = b3.get(0);
        final boolean i = p2.m(q);
        boolean b4 = false;
        Label_0303: {
            if (!i) {
                for (int j = 1; j < b3.size(); ++j) {
                    final p p3 = b3.get(j);
                    if (p3.m(q)) {
                        b4 = false;
                        p2 = p3;
                        break Label_0303;
                    }
                }
            }
            b4 = true;
            b = i;
        }
        int n3;
        if (b) {
            n3 = 4;
        }
        else {
            n3 = 3;
        }
        int n4;
        if (b && p2.p(q)) {
            n4 = 16;
        }
        else {
            n4 = 8;
        }
        int n5;
        if (p2.h) {
            n5 = 64;
        }
        else {
            n5 = 0;
        }
        if (b4) {
            n = 128;
        }
        return k0.Z0.d(n3, n4, n2, n5, n, y1);
    }
    
    @Override
    public long M0(final boolean b, long b2, final long n) {
        final long j1 = this.j1;
        if (j1 != -9223372036854775807L) {
            final float n2 = (float)(j1 - b2);
            float a;
            if (this.h() != null) {
                a = this.h().a;
            }
            else {
                a = 1.0f;
            }
            final long n3 = b2 = (long)(n2 / a / 2.0f);
            if (this.i1) {
                b2 = n3 - (g0.M.J0(this.L().b()) - n);
            }
            return Math.max(10000L, b2);
        }
        return super.M0(b, b2, n);
    }
    
    @Override
    public m.a O0(final p p4, final q q, final MediaCrypto mediaCrypto, final float n) {
        this.Y0 = this.a2(p4, q, this.R());
        this.Z0 = V1(p4.a);
        this.a1 = W1(p4.a);
        final MediaFormat c2 = this.c2(q, p4.c, this.Y0, n);
        q c3;
        if ("audio/raw".equals(p4.b) && !"audio/raw".equals(q.n)) {
            c3 = q;
        }
        else {
            c3 = null;
        }
        this.c1 = c3;
        return t0.m.a.a(p4, c2, q, mediaCrypto);
    }
    
    @Override
    public void T() {
        this.f1 = true;
        this.b1 = null;
        try {
            this.X0.flush();
            try {
                super.T();
            }
            finally {
                this.W0.s(super.Q0);
            }
        }
        finally {
            try {
                super.T();
                this.W0.s(super.Q0);
            }
            finally {
                this.W0.s(super.Q0);
            }
        }
    }
    
    @Override
    public void T0(final i i) {
        if (g0.M.a >= 29) {
            final q p = i.p;
            if (p != null && Objects.equals(p.n, "audio/opus") && this.Z0()) {
                final ByteBuffer byteBuffer = (ByteBuffer)a.e(i.u);
                final int e = ((q)a.e(i.p)).E;
                if (byteBuffer.remaining() == 8) {
                    this.X0.q(e, (int)(byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000L / 1000000000L));
                }
            }
        }
    }
    
    @Override
    public void U(final boolean b, final boolean b2) {
        super.U(b, b2);
        this.W0.t(super.Q0);
        if (this.M().b) {
            this.X0.e();
        }
        else {
            this.X0.x();
        }
        this.X0.t(this.Q());
        this.X0.A(this.L());
    }
    
    @Override
    public void W(final long d1, final boolean b) {
        super.W(d1, b);
        this.X0.flush();
        this.d1 = d1;
        this.g1 = false;
        this.e1 = true;
    }
    
    @Override
    public void X() {
        this.X0.release();
    }
    
    public final int Y1(final q q) {
        final k r = this.X0.r(q);
        if (!r.a) {
            return 0;
        }
        int n;
        if (r.b) {
            n = 1536;
        }
        else {
            n = 512;
        }
        int n2 = n;
        if (r.c) {
            n2 = (n | 0x800);
        }
        return n2;
    }
    
    @Override
    public void Z() {
        this.g1 = false;
        try {
            super.Z();
        }
        finally {
            if (this.f1) {
                this.f1 = false;
                this.X0.b();
            }
        }
    }
    
    @Override
    public void a0() {
        super.a0();
        this.X0.p();
        this.i1 = true;
    }
    
    public int a2(final p p3, final q q, final q[] array) {
        int z1 = this.Z1(p3, q);
        if (array.length == 1) {
            return z1;
        }
        int max;
        for (int length = array.length, i = 0; i < length; ++i, z1 = max) {
            final q q2 = array[i];
            max = z1;
            if (p3.e(q, q2).d != 0) {
                max = Math.max(z1, this.Z1(p3, q2));
            }
        }
        return z1;
    }
    
    @Override
    public void b0() {
        this.f2();
        this.i1 = false;
        this.X0.j();
        super.b0();
    }
    
    @Override
    public boolean c() {
        return super.c() && this.X0.c();
    }
    
    public MediaFormat c2(final q q, final String s, int a, final float n) {
        final MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", s);
        mediaFormat.setInteger("channel-count", q.B);
        mediaFormat.setInteger("sample-rate", q.C);
        g0.r.e(mediaFormat, q.q);
        g0.r.d(mediaFormat, "max-input-size", a);
        a = g0.M.a;
        if (a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (n != -1.0f && !X1()) {
                mediaFormat.setFloat("operating-rate", n);
            }
        }
        if (a <= 28 && "audio/ac4".equals(q.n)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (a >= 24 && this.X0.o(g0.M.f0(4, q.B, q.C)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (a >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (a >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.h1));
        }
        return mediaFormat;
    }
    
    @Override
    public String d() {
        return "MediaCodecAudioRenderer";
    }
    
    public void d2() {
        this.e1 = true;
    }
    
    @Override
    public boolean e() {
        return this.X0.i() || super.e();
    }
    
    public final void e2() {
        final m f0 = this.F0();
        if (f0 == null) {
            return;
        }
        if (g0.M.a >= 35) {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putInt("importance", Math.max(0, -this.h1));
            f0.c(bundle);
        }
    }
    
    public final void f2() {
        long n = this.X0.w(this.c());
        if (n != Long.MIN_VALUE) {
            if (!this.e1) {
                n = Math.max(this.d1, n);
            }
            this.d1 = n;
            this.e1 = false;
        }
    }
    
    @Override
    public C h() {
        return this.X0.h();
    }
    
    @Override
    public void h1(final Exception ex) {
        g0.o.d("MediaCodecAudioRenderer", "Audio codec error", ex);
        this.W0.m(ex);
    }
    
    @Override
    public void i1(final String s, final m.a a, final long n, final long n2) {
        this.W0.q(s, n, n2);
    }
    
    @Override
    public void j1(final String s) {
        this.W0.r(s);
    }
    
    @Override
    public void k(final C c) {
        this.X0.k(c);
    }
    
    @Override
    public k0.p k0(final p p3, final q q, final q q2) {
        final k0.p e = p3.e(q, q2);
        int e2;
        final int n = e2 = e.e;
        if (this.a1(q2)) {
            e2 = (n | 0x8000);
        }
        int n2 = e2;
        if (this.Z1(p3, q2) > this.Y0) {
            n2 = (e2 | 0x40);
        }
        final String a = p3.a;
        int d;
        if (n2 != 0) {
            d = 0;
        }
        else {
            d = e.d;
        }
        return new k0.p(a, q, q2, d, n2);
    }
    
    @Override
    public k0.p k1(final v0 v0) {
        final q b1 = (q)a.e(v0.b);
        this.b1 = b1;
        final k0.p k1 = super.k1(v0);
        this.W0.u(b1, k1);
        return k1;
    }
    
    @Override
    public void l1(q q, final MediaFormat mediaFormat) {
        final q c1 = this.c1;
        final int[] array = null;
        final int[] array2 = null;
        Label_0318: {
            int[] a;
            if (c1 != null) {
                q = c1;
                a = array;
            }
            else if (this.F0() == null) {
                a = array;
            }
            else {
                g0.a.e(mediaFormat);
                int n;
                if ("audio/raw".equals(q.n)) {
                    n = q.D;
                }
                else if (g0.M.a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                    n = mediaFormat.getInteger("pcm-encoding");
                }
                else if (mediaFormat.containsKey("v-bits-per-sample")) {
                    n = g0.M.e0(mediaFormat.getInteger("v-bits-per-sample"));
                }
                else {
                    n = 2;
                }
                final q k = new q.b().o0("audio/raw").i0(n).V(q.E).W(q.F).h0(q.k).T(q.l).a0(q.a).c0(q.b).d0(q.c).e0(q.d).q0(q.e).m0(q.f).N(mediaFormat.getInteger("channel-count")).p0(mediaFormat.getInteger("sample-rate")).K();
                while (true) {
                    Label_0296: {
                        if (!this.Z0 || k.B != 6) {
                            break Label_0296;
                        }
                        final int b = q.B;
                        if (b >= 6) {
                            break Label_0296;
                        }
                        final int[] array3 = new int[b];
                        int n2 = 0;
                        while (true) {
                            a = array3;
                            if (n2 >= q.B) {
                                break;
                            }
                            array3[n2] = n2;
                            ++n2;
                        }
                        q = k;
                        break Label_0318;
                    }
                    a = array2;
                    if (this.a1) {
                        a = F0.W.a(k.B);
                    }
                    continue;
                }
            }
            try {
                if (g0.M.a >= 29) {
                    if (this.Z0() && this.M().a != 0) {
                        this.X0.v(this.M().a);
                    }
                    else {
                        this.X0.v(0);
                    }
                }
                this.X0.z(q, 0, a);
            }
            catch (z.b b2) {
                throw this.J(b2, b2.o, 5001);
            }
        }
    }
    
    @Override
    public void m1(final long n) {
        this.X0.y(n);
    }
    
    @Override
    public void o1() {
        super.o1();
        this.X0.B();
    }
    
    @Override
    public boolean r() {
        final boolean g1 = this.g1;
        this.g1 = false;
        return g1;
    }
    
    @Override
    public boolean s1(final long n, final long n2, final m m, final ByteBuffer byteBuffer, int n3, final int n4, final int n5, final long j1, final boolean b, final boolean b2, final q q) {
        a.e(byteBuffer);
        this.j1 = -9223372036854775807L;
        if (this.c1 != null && (n4 & 0x2) != 0x0) {
            ((m)a.e(m)).f(n3, false);
            return true;
        }
        if (b) {
            if (m != null) {
                m.f(n3, false);
            }
            final k0.o q2 = super.Q0;
            q2.f += n5;
            this.X0.B();
            return true;
        }
        try {
            if (this.X0.u(byteBuffer, j1, n5)) {
                if (m != null) {
                    m.f(n3, false);
                }
                final k0.o q3 = super.Q0;
                q3.e += n5;
                return true;
            }
            this.j1 = j1;
            return false;
        }
        catch (z.f f) {
            final boolean p11 = f.p;
            if (this.Z0() && this.M().a != 0) {
                n3 = 5003;
            }
            else {
                n3 = 5002;
            }
            throw this.K(f, q, p11, n3);
        }
        catch (z.c c2) {
            final q b3 = this.b1;
            final z.c c;
            final boolean p12 = c.p;
            if (this.Z0() && this.M().a != 0) {
                n3 = 5004;
            }
            else {
                n3 = 5001;
            }
            throw this.K(c, b3, p12, n3);
        }
    }
    
    @Override
    public void t(final int n, final Object o) {
        if (n != 2) {
            if (n == 3) {
                this.X0.s((d0.b)a.e(o));
                return;
            }
            if (n == 6) {
                this.X0.m((d0.e)a.e(o));
                return;
            }
            if (n != 12) {
                if (n == 16) {
                    this.h1 = (int)a.e(o);
                    this.e2();
                    return;
                }
                if (n == 9) {
                    this.X0.d((boolean)a.e(o));
                    return;
                }
                if (n != 10) {
                    super.t(n, o);
                    return;
                }
                this.X0.n((int)a.e(o));
            }
            else if (g0.M.a >= 23) {
                b.a(this.X0, o);
            }
        }
        else {
            this.X0.l((float)a.e(o));
        }
    }
    
    @Override
    public void x1() {
        try {
            this.X0.g();
            if (this.N0() != -9223372036854775807L) {
                this.j1 = this.N0();
            }
        }
        catch (z.f f) {
            final q q = f.q;
            final boolean p = f.p;
            int n;
            if (this.Z0()) {
                n = 5003;
            }
            else {
                n = 5002;
            }
            throw this.K(f, q, p, n);
        }
    }
    
    public abstract static final class b
    {
        public static void a(final z z, final Object o) {
            z.f((AudioDeviceInfo)o);
        }
    }
    
    public final class c implements z.d
    {
        @Override
        public void a(final z.a a) {
            b0.R1(b0.this).o(a);
        }
        
        @Override
        public void b(final long n) {
            b0.R1(b0.this).H(n);
        }
        
        @Override
        public void c(final boolean b) {
            b0.R1(b0.this).I(b);
        }
        
        @Override
        public void d(final Exception ex) {
            g0.o.d("MediaCodecAudioRenderer", "Audio sink error", ex);
            b0.R1(b0.this).n(ex);
        }
        
        @Override
        public void e(final z.a a) {
            b0.R1(b0.this).p(a);
        }
        
        @Override
        public void f() {
            n.this.Y();
        }
        
        @Override
        public void g() {
            b0.Q1(b0.this, true);
        }
        
        @Override
        public void h() {
            b0.this.d2();
        }
        
        @Override
        public void i() {
            final Y0.a t1 = w.this.S0();
            if (t1 != null) {
                t1.a();
            }
        }
        
        @Override
        public void j() {
            final Y0.a s1 = w.this.S0();
            if (s1 != null) {
                s1.b();
            }
        }
        
        @Override
        public void k(final int n, final long n2, final long n3) {
            b0.R1(b0.this).J(n, n2, n3);
        }
    }
}
