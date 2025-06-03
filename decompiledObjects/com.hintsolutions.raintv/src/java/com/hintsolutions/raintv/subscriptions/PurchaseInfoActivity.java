/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  android.widget.Toast
 *  butterknife.BindView
 *  butterknife.OnClick
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  okhttp3.ResponseBody
 *  ru.tvrain.core.data.UserInfo
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 *  tvrain.services.bus.BusProvider
 *  tvrain.services.bus.events.PurchaseInfoSentEvent
 */
package com.hintsolutions.raintv.subscriptions;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.OnClick;
import com.hintsolutions.raintv.common.BaseActivity;
import com.rengwuxian.materialedittext.MaterialEditText;
import okhttp3.ResponseBody;
import ru.tvrain.core.data.UserInfo;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import tvrain.services.bus.BusProvider;
import tvrain.services.bus.events.PurchaseInfoSentEvent;

public class PurchaseInfoActivity
extends BaseActivity {
    @BindView(value=2131296710)
    public MaterialEditText info;

    public static /* synthetic */ void A(PurchaseInfoActivity purchaseInfoActivity, ResponseBody responseBody) {
        purchaseInfoActivity.lambda$onSendClick$3(responseBody);
    }

    public static /* synthetic */ void B(PurchaseInfoActivity purchaseInfoActivity, UserInfo userInfo) {
        purchaseInfoActivity.lambda$getUserInfo$0(userInfo);
    }

    public static /* synthetic */ void C(Throwable throwable) {
        PurchaseInfoActivity.lambda$getUserInfo$1(throwable);
    }

    public static /* synthetic */ boolean D(Message message) {
        return PurchaseInfoActivity.lambda$onSendClick$2(message);
    }

    private String getPurchaseInfo() {
        String string = this.cache.getString("purchase_info");
        if (string != null && string.length() != 0) {
            return string;
        }
        return null;
    }

    private void getUserInfo() {
        this.addSubscription(this.rainApi.getCurrentUser(this.getAuthorization()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new x3(this, 2), (Action1)new z3(0)));
    }

    private /* synthetic */ void lambda$getUserInfo$0(UserInfo object) {
        object = object.email;
        if (object != null) {
            this.info.setText((CharSequence)object);
        }
    }

    private static /* synthetic */ void lambda$getUserInfo$1(Throwable throwable) {
    }

    private static /* synthetic */ boolean lambda$onSendClick$2(Message message) {
        BusProvider.getInstance().post(new PurchaseInfoSentEvent());
        return true;
    }

    private /* synthetic */ void lambda$onSendClick$3(ResponseBody responseBody) {
        this.setPurchaseInfo(this.info.getText().toString());
        new Handler((Handler.Callback)new y3(0)).sendEmptyMessageDelayed(0, 1000L);
        this.finish();
    }

    private /* synthetic */ void lambda$onSendClick$4(Throwable object) {
        this.hideProgressDialog();
        try {
            object = this.getRetrofitErrorMessage((Throwable)object);
            this.info.setError((CharSequence)object);
            this.getTagManager().logError("CheckInfo", "checkInfo", (String)object);
        }
        catch (Exception exception) {
            Toast.makeText((Context)this, (int)2131755517, (int)1).show();
        }
    }

    private void setPurchaseInfo(String string) {
        this.cache.putString("purchase_info", string);
    }

    public static /* synthetic */ void z(PurchaseInfoActivity purchaseInfoActivity, Throwable throwable) {
        purchaseInfoActivity.lambda$onSendClick$4(throwable);
    }

    @Override
    public int getLayoutResource() {
        return 2131492905;
    }

    @Override
    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        String string = this.getPurchaseInfo();
        object = string;
        if (string == null) {
            object = string;
            if (this.isAuthorized()) {
                object = this.userManager.getRainUserInfo();
                if (object == null) {
                    this.getUserInfo();
                    object = string;
                } else {
                    object = object.email;
                }
            }
        }
        if (object != null) {
            this.info.setText((CharSequence)object);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        try {
            BusProvider.getInstance().unregister(this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        try {
            BusProvider.getInstance().register(this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @OnClick(value={2131297117})
    public void onSendClick() {
        String string = this.info.getText().toString().trim();
        if (string.length() == 0) {
            this.info.setError(this.getString(2131755516));
            return;
        }
        String string2 = string.replaceAll("(?im)[\\s\\-\\(\\)]", "");
        boolean bl = string2.matches("(?im)^[0-9+][0-9]+");
        String string3 = null;
        if (bl) {
            string3 = string2.replaceAll("(?im)^(\\+7|8|)([0-9-\\s]{10})$", "$2");
            string = null;
        }
        this.showProgressDialog();
        this.addSubscription(this.rainApi.sendPurchaseInfo(this.getAuthorization(), string, string3).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new x3(this, 0), (Action1)new x3(this, 1)));
    }
}

