/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.text.TextUtils
 *  android.text.format.DateUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ItemDecoration
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  com.squareup.picasso.Picasso
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  ru.tvrain.core.Consts
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.FirstScreenResponseItem
 *  ru.tvrain.core.data.FirstScreenResponseItemRecord
 *  tvrain.managers.UserManager
 */
package com.hintsolutions.raintv.news.adapters;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.hintsolutions.raintv.adapters.NewsSliderAdapter;
import com.hintsolutions.raintv.interfaces.AddToFavoritesClickListener;
import com.hintsolutions.raintv.news.NewsActivity;
import com.hintsolutions.raintv.news.NewsListActivity;
import com.hintsolutions.raintv.news.adapters.a;
import com.hintsolutions.raintv.news.adapters.b;
import com.hintsolutions.raintv.utils.CommonUtils;
import com.hintsolutions.raintv.views.HorizontalSpaceItemDecoration;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.tvrain.core.Consts;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.FirstScreenResponseItem;
import ru.tvrain.core.data.FirstScreenResponseItemRecord;
import tvrain.managers.UserManager;
import za.co.immedia.pinnedheaderlistview.SectionedBaseAdapter;

public class AllNewsSectionedAdapter
extends SectionedBaseAdapter
implements Consts {
    private static final int SECTION_TYPE_API_DEFAULT = 3;
    private static final int SECTION_TYPE_SLIDER = 2;
    private static final int SECTION_TYPE_THEMEOFTHEDAY = 1;
    private static final int SECTION_TYPE_TOP = 4;
    private static final int SECTION_TYPE_UNDER_HEADER = 13;
    private final Context mContext;
    private AddToFavoritesClickListener mOnFavClickListener;
    private List<Section> sections = new ArrayList();
    private String underMainHeaderText;

    public AllNewsSectionedAdapter(Context context, boolean bl, AddToFavoritesClickListener addToFavoritesClickListener, UserManager userManager) {
        this.mContext = context;
        this.mOnFavClickListener = addToFavoritesClickListener;
    }

    public static /* synthetic */ void a(Article article, View view) {
        AllNewsSectionedAdapter.lambda$getThemesOfTheDayView$0(article, view);
    }

    private void addOnNewsClickEvent(View view, int n2) {
        view.setOnClickListener((View.OnClickListener)new l(n2));
    }

    public static /* synthetic */ void b(AllNewsSectionedAdapter allNewsSectionedAdapter, Article article) {
        allNewsSectionedAdapter.lambda$getSliderView$5(article);
    }

    public static /* synthetic */ void c(AllNewsSectionedAdapter allNewsSectionedAdapter, View view) {
        allNewsSectionedAdapter.lambda$getThemesOfTheDayView$1(view);
    }

    public static /* synthetic */ void d(AllNewsSectionedAdapter allNewsSectionedAdapter, Article article, ImageView imageView, View view) {
        allNewsSectionedAdapter.lambda$showAddToFavorites$4(article, imageView, view);
    }

    public static /* synthetic */ void e(AllNewsSectionedAdapter allNewsSectionedAdapter, Article article, TopViewHolder topViewHolder, View view) {
        allNewsSectionedAdapter.lambda$getTopView$7(article, topViewHolder, view);
    }

    public static /* synthetic */ void f(Article article, View view) {
        AllNewsSectionedAdapter.lambda$getTopView$8(article, view);
    }

    public static /* synthetic */ void g(int n2, View view) {
        AllNewsSectionedAdapter.lambda$addOnNewsClickEvent$2(n2, view);
    }

    private View getDefaultViewBig(Section section, int n2, View object, ViewGroup viewGroup) {
        NewsBigViewHolder newsBigViewHolder;
        Article article = ((FirstScreenResponseItemRecord)section.items.get(n2)).toArticle();
        if (object != null && object.getTag() instanceof NewsBigViewHolder) {
            newsBigViewHolder = object.getTag();
            viewGroup = object;
            object = newsBigViewHolder;
        } else {
            viewGroup = LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131493112, viewGroup, false);
            object = new Object((View)viewGroup){
                @BindView(value=2131296344)
                public ImageView addToFavorites;
                @BindView(value=2131297316)
                public TextView duration;
                @BindView(value=2131297317)
                public View durationLayout;
                @BindView(value=2131296579)
                public View elementDivider;
                @BindView(value=2131296689)
                public ImageView image;
                @BindView(value=2131296704)
                public View imageLayout;
                @BindView(value=2131296719)
                public View itemLayout;
                @BindView(value=2131297202)
                public TextView name;
                @BindView(value=2131297027)
                public TextView programName;
                @BindView(value=2131297224)
                public View textLayout;
                {
                    ButterKnife.bind((Object)this, (View)view);
                }
            };
            viewGroup.setTag(object);
        }
        newsBigViewHolder = this.mContext;
        int n4 = n2 == 0 ? CommonUtils.dpToPx((Context)newsBigViewHolder, 10) : (int)newsBigViewHolder.getResources().getDimension(2131165339);
        newsBigViewHolder = object.itemLayout;
        newsBigViewHolder.setPadding(newsBigViewHolder.getPaddingLeft(), n4, object.itemLayout.getPaddingRight(), object.itemLayout.getPaddingBottom());
        if (n2 == section.items.size() - 1) {
            object.elementDivider.setVisibility(8);
        } else {
            object.elementDivider.setVisibility(0);
        }
        this.showText(article, object.textLayout, object.name, article.name, 3);
        if (article.hasPreviewImage()) {
            this.showImage(article, object.image, 2131231367);
            object.imageLayout.setVisibility(0);
            this.showAddToFavorites(article, object.addToFavorites);
            this.showDuration(article, object.durationLayout, object.duration);
        } else {
            object.imageLayout.setVisibility(8);
        }
        if (!TextUtils.isEmpty((CharSequence)article.getProgramName())) {
            object.programName.setText((CharSequence)article.getProgramName());
            object.programName.setVisibility(0);
        }
        this.addOnNewsClickEvent((View)viewGroup, article.id);
        return viewGroup;
    }

    private View getDefaultViewSmall(Section object, int n2, View view, ViewGroup viewGroup) {
        Article article = ((FirstScreenResponseItemRecord)object.items.get(n2)).toArticle();
        if (view != null && view.getTag() instanceof NewsSmallViewHolder) {
            object = view.getTag();
        } else {
            view = LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131493117, viewGroup, false);
            object = new Object(view){
                @BindView(value=2131297316)
                public TextView duration;
                @BindView(value=2131297317)
                public View durationLayout;
                @BindView(value=2131296579)
                public View elementDivider;
                @BindView(value=2131296689)
                public ImageView image;
                @BindView(value=2131296704)
                public View imageLayout;
                @BindView(value=2131297202)
                public TextView name;
                @BindView(value=2131297224)
                public View textLayout;
                {
                    ButterKnife.bind((Object)this, (View)view);
                }
            };
            view.setTag(object);
        }
        this.showText(article, object.textLayout, object.name, article.name, 3);
        if (article.hasPreviewImage()) {
            this.showImage(article, object.image, 2131230955);
            this.showDuration(article, object.durationLayout, object.duration);
        }
        this.addOnNewsClickEvent(view, article.id);
        return view;
    }

    private List<FirstScreenResponseItemRecord> getResponseItemsByCode(ArrayList<FirstScreenResponseItem> firstScreenResponseItem2, String string) {
        for (FirstScreenResponseItem firstScreenResponseItem2 : firstScreenResponseItem2) {
            if (!firstScreenResponseItem2.code.equals((Object)string)) continue;
            return firstScreenResponseItem2.items;
        }
        return null;
    }

    private View getSliderView(Section object, View view, ViewGroup object2) {
        if (view != null && view.getTag() instanceof SliderViewHolder) {
            object2 = view.getTag();
        } else {
            view = LayoutInflater.from((Context)object2.getContext()).inflate(2131493000, object2, false);
            object2 = new Object(view){
                @BindView(value=2131296721)
                public RecyclerView items;
                @BindView(value=2131297108)
                public TextView sectionHeader;
                {
                    ButterKnife.bind((Object)this, (View)view);
                }
            };
            view.setTag(object2);
        }
        object2.sectionHeader.setText((CharSequence)(object).name);
        object = new NewsSliderAdapter(this.mContext, this.recordsToArticles(object.items), false, new s4((Object)this, 9));
        object2.items.setAdapter((RecyclerView.Adapter)object);
        int n2 = (int)this.mContext.getResources().getDimension(2131165339);
        if (object2.items.getItemDecorationCount() == 0) {
            object2.items.addItemDecoration((RecyclerView.ItemDecoration)new HorizontalSpaceItemDecoration(CommonUtils.dpToPx(this.mContext, 18), n2, n2));
        }
        return view;
    }

    private View getThemesOfTheDayView(Section section, int n2, View view, ViewGroup object) {
        Object object2 = (FirstScreenResponseItemRecord)section.items.get(n2);
        Article article = object2.toArticle();
        if (view != null && view.getTag() instanceof MainNewsViewHolder) {
            object = view.getTag();
        } else {
            view = LayoutInflater.from((Context)object.getContext()).inflate(2131492994, object, false);
            object = new Object(view){
                @BindView(value=2131296354)
                public View allNewsLink;
                @BindView(value=2131296527)
                public TextView date;
                @BindView(value=2131296579)
                public View elementDivider;
                @BindView(value=2131296946)
                public TextView name;
                {
                    ButterKnife.bind((Object)this, (View)view);
                }
            };
            view.setTag(object);
        }
        String string = article.name;
        if (object2.getDate() != null) {
            object2 = DateUtils.getRelativeDateTimeString((Context)this.mContext, (long)object2.getDate().getTime(), (long)86400000L, (long)604800000L, (int)0).toString();
            object.date.setText((CharSequence)object2);
            object.date.setVisibility(0);
        } else {
            object.date.setVisibility(8);
        }
        object.name.setText((CharSequence)string);
        view.setOnClickListener((View.OnClickListener)new m(article, 1));
        if (section.items.size() - 1 == n2) {
            object.allNewsLink.setVisibility(0);
            object.allNewsLink.setOnClickListener((View.OnClickListener)new c0((Object)this, 1));
        } else {
            object.allNewsLink.setVisibility(8);
        }
        return view;
    }

    private View getTopView(Section object, View view, ViewGroup viewGroup) {
        Article article = ((FirstScreenResponseItemRecord)object.items.get(0)).toArticle();
        if (view != null && view.getTag() instanceof TopViewHolder) {
            object = view.getTag();
        } else {
            view = LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131493001, viewGroup, false);
            object = new Object(view){
                @BindView(value=2131296344)
                public ImageView addToFavorites;
                @BindView(value=2131296579)
                public View elementDivider;
                @BindView(value=2131296689)
                public ImageView image;
                @BindView(value=2131296704)
                public View imageLayout;
                @BindView(value=2131296946)
                public TextView name;
                {
                    ButterKnife.bind((Object)this, (View)view);
                }
            };
            view.setTag(object);
        }
        if (article.hasPreviewImage()) {
            object.imageLayout.setVisibility(0);
            this.showImage(article, object.image, 2131231367);
            if (this.mOnFavClickListener != null) {
                this.updateFavImage(object.addToFavorites, article);
                object.addToFavorites.setVisibility(0);
                object.addToFavorites.setOnClickListener((View.OnClickListener)new b(0, object, this, article));
            } else {
                object.addToFavorites.setVisibility(8);
            }
        } else {
            object.imageLayout.setVisibility(8);
            object.addToFavorites.setVisibility(8);
        }
        object.name.setText((CharSequence)article.name);
        view.setOnClickListener((View.OnClickListener)new m(article, 0));
        return view;
    }

    private View getUnderHeaderView(Section object, View view, ViewGroup viewGroup) {
        Article article = ((FirstScreenResponseItemRecord)object.items.get(0)).toArticle();
        if (view != null && view.getTag() instanceof UnderHeaderViewHolder) {
            object = view.getTag();
        } else {
            view = LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131493002, viewGroup, false);
            object = new Object(view){
                @BindView(value=2131297302)
                public TextView text;
                {
                    ButterKnife.bind((Object)this, (View)view);
                }
            };
            view.setTag(object);
        }
        object.text.setText((CharSequence)article.name);
        return view;
    }

    public static /* synthetic */ void h(AllNewsSectionedAdapter allNewsSectionedAdapter, ImageView imageView, Article article) {
        allNewsSectionedAdapter.lambda$showAddToFavorites$3(imageView, article);
    }

    public static /* synthetic */ void i(AllNewsSectionedAdapter allNewsSectionedAdapter, TopViewHolder topViewHolder, Article article) {
        allNewsSectionedAdapter.lambda$getTopView$6(topViewHolder, article);
    }

    private static /* synthetic */ void lambda$addOnNewsClickEvent$2(int n2, View view) {
        Intent intent = new Intent(view.getContext(), NewsActivity.class);
        intent.putExtra("id", n2);
        view.getContext().startActivity(intent);
    }

    private /* synthetic */ void lambda$getSliderView$5(Article article) {
        Intent intent = new Intent(this.mContext, NewsActivity.class);
        intent.putExtra("id", article.id);
        this.mContext.startActivity(intent);
    }

    private static /* synthetic */ void lambda$getThemesOfTheDayView$0(Article article, View view) {
        Intent intent = new Intent(view.getContext(), NewsActivity.class);
        intent.putExtra("id", article.id);
        view.getContext().startActivity(intent);
    }

    private /* synthetic */ void lambda$getThemesOfTheDayView$1(View view) {
        view = new Intent(this.mContext, NewsListActivity.class);
        this.mContext.startActivity((Intent)view);
    }

    private /* synthetic */ void lambda$getTopView$6(TopViewHolder topViewHolder, Article article) {
        this.updateFavImage(topViewHolder.addToFavorites, article);
    }

    private /* synthetic */ void lambda$getTopView$7(Article article, TopViewHolder topViewHolder, View view) {
        this.mOnFavClickListener.onItemClicked(article, new a(0, topViewHolder, this, article));
    }

    private static /* synthetic */ void lambda$getTopView$8(Article article, View view) {
        Intent intent = new Intent(view.getContext(), NewsActivity.class);
        intent.putExtra("id", article.id);
        view.getContext().startActivity(intent);
    }

    private /* synthetic */ void lambda$showAddToFavorites$3(ImageView imageView, Article article) {
        this.updateFavImage(imageView, article);
    }

    private /* synthetic */ void lambda$showAddToFavorites$4(Article article, ImageView imageView, View view) {
        this.mOnFavClickListener.onItemClicked(article, new a(1, imageView, this, article));
    }

    private List<Article> recordsToArticles(List<FirstScreenResponseItemRecord> iterator) {
        if (iterator != null && iterator.size() != 0) {
            ArrayList arrayList = new ArrayList();
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                arrayList.add((Object)((FirstScreenResponseItemRecord)iterator.next()).toArticle());
            }
            return arrayList;
        }
        return null;
    }

    private void setupUnderHeaderWidget() {
        String string = this.underMainHeaderText;
        if (string != null && !string.equals((Object)"")) {
            string = new ArrayList();
            FirstScreenResponseItemRecord firstScreenResponseItemRecord = new FirstScreenResponseItemRecord();
            firstScreenResponseItemRecord.id = -1;
            firstScreenResponseItemRecord.name = this.underMainHeaderText;
            firstScreenResponseItemRecord.favorite = 0;
            firstScreenResponseItemRecord.videoDuration = 0;
            string.add((Object)firstScreenResponseItemRecord);
            this.sections.add(0, new Object(13, (List<FirstScreenResponseItemRecord>)string, null){
                private Map<Integer, Integer> ads = new HashMap();
                public List<FirstScreenResponseItemRecord> items;
                private String name;
                private int type;
                {
                    this.type = n2;
                    this.items = list;
                    this.name = string;
                }

                public void addAd(int n2, int n4) {
                    this.ads.put((Object)n2, (Object)n4);
                }

                public Integer getAdForIndex(int n2) {
                    Integer n4 = (Integer)this.ads.get((Object)n2);
                    n2 = n4 != null ? n4 : 0;
                    return n2;
                }

                public int size() {
                    int n2 = this.type == 2 ? 1 : this.items.size();
                    return n2;
                }
            });
        }
    }

    private void showAddToFavorites(Article article, ImageView imageView) {
        if (this.mOnFavClickListener != null) {
            this.updateFavImage(imageView, article);
            imageView.setVisibility(0);
            imageView.setOnClickListener((View.OnClickListener)new b(1, imageView, this, article));
        } else {
            imageView.setVisibility(8);
        }
    }

    private void showDuration(Article article, View view, TextView textView) {
        if (article.hasVideoDuration()) {
            view.setVisibility(0);
            textView.setText((CharSequence)article.renderVideoDuration());
        } else {
            view.setVisibility(8);
        }
    }

    private void showImage(Article article, ImageView imageView, int n2) {
        Picasso.get().load(article.preview_img).placeholder(n2).fit().centerCrop().into(imageView);
    }

    private void showText(Article article, View view, TextView textView, String string, int n2) {
        if (string != null) {
            textView.setText((CharSequence)string);
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    private void updateFavImage(ImageView imageView, Article article) {
        Resources resources = this.mContext.getResources();
        int n2 = article.isFavorite() ? 2131230807 : 2131230806;
        imageView.setImageDrawable(resources.getDrawable(n2));
    }

    public void destroy() {
    }

    @Override
    public int getCountForSection(int n2) {
        return (this.sections.get(n2)).size();
    }

    public Article getItem(int n2, int n4) {
        return null;
    }

    @Override
    public long getItemId(int n2, int n4) {
        return 0L;
    }

    @Override
    public View getItemView(int n2, int n4, View view, ViewGroup viewGroup) {
        Section section = this.sections.get(n2);
        if ((n2 = section.type) != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        if (n2 != 13) {
                            return null;
                        }
                        return this.getUnderHeaderView(section, view, viewGroup);
                    }
                    return this.getTopView(section, view, viewGroup);
                }
                return this.getDefaultViewBig(section, n4, view, viewGroup);
            }
            return this.getSliderView(section, view, viewGroup);
        }
        return this.getThemesOfTheDayView(section, n4, view, viewGroup);
    }

    @Override
    public int getSectionCount() {
        return this.sections.size();
    }

    @Override
    public View getSectionHeaderView(int n2, View object, ViewGroup viewGroup) {
        object = this.sections.get(n2);
        if ((object).name != null && (object).type != 2) {
            viewGroup = (LinearLayout)((LayoutInflater)viewGroup.getContext().getSystemService("layout_inflater")).inflate(2131493145, viewGroup, false);
            ((TextView)viewGroup.findViewById(2131297108)).setText((CharSequence)(object).name);
            return viewGroup;
        }
        return LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131493191, viewGroup, false);
    }

    public void setUnderMainHeaderText(String string) {
        this.underMainHeaderText = string;
    }

    public void setupWith(ArrayList<FirstScreenResponseItem> object) {
        Iterator iterator;
        this.sections.clear();
        Iterator iterator22 = iterator = this.getResponseItemsByCode((ArrayList<FirstScreenResponseItem>)object, "api_ourchoice");
        if (iterator == null) {
            iterator22 = this.getResponseItemsByCode((ArrayList<FirstScreenResponseItem>)object, "api_ourchoice_first");
        }
        if (iterator22 != null && iterator22.size() > 0) {
            this.sections.add(new /* invalid duplicate definition of identical inner class */);
        }
        for (Iterator iterator22 : object) {
            object = iterator22.items;
            if (object == null || object.size() == 0 || iterator22.code.equals((Object)"api_menu") || iterator22.code.equals((Object)"api_ourchoice_first") || iterator22.code.equals((Object)"api_breaking")) continue;
            object = iterator22.template;
            object.getClass();
            int n2 = -1;
            switch (object.hashCode()) {
                default: {
                    break;
                }
                case 1961904806: {
                    if (!object.equals((Object)"api_slider")) break;
                    n2 = 2;
                    break;
                }
                case 1544803905: {
                    if (!object.equals((Object)"default")) break;
                    n2 = 1;
                    break;
                }
                case 58604828: {
                    if (!object.equals((Object)"api_default")) break;
                    n2 = 0;
                }
            }
            switch (n2) {
                default: {
                    object = null;
                    break;
                }
                case 2: {
                    object = new /* invalid duplicate definition of identical inner class */;
                    break;
                }
                case 1: {
                    if (iterator22.code.equals((Object)"api_themesoftheday")) {
                        object = new /* invalid duplicate definition of identical inner class */;
                        break;
                    }
                    object = new /* invalid duplicate definition of identical inner class */;
                    break;
                }
                case 0: {
                    object = new /* invalid duplicate definition of identical inner class */;
                }
            }
            if (object == null) continue;
            if (iterator22.code.equals((Object)"api_ourchoice")) {
                object.items.remove(0);
            }
            this.sections.add(object);
        }
        this.setupUnderHeaderWidget();
        this.notifyDataSetChanged();
    }
}

