package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
public final class g extends CheckedTextView implements j0.j {

    /* renamed from: a, reason: collision with root package name */
    public final h f9342a;

    /* renamed from: b, reason: collision with root package name */
    public final d f9343b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f9344c;

    /* renamed from: d, reason: collision with root package name */
    public m f9345d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083 A[Catch: all -> 0x00ad, TryCatch #1 {all -> 0x00ad, blocks: (B:3:0x0047, B:5:0x004e, B:8:0x0054, B:10:0x0063, B:12:0x0069, B:14:0x006f, B:15:0x007c, B:17:0x0083, B:18:0x008c, B:20:0x0093), top: B:2:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093 A[Catch: all -> 0x00ad, TRY_LEAVE, TryCatch #1 {all -> 0x00ad, blocks: (B:3:0x0047, B:5:0x004e, B:8:0x0054, B:10:0x0063, B:12:0x0069, B:14:0x006f, B:15:0x007c, B:17:0x0083, B:18:0x008c, B:20:0x0093), top: B:2:0x0047 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            l.w0.a(r9)
            r0 = 2130968663(0x7f040057, float:1.7545986E38)
            r8.<init>(r9, r10, r0)
            android.content.Context r9 = r8.getContext()
            l.u0.a(r8, r9)
            l.b0 r9 = new l.b0
            r9.<init>(r8)
            r8.f9344c = r9
            r9.f(r10, r0)
            r9.b()
            l.d r9 = new l.d
            r9.<init>(r8)
            r8.f9343b = r9
            r9.d(r10, r0)
            l.h r9 = new l.h
            r9.<init>(r8)
            r8.f9342a = r9
            android.content.Context r1 = r8.getContext()
            int[] r4 = b.a0.f1583y
            l.z0 r1 = l.z0.m(r1, r10, r4, r0)
            android.content.Context r3 = r8.getContext()
            android.content.res.TypedArray r6 = r1.f9519b
            r7 = 2130968663(0x7f040057, float:1.7545986E38)
            r2 = r8
            r5 = r10
            e0.d0.g(r2, r3, r4, r5, r6, r7)
            r2 = 1
            boolean r3 = r1.l(r2)     // Catch: java.lang.Throwable -> Lad
            r4 = 0
            if (r3 == 0) goto L60
            int r3 = r1.i(r2, r4)     // Catch: java.lang.Throwable -> Lad
            if (r3 == 0) goto L60
            android.content.Context r5 = r8.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L60 java.lang.Throwable -> Lad
            android.graphics.drawable.Drawable r3 = x6.b.X(r5, r3)     // Catch: android.content.res.Resources.NotFoundException -> L60 java.lang.Throwable -> Lad
            r8.setCheckMarkDrawable(r3)     // Catch: android.content.res.Resources.NotFoundException -> L60 java.lang.Throwable -> Lad
            goto L61
        L60:
            r2 = r4
        L61:
            if (r2 != 0) goto L7c
            boolean r2 = r1.l(r4)     // Catch: java.lang.Throwable -> Lad
            if (r2 == 0) goto L7c
            int r2 = r1.i(r4, r4)     // Catch: java.lang.Throwable -> Lad
            if (r2 == 0) goto L7c
            android.widget.CheckedTextView r3 = r9.f9346a     // Catch: java.lang.Throwable -> Lad
            android.content.Context r4 = r3.getContext()     // Catch: java.lang.Throwable -> Lad
            android.graphics.drawable.Drawable r2 = x6.b.X(r4, r2)     // Catch: java.lang.Throwable -> Lad
            r3.setCheckMarkDrawable(r2)     // Catch: java.lang.Throwable -> Lad
        L7c:
            r2 = 2
            boolean r3 = r1.l(r2)     // Catch: java.lang.Throwable -> Lad
            if (r3 == 0) goto L8c
            android.widget.CheckedTextView r3 = r9.f9346a     // Catch: java.lang.Throwable -> Lad
            android.content.res.ColorStateList r2 = r1.b(r2)     // Catch: java.lang.Throwable -> Lad
            r3.setCheckMarkTintList(r2)     // Catch: java.lang.Throwable -> Lad
        L8c:
            r2 = 3
            boolean r3 = r1.l(r2)     // Catch: java.lang.Throwable -> Lad
            if (r3 == 0) goto La2
            android.widget.CheckedTextView r9 = r9.f9346a     // Catch: java.lang.Throwable -> Lad
            r3 = -1
            int r2 = r1.h(r2, r3)     // Catch: java.lang.Throwable -> Lad
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = l.i0.b(r2, r3)     // Catch: java.lang.Throwable -> Lad
            r9.setCheckMarkTintMode(r2)     // Catch: java.lang.Throwable -> Lad
        La2:
            r1.n()
            l.m r9 = r8.getEmojiTextViewHelper()
            r9.a(r10, r0)
            return
        Lad:
            r9 = move-exception
            r1.n()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.g.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private m getEmojiTextViewHelper() {
        if (this.f9345d == null) {
            this.f9345d = new m(this);
        }
        return this.f9345d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        b0 b0Var = this.f9344c;
        if (b0Var != null) {
            b0Var.b();
        }
        d dVar = this.f9343b;
        if (dVar != null) {
            dVar.a();
        }
        h hVar = this.f9342a;
        if (hVar != null) {
            hVar.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return j0.h.e(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f9343b;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f9343b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        h hVar = this.f9342a;
        if (hVar != null) {
            return hVar.f9347b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        h hVar = this.f9342a;
        if (hVar != null) {
            return hVar.f9348c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9344c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9344c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        b.a0.y(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f9343b;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        d dVar = this.f9343b;
        if (dVar != null) {
            dVar.f(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(x6.b.X(getContext(), i10));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        h hVar = this.f9342a;
        if (hVar != null) {
            if (hVar.f) {
                hVar.f = false;
            } else {
                hVar.f = true;
                hVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f9344c;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f9344c;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j0.h.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f9343b;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f9343b;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        h hVar = this.f9342a;
        if (hVar != null) {
            hVar.f9347b = colorStateList;
            hVar.f9349d = true;
            hVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        h hVar = this.f9342a;
        if (hVar != null) {
            hVar.f9348c = mode;
            hVar.f9350e = true;
            hVar.a();
        }
    }

    @Override // j0.j
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f9344c.l(colorStateList);
        this.f9344c.b();
    }

    @Override // j0.j
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f9344c.m(mode);
        this.f9344c.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b0 b0Var = this.f9344c;
        if (b0Var != null) {
            b0Var.g(context, i10);
        }
    }
}
