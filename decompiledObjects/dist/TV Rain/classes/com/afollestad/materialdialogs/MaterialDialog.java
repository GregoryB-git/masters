package com.afollestad.materialdialogs;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnShowListener;
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
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager.BadTokenException;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
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
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
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
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import z2;

public class MaterialDialog
  extends DialogBase
  implements View.OnClickListener, DefaultRvAdapter.InternalListCallback
{
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
  
  @SuppressLint({"InflateParams"})
  public MaterialDialog(Builder paramBuilder)
  {
    super(context, DialogInit.getTheme(paramBuilder));
    builder = paramBuilder;
    view = ((MDRootLayout)LayoutInflater.from(context).inflate(DialogInit.getInflateLayout(paramBuilder), null));
    DialogInit.init(this);
  }
  
  private boolean sendMultiChoiceCallback()
  {
    if (builder.listCallbackMultiChoice == null) {
      return false;
    }
    Collections.sort(selectedIndicesList);
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = selectedIndicesList.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Integer)((Iterator)localObject1).next();
      if ((((Integer)localObject2).intValue() >= 0) && (((Integer)localObject2).intValue() <= builder.items.size() - 1)) {
        localArrayList.add(builder.items.get(((Integer)localObject2).intValue()));
      }
    }
    localObject1 = builder.listCallbackMultiChoice;
    Object localObject2 = selectedIndicesList;
    return ((ListCallbackMultiChoice)localObject1).onSelection(this, (Integer[])((List)localObject2).toArray(new Integer[((List)localObject2).size()]), (CharSequence[])localArrayList.toArray(new CharSequence[localArrayList.size()]));
  }
  
  private boolean sendSingleChoiceCallback(View paramView)
  {
    Builder localBuilder1 = builder;
    if (listCallbackSingleChoice == null) {
      return false;
    }
    Builder localBuilder2 = null;
    int i = selectedIndex;
    Object localObject = localBuilder2;
    if (i >= 0)
    {
      localObject = localBuilder2;
      if (i < items.size())
      {
        localObject = builder;
        localObject = (CharSequence)items.get(selectedIndex);
      }
    }
    localBuilder2 = builder;
    return listCallbackSingleChoice.onSelection(this, paramView, selectedIndex, (CharSequence)localObject);
  }
  
  public final void checkIfListInitScroll()
  {
    RecyclerView localRecyclerView = recyclerView;
    if (localRecyclerView == null) {
      return;
    }
    localRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
    {
      public void onGlobalLayout()
      {
        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        Object localObject = MaterialDialog.this;
        MaterialDialog.ListType localListType1 = listType;
        MaterialDialog.ListType localListType2 = MaterialDialog.ListType.SINGLE;
        if ((localListType1 == localListType2) || (localListType1 == MaterialDialog.ListType.MULTI))
        {
          final int j;
          if (localListType1 == localListType2)
          {
            int i = builder.selectedIndex;
            j = i;
            if (i >= 0) {}
          }
          else
          {
            localObject = selectedIndicesList;
            if ((localObject == null) || (((List)localObject).size() == 0)) {
              return;
            }
            Collections.sort(selectedIndicesList);
            j = ((Integer)selectedIndicesList.get(0)).intValue();
          }
          recyclerView.post(new Runnable()
          {
            public void run()
            {
              recyclerView.requestFocus();
              builder.layoutManager.scrollToPosition(j);
            }
          });
        }
      }
    });
  }
  
  public void clearSelectedIndices()
  {
    clearSelectedIndices(true);
  }
  
  public void clearSelectedIndices(boolean paramBoolean)
  {
    Object localObject = listType;
    if ((localObject != null) && (localObject == ListType.MULTI))
    {
      localObject = builder.adapter;
      if ((localObject != null) && ((localObject instanceof DefaultRvAdapter)))
      {
        localObject = selectedIndicesList;
        if (localObject != null) {
          ((List)localObject).clear();
        }
        builder.adapter.notifyDataSetChanged();
        if ((paramBoolean) && (builder.listCallbackMultiChoice != null)) {
          sendMultiChoiceCallback();
        }
        return;
      }
      throw new IllegalStateException("You can only use clearSelectedIndices() with the default adapter implementation.");
    }
    throw new IllegalStateException("You can only use clearSelectedIndices() with multi choice list dialogs.");
  }
  
  public void dismiss()
  {
    if (input != null) {
      DialogUtils.hideKeyboard(this, builder);
    }
    super.dismiss();
  }
  
  public final MDButton getActionButton(@NonNull DialogAction paramDialogAction)
  {
    int i = 4.$SwitchMap$com$afollestad$materialdialogs$DialogAction[paramDialogAction.ordinal()];
    if (i != 1)
    {
      if (i != 2) {
        return positiveButton;
      }
      return negativeButton;
    }
    return neutralButton;
  }
  
  public final Builder getBuilder()
  {
    return builder;
  }
  
  public Drawable getButtonSelector(DialogAction paramDialogAction, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramDialogAction = builder;
      if (btnSelectorStacked != 0) {
        return ResourcesCompat.getDrawable(context.getResources(), builder.btnSelectorStacked, null);
      }
      paramDialogAction = context;
      i = R.attr.md_btn_stacked_selector;
      paramDialogAction = DialogUtils.resolveDrawable(paramDialogAction, i);
      if (paramDialogAction != null) {
        return paramDialogAction;
      }
      return DialogUtils.resolveDrawable(getContext(), i);
    }
    int i = 4.$SwitchMap$com$afollestad$materialdialogs$DialogAction[paramDialogAction.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        paramDialogAction = builder;
        if (btnSelectorPositive != 0) {
          return ResourcesCompat.getDrawable(context.getResources(), builder.btnSelectorPositive, null);
        }
        paramDialogAction = context;
        i = R.attr.md_btn_positive_selector;
        paramDialogAction = DialogUtils.resolveDrawable(paramDialogAction, i);
        if (paramDialogAction != null) {
          return paramDialogAction;
        }
        paramDialogAction = DialogUtils.resolveDrawable(getContext(), i);
        RippleHelper.applyColor(paramDialogAction, builder.buttonRippleColor);
        return paramDialogAction;
      }
      paramDialogAction = builder;
      if (btnSelectorNegative != 0) {
        return ResourcesCompat.getDrawable(context.getResources(), builder.btnSelectorNegative, null);
      }
      paramDialogAction = context;
      i = R.attr.md_btn_negative_selector;
      paramDialogAction = DialogUtils.resolveDrawable(paramDialogAction, i);
      if (paramDialogAction != null) {
        return paramDialogAction;
      }
      paramDialogAction = DialogUtils.resolveDrawable(getContext(), i);
      RippleHelper.applyColor(paramDialogAction, builder.buttonRippleColor);
      return paramDialogAction;
    }
    paramDialogAction = builder;
    if (btnSelectorNeutral != 0) {
      return ResourcesCompat.getDrawable(context.getResources(), builder.btnSelectorNeutral, null);
    }
    paramDialogAction = context;
    i = R.attr.md_btn_neutral_selector;
    paramDialogAction = DialogUtils.resolveDrawable(paramDialogAction, i);
    if (paramDialogAction != null) {
      return paramDialogAction;
    }
    paramDialogAction = DialogUtils.resolveDrawable(getContext(), i);
    RippleHelper.applyColor(paramDialogAction, builder.buttonRippleColor);
    return paramDialogAction;
  }
  
  @Nullable
  public final TextView getContentView()
  {
    return content;
  }
  
  public final int getCurrentProgress()
  {
    ProgressBar localProgressBar = progressBar;
    if (localProgressBar == null) {
      return -1;
    }
    return localProgressBar.getProgress();
  }
  
  @Nullable
  public final View getCustomView()
  {
    return builder.customView;
  }
  
  public ImageView getIconView()
  {
    return icon;
  }
  
  @Nullable
  public final EditText getInputEditText()
  {
    return input;
  }
  
  @Nullable
  public final ArrayList<CharSequence> getItems()
  {
    return builder.items;
  }
  
  public final Drawable getListSelector()
  {
    Object localObject = builder;
    if (listSelector != 0) {
      return ResourcesCompat.getDrawable(context.getResources(), builder.listSelector, null);
    }
    localObject = context;
    int i = R.attr.md_list_selector;
    localObject = DialogUtils.resolveDrawable((Context)localObject, i);
    if (localObject != null) {
      return (Drawable)localObject;
    }
    return DialogUtils.resolveDrawable(getContext(), i);
  }
  
  public final int getMaxProgress()
  {
    ProgressBar localProgressBar = progressBar;
    if (localProgressBar == null) {
      return -1;
    }
    return localProgressBar.getMax();
  }
  
  public ProgressBar getProgressBar()
  {
    return progressBar;
  }
  
  public RecyclerView getRecyclerView()
  {
    return recyclerView;
  }
  
  public int getSelectedIndex()
  {
    Builder localBuilder = builder;
    if (listCallbackSingleChoice != null) {
      return selectedIndex;
    }
    return -1;
  }
  
  @Nullable
  public Integer[] getSelectedIndices()
  {
    if (builder.listCallbackMultiChoice != null)
    {
      List localList = selectedIndicesList;
      return (Integer[])localList.toArray(new Integer[localList.size()]);
    }
    return null;
  }
  
  @Nullable
  public Object getTag()
  {
    return builder.tag;
  }
  
  public final TextView getTitleView()
  {
    return title;
  }
  
  public final View getView()
  {
    return view;
  }
  
  public final boolean hasActionButtons()
  {
    boolean bool;
    if (numberOfActionButtons() > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void incrementProgress(int paramInt)
  {
    setProgress(getCurrentProgress() + paramInt);
  }
  
  public void invalidateInputMinMaxIndicator(int paramInt, boolean paramBoolean)
  {
    Object localObject = inputMinMax;
    if (localObject != null)
    {
      int i = builder.inputMaxLength;
      int j = 0;
      if (i > 0)
      {
        ((TextView)localObject).setText(String.format(Locale.getDefault(), "%d/%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(builder.inputMaxLength) }));
        inputMinMax.setVisibility(0);
      }
      else
      {
        ((View)localObject).setVisibility(8);
      }
      if ((!paramBoolean) || (paramInt != 0))
      {
        localObject = builder;
        i = inputMaxLength;
        if (((i <= 0) || (paramInt <= i)) && (paramInt >= inputMinLength)) {}
      }
      else
      {
        j = 1;
      }
      localObject = builder;
      if (j != 0) {
        paramInt = inputRangeErrorColor;
      } else {
        paramInt = contentColor;
      }
      localObject = builder;
      if (j != 0) {
        i = inputRangeErrorColor;
      } else {
        i = widgetColor;
      }
      if (builder.inputMaxLength > 0) {
        inputMinMax.setTextColor(paramInt);
      }
      MDTintHelper.setTint(input, i);
      getActionButton(DialogAction.POSITIVE).setEnabled(j ^ 0x1);
    }
  }
  
  public final void invalidateList()
  {
    if (recyclerView == null) {
      return;
    }
    Object localObject = builder.items;
    if (((localObject == null) || (((ArrayList)localObject).size() == 0)) && (builder.adapter == null)) {
      return;
    }
    localObject = builder;
    if (layoutManager == null) {
      layoutManager = new LinearLayoutManager(getContext());
    }
    if (recyclerView.getLayoutManager() == null) {
      recyclerView.setLayoutManager(builder.layoutManager);
    }
    recyclerView.setAdapter(builder.adapter);
    if (listType != null) {
      ((DefaultRvAdapter)builder.adapter).setCallback(this);
    }
  }
  
  public final boolean isCancelled()
  {
    return isShowing() ^ true;
  }
  
  public final boolean isIndeterminateProgress()
  {
    return builder.indeterminateProgress;
  }
  
  public boolean isPromptCheckBoxChecked()
  {
    CheckBox localCheckBox = checkBoxPrompt;
    boolean bool;
    if ((localCheckBox != null) && (localCheckBox.isChecked())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @UiThread
  public final void notifyItemChanged(@IntRange(from=0L, to=2147483647L) int paramInt)
  {
    builder.adapter.notifyItemChanged(paramInt);
  }
  
  @UiThread
  public final void notifyItemInserted(@IntRange(from=0L, to=2147483647L) int paramInt)
  {
    builder.adapter.notifyItemInserted(paramInt);
  }
  
  @UiThread
  public final void notifyItemsChanged()
  {
    builder.adapter.notifyDataSetChanged();
  }
  
  public final int numberOfActionButtons()
  {
    if ((builder.positiveText != null) && (positiveButton.getVisibility() == 0)) {
      i = 1;
    } else {
      i = 0;
    }
    int j = i;
    if (builder.neutralText != null)
    {
      j = i;
      if (neutralButton.getVisibility() == 0) {
        j = i + 1;
      }
    }
    int i = j;
    if (builder.negativeText != null)
    {
      i = j;
      if (negativeButton.getVisibility() == 0) {
        i = j + 1;
      }
    }
    return i;
  }
  
  public final void onClick(View paramView)
  {
    DialogAction localDialogAction = (DialogAction)paramView.getTag();
    int i = 4.$SwitchMap$com$afollestad$materialdialogs$DialogAction[localDialogAction.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3)
        {
          Object localObject = builder.callback;
          if (localObject != null)
          {
            ((ButtonCallback)localObject).onAny(this);
            builder.callback.onPositive(this);
          }
          localObject = builder.onPositiveCallback;
          if (localObject != null) {
            ((SingleButtonCallback)localObject).onClick(this, localDialogAction);
          }
          if (!builder.alwaysCallSingleChoiceCallback) {
            sendSingleChoiceCallback(paramView);
          }
          if (!builder.alwaysCallMultiChoiceCallback) {
            sendMultiChoiceCallback();
          }
          localObject = builder;
          InputCallback localInputCallback = inputCallback;
          if (localInputCallback != null)
          {
            paramView = input;
            if ((paramView != null) && (!alwaysCallInputCallback)) {
              localInputCallback.onInput(this, paramView.getText());
            }
          }
          if (builder.autoDismiss) {
            dismiss();
          }
        }
      }
      else
      {
        paramView = builder.callback;
        if (paramView != null)
        {
          paramView.onAny(this);
          builder.callback.onNegative(this);
        }
        paramView = builder.onNegativeCallback;
        if (paramView != null) {
          paramView.onClick(this, localDialogAction);
        }
        if (builder.autoDismiss) {
          cancel();
        }
      }
    }
    else
    {
      paramView = builder.callback;
      if (paramView != null)
      {
        paramView.onAny(this);
        builder.callback.onNeutral(this);
      }
      paramView = builder.onNeutralCallback;
      if (paramView != null) {
        paramView.onClick(this, localDialogAction);
      }
      if (builder.autoDismiss) {
        dismiss();
      }
    }
    paramView = builder.onAnyCallback;
    if (paramView != null) {
      paramView.onClick(this, localDialogAction);
    }
  }
  
  public boolean onItemSelected(MaterialDialog paramMaterialDialog, View paramView, int paramInt, CharSequence paramCharSequence, boolean paramBoolean)
  {
    boolean bool1 = paramView.isEnabled();
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramMaterialDialog = listType;
    if ((paramMaterialDialog != null) && (paramMaterialDialog != ListType.REGULAR))
    {
      if (paramMaterialDialog == ListType.MULTI)
      {
        paramMaterialDialog = (CheckBox)paramView.findViewById(R.id.md_control);
        if (!paramMaterialDialog.isEnabled()) {
          return false;
        }
        if ((selectedIndicesList.contains(Integer.valueOf(paramInt)) ^ true))
        {
          selectedIndicesList.add(Integer.valueOf(paramInt));
          if (builder.alwaysCallMultiChoiceCallback)
          {
            if (sendMultiChoiceCallback()) {
              paramMaterialDialog.setChecked(true);
            } else {
              selectedIndicesList.remove(Integer.valueOf(paramInt));
            }
          }
          else {
            paramMaterialDialog.setChecked(true);
          }
        }
        else
        {
          selectedIndicesList.remove(Integer.valueOf(paramInt));
          if (builder.alwaysCallMultiChoiceCallback)
          {
            if (sendMultiChoiceCallback()) {
              paramMaterialDialog.setChecked(false);
            } else {
              selectedIndicesList.add(Integer.valueOf(paramInt));
            }
          }
          else {
            paramMaterialDialog.setChecked(false);
          }
        }
      }
      else if (paramMaterialDialog == ListType.SINGLE)
      {
        paramMaterialDialog = (RadioButton)paramView.findViewById(R.id.md_control);
        if (!paramMaterialDialog.isEnabled()) {
          return false;
        }
        paramCharSequence = builder;
        int i = selectedIndex;
        if ((autoDismiss) && (positiveText == null))
        {
          dismiss();
          builder.selectedIndex = paramInt;
          sendSingleChoiceCallback(paramView);
          paramBoolean = bool2;
        }
        else if (alwaysCallSingleChoiceCallback)
        {
          selectedIndex = paramInt;
          paramBoolean = sendSingleChoiceCallback(paramView);
          builder.selectedIndex = i;
        }
        else
        {
          paramBoolean = true;
        }
        if (paramBoolean)
        {
          builder.selectedIndex = paramInt;
          paramMaterialDialog.setChecked(true);
          builder.adapter.notifyItemChanged(i);
          builder.adapter.notifyItemChanged(paramInt);
        }
      }
    }
    else
    {
      if (builder.autoDismiss) {
        dismiss();
      }
      if (!paramBoolean)
      {
        paramMaterialDialog = builder;
        paramCharSequence = listCallback;
        if (paramCharSequence != null) {
          paramCharSequence.onSelection(this, paramView, paramInt, (CharSequence)items.get(paramInt));
        }
      }
      if (paramBoolean)
      {
        paramCharSequence = builder;
        paramMaterialDialog = listLongCallback;
        if (paramMaterialDialog != null) {
          return paramMaterialDialog.onLongSelection(this, paramView, paramInt, (CharSequence)items.get(paramInt));
        }
      }
    }
    return true;
  }
  
  public final void onShow(DialogInterface paramDialogInterface)
  {
    if (input != null)
    {
      DialogUtils.showKeyboard(this, builder);
      if (input.getText().length() > 0)
      {
        EditText localEditText = input;
        localEditText.setSelection(localEditText.getText().length());
      }
    }
    super.onShow(paramDialogInterface);
  }
  
  public void selectAllIndices()
  {
    selectAllIndices(true);
  }
  
  public void selectAllIndices(boolean paramBoolean)
  {
    Object localObject = listType;
    if ((localObject != null) && (localObject == ListType.MULTI))
    {
      localObject = builder.adapter;
      if ((localObject != null) && ((localObject instanceof DefaultRvAdapter)))
      {
        if (selectedIndicesList == null) {
          selectedIndicesList = new ArrayList();
        }
        for (int i = 0; i < builder.adapter.getItemCount(); i++) {
          if (!selectedIndicesList.contains(Integer.valueOf(i))) {
            selectedIndicesList.add(Integer.valueOf(i));
          }
        }
        builder.adapter.notifyDataSetChanged();
        if ((paramBoolean) && (builder.listCallbackMultiChoice != null)) {
          sendMultiChoiceCallback();
        }
        return;
      }
      throw new IllegalStateException("You can only use selectAllIndices() with the default adapter implementation.");
    }
    throw new IllegalStateException("You can only use selectAllIndices() with multi choice list dialogs.");
  }
  
  public final void setActionButton(DialogAction paramDialogAction, @StringRes int paramInt)
  {
    setActionButton(paramDialogAction, getContext().getText(paramInt));
  }
  
  @UiThread
  public final void setActionButton(@NonNull DialogAction paramDialogAction, CharSequence paramCharSequence)
  {
    int i = 4.$SwitchMap$com$afollestad$materialdialogs$DialogAction[paramDialogAction.ordinal()];
    int j = 8;
    if (i != 1)
    {
      if (i != 2)
      {
        builder.positiveText = paramCharSequence;
        positiveButton.setText(paramCharSequence);
        paramDialogAction = positiveButton;
        if (paramCharSequence != null) {
          j = 0;
        }
        paramDialogAction.setVisibility(j);
      }
      else
      {
        builder.negativeText = paramCharSequence;
        negativeButton.setText(paramCharSequence);
        paramDialogAction = negativeButton;
        if (paramCharSequence != null) {
          j = 0;
        }
        paramDialogAction.setVisibility(j);
      }
    }
    else
    {
      builder.neutralText = paramCharSequence;
      neutralButton.setText(paramCharSequence);
      paramDialogAction = neutralButton;
      if (paramCharSequence != null) {
        j = 0;
      }
      paramDialogAction.setVisibility(j);
    }
  }
  
  @UiThread
  public final void setContent(@StringRes int paramInt)
  {
    setContent(builder.context.getString(paramInt));
  }
  
  @UiThread
  public final void setContent(@StringRes int paramInt, @Nullable Object... paramVarArgs)
  {
    setContent(builder.context.getString(paramInt, paramVarArgs));
  }
  
  @UiThread
  public final void setContent(CharSequence paramCharSequence)
  {
    content.setText(paramCharSequence);
    TextView localTextView = content;
    int i;
    if (TextUtils.isEmpty(paramCharSequence)) {
      i = 8;
    } else {
      i = 0;
    }
    localTextView.setVisibility(i);
  }
  
  @UiThread
  public void setIcon(@DrawableRes int paramInt)
  {
    icon.setImageResource(paramInt);
    ImageView localImageView = icon;
    if (paramInt != 0) {
      paramInt = 0;
    } else {
      paramInt = 8;
    }
    localImageView.setVisibility(paramInt);
  }
  
  @UiThread
  public void setIcon(Drawable paramDrawable)
  {
    icon.setImageDrawable(paramDrawable);
    ImageView localImageView = icon;
    int i;
    if (paramDrawable != null) {
      i = 0;
    } else {
      i = 8;
    }
    localImageView.setVisibility(i);
  }
  
  @UiThread
  public void setIconAttribute(@AttrRes int paramInt)
  {
    setIcon(DialogUtils.resolveDrawable(builder.context, paramInt));
  }
  
  public void setInternalInputCallback()
  {
    EditText localEditText = input;
    if (localEditText == null) {
      return;
    }
    localEditText.addTextChangedListener(new TextWatcher()
    {
      public void afterTextChanged(Editable paramAnonymousEditable) {}
      
      public void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
      
      public void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        paramAnonymousInt1 = paramAnonymousCharSequence.toString().length();
        MaterialDialog localMaterialDialog = MaterialDialog.this;
        boolean bool1 = builder.inputAllowEmpty;
        boolean bool2 = false;
        boolean bool3 = false;
        if (!bool1)
        {
          bool2 = bool3;
          if (paramAnonymousInt1 == 0) {
            bool2 = true;
          }
          localMaterialDialog.getActionButton(DialogAction.POSITIVE).setEnabled(bool2 ^ true);
        }
        invalidateInputMinMaxIndicator(paramAnonymousInt1, bool2);
        localMaterialDialog = MaterialDialog.this;
        MaterialDialog.Builder localBuilder = builder;
        if (alwaysCallInputCallback) {
          inputCallback.onInput(localMaterialDialog, paramAnonymousCharSequence);
        }
      }
    });
  }
  
  @UiThread
  public final void setItems(CharSequence... paramVarArgs)
  {
    Builder localBuilder = builder;
    if (adapter != null)
    {
      if (paramVarArgs != null)
      {
        items = new ArrayList(paramVarArgs.length);
        Collections.addAll(builder.items, paramVarArgs);
      }
      else
      {
        items = null;
      }
      if ((builder.adapter instanceof DefaultRvAdapter))
      {
        notifyItemsChanged();
        return;
      }
      throw new IllegalStateException("When using a custom adapter, setItems() cannot be used. Set items through the adapter instead.");
    }
    throw new IllegalStateException("This MaterialDialog instance does not yet have an adapter set to it. You cannot use setItems().");
  }
  
  public final void setMaxProgress(int paramInt)
  {
    if (builder.progress > -2)
    {
      progressBar.setMax(paramInt);
      return;
    }
    throw new IllegalStateException("Cannot use setMaxProgress() on this dialog.");
  }
  
  public final void setProgress(int paramInt)
  {
    if (builder.progress <= -2)
    {
      Log.w("MaterialDialog", "Calling setProgress(int) on an indeterminate progress dialog has no effect!");
      return;
    }
    progressBar.setProgress(paramInt);
    handler.post(new Runnable()
    {
      public void run()
      {
        MaterialDialog localMaterialDialog = MaterialDialog.this;
        TextView localTextView = progressLabel;
        if (localTextView != null) {
          localTextView.setText(builder.progressPercentFormat.format(localMaterialDialog.getCurrentProgress() / getMaxProgress()));
        }
        localMaterialDialog = MaterialDialog.this;
        localTextView = progressMinMax;
        if (localTextView != null) {
          localTextView.setText(String.format(builder.progressNumberFormat, new Object[] { Integer.valueOf(localMaterialDialog.getCurrentProgress()), Integer.valueOf(getMaxProgress()) }));
        }
      }
    });
  }
  
  public final void setProgressNumberFormat(String paramString)
  {
    builder.progressNumberFormat = paramString;
    setProgress(getCurrentProgress());
  }
  
  public final void setProgressPercentFormat(NumberFormat paramNumberFormat)
  {
    builder.progressPercentFormat = paramNumberFormat;
    setProgress(getCurrentProgress());
  }
  
  public void setPromptCheckBoxChecked(boolean paramBoolean)
  {
    CheckBox localCheckBox = checkBoxPrompt;
    if (localCheckBox != null) {
      localCheckBox.setChecked(paramBoolean);
    }
  }
  
  @UiThread
  public void setSelectedIndex(int paramInt)
  {
    Object localObject = builder;
    selectedIndex = paramInt;
    localObject = adapter;
    if ((localObject != null) && ((localObject instanceof DefaultRvAdapter)))
    {
      ((RecyclerView.Adapter)localObject).notifyDataSetChanged();
      return;
    }
    throw new IllegalStateException("You can only use setSelectedIndex() with the default adapter implementation.");
  }
  
  @UiThread
  public void setSelectedIndices(@NonNull Integer[] paramArrayOfInteger)
  {
    selectedIndicesList = new ArrayList(Arrays.asList(paramArrayOfInteger));
    paramArrayOfInteger = builder.adapter;
    if ((paramArrayOfInteger != null) && ((paramArrayOfInteger instanceof DefaultRvAdapter)))
    {
      paramArrayOfInteger.notifyDataSetChanged();
      return;
    }
    throw new IllegalStateException("You can only use setSelectedIndices() with the default adapter implementation.");
  }
  
  @UiThread
  public final void setTitle(@StringRes int paramInt)
  {
    setTitle(builder.context.getString(paramInt));
  }
  
  @UiThread
  public final void setTitle(@StringRes int paramInt, @Nullable Object... paramVarArgs)
  {
    setTitle(builder.context.getString(paramInt, paramVarArgs));
  }
  
  @UiThread
  public final void setTitle(CharSequence paramCharSequence)
  {
    title.setText(paramCharSequence);
  }
  
  public final void setTypeface(TextView paramTextView, Typeface paramTypeface)
  {
    if (paramTypeface == null) {
      return;
    }
    paramTextView.setPaintFlags(paramTextView.getPaintFlags() | 0x80);
    paramTextView.setTypeface(paramTypeface);
  }
  
  @UiThread
  public void show()
  {
    try
    {
      super.show();
      return;
    }
    catch (WindowManager.BadTokenException localBadTokenException)
    {
      throw new DialogException("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
    }
  }
  
  public static class Builder
  {
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
    public MaterialDialog.ButtonCallback callback;
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
    public MaterialDialog.InputCallback inputCallback;
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
    public MaterialDialog.ListCallback listCallback;
    public MaterialDialog.ListCallbackMultiChoice listCallbackMultiChoice;
    public MaterialDialog.ListCallbackSingleChoice listCallbackSingleChoice;
    public MaterialDialog.ListLongCallback listLongCallback;
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
    public MaterialDialog.SingleButtonCallback onAnyCallback;
    public MaterialDialog.SingleButtonCallback onNegativeCallback;
    public MaterialDialog.SingleButtonCallback onNeutralCallback;
    public MaterialDialog.SingleButtonCallback onPositiveCallback;
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
    
    /* Error */
    public Builder(@NonNull Context paramContext)
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 142	java/lang/Object:<init>	()V
      //   4: getstatic 147	com/afollestad/materialdialogs/GravityEnum:START	Lcom/afollestad/materialdialogs/GravityEnum;
      //   7: astore_2
      //   8: aload_0
      //   9: aload_2
      //   10: putfield 149	com/afollestad/materialdialogs/MaterialDialog$Builder:titleGravity	Lcom/afollestad/materialdialogs/GravityEnum;
      //   13: aload_0
      //   14: aload_2
      //   15: putfield 151	com/afollestad/materialdialogs/MaterialDialog$Builder:contentGravity	Lcom/afollestad/materialdialogs/GravityEnum;
      //   18: aload_0
      //   19: getstatic 154	com/afollestad/materialdialogs/GravityEnum:END	Lcom/afollestad/materialdialogs/GravityEnum;
      //   22: putfield 156	com/afollestad/materialdialogs/MaterialDialog$Builder:btnStackedGravity	Lcom/afollestad/materialdialogs/GravityEnum;
      //   25: aload_0
      //   26: aload_2
      //   27: putfield 158	com/afollestad/materialdialogs/MaterialDialog$Builder:itemsGravity	Lcom/afollestad/materialdialogs/GravityEnum;
      //   30: aload_0
      //   31: aload_2
      //   32: putfield 160	com/afollestad/materialdialogs/MaterialDialog$Builder:buttonsGravity	Lcom/afollestad/materialdialogs/GravityEnum;
      //   35: aload_0
      //   36: iconst_0
      //   37: putfield 162	com/afollestad/materialdialogs/MaterialDialog$Builder:buttonRippleColor	I
      //   40: aload_0
      //   41: iconst_m1
      //   42: putfield 164	com/afollestad/materialdialogs/MaterialDialog$Builder:titleColor	I
      //   45: aload_0
      //   46: iconst_m1
      //   47: putfield 166	com/afollestad/materialdialogs/MaterialDialog$Builder:contentColor	I
      //   50: aload_0
      //   51: iconst_0
      //   52: putfield 168	com/afollestad/materialdialogs/MaterialDialog$Builder:alwaysCallMultiChoiceCallback	Z
      //   55: aload_0
      //   56: iconst_0
      //   57: putfield 170	com/afollestad/materialdialogs/MaterialDialog$Builder:alwaysCallSingleChoiceCallback	Z
      //   60: getstatic 175	com/afollestad/materialdialogs/Theme:LIGHT	Lcom/afollestad/materialdialogs/Theme;
      //   63: astore_2
      //   64: aload_0
      //   65: aload_2
      //   66: putfield 177	com/afollestad/materialdialogs/MaterialDialog$Builder:theme	Lcom/afollestad/materialdialogs/Theme;
      //   69: aload_0
      //   70: iconst_1
      //   71: putfield 179	com/afollestad/materialdialogs/MaterialDialog$Builder:cancelable	Z
      //   74: aload_0
      //   75: iconst_1
      //   76: putfield 181	com/afollestad/materialdialogs/MaterialDialog$Builder:canceledOnTouchOutside	Z
      //   79: aload_0
      //   80: ldc -74
      //   82: putfield 184	com/afollestad/materialdialogs/MaterialDialog$Builder:contentLineSpacingMultiplier	F
      //   85: aload_0
      //   86: iconst_m1
      //   87: putfield 186	com/afollestad/materialdialogs/MaterialDialog$Builder:selectedIndex	I
      //   90: aload_0
      //   91: aconst_null
      //   92: putfield 188	com/afollestad/materialdialogs/MaterialDialog$Builder:selectedIndices	[Ljava/lang/Integer;
      //   95: aload_0
      //   96: aconst_null
      //   97: putfield 190	com/afollestad/materialdialogs/MaterialDialog$Builder:disabledIndices	[Ljava/lang/Integer;
      //   100: aload_0
      //   101: iconst_1
      //   102: putfield 192	com/afollestad/materialdialogs/MaterialDialog$Builder:autoDismiss	Z
      //   105: aload_0
      //   106: iconst_m1
      //   107: putfield 194	com/afollestad/materialdialogs/MaterialDialog$Builder:maxIconSize	I
      //   110: aload_0
      //   111: bipush -2
      //   113: putfield 196	com/afollestad/materialdialogs/MaterialDialog$Builder:progress	I
      //   116: aload_0
      //   117: iconst_0
      //   118: putfield 198	com/afollestad/materialdialogs/MaterialDialog$Builder:progressMax	I
      //   121: aload_0
      //   122: iconst_m1
      //   123: putfield 200	com/afollestad/materialdialogs/MaterialDialog$Builder:inputType	I
      //   126: aload_0
      //   127: iconst_m1
      //   128: putfield 202	com/afollestad/materialdialogs/MaterialDialog$Builder:inputMinLength	I
      //   131: aload_0
      //   132: iconst_m1
      //   133: putfield 204	com/afollestad/materialdialogs/MaterialDialog$Builder:inputMaxLength	I
      //   136: aload_0
      //   137: iconst_0
      //   138: putfield 206	com/afollestad/materialdialogs/MaterialDialog$Builder:inputRangeErrorColor	I
      //   141: aload_0
      //   142: iconst_0
      //   143: putfield 208	com/afollestad/materialdialogs/MaterialDialog$Builder:titleColorSet	Z
      //   146: aload_0
      //   147: iconst_0
      //   148: putfield 210	com/afollestad/materialdialogs/MaterialDialog$Builder:contentColorSet	Z
      //   151: aload_0
      //   152: iconst_0
      //   153: putfield 212	com/afollestad/materialdialogs/MaterialDialog$Builder:itemColorSet	Z
      //   156: aload_0
      //   157: iconst_0
      //   158: putfield 214	com/afollestad/materialdialogs/MaterialDialog$Builder:positiveColorSet	Z
      //   161: aload_0
      //   162: iconst_0
      //   163: putfield 216	com/afollestad/materialdialogs/MaterialDialog$Builder:neutralColorSet	Z
      //   166: aload_0
      //   167: iconst_0
      //   168: putfield 218	com/afollestad/materialdialogs/MaterialDialog$Builder:negativeColorSet	Z
      //   171: aload_0
      //   172: iconst_0
      //   173: putfield 220	com/afollestad/materialdialogs/MaterialDialog$Builder:widgetColorSet	Z
      //   176: aload_0
      //   177: iconst_0
      //   178: putfield 222	com/afollestad/materialdialogs/MaterialDialog$Builder:dividerColorSet	Z
      //   181: aload_0
      //   182: aload_1
      //   183: putfield 224	com/afollestad/materialdialogs/MaterialDialog$Builder:context	Landroid/content/Context;
      //   186: aload_1
      //   187: getstatic 229	com/afollestad/materialdialogs/R$color:md_material_blue_600	I
      //   190: invokestatic 235	com/afollestad/materialdialogs/util/DialogUtils:getColor	(Landroid/content/Context;I)I
      //   193: istore_3
      //   194: aload_1
      //   195: getstatic 240	com/afollestad/materialdialogs/R$attr:colorAccent	I
      //   198: iload_3
      //   199: invokestatic 244	com/afollestad/materialdialogs/util/DialogUtils:resolveColor	(Landroid/content/Context;II)I
      //   202: istore_3
      //   203: aload_0
      //   204: iload_3
      //   205: putfield 246	com/afollestad/materialdialogs/MaterialDialog$Builder:widgetColor	I
      //   208: aload_1
      //   209: ldc -9
      //   211: iload_3
      //   212: invokestatic 244	com/afollestad/materialdialogs/util/DialogUtils:resolveColor	(Landroid/content/Context;II)I
      //   215: istore_3
      //   216: aload_0
      //   217: iload_3
      //   218: putfield 246	com/afollestad/materialdialogs/MaterialDialog$Builder:widgetColor	I
      //   221: aload_0
      //   222: aload_1
      //   223: iload_3
      //   224: invokestatic 251	com/afollestad/materialdialogs/util/DialogUtils:getActionTextStateList	(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
      //   227: putfield 253	com/afollestad/materialdialogs/MaterialDialog$Builder:positiveColor	Landroid/content/res/ColorStateList;
      //   230: aload_0
      //   231: aload_1
      //   232: aload_0
      //   233: getfield 246	com/afollestad/materialdialogs/MaterialDialog$Builder:widgetColor	I
      //   236: invokestatic 251	com/afollestad/materialdialogs/util/DialogUtils:getActionTextStateList	(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
      //   239: putfield 255	com/afollestad/materialdialogs/MaterialDialog$Builder:negativeColor	Landroid/content/res/ColorStateList;
      //   242: aload_0
      //   243: aload_1
      //   244: aload_0
      //   245: getfield 246	com/afollestad/materialdialogs/MaterialDialog$Builder:widgetColor	I
      //   248: invokestatic 251	com/afollestad/materialdialogs/util/DialogUtils:getActionTextStateList	(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
      //   251: putfield 257	com/afollestad/materialdialogs/MaterialDialog$Builder:neutralColor	Landroid/content/res/ColorStateList;
      //   254: aload_0
      //   255: aload_1
      //   256: aload_1
      //   257: getstatic 260	com/afollestad/materialdialogs/R$attr:md_link_color	I
      //   260: aload_0
      //   261: getfield 246	com/afollestad/materialdialogs/MaterialDialog$Builder:widgetColor	I
      //   264: invokestatic 244	com/afollestad/materialdialogs/util/DialogUtils:resolveColor	(Landroid/content/Context;II)I
      //   267: invokestatic 251	com/afollestad/materialdialogs/util/DialogUtils:getActionTextStateList	(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
      //   270: putfield 262	com/afollestad/materialdialogs/MaterialDialog$Builder:linkColor	Landroid/content/res/ColorStateList;
      //   273: aload_1
      //   274: ldc_w 263
      //   277: invokestatic 265	com/afollestad/materialdialogs/util/DialogUtils:resolveColor	(Landroid/content/Context;I)I
      //   280: istore_3
      //   281: aload_0
      //   282: aload_1
      //   283: getstatic 268	com/afollestad/materialdialogs/R$attr:md_btn_ripple_color	I
      //   286: aload_1
      //   287: getstatic 271	com/afollestad/materialdialogs/R$attr:colorControlHighlight	I
      //   290: iload_3
      //   291: invokestatic 244	com/afollestad/materialdialogs/util/DialogUtils:resolveColor	(Landroid/content/Context;II)I
      //   294: invokestatic 244	com/afollestad/materialdialogs/util/DialogUtils:resolveColor	(Landroid/content/Context;II)I
      //   297: putfield 162	com/afollestad/materialdialogs/MaterialDialog$Builder:buttonRippleColor	I
      //   300: aload_0
      //   301: invokestatic 277	java/text/NumberFormat:getPercentInstance	()Ljava/text/NumberFormat;
      //   304: putfield 279	com/afollestad/materialdialogs/MaterialDialog$Builder:progressPercentFormat	Ljava/text/NumberFormat;
      //   307: aload_0
      //   308: ldc_w 281
      //   311: putfield 283	com/afollestad/materialdialogs/MaterialDialog$Builder:progressNumberFormat	Ljava/lang/String;
      //   314: aload_1
      //   315: ldc_w 284
      //   318: invokestatic 265	com/afollestad/materialdialogs/util/DialogUtils:resolveColor	(Landroid/content/Context;I)I
      //   321: invokestatic 288	com/afollestad/materialdialogs/util/DialogUtils:isColorDark	(I)Z
      //   324: ifeq +6 -> 330
      //   327: goto +7 -> 334
      //   330: getstatic 291	com/afollestad/materialdialogs/Theme:DARK	Lcom/afollestad/materialdialogs/Theme;
      //   333: astore_2
      //   334: aload_0
      //   335: aload_2
      //   336: putfield 177	com/afollestad/materialdialogs/MaterialDialog$Builder:theme	Lcom/afollestad/materialdialogs/Theme;
      //   339: aload_0
      //   340: invokespecial 294	com/afollestad/materialdialogs/MaterialDialog$Builder:checkSingleton	()V
      //   343: aload_0
      //   344: aload_1
      //   345: getstatic 297	com/afollestad/materialdialogs/R$attr:md_title_gravity	I
      //   348: aload_0
      //   349: getfield 149	com/afollestad/materialdialogs/MaterialDialog$Builder:titleGravity	Lcom/afollestad/materialdialogs/GravityEnum;
      //   352: invokestatic 301	com/afollestad/materialdialogs/util/DialogUtils:resolveGravityEnum	(Landroid/content/Context;ILcom/afollestad/materialdialogs/GravityEnum;)Lcom/afollestad/materialdialogs/GravityEnum;
      //   355: putfield 149	com/afollestad/materialdialogs/MaterialDialog$Builder:titleGravity	Lcom/afollestad/materialdialogs/GravityEnum;
      //   358: aload_0
      //   359: aload_1
      //   360: getstatic 304	com/afollestad/materialdialogs/R$attr:md_content_gravity	I
      //   363: aload_0
      //   364: getfield 151	com/afollestad/materialdialogs/MaterialDialog$Builder:contentGravity	Lcom/afollestad/materialdialogs/GravityEnum;
      //   367: invokestatic 301	com/afollestad/materialdialogs/util/DialogUtils:resolveGravityEnum	(Landroid/content/Context;ILcom/afollestad/materialdialogs/GravityEnum;)Lcom/afollestad/materialdialogs/GravityEnum;
      //   370: putfield 151	com/afollestad/materialdialogs/MaterialDialog$Builder:contentGravity	Lcom/afollestad/materialdialogs/GravityEnum;
      //   373: aload_0
      //   374: aload_1
      //   375: getstatic 307	com/afollestad/materialdialogs/R$attr:md_btnstacked_gravity	I
      //   378: aload_0
      //   379: getfield 156	com/afollestad/materialdialogs/MaterialDialog$Builder:btnStackedGravity	Lcom/afollestad/materialdialogs/GravityEnum;
      //   382: invokestatic 301	com/afollestad/materialdialogs/util/DialogUtils:resolveGravityEnum	(Landroid/content/Context;ILcom/afollestad/materialdialogs/GravityEnum;)Lcom/afollestad/materialdialogs/GravityEnum;
      //   385: putfield 156	com/afollestad/materialdialogs/MaterialDialog$Builder:btnStackedGravity	Lcom/afollestad/materialdialogs/GravityEnum;
      //   388: aload_0
      //   389: aload_1
      //   390: getstatic 310	com/afollestad/materialdialogs/R$attr:md_items_gravity	I
      //   393: aload_0
      //   394: getfield 158	com/afollestad/materialdialogs/MaterialDialog$Builder:itemsGravity	Lcom/afollestad/materialdialogs/GravityEnum;
      //   397: invokestatic 301	com/afollestad/materialdialogs/util/DialogUtils:resolveGravityEnum	(Landroid/content/Context;ILcom/afollestad/materialdialogs/GravityEnum;)Lcom/afollestad/materialdialogs/GravityEnum;
      //   400: putfield 158	com/afollestad/materialdialogs/MaterialDialog$Builder:itemsGravity	Lcom/afollestad/materialdialogs/GravityEnum;
      //   403: aload_0
      //   404: aload_1
      //   405: getstatic 313	com/afollestad/materialdialogs/R$attr:md_buttons_gravity	I
      //   408: aload_0
      //   409: getfield 160	com/afollestad/materialdialogs/MaterialDialog$Builder:buttonsGravity	Lcom/afollestad/materialdialogs/GravityEnum;
      //   412: invokestatic 301	com/afollestad/materialdialogs/util/DialogUtils:resolveGravityEnum	(Landroid/content/Context;ILcom/afollestad/materialdialogs/GravityEnum;)Lcom/afollestad/materialdialogs/GravityEnum;
      //   415: putfield 160	com/afollestad/materialdialogs/MaterialDialog$Builder:buttonsGravity	Lcom/afollestad/materialdialogs/GravityEnum;
      //   418: aload_1
      //   419: getstatic 316	com/afollestad/materialdialogs/R$attr:md_medium_font	I
      //   422: invokestatic 320	com/afollestad/materialdialogs/util/DialogUtils:resolveString	(Landroid/content/Context;I)Ljava/lang/String;
      //   425: astore_2
      //   426: aload_1
      //   427: getstatic 323	com/afollestad/materialdialogs/R$attr:md_regular_font	I
      //   430: invokestatic 320	com/afollestad/materialdialogs/util/DialogUtils:resolveString	(Landroid/content/Context;I)Ljava/lang/String;
      //   433: astore_1
      //   434: aload_0
      //   435: aload_2
      //   436: aload_1
      //   437: invokevirtual 327	com/afollestad/materialdialogs/MaterialDialog$Builder:typeface	(Ljava/lang/String;Ljava/lang/String;)Lcom/afollestad/materialdialogs/MaterialDialog$Builder;
      //   440: pop
      //   441: aload_0
      //   442: getfield 329	com/afollestad/materialdialogs/MaterialDialog$Builder:mediumFont	Landroid/graphics/Typeface;
      //   445: ifnonnull +25 -> 470
      //   448: aload_0
      //   449: ldc_w 331
      //   452: iconst_0
      //   453: invokestatic 337	android/graphics/Typeface:create	(Ljava/lang/String;I)Landroid/graphics/Typeface;
      //   456: putfield 329	com/afollestad/materialdialogs/MaterialDialog$Builder:mediumFont	Landroid/graphics/Typeface;
      //   459: goto +11 -> 470
      //   462: astore_1
      //   463: aload_0
      //   464: getstatic 340	android/graphics/Typeface:DEFAULT_BOLD	Landroid/graphics/Typeface;
      //   467: putfield 329	com/afollestad/materialdialogs/MaterialDialog$Builder:mediumFont	Landroid/graphics/Typeface;
      //   470: aload_0
      //   471: getfield 342	com/afollestad/materialdialogs/MaterialDialog$Builder:regularFont	Landroid/graphics/Typeface;
      //   474: ifnonnull +38 -> 512
      //   477: aload_0
      //   478: ldc_w 344
      //   481: iconst_0
      //   482: invokestatic 337	android/graphics/Typeface:create	(Ljava/lang/String;I)Landroid/graphics/Typeface;
      //   485: putfield 342	com/afollestad/materialdialogs/MaterialDialog$Builder:regularFont	Landroid/graphics/Typeface;
      //   488: goto +24 -> 512
      //   491: astore_1
      //   492: getstatic 347	android/graphics/Typeface:SANS_SERIF	Landroid/graphics/Typeface;
      //   495: astore_1
      //   496: aload_0
      //   497: aload_1
      //   498: putfield 342	com/afollestad/materialdialogs/MaterialDialog$Builder:regularFont	Landroid/graphics/Typeface;
      //   501: aload_1
      //   502: ifnonnull +10 -> 512
      //   505: aload_0
      //   506: getstatic 350	android/graphics/Typeface:DEFAULT	Landroid/graphics/Typeface;
      //   509: putfield 342	com/afollestad/materialdialogs/MaterialDialog$Builder:regularFont	Landroid/graphics/Typeface;
      //   512: return
      //   513: astore_1
      //   514: goto -73 -> 441
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	517	0	this	Builder
      //   0	517	1	paramContext	Context
      //   7	429	2	localObject	Object
      //   193	98	3	i	int
      // Exception table:
      //   from	to	target	type
      //   448	459	462	finally
      //   477	488	491	finally
      //   434	441	513	finally
    }
    
    private void checkSingleton()
    {
      if (ThemeSingleton.get(false) == null) {
        return;
      }
      ThemeSingleton localThemeSingleton = ThemeSingleton.get();
      if (darkTheme) {
        theme = Theme.DARK;
      }
      int i = titleColor;
      if (i != 0) {
        titleColor = i;
      }
      i = contentColor;
      if (i != 0) {
        contentColor = i;
      }
      Object localObject = positiveColor;
      if (localObject != null) {
        positiveColor = ((ColorStateList)localObject);
      }
      localObject = neutralColor;
      if (localObject != null) {
        neutralColor = ((ColorStateList)localObject);
      }
      localObject = negativeColor;
      if (localObject != null) {
        negativeColor = ((ColorStateList)localObject);
      }
      i = itemColor;
      if (i != 0) {
        itemColor = i;
      }
      localObject = icon;
      if (localObject != null) {
        icon = ((Drawable)localObject);
      }
      i = backgroundColor;
      if (i != 0) {
        backgroundColor = i;
      }
      i = dividerColor;
      if (i != 0) {
        dividerColor = i;
      }
      i = btnSelectorStacked;
      if (i != 0) {
        btnSelectorStacked = i;
      }
      i = listSelector;
      if (i != 0) {
        listSelector = i;
      }
      i = btnSelectorPositive;
      if (i != 0) {
        btnSelectorPositive = i;
      }
      i = btnSelectorNeutral;
      if (i != 0) {
        btnSelectorNeutral = i;
      }
      i = btnSelectorNegative;
      if (i != 0) {
        btnSelectorNegative = i;
      }
      i = widgetColor;
      if (i != 0) {
        widgetColor = i;
      }
      localObject = linkColor;
      if (localObject != null) {
        linkColor = ((ColorStateList)localObject);
      }
      titleGravity = titleGravity;
      contentGravity = contentGravity;
      btnStackedGravity = btnStackedGravity;
      itemsGravity = itemsGravity;
      buttonsGravity = buttonsGravity;
    }
    
    public Builder adapter(@NonNull RecyclerView.Adapter<?> paramAdapter, @Nullable RecyclerView.LayoutManager paramLayoutManager)
    {
      if (customView == null)
      {
        if ((paramLayoutManager != null) && (!(paramLayoutManager instanceof LinearLayoutManager)) && (!(paramLayoutManager instanceof GridLayoutManager))) {
          throw new IllegalStateException("You can currently only use LinearLayoutManager and GridLayoutManager with this library.");
        }
        adapter = paramAdapter;
        layoutManager = paramLayoutManager;
        return this;
      }
      throw new IllegalStateException("You cannot set adapter() when you're using a custom view.");
    }
    
    public Builder alwaysCallInputCallback()
    {
      alwaysCallInputCallback = true;
      return this;
    }
    
    public Builder alwaysCallMultiChoiceCallback()
    {
      alwaysCallMultiChoiceCallback = true;
      return this;
    }
    
    public Builder alwaysCallSingleChoiceCallback()
    {
      alwaysCallSingleChoiceCallback = true;
      return this;
    }
    
    public Builder autoDismiss(boolean paramBoolean)
    {
      autoDismiss = paramBoolean;
      return this;
    }
    
    public Builder backgroundColor(@ColorInt int paramInt)
    {
      backgroundColor = paramInt;
      return this;
    }
    
    public Builder backgroundColorAttr(@AttrRes int paramInt)
    {
      return backgroundColor(DialogUtils.resolveColor(context, paramInt));
    }
    
    public Builder backgroundColorRes(@ColorRes int paramInt)
    {
      return backgroundColor(DialogUtils.getColor(context, paramInt));
    }
    
    public Builder btnSelector(@DrawableRes int paramInt)
    {
      btnSelectorPositive = paramInt;
      btnSelectorNeutral = paramInt;
      btnSelectorNegative = paramInt;
      return this;
    }
    
    public Builder btnSelector(@DrawableRes int paramInt, @NonNull DialogAction paramDialogAction)
    {
      int i = MaterialDialog.4.$SwitchMap$com$afollestad$materialdialogs$DialogAction[paramDialogAction.ordinal()];
      if (i != 1)
      {
        if (i != 2) {
          btnSelectorPositive = paramInt;
        } else {
          btnSelectorNegative = paramInt;
        }
      }
      else {
        btnSelectorNeutral = paramInt;
      }
      return this;
    }
    
    public Builder btnSelectorStacked(@DrawableRes int paramInt)
    {
      btnSelectorStacked = paramInt;
      return this;
    }
    
    public Builder btnStackedGravity(@NonNull GravityEnum paramGravityEnum)
    {
      btnStackedGravity = paramGravityEnum;
      return this;
    }
    
    @UiThread
    public MaterialDialog build()
    {
      return new MaterialDialog(this);
    }
    
    public Builder buttonRippleColor(@ColorInt int paramInt)
    {
      buttonRippleColor = paramInt;
      return this;
    }
    
    public Builder buttonRippleColorAttr(@AttrRes int paramInt)
    {
      return buttonRippleColor(DialogUtils.resolveColor(context, paramInt));
    }
    
    public Builder buttonRippleColorRes(@ColorRes int paramInt)
    {
      return buttonRippleColor(DialogUtils.getColor(context, paramInt));
    }
    
    public Builder buttonsGravity(@NonNull GravityEnum paramGravityEnum)
    {
      buttonsGravity = paramGravityEnum;
      return this;
    }
    
    public Builder callback(@NonNull MaterialDialog.ButtonCallback paramButtonCallback)
    {
      callback = paramButtonCallback;
      return this;
    }
    
    public Builder cancelListener(@NonNull DialogInterface.OnCancelListener paramOnCancelListener)
    {
      cancelListener = paramOnCancelListener;
      return this;
    }
    
    public Builder cancelable(boolean paramBoolean)
    {
      cancelable = paramBoolean;
      canceledOnTouchOutside = paramBoolean;
      return this;
    }
    
    public Builder canceledOnTouchOutside(boolean paramBoolean)
    {
      canceledOnTouchOutside = paramBoolean;
      return this;
    }
    
    public Builder checkBoxPrompt(@NonNull CharSequence paramCharSequence, boolean paramBoolean, @Nullable CompoundButton.OnCheckedChangeListener paramOnCheckedChangeListener)
    {
      checkBoxPrompt = paramCharSequence;
      checkBoxPromptInitiallyChecked = paramBoolean;
      checkBoxPromptListener = paramOnCheckedChangeListener;
      return this;
    }
    
    public Builder checkBoxPromptRes(@StringRes int paramInt, boolean paramBoolean, @Nullable CompoundButton.OnCheckedChangeListener paramOnCheckedChangeListener)
    {
      return checkBoxPrompt(context.getResources().getText(paramInt), paramBoolean, paramOnCheckedChangeListener);
    }
    
    public Builder choiceWidgetColor(@Nullable ColorStateList paramColorStateList)
    {
      choiceWidgetColor = paramColorStateList;
      return this;
    }
    
    public Builder content(@StringRes int paramInt)
    {
      return content(paramInt, false);
    }
    
    public Builder content(@StringRes int paramInt, boolean paramBoolean)
    {
      CharSequence localCharSequence = context.getText(paramInt);
      Object localObject = localCharSequence;
      if (paramBoolean) {
        localObject = Html.fromHtml(localCharSequence.toString().replace("\n", "<br/>"));
      }
      return content((CharSequence)localObject);
    }
    
    public Builder content(@StringRes int paramInt, Object... paramVarArgs)
    {
      return content(Html.fromHtml(String.format(context.getString(paramInt), paramVarArgs).replace("\n", "<br/>")));
    }
    
    public Builder content(@NonNull CharSequence paramCharSequence)
    {
      if (customView == null)
      {
        content = paramCharSequence;
        return this;
      }
      throw new IllegalStateException("You cannot set content() when you're using a custom view.");
    }
    
    public Builder contentColor(@ColorInt int paramInt)
    {
      contentColor = paramInt;
      contentColorSet = true;
      return this;
    }
    
    public Builder contentColorAttr(@AttrRes int paramInt)
    {
      contentColor(DialogUtils.resolveColor(context, paramInt));
      return this;
    }
    
    public Builder contentColorRes(@ColorRes int paramInt)
    {
      contentColor(DialogUtils.getColor(context, paramInt));
      return this;
    }
    
    public Builder contentGravity(@NonNull GravityEnum paramGravityEnum)
    {
      contentGravity = paramGravityEnum;
      return this;
    }
    
    public Builder contentLineSpacing(float paramFloat)
    {
      contentLineSpacingMultiplier = paramFloat;
      return this;
    }
    
    public Builder customView(@LayoutRes int paramInt, boolean paramBoolean)
    {
      return customView(LayoutInflater.from(context).inflate(paramInt, null), paramBoolean);
    }
    
    public Builder customView(@NonNull View paramView, boolean paramBoolean)
    {
      if (content == null)
      {
        if (items == null)
        {
          if (inputCallback == null)
          {
            if ((progress <= -2) && (!indeterminateProgress))
            {
              if ((paramView.getParent() != null) && ((paramView.getParent() instanceof ViewGroup))) {
                ((ViewGroup)paramView.getParent()).removeView(paramView);
              }
              customView = paramView;
              wrapCustomViewInScroll = paramBoolean;
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
    
    public Builder dismissListener(@NonNull DialogInterface.OnDismissListener paramOnDismissListener)
    {
      dismissListener = paramOnDismissListener;
      return this;
    }
    
    public Builder dividerColor(@ColorInt int paramInt)
    {
      dividerColor = paramInt;
      dividerColorSet = true;
      return this;
    }
    
    public Builder dividerColorAttr(@AttrRes int paramInt)
    {
      return dividerColor(DialogUtils.resolveColor(context, paramInt));
    }
    
    public Builder dividerColorRes(@ColorRes int paramInt)
    {
      return dividerColor(DialogUtils.getColor(context, paramInt));
    }
    
    public final Context getContext()
    {
      return context;
    }
    
    public final int getItemColor()
    {
      return itemColor;
    }
    
    public final Typeface getRegularFont()
    {
      return regularFont;
    }
    
    public Builder icon(@NonNull Drawable paramDrawable)
    {
      icon = paramDrawable;
      return this;
    }
    
    public Builder iconAttr(@AttrRes int paramInt)
    {
      icon = DialogUtils.resolveDrawable(context, paramInt);
      return this;
    }
    
    public Builder iconRes(@DrawableRes int paramInt)
    {
      icon = ResourcesCompat.getDrawable(context.getResources(), paramInt, null);
      return this;
    }
    
    public Builder input(@StringRes int paramInt1, @StringRes int paramInt2, @NonNull MaterialDialog.InputCallback paramInputCallback)
    {
      return input(paramInt1, paramInt2, true, paramInputCallback);
    }
    
    public Builder input(@StringRes int paramInt1, @StringRes int paramInt2, boolean paramBoolean, @NonNull MaterialDialog.InputCallback paramInputCallback)
    {
      CharSequence localCharSequence1 = null;
      CharSequence localCharSequence2;
      if (paramInt1 == 0) {
        localCharSequence2 = null;
      } else {
        localCharSequence2 = context.getText(paramInt1);
      }
      if (paramInt2 != 0) {
        localCharSequence1 = context.getText(paramInt2);
      }
      return input(localCharSequence2, localCharSequence1, paramBoolean, paramInputCallback);
    }
    
    public Builder input(@Nullable CharSequence paramCharSequence1, @Nullable CharSequence paramCharSequence2, @NonNull MaterialDialog.InputCallback paramInputCallback)
    {
      return input(paramCharSequence1, paramCharSequence2, true, paramInputCallback);
    }
    
    public Builder input(@Nullable CharSequence paramCharSequence1, @Nullable CharSequence paramCharSequence2, boolean paramBoolean, @NonNull MaterialDialog.InputCallback paramInputCallback)
    {
      if (customView == null)
      {
        inputCallback = paramInputCallback;
        inputHint = paramCharSequence1;
        inputPrefill = paramCharSequence2;
        inputAllowEmpty = paramBoolean;
        return this;
      }
      throw new IllegalStateException("You cannot set content() when you're using a custom view.");
    }
    
    public Builder inputRange(@IntRange(from=0L, to=2147483647L) int paramInt1, @IntRange(from=-1L, to=2147483647L) int paramInt2)
    {
      return inputRange(paramInt1, paramInt2, 0);
    }
    
    public Builder inputRange(@IntRange(from=0L, to=2147483647L) int paramInt1, @IntRange(from=-1L, to=2147483647L) int paramInt2, @ColorInt int paramInt3)
    {
      if (paramInt1 >= 0)
      {
        inputMinLength = paramInt1;
        inputMaxLength = paramInt2;
        if (paramInt3 == 0) {
          inputRangeErrorColor = DialogUtils.getColor(context, R.color.md_edittext_error);
        } else {
          inputRangeErrorColor = paramInt3;
        }
        if (inputMinLength > 0) {
          inputAllowEmpty = false;
        }
        return this;
      }
      throw new IllegalArgumentException("Min length for input dialogs cannot be less than 0.");
    }
    
    public Builder inputRangeRes(@IntRange(from=0L, to=2147483647L) int paramInt1, @IntRange(from=-1L, to=2147483647L) int paramInt2, @ColorRes int paramInt3)
    {
      return inputRange(paramInt1, paramInt2, DialogUtils.getColor(context, paramInt3));
    }
    
    public Builder inputType(int paramInt)
    {
      inputType = paramInt;
      return this;
    }
    
    public Builder items(@ArrayRes int paramInt)
    {
      items(context.getResources().getTextArray(paramInt));
      return this;
    }
    
    public Builder items(@NonNull Collection paramCollection)
    {
      if (paramCollection.size() > 0)
      {
        CharSequence[] arrayOfCharSequence = new CharSequence[paramCollection.size()];
        int i = 0;
        paramCollection = paramCollection.iterator();
        while (paramCollection.hasNext())
        {
          arrayOfCharSequence[i] = paramCollection.next().toString();
          i++;
        }
        items(arrayOfCharSequence);
      }
      else if (paramCollection.size() == 0)
      {
        items = new ArrayList();
      }
      return this;
    }
    
    public Builder items(@NonNull CharSequence... paramVarArgs)
    {
      if (customView == null)
      {
        ArrayList localArrayList = new ArrayList();
        items = localArrayList;
        Collections.addAll(localArrayList, paramVarArgs);
        return this;
      }
      throw new IllegalStateException("You cannot set items() when you're using a custom view.");
    }
    
    public Builder itemsCallback(@NonNull MaterialDialog.ListCallback paramListCallback)
    {
      listCallback = paramListCallback;
      listCallbackSingleChoice = null;
      listCallbackMultiChoice = null;
      return this;
    }
    
    public Builder itemsCallbackMultiChoice(@Nullable Integer[] paramArrayOfInteger, @NonNull MaterialDialog.ListCallbackMultiChoice paramListCallbackMultiChoice)
    {
      selectedIndices = paramArrayOfInteger;
      listCallback = null;
      listCallbackSingleChoice = null;
      listCallbackMultiChoice = paramListCallbackMultiChoice;
      return this;
    }
    
    public Builder itemsCallbackSingleChoice(int paramInt, @NonNull MaterialDialog.ListCallbackSingleChoice paramListCallbackSingleChoice)
    {
      selectedIndex = paramInt;
      listCallback = null;
      listCallbackSingleChoice = paramListCallbackSingleChoice;
      listCallbackMultiChoice = null;
      return this;
    }
    
    public Builder itemsColor(@ColorInt int paramInt)
    {
      itemColor = paramInt;
      itemColorSet = true;
      return this;
    }
    
    public Builder itemsColorAttr(@AttrRes int paramInt)
    {
      return itemsColor(DialogUtils.resolveColor(context, paramInt));
    }
    
    public Builder itemsColorRes(@ColorRes int paramInt)
    {
      return itemsColor(DialogUtils.getColor(context, paramInt));
    }
    
    public Builder itemsDisabledIndices(@Nullable Integer... paramVarArgs)
    {
      disabledIndices = paramVarArgs;
      return this;
    }
    
    public Builder itemsGravity(@NonNull GravityEnum paramGravityEnum)
    {
      itemsGravity = paramGravityEnum;
      return this;
    }
    
    public Builder itemsIds(@ArrayRes int paramInt)
    {
      return itemsIds(context.getResources().getIntArray(paramInt));
    }
    
    public Builder itemsIds(@NonNull int[] paramArrayOfInt)
    {
      itemIds = paramArrayOfInt;
      return this;
    }
    
    public Builder itemsLongCallback(@NonNull MaterialDialog.ListLongCallback paramListLongCallback)
    {
      listLongCallback = paramListLongCallback;
      listCallbackSingleChoice = null;
      listCallbackMultiChoice = null;
      return this;
    }
    
    public Builder keyListener(@NonNull DialogInterface.OnKeyListener paramOnKeyListener)
    {
      keyListener = paramOnKeyListener;
      return this;
    }
    
    public Builder limitIconToDefaultSize()
    {
      limitIconToDefaultSize = true;
      return this;
    }
    
    public Builder linkColor(@ColorInt int paramInt)
    {
      return linkColor(DialogUtils.getActionTextStateList(context, paramInt));
    }
    
    public Builder linkColor(@NonNull ColorStateList paramColorStateList)
    {
      linkColor = paramColorStateList;
      return this;
    }
    
    public Builder linkColorAttr(@AttrRes int paramInt)
    {
      return linkColor(DialogUtils.resolveActionTextColorStateList(context, paramInt, null));
    }
    
    public Builder linkColorRes(@ColorRes int paramInt)
    {
      return linkColor(DialogUtils.getActionTextColorStateList(context, paramInt));
    }
    
    public Builder listSelector(@DrawableRes int paramInt)
    {
      listSelector = paramInt;
      return this;
    }
    
    public Builder maxIconSize(int paramInt)
    {
      maxIconSize = paramInt;
      return this;
    }
    
    public Builder maxIconSizeRes(@DimenRes int paramInt)
    {
      return maxIconSize((int)context.getResources().getDimension(paramInt));
    }
    
    public Builder negativeColor(@ColorInt int paramInt)
    {
      return negativeColor(DialogUtils.getActionTextStateList(context, paramInt));
    }
    
    public Builder negativeColor(@NonNull ColorStateList paramColorStateList)
    {
      negativeColor = paramColorStateList;
      negativeColorSet = true;
      return this;
    }
    
    public Builder negativeColorAttr(@AttrRes int paramInt)
    {
      return negativeColor(DialogUtils.resolveActionTextColorStateList(context, paramInt, null));
    }
    
    public Builder negativeColorRes(@ColorRes int paramInt)
    {
      return negativeColor(DialogUtils.getActionTextColorStateList(context, paramInt));
    }
    
    public Builder negativeFocus(boolean paramBoolean)
    {
      negativeFocus = paramBoolean;
      return this;
    }
    
    public Builder negativeText(@StringRes int paramInt)
    {
      if (paramInt == 0) {
        return this;
      }
      return negativeText(context.getText(paramInt));
    }
    
    public Builder negativeText(@NonNull CharSequence paramCharSequence)
    {
      negativeText = paramCharSequence;
      return this;
    }
    
    public Builder neutralColor(@ColorInt int paramInt)
    {
      return neutralColor(DialogUtils.getActionTextStateList(context, paramInt));
    }
    
    public Builder neutralColor(@NonNull ColorStateList paramColorStateList)
    {
      neutralColor = paramColorStateList;
      neutralColorSet = true;
      return this;
    }
    
    public Builder neutralColorAttr(@AttrRes int paramInt)
    {
      return neutralColor(DialogUtils.resolveActionTextColorStateList(context, paramInt, null));
    }
    
    public Builder neutralColorRes(@ColorRes int paramInt)
    {
      return neutralColor(DialogUtils.getActionTextColorStateList(context, paramInt));
    }
    
    public Builder neutralFocus(boolean paramBoolean)
    {
      neutralFocus = paramBoolean;
      return this;
    }
    
    public Builder neutralText(@StringRes int paramInt)
    {
      if (paramInt == 0) {
        return this;
      }
      return neutralText(context.getText(paramInt));
    }
    
    public Builder neutralText(@NonNull CharSequence paramCharSequence)
    {
      neutralText = paramCharSequence;
      return this;
    }
    
    public Builder onAny(@NonNull MaterialDialog.SingleButtonCallback paramSingleButtonCallback)
    {
      onAnyCallback = paramSingleButtonCallback;
      return this;
    }
    
    public Builder onNegative(@NonNull MaterialDialog.SingleButtonCallback paramSingleButtonCallback)
    {
      onNegativeCallback = paramSingleButtonCallback;
      return this;
    }
    
    public Builder onNeutral(@NonNull MaterialDialog.SingleButtonCallback paramSingleButtonCallback)
    {
      onNeutralCallback = paramSingleButtonCallback;
      return this;
    }
    
    public Builder onPositive(@NonNull MaterialDialog.SingleButtonCallback paramSingleButtonCallback)
    {
      onPositiveCallback = paramSingleButtonCallback;
      return this;
    }
    
    public Builder positiveColor(@ColorInt int paramInt)
    {
      return positiveColor(DialogUtils.getActionTextStateList(context, paramInt));
    }
    
    public Builder positiveColor(@NonNull ColorStateList paramColorStateList)
    {
      positiveColor = paramColorStateList;
      positiveColorSet = true;
      return this;
    }
    
    public Builder positiveColorAttr(@AttrRes int paramInt)
    {
      return positiveColor(DialogUtils.resolveActionTextColorStateList(context, paramInt, null));
    }
    
    public Builder positiveColorRes(@ColorRes int paramInt)
    {
      return positiveColor(DialogUtils.getActionTextColorStateList(context, paramInt));
    }
    
    public Builder positiveFocus(boolean paramBoolean)
    {
      positiveFocus = paramBoolean;
      return this;
    }
    
    public Builder positiveText(@StringRes int paramInt)
    {
      if (paramInt == 0) {
        return this;
      }
      positiveText(context.getText(paramInt));
      return this;
    }
    
    public Builder positiveText(@NonNull CharSequence paramCharSequence)
    {
      positiveText = paramCharSequence;
      return this;
    }
    
    public Builder progress(boolean paramBoolean, int paramInt)
    {
      if (customView == null)
      {
        if (paramBoolean)
        {
          indeterminateProgress = true;
          progress = -2;
        }
        else
        {
          indeterminateIsHorizontalProgress = false;
          indeterminateProgress = false;
          progress = -1;
          progressMax = paramInt;
        }
        return this;
      }
      throw new IllegalStateException("You cannot set progress() when you're using a custom view.");
    }
    
    public Builder progress(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
    {
      showMinMax = paramBoolean2;
      return progress(paramBoolean1, paramInt);
    }
    
    public Builder progressIndeterminateStyle(boolean paramBoolean)
    {
      indeterminateIsHorizontalProgress = paramBoolean;
      return this;
    }
    
    public Builder progressNumberFormat(@NonNull String paramString)
    {
      progressNumberFormat = paramString;
      return this;
    }
    
    public Builder progressPercentFormat(@NonNull NumberFormat paramNumberFormat)
    {
      progressPercentFormat = paramNumberFormat;
      return this;
    }
    
    @UiThread
    public MaterialDialog show()
    {
      MaterialDialog localMaterialDialog = build();
      localMaterialDialog.show();
      return localMaterialDialog;
    }
    
    public Builder showListener(@NonNull DialogInterface.OnShowListener paramOnShowListener)
    {
      showListener = paramOnShowListener;
      return this;
    }
    
    public Builder stackingBehavior(@NonNull StackingBehavior paramStackingBehavior)
    {
      stackingBehavior = paramStackingBehavior;
      return this;
    }
    
    public Builder tag(@Nullable Object paramObject)
    {
      tag = paramObject;
      return this;
    }
    
    public Builder theme(@NonNull Theme paramTheme)
    {
      theme = paramTheme;
      return this;
    }
    
    public Builder title(@StringRes int paramInt)
    {
      title(context.getText(paramInt));
      return this;
    }
    
    public Builder title(@NonNull CharSequence paramCharSequence)
    {
      title = paramCharSequence;
      return this;
    }
    
    public Builder titleColor(@ColorInt int paramInt)
    {
      titleColor = paramInt;
      titleColorSet = true;
      return this;
    }
    
    public Builder titleColorAttr(@AttrRes int paramInt)
    {
      return titleColor(DialogUtils.resolveColor(context, paramInt));
    }
    
    public Builder titleColorRes(@ColorRes int paramInt)
    {
      return titleColor(DialogUtils.getColor(context, paramInt));
    }
    
    public Builder titleGravity(@NonNull GravityEnum paramGravityEnum)
    {
      titleGravity = paramGravityEnum;
      return this;
    }
    
    public Builder typeface(@Nullable Typeface paramTypeface1, @Nullable Typeface paramTypeface2)
    {
      mediumFont = paramTypeface1;
      regularFont = paramTypeface2;
      return this;
    }
    
    public Builder typeface(@Nullable String paramString1, @Nullable String paramString2)
    {
      if ((paramString1 != null) && (!paramString1.trim().isEmpty()))
      {
        Typeface localTypeface = TypefaceHelper.get(context, paramString1);
        mediumFont = localTypeface;
        if (localTypeface == null) {
          throw new IllegalArgumentException(z2.p("No font asset found for \"", paramString1, "\""));
        }
      }
      if ((paramString2 != null) && (!paramString2.trim().isEmpty()))
      {
        paramString1 = TypefaceHelper.get(context, paramString2);
        regularFont = paramString1;
        if (paramString1 == null) {
          throw new IllegalArgumentException(z2.p("No font asset found for \"", paramString2, "\""));
        }
      }
      return this;
    }
    
    public Builder widgetColor(@ColorInt int paramInt)
    {
      widgetColor = paramInt;
      widgetColorSet = true;
      return this;
    }
    
    public Builder widgetColorAttr(@AttrRes int paramInt)
    {
      return widgetColor(DialogUtils.resolveColor(context, paramInt));
    }
    
    public Builder widgetColorRes(@ColorRes int paramInt)
    {
      return widgetColor(DialogUtils.getColor(context, paramInt));
    }
  }
  
  @Deprecated
  public static abstract class ButtonCallback
  {
    public final Object clone()
      throws CloneNotSupportedException
    {
      return super.clone();
    }
    
    public final boolean equals(Object paramObject)
    {
      return super.equals(paramObject);
    }
    
    public final void finalize()
      throws Throwable
    {
      super.finalize();
    }
    
    public final int hashCode()
    {
      return super.hashCode();
    }
    
    @Deprecated
    public void onAny(MaterialDialog paramMaterialDialog) {}
    
    @Deprecated
    public void onNegative(MaterialDialog paramMaterialDialog) {}
    
    @Deprecated
    public void onNeutral(MaterialDialog paramMaterialDialog) {}
    
    @Deprecated
    public void onPositive(MaterialDialog paramMaterialDialog) {}
    
    public final String toString()
    {
      return super.toString();
    }
  }
  
  public static class DialogException
    extends WindowManager.BadTokenException
  {
    public DialogException(String paramString)
    {
      super();
    }
  }
  
  public static abstract interface InputCallback
  {
    public abstract void onInput(@NonNull MaterialDialog paramMaterialDialog, CharSequence paramCharSequence);
  }
  
  public static abstract interface ListCallback
  {
    public abstract void onSelection(MaterialDialog paramMaterialDialog, View paramView, int paramInt, CharSequence paramCharSequence);
  }
  
  public static abstract interface ListCallbackMultiChoice
  {
    public abstract boolean onSelection(MaterialDialog paramMaterialDialog, Integer[] paramArrayOfInteger, CharSequence[] paramArrayOfCharSequence);
  }
  
  public static abstract interface ListCallbackSingleChoice
  {
    public abstract boolean onSelection(MaterialDialog paramMaterialDialog, View paramView, int paramInt, CharSequence paramCharSequence);
  }
  
  public static abstract interface ListLongCallback
  {
    public abstract boolean onLongSelection(MaterialDialog paramMaterialDialog, View paramView, int paramInt, CharSequence paramCharSequence);
  }
  
  public static enum ListType
  {
    static
    {
      ListType localListType1 = new ListType("REGULAR", 0);
      REGULAR = localListType1;
      ListType localListType2 = new ListType("SINGLE", 1);
      SINGLE = localListType2;
      ListType localListType3 = new ListType("MULTI", 2);
      MULTI = localListType3;
      $VALUES = new ListType[] { localListType1, localListType2, localListType3 };
    }
    
    private ListType() {}
    
    public static int getLayoutForType(ListType paramListType)
    {
      int i = MaterialDialog.4.$SwitchMap$com$afollestad$materialdialogs$MaterialDialog$ListType[paramListType.ordinal()];
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3) {
            return R.layout.md_listitem_multichoice;
          }
          throw new IllegalArgumentException("Not a valid list type");
        }
        return R.layout.md_listitem_singlechoice;
      }
      return R.layout.md_listitem;
    }
  }
  
  public static abstract interface SingleButtonCallback
  {
    public abstract void onClick(@NonNull MaterialDialog paramMaterialDialog, @NonNull DialogAction paramDialogAction);
  }
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.MaterialDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */