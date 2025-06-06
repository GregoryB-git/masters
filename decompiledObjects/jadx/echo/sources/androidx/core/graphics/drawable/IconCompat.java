package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
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
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f8832k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f8833a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8834b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f8835c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f8836d;

    /* renamed from: e, reason: collision with root package name */
    public int f8837e;

    /* renamed from: f, reason: collision with root package name */
    public int f8838f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f8839g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f8840h;

    /* renamed from: i, reason: collision with root package name */
    public String f8841i;

    /* renamed from: j, reason: collision with root package name */
    public String f8842j;

    public static class a {
        public static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e7) {
                Log.e("IconCompat", "Unable to get icon resource", e7);
                return 0;
            } catch (NoSuchMethodException e8) {
                Log.e("IconCompat", "Unable to get icon resource", e8);
                return 0;
            } catch (InvocationTargetException e9) {
                Log.e("IconCompat", "Unable to get icon resource", e9);
                return 0;
            }
        }

        public static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e7) {
                Log.e("IconCompat", "Unable to get icon package", e7);
                return null;
            } catch (NoSuchMethodException e8) {
                Log.e("IconCompat", "Unable to get icon package", e8);
                return null;
            } catch (InvocationTargetException e9) {
                Log.e("IconCompat", "Unable to get icon package", e9);
                return null;
            }
        }

        public static int c(Object obj) {
            StringBuilder sb;
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e7) {
                e = e7;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (NoSuchMethodException e8) {
                e = e8;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (InvocationTargetException e9) {
                e = e9;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            }
        }

        public static Uri d(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e7) {
                Log.e("IconCompat", "Unable to get icon uri", e7);
                return null;
            } catch (NoSuchMethodException e8) {
                Log.e("IconCompat", "Unable to get icon uri", e8);
                return null;
            } catch (InvocationTargetException e9) {
                Log.e("IconCompat", "Unable to get icon uri", e9);
                return null;
            }
        }

        public static Drawable e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
        
            if (r0 >= 26) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00b4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static android.graphics.drawable.Icon f(androidx.core.graphics.drawable.IconCompat r4, android.content.Context r5) {
            /*
                int r0 = r4.f8833a
                r1 = 0
                r2 = 26
                switch(r0) {
                    case -1: goto Lb8;
                    case 0: goto L8;
                    case 1: goto La2;
                    case 2: goto L97;
                    case 3: goto L8a;
                    case 4: goto L81;
                    case 5: goto L73;
                    case 6: goto L10;
                    default: goto L8;
                }
            L8:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Unknown type"
                r4.<init>(r5)
                throw r4
            L10:
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 30
                if (r0 < r3) goto L20
                android.net.Uri r5 = r4.j()
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.d.a(r5)
                goto La7
            L20:
                if (r5 == 0) goto L58
                java.io.InputStream r5 = r4.k(r5)
                if (r5 == 0) goto L3d
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
                if (r0 < r2) goto L34
            L2e:
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.b.b(r5)
                goto La7
            L34:
                android.graphics.Bitmap r5 = androidx.core.graphics.drawable.IconCompat.c(r5, r1)
            L38:
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
                goto La7
            L3d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot load adaptive icon from uri: "
                r0.append(r1)
                android.net.Uri r4 = r4.j()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L58:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
                r0.append(r1)
                android.net.Uri r4 = r4.j()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L73:
                int r5 = android.os.Build.VERSION.SDK_INT
                if (r5 < r2) goto L7c
                java.lang.Object r5 = r4.f8834b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                goto L2e
            L7c:
                java.lang.Object r5 = r4.f8834b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                goto L34
            L81:
                java.lang.Object r5 = r4.f8834b
                java.lang.String r5 = (java.lang.String) r5
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
                goto La7
            L8a:
                java.lang.Object r5 = r4.f8834b
                byte[] r5 = (byte[]) r5
                int r0 = r4.f8837e
                int r1 = r4.f8838f
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
                goto La7
            L97:
                java.lang.String r5 = r4.h()
                int r0 = r4.f8837e
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
                goto La7
            La2:
                java.lang.Object r5 = r4.f8834b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                goto L38
            La7:
                android.content.res.ColorStateList r0 = r4.f8839g
                if (r0 == 0) goto Lae
                r5.setTintList(r0)
            Lae:
                android.graphics.PorterDuff$Mode r4 = r4.f8840h
                android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.f8832k
                if (r4 == r0) goto Lb7
                r5.setTintMode(r4)
            Lb7:
                return r5
            Lb8:
                java.lang.Object r4 = r4.f8834b
                android.graphics.drawable.Icon r4 = (android.graphics.drawable.Icon) r4
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.a.f(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    public static class b {
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f8833a = -1;
        this.f8835c = null;
        this.f8836d = null;
        this.f8837e = 0;
        this.f8838f = 0;
        this.f8839g = null;
        this.f8840h = f8832k;
        this.f8841i = null;
    }

    public static Bitmap c(Bitmap bitmap, boolean z7) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f7 = min;
        float f8 = 0.5f * f7;
        float f9 = 0.9166667f * f8;
        if (z7) {
            float f10 = 0.010416667f * f7;
            paint.setColor(0);
            paint.setShadowLayer(f10, 0.0f, f7 * 0.020833334f, 1023410176);
            canvas.drawCircle(f8, f8, f9, paint);
            paint.setShadowLayer(f10, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f8, f8, f9, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f8, f8, f9, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat d(Bitmap bitmap) {
        H.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f8834b = bitmap;
        return iconCompat;
    }

    public static IconCompat e(Resources resources, String str, int i7) {
        H.c.c(str);
        if (i7 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f8837e = i7;
        if (resources != null) {
            try {
                iconCompat.f8834b = resources.getResourceName(i7);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f8834b = str;
        }
        iconCompat.f8842j = str;
        return iconCompat;
    }

    public static String p(int i7) {
        switch (i7) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap f() {
        int i7 = this.f8833a;
        if (i7 == -1) {
            Object obj = this.f8834b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i7 == 1) {
            return (Bitmap) this.f8834b;
        }
        if (i7 == 5) {
            return c((Bitmap) this.f8834b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int g() {
        int i7 = this.f8833a;
        if (i7 == -1) {
            return a.a(this.f8834b);
        }
        if (i7 == 2) {
            return this.f8837e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String h() {
        int i7 = this.f8833a;
        if (i7 == -1) {
            return a.b(this.f8834b);
        }
        if (i7 == 2) {
            String str = this.f8842j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f8834b).split(":", -1)[0] : this.f8842j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int i() {
        int i7 = this.f8833a;
        return i7 == -1 ? a.c(this.f8834b) : i7;
    }

    public Uri j() {
        int i7 = this.f8833a;
        if (i7 == -1) {
            return a.d(this.f8834b);
        }
        if (i7 == 4 || i7 == 6) {
            return Uri.parse((String) this.f8834b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream k(Context context) {
        StringBuilder sb;
        String str;
        Uri j7 = j();
        String scheme = j7.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(j7);
            } catch (Exception e7) {
                e = e7;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f8834b));
            } catch (FileNotFoundException e8) {
                e = e8;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb.append(str);
        sb.append(j7);
        Log.w("IconCompat", sb.toString(), e);
        return null;
    }

    public void l() {
        Parcelable parcelable;
        this.f8840h = PorterDuff.Mode.valueOf(this.f8841i);
        switch (this.f8833a) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                parcelable = this.f8836d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f8836d;
                if (parcelable == null) {
                    byte[] bArr = this.f8835c;
                    this.f8834b = bArr;
                    this.f8833a = 3;
                    this.f8837e = 0;
                    this.f8838f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f8835c, Charset.forName("UTF-16"));
                this.f8834b = str;
                if (this.f8833a == 2 && this.f8842j == null) {
                    this.f8842j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f8834b = this.f8835c;
                return;
        }
        this.f8834b = parcelable;
    }

    public void m(boolean z7) {
        this.f8841i = this.f8840h.name();
        switch (this.f8833a) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                if (z7) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            default:
                return;
            case 1:
            case 5:
                if (z7) {
                    Bitmap bitmap = (Bitmap) this.f8834b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f8835c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f8835c = ((String) this.f8834b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f8835c = (byte[]) this.f8834b;
                return;
            case 4:
            case 6:
                this.f8835c = this.f8834b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f8836d = (Parcelable) this.f8834b;
    }

    public Icon n() {
        return o(null);
    }

    public Icon o(Context context) {
        return a.f(this, context);
    }

    public String toString() {
        int height;
        if (this.f8833a == -1) {
            return String.valueOf(this.f8834b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(p(this.f8833a));
        switch (this.f8833a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f8834b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f8834b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f8842j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(g())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f8837e);
                if (this.f8838f != 0) {
                    sb.append(" off=");
                    height = this.f8838f;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f8834b);
                break;
        }
        if (this.f8839g != null) {
            sb.append(" tint=");
            sb.append(this.f8839g);
        }
        if (this.f8840h != f8832k) {
            sb.append(" mode=");
            sb.append(this.f8840h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i7) {
        this.f8835c = null;
        this.f8836d = null;
        this.f8837e = 0;
        this.f8838f = 0;
        this.f8839g = null;
        this.f8840h = f8832k;
        this.f8841i = null;
        this.f8833a = i7;
    }
}
