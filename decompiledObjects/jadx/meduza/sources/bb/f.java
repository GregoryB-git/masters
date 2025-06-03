package bb;

import android.content.Context;
import android.content.Intent;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class f implements PluginRegistry.ActivityResultListener {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel.Result f2202a;

    /* renamed from: b, reason: collision with root package name */
    public AtomicBoolean f2203b = new AtomicBoolean(true);

    public f(Context context) {
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        MethodChannel.Result result;
        if (i10 != 22643) {
            return false;
        }
        String str = SharePlusPendingIntent.f3743a;
        if (!this.f2203b.compareAndSet(false, true) || (result = this.f2202a) == null) {
            return true;
        }
        result.success(str);
        this.f2202a = null;
        return true;
    }
}
