.class public Lq3/e$c;
.super Lq3/e$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final j:[B

.field public static final k:[B


# instance fields
.field public final c:[B

.field public d:I

.field public e:I

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lq3/e$c;->j:[B

    .line 9
    .line 10
    const/16 v0, 0x40

    .line 11
    .line 12
    new-array v0, v0, [B

    .line 13
    .line 14
    fill-array-data v0, :array_1

    .line 15
    .line 16
    .line 17
    sput-object v0, Lq3/e$c;->k:[B

    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :array_0
    .array-data 1
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
        0x47t
        0x48t
        0x49t
        0x4at
        0x4bt
        0x4ct
        0x4dt
        0x4et
        0x4ft
        0x50t
        0x51t
        0x52t
        0x53t
        0x54t
        0x55t
        0x56t
        0x57t
        0x58t
        0x59t
        0x5at
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
        0x67t
        0x68t
        0x69t
        0x6at
        0x6bt
        0x6ct
        0x6dt
        0x6et
        0x6ft
        0x70t
        0x71t
        0x72t
        0x73t
        0x74t
        0x75t
        0x76t
        0x77t
        0x78t
        0x79t
        0x7at
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x2bt
        0x2ft
    .end array-data

    .line 22
    .line 23
    .line 24
    .line 25
    :array_1
    .array-data 1
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
        0x47t
        0x48t
        0x49t
        0x4at
        0x4bt
        0x4ct
        0x4dt
        0x4et
        0x4ft
        0x50t
        0x51t
        0x52t
        0x53t
        0x54t
        0x55t
        0x56t
        0x57t
        0x58t
        0x59t
        0x5at
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
        0x67t
        0x68t
        0x69t
        0x6at
        0x6bt
        0x6ct
        0x6dt
        0x6et
        0x6ft
        0x70t
        0x71t
        0x72t
        0x73t
        0x74t
        0x75t
        0x76t
        0x77t
        0x78t
        0x79t
        0x7at
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x2dt
        0x5ft
    .end array-data
.end method

.method public constructor <init>(I[B)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lq3/e$a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lq3/e$a;->a:[B

    .line 5
    .line 6
    and-int/lit8 p2, p1, 0x1

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    move p2, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move p2, v0

    .line 15
    :goto_0
    iput-boolean p2, p0, Lq3/e$c;->f:Z

    .line 16
    .line 17
    and-int/lit8 p2, p1, 0x2

    .line 18
    .line 19
    if-nez p2, :cond_1

    .line 20
    .line 21
    move p2, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move p2, v0

    .line 24
    :goto_1
    iput-boolean p2, p0, Lq3/e$c;->g:Z

    .line 25
    .line 26
    and-int/lit8 v2, p1, 0x4

    .line 27
    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_2
    move v1, v0

    .line 32
    :goto_2
    iput-boolean v1, p0, Lq3/e$c;->h:Z

    .line 33
    .line 34
    and-int/lit8 p1, p1, 0x8

    .line 35
    .line 36
    if-nez p1, :cond_3

    .line 37
    .line 38
    sget-object p1, Lq3/e$c;->j:[B

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_3
    sget-object p1, Lq3/e$c;->k:[B

    .line 42
    .line 43
    :goto_3
    iput-object p1, p0, Lq3/e$c;->i:[B

    .line 44
    .line 45
    const/4 p1, 0x2

    .line 46
    new-array p1, p1, [B

    .line 47
    .line 48
    iput-object p1, p0, Lq3/e$c;->c:[B

    .line 49
    .line 50
    iput v0, p0, Lq3/e$c;->d:I

    .line 51
    .line 52
    if-eqz p2, :cond_4

    .line 53
    .line 54
    const/16 p1, 0x13

    .line 55
    .line 56
    goto :goto_4

    .line 57
    :cond_4
    const/4 p1, -0x1

    .line 58
    :goto_4
    iput p1, p0, Lq3/e$c;->e:I

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public a([BIIZ)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    iget-object v1, v0, Lq3/e$c;->i:[B

    iget-object v2, v0, Lq3/e$a;->a:[B

    iget v3, v0, Lq3/e$c;->e:I

    add-int v4, p3, p2

    iget v5, v0, Lq3/e$c;->d:I

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, -0x1

    if-eq v5, v7, :cond_1

    if-eq v5, v6, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v5, p2, 0x1

    if-gt v5, v4, :cond_2

    iget-object v10, v0, Lq3/e$c;->c:[B

    aget-byte v11, v10, v8

    and-int/lit16 v11, v11, 0xff

    shl-int/lit8 v11, v11, 0x10

    aget-byte v10, v10, v7

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x8

    or-int/2addr v10, v11

    aget-byte v11, p1, p2

    and-int/lit16 v11, v11, 0xff

    or-int/2addr v10, v11

    iput v8, v0, Lq3/e$c;->d:I

    move v11, v5

    goto :goto_1

    :cond_1
    add-int/lit8 v5, p2, 0x2

    if-gt v5, v4, :cond_2

    iget-object v5, v0, Lq3/e$c;->c:[B

    aget-byte v5, v5, v8

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x10

    add-int/lit8 v10, p2, 0x1

    aget-byte v11, p1, p2

    and-int/lit16 v11, v11, 0xff

    shl-int/lit8 v11, v11, 0x8

    or-int/2addr v5, v11

    add-int/lit8 v11, p2, 0x2

    aget-byte v10, p1, v10

    and-int/lit16 v10, v10, 0xff

    or-int/2addr v10, v5

    iput v8, v0, Lq3/e$c;->d:I

    goto :goto_1

    :cond_2
    :goto_0
    move/from16 v11, p2

    move v10, v9

    :goto_1
    const/16 v12, 0xd

    const/4 v13, 0x4

    const/16 v14, 0xa

    if-eq v10, v9, :cond_5

    shr-int/lit8 v9, v10, 0x12

    and-int/lit8 v9, v9, 0x3f

    aget-byte v9, v1, v9

    aput-byte v9, v2, v8

    shr-int/lit8 v9, v10, 0xc

    and-int/lit8 v9, v9, 0x3f

    aget-byte v9, v1, v9

    aput-byte v9, v2, v7

    shr-int/lit8 v9, v10, 0x6

    and-int/lit8 v9, v9, 0x3f

    aget-byte v9, v1, v9

    aput-byte v9, v2, v6

    and-int/lit8 v9, v10, 0x3f

    aget-byte v9, v1, v9

    const/4 v10, 0x3

    aput-byte v9, v2, v10

    add-int/lit8 v3, v3, -0x1

    if-nez v3, :cond_4

    iget-boolean v3, v0, Lq3/e$c;->h:Z

    if-eqz v3, :cond_3

    aput-byte v12, v2, v13

    const/4 v3, 0x5

    goto :goto_2

    :cond_3
    move v3, v13

    :goto_2
    add-int/lit8 v9, v3, 0x1

    aput-byte v14, v2, v3

    :goto_3
    const/16 v3, 0x13

    goto :goto_4

    :cond_4
    move v9, v13

    goto :goto_4

    :cond_5
    move v9, v8

    :goto_4
    add-int/lit8 v10, v11, 0x3

    if-gt v10, v4, :cond_8

    aget-byte v15, p1, v11

    and-int/lit16 v15, v15, 0xff

    shl-int/lit8 v15, v15, 0x10

    add-int/lit8 v16, v11, 0x1

    aget-byte v5, p1, v16

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x8

    or-int/2addr v5, v15

    add-int/lit8 v11, v11, 0x2

    aget-byte v11, p1, v11

    and-int/lit16 v11, v11, 0xff

    or-int/2addr v5, v11

    shr-int/lit8 v11, v5, 0x12

    and-int/lit8 v11, v11, 0x3f

    aget-byte v11, v1, v11

    aput-byte v11, v2, v9

    add-int/lit8 v11, v9, 0x1

    shr-int/lit8 v15, v5, 0xc

    and-int/lit8 v15, v15, 0x3f

    aget-byte v15, v1, v15

    aput-byte v15, v2, v11

    add-int/lit8 v11, v9, 0x2

    shr-int/lit8 v15, v5, 0x6

    and-int/lit8 v15, v15, 0x3f

    aget-byte v15, v1, v15

    aput-byte v15, v2, v11

    add-int/lit8 v11, v9, 0x3

    and-int/lit8 v5, v5, 0x3f

    aget-byte v5, v1, v5

    aput-byte v5, v2, v11

    add-int/lit8 v5, v9, 0x4

    add-int/lit8 v3, v3, -0x1

    if-nez v3, :cond_7

    iget-boolean v3, v0, Lq3/e$c;->h:Z

    if-eqz v3, :cond_6

    add-int/lit8 v9, v9, 0x5

    aput-byte v12, v2, v5

    move v5, v9

    :cond_6
    add-int/lit8 v9, v5, 0x1

    aput-byte v14, v2, v5

    move v11, v10

    goto :goto_3

    :cond_7
    move v9, v5

    move v11, v10

    goto :goto_4

    :cond_8
    if-eqz p4, :cond_15

    iget v5, v0, Lq3/e$c;->d:I

    sub-int v10, v11, v5

    add-int/lit8 v15, v4, -0x1

    const/16 v16, 0x3d

    if-ne v10, v15, :cond_d

    if-lez v5, :cond_9

    iget-object v4, v0, Lq3/e$c;->c:[B

    aget-byte v4, v4, v8

    move v8, v7

    goto :goto_5

    :cond_9
    aget-byte v4, p1, v11

    :goto_5
    and-int/lit16 v4, v4, 0xff

    shl-int/2addr v4, v13

    sub-int/2addr v5, v8

    iput v5, v0, Lq3/e$c;->d:I

    add-int/lit8 v5, v9, 0x1

    shr-int/lit8 v6, v4, 0x6

    and-int/lit8 v6, v6, 0x3f

    aget-byte v6, v1, v6

    aput-byte v6, v2, v9

    add-int/lit8 v6, v9, 0x2

    and-int/lit8 v4, v4, 0x3f

    aget-byte v1, v1, v4

    aput-byte v1, v2, v5

    iget-boolean v1, v0, Lq3/e$c;->f:Z

    if-eqz v1, :cond_a

    add-int/lit8 v1, v9, 0x3

    aput-byte v16, v2, v6

    add-int/lit8 v6, v9, 0x4

    aput-byte v16, v2, v1

    :cond_a
    iget-boolean v1, v0, Lq3/e$c;->g:Z

    if-eqz v1, :cond_c

    iget-boolean v1, v0, Lq3/e$c;->h:Z

    if-eqz v1, :cond_b

    add-int/lit8 v1, v6, 0x1

    aput-byte v12, v2, v6

    move v6, v1

    :cond_b
    add-int/lit8 v1, v6, 0x1

    aput-byte v14, v2, v6

    :goto_6
    move v9, v1

    goto/16 :goto_9

    :cond_c
    move v9, v6

    goto/16 :goto_9

    :cond_d
    sub-int v10, v11, v5

    sub-int/2addr v4, v6

    if-ne v10, v4, :cond_13

    if-le v5, v7, :cond_e

    iget-object v4, v0, Lq3/e$c;->c:[B

    aget-byte v4, v4, v8

    move v8, v7

    goto :goto_7

    :cond_e
    add-int/lit8 v4, v11, 0x1

    aget-byte v10, p1, v11

    move v11, v4

    move v4, v10

    :goto_7
    and-int/lit16 v4, v4, 0xff

    shl-int/2addr v4, v14

    if-lez v5, :cond_f

    iget-object v10, v0, Lq3/e$c;->c:[B

    add-int/lit8 v11, v8, 0x1

    aget-byte v8, v10, v8

    goto :goto_8

    :cond_f
    aget-byte v10, p1, v11

    move v11, v8

    move v8, v10

    :goto_8
    and-int/lit16 v8, v8, 0xff

    shl-int/lit8 v6, v8, 0x2

    or-int/2addr v4, v6

    sub-int/2addr v5, v11

    iput v5, v0, Lq3/e$c;->d:I

    add-int/lit8 v5, v9, 0x1

    shr-int/lit8 v6, v4, 0xc

    and-int/lit8 v6, v6, 0x3f

    aget-byte v6, v1, v6

    aput-byte v6, v2, v9

    add-int/lit8 v6, v9, 0x2

    shr-int/lit8 v8, v4, 0x6

    and-int/lit8 v8, v8, 0x3f

    aget-byte v8, v1, v8

    aput-byte v8, v2, v5

    add-int/lit8 v5, v9, 0x3

    and-int/lit8 v4, v4, 0x3f

    aget-byte v1, v1, v4

    aput-byte v1, v2, v6

    iget-boolean v1, v0, Lq3/e$c;->f:Z

    if-eqz v1, :cond_10

    add-int/lit8 v9, v9, 0x4

    aput-byte v16, v2, v5

    move v5, v9

    :cond_10
    iget-boolean v1, v0, Lq3/e$c;->g:Z

    if-eqz v1, :cond_12

    iget-boolean v1, v0, Lq3/e$c;->h:Z

    if-eqz v1, :cond_11

    add-int/lit8 v1, v5, 0x1

    aput-byte v12, v2, v5

    move v5, v1

    :cond_11
    add-int/lit8 v1, v5, 0x1

    aput-byte v14, v2, v5

    goto :goto_6

    :cond_12
    move v9, v5

    goto :goto_9

    :cond_13
    iget-boolean v1, v0, Lq3/e$c;->g:Z

    if-eqz v1, :cond_17

    if-lez v9, :cond_17

    const/16 v1, 0x13

    if-eq v3, v1, :cond_17

    iget-boolean v1, v0, Lq3/e$c;->h:Z

    if-eqz v1, :cond_14

    add-int/lit8 v1, v9, 0x1

    aput-byte v12, v2, v9

    move v9, v1

    :cond_14
    add-int/lit8 v1, v9, 0x1

    aput-byte v14, v2, v9

    goto/16 :goto_6

    :cond_15
    add-int/lit8 v1, v4, -0x1

    if-ne v11, v1, :cond_16

    iget-object v1, v0, Lq3/e$c;->c:[B

    iget v2, v0, Lq3/e$c;->d:I

    add-int/lit8 v4, v2, 0x1

    iput v4, v0, Lq3/e$c;->d:I

    aget-byte v4, p1, v11

    aput-byte v4, v1, v2

    goto :goto_9

    :cond_16
    sub-int/2addr v4, v6

    if-ne v11, v4, :cond_17

    iget-object v1, v0, Lq3/e$c;->c:[B

    iget v2, v0, Lq3/e$c;->d:I

    add-int/lit8 v4, v2, 0x1

    aget-byte v5, p1, v11

    aput-byte v5, v1, v2

    add-int/2addr v2, v6

    iput v2, v0, Lq3/e$c;->d:I

    add-int/2addr v11, v7

    aget-byte v2, p1, v11

    aput-byte v2, v1, v4

    :cond_17
    :goto_9
    iput v9, v0, Lq3/e$a;->b:I

    iput v3, v0, Lq3/e$c;->e:I

    return v7
.end method
