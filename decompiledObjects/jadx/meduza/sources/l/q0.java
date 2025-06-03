package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import io.meduza.meduza.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import l.j;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: i, reason: collision with root package name */
    public static q0 f9444i;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap<Context, r.i<ColorStateList>> f9446a;

    /* renamed from: b, reason: collision with root package name */
    public r.h<String, e> f9447b;

    /* renamed from: c, reason: collision with root package name */
    public r.i<String> f9448c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap<Context, r.e<WeakReference<Drawable.ConstantState>>> f9449d = new WeakHashMap<>(0);

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f9450e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public f f9451g;

    /* renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f9443h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    public static final c f9445j = new c();

    public static class a implements e {
        @Override // l.q0.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return h.a.g(context, theme, context.getResources(), attributeSet, xmlResourceParser);
            } catch (Exception e10) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                return null;
            }
        }
    }

    public static class b implements e {
        @Override // l.q0.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                a2.b bVar = new a2.b(context);
                bVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                return bVar;
            } catch (Exception e10) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                return null;
            }
        }
    }

    public static class c extends r.f<Integer, PorterDuffColorFilter> {
        public c() {
            super(6);
        }
    }

    public static class d implements e {
        @Override // l.q0.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute == null) {
                return null;
            }
            try {
                Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                i.b.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                return drawable;
            } catch (Exception e10) {
                Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                return null;
            }
        }
    }

    public interface e {
        Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface f {
    }

    public static class g implements e {
        @Override // l.q0.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                a2.f fVar = new a2.f();
                fVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                return fVar;
            } catch (Exception e10) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                return null;
            }
        }
    }

    public static synchronized q0 d() {
        q0 q0Var;
        synchronized (q0.class) {
            if (f9444i == null) {
                q0 q0Var2 = new q0();
                f9444i = q0Var2;
                j(q0Var2);
            }
            q0Var = f9444i;
        }
        return q0Var;
    }

    public static synchronized PorterDuffColorFilter h(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (q0.class) {
            c cVar = f9445j;
            cVar.getClass();
            int i11 = (i10 + 31) * 31;
            porterDuffColorFilter = cVar.get(Integer.valueOf(mode.hashCode() + i11));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
                cVar.getClass();
                cVar.put(Integer.valueOf(mode.hashCode() + i11), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(q0 q0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            q0Var.a("vector", new g());
            q0Var.a("animated-vector", new b());
            q0Var.a("animated-selector", new a());
            q0Var.a("drawable", new d());
        }
    }

    public final void a(String str, e eVar) {
        if (this.f9447b == null) {
            this.f9447b = new r.h<>();
        }
        this.f9447b.put(str, eVar);
    }

    public final synchronized void b(Context context, long j10, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            r.e<WeakReference<Drawable.ConstantState>> eVar = this.f9449d.get(context);
            if (eVar == null) {
                eVar = new r.e<>();
                this.f9449d.put(context, eVar);
            }
            eVar.e(new WeakReference(constantState), j10);
        }
    }

    public final Drawable c(Context context, int i10) {
        int i11;
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        if (this.f9450e == null) {
            this.f9450e = new TypedValue();
        }
        TypedValue typedValue = this.f9450e;
        context.getResources().getValue(i10, typedValue, true);
        long j10 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e10 = e(context, j10);
        if (e10 != null) {
            return e10;
        }
        LayerDrawable layerDrawable = null;
        if (this.f9451g != null) {
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, com.pichillilorenzo.flutter_inappwebview_android.R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else {
                if (i10 == R.drawable.abc_ratingbar_material) {
                    i11 = R.dimen.abc_star_big;
                } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                    i11 = R.dimen.abc_star_medium;
                } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                    i11 = R.dimen.abc_star_small;
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(i11);
                Drawable f10 = f(context, R.drawable.abc_star_black_48dp);
                Drawable f11 = f(context, R.drawable.abc_star_half_black_48dp);
                if ((f10 instanceof BitmapDrawable) && f10.getIntrinsicWidth() == dimensionPixelSize && f10.getIntrinsicHeight() == dimensionPixelSize) {
                    bitmapDrawable = (BitmapDrawable) f10;
                    bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    f10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                    f10.draw(canvas);
                    bitmapDrawable = new BitmapDrawable(createBitmap);
                    bitmapDrawable2 = new BitmapDrawable(createBitmap);
                }
                bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
                if ((f11 instanceof BitmapDrawable) && f11.getIntrinsicWidth() == dimensionPixelSize && f11.getIntrinsicHeight() == dimensionPixelSize) {
                    bitmapDrawable3 = (BitmapDrawable) f11;
                } else {
                    Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap2);
                    f11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                    f11.draw(canvas2);
                    bitmapDrawable3 = new BitmapDrawable(createBitmap2);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
                layerDrawable2.setId(0, android.R.id.background);
                layerDrawable2.setId(1, android.R.id.secondaryProgress);
                layerDrawable2.setId(2, android.R.id.progress);
                layerDrawable = layerDrawable2;
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j10, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j10) {
        r.e<WeakReference<Drawable.ConstantState>> eVar = this.f9449d.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) eVar.d(null, j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int k10 = b.a0.k(eVar.f13477b, eVar.f13479d, j10);
            if (k10 >= 0) {
                Object[] objArr = eVar.f13478c;
                Object obj = objArr[k10];
                Object obj2 = r.e.f13475e;
                if (obj != obj2) {
                    objArr[k10] = obj2;
                    eVar.f13476a = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i10) {
        return g(context, i10, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x002b, code lost:
    
        if (r0 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0113, code lost:
    
        y.a.C0261a.i(r13, r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ea A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:6:0x002d, B:8:0x0032, B:10:0x0038, B:12:0x003e, B:15:0x004c, B:18:0x005d, B:20:0x0061, B:21:0x0068, B:25:0x00ea, B:27:0x00f0, B:29:0x00f6, B:31:0x00fc, B:35:0x0113, B:40:0x010f, B:41:0x0119, B:45:0x0130, B:56:0x0166, B:57:0x0190, B:62:0x019d, B:66:0x0082, B:68:0x0086, B:71:0x0092, B:72:0x009a, B:78:0x00a6, B:80:0x00b9, B:82:0x00c3, B:83:0x00cf, B:84:0x00d6, B:87:0x00d8, B:89:0x00e1, B:90:0x0056, B:92:0x0008, B:94:0x0013, B:96:0x0017, B:102:0x01a2, B:103:0x01ab), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f0 A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:6:0x002d, B:8:0x0032, B:10:0x0038, B:12:0x003e, B:15:0x004c, B:18:0x005d, B:20:0x0061, B:21:0x0068, B:25:0x00ea, B:27:0x00f0, B:29:0x00f6, B:31:0x00fc, B:35:0x0113, B:40:0x010f, B:41:0x0119, B:45:0x0130, B:56:0x0166, B:57:0x0190, B:62:0x019d, B:66:0x0082, B:68:0x0086, B:71:0x0092, B:72:0x009a, B:78:0x00a6, B:80:0x00b9, B:82:0x00c3, B:83:0x00cf, B:84:0x00d6, B:87:0x00d8, B:89:0x00e1, B:90:0x0056, B:92:0x0008, B:94:0x0013, B:96:0x0017, B:102:0x01a2, B:103:0x01ab), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f6 A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:6:0x002d, B:8:0x0032, B:10:0x0038, B:12:0x003e, B:15:0x004c, B:18:0x005d, B:20:0x0061, B:21:0x0068, B:25:0x00ea, B:27:0x00f0, B:29:0x00f6, B:31:0x00fc, B:35:0x0113, B:40:0x010f, B:41:0x0119, B:45:0x0130, B:56:0x0166, B:57:0x0190, B:62:0x019d, B:66:0x0082, B:68:0x0086, B:71:0x0092, B:72:0x009a, B:78:0x00a6, B:80:0x00b9, B:82:0x00c3, B:83:0x00cf, B:84:0x00d6, B:87:0x00d8, B:89:0x00e1, B:90:0x0056, B:92:0x0008, B:94:0x0013, B:96:0x0017, B:102:0x01a2, B:103:0x01ab), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019d A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:6:0x002d, B:8:0x0032, B:10:0x0038, B:12:0x003e, B:15:0x004c, B:18:0x005d, B:20:0x0061, B:21:0x0068, B:25:0x00ea, B:27:0x00f0, B:29:0x00f6, B:31:0x00fc, B:35:0x0113, B:40:0x010f, B:41:0x0119, B:45:0x0130, B:56:0x0166, B:57:0x0190, B:62:0x019d, B:66:0x0082, B:68:0x0086, B:71:0x0092, B:72:0x009a, B:78:0x00a6, B:80:0x00b9, B:82:0x00c3, B:83:0x00cf, B:84:0x00d6, B:87:0x00d8, B:89:0x00e1, B:90:0x0056, B:92:0x0008, B:94:0x0013, B:96:0x0017, B:102:0x01a2, B:103:0x01ab), top: B:2:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.drawable.Drawable g(android.content.Context r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.q0.g(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized ColorStateList i(Context context, int i10) {
        ColorStateList colorStateList;
        r.i<ColorStateList> iVar;
        try {
            WeakHashMap<Context, r.i<ColorStateList>> weakHashMap = this.f9446a;
            ColorStateList colorStateList2 = null;
            colorStateList = (weakHashMap == null || (iVar = weakHashMap.get(context)) == null) ? null : (ColorStateList) iVar.c(i10, null);
            if (colorStateList == null) {
                f fVar = this.f9451g;
                if (fVar != null) {
                    colorStateList2 = ((j.a) fVar).c(context, i10);
                }
                if (colorStateList2 != null) {
                    if (this.f9446a == null) {
                        this.f9446a = new WeakHashMap<>();
                    }
                    r.i<ColorStateList> iVar2 = this.f9446a.get(context);
                    if (iVar2 == null) {
                        iVar2 = new r.i<>();
                        this.f9446a.put(context, iVar2);
                    }
                    iVar2.a(i10, colorStateList2);
                }
                colorStateList = colorStateList2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            l.q0$f r0 = r7.f9451g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L72
            l.j$a r0 = (l.j.a) r0
            android.graphics.PorterDuff$Mode r3 = l.j.f9358b
            int[] r4 = r0.f9361a
            boolean r4 = l.j.a.a(r4, r9)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L1a
            r5 = 2130968676(0x7f040064, float:1.7546012E38)
            goto L46
        L1a:
            int[] r4 = r0.f9363c
            boolean r4 = l.j.a.a(r4, r9)
            if (r4 == 0) goto L26
            r5 = 2130968674(0x7f040062, float:1.7546008E38)
            goto L46
        L26:
            int[] r0 = r0.f9364d
            boolean r0 = l.j.a.a(r0, r9)
            if (r0 == 0) goto L31
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L46
        L31:
            r0 = 2131230757(0x7f080025, float:1.8077576E38)
            if (r9 != r0) goto L41
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L48
        L41:
            r0 = 2131230739(0x7f080013, float:1.807754E38)
            if (r9 != r0) goto L4a
        L46:
            r9 = r5
            r0 = r6
        L48:
            r4 = r1
            goto L4d
        L4a:
            r9 = r2
            r4 = r9
            r0 = r6
        L4d:
            if (r4 == 0) goto L6e
            int[] r4 = l.i0.f9356a
            android.graphics.drawable.Drawable r10 = r10.mutate()
            int r8 = l.u0.c(r8, r9)
            java.lang.Class<l.j> r9 = l.j.class
            monitor-enter(r9)
            android.graphics.PorterDuffColorFilter r8 = h(r8, r3)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r9)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L69
            r10.setAlpha(r0)
        L69:
            r8 = r1
            goto L6f
        L6b:
            r8 = move-exception
            monitor-exit(r9)
            throw r8
        L6e:
            r8 = r2
        L6f:
            if (r8 == 0) goto L72
            goto L73
        L72:
            r1 = r2
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.q0.k(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
