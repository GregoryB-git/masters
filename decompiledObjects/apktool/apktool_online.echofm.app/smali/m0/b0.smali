.class public Lm0/b0;
.super Lt0/w;
.source "SourceFile"

# interfaces
.implements Lk0/A0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm0/b0$c;,
        Lm0/b0$b;
    }
.end annotation


# instance fields
.field public final V0:Landroid/content/Context;

.field public final W0:Lm0/x$a;

.field public final X0:Lm0/z;

.field public Y0:I

.field public Z0:Z

.field public a1:Z

.field public b1:Ld0/q;

.field public c1:Ld0/q;

.field public d1:J

.field public e1:Z

.field public f1:Z

.field public g1:Z

.field public h1:I

.field public i1:Z

.field public j1:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Lt0/m$b;Lt0/z;ZLandroid/os/Handler;Lm0/x;Lm0/z;)V
    .locals 6

    .line 1
    const/4 v1, 0x1

    .line 2
    const v5, 0x472c4400    # 44100.0f

    .line 3
    .line 4
    .line 5
    move-object v0, p0

    .line 6
    move-object v2, p2

    .line 7
    move-object v3, p3

    .line 8
    move v4, p4

    .line 9
    invoke-direct/range {v0 .. v5}, Lt0/w;-><init>(ILt0/m$b;Lt0/z;ZF)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lm0/b0;->V0:Landroid/content/Context;

    .line 17
    .line 18
    iput-object p7, p0, Lm0/b0;->X0:Lm0/z;

    .line 19
    .line 20
    const/16 p1, -0x3e8

    .line 21
    .line 22
    iput p1, p0, Lm0/b0;->h1:I

    .line 23
    .line 24
    new-instance p1, Lm0/x$a;

    .line 25
    .line 26
    invoke-direct {p1, p5, p6}, Lm0/x$a;-><init>(Landroid/os/Handler;Lm0/x;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lm0/b0;->W0:Lm0/x$a;

    .line 30
    .line 31
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    iput-wide p1, p0, Lm0/b0;->j1:J

    .line 37
    .line 38
    new-instance p1, Lm0/b0$c;

    .line 39
    .line 40
    const/4 p2, 0x0

    .line 41
    invoke-direct {p1, p0, p2}, Lm0/b0$c;-><init>(Lm0/b0;Lm0/b0$a;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p7, p1}, Lm0/z;->C(Lm0/z$d;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public static synthetic Q1(Lm0/b0;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lm0/b0;->g1:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic R1(Lm0/b0;)Lm0/x$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lm0/b0;->W0:Lm0/x$a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic S1(Lm0/b0;)Lk0/Y0$a;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lt0/w;->S0()Lk0/Y0$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic T1(Lm0/b0;)Lk0/Y0$a;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lt0/w;->S0()Lk0/Y0$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic U1(Lm0/b0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lk0/n;->Y()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static V1(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget v0, Lg0/M;->a:I

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    if-ge v0, v1, :cond_1

    .line 6
    .line 7
    const-string v0, "OMX.SEC.aac.dec"

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    const-string p0, "samsung"

    .line 16
    .line 17
    sget-object v0, Lg0/M;->c:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    sget-object p0, Lg0/M;->b:Ljava/lang/String;

    .line 26
    .line 27
    const-string v0, "zeroflte"

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    const-string v0, "herolte"

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_0

    .line 42
    .line 43
    const-string v0, "heroqlte"

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-eqz p0, :cond_1

    .line 50
    .line 51
    :cond_0
    const/4 p0, 0x1

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const/4 p0, 0x0

    .line 54
    :goto_0
    return p0
.end method

.method public static W1(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "OMX.google.opus.decoder"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "c2.android.opus.decoder"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-string v0, "OMX.google.vorbis.decoder"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    const-string v0, "c2.android.vorbis.decoder"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 37
    :goto_1
    return p0
.end method

.method public static X1()Z
    .locals 2

    .line 1
    sget v0, Lg0/M;->a:I

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    if-ne v0, v1, :cond_1

    .line 6
    .line 7
    sget-object v0, Lg0/M;->d:Ljava/lang/String;

    .line 8
    .line 9
    const-string v1, "ZTE B2017G"

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const-string v1, "AXON 7 mini"

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    :cond_0
    const/4 v0, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    :goto_0
    return v0
.end method

.method private Z1(Lt0/p;Ld0/q;)I
    .locals 1

    .line 1
    const-string v0, "OMX.google.raw.decoder"

    .line 2
    .line 3
    iget-object p1, p1, Lt0/p;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    sget p1, Lg0/M;->a:I

    .line 12
    .line 13
    const/16 v0, 0x18

    .line 14
    .line 15
    if-ge p1, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x17

    .line 18
    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Lm0/b0;->V0:Landroid/content/Context;

    .line 22
    .line 23
    invoke-static {p1}, Lg0/M;->E0(Landroid/content/Context;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    :cond_0
    const/4 p1, -0x1

    .line 30
    return p1

    .line 31
    :cond_1
    iget p1, p2, Ld0/q;->o:I

    .line 32
    .line 33
    return p1
.end method

.method public static b2(Lt0/z;Ld0/q;ZLm0/z;)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p1, Ld0/q;->n:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, LX2/v;->Y()LX2/v;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-interface {p3, p1}, Lm0/z;->a(Ld0/q;)Z

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    if-eqz p3, :cond_1

    .line 15
    .line 16
    invoke-static {}, Lt0/I;->x()Lt0/p;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    invoke-static {p3}, LX2/v;->Z(Ljava/lang/Object;)LX2/v;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_1
    const/4 p3, 0x0

    .line 28
    invoke-static {p0, p1, p2, p3}, Lt0/I;->v(Lt0/z;Ld0/q;ZZ)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method


# virtual methods
.method public B()Lk0/A0;
    .locals 0

    .line 1
    return-object p0
.end method

.method public H()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk0/n;->getState()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lm0/b0;->f2()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-wide v0, p0, Lm0/b0;->d1:J

    .line 12
    .line 13
    return-wide v0
.end method

.method public J0(FLd0/q;[Ld0/q;)F
    .locals 4

    .line 1
    array-length p2, p3

    .line 2
    const/4 v0, -0x1

    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v0

    .line 5
    :goto_0
    if-ge v1, p2, :cond_1

    .line 6
    .line 7
    aget-object v3, p3, v1

    .line 8
    .line 9
    iget v3, v3, Ld0/q;->C:I

    .line 10
    .line 11
    if-eq v3, v0, :cond_0

    .line 12
    .line 13
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    if-ne v2, v0, :cond_2

    .line 21
    .line 22
    const/high16 p1, -0x40800000    # -1.0f

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    int-to-float p2, v2

    .line 26
    mul-float/2addr p1, p2

    .line 27
    :goto_1
    return p1
.end method

.method public K1(Ld0/q;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lk0/n;->M()Lk0/b1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Lk0/b1;->a:I

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lm0/b0;->Y1(Ld0/q;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    and-int/lit16 v1, v0, 0x200

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lk0/n;->M()Lk0/b1;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget v1, v1, Lk0/b1;->a:I

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    if-eq v1, v2, :cond_0

    .line 25
    .line 26
    and-int/lit16 v0, v0, 0x400

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    iget v0, p1, Ld0/q;->E:I

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    iget v0, p1, Ld0/q;->F:I

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    :cond_0
    const/4 p1, 0x1

    .line 39
    return p1

    .line 40
    :cond_1
    iget-object v0, p0, Lm0/b0;->X0:Lm0/z;

    .line 41
    .line 42
    invoke-interface {v0, p1}, Lm0/z;->a(Ld0/q;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    return p1
.end method

.method public L0(Lt0/z;Ld0/q;Z)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/b0;->X0:Lm0/z;

    .line 2
    .line 3
    invoke-static {p1, p2, p3, v0}, Lm0/b0;->b2(Lt0/z;Ld0/q;ZLm0/z;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1, p2}, Lt0/I;->w(Ljava/util/List;Ld0/q;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public L1(Lt0/z;Ld0/q;)I
    .locals 11

    .line 1
    iget-object v0, p2, Ld0/q;->n:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Ld0/z;->o(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Lk0/Z0;->a(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :cond_0
    sget v0, Lg0/M;->a:I

    .line 16
    .line 17
    const/16 v2, 0x15

    .line 18
    .line 19
    if-lt v0, v2, :cond_1

    .line 20
    .line 21
    const/16 v0, 0x20

    .line 22
    .line 23
    move v4, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move v4, v1

    .line 26
    :goto_0
    iget v0, p2, Ld0/q;->K:I

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    move v0, v2

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    move v0, v1

    .line 34
    :goto_1
    invoke-static {p2}, Lt0/w;->M1(Ld0/q;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const/16 v5, 0x8

    .line 39
    .line 40
    const/4 v6, 0x4

    .line 41
    if-eqz v3, :cond_5

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-static {}, Lt0/I;->x()Lt0/p;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-eqz v0, :cond_5

    .line 50
    .line 51
    :cond_3
    invoke-virtual {p0, p2}, Lm0/b0;->Y1(Ld0/q;)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iget-object v7, p0, Lm0/b0;->X0:Lm0/z;

    .line 56
    .line 57
    invoke-interface {v7, p2}, Lm0/z;->a(Ld0/q;)Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-eqz v7, :cond_4

    .line 62
    .line 63
    invoke-static {v6, v5, v4, v0}, Lk0/Z0;->b(IIII)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    return p1

    .line 68
    :cond_4
    move v7, v0

    .line 69
    goto :goto_2

    .line 70
    :cond_5
    move v7, v1

    .line 71
    :goto_2
    const-string v0, "audio/raw"

    .line 72
    .line 73
    iget-object v8, p2, Ld0/q;->n:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_6

    .line 80
    .line 81
    iget-object v0, p0, Lm0/b0;->X0:Lm0/z;

    .line 82
    .line 83
    invoke-interface {v0, p2}, Lm0/z;->a(Ld0/q;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_6

    .line 88
    .line 89
    invoke-static {v2}, Lk0/Z0;->a(I)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    return p1

    .line 94
    :cond_6
    iget-object v0, p0, Lm0/b0;->X0:Lm0/z;

    .line 95
    .line 96
    iget v8, p2, Ld0/q;->B:I

    .line 97
    .line 98
    iget v9, p2, Ld0/q;->C:I

    .line 99
    .line 100
    const/4 v10, 0x2

    .line 101
    invoke-static {v10, v8, v9}, Lg0/M;->f0(III)Ld0/q;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    invoke-interface {v0, v8}, Lm0/z;->a(Ld0/q;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_7

    .line 110
    .line 111
    invoke-static {v2}, Lk0/Z0;->a(I)I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    return p1

    .line 116
    :cond_7
    iget-object v0, p0, Lm0/b0;->X0:Lm0/z;

    .line 117
    .line 118
    invoke-static {p1, p2, v1, v0}, Lm0/b0;->b2(Lt0/z;Ld0/q;ZLm0/z;)Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_8

    .line 127
    .line 128
    invoke-static {v2}, Lk0/Z0;->a(I)I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    return p1

    .line 133
    :cond_8
    if-nez v3, :cond_9

    .line 134
    .line 135
    invoke-static {v10}, Lk0/Z0;->a(I)I

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    return p1

    .line 140
    :cond_9
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    check-cast v0, Lt0/p;

    .line 145
    .line 146
    invoke-virtual {v0, p2}, Lt0/p;->m(Ld0/q;)Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-nez v3, :cond_b

    .line 151
    .line 152
    move v8, v2

    .line 153
    :goto_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    if-ge v8, v9, :cond_b

    .line 158
    .line 159
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    check-cast v9, Lt0/p;

    .line 164
    .line 165
    invoke-virtual {v9, p2}, Lt0/p;->m(Ld0/q;)Z

    .line 166
    .line 167
    .line 168
    move-result v10

    .line 169
    if-eqz v10, :cond_a

    .line 170
    .line 171
    move p1, v1

    .line 172
    move-object v0, v9

    .line 173
    goto :goto_4

    .line 174
    :cond_a
    add-int/lit8 v8, v8, 0x1

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_b
    move p1, v2

    .line 178
    move v2, v3

    .line 179
    :goto_4
    if-eqz v2, :cond_c

    .line 180
    .line 181
    move v3, v6

    .line 182
    goto :goto_5

    .line 183
    :cond_c
    const/4 v3, 0x3

    .line 184
    :goto_5
    if-eqz v2, :cond_d

    .line 185
    .line 186
    invoke-virtual {v0, p2}, Lt0/p;->p(Ld0/q;)Z

    .line 187
    .line 188
    .line 189
    move-result p2

    .line 190
    if-eqz p2, :cond_d

    .line 191
    .line 192
    const/16 p2, 0x10

    .line 193
    .line 194
    goto :goto_6

    .line 195
    :cond_d
    move p2, v5

    .line 196
    :goto_6
    iget-boolean v0, v0, Lt0/p;->h:Z

    .line 197
    .line 198
    if-eqz v0, :cond_e

    .line 199
    .line 200
    const/16 v0, 0x40

    .line 201
    .line 202
    move v5, v0

    .line 203
    goto :goto_7

    .line 204
    :cond_e
    move v5, v1

    .line 205
    :goto_7
    if-eqz p1, :cond_f

    .line 206
    .line 207
    const/16 v1, 0x80

    .line 208
    .line 209
    :cond_f
    move v6, v1

    .line 210
    move v2, v3

    .line 211
    move v3, p2

    .line 212
    invoke-static/range {v2 .. v7}, Lk0/Z0;->d(IIIIII)I

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    return p1
.end method

.method public M0(ZJJ)J
    .locals 4

    .line 1
    iget-wide v0, p0, Lm0/b0;->j1:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    if-eqz v2, :cond_2

    .line 11
    .line 12
    sub-long/2addr v0, p2

    .line 13
    long-to-float p1, v0

    .line 14
    invoke-virtual {p0}, Lm0/b0;->h()Ld0/C;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lm0/b0;->h()Ld0/C;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iget p2, p2, Ld0/C;->a:F

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/high16 p2, 0x3f800000    # 1.0f

    .line 28
    .line 29
    :goto_0
    div-float/2addr p1, p2

    .line 30
    const/high16 p2, 0x40000000    # 2.0f

    .line 31
    .line 32
    div-float/2addr p1, p2

    .line 33
    float-to-long p1, p1

    .line 34
    iget-boolean p3, p0, Lm0/b0;->i1:Z

    .line 35
    .line 36
    if-eqz p3, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, Lk0/n;->L()Lg0/c;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    invoke-interface {p3}, Lg0/c;->b()J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    invoke-static {v0, v1}, Lg0/M;->J0(J)J

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    sub-long/2addr v0, p4

    .line 51
    sub-long/2addr p1, v0

    .line 52
    :cond_1
    const-wide/16 p3, 0x2710

    .line 53
    .line 54
    invoke-static {p3, p4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 55
    .line 56
    .line 57
    move-result-wide p1

    .line 58
    return-wide p1

    .line 59
    :cond_2
    invoke-super/range {p0 .. p5}, Lt0/w;->M0(ZJJ)J

    .line 60
    .line 61
    .line 62
    move-result-wide p1

    .line 63
    return-wide p1
.end method

.method public O0(Lt0/p;Ld0/q;Landroid/media/MediaCrypto;F)Lt0/m$a;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk0/n;->R()[Ld0/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1, p2, v0}, Lm0/b0;->a2(Lt0/p;Ld0/q;[Ld0/q;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput v0, p0, Lm0/b0;->Y0:I

    .line 10
    .line 11
    iget-object v0, p1, Lt0/p;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v0}, Lm0/b0;->V1(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput-boolean v0, p0, Lm0/b0;->Z0:Z

    .line 18
    .line 19
    iget-object v0, p1, Lt0/p;->a:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v0}, Lm0/b0;->W1(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iput-boolean v0, p0, Lm0/b0;->a1:Z

    .line 26
    .line 27
    iget-object v0, p1, Lt0/p;->c:Ljava/lang/String;

    .line 28
    .line 29
    iget v1, p0, Lm0/b0;->Y0:I

    .line 30
    .line 31
    invoke-virtual {p0, p2, v0, v1, p4}, Lm0/b0;->c2(Ld0/q;Ljava/lang/String;IF)Landroid/media/MediaFormat;

    .line 32
    .line 33
    .line 34
    move-result-object p4

    .line 35
    iget-object v0, p1, Lt0/p;->b:Ljava/lang/String;

    .line 36
    .line 37
    const-string v1, "audio/raw"

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    iget-object v0, p2, Ld0/q;->n:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_0

    .line 52
    .line 53
    move-object v0, p2

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 v0, 0x0

    .line 56
    :goto_0
    iput-object v0, p0, Lm0/b0;->c1:Ld0/q;

    .line 57
    .line 58
    invoke-static {p1, p4, p2, p3}, Lt0/m$a;->a(Lt0/p;Landroid/media/MediaFormat;Ld0/q;Landroid/media/MediaCrypto;)Lt0/m$a;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1
.end method

.method public T()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lm0/b0;->f1:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lm0/b0;->b1:Ld0/q;

    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Lm0/b0;->X0:Lm0/z;

    .line 8
    .line 9
    invoke-interface {v0}, Lm0/z;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    .line 11
    .line 12
    :try_start_1
    invoke-super {p0}, Lt0/w;->T()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lm0/b0;->W0:Lm0/x$a;

    .line 16
    .line 17
    iget-object v1, p0, Lt0/w;->Q0:Lk0/o;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lm0/x$a;->s(Lk0/o;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    iget-object v1, p0, Lm0/b0;->W0:Lm0/x$a;

    .line 25
    .line 26
    iget-object v2, p0, Lt0/w;->Q0:Lk0/o;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Lm0/x$a;->s(Lk0/o;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :catchall_1
    move-exception v0

    .line 33
    :try_start_2
    invoke-super {p0}, Lt0/w;->T()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lm0/b0;->W0:Lm0/x$a;

    .line 37
    .line 38
    iget-object v2, p0, Lt0/w;->Q0:Lk0/o;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lm0/x$a;->s(Lk0/o;)V

    .line 41
    .line 42
    .line 43
    throw v0

    .line 44
    :catchall_2
    move-exception v0

    .line 45
    iget-object v1, p0, Lm0/b0;->W0:Lm0/x$a;

    .line 46
    .line 47
    iget-object v2, p0, Lt0/w;->Q0:Lk0/o;

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Lm0/x$a;->s(Lk0/o;)V

    .line 50
    .line 51
    .line 52
    throw v0
.end method

.method public T0(Lj0/i;)V
    .locals 4

    .line 1
    sget v0, Lg0/M;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p1, Lj0/i;->p:Ld0/q;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Ld0/q;->n:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "audio/opus"

    .line 14
    .line 15
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lt0/w;->Z0()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p1, Lj0/i;->u:Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    iget-object p1, p1, Lj0/i;->p:Ld0/q;

    .line 36
    .line 37
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Ld0/q;

    .line 42
    .line 43
    iget p1, p1, Ld0/q;->E:I

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const/16 v2, 0x8

    .line 50
    .line 51
    if-ne v1, v2, :cond_0

    .line 52
    .line 53
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getLong()J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    const-wide/32 v2, 0xbb80

    .line 64
    .line 65
    .line 66
    mul-long/2addr v0, v2

    .line 67
    const-wide/32 v2, 0x3b9aca00

    .line 68
    .line 69
    .line 70
    div-long/2addr v0, v2

    .line 71
    long-to-int v0, v0

    .line 72
    iget-object v1, p0, Lm0/b0;->X0:Lm0/z;

    .line 73
    .line 74
    invoke-interface {v1, p1, v0}, Lm0/z;->q(II)V

    .line 75
    .line 76
    .line 77
    :cond_0
    return-void
.end method

.method public U(ZZ)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lt0/w;->U(ZZ)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lm0/b0;->W0:Lm0/x$a;

    .line 5
    .line 6
    iget-object p2, p0, Lt0/w;->Q0:Lk0/o;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lm0/x$a;->t(Lk0/o;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lk0/n;->M()Lk0/b1;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-boolean p1, p1, Lk0/b1;->b:Z

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lm0/b0;->X0:Lm0/z;

    .line 20
    .line 21
    invoke-interface {p1}, Lm0/z;->e()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object p1, p0, Lm0/b0;->X0:Lm0/z;

    .line 26
    .line 27
    invoke-interface {p1}, Lm0/z;->x()V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p1, p0, Lm0/b0;->X0:Lm0/z;

    .line 31
    .line 32
    invoke-virtual {p0}, Lk0/n;->Q()Ll0/y1;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-interface {p1, p2}, Lm0/z;->t(Ll0/y1;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lm0/b0;->X0:Lm0/z;

    .line 40
    .line 41
    invoke-virtual {p0}, Lk0/n;->L()Lg0/c;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-interface {p1, p2}, Lm0/z;->A(Lg0/c;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public W(JZ)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lt0/w;->W(JZ)V

    .line 2
    .line 3
    .line 4
    iget-object p3, p0, Lm0/b0;->X0:Lm0/z;

    .line 5
    .line 6
    invoke-interface {p3}, Lm0/z;->flush()V

    .line 7
    .line 8
    .line 9
    iput-wide p1, p0, Lm0/b0;->d1:J

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-boolean p1, p0, Lm0/b0;->g1:Z

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lm0/b0;->e1:Z

    .line 16
    .line 17
    return-void
.end method

.method public X()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/b0;->X0:Lm0/z;

    .line 2
    .line 3
    invoke-interface {v0}, Lm0/z;->release()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final Y1(Ld0/q;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/b0;->X0:Lm0/z;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lm0/z;->r(Ld0/q;)Lm0/k;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-boolean v0, p1, Lm0/k;->a:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :cond_0
    iget-boolean v0, p1, Lm0/k;->b:Z

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x600

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/16 v0, 0x200

    .line 21
    .line 22
    :goto_0
    iget-boolean p1, p1, Lm0/k;->c:Z

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    or-int/lit16 v0, v0, 0x800

    .line 27
    .line 28
    :cond_2
    return v0
.end method

.method public Z()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lm0/b0;->g1:Z

    .line 3
    .line 4
    :try_start_0
    invoke-super {p0}, Lt0/w;->Z()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    iget-boolean v1, p0, Lm0/b0;->f1:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iput-boolean v0, p0, Lm0/b0;->f1:Z

    .line 12
    .line 13
    iget-object v0, p0, Lm0/b0;->X0:Lm0/z;

    .line 14
    .line 15
    invoke-interface {v0}, Lm0/z;->b()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    iget-boolean v2, p0, Lm0/b0;->f1:Z

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    iput-boolean v0, p0, Lm0/b0;->f1:Z

    .line 25
    .line 26
    iget-object v0, p0, Lm0/b0;->X0:Lm0/z;

    .line 27
    .line 28
    invoke-interface {v0}, Lm0/z;->b()V

    .line 29
    .line 30
    .line 31
    :cond_1
    throw v1
.end method

.method public a0()V
    .locals 1

    .line 1
    invoke-super {p0}, Lt0/w;->a0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lm0/b0;->X0:Lm0/z;

    .line 5
    .line 6
    invoke-interface {v0}, Lm0/z;->p()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lm0/b0;->i1:Z

    .line 11
    .line 12
    return-void
.end method

.method public a2(Lt0/p;Ld0/q;[Ld0/q;)I
    .locals 5

    .line 1
    invoke-direct {p0, p1, p2}, Lm0/b0;->Z1(Lt0/p;Ld0/q;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    array-length v1, p3

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    array-length v1, p3

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_2

    .line 13
    .line 14
    aget-object v3, p3, v2

    .line 15
    .line 16
    invoke-virtual {p1, p2, v3}, Lt0/p;->e(Ld0/q;Ld0/q;)Lk0/p;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    iget v4, v4, Lk0/p;->d:I

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    invoke-direct {p0, p1, v3}, Lm0/b0;->Z1(Lt0/p;Ld0/q;)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    return v0
.end method

.method public b0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm0/b0;->f2()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lm0/b0;->i1:Z

    .line 6
    .line 7
    iget-object v0, p0, Lm0/b0;->X0:Lm0/z;

    .line 8
    .line 9
    invoke-interface {v0}, Lm0/z;->j()V

    .line 10
    .line 11
    .line 12
    invoke-super {p0}, Lt0/w;->b0()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public c()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lt0/w;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lm0/b0;->X0:Lm0/z;

    .line 8
    .line 9
    invoke-interface {v0}, Lm0/z;->c()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    return v0
.end method

.method public c2(Ld0/q;Ljava/lang/String;IF)Landroid/media/MediaFormat;
    .locals 3

    .line 1
    new-instance v0, Landroid/media/MediaFormat;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/media/MediaFormat;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "mime"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p2}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget p2, p1, Ld0/q;->B:I

    .line 12
    .line 13
    const-string v1, "channel-count"

    .line 14
    .line 15
    invoke-virtual {v0, v1, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    const-string p2, "sample-rate"

    .line 19
    .line 20
    iget v1, p1, Ld0/q;->C:I

    .line 21
    .line 22
    invoke-virtual {v0, p2, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    iget-object p2, p1, Ld0/q;->q:Ljava/util/List;

    .line 26
    .line 27
    invoke-static {v0, p2}, Lg0/r;->e(Landroid/media/MediaFormat;Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    const-string p2, "max-input-size"

    .line 31
    .line 32
    invoke-static {v0, p2, p3}, Lg0/r;->d(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    sget p2, Lg0/M;->a:I

    .line 36
    .line 37
    const/16 p3, 0x17

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    if-lt p2, p3, :cond_0

    .line 41
    .line 42
    const-string p3, "priority"

    .line 43
    .line 44
    invoke-virtual {v0, p3, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    const/high16 p3, -0x40800000    # -1.0f

    .line 48
    .line 49
    cmpl-float p3, p4, p3

    .line 50
    .line 51
    if-eqz p3, :cond_0

    .line 52
    .line 53
    invoke-static {}, Lm0/b0;->X1()Z

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    if-nez p3, :cond_0

    .line 58
    .line 59
    const-string p3, "operating-rate"

    .line 60
    .line 61
    invoke-virtual {v0, p3, p4}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    .line 62
    .line 63
    .line 64
    :cond_0
    const/16 p3, 0x1c

    .line 65
    .line 66
    if-gt p2, p3, :cond_1

    .line 67
    .line 68
    const-string p3, "audio/ac4"

    .line 69
    .line 70
    iget-object p4, p1, Ld0/q;->n:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p3

    .line 76
    if-eqz p3, :cond_1

    .line 77
    .line 78
    const-string p3, "ac4-is-sync"

    .line 79
    .line 80
    const/4 p4, 0x1

    .line 81
    invoke-virtual {v0, p3, p4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 82
    .line 83
    .line 84
    :cond_1
    const/16 p3, 0x18

    .line 85
    .line 86
    if-lt p2, p3, :cond_2

    .line 87
    .line 88
    iget-object p3, p0, Lm0/b0;->X0:Lm0/z;

    .line 89
    .line 90
    iget p4, p1, Ld0/q;->B:I

    .line 91
    .line 92
    iget p1, p1, Ld0/q;->C:I

    .line 93
    .line 94
    const/4 v2, 0x4

    .line 95
    invoke-static {v2, p4, p1}, Lg0/M;->f0(III)Ld0/q;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-interface {p3, p1}, Lm0/z;->o(Ld0/q;)I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    const/4 p3, 0x2

    .line 104
    if-ne p1, p3, :cond_2

    .line 105
    .line 106
    const-string p1, "pcm-encoding"

    .line 107
    .line 108
    invoke-virtual {v0, p1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 109
    .line 110
    .line 111
    :cond_2
    const/16 p1, 0x20

    .line 112
    .line 113
    if-lt p2, p1, :cond_3

    .line 114
    .line 115
    const-string p1, "max-output-channel-count"

    .line 116
    .line 117
    const/16 p3, 0x63

    .line 118
    .line 119
    invoke-virtual {v0, p1, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 120
    .line 121
    .line 122
    :cond_3
    const/16 p1, 0x23

    .line 123
    .line 124
    if-lt p2, p1, :cond_4

    .line 125
    .line 126
    iget p1, p0, Lm0/b0;->h1:I

    .line 127
    .line 128
    neg-int p1, p1

    .line 129
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    const-string p2, "importance"

    .line 134
    .line 135
    invoke-virtual {v0, p2, p1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 136
    .line 137
    .line 138
    :cond_4
    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "MediaCodecAudioRenderer"

    .line 2
    .line 3
    return-object v0
.end method

.method public d2()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lm0/b0;->e1:Z

    .line 3
    .line 4
    return-void
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/b0;->X0:Lm0/z;

    .line 2
    .line 3
    invoke-interface {v0}, Lm0/z;->i()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-super {p0}, Lt0/w;->e()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 19
    :goto_1
    return v0
.end method

.method public final e2()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lt0/w;->F0()Lt0/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget v1, Lg0/M;->a:I

    .line 9
    .line 10
    const/16 v2, 0x23

    .line 11
    .line 12
    if-lt v1, v2, :cond_1

    .line 13
    .line 14
    new-instance v1, Landroid/os/Bundle;

    .line 15
    .line 16
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 17
    .line 18
    .line 19
    iget v2, p0, Lm0/b0;->h1:I

    .line 20
    .line 21
    neg-int v2, v2

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const-string v3, "importance"

    .line 28
    .line 29
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, v1}, Lt0/m;->c(Landroid/os/Bundle;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method

.method public final f2()V
    .locals 4

    .line 1
    iget-object v0, p0, Lm0/b0;->X0:Lm0/z;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm0/b0;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-interface {v0, v1}, Lm0/z;->w(Z)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/high16 v2, -0x8000000000000000L

    .line 12
    .line 13
    cmp-long v2, v0, v2

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iget-boolean v2, p0, Lm0/b0;->e1:Z

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-wide v2, p0, Lm0/b0;->d1:J

    .line 23
    .line 24
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    :goto_0
    iput-wide v0, p0, Lm0/b0;->d1:J

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput-boolean v0, p0, Lm0/b0;->e1:Z

    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public h()Ld0/C;
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/b0;->X0:Lm0/z;

    .line 2
    .line 3
    invoke-interface {v0}, Lm0/z;->h()Ld0/C;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public h1(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    const-string v0, "MediaCodecAudioRenderer"

    .line 2
    .line 3
    const-string v1, "Audio codec error"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lg0/o;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lm0/b0;->W0:Lm0/x$a;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lm0/x$a;->m(Ljava/lang/Exception;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public i1(Ljava/lang/String;Lt0/m$a;JJ)V
    .locals 6

    .line 1
    iget-object v0, p0, Lm0/b0;->W0:Lm0/x$a;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-wide v2, p3

    .line 5
    move-wide v4, p5

    .line 6
    invoke-virtual/range {v0 .. v5}, Lm0/x$a;->q(Ljava/lang/String;JJ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public j1(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/b0;->W0:Lm0/x$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm0/x$a;->r(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k(Ld0/C;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/b0;->X0:Lm0/z;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lm0/z;->k(Ld0/C;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k0(Lt0/p;Ld0/q;Ld0/q;)Lk0/p;
    .locals 8

    .line 1
    invoke-virtual {p1, p2, p3}, Lt0/p;->e(Ld0/q;Ld0/q;)Lk0/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, v0, Lk0/p;->e:I

    .line 6
    .line 7
    invoke-virtual {p0, p3}, Lt0/w;->a1(Ld0/q;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    const v2, 0x8000

    .line 14
    .line 15
    .line 16
    or-int/2addr v1, v2

    .line 17
    :cond_0
    invoke-direct {p0, p1, p3}, Lm0/b0;->Z1(Lt0/p;Ld0/q;)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget v3, p0, Lm0/b0;->Y0:I

    .line 22
    .line 23
    if-le v2, v3, :cond_1

    .line 24
    .line 25
    or-int/lit8 v1, v1, 0x40

    .line 26
    .line 27
    :cond_1
    move v7, v1

    .line 28
    new-instance v1, Lk0/p;

    .line 29
    .line 30
    iget-object v3, p1, Lt0/p;->a:Ljava/lang/String;

    .line 31
    .line 32
    if-eqz v7, :cond_2

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    :goto_0
    move v6, p1

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    iget p1, v0, Lk0/p;->d:I

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_1
    move-object v2, v1

    .line 41
    move-object v4, p2

    .line 42
    move-object v5, p3

    .line 43
    invoke-direct/range {v2 .. v7}, Lk0/p;-><init>(Ljava/lang/String;Ld0/q;Ld0/q;II)V

    .line 44
    .line 45
    .line 46
    return-object v1
.end method

.method public k1(Lk0/v0;)Lk0/p;
    .locals 2

    .line 1
    iget-object v0, p1, Lk0/v0;->b:Ld0/q;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ld0/q;

    .line 8
    .line 9
    iput-object v0, p0, Lm0/b0;->b1:Ld0/q;

    .line 10
    .line 11
    invoke-super {p0, p1}, Lt0/w;->k1(Lk0/v0;)Lk0/p;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v1, p0, Lm0/b0;->W0:Lm0/x$a;

    .line 16
    .line 17
    invoke-virtual {v1, v0, p1}, Lm0/x$a;->u(Ld0/q;Lk0/p;)V

    .line 18
    .line 19
    .line 20
    return-object p1
.end method

.method public l1(Ld0/q;Landroid/media/MediaFormat;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lm0/b0;->c1:Ld0/q;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move-object p1, v0

    .line 8
    goto/16 :goto_3

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lt0/w;->F0()Lt0/m;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :cond_1
    invoke-static {p2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, Ld0/q;->n:Ljava/lang/String;

    .line 22
    .line 23
    const-string v3, "audio/raw"

    .line 24
    .line 25
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget v0, p1, Ld0/q;->D:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    sget v0, Lg0/M;->a:I

    .line 35
    .line 36
    const/16 v4, 0x18

    .line 37
    .line 38
    if-lt v0, v4, :cond_3

    .line 39
    .line 40
    const-string v0, "pcm-encoding"

    .line 41
    .line 42
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    goto :goto_0

    .line 53
    :cond_3
    const-string v0, "v-bits-per-sample"

    .line 54
    .line 55
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_4

    .line 60
    .line 61
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-static {v0}, Lg0/M;->e0(I)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    goto :goto_0

    .line 70
    :cond_4
    const/4 v0, 0x2

    .line 71
    :goto_0
    new-instance v4, Ld0/q$b;

    .line 72
    .line 73
    invoke-direct {v4}, Ld0/q$b;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v3}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v3, v0}, Ld0/q$b;->i0(I)Ld0/q$b;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget v3, p1, Ld0/q;->E:I

    .line 85
    .line 86
    invoke-virtual {v0, v3}, Ld0/q$b;->V(I)Ld0/q$b;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iget v3, p1, Ld0/q;->F:I

    .line 91
    .line 92
    invoke-virtual {v0, v3}, Ld0/q$b;->W(I)Ld0/q$b;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iget-object v3, p1, Ld0/q;->k:Ld0/x;

    .line 97
    .line 98
    invoke-virtual {v0, v3}, Ld0/q$b;->h0(Ld0/x;)Ld0/q$b;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iget-object v3, p1, Ld0/q;->l:Ljava/lang/Object;

    .line 103
    .line 104
    invoke-virtual {v0, v3}, Ld0/q$b;->T(Ljava/lang/Object;)Ld0/q$b;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iget-object v3, p1, Ld0/q;->a:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v0, v3}, Ld0/q$b;->a0(Ljava/lang/String;)Ld0/q$b;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iget-object v3, p1, Ld0/q;->b:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {v0, v3}, Ld0/q$b;->c0(Ljava/lang/String;)Ld0/q$b;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iget-object v3, p1, Ld0/q;->c:Ljava/util/List;

    .line 121
    .line 122
    invoke-virtual {v0, v3}, Ld0/q$b;->d0(Ljava/util/List;)Ld0/q$b;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget-object v3, p1, Ld0/q;->d:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v0, v3}, Ld0/q$b;->e0(Ljava/lang/String;)Ld0/q$b;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iget v3, p1, Ld0/q;->e:I

    .line 133
    .line 134
    invoke-virtual {v0, v3}, Ld0/q$b;->q0(I)Ld0/q$b;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    iget v3, p1, Ld0/q;->f:I

    .line 139
    .line 140
    invoke-virtual {v0, v3}, Ld0/q$b;->m0(I)Ld0/q$b;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const-string v3, "channel-count"

    .line 145
    .line 146
    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    invoke-virtual {v0, v3}, Ld0/q$b;->N(I)Ld0/q$b;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    const-string v3, "sample-rate"

    .line 155
    .line 156
    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 157
    .line 158
    .line 159
    move-result p2

    .line 160
    invoke-virtual {v0, p2}, Ld0/q$b;->p0(I)Ld0/q$b;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    invoke-virtual {p2}, Ld0/q$b;->K()Ld0/q;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    iget-boolean v0, p0, Lm0/b0;->Z0:Z

    .line 169
    .line 170
    if-eqz v0, :cond_6

    .line 171
    .line 172
    iget v0, p2, Ld0/q;->B:I

    .line 173
    .line 174
    const/4 v3, 0x6

    .line 175
    if-ne v0, v3, :cond_6

    .line 176
    .line 177
    iget v0, p1, Ld0/q;->B:I

    .line 178
    .line 179
    if-ge v0, v3, :cond_6

    .line 180
    .line 181
    new-array v2, v0, [I

    .line 182
    .line 183
    move v0, v1

    .line 184
    :goto_1
    iget v3, p1, Ld0/q;->B:I

    .line 185
    .line 186
    if-ge v0, v3, :cond_5

    .line 187
    .line 188
    aput v0, v2, v0

    .line 189
    .line 190
    add-int/lit8 v0, v0, 0x1

    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_5
    :goto_2
    move-object p1, p2

    .line 194
    goto :goto_3

    .line 195
    :cond_6
    iget-boolean p1, p0, Lm0/b0;->a1:Z

    .line 196
    .line 197
    if-eqz p1, :cond_5

    .line 198
    .line 199
    iget p1, p2, Ld0/q;->B:I

    .line 200
    .line 201
    invoke-static {p1}, LF0/W;->a(I)[I

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    goto :goto_2

    .line 206
    :goto_3
    :try_start_0
    sget p2, Lg0/M;->a:I

    .line 207
    .line 208
    const/16 v0, 0x1d

    .line 209
    .line 210
    if-lt p2, v0, :cond_8

    .line 211
    .line 212
    invoke-virtual {p0}, Lt0/w;->Z0()Z

    .line 213
    .line 214
    .line 215
    move-result p2

    .line 216
    if-eqz p2, :cond_7

    .line 217
    .line 218
    invoke-virtual {p0}, Lk0/n;->M()Lk0/b1;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    iget p2, p2, Lk0/b1;->a:I

    .line 223
    .line 224
    if-eqz p2, :cond_7

    .line 225
    .line 226
    iget-object p2, p0, Lm0/b0;->X0:Lm0/z;

    .line 227
    .line 228
    invoke-virtual {p0}, Lk0/n;->M()Lk0/b1;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    iget v0, v0, Lk0/b1;->a:I

    .line 233
    .line 234
    invoke-interface {p2, v0}, Lm0/z;->v(I)V

    .line 235
    .line 236
    .line 237
    goto :goto_4

    .line 238
    :catch_0
    move-exception p1

    .line 239
    goto :goto_5

    .line 240
    :cond_7
    iget-object p2, p0, Lm0/b0;->X0:Lm0/z;

    .line 241
    .line 242
    invoke-interface {p2, v1}, Lm0/z;->v(I)V

    .line 243
    .line 244
    .line 245
    :cond_8
    :goto_4
    iget-object p2, p0, Lm0/b0;->X0:Lm0/z;

    .line 246
    .line 247
    invoke-interface {p2, p1, v1, v2}, Lm0/z;->z(Ld0/q;I[I)V
    :try_end_0
    .catch Lm0/z$b; {:try_start_0 .. :try_end_0} :catch_0

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :goto_5
    iget-object p2, p1, Lm0/z$b;->o:Ld0/q;

    .line 252
    .line 253
    const/16 v0, 0x1389

    .line 254
    .line 255
    invoke-virtual {p0, p1, p2, v0}, Lk0/n;->J(Ljava/lang/Throwable;Ld0/q;I)Lk0/u;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    throw p1
.end method

.method public m1(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/b0;->X0:Lm0/z;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lm0/z;->y(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public o1()V
    .locals 1

    .line 1
    invoke-super {p0}, Lt0/w;->o1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lm0/b0;->X0:Lm0/z;

    .line 5
    .line 6
    invoke-interface {v0}, Lm0/z;->B()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public r()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lm0/b0;->g1:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Lm0/b0;->g1:Z

    .line 5
    .line 6
    return v0
.end method

.method public s1(JJLt0/m;Ljava/nio/ByteBuffer;IIIJZZLd0/q;)Z
    .locals 0

    .line 1
    invoke-static {p6}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lm0/b0;->j1:J

    iget-object p1, p0, Lm0/b0;->c1:Ld0/q;

    const/4 p2, 0x1

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    and-int/lit8 p1, p8, 0x2

    if-eqz p1, :cond_0

    invoke-static {p5}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt0/m;

    invoke-interface {p1, p7, p3}, Lt0/m;->f(IZ)V

    return p2

    :cond_0
    if-eqz p12, :cond_2

    if-eqz p5, :cond_1

    invoke-interface {p5, p7, p3}, Lt0/m;->f(IZ)V

    :cond_1
    iget-object p1, p0, Lt0/w;->Q0:Lk0/o;

    iget p3, p1, Lk0/o;->f:I

    add-int/2addr p3, p9

    iput p3, p1, Lk0/o;->f:I

    iget-object p1, p0, Lm0/b0;->X0:Lm0/z;

    invoke-interface {p1}, Lm0/z;->B()V

    return p2

    :cond_2
    :try_start_0
    iget-object p1, p0, Lm0/b0;->X0:Lm0/z;

    invoke-interface {p1, p6, p10, p11, p9}, Lm0/z;->u(Ljava/nio/ByteBuffer;JI)Z

    move-result p1
    :try_end_0
    .catch Lm0/z$c; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lm0/z$f; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_4

    if-eqz p5, :cond_3

    invoke-interface {p5, p7, p3}, Lt0/m;->f(IZ)V

    :cond_3
    iget-object p1, p0, Lt0/w;->Q0:Lk0/o;

    iget p3, p1, Lk0/o;->e:I

    add-int/2addr p3, p9

    iput p3, p1, Lk0/o;->e:I

    return p2

    :cond_4
    iput-wide p10, p0, Lm0/b0;->j1:J

    return p3

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_2

    :goto_0
    iget-boolean p2, p1, Lm0/z$f;->p:Z

    invoke-virtual {p0}, Lt0/w;->Z0()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-virtual {p0}, Lk0/n;->M()Lk0/b1;

    move-result-object p3

    iget p3, p3, Lk0/b1;->a:I

    if-eqz p3, :cond_5

    const/16 p3, 0x138b

    goto :goto_1

    :cond_5
    const/16 p3, 0x138a

    :goto_1
    invoke-virtual {p0, p1, p14, p2, p3}, Lk0/n;->K(Ljava/lang/Throwable;Ld0/q;ZI)Lk0/u;

    move-result-object p1

    throw p1

    :goto_2
    iget-object p2, p0, Lm0/b0;->b1:Ld0/q;

    iget-boolean p3, p1, Lm0/z$c;->p:Z

    invoke-virtual {p0}, Lt0/w;->Z0()Z

    move-result p4

    if-eqz p4, :cond_6

    invoke-virtual {p0}, Lk0/n;->M()Lk0/b1;

    move-result-object p4

    iget p4, p4, Lk0/b1;->a:I

    if-eqz p4, :cond_6

    const/16 p4, 0x138c

    goto :goto_3

    :cond_6
    const/16 p4, 0x1389

    :goto_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lk0/n;->K(Ljava/lang/Throwable;Ld0/q;ZI)Lk0/u;

    move-result-object p1

    throw p1
.end method

.method public t(ILjava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    if-eq p1, v0, :cond_6

    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    if-eq p1, v0, :cond_5

    .line 6
    .line 7
    const/4 v0, 0x6

    .line 8
    if-eq p1, v0, :cond_4

    .line 9
    .line 10
    const/16 v0, 0xc

    .line 11
    .line 12
    if-eq p1, v0, :cond_3

    .line 13
    .line 14
    const/16 v0, 0x10

    .line 15
    .line 16
    if-eq p1, v0, :cond_2

    .line 17
    .line 18
    const/16 v0, 0x9

    .line 19
    .line 20
    if-eq p1, v0, :cond_1

    .line 21
    .line 22
    const/16 v0, 0xa

    .line 23
    .line 24
    if-eq p1, v0, :cond_0

    .line 25
    .line 26
    invoke-super {p0, p1, p2}, Lt0/w;->t(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object p1, p0, Lm0/b0;->X0:Lm0/z;

    .line 31
    .line 32
    invoke-static {p2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    check-cast p2, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    invoke-interface {p1, p2}, Lm0/z;->n(I)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget-object p1, p0, Lm0/b0;->X0:Lm0/z;

    .line 47
    .line 48
    invoke-static {p2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    check-cast p2, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    invoke-interface {p1, p2}, Lm0/z;->d(Z)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-static {p2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Ljava/lang/Integer;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    iput p1, p0, Lm0/b0;->h1:I

    .line 73
    .line 74
    invoke-virtual {p0}, Lm0/b0;->e2()V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    sget p1, Lg0/M;->a:I

    .line 79
    .line 80
    const/16 v0, 0x17

    .line 81
    .line 82
    if-lt p1, v0, :cond_7

    .line 83
    .line 84
    iget-object p1, p0, Lm0/b0;->X0:Lm0/z;

    .line 85
    .line 86
    invoke-static {p1, p2}, Lm0/b0$b;->a(Lm0/z;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    check-cast p2, Ld0/e;

    .line 91
    .line 92
    iget-object p1, p0, Lm0/b0;->X0:Lm0/z;

    .line 93
    .line 94
    invoke-static {p2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    check-cast p2, Ld0/e;

    .line 99
    .line 100
    invoke-interface {p1, p2}, Lm0/z;->m(Ld0/e;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_5
    check-cast p2, Ld0/b;

    .line 105
    .line 106
    iget-object p1, p0, Lm0/b0;->X0:Lm0/z;

    .line 107
    .line 108
    invoke-static {p2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    check-cast p2, Ld0/b;

    .line 113
    .line 114
    invoke-interface {p1, p2}, Lm0/z;->s(Ld0/b;)V

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_6
    iget-object p1, p0, Lm0/b0;->X0:Lm0/z;

    .line 119
    .line 120
    invoke-static {p2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    check-cast p2, Ljava/lang/Float;

    .line 125
    .line 126
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    invoke-interface {p1, p2}, Lm0/z;->l(F)V

    .line 131
    .line 132
    .line 133
    :cond_7
    :goto_0
    return-void
.end method

.method public x1()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lm0/b0;->X0:Lm0/z;

    .line 2
    .line 3
    invoke-interface {v0}, Lm0/z;->g()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lt0/w;->N0()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lt0/w;->N0()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    iput-wide v0, p0, Lm0/b0;->j1:J
    :try_end_0
    .catch Lm0/z$f; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catch_0
    move-exception v0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :goto_0
    return-void

    .line 29
    :goto_1
    iget-object v1, v0, Lm0/z$f;->q:Ld0/q;

    .line 30
    .line 31
    iget-boolean v2, v0, Lm0/z$f;->p:Z

    .line 32
    .line 33
    invoke-virtual {p0}, Lt0/w;->Z0()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    const/16 v3, 0x138b

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    const/16 v3, 0x138a

    .line 43
    .line 44
    :goto_2
    invoke-virtual {p0, v0, v1, v2, v3}, Lk0/n;->K(Ljava/lang/Throwable;Ld0/q;ZI)Lk0/u;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    throw v0
.end method
