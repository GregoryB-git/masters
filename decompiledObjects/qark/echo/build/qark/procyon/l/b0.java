// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import android.view.ViewManager;
import android.view.WindowManager;
import android.util.DisplayMetrics;
import android.content.res.Resources;
import android.view.View$MeasureSpec;
import android.util.Log;
import e.c;
import android.view.ViewGroup$LayoutParams;
import android.app.Activity;
import android.content.ContextWrapper;
import e.h;
import e.e;
import android.view.ViewGroup;
import e.f;
import android.view.LayoutInflater;
import android.graphics.Rect;
import android.view.WindowManager$LayoutParams;
import android.widget.TextView;
import android.view.View;
import android.content.Context;

public class b0
{
    public final Context a;
    public final View b;
    public final TextView c;
    public final WindowManager$LayoutParams d;
    public final Rect e;
    public final int[] f;
    public final int[] g;
    
    public b0(final Context a) {
        final WindowManager$LayoutParams d = new WindowManager$LayoutParams();
        this.d = d;
        this.e = new Rect();
        this.f = new int[2];
        this.g = new int[2];
        this.a = a;
        final View inflate = LayoutInflater.from(a).inflate(e.f.m, (ViewGroup)null);
        this.b = inflate;
        this.c = (TextView)inflate.findViewById(e.e.m);
        d.setTitle((CharSequence)this.getClass().getSimpleName());
        d.packageName = a.getPackageName();
        d.type = 1002;
        d.width = -2;
        d.height = -2;
        d.format = -3;
        d.windowAnimations = h.a;
        d.flags = 24;
    }
    
    public static View b(final View view) {
        final View rootView = view.getRootView();
        final ViewGroup$LayoutParams layoutParams = rootView.getLayoutParams();
        if (layoutParams instanceof WindowManager$LayoutParams && ((WindowManager$LayoutParams)layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity)context).getWindow().getDecorView();
            }
        }
        return rootView;
    }
    
    public final void a(final View view, int n, int height, final boolean b, final WindowManager$LayoutParams windowManager$LayoutParams) {
        windowManager$LayoutParams.token = view.getApplicationWindowToken();
        final int dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(e.c.h);
        if (view.getWidth() < dimensionPixelOffset) {
            n = view.getWidth() / 2;
        }
        int n4;
        if (view.getHeight() >= dimensionPixelOffset) {
            final int dimensionPixelOffset2 = this.a.getResources().getDimensionPixelOffset(e.c.g);
            final int n2 = height + dimensionPixelOffset2;
            final int n3 = height - dimensionPixelOffset2;
            height = n2;
            n4 = n3;
        }
        else {
            height = view.getHeight();
            n4 = 0;
        }
        windowManager$LayoutParams.gravity = 49;
        final Resources resources = this.a.getResources();
        int n5;
        if (b) {
            n5 = e.c.j;
        }
        else {
            n5 = e.c.i;
        }
        final int dimensionPixelOffset3 = resources.getDimensionPixelOffset(n5);
        final View b2 = b(view);
        if (b2 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b2.getWindowVisibleDisplayFrame(this.e);
        final Rect e = this.e;
        if (e.left < 0 && e.top < 0) {
            final Resources resources2 = this.a.getResources();
            final int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize;
            if (identifier != 0) {
                dimensionPixelSize = resources2.getDimensionPixelSize(identifier);
            }
            else {
                dimensionPixelSize = 0;
            }
            final DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
            this.e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b2.getLocationOnScreen(this.g);
        view.getLocationOnScreen(this.f);
        final int[] f = this.f;
        final int n6 = f[0];
        final int[] g = this.g;
        final int n7 = n6 - g[0];
        f[0] = n7;
        f[1] -= g[1];
        windowManager$LayoutParams.x = n7 + n - b2.getWidth() / 2;
        n = View$MeasureSpec.makeMeasureSpec(0, 0);
        this.b.measure(n, n);
        n = this.b.getMeasuredHeight();
        final int n8 = this.f[1];
        final int y = n4 + n8 - dimensionPixelOffset3 - n;
        height = n8 + height + dimensionPixelOffset3;
        Label_0404: {
            if (b) {
                if (y < 0) {
                    break Label_0404;
                }
            }
            else if (n + height <= this.e.height()) {
                break Label_0404;
            }
            windowManager$LayoutParams.y = y;
            return;
        }
        windowManager$LayoutParams.y = height;
    }
    
    public void c() {
        if (!this.d()) {
            return;
        }
        ((ViewManager)this.a.getSystemService("window")).removeView(this.b);
    }
    
    public boolean d() {
        return this.b.getParent() != null;
    }
    
    public void e(final View view, final int n, final int n2, final boolean b, final CharSequence text) {
        if (this.d()) {
            this.c();
        }
        this.c.setText(text);
        this.a(view, n, n2, b, this.d);
        ((ViewManager)this.a.getSystemService("window")).addView(this.b, (ViewGroup$LayoutParams)this.d);
    }
}
