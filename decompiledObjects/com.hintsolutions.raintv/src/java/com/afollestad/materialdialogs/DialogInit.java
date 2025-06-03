/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.DialogInterface$OnKeyListener
 *  android.content.DialogInterface$OnShowListener
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.Point
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.method.PasswordTransformationMethod
 *  android.text.method.TransformationMethod
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.WindowManager$LayoutParams
 *  android.widget.CheckBox
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.ScrollView
 *  android.widget.TextView
 *  androidx.annotation.LayoutRes
 *  androidx.annotation.NonNull
 *  androidx.annotation.StyleRes
 *  androidx.annotation.UiThread
 *  androidx.recyclerview.widget.RecyclerView
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable
 *  me.zhanghai.android.materialprogressbar.IndeterminateCircularProgressDrawable
 *  me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable
 */
package com.afollestad.materialdialogs;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.DefaultRvAdapter;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.Theme;
import com.afollestad.materialdialogs.internal.MDAdapter;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import com.afollestad.materialdialogs.internal.MDTintHelper;
import com.afollestad.materialdialogs.util.DialogUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable;
import me.zhanghai.android.materialprogressbar.IndeterminateCircularProgressDrawable;
import me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable;

class DialogInit {
    private static void fixCanvasScalingWhenHardwareAccelerated(ProgressBar progressBar) {
    }

    @LayoutRes
    public static int getInflateLayout(MaterialDialog.Builder builder) {
        if (builder.customView != null) {
            return R.layout.md_dialog_custom;
        }
        if (builder.items == null && builder.adapter == null) {
            if (builder.progress > -2) {
                return R.layout.md_dialog_progress;
            }
            if (builder.indeterminateProgress) {
                if (builder.indeterminateIsHorizontalProgress) {
                    return R.layout.md_dialog_progress_indeterminate_horizontal;
                }
                return R.layout.md_dialog_progress_indeterminate;
            }
            if (builder.inputCallback != null) {
                if (builder.checkBoxPrompt != null) {
                    return R.layout.md_dialog_input_check;
                }
                return R.layout.md_dialog_input;
            }
            if (builder.checkBoxPrompt != null) {
                return R.layout.md_dialog_basic_check;
            }
            return R.layout.md_dialog_basic;
        }
        if (builder.checkBoxPrompt != null) {
            return R.layout.md_dialog_list_check;
        }
        return R.layout.md_dialog_list;
    }

    @StyleRes
    public static int getTheme(@NonNull MaterialDialog.Builder builder) {
        Context context = builder.context;
        int n = R.attr.md_dark_theme;
        Theme theme = builder.theme;
        Theme theme2 = Theme.DARK;
        boolean bl = theme == theme2;
        if (!(bl = DialogUtils.resolveBoolean(context, n, bl))) {
            theme2 = Theme.LIGHT;
        }
        builder.theme = theme2;
        n = bl ? R.style.MD_Dark : R.style.MD_Light;
        return n;
    }

    @UiThread
    public static void init(MaterialDialog materialDialog) {
        int n;
        boolean bl;
        int n2;
        int n3;
        Object object;
        MaterialDialog.Builder builder = materialDialog.builder;
        materialDialog.setCancelable(builder.cancelable);
        materialDialog.setCanceledOnTouchOutside(builder.canceledOnTouchOutside);
        if (builder.backgroundColor == 0) {
            builder.backgroundColor = DialogUtils.resolveColor(builder.context, R.attr.md_background_color, DialogUtils.resolveColor(materialDialog.getContext(), R.attr.colorBackgroundFloating));
        }
        if (builder.backgroundColor != 0) {
            object = new GradientDrawable();
            object.setCornerRadius(builder.context.getResources().getDimension(R.dimen.md_bg_corner_radius));
            object.setColor(builder.backgroundColor);
            materialDialog.getWindow().setBackgroundDrawable((Drawable)object);
        }
        if (!builder.positiveColorSet) {
            builder.positiveColor = DialogUtils.resolveActionTextColorStateList(builder.context, R.attr.md_positive_color, builder.positiveColor);
        }
        if (!builder.neutralColorSet) {
            builder.neutralColor = DialogUtils.resolveActionTextColorStateList(builder.context, R.attr.md_neutral_color, builder.neutralColor);
        }
        if (!builder.negativeColorSet) {
            builder.negativeColor = DialogUtils.resolveActionTextColorStateList(builder.context, R.attr.md_negative_color, builder.negativeColor);
        }
        if (!builder.widgetColorSet) {
            builder.widgetColor = DialogUtils.resolveColor(builder.context, R.attr.md_widget_color, builder.widgetColor);
        }
        if (!builder.titleColorSet) {
            n3 = DialogUtils.resolveColor(materialDialog.getContext(), 16842806);
            builder.titleColor = DialogUtils.resolveColor(builder.context, R.attr.md_title_color, n3);
        }
        if (!builder.contentColorSet) {
            n3 = DialogUtils.resolveColor(materialDialog.getContext(), 16842808);
            builder.contentColor = DialogUtils.resolveColor(builder.context, R.attr.md_content_color, n3);
        }
        if (!builder.itemColorSet) {
            builder.itemColor = DialogUtils.resolveColor(builder.context, R.attr.md_item_color, builder.contentColor);
        }
        materialDialog.title = (TextView)materialDialog.view.findViewById(R.id.md_title);
        materialDialog.icon = (ImageView)materialDialog.view.findViewById(R.id.md_icon);
        materialDialog.titleFrame = materialDialog.view.findViewById(R.id.md_titleFrame);
        materialDialog.content = (TextView)materialDialog.view.findViewById(R.id.md_content);
        materialDialog.recyclerView = (RecyclerView)materialDialog.view.findViewById(R.id.md_contentRecyclerView);
        materialDialog.checkBoxPrompt = (CheckBox)materialDialog.view.findViewById(R.id.md_promptCheckbox);
        materialDialog.positiveButton = (MDButton)materialDialog.view.findViewById(R.id.md_buttonDefaultPositive);
        materialDialog.neutralButton = (MDButton)materialDialog.view.findViewById(R.id.md_buttonDefaultNeutral);
        materialDialog.negativeButton = (MDButton)materialDialog.view.findViewById(R.id.md_buttonDefaultNegative);
        if (builder.inputCallback != null && builder.positiveText == null) {
            builder.positiveText = builder.context.getText(17039370);
        }
        object = materialDialog.positiveButton;
        n3 = builder.positiveText != null ? 0 : 8;
        object.setVisibility(n3);
        object = materialDialog.neutralButton;
        n3 = builder.neutralText != null ? 0 : 8;
        object.setVisibility(n3);
        object = materialDialog.negativeButton;
        n3 = builder.negativeText != null ? 0 : 8;
        object.setVisibility(n3);
        materialDialog.positiveButton.setFocusable(true);
        materialDialog.neutralButton.setFocusable(true);
        materialDialog.negativeButton.setFocusable(true);
        if (builder.positiveFocus) {
            materialDialog.positiveButton.requestFocus();
        }
        if (builder.neutralFocus) {
            materialDialog.neutralButton.requestFocus();
        }
        if (builder.negativeFocus) {
            materialDialog.negativeButton.requestFocus();
        }
        if (builder.icon != null) {
            materialDialog.icon.setVisibility(0);
            materialDialog.icon.setImageDrawable(builder.icon);
        } else {
            object = DialogUtils.resolveDrawable(builder.context, R.attr.md_icon);
            if (object != null) {
                materialDialog.icon.setVisibility(0);
                materialDialog.icon.setImageDrawable((Drawable)object);
            } else {
                materialDialog.icon.setVisibility(8);
            }
        }
        n3 = n2 = builder.maxIconSize;
        if (n2 == -1) {
            n3 = DialogUtils.resolveDimension(builder.context, R.attr.md_icon_max_size);
        }
        if (builder.limitIconToDefaultSize || DialogUtils.resolveBoolean(builder.context, R.attr.md_icon_limit_icon_to_default_size)) {
            n3 = builder.context.getResources().getDimensionPixelSize(R.dimen.md_icon_max_size);
        }
        if (n3 > -1) {
            materialDialog.icon.setAdjustViewBounds(true);
            materialDialog.icon.setMaxHeight(n3);
            materialDialog.icon.setMaxWidth(n3);
            materialDialog.icon.requestLayout();
        }
        if (!builder.dividerColorSet) {
            n3 = DialogUtils.resolveColor(materialDialog.getContext(), R.attr.md_divider);
            builder.dividerColor = DialogUtils.resolveColor(builder.context, R.attr.md_divider_color, n3);
        }
        materialDialog.view.setDividerColor(builder.dividerColor);
        object = materialDialog.title;
        if (object != null) {
            materialDialog.setTypeface((TextView)object, builder.mediumFont);
            materialDialog.title.setTextColor(builder.titleColor);
            materialDialog.title.setGravity(builder.titleGravity.getGravityInt());
            materialDialog.title.setTextAlignment(builder.titleGravity.getTextAlignment());
            object = builder.title;
            if (object == null) {
                materialDialog.titleFrame.setVisibility(8);
            } else {
                materialDialog.title.setText((CharSequence)object);
                materialDialog.titleFrame.setVisibility(0);
            }
        }
        if ((object = materialDialog.content) != null) {
            object.setMovementMethod((MovementMethod)new LinkMovementMethod());
            materialDialog.setTypeface(materialDialog.content, builder.regularFont);
            materialDialog.content.setLineSpacing(0.0f, builder.contentLineSpacingMultiplier);
            object = builder.linkColor;
            if (object == null) {
                materialDialog.content.setLinkTextColor(DialogUtils.resolveColor(materialDialog.getContext(), 16842806));
            } else {
                materialDialog.content.setLinkTextColor((ColorStateList)object);
            }
            materialDialog.content.setTextColor(builder.contentColor);
            materialDialog.content.setGravity(builder.contentGravity.getGravityInt());
            materialDialog.content.setTextAlignment(builder.contentGravity.getTextAlignment());
            object = builder.content;
            if (object != null) {
                materialDialog.content.setText((CharSequence)object);
                materialDialog.content.setVisibility(0);
            } else {
                materialDialog.content.setVisibility(8);
            }
        }
        if ((object = materialDialog.checkBoxPrompt) != null) {
            object.setText(builder.checkBoxPrompt);
            materialDialog.checkBoxPrompt.setChecked(builder.checkBoxPromptInitiallyChecked);
            materialDialog.checkBoxPrompt.setOnCheckedChangeListener(builder.checkBoxPromptListener);
            materialDialog.setTypeface((TextView)materialDialog.checkBoxPrompt, builder.regularFont);
            materialDialog.checkBoxPrompt.setTextColor(builder.contentColor);
            MDTintHelper.setTint(materialDialog.checkBoxPrompt, builder.widgetColor);
        }
        materialDialog.view.setButtonGravity(builder.buttonsGravity);
        materialDialog.view.setButtonStackedGravity(builder.btnStackedGravity);
        materialDialog.view.setStackingBehavior(builder.stackingBehavior);
        boolean bl2 = bl = DialogUtils.resolveBoolean(builder.context, 16843660, true);
        if (bl) {
            bl2 = DialogUtils.resolveBoolean(builder.context, R.attr.textAllCaps, true);
        }
        object = materialDialog.positiveButton;
        materialDialog.setTypeface((TextView)object, builder.mediumFont);
        object.setAllCapsCompat(bl2);
        object.setText(builder.positiveText);
        object.setTextColor(builder.positiveColor);
        MDButton mDButton = materialDialog.positiveButton;
        object = DialogAction.POSITIVE;
        mDButton.setStackedSelector(materialDialog.getButtonSelector((DialogAction)((Object)object), true));
        materialDialog.positiveButton.setDefaultSelector(materialDialog.getButtonSelector((DialogAction)((Object)object), false));
        materialDialog.positiveButton.setTag(object);
        materialDialog.positiveButton.setOnClickListener(materialDialog);
        materialDialog.positiveButton.setVisibility(0);
        object = materialDialog.negativeButton;
        materialDialog.setTypeface((TextView)object, builder.mediumFont);
        object.setAllCapsCompat(bl2);
        object.setText(builder.negativeText);
        object.setTextColor(builder.negativeColor);
        mDButton = materialDialog.negativeButton;
        object = DialogAction.NEGATIVE;
        mDButton.setStackedSelector(materialDialog.getButtonSelector((DialogAction)((Object)object), true));
        materialDialog.negativeButton.setDefaultSelector(materialDialog.getButtonSelector((DialogAction)((Object)object), false));
        materialDialog.negativeButton.setTag(object);
        materialDialog.negativeButton.setOnClickListener(materialDialog);
        materialDialog.negativeButton.setVisibility(0);
        object = materialDialog.neutralButton;
        materialDialog.setTypeface((TextView)object, builder.mediumFont);
        object.setAllCapsCompat(bl2);
        object.setText(builder.neutralText);
        object.setTextColor(builder.neutralColor);
        mDButton = materialDialog.neutralButton;
        object = DialogAction.NEUTRAL;
        mDButton.setStackedSelector(materialDialog.getButtonSelector((DialogAction)((Object)object), true));
        materialDialog.neutralButton.setDefaultSelector(materialDialog.getButtonSelector((DialogAction)((Object)object), false));
        materialDialog.neutralButton.setTag(object);
        materialDialog.neutralButton.setOnClickListener(materialDialog);
        materialDialog.neutralButton.setVisibility(0);
        if (builder.listCallbackMultiChoice != null) {
            materialDialog.selectedIndicesList = new ArrayList();
        }
        if (materialDialog.recyclerView != null) {
            object = builder.adapter;
            if (object == null) {
                if (builder.listCallbackSingleChoice != null) {
                    materialDialog.listType = MaterialDialog.ListType.SINGLE;
                } else if (builder.listCallbackMultiChoice != null) {
                    materialDialog.listType = MaterialDialog.ListType.MULTI;
                    if (builder.selectedIndices != null) {
                        materialDialog.selectedIndicesList = new ArrayList((Collection)Arrays.asList((Object[])builder.selectedIndices));
                        builder.selectedIndices = null;
                    }
                } else {
                    materialDialog.listType = MaterialDialog.ListType.REGULAR;
                }
                builder.adapter = new DefaultRvAdapter(materialDialog, MaterialDialog.ListType.getLayoutForType(materialDialog.listType));
            } else if (object instanceof MDAdapter) {
                ((MDAdapter)object).setDialog(materialDialog);
            }
        }
        DialogInit.setupProgressDialog(materialDialog);
        DialogInit.setupInputDialog(materialDialog);
        if (builder.customView != null) {
            FrameLayout frameLayout;
            ((MDRootLayout)materialDialog.view.findViewById(R.id.md_root)).noTitleNoPadding();
            materialDialog.customViewFrame = frameLayout = (FrameLayout)materialDialog.view.findViewById(R.id.md_customViewFrame);
            mDButton = builder.customView;
            if (mDButton.getParent() != null) {
                ((ViewGroup)mDButton.getParent()).removeView((View)mDButton);
            }
            object = mDButton;
            if (builder.wrapCustomViewInScroll) {
                Resources resources = materialDialog.getContext().getResources();
                n2 = resources.getDimensionPixelSize(R.dimen.md_dialog_frame_margin);
                object = new ScrollView(materialDialog.getContext());
                n3 = resources.getDimensionPixelSize(R.dimen.md_content_padding_top);
                n = resources.getDimensionPixelSize(R.dimen.md_content_padding_bottom);
                object.setClipToPadding(false);
                if (mDButton instanceof EditText) {
                    object.setPadding(n2, n3, n2, n);
                } else {
                    object.setPadding(0, n3, 0, n);
                    mDButton.setPadding(n2, 0, n2, 0);
                }
                object.addView((View)mDButton, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -2));
            }
            frameLayout.addView((View)object, new ViewGroup.LayoutParams(-1, -2));
        }
        if ((object = builder.showListener) != null) {
            materialDialog.setOnShowListener((DialogInterface.OnShowListener)object);
        }
        if ((object = builder.cancelListener) != null) {
            materialDialog.setOnCancelListener((DialogInterface.OnCancelListener)object);
        }
        if ((object = builder.dismissListener) != null) {
            materialDialog.setOnDismissListener((DialogInterface.OnDismissListener)object);
        }
        if ((object = builder.keyListener) != null) {
            materialDialog.setOnKeyListener((DialogInterface.OnKeyListener)object);
        }
        materialDialog.setOnShowListenerInternal();
        materialDialog.invalidateList();
        materialDialog.setViewInternal((View)materialDialog.view);
        materialDialog.checkIfListInitScroll();
        object = materialDialog.getWindow().getWindowManager().getDefaultDisplay();
        mDButton = new Point();
        object.getSize((Point)mDButton);
        n = ((Point)mDButton).x;
        n2 = ((Point)mDButton).y;
        n3 = builder.context.getResources().getDimensionPixelSize(R.dimen.md_dialog_vertical_margin);
        int n4 = builder.context.getResources().getDimensionPixelSize(R.dimen.md_dialog_horizontal_margin);
        int n6 = builder.context.getResources().getDimensionPixelSize(R.dimen.md_dialog_max_width);
        materialDialog.view.setMaxHeight(n2 - n3 * 2);
        object = new WindowManager.LayoutParams();
        object.copyFrom(materialDialog.getWindow().getAttributes());
        object.width = Math.min((int)n6, (int)(n - n4 * 2));
        materialDialog.getWindow().setAttributes((WindowManager.LayoutParams)object);
    }

    private static void setupInputDialog(MaterialDialog materialDialog) {
        EditText editText;
        MaterialDialog.Builder builder = materialDialog.builder;
        materialDialog.input = editText = (EditText)materialDialog.view.findViewById(16908297);
        if (editText == null) {
            return;
        }
        materialDialog.setTypeface((TextView)editText, builder.regularFont);
        editText = builder.inputPrefill;
        if (editText != null) {
            materialDialog.input.setText((CharSequence)editText);
        }
        materialDialog.setInternalInputCallback();
        materialDialog.input.setHint(builder.inputHint);
        materialDialog.input.setSingleLine();
        materialDialog.input.setTextColor(builder.contentColor);
        materialDialog.input.setHintTextColor(DialogUtils.adjustAlpha(builder.contentColor, 0.3f));
        MDTintHelper.setTint(materialDialog.input, materialDialog.builder.widgetColor);
        int n = builder.inputType;
        if (n != -1) {
            materialDialog.input.setInputType(n);
            n = builder.inputType;
            if (n != 144 && (n & 0x80) == 128) {
                materialDialog.input.setTransformationMethod((TransformationMethod)PasswordTransformationMethod.getInstance());
            }
        }
        editText = (TextView)materialDialog.view.findViewById(R.id.md_minMax);
        materialDialog.inputMinMax = editText;
        if (builder.inputMinLength <= 0 && builder.inputMaxLength <= -1) {
            editText.setVisibility(8);
            materialDialog.inputMinMax = null;
        } else {
            materialDialog.invalidateInputMinMaxIndicator(materialDialog.input.getText().toString().length(), builder.inputAllowEmpty ^ true);
        }
    }

    private static void setupProgressDialog(MaterialDialog materialDialog) {
        MaterialDialog.Builder builder = materialDialog.builder;
        if (builder.indeterminateProgress || builder.progress > -2) {
            ProgressBar progressBar;
            materialDialog.progressBar = progressBar = (ProgressBar)materialDialog.view.findViewById(16908301);
            if (progressBar == null) {
                return;
            }
            if (builder.indeterminateProgress) {
                if (builder.indeterminateIsHorizontalProgress) {
                    progressBar = new IndeterminateHorizontalProgressDrawable(builder.getContext());
                    progressBar.setTint(builder.widgetColor);
                    materialDialog.progressBar.setProgressDrawable((Drawable)progressBar);
                    materialDialog.progressBar.setIndeterminateDrawable((Drawable)progressBar);
                } else {
                    progressBar = new IndeterminateCircularProgressDrawable(builder.getContext());
                    progressBar.setTint(builder.widgetColor);
                    materialDialog.progressBar.setProgressDrawable((Drawable)progressBar);
                    materialDialog.progressBar.setIndeterminateDrawable((Drawable)progressBar);
                }
            } else {
                progressBar = new HorizontalProgressDrawable(builder.getContext());
                progressBar.setTint(builder.widgetColor);
                materialDialog.progressBar.setProgressDrawable((Drawable)progressBar);
                materialDialog.progressBar.setIndeterminateDrawable((Drawable)progressBar);
            }
            boolean bl = builder.indeterminateProgress;
            if (!bl || builder.indeterminateIsHorizontalProgress) {
                progressBar = materialDialog.progressBar;
                bl = bl && builder.indeterminateIsHorizontalProgress;
                progressBar.setIndeterminate(bl);
                materialDialog.progressBar.setProgress(0);
                materialDialog.progressBar.setMax(builder.progressMax);
                progressBar = (TextView)materialDialog.view.findViewById(R.id.md_label);
                materialDialog.progressLabel = progressBar;
                if (progressBar != null) {
                    progressBar.setTextColor(builder.contentColor);
                    materialDialog.setTypeface(materialDialog.progressLabel, builder.mediumFont);
                    materialDialog.progressLabel.setText((CharSequence)builder.progressPercentFormat.format(0L));
                }
                progressBar = (TextView)materialDialog.view.findViewById(R.id.md_minMax);
                materialDialog.progressMinMax = progressBar;
                if (progressBar != null) {
                    progressBar.setTextColor(builder.contentColor);
                    materialDialog.setTypeface(materialDialog.progressMinMax, builder.regularFont);
                    if (builder.showMinMax) {
                        materialDialog.progressMinMax.setVisibility(0);
                        materialDialog.progressMinMax.setText((CharSequence)String.format((String)builder.progressNumberFormat, (Object[])new Object[]{0, builder.progressMax}));
                        builder = (ViewGroup.MarginLayoutParams)materialDialog.progressBar.getLayoutParams();
                        ((ViewGroup.MarginLayoutParams)builder).leftMargin = 0;
                        ((ViewGroup.MarginLayoutParams)builder).rightMargin = 0;
                    } else {
                        materialDialog.progressMinMax.setVisibility(8);
                    }
                } else {
                    builder.showMinMax = false;
                }
            }
        }
        if ((materialDialog = materialDialog.progressBar) != null) {
            DialogInit.fixCanvasScalingWhenHardwareAccelerated((ProgressBar)materialDialog);
        }
    }
}

