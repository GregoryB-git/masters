package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R.attr;
import androidx.appcompat.graphics.drawable.DrawableWrapper;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.widget.AutoScrollHelper;
import androidx.core.widget.ListViewAutoScrollHelper;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class DropDownListView
  extends ListView
{
  public static final int INVALID_POSITION = -1;
  public static final int NO_POSITION = -1;
  private ViewPropertyAnimatorCompat mClickAnimation;
  private boolean mDrawsInPressedState;
  private boolean mHijackFocus;
  private Field mIsChildViewEnabled;
  private boolean mListSelectionHidden;
  private int mMotionPosition;
  public ResolveHoverRunnable mResolveHoverRunnable;
  private ListViewAutoScrollHelper mScrollHelper;
  private int mSelectionBottomPadding = 0;
  private int mSelectionLeftPadding = 0;
  private int mSelectionRightPadding = 0;
  private int mSelectionTopPadding = 0;
  private GateKeeperDrawable mSelector;
  private final Rect mSelectorRect = new Rect();
  
  public DropDownListView(@NonNull Context paramContext, boolean paramBoolean)
  {
    super(paramContext, null, R.attr.dropDownListViewStyle);
    mHijackFocus = paramBoolean;
    setCacheColorHint(0);
    try
    {
      paramContext = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
      mIsChildViewEnabled = paramContext;
      paramContext.setAccessible(true);
    }
    catch (NoSuchFieldException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  private void clearPressedItem()
  {
    mDrawsInPressedState = false;
    setPressed(false);
    drawableStateChanged();
    Object localObject = getChildAt(mMotionPosition - getFirstVisiblePosition());
    if (localObject != null) {
      ((View)localObject).setPressed(false);
    }
    localObject = mClickAnimation;
    if (localObject != null)
    {
      ((ViewPropertyAnimatorCompat)localObject).cancel();
      mClickAnimation = null;
    }
  }
  
  private void clickPressedItem(View paramView, int paramInt)
  {
    performItemClick(paramView, paramInt, getItemIdAtPosition(paramInt));
  }
  
  private void drawSelectorCompat(Canvas paramCanvas)
  {
    if (!mSelectorRect.isEmpty())
    {
      Drawable localDrawable = getSelector();
      if (localDrawable != null)
      {
        localDrawable.setBounds(mSelectorRect);
        localDrawable.draw(paramCanvas);
      }
    }
  }
  
  private void positionSelectorCompat(int paramInt, View paramView)
  {
    Rect localRect = mSelectorRect;
    localRect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
    left -= mSelectionLeftPadding;
    top -= mSelectionTopPadding;
    right += mSelectionRightPadding;
    bottom += mSelectionBottomPadding;
    try
    {
      boolean bool = mIsChildViewEnabled.getBoolean(this);
      if (paramView.isEnabled() != bool)
      {
        paramView = mIsChildViewEnabled;
        if (!bool) {
          bool = true;
        } else {
          bool = false;
        }
        paramView.set(this, Boolean.valueOf(bool));
        if (paramInt != -1) {
          refreshDrawableState();
        }
      }
    }
    catch (IllegalAccessException paramView)
    {
      paramView.printStackTrace();
    }
  }
  
  private void positionSelectorLikeFocusCompat(int paramInt, View paramView)
  {
    Drawable localDrawable = getSelector();
    boolean bool = true;
    int i;
    if ((localDrawable != null) && (paramInt != -1)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      localDrawable.setVisible(false, false);
    }
    positionSelectorCompat(paramInt, paramView);
    if (i != 0)
    {
      paramView = mSelectorRect;
      float f1 = paramView.exactCenterX();
      float f2 = paramView.exactCenterY();
      if (getVisibility() != 0) {
        bool = false;
      }
      localDrawable.setVisible(bool, false);
      DrawableCompat.setHotspot(localDrawable, f1, f2);
    }
  }
  
  private void positionSelectorLikeTouchCompat(int paramInt, View paramView, float paramFloat1, float paramFloat2)
  {
    positionSelectorLikeFocusCompat(paramInt, paramView);
    paramView = getSelector();
    if ((paramView != null) && (paramInt != -1)) {
      DrawableCompat.setHotspot(paramView, paramFloat1, paramFloat2);
    }
  }
  
  private void setPressedItem(View paramView, int paramInt, float paramFloat1, float paramFloat2)
  {
    mDrawsInPressedState = true;
    Api21Impl.drawableHotspotChanged(this, paramFloat1, paramFloat2);
    if (!isPressed()) {
      setPressed(true);
    }
    layoutChildren();
    int i = mMotionPosition;
    if (i != -1)
    {
      View localView = getChildAt(i - getFirstVisiblePosition());
      if ((localView != null) && (localView != paramView) && (localView.isPressed())) {
        localView.setPressed(false);
      }
    }
    mMotionPosition = paramInt;
    Api21Impl.drawableHotspotChanged(paramView, paramFloat1 - paramView.getLeft(), paramFloat2 - paramView.getTop());
    if (!paramView.isPressed()) {
      paramView.setPressed(true);
    }
    positionSelectorLikeTouchCompat(paramInt, paramView, paramFloat1, paramFloat2);
    setSelectorEnabled(false);
    refreshDrawableState();
  }
  
  private void setSelectorEnabled(boolean paramBoolean)
  {
    GateKeeperDrawable localGateKeeperDrawable = mSelector;
    if (localGateKeeperDrawable != null) {
      localGateKeeperDrawable.setEnabled(paramBoolean);
    }
  }
  
  private boolean touchModeDrawsInPressedStateCompat()
  {
    return mDrawsInPressedState;
  }
  
  private void updateSelectorStateCompat()
  {
    Drawable localDrawable = getSelector();
    if ((localDrawable != null) && (touchModeDrawsInPressedStateCompat()) && (isPressed())) {
      localDrawable.setState(getDrawableState());
    }
  }
  
  public void dispatchDraw(Canvas paramCanvas)
  {
    drawSelectorCompat(paramCanvas);
    super.dispatchDraw(paramCanvas);
  }
  
  public void drawableStateChanged()
  {
    if (mResolveHoverRunnable != null) {
      return;
    }
    super.drawableStateChanged();
    setSelectorEnabled(true);
    updateSelectorStateCompat();
  }
  
  public boolean hasFocus()
  {
    boolean bool;
    if ((!mHijackFocus) && (!super.hasFocus())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean hasWindowFocus()
  {
    boolean bool;
    if ((!mHijackFocus) && (!super.hasWindowFocus())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean isFocused()
  {
    boolean bool;
    if ((!mHijackFocus) && (!super.isFocused())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean isInTouchMode()
  {
    boolean bool;
    if (((mHijackFocus) && (mListSelectionHidden)) || (super.isInTouchMode())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int lookForSelectablePosition(int paramInt, boolean paramBoolean)
  {
    ListAdapter localListAdapter = getAdapter();
    if ((localListAdapter != null) && (!isInTouchMode()))
    {
      int i = localListAdapter.getCount();
      if (!getAdapter().areAllItemsEnabled())
      {
        int j;
        if (paramBoolean) {
          for (paramInt = Math.max(0, paramInt);; paramInt++)
          {
            j = paramInt;
            if (paramInt >= i) {
              break;
            }
            j = paramInt;
            if (localListAdapter.isEnabled(paramInt)) {
              break;
            }
          }
        }
        for (paramInt = Math.min(paramInt, i - 1);; paramInt--)
        {
          j = paramInt;
          if (paramInt < 0) {
            break;
          }
          j = paramInt;
          if (localListAdapter.isEnabled(paramInt)) {
            break;
          }
        }
        if ((j >= 0) && (j < i)) {
          return j;
        }
        return -1;
      }
      if ((paramInt >= 0) && (paramInt < i)) {
        return paramInt;
      }
    }
    return -1;
  }
  
  public int measureHeightOfChildrenCompat(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    paramInt3 = getListPaddingTop();
    paramInt2 = getListPaddingBottom();
    int i = getDividerHeight();
    Object localObject = getDivider();
    ListAdapter localListAdapter = getAdapter();
    if (localListAdapter == null) {
      return paramInt3 + paramInt2;
    }
    paramInt3 += paramInt2;
    if ((i <= 0) || (localObject == null)) {
      i = 0;
    }
    int j = localListAdapter.getCount();
    int k = 0;
    int m = k;
    paramInt2 = m;
    localObject = null;
    int n = m;
    m = k;
    while (m < j)
    {
      int i1 = localListAdapter.getItemViewType(m);
      k = n;
      if (i1 != n)
      {
        localObject = null;
        k = i1;
      }
      View localView = localListAdapter.getView(m, (View)localObject, this);
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      localObject = localLayoutParams;
      if (localLayoutParams == null)
      {
        localObject = generateDefaultLayoutParams();
        localView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      n = height;
      if (n > 0) {
        n = View.MeasureSpec.makeMeasureSpec(n, 1073741824);
      } else {
        n = View.MeasureSpec.makeMeasureSpec(0, 0);
      }
      localView.measure(paramInt1, n);
      localView.forceLayout();
      n = paramInt3;
      if (m > 0) {
        n = paramInt3 + i;
      }
      paramInt3 = n + localView.getMeasuredHeight();
      if (paramInt3 >= paramInt4)
      {
        paramInt1 = paramInt4;
        if (paramInt5 >= 0)
        {
          paramInt1 = paramInt4;
          if (m > paramInt5)
          {
            paramInt1 = paramInt4;
            if (paramInt2 > 0)
            {
              paramInt1 = paramInt4;
              if (paramInt3 != paramInt4) {
                paramInt1 = paramInt2;
              }
            }
          }
        }
        return paramInt1;
      }
      i1 = paramInt2;
      if (paramInt5 >= 0)
      {
        i1 = paramInt2;
        if (m >= paramInt5) {
          i1 = paramInt3;
        }
      }
      m++;
      n = k;
      localObject = localView;
      paramInt2 = i1;
    }
    return paramInt3;
  }
  
  public void onDetachedFromWindow()
  {
    mResolveHoverRunnable = null;
    super.onDetachedFromWindow();
  }
  
  public boolean onForwardedEvent(MotionEvent paramMotionEvent, int paramInt)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i != 1) {
      if (i != 2) {
        if (i == 3) {}
      }
    }
    boolean bool1;
    boolean bool2;
    for (;;)
    {
      bool1 = false;
      bool2 = true;
      break;
      label48:
      do
      {
        bool1 = false;
        bool2 = bool1;
        break;
        bool2 = true;
        break label48;
        bool2 = false;
        j = paramMotionEvent.findPointerIndex(paramInt);
      } while (j < 0);
      paramInt = (int)paramMotionEvent.getX(j);
      int j = (int)paramMotionEvent.getY(j);
      int k = pointToPosition(paramInt, j);
      if (k == -1)
      {
        bool1 = true;
        break;
      }
      View localView = getChildAt(k - getFirstVisiblePosition());
      setPressedItem(localView, k, paramInt, j);
      if (i == 1) {
        clickPressedItem(localView, k);
      }
    }
    if ((!bool2) || (bool1)) {
      clearPressedItem();
    }
    if (bool2)
    {
      if (mScrollHelper == null) {
        mScrollHelper = new ListViewAutoScrollHelper(this);
      }
      mScrollHelper.setEnabled(true);
      mScrollHelper.onTouch(this, paramMotionEvent);
    }
    else
    {
      paramMotionEvent = mScrollHelper;
      if (paramMotionEvent != null) {
        paramMotionEvent.setEnabled(false);
      }
    }
    return bool2;
  }
  
  public boolean onHoverEvent(@NonNull MotionEvent paramMotionEvent)
  {
    int i = Build.VERSION.SDK_INT;
    if (i < 26) {
      return super.onHoverEvent(paramMotionEvent);
    }
    int j = paramMotionEvent.getActionMasked();
    if ((j == 10) && (mResolveHoverRunnable == null))
    {
      ResolveHoverRunnable localResolveHoverRunnable = new ResolveHoverRunnable();
      mResolveHoverRunnable = localResolveHoverRunnable;
      localResolveHoverRunnable.post();
    }
    boolean bool = super.onHoverEvent(paramMotionEvent);
    if ((j != 9) && (j != 7))
    {
      setSelection(-1);
    }
    else
    {
      j = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      if ((j != -1) && (j != getSelectedItemPosition()))
      {
        paramMotionEvent = getChildAt(j - getFirstVisiblePosition());
        if (paramMotionEvent.isEnabled())
        {
          requestFocus();
          if ((i >= 30) && (Api30Impl.canPositionSelectorForHoveredItem())) {
            Api30Impl.positionSelectorForHoveredItem(this, j, paramMotionEvent);
          } else {
            setSelectionFromTop(j, paramMotionEvent.getTop() - getTop());
          }
        }
        updateSelectorStateCompat();
      }
    }
    return bool;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0) {
      mMotionPosition = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
    }
    ResolveHoverRunnable localResolveHoverRunnable = mResolveHoverRunnable;
    if (localResolveHoverRunnable != null) {
      localResolveHoverRunnable.cancel();
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setListSelectionHidden(boolean paramBoolean)
  {
    mListSelectionHidden = paramBoolean;
  }
  
  public void setSelector(Drawable paramDrawable)
  {
    if (paramDrawable != null) {
      localObject = new GateKeeperDrawable(paramDrawable);
    } else {
      localObject = null;
    }
    mSelector = ((GateKeeperDrawable)localObject);
    super.setSelector((Drawable)localObject);
    Object localObject = new Rect();
    if (paramDrawable != null) {
      paramDrawable.getPadding((Rect)localObject);
    }
    mSelectionLeftPadding = left;
    mSelectionTopPadding = top;
    mSelectionRightPadding = right;
    mSelectionBottomPadding = bottom;
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static void drawableHotspotChanged(View paramView, float paramFloat1, float paramFloat2)
    {
      paramView.drawableHotspotChanged(paramFloat1, paramFloat2);
    }
  }
  
  @RequiresApi(30)
  public static class Api30Impl
  {
    private static boolean sHasMethods;
    private static Method sPositionSelector;
    private static Method sSetNextSelectedPositionInt;
    private static Method sSetSelectedPositionInt;
    
    static
    {
      try
      {
        Object localObject1 = Integer.TYPE;
        Class localClass = Boolean.TYPE;
        Object localObject2 = Float.TYPE;
        localObject2 = AbsListView.class.getDeclaredMethod("positionSelector", new Class[] { localObject1, View.class, localClass, localObject2, localObject2 });
        sPositionSelector = (Method)localObject2;
        ((AccessibleObject)localObject2).setAccessible(true);
        localObject2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", new Class[] { localObject1 });
        sSetSelectedPositionInt = (Method)localObject2;
        ((AccessibleObject)localObject2).setAccessible(true);
        localObject1 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", new Class[] { localObject1 });
        sSetNextSelectedPositionInt = (Method)localObject1;
        ((AccessibleObject)localObject1).setAccessible(true);
        sHasMethods = true;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        localNoSuchMethodException.printStackTrace();
      }
    }
    
    public static boolean canPositionSelectorForHoveredItem()
    {
      return sHasMethods;
    }
    
    @SuppressLint({"BanUncheckedReflection"})
    public static void positionSelectorForHoveredItem(DropDownListView paramDropDownListView, int paramInt, View paramView)
    {
      try
      {
        sPositionSelector.invoke(paramDropDownListView, new Object[] { Integer.valueOf(paramInt), paramView, Boolean.FALSE, Integer.valueOf(-1), Integer.valueOf(-1) });
        sSetSelectedPositionInt.invoke(paramDropDownListView, new Object[] { Integer.valueOf(paramInt) });
        sSetNextSelectedPositionInt.invoke(paramDropDownListView, new Object[] { Integer.valueOf(paramInt) });
      }
      catch (InvocationTargetException paramDropDownListView)
      {
        paramDropDownListView.printStackTrace();
      }
      catch (IllegalAccessException paramDropDownListView)
      {
        paramDropDownListView.printStackTrace();
      }
    }
  }
  
  public static class GateKeeperDrawable
    extends DrawableWrapper
  {
    private boolean mEnabled = true;
    
    public GateKeeperDrawable(Drawable paramDrawable)
    {
      super();
    }
    
    public void draw(Canvas paramCanvas)
    {
      if (mEnabled) {
        super.draw(paramCanvas);
      }
    }
    
    public void setEnabled(boolean paramBoolean)
    {
      mEnabled = paramBoolean;
    }
    
    public void setHotspot(float paramFloat1, float paramFloat2)
    {
      if (mEnabled) {
        super.setHotspot(paramFloat1, paramFloat2);
      }
    }
    
    public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      if (mEnabled) {
        super.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
    
    public boolean setState(int[] paramArrayOfInt)
    {
      if (mEnabled) {
        return super.setState(paramArrayOfInt);
      }
      return false;
    }
    
    public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
    {
      if (mEnabled) {
        return super.setVisible(paramBoolean1, paramBoolean2);
      }
      return false;
    }
  }
  
  public class ResolveHoverRunnable
    implements Runnable
  {
    public ResolveHoverRunnable() {}
    
    public void cancel()
    {
      DropDownListView localDropDownListView = DropDownListView.this;
      mResolveHoverRunnable = null;
      localDropDownListView.removeCallbacks(this);
    }
    
    public void post()
    {
      post(this);
    }
    
    public void run()
    {
      DropDownListView localDropDownListView = DropDownListView.this;
      mResolveHoverRunnable = null;
      localDropDownListView.drawableStateChanged();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.DropDownListView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */