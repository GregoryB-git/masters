package l;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
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
public final class p0 extends n0 implements o0 {
    public static Method L;
    public o0 K;

    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    public static class b {
        public static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    public static class c extends j0 {

        /* renamed from: u, reason: collision with root package name */
        public final int f9435u;

        /* renamed from: v, reason: collision with root package name */
        public final int f9436v;

        /* renamed from: w, reason: collision with root package name */
        public o0 f9437w;

        /* renamed from: x, reason: collision with root package name */
        public androidx.appcompat.view.menu.h f9438x;

        public static class a {
            public static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z10) {
            super(context, z10);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.f9435u = 21;
                this.f9436v = 22;
            } else {
                this.f9435u = 22;
                this.f9436v = 21;
            }
        }

        @Override // l.j0, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            int i10;
            int pointToPosition;
            int i11;
            if (this.f9437w != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i10 = 0;
                }
                androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) adapter;
                androidx.appcompat.view.menu.h hVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i11 = pointToPosition - i10) >= 0 && i11 < eVar.getCount()) {
                    hVar = eVar.getItem(i11);
                }
                androidx.appcompat.view.menu.h hVar2 = this.f9438x;
                if (hVar2 != hVar) {
                    androidx.appcompat.view.menu.f fVar = eVar.f659a;
                    if (hVar2 != null) {
                        this.f9437w.f(fVar, hVar2);
                    }
                    this.f9438x = hVar;
                    if (hVar != null) {
                        this.f9437w.c(fVar, hVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f9435u) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i10 != this.f9436v) {
                return super.onKeyDown(i10, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((androidx.appcompat.view.menu.e) adapter).f659a.c(false);
            return true;
        }

        public void setHoverListener(o0 o0Var) {
            this.f9437w = o0Var;
        }

        @Override // l.j0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                L = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public p0(Context context, int i10, int i11) {
        super(context, null, i10, i11);
    }

    @Override // l.o0
    public final void c(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.h hVar) {
        o0 o0Var = this.K;
        if (o0Var != null) {
            o0Var.c(fVar, hVar);
        }
    }

    @Override // l.o0
    public final void f(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        o0 o0Var = this.K;
        if (o0Var != null) {
            o0Var.f(fVar, menuItem);
        }
    }

    @Override // l.n0
    public final j0 p(Context context, boolean z10) {
        c cVar = new c(context, z10);
        cVar.setHoverListener(this);
        return cVar;
    }
}
