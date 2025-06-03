package d0;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* renamed from: d0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1192o {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str) {
        char c7;
        if (str == null) {
            return -1;
        }
        String t7 = AbstractC1203z.t(str);
        t7.hashCode();
        switch (t7.hashCode()) {
            case -2123537834:
                if (t7.equals("audio/eac3-joc")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case -1662384011:
                if (t7.equals("video/mp2p")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case -1662384007:
                if (t7.equals("video/mp2t")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case -1662095187:
                if (t7.equals("video/webm")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case -1606874997:
                if (t7.equals("audio/amr-wb")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case -1487656890:
                if (t7.equals("image/avif")) {
                    c7 = 5;
                    break;
                }
                c7 = 65535;
                break;
            case -1487464693:
                if (t7.equals("image/heic")) {
                    c7 = 6;
                    break;
                }
                c7 = 65535;
                break;
            case -1487464690:
                if (t7.equals("image/heif")) {
                    c7 = 7;
                    break;
                }
                c7 = 65535;
                break;
            case -1487394660:
                if (t7.equals("image/jpeg")) {
                    c7 = '\b';
                    break;
                }
                c7 = 65535;
                break;
            case -1487018032:
                if (t7.equals("image/webp")) {
                    c7 = '\t';
                    break;
                }
                c7 = 65535;
                break;
            case -1248337486:
                if (t7.equals("application/mp4")) {
                    c7 = '\n';
                    break;
                }
                c7 = 65535;
                break;
            case -1079884372:
                if (t7.equals("video/x-msvideo")) {
                    c7 = 11;
                    break;
                }
                c7 = 65535;
                break;
            case -1004728940:
                if (t7.equals("text/vtt")) {
                    c7 = '\f';
                    break;
                }
                c7 = 65535;
                break;
            case -879272239:
                if (t7.equals("image/bmp")) {
                    c7 = '\r';
                    break;
                }
                c7 = 65535;
                break;
            case -879258763:
                if (t7.equals("image/png")) {
                    c7 = 14;
                    break;
                }
                c7 = 65535;
                break;
            case -387023398:
                if (t7.equals("audio/x-matroska")) {
                    c7 = 15;
                    break;
                }
                c7 = 65535;
                break;
            case -43467528:
                if (t7.equals("application/webm")) {
                    c7 = 16;
                    break;
                }
                c7 = 65535;
                break;
            case 13915911:
                if (t7.equals("video/x-flv")) {
                    c7 = 17;
                    break;
                }
                c7 = 65535;
                break;
            case 187078296:
                if (t7.equals("audio/ac3")) {
                    c7 = 18;
                    break;
                }
                c7 = 65535;
                break;
            case 187078297:
                if (t7.equals("audio/ac4")) {
                    c7 = 19;
                    break;
                }
                c7 = 65535;
                break;
            case 187078669:
                if (t7.equals("audio/amr")) {
                    c7 = 20;
                    break;
                }
                c7 = 65535;
                break;
            case 187090232:
                if (t7.equals("audio/mp4")) {
                    c7 = 21;
                    break;
                }
                c7 = 65535;
                break;
            case 187091926:
                if (t7.equals("audio/ogg")) {
                    c7 = 22;
                    break;
                }
                c7 = 65535;
                break;
            case 187099443:
                if (t7.equals("audio/wav")) {
                    c7 = 23;
                    break;
                }
                c7 = 65535;
                break;
            case 1331848029:
                if (t7.equals("video/mp4")) {
                    c7 = 24;
                    break;
                }
                c7 = 65535;
                break;
            case 1503095341:
                if (t7.equals("audio/3gpp")) {
                    c7 = 25;
                    break;
                }
                c7 = 65535;
                break;
            case 1504578661:
                if (t7.equals("audio/eac3")) {
                    c7 = 26;
                    break;
                }
                c7 = 65535;
                break;
            case 1504619009:
                if (t7.equals("audio/flac")) {
                    c7 = 27;
                    break;
                }
                c7 = 65535;
                break;
            case 1504824762:
                if (t7.equals("audio/midi")) {
                    c7 = 28;
                    break;
                }
                c7 = 65535;
                break;
            case 1504831518:
                if (t7.equals("audio/mpeg")) {
                    c7 = 29;
                    break;
                }
                c7 = 65535;
                break;
            case 1505118770:
                if (t7.equals("audio/webm")) {
                    c7 = 30;
                    break;
                }
                c7 = 65535;
                break;
            case 2039520277:
                if (t7.equals("video/x-matroska")) {
                    c7 = 31;
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        switch (c7) {
        }
        return -1;
    }

    public static int b(Map map) {
        List list = (List) map.get("Content-Type");
        return a((list == null || list.isEmpty()) ? null : (String) list.get(0));
    }

    public static int c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
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
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }
}
