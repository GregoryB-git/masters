/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.ActionMenuView;
import e.i;
import k.c;
import l.E;
import l.w;

public class ActionMenuItemView
extends w
implements h.a,
View.OnClickListener,
ActionMenuView.a {
    public int A;
    public int B;
    public int C;
    public e s;
    public CharSequence t;
    public Drawable u;
    public d.b v;
    public E w;
    public b x;
    public boolean y;
    public boolean z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
        Resources resources = context.getResources();
        this.y = this.g();
        context = context.obtainStyledAttributes(attributeSet, i.t, n8, 0);
        this.A = context.getDimensionPixelSize(i.u, 0);
        context.recycle();
        this.C = (int)(resources.getDisplayMetrics().density * 32.0f + 0.5f);
        this.setOnClickListener((View.OnClickListener)this);
        this.B = -1;
        this.setSaveEnabled(false);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public boolean b() {
        return this.f();
    }

    @Override
    public boolean c() {
        if (this.f() && this.s.getIcon() == null) {
            return true;
        }
        return false;
    }

    @Override
    public void d(e e8, int n8) {
        this.s = e8;
        this.setIcon(e8.getIcon());
        this.setTitle(e8.h(this));
        this.setId(e8.getItemId());
        n8 = e8.isVisible() ? 0 : 8;
        this.setVisibility(n8);
        this.setEnabled(e8.isEnabled());
        if (e8.hasSubMenu() && this.w == null) {
            this.w = new a();
        }
    }

    public boolean f() {
        return TextUtils.isEmpty((CharSequence)this.getText()) ^ true;
    }

    public final boolean g() {
        Configuration configuration = this.getContext().getResources().getConfiguration();
        int n8 = configuration.screenWidthDp;
        int n9 = configuration.screenHeightDp;
        if (n8 < 480 && (n8 < 640 || n9 < 480) && configuration.orientation != 2) {
            return false;
        }
        return true;
    }

    @Override
    public e getItemData() {
        return this.s;
    }

    /*
     * Exception decompiling
     */
    public final void h() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:219)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:619)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:45)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:679)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public void onClick(View object) {
        object = this.v;
        if (object != null) {
            object.a(this.s);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        TextView.super.onConfigurationChanged(configuration);
        this.y = this.g();
        this.h();
    }

    @Override
    public void onMeasure(int n8, int n9) {
        int n10;
        boolean bl = this.f();
        if (bl && (n10 = this.B) >= 0) {
            TextView.super.setPadding(n10, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        }
        super.onMeasure(n8, n9);
        n10 = View.MeasureSpec.getMode((int)n8);
        n8 = View.MeasureSpec.getSize((int)n8);
        int n11 = this.getMeasuredWidth();
        n8 = n10 == Integer.MIN_VALUE ? Math.min((int)n8, (int)this.A) : this.A;
        if (n10 != 1073741824 && this.A > 0 && n11 < n8) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int)n8, (int)1073741824), n9);
        }
        if (!bl && this.u != null) {
            TextView.super.setPadding((this.getMeasuredWidth() - this.u.getBounds().width()) / 2, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        TextView.super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        E e8;
        if (this.s.hasSubMenu() && (e8 = this.w) != null && e8.onTouch((View)this, motionEvent)) {
            return true;
        }
        return TextView.super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean bl) {
    }

    public void setChecked(boolean bl) {
    }

    public void setExpandedFormat(boolean bl) {
        if (this.z != bl) {
            this.z = bl;
            e e8 = this.s;
            if (e8 != null) {
                e8.a();
            }
        }
    }

    public void setIcon(Drawable drawable2) {
        this.u = drawable2;
        if (drawable2 != null) {
            float f8;
            int n8 = drawable2.getIntrinsicWidth();
            int n9 = drawable2.getIntrinsicHeight();
            int n10 = this.C;
            int n11 = n8;
            int n12 = n9;
            if (n8 > n10) {
                f8 = (float)n10 / (float)n8;
                n12 = (int)((float)n9 * f8);
                n11 = n10;
            }
            if (n12 > n10) {
                f8 = (float)n10 / (float)n12;
                n11 = (int)((float)n11 * f8);
            } else {
                n10 = n12;
            }
            drawable2.setBounds(0, 0, n11, n10);
        }
        this.setCompoundDrawables(drawable2, null, null, null);
        this.h();
    }

    public void setItemInvoker(d.b b8) {
        this.v = b8;
    }

    public void setPadding(int n8, int n9, int n10, int n11) {
        this.B = n8;
        TextView.super.setPadding(n8, n9, n10, n11);
    }

    public void setPopupCallback(b b8) {
        this.x = b8;
    }

    public void setTitle(CharSequence charSequence) {
        this.t = charSequence;
        this.h();
    }

    public class a
    extends E {
        public a() {
            super((View)ActionMenuItemView.this);
        }

        @Override
        public c b() {
            b b8 = ActionMenuItemView.this.x;
            if (b8 != null) {
                return b8.a();
            }
            return null;
        }

        @Override
        public boolean c() {
            boolean bl;
            Object object = ActionMenuItemView.this;
            d.b b8 = object.v;
            boolean bl2 = bl = false;
            if (b8 != null) {
                bl2 = bl;
                if (b8.a(object.s)) {
                    object = this.b();
                    bl2 = bl;
                    if (object != null) {
                        bl2 = bl;
                        if (object.i()) {
                            bl2 = true;
                        }
                    }
                }
            }
            return bl2;
        }
    }

    public static abstract class b {
        public abstract c a();
    }

}

