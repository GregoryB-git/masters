package com.google.android.gms.internal.p002firebaseauthapi;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzakg.zzb;
import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class zzakg<MessageType extends zzakg<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzain<MessageType, BuilderType> {
    private static Map<Class<?>, zzakg<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    public zzamy zzb = zzamy.zzc();

    public static class zza<T extends zzakg<T, ?>> extends zzair<T> {
        public zza(T t) {
        }
    }

    public static abstract class zzb<MessageType extends zzakg<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzaip<MessageType, BuilderType> {
        public MessageType zza;
        private final MessageType zzb;

        public zzb(MessageType messagetype) {
            this.zzb = messagetype;
            if (messagetype.zzw()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.zza = (MessageType) messagetype.zzo();
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzaly.zza().zza((zzaly) messagetype).zza(messagetype, messagetype2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
        public /* synthetic */ Object clone() {
            zzb zzbVar = (zzb) this.zzb.zza(zze.zze, null, null);
            zzbVar.zza = (MessageType) zzf();
            return zzbVar;
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzw()) {
                zzh();
            }
            zza(this.zza, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
        /* renamed from: zzb */
        public final /* synthetic */ zzaip clone() {
            return (zzb) clone();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalm
        /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
        public final MessageType zze() {
            MessageType messagetype = (MessageType) zzf();
            if (messagetype.zzv()) {
                return messagetype;
            }
            throw new zzamw(messagetype);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalm
        /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
        public MessageType zzf() {
            if (!this.zza.zzw()) {
                return this.zza;
            }
            this.zza.zzt();
            return this.zza;
        }

        public final void zzg() {
            if (this.zza.zzw()) {
                return;
            }
            zzh();
        }

        public void zzh() {
            MessageType messagetype = (MessageType) this.zzb.zzo();
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalp
        public final /* synthetic */ zzaln zzs() {
            return this.zzb;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalp
        public final boolean zzv() {
            return zzakg.zza((zzakg) this.zza, false);
        }
    }

    public static final class zzc implements zzaka<zzc> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
        public final zzalm zza(zzalm zzalmVar, zzaln zzalnVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
        public final zzals zza(zzals zzalsVar, zzals zzalsVar2) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
        public final zzanh zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
        public final zzank zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
        public final boolean zze() {
            throw new NoSuchMethodError();
        }
    }

    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzakg<MessageType, BuilderType> implements zzalp {
        public zzajy<zzc> zzc = zzajy.zzb();

        public final zzajy<zzc> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzajy) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public enum zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    public static class zzf<ContainingType extends zzaln, Type> extends zzajs<ContainingType, Type> {
    }

    private final int zza() {
        return zzaly.zza().zza((zzaly) this).zzb(this);
    }

    private static <T extends zzakg<T, ?>> T zza(T t) {
        if (t == null || zzb(t, true)) {
            return t;
        }
        zzakm zza2 = new zzamw(t).zza();
        zza2.getClass();
        throw zza2;
    }

    public static <T extends zzakg<T, ?>> T zza(T t, zzaiw zzaiwVar, zzajv zzajvVar) {
        return (T) zza(zzb(t, zzaiwVar, zzajvVar));
    }

    private static <T extends zzakg<T, ?>> T zza(T t, zzaji zzajiVar, zzajv zzajvVar) {
        T t10 = (T) t.zzo();
        try {
            zzamc zza2 = zzaly.zza().zza((zzaly) t10);
            zza2.zza(t10, zzajm.zza(zzajiVar), zzajvVar);
            zza2.zzd(t10);
            return t10;
        } catch (zzakm e10) {
            if (e10.zzl()) {
                throw new zzakm(e10);
            }
            throw e10;
        } catch (zzamw e11) {
            zzakm zza3 = e11.zza();
            zza3.getClass();
            throw zza3;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzakm) {
                throw ((zzakm) e12.getCause());
            }
            throw new zzakm(e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzakm) {
                throw ((zzakm) e13.getCause());
            }
            throw e13;
        }
    }

    public static <T extends zzakg<T, ?>> T zza(T t, InputStream inputStream, zzajv zzajvVar) {
        zzaji zzajkVar;
        if (inputStream == null) {
            byte[] bArr = zzaki.zzb;
            zzajkVar = zzaji.zza(bArr, 0, bArr.length, false);
        } else {
            zzajkVar = new zzajk(inputStream);
        }
        return (T) zza(zza(t, zzajkVar, zzajvVar));
    }

    private static <T extends zzakg<T, ?>> T zza(T t, byte[] bArr, int i10, int i11, zzajv zzajvVar) {
        if (i11 == 0) {
            return t;
        }
        T t10 = (T) t.zzo();
        try {
            zzamc zza2 = zzaly.zza().zza((zzaly) t10);
            zza2.zza(t10, bArr, 0, i11, new zzaiv(zzajvVar));
            zza2.zzd(t10);
            return t10;
        } catch (zzakm e10) {
            if (e10.zzl()) {
                throw new zzakm(e10);
            }
            throw e10;
        } catch (zzamw e11) {
            zzakm zza3 = e11.zza();
            zza3.getClass();
            throw zza3;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzakm) {
                throw ((zzakm) e12.getCause());
            }
            throw new zzakm(e12);
        } catch (IndexOutOfBoundsException unused) {
            zzakm zzj = zzakm.zzj();
            zzj.getClass();
            throw zzj;
        }
    }

    public static <T extends zzakg<T, ?>> T zza(T t, byte[] bArr, zzajv zzajvVar) {
        return (T) zza(zza(t, bArr, 0, bArr.length, zzajvVar));
    }

    public static <T extends zzakg<?, ?>> T zza(Class<T> cls) {
        zzakg<?, ?> zzakgVar = zzc.get(cls);
        if (zzakgVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzakgVar = zzc.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzakgVar == null) {
            zzakgVar = (T) ((zzakg) zzana.zza(cls)).zza(zze.zzf, (Object) null, (Object) null);
            if (zzakgVar == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, zzakgVar);
        }
        return (T) zzakgVar;
    }

    public static <E> zzakn<E> zza(zzakn<E> zzaknVar) {
        return zzaknVar.zza(zzaknVar.size() << 1);
    }

    public static Object zza(zzaln zzalnVar, String str, Object[] objArr) {
        return new zzama(zzalnVar, str, objArr);
    }

    static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static <T extends zzakg<?, ?>> void zza(Class<T> cls, T t) {
        t.zzu();
        zzc.put(cls, t);
    }

    public static /* synthetic */ boolean zza(zzakg zzakgVar, boolean z10) {
        return zzb(zzakgVar, false);
    }

    private final int zzb(zzamc<?> zzamcVar) {
        return zzamcVar == null ? zzaly.zza().zza((zzaly) this).zza(this) : zzamcVar.zza(this);
    }

    private static <T extends zzakg<T, ?>> T zzb(T t, zzaiw zzaiwVar, zzajv zzajvVar) {
        zzaji zzc2 = zzaiwVar.zzc();
        T t10 = (T) zza(t, zzc2, zzajvVar);
        try {
            zzc2.zzc(0);
            return t10;
        } catch (zzakm e10) {
            throw e10;
        }
    }

    private static final <T extends zzakg<T, ?>> boolean zzb(T t, boolean z10) {
        byte byteValue = ((Byte) t.zza(zze.zza, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zze2 = zzaly.zza().zza((zzaly) t).zze(t);
        if (z10) {
            t.zza(zze.zzb, zze2 ? t : null, null);
        }
        return zze2;
    }

    public static <E> zzakn<E> zzp() {
        return zzamb.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzaly.zza().zza((zzaly) this).zzb(this, (zzakg) obj);
        }
        return false;
    }

    public int hashCode() {
        if (zzw()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzalo.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzain
    public final int zza(zzamc zzamcVar) {
        if (zzw()) {
            int zzb2 = zzb((zzamc<?>) zzamcVar);
            if (zzb2 >= 0) {
                return zzb2;
            }
            throw new IllegalStateException(j.g("serialized size must be non-negative, was ", zzb2));
        }
        if (zzi() != Integer.MAX_VALUE) {
            return zzi();
        }
        int zzb3 = zzb((zzamc<?>) zzamcVar);
        zzb(zzb3);
        return zzb3;
    }

    public abstract Object zza(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaln
    public final void zza(zzajo zzajoVar) {
        zzaly.zza().zza((zzaly) this).zza((zzamc) this, (zzanm) zzajq.zza(zzajoVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzain
    final void zzb(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(j.g("serialized size must be non-negative, was ", i10));
        }
        this.zzd = (i10 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzain
    final int zzi() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaln
    public final int zzl() {
        return zza((zzamc) null);
    }

    public final <MessageType extends zzakg<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzm() {
        return (BuilderType) zza(zze.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzn() {
        return (BuilderType) ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    public final MessageType zzo() {
        return (MessageType) zza(zze.zzd, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaln
    public final /* synthetic */ zzalm zzq() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaln
    public final /* synthetic */ zzalm zzr() {
        return ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalp
    public final /* synthetic */ zzaln zzs() {
        return (zzakg) zza(zze.zzf, (Object) null, (Object) null);
    }

    public final void zzt() {
        zzaly.zza().zza((zzaly) this).zzd(this);
        zzu();
    }

    public final void zzu() {
        this.zzd &= Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalp
    public final boolean zzv() {
        return zzb(this, true);
    }

    public final boolean zzw() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }
}
