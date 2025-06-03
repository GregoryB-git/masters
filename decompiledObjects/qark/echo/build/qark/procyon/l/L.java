// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import android.widget.AdapterView;
import android.widget.AbsListView;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.c;
import android.widget.HeaderViewListAdapter;
import android.view.MotionEvent;
import android.view.MenuItem;
import androidx.appcompat.view.menu.d;
import android.transition.Transition;
import android.util.AttributeSet;
import android.content.Context;
import android.util.Log;
import android.widget.PopupWindow;
import android.os.Build$VERSION;
import java.lang.reflect.Method;

public class L extends I implements J
{
    public static Method Y;
    public J X;
    
    static {
        while (true) {
            while (true) {
                try {
                    if (Build$VERSION.SDK_INT <= 28) {
                        L.Y = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
                        return;
                    }
                    return;
                    Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
                    return;
                }
                catch (NoSuchMethodException ex) {}
                continue;
            }
        }
    }
    
    public L(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
    }
    
    public void E(final Object o) {
        super.T.setEnterTransition((Transition)o);
    }
    
    public void F(final Object o) {
        super.T.setExitTransition((Transition)o);
    }
    
    public void G(final J x) {
        this.X = x;
    }
    
    public void H(final boolean b) {
        Label_0046: {
            if (Build$VERSION.SDK_INT > 28) {
                break Label_0046;
            }
            final Method y = L.Y;
            if (y == null) {
                return;
            }
            while (true) {
                while (true) {
                    try {
                        y.invoke(super.T, b);
                        return;
                        l.K.a(super.T, b);
                        return;
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        return;
                    }
                    catch (Exception ex) {}
                    continue;
                }
            }
        }
    }
    
    @Override
    public void b(final androidx.appcompat.view.menu.d d, final MenuItem menuItem) {
        final J x = this.X;
        if (x != null) {
            x.b(d, menuItem);
        }
    }
    
    @Override
    public void c(final androidx.appcompat.view.menu.d d, final MenuItem menuItem) {
        final J x = this.X;
        if (x != null) {
            x.c(d, menuItem);
        }
    }
    
    @Override
    public C g(final Context context, final boolean b) {
        final a a = new a(context, b);
        a.setHoverListener(this);
        return a;
    }
    
    public static class a extends C
    {
        public final int B;
        public final int C;
        public J D;
        public MenuItem E;
        
        public a(final Context context, final boolean b) {
            super(context, b);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.B = 21;
                this.C = 22;
                return;
            }
            this.B = 22;
            this.C = 21;
        }
        
        @Override
        public boolean onHoverEvent(final MotionEvent motionEvent) {
            if (this.D != null) {
                final ListAdapter adapter = this.getAdapter();
                int headersCount;
                androidx.appcompat.view.menu.c c;
                if (adapter instanceof HeaderViewListAdapter) {
                    final HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter)adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c = (androidx.appcompat.view.menu.c)headerViewListAdapter.getWrappedAdapter();
                }
                else {
                    c = (androidx.appcompat.view.menu.c)adapter;
                    headersCount = 0;
                }
                Object c2 = null;
                Label_0116: {
                    if (motionEvent.getAction() != 10) {
                        final int pointToPosition = ((AbsListView)this).pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
                        if (pointToPosition != -1) {
                            final int n = pointToPosition - headersCount;
                            if (n >= 0 && n < c.getCount()) {
                                c2 = c.c(n);
                                break Label_0116;
                            }
                        }
                    }
                    c2 = null;
                }
                final MenuItem e = this.E;
                if (e != c2) {
                    final androidx.appcompat.view.menu.d b = c.b();
                    if (e != null) {
                        this.D.c(b, e);
                    }
                    if ((this.E = (MenuItem)c2) != null) {
                        this.D.b(b, (MenuItem)c2);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }
        
        public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
            final ListMenuItemView listMenuItemView = (ListMenuItemView)((AdapterView)this).getSelectedView();
            if (listMenuItemView != null && n == this.B) {
                if (((View)listMenuItemView).isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    ((AdapterView)this).performItemClick((View)listMenuItemView, ((AdapterView)this).getSelectedItemPosition(), ((AdapterView)this).getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView != null && n == this.C) {
                ((AdapterView)this).setSelection(-1);
                ((androidx.appcompat.view.menu.c)this.getAdapter()).b().d(false);
                return true;
            }
            return super.onKeyDown(n, keyEvent);
        }
        
        public void setHoverListener(final J d) {
            this.D = d;
        }
    }
}
