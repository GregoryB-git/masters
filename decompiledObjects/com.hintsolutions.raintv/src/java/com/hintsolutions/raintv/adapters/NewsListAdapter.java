/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.format.DateFormat
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Calendar
 *  java.util.List
 *  ru.tvrain.core.data.Article
 */
package com.hintsolutions.raintv.adapters;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.github.vipulasri.timelineview.TimelineView;
import com.hintsolutions.raintv.interfaces.AdapterViewItem;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import ru.tvrain.core.data.Article;

public class NewsListAdapter
extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int TYPE_DAY = 2;
    private static final int TYPE_FOOTER = 3;
    private static final int TYPE_ITEM = 1;
    private Context context;
    private AdapterViewItem footer = null;
    private List<NewsListItem> items;
    private OnItemClickListener onItemClickListener;

    public NewsListAdapter(Context context, List<Article> list, OnItemClickListener onItemClickListener) {
        this.context = context;
        this.onItemClickListener = onItemClickListener;
        if (list != null) {
            this.updateInfo(list);
        }
    }

    public static /* synthetic */ void a(NewsListAdapter newsListAdapter, Article article, View view) {
        newsListAdapter.lambda$onBindViewHolder$0(article, view);
    }

    private void addNewsListItems(List<Article> object, String object2) {
        for (Article article : object) {
            object = this.getArticleDayStr(article, true);
            if (!object.equals(object2)) {
                this.items.add(new Object((String)object){
                    public Article article;
                    public String dayStr;
                    {
                        this.dayStr = string2;
                    }
                    {
                        this.article = article;
                    }
                });
            }
            this.items.add(new /* invalid duplicate definition of identical inner class */);
            object2 = object;
        }
    }

    private String getArticleDayStr(Article object, boolean bl) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(object.getDate());
        object = Calendar.getInstance();
        object = object.get(5) == calendar.get(5) ? this.context.getResources().getString(2131755478) : (object.get(5) - calendar.get(5) == 1 ? this.context.getResources().getString(2131755479) : DateFormat.format((CharSequence)"d MMMM", (Calendar)calendar).toString());
        if (!bl) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(DateFormat.format((CharSequence)"HH:mm", (Calendar)calendar).toString());
            stringBuilder.append(", ");
            stringBuilder.append(object.toLowerCase());
            object = stringBuilder.toString();
        } else {
            object = object.toUpperCase();
        }
        return object;
    }

    private int getTimeLineViewLineType(int n) {
        if (n == 0) {
            return 1;
        }
        return 0;
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(Article article, View view) {
        this.onItemClickListener.onClick(article);
    }

    public int getItemCount() {
        List<NewsListItem> list = this.items;
        int n = list == null ? 0 : list.size();
        int n3 = n;
        if (this.footer != null) {
            n3 = n + 1;
        }
        return n3;
    }

    public int getItemViewType(int n) {
        List<NewsListItem> list = this.items;
        int n3 = 1;
        boolean bl = list == null && n == 0 || list != null && n == this.getItemCount() - 1;
        if (this.footer != null && bl) {
            return 3;
        }
        list = this.items;
        n = list != null && (list.get((int)n)).article != null ? n3 : 2;
        return n;
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int n) {
        if (viewHolder instanceof ViewHolder) {
            Article article = (this.items.get((int)n)).article;
            viewHolder = (ViewHolder)viewHolder;
            if (this.onItemClickListener != null) {
                viewHolder.layout.setOnClickListener((View.OnClickListener)new d0((Object)this, article, 1));
            }
            viewHolder.name.setText((CharSequence)article.name);
            viewHolder.date.setText((CharSequence)this.getArticleDayStr(article, false));
            viewHolder.timelineView.initLine(this.getTimeLineViewLineType(n));
        } else if (viewHolder instanceof DayViewHolder) {
            String string2 = (this.items.get((int)n)).dayStr;
            viewHolder = (DayViewHolder)viewHolder;
            viewHolder.date.setText((CharSequence)string2);
            viewHolder.timelineView.setStartLine(this.context.getResources().getColor(2131099769), this.getTimeLineViewLineType(n));
            viewHolder.timelineView.setEndLine(this.context.getResources().getColor(2131099769), this.getTimeLineViewLineType(n));
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    return null;
                }
                return new AdapterViewItemViewHolder(this.footer.getView(viewGroup));
            }
            return new DayViewHolder(this, LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131493118, viewGroup, false));
        }
        return new ViewHolder(this, LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131493119, viewGroup, false));
    }

    public void setFooter(AdapterViewItem adapterViewItem) {
        this.footer = adapterViewItem;
    }

    public void updateInfo(List<Article> list) {
        this.updateInfo(list, false);
    }

    public void updateInfo(List<Article> list, boolean bl) {
        List<NewsListItem> list2;
        if (bl && (list2 = this.items) != null && list2.size() > 0) {
            list2 = this.items;
            this.addNewsListItems(list, this.getArticleDayStr((list2.get((int)(list2.size() - 1))).article, true));
        } else {
            this.items = new ArrayList();
            this.addNewsListItems(list, null);
        }
        this.notifyDataSetChanged();
    }

    public static class AdapterViewItemViewHolder
    extends RecyclerView.ViewHolder {
        public AdapterViewItemViewHolder(View view) {
            super(view);
        }
    }

    public class DayViewHolder
    extends RecyclerView.ViewHolder {
        @BindView(value=2131296527)
        public TextView date;
        public final NewsListAdapter this$0;
        @BindView(value=2131297236)
        public TimelineView timelineView;

        public DayViewHolder(NewsListAdapter newsListAdapter, View view) {
            this.this$0 = newsListAdapter;
            super(view);
            ButterKnife.bind((Object)((Object)this), (View)view);
        }
    }

    public class ViewHolder
    extends RecyclerView.ViewHolder {
        @BindView(value=2131296527)
        public TextView date;
        @BindView(value=2131296729)
        public View layout;
        @BindView(value=2131296946)
        public TextView name;
        public final NewsListAdapter this$0;
        @BindView(value=2131297236)
        public TimelineView timelineView;

        public ViewHolder(NewsListAdapter newsListAdapter, View view) {
            this.this$0 = newsListAdapter;
            super(view);
            ButterKnife.bind((Object)((Object)this), (View)view);
        }
    }
}

