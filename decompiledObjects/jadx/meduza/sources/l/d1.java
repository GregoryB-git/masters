package l;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import io.meduza.meduza.R;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9311a;

    /* renamed from: b, reason: collision with root package name */
    public final View f9312b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f9313c;

    /* renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f9314d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f9315e;
    public final int[] f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f9316g;

    public d1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f9314d = layoutParams;
        this.f9315e = new Rect();
        this.f = new int[2];
        this.f9316g = new int[2];
        this.f9311a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f9312b = inflate;
        this.f9313c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(d1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131951620;
        layoutParams.flags = 24;
    }
}
