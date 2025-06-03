package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import e.AbstractC1232c;
import e.AbstractC1234e;
import e.AbstractC1235f;
import e.AbstractC1237h;

/* loaded from: classes.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16429a;

    /* renamed from: b, reason: collision with root package name */
    public final View f16430b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f16431c;

    /* renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f16432d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f16433e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f16434f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f16435g;

    public b0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f16432d = layoutParams;
        this.f16433e = new Rect();
        this.f16434f = new int[2];
        this.f16435g = new int[2];
        this.f16429a = context;
        View inflate = LayoutInflater.from(context).inflate(AbstractC1235f.f13451m, (ViewGroup) null);
        this.f16430b = inflate;
        this.f16431c = (TextView) inflate.findViewById(AbstractC1234e.f13425m);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = AbstractC1237h.f13464a;
        layoutParams.flags = 24;
    }

    public static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    public final void a(View view, int i7, int i8, boolean z7, WindowManager.LayoutParams layoutParams) {
        int height;
        int i9;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f16429a.getResources().getDimensionPixelOffset(AbstractC1232c.f13362h);
        if (view.getWidth() < dimensionPixelOffset) {
            i7 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f16429a.getResources().getDimensionPixelOffset(AbstractC1232c.f13361g);
            height = i8 + dimensionPixelOffset2;
            i9 = i8 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i9 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f16429a.getResources().getDimensionPixelOffset(z7 ? AbstractC1232c.f13364j : AbstractC1232c.f13363i);
        View b7 = b(view);
        if (b7 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b7.getWindowVisibleDisplayFrame(this.f16433e);
        Rect rect = this.f16433e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f16429a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f16433e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b7.getLocationOnScreen(this.f16435g);
        view.getLocationOnScreen(this.f16434f);
        int[] iArr = this.f16434f;
        int i10 = iArr[0];
        int[] iArr2 = this.f16435g;
        int i11 = i10 - iArr2[0];
        iArr[0] = i11;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i11 + i7) - (b7.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f16430b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f16430b.getMeasuredHeight();
        int i12 = this.f16434f[1];
        int i13 = ((i9 + i12) - dimensionPixelOffset3) - measuredHeight;
        int i14 = i12 + height + dimensionPixelOffset3;
        if (!z7 ? measuredHeight + i14 <= this.f16433e.height() : i13 < 0) {
            layoutParams.y = i13;
        } else {
            layoutParams.y = i14;
        }
    }

    public void c() {
        if (d()) {
            ((WindowManager) this.f16429a.getSystemService("window")).removeView(this.f16430b);
        }
    }

    public boolean d() {
        return this.f16430b.getParent() != null;
    }

    public void e(View view, int i7, int i8, boolean z7, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f16431c.setText(charSequence);
        a(view, i7, i8, z7, this.f16432d);
        ((WindowManager) this.f16429a.getSystemService("window")).addView(this.f16430b, this.f16432d);
    }
}
