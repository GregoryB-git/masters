.class public final Lcom/google/android/exoplayer2/source/dash/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz4/r;
.implements Lz4/d0$a;
.implements Lb5/h$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/dash/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lz4/r;",
        "Lz4/d0$a<",
        "Lb5/h<",
        "Lcom/google/android/exoplayer2/source/dash/a;",
        ">;>;",
        "Lb5/h$b<",
        "Lcom/google/android/exoplayer2/source/dash/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final G:Ljava/util/regex/Pattern;

.field public static final H:Ljava/util/regex/Pattern;


# instance fields
.field public A:[Lb5/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lb5/h<",
            "Lcom/google/android/exoplayer2/source/dash/a;",
            ">;"
        }
    .end annotation
.end field

.field public B:[Lc5/f;

.field public C:Lb1/v;

.field public D:Ld5/c;

.field public E:I

.field public F:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld5/f;",
            ">;"
        }
    .end annotation
.end field

.field public final a:I

.field public final b:Lcom/google/android/exoplayer2/source/dash/a$a;

.field public final c:Lt5/l0;

.field public final d:La4/h;

.field public final e:Lt5/c0;

.field public final f:Lc5/a;

.field public final o:J

.field public final p:Lt5/e0;

.field public final q:Lt5/b;

.field public final r:Lz4/j0;

.field public final s:[Lcom/google/android/exoplayer2/source/dash/b$a;

.field public final t:Lz4/i;

.field public final u:Lcom/google/android/exoplayer2/source/dash/d;

.field public final v:Ljava/util/IdentityHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/IdentityHashMap<",
            "Lb5/h<",
            "Lcom/google/android/exoplayer2/source/dash/a;",
            ">;",
            "Lcom/google/android/exoplayer2/source/dash/d$c;",
            ">;"
        }
    .end annotation
.end field

.field public final w:Lz4/w$a;

.field public final x:La4/g$a;

.field public final y:Lw3/a0;

.field public z:Lz4/r$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "CC([1-4])=(.+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/exoplayer2/source/dash/b;->G:Ljava/util/regex/Pattern;

    const-string v0, "([1-4])=lang:(\\w+)(,.+)?"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/exoplayer2/source/dash/b;->H:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(ILd5/c;Lc5/a;ILcom/google/android/exoplayer2/source/dash/a$a;Lt5/l0;La4/h;La4/g$a;Lt5/c0;Lz4/w$a;JLt5/e0;Lt5/b;Lz4/i;Lcom/google/android/exoplayer2/source/dash/DashMediaSource$c;Lw3/a0;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p4

    move-object/from16 v3, p7

    move-object/from16 v4, p14

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move/from16 v5, p1

    iput v5, v0, Lcom/google/android/exoplayer2/source/dash/b;->a:I

    iput-object v1, v0, Lcom/google/android/exoplayer2/source/dash/b;->D:Ld5/c;

    move-object/from16 v5, p3

    iput-object v5, v0, Lcom/google/android/exoplayer2/source/dash/b;->f:Lc5/a;

    iput v2, v0, Lcom/google/android/exoplayer2/source/dash/b;->E:I

    move-object/from16 v5, p5

    iput-object v5, v0, Lcom/google/android/exoplayer2/source/dash/b;->b:Lcom/google/android/exoplayer2/source/dash/a$a;

    move-object/from16 v5, p6

    iput-object v5, v0, Lcom/google/android/exoplayer2/source/dash/b;->c:Lt5/l0;

    iput-object v3, v0, Lcom/google/android/exoplayer2/source/dash/b;->d:La4/h;

    move-object/from16 v5, p8

    iput-object v5, v0, Lcom/google/android/exoplayer2/source/dash/b;->x:La4/g$a;

    move-object/from16 v5, p9

    iput-object v5, v0, Lcom/google/android/exoplayer2/source/dash/b;->e:Lt5/c0;

    move-object/from16 v5, p10

    iput-object v5, v0, Lcom/google/android/exoplayer2/source/dash/b;->w:Lz4/w$a;

    move-wide/from16 v5, p11

    iput-wide v5, v0, Lcom/google/android/exoplayer2/source/dash/b;->o:J

    move-object/from16 v5, p13

    iput-object v5, v0, Lcom/google/android/exoplayer2/source/dash/b;->p:Lt5/e0;

    iput-object v4, v0, Lcom/google/android/exoplayer2/source/dash/b;->q:Lt5/b;

    move-object/from16 v5, p15

    iput-object v5, v0, Lcom/google/android/exoplayer2/source/dash/b;->t:Lz4/i;

    move-object/from16 v6, p17

    iput-object v6, v0, Lcom/google/android/exoplayer2/source/dash/b;->y:Lw3/a0;

    new-instance v6, Lcom/google/android/exoplayer2/source/dash/d;

    move-object/from16 v7, p16

    invoke-direct {v6, v1, v7, v4}, Lcom/google/android/exoplayer2/source/dash/d;-><init>(Ld5/c;Lcom/google/android/exoplayer2/source/dash/DashMediaSource$c;Lt5/b;)V

    iput-object v6, v0, Lcom/google/android/exoplayer2/source/dash/b;->u:Lcom/google/android/exoplayer2/source/dash/d;

    const/4 v4, 0x0

    new-array v6, v4, [Lb5/h;

    iput-object v6, v0, Lcom/google/android/exoplayer2/source/dash/b;->A:[Lb5/h;

    new-array v6, v4, [Lc5/f;

    iput-object v6, v0, Lcom/google/android/exoplayer2/source/dash/b;->B:[Lc5/f;

    new-instance v6, Ljava/util/IdentityHashMap;

    invoke-direct {v6}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v6, v0, Lcom/google/android/exoplayer2/source/dash/b;->v:Ljava/util/IdentityHashMap;

    iget-object v6, v0, Lcom/google/android/exoplayer2/source/dash/b;->A:[Lb5/h;

    invoke-virtual/range {p15 .. p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    new-instance v5, Lb1/v;

    invoke-direct {v5, v6}, Lb1/v;-><init>(Ljava/lang/Object;)V

    .line 2
    iput-object v5, v0, Lcom/google/android/exoplayer2/source/dash/b;->C:Lb1/v;

    invoke-virtual {v1, v2}, Ld5/c;->b(I)Ld5/g;

    move-result-object v1

    iget-object v2, v1, Ld5/g;->d:Ljava/util/List;

    iput-object v2, v0, Lcom/google/android/exoplayer2/source/dash/b;->F:Ljava/util/List;

    iget-object v1, v1, Ld5/g;->c:Ljava/util/List;

    .line 3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    new-instance v6, Landroid/util/SparseIntArray;

    invoke-direct {v6, v5}, Landroid/util/SparseIntArray;-><init>(I)V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v5}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v8, Landroid/util/SparseArray;

    invoke-direct {v8, v5}, Landroid/util/SparseArray;-><init>(I)V

    move v9, v4

    :goto_0
    if-ge v9, v5, :cond_0

    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ld5/a;

    iget v10, v10, Ld5/a;->a:I

    invoke-virtual {v6, v10, v9}, Landroid/util/SparseIntArray;->put(II)V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v8, v9, v10}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_0
    move v9, v4

    :goto_1
    const/4 v10, -0x1

    if-ge v4, v5, :cond_c

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ld5/a;

    iget-object v12, v11, Ld5/a;->e:Ljava/util/List;

    .line 4
    :goto_2
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v13

    const-string v14, "http://dashif.org/guidelines/trickmode"

    if-ge v9, v13, :cond_2

    invoke-interface {v12, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ld5/e;

    iget-object v15, v13, Ld5/e;->a:Ljava/lang/String;

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_1

    goto :goto_3

    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_2
    const/4 v13, 0x0

    :goto_3
    if-nez v13, :cond_5

    .line 5
    iget-object v9, v11, Ld5/a;->f:Ljava/util/List;

    const/4 v12, 0x0

    .line 6
    :goto_4
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v13

    if-ge v12, v13, :cond_4

    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ld5/e;

    iget-object v15, v13, Ld5/e;->a:Ljava/lang/String;

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_3

    goto :goto_5

    :cond_3
    add-int/lit8 v12, v12, 0x1

    goto :goto_4

    :cond_4
    const/4 v13, 0x0

    :cond_5
    :goto_5
    if-eqz v13, :cond_6

    .line 7
    iget-object v9, v13, Ld5/e;->b:Ljava/lang/String;

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    invoke-virtual {v6, v9, v10}, Landroid/util/SparseIntArray;->get(II)I

    move-result v9

    if-eq v9, v10, :cond_6

    goto :goto_6

    :cond_6
    move v9, v4

    :goto_6
    if-ne v9, v4, :cond_a

    iget-object v11, v11, Ld5/a;->f:Ljava/util/List;

    const/4 v12, 0x0

    .line 8
    :goto_7
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v13

    if-ge v12, v13, :cond_8

    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ld5/e;

    iget-object v14, v13, Ld5/e;->a:Ljava/lang/String;

    const-string v15, "urn:mpeg:dash:adaptation-set-switching:2016"

    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_7

    move-object v15, v13

    goto :goto_8

    :cond_7
    add-int/lit8 v12, v12, 0x1

    goto :goto_7

    :cond_8
    const/4 v15, 0x0

    :goto_8
    if-eqz v15, :cond_a

    .line 9
    iget-object v11, v15, Ld5/e;->b:Ljava/lang/String;

    sget v12, Lv5/e0;->a:I

    const-string v12, ","

    .line 10
    invoke-virtual {v11, v12, v10}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v11

    .line 11
    array-length v12, v11

    const/4 v13, 0x0

    :goto_9
    if-ge v13, v12, :cond_a

    aget-object v14, v11, v13

    invoke-static {v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v14

    invoke-virtual {v6, v14, v10}, Landroid/util/SparseIntArray;->get(II)I

    move-result v14

    if-eq v14, v10, :cond_9

    invoke-static {v9, v14}, Ljava/lang/Math;->min(II)I

    move-result v9

    :cond_9
    add-int/lit8 v13, v13, 0x1

    goto :goto_9

    :cond_a
    if-eq v9, v4, :cond_b

    invoke-virtual {v8, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/List;

    invoke-virtual {v8, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    invoke-interface {v9, v10}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v8, v4, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_b
    add-int/lit8 v4, v4, 0x1

    const/4 v9, 0x0

    goto/16 :goto_1

    :cond_c
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v4

    new-array v5, v4, [[I

    const/4 v6, 0x0

    :goto_a
    if-ge v6, v4, :cond_d

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Collection;

    invoke-static {v8}, Lr7/a;->F(Ljava/util/Collection;)[I

    move-result-object v8

    aput-object v8, v5, v6

    invoke-static {v8}, Ljava/util/Arrays;->sort([I)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_a

    .line 12
    :cond_d
    new-array v6, v4, [Z

    new-array v7, v4, [[Lv3/i0;

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_b
    const-string v10, ":"

    if-ge v8, v4, :cond_1a

    .line 13
    aget-object v11, v5, v8

    .line 14
    array-length v12, v11

    const/4 v13, 0x0

    :goto_c
    if-ge v13, v12, :cond_10

    aget v14, v11, v13

    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ld5/a;

    iget-object v14, v14, Ld5/a;->c:Ljava/util/List;

    const/4 v15, 0x0

    move-object/from16 p1, v11

    :goto_d
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v11

    if-ge v15, v11, :cond_f

    invoke-interface {v14, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ld5/j;

    iget-object v11, v11, Ld5/j;->d:Ljava/util/List;

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_e

    const/4 v11, 0x1

    goto :goto_e

    :cond_e
    add-int/lit8 v15, v15, 0x1

    goto :goto_d

    :cond_f
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v11, p1

    goto :goto_c

    :cond_10
    const/4 v11, 0x0

    :goto_e
    if-eqz v11, :cond_11

    const/4 v11, 0x1

    .line 15
    aput-boolean v11, v6, v8

    add-int/lit8 v9, v9, 0x1

    :cond_11
    aget-object v11, v5, v8

    .line 16
    array-length v12, v11

    const/4 v13, 0x0

    :goto_f
    if-ge v13, v12, :cond_18

    aget v14, v11, v13

    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ld5/a;

    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ld5/a;

    iget-object v14, v14, Ld5/a;->d:Ljava/util/List;

    const/16 v16, 0x0

    move-object/from16 p1, v11

    move/from16 v11, v16

    move/from16 v16, v12

    :goto_10
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v12

    if-ge v11, v12, :cond_17

    invoke-interface {v14, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ld5/e;

    move-object/from16 p2, v14

    iget-object v14, v12, Ld5/e;->a:Ljava/lang/String;

    const-string v0, "urn:scte:dash:cc:cea-608:2015"

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    new-instance v0, Lv3/i0$a;

    invoke-direct {v0}, Lv3/i0$a;-><init>()V

    const-string v11, "application/cea-608"

    .line 17
    iput-object v11, v0, Lv3/i0$a;->k:Ljava/lang/String;

    .line 18
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    iget v13, v15, Ld5/a;->a:I

    const-string v14, ":cea608"

    .line 19
    invoke-static {v11, v13, v14}, La0/j;->m(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 20
    iput-object v11, v0, Lv3/i0$a;->a:Ljava/lang/String;

    .line 21
    new-instance v11, Lv3/i0;

    invoke-direct {v11, v0}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 22
    sget-object v0, Lcom/google/android/exoplayer2/source/dash/b;->G:Ljava/util/regex/Pattern;

    goto :goto_11

    :cond_12
    iget-object v0, v12, Ld5/e;->a:Ljava/lang/String;

    const-string v14, "urn:scte:dash:cc:cea-708:2015"

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    new-instance v0, Lv3/i0$a;

    invoke-direct {v0}, Lv3/i0$a;-><init>()V

    const-string v11, "application/cea-708"

    .line 23
    iput-object v11, v0, Lv3/i0$a;->k:Ljava/lang/String;

    .line 24
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    iget v13, v15, Ld5/a;->a:I

    const-string v14, ":cea708"

    .line 25
    invoke-static {v11, v13, v14}, La0/j;->m(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 26
    iput-object v11, v0, Lv3/i0$a;->a:Ljava/lang/String;

    .line 27
    new-instance v11, Lv3/i0;

    invoke-direct {v11, v0}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 28
    sget-object v0, Lcom/google/android/exoplayer2/source/dash/b;->H:Ljava/util/regex/Pattern;

    .line 29
    :goto_11
    iget-object v12, v12, Ld5/e;->b:Ljava/lang/String;

    if-nez v12, :cond_13

    const/4 v0, 0x1

    new-array v0, v0, [Lv3/i0;

    const/4 v10, 0x0

    aput-object v11, v0, v10

    goto :goto_13

    :cond_13
    sget v13, Lv5/e0;->a:I

    const-string v13, ";"

    const/4 v14, -0x1

    .line 30
    invoke-virtual {v12, v13, v14}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v12

    .line 31
    array-length v13, v12

    new-array v13, v13, [Lv3/i0;

    const/4 v14, 0x0

    :goto_12
    array-length v15, v12

    if-ge v14, v15, :cond_14

    aget-object v15, v12, v14

    invoke-virtual {v0, v15}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v15

    invoke-virtual {v15}, Ljava/util/regex/Matcher;->matches()Z

    move-result v16

    if-nez v16, :cond_15

    const/4 v0, 0x1

    new-array v0, v0, [Lv3/i0;

    const/4 v10, 0x0

    aput-object v11, v0, v10

    :goto_13
    move-object v13, v0

    :cond_14
    move-object/from16 p3, v6

    goto :goto_14

    :cond_15
    move-object/from16 v16, v0

    const/4 v0, 0x1

    invoke-virtual {v15, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 p1, v12

    .line 32
    new-instance v12, Lv3/i0$a;

    invoke-direct {v12, v11}, Lv3/i0$a;-><init>(Lv3/i0;)V

    move-object/from16 p3, v6

    .line 33
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v11, Lv3/i0;->a:Ljava/lang/String;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 34
    iput-object v3, v12, Lv3/i0$a;->a:Ljava/lang/String;

    .line 35
    iput v0, v12, Lv3/i0$a;->C:I

    const/4 v0, 0x2

    .line 36
    invoke-virtual {v15, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    .line 37
    iput-object v0, v12, Lv3/i0$a;->c:Ljava/lang/String;

    .line 38
    new-instance v0, Lv3/i0;

    invoke-direct {v0, v12}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 39
    aput-object v0, v13, v14

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v12, p1

    move-object/from16 v6, p3

    move-object/from16 v3, p7

    move-object/from16 v0, v16

    goto :goto_12

    :cond_16
    move-object/from16 p3, v6

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v0, p0

    move-object/from16 v14, p2

    move-object/from16 v3, p7

    goto/16 :goto_10

    :cond_17
    move-object/from16 p3, v6

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, p0

    move-object/from16 v11, p1

    move-object/from16 v3, p7

    move/from16 v12, v16

    goto/16 :goto_f

    :cond_18
    move-object/from16 p3, v6

    const/4 v0, 0x0

    new-array v13, v0, [Lv3/i0;

    .line 40
    :goto_14
    aput-object v13, v7, v8

    array-length v0, v13

    if-eqz v0, :cond_19

    add-int/lit8 v9, v9, 0x1

    :cond_19
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v0, p0

    move-object/from16 v6, p3

    move-object/from16 v3, p7

    goto/16 :goto_b

    :cond_1a
    move-object/from16 p3, v6

    add-int/2addr v9, v4

    .line 41
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v0, v9

    new-array v3, v0, [Lz4/i0;

    new-array v0, v0, [Lcom/google/android/exoplayer2/source/dash/b$a;

    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_15
    const-string v9, "application/x-emsg"

    if-ge v6, v4, :cond_22

    .line 42
    aget-object v11, v5, v6

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    array-length v13, v11

    const/4 v14, 0x0

    :goto_16
    if-ge v14, v13, :cond_1b

    aget v15, v11, v14

    invoke-interface {v1, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ld5/a;

    iget-object v15, v15, Ld5/a;->c:Ljava/util/List;

    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v14, v14, 0x1

    goto :goto_16

    :cond_1b
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v13

    new-array v14, v13, [Lv3/i0;

    const/4 v15, 0x0

    :goto_17
    if-ge v15, v13, :cond_1c

    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move/from16 p1, v4

    move-object/from16 v4, v16

    check-cast v4, Ld5/j;

    iget-object v4, v4, Ld5/j;->a:Lv3/i0;

    move-object/from16 v16, v5

    move-object/from16 p2, v12

    move-object/from16 v5, p7

    invoke-interface {v5, v4}, La4/h;->e(Lv3/i0;)I

    move-result v12

    invoke-virtual {v4, v12}, Lv3/i0;->b(I)Lv3/i0;

    move-result-object v4

    aput-object v4, v14, v15

    add-int/lit8 v15, v15, 0x1

    move/from16 v4, p1

    move-object/from16 v12, p2

    move-object/from16 v5, v16

    goto :goto_17

    :cond_1c
    move/from16 p1, v4

    move-object/from16 v16, v5

    move-object/from16 v5, p7

    const/4 v4, 0x0

    aget v4, v11, v4

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld5/a;

    iget v12, v4, Ld5/a;->a:I

    const/4 v13, -0x1

    if-eq v12, v13, :cond_1d

    invoke-static {v12}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v12

    goto :goto_18

    :cond_1d
    const-string v12, "unset:"

    .line 43
    invoke-static {v12, v6}, Lf;->h(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v12

    :goto_18
    add-int/lit8 v13, v8, 0x1

    .line 44
    aget-boolean v15, p3, v6

    if-eqz v15, :cond_1e

    add-int/lit8 v15, v13, 0x1

    move-object/from16 p2, v1

    move/from16 v19, v15

    move v15, v13

    move/from16 v13, v19

    goto :goto_19

    :cond_1e
    const/4 v15, -0x1

    move-object/from16 p2, v1

    :goto_19
    aget-object v1, v7, v6

    array-length v1, v1

    if-eqz v1, :cond_1f

    add-int/lit8 v1, v13, 0x1

    move/from16 p4, v1

    goto :goto_1a

    :cond_1f
    const/4 v1, -0x1

    move/from16 p4, v13

    move v13, v1

    :goto_1a
    new-instance v1, Lz4/i0;

    invoke-direct {v1, v12, v14}, Lz4/i0;-><init>(Ljava/lang/String;[Lv3/i0;)V

    aput-object v1, v3, v8

    iget v1, v4, Ld5/a;->b:I

    .line 45
    new-instance v4, Lcom/google/android/exoplayer2/source/dash/b$a;

    const/4 v14, 0x0

    const/16 v17, -0x1

    move-object/from16 p8, v4

    move/from16 p9, v1

    move/from16 p10, v14

    move-object/from16 p11, v11

    move/from16 p12, v8

    move/from16 p13, v15

    move/from16 p14, v13

    move/from16 p15, v17

    invoke-direct/range {p8 .. p15}, Lcom/google/android/exoplayer2/source/dash/b$a;-><init>(II[IIIII)V

    .line 46
    aput-object v4, v0, v8

    const/4 v1, -0x1

    if-eq v15, v1, :cond_20

    const-string v1, ":emsg"

    .line 47
    invoke-static {v12, v1}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 48
    new-instance v4, Lv3/i0$a;

    invoke-direct {v4}, Lv3/i0$a;-><init>()V

    .line 49
    iput-object v1, v4, Lv3/i0$a;->a:Ljava/lang/String;

    .line 50
    iput-object v9, v4, Lv3/i0$a;->k:Ljava/lang/String;

    .line 51
    new-instance v9, Lv3/i0;

    invoke-direct {v9, v4}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 52
    new-instance v4, Lz4/i0;

    const/4 v14, 0x1

    new-array v14, v14, [Lv3/i0;

    const/16 v17, 0x0

    aput-object v9, v14, v17

    invoke-direct {v4, v1, v14}, Lz4/i0;-><init>(Ljava/lang/String;[Lv3/i0;)V

    aput-object v4, v3, v15

    .line 53
    new-instance v1, Lcom/google/android/exoplayer2/source/dash/b$a;

    const/4 v4, 0x5

    const/4 v9, 0x1

    const/4 v14, -0x1

    const/16 v17, -0x1

    const/16 v18, -0x1

    move-object/from16 p8, v1

    move/from16 p9, v4

    move/from16 p10, v9

    move-object/from16 p11, v11

    move/from16 p12, v8

    move/from16 p13, v14

    move/from16 p14, v17

    move/from16 p15, v18

    invoke-direct/range {p8 .. p15}, Lcom/google/android/exoplayer2/source/dash/b$a;-><init>(II[IIIII)V

    .line 54
    aput-object v1, v0, v15

    const/4 v1, -0x1

    :cond_20
    if-eq v13, v1, :cond_21

    const-string v1, ":cc"

    .line 55
    invoke-static {v12, v1}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 56
    new-instance v4, Lz4/i0;

    aget-object v9, v7, v6

    invoke-direct {v4, v1, v9}, Lz4/i0;-><init>(Ljava/lang/String;[Lv3/i0;)V

    aput-object v4, v3, v13

    .line 57
    new-instance v1, Lcom/google/android/exoplayer2/source/dash/b$a;

    const/4 v4, 0x3

    const/4 v9, 0x1

    const/4 v12, -0x1

    const/4 v14, -0x1

    const/4 v15, -0x1

    move-object/from16 p8, v1

    move/from16 p9, v4

    move/from16 p10, v9

    move-object/from16 p11, v11

    move/from16 p12, v8

    move/from16 p13, v12

    move/from16 p14, v14

    move/from16 p15, v15

    invoke-direct/range {p8 .. p15}, Lcom/google/android/exoplayer2/source/dash/b$a;-><init>(II[IIIII)V

    .line 58
    aput-object v1, v0, v13

    :cond_21
    add-int/lit8 v6, v6, 0x1

    move/from16 v4, p1

    move-object/from16 v1, p2

    move/from16 v8, p4

    move-object/from16 v5, v16

    goto/16 :goto_15

    :cond_22
    const/4 v1, 0x0

    .line 59
    :goto_1b
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_23

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld5/f;

    new-instance v5, Lv3/i0$a;

    invoke-direct {v5}, Lv3/i0$a;-><init>()V

    invoke-virtual {v4}, Ld5/f;->a()Ljava/lang/String;

    move-result-object v6

    .line 60
    iput-object v6, v5, Lv3/i0$a;->a:Ljava/lang/String;

    .line 61
    iput-object v9, v5, Lv3/i0$a;->k:Ljava/lang/String;

    .line 62
    new-instance v6, Lv3/i0;

    invoke-direct {v6, v5}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 63
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ld5/f;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lz4/i0;

    const/4 v7, 0x1

    new-array v7, v7, [Lv3/i0;

    const/4 v11, 0x0

    aput-object v6, v7, v11

    invoke-direct {v5, v4, v7}, Lz4/i0;-><init>(Ljava/lang/String;[Lv3/i0;)V

    aput-object v5, v3, v8

    add-int/lit8 v4, v8, 0x1

    .line 64
    new-instance v5, Lcom/google/android/exoplayer2/source/dash/b$a;

    new-array v6, v11, [I

    const/4 v7, 0x5

    const/4 v11, 0x2

    const/4 v12, -0x1

    const/4 v13, -0x1

    const/4 v14, -0x1

    move-object/from16 p1, v5

    move/from16 p2, v7

    move/from16 p3, v11

    move-object/from16 p4, v6

    move/from16 p5, v12

    move/from16 p6, v13

    move/from16 p7, v14

    move/from16 p8, v1

    invoke-direct/range {p1 .. p8}, Lcom/google/android/exoplayer2/source/dash/b$a;-><init>(II[IIIII)V

    .line 65
    aput-object v5, v0, v8

    add-int/lit8 v1, v1, 0x1

    move v8, v4

    goto :goto_1b

    .line 66
    :cond_23
    new-instance v1, Lz4/j0;

    invoke-direct {v1, v3}, Lz4/j0;-><init>([Lz4/i0;)V

    invoke-static {v1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    .line 67
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Lz4/j0;

    move-object/from16 v2, p0

    iput-object v1, v2, Lcom/google/android/exoplayer2/source/dash/b;->r:Lz4/j0;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, [Lcom/google/android/exoplayer2/source/dash/b$a;

    iput-object v0, v2, Lcom/google/android/exoplayer2/source/dash/b;->s:[Lcom/google/android/exoplayer2/source/dash/b$a;

    return-void
.end method


# virtual methods
.method public final a(Lz4/d0;)V
    .locals 0

    check-cast p1, Lb5/h;

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/dash/b;->z:Lz4/r$a;

    invoke-interface {p1, p0}, Lz4/d0$a;->a(Lz4/d0;)V

    return-void
.end method

.method public final c()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->C:Lb1/v;

    invoke-virtual {v0}, Lb1/v;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d(J)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->C:Lb1/v;

    invoke-virtual {v0, p1, p2}, Lb1/v;->d(J)Z

    move-result p1

    return p1
.end method

.method public final e(JLv3/n1;)J
    .locals 6

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->A:[Lb5/h;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget v4, v3, Lb5/h;->a:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_0

    iget-object v0, v3, Lb5/h;->e:Lb5/i;

    invoke-interface {v0, p1, p2, p3}, Lb5/i;->e(JLv3/n1;)J

    move-result-wide p1

    return-wide p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-wide p1
.end method

.method public final f([II)I
    .locals 4

    aget p2, p1, p2

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/b;->s:[Lcom/google/android/exoplayer2/source/dash/b$a;

    aget-object p2, v1, p2

    iget p2, p2, Lcom/google/android/exoplayer2/source/dash/b$a;->e:I

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_2

    aget v2, p1, v1

    if-ne v2, p2, :cond_1

    iget-object v3, p0, Lcom/google/android/exoplayer2/source/dash/b;->s:[Lcom/google/android/exoplayer2/source/dash/b$a;

    aget-object v2, v3, v2

    iget v2, v2, Lcom/google/android/exoplayer2/source/dash/b$a;->c:I

    if-nez v2, :cond_1

    return v1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public final g()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->C:Lb1/v;

    invoke-virtual {v0}, Lb1/v;->g()J

    move-result-wide v0

    return-wide v0
.end method

.method public final h(J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->C:Lb1/v;

    invoke-virtual {v0, p1, p2}, Lb1/v;->h(J)V

    return-void
.end method

.method public final i([Lr5/h;[Z[Lz4/c0;[ZJ)J
    .locals 38

    .line 1
    move-object/from16 v14, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-wide/from16 v12, p5

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    new-array v15, v1, [I

    .line 9
    .line 10
    const/16 v16, 0x0

    .line 11
    .line 12
    move/from16 v1, v16

    .line 13
    .line 14
    :goto_0
    array-length v2, v0

    .line 15
    const/4 v11, -0x1

    .line 16
    if-ge v1, v2, :cond_1

    .line 17
    .line 18
    aget-object v2, v0, v1

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    iget-object v3, v14, Lcom/google/android/exoplayer2/source/dash/b;->r:Lz4/j0;

    .line 23
    .line 24
    invoke-interface {v2}, Lr5/k;->a()Lz4/i0;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v3, v2}, Lz4/j0;->b(Lz4/i0;)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    aput v2, v15, v1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    aput v11, v15, v1

    .line 36
    .line 37
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move/from16 v1, v16

    .line 41
    .line 42
    :goto_2
    array-length v2, v0

    .line 43
    const/16 v17, 0x0

    .line 44
    .line 45
    if-ge v1, v2, :cond_6

    .line 46
    .line 47
    aget-object v2, v0, v1

    .line 48
    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    aget-boolean v2, p2, v1

    .line 52
    .line 53
    if-nez v2, :cond_5

    .line 54
    .line 55
    :cond_2
    aget-object v2, p3, v1

    .line 56
    .line 57
    instance-of v3, v2, Lb5/h;

    .line 58
    .line 59
    if-eqz v3, :cond_3

    .line 60
    .line 61
    check-cast v2, Lb5/h;

    .line 62
    .line 63
    invoke-virtual {v2, v14}, Lb5/h;->A(Lb5/h$b;)V

    .line 64
    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    instance-of v3, v2, Lb5/h$a;

    .line 68
    .line 69
    if-eqz v3, :cond_4

    .line 70
    .line 71
    check-cast v2, Lb5/h$a;

    .line 72
    .line 73
    iget-object v3, v2, Lb5/h$a;->e:Lb5/h;

    .line 74
    .line 75
    iget-object v3, v3, Lb5/h;->d:[Z

    .line 76
    .line 77
    iget v4, v2, Lb5/h$a;->c:I

    .line 78
    .line 79
    aget-boolean v3, v3, v4

    .line 80
    .line 81
    invoke-static {v3}, Lx6/b;->H(Z)V

    .line 82
    .line 83
    .line 84
    iget-object v3, v2, Lb5/h$a;->e:Lb5/h;

    .line 85
    .line 86
    iget-object v3, v3, Lb5/h;->d:[Z

    .line 87
    .line 88
    iget v2, v2, Lb5/h$a;->c:I

    .line 89
    .line 90
    aput-boolean v16, v3, v2

    .line 91
    .line 92
    :cond_4
    :goto_3
    aput-object v17, p3, v1

    .line 93
    .line 94
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_6
    move/from16 v1, v16

    .line 98
    .line 99
    :goto_4
    array-length v2, v0

    .line 100
    const/4 v10, 0x1

    .line 101
    if-ge v1, v2, :cond_c

    .line 102
    .line 103
    aget-object v2, p3, v1

    .line 104
    .line 105
    instance-of v3, v2, Lz4/k;

    .line 106
    .line 107
    if-nez v3, :cond_7

    .line 108
    .line 109
    instance-of v2, v2, Lb5/h$a;

    .line 110
    .line 111
    if-eqz v2, :cond_b

    .line 112
    .line 113
    :cond_7
    invoke-virtual {v14, v15, v1}, Lcom/google/android/exoplayer2/source/dash/b;->f([II)I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-ne v2, v11, :cond_8

    .line 118
    .line 119
    aget-object v2, p3, v1

    .line 120
    .line 121
    instance-of v10, v2, Lz4/k;

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_8
    aget-object v3, p3, v1

    .line 125
    .line 126
    instance-of v4, v3, Lb5/h$a;

    .line 127
    .line 128
    if-eqz v4, :cond_9

    .line 129
    .line 130
    check-cast v3, Lb5/h$a;

    .line 131
    .line 132
    iget-object v3, v3, Lb5/h$a;->a:Lb5/h;

    .line 133
    .line 134
    aget-object v2, p3, v2

    .line 135
    .line 136
    if-ne v3, v2, :cond_9

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_9
    move/from16 v10, v16

    .line 140
    .line 141
    :goto_5
    if-nez v10, :cond_b

    .line 142
    .line 143
    aget-object v2, p3, v1

    .line 144
    .line 145
    instance-of v3, v2, Lb5/h$a;

    .line 146
    .line 147
    if-eqz v3, :cond_a

    .line 148
    .line 149
    check-cast v2, Lb5/h$a;

    .line 150
    .line 151
    iget-object v3, v2, Lb5/h$a;->e:Lb5/h;

    .line 152
    .line 153
    iget-object v3, v3, Lb5/h;->d:[Z

    .line 154
    .line 155
    iget v4, v2, Lb5/h$a;->c:I

    .line 156
    .line 157
    aget-boolean v3, v3, v4

    .line 158
    .line 159
    invoke-static {v3}, Lx6/b;->H(Z)V

    .line 160
    .line 161
    .line 162
    iget-object v3, v2, Lb5/h$a;->e:Lb5/h;

    .line 163
    .line 164
    iget-object v3, v3, Lb5/h;->d:[Z

    .line 165
    .line 166
    iget v2, v2, Lb5/h$a;->c:I

    .line 167
    .line 168
    aput-boolean v16, v3, v2

    .line 169
    .line 170
    :cond_a
    aput-object v17, p3, v1

    .line 171
    .line 172
    :cond_b
    add-int/lit8 v1, v1, 0x1

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_c
    move-object/from16 v1, p3

    .line 176
    .line 177
    move/from16 v8, v16

    .line 178
    .line 179
    :goto_6
    array-length v2, v0

    .line 180
    if-ge v8, v2, :cond_18

    .line 181
    .line 182
    aget-object v2, v0, v8

    .line 183
    .line 184
    if-nez v2, :cond_d

    .line 185
    .line 186
    move/from16 v18, v8

    .line 187
    .line 188
    move-object/from16 v36, v15

    .line 189
    .line 190
    goto/16 :goto_e

    .line 191
    .line 192
    :cond_d
    aget-object v3, v1, v8

    .line 193
    .line 194
    if-nez v3, :cond_16

    .line 195
    .line 196
    aput-boolean v10, p4, v8

    .line 197
    .line 198
    aget v3, v15, v8

    .line 199
    .line 200
    iget-object v4, v14, Lcom/google/android/exoplayer2/source/dash/b;->s:[Lcom/google/android/exoplayer2/source/dash/b$a;

    .line 201
    .line 202
    aget-object v3, v4, v3

    .line 203
    .line 204
    iget v4, v3, Lcom/google/android/exoplayer2/source/dash/b$a;->c:I

    .line 205
    .line 206
    if-nez v4, :cond_15

    .line 207
    .line 208
    iget v1, v3, Lcom/google/android/exoplayer2/source/dash/b$a;->f:I

    .line 209
    .line 210
    if-eq v1, v11, :cond_e

    .line 211
    .line 212
    move/from16 v28, v10

    .line 213
    .line 214
    goto :goto_7

    .line 215
    :cond_e
    move/from16 v28, v16

    .line 216
    .line 217
    :goto_7
    if-eqz v28, :cond_f

    .line 218
    .line 219
    iget-object v4, v14, Lcom/google/android/exoplayer2/source/dash/b;->r:Lz4/j0;

    .line 220
    .line 221
    invoke-virtual {v4, v1}, Lz4/j0;->a(I)Lz4/i0;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    move v4, v10

    .line 226
    goto :goto_8

    .line 227
    :cond_f
    move/from16 v4, v16

    .line 228
    .line 229
    move-object/from16 v1, v17

    .line 230
    .line 231
    :goto_8
    iget v5, v3, Lcom/google/android/exoplayer2/source/dash/b$a;->g:I

    .line 232
    .line 233
    if-eq v5, v11, :cond_10

    .line 234
    .line 235
    move v6, v10

    .line 236
    goto :goto_9

    .line 237
    :cond_10
    move/from16 v6, v16

    .line 238
    .line 239
    :goto_9
    if-eqz v6, :cond_11

    .line 240
    .line 241
    iget-object v7, v14, Lcom/google/android/exoplayer2/source/dash/b;->r:Lz4/j0;

    .line 242
    .line 243
    invoke-virtual {v7, v5}, Lz4/j0;->a(I)Lz4/i0;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    iget v7, v5, Lz4/i0;->a:I

    .line 248
    .line 249
    add-int/2addr v4, v7

    .line 250
    goto :goto_a

    .line 251
    :cond_11
    move-object/from16 v5, v17

    .line 252
    .line 253
    :goto_a
    new-array v7, v4, [Lv3/i0;

    .line 254
    .line 255
    new-array v4, v4, [I

    .line 256
    .line 257
    if-eqz v28, :cond_12

    .line 258
    .line 259
    iget-object v1, v1, Lz4/i0;->d:[Lv3/i0;

    .line 260
    .line 261
    aget-object v1, v1, v16

    .line 262
    .line 263
    aput-object v1, v7, v16

    .line 264
    .line 265
    const/4 v1, 0x5

    .line 266
    aput v1, v4, v16

    .line 267
    .line 268
    move v1, v10

    .line 269
    goto :goto_b

    .line 270
    :cond_12
    move/from16 v1, v16

    .line 271
    .line 272
    :goto_b
    new-instance v9, Ljava/util/ArrayList;

    .line 273
    .line 274
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 275
    .line 276
    .line 277
    if-eqz v6, :cond_13

    .line 278
    .line 279
    move/from16 v6, v16

    .line 280
    .line 281
    :goto_c
    iget v11, v5, Lz4/i0;->a:I

    .line 282
    .line 283
    if-ge v6, v11, :cond_13

    .line 284
    .line 285
    iget-object v11, v5, Lz4/i0;->d:[Lv3/i0;

    .line 286
    .line 287
    aget-object v11, v11, v6

    .line 288
    .line 289
    aput-object v11, v7, v1

    .line 290
    .line 291
    const/16 v18, 0x3

    .line 292
    .line 293
    aput v18, v4, v1

    .line 294
    .line 295
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    add-int/2addr v1, v10

    .line 299
    add-int/lit8 v6, v6, 0x1

    .line 300
    .line 301
    goto :goto_c

    .line 302
    :cond_13
    iget-object v1, v14, Lcom/google/android/exoplayer2/source/dash/b;->D:Ld5/c;

    .line 303
    .line 304
    iget-boolean v1, v1, Ld5/c;->d:Z

    .line 305
    .line 306
    if-eqz v1, :cond_14

    .line 307
    .line 308
    if-eqz v28, :cond_14

    .line 309
    .line 310
    iget-object v1, v14, Lcom/google/android/exoplayer2/source/dash/b;->u:Lcom/google/android/exoplayer2/source/dash/d;

    .line 311
    .line 312
    new-instance v5, Lcom/google/android/exoplayer2/source/dash/d$c;

    .line 313
    .line 314
    iget-object v6, v1, Lcom/google/android/exoplayer2/source/dash/d;->a:Lt5/b;

    .line 315
    .line 316
    invoke-direct {v5, v1, v6}, Lcom/google/android/exoplayer2/source/dash/d$c;-><init>(Lcom/google/android/exoplayer2/source/dash/d;Lt5/b;)V

    .line 317
    .line 318
    .line 319
    move-object v11, v5

    .line 320
    goto :goto_d

    .line 321
    :cond_14
    move-object/from16 v11, v17

    .line 322
    .line 323
    :goto_d
    iget-object v1, v14, Lcom/google/android/exoplayer2/source/dash/b;->b:Lcom/google/android/exoplayer2/source/dash/a$a;

    .line 324
    .line 325
    iget-object v5, v14, Lcom/google/android/exoplayer2/source/dash/b;->p:Lt5/e0;

    .line 326
    .line 327
    iget-object v6, v14, Lcom/google/android/exoplayer2/source/dash/b;->D:Ld5/c;

    .line 328
    .line 329
    iget-object v10, v14, Lcom/google/android/exoplayer2/source/dash/b;->f:Lc5/a;

    .line 330
    .line 331
    move/from16 v33, v8

    .line 332
    .line 333
    iget v8, v14, Lcom/google/android/exoplayer2/source/dash/b;->E:I

    .line 334
    .line 335
    iget-object v12, v3, Lcom/google/android/exoplayer2/source/dash/b$a;->a:[I

    .line 336
    .line 337
    iget v13, v3, Lcom/google/android/exoplayer2/source/dash/b$a;->b:I

    .line 338
    .line 339
    move-object/from16 v34, v3

    .line 340
    .line 341
    move-object/from16 v35, v4

    .line 342
    .line 343
    iget-wide v3, v14, Lcom/google/android/exoplayer2/source/dash/b;->o:J

    .line 344
    .line 345
    move-object/from16 v36, v15

    .line 346
    .line 347
    iget-object v15, v14, Lcom/google/android/exoplayer2/source/dash/b;->c:Lt5/l0;

    .line 348
    .line 349
    iget-object v0, v14, Lcom/google/android/exoplayer2/source/dash/b;->y:Lw3/a0;

    .line 350
    .line 351
    move-object/from16 v18, v1

    .line 352
    .line 353
    move-object/from16 v19, v5

    .line 354
    .line 355
    move-object/from16 v20, v6

    .line 356
    .line 357
    move-object/from16 v21, v10

    .line 358
    .line 359
    move/from16 v22, v8

    .line 360
    .line 361
    move-object/from16 v23, v12

    .line 362
    .line 363
    move-object/from16 v24, v2

    .line 364
    .line 365
    move/from16 v25, v13

    .line 366
    .line 367
    move-wide/from16 v26, v3

    .line 368
    .line 369
    move-object/from16 v29, v9

    .line 370
    .line 371
    move-object/from16 v30, v11

    .line 372
    .line 373
    move-object/from16 v31, v15

    .line 374
    .line 375
    move-object/from16 v32, v0

    .line 376
    .line 377
    invoke-interface/range {v18 .. v32}, Lcom/google/android/exoplayer2/source/dash/a$a;->a(Lt5/e0;Ld5/c;Lc5/a;I[ILr5/h;IJZLjava/util/ArrayList;Lcom/google/android/exoplayer2/source/dash/d$c;Lt5/l0;Lw3/a0;)Lcom/google/android/exoplayer2/source/dash/c;

    .line 378
    .line 379
    .line 380
    move-result-object v5

    .line 381
    new-instance v0, Lb5/h;

    .line 382
    .line 383
    move-object/from16 v3, v34

    .line 384
    .line 385
    iget v2, v3, Lcom/google/android/exoplayer2/source/dash/b$a;->b:I

    .line 386
    .line 387
    iget-object v8, v14, Lcom/google/android/exoplayer2/source/dash/b;->q:Lt5/b;

    .line 388
    .line 389
    iget-object v10, v14, Lcom/google/android/exoplayer2/source/dash/b;->d:La4/h;

    .line 390
    .line 391
    iget-object v12, v14, Lcom/google/android/exoplayer2/source/dash/b;->x:La4/g$a;

    .line 392
    .line 393
    iget-object v13, v14, Lcom/google/android/exoplayer2/source/dash/b;->e:Lt5/c0;

    .line 394
    .line 395
    iget-object v15, v14, Lcom/google/android/exoplayer2/source/dash/b;->w:Lz4/w$a;

    .line 396
    .line 397
    move-object v1, v0

    .line 398
    move-object/from16 v3, v35

    .line 399
    .line 400
    move-object v4, v7

    .line 401
    move-object/from16 v6, p0

    .line 402
    .line 403
    move-object v7, v8

    .line 404
    move/from16 v18, v33

    .line 405
    .line 406
    move-wide/from16 v8, p5

    .line 407
    .line 408
    move-object/from16 v37, v11

    .line 409
    .line 410
    move-object v11, v12

    .line 411
    move-object v12, v13

    .line 412
    move-object v13, v15

    .line 413
    invoke-direct/range {v1 .. v13}, Lb5/h;-><init>(I[I[Lv3/i0;Lb5/i;Lz4/d0$a;Lt5/b;JLa4/h;La4/g$a;Lt5/c0;Lz4/w$a;)V

    .line 414
    .line 415
    .line 416
    monitor-enter p0

    .line 417
    :try_start_0
    iget-object v1, v14, Lcom/google/android/exoplayer2/source/dash/b;->v:Ljava/util/IdentityHashMap;

    .line 418
    .line 419
    move-object/from16 v5, v37

    .line 420
    .line 421
    invoke-virtual {v1, v0, v5}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 425
    aput-object v0, p3, v18

    .line 426
    .line 427
    move-object/from16 v1, p3

    .line 428
    .line 429
    goto :goto_e

    .line 430
    :catchall_0
    move-exception v0

    .line 431
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 432
    throw v0

    .line 433
    :cond_15
    move/from16 v18, v8

    .line 434
    .line 435
    move-object/from16 v36, v15

    .line 436
    .line 437
    const/4 v0, 0x2

    .line 438
    if-ne v4, v0, :cond_17

    .line 439
    .line 440
    iget-object v0, v14, Lcom/google/android/exoplayer2/source/dash/b;->F:Ljava/util/List;

    .line 441
    .line 442
    iget v3, v3, Lcom/google/android/exoplayer2/source/dash/b$a;->d:I

    .line 443
    .line 444
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    check-cast v0, Ld5/f;

    .line 449
    .line 450
    invoke-interface {v2}, Lr5/k;->a()Lz4/i0;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    iget-object v2, v2, Lz4/i0;->d:[Lv3/i0;

    .line 455
    .line 456
    aget-object v2, v2, v16

    .line 457
    .line 458
    new-instance v3, Lc5/f;

    .line 459
    .line 460
    iget-object v4, v14, Lcom/google/android/exoplayer2/source/dash/b;->D:Ld5/c;

    .line 461
    .line 462
    iget-boolean v4, v4, Ld5/c;->d:Z

    .line 463
    .line 464
    invoke-direct {v3, v0, v2, v4}, Lc5/f;-><init>(Ld5/f;Lv3/i0;Z)V

    .line 465
    .line 466
    .line 467
    aput-object v3, v1, v18

    .line 468
    .line 469
    goto :goto_e

    .line 470
    :cond_16
    move/from16 v18, v8

    .line 471
    .line 472
    move-object/from16 v36, v15

    .line 473
    .line 474
    instance-of v0, v3, Lb5/h;

    .line 475
    .line 476
    if-eqz v0, :cond_17

    .line 477
    .line 478
    check-cast v3, Lb5/h;

    .line 479
    .line 480
    iget-object v0, v3, Lb5/h;->e:Lb5/i;

    .line 481
    .line 482
    check-cast v0, Lcom/google/android/exoplayer2/source/dash/a;

    .line 483
    .line 484
    invoke-interface {v0, v2}, Lcom/google/android/exoplayer2/source/dash/a;->b(Lr5/h;)V

    .line 485
    .line 486
    .line 487
    :cond_17
    :goto_e
    add-int/lit8 v8, v18, 0x1

    .line 488
    .line 489
    move-object/from16 v0, p1

    .line 490
    .line 491
    move-wide/from16 v12, p5

    .line 492
    .line 493
    move-object/from16 v15, v36

    .line 494
    .line 495
    const/4 v10, 0x1

    .line 496
    const/4 v11, -0x1

    .line 497
    goto/16 :goto_6

    .line 498
    .line 499
    :cond_18
    move-object/from16 v36, v15

    .line 500
    .line 501
    move-object/from16 v0, p1

    .line 502
    .line 503
    move/from16 v2, v16

    .line 504
    .line 505
    :goto_f
    array-length v3, v0

    .line 506
    if-ge v2, v3, :cond_1e

    .line 507
    .line 508
    aget-object v3, v1, v2

    .line 509
    .line 510
    if-nez v3, :cond_1d

    .line 511
    .line 512
    aget-object v3, v0, v2

    .line 513
    .line 514
    if-eqz v3, :cond_1d

    .line 515
    .line 516
    aget v3, v36, v2

    .line 517
    .line 518
    iget-object v4, v14, Lcom/google/android/exoplayer2/source/dash/b;->s:[Lcom/google/android/exoplayer2/source/dash/b$a;

    .line 519
    .line 520
    aget-object v3, v4, v3

    .line 521
    .line 522
    iget v4, v3, Lcom/google/android/exoplayer2/source/dash/b$a;->c:I

    .line 523
    .line 524
    const/4 v5, 0x1

    .line 525
    if-ne v4, v5, :cond_1c

    .line 526
    .line 527
    move-object/from16 v4, v36

    .line 528
    .line 529
    invoke-virtual {v14, v4, v2}, Lcom/google/android/exoplayer2/source/dash/b;->f([II)I

    .line 530
    .line 531
    .line 532
    move-result v6

    .line 533
    const/4 v7, -0x1

    .line 534
    if-ne v6, v7, :cond_19

    .line 535
    .line 536
    new-instance v3, Lz4/k;

    .line 537
    .line 538
    invoke-direct {v3}, Lz4/k;-><init>()V

    .line 539
    .line 540
    .line 541
    aput-object v3, v1, v2

    .line 542
    .line 543
    move-wide/from16 v9, p5

    .line 544
    .line 545
    goto :goto_12

    .line 546
    :cond_19
    aget-object v6, v1, v6

    .line 547
    .line 548
    check-cast v6, Lb5/h;

    .line 549
    .line 550
    iget v3, v3, Lcom/google/android/exoplayer2/source/dash/b$a;->b:I

    .line 551
    .line 552
    move/from16 v8, v16

    .line 553
    .line 554
    :goto_10
    iget-object v9, v6, Lb5/h;->v:[Lz4/b0;

    .line 555
    .line 556
    array-length v9, v9

    .line 557
    if-ge v8, v9, :cond_1b

    .line 558
    .line 559
    iget-object v9, v6, Lb5/h;->b:[I

    .line 560
    .line 561
    aget v9, v9, v8

    .line 562
    .line 563
    if-ne v9, v3, :cond_1a

    .line 564
    .line 565
    iget-object v3, v6, Lb5/h;->d:[Z

    .line 566
    .line 567
    aget-boolean v3, v3, v8

    .line 568
    .line 569
    xor-int/2addr v3, v5

    .line 570
    invoke-static {v3}, Lx6/b;->H(Z)V

    .line 571
    .line 572
    .line 573
    iget-object v3, v6, Lb5/h;->d:[Z

    .line 574
    .line 575
    aput-boolean v5, v3, v8

    .line 576
    .line 577
    iget-object v3, v6, Lb5/h;->v:[Lz4/b0;

    .line 578
    .line 579
    aget-object v3, v3, v8

    .line 580
    .line 581
    move-wide/from16 v9, p5

    .line 582
    .line 583
    invoke-virtual {v3, v9, v10, v5}, Lz4/b0;->x(JZ)Z

    .line 584
    .line 585
    .line 586
    new-instance v3, Lb5/h$a;

    .line 587
    .line 588
    iget-object v11, v6, Lb5/h;->v:[Lz4/b0;

    .line 589
    .line 590
    aget-object v11, v11, v8

    .line 591
    .line 592
    invoke-direct {v3, v6, v6, v11, v8}, Lb5/h$a;-><init>(Lb5/h;Lb5/h;Lz4/b0;I)V

    .line 593
    .line 594
    .line 595
    aput-object v3, v1, v2

    .line 596
    .line 597
    goto :goto_12

    .line 598
    :cond_1a
    move-wide/from16 v9, p5

    .line 599
    .line 600
    add-int/lit8 v8, v8, 0x1

    .line 601
    .line 602
    goto :goto_10

    .line 603
    :cond_1b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 604
    .line 605
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 606
    .line 607
    .line 608
    throw v0

    .line 609
    :cond_1c
    move-wide/from16 v9, p5

    .line 610
    .line 611
    move-object/from16 v4, v36

    .line 612
    .line 613
    goto :goto_11

    .line 614
    :cond_1d
    move-wide/from16 v9, p5

    .line 615
    .line 616
    move-object/from16 v4, v36

    .line 617
    .line 618
    const/4 v5, 0x1

    .line 619
    :goto_11
    const/4 v7, -0x1

    .line 620
    :goto_12
    add-int/lit8 v2, v2, 0x1

    .line 621
    .line 622
    move-object/from16 v36, v4

    .line 623
    .line 624
    goto :goto_f

    .line 625
    :cond_1e
    move-wide/from16 v9, p5

    .line 626
    .line 627
    new-instance v0, Ljava/util/ArrayList;

    .line 628
    .line 629
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 630
    .line 631
    .line 632
    new-instance v2, Ljava/util/ArrayList;

    .line 633
    .line 634
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 635
    .line 636
    .line 637
    array-length v3, v1

    .line 638
    move/from16 v4, v16

    .line 639
    .line 640
    :goto_13
    if-ge v4, v3, :cond_21

    .line 641
    .line 642
    aget-object v5, v1, v4

    .line 643
    .line 644
    instance-of v6, v5, Lb5/h;

    .line 645
    .line 646
    if-eqz v6, :cond_1f

    .line 647
    .line 648
    check-cast v5, Lb5/h;

    .line 649
    .line 650
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    goto :goto_14

    .line 654
    :cond_1f
    instance-of v6, v5, Lc5/f;

    .line 655
    .line 656
    if-eqz v6, :cond_20

    .line 657
    .line 658
    check-cast v5, Lc5/f;

    .line 659
    .line 660
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    :cond_20
    :goto_14
    add-int/lit8 v4, v4, 0x1

    .line 664
    .line 665
    goto :goto_13

    .line 666
    :cond_21
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 667
    .line 668
    .line 669
    move-result v1

    .line 670
    new-array v1, v1, [Lb5/h;

    .line 671
    .line 672
    iput-object v1, v14, Lcom/google/android/exoplayer2/source/dash/b;->A:[Lb5/h;

    .line 673
    .line 674
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 678
    .line 679
    .line 680
    move-result v0

    .line 681
    new-array v0, v0, [Lc5/f;

    .line 682
    .line 683
    iput-object v0, v14, Lcom/google/android/exoplayer2/source/dash/b;->B:[Lc5/f;

    .line 684
    .line 685
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    iget-object v0, v14, Lcom/google/android/exoplayer2/source/dash/b;->t:Lz4/i;

    .line 689
    .line 690
    iget-object v1, v14, Lcom/google/android/exoplayer2/source/dash/b;->A:[Lb5/h;

    .line 691
    .line 692
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 693
    .line 694
    .line 695
    new-instance v0, Lb1/v;

    .line 696
    .line 697
    invoke-direct {v0, v1}, Lb1/v;-><init>(Ljava/lang/Object;)V

    .line 698
    .line 699
    .line 700
    iput-object v0, v14, Lcom/google/android/exoplayer2/source/dash/b;->C:Lb1/v;

    .line 701
    .line 702
    return-wide v9
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
.end method

.method public final isLoading()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->C:Lb1/v;

    invoke-virtual {v0}, Lb1/v;->isLoading()Z

    move-result v0

    return v0
.end method

.method public final j()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->p:Lt5/e0;

    invoke-interface {v0}, Lt5/e0;->a()V

    return-void
.end method

.method public final l(J)J
    .locals 5

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->A:[Lb5/h;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    invoke-virtual {v4, p1, p2}, Lb5/h;->B(J)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->B:[Lc5/f;

    array-length v1, v0

    :goto_1
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2}, Lc5/f;->c(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-wide p1
.end method

.method public final n(Lz4/r$a;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/b;->z:Lz4/r$a;

    invoke-interface {p1, p0}, Lz4/r$a;->b(Lz4/r;)V

    return-void
.end method

.method public final o()J
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public final q()Lz4/j0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->r:Lz4/j0;

    return-object v0
.end method

.method public final s(JZ)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->A:[Lb5/h;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2, p3}, Lb5/h;->s(JZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
