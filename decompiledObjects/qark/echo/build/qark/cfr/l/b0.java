/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.os.IBinder
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.Window
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import e.c;
import e.e;
import e.f;
import e.h;

public class b0 {
    public final Context a;
    public final View b;
    public final TextView c;
    public final WindowManager.LayoutParams d;
    public final Rect e;
    public final int[] f;
    public final int[] g;

    public b0(Context context) {
        View view;
        WindowManager.LayoutParams layoutParams;
        this.d = layoutParams = new WindowManager.LayoutParams();
        this.e = new Rect();
        this.f = new int[2];
        this.g = new int[2];
        this.a = context;
        this.b = view = LayoutInflater.from((Context)context).inflate(f.m, null);
        this.c = (TextView)view.findViewById(e.m);
        layoutParams.setTitle((CharSequence)this.getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = h.a;
        layoutParams.flags = 24;
    }

    public static View b(View view) {
        View view2 = view.getRootView();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof WindowManager.LayoutParams && ((WindowManager.LayoutParams)layoutParams).type == 2) {
            return view2;
        }
        view = view.getContext();
        while (view instanceof ContextWrapper) {
            if (view instanceof Activity) {
                return ((Activity)view).getWindow().getDecorView();
            }
            view = ((ContextWrapper)view).getBaseContext();
        }
        return view2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(View arrn, int n8, int n9, boolean bl, WindowManager.LayoutParams layoutParams) {
        int n10;
        layoutParams.token = arrn.getApplicationWindowToken();
        int n11 = this.a.getResources().getDimensionPixelOffset(c.h);
        if (arrn.getWidth() < n11) {
            n8 = arrn.getWidth() / 2;
        }
        if (arrn.getHeight() >= n11) {
            n10 = this.a.getResources().getDimensionPixelOffset(c.g);
            n11 = n9 + n10;
            n10 = n9 - n10;
            n9 = n11;
            n11 = n10;
        } else {
            n9 = arrn.getHeight();
            n11 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.a.getResources();
        n10 = bl ? c.j : c.i;
        int n12 = resources.getDimensionPixelOffset(n10);
        resources = b0.b((View)arrn);
        if (resources == null) {
            Log.e((String)"TooltipPopup", (String)"Cannot find app view");
            return;
        }
        resources.getWindowVisibleDisplayFrame(this.e);
        DisplayMetrics displayMetrics = this.e;
        if (displayMetrics.left < 0 && displayMetrics.top < 0) {
            displayMetrics = this.a.getResources();
            n10 = displayMetrics.getIdentifier("status_bar_height", "dimen", "android");
            n10 = n10 != 0 ? displayMetrics.getDimensionPixelSize(n10) : 0;
            displayMetrics = displayMetrics.getDisplayMetrics();
            this.e.set(0, n10, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        resources.getLocationOnScreen(this.g);
        arrn.getLocationOnScreen(this.f);
        arrn = this.f;
        n10 = arrn[0];
        displayMetrics = this.g;
        arrn[0] = n10 -= displayMetrics[0];
        arrn[1] = arrn[1] - displayMetrics[1];
        layoutParams.x = n10 + n8 - resources.getWidth() / 2;
        n8 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
        this.b.measure(n8, n8);
        n8 = this.b.getMeasuredHeight();
        n10 = this.f[1];
        n11 = n11 + n10 - n12 - n8;
        n9 = n10 + n9 + n12;
        if (bl ? n11 >= 0 : n8 + n9 > this.e.height()) {
            layoutParams.y = n11;
            return;
        }
        layoutParams.y = n9;
    }

    public void c() {
        if (!this.d()) {
            return;
        }
        ((WindowManager)this.a.getSystemService("window")).removeView(this.b);
    }

    public boolean d() {
        if (this.b.getParent() != null) {
            return true;
        }
        return false;
    }

    public void e(View view, int n8, int n9, boolean bl, CharSequence charSequence) {
        if (this.d()) {
            this.c();
        }
        this.c.setText(charSequence);
        this.a(view, n8, n9, bl, this.d);
        ((WindowManager)this.a.getSystemService("window")).addView(this.b, (ViewGroup.LayoutParams)this.d);
    }
}

