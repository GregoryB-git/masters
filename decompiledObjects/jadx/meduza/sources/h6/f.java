package h6;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.p000authapi.zbat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import k6.e;

/* loaded from: classes.dex */
public final class f extends com.google.android.gms.common.internal.c {

    /* renamed from: a, reason: collision with root package name */
    public final GoogleSignInOptions f7159a;

    public f(Context context, Looper looper, m6.a aVar, GoogleSignInOptions googleSignInOptions, e.a aVar2, e.b bVar) {
        super(context, looper, 91, aVar, aVar2, bVar);
        Account account;
        String str;
        String str2;
        boolean z10;
        boolean z11;
        HashSet hashSet;
        HashMap hashMap;
        boolean z12;
        if (googleSignInOptions != null) {
            new HashSet();
            new HashMap();
            hashSet = new HashSet(googleSignInOptions.f2780b);
            boolean z13 = googleSignInOptions.f2783e;
            boolean z14 = googleSignInOptions.f;
            boolean z15 = googleSignInOptions.f2782d;
            String str3 = googleSignInOptions.f2784o;
            Account account2 = googleSignInOptions.f2781c;
            String str4 = googleSignInOptions.f2785p;
            str = str3;
            account = account2;
            hashMap = GoogleSignInOptions.F(googleSignInOptions.f2786q);
            str2 = str4;
            z12 = z13;
            z11 = z14;
            z10 = z15;
        } else {
            account = null;
            str = null;
            str2 = null;
            z10 = false;
            z11 = false;
            hashSet = new HashSet();
            hashMap = new HashMap();
            z12 = false;
        }
        String zba = zbat.zba();
        if (!aVar.f10242c.isEmpty()) {
            Iterator it = aVar.f10242c.iterator();
            while (it.hasNext()) {
                hashSet.add((Scope) it.next());
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        if (hashSet.contains(GoogleSignInOptions.f2777y)) {
            Scope scope = GoogleSignInOptions.f2776x;
            if (hashSet.contains(scope)) {
                hashSet.remove(scope);
            }
        }
        if (z10 && (account == null || !hashSet.isEmpty())) {
            hashSet.add(GoogleSignInOptions.f2775w);
        }
        this.f7159a = new GoogleSignInOptions(3, new ArrayList(hashSet), account, z10, z12, z11, str, str2, hashMap, zba);
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof q ? (q) queryLocalInterface : new q(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a, k6.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final Intent getSignInIntent() {
        return n.a(getContext(), this.f7159a);
    }

    @Override // com.google.android.gms.common.internal.a
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean providesSignIn() {
        return true;
    }
}
