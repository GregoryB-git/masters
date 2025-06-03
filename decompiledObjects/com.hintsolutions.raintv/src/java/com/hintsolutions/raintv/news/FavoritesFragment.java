/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.recyclerview.widget.DefaultItemAnimator
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ItemAnimator
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  ru.tvrain.core.Consts
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.Articles
 *  ru.tvrain.core.utils.ListUtils
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 *  tvrain.analytics.tagmanager.TagManager
 *  tvrain.analytics.tagmanager.TagManagerUtils
 *  tvrain.services.bus.BusProvider
 */
package com.hintsolutions.raintv.news;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.hintsolutions.raintv.MainActivity;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.common.BaseFragment;
import com.hintsolutions.raintv.databinding.FragmentFavoritesBinding;
import com.hintsolutions.raintv.databinding.SubscriptionBinding;
import com.hintsolutions.raintv.databinding.ToolbarMainActivityBinding;
import com.hintsolutions.raintv.databinding.ViewEmptyBinding;
import com.hintsolutions.raintv.interfaces.OnFragmentInteractionListener;
import com.hintsolutions.raintv.news.NewsActivity;
import com.hintsolutions.raintv.news.adapters.BestNewsAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.tvrain.core.Consts;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.Articles;
import ru.tvrain.core.utils.ListUtils;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import tvrain.analytics.tagmanager.TagManager;
import tvrain.analytics.tagmanager.TagManagerUtils;
import tvrain.services.bus.BusProvider;

@Metadata(d1={"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0013H\u0016J\b\u0010\"\u001a\u00020\u0013H\u0016J\b\u0010#\u001a\u00020\u0013H\u0016J\u001a\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0016\u0010&\u001a\u00020\u00132\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070(H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2={"Lcom/hintsolutions/raintv/news/FavoritesFragment;", "Lcom/hintsolutions/raintv/common/BaseFragment;", "()V", "adapter", "Lcom/hintsolutions/raintv/news/adapters/BestNewsAdapter;", "data", "", "Lru/tvrain/core/data/Article;", "fragmentFavoritesBinding", "Lcom/hintsolutions/raintv/databinding/FragmentFavoritesBinding;", "mListener", "Lcom/hintsolutions/raintv/interfaces/OnFragmentInteractionListener;", "subscriptionBinding", "Lcom/hintsolutions/raintv/databinding/SubscriptionBinding;", "toolbarMainActivityBinding", "Lcom/hintsolutions/raintv/databinding/ToolbarMainActivityBinding;", "viewEmptyBinding", "Lcom/hintsolutions/raintv/databinding/ViewEmptyBinding;", "gtmLogOpenView", "", "initViews", "loadFavorites", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onDetach", "onResume", "onViewCreated", "view", "updateView", "list", "", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class FavoritesFragment
extends BaseFragment {
    @Nullable
    private BestNewsAdapter adapter;
    @NotNull
    private final List<Article> data = new ArrayList();
    @Nullable
    private FragmentFavoritesBinding fragmentFavoritesBinding;
    @Nullable
    private OnFragmentInteractionListener mListener;
    @Nullable
    private SubscriptionBinding subscriptionBinding;
    @Nullable
    private ToolbarMainActivityBinding toolbarMainActivityBinding;
    @Nullable
    private ViewEmptyBinding viewEmptyBinding;

    public static final /* synthetic */ void access$hideProgressDialog(FavoritesFragment favoritesFragment) {
        favoritesFragment.hideProgressDialog();
    }

    public static final /* synthetic */ void access$updateView(FavoritesFragment favoritesFragment, List list) {
        favoritesFragment.updateView((List<? extends Article>)list);
    }

    public static /* synthetic */ void b(FavoritesFragment favoritesFragment, Article article) {
        FavoritesFragment.initViews$lambda$2(favoritesFragment, article);
    }

    public static /* synthetic */ void c(FavoritesFragment favoritesFragment, View view) {
        FavoritesFragment.initViews$lambda$5(favoritesFragment, view);
    }

    public static /* synthetic */ void d(FavoritesFragment favoritesFragment, View view) {
        FavoritesFragment.initViews$lambda$7(favoritesFragment, view);
    }

    public static /* synthetic */ void e(Object object, Function1 function1) {
        FavoritesFragment.loadFavorites$lambda$8(function1, object);
    }

    public static /* synthetic */ void f(FavoritesFragment favoritesFragment, Throwable throwable) {
        FavoritesFragment.loadFavorites$lambda$10(favoritesFragment, throwable);
    }

    public static /* synthetic */ void g(FavoritesFragment favoritesFragment, View view) {
        FavoritesFragment.initViews$lambda$6(favoritesFragment, view);
    }

    private final void gtmLogOpenView() {
        this.activityInterface.getTagManager().logOpenView("Favorites");
    }

    public static /* synthetic */ void h(FavoritesFragment favoritesFragment, Article article, Runnable runnable) {
        FavoritesFragment.initViews$lambda$4(favoritesFragment, article, runnable);
    }

    private final void initViews() {
        Object object = this.mListener;
        Object var2_2 = null;
        if (object == null && (object = (object = this.fragmentFavoritesBinding) != null ? ((FragmentFavoritesBinding)object).appBar : null) != null) {
            object.setVisibility(8);
        }
        if ((object = this.toolbarMainActivityBinding) != null && (object = ((ToolbarMainActivityBinding)object).title) != null) {
            object.setText(2131755213);
        }
        if ((object = (object = this.viewEmptyBinding) != null ? ((ViewEmptyBinding)object).emptyLabel : null) != null) {
            object.setText((CharSequence)this.getString(2131755481));
        }
        object = this.viewEmptyBinding;
        object = object != null ? ((ViewEmptyBinding)object).retryButton : null;
        if (object != null) {
            object.setVisibility(8);
        }
        this.adapter = new BestNewsAdapter((Context)this.getActivity(), this.data, true, new q1(this), new q1(this));
        object = this.fragmentFavoritesBinding;
        object = object != null ? ((FragmentFavoritesBinding)object).recyclerView : null;
        if (object != null) {
            object.setLayoutManager((RecyclerView.LayoutManager)new LinearLayoutManager((Context)this.getActivity()));
        }
        object = this.fragmentFavoritesBinding;
        object = object != null ? ((FragmentFavoritesBinding)object).recyclerView : null;
        if (object != null) {
            object.setAdapter((RecyclerView.Adapter)this.adapter);
        }
        object = this.fragmentFavoritesBinding;
        object = object != null ? ((FragmentFavoritesBinding)object).recyclerView : null;
        if (object != null) {
            object.setItemAnimator((RecyclerView.ItemAnimator)new DefaultItemAnimator());
        }
        OnFragmentInteractionListener onFragmentInteractionListener = this.mListener;
        if (onFragmentInteractionListener != null) {
            ToolbarMainActivityBinding toolbarMainActivityBinding = this.toolbarMainActivityBinding;
            object = var2_2;
            if (toolbarMainActivityBinding != null) {
                object = toolbarMainActivityBinding.toggleBadgeTextView;
            }
            onFragmentInteractionListener.setupNotificationsCount((TextView)object);
        }
        if ((object = this.toolbarMainActivityBinding) != null && (object = ((ToolbarMainActivityBinding)object).menuToggleHolder) != null) {
            object.setOnClickListener((View.OnClickListener)new r1(this, 0));
        }
        if ((object = this.subscriptionBinding) != null && (object = ((SubscriptionBinding)object).subscription) != null) {
            object.setOnClickListener((View.OnClickListener)new r1(this, 1));
        }
        if ((object = this.viewEmptyBinding) != null && (object = ((ViewEmptyBinding)object).retryButton) != null) {
            object.setOnClickListener((View.OnClickListener)new r1(this, 2));
        }
    }

    private static final void initViews$lambda$2(FavoritesFragment favoritesFragment, Article article) {
        Intrinsics.checkNotNullParameter((Object)((Object)favoritesFragment), (String)"this$0");
        if (favoritesFragment.getActivity() != null) {
            Intent intent = new Intent((Context)favoritesFragment.getActivity(), NewsActivity.class);
            intent.putExtra("id", article.id);
            favoritesFragment.startActivity(intent);
        }
    }

    private static final void initViews$lambda$4(FavoritesFragment favoritesFragment, Article object, Runnable runnable) {
        Intrinsics.checkNotNullParameter((Object)((Object)favoritesFragment), (String)"this$0");
        if (favoritesFragment.getActivity() != null && favoritesFragment.getActivity() instanceof BaseActivity) {
            runnable = favoritesFragment.getActivity();
            Intrinsics.checkNotNull((Object)runnable, (String)"null cannot be cast to non-null type com.hintsolutions.raintv.common.BaseActivity");
            Consts consts = (BaseActivity)runnable;
            runnable = null;
            consts.toggleFav((Article)object, true, null);
            consts = favoritesFragment.adapter;
            if (consts != null) {
                consts.remove((Article)object);
            }
            object = (object = favoritesFragment.adapter) != null ? Boolean.valueOf((boolean)((BestNewsAdapter)((Object)object)).isEmpty()) : null;
            Intrinsics.checkNotNull((Object)object);
            if (object.booleanValue()) {
                object = favoritesFragment.fragmentFavoritesBinding;
                favoritesFragment = runnable;
                if (object != null) {
                    object = ((FragmentFavoritesBinding)object).emptyView;
                    favoritesFragment = runnable;
                    if (object != null) {
                        favoritesFragment = ((ViewEmptyBinding)object).getRoot();
                    }
                }
                if (favoritesFragment != null) {
                    favoritesFragment.setVisibility(0);
                }
            }
        }
    }

    private static final void initViews$lambda$5(FavoritesFragment object, View view) {
        Intrinsics.checkNotNullParameter((Object)object, (String)"this$0");
        object = ((FavoritesFragment)((Object)object)).mListener;
        if (object != null) {
            object.onMenuClicked();
        }
    }

    private static final void initViews$lambda$6(FavoritesFragment object, View view) {
        Intrinsics.checkNotNullParameter((Object)object, (String)"this$0");
        if (((FavoritesFragment)((Object)object)).mListener != null) {
            TagManagerUtils.logPayWallClick((TagManager)((BaseFragment)((Object)object)).activityInterface.getTagManager(), (String)"\u0448\u0430\u043f\u043a\u0430 \u0432 \u0438\u0437\u0431\u0440\u0430\u043d\u043d\u043e\u043c");
            object = ((FavoritesFragment)((Object)object)).mListener;
            if (object != null) {
                object.onSubscriptionClicked();
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final void initViews$lambda$7(FavoritesFragment favoritesFragment, View view) {
        Intrinsics.checkNotNullParameter((Object)((Object)favoritesFragment), (String)"this$0");
        try {
            favoritesFragment = favoritesFragment.getActivity();
            Intrinsics.checkNotNull((Object)((Object)favoritesFragment), (String)"null cannot be cast to non-null type com.hintsolutions.raintv.MainActivity");
            ((MainActivity)((Object)favoritesFragment)).handleDrawerItemSelected(15L);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private final void loadFavorites() {
        if (this.userManager.isAuthorized()) {
            this.showProgressDialog();
            this.addSubscription(this.rainApi.getFavoriteArticles(this.getAuthorization(), "desc", Integer.valueOf((int)1280), Integer.valueOf((int)720)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new p1(0, (Function1)new Function1<Articles, Unit>(this){
                public final FavoritesFragment this$0;
                {
                    this.this$0 = favoritesFragment;
                    super(1);
                }

                public final void invoke(Articles articles) {
                    FavoritesFragment favoritesFragment = this.this$0;
                    FavoritesFragment.access$hideProgressDialog(favoritesFragment);
                    List list = articles.elements;
                    Intrinsics.checkNotNullExpressionValue((Object)list, (String)"articles.elements");
                    ArrayList arrayList = new ArrayList(CollectionsKt.e((Iterable)list));
                    list = list.iterator();
                    while (list.hasNext()) {
                        ((Article)list.next()).is_favorite = 1;
                        arrayList.add((Object)Unit.INSTANCE);
                    }
                    articles = articles.elements;
                    Intrinsics.checkNotNullExpressionValue((Object)articles, (String)"articles.elements");
                    FavoritesFragment.access$updateView(favoritesFragment, (List)articles);
                }
            }), (Action1)new q1(this)));
        } else {
            this.updateView((List<? extends Article>)CollectionsKt.emptyList());
        }
    }

    private static final void loadFavorites$lambda$10(FavoritesFragment favoritesFragment, Throwable throwable) {
        Intrinsics.checkNotNullParameter((Object)((Object)favoritesFragment), (String)"this$0");
        favoritesFragment.hideProgressDialog();
        favoritesFragment.showErrorDialog(throwable);
    }

    private static final void loadFavorites$lambda$8(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter((Object)function1, (String)"$tmp0");
        function1.invoke(object);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void updateView(List<? extends Article> object) {
        try {
            void var3_9;
            boolean bl = ListUtils.isEmptyList((List)object);
            Object var3_4 = null;
            Object var5_10 = null;
            Object object2 = null;
            if (bl) {
                this.data.clear();
                object = this.adapter;
                if (object != null) {
                    object.notifyDataSetChanged();
                }
                if ((object = (object = this.fragmentFavoritesBinding) != null && (object = object.emptyView) != null ? object.getRoot() : null) != null) {
                    object.setVisibility(0);
                }
                if (this.activityInterface.isAuthorized()) {
                    object = this.viewEmptyBinding;
                    object = object != null ? object.emptyLabel : null;
                    if (object != null) {
                        object.setText((CharSequence)this.getString(2131755481));
                    }
                    ViewEmptyBinding viewEmptyBinding = this.viewEmptyBinding;
                    object = object2;
                    if (viewEmptyBinding != null) {
                        object = viewEmptyBinding.retryButton;
                    }
                    if (object == null) {
                        return;
                    }
                    object.setVisibility(8);
                    return;
                }
                object = this.viewEmptyBinding;
                object = object != null ? object.emptyLabel : null;
                if (object != null) {
                    object.setText((CharSequence)this.getString(2131755665));
                }
                object = this.viewEmptyBinding;
                object = object != null ? object.retryButton : null;
                if (object != null) {
                    object.setText((CharSequence)this.getString(2131755214));
                }
                object2 = this.viewEmptyBinding;
                object = var3_4;
                if (object2 != null) {
                    object = ((ViewEmptyBinding)object2).retryButton;
                }
                if (object == null) {
                    return;
                }
                object.setVisibility(0);
                return;
            }
            object2 = this.fragmentFavoritesBinding;
            Object var3_6 = var5_10;
            if (object2 != null) {
                object2 = ((FragmentFavoritesBinding)object2).emptyView;
                Object var3_7 = var5_10;
                if (object2 != null) {
                    LinearLayout linearLayout = ((ViewEmptyBinding)object2).getRoot();
                }
            }
            if (var3_9 != null) {
                var3_9.setVisibility(8);
            }
            this.data.clear();
            this.data.addAll(object);
            object = this.adapter;
            if (object == null) return;
            object.notifyDataSetChanged();
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
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        super.onAttach(context);
        try {
            this.mListener = (OnFragmentInteractionListener)context;
        }
        catch (Exception exception) {}
        try {
            BusProvider.Companion.getInstance().register((Object)this);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter((Object)layoutInflater, (String)"inflater");
        return layoutInflater.inflate(2131492971, viewGroup, false);
    }

    @Override
    public void onDestroyView() {
        this.fragmentFavoritesBinding = null;
        this.subscriptionBinding = null;
        this.toolbarMainActivityBinding = null;
        this.viewEmptyBinding = null;
        super.onDestroyView();
    }

    @Override
    public void onDetach() {
        try {
            BusProvider.Companion.getInstance().unregister((Object)this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.mListener = null;
        super.onDetach();
    }

    public void onResume() {
        super.onResume();
        this.loadFavorites();
        SubscriptionBinding subscriptionBinding = this.subscriptionBinding;
        subscriptionBinding = subscriptionBinding != null ? subscriptionBinding.subscription : null;
        if (subscriptionBinding != null) {
            subscriptionBinding.setVisibility(8);
        }
    }

    public void onViewCreated(@NotNull View object, @Nullable Bundle object2) {
        Intrinsics.checkNotNullParameter((Object)object, (String)"view");
        super.onViewCreated(object, object2);
        object2 = FragmentFavoritesBinding.bind(object);
        Intrinsics.checkNotNullExpressionValue((Object)object2, (String)"bind(view)");
        this.fragmentFavoritesBinding = object2;
        object2 = SubscriptionBinding.bind(object);
        Intrinsics.checkNotNullExpressionValue((Object)object2, (String)"bind(view)");
        this.subscriptionBinding = object2;
        object2 = ToolbarMainActivityBinding.bind(object);
        Intrinsics.checkNotNullExpressionValue((Object)object2, (String)"bind(view)");
        this.toolbarMainActivityBinding = object2;
        object = ViewEmptyBinding.bind(object);
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"bind(view)");
        this.viewEmptyBinding = object;
        this.initViews();
        this.loadFavorites();
        this.gtmLogOpenView();
    }
}

