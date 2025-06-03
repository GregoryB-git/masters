// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w1;

import android.location.LocationManager;
import android.bluetooth.BluetoothManager;
import android.os.Build$VERSION;
import android.net.Uri;
import android.content.Intent;
import java.util.List;
import android.content.pm.PackageManager;
import android.provider.Settings$SettingNotFoundException;
import android.provider.Settings$Secure;
import android.content.Context;

public final class y
{
    public static boolean e(final Context context) {
        boolean b = false;
        try {
            if (Settings$Secure.getInt(context.getContentResolver(), "location_mode") != 0) {
                b = true;
            }
            return b;
        }
        catch (Settings$SettingNotFoundException ex) {
            ((Throwable)ex).printStackTrace();
            return false;
        }
    }
    
    public void a(final int n, final Context context, final a a, final b b) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public final List b(final PackageManager packageManager) {
        final Intent intent = new Intent("android.intent.action.CALL");
        intent.setData(Uri.parse("tel:123123"));
        if (Build$VERSION.SDK_INT >= 33) {
            return x.a(packageManager, intent, w.a(0L));
        }
        return packageManager.queryIntentActivities(intent, 0);
    }
    
    public final boolean c(final Context context) {
        return ((BluetoothManager)context.getSystemService("bluetooth")).getAdapter().isEnabled();
    }
    
    public final boolean d(final Context context) {
        if (Build$VERSION.SDK_INT >= 28) {
            final LocationManager locationManager = (LocationManager)context.getSystemService((Class)LocationManager.class);
            return locationManager != null && v.a(locationManager);
        }
        return e(context);
    }
    
    public interface a
    {
        void a(final int p0);
    }
}
