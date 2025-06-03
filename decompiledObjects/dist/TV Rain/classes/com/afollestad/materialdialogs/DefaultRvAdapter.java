package com.afollestad.materialdialogs;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.afollestad.materialdialogs.internal.MDTintHelper;
import com.afollestad.materialdialogs.util.DialogUtils;
import java.util.ArrayList;
import java.util.List;

class DefaultRvAdapter
  extends RecyclerView.Adapter<DefaultVH>
{
  private InternalListCallback callback;
  private final MaterialDialog dialog;
  private final GravityEnum itemGravity;
  @LayoutRes
  private final int layout;
  
  public DefaultRvAdapter(MaterialDialog paramMaterialDialog, @LayoutRes int paramInt)
  {
    dialog = paramMaterialDialog;
    layout = paramInt;
    itemGravity = builder.itemsGravity;
  }
  
  @TargetApi(17)
  private boolean isRTL()
  {
    int i = dialog.getBuilder().getContext().getResources().getConfiguration().getLayoutDirection();
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  @TargetApi(17)
  private void setupGravity(ViewGroup paramViewGroup)
  {
    ((LinearLayout)paramViewGroup).setGravity(itemGravity.getGravityInt() | 0x10);
    if (paramViewGroup.getChildCount() == 2)
    {
      Object localObject1;
      Object localObject2;
      if ((itemGravity == GravityEnum.END) && (!isRTL()) && ((paramViewGroup.getChildAt(0) instanceof CompoundButton)))
      {
        localObject1 = (CompoundButton)paramViewGroup.getChildAt(0);
        paramViewGroup.removeView((View)localObject1);
        localObject2 = (TextView)paramViewGroup.getChildAt(0);
        paramViewGroup.removeView((View)localObject2);
        ((TextView)localObject2).setPadding(((View)localObject2).getPaddingRight(), ((View)localObject2).getPaddingTop(), ((View)localObject2).getPaddingLeft(), ((View)localObject2).getPaddingBottom());
        paramViewGroup.addView((View)localObject2);
        paramViewGroup.addView((View)localObject1);
      }
      else if ((itemGravity == GravityEnum.START) && (isRTL()) && ((paramViewGroup.getChildAt(1) instanceof CompoundButton)))
      {
        localObject2 = (CompoundButton)paramViewGroup.getChildAt(1);
        paramViewGroup.removeView((View)localObject2);
        localObject1 = (TextView)paramViewGroup.getChildAt(0);
        paramViewGroup.removeView((View)localObject1);
        ((TextView)localObject1).setPadding(((View)localObject1).getPaddingRight(), ((View)localObject1).getPaddingTop(), ((View)localObject1).getPaddingRight(), ((View)localObject1).getPaddingBottom());
        paramViewGroup.addView((View)localObject2);
        paramViewGroup.addView((View)localObject1);
      }
    }
  }
  
  public int getItemCount()
  {
    ArrayList localArrayList = dialog.builder.items;
    int i;
    if (localArrayList != null) {
      i = localArrayList.size();
    } else {
      i = 0;
    }
    return i;
  }
  
  public void onBindViewHolder(DefaultVH paramDefaultVH, int paramInt)
  {
    View localView = itemView;
    boolean bool1 = DialogUtils.isIn(Integer.valueOf(paramInt), dialog.builder.disabledIndices);
    int i;
    if (bool1) {
      i = DialogUtils.adjustAlpha(dialog.builder.itemColor, 0.4F);
    } else {
      i = dialog.builder.itemColor;
    }
    itemView.setEnabled(bool1 ^ true);
    int j = 1.$SwitchMap$com$afollestad$materialdialogs$MaterialDialog$ListType[dialog.listType.ordinal()];
    Object localObject1;
    boolean bool2;
    MaterialDialog.Builder localBuilder;
    if (j != 1)
    {
      if (j == 2)
      {
        localObject1 = (CheckBox)control;
        bool2 = dialog.selectedIndicesList.contains(Integer.valueOf(paramInt));
        localBuilder = dialog.builder;
        localObject2 = choiceWidgetColor;
        if (localObject2 != null) {
          MDTintHelper.setTint((CheckBox)localObject1, (ColorStateList)localObject2);
        } else {
          MDTintHelper.setTint((CheckBox)localObject1, widgetColor);
        }
        ((CompoundButton)localObject1).setChecked(bool2);
        ((View)localObject1).setEnabled(bool1 ^ true);
      }
    }
    else
    {
      localObject2 = (RadioButton)control;
      localBuilder = dialog.builder;
      if (selectedIndex == paramInt) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      localObject1 = choiceWidgetColor;
      if (localObject1 != null) {
        MDTintHelper.setTint((RadioButton)localObject2, (ColorStateList)localObject1);
      } else {
        MDTintHelper.setTint((RadioButton)localObject2, widgetColor);
      }
      ((CompoundButton)localObject2).setChecked(bool2);
      ((View)localObject2).setEnabled(bool1 ^ true);
    }
    title.setText((CharSequence)dialog.builder.items.get(paramInt));
    title.setTextColor(i);
    Object localObject2 = dialog;
    ((MaterialDialog)localObject2).setTypeface(title, builder.regularFont);
    localObject2 = (ViewGroup)localView;
    setupGravity((ViewGroup)localObject2);
    paramDefaultVH = dialog.builder.itemIds;
    if (paramDefaultVH != null) {
      if (paramInt < paramDefaultVH.length) {
        localView.setId(paramDefaultVH[paramInt]);
      } else {
        localView.setId(-1);
      }
    }
    if (((ViewGroup)localObject2).getChildCount() == 2) {
      if ((((ViewGroup)localObject2).getChildAt(0) instanceof CompoundButton)) {
        ((ViewGroup)localObject2).getChildAt(0).setBackground(null);
      } else if ((((ViewGroup)localObject2).getChildAt(1) instanceof CompoundButton)) {
        ((ViewGroup)localObject2).getChildAt(1).setBackground(null);
      }
    }
  }
  
  public DefaultVH onCreateViewHolder(ViewGroup paramViewGroup, int paramInt)
  {
    paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(layout, paramViewGroup, false);
    DialogUtils.setBackgroundCompat(paramViewGroup, dialog.getListSelector());
    return new DefaultVH(paramViewGroup, this);
  }
  
  public void setCallback(InternalListCallback paramInternalListCallback)
  {
    callback = paramInternalListCallback;
  }
  
  public static class DefaultVH
    extends RecyclerView.ViewHolder
    implements View.OnClickListener, View.OnLongClickListener
  {
    public final DefaultRvAdapter adapter;
    public final CompoundButton control;
    public final TextView title;
    
    public DefaultVH(View paramView, DefaultRvAdapter paramDefaultRvAdapter)
    {
      super();
      control = ((CompoundButton)paramView.findViewById(R.id.md_control));
      title = ((TextView)paramView.findViewById(R.id.md_title));
      adapter = paramDefaultRvAdapter;
      paramView.setOnClickListener(this);
      if (access$000builder.listLongCallback != null) {
        paramView.setOnLongClickListener(this);
      }
    }
    
    public void onClick(View paramView)
    {
      if ((DefaultRvAdapter.access$100(adapter) != null) && (getAdapterPosition() != -1))
      {
        Object localObject1 = null;
        Object localObject2 = localObject1;
        if (access$000adapter).builder.items != null)
        {
          localObject2 = localObject1;
          if (getAdapterPosition() < access$000adapter).builder.items.size()) {
            localObject2 = (CharSequence)access$000adapter).builder.items.get(getAdapterPosition());
          }
        }
        DefaultRvAdapter.access$100(adapter).onItemSelected(DefaultRvAdapter.access$000(adapter), paramView, getAdapterPosition(), (CharSequence)localObject2, false);
      }
    }
    
    public boolean onLongClick(View paramView)
    {
      if ((DefaultRvAdapter.access$100(adapter) != null) && (getAdapterPosition() != -1))
      {
        Object localObject1 = null;
        Object localObject2 = localObject1;
        if (access$000adapter).builder.items != null)
        {
          localObject2 = localObject1;
          if (getAdapterPosition() < access$000adapter).builder.items.size()) {
            localObject2 = (CharSequence)access$000adapter).builder.items.get(getAdapterPosition());
          }
        }
        return DefaultRvAdapter.access$100(adapter).onItemSelected(DefaultRvAdapter.access$000(adapter), paramView, getAdapterPosition(), (CharSequence)localObject2, true);
      }
      return false;
    }
  }
  
  public static abstract interface InternalListCallback
  {
    public abstract boolean onItemSelected(MaterialDialog paramMaterialDialog, View paramView, int paramInt, CharSequence paramCharSequence, boolean paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.DefaultRvAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */