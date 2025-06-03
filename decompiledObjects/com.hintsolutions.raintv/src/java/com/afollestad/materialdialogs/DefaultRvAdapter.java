/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.view.ViewGroup
 *  android.widget.CheckBox
 *  android.widget.CompoundButton
 *  android.widget.LinearLayout
 *  android.widget.RadioButton
 *  android.widget.TextView
 *  androidx.annotation.LayoutRes
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.util.ArrayList
 */
package com.afollestad.materialdialogs;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.internal.MDTintHelper;
import com.afollestad.materialdialogs.util.DialogUtils;
import java.util.ArrayList;

class DefaultRvAdapter
extends RecyclerView.Adapter<DefaultVH> {
    private InternalListCallback callback;
    private final MaterialDialog dialog;
    private final GravityEnum itemGravity;
    @LayoutRes
    private final int layout;

    public DefaultRvAdapter(MaterialDialog materialDialog, @LayoutRes int n) {
        this.dialog = materialDialog;
        this.layout = n;
        this.itemGravity = materialDialog.builder.itemsGravity;
    }

    @TargetApi(value=17)
    private boolean isRTL() {
        int n = this.dialog.getBuilder().getContext().getResources().getConfiguration().getLayoutDirection();
        boolean bl = true;
        if (n != 1) {
            bl = false;
        }
        return bl;
    }

    @TargetApi(value=17)
    private void setupGravity(ViewGroup viewGroup) {
        ((LinearLayout)viewGroup).setGravity(this.itemGravity.getGravityInt() | 0x10);
        if (viewGroup.getChildCount() == 2) {
            if (this.itemGravity == GravityEnum.END && !this.isRTL() && viewGroup.getChildAt(0) instanceof CompoundButton) {
                CompoundButton compoundButton = (CompoundButton)viewGroup.getChildAt(0);
                viewGroup.removeView((View)compoundButton);
                TextView textView = (TextView)viewGroup.getChildAt(0);
                viewGroup.removeView((View)textView);
                textView.setPadding(textView.getPaddingRight(), textView.getPaddingTop(), textView.getPaddingLeft(), textView.getPaddingBottom());
                viewGroup.addView((View)textView);
                viewGroup.addView((View)compoundButton);
            } else if (this.itemGravity == GravityEnum.START && this.isRTL() && viewGroup.getChildAt(1) instanceof CompoundButton) {
                CompoundButton compoundButton = (CompoundButton)viewGroup.getChildAt(1);
                viewGroup.removeView((View)compoundButton);
                TextView textView = (TextView)viewGroup.getChildAt(0);
                viewGroup.removeView((View)textView);
                textView.setPadding(textView.getPaddingRight(), textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
                viewGroup.addView((View)compoundButton);
                viewGroup.addView((View)textView);
            }
        }
    }

    public int getItemCount() {
        ArrayList<CharSequence> arrayList = this.dialog.builder.items;
        int n = arrayList != null ? arrayList.size() : 0;
        return n;
    }

    public void onBindViewHolder(DefaultVH defaultVH, int n) {
        Object object;
        View view = defaultVH.itemView;
        boolean bl = DialogUtils.isIn(n, this.dialog.builder.disabledIndices);
        int n2 = bl ? DialogUtils.adjustAlpha(this.dialog.builder.itemColor, 0.4f) : this.dialog.builder.itemColor;
        defaultVH.itemView.setEnabled(bl ^ true);
        int n3 = 1.$SwitchMap$com$afollestad$materialdialogs$MaterialDialog$ListType[this.dialog.listType.ordinal()];
        if (n3 != 1) {
            if (n3 == 2) {
                CheckBox checkBox = (CheckBox)defaultVH.control;
                boolean bl2 = this.dialog.selectedIndicesList.contains((Object)n);
                MaterialDialog.Builder builder = this.dialog.builder;
                object = builder.choiceWidgetColor;
                if (object != null) {
                    MDTintHelper.setTint(checkBox, (ColorStateList)object);
                } else {
                    MDTintHelper.setTint(checkBox, builder.widgetColor);
                }
                checkBox.setChecked(bl2);
                checkBox.setEnabled(bl ^ true);
            }
        } else {
            object = (RadioButton)defaultVH.control;
            MaterialDialog.Builder builder = this.dialog.builder;
            boolean bl3 = builder.selectedIndex == n;
            ColorStateList colorStateList = builder.choiceWidgetColor;
            if (colorStateList != null) {
                MDTintHelper.setTint(object, colorStateList);
            } else {
                MDTintHelper.setTint(object, builder.widgetColor);
            }
            object.setChecked(bl3);
            object.setEnabled(bl ^ true);
        }
        defaultVH.title.setText((CharSequence)this.dialog.builder.items.get(n));
        defaultVH.title.setTextColor(n2);
        object = this.dialog;
        object.setTypeface(defaultVH.title, object.builder.regularFont);
        defaultVH = (ViewGroup)view;
        this.setupGravity((ViewGroup)defaultVH);
        object = this.dialog.builder.itemIds;
        if (object != null) {
            if (n < ((RadioButton)object).length) {
                view.setId((int)object[n]);
            } else {
                view.setId(-1);
            }
        }
        if (defaultVH.getChildCount() == 2) {
            if (defaultVH.getChildAt(0) instanceof CompoundButton) {
                defaultVH.getChildAt(0).setBackground(null);
            } else if (defaultVH.getChildAt(1) instanceof CompoundButton) {
                defaultVH.getChildAt(1).setBackground(null);
            }
        }
    }

    public DefaultVH onCreateViewHolder(ViewGroup viewGroup, int n) {
        viewGroup = LayoutInflater.from((Context)viewGroup.getContext()).inflate(this.layout, viewGroup, false);
        DialogUtils.setBackgroundCompat((View)viewGroup, this.dialog.getListSelector());
        return new DefaultVH((View)viewGroup, this);
    }

    public void setCallback(InternalListCallback internalListCallback) {
        this.callback = internalListCallback;
    }

    public static class DefaultVH
    extends RecyclerView.ViewHolder
    implements View.OnClickListener,
    View.OnLongClickListener {
        public final DefaultRvAdapter adapter;
        public final CompoundButton control;
        public final TextView title;

        public DefaultVH(View view, DefaultRvAdapter defaultRvAdapter) {
            super(view);
            this.control = (CompoundButton)view.findViewById(R.id.md_control);
            this.title = (TextView)view.findViewById(R.id.md_title);
            this.adapter = defaultRvAdapter;
            view.setOnClickListener((View.OnClickListener)this);
            if (((DefaultRvAdapter)defaultRvAdapter).dialog.builder.listLongCallback != null) {
                view.setOnLongClickListener((View.OnLongClickListener)this);
            }
        }

        public void onClick(View view) {
            if (this.adapter.callback != null && this.getAdapterPosition() != -1) {
                CharSequence charSequence;
                CharSequence charSequence2 = charSequence = null;
                if (((DefaultRvAdapter)this.adapter).dialog.builder.items != null) {
                    charSequence2 = charSequence;
                    if (this.getAdapterPosition() < ((DefaultRvAdapter)this.adapter).dialog.builder.items.size()) {
                        charSequence2 = (CharSequence)((DefaultRvAdapter)this.adapter).dialog.builder.items.get(this.getAdapterPosition());
                    }
                }
                this.adapter.callback.onItemSelected(this.adapter.dialog, view, this.getAdapterPosition(), charSequence2, false);
            }
        }

        public boolean onLongClick(View view) {
            if (this.adapter.callback != null && this.getAdapterPosition() != -1) {
                CharSequence charSequence;
                CharSequence charSequence2 = charSequence = null;
                if (((DefaultRvAdapter)this.adapter).dialog.builder.items != null) {
                    charSequence2 = charSequence;
                    if (this.getAdapterPosition() < ((DefaultRvAdapter)this.adapter).dialog.builder.items.size()) {
                        charSequence2 = (CharSequence)((DefaultRvAdapter)this.adapter).dialog.builder.items.get(this.getAdapterPosition());
                    }
                }
                return this.adapter.callback.onItemSelected(this.adapter.dialog, view, this.getAdapterPosition(), charSequence2, true);
            }
            return false;
        }
    }

    public static interface InternalListCallback {
        public boolean onItemSelected(MaterialDialog var1, View var2, int var3, CharSequence var4, boolean var5);
    }
}

