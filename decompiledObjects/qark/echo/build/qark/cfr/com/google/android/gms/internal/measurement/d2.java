/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.K4;
import com.google.android.gms.internal.measurement.T1;
import com.google.android.gms.internal.measurement.T4;
import com.google.android.gms.internal.measurement.V1;
import com.google.android.gms.internal.measurement.Y1;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.b2;
import com.google.android.gms.internal.measurement.e2;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.h2;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.j3;
import java.util.Collections;
import java.util.List;

public final class d2
extends Y3
implements K4 {
    private static final d2 zzc;
    private static volatile T4 zzd;
    private String zzaa = "";
    private long zzab;
    private int zzac;
    private String zzad = "";
    private String zzae = "";
    private boolean zzaf;
    private h4 zzag = Y3.B();
    private String zzah = "";
    private int zzai;
    private int zzaj;
    private int zzak;
    private String zzal = "";
    private long zzam;
    private long zzan;
    private String zzao = "";
    private String zzap = "";
    private int zzaq;
    private String zzar = "";
    private e2 zzas;
    private f4 zzat = Y3.z();
    private long zzau;
    private long zzav;
    private String zzaw = "";
    private String zzax = "";
    private int zzay;
    private boolean zzaz;
    private String zzba = "";
    private boolean zzbb;
    private b2 zzbc;
    private String zzbd = "";
    private h4 zzbe = Y3.B();
    private String zzbf = "";
    private long zzbg;
    private boolean zzbh;
    private String zzbi = "";
    private boolean zzbj;
    private String zzbk = "";
    private int zzbl;
    private String zzbm = "";
    private V1 zzbn;
    private int zze;
    private int zzf;
    private int zzg;
    private h4 zzh = Y3.B();
    private h4 zzi = Y3.B();
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private int zzs;
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private long zzw;
    private long zzx;
    private String zzy = "";
    private boolean zzz;

    static {
        d2 d22;
        zzc = d22 = new d2();
        Y3.t(d2.class, d22);
    }

    public static a A3() {
        return (a)zzc.w();
    }

    private final void F0(long l8) {
        this.zze |= 536870912;
        this.zzam = l8;
    }

    private final void J(long l8) {
        this.zzf |= 32;
        this.zzav = l8;
    }

    private final void L(Y1 y12) {
        y12.getClass();
        this.G1();
        this.zzh.add((Object)y12);
    }

    private final void N0(String string2) {
        string2.getClass();
        this.zze |= 4096;
        this.zzu = string2;
    }

    private final void O0(boolean bl) {
        this.zzf |= 262144;
        this.zzbj = bl;
    }

    private final void T1(boolean bl) {
        this.zze |= 8388608;
        this.zzaf = bl;
    }

    private final void Z(h2 h22) {
        h22.getClass();
        this.H1();
        this.zzi.add((Object)h22);
    }

    private final void a0(Iterable iterable) {
        h4 h42 = this.zzag;
        if (!h42.c()) {
            this.zzag = Y3.n(h42);
        }
        j3.e(iterable, this.zzag);
    }

    private final void b0(String string2) {
        string2.getClass();
        this.zzf |= 4;
        this.zzar = string2;
    }

    private final void c0(boolean bl) {
        this.zzf |= 65536;
        this.zzbh = bl;
    }

    private final void s1(boolean bl) {
        this.zze |= 131072;
        this.zzz = bl;
    }

    public final boolean A0() {
        if ((this.zze & 1048576) != 0) {
            return true;
        }
        return false;
    }

    public final void A1() {
        this.zze &= -129;
        this.zzp = d2.zzc.zzp;
    }

    public final boolean B0() {
        if ((this.zze & 536870912) != 0) {
            return true;
        }
        return false;
    }

    public final void B1() {
        this.zze &= -33;
        this.zzn = 0L;
    }

    public final void B2(String string2) {
        string2.getClass();
        this.zzf |= 524288;
        this.zzbk = string2;
    }

    public final boolean C0() {
        if ((this.zzf & 131072) != 0) {
            return true;
        }
        return false;
    }

    public final void C1() {
        this.zze &= -17;
        this.zzm = 0L;
    }

    public final long C2() {
        return this.zzam;
    }

    public final String C3() {
        return this.zzar;
    }

    public final int D0() {
        return this.zzai;
    }

    public final void D1() {
        this.zze &= -65537;
        this.zzy = d2.zzc.zzy;
    }

    public final void D2(int n8) {
        this.zze |= 1;
        this.zzg = 1;
    }

    public final String D3() {
        return this.zzu;
    }

    public final h2 E0(int n8) {
        return (h2)this.zzi.get(n8);
    }

    public final void E1() {
        this.zzf &= -8193;
        this.zzbd = d2.zzc.zzbd;
    }

    public final void E2(long l8) {
        this.zze |= 4;
        this.zzk = l8;
    }

    public final String E3() {
        return this.zzaa;
    }

    public final void F1() {
        this.zze &= -268435457;
        this.zzal = d2.zzc.zzal;
    }

    public final String F3() {
        return this.zzt;
    }

    public final Y1 G(int n8) {
        return (Y1)this.zzh.get(n8);
    }

    public final void G1() {
        h4 h42 = this.zzh;
        if (!h42.c()) {
            this.zzh = Y3.n(h42);
        }
    }

    public final void H(int n8, Y1 y12) {
        y12.getClass();
        this.G1();
        this.zzh.set(n8, (Object)y12);
    }

    public final void H1() {
        h4 h42 = this.zzi;
        if (!h42.c()) {
            this.zzi = Y3.n(h42);
        }
    }

    public final void I(int n8, h2 h22) {
        h22.getClass();
        this.H1();
        this.zzi.set(n8, (Object)h22);
    }

    public final int I1() {
        return this.zzh.size();
    }

    public final void I2(String string2) {
        string2.getClass();
        this.zze |= 256;
        this.zzq = string2;
    }

    public final void J1(int n8) {
        this.G1();
        this.zzh.remove(n8);
    }

    public final long J2() {
        return this.zzab;
    }

    public final void K(V1 v12) {
        v12.getClass();
        this.zzbn = v12;
        this.zzf |= 4194304;
    }

    public final void K1(long l8) {
        this.zzf |= 16;
        this.zzau = l8;
    }

    public final void K2(int n8) {
        this.zzf |= 2;
        this.zzaq = n8;
    }

    public final void L2(long l8) {
        this.zzf |= 32768;
        this.zzbg = l8;
    }

    public final void M0(Iterable iterable) {
        this.G1();
        j3.e(iterable, this.zzh);
    }

    public final boolean P0() {
        if ((this.zzf & 128) != 0) {
            return true;
        }
        return false;
    }

    public final void P2(String string2) {
        string2.getClass();
        this.zze |= Integer.MIN_VALUE;
        this.zzao = string2;
    }

    public final boolean Q0() {
        if ((this.zzf & 524288) != 0) {
            return true;
        }
        return false;
    }

    public final long Q2() {
        return this.zzau;
    }

    public final boolean R0() {
        if ((this.zze & 524288) != 0) {
            return true;
        }
        return false;
    }

    public final void R1(Iterable iterable) {
        h4 h42 = this.zzbe;
        if (!h42.c()) {
            this.zzbe = Y3.n(h42);
        }
        j3.e(iterable, this.zzbe);
    }

    public final void R2(int n8) {
        this.zze |= 1024;
        this.zzs = n8;
    }

    public final boolean S0() {
        if ((this.zzf & 16) != 0) {
            return true;
        }
        return false;
    }

    public final void S1(String string2) {
        string2.getClass();
        this.zze |= 2048;
        this.zzt = string2;
    }

    public final void S2(long l8) {
        this.zze |= 2;
        this.zzj = l8;
    }

    public final boolean T0() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean U0() {
        if ((this.zze & 16384) != 0) {
            return true;
        }
        return false;
    }

    public final int U1() {
        return this.zzg;
    }

    public final boolean V0() {
        if ((this.zzf & 262144) != 0) {
            return true;
        }
        return false;
    }

    public final void V1(int n8) {
        this.H1();
        this.zzi.remove(n8);
    }

    public final boolean W0() {
        if ((this.zze & 131072) != 0) {
            return true;
        }
        return false;
    }

    public final void W1(long l8) {
        this.zze |= 8;
        this.zzl = l8;
    }

    public final void W2(String string2) {
        string2.getClass();
        this.zzf |= 16384;
        this.zzbf = string2;
    }

    public final boolean X0() {
        if ((this.zze & 32) != 0) {
            return true;
        }
        return false;
    }

    public final long X2() {
        return this.zzl;
    }

    public final void Y(e2 e22) {
        e22.getClass();
        this.zzas = e22;
        this.zzf |= 8;
    }

    public final boolean Y0() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final void Y2(long l8) {
        this.zze |= 32768;
        this.zzx = l8;
    }

    public final boolean Z0() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean a1() {
        if ((this.zzf & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean b1() {
        if ((this.zze & 8388608) != 0) {
            return true;
        }
        return false;
    }

    public final boolean c1() {
        if ((this.zzf & 8192) != 0) {
            return true;
        }
        return false;
    }

    public final void c2(Iterable iterable) {
        this.H1();
        j3.e(iterable, this.zzi);
    }

    public final void c3(String string2) {
        string2.getClass();
        this.zze |= 16777216;
        this.zzah = string2;
    }

    public final String d0() {
        return this.zzv;
    }

    public final boolean d1() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final void d2(String string2) {
        string2.getClass();
        this.zze |= 8192;
        this.zzv = string2;
    }

    public final long d3() {
        return this.zzw;
    }

    public final String e0() {
        return this.zzbi;
    }

    public final boolean e1() {
        if ((this.zzf & 32768) != 0) {
            return true;
        }
        return false;
    }

    public final int e2() {
        return this.zzaq;
    }

    public final String f0() {
        return this.zzax;
    }

    public final boolean f1() {
        if ((this.zze & 1024) != 0) {
            return true;
        }
        return false;
    }

    public final void f2(int n8) {
        this.zzf |= 1048576;
        this.zzbl = n8;
    }

    public final String g0() {
        return this.zzbk;
    }

    public final boolean g1() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void g2(long l8) {
        this.zze |= 16384;
        this.zzw = l8;
    }

    public final void g3(String string2) {
        string2.getClass();
        this.zze |= 4194304;
        this.zzae = string2;
    }

    public final String h0() {
        return this.zzq;
    }

    public final boolean h1() {
        if ((this.zze & 32768) != 0) {
            return true;
        }
        return false;
    }

    public final long h3() {
        return this.zzn;
    }

    public final String i0() {
        return this.zzao;
    }

    public final int i1() {
        return this.zzac;
    }

    public final String j0() {
        return this.zzah;
    }

    public final void j1(long l8) {
        this.zze |= 524288;
        this.zzab = l8;
    }

    public final void j3(String string2) {
        string2.getClass();
        this.zze |= 2097152;
        this.zzad = string2;
    }

    public final int k() {
        return this.zzbl;
    }

    public final String k0() {
        return this.zzae;
    }

    public final long k3() {
        return this.zzm;
    }

    public final String l0() {
        return this.zzad;
    }

    public final void l2(String string2) {
        string2.getClass();
        this.zzf |= 131072;
        this.zzbi = string2;
    }

    public final String m0() {
        return this.zzp;
    }

    public final int m2() {
        return this.zzs;
    }

    public final void m3(String string2) {
        string2.getClass();
        this.zze |= 128;
        this.zzp = string2;
    }

    public final String n0() {
        return this.zzo;
    }

    public final void n2(int n8) {
        this.zze |= 33554432;
        this.zzai = n8;
    }

    public final long n3() {
        return this.zzk;
    }

    public final String o0() {
        return this.zzy;
    }

    public final void o2(long l8) {
        this.zze |= 32;
        this.zzn = l8;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final Object p(int var1_1, Object var2_2, Object var3_4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.CannotPerformDecode: reachable test BLOCK was exited and re-entered.
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.getFarthestReachableInRange(Misc.java:143)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:385)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:65)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:423)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public final String p0() {
        return this.zzbd;
    }

    public final void p3(String string2) {
        string2.getClass();
        this.zze |= 64;
        this.zzo = string2;
    }

    public final String q0() {
        return this.zzr;
    }

    public final void q1(Iterable iterable) {
        f4 f42 = this.zzat;
        if (!f42.c()) {
            int n8 = f42.size();
            n8 = n8 == 0 ? 10 : (n8 <<= 1);
            this.zzat = f42.r(n8);
        }
        j3.e(iterable, this.zzat);
    }

    public final long q3() {
        return this.zzbg;
    }

    public final List r0() {
        return this.zzag;
    }

    public final void r1(String string2) {
        string2.getClass();
        this.zze |= 262144;
        this.zzaa = string2;
    }

    public final List s0() {
        return this.zzh;
    }

    public final void s3(String string2) {
        string2.getClass();
        this.zze |= 65536;
        this.zzy = string2;
    }

    public final List t0() {
        return this.zzi;
    }

    public final void t1() {
        this.zze &= -262145;
        this.zzaa = d2.zzc.zzaa;
    }

    public final void t2(String string2) {
        string2.getClass();
        this.zzf |= 128;
        this.zzax = string2;
    }

    public final long t3() {
        return this.zzj;
    }

    public final boolean u0() {
        return this.zzbh;
    }

    public final void u1() {
        this.zzag = Y3.B();
    }

    public final int u2() {
        return this.zzi.size();
    }

    public final boolean v0() {
        return this.zzbj;
    }

    public final void v1() {
        this.zze &= -257;
        this.zzq = d2.zzc.zzq;
    }

    public final void v2(int n8) {
        this.zze |= 1048576;
        this.zzac = n8;
    }

    public final void v3(String string2) {
        string2.getClass();
        this.zzf |= 8192;
        this.zzbd = string2;
    }

    public final boolean w0() {
        return this.zzz;
    }

    public final void w1() {
        this.zze &= Integer.MAX_VALUE;
        this.zzao = d2.zzc.zzao;
    }

    public final void w2(long l8) {
        this.zze |= 16;
        this.zzm = l8;
    }

    public final long w3() {
        return this.zzx;
    }

    public final boolean x0() {
        return this.zzaf;
    }

    public final void x1() {
        this.zzh = Y3.B();
    }

    public final boolean y0() {
        if ((this.zze & 33554432) != 0) {
            return true;
        }
        return false;
    }

    public final void y1() {
        this.zze &= -2097153;
        this.zzad = d2.zzc.zzad;
    }

    public final void y3(String string2) {
        string2.getClass();
        this.zze |= 512;
        this.zzr = string2;
    }

    public final boolean z0() {
        if ((this.zzf & 4194304) != 0) {
            return true;
        }
        return false;
    }

    public final void z1() {
        this.zze &= -131073;
        this.zzz = false;
    }

    public final V1 z3() {
        V1 v12;
        V1 v13 = v12 = this.zzbn;
        if (v12 == null) {
            v13 = V1.M();
        }
        return v13;
    }

    public static final class a
    extends Y3.b
    implements K4 {
        public a() {
            super(zzc);
        }

        public /* synthetic */ a(T1 t12) {
            this();
        }

        public final a A(int n8, h2 h22) {
            this.s();
            ((d2)this.p).I(n8, h22);
            return this;
        }

        public final h2 A0(int n8) {
            return ((d2)this.p).E0(n8);
        }

        public final a B(long l8) {
            this.s();
            ((d2)this.p).J(l8);
            return this;
        }

        public final a B0() {
            this.s();
            ((d2)this.p).z1();
            return this;
        }

        public final a C(V1 v12) {
            this.s();
            ((d2)this.p).K(v12);
            return this;
        }

        public final a C0(long l8) {
            this.s();
            ((d2)this.p).S2(l8);
            return this;
        }

        public final a D(Y1.a a8) {
            this.s();
            ((d2)this.p).L((Y1)((Y3)a8.p()));
            return this;
        }

        public final a D0(String string2) {
            this.s();
            ((d2)this.p).W2(string2);
            return this;
        }

        public final a E(e2.b b8) {
            this.s();
            ((d2)this.p).Y((e2)((Y3)b8.p()));
            return this;
        }

        public final a E0() {
            this.s();
            ((d2)this.p).A1();
            return this;
        }

        public final a F(h2.a a8) {
            this.s();
            ((d2)this.p).Z((h2)((Y3)a8.p()));
            return this;
        }

        public final a F0(long l8) {
            this.s();
            ((d2)this.p).Y2(l8);
            return this;
        }

        public final a G(h2 h22) {
            this.s();
            ((d2)this.p).Z(h22);
            return this;
        }

        public final a G0(String string2) {
            this.s();
            ((d2)this.p).c3(string2);
            return this;
        }

        public final a H(Iterable iterable) {
            this.s();
            ((d2)this.p).a0(iterable);
            return this;
        }

        public final a H0() {
            this.s();
            ((d2)this.p).B1();
            return this;
        }

        public final a I(String string2) {
            this.s();
            ((d2)this.p).b0(string2);
            return this;
        }

        public final a I0(String string2) {
            this.s();
            ((d2)this.p).g3(string2);
            return this;
        }

        public final a J(boolean bl) {
            this.s();
            ((d2)this.p).c0(bl);
            return this;
        }

        public final a J0() {
            this.s();
            ((d2)this.p).C1();
            return this;
        }

        public final int K() {
            return ((d2)this.p).u2();
        }

        public final a K0(String string2) {
            this.s();
            ((d2)this.p).j3(string2);
            return this;
        }

        public final a L(int n8) {
            this.s();
            ((d2)this.p).J1(n8);
            return this;
        }

        public final a L0() {
            this.s();
            ((d2)this.p).D1();
            return this;
        }

        public final a M(long l8) {
            this.s();
            ((d2)this.p).F0(l8);
            return this;
        }

        public final a M0(String string2) {
            this.s();
            ((d2)this.p).m3(string2);
            return this;
        }

        public final a N(Iterable iterable) {
            this.s();
            ((d2)this.p).M0(iterable);
            return this;
        }

        public final a N0() {
            this.s();
            ((d2)this.p).E1();
            return this;
        }

        public final a O(String string2) {
            this.s();
            ((d2)this.p).N0(string2);
            return this;
        }

        public final a O0(String string2) {
            this.s();
            ((d2)this.p).p3(string2);
            return this;
        }

        public final a P(boolean bl) {
            this.s();
            ((d2)this.p).O0(bl);
            return this;
        }

        public final a P0() {
            this.s();
            ((d2)this.p).F1();
            return this;
        }

        public final long Q() {
            return ((d2)this.p).X2();
        }

        public final a Q0(String string2) {
            this.s();
            ((d2)this.p).s3(string2);
            return this;
        }

        public final a R(int n8) {
            this.s();
            ((d2)this.p).V1(n8);
            return this;
        }

        public final a R0(String string2) {
            this.s();
            ((d2)this.p).v3(string2);
            return this;
        }

        public final a S(long l8) {
            this.s();
            ((d2)this.p).j1(l8);
            return this;
        }

        public final String S0() {
            return ((d2)this.p).D3();
        }

        public final a T(Iterable iterable) {
            this.s();
            ((d2)this.p).q1(iterable);
            return this;
        }

        public final a T0(String string2) {
            this.s();
            ((d2)this.p).y3(string2);
            return this;
        }

        public final a U(String string2) {
            this.s();
            ((d2)this.p).r1(string2);
            return this;
        }

        public final String U0() {
            return ((d2)this.p).e0();
        }

        public final a V(boolean bl) {
            this.s();
            ((d2)this.p).s1(bl);
            return this;
        }

        public final String V0() {
            return ((d2)this.p).k0();
        }

        public final long W() {
            return ((d2)this.p).n3();
        }

        public final String W0() {
            return ((d2)this.p).m0();
        }

        public final a X(int n8) {
            this.s();
            ((d2)this.p).f2(n8);
            return this;
        }

        public final String X0() {
            return ((d2)this.p).o0();
        }

        public final a Y(long l8) {
            this.s();
            ((d2)this.p).K1(l8);
            return this;
        }

        public final List Y0() {
            return Collections.unmodifiableList((List)((d2)this.p).s0());
        }

        public final a Z(Iterable iterable) {
            this.s();
            ((d2)this.p).R1(iterable);
            return this;
        }

        public final List Z0() {
            return Collections.unmodifiableList((List)((d2)this.p).t0());
        }

        public final a a0(String string2) {
            this.s();
            ((d2)this.p).S1(string2);
            return this;
        }

        public final a b0(boolean bl) {
            this.s();
            ((d2)this.p).T1(bl);
            return this;
        }

        public final a c0() {
            this.s();
            ((d2)this.p).t1();
            return this;
        }

        public final a d0(int n8) {
            this.s();
            ((d2)this.p).n2(n8);
            return this;
        }

        public final a e0(long l8) {
            this.s();
            ((d2)this.p).W1(l8);
            return this;
        }

        public final a f0(Iterable iterable) {
            this.s();
            ((d2)this.p).c2(iterable);
            return this;
        }

        public final a g0(String string2) {
            this.s();
            ((d2)this.p).d2(string2);
            return this;
        }

        public final a h0() {
            this.s();
            ((d2)this.p).u1();
            return this;
        }

        public final a i0(int n8) {
            this.s();
            ((d2)this.p).v2(n8);
            return this;
        }

        public final a j0(long l8) {
            this.s();
            ((d2)this.p).g2(l8);
            return this;
        }

        public final a k0(String string2) {
            this.s();
            ((d2)this.p).l2(string2);
            return this;
        }

        public final a l0() {
            this.s();
            ((d2)this.p).v1();
            return this;
        }

        public final a m0(int n8) {
            this.s();
            ((d2)this.p).D2(1);
            return this;
        }

        public final a n0(long l8) {
            this.s();
            ((d2)this.p).o2(l8);
            return this;
        }

        public final a o0(String string2) {
            this.s();
            ((d2)this.p).t2(string2);
            return this;
        }

        public final a p0() {
            this.s();
            ((d2)this.p).w1();
            return this;
        }

        public final a q0(int n8) {
            this.s();
            ((d2)this.p).K2(n8);
            return this;
        }

        public final a r0(long l8) {
            this.s();
            ((d2)this.p).w2(l8);
            return this;
        }

        public final a s0(String string2) {
            this.s();
            ((d2)this.p).B2(string2);
            return this;
        }

        public final a t0() {
            this.s();
            ((d2)this.p).x1();
            return this;
        }

        public final a u0(int n8) {
            this.s();
            ((d2)this.p).R2(n8);
            return this;
        }

        public final a v0(long l8) {
            this.s();
            ((d2)this.p).E2(l8);
            return this;
        }

        public final int w() {
            return ((d2)this.p).I1();
        }

        public final a w0(String string2) {
            this.s();
            ((d2)this.p).I2(string2);
            return this;
        }

        public final Y1 x(int n8) {
            return ((d2)this.p).G(n8);
        }

        public final a x0() {
            this.s();
            ((d2)this.p).y1();
            return this;
        }

        public final a y(int n8, Y1.a a8) {
            this.s();
            ((d2)this.p).H(n8, (Y1)((Y3)a8.p()));
            return this;
        }

        public final a y0(long l8) {
            this.s();
            ((d2)this.p).L2(l8);
            return this;
        }

        public final a z(int n8, Y1 y12) {
            this.s();
            ((d2)this.p).H(n8, y12);
            return this;
        }

        public final a z0(String string2) {
            this.s();
            ((d2)this.p).P2(null);
            return this;
        }
    }

}

