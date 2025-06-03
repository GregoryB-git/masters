package j7;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f extends k7.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8533b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f8534c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f8533b = taskCompletionSource2;
        this.f8534c = hVar;
    }

    @Override // k7.e
    public final void a() {
        HashMap hashMap;
        try {
            h hVar = this.f8534c;
            k7.c cVar = (k7.c) hVar.f8539a.f9130m;
            String str = hVar.f8540b;
            Bundle bundle = new Bundle();
            HashMap hashMap2 = i.f8541a;
            synchronized (i.class) {
                hashMap = i.f8541a;
                hashMap.put("java", 20002);
            }
            bundle.putInt("playcore_version_code", ((Integer) hashMap.get("java")).intValue());
            if (hashMap.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((Integer) hashMap.get("native")).intValue());
            }
            if (hashMap.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) hashMap.get("unity")).intValue());
            }
            h hVar2 = this.f8534c;
            TaskCompletionSource taskCompletionSource = this.f8533b;
            String str2 = hVar2.f8540b;
            cVar.c2(str, bundle, new g(hVar2, taskCompletionSource));
        } catch (RemoteException e10) {
            h hVar3 = this.f8534c;
            k7.d dVar = h.f8538c;
            Object[] objArr = {hVar3.f8540b};
            dVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", k7.d.c(dVar.f9105a, "error requesting in-app review for %s", objArr), e10);
            }
            this.f8533b.trySetException(new RuntimeException(e10));
        }
    }
}
