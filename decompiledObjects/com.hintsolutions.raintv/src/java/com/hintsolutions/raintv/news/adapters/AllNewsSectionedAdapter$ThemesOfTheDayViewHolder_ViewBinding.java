/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  androidx.annotation.CallSuper
 *  androidx.annotation.UiThread
 *  androidx.viewpager.widget.ViewPager
 *  butterknife.Unbinder
 *  butterknife.internal.Utils
 *  com.viewpagerindicator.CirclePageIndicator
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.news.adapters;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.news.adapters.AllNewsSectionedAdapter;
import com.viewpagerindicator.CirclePageIndicator;

public class AllNewsSectionedAdapter$ThemesOfTheDayViewHolder_ViewBinding
implements Unbinder {
    private AllNewsSectionedAdapter.ThemesOfTheDayViewHolder target;

    @UiThread
    public AllNewsSectionedAdapter$ThemesOfTheDayViewHolder_ViewBinding(AllNewsSectionedAdapter.ThemesOfTheDayViewHolder themesOfTheDayViewHolder, View view) {
        this.target = themesOfTheDayViewHolder;
        themesOfTheDayViewHolder.mPager = (ViewPager)Utils.findRequiredViewAsType((View)view, (int)2131296990, (String)"field 'mPager'", ViewPager.class);
        themesOfTheDayViewHolder.mIndicator = (CirclePageIndicator)Utils.findRequiredViewAsType((View)view, (int)2131296709, (String)"field 'mIndicator'", CirclePageIndicator.class);
        themesOfTheDayViewHolder.mSpacer = Utils.findRequiredView((View)view, (int)2131297144, (String)"field 'mSpacer'");
    }

    @CallSuper
    public void unbind() {
        AllNewsSectionedAdapter.ThemesOfTheDayViewHolder themesOfTheDayViewHolder = this.target;
        if (themesOfTheDayViewHolder != null) {
            this.target = null;
            themesOfTheDayViewHolder.mPager = null;
            themesOfTheDayViewHolder.mIndicator = null;
            themesOfTheDayViewHolder.mSpacer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

