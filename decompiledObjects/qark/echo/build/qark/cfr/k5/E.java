/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.media.AudioDeviceCallback
 *  android.media.AudioDeviceInfo
 *  android.media.AudioManager
 *  android.media.AudioManager$OnAudioFocusChangeListener
 *  android.media.MicrophoneInfo
 *  android.media.MicrophoneInfo$Coordinate3F
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Pair
 *  android.view.KeyEvent
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package k5;

import E5.k;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k0.f1;
import k5.A;
import k5.B;
import k5.C;
import k5.D;
import k5.b;
import k5.c;
import k5.d;
import k5.e;
import k5.f;
import k5.g;
import k5.h;
import k5.i;
import k5.j;
import k5.k;
import k5.l;
import k5.m;
import k5.n;
import k5.o;
import k5.p;
import k5.q;
import k5.r;
import k5.s;
import k5.t;
import k5.u;
import k5.v;
import k5.w;
import k5.x;
import k5.y;
import k5.z;

public class E
implements k.c {
    public static a c;
    public E5.c a;
    public E5.k b;

    public E(Context context, E5.c c8) {
        if (c == null) {
            c = new a(context);
        }
        this.a = c8;
        this.b = new E5.k(c8, "com.ryanheise.android_audio_manager");
        c.c(this);
        this.b.e(this);
    }

    public static ArrayList a(MicrophoneInfo.Coordinate3F coordinate3F) {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)Double.valueOf((double)b.a(coordinate3F)));
        arrayList.add((Object)Double.valueOf((double)c.a(coordinate3F)));
        arrayList.add((Object)Double.valueOf((double)d.a(coordinate3F)));
        return arrayList;
    }

    public static Map c(AudioDeviceInfo audioDeviceInfo) {
        String string2 = Build.VERSION.SDK_INT >= 28 ? k5.a.a(audioDeviceInfo) : null;
        return E.g(new Object[]{"id", audioDeviceInfo.getId(), "productName", audioDeviceInfo.getProductName(), "address", string2, "isSource", audioDeviceInfo.isSource(), "isSink", audioDeviceInfo.isSink(), "sampleRates", audioDeviceInfo.getSampleRates(), "channelMasks", audioDeviceInfo.getChannelMasks(), "channelIndexMasks", audioDeviceInfo.getChannelIndexMasks(), "channelCounts", audioDeviceInfo.getChannelCounts(), "encodings", audioDeviceInfo.getEncodings(), "type", audioDeviceInfo.getType()});
    }

    public static List d(AudioDeviceInfo[] arraudioDeviceInfo) {
        ArrayList arrayList = new ArrayList();
        int n8 = arraudioDeviceInfo.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            arrayList.add((Object)E.c(arraudioDeviceInfo[i8]));
        }
        return arrayList;
    }

    public static Long e(Object object) {
        if (object != null && !(object instanceof Long)) {
            return (long)((Integer)object);
        }
        return (Long)object;
    }

    public static ArrayList f(int[] arrn) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < arrn.length; ++i8) {
            arrayList.add((Object)arrn[i8]);
        }
        return arrayList;
    }

    public static /* varargs */ Map g(Object ... arrobject) {
        HashMap hashMap = new HashMap();
        for (int i8 = 0; i8 < arrobject.length; i8 += 2) {
            hashMap.put((Object)((String)arrobject[i8]), arrobject[i8 + 1]);
        }
        return hashMap;
    }

    public static void h(int n8) {
        if (Build.VERSION.SDK_INT >= n8) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Requires API level ");
        stringBuilder.append(n8);
        throw new RuntimeException(stringBuilder.toString());
    }

    public void b() {
        this.b.e(null);
        c.P(this);
        if (c.D()) {
            c.j();
            c = null;
        }
        this.b = null;
        this.a = null;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void onMethodCall(E5.j var1_1, k.d var2_2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.CannotPerformDecode: reachable test BLOCK was exited and re-entered.
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.getFarthestReachableInRange(Misc.java:143)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:385)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:65)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:423)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public static class a {
        public final Handler a = new Handler(Looper.getMainLooper());
        public List b = new ArrayList();
        public androidx.media.a c;
        public BroadcastReceiver d;
        public BroadcastReceiver e;
        public Context f;
        public AudioManager g;
        public Object h;
        public List i = new ArrayList();

        public a(Context context) {
            this.f = context;
            this.g = (AudioManager)context.getSystemService("audio");
            this.z();
        }

        public static /* synthetic */ void a(a a8, int n8) {
            a8.K(n8);
        }

        public /* varargs */ void A(String string2, Object ... arrobject) {
            for (E e8 : this.b) {
                ArrayList arrayList = new ArrayList((Collection)Arrays.asList((Object[])arrobject));
                e8.b.c(string2, (Object)arrayList);
            }
        }

        public Object B() {
            return this.g.isBluetoothScoAvailableOffCall();
        }

        public Object C() {
            return this.g.isBluetoothScoOn();
        }

        public boolean D() {
            if (this.b.size() == 0) {
                return true;
            }
            return false;
        }

        public Object E() {
            E.h(29);
            return n.a();
        }

        public Object F() {
            return this.g.isMicrophoneMute();
        }

        public Object G() {
            return this.g.isMusicActive();
        }

        public Object H() {
            return this.g.isSpeakerphoneOn();
        }

        public Object I(int n8) {
            E.h(23);
            return this.g.isStreamMute(n8);
        }

        public Object J() {
            E.h(21);
            return this.g.isVolumeFixed();
        }

        public final /* synthetic */ void K(int n8) {
            if (n8 == -1) {
                this.b();
            }
            this.A("onAudioFocusChanged", n8);
        }

        public Object L() {
            this.g.loadSoundEffects();
            return null;
        }

        public Object M(int n8, Double d8) {
            if (d8 != null) {
                this.g.playSoundEffect(n8, (float)d8.doubleValue());
            } else {
                this.g.playSoundEffect(n8);
            }
            return null;
        }

        public final void N() {
            BroadcastReceiver broadcastReceiver;
            if (this.d != null) {
                return;
            }
            this.d = broadcastReceiver = new BroadcastReceiver(){

                public void onReceive(Context context, Intent intent) {
                    if ("android.media.AUDIO_BECOMING_NOISY".equals((Object)intent.getAction())) {
                        a.this.A("onBecomingNoisy", new Object[0]);
                    }
                }
            };
            x.a.h(this.f, broadcastReceiver, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), 2);
        }

        public final void O() {
            BroadcastReceiver broadcastReceiver;
            if (this.e != null) {
                return;
            }
            this.e = broadcastReceiver = new BroadcastReceiver(){

                public void onReceive(Context context, Intent intent) {
                    a.this.A("onScoAudioStateUpdated", intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1), intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1));
                }
            };
            x.a.h(this.f, broadcastReceiver, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"), 2);
        }

        public void P(E e8) {
            this.b.remove((Object)e8);
        }

        public boolean Q(List object) {
            Object object2 = this.c;
            boolean bl = true;
            if (object2 != null) {
                return true;
            }
            object = (Map)object.get(0);
            object2 = new a.b((Integer)object.get((Object)"gainType"));
            object2.e(new D(this));
            if (object.get((Object)"audioAttributes") != null) {
                object2.c(this.h((Map)object.get((Object)"audioAttributes")));
            }
            if (object.get((Object)"willPauseWhenDucked") != null) {
                object2.g((Boolean)object.get((Object)"willPauseWhenDucked"));
            }
            this.c = object = object2.a();
            if (a0.b.b(this.g, (androidx.media.a)object) != 1) {
                bl = false;
            }
            if (bl) {
                this.N();
                this.O();
            }
            return bl;
        }

        public Object R(int n8) {
            E.h(29);
            s.a(this.g, n8);
            return null;
        }

        public Object S(boolean bl) {
            this.g.setBluetoothScoOn(bl);
            return null;
        }

        public boolean T(Integer n8) {
            E.h(31);
            for (AudioDeviceInfo audioDeviceInfo : this.i) {
                if (audioDeviceInfo.getId() != n8.intValue()) continue;
                return u.a(this.g, audioDeviceInfo);
            }
            return false;
        }

        public Object U(boolean bl) {
            this.g.setMicrophoneMute(bl);
            return null;
        }

        public Object V(int n8) {
            this.g.setMode(n8);
            return null;
        }

        public Object W(String string2) {
            this.g.setParameters(string2);
            return null;
        }

        public Object X(int n8) {
            this.g.setRingerMode(n8);
            return null;
        }

        public Object Y(boolean bl) {
            this.g.setSpeakerphoneOn(bl);
            return null;
        }

        public Object Z(int n8, int n9, int n10) {
            this.g.setStreamVolume(n8, n9, n10);
            return null;
        }

        public Object a0() {
            this.g.startBluetoothSco();
            return null;
        }

        public boolean b() {
            Object object = this.f;
            boolean bl = false;
            if (object == null) {
                return false;
            }
            this.d0();
            this.e0();
            object = this.c;
            if (object == null) {
                return true;
            }
            int n8 = a0.b.a(this.g, (androidx.media.a)object);
            this.c = null;
            if (n8 == 1) {
                bl = true;
            }
            return bl;
        }

        public Object b0() {
            this.g.stopBluetoothSco();
            return null;
        }

        public void c(E e8) {
            this.b.add((Object)e8);
        }

        public Object c0() {
            this.g.unloadSoundEffects();
            return null;
        }

        public Object d(int n8, int n9, int n10) {
            this.g.adjustStreamVolume(n8, n9, n10);
            return null;
        }

        public final void d0() {
            BroadcastReceiver broadcastReceiver = this.d;
            if (broadcastReceiver != null) {
                Context context = this.f;
                if (context == null) {
                    return;
                }
                context.unregisterReceiver(broadcastReceiver);
                this.d = null;
            }
        }

        public Object e(int n8, int n9, int n10) {
            this.g.adjustSuggestedStreamVolume(n8, n9, n10);
            return null;
        }

        public final void e0() {
            BroadcastReceiver broadcastReceiver = this.e;
            if (broadcastReceiver != null) {
                Context context = this.f;
                if (context == null) {
                    return;
                }
                context.unregisterReceiver(broadcastReceiver);
                this.e = null;
            }
        }

        public Object f(int n8, int n9) {
            this.g.adjustVolume(n8, n9);
            return null;
        }

        public Object g() {
            E.h(31);
            q.a(this.g);
            return null;
        }

        public final AudioAttributesCompat h(Map map) {
            AudioAttributesCompat.a a8 = new AudioAttributesCompat.a();
            if (map.get((Object)"contentType") != null) {
                a8.b((Integer)map.get((Object)"contentType"));
            }
            if (map.get((Object)"flags") != null) {
                a8.c((Integer)map.get((Object)"flags"));
            }
            if (map.get((Object)"usage") != null) {
                a8.d((Integer)map.get((Object)"usage"));
            }
            return a8.a();
        }

        public Object i(Map map) {
            map = new KeyEvent(E.e(map.get((Object)"downTime")).longValue(), E.e(map.get((Object)"eventTime")).longValue(), ((Integer)map.get((Object)"action")).intValue(), ((Integer)map.get((Object)"keyCode")).intValue(), ((Integer)map.get((Object)"repeatCount")).intValue(), ((Integer)map.get((Object)"metaState")).intValue(), ((Integer)map.get((Object)"deviceId")).intValue(), ((Integer)map.get((Object)"scanCode")).intValue(), ((Integer)map.get((Object)"flags")).intValue(), ((Integer)map.get((Object)"source")).intValue());
            this.g.dispatchMediaKeyEvent((KeyEvent)map);
            return null;
        }

        public void j() {
            this.b();
            this.k();
            this.f = null;
            this.g = null;
        }

        public final void k() {
            this.g.unregisterAudioDeviceCallback((AudioDeviceCallback)this.h);
        }

        public Object l() {
            E.h(21);
            return this.g.generateAudioSessionId();
        }

        public Object m() {
            E.h(29);
            return r.a(this.g);
        }

        public List n() {
            E.h(31);
            this.i = t.a(this.g);
            ArrayList arrayList = new ArrayList();
            Iterator iterator = this.i.iterator();
            while (iterator.hasNext()) {
                arrayList.add((Object)E.c((AudioDeviceInfo)iterator.next()));
            }
            return arrayList;
        }

        public Map o() {
            E.h(31);
            return E.c(o.a(this.g));
        }

        public Object p(int n8) {
            E.h(23);
            ArrayList arrayList = new ArrayList();
            AudioDeviceInfo[] arraudioDeviceInfo = this.g.getDevices(n8);
            for (n8 = 0; n8 < arraudioDeviceInfo.length; ++n8) {
                AudioDeviceInfo audioDeviceInfo = arraudioDeviceInfo[n8];
                String string2 = Build.VERSION.SDK_INT >= 28 ? k5.a.a(audioDeviceInfo) : null;
                arrayList.add((Object)E.g(new Object[]{"id", audioDeviceInfo.getId(), "productName", audioDeviceInfo.getProductName(), "address", string2, "isSource", audioDeviceInfo.isSource(), "isSink", audioDeviceInfo.isSink(), "sampleRates", E.f(audioDeviceInfo.getSampleRates()), "channelMasks", E.f(audioDeviceInfo.getChannelMasks()), "channelIndexMasks", E.f(audioDeviceInfo.getChannelIndexMasks()), "channelCounts", E.f(audioDeviceInfo.getChannelCounts()), "encodings", E.f(audioDeviceInfo.getEncodings()), "type", audioDeviceInfo.getType()}));
            }
            return arrayList;
        }

        public Object q() {
            E.h(28);
            ArrayList arrayList = new ArrayList();
            Iterator iterator = p.a(this.g).iterator();
            while (iterator.hasNext()) {
                MicrophoneInfo microphoneInfo = C.a(iterator.next());
                ArrayList arrayList2 = new ArrayList();
                for (Pair pair : f.a(microphoneInfo)) {
                    arrayList2.add((Object)new ArrayList((Collection)Arrays.asList((Object[])new Double[]{((Float)pair.first).floatValue(), ((Float)pair.second).floatValue()})));
                }
                Iterator iterator2 = new ArrayList();
                for (Pair pair : g.a(microphoneInfo)) {
                    iterator2.add((Object)new ArrayList((Collection)Arrays.asList((Object[])new Integer[]{(Integer)pair.first, (Integer)pair.second})));
                }
                arrayList.add((Object)E.g(new Object[]{"description", h.a(microphoneInfo), "id", i.a(microphoneInfo), "type", j.a(microphoneInfo), "address", k.a(microphoneInfo), "location", l.a(microphoneInfo), "group", m.a(microphoneInfo), "indexInTheGroup", v.a(microphoneInfo), "position", E.a(w.a(microphoneInfo)), "orientation", E.a(x.a(microphoneInfo)), "frequencyResponse", arrayList2, "channelMapping", iterator2, "sensitivity", Float.valueOf((float)y.a(microphoneInfo)), "maxSpl", Float.valueOf((float)z.a(microphoneInfo)), "minSpl", Float.valueOf((float)A.a(microphoneInfo)), "directionality", B.a(microphoneInfo)}));
            }
            return arrayList;
        }

        public Object r() {
            return this.g.getMode();
        }

        public Object s(String string2) {
            return this.g.getParameters(string2);
        }

        public Object t(String string2) {
            return this.g.getProperty(string2);
        }

        public Object u() {
            return this.g.getRingerMode();
        }

        public Object v(int n8) {
            return this.g.getStreamMaxVolume(n8);
        }

        public Object w(int n8) {
            E.h(28);
            return f1.a(this.g, n8);
        }

        public Object x(int n8) {
            return this.g.getStreamVolume(n8);
        }

        public Object y(int n8, int n9, int n10) {
            E.h(28);
            return Float.valueOf((float)e.a(this.g, n8, n9, n10));
        }

        public final void z() {
            AudioDeviceCallback audioDeviceCallback = new AudioDeviceCallback(){

                public void onAudioDevicesAdded(AudioDeviceInfo[] arraudioDeviceInfo) {
                    a.this.A("onAudioDevicesAdded", new Object[]{E.d(arraudioDeviceInfo)});
                }

                public void onAudioDevicesRemoved(AudioDeviceInfo[] arraudioDeviceInfo) {
                    a.this.A("onAudioDevicesRemoved", new Object[]{E.d(arraudioDeviceInfo)});
                }
            };
            this.h = audioDeviceCallback;
            this.g.registerAudioDeviceCallback(audioDeviceCallback, this.a);
        }

    }

}

