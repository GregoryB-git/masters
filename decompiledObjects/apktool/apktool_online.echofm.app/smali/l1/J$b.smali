.class public Ll1/J$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll1/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll1/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final a:Lg0/y;

.field public final b:Landroid/util/SparseArray;

.field public final c:Landroid/util/SparseIntArray;

.field public final d:I

.field public final synthetic e:Ll1/J;


# direct methods
.method public constructor <init>(Ll1/J;I)V
    .locals 1

    .line 1
    iput-object p1, p0, Ll1/J$b;->e:Ll1/J;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lg0/y;

    .line 7
    .line 8
    const/4 v0, 0x5

    .line 9
    new-array v0, v0, [B

    .line 10
    .line 11
    invoke-direct {p1, v0}, Lg0/y;-><init>([B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ll1/J$b;->a:Lg0/y;

    .line 15
    .line 16
    new-instance p1, Landroid/util/SparseArray;

    .line 17
    .line 18
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Ll1/J$b;->b:Landroid/util/SparseArray;

    .line 22
    .line 23
    new-instance p1, Landroid/util/SparseIntArray;

    .line 24
    .line 25
    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Ll1/J$b;->c:Landroid/util/SparseIntArray;

    .line 29
    .line 30
    iput p2, p0, Ll1/J$b;->d:I

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public a(Lg0/z;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Lg0/z;->G()I

    move-result v2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    return-void

    :cond_0
    iget-object v2, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v2}, Ll1/J;->n(Ll1/J;)I

    move-result v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v2, v5, :cond_2

    iget-object v2, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v2}, Ll1/J;->n(Ll1/J;)I

    move-result v2

    if-eq v2, v3, :cond_2

    iget-object v2, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v2}, Ll1/J;->h(Ll1/J;)I

    move-result v2

    if-ne v2, v5, :cond_1

    goto :goto_0

    :cond_1
    new-instance v2, Lg0/E;

    iget-object v6, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v6}, Ll1/J;->o(Ll1/J;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg0/E;

    invoke-virtual {v6}, Lg0/E;->d()J

    move-result-wide v6

    invoke-direct {v2, v6, v7}, Lg0/E;-><init>(J)V

    iget-object v6, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v6}, Ll1/J;->o(Ll1/J;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    :goto_0
    iget-object v2, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v2}, Ll1/J;->o(Ll1/J;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg0/E;

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lg0/z;->G()I

    move-result v6

    and-int/lit16 v6, v6, 0x80

    if-nez v6, :cond_3

    return-void

    :cond_3
    invoke-virtual {v1, v5}, Lg0/z;->U(I)V

    invoke-virtual/range {p1 .. p1}, Lg0/z;->M()I

    move-result v6

    const/4 v7, 0x3

    invoke-virtual {v1, v7}, Lg0/z;->U(I)V

    iget-object v8, v0, Ll1/J$b;->a:Lg0/y;

    invoke-virtual {v1, v8, v3}, Lg0/z;->k(Lg0/y;I)V

    iget-object v8, v0, Ll1/J$b;->a:Lg0/y;

    invoke-virtual {v8, v7}, Lg0/y;->r(I)V

    iget-object v8, v0, Ll1/J$b;->e:Ll1/J;

    iget-object v9, v0, Ll1/J$b;->a:Lg0/y;

    const/16 v10, 0xd

    invoke-virtual {v9, v10}, Lg0/y;->h(I)I

    move-result v9

    invoke-static {v8, v9}, Ll1/J;->p(Ll1/J;I)I

    iget-object v8, v0, Ll1/J$b;->a:Lg0/y;

    invoke-virtual {v1, v8, v3}, Lg0/z;->k(Lg0/y;I)V

    iget-object v8, v0, Ll1/J$b;->a:Lg0/y;

    const/4 v9, 0x4

    invoke-virtual {v8, v9}, Lg0/y;->r(I)V

    iget-object v8, v0, Ll1/J$b;->a:Lg0/y;

    const/16 v11, 0xc

    invoke-virtual {v8, v11}, Lg0/y;->h(I)I

    move-result v8

    invoke-virtual {v1, v8}, Lg0/z;->U(I)V

    iget-object v8, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v8}, Ll1/J;->n(Ll1/J;)I

    move-result v8

    const/16 v12, 0x2000

    const/16 v13, 0x15

    if-ne v8, v3, :cond_4

    iget-object v8, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v8}, Ll1/J;->q(Ll1/J;)Ll1/K;

    move-result-object v8

    if-nez v8, :cond_4

    new-instance v8, Ll1/K$b;

    const/16 v18, 0x0

    sget-object v19, Lg0/M;->f:[B

    const/16 v15, 0x15

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v14, v8

    invoke-direct/range {v14 .. v19}, Ll1/K$b;-><init>(ILjava/lang/String;ILjava/util/List;[B)V

    iget-object v14, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v14}, Ll1/J;->s(Ll1/J;)Ll1/K$c;

    move-result-object v15

    invoke-interface {v15, v13, v8}, Ll1/K$c;->b(ILl1/K$b;)Ll1/K;

    move-result-object v8

    invoke-static {v14, v8}, Ll1/J;->r(Ll1/J;Ll1/K;)Ll1/K;

    iget-object v8, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v8}, Ll1/J;->q(Ll1/J;)Ll1/K;

    move-result-object v8

    if-eqz v8, :cond_4

    iget-object v8, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v8}, Ll1/J;->q(Ll1/J;)Ll1/K;

    move-result-object v8

    iget-object v14, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v14}, Ll1/J;->t(Ll1/J;)LF0/t;

    move-result-object v14

    new-instance v15, Ll1/K$d;

    invoke-direct {v15, v6, v13, v12}, Ll1/K$d;-><init>(III)V

    invoke-interface {v8, v2, v14, v15}, Ll1/K;->c(Lg0/E;LF0/t;Ll1/K$d;)V

    :cond_4
    iget-object v8, v0, Ll1/J$b;->b:Landroid/util/SparseArray;

    invoke-virtual {v8}, Landroid/util/SparseArray;->clear()V

    iget-object v8, v0, Ll1/J$b;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v8}, Landroid/util/SparseIntArray;->clear()V

    invoke-virtual/range {p1 .. p1}, Lg0/z;->a()I

    move-result v8

    :goto_2
    if-lez v8, :cond_c

    iget-object v14, v0, Ll1/J$b;->a:Lg0/y;

    const/4 v15, 0x5

    invoke-virtual {v1, v14, v15}, Lg0/z;->k(Lg0/y;I)V

    iget-object v14, v0, Ll1/J$b;->a:Lg0/y;

    const/16 v4, 0x8

    invoke-virtual {v14, v4}, Lg0/y;->h(I)I

    move-result v4

    iget-object v14, v0, Ll1/J$b;->a:Lg0/y;

    invoke-virtual {v14, v7}, Lg0/y;->r(I)V

    iget-object v14, v0, Ll1/J$b;->a:Lg0/y;

    invoke-virtual {v14, v10}, Lg0/y;->h(I)I

    move-result v14

    iget-object v7, v0, Ll1/J$b;->a:Lg0/y;

    invoke-virtual {v7, v9}, Lg0/y;->r(I)V

    iget-object v7, v0, Ll1/J$b;->a:Lg0/y;

    invoke-virtual {v7, v11}, Lg0/y;->h(I)I

    move-result v7

    invoke-virtual {v0, v1, v7}, Ll1/J$b;->b(Lg0/z;I)Ll1/K$b;

    move-result-object v9

    const/4 v10, 0x6

    if-eq v4, v10, :cond_5

    if-ne v4, v15, :cond_6

    :cond_5
    iget v4, v9, Ll1/K$b;->a:I

    :cond_6
    add-int/lit8 v7, v7, 0x5

    sub-int/2addr v8, v7

    iget-object v7, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v7}, Ll1/J;->n(Ll1/J;)I

    move-result v7

    if-ne v7, v3, :cond_7

    move v7, v4

    goto :goto_3

    :cond_7
    move v7, v14

    :goto_3
    iget-object v10, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v10}, Ll1/J;->u(Ll1/J;)Landroid/util/SparseBooleanArray;

    move-result-object v10

    invoke-virtual {v10, v7}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v10

    if-eqz v10, :cond_8

    goto :goto_5

    :cond_8
    iget-object v10, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v10}, Ll1/J;->n(Ll1/J;)I

    move-result v10

    if-ne v10, v3, :cond_9

    if-ne v4, v13, :cond_9

    iget-object v4, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v4}, Ll1/J;->q(Ll1/J;)Ll1/K;

    move-result-object v4

    goto :goto_4

    :cond_9
    iget-object v10, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v10}, Ll1/J;->s(Ll1/J;)Ll1/K$c;

    move-result-object v10

    invoke-interface {v10, v4, v9}, Ll1/K$c;->b(ILl1/K$b;)Ll1/K;

    move-result-object v4

    :goto_4
    iget-object v9, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v9}, Ll1/J;->n(Ll1/J;)I

    move-result v9

    if-ne v9, v3, :cond_a

    iget-object v9, v0, Ll1/J$b;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v9, v7, v12}, Landroid/util/SparseIntArray;->get(II)I

    move-result v9

    if-ge v14, v9, :cond_b

    :cond_a
    iget-object v9, v0, Ll1/J$b;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v9, v7, v14}, Landroid/util/SparseIntArray;->put(II)V

    iget-object v9, v0, Ll1/J$b;->b:Landroid/util/SparseArray;

    invoke-virtual {v9, v7, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_b
    :goto_5
    const/4 v4, 0x0

    const/4 v7, 0x3

    const/4 v9, 0x4

    const/16 v10, 0xd

    goto/16 :goto_2

    :cond_c
    iget-object v1, v0, Ll1/J$b;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v1}, Landroid/util/SparseIntArray;->size()I

    move-result v1

    const/4 v4, 0x0

    :goto_6
    if-ge v4, v1, :cond_f

    iget-object v7, v0, Ll1/J$b;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v7, v4}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v7

    iget-object v8, v0, Ll1/J$b;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v8, v4}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result v8

    iget-object v9, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v9}, Ll1/J;->u(Ll1/J;)Landroid/util/SparseBooleanArray;

    move-result-object v9

    invoke-virtual {v9, v7, v5}, Landroid/util/SparseBooleanArray;->put(IZ)V

    iget-object v9, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v9}, Ll1/J;->v(Ll1/J;)Landroid/util/SparseBooleanArray;

    move-result-object v9

    invoke-virtual {v9, v8, v5}, Landroid/util/SparseBooleanArray;->put(IZ)V

    iget-object v9, v0, Ll1/J$b;->b:Landroid/util/SparseArray;

    invoke-virtual {v9, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll1/K;

    if-eqz v9, :cond_e

    iget-object v10, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v10}, Ll1/J;->q(Ll1/J;)Ll1/K;

    move-result-object v10

    if-eq v9, v10, :cond_d

    iget-object v10, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v10}, Ll1/J;->t(Ll1/J;)LF0/t;

    move-result-object v10

    new-instance v11, Ll1/K$d;

    invoke-direct {v11, v6, v7, v12}, Ll1/K$d;-><init>(III)V

    invoke-interface {v9, v2, v10, v11}, Ll1/K;->c(Lg0/E;LF0/t;Ll1/K$d;)V

    :cond_d
    iget-object v7, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v7}, Ll1/J;->f(Ll1/J;)Landroid/util/SparseArray;

    move-result-object v7

    invoke-virtual {v7, v8, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_e
    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_f
    iget-object v1, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v1}, Ll1/J;->n(Ll1/J;)I

    move-result v1

    if-ne v1, v3, :cond_10

    iget-object v1, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v1}, Ll1/J;->j(Ll1/J;)Z

    move-result v1

    if-nez v1, :cond_12

    iget-object v1, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v1}, Ll1/J;->t(Ll1/J;)LF0/t;

    move-result-object v1

    invoke-interface {v1}, LF0/t;->j()V

    iget-object v1, v0, Ll1/J$b;->e:Ll1/J;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ll1/J;->l(Ll1/J;I)I

    :goto_7
    iget-object v1, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v1, v5}, Ll1/J;->k(Ll1/J;Z)Z

    goto :goto_9

    :cond_10
    const/4 v2, 0x0

    iget-object v1, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v1}, Ll1/J;->f(Ll1/J;)Landroid/util/SparseArray;

    move-result-object v1

    iget v3, v0, Ll1/J$b;->d:I

    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->remove(I)V

    iget-object v1, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v1}, Ll1/J;->n(Ll1/J;)I

    move-result v3

    if-ne v3, v5, :cond_11

    move v4, v2

    goto :goto_8

    :cond_11
    iget-object v2, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v2}, Ll1/J;->h(Ll1/J;)I

    move-result v2

    add-int/lit8 v4, v2, -0x1

    :goto_8
    invoke-static {v1, v4}, Ll1/J;->l(Ll1/J;I)I

    iget-object v1, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v1}, Ll1/J;->h(Ll1/J;)I

    move-result v1

    if-nez v1, :cond_12

    iget-object v1, v0, Ll1/J$b;->e:Ll1/J;

    invoke-static {v1}, Ll1/J;->t(Ll1/J;)LF0/t;

    move-result-object v1

    invoke-interface {v1}, LF0/t;->j()V

    goto :goto_7

    :cond_12
    :goto_9
    return-void
.end method

.method public final b(Lg0/z;I)Ll1/K$b;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lg0/z;->f()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int v2, v1, p2

    .line 8
    .line 9
    const/4 v3, -0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    move v7, v3

    .line 13
    move-object v8, v4

    .line 14
    move-object v10, v8

    .line 15
    move v9, v5

    .line 16
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lg0/z;->f()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-ge v3, v2, :cond_f

    .line 21
    .line 22
    invoke-virtual/range {p1 .. p1}, Lg0/z;->G()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-virtual/range {p1 .. p1}, Lg0/z;->G()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-virtual/range {p1 .. p1}, Lg0/z;->f()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    add-int/2addr v6, v4

    .line 35
    if-le v6, v2, :cond_0

    .line 36
    .line 37
    goto/16 :goto_7

    .line 38
    .line 39
    :cond_0
    const/4 v4, 0x5

    .line 40
    const/16 v11, 0xac

    .line 41
    .line 42
    const/16 v12, 0x87

    .line 43
    .line 44
    const/16 v13, 0x81

    .line 45
    .line 46
    if-ne v3, v4, :cond_4

    .line 47
    .line 48
    invoke-virtual/range {p1 .. p1}, Lg0/z;->I()J

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    const-wide/32 v14, 0x41432d33

    .line 53
    .line 54
    .line 55
    cmp-long v14, v3, v14

    .line 56
    .line 57
    if-nez v14, :cond_1

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_1
    const-wide/32 v13, 0x45414333

    .line 61
    .line 62
    .line 63
    cmp-long v13, v3, v13

    .line 64
    .line 65
    if-nez v13, :cond_2

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_2
    const-wide/32 v12, 0x41432d34

    .line 69
    .line 70
    .line 71
    cmp-long v12, v3, v12

    .line 72
    .line 73
    if-nez v12, :cond_3

    .line 74
    .line 75
    :goto_1
    move v7, v11

    .line 76
    goto/16 :goto_6

    .line 77
    .line 78
    :cond_3
    const-wide/32 v11, 0x48455643

    .line 79
    .line 80
    .line 81
    cmp-long v3, v3, v11

    .line 82
    .line 83
    if-nez v3, :cond_e

    .line 84
    .line 85
    const/16 v7, 0x24

    .line 86
    .line 87
    goto/16 :goto_6

    .line 88
    .line 89
    :cond_4
    const/16 v4, 0x6a

    .line 90
    .line 91
    if-ne v3, v4, :cond_5

    .line 92
    .line 93
    :goto_2
    move v7, v13

    .line 94
    goto/16 :goto_6

    .line 95
    .line 96
    :cond_5
    const/16 v4, 0x7a

    .line 97
    .line 98
    if-ne v3, v4, :cond_6

    .line 99
    .line 100
    :goto_3
    move v7, v12

    .line 101
    goto/16 :goto_6

    .line 102
    .line 103
    :cond_6
    const/16 v4, 0x7f

    .line 104
    .line 105
    if-ne v3, v4, :cond_9

    .line 106
    .line 107
    invoke-virtual/range {p1 .. p1}, Lg0/z;->G()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    const/16 v4, 0x15

    .line 112
    .line 113
    if-ne v3, v4, :cond_7

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_7
    const/16 v4, 0xe

    .line 117
    .line 118
    if-ne v3, v4, :cond_8

    .line 119
    .line 120
    const/16 v7, 0x88

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_8
    const/16 v4, 0x21

    .line 124
    .line 125
    if-ne v3, v4, :cond_e

    .line 126
    .line 127
    const/16 v7, 0x8b

    .line 128
    .line 129
    goto :goto_6

    .line 130
    :cond_9
    const/16 v4, 0x7b

    .line 131
    .line 132
    if-ne v3, v4, :cond_a

    .line 133
    .line 134
    const/16 v3, 0x8a

    .line 135
    .line 136
    :goto_4
    move v7, v3

    .line 137
    goto :goto_6

    .line 138
    :cond_a
    const/16 v4, 0xa

    .line 139
    .line 140
    const/4 v11, 0x3

    .line 141
    if-ne v3, v4, :cond_b

    .line 142
    .line 143
    invoke-virtual {v0, v11}, Lg0/z;->D(I)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-virtual/range {p1 .. p1}, Lg0/z;->G()I

    .line 152
    .line 153
    .line 154
    move-result v9

    .line 155
    move-object v8, v3

    .line 156
    goto :goto_6

    .line 157
    :cond_b
    const/16 v4, 0x59

    .line 158
    .line 159
    if-ne v3, v4, :cond_d

    .line 160
    .line 161
    new-instance v3, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 164
    .line 165
    .line 166
    :goto_5
    invoke-virtual/range {p1 .. p1}, Lg0/z;->f()I

    .line 167
    .line 168
    .line 169
    move-result v7

    .line 170
    if-ge v7, v6, :cond_c

    .line 171
    .line 172
    invoke-virtual {v0, v11}, Lg0/z;->D(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    invoke-virtual/range {p1 .. p1}, Lg0/z;->G()I

    .line 181
    .line 182
    .line 183
    move-result v10

    .line 184
    const/4 v12, 0x4

    .line 185
    new-array v13, v12, [B

    .line 186
    .line 187
    invoke-virtual {v0, v13, v5, v12}, Lg0/z;->l([BII)V

    .line 188
    .line 189
    .line 190
    new-instance v12, Ll1/K$a;

    .line 191
    .line 192
    invoke-direct {v12, v7, v10, v13}, Ll1/K$a;-><init>(Ljava/lang/String;I[B)V

    .line 193
    .line 194
    .line 195
    invoke-interface {v3, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_c
    move-object v10, v3

    .line 200
    move v7, v4

    .line 201
    goto :goto_6

    .line 202
    :cond_d
    const/16 v4, 0x6f

    .line 203
    .line 204
    if-ne v3, v4, :cond_e

    .line 205
    .line 206
    const/16 v3, 0x101

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_e
    :goto_6
    invoke-virtual/range {p1 .. p1}, Lg0/z;->f()I

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    sub-int/2addr v6, v3

    .line 214
    invoke-virtual {v0, v6}, Lg0/z;->U(I)V

    .line 215
    .line 216
    .line 217
    goto/16 :goto_0

    .line 218
    .line 219
    :cond_f
    :goto_7
    invoke-virtual {v0, v2}, Lg0/z;->T(I)V

    .line 220
    .line 221
    .line 222
    new-instance v3, Ll1/K$b;

    .line 223
    .line 224
    invoke-virtual/range {p1 .. p1}, Lg0/z;->e()[B

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 229
    .line 230
    .line 231
    move-result-object v11

    .line 232
    move-object v6, v3

    .line 233
    invoke-direct/range {v6 .. v11}, Ll1/K$b;-><init>(ILjava/lang/String;ILjava/util/List;[B)V

    .line 234
    .line 235
    .line 236
    return-object v3
.end method

.method public c(Lg0/E;LF0/t;Ll1/K$d;)V
    .locals 0

    .line 1
    return-void
.end method
