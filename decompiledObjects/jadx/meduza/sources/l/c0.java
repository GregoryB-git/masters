package l;

import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class c0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextView f9285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Typeface f9286b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9287c;

    public c0(TextView textView, Typeface typeface, int i10) {
        this.f9285a = textView;
        this.f9286b = typeface;
        this.f9287c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9285a.setTypeface(this.f9286b, this.f9287c);
    }
}
