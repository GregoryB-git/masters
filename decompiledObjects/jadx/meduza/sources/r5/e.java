package r5;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements n7.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f13639a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r2.f13682b == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        if (r0.f13645h.a(r9, r0.f13646i) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0038, code lost:
    
        if (r2.equals("audio/ac4") == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[Catch: all -> 0x008d, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000f, B:8:0x0013, B:10:0x0018, B:19:0x005a, B:21:0x005e, B:23:0x0062, B:25:0x0066, B:27:0x006a, B:29:0x006e, B:31:0x0072, B:33:0x0078, B:35:0x0080, B:37:0x008b), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a A[Catch: all -> 0x008d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000f, B:8:0x0013, B:10:0x0018, B:19:0x005a, B:21:0x005e, B:23:0x0062, B:25:0x0066, B:27:0x006a, B:29:0x006e, B:31:0x0072, B:33:0x0078, B:35:0x0080, B:37:0x008b), top: B:3:0x0007 }] */
    @Override // n7.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean apply(java.lang.Object r9) {
        /*
            r8 = this;
            r5.f r0 = r8.f13639a
            v3.i0 r9 = (v3.i0) r9
            java.lang.Object r1 = r0.f13642d
            monitor-enter(r1)
            r5.f$c r2 = r0.f13644g     // Catch: java.lang.Throwable -> L8d
            boolean r2 = r2.f13671s0     // Catch: java.lang.Throwable -> L8d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L8a
            boolean r2 = r0.f     // Catch: java.lang.Throwable -> L8d
            if (r2 != 0) goto L8a
            int r2 = r9.G     // Catch: java.lang.Throwable -> L8d
            r5 = 2
            if (r2 <= r5) goto L8a
            java.lang.String r2 = r9.t     // Catch: java.lang.Throwable -> L8d
            if (r2 != 0) goto L1d
            goto L53
        L1d:
            r6 = -1
            int r7 = r2.hashCode()
            switch(r7) {
                case -2123537834: goto L46;
                case 187078296: goto L3b;
                case 187078297: goto L32;
                case 1504578661: goto L27;
                default: goto L25;
            }
        L25:
            r5 = r6
            goto L50
        L27:
            java.lang.String r5 = "audio/eac3"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L30
            goto L25
        L30:
            r5 = 3
            goto L50
        L32:
            java.lang.String r7 = "audio/ac4"
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L50
            goto L25
        L3b:
            java.lang.String r5 = "audio/ac3"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L44
            goto L25
        L44:
            r5 = r4
            goto L50
        L46:
            java.lang.String r5 = "audio/eac3-joc"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L4f
            goto L25
        L4f:
            r5 = r3
        L50:
            switch(r5) {
                case 0: goto L55;
                case 1: goto L55;
                case 2: goto L55;
                case 3: goto L55;
                default: goto L53;
            }
        L53:
            r2 = r3
            goto L56
        L55:
            r2 = r4
        L56:
            r5 = 32
            if (r2 == 0) goto L66
            int r2 = v5.e0.f15881a     // Catch: java.lang.Throwable -> L8d
            if (r2 < r5) goto L8a
            r5.f$f r2 = r0.f13645h     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L8a
            boolean r2 = r2.f13682b     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L8a
        L66:
            int r2 = v5.e0.f15881a     // Catch: java.lang.Throwable -> L8d
            if (r2 < r5) goto L8b
            r5.f$f r2 = r0.f13645h     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L8b
            boolean r5 = r2.f13682b     // Catch: java.lang.Throwable -> L8d
            if (r5 == 0) goto L8b
            boolean r2 = r2.c()     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L8b
            r5.f$f r2 = r0.f13645h     // Catch: java.lang.Throwable -> L8d
            boolean r2 = r2.d()     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L8b
            r5.f$f r2 = r0.f13645h     // Catch: java.lang.Throwable -> L8d
            x3.d r0 = r0.f13646i     // Catch: java.lang.Throwable -> L8d
            boolean r9 = r2.a(r9, r0)     // Catch: java.lang.Throwable -> L8d
            if (r9 == 0) goto L8b
        L8a:
            r3 = r4
        L8b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8d
            return r3
        L8d:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8d
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.e.apply(java.lang.Object):boolean");
    }
}
