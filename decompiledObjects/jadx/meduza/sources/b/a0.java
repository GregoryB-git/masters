package b;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.WebView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.Registrar;
import d2.h0;
import d2.k0;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.meduza.meduza.R;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l.g1;
import nc.c2;
import nc.d2;
import nc.e2;
import nc.g2;
import nc.j1;
import nc.m0;
import nc.v0;
import nc.x0;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import t1.c;
import v5.e0;

/* loaded from: classes.dex */
public class a0 implements Continuation, h8.a, k0, SuccessContinuation, q9.d, d8.e, s8.c, c.InterfaceC0226c {
    public static final h0 R;
    public static final h0 S;
    public static final h0 Y;
    public static final h0 Z;

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f1559a = new String[0];

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f1561b = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f1563c = {"ad_impression"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f1565d = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", Constants.FIREBASE_APPLICATION_EXCEPTION, "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f1567e = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};
    public static final int[] f = {R.attr.background, R.attr.backgroundSplit, R.attr.backgroundStacked, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.customNavigationLayout, R.attr.displayOptions, R.attr.divider, R.attr.elevation, R.attr.height, R.attr.hideOnContentScroll, R.attr.homeAsUpIndicator, R.attr.homeLayout, R.attr.icon, R.attr.indeterminateProgressStyle, R.attr.itemPadding, R.attr.logo, R.attr.navigationMode, R.attr.popupTheme, R.attr.progressBarPadding, R.attr.progressBarStyle, R.attr.subtitle, R.attr.subtitleTextStyle, R.attr.title, R.attr.titleTextStyle};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f1574o = {android.R.attr.layout_gravity};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f1575p = {android.R.attr.minWidth};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f1576q = {R.attr.background, R.attr.backgroundSplit, R.attr.closeItemLayout, R.attr.height, R.attr.subtitleTextStyle, R.attr.titleTextStyle};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f1577r = {android.R.attr.layout, R.attr.buttonIconDimen, R.attr.buttonPanelSideLayout, R.attr.listItemLayout, R.attr.listLayout, R.attr.multiChoiceItemLayout, R.attr.showTitle, R.attr.singleChoiceItemLayout};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f1578s = {android.R.attr.src, R.attr.srcCompat, R.attr.tint, R.attr.tintMode};
    public static final int[] t = {android.R.attr.thumb, R.attr.tickMark, R.attr.tickMarkTint, R.attr.tickMarkTintMode};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f1579u = {android.R.attr.textAppearance, android.R.attr.drawableTop, android.R.attr.drawableBottom, android.R.attr.drawableLeft, android.R.attr.drawableRight, android.R.attr.drawableStart, android.R.attr.drawableEnd};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f1580v = {android.R.attr.textAppearance, R.attr.autoSizeMaxTextSize, R.attr.autoSizeMinTextSize, R.attr.autoSizePresetSizes, R.attr.autoSizeStepGranularity, R.attr.autoSizeTextType, R.attr.drawableBottomCompat, R.attr.drawableEndCompat, R.attr.drawableLeftCompat, R.attr.drawableRightCompat, R.attr.drawableStartCompat, R.attr.drawableTint, R.attr.drawableTintMode, R.attr.drawableTopCompat, R.attr.emojiCompatEnabled, R.attr.firstBaselineToTopHeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.lastBaselineToBottomHeight, R.attr.lineHeight, R.attr.textAllCaps, R.attr.textLocale};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f1581w = {android.R.attr.windowIsFloating, android.R.attr.windowAnimationStyle, R.attr.actionBarDivider, R.attr.actionBarItemBackground, R.attr.actionBarPopupTheme, R.attr.actionBarSize, R.attr.actionBarSplitStyle, R.attr.actionBarStyle, R.attr.actionBarTabBarStyle, R.attr.actionBarTabStyle, R.attr.actionBarTabTextStyle, R.attr.actionBarTheme, R.attr.actionBarWidgetTheme, R.attr.actionButtonStyle, R.attr.actionDropDownStyle, R.attr.actionMenuTextAppearance, R.attr.actionMenuTextColor, R.attr.actionModeBackground, R.attr.actionModeCloseButtonStyle, R.attr.actionModeCloseContentDescription, R.attr.actionModeCloseDrawable, R.attr.actionModeCopyDrawable, R.attr.actionModeCutDrawable, R.attr.actionModeFindDrawable, R.attr.actionModePasteDrawable, R.attr.actionModePopupWindowStyle, R.attr.actionModeSelectAllDrawable, R.attr.actionModeShareDrawable, R.attr.actionModeSplitBackground, R.attr.actionModeStyle, R.attr.actionModeTheme, R.attr.actionModeWebSearchDrawable, R.attr.actionOverflowButtonStyle, R.attr.actionOverflowMenuStyle, R.attr.activityChooserViewStyle, R.attr.alertDialogButtonGroupStyle, R.attr.alertDialogCenterButtons, R.attr.alertDialogStyle, R.attr.alertDialogTheme, R.attr.autoCompleteTextViewStyle, R.attr.borderlessButtonStyle, R.attr.buttonBarButtonStyle, R.attr.buttonBarNegativeButtonStyle, R.attr.buttonBarNeutralButtonStyle, R.attr.buttonBarPositiveButtonStyle, R.attr.buttonBarStyle, R.attr.buttonStyle, R.attr.buttonStyleSmall, R.attr.checkboxStyle, R.attr.checkedTextViewStyle, R.attr.colorAccent, R.attr.colorBackgroundFloating, R.attr.colorButtonNormal, R.attr.colorControlActivated, R.attr.colorControlHighlight, R.attr.colorControlNormal, R.attr.colorError, R.attr.colorPrimary, R.attr.colorPrimaryDark, R.attr.colorSwitchThumbNormal, R.attr.controlBackground, R.attr.dialogCornerRadius, R.attr.dialogPreferredPadding, R.attr.dialogTheme, R.attr.dividerHorizontal, R.attr.dividerVertical, R.attr.dropDownListViewStyle, R.attr.dropdownListPreferredItemHeight, R.attr.editTextBackground, R.attr.editTextColor, R.attr.editTextStyle, R.attr.homeAsUpIndicator, R.attr.imageButtonStyle, R.attr.listChoiceBackgroundIndicator, R.attr.listChoiceIndicatorMultipleAnimated, R.attr.listChoiceIndicatorSingleAnimated, R.attr.listDividerAlertDialog, R.attr.listMenuViewStyle, R.attr.listPopupWindowStyle, R.attr.listPreferredItemHeight, R.attr.listPreferredItemHeightLarge, R.attr.listPreferredItemHeightSmall, R.attr.listPreferredItemPaddingEnd, R.attr.listPreferredItemPaddingLeft, R.attr.listPreferredItemPaddingRight, R.attr.listPreferredItemPaddingStart, R.attr.panelBackground, R.attr.panelMenuListTheme, R.attr.panelMenuListWidth, R.attr.popupMenuStyle, R.attr.popupWindowStyle, R.attr.radioButtonStyle, R.attr.ratingBarStyle, R.attr.ratingBarStyleIndicator, R.attr.ratingBarStyleSmall, R.attr.searchViewStyle, R.attr.seekBarStyle, R.attr.selectableItemBackground, R.attr.selectableItemBackgroundBorderless, R.attr.spinnerDropDownItemStyle, R.attr.spinnerStyle, R.attr.switchStyle, R.attr.textAppearanceLargePopupMenu, R.attr.textAppearanceListItem, R.attr.textAppearanceListItemSecondary, R.attr.textAppearanceListItemSmall, R.attr.textAppearancePopupMenuHeader, R.attr.textAppearanceSearchResultSubtitle, R.attr.textAppearanceSearchResultTitle, R.attr.textAppearanceSmallPopupMenu, R.attr.textColorAlertDialogListItem, R.attr.textColorSearchUrl, R.attr.toolbarNavigationButtonStyle, R.attr.toolbarStyle, R.attr.tooltipForegroundColor, R.attr.tooltipFrameBackground, R.attr.viewInflaterClass, R.attr.windowActionBar, R.attr.windowActionBarOverlay, R.attr.windowActionModeOverlay, R.attr.windowFixedHeightMajor, R.attr.windowFixedHeightMinor, R.attr.windowFixedWidthMajor, R.attr.windowFixedWidthMinor, R.attr.windowMinWidthMajor, R.attr.windowMinWidthMinor, R.attr.windowNoTitle};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f1582x = {R.attr.allowStacking};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f1583y = {android.R.attr.checkMark, R.attr.checkMarkCompat, R.attr.checkMarkTint, R.attr.checkMarkTintMode};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f1584z = {android.R.attr.button, R.attr.buttonCompat, R.attr.buttonTint, R.attr.buttonTintMode};
    public static final int[] A = {android.R.attr.gravity, android.R.attr.orientation, android.R.attr.baselineAligned, android.R.attr.baselineAlignedChildIndex, android.R.attr.weightSum, R.attr.divider, R.attr.dividerPadding, R.attr.measureWithLargestChild, R.attr.showDividers};
    public static final int[] B = {android.R.attr.dropDownHorizontalOffset, android.R.attr.dropDownVerticalOffset};
    public static final int[] C = {android.R.attr.enabled, android.R.attr.id, android.R.attr.visible, android.R.attr.menuCategory, android.R.attr.orderInCategory, android.R.attr.checkableBehavior};
    public static final int[] D = {android.R.attr.icon, android.R.attr.enabled, android.R.attr.id, android.R.attr.checked, android.R.attr.visible, android.R.attr.menuCategory, android.R.attr.orderInCategory, android.R.attr.title, android.R.attr.titleCondensed, android.R.attr.alphabeticShortcut, android.R.attr.numericShortcut, android.R.attr.checkable, android.R.attr.onClick, R.attr.actionLayout, R.attr.actionProviderClass, R.attr.actionViewClass, R.attr.alphabeticModifiers, R.attr.contentDescription, R.attr.iconTint, R.attr.iconTintMode, R.attr.numericModifiers, R.attr.showAsAction, R.attr.tooltipText};
    public static final int[] E = {android.R.attr.windowAnimationStyle, android.R.attr.itemTextAppearance, android.R.attr.horizontalDivider, android.R.attr.verticalDivider, android.R.attr.headerBackground, android.R.attr.itemBackground, android.R.attr.itemIconDisabledAlpha, R.attr.preserveIconSpacing, R.attr.subMenuArrow};
    public static final int[] F = {android.R.attr.popupBackground, android.R.attr.popupAnimationStyle, R.attr.overlapAnchor};
    public static final int[] G = {R.attr.paddingBottomNoButtons, R.attr.paddingTopNoTitle};
    public static final int[] H = {android.R.attr.focusable, android.R.attr.maxWidth, android.R.attr.inputType, android.R.attr.imeOptions, R.attr.closeIcon, R.attr.commitIcon, R.attr.defaultQueryHint, R.attr.goIcon, R.attr.iconifiedByDefault, R.attr.layout, R.attr.queryBackground, R.attr.queryHint, R.attr.searchHintIcon, R.attr.searchIcon, R.attr.submitBackground, R.attr.suggestionRowLayout, R.attr.voiceIcon};
    public static final int[] I = {android.R.attr.entries, android.R.attr.popupBackground, android.R.attr.prompt, android.R.attr.dropDownWidth, R.attr.popupTheme};
    public static final int[] J = {android.R.attr.textSize, android.R.attr.typeface, android.R.attr.textStyle, android.R.attr.textColor, android.R.attr.textColorHint, android.R.attr.textColorLink, android.R.attr.shadowColor, android.R.attr.shadowDx, android.R.attr.shadowDy, android.R.attr.shadowRadius, android.R.attr.fontFamily, android.R.attr.textFontWeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] K = {android.R.attr.gravity, android.R.attr.minHeight, R.attr.buttonGravity, R.attr.collapseContentDescription, R.attr.collapseIcon, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.logo, R.attr.logoDescription, R.attr.maxButtonHeight, R.attr.menu, R.attr.navigationContentDescription, R.attr.navigationIcon, R.attr.popupTheme, R.attr.subtitle, R.attr.subtitleTextAppearance, R.attr.subtitleTextColor, R.attr.title, R.attr.titleMargin, R.attr.titleMarginBottom, R.attr.titleMarginEnd, R.attr.titleMarginStart, R.attr.titleMarginTop, R.attr.titleMargins, R.attr.titleTextAppearance, R.attr.titleTextColor};
    public static final int[] L = {android.R.attr.theme, android.R.attr.focusable, R.attr.paddingEnd, R.attr.paddingStart, R.attr.theme};
    public static final int[] M = {android.R.attr.background, R.attr.backgroundTint, R.attr.backgroundTintMode};
    public static final int[] N = {android.R.attr.id, android.R.attr.layout, android.R.attr.inflatedId};
    public static final /* synthetic */ a0 O = new a0();
    public static final int[] P = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    public static final int[] Q = {android.R.attr.orientation, android.R.attr.clipToPadding, android.R.attr.descendantFocusability, R.attr.fastScrollEnabled, R.attr.fastScrollHorizontalThumbDrawable, R.attr.fastScrollHorizontalTrackDrawable, R.attr.fastScrollVerticalThumbDrawable, R.attr.fastScrollVerticalTrackDrawable, R.attr.layoutManager, R.attr.reverseLayout, R.attr.spanCount, R.attr.stackFromEnd};
    public static final int[] T = new int[0];
    public static final Object[] U = new Object[0];
    public static final a0 V = new a0();
    public static final int[] W = {R.attr.resize_mode};
    public static final h0 X = new h0("NO_DECISION", 9);

    /* renamed from: a0, reason: collision with root package name */
    public static final int[] f1560a0 = {android.R.attr.color, android.R.attr.alpha, android.R.attr.lStar, R.attr.alpha, R.attr.lStar};

    /* renamed from: b0, reason: collision with root package name */
    public static final int[] f1562b0 = {R.attr.fontProviderAuthority, R.attr.fontProviderCerts, R.attr.fontProviderFetchStrategy, R.attr.fontProviderFetchTimeout, R.attr.fontProviderPackage, R.attr.fontProviderQuery, R.attr.fontProviderSystemFontFamily};

    /* renamed from: c0, reason: collision with root package name */
    public static final int[] f1564c0 = {android.R.attr.font, android.R.attr.fontWeight, android.R.attr.fontStyle, android.R.attr.ttcIndex, android.R.attr.fontVariationSettings, R.attr.font, R.attr.fontStyle, R.attr.fontVariationSettings, R.attr.fontWeight, R.attr.ttcIndex};

    /* renamed from: d0, reason: collision with root package name */
    public static final int[] f1566d0 = {android.R.attr.startColor, android.R.attr.endColor, android.R.attr.type, android.R.attr.centerX, android.R.attr.centerY, android.R.attr.gradientRadius, android.R.attr.tileMode, android.R.attr.centerColor, android.R.attr.startX, android.R.attr.startY, android.R.attr.endX, android.R.attr.endY};

    /* renamed from: e0, reason: collision with root package name */
    public static final int[] f1568e0 = {android.R.attr.color, android.R.attr.offset};

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f1569f0 = {0, 0, 0, 1};

    /* renamed from: g0, reason: collision with root package name */
    public static final String[] f1570g0 = {"", "A", "B", "C"};

    /* renamed from: h0, reason: collision with root package name */
    public static final char[] f1571h0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: i0, reason: collision with root package name */
    public static final char[] f1572i0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: j0, reason: collision with root package name */
    public static final h0 f1573j0 = new h0("NO_OWNER", 9);

    static {
        int i10 = 9;
        R = new h0("NONE", i10);
        S = new h0("PENDING", i10);
        int i11 = 9;
        Y = new h0("UNDEFINED", i11);
        Z = new h0("REUSABLE_CLAIMED", i11);
    }

    public /* synthetic */ a0() {
    }

    public /* synthetic */ a0(int i10) {
    }

    public static long A(int i10, int i11, v5.u uVar) {
        uVar.G(i10);
        if (uVar.f15976c - uVar.f15975b < 5) {
            return -9223372036854775807L;
        }
        int f10 = uVar.f();
        if ((8388608 & f10) != 0 || ((2096896 & f10) >> 8) != i11) {
            return -9223372036854775807L;
        }
        if (((f10 & 32) != 0) && uVar.v() >= 7 && uVar.f15976c - uVar.f15975b >= 7) {
            if ((uVar.v() & 16) == 16) {
                uVar.d(new byte[6], 0, 6);
                return ((r1[3] & 255) << 1) | ((r1[0] & 255) << 25) | ((r1[1] & 255) << 17) | ((r1[2] & 255) << 9) | ((r1[4] & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }

    public static o5.f B(o5.f fVar, String[] strArr, Map map) {
        int i10 = 0;
        if (fVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (o5.f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                o5.f fVar2 = new o5.f();
                int length = strArr.length;
                while (i10 < length) {
                    fVar2.a((o5.f) map.get(strArr[i10]));
                    i10++;
                }
                return fVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                fVar.a((o5.f) map.get(strArr[0]));
                return fVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    fVar.a((o5.f) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return fVar;
    }

    /* JADX WARN: Finally extract failed */
    public static final void C(ub.e eVar, Object obj, dc.l lVar) {
        if (!(eVar instanceof sc.g)) {
            eVar.resumeWith(obj);
            return;
        }
        sc.g gVar = (sc.g) eVar;
        Throwable a10 = rb.e.a(obj);
        boolean z10 = false;
        Object vVar = a10 == null ? lVar != null ? new nc.v(obj, lVar) : obj : new nc.u(a10, false);
        nc.a0 a0Var = gVar.f14337d;
        gVar.getContext();
        if (a0Var.B0()) {
            gVar.f = vVar;
            gVar.f11542c = 1;
            gVar.f14337d.z0(gVar.getContext(), gVar);
            return;
        }
        x0 a11 = c2.a();
        if (a11.F0()) {
            gVar.f = vVar;
            gVar.f11542c = 1;
            a11.D0(gVar);
            return;
        }
        a11.E0(true);
        try {
            j1 j1Var = (j1) gVar.getContext().get(j1.b.f11509a);
            if (j1Var != null && !j1Var.isActive()) {
                CancellationException cancellationException = j1Var.getCancellationException();
                gVar.a(vVar, cancellationException);
                gVar.resumeWith(rb.f.a(cancellationException));
                z10 = true;
            }
            if (!z10) {
                ub.e<T> eVar2 = gVar.f14338e;
                Object obj2 = gVar.f14339o;
                ub.h context = eVar2.getContext();
                Object c10 = sc.w.c(context, obj2);
                g2<?> c11 = c10 != sc.w.f14370a ? nc.y.c(eVar2, context, c10) : null;
                try {
                    gVar.f14338e.resumeWith(obj);
                    rb.h hVar = rb.h.f13851a;
                    if (c11 == null || c11.e0()) {
                        sc.w.a(context, c10);
                    }
                } catch (Throwable th) {
                    if (c11 == null || c11.e0()) {
                        sc.w.a(context, c10);
                    }
                    throw th;
                }
            }
            while (a11.H0()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final int E(xc.v vVar, int i10) {
        int i11;
        ec.i.e(vVar, "<this>");
        int[] iArr = vVar.f;
        int i12 = i10 + 1;
        int i13 = 0;
        int length = vVar.f17295e.length;
        ec.i.e(iArr, "<this>");
        int i14 = length - 1;
        while (true) {
            if (i13 <= i14) {
                i11 = (i13 + i14) >>> 1;
                int i15 = iArr[i11];
                if (i15 >= i12) {
                    if (i15 <= i12) {
                        break;
                    }
                    i14 = i11 - 1;
                } else {
                    i13 = i11 + 1;
                }
            } else {
                i11 = (-i13) - 1;
                break;
            }
        }
        return i11 >= 0 ? i11 : ~i11;
    }

    public static final void F(View view, y yVar) {
        ec.i.e(view, "<this>");
        ec.i.e(yVar, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, yVar);
    }

    public static final void G(View view, b1.o oVar) {
        ec.i.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, oVar);
    }

    public static final void H(View view, s1.e eVar) {
        ec.i.e(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, eVar);
    }

    public static void K(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.D()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(r(status));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean L(c4.i r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a0.L(c4.i, boolean, boolean):boolean");
    }

    public static final Object M(long j10, dc.p pVar, ub.e eVar) {
        Object uVar;
        Object L2;
        if (j10 <= 0) {
            throw new d2("Timed out immediately", null);
        }
        e2 e2Var = new e2(j10, eVar);
        e2Var.invokeOnCompletion(new v0(m0.b(e2Var.f14365d.getContext()).q0(e2Var.f11491e, e2Var, e2Var.f11466c)));
        try {
            ec.v.a(2, pVar);
            uVar = pVar.invoke(e2Var, e2Var);
        } catch (Throwable th) {
            uVar = new nc.u(th, false);
        }
        vb.a aVar = vb.a.f16085a;
        if (uVar == aVar || (L2 = e2Var.L(uVar)) == p2.m0.f12899u) {
            return aVar;
        }
        if (L2 instanceof nc.u) {
            Throwable th2 = ((nc.u) L2).f11555a;
            if (((th2 instanceof d2) && ((d2) th2).f11486a == e2Var) ? false : true) {
                throw th2;
            }
            if (uVar instanceof nc.u) {
                throw ((nc.u) uVar).f11555a;
            }
        } else {
            uVar = p2.m0.f0(L2);
        }
        return uVar;
    }

    public static vc.d e() {
        return new vc.d(false);
    }

    public static final ExecutorService f(boolean z10) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new o2.b(z10));
        ec.i.d(newFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return newFixedThreadPool;
    }

    public static s.d h(nc.k0 k0Var) {
        s.b bVar = new s.b();
        s.d<T> dVar = new s.d<>(bVar);
        bVar.f13934b = dVar;
        bVar.f13933a = k1.a.class;
        try {
            k0Var.invokeOnCompletion(new k1.b(bVar, k0Var));
            bVar.f13933a = "Deferred.asListenableFuture";
        } catch (Exception e10) {
            dVar.f13938b.q(e10);
        }
        return dVar;
    }

    public static final a0.g i(nc.l lVar) {
        return new a0.g(lVar);
    }

    public static int j(int i10, int i11, int[] iArr) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public static int k(long[] jArr, int i10, long j10) {
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            long j11 = jArr[i13];
            if (j11 < j10) {
                i12 = i13 + 1;
            } else {
                if (j11 <= j10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static String l(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static String m(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        Object[] objArr = new Object[5];
        objArr[0] = f1570g0[i10];
        objArr[1] = Integer.valueOf(i11);
        objArr[2] = Integer.valueOf(i12);
        objArr[3] = Character.valueOf(z10 ? 'H' : 'L');
        objArr[4] = Integer.valueOf(i13);
        StringBuilder sb2 = new StringBuilder(e0.m("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static ArrayList n(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static String o(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i10 = 0; i10 < length; i10++) {
            char[] cArr = f1571h0;
            sb2.append(cArr[(bArr[i10] & 240) >>> 4]);
            sb2.append(cArr[bArr[i10] & 15]);
        }
        return sb2.toString();
    }

    public static final long p(long j10, mc.c cVar, mc.c cVar2) {
        ec.i.e(cVar, "sourceUnit");
        ec.i.e(cVar2, "targetUnit");
        return cVar2.f11162a.convert(j10, cVar.f11162a);
    }

    public static String q(s0.g gVar) {
        String str;
        StringBuilder sb2 = new StringBuilder(gVar.size());
        for (int i10 = 0; i10 < gVar.size(); i10++) {
            int a10 = gVar.a(i10);
            if (a10 == 34) {
                str = "\\\"";
            } else if (a10 == 39) {
                str = "\\'";
            } else if (a10 != 92) {
                switch (a10) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (a10 < 32 || a10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((a10 >>> 6) & 3) + 48));
                            sb2.append((char) (((a10 >>> 3) & 7) + 48));
                            a10 = (a10 & 7) + 48;
                        }
                        sb2.append((char) a10);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public static k6.b r(Status status) {
        return status.f2818c != null ? new k6.i(status) : new k6.b(status);
    }

    public static final x2.l s(x2.s sVar) {
        ec.i.e(sVar, "<this>");
        return new x2.l(sVar.f16830a, sVar.t);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class t(jc.c cVar) {
        ec.i.e(cVar, "<this>");
        Class<?> d10 = ((ec.c) cVar).d();
        if (!d10.isPrimitive()) {
            return d10;
        }
        String name = d10.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return d10;
    }

    public static final nc.l u(ub.e eVar) {
        nc.l lVar;
        boolean z10;
        boolean z11 = true;
        if (!(eVar instanceof sc.g)) {
            return new nc.l(1, eVar);
        }
        sc.g gVar = (sc.g) eVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sc.g.f14336p;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            if (obj == null) {
                sc.g.f14336p.set(gVar, Z);
                lVar = null;
                break;
            }
            if (obj instanceof nc.l) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = sc.g.f14336p;
                h0 h0Var = Z;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(gVar, obj, h0Var)) {
                        z10 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater2.get(gVar) != obj) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    lVar = (nc.l) obj;
                    break;
                }
            } else if (obj != Z && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (lVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = nc.l.f11513o;
            Object obj2 = atomicReferenceFieldUpdater3.get(lVar);
            if (!(obj2 instanceof nc.t) || ((nc.t) obj2).f11552d == null) {
                nc.l.f.set(lVar, 536870911);
                atomicReferenceFieldUpdater3.set(lVar, nc.b.f11470a);
            } else {
                lVar.p();
                z11 = false;
            }
            nc.l lVar2 = z11 ? lVar : null;
            if (lVar2 != null) {
                return lVar2;
            }
        }
        return new nc.l(2, eVar);
    }

    public static long v(byte b10, byte b11) {
        int i10 = b10 & 255;
        int i11 = i10 & 3;
        int i12 = 2;
        if (i11 == 0) {
            i12 = 1;
        } else if (i11 != 1 && i11 != 2) {
            i12 = b11 & 63;
        }
        int i13 = i10 >> 3;
        return i12 * (i13 >= 16 ? 2500 << r0 : i13 >= 12 ? 10000 << (r0 & 1) : (i13 & 3) == 3 ? 60000 : 10000 << r0);
    }

    public static String w(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }

    public static ThreadPoolExecutor x() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new w6.a("firebase-iid-executor"));
    }

    public static void y(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof g1) {
                editorInfo.hintText = ((g1) parent).a();
                return;
            }
        }
    }

    public static final Object z(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public void I(boolean z10) {
    }

    public void J(boolean z10) {
        throw null;
    }

    @Override // d2.k0
    public String[] a() {
        return f1559a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    @Override // s8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.StackTraceElement[] b(java.lang.StackTraceElement[] r15) {
        /*
            r14 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r15.length
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 0
            r3 = 1
            r4 = r2
            r5 = r4
            r6 = r3
        Ld:
            int r7 = r15.length
            if (r4 >= r7) goto L66
            r7 = r15[r4]
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L54
            int r9 = r8.intValue()
            int r10 = r4 - r9
            int r11 = r4 + r10
            int r12 = r15.length
            if (r11 <= r12) goto L26
            goto L37
        L26:
            r11 = r2
        L27:
            if (r11 >= r10) goto L3c
            int r12 = r9 + r11
            r12 = r15[r12]
            int r13 = r4 + r11
            r13 = r15[r13]
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L39
        L37:
            r9 = r2
            goto L3d
        L39:
            int r11 = r11 + 1
            goto L27
        L3c:
            r9 = r3
        L3d:
            if (r9 != 0) goto L40
            goto L54
        L40:
            int r8 = r8.intValue()
            int r8 = r4 - r8
            r9 = 10
            if (r6 >= r9) goto L50
            java.lang.System.arraycopy(r15, r4, r1, r5, r8)
            int r5 = r5 + r8
            int r6 = r6 + 1
        L50:
            int r8 = r8 + (-1)
            int r8 = r8 + r4
            goto L5c
        L54:
            r6 = r15[r4]
            r1[r5] = r6
            int r5 = r5 + 1
            r6 = r3
            r8 = r4
        L5c:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r7, r4)
            int r4 = r8 + 1
            goto Ld
        L66:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r1, r2, r0, r2, r5)
            int r1 = r15.length
            if (r5 >= r1) goto L6f
            return r0
        L6f:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a0.b(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    @Override // t1.c.InterfaceC0226c
    public t1.c c(c.b bVar) {
        return new u1.d(bVar.f14407a, bVar.f14408b, bVar.f14409c, bVar.f14410d, bVar.f14411e);
    }

    @Override // d2.k0
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // h8.a
    public void d(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // d8.e
    public Object g(d8.u uVar) {
        return Registrar.lambda$getComponents$1$Registrar(uVar);
    }

    @Override // d2.k0
    public ProxyControllerBoundaryInterface getProxyController() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // d2.k0
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // d2.k0
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // d2.k0
    public TracingControllerBoundaryInterface getTracingController() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // d2.k0
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i10 = i6.c.f7571h;
        if (bundle != null && bundle.containsKey("google.messenger")) {
            bundle = null;
        }
        return Tasks.forResult(bundle);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (!task.isSuccessful() && (task.getException() instanceof b8.l) && ((b8.l) task.getException()).f2106a.equals("ERROR_INTERNAL_SUCCESS_SIGN_OUT")) ? Tasks.forResult(null) : task;
    }
}
