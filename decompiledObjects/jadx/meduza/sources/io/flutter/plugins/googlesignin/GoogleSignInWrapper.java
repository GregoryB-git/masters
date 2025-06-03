package io.flutter.plugins.googlesignin;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import h6.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import m6.j;

/* loaded from: classes.dex */
public class GoogleSignInWrapper {
    public g6.a getClient(Context context, GoogleSignInOptions googleSignInOptions) {
        j.i(googleSignInOptions);
        return new g6.a(context, googleSignInOptions);
    }

    public GoogleSignInAccount getLastSignedInAccount(Context context) {
        GoogleSignInAccount googleSignInAccount;
        o a10 = o.a(context);
        synchronized (a10) {
            googleSignInAccount = a10.f7168b;
        }
        return googleSignInAccount;
    }

    public boolean hasPermissions(GoogleSignInAccount googleSignInAccount, Scope scope) {
        Scope[] scopeArr = {scope};
        if (googleSignInAccount == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, scopeArr);
        return new HashSet(googleSignInAccount.f2770r).containsAll(hashSet);
    }

    public void requestPermissions(Activity activity, int i10, GoogleSignInAccount googleSignInAccount, Scope[] scopeArr) {
        Account account;
        if (activity == null) {
            throw new NullPointerException("Please provide a non-null Activity");
        }
        if (scopeArr == null) {
            throw new NullPointerException("Please provide at least one scope");
        }
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        if (scopeArr.length > 0) {
            hashSet.add(scopeArr[0]);
            hashSet.addAll(Arrays.asList(scopeArr));
        }
        if (googleSignInAccount == null || TextUtils.isEmpty(googleSignInAccount.f2765d)) {
            account = null;
        } else {
            String str = googleSignInAccount.f2765d;
            j.i(str);
            j.e(str);
            account = new Account(str, "com.google");
        }
        if (hashSet.contains(GoogleSignInOptions.f2777y)) {
            Scope scope = GoogleSignInOptions.f2776x;
            if (hashSet.contains(scope)) {
                hashSet.remove(scope);
            }
        }
        activity.startActivityForResult(new g6.a(activity, new GoogleSignInOptions(3, new ArrayList(hashSet), account, false, false, false, null, null, hashMap, null)).a(), i10);
    }
}
