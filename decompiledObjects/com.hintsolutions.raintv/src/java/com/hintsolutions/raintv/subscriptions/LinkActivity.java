/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  butterknife.OnClick
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  ru.tvrain.core.data.RainUser
 *  rx.Observable
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 */
package com.hintsolutions.raintv.subscriptions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.OnClick;
import com.hintsolutions.raintv.common.PurchaseActivity;
import com.hintsolutions.raintv.profile.AuthorizationActivity;
import com.hintsolutions.raintv.profile.RegistrationActivity;
import com.hintsolutions.raintv.utils.CommonUtils;
import ru.tvrain.core.data.RainUser;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class LinkActivity
extends PurchaseActivity {
    private static final int AUTHORIZATION_REQUEST = 1;

    public static /* synthetic */ void B(LinkActivity linkActivity, Throwable throwable) {
        linkActivity.lambda$startRestore$1(throwable);
    }

    public static /* synthetic */ void C(LinkActivity linkActivity, RainUser rainUser) {
        linkActivity.lambda$startRestore$0(rainUser);
    }

    private /* synthetic */ void lambda$startRestore$0(RainUser rainUser) {
        this.userManager.authorize(rainUser);
        this.onActivityResult(1, -1, null);
    }

    private /* synthetic */ void lambda$startRestore$1(Throwable throwable) {
        this.showToast("\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u0430\u0432\u0442\u043e\u0440\u0438\u0437\u043e\u0432\u0430\u0442\u044c\u0441\u044f");
    }

    private void onUserAuthorized() {
        this.confirmSubscriptions();
    }

    @Override
    public int getLayoutResource() {
        return 2131492898;
    }

    @Override
    public void onActivityResult(int n4, int n5, Intent intent) {
        if (n4 == 1 && n5 == -1) {
            this.onUserAuthorized();
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @OnClick(value={2131296375})
    public void startAuthorization() {
        this.startActivityForResult(new Intent((Context)this, AuthorizationActivity.class), 1);
    }

    @OnClick(value={2131297053})
    public void startRegistration() {
        this.startActivityForResult(new Intent((Context)this, RegistrationActivity.class), 1);
    }

    @OnClick(value={2131296728})
    public void startRestore() {
        try {
            Observable observable = this.rainApi.authByDeviceId(CommonUtils.getDeviceUid((Context)this)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            p2 p22 = new p2(this, 0);
            p2 p23 = new p2(this, 1);
            this.addSubscription(observable.subscribe((Action1)p22, (Action1)p23));
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.showToast("\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u0430\u0432\u0442\u043e\u0440\u0438\u0437\u043e\u0432\u0430\u0442\u044c\u0441\u044f");
        }
    }
}

