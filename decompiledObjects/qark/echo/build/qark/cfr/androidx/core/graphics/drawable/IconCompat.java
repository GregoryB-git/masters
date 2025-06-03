/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapShader
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.drawable.AdaptiveIconDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Icon
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.Log
 *  java.io.ByteArrayOutputStream
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileNotFoundException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.nio.charset.Charset
 */
package androidx.core.graphics.drawable;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;

public class IconCompat
extends CustomVersionedParcelable {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
    public int a;
    public Object b;
    public byte[] c;
    public Parcelable d;
    public int e;
    public int f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public String i;
    public String j;

    public IconCompat() {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = k;
        this.i = null;
    }

    public IconCompat(int n8) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = k;
        this.i = null;
        this.a = n8;
    }

    public static Bitmap c(Bitmap bitmap, boolean bl) {
        int n8 = (int)((float)Math.min((int)bitmap.getWidth(), (int)bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmap2 = Bitmap.createBitmap((int)n8, (int)n8, (Bitmap.Config)Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap2);
        Paint paint = new Paint(3);
        float f8 = n8;
        float f9 = 0.5f * f8;
        float f10 = 0.9166667f * f9;
        if (bl) {
            float f11 = 0.010416667f * f8;
            paint.setColor(0);
            paint.setShadowLayer(f11, 0.0f, f8 * 0.020833334f, 1023410176);
            canvas.drawCircle(f9, f9, f10, paint);
            paint.setShadowLayer(f11, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f9, f9, f10, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        tileMode = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float)(- bitmap.getWidth() - n8) / 2.0f, (float)(- bitmap.getHeight() - n8) / 2.0f);
        tileMode.setLocalMatrix(matrix);
        paint.setShader((Shader)tileMode);
        canvas.drawCircle(f9, f9, f10, paint);
        canvas.setBitmap(null);
        return bitmap2;
    }

    public static IconCompat d(Bitmap bitmap) {
        H.c.c((Object)bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.b = bitmap;
        return iconCompat;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static IconCompat e(Resources resources, String string2, int n8) {
        H.c.c(string2);
        if (n8 == 0) throw new IllegalArgumentException("Drawable resource ID must not be 0");
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.e = n8;
        if (resources != null) {
            iconCompat.b = resources.getResourceName(n8);
        } else {
            iconCompat.b = string2;
        }
        iconCompat.j = string2;
        return iconCompat;
        catch (Resources.NotFoundException notFoundException) {
            throw new IllegalArgumentException("Icon resource cannot be found");
        }
    }

    public static String p(int n8) {
        switch (n8) {
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
            case 1: 
        }
        return "BITMAP";
    }

    public Bitmap f() {
        int n8 = this.a;
        if (n8 == -1) {
            Object object = this.b;
            if (object instanceof Bitmap) {
                return (Bitmap)object;
            }
            return null;
        }
        if (n8 == 1) {
            return (Bitmap)this.b;
        }
        if (n8 == 5) {
            return IconCompat.c((Bitmap)this.b, true);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("called getBitmap() on ");
        stringBuilder.append((Object)this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public int g() {
        int n8 = this.a;
        if (n8 == -1) {
            return a.a(this.b);
        }
        if (n8 == 2) {
            return this.e;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("called getResId() on ");
        stringBuilder.append((Object)this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public String h() {
        int n8 = this.a;
        if (n8 == -1) {
            return a.b(this.b);
        }
        if (n8 == 2) {
            String string2 = this.j;
            if (string2 != null && !TextUtils.isEmpty((CharSequence)string2)) {
                return this.j;
            }
            return ((String)this.b).split(":", -1)[0];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("called getResPackage() on ");
        stringBuilder.append((Object)this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public int i() {
        int n8;
        int n9 = n8 = this.a;
        if (n8 == -1) {
            n9 = a.c(this.b);
        }
        return n9;
    }

    public Uri j() {
        int n8 = this.a;
        if (n8 == -1) {
            return a.d(this.b);
        }
        if (n8 != 4 && n8 != 6) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("called getUri() on ");
            stringBuilder.append((Object)this);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return Uri.parse((String)((String)this.b));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public InputStream k(Context var1_1) {
        var4_2 = this.j();
        var2_3 = var4_2.getScheme();
        if ("content".equals((Object)var2_3) || "file".equals((Object)var2_3)) ** GOTO lbl10
        try {
            return new FileInputStream(new File((String)this.b));
        }
        catch (FileNotFoundException var3_4) {
            block4 : {
                var1_1 = new StringBuilder();
                var2_3 = "Unable to load image from path: ";
                break block4;
lbl10: // 1 sources:
                try {
                    return var1_1.getContentResolver().openInputStream(var4_2);
                }
                catch (Exception var3_6) {
                    var1_1 = new StringBuilder();
                    var2_3 = "Unable to load image from URI: ";
                }
            }
            var1_1.append(var2_3);
            var1_1.append((Object)var4_2);
            Log.w((String)"IconCompat", (String)var1_1.toString(), (Throwable)var3_5);
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void l() {
        byte[] arrby;
        this.h = PorterDuff.Mode.valueOf((String)this.i);
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
                String string2 = new String(this.c, Charset.forName((String)"UTF-16"));
                this.b = string2;
                if (this.a != 2 || this.j != null) return;
                {
                    this.j = string2.split(":", -1)[0];
                    return;
                }
            }
            case 1: 
            case 5: {
                arrby = this.d;
                if (arrby != null) break;
                this.b = arrby = this.c;
                this.a = 3;
                this.e = 0;
                this.f = arrby.length;
                return;
            }
            case -1: {
                arrby = this.d;
                if (arrby == null) throw new IllegalArgumentException("Invalid icon");
            }
        }
        this.b = arrby;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void m(boolean bl) {
        this.i = this.h.name();
        switch (this.a) {
            default: {
                return;
            }
            case 4: 
            case 6: {
                this.c = this.b.toString().getBytes(Charset.forName((String)"UTF-16"));
                return;
            }
            case 3: {
                this.c = (byte[])this.b;
                return;
            }
            case 2: {
                this.c = ((String)this.b).getBytes(Charset.forName((String)"UTF-16"));
                return;
            }
            case 1: 
            case 5: {
                if (!bl) break;
                Bitmap bitmap = (Bitmap)this.b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, (OutputStream)byteArrayOutputStream);
                this.c = byteArrayOutputStream.toByteArray();
                return;
            }
            case -1: {
                if (!bl) break;
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            }
        }
        this.d = (Parcelable)this.b;
    }

    public Icon n() {
        return this.o(null);
    }

    public Icon o(Context context) {
        return a.f(this, context);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public String toString() {
        block10 : {
            if (this.a == -1) {
                return String.valueOf((Object)this.b);
            }
            var2_1 = new StringBuilder("Icon(typ=");
            var2_1.append(IconCompat.p(this.a));
            switch (this.a) {
                default: {
                    ** break;
                }
                case 4: 
                case 6: {
                    var2_1.append(" uri=");
                    var2_1.append(this.b);
                    ** break;
                }
                case 3: {
                    var2_1.append(" len=");
                    var2_1.append(this.e);
                    if (this.f != 0) {
                        var2_1.append(" off=");
                        var1_2 = this.f;
                        break;
                    }
                    break block10;
                }
                case 2: {
                    var2_1.append(" pkg=");
                    var2_1.append(this.j);
                    var2_1.append(" id=");
                    var2_1.append(String.format((String)"0x%08x", (Object[])new Object[]{this.g()}));
                    ** break;
                }
                case 1: 
                case 5: {
                    var2_1.append(" size=");
                    var2_1.append(((Bitmap)this.b).getWidth());
                    var2_1.append("x");
                    var1_2 = ((Bitmap)this.b).getHeight();
                }
            }
            var2_1.append(var1_2);
            ** break;
        }
        if (this.g != null) {
            var2_1.append(" tint=");
            var2_1.append((Object)this.g);
        }
        if (this.h != IconCompat.k) {
            var2_1.append(" mode=");
            var2_1.append((Object)this.h);
        }
        var2_1.append(")");
        return var2_1.toString();
    }

    public static abstract class a {
        public static int a(Object object) {
            IllegalAccessException illegalAccessException2;
            block6 : {
                InvocationTargetException invocationTargetException2;
                block5 : {
                    if (Build.VERSION.SDK_INT >= 28) {
                        return c.a(object);
                    }
                    try {
                        int n8 = (Integer)object.getClass().getMethod("getResId", new Class[0]).invoke(object, new Object[0]);
                        return n8;
                    }
                    catch (NoSuchMethodException noSuchMethodException) {
                    }
                    catch (InvocationTargetException invocationTargetException2) {
                        break block5;
                    }
                    catch (IllegalAccessException illegalAccessException2) {
                        break block6;
                    }
                    Log.e((String)"IconCompat", (String)"Unable to get icon resource", (Throwable)noSuchMethodException);
                    return 0;
                }
                Log.e((String)"IconCompat", (String)"Unable to get icon resource", (Throwable)invocationTargetException2);
                return 0;
            }
            Log.e((String)"IconCompat", (String)"Unable to get icon resource", (Throwable)illegalAccessException2);
            return 0;
        }

        public static String b(Object object) {
            IllegalAccessException illegalAccessException2;
            block6 : {
                InvocationTargetException invocationTargetException2;
                block5 : {
                    if (Build.VERSION.SDK_INT >= 28) {
                        return c.b(object);
                    }
                    try {
                        object = (String)object.getClass().getMethod("getResPackage", new Class[0]).invoke(object, new Object[0]);
                        return object;
                    }
                    catch (NoSuchMethodException noSuchMethodException) {
                    }
                    catch (InvocationTargetException invocationTargetException2) {
                        break block5;
                    }
                    catch (IllegalAccessException illegalAccessException2) {
                        break block6;
                    }
                    Log.e((String)"IconCompat", (String)"Unable to get icon package", (Throwable)noSuchMethodException);
                    return null;
                }
                Log.e((String)"IconCompat", (String)"Unable to get icon package", (Throwable)invocationTargetException2);
                return null;
            }
            Log.e((String)"IconCompat", (String)"Unable to get icon package", (Throwable)illegalAccessException2);
            return null;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static int c(Object object) {
            void var2_5;
            StringBuilder stringBuilder;
            block7 : {
                block6 : {
                    block5 : {
                        if (Build.VERSION.SDK_INT >= 28) {
                            return c.c(object);
                        }
                        try {
                            return (Integer)object.getClass().getMethod("getType", new Class[0]).invoke(object, new Object[0]);
                        }
                        catch (NoSuchMethodException noSuchMethodException) {
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            break block5;
                        }
                        catch (IllegalAccessException illegalAccessException) {
                            break block6;
                        }
                        stringBuilder = new StringBuilder();
                        break block7;
                    }
                    stringBuilder = new StringBuilder();
                    break block7;
                }
                stringBuilder = new StringBuilder();
            }
            stringBuilder.append("Unable to get icon type ");
            stringBuilder.append(object);
            Log.e((String)"IconCompat", (String)stringBuilder.toString(), (Throwable)var2_5);
            return -1;
        }

        public static Uri d(@NonNull Object object) {
            IllegalAccessException illegalAccessException2;
            block6 : {
                InvocationTargetException invocationTargetException2;
                block5 : {
                    if (Build.VERSION.SDK_INT >= 28) {
                        return c.d(object);
                    }
                    try {
                        object = (Uri)object.getClass().getMethod("getUri", new Class[0]).invoke(object, new Object[0]);
                        return object;
                    }
                    catch (NoSuchMethodException noSuchMethodException) {
                    }
                    catch (InvocationTargetException invocationTargetException2) {
                        break block5;
                    }
                    catch (IllegalAccessException illegalAccessException2) {
                        break block6;
                    }
                    Log.e((String)"IconCompat", (String)"Unable to get icon uri", (Throwable)noSuchMethodException);
                    return null;
                }
                Log.e((String)"IconCompat", (String)"Unable to get icon uri", (Throwable)invocationTargetException2);
                return null;
            }
            Log.e((String)"IconCompat", (String)"Unable to get icon uri", (Throwable)illegalAccessException2);
            return null;
        }

        public static Drawable e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public static Icon f(IconCompat var0, Context var1_1) {
            switch (var0.a) {
                default: {
                    throw new IllegalArgumentException("Unknown type");
                }
                case 6: {
                    var2_2 = Build.VERSION.SDK_INT;
                    if (var2_2 >= 30) {
                        var1_1 = d.a(var0.j());
                        ** break;
                    }
                    if (var1_1 == null) {
                        var1_1 = new StringBuilder();
                        var1_1.append("Context is required to resolve the file uri of the icon: ");
                        var1_1.append((Object)var0.j());
                        throw new IllegalArgumentException(var1_1.toString());
                    }
                    if ((var1_1 = var0.k(var1_1)) == null) {
                        var1_1 = new StringBuilder();
                        var1_1.append("Cannot load adaptive icon from uri: ");
                        var1_1.append((Object)var0.j());
                        throw new IllegalStateException(var1_1.toString());
                    }
                    var1_1 = BitmapFactory.decodeStream((InputStream)var1_1);
                    var3_3 = var1_1;
                    if (var2_2 < 26) ** GOTO lbl29
                    ** GOTO lbl26
                }
                case 5: {
                    if (Build.VERSION.SDK_INT < 26) ** GOTO lbl28
                    var1_1 = (Bitmap)var0.b;
lbl26: // 2 sources:
                    var1_1 = b.b((Bitmap)var1_1);
                    ** break;
lbl28: // 1 sources:
                    var3_3 = (Bitmap)var0.b;
lbl29: // 2 sources:
                    var1_1 = IconCompat.c(var3_3, false);
                    ** GOTO lbl42
                }
                case 4: {
                    var1_1 = Icon.createWithContentUri((String)((String)var0.b));
                    ** break;
                }
                case 3: {
                    var1_1 = Icon.createWithData((byte[])((byte[])var0.b), (int)var0.e, (int)var0.f);
                    ** break;
                }
                case 2: {
                    var1_1 = Icon.createWithResource((String)var0.h(), (int)var0.e);
                    ** break;
                }
                case 1: {
                    var1_1 = (Bitmap)var0.b;
lbl42: // 2 sources:
                    var1_1 = Icon.createWithBitmap((Bitmap)var1_1);
                    ** break;
lbl44: // 6 sources:
                    var3_3 = var0.g;
                    if (var3_3 != null) {
                        var1_1.setTintList((ColorStateList)var3_3);
                    }
                    if ((var0 = var0.h) == IconCompat.k) return var1_1;
                    var1_1.setTintMode((PorterDuff.Mode)var0);
                    return var1_1;
                }
                case -1: 
            }
            return (Icon)var0.b;
        }
    }

    public static abstract class b {
        public static Drawable a(Drawable drawable2, Drawable drawable3) {
            return new AdaptiveIconDrawable(drawable2, drawable3);
        }

        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap((Bitmap)bitmap);
        }
    }

    public static abstract class c {
        public static int a(Object object) {
            return ((Icon)object).getResId();
        }

        public static String b(Object object) {
            return ((Icon)object).getResPackage();
        }

        public static int c(Object object) {
            return ((Icon)object).getType();
        }

        public static Uri d(Object object) {
            return ((Icon)object).getUri();
        }
    }

    public static abstract class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri((Uri)uri);
        }
    }

}

