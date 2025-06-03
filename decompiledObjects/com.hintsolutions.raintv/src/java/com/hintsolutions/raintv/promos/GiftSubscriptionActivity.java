/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.content.ClipboardManager
 *  android.os.Bundle
 *  android.widget.Button
 *  android.widget.TextView
 *  butterknife.BindView
 *  butterknife.OnClick
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  ru.tvrain.core.data.InviteLinkResponse
 *  ru.tvrain.core.data.InviteStatsResponse
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 */
package com.hintsolutions.raintv.promos;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.hintsolutions.raintv.common.BaseActivity;
import ru.tvrain.core.data.InviteLinkResponse;
import ru.tvrain.core.data.InviteStatsResponse;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class GiftSubscriptionActivity
extends BaseActivity {
    @BindView(value=2131296400)
    public TextView boughtAmount;
    private String link = "";
    @BindView(value=2131296745)
    public TextView linkTextView;
    @BindView(value=2131297052)
    public TextView registeredAmount;
    @BindView(value=2131297121)
    public Button share;

    public static /* synthetic */ void A(GiftSubscriptionActivity giftSubscriptionActivity, InviteLinkResponse inviteLinkResponse) {
        giftSubscriptionActivity.lambda$loadData$0(inviteLinkResponse);
    }

    public static /* synthetic */ void B(GiftSubscriptionActivity giftSubscriptionActivity, Throwable throwable) {
        giftSubscriptionActivity.lambda$loadData$1(throwable);
    }

    public static /* synthetic */ void C(GiftSubscriptionActivity giftSubscriptionActivity, InviteStatsResponse inviteStatsResponse) {
        giftSubscriptionActivity.lambda$loadData$2(inviteStatsResponse);
    }

    private /* synthetic */ void lambda$loadData$0(InviteLinkResponse object) {
        object = z2.s(z2.t("https://tvrain.tv/invite/"), object.code, "/");
        this.link = object;
        this.setupWithLink((String)object);
    }

    private /* synthetic */ void lambda$loadData$1(Throwable throwable) {
        this.showErrorDialog(throwable);
    }

    private /* synthetic */ void lambda$loadData$2(InviteStatsResponse inviteStatsResponse) {
        try {
            this.registeredAmount.setText((CharSequence)String.valueOf((Object)inviteStatsResponse.getInvited()));
            this.boughtAmount.setText((CharSequence)String.valueOf((Object)inviteStatsResponse.getAwards()));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static /* synthetic */ void lambda$loadData$3(Throwable throwable) {
    }

    private void loadData() {
        this.share.setEnabled(false);
        this.addSubscription(this.rainApi.getInviteLink(this.getAuthorization()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new d2(this, 0), (Action1)new d2(this, 1)));
        this.addSubscription(this.rainApi.getInviteStats(this.getAuthorization()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new d2(this, 2), (Action1)new v1(23)));
    }

    private void setupWithLink(String string) {
        try {
            this.linkTextView.setText((CharSequence)string);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.share.setEnabled(true);
    }

    public static /* synthetic */ void z(Throwable throwable) {
        GiftSubscriptionActivity.lambda$loadData$3(throwable);
    }

    @Override
    public int getLayoutResource() {
        return 2131492897;
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.loadData();
    }

    @OnClick(value={2131296745})
    public void onLinkClicked() {
        try {
            ((ClipboardManager)this.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((CharSequence)"url", (CharSequence)this.link));
            this.showToast(this.getString(2131755355));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @OnClick(value={2131297121})
    public void onShareClicked() {
        this.shareString(this.link);
    }
}

