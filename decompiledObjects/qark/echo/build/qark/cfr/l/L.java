/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.transition.Transition
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.KeyEvent
 *  android.view.MenuItem
 *  android.view.MotionEvent
 *  android.view.View
 *  android.widget.HeaderViewListAdapter
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.PopupWindow
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Method
 */
package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import java.lang.reflect.Method;
import l.C;
import l.I;
import l.J;
import l.K;

public class L
extends I
implements J {
    public static Method Y;
    public J X;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        try {
            if (Build.VERSION.SDK_INT > 28) return;
            Y = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            return;
        }
        catch (NoSuchMethodException noSuchMethodException) {}
        Log.i((String)"MenuPopupWindow", (String)"Could not find method setTouchModal() on PopupWindow. Oh well.");
    }

    public L(Context context, AttributeSet attributeSet, int n8, int n9) {
        super(context, attributeSet, n8, n9);
    }

    public void E(Object object) {
        this.T.setEnterTransition((Transition)object);
    }

    public void F(Object object) {
        this.T.setExitTransition((Transition)object);
    }

    public void G(J j8) {
        this.X = j8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void H(boolean bl) {
        if (Build.VERSION.SDK_INT > 28) {
            K.a(this.T, bl);
            return;
        }
        Method method = Y;
        if (method == null) return;
        try {
            method.invoke((Object)this.T, new Object[]{bl});
            return;
        }
        catch (Exception exception) {}
        Log.i((String)"MenuPopupWindow", (String)"Could not invoke setTouchModal() on PopupWindow. Oh well.");
    }

    @Override
    public void b(d d8, MenuItem menuItem) {
        J j8 = this.X;
        if (j8 != null) {
            j8.b(d8, menuItem);
        }
    }

    @Override
    public void c(d d8, MenuItem menuItem) {
        J j8 = this.X;
        if (j8 != null) {
            j8.c(d8, menuItem);
        }
    }

    @Override
    public C g(Context object, boolean bl) {
        object = new a((Context)object, bl);
        object.setHoverListener(this);
        return object;
    }

    public static class a
    extends C {
        public final int B;
        public final int C;
        public J D;
        public MenuItem E;

        public a(Context context, boolean bl) {
            super(context, bl);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.B = 21;
                this.C = 22;
                return;
            }
            this.B = 22;
            this.C = 21;
        }

        @Override
        public boolean onHoverEvent(MotionEvent motionEvent) {
            if (this.D != null) {
                int n8;
                int n9;
                Object object = this.getAdapter();
                if (object instanceof HeaderViewListAdapter) {
                    object = (HeaderViewListAdapter)object;
                    n8 = object.getHeadersCount();
                    object = (c)object.getWrappedAdapter();
                } else {
                    object = (c)((Object)object);
                    n8 = 0;
                }
                e e8 = motionEvent.getAction() != 10 && (n9 = this.pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY())) != -1 && (n8 = n9 - n8) >= 0 && n8 < object.getCount() ? object.c(n8) : null;
                MenuItem menuItem = this.E;
                if (menuItem != e8) {
                    object = object.b();
                    if (menuItem != null) {
                        this.D.c((d)object, menuItem);
                    }
                    this.E = e8;
                    if (e8 != null) {
                        this.D.b((d)object, e8);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int n8, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView)this.getSelectedView();
            if (listMenuItemView != null && n8 == this.B) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    this.performItemClick((View)listMenuItemView, this.getSelectedItemPosition(), this.getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView != null && n8 == this.C) {
                this.setSelection(-1);
                ((c)this.getAdapter()).b().d(false);
                return true;
            }
            return ListView.super.onKeyDown(n8, keyEvent);
        }

        public void setHoverListener(J j8) {
            this.D = j8;
        }
    }

}

