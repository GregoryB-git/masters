// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class d2 extends Y3 implements K4
{
    private static final d2 zzc;
    private static volatile T4 zzd;
    private String zzaa;
    private long zzab;
    private int zzac;
    private String zzad;
    private String zzae;
    private boolean zzaf;
    private h4 zzag;
    private String zzah;
    private int zzai;
    private int zzaj;
    private int zzak;
    private String zzal;
    private long zzam;
    private long zzan;
    private String zzao;
    private String zzap;
    private int zzaq;
    private String zzar;
    private e2 zzas;
    private f4 zzat;
    private long zzau;
    private long zzav;
    private String zzaw;
    private String zzax;
    private int zzay;
    private boolean zzaz;
    private String zzba;
    private boolean zzbb;
    private b2 zzbc;
    private String zzbd;
    private h4 zzbe;
    private String zzbf;
    private long zzbg;
    private boolean zzbh;
    private String zzbi;
    private boolean zzbj;
    private String zzbk;
    private int zzbl;
    private String zzbm;
    private V1 zzbn;
    private int zze;
    private int zzf;
    private int zzg;
    private h4 zzh;
    private h4 zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private int zzs;
    private String zzt;
    private String zzu;
    private String zzv;
    private long zzw;
    private long zzx;
    private String zzy;
    private boolean zzz;
    
    static {
        Y3.t(d2.class, zzc = new d2());
    }
    
    public d2() {
        this.zzh = Y3.B();
        this.zzi = Y3.B();
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zzr = "";
        this.zzt = "";
        this.zzu = "";
        this.zzv = "";
        this.zzy = "";
        this.zzaa = "";
        this.zzad = "";
        this.zzae = "";
        this.zzag = Y3.B();
        this.zzah = "";
        this.zzal = "";
        this.zzao = "";
        this.zzap = "";
        this.zzar = "";
        this.zzat = Y3.z();
        this.zzaw = "";
        this.zzax = "";
        this.zzba = "";
        this.zzbd = "";
        this.zzbe = Y3.B();
        this.zzbf = "";
        this.zzbi = "";
        this.zzbk = "";
        this.zzbm = "";
    }
    
    public static a A3() {
        return (a)d2.zzc.w();
    }
    
    public static /* synthetic */ d2 B3() {
        return d2.zzc;
    }
    
    private final void F0(final long zzam) {
        this.zze |= 0x20000000;
        this.zzam = zzam;
    }
    
    public static /* synthetic */ void H0(final d2 d2, final int n) {
        d2.D2(1);
    }
    
    private final void J(final long zzav) {
        this.zzf |= 0x20;
        this.zzav = zzav;
    }
    
    private final void L(final Y1 y1) {
        y1.getClass();
        this.G1();
        this.zzh.add(y1);
    }
    
    private final void N0(final String zzu) {
        zzu.getClass();
        this.zze |= 0x1000;
        this.zzu = zzu;
    }
    
    private final void O0(final boolean zzbj) {
        this.zzf |= 0x40000;
        this.zzbj = zzbj;
    }
    
    private final void T1(final boolean zzaf) {
        this.zze |= 0x800000;
        this.zzaf = zzaf;
    }
    
    public static /* synthetic */ void W(final d2 d2, final String s) {
        d2.P2(null);
    }
    
    private final void Z(final h2 h2) {
        h2.getClass();
        this.H1();
        this.zzi.add(h2);
    }
    
    private final void a0(final Iterable iterable) {
        final h4 zzag = this.zzag;
        if (!zzag.c()) {
            this.zzag = Y3.n(zzag);
        }
        j3.e(iterable, this.zzag);
    }
    
    private final void b0(final String zzar) {
        zzar.getClass();
        this.zzf |= 0x4;
        this.zzar = zzar;
    }
    
    private final void c0(final boolean zzbh) {
        this.zzf |= 0x10000;
        this.zzbh = zzbh;
    }
    
    private final void s1(final boolean zzz) {
        this.zze |= 0x20000;
        this.zzz = zzz;
    }
    
    public final boolean A0() {
        return (this.zze & 0x100000) != 0x0;
    }
    
    public final void A1() {
        this.zze &= 0xFFFFFF7F;
        this.zzp = d2.zzc.zzp;
    }
    
    public final boolean B0() {
        return (this.zze & 0x20000000) != 0x0;
    }
    
    public final void B1() {
        this.zze &= 0xFFFFFFDF;
        this.zzn = 0L;
    }
    
    public final void B2(final String zzbk) {
        zzbk.getClass();
        this.zzf |= 0x80000;
        this.zzbk = zzbk;
    }
    
    public final boolean C0() {
        return (this.zzf & 0x20000) != 0x0;
    }
    
    public final void C1() {
        this.zze &= 0xFFFFFFEF;
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
        this.zze &= 0xFFFEFFFF;
        this.zzy = d2.zzc.zzy;
    }
    
    public final void D2(final int n) {
        this.zze |= 0x1;
        this.zzg = 1;
    }
    
    public final String D3() {
        return this.zzu;
    }
    
    public final h2 E0(final int n) {
        return this.zzi.get(n);
    }
    
    public final void E1() {
        this.zzf &= 0xFFFFDFFF;
        this.zzbd = d2.zzc.zzbd;
    }
    
    public final void E2(final long zzk) {
        this.zze |= 0x4;
        this.zzk = zzk;
    }
    
    public final String E3() {
        return this.zzaa;
    }
    
    public final void F1() {
        this.zze &= 0xEFFFFFFF;
        this.zzal = d2.zzc.zzal;
    }
    
    public final String F3() {
        return this.zzt;
    }
    
    public final Y1 G(final int n) {
        return this.zzh.get(n);
    }
    
    public final void G1() {
        final h4 zzh = this.zzh;
        if (!zzh.c()) {
            this.zzh = Y3.n(zzh);
        }
    }
    
    public final void H(final int n, final Y1 y1) {
        y1.getClass();
        this.G1();
        this.zzh.set(n, y1);
    }
    
    public final void H1() {
        final h4 zzi = this.zzi;
        if (!zzi.c()) {
            this.zzi = Y3.n(zzi);
        }
    }
    
    public final void I(final int n, final h2 h2) {
        h2.getClass();
        this.H1();
        this.zzi.set(n, h2);
    }
    
    public final int I1() {
        return this.zzh.size();
    }
    
    public final void I2(final String zzq) {
        zzq.getClass();
        this.zze |= 0x100;
        this.zzq = zzq;
    }
    
    public final void J1(final int n) {
        this.G1();
        this.zzh.remove(n);
    }
    
    public final long J2() {
        return this.zzab;
    }
    
    public final void K(final V1 zzbn) {
        zzbn.getClass();
        this.zzbn = zzbn;
        this.zzf |= 0x400000;
    }
    
    public final void K1(final long zzau) {
        this.zzf |= 0x10;
        this.zzau = zzau;
    }
    
    public final void K2(final int zzaq) {
        this.zzf |= 0x2;
        this.zzaq = zzaq;
    }
    
    public final void L2(final long zzbg) {
        this.zzf |= 0x8000;
        this.zzbg = zzbg;
    }
    
    public final void M0(final Iterable iterable) {
        this.G1();
        j3.e(iterable, this.zzh);
    }
    
    public final boolean P0() {
        return (this.zzf & 0x80) != 0x0;
    }
    
    public final void P2(final String zzao) {
        zzao.getClass();
        this.zze |= Integer.MIN_VALUE;
        this.zzao = zzao;
    }
    
    public final boolean Q0() {
        return (this.zzf & 0x80000) != 0x0;
    }
    
    public final long Q2() {
        return this.zzau;
    }
    
    public final boolean R0() {
        return (this.zze & 0x80000) != 0x0;
    }
    
    public final void R1(final Iterable iterable) {
        final h4 zzbe = this.zzbe;
        if (!zzbe.c()) {
            this.zzbe = Y3.n(zzbe);
        }
        j3.e(iterable, this.zzbe);
    }
    
    public final void R2(final int zzs) {
        this.zze |= 0x400;
        this.zzs = zzs;
    }
    
    public final boolean S0() {
        return (this.zzf & 0x10) != 0x0;
    }
    
    public final void S1(final String zzt) {
        zzt.getClass();
        this.zze |= 0x800;
        this.zzt = zzt;
    }
    
    public final void S2(final long zzj) {
        this.zze |= 0x2;
        this.zzj = zzj;
    }
    
    public final boolean T0() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean U0() {
        return (this.zze & 0x4000) != 0x0;
    }
    
    public final int U1() {
        return this.zzg;
    }
    
    public final boolean V0() {
        return (this.zzf & 0x40000) != 0x0;
    }
    
    public final void V1(final int n) {
        this.H1();
        this.zzi.remove(n);
    }
    
    public final boolean W0() {
        return (this.zze & 0x20000) != 0x0;
    }
    
    public final void W1(final long zzl) {
        this.zze |= 0x8;
        this.zzl = zzl;
    }
    
    public final void W2(final String zzbf) {
        zzbf.getClass();
        this.zzf |= 0x4000;
        this.zzbf = zzbf;
    }
    
    public final boolean X0() {
        return (this.zze & 0x20) != 0x0;
    }
    
    public final long X2() {
        return this.zzl;
    }
    
    public final void Y(final e2 zzas) {
        zzas.getClass();
        this.zzas = zzas;
        this.zzf |= 0x8;
    }
    
    public final boolean Y0() {
        return (this.zze & 0x10) != 0x0;
    }
    
    public final void Y2(final long zzx) {
        this.zze |= 0x8000;
        this.zzx = zzx;
    }
    
    public final boolean Z0() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final boolean a1() {
        return (this.zzf & 0x2) != 0x0;
    }
    
    public final boolean b1() {
        return (this.zze & 0x800000) != 0x0;
    }
    
    public final boolean c1() {
        return (this.zzf & 0x2000) != 0x0;
    }
    
    public final void c2(final Iterable iterable) {
        this.H1();
        j3.e(iterable, this.zzi);
    }
    
    public final void c3(final String zzah) {
        zzah.getClass();
        this.zze |= 0x1000000;
        this.zzah = zzah;
    }
    
    public final String d0() {
        return this.zzv;
    }
    
    public final boolean d1() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final void d2(final String zzv) {
        zzv.getClass();
        this.zze |= 0x2000;
        this.zzv = zzv;
    }
    
    public final long d3() {
        return this.zzw;
    }
    
    public final String e0() {
        return this.zzbi;
    }
    
    public final boolean e1() {
        return (this.zzf & 0x8000) != 0x0;
    }
    
    public final int e2() {
        return this.zzaq;
    }
    
    public final String f0() {
        return this.zzax;
    }
    
    public final boolean f1() {
        return (this.zze & 0x400) != 0x0;
    }
    
    public final void f2(final int zzbl) {
        this.zzf |= 0x100000;
        this.zzbl = zzbl;
    }
    
    public final String g0() {
        return this.zzbk;
    }
    
    public final boolean g1() {
        return (this.zze & 0x2) != 0x0;
    }
    
    public final void g2(final long zzw) {
        this.zze |= 0x4000;
        this.zzw = zzw;
    }
    
    public final void g3(final String zzae) {
        zzae.getClass();
        this.zze |= 0x400000;
        this.zzae = zzae;
    }
    
    public final String h0() {
        return this.zzq;
    }
    
    public final boolean h1() {
        return (this.zze & 0x8000) != 0x0;
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
    
    public final void j1(final long zzab) {
        this.zze |= 0x80000;
        this.zzab = zzab;
    }
    
    public final void j3(final String zzad) {
        zzad.getClass();
        this.zze |= 0x200000;
        this.zzad = zzad;
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
    
    public final void l2(final String zzbi) {
        zzbi.getClass();
        this.zzf |= 0x20000;
        this.zzbi = zzbi;
    }
    
    public final String m0() {
        return this.zzp;
    }
    
    public final int m2() {
        return this.zzs;
    }
    
    public final void m3(final String zzp) {
        zzp.getClass();
        this.zze |= 0x80;
        this.zzp = zzp;
    }
    
    public final String n0() {
        return this.zzo;
    }
    
    public final void n2(final int zzai) {
        this.zze |= 0x2000000;
        this.zzai = zzai;
    }
    
    public final long n3() {
        return this.zzk;
    }
    
    public final String o0() {
        return this.zzy;
    }
    
    public final void o2(final long zzn) {
        this.zze |= 0x20;
        this.zzn = zzn;
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0591: {
            switch (T1.a[n - 1]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return 1;
                }
                case 5: {
                    final T4 zzd = d2.zzd;
                    if (zzd == null) {
                        break Label_0591;
                    }
                    return zzd;
                }
                case 4: {
                    break Label_0591;
                }
                case 3: {
                    break Label_0591;
                }
                case 2: {
                    break Label_0591;
                }
                case 1: {
                    // monitorenter(d2.class)
                    while (true) {
                        Label_0600: {
                            break Label_0600;
                            try {
                                T4 zzd2;
                                if ((zzd2 = d2.zzd) == null) {
                                    zzd2 = (d2.zzd = new Y3.a(d2.zzc));
                                }
                                // monitorexit(d2.class)
                                return zzd2;
                                return Y3.q(d2.zzc, "\u0001<\u0000\u0002\u0001L<\u0000\u0005\u0000\u0001\u1004\u0000\u0002\u001b\u0003\u001b\u0004\u1002\u0001\u0005\u1002\u0002\u0006\u1002\u0003\u0007\u1002\u0005\b\u1008\u0006\t\u1008\u0007\n\u1008\b\u000b\u1008\t\f\u1004\n\r\u1008\u000b\u000e\u1008\f\u0010\u1008\r\u0011\u1002\u000e\u0012\u1002\u000f\u0013\u1008\u0010\u0014\u1007\u0011\u0015\u1008\u0012\u0016\u1002\u0013\u0017\u1004\u0014\u0018\u1008\u0015\u0019\u1008\u0016\u001a\u1002\u0004\u001c\u1007\u0017\u001d\u001b\u001e\u1008\u0018\u001f\u1004\u0019 \u1004\u001a!\u1004\u001b\"\u1008\u001c#\u1002\u001d$\u1002\u001e%\u1008\u001f&\u1008 '\u1004!)\u1008\",\u1009#-\u001d.\u1002$/\u1002%2\u1008&4\u1008'5\u180c(7\u1007)9\u1008*:\u1007+;\u1009,?\u1008-@\u001aA\u1008.C\u1002/D\u10070G\u10081H\u10072I\u10083J\u10044K\u10085L\u10096", new Object[] { "zze", "zzf", "zzg", "zzh", Y1.class, "zzi", h2.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzm", "zzaf", "zzag", W1.class, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax", "zzay", j2.e(), "zzaz", "zzba", "zzbb", "zzbc", "zzbd", "zzbe", "zzbf", "zzbg", "zzbh", "zzbi", "zzbj", "zzbk", "zzbl", "zzbm", "zzbn" });
                                return d2.zzc;
                                return new a((T1)null);
                                // monitorexit(d2.class)
                                return new d2();
                            }
                            finally {}
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    public final String p0() {
        return this.zzbd;
    }
    
    public final void p3(final String zzo) {
        zzo.getClass();
        this.zze |= 0x40;
        this.zzo = zzo;
    }
    
    public final String q0() {
        return this.zzr;
    }
    
    public final void q1(final Iterable iterable) {
        final f4 zzat = this.zzat;
        if (!zzat.c()) {
            final int size = zzat.size();
            int n;
            if (size == 0) {
                n = 10;
            }
            else {
                n = size << 1;
            }
            this.zzat = zzat.r(n);
        }
        j3.e(iterable, this.zzat);
    }
    
    public final long q3() {
        return this.zzbg;
    }
    
    public final List r0() {
        return this.zzag;
    }
    
    public final void r1(final String zzaa) {
        zzaa.getClass();
        this.zze |= 0x40000;
        this.zzaa = zzaa;
    }
    
    public final List s0() {
        return this.zzh;
    }
    
    public final void s3(final String zzy) {
        zzy.getClass();
        this.zze |= 0x10000;
        this.zzy = zzy;
    }
    
    public final List t0() {
        return this.zzi;
    }
    
    public final void t1() {
        this.zze &= 0xFFFBFFFF;
        this.zzaa = d2.zzc.zzaa;
    }
    
    public final void t2(final String zzax) {
        zzax.getClass();
        this.zzf |= 0x80;
        this.zzax = zzax;
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
        this.zze &= 0xFFFFFEFF;
        this.zzq = d2.zzc.zzq;
    }
    
    public final void v2(final int zzac) {
        this.zze |= 0x100000;
        this.zzac = zzac;
    }
    
    public final void v3(final String zzbd) {
        zzbd.getClass();
        this.zzf |= 0x2000;
        this.zzbd = zzbd;
    }
    
    public final boolean w0() {
        return this.zzz;
    }
    
    public final void w1() {
        this.zze &= Integer.MAX_VALUE;
        this.zzao = d2.zzc.zzao;
    }
    
    public final void w2(final long zzm) {
        this.zze |= 0x10;
        this.zzm = zzm;
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
        return (this.zze & 0x2000000) != 0x0;
    }
    
    public final void y1() {
        this.zze &= 0xFFDFFFFF;
        this.zzad = d2.zzc.zzad;
    }
    
    public final void y3(final String zzr) {
        zzr.getClass();
        this.zze |= 0x200;
        this.zzr = zzr;
    }
    
    public final boolean z0() {
        return (this.zzf & 0x400000) != 0x0;
    }
    
    public final void z1() {
        this.zze &= 0xFFFDFFFF;
        this.zzz = false;
    }
    
    public final V1 z3() {
        V1 v1;
        if ((v1 = this.zzbn) == null) {
            v1 = V1.M();
        }
        return v1;
    }
    
    public static final class a extends b implements K4
    {
        public a() {
            super(d2.B3());
        }
        
        public final a A(final int n, final h2 h2) {
            ((b)this).s();
            ((d2)super.p).I(n, h2);
            return this;
        }
        
        public final h2 A0(final int n) {
            return ((d2)super.p).E0(n);
        }
        
        public final a B(final long n) {
            ((b)this).s();
            ((d2)super.p).J(n);
            return this;
        }
        
        public final a B0() {
            ((b)this).s();
            ((d2)super.p).z1();
            return this;
        }
        
        public final a C(final V1 v1) {
            ((b)this).s();
            ((d2)super.p).K(v1);
            return this;
        }
        
        public final a C0(final long n) {
            ((b)this).s();
            ((d2)super.p).S2(n);
            return this;
        }
        
        public final a D(final Y1.a a) {
            ((b)this).s();
            ((d2)super.p).L((Y1)((b)a).p());
            return this;
        }
        
        public final a D0(final String s) {
            ((b)this).s();
            ((d2)super.p).W2(s);
            return this;
        }
        
        public final a E(final e2.b b) {
            ((b)this).s();
            ((d2)super.p).Y((e2)((b)b).p());
            return this;
        }
        
        public final a E0() {
            ((b)this).s();
            ((d2)super.p).A1();
            return this;
        }
        
        public final a F(final h2.a a) {
            ((b)this).s();
            ((d2)super.p).Z((h2)((b)a).p());
            return this;
        }
        
        public final a F0(final long n) {
            ((b)this).s();
            ((d2)super.p).Y2(n);
            return this;
        }
        
        public final a G(final h2 h2) {
            ((b)this).s();
            ((d2)super.p).Z(h2);
            return this;
        }
        
        public final a G0(final String s) {
            ((b)this).s();
            ((d2)super.p).c3(s);
            return this;
        }
        
        public final a H(final Iterable iterable) {
            ((b)this).s();
            ((d2)super.p).a0(iterable);
            return this;
        }
        
        public final a H0() {
            ((b)this).s();
            ((d2)super.p).B1();
            return this;
        }
        
        public final a I(final String s) {
            ((b)this).s();
            ((d2)super.p).b0(s);
            return this;
        }
        
        public final a I0(final String s) {
            ((b)this).s();
            ((d2)super.p).g3(s);
            return this;
        }
        
        public final a J(final boolean b) {
            ((b)this).s();
            ((d2)super.p).c0(b);
            return this;
        }
        
        public final a J0() {
            ((b)this).s();
            ((d2)super.p).C1();
            return this;
        }
        
        public final int K() {
            return ((d2)super.p).u2();
        }
        
        public final a K0(final String s) {
            ((b)this).s();
            ((d2)super.p).j3(s);
            return this;
        }
        
        public final a L(final int n) {
            ((b)this).s();
            ((d2)super.p).J1(n);
            return this;
        }
        
        public final a L0() {
            ((b)this).s();
            ((d2)super.p).D1();
            return this;
        }
        
        public final a M(final long n) {
            ((b)this).s();
            ((d2)super.p).F0(n);
            return this;
        }
        
        public final a M0(final String s) {
            ((b)this).s();
            ((d2)super.p).m3(s);
            return this;
        }
        
        public final a N(final Iterable iterable) {
            ((b)this).s();
            ((d2)super.p).M0(iterable);
            return this;
        }
        
        public final a N0() {
            ((b)this).s();
            ((d2)super.p).E1();
            return this;
        }
        
        public final a O(final String s) {
            ((b)this).s();
            ((d2)super.p).N0(s);
            return this;
        }
        
        public final a O0(final String s) {
            ((b)this).s();
            ((d2)super.p).p3(s);
            return this;
        }
        
        public final a P(final boolean b) {
            ((b)this).s();
            ((d2)super.p).O0(b);
            return this;
        }
        
        public final a P0() {
            ((b)this).s();
            ((d2)super.p).F1();
            return this;
        }
        
        public final long Q() {
            return ((d2)super.p).X2();
        }
        
        public final a Q0(final String s) {
            ((b)this).s();
            ((d2)super.p).s3(s);
            return this;
        }
        
        public final a R(final int n) {
            ((b)this).s();
            ((d2)super.p).V1(n);
            return this;
        }
        
        public final a R0(final String s) {
            ((b)this).s();
            ((d2)super.p).v3(s);
            return this;
        }
        
        public final a S(final long n) {
            ((b)this).s();
            ((d2)super.p).j1(n);
            return this;
        }
        
        public final String S0() {
            return ((d2)super.p).D3();
        }
        
        public final a T(final Iterable iterable) {
            ((b)this).s();
            ((d2)super.p).q1(iterable);
            return this;
        }
        
        public final a T0(final String s) {
            ((b)this).s();
            ((d2)super.p).y3(s);
            return this;
        }
        
        public final a U(final String s) {
            ((b)this).s();
            ((d2)super.p).r1(s);
            return this;
        }
        
        public final String U0() {
            return ((d2)super.p).e0();
        }
        
        public final a V(final boolean b) {
            ((b)this).s();
            ((d2)super.p).s1(b);
            return this;
        }
        
        public final String V0() {
            return ((d2)super.p).k0();
        }
        
        public final long W() {
            return ((d2)super.p).n3();
        }
        
        public final String W0() {
            return ((d2)super.p).m0();
        }
        
        public final a X(final int n) {
            ((b)this).s();
            ((d2)super.p).f2(n);
            return this;
        }
        
        public final String X0() {
            return ((d2)super.p).o0();
        }
        
        public final a Y(final long n) {
            ((b)this).s();
            ((d2)super.p).K1(n);
            return this;
        }
        
        public final List Y0() {
            return Collections.unmodifiableList((List<?>)((d2)super.p).s0());
        }
        
        public final a Z(final Iterable iterable) {
            ((b)this).s();
            ((d2)super.p).R1(iterable);
            return this;
        }
        
        public final List Z0() {
            return Collections.unmodifiableList((List<?>)((d2)super.p).t0());
        }
        
        public final a a0(final String s) {
            ((b)this).s();
            ((d2)super.p).S1(s);
            return this;
        }
        
        public final a b0(final boolean b) {
            ((b)this).s();
            ((d2)super.p).T1(b);
            return this;
        }
        
        public final a c0() {
            ((b)this).s();
            ((d2)super.p).t1();
            return this;
        }
        
        public final a d0(final int n) {
            ((b)this).s();
            ((d2)super.p).n2(n);
            return this;
        }
        
        public final a e0(final long n) {
            ((b)this).s();
            ((d2)super.p).W1(n);
            return this;
        }
        
        public final a f0(final Iterable iterable) {
            ((b)this).s();
            ((d2)super.p).c2(iterable);
            return this;
        }
        
        public final a g0(final String s) {
            ((b)this).s();
            ((d2)super.p).d2(s);
            return this;
        }
        
        public final a h0() {
            ((b)this).s();
            ((d2)super.p).u1();
            return this;
        }
        
        public final a i0(final int n) {
            ((b)this).s();
            ((d2)super.p).v2(n);
            return this;
        }
        
        public final a j0(final long n) {
            ((b)this).s();
            ((d2)super.p).g2(n);
            return this;
        }
        
        public final a k0(final String s) {
            ((b)this).s();
            ((d2)super.p).l2(s);
            return this;
        }
        
        public final a l0() {
            ((b)this).s();
            ((d2)super.p).v1();
            return this;
        }
        
        public final a m0(final int n) {
            ((b)this).s();
            d2.H0((d2)super.p, 1);
            return this;
        }
        
        public final a n0(final long n) {
            ((b)this).s();
            ((d2)super.p).o2(n);
            return this;
        }
        
        public final a o0(final String s) {
            ((b)this).s();
            ((d2)super.p).t2(s);
            return this;
        }
        
        public final a p0() {
            ((b)this).s();
            ((d2)super.p).w1();
            return this;
        }
        
        public final a q0(final int n) {
            ((b)this).s();
            ((d2)super.p).K2(n);
            return this;
        }
        
        public final a r0(final long n) {
            ((b)this).s();
            ((d2)super.p).w2(n);
            return this;
        }
        
        public final a s0(final String s) {
            ((b)this).s();
            ((d2)super.p).B2(s);
            return this;
        }
        
        public final a t0() {
            ((b)this).s();
            ((d2)super.p).x1();
            return this;
        }
        
        public final a u0(final int n) {
            ((b)this).s();
            ((d2)super.p).R2(n);
            return this;
        }
        
        public final a v0(final long n) {
            ((b)this).s();
            ((d2)super.p).E2(n);
            return this;
        }
        
        public final int w() {
            return ((d2)super.p).I1();
        }
        
        public final a w0(final String s) {
            ((b)this).s();
            ((d2)super.p).I2(s);
            return this;
        }
        
        public final Y1 x(final int n) {
            return ((d2)super.p).G(n);
        }
        
        public final a x0() {
            ((b)this).s();
            ((d2)super.p).y1();
            return this;
        }
        
        public final a y(final int n, final Y1.a a) {
            ((b)this).s();
            ((d2)super.p).H(n, (Y1)((b)a).p());
            return this;
        }
        
        public final a y0(final long n) {
            ((b)this).s();
            ((d2)super.p).L2(n);
            return this;
        }
        
        public final a z(final int n, final Y1 y1) {
            ((b)this).s();
            ((d2)super.p).H(n, y1);
            return this;
        }
        
        public final a z0(final String s) {
            ((b)this).s();
            d2.W((d2)super.p, null);
            return this;
        }
    }
}
