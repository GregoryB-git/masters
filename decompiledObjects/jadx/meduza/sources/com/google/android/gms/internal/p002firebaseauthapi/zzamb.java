package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.g;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzamb<E> extends zzaiq<E> implements RandomAccess {
    private static final Object[] zza;
    private static final zzamb<Object> zzb;
    private E[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzamb<>(objArr, 0, false);
    }

    public zzamb() {
        this(zza, 0, true);
    }

    private zzamb(E[] eArr, int i10, boolean z10) {
        super(z10);
        this.zzc = eArr;
        this.zzd = i10;
    }

    private static int zzb(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String zzc(int i10) {
        return g.c("Index:", i10, ", Size:", this.zzd);
    }

    public static <E> zzamb<E> zzd() {
        return (zzamb<E>) zzb;
    }

    private final void zzd(int i10) {
        if (i10 < 0 || i10 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzc(i10));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11;
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzc(i10));
        }
        E[] eArr = this.zzc;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = (E[]) new Object[zzb(eArr.length)];
            System.arraycopy(this.zzc, 0, eArr2, 0, i10);
            System.arraycopy(this.zzc, i10, eArr2, i10 + 1, this.zzd - i10);
            this.zzc = eArr2;
        }
        this.zzc[i10] = e10;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        zza();
        int i10 = this.zzd;
        E[] eArr = this.zzc;
        if (i10 == eArr.length) {
            this.zzc = (E[]) Arrays.copyOf(this.zzc, zzb(eArr.length));
        }
        E[] eArr2 = this.zzc;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        zzd(i10);
        return this.zzc[i10];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        zza();
        zzd(i10);
        E[] eArr = this.zzc;
        E e10 = eArr[i10];
        if (i10 < this.zzd - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (r2 - i10) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        zza();
        zzd(i10);
        E[] eArr = this.zzc;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
    public final /* synthetic */ zzakn zza(int i10) {
        if (i10 >= this.zzd) {
            return new zzamb(i10 == 0 ? zza : Arrays.copyOf(this.zzc, i10), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }
}
