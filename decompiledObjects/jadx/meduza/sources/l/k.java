package l;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import e0.c;
import io.meduza.meduza.R;
import l.a0;

/* loaded from: classes.dex */
public final class k extends EditText implements e0.v, j0.j {

    /* renamed from: a, reason: collision with root package name */
    public final d f9383a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f9384b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f9385c;

    /* renamed from: d, reason: collision with root package name */
    public final j0.i f9386d;

    /* renamed from: e, reason: collision with root package name */
    public final l f9387e;
    public a f;

    public class a {
        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        w0.a(context);
        u0.a(this, getContext());
        d dVar = new d(this);
        this.f9383a = dVar;
        dVar.d(attributeSet, R.attr.editTextStyle);
        b0 b0Var = new b0(this);
        this.f9384b = b0Var;
        b0Var.f(attributeSet, R.attr.editTextStyle);
        b0Var.b();
        this.f9385c = new a0(this);
        this.f9386d = new j0.i();
        l lVar = new l(this);
        this.f9387e = lVar;
        lVar.c(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener b10 = lVar.b(keyListener);
            if (b10 == keyListener) {
                return;
            }
            super.setKeyListener(b10);
            setRawInputType(inputType);
            setFocusable(isFocusable);
            setClickable(isClickable);
            setLongClickable(isLongClickable);
        }
    }

    private a getSuperCaller() {
        if (this.f == null) {
            this.f = new a();
        }
        return this.f;
    }

    @Override // e0.v
    public final e0.c a(e0.c cVar) {
        return this.f9386d.a(this, cVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f9383a;
        if (dVar != null) {
            dVar.a();
        }
        b0 b0Var = this.f9384b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return j0.h.e(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f9383a;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f9383a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9384b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9384b.e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f9385c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = a0Var.f9261b;
        return textClassifier == null ? a0.a.a(a0Var.f9260a) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i10;
        String[] d10;
        InputConnection cVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f9384b.getClass();
        b0.h(this, onCreateInputConnection, editorInfo);
        b.a0.y(this, editorInfo, onCreateInputConnection);
        if (onCreateInputConnection != null && (i10 = Build.VERSION.SDK_INT) <= 30 && (d10 = e0.d0.d(this)) != null) {
            i0.a.b(editorInfo, d10);
            defpackage.d dVar = new defpackage.d(this, 1);
            if (i10 >= 25) {
                cVar = new i0.b(onCreateInputConnection, dVar);
            } else if (i0.a.a(editorInfo).length != 0) {
                cVar = new i0.c(onCreateInputConnection, dVar);
            }
            onCreateInputConnection = cVar;
        }
        return this.f9387e.d(onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 < 31 && i10 >= 24 && dragEvent.getLocalState() == null && e0.d0.d(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z10 = v.a(dragEvent, this, activity);
            }
        }
        if (z10) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 && e0.d0.d(this) != null && (i10 == 16908322 || i10 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                c.b aVar = i11 >= 31 ? new c.a(primaryClip, 1) : new c.C0066c(primaryClip, 1);
                aVar.b(i10 != 16908322 ? 1 : 0);
                e0.d0.f(this, aVar.build());
            }
            r1 = 1;
        }
        if (r1 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f9383a;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        d dVar = this.f9383a;
        if (dVar != null) {
            dVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f9384b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f9384b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j0.h.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f9387e.g(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f9387e.b(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f9383a;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f9383a;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    @Override // j0.j
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f9384b.l(colorStateList);
        this.f9384b.b();
    }

    @Override // j0.j
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f9384b.m(mode);
        this.f9384b.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b0 b0Var = this.f9384b;
        if (b0Var != null) {
            b0Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f9385c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            a0Var.f9261b = textClassifier;
        }
    }
}
