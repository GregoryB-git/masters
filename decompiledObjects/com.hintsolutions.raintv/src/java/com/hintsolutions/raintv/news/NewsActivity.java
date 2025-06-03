/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources$NotFoundException
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.Html
 *  android.text.Spannable
 *  android.text.TextUtils
 *  android.text.format.DateUtils
 *  android.text.method.LinkMovementMethod
 *  android.view.KeyEvent
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  android.widget.Toast
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.fragment.app.Fragment
 *  androidx.recyclerview.widget.DefaultItemAnimator
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ItemAnimator
 *  androidx.recyclerview.widget.RecyclerView$ItemDecoration
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  butterknife.BindView
 *  butterknife.OnClick
 *  com.google.android.gms.tagmanager.DataLayer
 *  com.mikepenz.google_material_typeface_library.GoogleMaterial$Icon
 *  com.mikepenz.iconics.IconicsDrawable
 *  com.mikepenz.iconics.typeface.IIcon
 *  com.squareup.picasso.Picasso
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.text.DecimalFormat
 *  java.text.NumberFormat
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.regex.Pattern
 *  java.util.regex.PatternSyntaxException
 *  okhttp3.ResponseBody
 *  ru.tvrain.core.Gallery
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.Author
 *  ru.tvrain.core.data.AutoVideo
 *  ru.tvrain.core.data.IVideo
 *  ru.tvrain.core.data.Program
 *  ru.tvrain.core.data.Quality
 *  ru.tvrain.core.data.RecommendationsResponse
 *  ru.tvrain.core.data.TimeCode
 *  ru.tvrain.core.data.Video
 *  ru.tvrain.core.utils.ListUtils
 *  ru.tvrain.core.utils.PojoHelper
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 *  tvrain.analytics.tagmanager.TagManager
 *  tvrain.analytics.tagmanager.TagManagerUtils
 *  tvrain.cast.CastHelper
 *  tvrain.services.bus.BusProvider
 */
package com.hintsolutions.raintv.news;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.google.android.gms.tagmanager.DataLayer;
import com.hintsolutions.raintv.MainActivity;
import com.hintsolutions.raintv.RainApplication;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.interfaces.AddToFavoritesClickListener;
import com.hintsolutions.raintv.interfaces.ArticleListItemClickListener;
import com.hintsolutions.raintv.news.GalleryFragment;
import com.hintsolutions.raintv.news.PopularArticlesInProgramFragment;
import com.hintsolutions.raintv.news.adapters.BestNewsAdapter;
import com.hintsolutions.raintv.news.adapters.NewsRecommendationsAdapter;
import com.hintsolutions.raintv.services.audio.AudioActivity;
import com.hintsolutions.raintv.services.video.DownloadTracker;
import com.hintsolutions.raintv.services.video.SavedVideoHolder;
import com.hintsolutions.raintv.utils.ViewUtils;
import com.hintsolutions.raintv.video.VideoActivity;
import com.hintsolutions.raintv.views.DividerItemDecoration;
import com.mikepenz.google_material_typeface_library.GoogleMaterial;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.typeface.IIcon;
import com.squareup.picasso.Picasso;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import okhttp3.ResponseBody;
import ru.tvrain.core.Gallery;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.Author;
import ru.tvrain.core.data.AutoVideo;
import ru.tvrain.core.data.IVideo;
import ru.tvrain.core.data.Program;
import ru.tvrain.core.data.Quality;
import ru.tvrain.core.data.RecommendationsResponse;
import ru.tvrain.core.data.TimeCode;
import ru.tvrain.core.data.Video;
import ru.tvrain.core.utils.ListUtils;
import ru.tvrain.core.utils.PojoHelper;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import tvrain.analytics.tagmanager.TagManager;
import tvrain.analytics.tagmanager.TagManagerUtils;
import tvrain.cast.CastHelper;
import tvrain.services.bus.BusProvider;
import tvrain.youtube.YouTubeVideoActivity;

public class NewsActivity
extends BaseActivity {
    public static final String INTENT_EXTRA_ADD_TO_FAV = "fav";
    public static final String INTENT_EXTRA_RID = "rid";
    public static final String INTENT_EXTRA_SOURCE_ARTICLE_ID = "source_article_id";
    private Article articleToShow;
    @BindView(value=2131296960)
    public TextView authors;
    private BestNewsAdapter bestAdapter;
    private List<Article> bestList;
    @BindView(value=2131296394)
    public RecyclerView bestRecyclerView;
    private CastHelper castHelper;
    @BindView(value=2131296527)
    public TextView date;
    private MenuItem favMenuItem;
    @BindView(value=2131296649)
    public LinearLayout fullTextForSubscribersLayout;
    @BindView(value=2131296650)
    public LinearLayout fullTextLayout;
    @BindView(value=2131296652)
    public RelativeLayout galleryFragment;
    public Article mArticle;
    private String mDeepLink;
    @BindView(value=2131296543)
    public ImageView mDetailImg;
    @BindView(value=2131296996)
    public LinearLayout mPartLayout;
    @BindView(value=2131297003)
    public ImageView mPaymentIcon;
    @BindView(value=2131297022)
    public TextView mProgram;
    @BindView(value=2131296962)
    public TextView newsTitle;
    @BindView(value=2131297010)
    public ImageView playVideoImageView;
    @BindView(value=2131297018)
    public WebView predetailWebView;
    private NewsRecommendationsAdapter recommendationsAdapter;
    private RecommendationsResponse recommendationsHolder;
    @BindView(value=2131297045)
    public LinearLayout recommendationsLayout;
    private List<Article> recommendationsList = new ArrayList();
    @BindView(value=2131297046)
    public RecyclerView recommendationsRecyclerView;
    private boolean showFullText;
    @BindView(value=2131297172)
    public TextView subscription;
    @BindView(value=2131297234)
    public WebView timeCodesWebView;
    private IVideo videoToShow;
    @BindView(value=2131297337)
    public TextView viewsCount;
    @BindView(value=2131297338)
    public View viewsCountContainer;
    @BindView(value=2131297346)
    public WebView webView;

    public NewsActivity() {
        this.bestList = new ArrayList();
    }

    public static /* synthetic */ void A(Throwable throwable) {
        NewsActivity.lambda$loadBest$22(throwable);
    }

    public static /* synthetic */ void B(NewsActivity newsActivity, int n2, ResponseBody responseBody) {
        newsActivity.lambda$getArticles$8(n2, responseBody);
    }

    public static /* synthetic */ void C(NewsActivity newsActivity, Article article, View view) {
        newsActivity.lambda$setVideo$11(article, view);
    }

    public static /* synthetic */ void D(NewsActivity newsActivity, boolean bl, MaterialDialog materialDialog, DialogAction dialogAction) {
        newsActivity.lambda$showResumeVideoDialog$16(bl, materialDialog, dialogAction);
    }

    public static /* synthetic */ void E(NewsActivity newsActivity, ResponseBody responseBody) {
        newsActivity.lambda$getRecommendations$19(responseBody);
    }

    public static /* synthetic */ void F(NewsActivity newsActivity, DownloadTracker downloadTracker, Activity activity, IVideo iVideo) {
        newsActivity.lambda$downloadVideo$23(downloadTracker, activity, iVideo);
    }

    public static /* synthetic */ void G(NewsActivity newsActivity, RecommendationsResponse recommendationsResponse) {
        newsActivity.lambda$loadBest$21(recommendationsResponse);
    }

    public static /* synthetic */ void H(NewsActivity newsActivity, Article article, ResponseBody responseBody) {
        newsActivity.lambda$setProgram$17(article, responseBody);
    }

    public static /* synthetic */ void I(NewsActivity newsActivity, Throwable throwable) {
        newsActivity.lambda$getArticleVideoAuto$14(throwable);
    }

    public static /* synthetic */ void J(NewsActivity newsActivity) {
        newsActivity.getArticles();
    }

    public static /* synthetic */ void K(NewsActivity newsActivity, ArrayList arrayList) {
        newsActivity.lambda$getVideos$5(arrayList);
    }

    public static /* synthetic */ void L(NewsActivity newsActivity, Article article) {
        newsActivity.lambda$initViews$3(article);
    }

    public static /* synthetic */ void M(NewsActivity newsActivity, long l, IVideo iVideo) {
        newsActivity.lambda$recognizeAndProcessUrl$10(l, iVideo);
    }

    public static /* synthetic */ void N(Throwable throwable) {
        NewsActivity.lambda$handleClick$1(throwable);
    }

    public static /* synthetic */ void O(ResponseBody responseBody) {
        NewsActivity.lambda$handleClick$0(responseBody);
    }

    public static /* synthetic */ void P(NewsActivity newsActivity, Article article, Runnable runnable) {
        newsActivity.lambda$initViews$4(article, runnable);
    }

    public static /* synthetic */ void Q(NewsActivity newsActivity, Throwable throwable) {
        newsActivity.lambda$getArticles$9(throwable);
    }

    public static /* synthetic */ void R(NewsActivity newsActivity, boolean bl, long l, MaterialDialog materialDialog, DialogAction dialogAction) {
        newsActivity.lambda$showResumeVideoDialog$15(bl, l, materialDialog, dialogAction);
    }

    public static /* synthetic */ void S(Throwable throwable) {
        NewsActivity.lambda$setProgram$18(throwable);
    }

    public static /* synthetic */ void T(NewsActivity newsActivity, Article article, boolean bl, IVideo iVideo) {
        newsActivity.lambda$showArticleVideo$12(article, bl, iVideo);
    }

    public static /* synthetic */ void U(NewsActivity newsActivity, Throwable throwable) {
        newsActivity.lambda$getVideos$6(throwable);
    }

    public static /* synthetic */ void V(NewsActivity newsActivity) {
        newsActivity.updateFavItem();
    }

    public static /* synthetic */ void W(NewsActivity newsActivity) {
        newsActivity.lambda$getArticles$7();
    }

    public static /* synthetic */ void X(Throwable throwable) {
        NewsActivity.lambda$getRecommendations$20(throwable);
    }

    public static /* synthetic */ void Y(HlsStreamsReadyListener hlsStreamsReadyListener, int n2, ArrayList arrayList) {
        hlsStreamsReadyListener.onReady((IVideo)arrayList.get(n2));
    }

    public static /* synthetic */ void access$400(NewsActivity newsActivity) {
        newsActivity.showProgressDialog();
    }

    public static /* synthetic */ void access$500(NewsActivity newsActivity) {
        newsActivity.hideProgressDialog();
    }

    public static /* synthetic */ void access$600(NewsActivity newsActivity) {
        newsActivity.hideProgressDialog();
    }

    public static /* synthetic */ TagManager access$700(NewsActivity newsActivity) {
        return newsActivity.tagManager;
    }

    private void addAuthorHtml(StringBuilder stringBuilder, Author author) {
        if (stringBuilder.length() > 0) {
            stringBuilder.append(", ");
        }
        if (author.hasUrl()) {
            stringBuilder.append(String.format((String)"<a href='%s'>%s</a>", (Object[])new Object[]{author.getUrl(), author.name}));
        } else {
            stringBuilder.append(author.name);
        }
    }

    private String changeLeadFontSettings(String string) {
        String string2;
        string = string.replaceAll("(?i)(class=[\"']lead[\"'])", "$1 style=\"font-size:16px;\"");
        if (!this.showFullText) {
            string = string.replaceAll("(?is)(</body>\\s*</html>)$", "</div>$1");
            string2 = "<div style='max-height:500px;overflow:hidden'>";
        } else {
            string2 = "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("$1 style=\"padding-top:0;\">");
        stringBuilder.append(string2);
        stringBuilder.append("<style>a{color:#CB3577;text-decoration:none}</style>");
        return string.replaceAll("(?i)(<body.*?)>", stringBuilder.toString());
    }

    private void downloadVideo() {
        this.analyticsManager.logEvent("Download video clicked", new String[0]);
        DownloadTracker downloadTracker = ((RainApplication)this.getApplication()).getDownloadTracker();
        this.getArticleVideoAuto(this.mArticle.id, 0, new a1(this, downloadTracker, this));
    }

    private void fillRecommendations(List<Article> list) {
        this.recommendationsLayout.setVisibility(0);
        this.recommendationsList.clear();
        this.recommendationsList.addAll(list);
        this.recommendationsAdapter.notifyDataSetChanged();
    }

    private String fitImagesToScreenWidth(String string) {
        if (string == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(string);
        int n2 = 0;
        int n4 = 0;
        while (n2 != -1) {
            if ((n2 = string.indexOf("src", n2 + 1)) != -1) {
                stringBuilder.insert(n4 * 13 + n2, "width=\"100%\" ");
            }
            ++n4;
        }
        return stringBuilder.toString();
    }

    private String generateUrlForShare(String string) {
        String string2;
        String string3;
        block5: {
            int n2;
            String[] stringArray;
            string3 = null;
            try {
                stringArray = string.split("/");
                n2 = 0;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                string2 = string3;
            }
            while (true) {
                block6: {
                    string2 = string3;
                    if (n2 >= stringArray.length) break block5;
                    if (!stringArray[n2].equalsIgnoreCase("teleshow") || n2 >= stringArray.length - 1) break block6;
                    string2 = stringArray[n2 + 1];
                    break;
                }
                ++n2;
            }
        }
        string = a.s("http://tvrain.tv", string, "?utm_medium=share_android&utm_term=");
        string.append(this.mArticle.id);
        string = string3 = string.toString();
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            string = z2.p(string3, "&utm_campaign=teleshow-", string2);
        }
        return string;
    }

    private void getArticleVideoAuto(int n2, int n4, HlsStreamsReadyListener hlsStreamsReadyListener) {
        this.addSubscription(this.rainApi.articleAutoVideos(this.getAuthorization(), String.valueOf((int)n2)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new l3(hlsStreamsReadyListener, n4, 0), (Action1)new i3(this, 4)));
    }

    private void getArticles() {
        int n2 = this.getIntent().getIntExtra("id", 0);
        this.addSubscription(this.rainApi.articlesById(this.getAuthorization(), Integer.valueOf((int)1280), Integer.valueOf((int)720), String.valueOf((int)n2)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new l3(this, n2, 1), (Action1)new i3(this, 10)));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String getGroupIfUrlMatchPattern(String string, String string2, int n2) {
        try {
            string = Pattern.compile((String)string2, (int)74).matcher((CharSequence)string);
            if (!string.find()) return null;
            return string.group(n2);
        }
        catch (PatternSyntaxException patternSyntaxException) {
            return null;
        }
    }

    private int getNewsIdFromUrlOrZero(String string) {
        String string2;
        String string3 = string2 = this.getGroupIfUrlMatchPattern(string, "(?i)tvrain://\\?(article_id|gallery_id)=([0-9]+)", 2);
        if (string2 == null) {
            string3 = this.getGroupIfUrlMatchPattern(string, "^https?://tvrain\\.ru/(lite/)?(teleshow)/[^/]+/[^/]+-([0-9]+)/", 3);
        }
        string2 = string3;
        if (string3 == null) {
            string2 = this.getGroupIfUrlMatchPattern(string, "^https?://tvrain\\.ru/(news|galleries)/[^/]+-([0-9]+)/", 2);
        }
        int n2 = string2 != null ? Integer.parseInt((String)string2) : 0;
        return n2;
    }

    private int getProgramIdFromUrlOrZero(String string) {
        int n2 = (string = this.getGroupIfUrlMatchPattern(string, "(?i)tvrain://\\?program_id=([0-9]+)", 1)) != null ? Integer.parseInt((String)string) : 0;
        return n2;
    }

    private void getRecommendations(Article object) {
        if (object != null && !ListUtils.isEmptyList((List)object.on_topic)) {
            object = TextUtils.join((CharSequence)"_", (Object[])object.on_topic.toArray());
            this.addSubscription(this.rainApi.articlesById(this.getAuthorization(), Integer.valueOf((int)1280), Integer.valueOf((int)720), (String)object).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new i3(this, 9), (Action1)new v1(14)));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private long getTimeCodePosition(String string) {
        int n2;
        int n4;
        StringBuilder stringBuilder;
        block9: {
            block8: {
                try {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("/teleshow/");
                    stringBuilder.append(this.mArticle.id);
                    stringBuilder.append("#t=(([0-9]+)h)?(([0-9]+)m)?(([0-9]+)s)?");
                    string = Pattern.compile((String)stringBuilder.toString(), (int)2).matcher((CharSequence)string);
                    if (!string.find()) return 0L;
                    stringBuilder = new TimeCode();
                    String string2 = string.group(2);
                    n4 = 0;
                    if (string2 == null) break block8;
                }
                catch (PatternSyntaxException patternSyntaxException) {
                    return 0L;
                }
                n2 = Integer.parseInt((String)string.group(2));
                break block9;
            }
            n2 = 0;
        }
        stringBuilder.hour = n2;
        n2 = string.group(4) != null ? Integer.parseInt((String)string.group(4)) : 0;
        stringBuilder.minute = n2;
        n2 = n4;
        if (string.group(6) != null) {
            n2 = Integer.parseInt((String)string.group(6));
        }
        stringBuilder.second = n2;
        return stringBuilder.getPosition();
    }

    private String getTimeCodesHtml(List<Video> iterator) {
        StringBuilder stringBuilder = new StringBuilder();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            List list = ((Video)iterator.next()).timeCodes;
            if (list == null) continue;
            for (TimeCode timeCode : list) {
                if (stringBuilder.length() == 0) {
                    stringBuilder.append("<html><style>body {padding: 0; margin: 0} ul {padding-left:16px} li {padding-top:16px; padding-bottom:16px} a {font-family: Roboto,sans-serif;font-weight: 400;font-size: 16px;color:#000;text-decoration:none} a > span {color: #CB3577}</style><body><ul>");
                }
                Object object = z2.t("/teleshow/");
                object.append(this.mArticle.id);
                object.append("#t=");
                object.append(timeCode.getPositionUrlParamValue());
                object = object.toString();
                stringBuilder.append("<li><a href=");
                stringBuilder.append((String)object);
                stringBuilder.append("\">");
                stringBuilder.append(timeCode.name);
                stringBuilder.append(" (<span>");
                stringBuilder.append(timeCode.getTimeString());
                stringBuilder.append("</span>)</a></li>");
            }
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.append("</ul></body></html>");
        }
        return stringBuilder.toString();
    }

    private void getVideoSavedPositionAndShowVideoActivity(boolean bl) {
        if (this.videoToShow == null) {
            return;
        }
        this.hideProgressDialog();
        long l = this.videoToShow.getVideoPosition();
        if (l != 0L) {
            this.showResumeVideoDialog(bl, l);
        } else {
            this.showVideoActivity(bl, l);
        }
    }

    private void getVideos(int n2) {
        this.addSubscription(this.rainApi.articleVideos(this.getAuthorization(), String.valueOf((int)n2)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new i3(this, 6), (Action1)new i3(this, 7)));
    }

    private Map<String, Object> gtmGetLogOpenViewParams(Article object) {
        Map map = DataLayer.mapOf((Object[])new Object[]{"doc", object.id, "category", object.getProgramName(), "has_video", TagManager.renderGTMBoolean((boolean)object.hasVideo()), "published", object.getDateStr()});
        String string = this.mDeepLink;
        String string2 = "1";
        if (string != null) {
            map.put((Object)"referrer", (Object)"1");
        } else {
            map.put((Object)"referrer", (Object)"0");
        }
        object = object.isFull() ? string2 : "0";
        map.put((Object)"full_version", object);
        return map;
    }

    private String gtmGetScreenName(int n2) {
        return a.f("Doc/", n2);
    }

    private void gtmLogOpenView() {
        this.tagManager.logOpenView(this.gtmGetScreenName(this.mArticle.id), this.gtmGetLogOpenViewParams(this.mArticle));
    }

    private void handleClick() {
        if (this.getIntent() != null && this.getIntent().hasExtra(INTENT_EXTRA_RID) && this.getIntent().hasExtra(INTENT_EXTRA_SOURCE_ARTICLE_ID)) {
            String string = this.getIntent().getStringExtra(INTENT_EXTRA_RID);
            int n2 = this.getIntent().getIntExtra(INTENT_EXTRA_SOURCE_ARTICLE_ID, -1);
            this.addSubscription(this.rainApi.sendRecommendedClicked(Integer.valueOf((int)n2), string).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new v1(12), (Action1)new v1(13)));
        }
    }

    private void initPopularArticlesInProgram() {
        if (this.mArticle.program_id != 1018) {
            this.getSupportFragmentManager().beginTransaction().replace(2131297013, (Fragment)PopularArticlesInProgramFragment.newInstance(this.mArticle.program_id, 2, this.getString(2131755608), this.mArticle.id, true)).commit();
        }
    }

    private void initViews() {
        this.newsTitle.setText((CharSequence)"");
        this.mProgram.setText((CharSequence)"");
        this.date.setText((CharSequence)"");
        this.viewsCount.setText((CharSequence)"");
        this.authors.setText((CharSequence)"");
        this.viewsCountContainer.setVisibility(8);
        try {
            Object object;
            Object object2;
            Object object3;
            if (this.recommendationsRecyclerView != null) {
                object3 = this.recommendationsList;
                object2 = new i3(this, 0);
                this.recommendationsAdapter = object = new NewsRecommendationsAdapter((List<Article>)object3, (ArticleListItemClickListener)object2);
                object2 = this.recommendationsRecyclerView;
                object3 = new LinearLayoutManager((Context)this);
                object2.setLayoutManager((RecyclerView.LayoutManager)object3);
                this.recommendationsRecyclerView.setAdapter((RecyclerView.Adapter)this.recommendationsAdapter);
                object3 = this.recommendationsRecyclerView;
                object2 = new DefaultItemAnimator();
                object3.setItemAnimator((RecyclerView.ItemAnimator)object2);
                this.recommendationsRecyclerView.setNestedScrollingEnabled(false);
                object3 = this.recommendationsRecyclerView;
                object2 = new DividerItemDecoration(this.getResources().getDrawable(2131230947), false);
                object3.addItemDecoration((RecyclerView.ItemDecoration)object2);
            }
            if (this.bestRecyclerView != null) {
                BestNewsAdapter bestNewsAdapter;
                object3 = this.bestList;
                object = new i3(this, 1);
                object2 = new i3(this, 2);
                this.bestAdapter = bestNewsAdapter = new BestNewsAdapter((Context)this, (List<Article>)object3, false, (ArticleListItemClickListener)object, (AddToFavoritesClickListener)object2);
                object2 = this.bestRecyclerView;
                object3 = new LinearLayoutManager((Context)this);
                object2.setLayoutManager((RecyclerView.LayoutManager)object3);
                this.bestRecyclerView.setAdapter((RecyclerView.Adapter)this.bestAdapter);
                object3 = this.bestRecyclerView;
                object2 = new DefaultItemAnimator();
                object3.setItemAnimator((RecyclerView.ItemAnimator)object2);
                this.bestRecyclerView.setNestedScrollingEnabled(false);
                object2 = this.bestRecyclerView;
                object3 = new DividerItemDecoration(this.getResources().getDrawable(2131230947), false);
                object2.addItemDecoration((RecyclerView.ItemDecoration)object3);
            }
        }
        catch (Resources.NotFoundException notFoundException) {
            notFoundException.printStackTrace();
        }
    }

    private boolean isAllowedForSubscribersActive(Article article) {
        return false;
    }

    private boolean isSubscriptionUrl(String string) {
        boolean bl = string.equals((Object)"tvrain://?subscription=1") || string.matches("(?im)^https?://tvrain\\.ru/podpiska/");
        return bl;
    }

    private /* synthetic */ void lambda$downloadVideo$23(DownloadTracker downloadTracker, Activity activity, IVideo iVideo) {
        iVideo = iVideo.getUri(Quality.AUTO);
        int n2 = this.mArticle.id;
        Object object = this.mArticle;
        object = new SavedVideoHolder(String.valueOf((int)n2), object.name, object.getPreview(), iVideo.toString(), ((Video)this.mArticle.video.get(0)).renderVideoDuration());
        if (!downloadTracker.isDownloaded((Uri)iVideo) && !downloadTracker.isDownloaded(this.mArticle.id)) {
            downloadTracker.toggleDownload(activity, this.mArticle.id, (Uri)iVideo, (SavedVideoHolder)object, new DownloadTracker.PrepareListener(this, activity){
                public final NewsActivity this$0;
                public final Activity val$activity;
                {
                    this.this$0 = newsActivity;
                    this.val$activity = activity;
                }

                public void onBeforePrepare() {
                    NewsActivity.access$400(this.this$0);
                }

                public void onDownloadStarted() {
                    Toast.makeText((Context)this.val$activity, (CharSequence)this.this$0.getString(2131755645), (int)1).show();
                    TagManager tagManager = NewsActivity.access$700(this.this$0);
                    NewsActivity newsActivity = this.this$0;
                    tagManager.logEvent("download", NewsActivity.access$200(newsActivity, newsActivity.mArticle.id), null);
                }

                public void onPrepareError() {
                    NewsActivity.access$500(this.this$0);
                }

                public void onPrepared() {
                    NewsActivity.access$600(this.this$0);
                }
            });
        } else {
            this.showDialog(this.getString(2131755202), this.getString(2131755246));
        }
    }

    private /* synthetic */ void lambda$getArticleVideoAuto$14(Throwable throwable) {
        this.hideProgressDialog();
        this.showErrorDialog(throwable);
    }

    private /* synthetic */ void lambda$getArticles$7() {
        this.mArticle.is_favorite = 1;
        this.updateFavItem();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ void lambda$getArticles$8(int n2, ResponseBody object) {
        try {
            Article article;
            this.mArticle = article = (Article)PojoHelper.objectFromResponse((ResponseBody)object, (int)n2, Article.class);
            this.updateView(article);
            this.loadAds();
            this.setProgram(this.mArticle);
            this.setVideo(this.mArticle);
            this.setGallery((List<Gallery>)this.mArticle.getGalleries());
            Article article2 = this.mArticle;
            this.logNewsView(article2.id, article2.name);
            this.getRecommendations(this.mArticle);
            this.loadBest();
            this.updateFavItem();
            this.initPopularArticlesInProgram();
            this.getVideos(this.mArticle.id);
            if (this.getIntent().getBooleanExtra(INTENT_EXTRA_ADD_TO_FAV, false)) {
                Article article3 = this.mArticle;
                j3 j32 = new j3(this, 0);
                this.addToFavorites(article3, true, j32, true);
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private /* synthetic */ void lambda$getArticles$9(Throwable throwable) {
        Toast.makeText((Context)this, (CharSequence)this.getString(2131755240), (int)0).show();
        this.finish();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$getRecommendations$19(ResponseBody responseBody) {
        responseBody = PojoHelper.arrayFromResponse((ResponseBody)responseBody, Article.class);
        boolean bl = ListUtils.isEmptyList((List)responseBody);
        if (bl) return;
        {
            catch (Exception exception) {
                return;
            }
            try {
                this.fillRecommendations((List<Article>)responseBody);
                return;
            }
            catch (Exception exception) {}
            {
                exception.printStackTrace();
                return;
            }
        }
    }

    private static /* synthetic */ void lambda$getRecommendations$20(Throwable throwable) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ void lambda$getVideos$5(ArrayList arrayList) {
        try {
            this.showTimeCodes((List<Video>)arrayList);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private /* synthetic */ void lambda$getVideos$6(Throwable throwable) {
        Toast.makeText((Context)this, (CharSequence)this.getString(2131755240), (int)0).show();
        this.finish();
    }

    private static /* synthetic */ void lambda$handleClick$0(ResponseBody responseBody) {
    }

    private static /* synthetic */ void lambda$handleClick$1(Throwable throwable) {
    }

    private /* synthetic */ void lambda$initViews$2(Article article) {
        Intent intent = new Intent((Context)this, NewsActivity.class);
        intent.putExtra("id", article.id);
        this.startActivity(intent);
    }

    private /* synthetic */ void lambda$initViews$3(Article object) {
        Intent intent = new Intent((Context)this, NewsActivity.class);
        intent.putExtra("id", object.id);
        object = this.recommendationsHolder;
        if (object != null && (object = object.rid) != null) {
            intent.putExtra(INTENT_EXTRA_RID, (String)object);
            intent.putExtra(INTENT_EXTRA_SOURCE_ARTICLE_ID, this.mArticle.id);
        }
        this.startActivity(intent);
    }

    private /* synthetic */ void lambda$initViews$4(Article article, Runnable runnable) {
        this.toggleFav(article, true, runnable);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ void lambda$loadBest$21(RecommendationsResponse recommendationsResponse) {
        try {
            this.recommendationsHolder = recommendationsResponse;
            this.bestList.clear();
            this.bestList.addAll((Collection)recommendationsResponse.articles);
            this.bestAdapter.notifyDataSetChanged();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static /* synthetic */ void lambda$loadBest$22(Throwable throwable) {
    }

    private /* synthetic */ void lambda$recognizeAndProcessUrl$10(long l, IVideo iVideo) {
        this.videoToShow = iVideo;
        this.articleToShow = this.mArticle;
        this.showVideoActivity(this.startNewCast(), l);
    }

    private /* synthetic */ void lambda$setProgram$17(Article article, ResponseBody responseBody) {
        responseBody = (Program)PojoHelper.objectFromResponse((ResponseBody)responseBody, (int)article.program_id, Program.class);
        article.program = responseBody;
        this.updateView((Program)responseBody);
    }

    private static /* synthetic */ void lambda$setProgram$18(Throwable throwable) {
    }

    private /* synthetic */ void lambda$setVideo$11(Article article, View view) {
        try {
            if (this.startNewCast()) {
                this.showArticleVideo(article, (Integer)view.getTag(), true);
            } else {
                this.showArticleVideo(article, (Integer)view.getTag(), false);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private /* synthetic */ void lambda$showArticleVideo$12(Article article, boolean bl, IVideo iVideo) {
        this.showVideoActivityAfterAd(iVideo, article, bl);
    }

    private /* synthetic */ void lambda$showResumeVideoDialog$15(boolean bl, long l, MaterialDialog materialDialog, DialogAction dialogAction) {
        this.showVideoActivity(bl, l);
    }

    private /* synthetic */ void lambda$showResumeVideoDialog$16(boolean bl, MaterialDialog materialDialog, DialogAction dialogAction) {
        this.showVideoActivity(bl, 0L);
    }

    private void loadAds() {
    }

    private void loadBest() {
        Article article = this.mArticle;
        if (article != null) {
            this.addSubscription(this.rainApi.getRecommendations(Integer.valueOf((int)article.id), Integer.valueOf((int)1280), Integer.valueOf((int)720)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new i3(this, 5), (Action1)new v1(11)));
        }
    }

    private void logNewsView(int n2, String string) {
        try {
            if (string.length() > 99) {
                string.substring(0, 99);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.rainLogNewsView();
        this.gtmLogOpenView();
    }

    private String preparePredetailHtml(String string) {
        if (!string.toLowerCase().contains((CharSequence)"<html")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<html><head>");
            stringBuilder.append("<style>a{color:#CB3577;text-decoration:none;} body{padding: 0px 16px;font-size:16px;color: #333;\tfont-family: 'Open Sans', Helvetica, Arial, sans-serif;\n\tline-height: 150%;margin: 0;font-weight: 500}</style>");
            stringBuilder.append("</head><body>");
            stringBuilder.append(string);
            stringBuilder.append("</body></html>");
            string = stringBuilder.toString();
        } else {
            string = string.replaceAll("(?i)(<body.*?)>", "$1><style>a{color:#CB3577;text-decoration:none;} body{padding: 0px 16px;font-size:16px;color: #333;\tfont-family: 'Open Sans', Helvetica, Arial, sans-serif;\n\tline-height: 150%;margin: 0;font-weight: 500}</style>");
        }
        return string;
    }

    private void rainLogNewsView() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"controller", (Object)"articles");
            hashMap.put((Object)"action", (Object)"detail");
            hashMap.put((Object)"id", (Object)String.valueOf((int)this.mArticle.id));
            this.analyticsManager.logRainView(this.rainApi, this.userManager.getUserId(), this.hashView, (Map)hashMap);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private boolean recognizeAndProcessUrl(String string) {
        int n2 = this.getNewsIdFromUrlOrZero(string);
        if (n2 != 0) {
            this.showNewsActivity(n2);
            return true;
        }
        n2 = this.getProgramIdFromUrlOrZero(string);
        if (n2 != 0) {
            this.showProgramActivity(n2);
            return true;
        }
        long l = this.getTimeCodePosition(string);
        if (l > 0L) {
            this.getArticleVideoAuto(this.mArticle.id, 0, new k3(this, l));
            return true;
        }
        return false;
    }

    private void setGallery(List<Gallery> list) {
        if (list != null && list.size() != 0) {
            this.getSupportFragmentManager().beginTransaction().replace(2131296652, (Fragment)GalleryFragment.newInstance((Gallery)list.get(0))).commit();
            return;
        }
        this.galleryFragment.setVisibility(8);
    }

    private void setProgram(Article article) {
        this.addSubscription(this.rainApi.programsById(this.getAuthorization(), Integer.valueOf((int)1280), Integer.valueOf((int)720), String.valueOf((int)article.program_id)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new y4(this, article, 4), (Action1)new v1(15)));
    }

    private void setVideo(Article article) {
        if (!(this.mArticle.preview_img.isEmpty() && this.mArticle.detail_img.isEmpty() || ListUtils.isEmptyList((List)article.video))) {
            this.playVideoImageView.setVisibility(0);
            this.mPaymentIcon.setVisibility(8);
            this.mPartLayout.removeAllViews();
            int n2 = 1;
            while (n2 < ListUtils.getListSize((List)article.video)) {
                TextView textView = new TextView((Context)this);
                StringBuilder stringBuilder = z2.t("\u0427\u0430\u0441\u0442\u044c ");
                int n4 = n2 + 1;
                stringBuilder.append(n4);
                textView.setText((CharSequence)stringBuilder.toString());
                textView.setTextColor(this.getResources().getColor(2131099754));
                textView.setTextSize(15.0f);
                textView.setPadding(0, 0, 16, 0);
                textView.setTag((Object)n2);
                textView.setOnClickListener((View.OnClickListener)new d0(this, article, 6));
                this.mPartLayout.addView((View)textView);
                n2 = n4;
            }
        }
    }

    private void share() {
        Article article = this.mArticle;
        if (article == null) {
            return;
        }
        this.tagManager.logEvent("share", this.gtmGetScreenName(article.id), null);
        try {
            article = new Intent("android.intent.action.SEND");
            article.setType("text/plain");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.mArticle.name);
            stringBuilder.append(" ");
            stringBuilder.append(this.generateUrlForShare(this.mArticle.url));
            article.putExtra("android.intent.extra.TEXT", stringBuilder.toString());
            this.startActivity(Intent.createChooser((Intent)article, (CharSequence)this.getString(2131755557)));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void showArticleVideo(Article article, int n2, boolean bl) {
        if (article.useYouTube(n2)) {
            Intent intent = new Intent((Context)this, YouTubeVideoActivity.class);
            intent.putExtra("youtube_id", article.getYoutubeId(n2));
            this.startActivity(intent);
        } else {
            this.showProgressDialog();
            this.getArticleVideoAuto(this.mArticle.id, n2, new z(this, article, bl));
        }
    }

    private void showResumeVideoDialog(boolean bl, long l) {
        new MaterialDialog.Builder((Context)this).positiveColorRes(2131099728).negativeColorRes(2131099728).content(2131755475).positiveText(2131755476).negativeText(2131755477).onPositive(new m3(this, bl, l)).onNegative(new a0(this, bl, 1)).cancelable(true).show();
    }

    private void showTimeCodes(List<Video> object) {
        if ((object = this.getTimeCodesHtml((List<Video>)object)).length() > 0) {
            this.timeCodesWebView.getSettings().setJavaScriptEnabled(false);
            this.timeCodesWebView.getSettings().setDefaultTextEncodingName("utf-8");
            this.timeCodesWebView.setWebViewClient(new WebViewClient(this, null){
                public final NewsActivity this$0;
                {
                    this.this$0 = newsActivity;
                }
                {
                    this(newsActivity);
                }

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                private boolean processUrl(String string) {
                    boolean bl = this.this$0.recognizeAndProcessUrl(string);
                    if (!(bl || string.startsWith("http://tvrain.tv") || string.startsWith("https://tvrain.tv"))) {
                        HashMap hashMap = new HashMap();
                        hashMap.put((Object)"link", (Object)string);
                        TagManager tagManager = this.this$0.tagManager;
                        NewsActivity newsActivity = this.this$0;
                        tagManager.logEvent("outer_link", newsActivity.gtmGetScreenName(newsActivity.mArticle.id), (Map)hashMap);
                    }
                    if (bl) return true;
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String)string));
                        this.this$0.startActivity(intent);
                        return true;
                    }
                    catch (Exception exception) {
                        return true;
                    }
                }

                public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    if (this.processUrl(webResourceRequest.getUrl().toString())) {
                        return true;
                    }
                    return super.shouldOverrideUrlLoading(webView, webResourceRequest);
                }

                public boolean shouldOverrideUrlLoading(WebView webView, String string) {
                    boolean bl = this.processUrl(string) || super.shouldOverrideUrlLoading(webView, string);
                    return bl;
                }
            });
            this.timeCodesWebView.loadDataWithBaseURL("https://tvrain.tv/", object, "text/html", "utf-8", null);
            this.timeCodesWebView.setVisibility(0);
        } else {
            this.timeCodesWebView.setVisibility(8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void showVideoActivity(boolean bl, long l) {
        try {
            Intent intent = new Intent((Context)this, VideoActivity.class);
            IVideo iVideo = this.videoToShow;
            if (iVideo instanceof Video) {
                intent.putExtra("video", (Serializable)((Video)iVideo));
            }
            if ((iVideo = this.videoToShow) instanceof AutoVideo) {
                intent.putExtra("auto_video", (Serializable)((AutoVideo)iVideo));
            }
            intent.putExtra("article", (Serializable)this.articleToShow);
            intent.putExtra("start_casting", bl);
            if (l != 0L) {
                intent.putExtra("position", l);
            }
            this.startActivity(intent);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void showVideoActivityAfterAd(IVideo iVideo, Article article, boolean bl) {
        this.videoToShow = iVideo;
        this.articleToShow = article;
        iVideo = this.castHelper;
        if (iVideo != null && iVideo.getCurrentSession() != null) {
            this.getVideoSavedPositionAndShowVideoActivity(bl);
        } else {
            this.getVideoSavedPositionAndShowVideoActivity(false);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean startNewCast() {
        boolean bl;
        CastHelper castHelper;
        boolean bl2 = false;
        try {
            castHelper = this.castHelper;
            bl = bl2;
            if (castHelper == null) return bl;
            bl = bl2;
        }
        catch (Exception exception) {
            return bl2;
        }
        if (castHelper.getCurrentSession() == null) return bl;
        bl = bl2;
        if (this.mArticle == null) return bl;
        boolean bl3 = this.castHelper.getCurrentSession().getRemoteMediaClient().getMediaInfo().getMetadata().getString("article_id").equals((Object)String.valueOf((int)this.mArticle.id));
        bl = bl2;
        if (bl3) return bl;
        return true;
    }

    private void updateAuthorsView(Article article) {
        StringBuilder stringBuilder = new StringBuilder();
        if (article.hasAuthors()) {
            Iterator iterator = article.authors.iterator();
            while (iterator.hasNext()) {
                this.addAuthorHtml(stringBuilder, (Author)iterator.next());
            }
        }
        if (article.hasPresenters()) {
            article = article.presenters.iterator();
            while (article.hasNext()) {
                this.addAuthorHtml(stringBuilder, (Author)article.next());
            }
        }
        if (stringBuilder.length() > 0) {
            this.authors.setMovementMethod(LinkMovementMethod.getInstance());
            this.authors.setText((CharSequence)Html.fromHtml((String)stringBuilder.toString(), (int)0));
            ViewUtils.stripUnderlines((Spannable)this.authors.getText());
            this.authors.setPaintFlags(0);
        } else {
            this.authors.setText((CharSequence)"");
            this.authors.setVisibility(8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void updateFavItem() {
        if (this.favMenuItem == null) return;
        try {
            Article article = this.mArticle;
            if (article != null && article.isFavorite()) {
                this.favMenuItem.setIcon(this.getResources().getDrawable(2131230807));
                this.favMenuItem.setTitle(2131755539);
                return;
            }
            this.favMenuItem.setIcon(this.getResources().getDrawable(2131230806));
            this.favMenuItem.setTitle(2131755041);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void updateView(Article article) {
        Object object;
        if (article == null) {
            return;
        }
        this.newsTitle.setText((CharSequence)article.name.trim());
        this.updateAuthorsView(article);
        if (article.getViewsCount() > 0) {
            DecimalFormat decimalFormat = (DecimalFormat)NumberFormat.getInstance((Locale)Locale.getDefault());
            object = decimalFormat.getDecimalFormatSymbols();
            object.setGroupingSeparator(' ');
            decimalFormat.setDecimalFormatSymbols(object);
            this.viewsCount.setText((CharSequence)decimalFormat.format((long)article.getViewsCount()));
            this.viewsCountContainer.setVisibility(0);
        } else {
            this.viewsCountContainer.setVisibility(8);
        }
        if (article.getDate() != null) {
            object = DateUtils.getRelativeDateTimeString((Context)this, (long)article.getDate().getTime(), (long)86400000L, (long)604800000L, (int)0).toString();
            this.date.setText((CharSequence)object);
        }
        if (ListUtils.isEmptyList((List)article.video)) {
            this.mDetailImg.setVisibility(8);
        } else if (!article.detail_img.isEmpty()) {
            Picasso.get().load(article.detail_img).fit().centerCrop().into(this.mDetailImg);
        } else if (!article.preview_img.isEmpty()) {
            Picasso.get().load(article.preview_img).fit().centerCrop().into(this.mDetailImg);
        } else {
            this.mDetailImg.setVisibility(8);
        }
        this.updateWebView(article);
        if (this.isAllowedForSubscribersActive(article)) {
            this.showFullText = true;
            this.fullTextForSubscribersLayout.setVisibility(0);
        } else {
            this.showFullText = false;
            this.fullTextForSubscribersLayout.setVisibility(8);
        }
    }

    private void updateView(Program program) {
        if (program != null) {
            this.mProgram.setText((CharSequence)program.name);
        } else {
            this.mProgram.setText((CharSequence)"\u041d\u0430\u0437\u0432\u0430\u043d\u0438\u0435 \u043f\u0440\u043e\u0433\u0440\u0430\u043c\u043c\u044b");
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void updateWebView(Article object) {
        try {
            void var1_4;
            String string = object.predetail_text_html;
            if (string != null && !string.isEmpty()) {
                this.predetailWebView.getSettings().setJavaScriptEnabled(false);
                this.predetailWebView.getSettings().setDefaultTextEncodingName("utf-8");
                WebView webView = this.predetailWebView;
                WebViewClient webViewClient = new /* invalid duplicate definition of identical inner class */;
                webView.setWebViewClient(webViewClient);
                this.predetailWebView.loadDataWithBaseURL("https://tvrain.tv/", this.preparePredetailHtml(object.predetail_text_html), "text/html", "utf-8", null);
                this.predetailWebView.setVisibility(0);
            } else {
                this.predetailWebView.setVisibility(8);
            }
            this.webView.getSettings().setJavaScriptEnabled(true);
            this.webView.getSettings().setDefaultTextEncodingName("utf-8");
            WebView webView = this.webView;
            WebViewClient webViewClient = new /* invalid duplicate definition of identical inner class */;
            webView.setWebViewClient(webViewClient);
            if (!this.showFullText) {
                if (this.mArticle.getParagraphsCount() > 3 && this.mArticle.html.length() > 1500) {
                    this.fullTextLayout.setVisibility(0);
                } else {
                    this.showFullText = true;
                }
            }
            if (this.isAllowedForSubscribersActive((Article)object)) {
                String string2 = object.preview_text;
            } else {
                String string3 = object.html;
            }
            String string4 = this.changeLeadFontSettings(this.fitImagesToScreenWidth((String)var1_4));
            this.webView.loadDataWithBaseURL("https://tvrain.tv/", string4, "text/html", "utf-8", null);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.webView.setVisibility(8);
        }
    }

    public static /* synthetic */ void z(NewsActivity newsActivity, Article article) {
        newsActivity.lambda$initViews$2(article);
    }

    @OnClick(value={2131296421})
    public void buySubscription() {
        TagManagerUtils.logPayWallClick((TagManager)this.tagManager, (String)"\u043c\u0430\u0442\u0435\u0440\u0438\u0430\u043b \u0432\u043d\u0438\u0437\u0443");
        this.sendToDonationPage("News activity webview bottom", new i3(this, 3));
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
        return 2131492901;
    }

    @Override
    public void onActivityResult(int n2, int n4, Intent intent) {
        super.onActivityResult(n2, n4, intent);
        if (n2 == 11) {
            this.showVideoActivity(false, 0L);
        }
    }

    public void onBackPressed() {
        if (this.isTaskRoot()) {
            this.startActivity(new Intent((Context)this, MainActivity.class));
            this.finish();
        } else {
            this.finish();
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.castHelper = new CastHelper((AppCompatActivity)this, bundle);
        try {
            BusProvider.getInstance().register(this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.mDeepLink = this.getIntent().getStringExtra("link");
        this.initViews();
        this.getArticles();
        this.timeCodesWebView.setVisibility(8);
        this.handleClick();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(2131558402, menu);
        try {
            MenuItem menuItem = menu.findItem(2131296310);
            IconicsDrawable iconicsDrawable = new IconicsDrawable((Context)this);
            menuItem.setIcon((Drawable)iconicsDrawable.icon((IIcon)GoogleMaterial.Icon.gmd_share).color(-1).actionBar());
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            this.favMenuItem = menu.findItem(2131296308);
            this.updateFavItem();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            this.castHelper.onCreateOptionsMenu(menu);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return true;
    }

    @Override
    public void onDestroy() {
        RecyclerView.Adapter adapter = this.bestAdapter;
        if (adapter != null) {
            adapter.release();
        }
        if ((adapter = this.recommendationsAdapter) != null) {
            adapter.setOnClickListener(null);
        }
        try {
            this.webView.stopLoading();
            this.webView.removeAllViews();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            this.webView.destroy();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        adapter = this.castHelper;
        if (adapter != null) {
            adapter.destroy();
        }
        try {
            BusProvider.getInstance().unregister(this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        super.onDestroy();
    }

    @OnClick(value={2131296648})
    public void onFullTextClicked() {
        this.fullTextLayout.setVisibility(8);
        this.showFullText = true;
        this.updateWebView(this.mArticle);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int n2 = menuItem.getItemId();
        if (n2 != 16908332) {
            if (n2 != 2131296308) {
                if (n2 == 2131296310) {
                    this.share();
                }
            } else {
                this.toggleFav(this.mArticle, true, new j3(this, 1));
            }
            return super.onOptionsItemSelected(menuItem);
        }
        this.onBackPressed();
        return true;
    }

    @Override
    public void onPause() {
        super.onPause();
        this.castHelper.onPause();
    }

    @OnClick(value={2131297010})
    public void onPlayVideoClicked() {
        if (this.startNewCast()) {
            this.showArticleVideo(this.mArticle, 0, true);
        } else {
            this.showArticleVideo(this.mArticle, 0, false);
        }
    }

    @OnClick(value={2131297024})
    public void onProgramContainerClicked() {
        int n2 = this.mArticle.program_id;
        if (n2 != 0) {
            this.showProgramActivity(n2);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.castHelper.onResume();
    }

    public void onStart() {
        if (AudioActivity.isCreated()) {
            Intent intent = new Intent((Context)this, AudioActivity.class);
            intent.setFlags(131072);
            this.startActivity(intent);
        }
        super.onStart();
    }

    @OnClick(value={2131297172})
    public void onSubscriptionClicked() {
        TagManagerUtils.logPayWallClick((TagManager)this.tagManager, (String)"\u0448\u0430\u043f\u043a\u0430 \u0443 \u043c\u0430\u0442\u0435\u0440\u0438\u0430\u043b\u0430");
        this.sendToDonationPage("News activity top", new i3(this, 8));
    }
}

