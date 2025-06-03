/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  okhttp3.ResponseBody
 *  ru.tvrain.core.billing.TransactionDetails
 *  ru.tvrain.core.data.InAppSubscription
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 *  tvrain.services.bus.BusProvider
 *  tvrain.services.bus.events.UpdateDrawerHeaderEvent
 *  tvrain.services.bus.events.UpdateNotificationsCounterEvent
 */
package com.hintsolutions.raintv.common;

import android.os.Bundle;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.utils.Cache;
import com.squareup.otto.Subscribe;
import java.util.ArrayList;
import okhttp3.ResponseBody;
import ru.tvrain.core.billing.TransactionDetails;
import ru.tvrain.core.data.InAppSubscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import tvrain.services.bus.BusProvider;
import tvrain.services.bus.events.UpdateDrawerHeaderEvent;
import tvrain.services.bus.events.UpdateNotificationsCounterEvent;

public abstract class PurchaseActivity
extends BaseActivity {
    private final String[] legacyProductIds = new String[]{"ru.infolio.tvrain.subscription.year", "ru.infolio.tvrain.subscription.month2", "com.hintsolutions.raintv.subscription.year", "ru.infolio.tvrain.subscription.year.christmas", "com.hintsolutions.raintv.subscription.month", "ru.infolio.ru.tvrain.subscription.month"};

    public static /* synthetic */ void A(ResponseBody responseBody) {
        PurchaseActivity.lambda$confirm$0(responseBody);
    }

    private void confirm(TransactionDetails transactionDetails) {
        Cache cache = this.cache;
        if (cache != null && cache.getBoolean(transactionDetails.purchaseToken, false)) {
            return;
        }
        cache = this.rainApi;
        String string = this.getAuthorization();
        transactionDetails = transactionDetails.purchaseInfo;
        this.addSubscription(cache.receiptValidation(string, transactionDetails.responseData, transactionDetails.signature).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new v1(7), (Action1)new v1(8)));
    }

    private InAppSubscription getSubscriptionByMarketId(ArrayList<InAppSubscription> iterator, String string) {
        if (iterator == null) {
            return null;
        }
        for (InAppSubscription inAppSubscription : iterator) {
            if (!inAppSubscription.marketId.equalsIgnoreCase(string)) continue;
            return inAppSubscription;
        }
        return null;
    }

    private static /* synthetic */ void lambda$confirm$0(ResponseBody responseBody) {
    }

    private static /* synthetic */ void lambda$confirm$1(Throwable throwable) {
    }

    public static /* synthetic */ void z(Throwable throwable) {
        PurchaseActivity.lambda$confirm$1(throwable);
    }

    public void confirmSubscriptions() {
    }

    public void handleNewUserInfo(UpdateDrawerHeaderEvent updateDrawerHeaderEvent) {
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Subscribe
    public void onNewUserInfo(UpdateDrawerHeaderEvent updateDrawerHeaderEvent) {
        this.handleNewUserInfo(updateDrawerHeaderEvent);
    }

    @Subscribe
    public void onNotificationsUpdated(UpdateNotificationsCounterEvent updateNotificationsCounterEvent) {
        this.updateNotifications();
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

    public void updateNotifications() {
    }
}

