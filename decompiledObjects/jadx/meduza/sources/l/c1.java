package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import e0.j0;
import io.meduza.meduza.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: s, reason: collision with root package name */
    public static c1 f9288s;
    public static c1 t;

    /* renamed from: a, reason: collision with root package name */
    public final View f9289a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f9290b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9291c;

    /* renamed from: d, reason: collision with root package name */
    public final b.k f9292d;

    /* renamed from: e, reason: collision with root package name */
    public final b.m f9293e;
    public int f;

    /* renamed from: o, reason: collision with root package name */
    public int f9294o;

    /* renamed from: p, reason: collision with root package name */
    public d1 f9295p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9296q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9297r;

    public c1(View view, CharSequence charSequence) {
        int i10 = 2;
        this.f9292d = new b.k(this, i10);
        this.f9293e = new b.m(this, i10);
        this.f9289a = view;
        this.f9290b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = e0.j0.f3800a;
        this.f9291c = Build.VERSION.SDK_INT >= 28 ? j0.b.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f9297r = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(c1 c1Var) {
        c1 c1Var2 = f9288s;
        if (c1Var2 != null) {
            c1Var2.f9289a.removeCallbacks(c1Var2.f9292d);
        }
        f9288s = c1Var;
        if (c1Var != null) {
            c1Var.f9289a.postDelayed(c1Var.f9292d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        if (t == this) {
            t = null;
            d1 d1Var = this.f9295p;
            if (d1Var != null) {
                if (d1Var.f9312b.getParent() != null) {
                    ((WindowManager) d1Var.f9311a.getSystemService("window")).removeView(d1Var.f9312b);
                }
                this.f9295p = null;
                this.f9297r = true;
                this.f9289a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f9288s == this) {
            b(null);
        }
        this.f9289a.removeCallbacks(this.f9293e);
    }

    public final void c(boolean z10) {
        int height;
        int i10;
        long longPressTimeout;
        View view = this.f9289a;
        WeakHashMap<View, e0.o0> weakHashMap = e0.d0.f3766a;
        if (view.isAttachedToWindow()) {
            b(null);
            c1 c1Var = t;
            if (c1Var != null) {
                c1Var.a();
            }
            t = this;
            this.f9296q = z10;
            d1 d1Var = new d1(this.f9289a.getContext());
            this.f9295p = d1Var;
            View view2 = this.f9289a;
            int i11 = this.f;
            int i12 = this.f9294o;
            boolean z11 = this.f9296q;
            CharSequence charSequence = this.f9290b;
            if (d1Var.f9312b.getParent() != null) {
                if (d1Var.f9312b.getParent() != null) {
                    ((WindowManager) d1Var.f9311a.getSystemService("window")).removeView(d1Var.f9312b);
                }
            }
            d1Var.f9313c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = d1Var.f9314d;
            layoutParams.token = view2.getApplicationWindowToken();
            int dimensionPixelOffset = d1Var.f9311a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view2.getWidth() < dimensionPixelOffset) {
                i11 = view2.getWidth() / 2;
            }
            if (view2.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = d1Var.f9311a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i12 + dimensionPixelOffset2;
                i10 = i12 - dimensionPixelOffset2;
            } else {
                height = view2.getHeight();
                i10 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = d1Var.f9311a.getResources().getDimensionPixelOffset(z11 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view2.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view2.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(d1Var.f9315e);
                Rect rect = d1Var.f9315e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = d1Var.f9311a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    d1Var.f9315e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(d1Var.f9316g);
                view2.getLocationOnScreen(d1Var.f);
                int[] iArr = d1Var.f;
                int i13 = iArr[0];
                int[] iArr2 = d1Var.f9316g;
                int i14 = i13 - iArr2[0];
                iArr[0] = i14;
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (i14 + i11) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                d1Var.f9312b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = d1Var.f9312b.getMeasuredHeight();
                int i15 = d1Var.f[1];
                int i16 = ((i10 + i15) - dimensionPixelOffset3) - measuredHeight;
                int i17 = i15 + height + dimensionPixelOffset3;
                if (!z11 ? measuredHeight + i17 <= d1Var.f9315e.height() : i16 < 0) {
                    layoutParams.y = i16;
                } else {
                    layoutParams.y = i17;
                }
            }
            ((WindowManager) d1Var.f9311a.getSystemService("window")).addView(d1Var.f9312b, d1Var.f9314d);
            this.f9289a.addOnAttachStateChangeListener(this);
            if (this.f9296q) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((this.f9289a.getWindowSystemUiVisibility() & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.f9289a.removeCallbacks(this.f9293e);
            this.f9289a.postDelayed(this.f9293e, longPressTimeout);
        }
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f9295p != null && this.f9296q) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f9289a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action != 7) {
            if (action == 10) {
                this.f9297r = true;
                a();
            }
        } else if (this.f9289a.isEnabled() && this.f9295p == null) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (this.f9297r || Math.abs(x10 - this.f) > this.f9291c || Math.abs(y10 - this.f9294o) > this.f9291c) {
                this.f = x10;
                this.f9294o = y10;
                this.f9297r = false;
            } else {
                z10 = false;
            }
            if (z10) {
                b(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f = view.getWidth() / 2;
        this.f9294o = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
