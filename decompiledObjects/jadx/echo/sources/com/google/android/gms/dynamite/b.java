package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
public final class b implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0171b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0171b c0171b = new DynamiteModule.b.C0171b();
        int b7 = aVar.b(context, str, true);
        c0171b.f10284b = b7;
        if (b7 != 0) {
            c0171b.f10285c = 1;
        } else {
            int a7 = aVar.a(context, str);
            c0171b.f10283a = a7;
            if (a7 != 0) {
                c0171b.f10285c = -1;
            }
        }
        return c0171b;
    }
}
