package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* loaded from: classes.dex */
final class zzajm implements zzamd {
    private final zzaji zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzajm(zzaji zzajiVar) {
        zzaji zzajiVar2 = (zzaji) zzaki.zza(zzajiVar, "input");
        this.zza = zzajiVar2;
        zzajiVar2.zzc = this;
    }

    public static zzajm zza(zzaji zzajiVar) {
        zzajm zzajmVar = zzajiVar.zzc;
        return zzajmVar != null ? zzajmVar : new zzajm(zzajiVar);
    }

    private final <T> T zza(zzamc<T> zzamcVar, zzajv zzajvVar) {
        T zza = zzamcVar.zza();
        zzc(zza, zzamcVar, zzajvVar);
        zzamcVar.zzd(zza);
        return zza;
    }

    private final Object zza(zzanh zzanhVar, Class<?> cls, zzajv zzajvVar) {
        switch (zzajp.zza[zzanhVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzs());
            case 2:
                return zzp();
            case 3:
                return Double.valueOf(zza());
            case 4:
                return Integer.valueOf(zze());
            case 5:
                return Integer.valueOf(zzf());
            case 6:
                return Long.valueOf(zzk());
            case 7:
                return Float.valueOf(zzb());
            case 8:
                return Integer.valueOf(zzg());
            case 9:
                return Long.valueOf(zzl());
            case 10:
                zzb(2);
                return zzb(zzaly.zza().zza((Class) cls), zzajvVar);
            case 11:
                return Integer.valueOf(zzh());
            case 12:
                return Long.valueOf(zzm());
            case 13:
                return Integer.valueOf(zzi());
            case 14:
                return Long.valueOf(zzn());
            case 15:
                return zzr();
            case 16:
                return Integer.valueOf(zzj());
            case 17:
                return Long.valueOf(zzo());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private final void zza(int i10) {
        if (this.zza.zzc() != i10) {
            throw zzakm.zzj();
        }
    }

    private final void zza(List<String> list, boolean z10) {
        int zzi;
        int zzi2;
        if ((this.zzb & 7) != 2) {
            throw zzakm.zza();
        }
        if (!(list instanceof zzaku) || z10) {
            do {
                list.add(z10 ? zzr() : zzq());
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzaku zzakuVar = (zzaku) list;
        do {
            zzakuVar.zza(zzp());
            if (this.zza.zzw()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    private final <T> T zzb(zzamc<T> zzamcVar, zzajv zzajvVar) {
        T zza = zzamcVar.zza();
        zzd(zza, zzamcVar, zzajvVar);
        zzamcVar.zzd(zza);
        return zza;
    }

    private final void zzb(int i10) {
        if ((this.zzb & 7) != i10) {
            throw zzakm.zza();
        }
    }

    private static void zzc(int i10) {
        if ((i10 & 3) != 0) {
            throw zzakm.zzg();
        }
    }

    private final <T> void zzc(T t, zzamc<T> zzamcVar, zzajv zzajvVar) {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzamcVar.zza(t, this, zzajvVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzakm.zzg();
            }
        } finally {
            this.zzc = i10;
        }
    }

    private static void zzd(int i10) {
        if ((i10 & 7) != 0) {
            throw zzakm.zzg();
        }
    }

    private final <T> void zzd(T t, zzamc<T> zzamcVar, zzajv zzajvVar) {
        int zzj = this.zza.zzj();
        this.zza.zzt();
        int zzb = this.zza.zzb(zzj);
        this.zza.zza++;
        zzamcVar.zza(t, this, zzajvVar);
        this.zza.zzc(0);
        r4.zza--;
        this.zza.zzd(zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final double zza() {
        zzb(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final <T> void zza(T t, zzamc<T> zzamcVar, zzajv zzajvVar) {
        zzb(3);
        zzc(t, zzamcVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zza(List<Boolean> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzaiu)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzx()));
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi = this.zza.zzi();
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
                return;
            }
            if (i10 != 2) {
                throw zzakm.zza();
            }
            int zzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Boolean.valueOf(this.zza.zzx()));
            } while (this.zza.zzc() < zzc);
            zza(zzc);
            return;
        }
        zzaiu zzaiuVar = (zzaiu) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzaiuVar.zza(this.zza.zzx());
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        if (i11 != 2) {
            throw zzakm.zza();
        }
        int zzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzaiuVar.zza(this.zza.zzx());
        } while (this.zza.zzc() < zzc2);
        zza(zzc2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    @Deprecated
    public final <T> void zza(List<T> list, zzamc<T> zzamcVar, zzajv zzajvVar) {
        int zzi;
        int i10 = this.zzb;
        if ((i10 & 7) != 3) {
            throw zzakm.zza();
        }
        do {
            list.add(zza(zzamcVar, zzajvVar));
            if (this.zza.zzw() || this.zzd != 0) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == i10);
        this.zzd = zzi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005b, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0063, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.p002firebaseauthapi.zzale<K, V> r9, com.google.android.gms.internal.p002firebaseauthapi.zzajv r10) {
        /*
            r7 = this;
            r0 = 2
            r7.zzb(r0)
            com.google.android.gms.internal.firebase-auth-api.zzaji r1 = r7.zza
            int r1 = r1.zzj()
            com.google.android.gms.internal.firebase-auth-api.zzaji r2 = r7.zza
            int r1 = r2.zzb(r1)
            K r2 = r9.zzb
            V r3 = r9.zzd
        L14:
            int r4 = r7.zzc()     // Catch: java.lang.Throwable -> L64
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5b
            com.google.android.gms.internal.firebase-auth-api.zzaji r5 = r7.zza     // Catch: java.lang.Throwable -> L64
            boolean r5 = r5.zzw()     // Catch: java.lang.Throwable -> L64
            if (r5 != 0) goto L5b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L46
            if (r4 == r0) goto L39
            boolean r4 = r7.zzt()     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzakp -> L4e java.lang.Throwable -> L64
            if (r4 == 0) goto L33
            goto L14
        L33:
            com.google.android.gms.internal.firebase-auth-api.zzakm r4 = new com.google.android.gms.internal.firebase-auth-api.zzakm     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzakp -> L4e java.lang.Throwable -> L64
            r4.<init>(r6)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzakp -> L4e java.lang.Throwable -> L64
            throw r4     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzakp -> L4e java.lang.Throwable -> L64
        L39:
            com.google.android.gms.internal.firebase-auth-api.zzanh r4 = r9.zzc     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzakp -> L4e java.lang.Throwable -> L64
            V r5 = r9.zzd     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzakp -> L4e java.lang.Throwable -> L64
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzakp -> L4e java.lang.Throwable -> L64
            java.lang.Object r3 = r7.zza(r4, r5, r10)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzakp -> L4e java.lang.Throwable -> L64
            goto L14
        L46:
            com.google.android.gms.internal.firebase-auth-api.zzanh r4 = r9.zza     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzakp -> L4e java.lang.Throwable -> L64
            r5 = 0
            java.lang.Object r2 = r7.zza(r4, r5, r5)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzakp -> L4e java.lang.Throwable -> L64
            goto L14
        L4e:
            boolean r4 = r7.zzt()     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L55
            goto L14
        L55:
            com.google.android.gms.internal.firebase-auth-api.zzakm r8 = new com.google.android.gms.internal.firebase-auth-api.zzakm     // Catch: java.lang.Throwable -> L64
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L64
            throw r8     // Catch: java.lang.Throwable -> L64
        L5b:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.internal.firebase-auth-api.zzaji r8 = r7.zza
            r8.zzd(r1)
            return
        L64:
            r8 = move-exception
            com.google.android.gms.internal.firebase-auth-api.zzaji r9 = r7.zza
            r9.zzd(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzajm.zza(java.util.Map, com.google.android.gms.internal.firebase-auth-api.zzale, com.google.android.gms.internal.firebase-auth-api.zzajv):void");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final float zzb() {
        zzb(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final <T> void zzb(T t, zzamc<T> zzamcVar, zzajv zzajvVar) {
        zzb(2);
        zzd(t, zzamcVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzb(List<zzaiw> list) {
        int zzi;
        if ((this.zzb & 7) != 2) {
            throw zzakm.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzw()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final <T> void zzb(List<T> list, zzamc<T> zzamcVar, zzajv zzajvVar) {
        int zzi;
        int i10 = this.zzb;
        if ((i10 & 7) != 2) {
            throw zzakm.zza();
        }
        do {
            list.add(zzb(zzamcVar, zzajvVar));
            if (this.zza.zzw() || this.zzd != 0) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == i10);
        this.zzd = zzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final int zzc() {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zzi();
        }
        int i11 = this.zzb;
        if (i11 == 0 || i11 == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzc(List<Double> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzajt)) {
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi = this.zza.zzi();
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
                return;
            }
            if (i10 != 2) {
                throw zzakm.zza();
            }
            int zzj = this.zza.zzj();
            zzd(zzj);
            int zzc = this.zza.zzc() + zzj;
            do {
                list.add(Double.valueOf(this.zza.zza()));
            } while (this.zza.zzc() < zzc);
            return;
        }
        zzajt zzajtVar = (zzajt) list;
        int i11 = this.zzb & 7;
        if (i11 == 1) {
            do {
                zzajtVar.zza(this.zza.zza());
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        if (i11 != 2) {
            throw zzakm.zza();
        }
        int zzj2 = this.zza.zzj();
        zzd(zzj2);
        int zzc2 = this.zza.zzc() + zzj2;
        do {
            zzajtVar.zza(this.zza.zza());
        } while (this.zza.zzc() < zzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzd(List<Integer> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzakj)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzd()));
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi = this.zza.zzi();
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
                return;
            }
            if (i10 != 2) {
                throw zzakm.zza();
            }
            int zzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzd()));
            } while (this.zza.zzc() < zzc);
            zza(zzc);
            return;
        }
        zzakj zzakjVar = (zzakj) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzakjVar.zzc(this.zza.zzd());
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        if (i11 != 2) {
            throw zzakm.zza();
        }
        int zzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzakjVar.zzc(this.zza.zzd());
        } while (this.zza.zzc() < zzc2);
        zza(zzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final int zze() {
        zzb(0);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zze(List<Integer> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzakj)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i10 != 5) {
                throw zzakm.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzakj zzakjVar = (zzakj) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int zzj2 = this.zza.zzj();
            zzc(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                zzakjVar.zzc(this.zza.zze());
            } while (this.zza.zzc() < zzc2);
            return;
        }
        if (i11 != 5) {
            throw zzakm.zza();
        }
        do {
            zzakjVar.zzc(this.zza.zze());
            if (this.zza.zzw()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final int zzf() {
        zzb(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzf(List<Long> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzaky)) {
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzk()));
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi = this.zza.zzi();
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
                return;
            }
            if (i10 != 2) {
                throw zzakm.zza();
            }
            int zzj = this.zza.zzj();
            zzd(zzj);
            int zzc = this.zza.zzc() + zzj;
            do {
                list.add(Long.valueOf(this.zza.zzk()));
            } while (this.zza.zzc() < zzc);
            return;
        }
        zzaky zzakyVar = (zzaky) list;
        int i11 = this.zzb & 7;
        if (i11 == 1) {
            do {
                zzakyVar.zza(this.zza.zzk());
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        if (i11 != 2) {
            throw zzakm.zza();
        }
        int zzj2 = this.zza.zzj();
        zzd(zzj2);
        int zzc2 = this.zza.zzc() + zzj2;
        do {
            zzakyVar.zza(this.zza.zzk());
        } while (this.zza.zzc() < zzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final int zzg() {
        zzb(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzg(List<Float> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzake)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i10 != 5) {
                throw zzakm.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzake zzakeVar = (zzake) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int zzj2 = this.zza.zzj();
            zzc(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                zzakeVar.zza(this.zza.zzb());
            } while (this.zza.zzc() < zzc2);
            return;
        }
        if (i11 != 5) {
            throw zzakm.zza();
        }
        do {
            zzakeVar.zza(this.zza.zzb());
            if (this.zza.zzw()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final int zzh() {
        zzb(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzh(List<Integer> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzakj)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi = this.zza.zzi();
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
                return;
            }
            if (i10 != 2) {
                throw zzakm.zza();
            }
            int zzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
            } while (this.zza.zzc() < zzc);
            zza(zzc);
            return;
        }
        zzakj zzakjVar = (zzakj) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzakjVar.zzc(this.zza.zzf());
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        if (i11 != 2) {
            throw zzakm.zza();
        }
        int zzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzakjVar.zzc(this.zza.zzf());
        } while (this.zza.zzc() < zzc2);
        zza(zzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final int zzi() {
        zzb(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzi(List<Long> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzaky)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzl()));
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi = this.zza.zzi();
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
                return;
            }
            if (i10 != 2) {
                throw zzakm.zza();
            }
            int zzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzl()));
            } while (this.zza.zzc() < zzc);
            zza(zzc);
            return;
        }
        zzaky zzakyVar = (zzaky) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzakyVar.zza(this.zza.zzl());
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        if (i11 != 2) {
            throw zzakm.zza();
        }
        int zzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzakyVar.zza(this.zza.zzl());
        } while (this.zza.zzc() < zzc2);
        zza(zzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final int zzj() {
        zzb(0);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzj(List<Integer> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzakj)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i10 != 5) {
                throw zzakm.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzakj zzakjVar = (zzakj) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int zzj2 = this.zza.zzj();
            zzc(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                zzakjVar.zzc(this.zza.zzg());
            } while (this.zza.zzc() < zzc2);
            return;
        }
        if (i11 != 5) {
            throw zzakm.zza();
        }
        do {
            zzakjVar.zzc(this.zza.zzg());
            if (this.zza.zzw()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final long zzk() {
        zzb(1);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzk(List<Long> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzaky)) {
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi = this.zza.zzi();
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
                return;
            }
            if (i10 != 2) {
                throw zzakm.zza();
            }
            int zzj = this.zza.zzj();
            zzd(zzj);
            int zzc = this.zza.zzc() + zzj;
            do {
                list.add(Long.valueOf(this.zza.zzn()));
            } while (this.zza.zzc() < zzc);
            return;
        }
        zzaky zzakyVar = (zzaky) list;
        int i11 = this.zzb & 7;
        if (i11 == 1) {
            do {
                zzakyVar.zza(this.zza.zzn());
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        if (i11 != 2) {
            throw zzakm.zza();
        }
        int zzj2 = this.zza.zzj();
        zzd(zzj2);
        int zzc2 = this.zza.zzc() + zzj2;
        do {
            zzakyVar.zza(this.zza.zzn());
        } while (this.zza.zzc() < zzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final long zzl() {
        zzb(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzl(List<Integer> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzakj)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi = this.zza.zzi();
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
                return;
            }
            if (i10 != 2) {
                throw zzakm.zza();
            }
            int zzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
            } while (this.zza.zzc() < zzc);
            zza(zzc);
            return;
        }
        zzakj zzakjVar = (zzakj) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzakjVar.zzc(this.zza.zzh());
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        if (i11 != 2) {
            throw zzakm.zza();
        }
        int zzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzakjVar.zzc(this.zza.zzh());
        } while (this.zza.zzc() < zzc2);
        zza(zzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final long zzm() {
        zzb(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzm(List<Long> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzaky)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi = this.zza.zzi();
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
                return;
            }
            if (i10 != 2) {
                throw zzakm.zza();
            }
            int zzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzo()));
            } while (this.zza.zzc() < zzc);
            zza(zzc);
            return;
        }
        zzaky zzakyVar = (zzaky) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzakyVar.zza(this.zza.zzo());
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        if (i11 != 2) {
            throw zzakm.zza();
        }
        int zzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzakyVar.zza(this.zza.zzo());
        } while (this.zza.zzc() < zzc2);
        zza(zzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final long zzn() {
        zzb(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzn(List<String> list) {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final long zzo() {
        zzb(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzo(List<String> list) {
        zza(list, true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final zzaiw zzp() {
        zzb(2);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzp(List<Integer> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzakj)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi = this.zza.zzi();
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
                return;
            }
            if (i10 != 2) {
                throw zzakm.zza();
            }
            int zzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
            } while (this.zza.zzc() < zzc);
            zza(zzc);
            return;
        }
        zzakj zzakjVar = (zzakj) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzakjVar.zzc(this.zza.zzj());
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        if (i11 != 2) {
            throw zzakm.zza();
        }
        int zzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzakjVar.zzc(this.zza.zzj());
        } while (this.zza.zzc() < zzc2);
        zza(zzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final String zzq() {
        zzb(2);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzq(List<Long> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzaky)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi = this.zza.zzi();
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
                return;
            }
            if (i10 != 2) {
                throw zzakm.zza();
            }
            int zzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzp()));
            } while (this.zza.zzc() < zzc);
            zza(zzc);
            return;
        }
        zzaky zzakyVar = (zzaky) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzakyVar.zza(this.zza.zzp());
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        if (i11 != 2) {
            throw zzakm.zza();
        }
        int zzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzakyVar.zza(this.zza.zzp());
        } while (this.zza.zzc() < zzc2);
        zza(zzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final String zzr() {
        zzb(2);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final boolean zzs() {
        zzb(0);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final boolean zzt() {
        int i10;
        if (this.zza.zzw() || (i10 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zze(i10);
    }
}
