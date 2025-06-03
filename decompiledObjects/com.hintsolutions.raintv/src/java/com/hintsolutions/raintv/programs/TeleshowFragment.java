/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  androidx.viewpager.widget.PagerAdapter
 *  androidx.viewpager.widget.ViewPager
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  butterknife.OnClick
 *  com.google.android.material.tabs.TabLayout
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  okhttp3.ResponseBody
 *  ru.tvrain.core.data.Program
 *  ru.tvrain.core.utils.PojoHelper
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 */
package com.hintsolutions.raintv.programs;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.tabs.TabLayout;
import com.hintsolutions.raintv.adapters.ViewPagerAdapter;
import com.hintsolutions.raintv.common.BaseFragment;
import com.hintsolutions.raintv.programs.TeleshowInfoActivity;
import com.hintsolutions.raintv.programs.TeleshowTabFragment;
import com.hintsolutions.raintv.programs.TeleshowTabHeader;
import okhttp3.ResponseBody;
import ru.tvrain.core.data.Program;
import ru.tvrain.core.utils.PojoHelper;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class TeleshowFragment
extends BaseFragment {
    private static final String ARG_PROGRAM_ID = "programId";
    private static final String ARG_PROGRAM_INFO_IN_LIST = "infoInList";
    @BindView(value=2131297026)
    public View infoLayout;
    private Program mProgram;
    @BindView(value=2131297027)
    public TextView name;
    @BindView(value=2131296990)
    public ViewPager pager;
    private int programId;
    private boolean programInfoInList;
    @BindView(value=2131297081)
    public TextView schedule;
    @BindView(value=2131297183)
    public TabLayout tabs;

    public static /* synthetic */ void b(TeleshowFragment teleshowFragment, Throwable throwable) {
        teleshowFragment.lambda$getPrograms$1(throwable);
    }

    public static /* synthetic */ void c(TeleshowFragment teleshowFragment, ResponseBody responseBody) {
        teleshowFragment.lambda$getPrograms$0(responseBody);
    }

    private void getPrograms() {
        this.showProgressDialog();
        this.addSubscription(this.rainApi.programsById(this.getAuthorization(), null, null, String.valueOf((int)this.programId)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new p4(this, 0), (Action1)new p4(this, 1)));
    }

    private /* synthetic */ void lambda$getPrograms$0(ResponseBody responseBody) {
        responseBody = (Program)PojoHelper.objectFromResponse((ResponseBody)responseBody, (int)this.programId, Program.class);
        this.mProgram = responseBody;
        this.updateView((Program)responseBody);
        this.hideProgressDialog();
    }

    private /* synthetic */ void lambda$getPrograms$1(Throwable throwable) {
        this.hideProgressDialog();
    }

    public static TeleshowFragment newInstance(int n4, boolean bl) {
        TeleshowFragment teleshowFragment = new TeleshowFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_PROGRAM_ID, n4);
        bundle.putBoolean(ARG_PROGRAM_INFO_IN_LIST, bl);
        teleshowFragment.setArguments(bundle);
        return teleshowFragment;
    }

    private void setupViewPager() {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getChildFragmentManager());
        viewPagerAdapter.addFragment(TeleshowTabFragment.newInstance(this.programId, 1, this.programInfoInList), this.getString(2131755602));
        viewPagerAdapter.addFragment(TeleshowTabFragment.newInstance(this.programId, 2, this.programInfoInList), this.getString(2131755603));
        this.pager.setAdapter((PagerAdapter)viewPagerAdapter);
        this.tabs.setupWithViewPager(this.pager);
    }

    private void updateView(Program object) {
        this.name.setText((CharSequence)object.name);
        this.schedule.setVisibility(8);
        object = TeleshowTabHeader.renderSchedule(this.getContext(), object);
        if (object != null) {
            this.schedule.setText((CharSequence)object);
            this.schedule.setVisibility(0);
        }
        this.infoLayout.setVisibility(0);
    }

    @OnClick(value={2131297025})
    public void onClickInfo() {
        if (this.mProgram != null) {
            Intent intent = new Intent(this.getContext(), TeleshowInfoActivity.class);
            Program program = this.mProgram;
            String string = program.detail_text;
            if (string == null) {
                string = program.preview_text;
            }
            intent.putExtra("text", string);
            this.startActivity(intent);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.getArguments() != null) {
            this.programId = this.getArguments().getInt(ARG_PROGRAM_ID);
            this.programInfoInList = this.getArguments().getBoolean(ARG_PROGRAM_INFO_IN_LIST);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater = layoutInflater.inflate(2131492986, viewGroup, false);
        try {
            this.unbinder = ButterKnife.bind((Object)((Object)this), (View)layoutInflater);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.setupViewPager();
        this.infoLayout.setVisibility(8);
        if (!this.programInfoInList) {
            this.getPrograms();
        }
        return layoutInflater;
    }
}

