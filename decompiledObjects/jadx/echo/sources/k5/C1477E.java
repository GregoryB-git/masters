package k5;

import E5.k;
import a0.AbstractC0719b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MicrophoneInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import androidx.media.a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k5.C1477E;
import x.AbstractC2112a;

/* renamed from: k5.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1477E implements k.c {

    /* renamed from: c, reason: collision with root package name */
    public static a f16194c;

    /* renamed from: a, reason: collision with root package name */
    public E5.c f16195a;

    /* renamed from: b, reason: collision with root package name */
    public E5.k f16196b;

    /* renamed from: k5.E$a */
    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public androidx.media.a f16199c;

        /* renamed from: d, reason: collision with root package name */
        public BroadcastReceiver f16200d;

        /* renamed from: e, reason: collision with root package name */
        public BroadcastReceiver f16201e;

        /* renamed from: f, reason: collision with root package name */
        public Context f16202f;

        /* renamed from: g, reason: collision with root package name */
        public AudioManager f16203g;

        /* renamed from: h, reason: collision with root package name */
        public Object f16204h;

        /* renamed from: a, reason: collision with root package name */
        public final Handler f16197a = new Handler(Looper.getMainLooper());

        /* renamed from: b, reason: collision with root package name */
        public List f16198b = new ArrayList();

        /* renamed from: i, reason: collision with root package name */
        public List f16205i = new ArrayList();

        /* renamed from: k5.E$a$a, reason: collision with other inner class name */
        public class C0229a extends AudioDeviceCallback {
            public C0229a() {
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                a.this.A("onAudioDevicesAdded", C1477E.d(audioDeviceInfoArr));
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                a.this.A("onAudioDevicesRemoved", C1477E.d(audioDeviceInfoArr));
            }
        }

        /* renamed from: k5.E$a$b */
        public class b extends BroadcastReceiver {
            public b() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    a.this.A("onBecomingNoisy", new Object[0]);
                }
            }
        }

        /* renamed from: k5.E$a$c */
        public class c extends BroadcastReceiver {
            public c() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                a.this.A("onScoAudioStateUpdated", Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1)), Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1)));
            }
        }

        public a(Context context) {
            this.f16202f = context;
            this.f16203g = (AudioManager) context.getSystemService("audio");
            z();
        }

        public void A(String str, Object... objArr) {
            for (C1477E c1477e : this.f16198b) {
                c1477e.f16196b.c(str, new ArrayList(Arrays.asList(objArr)));
            }
        }

        public Object B() {
            return Boolean.valueOf(this.f16203g.isBluetoothScoAvailableOffCall());
        }

        public Object C() {
            return Boolean.valueOf(this.f16203g.isBluetoothScoOn());
        }

        public boolean D() {
            return this.f16198b.size() == 0;
        }

        public Object E() {
            boolean isHapticPlaybackSupported;
            C1477E.h(29);
            isHapticPlaybackSupported = AudioManager.isHapticPlaybackSupported();
            return Boolean.valueOf(isHapticPlaybackSupported);
        }

        public Object F() {
            return Boolean.valueOf(this.f16203g.isMicrophoneMute());
        }

        public Object G() {
            return Boolean.valueOf(this.f16203g.isMusicActive());
        }

        public Object H() {
            return Boolean.valueOf(this.f16203g.isSpeakerphoneOn());
        }

        public Object I(int i7) {
            C1477E.h(23);
            return Boolean.valueOf(this.f16203g.isStreamMute(i7));
        }

        public Object J() {
            C1477E.h(21);
            return Boolean.valueOf(this.f16203g.isVolumeFixed());
        }

        public final /* synthetic */ void K(int i7) {
            if (i7 == -1) {
                b();
            }
            A("onAudioFocusChanged", Integer.valueOf(i7));
        }

        public Object L() {
            this.f16203g.loadSoundEffects();
            return null;
        }

        public Object M(int i7, Double d7) {
            if (d7 != null) {
                this.f16203g.playSoundEffect(i7, (float) d7.doubleValue());
                return null;
            }
            this.f16203g.playSoundEffect(i7);
            return null;
        }

        public final void N() {
            if (this.f16200d != null) {
                return;
            }
            b bVar = new b();
            this.f16200d = bVar;
            AbstractC2112a.h(this.f16202f, bVar, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), 2);
        }

        public final void O() {
            if (this.f16201e != null) {
                return;
            }
            c cVar = new c();
            this.f16201e = cVar;
            AbstractC2112a.h(this.f16202f, cVar, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"), 2);
        }

        public void P(C1477E c1477e) {
            this.f16198b.remove(c1477e);
        }

        public boolean Q(List list) {
            if (this.f16199c != null) {
                return true;
            }
            Map map = (Map) list.get(0);
            a.b bVar = new a.b(((Integer) map.get("gainType")).intValue());
            bVar.e(new AudioManager.OnAudioFocusChangeListener() { // from class: k5.D
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i7) {
                    C1477E.a.this.K(i7);
                }
            });
            if (map.get("audioAttributes") != null) {
                bVar.c(h((Map) map.get("audioAttributes")));
            }
            if (map.get("willPauseWhenDucked") != null) {
                bVar.g(((Boolean) map.get("willPauseWhenDucked")).booleanValue());
            }
            androidx.media.a a7 = bVar.a();
            this.f16199c = a7;
            boolean z7 = AbstractC0719b.b(this.f16203g, a7) == 1;
            if (z7) {
                N();
                O();
            }
            return z7;
        }

        public Object R(int i7) {
            C1477E.h(29);
            this.f16203g.setAllowedCapturePolicy(i7);
            return null;
        }

        public Object S(boolean z7) {
            this.f16203g.setBluetoothScoOn(z7);
            return null;
        }

        public boolean T(Integer num) {
            boolean communicationDevice;
            C1477E.h(31);
            for (AudioDeviceInfo audioDeviceInfo : this.f16205i) {
                if (audioDeviceInfo.getId() == num.intValue()) {
                    communicationDevice = this.f16203g.setCommunicationDevice(audioDeviceInfo);
                    return communicationDevice;
                }
            }
            return false;
        }

        public Object U(boolean z7) {
            this.f16203g.setMicrophoneMute(z7);
            return null;
        }

        public Object V(int i7) {
            this.f16203g.setMode(i7);
            return null;
        }

        public Object W(String str) {
            this.f16203g.setParameters(str);
            return null;
        }

        public Object X(int i7) {
            this.f16203g.setRingerMode(i7);
            return null;
        }

        public Object Y(boolean z7) {
            this.f16203g.setSpeakerphoneOn(z7);
            return null;
        }

        public Object Z(int i7, int i8, int i9) {
            this.f16203g.setStreamVolume(i7, i8, i9);
            return null;
        }

        public Object a0() {
            this.f16203g.startBluetoothSco();
            return null;
        }

        public boolean b() {
            if (this.f16202f == null) {
                return false;
            }
            d0();
            e0();
            androidx.media.a aVar = this.f16199c;
            if (aVar == null) {
                return true;
            }
            int a7 = AbstractC0719b.a(this.f16203g, aVar);
            this.f16199c = null;
            return a7 == 1;
        }

        public Object b0() {
            this.f16203g.stopBluetoothSco();
            return null;
        }

        public void c(C1477E c1477e) {
            this.f16198b.add(c1477e);
        }

        public Object c0() {
            this.f16203g.unloadSoundEffects();
            return null;
        }

        public Object d(int i7, int i8, int i9) {
            this.f16203g.adjustStreamVolume(i7, i8, i9);
            return null;
        }

        public final void d0() {
            Context context;
            BroadcastReceiver broadcastReceiver = this.f16200d;
            if (broadcastReceiver == null || (context = this.f16202f) == null) {
                return;
            }
            context.unregisterReceiver(broadcastReceiver);
            this.f16200d = null;
        }

        public Object e(int i7, int i8, int i9) {
            this.f16203g.adjustSuggestedStreamVolume(i7, i8, i9);
            return null;
        }

        public final void e0() {
            Context context;
            BroadcastReceiver broadcastReceiver = this.f16201e;
            if (broadcastReceiver == null || (context = this.f16202f) == null) {
                return;
            }
            context.unregisterReceiver(broadcastReceiver);
            this.f16201e = null;
        }

        public Object f(int i7, int i8) {
            this.f16203g.adjustVolume(i7, i8);
            return null;
        }

        public Object g() {
            C1477E.h(31);
            this.f16203g.clearCommunicationDevice();
            return null;
        }

        public final AudioAttributesCompat h(Map map) {
            AudioAttributesCompat.a aVar = new AudioAttributesCompat.a();
            if (map.get("contentType") != null) {
                aVar.b(((Integer) map.get("contentType")).intValue());
            }
            if (map.get("flags") != null) {
                aVar.c(((Integer) map.get("flags")).intValue());
            }
            if (map.get("usage") != null) {
                aVar.d(((Integer) map.get("usage")).intValue());
            }
            return aVar.a();
        }

        public Object i(Map map) {
            this.f16203g.dispatchMediaKeyEvent(new KeyEvent(C1477E.e(map.get("downTime")).longValue(), C1477E.e(map.get("eventTime")).longValue(), ((Integer) map.get("action")).intValue(), ((Integer) map.get("keyCode")).intValue(), ((Integer) map.get("repeatCount")).intValue(), ((Integer) map.get("metaState")).intValue(), ((Integer) map.get("deviceId")).intValue(), ((Integer) map.get("scanCode")).intValue(), ((Integer) map.get("flags")).intValue(), ((Integer) map.get("source")).intValue()));
            return null;
        }

        public void j() {
            b();
            k();
            this.f16202f = null;
            this.f16203g = null;
        }

        public final void k() {
            this.f16203g.unregisterAudioDeviceCallback((AudioDeviceCallback) this.f16204h);
        }

        public Object l() {
            C1477E.h(21);
            return Integer.valueOf(this.f16203g.generateAudioSessionId());
        }

        public Object m() {
            int allowedCapturePolicy;
            C1477E.h(29);
            allowedCapturePolicy = this.f16203g.getAllowedCapturePolicy();
            return Integer.valueOf(allowedCapturePolicy);
        }

        public List n() {
            List availableCommunicationDevices;
            C1477E.h(31);
            availableCommunicationDevices = this.f16203g.getAvailableCommunicationDevices();
            this.f16205i = availableCommunicationDevices;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f16205i.iterator();
            while (it.hasNext()) {
                arrayList.add(C1477E.c((AudioDeviceInfo) it.next()));
            }
            return arrayList;
        }

        public Map o() {
            AudioDeviceInfo communicationDevice;
            C1477E.h(31);
            communicationDevice = this.f16203g.getCommunicationDevice();
            return C1477E.c(communicationDevice);
        }

        public Object p(int i7) {
            C1477E.h(23);
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo audioDeviceInfo : this.f16203g.getDevices(i7)) {
                arrayList.add(C1477E.g("id", Integer.valueOf(audioDeviceInfo.getId()), "productName", audioDeviceInfo.getProductName(), "address", Build.VERSION.SDK_INT >= 28 ? audioDeviceInfo.getAddress() : null, "isSource", Boolean.valueOf(audioDeviceInfo.isSource()), "isSink", Boolean.valueOf(audioDeviceInfo.isSink()), "sampleRates", C1477E.f(audioDeviceInfo.getSampleRates()), "channelMasks", C1477E.f(audioDeviceInfo.getChannelMasks()), "channelIndexMasks", C1477E.f(audioDeviceInfo.getChannelIndexMasks()), "channelCounts", C1477E.f(audioDeviceInfo.getChannelCounts()), "encodings", C1477E.f(audioDeviceInfo.getEncodings()), "type", Integer.valueOf(audioDeviceInfo.getType())));
            }
            return arrayList;
        }

        public Object q() {
            List microphones;
            List<Pair> frequencyResponse;
            List<Pair> channelMapping;
            String description;
            int id;
            int type;
            String address;
            int location;
            int group;
            int indexInTheGroup;
            MicrophoneInfo.Coordinate3F position;
            MicrophoneInfo.Coordinate3F orientation;
            float sensitivity;
            float maxSpl;
            float minSpl;
            int directionality;
            C1477E.h(28);
            ArrayList arrayList = new ArrayList();
            microphones = this.f16203g.getMicrophones();
            Iterator it = microphones.iterator();
            while (it.hasNext()) {
                MicrophoneInfo a7 = AbstractC1475C.a(it.next());
                ArrayList arrayList2 = new ArrayList();
                frequencyResponse = a7.getFrequencyResponse();
                for (Pair pair : frequencyResponse) {
                    arrayList2.add(new ArrayList(Arrays.asList(Double.valueOf(((Float) pair.first).floatValue()), Double.valueOf(((Float) pair.second).floatValue()))));
                }
                ArrayList arrayList3 = new ArrayList();
                channelMapping = a7.getChannelMapping();
                for (Pair pair2 : channelMapping) {
                    arrayList3.add(new ArrayList(Arrays.asList((Integer) pair2.first, (Integer) pair2.second)));
                }
                description = a7.getDescription();
                id = a7.getId();
                Integer valueOf = Integer.valueOf(id);
                type = a7.getType();
                Integer valueOf2 = Integer.valueOf(type);
                address = a7.getAddress();
                location = a7.getLocation();
                Integer valueOf3 = Integer.valueOf(location);
                group = a7.getGroup();
                Integer valueOf4 = Integer.valueOf(group);
                indexInTheGroup = a7.getIndexInTheGroup();
                Integer valueOf5 = Integer.valueOf(indexInTheGroup);
                position = a7.getPosition();
                ArrayList a8 = C1477E.a(position);
                orientation = a7.getOrientation();
                ArrayList a9 = C1477E.a(orientation);
                sensitivity = a7.getSensitivity();
                Float valueOf6 = Float.valueOf(sensitivity);
                maxSpl = a7.getMaxSpl();
                Float valueOf7 = Float.valueOf(maxSpl);
                minSpl = a7.getMinSpl();
                Float valueOf8 = Float.valueOf(minSpl);
                directionality = a7.getDirectionality();
                arrayList.add(C1477E.g("description", description, "id", valueOf, "type", valueOf2, "address", address, "location", valueOf3, "group", valueOf4, "indexInTheGroup", valueOf5, "position", a8, "orientation", a9, "frequencyResponse", arrayList2, "channelMapping", arrayList3, "sensitivity", valueOf6, "maxSpl", valueOf7, "minSpl", valueOf8, "directionality", Integer.valueOf(directionality)));
            }
            return arrayList;
        }

        public Object r() {
            return Integer.valueOf(this.f16203g.getMode());
        }

        public Object s(String str) {
            return this.f16203g.getParameters(str);
        }

        public Object t(String str) {
            return this.f16203g.getProperty(str);
        }

        public Object u() {
            return Integer.valueOf(this.f16203g.getRingerMode());
        }

        public Object v(int i7) {
            return Integer.valueOf(this.f16203g.getStreamMaxVolume(i7));
        }

        public Object w(int i7) {
            int streamMinVolume;
            C1477E.h(28);
            streamMinVolume = this.f16203g.getStreamMinVolume(i7);
            return Integer.valueOf(streamMinVolume);
        }

        public Object x(int i7) {
            return Integer.valueOf(this.f16203g.getStreamVolume(i7));
        }

        public Object y(int i7, int i8, int i9) {
            float streamVolumeDb;
            C1477E.h(28);
            streamVolumeDb = this.f16203g.getStreamVolumeDb(i7, i8, i9);
            return Float.valueOf(streamVolumeDb);
        }

        public final void z() {
            C0229a c0229a = new C0229a();
            this.f16204h = c0229a;
            this.f16203g.registerAudioDeviceCallback(c0229a, this.f16197a);
        }
    }

    public C1477E(Context context, E5.c cVar) {
        if (f16194c == null) {
            f16194c = new a(context);
        }
        this.f16195a = cVar;
        this.f16196b = new E5.k(cVar, "com.ryanheise.android_audio_manager");
        f16194c.c(this);
        this.f16196b.e(this);
    }

    public static ArrayList a(MicrophoneInfo.Coordinate3F coordinate3F) {
        float f7;
        float f8;
        float f9;
        ArrayList arrayList = new ArrayList();
        f7 = coordinate3F.x;
        arrayList.add(Double.valueOf(f7));
        f8 = coordinate3F.y;
        arrayList.add(Double.valueOf(f8));
        f9 = coordinate3F.z;
        arrayList.add(Double.valueOf(f9));
        return arrayList;
    }

    public static Map c(AudioDeviceInfo audioDeviceInfo) {
        return g("id", Integer.valueOf(audioDeviceInfo.getId()), "productName", audioDeviceInfo.getProductName(), "address", Build.VERSION.SDK_INT >= 28 ? audioDeviceInfo.getAddress() : null, "isSource", Boolean.valueOf(audioDeviceInfo.isSource()), "isSink", Boolean.valueOf(audioDeviceInfo.isSink()), "sampleRates", audioDeviceInfo.getSampleRates(), "channelMasks", audioDeviceInfo.getChannelMasks(), "channelIndexMasks", audioDeviceInfo.getChannelIndexMasks(), "channelCounts", audioDeviceInfo.getChannelCounts(), "encodings", audioDeviceInfo.getEncodings(), "type", Integer.valueOf(audioDeviceInfo.getType()));
    }

    public static List d(AudioDeviceInfo[] audioDeviceInfoArr) {
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            arrayList.add(c(audioDeviceInfo));
        }
        return arrayList;
    }

    public static Long e(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue());
    }

    public static ArrayList f(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i7 : iArr) {
            arrayList.add(Integer.valueOf(i7));
        }
        return arrayList;
    }

    public static Map g(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < objArr.length; i7 += 2) {
            hashMap.put((String) objArr[i7], objArr[i7 + 1]);
        }
        return hashMap;
    }

    public static void h(int i7) {
        if (Build.VERSION.SDK_INT >= i7) {
            return;
        }
        throw new RuntimeException("Requires API level " + i7);
    }

    public void b() {
        this.f16196b.e(null);
        f16194c.P(this);
        if (f16194c.D()) {
            f16194c.j();
            f16194c = null;
        }
        this.f16196b = null;
        this.f16195a = null;
    }

    @Override // E5.k.c
    public void onMethodCall(E5.j jVar, k.d dVar) {
        char c7;
        Object valueOf;
        try {
            List list = (List) jVar.f1671b;
            String str = jVar.f1670a;
            switch (str.hashCode()) {
                case -1758921066:
                    if (str.equals("getCommunicationDevice")) {
                        c7 = 17;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1698305881:
                    if (str.equals("getDevices")) {
                        c7 = '(';
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1679670739:
                    if (str.equals("isMicrophoneMute")) {
                        c7 = 29;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1582239800:
                    if (str.equals("getStreamMaxVolume")) {
                        c7 = '\b';
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1562927400:
                    if (str.equals("isSpeakerphoneOn")) {
                        c7 = 20;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1524320654:
                    if (str.equals("isHapticPlaybackSupported")) {
                        c7 = '*';
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1504647535:
                    if (str.equals("requestAudioFocus")) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1413157019:
                    if (str.equals("setMicrophoneMute")) {
                        c7 = 28;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1296413680:
                    if (str.equals("setSpeakerphoneOn")) {
                        c7 = 19;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1285190630:
                    if (str.equals("isBluetoothScoOn")) {
                        c7 = 27;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1197068311:
                    if (str.equals("adjustStreamVolume")) {
                        c7 = 4;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1091382445:
                    if (str.equals("getMicrophones")) {
                        c7 = ')';
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1079290158:
                    if (str.equals("setAllowedCapturePolicy")) {
                        c7 = 21;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1018676910:
                    if (str.equals("setBluetoothScoOn")) {
                        c7 = 26;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -809761226:
                    if (str.equals("getStreamMinVolume")) {
                        c7 = '\t';
                        break;
                    }
                    c7 = 65535;
                    break;
                case -763512583:
                    if (str.equals("loadSoundEffects")) {
                        c7 = '%';
                        break;
                    }
                    c7 = 65535;
                    break;
                case -694417919:
                    if (str.equals("isMusicActive")) {
                        c7 = ' ';
                        break;
                    }
                    c7 = 65535;
                    break;
                case -580980717:
                    if (str.equals("startBluetoothSco")) {
                        c7 = 24;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -445792758:
                    if (str.equals("setCommunicationDevice")) {
                        c7 = 16;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -380792370:
                    if (str.equals("getStreamVolumeDb")) {
                        c7 = 11;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -75324903:
                    if (str.equals("getMode")) {
                        c7 = 31;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 152385829:
                    if (str.equals("dispatchMediaKeyEvent")) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 160987616:
                    if (str.equals("getParameters")) {
                        c7 = '#';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 186762163:
                    if (str.equals("stopBluetoothSco")) {
                        c7 = 25;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 276698416:
                    if (str.equals("getStreamVolume")) {
                        c7 = '\n';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 469094495:
                    if (str.equals("isBluetoothScoAvailableOffCall")) {
                        c7 = 23;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 623794710:
                    if (str.equals("getRingerMode")) {
                        c7 = 7;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 935118828:
                    if (str.equals("setParameters")) {
                        c7 = '\"';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 954131337:
                    if (str.equals("adjustVolume")) {
                        c7 = 5;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 976310915:
                    if (str.equals("isStreamMute")) {
                        c7 = 14;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1084758859:
                    if (str.equals("getProperty")) {
                        c7 = '\'';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1163405254:
                    if (str.equals("getAllowedCapturePolicy")) {
                        c7 = 22;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1187450940:
                    if (str.equals("setStreamVolume")) {
                        c7 = '\r';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1241312831:
                    if (str.equals("clearCommunicationDevice")) {
                        c7 = 18;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1258134830:
                    if (str.equals("adjustSuggestedStreamVolume")) {
                        c7 = 6;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1357290231:
                    if (str.equals("abandonAudioFocus")) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1378317714:
                    if (str.equals("unloadSoundEffects")) {
                        c7 = '&';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1397925922:
                    if (str.equals("setRingerMode")) {
                        c7 = '\f';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1504508844:
                    if (str.equals("playSoundEffect")) {
                        c7 = '$';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1570996442:
                    if (str.equals("getAvailableCommunicationDevices")) {
                        c7 = 15;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1984784677:
                    if (str.equals("setMode")) {
                        c7 = 30;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1986792688:
                    if (str.equals("isVolumeFixed")) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 2093966320:
                    if (str.equals("generateAudioSessionId")) {
                        c7 = '!';
                        break;
                    }
                    c7 = 65535;
                    break;
                default:
                    c7 = 65535;
                    break;
            }
            switch (c7) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    valueOf = Boolean.valueOf(f16194c.Q(list));
                    break;
                case 1:
                    valueOf = Boolean.valueOf(f16194c.b());
                    break;
                case 2:
                    valueOf = f16194c.i((Map) list.get(0));
                    break;
                case 3:
                    valueOf = f16194c.J();
                    break;
                case 4:
                    valueOf = f16194c.d(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                    break;
                case 5:
                    valueOf = f16194c.f(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue());
                    break;
                case 6:
                    valueOf = f16194c.e(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                    break;
                case 7:
                    valueOf = f16194c.u();
                    break;
                case '\b':
                    valueOf = f16194c.v(((Integer) list.get(0)).intValue());
                    break;
                case '\t':
                    valueOf = f16194c.w(((Integer) list.get(0)).intValue());
                    break;
                case '\n':
                    valueOf = f16194c.x(((Integer) list.get(0)).intValue());
                    break;
                case 11:
                    valueOf = f16194c.y(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                    break;
                case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    valueOf = f16194c.X(((Integer) list.get(0)).intValue());
                    break;
                case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    valueOf = f16194c.Z(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                    break;
                case 14:
                    valueOf = f16194c.I(((Integer) list.get(0)).intValue());
                    break;
                case 15:
                    valueOf = f16194c.n();
                    break;
                case 16:
                    valueOf = Boolean.valueOf(f16194c.T((Integer) list.get(0)));
                    break;
                case 17:
                    valueOf = f16194c.o();
                    break;
                case 18:
                    valueOf = f16194c.g();
                    break;
                case 19:
                    valueOf = f16194c.Y(((Boolean) list.get(0)).booleanValue());
                    break;
                case 20:
                    valueOf = f16194c.H();
                    break;
                case 21:
                    valueOf = f16194c.R(((Integer) list.get(0)).intValue());
                    break;
                case 22:
                    valueOf = f16194c.m();
                    break;
                case 23:
                    valueOf = f16194c.B();
                    break;
                case 24:
                    valueOf = f16194c.a0();
                    break;
                case 25:
                    valueOf = f16194c.b0();
                    break;
                case 26:
                    valueOf = f16194c.S(((Boolean) list.get(0)).booleanValue());
                    break;
                case 27:
                    valueOf = f16194c.C();
                    break;
                case 28:
                    valueOf = f16194c.U(((Boolean) list.get(0)).booleanValue());
                    break;
                case 29:
                    valueOf = f16194c.F();
                    break;
                case 30:
                    valueOf = f16194c.V(((Integer) list.get(0)).intValue());
                    break;
                case 31:
                    valueOf = f16194c.r();
                    break;
                case ' ':
                    valueOf = f16194c.G();
                    break;
                case '!':
                    valueOf = f16194c.l();
                    break;
                case '\"':
                    valueOf = f16194c.W((String) list.get(0));
                    break;
                case '#':
                    valueOf = f16194c.s((String) list.get(0));
                    break;
                case '$':
                    valueOf = f16194c.M(((Integer) list.get(0)).intValue(), (Double) list.get(1));
                    break;
                case '%':
                    valueOf = f16194c.L();
                    break;
                case '&':
                    valueOf = f16194c.c0();
                    break;
                case '\'':
                    valueOf = f16194c.t((String) list.get(0));
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    valueOf = f16194c.p(((Integer) list.get(0)).intValue());
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    valueOf = f16194c.q();
                    break;
                case '*':
                    valueOf = f16194c.E();
                    break;
                default:
                    dVar.c();
                    return;
            }
            dVar.a(valueOf);
        } catch (Exception e7) {
            e7.printStackTrace();
            dVar.b("Error: " + e7, null, null);
        }
    }
}
