package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import l.b0;
import org.xmlpull.v1.XmlPullParserException;
import w.d;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9518a;

    /* renamed from: b, reason: collision with root package name */
    public final TypedArray f9519b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f9520c;

    public z0(Context context, TypedArray typedArray) {
        this.f9518a = context;
        this.f9519b = typedArray;
    }

    public static z0 m(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new z0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public final boolean a(int i10, boolean z10) {
        return this.f9519b.getBoolean(i10, z10);
    }

    public final ColorStateList b(int i10) {
        int resourceId;
        ColorStateList colorStateList;
        return (!this.f9519b.hasValue(i10) || (resourceId = this.f9519b.getResourceId(i10, 0)) == 0 || (colorStateList = v.a.getColorStateList(this.f9518a, resourceId)) == null) ? this.f9519b.getColorStateList(i10) : colorStateList;
    }

    public final int c(int i10, int i11) {
        return this.f9519b.getDimensionPixelOffset(i10, i11);
    }

    public final int d(int i10, int i11) {
        return this.f9519b.getDimensionPixelSize(i10, i11);
    }

    public final Drawable e(int i10) {
        int resourceId;
        return (!this.f9519b.hasValue(i10) || (resourceId = this.f9519b.getResourceId(i10, 0)) == 0) ? this.f9519b.getDrawable(i10) : x6.b.X(this.f9518a, resourceId);
    }

    public final Drawable f(int i10) {
        int resourceId;
        Drawable g10;
        if (!this.f9519b.hasValue(i10) || (resourceId = this.f9519b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        j a10 = j.a();
        Context context = this.f9518a;
        synchronized (a10) {
            g10 = a10.f9360a.g(context, resourceId, true);
        }
        return g10;
    }

    public final Typeface g(int i10, int i11, b0.a aVar) {
        StringBuilder sb2;
        String str;
        int resourceId = this.f9519b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f9520c == null) {
            this.f9520c = new TypedValue();
        }
        Context context = this.f9518a;
        TypedValue typedValue = this.f9520c;
        ThreadLocal<TypedValue> threadLocal = w.f.f16159a;
        if (context.isRestricted()) {
            return null;
        }
        Resources resources = context.getResources();
        resources.getValue(resourceId, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            StringBuilder l10 = defpackage.f.l("Resource \"");
            l10.append(resources.getResourceName(resourceId));
            l10.append("\" (");
            l10.append(Integer.toHexString(resourceId));
            l10.append(") is not a Font: ");
            l10.append(typedValue);
            throw new Resources.NotFoundException(l10.toString());
        }
        String charSequence2 = charSequence.toString();
        if (charSequence2.startsWith("res/")) {
            int i12 = typedValue.assetCookie;
            r.f<String, Typeface> fVar = x.e.f16499b;
            Typeface typeface = fVar.get(x.e.b(resources, resourceId, charSequence2, i12, i11));
            if (typeface != null) {
                aVar.b(typeface);
            } else {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        d.b a10 = w.d.a(resources.getXml(resourceId), resources);
                        if (a10 != null) {
                            return x.e.a(context, a10, resources, resourceId, charSequence2, typedValue.assetCookie, i11, aVar);
                        }
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        aVar.a();
                        return null;
                    }
                    int i13 = typedValue.assetCookie;
                    typeface = x.e.f16498a.d(context, resources, resourceId, charSequence2, i11);
                    if (typeface != null) {
                        fVar.put(x.e.b(resources, resourceId, charSequence2, i13, i11), typeface);
                    }
                    if (typeface != null) {
                        aVar.b(typeface);
                    } else {
                        aVar.a();
                    }
                } catch (IOException e10) {
                    e = e10;
                    sb2 = new StringBuilder();
                    str = "Failed to read xml resource ";
                    sb2.append(str);
                    sb2.append(charSequence2);
                    Log.e("ResourcesCompat", sb2.toString(), e);
                    aVar.a();
                    return null;
                } catch (XmlPullParserException e11) {
                    e = e11;
                    sb2 = new StringBuilder();
                    str = "Failed to parse xml resource ";
                    sb2.append(str);
                    sb2.append(charSequence2);
                    Log.e("ResourcesCompat", sb2.toString(), e);
                    aVar.a();
                    return null;
                }
            }
            return typeface;
        }
        aVar.a();
        return null;
    }

    public final int h(int i10, int i11) {
        return this.f9519b.getInt(i10, i11);
    }

    public final int i(int i10, int i11) {
        return this.f9519b.getResourceId(i10, i11);
    }

    public final String j(int i10) {
        return this.f9519b.getString(i10);
    }

    public final CharSequence k(int i10) {
        return this.f9519b.getText(i10);
    }

    public final boolean l(int i10) {
        return this.f9519b.hasValue(i10);
    }

    public final void n() {
        this.f9519b.recycle();
    }
}
