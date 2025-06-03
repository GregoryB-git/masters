.class public final Lz4/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz4/r;
.implements Lc4/j;
.implements Lt5/d0$a;
.implements Lt5/d0$e;
.implements Lz4/b0$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz4/y$d;,
        Lz4/y$e;,
        Lz4/y$a;,
        Lz4/y$c;,
        Lz4/y$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lz4/r;",
        "Lc4/j;",
        "Lt5/d0$a<",
        "Lz4/y$a;",
        ">;",
        "Lt5/d0$e;",
        "Lz4/b0$c;"
    }
.end annotation


# static fields
.field public static final U:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final V:Lv3/i0;


# instance fields
.field public A:[Lz4/b0;

.field public B:[Lz4/y$d;

.field public C:Z

.field public D:Z

.field public E:Z

.field public F:Lz4/y$e;

.field public G:Lc4/t;

.field public H:J

.field public I:Z

.field public J:I

.field public K:Z

.field public L:Z

.field public M:I

.field public N:Z

.field public O:J

.field public P:J

.field public Q:Z

.field public R:I

.field public S:Z

.field public T:Z

.field public final a:Landroid/net/Uri;

.field public final b:Lt5/k;

.field public final c:La4/h;

.field public final d:Lt5/c0;

.field public final e:Lz4/w$a;

.field public final f:La4/g$a;

.field public final o:Lz4/y$b;

.field public final p:Lt5/b;

.field public final q:Ljava/lang/String;

.field public final r:J

.field public final s:Lt5/d0;

.field public final t:Lz4/x;

.field public final u:Lb5/g;

.field public final v:Lu/a;

.field public final w:Lb/d;

.field public final x:Landroid/os/Handler;

.field public y:Lz4/r$a;

.field public z:Lt4/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Icy-MetaData"

    .line 7
    .line 8
    const-string v2, "1"

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lz4/y;->U:Ljava/util/Map;

    .line 18
    .line 19
    new-instance v0, Lv3/i0$a;

    .line 20
    .line 21
    invoke-direct {v0}, Lv3/i0$a;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v1, "icy"

    .line 25
    .line 26
    iput-object v1, v0, Lv3/i0$a;->a:Ljava/lang/String;

    .line 27
    .line 28
    const-string v1, "application/x-icy"

    .line 29
    .line 30
    iput-object v1, v0, Lv3/i0$a;->k:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0}, Lv3/i0$a;->a()Lv3/i0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, Lz4/y;->V:Lv3/i0;

    .line 37
    .line 38
    return-void
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public constructor <init>(Landroid/net/Uri;Lt5/k;Lr3/a0;La4/h;La4/g$a;Lt5/c0;Lz4/w$a;Lz4/y$b;Lt5/b;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz4/y;->a:Landroid/net/Uri;

    .line 5
    .line 6
    iput-object p2, p0, Lz4/y;->b:Lt5/k;

    .line 7
    .line 8
    iput-object p4, p0, Lz4/y;->c:La4/h;

    .line 9
    .line 10
    iput-object p5, p0, Lz4/y;->f:La4/g$a;

    .line 11
    .line 12
    iput-object p6, p0, Lz4/y;->d:Lt5/c0;

    .line 13
    .line 14
    iput-object p7, p0, Lz4/y;->e:Lz4/w$a;

    .line 15
    .line 16
    iput-object p8, p0, Lz4/y;->o:Lz4/y$b;

    .line 17
    .line 18
    iput-object p9, p0, Lz4/y;->p:Lt5/b;

    .line 19
    .line 20
    iput-object p10, p0, Lz4/y;->q:Ljava/lang/String;

    .line 21
    .line 22
    int-to-long p1, p11

    .line 23
    iput-wide p1, p0, Lz4/y;->r:J

    .line 24
    .line 25
    new-instance p1, Lt5/d0;

    .line 26
    .line 27
    const-string p2, "ProgressiveMediaPeriod"

    .line 28
    .line 29
    invoke-direct {p1, p2}, Lt5/d0;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lz4/y;->s:Lt5/d0;

    .line 33
    .line 34
    iput-object p3, p0, Lz4/y;->t:Lz4/x;

    .line 35
    .line 36
    new-instance p1, Lb5/g;

    .line 37
    .line 38
    const/4 p2, 0x1

    .line 39
    invoke-direct {p1, p2}, Lb5/g;-><init>(I)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lz4/y;->u:Lb5/g;

    .line 43
    .line 44
    new-instance p1, Lu/a;

    .line 45
    .line 46
    const/16 p3, 0x9

    .line 47
    .line 48
    invoke-direct {p1, p0, p3}, Lu/a;-><init>(Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lz4/y;->v:Lu/a;

    .line 52
    .line 53
    new-instance p1, Lb/d;

    .line 54
    .line 55
    const/16 p3, 0xa

    .line 56
    .line 57
    invoke-direct {p1, p0, p3}, Lb/d;-><init>(Ljava/lang/Object;I)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lz4/y;->w:Lb/d;

    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    invoke-static {p1}, Lv5/e0;->l(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iput-object p1, p0, Lz4/y;->x:Landroid/os/Handler;

    .line 68
    .line 69
    const/4 p1, 0x0

    .line 70
    new-array p3, p1, [Lz4/y$d;

    .line 71
    .line 72
    iput-object p3, p0, Lz4/y;->B:[Lz4/y$d;

    .line 73
    .line 74
    new-array p1, p1, [Lz4/b0;

    .line 75
    .line 76
    iput-object p1, p0, Lz4/y;->A:[Lz4/b0;

    .line 77
    .line 78
    const-wide p3, -0x7fffffffffffffffL    # -4.9E-324

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    iput-wide p3, p0, Lz4/y;->P:J

    .line 84
    .line 85
    iput-wide p3, p0, Lz4/y;->H:J

    .line 86
    .line 87
    iput p2, p0, Lz4/y;->J:I

    .line 88
    .line 89
    return-void
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
.end method


# virtual methods
.method public final A(I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lz4/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lz4/y;->F:Lz4/y$e;

    .line 5
    .line 6
    iget-object v0, v0, Lz4/y$e;->b:[Z

    .line 7
    .line 8
    iget-boolean v1, p0, Lz4/y;->Q:Z

    .line 9
    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    aget-boolean v0, v0, p1

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    iget-object v0, p0, Lz4/y;->A:[Lz4/b0;

    .line 17
    .line 18
    aget-object p1, v0, p1

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p1, v0}, Lz4/b0;->q(Z)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    const-wide/16 v1, 0x0

    .line 29
    .line 30
    iput-wide v1, p0, Lz4/y;->P:J

    .line 31
    .line 32
    iput-boolean v0, p0, Lz4/y;->Q:Z

    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    iput-boolean p1, p0, Lz4/y;->L:Z

    .line 36
    .line 37
    iput-wide v1, p0, Lz4/y;->O:J

    .line 38
    .line 39
    iput v0, p0, Lz4/y;->R:I

    .line 40
    .line 41
    iget-object p1, p0, Lz4/y;->A:[Lz4/b0;

    .line 42
    .line 43
    array-length v1, p1

    .line 44
    move v2, v0

    .line 45
    :goto_0
    if-ge v2, v1, :cond_1

    .line 46
    .line 47
    aget-object v3, p1, v2

    .line 48
    .line 49
    invoke-virtual {v3, v0}, Lz4/b0;->v(Z)V

    .line 50
    .line 51
    .line 52
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    iget-object p1, p0, Lz4/y;->y:Lz4/r$a;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-interface {p1, p0}, Lz4/d0$a;->a(Lz4/d0;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    :goto_1
    return-void
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final B(Lz4/y$d;)Lz4/b0;
    .locals 5

    .line 1
    iget-object v0, p0, Lz4/y;->A:[Lz4/b0;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_1

    .line 6
    .line 7
    iget-object v2, p0, Lz4/y;->B:[Lz4/y$d;

    .line 8
    .line 9
    aget-object v2, v2, v1

    .line 10
    .line 11
    invoke-virtual {p1, v2}, Lz4/y$d;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lz4/y;->A:[Lz4/b0;

    .line 18
    .line 19
    aget-object p1, p1, v1

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object v1, p0, Lz4/y;->p:Lt5/b;

    .line 26
    .line 27
    iget-object v2, p0, Lz4/y;->c:La4/h;

    .line 28
    .line 29
    iget-object v3, p0, Lz4/y;->f:La4/g$a;

    .line 30
    .line 31
    new-instance v4, Lz4/b0;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-direct {v4, v1, v2, v3}, Lz4/b0;-><init>(Lt5/b;La4/h;La4/g$a;)V

    .line 40
    .line 41
    .line 42
    iput-object p0, v4, Lz4/b0;->f:Lz4/b0$c;

    .line 43
    .line 44
    iget-object v1, p0, Lz4/y;->B:[Lz4/y$d;

    .line 45
    .line 46
    add-int/lit8 v2, v0, 0x1

    .line 47
    .line 48
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, [Lz4/y$d;

    .line 53
    .line 54
    aput-object p1, v1, v0

    .line 55
    .line 56
    iput-object v1, p0, Lz4/y;->B:[Lz4/y$d;

    .line 57
    .line 58
    iget-object p1, p0, Lz4/y;->A:[Lz4/b0;

    .line 59
    .line 60
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, [Lz4/b0;

    .line 65
    .line 66
    aput-object v4, p1, v0

    .line 67
    .line 68
    iput-object p1, p0, Lz4/y;->A:[Lz4/b0;

    .line 69
    .line 70
    return-object v4
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final C()V
    .locals 26

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    new-instance v8, Lz4/y$a;

    .line 4
    .line 5
    iget-object v2, v7, Lz4/y;->a:Landroid/net/Uri;

    .line 6
    .line 7
    iget-object v3, v7, Lz4/y;->b:Lt5/k;

    .line 8
    .line 9
    iget-object v4, v7, Lz4/y;->t:Lz4/x;

    .line 10
    .line 11
    iget-object v6, v7, Lz4/y;->u:Lb5/g;

    .line 12
    .line 13
    move-object v0, v8

    .line 14
    move-object/from16 v1, p0

    .line 15
    .line 16
    move-object/from16 v5, p0

    .line 17
    .line 18
    invoke-direct/range {v0 .. v6}, Lz4/y$a;-><init>(Lz4/y;Landroid/net/Uri;Lt5/k;Lz4/x;Lc4/j;Lb5/g;)V

    .line 19
    .line 20
    .line 21
    iget-boolean v0, v7, Lz4/y;->D:Z

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-virtual/range {p0 .. p0}, Lz4/y;->x()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {v0}, Lx6/b;->H(Z)V

    .line 30
    .line 31
    .line 32
    iget-wide v0, v7, Lz4/y;->H:J

    .line 33
    .line 34
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    cmp-long v4, v0, v2

    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    iget-wide v9, v7, Lz4/y;->P:J

    .line 45
    .line 46
    cmp-long v0, v9, v0

    .line 47
    .line 48
    if-lez v0, :cond_0

    .line 49
    .line 50
    iput-boolean v5, v7, Lz4/y;->S:Z

    .line 51
    .line 52
    iput-wide v2, v7, Lz4/y;->P:J

    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    iget-object v0, v7, Lz4/y;->G:Lc4/t;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-wide v9, v7, Lz4/y;->P:J

    .line 61
    .line 62
    invoke-interface {v0, v9, v10}, Lc4/t;->g(J)Lc4/t$a;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object v0, v0, Lc4/t$a;->a:Lc4/u;

    .line 67
    .line 68
    iget-wide v0, v0, Lc4/u;->b:J

    .line 69
    .line 70
    iget-wide v9, v7, Lz4/y;->P:J

    .line 71
    .line 72
    iget-object v4, v8, Lz4/y$a;->g:Lc4/s;

    .line 73
    .line 74
    iput-wide v0, v4, Lc4/s;->a:J

    .line 75
    .line 76
    iput-wide v9, v8, Lz4/y$a;->j:J

    .line 77
    .line 78
    iput-boolean v5, v8, Lz4/y$a;->i:Z

    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    iput-boolean v0, v8, Lz4/y$a;->m:Z

    .line 82
    .line 83
    iget-object v1, v7, Lz4/y;->A:[Lz4/b0;

    .line 84
    .line 85
    array-length v4, v1

    .line 86
    :goto_0
    if-ge v0, v4, :cond_1

    .line 87
    .line 88
    aget-object v5, v1, v0

    .line 89
    .line 90
    iget-wide v9, v7, Lz4/y;->P:J

    .line 91
    .line 92
    iput-wide v9, v5, Lz4/b0;->t:J

    .line 93
    .line 94
    add-int/lit8 v0, v0, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_1
    iput-wide v2, v7, Lz4/y;->P:J

    .line 98
    .line 99
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lz4/y;->v()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    iput v0, v7, Lz4/y;->R:I

    .line 104
    .line 105
    iget-object v0, v7, Lz4/y;->s:Lt5/d0;

    .line 106
    .line 107
    iget-object v1, v7, Lz4/y;->d:Lt5/c0;

    .line 108
    .line 109
    iget v2, v7, Lz4/y;->J:I

    .line 110
    .line 111
    check-cast v1, Lt5/u;

    .line 112
    .line 113
    invoke-virtual {v1, v2}, Lt5/u;->b(I)I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    invoke-virtual {v0, v8, v7, v1}, Lt5/d0;->f(Lt5/d0$d;Lt5/d0$a;I)J

    .line 118
    .line 119
    .line 120
    move-result-wide v13

    .line 121
    iget-object v12, v8, Lz4/y$a;->k:Lt5/n;

    .line 122
    .line 123
    iget-object v15, v7, Lz4/y;->e:Lz4/w$a;

    .line 124
    .line 125
    new-instance v16, Lz4/n;

    .line 126
    .line 127
    iget-wide v10, v8, Lz4/y$a;->a:J

    .line 128
    .line 129
    move-object/from16 v9, v16

    .line 130
    .line 131
    invoke-direct/range {v9 .. v14}, Lz4/n;-><init>(JLt5/n;J)V

    .line 132
    .line 133
    .line 134
    const/16 v17, 0x1

    .line 135
    .line 136
    const/16 v18, -0x1

    .line 137
    .line 138
    const/16 v19, 0x0

    .line 139
    .line 140
    const/16 v20, 0x0

    .line 141
    .line 142
    const/16 v21, 0x0

    .line 143
    .line 144
    iget-wide v0, v8, Lz4/y$a;->j:J

    .line 145
    .line 146
    iget-wide v2, v7, Lz4/y;->H:J

    .line 147
    .line 148
    move-wide/from16 v22, v0

    .line 149
    .line 150
    move-wide/from16 v24, v2

    .line 151
    .line 152
    invoke-virtual/range {v15 .. v25}, Lz4/w$a;->n(Lz4/n;IILv3/i0;ILjava/lang/Object;JJ)V

    .line 153
    .line 154
    .line 155
    return-void
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
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
.end method

.method public final D()Z
    .locals 1

    iget-boolean v0, p0, Lz4/y;->L:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lz4/y;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final a()V
    .locals 2

    iget-object v0, p0, Lz4/y;->x:Landroid/os/Handler;

    iget-object v1, p0, Lz4/y;->v:Lu/a;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lz4/y;->D:Z

    .line 2
    .line 3
    invoke-static {v0}, Lx6/b;->H(Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz4/y;->F:Lz4/y$e;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lz4/y;->G:Lc4/t;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final c()J
    .locals 2

    invoke-virtual {p0}, Lz4/y;->g()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d(J)Z
    .locals 0

    iget-boolean p1, p0, Lz4/y;->S:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lz4/y;->s:Lt5/d0;

    invoke-virtual {p1}, Lt5/d0;->c()Z

    move-result p1

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lz4/y;->Q:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lz4/y;->D:Z

    if-eqz p1, :cond_0

    iget p1, p0, Lz4/y;->M:I

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lz4/y;->u:Lb5/g;

    invoke-virtual {p1}, Lb5/g;->a()Z

    move-result p1

    iget-object p2, p0, Lz4/y;->s:Lt5/d0;

    invoke-virtual {p2}, Lt5/d0;->d()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0}, Lz4/y;->C()V

    const/4 p1, 0x1

    :cond_1
    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final e(JLv3/n1;)J
    .locals 9

    invoke-virtual {p0}, Lz4/y;->b()V

    iget-object v0, p0, Lz4/y;->G:Lc4/t;

    invoke-interface {v0}, Lc4/t;->e()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 p1, 0x0

    return-wide p1

    :cond_0
    iget-object v0, p0, Lz4/y;->G:Lc4/t;

    invoke-interface {v0, p1, p2}, Lc4/t;->g(J)Lc4/t$a;

    move-result-object v0

    iget-object v1, v0, Lc4/t$a;->a:Lc4/u;

    iget-wide v5, v1, Lc4/u;->a:J

    iget-object v0, v0, Lc4/t$a;->b:Lc4/u;

    iget-wide v7, v0, Lc4/u;->a:J

    move-object v2, p3

    move-wide v3, p1

    invoke-virtual/range {v2 .. v8}, Lv3/n1;->a(JJJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final f()V
    .locals 7

    .line 1
    iget-object v0, p0, Lz4/y;->A:[Lz4/b0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    const/4 v3, 0x0

    .line 6
    if-ge v2, v1, :cond_1

    .line 7
    .line 8
    aget-object v4, v0, v2

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    invoke-virtual {v4, v5}, Lz4/b0;->v(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v5, v4, Lz4/b0;->h:La4/e;

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    iget-object v6, v4, Lz4/b0;->e:La4/g$a;

    .line 19
    .line 20
    invoke-interface {v5, v6}, La4/e;->f(La4/g$a;)V

    .line 21
    .line 22
    .line 23
    iput-object v3, v4, Lz4/b0;->h:La4/e;

    .line 24
    .line 25
    iput-object v3, v4, Lz4/b0;->g:Lv3/i0;

    .line 26
    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v0, p0, Lz4/y;->t:Lz4/x;

    .line 31
    .line 32
    check-cast v0, Lr3/a0;

    .line 33
    .line 34
    iget-object v1, v0, Lr3/a0;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Lc4/h;

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    invoke-interface {v1}, Lc4/h;->release()V

    .line 41
    .line 42
    .line 43
    iput-object v3, v0, Lr3/a0;->b:Ljava/lang/Object;

    .line 44
    .line 45
    :cond_2
    iput-object v3, v0, Lr3/a0;->c:Ljava/lang/Object;

    .line 46
    .line 47
    return-void
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final g()J
    .locals 12

    .line 1
    invoke-virtual {p0}, Lz4/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lz4/y;->S:Z

    .line 5
    .line 6
    const-wide/high16 v1, -0x8000000000000000L

    .line 7
    .line 8
    if-nez v0, :cond_7

    .line 9
    .line 10
    iget v0, p0, Lz4/y;->M:I

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    invoke-virtual {p0}, Lz4/y;->x()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-wide v0, p0, Lz4/y;->P:J

    .line 22
    .line 23
    return-wide v0

    .line 24
    :cond_1
    iget-boolean v0, p0, Lz4/y;->E:Z

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const-wide v4, 0x7fffffffffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-object v0, p0, Lz4/y;->A:[Lz4/b0;

    .line 35
    .line 36
    array-length v0, v0

    .line 37
    move v6, v3

    .line 38
    move-wide v7, v4

    .line 39
    :goto_0
    if-ge v6, v0, :cond_4

    .line 40
    .line 41
    iget-object v9, p0, Lz4/y;->F:Lz4/y$e;

    .line 42
    .line 43
    iget-object v10, v9, Lz4/y$e;->b:[Z

    .line 44
    .line 45
    aget-boolean v10, v10, v6

    .line 46
    .line 47
    if-eqz v10, :cond_2

    .line 48
    .line 49
    iget-object v9, v9, Lz4/y$e;->c:[Z

    .line 50
    .line 51
    aget-boolean v9, v9, v6

    .line 52
    .line 53
    if-eqz v9, :cond_2

    .line 54
    .line 55
    iget-object v9, p0, Lz4/y;->A:[Lz4/b0;

    .line 56
    .line 57
    aget-object v9, v9, v6

    .line 58
    .line 59
    monitor-enter v9

    .line 60
    :try_start_0
    iget-boolean v10, v9, Lz4/b0;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 61
    .line 62
    monitor-exit v9

    .line 63
    if-nez v10, :cond_2

    .line 64
    .line 65
    iget-object v9, p0, Lz4/y;->A:[Lz4/b0;

    .line 66
    .line 67
    aget-object v9, v9, v6

    .line 68
    .line 69
    monitor-enter v9

    .line 70
    :try_start_1
    iget-wide v10, v9, Lz4/b0;->v:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    monitor-exit v9

    .line 73
    invoke-static {v7, v8, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 74
    .line 75
    .line 76
    move-result-wide v7

    .line 77
    goto :goto_1

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    monitor-exit v9

    .line 80
    throw v0

    .line 81
    :catchall_1
    move-exception v0

    .line 82
    monitor-exit v9

    .line 83
    throw v0

    .line 84
    :cond_2
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    move-wide v7, v4

    .line 88
    :cond_4
    cmp-long v0, v7, v4

    .line 89
    .line 90
    if-nez v0, :cond_5

    .line 91
    .line 92
    invoke-virtual {p0, v3}, Lz4/y;->w(Z)J

    .line 93
    .line 94
    .line 95
    move-result-wide v7

    .line 96
    :cond_5
    cmp-long v0, v7, v1

    .line 97
    .line 98
    if-nez v0, :cond_6

    .line 99
    .line 100
    iget-wide v7, p0, Lz4/y;->O:J

    .line 101
    .line 102
    :cond_6
    return-wide v7

    .line 103
    :cond_7
    :goto_2
    return-wide v1
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
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
.end method

.method public final h(J)V
    .locals 0

    return-void
.end method

.method public final i([Lr5/h;[Z[Lz4/c0;[ZJ)J
    .locals 8

    .line 1
    invoke-virtual {p0}, Lz4/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lz4/y;->F:Lz4/y$e;

    .line 5
    .line 6
    iget-object v1, v0, Lz4/y$e;->a:Lz4/j0;

    .line 7
    .line 8
    iget-object v0, v0, Lz4/y$e;->c:[Z

    .line 9
    .line 10
    iget v2, p0, Lz4/y;->M:I

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    move v4, v3

    .line 14
    :goto_0
    array-length v5, p1

    .line 15
    const/4 v6, 0x1

    .line 16
    if-ge v4, v5, :cond_2

    .line 17
    .line 18
    aget-object v5, p3, v4

    .line 19
    .line 20
    if-eqz v5, :cond_1

    .line 21
    .line 22
    aget-object v7, p1, v4

    .line 23
    .line 24
    if-eqz v7, :cond_0

    .line 25
    .line 26
    aget-boolean v7, p2, v4

    .line 27
    .line 28
    if-nez v7, :cond_1

    .line 29
    .line 30
    :cond_0
    check-cast v5, Lz4/y$c;

    .line 31
    .line 32
    iget v5, v5, Lz4/y$c;->a:I

    .line 33
    .line 34
    aget-boolean v7, v0, v5

    .line 35
    .line 36
    invoke-static {v7}, Lx6/b;->H(Z)V

    .line 37
    .line 38
    .line 39
    iget v7, p0, Lz4/y;->M:I

    .line 40
    .line 41
    sub-int/2addr v7, v6

    .line 42
    iput v7, p0, Lz4/y;->M:I

    .line 43
    .line 44
    aput-boolean v3, v0, v5

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    aput-object v5, p3, v4

    .line 48
    .line 49
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    iget-boolean p2, p0, Lz4/y;->K:Z

    .line 53
    .line 54
    if-eqz p2, :cond_3

    .line 55
    .line 56
    if-nez v2, :cond_4

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    const-wide/16 v4, 0x0

    .line 60
    .line 61
    cmp-long p2, p5, v4

    .line 62
    .line 63
    if-eqz p2, :cond_4

    .line 64
    .line 65
    :goto_1
    move p2, v6

    .line 66
    goto :goto_2

    .line 67
    :cond_4
    move p2, v3

    .line 68
    :goto_2
    move v2, v3

    .line 69
    :goto_3
    array-length v4, p1

    .line 70
    if-ge v2, v4, :cond_9

    .line 71
    .line 72
    aget-object v4, p3, v2

    .line 73
    .line 74
    if-nez v4, :cond_8

    .line 75
    .line 76
    aget-object v4, p1, v2

    .line 77
    .line 78
    if-eqz v4, :cond_8

    .line 79
    .line 80
    invoke-interface {v4}, Lr5/k;->length()I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-ne v5, v6, :cond_5

    .line 85
    .line 86
    move v5, v6

    .line 87
    goto :goto_4

    .line 88
    :cond_5
    move v5, v3

    .line 89
    :goto_4
    invoke-static {v5}, Lx6/b;->H(Z)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v4, v3}, Lr5/k;->c(I)I

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    if-nez v5, :cond_6

    .line 97
    .line 98
    move v5, v6

    .line 99
    goto :goto_5

    .line 100
    :cond_6
    move v5, v3

    .line 101
    :goto_5
    invoke-static {v5}, Lx6/b;->H(Z)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v4}, Lr5/k;->a()Lz4/i0;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-virtual {v1, v4}, Lz4/j0;->b(Lz4/i0;)I

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    aget-boolean v5, v0, v4

    .line 113
    .line 114
    xor-int/2addr v5, v6

    .line 115
    invoke-static {v5}, Lx6/b;->H(Z)V

    .line 116
    .line 117
    .line 118
    iget v5, p0, Lz4/y;->M:I

    .line 119
    .line 120
    add-int/2addr v5, v6

    .line 121
    iput v5, p0, Lz4/y;->M:I

    .line 122
    .line 123
    aput-boolean v6, v0, v4

    .line 124
    .line 125
    new-instance v5, Lz4/y$c;

    .line 126
    .line 127
    invoke-direct {v5, p0, v4}, Lz4/y$c;-><init>(Lz4/y;I)V

    .line 128
    .line 129
    .line 130
    aput-object v5, p3, v2

    .line 131
    .line 132
    aput-boolean v6, p4, v2

    .line 133
    .line 134
    if-nez p2, :cond_8

    .line 135
    .line 136
    iget-object p2, p0, Lz4/y;->A:[Lz4/b0;

    .line 137
    .line 138
    aget-object p2, p2, v4

    .line 139
    .line 140
    invoke-virtual {p2, p5, p6, v6}, Lz4/b0;->x(JZ)Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-nez v4, :cond_7

    .line 145
    .line 146
    iget v4, p2, Lz4/b0;->q:I

    .line 147
    .line 148
    iget p2, p2, Lz4/b0;->s:I

    .line 149
    .line 150
    add-int/2addr v4, p2

    .line 151
    if-eqz v4, :cond_7

    .line 152
    .line 153
    move p2, v6

    .line 154
    goto :goto_6

    .line 155
    :cond_7
    move p2, v3

    .line 156
    :cond_8
    :goto_6
    add-int/lit8 v2, v2, 0x1

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_9
    iget p1, p0, Lz4/y;->M:I

    .line 160
    .line 161
    if-nez p1, :cond_c

    .line 162
    .line 163
    iput-boolean v3, p0, Lz4/y;->Q:Z

    .line 164
    .line 165
    iput-boolean v3, p0, Lz4/y;->L:Z

    .line 166
    .line 167
    iget-object p1, p0, Lz4/y;->s:Lt5/d0;

    .line 168
    .line 169
    invoke-virtual {p1}, Lt5/d0;->d()Z

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-eqz p1, :cond_b

    .line 174
    .line 175
    iget-object p1, p0, Lz4/y;->A:[Lz4/b0;

    .line 176
    .line 177
    array-length p2, p1

    .line 178
    :goto_7
    if-ge v3, p2, :cond_a

    .line 179
    .line 180
    aget-object p3, p1, v3

    .line 181
    .line 182
    invoke-virtual {p3}, Lz4/b0;->h()V

    .line 183
    .line 184
    .line 185
    add-int/lit8 v3, v3, 0x1

    .line 186
    .line 187
    goto :goto_7

    .line 188
    :cond_a
    iget-object p1, p0, Lz4/y;->s:Lt5/d0;

    .line 189
    .line 190
    invoke-virtual {p1}, Lt5/d0;->b()V

    .line 191
    .line 192
    .line 193
    goto :goto_a

    .line 194
    :cond_b
    iget-object p1, p0, Lz4/y;->A:[Lz4/b0;

    .line 195
    .line 196
    array-length p2, p1

    .line 197
    move p3, v3

    .line 198
    :goto_8
    if-ge p3, p2, :cond_e

    .line 199
    .line 200
    aget-object p4, p1, p3

    .line 201
    .line 202
    invoke-virtual {p4, v3}, Lz4/b0;->v(Z)V

    .line 203
    .line 204
    .line 205
    add-int/lit8 p3, p3, 0x1

    .line 206
    .line 207
    goto :goto_8

    .line 208
    :cond_c
    if-eqz p2, :cond_e

    .line 209
    .line 210
    invoke-virtual {p0, p5, p6}, Lz4/y;->l(J)J

    .line 211
    .line 212
    .line 213
    move-result-wide p5

    .line 214
    :goto_9
    array-length p1, p3

    .line 215
    if-ge v3, p1, :cond_e

    .line 216
    .line 217
    aget-object p1, p3, v3

    .line 218
    .line 219
    if-eqz p1, :cond_d

    .line 220
    .line 221
    aput-boolean v6, p4, v3

    .line 222
    .line 223
    :cond_d
    add-int/lit8 v3, v3, 0x1

    .line 224
    .line 225
    goto :goto_9

    .line 226
    :cond_e
    :goto_a
    iput-boolean v6, p0, Lz4/y;->K:Z

    .line 227
    .line 228
    return-wide p5
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
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
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
    .locals 2

    .line 1
    iget-object v0, p0, Lz4/y;->s:Lt5/d0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt5/d0;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lz4/y;->u:Lb5/g;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    iget-boolean v1, v0, Lb5/g;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    monitor-exit v0

    .line 21
    throw v1

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    return v0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final j()V
    .locals 3

    .line 1
    iget-object v0, p0, Lz4/y;->s:Lt5/d0;

    .line 2
    .line 3
    iget-object v1, p0, Lz4/y;->d:Lt5/c0;

    .line 4
    .line 5
    iget v2, p0, Lz4/y;->J:I

    .line 6
    .line 7
    check-cast v1, Lt5/u;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Lt5/u;->b(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, v0, Lt5/d0;->c:Ljava/io/IOException;

    .line 14
    .line 15
    if-nez v2, :cond_5

    .line 16
    .line 17
    iget-object v0, v0, Lt5/d0;->b:Lt5/d0$c;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    const/high16 v2, -0x80000000

    .line 22
    .line 23
    if-ne v1, v2, :cond_0

    .line 24
    .line 25
    iget v1, v0, Lt5/d0$c;->a:I

    .line 26
    .line 27
    :cond_0
    iget-object v2, v0, Lt5/d0$c;->e:Ljava/io/IOException;

    .line 28
    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    iget v0, v0, Lt5/d0$c;->f:I

    .line 32
    .line 33
    if-gt v0, v1, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    throw v2

    .line 37
    :cond_2
    :goto_0
    iget-boolean v0, p0, Lz4/y;->S:Z

    .line 38
    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    iget-boolean v0, p0, Lz4/y;->D:Z

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    const/4 v0, 0x0

    .line 47
    const-string v1, "Loading finished before preparation is complete."

    .line 48
    .line 49
    invoke-static {v1, v0}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    throw v0

    .line 54
    :cond_4
    :goto_1
    return-void

    .line 55
    :cond_5
    throw v2
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final k(Lt5/d0$d;JJZ)V
    .locals 14

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p1

    .line 3
    check-cast v1, Lz4/y$a;

    .line 4
    .line 5
    iget-object v2, v1, Lz4/y$a;->c:Lt5/j0;

    .line 6
    .line 7
    new-instance v4, Lz4/n;

    .line 8
    .line 9
    iget-object v3, v2, Lt5/j0;->c:Landroid/net/Uri;

    .line 10
    .line 11
    iget-object v2, v2, Lt5/j0;->d:Ljava/util/Map;

    .line 12
    .line 13
    invoke-direct {v4, v2}, Lz4/n;-><init>(Ljava/util/Map;)V

    .line 14
    .line 15
    .line 16
    iget-object v2, v0, Lz4/y;->d:Lt5/c0;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v3, v0, Lz4/y;->e:Lz4/w$a;

    .line 22
    .line 23
    iget-wide v10, v1, Lz4/y$a;->j:J

    .line 24
    .line 25
    iget-wide v12, v0, Lz4/y;->H:J

    .line 26
    .line 27
    const/4 v5, 0x1

    .line 28
    const/4 v6, -0x1

    .line 29
    const/4 v7, 0x0

    .line 30
    const/4 v8, 0x0

    .line 31
    const/4 v9, 0x0

    .line 32
    invoke-virtual/range {v3 .. v13}, Lz4/w$a;->e(Lz4/n;IILv3/i0;ILjava/lang/Object;JJ)V

    .line 33
    .line 34
    .line 35
    if-nez p6, :cond_1

    .line 36
    .line 37
    iget-object v1, v0, Lz4/y;->A:[Lz4/b0;

    .line 38
    .line 39
    array-length v2, v1

    .line 40
    const/4 v3, 0x0

    .line 41
    move v4, v3

    .line 42
    :goto_0
    if-ge v4, v2, :cond_0

    .line 43
    .line 44
    aget-object v5, v1, v4

    .line 45
    .line 46
    invoke-virtual {v5, v3}, Lz4/b0;->v(Z)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v4, v4, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget v1, v0, Lz4/y;->M:I

    .line 53
    .line 54
    if-lez v1, :cond_1

    .line 55
    .line 56
    iget-object v1, v0, Lz4/y;->y:Lz4/r$a;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-interface {v1, p0}, Lz4/d0$a;->a(Lz4/d0;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    return-void
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
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
.end method

.method public final l(J)J
    .locals 5

    .line 1
    invoke-virtual {p0}, Lz4/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lz4/y;->F:Lz4/y$e;

    .line 5
    .line 6
    iget-object v0, v0, Lz4/y$e;->b:[Z

    .line 7
    .line 8
    iget-object v1, p0, Lz4/y;->G:Lc4/t;

    .line 9
    .line 10
    invoke-interface {v1}, Lc4/t;->e()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-wide/16 p1, 0x0

    .line 18
    .line 19
    :goto_0
    const/4 v1, 0x0

    .line 20
    iput-boolean v1, p0, Lz4/y;->L:Z

    .line 21
    .line 22
    iput-wide p1, p0, Lz4/y;->O:J

    .line 23
    .line 24
    invoke-virtual {p0}, Lz4/y;->x()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    iput-wide p1, p0, Lz4/y;->P:J

    .line 31
    .line 32
    return-wide p1

    .line 33
    :cond_1
    iget v2, p0, Lz4/y;->J:I

    .line 34
    .line 35
    const/4 v3, 0x7

    .line 36
    if-eq v2, v3, :cond_5

    .line 37
    .line 38
    iget-object v2, p0, Lz4/y;->A:[Lz4/b0;

    .line 39
    .line 40
    array-length v2, v2

    .line 41
    move v3, v1

    .line 42
    :goto_1
    if-ge v3, v2, :cond_4

    .line 43
    .line 44
    iget-object v4, p0, Lz4/y;->A:[Lz4/b0;

    .line 45
    .line 46
    aget-object v4, v4, v3

    .line 47
    .line 48
    invoke-virtual {v4, p1, p2, v1}, Lz4/b0;->x(JZ)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-nez v4, :cond_3

    .line 53
    .line 54
    aget-boolean v4, v0, v3

    .line 55
    .line 56
    if-nez v4, :cond_2

    .line 57
    .line 58
    iget-boolean v4, p0, Lz4/y;->E:Z

    .line 59
    .line 60
    if-nez v4, :cond_3

    .line 61
    .line 62
    :cond_2
    move v0, v1

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_4
    const/4 v0, 0x1

    .line 68
    :goto_2
    if-eqz v0, :cond_5

    .line 69
    .line 70
    return-wide p1

    .line 71
    :cond_5
    iput-boolean v1, p0, Lz4/y;->Q:Z

    .line 72
    .line 73
    iput-wide p1, p0, Lz4/y;->P:J

    .line 74
    .line 75
    iput-boolean v1, p0, Lz4/y;->S:Z

    .line 76
    .line 77
    iget-object v0, p0, Lz4/y;->s:Lt5/d0;

    .line 78
    .line 79
    invoke-virtual {v0}, Lt5/d0;->d()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_7

    .line 84
    .line 85
    iget-object v0, p0, Lz4/y;->A:[Lz4/b0;

    .line 86
    .line 87
    array-length v2, v0

    .line 88
    :goto_3
    if-ge v1, v2, :cond_6

    .line 89
    .line 90
    aget-object v3, v0, v1

    .line 91
    .line 92
    invoke-virtual {v3}, Lz4/b0;->h()V

    .line 93
    .line 94
    .line 95
    add-int/lit8 v1, v1, 0x1

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_6
    iget-object v0, p0, Lz4/y;->s:Lt5/d0;

    .line 99
    .line 100
    invoke-virtual {v0}, Lt5/d0;->b()V

    .line 101
    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_7
    iget-object v0, p0, Lz4/y;->s:Lt5/d0;

    .line 105
    .line 106
    const/4 v2, 0x0

    .line 107
    iput-object v2, v0, Lt5/d0;->c:Ljava/io/IOException;

    .line 108
    .line 109
    iget-object v0, p0, Lz4/y;->A:[Lz4/b0;

    .line 110
    .line 111
    array-length v2, v0

    .line 112
    move v3, v1

    .line 113
    :goto_4
    if-ge v3, v2, :cond_8

    .line 114
    .line 115
    aget-object v4, v0, v3

    .line 116
    .line 117
    invoke-virtual {v4, v1}, Lz4/b0;->v(Z)V

    .line 118
    .line 119
    .line 120
    add-int/lit8 v3, v3, 0x1

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_8
    :goto_5
    return-wide p1
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
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
.end method

.method public final m()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz4/y;->C:Z

    iget-object v0, p0, Lz4/y;->x:Landroid/os/Handler;

    iget-object v1, p0, Lz4/y;->v:Lu/a;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final n(Lz4/r$a;J)V
    .locals 0

    iput-object p1, p0, Lz4/y;->y:Lz4/r$a;

    iget-object p1, p0, Lz4/y;->u:Lb5/g;

    invoke-virtual {p1}, Lb5/g;->a()Z

    invoke-virtual {p0}, Lz4/y;->C()V

    return-void
.end method

.method public final o()J
    .locals 2

    iget-boolean v0, p0, Lz4/y;->L:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lz4/y;->S:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lz4/y;->v()I

    move-result v0

    iget v1, p0, Lz4/y;->R:I

    if-le v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lz4/y;->L:Z

    iget-wide v0, p0, Lz4/y;->O:J

    return-wide v0

    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public final p(Lt5/d0$d;JJ)V
    .locals 15

    .line 1
    move-object v0, p0

    .line 2
    move-object/from16 v1, p1

    .line 3
    .line 4
    check-cast v1, Lz4/y$a;

    .line 5
    .line 6
    iget-wide v2, v0, Lz4/y;->H:J

    .line 7
    .line 8
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    cmp-long v2, v2, v4

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    iget-object v2, v0, Lz4/y;->G:Lc4/t;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v2}, Lc4/t;->e()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {p0, v3}, Lz4/y;->w(Z)J

    .line 27
    .line 28
    .line 29
    move-result-wide v4

    .line 30
    const-wide/high16 v6, -0x8000000000000000L

    .line 31
    .line 32
    cmp-long v6, v4, v6

    .line 33
    .line 34
    if-nez v6, :cond_0

    .line 35
    .line 36
    const-wide/16 v4, 0x0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const-wide/16 v6, 0x2710

    .line 40
    .line 41
    add-long/2addr v4, v6

    .line 42
    :goto_0
    iput-wide v4, v0, Lz4/y;->H:J

    .line 43
    .line 44
    iget-object v6, v0, Lz4/y;->o:Lz4/y$b;

    .line 45
    .line 46
    iget-boolean v7, v0, Lz4/y;->I:Z

    .line 47
    .line 48
    check-cast v6, Lz4/z;

    .line 49
    .line 50
    invoke-virtual {v6, v4, v5, v2, v7}, Lz4/z;->y(JZZ)V

    .line 51
    .line 52
    .line 53
    :cond_1
    iget-object v2, v1, Lz4/y$a;->c:Lt5/j0;

    .line 54
    .line 55
    new-instance v5, Lz4/n;

    .line 56
    .line 57
    iget-object v4, v2, Lt5/j0;->c:Landroid/net/Uri;

    .line 58
    .line 59
    iget-object v2, v2, Lt5/j0;->d:Ljava/util/Map;

    .line 60
    .line 61
    invoke-direct {v5, v2}, Lz4/n;-><init>(Ljava/util/Map;)V

    .line 62
    .line 63
    .line 64
    iget-object v2, v0, Lz4/y;->d:Lt5/c0;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v4, v0, Lz4/y;->e:Lz4/w$a;

    .line 70
    .line 71
    const/4 v6, 0x1

    .line 72
    const/4 v7, -0x1

    .line 73
    const/4 v8, 0x0

    .line 74
    const/4 v9, 0x0

    .line 75
    const/4 v10, 0x0

    .line 76
    iget-wide v11, v1, Lz4/y$a;->j:J

    .line 77
    .line 78
    iget-wide v13, v0, Lz4/y;->H:J

    .line 79
    .line 80
    invoke-virtual/range {v4 .. v14}, Lz4/w$a;->h(Lz4/n;IILv3/i0;ILjava/lang/Object;JJ)V

    .line 81
    .line 82
    .line 83
    iput-boolean v3, v0, Lz4/y;->S:Z

    .line 84
    .line 85
    iget-object v1, v0, Lz4/y;->y:Lz4/r$a;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-interface {v1, p0}, Lz4/d0$a;->a(Lz4/d0;)V

    .line 91
    .line 92
    .line 93
    return-void
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
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
.end method

.method public final q()Lz4/j0;
    .locals 1

    invoke-virtual {p0}, Lz4/y;->b()V

    iget-object v0, p0, Lz4/y;->F:Lz4/y$e;

    iget-object v0, v0, Lz4/y$e;->a:Lz4/j0;

    return-object v0
.end method

.method public final r(II)Lc4/v;
    .locals 1

    new-instance p2, Lz4/y$d;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lz4/y$d;-><init>(IZ)V

    invoke-virtual {p0, p2}, Lz4/y;->B(Lz4/y$d;)Lz4/b0;

    move-result-object p1

    return-object p1
.end method

.method public final s(JZ)V
    .locals 5

    invoke-virtual {p0}, Lz4/y;->b()V

    invoke-virtual {p0}, Lz4/y;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lz4/y;->F:Lz4/y$e;

    iget-object v0, v0, Lz4/y$e;->c:[Z

    iget-object v1, p0, Lz4/y;->A:[Lz4/b0;

    array-length v1, v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    iget-object v3, p0, Lz4/y;->A:[Lz4/b0;

    aget-object v3, v3, v2

    aget-boolean v4, v0, v2

    invoke-virtual {v3, p1, p2, p3, v4}, Lz4/b0;->g(JZZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final t(Lc4/t;)V
    .locals 3

    iget-object v0, p0, Lz4/y;->x:Landroid/os/Handler;

    new-instance v1, Lw/g;

    const/16 v2, 0xb

    invoke-direct {v1, v2, p0, p1}, Lw/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final u(Lt5/d0$d;JJLjava/io/IOException;I)Lt5/d0$b;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v12, p6

    .line 4
    .line 5
    move-object/from16 v1, p1

    .line 6
    .line 7
    check-cast v1, Lz4/y$a;

    .line 8
    .line 9
    iget-object v2, v1, Lz4/y$a;->c:Lt5/j0;

    .line 10
    .line 11
    new-instance v3, Lz4/n;

    .line 12
    .line 13
    iget-object v4, v2, Lt5/j0;->c:Landroid/net/Uri;

    .line 14
    .line 15
    iget-object v2, v2, Lt5/j0;->d:Ljava/util/Map;

    .line 16
    .line 17
    invoke-direct {v3, v2}, Lz4/n;-><init>(Ljava/util/Map;)V

    .line 18
    .line 19
    .line 20
    iget-wide v4, v1, Lz4/y$a;->j:J

    .line 21
    .line 22
    invoke-static {v4, v5}, Lv5/e0;->R(J)J

    .line 23
    .line 24
    .line 25
    iget-wide v4, v0, Lz4/y;->H:J

    .line 26
    .line 27
    invoke-static {v4, v5}, Lv5/e0;->R(J)J

    .line 28
    .line 29
    .line 30
    iget-object v2, v0, Lz4/y;->d:Lt5/c0;

    .line 31
    .line 32
    check-cast v2, Lt5/u;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    instance-of v2, v12, Lv3/a1;

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x1

    .line 41
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    if-nez v2, :cond_3

    .line 47
    .line 48
    instance-of v2, v12, Ljava/io/FileNotFoundException;

    .line 49
    .line 50
    if-nez v2, :cond_3

    .line 51
    .line 52
    instance-of v2, v12, Lt5/w;

    .line 53
    .line 54
    if-nez v2, :cond_3

    .line 55
    .line 56
    instance-of v2, v12, Lt5/d0$g;

    .line 57
    .line 58
    if-nez v2, :cond_3

    .line 59
    .line 60
    sget v2, Lt5/l;->b:I

    .line 61
    .line 62
    move-object v2, v12

    .line 63
    :goto_0
    if-eqz v2, :cond_1

    .line 64
    .line 65
    instance-of v8, v2, Lt5/l;

    .line 66
    .line 67
    if-eqz v8, :cond_0

    .line 68
    .line 69
    move-object v8, v2

    .line 70
    check-cast v8, Lt5/l;

    .line 71
    .line 72
    iget v8, v8, Lt5/l;->a:I

    .line 73
    .line 74
    const/16 v9, 0x7d8

    .line 75
    .line 76
    if-ne v8, v9, :cond_0

    .line 77
    .line 78
    move v2, v5

    .line 79
    goto :goto_1

    .line 80
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    goto :goto_0

    .line 85
    :cond_1
    move v2, v4

    .line 86
    :goto_1
    if-eqz v2, :cond_2

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_2
    add-int/lit8 v2, p7, -0x1

    .line 90
    .line 91
    mul-int/lit16 v2, v2, 0x3e8

    .line 92
    .line 93
    const/16 v8, 0x1388

    .line 94
    .line 95
    invoke-static {v2, v8}, Ljava/lang/Math;->min(II)I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    int-to-long v8, v2

    .line 100
    goto :goto_3

    .line 101
    :cond_3
    :goto_2
    move-wide v8, v6

    .line 102
    :goto_3
    cmp-long v2, v8, v6

    .line 103
    .line 104
    if-nez v2, :cond_4

    .line 105
    .line 106
    sget-object v2, Lt5/d0;->f:Lt5/d0$b;

    .line 107
    .line 108
    :goto_4
    move-object v14, v2

    .line 109
    goto :goto_a

    .line 110
    :cond_4
    invoke-virtual/range {p0 .. p0}, Lz4/y;->v()I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    iget v10, v0, Lz4/y;->R:I

    .line 115
    .line 116
    if-le v2, v10, :cond_5

    .line 117
    .line 118
    move v10, v5

    .line 119
    goto :goto_5

    .line 120
    :cond_5
    move v10, v4

    .line 121
    :goto_5
    iget-boolean v11, v0, Lz4/y;->N:Z

    .line 122
    .line 123
    if-nez v11, :cond_9

    .line 124
    .line 125
    iget-object v11, v0, Lz4/y;->G:Lc4/t;

    .line 126
    .line 127
    if-eqz v11, :cond_6

    .line 128
    .line 129
    invoke-interface {v11}, Lc4/t;->h()J

    .line 130
    .line 131
    .line 132
    move-result-wide v13

    .line 133
    cmp-long v6, v13, v6

    .line 134
    .line 135
    if-eqz v6, :cond_6

    .line 136
    .line 137
    goto :goto_7

    .line 138
    :cond_6
    iget-boolean v2, v0, Lz4/y;->D:Z

    .line 139
    .line 140
    if-eqz v2, :cond_7

    .line 141
    .line 142
    invoke-virtual/range {p0 .. p0}, Lz4/y;->D()Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-nez v2, :cond_7

    .line 147
    .line 148
    iput-boolean v5, v0, Lz4/y;->Q:Z

    .line 149
    .line 150
    goto :goto_9

    .line 151
    :cond_7
    iget-boolean v2, v0, Lz4/y;->D:Z

    .line 152
    .line 153
    iput-boolean v2, v0, Lz4/y;->L:Z

    .line 154
    .line 155
    const-wide/16 v6, 0x0

    .line 156
    .line 157
    iput-wide v6, v0, Lz4/y;->O:J

    .line 158
    .line 159
    iput v4, v0, Lz4/y;->R:I

    .line 160
    .line 161
    iget-object v2, v0, Lz4/y;->A:[Lz4/b0;

    .line 162
    .line 163
    array-length v11, v2

    .line 164
    move v13, v4

    .line 165
    :goto_6
    if-ge v13, v11, :cond_8

    .line 166
    .line 167
    aget-object v14, v2, v13

    .line 168
    .line 169
    invoke-virtual {v14, v4}, Lz4/b0;->v(Z)V

    .line 170
    .line 171
    .line 172
    add-int/lit8 v13, v13, 0x1

    .line 173
    .line 174
    goto :goto_6

    .line 175
    :cond_8
    iget-object v2, v1, Lz4/y$a;->g:Lc4/s;

    .line 176
    .line 177
    iput-wide v6, v2, Lc4/s;->a:J

    .line 178
    .line 179
    iput-wide v6, v1, Lz4/y$a;->j:J

    .line 180
    .line 181
    iput-boolean v5, v1, Lz4/y$a;->i:Z

    .line 182
    .line 183
    iput-boolean v4, v1, Lz4/y$a;->m:Z

    .line 184
    .line 185
    goto :goto_8

    .line 186
    :cond_9
    :goto_7
    iput v2, v0, Lz4/y;->R:I

    .line 187
    .line 188
    :goto_8
    move v4, v5

    .line 189
    :goto_9
    if-eqz v4, :cond_a

    .line 190
    .line 191
    new-instance v2, Lt5/d0$b;

    .line 192
    .line 193
    invoke-direct {v2, v10, v8, v9}, Lt5/d0$b;-><init>(IJ)V

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_a
    sget-object v2, Lt5/d0;->e:Lt5/d0$b;

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :goto_a
    invoke-virtual {v14}, Lt5/d0$b;->a()Z

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    xor-int/lit8 v15, v2, 0x1

    .line 205
    .line 206
    iget-object v2, v0, Lz4/y;->e:Lz4/w$a;

    .line 207
    .line 208
    const/4 v4, 0x1

    .line 209
    const/4 v5, -0x1

    .line 210
    const/4 v6, 0x0

    .line 211
    const/4 v7, 0x0

    .line 212
    iget-wide v8, v1, Lz4/y$a;->j:J

    .line 213
    .line 214
    iget-wide v10, v0, Lz4/y;->H:J

    .line 215
    .line 216
    const/4 v13, 0x0

    .line 217
    move-object v1, v2

    .line 218
    move-object v2, v3

    .line 219
    move v3, v4

    .line 220
    move v4, v5

    .line 221
    move-object v5, v6

    .line 222
    move v6, v7

    .line 223
    move-object v7, v13

    .line 224
    move-object/from16 v12, p6

    .line 225
    .line 226
    move v13, v15

    .line 227
    invoke-virtual/range {v1 .. v13}, Lz4/w$a;->j(Lz4/n;IILv3/i0;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 228
    .line 229
    .line 230
    if-eqz v15, :cond_b

    .line 231
    .line 232
    iget-object v1, v0, Lz4/y;->d:Lt5/c0;

    .line 233
    .line 234
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    :cond_b
    return-object v14
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
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
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

.method public final v()I
    .locals 6

    .line 1
    iget-object v0, p0, Lz4/y;->A:[Lz4/b0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v2, v1, :cond_0

    .line 7
    .line 8
    aget-object v4, v0, v2

    .line 9
    .line 10
    iget v5, v4, Lz4/b0;->q:I

    .line 11
    .line 12
    iget v4, v4, Lz4/b0;->p:I

    .line 13
    .line 14
    add-int/2addr v5, v4

    .line 15
    add-int/2addr v3, v5

    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return v3
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final w(Z)J
    .locals 6

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    iget-object v3, p0, Lz4/y;->A:[Lz4/b0;

    .line 5
    .line 6
    array-length v3, v3

    .line 7
    if-ge v2, v3, :cond_2

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iget-object v3, p0, Lz4/y;->F:Lz4/y$e;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v3, v3, Lz4/y$e;->c:[Z

    .line 17
    .line 18
    aget-boolean v3, v3, v2

    .line 19
    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    :cond_0
    iget-object v3, p0, Lz4/y;->A:[Lz4/b0;

    .line 23
    .line 24
    aget-object v3, v3, v2

    .line 25
    .line 26
    monitor-enter v3

    .line 27
    :try_start_0
    iget-wide v4, v3, Lz4/b0;->v:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    monitor-exit v3

    .line 30
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    monitor-exit v3

    .line 39
    throw p1

    .line 40
    :cond_2
    return-wide v0
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final x()Z
    .locals 4

    iget-wide v0, p0, Lz4/y;->P:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final y()V
    .locals 15

    .line 1
    iget-boolean v0, p0, Lz4/y;->T:Z

    .line 2
    .line 3
    if-nez v0, :cond_a

    .line 4
    .line 5
    iget-boolean v0, p0, Lz4/y;->D:Z

    .line 6
    .line 7
    if-nez v0, :cond_a

    .line 8
    .line 9
    iget-boolean v0, p0, Lz4/y;->C:Z

    .line 10
    .line 11
    if-eqz v0, :cond_a

    .line 12
    .line 13
    iget-object v0, p0, Lz4/y;->G:Lc4/t;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_5

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lz4/y;->A:[Lz4/b0;

    .line 20
    .line 21
    array-length v1, v0

    .line 22
    const/4 v2, 0x0

    .line 23
    move v3, v2

    .line 24
    :goto_0
    if-ge v3, v1, :cond_2

    .line 25
    .line 26
    aget-object v4, v0, v3

    .line 27
    .line 28
    invoke-virtual {v4}, Lz4/b0;->p()Lv3/i0;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    if-nez v4, :cond_1

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    iget-object v0, p0, Lz4/y;->u:Lb5/g;

    .line 39
    .line 40
    monitor-enter v0

    .line 41
    :try_start_0
    iput-boolean v2, v0, Lb5/g;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    monitor-exit v0

    .line 44
    iget-object v0, p0, Lz4/y;->A:[Lz4/b0;

    .line 45
    .line 46
    array-length v0, v0

    .line 47
    new-array v1, v0, [Lz4/i0;

    .line 48
    .line 49
    new-array v3, v0, [Z

    .line 50
    .line 51
    move v4, v2

    .line 52
    :goto_1
    const/4 v5, 0x1

    .line 53
    if-ge v4, v0, :cond_9

    .line 54
    .line 55
    iget-object v6, p0, Lz4/y;->A:[Lz4/b0;

    .line 56
    .line 57
    aget-object v6, v6, v4

    .line 58
    .line 59
    invoke-virtual {v6}, Lz4/b0;->p()Lv3/i0;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget-object v7, v6, Lv3/i0;->t:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v7}, Lv5/p;->k(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    if-nez v8, :cond_4

    .line 73
    .line 74
    invoke-static {v7}, Lv5/p;->m(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-eqz v7, :cond_3

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    move v7, v2

    .line 82
    goto :goto_3

    .line 83
    :cond_4
    :goto_2
    move v7, v5

    .line 84
    :goto_3
    aput-boolean v7, v3, v4

    .line 85
    .line 86
    iget-boolean v9, p0, Lz4/y;->E:Z

    .line 87
    .line 88
    or-int/2addr v7, v9

    .line 89
    iput-boolean v7, p0, Lz4/y;->E:Z

    .line 90
    .line 91
    iget-object v7, p0, Lz4/y;->z:Lt4/b;

    .line 92
    .line 93
    if-eqz v7, :cond_8

    .line 94
    .line 95
    if-nez v8, :cond_5

    .line 96
    .line 97
    iget-object v9, p0, Lz4/y;->B:[Lz4/y$d;

    .line 98
    .line 99
    aget-object v9, v9, v4

    .line 100
    .line 101
    iget-boolean v9, v9, Lz4/y$d;->b:Z

    .line 102
    .line 103
    if-eqz v9, :cond_7

    .line 104
    .line 105
    :cond_5
    iget-object v9, v6, Lv3/i0;->r:Lp4/a;

    .line 106
    .line 107
    if-nez v9, :cond_6

    .line 108
    .line 109
    new-instance v9, Lp4/a;

    .line 110
    .line 111
    new-array v10, v5, [Lp4/a$b;

    .line 112
    .line 113
    aput-object v7, v10, v2

    .line 114
    .line 115
    invoke-direct {v9, v10}, Lp4/a;-><init>([Lp4/a$b;)V

    .line 116
    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_6
    new-array v10, v5, [Lp4/a$b;

    .line 120
    .line 121
    aput-object v7, v10, v2

    .line 122
    .line 123
    new-instance v11, Lp4/a;

    .line 124
    .line 125
    iget-wide v12, v9, Lp4/a;->b:J

    .line 126
    .line 127
    iget-object v9, v9, Lp4/a;->a:[Lp4/a$b;

    .line 128
    .line 129
    sget v14, Lv5/e0;->a:I

    .line 130
    .line 131
    array-length v14, v9

    .line 132
    add-int/2addr v14, v5

    .line 133
    invoke-static {v9, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v14

    .line 137
    array-length v9, v9

    .line 138
    invoke-static {v10, v2, v14, v9, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 139
    .line 140
    .line 141
    check-cast v14, [Lp4/a$b;

    .line 142
    .line 143
    invoke-direct {v11, v12, v13, v14}, Lp4/a;-><init>(J[Lp4/a$b;)V

    .line 144
    .line 145
    .line 146
    move-object v9, v11

    .line 147
    :goto_4
    new-instance v10, Lv3/i0$a;

    .line 148
    .line 149
    invoke-direct {v10, v6}, Lv3/i0$a;-><init>(Lv3/i0;)V

    .line 150
    .line 151
    .line 152
    iput-object v9, v10, Lv3/i0$a;->i:Lp4/a;

    .line 153
    .line 154
    new-instance v6, Lv3/i0;

    .line 155
    .line 156
    invoke-direct {v6, v10}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 157
    .line 158
    .line 159
    :cond_7
    if-eqz v8, :cond_8

    .line 160
    .line 161
    iget v8, v6, Lv3/i0;->f:I

    .line 162
    .line 163
    const/4 v9, -0x1

    .line 164
    if-ne v8, v9, :cond_8

    .line 165
    .line 166
    iget v8, v6, Lv3/i0;->o:I

    .line 167
    .line 168
    if-ne v8, v9, :cond_8

    .line 169
    .line 170
    iget v8, v7, Lt4/b;->a:I

    .line 171
    .line 172
    if-eq v8, v9, :cond_8

    .line 173
    .line 174
    new-instance v8, Lv3/i0$a;

    .line 175
    .line 176
    invoke-direct {v8, v6}, Lv3/i0$a;-><init>(Lv3/i0;)V

    .line 177
    .line 178
    .line 179
    iget v6, v7, Lt4/b;->a:I

    .line 180
    .line 181
    iput v6, v8, Lv3/i0$a;->f:I

    .line 182
    .line 183
    new-instance v6, Lv3/i0;

    .line 184
    .line 185
    invoke-direct {v6, v8}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 186
    .line 187
    .line 188
    :cond_8
    iget-object v7, p0, Lz4/y;->c:La4/h;

    .line 189
    .line 190
    invoke-interface {v7, v6}, La4/h;->e(Lv3/i0;)I

    .line 191
    .line 192
    .line 193
    move-result v7

    .line 194
    invoke-virtual {v6, v7}, Lv3/i0;->b(I)Lv3/i0;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    new-instance v7, Lz4/i0;

    .line 199
    .line 200
    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v8

    .line 204
    new-array v5, v5, [Lv3/i0;

    .line 205
    .line 206
    aput-object v6, v5, v2

    .line 207
    .line 208
    invoke-direct {v7, v8, v5}, Lz4/i0;-><init>(Ljava/lang/String;[Lv3/i0;)V

    .line 209
    .line 210
    .line 211
    aput-object v7, v1, v4

    .line 212
    .line 213
    add-int/lit8 v4, v4, 0x1

    .line 214
    .line 215
    goto/16 :goto_1

    .line 216
    .line 217
    :cond_9
    new-instance v0, Lz4/y$e;

    .line 218
    .line 219
    new-instance v2, Lz4/j0;

    .line 220
    .line 221
    invoke-direct {v2, v1}, Lz4/j0;-><init>([Lz4/i0;)V

    .line 222
    .line 223
    .line 224
    invoke-direct {v0, v2, v3}, Lz4/y$e;-><init>(Lz4/j0;[Z)V

    .line 225
    .line 226
    .line 227
    iput-object v0, p0, Lz4/y;->F:Lz4/y$e;

    .line 228
    .line 229
    iput-boolean v5, p0, Lz4/y;->D:Z

    .line 230
    .line 231
    iget-object v0, p0, Lz4/y;->y:Lz4/r$a;

    .line 232
    .line 233
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-interface {v0, p0}, Lz4/r$a;->b(Lz4/r;)V

    .line 237
    .line 238
    .line 239
    goto :goto_5

    .line 240
    :catchall_0
    move-exception v1

    .line 241
    monitor-exit v0

    .line 242
    throw v1

    .line 243
    :cond_a
    :goto_5
    return-void
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
.end method

.method public final z(I)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lz4/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lz4/y;->F:Lz4/y$e;

    .line 5
    .line 6
    iget-object v1, v0, Lz4/y$e;->d:[Z

    .line 7
    .line 8
    aget-boolean v2, v1, p1

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, Lz4/y$e;->a:Lz4/j0;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lz4/j0;->a(I)Lz4/i0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v2, 0x0

    .line 19
    iget-object v0, v0, Lz4/i0;->d:[Lv3/i0;

    .line 20
    .line 21
    aget-object v5, v0, v2

    .line 22
    .line 23
    iget-object v3, p0, Lz4/y;->e:Lz4/w$a;

    .line 24
    .line 25
    iget-object v0, v5, Lv3/i0;->t:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0}, Lv5/p;->i(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x0

    .line 33
    iget-wide v8, p0, Lz4/y;->O:J

    .line 34
    .line 35
    invoke-virtual/range {v3 .. v9}, Lz4/w$a;->b(ILv3/i0;ILjava/lang/Object;J)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    aput-boolean v0, v1, p1

    .line 40
    .line 41
    :cond_0
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method
