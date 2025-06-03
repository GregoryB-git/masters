/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.SearchManager
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Rect
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnLayoutChangeListener
 *  android.widget.AutoCompleteTextView
 *  android.widget.ListAdapter
 *  android.widget.TextView
 *  androidx.appcompat.widget.SearchView
 *  androidx.appcompat.widget.SearchView$OnQueryTextListener
 *  androidx.appcompat.widget.SearchView$SearchAutoComplete
 *  androidx.appcompat.widget.Toolbar
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ItemDecoration
 *  butterknife.BindView
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.concurrent.TimeUnit
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.search.Element
 *  ru.tvrain.core.data.search.SearchCategory
 *  ru.tvrain.core.data.search.SearchPlaceholdersResponse
 *  ru.tvrain.core.data.search.SearchResponse
 *  ru.tvrain.core.services.RainService
 *  rx.Observable
 *  rx.Subscription
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 */
package com.hintsolutions.raintv.search;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.hintsolutions.raintv.adapters.SearchCategoryAdapter;
import com.hintsolutions.raintv.adapters.SmallNewsListAdapter;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.search.SearchSuggestionsAdapter;
import com.hintsolutions.raintv.utils.Cache;
import com.hintsolutions.raintv.utils.CommonUtils;
import com.hintsolutions.raintv.utils.RecyclerViewPageUtils;
import com.hintsolutions.raintv.views.HorizontalSpaceItemDecoration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.search.Element;
import ru.tvrain.core.data.search.SearchCategory;
import ru.tvrain.core.data.search.SearchPlaceholdersResponse;
import ru.tvrain.core.data.search.SearchResponse;
import ru.tvrain.core.services.RainService;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class SearchActivity
extends BaseActivity
implements SearchView.OnQueryTextListener {
    private static final int ITEMS_PER_PAGE = 30;
    private static final int SEND_REQUEST_ON_TEXT_CHANGE_TIMEOUT = 1500;
    private static final String SUGGESTIONS_KEY = "suggestions";
    private static final int SUGGESTIONS_LIMIT = 100;
    private List<String> commonSuggestions;
    private int page = 1;
    private String query;
    private Subscription requestSubscription;
    @BindView(value=2131297106)
    public RecyclerView searchCategoriesView;
    private SearchCategoryAdapter searchCategoryAdapter;
    public List<Element> searchItems = new ArrayList();
    @BindView(value=2131297100)
    public TextView searchNotFound;
    private SmallNewsListAdapter searchResultsAdapter;
    @BindView(value=2131297103)
    public RecyclerView searchResultsView;
    private SearchView searchView;
    private Subscription sendRequestOnChangeTextTimeout;
    private SearchSuggestionsAdapter suggestionsAdapter;
    @BindView(value=2131297244)
    public Toolbar toolbar;
    private int totalPages = 2;

    public static /* synthetic */ void A(SearchActivity searchActivity) {
        searchActivity.sendSearchRequest();
    }

    public static /* synthetic */ void B(SearchActivity searchActivity, Long l4) {
        searchActivity.lambda$onQueryTextChange$9(l4);
    }

    public static /* synthetic */ void C(SearchActivity searchActivity, SearchPlaceholdersResponse searchPlaceholdersResponse) {
        searchActivity.lambda$getSearchPlaceholders$4(searchPlaceholdersResponse);
    }

    public static /* synthetic */ void D(SearchActivity searchActivity, boolean bl, SearchResponse searchResponse) {
        searchActivity.lambda$sendSearchRequest$6(bl, searchResponse);
    }

    public static /* synthetic */ void E(SearchActivity searchActivity, Throwable throwable) {
        searchActivity.lambda$sendSearchRequest$7(throwable);
    }

    public static /* synthetic */ void F(SearchActivity searchActivity, String string) {
        searchActivity.lambda$setupSearchView$2(string);
    }

    public static /* synthetic */ void G(SearchActivity searchActivity, Article article) {
        searchActivity.lambda$onCreate$1(article);
    }

    public static /* synthetic */ void H(SearchActivity searchActivity, View view, AutoCompleteTextView autoCompleteTextView, View view2, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        searchActivity.lambda$setupSuggestionsWidth$3(view, autoCompleteTextView, view2, n4, n5, n6, n7, n8, n9, n10, n11);
    }

    public static /* synthetic */ void I(SearchActivity searchActivity) {
        searchActivity.lambda$setSearchQueryText$8();
    }

    public static /* synthetic */ void J(SearchActivity searchActivity, Throwable throwable) {
        searchActivity.lambda$getSearchPlaceholders$5(throwable);
    }

    private void addSuggestion(String string) {
        if (string != null && !string.isEmpty()) {
            Object object = this.cache.getList(SUGGESTIONS_KEY);
            ArrayList arrayList = object;
            if (object == null) {
                arrayList = new ArrayList();
            }
            if (arrayList.contains((Object)string)) {
                arrayList.remove((Object)string);
            }
            arrayList.add(0, (Object)string);
            object = this.cache;
            string = arrayList.size() > 100 ? arrayList.subList(0, 100) : arrayList;
            ((Cache)object).setList(SUGGESTIONS_KEY, (List)string);
            this.suggestionsAdapter.setStoredSuggestions((List<String>)arrayList);
        }
    }

    private List<Article> filterResults(String string) {
        ArrayList arrayList = new ArrayList();
        Element element2 = this.searchItems;
        if (element2 != null && element2.size() != 0) {
            for (Element element2 : this.searchItems) {
                if (!element2.type.equals((Object)string) && !string.equals((Object)"All")) continue;
                arrayList.add((Object)element2.toArticle());
            }
        }
        return arrayList;
    }

    private void getSearchPlaceholders() {
        this.showProgressDialog();
        this.requestSubscription = this.rainApi.searchPlaceholders().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new h4(this, 0), (Action1)new h4(this, 1));
    }

    private /* synthetic */ void lambda$getSearchPlaceholders$4(SearchPlaceholdersResponse searchPlaceholdersResponse) {
        this.updateSearchPlaceholders(searchPlaceholdersResponse);
        this.searchView.setIconified(false);
        this.hideProgressDialog();
    }

    private /* synthetic */ void lambda$getSearchPlaceholders$5(Throwable throwable) {
        this.hideProgressDialog();
        this.searchView.setIconified(false);
        throwable.printStackTrace();
    }

    private /* synthetic */ void lambda$onCreate$0(SearchCategory searchCategory) {
        this.searchCategoryAdapter.setSelectedType(searchCategory.code);
        this.page = 1;
        this.sendSearchRequest();
    }

    private /* synthetic */ void lambda$onCreate$1(Article article) {
        if (this.searchCategoryAdapter.getSelectedType().equals((Object)"Teleshow")) {
            this.showProgramActivity(article.id);
        } else {
            this.showNewsActivity(article.id);
        }
    }

    private /* synthetic */ void lambda$onQueryTextChange$9(Long l4) {
        this.sendNewRequest();
    }

    private /* synthetic */ void lambda$sendSearchRequest$6(boolean bl, SearchResponse searchResponse) {
        if (this.page == 1 && searchResponse.elements.size() == 0) {
            this.searchNotFound.setVisibility(0);
        } else {
            this.searchNotFound.setVisibility(8);
        }
        this.totalPages = searchResponse.totalPages;
        if (this.page == 1) {
            this.searchItems = searchResponse.elements;
            if (bl) {
                this.searchCategoryAdapter.updateInfo((List<SearchCategory>)searchResponse.categories);
            }
        } else {
            this.searchItems.addAll((Collection)searchResponse.elements);
        }
        ++this.page;
        this.searchResultsAdapter.updateInfo(this.filterResults(this.searchCategoryAdapter.getSelectedType()));
        this.hideProgressDialog();
    }

    private /* synthetic */ void lambda$sendSearchRequest$7(Throwable throwable) {
        this.hideProgressDialog();
        throwable.printStackTrace();
    }

    private /* synthetic */ void lambda$setSearchQueryText$8() {
        this.searchView.setQuery((CharSequence)this.query, false);
    }

    private /* synthetic */ void lambda$setupSearchView$2(String string) {
        this.query = string;
        this.searchView.setQuery((CharSequence)string, false);
        this.sendNewRequest();
    }

    private /* synthetic */ void lambda$setupSuggestionsWidth$3(View view, AutoCompleteTextView autoCompleteTextView, View view2, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        view.getLocationOnScreen(new int[2]);
        view = new Rect();
        this.getWindowManager().getDefaultDisplay().getRectSize((Rect)view);
        autoCompleteTextView.setDropDownWidth(view.width());
    }

    private void sendNewRequest() {
        this.searchCategoryAdapter.setSelectedType("All");
        this.page = 1;
        this.totalPages = 2;
        this.sendSearchRequest();
        this.addSuggestion(this.query);
        Subscription subscription = this.sendRequestOnChangeTextTimeout;
        if (subscription != null && !subscription.isUnsubscribed()) {
            this.sendRequestOnChangeTextTimeout.unsubscribe();
        }
    }

    private void sendSearchRequest() {
        boolean bl;
        int n4;
        Object object = this.requestSubscription;
        if (object != null && !object.isUnsubscribed()) {
            if (this.page > 1) {
                return;
            }
            this.requestSubscription.unsubscribe();
        }
        if ((n4 = this.page) > this.totalPages) {
            return;
        }
        if (n4 == 1) {
            this.showProgressDialog();
        }
        object = (bl = this.searchCategoryAdapter.getSelectedType().equals((Object)"All")) ? null : this.searchCategoryAdapter.getSelectedType();
        RainService rainService = this.rainApi;
        String string = this.query;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.page);
        stringBuilder.append("/");
        stringBuilder.append(30);
        this.requestSubscription = object = rainService.search(string, (String)object, "0", stringBuilder.toString(), Integer.valueOf((int)1280), Integer.valueOf((int)720)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new a0(this, bl, 2), (Action1)new h4(this, 6));
        this.addSubscription((Subscription)object);
    }

    private void setSearchQueryText(Intent intent) {
        if ("android.intent.action.SEARCH".equals((Object)intent.getAction())) {
            this.query = intent.getStringExtra("query");
            this.searchView.post((Runnable)new h0(this, 7));
            this.sendNewRequest();
        }
    }

    private void setupSearchView() {
        SearchView searchView;
        this.searchView = searchView = (SearchView)this.findViewById(2131297098);
        searchView.setOnQueryTextListener((SearchView.OnQueryTextListener)this);
        searchView = (SearchView.SearchAutoComplete)this.searchView.findViewById(2131297104);
        Object object = (SearchManager)this.getSystemService("search");
        if (object != null) {
            this.searchView.setSearchableInfo(object.getSearchableInfo(this.getComponentName()));
        }
        object = new SearchSuggestionsAdapter(new h4(this, 5), null, this.cache.getList(SUGGESTIONS_KEY));
        this.suggestionsAdapter = object;
        searchView.setAdapter((ListAdapter)object);
        this.setupSuggestionsWidth();
    }

    private void setupSuggestionsWidth() {
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView)this.searchView.findViewById(2131297104);
        View view = this.searchView.findViewById(autoCompleteTextView.getDropDownAnchor());
        view.addOnLayoutChangeListener((View.OnLayoutChangeListener)new i4(this, view, autoCompleteTextView));
    }

    private void updateSearchPlaceholders(SearchPlaceholdersResponse searchPlaceholdersResponse) {
        if (searchPlaceholdersResponse.isEmpty()) {
            this.suggestionsAdapter.setCommonSuggestions(null);
        } else {
            this.suggestionsAdapter.setCommonSuggestions((List<String>)searchPlaceholdersResponse.placeholders);
        }
    }

    public static /* synthetic */ void z(SearchActivity searchActivity, SearchCategory searchCategory) {
        searchActivity.lambda$onCreate$0(searchCategory);
    }

    @Override
    public int getLayoutResource() {
        return 2131492909;
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.searchCategoryAdapter = new SearchCategoryAdapter(null, new h4(this, 2));
        this.searchResultsAdapter = new SmallNewsListAdapter((Context)this, null, new h4(this, 3));
        RecyclerViewPageUtils.setPaging(this.searchResultsView, 30, new h4(this, 4));
        this.searchCategoriesView.setAdapter((RecyclerView.Adapter)this.searchCategoryAdapter);
        int n4 = (int)this.getResources().getDimension(2131165339);
        this.searchCategoriesView.addItemDecoration((RecyclerView.ItemDecoration)new HorizontalSpaceItemDecoration(CommonUtils.dpToPx((Context)this, 4), n4, n4));
        this.searchResultsView.setAdapter((RecyclerView.Adapter)this.searchResultsAdapter);
        this.searchNotFound.setVisibility(8);
        this.commonSuggestions = bundle = new ArrayList();
        bundle.add((Object)"Test");
        this.setupSearchView();
        this.getSearchPlaceholders();
        bundle = this.getIntent();
        if ("android.intent.action.SEARCH".equals((Object)bundle.getAction())) {
            this.query = bundle.getStringExtra("query");
            this.setSearchQueryText((Intent)bundle);
            this.sendNewRequest();
        }
    }

    public void onNewIntent(Intent intent) {
        this.setIntent(intent);
        this.setSearchQueryText(intent);
    }

    public boolean onQueryTextChange(String string) {
        if (string != null && !string.isEmpty()) {
            String string2 = this.query;
            if (string2 != null && string2.equals((Object)string)) {
                return false;
            }
            this.query = string;
            string = this.sendRequestOnChangeTextTimeout;
            if (string != null && !string.isUnsubscribed()) {
                this.sendRequestOnChangeTextTimeout.unsubscribe();
            }
            string = Observable.timer((long)1500L, (TimeUnit)TimeUnit.MILLISECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).onBackpressureDrop().subscribe((Action1)new h4(this, 7), (Action1)new v1(25));
            this.sendRequestOnChangeTextTimeout = string;
            this.addSubscription((Subscription)string);
        }
        return false;
    }

    public boolean onQueryTextSubmit(String string) {
        return false;
    }
}

