/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.DialogInterface$OnKeyListener
 *  android.content.DialogInterface$OnShowListener
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.text.Editable
 *  android.text.Html
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.WindowManager$BadTokenException
 *  android.widget.CheckBox
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.RadioButton
 *  android.widget.TextView
 *  androidx.annotation.ArrayRes
 *  androidx.annotation.AttrRes
 *  androidx.annotation.ColorInt
 *  androidx.annotation.ColorRes
 *  androidx.annotation.DimenRes
 *  androidx.annotation.DrawableRes
 *  androidx.annotation.IntRange
 *  androidx.annotation.LayoutRes
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.StringRes
 *  androidx.annotation.UiThread
 *  androidx.core.content.res.ResourcesCompat
 *  androidx.recyclerview.widget.GridLayoutManager
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  java.lang.CharSequence
 *  java.lang.CloneNotSupportedException
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.text.NumberFormat
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  java.util.Locale
 */
package com.afollestad.materialdialogs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.UiThread;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.DefaultRvAdapter;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.DialogBase;
import com.afollestad.materialdialogs.DialogInit;
import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.StackingBehavior;
import com.afollestad.materialdialogs.Theme;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import com.afollestad.materialdialogs.internal.MDTintHelper;
import com.afollestad.materialdialogs.internal.ThemeSingleton;
import com.afollestad.materialdialogs.util.DialogUtils;
import com.afollestad.materialdialogs.util.RippleHelper;
import com.afollestad.materialdialogs.util.TypefaceHelper;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class MaterialDialog
extends DialogBase
implements View.OnClickListener,
DefaultRvAdapter.InternalListCallback {
    public final Builder builder;
    public CheckBox checkBoxPrompt;
    public TextView content;
    public FrameLayout customViewFrame;
    private final Handler handler = new Handler();
    public ImageView icon;
    public EditText input;
    public TextView inputMinMax;
    public ListType listType;
    public MDButton negativeButton;
    public MDButton neutralButton;
    public MDButton positiveButton;
    public ProgressBar progressBar;
    public TextView progressLabel;
    public TextView progressMinMax;
    public RecyclerView recyclerView;
    public List<Integer> selectedIndicesList;
    public TextView title;
    public View titleFrame;

    @SuppressLint(value={"InflateParams"})
    public MaterialDialog(Builder builder) {
        super(builder.context, DialogInit.getTheme(builder));
        this.builder = builder;
        this.view = (MDRootLayout)LayoutInflater.from((Context)builder.context).inflate(DialogInit.getInflateLayout(builder), null);
        DialogInit.init(this);
    }

    private boolean sendMultiChoiceCallback() {
        List<Integer> list2;
        if (this.builder.listCallbackMultiChoice == null) {
            return false;
        }
        Collections.sort(this.selectedIndicesList);
        ArrayList arrayList = new ArrayList();
        for (List<Integer> list2 : this.selectedIndicesList) {
            if (list2.intValue() < 0 || list2.intValue() > this.builder.items.size() - 1) continue;
            arrayList.add(this.builder.items.get(list2.intValue()));
        }
        ListCallbackMultiChoice listCallbackMultiChoice = this.builder.listCallbackMultiChoice;
        list2 = this.selectedIndicesList;
        return listCallbackMultiChoice.onSelection(this, (Integer[])list2.toArray((Object[])new Integer[list2.size()]), (CharSequence[])arrayList.toArray((Object[])new CharSequence[arrayList.size()]));
    }

    private boolean sendSingleChoiceCallback(View view) {
        Builder builder = this.builder;
        if (builder.listCallbackSingleChoice == null) {
            return false;
        }
        Builder builder2 = null;
        int n = builder.selectedIndex;
        Builder builder3 = builder2;
        if (n >= 0) {
            builder3 = builder2;
            if (n < builder.items.size()) {
                builder3 = this.builder;
                builder3 = (CharSequence)builder3.items.get(builder3.selectedIndex);
            }
        }
        builder2 = this.builder;
        return builder2.listCallbackSingleChoice.onSelection(this, view, builder2.selectedIndex, (CharSequence)builder3);
    }

    public final void checkIfListInitScroll() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            return;
        }
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this){
            public final MaterialDialog this$0;
            {
                this.this$0 = materialDialog;
            }

            public void onGlobalLayout() {
                block5: {
                    int n;
                    block7: {
                        List<Integer> list;
                        MaterialDialog materialDialog;
                        block6: {
                            int n2;
                            this.this$0.recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
                            materialDialog = this.this$0;
                            list = materialDialog.listType;
                            ListType listType = ListType.SINGLE;
                            if (list != listType && list != ListType.MULTI) break block5;
                            if (list != listType) break block6;
                            n = n2 = materialDialog.builder.selectedIndex;
                            if (n2 < 0) {
                                return;
                            }
                            break block7;
                        }
                        list = materialDialog.selectedIndicesList;
                        if (list == null || list.size() == 0) break block5;
                        Collections.sort(this.this$0.selectedIndicesList);
                        n = (Integer)this.this$0.selectedIndicesList.get(0);
                    }
                    this.this$0.recyclerView.post(new Runnable(this, n){
                        public final 1 this$1;
                        public final int val$fSelectedIndex;
                        {
                            this.this$1 = var1_1;
                            this.val$fSelectedIndex = n;
                        }

                        public void run() {
                            this.this$1.this$0.recyclerView.requestFocus();
                            this.this$1.this$0.builder.layoutManager.scrollToPosition(this.val$fSelectedIndex);
                        }
                    });
                }
            }
        });
    }

    public void clearSelectedIndices() {
        this.clearSelectedIndices(true);
    }

    public void clearSelectedIndices(boolean bl) {
        RecyclerView.Adapter<?> adapter = this.listType;
        if (adapter != null && adapter == ListType.MULTI) {
            adapter = this.builder.adapter;
            if (adapter != null && adapter instanceof DefaultRvAdapter) {
                adapter = this.selectedIndicesList;
                if (adapter != null) {
                    adapter.clear();
                }
                this.builder.adapter.notifyDataSetChanged();
                if (bl && this.builder.listCallbackMultiChoice != null) {
                    this.sendMultiChoiceCallback();
                }
                return;
            }
            throw new IllegalStateException("You can only use clearSelectedIndices() with the default adapter implementation.");
        }
        throw new IllegalStateException("You can only use clearSelectedIndices() with multi choice list dialogs.");
    }

    public void dismiss() {
        if (this.input != null) {
            DialogUtils.hideKeyboard((DialogInterface)this, this.builder);
        }
        super.dismiss();
    }

    public final MDButton getActionButton(@NonNull DialogAction dialogAction) {
        int n = 4.$SwitchMap$com$afollestad$materialdialogs$DialogAction[dialogAction.ordinal()];
        if (n != 1) {
            if (n != 2) {
                return this.positiveButton;
            }
            return this.negativeButton;
        }
        return this.neutralButton;
    }

    public final Builder getBuilder() {
        return this.builder;
    }

    public Drawable getButtonSelector(DialogAction object, boolean bl) {
        if (bl) {
            object = this.builder;
            if (((Builder)object).btnSelectorStacked != 0) {
                return ResourcesCompat.getDrawable((Resources)((Builder)object).context.getResources(), (int)this.builder.btnSelectorStacked, null);
            }
            object = ((Builder)object).context;
            int n = R.attr.md_btn_stacked_selector;
            if ((object = DialogUtils.resolveDrawable((Context)object, n)) != null) {
                return object;
            }
            return DialogUtils.resolveDrawable(this.getContext(), n);
        }
        int n = 4.$SwitchMap$com$afollestad$materialdialogs$DialogAction[object.ordinal()];
        if (n != 1) {
            if (n != 2) {
                object = this.builder;
                if (((Builder)object).btnSelectorPositive != 0) {
                    return ResourcesCompat.getDrawable((Resources)((Builder)object).context.getResources(), (int)this.builder.btnSelectorPositive, null);
                }
                object = ((Builder)object).context;
                n = R.attr.md_btn_positive_selector;
                if ((object = DialogUtils.resolveDrawable((Context)object, n)) != null) {
                    return object;
                }
                object = DialogUtils.resolveDrawable(this.getContext(), n);
                RippleHelper.applyColor((Drawable)object, this.builder.buttonRippleColor);
                return object;
            }
            object = this.builder;
            if (((Builder)object).btnSelectorNegative != 0) {
                return ResourcesCompat.getDrawable((Resources)((Builder)object).context.getResources(), (int)this.builder.btnSelectorNegative, null);
            }
            object = ((Builder)object).context;
            n = R.attr.md_btn_negative_selector;
            if ((object = DialogUtils.resolveDrawable((Context)object, n)) != null) {
                return object;
            }
            object = DialogUtils.resolveDrawable(this.getContext(), n);
            RippleHelper.applyColor((Drawable)object, this.builder.buttonRippleColor);
            return object;
        }
        object = this.builder;
        if (((Builder)object).btnSelectorNeutral != 0) {
            return ResourcesCompat.getDrawable((Resources)((Builder)object).context.getResources(), (int)this.builder.btnSelectorNeutral, null);
        }
        object = ((Builder)object).context;
        n = R.attr.md_btn_neutral_selector;
        if ((object = DialogUtils.resolveDrawable((Context)object, n)) != null) {
            return object;
        }
        object = DialogUtils.resolveDrawable(this.getContext(), n);
        RippleHelper.applyColor((Drawable)object, this.builder.buttonRippleColor);
        return object;
    }

    @Nullable
    public final TextView getContentView() {
        return this.content;
    }

    public final int getCurrentProgress() {
        ProgressBar progressBar = this.progressBar;
        if (progressBar == null) {
            return -1;
        }
        return progressBar.getProgress();
    }

    @Nullable
    public final View getCustomView() {
        return this.builder.customView;
    }

    public ImageView getIconView() {
        return this.icon;
    }

    @Nullable
    public final EditText getInputEditText() {
        return this.input;
    }

    @Nullable
    public final ArrayList<CharSequence> getItems() {
        return this.builder.items;
    }

    public final Drawable getListSelector() {
        Builder builder = this.builder;
        if (builder.listSelector != 0) {
            return ResourcesCompat.getDrawable((Resources)builder.context.getResources(), (int)this.builder.listSelector, null);
        }
        builder = builder.context;
        int n = R.attr.md_list_selector;
        if ((builder = DialogUtils.resolveDrawable((Context)builder, n)) != null) {
            return builder;
        }
        return DialogUtils.resolveDrawable(this.getContext(), n);
    }

    public final int getMaxProgress() {
        ProgressBar progressBar = this.progressBar;
        if (progressBar == null) {
            return -1;
        }
        return progressBar.getMax();
    }

    public ProgressBar getProgressBar() {
        return this.progressBar;
    }

    public RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    public int getSelectedIndex() {
        Builder builder = this.builder;
        if (builder.listCallbackSingleChoice != null) {
            return builder.selectedIndex;
        }
        return -1;
    }

    @Nullable
    public Integer[] getSelectedIndices() {
        if (this.builder.listCallbackMultiChoice != null) {
            List<Integer> list = this.selectedIndicesList;
            return (Integer[])list.toArray((Object[])new Integer[list.size()]);
        }
        return null;
    }

    @Nullable
    public Object getTag() {
        return this.builder.tag;
    }

    public final TextView getTitleView() {
        return this.title;
    }

    public final View getView() {
        return this.view;
    }

    public final boolean hasActionButtons() {
        boolean bl = this.numberOfActionButtons() > 0;
        return bl;
    }

    public final void incrementProgress(int n) {
        this.setProgress(this.getCurrentProgress() + n);
    }

    public void invalidateInputMinMaxIndicator(int n, boolean bl) {
        block6: {
            boolean bl2;
            int n2;
            Object object;
            block8: {
                block7: {
                    object = this.inputMinMax;
                    if (object == null) break block6;
                    n2 = this.builder.inputMaxLength;
                    bl2 = false;
                    if (n2 > 0) {
                        object.setText((CharSequence)String.format((Locale)Locale.getDefault(), (String)"%d/%d", (Object[])new Object[]{n, this.builder.inputMaxLength}));
                        this.inputMinMax.setVisibility(0);
                    } else {
                        object.setVisibility(8);
                    }
                    if (bl && n == 0) break block7;
                    object = this.builder;
                    n2 = object.inputMaxLength;
                    if ((n2 <= 0 || n <= n2) && n >= object.inputMinLength) break block8;
                }
                bl2 = true;
            }
            object = this.builder;
            n = bl2 ? object.inputRangeErrorColor : object.contentColor;
            object = this.builder;
            n2 = bl2 ? object.inputRangeErrorColor : object.widgetColor;
            if (this.builder.inputMaxLength > 0) {
                this.inputMinMax.setTextColor(n);
            }
            MDTintHelper.setTint(this.input, n2);
            this.getActionButton(DialogAction.POSITIVE).setEnabled(bl2 ^ true);
        }
    }

    public final void invalidateList() {
        if (this.recyclerView == null) {
            return;
        }
        Object object = this.builder.items;
        if ((object == null || object.size() == 0) && this.builder.adapter == null) {
            return;
        }
        object = this.builder;
        if (object.layoutManager == null) {
            object.layoutManager = new LinearLayoutManager(this.getContext());
        }
        if (this.recyclerView.getLayoutManager() == null) {
            this.recyclerView.setLayoutManager(this.builder.layoutManager);
        }
        this.recyclerView.setAdapter(this.builder.adapter);
        if (this.listType != null) {
            ((DefaultRvAdapter)this.builder.adapter).setCallback(this);
        }
    }

    public final boolean isCancelled() {
        return this.isShowing() ^ true;
    }

    public final boolean isIndeterminateProgress() {
        return this.builder.indeterminateProgress;
    }

    public boolean isPromptCheckBoxChecked() {
        CheckBox checkBox = this.checkBoxPrompt;
        boolean bl = checkBox != null && checkBox.isChecked();
        return bl;
    }

    @UiThread
    public final void notifyItemChanged(@IntRange(from=0L, to=0x7FFFFFFFL) int n) {
        this.builder.adapter.notifyItemChanged(n);
    }

    @UiThread
    public final void notifyItemInserted(@IntRange(from=0L, to=0x7FFFFFFFL) int n) {
        this.builder.adapter.notifyItemInserted(n);
    }

    @UiThread
    public final void notifyItemsChanged() {
        this.builder.adapter.notifyDataSetChanged();
    }

    public final int numberOfActionButtons() {
        int n = this.builder.positiveText != null && this.positiveButton.getVisibility() == 0 ? 1 : 0;
        int n2 = n;
        if (this.builder.neutralText != null) {
            n2 = n;
            if (this.neutralButton.getVisibility() == 0) {
                n2 = n + 1;
            }
        }
        n = n2;
        if (this.builder.negativeText != null) {
            n = n2;
            if (this.negativeButton.getVisibility() == 0) {
                n = n2 + 1;
            }
        }
        return n;
    }

    public final void onClick(View object) {
        DialogAction dialogAction = (DialogAction)((Object)object.getTag());
        int n = 4.$SwitchMap$com$afollestad$materialdialogs$DialogAction[dialogAction.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    Object object2 = this.builder.callback;
                    if (object2 != null) {
                        ((ButtonCallback)object2).onAny(this);
                        this.builder.callback.onPositive(this);
                    }
                    if ((object2 = this.builder.onPositiveCallback) != null) {
                        object2.onClick(this, dialogAction);
                    }
                    if (!this.builder.alwaysCallSingleChoiceCallback) {
                        this.sendSingleChoiceCallback((View)object);
                    }
                    if (!this.builder.alwaysCallMultiChoiceCallback) {
                        this.sendMultiChoiceCallback();
                    }
                    object = this.builder;
                    InputCallback inputCallback = ((Builder)object).inputCallback;
                    if (inputCallback != null && (object2 = this.input) != null && !((Builder)object).alwaysCallInputCallback) {
                        inputCallback.onInput(this, (CharSequence)object2.getText());
                    }
                    if (this.builder.autoDismiss) {
                        this.dismiss();
                    }
                }
            } else {
                object = this.builder.callback;
                if (object != null) {
                    ((ButtonCallback)object).onAny(this);
                    this.builder.callback.onNegative(this);
                }
                if ((object = this.builder.onNegativeCallback) != null) {
                    object.onClick(this, dialogAction);
                }
                if (this.builder.autoDismiss) {
                    this.cancel();
                }
            }
        } else {
            object = this.builder.callback;
            if (object != null) {
                ((ButtonCallback)object).onAny(this);
                this.builder.callback.onNeutral(this);
            }
            if ((object = this.builder.onNeutralCallback) != null) {
                object.onClick(this, dialogAction);
            }
            if (this.builder.autoDismiss) {
                this.dismiss();
            }
        }
        if ((object = this.builder.onAnyCallback) != null) {
            object.onClick(this, dialogAction);
        }
    }

    @Override
    public boolean onItemSelected(MaterialDialog object, View view, int n, CharSequence object2, boolean bl) {
        boolean bl2 = view.isEnabled();
        boolean bl3 = false;
        if (!bl2) {
            return false;
        }
        object = this.listType;
        if (object != null && object != ListType.REGULAR) {
            if (object == ListType.MULTI) {
                object = (CheckBox)view.findViewById(R.id.md_control);
                if (!object.isEnabled()) {
                    return false;
                }
                if (this.selectedIndicesList.contains((Object)n) ^ true) {
                    this.selectedIndicesList.add((Object)n);
                    if (this.builder.alwaysCallMultiChoiceCallback) {
                        if (this.sendMultiChoiceCallback()) {
                            object.setChecked(true);
                        } else {
                            this.selectedIndicesList.remove((Object)n);
                        }
                    } else {
                        object.setChecked(true);
                    }
                } else {
                    this.selectedIndicesList.remove((Object)n);
                    if (this.builder.alwaysCallMultiChoiceCallback) {
                        if (this.sendMultiChoiceCallback()) {
                            object.setChecked(false);
                        } else {
                            this.selectedIndicesList.add((Object)n);
                        }
                    } else {
                        object.setChecked(false);
                    }
                }
            } else if (object == ListType.SINGLE) {
                object = (RadioButton)view.findViewById(R.id.md_control);
                if (!object.isEnabled()) {
                    return false;
                }
                object2 = this.builder;
                int n2 = object2.selectedIndex;
                if (object2.autoDismiss && object2.positiveText == null) {
                    this.dismiss();
                    this.builder.selectedIndex = n;
                    this.sendSingleChoiceCallback(view);
                    bl = bl3;
                } else if (object2.alwaysCallSingleChoiceCallback) {
                    object2.selectedIndex = n;
                    bl = this.sendSingleChoiceCallback(view);
                    this.builder.selectedIndex = n2;
                } else {
                    bl = true;
                }
                if (bl) {
                    this.builder.selectedIndex = n;
                    object.setChecked(true);
                    this.builder.adapter.notifyItemChanged(n2);
                    this.builder.adapter.notifyItemChanged(n);
                }
            }
        } else {
            if (this.builder.autoDismiss) {
                this.dismiss();
            }
            if (!bl) {
                object = this.builder;
                object2 = ((Builder)object).listCallback;
                if (object2 != null) {
                    object2.onSelection(this, view, n, (CharSequence)((Builder)object).items.get(n));
                }
            }
            if (bl) {
                object2 = this.builder;
                object = object2.listLongCallback;
                if (object != null) {
                    return object.onLongSelection(this, view, n, (CharSequence)object2.items.get(n));
                }
            }
        }
        return true;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        if (this.input != null) {
            DialogUtils.showKeyboard((DialogInterface)this, this.builder);
            if (this.input.getText().length() > 0) {
                EditText editText = this.input;
                editText.setSelection(editText.getText().length());
            }
        }
        super.onShow(dialogInterface);
    }

    public void selectAllIndices() {
        this.selectAllIndices(true);
    }

    public void selectAllIndices(boolean bl) {
        RecyclerView.Adapter<?> adapter = this.listType;
        if (adapter != null && adapter == ListType.MULTI) {
            adapter = this.builder.adapter;
            if (adapter != null && adapter instanceof DefaultRvAdapter) {
                if (this.selectedIndicesList == null) {
                    this.selectedIndicesList = new ArrayList();
                }
                for (int j = 0; j < this.builder.adapter.getItemCount(); ++j) {
                    if (this.selectedIndicesList.contains((Object)j)) continue;
                    this.selectedIndicesList.add((Object)j);
                }
                this.builder.adapter.notifyDataSetChanged();
                if (bl && this.builder.listCallbackMultiChoice != null) {
                    this.sendMultiChoiceCallback();
                }
                return;
            }
            throw new IllegalStateException("You can only use selectAllIndices() with the default adapter implementation.");
        }
        throw new IllegalStateException("You can only use selectAllIndices() with multi choice list dialogs.");
    }

    public final void setActionButton(DialogAction dialogAction, @StringRes int n) {
        this.setActionButton(dialogAction, this.getContext().getText(n));
    }

    @UiThread
    public final void setActionButton(@NonNull DialogAction object, CharSequence charSequence) {
        int n = 4.$SwitchMap$com$afollestad$materialdialogs$DialogAction[object.ordinal()];
        int n2 = 8;
        if (n != 1) {
            if (n != 2) {
                this.builder.positiveText = charSequence;
                this.positiveButton.setText(charSequence);
                object = this.positiveButton;
                if (charSequence != null) {
                    n2 = 0;
                }
                object.setVisibility(n2);
            } else {
                this.builder.negativeText = charSequence;
                this.negativeButton.setText(charSequence);
                object = this.negativeButton;
                if (charSequence != null) {
                    n2 = 0;
                }
                object.setVisibility(n2);
            }
        } else {
            this.builder.neutralText = charSequence;
            this.neutralButton.setText(charSequence);
            object = this.neutralButton;
            if (charSequence != null) {
                n2 = 0;
            }
            object.setVisibility(n2);
        }
    }

    @UiThread
    public final void setContent(@StringRes int n) {
        this.setContent(this.builder.context.getString(n));
    }

    @UiThread
    public final void setContent(@StringRes int n, Object ... objectArray) {
        this.setContent(this.builder.context.getString(n, objectArray));
    }

    @UiThread
    public final void setContent(CharSequence charSequence) {
        this.content.setText(charSequence);
        TextView textView = this.content;
        int n = TextUtils.isEmpty((CharSequence)charSequence) ? 8 : 0;
        textView.setVisibility(n);
    }

    @UiThread
    public void setIcon(@DrawableRes int n) {
        this.icon.setImageResource(n);
        ImageView imageView = this.icon;
        n = n != 0 ? 0 : 8;
        imageView.setVisibility(n);
    }

    @UiThread
    public void setIcon(Drawable drawable2) {
        this.icon.setImageDrawable(drawable2);
        ImageView imageView = this.icon;
        int n = drawable2 != null ? 0 : 8;
        imageView.setVisibility(n);
    }

    @UiThread
    public void setIconAttribute(@AttrRes int n) {
        this.setIcon(DialogUtils.resolveDrawable(this.builder.context, n));
    }

    public void setInternalInputCallback() {
        EditText editText = this.input;
        if (editText == null) {
            return;
        }
        editText.addTextChangedListener(new TextWatcher(this){
            public final MaterialDialog this$0;
            {
                this.this$0 = materialDialog;
            }

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int n, int n2, int n3) {
            }

            public void onTextChanged(CharSequence charSequence, int n, int n2, int n3) {
                n = charSequence.toString().length();
                MaterialDialog materialDialog = this.this$0;
                boolean bl = materialDialog.builder.inputAllowEmpty;
                boolean bl2 = false;
                boolean bl3 = false;
                if (!bl) {
                    bl2 = bl3;
                    if (n == 0) {
                        bl2 = true;
                    }
                    materialDialog.getActionButton(DialogAction.POSITIVE).setEnabled(bl2 ^ true);
                }
                this.this$0.invalidateInputMinMaxIndicator(n, bl2);
                materialDialog = this.this$0;
                Builder builder = materialDialog.builder;
                if (builder.alwaysCallInputCallback) {
                    builder.inputCallback.onInput(materialDialog, charSequence);
                }
            }
        });
    }

    @UiThread
    public final void setItems(CharSequence ... charSequenceArray) {
        Builder builder = this.builder;
        if (builder.adapter != null) {
            if (charSequenceArray != null) {
                builder.items = new ArrayList(charSequenceArray.length);
                Collections.addAll(this.builder.items, (Object[])charSequenceArray);
            } else {
                builder.items = null;
            }
            if (this.builder.adapter instanceof DefaultRvAdapter) {
                this.notifyItemsChanged();
                return;
            }
            throw new IllegalStateException("When using a custom adapter, setItems() cannot be used. Set items through the adapter instead.");
        }
        throw new IllegalStateException("This MaterialDialog instance does not yet have an adapter set to it. You cannot use setItems().");
    }

    public final void setMaxProgress(int n) {
        if (this.builder.progress > -2) {
            this.progressBar.setMax(n);
            return;
        }
        throw new IllegalStateException("Cannot use setMaxProgress() on this dialog.");
    }

    public final void setProgress(int n) {
        if (this.builder.progress <= -2) {
            Log.w((String)"MaterialDialog", (String)"Calling setProgress(int) on an indeterminate progress dialog has no effect!");
            return;
        }
        this.progressBar.setProgress(n);
        this.handler.post(new Runnable(this){
            public final MaterialDialog this$0;
            {
                this.this$0 = materialDialog;
            }

            public void run() {
                MaterialDialog materialDialog = this.this$0;
                Object object = materialDialog.progressLabel;
                if (object != null) {
                    object.setText((CharSequence)materialDialog.builder.progressPercentFormat.format((double)((float)materialDialog.getCurrentProgress() / (float)this.this$0.getMaxProgress())));
                }
                object = this.this$0;
                materialDialog = ((MaterialDialog)object).progressMinMax;
                if (materialDialog != null) {
                    materialDialog.setText(String.format((String)((MaterialDialog)object).builder.progressNumberFormat, (Object[])new Object[]{((MaterialDialog)object).getCurrentProgress(), this.this$0.getMaxProgress()}));
                }
            }
        });
    }

    public final void setProgressNumberFormat(String string2) {
        this.builder.progressNumberFormat = string2;
        this.setProgress(this.getCurrentProgress());
    }

    public final void setProgressPercentFormat(NumberFormat numberFormat) {
        this.builder.progressPercentFormat = numberFormat;
        this.setProgress(this.getCurrentProgress());
    }

    public void setPromptCheckBoxChecked(boolean bl) {
        CheckBox checkBox = this.checkBoxPrompt;
        if (checkBox != null) {
            checkBox.setChecked(bl);
        }
    }

    @UiThread
    public void setSelectedIndex(int n) {
        RecyclerView.Adapter<?> adapter = this.builder;
        adapter.selectedIndex = n;
        adapter = adapter.adapter;
        if (adapter != null && adapter instanceof DefaultRvAdapter) {
            adapter.notifyDataSetChanged();
            return;
        }
        throw new IllegalStateException("You can only use setSelectedIndex() with the default adapter implementation.");
    }

    @UiThread
    public void setSelectedIndices(@NonNull Integer[] adapter) {
        this.selectedIndicesList = new ArrayList((Collection)Arrays.asList((Object[])adapter));
        adapter = this.builder.adapter;
        if (adapter != null && adapter instanceof DefaultRvAdapter) {
            adapter.notifyDataSetChanged();
            return;
        }
        throw new IllegalStateException("You can only use setSelectedIndices() with the default adapter implementation.");
    }

    @UiThread
    public final void setTitle(@StringRes int n) {
        this.setTitle(this.builder.context.getString(n));
    }

    @UiThread
    public final void setTitle(@StringRes int n, Object ... objectArray) {
        this.setTitle(this.builder.context.getString(n, objectArray));
    }

    @UiThread
    public final void setTitle(CharSequence charSequence) {
        this.title.setText(charSequence);
    }

    public final void setTypeface(TextView textView, Typeface typeface) {
        if (typeface == null) {
            return;
        }
        textView.setPaintFlags(textView.getPaintFlags() | 0x80);
        textView.setTypeface(typeface);
    }

    @UiThread
    public void show() {
        try {
            super.show();
            return;
        }
        catch (WindowManager.BadTokenException badTokenException) {
            throw new DialogException("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
        }
    }

    public static class Builder {
        public RecyclerView.Adapter<?> adapter;
        public boolean alwaysCallInputCallback;
        public boolean alwaysCallMultiChoiceCallback;
        public boolean alwaysCallSingleChoiceCallback;
        public boolean autoDismiss;
        public int backgroundColor;
        @DrawableRes
        public int btnSelectorNegative;
        @DrawableRes
        public int btnSelectorNeutral;
        @DrawableRes
        public int btnSelectorPositive;
        @DrawableRes
        public int btnSelectorStacked;
        public GravityEnum btnStackedGravity;
        public int buttonRippleColor;
        public GravityEnum buttonsGravity;
        public ButtonCallback callback;
        public DialogInterface.OnCancelListener cancelListener;
        public boolean cancelable;
        public boolean canceledOnTouchOutside;
        public CharSequence checkBoxPrompt;
        public boolean checkBoxPromptInitiallyChecked;
        public CompoundButton.OnCheckedChangeListener checkBoxPromptListener;
        public ColorStateList choiceWidgetColor;
        public CharSequence content;
        public int contentColor;
        public boolean contentColorSet;
        public GravityEnum contentGravity;
        public float contentLineSpacingMultiplier;
        public final Context context;
        public View customView;
        public Integer[] disabledIndices;
        public DialogInterface.OnDismissListener dismissListener;
        public int dividerColor;
        public boolean dividerColorSet;
        public Drawable icon;
        public boolean indeterminateIsHorizontalProgress;
        public boolean indeterminateProgress;
        public boolean inputAllowEmpty;
        public InputCallback inputCallback;
        public CharSequence inputHint;
        public int inputMaxLength;
        public int inputMinLength;
        public CharSequence inputPrefill;
        public int inputRangeErrorColor;
        public int inputType;
        public int itemColor;
        public boolean itemColorSet;
        public int[] itemIds;
        public ArrayList<CharSequence> items;
        public GravityEnum itemsGravity;
        public DialogInterface.OnKeyListener keyListener;
        public RecyclerView.LayoutManager layoutManager;
        public boolean limitIconToDefaultSize;
        public ColorStateList linkColor;
        public ListCallback listCallback;
        public ListCallbackMultiChoice listCallbackMultiChoice;
        public ListCallbackSingleChoice listCallbackSingleChoice;
        public ListLongCallback listLongCallback;
        @DrawableRes
        public int listSelector;
        public int maxIconSize;
        public Typeface mediumFont;
        public ColorStateList negativeColor;
        public boolean negativeColorSet;
        public boolean negativeFocus;
        public CharSequence negativeText;
        public ColorStateList neutralColor;
        public boolean neutralColorSet;
        public boolean neutralFocus;
        public CharSequence neutralText;
        public SingleButtonCallback onAnyCallback;
        public SingleButtonCallback onNegativeCallback;
        public SingleButtonCallback onNeutralCallback;
        public SingleButtonCallback onPositiveCallback;
        public ColorStateList positiveColor;
        public boolean positiveColorSet;
        public boolean positiveFocus;
        public CharSequence positiveText;
        public int progress;
        public int progressMax;
        public String progressNumberFormat;
        public NumberFormat progressPercentFormat;
        public Typeface regularFont;
        public int selectedIndex;
        public Integer[] selectedIndices;
        public DialogInterface.OnShowListener showListener;
        public boolean showMinMax;
        public StackingBehavior stackingBehavior;
        public Object tag;
        public Theme theme;
        public CharSequence title;
        public int titleColor;
        public boolean titleColorSet;
        public GravityEnum titleGravity;
        public int widgetColor;
        public boolean widgetColorSet;
        public boolean wrapCustomViewInScroll;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public Builder(@NonNull Context object) {
            Object object2 = GravityEnum.START;
            this.titleGravity = object2;
            this.contentGravity = object2;
            this.btnStackedGravity = GravityEnum.END;
            this.itemsGravity = object2;
            this.buttonsGravity = object2;
            this.buttonRippleColor = 0;
            this.titleColor = -1;
            this.contentColor = -1;
            this.alwaysCallMultiChoiceCallback = false;
            this.alwaysCallSingleChoiceCallback = false;
            object2 = Theme.LIGHT;
            this.theme = object2;
            this.cancelable = true;
            this.canceledOnTouchOutside = true;
            this.contentLineSpacingMultiplier = 1.2f;
            this.selectedIndex = -1;
            this.selectedIndices = null;
            this.disabledIndices = null;
            this.autoDismiss = true;
            this.maxIconSize = -1;
            this.progress = -2;
            this.progressMax = 0;
            this.inputType = -1;
            this.inputMinLength = -1;
            this.inputMaxLength = -1;
            this.inputRangeErrorColor = 0;
            this.titleColorSet = false;
            this.contentColorSet = false;
            this.itemColorSet = false;
            this.positiveColorSet = false;
            this.neutralColorSet = false;
            this.negativeColorSet = false;
            this.widgetColorSet = false;
            this.dividerColorSet = false;
            this.context = object;
            int n = DialogUtils.getColor(object, R.color.md_material_blue_600);
            this.widgetColor = n = DialogUtils.resolveColor(object, R.attr.colorAccent, n);
            this.widgetColor = n = DialogUtils.resolveColor(object, 16843829, n);
            this.positiveColor = DialogUtils.getActionTextStateList(object, n);
            this.negativeColor = DialogUtils.getActionTextStateList(object, this.widgetColor);
            this.neutralColor = DialogUtils.getActionTextStateList(object, this.widgetColor);
            this.linkColor = DialogUtils.getActionTextStateList(object, DialogUtils.resolveColor(object, R.attr.md_link_color, this.widgetColor));
            n = DialogUtils.resolveColor(object, 16843820);
            this.buttonRippleColor = DialogUtils.resolveColor(object, R.attr.md_btn_ripple_color, DialogUtils.resolveColor(object, R.attr.colorControlHighlight, n));
            this.progressPercentFormat = NumberFormat.getPercentInstance();
            this.progressNumberFormat = "%1d/%2d";
            if (!DialogUtils.isColorDark(DialogUtils.resolveColor(object, 16842806))) {
                object2 = Theme.DARK;
            }
            this.theme = object2;
            this.checkSingleton();
            this.titleGravity = DialogUtils.resolveGravityEnum(object, R.attr.md_title_gravity, this.titleGravity);
            this.contentGravity = DialogUtils.resolveGravityEnum(object, R.attr.md_content_gravity, this.contentGravity);
            this.btnStackedGravity = DialogUtils.resolveGravityEnum(object, R.attr.md_btnstacked_gravity, this.btnStackedGravity);
            this.itemsGravity = DialogUtils.resolveGravityEnum(object, R.attr.md_items_gravity, this.itemsGravity);
            this.buttonsGravity = DialogUtils.resolveGravityEnum(object, R.attr.md_buttons_gravity, this.buttonsGravity);
            object2 = DialogUtils.resolveString(object, R.attr.md_medium_font);
            String string2 = DialogUtils.resolveString(object, R.attr.md_regular_font);
            try {
                this.typeface((String)object2, string2);
            }
            catch (Throwable throwable) {}
            if (this.mediumFont == null) {
                try {
                    this.mediumFont = Typeface.create((String)"sans-serif-medium", (int)0);
                }
                catch (Throwable throwable) {
                    this.mediumFont = Typeface.DEFAULT_BOLD;
                }
            }
            if (this.regularFont != null) return;
            try {
                this.regularFont = Typeface.create((String)"sans-serif", (int)0);
                return;
            }
            catch (Throwable throwable) {
                Typeface typeface;
                this.regularFont = typeface = Typeface.SANS_SERIF;
                if (typeface != null) return;
                this.regularFont = Typeface.DEFAULT;
            }
        }

        private void checkSingleton() {
            ColorStateList colorStateList;
            int n;
            if (ThemeSingleton.get(false) == null) {
                return;
            }
            ThemeSingleton themeSingleton = ThemeSingleton.get();
            if (themeSingleton.darkTheme) {
                this.theme = Theme.DARK;
            }
            if ((n = themeSingleton.titleColor) != 0) {
                this.titleColor = n;
            }
            if ((n = themeSingleton.contentColor) != 0) {
                this.contentColor = n;
            }
            if ((colorStateList = themeSingleton.positiveColor) != null) {
                this.positiveColor = colorStateList;
            }
            if ((colorStateList = themeSingleton.neutralColor) != null) {
                this.neutralColor = colorStateList;
            }
            if ((colorStateList = themeSingleton.negativeColor) != null) {
                this.negativeColor = colorStateList;
            }
            if ((n = themeSingleton.itemColor) != 0) {
                this.itemColor = n;
            }
            if ((colorStateList = themeSingleton.icon) != null) {
                this.icon = colorStateList;
            }
            if ((n = themeSingleton.backgroundColor) != 0) {
                this.backgroundColor = n;
            }
            if ((n = themeSingleton.dividerColor) != 0) {
                this.dividerColor = n;
            }
            if ((n = themeSingleton.btnSelectorStacked) != 0) {
                this.btnSelectorStacked = n;
            }
            if ((n = themeSingleton.listSelector) != 0) {
                this.listSelector = n;
            }
            if ((n = themeSingleton.btnSelectorPositive) != 0) {
                this.btnSelectorPositive = n;
            }
            if ((n = themeSingleton.btnSelectorNeutral) != 0) {
                this.btnSelectorNeutral = n;
            }
            if ((n = themeSingleton.btnSelectorNegative) != 0) {
                this.btnSelectorNegative = n;
            }
            if ((n = themeSingleton.widgetColor) != 0) {
                this.widgetColor = n;
            }
            if ((colorStateList = themeSingleton.linkColor) != null) {
                this.linkColor = colorStateList;
            }
            this.titleGravity = themeSingleton.titleGravity;
            this.contentGravity = themeSingleton.contentGravity;
            this.btnStackedGravity = themeSingleton.btnStackedGravity;
            this.itemsGravity = themeSingleton.itemsGravity;
            this.buttonsGravity = themeSingleton.buttonsGravity;
        }

        public Builder adapter(@NonNull RecyclerView.Adapter<?> adapter, @Nullable RecyclerView.LayoutManager layoutManager) {
            if (this.customView == null) {
                if (layoutManager != null && !(layoutManager instanceof LinearLayoutManager) && !(layoutManager instanceof GridLayoutManager)) {
                    throw new IllegalStateException("You can currently only use LinearLayoutManager and GridLayoutManager with this library.");
                }
                this.adapter = adapter;
                this.layoutManager = layoutManager;
                return this;
            }
            throw new IllegalStateException("You cannot set adapter() when you're using a custom view.");
        }

        public Builder alwaysCallInputCallback() {
            this.alwaysCallInputCallback = true;
            return this;
        }

        public Builder alwaysCallMultiChoiceCallback() {
            this.alwaysCallMultiChoiceCallback = true;
            return this;
        }

        public Builder alwaysCallSingleChoiceCallback() {
            this.alwaysCallSingleChoiceCallback = true;
            return this;
        }

        public Builder autoDismiss(boolean bl) {
            this.autoDismiss = bl;
            return this;
        }

        public Builder backgroundColor(@ColorInt int n) {
            this.backgroundColor = n;
            return this;
        }

        public Builder backgroundColorAttr(@AttrRes int n) {
            return this.backgroundColor(DialogUtils.resolveColor(this.context, n));
        }

        public Builder backgroundColorRes(@ColorRes int n) {
            return this.backgroundColor(DialogUtils.getColor(this.context, n));
        }

        public Builder btnSelector(@DrawableRes int n) {
            this.btnSelectorPositive = n;
            this.btnSelectorNeutral = n;
            this.btnSelectorNegative = n;
            return this;
        }

        public Builder btnSelector(@DrawableRes int n, @NonNull DialogAction dialogAction) {
            int n2 = 4.$SwitchMap$com$afollestad$materialdialogs$DialogAction[dialogAction.ordinal()];
            if (n2 != 1) {
                if (n2 != 2) {
                    this.btnSelectorPositive = n;
                } else {
                    this.btnSelectorNegative = n;
                }
            } else {
                this.btnSelectorNeutral = n;
            }
            return this;
        }

        public Builder btnSelectorStacked(@DrawableRes int n) {
            this.btnSelectorStacked = n;
            return this;
        }

        public Builder btnStackedGravity(@NonNull GravityEnum gravityEnum) {
            this.btnStackedGravity = gravityEnum;
            return this;
        }

        @UiThread
        public MaterialDialog build() {
            return new MaterialDialog(this);
        }

        public Builder buttonRippleColor(@ColorInt int n) {
            this.buttonRippleColor = n;
            return this;
        }

        public Builder buttonRippleColorAttr(@AttrRes int n) {
            return this.buttonRippleColor(DialogUtils.resolveColor(this.context, n));
        }

        public Builder buttonRippleColorRes(@ColorRes int n) {
            return this.buttonRippleColor(DialogUtils.getColor(this.context, n));
        }

        public Builder buttonsGravity(@NonNull GravityEnum gravityEnum) {
            this.buttonsGravity = gravityEnum;
            return this;
        }

        public Builder callback(@NonNull ButtonCallback buttonCallback) {
            this.callback = buttonCallback;
            return this;
        }

        public Builder cancelListener(@NonNull DialogInterface.OnCancelListener onCancelListener) {
            this.cancelListener = onCancelListener;
            return this;
        }

        public Builder cancelable(boolean bl) {
            this.cancelable = bl;
            this.canceledOnTouchOutside = bl;
            return this;
        }

        public Builder canceledOnTouchOutside(boolean bl) {
            this.canceledOnTouchOutside = bl;
            return this;
        }

        public Builder checkBoxPrompt(@NonNull CharSequence charSequence, boolean bl, @Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            this.checkBoxPrompt = charSequence;
            this.checkBoxPromptInitiallyChecked = bl;
            this.checkBoxPromptListener = onCheckedChangeListener;
            return this;
        }

        public Builder checkBoxPromptRes(@StringRes int n, boolean bl, @Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            return this.checkBoxPrompt(this.context.getResources().getText(n), bl, onCheckedChangeListener);
        }

        public Builder choiceWidgetColor(@Nullable ColorStateList colorStateList) {
            this.choiceWidgetColor = colorStateList;
            return this;
        }

        public Builder content(@StringRes int n) {
            return this.content(n, false);
        }

        public Builder content(@StringRes int n, boolean bl) {
            CharSequence charSequence;
            CharSequence charSequence2 = charSequence = this.context.getText(n);
            if (bl) {
                charSequence2 = Html.fromHtml((String)charSequence.toString().replace((CharSequence)"\n", (CharSequence)"<br/>"));
            }
            return this.content(charSequence2);
        }

        public Builder content(@StringRes int n, Object ... objectArray) {
            return this.content((CharSequence)Html.fromHtml((String)String.format((String)this.context.getString(n), (Object[])objectArray).replace((CharSequence)"\n", (CharSequence)"<br/>")));
        }

        public Builder content(@NonNull CharSequence charSequence) {
            if (this.customView == null) {
                this.content = charSequence;
                return this;
            }
            throw new IllegalStateException("You cannot set content() when you're using a custom view.");
        }

        public Builder contentColor(@ColorInt int n) {
            this.contentColor = n;
            this.contentColorSet = true;
            return this;
        }

        public Builder contentColorAttr(@AttrRes int n) {
            this.contentColor(DialogUtils.resolveColor(this.context, n));
            return this;
        }

        public Builder contentColorRes(@ColorRes int n) {
            this.contentColor(DialogUtils.getColor(this.context, n));
            return this;
        }

        public Builder contentGravity(@NonNull GravityEnum gravityEnum) {
            this.contentGravity = gravityEnum;
            return this;
        }

        public Builder contentLineSpacing(float f2) {
            this.contentLineSpacingMultiplier = f2;
            return this;
        }

        public Builder customView(@LayoutRes int n, boolean bl) {
            return this.customView(LayoutInflater.from((Context)this.context).inflate(n, null), bl);
        }

        public Builder customView(@NonNull View view, boolean bl) {
            if (this.content == null) {
                if (this.items == null) {
                    if (this.inputCallback == null) {
                        if (this.progress <= -2 && !this.indeterminateProgress) {
                            if (view.getParent() != null && view.getParent() instanceof ViewGroup) {
                                ((ViewGroup)view.getParent()).removeView(view);
                            }
                            this.customView = view;
                            this.wrapCustomViewInScroll = bl;
                            return this;
                        }
                        throw new IllegalStateException("You cannot use customView() with a progress dialog");
                    }
                    throw new IllegalStateException("You cannot use customView() with an input dialog");
                }
                throw new IllegalStateException("You cannot use customView() when you have items set.");
            }
            throw new IllegalStateException("You cannot use customView() when you have content set.");
        }

        public Builder dismissListener(@NonNull DialogInterface.OnDismissListener onDismissListener) {
            this.dismissListener = onDismissListener;
            return this;
        }

        public Builder dividerColor(@ColorInt int n) {
            this.dividerColor = n;
            this.dividerColorSet = true;
            return this;
        }

        public Builder dividerColorAttr(@AttrRes int n) {
            return this.dividerColor(DialogUtils.resolveColor(this.context, n));
        }

        public Builder dividerColorRes(@ColorRes int n) {
            return this.dividerColor(DialogUtils.getColor(this.context, n));
        }

        public final Context getContext() {
            return this.context;
        }

        public final int getItemColor() {
            return this.itemColor;
        }

        public final Typeface getRegularFont() {
            return this.regularFont;
        }

        public Builder icon(@NonNull Drawable drawable2) {
            this.icon = drawable2;
            return this;
        }

        public Builder iconAttr(@AttrRes int n) {
            this.icon = DialogUtils.resolveDrawable(this.context, n);
            return this;
        }

        public Builder iconRes(@DrawableRes int n) {
            this.icon = ResourcesCompat.getDrawable((Resources)this.context.getResources(), (int)n, null);
            return this;
        }

        public Builder input(@StringRes int n, @StringRes int n2, @NonNull InputCallback inputCallback) {
            return this.input(n, n2, true, inputCallback);
        }

        public Builder input(@StringRes int n, @StringRes int n2, boolean bl, @NonNull InputCallback inputCallback) {
            CharSequence charSequence = null;
            CharSequence charSequence2 = n == 0 ? null : this.context.getText(n);
            if (n2 != 0) {
                charSequence = this.context.getText(n2);
            }
            return this.input(charSequence2, charSequence, bl, inputCallback);
        }

        public Builder input(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @NonNull InputCallback inputCallback) {
            return this.input(charSequence, charSequence2, true, inputCallback);
        }

        public Builder input(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, boolean bl, @NonNull InputCallback inputCallback) {
            if (this.customView == null) {
                this.inputCallback = inputCallback;
                this.inputHint = charSequence;
                this.inputPrefill = charSequence2;
                this.inputAllowEmpty = bl;
                return this;
            }
            throw new IllegalStateException("You cannot set content() when you're using a custom view.");
        }

        public Builder inputRange(@IntRange(from=0L, to=0x7FFFFFFFL) int n, @IntRange(from=-1L, to=0x7FFFFFFFL) int n2) {
            return this.inputRange(n, n2, 0);
        }

        public Builder inputRange(@IntRange(from=0L, to=0x7FFFFFFFL) int n, @IntRange(from=-1L, to=0x7FFFFFFFL) int n2, @ColorInt int n3) {
            if (n >= 0) {
                this.inputMinLength = n;
                this.inputMaxLength = n2;
                this.inputRangeErrorColor = n3 == 0 ? DialogUtils.getColor(this.context, R.color.md_edittext_error) : n3;
                if (this.inputMinLength > 0) {
                    this.inputAllowEmpty = false;
                }
                return this;
            }
            throw new IllegalArgumentException("Min length for input dialogs cannot be less than 0.");
        }

        public Builder inputRangeRes(@IntRange(from=0L, to=0x7FFFFFFFL) int n, @IntRange(from=-1L, to=0x7FFFFFFFL) int n2, @ColorRes int n3) {
            return this.inputRange(n, n2, DialogUtils.getColor(this.context, n3));
        }

        public Builder inputType(int n) {
            this.inputType = n;
            return this;
        }

        public Builder items(@ArrayRes int n) {
            this.items(this.context.getResources().getTextArray(n));
            return this;
        }

        public Builder items(@NonNull Collection collection) {
            if (collection.size() > 0) {
                CharSequence[] charSequenceArray = new CharSequence[collection.size()];
                int n = 0;
                collection = collection.iterator();
                while (collection.hasNext()) {
                    charSequenceArray[n] = collection.next().toString();
                    ++n;
                }
                this.items(charSequenceArray);
            } else if (collection.size() == 0) {
                this.items = new ArrayList();
            }
            return this;
        }

        public Builder items(CharSequence ... charSequenceArray) {
            if (this.customView == null) {
                ArrayList arrayList;
                this.items = arrayList = new ArrayList();
                Collections.addAll((Collection)arrayList, (Object[])charSequenceArray);
                return this;
            }
            throw new IllegalStateException("You cannot set items() when you're using a custom view.");
        }

        public Builder itemsCallback(@NonNull ListCallback listCallback) {
            this.listCallback = listCallback;
            this.listCallbackSingleChoice = null;
            this.listCallbackMultiChoice = null;
            return this;
        }

        public Builder itemsCallbackMultiChoice(@Nullable Integer[] integerArray, @NonNull ListCallbackMultiChoice listCallbackMultiChoice) {
            this.selectedIndices = integerArray;
            this.listCallback = null;
            this.listCallbackSingleChoice = null;
            this.listCallbackMultiChoice = listCallbackMultiChoice;
            return this;
        }

        public Builder itemsCallbackSingleChoice(int n, @NonNull ListCallbackSingleChoice listCallbackSingleChoice) {
            this.selectedIndex = n;
            this.listCallback = null;
            this.listCallbackSingleChoice = listCallbackSingleChoice;
            this.listCallbackMultiChoice = null;
            return this;
        }

        public Builder itemsColor(@ColorInt int n) {
            this.itemColor = n;
            this.itemColorSet = true;
            return this;
        }

        public Builder itemsColorAttr(@AttrRes int n) {
            return this.itemsColor(DialogUtils.resolveColor(this.context, n));
        }

        public Builder itemsColorRes(@ColorRes int n) {
            return this.itemsColor(DialogUtils.getColor(this.context, n));
        }

        public Builder itemsDisabledIndices(Integer ... integerArray) {
            this.disabledIndices = integerArray;
            return this;
        }

        public Builder itemsGravity(@NonNull GravityEnum gravityEnum) {
            this.itemsGravity = gravityEnum;
            return this;
        }

        public Builder itemsIds(@ArrayRes int n) {
            return this.itemsIds(this.context.getResources().getIntArray(n));
        }

        public Builder itemsIds(@NonNull int[] nArray) {
            this.itemIds = nArray;
            return this;
        }

        public Builder itemsLongCallback(@NonNull ListLongCallback listLongCallback) {
            this.listLongCallback = listLongCallback;
            this.listCallbackSingleChoice = null;
            this.listCallbackMultiChoice = null;
            return this;
        }

        public Builder keyListener(@NonNull DialogInterface.OnKeyListener onKeyListener) {
            this.keyListener = onKeyListener;
            return this;
        }

        public Builder limitIconToDefaultSize() {
            this.limitIconToDefaultSize = true;
            return this;
        }

        public Builder linkColor(@ColorInt int n) {
            return this.linkColor(DialogUtils.getActionTextStateList(this.context, n));
        }

        public Builder linkColor(@NonNull ColorStateList colorStateList) {
            this.linkColor = colorStateList;
            return this;
        }

        public Builder linkColorAttr(@AttrRes int n) {
            return this.linkColor(DialogUtils.resolveActionTextColorStateList(this.context, n, null));
        }

        public Builder linkColorRes(@ColorRes int n) {
            return this.linkColor(DialogUtils.getActionTextColorStateList(this.context, n));
        }

        public Builder listSelector(@DrawableRes int n) {
            this.listSelector = n;
            return this;
        }

        public Builder maxIconSize(int n) {
            this.maxIconSize = n;
            return this;
        }

        public Builder maxIconSizeRes(@DimenRes int n) {
            return this.maxIconSize((int)this.context.getResources().getDimension(n));
        }

        public Builder negativeColor(@ColorInt int n) {
            return this.negativeColor(DialogUtils.getActionTextStateList(this.context, n));
        }

        public Builder negativeColor(@NonNull ColorStateList colorStateList) {
            this.negativeColor = colorStateList;
            this.negativeColorSet = true;
            return this;
        }

        public Builder negativeColorAttr(@AttrRes int n) {
            return this.negativeColor(DialogUtils.resolveActionTextColorStateList(this.context, n, null));
        }

        public Builder negativeColorRes(@ColorRes int n) {
            return this.negativeColor(DialogUtils.getActionTextColorStateList(this.context, n));
        }

        public Builder negativeFocus(boolean bl) {
            this.negativeFocus = bl;
            return this;
        }

        public Builder negativeText(@StringRes int n) {
            if (n == 0) {
                return this;
            }
            return this.negativeText(this.context.getText(n));
        }

        public Builder negativeText(@NonNull CharSequence charSequence) {
            this.negativeText = charSequence;
            return this;
        }

        public Builder neutralColor(@ColorInt int n) {
            return this.neutralColor(DialogUtils.getActionTextStateList(this.context, n));
        }

        public Builder neutralColor(@NonNull ColorStateList colorStateList) {
            this.neutralColor = colorStateList;
            this.neutralColorSet = true;
            return this;
        }

        public Builder neutralColorAttr(@AttrRes int n) {
            return this.neutralColor(DialogUtils.resolveActionTextColorStateList(this.context, n, null));
        }

        public Builder neutralColorRes(@ColorRes int n) {
            return this.neutralColor(DialogUtils.getActionTextColorStateList(this.context, n));
        }

        public Builder neutralFocus(boolean bl) {
            this.neutralFocus = bl;
            return this;
        }

        public Builder neutralText(@StringRes int n) {
            if (n == 0) {
                return this;
            }
            return this.neutralText(this.context.getText(n));
        }

        public Builder neutralText(@NonNull CharSequence charSequence) {
            this.neutralText = charSequence;
            return this;
        }

        public Builder onAny(@NonNull SingleButtonCallback singleButtonCallback) {
            this.onAnyCallback = singleButtonCallback;
            return this;
        }

        public Builder onNegative(@NonNull SingleButtonCallback singleButtonCallback) {
            this.onNegativeCallback = singleButtonCallback;
            return this;
        }

        public Builder onNeutral(@NonNull SingleButtonCallback singleButtonCallback) {
            this.onNeutralCallback = singleButtonCallback;
            return this;
        }

        public Builder onPositive(@NonNull SingleButtonCallback singleButtonCallback) {
            this.onPositiveCallback = singleButtonCallback;
            return this;
        }

        public Builder positiveColor(@ColorInt int n) {
            return this.positiveColor(DialogUtils.getActionTextStateList(this.context, n));
        }

        public Builder positiveColor(@NonNull ColorStateList colorStateList) {
            this.positiveColor = colorStateList;
            this.positiveColorSet = true;
            return this;
        }

        public Builder positiveColorAttr(@AttrRes int n) {
            return this.positiveColor(DialogUtils.resolveActionTextColorStateList(this.context, n, null));
        }

        public Builder positiveColorRes(@ColorRes int n) {
            return this.positiveColor(DialogUtils.getActionTextColorStateList(this.context, n));
        }

        public Builder positiveFocus(boolean bl) {
            this.positiveFocus = bl;
            return this;
        }

        public Builder positiveText(@StringRes int n) {
            if (n == 0) {
                return this;
            }
            this.positiveText(this.context.getText(n));
            return this;
        }

        public Builder positiveText(@NonNull CharSequence charSequence) {
            this.positiveText = charSequence;
            return this;
        }

        public Builder progress(boolean bl, int n) {
            if (this.customView == null) {
                if (bl) {
                    this.indeterminateProgress = true;
                    this.progress = -2;
                } else {
                    this.indeterminateIsHorizontalProgress = false;
                    this.indeterminateProgress = false;
                    this.progress = -1;
                    this.progressMax = n;
                }
                return this;
            }
            throw new IllegalStateException("You cannot set progress() when you're using a custom view.");
        }

        public Builder progress(boolean bl, int n, boolean bl2) {
            this.showMinMax = bl2;
            return this.progress(bl, n);
        }

        public Builder progressIndeterminateStyle(boolean bl) {
            this.indeterminateIsHorizontalProgress = bl;
            return this;
        }

        public Builder progressNumberFormat(@NonNull String string2) {
            this.progressNumberFormat = string2;
            return this;
        }

        public Builder progressPercentFormat(@NonNull NumberFormat numberFormat) {
            this.progressPercentFormat = numberFormat;
            return this;
        }

        @UiThread
        public MaterialDialog show() {
            MaterialDialog materialDialog = this.build();
            materialDialog.show();
            return materialDialog;
        }

        public Builder showListener(@NonNull DialogInterface.OnShowListener onShowListener) {
            this.showListener = onShowListener;
            return this;
        }

        public Builder stackingBehavior(@NonNull StackingBehavior stackingBehavior) {
            this.stackingBehavior = stackingBehavior;
            return this;
        }

        public Builder tag(@Nullable Object object) {
            this.tag = object;
            return this;
        }

        public Builder theme(@NonNull Theme theme) {
            this.theme = theme;
            return this;
        }

        public Builder title(@StringRes int n) {
            this.title(this.context.getText(n));
            return this;
        }

        public Builder title(@NonNull CharSequence charSequence) {
            this.title = charSequence;
            return this;
        }

        public Builder titleColor(@ColorInt int n) {
            this.titleColor = n;
            this.titleColorSet = true;
            return this;
        }

        public Builder titleColorAttr(@AttrRes int n) {
            return this.titleColor(DialogUtils.resolveColor(this.context, n));
        }

        public Builder titleColorRes(@ColorRes int n) {
            return this.titleColor(DialogUtils.getColor(this.context, n));
        }

        public Builder titleGravity(@NonNull GravityEnum gravityEnum) {
            this.titleGravity = gravityEnum;
            return this;
        }

        public Builder typeface(@Nullable Typeface typeface, @Nullable Typeface typeface2) {
            this.mediumFont = typeface;
            this.regularFont = typeface2;
            return this;
        }

        public Builder typeface(@Nullable String string2, @Nullable String string3) {
            if (string2 != null && !string2.trim().isEmpty()) {
                Typeface typeface;
                this.mediumFont = typeface = TypefaceHelper.get(this.context, string2);
                if (typeface == null) {
                    throw new IllegalArgumentException(z2.p("No font asset found for \"", string2, "\""));
                }
            }
            if (string3 != null && !string3.trim().isEmpty()) {
                string2 = TypefaceHelper.get(this.context, string3);
                this.regularFont = string2;
                if (string2 == null) {
                    throw new IllegalArgumentException(z2.p("No font asset found for \"", string3, "\""));
                }
            }
            return this;
        }

        public Builder widgetColor(@ColorInt int n) {
            this.widgetColor = n;
            this.widgetColorSet = true;
            return this;
        }

        public Builder widgetColorAttr(@AttrRes int n) {
            return this.widgetColor(DialogUtils.resolveColor(this.context, n));
        }

        public Builder widgetColorRes(@ColorRes int n) {
            return this.widgetColor(DialogUtils.getColor(this.context, n));
        }
    }

    @Deprecated
    public static abstract class ButtonCallback {
        public final Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public final boolean equals(Object object) {
            return super.equals(object);
        }

        public final void finalize() throws Throwable {
            super.finalize();
        }

        public final int hashCode() {
            return super.hashCode();
        }

        @Deprecated
        public void onAny(MaterialDialog materialDialog) {
        }

        @Deprecated
        public void onNegative(MaterialDialog materialDialog) {
        }

        @Deprecated
        public void onNeutral(MaterialDialog materialDialog) {
        }

        @Deprecated
        public void onPositive(MaterialDialog materialDialog) {
        }

        public final String toString() {
            return super.toString();
        }
    }

    public static class DialogException
    extends WindowManager.BadTokenException {
        public DialogException(String string2) {
            super(string2);
        }
    }

    public static interface InputCallback {
        public void onInput(@NonNull MaterialDialog var1, CharSequence var2);
    }

    public static interface ListCallback {
        public void onSelection(MaterialDialog var1, View var2, int var3, CharSequence var4);
    }

    public static interface ListCallbackMultiChoice {
        public boolean onSelection(MaterialDialog var1, Integer[] var2, CharSequence[] var3);
    }

    public static interface ListCallbackSingleChoice {
        public boolean onSelection(MaterialDialog var1, View var2, int var3, CharSequence var4);
    }

    public static interface ListLongCallback {
        public boolean onLongSelection(MaterialDialog var1, View var2, int var3, CharSequence var4);
    }

    public static final class ListType
    extends Enum<ListType> {
        private static final ListType[] $VALUES;
        public static final /* enum */ ListType MULTI;
        public static final /* enum */ ListType REGULAR;
        public static final /* enum */ ListType SINGLE;

        static {
            ListType listType;
            ListType listType2;
            ListType listType3;
            REGULAR = listType3 = new ListType();
            SINGLE = listType2 = new ListType();
            MULTI = listType = new ListType();
            $VALUES = new ListType[]{listType3, listType2, listType};
        }

        public static int getLayoutForType(ListType listType) {
            int n = 4.$SwitchMap$com$afollestad$materialdialogs$MaterialDialog$ListType[listType.ordinal()];
            if (n != 1) {
                if (n != 2) {
                    if (n == 3) {
                        return R.layout.md_listitem_multichoice;
                    }
                    throw new IllegalArgumentException("Not a valid list type");
                }
                return R.layout.md_listitem_singlechoice;
            }
            return R.layout.md_listitem;
        }

        public static ListType valueOf(String string2) {
            return (ListType)Enum.valueOf(ListType.class, (String)string2);
        }

        public static ListType[] values() {
            return (ListType[])$VALUES.clone();
        }
    }

    public static interface SingleButtonCallback {
        public void onClick(@NonNull MaterialDialog var1, @NonNull DialogAction var2);
    }
}

