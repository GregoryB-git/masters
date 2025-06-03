/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.Html
 *  android.text.TextUtils
 *  android.text.format.DateFormat
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  com.squareup.picasso.Picasso
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Calendar
 *  java.util.Date
 *  java.util.List
 *  ru.tvrain.core.data.Article
 */
package com.hintsolutions.raintv.adapters;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.hintsolutions.raintv.interfaces.AdapterViewItem;
import com.squareup.picasso.Picasso;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import ru.tvrain.core.data.Article;

public class SmallNewsListAdapter
extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int TYPE_FOOTER = 3;
    private static final int TYPE_HEADER = 2;
    private static final int TYPE_ITEM = 1;
    private Context context;
    private AdapterViewItem footer = null;
    private AdapterViewItem header = null;
    private List<Article> items;
    private OnItemClickListener onItemClickListener;

    public SmallNewsListAdapter(Context context, List<Article> list, OnItemClickListener onItemClickListener) {
        this.context = context;
        this.items = list;
        this.onItemClickListener = onItemClickListener;
    }

    public static /* synthetic */ void a(SmallNewsListAdapter smallNewsListAdapter, Article article, View view) {
        smallNewsListAdapter.lambda$onBindViewHolder$0(article, view);
    }

    private String getDatePrefix() {
        return "";
    }

    private String getDateStr(Article article) {
        if (this.isThisYear(article.getDate())) {
            return DateFormat.format((CharSequence)"dd MMM", (Date)article.getDate()).toString();
        }
        return DateFormat.format((CharSequence)"dd.MM.yyyy", (Date)article.getDate()).toString();
    }

    private String getTextPrefix(Article object) {
        object = object.getDate() != null ? (this.isThisYear(object.getDate()) ? "             " : "               ") : "";
        return object;
    }

    private boolean isThisYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        boolean bl = true;
        if (calendar.get(1) % 100 != calendar2.get(1) % 100) {
            bl = false;
        }
        return bl;
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(Article article, View view) {
        this.onItemClickListener.onClick(article);
    }

    public int getItemCount() {
        List<Article> list = this.items;
        int n = list == null ? 0 : list.size();
        int n3 = n;
        if (this.footer != null) {
            n3 = n + 1;
        }
        n = n3;
        if (this.header != null) {
            n = n3 + 1;
        }
        return n;
    }

    public int getItemViewType(int n) {
        if (this.header != null && n == 0) {
            return 2;
        }
        List<Article> list = this.items;
        n = list == null && n == 0 || list != null && n == this.getItemCount() - 1 ? 1 : 0;
        if (this.footer != null && n != 0) {
            return 3;
        }
        return 1;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int n) {
        StringBuilder stringBuilder;
        TextView textView;
        if (!(viewHolder instanceof ViewHolder)) {
            return;
        }
        Article article = this.items;
        int n3 = this.header != null ? n - 1 : n;
        article = (Article)article.get(n3);
        viewHolder = (ViewHolder)viewHolder;
        viewHolder.layout.setOnClickListener((View.OnClickListener)new d0((Object)this, article, 5));
        if (!TextUtils.isEmpty((CharSequence)article.preview_img)) {
            Picasso.get().load(article.preview_img).placeholder(2131230955).into(viewHolder.image);
        } else {
            viewHolder.image.setImageDrawable(this.context.getResources().getDrawable(2131230955));
        }
        boolean bl = article.hasVideoDuration();
        int n4 = 0;
        if (bl) {
            viewHolder.videoDurationLayout.setVisibility(0);
            viewHolder.videoDuration.setText((CharSequence)article.renderVideoDuration());
        } else {
            viewHolder.videoDurationLayout.setVisibility(8);
        }
        if (article.getDate() != null) {
            textView = viewHolder.date;
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.getDatePrefix());
            stringBuilder.append(this.getDateStr(article));
            textView.setText((CharSequence)stringBuilder.toString());
            viewHolder.date.setVisibility(0);
        } else {
            viewHolder.date.setVisibility(8);
        }
        textView = viewHolder.text;
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.getTextPrefix(article));
        stringBuilder.append((Object)Html.fromHtml((String)article.name));
        textView.setText((CharSequence)stringBuilder.toString());
        viewHolder = viewHolder.elementDivider;
        int n5 = this.getItemCount();
        n3 = this.footer != null ? 2 : 1;
        n = n < n5 - n3 ? n4 : 8;
        viewHolder.setVisibility(n);
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    return null;
                }
                return new AdapterViewItemViewHolder(this.footer.getView(viewGroup));
            }
            return new AdapterViewItemViewHolder(this.header.getView(viewGroup));
        }
        return new ViewHolder(LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131493117, viewGroup, false));
    }

    public void setFooter(AdapterViewItem adapterViewItem) {
        this.footer = adapterViewItem;
    }

    public void setHeader(AdapterViewItem adapterViewItem) {
        this.header = adapterViewItem;
        if (this.items != null) {
            this.notifyDataSetChanged();
        }
    }

    public void updateInfo(List<Article> list) {
        this.updateInfo(list, false);
    }

    public void updateInfo(List<Article> list, boolean bl) {
        List<Article> list2;
        if (bl && (list2 = this.items) != null) {
            list2.addAll(list);
        } else {
            this.items = list;
        }
        this.notifyDataSetChanged();
    }

    public static class AdapterViewItemViewHolder
    extends RecyclerView.ViewHolder {
        public AdapterViewItemViewHolder(View view) {
            super(view);
        }
    }

    public static class ViewHolder
    extends RecyclerView.ViewHolder {
        @BindView(value=2131296527)
        public TextView date;
        @BindView(value=2131296579)
        public View elementDivider;
        @BindView(value=2131296689)
        public ImageView image;
        @BindView(value=2131296704)
        public View imageLayout;
        @BindView(value=2131296729)
        public View layout;
        @BindView(value=2131297202)
        public TextView text;
        @BindView(value=2131297316)
        public TextView videoDuration;
        @BindView(value=2131297317)
        public View videoDurationLayout;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object)((Object)this), (View)view);
        }
    }
}

