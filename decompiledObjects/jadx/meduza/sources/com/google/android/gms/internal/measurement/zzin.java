package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.internal.measurement.zzio;
import defpackage.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class zzin<MessageType extends zzio<MessageType, BuilderType>, BuilderType extends zzin<MessageType, BuilderType>> implements zzlp {
    private final String zza(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    public static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zziy zziyVar;
        zzkj.zza(iterable);
        if (iterable instanceof zzkx) {
            List<?> zza = ((zzkx) iterable).zza();
            zzkx zzkxVar = (zzkx) list;
            int size = list.size();
            for (Object obj : zza) {
                if (obj == null) {
                    String str = "Element at index " + (zzkxVar.size() - size) + " is null.";
                    for (int size2 = zzkxVar.size() - 1; size2 >= size; size2--) {
                        zzkxVar.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof zziy) {
                    zziyVar = (zziy) obj;
                } else if (obj instanceof byte[]) {
                    zziyVar = zziy.zza((byte[]) obj);
                } else {
                    zzkxVar.add((String) obj);
                }
                zzkxVar.zza(zziyVar);
            }
            return;
        }
        if (iterable instanceof zzly) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            } else if (list instanceof zzmd) {
                ((zzmd) list).zzb(list.size() + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    zza(list, size4);
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size5 = list2.size();
        for (int i10 = 0; i10 < size5; i10++) {
            a aVar = (Object) list2.get(i10);
            if (aVar == null) {
                zza(list, size4);
            }
            list.add(aVar);
        }
    }

    private static void zza(List<?> list, int i10) {
        String str = "Element at index " + (list.size() - i10) + " is null.";
        for (int size = list.size() - 1; size >= i10; size--) {
            list.remove(size);
        }
        throw new NullPointerException(str);
    }

    @Override // 
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzb(zzjk zzjkVar, zzjt zzjtVar);

    public BuilderType zza(byte[] bArr, int i10, int i11) {
        try {
            zzjk zza = zzjk.zza(bArr, 0, i11, false);
            zzb(zza, zzjt.zza);
            zza.zzb(0);
            return this;
        } catch (zzkp e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("byte array"), e11);
        }
    }

    public BuilderType zza(byte[] bArr, int i10, int i11, zzjt zzjtVar) {
        try {
            zzjk zza = zzjk.zza(bArr, 0, i11, false);
            zzb(zza, zzjtVar);
            zza.zzb(0);
            return this;
        } catch (zzkp e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("byte array"), e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlp
    public final /* synthetic */ zzlp zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzlp
    public final /* synthetic */ zzlp zza(byte[] bArr, zzjt zzjtVar) {
        return zza(bArr, 0, bArr.length, zzjtVar);
    }

    @Override // 
    /* renamed from: zzag, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();
}
