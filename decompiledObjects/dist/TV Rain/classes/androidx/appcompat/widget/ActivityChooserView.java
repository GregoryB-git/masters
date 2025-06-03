package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.database.Observable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.dimen;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.string;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActivityChooserView
  extends ViewGroup
  implements ActivityChooserModel.ActivityChooserModelClient
{
  private final View mActivityChooserContent;
  private final Drawable mActivityChooserContentBackground;
  public final ActivityChooserViewAdapter mAdapter;
  private final Callbacks mCallbacks;
  private int mDefaultActionButtonContentDescription;
  public final FrameLayout mDefaultActivityButton;
  private final ImageView mDefaultActivityButtonImage;
  public final FrameLayout mExpandActivityOverflowButton;
  private final ImageView mExpandActivityOverflowButtonImage;
  public int mInitialActivityCount = 4;
  private boolean mIsAttachedToWindow;
  public boolean mIsSelectingDefaultActivity;
  private final int mListPopupMaxWidth;
  private ListPopupWindow mListPopupWindow;
  public final DataSetObserver mModelDataSetObserver = new DataSetObserver()
  {
    public void onChanged()
    {
      super.onChanged();
      mAdapter.notifyDataSetChanged();
    }
    
    public void onInvalidated()
    {
      super.onInvalidated();
      mAdapter.notifyDataSetInvalidated();
    }
  };
  public PopupWindow.OnDismissListener mOnDismissListener;
  private final ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener()
  {
    public void onGlobalLayout()
    {
      if (isShowingPopup()) {
        if (!isShown())
        {
          getListPopupWindow().dismiss();
        }
        else
        {
          getListPopupWindow().show();
          ActionProvider localActionProvider = mProvider;
          if (localActionProvider != null) {
            localActionProvider.subUiVisibilityChanged(true);
          }
        }
      }
    }
  };
  public ActionProvider mProvider;
  
  public ActivityChooserView(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActivityChooserView(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ActivityChooserView(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject1 = R.styleable.ActivityChooserView;
    Object localObject2 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject1, paramInt, 0);
    ViewCompat.saveAttributeDataForStyleable(this, paramContext, (int[])localObject1, paramAttributeSet, (TypedArray)localObject2, paramInt, 0);
    mInitialActivityCount = ((TypedArray)localObject2).getInt(R.styleable.ActivityChooserView_initialActivityCount, 4);
    paramAttributeSet = ((TypedArray)localObject2).getDrawable(R.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable);
    ((TypedArray)localObject2).recycle();
    LayoutInflater.from(getContext()).inflate(R.layout.abc_activity_chooser_view, this, true);
    localObject2 = new Callbacks();
    mCallbacks = ((Callbacks)localObject2);
    localObject1 = findViewById(R.id.activity_chooser_view_content);
    mActivityChooserContent = ((View)localObject1);
    mActivityChooserContentBackground = ((View)localObject1).getBackground();
    localObject1 = (FrameLayout)findViewById(R.id.default_activity_button);
    mDefaultActivityButton = ((FrameLayout)localObject1);
    ((View)localObject1).setOnClickListener((View.OnClickListener)localObject2);
    ((View)localObject1).setOnLongClickListener((View.OnLongClickListener)localObject2);
    paramInt = R.id.image;
    mDefaultActivityButtonImage = ((ImageView)((View)localObject1).findViewById(paramInt));
    localObject1 = (FrameLayout)findViewById(R.id.expand_activities_button);
    ((View)localObject1).setOnClickListener((View.OnClickListener)localObject2);
    ((View)localObject1).setAccessibilityDelegate(new View.AccessibilityDelegate()
    {
      public void onInitializeAccessibilityNodeInfo(View paramAnonymousView, AccessibilityNodeInfo paramAnonymousAccessibilityNodeInfo)
      {
        super.onInitializeAccessibilityNodeInfo(paramAnonymousView, paramAnonymousAccessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(paramAnonymousAccessibilityNodeInfo).setCanOpenPopup(true);
      }
    });
    ((View)localObject1).setOnTouchListener(new ForwardingListener((View)localObject1)
    {
      public ShowableListMenu getPopup()
      {
        return getListPopupWindow();
      }
      
      public boolean onForwardingStarted()
      {
        showPopup();
        return true;
      }
      
      public boolean onForwardingStopped()
      {
        dismissPopup();
        return true;
      }
    });
    mExpandActivityOverflowButton = ((FrameLayout)localObject1);
    localObject2 = (ImageView)((View)localObject1).findViewById(paramInt);
    mExpandActivityOverflowButtonImage = ((ImageView)localObject2);
    ((ImageView)localObject2).setImageDrawable(paramAttributeSet);
    paramAttributeSet = new ActivityChooserViewAdapter();
    mAdapter = paramAttributeSet;
    paramAttributeSet.registerDataSetObserver(new DataSetObserver()
    {
      public void onChanged()
      {
        super.onChanged();
        updateAppearance();
      }
    });
    paramContext = paramContext.getResources();
    mListPopupMaxWidth = Math.max(getDisplayMetricswidthPixels / 2, paramContext.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
  }
  
  public boolean dismissPopup()
  {
    if (isShowingPopup())
    {
      getListPopupWindow().dismiss();
      ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
      if (localViewTreeObserver.isAlive()) {
        localViewTreeObserver.removeGlobalOnLayoutListener(mOnGlobalLayoutListener);
      }
    }
    return true;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public ActivityChooserModel getDataModel()
  {
    return mAdapter.getDataModel();
  }
  
  public ListPopupWindow getListPopupWindow()
  {
    if (mListPopupWindow == null)
    {
      ListPopupWindow localListPopupWindow = new ListPopupWindow(getContext());
      mListPopupWindow = localListPopupWindow;
      localListPopupWindow.setAdapter(mAdapter);
      mListPopupWindow.setAnchorView(this);
      mListPopupWindow.setModal(true);
      mListPopupWindow.setOnItemClickListener(mCallbacks);
      mListPopupWindow.setOnDismissListener(mCallbacks);
    }
    return mListPopupWindow;
  }
  
  public boolean isShowingPopup()
  {
    return getListPopupWindow().isShowing();
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    ActivityChooserModel localActivityChooserModel = mAdapter.getDataModel();
    if (localActivityChooserModel != null) {
      localActivityChooserModel.registerObserver(mModelDataSetObserver);
    }
    mIsAttachedToWindow = true;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Object localObject = mAdapter.getDataModel();
    if (localObject != null) {
      ((Observable)localObject).unregisterObserver(mModelDataSetObserver);
    }
    localObject = getViewTreeObserver();
    if (((ViewTreeObserver)localObject).isAlive()) {
      ((ViewTreeObserver)localObject).removeGlobalOnLayoutListener(mOnGlobalLayoutListener);
    }
    if (isShowingPopup()) {
      dismissPopup();
    }
    mIsAttachedToWindow = false;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    mActivityChooserContent.layout(0, 0, paramInt3 - paramInt1, paramInt4 - paramInt2);
    if (!isShowingPopup()) {
      dismissPopup();
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    View localView = mActivityChooserContent;
    int i = paramInt2;
    if (mDefaultActivityButton.getVisibility() != 0) {
      i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt2), 1073741824);
    }
    measureChild(localView, paramInt1, i);
    setMeasuredDimension(localView.getMeasuredWidth(), localView.getMeasuredHeight());
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public void setActivityChooserModel(ActivityChooserModel paramActivityChooserModel)
  {
    mAdapter.setDataModel(paramActivityChooserModel);
    if (isShowingPopup())
    {
      dismissPopup();
      showPopup();
    }
  }
  
  public void setDefaultActionButtonContentDescription(int paramInt)
  {
    mDefaultActionButtonContentDescription = paramInt;
  }
  
  public void setExpandActivityOverflowButtonContentDescription(int paramInt)
  {
    String str = getContext().getString(paramInt);
    mExpandActivityOverflowButtonImage.setContentDescription(str);
  }
  
  public void setExpandActivityOverflowButtonDrawable(Drawable paramDrawable)
  {
    mExpandActivityOverflowButtonImage.setImageDrawable(paramDrawable);
  }
  
  public void setInitialActivityCount(int paramInt)
  {
    mInitialActivityCount = paramInt;
  }
  
  public void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    mOnDismissListener = paramOnDismissListener;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setProvider(ActionProvider paramActionProvider)
  {
    mProvider = paramActionProvider;
  }
  
  public boolean showPopup()
  {
    if ((!isShowingPopup()) && (mIsAttachedToWindow))
    {
      mIsSelectingDefaultActivity = false;
      showPopupUnchecked(mInitialActivityCount);
      return true;
    }
    return false;
  }
  
  public void showPopupUnchecked(int paramInt)
  {
    if (mAdapter.getDataModel() != null)
    {
      getViewTreeObserver().addOnGlobalLayoutListener(mOnGlobalLayoutListener);
      int i;
      if (mDefaultActivityButton.getVisibility() == 0) {
        i = 1;
      } else {
        i = 0;
      }
      int j = mAdapter.getActivityCount();
      if ((paramInt != Integer.MAX_VALUE) && (j > paramInt + i))
      {
        mAdapter.setShowFooterView(true);
        mAdapter.setMaxActivityCount(paramInt - 1);
      }
      else
      {
        mAdapter.setShowFooterView(false);
        mAdapter.setMaxActivityCount(paramInt);
      }
      ListPopupWindow localListPopupWindow = getListPopupWindow();
      if (!localListPopupWindow.isShowing())
      {
        if ((!mIsSelectingDefaultActivity) && (i != 0)) {
          mAdapter.setShowDefaultActivity(false, false);
        } else {
          mAdapter.setShowDefaultActivity(true, i);
        }
        localListPopupWindow.setContentWidth(Math.min(mAdapter.measureContentWidth(), mListPopupMaxWidth));
        localListPopupWindow.show();
        ActionProvider localActionProvider = mProvider;
        if (localActionProvider != null) {
          localActionProvider.subUiVisibilityChanged(true);
        }
        localListPopupWindow.getListView().setContentDescription(getContext().getString(R.string.abc_activitychooserview_choose_application));
        localListPopupWindow.getListView().setSelector(new ColorDrawable(0));
      }
      return;
    }
    throw new IllegalStateException("No data model. Did you call #setDataModel?");
  }
  
  public void updateAppearance()
  {
    if (mAdapter.getCount() > 0) {
      mExpandActivityOverflowButton.setEnabled(true);
    } else {
      mExpandActivityOverflowButton.setEnabled(false);
    }
    int i = mAdapter.getActivityCount();
    int j = mAdapter.getHistorySize();
    if ((i != 1) && ((i <= 1) || (j <= 0)))
    {
      mDefaultActivityButton.setVisibility(8);
    }
    else
    {
      mDefaultActivityButton.setVisibility(0);
      Object localObject = mAdapter.getDefaultActivity();
      PackageManager localPackageManager = getContext().getPackageManager();
      mDefaultActivityButtonImage.setImageDrawable(((ResolveInfo)localObject).loadIcon(localPackageManager));
      if (mDefaultActionButtonContentDescription != 0)
      {
        localObject = ((ResolveInfo)localObject).loadLabel(localPackageManager);
        localObject = getContext().getString(mDefaultActionButtonContentDescription, new Object[] { localObject });
        mDefaultActivityButton.setContentDescription((CharSequence)localObject);
      }
    }
    if (mDefaultActivityButton.getVisibility() == 0) {
      mActivityChooserContent.setBackgroundDrawable(mActivityChooserContentBackground);
    } else {
      mActivityChooserContent.setBackgroundDrawable(null);
    }
  }
  
  public class ActivityChooserViewAdapter
    extends BaseAdapter
  {
    private static final int ITEM_VIEW_TYPE_ACTIVITY = 0;
    private static final int ITEM_VIEW_TYPE_COUNT = 3;
    private static final int ITEM_VIEW_TYPE_FOOTER = 1;
    public static final int MAX_ACTIVITY_COUNT_DEFAULT = 4;
    public static final int MAX_ACTIVITY_COUNT_UNLIMITED = Integer.MAX_VALUE;
    private ActivityChooserModel mDataModel;
    private boolean mHighlightDefaultActivity;
    private int mMaxActivityCount = 4;
    private boolean mShowDefaultActivity;
    private boolean mShowFooterView;
    
    public ActivityChooserViewAdapter() {}
    
    public int getActivityCount()
    {
      return mDataModel.getActivityCount();
    }
    
    public int getCount()
    {
      int i = mDataModel.getActivityCount();
      int j = i;
      if (!mShowDefaultActivity)
      {
        j = i;
        if (mDataModel.getDefaultActivity() != null) {
          j = i - 1;
        }
      }
      i = Math.min(j, mMaxActivityCount);
      j = i;
      if (mShowFooterView) {
        j = i + 1;
      }
      return j;
    }
    
    public ActivityChooserModel getDataModel()
    {
      return mDataModel;
    }
    
    public ResolveInfo getDefaultActivity()
    {
      return mDataModel.getDefaultActivity();
    }
    
    public int getHistorySize()
    {
      return mDataModel.getHistorySize();
    }
    
    public Object getItem(int paramInt)
    {
      int i = getItemViewType(paramInt);
      if (i != 0)
      {
        if (i == 1) {
          return null;
        }
        throw new IllegalArgumentException();
      }
      i = paramInt;
      if (!mShowDefaultActivity)
      {
        i = paramInt;
        if (mDataModel.getDefaultActivity() != null) {
          i = paramInt + 1;
        }
      }
      return mDataModel.getActivity(i);
    }
    
    public long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public int getItemViewType(int paramInt)
    {
      if ((mShowFooterView) && (paramInt == getCount() - 1)) {
        return 1;
      }
      return 0;
    }
    
    public boolean getShowDefaultActivity()
    {
      return mShowDefaultActivity;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      int i = getItemViewType(paramInt);
      View localView;
      if (i != 0)
      {
        if (i == 1)
        {
          if (paramView != null)
          {
            localView = paramView;
            if (paramView.getId() == 1) {}
          }
          else
          {
            localView = LayoutInflater.from(getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, paramViewGroup, false);
            localView.setId(1);
            ((TextView)localView.findViewById(R.id.title)).setText(getContext().getString(R.string.abc_activity_chooser_view_see_all));
          }
          return localView;
        }
        throw new IllegalArgumentException();
      }
      if (paramView != null)
      {
        localView = paramView;
        if (paramView.getId() == R.id.list_item) {}
      }
      else
      {
        localView = LayoutInflater.from(getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, paramViewGroup, false);
      }
      PackageManager localPackageManager = getContext().getPackageManager();
      paramView = (ImageView)localView.findViewById(R.id.icon);
      paramViewGroup = (ResolveInfo)getItem(paramInt);
      paramView.setImageDrawable(paramViewGroup.loadIcon(localPackageManager));
      ((TextView)localView.findViewById(R.id.title)).setText(paramViewGroup.loadLabel(localPackageManager));
      if ((mShowDefaultActivity) && (paramInt == 0) && (mHighlightDefaultActivity)) {
        localView.setActivated(true);
      } else {
        localView.setActivated(false);
      }
      return localView;
    }
    
    public int getViewTypeCount()
    {
      return 3;
    }
    
    public int measureContentWidth()
    {
      int i = mMaxActivityCount;
      mMaxActivityCount = Integer.MAX_VALUE;
      int j = 0;
      int k = View.MeasureSpec.makeMeasureSpec(0, 0);
      int m = View.MeasureSpec.makeMeasureSpec(0, 0);
      int n = getCount();
      int i1 = 0;
      View localView = null;
      while (j < n)
      {
        localView = getView(j, localView, null);
        localView.measure(k, m);
        i1 = Math.max(i1, localView.getMeasuredWidth());
        j++;
      }
      mMaxActivityCount = i;
      return i1;
    }
    
    public void setDataModel(ActivityChooserModel paramActivityChooserModel)
    {
      ActivityChooserModel localActivityChooserModel = mAdapter.getDataModel();
      if ((localActivityChooserModel != null) && (isShown())) {
        localActivityChooserModel.unregisterObserver(mModelDataSetObserver);
      }
      mDataModel = paramActivityChooserModel;
      if ((paramActivityChooserModel != null) && (isShown())) {
        paramActivityChooserModel.registerObserver(mModelDataSetObserver);
      }
      notifyDataSetChanged();
    }
    
    public void setMaxActivityCount(int paramInt)
    {
      if (mMaxActivityCount != paramInt)
      {
        mMaxActivityCount = paramInt;
        notifyDataSetChanged();
      }
    }
    
    public void setShowDefaultActivity(boolean paramBoolean1, boolean paramBoolean2)
    {
      if ((mShowDefaultActivity != paramBoolean1) || (mHighlightDefaultActivity != paramBoolean2))
      {
        mShowDefaultActivity = paramBoolean1;
        mHighlightDefaultActivity = paramBoolean2;
        notifyDataSetChanged();
      }
    }
    
    public void setShowFooterView(boolean paramBoolean)
    {
      if (mShowFooterView != paramBoolean)
      {
        mShowFooterView = paramBoolean;
        notifyDataSetChanged();
      }
    }
  }
  
  public class Callbacks
    implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener
  {
    public Callbacks() {}
    
    private void notifyOnDismissListener()
    {
      PopupWindow.OnDismissListener localOnDismissListener = mOnDismissListener;
      if (localOnDismissListener != null) {
        localOnDismissListener.onDismiss();
      }
    }
    
    public void onClick(View paramView)
    {
      ActivityChooserView localActivityChooserView = ActivityChooserView.this;
      if (paramView == mDefaultActivityButton)
      {
        localActivityChooserView.dismissPopup();
        paramView = mAdapter.getDefaultActivity();
        int i = mAdapter.getDataModel().getActivityIndex(paramView);
        paramView = mAdapter.getDataModel().chooseActivity(i);
        if (paramView != null)
        {
          paramView.addFlags(524288);
          getContext().startActivity(paramView);
        }
      }
      else
      {
        if (paramView != mExpandActivityOverflowButton) {
          break label106;
        }
        mIsSelectingDefaultActivity = false;
        localActivityChooserView.showPopupUnchecked(mInitialActivityCount);
      }
      return;
      label106:
      throw new IllegalArgumentException();
    }
    
    public void onDismiss()
    {
      notifyOnDismissListener();
      ActionProvider localActionProvider = mProvider;
      if (localActionProvider != null) {
        localActionProvider.subUiVisibilityChanged(false);
      }
    }
    
    public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
    {
      int i = ((ActivityChooserView.ActivityChooserViewAdapter)paramAdapterView.getAdapter()).getItemViewType(paramInt);
      if (i != 0)
      {
        if (i == 1) {
          showPopupUnchecked(Integer.MAX_VALUE);
        } else {
          throw new IllegalArgumentException();
        }
      }
      else
      {
        dismissPopup();
        paramAdapterView = ActivityChooserView.this;
        if (mIsSelectingDefaultActivity)
        {
          if (paramInt > 0) {
            mAdapter.getDataModel().setDefaultActivity(paramInt);
          }
        }
        else
        {
          if (!mAdapter.getShowDefaultActivity()) {
            paramInt++;
          }
          paramAdapterView = mAdapter.getDataModel().chooseActivity(paramInt);
          if (paramAdapterView != null)
          {
            paramAdapterView.addFlags(524288);
            getContext().startActivity(paramAdapterView);
          }
        }
      }
    }
    
    public boolean onLongClick(View paramView)
    {
      ActivityChooserView localActivityChooserView = ActivityChooserView.this;
      if (paramView == mDefaultActivityButton)
      {
        if (mAdapter.getCount() > 0)
        {
          paramView = ActivityChooserView.this;
          mIsSelectingDefaultActivity = true;
          paramView.showPopupUnchecked(mInitialActivityCount);
        }
        return true;
      }
      throw new IllegalArgumentException();
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static class InnerLayout
    extends LinearLayout
  {
    private static final int[] TINT_ATTRS = { 16842964 };
    
    public InnerLayout(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, TINT_ATTRS);
      setBackgroundDrawable(paramContext.getDrawable(0));
      paramContext.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActivityChooserView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */