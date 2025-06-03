package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class L extends AbstractC1501I implements J {

    /* renamed from: Y, reason: collision with root package name */
    public static Method f16340Y;

    /* renamed from: X, reason: collision with root package name */
    public J f16341X;

    public static class a extends AbstractC1495C {

        /* renamed from: B, reason: collision with root package name */
        public final int f16342B;

        /* renamed from: C, reason: collision with root package name */
        public final int f16343C;

        /* renamed from: D, reason: collision with root package name */
        public J f16344D;

        /* renamed from: E, reason: collision with root package name */
        public MenuItem f16345E;

        public a(Context context, boolean z7) {
            super(context, z7);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f16342B = 21;
                this.f16343C = 22;
            } else {
                this.f16342B = 22;
                this.f16343C = 21;
            }
        }

        @Override // l.AbstractC1495C
        public /* bridge */ /* synthetic */ int d(int i7, int i8, int i9, int i10, int i11) {
            return super.d(i7, i8, i9, i10, i11);
        }

        @Override // l.AbstractC1495C
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i7) {
            return super.e(motionEvent, i7);
        }

        @Override // l.AbstractC1495C, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // l.AbstractC1495C, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // l.AbstractC1495C, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // l.AbstractC1495C, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // l.AbstractC1495C, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.c cVar;
            int i7;
            int pointToPosition;
            int i8;
            if (this.f16344D != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i7 = headerViewListAdapter.getHeadersCount();
                    cVar = (androidx.appcompat.view.menu.c) headerViewListAdapter.getWrappedAdapter();
                } else {
                    cVar = (androidx.appcompat.view.menu.c) adapter;
                    i7 = 0;
                }
                androidx.appcompat.view.menu.e item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i8 = pointToPosition - i7) < 0 || i8 >= cVar.getCount()) ? null : cVar.getItem(i8);
                MenuItem menuItem = this.f16345E;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.d b7 = cVar.b();
                    if (menuItem != null) {
                        this.f16344D.c(b7, menuItem);
                    }
                    this.f16345E = item;
                    if (item != null) {
                        this.f16344D.b(b7, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i7, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i7 == this.f16342B) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i7 != this.f16343C) {
                return super.onKeyDown(i7, keyEvent);
            }
            setSelection(-1);
            ((androidx.appcompat.view.menu.c) getAdapter()).b().d(false);
            return true;
        }

        @Override // l.AbstractC1495C, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(J j7) {
            this.f16344D = j7;
        }

        @Override // l.AbstractC1495C, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f16340Y = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public L(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
    }

    public void E(Object obj) {
        this.f16320T.setEnterTransition((Transition) obj);
    }

    public void F(Object obj) {
        this.f16320T.setExitTransition((Transition) obj);
    }

    public void G(J j7) {
        this.f16341X = j7;
    }

    public void H(boolean z7) {
        if (Build.VERSION.SDK_INT > 28) {
            this.f16320T.setTouchModal(z7);
            return;
        }
        Method method = f16340Y;
        if (method != null) {
            try {
                method.invoke(this.f16320T, Boolean.valueOf(z7));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // l.J
    public void b(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
        J j7 = this.f16341X;
        if (j7 != null) {
            j7.b(dVar, menuItem);
        }
    }

    @Override // l.J
    public void c(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
        J j7 = this.f16341X;
        if (j7 != null) {
            j7.c(dVar, menuItem);
        }
    }

    @Override // l.AbstractC1501I
    public AbstractC1495C g(Context context, boolean z7) {
        a aVar = new a(context, z7);
        aVar.setHoverListener(this);
        return aVar;
    }
}
