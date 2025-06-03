// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.core.graphics.drawable;

import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import android.os.Build$VERSION;
import android.graphics.drawable.Icon;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;
import java.io.InputStream;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.content.res.Resources$NotFoundException;
import android.content.res.Resources;
import H.c;
import android.graphics.Shader;
import android.graphics.Matrix;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.graphics.PorterDuff$Mode;
import androidx.versionedparcelable.CustomVersionedParcelable;

public class IconCompat extends CustomVersionedParcelable
{
    public static final PorterDuff$Mode k;
    public int a;
    public Object b;
    public byte[] c;
    public Parcelable d;
    public int e;
    public int f;
    public ColorStateList g;
    public PorterDuff$Mode h;
    public String i;
    public String j;
    
    static {
        k = PorterDuff$Mode.SRC_IN;
    }
    
    public IconCompat() {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = IconCompat.k;
        this.i = null;
    }
    
    public IconCompat(final int a) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = IconCompat.k;
        this.i = null;
        this.a = a;
    }
    
    public static Bitmap c(final Bitmap bitmap, final boolean b) {
        final int n = (int)(Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        final Bitmap bitmap2 = Bitmap.createBitmap(n, n, Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap2);
        final Paint paint = new Paint(3);
        final float n2 = (float)n;
        final float n3 = 0.5f * n2;
        final float n4 = 0.9166667f * n3;
        if (b) {
            final float n5 = 0.010416667f * n2;
            paint.setColor(0);
            paint.setShadowLayer(n5, 0.0f, n2 * 0.020833334f, 1023410176);
            canvas.drawCircle(n3, n3, n4, paint);
            paint.setShadowLayer(n5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(n3, n3, n4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        final Shader$TileMode clamp = Shader$TileMode.CLAMP;
        final BitmapShader shader = new BitmapShader(bitmap, clamp, clamp);
        final Matrix localMatrix = new Matrix();
        localMatrix.setTranslate(-(bitmap.getWidth() - n) / 2.0f, -(bitmap.getHeight() - n) / 2.0f);
        ((Shader)shader).setLocalMatrix(localMatrix);
        paint.setShader((Shader)shader);
        canvas.drawCircle(n3, n3, n4, paint);
        canvas.setBitmap((Bitmap)null);
        return bitmap2;
    }
    
    public static IconCompat d(final Bitmap b) {
        H.c.c(b);
        final IconCompat iconCompat = new IconCompat(1);
        iconCompat.b = b;
        return iconCompat;
    }
    
    public static IconCompat e(final Resources resources, final String s, final int e) {
        H.c.c(s);
        Label_0061: {
            if (e == 0) {
                break Label_0061;
            }
            final IconCompat iconCompat = new IconCompat(2);
            iconCompat.e = e;
            Label_0049: {
                if (resources == null) {
                    break Label_0049;
                }
            Label_0039_Outer:
                while (true) {
                    while (true) {
                        try {
                            iconCompat.b = resources.getResourceName(e);
                            while (true) {
                                iconCompat.j = s;
                                return iconCompat;
                                iconCompat.b = s;
                                continue Label_0039_Outer;
                            }
                            throw new IllegalArgumentException("Drawable resource ID must not be 0");
                            throw new IllegalArgumentException("Icon resource cannot be found");
                        }
                        catch (Resources$NotFoundException ex) {}
                        continue;
                    }
                }
            }
        }
    }
    
    public static String p(final int n) {
        switch (n) {
            default: {
                return "UNKNOWN";
            }
            case 6: {
                return "URI_MASKABLE";
            }
            case 5: {
                return "BITMAP_MASKABLE";
            }
            case 4: {
                return "URI";
            }
            case 3: {
                return "DATA";
            }
            case 2: {
                return "RESOURCE";
            }
            case 1: {
                return "BITMAP";
            }
        }
    }
    
    public Bitmap f() {
        final int a = this.a;
        if (a == -1) {
            final Object b = this.b;
            if (b instanceof Bitmap) {
                return (Bitmap)b;
            }
            return null;
        }
        else {
            if (a == 1) {
                return (Bitmap)this.b;
            }
            if (a == 5) {
                return c((Bitmap)this.b, true);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("called getBitmap() on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public int g() {
        final int a = this.a;
        if (a == -1) {
            return IconCompat.a.a(this.b);
        }
        if (a == 2) {
            return this.e;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("called getResId() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }
    
    public String h() {
        final int a = this.a;
        if (a == -1) {
            return IconCompat.a.b(this.b);
        }
        if (a != 2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("called getResPackage() on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
        final String j = this.j;
        if (j != null && !TextUtils.isEmpty((CharSequence)j)) {
            return this.j;
        }
        return ((String)this.b).split(":", -1)[0];
    }
    
    public int i() {
        int n;
        if ((n = this.a) == -1) {
            n = IconCompat.a.c(this.b);
        }
        return n;
    }
    
    public Uri j() {
        final int a = this.a;
        if (a == -1) {
            return IconCompat.a.d(this.b);
        }
        if (a != 4 && a != 6) {
            final StringBuilder sb = new StringBuilder();
            sb.append("called getUri() on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
        return Uri.parse((String)this.b);
    }
    
    public InputStream k(final Context context) {
        final Uri j = this.j();
        final String scheme = j.getScheme();
        Label_0100: {
            if ("content".equals(scheme)) {
                break Label_0100;
            }
            if ("file".equals(scheme)) {
                break Label_0100;
            }
            StringBuilder sb;
            String str;
            try {
                return new FileInputStream(new File((String)this.b));
            }
            catch (FileNotFoundException ex) {
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
            }
            while (true) {
                sb.append(str);
                sb.append(j);
                final FileNotFoundException ex;
                Log.w("IconCompat", sb.toString(), (Throwable)ex);
                return null;
                try {
                    return context.getContentResolver().openInputStream(j);
                }
                catch (Exception ex) {
                    sb = new StringBuilder();
                    str = "Unable to load image from URI: ";
                    continue;
                }
                break;
            }
        }
        return null;
    }
    
    public void l() {
        this.h = PorterDuff$Mode.valueOf(this.i);
        Parcelable b2 = null;
        switch (this.a) {
            default: {
                return;
            }
            case 3: {
                this.b = this.c;
                return;
            }
            case 2:
            case 4:
            case 6: {
                final String b = new String(this.c, Charset.forName("UTF-16"));
                this.b = b;
                if (this.a == 2 && this.j == null) {
                    this.j = b.split(":", -1)[0];
                }
                return;
            }
            case 1:
            case 5: {
                b2 = this.d;
                if (b2 != null) {
                    break;
                }
                final byte[] c = this.c;
                this.b = c;
                this.a = 3;
                this.e = 0;
                this.f = c.length;
                return;
            }
            case -1: {
                b2 = this.d;
                if (b2 != null) {
                    break;
                }
                throw new IllegalArgumentException("Invalid icon");
            }
        }
        this.b = b2;
    }
    
    public void m(final boolean b) {
        this.i = ((Enum)this.h).name();
        switch (this.a) {
            default: {
                return;
            }
            case 4:
            case 6: {
                this.c = this.b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            }
            case 3: {
                this.c = (byte[])this.b;
                return;
            }
            case 2: {
                this.c = ((String)this.b).getBytes(Charset.forName("UTF-16"));
                return;
            }
            case 1:
            case 5: {
                if (b) {
                    final Bitmap bitmap = (Bitmap)this.b;
                    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap$CompressFormat.PNG, 90, (OutputStream)byteArrayOutputStream);
                    this.c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            }
            case -1: {
                if (!b) {
                    break;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            }
        }
        this.d = (Parcelable)this.b;
    }
    
    public Icon n() {
        return this.o(null);
    }
    
    public Icon o(final Context context) {
        return IconCompat.a.f(this, context);
    }
    
    @Override
    public String toString() {
        if (this.a == -1) {
            return String.valueOf(this.b);
        }
        final StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(p(this.a));
        Label_0247: {
            int i = 0;
            switch (this.a) {
                default: {
                    break Label_0247;
                }
                case 4:
                case 6: {
                    sb.append(" uri=");
                    sb.append(this.b);
                    break Label_0247;
                }
                case 3: {
                    sb.append(" len=");
                    sb.append(this.e);
                    if (this.f != 0) {
                        sb.append(" off=");
                        i = this.f;
                        break;
                    }
                    break Label_0247;
                }
                case 2: {
                    sb.append(" pkg=");
                    sb.append(this.j);
                    sb.append(" id=");
                    sb.append(String.format("0x%08x", this.g()));
                    break Label_0247;
                }
                case 1:
                case 5: {
                    sb.append(" size=");
                    sb.append(((Bitmap)this.b).getWidth());
                    sb.append("x");
                    i = ((Bitmap)this.b).getHeight();
                    break;
                }
            }
            sb.append(i);
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.h != IconCompat.k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }
    
    public abstract static class a
    {
        public static int a(final Object obj) {
            if (Build$VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            Label_0077: {
                Label_0066: {
                    try {
                        return (int)obj.getClass().getMethod("getResId", (Class<?>[])new Class[0]).invoke(obj, new Object[0]);
                    }
                    catch (NoSuchMethodException ex) {}
                    catch (InvocationTargetException ex2) {
                        break Label_0066;
                    }
                    catch (IllegalAccessException ex3) {
                        break Label_0077;
                    }
                    final NoSuchMethodException ex;
                    Log.e("IconCompat", "Unable to get icon resource", (Throwable)ex);
                    return 0;
                }
                final InvocationTargetException ex2;
                Log.e("IconCompat", "Unable to get icon resource", (Throwable)ex2);
                return 0;
            }
            final IllegalAccessException ex3;
            Log.e("IconCompat", "Unable to get icon resource", (Throwable)ex3);
            return 0;
        }
        
        public static String b(final Object obj) {
            if (Build$VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            Label_0074: {
                Label_0063: {
                    try {
                        return (String)obj.getClass().getMethod("getResPackage", (Class<?>[])new Class[0]).invoke(obj, new Object[0]);
                    }
                    catch (NoSuchMethodException ex) {}
                    catch (InvocationTargetException ex2) {
                        break Label_0063;
                    }
                    catch (IllegalAccessException ex3) {
                        break Label_0074;
                    }
                    final NoSuchMethodException ex;
                    Log.e("IconCompat", "Unable to get icon package", (Throwable)ex);
                    return null;
                }
                final InvocationTargetException ex2;
                Log.e("IconCompat", "Unable to get icon package", (Throwable)ex2);
                return null;
            }
            final IllegalAccessException ex3;
            Log.e("IconCompat", "Unable to get icon package", (Throwable)ex3);
            return null;
        }
        
        public static int c(final Object o) {
            if (Build$VERSION.SDK_INT >= 28) {
                return c.c(o);
            }
            while (true) {
                Label_0100: {
                    Label_0089: {
                        try {
                            return (int)o.getClass().getMethod("getType", (Class<?>[])new Class[0]).invoke(o, new Object[0]);
                        }
                        catch (NoSuchMethodException ex) {}
                        catch (InvocationTargetException ex) {
                            break Label_0089;
                        }
                        catch (IllegalAccessException ex) {
                            break Label_0100;
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unable to get icon type ");
                        sb.append(o);
                        final NoSuchMethodException ex;
                        Log.e("IconCompat", sb.toString(), (Throwable)ex);
                        return -1;
                    }
                    final StringBuilder sb = new StringBuilder();
                    continue;
                }
                final StringBuilder sb = new StringBuilder();
                continue;
            }
        }
        
        public static Uri d(@NonNull final Object obj) {
            if (Build$VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            Label_0074: {
                Label_0063: {
                    try {
                        return (Uri)obj.getClass().getMethod("getUri", (Class<?>[])new Class[0]).invoke(obj, new Object[0]);
                    }
                    catch (NoSuchMethodException ex) {}
                    catch (InvocationTargetException ex2) {
                        break Label_0063;
                    }
                    catch (IllegalAccessException ex3) {
                        break Label_0074;
                    }
                    final NoSuchMethodException ex;
                    Log.e("IconCompat", "Unable to get icon uri", (Throwable)ex);
                    return null;
                }
                final InvocationTargetException ex2;
                Log.e("IconCompat", "Unable to get icon uri", (Throwable)ex2);
                return null;
            }
            final IllegalAccessException ex3;
            Log.e("IconCompat", "Unable to get icon uri", (Throwable)ex3);
            return null;
        }
        
        public static Drawable e(final Icon icon, final Context context) {
            return icon.loadDrawable(context);
        }
        
        public static Icon f(final IconCompat iconCompat, final Context context) {
            Icon icon = null;
            Label_0296: {
                Bitmap c = null;
                Label_0124: {
                    Bitmap decodeStream = null;
                    Label_0118: {
                        Bitmap bitmap = null;
                        switch (iconCompat.a) {
                            default: {
                                throw new IllegalArgumentException("Unknown type");
                            }
                            case 6: {
                                final int sdk_INT = Build$VERSION.SDK_INT;
                                if (sdk_INT >= 30) {
                                    icon = d.a(iconCompat.j());
                                    break Label_0296;
                                }
                                if (context == null) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Context is required to resolve the file uri of the icon: ");
                                    sb.append(iconCompat.j());
                                    throw new IllegalArgumentException(sb.toString());
                                }
                                final InputStream k = iconCompat.k(context);
                                if (k == null) {
                                    final StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Cannot load adaptive icon from uri: ");
                                    sb2.append(iconCompat.j());
                                    throw new IllegalStateException(sb2.toString());
                                }
                                bitmap = (decodeStream = BitmapFactory.decodeStream(k));
                                if (sdk_INT >= 26) {
                                    break;
                                }
                                break Label_0118;
                            }
                            case 5: {
                                if (Build$VERSION.SDK_INT >= 26) {
                                    bitmap = (Bitmap)iconCompat.b;
                                    break;
                                }
                                decodeStream = (Bitmap)iconCompat.b;
                                break Label_0118;
                            }
                            case 4: {
                                icon = Icon.createWithContentUri((String)iconCompat.b);
                                break Label_0296;
                            }
                            case 3: {
                                icon = Icon.createWithData((byte[])iconCompat.b, iconCompat.e, iconCompat.f);
                                break Label_0296;
                            }
                            case 2: {
                                icon = Icon.createWithResource(iconCompat.h(), iconCompat.e);
                                break Label_0296;
                            }
                            case 1: {
                                c = (Bitmap)iconCompat.b;
                                break Label_0124;
                            }
                            case -1: {
                                return (Icon)iconCompat.b;
                            }
                        }
                        icon = b.b(bitmap);
                        break Label_0296;
                    }
                    c = IconCompat.c(decodeStream, false);
                }
                icon = Icon.createWithBitmap(c);
            }
            final ColorStateList g = iconCompat.g;
            if (g != null) {
                icon.setTintList(g);
            }
            final PorterDuff$Mode h = iconCompat.h;
            if (h != IconCompat.k) {
                icon.setTintMode(h);
            }
            return icon;
        }
    }
    
    public abstract static class b
    {
        public static Drawable a(final Drawable drawable, final Drawable drawable2) {
            return (Drawable)new AdaptiveIconDrawable(drawable, drawable2);
        }
        
        public static Icon b(final Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }
    
    public abstract static class c
    {
        public static int a(final Object o) {
            return ((Icon)o).getResId();
        }
        
        public static String b(final Object o) {
            return ((Icon)o).getResPackage();
        }
        
        public static int c(final Object o) {
            return ((Icon)o).getType();
        }
        
        public static Uri d(final Object o) {
            return ((Icon)o).getUri();
        }
    }
    
    public abstract static class d
    {
        public static Icon a(final Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }
}
