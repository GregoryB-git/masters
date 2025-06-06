package com.google.android.gms.internal.fido;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzaf {
    public static final Appendable zza(Appendable appendable, Iterator it, zzag zzagVar, String str) {
        String str2;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            appendable.append(zzag.zzd(entry.getKey()));
            while (true) {
                appendable.append(" : ");
                appendable.append(zzag.zzd(entry.getValue()));
                if (!it.hasNext()) {
                    break;
                }
                str2 = zzagVar.zza;
                appendable.append(str2);
                entry = (Map.Entry) it.next();
                appendable.append(zzag.zzd(entry.getKey()));
            }
        }
        return appendable;
    }
}
