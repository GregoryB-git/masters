package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
public final class g implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0171b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0171b c0171b = new DynamiteModule.b.C0171b();
        c0171b.f10283a = aVar.a(context, str);
        int b7 = aVar.b(context, str, true);
        c0171b.f10284b = b7;
        int i7 = c0171b.f10283a;
        if (i7 == 0) {
            i7 = 0;
            if (b7 == 0) {
                c0171b.f10285c = 0;
                return c0171b;
            }
        }
        if (b7 >= i7) {
            c0171b.f10285c = 1;
        } else {
            c0171b.f10285c = -1;
        }
        return c0171b;
    }
}
