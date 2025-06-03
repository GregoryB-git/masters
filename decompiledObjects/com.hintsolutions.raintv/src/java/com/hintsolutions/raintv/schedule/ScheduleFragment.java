/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.DatePickerDialog
 *  android.app.DatePickerDialog$OnDateSetListener
 *  android.app.Dialog
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.Spannable
 *  android.text.SpannableString
 *  android.text.style.StyleSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.DatePicker
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.fragment.app.DialogFragment
 *  androidx.viewpager.widget.PagerAdapter
 *  androidx.viewpager.widget.ViewPager
 *  androidx.viewpager.widget.ViewPager$OnPageChangeListener
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  butterknife.OnClick
 *  java.lang.CharSequence
 *  java.lang.ClassCastException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Calendar
 *  java.util.Date
 *  java.util.List
 *  java.util.Locale
 *  ru.tvrain.core.utils.DateHelper
 *  tvrain.analytics.tagmanager.TagManager
 *  tvrain.analytics.tagmanager.TagManagerUtils
 */
package com.hintsolutions.raintv.schedule;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.hintsolutions.raintv.adapters.ViewPagerAdapter;
import com.hintsolutions.raintv.common.BaseFragment;
import com.hintsolutions.raintv.interfaces.OnFragmentInteractionListener;
import com.hintsolutions.raintv.schedule.ScheduleDayFragment;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import ru.tvrain.core.utils.DateHelper;
import tvrain.analytics.tagmanager.TagManager;
import tvrain.analytics.tagmanager.TagManagerUtils;

public class ScheduleFragment
extends BaseFragment {
    private static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String TAG = "ScheduleFragment";
    private Date date;
    @BindView(value=2131296527)
    public TextView dateTextView;
    private List<String> dates;
    private OnFragmentInteractionListener mListener;
    @BindView(value=2131296990)
    public ViewPager pager;
    @BindView(value=2131297172)
    public TextView subscription;
    @BindView(value=2131297237)
    public TextView title;
    @BindView(value=2131297243)
    public TextView toggleBadgeTextView;

    public static /* synthetic */ List access$000(ScheduleFragment scheduleFragment) {
        return scheduleFragment.dates;
    }

    private void changeDate(Date date) {
        String string = DateHelper.format((String)DATE_FORMAT, (Date)date);
        for (int j = 0; j < this.dates.size(); ++j) {
            if (!string.equals(this.dates.get(j))) continue;
            this.pager.setCurrentItem(j);
            this.setTitle(date);
            this.date = date;
            break;
        }
    }

    private void setDateText(Spannable spannable) {
        this.dateTextView.setText((CharSequence)spannable);
    }

    private void setTitle(Date date) {
        Object object = new StringBuilder();
        object.append(DateHelper.formatScheduleTitle((Date)date).toUpperCase(Locale.getDefault()));
        object.append(", ");
        object = object.toString();
        date = new SpannableString((CharSequence)z2.o((String)object, DateHelper.formatScheduleTitleDayOfWeek((Date)date)));
        date.setSpan((Object)new StyleSpan(1), 0, object.length(), 33);
        this.setDateText((Spannable)date);
    }

    private void setupViewPager() {
        this.dates = new ArrayList();
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getChildFragmentManager());
        for (int j = 0; j < 10; ++j) {
            Object object = Calendar.getInstance();
            object.setTime(DateHelper.now());
            object.add(5, j);
            object = object.getTime();
            if (this.date == null) {
                this.date = object;
            }
            object = DateHelper.format((String)DATE_FORMAT, (Date)object);
            this.dates.add(object);
            boolean bl = j == 0;
            viewPagerAdapter.addFragment(ScheduleDayFragment.newInstance((String)object, bl), (String)object);
        }
        this.pager.setAdapter((PagerAdapter)viewPagerAdapter);
        this.pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener(this){
            public final ScheduleFragment this$0;
            {
                this.this$0 = scheduleFragment;
            }

            public void onPageScrollStateChanged(int n4) {
            }

            public void onPageScrolled(int n4, float f, int n5) {
            }

            public void onPageSelected(int n4) {
                ScheduleFragment scheduleFragment = this.this$0;
                ScheduleFragment.access$100(scheduleFragment, DateHelper.parse((String)((String)ScheduleFragment.access$000(scheduleFragment).get(n4))));
            }
        });
    }

    @OnClick(value={2131296963})
    public void nextDate() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(this.date);
            calendar.add(5, 1);
            this.changeDate(calendar.getTime());
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.mListener = (OnFragmentInteractionListener)context;
            return;
        }
        catch (ClassCastException classCastException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(context.toString());
            stringBuilder.append(" must implement OnFragmentInteractionListener");
            throw new ClassCastException(stringBuilder.toString());
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        layoutInflater = layoutInflater.inflate(2131492980, (ViewGroup)object, false);
        this.unbinder = ButterKnife.bind((Object)((Object)this), (View)layoutInflater);
        object = DateHelper.now();
        this.date = object;
        this.setTitle((Date)object);
        this.title.setText(2131755224);
        this.setupViewPager();
        object = this.mListener;
        if (object != null) {
            object.setupNotificationsCount(this.toggleBadgeTextView);
        }
        return layoutInflater;
    }

    @OnClick(value={2131296527})
    public void onDateClicked() {
        try {
            DatePickerFragment datePickerFragment = new DatePickerFragment(this);
            datePickerFragment.show(this.getFragmentManager(), "datePicker");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        this.mListener = null;
    }

    @OnClick(value={2131296851})
    public void onMenuClicked() {
        OnFragmentInteractionListener onFragmentInteractionListener = this.mListener;
        if (onFragmentInteractionListener != null) {
            onFragmentInteractionListener.onMenuClicked();
        }
    }

    public void onResume() {
        super.onResume();
        this.subscription.setVisibility(8);
    }

    @OnClick(value={2131297172})
    public void onSubscriptionClicked() {
        if (this.mListener != null) {
            TagManagerUtils.logPayWallClick((TagManager)this.activityInterface.getTagManager(), (String)"\u0448\u0430\u043f\u043a\u0430 \u0432 \u0440\u0430\u0441\u043f\u0438\u0441\u0430\u043d\u043d\u0438\u0438");
            this.mListener.onSubscriptionClicked();
        }
    }

    @OnClick(value={2131297020})
    public void prevDate() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(this.date);
            calendar.add(5, -1);
            this.changeDate(calendar.getTime());
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @SuppressLint(value={"ValidFragment"})
    public class DatePickerFragment
    extends DialogFragment
    implements DatePickerDialog.OnDateSetListener {
        public final ScheduleFragment this$0;

        public DatePickerFragment(ScheduleFragment scheduleFragment) {
            this.this$0 = scheduleFragment;
        }

        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            bundle = Calendar.getInstance();
            bundle.setTime(this.this$0.date);
            int n4 = bundle.get(1);
            int n5 = bundle.get(2);
            int n6 = bundle.get(5);
            return new DatePickerDialog((Context)this.getActivity(), (DatePickerDialog.OnDateSetListener)this, n4, n5, n6);
        }

        public void onDateSet(DatePicker datePicker, int n4, int n5, int n6) {
            datePicker = Calendar.getInstance();
            datePicker.set(1, n4);
            datePicker.set(2, n5);
            datePicker.set(5, n6);
            this.this$0.changeDate(datePicker.getTime());
        }
    }
}

