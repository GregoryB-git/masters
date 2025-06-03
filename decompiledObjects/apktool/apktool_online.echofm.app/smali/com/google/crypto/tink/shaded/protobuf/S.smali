.class public final Lcom/google/crypto/tink/shaded/protobuf/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/e0;


# static fields
.field public static final r:[I

.field public static final s:Lsun/misc/Unsafe;


# instance fields
.field public final a:[I

.field public final b:[Ljava/lang/Object;

.field public final c:I

.field public final d:I

.field public final e:Lcom/google/crypto/tink/shaded/protobuf/O;

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:[I

.field public final k:I

.field public final l:I

.field public final m:Lcom/google/crypto/tink/shaded/protobuf/U;

.field public final n:Lcom/google/crypto/tink/shaded/protobuf/E;

.field public final o:Lcom/google/crypto/tink/shaded/protobuf/k0;

.field public final p:Lcom/google/crypto/tink/shaded/protobuf/q;

.field public final q:Lcom/google/crypto/tink/shaded/protobuf/J;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/S;->r:[I

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o0;->D()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/S;->s:Lsun/misc/Unsafe;

    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;IILcom/google/crypto/tink/shaded/protobuf/O;ZZ[IIILcom/google/crypto/tink/shaded/protobuf/U;Lcom/google/crypto/tink/shaded/protobuf/E;Lcom/google/crypto/tink/shaded/protobuf/k0;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/J;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    iput-object p2, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->b:[Ljava/lang/Object;

    iput p3, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->c:I

    iput p4, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->d:I

    instance-of p1, p5, Lcom/google/crypto/tink/shaded/protobuf/x;

    iput-boolean p1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->g:Z

    iput-boolean p6, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->h:Z

    if-eqz p14, :cond_0

    invoke-virtual {p14, p5}, Lcom/google/crypto/tink/shaded/protobuf/q;->e(Lcom/google/crypto/tink/shaded/protobuf/O;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->f:Z

    iput-boolean p7, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    iput-object p8, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->j:[I

    iput p9, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->k:I

    iput p10, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->l:I

    iput-object p11, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->m:Lcom/google/crypto/tink/shaded/protobuf/U;

    iput-object p12, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    iput-object p13, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->o:Lcom/google/crypto/tink/shaded/protobuf/k0;

    iput-object p14, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->p:Lcom/google/crypto/tink/shaded/protobuf/q;

    iput-object p5, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->e:Lcom/google/crypto/tink/shaded/protobuf/O;

    iput-object p15, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->q:Lcom/google/crypto/tink/shaded/protobuf/J;

    return-void
.end method

.method public static A(I)Z
    .locals 1

    .line 1
    const/high16 v0, 0x20000000

    and-int/2addr p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static D(Ljava/lang/Object;ILcom/google/crypto/tink/shaded/protobuf/e0;)Z
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v0

    invoke-static {p0, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, Lcom/google/crypto/tink/shaded/protobuf/e0;->c(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static G(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    instance-of v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/x;->D()Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static J(I)Z
    .locals 1

    .line 1
    const/high16 v0, 0x10000000

    and-int/2addr p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static K(Ljava/lang/Object;J)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static L(Ljava/lang/Object;J)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->A(Ljava/lang/Object;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static T(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/M;Lcom/google/crypto/tink/shaded/protobuf/U;Lcom/google/crypto/tink/shaded/protobuf/E;Lcom/google/crypto/tink/shaded/protobuf/k0;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/J;)Lcom/google/crypto/tink/shaded/protobuf/S;
    .locals 6

    .line 1
    instance-of p0, p1, Lcom/google/crypto/tink/shaded/protobuf/c0;

    if-eqz p0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/c0;

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-static/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->V(Lcom/google/crypto/tink/shaded/protobuf/c0;Lcom/google/crypto/tink/shaded/protobuf/U;Lcom/google/crypto/tink/shaded/protobuf/E;Lcom/google/crypto/tink/shaded/protobuf/k0;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/J;)Lcom/google/crypto/tink/shaded/protobuf/S;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p1}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    const/4 v0, 0x0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-static/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->U(Lcom/google/crypto/tink/shaded/protobuf/h0;Lcom/google/crypto/tink/shaded/protobuf/U;Lcom/google/crypto/tink/shaded/protobuf/E;Lcom/google/crypto/tink/shaded/protobuf/k0;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/J;)Lcom/google/crypto/tink/shaded/protobuf/S;

    move-result-object p0

    return-object p0
.end method

.method public static U(Lcom/google/crypto/tink/shaded/protobuf/h0;Lcom/google/crypto/tink/shaded/protobuf/U;Lcom/google/crypto/tink/shaded/protobuf/E;Lcom/google/crypto/tink/shaded/protobuf/k0;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/J;)Lcom/google/crypto/tink/shaded/protobuf/S;
    .locals 0

    .line 1
    const/4 p0, 0x0

    throw p0
.end method

.method public static V(Lcom/google/crypto/tink/shaded/protobuf/c0;Lcom/google/crypto/tink/shaded/protobuf/U;Lcom/google/crypto/tink/shaded/protobuf/E;Lcom/google/crypto/tink/shaded/protobuf/k0;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/J;)Lcom/google/crypto/tink/shaded/protobuf/S;
    .locals 33

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/google/crypto/tink/shaded/protobuf/c0;->b()Lcom/google/crypto/tink/shaded/protobuf/Z;

    move-result-object v0

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/Z;->p:Lcom/google/crypto/tink/shaded/protobuf/Z;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v10, 0x1

    goto :goto_0

    :cond_0
    move v10, v2

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/crypto/tink/shaded/protobuf/c0;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const v5, 0xd800

    if-lt v4, v5, :cond_1

    const/4 v4, 0x1

    :goto_1
    add-int/lit8 v6, v4, 0x1

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_2

    move v4, v6

    goto :goto_1

    :cond_1
    const/4 v6, 0x1

    :cond_2
    add-int/lit8 v4, v6, 0x1

    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_4

    and-int/lit16 v6, v6, 0x1fff

    const/16 v8, 0xd

    :goto_2
    add-int/lit8 v9, v4, 0x1

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_3

    and-int/lit16 v4, v4, 0x1fff

    shl-int/2addr v4, v8

    or-int/2addr v6, v4

    add-int/lit8 v8, v8, 0xd

    move v4, v9

    goto :goto_2

    :cond_3
    shl-int/2addr v4, v8

    or-int/2addr v6, v4

    move v4, v9

    :cond_4
    if-nez v6, :cond_5

    sget-object v6, Lcom/google/crypto/tink/shaded/protobuf/S;->r:[I

    move v8, v2

    move v9, v8

    move v11, v9

    move v12, v11

    move v14, v12

    move/from16 v16, v14

    move-object v13, v6

    move/from16 v6, v16

    goto/16 :goto_b

    :cond_5
    add-int/lit8 v6, v4, 0x1

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_7

    and-int/lit16 v4, v4, 0x1fff

    const/16 v8, 0xd

    :goto_3
    add-int/lit8 v9, v6, 0x1

    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_6

    and-int/lit16 v6, v6, 0x1fff

    shl-int/2addr v6, v8

    or-int/2addr v4, v6

    add-int/lit8 v8, v8, 0xd

    move v6, v9

    goto :goto_3

    :cond_6
    shl-int/2addr v6, v8

    or-int/2addr v4, v6

    move v6, v9

    :cond_7
    add-int/lit8 v8, v6, 0x1

    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_9

    and-int/lit16 v6, v6, 0x1fff

    const/16 v9, 0xd

    :goto_4
    add-int/lit8 v11, v8, 0x1

    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v5, :cond_8

    and-int/lit16 v8, v8, 0x1fff

    shl-int/2addr v8, v9

    or-int/2addr v6, v8

    add-int/lit8 v9, v9, 0xd

    move v8, v11

    goto :goto_4

    :cond_8
    shl-int/2addr v8, v9

    or-int/2addr v6, v8

    move v8, v11

    :cond_9
    add-int/lit8 v9, v8, 0x1

    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v5, :cond_b

    and-int/lit16 v8, v8, 0x1fff

    const/16 v11, 0xd

    :goto_5
    add-int/lit8 v12, v9, 0x1

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v5, :cond_a

    and-int/lit16 v9, v9, 0x1fff

    shl-int/2addr v9, v11

    or-int/2addr v8, v9

    add-int/lit8 v11, v11, 0xd

    move v9, v12

    goto :goto_5

    :cond_a
    shl-int/2addr v9, v11

    or-int/2addr v8, v9

    move v9, v12

    :cond_b
    add-int/lit8 v11, v9, 0x1

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v5, :cond_d

    and-int/lit16 v9, v9, 0x1fff

    const/16 v12, 0xd

    :goto_6
    add-int/lit8 v13, v11, 0x1

    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v5, :cond_c

    and-int/lit16 v11, v11, 0x1fff

    shl-int/2addr v11, v12

    or-int/2addr v9, v11

    add-int/lit8 v12, v12, 0xd

    move v11, v13

    goto :goto_6

    :cond_c
    shl-int/2addr v11, v12

    or-int/2addr v9, v11

    move v11, v13

    :cond_d
    add-int/lit8 v12, v11, 0x1

    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v5, :cond_f

    and-int/lit16 v11, v11, 0x1fff

    const/16 v13, 0xd

    :goto_7
    add-int/lit8 v14, v12, 0x1

    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v5, :cond_e

    and-int/lit16 v12, v12, 0x1fff

    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    add-int/lit8 v13, v13, 0xd

    move v12, v14

    goto :goto_7

    :cond_e
    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    move v12, v14

    :cond_f
    add-int/lit8 v13, v12, 0x1

    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v5, :cond_11

    and-int/lit16 v12, v12, 0x1fff

    const/16 v14, 0xd

    :goto_8
    add-int/lit8 v15, v13, 0x1

    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v5, :cond_10

    and-int/lit16 v13, v13, 0x1fff

    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    add-int/lit8 v14, v14, 0xd

    move v13, v15

    goto :goto_8

    :cond_10
    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    move v13, v15

    :cond_11
    add-int/lit8 v14, v13, 0x1

    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v5, :cond_13

    and-int/lit16 v13, v13, 0x1fff

    const/16 v15, 0xd

    :goto_9
    add-int/lit8 v16, v14, 0x1

    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v5, :cond_12

    and-int/lit16 v14, v14, 0x1fff

    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    add-int/lit8 v15, v15, 0xd

    move/from16 v14, v16

    goto :goto_9

    :cond_12
    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    move/from16 v14, v16

    :cond_13
    add-int/lit8 v15, v14, 0x1

    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v5, :cond_15

    and-int/lit16 v14, v14, 0x1fff

    const/16 v16, 0xd

    :goto_a
    add-int/lit8 v17, v15, 0x1

    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v5, :cond_14

    and-int/lit16 v15, v15, 0x1fff

    shl-int v15, v15, v16

    or-int/2addr v14, v15

    add-int/lit8 v16, v16, 0xd

    move/from16 v15, v17

    goto :goto_a

    :cond_14
    shl-int v15, v15, v16

    or-int/2addr v14, v15

    move/from16 v15, v17

    :cond_15
    add-int v16, v14, v12

    add-int v13, v16, v13

    new-array v13, v13, [I

    mul-int/lit8 v16, v4, 0x2

    add-int v16, v16, v6

    move v6, v4

    move v4, v15

    :goto_b
    sget-object v15, Lcom/google/crypto/tink/shaded/protobuf/S;->s:Lsun/misc/Unsafe;

    invoke-virtual/range {p0 .. p0}, Lcom/google/crypto/tink/shaded/protobuf/c0;->d()[Ljava/lang/Object;

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, Lcom/google/crypto/tink/shaded/protobuf/c0;->c()Lcom/google/crypto/tink/shaded/protobuf/O;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    mul-int/lit8 v7, v11, 0x3

    new-array v7, v7, [I

    mul-int/lit8 v11, v11, 0x2

    new-array v11, v11, [Ljava/lang/Object;

    add-int v20, v14, v12

    move/from16 v22, v14

    move/from16 v23, v20

    const/4 v12, 0x0

    const/16 v21, 0x0

    :goto_c
    if-ge v4, v1, :cond_32

    add-int/lit8 v24, v4, 0x1

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_17

    and-int/lit16 v4, v4, 0x1fff

    move/from16 v3, v24

    const/16 v24, 0xd

    :goto_d
    add-int/lit8 v26, v3, 0x1

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-lt v3, v5, :cond_16

    and-int/lit16 v3, v3, 0x1fff

    shl-int v3, v3, v24

    or-int/2addr v4, v3

    add-int/lit8 v24, v24, 0xd

    move/from16 v3, v26

    goto :goto_d

    :cond_16
    shl-int v3, v3, v24

    or-int/2addr v4, v3

    move/from16 v3, v26

    goto :goto_e

    :cond_17
    move/from16 v3, v24

    :goto_e
    add-int/lit8 v24, v3, 0x1

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-lt v3, v5, :cond_19

    and-int/lit16 v3, v3, 0x1fff

    move/from16 v5, v24

    const/16 v24, 0xd

    :goto_f
    add-int/lit8 v27, v5, 0x1

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    move/from16 v28, v1

    const v1, 0xd800

    if-lt v5, v1, :cond_18

    and-int/lit16 v1, v5, 0x1fff

    shl-int v1, v1, v24

    or-int/2addr v3, v1

    add-int/lit8 v24, v24, 0xd

    move/from16 v5, v27

    move/from16 v1, v28

    goto :goto_f

    :cond_18
    shl-int v1, v5, v24

    or-int/2addr v3, v1

    move/from16 v1, v27

    goto :goto_10

    :cond_19
    move/from16 v28, v1

    move/from16 v1, v24

    :goto_10
    and-int/lit16 v5, v3, 0xff

    move/from16 v24, v14

    and-int/lit16 v14, v3, 0x400

    if-eqz v14, :cond_1a

    add-int/lit8 v14, v12, 0x1

    aput v21, v13, v12

    move v12, v14

    :cond_1a
    const/16 v14, 0x33

    move/from16 v30, v12

    if-lt v5, v14, :cond_22

    add-int/lit8 v14, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const v12, 0xd800

    if-lt v1, v12, :cond_1c

    and-int/lit16 v1, v1, 0x1fff

    const/16 v31, 0xd

    :goto_11
    add-int/lit8 v32, v14, 0x1

    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v12, :cond_1b

    and-int/lit16 v12, v14, 0x1fff

    shl-int v12, v12, v31

    or-int/2addr v1, v12

    add-int/lit8 v31, v31, 0xd

    move/from16 v14, v32

    const v12, 0xd800

    goto :goto_11

    :cond_1b
    shl-int v12, v14, v31

    or-int/2addr v1, v12

    move/from16 v14, v32

    :cond_1c
    add-int/lit8 v12, v5, -0x33

    move/from16 v31, v14

    const/16 v14, 0x9

    if-eq v12, v14, :cond_1e

    const/16 v14, 0x11

    if-ne v12, v14, :cond_1d

    goto :goto_13

    :cond_1d
    const/16 v14, 0xc

    if-ne v12, v14, :cond_1f

    if-nez v10, :cond_1f

    div-int/lit8 v12, v21, 0x3

    mul-int/lit8 v12, v12, 0x2

    const/4 v14, 0x1

    add-int/2addr v12, v14

    add-int/lit8 v14, v16, 0x1

    aget-object v16, v17, v16

    aput-object v16, v11, v12

    :goto_12
    move/from16 v16, v14

    goto :goto_14

    :cond_1e
    :goto_13
    div-int/lit8 v12, v21, 0x3

    mul-int/lit8 v12, v12, 0x2

    const/4 v14, 0x1

    add-int/2addr v12, v14

    add-int/lit8 v14, v16, 0x1

    aget-object v16, v17, v16

    aput-object v16, v11, v12

    goto :goto_12

    :cond_1f
    :goto_14
    mul-int/lit8 v1, v1, 0x2

    aget-object v12, v17, v1

    instance-of v14, v12, Ljava/lang/reflect/Field;

    if-eqz v14, :cond_20

    check-cast v12, Ljava/lang/reflect/Field;

    :goto_15
    move v14, v8

    move/from16 v32, v9

    goto :goto_16

    :cond_20
    check-cast v12, Ljava/lang/String;

    invoke-static {v2, v12}, Lcom/google/crypto/tink/shaded/protobuf/S;->p0(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v12

    aput-object v12, v17, v1

    goto :goto_15

    :goto_16
    invoke-virtual {v15, v12}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v8

    long-to-int v8, v8

    add-int/lit8 v1, v1, 0x1

    aget-object v9, v17, v1

    instance-of v12, v9, Ljava/lang/reflect/Field;

    if-eqz v12, :cond_21

    check-cast v9, Ljava/lang/reflect/Field;

    :goto_17
    move v1, v8

    goto :goto_18

    :cond_21
    check-cast v9, Ljava/lang/String;

    invoke-static {v2, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->p0(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v9

    aput-object v9, v17, v1

    goto :goto_17

    :goto_18
    invoke-virtual {v15, v9}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v8

    long-to-int v8, v8

    move-object/from16 v29, v0

    move v9, v8

    move v0, v10

    move/from16 v27, v31

    const/16 v25, 0x1

    move v8, v1

    const/4 v1, 0x0

    goto/16 :goto_24

    :cond_22
    move v14, v8

    move/from16 v32, v9

    add-int/lit8 v8, v16, 0x1

    aget-object v9, v17, v16

    check-cast v9, Ljava/lang/String;

    invoke-static {v2, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->p0(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v9

    const/16 v12, 0x9

    if-eq v5, v12, :cond_23

    const/16 v12, 0x11

    if-ne v5, v12, :cond_24

    :cond_23
    const/16 v25, 0x1

    goto/16 :goto_1d

    :cond_24
    const/16 v12, 0x1b

    if-eq v5, v12, :cond_25

    const/16 v12, 0x31

    if-ne v5, v12, :cond_26

    :cond_25
    const/16 v25, 0x1

    goto :goto_1c

    :cond_26
    const/16 v12, 0xc

    if-eq v5, v12, :cond_2a

    const/16 v12, 0x1e

    if-eq v5, v12, :cond_2a

    const/16 v12, 0x2c

    if-ne v5, v12, :cond_27

    goto :goto_1a

    :cond_27
    const/16 v12, 0x32

    if-ne v5, v12, :cond_28

    add-int/lit8 v12, v22, 0x1

    aput v21, v13, v22

    div-int/lit8 v22, v21, 0x3

    mul-int/lit8 v22, v22, 0x2

    add-int/lit8 v27, v16, 0x2

    aget-object v8, v17, v8

    aput-object v8, v11, v22

    and-int/lit16 v8, v3, 0x800

    if-eqz v8, :cond_29

    add-int/lit8 v22, v22, 0x1

    add-int/lit8 v8, v16, 0x3

    aget-object v16, v17, v27

    aput-object v16, v11, v22

    move/from16 v22, v12

    :cond_28
    const/16 v25, 0x1

    :goto_19
    move v12, v8

    goto :goto_1e

    :cond_29
    move/from16 v22, v12

    move/from16 v12, v27

    const/16 v25, 0x1

    goto :goto_1e

    :cond_2a
    :goto_1a
    if-nez v10, :cond_28

    div-int/lit8 v12, v21, 0x3

    mul-int/lit8 v12, v12, 0x2

    const/16 v25, 0x1

    add-int/lit8 v12, v12, 0x1

    add-int/lit8 v16, v16, 0x2

    aget-object v8, v17, v8

    aput-object v8, v11, v12

    :goto_1b
    move/from16 v12, v16

    goto :goto_1e

    :goto_1c
    div-int/lit8 v12, v21, 0x3

    mul-int/lit8 v12, v12, 0x2

    add-int/lit8 v12, v12, 0x1

    add-int/lit8 v16, v16, 0x2

    aget-object v8, v17, v8

    aput-object v8, v11, v12

    goto :goto_1b

    :goto_1d
    div-int/lit8 v12, v21, 0x3

    mul-int/lit8 v12, v12, 0x2

    add-int/lit8 v12, v12, 0x1

    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v16

    aput-object v16, v11, v12

    goto :goto_19

    :goto_1e
    invoke-virtual {v15, v9}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v8

    long-to-int v8, v8

    and-int/lit16 v9, v3, 0x1000

    move/from16 v16, v12

    const/16 v12, 0x1000

    if-ne v9, v12, :cond_2e

    const/16 v9, 0x11

    if-gt v5, v9, :cond_2e

    add-int/lit8 v9, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const v12, 0xd800

    if-lt v1, v12, :cond_2c

    and-int/lit16 v1, v1, 0x1fff

    const/16 v26, 0xd

    :goto_1f
    add-int/lit8 v27, v9, 0x1

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v12, :cond_2b

    and-int/lit16 v9, v9, 0x1fff

    shl-int v9, v9, v26

    or-int/2addr v1, v9

    add-int/lit8 v26, v26, 0xd

    move/from16 v9, v27

    goto :goto_1f

    :cond_2b
    shl-int v9, v9, v26

    or-int/2addr v1, v9

    goto :goto_20

    :cond_2c
    move/from16 v27, v9

    :goto_20
    mul-int/lit8 v9, v6, 0x2

    div-int/lit8 v26, v1, 0x20

    add-int v9, v9, v26

    aget-object v12, v17, v9

    move-object/from16 v29, v0

    instance-of v0, v12, Ljava/lang/reflect/Field;

    if-eqz v0, :cond_2d

    check-cast v12, Ljava/lang/reflect/Field;

    :goto_21
    move v0, v10

    goto :goto_22

    :cond_2d
    check-cast v12, Ljava/lang/String;

    invoke-static {v2, v12}, Lcom/google/crypto/tink/shaded/protobuf/S;->p0(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v12

    aput-object v12, v17, v9

    goto :goto_21

    :goto_22
    invoke-virtual {v15, v12}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v9

    long-to-int v9, v9

    rem-int/lit8 v1, v1, 0x20

    goto :goto_23

    :cond_2e
    move-object/from16 v29, v0

    move v0, v10

    const v9, 0xfffff

    move/from16 v27, v1

    const/4 v1, 0x0

    :goto_23
    const/16 v10, 0x12

    if-lt v5, v10, :cond_2f

    const/16 v10, 0x31

    if-gt v5, v10, :cond_2f

    add-int/lit8 v10, v23, 0x1

    aput v8, v13, v23

    move/from16 v23, v10

    :cond_2f
    :goto_24
    add-int/lit8 v10, v21, 0x1

    aput v4, v7, v21

    add-int/lit8 v4, v21, 0x2

    and-int/lit16 v12, v3, 0x200

    if-eqz v12, :cond_30

    const/high16 v12, 0x20000000

    goto :goto_25

    :cond_30
    const/4 v12, 0x0

    :goto_25
    and-int/lit16 v3, v3, 0x100

    if-eqz v3, :cond_31

    const/high16 v3, 0x10000000

    goto :goto_26

    :cond_31
    const/4 v3, 0x0

    :goto_26
    or-int/2addr v3, v12

    shl-int/lit8 v5, v5, 0x14

    or-int/2addr v3, v5

    or-int/2addr v3, v8

    aput v3, v7, v10

    add-int/lit8 v21, v21, 0x3

    shl-int/lit8 v1, v1, 0x14

    or-int/2addr v1, v9

    aput v1, v7, v4

    move v10, v0

    move v8, v14

    move/from16 v14, v24

    move/from16 v4, v27

    move/from16 v1, v28

    move-object/from16 v0, v29

    move/from16 v12, v30

    move/from16 v9, v32

    const v5, 0xd800

    goto/16 :goto_c

    :cond_32
    move/from16 v32, v9

    move v0, v10

    move/from16 v24, v14

    move v14, v8

    new-instance v1, Lcom/google/crypto/tink/shaded/protobuf/S;

    invoke-virtual/range {p0 .. p0}, Lcom/google/crypto/tink/shaded/protobuf/c0;->c()Lcom/google/crypto/tink/shaded/protobuf/O;

    move-result-object v9

    const/4 v2, 0x0

    move-object v4, v1

    move-object v5, v7

    move-object v6, v11

    move v7, v14

    move/from16 v8, v32

    move v11, v2

    move-object v12, v13

    move/from16 v13, v24

    move/from16 v14, v20

    move-object/from16 v15, p1

    move-object/from16 v16, p2

    move-object/from16 v17, p3

    move-object/from16 v18, p4

    move-object/from16 v19, p5

    invoke-direct/range {v4 .. v19}, Lcom/google/crypto/tink/shaded/protobuf/S;-><init>([I[Ljava/lang/Object;IILcom/google/crypto/tink/shaded/protobuf/O;ZZ[IIILcom/google/crypto/tink/shaded/protobuf/U;Lcom/google/crypto/tink/shaded/protobuf/E;Lcom/google/crypto/tink/shaded/protobuf/k0;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/J;)V

    return-object v1
.end method

.method public static X(I)J
    .locals 2

    .line 1
    const v0, 0xfffff

    and-int/2addr p0, v0

    int-to-long v0, p0

    return-wide v0
.end method

.method public static Y(Ljava/lang/Object;J)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static Z(Ljava/lang/Object;J)D
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Double;

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    return-wide p0
.end method

.method public static a0(Ljava/lang/Object;J)F
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    return p0
.end method

.method public static b0(Ljava/lang/Object;J)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static c0(Ljava/lang/Object;J)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method public static l(Ljava/lang/Object;J)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->r(Ljava/lang/Object;J)Z

    move-result p0

    return p0
.end method

.method public static m(Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/S;->G(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Mutating immutable message: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static o(Ljava/lang/Object;J)D
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->x(Ljava/lang/Object;J)D

    move-result-wide p0

    return-wide p0
.end method

.method public static p0(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Field "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " not found. Known fields are "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static r(Ljava/lang/Object;J)F
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->y(Ljava/lang/Object;J)F

    move-result p0

    return p0
.end method

.method public static v(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/l0;
    .locals 2

    .line 1
    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/x;

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/l0;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/l0;->c()Lcom/google/crypto/tink/shaded/protobuf/l0;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/l0;->k()Lcom/google/crypto/tink/shaded/protobuf/l0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/l0;

    :cond_0
    return-object v0
.end method

.method public static v0(I)I
    .locals 1

    .line 1
    const/high16 v0, 0xff00000

    and-int/2addr p0, v0

    ushr-int/lit8 p0, p0, 0x14

    return p0
.end method

.method public static z(Ljava/lang/Object;J)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final A0(Lcom/google/crypto/tink/shaded/protobuf/r0;ILjava/lang/Object;I)V
    .locals 1

    .line 1
    if-eqz p3, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->q:Lcom/google/crypto/tink/shaded/protobuf/J;

    invoke-virtual {p0, p4}, Lcom/google/crypto/tink/shaded/protobuf/S;->t(I)Ljava/lang/Object;

    move-result-object p4

    invoke-interface {v0, p4}, Lcom/google/crypto/tink/shaded/protobuf/J;->d(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/H$a;

    iget-object p4, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->q:Lcom/google/crypto/tink/shaded/protobuf/J;

    invoke-interface {p4, p3}, Lcom/google/crypto/tink/shaded/protobuf/J;->e(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p3

    const/4 p4, 0x0

    invoke-interface {p1, p2, p4, p3}, Lcom/google/crypto/tink/shaded/protobuf/r0;->N(ILcom/google/crypto/tink/shaded/protobuf/H$a;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public final B(Ljava/lang/Object;I)Z
    .locals 6

    .line 1
    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->k0(I)I

    move-result v0

    const v1, 0xfffff

    and-int/2addr v1, v0

    int-to-long v1, v1

    const-wide/32 v3, 0xfffff

    cmp-long v3, v1, v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v3, :cond_11

    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->w0(I)I

    move-result p2

    invoke-static {p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v0

    invoke-static {p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->v0(I)I

    move-result p2

    const-wide/16 v2, 0x0

    packed-switch p2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    move v4, v5

    :cond_0
    return v4

    :pswitch_1
    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->A(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_1

    move v4, v5

    :cond_1
    return v4

    :pswitch_2
    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_2

    move v4, v5

    :cond_2
    return v4

    :pswitch_3
    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->A(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    move v4, v5

    :cond_3
    return v4

    :pswitch_4
    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_4

    move v4, v5

    :cond_4
    return v4

    :pswitch_5
    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_5

    move v4, v5

    :cond_5
    return v4

    :pswitch_6
    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_6

    move v4, v5

    :cond_6
    return v4

    :pswitch_7
    sget-object p2, Lcom/google/crypto/tink/shaded/protobuf/h;->p:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v5

    return p1

    :pswitch_8
    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_7

    move v4, v5

    :cond_7
    return v4

    :pswitch_9
    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_8

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v5

    return p1

    :cond_8
    instance-of p2, p1, Lcom/google/crypto/tink/shaded/protobuf/h;

    if-eqz p2, :cond_9

    sget-object p2, Lcom/google/crypto/tink/shaded/protobuf/h;->p:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v5

    return p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_a
    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->r(Ljava/lang/Object;J)Z

    move-result p1

    return p1

    :pswitch_b
    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_a

    move v4, v5

    :cond_a
    return v4

    :pswitch_c
    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->A(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_b

    move v4, v5

    :cond_b
    return v4

    :pswitch_d
    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_c

    move v4, v5

    :cond_c
    return v4

    :pswitch_e
    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->A(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_d

    move v4, v5

    :cond_d
    return v4

    :pswitch_f
    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->A(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_e

    move v4, v5

    :cond_e
    return v4

    :pswitch_10
    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->y(Ljava/lang/Object;J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    if-eqz p1, :cond_f

    move v4, v5

    :cond_f
    return v4

    :pswitch_11
    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->x(Ljava/lang/Object;J)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_10

    move v4, v5

    :cond_10
    return v4

    :cond_11
    ushr-int/lit8 p2, v0, 0x14

    shl-int p2, v5, p2

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p1

    and-int/2addr p1, p2

    if-eqz p1, :cond_12

    move v4, v5

    :cond_12
    return v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final B0(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 1

    .line 1
    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p2, Ljava/lang/String;

    invoke-interface {p3, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/r0;->A(ILjava/lang/String;)V

    goto :goto_0

    :cond_0
    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-interface {p3, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/r0;->M(ILcom/google/crypto/tink/shaded/protobuf/h;)V

    :goto_0
    return-void
.end method

.method public final C(Ljava/lang/Object;IIII)Z
    .locals 1

    .line 1
    const v0, 0xfffff

    if-ne p3, v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result p1

    return p1

    :cond_0
    and-int p1, p4, p5

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final C0(Lcom/google/crypto/tink/shaded/protobuf/k0;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/k0;->t(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    return-void
.end method

.method public final E(Ljava/lang/Object;II)Z
    .locals 3

    .line 1
    invoke-static {p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object p2

    const/4 p3, 0x0

    move v1, p3

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/e0;->c(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    return p3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public final F(Ljava/lang/Object;II)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->q:Lcom/google/crypto/tink/shaded/protobuf/J;

    invoke-static {p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/J;->e(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->t(I)Ljava/lang/Object;

    move-result-object p1

    iget-object p2, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->q:Lcom/google/crypto/tink/shaded/protobuf/J;

    invoke-interface {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/J;->d(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/H$a;

    const/4 p1, 0x0

    throw p1
.end method

.method public final H(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 2

    .line 1
    invoke-virtual {p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->k0(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p1

    invoke-static {p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final I(Ljava/lang/Object;II)Z
    .locals 2

    .line 1
    invoke-virtual {p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->k0(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final M(Lcom/google/crypto/tink/shaded/protobuf/k0;Lcom/google/crypto/tink/shaded/protobuf/q;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/d0;Lcom/google/crypto/tink/shaded/protobuf/p;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    move-object v9, v0

    :cond_0
    :goto_0
    :try_start_0
    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->p()I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/google/crypto/tink/shaded/protobuf/S;->i0(I)I

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gez v5, :cond_b

    const v1, 0x7fffffff

    if-ne v2, v1, :cond_3

    iget p2, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->k:I

    move-object v3, v9

    :goto_1
    iget p4, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->l:I

    if-ge p2, p4, :cond_1

    iget-object p4, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->j:[I

    aget v2, p4, p2

    move-object v0, p0

    move-object v1, p3

    move-object v4, p1

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->q(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/k0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_1
    if-eqz v3, :cond_2

    invoke-virtual {p1, p3, v3}, Lcom/google/crypto/tink/shaded/protobuf/k0;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-void

    :cond_3
    :try_start_1
    iget-boolean v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->f:Z

    if-nez v1, :cond_4

    move-object v4, v0

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->e:Lcom/google/crypto/tink/shaded/protobuf/O;

    invoke-virtual {p2, p5, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/q;->b(Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/O;I)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    :goto_2
    if-eqz v4, :cond_5

    invoke-virtual {p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/q;->d(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v6

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v5, p5

    move-object v7, v9

    move-object v8, p1

    invoke-virtual/range {v1 .. v8}, Lcom/google/crypto/tink/shaded/protobuf/q;->g(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/d0;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/t;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/k0;)Ljava/lang/Object;

    move-result-object v9

    goto :goto_0

    :catchall_0
    move-exception p2

    goto/16 :goto_19

    :cond_5
    invoke-virtual {p1, p4}, Lcom/google/crypto/tink/shaded/protobuf/k0;->q(Lcom/google/crypto/tink/shaded/protobuf/d0;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->y()Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_0

    :cond_6
    if-nez v9, :cond_7

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    :cond_7
    invoke-virtual {p1, v9, p4}, Lcom/google/crypto/tink/shaded/protobuf/k0;->m(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/d0;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_8

    goto :goto_0

    :cond_8
    iget p2, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->k:I

    move-object v3, v9

    :goto_3
    iget p4, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->l:I

    if-ge p2, p4, :cond_9

    iget-object p4, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->j:[I

    aget v2, p4, p2

    move-object v0, p0

    move-object v1, p3

    move-object v4, p1

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->q(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/k0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 p2, p2, 0x1

    goto :goto_3

    :cond_9
    if-eqz v3, :cond_a

    invoke-virtual {p1, p3, v3}, Lcom/google/crypto/tink/shaded/protobuf/k0;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_a
    return-void

    :cond_b
    :try_start_2
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->w0(I)I

    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->v0(I)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    if-nez v9, :cond_c

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    :cond_c
    invoke-virtual {p1, v9, p4}, Lcom/google/crypto/tink/shaded/protobuf/k0;->m(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/d0;)Z

    move-result v1
    :try_end_3
    .catch Lcom/google/crypto/tink/shaded/protobuf/A$a; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v1, :cond_0

    iget p2, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->k:I

    move-object v3, v9

    :goto_4
    iget p4, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->l:I

    if-ge p2, p4, :cond_d

    iget-object p4, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->j:[I

    aget v2, p4, p2

    move-object v0, p0

    move-object v1, p3

    move-object v4, p1

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->q(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/k0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 p2, p2, 0x1

    goto :goto_4

    :cond_d
    if-eqz v3, :cond_e

    invoke-virtual {p1, p3, v3}, Lcom/google/crypto/tink/shaded/protobuf/k0;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_e
    return-void

    :pswitch_0
    :try_start_4
    invoke-virtual {p0, p3, v2, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->S(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/O;

    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v3

    invoke-interface {p4, v1, v3, p5}, Lcom/google/crypto/tink/shaded/protobuf/d0;->L(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/p;)V

    :goto_5
    invoke-virtual {p0, p3, v2, v5, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->u0(Ljava/lang/Object;IILjava/lang/Object;)V

    goto/16 :goto_0

    :pswitch_1
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v3

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->j()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {p3, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_6
    invoke-virtual {p0, p3, v2, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->r0(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_2
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v3

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->h()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p3, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    :pswitch_3
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v3

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->r()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {p3, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    :pswitch_4
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v3

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->z()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p3, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    :pswitch_5
    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->b()I

    move-result v1

    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->s(I)Lcom/google/crypto/tink/shaded/protobuf/z$c;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p3, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    :pswitch_6
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v3

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->w()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p3, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    :pswitch_7
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v3

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->u()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-static {p3, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    :pswitch_8
    invoke-virtual {p0, p3, v2, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->S(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/O;

    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v3

    invoke-interface {p4, v1, v3, p5}, Lcom/google/crypto/tink/shaded/protobuf/d0;->J(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/p;)V

    goto/16 :goto_5

    :pswitch_9
    invoke-virtual {p0, p3, v3, p4}, Lcom/google/crypto/tink/shaded/protobuf/S;->n0(Ljava/lang/Object;ILcom/google/crypto/tink/shaded/protobuf/d0;)V

    goto :goto_6

    :pswitch_a
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v3

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->o()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {p3, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_b
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v3

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->n()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p3, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_c
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v3

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->f()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {p3, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_d
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v3

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->x()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p3, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_e
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v3

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->c()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {p3, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_f
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v3

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->E()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {p3, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_10
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v3

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->readFloat()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {p3, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_11
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v3

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->readDouble()D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-static {p3, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_12
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->t(I)Ljava/lang/Object;

    move-result-object v6

    move-object v3, p0

    move-object v4, p3

    move-object v7, p5

    move-object v8, p4

    invoke-virtual/range {v3 .. v8}, Lcom/google/crypto/tink/shaded/protobuf/S;->N(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/d0;)V

    goto/16 :goto_0

    :pswitch_13
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v3

    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v6

    move-object v1, p0

    move-object v2, p3

    move-object v5, p4

    move-object v7, p5

    invoke-virtual/range {v1 .. v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->l0(Ljava/lang/Object;JLcom/google/crypto/tink/shaded/protobuf/d0;Lcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/p;)V

    goto/16 :goto_0

    :pswitch_14
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_7
    invoke-interface {p4, v1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->i(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_15
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_8
    invoke-interface {p4, v1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->a(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_16
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_9
    invoke-interface {p4, v1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->D(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_17
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_a
    invoke-interface {p4, v1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->g(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_18
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v3

    invoke-virtual {v1, p3, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v3

    invoke-interface {p4, v3}, Lcom/google/crypto/tink/shaded/protobuf/d0;->I(Ljava/util/List;)V

    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->s(I)Lcom/google/crypto/tink/shaded/protobuf/z$c;

    :goto_b
    const/4 v4, 0x0

    move-object v1, p3

    move-object v5, v9

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/g0;->z(Ljava/lang/Object;ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/z$c;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/k0;)Ljava/lang/Object;

    move-result-object v9

    goto/16 :goto_0

    :pswitch_19
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_c
    invoke-interface {p4, v1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->k(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1a
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_d
    invoke-interface {p4, v1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->l(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1b
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_e
    invoke-interface {p4, v1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->d(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1c
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_f
    invoke-interface {p4, v1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->G(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1d
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_10
    invoke-interface {p4, v1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->H(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1e
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_11
    invoke-interface {p4, v1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->s(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1f
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_12
    invoke-interface {p4, v1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->C(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_20
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_13
    invoke-interface {p4, v1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->v(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_21
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_14
    invoke-interface {p4, v1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->B(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_22
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_7

    :pswitch_23
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_8

    :pswitch_24
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_9

    :pswitch_25
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_a

    :pswitch_26
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v3

    invoke-virtual {v1, p3, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v3

    invoke-interface {p4, v3}, Lcom/google/crypto/tink/shaded/protobuf/d0;->I(Ljava/util/List;)V

    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->s(I)Lcom/google/crypto/tink/shaded/protobuf/z$c;

    goto/16 :goto_b

    :pswitch_27
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_c

    :pswitch_28
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {p4, v1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->A(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_29
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v5

    move-object v1, p0

    move-object v2, p3

    move-object v4, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->m0(Ljava/lang/Object;ILcom/google/crypto/tink/shaded/protobuf/d0;Lcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/p;)V

    goto/16 :goto_0

    :pswitch_2a
    invoke-virtual {p0, p3, v3, p4}, Lcom/google/crypto/tink/shaded/protobuf/S;->o0(Ljava/lang/Object;ILcom/google/crypto/tink/shaded/protobuf/d0;)V

    goto/16 :goto_0

    :pswitch_2b
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_d

    :pswitch_2c
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_e

    :pswitch_2d
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_f

    :pswitch_2e
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_10

    :pswitch_2f
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_11

    :pswitch_30
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_12

    :pswitch_31
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_13

    :pswitch_32
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_14

    :pswitch_33
    invoke-virtual {p0, p3, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->R(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/O;

    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v2

    invoke-interface {p4, v1, v2, p5}, Lcom/google/crypto/tink/shaded/protobuf/d0;->L(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/p;)V

    :goto_15
    invoke-virtual {p0, p3, v5, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->t0(Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_0

    :pswitch_34
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->j()J

    move-result-wide v3

    invoke-static {p3, v1, v2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/o0;->Q(Ljava/lang/Object;JJ)V

    :goto_16
    invoke-virtual {p0, p3, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->q0(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_35
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->h()I

    move-result v3

    invoke-static {p3, v1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/o0;->P(Ljava/lang/Object;JI)V

    goto :goto_16

    :pswitch_36
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->r()J

    move-result-wide v3

    invoke-static {p3, v1, v2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/o0;->Q(Ljava/lang/Object;JJ)V

    goto :goto_16

    :pswitch_37
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->z()I

    move-result v3

    invoke-static {p3, v1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/o0;->P(Ljava/lang/Object;JI)V

    goto :goto_16

    :pswitch_38
    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->b()I

    move-result v1

    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->s(I)Lcom/google/crypto/tink/shaded/protobuf/z$c;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v2

    invoke-static {p3, v2, v3, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->P(Ljava/lang/Object;JI)V

    goto :goto_16

    :pswitch_39
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->w()I

    move-result v3

    invoke-static {p3, v1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/o0;->P(Ljava/lang/Object;JI)V

    goto :goto_16

    :pswitch_3a
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->u()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v3

    invoke-static {p3, v1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/o0;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_16

    :pswitch_3b
    invoke-virtual {p0, p3, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->R(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/O;

    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v2

    invoke-interface {p4, v1, v2, p5}, Lcom/google/crypto/tink/shaded/protobuf/d0;->J(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/p;)V

    goto :goto_15

    :pswitch_3c
    invoke-virtual {p0, p3, v3, p4}, Lcom/google/crypto/tink/shaded/protobuf/S;->n0(Ljava/lang/Object;ILcom/google/crypto/tink/shaded/protobuf/d0;)V

    goto :goto_16

    :pswitch_3d
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->o()Z

    move-result v3

    invoke-static {p3, v1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/o0;->H(Ljava/lang/Object;JZ)V

    goto :goto_16

    :pswitch_3e
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->n()I

    move-result v3

    invoke-static {p3, v1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/o0;->P(Ljava/lang/Object;JI)V

    goto :goto_16

    :pswitch_3f
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->f()J

    move-result-wide v3

    invoke-static {p3, v1, v2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/o0;->Q(Ljava/lang/Object;JJ)V

    goto/16 :goto_16

    :pswitch_40
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->x()I

    move-result v3

    invoke-static {p3, v1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/o0;->P(Ljava/lang/Object;JI)V

    goto/16 :goto_16

    :pswitch_41
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->c()J

    move-result-wide v3

    invoke-static {p3, v1, v2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/o0;->Q(Ljava/lang/Object;JJ)V

    goto/16 :goto_16

    :pswitch_42
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->E()J

    move-result-wide v3

    invoke-static {p3, v1, v2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/o0;->Q(Ljava/lang/Object;JJ)V

    goto/16 :goto_16

    :pswitch_43
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->readFloat()F

    move-result v3

    invoke-static {p3, v1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/o0;->O(Ljava/lang/Object;JF)V

    goto/16 :goto_16

    :pswitch_44
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->readDouble()D

    move-result-wide v3

    invoke-static {p3, v1, v2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/o0;->N(Ljava/lang/Object;JD)V
    :try_end_4
    .catch Lcom/google/crypto/tink/shaded/protobuf/A$a; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_16

    :catch_0
    :try_start_5
    invoke-virtual {p1, p4}, Lcom/google/crypto/tink/shaded/protobuf/k0;->q(Lcom/google/crypto/tink/shaded/protobuf/d0;)Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->y()Z

    move-result v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-nez v1, :cond_0

    iget p2, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->k:I

    move-object v3, v9

    :goto_17
    iget p4, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->l:I

    if-ge p2, p4, :cond_f

    iget-object p4, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->j:[I

    aget v2, p4, p2

    move-object v0, p0

    move-object v1, p3

    move-object v4, p1

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->q(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/k0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 p2, p2, 0x1

    goto :goto_17

    :cond_f
    if-eqz v3, :cond_10

    invoke-virtual {p1, p3, v3}, Lcom/google/crypto/tink/shaded/protobuf/k0;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_10
    return-void

    :cond_11
    if-nez v9, :cond_12

    :try_start_6
    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    :cond_12
    invoke-virtual {p1, v9, p4}, Lcom/google/crypto/tink/shaded/protobuf/k0;->m(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/d0;)Z

    move-result v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-nez v1, :cond_0

    iget p2, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->k:I

    move-object v3, v9

    :goto_18
    iget p4, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->l:I

    if-ge p2, p4, :cond_13

    iget-object p4, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->j:[I

    aget v2, p4, p2

    move-object v0, p0

    move-object v1, p3

    move-object v4, p1

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->q(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/k0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 p2, p2, 0x1

    goto :goto_18

    :cond_13
    if-eqz v3, :cond_14

    invoke-virtual {p1, p3, v3}, Lcom/google/crypto/tink/shaded/protobuf/k0;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_14
    return-void

    :goto_19
    iget p4, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->k:I

    move-object v3, v9

    :goto_1a
    iget p5, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->l:I

    if-ge p4, p5, :cond_15

    iget-object p5, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->j:[I

    aget v2, p5, p4

    move-object v0, p0

    move-object v1, p3

    move-object v4, p1

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->q(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/k0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 p4, p4, 0x1

    goto :goto_1a

    :cond_15
    if-eqz v3, :cond_16

    invoke-virtual {p1, p3, v3}, Lcom/google/crypto/tink/shaded/protobuf/k0;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_16
    throw p2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final N(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/d0;)V
    .locals 4

    .line 1
    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->w0(I)I

    move-result p2

    invoke-static {p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->q:Lcom/google/crypto/tink/shaded/protobuf/J;

    invoke-interface {p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/J;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v0, v1, p2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->q:Lcom/google/crypto/tink/shaded/protobuf/J;

    invoke-interface {v2, p2}, Lcom/google/crypto/tink/shaded/protobuf/J;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->q:Lcom/google/crypto/tink/shaded/protobuf/J;

    invoke-interface {v2, p3}, Lcom/google/crypto/tink/shaded/protobuf/J;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->q:Lcom/google/crypto/tink/shaded/protobuf/J;

    invoke-interface {v3, v2, p2}, Lcom/google/crypto/tink/shaded/protobuf/J;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1, v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p2, v2

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->q:Lcom/google/crypto/tink/shaded/protobuf/J;

    invoke-interface {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/J;->h(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    iget-object p2, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->q:Lcom/google/crypto/tink/shaded/protobuf/J;

    invoke-interface {p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/J;->d(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/H$a;

    const/4 p2, 0x0

    invoke-interface {p5, p1, p2, p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->M(Ljava/util/Map;Lcom/google/crypto/tink/shaded/protobuf/H$a;Lcom/google/crypto/tink/shaded/protobuf/p;)V

    return-void
.end method

.method public final O(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 5

    .line 1
    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->w0(I)I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v0

    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/S;->s:Lsun/misc/Unsafe;

    invoke-virtual {v2, p2, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object p2

    invoke-virtual {p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->G(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v2, p1, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lcom/google/crypto/tink/shaded/protobuf/e0;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4, v3}, Lcom/google/crypto/tink/shaded/protobuf/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-virtual {p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->q0(Ljava/lang/Object;I)V

    return-void

    :cond_2
    invoke-virtual {v2, p1, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->G(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    invoke-interface {p2}, Lcom/google/crypto/tink/shaded/protobuf/e0;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4, p3}, Lcom/google/crypto/tink/shaded/protobuf/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p3, v4

    :cond_3
    invoke-interface {p2, p3, v3}, Lcom/google/crypto/tink/shaded/protobuf/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Source subfield "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " is present but null: "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final P(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 6

    .line 1
    invoke-virtual {p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v0

    invoke-virtual {p0, p2, v0, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->w0(I)I

    move-result v1

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/S;->s:Lsun/misc/Unsafe;

    invoke-virtual {v3, p2, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->G(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v3, p1, v1, v2, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lcom/google/crypto/tink/shaded/protobuf/e0;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {p2, v5, v4}, Lcom/google/crypto/tink/shaded/protobuf/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, p1, v1, v2, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-virtual {p0, p1, v0, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->r0(Ljava/lang/Object;II)V

    return-void

    :cond_2
    invoke-virtual {v3, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->G(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p2}, Lcom/google/crypto/tink/shaded/protobuf/e0;->f()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v0, p3}, Lcom/google/crypto/tink/shaded/protobuf/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, p1, v1, v2, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p3, v0

    :cond_3
    invoke-interface {p2, p3, v4}, Lcom/google/crypto/tink/shaded/protobuf/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Source subfield "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " is present but null: "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final Q(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 5

    .line 1
    invoke-virtual {p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->w0(I)I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    invoke-virtual {p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v3

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/S;->v0(I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_5

    :pswitch_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->P(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_5

    :pswitch_1
    invoke-virtual {p0, p2, v3, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v1, v2, p2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v3, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->r0(Ljava/lang/Object;II)V

    goto/16 :goto_5

    :pswitch_2
    invoke-virtual {p0, p2, v3, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :pswitch_3
    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->q:Lcom/google/crypto/tink/shaded/protobuf/J;

    invoke-static {p3, p1, p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/g0;->E(Lcom/google/crypto/tink/shaded/protobuf/J;Ljava/lang/Object;Ljava/lang/Object;J)V

    goto/16 :goto_5

    :pswitch_4
    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-virtual {p3, p1, p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/E;->d(Ljava/lang/Object;Ljava/lang/Object;J)V

    goto/16 :goto_5

    :pswitch_5
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->O(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_5

    :pswitch_6
    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_1
    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->A(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p1, v1, v2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/o0;->Q(Ljava/lang/Object;JJ)V

    :goto_2
    invoke-virtual {p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->q0(Ljava/lang/Object;I)V

    goto/16 :goto_5

    :pswitch_7
    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_3
    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p2

    invoke-static {p1, v1, v2, p2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->P(Ljava/lang/Object;JI)V

    goto :goto_2

    :pswitch_8
    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :pswitch_9
    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    :pswitch_a
    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    :pswitch_b
    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    :pswitch_c
    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_4
    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v1, v2, p2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_2

    :pswitch_d
    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_4

    :pswitch_e
    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->r(Ljava/lang/Object;J)Z

    move-result p2

    invoke-static {p1, v1, v2, p2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->H(Ljava/lang/Object;JZ)V

    goto :goto_2

    :pswitch_f
    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    :pswitch_10
    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :pswitch_11
    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    :pswitch_12
    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :pswitch_13
    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :pswitch_14
    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->y(Ljava/lang/Object;J)F

    move-result p2

    invoke-static {p1, v1, v2, p2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->O(Ljava/lang/Object;JF)V

    goto/16 :goto_2

    :pswitch_15
    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->x(Ljava/lang/Object;J)D

    move-result-wide v3

    invoke-static {p1, v1, v2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/o0;->N(Ljava/lang/Object;JD)V

    goto/16 :goto_2

    :cond_0
    :goto_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_5
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final R(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v0

    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->w0(I)I

    move-result v1

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/e0;->f()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, Lcom/google/crypto/tink/shaded/protobuf/S;->s:Lsun/misc/Unsafe;

    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/S;->G(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/e0;->f()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method public final S(Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/e0;->f()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, Lcom/google/crypto/tink/shaded/protobuf/S;->s:Lsun/misc/Unsafe;

    invoke-virtual {p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->w0(I)I

    move-result p3

    invoke-static {p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/S;->G(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/e0;->f()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method public final W(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    aget p1, v0, p1

    return p1
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/S;->m(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    array-length v1, v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/S;->Q(Ljava/lang/Object;Ljava/lang/Object;I)V

    add-int/lit8 v0, v0, 0x3

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->o:Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-static {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/g0;->F(Lcom/google/crypto/tink/shaded/protobuf/k0;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->f:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->p:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-static {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/g0;->D(Lcom/google/crypto/tink/shaded/protobuf/q;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 7

    .line 1
    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/S;->G(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/x;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->n()V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->m()V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->F()V

    :cond_1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->w0(I)I

    move-result v2

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v3

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/S;->v0(I)I

    move-result v2

    const/16 v5, 0x9

    if-eq v2, v5, :cond_2

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/S;->s:Lsun/misc/Unsafe;

    invoke-virtual {v2, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_3

    iget-object v6, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->q:Lcom/google/crypto/tink/shaded/protobuf/J;

    invoke-interface {v6, v5}, Lcom/google/crypto/tink/shaded/protobuf/J;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2, p1, v3, v4, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-virtual {v2, p1, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/E;->c(Ljava/lang/Object;J)V

    goto :goto_1

    :cond_2
    :pswitch_2
    invoke-virtual {p0, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v2

    sget-object v5, Lcom/google/crypto/tink/shaded/protobuf/S;->s:Lsun/misc/Unsafe;

    invoke-virtual {v5, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/e0;->b(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x3

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->o:Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/k0;->j(Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->f:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->p:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/q;->f(Ljava/lang/Object;)V

    :cond_5
    return-void

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 17

    .line 1
    move-object/from16 v6, p0

    move-object/from16 v7, p1

    const v8, 0xfffff

    const/4 v9, 0x0

    move v0, v8

    move v1, v9

    move v10, v1

    :goto_0
    iget v2, v6, Lcom/google/crypto/tink/shaded/protobuf/S;->k:I

    const/4 v3, 0x1

    if-ge v10, v2, :cond_8

    iget-object v2, v6, Lcom/google/crypto/tink/shaded/protobuf/S;->j:[I

    aget v11, v2, v10

    invoke-virtual {v6, v11}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v12

    invoke-virtual {v6, v11}, Lcom/google/crypto/tink/shaded/protobuf/S;->w0(I)I

    move-result v13

    iget-object v2, v6, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    add-int/lit8 v4, v11, 0x2

    aget v2, v2, v4

    and-int v4, v2, v8

    ushr-int/lit8 v2, v2, 0x14

    shl-int v14, v3, v2

    if-eq v4, v0, :cond_1

    if-eq v4, v8, :cond_0

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/S;->s:Lsun/misc/Unsafe;

    int-to-long v1, v4

    invoke-virtual {v0, v7, v1, v2}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v1

    :cond_0
    move/from16 v16, v1

    move v15, v4

    goto :goto_1

    :cond_1
    move v15, v0

    move/from16 v16, v1

    :goto_1
    invoke-static {v13}, Lcom/google/crypto/tink/shaded/protobuf/S;->J(I)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v15

    move/from16 v4, v16

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->C(Ljava/lang/Object;IIII)Z

    move-result v0

    if-nez v0, :cond_2

    return v9

    :cond_2
    invoke-static {v13}, Lcom/google/crypto/tink/shaded/protobuf/S;->v0(I)I

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_6

    const/16 v1, 0x11

    if-eq v0, v1, :cond_6

    const/16 v1, 0x1b

    if-eq v0, v1, :cond_5

    const/16 v1, 0x3c

    if-eq v0, v1, :cond_4

    const/16 v1, 0x44

    if-eq v0, v1, :cond_4

    const/16 v1, 0x31

    if-eq v0, v1, :cond_5

    const/16 v1, 0x32

    if-eq v0, v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v6, v7, v13, v11}, Lcom/google/crypto/tink/shaded/protobuf/S;->F(Ljava/lang/Object;II)Z

    move-result v0

    if-nez v0, :cond_7

    return v9

    :cond_4
    invoke-virtual {v6, v7, v12, v11}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v6, v11}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v0

    invoke-static {v7, v13, v0}, Lcom/google/crypto/tink/shaded/protobuf/S;->D(Ljava/lang/Object;ILcom/google/crypto/tink/shaded/protobuf/e0;)Z

    move-result v0

    if-nez v0, :cond_7

    return v9

    :cond_5
    invoke-virtual {v6, v7, v13, v11}, Lcom/google/crypto/tink/shaded/protobuf/S;->E(Ljava/lang/Object;II)Z

    move-result v0

    if-nez v0, :cond_7

    return v9

    :cond_6
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v15

    move/from16 v4, v16

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->C(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v6, v11}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v0

    invoke-static {v7, v13, v0}, Lcom/google/crypto/tink/shaded/protobuf/S;->D(Ljava/lang/Object;ILcom/google/crypto/tink/shaded/protobuf/e0;)Z

    move-result v0

    if-nez v0, :cond_7

    return v9

    :cond_7
    :goto_2
    add-int/lit8 v10, v10, 0x1

    move v0, v15

    move/from16 v1, v16

    goto/16 :goto_0

    :cond_8
    iget-boolean v0, v6, Lcom/google/crypto/tink/shaded/protobuf/S;->f:Z

    if-eqz v0, :cond_9

    iget-object v0, v6, Lcom/google/crypto/tink/shaded/protobuf/S;->p:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v0, v7}, Lcom/google/crypto/tink/shaded/protobuf/q;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->e()Z

    move-result v0

    if-nez v0, :cond_9

    return v9

    :cond_9
    return v3
.end method

.method public d(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, p1, p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/S;->p(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x3

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->o:Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->o:Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-virtual {v2, p2}, Lcom/google/crypto/tink/shaded/protobuf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->f:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->p:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/q;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->p:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/q;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/t;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final d0(Ljava/lang/Object;[BIIIJLcom/google/crypto/tink/shaded/protobuf/e$a;)I
    .locals 9

    .line 1
    move-object v7, p0

    move-object v0, p1

    move-wide v1, p6

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/S;->s:Lsun/misc/Unsafe;

    move v4, p5

    invoke-virtual {p0, p5}, Lcom/google/crypto/tink/shaded/protobuf/S;->t(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    iget-object v6, v7, Lcom/google/crypto/tink/shaded/protobuf/S;->q:Lcom/google/crypto/tink/shaded/protobuf/J;

    invoke-interface {v6, v5}, Lcom/google/crypto/tink/shaded/protobuf/J;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    iget-object v6, v7, Lcom/google/crypto/tink/shaded/protobuf/S;->q:Lcom/google/crypto/tink/shaded/protobuf/J;

    invoke-interface {v6, v4}, Lcom/google/crypto/tink/shaded/protobuf/J;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iget-object v8, v7, Lcom/google/crypto/tink/shaded/protobuf/S;->q:Lcom/google/crypto/tink/shaded/protobuf/J;

    invoke-interface {v8, v6, v5}, Lcom/google/crypto/tink/shaded/protobuf/J;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, p1, v1, v2, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object v5, v6

    :cond_0
    iget-object v0, v7, Lcom/google/crypto/tink/shaded/protobuf/S;->q:Lcom/google/crypto/tink/shaded/protobuf/J;

    invoke-interface {v0, v4}, Lcom/google/crypto/tink/shaded/protobuf/J;->d(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/H$a;

    iget-object v0, v7, Lcom/google/crypto/tink/shaded/protobuf/S;->q:Lcom/google/crypto/tink/shaded/protobuf/J;

    invoke-interface {v0, v5}, Lcom/google/crypto/tink/shaded/protobuf/J;->h(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v5

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p2

    move v2, p3

    move v3, p4

    move-object/from16 v6, p8

    invoke-virtual/range {v0 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->n([BIILcom/google/crypto/tink/shaded/protobuf/H$a;Ljava/util/Map;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->h:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/S;->x(Ljava/lang/Object;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/S;->w(Ljava/lang/Object;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final e0(Ljava/lang/Object;[BIIIIIIIJILcom/google/crypto/tink/shaded/protobuf/e$a;)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v9, p6

    move/from16 v2, p7

    move-wide/from16 v6, p10

    move/from16 v10, p12

    move-object/from16 v8, p13

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/S;->s:Lsun/misc/Unsafe;

    iget-object v11, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    add-int/lit8 v12, v10, 0x2

    aget v11, v11, v12

    const v12, 0xfffff

    and-int/2addr v11, v12

    int-to-long v11, v11

    const/4 v13, 0x5

    const/4 v14, 0x1

    const/4 v15, 0x2

    packed-switch p9, :pswitch_data_0

    goto/16 :goto_9

    :pswitch_0
    const/4 v3, 0x3

    if-ne v2, v3, :cond_4

    invoke-virtual {v0, v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->S(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v11

    and-int/lit8 v2, p5, -0x8

    or-int/lit8 v7, v2, 0x4

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v3

    move-object v2, v11

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v8, p13

    invoke-static/range {v2 .. v8}, Lcom/google/crypto/tink/shaded/protobuf/e;->M(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/e0;[BIIILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v2

    :goto_0
    invoke-virtual {v0, v1, v9, v10, v11}, Lcom/google/crypto/tink/shaded/protobuf/S;->u0(Ljava/lang/Object;IILjava/lang/Object;)V

    goto/16 :goto_a

    :pswitch_1
    if-nez v2, :cond_4

    invoke-static {v4, v5, v8}, Lcom/google/crypto/tink/shaded/protobuf/e;->K([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v2

    iget-wide v4, v8, Lcom/google/crypto/tink/shaded/protobuf/e$a;->b:J

    invoke-static {v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/i;->c(J)J

    move-result-wide v4

    :goto_1
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    :goto_2
    invoke-virtual {v3, v1, v6, v7, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_3
    invoke-virtual {v3, v1, v11, v12, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_a

    :pswitch_2
    if-nez v2, :cond_4

    invoke-static {v4, v5, v8}, Lcom/google/crypto/tink/shaded/protobuf/e;->H([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v2

    iget v4, v8, Lcom/google/crypto/tink/shaded/protobuf/e$a;->a:I

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/i;->b(I)I

    move-result v4

    :goto_4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_2

    :pswitch_3
    if-nez v2, :cond_4

    invoke-static {v4, v5, v8}, Lcom/google/crypto/tink/shaded/protobuf/e;->H([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v2

    iget v4, v8, Lcom/google/crypto/tink/shaded/protobuf/e$a;->a:I

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->s(I)Lcom/google/crypto/tink/shaded/protobuf/z$c;

    goto :goto_4

    :pswitch_4
    if-ne v2, v15, :cond_4

    invoke-static {v4, v5, v8}, Lcom/google/crypto/tink/shaded/protobuf/e;->b([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v2

    iget-object v4, v8, Lcom/google/crypto/tink/shaded/protobuf/e$a;->c:Ljava/lang/Object;

    goto :goto_2

    :pswitch_5
    if-ne v2, v15, :cond_4

    invoke-virtual {v0, v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->S(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v3

    move-object v2, v11

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v7, p13

    invoke-static/range {v2 .. v7}, Lcom/google/crypto/tink/shaded/protobuf/e;->N(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/e0;[BIILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v2

    goto :goto_0

    :pswitch_6
    if-ne v2, v15, :cond_4

    invoke-static {v4, v5, v8}, Lcom/google/crypto/tink/shaded/protobuf/e;->H([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v2

    iget v5, v8, Lcom/google/crypto/tink/shaded/protobuf/e$a;->a:I

    if-nez v5, :cond_0

    const-string v4, ""

    goto :goto_2

    :cond_0
    const/high16 v8, 0x20000000

    and-int v8, p8, v8

    if-eqz v8, :cond_2

    add-int v8, v2, v5

    invoke-static {v4, v2, v8}, Lcom/google/crypto/tink/shaded/protobuf/p0;->n([BII)Z

    move-result v8

    if-eqz v8, :cond_1

    goto :goto_5

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/A;->d()Lcom/google/crypto/tink/shaded/protobuf/A;

    move-result-object v1

    throw v1

    :cond_2
    :goto_5
    new-instance v8, Ljava/lang/String;

    sget-object v10, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Ljava/nio/charset/Charset;

    invoke-direct {v8, v4, v2, v5, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-virtual {v3, v1, v6, v7, v8}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/2addr v2, v5

    goto :goto_3

    :pswitch_7
    if-nez v2, :cond_4

    invoke-static {v4, v5, v8}, Lcom/google/crypto/tink/shaded/protobuf/e;->K([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v2

    iget-wide v4, v8, Lcom/google/crypto/tink/shaded/protobuf/e$a;->b:J

    const-wide/16 v15, 0x0

    cmp-long v4, v4, v15

    if-eqz v4, :cond_3

    goto :goto_6

    :cond_3
    const/4 v14, 0x0

    :goto_6
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    goto/16 :goto_2

    :pswitch_8
    if-ne v2, v13, :cond_4

    invoke-static/range {p2 .. p3}, Lcom/google/crypto/tink/shaded/protobuf/e;->g([BI)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_7
    invoke-virtual {v3, v1, v6, v7, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v2, v5, 0x4

    goto/16 :goto_3

    :pswitch_9
    if-ne v2, v14, :cond_4

    invoke-static/range {p2 .. p3}, Lcom/google/crypto/tink/shaded/protobuf/e;->i([BI)J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :goto_8
    invoke-virtual {v3, v1, v6, v7, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v2, v5, 0x8

    goto/16 :goto_3

    :pswitch_a
    if-nez v2, :cond_4

    invoke-static {v4, v5, v8}, Lcom/google/crypto/tink/shaded/protobuf/e;->H([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v2

    iget v4, v8, Lcom/google/crypto/tink/shaded/protobuf/e$a;->a:I

    goto/16 :goto_4

    :pswitch_b
    if-nez v2, :cond_4

    invoke-static {v4, v5, v8}, Lcom/google/crypto/tink/shaded/protobuf/e;->K([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v2

    iget-wide v4, v8, Lcom/google/crypto/tink/shaded/protobuf/e$a;->b:J

    goto/16 :goto_1

    :pswitch_c
    if-ne v2, v13, :cond_4

    invoke-static/range {p2 .. p3}, Lcom/google/crypto/tink/shaded/protobuf/e;->k([BI)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    goto :goto_7

    :pswitch_d
    if-ne v2, v14, :cond_4

    invoke-static/range {p2 .. p3}, Lcom/google/crypto/tink/shaded/protobuf/e;->d([BI)D

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    goto :goto_8

    :cond_4
    :goto_9
    move v2, v5

    :goto_a
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x33
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public f()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->m:Lcom/google/crypto/tink/shaded/protobuf/U;

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->e:Lcom/google/crypto/tink/shaded/protobuf/O;

    invoke-interface {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/U;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public f0(Ljava/lang/Object;[BIIILcom/google/crypto/tink/shaded/protobuf/e$a;)I
    .locals 27

    .line 1
    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move-object/from16 v12, p2

    move/from16 v13, p4

    move/from16 v11, p5

    move-object/from16 v9, p6

    invoke-static/range {p1 .. p1}, Lcom/google/crypto/tink/shaded/protobuf/S;->m(Ljava/lang/Object;)V

    sget-object v10, Lcom/google/crypto/tink/shaded/protobuf/S;->s:Lsun/misc/Unsafe;

    const/16 v16, 0x0

    move/from16 v0, p3

    move/from16 v2, v16

    move v3, v2

    move v5, v3

    const/4 v1, -0x1

    const v6, 0xfffff

    :goto_0
    if-ge v0, v13, :cond_14

    add-int/lit8 v3, v0, 0x1

    aget-byte v0, v12, v0

    if-gez v0, :cond_0

    invoke-static {v0, v12, v3, v9}, Lcom/google/crypto/tink/shaded/protobuf/e;->G(I[BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    iget v3, v9, Lcom/google/crypto/tink/shaded/protobuf/e$a;->a:I

    move v4, v3

    move v3, v0

    goto :goto_1

    :cond_0
    move v4, v0

    :goto_1
    ushr-int/lit8 v0, v4, 0x3

    and-int/lit8 v8, v4, 0x7

    const/4 v7, 0x3

    if-le v0, v1, :cond_1

    div-int/2addr v2, v7

    invoke-virtual {v15, v0, v2}, Lcom/google/crypto/tink/shaded/protobuf/S;->j0(II)I

    move-result v1

    :goto_2
    move v2, v1

    const/4 v1, -0x1

    goto :goto_3

    :cond_1
    invoke-virtual {v15, v0}, Lcom/google/crypto/tink/shaded/protobuf/S;->i0(I)I

    move-result v1

    goto :goto_2

    :goto_3
    if-ne v2, v1, :cond_2

    move/from16 v23, v0

    move/from16 v18, v1

    move v2, v3

    move v8, v4

    move/from16 v17, v5

    move/from16 v20, v6

    move-object/from16 v26, v10

    move v0, v11

    move/from16 v21, v16

    goto/16 :goto_13

    :cond_2
    iget-object v1, v15, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    add-int/lit8 v19, v2, 0x1

    aget v1, v1, v19

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->v0(I)I

    move-result v7

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v11

    move/from16 v19, v4

    const/16 v4, 0x11

    move-wide/from16 v20, v11

    if-gt v7, v4, :cond_9

    iget-object v4, v15, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    add-int/lit8 v12, v2, 0x2

    aget v4, v4, v12

    ushr-int/lit8 v12, v4, 0x14

    const/4 v11, 0x1

    shl-int v12, v11, v12

    const v11, 0xfffff

    and-int/2addr v4, v11

    move/from16 v17, v12

    if-eq v4, v6, :cond_4

    if-eq v6, v11, :cond_3

    int-to-long v11, v6

    invoke-virtual {v10, v14, v11, v12, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_3
    int-to-long v5, v4

    invoke-virtual {v10, v14, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    move v12, v4

    move v11, v5

    goto :goto_4

    :cond_4
    move v11, v5

    move v12, v6

    :goto_4
    const/4 v4, 0x5

    packed-switch v7, :pswitch_data_0

    move-object/from16 v7, p2

    move/from16 v23, v0

    move v6, v2

    const/16 v18, -0x1

    goto/16 :goto_d

    :pswitch_0
    const/4 v1, 0x3

    if-ne v8, v1, :cond_5

    invoke-virtual {v15, v14, v2}, Lcom/google/crypto/tink/shaded/protobuf/S;->R(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v7

    shl-int/lit8 v1, v0, 0x3

    or-int/lit8 v5, v1, 0x4

    invoke-virtual {v15, v2}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v1

    move/from16 v23, v0

    move-object v0, v7

    const/16 v18, -0x1

    move v8, v2

    move-object/from16 v2, p2

    move/from16 v6, v19

    move/from16 v4, p4

    move-object/from16 v6, p6

    invoke-static/range {v0 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/e;->M(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/e0;[BIIILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    invoke-virtual {v15, v14, v8, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->t0(Ljava/lang/Object;ILjava/lang/Object;)V

    or-int v5, v11, v17

    move/from16 v11, p5

    move v2, v8

    move v6, v12

    move/from16 v3, v19

    :goto_5
    move/from16 v1, v23

    move-object/from16 v12, p2

    goto/16 :goto_0

    :cond_5
    move/from16 v23, v0

    const/16 v18, -0x1

    move-object/from16 v7, p2

    move v6, v2

    goto/16 :goto_d

    :pswitch_1
    move/from16 v23, v0

    move v6, v2

    const/16 v18, -0x1

    move-object/from16 v7, p2

    if-nez v8, :cond_8

    move-wide/from16 v4, v20

    invoke-static {v7, v3, v9}, Lcom/google/crypto/tink/shaded/protobuf/e;->K([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v8

    iget-wide v0, v9, Lcom/google/crypto/tink/shaded/protobuf/e$a;->b:J

    invoke-static {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->c(J)J

    move-result-wide v20

    move-object v0, v10

    move-object/from16 v1, p1

    :goto_6
    move-wide v2, v4

    move-wide/from16 v4, v20

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int v5, v11, v17

    move/from16 v11, p5

    move v2, v6

    move v0, v8

    :goto_7
    move v6, v12

    move/from16 v3, v19

    move/from16 v1, v23

    move-object v12, v7

    goto/16 :goto_0

    :pswitch_2
    move-object/from16 v7, p2

    move/from16 v23, v0

    move v6, v2

    move-wide/from16 v4, v20

    const/16 v18, -0x1

    if-nez v8, :cond_8

    invoke-static {v7, v3, v9}, Lcom/google/crypto/tink/shaded/protobuf/e;->H([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    iget v1, v9, Lcom/google/crypto/tink/shaded/protobuf/e$a;->a:I

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->b(I)I

    move-result v1

    :goto_8
    invoke-virtual {v10, v14, v4, v5, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_9
    or-int v5, v11, v17

    move/from16 v11, p5

    move v2, v6

    goto :goto_7

    :pswitch_3
    move-object/from16 v7, p2

    move/from16 v23, v0

    move v6, v2

    move-wide/from16 v4, v20

    const/16 v18, -0x1

    if-nez v8, :cond_8

    invoke-static {v7, v3, v9}, Lcom/google/crypto/tink/shaded/protobuf/e;->H([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    iget v1, v9, Lcom/google/crypto/tink/shaded/protobuf/e$a;->a:I

    invoke-virtual {v15, v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->s(I)Lcom/google/crypto/tink/shaded/protobuf/z$c;

    goto :goto_8

    :pswitch_4
    move-object/from16 v7, p2

    move/from16 v23, v0

    move v6, v2

    move-wide/from16 v4, v20

    const/4 v0, 0x2

    const/16 v18, -0x1

    if-ne v8, v0, :cond_8

    invoke-static {v7, v3, v9}, Lcom/google/crypto/tink/shaded/protobuf/e;->b([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    :goto_a
    iget-object v1, v9, Lcom/google/crypto/tink/shaded/protobuf/e$a;->c:Ljava/lang/Object;

    invoke-virtual {v10, v14, v4, v5, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_9

    :pswitch_5
    move-object/from16 v7, p2

    move/from16 v23, v0

    move v6, v2

    const/4 v0, 0x2

    const/16 v18, -0x1

    if-ne v8, v0, :cond_8

    invoke-virtual {v15, v14, v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->R(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v15, v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v1

    move-object v0, v8

    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/e;->N(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/e0;[BIILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    invoke-virtual {v15, v14, v6, v8}, Lcom/google/crypto/tink/shaded/protobuf/S;->t0(Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_9

    :pswitch_6
    move-object/from16 v7, p2

    move/from16 v23, v0

    move v6, v2

    move-wide/from16 v4, v20

    const/4 v0, 0x2

    const/16 v18, -0x1

    if-ne v8, v0, :cond_8

    const/high16 v0, 0x20000000

    and-int/2addr v0, v1

    if-nez v0, :cond_6

    invoke-static {v7, v3, v9}, Lcom/google/crypto/tink/shaded/protobuf/e;->B([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    goto :goto_a

    :cond_6
    invoke-static {v7, v3, v9}, Lcom/google/crypto/tink/shaded/protobuf/e;->E([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    goto :goto_a

    :pswitch_7
    move-object/from16 v7, p2

    move/from16 v23, v0

    move v6, v2

    move-wide/from16 v4, v20

    const/16 v18, -0x1

    if-nez v8, :cond_8

    invoke-static {v7, v3, v9}, Lcom/google/crypto/tink/shaded/protobuf/e;->K([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    iget-wide v1, v9, Lcom/google/crypto/tink/shaded/protobuf/e$a;->b:J

    const-wide/16 v20, 0x0

    cmp-long v1, v1, v20

    if-eqz v1, :cond_7

    const/4 v1, 0x1

    goto :goto_b

    :cond_7
    move/from16 v1, v16

    :goto_b
    invoke-static {v14, v4, v5, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->H(Ljava/lang/Object;JZ)V

    goto/16 :goto_9

    :pswitch_8
    move-object/from16 v7, p2

    move/from16 v23, v0

    move v6, v2

    move-wide/from16 v1, v20

    const/16 v18, -0x1

    if-ne v8, v4, :cond_8

    invoke-static {v7, v3}, Lcom/google/crypto/tink/shaded/protobuf/e;->g([BI)I

    move-result v0

    invoke-virtual {v10, v14, v1, v2, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_c
    add-int/lit8 v0, v3, 0x4

    goto/16 :goto_9

    :pswitch_9
    move-object/from16 v7, p2

    move/from16 v23, v0

    move v6, v2

    move-wide/from16 v1, v20

    const/4 v0, 0x1

    const/16 v18, -0x1

    if-ne v8, v0, :cond_8

    invoke-static {v7, v3}, Lcom/google/crypto/tink/shaded/protobuf/e;->i([BI)J

    move-result-wide v4

    move-object v0, v10

    move-wide/from16 v20, v1

    move-object/from16 v1, p1

    move v8, v3

    move-wide/from16 v2, v20

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    add-int/lit8 v0, v8, 0x8

    goto/16 :goto_9

    :pswitch_a
    move-object/from16 v7, p2

    move/from16 v23, v0

    move v6, v2

    const/16 v18, -0x1

    if-nez v8, :cond_8

    invoke-static {v7, v3, v9}, Lcom/google/crypto/tink/shaded/protobuf/e;->H([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    iget v1, v9, Lcom/google/crypto/tink/shaded/protobuf/e$a;->a:I

    move-wide/from16 v4, v20

    goto/16 :goto_8

    :pswitch_b
    move-object/from16 v7, p2

    move/from16 v23, v0

    move v6, v2

    move-wide/from16 v4, v20

    const/16 v18, -0x1

    if-nez v8, :cond_8

    invoke-static {v7, v3, v9}, Lcom/google/crypto/tink/shaded/protobuf/e;->K([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v8

    iget-wide v2, v9, Lcom/google/crypto/tink/shaded/protobuf/e$a;->b:J

    move-object v0, v10

    move-object/from16 v1, p1

    move-wide/from16 v20, v2

    goto/16 :goto_6

    :pswitch_c
    move-object/from16 v7, p2

    move/from16 v23, v0

    move v6, v2

    move-wide/from16 v0, v20

    const/16 v18, -0x1

    if-ne v8, v4, :cond_8

    invoke-static {v7, v3}, Lcom/google/crypto/tink/shaded/protobuf/e;->k([BI)F

    move-result v2

    invoke-static {v14, v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->O(Ljava/lang/Object;JF)V

    goto :goto_c

    :pswitch_d
    move-object/from16 v7, p2

    move/from16 v23, v0

    move v6, v2

    move-wide/from16 v0, v20

    const/4 v2, 0x1

    const/16 v18, -0x1

    if-ne v8, v2, :cond_8

    invoke-static {v7, v3}, Lcom/google/crypto/tink/shaded/protobuf/e;->d([BI)D

    move-result-wide v4

    invoke-static {v14, v0, v1, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/o0;->N(Ljava/lang/Object;JD)V

    add-int/lit8 v0, v3, 0x8

    goto/16 :goto_9

    :cond_8
    :goto_d
    move/from16 v0, p5

    move v2, v3

    move/from16 v21, v6

    move-object/from16 v26, v10

    move/from16 v17, v11

    move/from16 v20, v12

    :goto_e
    move/from16 v8, v19

    goto/16 :goto_13

    :cond_9
    move/from16 v23, v0

    move v12, v2

    move/from16 v17, v5

    move v11, v6

    move-wide/from16 v5, v20

    const/16 v18, -0x1

    const/16 v0, 0x1b

    if-ne v7, v0, :cond_d

    const/4 v0, 0x2

    if-ne v8, v0, :cond_c

    invoke-virtual {v10, v14, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/z$d;

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->p()Z

    move-result v1

    if-nez v1, :cond_b

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_a

    const/16 v1, 0xa

    goto :goto_f

    :cond_a
    mul-int/lit8 v1, v1, 0x2

    :goto_f
    invoke-interface {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->h(I)Lcom/google/crypto/tink/shaded/protobuf/z$d;

    move-result-object v0

    invoke-virtual {v10, v14, v5, v6, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_b
    move-object v5, v0

    invoke-virtual {v15, v12}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v0

    move/from16 v1, v19

    move-object/from16 v2, p2

    move/from16 v4, p4

    move/from16 v20, v11

    move-object/from16 v6, p6

    invoke-static/range {v0 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/e;->p(Lcom/google/crypto/tink/shaded/protobuf/e0;I[BIILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    move/from16 v11, p5

    move v2, v12

    move/from16 v5, v17

    move/from16 v3, v19

    move/from16 v6, v20

    goto/16 :goto_5

    :cond_c
    move/from16 v20, v11

    move v15, v3

    move-object/from16 v26, v10

    move/from16 v21, v12

    goto/16 :goto_12

    :cond_d
    move/from16 v20, v11

    const/16 v0, 0x31

    if-gt v7, v0, :cond_f

    int-to-long v1, v1

    move-object/from16 v0, p0

    move-wide/from16 v21, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v11, v3

    move/from16 v4, p4

    move-wide/from16 v24, v5

    move/from16 v5, v19

    move/from16 v6, v23

    move/from16 p3, v7

    move v7, v8

    move v8, v12

    move-object/from16 v26, v10

    move-wide/from16 v9, v21

    move v15, v11

    move/from16 v11, p3

    move/from16 v21, v12

    move-wide/from16 v12, v24

    move-object/from16 v14, p6

    invoke-virtual/range {v0 .. v14}, Lcom/google/crypto/tink/shaded/protobuf/S;->h0(Ljava/lang/Object;[BIIIIIIJIJLcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    if-eq v0, v15, :cond_e

    :goto_10
    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move-object/from16 v12, p2

    move/from16 v13, p4

    move/from16 v11, p5

    move-object/from16 v9, p6

    move/from16 v5, v17

    move/from16 v3, v19

    move/from16 v6, v20

    move/from16 v2, v21

    move/from16 v1, v23

    :goto_11
    move-object/from16 v10, v26

    goto/16 :goto_0

    :cond_e
    move v2, v0

    move/from16 v8, v19

    move/from16 v0, p5

    goto :goto_13

    :cond_f
    move v15, v3

    move-wide/from16 v24, v5

    move/from16 p3, v7

    move-object/from16 v26, v10

    move/from16 v21, v12

    const/16 v0, 0x32

    move/from16 v9, p3

    if-ne v9, v0, :cond_11

    const/4 v0, 0x2

    if-ne v8, v0, :cond_10

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v15

    move/from16 v4, p4

    move/from16 v5, v21

    move-wide/from16 v6, v24

    move-object/from16 v8, p6

    invoke-virtual/range {v0 .. v8}, Lcom/google/crypto/tink/shaded/protobuf/S;->d0(Ljava/lang/Object;[BIIIJLcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    if-eq v0, v15, :cond_e

    goto :goto_10

    :cond_10
    :goto_12
    move/from16 v0, p5

    move v2, v15

    goto/16 :goto_e

    :cond_11
    move-object/from16 v0, p0

    move v10, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v15

    move/from16 v4, p4

    move/from16 v5, v19

    move/from16 v6, v23

    move v7, v8

    move v8, v10

    move-wide/from16 v10, v24

    move/from16 v12, v21

    move-object/from16 v13, p6

    invoke-virtual/range {v0 .. v13}, Lcom/google/crypto/tink/shaded/protobuf/S;->e0(Ljava/lang/Object;[BIIIIIIIJILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    if-eq v0, v15, :cond_e

    goto :goto_10

    :goto_13
    if-ne v8, v0, :cond_12

    if-eqz v0, :cond_12

    move-object/from16 v9, p0

    move v10, v0

    move v6, v2

    move/from16 v5, v17

    :goto_14
    move/from16 v0, v20

    const v1, 0xfffff

    goto/16 :goto_16

    :cond_12
    move-object/from16 v9, p0

    move v10, v0

    iget-boolean v0, v9, Lcom/google/crypto/tink/shaded/protobuf/S;->f:Z

    move-object/from16 v11, p6

    if-eqz v0, :cond_13

    iget-object v0, v11, Lcom/google/crypto/tink/shaded/protobuf/e$a;->d:Lcom/google/crypto/tink/shaded/protobuf/p;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    if-eq v0, v1, :cond_13

    iget-object v5, v9, Lcom/google/crypto/tink/shaded/protobuf/S;->e:Lcom/google/crypto/tink/shaded/protobuf/O;

    iget-object v6, v9, Lcom/google/crypto/tink/shaded/protobuf/S;->o:Lcom/google/crypto/tink/shaded/protobuf/k0;

    move v0, v8

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v4, p1

    move-object/from16 v7, p6

    invoke-static/range {v0 .. v7}, Lcom/google/crypto/tink/shaded/protobuf/e;->f(I[BIILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/O;Lcom/google/crypto/tink/shaded/protobuf/k0;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    goto :goto_15

    :cond_13
    invoke-static/range {p1 .. p1}, Lcom/google/crypto/tink/shaded/protobuf/S;->v(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/l0;

    move-result-object v4

    move v0, v8

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/e;->F(I[BIILcom/google/crypto/tink/shaded/protobuf/l0;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    :goto_15
    move-object/from16 v14, p1

    move-object/from16 v12, p2

    move/from16 v13, p4

    move v3, v8

    move-object v15, v9

    move-object v9, v11

    move/from16 v5, v17

    move/from16 v6, v20

    move/from16 v2, v21

    move/from16 v1, v23

    move v11, v10

    goto/16 :goto_11

    :cond_14
    move/from16 v17, v5

    move/from16 v20, v6

    move-object/from16 v26, v10

    move v10, v11

    move-object v9, v15

    move v6, v0

    move v8, v3

    goto :goto_14

    :goto_16
    if-eq v0, v1, :cond_15

    int-to-long v0, v0

    move-object/from16 v7, p1

    move-object/from16 v2, v26

    invoke-virtual {v2, v7, v0, v1, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_17

    :cond_15
    move-object/from16 v7, p1

    :goto_17
    iget v0, v9, Lcom/google/crypto/tink/shaded/protobuf/S;->k:I

    const/4 v1, 0x0

    move v11, v0

    move-object v3, v1

    :goto_18
    iget v0, v9, Lcom/google/crypto/tink/shaded/protobuf/S;->l:I

    if-ge v11, v0, :cond_16

    iget-object v0, v9, Lcom/google/crypto/tink/shaded/protobuf/S;->j:[I

    aget v2, v0, v11

    iget-object v4, v9, Lcom/google/crypto/tink/shaded/protobuf/S;->o:Lcom/google/crypto/tink/shaded/protobuf/k0;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v5, p1

    invoke-virtual/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->q(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/k0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/google/crypto/tink/shaded/protobuf/l0;

    add-int/lit8 v11, v11, 0x1

    goto :goto_18

    :cond_16
    if-eqz v3, :cond_17

    iget-object v0, v9, Lcom/google/crypto/tink/shaded/protobuf/S;->o:Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-virtual {v0, v7, v3}, Lcom/google/crypto/tink/shaded/protobuf/k0;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_17
    move/from16 v0, p4

    if-nez v10, :cond_19

    if-ne v6, v0, :cond_18

    goto :goto_19

    :cond_18
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/A;->h()Lcom/google/crypto/tink/shaded/protobuf/A;

    move-result-object v0

    throw v0

    :cond_19
    if-gt v6, v0, :cond_1a

    if-ne v8, v10, :cond_1a

    :goto_19
    return v6

    :cond_1a
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/A;->h()Lcom/google/crypto/tink/shaded/protobuf/A;

    move-result-object v0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public g(Ljava/lang/Object;)I
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->w0(I)I

    move-result v3

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v5

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->v0(I)I

    move-result v3

    const/16 v7, 0x25

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_b

    :pswitch_0
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_1
    invoke-static {p1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    mul-int/lit8 v2, v2, 0x35

    :goto_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v2, v3

    goto/16 :goto_b

    :pswitch_1
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_4
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->c0(Ljava/lang/Object;J)J

    move-result-wide v3

    :goto_5
    invoke-static {v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/z;->f(J)I

    move-result v3

    goto :goto_3

    :pswitch_2
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_6
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v3

    goto :goto_3

    :pswitch_3
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_4

    :pswitch_4
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_6

    :pswitch_5
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_6

    :pswitch_6
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_6

    :pswitch_7
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :pswitch_8
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    goto :goto_2

    :pswitch_9
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :pswitch_a
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :pswitch_b
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto :goto_3

    :pswitch_c
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->Y(Ljava/lang/Object;J)Z

    move-result v3

    :goto_7
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/z;->c(Z)I

    move-result v3

    goto :goto_3

    :pswitch_d
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_6

    :pswitch_e
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_4

    :pswitch_f
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_6

    :pswitch_10
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :pswitch_11
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :pswitch_12
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->a0(Ljava/lang/Object;J)F

    move-result v3

    :goto_8
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    goto/16 :goto_3

    :pswitch_13
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->Z(Ljava/lang/Object;J)D

    move-result-wide v3

    :goto_9
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    goto/16 :goto_5

    :pswitch_14
    invoke-static {p1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    :goto_a
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v7

    :cond_0
    mul-int/lit8 v2, v2, 0x35

    add-int/2addr v2, v7

    goto :goto_b

    :pswitch_15
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/o0;->A(Ljava/lang/Object;J)J

    move-result-wide v3

    goto/16 :goto_5

    :pswitch_16
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_17
    invoke-static {p1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_a

    :pswitch_18
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/o0;->r(Ljava/lang/Object;J)Z

    move-result v3

    goto :goto_7

    :pswitch_19
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/o0;->y(Ljava/lang/Object;J)F

    move-result v3

    goto :goto_8

    :pswitch_1a
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/o0;->x(Ljava/lang/Object;J)D

    move-result-wide v3

    goto :goto_9

    :cond_1
    :goto_b
    add-int/lit8 v1, v1, 0x3

    goto/16 :goto_0

    :cond_2
    mul-int/lit8 v2, v2, 0x35

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->o:Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v2, v0

    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->f:Z

    if-eqz v0, :cond_3

    mul-int/lit8 v2, v2, 0x35

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->p:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/q;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/t;->hashCode()I

    move-result p1

    add-int/2addr v2, p1

    :cond_3
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_15
        :pswitch_15
        :pswitch_16
        :pswitch_15
        :pswitch_16
        :pswitch_18
        :pswitch_b
        :pswitch_17
        :pswitch_8
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_15
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_a
        :pswitch_9
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g0(Ljava/lang/Object;[BIILcom/google/crypto/tink/shaded/protobuf/e$a;)I
    .locals 29

    .line 1
    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move-object/from16 v12, p2

    move/from16 v13, p4

    move-object/from16 v11, p5

    invoke-static/range {p1 .. p1}, Lcom/google/crypto/tink/shaded/protobuf/S;->m(Ljava/lang/Object;)V

    sget-object v9, Lcom/google/crypto/tink/shaded/protobuf/S;->s:Lsun/misc/Unsafe;

    const/16 v16, 0x0

    const/4 v8, -0x1

    move/from16 v0, p3

    move v1, v8

    move/from16 v2, v16

    move v6, v2

    const v7, 0xfffff

    :goto_0
    if-ge v0, v13, :cond_15

    add-int/lit8 v3, v0, 0x1

    aget-byte v0, v12, v0

    if-gez v0, :cond_0

    invoke-static {v0, v12, v3, v11}, Lcom/google/crypto/tink/shaded/protobuf/e;->G(I[BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    iget v3, v11, Lcom/google/crypto/tink/shaded/protobuf/e$a;->a:I

    move v4, v0

    move/from16 v17, v3

    goto :goto_1

    :cond_0
    move/from16 v17, v0

    move v4, v3

    :goto_1
    ushr-int/lit8 v5, v17, 0x3

    and-int/lit8 v3, v17, 0x7

    if-le v5, v1, :cond_1

    div-int/lit8 v2, v2, 0x3

    invoke-virtual {v15, v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/S;->j0(II)I

    move-result v0

    :goto_2
    move v2, v0

    goto :goto_3

    :cond_1
    invoke-virtual {v15, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->i0(I)I

    move-result v0

    goto :goto_2

    :goto_3
    if-ne v2, v8, :cond_2

    move v2, v4

    move/from16 v18, v5

    move/from16 v19, v8

    move-object/from16 v28, v9

    move/from16 v27, v16

    goto/16 :goto_12

    :cond_2
    iget-object v0, v15, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    add-int/lit8 v1, v2, 0x1

    aget v1, v0, v1

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->v0(I)I

    move-result v0

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v10

    const/16 v8, 0x11

    move/from16 p3, v5

    if-gt v0, v8, :cond_c

    iget-object v8, v15, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    add-int/lit8 v20, v2, 0x2

    aget v8, v8, v20

    ushr-int/lit8 v20, v8, 0x14

    const/4 v5, 0x1

    shl-int v20, v5, v20

    move-wide/from16 v22, v10

    const v10, 0xfffff

    and-int/2addr v8, v10

    if-eq v8, v7, :cond_5

    if-eq v7, v10, :cond_3

    int-to-long v10, v7

    invoke-virtual {v9, v14, v10, v11, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const v10, 0xfffff

    :cond_3
    if-eq v8, v10, :cond_4

    int-to-long v6, v8

    invoke-virtual {v9, v14, v6, v7}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    :cond_4
    move v7, v8

    :cond_5
    const/4 v8, 0x5

    packed-switch v0, :pswitch_data_0

    :cond_6
    move/from16 v18, p3

    move-object/from16 v11, p5

    move v8, v2

    :cond_7
    move v10, v4

    move/from16 p3, v6

    goto/16 :goto_c

    :pswitch_0
    if-nez v3, :cond_6

    move-object/from16 v11, p5

    move-wide/from16 v0, v22

    invoke-static {v12, v4, v11}, Lcom/google/crypto/tink/shaded/protobuf/e;->K([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v8

    iget-wide v3, v11, Lcom/google/crypto/tink/shaded/protobuf/e$a;->b:J

    invoke-static {v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/i;->c(J)J

    move-result-wide v4

    move-object v0, v9

    move-object/from16 v1, p1

    move/from16 v17, v8

    move v8, v2

    move-wide/from16 v2, v22

    move/from16 v18, p3

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int v6, v6, v20

    move v2, v8

    move/from16 v0, v17

    :goto_4
    move/from16 v1, v18

    const/4 v8, -0x1

    goto/16 :goto_0

    :pswitch_1
    move/from16 v18, p3

    move-object/from16 v11, p5

    move v8, v2

    if-nez v3, :cond_7

    invoke-static {v12, v4, v11}, Lcom/google/crypto/tink/shaded/protobuf/e;->H([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    iget v1, v11, Lcom/google/crypto/tink/shaded/protobuf/e$a;->a:I

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->b(I)I

    move-result v1

    move-wide/from16 v2, v22

    invoke-virtual {v9, v14, v2, v3, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_5
    or-int v6, v6, v20

    :goto_6
    move v2, v8

    goto :goto_4

    :pswitch_2
    move/from16 v18, p3

    move-object/from16 v11, p5

    move v8, v2

    move-wide/from16 v0, v22

    if-nez v3, :cond_7

    invoke-static {v12, v4, v11}, Lcom/google/crypto/tink/shaded/protobuf/e;->H([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v2

    iget v3, v11, Lcom/google/crypto/tink/shaded/protobuf/e$a;->a:I

    invoke-virtual {v9, v14, v0, v1, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_7
    or-int v6, v6, v20

    move v0, v2

    goto :goto_6

    :pswitch_3
    move/from16 v18, p3

    move-object/from16 v11, p5

    move v8, v2

    move-wide/from16 v0, v22

    const/4 v2, 0x2

    if-ne v3, v2, :cond_7

    invoke-static {v12, v4, v11}, Lcom/google/crypto/tink/shaded/protobuf/e;->b([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v2

    iget-object v3, v11, Lcom/google/crypto/tink/shaded/protobuf/e$a;->c:Ljava/lang/Object;

    invoke-virtual {v9, v14, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_7

    :pswitch_4
    move/from16 v18, p3

    move-object/from16 v11, p5

    move v8, v2

    const/4 v2, 0x2

    if-ne v3, v2, :cond_7

    invoke-virtual {v15, v14, v8}, Lcom/google/crypto/tink/shaded/protobuf/S;->R(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v15, v8}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v1

    move-object v0, v5

    move-object/from16 v2, p2

    move v3, v4

    move/from16 v4, p4

    move-object v10, v5

    move-object/from16 v5, p5

    invoke-static/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/e;->N(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/e0;[BIILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    invoke-virtual {v15, v14, v8, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->t0(Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_5

    :pswitch_5
    move/from16 v18, p3

    move-object/from16 v11, p5

    move v8, v2

    move/from16 p3, v6

    move-wide/from16 v5, v22

    const/4 v0, 0x2

    if-ne v3, v0, :cond_9

    const/high16 v0, 0x20000000

    and-int/2addr v0, v1

    if-nez v0, :cond_8

    invoke-static {v12, v4, v11}, Lcom/google/crypto/tink/shaded/protobuf/e;->B([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    goto :goto_8

    :cond_8
    invoke-static {v12, v4, v11}, Lcom/google/crypto/tink/shaded/protobuf/e;->E([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    :goto_8
    iget-object v1, v11, Lcom/google/crypto/tink/shaded/protobuf/e$a;->c:Ljava/lang/Object;

    invoke-virtual {v9, v14, v5, v6, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_9
    or-int v6, p3, v20

    goto :goto_6

    :cond_9
    move v10, v4

    goto/16 :goto_c

    :pswitch_6
    move/from16 v18, p3

    move-object/from16 v11, p5

    move v8, v2

    move v0, v5

    move/from16 p3, v6

    move-wide/from16 v5, v22

    if-nez v3, :cond_9

    invoke-static {v12, v4, v11}, Lcom/google/crypto/tink/shaded/protobuf/e;->K([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    iget-wide v2, v11, Lcom/google/crypto/tink/shaded/protobuf/e$a;->b:J

    const-wide/16 v23, 0x0

    cmp-long v2, v2, v23

    if-eqz v2, :cond_a

    goto :goto_a

    :cond_a
    move/from16 v0, v16

    :goto_a
    invoke-static {v14, v5, v6, v0}, Lcom/google/crypto/tink/shaded/protobuf/o0;->H(Ljava/lang/Object;JZ)V

    or-int v6, p3, v20

    move v0, v1

    goto/16 :goto_6

    :pswitch_7
    move/from16 v18, p3

    move-object/from16 v11, p5

    move/from16 p3, v6

    move v0, v8

    move-wide/from16 v5, v22

    move v8, v2

    if-ne v3, v0, :cond_9

    invoke-static {v12, v4}, Lcom/google/crypto/tink/shaded/protobuf/e;->g([BI)I

    move-result v0

    invoke-virtual {v9, v14, v5, v6, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v0, v4, 0x4

    goto :goto_9

    :pswitch_8
    move/from16 v18, p3

    move-object/from16 v11, p5

    move v8, v2

    move v0, v5

    move/from16 p3, v6

    move-wide/from16 v5, v22

    if-ne v3, v0, :cond_9

    invoke-static {v12, v4}, Lcom/google/crypto/tink/shaded/protobuf/e;->i([BI)J

    move-result-wide v23

    move-object v0, v9

    move-object/from16 v1, p1

    move-wide v2, v5

    move v10, v4

    move-wide/from16 v4, v23

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    :goto_b
    add-int/lit8 v0, v10, 0x8

    goto :goto_9

    :pswitch_9
    move/from16 v18, p3

    move-object/from16 v11, p5

    move v8, v2

    move v10, v4

    move/from16 p3, v6

    move-wide/from16 v5, v22

    if-nez v3, :cond_b

    invoke-static {v12, v10, v11}, Lcom/google/crypto/tink/shaded/protobuf/e;->H([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    iget v1, v11, Lcom/google/crypto/tink/shaded/protobuf/e$a;->a:I

    invoke-virtual {v9, v14, v5, v6, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_9

    :pswitch_a
    move/from16 v18, p3

    move-object/from16 v11, p5

    move v8, v2

    move v10, v4

    move/from16 p3, v6

    move-wide/from16 v5, v22

    if-nez v3, :cond_b

    invoke-static {v12, v10, v11}, Lcom/google/crypto/tink/shaded/protobuf/e;->K([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v10

    iget-wide v2, v11, Lcom/google/crypto/tink/shaded/protobuf/e$a;->b:J

    move-object v0, v9

    move-object/from16 v1, p1

    move-wide/from16 v23, v2

    move-wide v2, v5

    move-wide/from16 v4, v23

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int v6, p3, v20

    move v2, v8

    move v0, v10

    goto/16 :goto_4

    :pswitch_b
    move/from16 v18, p3

    move-object/from16 v11, p5

    move v10, v4

    move/from16 p3, v6

    move v0, v8

    move-wide/from16 v5, v22

    move v8, v2

    if-ne v3, v0, :cond_b

    invoke-static {v12, v10}, Lcom/google/crypto/tink/shaded/protobuf/e;->k([BI)F

    move-result v0

    invoke-static {v14, v5, v6, v0}, Lcom/google/crypto/tink/shaded/protobuf/o0;->O(Ljava/lang/Object;JF)V

    add-int/lit8 v0, v10, 0x4

    goto/16 :goto_9

    :pswitch_c
    move/from16 v18, p3

    move-object/from16 v11, p5

    move v8, v2

    move v10, v4

    move v0, v5

    move/from16 p3, v6

    move-wide/from16 v5, v22

    if-ne v3, v0, :cond_b

    invoke-static {v12, v10}, Lcom/google/crypto/tink/shaded/protobuf/e;->d([BI)D

    move-result-wide v0

    invoke-static {v14, v5, v6, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->N(Ljava/lang/Object;JD)V

    goto :goto_b

    :cond_b
    :goto_c
    move/from16 v6, p3

    move/from16 v27, v8

    move-object/from16 v28, v9

    move v2, v10

    const/16 v19, -0x1

    goto/16 :goto_12

    :cond_c
    move/from16 v18, p3

    move v8, v2

    move/from16 v20, v6

    move-wide v5, v10

    move-object/from16 v11, p5

    move v10, v4

    const/16 v2, 0x1b

    if-ne v0, v2, :cond_10

    const/4 v2, 0x2

    if-ne v3, v2, :cond_f

    invoke-virtual {v9, v14, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/z$d;

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->p()Z

    move-result v1

    if-nez v1, :cond_e

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_d

    const/16 v1, 0xa

    goto :goto_d

    :cond_d
    mul-int/lit8 v1, v1, 0x2

    :goto_d
    invoke-interface {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->h(I)Lcom/google/crypto/tink/shaded/protobuf/z$d;

    move-result-object v0

    invoke-virtual {v9, v14, v5, v6, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_e
    move-object v5, v0

    invoke-virtual {v15, v8}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v0

    move/from16 v1, v17

    move-object/from16 v2, p2

    move v3, v10

    move/from16 v4, p4

    move/from16 v10, v20

    move-object/from16 v6, p5

    invoke-static/range {v0 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/e;->p(Lcom/google/crypto/tink/shaded/protobuf/e0;I[BIILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    move v2, v8

    move v6, v10

    goto/16 :goto_4

    :cond_f
    move/from16 v22, v7

    move/from16 v27, v8

    move-object/from16 v28, v9

    move v15, v10

    move/from16 v26, v20

    const/16 v19, -0x1

    goto/16 :goto_11

    :cond_10
    move/from16 v4, v20

    const/16 v2, 0x31

    if-gt v0, v2, :cond_12

    int-to-long v1, v1

    move/from16 p3, v0

    move-object/from16 v0, p0

    move-wide/from16 v20, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v23, v3

    move v3, v10

    move v15, v4

    move/from16 v4, p4

    move-wide/from16 v24, v5

    move/from16 v5, v17

    move/from16 v6, v18

    move/from16 v26, v15

    move v15, v7

    move/from16 v7, v23

    move/from16 v27, v8

    const/16 v19, -0x1

    move-object/from16 v28, v9

    move/from16 v22, v15

    move v15, v10

    move-wide/from16 v9, v20

    move/from16 v11, p3

    move-wide/from16 v12, v24

    move-object/from16 v14, p5

    invoke-virtual/range {v0 .. v14}, Lcom/google/crypto/tink/shaded/protobuf/S;->h0(Ljava/lang/Object;[BIIIIIIJIJLcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    if-eq v0, v15, :cond_11

    :goto_e
    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move-object/from16 v12, p2

    move/from16 v13, p4

    move-object/from16 v11, p5

    move/from16 v1, v18

    move/from16 v8, v19

    move/from16 v7, v22

    move/from16 v6, v26

    :goto_f
    move/from16 v2, v27

    move-object/from16 v9, v28

    goto/16 :goto_0

    :cond_11
    move v2, v0

    :goto_10
    move/from16 v7, v22

    move/from16 v6, v26

    goto :goto_12

    :cond_12
    move/from16 p3, v0

    move/from16 v23, v3

    move/from16 v26, v4

    move-wide/from16 v24, v5

    move/from16 v22, v7

    move/from16 v27, v8

    move-object/from16 v28, v9

    move v15, v10

    const/16 v19, -0x1

    const/16 v0, 0x32

    move/from16 v9, p3

    move/from16 v7, v23

    if-ne v9, v0, :cond_14

    const/4 v0, 0x2

    if-ne v7, v0, :cond_13

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v15

    move/from16 v4, p4

    move/from16 v5, v27

    move-wide/from16 v6, v24

    move-object/from16 v8, p5

    invoke-virtual/range {v0 .. v8}, Lcom/google/crypto/tink/shaded/protobuf/S;->d0(Ljava/lang/Object;[BIIIJLcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    if-eq v0, v15, :cond_11

    goto :goto_e

    :cond_13
    :goto_11
    move v2, v15

    goto :goto_10

    :cond_14
    move-object/from16 v0, p0

    move v8, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v15

    move/from16 v4, p4

    move/from16 v5, v17

    move/from16 v6, v18

    move-wide/from16 v10, v24

    move/from16 v12, v27

    move-object/from16 v13, p5

    invoke-virtual/range {v0 .. v13}, Lcom/google/crypto/tink/shaded/protobuf/S;->e0(Ljava/lang/Object;[BIIIIIIIJILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    if-eq v0, v15, :cond_11

    goto :goto_e

    :goto_12
    invoke-static/range {p1 .. p1}, Lcom/google/crypto/tink/shaded/protobuf/S;->v(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/l0;

    move-result-object v4

    move/from16 v0, v17

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v5, p5

    invoke-static/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/e;->F(I[BIILcom/google/crypto/tink/shaded/protobuf/l0;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v0

    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move-object/from16 v12, p2

    move/from16 v13, p4

    move-object/from16 v11, p5

    move/from16 v1, v18

    move/from16 v8, v19

    goto :goto_f

    :cond_15
    move/from16 v26, v6

    move-object/from16 v28, v9

    const v1, 0xfffff

    if-eq v7, v1, :cond_16

    int-to-long v1, v7

    move-object/from16 v3, p1

    move/from16 v6, v26

    move-object/from16 v4, v28

    invoke-virtual {v4, v3, v1, v2, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_16
    move/from16 v1, p4

    if-ne v0, v1, :cond_17

    return v0

    :cond_17
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/A;->h()Lcom/google/crypto/tink/shaded/protobuf/A;

    move-result-object v0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public h(Ljava/lang/Object;[BIILcom/google/crypto/tink/shaded/protobuf/e$a;)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->h:Z

    if-eqz v0, :cond_0

    invoke-virtual/range {p0 .. p5}, Lcom/google/crypto/tink/shaded/protobuf/S;->g0(Ljava/lang/Object;[BIILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v7, p5

    invoke-virtual/range {v1 .. v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->f0(Ljava/lang/Object;[BIIILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    :goto_0
    return-void
.end method

.method public final h0(Ljava/lang/Object;[BIIIIIIJIJLcom/google/crypto/tink/shaded/protobuf/e$a;)I
    .locals 13

    .line 1
    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move/from16 v4, p3

    move/from16 v2, p7

    move/from16 v8, p8

    move-wide/from16 v5, p12

    move-object/from16 v7, p14

    sget-object v9, Lcom/google/crypto/tink/shaded/protobuf/S;->s:Lsun/misc/Unsafe;

    invoke-virtual {v9, p1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/crypto/tink/shaded/protobuf/z$d;

    invoke-interface {v10}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->p()Z

    move-result v11

    const/4 v12, 0x2

    if-nez v11, :cond_1

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v11

    if-nez v11, :cond_0

    const/16 v11, 0xa

    goto :goto_0

    :cond_0
    mul-int/2addr v11, v12

    :goto_0
    invoke-interface {v10, v11}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->h(I)Lcom/google/crypto/tink/shaded/protobuf/z$d;

    move-result-object v10

    invoke-virtual {v9, p1, v5, v6, v10}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_1
    const/4 v5, 0x1

    const/4 v6, 0x5

    packed-switch p11, :pswitch_data_0

    goto/16 :goto_2

    :pswitch_0
    const/4 v1, 0x3

    if-ne v2, v1, :cond_d

    invoke-virtual {p0, v8}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v1

    move-object/from16 p6, v1

    move/from16 p7, p5

    move-object/from16 p8, p2

    move/from16 p9, p3

    move/from16 p10, p4

    move-object/from16 p11, v10

    move-object/from16 p12, p14

    invoke-static/range {p6 .. p12}, Lcom/google/crypto/tink/shaded/protobuf/e;->n(Lcom/google/crypto/tink/shaded/protobuf/e0;I[BIILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    goto/16 :goto_3

    :pswitch_1
    if-ne v2, v12, :cond_2

    invoke-static {p2, v4, v10, v7}, Lcom/google/crypto/tink/shaded/protobuf/e;->w([BILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    goto/16 :goto_3

    :cond_2
    if-nez v2, :cond_d

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v10

    move-object/from16 p10, p14

    invoke-static/range {p5 .. p10}, Lcom/google/crypto/tink/shaded/protobuf/e;->A(I[BIILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    goto/16 :goto_3

    :pswitch_2
    if-ne v2, v12, :cond_3

    invoke-static {p2, v4, v10, v7}, Lcom/google/crypto/tink/shaded/protobuf/e;->v([BILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    goto/16 :goto_3

    :cond_3
    if-nez v2, :cond_d

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v10

    move-object/from16 p10, p14

    invoke-static/range {p5 .. p10}, Lcom/google/crypto/tink/shaded/protobuf/e;->z(I[BIILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    goto/16 :goto_3

    :pswitch_3
    if-ne v2, v12, :cond_4

    invoke-static {p2, v4, v10, v7}, Lcom/google/crypto/tink/shaded/protobuf/e;->x([BILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v2

    goto :goto_1

    :cond_4
    if-nez v2, :cond_d

    move/from16 v2, p5

    move-object v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object v6, v10

    move-object/from16 v7, p14

    invoke-static/range {v2 .. v7}, Lcom/google/crypto/tink/shaded/protobuf/e;->I(I[BIILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v2

    :goto_1
    invoke-virtual {p0, v8}, Lcom/google/crypto/tink/shaded/protobuf/S;->s(I)Lcom/google/crypto/tink/shaded/protobuf/z$c;

    const/4 v3, 0x0

    iget-object v4, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->o:Lcom/google/crypto/tink/shaded/protobuf/k0;

    const/4 v5, 0x0

    move-object/from16 p7, p1

    move/from16 p8, p6

    move-object/from16 p9, v10

    move-object/from16 p10, v5

    move-object/from16 p11, v3

    move-object/from16 p12, v4

    invoke-static/range {p7 .. p12}, Lcom/google/crypto/tink/shaded/protobuf/g0;->z(Ljava/lang/Object;ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/z$c;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/k0;)Ljava/lang/Object;

    move v1, v2

    goto/16 :goto_3

    :pswitch_4
    if-ne v2, v12, :cond_d

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v10

    move-object/from16 p10, p14

    invoke-static/range {p5 .. p10}, Lcom/google/crypto/tink/shaded/protobuf/e;->c(I[BIILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    goto/16 :goto_3

    :pswitch_5
    if-ne v2, v12, :cond_d

    invoke-virtual {p0, v8}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v1

    move-object/from16 p6, v1

    move/from16 p7, p5

    move-object/from16 p8, p2

    move/from16 p9, p3

    move/from16 p10, p4

    move-object/from16 p11, v10

    move-object/from16 p12, p14

    invoke-static/range {p6 .. p12}, Lcom/google/crypto/tink/shaded/protobuf/e;->p(Lcom/google/crypto/tink/shaded/protobuf/e0;I[BIILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    goto/16 :goto_3

    :pswitch_6
    if-ne v2, v12, :cond_d

    const-wide/32 v1, 0x20000000

    and-long v1, p9, v1

    const-wide/16 v5, 0x0

    cmp-long v1, v1, v5

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v10

    move-object/from16 p10, p14

    if-nez v1, :cond_5

    invoke-static/range {p5 .. p10}, Lcom/google/crypto/tink/shaded/protobuf/e;->C(I[BIILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    goto/16 :goto_3

    :cond_5
    invoke-static/range {p5 .. p10}, Lcom/google/crypto/tink/shaded/protobuf/e;->D(I[BIILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    goto/16 :goto_3

    :pswitch_7
    if-ne v2, v12, :cond_6

    invoke-static {p2, v4, v10, v7}, Lcom/google/crypto/tink/shaded/protobuf/e;->q([BILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    goto/16 :goto_3

    :cond_6
    if-nez v2, :cond_d

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v10

    move-object/from16 p10, p14

    invoke-static/range {p5 .. p10}, Lcom/google/crypto/tink/shaded/protobuf/e;->a(I[BIILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    goto/16 :goto_3

    :pswitch_8
    if-ne v2, v12, :cond_7

    invoke-static {p2, v4, v10, v7}, Lcom/google/crypto/tink/shaded/protobuf/e;->s([BILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    goto/16 :goto_3

    :cond_7
    if-ne v2, v6, :cond_d

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v10

    move-object/from16 p10, p14

    invoke-static/range {p5 .. p10}, Lcom/google/crypto/tink/shaded/protobuf/e;->h(I[BIILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    goto/16 :goto_3

    :pswitch_9
    if-ne v2, v12, :cond_8

    invoke-static {p2, v4, v10, v7}, Lcom/google/crypto/tink/shaded/protobuf/e;->t([BILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    goto/16 :goto_3

    :cond_8
    if-ne v2, v5, :cond_d

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v10

    move-object/from16 p10, p14

    invoke-static/range {p5 .. p10}, Lcom/google/crypto/tink/shaded/protobuf/e;->j(I[BIILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    goto/16 :goto_3

    :pswitch_a
    if-ne v2, v12, :cond_9

    invoke-static {p2, v4, v10, v7}, Lcom/google/crypto/tink/shaded/protobuf/e;->x([BILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    goto/16 :goto_3

    :cond_9
    if-nez v2, :cond_d

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v10

    move-object/from16 p10, p14

    invoke-static/range {p5 .. p10}, Lcom/google/crypto/tink/shaded/protobuf/e;->I(I[BIILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    goto :goto_3

    :pswitch_b
    if-ne v2, v12, :cond_a

    invoke-static {p2, v4, v10, v7}, Lcom/google/crypto/tink/shaded/protobuf/e;->y([BILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    goto :goto_3

    :cond_a
    if-nez v2, :cond_d

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v10

    move-object/from16 p10, p14

    invoke-static/range {p5 .. p10}, Lcom/google/crypto/tink/shaded/protobuf/e;->L(I[BIILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    goto :goto_3

    :pswitch_c
    if-ne v2, v12, :cond_b

    invoke-static {p2, v4, v10, v7}, Lcom/google/crypto/tink/shaded/protobuf/e;->u([BILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    goto :goto_3

    :cond_b
    if-ne v2, v6, :cond_d

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v10

    move-object/from16 p10, p14

    invoke-static/range {p5 .. p10}, Lcom/google/crypto/tink/shaded/protobuf/e;->l(I[BIILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    goto :goto_3

    :pswitch_d
    if-ne v2, v12, :cond_c

    invoke-static {p2, v4, v10, v7}, Lcom/google/crypto/tink/shaded/protobuf/e;->r([BILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    goto :goto_3

    :cond_c
    if-ne v2, v5, :cond_d

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v10

    move-object/from16 p10, p14

    invoke-static/range {p5 .. p10}, Lcom/google/crypto/tink/shaded/protobuf/e;->e(I[BIILcom/google/crypto/tink/shaded/protobuf/z$d;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result v1

    goto :goto_3

    :cond_d
    :goto_2
    move v1, v4

    :goto_3
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public i(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 2

    .line 1
    invoke-interface {p2}, Lcom/google/crypto/tink/shaded/protobuf/r0;->v()Lcom/google/crypto/tink/shaded/protobuf/r0$a;

    move-result-object v0

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/r0$a;->p:Lcom/google/crypto/tink/shaded/protobuf/r0$a;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->z0(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->h:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->y0(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->x0(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    :goto_0
    return-void
.end method

.method public final i0(I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->c:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->d:I

    if-gt p1, v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/S;->s0(II)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public j(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/d0;Lcom/google/crypto/tink/shaded/protobuf/p;)V
    .locals 6

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/S;->m(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->o:Lcom/google/crypto/tink/shaded/protobuf/k0;

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->p:Lcom/google/crypto/tink/shaded/protobuf/q;

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->M(Lcom/google/crypto/tink/shaded/protobuf/k0;Lcom/google/crypto/tink/shaded/protobuf/q;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/d0;Lcom/google/crypto/tink/shaded/protobuf/p;)V

    return-void
.end method

.method public final j0(II)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->c:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->d:I

    if-gt p1, v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->s0(II)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final k(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result p1

    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final k0(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    add-int/lit8 p1, p1, 0x2

    aget p1, v0, p1

    return p1
.end method

.method public final l0(Ljava/lang/Object;JLcom/google/crypto/tink/shaded/protobuf/d0;Lcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/p;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object p1

    invoke-interface {p4, p1, p5, p6}, Lcom/google/crypto/tink/shaded/protobuf/d0;->N(Ljava/util/List;Lcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/p;)V

    return-void
.end method

.method public final m0(Ljava/lang/Object;ILcom/google/crypto/tink/shaded/protobuf/d0;Lcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/p;)V
    .locals 2

    .line 1
    invoke-static {p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v0

    iget-object p2, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-virtual {p2, p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object p1

    invoke-interface {p3, p1, p4, p5}, Lcom/google/crypto/tink/shaded/protobuf/d0;->K(Ljava/util/List;Lcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/p;)V

    return-void
.end method

.method public final n([BIILcom/google/crypto/tink/shaded/protobuf/H$a;Ljava/util/Map;Lcom/google/crypto/tink/shaded/protobuf/e$a;)I
    .locals 0

    .line 1
    invoke-static {p1, p2, p6}, Lcom/google/crypto/tink/shaded/protobuf/e;->H([BILcom/google/crypto/tink/shaded/protobuf/e$a;)I

    move-result p1

    iget p2, p6, Lcom/google/crypto/tink/shaded/protobuf/e$a;->a:I

    if-ltz p2, :cond_1

    sub-int/2addr p3, p1

    if-le p2, p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/A;->m()Lcom/google/crypto/tink/shaded/protobuf/A;

    move-result-object p1

    throw p1
.end method

.method public final n0(Ljava/lang/Object;ILcom/google/crypto/tink/shaded/protobuf/d0;)V
    .locals 2

    .line 1
    invoke-static {p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->A(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v0

    invoke-interface {p3}, Lcom/google/crypto/tink/shaded/protobuf/d0;->F()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-static {p1, v0, v1, p2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->g:Z

    if-eqz v0, :cond_1

    invoke-static {p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v0

    invoke-interface {p3}, Lcom/google/crypto/tink/shaded/protobuf/d0;->m()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_1
    invoke-static {p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v0

    invoke-interface {p3}, Lcom/google/crypto/tink/shaded/protobuf/d0;->u()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p2

    goto :goto_0

    :goto_1
    return-void
.end method

.method public final o0(Ljava/lang/Object;ILcom/google/crypto/tink/shaded/protobuf/d0;)V
    .locals 3

    .line 1
    invoke-static {p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->A(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->t(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->n:Lcom/google/crypto/tink/shaded/protobuf/E;

    invoke-static {p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->q(Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public final p(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 7

    .line 1
    invoke-virtual {p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->w0(I)I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/S;->v0(I)I

    move-result v0

    const/4 v3, 0x0

    const/4 v4, 0x1

    packed-switch v0, :pswitch_data_0

    return v4

    :pswitch_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->H(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/g0;->J(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move v3, v4

    :cond_0
    return v3

    :pswitch_1
    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/g0;->J(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->k(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/g0;->J(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    move v3, v4

    :cond_1
    return v3

    :pswitch_3
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->k(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->A(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->A(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, v5, p1

    if-nez p1, :cond_2

    move v3, v4

    :cond_2
    return v3

    :pswitch_4
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->k(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p1

    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p2

    if-ne p1, p2, :cond_3

    move v3, v4

    :cond_3
    return v3

    :pswitch_5
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->k(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->A(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->A(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, v5, p1

    if-nez p1, :cond_4

    move v3, v4

    :cond_4
    return v3

    :pswitch_6
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->k(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p1

    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p2

    if-ne p1, p2, :cond_5

    move v3, v4

    :cond_5
    return v3

    :pswitch_7
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->k(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p1

    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p2

    if-ne p1, p2, :cond_6

    move v3, v4

    :cond_6
    return v3

    :pswitch_8
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->k(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p1

    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p2

    if-ne p1, p2, :cond_7

    move v3, v4

    :cond_7
    return v3

    :pswitch_9
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->k(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_8

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/g0;->J(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    move v3, v4

    :cond_8
    return v3

    :pswitch_a
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->k(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_9

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/g0;->J(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    move v3, v4

    :cond_9
    return v3

    :pswitch_b
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->k(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_a

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/g0;->J(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    move v3, v4

    :cond_a
    return v3

    :pswitch_c
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->k(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_b

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->r(Ljava/lang/Object;J)Z

    move-result p1

    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->r(Ljava/lang/Object;J)Z

    move-result p2

    if-ne p1, p2, :cond_b

    move v3, v4

    :cond_b
    return v3

    :pswitch_d
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->k(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_c

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p1

    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p2

    if-ne p1, p2, :cond_c

    move v3, v4

    :cond_c
    return v3

    :pswitch_e
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->k(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_d

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->A(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->A(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, v5, p1

    if-nez p1, :cond_d

    move v3, v4

    :cond_d
    return v3

    :pswitch_f
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->k(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_e

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p1

    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result p2

    if-ne p1, p2, :cond_e

    move v3, v4

    :cond_e
    return v3

    :pswitch_10
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->k(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_f

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->A(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->A(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, v5, p1

    if-nez p1, :cond_f

    move v3, v4

    :cond_f
    return v3

    :pswitch_11
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->k(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_10

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->A(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->A(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, v5, p1

    if-nez p1, :cond_10

    move v3, v4

    :cond_10
    return v3

    :pswitch_12
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->k(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_11

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->y(Ljava/lang/Object;J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p1

    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->y(Ljava/lang/Object;J)F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p2

    if-ne p1, p2, :cond_11

    move v3, v4

    :cond_11
    return v3

    :pswitch_13
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->k(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_12

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->x(Ljava/lang/Object;J)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    invoke-static {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->x(Ljava/lang/Object;J)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p1

    cmp-long p1, v5, p1

    if-nez p1, :cond_12

    move v3, v4

    :cond_12
    return v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/k0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->w0(I)I

    move-result p4

    invoke-static {p4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide p4

    invoke-static {p1, p4, p5}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    return-object p3

    :cond_0
    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->s(I)Lcom/google/crypto/tink/shaded/protobuf/z$c;

    return-object p3
.end method

.method public final q0(Ljava/lang/Object;I)V
    .locals 4

    .line 1
    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->k0(I)I

    move-result p2

    const v0, 0xfffff

    and-int/2addr v0, p2

    int-to-long v0, v0

    const-wide/32 v2, 0xfffff

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    ushr-int/lit8 p2, p2, 0x14

    const/4 v2, 0x1

    shl-int p2, v2, p2

    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result v2

    or-int/2addr p2, v2

    invoke-static {p1, v0, v1, p2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->P(Ljava/lang/Object;JI)V

    return-void
.end method

.method public final r0(Ljava/lang/Object;II)V
    .locals 2

    .line 1
    invoke-virtual {p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->k0(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1, p2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->P(Ljava/lang/Object;JI)V

    return-void
.end method

.method public final s(I)Lcom/google/crypto/tink/shaded/protobuf/z$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->b:[Ljava/lang/Object;

    div-int/lit8 p1, p1, 0x3

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    invoke-static {p1}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final s0(II)I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    array-length v0, v0

    div-int/lit8 v0, v0, 0x3

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-gt p2, v0, :cond_2

    add-int v1, v0, p2

    ushr-int/lit8 v1, v1, 0x1

    mul-int/lit8 v2, v1, 0x3

    invoke-virtual {p0, v2}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v3

    if-ne p1, v3, :cond_0

    return v2

    :cond_0
    if-ge p1, v3, :cond_1

    add-int/lit8 v1, v1, -0x1

    move v0, v1

    goto :goto_0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    move p2, v1

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public final t(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->b:[Ljava/lang/Object;

    div-int/lit8 p1, p1, 0x3

    mul-int/lit8 p1, p1, 0x2

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final t0(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/S;->s:Lsun/misc/Unsafe;

    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->w0(I)I

    move-result v1

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->q0(Ljava/lang/Object;I)V

    return-void
.end method

.method public final u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;
    .locals 3

    .line 1
    div-int/lit8 p1, p1, 0x3

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->b:[Ljava/lang/Object;

    aget-object v0, v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/e0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/a0;->a()Lcom/google/crypto/tink/shaded/protobuf/a0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->b:[Ljava/lang/Object;

    add-int/lit8 v2, p1, 0x1

    aget-object v1, v1, v2

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/a0;->c(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->b:[Ljava/lang/Object;

    aput-object v0, v1, p1

    return-object v0
.end method

.method public final u0(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/S;->s:Lsun/misc/Unsafe;

    invoke-virtual {p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->w0(I)I

    move-result v1

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2, p4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->r0(Ljava/lang/Object;II)V

    return-void
.end method

.method public final w(Ljava/lang/Object;)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/S;->s:Lsun/misc/Unsafe;

    const v4, 0xfffff

    move v7, v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_0
    iget-object v9, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    array-length v9, v9

    if-ge v5, v9, :cond_8

    invoke-virtual {v0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->w0(I)I

    move-result v9

    invoke-virtual {v0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v10

    invoke-static {v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->v0(I)I

    move-result v11

    const/16 v12, 0x11

    const/4 v13, 0x1

    if-gt v11, v12, :cond_0

    iget-object v12, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    add-int/lit8 v14, v5, 0x2

    aget v12, v12, v14

    and-int v14, v12, v4

    ushr-int/lit8 v15, v12, 0x14

    shl-int v15, v13, v15

    if-eq v14, v7, :cond_2

    int-to-long v7, v14

    invoke-virtual {v2, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v8

    move v7, v14

    goto :goto_2

    :cond_0
    iget-boolean v12, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v12, :cond_1

    sget-object v12, Lcom/google/crypto/tink/shaded/protobuf/u;->c0:Lcom/google/crypto/tink/shaded/protobuf/u;

    invoke-virtual {v12}, Lcom/google/crypto/tink/shaded/protobuf/u;->c()I

    move-result v12

    if-lt v11, v12, :cond_1

    sget-object v12, Lcom/google/crypto/tink/shaded/protobuf/u;->p0:Lcom/google/crypto/tink/shaded/protobuf/u;

    invoke-virtual {v12}, Lcom/google/crypto/tink/shaded/protobuf/u;->c()I

    move-result v12

    if-gt v11, v12, :cond_1

    iget-object v12, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    add-int/lit8 v14, v5, 0x2

    aget v12, v12, v14

    and-int/2addr v12, v4

    :goto_1
    const/4 v15, 0x0

    goto :goto_2

    :cond_1
    const/4 v12, 0x0

    goto :goto_1

    :cond_2
    :goto_2
    invoke-static {v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v13

    const/4 v9, 0x0

    const-wide/16 v3, 0x0

    packed-switch v11, :pswitch_data_0

    goto :goto_5

    :pswitch_0
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    :goto_3
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/crypto/tink/shaded/protobuf/O;

    invoke-virtual {v0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v4

    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/k;->r(ILcom/google/crypto/tink/shaded/protobuf/O;Lcom/google/crypto/tink/shaded/protobuf/e0;)I

    move-result v3

    :goto_4
    add-int/2addr v6, v3

    :cond_3
    :goto_5
    const/4 v11, 0x0

    goto/16 :goto_13

    :pswitch_1
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v1, v13, v14}, Lcom/google/crypto/tink/shaded/protobuf/S;->c0(Ljava/lang/Object;J)J

    move-result-wide v3

    :goto_6
    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/k;->H(IJ)I

    move-result v3

    goto :goto_4

    :pswitch_2
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v1, v13, v14}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v3

    :goto_7
    invoke-static {v10, v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->F(II)I

    move-result v3

    goto :goto_4

    :pswitch_3
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    :goto_8
    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/k;->D(IJ)I

    move-result v3

    goto :goto_4

    :pswitch_4
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    :goto_9
    const/4 v3, 0x0

    invoke-static {v10, v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->B(II)I

    move-result v4

    :goto_a
    add-int/2addr v6, v4

    goto :goto_5

    :pswitch_5
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v1, v13, v14}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v3

    :goto_b
    invoke-static {v10, v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->j(II)I

    move-result v3

    goto :goto_4

    :pswitch_6
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v1, v13, v14}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v3

    :goto_c
    invoke-static {v10, v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->M(II)I

    move-result v3

    goto :goto_4

    :pswitch_7
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    :goto_d
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-static {v10, v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->f(ILcom/google/crypto/tink/shaded/protobuf/h;)I

    move-result v3

    goto :goto_4

    :pswitch_8
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    :goto_e
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v4

    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->o(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/e0;)I

    move-result v3

    goto :goto_4

    :pswitch_9
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lcom/google/crypto/tink/shaded/protobuf/h;

    if-eqz v4, :cond_4

    check-cast v3, Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-static {v10, v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->f(ILcom/google/crypto/tink/shaded/protobuf/h;)I

    move-result v3

    goto/16 :goto_4

    :cond_4
    check-cast v3, Ljava/lang/String;

    invoke-static {v10, v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->J(ILjava/lang/String;)I

    move-result v3

    goto/16 :goto_4

    :pswitch_a
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    :goto_f
    const/4 v3, 0x1

    invoke-static {v10, v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->d(IZ)I

    move-result v3

    goto/16 :goto_4

    :pswitch_b
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v3, 0x0

    invoke-static {v10, v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->l(II)I

    move-result v4

    goto :goto_a

    :pswitch_c
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/k;->n(IJ)I

    move-result v3

    goto/16 :goto_4

    :pswitch_d
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v1, v13, v14}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {v10, v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->t(II)I

    move-result v3

    goto/16 :goto_4

    :pswitch_e
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v1, v13, v14}, Lcom/google/crypto/tink/shaded/protobuf/S;->c0(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/k;->O(IJ)I

    move-result v3

    goto/16 :goto_4

    :pswitch_f
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v1, v13, v14}, Lcom/google/crypto/tink/shaded/protobuf/S;->c0(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/k;->v(IJ)I

    move-result v3

    goto/16 :goto_4

    :pswitch_10
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v10, v9}, Lcom/google/crypto/tink/shaded/protobuf/k;->p(IF)I

    move-result v3

    goto/16 :goto_4

    :pswitch_11
    invoke-virtual {v0, v1, v10, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    const-wide/16 v3, 0x0

    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/k;->h(ID)I

    move-result v3

    goto/16 :goto_4

    :pswitch_12
    iget-object v3, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->q:Lcom/google/crypto/tink/shaded/protobuf/J;

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->t(I)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v3, v10, v4, v9}, Lcom/google/crypto/tink/shaded/protobuf/J;->b(ILjava/lang/Object;Ljava/lang/Object;)I

    move-result v3

    goto/16 :goto_4

    :pswitch_13
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v4

    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->j(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/e0;)I

    move-result v3

    goto/16 :goto_4

    :pswitch_14
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->t(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    iget-boolean v4, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v4, :cond_5

    :goto_10
    int-to-long v12, v12

    invoke-virtual {v2, v1, v12, v13, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_5
    invoke-static {v10}, Lcom/google/crypto/tink/shaded/protobuf/k;->L(I)I

    move-result v4

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->N(I)I

    move-result v9

    add-int/2addr v4, v9

    add-int/2addr v4, v3

    goto/16 :goto_a

    :pswitch_15
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->r(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    iget-boolean v4, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v4, :cond_5

    goto :goto_10

    :pswitch_16
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->i(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    iget-boolean v4, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v4, :cond_5

    goto :goto_10

    :pswitch_17
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->g(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    iget-boolean v4, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v4, :cond_5

    goto :goto_10

    :pswitch_18
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->e(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    iget-boolean v4, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v4, :cond_5

    goto :goto_10

    :pswitch_19
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->w(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    iget-boolean v4, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v4, :cond_5

    goto :goto_10

    :pswitch_1a
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->b(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    iget-boolean v4, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v4, :cond_5

    goto :goto_10

    :pswitch_1b
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->g(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    iget-boolean v4, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v4, :cond_5

    goto/16 :goto_10

    :pswitch_1c
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->i(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    iget-boolean v4, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v4, :cond_5

    goto/16 :goto_10

    :pswitch_1d
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->l(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    iget-boolean v4, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v4, :cond_5

    goto/16 :goto_10

    :pswitch_1e
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->y(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    iget-boolean v4, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v4, :cond_5

    goto/16 :goto_10

    :pswitch_1f
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->n(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    iget-boolean v4, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v4, :cond_5

    goto/16 :goto_10

    :pswitch_20
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->g(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    iget-boolean v4, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v4, :cond_5

    goto/16 :goto_10

    :pswitch_21
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->i(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    iget-boolean v4, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v4, :cond_5

    goto/16 :goto_10

    :pswitch_22
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const/4 v4, 0x0

    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->s(ILjava/util/List;Z)I

    move-result v3

    :goto_11
    add-int/2addr v6, v3

    move v11, v4

    goto/16 :goto_13

    :pswitch_23
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->q(ILjava/util/List;Z)I

    move-result v3

    goto :goto_11

    :pswitch_24
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->h(ILjava/util/List;Z)I

    move-result v3

    goto :goto_11

    :pswitch_25
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->f(ILjava/util/List;Z)I

    move-result v3

    goto :goto_11

    :pswitch_26
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->d(ILjava/util/List;Z)I

    move-result v3

    goto :goto_11

    :pswitch_27
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->v(ILjava/util/List;Z)I

    move-result v3

    goto/16 :goto_4

    :pswitch_28
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->c(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_4

    :pswitch_29
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v4

    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->p(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/e0;)I

    move-result v3

    goto/16 :goto_4

    :pswitch_2a
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->u(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_4

    :pswitch_2b
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const/4 v4, 0x0

    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->a(ILjava/util/List;Z)I

    move-result v3

    goto :goto_11

    :pswitch_2c
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->k(ILjava/util/List;Z)I

    move-result v3

    goto/16 :goto_11

    :pswitch_2d
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->x(ILjava/util/List;Z)I

    move-result v3

    goto/16 :goto_11

    :pswitch_2e
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->m(ILjava/util/List;Z)I

    move-result v3

    goto/16 :goto_11

    :pswitch_2f
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->h(ILjava/util/List;Z)I

    move-result v3

    goto/16 :goto_4

    :pswitch_30
    and-int v3, v8, v15

    if-eqz v3, :cond_3

    goto/16 :goto_3

    :pswitch_31
    and-int v3, v8, v15

    if-eqz v3, :cond_3

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    goto/16 :goto_6

    :pswitch_32
    and-int v3, v8, v15

    if-eqz v3, :cond_3

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_7

    :pswitch_33
    and-int v11, v8, v15

    if-eqz v11, :cond_3

    goto/16 :goto_8

    :pswitch_34
    and-int v3, v8, v15

    if-eqz v3, :cond_3

    goto/16 :goto_9

    :pswitch_35
    and-int v3, v8, v15

    if-eqz v3, :cond_3

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_b

    :pswitch_36
    and-int v3, v8, v15

    if-eqz v3, :cond_3

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_c

    :pswitch_37
    and-int v3, v8, v15

    if-eqz v3, :cond_3

    goto/16 :goto_d

    :pswitch_38
    and-int v3, v8, v15

    if-eqz v3, :cond_3

    goto/16 :goto_e

    :pswitch_39
    and-int v3, v8, v15

    if-eqz v3, :cond_3

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lcom/google/crypto/tink/shaded/protobuf/h;

    if-eqz v4, :cond_6

    check-cast v3, Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-static {v10, v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->f(ILcom/google/crypto/tink/shaded/protobuf/h;)I

    move-result v3

    goto/16 :goto_4

    :cond_6
    check-cast v3, Ljava/lang/String;

    invoke-static {v10, v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->J(ILjava/lang/String;)I

    move-result v3

    goto/16 :goto_4

    :pswitch_3a
    and-int v3, v8, v15

    if-eqz v3, :cond_3

    goto/16 :goto_f

    :pswitch_3b
    and-int v3, v8, v15

    if-eqz v3, :cond_3

    const/4 v11, 0x0

    invoke-static {v10, v11}, Lcom/google/crypto/tink/shaded/protobuf/k;->l(II)I

    move-result v3

    :goto_12
    add-int/2addr v6, v3

    goto :goto_13

    :pswitch_3c
    const/4 v11, 0x0

    and-int v9, v8, v15

    if-eqz v9, :cond_7

    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/k;->n(IJ)I

    move-result v3

    goto :goto_12

    :pswitch_3d
    const/4 v11, 0x0

    and-int v3, v8, v15

    if-eqz v3, :cond_7

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {v10, v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->t(II)I

    move-result v3

    goto :goto_12

    :pswitch_3e
    const/4 v11, 0x0

    and-int v3, v8, v15

    if-eqz v3, :cond_7

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/k;->O(IJ)I

    move-result v3

    goto :goto_12

    :pswitch_3f
    const/4 v11, 0x0

    and-int v3, v8, v15

    if-eqz v3, :cond_7

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/k;->v(IJ)I

    move-result v3

    goto :goto_12

    :pswitch_40
    const/4 v11, 0x0

    and-int v3, v8, v15

    if-eqz v3, :cond_7

    invoke-static {v10, v9}, Lcom/google/crypto/tink/shaded/protobuf/k;->p(IF)I

    move-result v3

    goto :goto_12

    :pswitch_41
    const/4 v11, 0x0

    and-int v3, v8, v15

    if-eqz v3, :cond_7

    const-wide/16 v3, 0x0

    invoke-static {v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/k;->h(ID)I

    move-result v3

    goto :goto_12

    :cond_7
    :goto_13
    add-int/lit8 v5, v5, 0x3

    const v4, 0xfffff

    goto/16 :goto_0

    :cond_8
    iget-object v2, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->o:Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-virtual {v0, v2, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->y(Lcom/google/crypto/tink/shaded/protobuf/k0;Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v6, v2

    iget-boolean v2, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->f:Z

    if-eqz v2, :cond_9

    iget-object v2, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->p:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/shaded/protobuf/q;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/t;->c()I

    move-result v1

    add-int/2addr v6, v1

    :cond_9
    return v6

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_25
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_24
        :pswitch_25
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final w0(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    return p1
.end method

.method public final x(Ljava/lang/Object;)I
    .locals 15

    .line 1
    move-object v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/S;->s:Lsun/misc/Unsafe;

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    iget-object v6, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    array-length v6, v6

    if-ge v4, v6, :cond_4

    invoke-virtual {p0, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->w0(I)I

    move-result v6

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->v0(I)I

    move-result v7

    invoke-virtual {p0, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v8

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v9

    sget-object v6, Lcom/google/crypto/tink/shaded/protobuf/u;->c0:Lcom/google/crypto/tink/shaded/protobuf/u;

    invoke-virtual {v6}, Lcom/google/crypto/tink/shaded/protobuf/u;->c()I

    move-result v6

    if-lt v7, v6, :cond_0

    sget-object v6, Lcom/google/crypto/tink/shaded/protobuf/u;->p0:Lcom/google/crypto/tink/shaded/protobuf/u;

    invoke-virtual {v6}, Lcom/google/crypto/tink/shaded/protobuf/u;->c()I

    move-result v6

    if-gt v7, v6, :cond_0

    iget-object v6, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    add-int/lit8 v11, v4, 0x2

    aget v6, v6, v11

    const v11, 0xfffff

    and-int/2addr v6, v11

    goto :goto_1

    :cond_0
    move v6, v3

    :goto_1
    const/4 v13, 0x0

    const/4 v14, 0x1

    const-wide/16 v11, 0x0

    packed-switch v7, :pswitch_data_0

    goto/16 :goto_17

    :pswitch_0
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_2
    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/crypto/tink/shaded/protobuf/O;

    invoke-virtual {p0, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v7

    invoke-static {v8, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/k;->r(ILcom/google/crypto/tink/shaded/protobuf/O;Lcom/google/crypto/tink/shaded/protobuf/e0;)I

    move-result v6

    :goto_3
    add-int/2addr v5, v6

    goto/16 :goto_17

    :pswitch_1
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->c0(Ljava/lang/Object;J)J

    move-result-wide v6

    :goto_4
    invoke-static {v8, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/k;->H(IJ)I

    move-result v6

    goto :goto_3

    :pswitch_2
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v6

    :goto_5
    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/k;->F(II)I

    move-result v6

    goto :goto_3

    :pswitch_3
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_6
    invoke-static {v8, v11, v12}, Lcom/google/crypto/tink/shaded/protobuf/k;->D(IJ)I

    move-result v6

    goto :goto_3

    :pswitch_4
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_7
    invoke-static {v8, v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->B(II)I

    move-result v6

    goto :goto_3

    :pswitch_5
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v6

    :goto_8
    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/k;->j(II)I

    move-result v6

    goto :goto_3

    :pswitch_6
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v6

    :goto_9
    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/k;->M(II)I

    move-result v6

    goto :goto_3

    :pswitch_7
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_a
    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    :goto_b
    check-cast v6, Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/k;->f(ILcom/google/crypto/tink/shaded/protobuf/h;)I

    move-result v6

    goto :goto_3

    :pswitch_8
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_c
    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v7

    invoke-static {v8, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->o(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/e0;)I

    move-result v6

    goto :goto_3

    :pswitch_9
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Lcom/google/crypto/tink/shaded/protobuf/h;

    if-eqz v7, :cond_1

    :goto_d
    goto :goto_b

    :cond_1
    check-cast v6, Ljava/lang/String;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/k;->J(ILjava/lang/String;)I

    move-result v6

    goto/16 :goto_3

    :pswitch_a
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_e
    invoke-static {v8, v14}, Lcom/google/crypto/tink/shaded/protobuf/k;->d(IZ)I

    move-result v6

    goto/16 :goto_3

    :pswitch_b
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_f
    invoke-static {v8, v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->l(II)I

    move-result v6

    goto/16 :goto_3

    :pswitch_c
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_10
    invoke-static {v8, v11, v12}, Lcom/google/crypto/tink/shaded/protobuf/k;->n(IJ)I

    move-result v6

    goto/16 :goto_3

    :pswitch_d
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v6

    :goto_11
    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/k;->t(II)I

    move-result v6

    goto/16 :goto_3

    :pswitch_e
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->c0(Ljava/lang/Object;J)J

    move-result-wide v6

    :goto_12
    invoke-static {v8, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/k;->O(IJ)I

    move-result v6

    goto/16 :goto_3

    :pswitch_f
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->c0(Ljava/lang/Object;J)J

    move-result-wide v6

    :goto_13
    invoke-static {v8, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/k;->v(IJ)I

    move-result v6

    goto/16 :goto_3

    :pswitch_10
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_14
    invoke-static {v8, v13}, Lcom/google/crypto/tink/shaded/protobuf/k;->p(IF)I

    move-result v6

    goto/16 :goto_3

    :pswitch_11
    invoke-virtual {p0, v1, v8, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_15
    const-wide/16 v6, 0x0

    invoke-static {v8, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/k;->h(ID)I

    move-result v6

    goto/16 :goto_3

    :pswitch_12
    iget-object v6, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->q:Lcom/google/crypto/tink/shaded/protobuf/J;

    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {p0, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->t(I)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v6, v8, v7, v9}, Lcom/google/crypto/tink/shaded/protobuf/J;->b(ILjava/lang/Object;Ljava/lang/Object;)I

    move-result v6

    goto/16 :goto_3

    :pswitch_13
    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->K(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-virtual {p0, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v7

    invoke-static {v8, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->j(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/e0;)I

    move-result v6

    goto/16 :goto_3

    :pswitch_14
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->t(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v9, :cond_2

    :goto_16
    int-to-long v9, v6

    invoke-virtual {v2, v1, v9, v10, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_2
    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/k;->L(I)I

    move-result v6

    invoke-static {v7}, Lcom/google/crypto/tink/shaded/protobuf/k;->N(I)I

    move-result v8

    add-int/2addr v6, v8

    add-int/2addr v6, v7

    goto/16 :goto_3

    :pswitch_15
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->r(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v9, :cond_2

    goto :goto_16

    :pswitch_16
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->i(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v9, :cond_2

    goto :goto_16

    :pswitch_17
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->g(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v9, :cond_2

    goto :goto_16

    :pswitch_18
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->e(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v9, :cond_2

    goto :goto_16

    :pswitch_19
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->w(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v9, :cond_2

    goto :goto_16

    :pswitch_1a
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->b(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v9, :cond_2

    goto :goto_16

    :pswitch_1b
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->g(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v9, :cond_2

    goto/16 :goto_16

    :pswitch_1c
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->i(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v9, :cond_2

    goto/16 :goto_16

    :pswitch_1d
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->l(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v9, :cond_2

    goto/16 :goto_16

    :pswitch_1e
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->y(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v9, :cond_2

    goto/16 :goto_16

    :pswitch_1f
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->n(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v9, :cond_2

    goto/16 :goto_16

    :pswitch_20
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->g(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v9, :cond_2

    goto/16 :goto_16

    :pswitch_21
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->i(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->i:Z

    if-eqz v9, :cond_2

    goto/16 :goto_16

    :pswitch_22
    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->K(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->s(ILjava/util/List;Z)I

    move-result v6

    goto/16 :goto_3

    :pswitch_23
    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->K(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->q(ILjava/util/List;Z)I

    move-result v6

    goto/16 :goto_3

    :pswitch_24
    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->K(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->h(ILjava/util/List;Z)I

    move-result v6

    goto/16 :goto_3

    :pswitch_25
    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->K(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->f(ILjava/util/List;Z)I

    move-result v6

    goto/16 :goto_3

    :pswitch_26
    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->K(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->d(ILjava/util/List;Z)I

    move-result v6

    goto/16 :goto_3

    :pswitch_27
    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->K(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->v(ILjava/util/List;Z)I

    move-result v6

    goto/16 :goto_3

    :pswitch_28
    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->K(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/g0;->c(ILjava/util/List;)I

    move-result v6

    goto/16 :goto_3

    :pswitch_29
    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->K(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-virtual {p0, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v7

    invoke-static {v8, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->p(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/e0;)I

    move-result v6

    goto/16 :goto_3

    :pswitch_2a
    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->K(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/g0;->u(ILjava/util/List;)I

    move-result v6

    goto/16 :goto_3

    :pswitch_2b
    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->K(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->a(ILjava/util/List;Z)I

    move-result v6

    goto/16 :goto_3

    :pswitch_2c
    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->K(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->k(ILjava/util/List;Z)I

    move-result v6

    goto/16 :goto_3

    :pswitch_2d
    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->K(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->x(ILjava/util/List;Z)I

    move-result v6

    goto/16 :goto_3

    :pswitch_2e
    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->K(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lcom/google/crypto/tink/shaded/protobuf/g0;->m(ILjava/util/List;Z)I

    move-result v6

    goto/16 :goto_3

    :pswitch_2f
    invoke-virtual {p0, v1, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_2

    :pswitch_30
    invoke-virtual {p0, v1, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/o0;->A(Ljava/lang/Object;J)J

    move-result-wide v6

    goto/16 :goto_4

    :pswitch_31
    invoke-virtual {p0, v1, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result v6

    goto/16 :goto_5

    :pswitch_32
    invoke-virtual {p0, v1, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_6

    :pswitch_33
    invoke-virtual {p0, v1, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_7

    :pswitch_34
    invoke-virtual {p0, v1, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result v6

    goto/16 :goto_8

    :pswitch_35
    invoke-virtual {p0, v1, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result v6

    goto/16 :goto_9

    :pswitch_36
    invoke-virtual {p0, v1, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_a

    :pswitch_37
    invoke-virtual {p0, v1, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_c

    :pswitch_38
    invoke-virtual {p0, v1, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Lcom/google/crypto/tink/shaded/protobuf/h;

    if-eqz v7, :cond_1

    goto/16 :goto_d

    :pswitch_39
    invoke-virtual {p0, v1, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_e

    :pswitch_3a
    invoke-virtual {p0, v1, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_f

    :pswitch_3b
    invoke-virtual {p0, v1, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_10

    :pswitch_3c
    invoke-virtual {p0, v1, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/o0;->z(Ljava/lang/Object;J)I

    move-result v6

    goto/16 :goto_11

    :pswitch_3d
    invoke-virtual {p0, v1, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/o0;->A(Ljava/lang/Object;J)J

    move-result-wide v6

    goto/16 :goto_12

    :pswitch_3e
    invoke-virtual {p0, v1, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/o0;->A(Ljava/lang/Object;J)J

    move-result-wide v6

    goto/16 :goto_13

    :pswitch_3f
    invoke-virtual {p0, v1, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_14

    :pswitch_40
    invoke-virtual {p0, v1, v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_15

    :cond_3
    :goto_17
    add-int/lit8 v4, v4, 0x3

    goto/16 :goto_0

    :cond_4
    iget-object v2, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->o:Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-virtual {p0, v2, v1}, Lcom/google/crypto/tink/shaded/protobuf/S;->y(Lcom/google/crypto/tink/shaded/protobuf/k0;Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v5, v1

    return v5

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_24
        :pswitch_25
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_24
        :pswitch_25
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final x0(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-boolean v3, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->f:Z

    if-eqz v3, :cond_0

    iget-object v3, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->p:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v3, v1}, Lcom/google/crypto/tink/shaded/protobuf/q;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/t;->d()Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/t;->f()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    const/4 v5, 0x0

    :goto_0
    iget-object v6, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    array-length v6, v6

    sget-object v7, Lcom/google/crypto/tink/shaded/protobuf/S;->s:Lsun/misc/Unsafe;

    const v8, 0xfffff

    move v11, v8

    const/4 v10, 0x0

    const/4 v12, 0x0

    :goto_1
    if-ge v10, v6, :cond_7

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->w0(I)I

    move-result v13

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v14

    invoke-static {v13}, Lcom/google/crypto/tink/shaded/protobuf/S;->v0(I)I

    move-result v15

    const/16 v4, 0x11

    if-gt v15, v4, :cond_2

    iget-object v4, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    add-int/lit8 v16, v10, 0x2

    aget v4, v4, v16

    and-int v9, v4, v8

    if-eq v9, v11, :cond_1

    int-to-long v11, v9

    invoke-virtual {v7, v1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v12

    move v11, v9

    :cond_1
    ushr-int/lit8 v4, v4, 0x14

    const/4 v9, 0x1

    shl-int v4, v9, v4

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    if-eqz v5, :cond_4

    iget-object v9, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->p:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v9, v5}, Lcom/google/crypto/tink/shaded/protobuf/q;->a(Ljava/util/Map$Entry;)I

    move-result v9

    if-gt v9, v14, :cond_4

    iget-object v9, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->p:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v9, v2, v5}, Lcom/google/crypto/tink/shaded/protobuf/q;->j(Lcom/google/crypto/tink/shaded/protobuf/r0;Ljava/util/Map$Entry;)V

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    goto :goto_2

    :cond_4
    invoke-static {v13}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    packed-switch v15, :pswitch_data_0

    :cond_5
    :goto_3
    const/4 v13, 0x0

    goto/16 :goto_4

    :pswitch_0
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v8

    invoke-interface {v2, v14, v4, v8}, Lcom/google/crypto/tink/shaded/protobuf/r0;->O(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/e0;)V

    goto :goto_3

    :pswitch_1
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->c0(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/r0;->w(IJ)V

    goto :goto_3

    :pswitch_2
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->H(II)V

    goto :goto_3

    :pswitch_3
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->c0(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/r0;->n(IJ)V

    goto :goto_3

    :pswitch_4
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->g(II)V

    goto :goto_3

    :pswitch_5
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->D(II)V

    goto :goto_3

    :pswitch_6
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->e(II)V

    goto :goto_3

    :pswitch_7
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-interface {v2, v14, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->M(ILcom/google/crypto/tink/shaded/protobuf/h;)V

    goto :goto_3

    :pswitch_8
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v8

    invoke-interface {v2, v14, v4, v8}, Lcom/google/crypto/tink/shaded/protobuf/r0;->L(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/e0;)V

    goto/16 :goto_3

    :pswitch_9
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v14, v4, v2}, Lcom/google/crypto/tink/shaded/protobuf/S;->B0(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    goto/16 :goto_3

    :pswitch_a
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->Y(Ljava/lang/Object;J)Z

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->d(IZ)V

    goto/16 :goto_3

    :pswitch_b
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->l(II)V

    goto/16 :goto_3

    :pswitch_c
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->c0(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/r0;->u(IJ)V

    goto/16 :goto_3

    :pswitch_d
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->i(II)V

    goto/16 :goto_3

    :pswitch_e
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->c0(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/r0;->C(IJ)V

    goto/16 :goto_3

    :pswitch_f
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->c0(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/r0;->c(IJ)V

    goto/16 :goto_3

    :pswitch_10
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->a0(Ljava/lang/Object;J)F

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->x(IF)V

    goto/16 :goto_3

    :pswitch_11
    invoke-virtual {v0, v1, v14, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->Z(Ljava/lang/Object;J)D

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/r0;->m(ID)V

    goto/16 :goto_3

    :pswitch_12
    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v2, v14, v4, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->A0(Lcom/google/crypto/tink/shaded/protobuf/r0;ILjava/lang/Object;I)V

    goto/16 :goto_3

    :pswitch_13
    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v9

    invoke-static {v4, v8, v2, v9}, Lcom/google/crypto/tink/shaded/protobuf/g0;->T(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Lcom/google/crypto/tink/shaded/protobuf/e0;)V

    goto/16 :goto_3

    :pswitch_14
    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    const/4 v13, 0x1

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->a0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_3

    :pswitch_15
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->Z(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_3

    :pswitch_16
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->Y(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_3

    :pswitch_17
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->X(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_3

    :pswitch_18
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->P(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_3

    :pswitch_19
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->c0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_3

    :pswitch_1a
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->M(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_3

    :pswitch_1b
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->Q(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_3

    :pswitch_1c
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->R(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_3

    :pswitch_1d
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->U(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_3

    :pswitch_1e
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->d0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_3

    :pswitch_1f
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->V(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_3

    :pswitch_20
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->S(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_3

    :pswitch_21
    const/4 v13, 0x1

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->O(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_3

    :pswitch_22
    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    const/4 v13, 0x0

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->a0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_4

    :pswitch_23
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->Z(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_4

    :pswitch_24
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->Y(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_4

    :pswitch_25
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->X(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_4

    :pswitch_26
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->P(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_4

    :pswitch_27
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->c0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_4

    :pswitch_28
    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/g0;->N(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    goto/16 :goto_3

    :pswitch_29
    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v9

    invoke-static {v4, v8, v2, v9}, Lcom/google/crypto/tink/shaded/protobuf/g0;->W(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Lcom/google/crypto/tink/shaded/protobuf/e0;)V

    goto/16 :goto_3

    :pswitch_2a
    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/g0;->b0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    goto/16 :goto_3

    :pswitch_2b
    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    const/4 v13, 0x0

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->M(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_4

    :pswitch_2c
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->Q(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_4

    :pswitch_2d
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->R(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_4

    :pswitch_2e
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->U(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_4

    :pswitch_2f
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->d0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_4

    :pswitch_30
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->V(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_4

    :pswitch_31
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->S(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_4

    :pswitch_32
    const/4 v13, 0x0

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v4

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v4, v8, v2, v13}, Lcom/google/crypto/tink/shaded/protobuf/g0;->O(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_4

    :pswitch_33
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v8

    invoke-interface {v2, v14, v4, v8}, Lcom/google/crypto/tink/shaded/protobuf/r0;->O(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/e0;)V

    goto/16 :goto_4

    :pswitch_34
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/r0;->w(IJ)V

    goto/16 :goto_4

    :pswitch_35
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->H(II)V

    goto/16 :goto_4

    :pswitch_36
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/r0;->n(IJ)V

    goto/16 :goto_4

    :pswitch_37
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->g(II)V

    goto/16 :goto_4

    :pswitch_38
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->D(II)V

    goto/16 :goto_4

    :pswitch_39
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->e(II)V

    goto/16 :goto_4

    :pswitch_3a
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-interface {v2, v14, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->M(ILcom/google/crypto/tink/shaded/protobuf/h;)V

    goto/16 :goto_4

    :pswitch_3b
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v8

    invoke-interface {v2, v14, v4, v8}, Lcom/google/crypto/tink/shaded/protobuf/r0;->L(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/e0;)V

    goto/16 :goto_4

    :pswitch_3c
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v14, v4, v2}, Lcom/google/crypto/tink/shaded/protobuf/S;->B0(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    goto :goto_4

    :pswitch_3d
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-static {v1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->l(Ljava/lang/Object;J)Z

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->d(IZ)V

    goto :goto_4

    :pswitch_3e
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->l(II)V

    goto :goto_4

    :pswitch_3f
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/r0;->u(IJ)V

    goto :goto_4

    :pswitch_40
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->i(II)V

    goto :goto_4

    :pswitch_41
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/r0;->C(IJ)V

    goto :goto_4

    :pswitch_42
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/r0;->c(IJ)V

    goto :goto_4

    :pswitch_43
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-static {v1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->r(Ljava/lang/Object;J)F

    move-result v4

    invoke-interface {v2, v14, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->x(IF)V

    goto :goto_4

    :pswitch_44
    const/4 v13, 0x0

    and-int/2addr v4, v12

    if-eqz v4, :cond_6

    invoke-static {v1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->o(Ljava/lang/Object;J)D

    move-result-wide v8

    invoke-interface {v2, v14, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/r0;->m(ID)V

    :cond_6
    :goto_4
    add-int/lit8 v10, v10, 0x3

    const v8, 0xfffff

    goto/16 :goto_1

    :cond_7
    :goto_5
    if-eqz v5, :cond_9

    iget-object v4, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->p:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v4, v2, v5}, Lcom/google/crypto/tink/shaded/protobuf/q;->j(Lcom/google/crypto/tink/shaded/protobuf/r0;Ljava/util/Map$Entry;)V

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    move-object v5, v4

    goto :goto_5

    :cond_8
    const/4 v5, 0x0

    goto :goto_5

    :cond_9
    iget-object v3, v0, Lcom/google/crypto/tink/shaded/protobuf/S;->o:Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-virtual {v0, v3, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/S;->C0(Lcom/google/crypto/tink/shaded/protobuf/k0;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final y(Lcom/google/crypto/tink/shaded/protobuf/k0;Ljava/lang/Object;)I
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k0;->h(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final y0(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 12

    .line 1
    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->f:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->p:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/q;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->d()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->f()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    goto :goto_0

    :cond_0
    move-object v0, v1

    move-object v2, v0

    :goto_0
    iget-object v3, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    array-length v3, v3

    const/4 v4, 0x0

    move v5, v4

    :goto_1
    if-ge v5, v3, :cond_4

    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->w0(I)I

    move-result v6

    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    :goto_2
    if-eqz v2, :cond_2

    iget-object v8, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->p:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/q;->a(Ljava/util/Map$Entry;)I

    move-result v8

    if-gt v8, v7, :cond_2

    iget-object v8, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->p:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v8, p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/q;->j(Lcom/google/crypto/tink/shaded/protobuf/r0;Ljava/util/Map$Entry;)V

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    goto :goto_2

    :cond_1
    move-object v2, v1

    goto :goto_2

    :cond_2
    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->v0(I)I

    move-result v8

    const/4 v9, 0x1

    packed-switch v8, :pswitch_data_0

    goto/16 :goto_15

    :pswitch_0
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    :goto_3
    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v8

    invoke-interface {p2, v7, v6, v8}, Lcom/google/crypto/tink/shaded/protobuf/r0;->O(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/e0;)V

    goto/16 :goto_15

    :pswitch_1
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->c0(Ljava/lang/Object;J)J

    move-result-wide v8

    :goto_4
    invoke-interface {p2, v7, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/r0;->w(IJ)V

    goto/16 :goto_15

    :pswitch_2
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v6

    :goto_5
    invoke-interface {p2, v7, v6}, Lcom/google/crypto/tink/shaded/protobuf/r0;->H(II)V

    goto/16 :goto_15

    :pswitch_3
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->c0(Ljava/lang/Object;J)J

    move-result-wide v8

    :goto_6
    invoke-interface {p2, v7, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/r0;->n(IJ)V

    goto/16 :goto_15

    :pswitch_4
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v6

    :goto_7
    invoke-interface {p2, v7, v6}, Lcom/google/crypto/tink/shaded/protobuf/r0;->g(II)V

    goto/16 :goto_15

    :pswitch_5
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v6

    :goto_8
    invoke-interface {p2, v7, v6}, Lcom/google/crypto/tink/shaded/protobuf/r0;->D(II)V

    goto/16 :goto_15

    :pswitch_6
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v6

    :goto_9
    invoke-interface {p2, v7, v6}, Lcom/google/crypto/tink/shaded/protobuf/r0;->e(II)V

    goto/16 :goto_15

    :pswitch_7
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    :goto_a
    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-interface {p2, v7, v6}, Lcom/google/crypto/tink/shaded/protobuf/r0;->M(ILcom/google/crypto/tink/shaded/protobuf/h;)V

    goto/16 :goto_15

    :pswitch_8
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    :goto_b
    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v8

    invoke-interface {p2, v7, v6, v8}, Lcom/google/crypto/tink/shaded/protobuf/r0;->L(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/e0;)V

    goto/16 :goto_15

    :pswitch_9
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    :goto_c
    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v7, v6, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->B0(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    goto/16 :goto_15

    :pswitch_a
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->Y(Ljava/lang/Object;J)Z

    move-result v6

    :goto_d
    invoke-interface {p2, v7, v6}, Lcom/google/crypto/tink/shaded/protobuf/r0;->d(IZ)V

    goto/16 :goto_15

    :pswitch_b
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v6

    :goto_e
    invoke-interface {p2, v7, v6}, Lcom/google/crypto/tink/shaded/protobuf/r0;->l(II)V

    goto/16 :goto_15

    :pswitch_c
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->c0(Ljava/lang/Object;J)J

    move-result-wide v8

    :goto_f
    invoke-interface {p2, v7, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/r0;->u(IJ)V

    goto/16 :goto_15

    :pswitch_d
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v6

    :goto_10
    invoke-interface {p2, v7, v6}, Lcom/google/crypto/tink/shaded/protobuf/r0;->i(II)V

    goto/16 :goto_15

    :pswitch_e
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->c0(Ljava/lang/Object;J)J

    move-result-wide v8

    :goto_11
    invoke-interface {p2, v7, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/r0;->C(IJ)V

    goto/16 :goto_15

    :pswitch_f
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->c0(Ljava/lang/Object;J)J

    move-result-wide v8

    :goto_12
    invoke-interface {p2, v7, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/r0;->c(IJ)V

    goto/16 :goto_15

    :pswitch_10
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->a0(Ljava/lang/Object;J)F

    move-result v6

    :goto_13
    invoke-interface {p2, v7, v6}, Lcom/google/crypto/tink/shaded/protobuf/r0;->x(IF)V

    goto/16 :goto_15

    :pswitch_11
    invoke-virtual {p0, p1, v7, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->Z(Ljava/lang/Object;J)D

    move-result-wide v8

    :goto_14
    invoke-interface {p2, v7, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/r0;->m(ID)V

    goto/16 :goto_15

    :pswitch_12
    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, p2, v7, v6, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->A0(Lcom/google/crypto/tink/shaded/protobuf/r0;ILjava/lang/Object;I)V

    goto/16 :goto_15

    :pswitch_13
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v8

    invoke-static {v7, v6, p2, v8}, Lcom/google/crypto/tink/shaded/protobuf/g0;->T(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Lcom/google/crypto/tink/shaded/protobuf/e0;)V

    goto/16 :goto_15

    :pswitch_14
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/crypto/tink/shaded/protobuf/g0;->a0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_15
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/crypto/tink/shaded/protobuf/g0;->Z(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_16
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/crypto/tink/shaded/protobuf/g0;->Y(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_17
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/crypto/tink/shaded/protobuf/g0;->X(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_18
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/crypto/tink/shaded/protobuf/g0;->P(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_19
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/crypto/tink/shaded/protobuf/g0;->c0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_1a
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/crypto/tink/shaded/protobuf/g0;->M(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_1b
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/crypto/tink/shaded/protobuf/g0;->Q(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_1c
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/crypto/tink/shaded/protobuf/g0;->R(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_1d
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/crypto/tink/shaded/protobuf/g0;->U(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_1e
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/crypto/tink/shaded/protobuf/g0;->d0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_1f
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/crypto/tink/shaded/protobuf/g0;->V(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_20
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/crypto/tink/shaded/protobuf/g0;->S(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_21
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lcom/google/crypto/tink/shaded/protobuf/g0;->O(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_22
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->a0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_23
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->Z(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_24
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->Y(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_25
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->X(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_26
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->P(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_27
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->c0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_28
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2}, Lcom/google/crypto/tink/shaded/protobuf/g0;->N(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    goto/16 :goto_15

    :pswitch_29
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v8

    invoke-static {v7, v6, p2, v8}, Lcom/google/crypto/tink/shaded/protobuf/g0;->W(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Lcom/google/crypto/tink/shaded/protobuf/e0;)V

    goto/16 :goto_15

    :pswitch_2a
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2}, Lcom/google/crypto/tink/shaded/protobuf/g0;->b0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    goto/16 :goto_15

    :pswitch_2b
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->M(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_2c
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->Q(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_2d
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->R(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_2e
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->U(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_2f
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->d0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_30
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->V(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_31
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->S(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_32
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v7

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lcom/google/crypto/tink/shaded/protobuf/g0;->O(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_33
    invoke-virtual {p0, p1, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    goto/16 :goto_3

    :pswitch_34
    invoke-virtual {p0, p1, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->L(Ljava/lang/Object;J)J

    move-result-wide v8

    goto/16 :goto_4

    :pswitch_35
    invoke-virtual {p0, p1, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->z(Ljava/lang/Object;J)I

    move-result v6

    goto/16 :goto_5

    :pswitch_36
    invoke-virtual {p0, p1, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->L(Ljava/lang/Object;J)J

    move-result-wide v8

    goto/16 :goto_6

    :pswitch_37
    invoke-virtual {p0, p1, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->z(Ljava/lang/Object;J)I

    move-result v6

    goto/16 :goto_7

    :pswitch_38
    invoke-virtual {p0, p1, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->z(Ljava/lang/Object;J)I

    move-result v6

    goto/16 :goto_8

    :pswitch_39
    invoke-virtual {p0, p1, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->z(Ljava/lang/Object;J)I

    move-result v6

    goto/16 :goto_9

    :pswitch_3a
    invoke-virtual {p0, p1, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    goto/16 :goto_a

    :pswitch_3b
    invoke-virtual {p0, p1, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    goto/16 :goto_b

    :pswitch_3c
    invoke-virtual {p0, p1, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    goto/16 :goto_c

    :pswitch_3d
    invoke-virtual {p0, p1, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->l(Ljava/lang/Object;J)Z

    move-result v6

    goto/16 :goto_d

    :pswitch_3e
    invoke-virtual {p0, p1, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->z(Ljava/lang/Object;J)I

    move-result v6

    goto/16 :goto_e

    :pswitch_3f
    invoke-virtual {p0, p1, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->L(Ljava/lang/Object;J)J

    move-result-wide v8

    goto/16 :goto_f

    :pswitch_40
    invoke-virtual {p0, p1, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->z(Ljava/lang/Object;J)I

    move-result v6

    goto/16 :goto_10

    :pswitch_41
    invoke-virtual {p0, p1, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->L(Ljava/lang/Object;J)J

    move-result-wide v8

    goto/16 :goto_11

    :pswitch_42
    invoke-virtual {p0, p1, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->L(Ljava/lang/Object;J)J

    move-result-wide v8

    goto/16 :goto_12

    :pswitch_43
    invoke-virtual {p0, p1, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->r(Ljava/lang/Object;J)F

    move-result v6

    goto/16 :goto_13

    :pswitch_44
    invoke-virtual {p0, p1, v5}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/S;->o(Ljava/lang/Object;J)D

    move-result-wide v8

    goto/16 :goto_14

    :cond_3
    :goto_15
    add-int/lit8 v5, v5, 0x3

    goto/16 :goto_1

    :cond_4
    :goto_16
    if-eqz v2, :cond_6

    iget-object v3, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->p:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v3, p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/q;->j(Lcom/google/crypto/tink/shaded/protobuf/r0;Ljava/util/Map$Entry;)V

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    goto :goto_16

    :cond_5
    move-object v2, v1

    goto :goto_16

    :cond_6
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->o:Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-virtual {p0, v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->C0(Lcom/google/crypto/tink/shaded/protobuf/k0;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final z0(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->o:Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-virtual {p0, v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->C0(Lcom/google/crypto/tink/shaded/protobuf/k0;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->f:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->p:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/q;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->d()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    goto :goto_0

    :cond_0
    move-object v0, v1

    move-object v2, v0

    :goto_0
    iget-object v3, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->a:[I

    array-length v3, v3

    add-int/lit8 v3, v3, -0x3

    :goto_1
    if-ltz v3, :cond_4

    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->w0(I)I

    move-result v4

    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    :goto_2
    if-eqz v2, :cond_2

    iget-object v6, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->p:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v6, v2}, Lcom/google/crypto/tink/shaded/protobuf/q;->a(Ljava/util/Map$Entry;)I

    move-result v6

    if-le v6, v5, :cond_2

    iget-object v6, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->p:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v6, p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/q;->j(Lcom/google/crypto/tink/shaded/protobuf/r0;Ljava/util/Map$Entry;)V

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    goto :goto_2

    :cond_1
    move-object v2, v1

    goto :goto_2

    :cond_2
    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->v0(I)I

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x1

    packed-switch v6, :pswitch_data_0

    goto/16 :goto_15

    :pswitch_0
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_3
    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v6

    invoke-interface {p2, v5, v4, v6}, Lcom/google/crypto/tink/shaded/protobuf/r0;->O(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/e0;)V

    goto/16 :goto_15

    :pswitch_1
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->c0(Ljava/lang/Object;J)J

    move-result-wide v6

    :goto_4
    invoke-interface {p2, v5, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/r0;->w(IJ)V

    goto/16 :goto_15

    :pswitch_2
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v4

    :goto_5
    invoke-interface {p2, v5, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->H(II)V

    goto/16 :goto_15

    :pswitch_3
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->c0(Ljava/lang/Object;J)J

    move-result-wide v6

    :goto_6
    invoke-interface {p2, v5, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/r0;->n(IJ)V

    goto/16 :goto_15

    :pswitch_4
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v4

    :goto_7
    invoke-interface {p2, v5, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->g(II)V

    goto/16 :goto_15

    :pswitch_5
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v4

    :goto_8
    invoke-interface {p2, v5, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->D(II)V

    goto/16 :goto_15

    :pswitch_6
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v4

    :goto_9
    invoke-interface {p2, v5, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->e(II)V

    goto/16 :goto_15

    :pswitch_7
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_a
    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-interface {p2, v5, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->M(ILcom/google/crypto/tink/shaded/protobuf/h;)V

    goto/16 :goto_15

    :pswitch_8
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_b
    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v6

    invoke-interface {p2, v5, v4, v6}, Lcom/google/crypto/tink/shaded/protobuf/r0;->L(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/e0;)V

    goto/16 :goto_15

    :pswitch_9
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_c
    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v5, v4, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->B0(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    goto/16 :goto_15

    :pswitch_a
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->Y(Ljava/lang/Object;J)Z

    move-result v4

    :goto_d
    invoke-interface {p2, v5, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->d(IZ)V

    goto/16 :goto_15

    :pswitch_b
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v4

    :goto_e
    invoke-interface {p2, v5, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->l(II)V

    goto/16 :goto_15

    :pswitch_c
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->c0(Ljava/lang/Object;J)J

    move-result-wide v6

    :goto_f
    invoke-interface {p2, v5, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/r0;->u(IJ)V

    goto/16 :goto_15

    :pswitch_d
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->b0(Ljava/lang/Object;J)I

    move-result v4

    :goto_10
    invoke-interface {p2, v5, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->i(II)V

    goto/16 :goto_15

    :pswitch_e
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->c0(Ljava/lang/Object;J)J

    move-result-wide v6

    :goto_11
    invoke-interface {p2, v5, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/r0;->C(IJ)V

    goto/16 :goto_15

    :pswitch_f
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->c0(Ljava/lang/Object;J)J

    move-result-wide v6

    :goto_12
    invoke-interface {p2, v5, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/r0;->c(IJ)V

    goto/16 :goto_15

    :pswitch_10
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->a0(Ljava/lang/Object;J)F

    move-result v4

    :goto_13
    invoke-interface {p2, v5, v4}, Lcom/google/crypto/tink/shaded/protobuf/r0;->x(IF)V

    goto/16 :goto_15

    :pswitch_11
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->Z(Ljava/lang/Object;J)D

    move-result-wide v6

    :goto_14
    invoke-interface {p2, v5, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/r0;->m(ID)V

    goto/16 :goto_15

    :pswitch_12
    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, p2, v5, v4, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->A0(Lcom/google/crypto/tink/shaded/protobuf/r0;ILjava/lang/Object;I)V

    goto/16 :goto_15

    :pswitch_13
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v6

    invoke-static {v5, v4, p2, v6}, Lcom/google/crypto/tink/shaded/protobuf/g0;->T(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Lcom/google/crypto/tink/shaded/protobuf/e0;)V

    goto/16 :goto_15

    :pswitch_14
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/crypto/tink/shaded/protobuf/g0;->a0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_15
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/crypto/tink/shaded/protobuf/g0;->Z(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_16
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/crypto/tink/shaded/protobuf/g0;->Y(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_17
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/crypto/tink/shaded/protobuf/g0;->X(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_18
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/crypto/tink/shaded/protobuf/g0;->P(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_19
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/crypto/tink/shaded/protobuf/g0;->c0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_1a
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/crypto/tink/shaded/protobuf/g0;->M(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_1b
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/crypto/tink/shaded/protobuf/g0;->Q(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_1c
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/crypto/tink/shaded/protobuf/g0;->R(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_1d
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/crypto/tink/shaded/protobuf/g0;->U(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_1e
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/crypto/tink/shaded/protobuf/g0;->d0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_1f
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/crypto/tink/shaded/protobuf/g0;->V(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_20
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/crypto/tink/shaded/protobuf/g0;->S(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_21
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lcom/google/crypto/tink/shaded/protobuf/g0;->O(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_22
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->a0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_23
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->Z(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_24
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->Y(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_25
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->X(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_26
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->P(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_27
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->c0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_28
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2}, Lcom/google/crypto/tink/shaded/protobuf/g0;->N(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    goto/16 :goto_15

    :pswitch_29
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v6

    invoke-static {v5, v4, p2, v6}, Lcom/google/crypto/tink/shaded/protobuf/g0;->W(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Lcom/google/crypto/tink/shaded/protobuf/e0;)V

    goto/16 :goto_15

    :pswitch_2a
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2}, Lcom/google/crypto/tink/shaded/protobuf/g0;->b0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    goto/16 :goto_15

    :pswitch_2b
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->M(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_2c
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->Q(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_2d
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->R(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_2e
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->U(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_2f
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->d0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_30
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->V(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_31
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->S(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_32
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->W(I)I

    move-result v5

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/o0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/g0;->O(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/r0;Z)V

    goto/16 :goto_15

    :pswitch_33
    invoke-virtual {p0, p1, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_3

    :pswitch_34
    invoke-virtual {p0, p1, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->L(Ljava/lang/Object;J)J

    move-result-wide v6

    goto/16 :goto_4

    :pswitch_35
    invoke-virtual {p0, p1, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->z(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_5

    :pswitch_36
    invoke-virtual {p0, p1, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->L(Ljava/lang/Object;J)J

    move-result-wide v6

    goto/16 :goto_6

    :pswitch_37
    invoke-virtual {p0, p1, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->z(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_7

    :pswitch_38
    invoke-virtual {p0, p1, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->z(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_8

    :pswitch_39
    invoke-virtual {p0, p1, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->z(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_9

    :pswitch_3a
    invoke-virtual {p0, p1, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_a

    :pswitch_3b
    invoke-virtual {p0, p1, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_b

    :pswitch_3c
    invoke-virtual {p0, p1, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_c

    :pswitch_3d
    invoke-virtual {p0, p1, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->l(Ljava/lang/Object;J)Z

    move-result v4

    goto/16 :goto_d

    :pswitch_3e
    invoke-virtual {p0, p1, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->z(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_e

    :pswitch_3f
    invoke-virtual {p0, p1, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->L(Ljava/lang/Object;J)J

    move-result-wide v6

    goto/16 :goto_f

    :pswitch_40
    invoke-virtual {p0, p1, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->z(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_10

    :pswitch_41
    invoke-virtual {p0, p1, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->L(Ljava/lang/Object;J)J

    move-result-wide v6

    goto/16 :goto_11

    :pswitch_42
    invoke-virtual {p0, p1, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->L(Ljava/lang/Object;J)J

    move-result-wide v6

    goto/16 :goto_12

    :pswitch_43
    invoke-virtual {p0, p1, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->r(Ljava/lang/Object;J)F

    move-result v4

    goto/16 :goto_13

    :pswitch_44
    invoke-virtual {p0, p1, v3}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/S;->X(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/S;->o(Ljava/lang/Object;J)D

    move-result-wide v6

    goto/16 :goto_14

    :cond_3
    :goto_15
    add-int/lit8 v3, v3, -0x3

    goto/16 :goto_1

    :cond_4
    :goto_16
    if-eqz v2, :cond_6

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/S;->p:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {p1, p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/q;->j(Lcom/google/crypto/tink/shaded/protobuf/r0;Ljava/util/Map$Entry;)V

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    move-object v2, p1

    goto :goto_16

    :cond_5
    move-object v2, v1

    goto :goto_16

    :cond_6
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
