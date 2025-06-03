package va;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import p2.m0;

/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f16069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f16071c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f16072d;

    public r(s sVar, d dVar, String str, MethodChannel.Result result) {
        this.f16072d = sVar;
        this.f16069a = dVar;
        this.f16070b = str;
        this.f16071c = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (s.f) {
            d dVar = this.f16069a;
            if (dVar != null) {
                s.a(this.f16072d, dVar);
            }
            try {
                if (m0.O(s.f16076o)) {
                    Log.d("Sqflite", "delete database " + this.f16070b);
                }
                SQLiteDatabase.deleteDatabase(new File(this.f16070b));
            } catch (Exception e10) {
                Log.e("Sqflite", "error " + e10 + " while closing database " + s.f16080s);
            }
        }
        this.f16071c.success(null);
    }
}
