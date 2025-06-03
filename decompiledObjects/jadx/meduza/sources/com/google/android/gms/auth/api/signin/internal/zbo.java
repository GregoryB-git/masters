package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.p000authapi.zbb;
import g6.a;
import h6.b;
import h6.o;
import m6.j;

/* loaded from: classes.dex */
public abstract class zbo extends zbb {
    public zbo() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zbt zbtVar = (zbt) this;
            zbtVar.g();
            b a10 = b.a(zbtVar.f2807a);
            GoogleSignInAccount b10 = a10.b();
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.t;
            if (b10 != null) {
                googleSignInOptions = a10.c();
            }
            Context context = zbtVar.f2807a;
            j.i(googleSignInOptions);
            a aVar = new a(context, googleSignInOptions);
            if (b10 != null) {
                aVar.b();
            } else {
                aVar.signOut();
            }
        } else {
            if (i10 != 2) {
                return false;
            }
            zbt zbtVar2 = (zbt) this;
            zbtVar2.g();
            o.a(zbtVar2.f2807a).b();
        }
        return true;
    }
}
