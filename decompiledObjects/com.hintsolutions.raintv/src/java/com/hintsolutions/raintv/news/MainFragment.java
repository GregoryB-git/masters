/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.os.StrictMode$ThreadPolicy$Builder
 *  android.text.Html
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ListAdapter
 *  android.widget.Toast
 *  androidx.swiperefreshlayout.widget.SwipeRefreshLayout
 *  androidx.swiperefreshlayout.widget.SwipeRefreshLayout$OnRefreshListener
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  retrofit2.HttpException
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.ArticleWidgetHtml
 *  ru.tvrain.core.data.FirstScreenResponseItem
 *  ru.tvrain.core.data.FirstScreenResponseItemRecord
 *  ru.tvrain.core.utils.ListUtils
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 *  za.co.immedia.pinnedheaderlistview.PinnedHeaderListView
 */
package com.hintsolutions.raintv.news;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.Toast;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.common.BaseFragment;
import com.hintsolutions.raintv.news.adapters.AllNewsSectionedAdapter;
import com.hintsolutions.raintv.views.RainFooterViewItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import retrofit2.HttpException;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.ArticleWidgetHtml;
import ru.tvrain.core.data.FirstScreenResponseItem;
import ru.tvrain.core.data.FirstScreenResponseItemRecord;
import ru.tvrain.core.utils.ListUtils;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import za.co.immedia.pinnedheaderlistview.PinnedHeaderListView;

public class MainFragment
extends BaseFragment {
    public static final String ARG_DATA = "data";
    private ArrayList<FirstScreenResponseItem> data;
    @BindView(value=2131296747)
    public PinnedHeaderListView mPinnedHeaderListView;
    private AllNewsSectionedAdapter mSectionedAdapter;
    @BindView(value=2131297179)
    public SwipeRefreshLayout swipeRefreshLayout;

    public static /* synthetic */ void b(MainFragment mainFragment, ArrayList arrayList) {
        mainFragment.lambda$loadData$0(arrayList);
    }

    public static /* synthetic */ void c(MainFragment mainFragment, Article article, Runnable runnable) {
        mainFragment.lambda$onCreateView$2(article, runnable);
    }

    public static /* synthetic */ void d(MainFragment mainFragment, Throwable throwable) {
        mainFragment.lambda$loadData$1(throwable);
    }

    public static /* synthetic */ void e(MainFragment mainFragment) {
        mainFragment.lambda$onCreateView$3();
    }

    private List<Article> getAllArticlesFromResponse(ArrayList<FirstScreenResponseItem> iterator) {
        HashMap hashMap = new HashMap();
        for (FirstScreenResponseItem firstScreenResponseItem : iterator) {
            boolean bl = firstScreenResponseItem.template.equals((Object)"default") && firstScreenResponseItem.code.equals((Object)"api_themesoftheday");
            if (!bl && !firstScreenResponseItem.template.equals((Object)"api_default") && !firstScreenResponseItem.template.equals((Object)"api_slider")) continue;
            for (FirstScreenResponseItemRecord firstScreenResponseItemRecord : firstScreenResponseItem.items) {
                Integer n2 = firstScreenResponseItemRecord.id;
                if (n2 == null) continue;
                hashMap.put((Object)n2, (Object)firstScreenResponseItemRecord.toArticle());
            }
        }
        return new ArrayList(hashMap.values());
    }

    private void gtmLogOpenView() {
        this.activityInterface.getTagManager().logOpenView("Main");
    }

    private void indexArticles(List<Article> iterator) {
        if (!ListUtils.isEmptyList(iterator)) {
            for (Article article : iterator) {
                try {
                    if (!TextUtils.isEmpty((CharSequence)this.cache.getString(String.valueOf((int)article.id)))) continue;
                    this.cache.putString(String.valueOf((int)article.id), String.valueOf((int)article.id));
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    private /* synthetic */ void lambda$loadData$0(ArrayList arrayList) {
        this.mSectionedAdapter.setupWith((ArrayList<FirstScreenResponseItem>)arrayList);
        this.swipeRefreshLayout.setRefreshing(false);
        this.indexArticles(this.getAllArticlesFromResponse((ArrayList<FirstScreenResponseItem>)arrayList));
    }

    private /* synthetic */ void lambda$loadData$1(Throwable throwable) {
        this.swipeRefreshLayout.setRefreshing(false);
        if (this.getActivity() != null) {
            Toast.makeText((Context)this.getActivity(), (CharSequence)this.getString(2131755235), (int)0).show();
        }
        if (throwable != null && this.getHttpCode(throwable) == 403) {
            this.getActivity().recreate();
        }
    }

    private /* synthetic */ void lambda$onCreateView$2(Article article, Runnable runnable) {
        if (this.getActivity() != null && this.getActivity() instanceof BaseActivity) {
            ((BaseActivity)this.getActivity()).toggleFav(article, true, runnable);
        }
    }

    private /* synthetic */ void lambda$onCreateView$3() {
        this.loadData();
    }

    private void loadData() {
        this.addSubscription(this.rainApi.firstScreen(this.getAuthorization()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new y2(this, 0), (Action1)new y2(this, 1)));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String loadUnderMainHeaderWidget() {
        ArticleWidgetHtml articleWidgetHtml;
        String string = "";
        try {
            String string2 = this.rainApi.getUnderMainHeader().toBlocking();
            articleWidgetHtml = new ArticleWidgetHtml();
            articleWidgetHtml = (ArticleWidgetHtml)string2.firstOrDefault((Object)articleWidgetHtml);
            string2 = string;
            if (articleWidgetHtml == null) return string2;
        }
        catch (HttpException httpException) {
            return string;
        }
        if (articleWidgetHtml.active >= 1) return Html.fromHtml((String)articleWidgetHtml.textHtml, (int)63).toString().trim();
        return string;
    }

    public static MainFragment newInstance(ArrayList<FirstScreenResponseItem> arrayList) {
        MainFragment mainFragment = new MainFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(ARG_DATA, arrayList);
        mainFragment.setArguments(bundle);
        return mainFragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.getArguments() != null) {
            try {
                this.data = (ArrayList)this.getArguments().getSerializable(ARG_DATA);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)new StrictMode.ThreadPolicy.Builder().permitAll().build());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        layoutInflater = layoutInflater.inflate(2131492974, object, false);
        try {
            this.unbinder = ButterKnife.bind((Object)((Object)this), (View)layoutInflater);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (this.data == null) {
            return layoutInflater;
        }
        this.mPinnedHeaderListView.setPinHeaders(false);
        this.mPinnedHeaderListView.addFooterView(new RainFooterViewItem((Context)this.getActivity()).getView(null));
        this.mSectionedAdapter = new AllNewsSectionedAdapter((Context)this.getActivity(), this.activityInterface.isTablet(), new y2(this, 2), this.userManager);
        object = this.loadUnderMainHeaderWidget();
        this.mSectionedAdapter.setUnderMainHeaderText((String)object);
        this.mSectionedAdapter.setupWith(this.data);
        this.mPinnedHeaderListView.setAdapter((ListAdapter)this.mSectionedAdapter);
        this.swipeRefreshLayout.setOnRefreshListener((SwipeRefreshLayout.OnRefreshListener)new y2(this, 3));
        this.indexArticles(this.getAllArticlesFromResponse(this.data));
        this.gtmLogOpenView();
        return layoutInflater;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        AllNewsSectionedAdapter allNewsSectionedAdapter = this.mSectionedAdapter;
        if (allNewsSectionedAdapter != null) {
            allNewsSectionedAdapter.destroy();
        }
    }

    public void onResume() {
        super.onResume();
    }
}

