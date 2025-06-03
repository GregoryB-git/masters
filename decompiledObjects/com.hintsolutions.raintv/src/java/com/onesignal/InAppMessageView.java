/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.ValueAnimator
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Color
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.Interpolator
 *  android.webkit.WebView
 *  android.widget.PopupWindow
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.cardview.widget.CardView
 *  androidx.core.widget.PopupWindowCompat
 *  com.onesignal.InAppMessageView$3
 *  com.onesignal.OneSignalAnimate
 *  com.onesignal.OneSignalBounceInterpolator
 *  com.onesignal.WebViewManager$OneSignalGenericCallback
 *  com.onesignal.WebViewManager$Position
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.onesignal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.widget.PopupWindowCompat;
import com.onesignal.DraggableRelativeLayout;
import com.onesignal.InAppMessageView;
import com.onesignal.OSInAppMessageContent;
import com.onesignal.OSUtils;
import com.onesignal.OSViewUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalAnimate;
import com.onesignal.OneSignalBounceInterpolator;
import com.onesignal.WebViewManager;

class InAppMessageView {
    private static final int ACTIVITY_BACKGROUND_COLOR_EMPTY = Color.parseColor((String)"#00000000");
    private static final int ACTIVITY_BACKGROUND_COLOR_FULL = Color.parseColor((String)"#BB000000");
    private static final int ACTIVITY_FINISH_AFTER_DISMISS_DELAY_MS = 600;
    private static final int ACTIVITY_INIT_DELAY = 200;
    private static final int DRAG_THRESHOLD_PX_SIZE = OSViewUtils.dpToPx(4);
    private static final int IN_APP_BACKGROUND_ANIMATION_DURATION_MS = 400;
    private static final int IN_APP_BANNER_ANIMATION_DURATION_MS = 1000;
    private static final int IN_APP_CENTER_ANIMATION_DURATION_MS = 1000;
    private static final String IN_APP_MESSAGE_CARD_VIEW_TAG = "IN_APP_MESSAGE_CARD_VIEW_TAG";
    private Activity currentActivity;
    private boolean disableDragDismiss = false;
    private double displayDuration;
    @NonNull
    private WebViewManager.Position displayLocation;
    private DraggableRelativeLayout draggableRelativeLayout;
    private final Handler handler = new Handler();
    private boolean hasBackground;
    private boolean isDragging = false;
    private int marginPxSizeBottom;
    private int marginPxSizeLeft = OSViewUtils.dpToPx(24);
    private int marginPxSizeRight = OSViewUtils.dpToPx(24);
    private int marginPxSizeTop = OSViewUtils.dpToPx(24);
    private OSInAppMessageContent messageContent;
    private InAppMessageViewListener messageController;
    private int pageHeight;
    private int pageWidth;
    private RelativeLayout parentRelativeLayout;
    private PopupWindow popupWindow;
    private Runnable scheduleDismissRunnable;
    private boolean shouldDismissWhenActive = false;
    private WebView webView;

    public InAppMessageView(@NonNull WebView webView, @NonNull OSInAppMessageContent oSInAppMessageContent, boolean bl) {
        this.marginPxSizeBottom = OSViewUtils.dpToPx(24);
        this.webView = webView;
        this.displayLocation = oSInAppMessageContent.getDisplayLocation();
        this.pageHeight = oSInAppMessageContent.getPageHeight();
        this.pageWidth = -1;
        double d = oSInAppMessageContent.getDisplayDuration() == null ? 0.0 : oSInAppMessageContent.getDisplayDuration();
        this.displayDuration = d;
        this.hasBackground = this.displayLocation.isBanner() ^ true;
        this.disableDragDismiss = bl;
        this.messageContent = oSInAppMessageContent;
        this.setMarginsFromContent(oSInAppMessageContent);
    }

    public static /* synthetic */ void access$1300(InAppMessageView inAppMessageView, WebViewManager.OneSignalGenericCallback oneSignalGenericCallback) {
        inAppMessageView.finishAfterDelay(oneSignalGenericCallback);
    }

    public static /* synthetic */ boolean access$1402(InAppMessageView inAppMessageView, boolean bl) {
        inAppMessageView.isDragging = bl;
        return bl;
    }

    public static /* synthetic */ Runnable access$1502(InAppMessageView inAppMessageView, Runnable runnable) {
        inAppMessageView.scheduleDismissRunnable = runnable;
        return runnable;
    }

    public static /* synthetic */ boolean access$1602(InAppMessageView inAppMessageView, boolean bl) {
        inAppMessageView.shouldDismissWhenActive = bl;
        return bl;
    }

    private void animateAndDismissLayout(View view, WebViewManager.OneSignalGenericCallback object) {
        object = new AnimatorListenerAdapter(this, (WebViewManager.OneSignalGenericCallback)object){
            public final InAppMessageView this$0;
            public final WebViewManager.OneSignalGenericCallback val$callback;
            {
                this.this$0 = inAppMessageView;
                this.val$callback = oneSignalGenericCallback;
            }

            public void onAnimationEnd(Animator animator2) {
                this.this$0.cleanupViewsAfterDismiss();
                animator2 = this.val$callback;
                if (animator2 != null) {
                    animator2.onComplete();
                }
            }
        };
        this.animateBackgroundColor(view, 400, ACTIVITY_BACKGROUND_COLOR_FULL, ACTIVITY_BACKGROUND_COLOR_EMPTY, (Animator.AnimatorListener)object).start();
    }

    private ValueAnimator animateBackgroundColor(View view, int n, int n2, int n3, Animator.AnimatorListener animatorListener) {
        return OneSignalAnimate.animateViewColor((View)view, (int)n, (int)n2, (int)n3, (Animator.AnimatorListener)animatorListener);
    }

    private void animateBottom(View view, int n, Animation.AnimationListener animationListener) {
        OneSignalAnimate.animateViewByTranslation((View)view, (float)(n + this.marginPxSizeBottom), (float)0.0f, (int)1000, (Interpolator)new OneSignalBounceInterpolator(0.1, 8.0), (Animation.AnimationListener)animationListener).start();
    }

    private void animateCenter(View view, View view2, Animation.AnimationListener animationListener, Animator.AnimatorListener animatorListener) {
        view = OneSignalAnimate.animateViewSmallToLarge((View)view, (int)1000, (Interpolator)new OneSignalBounceInterpolator(0.1, 8.0), (Animation.AnimationListener)animationListener);
        view2 = this.animateBackgroundColor(view2, 400, ACTIVITY_BACKGROUND_COLOR_EMPTY, ACTIVITY_BACKGROUND_COLOR_FULL, animatorListener);
        view.start();
        view2.start();
    }

    private void animateInAppMessage(WebViewManager.Position position, View view, View view2) {
        CardView cardView = (CardView)view.findViewWithTag((Object)IN_APP_MESSAGE_CARD_VIEW_TAG);
        Animation.AnimationListener animationListener = this.createAnimationListener(cardView);
        int n = 9.$SwitchMap$com$onesignal$WebViewManager$Position[position.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n == 3 || n == 4) {
                    this.animateCenter(view, view2, animationListener, null);
                }
            } else {
                this.animateBottom((View)cardView, this.webView.getHeight(), animationListener);
            }
        } else {
            this.animateTop((View)cardView, this.webView.getHeight(), animationListener);
        }
    }

    private void animateTop(View view, int n, Animation.AnimationListener animationListener) {
        OneSignalAnimate.animateViewByTranslation((View)view, (float)(-n - this.marginPxSizeTop), (float)0.0f, (int)1000, (Interpolator)new OneSignalBounceInterpolator(0.1, 8.0), (Animation.AnimationListener)animationListener).start();
    }

    private void cleanupViewsAfterDismiss() {
        this.removeAllViews();
        InAppMessageViewListener inAppMessageViewListener = this.messageController;
        if (inAppMessageViewListener != null) {
            inAppMessageViewListener.onMessageWasDismissed();
        }
    }

    private Animation.AnimationListener createAnimationListener(CardView cardView) {
        return new Animation.AnimationListener(this, cardView){
            public final InAppMessageView this$0;
            public final CardView val$messageViewCardView;
            {
                this.this$0 = inAppMessageView;
                this.val$messageViewCardView = cardView;
            }

            public void onAnimationEnd(Animation animation) {
                if (this.this$0.messageController != null) {
                    this.this$0.messageController.onMessageWasShown();
                }
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        };
    }

    private CardView createCardView(Context context) {
        CardView cardView = new CardView(context);
        int n = this.displayLocation == WebViewManager.Position.FULL_SCREEN ? -1 : -2;
        context = new RelativeLayout.LayoutParams(-1, n);
        context.addRule(13);
        cardView.setLayoutParams((ViewGroup.LayoutParams)context);
        cardView.setCardElevation((float)OSViewUtils.dpToPx(5));
        cardView.setRadius((float)OSViewUtils.dpToPx(8));
        cardView.setClipChildren(false);
        cardView.setClipToPadding(false);
        cardView.setPreventCornerOverlap(false);
        cardView.setCardBackgroundColor(0);
        return cardView;
    }

    private DraggableRelativeLayout.Params createDraggableLayoutParams(int n, WebViewManager.Position position, boolean bl) {
        int n2;
        DraggableRelativeLayout.Params params;
        block6: {
            block3: {
                block4: {
                    block5: {
                        params = new DraggableRelativeLayout.Params();
                        params.maxXPos = this.marginPxSizeRight;
                        params.maxYPos = this.marginPxSizeTop;
                        params.draggingDisabled = bl;
                        params.messageHeight = n;
                        params.height = this.getDisplayYSize();
                        int n3 = 9.$SwitchMap$com$onesignal$WebViewManager$Position[position.ordinal()];
                        n2 = 1;
                        if (n3 == 1) break block3;
                        if (n3 == 2) break block4;
                        if (n3 == 3) break block5;
                        if (n3 != 4) break block6;
                        params.messageHeight = n = this.getDisplayYSize() - (this.marginPxSizeBottom + this.marginPxSizeTop);
                    }
                    n = this.getDisplayYSize() / 2 - n / 2;
                    params.dragThresholdY = DRAG_THRESHOLD_PX_SIZE + n;
                    params.maxYPos = n;
                    params.posY = n;
                    break block6;
                }
                params.posY = this.getDisplayYSize() - n;
                params.dragThresholdY = this.marginPxSizeBottom + DRAG_THRESHOLD_PX_SIZE;
                break block6;
            }
            params.dragThresholdY = this.marginPxSizeTop - DRAG_THRESHOLD_PX_SIZE;
        }
        n = n2;
        if (position == WebViewManager.Position.TOP_BANNER) {
            n = 0;
        }
        params.dragDirection = n;
        return params;
    }

    private RelativeLayout.LayoutParams createParentRelativeLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.pageWidth, -1);
        int n = 9.$SwitchMap$com$onesignal$WebViewManager$Position[this.displayLocation.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n == 3 || n == 4) {
                    layoutParams.addRule(13);
                }
            } else {
                layoutParams.addRule(12);
                layoutParams.addRule(14);
            }
        } else {
            layoutParams.addRule(10);
            layoutParams.addRule(14);
        }
        return layoutParams;
    }

    private void createPopupWindow(@NonNull RelativeLayout relativeLayout) {
        int n;
        int n2;
        block4: {
            block1: {
                block2: {
                    block3: {
                        boolean bl = this.hasBackground;
                        n2 = -1;
                        n = bl ? -1 : this.pageWidth;
                        if (!bl) {
                            n2 = -2;
                        }
                        int n3 = 1;
                        relativeLayout = new PopupWindow((View)relativeLayout, n, n2, true);
                        this.popupWindow = relativeLayout;
                        relativeLayout.setBackgroundDrawable((Drawable)new ColorDrawable(0));
                        this.popupWindow.setTouchable(true);
                        this.popupWindow.setClippingEnabled(false);
                        if (this.hasBackground) break block1;
                        n2 = 9.$SwitchMap$com$onesignal$WebViewManager$Position[this.displayLocation.ordinal()];
                        if (n2 == 1) break block2;
                        if (n2 == 2) break block3;
                        n = n3;
                        if (n2 == 3) break block4;
                        n = n3;
                        if (n2 == 4) break block4;
                        break block1;
                    }
                    n = 81;
                    break block4;
                }
                n = 49;
                break block4;
            }
            n = 0;
        }
        n2 = this.messageContent.isFullBleed() ? 1000 : 1003;
        PopupWindowCompat.setWindowLayoutType((PopupWindow)this.popupWindow, (int)n2);
        this.popupWindow.showAtLocation(this.currentActivity.getWindow().getDecorView().getRootView(), n, 0, 0);
    }

    private void delayShowUntilAvailable(Activity activity) {
        if (OSViewUtils.isActivityFullyReady(activity) && this.parentRelativeLayout == null) {
            this.showInAppMessageView(activity);
            return;
        }
        new Handler().postDelayed(new Runnable(this, activity){
            public final InAppMessageView this$0;
            public final Activity val$currentActivity;
            {
                this.this$0 = inAppMessageView;
                this.val$currentActivity = activity;
            }

            public void run() {
                this.this$0.delayShowUntilAvailable(this.val$currentActivity);
            }
        }, 200L);
    }

    private void dereferenceViews() {
        this.parentRelativeLayout = null;
        this.draggableRelativeLayout = null;
        this.webView = null;
    }

    private void finishAfterDelay(WebViewManager.OneSignalGenericCallback oneSignalGenericCallback) {
        OSUtils.runOnMainThreadDelayed(new Runnable(this, oneSignalGenericCallback){
            public final InAppMessageView this$0;
            public final WebViewManager.OneSignalGenericCallback val$callback;
            {
                this.this$0 = inAppMessageView;
                this.val$callback = oneSignalGenericCallback;
            }

            public void run() {
                if (this.this$0.hasBackground && this.this$0.parentRelativeLayout != null) {
                    InAppMessageView inAppMessageView = this.this$0;
                    inAppMessageView.animateAndDismissLayout((View)inAppMessageView.parentRelativeLayout, this.val$callback);
                } else {
                    this.this$0.cleanupViewsAfterDismiss();
                    WebViewManager.OneSignalGenericCallback oneSignalGenericCallback = this.val$callback;
                    if (oneSignalGenericCallback != null) {
                        oneSignalGenericCallback.onComplete();
                    }
                }
            }
        }, 600);
    }

    private int getDisplayYSize() {
        return OSViewUtils.getWindowHeight(this.currentActivity);
    }

    private void setMarginsFromContent(OSInAppMessageContent oSInAppMessageContent) {
        boolean bl = oSInAppMessageContent.getUseHeightMargin();
        int n = 0;
        int n2 = bl ? OSViewUtils.dpToPx(24) : 0;
        this.marginPxSizeTop = n2;
        n2 = oSInAppMessageContent.getUseHeightMargin() ? OSViewUtils.dpToPx(24) : 0;
        this.marginPxSizeBottom = n2;
        n2 = oSInAppMessageContent.getUseWidthMargin() ? OSViewUtils.dpToPx(24) : 0;
        this.marginPxSizeLeft = n2;
        n2 = n;
        if (oSInAppMessageContent.getUseWidthMargin()) {
            n2 = OSViewUtils.dpToPx(24);
        }
        this.marginPxSizeRight = n2;
    }

    private void setUpDraggableLayout(Context context, RelativeLayout.LayoutParams layoutParams, DraggableRelativeLayout.Params params) {
        DraggableRelativeLayout draggableRelativeLayout;
        this.draggableRelativeLayout = draggableRelativeLayout = new DraggableRelativeLayout(context);
        if (layoutParams != null) {
            draggableRelativeLayout.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        }
        this.draggableRelativeLayout.setParams(params);
        this.draggableRelativeLayout.setListener((DraggableRelativeLayout.DraggableListener)new 3(this));
        if (this.webView.getParent() != null) {
            ((ViewGroup)this.webView.getParent()).removeAllViews();
        }
        context = this.createCardView(context);
        context.setTag((Object)IN_APP_MESSAGE_CARD_VIEW_TAG);
        context.addView((View)this.webView);
        this.draggableRelativeLayout.setPadding(this.marginPxSizeLeft, this.marginPxSizeTop, this.marginPxSizeRight, this.marginPxSizeBottom);
        this.draggableRelativeLayout.setClipChildren(false);
        this.draggableRelativeLayout.setClipToPadding(false);
        this.draggableRelativeLayout.addView((View)context);
    }

    private void setUpParentRelativeLayout(Context context) {
        context = new RelativeLayout(context);
        this.parentRelativeLayout = context;
        context.setBackgroundDrawable((Drawable)new ColorDrawable(0));
        this.parentRelativeLayout.setClipChildren(false);
        this.parentRelativeLayout.setClipToPadding(false);
        this.parentRelativeLayout.addView((View)this.draggableRelativeLayout);
    }

    private void showDraggableView(WebViewManager.Position position, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, DraggableRelativeLayout.Params params) {
        OSUtils.runOnMainUIThread(new Runnable(this, layoutParams, layoutParams2, params, position){
            public final InAppMessageView this$0;
            public final WebViewManager.Position val$displayLocation;
            public final RelativeLayout.LayoutParams val$draggableRelativeLayoutParams;
            public final RelativeLayout.LayoutParams val$relativeLayoutParams;
            public final DraggableRelativeLayout.Params val$webViewLayoutParams;
            {
                this.this$0 = inAppMessageView;
                this.val$relativeLayoutParams = layoutParams;
                this.val$draggableRelativeLayoutParams = layoutParams2;
                this.val$webViewLayoutParams = params;
                this.val$displayLocation = position;
            }

            public void run() {
                if (this.this$0.webView == null) {
                    return;
                }
                this.this$0.webView.setLayoutParams((ViewGroup.LayoutParams)this.val$relativeLayoutParams);
                Object object = this.this$0.currentActivity.getApplicationContext();
                this.this$0.setUpDraggableLayout(object, this.val$draggableRelativeLayoutParams, this.val$webViewLayoutParams);
                this.this$0.setUpParentRelativeLayout(object);
                object = this.this$0;
                ((InAppMessageView)object).createPopupWindow(((InAppMessageView)object).parentRelativeLayout);
                if (this.this$0.messageController != null) {
                    object = this.this$0;
                    ((InAppMessageView)object).animateInAppMessage(this.val$displayLocation, (View)((InAppMessageView)object).draggableRelativeLayout, (View)this.this$0.parentRelativeLayout);
                }
                this.this$0.startDismissTimerIfNeeded();
            }
        });
    }

    private void startDismissTimerIfNeeded() {
        Runnable runnable;
        if (this.displayDuration <= 0.0) {
            return;
        }
        if (this.scheduleDismissRunnable != null) {
            return;
        }
        this.scheduleDismissRunnable = runnable = new Runnable(this){
            public final InAppMessageView this$0;
            {
                this.this$0 = inAppMessageView;
            }

            public void run() {
                if (this.this$0.messageController != null) {
                    this.this$0.messageController.onMessageWillDismiss();
                }
                if (this.this$0.currentActivity != null) {
                    this.this$0.dismissAndAwaitNextMessage(null);
                    InAppMessageView.access$1502(this.this$0, null);
                } else {
                    InAppMessageView.access$1602(this.this$0, true);
                }
            }
        };
        this.handler.postDelayed(runnable, (long)this.displayDuration * 1000L);
    }

    public void checkIfShouldDismiss() {
        if (this.shouldDismissWhenActive) {
            this.shouldDismissWhenActive = false;
            this.finishAfterDelay(null);
        }
    }

    public void dismissAndAwaitNextMessage(@Nullable WebViewManager.OneSignalGenericCallback oneSignalGenericCallback) {
        DraggableRelativeLayout draggableRelativeLayout = this.draggableRelativeLayout;
        if (draggableRelativeLayout == null) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "No host presenter to trigger dismiss animation, counting as dismissed already", new Throwable());
            this.dereferenceViews();
            if (oneSignalGenericCallback != null) {
                oneSignalGenericCallback.onComplete();
            }
            return;
        }
        draggableRelativeLayout.dismiss();
        this.finishAfterDelay(oneSignalGenericCallback);
    }

    @NonNull
    public WebViewManager.Position getDisplayPosition() {
        return this.displayLocation;
    }

    public boolean isDragging() {
        return this.isDragging;
    }

    public void removeAllViews() {
        OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "InAppMessageView removing views");
        Object object = this.scheduleDismissRunnable;
        if (object != null) {
            this.handler.removeCallbacks(object);
            this.scheduleDismissRunnable = null;
        }
        if ((object = this.draggableRelativeLayout) != null) {
            object.removeAllViews();
        }
        if ((object = this.popupWindow) != null) {
            object.dismiss();
        }
        this.dereferenceViews();
    }

    public void setMessageController(InAppMessageViewListener inAppMessageViewListener) {
        this.messageController = inAppMessageViewListener;
    }

    public void setWebView(WebView webView) {
        this.webView = webView;
        webView.setBackgroundColor(0);
    }

    public void showInAppMessageView(Activity object) {
        this.currentActivity = object;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.pageHeight);
        layoutParams.addRule(13);
        object = this.hasBackground ? this.createParentRelativeLayoutParams() : null;
        WebViewManager.Position position = this.displayLocation;
        this.showDraggableView(position, layoutParams, (RelativeLayout.LayoutParams)object, this.createDraggableLayoutParams(this.pageHeight, position, this.disableDragDismiss));
    }

    public void showView(Activity activity) {
        this.delayShowUntilAvailable(activity);
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("InAppMessageView{currentActivity=");
        stringBuilder.append((Object)this.currentActivity);
        stringBuilder.append(", pageWidth=");
        stringBuilder.append(this.pageWidth);
        stringBuilder.append(", pageHeight=");
        stringBuilder.append(this.pageHeight);
        stringBuilder.append(", displayDuration=");
        stringBuilder.append(this.displayDuration);
        stringBuilder.append(", hasBackground=");
        stringBuilder.append(this.hasBackground);
        stringBuilder.append(", shouldDismissWhenActive=");
        stringBuilder.append(this.shouldDismissWhenActive);
        stringBuilder.append(", isDragging=");
        stringBuilder.append(this.isDragging);
        stringBuilder.append(", disableDragDismiss=");
        stringBuilder.append(this.disableDragDismiss);
        stringBuilder.append(", displayLocation=");
        stringBuilder.append((Object)this.displayLocation);
        stringBuilder.append(", webView=");
        stringBuilder.append((Object)this.webView);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void updateHeight(int n) {
        this.pageHeight = n;
        OSUtils.runOnMainUIThread(new Runnable(this, n){
            public final InAppMessageView this$0;
            public final int val$pageHeight;
            {
                this.this$0 = inAppMessageView;
                this.val$pageHeight = n;
            }

            public void run() {
                if (this.this$0.webView == null) {
                    OneSignal.onesignalLog(OneSignal.LOG_LEVEL.WARN, "WebView height update skipped, new height will be used once it is displayed.");
                    return;
                }
                Object object = this.this$0.webView.getLayoutParams();
                if (object == null) {
                    OneSignal.onesignalLog(OneSignal.LOG_LEVEL.WARN, "WebView height update skipped because of null layoutParams, new height will be used once it is displayed.");
                    return;
                }
                object.height = this.val$pageHeight;
                this.this$0.webView.setLayoutParams(object);
                if (this.this$0.draggableRelativeLayout != null) {
                    DraggableRelativeLayout draggableRelativeLayout = this.this$0.draggableRelativeLayout;
                    object = this.this$0;
                    draggableRelativeLayout.setParams(((InAppMessageView)object).createDraggableLayoutParams(this.val$pageHeight, ((InAppMessageView)object).displayLocation, this.this$0.disableDragDismiss));
                }
            }
        });
    }

    public static interface InAppMessageViewListener {
        public void onMessageWasDismissed();

        public void onMessageWasShown();

        public void onMessageWillDismiss();
    }
}

