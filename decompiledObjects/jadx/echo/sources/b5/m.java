package b5;

/* loaded from: classes.dex */
public final class m extends C0805c {
    @Override // b5.C0805c
    public int c(char c7, StringBuilder sb) {
        int i7;
        int i8;
        char c8;
        if (c7 == ' ') {
            c8 = 3;
        } else {
            if (c7 >= '0' && c7 <= '9') {
                i8 = c7 - ',';
            } else {
                if (c7 < 'a' || c7 > 'z') {
                    if (c7 < ' ') {
                        sb.append((char) 0);
                    } else {
                        if (c7 >= '!' && c7 <= '/') {
                            sb.append((char) 1);
                            i7 = c7 - '!';
                        } else if (c7 >= ':' && c7 <= '@') {
                            sb.append((char) 1);
                            i7 = c7 - '+';
                        } else if (c7 < '[' || c7 > '_') {
                            if (c7 != '`') {
                                if (c7 >= 'A' && c7 <= 'Z') {
                                    sb.append((char) 2);
                                    i7 = c7 - '@';
                                } else if (c7 < '{' || c7 > 127) {
                                    sb.append("\u0001\u001e");
                                    return c((char) (c7 - 128), sb) + 2;
                                }
                            }
                            sb.append((char) 2);
                            i7 = c7 - '`';
                        } else {
                            sb.append((char) 1);
                            i7 = c7 - 'E';
                        }
                        c7 = (char) i7;
                    }
                    sb.append(c7);
                    return 2;
                }
                i8 = c7 - 'S';
            }
            c8 = (char) i8;
        }
        sb.append(c8);
        return 1;
    }

    @Override // b5.C0805c
    public int e() {
        return 2;
    }
}
