package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.g;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class zzaiw implements Serializable, Iterable<Byte> {
    public static final zzaiw zza = new zzajh(zzaki.zzb);
    private static final zzajd zzb = new zzajg();
    private int zzc = 0;

    static {
        new zzaiy();
    }

    public static /* synthetic */ int zza(byte b10) {
        return b10 & 255;
    }

    public static int zza(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 >= 0) {
            if (i11 < i10) {
                throw new IndexOutOfBoundsException(g.c("Beginning index larger than ending index: ", i10, ", ", i11));
            }
            throw new IndexOutOfBoundsException(g.c("End index: ", i11, " >= ", i12));
        }
        throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
    }

    public static zzaiw zza(String str) {
        return new zzajh(str.getBytes(zzaki.zza));
    }

    public static zzaiw zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzaiw zza(byte[] bArr, int i10, int i11) {
        zza(i10, i10 + i11, bArr.length);
        return new zzajh(zzb.zza(bArr, i10, i11));
    }

    public static zzaiw zzb(byte[] bArr) {
        return new zzajh(bArr);
    }

    public static zzajf zzc(int i10) {
        return new zzajf(i10);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zzc;
        if (i10 == 0) {
            int zzb2 = zzb();
            i10 = zzb(zzb2, 0, zzb2);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zzc = i10;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzaiz(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzb());
        objArr[2] = zzb() <= 50 ? zzamo.zza(this) : g.d(zzamo.zza(zza(0, 47)), "...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i10);

    public final int zza() {
        return this.zzc;
    }

    public abstract zzaiw zza(int i10, int i11);

    public abstract void zza(zzaix zzaixVar);

    public abstract void zza(byte[] bArr, int i10, int i11, int i12);

    public abstract byte zzb(int i10);

    public abstract int zzb();

    public abstract int zzb(int i10, int i11, int i12);

    public abstract zzaji zzc();

    public final byte[] zzd() {
        int zzb2 = zzb();
        if (zzb2 == 0) {
            return zzaki.zzb;
        }
        byte[] bArr = new byte[zzb2];
        zza(bArr, 0, 0, zzb2);
        return bArr;
    }
}
