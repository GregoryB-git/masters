package g;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static Field f5644a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f5645b;

    /* renamed from: c, reason: collision with root package name */
    public static Class<?> f5646c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f5647d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f5648e;
    public static boolean f;

    /* renamed from: g, reason: collision with root package name */
    public static Field f5649g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f5650h;

    public static class a {
        public static void a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    public static void a(Object obj) {
        if (!f5647d) {
            try {
                f5646c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f5647d = true;
        }
        Class<?> cls = f5646c;
        if (cls == null) {
            return;
        }
        if (!f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f5648e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f = true;
        }
        Field field = f5648e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
        }
        if (longSparseArray != null) {
            a.a(longSparseArray);
        }
    }
}
