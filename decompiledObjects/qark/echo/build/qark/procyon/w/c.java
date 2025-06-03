// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w;

import androidx.annotation.NonNull;
import android.app.AppOpsManager;
import android.os.Binder;
import android.os.Build$VERSION;
import android.content.Context;

public abstract class c
{
    public static int a(final Context context, final int n, final String s, final String s2) {
        if (Build$VERSION.SDK_INT < 29) {
            return b(context, s, s2);
        }
        final AppOpsManager c = b.c(context);
        final int a = b.a(c, s, Binder.getCallingUid(), s2);
        if (a != 0) {
            return a;
        }
        return b.a(c, s, n, b.b(context));
    }
    
    public static int b(final Context context, final String s, final String s2) {
        return a.c(a.a(context, AppOpsManager.class), s, s2);
    }
    
    public static String c(final String s) {
        return a.d(s);
    }
    
    public abstract static class a
    {
        public static <T> T a(final Context context, final Class<T> clazz) {
            return (T)context.getSystemService((Class)clazz);
        }
        
        public static int b(final AppOpsManager appOpsManager, final String s, final String s2) {
            return appOpsManager.noteProxyOp(s, s2);
        }
        
        public static int c(final AppOpsManager appOpsManager, final String s, final String s2) {
            return appOpsManager.noteProxyOpNoThrow(s, s2);
        }
        
        public static String d(final String s) {
            return AppOpsManager.permissionToOp(s);
        }
    }
    
    public abstract static class b
    {
        public static int a(final AppOpsManager appOpsManager, @NonNull final String s, final int n, @NonNull final String s2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(s, n, s2);
        }
        
        @NonNull
        public static String b(@NonNull final Context context) {
            return context.getOpPackageName();
        }
        
        public static AppOpsManager c(@NonNull final Context context) {
            return (AppOpsManager)context.getSystemService((Class)AppOpsManager.class);
        }
    }
}
