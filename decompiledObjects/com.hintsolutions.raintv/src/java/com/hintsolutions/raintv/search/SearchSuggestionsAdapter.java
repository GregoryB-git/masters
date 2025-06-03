/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.Filter
 *  android.widget.Filter$FilterResults
 *  android.widget.Filterable
 *  android.widget.TextView
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  j4
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.List
 */
package com.hintsolutions.raintv.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SearchSuggestionsAdapter
extends BaseAdapter
implements Filterable {
    private static final int COMMON_SUGGESTIONS_LIMIT = 2;
    private static final int STORED_SUGGESTIONS_LIMIT = 20;
    private List<String> commonSuggestions;
    private List<String> filteredCommonSuggestions;
    private List<String> filteredStoredSuggestions;
    private ItemFilter mFilter = new ItemFilter(this);
    private OnClickListener onClickListener;
    private List<String> storedSuggestions;

    public SearchSuggestionsAdapter(OnClickListener onClickListener, List<String> list, List<String> list2) {
        this.onClickListener = onClickListener;
        this.commonSuggestions = this.subList(list, 0);
        this.storedSuggestions = this.subList(list2, 0);
        this.filteredCommonSuggestions = this.subList(list, 2);
        this.filteredStoredSuggestions = this.subList(list2, 20);
    }

    public static /* synthetic */ void a(SearchSuggestionsAdapter searchSuggestionsAdapter, String string2, View view) {
        searchSuggestionsAdapter.lambda$getStoredView$1(string2, view);
    }

    public static /* synthetic */ List access$202(SearchSuggestionsAdapter searchSuggestionsAdapter, List list) {
        searchSuggestionsAdapter.filteredCommonSuggestions = list;
        return list;
    }

    public static /* synthetic */ List access$302(SearchSuggestionsAdapter searchSuggestionsAdapter, List list) {
        searchSuggestionsAdapter.filteredStoredSuggestions = list;
        return list;
    }

    public static /* synthetic */ void b(SearchSuggestionsAdapter searchSuggestionsAdapter, String string2, View view) {
        searchSuggestionsAdapter.lambda$getCommonView$0(string2, view);
    }

    private View getCommonView(int n, View view, ViewGroup object) {
        String string2 = (String)this.filteredCommonSuggestions.get(n);
        if (view != null && view.getTag() instanceof CommonViewHolder) {
            object = (CommonViewHolder)view.getTag();
        } else {
            view = LayoutInflater.from((Context)object.getContext()).inflate(2131493142, object, false);
            object = new CommonViewHolder(view);
            view.setTag(object);
        }
        object.name.setText((CharSequence)string2);
        object = object.header;
        n = n == 0 ? 0 : 8;
        object.setVisibility(n);
        if (this.onClickListener != null) {
            view.setOnClickListener((View.OnClickListener)new j4(this, string2, 0));
        }
        return view;
    }

    private View getStoredView(int n, View object, ViewGroup viewGroup) {
        String string2 = (String)this.filteredStoredSuggestions.get(n);
        if (object != null && object.getTag() instanceof StoredViewHolder) {
            StoredViewHolder storedViewHolder = (StoredViewHolder)object.getTag();
            viewGroup = object;
            object = storedViewHolder;
        } else {
            viewGroup = LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131493143, viewGroup, false);
            object = new StoredViewHolder((View)viewGroup);
            viewGroup.setTag(object);
        }
        object.name.setText((CharSequence)string2);
        if (this.onClickListener != null) {
            viewGroup.setOnClickListener((View.OnClickListener)new j4(this, string2, 1));
        }
        return viewGroup;
    }

    private /* synthetic */ void lambda$getCommonView$0(String string2, View view) {
        this.onClickListener.onClick(string2);
    }

    private /* synthetic */ void lambda$getStoredView$1(String string2, View view) {
        this.onClickListener.onClick(string2);
    }

    private List<String> subList(List<String> list, int n) {
        if (list == null) {
            return new ArrayList();
        }
        List list2 = list;
        if (n != 0) {
            list2 = list.size() < n ? list : this.storedSuggestions.subList(0, n);
        }
        return list2;
    }

    public int getCount() {
        int n = this.filteredCommonSuggestions.size();
        return this.filteredStoredSuggestions.size() + n;
    }

    public Filter getFilter() {
        return this.mFilter;
    }

    public Object getItem(int n) {
        if (this.getCount() == 0) {
            return null;
        }
        if (n >= this.filteredCommonSuggestions.size()) {
            return this.filteredStoredSuggestions.get(n - this.filteredCommonSuggestions.size());
        }
        return this.filteredCommonSuggestions.get(n);
    }

    public long getItemId(int n) {
        return n;
    }

    public View getView(int n, View view, ViewGroup viewGroup) {
        if (n >= this.filteredCommonSuggestions.size()) {
            return this.getStoredView(n - this.filteredCommonSuggestions.size(), view, viewGroup);
        }
        return this.getCommonView(n, view, viewGroup);
    }

    public void setCommonSuggestions(List<String> list) {
        this.commonSuggestions = this.subList(list, 0);
        this.filteredCommonSuggestions = this.subList(list, 2);
        this.notifyDataSetChanged();
    }

    public void setStoredSuggestions(List<String> list) {
        this.storedSuggestions = this.subList(list, 0);
        this.filteredStoredSuggestions = this.subList(list, 20);
        this.notifyDataSetChanged();
    }

    public static class CommonViewHolder {
        @BindView(value=2131296667)
        public View header;
        @BindView(value=2131296946)
        public TextView name;

        public CommonViewHolder(View view) {
            ButterKnife.bind((Object)this, (View)view);
        }
    }

    public class ItemFilter
    extends Filter {
        public final SearchSuggestionsAdapter this$0;

        public ItemFilter(SearchSuggestionsAdapter searchSuggestionsAdapter) {
            this.this$0 = searchSuggestionsAdapter;
        }

        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (String string2 : this.this$0.commonSuggestions) {
                if (charSequence.length() != 0 && !string2.toLowerCase().startsWith(charSequence.toString())) continue;
                arrayList2.add((Object)string2);
                if (arrayList2.size() < 2) continue;
            }
            for (String string2 : this.this$0.storedSuggestions) {
                if (charSequence.length() != 0 && (!string2.toLowerCase().startsWith(charSequence.toString()) || this.this$0.commonSuggestions.contains((Object)string2))) continue;
                arrayList.add((Object)string2);
            }
            charSequence = new Filter.FilterResults();
            charSequence.values = new ArrayList((Collection)Arrays.asList((Object[])new List[]{arrayList2, arrayList}));
            int n = arrayList2.size();
            charSequence.count = arrayList.size() + n;
            return charSequence;
        }

        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            charSequence = (List)filterResults.values;
            if (filterResults.count == 0) {
                SearchSuggestionsAdapter.access$202(this.this$0, (List)new ArrayList());
                SearchSuggestionsAdapter.access$302(this.this$0, (List)new ArrayList());
            } else {
                SearchSuggestionsAdapter.access$202(this.this$0, (List)charSequence.get(0));
                SearchSuggestionsAdapter.access$302(this.this$0, (List)charSequence.get(1));
            }
            this.this$0.notifyDataSetChanged();
        }
    }

    public static interface OnClickListener {
        public void onClick(String var1);
    }

    public static class StoredViewHolder {
        @BindView(value=2131296946)
        public TextView name;

        public StoredViewHolder(View view) {
            ButterKnife.bind((Object)this, (View)view);
        }
    }
}

