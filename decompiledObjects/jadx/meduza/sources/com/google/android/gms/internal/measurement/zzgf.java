package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkg;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzgf {

    public static final class zza extends zzkg<zza, C0050zza> implements zzlo {
        private static final zza zzc;
        private static volatile zzlz<zza> zzd;
        private int zze;
        private long zzi;
        private long zzm;
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";
        private String zzj = "";
        private String zzk = "";
        private String zzl = "";

        /* renamed from: com.google.android.gms.internal.measurement.zzgf$zza$zza, reason: collision with other inner class name */
        public static final class C0050zza extends zzkg.zza<zza, C0050zza> implements zzlo {
            private C0050zza() {
                super(zza.zzc);
            }

            public final long zza() {
                return ((zza) this.zza).zza();
            }

            public final C0050zza zza(long j10) {
                zzam();
                zza.zza((zza) this.zza, j10);
                return this;
            }

            public final C0050zza zza(String str) {
                zzam();
                zza.zza((zza) this.zza, str);
                return this;
            }

            public final long zzb() {
                return ((zza) this.zza).zzb();
            }

            public final C0050zza zzb(long j10) {
                zzam();
                zza.zzb((zza) this.zza, j10);
                return this;
            }

            public final C0050zza zzb(String str) {
                zzam();
                zza.zzb((zza) this.zza, str);
                return this;
            }

            public final C0050zza zzc() {
                zzam();
                zza.zza((zza) this.zza);
                return this;
            }

            public final C0050zza zzc(String str) {
                zzam();
                zza.zzc((zza) this.zza, str);
                return this;
            }

            public final C0050zza zzd() {
                zzam();
                zza.zzb((zza) this.zza);
                return this;
            }

            public final C0050zza zzd(String str) {
                zzam();
                zza.zzd((zza) this.zza, str);
                return this;
            }

            public final C0050zza zze() {
                zzam();
                zza.zzc((zza) this.zza);
                return this;
            }

            public final C0050zza zze(String str) {
                zzam();
                zza.zze((zza) this.zza, str);
                return this;
            }

            public final C0050zza zzf() {
                zzam();
                zza.zzd((zza) this.zza);
                return this;
            }

            public final C0050zza zzf(String str) {
                zzam();
                zza.zzf((zza) this.zza, str);
                return this;
            }

            public final C0050zza zzg() {
                zzam();
                zza.zze((zza) this.zza);
                return this;
            }

            public final C0050zza zzh() {
                zzam();
                zza.zzf((zza) this.zza);
                return this;
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzkg.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        public static /* synthetic */ void zza(zza zzaVar) {
            zzaVar.zze &= -5;
            zzaVar.zzh = zzc.zzh;
        }

        public static /* synthetic */ void zza(zza zzaVar, long j10) {
            zzaVar.zze |= 8;
            zzaVar.zzi = j10;
        }

        public static /* synthetic */ void zza(zza zzaVar, String str) {
            str.getClass();
            zzaVar.zze |= 4;
            zzaVar.zzh = str;
        }

        public static /* synthetic */ void zzb(zza zzaVar) {
            zzaVar.zze &= -3;
            zzaVar.zzg = zzc.zzg;
        }

        public static /* synthetic */ void zzb(zza zzaVar, long j10) {
            zzaVar.zze |= 128;
            zzaVar.zzm = j10;
        }

        public static /* synthetic */ void zzb(zza zzaVar, String str) {
            str.getClass();
            zzaVar.zze |= 2;
            zzaVar.zzg = str;
        }

        public static C0050zza zzc() {
            return zzc.zzcg();
        }

        public static /* synthetic */ void zzc(zza zzaVar) {
            zzaVar.zze &= -2;
            zzaVar.zzf = zzc.zzf;
        }

        public static /* synthetic */ void zzc(zza zzaVar, String str) {
            str.getClass();
            zzaVar.zze |= 1;
            zzaVar.zzf = str;
        }

        public static /* synthetic */ void zzd(zza zzaVar) {
            zzaVar.zze &= -65;
            zzaVar.zzl = zzc.zzl;
        }

        public static /* synthetic */ void zzd(zza zzaVar, String str) {
            str.getClass();
            zzaVar.zze |= 64;
            zzaVar.zzl = str;
        }

        public static zza zze() {
            return zzc;
        }

        public static /* synthetic */ void zze(zza zzaVar) {
            zzaVar.zze &= -33;
            zzaVar.zzk = zzc.zzk;
        }

        public static /* synthetic */ void zze(zza zzaVar, String str) {
            str.getClass();
            zzaVar.zze |= 32;
            zzaVar.zzk = str;
        }

        public static /* synthetic */ void zzf(zza zzaVar) {
            zzaVar.zze &= -17;
            zzaVar.zzj = zzc.zzj;
        }

        public static /* synthetic */ void zzf(zza zzaVar, String str) {
            str.getClass();
            zzaVar.zze |= 16;
            zzaVar.zzj = str;
        }

        public final long zza() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.measurement.zzkg
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzgi.zza[i10 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0050zza();
                case 3:
                    return zzkg.zza(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
                case 4:
                    return zzc;
                case 5:
                    zzlz<zza> zzlzVar = zzd;
                    if (zzlzVar == null) {
                        synchronized (zza.class) {
                            zzlzVar = zzd;
                            if (zzlzVar == null) {
                                zzlzVar = new zzkg.zzc<>(zzc);
                                zzd = zzlzVar;
                            }
                        }
                    }
                    return zzlzVar;
                case 6:
                    return (byte) 1;
                default:
                    throw null;
            }
        }

        public final long zzb() {
            return this.zzm;
        }

        public final String zzf() {
            return this.zzh;
        }

        public final String zzg() {
            return this.zzg;
        }

        public final String zzh() {
            return this.zzf;
        }

        public final String zzi() {
            return this.zzl;
        }

        public final String zzj() {
            return this.zzk;
        }

        public final String zzk() {
            return this.zzj;
        }

        public final boolean zzl() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzm() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzn() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzo() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzp() {
            return (this.zze & 128) != 0;
        }

        public final boolean zzq() {
            return (this.zze & 64) != 0;
        }

        public final boolean zzr() {
            return (this.zze & 32) != 0;
        }

        public final boolean zzs() {
            return (this.zze & 16) != 0;
        }
    }

    public static final class zzb extends zzkg<zzb, zza> implements zzlo {
        private static final zzb zzc;
        private static volatile zzlz<zzb> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";
        private String zzi = "";
        private String zzj = "";
        private String zzk = "";
        private String zzl = "";

        public static final class zza extends zzkg.zza<zzb, zza> implements zzlo {
            private zza() {
                super(zzb.zzc);
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzkg.zza((Class<zzb>) zzb.class, zzbVar);
        }

        private zzb() {
        }

        @Override // com.google.android.gms.internal.measurement.zzkg
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzgi.zza[i10 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza();
                case 3:
                    return zzkg.zza(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
                case 4:
                    return zzc;
                case 5:
                    zzlz<zzb> zzlzVar = zzd;
                    if (zzlzVar == null) {
                        synchronized (zzb.class) {
                            zzlzVar = zzd;
                            if (zzlzVar == null) {
                                zzlzVar = new zzkg.zzc<>(zzc);
                                zzd = zzlzVar;
                            }
                        }
                    }
                    return zzlzVar;
                case 6:
                    return (byte) 1;
                default:
                    throw null;
            }
        }
    }

    public static final class zzc extends zzkg<zzc, zza> implements zzlo {
        private static final zzc zzc;
        private static volatile zzlz<zzc> zzd;
        private int zze;
        private boolean zzf;
        private boolean zzg;
        private boolean zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;
        private boolean zzl;

        public static final class zza extends zzkg.zza<zzc, zza> implements zzlo {
            private zza() {
                super(zzc.zzc);
            }

            public final zza zza(boolean z10) {
                zzam();
                zzc.zza((zzc) this.zza, z10);
                return this;
            }

            public final zza zzb(boolean z10) {
                zzam();
                zzc.zzb((zzc) this.zza, z10);
                return this;
            }

            public final zza zzc(boolean z10) {
                zzam();
                zzc.zzc((zzc) this.zza, z10);
                return this;
            }

            public final zza zzd(boolean z10) {
                zzam();
                zzc.zzd((zzc) this.zza, z10);
                return this;
            }

            public final zza zze(boolean z10) {
                zzam();
                zzc.zze((zzc) this.zza, z10);
                return this;
            }

            public final zza zzf(boolean z10) {
                zzam();
                zzc.zzf((zzc) this.zza, z10);
                return this;
            }

            public final zza zzg(boolean z10) {
                zzam();
                zzc.zzg((zzc) this.zza, z10);
                return this;
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzc = zzcVar;
            zzkg.zza((Class<zzc>) zzc.class, zzcVar);
        }

        private zzc() {
        }

        public static zza zza() {
            return zzc.zzcg();
        }

        public static /* synthetic */ void zza(zzc zzcVar, boolean z10) {
            zzcVar.zze |= 32;
            zzcVar.zzk = z10;
        }

        public static /* synthetic */ void zzb(zzc zzcVar, boolean z10) {
            zzcVar.zze |= 16;
            zzcVar.zzj = z10;
        }

        public static zzc zzc() {
            return zzc;
        }

        public static /* synthetic */ void zzc(zzc zzcVar, boolean z10) {
            zzcVar.zze |= 1;
            zzcVar.zzf = z10;
        }

        public static /* synthetic */ void zzd(zzc zzcVar, boolean z10) {
            zzcVar.zze |= 64;
            zzcVar.zzl = z10;
        }

        public static /* synthetic */ void zze(zzc zzcVar, boolean z10) {
            zzcVar.zze |= 2;
            zzcVar.zzg = z10;
        }

        public static /* synthetic */ void zzf(zzc zzcVar, boolean z10) {
            zzcVar.zze |= 4;
            zzcVar.zzh = z10;
        }

        public static /* synthetic */ void zzg(zzc zzcVar, boolean z10) {
            zzcVar.zze |= 8;
            zzcVar.zzi = z10;
        }

        @Override // com.google.android.gms.internal.measurement.zzkg
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzgi.zza[i10 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza();
                case 3:
                    return zzkg.zza(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
                case 4:
                    return zzc;
                case 5:
                    zzlz<zzc> zzlzVar = zzd;
                    if (zzlzVar == null) {
                        synchronized (zzc.class) {
                            zzlzVar = zzd;
                            if (zzlzVar == null) {
                                zzlzVar = new zzkg.zzc<>(zzc);
                                zzd = zzlzVar;
                            }
                        }
                    }
                    return zzlzVar;
                case 6:
                    return (byte) 1;
                default:
                    throw null;
            }
        }

        public final boolean zzd() {
            return this.zzk;
        }

        public final boolean zze() {
            return this.zzj;
        }

        public final boolean zzf() {
            return this.zzf;
        }

        public final boolean zzg() {
            return this.zzl;
        }

        public final boolean zzh() {
            return this.zzg;
        }

        public final boolean zzi() {
            return this.zzh;
        }

        public final boolean zzj() {
            return this.zzi;
        }
    }

    public static final class zzd extends zzkg<zzd, zza> implements zzlo {
        private static final zzd zzc;
        private static volatile zzlz<zzd> zzd;
        private int zze;
        private int zzf;
        private zzm zzg;
        private zzm zzh;
        private boolean zzi;

        public static final class zza extends zzkg.zza<zzd, zza> implements zzlo {
            private zza() {
                super(zzd.zzc);
            }

            public final zza zza(int i10) {
                zzam();
                zzd.zza((zzd) this.zza, i10);
                return this;
            }

            public final zza zza(zzm.zza zzaVar) {
                zzam();
                zzd.zza((zzd) this.zza, (zzm) ((zzkg) zzaVar.zzaj()));
                return this;
            }

            public final zza zza(zzm zzmVar) {
                zzam();
                zzd.zzb((zzd) this.zza, zzmVar);
                return this;
            }

            public final zza zza(boolean z10) {
                zzam();
                zzd.zza((zzd) this.zza, z10);
                return this;
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzkg.zza((Class<zzd>) zzd.class, zzdVar);
        }

        private zzd() {
        }

        public static /* synthetic */ void zza(zzd zzdVar, int i10) {
            zzdVar.zze |= 1;
            zzdVar.zzf = i10;
        }

        public static /* synthetic */ void zza(zzd zzdVar, zzm zzmVar) {
            zzmVar.getClass();
            zzdVar.zzg = zzmVar;
            zzdVar.zze |= 2;
        }

        public static /* synthetic */ void zza(zzd zzdVar, boolean z10) {
            zzdVar.zze |= 8;
            zzdVar.zzi = z10;
        }

        public static zza zzb() {
            return zzc.zzcg();
        }

        public static /* synthetic */ void zzb(zzd zzdVar, zzm zzmVar) {
            zzmVar.getClass();
            zzdVar.zzh = zzmVar;
            zzdVar.zze |= 4;
        }

        public final int zza() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.zzkg
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzgi.zza[i10 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza();
                case 3:
                    return zzkg.zza(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzlz<zzd> zzlzVar = zzd;
                    if (zzlzVar == null) {
                        synchronized (zzd.class) {
                            zzlzVar = zzd;
                            if (zzlzVar == null) {
                                zzlzVar = new zzkg.zzc<>(zzc);
                                zzd = zzlzVar;
                            }
                        }
                    }
                    return zzlzVar;
                case 6:
                    return (byte) 1;
                default:
                    throw null;
            }
        }

        public final zzm zzd() {
            zzm zzmVar = this.zzg;
            return zzmVar == null ? zzm.zzg() : zzmVar;
        }

        public final zzm zze() {
            zzm zzmVar = this.zzh;
            return zzmVar == null ? zzm.zzg() : zzmVar;
        }

        public final boolean zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzh() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 4) != 0;
        }
    }

    public static final class zze extends zzkg<zze, zza> implements zzlo {
        private static final zze zzc;
        private static volatile zzlz<zze> zzd;
        private int zze;
        private int zzf;
        private long zzg;

        public static final class zza extends zzkg.zza<zze, zza> implements zzlo {
            private zza() {
                super(zze.zzc);
            }

            public final zza zza(int i10) {
                zzam();
                zze.zza((zze) this.zza, i10);
                return this;
            }

            public final zza zza(long j10) {
                zzam();
                zze.zza((zze) this.zza, j10);
                return this;
            }
        }

        static {
            zze zzeVar = new zze();
            zzc = zzeVar;
            zzkg.zza((Class<zze>) zze.class, zzeVar);
        }

        private zze() {
        }

        public static /* synthetic */ void zza(zze zzeVar, int i10) {
            zzeVar.zze |= 1;
            zzeVar.zzf = i10;
        }

        public static /* synthetic */ void zza(zze zzeVar, long j10) {
            zzeVar.zze |= 2;
            zzeVar.zzg = j10;
        }

        public static zza zzc() {
            return zzc.zzcg();
        }

        public final int zza() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.zzkg
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzgi.zza[i10 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza();
                case 3:
                    return zzkg.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzlz<zze> zzlzVar = zzd;
                    if (zzlzVar == null) {
                        synchronized (zze.class) {
                            zzlzVar = zzd;
                            if (zzlzVar == null) {
                                zzlzVar = new zzkg.zzc<>(zzc);
                                zzd = zzlzVar;
                            }
                        }
                    }
                    return zzlzVar;
                case 6:
                    return (byte) 1;
                default:
                    throw null;
            }
        }

        public final long zzb() {
            return this.zzg;
        }

        public final boolean zze() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzf() {
            return (this.zze & 1) != 0;
        }
    }

    public static final class zzf extends zzkg<zzf, zza> implements zzlo {
        private static final zzf zzc;
        private static volatile zzlz<zzf> zzd;
        private int zze;
        private zzkm<zzh> zzf = zzkg.zzcl();
        private String zzg = "";
        private long zzh;
        private long zzi;
        private int zzj;

        public static final class zza extends zzkg.zza<zzf, zza> implements zzlo {
            private zza() {
                super(zzf.zzc);
            }

            public final int zza() {
                return ((zzf) this.zza).zzb();
            }

            public final zza zza(int i10) {
                zzam();
                zzf.zza((zzf) this.zza, i10);
                return this;
            }

            public final zza zza(int i10, zzh.zza zzaVar) {
                zzam();
                zzf.zza((zzf) this.zza, i10, (zzh) ((zzkg) zzaVar.zzaj()));
                return this;
            }

            public final zza zza(int i10, zzh zzhVar) {
                zzam();
                zzf.zza((zzf) this.zza, i10, zzhVar);
                return this;
            }

            public final zza zza(long j10) {
                zzam();
                zzf.zza((zzf) this.zza, j10);
                return this;
            }

            public final zza zza(zzh.zza zzaVar) {
                zzam();
                zzf.zza((zzf) this.zza, (zzh) ((zzkg) zzaVar.zzaj()));
                return this;
            }

            public final zza zza(zzh zzhVar) {
                zzam();
                zzf.zza((zzf) this.zza, zzhVar);
                return this;
            }

            public final zza zza(Iterable<? extends zzh> iterable) {
                zzam();
                zzf.zza((zzf) this.zza, iterable);
                return this;
            }

            public final zza zza(String str) {
                zzam();
                zzf.zza((zzf) this.zza, str);
                return this;
            }

            public final long zzb() {
                return ((zzf) this.zza).zzc();
            }

            public final zza zzb(long j10) {
                zzam();
                zzf.zzb((zzf) this.zza, j10);
                return this;
            }

            public final zzh zzb(int i10) {
                return ((zzf) this.zza).zza(i10);
            }

            public final long zzc() {
                return ((zzf) this.zza).zzd();
            }

            public final zza zzd() {
                zzam();
                zzf.zza((zzf) this.zza);
                return this;
            }

            public final String zze() {
                return ((zzf) this.zza).zzg();
            }

            public final List<zzh> zzf() {
                return Collections.unmodifiableList(((zzf) this.zza).zzh());
            }

            public final boolean zzg() {
                return ((zzf) this.zza).zzk();
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzc = zzfVar;
            zzkg.zza((Class<zzf>) zzf.class, zzfVar);
        }

        private zzf() {
        }

        public static /* synthetic */ void zza(zzf zzfVar) {
            zzfVar.zzf = zzkg.zzcl();
        }

        public static /* synthetic */ void zza(zzf zzfVar, int i10) {
            zzfVar.zzl();
            zzfVar.zzf.remove(i10);
        }

        public static /* synthetic */ void zza(zzf zzfVar, int i10, zzh zzhVar) {
            zzhVar.getClass();
            zzfVar.zzl();
            zzfVar.zzf.set(i10, zzhVar);
        }

        public static /* synthetic */ void zza(zzf zzfVar, long j10) {
            zzfVar.zze |= 4;
            zzfVar.zzi = j10;
        }

        public static /* synthetic */ void zza(zzf zzfVar, zzh zzhVar) {
            zzhVar.getClass();
            zzfVar.zzl();
            zzfVar.zzf.add(zzhVar);
        }

        public static /* synthetic */ void zza(zzf zzfVar, Iterable iterable) {
            zzfVar.zzl();
            zzio.zza(iterable, zzfVar.zzf);
        }

        public static /* synthetic */ void zza(zzf zzfVar, String str) {
            str.getClass();
            zzfVar.zze |= 1;
            zzfVar.zzg = str;
        }

        public static /* synthetic */ void zzb(zzf zzfVar, long j10) {
            zzfVar.zze |= 2;
            zzfVar.zzh = j10;
        }

        public static zza zze() {
            return zzc.zzcg();
        }

        private final void zzl() {
            zzkm<zzh> zzkmVar = this.zzf;
            if (zzkmVar.zzc()) {
                return;
            }
            this.zzf = zzkg.zza(zzkmVar);
        }

        public final int zza() {
            return this.zzj;
        }

        public final zzh zza(int i10) {
            return this.zzf.get(i10);
        }

        @Override // com.google.android.gms.internal.measurement.zzkg
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzgi.zza[i10 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza();
                case 3:
                    return zzkg.zza(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", zzh.class, "zzg", "zzh", "zzi", "zzj"});
                case 4:
                    return zzc;
                case 5:
                    zzlz<zzf> zzlzVar = zzd;
                    if (zzlzVar == null) {
                        synchronized (zzf.class) {
                            zzlzVar = zzd;
                            if (zzlzVar == null) {
                                zzlzVar = new zzkg.zzc<>(zzc);
                                zzd = zzlzVar;
                            }
                        }
                    }
                    return zzlzVar;
                case 6:
                    return (byte) 1;
                default:
                    throw null;
            }
        }

        public final int zzb() {
            return this.zzf.size();
        }

        public final long zzc() {
            return this.zzi;
        }

        public final long zzd() {
            return this.zzh;
        }

        public final String zzg() {
            return this.zzg;
        }

        public final List<zzh> zzh() {
            return this.zzf;
        }

        public final boolean zzi() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 2) != 0;
        }
    }

    public static final class zzg extends zzkg<zzg, zza> implements zzlo {
        private static final zzg zzc;
        private static volatile zzlz<zzg> zzd;
        private int zze;
        private String zzf = "";
        private long zzg;

        public static final class zza extends zzkg.zza<zzg, zza> implements zzlo {
            private zza() {
                super(zzg.zzc);
            }

            public final zza zza(long j10) {
                zzam();
                zzg.zza((zzg) this.zza, j10);
                return this;
            }

            public final zza zza(String str) {
                zzam();
                zzg.zza((zzg) this.zza, str);
                return this;
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzc = zzgVar;
            zzkg.zza((Class<zzg>) zzg.class, zzgVar);
        }

        private zzg() {
        }

        public static zza zza() {
            return zzc.zzcg();
        }

        public static /* synthetic */ void zza(zzg zzgVar, long j10) {
            zzgVar.zze |= 2;
            zzgVar.zzg = j10;
        }

        public static /* synthetic */ void zza(zzg zzgVar, String str) {
            str.getClass();
            zzgVar.zze |= 1;
            zzgVar.zzf = str;
        }

        @Override // com.google.android.gms.internal.measurement.zzkg
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzgi.zza[i10 - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza();
                case 3:
                    return zzkg.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzlz<zzg> zzlzVar = zzd;
                    if (zzlzVar == null) {
                        synchronized (zzg.class) {
                            zzlzVar = zzd;
                            if (zzlzVar == null) {
                                zzlzVar = new zzkg.zzc<>(zzc);
                                zzd = zzlzVar;
                            }
                        }
                    }
                    return zzlzVar;
                case 6:
                    return (byte) 1;
                default:
                    throw null;
            }
        }
    }

    public static final class zzh extends zzkg<zzh, zza> implements zzlo {
        private static final zzh zzc;
        private static volatile zzlz<zzh> zzd;
        private int zze;
        private long zzh;
        private float zzi;
        private double zzj;
        private String zzf = "";
        private String zzg = "";
        private zzkm<zzh> zzk = zzkg.zzcl();

        public static final class zza extends zzkg.zza<zzh, zza> implements zzlo {
            private zza() {
                super(zzh.zzc);
            }

            public final int zza() {
                return ((zzh) this.zza).zzc();
            }

            public final zza zza(double d10) {
                zzam();
                zzh.zza((zzh) this.zza, d10);
                return this;
            }

            public final zza zza(long j10) {
                zzam();
                zzh.zza((zzh) this.zza, j10);
                return this;
            }

            public final zza zza(zza zzaVar) {
                zzam();
                zzh.zza((zzh) this.zza, (zzh) ((zzkg) zzaVar.zzaj()));
                return this;
            }

            public final zza zza(Iterable<? extends zzh> iterable) {
                zzam();
                zzh.zza((zzh) this.zza, iterable);
                return this;
            }

            public final zza zza(String str) {
                zzam();
                zzh.zza((zzh) this.zza, str);
                return this;
            }

            public final zza zzb() {
                zzam();
                zzh.zza((zzh) this.zza);
                return this;
            }

            public final zza zzb(String str) {
                zzam();
                zzh.zzb((zzh) this.zza, str);
                return this;
            }

            public final zza zzc() {
                zzam();
                zzh.zzb((zzh) this.zza);
                return this;
            }

            public final zza zzd() {
                zzam();
                zzh.zzc((zzh) this.zza);
                return this;
            }

            public final zza zze() {
                zzam();
                zzh.zzd((zzh) this.zza);
                return this;
            }

            public final String zzf() {
                return ((zzh) this.zza).zzg();
            }

            public final String zzg() {
                return ((zzh) this.zza).zzh();
            }
        }

        static {
            zzh zzhVar = new zzh();
            zzc = zzhVar;
            zzkg.zza((Class<zzh>) zzh.class, zzhVar);
        }

        private zzh() {
        }

        public static /* synthetic */ void zza(zzh zzhVar) {
            zzhVar.zze &= -17;
            zzhVar.zzj = 0.0d;
        }

        public static /* synthetic */ void zza(zzh zzhVar, double d10) {
            zzhVar.zze |= 16;
            zzhVar.zzj = d10;
        }

        public static /* synthetic */ void zza(zzh zzhVar, long j10) {
            zzhVar.zze |= 4;
            zzhVar.zzh = j10;
        }

        public static /* synthetic */ void zza(zzh zzhVar, zzh zzhVar2) {
            zzhVar2.getClass();
            zzhVar.zzo();
            zzhVar.zzk.add(zzhVar2);
        }

        public static /* synthetic */ void zza(zzh zzhVar, Iterable iterable) {
            zzhVar.zzo();
            zzio.zza(iterable, zzhVar.zzk);
        }

        public static /* synthetic */ void zza(zzh zzhVar, String str) {
            str.getClass();
            zzhVar.zze |= 1;
            zzhVar.zzf = str;
        }

        public static /* synthetic */ void zzb(zzh zzhVar) {
            zzhVar.zze &= -5;
            zzhVar.zzh = 0L;
        }

        public static /* synthetic */ void zzb(zzh zzhVar, String str) {
            str.getClass();
            zzhVar.zze |= 2;
            zzhVar.zzg = str;
        }

        public static /* synthetic */ void zzc(zzh zzhVar) {
            zzhVar.zzk = zzkg.zzcl();
        }

        public static /* synthetic */ void zzd(zzh zzhVar) {
            zzhVar.zze &= -3;
            zzhVar.zzg = zzc.zzg;
        }

        public static zza zze() {
            return zzc.zzcg();
        }

        private final void zzo() {
            zzkm<zzh> zzkmVar = this.zzk;
            if (zzkmVar.zzc()) {
                return;
            }
            this.zzk = zzkg.zza(zzkmVar);
        }

        public final double zza() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.measurement.zzkg
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzgi.zza[i10 - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza();
                case 3:
                    return zzkg.zza(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzh.class});
                case 4:
                    return zzc;
                case 5:
                    zzlz<zzh> zzlzVar = zzd;
                    if (zzlzVar == null) {
                        synchronized (zzh.class) {
                            zzlzVar = zzd;
                            if (zzlzVar == null) {
                                zzlzVar = new zzkg.zzc<>(zzc);
                                zzd = zzlzVar;
                            }
                        }
                    }
                    return zzlzVar;
                case 6:
                    return (byte) 1;
                default:
                    throw null;
            }
        }

        public final float zzb() {
            return this.zzi;
        }

        public final int zzc() {
            return this.zzk.size();
        }

        public final long zzd() {
            return this.zzh;
        }

        public final String zzg() {
            return this.zzf;
        }

        public final String zzh() {
            return this.zzg;
        }

        public final List<zzh> zzi() {
            return this.zzk;
        }

        public final boolean zzj() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzm() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzn() {
            return (this.zze & 2) != 0;
        }
    }

    public static final class zzi extends zzkg<zzi, zza> implements zzlo {
        private static final zzi zzc;
        private static volatile zzlz<zzi> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";
        private zzb zzh;

        public static final class zza extends zzkg.zza<zzi, zza> implements zzlo {
            private zza() {
                super(zzi.zzc);
            }
        }

        static {
            zzi zziVar = new zzi();
            zzc = zziVar;
            zzkg.zza((Class<zzi>) zzi.class, zziVar);
        }

        private zzi() {
        }

        @Override // com.google.android.gms.internal.measurement.zzkg
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzgi.zza[i10 - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza();
                case 3:
                    return zzkg.zza(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzlz<zzi> zzlzVar = zzd;
                    if (zzlzVar == null) {
                        synchronized (zzi.class) {
                            zzlzVar = zzd;
                            if (zzlzVar == null) {
                                zzlzVar = new zzkg.zzc<>(zzc);
                                zzd = zzlzVar;
                            }
                        }
                    }
                    return zzlzVar;
                case 6:
                    return (byte) 1;
                default:
                    throw null;
            }
        }
    }

    public static final class zzj extends zzkg<zzj, zzb> implements zzlo {
        private static final zzj zzc;
        private static volatile zzlz<zzj> zzd;
        private int zze;
        private zzkm<zzk> zzf = zzkg.zzcl();
        private String zzg = "";
        private String zzh = "";
        private int zzi;

        public enum zza implements zzki {
            SDK(0),
            SGTM(1);

            private final int zzd;

            zza(int i10) {
                this.zzd = i10;
            }

            public static zza zza(int i10) {
                if (i10 == 0) {
                    return SDK;
                }
                if (i10 != 1) {
                    return null;
                }
                return SGTM;
            }

            public static zzkl zzb() {
                return zzgk.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzki
            public final int zza() {
                return this.zzd;
            }
        }

        public static final class zzb extends zzkg.zza<zzj, zzb> implements zzlo {
            private zzb() {
                super(zzj.zzc);
            }

            public final int zza() {
                return ((zzj) this.zza).zza();
            }

            public final zzb zza(int i10, zzk.zza zzaVar) {
                zzam();
                zzj.zza((zzj) this.zza, i10, (zzk) ((zzkg) zzaVar.zzaj()));
                return this;
            }

            public final zzb zza(zzk.zza zzaVar) {
                zzam();
                zzj.zza((zzj) this.zza, (zzk) ((zzkg) zzaVar.zzaj()));
                return this;
            }

            public final zzb zza(Iterable<? extends zzk> iterable) {
                zzam();
                zzj.zza((zzj) this.zza, iterable);
                return this;
            }

            public final zzb zza(String str) {
                zzam();
                zzj.zza((zzj) this.zza, str);
                return this;
            }

            public final zzk zza(int i10) {
                return ((zzj) this.zza).zza(i10);
            }

            public final zzb zzb() {
                zzam();
                zzj.zzb((zzj) this.zza);
                return this;
            }

            public final zzb zzb(String str) {
                zzam();
                zzj.zzb((zzj) this.zza, str);
                return this;
            }

            public final String zzc() {
                return ((zzj) this.zza).zzd();
            }

            public final List<zzk> zzd() {
                return Collections.unmodifiableList(((zzj) this.zza).zzf());
            }
        }

        static {
            zzj zzjVar = new zzj();
            zzc = zzjVar;
            zzkg.zza((Class<zzj>) zzj.class, zzjVar);
        }

        private zzj() {
        }

        public static zzb zza(zzj zzjVar) {
            return zzc.zza(zzjVar);
        }

        public static /* synthetic */ void zza(zzj zzjVar, int i10, zzk zzkVar) {
            zzkVar.getClass();
            zzjVar.zzi();
            zzjVar.zzf.set(i10, zzkVar);
        }

        public static /* synthetic */ void zza(zzj zzjVar, zzk zzkVar) {
            zzkVar.getClass();
            zzjVar.zzi();
            zzjVar.zzf.add(zzkVar);
        }

        public static /* synthetic */ void zza(zzj zzjVar, Iterable iterable) {
            zzjVar.zzi();
            zzio.zza(iterable, zzjVar.zzf);
        }

        public static /* synthetic */ void zza(zzj zzjVar, String str) {
            str.getClass();
            zzjVar.zze |= 1;
            zzjVar.zzg = str;
        }

        public static zzb zzb() {
            return zzc.zzcg();
        }

        public static /* synthetic */ void zzb(zzj zzjVar) {
            zzjVar.zzf = zzkg.zzcl();
        }

        public static /* synthetic */ void zzb(zzj zzjVar, String str) {
            str.getClass();
            zzjVar.zze |= 2;
            zzjVar.zzh = str;
        }

        private final void zzi() {
            zzkm<zzk> zzkmVar = this.zzf;
            if (zzkmVar.zzc()) {
                return;
            }
            this.zzf = zzkg.zza(zzkmVar);
        }

        public final int zza() {
            return this.zzf.size();
        }

        public final zzk zza(int i10) {
            return this.zzf.get(i10);
        }

        @Override // com.google.android.gms.internal.measurement.zzkg
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzgi.zza[i10 - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zzb();
                case 3:
                    return zzkg.zza(zzc, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", zzk.class, "zzg", "zzh", "zzi", zza.zzb()});
                case 4:
                    return zzc;
                case 5:
                    zzlz<zzj> zzlzVar = zzd;
                    if (zzlzVar == null) {
                        synchronized (zzj.class) {
                            zzlzVar = zzd;
                            if (zzlzVar == null) {
                                zzlzVar = new zzkg.zzc<>(zzc);
                                zzd = zzlzVar;
                            }
                        }
                    }
                    return zzlzVar;
                case 6:
                    return (byte) 1;
                default:
                    throw null;
            }
        }

        public final String zzd() {
            return this.zzg;
        }

        public final String zze() {
            return this.zzh;
        }

        public final List<zzk> zzf() {
            return this.zzf;
        }

        public final boolean zzg() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzh() {
            return (this.zze & 2) != 0;
        }
    }

    public static final class zzk extends zzkg<zzk, zza> implements zzlo {
        private static final zzk zzc;
        private static volatile zzlz<zzk> zzd;
        private long zzab;
        private int zzac;
        private boolean zzaf;
        private int zzai;
        private int zzaj;
        private int zzak;
        private long zzam;
        private long zzan;
        private int zzaq;
        private zzl zzas;
        private long zzau;
        private long zzav;
        private int zzay;
        private boolean zzaz;
        private boolean zzbb;
        private zzi zzbc;
        private long zzbg;
        private boolean zzbh;
        private boolean zzbj;
        private int zzbl;
        private zzc zzbn;
        private int zzbo;
        private zza zzbp;
        private zzo zzbr;
        private long zzbs;
        private int zze;
        private int zzf;
        private int zzg;
        private long zzj;
        private long zzk;
        private long zzl;
        private long zzm;
        private long zzn;
        private int zzs;
        private long zzw;
        private long zzx;
        private boolean zzz;
        private zzkm<zzf> zzh = zzkg.zzcl();
        private zzkm<zzp> zzi = zzkg.zzcl();
        private String zzo = "";
        private String zzp = "";
        private String zzq = "";
        private String zzr = "";
        private String zzt = "";
        private String zzu = "";
        private String zzv = "";
        private String zzy = "";
        private String zzaa = "";
        private String zzad = "";
        private String zzae = "";
        private zzkm<zzd> zzag = zzkg.zzcl();
        private String zzah = "";
        private String zzal = "";
        private String zzao = "";
        private String zzap = "";
        private String zzar = "";
        private zzkk zzat = zzkg.zzcj();
        private String zzaw = "";
        private String zzax = "";
        private String zzba = "";
        private String zzbd = "";
        private zzkm<String> zzbe = zzkg.zzcl();
        private String zzbf = "";
        private String zzbi = "";
        private String zzbk = "";
        private String zzbm = "";
        private String zzbq = "";

        public static final class zza extends zzkg.zza<zzk, zza> implements zzlo {
            private zza() {
                super(zzk.zzc);
            }

            public final int zza() {
                return ((zzk) this.zza).zza();
            }

            public final zzf zza(int i10) {
                return ((zzk) this.zza).zza(i10);
            }

            public final zza zza(int i10, zzf.zza zzaVar) {
                zzam();
                zzk.zza((zzk) this.zza, i10, (zzf) ((zzkg) zzaVar.zzaj()));
                return this;
            }

            public final zza zza(int i10, zzf zzfVar) {
                zzam();
                zzk.zza((zzk) this.zza, i10, zzfVar);
                return this;
            }

            public final zza zza(int i10, zzp zzpVar) {
                zzam();
                zzk.zza((zzk) this.zza, i10, zzpVar);
                return this;
            }

            public final zza zza(long j10) {
                zzam();
                zzk.zza((zzk) this.zza, j10);
                return this;
            }

            public final zza zza(zza zzaVar) {
                zzam();
                zzk.zza((zzk) this.zza, zzaVar);
                return this;
            }

            public final zza zza(zzc zzcVar) {
                zzam();
                zzk.zza((zzk) this.zza, zzcVar);
                return this;
            }

            public final zza zza(zzf.zza zzaVar) {
                zzam();
                zzk.zza((zzk) this.zza, (zzf) ((zzkg) zzaVar.zzaj()));
                return this;
            }

            public final zza zza(zzl.zzb zzbVar) {
                zzam();
                zzk.zza((zzk) this.zza, (zzl) ((zzkg) zzbVar.zzaj()));
                return this;
            }

            public final zza zza(zzo zzoVar) {
                zzam();
                zzk.zza((zzk) this.zza, zzoVar);
                return this;
            }

            public final zza zza(zzp.zza zzaVar) {
                zzam();
                zzk.zza((zzk) this.zza, (zzp) ((zzkg) zzaVar.zzaj()));
                return this;
            }

            public final zza zza(zzp zzpVar) {
                zzam();
                zzk.zza((zzk) this.zza, zzpVar);
                return this;
            }

            public final zza zza(Iterable<? extends zzd> iterable) {
                zzam();
                zzk.zza((zzk) this.zza, iterable);
                return this;
            }

            public final zza zza(String str) {
                zzam();
                zzk.zza((zzk) this.zza, str);
                return this;
            }

            public final zza zza(boolean z10) {
                zzam();
                zzk.zza((zzk) this.zza, z10);
                return this;
            }

            public final String zzaa() {
                return ((zzk) this.zza).zzap();
            }

            public final List<zzf> zzab() {
                return Collections.unmodifiableList(((zzk) this.zza).zzat());
            }

            public final List<zzp> zzac() {
                return Collections.unmodifiableList(((zzk) this.zza).zzau());
            }

            public final boolean zzad() {
                return ((zzk) this.zza).zzaw();
            }

            public final boolean zzae() {
                return ((zzk) this.zza).zzax();
            }

            public final boolean zzaf() {
                return ((zzk) this.zza).zzaz();
            }

            public final int zzb() {
                return ((zzk) this.zza).zzb();
            }

            public final zza zzb(int i10) {
                zzam();
                zzk.zza((zzk) this.zza, i10);
                return this;
            }

            public final zza zzb(long j10) {
                zzam();
                zzk.zzb((zzk) this.zza, j10);
                return this;
            }

            public final zza zzb(Iterable<? extends zzf> iterable) {
                zzam();
                zzk.zzb((zzk) this.zza, iterable);
                return this;
            }

            public final zza zzb(String str) {
                zzam();
                zzk.zzb((zzk) this.zza, str);
                return this;
            }

            public final zza zzb(boolean z10) {
                zzam();
                zzk.zzb((zzk) this.zza, z10);
                return this;
            }

            public final int zzc() {
                return ((zzk) this.zza).zze();
            }

            public final zza zzc(int i10) {
                zzam();
                zzk.zzb((zzk) this.zza, i10);
                return this;
            }

            public final zza zzc(long j10) {
                zzam();
                zzk.zzc((zzk) this.zza, j10);
                return this;
            }

            public final zza zzc(Iterable<? extends Integer> iterable) {
                zzam();
                zzk.zzc((zzk) this.zza, iterable);
                return this;
            }

            public final zza zzc(String str) {
                zzam();
                zzk.zzc((zzk) this.zza, str);
                return this;
            }

            public final zza zzc(boolean z10) {
                zzam();
                zzk.zzc((zzk) this.zza, z10);
                return this;
            }

            public final int zzd() {
                return ((zzk) this.zza).zzi();
            }

            public final zza zzd(int i10) {
                zzam();
                zzk.zzc((zzk) this.zza, i10);
                return this;
            }

            public final zza zzd(long j10) {
                zzam();
                zzk.zzd((zzk) this.zza, j10);
                return this;
            }

            public final zza zzd(Iterable<String> iterable) {
                zzam();
                zzk.zzd((zzk) this.zza, iterable);
                return this;
            }

            public final zza zzd(String str) {
                zzam();
                zzk.zzd((zzk) this.zza, str);
                return this;
            }

            public final zza zzd(boolean z10) {
                zzam();
                zzk.zzd((zzk) this.zza, z10);
                return this;
            }

            public final long zze() {
                return ((zzk) this.zza).zzn();
            }

            public final zza zze(int i10) {
                zzam();
                zzk.zzd((zzk) this.zza, i10);
                return this;
            }

            public final zza zze(long j10) {
                zzam();
                zzk.zze((zzk) this.zza, j10);
                return this;
            }

            public final zza zze(Iterable<? extends zzp> iterable) {
                zzam();
                zzk.zze((zzk) this.zza, iterable);
                return this;
            }

            public final zza zze(String str) {
                zzam();
                zzk.zze((zzk) this.zza, str);
                return this;
            }

            public final long zzf() {
                return ((zzk) this.zza).zzr();
            }

            public final zza zzf(int i10) {
                zzam();
                zzk.zze((zzk) this.zza, i10);
                return this;
            }

            public final zza zzf(long j10) {
                zzam();
                zzk.zzf((zzk) this.zza, j10);
                return this;
            }

            public final zza zzf(String str) {
                zzam();
                zzk.zzf((zzk) this.zza, str);
                return this;
            }

            public final zza zzg() {
                return ((zzk) this.zza).zzv();
            }

            public final zza zzg(int i10) {
                zzam();
                zzk.zzf((zzk) this.zza, i10);
                return this;
            }

            public final zza zzg(long j10) {
                zzam();
                zzk.zzg((zzk) this.zza, j10);
                return this;
            }

            public final zza zzg(String str) {
                zzam();
                zzk.zzg((zzk) this.zza, str);
                return this;
            }

            public final zza zzh() {
                zzam();
                zzk.zzb((zzk) this.zza);
                return this;
            }

            public final zza zzh(int i10) {
                zzam();
                zzk.zzg((zzk) this.zza, 1);
                return this;
            }

            public final zza zzh(long j10) {
                zzam();
                zzk.zzh((zzk) this.zza, j10);
                return this;
            }

            public final zza zzh(String str) {
                zzam();
                zzk.zzh((zzk) this.zza, str);
                return this;
            }

            public final zza zzi() {
                zzam();
                zzk.zzc((zzk) this.zza);
                return this;
            }

            public final zza zzi(int i10) {
                zzam();
                zzk.zzh((zzk) this.zza, i10);
                return this;
            }

            public final zza zzi(long j10) {
                zzam();
                zzk.zzi((zzk) this.zza, j10);
                return this;
            }

            public final zza zzi(String str) {
                zzam();
                zzk.zzi((zzk) this.zza, str);
                return this;
            }

            public final zza zzj() {
                zzam();
                zzk.zzd((zzk) this.zza);
                return this;
            }

            public final zza zzj(int i10) {
                zzam();
                zzk.zzi((zzk) this.zza, i10);
                return this;
            }

            public final zza zzj(long j10) {
                zzam();
                zzk.zzj((zzk) this.zza, j10);
                return this;
            }

            public final zza zzj(String str) {
                zzam();
                zzk.zzj((zzk) this.zza, str);
                return this;
            }

            public final zza zzk() {
                zzam();
                zzk.zze((zzk) this.zza);
                return this;
            }

            public final zza zzk(long j10) {
                zzam();
                zzk.zzk((zzk) this.zza, j10);
                return this;
            }

            public final zza zzk(String str) {
                zzam();
                zzk.zzk((zzk) this.zza, str);
                return this;
            }

            public final zzp zzk(int i10) {
                return ((zzk) this.zza).zzb(i10);
            }

            public final zza zzl() {
                zzam();
                zzk.zzf((zzk) this.zza);
                return this;
            }

            public final zza zzl(long j10) {
                zzam();
                zzk.zzl((zzk) this.zza, j10);
                return this;
            }

            public final zza zzl(String str) {
                zzam();
                zzk.zzl((zzk) this.zza, str);
                return this;
            }

            public final zza zzm() {
                zzam();
                zzk.zzg((zzk) this.zza);
                return this;
            }

            public final zza zzm(long j10) {
                zzam();
                zzk.zzm((zzk) this.zza, j10);
                return this;
            }

            public final zza zzm(String str) {
                zzam();
                zzk.zzm((zzk) this.zza, str);
                return this;
            }

            public final zza zzn() {
                zzam();
                zzk.zzh((zzk) this.zza);
                return this;
            }

            public final zza zzn(String str) {
                zzam();
                zzk.zzn((zzk) this.zza, str);
                return this;
            }

            public final zza zzo() {
                zzam();
                zzk.zzi((zzk) this.zza);
                return this;
            }

            public final zza zzo(String str) {
                zzam();
                zzk.zzo((zzk) this.zza, str);
                return this;
            }

            public final zza zzp() {
                zzam();
                zzk.zzj((zzk) this.zza);
                return this;
            }

            public final zza zzp(String str) {
                zzam();
                zzk.zzp((zzk) this.zza, str);
                return this;
            }

            public final zza zzq() {
                zzam();
                zzk.zzk((zzk) this.zza);
                return this;
            }

            public final zza zzq(String str) {
                zzam();
                zzk.zzq((zzk) this.zza, str);
                return this;
            }

            public final zza zzr() {
                zzam();
                zzk.zzl((zzk) this.zza);
                return this;
            }

            public final zza zzr(String str) {
                zzam();
                zzk.zzr((zzk) this.zza, str);
                return this;
            }

            public final zza zzs() {
                zzam();
                zzk.zzm((zzk) this.zza);
                return this;
            }

            public final zza zzs(String str) {
                zzam();
                zzk.zzs((zzk) this.zza, str);
                return this;
            }

            public final zza zzt() {
                zzam();
                zzk.zzn((zzk) this.zza);
                return this;
            }

            public final String zzu() {
                return ((zzk) this.zza).zzab();
            }

            public final String zzv() {
                return ((zzk) this.zza).zzac();
            }

            public final String zzw() {
                return ((zzk) this.zza).zzaf();
            }

            public final String zzx() {
                return ((zzk) this.zza).zzah();
            }

            public final String zzy() {
                return ((zzk) this.zza).i_();
            }

            public final String zzz() {
                return ((zzk) this.zza).zzan();
            }
        }

        static {
            zzk zzkVar = new zzk();
            zzc = zzkVar;
            zzkg.zza((Class<zzk>) zzk.class, zzkVar);
        }

        private zzk() {
        }

        public static zza zza(zzk zzkVar) {
            return zzc.zza(zzkVar);
        }

        public static /* synthetic */ void zza(zzk zzkVar, int i10) {
            zzkVar.zzcr();
            zzkVar.zzh.remove(i10);
        }

        public static /* synthetic */ void zza(zzk zzkVar, int i10, zzf zzfVar) {
            zzfVar.getClass();
            zzkVar.zzcr();
            zzkVar.zzh.set(i10, zzfVar);
        }

        public static /* synthetic */ void zza(zzk zzkVar, int i10, zzp zzpVar) {
            zzpVar.getClass();
            zzkVar.zzcs();
            zzkVar.zzi.set(i10, zzpVar);
        }

        public static /* synthetic */ void zza(zzk zzkVar, long j10) {
            zzkVar.zzf |= 134217728;
            zzkVar.zzbs = j10;
        }

        public static /* synthetic */ void zza(zzk zzkVar, zza zzaVar) {
            zzaVar.getClass();
            zzkVar.zzbp = zzaVar;
            zzkVar.zzf |= 16777216;
        }

        public static /* synthetic */ void zza(zzk zzkVar, zzc zzcVar) {
            zzcVar.getClass();
            zzkVar.zzbn = zzcVar;
            zzkVar.zzf |= 4194304;
        }

        public static /* synthetic */ void zza(zzk zzkVar, zzf zzfVar) {
            zzfVar.getClass();
            zzkVar.zzcr();
            zzkVar.zzh.add(zzfVar);
        }

        public static /* synthetic */ void zza(zzk zzkVar, zzl zzlVar) {
            zzlVar.getClass();
            zzkVar.zzas = zzlVar;
            zzkVar.zzf |= 8;
        }

        public static /* synthetic */ void zza(zzk zzkVar, zzo zzoVar) {
            zzoVar.getClass();
            zzkVar.zzbr = zzoVar;
            zzkVar.zzf |= 67108864;
        }

        public static /* synthetic */ void zza(zzk zzkVar, zzp zzpVar) {
            zzpVar.getClass();
            zzkVar.zzcs();
            zzkVar.zzi.add(zzpVar);
        }

        public static /* synthetic */ void zza(zzk zzkVar, Iterable iterable) {
            zzkm<zzd> zzkmVar = zzkVar.zzag;
            if (!zzkmVar.zzc()) {
                zzkVar.zzag = zzkg.zza(zzkmVar);
            }
            zzio.zza(iterable, zzkVar.zzag);
        }

        public static /* synthetic */ void zza(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zzf |= 4;
            zzkVar.zzar = str;
        }

        public static /* synthetic */ void zza(zzk zzkVar, boolean z10) {
            zzkVar.zzf |= 65536;
            zzkVar.zzbh = z10;
        }

        public static /* synthetic */ void zzb(zzk zzkVar) {
            zzkVar.zze &= -262145;
            zzkVar.zzaa = zzc.zzaa;
        }

        public static /* synthetic */ void zzb(zzk zzkVar, int i10) {
            zzkVar.zzcs();
            zzkVar.zzi.remove(i10);
        }

        public static /* synthetic */ void zzb(zzk zzkVar, long j10) {
            zzkVar.zzf |= 32;
            zzkVar.zzav = j10;
        }

        public static /* synthetic */ void zzb(zzk zzkVar, Iterable iterable) {
            zzkVar.zzcr();
            zzio.zza(iterable, zzkVar.zzh);
        }

        public static /* synthetic */ void zzb(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 4096;
            zzkVar.zzu = str;
        }

        public static /* synthetic */ void zzb(zzk zzkVar, boolean z10) {
            zzkVar.zzf |= 262144;
            zzkVar.zzbj = z10;
        }

        public static /* synthetic */ void zzc(zzk zzkVar) {
            zzkVar.zzag = zzkg.zzcl();
        }

        public static /* synthetic */ void zzc(zzk zzkVar, int i10) {
            zzkVar.zzf |= 1048576;
            zzkVar.zzbl = i10;
        }

        public static /* synthetic */ void zzc(zzk zzkVar, long j10) {
            zzkVar.zze |= 536870912;
            zzkVar.zzam = j10;
        }

        public static /* synthetic */ void zzc(zzk zzkVar, Iterable iterable) {
            zzkk zzkkVar = zzkVar.zzat;
            if (!zzkkVar.zzc()) {
                zzkVar.zzat = zzkkVar.zzc(zzkkVar.size() << 1);
            }
            zzio.zza(iterable, zzkVar.zzat);
        }

        public static /* synthetic */ void zzc(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 262144;
            zzkVar.zzaa = str;
        }

        public static /* synthetic */ void zzc(zzk zzkVar, boolean z10) {
            zzkVar.zze |= 131072;
            zzkVar.zzz = z10;
        }

        private final void zzcr() {
            zzkm<zzf> zzkmVar = this.zzh;
            if (zzkmVar.zzc()) {
                return;
            }
            this.zzh = zzkg.zza(zzkmVar);
        }

        private final void zzcs() {
            zzkm<zzp> zzkmVar = this.zzi;
            if (zzkmVar.zzc()) {
                return;
            }
            this.zzi = zzkg.zza(zzkmVar);
        }

        public static /* synthetic */ void zzd(zzk zzkVar) {
            zzkVar.zze &= -257;
            zzkVar.zzq = zzc.zzq;
        }

        public static /* synthetic */ void zzd(zzk zzkVar, int i10) {
            zzkVar.zze |= 33554432;
            zzkVar.zzai = i10;
        }

        public static /* synthetic */ void zzd(zzk zzkVar, long j10) {
            zzkVar.zze |= 524288;
            zzkVar.zzab = j10;
        }

        public static /* synthetic */ void zzd(zzk zzkVar, Iterable iterable) {
            zzkm<String> zzkmVar = zzkVar.zzbe;
            if (!zzkmVar.zzc()) {
                zzkVar.zzbe = zzkg.zza(zzkmVar);
            }
            zzio.zza(iterable, zzkVar.zzbe);
        }

        public static /* synthetic */ void zzd(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 2048;
            zzkVar.zzt = str;
        }

        public static /* synthetic */ void zzd(zzk zzkVar, boolean z10) {
            zzkVar.zze |= 8388608;
            zzkVar.zzaf = z10;
        }

        public static /* synthetic */ void zze(zzk zzkVar) {
            zzkVar.zze &= Integer.MAX_VALUE;
            zzkVar.zzao = zzc.zzao;
        }

        public static /* synthetic */ void zze(zzk zzkVar, int i10) {
            zzkVar.zze |= 1048576;
            zzkVar.zzac = i10;
        }

        public static /* synthetic */ void zze(zzk zzkVar, long j10) {
            zzkVar.zzf |= 16;
            zzkVar.zzau = j10;
        }

        public static /* synthetic */ void zze(zzk zzkVar, Iterable iterable) {
            zzkVar.zzcs();
            zzio.zza(iterable, zzkVar.zzi);
        }

        public static /* synthetic */ void zze(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 8192;
            zzkVar.zzv = str;
        }

        public static /* synthetic */ void zzf(zzk zzkVar) {
            zzkVar.zzh = zzkg.zzcl();
        }

        public static /* synthetic */ void zzf(zzk zzkVar, int i10) {
            zzkVar.zzf |= 8388608;
            zzkVar.zzbo = i10;
        }

        public static /* synthetic */ void zzf(zzk zzkVar, long j10) {
            zzkVar.zze |= 8;
            zzkVar.zzl = j10;
        }

        public static /* synthetic */ void zzf(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zzf |= 131072;
            zzkVar.zzbi = str;
        }

        public static /* synthetic */ void zzg(zzk zzkVar) {
            zzkVar.zze &= -2097153;
            zzkVar.zzad = zzc.zzad;
        }

        public static /* synthetic */ void zzg(zzk zzkVar, int i10) {
            zzkVar.zze |= 1;
            zzkVar.zzg = 1;
        }

        public static /* synthetic */ void zzg(zzk zzkVar, long j10) {
            zzkVar.zze |= 16384;
            zzkVar.zzw = j10;
        }

        public static /* synthetic */ void zzg(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zzf |= 128;
            zzkVar.zzax = str;
        }

        public static /* synthetic */ void zzh(zzk zzkVar) {
            zzkVar.zze &= -131073;
            zzkVar.zzz = false;
        }

        public static /* synthetic */ void zzh(zzk zzkVar, int i10) {
            zzkVar.zzf |= 2;
            zzkVar.zzaq = i10;
        }

        public static /* synthetic */ void zzh(zzk zzkVar, long j10) {
            zzkVar.zze |= 32;
            zzkVar.zzn = j10;
        }

        public static /* synthetic */ void zzh(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zzf |= 524288;
            zzkVar.zzbk = str;
        }

        public static /* synthetic */ void zzi(zzk zzkVar) {
            zzkVar.zze &= -33;
            zzkVar.zzn = 0L;
        }

        public static /* synthetic */ void zzi(zzk zzkVar, int i10) {
            zzkVar.zze |= 1024;
            zzkVar.zzs = i10;
        }

        public static /* synthetic */ void zzi(zzk zzkVar, long j10) {
            zzkVar.zze |= 16;
            zzkVar.zzm = j10;
        }

        public static /* synthetic */ void zzi(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 256;
            zzkVar.zzq = str;
        }

        public static /* synthetic */ void zzj(zzk zzkVar) {
            zzkVar.zze &= -17;
            zzkVar.zzm = 0L;
        }

        public static /* synthetic */ void zzj(zzk zzkVar, long j10) {
            zzkVar.zze |= 4;
            zzkVar.zzk = j10;
        }

        public static /* synthetic */ void zzj(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= Integer.MIN_VALUE;
            zzkVar.zzao = str;
        }

        public static /* synthetic */ void zzk(zzk zzkVar) {
            zzkVar.zze &= -65537;
            zzkVar.zzy = zzc.zzy;
        }

        public static /* synthetic */ void zzk(zzk zzkVar, long j10) {
            zzkVar.zzf |= 32768;
            zzkVar.zzbg = j10;
        }

        public static /* synthetic */ void zzk(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zzf |= 16384;
            zzkVar.zzbf = str;
        }

        public static /* synthetic */ void zzl(zzk zzkVar) {
            zzkVar.zzf &= -8193;
            zzkVar.zzbd = zzc.zzbd;
        }

        public static /* synthetic */ void zzl(zzk zzkVar, long j10) {
            zzkVar.zze |= 2;
            zzkVar.zzj = j10;
        }

        public static /* synthetic */ void zzl(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 16777216;
            zzkVar.zzah = str;
        }

        public static /* synthetic */ void zzm(zzk zzkVar) {
            zzkVar.zze &= -268435457;
            zzkVar.zzal = zzc.zzal;
        }

        public static /* synthetic */ void zzm(zzk zzkVar, long j10) {
            zzkVar.zze |= 32768;
            zzkVar.zzx = j10;
        }

        public static /* synthetic */ void zzm(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 4194304;
            zzkVar.zzae = str;
        }

        public static /* synthetic */ void zzn(zzk zzkVar) {
            zzkVar.zze &= -3;
            zzkVar.zzj = 0L;
        }

        public static /* synthetic */ void zzn(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 2097152;
            zzkVar.zzad = str;
        }

        public static /* synthetic */ void zzo(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 128;
            zzkVar.zzp = str;
        }

        public static /* synthetic */ void zzp(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 64;
            zzkVar.zzo = str;
        }

        public static /* synthetic */ void zzq(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 65536;
            zzkVar.zzy = str;
        }

        public static /* synthetic */ void zzr(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zzf |= 8192;
            zzkVar.zzbd = str;
        }

        public static /* synthetic */ void zzs(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 512;
            zzkVar.zzr = str;
        }

        public static zza zzx() {
            return zzc.zzcg();
        }

        public final String i_() {
            return this.zzae;
        }

        public final int zza() {
            return this.zzbl;
        }

        public final zzf zza(int i10) {
            return this.zzh.get(i10);
        }

        @Override // com.google.android.gms.internal.measurement.zzkg
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzgi.zza[i10 - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zza();
                case 3:
                    return zzkg.zza(zzc, "\u0004A\u0000\u0002\u0001RA\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;", new Object[]{"zze", "zzf", "zzg", "zzh", zzf.class, "zzi", zzp.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzm", "zzaf", "zzag", zzd.class, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax", "zzay", zzgh.zzb(), "zzaz", "zzba", "zzbb", "zzbc", "zzbd", "zzbe", "zzbf", "zzbg", "zzbh", "zzbi", "zzbj", "zzbk", "zzbl", "zzbm", "zzbn", "zzbo", "zzbp", "zzbq", "zzbr", "zzbs"});
                case 4:
                    return zzc;
                case 5:
                    zzlz<zzk> zzlzVar = zzd;
                    if (zzlzVar == null) {
                        synchronized (zzk.class) {
                            zzlzVar = zzd;
                            if (zzlzVar == null) {
                                zzlzVar = new zzkg.zzc<>(zzc);
                                zzd = zzlzVar;
                            }
                        }
                    }
                    return zzlzVar;
                case 6:
                    return (byte) 1;
                default:
                    throw null;
            }
        }

        public final String zzaa() {
            return this.zzar;
        }

        public final String zzab() {
            return this.zzu;
        }

        public final String zzac() {
            return this.zzaa;
        }

        public final String zzad() {
            return this.zzt;
        }

        public final String zzae() {
            return this.zzv;
        }

        public final String zzaf() {
            return this.zzbi;
        }

        public final String zzag() {
            return this.zzax;
        }

        public final String zzah() {
            return this.zzbk;
        }

        public final String zzai() {
            return this.zzq;
        }

        public final String zzaj() {
            return this.zzao;
        }

        public final String zzak() {
            return this.zzah;
        }

        public final String zzam() {
            return this.zzad;
        }

        public final String zzan() {
            return this.zzp;
        }

        public final String zzao() {
            return this.zzo;
        }

        public final String zzap() {
            return this.zzy;
        }

        public final String zzaq() {
            return this.zzbd;
        }

        public final String zzar() {
            return this.zzr;
        }

        public final List<zzd> zzas() {
            return this.zzag;
        }

        public final List<zzf> zzat() {
            return this.zzh;
        }

        public final List<zzp> zzau() {
            return this.zzi;
        }

        public final boolean zzav() {
            return this.zzbh;
        }

        public final boolean zzaw() {
            return this.zzbj;
        }

        public final boolean zzax() {
            return this.zzz;
        }

        public final boolean zzay() {
            return this.zzaf;
        }

        public final boolean zzaz() {
            return (this.zzf & 16777216) != 0;
        }

        public final int zzb() {
            return this.zzai;
        }

        public final zzp zzb(int i10) {
            return this.zzi.get(i10);
        }

        public final boolean zzba() {
            return (this.zze & 33554432) != 0;
        }

        public final boolean zzbb() {
            return (this.zzf & 4194304) != 0;
        }

        public final boolean zzbc() {
            return (this.zzf & 134217728) != 0;
        }

        public final boolean zzbd() {
            return (this.zze & 1048576) != 0;
        }

        public final boolean zzbe() {
            return (this.zze & 536870912) != 0;
        }

        public final boolean zzbf() {
            return (this.zzf & 131072) != 0;
        }

        public final boolean zzbg() {
            return (this.zzf & 128) != 0;
        }

        public final boolean zzbh() {
            return (this.zzf & 524288) != 0;
        }

        public final boolean zzbi() {
            return (this.zzf & 8388608) != 0;
        }

        public final boolean zzbj() {
            return (this.zze & 524288) != 0;
        }

        public final boolean zzbk() {
            return (this.zze & Integer.MIN_VALUE) != 0;
        }

        public final boolean zzbl() {
            return (this.zzf & 16) != 0;
        }

        public final boolean zzbm() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzbn() {
            return (this.zze & 16384) != 0;
        }

        public final boolean zzbo() {
            return (this.zzf & 262144) != 0;
        }

        public final boolean zzbp() {
            return (this.zze & 131072) != 0;
        }

        public final boolean zzbq() {
            return (this.zze & 32) != 0;
        }

        public final boolean zzbr() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzbs() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzbt() {
            return (this.zzf & 2) != 0;
        }

        public final boolean zzbu() {
            return (this.zze & 8388608) != 0;
        }

        public final boolean zzbv() {
            return (this.zzf & 8192) != 0;
        }

        public final boolean zzbw() {
            return (this.zzf & 67108864) != 0;
        }

        public final boolean zzbx() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzby() {
            return (this.zzf & 32768) != 0;
        }

        public final boolean zzbz() {
            return (this.zze & 1024) != 0;
        }

        public final int zzc() {
            return this.zzac;
        }

        public final boolean zzca() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzcb() {
            return (this.zze & 32768) != 0;
        }

        public final int zzd() {
            return this.zzbo;
        }

        public final int zze() {
            return this.zzh.size();
        }

        public final int zzf() {
            return this.zzg;
        }

        public final int zzg() {
            return this.zzaq;
        }

        public final int zzh() {
            return this.zzs;
        }

        public final int zzi() {
            return this.zzi.size();
        }

        public final long zzj() {
            return this.zzbs;
        }

        public final long zzk() {
            return this.zzam;
        }

        public final long zzl() {
            return this.zzab;
        }

        public final long zzm() {
            return this.zzau;
        }

        public final long zzn() {
            return this.zzl;
        }

        public final long zzo() {
            return this.zzw;
        }

        public final long zzp() {
            return this.zzn;
        }

        public final long zzq() {
            return this.zzm;
        }

        public final long zzr() {
            return this.zzk;
        }

        public final long zzs() {
            return this.zzbg;
        }

        public final long zzt() {
            return this.zzj;
        }

        public final long zzu() {
            return this.zzx;
        }

        public final zza zzv() {
            zza zzaVar = this.zzbp;
            return zzaVar == null ? zza.zze() : zzaVar;
        }

        public final zzc zzw() {
            zzc zzcVar = this.zzbn;
            return zzcVar == null ? zzc.zzc() : zzcVar;
        }

        public final zzo zzz() {
            zzo zzoVar = this.zzbr;
            return zzoVar == null ? zzo.zzf() : zzoVar;
        }
    }

    public static final class zzl extends zzkg<zzl, zzb> implements zzlo {
        private static final zzl zzc;
        private static volatile zzlz<zzl> zzd;
        private int zze;
        private int zzf = 1;
        private zzkm<zzg> zzg = zzkg.zzcl();

        public enum zza implements zzki {
            RADS(1),
            PROVISIONING(2);

            private final int zzd;

            zza(int i10) {
                this.zzd = i10;
            }

            public static zza zza(int i10) {
                if (i10 == 1) {
                    return RADS;
                }
                if (i10 != 2) {
                    return null;
                }
                return PROVISIONING;
            }

            public static zzkl zzb() {
                return zzgl.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzki
            public final int zza() {
                return this.zzd;
            }
        }

        public static final class zzb extends zzkg.zza<zzl, zzb> implements zzlo {
            private zzb() {
                super(zzl.zzc);
            }

            public final zzb zza(zzg.zza zzaVar) {
                zzam();
                zzl.zza((zzl) this.zza, (zzg) ((zzkg) zzaVar.zzaj()));
                return this;
            }
        }

        static {
            zzl zzlVar = new zzl();
            zzc = zzlVar;
            zzkg.zza((Class<zzl>) zzl.class, zzlVar);
        }

        private zzl() {
        }

        public static zzb zza() {
            return zzc.zzcg();
        }

        public static /* synthetic */ void zza(zzl zzlVar, zzg zzgVar) {
            zzgVar.getClass();
            zzkm<zzg> zzkmVar = zzlVar.zzg;
            if (!zzkmVar.zzc()) {
                zzlVar.zzg = zzkg.zza(zzkmVar);
            }
            zzlVar.zzg.add(zzgVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzkg
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzgi.zza[i10 - 1]) {
                case 1:
                    return new zzl();
                case 2:
                    return new zzb();
                case 3:
                    return zzkg.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", zza.zzb(), "zzg", zzg.class});
                case 4:
                    return zzc;
                case 5:
                    zzlz<zzl> zzlzVar = zzd;
                    if (zzlzVar == null) {
                        synchronized (zzl.class) {
                            zzlzVar = zzd;
                            if (zzlzVar == null) {
                                zzlzVar = new zzkg.zzc<>(zzc);
                                zzd = zzlzVar;
                            }
                        }
                    }
                    return zzlzVar;
                case 6:
                    return (byte) 1;
                default:
                    throw null;
            }
        }
    }

    public static final class zzm extends zzkg<zzm, zza> implements zzlo {
        private static final zzm zzc;
        private static volatile zzlz<zzm> zzd;
        private zzkn zze = zzkg.zzck();
        private zzkn zzf = zzkg.zzck();
        private zzkm<zze> zzg = zzkg.zzcl();
        private zzkm<zzn> zzh = zzkg.zzcl();

        public static final class zza extends zzkg.zza<zzm, zza> implements zzlo {
            private zza() {
                super(zzm.zzc);
            }

            public final zza zza() {
                zzam();
                zzm.zza((zzm) this.zza);
                return this;
            }

            public final zza zza(Iterable<? extends zze> iterable) {
                zzam();
                zzm.zza((zzm) this.zza, iterable);
                return this;
            }

            public final zza zzb() {
                zzam();
                zzm.zzb((zzm) this.zza);
                return this;
            }

            public final zza zzb(Iterable<? extends Long> iterable) {
                zzam();
                zzm.zzb((zzm) this.zza, iterable);
                return this;
            }

            public final zza zzc() {
                zzam();
                zzm.zzc((zzm) this.zza);
                return this;
            }

            public final zza zzc(Iterable<? extends zzn> iterable) {
                zzam();
                zzm.zzc((zzm) this.zza, iterable);
                return this;
            }

            public final zza zzd() {
                zzam();
                zzm.zzd((zzm) this.zza);
                return this;
            }

            public final zza zzd(Iterable<? extends Long> iterable) {
                zzam();
                zzm.zzd((zzm) this.zza, iterable);
                return this;
            }
        }

        static {
            zzm zzmVar = new zzm();
            zzc = zzmVar;
            zzkg.zza((Class<zzm>) zzm.class, zzmVar);
        }

        private zzm() {
        }

        public static /* synthetic */ void zza(zzm zzmVar) {
            zzmVar.zzg = zzkg.zzcl();
        }

        public static /* synthetic */ void zza(zzm zzmVar, Iterable iterable) {
            zzkm<zze> zzkmVar = zzmVar.zzg;
            if (!zzkmVar.zzc()) {
                zzmVar.zzg = zzkg.zza(zzkmVar);
            }
            zzio.zza(iterable, zzmVar.zzg);
        }

        public static /* synthetic */ void zzb(zzm zzmVar) {
            zzmVar.zzf = zzkg.zzck();
        }

        public static /* synthetic */ void zzb(zzm zzmVar, Iterable iterable) {
            zzkn zzknVar = zzmVar.zzf;
            if (!zzknVar.zzc()) {
                zzmVar.zzf = zzkg.zza(zzknVar);
            }
            zzio.zza(iterable, zzmVar.zzf);
        }

        public static /* synthetic */ void zzc(zzm zzmVar) {
            zzmVar.zzh = zzkg.zzcl();
        }

        public static /* synthetic */ void zzc(zzm zzmVar, Iterable iterable) {
            zzkm<zzn> zzkmVar = zzmVar.zzh;
            if (!zzkmVar.zzc()) {
                zzmVar.zzh = zzkg.zza(zzkmVar);
            }
            zzio.zza(iterable, zzmVar.zzh);
        }

        public static /* synthetic */ void zzd(zzm zzmVar) {
            zzmVar.zze = zzkg.zzck();
        }

        public static /* synthetic */ void zzd(zzm zzmVar, Iterable iterable) {
            zzkn zzknVar = zzmVar.zze;
            if (!zzknVar.zzc()) {
                zzmVar.zze = zzkg.zza(zzknVar);
            }
            zzio.zza(iterable, zzmVar.zze);
        }

        public static zza zze() {
            return zzc.zzcg();
        }

        public static zzm zzg() {
            return zzc;
        }

        public final int zza() {
            return this.zzg.size();
        }

        @Override // com.google.android.gms.internal.measurement.zzkg
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzgi.zza[i10 - 1]) {
                case 1:
                    return new zzm();
                case 2:
                    return new zza();
                case 3:
                    return zzkg.zza(zzc, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", zze.class, "zzh", zzn.class});
                case 4:
                    return zzc;
                case 5:
                    zzlz<zzm> zzlzVar = zzd;
                    if (zzlzVar == null) {
                        synchronized (zzm.class) {
                            zzlzVar = zzd;
                            if (zzlzVar == null) {
                                zzlzVar = new zzkg.zzc<>(zzc);
                                zzd = zzlzVar;
                            }
                        }
                    }
                    return zzlzVar;
                case 6:
                    return (byte) 1;
                default:
                    throw null;
            }
        }

        public final int zzb() {
            return this.zzf.size();
        }

        public final int zzc() {
            return this.zzh.size();
        }

        public final int zzd() {
            return this.zze.size();
        }

        public final List<zze> zzh() {
            return this.zzg;
        }

        public final List<Long> zzi() {
            return this.zzf;
        }

        public final List<zzn> zzj() {
            return this.zzh;
        }

        public final List<Long> zzk() {
            return this.zze;
        }
    }

    public static final class zzn extends zzkg<zzn, zza> implements zzlo {
        private static final zzn zzc;
        private static volatile zzlz<zzn> zzd;
        private int zze;
        private int zzf;
        private zzkn zzg = zzkg.zzck();

        public static final class zza extends zzkg.zza<zzn, zza> implements zzlo {
            private zza() {
                super(zzn.zzc);
            }

            public final zza zza(int i10) {
                zzam();
                zzn.zza((zzn) this.zza, i10);
                return this;
            }

            public final zza zza(Iterable<? extends Long> iterable) {
                zzam();
                zzn.zza((zzn) this.zza, iterable);
                return this;
            }
        }

        static {
            zzn zznVar = new zzn();
            zzc = zznVar;
            zzkg.zza((Class<zzn>) zzn.class, zznVar);
        }

        private zzn() {
        }

        public static /* synthetic */ void zza(zzn zznVar, int i10) {
            zznVar.zze |= 1;
            zznVar.zzf = i10;
        }

        public static /* synthetic */ void zza(zzn zznVar, Iterable iterable) {
            zzkn zzknVar = zznVar.zzg;
            if (!zzknVar.zzc()) {
                zznVar.zzg = zzkg.zza(zzknVar);
            }
            zzio.zza(iterable, zznVar.zzg);
        }

        public static zza zzc() {
            return zzc.zzcg();
        }

        public final int zza() {
            return this.zzg.size();
        }

        public final long zza(int i10) {
            return this.zzg.zzb(i10);
        }

        @Override // com.google.android.gms.internal.measurement.zzkg
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzgi.zza[i10 - 1]) {
                case 1:
                    return new zzn();
                case 2:
                    return new zza();
                case 3:
                    return zzkg.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzlz<zzn> zzlzVar = zzd;
                    if (zzlzVar == null) {
                        synchronized (zzn.class) {
                            zzlzVar = zzd;
                            if (zzlzVar == null) {
                                zzlzVar = new zzkg.zzc<>(zzc);
                                zzd = zzlzVar;
                            }
                        }
                    }
                    return zzlzVar;
                case 6:
                    return (byte) 1;
                default:
                    throw null;
            }
        }

        public final int zzb() {
            return this.zzf;
        }

        public final List<Long> zze() {
            return this.zzg;
        }

        public final boolean zzf() {
            return (this.zze & 1) != 0;
        }
    }

    public static final class zzo extends zzkg<zzo, zzb> implements zzlo {
        private static final zzo zzc;
        private static volatile zzlz<zzo> zzd;
        private int zze;
        private int zzf;
        private int zzg;
        private int zzh;

        public enum zza implements zzki {
            CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN(0),
            CLIENT_UPLOAD_ELIGIBLE(1),
            MEASUREMENT_SERVICE_NOT_ENABLED(2),
            ANDROID_TOO_OLD(3),
            NON_PLAY_MODE(4),
            SDK_TOO_OLD(5),
            MISSING_JOB_SCHEDULER(6),
            NOT_ENABLED_IN_MANIFEST(7),
            CLIENT_FLAG_OFF(8),
            SERVICE_FLAG_OFF(20),
            PINNED_TO_SERVICE_UPLOAD(21),
            MISSING_SGTM_SERVER_URL(22);

            private final int zzn;

            zza(int i10) {
                this.zzn = i10;
            }

            public static zza zza(int i10) {
                switch (i10) {
                    case 0:
                        return CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN;
                    case 1:
                        return CLIENT_UPLOAD_ELIGIBLE;
                    case 2:
                        return MEASUREMENT_SERVICE_NOT_ENABLED;
                    case 3:
                        return ANDROID_TOO_OLD;
                    case 4:
                        return NON_PLAY_MODE;
                    case 5:
                        return SDK_TOO_OLD;
                    case 6:
                        return MISSING_JOB_SCHEDULER;
                    case 7:
                        return NOT_ENABLED_IN_MANIFEST;
                    case 8:
                        return CLIENT_FLAG_OFF;
                    default:
                        switch (i10) {
                            case 20:
                                return SERVICE_FLAG_OFF;
                            case 21:
                                return PINNED_TO_SERVICE_UPLOAD;
                            case 22:
                                return MISSING_SGTM_SERVER_URL;
                            default:
                                return null;
                        }
                }
            }

            public static zzkl zzb() {
                return zzgm.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzn + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzki
            public final int zza() {
                return this.zzn;
            }
        }

        public static final class zzb extends zzkg.zza<zzo, zzb> implements zzlo {
            private zzb() {
                super(zzo.zzc);
            }

            public final zzb zza(zza zzaVar) {
                zzam();
                zzo.zza((zzo) this.zza, zzaVar);
                return this;
            }

            public final zzb zza(zzc zzcVar) {
                zzam();
                zzo.zza((zzo) this.zza, zzcVar);
                return this;
            }

            public final zzb zza(zzd zzdVar) {
                zzam();
                zzo.zza((zzo) this.zza, zzdVar);
                return this;
            }
        }

        public enum zzc implements zzki {
            SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN(0),
            SERVICE_UPLOAD_ELIGIBLE(1),
            NOT_IN_ROLLOUT(2),
            MISSING_SGTM_SETTINGS(3),
            MISSING_SGTM_PROXY_INFO(4),
            NON_PLAY_MISSING_SGTM_SERVER_URL(5);

            private final int zzh;

            zzc(int i10) {
                this.zzh = i10;
            }

            public static zzc zza(int i10) {
                if (i10 == 0) {
                    return SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN;
                }
                if (i10 == 1) {
                    return SERVICE_UPLOAD_ELIGIBLE;
                }
                if (i10 == 2) {
                    return NOT_IN_ROLLOUT;
                }
                if (i10 == 3) {
                    return MISSING_SGTM_SETTINGS;
                }
                if (i10 == 4) {
                    return MISSING_SGTM_PROXY_INFO;
                }
                if (i10 != 5) {
                    return null;
                }
                return NON_PLAY_MISSING_SGTM_SERVER_URL;
            }

            public static zzkl zzb() {
                return zzgn.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzc.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzki
            public final int zza() {
                return this.zzh;
            }
        }

        public enum zzd implements zzki {
            UPLOAD_TYPE_UNKNOWN(0),
            GA_UPLOAD(1),
            SDK_CLIENT_UPLOAD(2),
            PACKAGE_SERVICE_UPLOAD(3),
            SDK_SERVICE_UPLOAD(4);

            private final int zzg;

            zzd(int i10) {
                this.zzg = i10;
            }

            public static zzd zza(int i10) {
                if (i10 == 0) {
                    return UPLOAD_TYPE_UNKNOWN;
                }
                if (i10 == 1) {
                    return GA_UPLOAD;
                }
                if (i10 == 2) {
                    return SDK_CLIENT_UPLOAD;
                }
                if (i10 == 3) {
                    return PACKAGE_SERVICE_UPLOAD;
                }
                if (i10 != 4) {
                    return null;
                }
                return SDK_SERVICE_UPLOAD;
            }

            public static zzkl zzb() {
                return zzgo.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzd.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzki
            public final int zza() {
                return this.zzg;
            }
        }

        static {
            zzo zzoVar = new zzo();
            zzc = zzoVar;
            zzkg.zza((Class<zzo>) zzo.class, zzoVar);
        }

        private zzo() {
        }

        public static zzb zza() {
            return zzc.zzcg();
        }

        public static /* synthetic */ void zza(zzo zzoVar, zza zzaVar) {
            zzoVar.zzg = zzaVar.zza();
            zzoVar.zze |= 2;
        }

        public static /* synthetic */ void zza(zzo zzoVar, zzc zzcVar) {
            zzoVar.zzh = zzcVar.zza();
            zzoVar.zze |= 4;
        }

        public static /* synthetic */ void zza(zzo zzoVar, zzd zzdVar) {
            zzoVar.zzf = zzdVar.zza();
            zzoVar.zze |= 1;
        }

        public static zzo zzf() {
            return zzc;
        }

        @Override // com.google.android.gms.internal.measurement.zzkg
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzgi.zza[i10 - 1]) {
                case 1:
                    return new zzo();
                case 2:
                    return new zzb();
                case 3:
                    return zzkg.zza(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zze", "zzf", zzd.zzb(), "zzg", zza.zzb(), "zzh", zzc.zzb()});
                case 4:
                    return zzc;
                case 5:
                    zzlz<zzo> zzlzVar = zzd;
                    if (zzlzVar == null) {
                        synchronized (zzo.class) {
                            zzlzVar = zzd;
                            if (zzlzVar == null) {
                                zzlzVar = new zzkg.zzc<>(zzc);
                                zzd = zzlzVar;
                            }
                        }
                    }
                    return zzlzVar;
                case 6:
                    return (byte) 1;
                default:
                    throw null;
            }
        }

        public final zza zzb() {
            zza zza2 = zza.zza(this.zzg);
            return zza2 == null ? zza.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : zza2;
        }

        public final zzc zzc() {
            zzc zza2 = zzc.zza(this.zzh);
            return zza2 == null ? zzc.SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN : zza2;
        }

        public final zzd zzd() {
            zzd zza2 = zzd.zza(this.zzf);
            return zza2 == null ? zzd.UPLOAD_TYPE_UNKNOWN : zza2;
        }
    }

    public static final class zzp extends zzkg<zzp, zza> implements zzlo {
        private static final zzp zzc;
        private static volatile zzlz<zzp> zzd;
        private int zze;
        private long zzf;
        private String zzg = "";
        private String zzh = "";
        private long zzi;
        private float zzj;
        private double zzk;

        public static final class zza extends zzkg.zza<zzp, zza> implements zzlo {
            private zza() {
                super(zzp.zzc);
            }

            public final zza zza() {
                zzam();
                zzp.zza((zzp) this.zza);
                return this;
            }

            public final zza zza(double d10) {
                zzam();
                zzp.zza((zzp) this.zza, d10);
                return this;
            }

            public final zza zza(long j10) {
                zzam();
                zzp.zza((zzp) this.zza, j10);
                return this;
            }

            public final zza zza(String str) {
                zzam();
                zzp.zza((zzp) this.zza, str);
                return this;
            }

            public final zza zzb() {
                zzam();
                zzp.zzb((zzp) this.zza);
                return this;
            }

            public final zza zzb(long j10) {
                zzam();
                zzp.zzb((zzp) this.zza, j10);
                return this;
            }

            public final zza zzb(String str) {
                zzam();
                zzp.zzb((zzp) this.zza, str);
                return this;
            }

            public final zza zzc() {
                zzam();
                zzp.zzc((zzp) this.zza);
                return this;
            }
        }

        static {
            zzp zzpVar = new zzp();
            zzc = zzpVar;
            zzkg.zza((Class<zzp>) zzp.class, zzpVar);
        }

        private zzp() {
        }

        public static /* synthetic */ void zza(zzp zzpVar) {
            zzpVar.zze &= -33;
            zzpVar.zzk = 0.0d;
        }

        public static /* synthetic */ void zza(zzp zzpVar, double d10) {
            zzpVar.zze |= 32;
            zzpVar.zzk = d10;
        }

        public static /* synthetic */ void zza(zzp zzpVar, long j10) {
            zzpVar.zze |= 8;
            zzpVar.zzi = j10;
        }

        public static /* synthetic */ void zza(zzp zzpVar, String str) {
            str.getClass();
            zzpVar.zze |= 2;
            zzpVar.zzg = str;
        }

        public static /* synthetic */ void zzb(zzp zzpVar) {
            zzpVar.zze &= -9;
            zzpVar.zzi = 0L;
        }

        public static /* synthetic */ void zzb(zzp zzpVar, long j10) {
            zzpVar.zze |= 1;
            zzpVar.zzf = j10;
        }

        public static /* synthetic */ void zzb(zzp zzpVar, String str) {
            str.getClass();
            zzpVar.zze |= 4;
            zzpVar.zzh = str;
        }

        public static /* synthetic */ void zzc(zzp zzpVar) {
            zzpVar.zze &= -5;
            zzpVar.zzh = zzc.zzh;
        }

        public static zza zze() {
            return zzc.zzcg();
        }

        public final double zza() {
            return this.zzk;
        }

        @Override // com.google.android.gms.internal.measurement.zzkg
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzgi.zza[i10 - 1]) {
                case 1:
                    return new zzp();
                case 2:
                    return new zza();
                case 3:
                    return zzkg.zza(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzc;
                case 5:
                    zzlz<zzp> zzlzVar = zzd;
                    if (zzlzVar == null) {
                        synchronized (zzp.class) {
                            zzlzVar = zzd;
                            if (zzlzVar == null) {
                                zzlzVar = new zzkg.zzc<>(zzc);
                                zzd = zzlzVar;
                            }
                        }
                    }
                    return zzlzVar;
                case 6:
                    return (byte) 1;
                default:
                    throw null;
            }
        }

        public final float zzb() {
            return this.zzj;
        }

        public final long zzc() {
            return this.zzi;
        }

        public final long zzd() {
            return this.zzf;
        }

        public final String zzg() {
            return this.zzg;
        }

        public final String zzh() {
            return this.zzh;
        }

        public final boolean zzi() {
            return (this.zze & 32) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzm() {
            return (this.zze & 4) != 0;
        }
    }
}
