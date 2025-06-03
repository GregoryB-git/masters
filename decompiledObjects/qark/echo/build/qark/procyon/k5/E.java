// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k5;

import k0.f1;
import android.media.MicrophoneInfo;
import android.util.Pair;
import android.media.AudioDeviceCallback;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import android.media.AudioManager$OnAudioFocusChangeListener;
import android.content.IntentFilter;
import android.content.Intent;
import java.util.Iterator;
import java.util.Collection;
import java.util.Arrays;
import android.os.Looper;
import android.media.AudioManager;
import android.content.BroadcastReceiver;
import android.os.Handler;
import E5.j;
import java.util.HashMap;
import java.util.List;
import android.os.Build$VERSION;
import java.util.Map;
import android.media.AudioDeviceInfo;
import java.util.ArrayList;
import android.media.MicrophoneInfo$Coordinate3F;
import android.content.Context;
import E5.c;
import E5.k;

public class E implements c
{
    public static a c;
    public E5.c a;
    public k b;
    
    public E(final Context context, final E5.c a) {
        if (E.c == null) {
            E.c = new a(context);
        }
        this.a = a;
        this.b = new k(a, "com.ryanheise.android_audio_manager");
        E.c.c(this);
        this.b.e((k.c)this);
    }
    
    public static ArrayList a(final MicrophoneInfo$Coordinate3F microphoneInfo$Coordinate3F) {
        final ArrayList<Double> list = new ArrayList<Double>();
        list.add((double)k5.b.a(microphoneInfo$Coordinate3F));
        list.add((double)k5.c.a(microphoneInfo$Coordinate3F));
        list.add((double)k5.d.a(microphoneInfo$Coordinate3F));
        return list;
    }
    
    public static Map c(final AudioDeviceInfo audioDeviceInfo) {
        String a;
        if (Build$VERSION.SDK_INT >= 28) {
            a = k5.a.a(audioDeviceInfo);
        }
        else {
            a = null;
        }
        return g("id", audioDeviceInfo.getId(), "productName", audioDeviceInfo.getProductName(), "address", a, "isSource", audioDeviceInfo.isSource(), "isSink", audioDeviceInfo.isSink(), "sampleRates", audioDeviceInfo.getSampleRates(), "channelMasks", audioDeviceInfo.getChannelMasks(), "channelIndexMasks", audioDeviceInfo.getChannelIndexMasks(), "channelCounts", audioDeviceInfo.getChannelCounts(), "encodings", audioDeviceInfo.getEncodings(), "type", audioDeviceInfo.getType());
    }
    
    public static List d(final AudioDeviceInfo[] array) {
        final ArrayList<Map> list = new ArrayList<Map>();
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(c(array[i]));
        }
        return list;
    }
    
    public static Long e(final Object o) {
        if (o != null && !(o instanceof Long)) {
            return (long)(int)o;
        }
        return (Long)o;
    }
    
    public static ArrayList f(final int[] array) {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; ++i) {
            list.add(array[i]);
        }
        return list;
    }
    
    public static Map g(final Object... array) {
        final HashMap<String, Object> hashMap = new HashMap<String, Object>();
        for (int i = 0; i < array.length; i += 2) {
            hashMap.put((String)array[i], array[i + 1]);
        }
        return hashMap;
    }
    
    public static void h(final int i) {
        if (Build$VERSION.SDK_INT >= i) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Requires API level ");
        sb.append(i);
        throw new RuntimeException(sb.toString());
    }
    
    public void b() {
        this.b.e(null);
        E.c.P(this);
        if (E.c.D()) {
            E.c.j();
            E.c = null;
        }
        this.b = null;
        this.a = null;
    }
    
    @Override
    public void onMethodCall(final j j, final d d) {
        while (true) {
        Label_1248_Outer:
            while (true) {
            Label_1340_Outer:
                while (true) {
                Label_1306_Outer:
                    while (true) {
                    Label_1878_Outer:
                        while (true) {
                        Label_1404_Outer:
                            while (true) {
                            Label_1316_Outer:
                                while (true) {
                                Label_1272_Outer:
                                    while (true) {
                                    Label_1438_Outer:
                                        while (true) {
                                        Label_1726_Outer:
                                            while (true) {
                                            Label_1644_Outer:
                                                while (true) {
                                                Label_1482_Outer:
                                                    while (true) {
                                                    Label_1131_Outer:
                                                        while (true) {
                                                        Label_1076_Outer:
                                                            while (true) {
                                                            Label_1692_Outer:
                                                                while (true) {
                                                                Label_1228_Outer:
                                                                    while (true) {
                                                                    Label_1414_Outer:
                                                                        while (true) {
                                                                        Label_1912_Outer:
                                                                            while (true) {
                                                                            Label_1121_Outer:
                                                                                while (true) {
                                                                                Label_1100_Outer:
                                                                                    while (true) {
                                                                                    Label_1716_Outer:
                                                                                        while (true) {
                                                                                        Label_1380_Outer:
                                                                                            while (true) {
                                                                                            Label_1458_Outer:
                                                                                                while (true) {
                                                                                                Label_1350_Outer:
                                                                                                    while (true) {
                                                                                                    Label_1448_Outer:
                                                                                                        while (true) {
                                                                                                        Label_1492_Outer:
                                                                                                            while (true) {
                                                                                                            Label_1592_Outer:
                                                                                                                while (true) {
                                                                                                                Label_1899_Outer:
                                                                                                                    while (true) {
                                                                                                                    Label_1051_Outer:
                                                                                                                        while (true) {
                                                                                                                        Label_1176_Outer:
                                                                                                                            while (true) {
                                                                                                                            Label_1778_Outer:
                                                                                                                                while (true) {
                                                                                                                                Label_1868_Outer:
                                                                                                                                    while (true) {
                                                                                                                                    Label_1218_Outer:
                                                                                                                                        while (true) {
                                                                                                                                        Label_1816_Outer:
                                                                                                                                            while (true) {
                                                                                                                                            Label_1568_Outer:
                                                                                                                                                while (true) {
                                                                                                                                                Label_1141_Outer:
                                                                                                                                                    while (true) {
                                                                                                                                                    Label_1238_Outer:
                                                                                                                                                        while (true) {
                                                                                                                                                        Label_1044_Outer:
                                                                                                                                                            while (true) {
                                                                                                                                                            Label_1370_Outer:
                                                                                                                                                                while (true) {
                                                                                                                                                                Label_1360_Outer:
                                                                                                                                                                    while (true) {
                                                                                                                                                                    Label_1197_Outer:
                                                                                                                                                                        while (true) {
                                                                                                                                                                        Label_1066_Outer:
                                                                                                                                                                            while (true) {
                                                                                                                                                                            Label_1282_Outer:
                                                                                                                                                                                while (true) {
                                                                                                                                                                                Label_1516_Outer:
                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        while (true) {
                                                                                                                                                                                            int n = 0;
                                                                                                                                                                                            Label_1978: {
                                                                                                                                                                                                Label_1976: {
                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            final List list = (List)j.b;
                                                                                                                                                                                                            final String a = j.a;
                                                                                                                                                                                                            switch (a.hashCode()) {
                                                                                                                                                                                                                case 2093966320: {
                                                                                                                                                                                                                    if (a.equals("generateAudioSessionId")) {
                                                                                                                                                                                                                        n = 33;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case 1986792688: {
                                                                                                                                                                                                                    if (a.equals("isVolumeFixed")) {
                                                                                                                                                                                                                        n = 3;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case 1984784677: {
                                                                                                                                                                                                                    if (a.equals("setMode")) {
                                                                                                                                                                                                                        n = 30;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case 1570996442: {
                                                                                                                                                                                                                    if (a.equals("getAvailableCommunicationDevices")) {
                                                                                                                                                                                                                        n = 15;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case 1504508844: {
                                                                                                                                                                                                                    if (a.equals("playSoundEffect")) {
                                                                                                                                                                                                                        n = 36;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case 1397925922: {
                                                                                                                                                                                                                    if (a.equals("setRingerMode")) {
                                                                                                                                                                                                                        n = 12;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case 1378317714: {
                                                                                                                                                                                                                    if (a.equals("unloadSoundEffects")) {
                                                                                                                                                                                                                        n = 38;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case 1357290231: {
                                                                                                                                                                                                                    if (a.equals("abandonAudioFocus")) {
                                                                                                                                                                                                                        n = 1;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case 1258134830: {
                                                                                                                                                                                                                    if (a.equals("adjustSuggestedStreamVolume")) {
                                                                                                                                                                                                                        n = 6;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case 1241312831: {
                                                                                                                                                                                                                    if (a.equals("clearCommunicationDevice")) {
                                                                                                                                                                                                                        n = 18;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case 1187450940: {
                                                                                                                                                                                                                    if (a.equals("setStreamVolume")) {
                                                                                                                                                                                                                        n = 13;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case 1163405254: {
                                                                                                                                                                                                                    if (a.equals("getAllowedCapturePolicy")) {
                                                                                                                                                                                                                        n = 22;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case 1084758859: {
                                                                                                                                                                                                                    if (a.equals("getProperty")) {
                                                                                                                                                                                                                        n = 39;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case 976310915: {
                                                                                                                                                                                                                    if (a.equals("isStreamMute")) {
                                                                                                                                                                                                                        n = 14;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case 954131337: {
                                                                                                                                                                                                                    if (a.equals("adjustVolume")) {
                                                                                                                                                                                                                        n = 5;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case 935118828: {
                                                                                                                                                                                                                    if (a.equals("setParameters")) {
                                                                                                                                                                                                                        n = 34;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case 623794710: {
                                                                                                                                                                                                                    if (a.equals("getRingerMode")) {
                                                                                                                                                                                                                        n = 7;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case 469094495: {
                                                                                                                                                                                                                    if (a.equals("isBluetoothScoAvailableOffCall")) {
                                                                                                                                                                                                                        n = 23;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case 276698416: {
                                                                                                                                                                                                                    if (a.equals("getStreamVolume")) {
                                                                                                                                                                                                                        n = 10;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case 186762163: {
                                                                                                                                                                                                                    if (a.equals("stopBluetoothSco")) {
                                                                                                                                                                                                                        n = 25;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case 160987616: {
                                                                                                                                                                                                                    if (a.equals("getParameters")) {
                                                                                                                                                                                                                        n = 35;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case 152385829: {
                                                                                                                                                                                                                    if (a.equals("dispatchMediaKeyEvent")) {
                                                                                                                                                                                                                        n = 2;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case -75324903: {
                                                                                                                                                                                                                    if (a.equals("getMode")) {
                                                                                                                                                                                                                        n = 31;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case -380792370: {
                                                                                                                                                                                                                    if (a.equals("getStreamVolumeDb")) {
                                                                                                                                                                                                                        n = 11;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case -445792758: {
                                                                                                                                                                                                                    if (a.equals("setCommunicationDevice")) {
                                                                                                                                                                                                                        n = 16;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case -580980717: {
                                                                                                                                                                                                                    if (a.equals("startBluetoothSco")) {
                                                                                                                                                                                                                        n = 24;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case -694417919: {
                                                                                                                                                                                                                    if (a.equals("isMusicActive")) {
                                                                                                                                                                                                                        n = 32;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case -763512583: {
                                                                                                                                                                                                                    if (a.equals("loadSoundEffects")) {
                                                                                                                                                                                                                        n = 37;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case -809761226: {
                                                                                                                                                                                                                    if (a.equals("getStreamMinVolume")) {
                                                                                                                                                                                                                        n = 9;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case -1018676910: {
                                                                                                                                                                                                                    if (a.equals("setBluetoothScoOn")) {
                                                                                                                                                                                                                        n = 26;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case -1079290158: {
                                                                                                                                                                                                                    if (a.equals("setAllowedCapturePolicy")) {
                                                                                                                                                                                                                        n = 21;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case -1091382445: {
                                                                                                                                                                                                                    if (a.equals("getMicrophones")) {
                                                                                                                                                                                                                        n = 41;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case -1197068311: {
                                                                                                                                                                                                                    if (a.equals("adjustStreamVolume")) {
                                                                                                                                                                                                                        n = 4;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case -1285190630: {
                                                                                                                                                                                                                    if (a.equals("isBluetoothScoOn")) {
                                                                                                                                                                                                                        n = 27;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case -1296413680: {
                                                                                                                                                                                                                    if (a.equals("setSpeakerphoneOn")) {
                                                                                                                                                                                                                        n = 19;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case -1413157019: {
                                                                                                                                                                                                                    if (a.equals("setMicrophoneMute")) {
                                                                                                                                                                                                                        n = 28;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case -1504647535: {
                                                                                                                                                                                                                    if (a.equals("requestAudioFocus")) {
                                                                                                                                                                                                                        n = 0;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case -1524320654: {
                                                                                                                                                                                                                    if (a.equals("isHapticPlaybackSupported")) {
                                                                                                                                                                                                                        n = 42;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case -1562927400: {
                                                                                                                                                                                                                    if (a.equals("isSpeakerphoneOn")) {
                                                                                                                                                                                                                        n = 20;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case -1582239800: {
                                                                                                                                                                                                                    if (a.equals("getStreamMaxVolume")) {
                                                                                                                                                                                                                        n = 8;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case -1679670739: {
                                                                                                                                                                                                                    if (a.equals("isMicrophoneMute")) {
                                                                                                                                                                                                                        n = 29;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case -1698305881: {
                                                                                                                                                                                                                    if (a.equals("getDevices")) {
                                                                                                                                                                                                                        n = 40;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case -1758921066: {
                                                                                                                                                                                                                    if (a.equals("getCommunicationDevice")) {
                                                                                                                                                                                                                        n = 17;
                                                                                                                                                                                                                        break Label_1978;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                default: {
                                                                                                                                                                                                                    break Label_1976;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            Object o = E.c.w(list.get(0));
                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.V(list.get(0));
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.b0();
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.C();
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                final Exception obj;
                                                                                                                                                                                                                obj.printStackTrace();
                                                                                                                                                                                                                final StringBuilder sb = new StringBuilder();
                                                                                                                                                                                                                sb.append("Error: ");
                                                                                                                                                                                                                sb.append(obj);
                                                                                                                                                                                                                d.b(sb.toString(), null, null);
                                                                                                                                                                                                                return;
                                                                                                                                                                                                                o = E.c.i((Map)list.get(0));
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.H();
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.S((Boolean)(Object)list.get(0));
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.F();
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.g();
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.e(list.get(0), list.get(1), list.get(2));
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.x(list.get(0));
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.n();
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.L();
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.p(list.get(0));
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.v(list.get(0));
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.G();
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.Y((Boolean)(Object)list.get(0));
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.Q(list);
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.c0();
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.t((String)list.get(0));
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.u();
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.R(list.get(0));
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.T(list.get(0));
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.a0();
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.o();
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.I(list.get(0));
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.y(list.get(0), list.get(1), list.get(2));
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.b();
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.E();
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.s((String)list.get(0));
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.f(list.get(0), list.get(1));
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.J();
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.l();
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.d(list.get(0), list.get(1), list.get(2));
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.X(list.get(0));
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.M(list.get(0), Double.valueOf(list.get(1)));
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.r();
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                d.c();
                                                                                                                                                                                                                return;
                                                                                                                                                                                                                o = E.c.m();
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.B();
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.W((String)list.get(0));
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.q();
                                                                                                                                                                                                                break Label_1058;
                                                                                                                                                                                                                o = E.c.U((Boolean)(Object)list.get(0));
                                                                                                                                                                                                                d.a(o);
                                                                                                                                                                                                                return;
                                                                                                                                                                                                                o = E.c.Z(list.get(0), list.get(1), list.get(2));
                                                                                                                                                                                                                continue Label_1248_Outer;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (Exception ex) {}
                                                                                                                                                                                                        final Exception ex;
                                                                                                                                                                                                        final Exception obj = ex;
                                                                                                                                                                                                        continue Label_1878_Outer;
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                n = -1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (n) {
                                                                                                                                                                                                case 42: {
                                                                                                                                                                                                    continue Label_1176_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 41: {
                                                                                                                                                                                                    continue Label_1282_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 40: {
                                                                                                                                                                                                    continue Label_1692_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 39: {
                                                                                                                                                                                                    continue Label_1716_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 38: {
                                                                                                                                                                                                    continue Label_1100_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 37: {
                                                                                                                                                                                                    continue Label_1076_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 36: {
                                                                                                                                                                                                    continue Label_1238_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 35: {
                                                                                                                                                                                                    continue Label_1778_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 34: {
                                                                                                                                                                                                    continue Label_1066_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 33: {
                                                                                                                                                                                                    continue Label_1816_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 32: {
                                                                                                                                                                                                    continue Label_1414_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 31: {
                                                                                                                                                                                                    continue Label_1044_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 30: {
                                                                                                                                                                                                    continue Label_1340_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 29: {
                                                                                                                                                                                                    continue Label_1438_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 28: {
                                                                                                                                                                                                    continue Label_1516_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 27: {
                                                                                                                                                                                                    continue Label_1878_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 26: {
                                                                                                                                                                                                    continue Label_1272_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 25: {
                                                                                                                                                                                                    continue Label_1306_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 24: {
                                                                                                                                                                                                    continue Label_1448_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 23: {
                                                                                                                                                                                                    continue Label_1197_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 22: {
                                                                                                                                                                                                    continue Label_1360_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 21: {
                                                                                                                                                                                                    continue Label_1458_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 20: {
                                                                                                                                                                                                    continue Label_1316_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 19: {
                                                                                                                                                                                                    continue Label_1912_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 18: {
                                                                                                                                                                                                    continue Label_1726_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 17: {
                                                                                                                                                                                                    continue Label_1492_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 16: {
                                                                                                                                                                                                    continue Label_1350_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 15: {
                                                                                                                                                                                                    continue Label_1131_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 14: {
                                                                                                                                                                                                    continue Label_1592_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 13: {
                                                                                                                                                                                                    continue;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 12: {
                                                                                                                                                                                                    continue Label_1141_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 11: {
                                                                                                                                                                                                    continue Label_1899_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 10: {
                                                                                                                                                                                                    continue Label_1482_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 9: {
                                                                                                                                                                                                    continue Label_1248_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 8: {
                                                                                                                                                                                                    continue Label_1228_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 7: {
                                                                                                                                                                                                    continue Label_1380_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 6: {
                                                                                                                                                                                                    continue Label_1644_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 5: {
                                                                                                                                                                                                    continue Label_1868_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 4: {
                                                                                                                                                                                                    continue Label_1568_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 3: {
                                                                                                                                                                                                    continue Label_1218_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 2: {
                                                                                                                                                                                                    continue Label_1404_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 1: {
                                                                                                                                                                                                    continue Label_1051_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 0: {
                                                                                                                                                                                                    continue Label_1121_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                default: {
                                                                                                                                                                                                    continue Label_1370_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            break;
                                                                                                                                                                                        }
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                            }
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                                }
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                }
                                                                                                                break;
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                break;
            }
        }
    }
    
    public static class a
    {
        public final Handler a;
        public List b;
        public androidx.media.a c;
        public BroadcastReceiver d;
        public BroadcastReceiver e;
        public Context f;
        public AudioManager g;
        public Object h;
        public List i;
        
        public a(final Context f) {
            this.a = new Handler(Looper.getMainLooper());
            this.b = new ArrayList();
            this.i = new ArrayList();
            this.f = f;
            this.g = (AudioManager)f.getSystemService("audio");
            this.z();
        }
        
        public void A(final String s, final Object... a) {
            final Iterator<E> iterator = this.b.iterator();
            while (iterator.hasNext()) {
                iterator.next().b.c(s, new ArrayList(Arrays.asList(a)));
            }
        }
        
        public Object B() {
            return this.g.isBluetoothScoAvailableOffCall();
        }
        
        public Object C() {
            return this.g.isBluetoothScoOn();
        }
        
        public boolean D() {
            return this.b.size() == 0;
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
        
        public Object I(final int n) {
            E.h(23);
            return this.g.isStreamMute(n);
        }
        
        public Object J() {
            E.h(21);
            return this.g.isVolumeFixed();
        }
        
        public Object L() {
            this.g.loadSoundEffects();
            return null;
        }
        
        public Object M(final int n, final Double n2) {
            if (n2 != null) {
                this.g.playSoundEffect(n, (float)(double)n2);
            }
            else {
                this.g.playSoundEffect(n);
            }
            return null;
        }
        
        public final void N() {
            if (this.d != null) {
                return;
            }
            final BroadcastReceiver d = new BroadcastReceiver() {
                public void onReceive(final Context context, final Intent intent) {
                    if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                        E.a.this.A("onBecomingNoisy", new Object[0]);
                    }
                }
            };
            this.d = d;
            x.a.h(this.f, d, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), 2);
        }
        
        public final void O() {
            if (this.e != null) {
                return;
            }
            final BroadcastReceiver e = new BroadcastReceiver() {
                public void onReceive(final Context context, final Intent intent) {
                    E.a.this.A("onScoAudioStateUpdated", intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1), intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1));
                }
            };
            this.e = e;
            x.a.h(this.f, e, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"), 2);
        }
        
        public void P(final E e) {
            this.b.remove(e);
        }
        
        public boolean Q(final List list) {
            final androidx.media.a c = this.c;
            boolean b = true;
            if (c != null) {
                return true;
            }
            final Map<K, Integer> map = list.get(0);
            final androidx.media.a.b b2 = new androidx.media.a.b(map.get("gainType"));
            b2.e((AudioManager$OnAudioFocusChangeListener)new D(this));
            if (map.get("audioAttributes") != null) {
                b2.c(this.h((Map)map.get("audioAttributes")));
            }
            if (map.get("willPauseWhenDucked") != null) {
                b2.g((Boolean)(Object)map.get("willPauseWhenDucked"));
            }
            final androidx.media.a a = b2.a();
            this.c = a;
            if (a0.b.b(this.g, a) != 1) {
                b = false;
            }
            if (b) {
                this.N();
                this.O();
            }
            return b;
        }
        
        public Object R(final int n) {
            E.h(29);
            s.a(this.g, n);
            return null;
        }
        
        public Object S(final boolean bluetoothScoOn) {
            this.g.setBluetoothScoOn(bluetoothScoOn);
            return null;
        }
        
        public boolean T(final Integer n) {
            E.h(31);
            for (final AudioDeviceInfo audioDeviceInfo : this.i) {
                if (audioDeviceInfo.getId() == n) {
                    return u.a(this.g, audioDeviceInfo);
                }
            }
            return false;
        }
        
        public Object U(final boolean microphoneMute) {
            this.g.setMicrophoneMute(microphoneMute);
            return null;
        }
        
        public Object V(final int mode) {
            this.g.setMode(mode);
            return null;
        }
        
        public Object W(final String parameters) {
            this.g.setParameters(parameters);
            return null;
        }
        
        public Object X(final int ringerMode) {
            this.g.setRingerMode(ringerMode);
            return null;
        }
        
        public Object Y(final boolean speakerphoneOn) {
            this.g.setSpeakerphoneOn(speakerphoneOn);
            return null;
        }
        
        public Object Z(final int n, final int n2, final int n3) {
            this.g.setStreamVolume(n, n2, n3);
            return null;
        }
        
        public Object a0() {
            this.g.startBluetoothSco();
            return null;
        }
        
        public boolean b() {
            final Context f = this.f;
            boolean b = false;
            if (f == null) {
                return false;
            }
            this.d0();
            this.e0();
            final androidx.media.a c = this.c;
            if (c == null) {
                return true;
            }
            final int a = a0.b.a(this.g, c);
            this.c = null;
            if (a == 1) {
                b = true;
            }
            return b;
        }
        
        public Object b0() {
            this.g.stopBluetoothSco();
            return null;
        }
        
        public void c(final E e) {
            this.b.add(e);
        }
        
        public Object c0() {
            this.g.unloadSoundEffects();
            return null;
        }
        
        public Object d(final int n, final int n2, final int n3) {
            this.g.adjustStreamVolume(n, n2, n3);
            return null;
        }
        
        public final void d0() {
            final BroadcastReceiver d = this.d;
            if (d != null) {
                final Context f = this.f;
                if (f == null) {
                    return;
                }
                f.unregisterReceiver(d);
                this.d = null;
            }
        }
        
        public Object e(final int n, final int n2, final int n3) {
            this.g.adjustSuggestedStreamVolume(n, n2, n3);
            return null;
        }
        
        public final void e0() {
            final BroadcastReceiver e = this.e;
            if (e != null) {
                final Context f = this.f;
                if (f == null) {
                    return;
                }
                f.unregisterReceiver(e);
                this.e = null;
            }
        }
        
        public Object f(final int n, final int n2) {
            this.g.adjustVolume(n, n2);
            return null;
        }
        
        public Object g() {
            E.h(31);
            q.a(this.g);
            return null;
        }
        
        public final AudioAttributesCompat h(final Map map) {
            final AudioAttributesCompat.a a = new AudioAttributesCompat.a();
            if (map.get("contentType") != null) {
                a.b(map.get("contentType"));
            }
            if (map.get("flags") != null) {
                a.c(map.get("flags"));
            }
            if (map.get("usage") != null) {
                a.d(map.get("usage"));
            }
            return a.a();
        }
        
        public Object i(final Map map) {
            this.g.dispatchMediaKeyEvent(new KeyEvent((long)E.e(map.get("downTime")), (long)E.e(map.get("eventTime")), (int)map.get("action"), (int)map.get("keyCode"), (int)map.get("repeatCount"), (int)map.get("metaState"), (int)map.get("deviceId"), (int)map.get("scanCode"), (int)map.get("flags"), (int)map.get("source")));
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
            final ArrayList<Map> list = new ArrayList<Map>();
            final Iterator<AudioDeviceInfo> iterator = this.i.iterator();
            while (iterator.hasNext()) {
                list.add(E.c(iterator.next()));
            }
            return list;
        }
        
        public Map o() {
            E.h(31);
            return E.c(o.a(this.g));
        }
        
        public Object p(int i) {
            E.h(23);
            final ArrayList<Map> list = new ArrayList<Map>();
            AudioDeviceInfo[] devices;
            AudioDeviceInfo audioDeviceInfo;
            String a;
            for (devices = this.g.getDevices(i), i = 0; i < devices.length; ++i) {
                audioDeviceInfo = devices[i];
                if (Build$VERSION.SDK_INT >= 28) {
                    a = k5.a.a(audioDeviceInfo);
                }
                else {
                    a = null;
                }
                list.add(E.g("id", audioDeviceInfo.getId(), "productName", audioDeviceInfo.getProductName(), "address", a, "isSource", audioDeviceInfo.isSource(), "isSink", audioDeviceInfo.isSink(), "sampleRates", E.f(audioDeviceInfo.getSampleRates()), "channelMasks", E.f(audioDeviceInfo.getChannelMasks()), "channelIndexMasks", E.f(audioDeviceInfo.getChannelIndexMasks()), "channelCounts", E.f(audioDeviceInfo.getChannelCounts()), "encodings", E.f(audioDeviceInfo.getEncodings()), "type", audioDeviceInfo.getType()));
            }
            return list;
        }
        
        public Object q() {
            E.h(28);
            final ArrayList<Map> list = new ArrayList<Map>();
            final Iterator<Object> iterator = p.a(this.g).iterator();
            while (iterator.hasNext()) {
                final MicrophoneInfo a = C.a(iterator.next());
                final ArrayList<ArrayList> list2 = new ArrayList<ArrayList>();
                for (final Pair pair : k5.f.a(a)) {
                    list2.add(new ArrayList(Arrays.asList((double)(float)pair.first, (double)(float)pair.second)));
                }
                final ArrayList<ArrayList> list3 = new ArrayList<ArrayList>();
                for (final Pair pair2 : k5.g.a(a)) {
                    list3.add(new ArrayList(Arrays.asList((Integer)pair2.first, (Integer)pair2.second)));
                }
                list.add(E.g("description", k5.h.a(a), "id", k5.i.a(a), "type", k5.j.a(a), "address", k5.k.a(a), "location", l.a(a), "group", m.a(a), "indexInTheGroup", v.a(a), "position", E.a(w.a(a)), "orientation", E.a(x.a(a)), "frequencyResponse", list2, "channelMapping", list3, "sensitivity", y.a(a), "maxSpl", z.a(a), "minSpl", A.a(a), "directionality", B.a(a)));
            }
            return list;
        }
        
        public Object r() {
            return this.g.getMode();
        }
        
        public Object s(final String s) {
            return this.g.getParameters(s);
        }
        
        public Object t(final String s) {
            return this.g.getProperty(s);
        }
        
        public Object u() {
            return this.g.getRingerMode();
        }
        
        public Object v(final int n) {
            return this.g.getStreamMaxVolume(n);
        }
        
        public Object w(final int n) {
            E.h(28);
            return f1.a(this.g, n);
        }
        
        public Object x(final int n) {
            return this.g.getStreamVolume(n);
        }
        
        public Object y(final int n, final int n2, final int n3) {
            E.h(28);
            return k5.e.a(this.g, n, n2, n3);
        }
        
        public final void z() {
            final AudioDeviceCallback h = new AudioDeviceCallback() {
                public void onAudioDevicesAdded(final AudioDeviceInfo[] array) {
                    E.a.this.A("onAudioDevicesAdded", E.d(array));
                }
                
                public void onAudioDevicesRemoved(final AudioDeviceInfo[] array) {
                    E.a.this.A("onAudioDevicesRemoved", E.d(array));
                }
            };
            this.h = h;
            this.g.registerAudioDeviceCallback((AudioDeviceCallback)h, this.a);
        }
    }
}
