package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.styleable;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.ViewCompat;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ListMenuItemView
  extends LinearLayout
  implements MenuView.ItemView, AbsListView.SelectionBoundsAdjuster
{
  private static final String TAG = "ListMenuItemView";
  private Drawable mBackground;
  private CheckBox mCheckBox;
  private LinearLayout mContent;
  private boolean mForceShowIcon;
  private ImageView mGroupDivider;
  private boolean mHasListDivider;
  private ImageView mIconView;
  private LayoutInflater mInflater;
  private MenuItemImpl mItemData;
  private boolean mPreserveIconSpacing;
  private RadioButton mRadioButton;
  private TextView mShortcutView;
  private Drawable mSubMenuArrow;
  private ImageView mSubMenuArrowView;
  private int mTextAppearance;
  private Context mTextAppearanceContext;
  private TextView mTitleView;
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.listMenuViewStyle);
  }
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = TintTypedArray.obtainStyledAttributes(getContext(), paramAttributeSet, R.styleable.MenuView, paramInt, 0);
    mBackground = paramAttributeSet.getDrawable(R.styleable.MenuView_android_itemBackground);
    mTextAppearance = paramAttributeSet.getResourceId(R.styleable.MenuView_android_itemTextAppearance, -1);
    mPreserveIconSpacing = paramAttributeSet.getBoolean(R.styleable.MenuView_preserveIconSpacing, false);
    mTextAppearanceContext = paramContext;
    mSubMenuArrow = paramAttributeSet.getDrawable(R.styleable.MenuView_subMenuArrow);
    paramContext = paramContext.getTheme();
    paramInt = R.attr.dropDownListViewStyle;
    paramContext = paramContext.obtainStyledAttributes(null, new int[] { 16843049 }, paramInt, 0);
    mHasListDivider = paramContext.hasValue(0);
    paramAttributeSet.recycle();
    paramContext.recycle();
  }
  
  private void addContentView(View paramView)
  {
    addContentView(paramView, -1);
  }
  
  private void addContentView(View paramView, int paramInt)
  {
    LinearLayout localLinearLayout = mContent;
    if (localLinearLayout != null) {
      localLinearLayout.addView(paramView, paramInt);
    } else {
      addView(paramView, paramInt);
    }
  }
  
  private LayoutInflater getInflater()
  {
    if (mInflater == null) {
      mInflater = LayoutInflater.from(getContext());
    }
    return mInflater;
  }
  
  private void insertCheckBox()
  {
    CheckBox localCheckBox = (CheckBox)getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
    mCheckBox = localCheckBox;
    addContentView(localCheckBox);
  }
  
  private void insertIconView()
  {
    ImageView localImageView = (ImageView)getInflater().inflate(R.layout.abc_list_menu_item_icon, this, false);
    mIconView = localImageView;
    addContentView(localImageView, 0);
  }
  
  private void insertRadioButton()
  {
    RadioButton localRadioButton = (RadioButton)getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
    mRadioButton = localRadioButton;
    addContentView(localRadioButton);
  }
  
  private void setSubMenuArrowVisible(boolean paramBoolean)
  {
    ImageView localImageView = mSubMenuArrowView;
    if (localImageView != null)
    {
      int i;
      if (paramBoolean) {
        i = 0;
      } else {
        i = 8;
      }
      localImageView.setVisibility(i);
    }
  }
  
  public void adjustListItemSelectionBounds(Rect paramRect)
  {
    Object localObject = mGroupDivider;
    if ((localObject != null) && (((View)localObject).getVisibility() == 0))
    {
      localObject = (LinearLayout.LayoutParams)mGroupDivider.getLayoutParams();
      int i = top;
      top = (mGroupDivider.getHeight() + topMargin + bottomMargin + i);
    }
  }
  
  public MenuItemImpl getItemData()
  {
    return mItemData;
  }
  
  public void initialize(MenuItemImpl paramMenuItemImpl, int paramInt)
  {
    mItemData = paramMenuItemImpl;
    if (paramMenuItemImpl.isVisible()) {
      paramInt = 0;
    } else {
      paramInt = 8;
    }
    setVisibility(paramInt);
    setTitle(paramMenuItemImpl.getTitleForItemView(this));
    setCheckable(paramMenuItemImpl.isCheckable());
    setShortcut(paramMenuItemImpl.shouldShowShortcut(), paramMenuItemImpl.getShortcut());
    setIcon(paramMenuItemImpl.getIcon());
    setEnabled(paramMenuItemImpl.isEnabled());
    setSubMenuArrowVisible(paramMenuItemImpl.hasSubMenu());
    setContentDescription(paramMenuItemImpl.getContentDescription());
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    ViewCompat.setBackground(this, mBackground);
    Object localObject = (TextView)findViewById(R.id.title);
    mTitleView = ((TextView)localObject);
    int i = mTextAppearance;
    if (i != -1) {
      ((TextView)localObject).setTextAppearance(mTextAppearanceContext, i);
    }
    mShortcutView = ((TextView)findViewById(R.id.shortcut));
    localObject = (ImageView)findViewById(R.id.submenuarrow);
    mSubMenuArrowView = ((ImageView)localObject);
    if (localObject != null) {
      ((ImageView)localObject).setImageDrawable(mSubMenuArrow);
    }
    mGroupDivider = ((ImageView)findViewById(R.id.group_divider));
    mContent = ((LinearLayout)findViewById(R.id.content));
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    if ((mIconView != null) && (mPreserveIconSpacing))
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)mIconView.getLayoutParams();
      int i = height;
      if ((i > 0) && (width <= 0)) {
        width = i;
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public boolean prefersCondensedTitle()
  {
    return false;
  }
  
  public void setCheckable(boolean paramBoolean)
  {
    if ((!paramBoolean) && (mRadioButton == null) && (mCheckBox == null)) {
      return;
    }
    Object localObject1;
    Object localObject2;
    if (mItemData.isExclusiveCheckable())
    {
      if (mRadioButton == null) {
        insertRadioButton();
      }
      localObject1 = mRadioButton;
      localObject2 = mCheckBox;
    }
    else
    {
      if (mCheckBox == null) {
        insertCheckBox();
      }
      localObject1 = mCheckBox;
      localObject2 = mRadioButton;
    }
    if (paramBoolean)
    {
      ((CompoundButton)localObject1).setChecked(mItemData.isChecked());
      if (((View)localObject1).getVisibility() != 0) {
        ((View)localObject1).setVisibility(0);
      }
      if ((localObject2 != null) && (((View)localObject2).getVisibility() != 8)) {
        ((View)localObject2).setVisibility(8);
      }
    }
    else
    {
      localObject1 = mCheckBox;
      if (localObject1 != null) {
        ((View)localObject1).setVisibility(8);
      }
      localObject1 = mRadioButton;
      if (localObject1 != null) {
        ((View)localObject1).setVisibility(8);
      }
    }
  }
  
  public void setChecked(boolean paramBoolean)
  {
    Object localObject;
    if (mItemData.isExclusiveCheckable())
    {
      if (mRadioButton == null) {
        insertRadioButton();
      }
      localObject = mRadioButton;
    }
    else
    {
      if (mCheckBox == null) {
        insertCheckBox();
      }
      localObject = mCheckBox;
    }
    ((CompoundButton)localObject).setChecked(paramBoolean);
  }
  
  public void setForceShowIcon(boolean paramBoolean)
  {
    mForceShowIcon = paramBoolean;
    mPreserveIconSpacing = paramBoolean;
  }
  
  public void setGroupDividerEnabled(boolean paramBoolean)
  {
    ImageView localImageView = mGroupDivider;
    if (localImageView != null)
    {
      int i;
      if ((!mHasListDivider) && (paramBoolean)) {
        i = 0;
      } else {
        i = 8;
      }
      localImageView.setVisibility(i);
    }
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    int i;
    if ((!mItemData.shouldShowIcon()) && (!mForceShowIcon)) {
      i = 0;
    } else {
      i = 1;
    }
    if ((i == 0) && (!mPreserveIconSpacing)) {
      return;
    }
    ImageView localImageView = mIconView;
    if ((localImageView == null) && (paramDrawable == null) && (!mPreserveIconSpacing)) {
      return;
    }
    if (localImageView == null) {
      insertIconView();
    }
    if ((paramDrawable == null) && (!mPreserveIconSpacing))
    {
      mIconView.setVisibility(8);
    }
    else
    {
      localImageView = mIconView;
      if (i == 0) {
        paramDrawable = null;
      }
      localImageView.setImageDrawable(paramDrawable);
      if (mIconView.getVisibility() != 0) {
        mIconView.setVisibility(0);
      }
    }
  }
  
  public void setShortcut(boolean paramBoolean, char paramChar)
  {
    if ((paramBoolean) && (mItemData.shouldShowShortcut())) {
      paramChar = '\000';
    } else {
      paramChar = '\b';
    }
    if (paramChar == 0) {
      mShortcutView.setText(mItemData.getShortcutLabel());
    }
    if (mShortcutView.getVisibility() != paramChar) {
      mShortcutView.setVisibility(paramChar);
    }
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null)
    {
      mTitleView.setText(paramCharSequence);
      if (mTitleView.getVisibility() != 0) {
        mTitleView.setVisibility(0);
      }
    }
    else if (mTitleView.getVisibility() != 8)
    {
      mTitleView.setVisibility(8);
    }
  }
  
  public boolean showsIcon()
  {
    return mForceShowIcon;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.ListMenuItemView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */