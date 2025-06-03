/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.format.DateFormat
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ExpandableListAdapter
 *  android.widget.ExpandableListView
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Calendar
 *  java.util.Date
 *  java.util.List
 *  ru.tvrain.core.data.ScheduleProgram
 *  ru.tvrain.core.utils.DateHelper
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 */
package com.hintsolutions.raintv.schedule;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.hintsolutions.raintv.common.BaseFragment;
import com.hintsolutions.raintv.interfaces.AdapterViewItem;
import com.hintsolutions.raintv.programs.ProgramActivity;
import com.hintsolutions.raintv.schedule.RainExpandableListAdapter;
import com.hintsolutions.raintv.utils.CommonUtils;
import com.hintsolutions.raintv.views.RainFooterViewItem;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import ru.tvrain.core.data.ScheduleProgram;
import ru.tvrain.core.utils.DateHelper;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class ScheduleDayFragment
extends BaseFragment {
    private static final String ARG_DATE = "date";
    private static final String ARG_TODAY = "today";
    private RainExpandableListAdapter adapter;
    private Date date;
    private RainFooterViewItem rainFooterViewItem;
    @BindView(value=2131297081)
    public ExpandableListView scheduleExpandableListView;
    private boolean today;
    private View view;

    public static /* synthetic */ void b(Throwable throwable) {
        ScheduleDayFragment.lambda$getSchedule$1(throwable);
    }

    public static /* synthetic */ void c(ScheduleDayFragment scheduleDayFragment, Date date, List list) {
        scheduleDayFragment.lambda$getSchedule$0(date, list);
    }

    public static /* synthetic */ void d(ScheduleDayFragment scheduleDayFragment, ScheduleProgram scheduleProgram) {
        scheduleDayFragment.lambda$onCreateView$2(scheduleProgram);
    }

    private void expandGroupWithCurrentProgram() {
        if (this.today) {
            int n4 = Calendar.getInstance().get(11);
            ExpandableListView expandableListView = this.scheduleExpandableListView;
            if (expandableListView != null) {
                if (n4 >= 6 && n4 < 10) {
                    expandableListView.expandGroup(0);
                }
                if (n4 >= 10 && n4 < 17) {
                    this.scheduleExpandableListView.expandGroup(1);
                }
                if (n4 >= 17 && n4 < 24) {
                    this.scheduleExpandableListView.expandGroup(2);
                }
                if (n4 >= 0 && n4 < 6) {
                    this.scheduleExpandableListView.expandGroup(3);
                }
            }
        } else {
            this.scheduleExpandableListView.expandGroup(0);
        }
    }

    private void getSchedule(Date date) {
        this.addSubscription(this.rainApi.getSchedule(this.getAuthorization(), Integer.valueOf((int)1280), Integer.valueOf((int)720), DateHelper.formatDate((Date)date)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new g4(this, date), (Action1)new v1(24)));
    }

    private void gtmLogOpenView(Date object) {
        StringBuilder stringBuilder = z2.t("Schedule/");
        stringBuilder.append((Object)DateFormat.format((CharSequence)"yyyy-MM-dd", (Date)object));
        object = stringBuilder.toString();
        this.activityInterface.getTagManager().logOpenView((String)object);
    }

    private boolean isAnyGroupExpanded() {
        for (int j = 0; j < 4; ++j) {
            ExpandableListView expandableListView = this.scheduleExpandableListView;
            if (expandableListView == null || !expandableListView.isGroupExpanded(j)) continue;
            return true;
        }
        return false;
    }

    private /* synthetic */ void lambda$getSchedule$0(Date date, List list) {
        this.adapter.notifyScheduleChanged((List<ScheduleProgram>)list, date);
        if (!this.isAnyGroupExpanded()) {
            this.expandGroupWithCurrentProgram();
        }
        this.gtmLogOpenView(date);
    }

    private static /* synthetic */ void lambda$getSchedule$1(Throwable throwable) {
    }

    private /* synthetic */ void lambda$onCreateView$2(ScheduleProgram scheduleProgram) {
        try {
            Intent intent = new Intent((Context)this.getActivity(), ProgramActivity.class);
            intent.putExtra("id", scheduleProgram.program_id);
            this.startActivity(intent);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static ScheduleDayFragment newInstance(String string, boolean bl) {
        ScheduleDayFragment scheduleDayFragment = new ScheduleDayFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG_DATE, string);
        bundle.putBoolean(ARG_TODAY, bl);
        scheduleDayFragment.setArguments(bundle);
        return scheduleDayFragment;
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.getArguments() != null) {
            this.date = DateHelper.parse((String)this.getArguments().getString(ARG_DATE));
            this.today = this.getArguments().getBoolean(ARG_TODAY);
        }
    }

    public View onCreateView(LayoutInflater object, ViewGroup viewGroup, Bundle bundle) {
        object = object.inflate(2131492981, viewGroup, false);
        this.view = object;
        this.unbinder = ButterKnife.bind((Object)((Object)this), (View)object);
        this.adapter = new RainExpandableListAdapter((Context)this.getActivity(), new s4((Object)this, 11));
        object = new RainFooterViewItem(this.getContext());
        this.rainFooterViewItem = object;
        this.adapter.setFooter((AdapterViewItem)object);
        this.scheduleExpandableListView.setAdapter((ExpandableListAdapter)this.adapter);
        this.rainFooterViewItem.setTopPadding(CommonUtils.dpToPx(this.getContext(), 120));
        this.getSchedule(this.date);
        return this.view;
    }
}

