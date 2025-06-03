package sa;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.ArrayList;
import sa.e;

/* loaded from: classes.dex */
public final class b extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e.a f14275a;

    public b(e.a aVar) {
        this.f14275a = aVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        e.a aVar = this.f14275a;
        Object[] objArr = new Object[1];
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            arrayList.add(e.a.f(audioDeviceInfo));
        }
        objArr[0] = arrayList;
        aVar.g("onAudioDevicesAdded", objArr);
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e.a aVar = this.f14275a;
        Object[] objArr = new Object[1];
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            arrayList.add(e.a.f(audioDeviceInfo));
        }
        objArr[0] = arrayList;
        aVar.g("onAudioDevicesRemoved", objArr);
    }
}
