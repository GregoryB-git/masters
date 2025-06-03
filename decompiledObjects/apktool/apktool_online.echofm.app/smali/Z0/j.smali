.class public abstract LZ0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(ILg0/z;)LT0/e;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lg0/z;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lg0/z;->p()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0x64617461

    .line 10
    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    const/16 p0, 0x8

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Lg0/z;->U(I)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v0, v0, -0x10

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lg0/z;->B(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance p1, LT0/e;

    .line 26
    .line 27
    const-string v0, "und"

    .line 28
    .line 29
    invoke-direct {p1, v0, p0, p0}, LT0/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v0, "Failed to parse comment attribute: "

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-static {p0}, LZ0/a;->a(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    const-string p1, "MetadataUtil"

    .line 55
    .line 56
    invoke-static {p1, p0}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    return-object p0
.end method

.method public static b(Lg0/z;)LT0/a;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0x64617461

    .line 10
    .line 11
    .line 12
    const-string v3, "MetadataUtil"

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    if-ne v1, v2, :cond_3

    .line 16
    .line 17
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {v1}, LZ0/a;->b(I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/16 v2, 0xd

    .line 26
    .line 27
    if-ne v1, v2, :cond_0

    .line 28
    .line 29
    const-string v2, "image/jpeg"

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/16 v2, 0xe

    .line 33
    .line 34
    if-ne v1, v2, :cond_1

    .line 35
    .line 36
    const-string v2, "image/png"

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move-object v2, v4

    .line 40
    :goto_0
    if-nez v2, :cond_2

    .line 41
    .line 42
    new-instance p0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v0, "Unrecognized cover art flags: "

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    :goto_1
    invoke-static {v3, p0}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v4

    .line 63
    :cond_2
    const/4 v1, 0x4

    .line 64
    invoke-virtual {p0, v1}, Lg0/z;->U(I)V

    .line 65
    .line 66
    .line 67
    add-int/lit8 v0, v0, -0x10

    .line 68
    .line 69
    new-array v1, v0, [B

    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    invoke-virtual {p0, v1, v3, v0}, Lg0/z;->l([BII)V

    .line 73
    .line 74
    .line 75
    new-instance p0, LT0/a;

    .line 76
    .line 77
    const/4 v0, 0x3

    .line 78
    invoke-direct {p0, v2, v4, v0, v1}, LT0/a;-><init>(Ljava/lang/String;Ljava/lang/String;I[B)V

    .line 79
    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_3
    const-string p0, "Failed to parse cover art attribute"

    .line 83
    .line 84
    goto :goto_1
.end method

.method public static c(Lg0/z;)Ld0/x$b;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lg0/z;->f()I

    move-result v0

    invoke-virtual {p0}, Lg0/z;->p()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lg0/z;->p()I

    move-result v1

    shr-int/lit8 v2, v1, 0x18

    and-int/lit16 v2, v2, 0xff

    const/16 v3, 0xa9

    if-eq v2, v3, :cond_11

    const/16 v3, 0xfd

    if-ne v2, v3, :cond_0

    goto/16 :goto_0

    :cond_0
    const v2, 0x676e7265

    if-ne v1, v2, :cond_1

    :try_start_0
    invoke-static {p0}, LZ0/j;->i(Lg0/z;)LT0/n;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :catchall_0
    move-exception v1

    goto/16 :goto_3

    :cond_1
    const v2, 0x6469736b

    if-ne v1, v2, :cond_2

    :try_start_1
    const-string v2, "TPOS"

    invoke-static {v1, v2, p0}, LZ0/j;->d(ILjava/lang/String;Lg0/z;)LT0/n;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_2
    const v2, 0x74726b6e

    if-ne v1, v2, :cond_3

    :try_start_2
    const-string v2, "TRCK"

    invoke-static {v1, v2, p0}, LZ0/j;->d(ILjava/lang/String;Lg0/z;)LT0/n;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_3
    const v2, 0x746d706f

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v1, v2, :cond_4

    :try_start_3
    const-string v2, "TBPM"

    invoke-static {v1, v2, p0, v4, v3}, LZ0/j;->f(ILjava/lang/String;Lg0/z;ZZ)LT0/i;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_4
    const v2, 0x6370696c

    if-ne v1, v2, :cond_5

    :try_start_4
    const-string v2, "TCMP"

    invoke-static {v1, v2, p0, v4, v4}, LZ0/j;->f(ILjava/lang/String;Lg0/z;ZZ)LT0/i;

    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_5
    const v2, 0x636f7672

    if-ne v1, v2, :cond_6

    :try_start_5
    invoke-static {p0}, LZ0/j;->b(Lg0/z;)LT0/a;

    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_6
    const v2, 0x61415254

    if-ne v1, v2, :cond_7

    :try_start_6
    const-string v2, "TPE2"

    invoke-static {v1, v2, p0}, LZ0/j;->j(ILjava/lang/String;Lg0/z;)LT0/n;

    move-result-object v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_7
    const v2, 0x736f6e6d

    if-ne v1, v2, :cond_8

    :try_start_7
    const-string v2, "TSOT"

    invoke-static {v1, v2, p0}, LZ0/j;->j(ILjava/lang/String;Lg0/z;)LT0/n;

    move-result-object v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_8
    const v2, 0x736f616c

    if-ne v1, v2, :cond_9

    :try_start_8
    const-string v2, "TSOA"

    invoke-static {v1, v2, p0}, LZ0/j;->j(ILjava/lang/String;Lg0/z;)LT0/n;

    move-result-object v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_9
    const v2, 0x736f6172

    if-ne v1, v2, :cond_a

    :try_start_9
    const-string v2, "TSOP"

    invoke-static {v1, v2, p0}, LZ0/j;->j(ILjava/lang/String;Lg0/z;)LT0/n;

    move-result-object v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_a
    const v2, 0x736f6161

    if-ne v1, v2, :cond_b

    :try_start_a
    const-string v2, "TSO2"

    invoke-static {v1, v2, p0}, LZ0/j;->j(ILjava/lang/String;Lg0/z;)LT0/n;

    move-result-object v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_b
    const v2, 0x736f636f

    if-ne v1, v2, :cond_c

    :try_start_b
    const-string v2, "TSOC"

    invoke-static {v1, v2, p0}, LZ0/j;->j(ILjava/lang/String;Lg0/z;)LT0/n;

    move-result-object v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_c
    const v2, 0x72746e67

    if-ne v1, v2, :cond_d

    :try_start_c
    const-string v2, "ITUNESADVISORY"

    invoke-static {v1, v2, p0, v3, v3}, LZ0/j;->f(ILjava/lang/String;Lg0/z;ZZ)LT0/i;

    move-result-object v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_d
    const v2, 0x70676170

    if-ne v1, v2, :cond_e

    :try_start_d
    const-string v2, "ITUNESGAPLESS"

    invoke-static {v1, v2, p0, v3, v4}, LZ0/j;->f(ILjava/lang/String;Lg0/z;ZZ)LT0/i;

    move-result-object v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_e
    const v2, 0x736f736e

    if-ne v1, v2, :cond_f

    :try_start_e
    const-string v2, "TVSHOWSORT"

    invoke-static {v1, v2, p0}, LZ0/j;->j(ILjava/lang/String;Lg0/z;)LT0/n;

    move-result-object v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_f
    const v2, 0x74767368

    if-ne v1, v2, :cond_10

    :try_start_f
    const-string v2, "TVSHOW"

    invoke-static {v1, v2, p0}, LZ0/j;->j(ILjava/lang/String;Lg0/z;)LT0/n;

    move-result-object v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_10
    const v2, 0x2d2d2d2d

    if-ne v1, v2, :cond_1b

    :try_start_10
    invoke-static {p0, v0}, LZ0/j;->g(Lg0/z;I)LT0/i;

    move-result-object v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_11
    :goto_0
    const v2, 0xffffff

    and-int/2addr v2, v1

    const v3, 0x636d74

    if-ne v2, v3, :cond_12

    :try_start_11
    invoke-static {v1, p0}, LZ0/j;->a(ILg0/z;)LT0/e;

    move-result-object v1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_12
    const v3, 0x6e616d

    if-eq v2, v3, :cond_1d

    const v3, 0x74726b

    if-ne v2, v3, :cond_13

    goto/16 :goto_2

    :cond_13
    const v3, 0x636f6d

    if-eq v2, v3, :cond_1c

    const v3, 0x777274

    if-ne v2, v3, :cond_14

    goto/16 :goto_1

    :cond_14
    const v3, 0x646179

    if-ne v2, v3, :cond_15

    :try_start_12
    const-string v2, "TDRC"

    invoke-static {v1, v2, p0}, LZ0/j;->j(ILjava/lang/String;Lg0/z;)LT0/n;

    move-result-object v1
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_15
    const v3, 0x415254

    if-ne v2, v3, :cond_16

    :try_start_13
    const-string v2, "TPE1"

    invoke-static {v1, v2, p0}, LZ0/j;->j(ILjava/lang/String;Lg0/z;)LT0/n;

    move-result-object v1
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_16
    const v3, 0x746f6f

    if-ne v2, v3, :cond_17

    :try_start_14
    const-string v2, "TSSE"

    invoke-static {v1, v2, p0}, LZ0/j;->j(ILjava/lang/String;Lg0/z;)LT0/n;

    move-result-object v1
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_17
    const v3, 0x616c62

    if-ne v2, v3, :cond_18

    :try_start_15
    const-string v2, "TALB"

    invoke-static {v1, v2, p0}, LZ0/j;->j(ILjava/lang/String;Lg0/z;)LT0/n;

    move-result-object v1
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_18
    const v3, 0x6c7972

    if-ne v2, v3, :cond_19

    :try_start_16
    const-string v2, "USLT"

    invoke-static {v1, v2, p0}, LZ0/j;->j(ILjava/lang/String;Lg0/z;)LT0/n;

    move-result-object v1
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_19
    const v3, 0x67656e

    if-ne v2, v3, :cond_1a

    :try_start_17
    const-string v2, "TCON"

    invoke-static {v1, v2, p0}, LZ0/j;->j(ILjava/lang/String;Lg0/z;)LT0/n;

    move-result-object v1
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_1a
    const v3, 0x677270

    if-ne v2, v3, :cond_1b

    :try_start_18
    const-string v2, "TIT1"

    invoke-static {v1, v2, p0}, LZ0/j;->j(ILjava/lang/String;Lg0/z;)LT0/n;

    move-result-object v1
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_1b
    :try_start_19
    const-string v2, "MetadataUtil"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Skipped unknown metadata entry: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, LZ0/a;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lg0/o;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    const/4 p0, 0x0

    return-object p0

    :cond_1c
    :goto_1
    :try_start_1a
    const-string v2, "TCOM"

    invoke-static {v1, v2, p0}, LZ0/j;->j(ILjava/lang/String;Lg0/z;)LT0/n;

    move-result-object v1
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :cond_1d
    :goto_2
    :try_start_1b
    const-string v2, "TIT2"

    invoke-static {v1, v2, p0}, LZ0/j;->j(ILjava/lang/String;Lg0/z;)LT0/n;

    move-result-object v1
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_0

    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    return-object v1

    :goto_3
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    throw v1
.end method

.method public static d(ILjava/lang/String;Lg0/z;)LT0/n;
    .locals 4

    .line 1
    invoke-virtual {p2}, Lg0/z;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p2}, Lg0/z;->p()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0x64617461

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-ne v1, v2, :cond_1

    .line 14
    .line 15
    const/16 v1, 0x16

    .line 16
    .line 17
    if-lt v0, v1, :cond_1

    .line 18
    .line 19
    const/16 v0, 0xa

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Lg0/z;->U(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Lg0/z;->M()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-lez v0, :cond_1

    .line 29
    .line 30
    new-instance p0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v1, ""

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p2}, Lg0/z;->M()I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-lez p2, :cond_0

    .line 52
    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string p0, "/"

    .line 62
    .line 63
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    :cond_0
    new-instance p2, LT0/n;

    .line 74
    .line 75
    invoke-static {p0}, LX2/v;->Z(Ljava/lang/Object;)LX2/v;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-direct {p2, p1, v3, p0}, LT0/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 80
    .line 81
    .line 82
    return-object p2

    .line 83
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    const-string p2, "Failed to parse index/count attribute: "

    .line 89
    .line 90
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-static {p0}, LZ0/a;->a(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    const-string p1, "MetadataUtil"

    .line 105
    .line 106
    invoke-static {p1, p0}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-object v3
.end method

.method public static e(Lg0/z;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0x64617461

    .line 10
    .line 11
    .line 12
    if-ne v1, v2, :cond_4

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lg0/z;->U(I)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v0, v0, -0x10

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    if-eq v0, v1, :cond_2

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    if-eq v0, v1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p0}, Lg0/z;->j()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    and-int/lit16 v0, v0, 0x80

    .line 39
    .line 40
    if-nez v0, :cond_4

    .line 41
    .line 42
    invoke-virtual {p0}, Lg0/z;->K()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0

    .line 47
    :cond_1
    invoke-virtual {p0}, Lg0/z;->J()I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    return p0

    .line 52
    :cond_2
    invoke-virtual {p0}, Lg0/z;->M()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :cond_3
    invoke-virtual {p0}, Lg0/z;->G()I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    return p0

    .line 62
    :cond_4
    :goto_0
    const-string p0, "MetadataUtil"

    .line 63
    .line 64
    const-string v0, "Failed to parse data atom to int"

    .line 65
    .line 66
    invoke-static {p0, v0}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 p0, -0x1

    .line 70
    return p0
.end method

.method public static f(ILjava/lang/String;Lg0/z;ZZ)LT0/i;
    .locals 0

    .line 1
    invoke-static {p2}, LZ0/j;->e(Lg0/z;)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const/4 p4, 0x1

    .line 8
    invoke-static {p4, p2}, Ljava/lang/Math;->min(II)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    :cond_0
    const/4 p4, 0x0

    .line 13
    if-ltz p2, :cond_2

    .line 14
    .line 15
    if-eqz p3, :cond_1

    .line 16
    .line 17
    new-instance p0, LT0/n;

    .line 18
    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p2}, LX2/v;->Z(Ljava/lang/Object;)LX2/v;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-direct {p0, p1, p4, p2}, LT0/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    new-instance p0, LT0/e;

    .line 32
    .line 33
    const-string p3, "und"

    .line 34
    .line 35
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-direct {p0, p3, p1, p2}, LT0/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    return-object p0

    .line 43
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string p2, "Failed to parse uint8 attribute: "

    .line 49
    .line 50
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-static {p0}, LZ0/a;->a(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const-string p1, "MetadataUtil"

    .line 65
    .line 66
    invoke-static {p1, p0}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-object p4
.end method

.method public static g(Lg0/z;I)LT0/i;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, -0x1

    .line 3
    move-object v2, v0

    .line 4
    move-object v3, v2

    .line 5
    move v4, v1

    .line 6
    move v5, v4

    .line 7
    :goto_0
    invoke-virtual {p0}, Lg0/z;->f()I

    .line 8
    .line 9
    .line 10
    move-result v6

    .line 11
    if-ge v6, p1, :cond_3

    .line 12
    .line 13
    invoke-virtual {p0}, Lg0/z;->f()I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 18
    .line 19
    .line 20
    move-result v7

    .line 21
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 22
    .line 23
    .line 24
    move-result v8

    .line 25
    const/4 v9, 0x4

    .line 26
    invoke-virtual {p0, v9}, Lg0/z;->U(I)V

    .line 27
    .line 28
    .line 29
    const v9, 0x6d65616e

    .line 30
    .line 31
    .line 32
    if-ne v8, v9, :cond_0

    .line 33
    .line 34
    add-int/lit8 v7, v7, -0xc

    .line 35
    .line 36
    invoke-virtual {p0, v7}, Lg0/z;->B(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const v9, 0x6e616d65

    .line 42
    .line 43
    .line 44
    if-ne v8, v9, :cond_1

    .line 45
    .line 46
    add-int/lit8 v7, v7, -0xc

    .line 47
    .line 48
    invoke-virtual {p0, v7}, Lg0/z;->B(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const v9, 0x64617461

    .line 54
    .line 55
    .line 56
    if-ne v8, v9, :cond_2

    .line 57
    .line 58
    move v4, v6

    .line 59
    move v5, v7

    .line 60
    :cond_2
    add-int/lit8 v7, v7, -0xc

    .line 61
    .line 62
    invoke-virtual {p0, v7}, Lg0/z;->U(I)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    if-eqz v2, :cond_5

    .line 67
    .line 68
    if-eqz v3, :cond_5

    .line 69
    .line 70
    if-ne v4, v1, :cond_4

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    invoke-virtual {p0, v4}, Lg0/z;->T(I)V

    .line 74
    .line 75
    .line 76
    const/16 p1, 0x10

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Lg0/z;->U(I)V

    .line 79
    .line 80
    .line 81
    sub-int/2addr v5, p1

    .line 82
    invoke-virtual {p0, v5}, Lg0/z;->B(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    new-instance p1, LT0/k;

    .line 87
    .line 88
    invoke-direct {p1, v2, v3, p0}, LT0/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-object p1

    .line 92
    :cond_5
    :goto_1
    return-object v0
.end method

.method public static h(Lg0/z;ILjava/lang/String;)Lh0/a;
    .locals 4

    .line 1
    :goto_0
    invoke-virtual {p0}, Lg0/z;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ge v0, p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const v3, 0x64617461

    .line 16
    .line 17
    .line 18
    if-ne v2, v3, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    add-int/lit8 v1, v1, -0x10

    .line 29
    .line 30
    new-array v2, v1, [B

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-virtual {p0, v2, v3, v1}, Lg0/z;->l([BII)V

    .line 34
    .line 35
    .line 36
    new-instance p0, Lh0/a;

    .line 37
    .line 38
    invoke-direct {p0, p2, v2, v0, p1}, Lh0/a;-><init>(Ljava/lang/String;[BII)V

    .line 39
    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_0
    add-int/2addr v0, v1

    .line 43
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 p0, 0x0

    .line 48
    return-object p0
.end method

.method public static i(Lg0/z;)LT0/n;
    .locals 3

    .line 1
    invoke-static {p0}, LZ0/j;->e(Lg0/z;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    add-int/lit8 p0, p0, -0x1

    .line 6
    .line 7
    invoke-static {p0}, LT0/j;->a(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    new-instance v1, LT0/n;

    .line 15
    .line 16
    const-string v2, "TCON"

    .line 17
    .line 18
    invoke-static {p0}, LX2/v;->Z(Ljava/lang/Object;)LX2/v;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {v1, v2, v0, p0}, LT0/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_0
    const-string p0, "MetadataUtil"

    .line 27
    .line 28
    const-string v1, "Failed to parse standard genre code"

    .line 29
    .line 30
    invoke-static {p0, v1}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method public static j(ILjava/lang/String;Lg0/z;)LT0/n;
    .locals 4

    .line 1
    invoke-virtual {p2}, Lg0/z;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p2}, Lg0/z;->p()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0x64617461

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    const/16 p0, 0x8

    .line 16
    .line 17
    invoke-virtual {p2, p0}, Lg0/z;->U(I)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v0, v0, -0x10

    .line 21
    .line 22
    invoke-virtual {p2, v0}, Lg0/z;->B(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    new-instance p2, LT0/n;

    .line 27
    .line 28
    invoke-static {p0}, LX2/v;->Z(Ljava/lang/Object;)LX2/v;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {p2, p1, v3, p0}, LT0/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    return-object p2

    .line 36
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string p2, "Failed to parse text attribute: "

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-static {p0}, LZ0/a;->a(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const-string p1, "MetadataUtil"

    .line 58
    .line 59
    invoke-static {p1, p0}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v3
.end method

.method public static k(ILF0/E;Ld0/q$b;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, v0, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, LF0/E;->a()Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    iget p0, p1, LF0/E;->a:I

    .line 11
    .line 12
    invoke-virtual {p2, p0}, Ld0/q$b;->V(I)Ld0/q$b;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget p1, p1, LF0/E;->b:I

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ld0/q$b;->W(I)Ld0/q$b;

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public static varargs l(ILd0/x;Ld0/q$b;[Ld0/x;)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    new-instance v1, Ld0/x;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    new-array v3, v2, [Ld0/x$b;

    .line 6
    .line 7
    invoke-direct {v1, v3}, Ld0/x;-><init>([Ld0/x$b;)V

    .line 8
    .line 9
    .line 10
    if-eqz p1, :cond_2

    .line 11
    .line 12
    move v3, v2

    .line 13
    :goto_0
    invoke-virtual {p1}, Ld0/x;->e()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-ge v3, v4, :cond_2

    .line 18
    .line 19
    invoke-virtual {p1, v3}, Ld0/x;->d(I)Ld0/x$b;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    instance-of v5, v4, Lh0/a;

    .line 24
    .line 25
    if-eqz v5, :cond_1

    .line 26
    .line 27
    check-cast v4, Lh0/a;

    .line 28
    .line 29
    iget-object v5, v4, Lh0/a;->o:Ljava/lang/String;

    .line 30
    .line 31
    const-string v6, "com.android.capture.fps"

    .line 32
    .line 33
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    const/4 v5, 0x2

    .line 40
    if-ne p0, v5, :cond_1

    .line 41
    .line 42
    new-array v5, v0, [Ld0/x$b;

    .line 43
    .line 44
    aput-object v4, v5, v2

    .line 45
    .line 46
    invoke-virtual {v1, v5}, Ld0/x;->a([Ld0/x$b;)Ld0/x;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    new-array v5, v0, [Ld0/x$b;

    .line 52
    .line 53
    aput-object v4, v5, v2

    .line 54
    .line 55
    invoke-virtual {v1, v5}, Ld0/x;->a([Ld0/x$b;)Ld0/x;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :cond_1
    :goto_1
    add-int/2addr v3, v0

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    array-length p0, p3

    .line 62
    :goto_2
    if-ge v2, p0, :cond_3

    .line 63
    .line 64
    aget-object p1, p3, v2

    .line 65
    .line 66
    invoke-virtual {v1, p1}, Ld0/x;->b(Ld0/x;)Ld0/x;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    add-int/2addr v2, v0

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    invoke-virtual {v1}, Ld0/x;->e()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-lez p0, :cond_4

    .line 77
    .line 78
    invoke-virtual {p2, v1}, Ld0/q$b;->h0(Ld0/x;)Ld0/q$b;

    .line 79
    .line 80
    .line 81
    :cond_4
    return-void
.end method
