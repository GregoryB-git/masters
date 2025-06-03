/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package ru.tvrain.core.data;

import android.net.Uri;
import ru.tvrain.core.data.Live;
import ru.tvrain.core.data.Playlist;
import ru.tvrain.core.data.Stream;

public final class Quality
extends Enum<Quality> {
    private static final Quality[] $VALUES;
    public static final /* enum */ Quality AUDIO;
    public static final /* enum */ Quality AUTO;
    public static final /* enum */ Quality HIGH;
    public static final /* enum */ Quality LOW;
    public static final /* enum */ Quality MEDIUM;
    public static final String NAME_AUTO = "\u0410\u0432\u0442\u043e";
    public static final String NAME_AUTO_SHORT = "\u0410\u0432\u0442\u043e";
    public static final String NAME_HIGH = "\u0412\u044b\u0441\u043e\u043a\u043e\u0435 \u043a\u0430\u0447\u0435\u0441\u0442\u0432\u043e (720p)";
    public static final String NAME_HIGH_SHORT = "\u0412\u044b\u0441\u043e\u043a\u043e\u0435";
    public static final String NAME_LOW = "\u041d\u0438\u0437\u043a\u043e\u0435 \u043a\u0430\u0447\u0435\u0441\u0442\u0432\u043e (360p)";
    public static final String NAME_LOW_SHORT = "\u041d\u0438\u0437\u043a\u043e\u0435";
    public static final String NAME_MEDIUM = "\u0421\u0440\u0435\u0434\u043d\u0435\u0435 \u043a\u0430\u0447\u0435\u0441\u0442\u0432\u043e (480p)";
    public static final String NAME_MEDIUM_SHORT = "\u0421\u0440\u0435\u0434\u043d\u0435\u0435";

    static {
        Quality quality;
        Quality quality2;
        Quality quality3;
        Quality quality4;
        Quality quality5;
        AUTO = quality5 = new Quality();
        HIGH = quality4 = new Quality();
        MEDIUM = quality3 = new Quality();
        LOW = quality2 = new Quality();
        AUDIO = quality = new Quality();
        $VALUES = new Quality[]{quality5, quality4, quality3, quality2, quality};
    }

    public static Quality parse(String string2) {
        string2.getClass();
        int n3 = string2.hashCode();
        int n7 = -1;
        switch (n3) {
            default: {
                break;
            }
            case 426204075: {
                if (!string2.equals((Object)NAME_MEDIUM)) break;
                n7 = 3;
                break;
            }
            case 32049630: {
                if (!string2.equals((Object)"\u0410\u0432\u0442\u043e")) break;
                n7 = 2;
                break;
            }
            case -1156037694: {
                if (!string2.equals((Object)NAME_LOW)) break;
                n7 = 1;
                break;
            }
            case -1408917104: {
                if (!string2.equals((Object)NAME_HIGH)) break;
                n7 = 0;
            }
        }
        switch (n7) {
            default: {
                return null;
            }
            case 3: {
                return MEDIUM;
            }
            case 2: {
                return AUTO;
            }
            case 1: {
                return LOW;
            }
            case 0: 
        }
        return HIGH;
    }

    public static Quality valueOf(String string2) {
        return (Quality)Enum.valueOf(Quality.class, (String)string2);
    }

    public static Quality[] values() {
        return (Quality[])$VALUES.clone();
    }

    public Uri getUri(Live live) {
        try {
            if (1.$SwitchMap$ru$tvrain$core$data$Quality[this.ordinal()] != 5) {
                return Uri.parse((String)((Stream)live.HLS.get((int)0)).url);
            }
            live = Uri.parse((String)((Stream)live.HLSAUDIO.get((int)0)).url);
            return live;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public Uri getUri(Playlist playlist) {
        try {
            playlist = Uri.parse((String)playlist.stream);
            return playlist;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public String toShortString() {
        int n3 = 1.$SwitchMap$ru$tvrain$core$data$Quality[this.ordinal()];
        if (n3 != 1) {
            if (n3 != 2) {
                if (n3 != 3) {
                    if (n3 != 4) {
                        return null;
                    }
                    return NAME_LOW_SHORT;
                }
                return NAME_MEDIUM_SHORT;
            }
            return NAME_HIGH_SHORT;
        }
        return "\u0410\u0432\u0442\u043e";
    }

    public String toString() {
        int n3 = 1.$SwitchMap$ru$tvrain$core$data$Quality[this.ordinal()];
        if (n3 != 1) {
            if (n3 != 2) {
                if (n3 != 3) {
                    if (n3 != 4) {
                        return null;
                    }
                    return NAME_LOW;
                }
                return NAME_MEDIUM;
            }
            return NAME_HIGH;
        }
        return "\u0410\u0432\u0442\u043e";
    }
}

