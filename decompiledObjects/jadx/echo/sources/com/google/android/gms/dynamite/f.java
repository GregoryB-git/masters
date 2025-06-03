package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
public final class f implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0171b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0171b c0171b = new DynamiteModule.b.C0171b();
        int a7 = aVar.a(context, str);
        c0171b.f10283a = a7;
        int i7 = 0;
        int b7 = a7 != 0 ? aVar.b(context, str, false) : aVar.b(context, str, true);
        c0171b.f10284b = b7;
        int i8 = c0171b.f10283a;
        if (i8 != 0) {
            i7 = i8;
        } else if (b7 == 0) {
            c0171b.f10285c = 0;
            return c0171b;
        }
        if (i7 >= b7) {
            c0171b.f10285c = -1;
        } else {
            c0171b.f10285c = 1;
        }
        return c0171b;
    }
}
