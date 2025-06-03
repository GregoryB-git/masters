/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnPreDrawListener
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.webkit.WebView
 *  android.widget.AdapterView
 *  android.widget.ScrollView
 *  androidx.annotation.Nullable
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$OnScrollListener
 *  java.lang.Integer
 *  java.lang.Object
 */
package com.afollestad.materialdialogs.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.StackingBehavior;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.util.DialogUtils;

public class MDRootLayout
extends ViewGroup {
    private static final int INDEX_NEGATIVE = 1;
    private static final int INDEX_NEUTRAL = 0;
    private static final int INDEX_POSITIVE = 2;
    private ViewTreeObserver.OnScrollChangedListener bottomOnScrollChangedListener;
    private int buttonBarHeight;
    private GravityEnum buttonGravity;
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

    public MDRootLayout(Context context) {
        super(context);
        this.buttonGravity = GravityEnum.START;
        this.init(context, null, 0);
    }

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.buttonGravity = GravityEnum.START;
        this.init(context, attributeSet, 0);
    }

    @TargetApi(value=11)
    public MDRootLayout(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.buttonGravity = GravityEnum.START;
        this.init(context, attributeSet, n);
    }

    @TargetApi(value=21)
    public MDRootLayout(Context context, AttributeSet attributeSet, int n, int n2) {
        super(context, attributeSet, n, n2);
        this.buttonGravity = GravityEnum.START;
        this.init(context, attributeSet, n);
    }

    public static /* synthetic */ boolean access$102(MDRootLayout mDRootLayout, boolean bl) {
        mDRootLayout.drawTopDivider = bl;
        return bl;
    }

    public static /* synthetic */ boolean access$202(MDRootLayout mDRootLayout, boolean bl) {
        mDRootLayout.drawBottomDivider = bl;
        return bl;
    }

    private void addScrollListener(ViewGroup viewGroup, boolean bl, boolean bl2) {
        if (!bl2 && this.topOnScrollChangedListener == null || bl2 && this.bottomOnScrollChangedListener == null) {
            if (viewGroup instanceof RecyclerView) {
                RecyclerView.OnScrollListener onScrollListener = new RecyclerView.OnScrollListener(this, viewGroup, bl, bl2){
                    public final MDRootLayout this$0;
                    public final boolean val$setForBottom;
                    public final boolean val$setForTop;
                    public final ViewGroup val$vg;
                    {
                        this.this$0 = mDRootLayout;
                        this.val$vg = viewGroup;
                        this.val$setForTop = bl;
                        this.val$setForBottom = bl2;
                    }

                    public void onScrolled(RecyclerView mDButtonArray, int n, int n2) {
                        boolean bl;
                        super.onScrolled((RecyclerView)mDButtonArray, n, n2);
                        mDButtonArray = this.this$0.buttons;
                        n2 = mDButtonArray.length;
                        boolean bl2 = false;
                        n = 0;
                        while (true) {
                            bl = bl2;
                            if (n >= n2) break;
                            MDButton mDButton = mDButtonArray[n];
                            if (mDButton != null && mDButton.getVisibility() != 8) {
                                bl = true;
                                break;
                            }
                            ++n;
                        }
                        this.this$0.invalidateDividersForScrollingView(this.val$vg, this.val$setForTop, this.val$setForBottom, bl);
                        this.this$0.invalidate();
                    }
                };
                viewGroup = (RecyclerView)viewGroup;
                viewGroup.addOnScrollListener(onScrollListener);
                onScrollListener.onScrolled((RecyclerView)viewGroup, 0, 0);
            } else {
                ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener(this, viewGroup, bl, bl2){
                    public final MDRootLayout this$0;
                    public final boolean val$setForBottom;
                    public final boolean val$setForTop;
                    public final ViewGroup val$vg;
                    {
                        this.this$0 = mDRootLayout;
                        this.val$vg = viewGroup;
                        this.val$setForTop = bl;
                        this.val$setForBottom = bl2;
                    }

                    public void onScrollChanged() {
                        Object object;
                        boolean bl;
                        MDButton[] mDButtonArray = this.this$0.buttons;
                        int n = mDButtonArray.length;
                        boolean bl2 = false;
                        int n2 = 0;
                        while (true) {
                            bl = bl2;
                            if (n2 >= n) break;
                            object = mDButtonArray[n2];
                            if (object != null && object.getVisibility() != 8) {
                                bl = true;
                                break;
                            }
                            ++n2;
                        }
                        if ((object = this.val$vg) instanceof WebView) {
                            this.this$0.invalidateDividersForWebView((WebView)object, this.val$setForTop, this.val$setForBottom, bl);
                        } else {
                            this.this$0.invalidateDividersForScrollingView(object, this.val$setForTop, this.val$setForBottom, bl);
                        }
                        this.this$0.invalidate();
                    }
                };
                if (!bl2) {
                    this.topOnScrollChangedListener = onScrollChangedListener;
                    viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.topOnScrollChangedListener);
                } else {
                    this.bottomOnScrollChangedListener = onScrollChangedListener;
                    viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.bottomOnScrollChangedListener);
                }
                onScrollChangedListener.onScrollChanged();
            }
        }
    }

    private static boolean canAdapterViewScroll(AdapterView adapterView) {
        int n = adapterView.getLastVisiblePosition();
        boolean bl = false;
        if (n == -1) {
            return false;
        }
        n = adapterView.getFirstVisiblePosition() == 0 ? 1 : 0;
        boolean bl2 = adapterView.getLastVisiblePosition() == adapterView.getCount() - 1;
        if (n != 0 && bl2 && adapterView.getChildCount() > 0) {
            if (adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop()) {
                return true;
            }
            if (adapterView.getChildAt(adapterView.getChildCount() - 1).getBottom() > adapterView.getHeight() - adapterView.getPaddingBottom()) {
                bl = true;
            }
            return bl;
        }
        return true;
    }

    public static boolean canRecyclerViewScroll(RecyclerView recyclerView) {
        boolean bl = recyclerView != null && recyclerView.getLayoutManager() != null && recyclerView.getLayoutManager().canScrollVertically();
        return bl;
    }

    private static boolean canScrollViewScroll(ScrollView scrollView) {
        int n = scrollView.getChildCount();
        boolean bl = false;
        if (n == 0) {
            return false;
        }
        n = scrollView.getChildAt(0).getMeasuredHeight();
        if (scrollView.getMeasuredHeight() - scrollView.getPaddingTop() - scrollView.getPaddingBottom() < n) {
            bl = true;
        }
        return bl;
    }

    private static boolean canWebViewScroll(WebView webView) {
        float f2 = webView.getMeasuredHeight();
        float f4 = webView.getContentHeight();
        boolean bl = f2 < webView.getScale() * f4;
        return bl;
    }

    @Nullable
    private static View getBottomView(ViewGroup viewGroup) {
        View view;
        View view2 = view = null;
        if (viewGroup != null) {
            if (viewGroup.getChildCount() == 0) {
                view2 = view;
            } else {
                int n = viewGroup.getChildCount() - 1;
                while (true) {
                    view2 = view;
                    if (n < 0 || (view2 = viewGroup.getChildAt(n)).getVisibility() == 0 && view2.getBottom() == viewGroup.getMeasuredHeight()) break;
                    --n;
                }
            }
        }
        return view2;
    }

    @Nullable
    private static View getTopView(ViewGroup viewGroup) {
        View view;
        View view2 = view = null;
        if (viewGroup != null) {
            if (viewGroup.getChildCount() == 0) {
                view2 = view;
            } else {
                int n = viewGroup.getChildCount() - 1;
                while (true) {
                    view2 = view;
                    if (n < 0 || (view2 = viewGroup.getChildAt(n)).getVisibility() == 0 && view2.getTop() == 0) break;
                    --n;
                }
            }
        }
        return view2;
    }

    private void init(Context context, AttributeSet attributeSet, int n) {
        Resources resources = context.getResources();
        attributeSet = context.obtainStyledAttributes(attributeSet, R.styleable.MDRootLayout, n, 0);
        this.reducePaddingNoTitleNoButtons = attributeSet.getBoolean(R.styleable.MDRootLayout_md_reduce_padding_no_title_no_buttons, true);
        attributeSet.recycle();
        this.noTitlePaddingFull = resources.getDimensionPixelSize(R.dimen.md_notitle_vertical_padding);
        this.buttonPaddingFull = resources.getDimensionPixelSize(R.dimen.md_button_frame_vertical_padding);
        this.buttonHorizontalEdgeMargin = resources.getDimensionPixelSize(R.dimen.md_button_padding_frame_side);
        this.buttonBarHeight = resources.getDimensionPixelSize(R.dimen.md_button_height);
        this.dividerPaint = new Paint();
        this.dividerWidth = resources.getDimensionPixelSize(R.dimen.md_divider_height);
        this.dividerPaint.setColor(DialogUtils.resolveColor(context, R.attr.md_divider_color));
        this.setWillNotDraw(false);
    }

    /*
     * Unable to fully structure code
     */
    private void invalidateDividersForScrollingView(ViewGroup var1_1, boolean var2_2, boolean var3_3, boolean var4_4) {
        block5: {
            block4: {
                var6_5 = true;
                if (!var2_2 || var1_1.getChildCount() <= 0) break block4;
                var7_6 = this.titleBar;
                if (var7_6 == null || var7_6.getVisibility() == 8) ** GOTO lbl-1000
                var5_7 = var1_1.getScrollY();
                if (var1_1.getPaddingTop() + var5_7 > var1_1.getChildAt(0).getTop()) {
                    var2_2 = true;
                } else lbl-1000:
                // 2 sources

                {
                    var2_2 = false;
                }
                this.drawTopDivider = var2_2;
            }
            if (!var3_3 || var1_1.getChildCount() <= 0) break block5;
            if (!var4_4) ** GOTO lbl-1000
            var5_7 = var1_1.getScrollY();
            if (var1_1.getHeight() + var5_7 - var1_1.getPaddingBottom() < var1_1.getChildAt(var1_1.getChildCount() - 1).getBottom()) {
                var2_2 = var6_5;
            } else lbl-1000:
            // 2 sources

            {
                var2_2 = false;
            }
            this.drawBottomDivider = var2_2;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void invalidateDividersForWebView(WebView var1_1, boolean var2_2, boolean var3_3, boolean var4_4) {
        block5: {
            block4: {
                var8_5 = true;
                if (!var2_2) break block4;
                var9_6 = this.titleBar;
                if (var9_6 == null || var9_6.getVisibility() == 8) ** GOTO lbl-1000
                var7_7 = var1_1.getScrollY();
                if (var1_1.getPaddingTop() + var7_7 > 0) {
                    var2_2 = true;
                } else lbl-1000:
                // 2 sources

                {
                    var2_2 = false;
                }
                this.drawTopDivider = var2_2;
            }
            if (!var3_3) break block5;
            if (!var4_4) ** GOTO lbl-1000
            var7_7 = var1_1.getScrollY();
            var5_8 = var1_1.getMeasuredHeight() + var7_7 - var1_1.getPaddingBottom();
            var6_9 = var1_1.getContentHeight();
            if (var5_8 < var1_1.getScale() * var6_9) {
                var2_2 = var8_5;
            } else lbl-1000:
            // 2 sources

            {
                var2_2 = false;
            }
            this.drawBottomDivider = var2_2;
        }
    }

    private void invertGravityIfNecessary() {
        if (this.getResources().getConfiguration().getLayoutDirection() == 1) {
            int n = 4.$SwitchMap$com$afollestad$materialdialogs$GravityEnum[this.buttonGravity.ordinal()];
            if (n != 1) {
                if (n == 2) {
                    this.buttonGravity = GravityEnum.START;
                }
            } else {
                this.buttonGravity = GravityEnum.END;
            }
        }
    }

    private static boolean isVisible(View view) {
        boolean bl = true;
        boolean bl2 = view != null && view.getVisibility() != 8;
        boolean bl3 = bl2;
        if (bl2) {
            bl3 = bl2;
            if (view instanceof MDButton) {
                bl2 = ((MDButton)view).getText().toString().trim().length() > 0 ? bl : false;
                bl3 = bl2;
            }
        }
        return bl3;
    }

    private void setUpDividersVisibility(View view, boolean bl, boolean bl2) {
        if (view == null) {
            return;
        }
        if (view instanceof ScrollView) {
            if (MDRootLayout.canScrollViewScroll((ScrollView)(view = (ScrollView)view))) {
                this.addScrollListener((ViewGroup)view, bl, bl2);
            } else {
                if (bl) {
                    this.drawTopDivider = false;
                }
                if (bl2) {
                    this.drawBottomDivider = false;
                }
            }
        } else if (view instanceof AdapterView) {
            if (MDRootLayout.canAdapterViewScroll((AdapterView)(view = (AdapterView)view))) {
                this.addScrollListener((ViewGroup)view, bl, bl2);
            } else {
                if (bl) {
                    this.drawTopDivider = false;
                }
                if (bl2) {
                    this.drawBottomDivider = false;
                }
            }
        } else if (view instanceof WebView) {
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener(this, view, bl, bl2){
                public final MDRootLayout this$0;
                public final boolean val$setForBottom;
                public final boolean val$setForTop;
                public final View val$view;
                {
                    this.this$0 = mDRootLayout;
                    this.val$view = view;
                    this.val$setForTop = bl;
                    this.val$setForBottom = bl2;
                }

                public boolean onPreDraw() {
                    if (this.val$view.getMeasuredHeight() != 0) {
                        if (!MDRootLayout.canWebViewScroll((WebView)this.val$view)) {
                            if (this.val$setForTop) {
                                MDRootLayout.access$102(this.this$0, false);
                            }
                            if (this.val$setForBottom) {
                                MDRootLayout.access$202(this.this$0, false);
                            }
                        } else {
                            this.this$0.addScrollListener((ViewGroup)this.val$view, this.val$setForTop, this.val$setForBottom);
                        }
                        this.val$view.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
                    }
                    return true;
                }
            });
        } else if (view instanceof RecyclerView) {
            boolean bl3 = MDRootLayout.canRecyclerViewScroll((RecyclerView)view);
            if (bl) {
                this.drawTopDivider = bl3;
            }
            if (bl2) {
                this.drawBottomDivider = bl3;
            }
            if (bl3) {
                this.addScrollListener((ViewGroup)view, bl, bl2);
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup)view;
            view = MDRootLayout.getTopView(viewGroup);
            this.setUpDividersVisibility(view, bl, bl2);
            viewGroup = MDRootLayout.getBottomView(viewGroup);
            if (viewGroup != view) {
                this.setUpDividersVisibility((View)viewGroup, false, true);
            }
        }
    }

    public void noTitleNoPadding() {
        this.noTitleNoPadding = true;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.content;
        if (view != null) {
            int n;
            if (this.drawTopDivider) {
                n = view.getTop();
                canvas.drawRect(0.0f, (float)(n - this.dividerWidth), (float)this.getMeasuredWidth(), (float)n, this.dividerPaint);
            }
            if (this.drawBottomDivider) {
                n = this.content.getBottom();
                canvas.drawRect(0.0f, (float)n, (float)this.getMeasuredWidth(), (float)(n + this.dividerWidth), this.dividerPaint);
            }
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        for (int j = 0; j < this.getChildCount(); ++j) {
            View view = this.getChildAt(j);
            if (view.getId() == R.id.md_titleFrame) {
                this.titleBar = view;
                continue;
            }
            if (view.getId() == R.id.md_buttonDefaultNeutral) {
                this.buttons[0] = (MDButton)view;
                continue;
            }
            if (view.getId() == R.id.md_buttonDefaultNegative) {
                this.buttons[1] = (MDButton)view;
                continue;
            }
            if (view.getId() == R.id.md_buttonDefaultPositive) {
                this.buttons[2] = (MDButton)view;
                continue;
            }
            this.content = view;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void onLayout(boolean var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        block22: {
            block24: {
                block27: {
                    block29: {
                        block28: {
                            block26: {
                                block25: {
                                    block23: {
                                        block21: {
                                            if (MDRootLayout.isVisible(this.titleBar)) {
                                                var6_6 = this.titleBar.getMeasuredHeight();
                                                var11_7 /* !! */  = this.titleBar;
                                                var11_7 /* !! */ .layout(var2_2, var3_3, var4_4, var6_6 += var3_3);
                                            } else {
                                                var6_6 = var3_3;
                                                if (!this.noTitleNoPadding) {
                                                    var6_6 = var3_3;
                                                    if (this.useFullPadding) {
                                                        var6_6 = var3_3 + this.noTitlePaddingFull;
                                                    }
                                                }
                                            }
                                            if (MDRootLayout.isVisible(this.content)) {
                                                var11_7 /* !! */  = this.content;
                                                var11_7 /* !! */ .layout(var2_2, var6_6, var4_4, var11_7 /* !! */ .getMeasuredHeight() + var6_6);
                                            }
                                            var1_1 = this.isStacked;
                                            var3_3 = 0;
                                            if (!var1_1) break block21;
                                            var6_6 = var5_5 - this.buttonPaddingFull;
                                            var12_8 = this.buttons;
                                            var7_9 = var12_8.length;
                                            for (var5_5 = var3_3; var5_5 < var7_9; ++var5_5) {
                                                var11_7 /* !! */  = var12_8[var5_5];
                                                var3_3 = var6_6;
                                                if (MDRootLayout.isVisible(var11_7 /* !! */ )) {
                                                    var11_7 /* !! */ .layout(var2_2, var6_6 - var11_7 /* !! */ .getMeasuredHeight(), var4_4, var6_6);
                                                    var3_3 = var6_6 - var11_7 /* !! */ .getMeasuredHeight();
                                                }
                                                var6_6 = var3_3;
                                            }
                                            break block22;
                                        }
                                        var7_10 = var5_5;
                                        if (this.useFullPadding) {
                                            var7_10 = var5_5 - this.buttonPaddingFull;
                                        }
                                        var10_11 = var7_10 - this.buttonBarHeight;
                                        var8_12 = this.buttonHorizontalEdgeMargin;
                                        if (MDRootLayout.isVisible((View)this.buttons[2])) {
                                            if (this.buttonGravity == GravityEnum.END) {
                                                var3_3 = var2_2 + var8_12;
                                                var6_6 = this.buttons[2].getMeasuredWidth() + var3_3;
                                                var5_5 = -1;
                                            } else {
                                                var6_6 = var4_4 - var8_12;
                                                var5_5 = var3_3 = var6_6 - this.buttons[2].getMeasuredWidth();
                                            }
                                            this.buttons[2].layout(var3_3, var10_11, var6_6, var7_10);
                                            var3_3 = var8_12 + this.buttons[2].getMeasuredWidth();
                                        } else {
                                            var5_5 = -1;
                                            var3_3 = var8_12;
                                        }
                                        if (MDRootLayout.isVisible((View)this.buttons[1])) {
                                            var11_7 /* !! */  = this.buttonGravity;
                                            if (var11_7 /* !! */  == GravityEnum.END) {
                                                var6_6 = var3_3 + var2_2;
                                                var3_3 = this.buttons[1].getMeasuredWidth() + var6_6;
lbl53:
                                                // 2 sources

                                                while (true) {
                                                    var9_13 = -1;
                                                    var8_12 = var6_6;
                                                    var6_6 = var3_3;
                                                    var3_3 = var9_13;
                                                    break;
                                                }
                                            } else {
                                                if (var11_7 /* !! */  == GravityEnum.START) {
                                                    var3_3 = var4_4 - var3_3;
                                                    var6_6 = var3_3 - this.buttons[1].getMeasuredWidth();
                                                    ** continue;
                                                }
                                                var8_12 = this.buttonHorizontalEdgeMargin + var2_2;
                                                var3_3 = var6_6 = this.buttons[1].getMeasuredWidth() + var8_12;
                                            }
                                            this.buttons[1].layout(var8_12, var10_11, var6_6, var7_10);
                                        } else {
                                            var3_3 = -1;
                                        }
                                        if (!MDRootLayout.isVisible((View)this.buttons[0])) break block22;
                                        var11_7 /* !! */  = this.buttonGravity;
                                        if (var11_7 /* !! */  != GravityEnum.END) break block23;
                                        var3_3 = var4_4 - this.buttonHorizontalEdgeMargin;
                                        var2_2 = var3_3 - this.buttons[0].getMeasuredWidth();
                                        break block24;
                                    }
                                    if (var11_7 /* !! */  != GravityEnum.START) break block25;
                                    var3_3 = this.buttons[0].getMeasuredWidth() + (var2_2 += this.buttonHorizontalEdgeMargin);
                                    break block24;
                                }
                                if (var3_3 != -1 || var5_5 == -1) break block26;
                                var3_3 = var5_5 - this.buttons[0].getMeasuredWidth();
                                var6_6 = var5_5;
                                break block27;
                            }
                            if (var5_5 != -1 || var3_3 == -1) break block28;
                            var2_2 = this.buttons[0].getMeasuredWidth();
                            break block29;
                        }
                        var6_6 = var5_5;
                        if (var5_5 != -1) break block27;
                        var3_3 = (var4_4 - var2_2) / 2 - this.buttons[0].getMeasuredWidth() / 2;
                        var2_2 = this.buttons[0].getMeasuredWidth();
                    }
                    var6_6 = var2_2 + var3_3;
                }
                var2_2 = var3_3;
                var3_3 = var6_6;
            }
            this.buttons[0].layout(var2_2, var10_11, var3_3, var7_10);
        }
        this.setUpDividersVisibility(this.content, true, true);
    }

    public void onMeasure(int n, int n2) {
        int n3;
        int n4;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        block25: {
            block26: {
                block23: {
                    block24: {
                        int n11;
                        int n12;
                        boolean bl;
                        n10 = View.MeasureSpec.getSize((int)n);
                        n9 = View.MeasureSpec.getSize((int)n2);
                        n8 = this.maxHeight;
                        n7 = n9;
                        if (n9 > n8) {
                            n7 = n8;
                        }
                        this.useFullPadding = true;
                        Object object = this.stackBehavior;
                        MDButton[] mDButtonArray = StackingBehavior.ALWAYS;
                        n6 = 0;
                        if (object == mDButtonArray) {
                            bl = true;
                            n9 = 0;
                        } else if (object == StackingBehavior.NEVER) {
                            bl = false;
                            n9 = 0;
                        } else {
                            mDButtonArray = this.buttons;
                            n12 = mDButtonArray.length;
                            n9 = n11 = 0;
                            for (n4 = 0; n4 < n12; ++n4) {
                                object = mDButtonArray[n4];
                                n3 = n11;
                                n8 = n9;
                                if (object != null) {
                                    n3 = n11;
                                    n8 = n9;
                                    if (MDRootLayout.isVisible((View)object)) {
                                        ((MDButton)((Object)object)).setStacked(false, false);
                                        this.measureChild((View)object, n, n2);
                                        n3 = n11 + object.getMeasuredWidth();
                                        n8 = 1;
                                    }
                                }
                                n11 = n3;
                                n9 = n8;
                            }
                            bl = n11 > n10 - this.getContext().getResources().getDimensionPixelSize(R.dimen.md_neutral_button_margin) * 2;
                        }
                        this.isStacked = bl;
                        if (bl) {
                            mDButtonArray = this.buttons;
                            n12 = mDButtonArray.length;
                            n3 = 0;
                            n8 = 0;
                            while (true) {
                                n11 = n8;
                                n4 = n9;
                                if (n3 < n12) {
                                    object = mDButtonArray[n3];
                                    n11 = n8;
                                    n4 = n9;
                                    if (object != null) {
                                        n11 = n8;
                                        n4 = n9;
                                        if (MDRootLayout.isVisible((View)object)) {
                                            ((MDButton)((Object)object)).setStacked(true, false);
                                            this.measureChild((View)object, n, n2);
                                            n11 = n8 + object.getMeasuredHeight();
                                            n4 = 1;
                                        }
                                    }
                                    ++n3;
                                    n8 = n11;
                                    n9 = n4;
                                    continue;
                                }
                                break;
                            }
                        } else {
                            n11 = 0;
                            n4 = n9;
                        }
                        if (n4 == 0) break block23;
                        if (!this.isStacked) break block24;
                        n = n7 - n11;
                        n9 = this.buttonPaddingFull;
                        n2 = n9 * 2 + 0;
                        n8 = n9 * 2 + 0;
                        break block25;
                    }
                    n = n7 - this.buttonBarHeight;
                    n2 = this.buttonPaddingFull * 2 + 0;
                    break block26;
                }
                n2 = this.buttonPaddingFull * 2 + 0;
                n = n7;
            }
            n8 = 0;
        }
        if (MDRootLayout.isVisible(this.titleBar)) {
            this.titleBar.measure(View.MeasureSpec.makeMeasureSpec((int)n10, (int)0x40000000), 0);
            n9 = n - this.titleBar.getMeasuredHeight();
            n3 = n2;
        } else {
            n3 = n2;
            n9 = n;
            if (!this.noTitleNoPadding) {
                n3 = n2 + this.noTitlePaddingFull;
                n9 = n;
            }
        }
        if (MDRootLayout.isVisible(this.content)) {
            this.content.measure(View.MeasureSpec.makeMeasureSpec((int)n10, (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)(n9 - n8), (int)Integer.MIN_VALUE));
            if (this.content.getMeasuredHeight() <= n9 - n3) {
                if (this.reducePaddingNoTitleNoButtons && !MDRootLayout.isVisible(this.titleBar) && n4 == 0) {
                    this.useFullPadding = false;
                    n = n9 - (this.content.getMeasuredHeight() + n8);
                } else {
                    this.useFullPadding = true;
                    n = n9 - (this.content.getMeasuredHeight() + n3);
                }
            } else {
                this.useFullPadding = false;
                n = n6;
            }
        } else {
            n = n9;
        }
        this.setMeasuredDimension(n10, n7 - n);
    }

    public void setButtonGravity(GravityEnum gravityEnum) {
        this.buttonGravity = gravityEnum;
        this.invertGravityIfNecessary();
    }

    public void setButtonStackedGravity(GravityEnum gravityEnum) {
        for (MDButton mDButton : this.buttons) {
            if (mDButton == null) continue;
            mDButton.setStackedGravity(gravityEnum);
        }
    }

    public void setDividerColor(int n) {
        this.dividerPaint.setColor(n);
        this.invalidate();
    }

    public void setMaxHeight(int n) {
        this.maxHeight = n;
    }

    public void setStackingBehavior(StackingBehavior stackingBehavior) {
        this.stackBehavior = stackingBehavior;
        this.invalidate();
    }
}

