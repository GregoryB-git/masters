/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package b5;

import b5.c;

public final class m
extends c {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int c(char c8, StringBuilder stringBuilder) {
        block17 : {
            block10 : {
                int n8;
                block12 : {
                    block15 : {
                        block16 : {
                            block14 : {
                                block13 : {
                                    block11 : {
                                        block9 : {
                                            block8 : {
                                                block5 : {
                                                    int n9;
                                                    block7 : {
                                                        block6 : {
                                                            block4 : {
                                                                if (c8 != ' ') break block4;
                                                                c8 = (char)3;
                                                                break block5;
                                                            }
                                                            if (c8 < '0' || c8 > '9') break block6;
                                                            n9 = c8 - 44;
                                                            break block7;
                                                        }
                                                        if (c8 < 'a' || c8 > 'z') break block8;
                                                        n9 = c8 - 83;
                                                    }
                                                    c8 = (char)n9;
                                                }
                                                stringBuilder.append(c8);
                                                return 1;
                                            }
                                            if (c8 >= ' ') break block9;
                                            stringBuilder.append('\u0000');
                                            break block10;
                                        }
                                        if (c8 < '!' || c8 > '/') break block11;
                                        stringBuilder.append('\u0001');
                                        n8 = c8 - 33;
                                        break block12;
                                    }
                                    if (c8 < ':' || c8 > '@') break block13;
                                    stringBuilder.append('\u0001');
                                    n8 = c8 - 43;
                                    break block12;
                                }
                                if (c8 < '[' || c8 > '_') break block14;
                                stringBuilder.append('\u0001');
                                n8 = c8 - 69;
                                break block12;
                            }
                            if (c8 == '`') break block15;
                            if (c8 < 'A' || c8 > 'Z') break block16;
                            stringBuilder.append('\u0002');
                            n8 = c8 - 64;
                            break block12;
                        }
                        if (c8 < '{' || c8 > '') break block17;
                    }
                    stringBuilder.append('\u0002');
                    n8 = c8 - 96;
                }
                c8 = (char)n8;
            }
            stringBuilder.append(c8);
            return 2;
        }
        stringBuilder.append("\u0001\u001e");
        return this.c((char)(c8 - 128), stringBuilder) + 2;
    }

    @Override
    public int e() {
        return 2;
    }
}

