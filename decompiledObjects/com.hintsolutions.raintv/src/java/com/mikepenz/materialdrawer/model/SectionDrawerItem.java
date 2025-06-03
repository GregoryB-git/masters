/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.view.View
 *  android.widget.TextView
 *  androidx.annotation.LayoutRes
 *  androidx.annotation.StringRes
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 */
package com.mikepenz.materialdrawer.model;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.holder.ColorHolder;
import com.mikepenz.materialdrawer.holder.StringHolder;
import com.mikepenz.materialdrawer.model.AbstractDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.Nameable;
import com.mikepenz.materialdrawer.model.interfaces.Typefaceable;
import com.mikepenz.materialize.util.UIUtils;
import java.util.List;

public class SectionDrawerItem
extends AbstractDrawerItem<SectionDrawerItem, ViewHolder>
implements Nameable<SectionDrawerItem>,
Typefaceable<SectionDrawerItem> {
    private boolean divider = true;
    private StringHolder name;
    private ColorHolder textColor;
    private Typeface typeface = null;

    @Override
    public void bindView(ViewHolder viewHolder, List list) {
        super.bindView(viewHolder, (List<Object>)list);
        list = viewHolder.itemView.getContext();
        viewHolder.itemView.setId(this.hashCode());
        viewHolder.view.setClickable(false);
        viewHolder.view.setEnabled(false);
        viewHolder.name.setTextColor(com.mikepenz.materialize.holder.ColorHolder.color(this.getTextColor(), (Context)list, R.attr.material_drawer_secondary_text, R.color.material_drawer_secondary_text));
        com.mikepenz.materialize.holder.StringHolder.applyTo(this.getName(), viewHolder.name);
        if (this.getTypeface() != null) {
            viewHolder.name.setTypeface(this.getTypeface());
        }
        if (this.hasDivider()) {
            viewHolder.divider.setVisibility(0);
        } else {
            viewHolder.divider.setVisibility(8);
        }
        viewHolder.divider.setBackgroundColor(UIUtils.getThemeColorFromAttrOrRes((Context)list, R.attr.material_drawer_divider, R.color.material_drawer_divider));
        this.onPostBindView(this, viewHolder.itemView);
    }

    @Override
    @LayoutRes
    public int getLayoutRes() {
        return R.layout.material_drawer_item_section;
    }

    @Override
    public StringHolder getName() {
        return this.name;
    }

    public ColorHolder getTextColor() {
        return this.textColor;
    }

    @Override
    public int getType() {
        return R.id.material_drawer_item_section;
    }

    @Override
    public Typeface getTypeface() {
        return this.typeface;
    }

    @Override
    public ViewHolder getViewHolder(View view) {
        return new RecyclerView.ViewHolder(view, null){
            private View divider;
            private TextView name;
            private View view;
            {
                this.view = view;
                this.divider = view.findViewById(R.id.material_drawer_divider);
                this.name = (TextView)view.findViewById(R.id.material_drawer_name);
            }
            {
                this(view);
            }
        };
    }

    public boolean hasDivider() {
        return this.divider;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public boolean isSelected() {
        return false;
    }

    public SectionDrawerItem withDivider(boolean bl) {
        this.divider = bl;
        return this;
    }

    @Override
    public SectionDrawerItem withName(@StringRes int n4) {
        this.name = new StringHolder(n4);
        return this;
    }

    @Override
    public SectionDrawerItem withName(StringHolder stringHolder) {
        this.name = stringHolder;
        return this;
    }

    @Override
    public SectionDrawerItem withName(String string) {
        this.name = new StringHolder((CharSequence)string);
        return this;
    }

    public SectionDrawerItem withTextColor(int n4) {
        this.textColor = ColorHolder.fromColor(n4);
        return this;
    }

    public SectionDrawerItem withTextColorRes(int n4) {
        this.textColor = ColorHolder.fromColorRes(n4);
        return this;
    }

    @Override
    public SectionDrawerItem withTypeface(Typeface typeface) {
        this.typeface = typeface;
        return this;
    }
}

