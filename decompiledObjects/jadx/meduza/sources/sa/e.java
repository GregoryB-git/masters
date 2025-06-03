package sa;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MicrophoneInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImplApi26;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sa.e;

/* loaded from: classes.dex */
public final class e implements MethodChannel.MethodCallHandler {

    /* renamed from: c, reason: collision with root package name */
    public static a f14278c;

    /* renamed from: a, reason: collision with root package name */
    public BinaryMessenger f14279a;

    /* renamed from: b, reason: collision with root package name */
    public MethodChannel f14280b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f14281a;

        /* renamed from: b, reason: collision with root package name */
        public g1.a f14282b;

        /* renamed from: c, reason: collision with root package name */
        public c f14283c;

        /* renamed from: d, reason: collision with root package name */
        public d f14284d;

        /* renamed from: e, reason: collision with root package name */
        public Context f14285e;
        public AudioManager f;

        /* renamed from: g, reason: collision with root package name */
        public b f14286g;

        /* renamed from: h, reason: collision with root package name */
        public List<AudioDeviceInfo> f14287h;

        public a(Context context) {
            Handler handler = new Handler(Looper.getMainLooper());
            this.f14281a = new ArrayList();
            this.f14287h = new ArrayList();
            this.f14285e = context;
            this.f = (AudioManager) context.getSystemService("audio");
            b bVar = new b(this);
            this.f14286g = bVar;
            this.f.registerAudioDeviceCallback(bVar, handler);
        }

        public static boolean b(final a aVar, List list) {
            if (aVar.f14282b == null) {
                Map map = (Map) list.get(0);
                int intValue = ((Integer) map.get("gainType")).intValue();
                AudioAttributesCompat audioAttributesCompat = g1.a.f5705g;
                if (!(intValue == 1 || intValue == 2 || intValue == 3 || intValue == 4)) {
                    throw new IllegalArgumentException(defpackage.f.h("Illegal audio focus gain type ", intValue));
                }
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: sa.a
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i10) {
                        e.a aVar2 = e.a.this;
                        if (i10 == -1) {
                            aVar2.a();
                        } else {
                            aVar2.getClass();
                        }
                        aVar2.g("onAudioFocusChanged", Integer.valueOf(i10));
                    }
                };
                Handler handler = new Handler(Looper.getMainLooper());
                if (map.get("audioAttributes") != null) {
                    Map map2 = (Map) map.get("audioAttributes");
                    int i10 = AudioAttributesCompat.f1018b;
                    AudioAttributesImplApi21.a aVar2 = Build.VERSION.SDK_INT >= 26 ? new AudioAttributesImplApi26.a() : new AudioAttributesImplApi21.a();
                    if (map2.get("contentType") != null) {
                        aVar2.f1022a.setContentType(((Integer) map2.get("contentType")).intValue());
                    }
                    if (map2.get("flags") != null) {
                        aVar2.f1022a.setFlags(((Integer) map2.get("flags")).intValue());
                    }
                    if (map2.get("usage") != null) {
                        aVar2.a(((Integer) map2.get("usage")).intValue());
                    }
                    audioAttributesCompat = new AudioAttributesCompat(aVar2.build());
                }
                AudioAttributesCompat audioAttributesCompat2 = audioAttributesCompat;
                g1.a aVar3 = new g1.a(intValue, onAudioFocusChangeListener, handler, audioAttributesCompat2, map.get("willPauseWhenDucked") != null ? ((Boolean) map.get("willPauseWhenDucked")).booleanValue() : false);
                aVar.f14282b = aVar3;
                AudioManager audioManager = aVar.f;
                if (audioManager == null) {
                    throw new IllegalArgumentException("AudioManager must not be null");
                }
                r1 = (Build.VERSION.SDK_INT >= 26 ? g1.b.b(audioManager, (AudioFocusRequest) aVar3.f) : audioManager.requestAudioFocus(aVar3.f5707b, audioAttributesCompat2.f1019a.a(), intValue)) == 1;
                if (r1) {
                    if (aVar.f14283c == null) {
                        c cVar = new c(aVar);
                        aVar.f14283c = cVar;
                        aVar.f14285e.registerReceiver(cVar, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                    }
                    if (aVar.f14284d == null) {
                        d dVar = new d(aVar);
                        aVar.f14284d = dVar;
                        aVar.f14285e.registerReceiver(dVar, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
                    }
                }
            }
            return r1;
        }

        public static void c(a aVar, Map map) {
            aVar.getClass();
            e.d(19);
            Object obj = map.get("downTime");
            long longValue = ((obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue())).longValue();
            Object obj2 = map.get("eventTime");
            aVar.f.dispatchMediaKeyEvent(new KeyEvent(longValue, ((obj2 == null || (obj2 instanceof Long)) ? (Long) obj2 : Long.valueOf(((Integer) obj2).intValue())).longValue(), ((Integer) map.get("action")).intValue(), ((Integer) map.get("code")).intValue(), ((Integer) map.get("repeat")).intValue(), ((Integer) map.get("metaState")).intValue(), ((Integer) map.get("deviceId")).intValue(), ((Integer) map.get("scancode")).intValue(), ((Integer) map.get("flags")).intValue(), ((Integer) map.get("source")).intValue()));
        }

        public static ArrayList d(a aVar, int i10) {
            aVar.getClass();
            e.d(23);
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo audioDeviceInfo : aVar.f.getDevices(i10)) {
                String str = null;
                if (Build.VERSION.SDK_INT >= 28) {
                    str = audioDeviceInfo.getAddress();
                }
                arrayList.add(e.c("id", Integer.valueOf(audioDeviceInfo.getId()), "productName", audioDeviceInfo.getProductName(), "address", str, "isSource", Boolean.valueOf(audioDeviceInfo.isSource()), "isSink", Boolean.valueOf(audioDeviceInfo.isSink()), "sampleRates", e.b(audioDeviceInfo.getSampleRates()), "channelMasks", e.b(audioDeviceInfo.getChannelMasks()), "channelIndexMasks", e.b(audioDeviceInfo.getChannelIndexMasks()), "channelCounts", e.b(audioDeviceInfo.getChannelCounts()), "encodings", e.b(audioDeviceInfo.getEncodings()), "type", Integer.valueOf(audioDeviceInfo.getType())));
            }
            return arrayList;
        }

        public static ArrayList e(a aVar) {
            aVar.getClass();
            e.d(28);
            ArrayList arrayList = new ArrayList();
            for (MicrophoneInfo microphoneInfo : aVar.f.getMicrophones()) {
                ArrayList arrayList2 = new ArrayList();
                for (Pair<Float, Float> pair : microphoneInfo.getFrequencyResponse()) {
                    arrayList2.add(new ArrayList(Arrays.asList(Double.valueOf(((Float) pair.first).floatValue()), Double.valueOf(((Float) pair.second).floatValue()))));
                }
                ArrayList arrayList3 = new ArrayList();
                for (Pair<Integer, Integer> pair2 : microphoneInfo.getChannelMapping()) {
                    arrayList3.add(new ArrayList(Arrays.asList((Integer) pair2.first, (Integer) pair2.second)));
                }
                arrayList.add(e.c("description", microphoneInfo.getDescription(), "id", Integer.valueOf(microphoneInfo.getId()), "type", Integer.valueOf(microphoneInfo.getType()), "address", microphoneInfo.getAddress(), "location", Integer.valueOf(microphoneInfo.getLocation()), "group", Integer.valueOf(microphoneInfo.getGroup()), "indexInTheGroup", Integer.valueOf(microphoneInfo.getIndexInTheGroup()), "position", e.a(microphoneInfo.getPosition()), "orientation", e.a(microphoneInfo.getOrientation()), "frequencyResponse", arrayList2, "channelMapping", arrayList3, "sensitivity", Float.valueOf(microphoneInfo.getSensitivity()), "maxSpl", Float.valueOf(microphoneInfo.getMaxSpl()), "minSpl", Float.valueOf(microphoneInfo.getMinSpl()), "directionality", Integer.valueOf(microphoneInfo.getDirectionality())));
            }
            return arrayList;
        }

        public static HashMap f(AudioDeviceInfo audioDeviceInfo) {
            String address;
            address = audioDeviceInfo.getAddress();
            return e.c("id", Integer.valueOf(audioDeviceInfo.getId()), "productName", audioDeviceInfo.getProductName(), "address", address, "isSource", Boolean.valueOf(audioDeviceInfo.isSource()), "isSink", Boolean.valueOf(audioDeviceInfo.isSink()), "sampleRates", audioDeviceInfo.getSampleRates(), "channelMasks", audioDeviceInfo.getChannelMasks(), "channelIndexMasks", audioDeviceInfo.getChannelIndexMasks(), "channelCounts", audioDeviceInfo.getChannelCounts(), "encodings", audioDeviceInfo.getEncodings(), "type", Integer.valueOf(audioDeviceInfo.getType()));
        }

        public final boolean a() {
            Context context;
            Context context2 = this.f14285e;
            if (context2 == null) {
                return false;
            }
            c cVar = this.f14283c;
            if (cVar != null) {
                context2.unregisterReceiver(cVar);
                this.f14283c = null;
            }
            d dVar = this.f14284d;
            if (dVar != null && (context = this.f14285e) != null) {
                context.unregisterReceiver(dVar);
                this.f14284d = null;
            }
            g1.a aVar = this.f14282b;
            if (aVar == null) {
                return true;
            }
            AudioManager audioManager = this.f;
            if (audioManager == null) {
                throw new IllegalArgumentException("AudioManager must not be null");
            }
            int a10 = Build.VERSION.SDK_INT >= 26 ? g1.b.a(audioManager, (AudioFocusRequest) aVar.f) : audioManager.abandonAudioFocus(aVar.f5707b);
            this.f14282b = null;
            return a10 == 1;
        }

        public final void g(String str, Object... objArr) {
            Iterator it = this.f14281a.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                eVar.f14280b.invokeMethod(str, new ArrayList(Arrays.asList(objArr)));
            }
        }
    }

    public e(BinaryMessenger binaryMessenger, Context context) {
        if (f14278c == null) {
            f14278c = new a(context);
        }
        this.f14279a = binaryMessenger;
        this.f14280b = new MethodChannel(binaryMessenger, "com.ryanheise.android_audio_manager");
        f14278c.f14281a.add(this);
        this.f14280b.setMethodCallHandler(this);
    }

    public static ArrayList<Double> a(MicrophoneInfo.Coordinate3F coordinate3F) {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(Double.valueOf(coordinate3F.x));
        arrayList.add(Double.valueOf(coordinate3F.y));
        arrayList.add(Double.valueOf(coordinate3F.z));
        return arrayList;
    }

    public static ArrayList<Integer> b(int[] iArr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static HashMap c(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < objArr.length; i10 += 2) {
            hashMap.put((String) objArr[i10], objArr[i10 + 1]);
        }
        return hashMap;
    }

    public static void d(int i10) {
        if (Build.VERSION.SDK_INT < i10) {
            throw new RuntimeException(defpackage.f.h("Requires API level ", i10));
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        List list;
        boolean z10;
        boolean b10;
        Object valueOf;
        int streamMinVolume;
        float streamVolumeDb;
        List<AudioDeviceInfo> availableCommunicationDevices;
        AudioDeviceInfo communicationDevice;
        int allowedCapturePolicy;
        boolean isHapticPlaybackSupported;
        try {
            list = (List) methodCall.arguments;
            z10 = false;
            switch (methodCall.method) {
                case "requestAudioFocus":
                    b10 = a.b(f14278c, list);
                    valueOf = Boolean.valueOf(b10);
                    result.success(valueOf);
                    break;
                case "abandonAudioFocus":
                    b10 = f14278c.a();
                    valueOf = Boolean.valueOf(b10);
                    result.success(valueOf);
                    break;
                case "dispatchMediaKeyEvent":
                    a.c(f14278c, (Map) list.get(0));
                    result.success(null);
                    break;
                case "isVolumeFixed":
                    a aVar = f14278c;
                    aVar.getClass();
                    d(21);
                    valueOf = Boolean.valueOf(aVar.f.isVolumeFixed());
                    result.success(valueOf);
                    break;
                case "adjustStreamVolume":
                    f14278c.f.adjustStreamVolume(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                    result.success(null);
                    break;
                case "adjustVolume":
                    f14278c.f.adjustVolume(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue());
                    result.success(null);
                    break;
                case "adjustSuggestedStreamVolume":
                    f14278c.f.adjustSuggestedStreamVolume(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                    result.success(null);
                    break;
                case "getRingerMode":
                    valueOf = Integer.valueOf(f14278c.f.getRingerMode());
                    result.success(valueOf);
                    break;
                case "getStreamMaxVolume":
                    valueOf = Integer.valueOf(f14278c.f.getStreamMaxVolume(((Integer) list.get(0)).intValue()));
                    result.success(valueOf);
                    break;
                case "getStreamMinVolume":
                    a aVar2 = f14278c;
                    int intValue = ((Integer) list.get(0)).intValue();
                    aVar2.getClass();
                    d(28);
                    streamMinVolume = aVar2.f.getStreamMinVolume(intValue);
                    valueOf = Integer.valueOf(streamMinVolume);
                    result.success(valueOf);
                    break;
                case "getStreamVolume":
                    valueOf = Integer.valueOf(f14278c.f.getStreamVolume(((Integer) list.get(0)).intValue()));
                    result.success(valueOf);
                    break;
                case "getStreamVolumeDb":
                    a aVar3 = f14278c;
                    int intValue2 = ((Integer) list.get(0)).intValue();
                    int intValue3 = ((Integer) list.get(1)).intValue();
                    int intValue4 = ((Integer) list.get(2)).intValue();
                    aVar3.getClass();
                    d(28);
                    streamVolumeDb = aVar3.f.getStreamVolumeDb(intValue2, intValue3, intValue4);
                    valueOf = Float.valueOf(streamVolumeDb);
                    result.success(valueOf);
                    break;
                case "setRingerMode":
                    f14278c.f.setRingerMode(((Integer) list.get(0)).intValue());
                    result.success(null);
                    break;
                case "setStreamVolume":
                    f14278c.f.setStreamVolume(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                    result.success(null);
                    break;
                case "isStreamMute":
                    a aVar4 = f14278c;
                    int intValue5 = ((Integer) list.get(0)).intValue();
                    aVar4.getClass();
                    d(23);
                    valueOf = Boolean.valueOf(aVar4.f.isStreamMute(intValue5));
                    result.success(valueOf);
                    break;
                case "getAvailableCommunicationDevices":
                    a aVar5 = f14278c;
                    aVar5.getClass();
                    d(31);
                    availableCommunicationDevices = aVar5.f.getAvailableCommunicationDevices();
                    aVar5.f14287h = availableCommunicationDevices;
                    ArrayList arrayList = new ArrayList();
                    Iterator<AudioDeviceInfo> it = aVar5.f14287h.iterator();
                    while (it.hasNext()) {
                        arrayList.add(a.f(it.next()));
                    }
                    result.success(arrayList);
                    break;
                case "setCommunicationDevice":
                    a aVar6 = f14278c;
                    Integer num = (Integer) list.get(0);
                    aVar6.getClass();
                    d(31);
                    Iterator<AudioDeviceInfo> it2 = aVar6.f14287h.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            AudioDeviceInfo next = it2.next();
                            if (next.getId() == num.intValue()) {
                                z10 = aVar6.f.setCommunicationDevice(next);
                            }
                        }
                    }
                    valueOf = Boolean.valueOf(z10);
                    result.success(valueOf);
                    break;
                case "getCommunicationDevice":
                    a aVar7 = f14278c;
                    aVar7.getClass();
                    d(31);
                    communicationDevice = aVar7.f.getCommunicationDevice();
                    valueOf = a.f(communicationDevice);
                    result.success(valueOf);
                    break;
                case "clearCommunicationDevice":
                    a aVar8 = f14278c;
                    aVar8.getClass();
                    d(31);
                    aVar8.f.clearCommunicationDevice();
                    result.success(null);
                    break;
                case "setSpeakerphoneOn":
                    f14278c.f.setSpeakerphoneOn(((Boolean) list.get(0)).booleanValue());
                    result.success(null);
                    break;
                case "isSpeakerphoneOn":
                    valueOf = Boolean.valueOf(f14278c.f.isSpeakerphoneOn());
                    result.success(valueOf);
                    break;
                case "setAllowedCapturePolicy":
                    a aVar9 = f14278c;
                    int intValue6 = ((Integer) list.get(0)).intValue();
                    aVar9.getClass();
                    d(29);
                    aVar9.f.setAllowedCapturePolicy(intValue6);
                    result.success(null);
                    break;
                case "getAllowedCapturePolicy":
                    a aVar10 = f14278c;
                    aVar10.getClass();
                    d(29);
                    allowedCapturePolicy = aVar10.f.getAllowedCapturePolicy();
                    valueOf = Integer.valueOf(allowedCapturePolicy);
                    result.success(valueOf);
                    break;
                case "isBluetoothScoAvailableOffCall":
                    valueOf = Boolean.valueOf(f14278c.f.isBluetoothScoAvailableOffCall());
                    result.success(valueOf);
                    break;
                case "startBluetoothSco":
                    f14278c.f.startBluetoothSco();
                    result.success(null);
                    break;
                case "stopBluetoothSco":
                    f14278c.f.stopBluetoothSco();
                    result.success(null);
                    break;
                case "setBluetoothScoOn":
                    f14278c.f.setBluetoothScoOn(((Boolean) list.get(0)).booleanValue());
                    result.success(null);
                    break;
                case "isBluetoothScoOn":
                    valueOf = Boolean.valueOf(f14278c.f.isBluetoothScoOn());
                    result.success(valueOf);
                    break;
                case "setMicrophoneMute":
                    f14278c.f.setMicrophoneMute(((Boolean) list.get(0)).booleanValue());
                    result.success(null);
                    break;
                case "isMicrophoneMute":
                    valueOf = Boolean.valueOf(f14278c.f.isMicrophoneMute());
                    result.success(valueOf);
                    break;
                case "setMode":
                    f14278c.f.setMode(((Integer) list.get(0)).intValue());
                    result.success(null);
                    break;
                case "getMode":
                    valueOf = Integer.valueOf(f14278c.f.getMode());
                    result.success(valueOf);
                    break;
                case "isMusicActive":
                    valueOf = Boolean.valueOf(f14278c.f.isMusicActive());
                    result.success(valueOf);
                    break;
                case "generateAudioSessionId":
                    a aVar11 = f14278c;
                    aVar11.getClass();
                    d(21);
                    valueOf = Integer.valueOf(aVar11.f.generateAudioSessionId());
                    result.success(valueOf);
                    break;
                case "setParameters":
                    f14278c.f.setParameters((String) list.get(0));
                    result.success(null);
                    break;
                case "getParameters":
                    valueOf = f14278c.f.getParameters((String) list.get(0));
                    result.success(valueOf);
                    break;
                case "playSoundEffect":
                    a aVar12 = f14278c;
                    int intValue7 = ((Integer) list.get(0)).intValue();
                    Double d10 = (Double) list.get(1);
                    if (d10 != null) {
                        aVar12.f.playSoundEffect(intValue7, (float) d10.doubleValue());
                    } else {
                        aVar12.f.playSoundEffect(intValue7);
                    }
                    result.success(null);
                    break;
                case "loadSoundEffects":
                    f14278c.f.loadSoundEffects();
                    result.success(null);
                    break;
                case "unloadSoundEffects":
                    f14278c.f.unloadSoundEffects();
                    result.success(null);
                    break;
                case "getProperty":
                    a aVar13 = f14278c;
                    String str = (String) list.get(0);
                    aVar13.getClass();
                    d(17);
                    valueOf = aVar13.f.getProperty(str);
                    result.success(valueOf);
                    break;
                case "getDevices":
                    valueOf = a.d(f14278c, ((Integer) list.get(0)).intValue());
                    result.success(valueOf);
                    break;
                case "getMicrophones":
                    valueOf = a.e(f14278c);
                    result.success(valueOf);
                    break;
                case "isHapticPlaybackSupported":
                    f14278c.getClass();
                    d(29);
                    isHapticPlaybackSupported = AudioManager.isHapticPlaybackSupported();
                    valueOf = Boolean.valueOf(isHapticPlaybackSupported);
                    result.success(valueOf);
                    break;
                default:
                    result.notImplemented();
                    break;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            result.error("Error: " + e10, null, null);
        }
    }
}
