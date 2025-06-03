.class public final Ll1/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll1/J$a;,
        Ll1/J$b;
    }
.end annotation


# static fields
.field public static final v:LF0/x;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:Ljava/util/List;

.field public final e:Lg0/z;

.field public final f:Landroid/util/SparseIntArray;

.field public final g:Ll1/K$c;

.field public final h:Lc1/t$a;

.field public final i:Landroid/util/SparseArray;

.field public final j:Landroid/util/SparseBooleanArray;

.field public final k:Landroid/util/SparseBooleanArray;

.field public final l:Ll1/H;

.field public m:Ll1/G;

.field public n:LF0/t;

.field public o:I

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Ll1/K;

.field public t:I

.field public u:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ll1/I;

    .line 2
    .line 3
    invoke-direct {v0}, Ll1/I;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ll1/J;->v:LF0/x;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(IILc1/t$a;Lg0/E;Ll1/K$c;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p5}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ll1/K$c;

    iput-object p5, p0, Ll1/J;->g:Ll1/K$c;

    iput p6, p0, Ll1/J;->c:I

    iput p1, p0, Ll1/J;->a:I

    iput p2, p0, Ll1/J;->b:I

    iput-object p3, p0, Ll1/J;->h:Lc1/t$a;

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll1/J;->d:Ljava/util/List;

    invoke-interface {p1, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {p4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll1/J;->d:Ljava/util/List;

    :goto_1
    new-instance p1, Lg0/z;

    const/16 p2, 0x24b8

    new-array p2, p2, [B

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, Lg0/z;-><init>([BI)V

    iput-object p1, p0, Ll1/J;->e:Lg0/z;

    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Ll1/J;->j:Landroid/util/SparseBooleanArray;

    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Ll1/J;->k:Landroid/util/SparseBooleanArray;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Ll1/J;->i:Landroid/util/SparseArray;

    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Ll1/J;->f:Landroid/util/SparseIntArray;

    new-instance p1, Ll1/H;

    invoke-direct {p1, p6}, Ll1/H;-><init>(I)V

    iput-object p1, p0, Ll1/J;->l:Ll1/H;

    sget-object p1, LF0/t;->a:LF0/t;

    iput-object p1, p0, Ll1/J;->n:LF0/t;

    const/4 p1, -0x1

    iput p1, p0, Ll1/J;->u:I

    invoke-virtual {p0}, Ll1/J;->A()V

    return-void
.end method

.method public constructor <init>(ILc1/t$a;)V
    .locals 7

    .line 2
    new-instance v4, Lg0/E;

    const-wide/16 v0, 0x0

    invoke-direct {v4, v0, v1}, Lg0/E;-><init>(J)V

    new-instance v5, Ll1/j;

    const/4 v0, 0x0

    invoke-direct {v5, v0}, Ll1/j;-><init>(I)V

    const v6, 0x1b8a0

    const/4 v1, 0x1

    move-object v0, p0

    move v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v6}, Ll1/J;-><init>(IILc1/t$a;Lg0/E;Ll1/K$c;I)V

    return-void
.end method

.method public static synthetic c()[LF0/r;
    .locals 1

    .line 1
    invoke-static {}, Ll1/J;->y()[LF0/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic f(Ll1/J;)Landroid/util/SparseArray;
    .locals 0

    .line 1
    iget-object p0, p0, Ll1/J;->i:Landroid/util/SparseArray;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic h(Ll1/J;)I
    .locals 0

    .line 1
    iget p0, p0, Ll1/J;->o:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic j(Ll1/J;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ll1/J;->p:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic k(Ll1/J;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Ll1/J;->p:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic l(Ll1/J;I)I
    .locals 0

    .line 1
    iput p1, p0, Ll1/J;->o:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic m(Ll1/J;)I
    .locals 2

    .line 1
    iget v0, p0, Ll1/J;->o:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Ll1/J;->o:I

    .line 6
    .line 7
    return v0
.end method

.method public static synthetic n(Ll1/J;)I
    .locals 0

    .line 1
    iget p0, p0, Ll1/J;->a:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic o(Ll1/J;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Ll1/J;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic p(Ll1/J;I)I
    .locals 0

    .line 1
    iput p1, p0, Ll1/J;->u:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic q(Ll1/J;)Ll1/K;
    .locals 0

    .line 1
    iget-object p0, p0, Ll1/J;->s:Ll1/K;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic r(Ll1/J;Ll1/K;)Ll1/K;
    .locals 0

    .line 1
    iput-object p1, p0, Ll1/J;->s:Ll1/K;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic s(Ll1/J;)Ll1/K$c;
    .locals 0

    .line 1
    iget-object p0, p0, Ll1/J;->g:Ll1/K$c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic t(Ll1/J;)LF0/t;
    .locals 0

    .line 1
    iget-object p0, p0, Ll1/J;->n:LF0/t;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic u(Ll1/J;)Landroid/util/SparseBooleanArray;
    .locals 0

    .line 1
    iget-object p0, p0, Ll1/J;->j:Landroid/util/SparseBooleanArray;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic v(Ll1/J;)Landroid/util/SparseBooleanArray;
    .locals 0

    .line 1
    iget-object p0, p0, Ll1/J;->k:Landroid/util/SparseBooleanArray;

    .line 2
    .line 3
    return-object p0
.end method

.method private static synthetic y()[LF0/r;
    .locals 3

    .line 1
    new-instance v0, Ll1/J;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sget-object v2, Lc1/t$a;->a:Lc1/t$a;

    .line 5
    .line 6
    invoke-direct {v0, v1, v2}, Ll1/J;-><init>(ILc1/t$a;)V

    .line 7
    .line 8
    .line 9
    new-array v1, v1, [LF0/r;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    aput-object v0, v1, v2

    .line 13
    .line 14
    return-object v1
.end method

.method private z(J)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Ll1/J;->q:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Ll1/J;->q:Z

    .line 7
    .line 8
    iget-object v0, p0, Ll1/J;->l:Ll1/H;

    .line 9
    .line 10
    invoke-virtual {v0}, Ll1/H;->b()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v0, v0, v2

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    new-instance v0, Ll1/G;

    .line 24
    .line 25
    iget-object v1, p0, Ll1/J;->l:Ll1/H;

    .line 26
    .line 27
    invoke-virtual {v1}, Ll1/H;->c()Lg0/E;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-object v1, p0, Ll1/J;->l:Ll1/H;

    .line 32
    .line 33
    invoke-virtual {v1}, Ll1/H;->b()J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    iget v7, p0, Ll1/J;->u:I

    .line 38
    .line 39
    iget v8, p0, Ll1/J;->c:I

    .line 40
    .line 41
    move-object v1, v0

    .line 42
    move-wide v5, p1

    .line 43
    invoke-direct/range {v1 .. v8}, Ll1/G;-><init>(Lg0/E;JJII)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Ll1/J;->m:Ll1/G;

    .line 47
    .line 48
    iget-object p1, p0, Ll1/J;->n:LF0/t;

    .line 49
    .line 50
    invoke-virtual {v0}, LF0/e;->b()LF0/M;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    :goto_0
    invoke-interface {p1, p2}, LF0/t;->e(LF0/M;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_0
    iget-object p1, p0, Ll1/J;->n:LF0/t;

    .line 59
    .line 60
    new-instance p2, LF0/M$b;

    .line 61
    .line 62
    iget-object v0, p0, Ll1/J;->l:Ll1/H;

    .line 63
    .line 64
    invoke-virtual {v0}, Ll1/H;->b()J

    .line 65
    .line 66
    .line 67
    move-result-wide v0

    .line 68
    invoke-direct {p2, v0, v1}, LF0/M$b;-><init>(J)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 7

    .line 1
    iget-object v0, p0, Ll1/J;->j:Landroid/util/SparseBooleanArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/util/SparseBooleanArray;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll1/J;->i:Landroid/util/SparseArray;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ll1/J;->g:Ll1/K$c;

    .line 12
    .line 13
    invoke-interface {v0}, Ll1/K$c;->a()Landroid/util/SparseArray;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    move v3, v2

    .line 23
    :goto_0
    if-ge v3, v1, :cond_0

    .line 24
    .line 25
    iget-object v4, p0, Ll1/J;->i:Landroid/util/SparseArray;

    .line 26
    .line 27
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->keyAt(I)I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    check-cast v6, Ll1/K;

    .line 36
    .line 37
    invoke-virtual {v4, v5, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object v0, p0, Ll1/J;->i:Landroid/util/SparseArray;

    .line 44
    .line 45
    new-instance v1, Ll1/E;

    .line 46
    .line 47
    new-instance v3, Ll1/J$a;

    .line 48
    .line 49
    invoke-direct {v3, p0}, Ll1/J$a;-><init>(Ll1/J;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {v1, v3}, Ll1/E;-><init>(Ll1/D;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    iput-object v0, p0, Ll1/J;->s:Ll1/K;

    .line 60
    .line 61
    return-void
.end method

.method public final B(I)Z
    .locals 2

    .line 1
    iget v0, p0, Ll1/J;->a:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    iget-boolean v0, p0, Ll1/J;->p:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Ll1/J;->k:Landroid/util/SparseBooleanArray;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, p1, v1}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    :cond_0
    const/4 v1, 0x1

    .line 20
    :cond_1
    return v1
.end method

.method public a(JJ)V
    .locals 9

    .line 1
    iget p1, p0, Ll1/J;->a:I

    .line 2
    .line 3
    const/4 p2, 0x2

    .line 4
    const/4 v0, 0x1

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eq p1, p2, :cond_0

    .line 7
    .line 8
    move p1, v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p1, v1

    .line 11
    :goto_0
    invoke-static {p1}, Lg0/a;->f(Z)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Ll1/J;->d:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    move p2, v1

    .line 21
    :goto_1
    const-wide/16 v2, 0x0

    .line 22
    .line 23
    if-ge p2, p1, :cond_4

    .line 24
    .line 25
    iget-object v4, p0, Ll1/J;->d:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, Lg0/E;

    .line 32
    .line 33
    invoke-virtual {v4}, Lg0/E;->f()J

    .line 34
    .line 35
    .line 36
    move-result-wide v5

    .line 37
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    cmp-long v5, v5, v7

    .line 43
    .line 44
    if-nez v5, :cond_1

    .line 45
    .line 46
    move v5, v0

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    move v5, v1

    .line 49
    :goto_2
    if-nez v5, :cond_2

    .line 50
    .line 51
    invoke-virtual {v4}, Lg0/E;->d()J

    .line 52
    .line 53
    .line 54
    move-result-wide v5

    .line 55
    cmp-long v7, v5, v7

    .line 56
    .line 57
    if-eqz v7, :cond_3

    .line 58
    .line 59
    cmp-long v2, v5, v2

    .line 60
    .line 61
    if-eqz v2, :cond_3

    .line 62
    .line 63
    cmp-long v2, v5, p3

    .line 64
    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_2
    if-eqz v5, :cond_3

    .line 69
    .line 70
    :goto_3
    invoke-virtual {v4, p3, p4}, Lg0/E;->i(J)V

    .line 71
    .line 72
    .line 73
    :cond_3
    add-int/lit8 p2, p2, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    cmp-long p1, p3, v2

    .line 77
    .line 78
    if-eqz p1, :cond_5

    .line 79
    .line 80
    iget-object p1, p0, Ll1/J;->m:Ll1/G;

    .line 81
    .line 82
    if-eqz p1, :cond_5

    .line 83
    .line 84
    invoke-virtual {p1, p3, p4}, LF0/e;->h(J)V

    .line 85
    .line 86
    .line 87
    :cond_5
    iget-object p1, p0, Ll1/J;->e:Lg0/z;

    .line 88
    .line 89
    invoke-virtual {p1, v1}, Lg0/z;->P(I)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Ll1/J;->f:Landroid/util/SparseIntArray;

    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 95
    .line 96
    .line 97
    move p1, v1

    .line 98
    :goto_4
    iget-object p2, p0, Ll1/J;->i:Landroid/util/SparseArray;

    .line 99
    .line 100
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    if-ge p1, p2, :cond_6

    .line 105
    .line 106
    iget-object p2, p0, Ll1/J;->i:Landroid/util/SparseArray;

    .line 107
    .line 108
    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    check-cast p2, Ll1/K;

    .line 113
    .line 114
    invoke-interface {p2}, Ll1/K;->b()V

    .line 115
    .line 116
    .line 117
    add-int/lit8 p1, p1, 0x1

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_6
    iput v1, p0, Ll1/J;->t:I

    .line 121
    .line 122
    return-void
.end method

.method public b(LF0/t;)V
    .locals 2

    .line 1
    iget v0, p0, Ll1/J;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lc1/v;

    .line 8
    .line 9
    iget-object v1, p0, Ll1/J;->h:Lc1/t$a;

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, Lc1/v;-><init>(LF0/t;Lc1/t$a;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v0

    .line 15
    :cond_0
    iput-object p1, p0, Ll1/J;->n:LF0/t;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic d()LF0/r;
    .locals 1

    .line 1
    invoke-static {p0}, LF0/q;->b(LF0/r;)LF0/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public e(LF0/s;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Ll1/J;->e:Lg0/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x3ac

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-interface {p1, v0, v2, v1}, LF0/s;->n([BII)V

    .line 11
    .line 12
    .line 13
    move v1, v2

    .line 14
    :goto_0
    const/16 v3, 0xbc

    .line 15
    .line 16
    if-ge v1, v3, :cond_2

    .line 17
    .line 18
    move v3, v2

    .line 19
    :goto_1
    const/4 v4, 0x5

    .line 20
    if-ge v3, v4, :cond_1

    .line 21
    .line 22
    mul-int/lit16 v4, v3, 0xbc

    .line 23
    .line 24
    add-int/2addr v4, v1

    .line 25
    aget-byte v4, v0, v4

    .line 26
    .line 27
    const/16 v5, 0x47

    .line 28
    .line 29
    if-eq v4, v5, :cond_0

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-interface {p1, v1}, LF0/s;->i(I)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    return p1

    .line 42
    :cond_2
    return v2
.end method

.method public synthetic g()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {p0}, LF0/q;->a(LF0/r;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public i(LF0/s;LF0/L;)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-interface/range {p1 .. p1}, LF0/s;->a()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    iget v5, v0, Ll1/J;->a:I

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x2

    .line 16
    if-ne v5, v8, :cond_0

    .line 17
    .line 18
    move v5, v6

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v5, v7

    .line 21
    :goto_0
    iget-boolean v9, v0, Ll1/J;->p:Z

    .line 22
    .line 23
    const-wide/16 v10, -0x1

    .line 24
    .line 25
    if-eqz v9, :cond_3

    .line 26
    .line 27
    cmp-long v9, v3, v10

    .line 28
    .line 29
    if-eqz v9, :cond_1

    .line 30
    .line 31
    if-nez v5, :cond_1

    .line 32
    .line 33
    iget-object v9, v0, Ll1/J;->l:Ll1/H;

    .line 34
    .line 35
    invoke-virtual {v9}, Ll1/H;->d()Z

    .line 36
    .line 37
    .line 38
    move-result v9

    .line 39
    if-nez v9, :cond_1

    .line 40
    .line 41
    iget-object v3, v0, Ll1/J;->l:Ll1/H;

    .line 42
    .line 43
    iget v4, v0, Ll1/J;->u:I

    .line 44
    .line 45
    invoke-virtual {v3, v1, v2, v4}, Ll1/H;->e(LF0/s;LF0/L;I)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    return v1

    .line 50
    :cond_1
    invoke-direct {v0, v3, v4}, Ll1/J;->z(J)V

    .line 51
    .line 52
    .line 53
    iget-boolean v9, v0, Ll1/J;->r:Z

    .line 54
    .line 55
    if-eqz v9, :cond_2

    .line 56
    .line 57
    iput-boolean v7, v0, Ll1/J;->r:Z

    .line 58
    .line 59
    const-wide/16 v12, 0x0

    .line 60
    .line 61
    invoke-virtual {v0, v12, v13, v12, v13}, Ll1/J;->a(JJ)V

    .line 62
    .line 63
    .line 64
    invoke-interface/range {p1 .. p1}, LF0/s;->p()J

    .line 65
    .line 66
    .line 67
    move-result-wide v14

    .line 68
    cmp-long v9, v14, v12

    .line 69
    .line 70
    if-eqz v9, :cond_2

    .line 71
    .line 72
    iput-wide v12, v2, LF0/L;->a:J

    .line 73
    .line 74
    return v6

    .line 75
    :cond_2
    iget-object v9, v0, Ll1/J;->m:Ll1/G;

    .line 76
    .line 77
    if-eqz v9, :cond_3

    .line 78
    .line 79
    invoke-virtual {v9}, LF0/e;->d()Z

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    if-eqz v9, :cond_3

    .line 84
    .line 85
    iget-object v3, v0, Ll1/J;->m:Ll1/G;

    .line 86
    .line 87
    invoke-virtual {v3, v1, v2}, LF0/e;->c(LF0/s;LF0/L;)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    return v1

    .line 92
    :cond_3
    invoke-virtual/range {p0 .. p1}, Ll1/J;->w(LF0/s;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-nez v1, :cond_6

    .line 97
    .line 98
    :goto_1
    iget-object v1, v0, Ll1/J;->i:Landroid/util/SparseArray;

    .line 99
    .line 100
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-ge v7, v1, :cond_5

    .line 105
    .line 106
    iget-object v1, v0, Ll1/J;->i:Landroid/util/SparseArray;

    .line 107
    .line 108
    invoke-virtual {v1, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, Ll1/K;

    .line 113
    .line 114
    instance-of v2, v1, Ll1/y;

    .line 115
    .line 116
    if-eqz v2, :cond_4

    .line 117
    .line 118
    check-cast v1, Ll1/y;

    .line 119
    .line 120
    invoke-virtual {v1, v5}, Ll1/y;->d(Z)Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_4

    .line 125
    .line 126
    new-instance v2, Lg0/z;

    .line 127
    .line 128
    invoke-direct {v2}, Lg0/z;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v2, v6}, Ll1/y;->a(Lg0/z;I)V

    .line 132
    .line 133
    .line 134
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_5
    const/4 v1, -0x1

    .line 138
    return v1

    .line 139
    :cond_6
    invoke-virtual/range {p0 .. p0}, Ll1/J;->x()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    iget-object v2, v0, Ll1/J;->e:Lg0/z;

    .line 144
    .line 145
    invoke-virtual {v2}, Lg0/z;->g()I

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-le v1, v2, :cond_7

    .line 150
    .line 151
    return v7

    .line 152
    :cond_7
    iget-object v5, v0, Ll1/J;->e:Lg0/z;

    .line 153
    .line 154
    invoke-virtual {v5}, Lg0/z;->p()I

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    const/high16 v9, 0x800000

    .line 159
    .line 160
    and-int/2addr v9, v5

    .line 161
    if-eqz v9, :cond_9

    .line 162
    .line 163
    :cond_8
    :goto_2
    iget-object v2, v0, Ll1/J;->e:Lg0/z;

    .line 164
    .line 165
    invoke-virtual {v2, v1}, Lg0/z;->T(I)V

    .line 166
    .line 167
    .line 168
    return v7

    .line 169
    :cond_9
    const/high16 v9, 0x400000

    .line 170
    .line 171
    and-int/2addr v9, v5

    .line 172
    if-eqz v9, :cond_a

    .line 173
    .line 174
    move v9, v6

    .line 175
    goto :goto_3

    .line 176
    :cond_a
    move v9, v7

    .line 177
    :goto_3
    const v12, 0x1fff00

    .line 178
    .line 179
    .line 180
    and-int/2addr v12, v5

    .line 181
    shr-int/lit8 v12, v12, 0x8

    .line 182
    .line 183
    and-int/lit8 v13, v5, 0x20

    .line 184
    .line 185
    if-eqz v13, :cond_b

    .line 186
    .line 187
    move v13, v6

    .line 188
    goto :goto_4

    .line 189
    :cond_b
    move v13, v7

    .line 190
    :goto_4
    and-int/lit8 v14, v5, 0x10

    .line 191
    .line 192
    if-eqz v14, :cond_c

    .line 193
    .line 194
    iget-object v14, v0, Ll1/J;->i:Landroid/util/SparseArray;

    .line 195
    .line 196
    invoke-virtual {v14, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v14

    .line 200
    check-cast v14, Ll1/K;

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_c
    const/4 v14, 0x0

    .line 204
    :goto_5
    if-nez v14, :cond_d

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_d
    iget v15, v0, Ll1/J;->a:I

    .line 208
    .line 209
    if-eq v15, v8, :cond_f

    .line 210
    .line 211
    and-int/lit8 v5, v5, 0xf

    .line 212
    .line 213
    iget-object v15, v0, Ll1/J;->f:Landroid/util/SparseIntArray;

    .line 214
    .line 215
    add-int/lit8 v10, v5, -0x1

    .line 216
    .line 217
    invoke-virtual {v15, v12, v10}, Landroid/util/SparseIntArray;->get(II)I

    .line 218
    .line 219
    .line 220
    move-result v10

    .line 221
    iget-object v11, v0, Ll1/J;->f:Landroid/util/SparseIntArray;

    .line 222
    .line 223
    invoke-virtual {v11, v12, v5}, Landroid/util/SparseIntArray;->put(II)V

    .line 224
    .line 225
    .line 226
    if-ne v10, v5, :cond_e

    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_e
    add-int/2addr v10, v6

    .line 230
    and-int/lit8 v10, v10, 0xf

    .line 231
    .line 232
    if-eq v5, v10, :cond_f

    .line 233
    .line 234
    invoke-interface {v14}, Ll1/K;->b()V

    .line 235
    .line 236
    .line 237
    :cond_f
    if-eqz v13, :cond_11

    .line 238
    .line 239
    iget-object v5, v0, Ll1/J;->e:Lg0/z;

    .line 240
    .line 241
    invoke-virtual {v5}, Lg0/z;->G()I

    .line 242
    .line 243
    .line 244
    move-result v5

    .line 245
    iget-object v10, v0, Ll1/J;->e:Lg0/z;

    .line 246
    .line 247
    invoke-virtual {v10}, Lg0/z;->G()I

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    and-int/lit8 v10, v10, 0x40

    .line 252
    .line 253
    if-eqz v10, :cond_10

    .line 254
    .line 255
    move v10, v8

    .line 256
    goto :goto_6

    .line 257
    :cond_10
    move v10, v7

    .line 258
    :goto_6
    or-int/2addr v9, v10

    .line 259
    iget-object v10, v0, Ll1/J;->e:Lg0/z;

    .line 260
    .line 261
    sub-int/2addr v5, v6

    .line 262
    invoke-virtual {v10, v5}, Lg0/z;->U(I)V

    .line 263
    .line 264
    .line 265
    :cond_11
    iget-boolean v5, v0, Ll1/J;->p:Z

    .line 266
    .line 267
    invoke-virtual {v0, v12}, Ll1/J;->B(I)Z

    .line 268
    .line 269
    .line 270
    move-result v10

    .line 271
    if-eqz v10, :cond_12

    .line 272
    .line 273
    iget-object v10, v0, Ll1/J;->e:Lg0/z;

    .line 274
    .line 275
    invoke-virtual {v10, v1}, Lg0/z;->S(I)V

    .line 276
    .line 277
    .line 278
    iget-object v10, v0, Ll1/J;->e:Lg0/z;

    .line 279
    .line 280
    invoke-interface {v14, v10, v9}, Ll1/K;->a(Lg0/z;I)V

    .line 281
    .line 282
    .line 283
    iget-object v9, v0, Ll1/J;->e:Lg0/z;

    .line 284
    .line 285
    invoke-virtual {v9, v2}, Lg0/z;->S(I)V

    .line 286
    .line 287
    .line 288
    :cond_12
    iget v2, v0, Ll1/J;->a:I

    .line 289
    .line 290
    if-eq v2, v8, :cond_8

    .line 291
    .line 292
    if-nez v5, :cond_8

    .line 293
    .line 294
    iget-boolean v2, v0, Ll1/J;->p:Z

    .line 295
    .line 296
    if-eqz v2, :cond_8

    .line 297
    .line 298
    const-wide/16 v8, -0x1

    .line 299
    .line 300
    cmp-long v2, v3, v8

    .line 301
    .line 302
    if-eqz v2, :cond_8

    .line 303
    .line 304
    iput-boolean v6, v0, Ll1/J;->r:Z

    .line 305
    .line 306
    goto/16 :goto_2
.end method

.method public release()V
    .locals 0

    .line 1
    return-void
.end method

.method public final w(LF0/s;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Ll1/J;->e:Lg0/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Ll1/J;->e:Lg0/z;

    .line 8
    .line 9
    invoke-virtual {v1}, Lg0/z;->f()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    rsub-int v1, v1, 0x24b8

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/16 v3, 0xbc

    .line 17
    .line 18
    if-ge v1, v3, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Ll1/J;->e:Lg0/z;

    .line 21
    .line 22
    invoke-virtual {v1}, Lg0/z;->a()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-lez v1, :cond_0

    .line 27
    .line 28
    iget-object v4, p0, Ll1/J;->e:Lg0/z;

    .line 29
    .line 30
    invoke-virtual {v4}, Lg0/z;->f()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-static {v0, v4, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v4, p0, Ll1/J;->e:Lg0/z;

    .line 38
    .line 39
    invoke-virtual {v4, v0, v1}, Lg0/z;->R([BI)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    iget-object v1, p0, Ll1/J;->e:Lg0/z;

    .line 43
    .line 44
    invoke-virtual {v1}, Lg0/z;->a()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-ge v1, v3, :cond_3

    .line 49
    .line 50
    iget-object v1, p0, Ll1/J;->e:Lg0/z;

    .line 51
    .line 52
    invoke-virtual {v1}, Lg0/z;->g()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    rsub-int v4, v1, 0x24b8

    .line 57
    .line 58
    invoke-interface {p1, v0, v1, v4}, LF0/s;->read([BII)I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    const/4 v5, -0x1

    .line 63
    if-ne v4, v5, :cond_2

    .line 64
    .line 65
    return v2

    .line 66
    :cond_2
    iget-object v5, p0, Ll1/J;->e:Lg0/z;

    .line 67
    .line 68
    add-int/2addr v1, v4

    .line 69
    invoke-virtual {v5, v1}, Lg0/z;->S(I)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    const/4 p1, 0x1

    .line 74
    return p1
.end method

.method public final x()I
    .locals 4

    .line 1
    iget-object v0, p0, Ll1/J;->e:Lg0/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/z;->f()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Ll1/J;->e:Lg0/z;

    .line 8
    .line 9
    invoke-virtual {v1}, Lg0/z;->g()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p0, Ll1/J;->e:Lg0/z;

    .line 14
    .line 15
    invoke-virtual {v2}, Lg0/z;->e()[B

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v2, v0, v1}, Ll1/L;->a([BII)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    iget-object v3, p0, Ll1/J;->e:Lg0/z;

    .line 24
    .line 25
    invoke-virtual {v3, v2}, Lg0/z;->T(I)V

    .line 26
    .line 27
    .line 28
    add-int/lit16 v3, v2, 0xbc

    .line 29
    .line 30
    if-le v3, v1, :cond_1

    .line 31
    .line 32
    iget v1, p0, Ll1/J;->t:I

    .line 33
    .line 34
    sub-int/2addr v2, v0

    .line 35
    add-int/2addr v1, v2

    .line 36
    iput v1, p0, Ll1/J;->t:I

    .line 37
    .line 38
    iget v0, p0, Ll1/J;->a:I

    .line 39
    .line 40
    const/4 v2, 0x2

    .line 41
    if-ne v0, v2, :cond_2

    .line 42
    .line 43
    const/16 v0, 0x178

    .line 44
    .line 45
    if-gt v1, v0, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const-string v0, "Cannot find sync byte. Most likely not a Transport Stream."

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-static {v0, v1}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    throw v0

    .line 56
    :cond_1
    const/4 v0, 0x0

    .line 57
    iput v0, p0, Ll1/J;->t:I

    .line 58
    .line 59
    :cond_2
    :goto_0
    return v3
.end method
