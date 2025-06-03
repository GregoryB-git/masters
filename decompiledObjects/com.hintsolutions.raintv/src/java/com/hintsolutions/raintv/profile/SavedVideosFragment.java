/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  androidx.annotation.Nullable
 *  androidx.recyclerview.widget.DefaultItemAnimator
 *  androidx.recyclerview.widget.GridLayoutManager
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ItemAnimator
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  butterknife.OnClick
 *  com.google.android.gms.tagmanager.DataLayer
 *  com.google.android.material.appbar.AppBarLayout
 *  com.google.gson.Gson
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  okhttp3.ResponseBody
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.utils.ListUtils
 *  ru.tvrain.core.utils.PojoHelper
 *  rx.Observable
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 *  tvrain.analytics.tagmanager.TagManager
 *  tvrain.analytics.tagmanager.TagManagerUtils
 *  tvrain.managers.PrefsManager
 *  tvrain.services.bus.BusProvider
 *  tvrain.services.bus.events.NewOfflineVideoEvent
 *  tvrain.services.bus.events.UserInfoReadyEvent
 */
package com.hintsolutions.raintv.profile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.google.android.gms.tagmanager.DataLayer;
import com.google.android.material.appbar.AppBarLayout;
import com.google.gson.Gson;
import com.hintsolutions.raintv.adapters.SavedVideosAdapter;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.common.BaseFragment;
import com.hintsolutions.raintv.interfaces.OnFragmentInteractionListener;
import com.hintsolutions.raintv.interfaces.OnSavedVideosListItemClickListener;
import com.hintsolutions.raintv.profile.b;
import com.hintsolutions.raintv.services.video.SavedVideoHolder;
import com.hintsolutions.raintv.services.video.SavedVideos;
import com.hintsolutions.raintv.utils.CommonUtils;
import com.hintsolutions.raintv.video.LocalVideoActivity;
import com.squareup.otto.Subscribe;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.ResponseBody;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.utils.ListUtils;
import ru.tvrain.core.utils.PojoHelper;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import tvrain.analytics.tagmanager.TagManager;
import tvrain.analytics.tagmanager.TagManagerUtils;
import tvrain.managers.PrefsManager;
import tvrain.services.bus.BusProvider;
import tvrain.services.bus.events.NewOfflineVideoEvent;
import tvrain.services.bus.events.UserInfoReadyEvent;

public class SavedVideosFragment
extends BaseFragment {
    private SavedVideosAdapter adapter;
    @BindView(value=2131296360)
    public AppBarLayout appBar;
    private ArrayList<SavedVideoHolder> data = new ArrayList();
    @BindView(value=2131296581)
    public TextView emptyLabel;
    @BindView(value=2131296582)
    public View emptyView;
    private OnFragmentInteractionListener mListener;
    @BindView(value=2131297051)
    public RecyclerView mRecyclerView;
    @BindView(value=2131297054)
    public TextView retryButton;
    @BindView(value=2131297172)
    public TextView subscription;
    @BindView(value=2131297237)
    public TextView title;
    @BindView(value=2131297243)
    public TextView toggleBadgeTextView;

    public static /* synthetic */ void access$000(SavedVideosFragment savedVideosFragment, SavedVideoHolder savedVideoHolder) {
        savedVideosFragment.showResumeVideoDialog(savedVideoHolder);
    }

    public static /* synthetic */ void access$100(SavedVideosFragment savedVideosFragment, SavedVideoHolder savedVideoHolder, long l4) {
        savedVideosFragment.showVideoActivity(savedVideoHolder, l4);
    }

    public static /* synthetic */ void access$200(SavedVideosFragment savedVideosFragment, SavedVideoHolder savedVideoHolder) {
        savedVideosFragment.removeVideoAfterConfirmation(savedVideoHolder);
    }

    public static /* synthetic */ void b(SavedVideosFragment savedVideosFragment, SavedVideoHolder savedVideoHolder, MaterialDialog materialDialog, DialogAction dialogAction) {
        savedVideosFragment.lambda$showResumeVideoDialog$2(savedVideoHolder, materialDialog, dialogAction);
    }

    public static /* synthetic */ void c(SavedVideosFragment savedVideosFragment, Throwable throwable) {
        savedVideosFragment.lambda$migrate$1(throwable);
    }

    public static /* synthetic */ void d(SavedVideosFragment savedVideosFragment, SavedVideoHolder savedVideoHolder, MaterialDialog materialDialog, DialogAction dialogAction) {
        savedVideosFragment.lambda$showResumeVideoDialog$3(savedVideoHolder, materialDialog, dialogAction);
    }

    public static /* synthetic */ void e(SavedVideosFragment savedVideosFragment, File file, ResponseBody responseBody) {
        savedVideosFragment.lambda$migrate$0(file, responseBody);
    }

    public static /* synthetic */ void f(SavedVideosFragment savedVideosFragment, SavedVideoHolder savedVideoHolder) {
        savedVideosFragment.lambda$removeVideoAfterConfirmation$4(savedVideoHolder);
    }

    private String getFileName(File object) {
        try {
            object = object.getName().replace((CharSequence)".mp4", (CharSequence)"");
            return object;
        }
        catch (Exception exception) {
            return "";
        }
    }

    private void gtmLogOpenView(int n4) {
        Map map = DataLayer.mapOf((Object[])new Object[]{"downloaded_videos", n4});
        BaseActivity baseActivity = (BaseActivity)this.getActivity();
        this.activityInterface.getTagManager().logOpenView("Downloaded", map);
    }

    private void gtmLogRemoveVideo() {
        List<SavedVideoHolder> list = SavedVideos.getSavedVideos(this.prefsManager);
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"downloaded_videos", (Object)list.size());
        this.activityInterface.getTagManager().logEvent("delete_download", null, (Map)hashMap);
    }

    private void initViews() {
        if (this.mListener == null) {
            this.appBar.setVisibility(8);
        }
        this.emptyLabel.setText((CharSequence)this.getString(2131755480));
        this.retryButton.setVisibility(8);
        this.adapter = new SavedVideosAdapter((Context)this.getActivity(), (List<SavedVideoHolder>)this.data, new OnSavedVideosListItemClickListener(this){
            public final SavedVideosFragment this$0;
            {
                this.this$0 = savedVideosFragment;
            }

            public void onClicked(SavedVideoHolder savedVideoHolder) {
                if (savedVideoHolder.hasPosition()) {
                    SavedVideosFragment.access$000(this.this$0, savedVideoHolder);
                } else {
                    SavedVideosFragment.access$100(this.this$0, savedVideoHolder, 0L);
                }
            }

            public void onRemoveClicked(SavedVideoHolder savedVideoHolder) {
                try {
                    SavedVideosFragment.access$200(this.this$0, savedVideoHolder);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        if (this.getResources().getBoolean(2131034122)) {
            this.mRecyclerView.setLayoutManager((RecyclerView.LayoutManager)new GridLayoutManager((Context)this.getActivity(), 2));
        } else {
            this.mRecyclerView.setLayoutManager((RecyclerView.LayoutManager)new LinearLayoutManager((Context)this.getActivity()));
        }
        this.mRecyclerView.setAdapter((RecyclerView.Adapter)this.adapter);
        this.mRecyclerView.setItemAnimator((RecyclerView.ItemAnimator)new DefaultItemAnimator());
        OnFragmentInteractionListener onFragmentInteractionListener = this.mListener;
        if (onFragmentInteractionListener != null) {
            onFragmentInteractionListener.setupNotificationsCount(this.toggleBadgeTextView);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void lambda$migrate$0(File var1_1, ResponseBody var2_4) {
        var4_5 = new ArrayList();
        var2_4 /* !! */  = PojoHelper.arrayFromResponse((ResponseBody)var2_4 /* !! */ , Article.class);
        var3_6 = ListUtils.isEmptyList((List)var2_4 /* !! */ );
        if (var3_6) ** GOTO lbl25
        try {
            for (Article var5_8 : var2_4 /* !! */ ) {
                var7_9 = new StringBuilder();
                var7_9.append(var1_1.getAbsolutePath());
                var7_9.append("/");
                var7_9.append(String.valueOf((int)var5_8.id));
                var7_9.append(".mp4");
                var2_4 /* !! */  = new SavedVideoHolder(var5_8, var7_9.toString());
                var4_5.add((Object)var2_4 /* !! */ );
            }
            ** GOTO lbl25
        }
        catch (Exception var1_2) {
            try {
                var1_2.printStackTrace();
lbl25:
                // 3 sources

                this.saveList((ArrayList<SavedVideoHolder>)var4_5);
                this.loadVideos();
lbl27:
                // 2 sources

                return;
            }
            catch (Exception var1_3) {
                ** continue;
            }
        }
    }

    private /* synthetic */ void lambda$migrate$1(Throwable throwable) {
        this.loadVideos();
    }

    private /* synthetic */ void lambda$removeVideoAfterConfirmation$4(SavedVideoHolder savedVideoHolder) {
        this.removeVideo(savedVideoHolder);
    }

    private /* synthetic */ void lambda$showResumeVideoDialog$2(SavedVideoHolder savedVideoHolder, MaterialDialog materialDialog, DialogAction dialogAction) {
        this.showVideoActivity(savedVideoHolder, savedVideoHolder.getPosition());
    }

    private /* synthetic */ void lambda$showResumeVideoDialog$3(SavedVideoHolder savedVideoHolder, MaterialDialog materialDialog, DialogAction dialogAction) {
        this.showVideoActivity(savedVideoHolder, 0L);
    }

    private void loadVideos() {
        try {
            List<SavedVideoHolder> list = SavedVideos.getSavedVideos(this.prefsManager);
            this.gtmLogOpenView(list.size());
            if (ListUtils.isEmptyList(list)) {
                this.data.clear();
                this.adapter.notifyDataSetChanged();
                this.emptyView.setVisibility(0);
                this.emptyLabel.setText((CharSequence)this.getString(2131755480));
                this.retryButton.setVisibility(8);
            } else {
                this.emptyView.setVisibility(8);
                this.data.clear();
                Collections.reverse(list);
                this.data.addAll(list);
                this.adapter.notifyDataSetChanged();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void migrate() {
        Object object = this.prefsManager;
        if (!object.getBoolean("migration_complete", false)) {
            Observable observable;
            Object object2;
            block8: {
                object2 = new ArrayList();
                object = new File(CommonUtils.getDownloadedVideoFolderPath(this.getActivity().getApplicationContext()));
                if (!object.exists()) break block8;
                observable = object.listFiles();
                int n4 = ((File[])observable).length;
                for (int j = 0; j < n4; ++j) {
                    object2.add((Object)this.getFileName(observable[j]));
                    continue;
                }
            }
            try {
                if (!ListUtils.isEmptyList((List)object2)) {
                    object2 = TextUtils.join((CharSequence)"_", (Object[])object2.toArray());
                    observable = this.rainApi.articlesById(this.getAuthorization(), Integer.valueOf((int)1280), Integer.valueOf((int)720), (String)object2).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
                    object2 = new b((Object)this, object);
                    object = new s((Object)this, 2);
                    this.addSubscription(observable.subscribe((Action1)object2, (Action1)object));
                } else {
                    this.loadVideos();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private void removeVideo(SavedVideoHolder savedVideoHolder) {
        try {
            SavedVideos.removeSavedVideo((Activity)this.getActivity(), this.prefsManager, savedVideoHolder);
            this.showToast(this.getString(2131755647));
            this.gtmLogRemoveVideo();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.loadVideos();
    }

    private void removeVideoAfterConfirmation(SavedVideoHolder savedVideoHolder) {
        this.showDialog(this.getString(2131755202), this.getString(2131755540), new f4(this, savedVideoHolder, 0), true);
    }

    private void saveList(ArrayList<SavedVideoHolder> gson) {
        try {
            SavedVideos savedVideos = new SavedVideos((List<SavedVideoHolder>)gson);
            PrefsManager prefsManager = this.prefsManager;
            gson = new Gson();
            prefsManager.putString("saved_videos", gson.toJson((Object)savedVideos));
            this.prefsManager.putBoolean("migration_complete", true);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void showResumeVideoDialog(SavedVideoHolder savedVideoHolder) {
        new MaterialDialog.Builder((Context)this.getActivity()).positiveColorRes(2131099728).negativeColorRes(2131099728).content(2131755475).positiveText(2131755476).negativeText(2131755477).onPositive(new f4(this, savedVideoHolder, 1)).onNegative(new f4(this, savedVideoHolder, 2)).cancelable(true).show();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void showVideoActivity(SavedVideoHolder savedVideoHolder, long l4) {
        try {
            Intent intent = new Intent((Context)this.getActivity(), LocalVideoActivity.class);
            intent.putExtra("video", (Parcelable)savedVideoHolder);
            intent.putExtra("from", "Downloaded");
            if (l4 != 0L) {
                intent.putExtra("position", l4);
            }
            this.startActivity(intent);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.mListener = (OnFragmentInteractionListener)context;
        }
        catch (Exception exception) {}
        try {
            BusProvider.getInstance().register((Object)this);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        layoutInflater = layoutInflater.inflate(2131492979, viewGroup, false);
        this.unbinder = ButterKnife.bind((Object)((Object)this), (View)layoutInflater);
        this.initViews();
        this.loadVideos();
        this.migrate();
        return layoutInflater;
    }

    @Override
    public void onDetach() {
        try {
            BusProvider.getInstance().unregister((Object)this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.mListener = null;
        super.onDetach();
    }

    @OnClick(value={2131296851})
    public void onMenuClicked() {
        OnFragmentInteractionListener onFragmentInteractionListener = this.mListener;
        if (onFragmentInteractionListener != null) {
            onFragmentInteractionListener.onMenuClicked();
        }
    }

    @Subscribe
    public void onNewVideo(NewOfflineVideoEvent newOfflineVideoEvent) {
        this.loadVideos();
    }

    public void onResume() {
        super.onResume();
        this.loadVideos();
        this.subscription.setVisibility(8);
    }

    @OnClick(value={2131297054})
    public void onRetryClicked() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"category", (Object)"pay");
            hashMap.put((Object)"action", (Object)"click");
            hashMap.put((Object)"label", (Object)"to_subscribe");
            hashMap.put((Object)"value", (Object)"Saved videos");
            this.analyticsManager.logRainView(this.rainApi, this.userManager.getUserId(), this.hashView, (Map)hashMap);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.analyticsManager.logEvent(this.getString(2131755080), new String[]{this.getString(2131755484), "Saved videos"});
    }

    @OnClick(value={2131297172})
    public void onSubscriptionClicked() {
        if (this.mListener != null) {
            TagManagerUtils.logPayWallClick((TagManager)this.activityInterface.getTagManager(), (String)"\u0448\u0430\u043f\u043a\u0430 \u0432 \u0437\u0430\u0433\u0440\u0443\u0436\u0435\u043d\u043d\u044b\u0445 \u0432\u0438\u0434\u0435\u043e");
            this.mListener.onSubscriptionClicked();
        }
    }

    @Subscribe
    public void onUserInfoReady(UserInfoReadyEvent userInfoReadyEvent) {
        this.loadVideos();
    }
}

