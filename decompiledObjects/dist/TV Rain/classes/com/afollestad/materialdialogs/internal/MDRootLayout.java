package com.afollestad.materialdialogs.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.R.attr;
import com.afollestad.materialdialogs.R.dimen;
import com.afollestad.materialdialogs.R.id;
import com.afollestad.materialdialogs.R.styleable;
import com.afollestad.materialdialogs.StackingBehavior;
import com.afollestad.materialdialogs.util.DialogUtils;

public class MDRootLayout
  extends ViewGroup
{
  private static final int INDEX_NEGATIVE = 1;
  private static final int INDEX_NEUTRAL = 0;
  private static final int INDEX_POSITIVE = 2;
  private ViewTreeObserver.OnScrollChangedListener bottomOnScrollChangedListener;
  private int buttonBarHeight;
  private GravityEnum buttonGravity = GravityEnum.START;
  private int buttonHorizontalEdgeMargin;
  private int buttonPaddingFull;
  private final MDButton[] buttons = new MDButton[3];
  private View content;
  private Paint dividerPaint;
  private int dividerWidth;
  private boolean drawBottomDivider = false;
  private boolean drawTopDivider = false;
  private boolean isStacked = false;
  private int maxHeight;
  private boolean noTitleNoPadding;
  private int noTitlePaddingFull;
  private boolean reducePaddingNoTitleNoButtons;
  private StackingBehavior stackBehavior = StackingBehavior.ADAPTIVE;
  private View titleBar;
  private ViewTreeObserver.OnScrollChangedListener topOnScrollChangedListener;
  private boolean useFullPadding = true;
  
  public MDRootLayout(Context paramContext)
  {
    super(paramContext);
    init(paramContext, null, 0);
  }
  
  public MDRootLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext, paramAttributeSet, 0);
  }
  
  @TargetApi(11)
  public MDRootLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext, paramAttributeSet, paramInt);
  }
  
  @TargetApi(21)
  public MDRootLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    init(paramContext, paramAttributeSet, paramInt1);
  }
  
  private void addScrollListener(final ViewGroup paramViewGroup, final boolean paramBoolean1, final boolean paramBoolean2)
  {
    if (((!paramBoolean2) && (topOnScrollChangedListener == null)) || ((paramBoolean2) && (bottomOnScrollChangedListener == null)))
    {
      Object localObject;
      if ((paramViewGroup instanceof RecyclerView))
      {
        localObject = new RecyclerView.OnScrollListener()
        {
          public void onScrolled(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt1, int paramAnonymousInt2)
          {
            super.onScrolled(paramAnonymousRecyclerView, paramAnonymousInt1, paramAnonymousInt2);
            paramAnonymousRecyclerView = MDRootLayout.access$400(MDRootLayout.this);
            paramAnonymousInt2 = paramAnonymousRecyclerView.length;
            boolean bool1 = false;
            boolean bool2;
            for (paramAnonymousInt1 = 0;; paramAnonymousInt1++)
            {
              bool2 = bool1;
              if (paramAnonymousInt1 >= paramAnonymousInt2) {
                break;
              }
              Object localObject = paramAnonymousRecyclerView[paramAnonymousInt1];
              if ((localObject != null) && (((View)localObject).getVisibility() != 8))
              {
                bool2 = true;
                break;
              }
            }
            MDRootLayout.access$500(MDRootLayout.this, paramViewGroup, paramBoolean1, paramBoolean2, bool2);
            invalidate();
          }
        };
        paramViewGroup = (RecyclerView)paramViewGroup;
        paramViewGroup.addOnScrollListener((RecyclerView.OnScrollListener)localObject);
        ((2)localObject).onScrolled(paramViewGroup, 0, 0);
      }
      else
      {
        localObject = new ViewTreeObserver.OnScrollChangedListener()
        {
          public void onScrollChanged()
          {
            Object localObject1 = MDRootLayout.access$400(MDRootLayout.this);
            int i = localObject1.length;
            boolean bool1 = false;
            boolean bool2;
            for (int j = 0;; j++)
            {
              bool2 = bool1;
              if (j >= i) {
                break;
              }
              Object localObject2 = localObject1[j];
              if ((localObject2 != null) && (((View)localObject2).getVisibility() != 8))
              {
                bool2 = true;
                break;
              }
            }
            localObject1 = paramViewGroup;
            if ((localObject1 instanceof WebView)) {
              MDRootLayout.access$600(MDRootLayout.this, (WebView)localObject1, paramBoolean1, paramBoolean2, bool2);
            } else {
              MDRootLayout.access$500(MDRootLayout.this, (ViewGroup)localObject1, paramBoolean1, paramBoolean2, bool2);
            }
            invalidate();
          }
        };
        if (!paramBoolean2)
        {
          topOnScrollChangedListener = ((ViewTreeObserver.OnScrollChangedListener)localObject);
          paramViewGroup.getViewTreeObserver().addOnScrollChangedListener(topOnScrollChangedListener);
        }
        else
        {
          bottomOnScrollChangedListener = ((ViewTreeObserver.OnScrollChangedListener)localObject);
          paramViewGroup.getViewTreeObserver().addOnScrollChangedListener(bottomOnScrollChangedListener);
        }
        ((ViewTreeObserver.OnScrollChangedListener)localObject).onScrollChanged();
      }
    }
  }
  
  private static boolean canAdapterViewScroll(AdapterView paramAdapterView)
  {
    int i = paramAdapterView.getLastVisiblePosition();
    boolean bool = false;
    if (i == -1) {
      return false;
    }
    if (paramAdapterView.getFirstVisiblePosition() == 0) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if (paramAdapterView.getLastVisiblePosition() == paramAdapterView.getCount() - 1) {
      j = 1;
    } else {
      j = 0;
    }
    if ((i != 0) && (j != 0) && (paramAdapterView.getChildCount() > 0))
    {
      if (paramAdapterView.getChildAt(0).getTop() < paramAdapterView.getPaddingTop()) {
        return true;
      }
      if (paramAdapterView.getChildAt(paramAdapterView.getChildCount() - 1).getBottom() > paramAdapterView.getHeight() - paramAdapterView.getPaddingBottom()) {
        bool = true;
      }
      return bool;
    }
    return true;
  }
  
  public static boolean canRecyclerViewScroll(RecyclerView paramRecyclerView)
  {
    boolean bool;
    if ((paramRecyclerView != null) && (paramRecyclerView.getLayoutManager() != null) && (paramRecyclerView.getLayoutManager().canScrollVertically())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean canScrollViewScroll(ScrollView paramScrollView)
  {
    int i = paramScrollView.getChildCount();
    boolean bool = false;
    if (i == 0) {
      return false;
    }
    i = paramScrollView.getChildAt(0).getMeasuredHeight();
    if (paramScrollView.getMeasuredHeight() - paramScrollView.getPaddingTop() - paramScrollView.getPaddingBottom() < i) {
      bool = true;
    }
    return bool;
  }
  
  private static boolean canWebViewScroll(WebView paramWebView)
  {
    float f1 = paramWebView.getMeasuredHeight();
    float f2 = paramWebView.getContentHeight();
    boolean bool;
    if (f1 < paramWebView.getScale() * f2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Nullable
  private static View getBottomView(ViewGroup paramViewGroup)
  {
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (paramViewGroup != null) {
      if (paramViewGroup.getChildCount() == 0) {
        localObject2 = localObject1;
      } else {
        for (int i = paramViewGroup.getChildCount() - 1;; i--)
        {
          localObject2 = localObject1;
          if (i < 0) {
            break;
          }
          localObject2 = paramViewGroup.getChildAt(i);
          if ((((View)localObject2).getVisibility() == 0) && (((View)localObject2).getBottom() == paramViewGroup.getMeasuredHeight())) {
            break;
          }
        }
      }
    }
    return (View)localObject2;
  }
  
  @Nullable
  private static View getTopView(ViewGroup paramViewGroup)
  {
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (paramViewGroup != null) {
      if (paramViewGroup.getChildCount() == 0) {
        localObject2 = localObject1;
      } else {
        for (int i = paramViewGroup.getChildCount() - 1;; i--)
        {
          localObject2 = localObject1;
          if (i < 0) {
            break;
          }
          localObject2 = paramViewGroup.getChildAt(i);
          if ((((View)localObject2).getVisibility() == 0) && (((View)localObject2).getTop() == 0)) {
            break;
          }
        }
      }
    }
    return (View)localObject2;
  }
  
  private void init(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.MDRootLayout, paramInt, 0);
    reducePaddingNoTitleNoButtons = paramAttributeSet.getBoolean(R.styleable.MDRootLayout_md_reduce_padding_no_title_no_buttons, true);
    paramAttributeSet.recycle();
    noTitlePaddingFull = localResources.getDimensionPixelSize(R.dimen.md_notitle_vertical_padding);
    buttonPaddingFull = localResources.getDimensionPixelSize(R.dimen.md_button_frame_vertical_padding);
    buttonHorizontalEdgeMargin = localResources.getDimensionPixelSize(R.dimen.md_button_padding_frame_side);
    buttonBarHeight = localResources.getDimensionPixelSize(R.dimen.md_button_height);
    dividerPaint = new Paint();
    dividerWidth = localResources.getDimensionPixelSize(R.dimen.md_divider_height);
    dividerPaint.setColor(DialogUtils.resolveColor(paramContext, R.attr.md_divider_color));
    setWillNotDraw(false);
  }
  
  private void invalidateDividersForScrollingView(ViewGroup paramViewGroup, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    boolean bool = true;
    int i;
    if ((paramBoolean1) && (paramViewGroup.getChildCount() > 0))
    {
      View localView = titleBar;
      if ((localView != null) && (localView.getVisibility() != 8))
      {
        i = paramViewGroup.getScrollY();
        if (paramViewGroup.getPaddingTop() + i > paramViewGroup.getChildAt(0).getTop())
        {
          paramBoolean1 = true;
          break label66;
        }
      }
      paramBoolean1 = false;
      label66:
      drawTopDivider = paramBoolean1;
    }
    if ((paramBoolean2) && (paramViewGroup.getChildCount() > 0))
    {
      if (paramBoolean3)
      {
        i = paramViewGroup.getScrollY();
        if (paramViewGroup.getHeight() + i - paramViewGroup.getPaddingBottom() < paramViewGroup.getChildAt(paramViewGroup.getChildCount() - 1).getBottom())
        {
          paramBoolean1 = bool;
          break label129;
        }
      }
      paramBoolean1 = false;
      label129:
      drawBottomDivider = paramBoolean1;
    }
  }
  
  private void invalidateDividersForWebView(WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    boolean bool = true;
    int i;
    if (paramBoolean1)
    {
      View localView = titleBar;
      if ((localView != null) && (localView.getVisibility() != 8))
      {
        i = paramWebView.getScrollY();
        if (paramWebView.getPaddingTop() + i > 0)
        {
          paramBoolean1 = true;
          break label51;
        }
      }
      paramBoolean1 = false;
      label51:
      drawTopDivider = paramBoolean1;
    }
    if (paramBoolean2)
    {
      if (paramBoolean3)
      {
        i = paramWebView.getScrollY();
        float f1 = paramWebView.getMeasuredHeight() + i - paramWebView.getPaddingBottom();
        float f2 = paramWebView.getContentHeight();
        if (f1 < paramWebView.getScale() * f2)
        {
          paramBoolean1 = bool;
          break label114;
        }
      }
      paramBoolean1 = false;
      label114:
      drawBottomDivider = paramBoolean1;
    }
  }
  
  private void invertGravityIfNecessary()
  {
    if (getResources().getConfiguration().getLayoutDirection() == 1)
    {
      int i = 4.$SwitchMap$com$afollestad$materialdialogs$GravityEnum[buttonGravity.ordinal()];
      if (i != 1)
      {
        if (i == 2) {
          buttonGravity = GravityEnum.START;
        }
      }
      else {
        buttonGravity = GravityEnum.END;
      }
    }
  }
  
  private static boolean isVisible(View paramView)
  {
    boolean bool1 = true;
    boolean bool2;
    if ((paramView != null) && (paramView.getVisibility() != 8)) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    boolean bool3 = bool2;
    if (bool2)
    {
      bool3 = bool2;
      if ((paramView instanceof MDButton))
      {
        if (((MDButton)paramView).getText().toString().trim().length() > 0) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
        bool3 = bool2;
      }
    }
    return bool3;
  }
  
  private void setUpDividersVisibility(final View paramView, final boolean paramBoolean1, final boolean paramBoolean2)
  {
    if (paramView == null) {
      return;
    }
    if ((paramView instanceof ScrollView))
    {
      paramView = (ScrollView)paramView;
      if (canScrollViewScroll(paramView))
      {
        addScrollListener(paramView, paramBoolean1, paramBoolean2);
      }
      else
      {
        if (paramBoolean1) {
          drawTopDivider = false;
        }
        if (paramBoolean2) {
          drawBottomDivider = false;
        }
      }
    }
    else if ((paramView instanceof AdapterView))
    {
      paramView = (AdapterView)paramView;
      if (canAdapterViewScroll(paramView))
      {
        addScrollListener(paramView, paramBoolean1, paramBoolean2);
      }
      else
      {
        if (paramBoolean1) {
          drawTopDivider = false;
        }
        if (paramBoolean2) {
          drawBottomDivider = false;
        }
      }
    }
    else if ((paramView instanceof WebView))
    {
      paramView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
      {
        public boolean onPreDraw()
        {
          if (paramView.getMeasuredHeight() != 0)
          {
            if (!MDRootLayout.access$000((WebView)paramView))
            {
              if (paramBoolean1) {
                MDRootLayout.access$102(MDRootLayout.this, false);
              }
              if (paramBoolean2) {
                MDRootLayout.access$202(MDRootLayout.this, false);
              }
            }
            else
            {
              MDRootLayout.access$300(MDRootLayout.this, (ViewGroup)paramView, paramBoolean1, paramBoolean2);
            }
            paramView.getViewTreeObserver().removeOnPreDrawListener(this);
          }
          return true;
        }
      });
    }
    else if ((paramView instanceof RecyclerView))
    {
      boolean bool = canRecyclerViewScroll((RecyclerView)paramView);
      if (paramBoolean1) {
        drawTopDivider = bool;
      }
      if (paramBoolean2) {
        drawBottomDivider = bool;
      }
      if (bool) {
        addScrollListener((ViewGroup)paramView, paramBoolean1, paramBoolean2);
      }
    }
    else if ((paramView instanceof ViewGroup))
    {
      Object localObject = (ViewGroup)paramView;
      paramView = getTopView((ViewGroup)localObject);
      setUpDividersVisibility(paramView, paramBoolean1, paramBoolean2);
      localObject = getBottomView((ViewGroup)localObject);
      if (localObject != paramView) {
        setUpDividersVisibility((View)localObject, false, true);
      }
    }
  }
  
  public void noTitleNoPadding()
  {
    noTitleNoPadding = true;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    View localView = content;
    if (localView != null)
    {
      int i;
      if (drawTopDivider)
      {
        i = localView.getTop();
        paramCanvas.drawRect(0.0F, i - dividerWidth, getMeasuredWidth(), i, dividerPaint);
      }
      if (drawBottomDivider)
      {
        i = content.getBottom();
        paramCanvas.drawRect(0.0F, i, getMeasuredWidth(), i + dividerWidth, dividerPaint);
      }
    }
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    for (int i = 0; i < getChildCount(); i++)
    {
      View localView = getChildAt(i);
      if (localView.getId() == R.id.md_titleFrame) {
        titleBar = localView;
      } else if (localView.getId() == R.id.md_buttonDefaultNeutral) {
        buttons[0] = ((MDButton)localView);
      } else if (localView.getId() == R.id.md_buttonDefaultNegative) {
        buttons[1] = ((MDButton)localView);
      } else if (localView.getId() == R.id.md_buttonDefaultPositive) {
        buttons[2] = ((MDButton)localView);
      } else {
        content = localView;
      }
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i;
    Object localObject;
    if (isVisible(titleBar))
    {
      i = titleBar.getMeasuredHeight();
      localObject = titleBar;
      i += paramInt2;
      ((View)localObject).layout(paramInt1, paramInt2, paramInt3, i);
    }
    else
    {
      i = paramInt2;
      if (!noTitleNoPadding)
      {
        i = paramInt2;
        if (useFullPadding) {
          i = paramInt2 + noTitlePaddingFull;
        }
      }
    }
    if (isVisible(content))
    {
      localObject = content;
      ((View)localObject).layout(paramInt1, i, paramInt3, ((View)localObject).getMeasuredHeight() + i);
    }
    paramBoolean = isStacked;
    paramInt2 = 0;
    if (paramBoolean)
    {
      paramInt4 -= buttonPaddingFull;
      localObject = buttons;
      j = localObject.length;
      while (paramInt2 < j)
      {
        View localView = localObject[paramInt2];
        i = paramInt4;
        if (isVisible(localView))
        {
          localView.layout(paramInt1, paramInt4 - localView.getMeasuredHeight(), paramInt3, paramInt4);
          i = paramInt4 - localView.getMeasuredHeight();
        }
        paramInt2++;
        paramInt4 = i;
      }
    }
    int j = paramInt4;
    if (useFullPadding) {
      j = paramInt4 - buttonPaddingFull;
    }
    int k = j - buttonBarHeight;
    int m = buttonHorizontalEdgeMargin;
    if (isVisible(buttons[2]))
    {
      if (buttonGravity == GravityEnum.END)
      {
        paramInt2 = paramInt1 + m;
        i = buttons[2].getMeasuredWidth() + paramInt2;
        paramInt4 = -1;
      }
      else
      {
        i = paramInt3 - m;
        paramInt2 = i - buttons[2].getMeasuredWidth();
        paramInt4 = paramInt2;
      }
      buttons[2].layout(paramInt2, k, i, j);
      paramInt2 = m + buttons[2].getMeasuredWidth();
    }
    else
    {
      paramInt4 = -1;
      paramInt2 = m;
    }
    if (isVisible(buttons[1]))
    {
      localObject = buttonGravity;
      if (localObject == GravityEnum.END)
      {
        i = paramInt2 + paramInt1;
        paramInt2 = buttons[1].getMeasuredWidth() + i;
      }
      for (;;)
      {
        int n = -1;
        m = paramInt2;
        paramInt2 = n;
        break label452;
        if (localObject != GravityEnum.START) {
          break;
        }
        paramInt2 = paramInt3 - paramInt2;
        i = paramInt2 - buttons[1].getMeasuredWidth();
      }
      i = buttonHorizontalEdgeMargin + paramInt1;
      m = buttons[1].getMeasuredWidth() + i;
      paramInt2 = m;
      label452:
      buttons[1].layout(i, k, m, j);
    }
    else
    {
      paramInt2 = -1;
    }
    if (isVisible(buttons[0]))
    {
      localObject = buttonGravity;
      if (localObject == GravityEnum.END)
      {
        paramInt2 = paramInt3 - buttonHorizontalEdgeMargin;
        paramInt1 = paramInt2 - buttons[0].getMeasuredWidth();
      }
      else if (localObject == GravityEnum.START)
      {
        paramInt1 += buttonHorizontalEdgeMargin;
        paramInt2 = buttons[0].getMeasuredWidth() + paramInt1;
      }
      else
      {
        if ((paramInt2 == -1) && (paramInt4 != -1))
        {
          paramInt2 = paramInt4 - buttons[0].getMeasuredWidth();
          i = paramInt4;
        }
        else
        {
          if ((paramInt4 == -1) && (paramInt2 != -1))
          {
            paramInt1 = buttons[0].getMeasuredWidth();
          }
          else
          {
            i = paramInt4;
            if (paramInt4 != -1) {
              break label652;
            }
            paramInt2 = (paramInt3 - paramInt1) / 2 - buttons[0].getMeasuredWidth() / 2;
            paramInt1 = buttons[0].getMeasuredWidth();
          }
          i = paramInt1 + paramInt2;
        }
        label652:
        paramInt1 = paramInt2;
        paramInt2 = i;
      }
      buttons[0].layout(paramInt1, k, paramInt2, j);
    }
    setUpDividersVisibility(content, true, true);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt2);
    int k = maxHeight;
    int m = j;
    if (j > k) {
      m = k;
    }
    useFullPadding = true;
    Object localObject1 = stackBehavior;
    Object localObject2 = StackingBehavior.ALWAYS;
    int n = 0;
    int i1;
    int i3;
    if (localObject1 == localObject2)
    {
      j = 1;
      k = 0;
    }
    else if (localObject1 == StackingBehavior.NEVER)
    {
      j = 0;
      k = j;
    }
    else
    {
      localObject2 = buttons;
      i1 = localObject2.length;
      i2 = 0;
      j = i2;
      k = j;
      i3 = j;
      j = i2;
      while (j < i1)
      {
        localObject1 = localObject2[j];
        i4 = i3;
        i2 = k;
        if (localObject1 != null)
        {
          i4 = i3;
          i2 = k;
          if (isVisible((View)localObject1))
          {
            ((MDButton)localObject1).setStacked(false, false);
            measureChild((View)localObject1, paramInt1, paramInt2);
            i4 = i3 + ((View)localObject1).getMeasuredWidth();
            i2 = 1;
          }
        }
        j++;
        i3 = i4;
        k = i2;
      }
      if (i3 > i - getContext().getResources().getDimensionPixelSize(R.dimen.md_neutral_button_margin) * 2) {
        j = 1;
      } else {
        j = 0;
      }
    }
    isStacked = j;
    if (j != 0)
    {
      localObject1 = buttons;
      i1 = localObject1.length;
      i3 = 0;
      j = i3;
      for (;;)
      {
        i4 = j;
        i2 = k;
        if (i3 >= i1) {
          break;
        }
        localObject2 = localObject1[i3];
        i4 = j;
        i2 = k;
        if (localObject2 != null)
        {
          i4 = j;
          i2 = k;
          if (isVisible((View)localObject2))
          {
            ((MDButton)localObject2).setStacked(true, false);
            measureChild((View)localObject2, paramInt1, paramInt2);
            i4 = j + ((View)localObject2).getMeasuredHeight();
            i2 = 1;
          }
        }
        i3++;
        j = i4;
        k = i2;
      }
    }
    int i4 = 0;
    int i2 = k;
    if (i2 != 0)
    {
      if (isStacked)
      {
        paramInt1 = m - i4;
        k = buttonPaddingFull;
        paramInt2 = k * 2 + 0;
        j = k * 2 + 0;
        break label437;
      }
      paramInt1 = m - buttonBarHeight;
      paramInt2 = buttonPaddingFull * 2 + 0;
    }
    else
    {
      paramInt2 = buttonPaddingFull * 2 + 0;
      paramInt1 = m;
    }
    j = 0;
    label437:
    if (isVisible(titleBar))
    {
      titleBar.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), 0);
      k = paramInt1 - titleBar.getMeasuredHeight();
      i3 = paramInt2;
    }
    else
    {
      i3 = paramInt2;
      k = paramInt1;
      if (!noTitleNoPadding)
      {
        i3 = paramInt2 + noTitlePaddingFull;
        k = paramInt1;
      }
    }
    if (isVisible(content))
    {
      content.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(k - j, Integer.MIN_VALUE));
      if (content.getMeasuredHeight() <= k - i3)
      {
        if ((reducePaddingNoTitleNoButtons) && (!isVisible(titleBar)) && (i2 == 0))
        {
          useFullPadding = false;
          paramInt1 = k - (content.getMeasuredHeight() + j);
        }
        else
        {
          useFullPadding = true;
          paramInt1 = k - (content.getMeasuredHeight() + i3);
        }
      }
      else
      {
        useFullPadding = false;
        paramInt1 = n;
      }
    }
    else
    {
      paramInt1 = k;
    }
    setMeasuredDimension(i, m - paramInt1);
  }
  
  public void setButtonGravity(GravityEnum paramGravityEnum)
  {
    buttonGravity = paramGravityEnum;
    invertGravityIfNecessary();
  }
  
  public void setButtonStackedGravity(GravityEnum paramGravityEnum)
  {
    for (MDButton localMDButton : buttons) {
      if (localMDButton != null) {
        localMDButton.setStackedGravity(paramGravityEnum);
      }
    }
  }
  
  public void setDividerColor(int paramInt)
  {
    dividerPaint.setColor(paramInt);
    invalidate();
  }
  
  public void setMaxHeight(int paramInt)
  {
    maxHeight = paramInt;
  }
  
  public void setStackingBehavior(StackingBehavior paramStackingBehavior)
  {
    stackBehavior = paramStackingBehavior;
    invalidate();
  }
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.internal.MDRootLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */