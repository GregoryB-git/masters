/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  ru.tvrain.core.data.search.SearchCategory
 */
package com.hintsolutions.raintv.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.ArrayList;
import java.util.List;
import ru.tvrain.core.data.search.SearchCategory;

public class SearchCategoryAdapter
extends RecyclerView.Adapter<ViewHolder> {
    public static final String TYPE_ALL = "All";
    public static final String TYPE_STORY = "Story";
    public static final String TYPE_TELESHOW = "Teleshow";
    private List<SearchCategory> items;
    private OnItemClickListener onItemClickListener;
    private String selectedType = "All";

    public SearchCategoryAdapter(List<SearchCategory> list, OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
        this.items = this.filterNotEmptyAndStoryCategories(list);
    }

    public static /* synthetic */ void a(SearchCategoryAdapter searchCategoryAdapter, SearchCategory searchCategory, View view) {
        searchCategoryAdapter.lambda$onBindViewHolder$0(searchCategory, view);
    }

    private List<SearchCategory> filterNotEmptyAndStoryCategories(List<SearchCategory> searchCategory2) {
        if (searchCategory2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (SearchCategory searchCategory2 : searchCategory2) {
            if (searchCategory2.code.equals((Object)TYPE_STORY) || searchCategory2.count <= 0) continue;
            arrayList.add((Object)searchCategory2);
        }
        return arrayList;
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(SearchCategory searchCategory, View view) {
        this.onItemClickListener.onClick(searchCategory);
    }

    public int getItemCount() {
        List<SearchCategory> list = this.items;
        int n = list == null ? 0 : list.size();
        return n;
    }

    public String getSelectedType() {
        return this.selectedType;
    }

    public void onBindViewHolder(ViewHolder viewHolder, int n) {
        SearchCategory searchCategory = (SearchCategory)this.items.get(n);
        TextView textView = viewHolder.title;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(searchCategory.title);
        stringBuilder.append(" (");
        stringBuilder.append((Object)searchCategory.count);
        stringBuilder.append(")");
        textView.setText((CharSequence)stringBuilder.toString());
        viewHolder.title.setOnClickListener((View.OnClickListener)new d0((Object)this, searchCategory, 4));
        viewHolder.title.setSelected(this.selectedType.equals((Object)searchCategory.code));
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        return new ViewHolder(LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131493141, viewGroup, false));
    }

    public void setSelectedType(String string2) {
        this.selectedType = string2;
        this.notifyDataSetChanged();
    }

    public void updateInfo(List<SearchCategory> list) {
        this.selectedType = TYPE_ALL;
        this.items = this.filterNotEmptyAndStoryCategories(list);
        this.notifyDataSetChanged();
    }

    public static class ViewHolder
    extends RecyclerView.ViewHolder {
        @BindView(value=2131297105)
        public TextView title;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object)((Object)this), (View)view);
        }
    }
}

