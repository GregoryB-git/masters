package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import androidx.annotation.AttrRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.view.ViewCompat;
import androidx.core.widget.PopupWindowCompat;
import e;
import java.lang.reflect.Method;
import z2;

public class ListPopupWindow
  implements ShowableListMenu
{
  private static final boolean DEBUG = false;
  public static final int EXPAND_LIST_TIMEOUT = 250;
  public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
  public static final int INPUT_METHOD_NEEDED = 1;
  public static final int INPUT_METHOD_NOT_NEEDED = 2;
  public static final int MATCH_PARENT = -1;
  public static final int POSITION_PROMPT_ABOVE = 0;
  public static final int POSITION_PROMPT_BELOW = 1;
  private static final String TAG = "ListPopupWindow";
  public static final int WRAP_CONTENT = -2;
  private static Method sGetMaxAvailableHeightMethod;
  private static Method sSetClipToWindowEnabledMethod;
  private static Method sSetEpicenterBoundsMethod;
  private ListAdapter mAdapter;
  private Context mContext;
  private boolean mDropDownAlwaysVisible = false;
  private View mDropDownAnchorView;
  private int mDropDownGravity = 0;
  private int mDropDownHeight = -2;
  private int mDropDownHorizontalOffset;
  public DropDownListView mDropDownList;
  private Drawable mDropDownListHighlight;
  private int mDropDownVerticalOffset;
  private boolean mDropDownVerticalOffsetSet;
  private int mDropDownWidth = -2;
  private int mDropDownWindowLayoutType = 1002;
  private Rect mEpicenterBounds;
  private boolean mForceIgnoreOutsideTouch = false;
  public final Handler mHandler;
  private final ListSelectorHider mHideSelector = new ListSelectorHider();
  private AdapterView.OnItemClickListener mItemClickListener;
  private AdapterView.OnItemSelectedListener mItemSelectedListener;
  public int mListItemExpandMaximum = Integer.MAX_VALUE;
  private boolean mModal;
  private DataSetObserver mObserver;
  private boolean mOverlapAnchor;
  private boolean mOverlapAnchorSet;
  public PopupWindow mPopup;
  private int mPromptPosition = 0;
  private View mPromptView;
  public final ResizePopupRunnable mResizePopupRunnable = new ResizePopupRunnable();
  private final PopupScrollListener mScrollListener = new PopupScrollListener();
  private Runnable mShowDropDownRunnable;
  private final Rect mTempRect = new Rect();
  private final PopupTouchInterceptor mTouchInterceptor = new PopupTouchInterceptor();
  
  static
  {
    if (Build.VERSION.SDK_INT <= 28)
    {
      try
      {
        sSetClipToWindowEnabledMethod = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[] { Boolean.TYPE });
      }
      catch (NoSuchMethodException localNoSuchMethodException1)
      {
        Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
      }
      try
      {
        sSetEpicenterBoundsMethod = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[] { Rect.class });
      }
      catch (NoSuchMethodException localNoSuchMethodException2)
      {
        Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
      }
    }
  }
  
  public ListPopupWindow(@NonNull Context paramContext)
  {
    this(paramContext, null, R.attr.listPopupWindowStyle);
  }
  
  public ListPopupWindow(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.listPopupWindowStyle);
  }
  
  public ListPopupWindow(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, @AttrRes int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public ListPopupWindow(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, @AttrRes int paramInt1, @StyleRes int paramInt2)
  {
    mContext = paramContext;
    mHandler = new Handler(paramContext.getMainLooper());
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.ListPopupWindow, paramInt1, paramInt2);
    mDropDownHorizontalOffset = localTypedArray.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
    int i = localTypedArray.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
    mDropDownVerticalOffset = i;
    if (i != 0) {
      mDropDownVerticalOffsetSet = true;
    }
    localTypedArray.recycle();
    paramContext = new AppCompatPopupWindow(paramContext, paramAttributeSet, paramInt1, paramInt2);
    mPopup = paramContext;
    paramContext.setInputMethodMode(1);
  }
  
  private int buildDropDown()
  {
    Object localObject1 = mDropDownList;
    boolean bool = true;
    Object localObject2;
    int i;
    int j;
    if (localObject1 == null)
    {
      localObject1 = mContext;
      mShowDropDownRunnable = new Runnable()
      {
        public void run()
        {
          View localView = getAnchorView();
          if ((localView != null) && (localView.getWindowToken() != null)) {
            show();
          }
        }
      };
      localObject2 = createDropDownListView((Context)localObject1, mModal ^ true);
      mDropDownList = ((DropDownListView)localObject2);
      Object localObject3 = mDropDownListHighlight;
      if (localObject3 != null) {
        ((DropDownListView)localObject2).setSelector((Drawable)localObject3);
      }
      mDropDownList.setAdapter(mAdapter);
      mDropDownList.setOnItemClickListener(mItemClickListener);
      mDropDownList.setFocusable(true);
      mDropDownList.setFocusableInTouchMode(true);
      mDropDownList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
      {
        public void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          if (paramAnonymousInt != -1)
          {
            paramAnonymousAdapterView = mDropDownList;
            if (paramAnonymousAdapterView != null) {
              paramAnonymousAdapterView.setListSelectionHidden(false);
            }
          }
        }
        
        public void onNothingSelected(AdapterView<?> paramAnonymousAdapterView) {}
      });
      mDropDownList.setOnScrollListener(mScrollListener);
      localObject2 = mItemSelectedListener;
      if (localObject2 != null) {
        mDropDownList.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)localObject2);
      }
      localObject2 = mDropDownList;
      localObject3 = mPromptView;
      if (localObject3 != null)
      {
        localObject1 = new LinearLayout((Context)localObject1);
        ((LinearLayout)localObject1).setOrientation(1);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0F);
        i = mPromptPosition;
        if (i != 0)
        {
          if (i != 1)
          {
            localObject2 = z2.t("Invalid hint position ");
            ((StringBuilder)localObject2).append(mPromptPosition);
            Log.e("ListPopupWindow", ((StringBuilder)localObject2).toString());
          }
          else
          {
            ((ViewGroup)localObject1).addView((View)localObject2, localLayoutParams);
            ((ViewGroup)localObject1).addView((View)localObject3);
          }
        }
        else
        {
          ((ViewGroup)localObject1).addView((View)localObject3);
          ((ViewGroup)localObject1).addView((View)localObject2, localLayoutParams);
        }
        i = mDropDownWidth;
        if (i >= 0)
        {
          j = Integer.MIN_VALUE;
        }
        else
        {
          i = 0;
          j = i;
        }
        ((View)localObject3).measure(View.MeasureSpec.makeMeasureSpec(i, j), 0);
        localObject2 = (LinearLayout.LayoutParams)((View)localObject3).getLayoutParams();
        i = ((View)localObject3).getMeasuredHeight() + topMargin + bottomMargin;
      }
      else
      {
        i = 0;
        localObject1 = localObject2;
      }
      mPopup.setContentView((View)localObject1);
    }
    else
    {
      localObject1 = (ViewGroup)mPopup.getContentView();
      localObject1 = mPromptView;
      if (localObject1 != null)
      {
        localObject2 = (LinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
        i = ((View)localObject1).getMeasuredHeight() + topMargin + bottomMargin;
      }
      else
      {
        i = 0;
      }
    }
    localObject1 = mPopup.getBackground();
    int m;
    if (localObject1 != null)
    {
      ((Drawable)localObject1).getPadding(mTempRect);
      localObject1 = mTempRect;
      k = top;
      j = bottom + k;
      m = j;
      if (!mDropDownVerticalOffsetSet)
      {
        mDropDownVerticalOffset = (-k);
        m = j;
      }
    }
    else
    {
      mTempRect.setEmpty();
      m = 0;
    }
    if (mPopup.getInputMethodMode() != 2) {
      bool = false;
    }
    int k = getMaxAvailableHeight(getAnchorView(), mDropDownVerticalOffset, bool);
    if ((!mDropDownAlwaysVisible) && (mDropDownHeight != -1))
    {
      j = mDropDownWidth;
      if (j != -2)
      {
        if (j != -1)
        {
          j = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
        }
        else
        {
          j = mContext.getResources().getDisplayMetrics().widthPixels;
          localObject1 = mTempRect;
          j = View.MeasureSpec.makeMeasureSpec(j - (left + right), 1073741824);
        }
      }
      else
      {
        j = mContext.getResources().getDisplayMetrics().widthPixels;
        localObject1 = mTempRect;
        j = View.MeasureSpec.makeMeasureSpec(j - (left + right), Integer.MIN_VALUE);
      }
      k = mDropDownList.measureHeightOfChildrenCompat(j, 0, -1, k - i, -1);
      j = i;
      if (k > 0)
      {
        j = mDropDownList.getPaddingTop();
        j = i + (mDropDownList.getPaddingBottom() + j + m);
      }
      return k + j;
    }
    return k + m;
  }
  
  private int getMaxAvailableHeight(View paramView, int paramInt, boolean paramBoolean)
  {
    return Api24Impl.getMaxAvailableHeight(mPopup, paramView, paramInt, paramBoolean);
  }
  
  private static boolean isConfirmKey(int paramInt)
  {
    boolean bool;
    if ((paramInt != 66) && (paramInt != 23)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private void removePromptView()
  {
    Object localObject = mPromptView;
    if (localObject != null)
    {
      localObject = ((View)localObject).getParent();
      if ((localObject instanceof ViewGroup)) {
        ((ViewGroup)localObject).removeView(mPromptView);
      }
    }
  }
  
  private void setPopupClipToScreenEnabled(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT <= 28)
    {
      Method localMethod = sSetClipToWindowEnabledMethod;
      if (localMethod != null) {
        try
        {
          localMethod.invoke(mPopup, new Object[] { Boolean.valueOf(paramBoolean) });
        }
        catch (Exception localException)
        {
          Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
      }
    }
    else
    {
      Api29Impl.setIsClippedToScreen(mPopup, paramBoolean);
    }
  }
  
  public void clearListSelection()
  {
    DropDownListView localDropDownListView = mDropDownList;
    if (localDropDownListView != null)
    {
      localDropDownListView.setListSelectionHidden(true);
      localDropDownListView.requestLayout();
    }
  }
  
  public View.OnTouchListener createDragToOpenListener(View paramView)
  {
    new ForwardingListener(paramView)
    {
      public ListPopupWindow getPopup()
      {
        return ListPopupWindow.this;
      }
    };
  }
  
  @NonNull
  public DropDownListView createDropDownListView(Context paramContext, boolean paramBoolean)
  {
    return new DropDownListView(paramContext, paramBoolean);
  }
  
  public void dismiss()
  {
    mPopup.dismiss();
    removePromptView();
    mPopup.setContentView(null);
    mDropDownList = null;
    mHandler.removeCallbacks(mResizePopupRunnable);
  }
  
  @Nullable
  public View getAnchorView()
  {
    return mDropDownAnchorView;
  }
  
  @StyleRes
  public int getAnimationStyle()
  {
    return mPopup.getAnimationStyle();
  }
  
  @Nullable
  public Drawable getBackground()
  {
    return mPopup.getBackground();
  }
  
  @Nullable
  public Rect getEpicenterBounds()
  {
    Rect localRect;
    if (mEpicenterBounds != null) {
      localRect = new Rect(mEpicenterBounds);
    } else {
      localRect = null;
    }
    return localRect;
  }
  
  public int getHeight()
  {
    return mDropDownHeight;
  }
  
  public int getHorizontalOffset()
  {
    return mDropDownHorizontalOffset;
  }
  
  public int getInputMethodMode()
  {
    return mPopup.getInputMethodMode();
  }
  
  @Nullable
  public ListView getListView()
  {
    return mDropDownList;
  }
  
  public int getPromptPosition()
  {
    return mPromptPosition;
  }
  
  @Nullable
  public Object getSelectedItem()
  {
    if (!isShowing()) {
      return null;
    }
    return mDropDownList.getSelectedItem();
  }
  
  public long getSelectedItemId()
  {
    if (!isShowing()) {
      return Long.MIN_VALUE;
    }
    return mDropDownList.getSelectedItemId();
  }
  
  public int getSelectedItemPosition()
  {
    if (!isShowing()) {
      return -1;
    }
    return mDropDownList.getSelectedItemPosition();
  }
  
  @Nullable
  public View getSelectedView()
  {
    if (!isShowing()) {
      return null;
    }
    return mDropDownList.getSelectedView();
  }
  
  public int getSoftInputMode()
  {
    return mPopup.getSoftInputMode();
  }
  
  public int getVerticalOffset()
  {
    if (!mDropDownVerticalOffsetSet) {
      return 0;
    }
    return mDropDownVerticalOffset;
  }
  
  public int getWidth()
  {
    return mDropDownWidth;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public boolean isDropDownAlwaysVisible()
  {
    return mDropDownAlwaysVisible;
  }
  
  public boolean isInputMethodNotNeeded()
  {
    boolean bool;
    if (mPopup.getInputMethodMode() == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isModal()
  {
    return mModal;
  }
  
  public boolean isShowing()
  {
    return mPopup.isShowing();
  }
  
  public boolean onKeyDown(int paramInt, @NonNull KeyEvent paramKeyEvent)
  {
    if ((isShowing()) && (paramInt != 62) && ((mDropDownList.getSelectedItemPosition() >= 0) || (!isConfirmKey(paramInt))))
    {
      int i = mDropDownList.getSelectedItemPosition();
      boolean bool1 = mPopup.isAboveAnchor() ^ true;
      ListAdapter localListAdapter = mAdapter;
      int j = Integer.MAX_VALUE;
      int k = Integer.MIN_VALUE;
      if (localListAdapter != null)
      {
        boolean bool2 = localListAdapter.areAllItemsEnabled();
        if (bool2) {
          j = 0;
        } else {
          j = mDropDownList.lookForSelectablePosition(0, true);
        }
        if (bool2) {
          k = localListAdapter.getCount() - 1;
        } else {
          k = mDropDownList.lookForSelectablePosition(localListAdapter.getCount() - 1, false);
        }
      }
      if (((bool1) && (paramInt == 19) && (i <= j)) || ((!bool1) && (paramInt == 20) && (i >= k)))
      {
        clearListSelection();
        mPopup.setInputMethodMode(1);
        show();
        return true;
      }
      mDropDownList.setListSelectionHidden(false);
      if (mDropDownList.onKeyDown(paramInt, paramKeyEvent))
      {
        mPopup.setInputMethodMode(2);
        mDropDownList.requestFocusFromTouch();
        show();
        if ((paramInt == 19) || (paramInt == 20) || (paramInt == 23) || (paramInt == 66)) {
          return true;
        }
      }
      else if ((bool1) && (paramInt == 20))
      {
        if (i == k) {
          return true;
        }
      }
      else if ((!bool1) && (paramInt == 19) && (i == j))
      {
        return true;
      }
    }
    return false;
  }
  
  public boolean onKeyPreIme(int paramInt, @NonNull KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (isShowing()))
    {
      Object localObject = mDropDownAnchorView;
      if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
      {
        localObject = ((View)localObject).getKeyDispatcherState();
        if (localObject != null) {
          ((KeyEvent.DispatcherState)localObject).startTracking(paramKeyEvent, this);
        }
        return true;
      }
      if (paramKeyEvent.getAction() == 1)
      {
        localObject = ((View)localObject).getKeyDispatcherState();
        if (localObject != null) {
          ((KeyEvent.DispatcherState)localObject).handleUpEvent(paramKeyEvent);
        }
        if ((paramKeyEvent.isTracking()) && (!paramKeyEvent.isCanceled()))
        {
          dismiss();
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean onKeyUp(int paramInt, @NonNull KeyEvent paramKeyEvent)
  {
    if ((isShowing()) && (mDropDownList.getSelectedItemPosition() >= 0))
    {
      boolean bool = mDropDownList.onKeyUp(paramInt, paramKeyEvent);
      if ((bool) && (isConfirmKey(paramInt))) {
        dismiss();
      }
      return bool;
    }
    return false;
  }
  
  public boolean performItemClick(int paramInt)
  {
    if (isShowing())
    {
      if (mItemClickListener != null)
      {
        DropDownListView localDropDownListView = mDropDownList;
        View localView = localDropDownListView.getChildAt(paramInt - localDropDownListView.getFirstVisiblePosition());
        ListAdapter localListAdapter = localDropDownListView.getAdapter();
        mItemClickListener.onItemClick(localDropDownListView, localView, paramInt, localListAdapter.getItemId(paramInt));
      }
      return true;
    }
    return false;
  }
  
  public void postShow()
  {
    mHandler.post(mShowDropDownRunnable);
  }
  
  public void setAdapter(@Nullable ListAdapter paramListAdapter)
  {
    DataSetObserver localDataSetObserver = mObserver;
    if (localDataSetObserver == null)
    {
      mObserver = new PopupDataSetObserver();
    }
    else
    {
      ListAdapter localListAdapter = mAdapter;
      if (localListAdapter != null) {
        localListAdapter.unregisterDataSetObserver(localDataSetObserver);
      }
    }
    mAdapter = paramListAdapter;
    if (paramListAdapter != null) {
      paramListAdapter.registerDataSetObserver(mObserver);
    }
    paramListAdapter = mDropDownList;
    if (paramListAdapter != null) {
      paramListAdapter.setAdapter(mAdapter);
    }
  }
  
  public void setAnchorView(@Nullable View paramView)
  {
    mDropDownAnchorView = paramView;
  }
  
  public void setAnimationStyle(@StyleRes int paramInt)
  {
    mPopup.setAnimationStyle(paramInt);
  }
  
  public void setBackgroundDrawable(@Nullable Drawable paramDrawable)
  {
    mPopup.setBackgroundDrawable(paramDrawable);
  }
  
  public void setContentWidth(int paramInt)
  {
    Object localObject = mPopup.getBackground();
    if (localObject != null)
    {
      ((Drawable)localObject).getPadding(mTempRect);
      localObject = mTempRect;
      mDropDownWidth = (left + right + paramInt);
    }
    else
    {
      setWidth(paramInt);
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setDropDownAlwaysVisible(boolean paramBoolean)
  {
    mDropDownAlwaysVisible = paramBoolean;
  }
  
  public void setDropDownGravity(int paramInt)
  {
    mDropDownGravity = paramInt;
  }
  
  public void setEpicenterBounds(@Nullable Rect paramRect)
  {
    if (paramRect != null) {
      paramRect = new Rect(paramRect);
    } else {
      paramRect = null;
    }
    mEpicenterBounds = paramRect;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setForceIgnoreOutsideTouch(boolean paramBoolean)
  {
    mForceIgnoreOutsideTouch = paramBoolean;
  }
  
  public void setHeight(int paramInt)
  {
    if ((paramInt < 0) && (-2 != paramInt) && (-1 != paramInt)) {
      throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
    }
    mDropDownHeight = paramInt;
  }
  
  public void setHorizontalOffset(int paramInt)
  {
    mDropDownHorizontalOffset = paramInt;
  }
  
  public void setInputMethodMode(int paramInt)
  {
    mPopup.setInputMethodMode(paramInt);
  }
  
  public void setListItemExpandMax(int paramInt)
  {
    mListItemExpandMaximum = paramInt;
  }
  
  public void setListSelector(Drawable paramDrawable)
  {
    mDropDownListHighlight = paramDrawable;
  }
  
  public void setModal(boolean paramBoolean)
  {
    mModal = paramBoolean;
    mPopup.setFocusable(paramBoolean);
  }
  
  public void setOnDismissListener(@Nullable PopupWindow.OnDismissListener paramOnDismissListener)
  {
    mPopup.setOnDismissListener(paramOnDismissListener);
  }
  
  public void setOnItemClickListener(@Nullable AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    mItemClickListener = paramOnItemClickListener;
  }
  
  public void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    mItemSelectedListener = paramOnItemSelectedListener;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setOverlapAnchor(boolean paramBoolean)
  {
    mOverlapAnchorSet = true;
    mOverlapAnchor = paramBoolean;
  }
  
  public void setPromptPosition(int paramInt)
  {
    mPromptPosition = paramInt;
  }
  
  public void setPromptView(@Nullable View paramView)
  {
    boolean bool = isShowing();
    if (bool) {
      removePromptView();
    }
    mPromptView = paramView;
    if (bool) {
      show();
    }
  }
  
  public void setSelection(int paramInt)
  {
    DropDownListView localDropDownListView = mDropDownList;
    if ((isShowing()) && (localDropDownListView != null))
    {
      localDropDownListView.setListSelectionHidden(false);
      localDropDownListView.setSelection(paramInt);
      if (localDropDownListView.getChoiceMode() != 0) {
        localDropDownListView.setItemChecked(paramInt, true);
      }
    }
  }
  
  public void setSoftInputMode(int paramInt)
  {
    mPopup.setSoftInputMode(paramInt);
  }
  
  public void setVerticalOffset(int paramInt)
  {
    mDropDownVerticalOffset = paramInt;
    mDropDownVerticalOffsetSet = true;
  }
  
  public void setWidth(int paramInt)
  {
    mDropDownWidth = paramInt;
  }
  
  public void setWindowLayoutType(int paramInt)
  {
    mDropDownWindowLayoutType = paramInt;
  }
  
  public void show()
  {
    int i = buildDropDown();
    boolean bool1 = isInputMethodNotNeeded();
    PopupWindowCompat.setWindowLayoutType(mPopup, mDropDownWindowLayoutType);
    boolean bool2 = mPopup.isShowing();
    boolean bool3 = true;
    int j;
    int k;
    Object localObject;
    if (bool2)
    {
      if (!ViewCompat.isAttachedToWindow(getAnchorView())) {
        return;
      }
      j = mDropDownWidth;
      if (j == -1)
      {
        k = -1;
      }
      else
      {
        k = j;
        if (j == -2) {
          k = getAnchorView().getWidth();
        }
      }
      j = mDropDownHeight;
      if (j == -1)
      {
        if (!bool1) {
          i = -1;
        }
        if (bool1)
        {
          localObject = mPopup;
          if (mDropDownWidth == -1) {
            j = -1;
          } else {
            j = 0;
          }
          ((PopupWindow)localObject).setWidth(j);
          mPopup.setHeight(0);
        }
        else
        {
          localObject = mPopup;
          if (mDropDownWidth == -1) {
            j = -1;
          } else {
            j = 0;
          }
          ((PopupWindow)localObject).setWidth(j);
          mPopup.setHeight(-1);
        }
      }
      else if (j != -2)
      {
        i = j;
      }
      localObject = mPopup;
      if ((mForceIgnoreOutsideTouch) || (mDropDownAlwaysVisible)) {
        bool3 = false;
      }
      ((PopupWindow)localObject).setOutsideTouchable(bool3);
      localObject = mPopup;
      View localView = getAnchorView();
      j = mDropDownHorizontalOffset;
      int m = mDropDownVerticalOffset;
      if (k < 0) {
        k = -1;
      }
      if (i < 0) {
        i = -1;
      }
      ((PopupWindow)localObject).update(localView, j, m, k, i);
    }
    else
    {
      j = mDropDownWidth;
      if (j == -1)
      {
        k = -1;
      }
      else
      {
        k = j;
        if (j == -2) {
          k = getAnchorView().getWidth();
        }
      }
      j = mDropDownHeight;
      if (j == -1) {
        i = -1;
      } else if (j != -2) {
        i = j;
      }
      mPopup.setWidth(k);
      mPopup.setHeight(i);
      setPopupClipToScreenEnabled(true);
      localObject = mPopup;
      if ((!mForceIgnoreOutsideTouch) && (!mDropDownAlwaysVisible)) {
        bool3 = true;
      } else {
        bool3 = false;
      }
      ((PopupWindow)localObject).setOutsideTouchable(bool3);
      mPopup.setTouchInterceptor(mTouchInterceptor);
      if (mOverlapAnchorSet) {
        PopupWindowCompat.setOverlapAnchor(mPopup, mOverlapAnchor);
      }
      if (Build.VERSION.SDK_INT <= 28)
      {
        localObject = sSetEpicenterBoundsMethod;
        if (localObject != null) {
          try
          {
            ((Method)localObject).invoke(mPopup, new Object[] { mEpicenterBounds });
          }
          catch (Exception localException)
          {
            Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", localException);
          }
        }
      }
      else
      {
        Api29Impl.setEpicenterBounds(mPopup, mEpicenterBounds);
      }
      PopupWindowCompat.showAsDropDown(mPopup, getAnchorView(), mDropDownHorizontalOffset, mDropDownVerticalOffset, mDropDownGravity);
      mDropDownList.setSelection(-1);
      if ((!mModal) || (mDropDownList.isInTouchMode())) {
        clearListSelection();
      }
      if (!mModal) {
        mHandler.post(mHideSelector);
      }
    }
  }
  
  @RequiresApi(24)
  public static class Api24Impl
  {
    @DoNotInline
    public static int getMaxAvailableHeight(PopupWindow paramPopupWindow, View paramView, int paramInt, boolean paramBoolean)
    {
      return paramPopupWindow.getMaxAvailableHeight(paramView, paramInt, paramBoolean);
    }
  }
  
  @RequiresApi(29)
  public static class Api29Impl
  {
    @DoNotInline
    public static void setEpicenterBounds(PopupWindow paramPopupWindow, Rect paramRect)
    {
      e.r(paramPopupWindow, paramRect);
    }
    
    @DoNotInline
    public static void setIsClippedToScreen(PopupWindow paramPopupWindow, boolean paramBoolean)
    {
      e.s(paramPopupWindow, paramBoolean);
    }
  }
  
  public class ListSelectorHider
    implements Runnable
  {
    public ListSelectorHider() {}
    
    public void run()
    {
      clearListSelection();
    }
  }
  
  public class PopupDataSetObserver
    extends DataSetObserver
  {
    public PopupDataSetObserver() {}
    
    public void onChanged()
    {
      if (isShowing()) {
        show();
      }
    }
    
    public void onInvalidated()
    {
      dismiss();
    }
  }
  
  public class PopupScrollListener
    implements AbsListView.OnScrollListener
  {
    public PopupScrollListener() {}
    
    public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
    
    public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
    {
      if ((paramInt == 1) && (!isInputMethodNotNeeded()) && (mPopup.getContentView() != null))
      {
        paramAbsListView = ListPopupWindow.this;
        mHandler.removeCallbacks(mResizePopupRunnable);
        mResizePopupRunnable.run();
      }
    }
  }
  
  public class PopupTouchInterceptor
    implements View.OnTouchListener
  {
    public PopupTouchInterceptor() {}
    
    public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
    {
      int i = paramMotionEvent.getAction();
      int j = (int)paramMotionEvent.getX();
      int k = (int)paramMotionEvent.getY();
      if (i == 0)
      {
        paramView = mPopup;
        if ((paramView != null) && (paramView.isShowing()) && (j >= 0) && (j < mPopup.getWidth()) && (k >= 0) && (k < mPopup.getHeight()))
        {
          paramView = ListPopupWindow.this;
          mHandler.postDelayed(mResizePopupRunnable, 250L);
          break label126;
        }
      }
      if (i == 1)
      {
        paramView = ListPopupWindow.this;
        mHandler.removeCallbacks(mResizePopupRunnable);
      }
      label126:
      return false;
    }
  }
  
  public class ResizePopupRunnable
    implements Runnable
  {
    public ResizePopupRunnable() {}
    
    public void run()
    {
      Object localObject = mDropDownList;
      if ((localObject != null) && (ViewCompat.isAttachedToWindow((View)localObject)) && (mDropDownList.getCount() > mDropDownList.getChildCount()))
      {
        int i = mDropDownList.getChildCount();
        localObject = ListPopupWindow.this;
        if (i <= mListItemExpandMaximum)
        {
          mPopup.setInputMethodMode(2);
          show();
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ListPopupWindow
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */