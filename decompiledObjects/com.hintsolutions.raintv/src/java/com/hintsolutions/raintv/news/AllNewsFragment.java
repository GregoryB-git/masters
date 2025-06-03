/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.TextView
 *  android.widget.Toast
 *  androidx.fragment.app.Fragment
 *  androidx.viewpager.widget.PagerAdapter
 *  androidx.viewpager.widget.ViewPager
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  butterknife.OnClick
 *  com.google.android.material.tabs.TabLayout
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  ru.tvrain.core.data.FirstScreenResponseItem
 *  ru.tvrain.core.data.FirstScreenResponseItemRecord
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 *  tvrain.analytics.tagmanager.TagManager
 *  tvrain.analytics.tagmanager.TagManagerUtils
 */
package com.hintsolutions.raintv.news;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.tabs.TabLayout;
import com.hintsolutions.raintv.adapters.ViewPagerAdapter;
import com.hintsolutions.raintv.common.BaseFragment;
import com.hintsolutions.raintv.interfaces.OnFragmentInteractionListener;
import com.hintsolutions.raintv.news.MainFragment;
import com.hintsolutions.raintv.news.NewsActivity;
import com.hintsolutions.raintv.news.StoryFragment;
import com.hintsolutions.raintv.programs.TeleshowFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.tvrain.core.data.FirstScreenResponseItem;
import ru.tvrain.core.data.FirstScreenResponseItemRecord;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import tvrain.analytics.tagmanager.TagManager;
import tvrain.analytics.tagmanager.TagManagerUtils;

public class AllNewsFragment
extends BaseFragment {
    private static final String CACHE_KEY_BREAKING_NEWS_CLOSED = "breaking_news_closed";
    private int breakingNewsId;
    @BindView(value=2131296407)
    public View breakingNewsLayout;
    @BindView(value=2131296408)
    public TextView breakingNewsText;
    @BindView(value=2131297245)
    public Button donateBtn;
    private OnFragmentInteractionListener mListener;
    @BindView(value=2131297246)
    public TextView mTitleTextView;
    @BindView(value=2131296990)
    public ViewPager pager;
    @BindView(value=2131297172)
    public TextView subscription;
    @BindView(value=2131297183)
    public TabLayout tabs;
    @BindView(value=2131297243)
    public TextView toggleBadgeTextView;

    public static /* synthetic */ void b(AllNewsFragment allNewsFragment, ArrayList arrayList) {
        allNewsFragment.lambda$loadData$0(arrayList);
    }

    public static /* synthetic */ void c(AllNewsFragment allNewsFragment, Throwable throwable) {
        allNewsFragment.lambda$loadData$1(throwable);
    }

    private List<FirstScreenResponseItemRecord> getResponseItemsByCode(ArrayList<FirstScreenResponseItem> iterator, String string) {
        for (FirstScreenResponseItem firstScreenResponseItem : iterator) {
            if (!firstScreenResponseItem.code.equals((Object)string)) continue;
            return firstScreenResponseItem.items;
        }
        return null;
    }

    private void gtmLogOpenView() {
        this.activityInterface.getTagManager().logOpenView("Main");
    }

    private /* synthetic */ void lambda$loadData$0(ArrayList object) {
        this.setupViewPager((ArrayList<FirstScreenResponseItem>)object);
        this.updateBreakingNews((ArrayList<FirstScreenResponseItem>)object);
        object = this.mListener;
        if (object != null) {
            object.hideProgress();
        }
    }

    private /* synthetic */ void lambda$loadData$1(Throwable throwable) {
        OnFragmentInteractionListener onFragmentInteractionListener = this.mListener;
        if (onFragmentInteractionListener != null) {
            onFragmentInteractionListener.hideProgress();
        }
        if (this.getActivity() != null) {
            Toast.makeText((Context)this.getActivity(), (CharSequence)this.getString(2131755235), (int)0).show();
        }
        if (throwable != null && this.getHttpCode(throwable) == 403) {
            this.getActivity().recreate();
        }
    }

    private void loadData() {
        OnFragmentInteractionListener onFragmentInteractionListener = this.mListener;
        if (onFragmentInteractionListener != null) {
            onFragmentInteractionListener.showProgress();
        }
        this.addSubscription(this.rainApi.firstScreen(this.getAuthorization()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new k(this, 0), (Action1)new k(this, 1)));
    }

    private void setupViewPager(ArrayList<FirstScreenResponseItem> arrayList) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getFragmentManager());
        Object object = this.getResponseItemsByCode(arrayList, "api_menu");
        if (object != null) {
            for (FirstScreenResponseItemRecord firstScreenResponseItemRecord : object) {
                object = null;
                String string = firstScreenResponseItemRecord.entityType;
                string.getClass();
                int n2 = -1;
                switch (string.hashCode()) {
                    default: {
                        break;
                    }
                    case 80218325: {
                        if (!string.equals((Object)"Story")) break;
                        n2 = 2;
                        break;
                    }
                    case 3343801: {
                        if (!string.equals((Object)"main")) break;
                        n2 = 1;
                        break;
                    }
                    case -1295475257: {
                        if (!string.equals((Object)"Teleshow")) break;
                        n2 = 0;
                    }
                }
                switch (n2) {
                    default: {
                        break;
                    }
                    case 2: {
                        object = StoryFragment.newInstance(firstScreenResponseItemRecord.id);
                        break;
                    }
                    case 1: {
                        object = MainFragment.newInstance(arrayList);
                        break;
                    }
                    case 0: {
                        object = TeleshowFragment.newInstance(firstScreenResponseItemRecord.id, false);
                    }
                }
                if (object == null) continue;
                viewPagerAdapter.addFragment((Fragment)object, firstScreenResponseItemRecord.name);
            }
        }
        this.pager.setAdapter((PagerAdapter)viewPagerAdapter);
        this.tabs.setupWithViewPager(this.pager);
    }

    private void updateBreakingNews(ArrayList<FirstScreenResponseItem> view) {
        int n2;
        int n4 = this.cache.getInt(CACHE_KEY_BREAKING_NEWS_CLOSED);
        int n5 = 8;
        if (view != null && ((n2 = this.breakingNewsId) == 0 || n4 != n2)) {
            block6: {
                Object var6_7;
                FirstScreenResponseItem firstScreenResponseItem;
                Iterator iterator = view.iterator();
                do {
                    boolean bl = iterator.hasNext();
                    var6_7 = null;
                    view = var6_7;
                    if (!bl) break block6;
                    firstScreenResponseItem = (FirstScreenResponseItem)iterator.next();
                } while (!firstScreenResponseItem.code.equals((Object)"api_breaking"));
                iterator = firstScreenResponseItem.items;
                view = var6_7;
                if (iterator != null) {
                    view = var6_7;
                    if (iterator.size() > 0) {
                        view = (FirstScreenResponseItemRecord)firstScreenResponseItem.items.get(0);
                    }
                }
            }
            if (view != null) {
                this.breakingNewsText.setText((CharSequence)view.name);
                this.breakingNewsId = n2 = view.id.intValue();
                view = this.breakingNewsLayout;
                if (n4 != n2) {
                    n5 = 0;
                }
                view.setVisibility(n5);
            }
            return;
        }
        this.breakingNewsLayout.setVisibility(8);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.mListener = (OnFragmentInteractionListener)context;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @OnClick(value={2131296408})
    public void onBreakingNewsClicked() {
        this.cache.putInt(CACHE_KEY_BREAKING_NEWS_CLOSED, this.breakingNewsId);
        this.updateBreakingNews(null);
        Intent intent = new Intent(this.getContext(), NewsActivity.class);
        intent.putExtra("id", this.breakingNewsId);
        this.getContext().startActivity(intent);
    }

    @OnClick(value={2131297245})
    public void onClickDonate() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse((String)"https://tvrain.tv/donate/?from=android"));
            this.startActivity(intent);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @OnClick(value={2131296406})
    public void onCloseBreakingNewsClicked() {
        this.cache.putInt(CACHE_KEY_BREAKING_NEWS_CLOSED, this.breakingNewsId);
        this.updateBreakingNews(null);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        layoutInflater = layoutInflater.inflate(2131492965, (ViewGroup)object, false);
        try {
            this.unbinder = ButterKnife.bind((Object)((Object)this), (View)layoutInflater);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.mTitleTextView.setText((CharSequence)this.getString(2131755052));
        this.donateBtn.setText(2131755587);
        object = this.mListener;
        if (object != null) {
            object.setupNotificationsCount(this.toggleBadgeTextView);
        }
        this.gtmLogOpenView();
        this.updateBreakingNews(null);
        this.loadData();
        return layoutInflater;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        this.mListener = null;
    }

    @OnClick(value={2131296851})
    public void onMenuClicked() {
        OnFragmentInteractionListener onFragmentInteractionListener = this.mListener;
        if (onFragmentInteractionListener != null) {
            onFragmentInteractionListener.onMenuClicked();
        }
    }

    public void onResume() {
        super.onResume();
    }

    @OnClick(value={2131297091})
    public void onSearchClicked() {
        OnFragmentInteractionListener onFragmentInteractionListener = this.mListener;
        if (onFragmentInteractionListener != null) {
            onFragmentInteractionListener.onSearchClicked();
        }
    }

    @OnClick(value={2131297172})
    public void onSubscriptionClicked() {
        if (this.mListener != null) {
            TagManagerUtils.logPayWallClick((TagManager)this.activityInterface.getTagManager(), (String)"\u0448\u0430\u043f\u043a\u0430 \u043d\u0430 \u0433\u043b\u0430\u0432\u043d\u043e\u0439");
            this.mListener.onSubscriptionClicked();
        }
    }
}

