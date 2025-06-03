// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public abstract class s5
{
    public static String a(final q3 q3) {
        final r5 r5 = new r5(q3);
        final StringBuilder sb = new StringBuilder(r5.a());
        for (int i = 0; i < r5.a(); ++i) {
            int e = r5.e(i);
            String str;
            if (e != 34) {
                if (e != 39) {
                    if (e != 92) {
                        switch (e) {
                            default: {
                                if (e < 32 || e > 126) {
                                    sb.append('\\');
                                    sb.append((char)((e >>> 6 & 0x3) + 48));
                                    sb.append((char)((e >>> 3 & 0x7) + 48));
                                    e = (e & 0x7) + 48;
                                }
                                sb.append((char)e);
                                continue;
                            }
                            case 13: {
                                str = "\\r";
                                break;
                            }
                            case 12: {
                                str = "\\f";
                                break;
                            }
                            case 11: {
                                str = "\\v";
                                break;
                            }
                            case 10: {
                                str = "\\n";
                                break;
                            }
                            case 9: {
                                str = "\\t";
                                break;
                            }
                            case 8: {
                                str = "\\b";
                                break;
                            }
                            case 7: {
                                str = "\\a";
                                break;
                            }
                        }
                    }
                    else {
                        str = "\\\\";
                    }
                }
                else {
                    str = "\\'";
                }
            }
            else {
                str = "\\\"";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
