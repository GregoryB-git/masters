/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.Html
 *  android.text.TextUtils
 *  android.util.DisplayMetrics
 *  android.view.MenuItem
 *  android.widget.TextView
 *  android.widget.Toast
 *  androidx.annotation.Nullable
 *  androidx.appcompat.app.ActionBar
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.appcompat.widget.Toolbar
 *  androidx.core.app.ShareCompat$IntentBuilder
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  com.google.android.gms.common.GoogleApiAvailability
 *  com.google.firebase.crashlytics.FirebaseCrashlytics
 *  com.google.gson.Gson
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Type
 *  java.util.HashMap
 *  java.util.Map
 *  javax.inject.Inject
 *  okhttp3.ResponseBody
 *  retrofit2.adapter.rxjava.HttpException
 *  ru.tvrain.core.Consts
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.Live
 *  ru.tvrain.core.data.OnesignalTags
 *  ru.tvrain.core.data.Program
 *  ru.tvrain.core.data.RainUser
 *  ru.tvrain.core.data.UserInfo
 *  ru.tvrain.core.services.CommonService
 *  ru.tvrain.core.services.EagleService
 *  ru.tvrain.core.services.RainService
 *  ru.tvrain.core.utils.ListUtils
 *  ru.tvrain.core.utils.ResponseHelper
 *  rx.Subscription
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 *  rx.subscriptions.CompositeSubscription
 *  tvrain.ads.AdsManager
 *  tvrain.analytics.AnalyticsManager
 *  tvrain.analytics.tagmanager.TagManager
 *  tvrain.managers.PrefsManager
 *  tvrain.managers.UserManager
 *  tvrain.services.bus.BusProvider
 *  tvrain.services.bus.events.AuthPendingEnd
 *  tvrain.services.bus.events.FavoritesUpdatedEvent
 *  tvrain.services.bus.events.ProgramFavoritesUpdatedEvent
 *  tvrain.services.bus.events.UserInfoReadyEvent
 *  tvrain.utils.CurrentlyOnAirGetter
 *  tvrain.utils.PushHelper
 */
package com.hintsolutions.raintv.common;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ShareCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import com.hintsolutions.raintv.MainActivity;
import com.hintsolutions.raintv.RainApplication;
import com.hintsolutions.raintv.interfaces.ActivityInterface;
import com.hintsolutions.raintv.interfaces.TaskCallback;
import com.hintsolutions.raintv.news.NewsActivity;
import com.hintsolutions.raintv.profile.SavedVideosActivity;
import com.hintsolutions.raintv.programs.ProgramActivity;
import com.hintsolutions.raintv.services.audio.AudioActivity;
import com.hintsolutions.raintv.services.audio.MusicService;
import com.hintsolutions.raintv.services.video.SavedVideos;
import com.hintsolutions.raintv.subscriptions.AgreementActivity;
import com.hintsolutions.raintv.utils.AddToFavoritesHelper;
import com.hintsolutions.raintv.utils.Cache;
import com.hintsolutions.raintv.utils.CommonUtils;
import com.hintsolutions.raintv.utils.CurrentActivityHolder;
import com.hintsolutions.raintv.utils.MediaUtils;
import com.hintsolutions.raintv.video.LiveActivity;
import com.hintsolutions.raintv.video.VideoStreamActivity;
import com.onesignal.OneSignal;
import com.squareup.otto.Bus;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import okhttp3.ResponseBody;
import retrofit2.adapter.rxjava.HttpException;
import ru.tvrain.core.Consts;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.Live;
import ru.tvrain.core.data.OnesignalTags;
import ru.tvrain.core.data.Program;
import ru.tvrain.core.data.RainUser;
import ru.tvrain.core.data.UserInfo;
import ru.tvrain.core.services.CommonService;
import ru.tvrain.core.services.EagleService;
import ru.tvrain.core.services.RainService;
import ru.tvrain.core.utils.ListUtils;
import ru.tvrain.core.utils.ResponseHelper;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;
import tvrain.ads.AdsManager;
import tvrain.analytics.AnalyticsManager;
import tvrain.analytics.tagmanager.TagManager;
import tvrain.managers.PrefsManager;
import tvrain.managers.UserManager;
import tvrain.services.bus.BusProvider;
import tvrain.services.bus.events.AuthPendingEnd;
import tvrain.services.bus.events.FavoritesUpdatedEvent;
import tvrain.services.bus.events.ProgramFavoritesUpdatedEvent;
import tvrain.services.bus.events.UserInfoReadyEvent;
import tvrain.utils.CurrentlyOnAirGetter;
import tvrain.utils.PushHelper;

public abstract class BaseActivity
extends AppCompatActivity
implements ActivityInterface,
Consts {
    @Inject
    public AdsManager adsManager;
    @Inject
    public AnalyticsManager analyticsManager;
    @Inject
    public Cache cache;
    @Inject
    public CommonService commonApi;
    private CompositeSubscription compositeSubscription;
    private Integer currentVideoId = -1;
    public CurrentlyOnAirGetter currentlyOnAirGetter;
    @Inject
    public EagleService eagleApi;
    public String hashView;
    public volatile boolean mAuthDone = false;
    public boolean mAuthPending = false;
    private TaskCallback pendingCallback;
    @Inject
    public PrefsManager prefsManager;
    private MaterialDialog progressDialog;
    @Inject
    public RainService rainApi;
    public TagManager tagManager;
    @BindView(value=2131297246)
    @Nullable
    public TextView title;
    @BindView(value=2131297244)
    @Nullable
    public Toolbar toolbar;
    @Inject
    public UserManager userManager;

    private boolean addToFavoritesCheckAuth(boolean bl) {
        if (this.isAuthorized()) {
            return true;
        }
        if (bl) {
            this.showDialog(this.getString(2131755659), this.getString(2131755665));
        }
        return false;
    }

    public static /* synthetic */ void c(BaseActivity baseActivity, Throwable throwable) {
        baseActivity.lambda$addProgramToFavorites$12(throwable);
    }

    public static /* synthetic */ void d(BaseActivity baseActivity, Throwable throwable) {
        baseActivity.lambda$addToFavorites$16(throwable);
    }

    public static /* synthetic */ void e(BaseActivity baseActivity, MaterialDialog materialDialog, DialogAction dialogAction) {
        baseActivity.lambda$showRateAppDialog$4(materialDialog, dialogAction);
    }

    public static /* synthetic */ void f(BaseActivity baseActivity, boolean bl, TaskCallback taskCallback, UserInfo userInfo) {
        baseActivity.lambda$checkUser$9(bl, taskCallback, userInfo);
    }

    public static /* synthetic */ void g(BaseActivity baseActivity, Article article, Runnable runnable, ResponseBody responseBody) {
        baseActivity.lambda$addToFavorites$15(article, runnable, responseBody);
    }

    private String getArticleIdArrayString(Article article) {
        StringBuilder stringBuilder = z2.t("[");
        stringBuilder.append(String.valueOf((int)article.id));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private void getAuthorizedUserInfo() {
        this.mAuthPending = true;
        this.showProgressDialog();
        this.addSubscription(this.rainApi.getCurrentUser(this.getAuthorization()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new v(this, 0), (Action1)new v(this, 1)));
    }

    private String getProgramIdArrayString(Program program) {
        StringBuilder stringBuilder = z2.t("[");
        stringBuilder.append(String.valueOf((Object)program.id));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static /* synthetic */ void h(BaseActivity baseActivity, Throwable throwable) {
        baseActivity.lambda$removeProgramFromFavotites$14(throwable);
    }

    public static /* synthetic */ void i(BaseActivity baseActivity, MaterialDialog materialDialog, DialogAction dialogAction) {
        baseActivity.lambda$showConnectionErrorDialog$7(materialDialog, dialogAction);
    }

    private void initToolbar() {
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            this.setSupportActionBar(toolbar);
            ActionBar actionBar = this.getSupportActionBar();
            if (actionBar != null) {
                actionBar.setDisplayHomeAsUpEnabled(true);
            }
            if ((toolbar = this.title) != null) {
                toolbar.setText(actionBar.getTitle());
                actionBar.setDisplayShowTitleEnabled(false);
            }
        }
    }

    public static /* synthetic */ void j(BaseActivity baseActivity, Live live) {
        baseActivity.lambda$startAudioLiveActivity$0(live);
    }

    public static /* synthetic */ void k(BaseActivity baseActivity, Article article, Runnable runnable, ResponseBody responseBody) {
        baseActivity.lambda$removeFromFavotites$17(article, runnable, responseBody);
    }

    public static /* synthetic */ void l(BaseActivity baseActivity, Program program, Runnable runnable, ResponseBody responseBody) {
        baseActivity.lambda$removeProgramFromFavotites$13(program, runnable, responseBody);
    }

    private /* synthetic */ void lambda$addProgramToFavorites$11(Program program, Runnable runnable, ResponseBody responseBody) {
        this.hideProgressDialog();
        this.showToast(this.getString(2131755512));
        program.setFavorite(true);
        BusProvider.getInstance().post(new ProgramFavoritesUpdatedEvent(program.id.intValue(), program.isFavorite()));
        TagManager tagManager = this.tagManager;
        responseBody = z2.t("Teleshow/");
        responseBody.append((Object)program.id);
        tagManager.logEvent("favorites", responseBody.toString(), null);
        if (runnable != null) {
            runnable.run();
        }
    }

    private /* synthetic */ void lambda$addProgramToFavorites$12(Throwable throwable) {
        this.hideProgressDialog();
        this.showErrorDialog(throwable);
    }

    private /* synthetic */ void lambda$addToFavorites$15(Article article, Runnable runnable, ResponseBody responseBody) {
        this.hideProgressDialog();
        this.showToast(this.getString(2131755043));
        article.is_favorite = 1;
        BusProvider.getInstance().post(new FavoritesUpdatedEvent());
        responseBody = this.tagManager;
        StringBuilder stringBuilder = z2.t("Doc/");
        stringBuilder.append(article.id);
        responseBody.logEvent("favorites", stringBuilder.toString(), null);
        if (runnable != null) {
            runnable.run();
        }
    }

    private /* synthetic */ void lambda$addToFavorites$16(Throwable throwable) {
        this.hideProgressDialog();
        this.showErrorDialog(throwable);
    }

    private /* synthetic */ void lambda$checkUser$10(boolean bl, Throwable throwable) {
        if (bl) {
            this.hideProgressDialog();
        }
    }

    private /* synthetic */ void lambda$checkUser$9(boolean bl, TaskCallback taskCallback, UserInfo userInfo) {
        if (bl) {
            this.hideProgressDialog();
        }
        this.userManager.setRainUserInfo(userInfo);
        if (taskCallback != null) {
            try {
                taskCallback.onActionCompleted();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private /* synthetic */ void lambda$getAuthorizedUserInfo$19(UserInfo userInfo) {
        Bus bus;
        this.userManager.setRainUserInfo(userInfo);
        try {
            bus = BusProvider.getInstance();
            UserInfoReadyEvent userInfoReadyEvent = new UserInfoReadyEvent();
            bus.post(userInfoReadyEvent);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            bus = new Gson();
            OneSignal.sendTags(bus.toJson(userInfo.onesignal_tags, (Type)OnesignalTags.class));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.mAuthPending = false;
        this.mAuthDone = true;
        try {
            bus = BusProvider.getInstance();
            userInfo = new AuthPendingEnd();
            bus.post(userInfo);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private /* synthetic */ void lambda$getAuthorizedUserInfo$20(Throwable throwable) {
        this.hideProgressDialog();
        this.mAuthPending = false;
        this.mAuthDone = true;
        try {
            Bus bus = BusProvider.getInstance();
            AuthPendingEnd authPendingEnd = new AuthPendingEnd();
            bus.post(authPendingEnd);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (throwable instanceof HttpException && ((HttpException)throwable).code() == 403) {
            this.quickAuthForGuest();
        }
    }

    private /* synthetic */ void lambda$quickAuthForGuest$21(RainUser rainUser) {
        this.userManager.authorize(rainUser);
        this.onActivityResult(7, -1, null);
        this.getAuthorizedUserInfo();
    }

    private /* synthetic */ void lambda$quickAuthForGuest$22(Throwable object) {
        this.hideProgressDialog();
        this.mAuthPending = false;
        this.mAuthDone = true;
        try {
            object = BusProvider.getInstance();
            AuthPendingEnd authPendingEnd = new AuthPendingEnd();
            ((Bus)object).post(authPendingEnd);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private /* synthetic */ void lambda$removeFromFavotites$17(Article article, Runnable runnable, ResponseBody responseBody) {
        this.hideProgressDialog();
        this.showToast(this.getString(2131755542));
        article.is_favorite = 0;
        BusProvider.getInstance().post(new FavoritesUpdatedEvent());
        if (runnable != null) {
            runnable.run();
        }
    }

    private /* synthetic */ void lambda$removeFromFavotites$18(Throwable throwable) {
        this.hideProgressDialog();
        this.showErrorDialog(throwable);
    }

    private /* synthetic */ void lambda$removeProgramFromFavotites$13(Program program, Runnable runnable, ResponseBody responseBody) {
        this.hideProgressDialog();
        this.showToast(this.getString(2131755513));
        program.setFavorite(false);
        BusProvider.getInstance().post(new ProgramFavoritesUpdatedEvent(program.id.intValue(), program.isFavorite()));
        if (runnable != null) {
            runnable.run();
        }
    }

    private /* synthetic */ void lambda$removeProgramFromFavotites$14(Throwable throwable) {
        this.hideProgressDialog();
        this.showErrorDialog(throwable);
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void lambda$showConnectionErrorDialog$6(MaterialDialog var1_1, DialogAction var2_3) {
        block5: {
            var3_5 = this.isOnline();
            if (!var3_5) break block5;
            try {
                this.onResume();
                ** GOTO lbl10
            }
            catch (Exception var2_4) {
                try {
                    var2_4.printStackTrace();
lbl10:
                    // 2 sources

                    var1_1.dismiss();
                }
                catch (Exception var1_2) {
                    var1_2.printStackTrace();
                }
            }
        }
    }

    private /* synthetic */ void lambda$showConnectionErrorDialog$7(MaterialDialog materialDialog, DialogAction dialogAction) {
        materialDialog.dismiss();
        this.finish();
    }

    private /* synthetic */ void lambda$showConnectionErrorDialog$8(MaterialDialog materialDialog, DialogAction dialogAction) {
        try {
            dialogAction = new Intent((Context)this, SavedVideosActivity.class);
            this.startActivity((Intent)dialogAction);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        materialDialog.dismiss();
    }

    private static /* synthetic */ void lambda$showDialog$2(TaskCallback taskCallback, MaterialDialog materialDialog, DialogAction dialogAction) {
        if (taskCallback != null) {
            taskCallback.onActionCompleted();
        }
    }

    private static /* synthetic */ void lambda$showDialog$3(TaskCallback taskCallback, MaterialDialog materialDialog, DialogAction dialogAction) {
        if (taskCallback != null) {
            taskCallback.onActionCompleted();
        }
    }

    private /* synthetic */ void lambda$showRateAppDialog$4(MaterialDialog materialDialog, DialogAction dialogAction) {
        this.preventRateDialogShow();
        this.rateApp();
    }

    private /* synthetic */ void lambda$showRateAppDialog$5(MaterialDialog materialDialog, DialogAction dialogAction) {
        this.preventRateDialogShow();
    }

    private /* synthetic */ void lambda$startAudioLiveActivity$0(Live live) {
        HashMap hashMap;
        try {
            hashMap = new HashMap();
            hashMap.put((Object)"category", (Object)"top_menu");
            hashMap.put((Object)"action", (Object)"click");
            hashMap.put((Object)"label", (Object)"listen_live");
            this.analyticsManager.logRainView(this.rainApi, this.userManager.getUserId(), this.hashView, (Map)hashMap);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            hashMap = new Intent((Context)this, AudioActivity.class);
            hashMap.putExtra("metadata", (Parcelable)MediaUtils.buildMediaMetadataForLive(live));
            hashMap.putExtra("metadata_json", MediaUtils.buildMetadataJsonForLive(live));
            this.startActivity((Intent)hashMap);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private /* synthetic */ void lambda$startAudioLiveActivity$1(Throwable throwable) {
        Toast.makeText((Context)this, (CharSequence)"\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f", (int)0).show();
        this.finish();
    }

    public static /* synthetic */ void m(TaskCallback taskCallback, MaterialDialog materialDialog, DialogAction dialogAction) {
        BaseActivity.lambda$showDialog$2(taskCallback, materialDialog, dialogAction);
    }

    public static /* synthetic */ void n(BaseActivity baseActivity, Program program, Runnable runnable, ResponseBody responseBody) {
        baseActivity.lambda$addProgramToFavorites$11(program, runnable, responseBody);
    }

    public static /* synthetic */ void o(TaskCallback taskCallback, MaterialDialog materialDialog, DialogAction dialogAction) {
        BaseActivity.lambda$showDialog$3(taskCallback, materialDialog, dialogAction);
    }

    public static /* synthetic */ void p(BaseActivity baseActivity, Throwable throwable) {
        baseActivity.lambda$startAudioLiveActivity$1(throwable);
    }

    private void preventRateDialogShow() {
        this.cache.putBoolean("rate_dialog_shown", true);
    }

    public static /* synthetic */ void q(BaseActivity baseActivity, UserInfo userInfo) {
        baseActivity.lambda$getAuthorizedUserInfo$19(userInfo);
    }

    public static /* synthetic */ void r(BaseActivity baseActivity, Throwable throwable) {
        baseActivity.lambda$removeFromFavotites$18(throwable);
    }

    public static /* synthetic */ void s(BaseActivity baseActivity, RainUser rainUser) {
        baseActivity.lambda$quickAuthForGuest$21(rainUser);
    }

    public static /* synthetic */ void t(BaseActivity baseActivity, MaterialDialog materialDialog, DialogAction dialogAction) {
        baseActivity.lambda$showRateAppDialog$5(materialDialog, dialogAction);
    }

    public static /* synthetic */ void u(BaseActivity baseActivity, MaterialDialog materialDialog, DialogAction dialogAction) {
        baseActivity.lambda$showConnectionErrorDialog$6(materialDialog, dialogAction);
    }

    private void unsubscribe() {
        CompositeSubscription compositeSubscription = this.compositeSubscription;
        if (compositeSubscription != null) {
            compositeSubscription.clear();
        }
    }

    public static /* synthetic */ void v(BaseActivity baseActivity, boolean bl, Throwable throwable) {
        baseActivity.lambda$checkUser$10(bl, throwable);
    }

    public static /* synthetic */ void w(BaseActivity baseActivity, MaterialDialog materialDialog, DialogAction dialogAction) {
        baseActivity.lambda$showConnectionErrorDialog$8(materialDialog, dialogAction);
    }

    public static /* synthetic */ void x(BaseActivity baseActivity, Throwable throwable) {
        baseActivity.lambda$quickAuthForGuest$22(throwable);
    }

    public static /* synthetic */ void y(BaseActivity baseActivity, Throwable throwable) {
        baseActivity.lambda$getAuthorizedUserInfo$20(throwable);
    }

    public void addProgramToFavorites(Program program, boolean bl, Runnable runnable, boolean bl2) {
        if (bl && !this.addToFavoritesCheckAuth(bl2)) {
            return;
        }
        this.addSubscription(this.rainApi.addProgramToFavorites(this.getAuthorization(), this.getProgramIdArrayString(program)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new w(this, program, runnable, 0), (Action1)new v(this, 2)));
    }

    public void addSubscription(Subscription subscription) {
        if (this.compositeSubscription == null) {
            this.compositeSubscription = new CompositeSubscription();
        }
        this.compositeSubscription.add(subscription);
    }

    public void addToFavorites(Article article, boolean bl, Runnable runnable, boolean bl2) {
        if (bl && !this.addToFavoritesCheckAuth(bl2)) {
            return;
        }
        this.addSubscription(this.rainApi.addArticleToFavorites(this.getAuthorization(), this.getArticleIdArrayString(article)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new x(this, article, runnable, 0), (Action1)new v(this, 9)));
    }

    public boolean checkPermissionsArray(int[] nArray) {
        int n2 = nArray.length;
        for (int j = 0; j < n2; ++j) {
            if (nArray[j] == 0) continue;
            return false;
        }
        return true;
    }

    public boolean checkPlayServices() {
        block3: {
            int n2 = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.getApplicationContext());
            if (n2 == 0) break block3;
            try {
                this.showToast(GoogleApiAvailability.getInstance().getErrorString(n2));
                return false;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return true;
    }

    public void checkUser(TaskCallback taskCallback) {
        this.checkUser(taskCallback, true);
    }

    public void checkUser(TaskCallback taskCallback, boolean bl) {
        if (bl) {
            this.showProgressDialog();
        }
        this.addSubscription(this.rainApi.getCurrentUser(this.getAuthorization()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new z(this, bl, taskCallback), (Action1)new a0(this, bl, 0)));
    }

    @Override
    public String getAuthorization() {
        return this.userManager.getAuthorization();
    }

    public int getHttpCode(Throwable throwable) {
        try {
            int n2 = ((HttpException)throwable).response().code();
            return n2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return 200;
        }
    }

    public abstract int getLayoutResource();

    public String getRetrofitErrorMessage(Throwable object) {
        try {
            String string = new String(((HttpException)object).response().errorBody().bytes());
            object = ResponseHelper.getErrorMessage((String)string);
            return object;
        }
        catch (Exception exception) {
            return ResponseHelper.getErrorMessage((String)"");
        }
    }

    @Override
    public TagManager getTagManager() {
        return this.tagManager;
    }

    @Override
    public RainUser getUser() {
        return this.userManager.getUser();
    }

    @Override
    public String getUserId() {
        return this.userManager.getUserId();
    }

    public void hideProgressDialog() {
        MaterialDialog materialDialog = this.progressDialog;
        if (materialDialog == null) {
            return;
        }
        try {
            materialDialog.dismiss();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void hideToolbar() {
        if (this.getSupportActionBar() != null) {
            this.getSupportActionBar().setDisplayUseLogoEnabled(false);
            this.getSupportActionBar().setDisplayShowTitleEnabled(false);
            this.getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        }
    }

    @Override
    public boolean isAuthorized() {
        try {
            boolean bl = this.userManager.isAuthorized();
            return bl;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public boolean isOnline() {
        boolean bl;
        block4: {
            block3: {
                NetworkInfo networkInfo;
                bl = true;
                try {
                    networkInfo = ((ConnectivityManager)this.getSystemService("connectivity")).getActiveNetworkInfo();
                    if (networkInfo == null) break block3;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return true;
                }
                boolean bl2 = networkInfo.isConnectedOrConnecting();
                if (bl2) break block4;
            }
            bl = false;
        }
        return bl;
    }

    public boolean isPushEnabled() {
        return this.prefsManager.getBoolean("push", true);
    }

    @Override
    public boolean isRCAuthorized() {
        return this.userManager.isRCAuthorized();
    }

    @Override
    public boolean isTablet() {
        double d;
        boolean bl = false;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f = (float)displayMetrics.heightPixels / displayMetrics.ydpi;
            float f2 = (float)displayMetrics.widthPixels / displayMetrics.xdpi;
            d = Math.sqrt((double)(f * f + f2 * f2));
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
        if (d >= 6.5) {
            bl = true;
        }
        return bl;
    }

    public void loadUserInfo() {
        this.mAuthPending = true;
        if (this.getAuthorization() == null) {
            this.quickAuthForGuest();
        } else {
            this.getAuthorizedUserInfo();
        }
    }

    public void onActivityResult(int n2, int n4, Intent intent) {
        super.onActivityResult(n2, n4, intent);
        if (n2 != 9) {
            if (n2 == 14) {
                this.checkUser(null);
            }
        } else {
            this.checkUser(this.pendingCallback);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RainApplication.getAppComponent().inject(this);
        try {
            this.setContentView(this.getLayoutResource());
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.finish();
            return;
        }
        try {
            ButterKnife.bind((Activity)this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.initToolbar();
        this.hashView = this.analyticsManager.getHashHolder().getNewViewHash();
        this.currentlyOnAirGetter = new CurrentlyOnAirGetter();
        this.tagManager = new TagManager(this.getApplicationContext(), this.userManager, this.currentlyOnAirGetter);
    }

    public void onDestroy() {
        if (this instanceof NewsActivity || this instanceof VideoStreamActivity) {
            try {
                if (!this.userManager.isNoAds()) {
                    this.adsManager.incrementTransitionsCounter(this.userManager);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        this.unsubscribe();
        CurrentlyOnAirGetter currentlyOnAirGetter = this.currentlyOnAirGetter;
        if (currentlyOnAirGetter != null) {
            currentlyOnAirGetter.stop();
        }
        if ((currentlyOnAirGetter = this.tagManager) != null) {
            currentlyOnAirGetter.stop();
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        MaterialDialog materialDialog = this.progressDialog;
        if (materialDialog != null && materialDialog.isShowing()) {
            this.progressDialog.cancel();
        }
        CurrentActivityHolder.clearActivity();
    }

    public void onResume() {
        super.onResume();
        CurrentActivityHolder.setActivity(this);
        PushHelper.checkPushData((BaseActivity)this, (boolean)false);
        new AddToFavoritesHelper(this).process();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void openUrl(String string) {
        try {
            if (TextUtils.isEmpty((CharSequence)string)) {
                return;
            }
            String string2 = string;
            if (!string.startsWith("http://")) {
                string2 = string;
                if (!string.startsWith("https://")) {
                    string2 = new StringBuilder();
                    string2.append("http://");
                    string2.append(string);
                    string2 = string2.toString();
                }
            }
            string = new Intent("android.intent.action.VIEW");
            string.setData(Uri.parse((String)string2));
            this.startActivity((Intent)string);
            return;
        }
        catch (Exception exception) {
            FirebaseCrashlytics.getInstance().recordException((Throwable)exception);
            exception.printStackTrace();
        }
    }

    public void quickAuthForGuest() {
        this.mAuthPending = true;
        this.showProgressDialog();
        this.addSubscription(this.rainApi.authByDeviceId(CommonUtils.getDeviceUid((Context)this)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new v(this, 4), (Action1)new v(this, 5)));
    }

    public void rateApp() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("market://details?id=");
        stringBuilder.append(this.getPackageName());
        Uri uri = Uri.parse((String)stringBuilder.toString());
        stringBuilder = new Intent("android.intent.action.VIEW", uri);
        stringBuilder.addFlags(0x48000000);
        try {
            this.startActivity((Intent)stringBuilder);
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            try {
                uri = new StringBuilder();
                uri.append("http://play.google.com/store/apps/details?id=");
                uri.append(this.getPackageName());
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String)uri.toString()));
                this.startActivity(intent);
            }
            catch (Exception exception) {
                try {
                    exception.printStackTrace();
                }
                catch (Exception exception2) {
                    FirebaseCrashlytics.getInstance().recordException((Throwable)exception2);
                    exception2.printStackTrace();
                }
            }
        }
    }

    public void removeFromFavotites(Article article, boolean bl, Runnable runnable, boolean bl2) {
        if (bl && !this.addToFavoritesCheckAuth(bl2)) {
            return;
        }
        this.addSubscription(this.rainApi.deleteArticleFromFavorites(this.getAuthorization(), this.getArticleIdArrayString(article)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new x(this, article, runnable, 1), (Action1)new v(this, 15)));
    }

    public void removeProgramFromFavotites(Program program, boolean bl, Runnable runnable, boolean bl2) {
        if (bl && !this.addToFavoritesCheckAuth(bl2)) {
            return;
        }
        this.addSubscription(this.rainApi.deleteProgramFromFavorites(this.getAuthorization(), this.getProgramIdArrayString(program)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new w(this, program, runnable, 1), (Action1)new v(this, 3)));
    }

    public void sendSupportEmail() {
        Object object;
        String[] stringArray = new String[]{"web@tvrain.tv "};
        try {
            object = new StringBuilder();
            object.append(this.getString(2131755468));
            object.append(" ");
            object.append(CommonUtils.getDeviceInfo());
            object = object.toString();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            object = "";
        }
        UserManager userManager = this.userManager;
        Object object2 = object;
        if (userManager != null) {
            object2 = object;
            if (userManager.isAuthorized()) {
                object = z2.u((String)object, " \nId: ");
                object.append(this.userManager.getUserId());
                object = object2 = object.toString();
                if (this.userManager.getRainUserInfo() != null) {
                    object = z2.u((String)object2, " \nE-Mail: ");
                    object.append(this.userManager.getRainUserInfo().email);
                    object = object.toString();
                }
                object2 = z2.o((String)object, " \n");
            }
        }
        object = this.getString(2131755555);
        try {
            userManager = new Intent("android.intent.action.SENDTO");
            userManager.setData(Uri.parse((String)"mailto:"));
            userManager.putExtra("android.intent.extra.EMAIL", stringArray);
            userManager.putExtra("android.intent.extra.SUBJECT", "Android-\u043f\u0440\u0438\u043b\u043e\u0436\u0435\u043d\u0438\u0435 TV Rain");
            userManager.putExtra("android.intent.extra.TEXT", (String)object2);
            if (userManager.resolveActivity(this.getPackageManager()) != null) {
                this.startActivity((Intent)userManager);
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            ShareCompat.IntentBuilder.from((Activity)this).setType("message/rfc822").addEmailTo(stringArray[0]).setSubject("Android-\u043f\u0440\u0438\u043b\u043e\u0436\u0435\u043d\u0438\u0435 TV Rain").setText((CharSequence)object2).setChooserTitle((CharSequence)object).startChooser();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void sendToDonationPage(String string, TaskCallback taskCallback) {
        try {
            string = new Intent("android.intent.action.VIEW");
            string.setData(Uri.parse((String)"https://tvrain.tv/donate/?from=android"));
            this.startActivity((Intent)string);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void setFullscreenIfLandscape() {
        try {
            if (this.getResources().getConfiguration().orientation == 2) {
                this.getWindow().setFlags(1024, 1024);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void shareRainCountryUrl(Integer n2, String string) {
        try {
            this.currentVideoId = n2;
            n2 = new Intent("android.intent.action.SEND");
            n2.setType("text/plain");
            n2.putExtra("android.intent.extra.TEXT", string);
            this.startActivityForResult(Intent.createChooser((Intent)n2, (CharSequence)this.getString(2131755557)), 5);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void shareString(String string) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", string);
            this.startActivity(intent);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void showAgreement(boolean bl) {
        Intent intent = new Intent((Context)this, AgreementActivity.class);
        intent.putExtra("withAcceptButton", bl);
        this.startActivity(intent);
    }

    public void showConnectionErrorDialog() {
        MaterialDialog.Builder builder;
        MaterialDialog.Builder builder2 = builder = new MaterialDialog.Builder((Context)this).title(2131755203).content(this.getString(2131755197)).autoDismiss(false).positiveText(2131755074).negativeText(2131755067).positiveColorRes(2131099728).negativeColorRes(2131099728).cancelable(false).onPositive(new v(this, 6)).onNegative(new v(this, 7));
        if (!ListUtils.isEmptyList(SavedVideos.getSavedVideos(this.prefsManager))) {
            builder2 = builder.neutralText(2131755561).neutralColorRes(2131099728).onNeutral(new v(this, 8)).btnStackedGravity(GravityEnum.CENTER);
        }
        builder2.show();
    }

    public void showDialog(String string, String string2) {
        this.showDialog(string, string2, null);
    }

    public void showDialog(String string, String string2, TaskCallback taskCallback) {
        this.showDialog(string, string2, taskCallback, null, false, null, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void showDialog(String object, String object2, TaskCallback taskCallback, TaskCallback taskCallback2, boolean bl, String string, String string2) {
        try {
            MaterialDialog.Builder builder = new MaterialDialog.Builder((Context)this);
            builder = builder.title((CharSequence)object).theme(Theme.LIGHT);
            object = object2;
            if (object2.contains((CharSequence)"<")) {
                object = Html.fromHtml((String)object2);
            }
            object2 = builder.content((CharSequence)object).positiveColorRes(2131099728);
            object = new y(taskCallback, 0);
            object = ((MaterialDialog.Builder)object2).onPositive((MaterialDialog.SingleButtonCallback)object);
            if (string != null) {
                ((MaterialDialog.Builder)object).positiveText(string);
            } else {
                ((MaterialDialog.Builder)object).positiveText(2131755070);
            }
            if (bl) {
                ((MaterialDialog.Builder)object).negativeColorRes(2131099728);
                if (string2 != null) {
                    ((MaterialDialog.Builder)object).negativeText(string2);
                } else {
                    ((MaterialDialog.Builder)object).negativeText(2131755610);
                }
                object2 = new y(taskCallback2, 1);
                ((MaterialDialog.Builder)object).onNegative((MaterialDialog.SingleButtonCallback)object2);
            }
            ((MaterialDialog.Builder)object).show();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void showDialog(String string, String string2, TaskCallback taskCallback, boolean bl) {
        this.showDialog(string, string2, taskCallback, null, true, null, null);
    }

    public void showErrorDialog(String string) {
        this.showDialog(this.getString(2131755203), string, null);
    }

    public void showErrorDialog(Throwable throwable) {
        this.showDialog(this.getString(2131755203), this.getRetrofitErrorMessage(throwable), null);
    }

    public void showErrorDialog(Throwable throwable, TaskCallback taskCallback) {
        this.showDialog(this.getString(2131755203), this.getRetrofitErrorMessage(throwable), taskCallback);
    }

    public void showMainActivityWithAuth() {
        try {
            Intent intent = new Intent((Context)this, MainActivity.class);
            intent.addFlags(0x14000000);
            intent.putExtra("auth", true);
            this.startActivity(intent);
            if (!(this instanceof MainActivity)) {
                this.finish();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void showNewsActivity(int n2) {
        this.showNewsActivity(n2, null);
    }

    public void showNewsActivity(int n2, String string) {
        Intent intent = new Intent((Context)this, NewsActivity.class);
        intent.putExtra("id", n2);
        if (string != null) {
            intent.putExtra("link", string);
        }
        this.startActivity(intent);
    }

    public void showProgramActivity(int n2) {
        Intent intent = new Intent((Context)this, ProgramActivity.class);
        intent.putExtra("id", n2);
        this.startActivity(intent);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void showProgressDialog() {
        try {
            Object object = this.progressDialog;
            if (object != null && object.isShowing()) {
                return;
            }
            object = this.progressDialog;
            if (object == null) {
                object = new MaterialDialog.Builder((Context)this);
                this.progressDialog = ((MaterialDialog.Builder)object).widgetColor(this.getResources().getColor(2131099728)).content(2131755506).progress(true, 0).cancelable(false).show();
                return;
            }
            ((MaterialDialog)object).show();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void showRCAuthDialog() {
        try {
            String string = this.getString(2131755202);
            String string2 = this.getString(2131755054);
            v v2 = new v(this, 12);
            this.showDialog(string, string2, v2, true);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void showRateAppDialog() {
        try {
            Object object = new MaterialDialog.Builder((Context)this);
            MaterialDialog.Builder builder = ((MaterialDialog.Builder)object).theme(Theme.LIGHT).content(this.getString(2131755201)).positiveText(2131755071).neutralText(2131755072).negativeText(2131755066).positiveColorRes(2131099728).neutralColorRes(2131099728).negativeColorRes(2131099728).btnStackedGravity(GravityEnum.CENTER);
            object = new v(this, 13);
            builder = builder.onPositive((MaterialDialog.SingleButtonCallback)object);
            object = new v(this, 14);
            builder.onNegative((MaterialDialog.SingleButtonCallback)object).show();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void showToast(String string) {
        Toast.makeText((Context)this, (CharSequence)string, (int)0).show();
    }

    public void startAudioLiveActivity() {
        this.addSubscription(this.rainApi.live(this.getAuthorization()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new v(this, 10), (Action1)new v(this, 11)));
    }

    public void startFavorites() {
        try {
            Intent intent = new Intent((Context)this, MainActivity.class);
            intent.addFlags(0x14000000);
            intent.putExtra("favorites", true);
            this.startActivity(intent);
            if (!(this instanceof MainActivity)) {
                this.finish();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void startLiveActivity() {
        this.startLiveActivity(false);
    }

    public void startLiveActivity(boolean bl) {
        HashMap hashMap;
        try {
            hashMap = new HashMap();
            hashMap.put((Object)"category", (Object)"top_menu");
            hashMap.put((Object)"action", (Object)"click");
            hashMap.put((Object)"label", (Object)"live");
            this.analyticsManager.logRainView(this.rainApi, this.userManager.getUserId(), this.hashView, (Map)hashMap);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        hashMap = new Intent((Context)this, LiveActivity.class);
        if (bl) {
            hashMap.putExtra("FROM_AUDIO", "1");
        }
        this.startActivity((Intent)hashMap);
    }

    public void stopAudioService() {
        try {
            Intent intent = new Intent((Context)this, MusicService.class);
            intent.putExtra("CMD_NAME", "CMD_PAUSE");
            intent.setAction("com.hintsolutions.raintv.services.audio.musicservice.ACTION_CMD");
            this.startService(intent);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void toggleFav(Article article, boolean bl, Runnable runnable) {
        if (article == null) {
            return;
        }
        if (!bl || this.addToFavoritesCheckAuth(true)) {
            if (article.isFavorite()) {
                this.removeFromFavotites(article, false, runnable, true);
            } else {
                this.addToFavorites(article, false, runnable, true);
            }
        }
    }

    @Override
    public void toggleProgramFav(Program program, boolean bl, Runnable runnable) {
        if (program == null) {
            return;
        }
        if (!bl || this.addToFavoritesCheckAuth(true)) {
            if (program.isFavorite()) {
                this.removeProgramFromFavotites(program, false, runnable, true);
            } else {
                this.addProgramToFavorites(program, false, runnable, true);
            }
        }
    }
}

