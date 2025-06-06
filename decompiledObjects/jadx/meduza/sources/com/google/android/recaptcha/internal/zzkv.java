package com.google.android.recaptcha.internal;

import defpackage.f;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzkv extends zzkr implements RandomAccess, zzor {
    private static final boolean[] zza;
    private boolean[] zzb;
    private int zzc;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        new zzkv(zArr, 0, false);
    }

    public zzkv() {
        this(zza, 0, true);
    }

    private zzkv(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.zzb = zArr;
        this.zzc = i10;
    }

    private static int zzg(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String zzh(int i10) {
        return f.i("Index:", i10, ", Size:", this.zzc);
    }

    private final void zzi(int i10) {
        if (i10 < 0 || i10 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzh(i10));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzh(i10));
        }
        int i12 = i10 + 1;
        boolean[] zArr = this.zzb;
        int length = zArr.length;
        if (i11 < length) {
            System.arraycopy(zArr, i10, zArr, i12, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[zzg(length)];
            System.arraycopy(this.zzb, 0, zArr2, 0, i10);
            System.arraycopy(this.zzb, i10, zArr2, i12, this.zzc - i10);
            this.zzb = zArr2;
        }
        this.zzb[i10] = booleanValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = zznl.zza;
        collection.getClass();
        if (!(collection instanceof zzkv)) {
            return super.addAll(collection);
        }
        zzkv zzkvVar = (zzkv) collection;
        int i10 = zzkvVar.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.zzb;
        if (i12 > zArr.length) {
            this.zzb = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(zzkvVar.zzb, 0, this.zzb, this.zzc, zzkvVar.zzc);
        this.zzc = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkv)) {
            return super.equals(obj);
        }
        zzkv zzkvVar = (zzkv) obj;
        if (this.zzc != zzkvVar.zzc) {
            return false;
        }
        boolean[] zArr = zzkvVar.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (this.zzb[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzi(i10);
        return Boolean.valueOf(this.zzb[i10]);
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            i10 = (i10 * 31) + zznl.zza(this.zzb[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.zzc;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzb[i11] == booleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        zzi(i10);
        boolean[] zArr = this.zzb;
        boolean z10 = zArr[i10];
        if (i10 < this.zzc - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        zza();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i11, zArr, i10, this.zzc - i11);
        this.zzc -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzi(i10);
        boolean[] zArr = this.zzb;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zznk
    public final /* bridge */ /* synthetic */ zznk zzd(int i10) {
        if (i10 >= this.zzc) {
            return new zzkv(i10 == 0 ? zza : Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z10) {
        zza();
        int i10 = this.zzc;
        int length = this.zzb.length;
        if (i10 == length) {
            boolean[] zArr = new boolean[zzg(length)];
            System.arraycopy(this.zzb, 0, zArr, 0, this.zzc);
            this.zzb = zArr;
        }
        boolean[] zArr2 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        zArr2[i11] = z10;
    }

    public final boolean zzf(int i10) {
        zzi(i10);
        return this.zzb[i10];
    }
}
