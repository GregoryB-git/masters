/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.KeyEvent
 *  android.view.View
 *  android.widget.CompoundButton
 *  android.widget.FrameLayout
 *  android.widget.TextView
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.fragment.app.Fragment
 *  bolts.AppLinks
 *  butterknife.BindView
 *  butterknife.OnClick
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.TimeUnit
 *  okhttp3.ResponseBody
 *  ru.tvrain.core.data.UserInfo
 *  ru.tvrain.core.data.rain_country.RCProfileInfo
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 *  tvrain.cast.CastHelper
 *  tvrain.managers.DrawerManager
 *  tvrain.managers.DrawerManager$Companion
 *  tvrain.managers.PrefsManager
 *  tvrain.managers.UserManager
 *  tvrain.services.bus.BusProvider
 *  tvrain.services.bus.events.AuthPendingEnd
 *  tvrain.services.bus.events.UpdateDrawerHeaderEvent
 *  tvrain.services.bus.events.UserInfoReadyEvent
 *  tvrain.utils.PushHelper
 */
package com.hintsolutions.raintv;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bolts.AppLinks;
import butterknife.BindView;
import butterknife.OnClick;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.hintsolutions.raintv.DeepLinkingActivity;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.common.PurchaseActivity;
import com.hintsolutions.raintv.common.WebViewActivity;
import com.hintsolutions.raintv.interfaces.OnFragmentInteractionListener;
import com.hintsolutions.raintv.news.AllNewsFragment;
import com.hintsolutions.raintv.news.FavoritesFragment;
import com.hintsolutions.raintv.profile.AuthorizationFragment;
import com.hintsolutions.raintv.programs.ProgramsFragment;
import com.hintsolutions.raintv.schedule.ScheduleFragment;
import com.hintsolutions.raintv.search.SearchActivity;
import com.hintsolutions.raintv.utils.Cache;
import com.hintsolutions.raintv.video.LiveActivity;
import com.hintsolutions.raintv.video.PlaylistActivity;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.interfaces.OnCheckedChangeListener;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.ResponseBody;
import ru.tvrain.core.data.UserInfo;
import ru.tvrain.core.data.rain_country.RCProfileInfo;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import tvrain.cast.CastHelper;
import tvrain.managers.DrawerManager;
import tvrain.managers.PrefsManager;
import tvrain.managers.UserManager;
import tvrain.services.bus.BusProvider;
import tvrain.services.bus.events.AuthPendingEnd;
import tvrain.services.bus.events.UpdateDrawerHeaderEvent;
import tvrain.services.bus.events.UserInfoReadyEvent;
import tvrain.utils.PushHelper;

public class MainActivity
extends PurchaseActivity
implements OnFragmentInteractionListener {
    public static final String INTENT_EXTRA_AUTH = "auth";
    public static final String INTENT_EXTRA_FAVORITES = "favorites";
    public static final String INTENT_EXTRA_SHOW_PROFILE = "show_profile";
    public static final String INTENT_EXTRA_START_LIVE = "start_live";
    private CastHelper castHelper;
    private DrawerManager drawerManager;
    private WeakReference<DrawerManager> drawerManagerWeakReference;
    @BindView(value=2131296507)
    public FrameLayout mContentFrame;
    @BindView(value=2131297034)
    public FrameLayout mProgressFrame;
    private WeakReference<UserManager> userManagerWeakReference;

    public MainActivity() {
        this.drawerManagerWeakReference = new WeakReference((Object)this.drawerManager);
        this.userManagerWeakReference = new WeakReference((Object)this.userManager);
    }

    public static /* synthetic */ void B(MainActivity mainActivity) {
        mainActivity.lambda$onMenuClicked$9();
    }

    public static /* synthetic */ void C(Throwable throwable) {
        throwable.printStackTrace();
    }

    public static /* synthetic */ void D(MainActivity mainActivity, UserInfo userInfo, ArrayList arrayList) {
        mainActivity.lambda$onAuthPendingEnd$2(userInfo, arrayList);
    }

    public static /* synthetic */ void E(MainActivity mainActivity, MaterialDialog materialDialog, DialogAction dialogAction) {
        mainActivity.lambda$logout$8(materialDialog, dialogAction);
    }

    public static /* synthetic */ void F(MainActivity mainActivity, UserInfo userInfo, Throwable throwable) {
        mainActivity.lambda$onAuthPendingEnd$3(userInfo, throwable);
    }

    public static /* synthetic */ void G(MainActivity mainActivity, ResponseBody responseBody) {
        mainActivity.lambda$logout$6(responseBody);
    }

    public static /* synthetic */ void H(MainActivity mainActivity, Throwable throwable) {
        mainActivity.lambda$loadRainCountryProfile$5(throwable);
    }

    public static /* synthetic */ void I(Throwable throwable) {
        MainActivity.lambda$logout$7(throwable);
    }

    public static /* synthetic */ void J(MainActivity mainActivity, UserInfo userInfo, RCProfileInfo rCProfileInfo) {
        mainActivity.lambda$loadRainCountryProfile$4(userInfo, rCProfileInfo);
    }

    public static /* synthetic */ void K(MainActivity mainActivity, List list) {
        mainActivity.lambda$updatePlaylists$0(list);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void checkNewIntent(Intent intent) {
        Intent intent2;
        try {
            if (intent.hasExtra(INTENT_EXTRA_SHOW_PROFILE)) {
                this.drawerManager.setSelection(3L, true);
                this.handleDrawerItemSelected(3L);
            }
            if (intent.hasExtra(INTENT_EXTRA_AUTH)) {
                this.drawerManager.setSelection(15L, true);
                this.handleDrawerItemSelected(15L);
            }
            if (intent.hasExtra("rain_country")) {
                this.drawerManager.setSelection(1L, true);
                this.handleDrawerItemSelected(1L);
            }
            if (intent.hasExtra(INTENT_EXTRA_FAVORITES)) {
                this.drawerManager.setSelection(17L, true);
                this.handleDrawerItemSelected(17L);
            }
            if (intent.hasExtra(INTENT_EXTRA_START_LIVE)) {
                intent2 = new Intent((Context)this, LiveActivity.class);
                this.startActivity(intent2);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            intent = AppLinks.getTargetUrlFromInboundIntent((Context)this, (Intent)intent);
            if (intent == null) return;
            intent2 = new Intent((Context)this, DeepLinkingActivity.class);
            intent2.setData((Uri)intent);
            this.startActivity(intent2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void clearRateAllowedCounters() {
        this.cache.putInt("launch_counter", 0);
        this.cache.putLong("rate_dialog_shown_time", new Date().getTime());
    }

    private void gtmLogLogout() {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"event", (Object)"event");
        hashMap.put((Object)"eventname", (Object)"exit");
        this.tagManager.log((Map)hashMap);
    }

    private boolean isRateAllowed() {
        Cache cache = this.cache;
        boolean bl = false;
        if (cache.getBoolean("rate_dialog_shown", false)) {
            return false;
        }
        long l = this.cache.getLong("rate_dialog_shown_time", 0L);
        int n2 = this.cache.getInt("launch_counter") + 1;
        this.cache.putInt("launch_counter", n2);
        boolean bl2 = l == 0L || TimeUnit.DAYS.convert(new Date().getTime() - l, TimeUnit.MILLISECONDS) > 30L;
        boolean bl3 = bl;
        if (n2 >= 10) {
            bl3 = bl;
            if (bl2) {
                bl3 = true;
            }
        }
        return bl3;
    }

    private /* synthetic */ void lambda$loadRainCountryProfile$4(UserInfo userInfo, RCProfileInfo rCProfileInfo) {
        this.hideProgressDialog();
        if (this.userManager.isAuthorized()) {
            this.drawerManager.updateDrawerHeader(userInfo, rCProfileInfo);
        }
    }

    private /* synthetic */ void lambda$loadRainCountryProfile$5(Throwable throwable) {
        this.hideProgressDialog();
        this.drawerManager.scrollToTop();
    }

    private /* synthetic */ void lambda$logout$6(ResponseBody object) {
        this.userManager.logout();
        this.drawerManager.updateMenuState(this.isAuthorized());
        this.drawerManager.setSelection(4L, true);
        this.gtmLogLogout();
        try {
            object = BusProvider.getInstance();
            UserInfoReadyEvent userInfoReadyEvent = new UserInfoReadyEvent();
            ((Bus)object).post(userInfoReadyEvent);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.quickAuthForGuest();
    }

    private static /* synthetic */ void lambda$logout$7(Throwable throwable) {
    }

    private /* synthetic */ void lambda$logout$8(MaterialDialog materialDialog, DialogAction dialogAction) {
        this.addSubscription(this.rainApi.logout(this.getAuthorization()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new w2(this, 4), (Action1)new v1(6)));
    }

    private /* synthetic */ void lambda$onAuthPendingEnd$2(UserInfo userInfo, ArrayList arrayList) {
        try {
            userInfo.setSocialUrls(arrayList);
            this.userManager.setRainUserInfo(userInfo);
            this.drawerManager.updateMenuState(this.isAuthorized());
            this.loadRainCountryProfile(userInfo);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.hideProgressDialog();
        }
    }

    private /* synthetic */ void lambda$onAuthPendingEnd$3(UserInfo userInfo, Throwable throwable) {
        try {
            this.loadRainCountryProfile(userInfo);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.hideProgressDialog();
        }
    }

    private /* synthetic */ void lambda$onMenuClicked$9() {
        block4: {
            UserInfo userInfo;
            if (this.drawerManager == null || (userInfo = this.userManager.getRainUserInfo()) == null) break block4;
            this.drawerManager.updateSubscriptionDaysInfo(userInfo, null);
            userInfo = userInfo.favoritesCount;
            if (userInfo == null) break block4;
            try {
                this.drawerManager.updateFavoritesBadge(userInfo.intValue());
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private /* synthetic */ void lambda$updatePlaylists$0(List list) {
        this.drawerManager.setPlaylists(list);
    }

    private void loadRainCountryProfile(UserInfo userInfo) {
        this.addSubscription(this.rainApi.getMyRCProfile(this.getAuthorization()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new x2(this, userInfo, 0), (Action1)new w2(this, 1)));
    }

    private void logDrawerItemSelected(long l) {
        try {
            String string = DrawerManager.Companion.getItemName(l);
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"category", (Object)"menu");
            hashMap.put((Object)"action", (Object)"click");
            hashMap.put((Object)"label", (Object)string);
            this.analyticsManager.logRainView(this.rainApi, this.userManager.getUserId(), this.hashView, (Map)hashMap);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void showFragment(long l) {
        int n2;
        try {
            if (this.getSupportFragmentManager().getFragments() != null) {
                this.getSupportFragmentManager().beginTransaction().commitAllowingStateLoss();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if ((n2 = (int)l) != 4) {
            if (n2 != 5) {
                if (n2 != 6) {
                    if (n2 != 15) {
                        if (n2 == 17) {
                            this.getSupportFragmentManager().beginTransaction().replace(2131296507, (Fragment)new FavoritesFragment()).commitAllowingStateLoss();
                        }
                    } else {
                        this.getSupportFragmentManager().beginTransaction().replace(2131296507, (Fragment)new AuthorizationFragment()).commitAllowingStateLoss();
                    }
                } else {
                    this.getSupportFragmentManager().beginTransaction().replace(2131296507, (Fragment)new ProgramsFragment()).commitAllowingStateLoss();
                }
            } else {
                this.getSupportFragmentManager().beginTransaction().replace(2131296507, (Fragment)new ScheduleFragment(), "ScheduleFragment").commitAllowingStateLoss();
            }
        } else {
            this.getSupportFragmentManager().beginTransaction().replace(2131296507, (Fragment)new AllNewsFragment()).commitAllowingStateLoss();
        }
        this.hideProgress();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        block4: {
            CastHelper castHelper;
            try {
                castHelper = this.castHelper;
                if (castHelper == null) break block4;
            }
            catch (Exception exception) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (castHelper.getCastContext() == null) break block4;
            boolean bl = this.castHelper.getCastContext().onDispatchVolumeKeyEventBeforeJellyBean(keyEvent) || super.dispatchKeyEvent(keyEvent);
            return bl;
        }
        boolean bl = super.dispatchKeyEvent(keyEvent);
        return bl;
    }

    @Override
    public int getLayoutResource() {
        return 2131492900;
    }

    public boolean handleDrawerItemSelected(long l) {
        this.logDrawerItemSelected(l);
        if (l == 14L) {
            this.drawerManager.setPreviousSelection();
            this.logout();
            return true;
        }
        if (l == 11L) {
            this.drawerManager.setPreviousSelection();
            this.showAgreement(false);
            this.tagManager.logOpenView("Oferta");
            return true;
        }
        if (l == 12L) {
            this.drawerManager.setPreviousSelection();
            try {
                Intent intent = new Intent((Context)this, WebViewActivity.class);
                intent.putExtra("url", this.getString(2131755635));
                intent.putExtra("title", this.getString(2131755212));
                this.startActivity(intent);
                this.tagManager.logOpenView("Advertisement");
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            return true;
        }
        if (l == 13L) {
            this.drawerManager.setPreviousSelection();
            this.rateApp();
            return true;
        }
        if (l == 10L) {
            this.drawerManager.setPreviousSelection();
            this.sendSupportEmail();
            this.tagManager.logOpenView("Support");
            return true;
        }
        if (l == 20L) {
            this.drawerManager.setPreviousSelection();
            this.startActivity(new Intent((Context)this, LiveActivity.class));
            return true;
        }
        DrawerManager.Companion companion = DrawerManager.Companion;
        if (companion.isPlaylistIdentifier(l)) {
            this.drawerManager.setPreviousSelection();
            try {
                Intent intent = new Intent((Context)this, PlaylistActivity.class);
                intent.putExtra("id", companion.getPlaylistIdByIdentifier(l));
                this.startActivity(intent);
                this.tagManager.logOpenView("Newsletter");
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            return true;
        }
        if (l == 8L) {
            this.drawerManager.setPreviousSelection();
            try {
                this.startAudioLiveActivity();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            return true;
        }
        if (l == 9L) {
            this.drawerManager.setPreviousSelection();
            return true;
        }
        this.showFragment(l);
        this.drawerManager.setLastDrawerSelectionId(l);
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void handleNewUserInfo(UpdateDrawerHeaderEvent updateDrawerHeaderEvent) {
        try {
            UserManager userManager = (UserManager)this.userManagerWeakReference.get();
            DrawerManager drawerManager = (DrawerManager)this.drawerManagerWeakReference.get();
            if (drawerManager == null) return;
            if (userManager != null && userManager.isAuthorized()) {
                drawerManager.updateDrawerHeader(userManager.getRainUserInfo(), updateDrawerHeaderEvent.getProfileInfo());
                return;
            }
            drawerManager.setEmptyHeader();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void hideProgress() {
        try {
            this.mProgressFrame.setVisibility(8);
            this.mContentFrame.setVisibility(0);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void logout() {
        try {
            MaterialDialog.Builder builder = new MaterialDialog.Builder((Context)this);
            builder = builder.title(2131755202).content(2131755200).positiveText(2131755199).negativeText(2131755198).positiveColorRes(2131099728).negativeColorRes(2131099728);
            w2 w22 = new w2(this, 2);
            builder.onPositive(w22).show();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Subscribe
    public void onAuthPendingEnd(AuthPendingEnd authPendingEnd) {
        authPendingEnd = this.userManager.getRainUserInfo();
        if (authPendingEnd == null) {
            this.drawerManager.setEmptyHeader();
            return;
        }
        Integer n2 = authPendingEnd.favoritesCount;
        if (n2 != null) {
            this.drawerManager.updateFavoritesBadge(n2.intValue());
        }
        try {
            n2 = this.rainApi.getUserAccountsUrls(this.getAuthorization()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            x2 x22 = new x2(this, (UserInfo)authPendingEnd, 1);
            x2 x23 = new x2(this, (UserInfo)authPendingEnd, 2);
            this.addSubscription(n2.subscribe((Action1)x22, (Action1)x23));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void onBackPressed() {
        try {
            if (this.drawerManager.isDrawerOpen()) {
                this.drawerManager.closeDrawer();
            } else {
                super.onBackPressed();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @OnClick(value={2131296751})
    public void onClickLive() {
        this.startLiveActivity();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.checkPlayServices()) {
            this.finish();
            return;
        }
        this.castHelper = new CastHelper((AppCompatActivity)this, bundle);
        bundle = new DrawerManager((BaseActivity)this, new OnCheckedChangeListener(this.prefsManager){
            private WeakReference<PrefsManager> weakReference;
            {
                this.weakReference = new WeakReference((Object)prefsManager);
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void onCheckedChanged(IDrawerItem iDrawerItem, CompoundButton compoundButton, boolean bl) {
                try {
                    if (iDrawerItem.getIdentifier() != 9L) return;
                    if (this.weakReference.get() == null) return;
                    ((PrefsManager)this.weakReference.get()).putBoolean("push", bl);
                    if (bl) {
                        PushHelper.enablePushMessages();
                        return;
                    }
                    PushHelper.disablePushMessages();
                    return;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        this.drawerManager = bundle;
        bundle.init(new Drawer.OnDrawerItemClickListener(this){
            private WeakReference<MainActivity> weakReference;
            {
                this.weakReference = new WeakReference((Object)mainActivity);
            }

            @Override
            public boolean onItemClick(View object, int n2, IDrawerItem iDrawerItem) {
                long l = iDrawerItem.getIdentifier();
                object = (MainActivity)this.weakReference.get();
                boolean bl = object != null && ((MainActivity)object).handleDrawerItemSelected(l);
                return bl;
            }
        });
        this.loadUserInfo();
        this.hideToolbar();
        this.updatePlaylists();
        if (this.isPushEnabled()) {
            PushHelper.enablePushMessages();
        }
        if (this.isRateAllowed()) {
            this.showRateAppDialog();
            this.clearRateAllowedCounters();
        }
        if ((bundle = this.userManager) != null && bundle.isAuthorized()) {
            this.checkNewIntent(this.getIntent());
        }
        this.drawerManagerWeakReference = new WeakReference((Object)this.drawerManager);
        this.userManagerWeakReference = new WeakReference((Object)this.userManager);
        try {
            BusProvider.getInstance().register(this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.drawerManager.setEmptyHeader();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        CastHelper castHelper = this.castHelper;
        if (castHelper != null) {
            castHelper.destroy();
        }
        if ((castHelper = this.drawerManager) != null) {
            castHelper.destroy();
        }
        try {
            BusProvider.getInstance().unregister(this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void onMenuClicked() {
        if (!this.drawerManager.isDrawerOpen()) {
            this.drawerManager.openDrawer();
            if (this.isAuthorized()) {
                this.checkUser(new w2(this, 0), false);
            }
            this.tagManager.logOpenView("Menu");
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.setIntent(intent);
        this.checkNewIntent(intent);
    }

    @Override
    public void onPause() {
        try {
            this.castHelper.onPause();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (!this.isOnline()) {
            this.showConnectionErrorDialog();
            return;
        }
        try {
            this.castHelper.onResume();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            if (this.drawerManager.updateMenuState(this.isAuthorized()) && !this.mAuthPending) {
                this.loadUserInfo();
            }
            this.updateNotifications();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void onSearchClicked() {
        this.startActivity(new Intent((Context)this, SearchActivity.class));
        this.tagManager.logOpenView("Search");
    }

    @Override
    public void onSubscriptionClicked() {
        HashMap hashMap;
        try {
            hashMap = new HashMap();
            hashMap.put((Object)"category", (Object)"pay");
            hashMap.put((Object)"action", (Object)"click");
            hashMap.put((Object)"label", (Object)"to_subscribe");
            hashMap.put((Object)"value", (Object)"Main activity top");
            this.analyticsManager.logRainView(this.rainApi, this.userManager.getUserId(), this.hashView, (Map)hashMap);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.analyticsManager.logEvent(this.getString(2131755080), new String[]{this.getString(2131755484), "Main activity top"});
        hashMap = new Intent("android.intent.action.VIEW");
        hashMap.setData(Uri.parse((String)"https://tvrain.tv/donate/?from=android"));
        this.startActivity((Intent)hashMap);
    }

    @Override
    public void onUserAuthorized() {
        this.drawerManager.updateMenuState(this.isAuthorized());
        this.drawerManager.setSelection(4L, true);
        this.loadUserInfo();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void setupNotificationsCount(TextView textView) {
        try {
            int n2 = this.cache.getNotificationsCount();
            if (n2 < 1) {
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            if (n2 > 99) {
                textView.setText((CharSequence)"99+");
                return;
            }
            textView.setText((CharSequence)String.valueOf((int)n2));
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void showProgress() {
        try {
            this.mContentFrame.setVisibility(8);
            this.mProgressFrame.setVisibility(0);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void updatePlaylists() {
        this.addSubscription(this.rainApi.playlists(this.getAuthorization()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new w2(this, 3), (Action1)new v1(5)));
    }
}

