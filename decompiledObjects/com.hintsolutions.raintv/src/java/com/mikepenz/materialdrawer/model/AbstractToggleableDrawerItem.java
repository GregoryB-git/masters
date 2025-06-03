/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.ToggleButton
 *  androidx.annotation.LayoutRes
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
package com.mikepenz.materialdrawer.model;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import androidx.annotation.LayoutRes;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.interfaces.OnCheckedChangeListener;
import com.mikepenz.materialdrawer.model.AbstractToggleableDrawerItem;
import com.mikepenz.materialdrawer.model.BaseDescribeableDrawerItem;
import com.mikepenz.materialdrawer.model.BaseViewHolder;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import java.util.List;

public class AbstractToggleableDrawerItem<Item extends AbstractToggleableDrawerItem>
extends BaseDescribeableDrawerItem<Item, ViewHolder> {
    private boolean checked = false;
    private CompoundButton.OnCheckedChangeListener checkedChangeListener = new CompoundButton.OnCheckedChangeListener(this){
        public final AbstractToggleableDrawerItem this$0;
        {
            this.this$0 = abstractToggleableDrawerItem;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
            if (this.this$0.isEnabled()) {
                AbstractToggleableDrawerItem.access$102(this.this$0, bl);
                if (this.this$0.getOnCheckedChangeListener() != null) {
                    this.this$0.getOnCheckedChangeListener().onCheckedChanged(this.this$0, compoundButton, bl);
                }
            } else {
                compoundButton.setOnCheckedChangeListener(null);
                compoundButton.setChecked(bl ^ true);
                compoundButton.setOnCheckedChangeListener(AbstractToggleableDrawerItem.access$300(this.this$0));
            }
        }
    };
    private OnCheckedChangeListener onCheckedChangeListener = null;
    private boolean toggleEnabled = true;

    public static /* synthetic */ boolean access$100(AbstractToggleableDrawerItem abstractToggleableDrawerItem) {
        return abstractToggleableDrawerItem.checked;
    }

    public static /* synthetic */ boolean access$102(AbstractToggleableDrawerItem abstractToggleableDrawerItem, boolean bl) {
        abstractToggleableDrawerItem.checked = bl;
        return bl;
    }

    public static /* synthetic */ CompoundButton.OnCheckedChangeListener access$300(AbstractToggleableDrawerItem abstractToggleableDrawerItem) {
        return abstractToggleableDrawerItem.checkedChangeListener;
    }

    @Override
    public void bindView(ViewHolder viewHolder, List list) {
        super.bindView(viewHolder, (List<Object>)list);
        this.bindViewHelper(viewHolder);
        viewHolder.toggle.setOnCheckedChangeListener(null);
        viewHolder.toggle.setChecked(this.checked);
        viewHolder.toggle.setOnCheckedChangeListener(this.checkedChangeListener);
        viewHolder.toggle.setEnabled(this.toggleEnabled);
        this.withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener(this, viewHolder){
            public final AbstractToggleableDrawerItem this$0;
            public final ViewHolder val$viewHolder;
            {
                this.this$0 = abstractToggleableDrawerItem;
                this.val$viewHolder = viewHolder;
            }

            public boolean onItemClick(View object, int n4, IDrawerItem iDrawerItem) {
                if (!this.this$0.isSelectable()) {
                    object = this.this$0;
                    AbstractToggleableDrawerItem.access$102((AbstractToggleableDrawerItem)object, AbstractToggleableDrawerItem.access$100((AbstractToggleableDrawerItem)object) ^ true);
                    ViewHolder.access$000(this.val$viewHolder).setChecked(AbstractToggleableDrawerItem.access$100(this.this$0));
                }
                return false;
            }
        });
        this.onPostBindView(this, viewHolder.itemView);
    }

    @Override
    @LayoutRes
    public int getLayoutRes() {
        return R.layout.material_drawer_item_toggle;
    }

    public OnCheckedChangeListener getOnCheckedChangeListener() {
        return this.onCheckedChangeListener;
    }

    @Override
    public int getType() {
        return R.id.material_drawer_item_primary_toggle;
    }

    @Override
    public ViewHolder getViewHolder(View view) {
        return new ViewHolder(view, null);
    }

    public boolean isChecked() {
        return this.checked;
    }

    public boolean isToggleEnabled() {
        return this.toggleEnabled;
    }

    public void setChecked(boolean bl) {
        this.checked = bl;
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    public void setToggleEnabled(boolean bl) {
        this.toggleEnabled = bl;
    }

    public Item withChecked(boolean bl) {
        this.checked = bl;
        return (Item)this;
    }

    public Item withOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
        return (Item)this;
    }

    public Item withToggleEnabled(boolean bl) {
        this.toggleEnabled = bl;
        return (Item)this;
    }

    public static class ViewHolder
    extends BaseViewHolder {
        private ToggleButton toggle;

        private ViewHolder(View view) {
            super(view);
            this.toggle = (ToggleButton)view.findViewById(R.id.material_drawer_toggle);
        }

        public /* synthetic */ ViewHolder(View view, 1 var2_2) {
            this(view);
        }
    }
}

