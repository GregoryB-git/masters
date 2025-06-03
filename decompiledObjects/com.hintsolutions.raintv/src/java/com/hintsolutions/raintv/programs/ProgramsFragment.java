/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.AdapterView
 *  android.widget.ListAdapter
 *  android.widget.TextView
 *  android.widget.Toast
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  butterknife.OnClick
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.ClassCastException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  ru.tvrain.core.data.Program
 *  ru.tvrain.core.data.Programs
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 *  tvrain.analytics.tagmanager.TagManager
 *  tvrain.analytics.tagmanager.TagManagerUtils
 *  tvrain.services.bus.events.ProgramFavoritesUpdatedEvent
 *  za.co.immedia.pinnedheaderlistview.PinnedHeaderListView
 *  za.co.immedia.pinnedheaderlistview.PinnedHeaderListView$OnItemClickListener
 */
package com.hintsolutions.raintv.programs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.hintsolutions.raintv.common.BaseFragment;
import com.hintsolutions.raintv.interfaces.OnFragmentInteractionListener;
import com.hintsolutions.raintv.programs.ProgramActivity;
import com.hintsolutions.raintv.programs.adapters.ProgramsSectionedAdapter;
import com.squareup.otto.Subscribe;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import ru.tvrain.core.data.Program;
import ru.tvrain.core.data.Programs;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import tvrain.analytics.tagmanager.TagManager;
import tvrain.analytics.tagmanager.TagManagerUtils;
import tvrain.services.bus.events.ProgramFavoritesUpdatedEvent;
import za.co.immedia.pinnedheaderlistview.PinnedHeaderListView;

public class ProgramsFragment
extends BaseFragment {
    private OnFragmentInteractionListener mListener;
    @BindView(value=2131296747)
    public PinnedHeaderListView mPinnedHeaderListView;
    private ProgramsSectionedAdapter mProgramsSectionedAdapter;
    @BindView(value=2131297172)
    public TextView subscription;
    @BindView(value=2131297237)
    public TextView title;
    @BindView(value=2131297243)
    public TextView toggleBadgeTextView;

    public static /* synthetic */ ProgramsSectionedAdapter access$000(ProgramsFragment programsFragment) {
        return programsFragment.mProgramsSectionedAdapter;
    }

    public static /* synthetic */ int b(Program program, Program program2) {
        return ProgramsFragment.lambda$getProgramsSortedByDate$6(program, program2);
    }

    public static /* synthetic */ void c(ProgramsFragment programsFragment, Programs programs) {
        programsFragment.lambda$getPrograms$7(programs);
    }

    public static /* synthetic */ int d(Program program, Program program2) {
        return ProgramsFragment.lambda$getProgramsSortedByName$9(program, program2);
    }

    public static /* synthetic */ void e(ProgramsFragment programsFragment, Throwable throwable) {
        programsFragment.lambda$getPrograms$8(throwable);
    }

    public static /* synthetic */ void f(ProgramsFragment programsFragment, Program program) {
        programsFragment.lambda$onCreateView$0(program);
    }

    public static /* synthetic */ void g(ProgramsFragment programsFragment, Throwable throwable) {
        programsFragment.lambda$getFavoritePrograms$3(throwable);
    }

    private void getFavoritePrograms() {
        this.addSubscription(this.rainApi.getFavoritePrograms(this.getAuthorization(), null, Integer.valueOf((int)1280), Integer.valueOf((int)720)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new w3(this, 1), (Action1)new w3(this, 2)));
    }

    private void getPrograms() {
        this.addSubscription(this.rainApi.programs(this.getAuthorization(), Integer.valueOf((int)1280), Integer.valueOf((int)720), "1/512", null).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new w3(this, 3), (Action1)new w3(this, 4)));
    }

    private List<Program> getProgramsSortedByDate(List<Program> list) {
        Collections.sort(list, (Comparator)new u0(2));
        return list;
    }

    private List<Program> getProgramsSortedByName(List<Program> list) {
        Collections.sort(list, (Comparator)new u0(3));
        return list;
    }

    private List<Program> getProgramsWithNewxAir(List<Program> list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if (((Program)iterator.next()).next_air != null) continue;
            iterator.remove();
        }
        return list;
    }

    private void getPromoPrograms() {
        this.addSubscription(this.rainApi.programs(this.getAuthorization(), Integer.valueOf((int)1280), Integer.valueOf((int)720), null, "1").subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new w3(this, 5), (Action1)new w3(this, 6)));
    }

    private void gtmLogOpenView() {
        this.activityInterface.getTagManager().logOpenView("Teleshow");
    }

    public static /* synthetic */ void h(ProgramsFragment programsFragment, Throwable throwable) {
        programsFragment.lambda$getPromoPrograms$5(throwable);
    }

    public static /* synthetic */ void i(ProgramsFragment programsFragment, Programs programs) {
        programsFragment.lambda$getFavoritePrograms$2(programs);
    }

    public static /* synthetic */ void j(ProgramsFragment programsFragment, Programs programs) {
        programsFragment.lambda$getPromoPrograms$4(programs);
    }

    public static /* synthetic */ void k(ProgramsFragment programsFragment, Program program) {
        programsFragment.lambda$onCreateView$1(program);
    }

    private /* synthetic */ void lambda$getFavoritePrograms$2(Programs programs) {
        List list;
        if (programs != null && (list = programs.elements) != null && !list.isEmpty() && this.mProgramsSectionedAdapter != null) {
            list = programs.elements.iterator();
            while (list.hasNext()) {
                ((Program)list.next()).setFavorite(true);
            }
            this.mProgramsSectionedAdapter.setFavoritePrograms((List<Program>)programs.elements);
        } else {
            this.mProgramsSectionedAdapter.setFavoritePrograms((List<Program>)new ArrayList());
        }
    }

    private /* synthetic */ void lambda$getFavoritePrograms$3(Throwable throwable) {
        if (this.getActivity() != null) {
            Toast.makeText((Context)this.getActivity(), (CharSequence)"\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f", (int)0).show();
        }
    }

    private /* synthetic */ void lambda$getPrograms$7(Programs object) {
        List list;
        if (object != null && (list = ((Programs)object).elements) != null && !list.isEmpty()) {
            this.mProgramsSectionedAdapter.setAllPrograms(this.getProgramsSortedByName((List<Program>)((Programs)object).elements));
            object = this.mListener;
            if (object != null) {
                object.hideProgress();
            }
        }
    }

    private /* synthetic */ void lambda$getPrograms$8(Throwable throwable) {
        if (this.getActivity() != null) {
            Toast.makeText((Context)this.getActivity(), (CharSequence)"\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f", (int)0).show();
        }
    }

    private static /* synthetic */ int lambda$getProgramsSortedByDate$6(Program program, Program program2) {
        program = program.next_air.getStartDate();
        program2 = program2.next_air.getStartDate();
        long l4 = 0L;
        long l5 = program != null ? program.getTime() : 0L;
        if (program2 != null) {
            l4 = program2.getTime();
        }
        return (int)(l5 - l4);
    }

    private static /* synthetic */ int lambda$getProgramsSortedByName$9(Program program, Program program2) {
        return program.name.trim().compareTo(program2.name.trim());
    }

    private /* synthetic */ void lambda$getPromoPrograms$4(Programs programs) {
        Object object;
        if (programs != null && (object = programs.elements) != null && !object.isEmpty() && (object = this.mProgramsSectionedAdapter) != null) {
            ((ProgramsSectionedAdapter)((Object)object)).setPopularPrograms(this.getProgramsSortedByDate(this.getProgramsWithNewxAir((List<Program>)programs.elements)));
        }
    }

    private /* synthetic */ void lambda$getPromoPrograms$5(Throwable throwable) {
        if (this.getActivity() != null) {
            Toast.makeText((Context)this.getActivity(), (CharSequence)"\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f", (int)0).show();
        }
    }

    private /* synthetic */ void lambda$onCreateView$0(Program program) {
        this.mProgramsSectionedAdapter.updateFavorite(program.id, program.isFavorite());
    }

    private /* synthetic */ void lambda$onCreateView$1(Program program) {
        this.activityInterface.toggleProgramFav(program, true, new q5((Object)this, program, 6));
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.mListener = (OnFragmentInteractionListener)activity;
            return;
        }
        catch (ClassCastException classCastException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(activity.toString());
            stringBuilder.append(" must implement OnFragmentInteractionListener");
            throw new ClassCastException(stringBuilder.toString());
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        layoutInflater = layoutInflater.inflate(2131492983, (ViewGroup)object, false);
        this.unbinder = ButterKnife.bind((Object)((Object)this), (View)layoutInflater);
        this.mListener.showProgress();
        this.title.setText(2131755220);
        object = new ProgramsSectionedAdapter();
        this.mProgramsSectionedAdapter = object;
        ((ProgramsSectionedAdapter)((Object)object)).setOnFavoriteClickListener(new w3(this, 0));
        this.mPinnedHeaderListView.setAdapter((ListAdapter)this.mProgramsSectionedAdapter);
        this.mPinnedHeaderListView.setOnItemClickListener(new PinnedHeaderListView.OnItemClickListener(this){
            public final ProgramsFragment this$0;
            {
                this.this$0 = programsFragment;
            }

            public void onItemClick(AdapterView<?> intent, View view, int n4, int n5, long l4) {
                view = ProgramsFragment.access$000(this.this$0).getItem(n4, n5);
                intent = new Intent((Context)this.this$0.getActivity(), ProgramActivity.class);
                intent.putExtra("id", (Serializable)view.id);
                this.this$0.startActivity(intent);
            }

            public void onSectionClick(AdapterView<?> adapterView, View view, int n4, long l4) {
            }
        });
        object = this.mListener;
        if (object != null) {
            object.setupNotificationsCount(this.toggleBadgeTextView);
        }
        this.getPromoPrograms();
        this.getPrograms();
        this.getFavoritePrograms();
        this.gtmLogOpenView();
        return layoutInflater;
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

    @Subscribe
    public void onProgramFavoritesUpdated(ProgramFavoritesUpdatedEvent programFavoritesUpdatedEvent) {
        this.getFavoritePrograms();
        this.mProgramsSectionedAdapter.updateFavorite(programFavoritesUpdatedEvent.getProgramId(), programFavoritesUpdatedEvent.isFavorite());
    }

    public void onResume() {
        super.onResume();
        this.subscription.setVisibility(8);
    }

    @OnClick(value={2131297172})
    public void onSubscriptionClicked() {
        if (this.mListener != null) {
            TagManagerUtils.logPayWallClick((TagManager)this.activityInterface.getTagManager(), (String)"\u0448\u0430\u043f\u043a\u0430 \u0432 \u043f\u0440\u043e\u0433\u0440\u0430\u043c\u043c\u0430\u0445");
            this.mListener.onSubscriptionClicked();
        }
    }
}

