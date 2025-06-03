.class public final Lcom/google/android/gms/internal/measurement/M4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/Z4;


# static fields
.field public static final r:[I

.field public static final s:Lsun/misc/Unsafe;


# instance fields
.field public final a:[I

.field public final b:[Ljava/lang/Object;

.field public final c:I

.field public final d:I

.field public final e:Lcom/google/android/gms/internal/measurement/I4;

.field public final f:Z

.field public final g:Z

.field public final h:Lcom/google/android/gms/internal/measurement/V4;

.field public final i:Z

.field public final j:[I

.field public final k:I

.field public final l:I

.field public final m:Lcom/google/android/gms/internal/measurement/P4;

.field public final n:Lcom/google/android/gms/internal/measurement/q4;

.field public final o:Lcom/google/android/gms/internal/measurement/x5;

.field public final p:Lcom/google/android/gms/internal/measurement/O3;

.field public final q:Lcom/google/android/gms/internal/measurement/F4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Lcom/google/android/gms/internal/measurement/M4;->r:[I

    invoke-static {}, Lcom/google/android/gms/internal/measurement/D5;->p()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/M4;->s:Lsun/misc/Unsafe;

    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/measurement/I4;Lcom/google/android/gms/internal/measurement/V4;Z[IIILcom/google/android/gms/internal/measurement/P4;Lcom/google/android/gms/internal/measurement/q4;Lcom/google/android/gms/internal/measurement/x5;Lcom/google/android/gms/internal/measurement/O3;Lcom/google/android/gms/internal/measurement/F4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/M4;->b:[Ljava/lang/Object;

    iput p3, p0, Lcom/google/android/gms/internal/measurement/M4;->c:I

    iput p4, p0, Lcom/google/android/gms/internal/measurement/M4;->d:I

    instance-of p1, p5, Lcom/google/android/gms/internal/measurement/Y3;

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/M4;->g:Z

    iput-object p6, p0, Lcom/google/android/gms/internal/measurement/M4;->h:Lcom/google/android/gms/internal/measurement/V4;

    const/4 p1, 0x0

    if-eqz p14, :cond_0

    invoke-virtual {p14, p5}, Lcom/google/android/gms/internal/measurement/O3;->d(Lcom/google/android/gms/internal/measurement/I4;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    move p2, p1

    :goto_0
    iput-boolean p2, p0, Lcom/google/android/gms/internal/measurement/M4;->f:Z

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/M4;->i:Z

    iput-object p8, p0, Lcom/google/android/gms/internal/measurement/M4;->j:[I

    iput p9, p0, Lcom/google/android/gms/internal/measurement/M4;->k:I

    iput p10, p0, Lcom/google/android/gms/internal/measurement/M4;->l:I

    iput-object p11, p0, Lcom/google/android/gms/internal/measurement/M4;->m:Lcom/google/android/gms/internal/measurement/P4;

    iput-object p12, p0, Lcom/google/android/gms/internal/measurement/M4;->n:Lcom/google/android/gms/internal/measurement/q4;

    iput-object p13, p0, Lcom/google/android/gms/internal/measurement/M4;->o:Lcom/google/android/gms/internal/measurement/x5;

    iput-object p14, p0, Lcom/google/android/gms/internal/measurement/M4;->p:Lcom/google/android/gms/internal/measurement/O3;

    iput-object p5, p0, Lcom/google/android/gms/internal/measurement/M4;->e:Lcom/google/android/gms/internal/measurement/I4;

    iput-object p15, p0, Lcom/google/android/gms/internal/measurement/M4;->q:Lcom/google/android/gms/internal/measurement/F4;

    return-void
.end method

.method public static A(Ljava/lang/Object;ILcom/google/android/gms/internal/measurement/Z4;)Z
    .locals 2

    .line 1
    const v0, 0xfffff

    and-int/2addr p1, v0

    int-to-long v0, p1

    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, Lcom/google/android/gms/internal/measurement/Z4;->c(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static B(Ljava/lang/Object;J)F
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    return p0
.end method

.method public static H(Ljava/lang/Object;J)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static L(Ljava/lang/Object;J)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method public static O(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/v5;
    .locals 2

    .line 1
    check-cast p0, Lcom/google/android/gms/internal/measurement/Y3;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3;->zzb:Lcom/google/android/gms/internal/measurement/v5;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/v5;->k()Lcom/google/android/gms/internal/measurement/v5;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/v5;->l()Lcom/google/android/gms/internal/measurement/v5;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3;->zzb:Lcom/google/android/gms/internal/measurement/v5;

    :cond_0
    return-object v0
.end method

.method public static P(Ljava/lang/Object;J)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static R(Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/M4;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Mutating immutable message: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static S(I)Z
    .locals 1

    .line 1
    const/high16 v0, 0x20000000

    and-int/2addr p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static T(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    instance-of v0, p0, Lcom/google/android/gms/internal/measurement/Y3;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/google/android/gms/internal/measurement/Y3;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y3;->F()Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static j(Ljava/lang/Object;J)D
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Double;

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    return-wide p0
.end method

.method public static n(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/G4;Lcom/google/android/gms/internal/measurement/P4;Lcom/google/android/gms/internal/measurement/q4;Lcom/google/android/gms/internal/measurement/x5;Lcom/google/android/gms/internal/measurement/O3;Lcom/google/android/gms/internal/measurement/F4;)Lcom/google/android/gms/internal/measurement/M4;
    .locals 33

    .line 1
    move-object/from16 v0, p1

    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/W4;

    if-eqz v1, :cond_36

    check-cast v0, Lcom/google/android/gms/internal/measurement/W4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/W4;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const v5, 0xd800

    const/4 v6, 0x1

    if-lt v4, v5, :cond_0

    move v4, v6

    :goto_0
    add-int/lit8 v7, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_1

    move v4, v7

    goto :goto_0

    :cond_0
    move v7, v6

    :cond_1
    add-int/lit8 v4, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v5, :cond_3

    and-int/lit16 v7, v7, 0x1fff

    const/16 v9, 0xd

    :goto_1
    add-int/lit8 v10, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_2

    and-int/lit16 v4, v4, 0x1fff

    shl-int/2addr v4, v9

    or-int/2addr v7, v4

    add-int/lit8 v9, v9, 0xd

    move v4, v10

    goto :goto_1

    :cond_2
    shl-int/2addr v4, v9

    or-int/2addr v7, v4

    move v4, v10

    :cond_3
    if-nez v7, :cond_4

    sget-object v7, Lcom/google/android/gms/internal/measurement/M4;->r:[I

    move v11, v3

    move v12, v11

    move v13, v12

    move v14, v13

    move/from16 v16, v14

    move/from16 v18, v16

    move-object/from16 v17, v7

    move/from16 v7, v18

    goto/16 :goto_a

    :cond_4
    add-int/lit8 v7, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_6

    and-int/lit16 v4, v4, 0x1fff

    const/16 v9, 0xd

    :goto_2
    add-int/lit8 v10, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v5, :cond_5

    and-int/lit16 v7, v7, 0x1fff

    shl-int/2addr v7, v9

    or-int/2addr v4, v7

    add-int/lit8 v9, v9, 0xd

    move v7, v10

    goto :goto_2

    :cond_5
    shl-int/2addr v7, v9

    or-int/2addr v4, v7

    move v7, v10

    :cond_6
    add-int/lit8 v9, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v5, :cond_8

    and-int/lit16 v7, v7, 0x1fff

    const/16 v10, 0xd

    :goto_3
    add-int/lit8 v11, v9, 0x1

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v5, :cond_7

    and-int/lit16 v9, v9, 0x1fff

    shl-int/2addr v9, v10

    or-int/2addr v7, v9

    add-int/lit8 v10, v10, 0xd

    move v9, v11

    goto :goto_3

    :cond_7
    shl-int/2addr v9, v10

    or-int/2addr v7, v9

    move v9, v11

    :cond_8
    add-int/lit8 v10, v9, 0x1

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v5, :cond_a

    and-int/lit16 v9, v9, 0x1fff

    const/16 v11, 0xd

    :goto_4
    add-int/lit8 v12, v10, 0x1

    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-lt v10, v5, :cond_9

    and-int/lit16 v10, v10, 0x1fff

    shl-int/2addr v10, v11

    or-int/2addr v9, v10

    add-int/lit8 v11, v11, 0xd

    move v10, v12

    goto :goto_4

    :cond_9
    shl-int/2addr v10, v11

    or-int/2addr v9, v10

    move v10, v12

    :cond_a
    add-int/lit8 v11, v10, 0x1

    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-lt v10, v5, :cond_c

    and-int/lit16 v10, v10, 0x1fff

    const/16 v12, 0xd

    :goto_5
    add-int/lit8 v13, v11, 0x1

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v5, :cond_b

    and-int/lit16 v11, v11, 0x1fff

    shl-int/2addr v11, v12

    or-int/2addr v10, v11

    add-int/lit8 v12, v12, 0xd

    move v11, v13

    goto :goto_5

    :cond_b
    shl-int/2addr v11, v12

    or-int/2addr v10, v11

    move v11, v13

    :cond_c
    add-int/lit8 v12, v11, 0x1

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v5, :cond_e

    and-int/lit16 v11, v11, 0x1fff

    const/16 v13, 0xd

    :goto_6
    add-int/lit8 v14, v12, 0x1

    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v5, :cond_d

    and-int/lit16 v12, v12, 0x1fff

    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    add-int/lit8 v13, v13, 0xd

    move v12, v14

    goto :goto_6

    :cond_d
    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    move v12, v14

    :cond_e
    add-int/lit8 v13, v12, 0x1

    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v5, :cond_10

    and-int/lit16 v12, v12, 0x1fff

    const/16 v14, 0xd

    :goto_7
    add-int/lit8 v15, v13, 0x1

    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v5, :cond_f

    and-int/lit16 v13, v13, 0x1fff

    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    add-int/lit8 v14, v14, 0xd

    move v13, v15

    goto :goto_7

    :cond_f
    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    move v13, v15

    :cond_10
    add-int/lit8 v14, v13, 0x1

    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v5, :cond_12

    and-int/lit16 v13, v13, 0x1fff

    const/16 v15, 0xd

    :goto_8
    add-int/lit8 v16, v14, 0x1

    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v5, :cond_11

    and-int/lit16 v14, v14, 0x1fff

    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    add-int/lit8 v15, v15, 0xd

    move/from16 v14, v16

    goto :goto_8

    :cond_11
    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    move/from16 v14, v16

    :cond_12
    add-int/lit8 v15, v14, 0x1

    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v5, :cond_14

    and-int/lit16 v14, v14, 0x1fff

    const/16 v16, 0xd

    :goto_9
    add-int/lit8 v17, v15, 0x1

    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v5, :cond_13

    and-int/lit16 v15, v15, 0x1fff

    shl-int v15, v15, v16

    or-int/2addr v14, v15

    add-int/lit8 v16, v16, 0xd

    move/from16 v15, v17

    goto :goto_9

    :cond_13
    shl-int v15, v15, v16

    or-int/2addr v14, v15

    move/from16 v15, v17

    :cond_14
    add-int v16, v14, v12

    add-int v13, v16, v13

    new-array v13, v13, [I

    shl-int/lit8 v16, v4, 0x1

    add-int v16, v16, v7

    move v7, v4

    move-object/from16 v17, v13

    move/from16 v18, v14

    move v4, v15

    move v13, v9

    move v14, v10

    :goto_a
    sget-object v9, Lcom/google/android/gms/internal/measurement/M4;->s:Lsun/misc/Unsafe;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/W4;->e()[Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/W4;->a()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v15

    mul-int/lit8 v3, v11, 0x3

    new-array v3, v3, [I

    shl-int/2addr v11, v6

    new-array v11, v11, [Ljava/lang/Object;

    add-int v19, v18, v12

    move/from16 v21, v18

    move/from16 v22, v19

    const/4 v12, 0x0

    const/16 v20, 0x0

    :goto_b
    if-ge v4, v2, :cond_35

    add-int/lit8 v23, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_16

    and-int/lit16 v4, v4, 0x1fff

    move/from16 v8, v23

    const/16 v23, 0xd

    :goto_c
    add-int/lit8 v24, v8, 0x1

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v5, :cond_15

    and-int/lit16 v8, v8, 0x1fff

    shl-int v8, v8, v23

    or-int/2addr v4, v8

    add-int/lit8 v23, v23, 0xd

    move/from16 v8, v24

    goto :goto_c

    :cond_15
    shl-int v8, v8, v23

    or-int/2addr v4, v8

    move/from16 v8, v24

    goto :goto_d

    :cond_16
    move/from16 v8, v23

    :goto_d
    add-int/lit8 v23, v8, 0x1

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v5, :cond_18

    and-int/lit16 v8, v8, 0x1fff

    move/from16 v6, v23

    const/16 v23, 0xd

    :goto_e
    add-int/lit8 v25, v6, 0x1

    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_17

    and-int/lit16 v6, v6, 0x1fff

    shl-int v6, v6, v23

    or-int/2addr v8, v6

    add-int/lit8 v23, v23, 0xd

    move/from16 v6, v25

    goto :goto_e

    :cond_17
    shl-int v6, v6, v23

    or-int/2addr v8, v6

    move/from16 v6, v25

    goto :goto_f

    :cond_18
    move/from16 v6, v23

    :goto_f
    and-int/lit16 v5, v8, 0xff

    move/from16 v25, v2

    and-int/lit16 v2, v8, 0x400

    if-eqz v2, :cond_19

    add-int/lit8 v2, v20, 0x1

    aput v12, v17, v20

    move/from16 v20, v2

    :cond_19
    const/16 v2, 0x33

    move/from16 v28, v14

    if-lt v5, v2, :cond_22

    add-int/lit8 v2, v6, 0x1

    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const v14, 0xd800

    if-lt v6, v14, :cond_1b

    and-int/lit16 v6, v6, 0x1fff

    const/16 v30, 0xd

    :goto_10
    add-int/lit8 v31, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-lt v2, v14, :cond_1a

    and-int/lit16 v2, v2, 0x1fff

    shl-int v2, v2, v30

    or-int/2addr v6, v2

    add-int/lit8 v30, v30, 0xd

    move/from16 v2, v31

    const v14, 0xd800

    goto :goto_10

    :cond_1a
    shl-int v2, v2, v30

    or-int/2addr v6, v2

    move/from16 v2, v31

    :cond_1b
    add-int/lit8 v14, v5, -0x33

    move/from16 v30, v2

    const/16 v2, 0x9

    if-eq v14, v2, :cond_1c

    const/16 v2, 0x11

    if-ne v14, v2, :cond_1d

    :cond_1c
    const/4 v14, 0x1

    goto :goto_13

    :cond_1d
    const/16 v2, 0xc

    if-ne v14, v2, :cond_1e

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/W4;->b()Lcom/google/android/gms/internal/measurement/V4;

    move-result-object v2

    sget-object v14, Lcom/google/android/gms/internal/measurement/V4;->o:Lcom/google/android/gms/internal/measurement/V4;

    invoke-virtual {v2, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1f

    and-int/lit16 v2, v8, 0x800

    if-eqz v2, :cond_1e

    goto :goto_11

    :cond_1e
    const/4 v14, 0x1

    goto :goto_14

    :cond_1f
    :goto_11
    div-int/lit8 v2, v12, 0x3

    const/4 v14, 0x1

    shl-int/2addr v2, v14

    add-int/2addr v2, v14

    add-int/lit8 v24, v16, 0x1

    aget-object v16, v10, v16

    aput-object v16, v11, v2

    :goto_12
    move/from16 v16, v24

    goto :goto_14

    :goto_13
    div-int/lit8 v2, v12, 0x3

    shl-int/2addr v2, v14

    add-int/2addr v2, v14

    add-int/lit8 v24, v16, 0x1

    aget-object v16, v10, v16

    aput-object v16, v11, v2

    goto :goto_12

    :goto_14
    shl-int/lit8 v2, v6, 0x1

    aget-object v6, v10, v2

    instance-of v14, v6, Ljava/lang/reflect/Field;

    if-eqz v14, :cond_20

    check-cast v6, Ljava/lang/reflect/Field;

    :goto_15
    move/from16 v31, v13

    goto :goto_16

    :cond_20
    check-cast v6, Ljava/lang/String;

    invoke-static {v15, v6}, Lcom/google/android/gms/internal/measurement/M4;->s(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    aput-object v6, v10, v2

    goto :goto_15

    :goto_16
    invoke-virtual {v9, v6}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v13

    long-to-int v6, v13

    add-int/lit8 v2, v2, 0x1

    aget-object v13, v10, v2

    instance-of v14, v13, Ljava/lang/reflect/Field;

    if-eqz v14, :cond_21

    check-cast v13, Ljava/lang/reflect/Field;

    goto :goto_17

    :cond_21
    check-cast v13, Ljava/lang/String;

    invoke-static {v15, v13}, Lcom/google/android/gms/internal/measurement/M4;->s(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v13

    aput-object v13, v10, v2

    :goto_17
    invoke-virtual {v9, v13}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v13

    long-to-int v2, v13

    move-object/from16 v26, v0

    move-object/from16 v27, v1

    move/from16 v23, v16

    move/from16 v13, v30

    const/4 v0, 0x0

    const/16 v16, 0x1

    goto/16 :goto_21

    :cond_22
    move/from16 v31, v13

    add-int/lit8 v2, v16, 0x1

    aget-object v13, v10, v16

    check-cast v13, Ljava/lang/String;

    invoke-static {v15, v13}, Lcom/google/android/gms/internal/measurement/M4;->s(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v13

    const/16 v14, 0x9

    if-eq v5, v14, :cond_23

    const/16 v14, 0x11

    if-ne v5, v14, :cond_24

    :cond_23
    move-object/from16 v26, v0

    const/4 v14, 0x1

    goto/16 :goto_1b

    :cond_24
    const/16 v14, 0x1b

    if-eq v5, v14, :cond_25

    const/16 v14, 0x31

    if-ne v5, v14, :cond_26

    :cond_25
    move-object/from16 v26, v0

    const/4 v14, 0x1

    goto :goto_1a

    :cond_26
    const/16 v14, 0xc

    if-eq v5, v14, :cond_2a

    const/16 v14, 0x1e

    if-eq v5, v14, :cond_2a

    const/16 v14, 0x2c

    if-ne v5, v14, :cond_27

    goto :goto_18

    :cond_27
    const/16 v14, 0x32

    if-ne v5, v14, :cond_29

    add-int/lit8 v14, v21, 0x1

    aput v12, v17, v21

    div-int/lit8 v21, v12, 0x3

    const/16 v24, 0x1

    shl-int/lit8 v21, v21, 0x1

    add-int/lit8 v26, v16, 0x2

    aget-object v2, v10, v2

    aput-object v2, v11, v21

    and-int/lit16 v2, v8, 0x800

    if-eqz v2, :cond_28

    add-int/lit8 v21, v21, 0x1

    add-int/lit8 v2, v16, 0x3

    aget-object v16, v10, v26

    aput-object v16, v11, v21

    move-object/from16 v26, v0

    move/from16 v21, v14

    goto :goto_1c

    :cond_28
    move/from16 v21, v14

    move/from16 v2, v26

    :cond_29
    move-object/from16 v26, v0

    goto :goto_1c

    :cond_2a
    :goto_18
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/W4;->b()Lcom/google/android/gms/internal/measurement/V4;

    move-result-object v14

    move-object/from16 v26, v0

    sget-object v0, Lcom/google/android/gms/internal/measurement/V4;->o:Lcom/google/android/gms/internal/measurement/V4;

    if-eq v14, v0, :cond_2b

    and-int/lit16 v0, v8, 0x800

    if-eqz v0, :cond_2c

    :cond_2b
    div-int/lit8 v0, v12, 0x3

    const/4 v14, 0x1

    shl-int/2addr v0, v14

    add-int/2addr v0, v14

    add-int/lit8 v16, v16, 0x2

    aget-object v2, v10, v2

    aput-object v2, v11, v0

    :goto_19
    move/from16 v2, v16

    goto :goto_1c

    :goto_1a
    div-int/lit8 v0, v12, 0x3

    shl-int/2addr v0, v14

    add-int/2addr v0, v14

    add-int/lit8 v16, v16, 0x2

    aget-object v2, v10, v2

    aput-object v2, v11, v0

    goto :goto_19

    :goto_1b
    div-int/lit8 v0, v12, 0x3

    shl-int/2addr v0, v14

    add-int/2addr v0, v14

    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v14

    aput-object v14, v11, v0

    :cond_2c
    :goto_1c
    invoke-virtual {v9, v13}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v13

    long-to-int v0, v13

    and-int/lit16 v13, v8, 0x1000

    if-eqz v13, :cond_30

    const/16 v13, 0x11

    if-gt v5, v13, :cond_30

    add-int/lit8 v13, v6, 0x1

    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const v14, 0xd800

    if-lt v6, v14, :cond_2e

    and-int/lit16 v6, v6, 0x1fff

    const/16 v16, 0xd

    :goto_1d
    add-int/lit8 v23, v13, 0x1

    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v14, :cond_2d

    and-int/lit16 v13, v13, 0x1fff

    shl-int v13, v13, v16

    or-int/2addr v6, v13

    add-int/lit8 v16, v16, 0xd

    move/from16 v13, v23

    goto :goto_1d

    :cond_2d
    shl-int v13, v13, v16

    or-int/2addr v6, v13

    move/from16 v13, v23

    :cond_2e
    const/16 v16, 0x1

    shl-int/lit8 v23, v7, 0x1

    div-int/lit8 v24, v6, 0x20

    add-int v23, v23, v24

    aget-object v14, v10, v23

    move-object/from16 v27, v1

    instance-of v1, v14, Ljava/lang/reflect/Field;

    if-eqz v1, :cond_2f

    check-cast v14, Ljava/lang/reflect/Field;

    :goto_1e
    move/from16 v23, v2

    goto :goto_1f

    :cond_2f
    check-cast v14, Ljava/lang/String;

    invoke-static {v15, v14}, Lcom/google/android/gms/internal/measurement/M4;->s(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v14

    aput-object v14, v10, v23

    goto :goto_1e

    :goto_1f
    invoke-virtual {v9, v14}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v1

    long-to-int v1, v1

    rem-int/lit8 v6, v6, 0x20

    move v2, v1

    goto :goto_20

    :cond_30
    move-object/from16 v27, v1

    move/from16 v23, v2

    const/16 v16, 0x1

    const v1, 0xfffff

    move v2, v1

    move v13, v6

    const/4 v6, 0x0

    :goto_20
    const/16 v1, 0x12

    if-lt v5, v1, :cond_31

    const/16 v1, 0x31

    if-gt v5, v1, :cond_31

    add-int/lit8 v1, v22, 0x1

    aput v0, v17, v22

    move/from16 v22, v1

    :cond_31
    move/from16 v32, v6

    move v6, v0

    move/from16 v0, v32

    :goto_21
    add-int/lit8 v1, v12, 0x1

    aput v4, v3, v12

    add-int/lit8 v4, v12, 0x2

    and-int/lit16 v14, v8, 0x200

    if-eqz v14, :cond_32

    const/high16 v14, 0x20000000

    goto :goto_22

    :cond_32
    const/4 v14, 0x0

    :goto_22
    move/from16 v29, v7

    and-int/lit16 v7, v8, 0x100

    if-eqz v7, :cond_33

    const/high16 v7, 0x10000000

    goto :goto_23

    :cond_33
    const/4 v7, 0x0

    :goto_23
    or-int/2addr v7, v14

    and-int/lit16 v8, v8, 0x800

    if-eqz v8, :cond_34

    const/high16 v8, -0x80000000

    goto :goto_24

    :cond_34
    const/4 v8, 0x0

    :goto_24
    or-int/2addr v7, v8

    shl-int/lit8 v5, v5, 0x14

    or-int/2addr v5, v7

    or-int/2addr v5, v6

    aput v5, v3, v1

    add-int/lit8 v12, v12, 0x3

    shl-int/lit8 v0, v0, 0x14

    or-int/2addr v0, v2

    aput v0, v3, v4

    move v4, v13

    move/from16 v6, v16

    move/from16 v16, v23

    move/from16 v2, v25

    move-object/from16 v0, v26

    move-object/from16 v1, v27

    move/from16 v14, v28

    move/from16 v7, v29

    move/from16 v13, v31

    const v5, 0xd800

    goto/16 :goto_b

    :cond_35
    move-object/from16 v26, v0

    move/from16 v31, v13

    move/from16 v28, v14

    new-instance v0, Lcom/google/android/gms/internal/measurement/M4;

    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/W4;->a()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v14

    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/W4;->b()Lcom/google/android/gms/internal/measurement/V4;

    move-result-object v15

    const/16 v16, 0x0

    move-object v9, v0

    move-object v10, v3

    move/from16 v12, v31

    move/from16 v13, v28

    move-object/from16 v20, p2

    move-object/from16 v21, p3

    move-object/from16 v22, p4

    move-object/from16 v23, p5

    move-object/from16 v24, p6

    invoke-direct/range {v9 .. v24}, Lcom/google/android/gms/internal/measurement/M4;-><init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/measurement/I4;Lcom/google/android/gms/internal/measurement/V4;Z[IIILcom/google/android/gms/internal/measurement/P4;Lcom/google/android/gms/internal/measurement/q4;Lcom/google/android/gms/internal/measurement/x5;Lcom/google/android/gms/internal/measurement/O3;Lcom/google/android/gms/internal/measurement/F4;)V

    return-object v0

    :cond_36
    invoke-static/range {p1 .. p1}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    new-instance v0, Ljava/lang/NoSuchMethodError;

    invoke-direct {v0}, Ljava/lang/NoSuchMethodError;-><init>()V

    throw v0
.end method

.method public static s(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
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

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Field "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " not found. Known fields are "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static t(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/T5;)V
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-interface {p2, p0, p1}, Lcom/google/android/gms/internal/measurement/T5;->E(ILjava/lang/String;)V

    return-void

    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/measurement/q3;

    invoke-interface {p2, p0, p1}, Lcom/google/android/gms/internal/measurement/T5;->f(ILcom/google/android/gms/internal/measurement/q3;)V

    return-void
.end method

.method public static u(Lcom/google/android/gms/internal/measurement/x5;Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/T5;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/x5;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/x5;->g(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/T5;)V

    return-void
.end method


# virtual methods
.method public final C(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    add-int/lit8 p1, p1, 0x2

    aget p1, v0, p1

    return p1
.end method

.method public final D(Ljava/lang/Object;I)V
    .locals 4

    .line 1
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/M4;->C(I)I

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

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result v2

    or-int/2addr p2, v2

    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/measurement/D5;->h(Ljava/lang/Object;JI)V

    return-void
.end method

.method public final E(Ljava/lang/Object;II)V
    .locals 2

    .line 1
    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/M4;->C(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/measurement/D5;->h(Ljava/lang/Object;JI)V

    return-void
.end method

.method public final F(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, p3

    invoke-virtual {p0, p2, v0, p3}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/M4;->G(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    sget-object v3, Lcom/google/android/gms/internal/measurement/M4;->s:Lsun/misc/Unsafe;

    invoke-virtual {v3, p2, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p3}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {v4}, Lcom/google/android/gms/internal/measurement/M4;->T(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v3, p1, v1, v2, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/Z4;->a()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {p2, v5, v4}, Lcom/google/android/gms/internal/measurement/Z4;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, p1, v1, v2, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-virtual {p0, p1, v0, p3}, Lcom/google/android/gms/internal/measurement/M4;->E(Ljava/lang/Object;II)V

    return-void

    :cond_2
    invoke-virtual {v3, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/measurement/M4;->T(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/Z4;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v0, p3}, Lcom/google/android/gms/internal/measurement/Z4;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, p1, v1, v2, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p3, v0

    :cond_3
    invoke-interface {p2, p3, v4}, Lcom/google/android/gms/internal/measurement/Z4;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget p3, v0, p3

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Source subfield "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " is present but null: "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final G(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    return p1
.end method

.method public final I(Ljava/lang/Object;I)Z
    .locals 7

    .line 1
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/M4;->C(I)I

    move-result v0

    const v1, 0xfffff

    and-int v2, v0, v1

    int-to-long v2, v2

    const-wide/32 v4, 0xfffff

    cmp-long v4, v2, v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-nez v4, :cond_14

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/M4;->G(I)I

    move-result p2

    and-int v0, p2, v1

    int-to-long v0, v0

    const/high16 v2, 0xff00000

    and-int/2addr p2, v2

    ushr-int/lit8 p2, p2, 0x14

    const-wide/16 v2, 0x0

    packed-switch p2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return v6

    :cond_0
    return v5

    :pswitch_1
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->x(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_1

    return v6

    :cond_1
    return v5

    :pswitch_2
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_2

    return v6

    :cond_2
    return v5

    :pswitch_3
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->x(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    return v6

    :cond_3
    return v5

    :pswitch_4
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_4

    return v6

    :cond_4
    return v5

    :pswitch_5
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_5

    return v6

    :cond_5
    return v5

    :pswitch_6
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_6

    return v6

    :cond_6
    return v5

    :pswitch_7
    sget-object p2, Lcom/google/android/gms/internal/measurement/q3;->p:Lcom/google/android/gms/internal/measurement/q3;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/q3;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v6

    :cond_7
    return v5

    :pswitch_8
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_8

    return v6

    :cond_8
    return v5

    :pswitch_9
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_a

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_9

    return v6

    :cond_9
    return v5

    :cond_a
    instance-of p2, p1, Lcom/google/android/gms/internal/measurement/q3;

    if-eqz p2, :cond_c

    sget-object p2, Lcom/google/android/gms/internal/measurement/q3;->p:Lcom/google/android/gms/internal/measurement/q3;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/q3;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v6

    :cond_b
    return v5

    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_a
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->F(Ljava/lang/Object;J)Z

    move-result p1

    return p1

    :pswitch_b
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_d

    return v6

    :cond_d
    return v5

    :pswitch_c
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->x(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_e

    return v6

    :cond_e
    return v5

    :pswitch_d
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_f

    return v6

    :cond_f
    return v5

    :pswitch_e
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->x(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_10

    return v6

    :cond_10
    return v5

    :pswitch_f
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->x(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_11

    return v6

    :cond_11
    return v5

    :pswitch_10
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->n(Ljava/lang/Object;J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    if-eqz p1, :cond_12

    return v6

    :cond_12
    return v5

    :pswitch_11
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->a(Ljava/lang/Object;J)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_13

    return v6

    :cond_13
    return v5

    :cond_14
    ushr-int/lit8 p2, v0, 0x14

    shl-int p2, v6, p2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result p1

    and-int/2addr p1, p2

    if-eqz p1, :cond_15

    return v6

    :cond_15
    return v5

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

.method public final J(Ljava/lang/Object;II)Z
    .locals 2

    .line 1
    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/M4;->C(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result p1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final K(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p3}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result p1

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final M(I)Lcom/google/android/gms/internal/measurement/g4;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->b:[Ljava/lang/Object;

    div-int/lit8 p1, p1, 0x3

    shl-int/lit8 p1, p1, 0x1

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/g4;

    return-object p1
.end method

.method public final N(I)Lcom/google/android/gms/internal/measurement/Z4;
    .locals 3

    .line 1
    div-int/lit8 p1, p1, 0x3

    shl-int/lit8 p1, p1, 0x1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->b:[Ljava/lang/Object;

    aget-object v0, v0, p1

    check-cast v0, Lcom/google/android/gms/internal/measurement/Z4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/U4;->a()Lcom/google/android/gms/internal/measurement/U4;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/M4;->b:[Ljava/lang/Object;

    add-int/lit8 v2, p1, 0x1

    aget-object v1, v1, v2

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/U4;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/M4;->b:[Ljava/lang/Object;

    aput-object v0, v1, p1

    return-object v0
.end method

.method public final Q(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->b:[Ljava/lang/Object;

    div-int/lit8 p1, p1, 0x3

    shl-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->m:Lcom/google/android/gms/internal/measurement/P4;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/M4;->e:Lcom/google/android/gms/internal/measurement/I4;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/measurement/P4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/Object;)I
    .locals 17

    .line 1
    move-object/from16 v6, p0

    move-object/from16 v7, p1

    sget-object v8, Lcom/google/android/gms/internal/measurement/M4;->s:Lsun/misc/Unsafe;

    const v10, 0xfffff

    move v0, v10

    const/4 v1, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_0
    iget-object v2, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    array-length v2, v2

    if-ge v11, v2, :cond_7

    invoke-virtual {v6, v11}, Lcom/google/android/gms/internal/measurement/M4;->G(I)I

    move-result v2

    const/high16 v3, 0xff00000

    and-int/2addr v3, v2

    ushr-int/lit8 v3, v3, 0x14

    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v13, v4, v11

    add-int/lit8 v5, v11, 0x2

    aget v4, v4, v5

    and-int v5, v4, v10

    const/16 v14, 0x11

    const/4 v15, 0x1

    if-gt v3, v14, :cond_2

    if-eq v5, v0, :cond_1

    if-ne v5, v10, :cond_0

    const/4 v1, 0x0

    goto :goto_1

    :cond_0
    int-to-long v0, v5

    invoke-virtual {v8, v7, v0, v1}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    move v1, v0

    :goto_1
    move v0, v5

    :cond_1
    ushr-int/lit8 v4, v4, 0x14

    shl-int v4, v15, v4

    move v14, v0

    move/from16 v16, v1

    move v5, v4

    goto :goto_2

    :cond_2
    move v14, v0

    move/from16 v16, v1

    const/4 v5, 0x0

    :goto_2
    and-int v0, v2, v10

    int-to-long v1, v0

    sget-object v0, Lcom/google/android/gms/internal/measurement/T3;->c0:Lcom/google/android/gms/internal/measurement/T3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/T3;->a()I

    move-result v0

    if-lt v3, v0, :cond_3

    sget-object v0, Lcom/google/android/gms/internal/measurement/T3;->p0:Lcom/google/android/gms/internal/measurement/T3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/T3;->a()I

    move-result v0

    :cond_3
    const/4 v4, 0x0

    const-wide/16 v9, 0x0

    packed-switch v3, :pswitch_data_0

    goto :goto_5

    :pswitch_0
    invoke-virtual {v6, v7, v13, v11}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    check-cast v0, Lcom/google/android/gms/internal/measurement/I4;

    invoke-virtual {v6, v11}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v1

    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/measurement/J3;->x(ILcom/google/android/gms/internal/measurement/I4;Lcom/google/android/gms/internal/measurement/Z4;)I

    move-result v0

    :goto_4
    add-int/2addr v12, v0

    :cond_4
    :goto_5
    const/4 v15, 0x0

    goto/16 :goto_14

    :pswitch_1
    invoke-virtual {v6, v7, v13, v11}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {v7, v1, v2}, Lcom/google/android/gms/internal/measurement/M4;->L(Ljava/lang/Object;J)J

    move-result-wide v0

    :goto_6
    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/measurement/J3;->i0(IJ)I

    move-result v0

    goto :goto_4

    :pswitch_2
    invoke-virtual {v6, v7, v13, v11}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {v7, v1, v2}, Lcom/google/android/gms/internal/measurement/M4;->H(Ljava/lang/Object;J)I

    move-result v0

    :goto_7
    invoke-static {v13, v0}, Lcom/google/android/gms/internal/measurement/J3;->t0(II)I

    move-result v0

    goto :goto_4

    :pswitch_3
    invoke-virtual {v6, v7, v13, v11}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_8
    invoke-static {v13, v9, v10}, Lcom/google/android/gms/internal/measurement/J3;->e0(IJ)I

    move-result v0

    goto :goto_4

    :pswitch_4
    invoke-virtual {v6, v7, v13, v11}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_9
    const/4 v0, 0x0

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/measurement/J3;->p0(II)I

    move-result v1

    :goto_a
    add-int/2addr v12, v1

    goto :goto_5

    :pswitch_5
    invoke-virtual {v6, v7, v13, v11}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {v7, v1, v2}, Lcom/google/android/gms/internal/measurement/M4;->H(Ljava/lang/Object;J)I

    move-result v0

    :goto_b
    invoke-static {v13, v0}, Lcom/google/android/gms/internal/measurement/J3;->d0(II)I

    move-result v0

    goto :goto_4

    :pswitch_6
    invoke-virtual {v6, v7, v13, v11}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {v7, v1, v2}, Lcom/google/android/gms/internal/measurement/M4;->H(Ljava/lang/Object;J)I

    move-result v0

    :goto_c
    invoke-static {v13, v0}, Lcom/google/android/gms/internal/measurement/J3;->w0(II)I

    move-result v0

    goto :goto_4

    :pswitch_7
    invoke-virtual {v6, v7, v13, v11}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    :goto_d
    check-cast v0, Lcom/google/android/gms/internal/measurement/q3;

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/measurement/J3;->Q(ILcom/google/android/gms/internal/measurement/q3;)I

    move-result v0

    goto :goto_4

    :pswitch_8
    invoke-virtual {v6, v7, v13, v11}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    :goto_e
    invoke-virtual {v6, v11}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v1

    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/measurement/a5;->a(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/Z4;)I

    move-result v0

    goto :goto_4

    :pswitch_9
    invoke-virtual {v6, v7, v13, v11}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/q3;

    if-eqz v1, :cond_5

    :goto_f
    goto :goto_d

    :cond_5
    check-cast v0, Ljava/lang/String;

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/measurement/J3;->y(ILjava/lang/String;)I

    move-result v0

    goto/16 :goto_4

    :pswitch_a
    invoke-virtual {v6, v7, v13, v11}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_10
    invoke-static {v13, v15}, Lcom/google/android/gms/internal/measurement/J3;->z(IZ)I

    move-result v0

    goto/16 :goto_4

    :pswitch_b
    invoke-virtual {v6, v7, v13, v11}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/measurement/J3;->h0(II)I

    move-result v1

    goto :goto_a

    :pswitch_c
    invoke-virtual {v6, v7, v13, v11}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {v13, v9, v10}, Lcom/google/android/gms/internal/measurement/J3;->P(IJ)I

    move-result v0

    goto/16 :goto_4

    :pswitch_d
    invoke-virtual {v6, v7, v13, v11}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {v7, v1, v2}, Lcom/google/android/gms/internal/measurement/M4;->H(Ljava/lang/Object;J)I

    move-result v0

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/measurement/J3;->l0(II)I

    move-result v0

    goto/16 :goto_4

    :pswitch_e
    invoke-virtual {v6, v7, v13, v11}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {v7, v1, v2}, Lcom/google/android/gms/internal/measurement/M4;->L(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/measurement/J3;->m0(IJ)I

    move-result v0

    goto/16 :goto_4

    :pswitch_f
    invoke-virtual {v6, v7, v13, v11}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {v7, v1, v2}, Lcom/google/android/gms/internal/measurement/M4;->L(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/measurement/J3;->Y(IJ)I

    move-result v0

    goto/16 :goto_4

    :pswitch_10
    invoke-virtual {v6, v7, v13, v11}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {v13, v4}, Lcom/google/android/gms/internal/measurement/J3;->f(IF)I

    move-result v0

    goto/16 :goto_4

    :pswitch_11
    invoke-virtual {v6, v7, v13, v11}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    const-wide/16 v0, 0x0

    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/measurement/J3;->e(ID)I

    move-result v0

    goto/16 :goto_4

    :pswitch_12
    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->q:Lcom/google/android/gms/internal/measurement/F4;

    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v6, v11}, Lcom/google/android/gms/internal/measurement/M4;->Q(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v13, v1, v2}, Lcom/google/android/gms/internal/measurement/F4;->i(ILjava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_4

    :pswitch_13
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {v6, v11}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v1

    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/measurement/a5;->c(ILjava/util/List;Lcom/google/android/gms/internal/measurement/Z4;)I

    move-result v0

    goto/16 :goto_4

    :pswitch_14
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/a5;->R(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    :goto_11
    invoke-static {v13}, Lcom/google/android/gms/internal/measurement/J3;->s0(I)I

    move-result v1

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/J3;->v0(I)I

    move-result v2

    add-int/2addr v1, v2

    add-int/2addr v1, v0

    goto/16 :goto_a

    :pswitch_15
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/a5;->O(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto :goto_11

    :pswitch_16
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/a5;->D(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto :goto_11

    :pswitch_17
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/a5;->z(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto :goto_11

    :pswitch_18
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/a5;->t(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto :goto_11

    :pswitch_19
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/a5;->U(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto :goto_11

    :pswitch_1a
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/a5;->e(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto :goto_11

    :pswitch_1b
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/a5;->z(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto :goto_11

    :pswitch_1c
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/a5;->D(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto :goto_11

    :pswitch_1d
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/a5;->H(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto/16 :goto_11

    :pswitch_1e
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/a5;->X(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto/16 :goto_11

    :pswitch_1f
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/a5;->L(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto/16 :goto_11

    :pswitch_20
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/a5;->z(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto/16 :goto_11

    :pswitch_21
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/a5;->D(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto/16 :goto_11

    :pswitch_22
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v3, 0x0

    invoke-static {v13, v0, v3}, Lcom/google/android/gms/internal/measurement/a5;->Q(ILjava/util/List;Z)I

    move-result v0

    :goto_12
    add-int/2addr v12, v0

    move v15, v3

    goto/16 :goto_14

    :pswitch_23
    const/4 v3, 0x0

    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v13, v0, v3}, Lcom/google/android/gms/internal/measurement/a5;->N(ILjava/util/List;Z)I

    move-result v0

    goto :goto_12

    :pswitch_24
    const/4 v3, 0x0

    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v13, v0, v3}, Lcom/google/android/gms/internal/measurement/a5;->C(ILjava/util/List;Z)I

    move-result v0

    goto :goto_12

    :pswitch_25
    const/4 v3, 0x0

    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v13, v0, v3}, Lcom/google/android/gms/internal/measurement/a5;->y(ILjava/util/List;Z)I

    move-result v0

    goto :goto_12

    :pswitch_26
    const/4 v3, 0x0

    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v13, v0, v3}, Lcom/google/android/gms/internal/measurement/a5;->s(ILjava/util/List;Z)I

    move-result v0

    goto :goto_12

    :pswitch_27
    const/4 v3, 0x0

    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v13, v0, v3}, Lcom/google/android/gms/internal/measurement/a5;->T(ILjava/util/List;Z)I

    move-result v0

    goto/16 :goto_4

    :pswitch_28
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/measurement/a5;->b(ILjava/util/List;)I

    move-result v0

    goto/16 :goto_4

    :pswitch_29
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {v6, v11}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v1

    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/measurement/a5;->r(ILjava/util/List;Lcom/google/android/gms/internal/measurement/Z4;)I

    move-result v0

    goto/16 :goto_4

    :pswitch_2a
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/measurement/a5;->q(ILjava/util/List;)I

    move-result v0

    goto/16 :goto_4

    :pswitch_2b
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v3, 0x0

    invoke-static {v13, v0, v3}, Lcom/google/android/gms/internal/measurement/a5;->d(ILjava/util/List;Z)I

    move-result v0

    goto :goto_12

    :pswitch_2c
    const/4 v3, 0x0

    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v13, v0, v3}, Lcom/google/android/gms/internal/measurement/a5;->G(ILjava/util/List;Z)I

    move-result v0

    goto/16 :goto_12

    :pswitch_2d
    const/4 v3, 0x0

    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v13, v0, v3}, Lcom/google/android/gms/internal/measurement/a5;->W(ILjava/util/List;Z)I

    move-result v0

    goto/16 :goto_12

    :pswitch_2e
    const/4 v3, 0x0

    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v13, v0, v3}, Lcom/google/android/gms/internal/measurement/a5;->K(ILjava/util/List;Z)I

    move-result v0

    goto/16 :goto_12

    :pswitch_2f
    const/4 v3, 0x0

    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v13, v0, v3}, Lcom/google/android/gms/internal/measurement/a5;->C(ILjava/util/List;Z)I

    move-result v0

    goto/16 :goto_4

    :pswitch_30
    move-object/from16 v0, p0

    move-wide v9, v1

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    goto/16 :goto_3

    :pswitch_31
    move-wide v9, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v0

    goto/16 :goto_6

    :pswitch_32
    move-wide v9, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    goto/16 :goto_7

    :pswitch_33
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_8

    :pswitch_34
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_9

    :pswitch_35
    move-wide v9, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    goto/16 :goto_b

    :pswitch_36
    move-wide v9, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    goto/16 :goto_c

    :pswitch_37
    move-wide v9, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    goto/16 :goto_d

    :pswitch_38
    move-wide v9, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    goto/16 :goto_e

    :pswitch_39
    move-wide v9, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/q3;

    if-eqz v1, :cond_5

    goto/16 :goto_f

    :pswitch_3a
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_10

    :pswitch_3b
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v15, 0x0

    invoke-static {v13, v15}, Lcom/google/android/gms/internal/measurement/J3;->h0(II)I

    move-result v0

    :goto_13
    add-int/2addr v12, v0

    goto/16 :goto_14

    :pswitch_3c
    const/4 v15, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {v13, v9, v10}, Lcom/google/android/gms/internal/measurement/J3;->P(IJ)I

    move-result v0

    goto :goto_13

    :pswitch_3d
    move-wide v9, v1

    const/4 v15, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/measurement/J3;->l0(II)I

    move-result v0

    goto :goto_13

    :pswitch_3e
    move-wide v9, v1

    const/4 v15, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/measurement/J3;->m0(IJ)I

    move-result v0

    goto :goto_13

    :pswitch_3f
    move-wide v9, v1

    const/4 v15, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/measurement/J3;->Y(IJ)I

    move-result v0

    goto :goto_13

    :pswitch_40
    const/4 v15, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move v9, v4

    move/from16 v4, v16

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {v13, v9}, Lcom/google/android/gms/internal/measurement/J3;->f(IF)I

    move-result v0

    goto :goto_13

    :pswitch_41
    const/4 v15, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_6

    const-wide/16 v0, 0x0

    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/measurement/J3;->e(ID)I

    move-result v0

    goto/16 :goto_13

    :cond_6
    :goto_14
    add-int/lit8 v11, v11, 0x3

    move v0, v14

    move/from16 v1, v16

    const v10, 0xfffff

    goto/16 :goto_0

    :cond_7
    const/4 v15, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->o:Lcom/google/android/gms/internal/measurement/x5;

    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/measurement/x5;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/x5;->a(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v12, v0

    iget-boolean v0, v6, Lcom/google/android/gms/internal/measurement/M4;->f:Z

    if-eqz v0, :cond_a

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->p:Lcom/google/android/gms/internal/measurement/O3;

    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/measurement/O3;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/S3;

    move-result-object v0

    move v9, v15

    :goto_15
    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/S3;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d5;->g()I

    move-result v1

    const/4 v2, 0x0

    if-ge v9, v1, :cond_8

    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/S3;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v1, v9}, Lcom/google/android/gms/internal/measurement/d5;->h(I)Ljava/util/Map$Entry;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/measurement/S3;->b(Lcom/google/android/gms/internal/measurement/U3;Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v15, v1

    add-int/lit8 v9, v9, 0x1

    goto :goto_15

    :cond_8
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/S3;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d5;->j()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/measurement/S3;->b(Lcom/google/android/gms/internal/measurement/U3;Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v15, v1

    goto :goto_16

    :cond_9
    add-int/2addr v12, v15

    :cond_a
    return v12

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
    iget v2, v6, Lcom/google/android/gms/internal/measurement/M4;->k:I

    const/4 v3, 0x1

    if-ge v10, v2, :cond_a

    iget-object v2, v6, Lcom/google/android/gms/internal/measurement/M4;->j:[I

    aget v11, v2, v10

    iget-object v2, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v12, v2, v11

    invoke-virtual {v6, v11}, Lcom/google/android/gms/internal/measurement/M4;->G(I)I

    move-result v13

    iget-object v2, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    add-int/lit8 v4, v11, 0x2

    aget v2, v2, v4

    and-int v4, v2, v8

    ushr-int/lit8 v2, v2, 0x14

    shl-int v14, v3, v2

    if-eq v4, v0, :cond_1

    if-eq v4, v8, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/measurement/M4;->s:Lsun/misc/Unsafe;

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
    const/high16 v0, 0x10000000

    and-int/2addr v0, v13

    if-eqz v0, :cond_2

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v15

    move/from16 v4, v16

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-nez v0, :cond_2

    return v9

    :cond_2
    const/high16 v0, 0xff00000

    and-int/2addr v0, v13

    ushr-int/lit8 v0, v0, 0x14

    const/16 v1, 0x9

    if-eq v0, v1, :cond_8

    const/16 v1, 0x11

    if-eq v0, v1, :cond_8

    const/16 v1, 0x1b

    if-eq v0, v1, :cond_6

    const/16 v1, 0x3c

    if-eq v0, v1, :cond_5

    const/16 v1, 0x44

    if-eq v0, v1, :cond_5

    const/16 v1, 0x31

    if-eq v0, v1, :cond_6

    const/16 v1, 0x32

    if-eq v0, v1, :cond_3

    goto/16 :goto_3

    :cond_3
    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->q:Lcom/google/android/gms/internal/measurement/F4;

    and-int v1, v13, v8

    int-to-long v1, v1

    invoke-static {v7, v1, v2}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/measurement/F4;->c(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v6, v11}, Lcom/google/android/gms/internal/measurement/M4;->Q(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, v6, Lcom/google/android/gms/internal/measurement/M4;->q:Lcom/google/android/gms/internal/measurement/F4;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/measurement/F4;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/D4;

    const/4 v0, 0x0

    throw v0

    :cond_5
    invoke-virtual {v6, v7, v12, v11}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {v6, v11}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v0

    invoke-static {v7, v13, v0}, Lcom/google/android/gms/internal/measurement/M4;->A(Ljava/lang/Object;ILcom/google/android/gms/internal/measurement/Z4;)Z

    move-result v0

    if-nez v0, :cond_9

    return v9

    :cond_6
    and-int v0, v13, v8

    int-to-long v0, v0

    invoke-static {v7, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_9

    invoke-virtual {v6, v11}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v1

    move v2, v9

    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_9

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/measurement/Z4;->c(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    return v9

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_8
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v15

    move/from16 v4, v16

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {v6, v11}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v0

    invoke-static {v7, v13, v0}, Lcom/google/android/gms/internal/measurement/M4;->A(Ljava/lang/Object;ILcom/google/android/gms/internal/measurement/Z4;)Z

    move-result v0

    if-nez v0, :cond_9

    return v9

    :cond_9
    :goto_3
    add-int/lit8 v10, v10, 0x1

    move v0, v15

    move/from16 v1, v16

    goto/16 :goto_0

    :cond_a
    iget-boolean v0, v6, Lcom/google/android/gms/internal/measurement/M4;->f:Z

    if-eqz v0, :cond_b

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->p:Lcom/google/android/gms/internal/measurement/O3;

    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/measurement/O3;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/S3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/S3;->n()Z

    move-result v0

    if-nez v0, :cond_b

    return v9

    :cond_b
    return v3
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/M4;->R(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    array-length v1, v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/M4;->G(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v2, v1

    int-to-long v2, v2

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v0

    const/high16 v5, 0xff00000

    and-int/2addr v1, v5

    ushr-int/lit8 v1, v1, 0x14

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_6

    :pswitch_0
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/measurement/M4;->F(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_6

    :pswitch_1
    invoke-virtual {p0, p2, v4, v0}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_1
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/measurement/D5;->j(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v4, v0}, Lcom/google/android/gms/internal/measurement/M4;->E(Ljava/lang/Object;II)V

    goto/16 :goto_6

    :pswitch_2
    invoke-virtual {p0, p2, v4, v0}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :pswitch_3
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/M4;->q:Lcom/google/android/gms/internal/measurement/F4;

    invoke-static {v1, p1, p2, v2, v3}, Lcom/google/android/gms/internal/measurement/a5;->m(Lcom/google/android/gms/internal/measurement/F4;Ljava/lang/Object;Ljava/lang/Object;J)V

    goto/16 :goto_6

    :pswitch_4
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/M4;->n:Lcom/google/android/gms/internal/measurement/q4;

    invoke-virtual {v1, p1, p2, v2, v3}, Lcom/google/android/gms/internal/measurement/q4;->b(Ljava/lang/Object;Ljava/lang/Object;J)V

    goto/16 :goto_6

    :pswitch_5
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/measurement/M4;->y(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_6

    :pswitch_6
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_2
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/measurement/D5;->x(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/measurement/D5;->i(Ljava/lang/Object;JJ)V

    :goto_3
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/M4;->D(Ljava/lang/Object;I)V

    goto/16 :goto_6

    :pswitch_7
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_4
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/measurement/D5;->h(Ljava/lang/Object;JI)V

    goto :goto_3

    :pswitch_8
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :pswitch_9
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    :pswitch_a
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    :pswitch_b
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    :pswitch_c
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_5
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/measurement/D5;->j(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_3

    :pswitch_d
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_5

    :pswitch_e
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/measurement/D5;->F(Ljava/lang/Object;J)Z

    move-result v1

    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/measurement/D5;->v(Ljava/lang/Object;JZ)V

    goto :goto_3

    :pswitch_f
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    :pswitch_10
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :pswitch_11
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    :pswitch_12
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :pswitch_13
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :pswitch_14
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/measurement/D5;->n(Ljava/lang/Object;J)F

    move-result v1

    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/measurement/D5;->g(Ljava/lang/Object;JF)V

    goto/16 :goto_3

    :pswitch_15
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/measurement/D5;->a(Ljava/lang/Object;J)D

    move-result-wide v4

    invoke-static {p1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/measurement/D5;->f(Ljava/lang/Object;JD)V

    goto/16 :goto_3

    :cond_0
    :goto_6
    add-int/lit8 v0, v0, 0x3

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->o:Lcom/google/android/gms/internal/measurement/x5;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/a5;->n(Lcom/google/android/gms/internal/measurement/x5;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/M4;->f:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->p:Lcom/google/android/gms/internal/measurement/O3;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/a5;->l(Lcom/google/android/gms/internal/measurement/O3;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
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

.method public final e(Ljava/lang/Object;)V
    .locals 7

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/M4;->T(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/Y3;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/measurement/Y3;

    const v2, 0x7fffffff

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/j3;->j(I)V

    iput v1, v0, Lcom/google/android/gms/internal/measurement/j3;->zza:I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/Y3;->D()V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    array-length v0, v0

    :goto_0
    if-ge v1, v0, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/M4;->G(I)I

    move-result v2

    const v3, 0xfffff

    and-int/2addr v3, v2

    int-to-long v3, v3

    const/high16 v5, 0xff00000

    and-int/2addr v2, v5

    ushr-int/lit8 v2, v2, 0x14

    const/16 v5, 0x9

    if-eq v2, v5, :cond_3

    const/16 v5, 0x3c

    if-eq v2, v5, :cond_2

    const/16 v5, 0x44

    if-eq v2, v5, :cond_2

    packed-switch v2, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    sget-object v2, Lcom/google/android/gms/internal/measurement/M4;->s:Lsun/misc/Unsafe;

    invoke-virtual {v2, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_4

    iget-object v6, p0, Lcom/google/android/gms/internal/measurement/M4;->q:Lcom/google/android/gms/internal/measurement/F4;

    invoke-interface {v6, v5}, Lcom/google/android/gms/internal/measurement/F4;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2, p1, v3, v4, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_2

    :pswitch_1
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/M4;->n:Lcom/google/android/gms/internal/measurement/q4;

    invoke-virtual {v2, p1, v3, v4}, Lcom/google/android/gms/internal/measurement/q4;->d(Ljava/lang/Object;J)V

    goto :goto_2

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v2, v2, v1

    invoke-virtual {p0, p1, v2, v1}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_4

    :goto_1
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v2

    sget-object v5, Lcom/google/android/gms/internal/measurement/M4;->s:Lsun/misc/Unsafe;

    invoke-virtual {v5, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/measurement/Z4;->e(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    :pswitch_2
    invoke-virtual {p0, p1, v1}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    :goto_2
    add-int/lit8 v1, v1, 0x3

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->o:Lcom/google/android/gms/internal/measurement/x5;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/x5;->l(Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/M4;->f:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->p:Lcom/google/android/gms/internal/measurement/O3;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/O3;->f(Ljava/lang/Object;)V

    :cond_6
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

.method public final f(Ljava/lang/Object;)I
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/M4;->G(I)I

    move-result v3

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v1

    const v5, 0xfffff

    and-int/2addr v5, v3

    int-to-long v5, v5

    const/high16 v7, 0xff00000

    and-int/2addr v3, v7

    ushr-int/lit8 v3, v3, 0x14

    const/16 v7, 0x25

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_b

    :pswitch_0
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_1
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    mul-int/lit8 v2, v2, 0x35

    :goto_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v2, v3

    goto/16 :goto_b

    :pswitch_1
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_4
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/M4;->L(Ljava/lang/Object;J)J

    move-result-wide v3

    :goto_5
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/a4;->b(J)I

    move-result v3

    goto :goto_3

    :pswitch_2
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_6
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/M4;->H(Ljava/lang/Object;J)I

    move-result v3

    goto :goto_3

    :pswitch_3
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_4

    :pswitch_4
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_6

    :pswitch_5
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_6

    :pswitch_6
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_6

    :pswitch_7
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :pswitch_8
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    goto :goto_2

    :pswitch_9
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :pswitch_a
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :pswitch_b
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto :goto_3

    :pswitch_c
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/M4;->P(Ljava/lang/Object;J)Z

    move-result v3

    :goto_7
    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/a4;->c(Z)I

    move-result v3

    goto :goto_3

    :pswitch_d
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_6

    :pswitch_e
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_4

    :pswitch_f
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_6

    :pswitch_10
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :pswitch_11
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :pswitch_12
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/M4;->B(Ljava/lang/Object;J)F

    move-result v3

    :goto_8
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    goto/16 :goto_3

    :pswitch_13
    invoke-virtual {p0, p1, v4, v1}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/M4;->j(Ljava/lang/Object;J)D

    move-result-wide v3

    :goto_9
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    goto/16 :goto_5

    :pswitch_14
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

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

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->x(Ljava/lang/Object;J)J

    move-result-wide v3

    goto/16 :goto_5

    :pswitch_16
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_17
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_a

    :pswitch_18
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->F(Ljava/lang/Object;J)Z

    move-result v3

    goto :goto_7

    :pswitch_19
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->n(Ljava/lang/Object;J)F

    move-result v3

    goto :goto_8

    :pswitch_1a
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->a(Ljava/lang/Object;J)D

    move-result-wide v3

    goto :goto_9

    :cond_1
    :goto_b
    add-int/lit8 v1, v1, 0x3

    goto/16 :goto_0

    :cond_2
    mul-int/lit8 v2, v2, 0x35

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->o:Lcom/google/android/gms/internal/measurement/x5;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/x5;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v2, v0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/M4;->f:Z

    if-eqz v0, :cond_3

    mul-int/lit8 v2, v2, 0x35

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->p:Lcom/google/android/gms/internal/measurement/O3;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/O3;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/S3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/S3;->hashCode()I

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

.method public final g(Ljava/lang/Object;[BIILcom/google/android/gms/internal/measurement/p3;)V
    .locals 7

    .line 1
    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/measurement/M4;->m(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/measurement/p3;)I

    return-void
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/measurement/M4;->G(I)I

    move-result v3

    const v4, 0xfffff

    and-int v5, v3, v4

    int-to-long v5, v5

    const/high16 v7, 0xff00000

    and-int/2addr v3, v7

    ushr-int/lit8 v3, v3, 0x14

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/measurement/M4;->C(I)I

    move-result v3

    and-int/2addr v3, v4

    int-to-long v3, v3

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result v7

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result v3

    if-ne v7, v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/a5;->p(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_2

    :pswitch_1
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/a5;->p(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_2

    :pswitch_2
    invoke-virtual {p0, p1, p2, v2}, Lcom/google/android/gms/internal/measurement/M4;->K(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/a5;->p(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_2

    :pswitch_3
    invoke-virtual {p0, p1, p2, v2}, Lcom/google/android/gms/internal/measurement/M4;->K(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->x(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->x(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :pswitch_4
    invoke-virtual {p0, p1, p2, v2}, Lcom/google/android/gms/internal/measurement/M4;->K(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result v4

    if-eq v3, v4, :cond_0

    goto/16 :goto_2

    :pswitch_5
    invoke-virtual {p0, p1, p2, v2}, Lcom/google/android/gms/internal/measurement/M4;->K(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->x(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->x(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :pswitch_6
    invoke-virtual {p0, p1, p2, v2}, Lcom/google/android/gms/internal/measurement/M4;->K(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result v4

    if-eq v3, v4, :cond_0

    goto/16 :goto_2

    :pswitch_7
    invoke-virtual {p0, p1, p2, v2}, Lcom/google/android/gms/internal/measurement/M4;->K(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result v4

    if-eq v3, v4, :cond_0

    goto/16 :goto_2

    :pswitch_8
    invoke-virtual {p0, p1, p2, v2}, Lcom/google/android/gms/internal/measurement/M4;->K(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result v4

    if-eq v3, v4, :cond_0

    goto/16 :goto_2

    :pswitch_9
    invoke-virtual {p0, p1, p2, v2}, Lcom/google/android/gms/internal/measurement/M4;->K(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/a5;->p(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_2

    :pswitch_a
    invoke-virtual {p0, p1, p2, v2}, Lcom/google/android/gms/internal/measurement/M4;->K(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/a5;->p(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_2

    :pswitch_b
    invoke-virtual {p0, p1, p2, v2}, Lcom/google/android/gms/internal/measurement/M4;->K(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/a5;->p(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_2

    :pswitch_c
    invoke-virtual {p0, p1, p2, v2}, Lcom/google/android/gms/internal/measurement/M4;->K(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->F(Ljava/lang/Object;J)Z

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->F(Ljava/lang/Object;J)Z

    move-result v4

    if-eq v3, v4, :cond_0

    goto/16 :goto_2

    :pswitch_d
    invoke-virtual {p0, p1, p2, v2}, Lcom/google/android/gms/internal/measurement/M4;->K(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result v4

    if-eq v3, v4, :cond_0

    goto/16 :goto_2

    :pswitch_e
    invoke-virtual {p0, p1, p2, v2}, Lcom/google/android/gms/internal/measurement/M4;->K(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->x(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->x(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :pswitch_f
    invoke-virtual {p0, p1, p2, v2}, Lcom/google/android/gms/internal/measurement/M4;->K(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result v4

    if-eq v3, v4, :cond_0

    goto :goto_2

    :pswitch_10
    invoke-virtual {p0, p1, p2, v2}, Lcom/google/android/gms/internal/measurement/M4;->K(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->x(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->x(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-eqz v3, :cond_0

    goto :goto_2

    :pswitch_11
    invoke-virtual {p0, p1, p2, v2}, Lcom/google/android/gms/internal/measurement/M4;->K(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->x(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->x(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-eqz v3, :cond_0

    goto :goto_2

    :pswitch_12
    invoke-virtual {p0, p1, p2, v2}, Lcom/google/android/gms/internal/measurement/M4;->K(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->n(Ljava/lang/Object;J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->n(Ljava/lang/Object;J)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    if-eq v3, v4, :cond_0

    goto :goto_2

    :pswitch_13
    invoke-virtual {p0, p1, p2, v2}, Lcom/google/android/gms/internal/measurement/M4;->K(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->a(Ljava/lang/Object;J)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/measurement/D5;->a(Ljava/lang/Object;J)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-eqz v3, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    add-int/lit8 v2, v2, 0x3

    goto/16 :goto_0

    :cond_1
    :goto_2
    return v1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->o:Lcom/google/android/gms/internal/measurement/x5;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/x5;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/M4;->o:Lcom/google/android/gms/internal/measurement/x5;

    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/measurement/x5;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    return v1

    :cond_3
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/M4;->f:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->p:Lcom/google/android/gms/internal/measurement/O3;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/O3;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/S3;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->p:Lcom/google/android/gms/internal/measurement/O3;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/measurement/O3;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/S3;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/S3;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    const/4 p1, 0x1

    return p1

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

.method public final i(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/T5;)V
    .locals 23

    .line 1
    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/measurement/T5;->a()I

    move-result v0

    sget v1, Lcom/google/android/gms/internal/measurement/W5;->b:I

    const/high16 v9, 0xff00000

    const/4 v11, 0x1

    const/4 v12, 0x0

    const v13, 0xfffff

    if-ne v0, v1, :cond_7

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->o:Lcom/google/android/gms/internal/measurement/x5;

    invoke-static {v0, v7, v8}, Lcom/google/android/gms/internal/measurement/M4;->u(Lcom/google/android/gms/internal/measurement/x5;Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/T5;)V

    iget-boolean v0, v6, Lcom/google/android/gms/internal/measurement/M4;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->p:Lcom/google/android/gms/internal/measurement/O3;

    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/measurement/O3;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/S3;

    move-result-object v0

    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/S3;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/S3;->i()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    array-length v2, v2

    add-int/lit8 v2, v2, -0x3

    :goto_1
    if-ltz v2, :cond_4

    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/measurement/M4;->G(I)I

    move-result v3

    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    :goto_2
    if-eqz v1, :cond_2

    iget-object v5, v6, Lcom/google/android/gms/internal/measurement/M4;->p:Lcom/google/android/gms/internal/measurement/O3;

    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/measurement/O3;->a(Ljava/util/Map$Entry;)I

    move-result v5

    if-le v5, v4, :cond_2

    iget-object v5, v6, Lcom/google/android/gms/internal/measurement/M4;->p:Lcom/google/android/gms/internal/measurement/O3;

    invoke-virtual {v5, v8, v1}, Lcom/google/android/gms/internal/measurement/O3;->c(Lcom/google/android/gms/internal/measurement/T5;Ljava/util/Map$Entry;)V

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    goto :goto_2

    :cond_1
    const/4 v1, 0x0

    goto :goto_2

    :cond_2
    and-int v5, v3, v9

    ushr-int/lit8 v5, v5, 0x14

    packed-switch v5, :pswitch_data_0

    goto/16 :goto_15

    :pswitch_0
    invoke-virtual {v6, v7, v4, v2}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    :goto_3
    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v5

    invoke-interface {v8, v4, v3, v5}, Lcom/google/android/gms/internal/measurement/T5;->C(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/Z4;)V

    goto/16 :goto_15

    :pswitch_1
    invoke-virtual {v6, v7, v4, v2}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/M4;->L(Ljava/lang/Object;J)J

    move-result-wide v14

    :goto_4
    invoke-interface {v8, v4, v14, v15}, Lcom/google/android/gms/internal/measurement/T5;->A(IJ)V

    goto/16 :goto_15

    :pswitch_2
    invoke-virtual {v6, v7, v4, v2}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/M4;->H(Ljava/lang/Object;J)I

    move-result v3

    :goto_5
    invoke-interface {v8, v4, v3}, Lcom/google/android/gms/internal/measurement/T5;->G(II)V

    goto/16 :goto_15

    :pswitch_3
    invoke-virtual {v6, v7, v4, v2}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/M4;->L(Ljava/lang/Object;J)J

    move-result-wide v14

    :goto_6
    invoke-interface {v8, v4, v14, v15}, Lcom/google/android/gms/internal/measurement/T5;->s(IJ)V

    goto/16 :goto_15

    :pswitch_4
    invoke-virtual {v6, v7, v4, v2}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/M4;->H(Ljava/lang/Object;J)I

    move-result v3

    :goto_7
    invoke-interface {v8, v4, v3}, Lcom/google/android/gms/internal/measurement/T5;->x(II)V

    goto/16 :goto_15

    :pswitch_5
    invoke-virtual {v6, v7, v4, v2}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/M4;->H(Ljava/lang/Object;J)I

    move-result v3

    :goto_8
    invoke-interface {v8, v4, v3}, Lcom/google/android/gms/internal/measurement/T5;->K(II)V

    goto/16 :goto_15

    :pswitch_6
    invoke-virtual {v6, v7, v4, v2}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/M4;->H(Ljava/lang/Object;J)I

    move-result v3

    :goto_9
    invoke-interface {v8, v4, v3}, Lcom/google/android/gms/internal/measurement/T5;->h(II)V

    goto/16 :goto_15

    :pswitch_7
    invoke-virtual {v6, v7, v4, v2}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    :goto_a
    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/q3;

    invoke-interface {v8, v4, v3}, Lcom/google/android/gms/internal/measurement/T5;->f(ILcom/google/android/gms/internal/measurement/q3;)V

    goto/16 :goto_15

    :pswitch_8
    invoke-virtual {v6, v7, v4, v2}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    :goto_b
    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v5

    invoke-interface {v8, v4, v3, v5}, Lcom/google/android/gms/internal/measurement/T5;->d(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/Z4;)V

    goto/16 :goto_15

    :pswitch_9
    invoke-virtual {v6, v7, v4, v2}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    :goto_c
    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4, v3, v8}, Lcom/google/android/gms/internal/measurement/M4;->t(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/T5;)V

    goto/16 :goto_15

    :pswitch_a
    invoke-virtual {v6, v7, v4, v2}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/M4;->P(Ljava/lang/Object;J)Z

    move-result v3

    :goto_d
    invoke-interface {v8, v4, v3}, Lcom/google/android/gms/internal/measurement/T5;->c(IZ)V

    goto/16 :goto_15

    :pswitch_b
    invoke-virtual {v6, v7, v4, v2}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/M4;->H(Ljava/lang/Object;J)I

    move-result v3

    :goto_e
    invoke-interface {v8, v4, v3}, Lcom/google/android/gms/internal/measurement/T5;->k(II)V

    goto/16 :goto_15

    :pswitch_c
    invoke-virtual {v6, v7, v4, v2}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/M4;->L(Ljava/lang/Object;J)J

    move-result-wide v14

    :goto_f
    invoke-interface {v8, v4, v14, v15}, Lcom/google/android/gms/internal/measurement/T5;->M(IJ)V

    goto/16 :goto_15

    :pswitch_d
    invoke-virtual {v6, v7, v4, v2}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/M4;->H(Ljava/lang/Object;J)I

    move-result v3

    :goto_10
    invoke-interface {v8, v4, v3}, Lcom/google/android/gms/internal/measurement/T5;->r(II)V

    goto/16 :goto_15

    :pswitch_e
    invoke-virtual {v6, v7, v4, v2}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/M4;->L(Ljava/lang/Object;J)J

    move-result-wide v14

    :goto_11
    invoke-interface {v8, v4, v14, v15}, Lcom/google/android/gms/internal/measurement/T5;->I(IJ)V

    goto/16 :goto_15

    :pswitch_f
    invoke-virtual {v6, v7, v4, v2}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/M4;->L(Ljava/lang/Object;J)J

    move-result-wide v14

    :goto_12
    invoke-interface {v8, v4, v14, v15}, Lcom/google/android/gms/internal/measurement/T5;->j(IJ)V

    goto/16 :goto_15

    :pswitch_10
    invoke-virtual {v6, v7, v4, v2}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/M4;->B(Ljava/lang/Object;J)F

    move-result v3

    :goto_13
    invoke-interface {v8, v4, v3}, Lcom/google/android/gms/internal/measurement/T5;->O(IF)V

    goto/16 :goto_15

    :pswitch_11
    invoke-virtual {v6, v7, v4, v2}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/M4;->j(Ljava/lang/Object;J)D

    move-result-wide v14

    :goto_14
    invoke-interface {v8, v4, v14, v15}, Lcom/google/android/gms/internal/measurement/T5;->N(ID)V

    goto/16 :goto_15

    :pswitch_12
    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v6, v8, v4, v3, v2}, Lcom/google/android/gms/internal/measurement/M4;->v(Lcom/google/android/gms/internal/measurement/T5;ILjava/lang/Object;I)V

    goto/16 :goto_15

    :pswitch_13
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v5

    invoke-static {v4, v3, v8, v5}, Lcom/google/android/gms/internal/measurement/a5;->j(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Lcom/google/android/gms/internal/measurement/Z4;)V

    goto/16 :goto_15

    :pswitch_14
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/measurement/a5;->a0(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_15
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/measurement/a5;->Z(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_16
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/measurement/a5;->Y(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_17
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/measurement/a5;->V(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_18
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/measurement/a5;->B(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_19
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/measurement/a5;->b0(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_1a
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/measurement/a5;->k(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_1b
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/measurement/a5;->F(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_1c
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/measurement/a5;->J(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_1d
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/measurement/a5;->P(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_1e
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/measurement/a5;->c0(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_1f
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/measurement/a5;->S(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_20
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/measurement/a5;->M(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_21
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/measurement/a5;->x(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_22
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->a0(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_23
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->Z(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_24
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->Y(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_25
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->V(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_26
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->B(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_27
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->b0(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_28
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8}, Lcom/google/android/gms/internal/measurement/a5;->i(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;)V

    goto/16 :goto_15

    :pswitch_29
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v5

    invoke-static {v4, v3, v8, v5}, Lcom/google/android/gms/internal/measurement/a5;->w(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Lcom/google/android/gms/internal/measurement/Z4;)V

    goto/16 :goto_15

    :pswitch_2a
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8}, Lcom/google/android/gms/internal/measurement/a5;->v(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;)V

    goto/16 :goto_15

    :pswitch_2b
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->k(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_2c
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->F(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_2d
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->J(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_2e
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->P(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_2f
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->c0(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_30
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->S(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_31
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->M(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_32
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->x(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_15

    :pswitch_33
    invoke-virtual {v6, v7, v2}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    goto/16 :goto_3

    :pswitch_34
    invoke-virtual {v6, v7, v2}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->x(Ljava/lang/Object;J)J

    move-result-wide v14

    goto/16 :goto_4

    :pswitch_35
    invoke-virtual {v6, v7, v2}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_5

    :pswitch_36
    invoke-virtual {v6, v7, v2}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->x(Ljava/lang/Object;J)J

    move-result-wide v14

    goto/16 :goto_6

    :pswitch_37
    invoke-virtual {v6, v7, v2}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_7

    :pswitch_38
    invoke-virtual {v6, v7, v2}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_8

    :pswitch_39
    invoke-virtual {v6, v7, v2}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_9

    :pswitch_3a
    invoke-virtual {v6, v7, v2}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    goto/16 :goto_a

    :pswitch_3b
    invoke-virtual {v6, v7, v2}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    goto/16 :goto_b

    :pswitch_3c
    invoke-virtual {v6, v7, v2}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    goto/16 :goto_c

    :pswitch_3d
    invoke-virtual {v6, v7, v2}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->F(Ljava/lang/Object;J)Z

    move-result v3

    goto/16 :goto_d

    :pswitch_3e
    invoke-virtual {v6, v7, v2}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_e

    :pswitch_3f
    invoke-virtual {v6, v7, v2}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->x(Ljava/lang/Object;J)J

    move-result-wide v14

    goto/16 :goto_f

    :pswitch_40
    invoke-virtual {v6, v7, v2}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->t(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_10

    :pswitch_41
    invoke-virtual {v6, v7, v2}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->x(Ljava/lang/Object;J)J

    move-result-wide v14

    goto/16 :goto_11

    :pswitch_42
    invoke-virtual {v6, v7, v2}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->x(Ljava/lang/Object;J)J

    move-result-wide v14

    goto/16 :goto_12

    :pswitch_43
    invoke-virtual {v6, v7, v2}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->n(Ljava/lang/Object;J)F

    move-result v3

    goto/16 :goto_13

    :pswitch_44
    invoke-virtual {v6, v7, v2}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/D5;->a(Ljava/lang/Object;J)D

    move-result-wide v14

    goto/16 :goto_14

    :cond_3
    :goto_15
    add-int/lit8 v2, v2, -0x3

    goto/16 :goto_1

    :cond_4
    :goto_16
    if-eqz v1, :cond_6

    iget-object v2, v6, Lcom/google/android/gms/internal/measurement/M4;->p:Lcom/google/android/gms/internal/measurement/O3;

    invoke-virtual {v2, v8, v1}, Lcom/google/android/gms/internal/measurement/O3;->c(Lcom/google/android/gms/internal/measurement/T5;Ljava/util/Map$Entry;)V

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    goto :goto_16

    :cond_5
    const/4 v1, 0x0

    goto :goto_16

    :cond_6
    return-void

    :cond_7
    iget-boolean v0, v6, Lcom/google/android/gms/internal/measurement/M4;->f:Z

    if-eqz v0, :cond_8

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->p:Lcom/google/android/gms/internal/measurement/O3;

    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/measurement/O3;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/S3;

    move-result-object v0

    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/S3;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/S3;->l()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    move-object v14, v0

    goto :goto_17

    :cond_8
    const/4 v1, 0x0

    const/4 v14, 0x0

    :goto_17
    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    array-length v15, v0

    sget-object v5, Lcom/google/android/gms/internal/measurement/M4;->s:Lsun/misc/Unsafe;

    move v2, v12

    move v4, v2

    move v0, v13

    :goto_18
    if-ge v4, v15, :cond_11

    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/measurement/M4;->G(I)I

    move-result v3

    iget-object v10, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v12, v10, v4

    and-int v17, v3, v9

    ushr-int/lit8 v9, v17, 0x14

    const/16 v11, 0x11

    if-gt v9, v11, :cond_b

    add-int/lit8 v11, v4, 0x2

    aget v10, v10, v11

    and-int v11, v10, v13

    move-object/from16 v19, v14

    if-eq v11, v0, :cond_a

    if-ne v11, v13, :cond_9

    const/4 v2, 0x0

    goto :goto_19

    :cond_9
    int-to-long v13, v11

    invoke-virtual {v5, v7, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    move v2, v0

    :goto_19
    move v0, v11

    :cond_a
    ushr-int/lit8 v10, v10, 0x14

    const/4 v11, 0x1

    shl-int v10, v11, v10

    move-object v11, v1

    move v13, v2

    move v14, v10

    move v10, v0

    goto :goto_1a

    :cond_b
    move-object/from16 v19, v14

    move v10, v0

    move-object v11, v1

    move v13, v2

    const/4 v14, 0x0

    :goto_1a
    if-eqz v11, :cond_d

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->p:Lcom/google/android/gms/internal/measurement/O3;

    invoke-virtual {v0, v11}, Lcom/google/android/gms/internal/measurement/O3;->a(Ljava/util/Map$Entry;)I

    move-result v0

    if-gt v0, v12, :cond_d

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->p:Lcom/google/android/gms/internal/measurement/O3;

    invoke-virtual {v0, v8, v11}, Lcom/google/android/gms/internal/measurement/O3;->c(Lcom/google/android/gms/internal/measurement/T5;Ljava/util/Map$Entry;)V

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    move-object v11, v0

    goto :goto_1a

    :cond_c
    const/4 v11, 0x0

    goto :goto_1a

    :cond_d
    const v18, 0xfffff

    and-int v0, v3, v18

    int-to-long v2, v0

    packed-switch v9, :pswitch_data_1

    :cond_e
    :goto_1b
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    :goto_1c
    move v11, v4

    move-object v15, v5

    goto/16 :goto_1f

    :pswitch_45
    invoke-virtual {v6, v7, v12, v4}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v1

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/measurement/T5;->C(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/Z4;)V

    goto :goto_1b

    :pswitch_46
    invoke-virtual {v6, v7, v12, v4}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/measurement/M4;->L(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/measurement/T5;->A(IJ)V

    goto :goto_1b

    :pswitch_47
    invoke-virtual {v6, v7, v12, v4}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/measurement/M4;->H(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/measurement/T5;->G(II)V

    goto :goto_1b

    :pswitch_48
    invoke-virtual {v6, v7, v12, v4}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/measurement/M4;->L(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/measurement/T5;->s(IJ)V

    goto :goto_1b

    :pswitch_49
    invoke-virtual {v6, v7, v12, v4}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/measurement/M4;->H(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/measurement/T5;->x(II)V

    goto :goto_1b

    :pswitch_4a
    invoke-virtual {v6, v7, v12, v4}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/measurement/M4;->H(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/measurement/T5;->K(II)V

    goto :goto_1b

    :pswitch_4b
    invoke-virtual {v6, v7, v12, v4}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/measurement/M4;->H(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/measurement/T5;->h(II)V

    goto :goto_1b

    :pswitch_4c
    invoke-virtual {v6, v7, v12, v4}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/q3;

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/measurement/T5;->f(ILcom/google/android/gms/internal/measurement/q3;)V

    goto/16 :goto_1b

    :pswitch_4d
    invoke-virtual {v6, v7, v12, v4}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v1

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/measurement/T5;->d(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/Z4;)V

    goto/16 :goto_1b

    :pswitch_4e
    invoke-virtual {v6, v7, v12, v4}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v12, v0, v8}, Lcom/google/android/gms/internal/measurement/M4;->t(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/T5;)V

    goto/16 :goto_1b

    :pswitch_4f
    invoke-virtual {v6, v7, v12, v4}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/measurement/M4;->P(Ljava/lang/Object;J)Z

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/measurement/T5;->c(IZ)V

    goto/16 :goto_1b

    :pswitch_50
    invoke-virtual {v6, v7, v12, v4}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/measurement/M4;->H(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/measurement/T5;->k(II)V

    goto/16 :goto_1b

    :pswitch_51
    invoke-virtual {v6, v7, v12, v4}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/measurement/M4;->L(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/measurement/T5;->M(IJ)V

    goto/16 :goto_1b

    :pswitch_52
    invoke-virtual {v6, v7, v12, v4}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/measurement/M4;->H(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/measurement/T5;->r(II)V

    goto/16 :goto_1b

    :pswitch_53
    invoke-virtual {v6, v7, v12, v4}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/measurement/M4;->L(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/measurement/T5;->I(IJ)V

    goto/16 :goto_1b

    :pswitch_54
    invoke-virtual {v6, v7, v12, v4}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/measurement/M4;->L(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/measurement/T5;->j(IJ)V

    goto/16 :goto_1b

    :pswitch_55
    invoke-virtual {v6, v7, v12, v4}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/measurement/M4;->B(Ljava/lang/Object;J)F

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/measurement/T5;->O(IF)V

    goto/16 :goto_1b

    :pswitch_56
    invoke-virtual {v6, v7, v12, v4}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/measurement/M4;->j(Ljava/lang/Object;J)D

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/measurement/T5;->N(ID)V

    goto/16 :goto_1b

    :pswitch_57
    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v6, v8, v12, v0, v4}, Lcom/google/android/gms/internal/measurement/M4;->v(Lcom/google/android/gms/internal/measurement/T5;ILjava/lang/Object;I)V

    goto/16 :goto_1b

    :pswitch_58
    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v2

    invoke-static {v0, v1, v8, v2}, Lcom/google/android/gms/internal/measurement/a5;->j(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Lcom/google/android/gms/internal/measurement/Z4;)V

    goto/16 :goto_1b

    :pswitch_59
    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/4 v9, 0x1

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/measurement/a5;->a0(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_1b

    :pswitch_5a
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/measurement/a5;->Z(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_1b

    :pswitch_5b
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/measurement/a5;->Y(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_1b

    :pswitch_5c
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/measurement/a5;->V(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_1b

    :pswitch_5d
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/measurement/a5;->B(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_1b

    :pswitch_5e
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/measurement/a5;->b0(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_1b

    :pswitch_5f
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/measurement/a5;->k(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_1b

    :pswitch_60
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/measurement/a5;->F(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_1b

    :pswitch_61
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/measurement/a5;->J(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_1b

    :pswitch_62
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/measurement/a5;->P(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_1b

    :pswitch_63
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/measurement/a5;->c0(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_1b

    :pswitch_64
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/measurement/a5;->S(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_1b

    :pswitch_65
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/measurement/a5;->M(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_1b

    :pswitch_66
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/measurement/a5;->x(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_1b

    :pswitch_67
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/4 v12, 0x0

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->a0(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    :goto_1d
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v16, v12

    move/from16 v21, v15

    goto/16 :goto_1c

    :pswitch_68
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->Z(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto :goto_1d

    :pswitch_69
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->Y(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto :goto_1d

    :pswitch_6a
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->V(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto :goto_1d

    :pswitch_6b
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->B(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto :goto_1d

    :pswitch_6c
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->b0(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto :goto_1d

    :pswitch_6d
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8}, Lcom/google/android/gms/internal/measurement/a5;->i(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;)V

    goto/16 :goto_1b

    :pswitch_6e
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v2

    invoke-static {v0, v1, v8, v2}, Lcom/google/android/gms/internal/measurement/a5;->w(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Lcom/google/android/gms/internal/measurement/Z4;)V

    goto/16 :goto_1b

    :pswitch_6f
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8}, Lcom/google/android/gms/internal/measurement/a5;->v(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;)V

    goto/16 :goto_1b

    :pswitch_70
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/4 v12, 0x0

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->k(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_1d

    :pswitch_71
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->F(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_1d

    :pswitch_72
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->J(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_1d

    :pswitch_73
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->P(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_1d

    :pswitch_74
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->c0(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_1d

    :pswitch_75
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->S(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_1d

    :pswitch_76
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->M(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_1d

    :pswitch_77
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/measurement/a5;->x(ILjava/util/List;Lcom/google/android/gms/internal/measurement/T5;Z)V

    goto/16 :goto_1d

    :pswitch_78
    const/4 v9, 0x1

    const/16 v16, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v8, v2

    move v2, v4

    move v3, v10

    move-object/from16 v20, v11

    move v11, v4

    move v4, v13

    move/from16 v21, v15

    move-object v15, v5

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {v15, v7, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v6, v11}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v1

    move-object/from16 v8, p2

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/measurement/T5;->C(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/Z4;)V

    :goto_1e
    move/from16 v22, v10

    goto/16 :goto_1f

    :cond_f
    move-object/from16 v8, p2

    goto :goto_1e

    :pswitch_79
    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move v11, v4

    move-object v15, v5

    move-wide v4, v2

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v10

    move/from16 v22, v10

    move-wide v9, v4

    move v4, v13

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/measurement/T5;->A(IJ)V

    goto/16 :goto_1f

    :pswitch_7a
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/measurement/T5;->G(II)V

    goto/16 :goto_1f

    :pswitch_7b
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/measurement/T5;->s(IJ)V

    goto/16 :goto_1f

    :pswitch_7c
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/measurement/T5;->x(II)V

    goto/16 :goto_1f

    :pswitch_7d
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/measurement/T5;->K(II)V

    goto/16 :goto_1f

    :pswitch_7e
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/measurement/T5;->h(II)V

    goto/16 :goto_1f

    :pswitch_7f
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/q3;

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/measurement/T5;->f(ILcom/google/android/gms/internal/measurement/q3;)V

    goto/16 :goto_1f

    :pswitch_80
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v6, v11}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v1

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/measurement/T5;->d(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/Z4;)V

    goto/16 :goto_1f

    :pswitch_81
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v12, v0, v8}, Lcom/google/android/gms/internal/measurement/M4;->t(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/T5;)V

    goto/16 :goto_1f

    :pswitch_82
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {v7, v9, v10}, Lcom/google/android/gms/internal/measurement/D5;->F(Ljava/lang/Object;J)Z

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/measurement/T5;->c(IZ)V

    goto/16 :goto_1f

    :pswitch_83
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/measurement/T5;->k(II)V

    goto/16 :goto_1f

    :pswitch_84
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/measurement/T5;->M(IJ)V

    goto/16 :goto_1f

    :pswitch_85
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/measurement/T5;->r(II)V

    goto/16 :goto_1f

    :pswitch_86
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/measurement/T5;->I(IJ)V

    goto/16 :goto_1f

    :pswitch_87
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/measurement/T5;->j(IJ)V

    goto :goto_1f

    :pswitch_88
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {v7, v9, v10}, Lcom/google/android/gms/internal/measurement/D5;->n(Ljava/lang/Object;J)F

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/measurement/T5;->O(IF)V

    goto :goto_1f

    :pswitch_89
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->z(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {v7, v9, v10}, Lcom/google/android/gms/internal/measurement/D5;->a(Ljava/lang/Object;J)D

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/measurement/T5;->N(ID)V

    :cond_10
    :goto_1f
    add-int/lit8 v4, v11, 0x3

    move v2, v13

    move-object v5, v15

    move/from16 v12, v16

    move/from16 v13, v18

    move-object/from16 v14, v19

    move-object/from16 v1, v20

    move/from16 v15, v21

    move/from16 v0, v22

    const/high16 v9, 0xff00000

    const/4 v11, 0x1

    goto/16 :goto_18

    :cond_11
    move-object/from16 v19, v14

    :goto_20
    if-eqz v1, :cond_13

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->p:Lcom/google/android/gms/internal/measurement/O3;

    invoke-virtual {v0, v8, v1}, Lcom/google/android/gms/internal/measurement/O3;->c(Lcom/google/android/gms/internal/measurement/T5;Ljava/util/Map$Entry;)V

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    move-object v1, v0

    goto :goto_20

    :cond_12
    const/4 v1, 0x0

    goto :goto_20

    :cond_13
    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->o:Lcom/google/android/gms/internal/measurement/x5;

    invoke-static {v0, v7, v8}, Lcom/google/android/gms/internal/measurement/M4;->u(Lcom/google/android/gms/internal/measurement/x5;Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/T5;)V

    return-void

    nop

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

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_89
        :pswitch_88
        :pswitch_87
        :pswitch_86
        :pswitch_85
        :pswitch_84
        :pswitch_83
        :pswitch_82
        :pswitch_81
        :pswitch_80
        :pswitch_7f
        :pswitch_7e
        :pswitch_7d
        :pswitch_7c
        :pswitch_7b
        :pswitch_7a
        :pswitch_79
        :pswitch_78
        :pswitch_77
        :pswitch_76
        :pswitch_75
        :pswitch_74
        :pswitch_73
        :pswitch_72
        :pswitch_71
        :pswitch_70
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_6b
        :pswitch_6a
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
    .end packed-switch
.end method

.method public final k(I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/M4;->c:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/measurement/M4;->d:I

    if-gt p1, v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/M4;->l(II)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final l(II)I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    array-length v0, v0

    div-int/lit8 v0, v0, 0x3

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-gt p2, v0, :cond_2

    add-int v1, v0, p2

    ushr-int/lit8 v1, v1, 0x1

    mul-int/lit8 v2, v1, 0x3

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v3, v3, v2

    if-ne p1, v3, :cond_0

    return v2

    :cond_0
    if-ge p1, v3, :cond_1

    add-int/lit8 v0, v1, -0x1

    goto :goto_0

    :cond_1
    add-int/lit8 p2, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public final m(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/measurement/p3;)I
    .locals 31

    .line 1
    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-object/from16 v15, p2

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v2, p6

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/M4;->R(Ljava/lang/Object;)V

    sget-object v3, Lcom/google/android/gms/internal/measurement/M4;->s:Lsun/misc/Unsafe;

    const/16 v16, 0x0

    move/from16 v8, p3

    move/from16 v10, v16

    move v11, v10

    move v13, v11

    const/4 v9, -0x1

    const v14, 0xfffff

    :goto_0
    const/16 v17, 0x0

    if-ge v8, v4, :cond_62

    add-int/lit8 v11, v8, 0x1

    aget-byte v8, v15, v8

    if-gez v8, :cond_0

    invoke-static {v8, v15, v11, v2}, Lcom/google/android/gms/internal/measurement/n3;->d(I[BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v8

    iget v11, v2, Lcom/google/android/gms/internal/measurement/p3;->a:I

    move v12, v11

    move v11, v8

    goto :goto_1

    :cond_0
    move v12, v8

    :goto_1
    ushr-int/lit8 v8, v12, 0x3

    and-int/lit8 v1, v12, 0x7

    const/4 v0, 0x3

    if-le v8, v9, :cond_2

    div-int/2addr v10, v0

    iget v9, v6, Lcom/google/android/gms/internal/measurement/M4;->c:I

    if-lt v8, v9, :cond_1

    iget v9, v6, Lcom/google/android/gms/internal/measurement/M4;->d:I

    if-gt v8, v9, :cond_1

    invoke-virtual {v6, v8, v10}, Lcom/google/android/gms/internal/measurement/M4;->l(II)I

    move-result v9

    goto :goto_2

    :cond_1
    const/4 v9, -0x1

    :goto_2
    move v10, v9

    const/4 v9, -0x1

    goto :goto_3

    :cond_2
    invoke-virtual {v6, v8}, Lcom/google/android/gms/internal/measurement/M4;->k(I)I

    move-result v9

    goto :goto_2

    :goto_3
    if-ne v10, v9, :cond_3

    move-object/from16 v29, v3

    move/from16 v19, v9

    move/from16 v28, v14

    move/from16 v10, v16

    move v9, v5

    move v14, v8

    move v5, v4

    move-object v4, v2

    move v2, v11

    move v11, v12

    goto/16 :goto_41

    :cond_3
    iget-object v9, v6, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    add-int/lit8 v20, v10, 0x1

    aget v0, v9, v20

    const/high16 v20, 0xff00000

    and-int v20, v0, v20

    ushr-int/lit8 v4, v20, 0x14

    const v18, 0xfffff

    and-int v5, v0, v18

    move/from16 v21, v11

    move/from16 v20, v12

    int-to-long v11, v5

    const-wide/16 v22, 0x0

    const-string v5, ""

    move-object/from16 v25, v5

    const/16 v5, 0x11

    if-gt v4, v5, :cond_12

    add-int/lit8 v5, v10, 0x2

    aget v5, v9, v5

    ushr-int/lit8 v9, v5, 0x14

    const/16 v24, 0x1

    shl-int v27, v24, v9

    const v9, 0xfffff

    and-int/2addr v5, v9

    move/from16 v18, v10

    if-eq v5, v14, :cond_6

    if-eq v14, v9, :cond_4

    int-to-long v9, v14

    invoke-virtual {v3, v7, v9, v10, v13}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const v9, 0xfffff

    :cond_4
    if-ne v5, v9, :cond_5

    move/from16 v10, v16

    goto :goto_4

    :cond_5
    int-to-long v13, v5

    invoke-virtual {v3, v7, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v10

    :goto_4
    move/from16 v28, v5

    move/from16 v24, v10

    goto :goto_5

    :cond_6
    move/from16 v24, v13

    move/from16 v28, v14

    :goto_5
    packed-switch v4, :pswitch_data_0

    move/from16 v9, p4

    move/from16 v5, p5

    move-object v14, v2

    move/from16 v13, v18

    move/from16 v10, v21

    const/16 v19, -0x1

    :goto_6
    move/from16 v21, v20

    move/from16 v20, v8

    move-object v8, v3

    goto/16 :goto_12

    :pswitch_0
    const/4 v0, 0x3

    if-ne v1, v0, :cond_7

    move/from16 v0, v18

    invoke-virtual {v6, v7, v0}, Lcom/google/android/gms/internal/measurement/M4;->p(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    shl-int/lit8 v4, v8, 0x3

    or-int/lit8 v13, v4, 0x4

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v4

    move v5, v8

    move-object v8, v1

    move/from16 v18, v9

    const/16 v19, -0x1

    move-object v9, v4

    move v4, v0

    move-object/from16 v10, p2

    move/from16 v11, v21

    move/from16 v0, v20

    move/from16 v12, p4

    move-object/from16 v14, p6

    invoke-static/range {v8 .. v14}, Lcom/google/android/gms/internal/measurement/n3;->h(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/Z4;[BIIILcom/google/android/gms/internal/measurement/p3;)I

    move-result v8

    invoke-virtual {v6, v7, v4, v1}, Lcom/google/android/gms/internal/measurement/M4;->x(Ljava/lang/Object;ILjava/lang/Object;)V

    or-int v13, v24, v27

    move v11, v0

    move v10, v4

    move v9, v5

    move/from16 v14, v28

    move/from16 v4, p4

    :goto_7
    move/from16 v5, p5

    goto/16 :goto_0

    :cond_7
    const/16 v19, -0x1

    move/from16 v9, p4

    move/from16 v5, p5

    move-object v14, v2

    move/from16 v13, v18

    move/from16 v10, v21

    goto :goto_6

    :pswitch_1
    move v5, v8

    move/from16 v4, v18

    move/from16 v0, v20

    const/16 v19, -0x1

    move/from16 v18, v9

    if-nez v1, :cond_8

    move/from16 v10, v21

    invoke-static {v15, v10, v2}, Lcom/google/android/gms/internal/measurement/n3;->p([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v8

    iget-wide v9, v2, Lcom/google/android/gms/internal/measurement/p3;->b:J

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/measurement/G3;->b(J)J

    move-result-wide v9

    move v13, v0

    move-object v0, v3

    move/from16 v14, v18

    move-object/from16 v1, p1

    move-object v14, v2

    move/from16 p3, v8

    move-object v8, v3

    move-wide v2, v11

    move/from16 v11, p4

    move/from16 v12, p5

    move/from16 v20, v5

    move/from16 v21, v13

    move v13, v4

    move-wide v4, v9

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int v0, v24, v27

    move-object v3, v8

    move v4, v11

    move v5, v12

    move v10, v13

    move-object v2, v14

    move/from16 v9, v20

    move/from16 v11, v21

    move/from16 v14, v28

    move/from16 v8, p3

    :goto_8
    move v13, v0

    goto/16 :goto_0

    :cond_8
    move-object v14, v2

    move-object v8, v3

    move v13, v4

    move/from16 v20, v5

    move/from16 v10, v21

    move/from16 v9, p4

    move/from16 v5, p5

    move/from16 v21, v0

    goto/16 :goto_12

    :pswitch_2
    move/from16 v9, p4

    move/from16 v5, p5

    move-object v14, v2

    move/from16 v13, v18

    move/from16 v10, v21

    const/16 v19, -0x1

    move/from16 v21, v20

    move/from16 v20, v8

    move-object v8, v3

    if-nez v1, :cond_11

    invoke-static {v15, v10, v14}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget v1, v14, Lcom/google/android/gms/internal/measurement/p3;->a:I

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/G3;->e(I)I

    move-result v1

    invoke-virtual {v8, v7, v11, v12, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_9
    or-int v1, v24, v27

    :goto_a
    move-object v3, v8

    move v4, v9

    :goto_b
    move v10, v13

    move-object v2, v14

    move/from16 v9, v20

    move/from16 v11, v21

    :goto_c
    move/from16 v14, v28

    move v8, v0

    move v13, v1

    goto/16 :goto_0

    :pswitch_3
    move/from16 v9, p4

    move/from16 v5, p5

    move-object v14, v2

    move/from16 v13, v18

    move/from16 v10, v21

    const/16 v19, -0x1

    move/from16 v21, v20

    move/from16 v20, v8

    move-object v8, v3

    if-nez v1, :cond_11

    invoke-static {v15, v10, v14}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v1

    iget v2, v14, Lcom/google/android/gms/internal/measurement/p3;->a:I

    invoke-virtual {v6, v13}, Lcom/google/android/gms/internal/measurement/M4;->M(I)Lcom/google/android/gms/internal/measurement/g4;

    move-result-object v3

    const/high16 v4, -0x80000000

    and-int/2addr v0, v4

    if-eqz v0, :cond_9

    if-eqz v3, :cond_9

    invoke-interface {v3, v2}, Lcom/google/android/gms/internal/measurement/g4;->e(I)Z

    move-result v0

    if-eqz v0, :cond_a

    :cond_9
    move/from16 v4, v21

    goto :goto_e

    :cond_a
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/M4;->O(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/v5;

    move-result-object v0

    int-to-long v2, v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move/from16 v4, v21

    invoke-virtual {v0, v4, v2}, Lcom/google/android/gms/internal/measurement/v5;->e(ILjava/lang/Object;)V

    move v11, v4

    move-object v3, v8

    move v4, v9

    move v10, v13

    move-object v2, v14

    move/from16 v9, v20

    move/from16 v13, v24

    move/from16 v14, v28

    :goto_d
    move v8, v1

    goto/16 :goto_0

    :goto_e
    invoke-virtual {v8, v7, v11, v12, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    or-int v0, v24, v27

    move v11, v4

    move-object v3, v8

    move v4, v9

    move v10, v13

    move-object v2, v14

    move/from16 v9, v20

    move/from16 v14, v28

    move v13, v0

    goto :goto_d

    :pswitch_4
    move/from16 v9, p4

    move/from16 v5, p5

    move-object v14, v2

    move/from16 v13, v18

    move/from16 v4, v20

    move/from16 v10, v21

    const/4 v0, 0x2

    const/16 v19, -0x1

    move/from16 v20, v8

    move-object v8, v3

    if-ne v1, v0, :cond_b

    invoke-static {v15, v10, v14}, Lcom/google/android/gms/internal/measurement/n3;->j([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget-object v1, v14, Lcom/google/android/gms/internal/measurement/p3;->c:Ljava/lang/Object;

    invoke-virtual {v8, v7, v11, v12, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    or-int v1, v24, v27

    move v11, v4

    move-object v3, v8

    move v4, v9

    move v10, v13

    move-object v2, v14

    move/from16 v9, v20

    goto/16 :goto_c

    :cond_b
    move/from16 v21, v4

    goto/16 :goto_12

    :pswitch_5
    move/from16 v9, p4

    move/from16 v5, p5

    move-object v14, v2

    move/from16 v13, v18

    move/from16 v4, v20

    move/from16 v10, v21

    const/4 v0, 0x2

    const/16 v19, -0x1

    move/from16 v20, v8

    move-object v8, v3

    if-ne v1, v0, :cond_b

    invoke-virtual {v6, v7, v13}, Lcom/google/android/gms/internal/measurement/M4;->p(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v6, v13}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v1

    move-object v0, v11

    move-object/from16 v2, p2

    move v3, v10

    move/from16 v21, v4

    move/from16 v4, p4

    move v12, v5

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/n3;->i(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/Z4;[BIILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    invoke-virtual {v6, v7, v13, v11}, Lcom/google/android/gms/internal/measurement/M4;->x(Ljava/lang/Object;ILjava/lang/Object;)V

    or-int v1, v24, v27

    move-object v3, v8

    move v4, v9

    move v5, v12

    goto/16 :goto_b

    :pswitch_6
    move/from16 v9, p4

    move/from16 v4, p5

    move-object v14, v2

    move/from16 v13, v18

    move/from16 v10, v21

    const/4 v2, 0x2

    const/16 v19, -0x1

    move/from16 v21, v20

    move/from16 v20, v8

    move-object v8, v3

    if-ne v1, v2, :cond_f

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/M4;->S(I)Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {v15, v10, v14}, Lcom/google/android/gms/internal/measurement/n3;->m([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    goto :goto_f

    :cond_c
    invoke-static {v15, v10, v14}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget v1, v14, Lcom/google/android/gms/internal/measurement/p3;->a:I

    if-ltz v1, :cond_e

    if-nez v1, :cond_d

    move-object/from16 v2, v25

    iput-object v2, v14, Lcom/google/android/gms/internal/measurement/p3;->c:Ljava/lang/Object;

    goto :goto_f

    :cond_d
    new-instance v2, Ljava/lang/String;

    sget-object v3, Lcom/google/android/gms/internal/measurement/a4;->b:Ljava/nio/charset/Charset;

    invoke-direct {v2, v15, v0, v1, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iput-object v2, v14, Lcom/google/android/gms/internal/measurement/p3;->c:Ljava/lang/Object;

    add-int/2addr v0, v1

    :goto_f
    iget-object v1, v14, Lcom/google/android/gms/internal/measurement/p3;->c:Ljava/lang/Object;

    invoke-virtual {v8, v7, v11, v12, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_10
    or-int v1, v24, v27

    move v5, v4

    goto/16 :goto_a

    :cond_e
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->d()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    throw v0

    :cond_f
    move v5, v4

    goto/16 :goto_12

    :pswitch_7
    move/from16 v9, p4

    move/from16 v4, p5

    move-object v14, v2

    move/from16 v13, v18

    move/from16 v10, v21

    const/16 v19, -0x1

    move/from16 v21, v20

    move/from16 v20, v8

    move-object v8, v3

    if-nez v1, :cond_f

    invoke-static {v15, v10, v14}, Lcom/google/android/gms/internal/measurement/n3;->p([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget-wide v1, v14, Lcom/google/android/gms/internal/measurement/p3;->b:J

    cmp-long v1, v1, v22

    if-eqz v1, :cond_10

    const/4 v5, 0x1

    goto :goto_11

    :cond_10
    move/from16 v5, v16

    :goto_11
    invoke-static {v7, v11, v12, v5}, Lcom/google/android/gms/internal/measurement/D5;->v(Ljava/lang/Object;JZ)V

    goto :goto_10

    :pswitch_8
    move/from16 v9, p4

    move/from16 v4, p5

    move-object v14, v2

    move/from16 v13, v18

    move/from16 v10, v21

    const/4 v0, 0x5

    const/16 v19, -0x1

    move/from16 v21, v20

    move/from16 v20, v8

    move-object v8, v3

    if-ne v1, v0, :cond_f

    invoke-static {v15, v10}, Lcom/google/android/gms/internal/measurement/n3;->n([BI)I

    move-result v0

    invoke-virtual {v8, v7, v11, v12, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v0, v10, 0x4

    goto :goto_10

    :pswitch_9
    move/from16 v9, p4

    move/from16 v4, p5

    move-object v14, v2

    move/from16 v13, v18

    move/from16 v10, v21

    const/4 v0, 0x1

    const/16 v19, -0x1

    move/from16 v21, v20

    move/from16 v20, v8

    move-object v8, v3

    if-ne v1, v0, :cond_f

    invoke-static {v15, v10}, Lcom/google/android/gms/internal/measurement/n3;->q([BI)J

    move-result-wide v22

    move-object v0, v8

    move-object/from16 v1, p1

    move-wide v2, v11

    move v11, v4

    move-wide/from16 v4, v22

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    add-int/lit8 v0, v10, 0x8

    or-int v1, v24, v27

    move-object v3, v8

    move v4, v9

    move v5, v11

    goto/16 :goto_b

    :pswitch_a
    move/from16 v9, p4

    move/from16 v4, p5

    move-object v14, v2

    move/from16 v13, v18

    move/from16 v10, v21

    const/16 v19, -0x1

    move/from16 v21, v20

    move/from16 v20, v8

    move-object v8, v3

    if-nez v1, :cond_f

    invoke-static {v15, v10, v14}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget v1, v14, Lcom/google/android/gms/internal/measurement/p3;->a:I

    invoke-virtual {v8, v7, v11, v12, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_10

    :pswitch_b
    move/from16 v9, p4

    move/from16 v4, p5

    move-object v14, v2

    move/from16 v13, v18

    move/from16 v10, v21

    const/16 v19, -0x1

    move/from16 v21, v20

    move/from16 v20, v8

    move-object v8, v3

    if-nez v1, :cond_f

    invoke-static {v15, v10, v14}, Lcom/google/android/gms/internal/measurement/n3;->p([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v10

    iget-wide v2, v14, Lcom/google/android/gms/internal/measurement/p3;->b:J

    move-object v0, v8

    move-object/from16 v1, p1

    move-wide/from16 v22, v2

    move-wide v2, v11

    move v11, v4

    move-wide/from16 v4, v22

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int v0, v24, v27

    move-object v3, v8

    move v4, v9

    move v8, v10

    move v5, v11

    move v10, v13

    move-object v2, v14

    move/from16 v9, v20

    move/from16 v11, v21

    move/from16 v14, v28

    goto/16 :goto_8

    :pswitch_c
    move/from16 v9, p4

    move/from16 v5, p5

    move-object v14, v2

    move/from16 v13, v18

    move/from16 v10, v21

    const/4 v0, 0x5

    const/16 v19, -0x1

    move/from16 v21, v20

    move/from16 v20, v8

    move-object v8, v3

    if-ne v1, v0, :cond_11

    invoke-static {v15, v10}, Lcom/google/android/gms/internal/measurement/n3;->l([BI)F

    move-result v0

    invoke-static {v7, v11, v12, v0}, Lcom/google/android/gms/internal/measurement/D5;->g(Ljava/lang/Object;JF)V

    add-int/lit8 v0, v10, 0x4

    goto/16 :goto_9

    :pswitch_d
    move/from16 v9, p4

    move/from16 v5, p5

    move-object v14, v2

    move/from16 v13, v18

    move/from16 v10, v21

    const/4 v0, 0x1

    const/16 v19, -0x1

    move/from16 v21, v20

    move/from16 v20, v8

    move-object v8, v3

    if-ne v1, v0, :cond_11

    invoke-static {v15, v10}, Lcom/google/android/gms/internal/measurement/n3;->a([BI)D

    move-result-wide v0

    invoke-static {v7, v11, v12, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->f(Ljava/lang/Object;JD)V

    add-int/lit8 v0, v10, 0x8

    goto/16 :goto_9

    :cond_11
    :goto_12
    move-object/from16 v29, v8

    move v2, v10

    move v10, v13

    move-object v4, v14

    move/from16 v14, v20

    move/from16 v11, v21

    move/from16 v13, v24

    move/from16 v30, v9

    move v9, v5

    move/from16 v5, v30

    goto/16 :goto_41

    :cond_12
    move/from16 v5, p5

    move/from16 v24, v13

    move/from16 v28, v14

    const/16 v19, -0x1

    move-object v14, v2

    move v13, v10

    move/from16 v10, v21

    move-object/from16 v2, v25

    move/from16 v21, v20

    move/from16 v20, v8

    move-object v8, v3

    const/16 v3, 0x1b

    const/16 v18, 0xa

    if-ne v4, v3, :cond_16

    const/4 v3, 0x2

    if-ne v1, v3, :cond_15

    invoke-virtual {v8, v7, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/h4;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/h4;->c()Z

    move-result v1

    if-nez v1, :cond_14

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_13

    :goto_13
    move/from16 v1, v18

    goto :goto_14

    :cond_13
    shl-int/lit8 v18, v1, 0x1

    goto :goto_13

    :goto_14
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/measurement/h4;->e(I)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v0

    invoke-virtual {v8, v7, v11, v12, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_14
    invoke-virtual {v6, v13}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v1

    move-object v3, v8

    move-object v8, v1

    move/from16 v9, v21

    move v1, v10

    move-object/from16 v10, p2

    move v11, v1

    move/from16 v12, p4

    move v2, v13

    move-object v13, v0

    move-object v0, v14

    move-object/from16 v14, p6

    invoke-static/range {v8 .. v14}, Lcom/google/android/gms/internal/measurement/n3;->e(Lcom/google/android/gms/internal/measurement/Z4;I[BIILcom/google/android/gms/internal/measurement/h4;Lcom/google/android/gms/internal/measurement/p3;)I

    move-result v8

    move/from16 v4, p4

    move v10, v2

    move/from16 v9, v20

    move/from16 v11, v21

    move/from16 v13, v24

    move/from16 v14, v28

    move-object v2, v0

    goto/16 :goto_0

    :cond_15
    move/from16 v3, p4

    move-object/from16 v29, v8

    move v5, v13

    move/from16 v8, v21

    goto/16 :goto_33

    :cond_16
    move-object v3, v8

    move/from16 v30, v13

    move v13, v10

    move/from16 v10, v30

    const/16 v8, 0x31

    if-gt v4, v8, :cond_4f

    int-to-long v8, v0

    sget-object v0, Lcom/google/android/gms/internal/measurement/M4;->s:Lsun/misc/Unsafe;

    invoke-virtual {v0, v7, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v25

    move-object/from16 v27, v3

    move-object/from16 v3, v25

    check-cast v3, Lcom/google/android/gms/internal/measurement/h4;

    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/h4;->c()Z

    move-result v25

    if-nez v25, :cond_18

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v25

    if-nez v25, :cond_17

    :goto_15
    move/from16 v5, v18

    goto :goto_16

    :cond_17
    shl-int/lit8 v18, v25, 0x1

    goto :goto_15

    :goto_16
    invoke-interface {v3, v5}, Lcom/google/android/gms/internal/measurement/h4;->e(I)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v3

    invoke-virtual {v0, v7, v11, v12, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_18
    move-object v12, v3

    packed-switch v4, :pswitch_data_1

    move/from16 v7, p4

    move v9, v10

    move v10, v13

    move/from16 v8, v21

    move-object/from16 v29, v27

    goto/16 :goto_2f

    :pswitch_e
    const/4 v0, 0x3

    if-ne v1, v0, :cond_1a

    invoke-virtual {v6, v10}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v8

    move/from16 v11, v21

    and-int/lit8 v0, v11, -0x8

    or-int/lit8 v9, v0, 0x4

    move-object v0, v8

    move-object/from16 v1, p2

    move v2, v13

    move/from16 v5, p4

    move-object/from16 v4, v27

    move/from16 v3, p4

    move-object/from16 v29, v4

    move v4, v9

    move v7, v5

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/n3;->f(Lcom/google/android/gms/internal/measurement/Z4;[BIIILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    :goto_17
    iget-object v1, v14, Lcom/google/android/gms/internal/measurement/p3;->c:Ljava/lang/Object;

    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-ge v0, v7, :cond_19

    invoke-static {v15, v0, v14}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v2

    iget v1, v14, Lcom/google/android/gms/internal/measurement/p3;->a:I

    if-ne v11, v1, :cond_19

    move-object v0, v8

    move-object/from16 v1, p2

    move/from16 v3, p4

    move v4, v9

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/n3;->f(Lcom/google/android/gms/internal/measurement/Z4;[BIIILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    goto :goto_17

    :cond_19
    :goto_18
    move v9, v10

    move v8, v11

    move v10, v13

    goto/16 :goto_30

    :cond_1a
    move/from16 v7, p4

    move-object/from16 v29, v27

    move v9, v10

    move v10, v13

    move/from16 v8, v21

    goto/16 :goto_2f

    :pswitch_f
    move/from16 v7, p4

    move/from16 v11, v21

    move-object/from16 v29, v27

    const/4 v0, 0x2

    if-ne v1, v0, :cond_1d

    check-cast v12, Lcom/google/android/gms/internal/measurement/w4;

    invoke-static {v15, v13, v14}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget v1, v14, Lcom/google/android/gms/internal/measurement/p3;->a:I

    add-int/2addr v1, v0

    :goto_19
    if-ge v0, v1, :cond_1b

    invoke-static {v15, v0, v14}, Lcom/google/android/gms/internal/measurement/n3;->p([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget-wide v2, v14, Lcom/google/android/gms/internal/measurement/p3;->b:J

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/G3;->b(J)J

    move-result-wide v2

    invoke-virtual {v12, v2, v3}, Lcom/google/android/gms/internal/measurement/w4;->d(J)V

    goto :goto_19

    :cond_1b
    if-ne v0, v1, :cond_1c

    goto :goto_18

    :cond_1c
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->f()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    throw v0

    :cond_1d
    if-nez v1, :cond_1e

    check-cast v12, Lcom/google/android/gms/internal/measurement/w4;

    invoke-static {v15, v13, v14}, Lcom/google/android/gms/internal/measurement/n3;->p([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    :goto_1a
    iget-wide v1, v14, Lcom/google/android/gms/internal/measurement/p3;->b:J

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/G3;->b(J)J

    move-result-wide v1

    invoke-virtual {v12, v1, v2}, Lcom/google/android/gms/internal/measurement/w4;->d(J)V

    if-ge v0, v7, :cond_19

    invoke-static {v15, v0, v14}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v1

    iget v2, v14, Lcom/google/android/gms/internal/measurement/p3;->a:I

    if-ne v11, v2, :cond_19

    invoke-static {v15, v1, v14}, Lcom/google/android/gms/internal/measurement/n3;->p([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    goto :goto_1a

    :cond_1e
    move v9, v10

    move v8, v11

    move v10, v13

    goto/16 :goto_2f

    :pswitch_10
    move/from16 v7, p4

    move/from16 v11, v21

    move-object/from16 v29, v27

    const/4 v0, 0x2

    if-ne v1, v0, :cond_21

    check-cast v12, Lcom/google/android/gms/internal/measurement/c4;

    invoke-static {v15, v13, v14}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget v1, v14, Lcom/google/android/gms/internal/measurement/p3;->a:I

    add-int/2addr v1, v0

    :goto_1b
    if-ge v0, v1, :cond_1f

    invoke-static {v15, v0, v14}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget v2, v14, Lcom/google/android/gms/internal/measurement/p3;->a:I

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/G3;->e(I)I

    move-result v2

    invoke-virtual {v12, v2}, Lcom/google/android/gms/internal/measurement/c4;->g(I)V

    goto :goto_1b

    :cond_1f
    if-ne v0, v1, :cond_20

    goto/16 :goto_18

    :cond_20
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->f()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    throw v0

    :cond_21
    if-nez v1, :cond_1e

    check-cast v12, Lcom/google/android/gms/internal/measurement/c4;

    invoke-static {v15, v13, v14}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    :goto_1c
    iget v1, v14, Lcom/google/android/gms/internal/measurement/p3;->a:I

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/G3;->e(I)I

    move-result v1

    invoke-virtual {v12, v1}, Lcom/google/android/gms/internal/measurement/c4;->g(I)V

    if-ge v0, v7, :cond_19

    invoke-static {v15, v0, v14}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v1

    iget v2, v14, Lcom/google/android/gms/internal/measurement/p3;->a:I

    if-ne v11, v2, :cond_19

    invoke-static {v15, v1, v14}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    goto :goto_1c

    :pswitch_11
    move/from16 v7, p4

    move/from16 v11, v21

    move-object/from16 v29, v27

    const/4 v0, 0x2

    if-ne v1, v0, :cond_22

    invoke-static {v15, v13, v12, v14}, Lcom/google/android/gms/internal/measurement/n3;->k([BILcom/google/android/gms/internal/measurement/h4;Lcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    :goto_1d
    move v8, v0

    goto :goto_1e

    :cond_22
    if-nez v1, :cond_1e

    move v0, v11

    move-object/from16 v1, p2

    move v2, v13

    move/from16 v3, p4

    move-object v4, v12

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/n3;->b(I[BIILcom/google/android/gms/internal/measurement/h4;Lcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    goto :goto_1d

    :goto_1e
    invoke-virtual {v6, v10}, Lcom/google/android/gms/internal/measurement/M4;->M(I)Lcom/google/android/gms/internal/measurement/g4;

    move-result-object v3

    const/4 v4, 0x0

    iget-object v5, v6, Lcom/google/android/gms/internal/measurement/M4;->o:Lcom/google/android/gms/internal/measurement/x5;

    move-object/from16 v0, p1

    move/from16 v1, v20

    move-object v2, v12

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/a5;->h(Ljava/lang/Object;ILjava/util/List;Lcom/google/android/gms/internal/measurement/g4;Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/x5;)Ljava/lang/Object;

    move v0, v8

    goto/16 :goto_18

    :pswitch_12
    move/from16 v7, p4

    move/from16 v11, v21

    move-object/from16 v29, v27

    const/4 v0, 0x2

    if-ne v1, v0, :cond_1e

    invoke-static {v15, v13, v14}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget v1, v14, Lcom/google/android/gms/internal/measurement/p3;->a:I

    if-ltz v1, :cond_27

    array-length v2, v15

    sub-int/2addr v2, v0

    if-gt v1, v2, :cond_26

    if-nez v1, :cond_23

    :goto_1f
    sget-object v1, Lcom/google/android/gms/internal/measurement/q3;->p:Lcom/google/android/gms/internal/measurement/q3;

    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_20

    :cond_23
    invoke-static {v15, v0, v1}, Lcom/google/android/gms/internal/measurement/q3;->q([BII)Lcom/google/android/gms/internal/measurement/q3;

    move-result-object v2

    invoke-interface {v12, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v0, v1

    :goto_20
    if-ge v0, v7, :cond_19

    invoke-static {v15, v0, v14}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v1

    iget v2, v14, Lcom/google/android/gms/internal/measurement/p3;->a:I

    if-ne v11, v2, :cond_19

    invoke-static {v15, v1, v14}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget v1, v14, Lcom/google/android/gms/internal/measurement/p3;->a:I

    if-ltz v1, :cond_25

    array-length v2, v15

    sub-int/2addr v2, v0

    if-gt v1, v2, :cond_24

    if-nez v1, :cond_23

    goto :goto_1f

    :cond_24
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->f()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    throw v0

    :cond_25
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->d()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    throw v0

    :cond_26
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->f()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    throw v0

    :cond_27
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->d()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    throw v0

    :pswitch_13
    move/from16 v7, p4

    move/from16 v11, v21

    move-object/from16 v29, v27

    const/4 v0, 0x2

    if-ne v1, v0, :cond_1e

    invoke-virtual {v6, v10}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v8

    move v9, v11

    move v5, v10

    move-object/from16 v10, p2

    move v4, v11

    move v3, v13

    move v11, v3

    move-object v13, v12

    move/from16 v12, p4

    move-object v0, v14

    move-object/from16 v14, p6

    invoke-static/range {v8 .. v14}, Lcom/google/android/gms/internal/measurement/n3;->e(Lcom/google/android/gms/internal/measurement/Z4;I[BIILcom/google/android/gms/internal/measurement/h4;Lcom/google/android/gms/internal/measurement/p3;)I

    move-result v1

    :cond_28
    :goto_21
    move-object v14, v0

    move v0, v1

    move v10, v3

    move v8, v4

    move v9, v5

    goto/16 :goto_30

    :pswitch_14
    move/from16 v7, p4

    move v5, v10

    move v3, v13

    move-object v0, v14

    move/from16 v4, v21

    move-object/from16 v29, v27

    const/4 v10, 0x2

    move-object v13, v12

    if-ne v1, v10, :cond_34

    const-wide/32 v10, 0x20000000

    and-long/2addr v8, v10

    cmp-long v1, v8, v22

    if-nez v1, :cond_2d

    invoke-static {v15, v3, v0}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v1

    iget v8, v0, Lcom/google/android/gms/internal/measurement/p3;->a:I

    if-ltz v8, :cond_2c

    if-nez v8, :cond_29

    :goto_22
    invoke-interface {v13, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_24

    :cond_29
    new-instance v9, Ljava/lang/String;

    sget-object v10, Lcom/google/android/gms/internal/measurement/a4;->b:Ljava/nio/charset/Charset;

    invoke-direct {v9, v15, v1, v8, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    :goto_23
    invoke-interface {v13, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v1, v8

    :goto_24
    if-ge v1, v7, :cond_28

    invoke-static {v15, v1, v0}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v8

    iget v9, v0, Lcom/google/android/gms/internal/measurement/p3;->a:I

    if-ne v4, v9, :cond_28

    invoke-static {v15, v8, v0}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v1

    iget v8, v0, Lcom/google/android/gms/internal/measurement/p3;->a:I

    if-ltz v8, :cond_2b

    if-nez v8, :cond_2a

    goto :goto_22

    :cond_2a
    new-instance v9, Ljava/lang/String;

    sget-object v10, Lcom/google/android/gms/internal/measurement/a4;->b:Ljava/nio/charset/Charset;

    invoke-direct {v9, v15, v1, v8, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_23

    :cond_2b
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->d()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    throw v0

    :cond_2c
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->d()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    throw v0

    :cond_2d
    invoke-static {v15, v3, v0}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v1

    iget v8, v0, Lcom/google/android/gms/internal/measurement/p3;->a:I

    if-ltz v8, :cond_33

    if-nez v8, :cond_2e

    :goto_25
    invoke-interface {v13, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_27

    :cond_2e
    add-int v9, v1, v8

    invoke-static {v15, v1, v9}, Lcom/google/android/gms/internal/measurement/E5;->f([BII)Z

    move-result v10

    if-eqz v10, :cond_32

    new-instance v10, Ljava/lang/String;

    sget-object v11, Lcom/google/android/gms/internal/measurement/a4;->b:Ljava/nio/charset/Charset;

    invoke-direct {v10, v15, v1, v8, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    :goto_26
    invoke-interface {v13, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v1, v9

    :goto_27
    if-ge v1, v7, :cond_28

    invoke-static {v15, v1, v0}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v8

    iget v9, v0, Lcom/google/android/gms/internal/measurement/p3;->a:I

    if-ne v4, v9, :cond_28

    invoke-static {v15, v8, v0}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v1

    iget v8, v0, Lcom/google/android/gms/internal/measurement/p3;->a:I

    if-ltz v8, :cond_31

    if-nez v8, :cond_2f

    goto :goto_25

    :cond_2f
    add-int v9, v1, v8

    invoke-static {v15, v1, v9}, Lcom/google/android/gms/internal/measurement/E5;->f([BII)Z

    move-result v10

    if-eqz v10, :cond_30

    new-instance v10, Ljava/lang/String;

    sget-object v11, Lcom/google/android/gms/internal/measurement/a4;->b:Ljava/nio/charset/Charset;

    invoke-direct {v10, v15, v1, v8, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_26

    :cond_30
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->c()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    throw v0

    :cond_31
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->d()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    throw v0

    :cond_32
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->c()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    throw v0

    :cond_33
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->d()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    throw v0

    :cond_34
    :goto_28
    move-object v14, v0

    move v10, v3

    move v8, v4

    move v9, v5

    goto/16 :goto_2f

    :pswitch_15
    move/from16 v7, p4

    move v5, v10

    move v3, v13

    move-object v0, v14

    move/from16 v4, v21

    move-object/from16 v29, v27

    const/4 v2, 0x2

    move-object v13, v12

    if-ne v1, v2, :cond_37

    invoke-static {v13}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    invoke-static {v15, v3, v0}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v1

    iget v2, v0, Lcom/google/android/gms/internal/measurement/p3;->a:I

    add-int/2addr v2, v1

    if-lt v1, v2, :cond_36

    if-ne v1, v2, :cond_35

    goto/16 :goto_21

    :cond_35
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->f()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    throw v0

    :cond_36
    invoke-static {v15, v1, v0}, Lcom/google/android/gms/internal/measurement/n3;->p([BILcom/google/android/gms/internal/measurement/p3;)I

    throw v17

    :cond_37
    if-eqz v1, :cond_38

    goto :goto_28

    :cond_38
    invoke-static {v13}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    invoke-static {v15, v3, v0}, Lcom/google/android/gms/internal/measurement/n3;->p([BILcom/google/android/gms/internal/measurement/p3;)I

    iget-wide v0, v0, Lcom/google/android/gms/internal/measurement/p3;->b:J

    throw v17

    :pswitch_16
    move/from16 v7, p4

    move v5, v10

    move v3, v13

    move-object v0, v14

    move/from16 v4, v21

    move-object/from16 v29, v27

    const/4 v2, 0x2

    move-object v13, v12

    if-ne v1, v2, :cond_3b

    move-object v12, v13

    check-cast v12, Lcom/google/android/gms/internal/measurement/c4;

    invoke-static {v15, v3, v0}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v1

    iget v2, v0, Lcom/google/android/gms/internal/measurement/p3;->a:I

    add-int/2addr v2, v1

    :goto_29
    if-ge v1, v2, :cond_39

    invoke-static {v15, v1}, Lcom/google/android/gms/internal/measurement/n3;->n([BI)I

    move-result v8

    invoke-virtual {v12, v8}, Lcom/google/android/gms/internal/measurement/c4;->g(I)V

    add-int/lit8 v1, v1, 0x4

    goto :goto_29

    :cond_39
    if-ne v1, v2, :cond_3a

    goto/16 :goto_21

    :cond_3a
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->f()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    throw v0

    :cond_3b
    const/4 v2, 0x5

    if-ne v1, v2, :cond_34

    move-object v12, v13

    check-cast v12, Lcom/google/android/gms/internal/measurement/c4;

    invoke-static {v15, v3}, Lcom/google/android/gms/internal/measurement/n3;->n([BI)I

    move-result v1

    invoke-virtual {v12, v1}, Lcom/google/android/gms/internal/measurement/c4;->g(I)V

    add-int/lit8 v11, v3, 0x4

    :goto_2a
    if-ge v11, v7, :cond_3c

    invoke-static {v15, v11, v0}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v1

    iget v2, v0, Lcom/google/android/gms/internal/measurement/p3;->a:I

    if-ne v4, v2, :cond_3c

    invoke-static {v15, v1}, Lcom/google/android/gms/internal/measurement/n3;->n([BI)I

    move-result v2

    invoke-virtual {v12, v2}, Lcom/google/android/gms/internal/measurement/c4;->g(I)V

    add-int/lit8 v11, v1, 0x4

    goto :goto_2a

    :cond_3c
    move-object v14, v0

    move v10, v3

    move v8, v4

    move v9, v5

    move v0, v11

    goto/16 :goto_30

    :pswitch_17
    move/from16 v7, p4

    move v5, v10

    move v3, v13

    move-object v0, v14

    move/from16 v4, v21

    move-object/from16 v29, v27

    const/4 v2, 0x2

    move-object v13, v12

    if-ne v1, v2, :cond_3f

    move-object v12, v13

    check-cast v12, Lcom/google/android/gms/internal/measurement/w4;

    invoke-static {v15, v3, v0}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v1

    iget v2, v0, Lcom/google/android/gms/internal/measurement/p3;->a:I

    add-int/2addr v2, v1

    :goto_2b
    if-ge v1, v2, :cond_3d

    invoke-static {v15, v1}, Lcom/google/android/gms/internal/measurement/n3;->q([BI)J

    move-result-wide v8

    invoke-virtual {v12, v8, v9}, Lcom/google/android/gms/internal/measurement/w4;->d(J)V

    add-int/lit8 v1, v1, 0x8

    goto :goto_2b

    :cond_3d
    if-ne v1, v2, :cond_3e

    goto/16 :goto_21

    :cond_3e
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->f()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    throw v0

    :cond_3f
    const/4 v2, 0x1

    if-ne v1, v2, :cond_34

    move-object v12, v13

    check-cast v12, Lcom/google/android/gms/internal/measurement/w4;

    invoke-static {v15, v3}, Lcom/google/android/gms/internal/measurement/n3;->q([BI)J

    move-result-wide v1

    invoke-virtual {v12, v1, v2}, Lcom/google/android/gms/internal/measurement/w4;->d(J)V

    add-int/lit8 v11, v3, 0x8

    :goto_2c
    if-ge v11, v7, :cond_3c

    invoke-static {v15, v11, v0}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v1

    iget v2, v0, Lcom/google/android/gms/internal/measurement/p3;->a:I

    if-ne v4, v2, :cond_3c

    invoke-static {v15, v1}, Lcom/google/android/gms/internal/measurement/n3;->q([BI)J

    move-result-wide v8

    invoke-virtual {v12, v8, v9}, Lcom/google/android/gms/internal/measurement/w4;->d(J)V

    add-int/lit8 v11, v1, 0x8

    goto :goto_2c

    :pswitch_18
    move/from16 v7, p4

    move v5, v10

    move v3, v13

    move-object v0, v14

    move/from16 v4, v21

    move-object/from16 v29, v27

    const/4 v2, 0x2

    move-object v13, v12

    if-ne v1, v2, :cond_40

    invoke-static {v15, v3, v13, v0}, Lcom/google/android/gms/internal/measurement/n3;->k([BILcom/google/android/gms/internal/measurement/h4;Lcom/google/android/gms/internal/measurement/p3;)I

    move-result v1

    goto/16 :goto_21

    :cond_40
    if-nez v1, :cond_34

    move-object v14, v0

    move v0, v4

    move-object/from16 v1, p2

    move v2, v3

    move v10, v3

    move/from16 v3, p4

    move v8, v4

    move-object v4, v13

    move v9, v5

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/n3;->b(I[BIILcom/google/android/gms/internal/measurement/h4;Lcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    goto/16 :goto_30

    :pswitch_19
    move/from16 v7, p4

    move v9, v10

    move v10, v13

    move/from16 v8, v21

    move-object/from16 v29, v27

    const/4 v0, 0x2

    move-object v13, v12

    if-ne v1, v0, :cond_43

    move-object v12, v13

    check-cast v12, Lcom/google/android/gms/internal/measurement/w4;

    invoke-static {v15, v10, v14}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget v1, v14, Lcom/google/android/gms/internal/measurement/p3;->a:I

    add-int/2addr v1, v0

    :goto_2d
    if-ge v0, v1, :cond_41

    invoke-static {v15, v0, v14}, Lcom/google/android/gms/internal/measurement/n3;->p([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget-wide v2, v14, Lcom/google/android/gms/internal/measurement/p3;->b:J

    invoke-virtual {v12, v2, v3}, Lcom/google/android/gms/internal/measurement/w4;->d(J)V

    goto :goto_2d

    :cond_41
    if-ne v0, v1, :cond_42

    goto/16 :goto_30

    :cond_42
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->f()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    throw v0

    :cond_43
    if-nez v1, :cond_4b

    move-object v12, v13

    check-cast v12, Lcom/google/android/gms/internal/measurement/w4;

    invoke-static {v15, v10, v14}, Lcom/google/android/gms/internal/measurement/n3;->p([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    :goto_2e
    iget-wide v1, v14, Lcom/google/android/gms/internal/measurement/p3;->b:J

    invoke-virtual {v12, v1, v2}, Lcom/google/android/gms/internal/measurement/w4;->d(J)V

    if-ge v0, v7, :cond_4c

    invoke-static {v15, v0, v14}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v1

    iget v2, v14, Lcom/google/android/gms/internal/measurement/p3;->a:I

    if-ne v8, v2, :cond_4c

    invoke-static {v15, v1, v14}, Lcom/google/android/gms/internal/measurement/n3;->p([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    goto :goto_2e

    :pswitch_1a
    move/from16 v7, p4

    move v9, v10

    move v10, v13

    move/from16 v8, v21

    move-object/from16 v29, v27

    const/4 v0, 0x2

    move-object v13, v12

    if-ne v1, v0, :cond_46

    invoke-static {v13}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    invoke-static {v15, v10, v14}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget v1, v14, Lcom/google/android/gms/internal/measurement/p3;->a:I

    add-int/2addr v1, v0

    if-lt v0, v1, :cond_45

    if-ne v0, v1, :cond_44

    goto :goto_30

    :cond_44
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->f()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    throw v0

    :cond_45
    invoke-static {v15, v0}, Lcom/google/android/gms/internal/measurement/n3;->l([BI)F

    throw v17

    :cond_46
    const/4 v0, 0x5

    if-eq v1, v0, :cond_47

    goto :goto_2f

    :cond_47
    invoke-static {v13}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    invoke-static {v15, v10}, Lcom/google/android/gms/internal/measurement/n3;->l([BI)F

    throw v17

    :pswitch_1b
    move/from16 v7, p4

    move v9, v10

    move v10, v13

    move/from16 v8, v21

    move-object/from16 v29, v27

    const/4 v0, 0x2

    move-object v13, v12

    if-ne v1, v0, :cond_4a

    invoke-static {v13}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    invoke-static {v15, v10, v14}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget v1, v14, Lcom/google/android/gms/internal/measurement/p3;->a:I

    add-int/2addr v1, v0

    if-lt v0, v1, :cond_49

    if-ne v0, v1, :cond_48

    goto :goto_30

    :cond_48
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->f()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    throw v0

    :cond_49
    invoke-static {v15, v0}, Lcom/google/android/gms/internal/measurement/n3;->a([BI)D

    throw v17

    :cond_4a
    const/4 v0, 0x1

    if-eq v1, v0, :cond_4e

    :cond_4b
    :goto_2f
    move v0, v10

    :cond_4c
    :goto_30
    if-ne v0, v10, :cond_4d

    move v2, v0

    move v5, v7

    move v11, v8

    move v10, v9

    move-object v4, v14

    move/from16 v14, v20

    move/from16 v13, v24

    move-object/from16 v7, p1

    move/from16 v9, p5

    goto/16 :goto_41

    :cond_4d
    move/from16 v5, p5

    move v4, v7

    move v11, v8

    move v10, v9

    move-object v2, v14

    move/from16 v9, v20

    move/from16 v13, v24

    move/from16 v14, v28

    move-object/from16 v3, v29

    move-object/from16 v7, p1

    :goto_31
    move v8, v0

    goto/16 :goto_0

    :cond_4e
    invoke-static {v13}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    invoke-static {v15, v10}, Lcom/google/android/gms/internal/measurement/n3;->a([BI)D

    throw v17

    :cond_4f
    move/from16 v7, p4

    move-object/from16 v29, v3

    move v5, v10

    move v10, v13

    move/from16 v8, v21

    const/16 v3, 0x32

    if-ne v4, v3, :cond_54

    const/4 v3, 0x2

    if-ne v1, v3, :cond_53

    sget-object v0, Lcom/google/android/gms/internal/measurement/M4;->s:Lsun/misc/Unsafe;

    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/measurement/M4;->Q(I)Ljava/lang/Object;

    move-result-object v1

    move v3, v7

    move-object/from16 v7, p1

    invoke-virtual {v0, v7, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->q:Lcom/google/android/gms/internal/measurement/F4;

    invoke-interface {v4, v2}, Lcom/google/android/gms/internal/measurement/F4;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_50

    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->q:Lcom/google/android/gms/internal/measurement/F4;

    invoke-interface {v4, v1}, Lcom/google/android/gms/internal/measurement/F4;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, v6, Lcom/google/android/gms/internal/measurement/M4;->q:Lcom/google/android/gms/internal/measurement/F4;

    invoke-interface {v5, v4, v2}, Lcom/google/android/gms/internal/measurement/F4;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v7, v11, v12, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object v2, v4

    :cond_50
    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->q:Lcom/google/android/gms/internal/measurement/F4;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/measurement/F4;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/D4;

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->q:Lcom/google/android/gms/internal/measurement/F4;

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/measurement/F4;->h(Ljava/lang/Object;)Ljava/util/Map;

    invoke-static {v15, v10, v14}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget v1, v14, Lcom/google/android/gms/internal/measurement/p3;->a:I

    if-ltz v1, :cond_52

    sub-int v0, v3, v0

    if-le v1, v0, :cond_51

    goto :goto_32

    :cond_51
    throw v17

    :cond_52
    :goto_32
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->f()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    throw v0

    :cond_53
    move v3, v7

    move-object/from16 v7, p1

    :goto_33
    move/from16 v9, p5

    move v11, v8

    move v2, v10

    move-object v4, v14

    move/from16 v14, v20

    move/from16 v13, v24

    move v10, v5

    move v5, v3

    goto/16 :goto_41

    :cond_54
    move v3, v7

    move-object/from16 v7, p1

    sget-object v13, Lcom/google/android/gms/internal/measurement/M4;->s:Lsun/misc/Unsafe;

    add-int/lit8 v18, v5, 0x2

    aget v9, v9, v18

    const v3, 0xfffff

    and-int/2addr v9, v3

    move/from16 v21, v10

    int-to-long v9, v9

    packed-switch v4, :pswitch_data_2

    :cond_55
    move/from16 v18, v5

    move-object v4, v14

    move/from16 v14, v20

    move/from16 v5, p4

    move/from16 v20, v8

    move/from16 v8, v21

    goto/16 :goto_3f

    :pswitch_1c
    const/4 v0, 0x3

    if-ne v1, v0, :cond_55

    move/from16 v4, v20

    invoke-virtual {v6, v7, v4, v5}, Lcom/google/android/gms/internal/measurement/M4;->q(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v0

    and-int/lit8 v1, v8, -0x8

    or-int/lit8 v13, v1, 0x4

    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v9

    move v2, v8

    move-object v8, v0

    move/from16 v1, v21

    move-object/from16 v10, p2

    move v11, v1

    move/from16 v12, p4

    move-object v3, v14

    move-object/from16 v14, p6

    invoke-static/range {v8 .. v14}, Lcom/google/android/gms/internal/measurement/n3;->h(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/Z4;[BIIILcom/google/android/gms/internal/measurement/p3;)I

    move-result v8

    invoke-virtual {v6, v7, v4, v5, v0}, Lcom/google/android/gms/internal/measurement/M4;->w(Ljava/lang/Object;IILjava/lang/Object;)V

    move/from16 v20, v2

    move v14, v4

    move/from16 v18, v5

    move v0, v8

    move/from16 v5, p4

    move v8, v1

    :goto_34
    move-object v4, v3

    goto/16 :goto_40

    :pswitch_1d
    move v2, v8

    move-object v3, v14

    move/from16 v4, v20

    move/from16 v8, v21

    if-nez v1, :cond_56

    invoke-static {v15, v8, v3}, Lcom/google/android/gms/internal/measurement/n3;->p([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    move/from16 p3, v0

    iget-wide v0, v3, Lcom/google/android/gms/internal/measurement/p3;->b:J

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/G3;->b(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v13, v7, v11, v12, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v13, v7, v9, v10, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move/from16 v0, p3

    :goto_35
    move/from16 v20, v2

    move v14, v4

    move/from16 v18, v5

    move/from16 v5, p4

    goto :goto_34

    :cond_56
    move/from16 v20, v2

    move v14, v4

    move/from16 v18, v5

    move/from16 v5, p4

    move-object v4, v3

    goto/16 :goto_3f

    :pswitch_1e
    move v2, v8

    move-object v3, v14

    move/from16 v4, v20

    move/from16 v8, v21

    if-nez v1, :cond_56

    invoke-static {v15, v8, v3}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget v1, v3, Lcom/google/android/gms/internal/measurement/p3;->a:I

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/G3;->e(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_36
    invoke-virtual {v13, v7, v11, v12, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v13, v7, v9, v10, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_35

    :pswitch_1f
    move v2, v8

    move-object v3, v14

    move/from16 v4, v20

    move/from16 v8, v21

    if-nez v1, :cond_56

    invoke-static {v15, v8, v3}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget v1, v3, Lcom/google/android/gms/internal/measurement/p3;->a:I

    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/measurement/M4;->M(I)Lcom/google/android/gms/internal/measurement/g4;

    move-result-object v14

    if-eqz v14, :cond_58

    invoke-interface {v14, v1}, Lcom/google/android/gms/internal/measurement/g4;->e(I)Z

    move-result v14

    if-eqz v14, :cond_57

    goto :goto_37

    :cond_57
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/M4;->O(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/v5;

    move-result-object v9

    int-to-long v10, v1

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v9, v2, v1}, Lcom/google/android/gms/internal/measurement/v5;->e(ILjava/lang/Object;)V

    goto :goto_35

    :cond_58
    :goto_37
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_36

    :pswitch_20
    move v2, v8

    move-object v3, v14

    move/from16 v4, v20

    move/from16 v8, v21

    const/4 v0, 0x2

    if-ne v1, v0, :cond_56

    invoke-static {v15, v8, v3}, Lcom/google/android/gms/internal/measurement/n3;->j([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget-object v1, v3, Lcom/google/android/gms/internal/measurement/p3;->c:Ljava/lang/Object;

    goto :goto_36

    :pswitch_21
    move v2, v8

    move-object v3, v14

    move/from16 v4, v20

    move/from16 v8, v21

    const/4 v0, 0x2

    if-ne v1, v0, :cond_56

    invoke-virtual {v6, v7, v4, v5}, Lcom/google/android/gms/internal/measurement/M4;->q(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v1

    move-object v0, v9

    move v14, v2

    move-object/from16 v2, p2

    move/from16 v10, p4

    move-object v11, v3

    const v12, 0xfffff

    move v3, v8

    move v13, v4

    move/from16 v4, p4

    move/from16 v20, v14

    move v14, v5

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/n3;->i(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/Z4;[BIILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    invoke-virtual {v6, v7, v13, v14, v9}, Lcom/google/android/gms/internal/measurement/M4;->w(Ljava/lang/Object;IILjava/lang/Object;)V

    move v5, v10

    move-object v4, v11

    move/from16 v18, v14

    move v14, v13

    goto/16 :goto_40

    :pswitch_22
    move/from16 v18, v5

    move-object v4, v14

    move/from16 v14, v20

    const/4 v3, 0x2

    move/from16 v5, p4

    move/from16 v20, v8

    move/from16 v8, v21

    if-ne v1, v3, :cond_5d

    invoke-static {v15, v8, v4}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v1

    iget v3, v4, Lcom/google/android/gms/internal/measurement/p3;->a:I

    if-nez v3, :cond_59

    invoke-virtual {v13, v7, v11, v12, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_39

    :cond_59
    const/high16 v2, 0x20000000

    and-int/2addr v0, v2

    if-eqz v0, :cond_5b

    add-int v0, v1, v3

    invoke-static {v15, v1, v0}, Lcom/google/android/gms/internal/measurement/E5;->f([BII)Z

    move-result v0

    if-eqz v0, :cond_5a

    goto :goto_38

    :cond_5a
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->c()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    throw v0

    :cond_5b
    :goto_38
    new-instance v0, Ljava/lang/String;

    sget-object v2, Lcom/google/android/gms/internal/measurement/a4;->b:Ljava/nio/charset/Charset;

    invoke-direct {v0, v15, v1, v3, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-virtual {v13, v7, v11, v12, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/2addr v1, v3

    :goto_39
    invoke-virtual {v13, v7, v9, v10, v14}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move v0, v1

    goto/16 :goto_40

    :pswitch_23
    move/from16 v18, v5

    move-object v4, v14

    move/from16 v14, v20

    move/from16 v5, p4

    move/from16 v20, v8

    move/from16 v8, v21

    if-nez v1, :cond_5d

    invoke-static {v15, v8, v4}, Lcom/google/android/gms/internal/measurement/n3;->p([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget-wide v1, v4, Lcom/google/android/gms/internal/measurement/p3;->b:J

    cmp-long v1, v1, v22

    if-eqz v1, :cond_5c

    const/16 v26, 0x1

    goto :goto_3a

    :cond_5c
    move/from16 v26, v16

    :goto_3a
    invoke-static/range {v26 .. v26}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :goto_3b
    invoke-virtual {v13, v7, v11, v12, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v13, v7, v9, v10, v14}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_40

    :pswitch_24
    move/from16 v18, v5

    move-object v4, v14

    move/from16 v14, v20

    const/4 v0, 0x5

    move/from16 v5, p4

    move/from16 v20, v8

    move/from16 v8, v21

    if-ne v1, v0, :cond_5d

    invoke-static {v15, v8}, Lcom/google/android/gms/internal/measurement/n3;->n([BI)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_3c
    invoke-virtual {v13, v7, v11, v12, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v11, v8, 0x4

    :goto_3d
    invoke-virtual {v13, v7, v9, v10, v14}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move v0, v11

    goto/16 :goto_40

    :pswitch_25
    move/from16 v18, v5

    move-object v4, v14

    move/from16 v14, v20

    const/4 v0, 0x1

    move/from16 v5, p4

    move/from16 v20, v8

    move/from16 v8, v21

    if-ne v1, v0, :cond_5d

    invoke-static {v15, v8}, Lcom/google/android/gms/internal/measurement/n3;->q([BI)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_3e
    invoke-virtual {v13, v7, v11, v12, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v11, v8, 0x8

    goto :goto_3d

    :pswitch_26
    move/from16 v18, v5

    move-object v4, v14

    move/from16 v14, v20

    move/from16 v5, p4

    move/from16 v20, v8

    move/from16 v8, v21

    if-nez v1, :cond_5d

    invoke-static {v15, v8, v4}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget v1, v4, Lcom/google/android/gms/internal/measurement/p3;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_3b

    :pswitch_27
    move/from16 v18, v5

    move-object v4, v14

    move/from16 v14, v20

    move/from16 v5, p4

    move/from16 v20, v8

    move/from16 v8, v21

    if-nez v1, :cond_5d

    invoke-static {v15, v8, v4}, Lcom/google/android/gms/internal/measurement/n3;->p([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget-wide v1, v4, Lcom/google/android/gms/internal/measurement/p3;->b:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_3b

    :pswitch_28
    move/from16 v18, v5

    move-object v4, v14

    move/from16 v14, v20

    const/4 v0, 0x5

    move/from16 v5, p4

    move/from16 v20, v8

    move/from16 v8, v21

    if-ne v1, v0, :cond_5d

    invoke-static {v15, v8}, Lcom/google/android/gms/internal/measurement/n3;->l([BI)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    goto :goto_3c

    :pswitch_29
    move/from16 v18, v5

    move-object v4, v14

    move/from16 v14, v20

    const/4 v0, 0x1

    move/from16 v5, p4

    move/from16 v20, v8

    move/from16 v8, v21

    if-ne v1, v0, :cond_5d

    invoke-static {v15, v8}, Lcom/google/android/gms/internal/measurement/n3;->a([BI)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto :goto_3e

    :cond_5d
    :goto_3f
    move v0, v8

    :goto_40
    if-ne v0, v8, :cond_61

    move/from16 v9, p5

    move v2, v0

    move/from16 v10, v18

    move/from16 v11, v20

    move/from16 v13, v24

    :goto_41
    if-ne v11, v9, :cond_5f

    if-nez v9, :cond_5e

    goto :goto_43

    :cond_5e
    move v8, v2

    move v10, v5

    move/from16 v14, v28

    :goto_42
    const v12, 0xfffff

    goto/16 :goto_45

    :cond_5f
    :goto_43
    iget-boolean v0, v6, Lcom/google/android/gms/internal/measurement/M4;->f:Z

    if-eqz v0, :cond_60

    iget-object v0, v4, Lcom/google/android/gms/internal/measurement/p3;->d:Lcom/google/android/gms/internal/measurement/M3;

    sget-object v1, Lcom/google/android/gms/internal/measurement/M3;->c:Lcom/google/android/gms/internal/measurement/M3;

    if-eq v0, v1, :cond_60

    iget-object v1, v6, Lcom/google/android/gms/internal/measurement/M4;->e:Lcom/google/android/gms/internal/measurement/I4;

    invoke-virtual {v0, v1, v14}, Lcom/google/android/gms/internal/measurement/M3;->b(Lcom/google/android/gms/internal/measurement/I4;I)Lcom/google/android/gms/internal/measurement/Y3$d;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/M4;->O(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/v5;

    move-result-object v8

    move v0, v11

    move-object/from16 v1, p2

    const v12, 0xfffff

    move/from16 v3, p4

    move-object v4, v8

    move v8, v5

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/n3;->c(I[BIILcom/google/android/gms/internal/measurement/v5;Lcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    :goto_44
    move-object/from16 v2, p6

    move v4, v8

    move v5, v9

    move v9, v14

    move/from16 v14, v28

    move-object/from16 v3, v29

    goto/16 :goto_31

    :cond_60
    move v8, v5

    const v12, 0xfffff

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/M4;->O(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/v5;

    move-result-object v4

    move v0, v11

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/n3;->c(I[BIILcom/google/android/gms/internal/measurement/v5;Lcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    goto :goto_44

    :cond_61
    move/from16 v11, v20

    move-object/from16 v2, p6

    move v8, v0

    move v4, v5

    move v9, v14

    move/from16 v10, v18

    move/from16 v13, v24

    move/from16 v14, v28

    move-object/from16 v3, v29

    goto/16 :goto_7

    :cond_62
    move-object/from16 v29, v3

    move v10, v4

    move v9, v5

    move/from16 v24, v13

    move/from16 v28, v14

    goto :goto_42

    :goto_45
    if-eq v14, v12, :cond_63

    int-to-long v0, v14

    move-object/from16 v2, v29

    invoke-virtual {v2, v7, v0, v1, v13}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_63
    iget v0, v6, Lcom/google/android/gms/internal/measurement/M4;->k:I

    move v12, v0

    move-object/from16 v3, v17

    :goto_46
    iget v0, v6, Lcom/google/android/gms/internal/measurement/M4;->l:I

    if-ge v12, v0, :cond_64

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->j:[I

    aget v2, v0, v12

    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/M4;->o:Lcom/google/android/gms/internal/measurement/x5;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v5, p1

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/M4;->r(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/x5;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/google/android/gms/internal/measurement/v5;

    add-int/lit8 v12, v12, 0x1

    goto :goto_46

    :cond_64
    if-eqz v3, :cond_65

    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/M4;->o:Lcom/google/android/gms/internal/measurement/x5;

    invoke-virtual {v0, v7, v3}, Lcom/google/android/gms/internal/measurement/x5;->h(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_65
    if-nez v9, :cond_67

    if-ne v8, v10, :cond_66

    goto :goto_47

    :cond_66
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->e()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    throw v0

    :cond_67
    if-gt v8, v10, :cond_68

    if-ne v11, v9, :cond_68

    :goto_47
    return v8

    :cond_68
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->e()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    throw v0

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

    :pswitch_data_1
    .packed-switch 0x12
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_18
        :pswitch_11
        :pswitch_16
        :pswitch_17
        :pswitch_10
        :pswitch_f
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_18
        :pswitch_11
        :pswitch_16
        :pswitch_17
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x33
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_26
        :pswitch_1f
        :pswitch_24
        :pswitch_25
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
    .end packed-switch
.end method

.method public final o(IILjava/util/Map;Lcom/google/android/gms/internal/measurement/g4;Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/x5;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->q:Lcom/google/android/gms/internal/measurement/F4;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/M4;->Q(I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/measurement/F4;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/D4;

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p4, v0}, Lcom/google/android/gms/internal/measurement/g4;->e(I)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p5, :cond_1

    invoke-virtual {p6, p7}, Lcom/google/android/gms/internal/measurement/x5;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    :cond_1
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lcom/google/android/gms/internal/measurement/A4;->a(Lcom/google/android/gms/internal/measurement/D4;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/q3;->U(I)Lcom/google/android/gms/internal/measurement/z3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/z3;->b()Lcom/google/android/gms/internal/measurement/J3;

    move-result-object v1

    :try_start_0
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    invoke-static {v1, v2, v3, p3}, Lcom/google/android/gms/internal/measurement/A4;->b(Lcom/google/android/gms/internal/measurement/J3;Lcom/google/android/gms/internal/measurement/D4;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/z3;->a()Lcom/google/android/gms/internal/measurement/q3;

    move-result-object p3

    invoke-virtual {p6, p5, p2, p3}, Lcom/google/android/gms/internal/measurement/x5;->c(Ljava/lang/Object;ILcom/google/android/gms/internal/measurement/q3;)V

    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_2
    return-object p5
.end method

.method public final p(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v0

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/M4;->G(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/Z4;->a()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, Lcom/google/android/gms/internal/measurement/M4;->s:Lsun/misc/Unsafe;

    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/M4;->T(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/Z4;->a()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/Z4;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method public final q(Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/M4;->J(Ljava/lang/Object;II)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/Z4;->a()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, Lcom/google/android/gms/internal/measurement/M4;->s:Lsun/misc/Unsafe;

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/M4;->G(I)I

    move-result p3

    const v1, 0xfffff

    and-int/2addr p3, v1

    int-to-long v1, p3

    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/M4;->T(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/Z4;->a()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/Z4;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method public final r(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/x5;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget v3, v0, p2

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/M4;->G(I)I

    move-result v0

    const v1, 0xfffff

    and-int/2addr v0, v1

    int-to-long v0, v0

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/D5;->B(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    return-object p3

    :cond_0
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/M4;->M(I)Lcom/google/android/gms/internal/measurement/g4;

    move-result-object v5

    if-nez v5, :cond_1

    return-object p3

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->q:Lcom/google/android/gms/internal/measurement/F4;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/measurement/F4;->h(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v4

    move-object v1, p0

    move v2, p2

    move-object v6, p3

    move-object v7, p4

    move-object v8, p5

    invoke-virtual/range {v1 .. v8}, Lcom/google/android/gms/internal/measurement/M4;->o(IILjava/util/Map;Lcom/google/android/gms/internal/measurement/g4;Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/x5;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final v(Lcom/google/android/gms/internal/measurement/T5;ILjava/lang/Object;I)V
    .locals 1

    .line 1
    if-eqz p3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->q:Lcom/google/android/gms/internal/measurement/F4;

    invoke-virtual {p0, p4}, Lcom/google/android/gms/internal/measurement/M4;->Q(I)Ljava/lang/Object;

    move-result-object p4

    invoke-interface {v0, p4}, Lcom/google/android/gms/internal/measurement/F4;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/D4;

    iget-object p4, p0, Lcom/google/android/gms/internal/measurement/M4;->q:Lcom/google/android/gms/internal/measurement/F4;

    invoke-interface {p4, p3}, Lcom/google/android/gms/internal/measurement/F4;->c(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p3

    const/4 p4, 0x0

    invoke-interface {p1, p2, p4, p3}, Lcom/google/android/gms/internal/measurement/T5;->o(ILcom/google/android/gms/internal/measurement/D4;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public final w(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/M4;->s:Lsun/misc/Unsafe;

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/M4;->G(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0, p1, v1, v2, p4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/M4;->E(Ljava/lang/Object;II)V

    return-void
.end method

.method public final x(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/M4;->s:Lsun/misc/Unsafe;

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/M4;->G(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0, p1, v1, v2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/M4;->D(Ljava/lang/Object;I)V

    return-void
.end method

.method public final y(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 5

    .line 1
    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/M4;->G(I)I

    move-result v0

    const v1, 0xfffff

    and-int/2addr v0, v1

    int-to-long v0, v0

    sget-object v2, Lcom/google/android/gms/internal/measurement/M4;->s:Lsun/misc/Unsafe;

    invoke-virtual {v2, p2, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/M4;->N(I)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object p2

    invoke-virtual {p0, p1, p3}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/M4;->T(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v2, p1, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/Z4;->a()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4, v3}, Lcom/google/android/gms/internal/measurement/Z4;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-virtual {p0, p1, p3}, Lcom/google/android/gms/internal/measurement/M4;->D(Ljava/lang/Object;I)V

    return-void

    :cond_2
    invoke-virtual {v2, p1, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/measurement/M4;->T(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/Z4;->a()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4, p3}, Lcom/google/android/gms/internal/measurement/Z4;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p3, v4

    :cond_3
    invoke-interface {p2, p3, v3}, Lcom/google/android/gms/internal/measurement/Z4;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M4;->a:[I

    aget p3, v0, p3

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Source subfield "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " is present but null: "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final z(Ljava/lang/Object;IIII)Z
    .locals 1

    .line 1
    const v0, 0xfffff

    if-ne p3, v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/M4;->I(Ljava/lang/Object;I)Z

    move-result p1

    return p1

    :cond_0
    and-int p1, p4, p5

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
