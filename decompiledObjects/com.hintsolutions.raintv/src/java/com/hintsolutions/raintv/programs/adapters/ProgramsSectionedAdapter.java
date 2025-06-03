/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.Iterator
 *  java.util.List
 *  ru.tvrain.core.data.Program
 *  ru.tvrain.core.utils.DateHelper
 */
package com.hintsolutions.raintv.programs.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import ru.tvrain.core.data.Program;
import ru.tvrain.core.utils.DateHelper;
import za.co.immedia.pinnedheaderlistview.SectionedBaseAdapter;

public class ProgramsSectionedAdapter
extends SectionedBaseAdapter {
    private static final int SECTION_ALL = 2;
    private static final int SECTION_FAVORITES = 0;
    private static final int SECTION_POPULAR = 1;
    private List<Program> mAllPrograms;
    private List<Program> mFavoritePrograms;
    private List<Program> mPopularPrograms = new ArrayList();
    private OnFavoriteClickListener onFavoriteClickListener;

    public ProgramsSectionedAdapter() {
        this.mAllPrograms = new ArrayList();
        this.mFavoritePrograms = new ArrayList();
    }

    public static /* synthetic */ void a(ProgramsSectionedAdapter programsSectionedAdapter, Program program, View view) {
        programsSectionedAdapter.lambda$setFavorite$0(program, view);
    }

    private /* synthetic */ void lambda$setFavorite$0(Program program, View object) {
        object = this.onFavoriteClickListener;
        if (object != null) {
            object.onClick(program);
        }
    }

    private void setFavorite(LinearLayout linearLayout, Program program) {
        linearLayout = (ImageView)linearLayout.findViewById(2131296345);
        int n4 = program.isFavorite() ? 2131231293 : 2131231292;
        linearLayout.setImageResource(n4);
        linearLayout.setOnClickListener((View.OnClickListener)new d0((Object)this, program, 9));
    }

    private void setName(LinearLayout linearLayout, Program program) {
        ((TextView)linearLayout.findViewById(2131296946)).setText((CharSequence)program.name.trim());
    }

    private void setNextAir(LinearLayout object, Program object2) {
        TextView textView = (TextView)object.findViewById(2131296964);
        View view = object.findViewById(2131296965);
        if (object2.next_air != null) {
            view.setVisibility(0);
            object2 = DateHelper.getRelativeDateTimeString((Context)object.getContext(), (Date)object2.next_air.getStartDate());
            object = object2;
            if (object2 == null) {
                view.setVisibility(8);
                object = "\u0421\u043a\u043e\u0440\u043e";
            }
            textView.setText((CharSequence)object);
        } else {
            view.setVisibility(8);
        }
    }

    @Override
    public int getCountForSection(int n4) {
        if (n4 != 0) {
            if (n4 != 1) {
                if (n4 != 2) {
                    return 0;
                }
                return this.mAllPrograms.size();
            }
            return this.mPopularPrograms.size();
        }
        return this.mFavoritePrograms.size();
    }

    public Program getItem(int n4, int n5) {
        if (n4 != 0) {
            if (n4 != 1) {
                if (n4 != 2) {
                    return null;
                }
                return (Program)this.mAllPrograms.get(n5);
            }
            return (Program)this.mPopularPrograms.get(n5);
        }
        return (Program)this.mFavoritePrograms.get(n5);
    }

    @Override
    public long getItemId(int n4, int n5) {
        return 0L;
    }

    @Override
    public View getItemView(int n4, int n5, View view, ViewGroup object) {
        Object var5_5 = null;
        if (view != null && (Integer)view.getTag() == n4) {
            view = (LinearLayout)view;
        } else {
            view = (LayoutInflater)object.getContext().getSystemService("layout_inflater");
            if (n4 != 0 && n4 != 1) {
                if (n4 != 2) {
                    view = null;
                } else {
                    view = (LinearLayout)view.inflate(2131492992, object, false);
                    view.setTag((Object)n4);
                }
            } else {
                view = (LinearLayout)view.inflate(2131492995, object, false);
                view.setTag((Object)n4);
            }
        }
        if (n4 != 0) {
            if (n4 != 1) {
                object = n4 != 2 ? var5_5 : (Program)this.mAllPrograms.get(n5);
            } else {
                object = (Program)this.mPopularPrograms.get(n5);
                this.setNextAir((LinearLayout)view, (Program)object);
            }
        } else {
            object = (Program)this.mFavoritePrograms.get(n5);
            this.setNextAir((LinearLayout)view, (Program)object);
        }
        if (object != null) {
            this.setName((LinearLayout)view, (Program)object);
            this.setFavorite((LinearLayout)view, (Program)object);
        }
        return view;
    }

    @Override
    public int getSectionCount() {
        return 3;
    }

    @Override
    public View getSectionHeaderView(int n4, View view, ViewGroup viewGroup) {
        view = view == null ? (LinearLayout)((LayoutInflater)viewGroup.getContext().getSystemService("layout_inflater")).inflate(2131493144, null) : (LinearLayout)view;
        viewGroup = (TextView)view.findViewById(2131297108);
        if (n4 != 0) {
            if (n4 != 1) {
                if (n4 == 2) {
                    viewGroup.setText((CharSequence)"\u0412\u0441\u0435");
                }
            } else {
                viewGroup.setText((CharSequence)"\u041f\u043e\u043f\u0443\u043b\u044f\u0440\u043d\u044b\u0435");
            }
        } else {
            viewGroup.setText((CharSequence)"\u0418\u0437\u0431\u0440\u0430\u043d\u043d\u044b\u0435");
        }
        return view;
    }

    public void setAllPrograms(List<Program> list) {
        this.mAllPrograms = list;
        this.notifyDataSetChanged();
    }

    public void setFavoritePrograms(List<Program> list) {
        this.mFavoritePrograms = list;
        this.notifyDataSetChanged();
    }

    public void setOnFavoriteClickListener(OnFavoriteClickListener onFavoriteClickListener) {
        this.onFavoriteClickListener = onFavoriteClickListener;
    }

    public void setPopularPrograms(List<Program> list) {
        this.mPopularPrograms = list;
        this.notifyDataSetChanged();
    }

    public void updateFavorite(int n4, boolean bl) {
        Iterator iterator2 = this.mAllPrograms;
        if (iterator2 != null) {
            for (Iterator iterator2 : iterator2) {
                if (!iterator2.id.equals((Object)n4)) continue;
                iterator2.setFavorite(bl);
            }
        }
        if ((iterator2 = this.mPopularPrograms) != null) {
            for (Iterator iterator3 : iterator2) {
                if (!iterator3.id.equals((Object)n4)) continue;
                iterator3.setFavorite(bl);
            }
        }
        this.notifyDataSetChanged();
    }
}

