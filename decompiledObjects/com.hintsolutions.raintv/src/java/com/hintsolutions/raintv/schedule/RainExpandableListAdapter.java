/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.BaseExpandableListAdapter
 *  android.widget.ImageView
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.text.ParseException
 *  java.util.ArrayList
 *  java.util.Calendar
 *  java.util.Date
 *  java.util.List
 *  ru.tvrain.core.data.ScheduleProgram
 */
package com.hintsolutions.raintv.schedule;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.hintsolutions.raintv.interfaces.AdapterViewItem;
import com.hintsolutions.raintv.schedule.a;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import ru.tvrain.core.data.ScheduleProgram;

class RainExpandableListAdapter
extends BaseExpandableListAdapter {
    private AdapterViewItem footer = null;
    private Context mContext;
    private ArrayList<ArrayList<ScheduleProgram>> mSchedule = new ArrayList();
    private OnItemClickListener onItemClickListener;

    public RainExpandableListAdapter(Context context, OnItemClickListener onItemClickListener) {
        this.mContext = context;
        this.onItemClickListener = onItemClickListener;
    }

    public static /* synthetic */ void a(RainExpandableListAdapter rainExpandableListAdapter, ScheduleProgram scheduleProgram, View view) {
        rainExpandableListAdapter.lambda$getChildView$0(scheduleProgram, view);
    }

    private /* synthetic */ void lambda$getChildView$0(ScheduleProgram scheduleProgram, View view) {
        this.onItemClickListener.onItemClick(scheduleProgram);
    }

    public void clear() {
        this.mSchedule.clear();
    }

    public Object getChild(int n, int n2) {
        return ((ArrayList)this.mSchedule.get(n)).get(n2);
    }

    public long getChildId(int n, int n2) {
        return n2;
    }

    public View getChildView(int n, int n2, boolean bl, View view, ViewGroup viewGroup) {
        viewGroup = view;
        if (view == null) {
            viewGroup = ((LayoutInflater)this.mContext.getSystemService("layout_inflater")).inflate(2131493139, null);
        }
        TextView textView = (TextView)viewGroup.findViewById(2131297233);
        TextView textView2 = (TextView)viewGroup.findViewById(2131296946);
        Object object = (TextView)viewGroup.findViewById(2131296975);
        Object object2 = (TextView)viewGroup.findViewById(2131297019);
        view = (TextView)viewGroup.findViewById(2131296750);
        textView2.setClickable(false);
        viewGroup.setClickable(true);
        TypedArray typedArray = this.mContext.obtainStyledAttributes(new int[]{2130969675});
        viewGroup.setBackgroundResource(typedArray.getResourceId(0, 0));
        typedArray.recycle();
        typedArray = (ScheduleProgram)((ArrayList)this.mSchedule.get(n)).get(n2);
        textView.setText((CharSequence)typedArray.getScheduleStart());
        textView2.setText((CharSequence)typedArray.getFullName());
        textView2 = new Date();
        if (textView2.after(typedArray.date_start) && textView2.before(typedArray.date_end)) {
            object.setVisibility(0);
        } else {
            object.setVisibility(8);
        }
        if (this.onItemClickListener != null) {
            viewGroup.setOnClickListener((View.OnClickListener)new a(this, (ScheduleProgram)typedArray));
        }
        if ((object = typedArray.type) != null && object.equals((Object)"premiere")) {
            object2.setVisibility(0);
        } else {
            object2.setVisibility(8);
        }
        object2 = typedArray.type;
        if (object2 != null && object2.equals((Object)"live")) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        return viewGroup;
    }

    public int getChildrenCount(int n) {
        if (this.footer != null && n == 4 || this.mSchedule.size() == 0) {
            return 0;
        }
        return ((ArrayList)this.mSchedule.get(n)).size();
    }

    public Object getGroup(int n) {
        return this.mSchedule.get(n);
    }

    public int getGroupCount() {
        int n = this.mSchedule.size();
        int n2 = this.footer != null ? 1 : 0;
        return n + n2;
    }

    public long getGroupId(int n) {
        return n;
    }

    public View getGroupView(int n, boolean bl, View view, ViewGroup viewGroup) {
        View view2;
        block15: {
            block14: {
                if (this.footer != null && n == this.getGroupCount() - 1) {
                    view = this.footer.getView(viewGroup);
                    view.setTag((Object)"footer");
                    return view;
                }
                if (view == null) break block14;
                view2 = view;
                if (view.getTag().equals((Object)"group")) break block15;
            }
            view2 = ((LayoutInflater)this.mContext.getSystemService("layout_inflater")).inflate(2131493140, viewGroup, false);
            view2.setTag((Object)"group");
        }
        if (bl) {
            ((ImageView)view2.findViewById(2131296366)).setImageResource(2131231201);
        } else {
            ((ImageView)view2.findViewById(2131296366)).setImageResource(2131231199);
        }
        view = (TextView)view2.findViewById(2131297237);
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n == 3) {
                        view.setText((CharSequence)"\u041d\u043e\u0447\u043d\u043e\u0439 \u044d\u0444\u0438\u0440");
                        view2.setBackgroundColor(this.mContext.getResources().getColor(2131099751));
                    }
                } else {
                    view.setText((CharSequence)"\u0412\u0435\u0447\u0435\u0440\u043d\u0438\u0439 \u044d\u0444\u0438\u0440");
                    view2.setBackgroundColor(this.mContext.getResources().getColor(2131099754));
                }
            } else {
                view.setText((CharSequence)"\u0414\u043d\u0435\u0432\u043d\u043e\u0439 \u044d\u0444\u0438\u0440");
                view2.setBackgroundColor(this.mContext.getResources().getColor(2131099744));
            }
        } else {
            view.setText((CharSequence)"\u0423\u0442\u0440\u0435\u043d\u043d\u0438\u0439 \u044d\u0444\u0438\u0440");
            view2.setBackgroundColor(this.mContext.getResources().getColor(2131099750));
        }
        return view2;
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isChildSelectable(int n, int n2) {
        return false;
    }

    public boolean isEmpty() {
        return this.mSchedule.isEmpty();
    }

    public void notifyScheduleChanged(List<ScheduleProgram> iterator, Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int n = calendar.get(6);
        this.mSchedule = new ArrayList();
        date = new ArrayList();
        calendar = new ArrayList();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ScheduleProgram scheduleProgram : iterator) {
            try {
                if (scheduleProgram.getDayStart() == n && scheduleProgram.getHourStart() < 10) {
                    date.add((Object)scheduleProgram);
                }
                if (scheduleProgram.getDayStart() == n && scheduleProgram.getHourStart() >= 10 && scheduleProgram.getHourStart() < 17) {
                    calendar.add((Object)scheduleProgram);
                }
                if (scheduleProgram.getDayStart() == n && scheduleProgram.getHourStart() >= 17 && scheduleProgram.getHourStart() < 24) {
                    arrayList.add((Object)scheduleProgram);
                }
                if (scheduleProgram.getHourStart() < 0 || scheduleProgram.getDayStart() == n) continue;
                arrayList2.add((Object)scheduleProgram);
            }
            catch (ParseException parseException) {
                parseException.printStackTrace();
            }
        }
        this.mSchedule.add((Object)date);
        this.mSchedule.add((Object)calendar);
        this.mSchedule.add((Object)arrayList);
        this.mSchedule.add((Object)arrayList2);
        this.notifyDataSetChanged();
    }

    public void setFooter(AdapterViewItem adapterViewItem) {
        this.footer = adapterViewItem;
    }

    public static interface OnItemClickListener {
        public void onItemClick(ScheduleProgram var1);
    }
}

