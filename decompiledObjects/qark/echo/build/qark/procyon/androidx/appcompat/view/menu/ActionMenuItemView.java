// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.view.menu;

import k.c;
import android.view.MotionEvent;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.view.View;
import l.Z;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.content.res.TypedArray;
import android.content.res.Resources;
import e.i;
import android.util.AttributeSet;
import android.content.Context;
import l.E;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionMenuView;
import android.view.View$OnClickListener;
import l.w;

public class ActionMenuItemView extends w implements h.a, View$OnClickListener, ActionMenuView.a
{
    public int A;
    public int B;
    public int C;
    public androidx.appcompat.view.menu.e s;
    public CharSequence t;
    public Drawable u;
    public androidx.appcompat.view.menu.d.b v;
    public E w;
    public b x;
    public boolean y;
    public boolean z;
    
    public ActionMenuItemView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ActionMenuItemView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final Resources resources = context.getResources();
        this.y = this.g();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, i.t, n, 0);
        this.A = obtainStyledAttributes.getDimensionPixelSize(i.u, 0);
        obtainStyledAttributes.recycle();
        this.C = (int)(resources.getDisplayMetrics().density * 32.0f + 0.5f);
        ((View)this).setOnClickListener((View$OnClickListener)this);
        this.B = -1;
        ((View)this).setSaveEnabled(false);
    }
    
    @Override
    public boolean a() {
        return true;
    }
    
    public boolean b() {
        return this.f();
    }
    
    public boolean c() {
        return this.f() && this.s.getIcon() == null;
    }
    
    @Override
    public void d(final androidx.appcompat.view.menu.e s, int visibility) {
        this.s = s;
        this.setIcon(s.getIcon());
        this.setTitle(s.h(this));
        ((View)this).setId(s.getItemId());
        if (s.isVisible()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)this).setVisibility(visibility);
        ((View)this).setEnabled(s.isEnabled());
        if (s.hasSubMenu() && this.w == null) {
            this.w = new a();
        }
    }
    
    public boolean f() {
        return TextUtils.isEmpty(this.getText()) ^ true;
    }
    
    public final boolean g() {
        final Configuration configuration = ((View)this).getContext().getResources().getConfiguration();
        final int screenWidthDp = configuration.screenWidthDp;
        final int screenHeightDp = configuration.screenHeightDp;
        return screenWidthDp >= 480 || (screenWidthDp >= 640 && screenHeightDp >= 480) || configuration.orientation == 2;
    }
    
    @Override
    public androidx.appcompat.view.menu.e getItemData() {
        return this.s;
    }
    
    public final void h() {
        final boolean empty = TextUtils.isEmpty(this.t);
        boolean b2;
        final boolean b = b2 = true;
        Label_0052: {
            if (this.u != null) {
                if (this.s.A()) {
                    b2 = b;
                    if (this.y) {
                        break Label_0052;
                    }
                    if (this.z) {
                        b2 = b;
                        break Label_0052;
                    }
                }
                b2 = false;
            }
        }
        final boolean b3 = (empty ^ true) & b2;
        final CharSequence charSequence = null;
        CharSequence t;
        if (b3) {
            t = this.t;
        }
        else {
            t = null;
        }
        this.setText(t);
        CharSequence contentDescription;
        if (TextUtils.isEmpty(contentDescription = this.s.getContentDescription())) {
            if (b3) {
                contentDescription = null;
            }
            else {
                contentDescription = this.s.getTitle();
            }
        }
        ((View)this).setContentDescription(contentDescription);
        final CharSequence tooltipText = this.s.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            CharSequence title;
            if (b3) {
                title = charSequence;
            }
            else {
                title = this.s.getTitle();
            }
            Z.a((View)this, title);
            return;
        }
        Z.a((View)this, tooltipText);
    }
    
    public void onClick(final View view) {
        final androidx.appcompat.view.menu.d.b v = this.v;
        if (v != null) {
            v.a(this.s);
        }
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.y = this.g();
        this.h();
    }
    
    @Override
    public void onMeasure(int a, final int n) {
        final boolean f = this.f();
        if (f) {
            final int b = this.B;
            if (b >= 0) {
                super.setPadding(b, ((View)this).getPaddingTop(), ((View)this).getPaddingRight(), ((View)this).getPaddingBottom());
            }
        }
        super.onMeasure(a, n);
        final int mode = View$MeasureSpec.getMode(a);
        a = View$MeasureSpec.getSize(a);
        final int measuredWidth = ((View)this).getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            a = Math.min(a, this.A);
        }
        else {
            a = this.A;
        }
        if (mode != 1073741824 && this.A > 0 && measuredWidth < a) {
            super.onMeasure(View$MeasureSpec.makeMeasureSpec(a, 1073741824), n);
        }
        if (!f && this.u != null) {
            super.setPadding((((View)this).getMeasuredWidth() - this.u.getBounds().width()) / 2, ((View)this).getPaddingTop(), ((View)this).getPaddingRight(), ((View)this).getPaddingBottom());
        }
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable)null);
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.s.hasSubMenu()) {
            final E w = this.w;
            if (w != null && w.onTouch((View)this, motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public void setCheckable(final boolean b) {
    }
    
    public void setChecked(final boolean b) {
    }
    
    public void setExpandedFormat(final boolean z) {
        if (this.z != z) {
            this.z = z;
            final androidx.appcompat.view.menu.e s = this.s;
            if (s != null) {
                s.a();
            }
        }
    }
    
    public void setIcon(final Drawable u) {
        this.u = u;
        if (u != null) {
            final int intrinsicWidth = u.getIntrinsicWidth();
            final int intrinsicHeight = u.getIntrinsicHeight();
            int c = this.C;
            int n = intrinsicWidth;
            int n2 = intrinsicHeight;
            if (intrinsicWidth > c) {
                n2 = (int)(intrinsicHeight * (c / (float)intrinsicWidth));
                n = c;
            }
            if (n2 > c) {
                n *= (int)(c / (float)n2);
            }
            else {
                c = n2;
            }
            u.setBounds(0, 0, n, c);
        }
        this.setCompoundDrawables(u, null, null, null);
        this.h();
    }
    
    public void setItemInvoker(final androidx.appcompat.view.menu.d.b v) {
        this.v = v;
    }
    
    public void setPadding(final int b, final int n, final int n2, final int n3) {
        super.setPadding(this.B = b, n, n2, n3);
    }
    
    public void setPopupCallback(final b x) {
        this.x = x;
    }
    
    public void setTitle(final CharSequence t) {
        this.t = t;
        this.h();
    }
    
    public class a extends E
    {
        public a() {
            super((View)ActionMenuItemView.this);
        }
        
        @Override
        public k.c b() {
            final ActionMenuItemView.b x = ActionMenuItemView.this.x;
            if (x != null) {
                return x.a();
            }
            return null;
        }
        
        @Override
        public boolean c() {
            final ActionMenuItemView x = ActionMenuItemView.this;
            final androidx.appcompat.view.menu.d.b v = x.v;
            boolean b2;
            final boolean b = b2 = false;
            if (v != null) {
                b2 = b;
                if (v.a(x.s)) {
                    final k.c b3 = this.b();
                    b2 = b;
                    if (b3 != null) {
                        b2 = b;
                        if (b3.i()) {
                            b2 = true;
                        }
                    }
                }
            }
            return b2;
        }
    }
    
    public abstract static class b
    {
        public abstract k.c a();
    }
}
