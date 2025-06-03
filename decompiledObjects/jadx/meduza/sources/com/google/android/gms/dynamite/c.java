package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
public final class c implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0042b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0042b c0042b = new DynamiteModule.b.C0042b();
        int b10 = aVar.b(context, str);
        c0042b.f2873a = b10;
        int i10 = 1;
        int i11 = 0;
        int a10 = b10 != 0 ? aVar.a(context, str, false) : aVar.a(context, str, true);
        c0042b.f2874b = a10;
        int i12 = c0042b.f2873a;
        if (i12 != 0) {
            i11 = i12;
        } else if (a10 == 0) {
            i10 = 0;
            c0042b.f2875c = i10;
            return c0042b;
        }
        if (i11 >= a10) {
            i10 = -1;
        }
        c0042b.f2875c = i10;
        return c0042b;
    }
}
