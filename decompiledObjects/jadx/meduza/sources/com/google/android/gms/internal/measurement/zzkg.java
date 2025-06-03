package com.google.android.gms.internal.measurement;

import a0.j;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class zzkg<MessageType extends zzkg<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzio<MessageType, BuilderType> {
    private static Map<Class<?>, zzkg<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    public zzmx zzb = zzmx.zzc();

    public static abstract class zza<MessageType extends zzkg<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzin<MessageType, BuilderType> {
        public MessageType zza;
        private final MessageType zzb;

        public zza(MessageType messagetype) {
            this.zzb = messagetype;
            if (messagetype.zzcq()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.zza = (MessageType) messagetype.zzci();
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzma.zza().zza((zzma) messagetype).zza(messagetype, messagetype2);
        }

        private final BuilderType zzb(byte[] bArr, int i10, int i11, zzjt zzjtVar) {
            if (!this.zza.zzcq()) {
                zzan();
            }
            try {
                zzma.zza().zza((zzma) this.zza).zza(this.zza, bArr, 0, i11, new zzit(zzjtVar));
                return this;
            } catch (zzkp e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            } catch (IndexOutOfBoundsException unused) {
                throw zzkp.zzi();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.internal.measurement.zzin
        /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
        public final BuilderType zzb(zzjk zzjkVar, zzjt zzjtVar) {
            if (!this.zza.zzcq()) {
                zzan();
            }
            try {
                zzma.zza().zza((zzma) this.zza).zza(this.zza, zzjl.zza(zzjkVar), zzjtVar);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzin
        public /* synthetic */ Object clone() {
            zza zzaVar = (zza) this.zzb.zza(zzf.zze, null, null);
            zzaVar.zza = (MessageType) zzak();
            return zzaVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzlo
        public final boolean j_() {
            return zzkg.zza((zzkg) this.zza, false);
        }

        @Override // com.google.android.gms.internal.measurement.zzin
        /* renamed from: zza */
        public final /* synthetic */ zzin zzb(zzjk zzjkVar, zzjt zzjtVar) {
            return (zza) zzb(zzjkVar, zzjtVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzin
        public final /* synthetic */ zzin zza(byte[] bArr, int i10, int i11) {
            return zzb(bArr, 0, i11, zzjt.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzin
        public final /* synthetic */ zzin zza(byte[] bArr, int i10, int i11, zzjt zzjtVar) {
            return zzb(bArr, 0, i11, zzjtVar);
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzcq()) {
                zzan();
            }
            zza(this.zza, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.measurement.zzin
        /* renamed from: zzag */
        public final /* synthetic */ zzin clone() {
            return (zza) clone();
        }

        @Override // com.google.android.gms.internal.measurement.zzlp
        /* renamed from: zzah, reason: merged with bridge method [inline-methods] */
        public final MessageType zzaj() {
            MessageType messagetype = (MessageType) zzak();
            if (messagetype.j_()) {
                return messagetype;
            }
            throw new zzmv(messagetype);
        }

        @Override // com.google.android.gms.internal.measurement.zzlp
        /* renamed from: zzai, reason: merged with bridge method [inline-methods] */
        public MessageType zzak() {
            if (!this.zza.zzcq()) {
                return this.zza;
            }
            this.zza.zzco();
            return this.zza;
        }

        @Override // com.google.android.gms.internal.measurement.zzlo
        public final /* synthetic */ zzlm zzal() {
            return this.zzb;
        }

        public final void zzam() {
            if (this.zza.zzcq()) {
                return;
            }
            zzan();
        }

        public void zzan() {
            MessageType messagetype = (MessageType) this.zzb.zzci();
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }
    }

    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzkg<MessageType, BuilderType> implements zzlo {
        public zzjw<zze> zzc = zzjw.zzb();

        public final zzjw<zze> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzjw) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public static class zzc<T extends zzkg<T, ?>> extends zzip<T> {
        public zzc(T t) {
        }
    }

    public static class zzd<ContainingType extends zzlm, Type> extends zzjr<ContainingType, Type> {
    }

    public static final class zze implements zzjy<zze> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjy
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjy
        public final zzlp zza(zzlp zzlpVar, zzlm zzlmVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjy
        public final zzlv zza(zzlv zzlvVar, zzlv zzlvVar2) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjy
        public final zzng zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjy
        public final zznj zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjy
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjy
        public final boolean zze() {
            throw new NoSuchMethodError();
        }
    }

    public enum zzf {
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

    private final int zza() {
        return zzma.zza().zza((zzma) this).zzb(this);
    }

    public static <T extends zzkg<?, ?>> T zza(Class<T> cls) {
        zzkg<?, ?> zzkgVar = zzc.get(cls);
        if (zzkgVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzkgVar = zzc.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzkgVar == null) {
            zzkgVar = (T) ((zzkg) zzmz.zza(cls)).zza(zzf.zzf, (Object) null, (Object) null);
            if (zzkgVar == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, zzkgVar);
        }
        return (T) zzkgVar;
    }

    public static <E> zzkm<E> zza(zzkm<E> zzkmVar) {
        return zzkmVar.zza(zzkmVar.size() << 1);
    }

    public static zzkn zza(zzkn zzknVar) {
        return zzknVar.zza(zzknVar.size() << 1);
    }

    public static Object zza(zzlm zzlmVar, String str, Object[] objArr) {
        return new zzmc(zzlmVar, str, objArr);
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

    public static <T extends zzkg<?, ?>> void zza(Class<T> cls, T t) {
        t.zzcp();
        zzc.put(cls, t);
    }

    public static /* synthetic */ boolean zza(zzkg zzkgVar, boolean z10) {
        return zzb(zzkgVar, false);
    }

    private final int zzb(zzme<?> zzmeVar) {
        return zzmeVar == null ? zzma.zza().zza((zzma) this).zza(this) : zzmeVar.zza(this);
    }

    private static final <T extends zzkg<T, ?>> boolean zzb(T t, boolean z10) {
        byte byteValue = ((Byte) t.zza(zzf.zza, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zze2 = zzma.zza().zza((zzma) t).zze(t);
        if (z10) {
            t.zza(zzf.zzb, zze2 ? t : null, null);
        }
        return zze2;
    }

    public static zzkk zzcj() {
        return zzkh.zzd();
    }

    public static zzkn zzck() {
        return zzlb.zzd();
    }

    public static <E> zzkm<E> zzcl() {
        return zzmd.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzma.zza().zza((zzma) this).zzb(this, (zzkg) obj);
        }
        return false;
    }

    public int hashCode() {
        if (zzcq()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzlo
    public final boolean j_() {
        return zzb(this, true);
    }

    public String toString() {
        return zzlr.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final int zza(zzme zzmeVar) {
        if (zzcq()) {
            int zzb2 = zzb(zzmeVar);
            if (zzb2 >= 0) {
                return zzb2;
            }
            throw new IllegalStateException(j.g("serialized size must be non-negative, was ", zzb2));
        }
        if (zzcc() != Integer.MAX_VALUE) {
            return zzcc();
        }
        int zzb3 = zzb(zzmeVar);
        zzc(zzb3);
        return zzb3;
    }

    public final <MessageType extends zzkg<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zza(MessageType messagetype) {
        return (BuilderType) zzcg().zza(messagetype);
    }

    public abstract Object zza(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zza(zzjn zzjnVar) {
        zzma.zza().zza((zzma) this).zza((zzme) this, (zznl) zzjp.zza(zzjnVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzlo
    public final /* synthetic */ zzlm zzal() {
        return (zzkg) zza(zzf.zzf, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    final void zzc(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(j.g("serialized size must be non-negative, was ", i10));
        }
        this.zzd = (i10 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final int zzcc() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final int zzcf() {
        return zza((zzme) null);
    }

    public final <MessageType extends zzkg<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzcg() {
        return (BuilderType) zza(zzf.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzch() {
        return (BuilderType) ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza((zza) this);
    }

    public final MessageType zzci() {
        return (MessageType) zza(zzf.zzd, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final /* synthetic */ zzlp zzcm() {
        return (zza) zza(zzf.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final /* synthetic */ zzlp zzcn() {
        return ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza((zza) this);
    }

    public final void zzco() {
        zzma.zza().zza((zzma) this).zzd(this);
        zzcp();
    }

    public final void zzcp() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean zzcq() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }
}
