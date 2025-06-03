package com.afollestad.materialdialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnShowListener;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.method.LinkMovementMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.MDAdapter;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import com.afollestad.materialdialogs.internal.MDTintHelper;
import com.afollestad.materialdialogs.util.DialogUtils;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable;
import me.zhanghai.android.materialprogressbar.IndeterminateCircularProgressDrawable;
import me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable;

class DialogInit
{
  private static void fixCanvasScalingWhenHardwareAccelerated(ProgressBar paramProgressBar) {}
  
  @LayoutRes
  public static int getInflateLayout(MaterialDialog.Builder paramBuilder)
  {
    if (customView != null) {
      return R.layout.md_dialog_custom;
    }
    if ((items == null) && (adapter == null))
    {
      if (progress > -2) {
        return R.layout.md_dialog_progress;
      }
      if (indeterminateProgress)
      {
        if (indeterminateIsHorizontalProgress) {
          return R.layout.md_dialog_progress_indeterminate_horizontal;
        }
        return R.layout.md_dialog_progress_indeterminate;
      }
      if (inputCallback != null)
      {
        if (checkBoxPrompt != null) {
          return R.layout.md_dialog_input_check;
        }
        return R.layout.md_dialog_input;
      }
      if (checkBoxPrompt != null) {
        return R.layout.md_dialog_basic_check;
      }
      return R.layout.md_dialog_basic;
    }
    if (checkBoxPrompt != null) {
      return R.layout.md_dialog_list_check;
    }
    return R.layout.md_dialog_list;
  }
  
  @StyleRes
  public static int getTheme(@NonNull MaterialDialog.Builder paramBuilder)
  {
    Context localContext = context;
    int i = R.attr.md_dark_theme;
    Theme localTheme1 = theme;
    Theme localTheme2 = Theme.DARK;
    if (localTheme1 == localTheme2) {
      bool = true;
    } else {
      bool = false;
    }
    boolean bool = DialogUtils.resolveBoolean(localContext, i, bool);
    if (!bool) {
      localTheme2 = Theme.LIGHT;
    }
    theme = localTheme2;
    if (bool) {
      i = R.style.MD_Dark;
    } else {
      i = R.style.MD_Light;
    }
    return i;
  }
  
  @UiThread
  public static void init(MaterialDialog paramMaterialDialog)
  {
    MaterialDialog.Builder localBuilder = builder;
    paramMaterialDialog.setCancelable(cancelable);
    paramMaterialDialog.setCanceledOnTouchOutside(canceledOnTouchOutside);
    if (backgroundColor == 0) {
      backgroundColor = DialogUtils.resolveColor(context, R.attr.md_background_color, DialogUtils.resolveColor(paramMaterialDialog.getContext(), R.attr.colorBackgroundFloating));
    }
    if (backgroundColor != 0)
    {
      localObject1 = new GradientDrawable();
      ((GradientDrawable)localObject1).setCornerRadius(context.getResources().getDimension(R.dimen.md_bg_corner_radius));
      ((GradientDrawable)localObject1).setColor(backgroundColor);
      paramMaterialDialog.getWindow().setBackgroundDrawable((Drawable)localObject1);
    }
    if (!positiveColorSet) {
      positiveColor = DialogUtils.resolveActionTextColorStateList(context, R.attr.md_positive_color, positiveColor);
    }
    if (!neutralColorSet) {
      neutralColor = DialogUtils.resolveActionTextColorStateList(context, R.attr.md_neutral_color, neutralColor);
    }
    if (!negativeColorSet) {
      negativeColor = DialogUtils.resolveActionTextColorStateList(context, R.attr.md_negative_color, negativeColor);
    }
    if (!widgetColorSet) {
      widgetColor = DialogUtils.resolveColor(context, R.attr.md_widget_color, widgetColor);
    }
    if (!titleColorSet)
    {
      i = DialogUtils.resolveColor(paramMaterialDialog.getContext(), 16842806);
      titleColor = DialogUtils.resolveColor(context, R.attr.md_title_color, i);
    }
    if (!contentColorSet)
    {
      i = DialogUtils.resolveColor(paramMaterialDialog.getContext(), 16842808);
      contentColor = DialogUtils.resolveColor(context, R.attr.md_content_color, i);
    }
    if (!itemColorSet) {
      itemColor = DialogUtils.resolveColor(context, R.attr.md_item_color, contentColor);
    }
    title = ((TextView)view.findViewById(R.id.md_title));
    icon = ((ImageView)view.findViewById(R.id.md_icon));
    titleFrame = view.findViewById(R.id.md_titleFrame);
    content = ((TextView)view.findViewById(R.id.md_content));
    recyclerView = ((RecyclerView)view.findViewById(R.id.md_contentRecyclerView));
    checkBoxPrompt = ((CheckBox)view.findViewById(R.id.md_promptCheckbox));
    positiveButton = ((MDButton)view.findViewById(R.id.md_buttonDefaultPositive));
    neutralButton = ((MDButton)view.findViewById(R.id.md_buttonDefaultNeutral));
    negativeButton = ((MDButton)view.findViewById(R.id.md_buttonDefaultNegative));
    if ((inputCallback != null) && (positiveText == null)) {
      positiveText = context.getText(17039370);
    }
    Object localObject1 = positiveButton;
    if (positiveText != null) {
      i = 0;
    } else {
      i = 8;
    }
    ((View)localObject1).setVisibility(i);
    localObject1 = neutralButton;
    if (neutralText != null) {
      i = 0;
    } else {
      i = 8;
    }
    ((View)localObject1).setVisibility(i);
    localObject1 = negativeButton;
    if (negativeText != null) {
      i = 0;
    } else {
      i = 8;
    }
    ((View)localObject1).setVisibility(i);
    positiveButton.setFocusable(true);
    neutralButton.setFocusable(true);
    negativeButton.setFocusable(true);
    if (positiveFocus) {
      positiveButton.requestFocus();
    }
    if (neutralFocus) {
      neutralButton.requestFocus();
    }
    if (negativeFocus) {
      negativeButton.requestFocus();
    }
    if (icon != null)
    {
      icon.setVisibility(0);
      icon.setImageDrawable(icon);
    }
    else
    {
      localObject1 = DialogUtils.resolveDrawable(context, R.attr.md_icon);
      if (localObject1 != null)
      {
        icon.setVisibility(0);
        icon.setImageDrawable((Drawable)localObject1);
      }
      else
      {
        icon.setVisibility(8);
      }
    }
    int j = maxIconSize;
    int i = j;
    if (j == -1) {
      i = DialogUtils.resolveDimension(context, R.attr.md_icon_max_size);
    }
    if ((limitIconToDefaultSize) || (DialogUtils.resolveBoolean(context, R.attr.md_icon_limit_icon_to_default_size))) {
      i = context.getResources().getDimensionPixelSize(R.dimen.md_icon_max_size);
    }
    if (i > -1)
    {
      icon.setAdjustViewBounds(true);
      icon.setMaxHeight(i);
      icon.setMaxWidth(i);
      icon.requestLayout();
    }
    if (!dividerColorSet)
    {
      i = DialogUtils.resolveColor(paramMaterialDialog.getContext(), R.attr.md_divider);
      dividerColor = DialogUtils.resolveColor(context, R.attr.md_divider_color, i);
    }
    view.setDividerColor(dividerColor);
    localObject1 = title;
    if (localObject1 != null)
    {
      paramMaterialDialog.setTypeface((TextView)localObject1, mediumFont);
      title.setTextColor(titleColor);
      title.setGravity(titleGravity.getGravityInt());
      title.setTextAlignment(titleGravity.getTextAlignment());
      localObject1 = title;
      if (localObject1 == null)
      {
        titleFrame.setVisibility(8);
      }
      else
      {
        title.setText((CharSequence)localObject1);
        titleFrame.setVisibility(0);
      }
    }
    localObject1 = content;
    if (localObject1 != null)
    {
      ((TextView)localObject1).setMovementMethod(new LinkMovementMethod());
      paramMaterialDialog.setTypeface(content, regularFont);
      content.setLineSpacing(0.0F, contentLineSpacingMultiplier);
      localObject1 = linkColor;
      if (localObject1 == null) {
        content.setLinkTextColor(DialogUtils.resolveColor(paramMaterialDialog.getContext(), 16842806));
      } else {
        content.setLinkTextColor((ColorStateList)localObject1);
      }
      content.setTextColor(contentColor);
      content.setGravity(contentGravity.getGravityInt());
      content.setTextAlignment(contentGravity.getTextAlignment());
      localObject1 = content;
      if (localObject1 != null)
      {
        content.setText((CharSequence)localObject1);
        content.setVisibility(0);
      }
      else
      {
        content.setVisibility(8);
      }
    }
    localObject1 = checkBoxPrompt;
    if (localObject1 != null)
    {
      ((TextView)localObject1).setText(checkBoxPrompt);
      checkBoxPrompt.setChecked(checkBoxPromptInitiallyChecked);
      checkBoxPrompt.setOnCheckedChangeListener(checkBoxPromptListener);
      paramMaterialDialog.setTypeface(checkBoxPrompt, regularFont);
      checkBoxPrompt.setTextColor(contentColor);
      MDTintHelper.setTint(checkBoxPrompt, widgetColor);
    }
    view.setButtonGravity(buttonsGravity);
    view.setButtonStackedGravity(btnStackedGravity);
    view.setStackingBehavior(stackingBehavior);
    boolean bool1 = DialogUtils.resolveBoolean(context, 16843660, true);
    boolean bool2 = bool1;
    if (bool1) {
      bool2 = DialogUtils.resolveBoolean(context, R.attr.textAllCaps, true);
    }
    localObject1 = positiveButton;
    paramMaterialDialog.setTypeface((TextView)localObject1, mediumFont);
    ((MDButton)localObject1).setAllCapsCompat(bool2);
    ((TextView)localObject1).setText(positiveText);
    ((TextView)localObject1).setTextColor(positiveColor);
    localObject1 = positiveButton;
    Object localObject2 = DialogAction.POSITIVE;
    ((MDButton)localObject1).setStackedSelector(paramMaterialDialog.getButtonSelector((DialogAction)localObject2, true));
    positiveButton.setDefaultSelector(paramMaterialDialog.getButtonSelector((DialogAction)localObject2, false));
    positiveButton.setTag(localObject2);
    positiveButton.setOnClickListener(paramMaterialDialog);
    positiveButton.setVisibility(0);
    localObject1 = negativeButton;
    paramMaterialDialog.setTypeface((TextView)localObject1, mediumFont);
    ((MDButton)localObject1).setAllCapsCompat(bool2);
    ((TextView)localObject1).setText(negativeText);
    ((TextView)localObject1).setTextColor(negativeColor);
    localObject2 = negativeButton;
    localObject1 = DialogAction.NEGATIVE;
    ((MDButton)localObject2).setStackedSelector(paramMaterialDialog.getButtonSelector((DialogAction)localObject1, true));
    negativeButton.setDefaultSelector(paramMaterialDialog.getButtonSelector((DialogAction)localObject1, false));
    negativeButton.setTag(localObject1);
    negativeButton.setOnClickListener(paramMaterialDialog);
    negativeButton.setVisibility(0);
    localObject1 = neutralButton;
    paramMaterialDialog.setTypeface((TextView)localObject1, mediumFont);
    ((MDButton)localObject1).setAllCapsCompat(bool2);
    ((TextView)localObject1).setText(neutralText);
    ((TextView)localObject1).setTextColor(neutralColor);
    localObject1 = neutralButton;
    localObject2 = DialogAction.NEUTRAL;
    ((MDButton)localObject1).setStackedSelector(paramMaterialDialog.getButtonSelector((DialogAction)localObject2, true));
    neutralButton.setDefaultSelector(paramMaterialDialog.getButtonSelector((DialogAction)localObject2, false));
    neutralButton.setTag(localObject2);
    neutralButton.setOnClickListener(paramMaterialDialog);
    neutralButton.setVisibility(0);
    if (listCallbackMultiChoice != null) {
      selectedIndicesList = new ArrayList();
    }
    if (recyclerView != null)
    {
      localObject1 = adapter;
      if (localObject1 == null)
      {
        if (listCallbackSingleChoice != null)
        {
          listType = MaterialDialog.ListType.SINGLE;
        }
        else if (listCallbackMultiChoice != null)
        {
          listType = MaterialDialog.ListType.MULTI;
          if (selectedIndices != null)
          {
            selectedIndicesList = new ArrayList(Arrays.asList(selectedIndices));
            selectedIndices = null;
          }
        }
        else
        {
          listType = MaterialDialog.ListType.REGULAR;
        }
        adapter = new DefaultRvAdapter(paramMaterialDialog, MaterialDialog.ListType.getLayoutForType(listType));
      }
      else if ((localObject1 instanceof MDAdapter))
      {
        ((MDAdapter)localObject1).setDialog(paramMaterialDialog);
      }
    }
    setupProgressDialog(paramMaterialDialog);
    setupInputDialog(paramMaterialDialog);
    if (customView != null)
    {
      ((MDRootLayout)view.findViewById(R.id.md_root)).noTitleNoPadding();
      FrameLayout localFrameLayout = (FrameLayout)view.findViewById(R.id.md_customViewFrame);
      customViewFrame = localFrameLayout;
      localObject2 = customView;
      if (((View)localObject2).getParent() != null) {
        ((ViewGroup)((View)localObject2).getParent()).removeView((View)localObject2);
      }
      localObject1 = localObject2;
      if (wrapCustomViewInScroll)
      {
        Resources localResources = paramMaterialDialog.getContext().getResources();
        j = localResources.getDimensionPixelSize(R.dimen.md_dialog_frame_margin);
        localObject1 = new ScrollView(paramMaterialDialog.getContext());
        i = localResources.getDimensionPixelSize(R.dimen.md_content_padding_top);
        k = localResources.getDimensionPixelSize(R.dimen.md_content_padding_bottom);
        ((ViewGroup)localObject1).setClipToPadding(false);
        if ((localObject2 instanceof EditText))
        {
          ((View)localObject1).setPadding(j, i, j, k);
        }
        else
        {
          ((View)localObject1).setPadding(0, i, 0, k);
          ((View)localObject2).setPadding(j, 0, j, 0);
        }
        ((ScrollView)localObject1).addView((View)localObject2, new FrameLayout.LayoutParams(-1, -2));
      }
      localFrameLayout.addView((View)localObject1, new ViewGroup.LayoutParams(-1, -2));
    }
    localObject1 = showListener;
    if (localObject1 != null) {
      paramMaterialDialog.setOnShowListener((DialogInterface.OnShowListener)localObject1);
    }
    localObject1 = cancelListener;
    if (localObject1 != null) {
      paramMaterialDialog.setOnCancelListener((DialogInterface.OnCancelListener)localObject1);
    }
    localObject1 = dismissListener;
    if (localObject1 != null) {
      paramMaterialDialog.setOnDismissListener((DialogInterface.OnDismissListener)localObject1);
    }
    localObject1 = keyListener;
    if (localObject1 != null) {
      paramMaterialDialog.setOnKeyListener((DialogInterface.OnKeyListener)localObject1);
    }
    paramMaterialDialog.setOnShowListenerInternal();
    paramMaterialDialog.invalidateList();
    paramMaterialDialog.setViewInternal(view);
    paramMaterialDialog.checkIfListInitScroll();
    localObject2 = paramMaterialDialog.getWindow().getWindowManager().getDefaultDisplay();
    localObject1 = new Point();
    ((Display)localObject2).getSize((Point)localObject1);
    int k = x;
    int m = y;
    j = context.getResources().getDimensionPixelSize(R.dimen.md_dialog_vertical_margin);
    i = context.getResources().getDimensionPixelSize(R.dimen.md_dialog_horizontal_margin);
    int n = context.getResources().getDimensionPixelSize(R.dimen.md_dialog_max_width);
    view.setMaxHeight(m - j * 2);
    localObject1 = new WindowManager.LayoutParams();
    ((WindowManager.LayoutParams)localObject1).copyFrom(paramMaterialDialog.getWindow().getAttributes());
    width = Math.min(n, k - i * 2);
    paramMaterialDialog.getWindow().setAttributes((WindowManager.LayoutParams)localObject1);
  }
  
  private static void setupInputDialog(MaterialDialog paramMaterialDialog)
  {
    MaterialDialog.Builder localBuilder = builder;
    Object localObject = (EditText)view.findViewById(16908297);
    input = ((EditText)localObject);
    if (localObject == null) {
      return;
    }
    paramMaterialDialog.setTypeface((TextView)localObject, regularFont);
    localObject = inputPrefill;
    if (localObject != null) {
      input.setText((CharSequence)localObject);
    }
    paramMaterialDialog.setInternalInputCallback();
    input.setHint(inputHint);
    input.setSingleLine();
    input.setTextColor(contentColor);
    input.setHintTextColor(DialogUtils.adjustAlpha(contentColor, 0.3F));
    MDTintHelper.setTint(input, builder.widgetColor);
    int i = inputType;
    if (i != -1)
    {
      input.setInputType(i);
      i = inputType;
      if ((i != 144) && ((i & 0x80) == 128)) {
        input.setTransformationMethod(PasswordTransformationMethod.getInstance());
      }
    }
    localObject = (TextView)view.findViewById(R.id.md_minMax);
    inputMinMax = ((TextView)localObject);
    if ((inputMinLength <= 0) && (inputMaxLength <= -1))
    {
      ((View)localObject).setVisibility(8);
      inputMinMax = null;
    }
    else
    {
      paramMaterialDialog.invalidateInputMinMaxIndicator(input.getText().toString().length(), inputAllowEmpty ^ true);
    }
  }
  
  private static void setupProgressDialog(MaterialDialog paramMaterialDialog)
  {
    Object localObject1 = builder;
    if ((indeterminateProgress) || (progress > -2))
    {
      Object localObject2 = (ProgressBar)view.findViewById(16908301);
      progressBar = ((ProgressBar)localObject2);
      if (localObject2 == null) {
        return;
      }
      if (indeterminateProgress)
      {
        if (indeterminateIsHorizontalProgress)
        {
          localObject2 = new IndeterminateHorizontalProgressDrawable(((MaterialDialog.Builder)localObject1).getContext());
          ((IndeterminateHorizontalProgressDrawable)localObject2).setTint(widgetColor);
          progressBar.setProgressDrawable((Drawable)localObject2);
          progressBar.setIndeterminateDrawable((Drawable)localObject2);
        }
        else
        {
          localObject2 = new IndeterminateCircularProgressDrawable(((MaterialDialog.Builder)localObject1).getContext());
          ((IndeterminateCircularProgressDrawable)localObject2).setTint(widgetColor);
          progressBar.setProgressDrawable((Drawable)localObject2);
          progressBar.setIndeterminateDrawable((Drawable)localObject2);
        }
      }
      else
      {
        localObject2 = new HorizontalProgressDrawable(((MaterialDialog.Builder)localObject1).getContext());
        ((HorizontalProgressDrawable)localObject2).setTint(widgetColor);
        progressBar.setProgressDrawable((Drawable)localObject2);
        progressBar.setIndeterminateDrawable((Drawable)localObject2);
      }
      boolean bool = indeterminateProgress;
      if ((!bool) || (indeterminateIsHorizontalProgress))
      {
        localObject2 = progressBar;
        if ((bool) && (indeterminateIsHorizontalProgress)) {
          bool = true;
        } else {
          bool = false;
        }
        ((ProgressBar)localObject2).setIndeterminate(bool);
        progressBar.setProgress(0);
        progressBar.setMax(progressMax);
        localObject2 = (TextView)view.findViewById(R.id.md_label);
        progressLabel = ((TextView)localObject2);
        if (localObject2 != null)
        {
          ((TextView)localObject2).setTextColor(contentColor);
          paramMaterialDialog.setTypeface(progressLabel, mediumFont);
          progressLabel.setText(progressPercentFormat.format(0L));
        }
        localObject2 = (TextView)view.findViewById(R.id.md_minMax);
        progressMinMax = ((TextView)localObject2);
        if (localObject2 != null)
        {
          ((TextView)localObject2).setTextColor(contentColor);
          paramMaterialDialog.setTypeface(progressMinMax, regularFont);
          if (showMinMax)
          {
            progressMinMax.setVisibility(0);
            progressMinMax.setText(String.format(progressNumberFormat, new Object[] { Integer.valueOf(0), Integer.valueOf(progressMax) }));
            localObject1 = (ViewGroup.MarginLayoutParams)progressBar.getLayoutParams();
            leftMargin = 0;
            rightMargin = 0;
          }
          else
          {
            progressMinMax.setVisibility(8);
          }
        }
        else
        {
          showMinMax = false;
        }
      }
    }
    paramMaterialDialog = progressBar;
    if (paramMaterialDialog != null) {
      fixCanvasScalingWhenHardwareAccelerated(paramMaterialDialog);
    }
  }
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.DialogInit
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */