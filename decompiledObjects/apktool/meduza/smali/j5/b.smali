.class public final Lj5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj5/b$c;,
        Lj5/b$a;,
        Lj5/b$g;,
        Lj5/b$f;,
        Lj5/b$e;,
        Lj5/b$d;,
        Lj5/b$b;,
        Lj5/b$h;
    }
.end annotation


# static fields
.field public static final h:[B

.field public static final i:[B

.field public static final j:[B


# instance fields
.field public final a:Landroid/graphics/Paint;

.field public final b:Landroid/graphics/Paint;

.field public final c:Landroid/graphics/Canvas;

.field public final d:Lj5/b$b;

.field public final e:Lj5/b$a;

.field public final f:Lj5/b$h;

.field public g:Landroid/graphics/Bitmap;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x4

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    sput-object v1, Lj5/b;->h:[B

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    sput-object v0, Lj5/b;->i:[B

    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    sput-object v0, Lj5/b;->j:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x7t
        0x8t
        0xft
    .end array-data

    :array_1
    .array-data 1
        0x0t
        0x77t
        -0x78t
        -0x1t
    .end array-data

    :array_2
    .array-data 1
        0x0t
        0x11t
        0x22t
        0x33t
        0x44t
        0x55t
        0x66t
        0x77t
        -0x78t
        -0x67t
        -0x56t
        -0x45t
        -0x34t
        -0x23t
        -0x12t
        -0x1t
    .end array-data
.end method

.method public constructor <init>(II)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Paint;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lj5/b;->a:Landroid/graphics/Paint;

    .line 10
    .line 11
    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    .line 17
    .line 18
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    .line 19
    .line 20
    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 28
    .line 29
    .line 30
    new-instance v0, Landroid/graphics/Paint;

    .line 31
    .line 32
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lj5/b;->b:Landroid/graphics/Paint;

    .line 36
    .line 37
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 40
    .line 41
    .line 42
    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    .line 43
    .line 44
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->DST_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 45
    .line 46
    invoke-direct {v2, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 53
    .line 54
    .line 55
    new-instance v0, Landroid/graphics/Canvas;

    .line 56
    .line 57
    invoke-direct {v0}, Landroid/graphics/Canvas;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lj5/b;->c:Landroid/graphics/Canvas;

    .line 61
    .line 62
    new-instance v0, Lj5/b$b;

    .line 63
    .line 64
    const/16 v2, 0x2cf

    .line 65
    .line 66
    const/16 v3, 0x23f

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    const/16 v5, 0x2cf

    .line 70
    .line 71
    const/4 v6, 0x0

    .line 72
    const/16 v7, 0x23f

    .line 73
    .line 74
    move-object v1, v0

    .line 75
    invoke-direct/range {v1 .. v7}, Lj5/b$b;-><init>(IIIIII)V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, Lj5/b;->d:Lj5/b$b;

    .line 79
    .line 80
    new-instance v0, Lj5/b$a;

    .line 81
    .line 82
    const/4 v1, 0x4

    .line 83
    new-array v1, v1, [I

    .line 84
    .line 85
    fill-array-data v1, :array_0

    .line 86
    .line 87
    .line 88
    invoke-static {}, Lj5/b;->a()[I

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-static {}, Lj5/b;->b()[I

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    const/4 v4, 0x0

    .line 97
    invoke-direct {v0, v4, v1, v2, v3}, Lj5/b$a;-><init>(I[I[I[I)V

    .line 98
    .line 99
    .line 100
    iput-object v0, p0, Lj5/b;->e:Lj5/b$a;

    .line 101
    .line 102
    new-instance v0, Lj5/b$h;

    .line 103
    .line 104
    invoke-direct {v0, p1, p2}, Lj5/b$h;-><init>(II)V

    .line 105
    .line 106
    .line 107
    iput-object v0, p0, Lj5/b;->f:Lj5/b$h;

    .line 108
    .line 109
    return-void

    .line 110
    nop

    .line 111
    :array_0
    .array-data 4
        0x0
        -0x1
        -0x1000000
        -0x808081
    .end array-data
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public static a()[I
    .locals 9

    const/16 v0, 0x10

    new-array v1, v0, [I

    const/4 v2, 0x0

    aput v2, v1, v2

    const/4 v3, 0x1

    :goto_0
    if-ge v3, v0, :cond_7

    const/16 v4, 0x8

    const/16 v5, 0xff

    if-ge v3, v4, :cond_3

    and-int/lit8 v4, v3, 0x1

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_1

    :cond_0
    move v4, v2

    :goto_1
    and-int/lit8 v6, v3, 0x2

    if-eqz v6, :cond_1

    move v6, v5

    goto :goto_2

    :cond_1
    move v6, v2

    :goto_2
    and-int/lit8 v7, v3, 0x4

    if-eqz v7, :cond_2

    move v7, v5

    goto :goto_3

    :cond_2
    move v7, v2

    :goto_3
    invoke-static {v5, v4, v6, v7}, Lj5/b;->c(IIII)I

    move-result v4

    aput v4, v1, v3

    goto :goto_7

    :cond_3
    and-int/lit8 v4, v3, 0x1

    const/16 v6, 0x7f

    if-eqz v4, :cond_4

    move v4, v6

    goto :goto_4

    :cond_4
    move v4, v2

    :goto_4
    and-int/lit8 v7, v3, 0x2

    if-eqz v7, :cond_5

    move v7, v6

    goto :goto_5

    :cond_5
    move v7, v2

    :goto_5
    and-int/lit8 v8, v3, 0x4

    if-eqz v8, :cond_6

    goto :goto_6

    :cond_6
    move v6, v2

    :goto_6
    invoke-static {v5, v4, v7, v6}, Lj5/b;->c(IIII)I

    move-result v4

    aput v4, v1, v3

    :goto_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_7
    return-object v1
.end method

.method public static b()[I
    .locals 11

    const/16 v0, 0x100

    new-array v1, v0, [I

    const/4 v2, 0x0

    aput v2, v1, v2

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_20

    const/16 v4, 0x8

    const/16 v5, 0xff

    if-ge v3, v4, :cond_3

    const/16 v4, 0x3f

    and-int/lit8 v6, v3, 0x1

    if-eqz v6, :cond_0

    move v6, v5

    goto :goto_1

    :cond_0
    move v6, v2

    :goto_1
    and-int/lit8 v7, v3, 0x2

    if-eqz v7, :cond_1

    move v7, v5

    goto :goto_2

    :cond_1
    move v7, v2

    :goto_2
    and-int/lit8 v8, v3, 0x4

    if-eqz v8, :cond_2

    goto :goto_3

    :cond_2
    move v5, v2

    :goto_3
    invoke-static {v4, v6, v7, v5}, Lj5/b;->c(IIII)I

    move-result v4

    aput v4, v1, v3

    goto/16 :goto_1c

    :cond_3
    and-int/lit16 v6, v3, 0x88

    const/16 v7, 0xaa

    const/16 v8, 0x55

    if-eqz v6, :cond_19

    const/16 v9, 0x7f

    if-eq v6, v4, :cond_12

    const/16 v4, 0x80

    const/16 v7, 0x2b

    if-eq v6, v4, :cond_b

    const/16 v4, 0x88

    if-eq v6, v4, :cond_4

    goto/16 :goto_1c

    :cond_4
    and-int/lit8 v4, v3, 0x1

    if-eqz v4, :cond_5

    move v4, v7

    goto :goto_4

    :cond_5
    move v4, v2

    :goto_4
    and-int/lit8 v6, v3, 0x10

    if-eqz v6, :cond_6

    move v6, v8

    goto :goto_5

    :cond_6
    move v6, v2

    :goto_5
    add-int/2addr v4, v6

    and-int/lit8 v6, v3, 0x2

    if-eqz v6, :cond_7

    move v6, v7

    goto :goto_6

    :cond_7
    move v6, v2

    :goto_6
    and-int/lit8 v9, v3, 0x20

    if-eqz v9, :cond_8

    move v9, v8

    goto :goto_7

    :cond_8
    move v9, v2

    :goto_7
    add-int/2addr v6, v9

    and-int/lit8 v9, v3, 0x4

    if-eqz v9, :cond_9

    goto :goto_8

    :cond_9
    move v7, v2

    :goto_8
    and-int/lit8 v9, v3, 0x40

    if-eqz v9, :cond_a

    goto :goto_9

    :cond_a
    move v8, v2

    :goto_9
    add-int/2addr v7, v8

    invoke-static {v5, v4, v6, v7}, Lj5/b;->c(IIII)I

    move-result v4

    aput v4, v1, v3

    goto/16 :goto_1c

    :cond_b
    and-int/lit8 v4, v3, 0x1

    if-eqz v4, :cond_c

    move v4, v7

    goto :goto_a

    :cond_c
    move v4, v2

    :goto_a
    add-int/2addr v4, v9

    and-int/lit8 v6, v3, 0x10

    if-eqz v6, :cond_d

    move v6, v8

    goto :goto_b

    :cond_d
    move v6, v2

    :goto_b
    add-int/2addr v4, v6

    and-int/lit8 v6, v3, 0x2

    if-eqz v6, :cond_e

    move v6, v7

    goto :goto_c

    :cond_e
    move v6, v2

    :goto_c
    add-int/2addr v6, v9

    and-int/lit8 v10, v3, 0x20

    if-eqz v10, :cond_f

    move v10, v8

    goto :goto_d

    :cond_f
    move v10, v2

    :goto_d
    add-int/2addr v6, v10

    and-int/lit8 v10, v3, 0x4

    if-eqz v10, :cond_10

    goto :goto_e

    :cond_10
    move v7, v2

    :goto_e
    add-int/2addr v7, v9

    and-int/lit8 v9, v3, 0x40

    if-eqz v9, :cond_11

    goto :goto_f

    :cond_11
    move v8, v2

    :goto_f
    add-int/2addr v7, v8

    invoke-static {v5, v4, v6, v7}, Lj5/b;->c(IIII)I

    move-result v4

    aput v4, v1, v3

    goto/16 :goto_1c

    :cond_12
    and-int/lit8 v4, v3, 0x1

    if-eqz v4, :cond_13

    move v4, v8

    goto :goto_10

    :cond_13
    move v4, v2

    :goto_10
    and-int/lit8 v5, v3, 0x10

    if-eqz v5, :cond_14

    move v5, v7

    goto :goto_11

    :cond_14
    move v5, v2

    :goto_11
    add-int/2addr v4, v5

    and-int/lit8 v5, v3, 0x2

    if-eqz v5, :cond_15

    move v5, v8

    goto :goto_12

    :cond_15
    move v5, v2

    :goto_12
    and-int/lit8 v6, v3, 0x20

    if-eqz v6, :cond_16

    move v6, v7

    goto :goto_13

    :cond_16
    move v6, v2

    :goto_13
    add-int/2addr v5, v6

    and-int/lit8 v6, v3, 0x4

    if-eqz v6, :cond_17

    goto :goto_14

    :cond_17
    move v8, v2

    :goto_14
    and-int/lit8 v6, v3, 0x40

    if-eqz v6, :cond_18

    goto :goto_15

    :cond_18
    move v7, v2

    :goto_15
    add-int/2addr v8, v7

    invoke-static {v9, v4, v5, v8}, Lj5/b;->c(IIII)I

    move-result v4

    aput v4, v1, v3

    goto :goto_1c

    :cond_19
    and-int/lit8 v4, v3, 0x1

    if-eqz v4, :cond_1a

    move v4, v8

    goto :goto_16

    :cond_1a
    move v4, v2

    :goto_16
    and-int/lit8 v6, v3, 0x10

    if-eqz v6, :cond_1b

    move v6, v7

    goto :goto_17

    :cond_1b
    move v6, v2

    :goto_17
    add-int/2addr v4, v6

    and-int/lit8 v6, v3, 0x2

    if-eqz v6, :cond_1c

    move v6, v8

    goto :goto_18

    :cond_1c
    move v6, v2

    :goto_18
    and-int/lit8 v9, v3, 0x20

    if-eqz v9, :cond_1d

    move v9, v7

    goto :goto_19

    :cond_1d
    move v9, v2

    :goto_19
    add-int/2addr v6, v9

    and-int/lit8 v9, v3, 0x4

    if-eqz v9, :cond_1e

    goto :goto_1a

    :cond_1e
    move v8, v2

    :goto_1a
    and-int/lit8 v9, v3, 0x40

    if-eqz v9, :cond_1f

    goto :goto_1b

    :cond_1f
    move v7, v2

    :goto_1b
    add-int/2addr v8, v7

    invoke-static {v5, v4, v6, v8}, Lj5/b;->c(IIII)I

    move-result v4

    aput v4, v1, v3

    :goto_1c
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_20
    return-object v1
.end method

.method public static c(IIII)I
    .locals 0

    shl-int/lit8 p0, p0, 0x18

    shl-int/lit8 p1, p1, 0x10

    or-int/2addr p0, p1

    shl-int/lit8 p1, p2, 0x8

    or-int/2addr p0, p1

    or-int/2addr p0, p3

    return p0
.end method

.method public static d([B[IIIILandroid/graphics/Paint;Landroid/graphics/Canvas;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v8, p5

    .line 6
    .line 7
    new-instance v9, Lv5/t;

    .line 8
    .line 9
    array-length v2, v0

    .line 10
    invoke-direct {v9, v0, v2}, Lv5/t;-><init>([BI)V

    .line 11
    .line 12
    .line 13
    move/from16 v2, p3

    .line 14
    .line 15
    move/from16 v10, p4

    .line 16
    .line 17
    const/4 v11, 0x0

    .line 18
    const/4 v12, 0x0

    .line 19
    const/4 v13, 0x0

    .line 20
    :cond_0
    :goto_0
    invoke-virtual {v9}, Lv5/t;->b()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_22

    .line 25
    .line 26
    const/16 v14, 0x8

    .line 27
    .line 28
    invoke-virtual {v9, v14}, Lv5/t;->g(I)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/16 v4, 0xf0

    .line 33
    .line 34
    if-eq v3, v4, :cond_21

    .line 35
    .line 36
    const/4 v15, 0x3

    .line 37
    const/4 v7, 0x4

    .line 38
    const/4 v6, 0x2

    .line 39
    const/4 v5, 0x1

    .line 40
    const/16 v16, 0x0

    .line 41
    .line 42
    packed-switch v3, :pswitch_data_0

    .line 43
    .line 44
    .line 45
    move v0, v7

    .line 46
    packed-switch v3, :pswitch_data_1

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_0
    move v15, v2

    .line 51
    move/from16 v2, v16

    .line 52
    .line 53
    :goto_1
    invoke-virtual {v9, v14}, Lv5/t;->g(I)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    move/from16 v17, v2

    .line 60
    .line 61
    move/from16 v18, v5

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_1
    invoke-virtual {v9}, Lv5/t;->f()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    const/4 v4, 0x7

    .line 69
    if-nez v3, :cond_3

    .line 70
    .line 71
    invoke-virtual {v9, v4}, Lv5/t;->g(I)I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_2

    .line 76
    .line 77
    move/from16 v17, v2

    .line 78
    .line 79
    move/from16 v18, v3

    .line 80
    .line 81
    move/from16 v3, v16

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    move/from16 v17, v5

    .line 85
    .line 86
    move/from16 v3, v16

    .line 87
    .line 88
    move/from16 v18, v3

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    invoke-virtual {v9, v4}, Lv5/t;->g(I)I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    invoke-virtual {v9, v14}, Lv5/t;->g(I)I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    move/from16 v17, v2

    .line 100
    .line 101
    move/from16 v18, v3

    .line 102
    .line 103
    move v3, v4

    .line 104
    :goto_2
    if-eqz v18, :cond_4

    .line 105
    .line 106
    if-eqz v8, :cond_4

    .line 107
    .line 108
    aget v2, p1, v3

    .line 109
    .line 110
    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 111
    .line 112
    .line 113
    int-to-float v3, v15

    .line 114
    int-to-float v4, v10

    .line 115
    add-int v2, v15, v18

    .line 116
    .line 117
    int-to-float v6, v2

    .line 118
    add-int/lit8 v2, v10, 0x1

    .line 119
    .line 120
    int-to-float v7, v2

    .line 121
    move-object/from16 v2, p6

    .line 122
    .line 123
    move v0, v5

    .line 124
    move v5, v6

    .line 125
    move v6, v7

    .line 126
    move-object/from16 v7, p5

    .line 127
    .line 128
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_4
    move v0, v5

    .line 133
    :goto_3
    add-int v15, v15, v18

    .line 134
    .line 135
    if-eqz v17, :cond_5

    .line 136
    .line 137
    move v2, v15

    .line 138
    goto :goto_0

    .line 139
    :cond_5
    move v5, v0

    .line 140
    move/from16 v2, v17

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :pswitch_1
    move v0, v5

    .line 144
    if-ne v1, v15, :cond_7

    .line 145
    .line 146
    if-nez v12, :cond_6

    .line 147
    .line 148
    sget-object v3, Lj5/b;->j:[B

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_6
    move-object v3, v12

    .line 152
    :goto_4
    move-object/from16 v17, v3

    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_7
    const/16 v17, 0x0

    .line 156
    .line 157
    :goto_5
    move v5, v2

    .line 158
    move/from16 v2, v16

    .line 159
    .line 160
    :goto_6
    invoke-virtual {v9, v7}, Lv5/t;->g(I)I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-eqz v3, :cond_8

    .line 165
    .line 166
    move v4, v0

    .line 167
    goto :goto_9

    .line 168
    :cond_8
    invoke-virtual {v9}, Lv5/t;->f()Z

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    if-nez v3, :cond_a

    .line 173
    .line 174
    invoke-virtual {v9, v15}, Lv5/t;->g(I)I

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-eqz v3, :cond_9

    .line 179
    .line 180
    add-int/lit8 v3, v3, 0x2

    .line 181
    .line 182
    goto :goto_a

    .line 183
    :cond_9
    move v2, v0

    .line 184
    goto :goto_7

    .line 185
    :cond_a
    invoke-virtual {v9}, Lv5/t;->f()Z

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    if-nez v3, :cond_b

    .line 190
    .line 191
    invoke-virtual {v9, v6}, Lv5/t;->g(I)I

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    add-int/2addr v3, v7

    .line 196
    goto :goto_8

    .line 197
    :cond_b
    invoke-virtual {v9, v6}, Lv5/t;->g(I)I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    if-eqz v3, :cond_f

    .line 202
    .line 203
    if-eq v3, v0, :cond_e

    .line 204
    .line 205
    if-eq v3, v6, :cond_d

    .line 206
    .line 207
    if-eq v3, v15, :cond_c

    .line 208
    .line 209
    :goto_7
    move/from16 v18, v2

    .line 210
    .line 211
    move/from16 v3, v16

    .line 212
    .line 213
    move/from16 v19, v3

    .line 214
    .line 215
    goto :goto_b

    .line 216
    :cond_c
    invoke-virtual {v9, v14}, Lv5/t;->g(I)I

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    add-int/lit8 v3, v3, 0x19

    .line 221
    .line 222
    goto :goto_8

    .line 223
    :cond_d
    invoke-virtual {v9, v7}, Lv5/t;->g(I)I

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    add-int/lit8 v3, v3, 0x9

    .line 228
    .line 229
    :goto_8
    invoke-virtual {v9, v7}, Lv5/t;->g(I)I

    .line 230
    .line 231
    .line 232
    move-result v4

    .line 233
    move/from16 v22, v4

    .line 234
    .line 235
    move v4, v3

    .line 236
    move/from16 v3, v22

    .line 237
    .line 238
    :goto_9
    move/from16 v18, v2

    .line 239
    .line 240
    move/from16 v19, v4

    .line 241
    .line 242
    goto :goto_b

    .line 243
    :cond_e
    move v3, v6

    .line 244
    goto :goto_a

    .line 245
    :cond_f
    move v3, v0

    .line 246
    :goto_a
    move/from16 v18, v2

    .line 247
    .line 248
    move/from16 v19, v3

    .line 249
    .line 250
    move/from16 v3, v16

    .line 251
    .line 252
    :goto_b
    if-eqz v19, :cond_11

    .line 253
    .line 254
    if-eqz v8, :cond_11

    .line 255
    .line 256
    if-eqz v17, :cond_10

    .line 257
    .line 258
    aget-byte v3, v17, v3

    .line 259
    .line 260
    :cond_10
    aget v2, p1, v3

    .line 261
    .line 262
    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 263
    .line 264
    .line 265
    int-to-float v3, v5

    .line 266
    int-to-float v4, v10

    .line 267
    add-int v2, v5, v19

    .line 268
    .line 269
    int-to-float v2, v2

    .line 270
    add-int/lit8 v6, v10, 0x1

    .line 271
    .line 272
    int-to-float v6, v6

    .line 273
    move/from16 v20, v2

    .line 274
    .line 275
    move-object/from16 v2, p6

    .line 276
    .line 277
    move/from16 v21, v5

    .line 278
    .line 279
    move/from16 v5, v20

    .line 280
    .line 281
    const/4 v14, 0x2

    .line 282
    move-object/from16 v7, p5

    .line 283
    .line 284
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 285
    .line 286
    .line 287
    goto :goto_c

    .line 288
    :cond_11
    move/from16 v21, v5

    .line 289
    .line 290
    move v14, v6

    .line 291
    :goto_c
    add-int v5, v21, v19

    .line 292
    .line 293
    if-eqz v18, :cond_12

    .line 294
    .line 295
    invoke-virtual {v9}, Lv5/t;->c()V

    .line 296
    .line 297
    .line 298
    move v2, v5

    .line 299
    goto/16 :goto_0

    .line 300
    .line 301
    :cond_12
    move v6, v14

    .line 302
    move/from16 v2, v18

    .line 303
    .line 304
    const/4 v7, 0x4

    .line 305
    const/16 v14, 0x8

    .line 306
    .line 307
    goto/16 :goto_6

    .line 308
    .line 309
    :pswitch_2
    move v0, v5

    .line 310
    move v14, v6

    .line 311
    if-ne v1, v15, :cond_14

    .line 312
    .line 313
    if-nez v11, :cond_13

    .line 314
    .line 315
    sget-object v3, Lj5/b;->i:[B

    .line 316
    .line 317
    goto :goto_d

    .line 318
    :cond_13
    move-object v3, v11

    .line 319
    goto :goto_d

    .line 320
    :cond_14
    if-ne v1, v14, :cond_16

    .line 321
    .line 322
    if-nez v13, :cond_15

    .line 323
    .line 324
    sget-object v3, Lj5/b;->h:[B

    .line 325
    .line 326
    goto :goto_d

    .line 327
    :cond_15
    move-object v3, v13

    .line 328
    :goto_d
    move-object/from16 v17, v3

    .line 329
    .line 330
    goto :goto_e

    .line 331
    :cond_16
    const/16 v17, 0x0

    .line 332
    .line 333
    :goto_e
    move v7, v2

    .line 334
    move/from16 v5, v16

    .line 335
    .line 336
    :goto_f
    invoke-virtual {v9, v14}, Lv5/t;->g(I)I

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    if-eqz v2, :cond_17

    .line 341
    .line 342
    move/from16 v18, v0

    .line 343
    .line 344
    move/from16 v19, v5

    .line 345
    .line 346
    const/4 v6, 0x4

    .line 347
    goto :goto_14

    .line 348
    :cond_17
    invoke-virtual {v9}, Lv5/t;->f()Z

    .line 349
    .line 350
    .line 351
    move-result v2

    .line 352
    if-eqz v2, :cond_18

    .line 353
    .line 354
    invoke-virtual {v9, v15}, Lv5/t;->g(I)I

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    add-int/2addr v2, v15

    .line 359
    :goto_10
    const/4 v6, 0x4

    .line 360
    goto :goto_11

    .line 361
    :cond_18
    invoke-virtual {v9}, Lv5/t;->f()Z

    .line 362
    .line 363
    .line 364
    move-result v2

    .line 365
    if-eqz v2, :cond_19

    .line 366
    .line 367
    move v2, v0

    .line 368
    const/4 v6, 0x4

    .line 369
    goto :goto_12

    .line 370
    :cond_19
    invoke-virtual {v9, v14}, Lv5/t;->g(I)I

    .line 371
    .line 372
    .line 373
    move-result v2

    .line 374
    if-eqz v2, :cond_1d

    .line 375
    .line 376
    if-eq v2, v0, :cond_1c

    .line 377
    .line 378
    if-eq v2, v14, :cond_1b

    .line 379
    .line 380
    if-eq v2, v15, :cond_1a

    .line 381
    .line 382
    const/4 v6, 0x4

    .line 383
    goto :goto_13

    .line 384
    :cond_1a
    const/16 v2, 0x8

    .line 385
    .line 386
    invoke-virtual {v9, v2}, Lv5/t;->g(I)I

    .line 387
    .line 388
    .line 389
    move-result v3

    .line 390
    add-int/lit8 v3, v3, 0x1d

    .line 391
    .line 392
    move v2, v3

    .line 393
    goto :goto_10

    .line 394
    :cond_1b
    const/4 v6, 0x4

    .line 395
    invoke-virtual {v9, v6}, Lv5/t;->g(I)I

    .line 396
    .line 397
    .line 398
    move-result v2

    .line 399
    add-int/lit8 v2, v2, 0xc

    .line 400
    .line 401
    :goto_11
    invoke-virtual {v9, v14}, Lv5/t;->g(I)I

    .line 402
    .line 403
    .line 404
    move-result v3

    .line 405
    move/from16 v18, v2

    .line 406
    .line 407
    move v2, v3

    .line 408
    move/from16 v19, v5

    .line 409
    .line 410
    goto :goto_14

    .line 411
    :cond_1c
    const/4 v6, 0x4

    .line 412
    move v2, v14

    .line 413
    :goto_12
    move/from16 v18, v2

    .line 414
    .line 415
    move/from16 v19, v5

    .line 416
    .line 417
    move/from16 v2, v16

    .line 418
    .line 419
    goto :goto_14

    .line 420
    :cond_1d
    const/4 v6, 0x4

    .line 421
    move v5, v0

    .line 422
    :goto_13
    move/from16 v19, v5

    .line 423
    .line 424
    move/from16 v2, v16

    .line 425
    .line 426
    move/from16 v18, v2

    .line 427
    .line 428
    :goto_14
    if-eqz v18, :cond_1f

    .line 429
    .line 430
    if-eqz v8, :cond_1f

    .line 431
    .line 432
    if-eqz v17, :cond_1e

    .line 433
    .line 434
    aget-byte v2, v17, v2

    .line 435
    .line 436
    :cond_1e
    aget v2, p1, v2

    .line 437
    .line 438
    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 439
    .line 440
    .line 441
    int-to-float v3, v7

    .line 442
    int-to-float v4, v10

    .line 443
    add-int v2, v7, v18

    .line 444
    .line 445
    int-to-float v5, v2

    .line 446
    add-int/lit8 v2, v10, 0x1

    .line 447
    .line 448
    int-to-float v2, v2

    .line 449
    move/from16 v21, v2

    .line 450
    .line 451
    move-object/from16 v2, p6

    .line 452
    .line 453
    move v0, v6

    .line 454
    move/from16 v6, v21

    .line 455
    .line 456
    move/from16 v21, v7

    .line 457
    .line 458
    move-object/from16 v7, p5

    .line 459
    .line 460
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 461
    .line 462
    .line 463
    goto :goto_15

    .line 464
    :cond_1f
    move v0, v6

    .line 465
    move/from16 v21, v7

    .line 466
    .line 467
    :goto_15
    add-int v7, v21, v18

    .line 468
    .line 469
    if-eqz v19, :cond_20

    .line 470
    .line 471
    invoke-virtual {v9}, Lv5/t;->c()V

    .line 472
    .line 473
    .line 474
    move v2, v7

    .line 475
    goto/16 :goto_0

    .line 476
    .line 477
    :cond_20
    move/from16 v5, v19

    .line 478
    .line 479
    const/4 v0, 0x1

    .line 480
    goto/16 :goto_f

    .line 481
    .line 482
    :pswitch_3
    const/16 v0, 0x10

    .line 483
    .line 484
    new-array v12, v0, [B

    .line 485
    .line 486
    move/from16 v3, v16

    .line 487
    .line 488
    :goto_16
    if-ge v3, v0, :cond_0

    .line 489
    .line 490
    const/16 v4, 0x8

    .line 491
    .line 492
    invoke-virtual {v9, v4}, Lv5/t;->g(I)I

    .line 493
    .line 494
    .line 495
    move-result v5

    .line 496
    int-to-byte v4, v5

    .line 497
    aput-byte v4, v12, v3

    .line 498
    .line 499
    add-int/lit8 v3, v3, 0x1

    .line 500
    .line 501
    goto :goto_16

    .line 502
    :pswitch_4
    new-array v11, v0, [B

    .line 503
    .line 504
    move/from16 v3, v16

    .line 505
    .line 506
    :goto_17
    if-ge v3, v0, :cond_0

    .line 507
    .line 508
    const/16 v4, 0x8

    .line 509
    .line 510
    invoke-virtual {v9, v4}, Lv5/t;->g(I)I

    .line 511
    .line 512
    .line 513
    move-result v5

    .line 514
    int-to-byte v5, v5

    .line 515
    aput-byte v5, v11, v3

    .line 516
    .line 517
    add-int/lit8 v3, v3, 0x1

    .line 518
    .line 519
    goto :goto_17

    .line 520
    :pswitch_5
    new-array v13, v0, [B

    .line 521
    .line 522
    move/from16 v3, v16

    .line 523
    .line 524
    :goto_18
    if-ge v3, v0, :cond_0

    .line 525
    .line 526
    invoke-virtual {v9, v0}, Lv5/t;->g(I)I

    .line 527
    .line 528
    .line 529
    move-result v4

    .line 530
    int-to-byte v4, v4

    .line 531
    aput-byte v4, v13, v3

    .line 532
    .line 533
    add-int/lit8 v3, v3, 0x1

    .line 534
    .line 535
    goto :goto_18

    .line 536
    :cond_21
    add-int/lit8 v10, v10, 0x2

    .line 537
    .line 538
    move/from16 v2, p3

    .line 539
    .line 540
    goto/16 :goto_0

    .line 541
    .line 542
    :cond_22
    return-void

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x20
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method public static e(Lv5/t;I)Lj5/b$a;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lv5/t;->g(I)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {v0, v1}, Lv5/t;->m(I)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v3, p1, -0x2

    .line 13
    .line 14
    const/4 v4, 0x4

    .line 15
    new-array v5, v4, [I

    .line 16
    .line 17
    fill-array-data v5, :array_0

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lj5/b;->a()[I

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    invoke-static {}, Lj5/b;->b()[I

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    :goto_0
    const/4 v8, 0x2

    .line 29
    if-lez v3, :cond_4

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lv5/t;->g(I)I

    .line 32
    .line 33
    .line 34
    move-result v9

    .line 35
    invoke-virtual {v0, v1}, Lv5/t;->g(I)I

    .line 36
    .line 37
    .line 38
    move-result v10

    .line 39
    add-int/lit8 v3, v3, -0x2

    .line 40
    .line 41
    and-int/lit16 v11, v10, 0x80

    .line 42
    .line 43
    if-eqz v11, :cond_0

    .line 44
    .line 45
    move-object v11, v5

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    and-int/lit8 v11, v10, 0x40

    .line 48
    .line 49
    if-eqz v11, :cond_1

    .line 50
    .line 51
    move-object v11, v6

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move-object v11, v7

    .line 54
    :goto_1
    and-int/lit8 v10, v10, 0x1

    .line 55
    .line 56
    if-eqz v10, :cond_2

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lv5/t;->g(I)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    invoke-virtual {v0, v1}, Lv5/t;->g(I)I

    .line 63
    .line 64
    .line 65
    move-result v10

    .line 66
    invoke-virtual {v0, v1}, Lv5/t;->g(I)I

    .line 67
    .line 68
    .line 69
    move-result v12

    .line 70
    invoke-virtual {v0, v1}, Lv5/t;->g(I)I

    .line 71
    .line 72
    .line 73
    move-result v13

    .line 74
    add-int/lit8 v3, v3, -0x4

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    const/4 v10, 0x6

    .line 78
    invoke-virtual {v0, v10}, Lv5/t;->g(I)I

    .line 79
    .line 80
    .line 81
    move-result v12

    .line 82
    shl-int/2addr v12, v8

    .line 83
    invoke-virtual {v0, v4}, Lv5/t;->g(I)I

    .line 84
    .line 85
    .line 86
    move-result v13

    .line 87
    shl-int/2addr v13, v4

    .line 88
    invoke-virtual {v0, v4}, Lv5/t;->g(I)I

    .line 89
    .line 90
    .line 91
    move-result v14

    .line 92
    shl-int/2addr v14, v4

    .line 93
    invoke-virtual {v0, v8}, Lv5/t;->g(I)I

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    shl-int/2addr v8, v10

    .line 98
    add-int/lit8 v3, v3, -0x2

    .line 99
    .line 100
    move v10, v13

    .line 101
    move v13, v8

    .line 102
    move v8, v12

    .line 103
    move v12, v14

    .line 104
    :goto_2
    const/16 v15, 0xff

    .line 105
    .line 106
    if-nez v8, :cond_3

    .line 107
    .line 108
    move v13, v15

    .line 109
    const/4 v10, 0x0

    .line 110
    const/4 v12, 0x0

    .line 111
    :cond_3
    and-int/2addr v13, v15

    .line 112
    rsub-int v13, v13, 0xff

    .line 113
    .line 114
    int-to-byte v13, v13

    .line 115
    move/from16 v16, v2

    .line 116
    .line 117
    int-to-double v1, v8

    .line 118
    const-wide v17, 0x3ff66e978d4fdf3bL    # 1.402

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    add-int/lit8 v10, v10, -0x80

    .line 124
    .line 125
    move-object v8, v5

    .line 126
    int-to-double v4, v10

    .line 127
    mul-double v17, v17, v4

    .line 128
    .line 129
    add-double v14, v17, v1

    .line 130
    .line 131
    double-to-int v14, v14

    .line 132
    const-wide v17, 0x3fd60663c74fb54aL    # 0.34414

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    add-int/lit8 v12, v12, -0x80

    .line 138
    .line 139
    move-object v15, v11

    .line 140
    int-to-double v10, v12

    .line 141
    mul-double v17, v17, v10

    .line 142
    .line 143
    sub-double v17, v1, v17

    .line 144
    .line 145
    const-wide v19, 0x3fe6da3c21187e7cL    # 0.71414

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    mul-double v4, v4, v19

    .line 151
    .line 152
    sub-double v4, v17, v4

    .line 153
    .line 154
    double-to-int v4, v4

    .line 155
    const-wide v17, 0x3ffc5a1cac083127L    # 1.772

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    mul-double v10, v10, v17

    .line 161
    .line 162
    add-double/2addr v10, v1

    .line 163
    double-to-int v1, v10

    .line 164
    const/4 v2, 0x0

    .line 165
    const/16 v5, 0xff

    .line 166
    .line 167
    invoke-static {v14, v2, v5}, Lv5/e0;->i(III)I

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    invoke-static {v4, v2, v5}, Lv5/e0;->i(III)I

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    invoke-static {v1, v2, v5}, Lv5/e0;->i(III)I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    invoke-static {v13, v10, v4, v1}, Lj5/b;->c(IIII)I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    aput v1, v15, v9

    .line 184
    .line 185
    move-object v5, v8

    .line 186
    move/from16 v2, v16

    .line 187
    .line 188
    const/16 v1, 0x8

    .line 189
    .line 190
    const/4 v4, 0x4

    .line 191
    goto/16 :goto_0

    .line 192
    .line 193
    :cond_4
    move/from16 v16, v2

    .line 194
    .line 195
    move-object v8, v5

    .line 196
    new-instance v0, Lj5/b$a;

    .line 197
    .line 198
    move/from16 v1, v16

    .line 199
    .line 200
    invoke-direct {v0, v1, v8, v6, v7}, Lj5/b$a;-><init>(I[I[I[I)V

    .line 201
    .line 202
    .line 203
    return-object v0

    .line 204
    nop

    .line 205
    :array_0
    .array-data 4
        0x0
        -0x1
        -0x1000000
        -0x808081
    .end array-data
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
.end method

.method public static f(Lv5/t;)Lj5/b$c;
    .locals 6

    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lv5/t;->g(I)I

    move-result v1

    const/4 v2, 0x4

    invoke-virtual {p0, v2}, Lv5/t;->m(I)V

    const/4 v2, 0x2

    invoke-virtual {p0, v2}, Lv5/t;->g(I)I

    move-result v2

    invoke-virtual {p0}, Lv5/t;->f()Z

    move-result v3

    const/4 v4, 0x1

    invoke-virtual {p0, v4}, Lv5/t;->m(I)V

    sget-object v5, Lv5/e0;->f:[B

    if-ne v2, v4, :cond_0

    const/16 v2, 0x8

    invoke-virtual {p0, v2}, Lv5/t;->g(I)I

    move-result v2

    mul-int/2addr v2, v0

    invoke-virtual {p0, v2}, Lv5/t;->m(I)V

    goto :goto_0

    :cond_0
    if-nez v2, :cond_2

    invoke-virtual {p0, v0}, Lv5/t;->g(I)I

    move-result v2

    invoke-virtual {p0, v0}, Lv5/t;->g(I)I

    move-result v0

    if-lez v2, :cond_1

    new-array v5, v2, [B

    invoke-virtual {p0, v5, v2}, Lv5/t;->i([BI)V

    :cond_1
    if-lez v0, :cond_2

    new-array v2, v0, [B

    invoke-virtual {p0, v2, v0}, Lv5/t;->i([BI)V

    goto :goto_1

    :cond_2
    :goto_0
    move-object v2, v5

    :goto_1
    new-instance p0, Lj5/b$c;

    invoke-direct {p0, v1, v3, v5, v2}, Lj5/b$c;-><init>(IZ[B[B)V

    return-object p0
.end method
