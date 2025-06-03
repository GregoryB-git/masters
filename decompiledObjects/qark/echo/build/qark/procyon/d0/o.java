// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

import android.net.Uri;
import java.util.List;
import java.util.Map;

public abstract class o
{
    public static int a(String t) {
        if (t == null) {
            return -1;
        }
        t = z.t(t);
        t.hashCode();
        int n = 0;
        Label_0860: {
            switch (t) {
                case "video/x-matroska": {
                    n = 31;
                    break Label_0860;
                }
                case "audio/webm": {
                    n = 30;
                    break Label_0860;
                }
                case "audio/mpeg": {
                    n = 29;
                    break Label_0860;
                }
                case "audio/midi": {
                    n = 28;
                    break Label_0860;
                }
                case "audio/flac": {
                    n = 27;
                    break Label_0860;
                }
                case "audio/eac3": {
                    n = 26;
                    break Label_0860;
                }
                case "audio/3gpp": {
                    n = 25;
                    break Label_0860;
                }
                case "video/mp4": {
                    n = 24;
                    break Label_0860;
                }
                case "audio/wav": {
                    n = 23;
                    break Label_0860;
                }
                case "audio/ogg": {
                    n = 22;
                    break Label_0860;
                }
                case "audio/mp4": {
                    n = 21;
                    break Label_0860;
                }
                case "audio/amr": {
                    n = 20;
                    break Label_0860;
                }
                case "audio/ac4": {
                    n = 19;
                    break Label_0860;
                }
                case "audio/ac3": {
                    n = 18;
                    break Label_0860;
                }
                case "video/x-flv": {
                    n = 17;
                    break Label_0860;
                }
                case "application/webm": {
                    n = 16;
                    break Label_0860;
                }
                case "audio/x-matroska": {
                    n = 15;
                    break Label_0860;
                }
                case "image/png": {
                    n = 14;
                    break Label_0860;
                }
                case "image/bmp": {
                    n = 13;
                    break Label_0860;
                }
                case "text/vtt": {
                    n = 12;
                    break Label_0860;
                }
                case "video/x-msvideo": {
                    n = 11;
                    break Label_0860;
                }
                case "application/mp4": {
                    n = 10;
                    break Label_0860;
                }
                case "image/webp": {
                    n = 9;
                    break Label_0860;
                }
                case "image/jpeg": {
                    n = 8;
                    break Label_0860;
                }
                case "image/heif": {
                    n = 7;
                    break Label_0860;
                }
                case "image/heic": {
                    n = 6;
                    break Label_0860;
                }
                case "image/avif": {
                    n = 5;
                    break Label_0860;
                }
                case "audio/amr-wb": {
                    n = 4;
                    break Label_0860;
                }
                case "video/webm": {
                    n = 3;
                    break Label_0860;
                }
                case "video/mp2t": {
                    n = 2;
                    break Label_0860;
                }
                case "video/mp2p": {
                    n = 1;
                    break Label_0860;
                }
                case "audio/eac3-joc": {
                    n = 0;
                    break Label_0860;
                }
                default:
                    break;
            }
            n = -1;
        }
        switch (n) {
            default: {
                return -1;
            }
            case 29: {
                return 7;
            }
            case 28: {
                return 15;
            }
            case 27: {
                return 4;
            }
            case 23: {
                return 12;
            }
            case 22: {
                return 9;
            }
            case 19: {
                return 1;
            }
            case 17: {
                return 5;
            }
            case 14: {
                return 17;
            }
            case 13: {
                return 19;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 16;
            }
            case 10:
            case 21:
            case 24: {
                return 8;
            }
            case 9: {
                return 18;
            }
            case 8: {
                return 14;
            }
            case 6:
            case 7: {
                return 20;
            }
            case 5: {
                return 21;
            }
            case 4:
            case 20:
            case 25: {
                return 3;
            }
            case 3:
            case 15:
            case 16:
            case 30:
            case 31: {
                return 6;
            }
            case 2: {
                return 11;
            }
            case 1: {
                return 10;
            }
            case 0:
            case 18:
            case 26: {
                return 0;
            }
        }
    }
    
    public static int b(final Map map) {
        final List<String> list = map.get("Content-Type");
        String s;
        if (list != null && !list.isEmpty()) {
            s = list.get(0);
        }
        else {
            s = null;
        }
        return a(s);
    }
    
    public static int c(final Uri uri) {
        final String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        if (lastPathSegment.endsWith(".avif")) {
            return 21;
        }
        return -1;
    }
}
