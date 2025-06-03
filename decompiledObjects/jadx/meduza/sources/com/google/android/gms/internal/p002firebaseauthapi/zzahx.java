package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v6.g;

/* loaded from: classes.dex */
public final class zzahx {
    private List<String> zza;

    public zzahx() {
        this(null);
    }

    public zzahx(int i10, List<String> list) {
        List<String> emptyList;
        if (list == null || list.isEmpty()) {
            emptyList = Collections.emptyList();
        } else {
            for (int i11 = 0; i11 < list.size(); i11++) {
                list.set(i11, g.a(list.get(i11)));
            }
            emptyList = Collections.unmodifiableList(list);
        }
        this.zza = emptyList;
    }

    private zzahx(List<String> list) {
        this.zza = new ArrayList();
    }

    public static zzahx zza() {
        return new zzahx(null);
    }

    public final List<String> zzb() {
        return this.zza;
    }
}
