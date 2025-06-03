// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.view;

import android.os.BaseBundle;
import android.view.accessibility.AccessibilityRecord;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.Arrays;
import android.text.style.TtsSpan$Builder;
import android.text.style.LocaleSpan;
import java.util.Locale;
import android.text.SpannableString;
import android.app.Activity;
import J.d;
import android.view.accessibility.AccessibilityNodeInfo$CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.graphics.Rect;
import java.util.Iterator;
import android.view.WindowInsets;
import java.util.Set;
import android.opengl.Matrix;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import android.os.Bundle;
import t5.b;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.provider.Settings$Global;
import android.net.Uri;
import android.os.Handler;
import android.view.accessibility.AccessibilityEvent;
import android.os.Build$VERSION;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import android.database.ContentObserver;
import android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener;
import android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener;
import java.util.List;
import java.util.Map;
import android.content.ContentResolver;
import io.flutter.plugin.platform.o;
import android.view.accessibility.AccessibilityManager;
import D5.a;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

public class i extends AccessibilityNodeProvider
{
    public static final int A;
    public static int B;
    public static int C;
    public static final int z;
    public final View a;
    public final a b;
    public final AccessibilityManager c;
    public final AccessibilityViewEmbedder d;
    public final io.flutter.plugin.platform.o e;
    public final ContentResolver f;
    public final Map g;
    public final Map h;
    public l i;
    public Integer j;
    public Integer k;
    public int l;
    public l m;
    public l n;
    public l o;
    public final List p;
    public int q;
    public Integer r;
    public k s;
    public boolean t;
    public boolean u;
    public final a.b v;
    public final AccessibilityManager$AccessibilityStateChangeListener w;
    public final AccessibilityManager$TouchExplorationStateChangeListener x;
    public final ContentObserver y;
    
    static {
        z = (g.s.o | g.r.o | g.t.o | g.u.o);
        A = (i.p.o | i.q.o | i.r.o | i.t.o | i.u.o | i.v.o | i.w.o | i.x.o | i.F.o | i.G.o | i.K.o | i.M.o);
        i.B = 267386881;
        i.C = (g.E.o & g.F.o & g.x.o);
    }
    
    public i(final View view, final a a, final AccessibilityManager accessibilityManager, final ContentResolver contentResolver, final io.flutter.plugin.platform.o o) {
        this(view, a, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), o);
    }
    
    public i(final View a, final a b, final AccessibilityManager c, final ContentResolver f, final AccessibilityViewEmbedder d, final io.flutter.plugin.platform.o e) {
        this.g = new HashMap();
        this.h = new HashMap();
        this.l = 0;
        this.p = new ArrayList();
        this.q = 0;
        this.r = 0;
        this.t = false;
        this.u = false;
        this.v = new a.b() {
            @Override
            public void a(final String s) {
                io.flutter.view.i.c(io.flutter.view.i.this).announceForAccessibility((CharSequence)s);
            }
            
            @Override
            public void b(final ByteBuffer byteBuffer, final String[] array, final ByteBuffer[] array2) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                for (int length = array2.length, i = 0; i < length; ++i) {
                    array2[i].order(ByteOrder.LITTLE_ENDIAN);
                }
                io.flutter.view.i.this.c0(byteBuffer, array, array2);
            }
            
            @Override
            public void c(final ByteBuffer byteBuffer, final String[] array) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                io.flutter.view.i.this.b0(byteBuffer, array);
            }
            
            @Override
            public void d(final String s) {
                if (Build$VERSION.SDK_INT >= 28) {
                    return;
                }
                final AccessibilityEvent i = io.flutter.view.i.this.H(0, 32);
                ((AccessibilityRecord)i).getText().add(s);
                io.flutter.view.i.this.T(i);
            }
            
            @Override
            public void e(final int n) {
                io.flutter.view.i.this.S(n, 8);
            }
            
            @Override
            public void f(final int n) {
                io.flutter.view.i.this.S(n, 2);
            }
            
            @Override
            public void g(final int n) {
                io.flutter.view.i.this.S(n, 1);
            }
        };
        final AccessibilityManager$AccessibilityStateChangeListener w = (AccessibilityManager$AccessibilityStateChangeListener)new AccessibilityManager$AccessibilityStateChangeListener() {
            public void onAccessibilityStateChanged(final boolean b) {
                if (io.flutter.view.i.k(io.flutter.view.i.this)) {
                    return;
                }
                final i a = io.flutter.view.i.this;
                if (b) {
                    io.flutter.view.i.m(a).g(io.flutter.view.i.l(io.flutter.view.i.this));
                    io.flutter.view.i.m(io.flutter.view.i.this).e();
                }
                else {
                    a.X(false);
                    io.flutter.view.i.m(io.flutter.view.i.this).g(null);
                    io.flutter.view.i.m(io.flutter.view.i.this).d();
                }
                if (io.flutter.view.i.s(io.flutter.view.i.this) != null) {
                    io.flutter.view.i.s(io.flutter.view.i.this).a(b, io.flutter.view.i.t(io.flutter.view.i.this).isTouchExplorationEnabled());
                }
            }
        };
        this.w = (AccessibilityManager$AccessibilityStateChangeListener)w;
        final ContentObserver y = new ContentObserver(new Handler()) {
            public void onChange(final boolean b) {
                this.onChange(b, null);
            }
            
            public void onChange(final boolean b, final Uri uri) {
                if (io.flutter.view.i.k(io.flutter.view.i.this)) {
                    return;
                }
                final String string = Settings$Global.getString(io.flutter.view.i.d(io.flutter.view.i.this), "transition_animation_scale");
                if (string != null && string.equals("0")) {
                    io.flutter.view.i.f(io.flutter.view.i.this, io.flutter.view.i.f.r.o);
                }
                else {
                    io.flutter.view.i.e(io.flutter.view.i.this, io.flutter.view.i.f.r.o);
                }
                io.flutter.view.i.this.U();
            }
        };
        this.y = y;
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = d;
        this.e = e;
        ((AccessibilityManager$AccessibilityStateChangeListener)w).onAccessibilityStateChanged(c.isEnabled());
        c.addAccessibilityStateChangeListener((AccessibilityManager$AccessibilityStateChangeListener)w);
        final AccessibilityManager$TouchExplorationStateChangeListener x = (AccessibilityManager$TouchExplorationStateChangeListener)new AccessibilityManager$TouchExplorationStateChangeListener() {
            public void onTouchExplorationStateChanged(final boolean b) {
                if (io.flutter.view.i.k(io.flutter.view.i.this)) {
                    return;
                }
                if (!b) {
                    io.flutter.view.i.this.X(false);
                    io.flutter.view.i.this.M();
                }
                if (io.flutter.view.i.s(io.flutter.view.i.this) != null) {
                    io.flutter.view.i.s(io.flutter.view.i.this).a(c.isEnabled(), b);
                }
            }
        };
        (this.x = (AccessibilityManager$TouchExplorationStateChangeListener)x).onTouchExplorationStateChanged(c.isTouchExplorationEnabled());
        c.addTouchExplorationStateChangeListener((AccessibilityManager$TouchExplorationStateChangeListener)x);
        y.onChange(false);
        f.registerContentObserver(Settings$Global.getUriFor("transition_animation_scale"), false, (ContentObserver)y);
        if (Build$VERSION.SDK_INT >= 31) {
            this.Y();
        }
        e.a(this);
    }
    
    public static /* synthetic */ View c(final i i) {
        return i.a;
    }
    
    public static /* synthetic */ ContentResolver d(final i i) {
        return i.f;
    }
    
    public static /* synthetic */ int e(final i i, int l) {
        l &= i.l;
        return i.l = l;
    }
    
    public static /* synthetic */ int f(final i i, int l) {
        l |= i.l;
        return i.l = l;
    }
    
    public static /* synthetic */ boolean k(final i i) {
        return i.u;
    }
    
    public static /* synthetic */ a.b l(final i i) {
        return i.v;
    }
    
    public static /* synthetic */ a m(final i i) {
        return i.b;
    }
    
    public static /* synthetic */ int q() {
        return i.z;
    }
    
    public static /* synthetic */ int r() {
        return i.A;
    }
    
    public static /* synthetic */ k s(final i i) {
        return i.s;
    }
    
    public static /* synthetic */ AccessibilityManager t(final i i) {
        return i.c;
    }
    
    public final void A(final float n, final float n2, final boolean b) {
        if (this.g.isEmpty()) {
            return;
        }
        final l l = this.z().y0(new float[] { n, n2, 0.0f, 1.0f }, b);
        if (l != this.o) {
            if (l != null) {
                this.S(io.flutter.view.i.l.a(l), 128);
            }
            final l o = this.o;
            if (o != null) {
                this.S(io.flutter.view.i.l.a(o), 256);
            }
            this.o = l;
        }
    }
    
    public boolean B() {
        return this.c.isEnabled();
    }
    
    public final boolean C(final l l) {
        final boolean i = l.x0(io.flutter.view.i.i.A);
        boolean b = false;
        if (i) {
            return false;
        }
        if (l.t0() != null) {
            return true;
        }
        if ((io.flutter.view.i.l.F(l) & io.flutter.view.i.C) != 0x0) {
            b = true;
        }
        return b;
    }
    
    public boolean D() {
        return this.c.isTouchExplorationEnabled();
    }
    
    public AccessibilityEvent G(final int n) {
        return AccessibilityEvent.obtain(n);
    }
    
    public final AccessibilityEvent H(final int n, final int n2) {
        final AccessibilityEvent g = this.G(n2);
        g.setPackageName((CharSequence)this.a.getContext().getPackageName());
        ((AccessibilityRecord)g).setSource(this.a, n);
        return g;
    }
    
    public AccessibilityNodeInfo I(final View view) {
        return AccessibilityNodeInfo.obtain(view);
    }
    
    public AccessibilityNodeInfo J(final View view, final int n) {
        return AccessibilityNodeInfo.obtain(view, n);
    }
    
    public boolean K(final MotionEvent motionEvent) {
        return this.L(motionEvent, false);
    }
    
    public boolean L(final MotionEvent obj, final boolean b) {
        if (!this.c.isTouchExplorationEnabled()) {
            return false;
        }
        if (this.g.isEmpty()) {
            return false;
        }
        final l l = this.z().y0(new float[] { obj.getX(), obj.getY(), 0.0f, 1.0f }, b);
        if (l != null && io.flutter.view.i.l.e(l) != -1) {
            return !b && this.d.onAccessibilityHoverEvent(io.flutter.view.i.l.a(l), obj);
        }
        if (obj.getAction() == 9 || obj.getAction() == 7) {
            this.A(obj.getX(), obj.getY(), b);
            return true;
        }
        if (obj.getAction() == 10) {
            this.M();
            return true;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("unexpected accessibility hover event: ");
        sb.append(obj);
        b.a("flutter", sb.toString());
        return false;
    }
    
    public final void M() {
        final l o = this.o;
        if (o != null) {
            this.S(io.flutter.view.i.l.a(o), 256);
            this.o = null;
        }
    }
    
    public final void N(final l l) {
        String f0;
        if ((f0 = l.p0()) == null) {
            f0 = " ";
        }
        if (Build$VERSION.SDK_INT >= 28) {
            this.W(f0);
            return;
        }
        final AccessibilityEvent h = this.H(io.flutter.view.i.l.a(l), 32);
        ((AccessibilityRecord)h).getText().add(f0);
        this.T(h);
    }
    
    public final boolean O(final l l, final int n, final Bundle bundle, final boolean b) {
        final int int1 = ((BaseBundle)bundle).getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        final boolean boolean1 = ((BaseBundle)bundle).getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        final int j = io.flutter.view.i.l.j(l);
        final int i = io.flutter.view.i.l.l(l);
        this.Q(l, int1, b, boolean1);
        if (j != io.flutter.view.i.l.j(l) || i != io.flutter.view.i.l.l(l)) {
            String r;
            if (io.flutter.view.i.l.r(l) != null) {
                r = io.flutter.view.i.l.r(l);
            }
            else {
                r = "";
            }
            final AccessibilityEvent h = this.H(io.flutter.view.i.l.a(l), 8192);
            ((AccessibilityRecord)h).getText().add(r);
            ((AccessibilityRecord)h).setFromIndex(io.flutter.view.i.l.j(l));
            ((AccessibilityRecord)h).setToIndex(io.flutter.view.i.l.l(l));
            ((AccessibilityRecord)h).setItemCount(r.length());
            this.T(h);
        }
        if (int1 != 1) {
            if (int1 != 2) {
                if (int1 == 4 || int1 == 8 || int1 == 16) {
                    return true;
                }
            }
            else {
                if (b) {
                    final g k = io.flutter.view.i.g.I;
                    if (l.w0(k)) {
                        this.b.c(n, k, boolean1);
                        return true;
                    }
                }
                if (!b) {
                    final g m = io.flutter.view.i.g.J;
                    if (l.w0(m)) {
                        this.b.c(n, m, boolean1);
                        return true;
                    }
                }
            }
        }
        else {
            if (b) {
                final g y = io.flutter.view.i.g.y;
                if (l.w0(y)) {
                    this.b.c(n, y, boolean1);
                    return true;
                }
            }
            if (!b) {
                final g z = io.flutter.view.i.g.z;
                if (l.w0(z)) {
                    this.b.c(n, z, boolean1);
                    return true;
                }
            }
        }
        return false;
    }
    
    public final boolean P(final l l, final int n, final Bundle bundle) {
        String string;
        if (bundle != null && ((BaseBundle)bundle).containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) {
            string = ((BaseBundle)bundle).getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        }
        else {
            string = "";
        }
        this.b.c(n, io.flutter.view.i.g.K, string);
        io.flutter.view.i.l.s(l, string);
        io.flutter.view.i.l.H(l, null);
        return true;
    }
    
    public final void Q(final l l, int n, final boolean b, final boolean b2) {
        if (io.flutter.view.i.l.l(l) >= 0) {
            if (io.flutter.view.i.l.j(l) < 0) {
                return;
            }
            Label_0335: {
                if (n != 1) {
                    while (true) {
                        Matcher matcher2 = null;
                        Label_0179: {
                            Matcher matcher = null;
                            Label_0123: {
                                Label_0049: {
                                    if (n != 2) {
                                        if (n != 4) {
                                            if (n != 8 && n != 16) {
                                                break Label_0335;
                                            }
                                            if (b) {
                                                break Label_0049;
                                            }
                                        }
                                        else if (b && io.flutter.view.i.l.l(l) < io.flutter.view.i.l.r(l).length()) {
                                            matcher = Pattern.compile("(?!^)(\\n)").matcher(io.flutter.view.i.l.r(l).substring(io.flutter.view.i.l.l(l)));
                                            if (matcher.find()) {
                                                break Label_0123;
                                            }
                                            break Label_0049;
                                        }
                                        else {
                                            if (b || io.flutter.view.i.l.l(l) <= 0) {
                                                break Label_0335;
                                            }
                                            matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(io.flutter.view.i.l.r(l).substring(0, io.flutter.view.i.l.l(l)));
                                            if (matcher2.find()) {
                                                break Label_0179;
                                            }
                                        }
                                        io.flutter.view.i.l.m(l, 0);
                                        break Label_0335;
                                    }
                                    if (b && io.flutter.view.i.l.l(l) < io.flutter.view.i.l.r(l).length()) {
                                        matcher = Pattern.compile("\\p{L}(\\b)").matcher(io.flutter.view.i.l.r(l).substring(io.flutter.view.i.l.l(l)));
                                        matcher.find();
                                        if (matcher.find()) {
                                            break Label_0123;
                                        }
                                    }
                                    else {
                                        if (b || io.flutter.view.i.l.l(l) <= 0) {
                                            break Label_0335;
                                        }
                                        matcher2 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(io.flutter.view.i.l.r(l).substring(0, io.flutter.view.i.l.l(l)));
                                        if (matcher2.find()) {
                                            break Label_0179;
                                        }
                                        break Label_0335;
                                    }
                                }
                                n = io.flutter.view.i.l.r(l).length();
                                io.flutter.view.i.l.m(l, n);
                                break Label_0335;
                            }
                            io.flutter.view.i.l.n(l, matcher.start(1));
                            break Label_0335;
                        }
                        n = matcher2.start(1);
                        continue;
                    }
                }
                if (b && io.flutter.view.i.l.l(l) < io.flutter.view.i.l.r(l).length()) {
                    io.flutter.view.i.l.n(l, 1);
                }
                else if (!b && io.flutter.view.i.l.l(l) > 0) {
                    io.flutter.view.i.l.o(l, 1);
                }
            }
            if (!b2) {
                io.flutter.view.i.l.k(l, io.flutter.view.i.l.l(l));
            }
        }
    }
    
    public void R() {
        this.u = true;
        this.e.d();
        this.Z(null);
        this.c.removeAccessibilityStateChangeListener(this.w);
        this.c.removeTouchExplorationStateChangeListener(this.x);
        this.f.unregisterContentObserver(this.y);
        this.b.g(null);
    }
    
    public void S(final int n, final int n2) {
        if (!this.c.isEnabled()) {
            return;
        }
        this.T(this.H(n, n2));
    }
    
    public final void T(final AccessibilityEvent accessibilityEvent) {
        if (!this.c.isEnabled()) {
            return;
        }
        this.a.getParent().requestSendAccessibilityEvent(this.a, accessibilityEvent);
    }
    
    public final void U() {
        this.b.f(this.l);
    }
    
    public final void V(final int n) {
        final AccessibilityEvent h = this.H(n, 2048);
        h.setContentChangeTypes(1);
        this.T(h);
    }
    
    public final void W(final String s) {
        io.flutter.view.f.a(this.a, (CharSequence)s);
    }
    
    public final void X(final boolean t) {
        if (this.t == t) {
            return;
        }
        this.t = t;
        int l;
        if (t) {
            l = (this.l | io.flutter.view.i.f.p.o);
        }
        else {
            l = (this.l & io.flutter.view.i.f.p.o);
        }
        this.l = l;
        this.U();
    }
    
    public final void Y() {
        final View a = this.a;
        if (a != null) {
            if (a.getResources() == null) {
                return;
            }
            final int a2 = io.flutter.view.e.a(this.a.getResources().getConfiguration());
            int l;
            if (a2 != Integer.MAX_VALUE && a2 >= 300) {
                l = (this.l | io.flutter.view.i.f.s.o);
            }
            else {
                l = (this.l & io.flutter.view.i.f.s.o);
            }
            this.l = l;
            this.U();
        }
    }
    
    public void Z(final k s) {
        this.s = s;
    }
    
    public final boolean a0(final l l) {
        return io.flutter.view.i.l.c(l) > 0 && (C0(this.i, new io.flutter.view.g(l)) || !C0(this.i, new io.flutter.view.h()));
    }
    
    public void b0(final ByteBuffer byteBuffer, final String[] array) {
        while (byteBuffer.hasRemaining()) {
            final h x = this.x(byteBuffer.getInt());
            io.flutter.view.i.h.j(x, byteBuffer.getInt());
            final int int1 = byteBuffer.getInt();
            final String s = null;
            String s2;
            if (int1 == -1) {
                s2 = null;
            }
            else {
                s2 = array[int1];
            }
            io.flutter.view.i.h.f(x, s2);
            final int int2 = byteBuffer.getInt();
            String s3;
            if (int2 == -1) {
                s3 = s;
            }
            else {
                s3 = array[int2];
            }
            io.flutter.view.i.h.b(x, s3);
        }
    }
    
    public void c0(final ByteBuffer byteBuffer, final String[] array, final ByteBuffer[] array2) {
        final ArrayList<l> list = new ArrayList<l>();
        while (byteBuffer.hasRemaining()) {
            final l y = this.y(byteBuffer.getInt());
            y.F0(byteBuffer, array, array2);
            if (y.x0(io.flutter.view.i.i.C)) {
                continue;
            }
            if (y.x0(io.flutter.view.i.i.u)) {
                this.m = y;
            }
            if (io.flutter.view.i.l.N(y)) {
                list.add(y);
            }
            if (io.flutter.view.i.l.e(y) == -1 || this.e.b(io.flutter.view.i.l.e(y))) {
                continue;
            }
            final View c = this.e.c(io.flutter.view.i.l.e(y));
            if (c == null) {
                continue;
            }
            c.setImportantForAccessibility(0);
        }
        final HashSet set = new HashSet();
        final l z = this.z();
        final ArrayList<l> list2 = new ArrayList<l>();
        if (z != null) {
            final float[] array3 = new float[16];
            Matrix.setIdentityM(array3, 0);
            if (Build$VERSION.SDK_INT < 28 || this.v()) {
                final WindowInsets rootWindowInsets = this.a.getRootWindowInsets();
                if (rootWindowInsets != null) {
                    if (!this.r.equals(rootWindowInsets.getSystemWindowInsetLeft())) {
                        io.flutter.view.i.l.O(z, true);
                        io.flutter.view.i.l.P(z, true);
                    }
                    final Integer value = rootWindowInsets.getSystemWindowInsetLeft();
                    this.r = value;
                    Matrix.translateM(array3, 0, (float)value, 0.0f, 0.0f);
                }
            }
            z.E0(array3, set, false);
            z.g0(list2);
        }
        final Iterator<Object> iterator = list2.iterator();
        l l = null;
        while (iterator.hasNext()) {
            final l i = iterator.next();
            if (!this.p.contains(io.flutter.view.i.l.a(i))) {
                l = i;
            }
        }
        l j;
        if ((j = l) == null) {
            j = l;
            if (list2.size() > 0) {
                j = list2.get(list2.size() - 1);
            }
        }
        if (j != null && (io.flutter.view.i.l.a(j) != this.q || list2.size() != this.p.size())) {
            this.q = io.flutter.view.i.l.a(j);
            this.N(j);
        }
        this.p.clear();
        final Iterator<Object> iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            this.p.add(io.flutter.view.i.l.a(iterator2.next()));
        }
        final Iterator<Map.Entry<K, l>> iterator3 = this.g.entrySet().iterator();
        while (iterator3.hasNext()) {
            final l k = iterator3.next().getValue();
            if (!set.contains(k)) {
                this.d0(k);
                iterator3.remove();
            }
        }
        this.V(0);
        for (final l m : list) {
            if (m.j0()) {
                final AccessibilityEvent h = this.H(io.flutter.view.i.l.a(m), 4096);
                final float t = io.flutter.view.i.l.T(m);
                float u = io.flutter.view.i.l.U(m);
                float n = t;
                if (Float.isInfinite(io.flutter.view.i.l.U(m))) {
                    n = t;
                    if (t > 70000.0f) {
                        n = 70000.0f;
                    }
                    u = 100000.0f;
                }
                float n4;
                float n5;
                if (Float.isInfinite(io.flutter.view.i.l.V(m))) {
                    final float n2 = u + 100000.0f;
                    float n3 = n;
                    if (n < -70000.0f) {
                        n3 = -70000.0f;
                    }
                    n4 = n3 + 100000.0f;
                    n5 = n2;
                }
                else {
                    n5 = u - io.flutter.view.i.l.V(m);
                    n4 = n - io.flutter.view.i.l.V(m);
                }
                if (!m.u0(io.flutter.view.i.g.t) && !m.u0(io.flutter.view.i.g.u)) {
                    if (m.u0(io.flutter.view.i.g.r) || m.u0(io.flutter.view.i.g.s)) {
                        ((AccessibilityRecord)h).setScrollX((int)n4);
                        ((AccessibilityRecord)h).setMaxScrollX((int)n5);
                    }
                }
                else {
                    ((AccessibilityRecord)h).setScrollY((int)n4);
                    ((AccessibilityRecord)h).setMaxScrollY((int)n5);
                }
                if (io.flutter.view.i.l.c(m) > 0) {
                    ((AccessibilityRecord)h).setItemCount(io.flutter.view.i.l.c(m));
                    ((AccessibilityRecord)h).setFromIndex(io.flutter.view.i.l.X(m));
                    final Iterator iterator5 = io.flutter.view.i.l.Y(m).iterator();
                    int n6 = 0;
                    while (iterator5.hasNext()) {
                        if (!iterator5.next().x0(io.flutter.view.i.i.C)) {
                            ++n6;
                        }
                    }
                    ((AccessibilityRecord)h).setToIndex(io.flutter.view.i.l.X(m) + n6 - 1);
                }
                this.T(h);
            }
            if (m.x0(io.flutter.view.i.i.E) && m.i0()) {
                this.V(io.flutter.view.i.l.a(m));
            }
            final l i2 = this.i;
            if (i2 != null && io.flutter.view.i.l.a(i2) == io.flutter.view.i.l.a(m)) {
                final i r = io.flutter.view.i.i.r;
                if (!m.v0(r) && m.x0(r)) {
                    final AccessibilityEvent h2 = this.H(io.flutter.view.i.l.a(m), 4);
                    ((AccessibilityRecord)h2).getText().add(io.flutter.view.i.l.b0(m));
                    this.T(h2);
                }
            }
            final l m2 = this.m;
            Label_1070: {
                if (m2 != null && io.flutter.view.i.l.a(m2) == io.flutter.view.i.l.a(m)) {
                    final l n7 = this.n;
                    if (n7 == null || io.flutter.view.i.l.a(n7) != io.flutter.view.i.l.a(this.m)) {
                        this.n = this.m;
                        this.T(this.H(io.flutter.view.i.l.a(m), 8));
                        break Label_1070;
                    }
                }
                if (this.m == null) {
                    this.n = null;
                }
            }
            final l m3 = this.m;
            if (m3 != null && io.flutter.view.i.l.a(m3) == io.flutter.view.i.l.a(m)) {
                final i t2 = io.flutter.view.i.i.t;
                if (!m.v0(t2) || !m.x0(t2)) {
                    continue;
                }
                final l i3 = this.i;
                if (i3 != null && io.flutter.view.i.l.a(i3) != io.flutter.view.i.l.a(this.m)) {
                    continue;
                }
                final String c2 = io.flutter.view.i.l.c0(m);
                String r2 = "";
                String c3;
                if (c2 != null) {
                    c3 = io.flutter.view.i.l.c0(m);
                }
                else {
                    c3 = "";
                }
                if (io.flutter.view.i.l.r(m) != null) {
                    r2 = io.flutter.view.i.l.r(m);
                }
                final AccessibilityEvent u2 = this.u(io.flutter.view.i.l.a(m), c3, r2);
                if (u2 != null) {
                    this.T(u2);
                }
                if (io.flutter.view.i.l.d0(m) == io.flutter.view.i.l.j(m) && io.flutter.view.i.l.e0(m) == io.flutter.view.i.l.l(m)) {
                    continue;
                }
                final AccessibilityEvent h3 = this.H(io.flutter.view.i.l.a(m), 8192);
                ((AccessibilityRecord)h3).getText().add(r2);
                ((AccessibilityRecord)h3).setFromIndex(io.flutter.view.i.l.j(m));
                ((AccessibilityRecord)h3).setToIndex(io.flutter.view.i.l.l(m));
                ((AccessibilityRecord)h3).setItemCount(r2.length());
                this.T(h3);
            }
        }
    }
    
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        final boolean b = true;
        this.X(true);
        if (i >= 65536) {
            return this.d.createAccessibilityNodeInfo(i);
        }
        if (i == -1) {
            final AccessibilityNodeInfo j = this.I(this.a);
            this.a.onInitializeAccessibilityNodeInfo(j);
            if (this.g.containsKey(0)) {
                j.addChild(this.a, 0);
            }
            if (Build$VERSION.SDK_INT >= 24) {
                io.flutter.view.a.a(j, false);
            }
            return j;
        }
        final l l = this.g.get(i);
        if (l == null) {
            return null;
        }
        if (io.flutter.view.i.l.e(l) == -1 || !this.e.b(io.flutter.view.i.l.e(l))) {
            final AccessibilityNodeInfo k = this.J(this.a, i);
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 24) {
                io.flutter.view.a.a(k, this.C(l));
            }
            final String s = "";
            k.setViewIdResourceName("");
            if (io.flutter.view.i.l.g(l) != null) {
                k.setViewIdResourceName(io.flutter.view.i.l.g(l));
            }
            k.setPackageName((CharSequence)this.a.getContext().getPackageName());
            k.setClassName((CharSequence)"android.view.View");
            k.setSource(this.a, i);
            k.setFocusable(l.z0());
            final l m = this.m;
            if (m != null) {
                k.setFocused(io.flutter.view.i.l.a(m) == i);
            }
            final l i2 = this.i;
            if (i2 != null) {
                k.setAccessibilityFocused(io.flutter.view.i.l.a(i2) == i);
            }
            final i t = i.t;
            if (l.x0(t)) {
                k.setPassword(l.x0(i.z));
                final i j2 = i.J;
                if (!l.x0(j2)) {
                    k.setClassName((CharSequence)"android.widget.EditText");
                }
                k.setEditable(l.x0(j2) ^ true);
                if (io.flutter.view.i.l.j(l) != -1 && io.flutter.view.i.l.l(l) != -1) {
                    k.setTextSelection(io.flutter.view.i.l.j(l), io.flutter.view.i.l.l(l));
                }
                final l i3 = this.i;
                if (i3 != null && io.flutter.view.i.l.a(i3) == i) {
                    k.setLiveRegion(1);
                }
                boolean b2;
                if (l.w0(io.flutter.view.i.g.y)) {
                    k.addAction(256);
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                if (l.w0(io.flutter.view.i.g.z)) {
                    k.addAction(512);
                    b2 = true;
                }
                int n = b2 ? 1 : 0;
                if (l.w0(io.flutter.view.i.g.I)) {
                    k.addAction(256);
                    n = ((b2 ? 1 : 0) | 0x2);
                }
                int movementGranularities = n;
                if (l.w0(io.flutter.view.i.g.J)) {
                    k.addAction(512);
                    movementGranularities = (n | 0x2);
                }
                k.setMovementGranularities(movementGranularities);
                if (io.flutter.view.i.l.q(l) >= 0) {
                    int length;
                    if (io.flutter.view.i.l.r(l) == null) {
                        length = 0;
                    }
                    else {
                        length = io.flutter.view.i.l.r(l).length();
                    }
                    io.flutter.view.i.l.t(l);
                    io.flutter.view.i.l.q(l);
                    k.setMaxTextLength(length - io.flutter.view.i.l.t(l) + io.flutter.view.i.l.q(l));
                }
            }
            if (l.w0(io.flutter.view.i.g.A)) {
                k.addAction(131072);
            }
            if (l.w0(io.flutter.view.i.g.B)) {
                k.addAction(16384);
            }
            if (l.w0(io.flutter.view.i.g.C)) {
                k.addAction(65536);
            }
            if (l.w0(io.flutter.view.i.g.D)) {
                k.addAction(32768);
            }
            if (l.w0(io.flutter.view.i.g.K)) {
                k.addAction(2097152);
            }
            if (l.x0(i.s) || l.x0(i.L)) {
                k.setClassName((CharSequence)"android.widget.Button");
            }
            if (l.x0(i.D)) {
                k.setClassName((CharSequence)"android.widget.ImageView");
            }
            if (l.w0(io.flutter.view.i.g.H)) {
                k.setDismissable(true);
                k.addAction(1048576);
            }
            if (io.flutter.view.i.l.u(l) != null) {
                k.setParent(this.a, io.flutter.view.i.l.a(io.flutter.view.i.l.u(l)));
            }
            else {
                k.setParent(this.a);
            }
            if (io.flutter.view.i.l.w(l) != -1) {
                k.setTraversalAfter(this.a, io.flutter.view.i.l.w(l));
            }
            final Rect f = l.m0();
            if (io.flutter.view.i.l.u(l) != null) {
                final Rect f2 = io.flutter.view.i.l.u(l).m0();
                final Rect boundsInParent = new Rect(f);
                boundsInParent.offset(-f2.left, -f2.top);
                k.setBoundsInParent(boundsInParent);
            }
            else {
                k.setBoundsInParent(f);
            }
            k.setBoundsInScreen(this.w(f));
            k.setVisibleToUser(true);
            k.setEnabled(!l.x0(i.v) || l.x0(i.w));
            if (l.w0(io.flutter.view.i.g.p)) {
                if (io.flutter.view.i.l.x(l) != null) {
                    k.addAction(new AccessibilityNodeInfo$AccessibilityAction(16, (CharSequence)io.flutter.view.i.h.a(io.flutter.view.i.l.x(l))));
                }
                else {
                    k.addAction(16);
                }
                k.setClickable(true);
            }
            if (l.w0(io.flutter.view.i.g.q)) {
                if (io.flutter.view.i.l.y(l) != null) {
                    k.addAction(new AccessibilityNodeInfo$AccessibilityAction(32, (CharSequence)io.flutter.view.i.h.a(io.flutter.view.i.l.y(l))));
                }
                else {
                    k.addAction(32);
                }
                k.setLongClickable(true);
            }
            final g r = io.flutter.view.i.g.r;
            if (l.w0(r) || l.w0(io.flutter.view.i.g.t) || l.w0(io.flutter.view.i.g.s) || l.w0(io.flutter.view.i.g.u)) {
                k.setScrollable(true);
                Label_1298: {
                    if (l.x0(i.H)) {
                        String className = null;
                        Label_1256: {
                            AccessibilityNodeInfo$CollectionInfo collectionInfo;
                            if (!l.w0(r) && !l.w0(io.flutter.view.i.g.s)) {
                                if (!this.a0(l)) {
                                    className = "android.widget.ScrollView";
                                    break Label_1256;
                                }
                                collectionInfo = AccessibilityNodeInfo$CollectionInfo.obtain(io.flutter.view.i.l.c(l), 0, false);
                            }
                            else {
                                if (!this.a0(l)) {
                                    className = "android.widget.HorizontalScrollView";
                                    break Label_1256;
                                }
                                collectionInfo = AccessibilityNodeInfo$CollectionInfo.obtain(0, io.flutter.view.i.l.c(l), false);
                            }
                            k.setCollectionInfo(collectionInfo);
                            break Label_1298;
                        }
                        k.setClassName((CharSequence)className);
                    }
                }
                if (l.w0(r) || l.w0(io.flutter.view.i.g.t)) {
                    k.addAction(4096);
                }
                if (l.w0(io.flutter.view.i.g.s) || l.w0(io.flutter.view.i.g.u)) {
                    k.addAction(8192);
                }
            }
            final g v = io.flutter.view.i.g.v;
            if (l.w0(v) || l.w0(io.flutter.view.i.g.w)) {
                k.setClassName((CharSequence)"android.widget.SeekBar");
                if (l.w0(v)) {
                    k.addAction(4096);
                }
                if (l.w0(io.flutter.view.i.g.w)) {
                    k.addAction(8192);
                }
            }
            if (l.x0(i.E)) {
                k.setLiveRegion(1);
            }
            if (l.x0(t)) {
                k.setText(l.s0());
                if (sdk_INT >= 28) {
                    io.flutter.view.b.a(k, l.r0());
                }
            }
            else if (!l.x0(i.A)) {
                CharSequence contentDescription;
                final CharSequence charSequence = contentDescription = l.t0();
                if (sdk_INT < 28) {
                    contentDescription = charSequence;
                    if (io.flutter.view.i.l.C(l) != null) {
                        CharSequence obj = s;
                        if (charSequence != null) {
                            obj = charSequence;
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append((Object)obj);
                        sb.append("\n");
                        sb.append(io.flutter.view.i.l.C(l));
                        contentDescription = sb.toString();
                    }
                }
                if (contentDescription != null) {
                    k.setContentDescription(contentDescription);
                }
            }
            if (sdk_INT >= 28 && io.flutter.view.i.l.C(l) != null) {
                io.flutter.view.c.a(k, (CharSequence)io.flutter.view.i.l.C(l));
            }
            final boolean i4 = l.x0(i.p);
            final boolean i5 = l.x0(i.F);
            boolean checkable = b;
            if (!i4) {
                checkable = (i5 && b);
            }
            k.setCheckable(checkable);
            Label_1749: {
                String className2;
                if (i4) {
                    k.setChecked(l.x0(i.q));
                    if (l.x0(i.x)) {
                        className2 = "android.widget.RadioButton";
                    }
                    else {
                        className2 = "android.widget.CheckBox";
                    }
                }
                else {
                    if (!i5) {
                        break Label_1749;
                    }
                    k.setChecked(l.x0(i.G));
                    className2 = "android.widget.Switch";
                }
                k.setClassName((CharSequence)className2);
            }
            k.setSelected(l.x0(i.r));
            if (sdk_INT >= 28) {
                J.d.a(k, l.x0(i.y));
            }
            final l i6 = this.i;
            if (i6 != null && io.flutter.view.i.l.a(i6) == i) {
                i = 128;
            }
            else {
                i = 64;
            }
            k.addAction(i);
            if (io.flutter.view.i.l.D(l) != null) {
                for (final h h : io.flutter.view.i.l.D(l)) {
                    k.addAction(new AccessibilityNodeInfo$AccessibilityAction(io.flutter.view.i.h.c(h), (CharSequence)io.flutter.view.i.h.e(h)));
                }
            }
            for (final l l2 : io.flutter.view.i.l.E(l)) {
                if (l2.x0(i.C)) {
                    continue;
                }
                if (io.flutter.view.i.l.e(l2) != -1) {
                    final View c = this.e.c(io.flutter.view.i.l.e(l2));
                    if (!this.e.b(io.flutter.view.i.l.e(l2))) {
                        k.addChild(c);
                        continue;
                    }
                }
                k.addChild(this.a, io.flutter.view.i.l.a(l2));
            }
            return k;
        }
        final View c2 = this.e.c(io.flutter.view.i.l.e(l));
        if (c2 == null) {
            return null;
        }
        return this.d.getRootNode(c2, io.flutter.view.i.l.a(l), l.m0());
    }
    
    public final void d0(final l l) {
        io.flutter.view.i.l.v(l, null);
        if (io.flutter.view.i.l.e(l) != -1) {
            final Integer j = this.j;
            if (j != null && this.d.platformViewOfNode(j) == this.e.c(io.flutter.view.i.l.e(l))) {
                this.S(this.j, 65536);
                this.j = null;
            }
        }
        if (io.flutter.view.i.l.e(l) != -1) {
            final View c = this.e.c(io.flutter.view.i.l.e(l));
            if (c != null) {
                c.setImportantForAccessibility(4);
            }
        }
        final l i = this.i;
        if (i == l) {
            this.S(io.flutter.view.i.l.a(i), 65536);
            this.i = null;
        }
        if (this.m == l) {
            this.m = null;
        }
        if (this.o == l) {
            this.o = null;
        }
    }
    
    public AccessibilityNodeInfo findFocus(int n) {
    Label_0022_Outer:
        while (true) {
            while (true) {
                Label_0050: {
                    l l;
                    if (n != 1) {
                        if (n != 2) {
                            return null;
                        }
                        break Label_0050;
                    }
                    else {
                        l = this.m;
                        if (l == null) {
                            final Integer n2 = this.k;
                            if (n2 != null) {
                                break Label_0042;
                            }
                            break Label_0050;
                        }
                    }
                    n = io.flutter.view.i.l.a(l);
                    return this.createAccessibilityNodeInfo(n);
                    Integer n2 = null;
                    n = n2;
                    return this.createAccessibilityNodeInfo(n);
                }
                l l = this.i;
                if (l != null) {
                    continue;
                }
                break;
            }
            final Integer n2 = this.j;
            if (n2 != null) {
                continue Label_0022_Outer;
            }
            break;
        }
        return null;
    }
    
    public boolean performAction(final int n, int i, final Bundle bundle) {
        if (n >= 65536) {
            final boolean performAction = this.d.performAction(n, i, bundle);
            if (performAction && i == 128) {
                this.j = null;
            }
            return performAction;
        }
        final l j = this.g.get(n);
        if (j == null) {
            return false;
        }
        switch (i) {
            default: {
                final h h = this.h.get(i - i.B);
                if (h != null) {
                    this.b.c(n, io.flutter.view.i.g.G, io.flutter.view.i.h.g(h));
                    return true;
                }
                return false;
            }
            case 16908342: {
                this.b.b(n, io.flutter.view.i.g.x);
                return true;
            }
            case 2097152: {
                return this.P(j, n, bundle);
            }
            case 1048576: {
                this.b.b(n, io.flutter.view.i.g.H);
                return true;
            }
            case 131072: {
                final HashMap<Object, Integer> hashMap = new HashMap<Object, Integer>();
                if (bundle != null && ((BaseBundle)bundle).containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && ((BaseBundle)bundle).containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap.put("base", ((BaseBundle)bundle).getInt("ACTION_ARGUMENT_SELECTION_START_INT"));
                    i = ((BaseBundle)bundle).getInt("ACTION_ARGUMENT_SELECTION_END_INT");
                }
                else {
                    hashMap.put("base", io.flutter.view.i.l.l(j));
                    i = io.flutter.view.i.l.l(j);
                }
                hashMap.put("extent", i);
                this.b.c(n, io.flutter.view.i.g.A, hashMap);
                final l l = this.g.get(n);
                io.flutter.view.i.l.k(l, hashMap.get("base"));
                io.flutter.view.i.l.m(l, hashMap.get("extent"));
                return true;
            }
            case 65536: {
                this.b.b(n, io.flutter.view.i.g.C);
                return true;
            }
            case 32768: {
                this.b.b(n, io.flutter.view.i.g.D);
                return true;
            }
            case 16384: {
                this.b.b(n, io.flutter.view.i.g.B);
                return true;
            }
            case 8192: {
                g g = io.flutter.view.i.g.u;
                if (!j.w0(g)) {
                    g = io.flutter.view.i.g.s;
                    if (!j.w0(g)) {
                        g = io.flutter.view.i.g.w;
                        if (!j.w0(g)) {
                            return false;
                        }
                        io.flutter.view.i.l.s(j, io.flutter.view.i.l.J(j));
                        io.flutter.view.i.l.H(j, io.flutter.view.i.l.K(j));
                        this.S(n, 4);
                    }
                }
                this.b.b(n, g);
                return true;
            }
            case 4096: {
                g g2 = io.flutter.view.i.g.t;
                if (!j.w0(g2)) {
                    g2 = io.flutter.view.i.g.r;
                    if (!j.w0(g2)) {
                        g2 = io.flutter.view.i.g.v;
                        if (!j.w0(g2)) {
                            return false;
                        }
                        io.flutter.view.i.l.s(j, io.flutter.view.i.l.G(j));
                        io.flutter.view.i.l.H(j, io.flutter.view.i.l.I(j));
                        this.S(n, 4);
                    }
                }
                this.b.b(n, g2);
                return true;
            }
            case 512: {
                return this.O(j, n, bundle, false);
            }
            case 256: {
                return this.O(j, n, bundle, true);
            }
            case 128: {
                final l k = this.i;
                if (k != null && io.flutter.view.i.l.a(k) == n) {
                    this.i = null;
                }
                final Integer m = this.j;
                if (m != null && m == n) {
                    this.j = null;
                }
                this.b.b(n, io.flutter.view.i.g.F);
                this.S(n, 65536);
                return true;
            }
            case 64: {
                if (this.i == null) {
                    this.a.invalidate();
                }
                this.i = j;
                this.b.b(n, io.flutter.view.i.g.E);
                final HashMap<String, String> hashMap2 = new HashMap<String, String>();
                hashMap2.put("type", "didGainFocus");
                hashMap2.put("nodeId", (String)io.flutter.view.i.l.a(j));
                this.b.a.c(hashMap2);
                this.S(n, 32768);
                if (j.w0(io.flutter.view.i.g.v) || j.w0(io.flutter.view.i.g.w)) {
                    this.S(n, 4);
                }
                return true;
            }
            case 32: {
                this.b.b(n, io.flutter.view.i.g.q);
                return true;
            }
            case 16: {
                this.b.b(n, io.flutter.view.i.g.p);
                return true;
            }
        }
    }
    
    public final AccessibilityEvent u(int fromIndex, final String beforeText, final String s) {
        final AccessibilityEvent h = this.H(fromIndex, 16);
        ((AccessibilityRecord)h).setBeforeText((CharSequence)beforeText);
        ((AccessibilityRecord)h).getText().add(s);
        for (fromIndex = 0; fromIndex < beforeText.length() && fromIndex < s.length() && beforeText.charAt(fromIndex) == s.charAt(fromIndex); ++fromIndex) {}
        if (fromIndex >= beforeText.length() && fromIndex >= s.length()) {
            return null;
        }
        ((AccessibilityRecord)h).setFromIndex(fromIndex);
        int index;
        int index2;
        for (index = beforeText.length() - 1, index2 = s.length() - 1; index >= fromIndex && index2 >= fromIndex && beforeText.charAt(index) == s.charAt(index2); --index, --index2) {}
        ((AccessibilityRecord)h).setRemovedCount(index - fromIndex + 1);
        ((AccessibilityRecord)h).setAddedCount(index2 - fromIndex + 1);
        return h;
    }
    
    public final boolean v() {
        final Activity b = T5.g.b(this.a.getContext());
        boolean b2 = false;
        if (b != null) {
            if (b.getWindow() == null) {
                return false;
            }
            final int a = io.flutter.view.d.a(b.getWindow().getAttributes());
            if (a != 2) {
                b2 = b2;
                if (a != 0) {
                    return b2;
                }
            }
            b2 = true;
        }
        return b2;
    }
    
    public final Rect w(Rect rect) {
        rect = new Rect(rect);
        final int[] array = new int[2];
        this.a.getLocationOnScreen(array);
        rect.offset(array[0], array[1]);
        return rect;
    }
    
    public final h x(final int n) {
        h h;
        if ((h = this.h.get(n)) == null) {
            h = new h();
            io.flutter.view.i.h.h(h, n);
            io.flutter.view.i.h.d(h, io.flutter.view.i.B + n);
            this.h.put(n, h);
        }
        return h;
    }
    
    public final l y(final int n) {
        l l;
        if ((l = this.g.get(n)) == null) {
            l = new l(this);
            io.flutter.view.i.l.b(l, n);
            this.g.put(n, l);
        }
        return l;
    }
    
    public final l z() {
        return this.g.get(0);
    }
    
    public enum f
    {
        p("ACCESSIBLE_NAVIGATION", 0, 1), 
        q("INVERT_COLORS", 1, 2), 
        r("DISABLE_ANIMATIONS", 2, 4), 
        s("BOLD_TEXT", 3, 8), 
        t("REDUCE_MOTION", 4, 16), 
        u("HIGH_CONTRAST", 5, 32), 
        v("ON_OFF_SWITCH_LABELS", 6, 64);
        
        public final int o;
        
        static {
            w = c();
        }
        
        public f(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        public static /* synthetic */ f[] c() {
            return new f[] { f.p, f.q, f.r, f.s, f.t, f.u, f.v };
        }
    }
    
    public enum g
    {
        A("SET_SELECTION", 11, 2048), 
        B("COPY", 12, 4096), 
        C("CUT", 13, 8192), 
        D("PASTE", 14, 16384), 
        E("DID_GAIN_ACCESSIBILITY_FOCUS", 15, 32768), 
        F("DID_LOSE_ACCESSIBILITY_FOCUS", 16, 65536), 
        G("CUSTOM_ACTION", 17, 131072), 
        H("DISMISS", 18, 262144), 
        I("MOVE_CURSOR_FORWARD_BY_WORD", 19, 524288), 
        J("MOVE_CURSOR_BACKWARD_BY_WORD", 20, 1048576), 
        K("SET_TEXT", 21, 2097152), 
        p("TAP", 0, 1), 
        q("LONG_PRESS", 1, 2), 
        r("SCROLL_LEFT", 2, 4), 
        s("SCROLL_RIGHT", 3, 8), 
        t("SCROLL_UP", 4, 16), 
        u("SCROLL_DOWN", 5, 32), 
        v("INCREASE", 6, 64), 
        w("DECREASE", 7, 128), 
        x("SHOW_ON_SCREEN", 8, 256), 
        y("MOVE_CURSOR_FORWARD_BY_CHARACTER", 9, 512), 
        z("MOVE_CURSOR_BACKWARD_BY_CHARACTER", 10, 1024);
        
        public final int o;
        
        static {
            L = c();
        }
        
        public g(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        public static /* synthetic */ g[] c() {
            return new g[] { g.p, g.q, g.r, g.s, g.t, g.u, g.v, g.w, g.x, g.y, g.z, g.A, g.B, g.C, g.D, g.E, g.F, g.G, g.H, g.I, g.J, g.K };
        }
    }
    
    public static class h
    {
        public int a;
        public int b;
        public int c;
        public String d;
        public String e;
        
        public h() {
            this.a = -1;
            this.b = -1;
            this.c = -1;
        }
        
        public static /* synthetic */ String a(final h h) {
            return h.e;
        }
        
        public static /* synthetic */ String b(final h h, final String e) {
            return h.e = e;
        }
        
        public static /* synthetic */ int c(final h h) {
            return h.a;
        }
        
        public static /* synthetic */ int d(final h h, final int a) {
            return h.a = a;
        }
        
        public static /* synthetic */ String e(final h h) {
            return h.d;
        }
        
        public static /* synthetic */ String f(final h h, final String d) {
            return h.d = d;
        }
        
        public static /* synthetic */ int g(final h h) {
            return h.b;
        }
        
        public static /* synthetic */ int h(final h h, final int b) {
            return h.b = b;
        }
        
        public static /* synthetic */ int i(final h h) {
            return h.c;
        }
        
        public static /* synthetic */ int j(final h h, final int c) {
            return h.c = c;
        }
    }
    
    public enum i
    {
        A("SCOPES_ROUTE", 11, 2048), 
        B("NAMES_ROUTE", 12, 4096), 
        C("IS_HIDDEN", 13, 8192), 
        D("IS_IMAGE", 14, 16384), 
        E("IS_LIVE_REGION", 15, 32768), 
        F("HAS_TOGGLED_STATE", 16, 65536), 
        G("IS_TOGGLED", 17, 131072), 
        H("HAS_IMPLICIT_SCROLLING", 18, 262144), 
        I("IS_MULTILINE", 19, 524288), 
        J("IS_READ_ONLY", 20, 1048576), 
        K("IS_FOCUSABLE", 21, 2097152), 
        L("IS_LINK", 22, 4194304), 
        M("IS_SLIDER", 23, 8388608), 
        N("IS_KEYBOARD_KEY", 24, 16777216), 
        O("IS_CHECK_STATE_MIXED", 25, 33554432), 
        P("HAS_EXPANDED_STATE", 26, 67108864), 
        Q("IS_EXPANDED", 27, 134217728), 
        p("HAS_CHECKED_STATE", 0, 1), 
        q("IS_CHECKED", 1, 2), 
        r("IS_SELECTED", 2, 4), 
        s("IS_BUTTON", 3, 8), 
        t("IS_TEXT_FIELD", 4, 16), 
        u("IS_FOCUSED", 5, 32), 
        v("HAS_ENABLED_STATE", 6, 64), 
        w("IS_ENABLED", 7, 128), 
        x("IS_IN_MUTUALLY_EXCLUSIVE_GROUP", 8, 256), 
        y("IS_HEADER", 9, 512), 
        z("IS_OBSCURED", 10, 1024);
        
        public final int o;
        
        static {
            R = c();
        }
        
        public i(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        public static /* synthetic */ i[] c() {
            return new i[] { i.p, i.q, i.r, i.s, i.t, i.u, i.v, i.w, i.x, i.y, i.z, i.A, i.B, i.C, i.D, i.E, i.F, i.G, i.H, i.I, i.J, i.K, i.L, i.M, i.N, i.O, i.P, i.Q };
        }
    }
    
    public static class j extends n
    {
        public String d;
        
        public j() {
            super(null);
        }
    }
    
    public interface k
    {
        void a(final boolean p0, final boolean p1);
    }
    
    public static class l
    {
        public int A;
        public p B;
        public boolean C;
        public int D;
        public int E;
        public int F;
        public int G;
        public float H;
        public float I;
        public float J;
        public String K;
        public String L;
        public float M;
        public float N;
        public float O;
        public float P;
        public float[] Q;
        public l R;
        public List S;
        public List T;
        public List U;
        public h V;
        public h W;
        public boolean X;
        public float[] Y;
        public boolean Z;
        public final i a;
        public float[] a0;
        public int b;
        public Rect b0;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public float l;
        public float m;
        public float n;
        public String o;
        public String p;
        public List q;
        public String r;
        public List s;
        public String t;
        public List u;
        public String v;
        public List w;
        public String x;
        public List y;
        public String z;
        
        public l(final i a) {
            this.b = -1;
            this.A = -1;
            this.C = false;
            this.S = new ArrayList();
            this.T = new ArrayList();
            this.X = true;
            this.Z = true;
            this.a = a;
        }
        
        public static /* synthetic */ String C(final l l) {
            return l.z;
        }
        
        public static boolean C0(final l l, final T5.e e) {
            return l != null && l.l0(e) != null;
        }
        
        public static /* synthetic */ List D(final l l) {
            return l.U;
        }
        
        public static /* synthetic */ List E(final l l) {
            return l.S;
        }
        
        public static /* synthetic */ int F(final l l) {
            return l.d;
        }
        
        public static /* synthetic */ String G(final l l) {
            return l.t;
        }
        
        public static /* synthetic */ List H(final l l, final List s) {
            return l.s = s;
        }
        
        public static /* synthetic */ List I(final l l) {
            return l.u;
        }
        
        public static /* synthetic */ String J(final l l) {
            return l.v;
        }
        
        public static /* synthetic */ List K(final l l) {
            return l.w;
        }
        
        public static /* synthetic */ boolean N(final l l) {
            return l.C;
        }
        
        public static /* synthetic */ boolean O(final l l, final boolean z) {
            return l.Z = z;
        }
        
        public static /* synthetic */ boolean P(final l l, final boolean x) {
            return l.X = x;
        }
        
        public static /* synthetic */ float T(final l l) {
            return l.l;
        }
        
        public static /* synthetic */ float U(final l l) {
            return l.m;
        }
        
        public static /* synthetic */ float V(final l l) {
            return l.n;
        }
        
        public static /* synthetic */ int X(final l l) {
            return l.k;
        }
        
        public static /* synthetic */ List Y(final l l) {
            return l.T;
        }
        
        public static /* synthetic */ int a(final l l) {
            return l.b;
        }
        
        public static /* synthetic */ int b(final l l, final int b) {
            return l.b = b;
        }
        
        public static /* synthetic */ String b0(final l l) {
            return l.p;
        }
        
        public static /* synthetic */ int c(final l l) {
            return l.j;
        }
        
        public static /* synthetic */ String c0(final l l) {
            return l.K;
        }
        
        public static /* synthetic */ int d0(final l l) {
            return l.F;
        }
        
        public static /* synthetic */ int e(final l l) {
            return l.i;
        }
        
        public static /* synthetic */ int e0(final l l) {
            return l.G;
        }
        
        public static /* synthetic */ String g(final l l) {
            return l.o;
        }
        
        public static /* synthetic */ int j(final l l) {
            return l.g;
        }
        
        public static /* synthetic */ int k(final l l, final int g) {
            return l.g = g;
        }
        
        public static /* synthetic */ int l(final l l) {
            return l.h;
        }
        
        public static /* synthetic */ int m(final l l, final int h) {
            return l.h = h;
        }
        
        public static /* synthetic */ int n(final l l, int h) {
            h += l.h;
            return l.h = h;
        }
        
        public static /* synthetic */ int o(final l l, int h) {
            h = l.h - h;
            return l.h = h;
        }
        
        public static /* synthetic */ int q(final l l) {
            return l.e;
        }
        
        public static /* synthetic */ String r(final l l) {
            return l.r;
        }
        
        public static /* synthetic */ String s(final l l, final String r) {
            return l.r = r;
        }
        
        public static /* synthetic */ int t(final l l) {
            return l.f;
        }
        
        public static /* synthetic */ l u(final l l) {
            return l.R;
        }
        
        public static /* synthetic */ l v(final l l, final l r) {
            return l.R = r;
        }
        
        public static /* synthetic */ int w(final l l) {
            return l.A;
        }
        
        public static /* synthetic */ h x(final l l) {
            return l.V;
        }
        
        public static /* synthetic */ h y(final l l) {
            return l.W;
        }
        
        public final float A0(final float a, final float a2, final float a3, final float b) {
            return Math.max(a, Math.max(a2, Math.max(a3, b)));
        }
        
        public final float B0(final float a, final float a2, final float a3, final float b) {
            return Math.min(a, Math.min(a2, Math.min(a3, b)));
        }
        
        public final void D0(final float[] array, final float[] array2, final float[] array3) {
            Matrix.multiplyMV(array, 0, array2, 0, array3, 0);
            final float n = array[3];
            array[0] /= n;
            array[1] /= n;
            array[2] /= n;
            array[3] = 0.0f;
        }
        
        public final void E0(float[] array, final Set set, boolean b) {
            set.add(this);
            if (this.Z) {
                b = true;
            }
            if (b) {
                if (this.a0 == null) {
                    this.a0 = new float[16];
                }
                if (this.Q == null) {
                    this.Q = new float[16];
                }
                Matrix.multiplyMM(this.a0, 0, array, 0, this.Q, 0);
                array = new float[4];
                final float[] array2 = new float[4];
                final float[] array3 = new float[4];
                final float[] array4 = new float[4];
                final float[] array5 = { this.M, this.N, 0.0f, 1.0f };
                this.D0(array, this.a0, array5);
                array5[0] = this.O;
                array5[1] = this.N;
                this.D0(array2, this.a0, array5);
                array5[0] = this.O;
                array5[1] = this.P;
                this.D0(array3, this.a0, array5);
                array5[0] = this.M;
                array5[1] = this.P;
                this.D0(array4, this.a0, array5);
                if (this.b0 == null) {
                    this.b0 = new Rect();
                }
                this.b0.set(Math.round(this.B0(array[0], array2[0], array3[0], array4[0])), Math.round(this.B0(array[1], array2[1], array3[1], array4[1])), Math.round(this.A0(array[0], array2[0], array3[0], array4[0])), Math.round(this.A0(array[1], array2[1], array3[1], array4[1])));
                this.Z = false;
            }
            final Iterator<l> iterator = (Iterator<l>)this.S.iterator();
            int b2 = -1;
            while (iterator.hasNext()) {
                final l l = iterator.next();
                l.A = b2;
                b2 = l.b;
                l.E0(this.a0, set, b);
            }
        }
        
        public final void F0(final ByteBuffer byteBuffer, final String[] array, final ByteBuffer[] array2) {
            this.C = true;
            this.K = this.r;
            this.L = this.p;
            this.D = this.c;
            this.E = this.d;
            this.F = this.g;
            this.G = this.h;
            this.H = this.l;
            this.I = this.m;
            this.J = this.n;
            this.c = byteBuffer.getInt();
            this.d = byteBuffer.getInt();
            this.e = byteBuffer.getInt();
            this.f = byteBuffer.getInt();
            this.g = byteBuffer.getInt();
            this.h = byteBuffer.getInt();
            this.i = byteBuffer.getInt();
            this.j = byteBuffer.getInt();
            this.k = byteBuffer.getInt();
            this.l = byteBuffer.getFloat();
            this.m = byteBuffer.getFloat();
            this.n = byteBuffer.getFloat();
            final int int1 = byteBuffer.getInt();
            String o;
            if (int1 == -1) {
                o = null;
            }
            else {
                o = array[int1];
            }
            this.o = o;
            final int int2 = byteBuffer.getInt();
            String p3;
            if (int2 == -1) {
                p3 = null;
            }
            else {
                p3 = array[int2];
            }
            this.p = p3;
            this.q = this.q0(byteBuffer, array2);
            final int int3 = byteBuffer.getInt();
            String r;
            if (int3 == -1) {
                r = null;
            }
            else {
                r = array[int3];
            }
            this.r = r;
            this.s = this.q0(byteBuffer, array2);
            final int int4 = byteBuffer.getInt();
            String t;
            if (int4 == -1) {
                t = null;
            }
            else {
                t = array[int4];
            }
            this.t = t;
            this.u = this.q0(byteBuffer, array2);
            final int int5 = byteBuffer.getInt();
            String v;
            if (int5 == -1) {
                v = null;
            }
            else {
                v = array[int5];
            }
            this.v = v;
            this.w = this.q0(byteBuffer, array2);
            final int int6 = byteBuffer.getInt();
            String x;
            if (int6 == -1) {
                x = null;
            }
            else {
                x = array[int6];
            }
            this.x = x;
            this.y = this.q0(byteBuffer, array2);
            final int int7 = byteBuffer.getInt();
            String z;
            if (int7 == -1) {
                z = null;
            }
            else {
                z = array[int7];
            }
            this.z = z;
            this.B = io.flutter.view.i.p.e(byteBuffer.getInt());
            this.M = byteBuffer.getFloat();
            this.N = byteBuffer.getFloat();
            this.O = byteBuffer.getFloat();
            this.P = byteBuffer.getFloat();
            if (this.Q == null) {
                this.Q = new float[16];
            }
            final int n = 0;
            for (int i = 0; i < 16; ++i) {
                this.Q[i] = byteBuffer.getFloat();
            }
            this.X = true;
            this.Z = true;
            final int int8 = byteBuffer.getInt();
            this.S.clear();
            this.T.clear();
            for (int j = 0; j < int8; ++j) {
                final l o2 = this.a.y(byteBuffer.getInt());
                o2.R = this;
                this.S.add(o2);
            }
            for (int k = 0; k < int8; ++k) {
                final l o3 = this.a.y(byteBuffer.getInt());
                o3.R = this;
                this.T.add(o3);
            }
            final int int9 = byteBuffer.getInt();
            if (int9 == 0) {
                this.U = null;
                return;
            }
            final List u = this.U;
            int l;
            if (u == null) {
                this.U = new ArrayList(int9);
                l = n;
            }
            else {
                u.clear();
                l = n;
            }
            while (l < int9) {
                final h p4 = this.a.x(byteBuffer.getInt());
                if (io.flutter.view.i.h.i(p4) == io.flutter.view.i.g.p.o) {
                    this.V = p4;
                }
                else if (io.flutter.view.i.h.i(p4) == io.flutter.view.i.g.q.o) {
                    this.W = p4;
                }
                else {
                    this.U.add(p4);
                }
                this.U.add(p4);
                ++l;
            }
        }
        
        public final void g0(final List list) {
            if (this.x0(io.flutter.view.i.i.A)) {
                list.add(this);
            }
            final Iterator<l> iterator = (Iterator<l>)this.S.iterator();
            while (iterator.hasNext()) {
                iterator.next().g0(list);
            }
        }
        
        public final SpannableString h0(final String s, final List list) {
            if (s == null) {
                return null;
            }
            final SpannableString spannableString = new SpannableString((CharSequence)s);
            if (list != null) {
                for (final n n : list) {
                    final int n2 = i$e.a[n.c.ordinal()];
                    if (n2 != 1) {
                        if (n2 != 2) {
                            continue;
                        }
                        spannableString.setSpan((Object)new LocaleSpan(Locale.forLanguageTag(((j)n).d)), n.a, n.b, 0);
                    }
                    else {
                        spannableString.setSpan((Object)new TtsSpan$Builder("android.type.verbatim").build(), n.a, n.b, 0);
                    }
                }
            }
            return spannableString;
        }
        
        public final boolean i0() {
            final String p = this.p;
            boolean b = false;
            if (p == null && this.L == null) {
                return false;
            }
            if (p != null) {
                final String l = this.L;
                if (l != null && p.equals(l)) {
                    return b;
                }
            }
            b = true;
            return b;
        }
        
        public final boolean j0() {
            return !Float.isNaN(this.l) && !Float.isNaN(this.H) && this.H != this.l;
        }
        
        public final void k0() {
            if (!this.X) {
                return;
            }
            this.X = false;
            if (this.Y == null) {
                this.Y = new float[16];
            }
            if (!Matrix.invertM(this.Y, 0, this.Q, 0)) {
                Arrays.fill(this.Y, 0.0f);
            }
        }
        
        public final l l0(final T5.e e) {
            for (l l = this.R; l != null; l = l.R) {
                if (e.test(l)) {
                    return l;
                }
            }
            return null;
        }
        
        public final Rect m0() {
            return this.b0;
        }
        
        public final CharSequence n0() {
            return (CharSequence)this.h0(this.x, this.y);
        }
        
        public final CharSequence o0() {
            return (CharSequence)this.h0(this.p, this.q);
        }
        
        public final String p0() {
            if (this.x0(io.flutter.view.i.i.B)) {
                final String p = this.p;
                if (p != null && !p.isEmpty()) {
                    return this.p;
                }
            }
            final Iterator<l> iterator = this.S.iterator();
            while (iterator.hasNext()) {
                final String p2 = iterator.next().p0();
                if (p2 != null && !p2.isEmpty()) {
                    return p2;
                }
            }
            return null;
        }
        
        public final List q0(final ByteBuffer byteBuffer, final ByteBuffer[] array) {
            final int int1 = byteBuffer.getInt();
            if (int1 == -1) {
                return null;
            }
            final ArrayList list = new ArrayList<j>(int1);
            for (int i = 0; i < int1; ++i) {
                final int int2 = byteBuffer.getInt();
                final int int3 = byteBuffer.getInt();
                final o o = io.flutter.view.i.o.values()[byteBuffer.getInt()];
                final int n = i$e.a[o.ordinal()];
                if (n != 1) {
                    if (n == 2) {
                        final ByteBuffer bb = array[byteBuffer.getInt()];
                        final j j = new j(null);
                        j.a = int2;
                        j.b = int3;
                        j.c = o;
                        j.d = Charset.forName("UTF-8").decode(bb).toString();
                        list.add(j);
                    }
                }
                else {
                    byteBuffer.getInt();
                    final m m = new m(null);
                    m.a = int2;
                    m.b = int3;
                    m.c = o;
                    list.add((j)m);
                }
            }
            return list;
        }
        
        public final CharSequence r0() {
            final CharSequence o0 = this.o0();
            final CharSequence n0 = this.n0();
            CharSequence charSequence = null;
            CharSequence concat;
            for (int i = 0; i < 2; ++i, charSequence = concat) {
                final CharSequence charSequence2 = (new CharSequence[] { o0, n0 })[i];
                concat = charSequence;
                if (charSequence2 != null) {
                    concat = charSequence;
                    if (charSequence2.length() > 0) {
                        if (charSequence != null && charSequence.length() != 0) {
                            concat = TextUtils.concat(new CharSequence[] { charSequence, ", ", charSequence2 });
                        }
                        else {
                            concat = charSequence2;
                        }
                    }
                }
            }
            return charSequence;
        }
        
        public final CharSequence s0() {
            return (CharSequence)this.h0(this.r, this.s);
        }
        
        public final CharSequence t0() {
            final CharSequence s0 = this.s0();
            final CharSequence o0 = this.o0();
            final CharSequence n0 = this.n0();
            CharSequence charSequence = null;
            CharSequence concat;
            for (int i = 0; i < 3; ++i, charSequence = concat) {
                final CharSequence charSequence2 = (new CharSequence[] { s0, o0, n0 })[i];
                concat = charSequence;
                if (charSequence2 != null) {
                    concat = charSequence;
                    if (charSequence2.length() > 0) {
                        if (charSequence != null && charSequence.length() != 0) {
                            concat = TextUtils.concat(new CharSequence[] { charSequence, ", ", charSequence2 });
                        }
                        else {
                            concat = charSequence2;
                        }
                    }
                }
            }
            return charSequence;
        }
        
        public final boolean u0(final g g) {
            return (g.o & this.E) != 0x0;
        }
        
        public final boolean v0(final i i) {
            return (i.o & this.D) != 0x0;
        }
        
        public final boolean w0(final g g) {
            return (g.o & this.d) != 0x0;
        }
        
        public final boolean x0(final i i) {
            return (i.o & this.c) != 0x0;
        }
        
        public final l y0(final float[] array, final boolean b) {
            final float n = array[3];
            final boolean b2 = false;
            final float n2 = array[0] / n;
            final float n3 = array[1] / n;
            final float m = this.M;
            l i;
            final l l = i = null;
            if (n2 >= m) {
                i = l;
                if (n2 < this.O) {
                    i = l;
                    if (n3 >= this.N) {
                        if (n3 >= this.P) {
                            return null;
                        }
                        final float[] array2 = new float[4];
                        for (final l j : this.T) {
                            if (j.x0(io.flutter.view.i.i.C)) {
                                continue;
                            }
                            j.k0();
                            Matrix.multiplyMV(array2, 0, j.Y, 0, array, 0);
                            final l y0 = j.y0(array2, b);
                            if (y0 != null) {
                                return y0;
                            }
                        }
                        boolean b3 = b2;
                        if (b) {
                            b3 = b2;
                            if (this.i != -1) {
                                b3 = true;
                            }
                        }
                        if (!this.z0()) {
                            i = l;
                            if (!b3) {
                                return i;
                            }
                        }
                        i = this;
                    }
                }
            }
            return i;
        }
        
        public final boolean z0() {
            final boolean x0 = this.x0(io.flutter.view.i.i.A);
            final boolean b = false;
            if (x0) {
                return false;
            }
            if (this.x0(io.flutter.view.i.i.K)) {
                return true;
            }
            if ((this.d & io.flutter.view.i.q()) == 0x0 && (this.c & io.flutter.view.i.r()) == 0x0) {
                final String p = this.p;
                if (p == null || p.isEmpty()) {
                    final String r = this.r;
                    if (r == null || r.isEmpty()) {
                        final String x2 = this.x;
                        boolean b2 = b;
                        if (x2 == null) {
                            return b2;
                        }
                        b2 = b;
                        if (x2.isEmpty()) {
                            return b2;
                        }
                    }
                }
            }
            return true;
        }
    }
    
    public static class m extends n
    {
        public m() {
            super(null);
        }
    }
    
    public abstract static class n
    {
        public int a;
        public int b;
        public o c;
    }
    
    public enum o
    {
        o("SPELLOUT", 0), 
        p("LOCALE", 1);
        
        static {
            q = c();
        }
        
        public o(final String name, final int ordinal) {
        }
        
        public static /* synthetic */ o[] c() {
            return new o[] { o.o, o.p };
        }
    }
    
    public enum p
    {
        o("UNKNOWN", 0), 
        p("LTR", 1), 
        q("RTL", 2);
        
        static {
            r = c();
        }
        
        public p(final String name, final int ordinal) {
        }
        
        public static /* synthetic */ p[] c() {
            return new p[] { p.o, p.p, p.q };
        }
        
        public static p e(final int n) {
            if (n == 1) {
                return p.q;
            }
            if (n != 2) {
                return p.o;
            }
            return p.p;
        }
    }
}
