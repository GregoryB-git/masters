/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  com.mikepenz.materialdrawer.model.interfaces.IDrawerItem
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collections
 */
package com.mikepenz.materialdrawer.util;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialize.util.UIUtils;
import java.util.ArrayList;
import java.util.Collections;

public class DrawerItemViewHelper {
    private Context mContext;
    private boolean mDivider = true;
    private ArrayList<IDrawerItem> mDrawerItems = new ArrayList();
    private OnDrawerItemClickListener mOnDrawerItemClickListener = null;

    public DrawerItemViewHelper(Context context) {
        this.mContext = context;
    }

    public View build() {
        LinearLayout linearLayout = new LinearLayout(this.mContext);
        linearLayout.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        if (this.mDivider) {
            LinearLayout linearLayout2 = new LinearLayout(this.mContext);
            linearLayout2.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -2));
            linearLayout2.setMinimumHeight((int)UIUtils.convertDpToPixel(1.0f, this.mContext));
            linearLayout2.setOrientation(1);
            linearLayout2.setBackgroundColor(UIUtils.getThemeColorFromAttrOrRes(this.mContext, R.attr.material_drawer_divider, R.color.material_drawer_divider));
            linearLayout.addView((View)linearLayout2);
        }
        for (LinearLayout linearLayout2 : this.mDrawerItems) {
            View view = linearLayout2.generateView(this.mContext);
            view.setTag((Object)linearLayout2);
            if (linearLayout2.isEnabled()) {
                view.setBackgroundResource(UIUtils.getSelectableBackgroundRes(this.mContext));
                view.setOnClickListener(new View.OnClickListener(this){
                    public final DrawerItemViewHelper this$0;
                    {
                        this.this$0 = drawerItemViewHelper;
                    }

                    public void onClick(View view) {
                        if (this.this$0.mOnDrawerItemClickListener != null) {
                            this.this$0.mOnDrawerItemClickListener.onItemClick(view, (IDrawerItem)view.getTag());
                        }
                    }
                });
            }
            linearLayout.addView(view);
        }
        return linearLayout;
    }

    public DrawerItemViewHelper withDivider(boolean bl) {
        this.mDivider = bl;
        return this;
    }

    public DrawerItemViewHelper withDrawerItems(ArrayList<IDrawerItem> arrayList) {
        this.mDrawerItems = arrayList;
        return this;
    }

    public DrawerItemViewHelper withDrawerItems(IDrawerItem ... iDrawerItemArray) {
        Collections.addAll(this.mDrawerItems, (Object[])iDrawerItemArray);
        return this;
    }

    public DrawerItemViewHelper withOnDrawerItemClickListener(OnDrawerItemClickListener onDrawerItemClickListener) {
        this.mOnDrawerItemClickListener = onDrawerItemClickListener;
        return this;
    }

    public static interface OnDrawerItemClickListener {
        public void onItemClick(View var1, IDrawerItem var2);
    }
}

