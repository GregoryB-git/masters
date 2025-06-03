// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package h;

import android.util.SparseArray;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Canvas;
import B.a;
import android.content.res.Resources$Theme;
import android.os.SystemClock;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

public abstract class b extends Drawable implements Drawable$Callback
{
    public c o;
    public Rect p;
    public Drawable q;
    public Drawable r;
    public int s;
    public boolean t;
    public int u;
    public boolean v;
    public Runnable w;
    public long x;
    public long y;
    public b z;
    
    public b() {
        this.s = 255;
        this.u = -1;
    }
    
    public static int f(final Resources resources, int densityDpi) {
        if (resources != null) {
            densityDpi = resources.getDisplayMetrics().densityDpi;
        }
        int n = densityDpi;
        if (densityDpi == 0) {
            n = 160;
        }
        return n;
    }
    
    public void a(final boolean b) {
        final boolean b2 = true;
        this.t = true;
        final long uptimeMillis = SystemClock.uptimeMillis();
        final Drawable q = this.q;
        boolean b3 = false;
        Label_0104: {
            Label_0102: {
                if (q != null) {
                    final long x = this.x;
                    if (x == 0L) {
                        break Label_0102;
                    }
                    if (x > uptimeMillis) {
                        q.setAlpha((255 - (int)((x - uptimeMillis) * 255L) / this.o.A) * this.s / 255);
                        b3 = true;
                        break Label_0104;
                    }
                    q.setAlpha(this.s);
                }
                this.x = 0L;
            }
            b3 = false;
        }
        final Drawable r = this.r;
        Label_0194: {
            if (r != null) {
                final long y = this.y;
                if (y == 0L) {
                    break Label_0194;
                }
                if (y > uptimeMillis) {
                    r.setAlpha((int)((y - uptimeMillis) * 255L) / this.o.B * this.s / 255);
                    b3 = b2;
                    break Label_0194;
                }
                r.setVisible(false, false);
                this.r = null;
            }
            this.y = 0L;
        }
        if (b && b3) {
            this.scheduleSelf(this.w, uptimeMillis + 16L);
        }
    }
    
    public void applyTheme(final Resources$Theme resources$Theme) {
        this.o.b(resources$Theme);
    }
    
    public abstract c b();
    
    public int c() {
        return this.u;
    }
    
    public boolean canApplyTheme() {
        return this.o.canApplyTheme();
    }
    
    public final void d(final Drawable drawable) {
        if (this.z == null) {
            this.z = new b();
        }
        drawable.setCallback((Drawable$Callback)this.z.b(drawable.getCallback()));
        while (true) {
            try {
                if (this.o.A <= 0 && this.t) {
                    drawable.setAlpha(this.s);
                }
                final c o = this.o;
                if (o.E) {
                    drawable.setColorFilter(o.D);
                }
                else {
                    if (o.H) {
                        a.m(drawable, o.F);
                    }
                    final c o2 = this.o;
                    if (o2.I) {
                        a.n(drawable, o2.G);
                    }
                }
                drawable.setVisible(this.isVisible(), true);
                drawable.setDither(this.o.x);
                drawable.setState(this.getState());
                drawable.setLevel(this.getLevel());
                drawable.setBounds(this.getBounds());
                drawable.setLayoutDirection(this.getLayoutDirection());
                drawable.setAutoMirrored(this.o.C);
                final Rect p = this.p;
                if (p != null) {
                    drawable.setHotspotBounds(p.left, p.top, p.right, p.bottom);
                }
                drawable.setCallback(this.z.a());
                return;
                drawable.setCallback(this.z.a());
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void draw(final Canvas canvas) {
        final Drawable q = this.q;
        if (q != null) {
            q.draw(canvas);
        }
        final Drawable r = this.r;
        if (r != null) {
            r.draw(canvas);
        }
    }
    
    public final boolean e() {
        return this.isAutoMirrored() && a.e(this) == 1;
    }
    
    public boolean g(int a) {
        if (a == this.u) {
            return false;
        }
        final long uptimeMillis = SystemClock.uptimeMillis();
        if (this.o.B > 0) {
            final Drawable r = this.r;
            if (r != null) {
                r.setVisible(false, false);
            }
            final Drawable q = this.q;
            if (q != null) {
                this.r = q;
                this.y = this.o.B + uptimeMillis;
            }
            else {
                this.r = null;
                this.y = 0L;
            }
        }
        else {
            final Drawable q2 = this.q;
            if (q2 != null) {
                q2.setVisible(false, false);
            }
        }
        Label_0191: {
            if (a >= 0) {
                final c o = this.o;
                if (a < o.h) {
                    final Drawable g = o.g(a);
                    this.q = g;
                    this.u = a;
                    if (g != null) {
                        a = this.o.A;
                        if (a > 0) {
                            this.x = uptimeMillis + a;
                        }
                        this.d(g);
                    }
                    break Label_0191;
                }
            }
            this.q = null;
            this.u = -1;
        }
        if (this.x != 0L || this.y != 0L) {
            final Runnable w = this.w;
            if (w == null) {
                this.w = new Runnable() {
                    @Override
                    public void run() {
                        b.this.a(true);
                        b.this.invalidateSelf();
                    }
                };
            }
            else {
                this.unscheduleSelf(w);
            }
            this.a(true);
        }
        this.invalidateSelf();
        return true;
    }
    
    public int getAlpha() {
        return this.s;
    }
    
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.o.getChangingConfigurations();
    }
    
    public final Drawable$ConstantState getConstantState() {
        if (this.o.c()) {
            this.o.d = this.getChangingConfigurations();
            return this.o;
        }
        return null;
    }
    
    public Drawable getCurrent() {
        return this.q;
    }
    
    public void getHotspotBounds(final Rect rect) {
        final Rect p = this.p;
        if (p != null) {
            rect.set(p);
            return;
        }
        super.getHotspotBounds(rect);
    }
    
    public int getIntrinsicHeight() {
        if (this.o.q()) {
            return this.o.i();
        }
        final Drawable q = this.q;
        if (q != null) {
            return q.getIntrinsicHeight();
        }
        return -1;
    }
    
    public int getIntrinsicWidth() {
        if (this.o.q()) {
            return this.o.m();
        }
        final Drawable q = this.q;
        if (q != null) {
            return q.getIntrinsicWidth();
        }
        return -1;
    }
    
    public int getMinimumHeight() {
        if (this.o.q()) {
            return this.o.j();
        }
        final Drawable q = this.q;
        if (q != null) {
            return q.getMinimumHeight();
        }
        return 0;
    }
    
    public int getMinimumWidth() {
        if (this.o.q()) {
            return this.o.k();
        }
        final Drawable q = this.q;
        if (q != null) {
            return q.getMinimumWidth();
        }
        return 0;
    }
    
    public int getOpacity() {
        final Drawable q = this.q;
        if (q != null && q.isVisible()) {
            return this.o.n();
        }
        return -2;
    }
    
    public void getOutline(final Outline outline) {
        final Drawable q = this.q;
        if (q != null) {
            q.getOutline(outline);
        }
    }
    
    public boolean getPadding(final Rect rect) {
        final Rect l = this.o.l();
        boolean b;
        if (l != null) {
            rect.set(l);
            b = ((l.right | (l.left | l.top | l.bottom)) != 0x0);
        }
        else {
            final Drawable q = this.q;
            if (q != null) {
                b = q.getPadding(rect);
            }
            else {
                b = super.getPadding(rect);
            }
        }
        if (this.e()) {
            final int left = rect.left;
            rect.left = rect.right;
            rect.right = left;
        }
        return b;
    }
    
    public void h(final c o) {
        this.o = o;
        final int u = this.u;
        if (u >= 0) {
            final Drawable g = o.g(u);
            if ((this.q = g) != null) {
                this.d(g);
            }
        }
        this.r = null;
    }
    
    public final void i(final Resources resources) {
        this.o.y(resources);
    }
    
    public void invalidateDrawable(final Drawable drawable) {
        final c o = this.o;
        if (o != null) {
            o.p();
        }
        if (drawable == this.q && this.getCallback() != null) {
            this.getCallback().invalidateDrawable((Drawable)this);
        }
    }
    
    public boolean isAutoMirrored() {
        return this.o.C;
    }
    
    public void jumpToCurrentState() {
        final Drawable r = this.r;
        final boolean b = true;
        boolean b2;
        if (r != null) {
            r.jumpToCurrentState();
            this.r = null;
            b2 = true;
        }
        else {
            b2 = false;
        }
        final Drawable q = this.q;
        if (q != null) {
            q.jumpToCurrentState();
            if (this.t) {
                this.q.setAlpha(this.s);
            }
        }
        if (this.y != 0L) {
            this.y = 0L;
            b2 = b;
        }
        if (this.x != 0L) {
            this.x = 0L;
        }
        else if (!b2) {
            return;
        }
        this.invalidateSelf();
    }
    
    public Drawable mutate() {
        if (!this.v && super.mutate() == this) {
            final c b = this.b();
            b.r();
            this.h(b);
            this.v = true;
        }
        return this;
    }
    
    public void onBoundsChange(final Rect rect) {
        final Drawable r = this.r;
        if (r != null) {
            r.setBounds(rect);
        }
        final Drawable q = this.q;
        if (q != null) {
            q.setBounds(rect);
        }
    }
    
    public boolean onLayoutDirectionChanged(final int n) {
        return this.o.w(n, this.c());
    }
    
    public boolean onLevelChange(final int n) {
        final Drawable r = this.r;
        if (r != null) {
            return r.setLevel(n);
        }
        final Drawable q = this.q;
        return q != null && q.setLevel(n);
    }
    
    public void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        if (drawable == this.q && this.getCallback() != null) {
            this.getCallback().scheduleDrawable((Drawable)this, runnable, n);
        }
    }
    
    public void setAlpha(final int n) {
        if (!this.t || this.s != n) {
            this.t = true;
            this.s = n;
            final Drawable q = this.q;
            if (q != null) {
                if (this.x == 0L) {
                    q.setAlpha(n);
                    return;
                }
                this.a(false);
            }
        }
    }
    
    public void setAutoMirrored(final boolean c) {
        final c o = this.o;
        if (o.C != c) {
            o.C = c;
            final Drawable q = this.q;
            if (q != null) {
                a.i(q, c);
            }
        }
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        final c o = this.o;
        o.E = true;
        if (o.D != colorFilter) {
            o.D = colorFilter;
            final Drawable q = this.q;
            if (q != null) {
                q.setColorFilter(colorFilter);
            }
        }
    }
    
    public void setDither(final boolean b) {
        final c o = this.o;
        if (o.x != b) {
            o.x = b;
            final Drawable q = this.q;
            if (q != null) {
                q.setDither(b);
            }
        }
    }
    
    public void setHotspot(final float n, final float n2) {
        final Drawable q = this.q;
        if (q != null) {
            a.j(q, n, n2);
        }
    }
    
    public void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        final Rect p4 = this.p;
        if (p4 == null) {
            this.p = new Rect(n, n2, n3, n4);
        }
        else {
            p4.set(n, n2, n3, n4);
        }
        final Drawable q = this.q;
        if (q != null) {
            a.k(q, n, n2, n3, n4);
        }
    }
    
    public void setTintList(final ColorStateList f) {
        final c o = this.o;
        o.H = true;
        if (o.F != f) {
            o.F = f;
            a.m(this.q, f);
        }
    }
    
    public void setTintMode(final PorterDuff$Mode g) {
        final c o = this.o;
        o.I = true;
        if (o.G != g) {
            o.G = g;
            a.n(this.q, g);
        }
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        final boolean setVisible = super.setVisible(b, b2);
        final Drawable r = this.r;
        if (r != null) {
            r.setVisible(b, b2);
        }
        final Drawable q = this.q;
        if (q != null) {
            q.setVisible(b, b2);
        }
        return setVisible;
    }
    
    public void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        if (drawable == this.q && this.getCallback() != null) {
            this.getCallback().unscheduleDrawable((Drawable)this, runnable);
        }
    }
    
    public static class b implements Drawable$Callback
    {
        public Drawable$Callback o;
        
        public Drawable$Callback a() {
            final Drawable$Callback o = this.o;
            this.o = null;
            return o;
        }
        
        public b b(final Drawable$Callback o) {
            this.o = o;
            return this;
        }
        
        public void invalidateDrawable(final Drawable drawable) {
        }
        
        public void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
            final Drawable$Callback o = this.o;
            if (o != null) {
                o.scheduleDrawable(drawable, runnable, n);
            }
        }
        
        public void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
            final Drawable$Callback o = this.o;
            if (o != null) {
                o.unscheduleDrawable(drawable, runnable);
            }
        }
    }
    
    public abstract static class c extends Drawable$ConstantState
    {
        public int A;
        public int B;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff$Mode G;
        public boolean H;
        public boolean I;
        public final b a;
        public Resources b;
        public int c;
        public int d;
        public int e;
        public SparseArray f;
        public Drawable[] g;
        public int h;
        public boolean i;
        public boolean j;
        public Rect k;
        public boolean l;
        public boolean m;
        public int n;
        public int o;
        public int p;
        public int q;
        public boolean r;
        public int s;
        public boolean t;
        public boolean u;
        public boolean v;
        public boolean w;
        public boolean x;
        public boolean y;
        public int z;
        
        public c(final c c, final b a, final Resources resources) {
            this.c = 160;
            final int n = 0;
            this.i = false;
            this.l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.a = a;
            Resources b;
            if (resources != null) {
                b = resources;
            }
            else if (c != null) {
                b = c.b;
            }
            else {
                b = null;
            }
            this.b = b;
            int c2;
            if (c != null) {
                c2 = c.c;
            }
            else {
                c2 = 0;
            }
            final int f = h.b.f(resources, c2);
            this.c = f;
            if (c != null) {
                this.d = c.d;
                this.e = c.e;
                this.v = true;
                this.w = true;
                this.i = c.i;
                this.l = c.l;
                this.x = c.x;
                this.y = c.y;
                this.z = c.z;
                this.A = c.A;
                this.B = c.B;
                this.C = c.C;
                this.D = c.D;
                this.E = c.E;
                this.F = c.F;
                this.G = c.G;
                this.H = c.H;
                this.I = c.I;
                if (c.c == f) {
                    if (c.j) {
                        this.k = new Rect(c.k);
                        this.j = true;
                    }
                    if (c.m) {
                        this.n = c.n;
                        this.o = c.o;
                        this.p = c.p;
                        this.q = c.q;
                        this.m = true;
                    }
                }
                if (c.r) {
                    this.s = c.s;
                    this.r = true;
                }
                if (c.t) {
                    this.u = c.u;
                    this.t = true;
                }
                final Drawable[] g = c.g;
                this.g = new Drawable[g.length];
                this.h = c.h;
                final SparseArray f2 = c.f;
                SparseArray clone;
                if (f2 != null) {
                    clone = f2.clone();
                }
                else {
                    clone = new SparseArray(this.h);
                }
                this.f = clone;
                for (int h = this.h, i = n; i < h; ++i) {
                    final Drawable drawable = g[i];
                    if (drawable != null) {
                        final Drawable$ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f.put(i, (Object)constantState);
                        }
                        else {
                            this.g[i] = g[i];
                        }
                    }
                }
            }
            else {
                this.g = new Drawable[10];
                this.h = 0;
            }
        }
        
        public final int a(final Drawable drawable) {
            final int h = this.h;
            if (h >= this.g.length) {
                this.o(h, h + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback((Drawable$Callback)this.a);
            this.g[h] = drawable;
            ++this.h;
            this.e |= drawable.getChangingConfigurations();
            this.p();
            this.k = null;
            this.j = false;
            this.m = false;
            this.v = false;
            return h;
        }
        
        public final void b(final Resources$Theme resources$Theme) {
            if (resources$Theme != null) {
                this.e();
                final int h = this.h;
                final Drawable[] g = this.g;
                for (int i = 0; i < h; ++i) {
                    final Drawable drawable = g[i];
                    if (drawable != null && drawable.canApplyTheme()) {
                        g[i].applyTheme(resources$Theme);
                        this.e |= g[i].getChangingConfigurations();
                    }
                }
                this.y(resources$Theme.getResources());
            }
        }
        
        public boolean c() {
            // monitorenter(this)
            // monitorexit(this)
            Label_0085: {
                try {
                    if (this.v) {
                        // monitorexit(this)
                        return this.w;
                    }
                }
                finally {
                    break Label_0085;
                }
                this.e();
                this.v = true;
                final int h = this.h;
                final Drawable[] g = this.g;
                for (int i = 0; i < h; ++i) {
                    if (g[i].getConstantState() == null) {
                        this.w = false;
                        // monitorexit(this)
                        return false;
                    }
                }
                this.w = true;
                return true;
            }
        }
        // monitorexit(this)
        
        public boolean canApplyTheme() {
            final int h = this.h;
            final Drawable[] g = this.g;
            for (int i = 0; i < h; ++i) {
                final Drawable drawable = g[i];
                if (drawable != null) {
                    if (drawable.canApplyTheme()) {
                        return true;
                    }
                }
                else {
                    final Drawable$ConstantState drawable$ConstantState = (Drawable$ConstantState)this.f.get(i);
                    if (drawable$ConstantState != null && drawable$ConstantState.canApplyTheme()) {
                        return true;
                    }
                }
            }
            return false;
        }
        
        public void d() {
            this.m = true;
            this.e();
            final int h = this.h;
            final Drawable[] g = this.g;
            this.o = -1;
            this.n = -1;
            int i = 0;
            this.q = 0;
            this.p = 0;
            while (i < h) {
                final Drawable drawable = g[i];
                final int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                final int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                final int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                final int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
                ++i;
            }
        }
        
        public final void e() {
            final SparseArray f = this.f;
            if (f != null) {
                for (int size = f.size(), i = 0; i < size; ++i) {
                    this.g[this.f.keyAt(i)] = this.s(((Drawable$ConstantState)this.f.valueAt(i)).newDrawable(this.b));
                }
                this.f = null;
            }
        }
        
        public final int f() {
            return this.g.length;
        }
        
        public final Drawable g(final int n) {
            final Drawable drawable = this.g[n];
            if (drawable != null) {
                return drawable;
            }
            final SparseArray f = this.f;
            if (f != null) {
                final int indexOfKey = f.indexOfKey(n);
                if (indexOfKey >= 0) {
                    final Drawable s = this.s(((Drawable$ConstantState)this.f.valueAt(indexOfKey)).newDrawable(this.b));
                    this.g[n] = s;
                    this.f.removeAt(indexOfKey);
                    if (this.f.size() == 0) {
                        this.f = null;
                    }
                    return s;
                }
            }
            return null;
        }
        
        public int getChangingConfigurations() {
            return this.d | this.e;
        }
        
        public final int h() {
            return this.h;
        }
        
        public final int i() {
            if (!this.m) {
                this.d();
            }
            return this.o;
        }
        
        public final int j() {
            if (!this.m) {
                this.d();
            }
            return this.q;
        }
        
        public final int k() {
            if (!this.m) {
                this.d();
            }
            return this.p;
        }
        
        public final Rect l() {
            final boolean i = this.i;
            Rect k = null;
            if (i) {
                return null;
            }
            final Rect j = this.k;
            if (j != null) {
                return j;
            }
            if (this.j) {
                return j;
            }
            this.e();
            final Rect rect = new Rect();
            final int h = this.h;
            final Drawable[] g = this.g;
            Rect rect2;
            for (int l = 0; l < h; ++l, k = rect2) {
                rect2 = k;
                if (g[l].getPadding(rect)) {
                    Rect rect3;
                    if ((rect3 = k) == null) {
                        rect3 = new Rect(0, 0, 0, 0);
                    }
                    final int left = rect.left;
                    if (left > rect3.left) {
                        rect3.left = left;
                    }
                    final int top = rect.top;
                    if (top > rect3.top) {
                        rect3.top = top;
                    }
                    final int right = rect.right;
                    if (right > rect3.right) {
                        rect3.right = right;
                    }
                    final int bottom = rect.bottom;
                    rect2 = rect3;
                    if (bottom > rect3.bottom) {
                        rect3.bottom = bottom;
                        rect2 = rect3;
                    }
                }
            }
            this.j = true;
            return this.k = k;
        }
        
        public final int m() {
            if (!this.m) {
                this.d();
            }
            return this.n;
        }
        
        public final int n() {
            if (this.r) {
                return this.s;
            }
            this.e();
            final int h = this.h;
            final Drawable[] g = this.g;
            int s;
            if (h > 0) {
                s = g[0].getOpacity();
            }
            else {
                s = -2;
            }
            for (int i = 1; i < h; ++i) {
                s = Drawable.resolveOpacity(s, g[i].getOpacity());
            }
            this.s = s;
            this.r = true;
            return s;
        }
        
        public void o(final int n, final int n2) {
            final Drawable[] g = new Drawable[n2];
            System.arraycopy(this.g, 0, g, 0, n);
            this.g = g;
        }
        
        public void p() {
            this.r = false;
            this.t = false;
        }
        
        public final boolean q() {
            return this.l;
        }
        
        public abstract void r();
        
        public final Drawable s(Drawable mutate) {
            mutate.setLayoutDirection(this.z);
            mutate = mutate.mutate();
            mutate.setCallback((Drawable$Callback)this.a);
            return mutate;
        }
        
        public final void t(final boolean l) {
            this.l = l;
        }
        
        public final void u(final int a) {
            this.A = a;
        }
        
        public final void v(final int b) {
            this.B = b;
        }
        
        public final boolean w(final int n, final int n2) {
            final int h = this.h;
            final Drawable[] g = this.g;
            int i = 0;
            boolean b = false;
            while (i < h) {
                final Drawable drawable = g[i];
                boolean b2 = b;
                if (drawable != null) {
                    final boolean setLayoutDirection = drawable.setLayoutDirection(n);
                    b2 = b;
                    if (i == n2) {
                        b2 = setLayoutDirection;
                    }
                }
                ++i;
                b = b2;
            }
            this.z = n;
            return b;
        }
        
        public final void x(final boolean i) {
            this.i = i;
        }
        
        public final void y(final Resources b) {
            if (b != null) {
                this.b = b;
                if (this.c != (this.c = b.f(b, this.c))) {
                    this.m = false;
                    this.j = false;
                }
            }
        }
    }
}
