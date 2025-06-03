package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import y.a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final CheckedTextView f9346a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f9347b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f9348c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9349d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9350e = false;
    public boolean f;

    public h(CheckedTextView checkedTextView) {
        this.f9346a = checkedTextView;
    }

    public final void a() {
        Drawable checkMarkDrawable = this.f9346a.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f9349d || this.f9350e) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f9349d) {
                    a.C0261a.h(mutate, this.f9347b);
                }
                if (this.f9350e) {
                    a.C0261a.i(mutate, this.f9348c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f9346a.getDrawableState());
                }
                this.f9346a.setCheckMarkDrawable(mutate);
            }
        }
    }
}
