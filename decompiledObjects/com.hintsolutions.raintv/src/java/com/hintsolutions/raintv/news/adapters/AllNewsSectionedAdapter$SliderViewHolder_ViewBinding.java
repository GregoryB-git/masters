/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 *  androidx.annotation.CallSuper
 *  androidx.annotation.UiThread
 *  androidx.recyclerview.widget.RecyclerView
 *  butterknife.Unbinder
 *  butterknife.internal.Utils
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.news.adapters;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.news.adapters.AllNewsSectionedAdapter;

public class AllNewsSectionedAdapter$SliderViewHolder_ViewBinding
implements Unbinder {
    private AllNewsSectionedAdapter.SliderViewHolder target;

    @UiThread
    public AllNewsSectionedAdapter$SliderViewHolder_ViewBinding(AllNewsSectionedAdapter.SliderViewHolder sliderViewHolder, View view) {
        this.target = sliderViewHolder;
        sliderViewHolder.sectionHeader = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297108, (String)"field 'sectionHeader'", TextView.class);
        sliderViewHolder.items = (RecyclerView)Utils.findRequiredViewAsType((View)view, (int)2131296721, (String)"field 'items'", RecyclerView.class);
    }

    @CallSuper
    public void unbind() {
        AllNewsSectionedAdapter.SliderViewHolder sliderViewHolder = this.target;
        if (sliderViewHolder != null) {
            this.target = null;
            sliderViewHolder.sectionHeader = null;
            sliderViewHolder.items = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

