package com.google.android.gms.internal.fido;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzag {
    private final String zza = ",\n  ";

    private zzag(String str) {
    }

    public static zzag zza(String str) {
        return new zzag(",\n  ");
    }

    public static final CharSequence zzd(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final Appendable zzb(Appendable appendable, Iterator it) {
        if (it.hasNext()) {
            while (true) {
                appendable.append(zzd(it.next()));
                if (!it.hasNext()) {
                    break;
                }
                appendable.append(this.zza);
            }
        }
        return appendable;
    }
}
