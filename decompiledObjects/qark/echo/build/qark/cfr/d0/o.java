/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 */
package d0;

import android.net.Uri;
import d0.z;
import java.util.List;
import java.util.Map;

public abstract class o {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static int a(String var0) {
        block58 : {
            if (var0 == null) {
                return -1;
            }
            var0 = z.t(var0);
            var0.hashCode();
            switch (var0.hashCode()) {
                case 2039520277: {
                    if (!var0.equals((Object)"video/x-matroska")) break;
                    var1_1 = 31;
                    ** break;
                }
                case 1505118770: {
                    if (!var0.equals((Object)"audio/webm")) break;
                    var1_1 = 30;
                    ** break;
                }
                case 1504831518: {
                    if (!var0.equals((Object)"audio/mpeg")) break;
                    var1_1 = 29;
                    ** break;
                }
                case 1504824762: {
                    if (!var0.equals((Object)"audio/midi")) break;
                    var1_1 = 28;
                    ** break;
                }
                case 1504619009: {
                    if (!var0.equals((Object)"audio/flac")) break;
                    var1_1 = 27;
                    ** break;
                }
                case 1504578661: {
                    if (!var0.equals((Object)"audio/eac3")) break;
                    var1_1 = 26;
                    ** break;
                }
                case 1503095341: {
                    if (!var0.equals((Object)"audio/3gpp")) break;
                    var1_1 = 25;
                    ** break;
                }
                case 1331848029: {
                    if (!var0.equals((Object)"video/mp4")) break;
                    var1_1 = 24;
                    ** break;
                }
                case 187099443: {
                    if (!var0.equals((Object)"audio/wav")) break;
                    var1_1 = 23;
                    ** break;
                }
                case 187091926: {
                    if (!var0.equals((Object)"audio/ogg")) break;
                    var1_1 = 22;
                    ** break;
                }
                case 187090232: {
                    if (!var0.equals((Object)"audio/mp4")) break;
                    var1_1 = 21;
                    ** break;
                }
                case 187078669: {
                    if (!var0.equals((Object)"audio/amr")) break;
                    var1_1 = 20;
                    ** break;
                }
                case 187078297: {
                    if (!var0.equals((Object)"audio/ac4")) break;
                    var1_1 = 19;
                    ** break;
                }
                case 187078296: {
                    if (!var0.equals((Object)"audio/ac3")) break;
                    var1_1 = 18;
                    ** break;
                }
                case 13915911: {
                    if (!var0.equals((Object)"video/x-flv")) break;
                    var1_1 = 17;
                    ** break;
                }
                case -43467528: {
                    if (!var0.equals((Object)"application/webm")) break;
                    var1_1 = 16;
                    ** break;
                }
                case -387023398: {
                    if (!var0.equals((Object)"audio/x-matroska")) break;
                    var1_1 = 15;
                    ** break;
                }
                case -879258763: {
                    if (!var0.equals((Object)"image/png")) break;
                    var1_1 = 14;
                    ** break;
                }
                case -879272239: {
                    if (!var0.equals((Object)"image/bmp")) break;
                    var1_1 = 13;
                    ** break;
                }
                case -1004728940: {
                    if (!var0.equals((Object)"text/vtt")) break;
                    var1_1 = 12;
                    ** break;
                }
                case -1079884372: {
                    if (!var0.equals((Object)"video/x-msvideo")) break;
                    var1_1 = 11;
                    ** break;
                }
                case -1248337486: {
                    if (!var0.equals((Object)"application/mp4")) break;
                    var1_1 = 10;
                    ** break;
                }
                case -1487018032: {
                    if (!var0.equals((Object)"image/webp")) break;
                    var1_1 = 9;
                    ** break;
                }
                case -1487394660: {
                    if (!var0.equals((Object)"image/jpeg")) break;
                    var1_1 = 8;
                    ** break;
                }
                case -1487464690: {
                    if (!var0.equals((Object)"image/heif")) break;
                    var1_1 = 7;
                    ** break;
                }
                case -1487464693: {
                    if (!var0.equals((Object)"image/heic")) break;
                    var1_1 = 6;
                    ** break;
                }
                case -1487656890: {
                    if (!var0.equals((Object)"image/avif")) break;
                    var1_1 = 5;
                    ** break;
                }
                case -1606874997: {
                    if (!var0.equals((Object)"audio/amr-wb")) break;
                    var1_1 = 4;
                    ** break;
                }
                case -1662095187: {
                    if (!var0.equals((Object)"video/webm")) break;
                    var1_1 = 3;
                    ** break;
                }
                case -1662384007: {
                    if (!var0.equals((Object)"video/mp2t")) break;
                    var1_1 = 2;
                    ** break;
                }
                case -1662384011: {
                    if (!var0.equals((Object)"video/mp2p")) break;
                    var1_1 = 1;
                    ** break;
                }
                case -2123537834: {
                    if (var0.equals((Object)"audio/eac3-joc")) break block58;
                }
            }
            var1_1 = -1;
            ** break;
        }
        var1_1 = 0;
lbl136: // 33 sources:
        switch (var1_1) {
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
            case 26: 
        }
        return 0;
    }

    public static int b(Map object) {
        object = (object = (List)object.get((Object)"Content-Type")) != null && !object.isEmpty() ? (String)object.get(0) : null;
        return o.a((String)object);
    }

    public static int c(Uri object) {
        if ((object = object.getLastPathSegment()) == null) {
            return -1;
        }
        if (!object.endsWith(".ac3") && !object.endsWith(".ec3")) {
            if (object.endsWith(".ac4")) {
                return 1;
            }
            if (!object.endsWith(".adts") && !object.endsWith(".aac")) {
                if (object.endsWith(".amr")) {
                    return 3;
                }
                if (object.endsWith(".flac")) {
                    return 4;
                }
                if (object.endsWith(".flv")) {
                    return 5;
                }
                if (!(object.endsWith(".mid") || object.endsWith(".midi") || object.endsWith(".smf"))) {
                    if (!object.startsWith(".mk", object.length() - 4) && !object.endsWith(".webm")) {
                        if (object.endsWith(".mp3")) {
                            return 7;
                        }
                        if (!(object.endsWith(".mp4") || object.startsWith(".m4", object.length() - 4) || object.startsWith(".mp4", object.length() - 5) || object.startsWith(".cmf", object.length() - 5))) {
                            if (!object.startsWith(".og", object.length() - 4) && !object.endsWith(".opus")) {
                                if (!(object.endsWith(".ps") || object.endsWith(".mpeg") || object.endsWith(".mpg") || object.endsWith(".m2p"))) {
                                    if (!object.endsWith(".ts") && !object.startsWith(".ts", object.length() - 4)) {
                                        if (!object.endsWith(".wav") && !object.endsWith(".wave")) {
                                            if (!object.endsWith(".vtt") && !object.endsWith(".webvtt")) {
                                                if (!object.endsWith(".jpg") && !object.endsWith(".jpeg")) {
                                                    if (object.endsWith(".avi")) {
                                                        return 16;
                                                    }
                                                    if (object.endsWith(".png")) {
                                                        return 17;
                                                    }
                                                    if (object.endsWith(".webp")) {
                                                        return 18;
                                                    }
                                                    if (!object.endsWith(".bmp") && !object.endsWith(".dib")) {
                                                        if (!object.endsWith(".heic") && !object.endsWith(".heif")) {
                                                            if (object.endsWith(".avif")) {
                                                                return 21;
                                                            }
                                                            return -1;
                                                        }
                                                        return 20;
                                                    }
                                                    return 19;
                                                }
                                                return 14;
                                            }
                                            return 13;
                                        }
                                        return 12;
                                    }
                                    return 11;
                                }
                                return 10;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 6;
                }
                return 15;
            }
            return 2;
        }
        return 0;
    }
}

